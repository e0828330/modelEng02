/**
 */
package at.ac.tuwien.big.questionnaire;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Likert Question</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.ac.tuwien.big.questionnaire.LikertQuestion#getFrom <em>From</em>}</li>
 *   <li>{@link at.ac.tuwien.big.questionnaire.LikertQuestion#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.ac.tuwien.big.questionnaire.QuestionnairePackage#getLikertQuestion()
 * @model
 * @generated
 */
public interface LikertQuestion extends Question
{
  /**
   * Returns the value of the '<em><b>From</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>From</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>From</em>' attribute.
   * @see #setFrom(int)
   * @see at.ac.tuwien.big.questionnaire.QuestionnairePackage#getLikertQuestion_From()
   * @model
   * @generated
   */
  int getFrom();

  /**
   * Sets the value of the '{@link at.ac.tuwien.big.questionnaire.LikertQuestion#getFrom <em>From</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>From</em>' attribute.
   * @see #getFrom()
   * @generated
   */
  void setFrom(int value);

  /**
   * Returns the value of the '<em><b>To</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>To</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>To</em>' attribute.
   * @see #setTo(int)
   * @see at.ac.tuwien.big.questionnaire.QuestionnairePackage#getLikertQuestion_To()
   * @model
   * @generated
   */
  int getTo();

  /**
   * Sets the value of the '{@link at.ac.tuwien.big.questionnaire.LikertQuestion#getTo <em>To</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To</em>' attribute.
   * @see #getTo()
   * @generated
   */
  void setTo(int value);

} // LikertQuestion
