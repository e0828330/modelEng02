package at.ac.tuwien.big.serializer;

import at.ac.tuwien.big.services.QuestionnaireGrammarAccess;
import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class QuestionnaireSyntacticSequencer extends AbstractSyntacticSequencer {

	protected QuestionnaireGrammarAccess grammarAccess;
	protected AbstractElementAlias match_ClosedQuestion_MultipleAnswersKeyword_1_1_or_SingleAnswerKeyword_1_0;
	protected AbstractElementAlias match_OpenQuestion___MandatoryKeyword_0_0_or_MultilineKeyword_0_1__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (QuestionnaireGrammarAccess) access;
		match_ClosedQuestion_MultipleAnswersKeyword_1_1_or_SingleAnswerKeyword_1_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getClosedQuestionAccess().getMultipleAnswersKeyword_1_1()), new TokenAlias(false, false, grammarAccess.getClosedQuestionAccess().getSingleAnswerKeyword_1_0()));
		match_OpenQuestion___MandatoryKeyword_0_0_or_MultilineKeyword_0_1__q = new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getOpenQuestionAccess().getMandatoryKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getOpenQuestionAccess().getMultilineKeyword_0_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_ClosedQuestion_MultipleAnswersKeyword_1_1_or_SingleAnswerKeyword_1_0.equals(syntax))
				emit_ClosedQuestion_MultipleAnswersKeyword_1_1_or_SingleAnswerKeyword_1_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_OpenQuestion___MandatoryKeyword_0_0_or_MultilineKeyword_0_1__q.equals(syntax))
				emit_OpenQuestion___MandatoryKeyword_0_0_or_MultilineKeyword_0_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     'single answer' | 'multiple answers'
	 */
	protected void emit_ClosedQuestion_MultipleAnswersKeyword_1_1_or_SingleAnswerKeyword_1_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('multiline' | 'mandatory')?
	 */
	protected void emit_OpenQuestion___MandatoryKeyword_0_0_or_MultilineKeyword_0_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
