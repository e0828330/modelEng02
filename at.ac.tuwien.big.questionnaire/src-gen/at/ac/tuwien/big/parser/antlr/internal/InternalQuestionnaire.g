/*
* generated by Xtext
*/
grammar InternalQuestionnaire;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package at.ac.tuwien.big.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package at.ac.tuwien.big.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import at.ac.tuwien.big.services.QuestionnaireGrammarAccess;

}

@parser::members {

 	private QuestionnaireGrammarAccess grammarAccess;
 	
    public InternalQuestionnaireParser(TokenStream input, QuestionnaireGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "Questionnaire";	
   	}
   	
   	@Override
   	protected QuestionnaireGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleQuestionnaire
entryRuleQuestionnaire returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getQuestionnaireRule()); }
	 iv_ruleQuestionnaire=ruleQuestionnaire 
	 { $current=$iv_ruleQuestionnaire.current; } 
	 EOF 
;

// Rule Questionnaire
ruleQuestionnaire returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='questionnaire' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getQuestionnaireAccess().getQuestionnaireKeyword_0());
    }
(
(
		lv_name_1_0=RULE_STRING
		{
			newLeafNode(lv_name_1_0, grammarAccess.getQuestionnaireAccess().getNameSTRINGTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getQuestionnaireRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"STRING");
	    }

)
)	otherlv_2='[' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getQuestionnaireAccess().getLeftSquareBracketKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getQuestionnaireAccess().getGroupsGroupParserRuleCall_3_0()); 
	    }
		lv_groups_3_0=ruleGroup		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getQuestionnaireRule());
	        }
       		add(
       			$current, 
       			"groups",
        		lv_groups_3_0, 
        		"Group");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_4=',' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getQuestionnaireAccess().getCommaKeyword_4_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getQuestionnaireAccess().getGroupsGroupParserRuleCall_4_1_0()); 
	    }
		lv_groups_5_0=ruleGroup		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getQuestionnaireRule());
	        }
       		add(
       			$current, 
       			"groups",
        		lv_groups_5_0, 
        		"Group");
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_6=']' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getQuestionnaireAccess().getRightSquareBracketKeyword_5());
    }
)
;





// Entry rule entryRuleGroup
entryRuleGroup returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getGroupRule()); }
	 iv_ruleGroup=ruleGroup 
	 { $current=$iv_ruleGroup.current; } 
	 EOF 
;

// Rule Group
ruleGroup returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='group' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getGroupAccess().getGroupKeyword_0());
    }
(
(
		lv_name_1_0=RULE_STRING
		{
			newLeafNode(lv_name_1_0, grammarAccess.getGroupAccess().getNameSTRINGTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getGroupRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"STRING");
	    }

)
)	otherlv_2='[' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getGroupAccess().getLeftSquareBracketKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getGroupAccess().getQuestionsQuestionParserRuleCall_3_0()); 
	    }
		lv_questions_3_0=ruleQuestion		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getGroupRule());
	        }
       		add(
       			$current, 
       			"questions",
        		lv_questions_3_0, 
        		"Question");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_4=',' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getGroupAccess().getCommaKeyword_4_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getGroupAccess().getQuestionsQuestionParserRuleCall_4_1_0()); 
	    }
		lv_questions_5_0=ruleQuestion		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getGroupRule());
	        }
       		add(
       			$current, 
       			"questions",
        		lv_questions_5_0, 
        		"Question");
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_6=']' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getGroupAccess().getRightSquareBracketKeyword_5());
    }
)
;





// Entry rule entryRuleQuestion
entryRuleQuestion returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getQuestionRule()); }
	 iv_ruleQuestion=ruleQuestion 
	 { $current=$iv_ruleQuestion.current; } 
	 EOF 
;

// Rule Question
ruleQuestion returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getQuestionAccess().getOpenQuestionParserRuleCall_0()); 
    }
    this_OpenQuestion_0=ruleOpenQuestion
    { 
        $current = $this_OpenQuestion_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getQuestionAccess().getClosedQuestionParserRuleCall_1()); 
    }
    this_ClosedQuestion_1=ruleClosedQuestion
    { 
        $current = $this_ClosedQuestion_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getQuestionAccess().getLikertQuestionParserRuleCall_2()); 
    }
    this_LikertQuestion_2=ruleLikertQuestion
    { 
        $current = $this_LikertQuestion_2.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleOpenQuestion
entryRuleOpenQuestion returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getOpenQuestionRule()); }
	 iv_ruleOpenQuestion=ruleOpenQuestion 
	 { $current=$iv_ruleOpenQuestion.current; } 
	 EOF 
