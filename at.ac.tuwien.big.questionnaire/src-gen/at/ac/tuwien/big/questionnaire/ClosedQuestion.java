/**
 */
package at.ac.tuwien.big.questionnaire;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Closed Question</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.ac.tuwien.big.questionnaire.ClosedQuestion#getAnswers <em>Answers</em>}</li>
 *   <li>{@link at.ac.tuwien.big.questionnaire.ClosedQuestion#getDefault <em>Default</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.ac.tuwien.big.questionnaire.QuestionnairePackage#getClosedQuestion()
 * @model
 * @generated
 */
public interface ClosedQuestion extends Question
{
  /**
   * Returns the value of the '<em><b>Answers</b></em>' containment reference list.
   * The list contents are of type {@link at.ac.tuwien.big.questionnaire.Answer}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Answers</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Answers</em>' containment reference list.
   * @see at.ac.tuwien.big.questionnaire.QuestionnairePackage#getClosedQuestion_Answers()
   * @model containment="true"
   * @generated
   */
  EList<Answer> getAnswers();

  /**
   * Returns the value of the '<em><b>Default</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default</em>' reference.
   * @see #setDefault(Answer)
   * @see at.ac.tuwien.big.questionnaire.QuestionnairePackage#getClosedQuestion_Default()
   * @model
   * @generated
   */
  Answer getDefault();

  /**
   * Sets the value of the '{@link at.ac.tuwien.big.questionnaire.ClosedQuestion#getDefault <em>Default</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default</em>' reference.
   * @see #getDefault()
   * @generated
   */
  void setDefault(Answer value);

} // ClosedQuestion
