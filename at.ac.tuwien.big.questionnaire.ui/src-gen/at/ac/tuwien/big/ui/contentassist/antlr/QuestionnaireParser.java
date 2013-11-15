/*
* generated by Xtext
*/
package at.ac.tuwien.big.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import at.ac.tuwien.big.services.QuestionnaireGrammarAccess;

public class QuestionnaireParser extends AbstractContentAssistParser {
	
	@Inject
	private QuestionnaireGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected at.ac.tuwien.big.ui.contentassist.antlr.internal.InternalQuestionnaireParser createParser() {
		at.ac.tuwien.big.ui.contentassist.antlr.internal.InternalQuestionnaireParser result = new at.ac.tuwien.big.ui.contentassist.antlr.internal.InternalQuestionnaireParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getQuestionAccess().getAlternatives(), "rule__Question__Alternatives");
					put(grammarAccess.getOpenQuestionAccess().getAlternatives_0(), "rule__OpenQuestion__Alternatives_0");
					put(grammarAccess.getClosedQuestionAccess().getAlternatives_1(), "rule__ClosedQuestion__Alternatives_1");
					put(grammarAccess.getAnswerAccess().getAlternatives_0(), "rule__Answer__Alternatives_0");
					put(grammarAccess.getQuestionnaireAccess().getGroup(), "rule__Questionnaire__Group__0");
					put(grammarAccess.getQuestionnaireAccess().getGroup_4(), "rule__Questionnaire__Group_4__0");
					put(grammarAccess.getGroupAccess().getGroup(), "rule__Group__Group__0");
					put(grammarAccess.getGroupAccess().getGroup_4(), "rule__Group__Group_4__0");
					put(grammarAccess.getOpenQuestionAccess().getGroup(), "rule__OpenQuestion__Group__0");
					put(grammarAccess.getClosedQuestionAccess().getGroup(), "rule__ClosedQuestion__Group__0");
					put(grammarAccess.getClosedQuestionAccess().getGroup_6(), "rule__ClosedQuestion__Group_6__0");
					put(grammarAccess.getClosedQuestionAccess().getGroup_8(), "rule__ClosedQuestion__Group_8__0");
					put(grammarAccess.getLikertQuestionAccess().getGroup(), "rule__LikertQuestion__Group__0");
					put(grammarAccess.getAnswerAccess().getGroup(), "rule__Answer__Group__0");
					put(grammarAccess.getInputAnswerAccess().getGroup(), "rule__InputAnswer__Group__0");
					put(grammarAccess.getEnablesQuestionAccess().getGroup(), "rule__EnablesQuestion__Group__0");
					put(grammarAccess.getSINTAccess().getGroup(), "rule__SINT__Group__0");
					put(grammarAccess.getQuestionnaireAccess().getNameAssignment_1(), "rule__Questionnaire__NameAssignment_1");
					put(grammarAccess.getQuestionnaireAccess().getGroupsAssignment_3(), "rule__Questionnaire__GroupsAssignment_3");
					put(grammarAccess.getQuestionnaireAccess().getGroupsAssignment_4_1(), "rule__Questionnaire__GroupsAssignment_4_1");
					put(grammarAccess.getGroupAccess().getNameAssignment_1(), "rule__Group__NameAssignment_1");
					put(grammarAccess.getGroupAccess().getQuestionsAssignment_3(), "rule__Group__QuestionsAssignment_3");
					put(grammarAccess.getGroupAccess().getQuestionsAssignment_4_1(), "rule__Group__QuestionsAssignment_4_1");
					put(grammarAccess.getOpenQuestionAccess().getNameAssignment_2(), "rule__OpenQuestion__NameAssignment_2");
					put(grammarAccess.getClosedQuestionAccess().getNameAssignment_2(), "rule__ClosedQuestion__NameAssignment_2");
					put(grammarAccess.getClosedQuestionAccess().getAnswersAssignment_5(), "rule__ClosedQuestion__AnswersAssignment_5");
					put(grammarAccess.getClosedQuestionAccess().getAnswersAssignment_6_1(), "rule__ClosedQuestion__AnswersAssignment_6_1");
					put(grammarAccess.getClosedQuestionAccess().getDefaultAssignment_8_1(), "rule__ClosedQuestion__DefaultAssignment_8_1");
					put(grammarAccess.getLikertQuestionAccess().getNameAssignment_1(), "rule__LikertQuestion__NameAssignment_1");
					put(grammarAccess.getLikertQuestionAccess().getFromAssignment_3(), "rule__LikertQuestion__FromAssignment_3");
					put(grammarAccess.getLikertQuestionAccess().getToAssignment_5(), "rule__LikertQuestion__ToAssignment_5");
					put(grammarAccess.getAnswerAccess().getEnablesAssignment_1(), "rule__Answer__EnablesAssignment_1");
					put(grammarAccess.getSimpleAnswerAccess().getNameAssignment(), "rule__SimpleAnswer__NameAssignment");
					put(grammarAccess.getInputAnswerAccess().getNameAssignment_0(), "rule__InputAnswer__NameAssignment_0");
					put(grammarAccess.getEnablesQuestionAccess().getQuestionAssignment_2(), "rule__EnablesQuestion__QuestionAssignment_2");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			at.ac.tuwien.big.ui.contentassist.antlr.internal.InternalQuestionnaireParser typedParser = (at.ac.tuwien.big.ui.contentassist.antlr.internal.InternalQuestionnaireParser) parser;
			typedParser.entryRuleQuestionnaire();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public QuestionnaireGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(QuestionnaireGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