;

// Rule OpenQuestion
ruleOpenQuestion returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((	otherlv_0='mandatory' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getOpenQuestionAccess().getMandatoryKeyword_0_0());
    }

    |	otherlv_1='multiline' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getOpenQuestionAccess().getMultilineKeyword_0_1());
    }
)?	otherlv_2='open question' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getOpenQuestionAccess().getOpenQuestionKeyword_1());
    }
(
(
		lv_name_3_0=RULE_STRING
		{
			newLeafNode(lv_name_3_0, grammarAccess.getOpenQuestionAccess().getNameSTRINGTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getOpenQuestionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_3_0, 
        		"STRING");
	    }

)
))
;





// Entry rule entryRuleClosedQuestion
entryRuleClosedQuestion returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getClosedQuestionRule()); }
	 iv_ruleClosedQuestion=ruleClosedQuestion 
	 { $current=$iv_ruleClosedQuestion.current; } 
	 EOF 
;

// Rule ClosedQuestion
ruleClosedQuestion returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='closed question allowing' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getClosedQuestionAccess().getClosedQuestionAllowingKeyword_0());
    }
(	otherlv_1='single answer' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getClosedQuestionAccess().getSingleAnswerKeyword_1_0());
    }

    |	otherlv_2='multiple answers' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getClosedQuestionAccess().getMultipleAnswersKeyword_1_1());
    }
)(
(
		lv_name_3_0=RULE_STRING
		{
			newLeafNode(lv_name_3_0, grammarAccess.getClosedQuestionAccess().getNameSTRINGTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getClosedQuestionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_3_0, 
        		"STRING");
	    }

)
)	otherlv_4='answers' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getClosedQuestionAccess().getAnswersKeyword_3());
    }
	otherlv_5='[' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getClosedQuestionAccess().getLeftSquareBracketKeyword_4());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getClosedQuestionAccess().getAnswersAnswerParserRuleCall_5_0()); 
	    }
		lv_answers_6_0=ruleAnswer		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getClosedQuestionRule());
	        }
       		add(
       			$current, 
       			"answers",
        		lv_answers_6_0, 
        		"Answer");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_7=',' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getClosedQuestionAccess().getCommaKeyword_6_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getClosedQuestionAccess().getAnswersAnswerParserRuleCall_6_1_0()); 
	    }
		lv_answers_8_0=ruleAnswer		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getClosedQuestionRule());
	        }
       		add(
       			$current, 
       			"answers",
        		lv_answers_8_0, 
        		"Answer");
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_9=']' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getClosedQuestionAccess().getRightSquareBracketKeyword_7());
    }
(	otherlv_10='default answer is' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getClosedQuestionAccess().getDefaultAnswerIsKeyword_8_0());
    }
(
(
		lv_default_11_0=RULE_STRING
		{
			newLeafNode(lv_default_11_0, grammarAccess.getClosedQuestionAccess().getDefaultSTRINGTerminalRuleCall_8_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getClosedQuestionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"default",
        		lv_default_11_0, 
        		"STRING");
	    }

)
))?)
;





// Entry rule entryRuleLikertQuestion
entryRuleLikertQuestion returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getLikertQuestionRule()); }
	 iv_ruleLikertQuestion=ruleLikertQuestion 
	 { $current=$iv_ruleLikertQuestion.current; } 
	 EOF 
;

// Rule LikertQuestion
ruleLikertQuestion returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='likert question' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getLikertQuestionAccess().getLikertQuestionKeyword_0());
    }
(
(
		lv_name_1_0=RULE_STRING
		{
			newLeafNode(lv_name_1_0, grammarAccess.getLikertQuestionAccess().getNameSTRINGTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getLikertQuestionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"STRING");
	    }

)
)	otherlv_2='(' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getLikertQuestionAccess().getLeftParenthesisKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getLikertQuestionAccess().getFromSINTParserRuleCall_3_0()); 
	    }
		lv_from_3_0=ruleSINT		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getLikertQuestionRule());
	        }
       		set(
       			$current, 
       			"from",
        		lv_from_3_0, 
        		"SINT");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_4='..' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getLikertQuestionAccess().getFullStopFullStopKeyword_4());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getLikertQuestionAccess().getToSINTParserRuleCall_5_0()); 
	    }
		lv_to_5_0=ruleSINT		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getLikertQuestionRule());
	        }
       		set(
       			$current, 
       			"to",
        		lv_to_5_0, 
        		"SINT");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_6=')' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getLikertQuestionAccess().getRightParenthesisKeyword_6());
    }
)
;





