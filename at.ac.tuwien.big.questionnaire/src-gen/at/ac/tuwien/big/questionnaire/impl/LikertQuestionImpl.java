/**
 */
package at.ac.tuwien.big.questionnaire.impl;

import at.ac.tuwien.big.questionnaire.LikertQuestion;
import at.ac.tuwien.big.questionnaire.QuestionnairePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Likert Question</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.ac.tuwien.big.questionnaire.impl.LikertQuestionImpl#getFrom <em>From</em>}</li>
 *   <li>{@link at.ac.tuwien.big.questionnaire.impl.LikertQuestionImpl#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LikertQuestionImpl extends QuestionImpl implements LikertQuestion
{
  /**
   * The default value of the '{@link #getFrom() <em>From</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFrom()
   * @generated
   * @ordered
   */
  protected static final int FROM_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getFrom() <em>From</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFrom()
   * @generated
   * @ordered
   */
  protected int from = FROM_EDEFAULT;

  /**
   * The default value of the '{@link #getTo() <em>To</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTo()
   * @generated
   * @ordered
   */
  protected static final int TO_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getTo() <em>To</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTo()
   * @generated
   * @ordered
   */
  protected int to = TO_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LikertQuestionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return QuestionnairePackage.Literals.LIKERT_QUESTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getFrom()
  {
    return from;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFrom(int newFrom)
  {
    int oldFrom = from;
    from = newFrom;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QuestionnairePackage.LIKERT_QUESTION__FROM, oldFrom, from));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getTo()
  {
    return to;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTo(int newTo)
  {
    int oldTo = to;
    to = newTo;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QuestionnairePackage.LIKERT_QUESTION__TO, oldTo, to));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case QuestionnairePackage.LIKERT_QUESTION__FROM:
        return getFrom();
      case QuestionnairePackage.LIKERT_QUESTION__TO:
        return getTo();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case QuestionnairePackage.LIKERT_QUESTION__FROM:
        setFrom((Integer)newValue);
        return;
      case QuestionnairePackage.LIKERT_QUESTION__TO:
        setTo((Integer)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case QuestionnairePackage.LIKERT_QUESTION__FROM:
        setFrom(FROM_EDEFAULT);
        return;
      case QuestionnairePackage.LIKERT_QUESTION__TO:
        setTo(TO_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case QuestionnairePackage.LIKERT_QUESTION__FROM:
        return from != FROM_EDEFAULT;
      case QuestionnairePackage.LIKERT_QUESTION__TO:
        return to != TO_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (from: ");
    result.append(from);
    result.append(", to: ");
    result.append(to);
    result.append(')');
    return result.toString();
  }

} //LikertQuestionImpl
