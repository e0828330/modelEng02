/**
 */
package at.ac.tuwien.big.questionnaire;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see at.ac.tuwien.big.questionnaire.QuestionnaireFactory
 * @model kind="package"
 * @generated
 */
public interface QuestionnairePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "questionnaire";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.ac.at/tuwien/big/Questionnaire";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "questionnaire";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  QuestionnairePackage eINSTANCE = at.ac.tuwien.big.questionnaire.impl.QuestionnairePackageImpl.init();

  /**
   * The meta object id for the '{@link at.ac.tuwien.big.questionnaire.impl.QuestionnaireImpl <em>Questionnaire</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.tuwien.big.questionnaire.impl.QuestionnaireImpl
   * @see at.ac.tuwien.big.questionnaire.impl.QuestionnairePackageImpl#getQuestionnaire()
   * @generated
   */
  int QUESTIONNAIRE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTIONNAIRE__NAME = 0;

  /**
   * The feature id for the '<em><b>Groups</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTIONNAIRE__GROUPS = 1;

  /**
   * The number of structural features of the '<em>Questionnaire</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTIONNAIRE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.ac.tuwien.big.questionnaire.impl.GroupImpl <em>Group</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.tuwien.big.questionnaire.impl.GroupImpl
   * @see at.ac.tuwien.big.questionnaire.impl.QuestionnairePackageImpl#getGroup()
   * @generated
   */
  int GROUP = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP__NAME = 0;

  /**
   * The feature id for the '<em><b>Questions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP__QUESTIONS = 1;

  /**
   * The number of structural features of the '<em>Group</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.ac.tuwien.big.questionnaire.impl.QuestionImpl <em>Question</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.tuwien.big.questionnaire.impl.QuestionImpl
   * @see at.ac.tuwien.big.questionnaire.impl.QuestionnairePackageImpl#getQuestion()
   * @generated
   */
  int QUESTION = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTION__NAME = 0;

  /**
   * The number of structural features of the '<em>Question</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.ac.tuwien.big.questionnaire.impl.OpenQuestionImpl <em>Open Question</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.tuwien.big.questionnaire.impl.OpenQuestionImpl
   * @see at.ac.tuwien.big.questionnaire.impl.QuestionnairePackageImpl#getOpenQuestion()
   * @generated
   */
  int OPEN_QUESTION = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPEN_QUESTION__NAME = QUESTION__NAME;

  /**
   * The number of structural features of the '<em>Open Question</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPEN_QUESTION_FEATURE_COUNT = QUESTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link at.ac.tuwien.big.questionnaire.impl.ClosedQuestionImpl <em>Closed Question</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.tuwien.big.questionnaire.impl.ClosedQuestionImpl
   * @see at.ac.tuwien.big.questionnaire.impl.QuestionnairePackageImpl#getClosedQuestion()
   * @generated
   */
  int CLOSED_QUESTION = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLOSED_QUESTION__NAME = QUESTION__NAME;

  /**
   * The feature id for the '<em><b>Answers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLOSED_QUESTION__ANSWERS = QUESTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Default</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLOSED_QUESTION__DEFAULT = QUESTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Closed Question</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLOSED_QUESTION_FEATURE_COUNT = QUESTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.ac.tuwien.big.questionnaire.impl.LikertQuestionImpl <em>Likert Question</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.tuwien.big.questionnaire.impl.LikertQuestionImpl
   * @see at.ac.tuwien.big.questionnaire.impl.QuestionnairePackageImpl#getLikertQuestion()
   * @generated
   */
  int LIKERT_QUESTION = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIKERT_QUESTION__NAME = QUESTION__NAME;

  /**
   * The feature id for the '<em><b>From</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIKERT_QUESTION__FROM = QUESTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>To</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIKERT_QUESTION__TO = QUESTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Likert Question</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIKERT_QUESTION_FEATURE_COUNT = QUESTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.ac.tuwien.big.questionnaire.impl.AnswerImpl <em>Answer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.tuwien.big.questionnaire.impl.AnswerImpl
   * @see at.ac.tuwien.big.questionnaire.impl.QuestionnairePackageImpl#getAnswer()
   * @generated
   */
  int ANSWER = 6;

  /**
   * The feature id for the '<em><b>Enables</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANSWER__ENABLES = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANSWER__NAME = 1;

  /**
   * The number of structural features of the '<em>Answer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANSWER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.ac.tuwien.big.questionnaire.impl.SimpleAnswerImpl <em>Simple Answer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.tuwien.big.questionnaire.impl.SimpleAnswerImpl
   * @see at.ac.tuwien.big.questionnaire.impl.QuestionnairePackageImpl#getSimpleAnswer()
   * @generated
   */
  int SIMPLE_ANSWER = 7;

  /**
   * The feature id for the '<em><b>Enables</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_ANSWER__ENABLES = ANSWER__ENABLES;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_ANSWER__NAME = ANSWER__NAME;

  /**
   * The number of structural features of the '<em>Simple Answer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_ANSWER_FEATURE_COUNT = ANSWER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link at.ac.tuwien.big.questionnaire.impl.InputAnswerImpl <em>Input Answer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.tuwien.big.questionnaire.impl.InputAnswerImpl
   * @see at.ac.tuwien.big.questionnaire.impl.QuestionnairePackageImpl#getInputAnswer()
   * @generated
   */
  int INPUT_ANSWER = 8;

  /**
   * The feature id for the '<em><b>Enables</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_ANSWER__ENABLES = ANSWER__ENABLES;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_ANSWER__NAME = ANSWER__NAME;

  /**
   * The number of structural features of the '<em>Input Answer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_ANSWER_FEATURE_COUNT = ANSWER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link at.ac.tuwien.big.questionnaire.impl.EnablesQuestionImpl <em>Enables Question</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.tuwien.big.questionnaire.impl.EnablesQuestionImpl
   * @see at.ac.tuwien.big.questionnaire.impl.QuestionnairePackageImpl#getEnablesQuestion()
   * @generated
   */
  int ENABLES_QUESTION = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENABLES_QUESTION__NAME = 0;

  /**
   * The number of structural features of the '<em>Enables Question</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENABLES_QUESTION_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link at.ac.tuwien.big.questionnaire.Questionnaire <em>Questionnaire</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Questionnaire</em>'.
   * @see at.ac.tuwien.big.questionnaire.Questionnaire
   * @generated
   */
  EClass getQuestionnaire();

  /**
   * Returns the meta object for the attribute '{@link at.ac.tuwien.big.questionnaire.Questionnaire#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.ac.tuwien.big.questionnaire.Questionnaire#getName()
   * @see #getQuestionnaire()
   * @generated
   */
  EAttribute getQuestionnaire_Name();

  /**
   * Returns the meta object for the containment reference list '{@link at.ac.tuwien.big.questionnaire.Questionnaire#getGroups <em>Groups</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Groups</em>'.
   * @see at.ac.tuwien.big.questionnaire.Questionnaire#getGroups()
   * @see #getQuestionnaire()
   * @generated
   */
  EReference getQuestionnaire_Groups();

  /**
   * Returns the meta object for class '{@link at.ac.tuwien.big.questionnaire.Group <em>Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Group</em>'.
   * @see at.ac.tuwien.big.questionnaire.Group
   * @generated
   */
  EClass getGroup();

  /**
   * Returns the meta object for the attribute '{@link at.ac.tuwien.big.questionnaire.Group#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.ac.tuwien.big.questionnaire.Group#getName()
   * @see #getGroup()
   * @generated
   */
  EAttribute getGroup_Name();

  /**
   * Returns the meta object for the containment reference list '{@link at.ac.tuwien.big.questionnaire.Group#getQuestions <em>Questions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Questions</em>'.
   * @see at.ac.tuwien.big.questionnaire.Group#getQuestions()
   * @see #getGroup()
   * @generated
   */
  EReference getGroup_Questions();

  /**
   * Returns the meta object for class '{@link at.ac.tuwien.big.questionnaire.Question <em>Question</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Question</em>'.
   * @see at.ac.tuwien.big.questionnaire.Question
   * @generated
   */
  EClass getQuestion();

  /**
   * Returns the meta object for the attribute '{@link at.ac.tuwien.big.questionnaire.Question#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.ac.tuwien.big.questionnaire.Question#getName()
   * @see #getQuestion()
   * @generated
   */
  EAttribute getQuestion_Name();

  /**
   * Returns the meta object for class '{@link at.ac.tuwien.big.questionnaire.OpenQuestion <em>Open Question</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Open Question</em>'.
   * @see at.ac.tuwien.big.questionnaire.OpenQuestion
   * @generated
   */
  EClass getOpenQuestion();

  /**
   * Returns the meta object for class '{@link at.ac.tuwien.big.questionnaire.ClosedQuestion <em>Closed Question</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Closed Question</em>'.
   * @see at.ac.tuwien.big.questionnaire.ClosedQuestion
   * @generated
   */
  EClass getClosedQuestion();

  /**
   * Returns the meta object for the containment reference list '{@link at.ac.tuwien.big.questionnaire.ClosedQuestion#getAnswers <em>Answers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Answers</em>'.
   * @see at.ac.tuwien.big.questionnaire.ClosedQuestion#getAnswers()
   * @see #getClosedQuestion()
   * @generated
   */
  EReference getClosedQuestion_Answers();

  /**
   * Returns the meta object for the attribute '{@link at.ac.tuwien.big.questionnaire.ClosedQuestion#getDefault <em>Default</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default</em>'.
   * @see at.ac.tuwien.big.questionnaire.ClosedQuestion#getDefault()
   * @see #getClosedQuestion()
   * @generated
   */
  EAttribute getClosedQuestion_Default();

  /**
   * Returns the meta object for class '{@link at.ac.tuwien.big.questionnaire.LikertQuestion <em>Likert Question</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Likert Question</em>'.
   * @see at.ac.tuwien.big.questionnaire.LikertQuestion
   * @generated
   */
  EClass getLikertQuestion();

  /**
   * Returns the meta object for the attribute '{@link at.ac.tuwien.big.questionnaire.LikertQuestion#getFrom <em>From</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>From</em>'.
   * @see at.ac.tuwien.big.questionnaire.LikertQuestion#getFrom()
   * @see #getLikertQuestion()
   * @generated
   */
  EAttribute getLikertQuestion_From();

  /**
   * Returns the meta object for the attribute '{@link at.ac.tuwien.big.questionnaire.LikertQuestion#getTo <em>To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>To</em>'.
   * @see at.ac.tuwien.big.questionnaire.LikertQuestion#getTo()
   * @see #getLikertQuestion()
   * @generated
   */
  EAttribute getLikertQuestion_To();

  /**
   * Returns the meta object for class '{@link at.ac.tuwien.big.questionnaire.Answer <em>Answer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Answer</em>'.
   * @see at.ac.tuwien.big.questionnaire.Answer
   * @generated
   */
  EClass getAnswer();

  /**
   * Returns the meta object for the containment reference '{@link at.ac.tuwien.big.questionnaire.Answer#getEnables <em>Enables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Enables</em>'.
   * @see at.ac.tuwien.big.questionnaire.Answer#getEnables()
   * @see #getAnswer()
   * @generated
   */
  EReference getAnswer_Enables();

  /**
   * Returns the meta object for the attribute '{@link at.ac.tuwien.big.questionnaire.Answer#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.ac.tuwien.big.questionnaire.Answer#getName()
   * @see #getAnswer()
   * @generated
   */
  EAttribute getAnswer_Name();

  /**
   * Returns the meta object for class '{@link at.ac.tuwien.big.questionnaire.SimpleAnswer <em>Simple Answer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Answer</em>'.
   * @see at.ac.tuwien.big.questionnaire.SimpleAnswer
   * @generated
   */
  EClass getSimpleAnswer();

  /**
   * Returns the meta object for class '{@link at.ac.tuwien.big.questionnaire.InputAnswer <em>Input Answer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Input Answer</em>'.
   * @see at.ac.tuwien.big.questionnaire.InputAnswer
   * @generated
   */
  EClass getInputAnswer();

  /**
   * Returns the meta object for class '{@link at.ac.tuwien.big.questionnaire.EnablesQuestion <em>Enables Question</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enables Question</em>'.
   * @see at.ac.tuwien.big.questionnaire.EnablesQuestion
   * @generated
   */
  EClass getEnablesQuestion();

  /**
   * Returns the meta object for the attribute '{@link at.ac.tuwien.big.questionnaire.EnablesQuestion#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.ac.tuwien.big.questionnaire.EnablesQuestion#getName()
   * @see #getEnablesQuestion()
   * @generated
   */
  EAttribute getEnablesQuestion_Name();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  QuestionnaireFactory getQuestionnaireFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link at.ac.tuwien.big.questionnaire.impl.QuestionnaireImpl <em>Questionnaire</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.tuwien.big.questionnaire.impl.QuestionnaireImpl
     * @see at.ac.tuwien.big.questionnaire.impl.QuestionnairePackageImpl#getQuestionnaire()
     * @generated
     */
    EClass QUESTIONNAIRE = eINSTANCE.getQuestionnaire();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUESTIONNAIRE__NAME = eINSTANCE.getQuestionnaire_Name();

    /**
     * The meta object literal for the '<em><b>Groups</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUESTIONNAIRE__GROUPS = eINSTANCE.getQuestionnaire_Groups();

    /**
     * The meta object literal for the '{@link at.ac.tuwien.big.questionnaire.impl.GroupImpl <em>Group</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.tuwien.big.questionnaire.impl.GroupImpl
     * @see at.ac.tuwien.big.questionnaire.impl.QuestionnairePackageImpl#getGroup()
     * @generated
     */
    EClass GROUP = eINSTANCE.getGroup();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GROUP__NAME = eINSTANCE.getGroup_Name();

    /**
     * The meta object literal for the '<em><b>Questions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GROUP__QUESTIONS = eINSTANCE.getGroup_Questions();

    /**
     * The meta object literal for the '{@link at.ac.tuwien.big.questionnaire.impl.QuestionImpl <em>Question</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.tuwien.big.questionnaire.impl.QuestionImpl
     * @see at.ac.tuwien.big.questionnaire.impl.QuestionnairePackageImpl#getQuestion()
     * @generated
     */
    EClass QUESTION = eINSTANCE.getQuestion();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUESTION__NAME = eINSTANCE.getQuestion_Name();

    /**
     * The meta object literal for the '{@link at.ac.tuwien.big.questionnaire.impl.OpenQuestionImpl <em>Open Question</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.tuwien.big.questionnaire.impl.OpenQuestionImpl
     * @see at.ac.tuwien.big.questionnaire.impl.QuestionnairePackageImpl#getOpenQuestion()
     * @generated
     */
    EClass OPEN_QUESTION = eINSTANCE.getOpenQuestion();

    /**
     * The meta object literal for the '{@link at.ac.tuwien.big.questionnaire.impl.ClosedQuestionImpl <em>Closed Question</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.tuwien.big.questionnaire.impl.ClosedQuestionImpl
     * @see at.ac.tuwien.big.questionnaire.impl.QuestionnairePackageImpl#getClosedQuestion()
     * @generated
     */
    EClass CLOSED_QUESTION = eINSTANCE.getClosedQuestion();

    /**
     * The meta object literal for the '<em><b>Answers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLOSED_QUESTION__ANSWERS = eINSTANCE.getClosedQuestion_Answers();

    /**
     * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLOSED_QUESTION__DEFAULT = eINSTANCE.getClosedQuestion_Default();

    /**
     * The meta object literal for the '{@link at.ac.tuwien.big.questionnaire.impl.LikertQuestionImpl <em>Likert Question</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.tuwien.big.questionnaire.impl.LikertQuestionImpl
     * @see at.ac.tuwien.big.questionnaire.impl.QuestionnairePackageImpl#getLikertQuestion()
     * @generated
     */
    EClass LIKERT_QUESTION = eINSTANCE.getLikertQuestion();

    /**
     * The meta object literal for the '<em><b>From</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LIKERT_QUESTION__FROM = eINSTANCE.getLikertQuestion_From();

    /**
     * The meta object literal for the '<em><b>To</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LIKERT_QUESTION__TO = eINSTANCE.getLikertQuestion_To();

    /**
     * The meta object literal for the '{@link at.ac.tuwien.big.questionnaire.impl.AnswerImpl <em>Answer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.tuwien.big.questionnaire.impl.AnswerImpl
     * @see at.ac.tuwien.big.questionnaire.impl.QuestionnairePackageImpl#getAnswer()
     * @generated
     */
    EClass ANSWER = eINSTANCE.getAnswer();

    /**
     * The meta object literal for the '<em><b>Enables</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANSWER__ENABLES = eINSTANCE.getAnswer_Enables();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ANSWER__NAME = eINSTANCE.getAnswer_Name();

    /**
     * The meta object literal for the '{@link at.ac.tuwien.big.questionnaire.impl.SimpleAnswerImpl <em>Simple Answer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.tuwien.big.questionnaire.impl.SimpleAnswerImpl
     * @see at.ac.tuwien.big.questionnaire.impl.QuestionnairePackageImpl#getSimpleAnswer()
     * @generated
     */
    EClass SIMPLE_ANSWER = eINSTANCE.getSimpleAnswer();

    /**
     * The meta object literal for the '{@link at.ac.tuwien.big.questionnaire.impl.InputAnswerImpl <em>Input Answer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.tuwien.big.questionnaire.impl.InputAnswerImpl
     * @see at.ac.tuwien.big.questionnaire.impl.QuestionnairePackageImpl#getInputAnswer()
     * @generated
     */
    EClass INPUT_ANSWER = eINSTANCE.getInputAnswer();

    /**
     * The meta object literal for the '{@link at.ac.tuwien.big.questionnaire.impl.EnablesQuestionImpl <em>Enables Question</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.tuwien.big.questionnaire.impl.EnablesQuestionImpl
     * @see at.ac.tuwien.big.questionnaire.impl.QuestionnairePackageImpl#getEnablesQuestion()
     * @generated
     */
    EClass ENABLES_QUESTION = eINSTANCE.getEnablesQuestion();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENABLES_QUESTION__NAME = eINSTANCE.getEnablesQuestion_Name();

  }

} //QuestionnairePackage
