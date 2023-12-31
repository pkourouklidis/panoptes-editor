/**
 * generated by Xtext 2.25.0
 */
package org.lowcomote.panoptes.formatting2;

import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;
import org.lowcomote.panoptes.services.PanoptesXGrammarAccess;
import panoptesDSL.Action;
import panoptesDSL.Parameter;

@SuppressWarnings("all")
public class PanoptesXFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private PanoptesXGrammarAccess _panoptesXGrammarAccess;
  
  protected void _format(final Action action, @Extension final IFormattableDocument document) {
    EList<Parameter> _additionalParameters = action.getAdditionalParameters();
    for (final Parameter parameter : _additionalParameters) {
      document.<Parameter>format(parameter);
    }
  }
  
  public void format(final Object action, final IFormattableDocument document) {
    if (action instanceof XtextResource) {
      _format((XtextResource)action, document);
      return;
    } else if (action instanceof Action) {
      _format((Action)action, document);
      return;
    } else if (action instanceof EObject) {
      _format((EObject)action, document);
      return;
    } else if (action == null) {
      _format((Void)null, document);
      return;
    } else if (action != null) {
      _format(action, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(action, document).toString());
    }
  }
}
