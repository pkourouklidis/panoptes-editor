/*
 * generated by Xtext 2.25.0
 */
package org.lowcomote.panoptes.formatting2

import com.google.inject.Inject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.lowcomote.panoptes.services.PanoptesXGrammarAccess
import panoptesDSL.Action

class PanoptesXFormatter extends AbstractFormatter2 {
	
	@Inject extension PanoptesXGrammarAccess

	def dispatch void format(Action action, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (parameter : action.additionalParameters) {
			parameter.format
		}
	}
	
}
