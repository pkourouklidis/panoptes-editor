package org.lowcomote.panoptes.web;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.web.server.IServiceContext;
import org.eclipse.xtext.web.server.IServiceResult;
import org.eclipse.xtext.web.server.InvalidRequestException;
import org.eclipse.xtext.web.server.XtextServiceDispatcher;
import org.eclipse.xtext.web.server.model.XtextWebDocument;
import org.eclipse.xtext.web.server.persistence.IServerResourceHandler;
import org.eclipse.xtext.web.server.validation.ValidationResult;
import org.eclipse.xtext.xbase.lib.Functions.Function0;

import com.google.inject.Inject;
import com.google.inject.Singleton;

import panoptesDSL.PanoptesDSLPackage;
//import panoptesDSL.Platform;

@Singleton
public class PanoptesDispatcher extends XtextServiceDispatcher {
	@Inject
	private IServerResourceHandler resourceHandler;
	private java.net.URI orchestratorURI = java.net.URI.create("http://panoptes-orchestrator.panoptes.svc.cluster.local/api/v1/platform");

	@Override
	protected ServiceDescriptor createServiceDescriptor(String serviceType, IServiceContext context) {
		if (serviceType != null) {
			switch (serviceType) {
			case "load":
				return getLoadResourceService(false, context);
			case "revert":
				return getLoadResourceService(true, context);
			case "save":
				return getSaveResourceService(context);
			case "update":
				return getUpdateDocumentService(context);
			case "assist":
				return getContentAssistService(context);
			case "validate":
				return getValidationService(context);
			case "hover":
				return getHoverService(context);
			case "highlight":
				return getHighlightingService(context);
			case "occurrences":
				return getOccurrencesService(context);
			case "format":
				return getFormattingService(context);
			case "generate":
				return getGeneratorService(context);
			case "apply":
				return getApplyService(context);
			default:
				throw new InvalidRequestException.InvalidParametersException(
						"The service type '" + serviceType + "' is not supported.");
			}
		} else {
			throw new InvalidRequestException.InvalidParametersException(
					"The service type '" + serviceType + "' is not supported.");
		}
	}

	protected ServiceDescriptor getApplyService(IServiceContext context) throws InvalidRequestException {
		ServiceDescriptor serviceDescriptor = new ServiceDescriptor();
		Function0<IServiceResult> _function_ = () -> {
			try {
				String resourceId = getResourceID(context);
				XtextWebDocument document = resourceHandler.get(resourceId, context);
				XtextResource resource = document.getResource();
//				System.out.println(EcoreUtil.getURI(((Platform)resource.getContents().get(0)).getAlgorithmRuntimes().get(0)));

				ResourceSet rs = new ResourceSetImpl();
				rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
				rs.getPackageRegistry().put(PanoptesDSLPackage.eNS_URI, PanoptesDSLPackage.eINSTANCE);
				Resource xmiResource = rs.createResource(URI.createURI("temp.xmi"));
				xmiResource.getContents().add(EcoreUtil.copy(resource.getContents().get(0)));
				ByteArrayOutputStream bos = new ByteArrayOutputStream();
				xmiResource.save(bos, null);
//				System.out.println(bos.toString());

				try {
					HttpClient client = HttpClient.newHttpClient();
					HttpRequest request = HttpRequest.newBuilder()
							.uri(orchestratorURI)
							.POST(HttpRequest.BodyPublishers.ofString(bos.toString()))
							.header("Content-Type", "text/plain; charset=UTF-8").build();
					HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
					response.statusCode();
					System.out.println(response.statusCode());
				} catch (IOException | InterruptedException e) {
					e.printStackTrace();
				}

				ValidationResult result = new ValidationResult();
				return result;
			} catch (Throwable throwable) {
				return handleError(serviceDescriptor, throwable);
			}
		};
		serviceDescriptor.setService(_function_);
		return serviceDescriptor;
	}
}
