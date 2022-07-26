/*
 * generated by Xtext 2.25.0
 */
package org.lowcomote.panoptes.web;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.eclipse.xtext.web.server.persistence.IResourceBaseProvider;
import org.lowcomote.panoptes.PanoptesXRuntimeModule;
import org.lowcomote.panoptes.PanoptesXStandaloneSetup;
import org.lowcomote.panoptes.ide.PanoptesXIdeModule;

/**
 * Initialization support for running Xtext languages in web applications.
 */
public class PanoptesXWebSetup extends PanoptesXStandaloneSetup {
	private final IResourceBaseProvider resourceBaseProvider;

	public PanoptesXWebSetup(IResourceBaseProvider resourceBaseProvider) {
		this.resourceBaseProvider = resourceBaseProvider;
	}
	@Override
	public Injector createInjector() {
		PanoptesXWebModule webModule = new PanoptesXWebModule(this.resourceBaseProvider);
		return Guice.createInjector(Modules2.mixin(new PanoptesXRuntimeModule(), new PanoptesXIdeModule(), webModule));
	}
	
}
