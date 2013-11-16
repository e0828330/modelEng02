/**
 */
package at.ac.tuwien.big.questionnaire;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Answer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.ac.tuwien.big.questionnaire.SimpleAnswer#getEnables <em>Enables</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.ac.tuwien.big.questionnaire.QuestionnairePackage#getSimpleAnswer()
 * @model
 * @generated
 */
public interface SimpleAnswer extends Answer
{
  /**
   * Returns the value of the '<em><b>Enables</b></em>' reference list.
   * The list contents are of type {@link at.ac.tuwien.big.questionnaire.Question}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Enables</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enables</em>' reference list.
   * @see at.ac.tuwien.big.questionnaire.QuestionnairePackage#getSimpleAnswer_Enables()
   * @model
   * @generated
   */
  EList<Question> getEnables();

} // SimpleAnswer
