package at.ac.tuwien.big.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import at.ac.tuwien.big.services.QuestionnaireGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalQuestionnaireParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_SINT", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'mandatory'", "'multiline'", "'single answer'", "'multiple answers'", "'questionnaire'", "'['", "']'", "','", "'group'", "'open question'", "'closed question allowing'", "'answers'", "'default answer is'", "'likert question'", "'('", "'..'", "')'", "'...'", "'enabled question'"
    };
    public static final int RULE_ID=7;
    public static final int T__29=29;
    public static final int RULE_SINT=5;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int RULE_STRING=4;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=10;

    // delegates
    // delegators


        public InternalQuestionnaireParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalQuestionnaireParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalQuestionnaireParser.tokenNames; }
    public String getGrammarFileName() { return "../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g"; }


     
     	private QuestionnaireGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(QuestionnaireGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleQuestionnaire"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:60:1: entryRuleQuestionnaire : ruleQuestionnaire EOF ;
    public final void entryRuleQuestionnaire() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:61:1: ( ruleQuestionnaire EOF )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:62:1: ruleQuestionnaire EOF
            {
             before(grammarAccess.getQuestionnaireRule()); 
            pushFollow(FOLLOW_ruleQuestionnaire_in_entryRuleQuestionnaire61);
            ruleQuestionnaire();

            state._fsp--;

             after(grammarAccess.getQuestionnaireRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuestionnaire68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQuestionnaire"


    // $ANTLR start "ruleQuestionnaire"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:69:1: ruleQuestionnaire : ( ( rule__Questionnaire__Group__0 ) ) ;
    public final void ruleQuestionnaire() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:73:2: ( ( ( rule__Questionnaire__Group__0 ) ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:74:1: ( ( rule__Questionnaire__Group__0 ) )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:74:1: ( ( rule__Questionnaire__Group__0 ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:75:1: ( rule__Questionnaire__Group__0 )
            {
             before(grammarAccess.getQuestionnaireAccess().getGroup()); 
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:76:1: ( rule__Questionnaire__Group__0 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:76:2: rule__Questionnaire__Group__0
            {
            pushFollow(FOLLOW_rule__Questionnaire__Group__0_in_ruleQuestionnaire94);
            rule__Questionnaire__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQuestionnaireAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuestionnaire"


    // $ANTLR start "entryRuleGroup"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:88:1: entryRuleGroup : ruleGroup EOF ;
    public final void entryRuleGroup() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:89:1: ( ruleGroup EOF )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:90:1: ruleGroup EOF
            {
             before(grammarAccess.getGroupRule()); 
            pushFollow(FOLLOW_ruleGroup_in_entryRuleGroup121);
            ruleGroup();

            state._fsp--;

             after(grammarAccess.getGroupRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGroup128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGroup"


    // $ANTLR start "ruleGroup"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:97:1: ruleGroup : ( ( rule__Group__Group__0 ) ) ;
    public final void ruleGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:101:2: ( ( ( rule__Group__Group__0 ) ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:102:1: ( ( rule__Group__Group__0 ) )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:102:1: ( ( rule__Group__Group__0 ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:103:1: ( rule__Group__Group__0 )
            {
             before(grammarAccess.getGroupAccess().getGroup()); 
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:104:1: ( rule__Group__Group__0 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:104:2: rule__Group__Group__0
            {
            pushFollow(FOLLOW_rule__Group__Group__0_in_ruleGroup154);
            rule__Group__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGroupAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGroup"


    // $ANTLR start "entryRuleQuestion"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:116:1: entryRuleQuestion : ruleQuestion EOF ;
    public final void entryRuleQuestion() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:117:1: ( ruleQuestion EOF )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:118:1: ruleQuestion EOF
            {
             before(grammarAccess.getQuestionRule()); 
            pushFollow(FOLLOW_ruleQuestion_in_entryRuleQuestion181);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getQuestionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuestion188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQuestion"


    // $ANTLR start "ruleQuestion"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:125:1: ruleQuestion : ( ( rule__Question__Alternatives ) ) ;
    public final void ruleQuestion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:129:2: ( ( ( rule__Question__Alternatives ) ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:130:1: ( ( rule__Question__Alternatives ) )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:130:1: ( ( rule__Question__Alternatives ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:131:1: ( rule__Question__Alternatives )
            {
             before(grammarAccess.getQuestionAccess().getAlternatives()); 
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:132:1: ( rule__Question__Alternatives )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:132:2: rule__Question__Alternatives
            {
            pushFollow(FOLLOW_rule__Question__Alternatives_in_ruleQuestion214);
            rule__Question__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuestion"


    // $ANTLR start "entryRuleOpenQuestion"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:144:1: entryRuleOpenQuestion : ruleOpenQuestion EOF ;
    public final void entryRuleOpenQuestion() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:145:1: ( ruleOpenQuestion EOF )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:146:1: ruleOpenQuestion EOF
            {
             before(grammarAccess.getOpenQuestionRule()); 
            pushFollow(FOLLOW_ruleOpenQuestion_in_entryRuleOpenQuestion241);
            ruleOpenQuestion();

            state._fsp--;

             after(grammarAccess.getOpenQuestionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpenQuestion248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOpenQuestion"


    // $ANTLR start "ruleOpenQuestion"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:153:1: ruleOpenQuestion : ( ( rule__OpenQuestion__Group__0 ) ) ;
    public final void ruleOpenQuestion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:157:2: ( ( ( rule__OpenQuestion__Group__0 ) ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:158:1: ( ( rule__OpenQuestion__Group__0 ) )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:158:1: ( ( rule__OpenQuestion__Group__0 ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:159:1: ( rule__OpenQuestion__Group__0 )
            {
             before(grammarAccess.getOpenQuestionAccess().getGroup()); 
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:160:1: ( rule__OpenQuestion__Group__0 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:160:2: rule__OpenQuestion__Group__0
            {
            pushFollow(FOLLOW_rule__OpenQuestion__Group__0_in_ruleOpenQuestion274);
            rule__OpenQuestion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOpenQuestionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOpenQuestion"


    // $ANTLR start "entryRuleClosedQuestion"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:172:1: entryRuleClosedQuestion : ruleClosedQuestion EOF ;
    public final void entryRuleClosedQuestion() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:173:1: ( ruleClosedQuestion EOF )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:174:1: ruleClosedQuestion EOF
            {
             before(grammarAccess.getClosedQuestionRule()); 
            pushFollow(FOLLOW_ruleClosedQuestion_in_entryRuleClosedQuestion301);
            ruleClosedQuestion();

            state._fsp--;

             after(grammarAccess.getClosedQuestionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClosedQuestion308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleClosedQuestion"


    // $ANTLR start "ruleClosedQuestion"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:181:1: ruleClosedQuestion : ( ( rule__ClosedQuestion__Group__0 ) ) ;
    public final void ruleClosedQuestion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:185:2: ( ( ( rule__ClosedQuestion__Group__0 ) ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:186:1: ( ( rule__ClosedQuestion__Group__0 ) )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:186:1: ( ( rule__ClosedQuestion__Group__0 ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:187:1: ( rule__ClosedQuestion__Group__0 )
            {
             before(grammarAccess.getClosedQuestionAccess().getGroup()); 
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:188:1: ( rule__ClosedQuestion__Group__0 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:188:2: rule__ClosedQuestion__Group__0
            {
            pushFollow(FOLLOW_rule__ClosedQuestion__Group__0_in_ruleClosedQuestion334);
            rule__ClosedQuestion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClosedQuestionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClosedQuestion"


    // $ANTLR start "entryRuleLikertQuestion"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:200:1: entryRuleLikertQuestion : ruleLikertQuestion EOF ;
    public final void entryRuleLikertQuestion() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:201:1: ( ruleLikertQuestion EOF )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:202:1: ruleLikertQuestion EOF
            {
             before(grammarAccess.getLikertQuestionRule()); 
            pushFollow(FOLLOW_ruleLikertQuestion_in_entryRuleLikertQuestion361);
            ruleLikertQuestion();

            state._fsp--;

             after(grammarAccess.getLikertQuestionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLikertQuestion368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLikertQuestion"


    // $ANTLR start "ruleLikertQuestion"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:209:1: ruleLikertQuestion : ( ( rule__LikertQuestion__Group__0 ) ) ;
    public final void ruleLikertQuestion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:213:2: ( ( ( rule__LikertQuestion__Group__0 ) ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:214:1: ( ( rule__LikertQuestion__Group__0 ) )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:214:1: ( ( rule__LikertQuestion__Group__0 ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:215:1: ( rule__LikertQuestion__Group__0 )
            {
             before(grammarAccess.getLikertQuestionAccess().getGroup()); 
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:216:1: ( rule__LikertQuestion__Group__0 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:216:2: rule__LikertQuestion__Group__0
            {
            pushFollow(FOLLOW_rule__LikertQuestion__Group__0_in_ruleLikertQuestion394);
            rule__LikertQuestion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLikertQuestionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLikertQuestion"


    // $ANTLR start "entryRuleAnswer"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:228:1: entryRuleAnswer : ruleAnswer EOF ;
    public final void entryRuleAnswer() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:229:1: ( ruleAnswer EOF )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:230:1: ruleAnswer EOF
            {
             before(grammarAccess.getAnswerRule()); 
            pushFollow(FOLLOW_ruleAnswer_in_entryRuleAnswer421);
            ruleAnswer();

            state._fsp--;

             after(grammarAccess.getAnswerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnswer428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAnswer"


    // $ANTLR start "ruleAnswer"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:237:1: ruleAnswer : ( ( rule__Answer__Group__0 ) ) ;
    public final void ruleAnswer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:241:2: ( ( ( rule__Answer__Group__0 ) ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:242:1: ( ( rule__Answer__Group__0 ) )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:242:1: ( ( rule__Answer__Group__0 ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:243:1: ( rule__Answer__Group__0 )
            {
             before(grammarAccess.getAnswerAccess().getGroup()); 
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:244:1: ( rule__Answer__Group__0 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:244:2: rule__Answer__Group__0
            {
            pushFollow(FOLLOW_rule__Answer__Group__0_in_ruleAnswer454);
            rule__Answer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAnswerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnswer"


    // $ANTLR start "entryRuleSimpleAnswer"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:256:1: entryRuleSimpleAnswer : ruleSimpleAnswer EOF ;
    public final void entryRuleSimpleAnswer() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:257:1: ( ruleSimpleAnswer EOF )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:258:1: ruleSimpleAnswer EOF
            {
             before(grammarAccess.getSimpleAnswerRule()); 
            pushFollow(FOLLOW_ruleSimpleAnswer_in_entryRuleSimpleAnswer481);
            ruleSimpleAnswer();

            state._fsp--;

             after(grammarAccess.getSimpleAnswerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleAnswer488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSimpleAnswer"


    // $ANTLR start "ruleSimpleAnswer"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:265:1: ruleSimpleAnswer : ( ( rule__SimpleAnswer__NameAssignment ) ) ;
    public final void ruleSimpleAnswer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:269:2: ( ( ( rule__SimpleAnswer__NameAssignment ) ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:270:1: ( ( rule__SimpleAnswer__NameAssignment ) )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:270:1: ( ( rule__SimpleAnswer__NameAssignment ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:271:1: ( rule__SimpleAnswer__NameAssignment )
            {
             before(grammarAccess.getSimpleAnswerAccess().getNameAssignment()); 
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:272:1: ( rule__SimpleAnswer__NameAssignment )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:272:2: rule__SimpleAnswer__NameAssignment
            {
            pushFollow(FOLLOW_rule__SimpleAnswer__NameAssignment_in_ruleSimpleAnswer514);
            rule__SimpleAnswer__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getSimpleAnswerAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSimpleAnswer"


    // $ANTLR start "entryRuleInputAnswer"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:284:1: entryRuleInputAnswer : ruleInputAnswer EOF ;
    public final void entryRuleInputAnswer() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:285:1: ( ruleInputAnswer EOF )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:286:1: ruleInputAnswer EOF
            {
             before(grammarAccess.getInputAnswerRule()); 
            pushFollow(FOLLOW_ruleInputAnswer_in_entryRuleInputAnswer541);
            ruleInputAnswer();

            state._fsp--;

             after(grammarAccess.getInputAnswerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInputAnswer548); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInputAnswer"


    // $ANTLR start "ruleInputAnswer"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:293:1: ruleInputAnswer : ( ( rule__InputAnswer__Group__0 ) ) ;
    public final void ruleInputAnswer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:297:2: ( ( ( rule__InputAnswer__Group__0 ) ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:298:1: ( ( rule__InputAnswer__Group__0 ) )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:298:1: ( ( rule__InputAnswer__Group__0 ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:299:1: ( rule__InputAnswer__Group__0 )
            {
             before(grammarAccess.getInputAnswerAccess().getGroup()); 
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:300:1: ( rule__InputAnswer__Group__0 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:300:2: rule__InputAnswer__Group__0
            {
            pushFollow(FOLLOW_rule__InputAnswer__Group__0_in_ruleInputAnswer574);
            rule__InputAnswer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInputAnswerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInputAnswer"


    // $ANTLR start "entryRuleEnablesQuestion"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:312:1: entryRuleEnablesQuestion : ruleEnablesQuestion EOF ;
    public final void entryRuleEnablesQuestion() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:313:1: ( ruleEnablesQuestion EOF )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:314:1: ruleEnablesQuestion EOF
            {
             before(grammarAccess.getEnablesQuestionRule()); 
            pushFollow(FOLLOW_ruleEnablesQuestion_in_entryRuleEnablesQuestion601);
            ruleEnablesQuestion();

            state._fsp--;

             after(grammarAccess.getEnablesQuestionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnablesQuestion608); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnablesQuestion"


    // $ANTLR start "ruleEnablesQuestion"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:321:1: ruleEnablesQuestion : ( ( rule__EnablesQuestion__Group__0 ) ) ;
    public final void ruleEnablesQuestion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:325:2: ( ( ( rule__EnablesQuestion__Group__0 ) ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:326:1: ( ( rule__EnablesQuestion__Group__0 ) )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:326:1: ( ( rule__EnablesQuestion__Group__0 ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:327:1: ( rule__EnablesQuestion__Group__0 )
            {
             before(grammarAccess.getEnablesQuestionAccess().getGroup()); 
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:328:1: ( rule__EnablesQuestion__Group__0 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:328:2: rule__EnablesQuestion__Group__0
            {
            pushFollow(FOLLOW_rule__EnablesQuestion__Group__0_in_ruleEnablesQuestion634);
            rule__EnablesQuestion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnablesQuestionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnablesQuestion"


    // $ANTLR start "rule__Question__Alternatives"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:340:1: rule__Question__Alternatives : ( ( ruleOpenQuestion ) | ( ruleClosedQuestion ) | ( ruleLikertQuestion ) );
    public final void rule__Question__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:344:1: ( ( ruleOpenQuestion ) | ( ruleClosedQuestion ) | ( ruleLikertQuestion ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 12:
            case 13:
            case 21:
                {
                alt1=1;
                }
                break;
            case 22:
                {
                alt1=2;
                }
                break;
            case 25:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:345:1: ( ruleOpenQuestion )
                    {
                    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:345:1: ( ruleOpenQuestion )
                    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:346:1: ruleOpenQuestion
                    {
                     before(grammarAccess.getQuestionAccess().getOpenQuestionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleOpenQuestion_in_rule__Question__Alternatives670);
                    ruleOpenQuestion();

                    state._fsp--;

                     after(grammarAccess.getQuestionAccess().getOpenQuestionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:351:6: ( ruleClosedQuestion )
                    {
                    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:351:6: ( ruleClosedQuestion )
                    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:352:1: ruleClosedQuestion
                    {
                     before(grammarAccess.getQuestionAccess().getClosedQuestionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleClosedQuestion_in_rule__Question__Alternatives687);
                    ruleClosedQuestion();

                    state._fsp--;

                     after(grammarAccess.getQuestionAccess().getClosedQuestionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:357:6: ( ruleLikertQuestion )
                    {
                    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:357:6: ( ruleLikertQuestion )
                    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:358:1: ruleLikertQuestion
                    {
                     before(grammarAccess.getQuestionAccess().getLikertQuestionParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleLikertQuestion_in_rule__Question__Alternatives704);
                    ruleLikertQuestion();

                    state._fsp--;

                     after(grammarAccess.getQuestionAccess().getLikertQuestionParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Alternatives"


    // $ANTLR start "rule__OpenQuestion__Alternatives_0"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:368:1: rule__OpenQuestion__Alternatives_0 : ( ( 'mandatory' ) | ( 'multiline' ) );
    public final void rule__OpenQuestion__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:372:1: ( ( 'mandatory' ) | ( 'multiline' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            else if ( (LA2_0==13) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:373:1: ( 'mandatory' )
                    {
                    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:373:1: ( 'mandatory' )
                    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:374:1: 'mandatory'
                    {
                     before(grammarAccess.getOpenQuestionAccess().getMandatoryKeyword_0_0()); 
                    match(input,12,FOLLOW_12_in_rule__OpenQuestion__Alternatives_0737); 
                     after(grammarAccess.getOpenQuestionAccess().getMandatoryKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:381:6: ( 'multiline' )
                    {
                    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:381:6: ( 'multiline' )
                    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:382:1: 'multiline'
                    {
                     before(grammarAccess.getOpenQuestionAccess().getMultilineKeyword_0_1()); 
                    match(input,13,FOLLOW_13_in_rule__OpenQuestion__Alternatives_0757); 
                     after(grammarAccess.getOpenQuestionAccess().getMultilineKeyword_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpenQuestion__Alternatives_0"


    // $ANTLR start "rule__ClosedQuestion__Alternatives_1"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:394:1: rule__ClosedQuestion__Alternatives_1 : ( ( 'single answer' ) | ( 'multiple answers' ) );
    public final void rule__ClosedQuestion__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:398:1: ( ( 'single answer' ) | ( 'multiple answers' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            else if ( (LA3_0==15) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:399:1: ( 'single answer' )
                    {
                    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:399:1: ( 'single answer' )
                    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:400:1: 'single answer'
                    {
                     before(grammarAccess.getClosedQuestionAccess().getSingleAnswerKeyword_1_0()); 
                    match(input,14,FOLLOW_14_in_rule__ClosedQuestion__Alternatives_1792); 
                     after(grammarAccess.getClosedQuestionAccess().getSingleAnswerKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:407:6: ( 'multiple answers' )
                    {
                    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:407:6: ( 'multiple answers' )
                    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:408:1: 'multiple answers'
                    {
                     before(grammarAccess.getClosedQuestionAccess().getMultipleAnswersKeyword_1_1()); 
                    match(input,15,FOLLOW_15_in_rule__ClosedQuestion__Alternatives_1812); 
                     after(grammarAccess.getClosedQuestionAccess().getMultipleAnswersKeyword_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClosedQuestion__Alternatives_1"


    // $ANTLR start "rule__Answer__Alternatives_0"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:420:1: rule__Answer__Alternatives_0 : ( ( ruleSimpleAnswer ) | ( ruleInputAnswer ) );
    public final void rule__Answer__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:424:1: ( ( ruleSimpleAnswer ) | ( ruleInputAnswer ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==29) ) {
                    alt4=2;
                }
                else if ( (LA4_1==EOF||(LA4_1>=18 && LA4_1<=19)||LA4_1==30) ) {
                    alt4=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:425:1: ( ruleSimpleAnswer )
                    {
                    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:425:1: ( ruleSimpleAnswer )
                    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:426:1: ruleSimpleAnswer
                    {
                     before(grammarAccess.getAnswerAccess().getSimpleAnswerParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_ruleSimpleAnswer_in_rule__Answer__Alternatives_0846);
                    ruleSimpleAnswer();

                    state._fsp--;

                     after(grammarAccess.getAnswerAccess().getSimpleAnswerParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:431:6: ( ruleInputAnswer )
                    {
                    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:431:6: ( ruleInputAnswer )
                    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:432:1: ruleInputAnswer
                    {
                     before(grammarAccess.getAnswerAccess().getInputAnswerParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_ruleInputAnswer_in_rule__Answer__Alternatives_0863);
                    ruleInputAnswer();

                    state._fsp--;

                     after(grammarAccess.getAnswerAccess().getInputAnswerParserRuleCall_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Answer__Alternatives_0"


    // $ANTLR start "rule__Questionnaire__Group__0"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:444:1: rule__Questionnaire__Group__0 : rule__Questionnaire__Group__0__Impl rule__Questionnaire__Group__1 ;
    public final void rule__Questionnaire__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:448:1: ( rule__Questionnaire__Group__0__Impl rule__Questionnaire__Group__1 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:449:2: rule__Questionnaire__Group__0__Impl rule__Questionnaire__Group__1
            {
            pushFollow(FOLLOW_rule__Questionnaire__Group__0__Impl_in_rule__Questionnaire__Group__0893);
            rule__Questionnaire__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Questionnaire__Group__1_in_rule__Questionnaire__Group__0896);
            rule__Questionnaire__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Questionnaire__Group__0"


    // $ANTLR start "rule__Questionnaire__Group__0__Impl"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:456:1: rule__Questionnaire__Group__0__Impl : ( 'questionnaire' ) ;
    public final void rule__Questionnaire__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:460:1: ( ( 'questionnaire' ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:461:1: ( 'questionnaire' )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:461:1: ( 'questionnaire' )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:462:1: 'questionnaire'
            {
             before(grammarAccess.getQuestionnaireAccess().getQuestionnaireKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__Questionnaire__Group__0__Impl924); 
             after(grammarAccess.getQuestionnaireAccess().getQuestionnaireKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Questionnaire__Group__0__Impl"


    // $ANTLR start "rule__Questionnaire__Group__1"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:475:1: rule__Questionnaire__Group__1 : rule__Questionnaire__Group__1__Impl rule__Questionnaire__Group__2 ;
    public final void rule__Questionnaire__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:479:1: ( rule__Questionnaire__Group__1__Impl rule__Questionnaire__Group__2 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:480:2: rule__Questionnaire__Group__1__Impl rule__Questionnaire__Group__2
            {
            pushFollow(FOLLOW_rule__Questionnaire__Group__1__Impl_in_rule__Questionnaire__Group__1955);
            rule__Questionnaire__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Questionnaire__Group__2_in_rule__Questionnaire__Group__1958);
            rule__Questionnaire__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Questionnaire__Group__1"


    // $ANTLR start "rule__Questionnaire__Group__1__Impl"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:487:1: rule__Questionnaire__Group__1__Impl : ( ( rule__Questionnaire__NameAssignment_1 ) ) ;
    public final void rule__Questionnaire__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:491:1: ( ( ( rule__Questionnaire__NameAssignment_1 ) ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:492:1: ( ( rule__Questionnaire__NameAssignment_1 ) )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:492:1: ( ( rule__Questionnaire__NameAssignment_1 ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:493:1: ( rule__Questionnaire__NameAssignment_1 )
            {
             before(grammarAccess.getQuestionnaireAccess().getNameAssignment_1()); 
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:494:1: ( rule__Questionnaire__NameAssignment_1 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:494:2: rule__Questionnaire__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Questionnaire__NameAssignment_1_in_rule__Questionnaire__Group__1__Impl985);
            rule__Questionnaire__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionnaireAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Questionnaire__Group__1__Impl"


    // $ANTLR start "rule__Questionnaire__Group__2"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:504:1: rule__Questionnaire__Group__2 : rule__Questionnaire__Group__2__Impl rule__Questionnaire__Group__3 ;
    public final void rule__Questionnaire__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:508:1: ( rule__Questionnaire__Group__2__Impl rule__Questionnaire__Group__3 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:509:2: rule__Questionnaire__Group__2__Impl rule__Questionnaire__Group__3
            {
            pushFollow(FOLLOW_rule__Questionnaire__Group__2__Impl_in_rule__Questionnaire__Group__21015);
            rule__Questionnaire__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Questionnaire__Group__3_in_rule__Questionnaire__Group__21018);
            rule__Questionnaire__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Questionnaire__Group__2"


    // $ANTLR start "rule__Questionnaire__Group__2__Impl"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:516:1: rule__Questionnaire__Group__2__Impl : ( '[' ) ;
    public final void rule__Questionnaire__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:520:1: ( ( '[' ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:521:1: ( '[' )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:521:1: ( '[' )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:522:1: '['
            {
             before(grammarAccess.getQuestionnaireAccess().getLeftSquareBracketKeyword_2()); 
            match(input,17,FOLLOW_17_in_rule__Questionnaire__Group__2__Impl1046); 
             after(grammarAccess.getQuestionnaireAccess().getLeftSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Questionnaire__Group__2__Impl"


    // $ANTLR start "rule__Questionnaire__Group__3"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:535:1: rule__Questionnaire__Group__3 : rule__Questionnaire__Group__3__Impl rule__Questionnaire__Group__4 ;
    public final void rule__Questionnaire__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:539:1: ( rule__Questionnaire__Group__3__Impl rule__Questionnaire__Group__4 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:540:2: rule__Questionnaire__Group__3__Impl rule__Questionnaire__Group__4
            {
            pushFollow(FOLLOW_rule__Questionnaire__Group__3__Impl_in_rule__Questionnaire__Group__31077);
            rule__Questionnaire__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Questionnaire__Group__4_in_rule__Questionnaire__Group__31080);
            rule__Questionnaire__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Questionnaire__Group__3"


    // $ANTLR start "rule__Questionnaire__Group__3__Impl"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:547:1: rule__Questionnaire__Group__3__Impl : ( ( rule__Questionnaire__GroupsAssignment_3 ) ) ;
    public final void rule__Questionnaire__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:551:1: ( ( ( rule__Questionnaire__GroupsAssignment_3 ) ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:552:1: ( ( rule__Questionnaire__GroupsAssignment_3 ) )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:552:1: ( ( rule__Questionnaire__GroupsAssignment_3 ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:553:1: ( rule__Questionnaire__GroupsAssignment_3 )
            {
             before(grammarAccess.getQuestionnaireAccess().getGroupsAssignment_3()); 
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:554:1: ( rule__Questionnaire__GroupsAssignment_3 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:554:2: rule__Questionnaire__GroupsAssignment_3
            {
            pushFollow(FOLLOW_rule__Questionnaire__GroupsAssignment_3_in_rule__Questionnaire__Group__3__Impl1107);
            rule__Questionnaire__GroupsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getQuestionnaireAccess().getGroupsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Questionnaire__Group__3__Impl"


    // $ANTLR start "rule__Questionnaire__Group__4"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:564:1: rule__Questionnaire__Group__4 : rule__Questionnaire__Group__4__Impl rule__Questionnaire__Group__5 ;
    public final void rule__Questionnaire__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:568:1: ( rule__Questionnaire__Group__4__Impl rule__Questionnaire__Group__5 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:569:2: rule__Questionnaire__Group__4__Impl rule__Questionnaire__Group__5
            {
            pushFollow(FOLLOW_rule__Questionnaire__Group__4__Impl_in_rule__Questionnaire__Group__41137);
            rule__Questionnaire__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Questionnaire__Group__5_in_rule__Questionnaire__Group__41140);
            rule__Questionnaire__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Questionnaire__Group__4"


    // $ANTLR start "rule__Questionnaire__Group__4__Impl"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:576:1: rule__Questionnaire__Group__4__Impl : ( ( rule__Questionnaire__Group_4__0 )* ) ;
    public final void rule__Questionnaire__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:580:1: ( ( ( rule__Questionnaire__Group_4__0 )* ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:581:1: ( ( rule__Questionnaire__Group_4__0 )* )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:581:1: ( ( rule__Questionnaire__Group_4__0 )* )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:582:1: ( rule__Questionnaire__Group_4__0 )*
            {
             before(grammarAccess.getQuestionnaireAccess().getGroup_4()); 
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:583:1: ( rule__Questionnaire__Group_4__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:583:2: rule__Questionnaire__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Questionnaire__Group_4__0_in_rule__Questionnaire__Group__4__Impl1167);
            	    rule__Questionnaire__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getQuestionnaireAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Questionnaire__Group__4__Impl"


    // $ANTLR start "rule__Questionnaire__Group__5"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:593:1: rule__Questionnaire__Group__5 : rule__Questionnaire__Group__5__Impl ;
    public final void rule__Questionnaire__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:597:1: ( rule__Questionnaire__Group__5__Impl )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:598:2: rule__Questionnaire__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Questionnaire__Group__5__Impl_in_rule__Questionnaire__Group__51198);
            rule__Questionnaire__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Questionnaire__Group__5"


    // $ANTLR start "rule__Questionnaire__Group__5__Impl"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:604:1: rule__Questionnaire__Group__5__Impl : ( ']' ) ;
    public final void rule__Questionnaire__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:608:1: ( ( ']' ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:609:1: ( ']' )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:609:1: ( ']' )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:610:1: ']'
            {
             before(grammarAccess.getQuestionnaireAccess().getRightSquareBracketKeyword_5()); 
            match(input,18,FOLLOW_18_in_rule__Questionnaire__Group__5__Impl1226); 
             after(grammarAccess.getQuestionnaireAccess().getRightSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Questionnaire__Group__5__Impl"


    // $ANTLR start "rule__Questionnaire__Group_4__0"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:635:1: rule__Questionnaire__Group_4__0 : rule__Questionnaire__Group_4__0__Impl rule__Questionnaire__Group_4__1 ;
    public final void rule__Questionnaire__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:639:1: ( rule__Questionnaire__Group_4__0__Impl rule__Questionnaire__Group_4__1 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:640:2: rule__Questionnaire__Group_4__0__Impl rule__Questionnaire__Group_4__1
            {
            pushFollow(FOLLOW_rule__Questionnaire__Group_4__0__Impl_in_rule__Questionnaire__Group_4__01269);
            rule__Questionnaire__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Questionnaire__Group_4__1_in_rule__Questionnaire__Group_4__01272);
            rule__Questionnaire__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Questionnaire__Group_4__0"


    // $ANTLR start "rule__Questionnaire__Group_4__0__Impl"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:647:1: rule__Questionnaire__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Questionnaire__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:651:1: ( ( ',' ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:652:1: ( ',' )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:652:1: ( ',' )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:653:1: ','
            {
             before(grammarAccess.getQuestionnaireAccess().getCommaKeyword_4_0()); 
            match(input,19,FOLLOW_19_in_rule__Questionnaire__Group_4__0__Impl1300); 
             after(grammarAccess.getQuestionnaireAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Questionnaire__Group_4__0__Impl"


    // $ANTLR start "rule__Questionnaire__Group_4__1"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:666:1: rule__Questionnaire__Group_4__1 : rule__Questionnaire__Group_4__1__Impl ;
    public final void rule__Questionnaire__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:670:1: ( rule__Questionnaire__Group_4__1__Impl )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:671:2: rule__Questionnaire__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Questionnaire__Group_4__1__Impl_in_rule__Questionnaire__Group_4__11331);
            rule__Questionnaire__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Questionnaire__Group_4__1"


    // $ANTLR start "rule__Questionnaire__Group_4__1__Impl"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:677:1: rule__Questionnaire__Group_4__1__Impl : ( ( rule__Questionnaire__GroupsAssignment_4_1 ) ) ;
    public final void rule__Questionnaire__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:681:1: ( ( ( rule__Questionnaire__GroupsAssignment_4_1 ) ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:682:1: ( ( rule__Questionnaire__GroupsAssignment_4_1 ) )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:682:1: ( ( rule__Questionnaire__GroupsAssignment_4_1 ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:683:1: ( rule__Questionnaire__GroupsAssignment_4_1 )
            {
             before(grammarAccess.getQuestionnaireAccess().getGroupsAssignment_4_1()); 
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:684:1: ( rule__Questionnaire__GroupsAssignment_4_1 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:684:2: rule__Questionnaire__GroupsAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Questionnaire__GroupsAssignment_4_1_in_rule__Questionnaire__Group_4__1__Impl1358);
            rule__Questionnaire__GroupsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionnaireAccess().getGroupsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Questionnaire__Group_4__1__Impl"


    // $ANTLR start "rule__Group__Group__0"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:698:1: rule__Group__Group__0 : rule__Group__Group__0__Impl rule__Group__Group__1 ;
    public final void rule__Group__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:702:1: ( rule__Group__Group__0__Impl rule__Group__Group__1 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:703:2: rule__Group__Group__0__Impl rule__Group__Group__1
            {
            pushFollow(FOLLOW_rule__Group__Group__0__Impl_in_rule__Group__Group__01392);
            rule__Group__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Group__Group__1_in_rule__Group__Group__01395);
            rule__Group__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__0"


    // $ANTLR start "rule__Group__Group__0__Impl"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:710:1: rule__Group__Group__0__Impl : ( 'group' ) ;
    public final void rule__Group__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:714:1: ( ( 'group' ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:715:1: ( 'group' )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:715:1: ( 'group' )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:716:1: 'group'
            {
             before(grammarAccess.getGroupAccess().getGroupKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__Group__Group__0__Impl1423); 
             after(grammarAccess.getGroupAccess().getGroupKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__0__Impl"


    // $ANTLR start "rule__Group__Group__1"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:729:1: rule__Group__Group__1 : rule__Group__Group__1__Impl rule__Group__Group__2 ;
    public final void rule__Group__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:733:1: ( rule__Group__Group__1__Impl rule__Group__Group__2 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:734:2: rule__Group__Group__1__Impl rule__Group__Group__2
            {
            pushFollow(FOLLOW_rule__Group__Group__1__Impl_in_rule__Group__Group__11454);
            rule__Group__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Group__Group__2_in_rule__Group__Group__11457);
            rule__Group__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__1"


    // $ANTLR start "rule__Group__Group__1__Impl"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:741:1: rule__Group__Group__1__Impl : ( ( rule__Group__NameAssignment_1 ) ) ;
    public final void rule__Group__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:745:1: ( ( ( rule__Group__NameAssignment_1 ) ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:746:1: ( ( rule__Group__NameAssignment_1 ) )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:746:1: ( ( rule__Group__NameAssignment_1 ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:747:1: ( rule__Group__NameAssignment_1 )
            {
             before(grammarAccess.getGroupAccess().getNameAssignment_1()); 
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:748:1: ( rule__Group__NameAssignment_1 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:748:2: rule__Group__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Group__NameAssignment_1_in_rule__Group__Group__1__Impl1484);
            rule__Group__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGroupAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__1__Impl"


    // $ANTLR start "rule__Group__Group__2"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:758:1: rule__Group__Group__2 : rule__Group__Group__2__Impl rule__Group__Group__3 ;
    public final void rule__Group__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:762:1: ( rule__Group__Group__2__Impl rule__Group__Group__3 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:763:2: rule__Group__Group__2__Impl rule__Group__Group__3
            {
            pushFollow(FOLLOW_rule__Group__Group__2__Impl_in_rule__Group__Group__21514);
            rule__Group__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Group__Group__3_in_rule__Group__Group__21517);
            rule__Group__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__2"


    // $ANTLR start "rule__Group__Group__2__Impl"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:770:1: rule__Group__Group__2__Impl : ( '[' ) ;
    public final void rule__Group__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:774:1: ( ( '[' ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:775:1: ( '[' )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:775:1: ( '[' )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:776:1: '['
            {
             before(grammarAccess.getGroupAccess().getLeftSquareBracketKeyword_2()); 
            match(input,17,FOLLOW_17_in_rule__Group__Group__2__Impl1545); 
             after(grammarAccess.getGroupAccess().getLeftSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__2__Impl"


    // $ANTLR start "rule__Group__Group__3"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:789:1: rule__Group__Group__3 : rule__Group__Group__3__Impl rule__Group__Group__4 ;
    public final void rule__Group__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:793:1: ( rule__Group__Group__3__Impl rule__Group__Group__4 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:794:2: rule__Group__Group__3__Impl rule__Group__Group__4
            {
            pushFollow(FOLLOW_rule__Group__Group__3__Impl_in_rule__Group__Group__31576);
            rule__Group__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Group__Group__4_in_rule__Group__Group__31579);
            rule__Group__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__3"


    // $ANTLR start "rule__Group__Group__3__Impl"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:801:1: rule__Group__Group__3__Impl : ( ( rule__Group__QuestionsAssignment_3 ) ) ;
    public final void rule__Group__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:805:1: ( ( ( rule__Group__QuestionsAssignment_3 ) ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:806:1: ( ( rule__Group__QuestionsAssignment_3 ) )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:806:1: ( ( rule__Group__QuestionsAssignment_3 ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:807:1: ( rule__Group__QuestionsAssignment_3 )
            {
             before(grammarAccess.getGroupAccess().getQuestionsAssignment_3()); 
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:808:1: ( rule__Group__QuestionsAssignment_3 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:808:2: rule__Group__QuestionsAssignment_3
            {
            pushFollow(FOLLOW_rule__Group__QuestionsAssignment_3_in_rule__Group__Group__3__Impl1606);
            rule__Group__QuestionsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getGroupAccess().getQuestionsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__3__Impl"


    // $ANTLR start "rule__Group__Group__4"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:818:1: rule__Group__Group__4 : rule__Group__Group__4__Impl rule__Group__Group__5 ;
    public final void rule__Group__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:822:1: ( rule__Group__Group__4__Impl rule__Group__Group__5 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:823:2: rule__Group__Group__4__Impl rule__Group__Group__5
            {
            pushFollow(FOLLOW_rule__Group__Group__4__Impl_in_rule__Group__Group__41636);
            rule__Group__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Group__Group__5_in_rule__Group__Group__41639);
            rule__Group__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__4"


    // $ANTLR start "rule__Group__Group__4__Impl"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:830:1: rule__Group__Group__4__Impl : ( ( rule__Group__Group_4__0 )* ) ;
    public final void rule__Group__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:834:1: ( ( ( rule__Group__Group_4__0 )* ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:835:1: ( ( rule__Group__Group_4__0 )* )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:835:1: ( ( rule__Group__Group_4__0 )* )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:836:1: ( rule__Group__Group_4__0 )*
            {
             before(grammarAccess.getGroupAccess().getGroup_4()); 
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:837:1: ( rule__Group__Group_4__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:837:2: rule__Group__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Group__Group_4__0_in_rule__Group__Group__4__Impl1666);
            	    rule__Group__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getGroupAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__4__Impl"


    // $ANTLR start "rule__Group__Group__5"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:847:1: rule__Group__Group__5 : rule__Group__Group__5__Impl ;
    public final void rule__Group__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:851:1: ( rule__Group__Group__5__Impl )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:852:2: rule__Group__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Group__Group__5__Impl_in_rule__Group__Group__51697);
            rule__Group__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__5"


    // $ANTLR start "rule__Group__Group__5__Impl"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:858:1: rule__Group__Group__5__Impl : ( ']' ) ;
    public final void rule__Group__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:862:1: ( ( ']' ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:863:1: ( ']' )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:863:1: ( ']' )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:864:1: ']'
            {
             before(grammarAccess.getGroupAccess().getRightSquareBracketKeyword_5()); 
            match(input,18,FOLLOW_18_in_rule__Group__Group__5__Impl1725); 
             after(grammarAccess.getGroupAccess().getRightSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__5__Impl"


    // $ANTLR start "rule__Group__Group_4__0"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:889:1: rule__Group__Group_4__0 : rule__Group__Group_4__0__Impl rule__Group__Group_4__1 ;
    public final void rule__Group__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:893:1: ( rule__Group__Group_4__0__Impl rule__Group__Group_4__1 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:894:2: rule__Group__Group_4__0__Impl rule__Group__Group_4__1
            {
            pushFollow(FOLLOW_rule__Group__Group_4__0__Impl_in_rule__Group__Group_4__01768);
            rule__Group__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Group__Group_4__1_in_rule__Group__Group_4__01771);
            rule__Group__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_4__0"


    // $ANTLR start "rule__Group__Group_4__0__Impl"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:901:1: rule__Group__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Group__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:905:1: ( ( ',' ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:906:1: ( ',' )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:906:1: ( ',' )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:907:1: ','
            {
             before(grammarAccess.getGroupAccess().getCommaKeyword_4_0()); 
            match(input,19,FOLLOW_19_in_rule__Group__Group_4__0__Impl1799); 
             after(grammarAccess.getGroupAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_4__0__Impl"


    // $ANTLR start "rule__Group__Group_4__1"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:920:1: rule__Group__Group_4__1 : rule__Group__Group_4__1__Impl ;
    public final void rule__Group__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:924:1: ( rule__Group__Group_4__1__Impl )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:925:2: rule__Group__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Group__Group_4__1__Impl_in_rule__Group__Group_4__11830);
            rule__Group__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_4__1"


    // $ANTLR start "rule__Group__Group_4__1__Impl"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:931:1: rule__Group__Group_4__1__Impl : ( ( rule__Group__QuestionsAssignment_4_1 ) ) ;
    public final void rule__Group__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:935:1: ( ( ( rule__Group__QuestionsAssignment_4_1 ) ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:936:1: ( ( rule__Group__QuestionsAssignment_4_1 ) )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:936:1: ( ( rule__Group__QuestionsAssignment_4_1 ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:937:1: ( rule__Group__QuestionsAssignment_4_1 )
            {
             before(grammarAccess.getGroupAccess().getQuestionsAssignment_4_1()); 
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:938:1: ( rule__Group__QuestionsAssignment_4_1 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:938:2: rule__Group__QuestionsAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Group__QuestionsAssignment_4_1_in_rule__Group__Group_4__1__Impl1857);
            rule__Group__QuestionsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getGroupAccess().getQuestionsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_4__1__Impl"


    // $ANTLR start "rule__OpenQuestion__Group__0"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:952:1: rule__OpenQuestion__Group__0 : rule__OpenQuestion__Group__0__Impl rule__OpenQuestion__Group__1 ;
    public final void rule__OpenQuestion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:956:1: ( rule__OpenQuestion__Group__0__Impl rule__OpenQuestion__Group__1 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:957:2: rule__OpenQuestion__Group__0__Impl rule__OpenQuestion__Group__1
            {
            pushFollow(FOLLOW_rule__OpenQuestion__Group__0__Impl_in_rule__OpenQuestion__Group__01891);
            rule__OpenQuestion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OpenQuestion__Group__1_in_rule__OpenQuestion__Group__01894);
            rule__OpenQuestion__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpenQuestion__Group__0"


    // $ANTLR start "rule__OpenQuestion__Group__0__Impl"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:964:1: rule__OpenQuestion__Group__0__Impl : ( ( rule__OpenQuestion__Alternatives_0 )? ) ;
    public final void rule__OpenQuestion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:968:1: ( ( ( rule__OpenQuestion__Alternatives_0 )? ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:969:1: ( ( rule__OpenQuestion__Alternatives_0 )? )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:969:1: ( ( rule__OpenQuestion__Alternatives_0 )? )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:970:1: ( rule__OpenQuestion__Alternatives_0 )?
            {
             before(grammarAccess.getOpenQuestionAccess().getAlternatives_0()); 
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:971:1: ( rule__OpenQuestion__Alternatives_0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=12 && LA7_0<=13)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:971:2: rule__OpenQuestion__Alternatives_0
                    {
                    pushFollow(FOLLOW_rule__OpenQuestion__Alternatives_0_in_rule__OpenQuestion__Group__0__Impl1921);
                    rule__OpenQuestion__Alternatives_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOpenQuestionAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpenQuestion__Group__0__Impl"


    // $ANTLR start "rule__OpenQuestion__Group__1"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:981:1: rule__OpenQuestion__Group__1 : rule__OpenQuestion__Group__1__Impl rule__OpenQuestion__Group__2 ;
    public final void rule__OpenQuestion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:985:1: ( rule__OpenQuestion__Group__1__Impl rule__OpenQuestion__Group__2 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:986:2: rule__OpenQuestion__Group__1__Impl rule__OpenQuestion__Group__2
            {
            pushFollow(FOLLOW_rule__OpenQuestion__Group__1__Impl_in_rule__OpenQuestion__Group__11952);
            rule__OpenQuestion__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OpenQuestion__Group__2_in_rule__OpenQuestion__Group__11955);
            rule__OpenQuestion__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpenQuestion__Group__1"


    // $ANTLR start "rule__OpenQuestion__Group__1__Impl"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:993:1: rule__OpenQuestion__Group__1__Impl : ( 'open question' ) ;
    public final void rule__OpenQuestion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:997:1: ( ( 'open question' ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:998:1: ( 'open question' )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:998:1: ( 'open question' )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:999:1: 'open question'
            {
             before(grammarAccess.getOpenQuestionAccess().getOpenQuestionKeyword_1()); 
            match(input,21,FOLLOW_21_in_rule__OpenQuestion__Group__1__Impl1983); 
             after(grammarAccess.getOpenQuestionAccess().getOpenQuestionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpenQuestion__Group__1__Impl"


    // $ANTLR start "rule__OpenQuestion__Group__2"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1012:1: rule__OpenQuestion__Group__2 : rule__OpenQuestion__Group__2__Impl ;
    public final void rule__OpenQuestion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1016:1: ( rule__OpenQuestion__Group__2__Impl )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1017:2: rule__OpenQuestion__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__OpenQuestion__Group__2__Impl_in_rule__OpenQuestion__Group__22014);
            rule__OpenQuestion__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpenQuestion__Group__2"


    // $ANTLR start "rule__OpenQuestion__Group__2__Impl"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1023:1: rule__OpenQuestion__Group__2__Impl : ( ( rule__OpenQuestion__NameAssignment_2 ) ) ;
    public final void rule__OpenQuestion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1027:1: ( ( ( rule__OpenQuestion__NameAssignment_2 ) ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1028:1: ( ( rule__OpenQuestion__NameAssignment_2 ) )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1028:1: ( ( rule__OpenQuestion__NameAssignment_2 ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1029:1: ( rule__OpenQuestion__NameAssignment_2 )
            {
             before(grammarAccess.getOpenQuestionAccess().getNameAssignment_2()); 
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1030:1: ( rule__OpenQuestion__NameAssignment_2 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1030:2: rule__OpenQuestion__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__OpenQuestion__NameAssignment_2_in_rule__OpenQuestion__Group__2__Impl2041);
            rule__OpenQuestion__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOpenQuestionAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpenQuestion__Group__2__Impl"


    // $ANTLR start "rule__ClosedQuestion__Group__0"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1046:1: rule__ClosedQuestion__Group__0 : rule__ClosedQuestion__Group__0__Impl rule__ClosedQuestion__Group__1 ;
    public final void rule__ClosedQuestion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1050:1: ( rule__ClosedQuestion__Group__0__Impl rule__ClosedQuestion__Group__1 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1051:2: rule__ClosedQuestion__Group__0__Impl rule__ClosedQuestion__Group__1
            {
            pushFollow(FOLLOW_rule__ClosedQuestion__Group__0__Impl_in_rule__ClosedQuestion__Group__02077);
            rule__ClosedQuestion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClosedQuestion__Group__1_in_rule__ClosedQuestion__Group__02080);
            rule__ClosedQuestion__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClosedQuestion__Group__0"


    // $ANTLR start "rule__ClosedQuestion__Group__0__Impl"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1058:1: rule__ClosedQuestion__Group__0__Impl : ( 'closed question allowing' ) ;
    public final void rule__ClosedQuestion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1062:1: ( ( 'closed question allowing' ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1063:1: ( 'closed question allowing' )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1063:1: ( 'closed question allowing' )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1064:1: 'closed question allowing'
            {
             before(grammarAccess.getClosedQuestionAccess().getClosedQuestionAllowingKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__ClosedQuestion__Group__0__Impl2108); 
             after(grammarAccess.getClosedQuestionAccess().getClosedQuestionAllowingKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClosedQuestion__Group__0__Impl"


    // $ANTLR start "rule__ClosedQuestion__Group__1"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1077:1: rule__ClosedQuestion__Group__1 : rule__ClosedQuestion__Group__1__Impl rule__ClosedQuestion__Group__2 ;
    public final void rule__ClosedQuestion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1081:1: ( rule__ClosedQuestion__Group__1__Impl rule__ClosedQuestion__Group__2 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1082:2: rule__ClosedQuestion__Group__1__Impl rule__ClosedQuestion__Group__2
            {
            pushFollow(FOLLOW_rule__ClosedQuestion__Group__1__Impl_in_rule__ClosedQuestion__Group__12139);
            rule__ClosedQuestion__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClosedQuestion__Group__2_in_rule__ClosedQuestion__Group__12142);
            rule__ClosedQuestion__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClosedQuestion__Group__1"


    // $ANTLR start "rule__ClosedQuestion__Group__1__Impl"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1089:1: rule__ClosedQuestion__Group__1__Impl : ( ( rule__ClosedQuestion__Alternatives_1 ) ) ;
    public final void rule__ClosedQuestion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1093:1: ( ( ( rule__ClosedQuestion__Alternatives_1 ) ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1094:1: ( ( rule__ClosedQuestion__Alternatives_1 ) )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1094:1: ( ( rule__ClosedQuestion__Alternatives_1 ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1095:1: ( rule__ClosedQuestion__Alternatives_1 )
            {
             before(grammarAccess.getClosedQuestionAccess().getAlternatives_1()); 
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1096:1: ( rule__ClosedQuestion__Alternatives_1 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1096:2: rule__ClosedQuestion__Alternatives_1
            {
            pushFollow(FOLLOW_rule__ClosedQuestion__Alternatives_1_in_rule__ClosedQuestion__Group__1__Impl2169);
            rule__ClosedQuestion__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getClosedQuestionAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClosedQuestion__Group__1__Impl"


    // $ANTLR start "rule__ClosedQuestion__Group__2"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1106:1: rule__ClosedQuestion__Group__2 : rule__ClosedQuestion__Group__2__Impl rule__ClosedQuestion__Group__3 ;
    public final void rule__ClosedQuestion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1110:1: ( rule__ClosedQuestion__Group__2__Impl rule__ClosedQuestion__Group__3 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1111:2: rule__ClosedQuestion__Group__2__Impl rule__ClosedQuestion__Group__3
            {
            pushFollow(FOLLOW_rule__ClosedQuestion__Group__2__Impl_in_rule__ClosedQuestion__Group__22199);
            rule__ClosedQuestion__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClosedQuestion__Group__3_in_rule__ClosedQuestion__Group__22202);
            rule__ClosedQuestion__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClosedQuestion__Group__2"


    // $ANTLR start "rule__ClosedQuestion__Group__2__Impl"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1118:1: rule__ClosedQuestion__Group__2__Impl : ( ( rule__ClosedQuestion__NameAssignment_2 ) ) ;
    public final void rule__ClosedQuestion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1122:1: ( ( ( rule__ClosedQuestion__NameAssignment_2 ) ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1123:1: ( ( rule__ClosedQuestion__NameAssignment_2 ) )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1123:1: ( ( rule__ClosedQuestion__NameAssignment_2 ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1124:1: ( rule__ClosedQuestion__NameAssignment_2 )
            {
             before(grammarAccess.getClosedQuestionAccess().getNameAssignment_2()); 
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1125:1: ( rule__ClosedQuestion__NameAssignment_2 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1125:2: rule__ClosedQuestion__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__ClosedQuestion__NameAssignment_2_in_rule__ClosedQuestion__Group__2__Impl2229);
            rule__ClosedQuestion__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getClosedQuestionAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClosedQuestion__Group__2__Impl"


    // $ANTLR start "rule__ClosedQuestion__Group__3"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1135:1: rule__ClosedQuestion__Group__3 : rule__ClosedQuestion__Group__3__Impl rule__ClosedQuestion__Group__4 ;
    public final void rule__ClosedQuestion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1139:1: ( rule__ClosedQuestion__Group__3__Impl rule__ClosedQuestion__Group__4 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1140:2: rule__ClosedQuestion__Group__3__Impl rule__ClosedQuestion__Group__4
            {
            pushFollow(FOLLOW_rule__ClosedQuestion__Group__3__Impl_in_rule__ClosedQuestion__Group__32259);
            rule__ClosedQuestion__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClosedQuestion__Group__4_in_rule__ClosedQuestion__Group__32262);
            rule__ClosedQuestion__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClosedQuestion__Group__3"


    // $ANTLR start "rule__ClosedQuestion__Group__3__Impl"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1147:1: rule__ClosedQuestion__Group__3__Impl : ( 'answers' ) ;
    public final void rule__ClosedQuestion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1151:1: ( ( 'answers' ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1152:1: ( 'answers' )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1152:1: ( 'answers' )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1153:1: 'answers'
            {
             before(grammarAccess.getClosedQuestionAccess().getAnswersKeyword_3()); 
            match(input,23,FOLLOW_23_in_rule__ClosedQuestion__Group__3__Impl2290); 
             after(grammarAccess.getClosedQuestionAccess().getAnswersKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClosedQuestion__Group__3__Impl"


    // $ANTLR start "rule__ClosedQuestion__Group__4"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1166:1: rule__ClosedQuestion__Group__4 : rule__ClosedQuestion__Group__4__Impl rule__ClosedQuestion__Group__5 ;
    public final void rule__ClosedQuestion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1170:1: ( rule__ClosedQuestion__Group__4__Impl rule__ClosedQuestion__Group__5 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1171:2: rule__ClosedQuestion__Group__4__Impl rule__ClosedQuestion__Group__5
            {
            pushFollow(FOLLOW_rule__ClosedQuestion__Group__4__Impl_in_rule__ClosedQuestion__Group__42321);
            rule__ClosedQuestion__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClosedQuestion__Group__5_in_rule__ClosedQuestion__Group__42324);
            rule__ClosedQuestion__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClosedQuestion__Group__4"


    // $ANTLR start "rule__ClosedQuestion__Group__4__Impl"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1178:1: rule__ClosedQuestion__Group__4__Impl : ( '[' ) ;
    public final void rule__ClosedQuestion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1182:1: ( ( '[' ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1183:1: ( '[' )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1183:1: ( '[' )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1184:1: '['
            {
             before(grammarAccess.getClosedQuestionAccess().getLeftSquareBracketKeyword_4()); 
            match(input,17,FOLLOW_17_in_rule__ClosedQuestion__Group__4__Impl2352); 
             after(grammarAccess.getClosedQuestionAccess().getLeftSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClosedQuestion__Group__4__Impl"


    // $ANTLR start "rule__ClosedQuestion__Group__5"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1197:1: rule__ClosedQuestion__Group__5 : rule__ClosedQuestion__Group__5__Impl rule__ClosedQuestion__Group__6 ;
    public final void rule__ClosedQuestion__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1201:1: ( rule__ClosedQuestion__Group__5__Impl rule__ClosedQuestion__Group__6 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1202:2: rule__ClosedQuestion__Group__5__Impl rule__ClosedQuestion__Group__6
            {
            pushFollow(FOLLOW_rule__ClosedQuestion__Group__5__Impl_in_rule__ClosedQuestion__Group__52383);
            rule__ClosedQuestion__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClosedQuestion__Group__6_in_rule__ClosedQuestion__Group__52386);
            rule__ClosedQuestion__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClosedQuestion__Group__5"


    // $ANTLR start "rule__ClosedQuestion__Group__5__Impl"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1209:1: rule__ClosedQuestion__Group__5__Impl : ( ( rule__ClosedQuestion__AnswersAssignment_5 ) ) ;
    public final void rule__ClosedQuestion__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1213:1: ( ( ( rule__ClosedQuestion__AnswersAssignment_5 ) ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1214:1: ( ( rule__ClosedQuestion__AnswersAssignment_5 ) )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1214:1: ( ( rule__ClosedQuestion__AnswersAssignment_5 ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1215:1: ( rule__ClosedQuestion__AnswersAssignment_5 )
            {
             before(grammarAccess.getClosedQuestionAccess().getAnswersAssignment_5()); 
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1216:1: ( rule__ClosedQuestion__AnswersAssignment_5 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1216:2: rule__ClosedQuestion__AnswersAssignment_5
            {
            pushFollow(FOLLOW_rule__ClosedQuestion__AnswersAssignment_5_in_rule__ClosedQuestion__Group__5__Impl2413);
            rule__ClosedQuestion__AnswersAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getClosedQuestionAccess().getAnswersAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClosedQuestion__Group__5__Impl"


    // $ANTLR start "rule__ClosedQuestion__Group__6"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1226:1: rule__ClosedQuestion__Group__6 : rule__ClosedQuestion__Group__6__Impl rule__ClosedQuestion__Group__7 ;
    public final void rule__ClosedQuestion__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1230:1: ( rule__ClosedQuestion__Group__6__Impl rule__ClosedQuestion__Group__7 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1231:2: rule__ClosedQuestion__Group__6__Impl rule__ClosedQuestion__Group__7
            {
            pushFollow(FOLLOW_rule__ClosedQuestion__Group__6__Impl_in_rule__ClosedQuestion__Group__62443);
            rule__ClosedQuestion__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClosedQuestion__Group__7_in_rule__ClosedQuestion__Group__62446);
            rule__ClosedQuestion__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClosedQuestion__Group__6"


    // $ANTLR start "rule__ClosedQuestion__Group__6__Impl"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1238:1: rule__ClosedQuestion__Group__6__Impl : ( ( rule__ClosedQuestion__Group_6__0 )* ) ;
    public final void rule__ClosedQuestion__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1242:1: ( ( ( rule__ClosedQuestion__Group_6__0 )* ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1243:1: ( ( rule__ClosedQuestion__Group_6__0 )* )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1243:1: ( ( rule__ClosedQuestion__Group_6__0 )* )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1244:1: ( rule__ClosedQuestion__Group_6__0 )*
            {
             before(grammarAccess.getClosedQuestionAccess().getGroup_6()); 
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1245:1: ( rule__ClosedQuestion__Group_6__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==19) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1245:2: rule__ClosedQuestion__Group_6__0
            	    {
            	    pushFollow(FOLLOW_rule__ClosedQuestion__Group_6__0_in_rule__ClosedQuestion__Group__6__Impl2473);
            	    rule__ClosedQuestion__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getClosedQuestionAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClosedQuestion__Group__6__Impl"


    // $ANTLR start "rule__ClosedQuestion__Group__7"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1255:1: rule__ClosedQuestion__Group__7 : rule__ClosedQuestion__Group__7__Impl rule__ClosedQuestion__Group__8 ;
    public final void rule__ClosedQuestion__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1259:1: ( rule__ClosedQuestion__Group__7__Impl rule__ClosedQuestion__Group__8 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1260:2: rule__ClosedQuestion__Group__7__Impl rule__ClosedQuestion__Group__8
            {
            pushFollow(FOLLOW_rule__ClosedQuestion__Group__7__Impl_in_rule__ClosedQuestion__Group__72504);
            rule__ClosedQuestion__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClosedQuestion__Group__8_in_rule__ClosedQuestion__Group__72507);
            rule__ClosedQuestion__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClosedQuestion__Group__7"


    // $ANTLR start "rule__ClosedQuestion__Group__7__Impl"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1267:1: rule__ClosedQuestion__Group__7__Impl : ( ']' ) ;
    public final void rule__ClosedQuestion__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1271:1: ( ( ']' ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1272:1: ( ']' )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1272:1: ( ']' )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1273:1: ']'
            {
             before(grammarAccess.getClosedQuestionAccess().getRightSquareBracketKeyword_7()); 
            match(input,18,FOLLOW_18_in_rule__ClosedQuestion__Group__7__Impl2535); 
             after(grammarAccess.getClosedQuestionAccess().getRightSquareBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClosedQuestion__Group__7__Impl"


    // $ANTLR start "rule__ClosedQuestion__Group__8"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1286:1: rule__ClosedQuestion__Group__8 : rule__ClosedQuestion__Group__8__Impl ;
    public final void rule__ClosedQuestion__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1290:1: ( rule__ClosedQuestion__Group__8__Impl )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1291:2: rule__ClosedQuestion__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__ClosedQuestion__Group__8__Impl_in_rule__ClosedQuestion__Group__82566);
            rule__ClosedQuestion__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClosedQuestion__Group__8"


    // $ANTLR start "rule__ClosedQuestion__Group__8__Impl"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1297:1: rule__ClosedQuestion__Group__8__Impl : ( ( rule__ClosedQuestion__Group_8__0 )? ) ;
    public final void rule__ClosedQuestion__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1301:1: ( ( ( rule__ClosedQuestion__Group_8__0 )? ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1302:1: ( ( rule__ClosedQuestion__Group_8__0 )? )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1302:1: ( ( rule__ClosedQuestion__Group_8__0 )? )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1303:1: ( rule__ClosedQuestion__Group_8__0 )?
            {
             before(grammarAccess.getClosedQuestionAccess().getGroup_8()); 
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1304:1: ( rule__ClosedQuestion__Group_8__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1304:2: rule__ClosedQuestion__Group_8__0
                    {
                    pushFollow(FOLLOW_rule__ClosedQuestion__Group_8__0_in_rule__ClosedQuestion__Group__8__Impl2593);
                    rule__ClosedQuestion__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClosedQuestionAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClosedQuestion__Group__8__Impl"


    // $ANTLR start "rule__ClosedQuestion__Group_6__0"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1332:1: rule__ClosedQuestion__Group_6__0 : rule__ClosedQuestion__Group_6__0__Impl rule__ClosedQuestion__Group_6__1 ;
    public final void rule__ClosedQuestion__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1336:1: ( rule__ClosedQuestion__Group_6__0__Impl rule__ClosedQuestion__Group_6__1 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1337:2: rule__ClosedQuestion__Group_6__0__Impl rule__ClosedQuestion__Group_6__1
            {
            pushFollow(FOLLOW_rule__ClosedQuestion__Group_6__0__Impl_in_rule__ClosedQuestion__Group_6__02642);
            rule__ClosedQuestion__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClosedQuestion__Group_6__1_in_rule__ClosedQuestion__Group_6__02645);
            rule__ClosedQuestion__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClosedQuestion__Group_6__0"


    // $ANTLR start "rule__ClosedQuestion__Group_6__0__Impl"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1344:1: rule__ClosedQuestion__Group_6__0__Impl : ( ',' ) ;
    public final void rule__ClosedQuestion__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1348:1: ( ( ',' ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1349:1: ( ',' )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1349:1: ( ',' )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1350:1: ','
            {
             before(grammarAccess.getClosedQuestionAccess().getCommaKeyword_6_0()); 
            match(input,19,FOLLOW_19_in_rule__ClosedQuestion__Group_6__0__Impl2673); 
             after(grammarAccess.getClosedQuestionAccess().getCommaKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClosedQuestion__Group_6__0__Impl"


    // $ANTLR start "rule__ClosedQuestion__Group_6__1"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1363:1: rule__ClosedQuestion__Group_6__1 : rule__ClosedQuestion__Group_6__1__Impl ;
    public final void rule__ClosedQuestion__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1367:1: ( rule__ClosedQuestion__Group_6__1__Impl )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1368:2: rule__ClosedQuestion__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__ClosedQuestion__Group_6__1__Impl_in_rule__ClosedQuestion__Group_6__12704);
            rule__ClosedQuestion__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClosedQuestion__Group_6__1"


    // $ANTLR start "rule__ClosedQuestion__Group_6__1__Impl"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1374:1: rule__ClosedQuestion__Group_6__1__Impl : ( ( rule__ClosedQuestion__AnswersAssignment_6_1 ) ) ;
    public final void rule__ClosedQuestion__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1378:1: ( ( ( rule__ClosedQuestion__AnswersAssignment_6_1 ) ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1379:1: ( ( rule__ClosedQuestion__AnswersAssignment_6_1 ) )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1379:1: ( ( rule__ClosedQuestion__AnswersAssignment_6_1 ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1380:1: ( rule__ClosedQuestion__AnswersAssignment_6_1 )
            {
             before(grammarAccess.getClosedQuestionAccess().getAnswersAssignment_6_1()); 
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1381:1: ( rule__ClosedQuestion__AnswersAssignment_6_1 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1381:2: rule__ClosedQuestion__AnswersAssignment_6_1
            {
            pushFollow(FOLLOW_rule__ClosedQuestion__AnswersAssignment_6_1_in_rule__ClosedQuestion__Group_6__1__Impl2731);
            rule__ClosedQuestion__AnswersAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getClosedQuestionAccess().getAnswersAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClosedQuestion__Group_6__1__Impl"


    // $ANTLR start "rule__ClosedQuestion__Group_8__0"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1395:1: rule__ClosedQuestion__Group_8__0 : rule__ClosedQuestion__Group_8__0__Impl rule__ClosedQuestion__Group_8__1 ;
    public final void rule__ClosedQuestion__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1399:1: ( rule__ClosedQuestion__Group_8__0__Impl rule__ClosedQuestion__Group_8__1 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1400:2: rule__ClosedQuestion__Group_8__0__Impl rule__ClosedQuestion__Group_8__1
            {
            pushFollow(FOLLOW_rule__ClosedQuestion__Group_8__0__Impl_in_rule__ClosedQuestion__Group_8__02765);
            rule__ClosedQuestion__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClosedQuestion__Group_8__1_in_rule__ClosedQuestion__Group_8__02768);
            rule__ClosedQuestion__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClosedQuestion__Group_8__0"


    // $ANTLR start "rule__ClosedQuestion__Group_8__0__Impl"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1407:1: rule__ClosedQuestion__Group_8__0__Impl : ( 'default answer is' ) ;
    public final void rule__ClosedQuestion__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1411:1: ( ( 'default answer is' ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1412:1: ( 'default answer is' )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1412:1: ( 'default answer is' )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1413:1: 'default answer is'
            {
             before(grammarAccess.getClosedQuestionAccess().getDefaultAnswerIsKeyword_8_0()); 
            match(input,24,FOLLOW_24_in_rule__ClosedQuestion__Group_8__0__Impl2796); 
             after(grammarAccess.getClosedQuestionAccess().getDefaultAnswerIsKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClosedQuestion__Group_8__0__Impl"


    // $ANTLR start "rule__ClosedQuestion__Group_8__1"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1426:1: rule__ClosedQuestion__Group_8__1 : rule__ClosedQuestion__Group_8__1__Impl ;
    public final void rule__ClosedQuestion__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1430:1: ( rule__ClosedQuestion__Group_8__1__Impl )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1431:2: rule__ClosedQuestion__Group_8__1__Impl
            {
            pushFollow(FOLLOW_rule__ClosedQuestion__Group_8__1__Impl_in_rule__ClosedQuestion__Group_8__12827);
            rule__ClosedQuestion__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClosedQuestion__Group_8__1"


    // $ANTLR start "rule__ClosedQuestion__Group_8__1__Impl"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1437:1: rule__ClosedQuestion__Group_8__1__Impl : ( ( rule__ClosedQuestion__DefaultAssignment_8_1 ) ) ;
    public final void rule__ClosedQuestion__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1441:1: ( ( ( rule__ClosedQuestion__DefaultAssignment_8_1 ) ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1442:1: ( ( rule__ClosedQuestion__DefaultAssignment_8_1 ) )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1442:1: ( ( rule__ClosedQuestion__DefaultAssignment_8_1 ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1443:1: ( rule__ClosedQuestion__DefaultAssignment_8_1 )
            {
             before(grammarAccess.getClosedQuestionAccess().getDefaultAssignment_8_1()); 
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1444:1: ( rule__ClosedQuestion__DefaultAssignment_8_1 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1444:2: rule__ClosedQuestion__DefaultAssignment_8_1
            {
            pushFollow(FOLLOW_rule__ClosedQuestion__DefaultAssignment_8_1_in_rule__ClosedQuestion__Group_8__1__Impl2854);
            rule__ClosedQuestion__DefaultAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getClosedQuestionAccess().getDefaultAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClosedQuestion__Group_8__1__Impl"


    // $ANTLR start "rule__LikertQuestion__Group__0"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1458:1: rule__LikertQuestion__Group__0 : rule__LikertQuestion__Group__0__Impl rule__LikertQuestion__Group__1 ;
    public final void rule__LikertQuestion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1462:1: ( rule__LikertQuestion__Group__0__Impl rule__LikertQuestion__Group__1 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1463:2: rule__LikertQuestion__Group__0__Impl rule__LikertQuestion__Group__1
            {
            pushFollow(FOLLOW_rule__LikertQuestion__Group__0__Impl_in_rule__LikertQuestion__Group__02888);
            rule__LikertQuestion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LikertQuestion__Group__1_in_rule__LikertQuestion__Group__02891);
            rule__LikertQuestion__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LikertQuestion__Group__0"


    // $ANTLR start "rule__LikertQuestion__Group__0__Impl"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1470:1: rule__LikertQuestion__Group__0__Impl : ( 'likert question' ) ;
    public final void rule__LikertQuestion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1474:1: ( ( 'likert question' ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1475:1: ( 'likert question' )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1475:1: ( 'likert question' )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1476:1: 'likert question'
            {
             before(grammarAccess.getLikertQuestionAccess().getLikertQuestionKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__LikertQuestion__Group__0__Impl2919); 
             after(grammarAccess.getLikertQuestionAccess().getLikertQuestionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LikertQuestion__Group__0__Impl"


    // $ANTLR start "rule__LikertQuestion__Group__1"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1489:1: rule__LikertQuestion__Group__1 : rule__LikertQuestion__Group__1__Impl rule__LikertQuestion__Group__2 ;
    public final void rule__LikertQuestion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1493:1: ( rule__LikertQuestion__Group__1__Impl rule__LikertQuestion__Group__2 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1494:2: rule__LikertQuestion__Group__1__Impl rule__LikertQuestion__Group__2
            {
            pushFollow(FOLLOW_rule__LikertQuestion__Group__1__Impl_in_rule__LikertQuestion__Group__12950);
            rule__LikertQuestion__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LikertQuestion__Group__2_in_rule__LikertQuestion__Group__12953);
            rule__LikertQuestion__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LikertQuestion__Group__1"


    // $ANTLR start "rule__LikertQuestion__Group__1__Impl"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1501:1: rule__LikertQuestion__Group__1__Impl : ( ( rule__LikertQuestion__NameAssignment_1 ) ) ;
    public final void rule__LikertQuestion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1505:1: ( ( ( rule__LikertQuestion__NameAssignment_1 ) ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1506:1: ( ( rule__LikertQuestion__NameAssignment_1 ) )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1506:1: ( ( rule__LikertQuestion__NameAssignment_1 ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1507:1: ( rule__LikertQuestion__NameAssignment_1 )
            {
             before(grammarAccess.getLikertQuestionAccess().getNameAssignment_1()); 
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1508:1: ( rule__LikertQuestion__NameAssignment_1 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1508:2: rule__LikertQuestion__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__LikertQuestion__NameAssignment_1_in_rule__LikertQuestion__Group__1__Impl2980);
            rule__LikertQuestion__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLikertQuestionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LikertQuestion__Group__1__Impl"


    // $ANTLR start "rule__LikertQuestion__Group__2"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1518:1: rule__LikertQuestion__Group__2 : rule__LikertQuestion__Group__2__Impl rule__LikertQuestion__Group__3 ;
    public final void rule__LikertQuestion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1522:1: ( rule__LikertQuestion__Group__2__Impl rule__LikertQuestion__Group__3 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1523:2: rule__LikertQuestion__Group__2__Impl rule__LikertQuestion__Group__3
            {
            pushFollow(FOLLOW_rule__LikertQuestion__Group__2__Impl_in_rule__LikertQuestion__Group__23010);
            rule__LikertQuestion__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LikertQuestion__Group__3_in_rule__LikertQuestion__Group__23013);
            rule__LikertQuestion__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LikertQuestion__Group__2"


    // $ANTLR start "rule__LikertQuestion__Group__2__Impl"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1530:1: rule__LikertQuestion__Group__2__Impl : ( '(' ) ;
    public final void rule__LikertQuestion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1534:1: ( ( '(' ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1535:1: ( '(' )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1535:1: ( '(' )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1536:1: '('
            {
             before(grammarAccess.getLikertQuestionAccess().getLeftParenthesisKeyword_2()); 
            match(input,26,FOLLOW_26_in_rule__LikertQuestion__Group__2__Impl3041); 
             after(grammarAccess.getLikertQuestionAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LikertQuestion__Group__2__Impl"


    // $ANTLR start "rule__LikertQuestion__Group__3"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1549:1: rule__LikertQuestion__Group__3 : rule__LikertQuestion__Group__3__Impl rule__LikertQuestion__Group__4 ;
    public final void rule__LikertQuestion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1553:1: ( rule__LikertQuestion__Group__3__Impl rule__LikertQuestion__Group__4 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1554:2: rule__LikertQuestion__Group__3__Impl rule__LikertQuestion__Group__4
            {
            pushFollow(FOLLOW_rule__LikertQuestion__Group__3__Impl_in_rule__LikertQuestion__Group__33072);
            rule__LikertQuestion__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LikertQuestion__Group__4_in_rule__LikertQuestion__Group__33075);
            rule__LikertQuestion__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LikertQuestion__Group__3"


    // $ANTLR start "rule__LikertQuestion__Group__3__Impl"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1561:1: rule__LikertQuestion__Group__3__Impl : ( ( rule__LikertQuestion__FromAssignment_3 ) ) ;
    public final void rule__LikertQuestion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1565:1: ( ( ( rule__LikertQuestion__FromAssignment_3 ) ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1566:1: ( ( rule__LikertQuestion__FromAssignment_3 ) )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1566:1: ( ( rule__LikertQuestion__FromAssignment_3 ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1567:1: ( rule__LikertQuestion__FromAssignment_3 )
            {
             before(grammarAccess.getLikertQuestionAccess().getFromAssignment_3()); 
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1568:1: ( rule__LikertQuestion__FromAssignment_3 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1568:2: rule__LikertQuestion__FromAssignment_3
            {
            pushFollow(FOLLOW_rule__LikertQuestion__FromAssignment_3_in_rule__LikertQuestion__Group__3__Impl3102);
            rule__LikertQuestion__FromAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLikertQuestionAccess().getFromAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LikertQuestion__Group__3__Impl"


    // $ANTLR start "rule__LikertQuestion__Group__4"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1578:1: rule__LikertQuestion__Group__4 : rule__LikertQuestion__Group__4__Impl rule__LikertQuestion__Group__5 ;
    public final void rule__LikertQuestion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1582:1: ( rule__LikertQuestion__Group__4__Impl rule__LikertQuestion__Group__5 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1583:2: rule__LikertQuestion__Group__4__Impl rule__LikertQuestion__Group__5
            {
            pushFollow(FOLLOW_rule__LikertQuestion__Group__4__Impl_in_rule__LikertQuestion__Group__43132);
            rule__LikertQuestion__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LikertQuestion__Group__5_in_rule__LikertQuestion__Group__43135);
            rule__LikertQuestion__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LikertQuestion__Group__4"


    // $ANTLR start "rule__LikertQuestion__Group__4__Impl"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1590:1: rule__LikertQuestion__Group__4__Impl : ( '..' ) ;
    public final void rule__LikertQuestion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1594:1: ( ( '..' ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1595:1: ( '..' )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1595:1: ( '..' )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1596:1: '..'
            {
             before(grammarAccess.getLikertQuestionAccess().getFullStopFullStopKeyword_4()); 
            match(input,27,FOLLOW_27_in_rule__LikertQuestion__Group__4__Impl3163); 
             after(grammarAccess.getLikertQuestionAccess().getFullStopFullStopKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LikertQuestion__Group__4__Impl"


    // $ANTLR start "rule__LikertQuestion__Group__5"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1609:1: rule__LikertQuestion__Group__5 : rule__LikertQuestion__Group__5__Impl rule__LikertQuestion__Group__6 ;
    public final void rule__LikertQuestion__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1613:1: ( rule__LikertQuestion__Group__5__Impl rule__LikertQuestion__Group__6 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1614:2: rule__LikertQuestion__Group__5__Impl rule__LikertQuestion__Group__6
            {
            pushFollow(FOLLOW_rule__LikertQuestion__Group__5__Impl_in_rule__LikertQuestion__Group__53194);
            rule__LikertQuestion__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LikertQuestion__Group__6_in_rule__LikertQuestion__Group__53197);
            rule__LikertQuestion__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LikertQuestion__Group__5"


    // $ANTLR start "rule__LikertQuestion__Group__5__Impl"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1621:1: rule__LikertQuestion__Group__5__Impl : ( ( rule__LikertQuestion__ToAssignment_5 ) ) ;
    public final void rule__LikertQuestion__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1625:1: ( ( ( rule__LikertQuestion__ToAssignment_5 ) ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1626:1: ( ( rule__LikertQuestion__ToAssignment_5 ) )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1626:1: ( ( rule__LikertQuestion__ToAssignment_5 ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1627:1: ( rule__LikertQuestion__ToAssignment_5 )
            {
             before(grammarAccess.getLikertQuestionAccess().getToAssignment_5()); 
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1628:1: ( rule__LikertQuestion__ToAssignment_5 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1628:2: rule__LikertQuestion__ToAssignment_5
            {
            pushFollow(FOLLOW_rule__LikertQuestion__ToAssignment_5_in_rule__LikertQuestion__Group__5__Impl3224);
            rule__LikertQuestion__ToAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getLikertQuestionAccess().getToAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LikertQuestion__Group__5__Impl"


    // $ANTLR start "rule__LikertQuestion__Group__6"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1638:1: rule__LikertQuestion__Group__6 : rule__LikertQuestion__Group__6__Impl ;
    public final void rule__LikertQuestion__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1642:1: ( rule__LikertQuestion__Group__6__Impl )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1643:2: rule__LikertQuestion__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__LikertQuestion__Group__6__Impl_in_rule__LikertQuestion__Group__63254);
            rule__LikertQuestion__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LikertQuestion__Group__6"


    // $ANTLR start "rule__LikertQuestion__Group__6__Impl"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1649:1: rule__LikertQuestion__Group__6__Impl : ( ')' ) ;
    public final void rule__LikertQuestion__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1653:1: ( ( ')' ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1654:1: ( ')' )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1654:1: ( ')' )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1655:1: ')'
            {
             before(grammarAccess.getLikertQuestionAccess().getRightParenthesisKeyword_6()); 
            match(input,28,FOLLOW_28_in_rule__LikertQuestion__Group__6__Impl3282); 
             after(grammarAccess.getLikertQuestionAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LikertQuestion__Group__6__Impl"


    // $ANTLR start "rule__Answer__Group__0"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1682:1: rule__Answer__Group__0 : rule__Answer__Group__0__Impl rule__Answer__Group__1 ;
    public final void rule__Answer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1686:1: ( rule__Answer__Group__0__Impl rule__Answer__Group__1 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1687:2: rule__Answer__Group__0__Impl rule__Answer__Group__1
            {
            pushFollow(FOLLOW_rule__Answer__Group__0__Impl_in_rule__Answer__Group__03327);
            rule__Answer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Answer__Group__1_in_rule__Answer__Group__03330);
            rule__Answer__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Answer__Group__0"


    // $ANTLR start "rule__Answer__Group__0__Impl"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1694:1: rule__Answer__Group__0__Impl : ( ( rule__Answer__Alternatives_0 ) ) ;
    public final void rule__Answer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1698:1: ( ( ( rule__Answer__Alternatives_0 ) ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1699:1: ( ( rule__Answer__Alternatives_0 ) )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1699:1: ( ( rule__Answer__Alternatives_0 ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1700:1: ( rule__Answer__Alternatives_0 )
            {
             before(grammarAccess.getAnswerAccess().getAlternatives_0()); 
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1701:1: ( rule__Answer__Alternatives_0 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1701:2: rule__Answer__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Answer__Alternatives_0_in_rule__Answer__Group__0__Impl3357);
            rule__Answer__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getAnswerAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Answer__Group__0__Impl"


    // $ANTLR start "rule__Answer__Group__1"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1711:1: rule__Answer__Group__1 : rule__Answer__Group__1__Impl ;
    public final void rule__Answer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1715:1: ( rule__Answer__Group__1__Impl )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1716:2: rule__Answer__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Answer__Group__1__Impl_in_rule__Answer__Group__13387);
            rule__Answer__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Answer__Group__1"


    // $ANTLR start "rule__Answer__Group__1__Impl"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1722:1: rule__Answer__Group__1__Impl : ( ( rule__Answer__EnablesAssignment_1 )? ) ;
    public final void rule__Answer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1726:1: ( ( ( rule__Answer__EnablesAssignment_1 )? ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1727:1: ( ( rule__Answer__EnablesAssignment_1 )? )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1727:1: ( ( rule__Answer__EnablesAssignment_1 )? )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1728:1: ( rule__Answer__EnablesAssignment_1 )?
            {
             before(grammarAccess.getAnswerAccess().getEnablesAssignment_1()); 
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1729:1: ( rule__Answer__EnablesAssignment_1 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==30) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1729:2: rule__Answer__EnablesAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Answer__EnablesAssignment_1_in_rule__Answer__Group__1__Impl3414);
                    rule__Answer__EnablesAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAnswerAccess().getEnablesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Answer__Group__1__Impl"


    // $ANTLR start "rule__InputAnswer__Group__0"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1743:1: rule__InputAnswer__Group__0 : rule__InputAnswer__Group__0__Impl rule__InputAnswer__Group__1 ;
    public final void rule__InputAnswer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1747:1: ( rule__InputAnswer__Group__0__Impl rule__InputAnswer__Group__1 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1748:2: rule__InputAnswer__Group__0__Impl rule__InputAnswer__Group__1
            {
            pushFollow(FOLLOW_rule__InputAnswer__Group__0__Impl_in_rule__InputAnswer__Group__03449);
            rule__InputAnswer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InputAnswer__Group__1_in_rule__InputAnswer__Group__03452);
            rule__InputAnswer__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputAnswer__Group__0"


    // $ANTLR start "rule__InputAnswer__Group__0__Impl"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1755:1: rule__InputAnswer__Group__0__Impl : ( ( rule__InputAnswer__NameAssignment_0 ) ) ;
    public final void rule__InputAnswer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1759:1: ( ( ( rule__InputAnswer__NameAssignment_0 ) ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1760:1: ( ( rule__InputAnswer__NameAssignment_0 ) )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1760:1: ( ( rule__InputAnswer__NameAssignment_0 ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1761:1: ( rule__InputAnswer__NameAssignment_0 )
            {
             before(grammarAccess.getInputAnswerAccess().getNameAssignment_0()); 
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1762:1: ( rule__InputAnswer__NameAssignment_0 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1762:2: rule__InputAnswer__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__InputAnswer__NameAssignment_0_in_rule__InputAnswer__Group__0__Impl3479);
            rule__InputAnswer__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getInputAnswerAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputAnswer__Group__0__Impl"


    // $ANTLR start "rule__InputAnswer__Group__1"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1772:1: rule__InputAnswer__Group__1 : rule__InputAnswer__Group__1__Impl ;
    public final void rule__InputAnswer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1776:1: ( rule__InputAnswer__Group__1__Impl )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1777:2: rule__InputAnswer__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__InputAnswer__Group__1__Impl_in_rule__InputAnswer__Group__13509);
            rule__InputAnswer__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputAnswer__Group__1"


    // $ANTLR start "rule__InputAnswer__Group__1__Impl"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1783:1: rule__InputAnswer__Group__1__Impl : ( '...' ) ;
    public final void rule__InputAnswer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1787:1: ( ( '...' ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1788:1: ( '...' )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1788:1: ( '...' )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1789:1: '...'
            {
             before(grammarAccess.getInputAnswerAccess().getFullStopFullStopFullStopKeyword_1()); 
            match(input,29,FOLLOW_29_in_rule__InputAnswer__Group__1__Impl3537); 
             after(grammarAccess.getInputAnswerAccess().getFullStopFullStopFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputAnswer__Group__1__Impl"


    // $ANTLR start "rule__EnablesQuestion__Group__0"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1806:1: rule__EnablesQuestion__Group__0 : rule__EnablesQuestion__Group__0__Impl rule__EnablesQuestion__Group__1 ;
    public final void rule__EnablesQuestion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1810:1: ( rule__EnablesQuestion__Group__0__Impl rule__EnablesQuestion__Group__1 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1811:2: rule__EnablesQuestion__Group__0__Impl rule__EnablesQuestion__Group__1
            {
            pushFollow(FOLLOW_rule__EnablesQuestion__Group__0__Impl_in_rule__EnablesQuestion__Group__03572);
            rule__EnablesQuestion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnablesQuestion__Group__1_in_rule__EnablesQuestion__Group__03575);
            rule__EnablesQuestion__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnablesQuestion__Group__0"


    // $ANTLR start "rule__EnablesQuestion__Group__0__Impl"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1818:1: rule__EnablesQuestion__Group__0__Impl : ( 'enabled question' ) ;
    public final void rule__EnablesQuestion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1822:1: ( ( 'enabled question' ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1823:1: ( 'enabled question' )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1823:1: ( 'enabled question' )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1824:1: 'enabled question'
            {
             before(grammarAccess.getEnablesQuestionAccess().getEnabledQuestionKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__EnablesQuestion__Group__0__Impl3603); 
             after(grammarAccess.getEnablesQuestionAccess().getEnabledQuestionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnablesQuestion__Group__0__Impl"


    // $ANTLR start "rule__EnablesQuestion__Group__1"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1837:1: rule__EnablesQuestion__Group__1 : rule__EnablesQuestion__Group__1__Impl rule__EnablesQuestion__Group__2 ;
    public final void rule__EnablesQuestion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1841:1: ( rule__EnablesQuestion__Group__1__Impl rule__EnablesQuestion__Group__2 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1842:2: rule__EnablesQuestion__Group__1__Impl rule__EnablesQuestion__Group__2
            {
            pushFollow(FOLLOW_rule__EnablesQuestion__Group__1__Impl_in_rule__EnablesQuestion__Group__13634);
            rule__EnablesQuestion__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnablesQuestion__Group__2_in_rule__EnablesQuestion__Group__13637);
            rule__EnablesQuestion__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnablesQuestion__Group__1"


    // $ANTLR start "rule__EnablesQuestion__Group__1__Impl"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1849:1: rule__EnablesQuestion__Group__1__Impl : ( '[' ) ;
    public final void rule__EnablesQuestion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1853:1: ( ( '[' ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1854:1: ( '[' )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1854:1: ( '[' )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1855:1: '['
            {
             before(grammarAccess.getEnablesQuestionAccess().getLeftSquareBracketKeyword_1()); 
            match(input,17,FOLLOW_17_in_rule__EnablesQuestion__Group__1__Impl3665); 
             after(grammarAccess.getEnablesQuestionAccess().getLeftSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnablesQuestion__Group__1__Impl"


    // $ANTLR start "rule__EnablesQuestion__Group__2"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1868:1: rule__EnablesQuestion__Group__2 : rule__EnablesQuestion__Group__2__Impl rule__EnablesQuestion__Group__3 ;
    public final void rule__EnablesQuestion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1872:1: ( rule__EnablesQuestion__Group__2__Impl rule__EnablesQuestion__Group__3 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1873:2: rule__EnablesQuestion__Group__2__Impl rule__EnablesQuestion__Group__3
            {
            pushFollow(FOLLOW_rule__EnablesQuestion__Group__2__Impl_in_rule__EnablesQuestion__Group__23696);
            rule__EnablesQuestion__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnablesQuestion__Group__3_in_rule__EnablesQuestion__Group__23699);
            rule__EnablesQuestion__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnablesQuestion__Group__2"


    // $ANTLR start "rule__EnablesQuestion__Group__2__Impl"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1880:1: rule__EnablesQuestion__Group__2__Impl : ( ( rule__EnablesQuestion__NameAssignment_2 ) ) ;
    public final void rule__EnablesQuestion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1884:1: ( ( ( rule__EnablesQuestion__NameAssignment_2 ) ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1885:1: ( ( rule__EnablesQuestion__NameAssignment_2 ) )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1885:1: ( ( rule__EnablesQuestion__NameAssignment_2 ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1886:1: ( rule__EnablesQuestion__NameAssignment_2 )
            {
             before(grammarAccess.getEnablesQuestionAccess().getNameAssignment_2()); 
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1887:1: ( rule__EnablesQuestion__NameAssignment_2 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1887:2: rule__EnablesQuestion__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__EnablesQuestion__NameAssignment_2_in_rule__EnablesQuestion__Group__2__Impl3726);
            rule__EnablesQuestion__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEnablesQuestionAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnablesQuestion__Group__2__Impl"


    // $ANTLR start "rule__EnablesQuestion__Group__3"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1897:1: rule__EnablesQuestion__Group__3 : rule__EnablesQuestion__Group__3__Impl ;
    public final void rule__EnablesQuestion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1901:1: ( rule__EnablesQuestion__Group__3__Impl )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1902:2: rule__EnablesQuestion__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__EnablesQuestion__Group__3__Impl_in_rule__EnablesQuestion__Group__33756);
            rule__EnablesQuestion__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnablesQuestion__Group__3"


    // $ANTLR start "rule__EnablesQuestion__Group__3__Impl"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1908:1: rule__EnablesQuestion__Group__3__Impl : ( ']' ) ;
    public final void rule__EnablesQuestion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1912:1: ( ( ']' ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1913:1: ( ']' )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1913:1: ( ']' )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1914:1: ']'
            {
             before(grammarAccess.getEnablesQuestionAccess().getRightSquareBracketKeyword_3()); 
            match(input,18,FOLLOW_18_in_rule__EnablesQuestion__Group__3__Impl3784); 
             after(grammarAccess.getEnablesQuestionAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnablesQuestion__Group__3__Impl"


    // $ANTLR start "rule__Questionnaire__NameAssignment_1"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1936:1: rule__Questionnaire__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Questionnaire__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1940:1: ( ( RULE_STRING ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1941:1: ( RULE_STRING )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1941:1: ( RULE_STRING )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1942:1: RULE_STRING
            {
             before(grammarAccess.getQuestionnaireAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Questionnaire__NameAssignment_13828); 
             after(grammarAccess.getQuestionnaireAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Questionnaire__NameAssignment_1"


    // $ANTLR start "rule__Questionnaire__GroupsAssignment_3"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1951:1: rule__Questionnaire__GroupsAssignment_3 : ( ruleGroup ) ;
    public final void rule__Questionnaire__GroupsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1955:1: ( ( ruleGroup ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1956:1: ( ruleGroup )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1956:1: ( ruleGroup )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1957:1: ruleGroup
            {
             before(grammarAccess.getQuestionnaireAccess().getGroupsGroupParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleGroup_in_rule__Questionnaire__GroupsAssignment_33859);
            ruleGroup();

            state._fsp--;

             after(grammarAccess.getQuestionnaireAccess().getGroupsGroupParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Questionnaire__GroupsAssignment_3"


    // $ANTLR start "rule__Questionnaire__GroupsAssignment_4_1"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1966:1: rule__Questionnaire__GroupsAssignment_4_1 : ( ruleGroup ) ;
    public final void rule__Questionnaire__GroupsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1970:1: ( ( ruleGroup ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1971:1: ( ruleGroup )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1971:1: ( ruleGroup )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1972:1: ruleGroup
            {
             before(grammarAccess.getQuestionnaireAccess().getGroupsGroupParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleGroup_in_rule__Questionnaire__GroupsAssignment_4_13890);
            ruleGroup();

            state._fsp--;

             after(grammarAccess.getQuestionnaireAccess().getGroupsGroupParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Questionnaire__GroupsAssignment_4_1"


    // $ANTLR start "rule__Group__NameAssignment_1"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1981:1: rule__Group__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Group__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1985:1: ( ( RULE_STRING ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1986:1: ( RULE_STRING )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1986:1: ( RULE_STRING )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1987:1: RULE_STRING
            {
             before(grammarAccess.getGroupAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Group__NameAssignment_13921); 
             after(grammarAccess.getGroupAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__NameAssignment_1"


    // $ANTLR start "rule__Group__QuestionsAssignment_3"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1996:1: rule__Group__QuestionsAssignment_3 : ( ruleQuestion ) ;
    public final void rule__Group__QuestionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2000:1: ( ( ruleQuestion ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2001:1: ( ruleQuestion )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2001:1: ( ruleQuestion )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2002:1: ruleQuestion
            {
             before(grammarAccess.getGroupAccess().getQuestionsQuestionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleQuestion_in_rule__Group__QuestionsAssignment_33952);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getGroupAccess().getQuestionsQuestionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__QuestionsAssignment_3"


    // $ANTLR start "rule__Group__QuestionsAssignment_4_1"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2011:1: rule__Group__QuestionsAssignment_4_1 : ( ruleQuestion ) ;
    public final void rule__Group__QuestionsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2015:1: ( ( ruleQuestion ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2016:1: ( ruleQuestion )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2016:1: ( ruleQuestion )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2017:1: ruleQuestion
            {
             before(grammarAccess.getGroupAccess().getQuestionsQuestionParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleQuestion_in_rule__Group__QuestionsAssignment_4_13983);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getGroupAccess().getQuestionsQuestionParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__QuestionsAssignment_4_1"


    // $ANTLR start "rule__OpenQuestion__NameAssignment_2"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2026:1: rule__OpenQuestion__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__OpenQuestion__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2030:1: ( ( RULE_STRING ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2031:1: ( RULE_STRING )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2031:1: ( RULE_STRING )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2032:1: RULE_STRING
            {
             before(grammarAccess.getOpenQuestionAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__OpenQuestion__NameAssignment_24014); 
             after(grammarAccess.getOpenQuestionAccess().getNameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpenQuestion__NameAssignment_2"


    // $ANTLR start "rule__ClosedQuestion__NameAssignment_2"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2041:1: rule__ClosedQuestion__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ClosedQuestion__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2045:1: ( ( RULE_STRING ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2046:1: ( RULE_STRING )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2046:1: ( RULE_STRING )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2047:1: RULE_STRING
            {
             before(grammarAccess.getClosedQuestionAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ClosedQuestion__NameAssignment_24045); 
             after(grammarAccess.getClosedQuestionAccess().getNameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClosedQuestion__NameAssignment_2"


    // $ANTLR start "rule__ClosedQuestion__AnswersAssignment_5"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2056:1: rule__ClosedQuestion__AnswersAssignment_5 : ( ruleAnswer ) ;
    public final void rule__ClosedQuestion__AnswersAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2060:1: ( ( ruleAnswer ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2061:1: ( ruleAnswer )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2061:1: ( ruleAnswer )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2062:1: ruleAnswer
            {
             before(grammarAccess.getClosedQuestionAccess().getAnswersAnswerParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleAnswer_in_rule__ClosedQuestion__AnswersAssignment_54076);
            ruleAnswer();

            state._fsp--;

             after(grammarAccess.getClosedQuestionAccess().getAnswersAnswerParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClosedQuestion__AnswersAssignment_5"


    // $ANTLR start "rule__ClosedQuestion__AnswersAssignment_6_1"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2071:1: rule__ClosedQuestion__AnswersAssignment_6_1 : ( ruleAnswer ) ;
    public final void rule__ClosedQuestion__AnswersAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2075:1: ( ( ruleAnswer ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2076:1: ( ruleAnswer )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2076:1: ( ruleAnswer )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2077:1: ruleAnswer
            {
             before(grammarAccess.getClosedQuestionAccess().getAnswersAnswerParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_ruleAnswer_in_rule__ClosedQuestion__AnswersAssignment_6_14107);
            ruleAnswer();

            state._fsp--;

             after(grammarAccess.getClosedQuestionAccess().getAnswersAnswerParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClosedQuestion__AnswersAssignment_6_1"


    // $ANTLR start "rule__ClosedQuestion__DefaultAssignment_8_1"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2086:1: rule__ClosedQuestion__DefaultAssignment_8_1 : ( RULE_STRING ) ;
    public final void rule__ClosedQuestion__DefaultAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2090:1: ( ( RULE_STRING ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2091:1: ( RULE_STRING )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2091:1: ( RULE_STRING )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2092:1: RULE_STRING
            {
             before(grammarAccess.getClosedQuestionAccess().getDefaultSTRINGTerminalRuleCall_8_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ClosedQuestion__DefaultAssignment_8_14138); 
             after(grammarAccess.getClosedQuestionAccess().getDefaultSTRINGTerminalRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClosedQuestion__DefaultAssignment_8_1"


    // $ANTLR start "rule__LikertQuestion__NameAssignment_1"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2101:1: rule__LikertQuestion__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__LikertQuestion__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2105:1: ( ( RULE_STRING ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2106:1: ( RULE_STRING )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2106:1: ( RULE_STRING )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2107:1: RULE_STRING
            {
             before(grammarAccess.getLikertQuestionAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__LikertQuestion__NameAssignment_14169); 
             after(grammarAccess.getLikertQuestionAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LikertQuestion__NameAssignment_1"


    // $ANTLR start "rule__LikertQuestion__FromAssignment_3"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2116:1: rule__LikertQuestion__FromAssignment_3 : ( RULE_SINT ) ;
    public final void rule__LikertQuestion__FromAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2120:1: ( ( RULE_SINT ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2121:1: ( RULE_SINT )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2121:1: ( RULE_SINT )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2122:1: RULE_SINT
            {
             before(grammarAccess.getLikertQuestionAccess().getFromSINTTerminalRuleCall_3_0()); 
            match(input,RULE_SINT,FOLLOW_RULE_SINT_in_rule__LikertQuestion__FromAssignment_34200); 
             after(grammarAccess.getLikertQuestionAccess().getFromSINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LikertQuestion__FromAssignment_3"


    // $ANTLR start "rule__LikertQuestion__ToAssignment_5"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2131:1: rule__LikertQuestion__ToAssignment_5 : ( RULE_SINT ) ;
    public final void rule__LikertQuestion__ToAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2135:1: ( ( RULE_SINT ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2136:1: ( RULE_SINT )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2136:1: ( RULE_SINT )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2137:1: RULE_SINT
            {
             before(grammarAccess.getLikertQuestionAccess().getToSINTTerminalRuleCall_5_0()); 
            match(input,RULE_SINT,FOLLOW_RULE_SINT_in_rule__LikertQuestion__ToAssignment_54231); 
             after(grammarAccess.getLikertQuestionAccess().getToSINTTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LikertQuestion__ToAssignment_5"


    // $ANTLR start "rule__Answer__EnablesAssignment_1"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2146:1: rule__Answer__EnablesAssignment_1 : ( ruleEnablesQuestion ) ;
    public final void rule__Answer__EnablesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2150:1: ( ( ruleEnablesQuestion ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2151:1: ( ruleEnablesQuestion )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2151:1: ( ruleEnablesQuestion )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2152:1: ruleEnablesQuestion
            {
             before(grammarAccess.getAnswerAccess().getEnablesEnablesQuestionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEnablesQuestion_in_rule__Answer__EnablesAssignment_14262);
            ruleEnablesQuestion();

            state._fsp--;

             after(grammarAccess.getAnswerAccess().getEnablesEnablesQuestionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Answer__EnablesAssignment_1"


    // $ANTLR start "rule__SimpleAnswer__NameAssignment"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2161:1: rule__SimpleAnswer__NameAssignment : ( RULE_STRING ) ;
    public final void rule__SimpleAnswer__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2165:1: ( ( RULE_STRING ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2166:1: ( RULE_STRING )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2166:1: ( RULE_STRING )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2167:1: RULE_STRING
            {
             before(grammarAccess.getSimpleAnswerAccess().getNameSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SimpleAnswer__NameAssignment4293); 
             after(grammarAccess.getSimpleAnswerAccess().getNameSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAnswer__NameAssignment"


    // $ANTLR start "rule__InputAnswer__NameAssignment_0"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2176:1: rule__InputAnswer__NameAssignment_0 : ( RULE_STRING ) ;
    public final void rule__InputAnswer__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2180:1: ( ( RULE_STRING ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2181:1: ( RULE_STRING )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2181:1: ( RULE_STRING )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2182:1: RULE_STRING
            {
             before(grammarAccess.getInputAnswerAccess().getNameSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__InputAnswer__NameAssignment_04324); 
             after(grammarAccess.getInputAnswerAccess().getNameSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputAnswer__NameAssignment_0"


    // $ANTLR start "rule__EnablesQuestion__NameAssignment_2"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2191:1: rule__EnablesQuestion__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__EnablesQuestion__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2195:1: ( ( RULE_STRING ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2196:1: ( RULE_STRING )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2196:1: ( RULE_STRING )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2197:1: RULE_STRING
            {
             before(grammarAccess.getEnablesQuestionAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EnablesQuestion__NameAssignment_24355); 
             after(grammarAccess.getEnablesQuestionAccess().getNameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnablesQuestion__NameAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleQuestionnaire_in_entryRuleQuestionnaire61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuestionnaire68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__0_in_ruleQuestionnaire94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroup_in_entryRuleGroup121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGroup128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__Group__0_in_ruleGroup154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuestion_in_entryRuleQuestion181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuestion188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Alternatives_in_ruleQuestion214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpenQuestion_in_entryRuleOpenQuestion241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpenQuestion248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OpenQuestion__Group__0_in_ruleOpenQuestion274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClosedQuestion_in_entryRuleClosedQuestion301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClosedQuestion308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClosedQuestion__Group__0_in_ruleClosedQuestion334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLikertQuestion_in_entryRuleLikertQuestion361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLikertQuestion368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LikertQuestion__Group__0_in_ruleLikertQuestion394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnswer_in_entryRuleAnswer421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnswer428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Answer__Group__0_in_ruleAnswer454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleAnswer_in_entryRuleSimpleAnswer481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleAnswer488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleAnswer__NameAssignment_in_ruleSimpleAnswer514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInputAnswer_in_entryRuleInputAnswer541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInputAnswer548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputAnswer__Group__0_in_ruleInputAnswer574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnablesQuestion_in_entryRuleEnablesQuestion601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnablesQuestion608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnablesQuestion__Group__0_in_ruleEnablesQuestion634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpenQuestion_in_rule__Question__Alternatives670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClosedQuestion_in_rule__Question__Alternatives687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLikertQuestion_in_rule__Question__Alternatives704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__OpenQuestion__Alternatives_0737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__OpenQuestion__Alternatives_0757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ClosedQuestion__Alternatives_1792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ClosedQuestion__Alternatives_1812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleAnswer_in_rule__Answer__Alternatives_0846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInputAnswer_in_rule__Answer__Alternatives_0863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__0__Impl_in_rule__Questionnaire__Group__0893 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__1_in_rule__Questionnaire__Group__0896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Questionnaire__Group__0__Impl924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__1__Impl_in_rule__Questionnaire__Group__1955 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__2_in_rule__Questionnaire__Group__1958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Questionnaire__NameAssignment_1_in_rule__Questionnaire__Group__1__Impl985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__2__Impl_in_rule__Questionnaire__Group__21015 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__3_in_rule__Questionnaire__Group__21018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Questionnaire__Group__2__Impl1046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__3__Impl_in_rule__Questionnaire__Group__31077 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__4_in_rule__Questionnaire__Group__31080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Questionnaire__GroupsAssignment_3_in_rule__Questionnaire__Group__3__Impl1107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__4__Impl_in_rule__Questionnaire__Group__41137 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__5_in_rule__Questionnaire__Group__41140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group_4__0_in_rule__Questionnaire__Group__4__Impl1167 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__5__Impl_in_rule__Questionnaire__Group__51198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Questionnaire__Group__5__Impl1226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group_4__0__Impl_in_rule__Questionnaire__Group_4__01269 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group_4__1_in_rule__Questionnaire__Group_4__01272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Questionnaire__Group_4__0__Impl1300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group_4__1__Impl_in_rule__Questionnaire__Group_4__11331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Questionnaire__GroupsAssignment_4_1_in_rule__Questionnaire__Group_4__1__Impl1358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__Group__0__Impl_in_rule__Group__Group__01392 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Group__Group__1_in_rule__Group__Group__01395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Group__Group__0__Impl1423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__Group__1__Impl_in_rule__Group__Group__11454 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Group__Group__2_in_rule__Group__Group__11457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__NameAssignment_1_in_rule__Group__Group__1__Impl1484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__Group__2__Impl_in_rule__Group__Group__21514 = new BitSet(new long[]{0x0000000002603000L});
    public static final BitSet FOLLOW_rule__Group__Group__3_in_rule__Group__Group__21517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Group__Group__2__Impl1545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__Group__3__Impl_in_rule__Group__Group__31576 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__Group__Group__4_in_rule__Group__Group__31579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__QuestionsAssignment_3_in_rule__Group__Group__3__Impl1606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__Group__4__Impl_in_rule__Group__Group__41636 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__Group__Group__5_in_rule__Group__Group__41639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__Group_4__0_in_rule__Group__Group__4__Impl1666 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__Group__Group__5__Impl_in_rule__Group__Group__51697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Group__Group__5__Impl1725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__Group_4__0__Impl_in_rule__Group__Group_4__01768 = new BitSet(new long[]{0x0000000002603000L});
    public static final BitSet FOLLOW_rule__Group__Group_4__1_in_rule__Group__Group_4__01771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Group__Group_4__0__Impl1799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__Group_4__1__Impl_in_rule__Group__Group_4__11830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__QuestionsAssignment_4_1_in_rule__Group__Group_4__1__Impl1857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OpenQuestion__Group__0__Impl_in_rule__OpenQuestion__Group__01891 = new BitSet(new long[]{0x0000000000203000L});
    public static final BitSet FOLLOW_rule__OpenQuestion__Group__1_in_rule__OpenQuestion__Group__01894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OpenQuestion__Alternatives_0_in_rule__OpenQuestion__Group__0__Impl1921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OpenQuestion__Group__1__Impl_in_rule__OpenQuestion__Group__11952 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__OpenQuestion__Group__2_in_rule__OpenQuestion__Group__11955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__OpenQuestion__Group__1__Impl1983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OpenQuestion__Group__2__Impl_in_rule__OpenQuestion__Group__22014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OpenQuestion__NameAssignment_2_in_rule__OpenQuestion__Group__2__Impl2041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClosedQuestion__Group__0__Impl_in_rule__ClosedQuestion__Group__02077 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__ClosedQuestion__Group__1_in_rule__ClosedQuestion__Group__02080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ClosedQuestion__Group__0__Impl2108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClosedQuestion__Group__1__Impl_in_rule__ClosedQuestion__Group__12139 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ClosedQuestion__Group__2_in_rule__ClosedQuestion__Group__12142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClosedQuestion__Alternatives_1_in_rule__ClosedQuestion__Group__1__Impl2169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClosedQuestion__Group__2__Impl_in_rule__ClosedQuestion__Group__22199 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__ClosedQuestion__Group__3_in_rule__ClosedQuestion__Group__22202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClosedQuestion__NameAssignment_2_in_rule__ClosedQuestion__Group__2__Impl2229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClosedQuestion__Group__3__Impl_in_rule__ClosedQuestion__Group__32259 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__ClosedQuestion__Group__4_in_rule__ClosedQuestion__Group__32262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ClosedQuestion__Group__3__Impl2290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClosedQuestion__Group__4__Impl_in_rule__ClosedQuestion__Group__42321 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ClosedQuestion__Group__5_in_rule__ClosedQuestion__Group__42324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ClosedQuestion__Group__4__Impl2352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClosedQuestion__Group__5__Impl_in_rule__ClosedQuestion__Group__52383 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__ClosedQuestion__Group__6_in_rule__ClosedQuestion__Group__52386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClosedQuestion__AnswersAssignment_5_in_rule__ClosedQuestion__Group__5__Impl2413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClosedQuestion__Group__6__Impl_in_rule__ClosedQuestion__Group__62443 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__ClosedQuestion__Group__7_in_rule__ClosedQuestion__Group__62446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClosedQuestion__Group_6__0_in_rule__ClosedQuestion__Group__6__Impl2473 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__ClosedQuestion__Group__7__Impl_in_rule__ClosedQuestion__Group__72504 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__ClosedQuestion__Group__8_in_rule__ClosedQuestion__Group__72507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ClosedQuestion__Group__7__Impl2535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClosedQuestion__Group__8__Impl_in_rule__ClosedQuestion__Group__82566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClosedQuestion__Group_8__0_in_rule__ClosedQuestion__Group__8__Impl2593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClosedQuestion__Group_6__0__Impl_in_rule__ClosedQuestion__Group_6__02642 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ClosedQuestion__Group_6__1_in_rule__ClosedQuestion__Group_6__02645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ClosedQuestion__Group_6__0__Impl2673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClosedQuestion__Group_6__1__Impl_in_rule__ClosedQuestion__Group_6__12704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClosedQuestion__AnswersAssignment_6_1_in_rule__ClosedQuestion__Group_6__1__Impl2731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClosedQuestion__Group_8__0__Impl_in_rule__ClosedQuestion__Group_8__02765 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ClosedQuestion__Group_8__1_in_rule__ClosedQuestion__Group_8__02768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ClosedQuestion__Group_8__0__Impl2796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClosedQuestion__Group_8__1__Impl_in_rule__ClosedQuestion__Group_8__12827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClosedQuestion__DefaultAssignment_8_1_in_rule__ClosedQuestion__Group_8__1__Impl2854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LikertQuestion__Group__0__Impl_in_rule__LikertQuestion__Group__02888 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__LikertQuestion__Group__1_in_rule__LikertQuestion__Group__02891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__LikertQuestion__Group__0__Impl2919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LikertQuestion__Group__1__Impl_in_rule__LikertQuestion__Group__12950 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__LikertQuestion__Group__2_in_rule__LikertQuestion__Group__12953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LikertQuestion__NameAssignment_1_in_rule__LikertQuestion__Group__1__Impl2980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LikertQuestion__Group__2__Impl_in_rule__LikertQuestion__Group__23010 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__LikertQuestion__Group__3_in_rule__LikertQuestion__Group__23013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__LikertQuestion__Group__2__Impl3041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LikertQuestion__Group__3__Impl_in_rule__LikertQuestion__Group__33072 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__LikertQuestion__Group__4_in_rule__LikertQuestion__Group__33075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LikertQuestion__FromAssignment_3_in_rule__LikertQuestion__Group__3__Impl3102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LikertQuestion__Group__4__Impl_in_rule__LikertQuestion__Group__43132 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__LikertQuestion__Group__5_in_rule__LikertQuestion__Group__43135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__LikertQuestion__Group__4__Impl3163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LikertQuestion__Group__5__Impl_in_rule__LikertQuestion__Group__53194 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__LikertQuestion__Group__6_in_rule__LikertQuestion__Group__53197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LikertQuestion__ToAssignment_5_in_rule__LikertQuestion__Group__5__Impl3224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LikertQuestion__Group__6__Impl_in_rule__LikertQuestion__Group__63254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__LikertQuestion__Group__6__Impl3282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Answer__Group__0__Impl_in_rule__Answer__Group__03327 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Answer__Group__1_in_rule__Answer__Group__03330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Answer__Alternatives_0_in_rule__Answer__Group__0__Impl3357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Answer__Group__1__Impl_in_rule__Answer__Group__13387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Answer__EnablesAssignment_1_in_rule__Answer__Group__1__Impl3414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputAnswer__Group__0__Impl_in_rule__InputAnswer__Group__03449 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__InputAnswer__Group__1_in_rule__InputAnswer__Group__03452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputAnswer__NameAssignment_0_in_rule__InputAnswer__Group__0__Impl3479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputAnswer__Group__1__Impl_in_rule__InputAnswer__Group__13509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__InputAnswer__Group__1__Impl3537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnablesQuestion__Group__0__Impl_in_rule__EnablesQuestion__Group__03572 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__EnablesQuestion__Group__1_in_rule__EnablesQuestion__Group__03575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__EnablesQuestion__Group__0__Impl3603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnablesQuestion__Group__1__Impl_in_rule__EnablesQuestion__Group__13634 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EnablesQuestion__Group__2_in_rule__EnablesQuestion__Group__13637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__EnablesQuestion__Group__1__Impl3665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnablesQuestion__Group__2__Impl_in_rule__EnablesQuestion__Group__23696 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__EnablesQuestion__Group__3_in_rule__EnablesQuestion__Group__23699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnablesQuestion__NameAssignment_2_in_rule__EnablesQuestion__Group__2__Impl3726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnablesQuestion__Group__3__Impl_in_rule__EnablesQuestion__Group__33756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__EnablesQuestion__Group__3__Impl3784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Questionnaire__NameAssignment_13828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroup_in_rule__Questionnaire__GroupsAssignment_33859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroup_in_rule__Questionnaire__GroupsAssignment_4_13890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Group__NameAssignment_13921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuestion_in_rule__Group__QuestionsAssignment_33952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuestion_in_rule__Group__QuestionsAssignment_4_13983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__OpenQuestion__NameAssignment_24014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ClosedQuestion__NameAssignment_24045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnswer_in_rule__ClosedQuestion__AnswersAssignment_54076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnswer_in_rule__ClosedQuestion__AnswersAssignment_6_14107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ClosedQuestion__DefaultAssignment_8_14138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__LikertQuestion__NameAssignment_14169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SINT_in_rule__LikertQuestion__FromAssignment_34200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SINT_in_rule__LikertQuestion__ToAssignment_54231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnablesQuestion_in_rule__Answer__EnablesAssignment_14262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SimpleAnswer__NameAssignment4293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__InputAnswer__NameAssignment_04324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EnablesQuestion__NameAssignment_24355 = new BitSet(new long[]{0x0000000000000002L});

}