// Entry rule entryRuleAnswer
entryRuleAnswer returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAnswerRule()); }
	 iv_ruleAnswer=ruleAnswer 
	 { $current=$iv_ruleAnswer.current; } 
	 EOF 
;

// Rule Answer
ruleAnswer returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    { 
        newCompositeNode(grammarAccess.getAnswerAccess().getSimpleAnswerParserRuleCall_0_0()); 
    }
    this_SimpleAnswer_0=ruleSimpleAnswer
    { 
        $current = $this_SimpleAnswer_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getAnswerAccess().getInputAnswerParserRuleCall_0_1()); 
    }
    this_InputAnswer_1=ruleInputAnswer
    { 
        $current = $this_InputAnswer_1.current; 
        afterParserOrEnumRuleCall();
    }
)(
(
		{ 
	        newCompositeNode(grammarAccess.getAnswerAccess().getEnablesEnablesQuestionParserRuleCall_1_0()); 
	    }
		lv_enables_2_0=ruleEnablesQuestion		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAnswerRule());
	        }
       		set(
       			$current, 
       			"enables",
        		lv_enables_2_0, 
        		"EnablesQuestion");
	        afterParserOrEnumRuleCall();
	    }

)
)?)
;





// Entry rule entryRuleSimpleAnswer
entryRuleSimpleAnswer returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getSimpleAnswerRule()); }
	 iv_ruleSimpleAnswer=ruleSimpleAnswer 
	 { $current=$iv_ruleSimpleAnswer.current; } 
	 EOF 
;

// Rule SimpleAnswer
ruleSimpleAnswer returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		lv_name_0_0=RULE_STRING
		{
			newLeafNode(lv_name_0_0, grammarAccess.getSimpleAnswerAccess().getNameSTRINGTerminalRuleCall_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getSimpleAnswerRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_0_0, 
        		"STRING");
	    }

)
)
;





// Entry rule entryRuleInputAnswer
entryRuleInputAnswer returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getInputAnswerRule()); }
	 iv_ruleInputAnswer=ruleInputAnswer 
	 { $current=$iv_ruleInputAnswer.current; } 
	 EOF 
;

// Rule InputAnswer
ruleInputAnswer returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_name_0_0=RULE_STRING
		{
			newLeafNode(lv_name_0_0, grammarAccess.getInputAnswerAccess().getNameSTRINGTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getInputAnswerRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_0_0, 
        		"STRING");
	    }

)
)	otherlv_1='...' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getInputAnswerAccess().getFullStopFullStopFullStopKeyword_1());
    }
)
;





// Entry rule entryRuleEnablesQuestion
entryRuleEnablesQuestion returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getEnablesQuestionRule()); }
	 iv_ruleEnablesQuestion=ruleEnablesQuestion 
	 { $current=$iv_ruleEnablesQuestion.current; } 
	 EOF 
;

// Rule EnablesQuestion
ruleEnablesQuestion returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='enables question' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getEnablesQuestionAccess().getEnablesQuestionKeyword_0());
    }
	otherlv_1='[' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getEnablesQuestionAccess().getLeftSquareBracketKeyword_1());
    }
(
(
		lv_name_2_0=RULE_STRING
		{
			newLeafNode(lv_name_2_0, grammarAccess.getEnablesQuestionAccess().getNameSTRINGTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getEnablesQuestionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"STRING");
	    }

)
)	otherlv_3=']' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getEnablesQuestionAccess().getRightSquareBracketKeyword_3());
    }
)
;





// Entry rule entryRuleSINT
entryRuleSINT returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getSINTRule()); } 
	 iv_ruleSINT=ruleSINT 
	 { $current=$iv_ruleSINT.current.getText(); }  
	 EOF 
;

// Rule SINT
ruleSINT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
	kw='-' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getSINTAccess().getHyphenMinusKeyword_0()); 
    }
)?    this_INT_1=RULE_INT    {
		$current.merge(this_INT_1);
    }

    { 
    newLeafNode(this_INT_1, grammarAccess.getSINTAccess().getINTTerminalRuleCall_1()); 
    }
)
    ;





RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


