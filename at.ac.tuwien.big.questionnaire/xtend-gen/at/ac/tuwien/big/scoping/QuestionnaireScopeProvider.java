/**
 * generated by Xtext
 */
package at.ac.tuwien.big.scoping;

import at.ac.tuwien.big.questionnaire.Answer;
import at.ac.tuwien.big.questionnaire.ClosedQuestion;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.eclipse.xtext.xbase.lib.InputOutput;

/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation.html#scoping
 * on how and when to use it
 */
@SuppressWarnings("all")
public class QuestionnaireScopeProvider extends AbstractDeclarativeScopeProvider {
  public IScope getScope(final EObject context, final EReference reference) {
    InputOutput.<String>println("Test");
    if ((context instanceof ClosedQuestion)) {
      final ClosedQuestion closedQuestion = ((ClosedQuestion) context);
      InputOutput.<String>println("CLOSED QUESTION");
      EList<Answer> _answers = closedQuestion.getAnswers();
      return Scopes.scopeFor(_answers);
    }
    return super.getScope(context, reference);
  }
}
