/**
 */
package at.ac.tuwien.big.questionnaire.impl;

import at.ac.tuwien.big.questionnaire.Question;
import at.ac.tuwien.big.questionnaire.QuestionnairePackage;
import at.ac.tuwien.big.questionnaire.SimpleAnswer;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Answer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.ac.tuwien.big.questionnaire.impl.SimpleAnswerImpl#getEnables <em>Enables</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SimpleAnswerImpl extends AnswerImpl implements SimpleAnswer
{
  /**
   * The cached value of the '{@link #getEnables() <em>Enables</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnables()
   * @generated
   * @ordered
   */
  protected Question enables;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SimpleAnswerImpl()
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
    return QuestionnairePackage.Literals.SIMPLE_ANSWER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Question getEnables()
  {
    if (enables != null && enables.eIsProxy())
    {
      InternalEObject oldEnables = (InternalEObject)enables;
      enables = (Question)eResolveProxy(oldEnables);
      if (enables != oldEnables)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, QuestionnairePackage.SIMPLE_ANSWER__ENABLES, oldEnables, enables));
      }
    }
    return enables;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Question basicGetEnables()
  {
    return enables;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEnables(Question newEnables)
  {
    Question oldEnables = enables;
    enables = newEnables;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QuestionnairePackage.SIMPLE_ANSWER__ENABLES, oldEnables, enables));
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
      case QuestionnairePackage.SIMPLE_ANSWER__ENABLES:
        if (resolve) return getEnables();
        return basicGetEnables();
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
      case QuestionnairePackage.SIMPLE_ANSWER__ENABLES:
        setEnables((Question)newValue);
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
      case QuestionnairePackage.SIMPLE_ANSWER__ENABLES:
        setEnables((Question)null);
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
      case QuestionnairePackage.SIMPLE_ANSWER__ENABLES:
        return enables != null;
    }
    return super.eIsSet(featureID);
  }

} //SimpleAnswerImpl
