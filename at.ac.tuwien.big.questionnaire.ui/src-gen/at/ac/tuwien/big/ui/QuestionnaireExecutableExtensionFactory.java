/*
 * generated by Xtext
 */
package at.ac.tuwien.big.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import at.ac.tuwien.big.ui.internal.QuestionnaireActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class QuestionnaireExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return QuestionnaireActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return QuestionnaireActivator.getInstance().getInjector(QuestionnaireActivator.AT_AC_TUWIEN_BIG_QUESTIONNAIRE);
	}
	
}
