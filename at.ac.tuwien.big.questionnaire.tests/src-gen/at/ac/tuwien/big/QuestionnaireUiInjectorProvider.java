/*
* generated by Xtext
*/
package at.ac.tuwien.big;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class QuestionnaireUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return at.ac.tuwien.big.ui.internal.QuestionnaireActivator.getInstance().getInjector("at.ac.tuwien.big.Questionnaire");
	}
	
}
