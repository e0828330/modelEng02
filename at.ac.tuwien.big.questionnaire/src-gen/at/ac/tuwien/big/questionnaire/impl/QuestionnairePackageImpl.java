/**
 */
package at.ac.tuwien.big.questionnaire.impl;

import at.ac.tuwien.big.questionnaire.Answer;
import at.ac.tuwien.big.questionnaire.ClosedQuestion;
import at.ac.tuwien.big.questionnaire.Group;
import at.ac.tuwien.big.questionnaire.InputAnswer;
import at.ac.tuwien.big.questionnaire.LikertQuestion;
import at.ac.tuwien.big.questionnaire.OpenQuestion;
import at.ac.tuwien.big.questionnaire.Question;
import at.ac.tuwien.big.questionnaire.Questionnaire;
import at.ac.tuwien.big.questionnaire.QuestionnaireFactory;
import at.ac.tuwien.big.questionnaire.QuestionnairePackage;
import at.ac.tuwien.big.questionnaire.SimpleAnswer;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QuestionnairePackageImpl extends EPackageImpl implements QuestionnairePackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass questionnaireEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass groupEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass questionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass openQuestionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass closedQuestionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass likertQuestionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass answerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass simpleAnswerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inputAnswerEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see at.ac.tuwien.big.questionnaire.QuestionnairePackage#eNS_URI
   * @see #init()
   * @generated
   */
  private QuestionnairePackageImpl()
  {
    super(eNS_URI, QuestionnaireFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link QuestionnairePackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static QuestionnairePackage init()
  {
    if (isInited) return (QuestionnairePackage)EPackage.Registry.INSTANCE.getEPackage(QuestionnairePackage.eNS_URI);

    // Obtain or create and register package
    QuestionnairePackageImpl theQuestionnairePackage = (QuestionnairePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof QuestionnairePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new QuestionnairePackageImpl());

    isInited = true;

    // Create package meta-data objects
    theQuestionnairePackage.createPackageContents();

    // Initialize created meta-data
    theQuestionnairePackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theQuestionnairePackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(QuestionnairePackage.eNS_URI, theQuestionnairePackage);
    return theQuestionnairePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQuestionnaire()
  {
    return questionnaireEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQuestionnaire_Name()
  {
    return (EAttribute)questionnaireEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQuestionnaire_Groups()
  {
    return (EReference)questionnaireEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGroup()
  {
    return groupEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGroup_Name()
  {
    return (EAttribute)groupEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGroup_Questions()
  {
    return (EReference)groupEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQuestion()
  {
    return questionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQuestion_Name()
  {
    return (EAttribute)questionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOpenQuestion()
  {
    return openQuestionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClosedQuestion()
  {
    return closedQuestionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClosedQuestion_Answers()
  {
    return (EReference)closedQuestionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClosedQuestion_Default()
  {
    return (EReference)closedQuestionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLikertQuestion()
  {
    return likertQuestionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLikertQuestion_From()
  {
    return (EAttribute)likertQuestionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLikertQuestion_To()
  {
    return (EAttribute)likertQuestionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAnswer()
  {
    return answerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAnswer_Enables()
  {
    return (EReference)answerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAnswer_Name()
  {
    return (EAttribute)answerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSimpleAnswer()
  {
    return simpleAnswerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInputAnswer()
  {
    return inputAnswerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QuestionnaireFactory getQuestionnaireFactory()
  {
    return (QuestionnaireFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    questionnaireEClass = createEClass(QUESTIONNAIRE);
    createEAttribute(questionnaireEClass, QUESTIONNAIRE__NAME);
    createEReference(questionnaireEClass, QUESTIONNAIRE__GROUPS);

    groupEClass = createEClass(GROUP);
    createEAttribute(groupEClass, GROUP__NAME);
    createEReference(groupEClass, GROUP__QUESTIONS);

    questionEClass = createEClass(QUESTION);
    createEAttribute(questionEClass, QUESTION__NAME);

    openQuestionEClass = createEClass(OPEN_QUESTION);

    closedQuestionEClass = createEClass(CLOSED_QUESTION);
    createEReference(closedQuestionEClass, CLOSED_QUESTION__ANSWERS);
    createEReference(closedQuestionEClass, CLOSED_QUESTION__DEFAULT);

    likertQuestionEClass = createEClass(LIKERT_QUESTION);
    createEAttribute(likertQuestionEClass, LIKERT_QUESTION__FROM);
    createEAttribute(likertQuestionEClass, LIKERT_QUESTION__TO);

    answerEClass = createEClass(ANSWER);
    createEReference(answerEClass, ANSWER__ENABLES);
    createEAttribute(answerEClass, ANSWER__NAME);

    simpleAnswerEClass = createEClass(SIMPLE_ANSWER);

    inputAnswerEClass = createEClass(INPUT_ANSWER);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    openQuestionEClass.getESuperTypes().add(this.getQuestion());
    closedQuestionEClass.getESuperTypes().add(this.getQuestion());
    likertQuestionEClass.getESuperTypes().add(this.getQuestion());
    simpleAnswerEClass.getESuperTypes().add(this.getAnswer());
    inputAnswerEClass.getESuperTypes().add(this.getAnswer());

    // Initialize classes and features; add operations and parameters
    initEClass(questionnaireEClass, Questionnaire.class, "Questionnaire", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getQuestionnaire_Name(), ecorePackage.getEString(), "name", null, 0, 1, Questionnaire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getQuestionnaire_Groups(), this.getGroup(), null, "groups", null, 0, -1, Questionnaire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(groupEClass, Group.class, "Group", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGroup_Name(), ecorePackage.getEString(), "name", null, 0, 1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGroup_Questions(), this.getQuestion(), null, "questions", null, 0, -1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(questionEClass, Question.class, "Question", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getQuestion_Name(), ecorePackage.getEString(), "name", null, 0, 1, Question.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(openQuestionEClass, OpenQuestion.class, "OpenQuestion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(closedQuestionEClass, ClosedQuestion.class, "ClosedQuestion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getClosedQuestion_Answers(), this.getAnswer(), null, "answers", null, 0, -1, ClosedQuestion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClosedQuestion_Default(), this.getAnswer(), null, "default", null, 0, 1, ClosedQuestion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(likertQuestionEClass, LikertQuestion.class, "LikertQuestion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLikertQuestion_From(), ecorePackage.getEInt(), "from", null, 0, 1, LikertQuestion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLikertQuestion_To(), ecorePackage.getEInt(), "to", null, 0, 1, LikertQuestion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(answerEClass, Answer.class, "Answer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAnswer_Enables(), this.getQuestion(), null, "enables", null, 0, -1, Answer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAnswer_Name(), ecorePackage.getEString(), "name", null, 0, 1, Answer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(simpleAnswerEClass, SimpleAnswer.class, "SimpleAnswer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(inputAnswerEClass, InputAnswer.class, "InputAnswer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} //QuestionnairePackageImpl
