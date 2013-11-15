/**
 */
package at.ac.tuwien.big.questionnaire;


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
   * Returns the value of the '<em><b>Enables</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Enables</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enables</em>' reference.
   * @see #setEnables(Question)
   * @see at.ac.tuwien.big.questionnaire.QuestionnairePackage#getSimpleAnswer_Enables()
   * @model
   * @generated
   */
  Question getEnables();

  /**
   * Sets the value of the '{@link at.ac.tuwien.big.questionnaire.SimpleAnswer#getEnables <em>Enables</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Enables</em>' reference.
   * @see #getEnables()
   * @generated
   */
  void setEnables(Question value);

} // SimpleAnswer
