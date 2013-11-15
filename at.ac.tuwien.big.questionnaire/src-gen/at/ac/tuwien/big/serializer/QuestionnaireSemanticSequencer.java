package at.ac.tuwien.big.serializer;

import at.ac.tuwien.big.questionnaire.ClosedQuestion;
import at.ac.tuwien.big.questionnaire.EnablesQuestion;
import at.ac.tuwien.big.questionnaire.Group;
import at.ac.tuwien.big.questionnaire.InputAnswer;
import at.ac.tuwien.big.questionnaire.LikertQuestion;
import at.ac.tuwien.big.questionnaire.OpenQuestion;
import at.ac.tuwien.big.questionnaire.Questionnaire;
import at.ac.tuwien.big.questionnaire.QuestionnairePackage;
import at.ac.tuwien.big.questionnaire.SimpleAnswer;
import at.ac.tuwien.big.services.QuestionnaireGrammarAccess;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class QuestionnaireSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private QuestionnaireGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == QuestionnairePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case QuestionnairePackage.CLOSED_QUESTION:
				if(context == grammarAccess.getClosedQuestionRule() ||
				   context == grammarAccess.getQuestionRule()) {
					sequence_ClosedQuestion(context, (ClosedQuestion) semanticObject); 
					return; 
				}
				else break;
			case QuestionnairePackage.ENABLES_QUESTION:
				if(context == grammarAccess.getEnablesQuestionRule()) {
					sequence_EnablesQuestion(context, (EnablesQuestion) semanticObject); 
					return; 
				}
				else break;
			case QuestionnairePackage.GROUP:
				if(context == grammarAccess.getGroupRule()) {
					sequence_Group(context, (Group) semanticObject); 
					return; 
				}
				else break;
			case QuestionnairePackage.INPUT_ANSWER:
				if(context == grammarAccess.getAnswerRule()) {
					sequence_Answer_InputAnswer(context, (InputAnswer) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getInputAnswerRule()) {
					sequence_InputAnswer(context, (InputAnswer) semanticObject); 
					return; 
				}
				else break;
			case QuestionnairePackage.LIKERT_QUESTION:
				if(context == grammarAccess.getLikertQuestionRule() ||
				   context == grammarAccess.getQuestionRule()) {
					sequence_LikertQuestion(context, (LikertQuestion) semanticObject); 
					return; 
				}
				else break;
			case QuestionnairePackage.OPEN_QUESTION:
				if(context == grammarAccess.getOpenQuestionRule() ||
				   context == grammarAccess.getQuestionRule()) {
					sequence_OpenQuestion(context, (OpenQuestion) semanticObject); 
					return; 
				}
				else break;
			case QuestionnairePackage.QUESTIONNAIRE:
				if(context == grammarAccess.getQuestionnaireRule()) {
					sequence_Questionnaire(context, (Questionnaire) semanticObject); 
					return; 
				}
				else break;
			case QuestionnairePackage.SIMPLE_ANSWER:
				if(context == grammarAccess.getAnswerRule()) {
					sequence_Answer_SimpleAnswer(context, (SimpleAnswer) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getSimpleAnswerRule()) {
					sequence_SimpleAnswer(context, (SimpleAnswer) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=STRING enables=EnablesQuestion?)
	 */
	protected void sequence_Answer_InputAnswer(EObject context, InputAnswer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=STRING enables=EnablesQuestion?)
	 */
	protected void sequence_Answer_SimpleAnswer(EObject context, SimpleAnswer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=STRING answers+=Answer answers+=Answer* default=STRING?)
	 */
	protected void sequence_ClosedQuestion(EObject context, ClosedQuestion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=STRING
	 */
	protected void sequence_EnablesQuestion(EObject context, EnablesQuestion semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, QuestionnairePackage.Literals.ENABLES_QUESTION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QuestionnairePackage.Literals.ENABLES_QUESTION__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEnablesQuestionAccess().getNameSTRINGTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=STRING questions+=Question questions+=Question*)
	 */
	protected void sequence_Group(EObject context, Group semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=STRING
	 */
	protected void sequence_InputAnswer(EObject context, InputAnswer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=STRING from=SINT to=SINT)
	 */
	protected void sequence_LikertQuestion(EObject context, LikertQuestion semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, QuestionnairePackage.Literals.QUESTION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QuestionnairePackage.Literals.QUESTION__NAME));
			if(transientValues.isValueTransient(semanticObject, QuestionnairePackage.Literals.LIKERT_QUESTION__FROM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QuestionnairePackage.Literals.LIKERT_QUESTION__FROM));
			if(transientValues.isValueTransient(semanticObject, QuestionnairePackage.Literals.LIKERT_QUESTION__TO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QuestionnairePackage.Literals.LIKERT_QUESTION__TO));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLikertQuestionAccess().getNameSTRINGTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getLikertQuestionAccess().getFromSINTTerminalRuleCall_3_0(), semanticObject.getFrom());
		feeder.accept(grammarAccess.getLikertQuestionAccess().getToSINTTerminalRuleCall_5_0(), semanticObject.getTo());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=STRING
	 */
	protected void sequence_OpenQuestion(EObject context, OpenQuestion semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, QuestionnairePackage.Literals.QUESTION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QuestionnairePackage.Literals.QUESTION__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getOpenQuestionAccess().getNameSTRINGTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=STRING groups+=Group groups+=Group*)
	 */
	protected void sequence_Questionnaire(EObject context, Questionnaire semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=STRING
	 */
	protected void sequence_SimpleAnswer(EObject context, SimpleAnswer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
