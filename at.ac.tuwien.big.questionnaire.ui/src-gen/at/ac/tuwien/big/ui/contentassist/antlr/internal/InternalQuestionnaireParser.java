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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'mandatory'", "'multiline'", "'single answer'", "'multiple answers'", "'questionnaire'", "'['", "']'", "','", "'group'", "'open question'", "'closed question allowing'", "'answers'", "'default answer is'", "'likert question'", "'('", "'..'", "')'", "'...'", "'enables question'", "'-'"
    };
    public static final int RULE_ID=6;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int RULE_STRING=4;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;

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


    // $ANTLR start "entryRuleSINT"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:340:1: entryRuleSINT : ruleSINT EOF ;
    public final void entryRuleSINT() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:341:1: ( ruleSINT EOF )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:342:1: ruleSINT EOF
            {
             before(grammarAccess.getSINTRule()); 
            pushFollow(FOLLOW_ruleSINT_in_entryRuleSINT661);
            ruleSINT();

            state._fsp--;

             after(grammarAccess.getSINTRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSINT668); 

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
    // $ANTLR end "entryRuleSINT"


    // $ANTLR start "ruleSINT"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:349:1: ruleSINT : ( ( rule__SINT__Group__0 ) ) ;
    public final void ruleSINT() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:353:2: ( ( ( rule__SINT__Group__0 ) ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:354:1: ( ( rule__SINT__Group__0 ) )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:354:1: ( ( rule__SINT__Group__0 ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:355:1: ( rule__SINT__Group__0 )
            {
             before(grammarAccess.getSINTAccess().getGroup()); 
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:356:1: ( rule__SINT__Group__0 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:356:2: rule__SINT__Group__0
            {
            pushFollow(FOLLOW_rule__SINT__Group__0_in_ruleSINT694);
            rule__SINT__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSINTAccess().getGroup()); 

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
    // $ANTLR end "ruleSINT"


    // $ANTLR start "rule__Question__Alternatives"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:368:1: rule__Question__Alternatives : ( ( ruleOpenQuestion ) | ( ruleClosedQuestion ) | ( ruleLikertQuestion ) );
    public final void rule__Question__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:372:1: ( ( ruleOpenQuestion ) | ( ruleClosedQuestion ) | ( ruleLikertQuestion ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 11:
            case 12:
            case 20:
                {
                alt1=1;
                }
                break;
            case 21:
                {
                alt1=2;
                }
                break;
            case 24:
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
                    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:373:1: ( ruleOpenQuestion )
                    {
                    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:373:1: ( ruleOpenQuestion )
                    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:374:1: ruleOpenQuestion
                    {
                     before(grammarAccess.getQuestionAccess().getOpenQuestionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleOpenQuestion_in_rule__Question__Alternatives730);
                    ruleOpenQuestion();

                    state._fsp--;

                     after(grammarAccess.getQuestionAccess().getOpenQuestionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:379:6: ( ruleClosedQuestion )
                    {
                    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:379:6: ( ruleClosedQuestion )
                    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:380:1: ruleClosedQuestion
                    {
                     before(grammarAccess.getQuestionAccess().getClosedQuestionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleClosedQuestion_in_rule__Question__Alternatives747);
                    ruleClosedQuestion();

                    state._fsp--;

                     after(grammarAccess.getQuestionAccess().getClosedQuestionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:385:6: ( ruleLikertQuestion )
                    {
                    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:385:6: ( ruleLikertQuestion )
                    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:386:1: ruleLikertQuestion
                    {
                     before(grammarAccess.getQuestionAccess().getLikertQuestionParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleLikertQuestion_in_rule__Question__Alternatives764);
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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:396:1: rule__OpenQuestion__Alternatives_0 : ( ( 'mandatory' ) | ( 'multiline' ) );
    public final void rule__OpenQuestion__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:400:1: ( ( 'mandatory' ) | ( 'multiline' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:401:1: ( 'mandatory' )
                    {
                    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:401:1: ( 'mandatory' )
                    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:402:1: 'mandatory'
                    {
                     before(grammarAccess.getOpenQuestionAccess().getMandatoryKeyword_0_0()); 
                    match(input,11,FOLLOW_11_in_rule__OpenQuestion__Alternatives_0797); 
                     after(grammarAccess.getOpenQuestionAccess().getMandatoryKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:409:6: ( 'multiline' )
                    {
                    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:409:6: ( 'multiline' )
                    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:410:1: 'multiline'
                    {
                     before(grammarAccess.getOpenQuestionAccess().getMultilineKeyword_0_1()); 
                    match(input,12,FOLLOW_12_in_rule__OpenQuestion__Alternatives_0817); 
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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:422:1: rule__ClosedQuestion__Alternatives_1 : ( ( 'single answer' ) | ( 'multiple answers' ) );
    public final void rule__ClosedQuestion__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:426:1: ( ( 'single answer' ) | ( 'multiple answers' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            else if ( (LA3_0==14) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:427:1: ( 'single answer' )
                    {
                    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:427:1: ( 'single answer' )
                    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:428:1: 'single answer'
                    {
                     before(grammarAccess.getClosedQuestionAccess().getSingleAnswerKeyword_1_0()); 
                    match(input,13,FOLLOW_13_in_rule__ClosedQuestion__Alternatives_1852); 
                     after(grammarAccess.getClosedQuestionAccess().getSingleAnswerKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:435:6: ( 'multiple answers' )
                    {
                    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:435:6: ( 'multiple answers' )
                    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:436:1: 'multiple answers'
                    {
                     before(grammarAccess.getClosedQuestionAccess().getMultipleAnswersKeyword_1_1()); 
                    match(input,14,FOLLOW_14_in_rule__ClosedQuestion__Alternatives_1872); 
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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:448:1: rule__Answer__Alternatives_0 : ( ( ruleSimpleAnswer ) | ( ruleInputAnswer ) );
    public final void rule__Answer__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:452:1: ( ( ruleSimpleAnswer ) | ( ruleInputAnswer ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==28) ) {
                    alt4=2;
                }
                else if ( (LA4_1==EOF||(LA4_1>=17 && LA4_1<=18)||LA4_1==29) ) {
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
                    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:453:1: ( ruleSimpleAnswer )
                    {
                    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:453:1: ( ruleSimpleAnswer )
                    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:454:1: ruleSimpleAnswer
                    {
                     before(grammarAccess.getAnswerAccess().getSimpleAnswerParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_ruleSimpleAnswer_in_rule__Answer__Alternatives_0906);
                    ruleSimpleAnswer();

                    state._fsp--;

                     after(grammarAccess.getAnswerAccess().getSimpleAnswerParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:459:6: ( ruleInputAnswer )
                    {
                    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:459:6: ( ruleInputAnswer )
                    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:460:1: ruleInputAnswer
                    {
                     before(grammarAccess.getAnswerAccess().getInputAnswerParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_ruleInputAnswer_in_rule__Answer__Alternatives_0923);
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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:472:1: rule__Questionnaire__Group__0 : rule__Questionnaire__Group__0__Impl rule__Questionnaire__Group__1 ;
    public final void rule__Questionnaire__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:476:1: ( rule__Questionnaire__Group__0__Impl rule__Questionnaire__Group__1 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:477:2: rule__Questionnaire__Group__0__Impl rule__Questionnaire__Group__1
            {
            pushFollow(FOLLOW_rule__Questionnaire__Group__0__Impl_in_rule__Questionnaire__Group__0953);
            rule__Questionnaire__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Questionnaire__Group__1_in_rule__Questionnaire__Group__0956);
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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:484:1: rule__Questionnaire__Group__0__Impl : ( 'questionnaire' ) ;
    public final void rule__Questionnaire__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:488:1: ( ( 'questionnaire' ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:489:1: ( 'questionnaire' )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:489:1: ( 'questionnaire' )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:490:1: 'questionnaire'
            {
             before(grammarAccess.getQuestionnaireAccess().getQuestionnaireKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__Questionnaire__Group__0__Impl984); 
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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:503:1: rule__Questionnaire__Group__1 : rule__Questionnaire__Group__1__Impl rule__Questionnaire__Group__2 ;
    public final void rule__Questionnaire__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:507:1: ( rule__Questionnaire__Group__1__Impl rule__Questionnaire__Group__2 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:508:2: rule__Questionnaire__Group__1__Impl rule__Questionnaire__Group__2
            {
            pushFollow(FOLLOW_rule__Questionnaire__Group__1__Impl_in_rule__Questionnaire__Group__11015);
            rule__Questionnaire__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Questionnaire__Group__2_in_rule__Questionnaire__Group__11018);
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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:515:1: rule__Questionnaire__Group__1__Impl : ( RULE_STRING ) ;
    public final void rule__Questionnaire__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:519:1: ( ( RULE_STRING ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:520:1: ( RULE_STRING )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:520:1: ( RULE_STRING )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:521:1: RULE_STRING
            {
             before(grammarAccess.getQuestionnaireAccess().getSTRINGTerminalRuleCall_1()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Questionnaire__Group__1__Impl1045); 
             after(grammarAccess.getQuestionnaireAccess().getSTRINGTerminalRuleCall_1()); 

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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:532:1: rule__Questionnaire__Group__2 : rule__Questionnaire__Group__2__Impl rule__Questionnaire__Group__3 ;
    public final void rule__Questionnaire__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:536:1: ( rule__Questionnaire__Group__2__Impl rule__Questionnaire__Group__3 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:537:2: rule__Questionnaire__Group__2__Impl rule__Questionnaire__Group__3
            {
            pushFollow(FOLLOW_rule__Questionnaire__Group__2__Impl_in_rule__Questionnaire__Group__21074);
            rule__Questionnaire__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Questionnaire__Group__3_in_rule__Questionnaire__Group__21077);
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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:544:1: rule__Questionnaire__Group__2__Impl : ( '[' ) ;
    public final void rule__Questionnaire__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:548:1: ( ( '[' ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:549:1: ( '[' )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:549:1: ( '[' )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:550:1: '['
            {
             before(grammarAccess.getQuestionnaireAccess().getLeftSquareBracketKeyword_2()); 
            match(input,16,FOLLOW_16_in_rule__Questionnaire__Group__2__Impl1105); 
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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:563:1: rule__Questionnaire__Group__3 : rule__Questionnaire__Group__3__Impl rule__Questionnaire__Group__4 ;
    public final void rule__Questionnaire__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:567:1: ( rule__Questionnaire__Group__3__Impl rule__Questionnaire__Group__4 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:568:2: rule__Questionnaire__Group__3__Impl rule__Questionnaire__Group__4
            {
            pushFollow(FOLLOW_rule__Questionnaire__Group__3__Impl_in_rule__Questionnaire__Group__31136);
            rule__Questionnaire__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Questionnaire__Group__4_in_rule__Questionnaire__Group__31139);
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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:575:1: rule__Questionnaire__Group__3__Impl : ( ( rule__Questionnaire__GroupsAssignment_3 ) ) ;
    public final void rule__Questionnaire__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:579:1: ( ( ( rule__Questionnaire__GroupsAssignment_3 ) ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:580:1: ( ( rule__Questionnaire__GroupsAssignment_3 ) )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:580:1: ( ( rule__Questionnaire__GroupsAssignment_3 ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:581:1: ( rule__Questionnaire__GroupsAssignment_3 )
            {
             before(grammarAccess.getQuestionnaireAccess().getGroupsAssignment_3()); 
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:582:1: ( rule__Questionnaire__GroupsAssignment_3 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:582:2: rule__Questionnaire__GroupsAssignment_3
            {
            pushFollow(FOLLOW_rule__Questionnaire__GroupsAssignment_3_in_rule__Questionnaire__Group__3__Impl1166);
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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:592:1: rule__Questionnaire__Group__4 : rule__Questionnaire__Group__4__Impl rule__Questionnaire__Group__5 ;
    public final void rule__Questionnaire__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:596:1: ( rule__Questionnaire__Group__4__Impl rule__Questionnaire__Group__5 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:597:2: rule__Questionnaire__Group__4__Impl rule__Questionnaire__Group__5
            {
            pushFollow(FOLLOW_rule__Questionnaire__Group__4__Impl_in_rule__Questionnaire__Group__41196);
            rule__Questionnaire__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Questionnaire__Group__5_in_rule__Questionnaire__Group__41199);
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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:604:1: rule__Questionnaire__Group__4__Impl : ( ( rule__Questionnaire__Group_4__0 )* ) ;
    public final void rule__Questionnaire__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:608:1: ( ( ( rule__Questionnaire__Group_4__0 )* ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:609:1: ( ( rule__Questionnaire__Group_4__0 )* )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:609:1: ( ( rule__Questionnaire__Group_4__0 )* )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:610:1: ( rule__Questionnaire__Group_4__0 )*
            {
             before(grammarAccess.getQuestionnaireAccess().getGroup_4()); 
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:611:1: ( rule__Questionnaire__Group_4__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==18) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:611:2: rule__Questionnaire__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Questionnaire__Group_4__0_in_rule__Questionnaire__Group__4__Impl1226);
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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:621:1: rule__Questionnaire__Group__5 : rule__Questionnaire__Group__5__Impl ;
    public final void rule__Questionnaire__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:625:1: ( rule__Questionnaire__Group__5__Impl )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:626:2: rule__Questionnaire__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Questionnaire__Group__5__Impl_in_rule__Questionnaire__Group__51257);
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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:632:1: rule__Questionnaire__Group__5__Impl : ( ']' ) ;
    public final void rule__Questionnaire__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:636:1: ( ( ']' ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:637:1: ( ']' )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:637:1: ( ']' )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:638:1: ']'
            {
             before(grammarAccess.getQuestionnaireAccess().getRightSquareBracketKeyword_5()); 
            match(input,17,FOLLOW_17_in_rule__Questionnaire__Group__5__Impl1285); 
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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:663:1: rule__Questionnaire__Group_4__0 : rule__Questionnaire__Group_4__0__Impl rule__Questionnaire__Group_4__1 ;
    public final void rule__Questionnaire__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:667:1: ( rule__Questionnaire__Group_4__0__Impl rule__Questionnaire__Group_4__1 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:668:2: rule__Questionnaire__Group_4__0__Impl rule__Questionnaire__Group_4__1
            {
            pushFollow(FOLLOW_rule__Questionnaire__Group_4__0__Impl_in_rule__Questionnaire__Group_4__01328);
            rule__Questionnaire__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Questionnaire__Group_4__1_in_rule__Questionnaire__Group_4__01331);
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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:675:1: rule__Questionnaire__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Questionnaire__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:679:1: ( ( ',' ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:680:1: ( ',' )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:680:1: ( ',' )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:681:1: ','
            {
             before(grammarAccess.getQuestionnaireAccess().getCommaKeyword_4_0()); 
            match(input,18,FOLLOW_18_in_rule__Questionnaire__Group_4__0__Impl1359); 
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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:694:1: rule__Questionnaire__Group_4__1 : rule__Questionnaire__Group_4__1__Impl ;
    public final void rule__Questionnaire__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:698:1: ( rule__Questionnaire__Group_4__1__Impl )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:699:2: rule__Questionnaire__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Questionnaire__Group_4__1__Impl_in_rule__Questionnaire__Group_4__11390);
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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:705:1: rule__Questionnaire__Group_4__1__Impl : ( ( rule__Questionnaire__GroupsAssignment_4_1 ) ) ;
    public final void rule__Questionnaire__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:709:1: ( ( ( rule__Questionnaire__GroupsAssignment_4_1 ) ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:710:1: ( ( rule__Questionnaire__GroupsAssignment_4_1 ) )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:710:1: ( ( rule__Questionnaire__GroupsAssignment_4_1 ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:711:1: ( rule__Questionnaire__GroupsAssignment_4_1 )
            {
             before(grammarAccess.getQuestionnaireAccess().getGroupsAssignment_4_1()); 
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:712:1: ( rule__Questionnaire__GroupsAssignment_4_1 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:712:2: rule__Questionnaire__GroupsAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Questionnaire__GroupsAssignment_4_1_in_rule__Questionnaire__Group_4__1__Impl1417);
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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:726:1: rule__Group__Group__0 : rule__Group__Group__0__Impl rule__Group__Group__1 ;
    public final void rule__Group__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:730:1: ( rule__Group__Group__0__Impl rule__Group__Group__1 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:731:2: rule__Group__Group__0__Impl rule__Group__Group__1
            {
            pushFollow(FOLLOW_rule__Group__Group__0__Impl_in_rule__Group__Group__01451);
            rule__Group__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Group__Group__1_in_rule__Group__Group__01454);
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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:738:1: rule__Group__Group__0__Impl : ( 'group' ) ;
    public final void rule__Group__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:742:1: ( ( 'group' ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:743:1: ( 'group' )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:743:1: ( 'group' )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:744:1: 'group'
            {
             before(grammarAccess.getGroupAccess().getGroupKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__Group__Group__0__Impl1482); 
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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:757:1: rule__Group__Group__1 : rule__Group__Group__1__Impl rule__Group__Group__2 ;
    public final void rule__Group__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:761:1: ( rule__Group__Group__1__Impl rule__Group__Group__2 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:762:2: rule__Group__Group__1__Impl rule__Group__Group__2
            {
            pushFollow(FOLLOW_rule__Group__Group__1__Impl_in_rule__Group__Group__11513);
            rule__Group__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Group__Group__2_in_rule__Group__Group__11516);
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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:769:1: rule__Group__Group__1__Impl : ( RULE_STRING ) ;
    public final void rule__Group__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:773:1: ( ( RULE_STRING ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:774:1: ( RULE_STRING )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:774:1: ( RULE_STRING )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:775:1: RULE_STRING
            {
             before(grammarAccess.getGroupAccess().getSTRINGTerminalRuleCall_1()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Group__Group__1__Impl1543); 
             after(grammarAccess.getGroupAccess().getSTRINGTerminalRuleCall_1()); 

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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:786:1: rule__Group__Group__2 : rule__Group__Group__2__Impl rule__Group__Group__3 ;
    public final void rule__Group__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:790:1: ( rule__Group__Group__2__Impl rule__Group__Group__3 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:791:2: rule__Group__Group__2__Impl rule__Group__Group__3
            {
            pushFollow(FOLLOW_rule__Group__Group__2__Impl_in_rule__Group__Group__21572);
            rule__Group__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Group__Group__3_in_rule__Group__Group__21575);
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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:798:1: rule__Group__Group__2__Impl : ( '[' ) ;
    public final void rule__Group__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:802:1: ( ( '[' ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:803:1: ( '[' )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:803:1: ( '[' )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:804:1: '['
            {
             before(grammarAccess.getGroupAccess().getLeftSquareBracketKeyword_2()); 
            match(input,16,FOLLOW_16_in_rule__Group__Group__2__Impl1603); 
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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:817:1: rule__Group__Group__3 : rule__Group__Group__3__Impl rule__Group__Group__4 ;
    public final void rule__Group__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:821:1: ( rule__Group__Group__3__Impl rule__Group__Group__4 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:822:2: rule__Group__Group__3__Impl rule__Group__Group__4
            {
            pushFollow(FOLLOW_rule__Group__Group__3__Impl_in_rule__Group__Group__31634);
            rule__Group__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Group__Group__4_in_rule__Group__Group__31637);
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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:829:1: rule__Group__Group__3__Impl : ( ( rule__Group__QuestionsAssignment_3 ) ) ;
    public final void rule__Group__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:833:1: ( ( ( rule__Group__QuestionsAssignment_3 ) ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:834:1: ( ( rule__Group__QuestionsAssignment_3 ) )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:834:1: ( ( rule__Group__QuestionsAssignment_3 ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:835:1: ( rule__Group__QuestionsAssignment_3 )
            {
             before(grammarAccess.getGroupAccess().getQuestionsAssignment_3()); 
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:836:1: ( rule__Group__QuestionsAssignment_3 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:836:2: rule__Group__QuestionsAssignment_3
            {
            pushFollow(FOLLOW_rule__Group__QuestionsAssignment_3_in_rule__Group__Group__3__Impl1664);
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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:846:1: rule__Group__Group__4 : rule__Group__Group__4__Impl rule__Group__Group__5 ;
    public final void rule__Group__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:850:1: ( rule__Group__Group__4__Impl rule__Group__Group__5 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:851:2: rule__Group__Group__4__Impl rule__Group__Group__5
            {
            pushFollow(FOLLOW_rule__Group__Group__4__Impl_in_rule__Group__Group__41694);
            rule__Group__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Group__Group__5_in_rule__Group__Group__41697);
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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:858:1: rule__Group__Group__4__Impl : ( ( rule__Group__Group_4__0 )* ) ;
    public final void rule__Group__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:862:1: ( ( ( rule__Group__Group_4__0 )* ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:863:1: ( ( rule__Group__Group_4__0 )* )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:863:1: ( ( rule__Group__Group_4__0 )* )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:864:1: ( rule__Group__Group_4__0 )*
            {
             before(grammarAccess.getGroupAccess().getGroup_4()); 
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:865:1: ( rule__Group__Group_4__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==18) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:865:2: rule__Group__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Group__Group_4__0_in_rule__Group__Group__4__Impl1724);
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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:875:1: rule__Group__Group__5 : rule__Group__Group__5__Impl ;
    public final void rule__Group__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:879:1: ( rule__Group__Group__5__Impl )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:880:2: rule__Group__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Group__Group__5__Impl_in_rule__Group__Group__51755);
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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:886:1: rule__Group__Group__5__Impl : ( ']' ) ;
    public final void rule__Group__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:890:1: ( ( ']' ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:891:1: ( ']' )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:891:1: ( ']' )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:892:1: ']'
            {
             before(grammarAccess.getGroupAccess().getRightSquareBracketKeyword_5()); 
            match(input,17,FOLLOW_17_in_rule__Group__Group__5__Impl1783); 
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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:917:1: rule__Group__Group_4__0 : rule__Group__Group_4__0__Impl rule__Group__Group_4__1 ;
    public final void rule__Group__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:921:1: ( rule__Group__Group_4__0__Impl rule__Group__Group_4__1 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:922:2: rule__Group__Group_4__0__Impl rule__Group__Group_4__1
            {
            pushFollow(FOLLOW_rule__Group__Group_4__0__Impl_in_rule__Group__Group_4__01826);
            rule__Group__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Group__Group_4__1_in_rule__Group__Group_4__01829);
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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:929:1: rule__Group__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Group__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:933:1: ( ( ',' ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:934:1: ( ',' )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:934:1: ( ',' )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:935:1: ','
            {
             before(grammarAccess.getGroupAccess().getCommaKeyword_4_0()); 
            match(input,18,FOLLOW_18_in_rule__Group__Group_4__0__Impl1857); 
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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:948:1: rule__Group__Group_4__1 : rule__Group__Group_4__1__Impl ;
    public final void rule__Group__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:952:1: ( rule__Group__Group_4__1__Impl )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:953:2: rule__Group__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Group__Group_4__1__Impl_in_rule__Group__Group_4__11888);
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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:959:1: rule__Group__Group_4__1__Impl : ( ( rule__Group__QuestionsAssignment_4_1 ) ) ;
    public final void rule__Group__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:963:1: ( ( ( rule__Group__QuestionsAssignment_4_1 ) ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:964:1: ( ( rule__Group__QuestionsAssignment_4_1 ) )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:964:1: ( ( rule__Group__QuestionsAssignment_4_1 ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:965:1: ( rule__Group__QuestionsAssignment_4_1 )
            {
             before(grammarAccess.getGroupAccess().getQuestionsAssignment_4_1()); 
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:966:1: ( rule__Group__QuestionsAssignment_4_1 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:966:2: rule__Group__QuestionsAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Group__QuestionsAssignment_4_1_in_rule__Group__Group_4__1__Impl1915);
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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:980:1: rule__OpenQuestion__Group__0 : rule__OpenQuestion__Group__0__Impl rule__OpenQuestion__Group__1 ;
    public final void rule__OpenQuestion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:984:1: ( rule__OpenQuestion__Group__0__Impl rule__OpenQuestion__Group__1 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:985:2: rule__OpenQuestion__Group__0__Impl rule__OpenQuestion__Group__1
            {
            pushFollow(FOLLOW_rule__OpenQuestion__Group__0__Impl_in_rule__OpenQuestion__Group__01949);
            rule__OpenQuestion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OpenQuestion__Group__1_in_rule__OpenQuestion__Group__01952);
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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:992:1: rule__OpenQuestion__Group__0__Impl : ( ( rule__OpenQuestion__Alternatives_0 )? ) ;
    public final void rule__OpenQuestion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:996:1: ( ( ( rule__OpenQuestion__Alternatives_0 )? ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:997:1: ( ( rule__OpenQuestion__Alternatives_0 )? )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:997:1: ( ( rule__OpenQuestion__Alternatives_0 )? )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:998:1: ( rule__OpenQuestion__Alternatives_0 )?
            {
             before(grammarAccess.getOpenQuestionAccess().getAlternatives_0()); 
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:999:1: ( rule__OpenQuestion__Alternatives_0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=11 && LA7_0<=12)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:999:2: rule__OpenQuestion__Alternatives_0
                    {
                    pushFollow(FOLLOW_rule__OpenQuestion__Alternatives_0_in_rule__OpenQuestion__Group__0__Impl1979);
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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1009:1: rule__OpenQuestion__Group__1 : rule__OpenQuestion__Group__1__Impl rule__OpenQuestion__Group__2 ;
    public final void rule__OpenQuestion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1013:1: ( rule__OpenQuestion__Group__1__Impl rule__OpenQuestion__Group__2 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1014:2: rule__OpenQuestion__Group__1__Impl rule__OpenQuestion__Group__2
            {
            pushFollow(FOLLOW_rule__OpenQuestion__Group__1__Impl_in_rule__OpenQuestion__Group__12010);
            rule__OpenQuestion__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OpenQuestion__Group__2_in_rule__OpenQuestion__Group__12013);
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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1021:1: rule__OpenQuestion__Group__1__Impl : ( 'open question' ) ;
    public final void rule__OpenQuestion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1025:1: ( ( 'open question' ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1026:1: ( 'open question' )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1026:1: ( 'open question' )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1027:1: 'open question'
            {
             before(grammarAccess.getOpenQuestionAccess().getOpenQuestionKeyword_1()); 
            match(input,20,FOLLOW_20_in_rule__OpenQuestion__Group__1__Impl2041); 
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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1040:1: rule__OpenQuestion__Group__2 : rule__OpenQuestion__Group__2__Impl ;
    public final void rule__OpenQuestion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1044:1: ( rule__OpenQuestion__Group__2__Impl )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1045:2: rule__OpenQuestion__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__OpenQuestion__Group__2__Impl_in_rule__OpenQuestion__Group__22072);
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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1051:1: rule__OpenQuestion__Group__2__Impl : ( ( rule__OpenQuestion__NameAssignment_2 ) ) ;
    public final void rule__OpenQuestion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1055:1: ( ( ( rule__OpenQuestion__NameAssignment_2 ) ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1056:1: ( ( rule__OpenQuestion__NameAssignment_2 ) )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1056:1: ( ( rule__OpenQuestion__NameAssignment_2 ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1057:1: ( rule__OpenQuestion__NameAssignment_2 )
            {
             before(grammarAccess.getOpenQuestionAccess().getNameAssignment_2()); 
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1058:1: ( rule__OpenQuestion__NameAssignment_2 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1058:2: rule__OpenQuestion__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__OpenQuestion__NameAssignment_2_in_rule__OpenQuestion__Group__2__Impl2099);
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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1074:1: rule__ClosedQuestion__Group__0 : rule__ClosedQuestion__Group__0__Impl rule__ClosedQuestion__Group__1 ;
    public final void rule__ClosedQuestion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1078:1: ( rule__ClosedQuestion__Group__0__Impl rule__ClosedQuestion__Group__1 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1079:2: rule__ClosedQuestion__Group__0__Impl rule__ClosedQuestion__Group__1
            {
            pushFollow(FOLLOW_rule__ClosedQuestion__Group__0__Impl_in_rule__ClosedQuestion__Group__02135);
            rule__ClosedQuestion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClosedQuestion__Group__1_in_rule__ClosedQuestion__Group__02138);
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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1086:1: rule__ClosedQuestion__Group__0__Impl : ( 'closed question allowing' ) ;
    public final void rule__ClosedQuestion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1090:1: ( ( 'closed question allowing' ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1091:1: ( 'closed question allowing' )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1091:1: ( 'closed question allowing' )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1092:1: 'closed question allowing'
            {
             before(grammarAccess.getClosedQuestionAccess().getClosedQuestionAllowingKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__ClosedQuestion__Group__0__Impl2166); 
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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1105:1: rule__ClosedQuestion__Group__1 : rule__ClosedQuestion__Group__1__Impl rule__ClosedQuestion__Group__2 ;
    public final void rule__ClosedQuestion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1109:1: ( rule__ClosedQuestion__Group__1__Impl rule__ClosedQuestion__Group__2 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1110:2: rule__ClosedQuestion__Group__1__Impl rule__ClosedQuestion__Group__2
            {
            pushFollow(FOLLOW_rule__ClosedQuestion__Group__1__Impl_in_rule__ClosedQuestion__Group__12197);
            rule__ClosedQuestion__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClosedQuestion__Group__2_in_rule__ClosedQuestion__Group__12200);
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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1117:1: rule__ClosedQuestion__Group__1__Impl : ( ( rule__ClosedQuestion__Alternatives_1 ) ) ;
    public final void rule__ClosedQuestion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1121:1: ( ( ( rule__ClosedQuestion__Alternatives_1 ) ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1122:1: ( ( rule__ClosedQuestion__Alternatives_1 ) )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1122:1: ( ( rule__ClosedQuestion__Alternatives_1 ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1123:1: ( rule__ClosedQuestion__Alternatives_1 )
            {
             before(grammarAccess.getClosedQuestionAccess().getAlternatives_1()); 
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1124:1: ( rule__ClosedQuestion__Alternatives_1 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1124:2: rule__ClosedQuestion__Alternatives_1
            {
            pushFollow(FOLLOW_rule__ClosedQuestion__Alternatives_1_in_rule__ClosedQuestion__Group__1__Impl2227);
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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1134:1: rule__ClosedQuestion__Group__2 : rule__ClosedQuestion__Group__2__Impl rule__ClosedQuestion__Group__3 ;
    public final void rule__ClosedQuestion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1138:1: ( rule__ClosedQuestion__Group__2__Impl rule__ClosedQuestion__Group__3 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1139:2: rule__ClosedQuestion__Group__2__Impl rule__ClosedQuestion__Group__3
            {
            pushFollow(FOLLOW_rule__ClosedQuestion__Group__2__Impl_in_rule__ClosedQuestion__Group__22257);
            rule__ClosedQuestion__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClosedQuestion__Group__3_in_rule__ClosedQuestion__Group__22260);
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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1146:1: rule__ClosedQuestion__Group__2__Impl : ( ( rule__ClosedQuestion__NameAssignment_2 ) ) ;
    public final void rule__ClosedQuestion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1150:1: ( ( ( rule__ClosedQuestion__NameAssignment_2 ) ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1151:1: ( ( rule__ClosedQuestion__NameAssignment_2 ) )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1151:1: ( ( rule__ClosedQuestion__NameAssignment_2 ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1152:1: ( rule__ClosedQuestion__NameAssignment_2 )
            {
             before(grammarAccess.getClosedQuestionAccess().getNameAssignment_2()); 
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1153:1: ( rule__ClosedQuestion__NameAssignment_2 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1153:2: rule__ClosedQuestion__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__ClosedQuestion__NameAssignment_2_in_rule__ClosedQuestion__Group__2__Impl2287);
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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1163:1: rule__ClosedQuestion__Group__3 : rule__ClosedQuestion__Group__3__Impl rule__ClosedQuestion__Group__4 ;
    public final void rule__ClosedQuestion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1167:1: ( rule__ClosedQuestion__Group__3__Impl rule__ClosedQuestion__Group__4 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1168:2: rule__ClosedQuestion__Group__3__Impl rule__ClosedQuestion__Group__4
            {
            pushFollow(FOLLOW_rule__ClosedQuestion__Group__3__Impl_in_rule__ClosedQuestion__Group__32317);
            rule__ClosedQuestion__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClosedQuestion__Group__4_in_rule__ClosedQuestion__Group__32320);
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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1175:1: rule__ClosedQuestion__Group__3__Impl : ( 'answers' ) ;
    public final void rule__ClosedQuestion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1179:1: ( ( 'answers' ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1180:1: ( 'answers' )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1180:1: ( 'answers' )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1181:1: 'answers'
            {
             before(grammarAccess.getClosedQuestionAccess().getAnswersKeyword_3()); 
            match(input,22,FOLLOW_22_in_rule__ClosedQuestion__Group__3__Impl2348); 
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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1194:1: rule__ClosedQuestion__Group__4 : rule__ClosedQuestion__Group__4__Impl rule__ClosedQuestion__Group__5 ;
    public final void rule__ClosedQuestion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1198:1: ( rule__ClosedQuestion__Group__4__Impl rule__ClosedQuestion__Group__5 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1199:2: rule__ClosedQuestion__Group__4__Impl rule__ClosedQuestion__Group__5
            {
            pushFollow(FOLLOW_rule__ClosedQuestion__Group__4__Impl_in_rule__ClosedQuestion__Group__42379);
            rule__ClosedQuestion__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClosedQuestion__Group__5_in_rule__ClosedQuestion__Group__42382);
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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1206:1: rule__ClosedQuestion__Group__4__Impl : ( '[' ) ;
    public final void rule__ClosedQuestion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1210:1: ( ( '[' ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1211:1: ( '[' )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1211:1: ( '[' )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1212:1: '['
            {
             before(grammarAccess.getClosedQuestionAccess().getLeftSquareBracketKeyword_4()); 
            match(input,16,FOLLOW_16_in_rule__ClosedQuestion__Group__4__Impl2410); 
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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1225:1: rule__ClosedQuestion__Group__5 : rule__ClosedQuestion__Group__5__Impl rule__ClosedQuestion__Group__6 ;
    public final void rule__ClosedQuestion__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1229:1: ( rule__ClosedQuestion__Group__5__Impl rule__ClosedQuestion__Group__6 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1230:2: rule__ClosedQuestion__Group__5__Impl rule__ClosedQuestion__Group__6
            {
            pushFollow(FOLLOW_rule__ClosedQuestion__Group__5__Impl_in_rule__ClosedQuestion__Group__52441);
            rule__ClosedQuestion__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClosedQuestion__Group__6_in_rule__ClosedQuestion__Group__52444);
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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1237:1: rule__ClosedQuestion__Group__5__Impl : ( ( rule__ClosedQuestion__AnswersAssignment_5 ) ) ;
    public final void rule__ClosedQuestion__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1241:1: ( ( ( rule__ClosedQuestion__AnswersAssignment_5 ) ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1242:1: ( ( rule__ClosedQuestion__AnswersAssignment_5 ) )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1242:1: ( ( rule__ClosedQuestion__AnswersAssignment_5 ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1243:1: ( rule__ClosedQuestion__AnswersAssignment_5 )
            {
             before(grammarAccess.getClosedQuestionAccess().getAnswersAssignment_5()); 
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1244:1: ( rule__ClosedQuestion__AnswersAssignment_5 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1244:2: rule__ClosedQuestion__AnswersAssignment_5
            {
            pushFollow(FOLLOW_rule__ClosedQuestion__AnswersAssignment_5_in_rule__ClosedQuestion__Group__5__Impl2471);
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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1254:1: rule__ClosedQuestion__Group__6 : rule__ClosedQuestion__Group__6__Impl rule__ClosedQuestion__Group__7 ;
    public final void rule__ClosedQuestion__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1258:1: ( rule__ClosedQuestion__Group__6__Impl rule__ClosedQuestion__Group__7 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1259:2: rule__ClosedQuestion__Group__6__Impl rule__ClosedQuestion__Group__7
            {
            pushFollow(FOLLOW_rule__ClosedQuestion__Group__6__Impl_in_rule__ClosedQuestion__Group__62501);
            rule__ClosedQuestion__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClosedQuestion__Group__7_in_rule__ClosedQuestion__Group__62504);
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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1266:1: rule__ClosedQuestion__Group__6__Impl : ( ( rule__ClosedQuestion__Group_6__0 )* ) ;
    public final void rule__ClosedQuestion__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1270:1: ( ( ( rule__ClosedQuestion__Group_6__0 )* ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1271:1: ( ( rule__ClosedQuestion__Group_6__0 )* )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1271:1: ( ( rule__ClosedQuestion__Group_6__0 )* )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1272:1: ( rule__ClosedQuestion__Group_6__0 )*
            {
             before(grammarAccess.getClosedQuestionAccess().getGroup_6()); 
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1273:1: ( rule__ClosedQuestion__Group_6__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==18) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1273:2: rule__ClosedQuestion__Group_6__0
            	    {
            	    pushFollow(FOLLOW_rule__ClosedQuestion__Group_6__0_in_rule__ClosedQuestion__Group__6__Impl2531);
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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1283:1: rule__ClosedQuestion__Group__7 : rule__ClosedQuestion__Group__7__Impl rule__ClosedQuestion__Group__8 ;
    public final void rule__ClosedQuestion__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1287:1: ( rule__ClosedQuestion__Group__7__Impl rule__ClosedQuestion__Group__8 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1288:2: rule__ClosedQuestion__Group__7__Impl rule__ClosedQuestion__Group__8
            {
            pushFollow(FOLLOW_rule__ClosedQuestion__Group__7__Impl_in_rule__ClosedQuestion__Group__72562);
            rule__ClosedQuestion__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClosedQuestion__Group__8_in_rule__ClosedQuestion__Group__72565);
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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1295:1: rule__ClosedQuestion__Group__7__Impl : ( ']' ) ;
    public final void rule__ClosedQuestion__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1299:1: ( ( ']' ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1300:1: ( ']' )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1300:1: ( ']' )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1301:1: ']'
            {
             before(grammarAccess.getClosedQuestionAccess().getRightSquareBracketKeyword_7()); 
            match(input,17,FOLLOW_17_in_rule__ClosedQuestion__Group__7__Impl2593); 
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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1314:1: rule__ClosedQuestion__Group__8 : rule__ClosedQuestion__Group__8__Impl ;
    public final void rule__ClosedQuestion__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1318:1: ( rule__ClosedQuestion__Group__8__Impl )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1319:2: rule__ClosedQuestion__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__ClosedQuestion__Group__8__Impl_in_rule__ClosedQuestion__Group__82624);
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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1325:1: rule__ClosedQuestion__Group__8__Impl : ( ( rule__ClosedQuestion__Group_8__0 )? ) ;
    public final void rule__ClosedQuestion__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1329:1: ( ( ( rule__ClosedQuestion__Group_8__0 )? ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1330:1: ( ( rule__ClosedQuestion__Group_8__0 )? )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1330:1: ( ( rule__ClosedQuestion__Group_8__0 )? )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1331:1: ( rule__ClosedQuestion__Group_8__0 )?
            {
             before(grammarAccess.getClosedQuestionAccess().getGroup_8()); 
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1332:1: ( rule__ClosedQuestion__Group_8__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1332:2: rule__ClosedQuestion__Group_8__0
                    {
                    pushFollow(FOLLOW_rule__ClosedQuestion__Group_8__0_in_rule__ClosedQuestion__Group__8__Impl2651);
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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1360:1: rule__ClosedQuestion__Group_6__0 : rule__ClosedQuestion__Group_6__0__Impl rule__ClosedQuestion__Group_6__1 ;
    public final void rule__ClosedQuestion__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1364:1: ( rule__ClosedQuestion__Group_6__0__Impl rule__ClosedQuestion__Group_6__1 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1365:2: rule__ClosedQuestion__Group_6__0__Impl rule__ClosedQuestion__Group_6__1
            {
            pushFollow(FOLLOW_rule__ClosedQuestion__Group_6__0__Impl_in_rule__ClosedQuestion__Group_6__02700);
            rule__ClosedQuestion__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClosedQuestion__Group_6__1_in_rule__ClosedQuestion__Group_6__02703);
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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1372:1: rule__ClosedQuestion__Group_6__0__Impl : ( ',' ) ;
    public final void rule__ClosedQuestion__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1376:1: ( ( ',' ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1377:1: ( ',' )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1377:1: ( ',' )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1378:1: ','
            {
             before(grammarAccess.getClosedQuestionAccess().getCommaKeyword_6_0()); 
            match(input,18,FOLLOW_18_in_rule__ClosedQuestion__Group_6__0__Impl2731); 
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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1391:1: rule__ClosedQuestion__Group_6__1 : rule__ClosedQuestion__Group_6__1__Impl ;
    public final void rule__ClosedQuestion__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1395:1: ( rule__ClosedQuestion__Group_6__1__Impl )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1396:2: rule__ClosedQuestion__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__ClosedQuestion__Group_6__1__Impl_in_rule__ClosedQuestion__Group_6__12762);
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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1402:1: rule__ClosedQuestion__Group_6__1__Impl : ( ( rule__ClosedQuestion__AnswersAssignment_6_1 ) ) ;
    public final void rule__ClosedQuestion__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1406:1: ( ( ( rule__ClosedQuestion__AnswersAssignment_6_1 ) ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1407:1: ( ( rule__ClosedQuestion__AnswersAssignment_6_1 ) )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1407:1: ( ( rule__ClosedQuestion__AnswersAssignment_6_1 ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1408:1: ( rule__ClosedQuestion__AnswersAssignment_6_1 )
            {
             before(grammarAccess.getClosedQuestionAccess().getAnswersAssignment_6_1()); 
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1409:1: ( rule__ClosedQuestion__AnswersAssignment_6_1 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1409:2: rule__ClosedQuestion__AnswersAssignment_6_1
            {
            pushFollow(FOLLOW_rule__ClosedQuestion__AnswersAssignment_6_1_in_rule__ClosedQuestion__Group_6__1__Impl2789);
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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1423:1: rule__ClosedQuestion__Group_8__0 : rule__ClosedQuestion__Group_8__0__Impl rule__ClosedQuestion__Group_8__1 ;
    public final void rule__ClosedQuestion__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1427:1: ( rule__ClosedQuestion__Group_8__0__Impl rule__ClosedQuestion__Group_8__1 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1428:2: rule__ClosedQuestion__Group_8__0__Impl rule__ClosedQuestion__Group_8__1
            {
            pushFollow(FOLLOW_rule__ClosedQuestion__Group_8__0__Impl_in_rule__ClosedQuestion__Group_8__02823);
            rule__ClosedQuestion__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClosedQuestion__Group_8__1_in_rule__ClosedQuestion__Group_8__02826);
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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1435:1: rule__ClosedQuestion__Group_8__0__Impl : ( 'default answer is' ) ;
    public final void rule__ClosedQuestion__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1439:1: ( ( 'default answer is' ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1440:1: ( 'default answer is' )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1440:1: ( 'default answer is' )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1441:1: 'default answer is'
            {
             before(grammarAccess.getClosedQuestionAccess().getDefaultAnswerIsKeyword_8_0()); 
            match(input,23,FOLLOW_23_in_rule__ClosedQuestion__Group_8__0__Impl2854); 
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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1454:1: rule__ClosedQuestion__Group_8__1 : rule__ClosedQuestion__Group_8__1__Impl ;
    public final void rule__ClosedQuestion__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1458:1: ( rule__ClosedQuestion__Group_8__1__Impl )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1459:2: rule__ClosedQuestion__Group_8__1__Impl
            {
            pushFollow(FOLLOW_rule__ClosedQuestion__Group_8__1__Impl_in_rule__ClosedQuestion__Group_8__12885);
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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1465:1: rule__ClosedQuestion__Group_8__1__Impl : ( ( rule__ClosedQuestion__DefaultAssignment_8_1 ) ) ;
    public final void rule__ClosedQuestion__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1469:1: ( ( ( rule__ClosedQuestion__DefaultAssignment_8_1 ) ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1470:1: ( ( rule__ClosedQuestion__DefaultAssignment_8_1 ) )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1470:1: ( ( rule__ClosedQuestion__DefaultAssignment_8_1 ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1471:1: ( rule__ClosedQuestion__DefaultAssignment_8_1 )
            {
             before(grammarAccess.getClosedQuestionAccess().getDefaultAssignment_8_1()); 
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1472:1: ( rule__ClosedQuestion__DefaultAssignment_8_1 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1472:2: rule__ClosedQuestion__DefaultAssignment_8_1
            {
            pushFollow(FOLLOW_rule__ClosedQuestion__DefaultAssignment_8_1_in_rule__ClosedQuestion__Group_8__1__Impl2912);
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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1486:1: rule__LikertQuestion__Group__0 : rule__LikertQuestion__Group__0__Impl rule__LikertQuestion__Group__1 ;
    public final void rule__LikertQuestion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1490:1: ( rule__LikertQuestion__Group__0__Impl rule__LikertQuestion__Group__1 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1491:2: rule__LikertQuestion__Group__0__Impl rule__LikertQuestion__Group__1
            {
            pushFollow(FOLLOW_rule__LikertQuestion__Group__0__Impl_in_rule__LikertQuestion__Group__02946);
            rule__LikertQuestion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LikertQuestion__Group__1_in_rule__LikertQuestion__Group__02949);
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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1498:1: rule__LikertQuestion__Group__0__Impl : ( 'likert question' ) ;
    public final void rule__LikertQuestion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1502:1: ( ( 'likert question' ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1503:1: ( 'likert question' )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1503:1: ( 'likert question' )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1504:1: 'likert question'
            {
             before(grammarAccess.getLikertQuestionAccess().getLikertQuestionKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__LikertQuestion__Group__0__Impl2977); 
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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1517:1: rule__LikertQuestion__Group__1 : rule__LikertQuestion__Group__1__Impl rule__LikertQuestion__Group__2 ;
    public final void rule__LikertQuestion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1521:1: ( rule__LikertQuestion__Group__1__Impl rule__LikertQuestion__Group__2 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1522:2: rule__LikertQuestion__Group__1__Impl rule__LikertQuestion__Group__2
            {
            pushFollow(FOLLOW_rule__LikertQuestion__Group__1__Impl_in_rule__LikertQuestion__Group__13008);
            rule__LikertQuestion__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LikertQuestion__Group__2_in_rule__LikertQuestion__Group__13011);
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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1529:1: rule__LikertQuestion__Group__1__Impl : ( ( rule__LikertQuestion__NameAssignment_1 ) ) ;
    public final void rule__LikertQuestion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1533:1: ( ( ( rule__LikertQuestion__NameAssignment_1 ) ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1534:1: ( ( rule__LikertQuestion__NameAssignment_1 ) )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1534:1: ( ( rule__LikertQuestion__NameAssignment_1 ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1535:1: ( rule__LikertQuestion__NameAssignment_1 )
            {
             before(grammarAccess.getLikertQuestionAccess().getNameAssignment_1()); 
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1536:1: ( rule__LikertQuestion__NameAssignment_1 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1536:2: rule__LikertQuestion__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__LikertQuestion__NameAssignment_1_in_rule__LikertQuestion__Group__1__Impl3038);
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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1546:1: rule__LikertQuestion__Group__2 : rule__LikertQuestion__Group__2__Impl rule__LikertQuestion__Group__3 ;
    public final void rule__LikertQuestion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1550:1: ( rule__LikertQuestion__Group__2__Impl rule__LikertQuestion__Group__3 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1551:2: rule__LikertQuestion__Group__2__Impl rule__LikertQuestion__Group__3
            {
            pushFollow(FOLLOW_rule__LikertQuestion__Group__2__Impl_in_rule__LikertQuestion__Group__23068);
            rule__LikertQuestion__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LikertQuestion__Group__3_in_rule__LikertQuestion__Group__23071);
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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1558:1: rule__LikertQuestion__Group__2__Impl : ( '(' ) ;
    public final void rule__LikertQuestion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1562:1: ( ( '(' ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1563:1: ( '(' )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1563:1: ( '(' )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1564:1: '('
            {
             before(grammarAccess.getLikertQuestionAccess().getLeftParenthesisKeyword_2()); 
            match(input,25,FOLLOW_25_in_rule__LikertQuestion__Group__2__Impl3099); 
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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1577:1: rule__LikertQuestion__Group__3 : rule__LikertQuestion__Group__3__Impl rule__LikertQuestion__Group__4 ;
    public final void rule__LikertQuestion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1581:1: ( rule__LikertQuestion__Group__3__Impl rule__LikertQuestion__Group__4 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1582:2: rule__LikertQuestion__Group__3__Impl rule__LikertQuestion__Group__4
            {
            pushFollow(FOLLOW_rule__LikertQuestion__Group__3__Impl_in_rule__LikertQuestion__Group__33130);
            rule__LikertQuestion__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LikertQuestion__Group__4_in_rule__LikertQuestion__Group__33133);
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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1589:1: rule__LikertQuestion__Group__3__Impl : ( ( rule__LikertQuestion__FromAssignment_3 ) ) ;
    public final void rule__LikertQuestion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1593:1: ( ( ( rule__LikertQuestion__FromAssignment_3 ) ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1594:1: ( ( rule__LikertQuestion__FromAssignment_3 ) )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1594:1: ( ( rule__LikertQuestion__FromAssignment_3 ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1595:1: ( rule__LikertQuestion__FromAssignment_3 )
            {
             before(grammarAccess.getLikertQuestionAccess().getFromAssignment_3()); 
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1596:1: ( rule__LikertQuestion__FromAssignment_3 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1596:2: rule__LikertQuestion__FromAssignment_3
            {
            pushFollow(FOLLOW_rule__LikertQuestion__FromAssignment_3_in_rule__LikertQuestion__Group__3__Impl3160);
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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1606:1: rule__LikertQuestion__Group__4 : rule__LikertQuestion__Group__4__Impl rule__LikertQuestion__Group__5 ;
    public final void rule__LikertQuestion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1610:1: ( rule__LikertQuestion__Group__4__Impl rule__LikertQuestion__Group__5 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1611:2: rule__LikertQuestion__Group__4__Impl rule__LikertQuestion__Group__5
            {
            pushFollow(FOLLOW_rule__LikertQuestion__Group__4__Impl_in_rule__LikertQuestion__Group__43190);
            rule__LikertQuestion__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LikertQuestion__Group__5_in_rule__LikertQuestion__Group__43193);
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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1618:1: rule__LikertQuestion__Group__4__Impl : ( '..' ) ;
    public final void rule__LikertQuestion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1622:1: ( ( '..' ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1623:1: ( '..' )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1623:1: ( '..' )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1624:1: '..'
            {
             before(grammarAccess.getLikertQuestionAccess().getFullStopFullStopKeyword_4()); 
            match(input,26,FOLLOW_26_in_rule__LikertQuestion__Group__4__Impl3221); 
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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1637:1: rule__LikertQuestion__Group__5 : rule__LikertQuestion__Group__5__Impl rule__LikertQuestion__Group__6 ;
    public final void rule__LikertQuestion__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1641:1: ( rule__LikertQuestion__Group__5__Impl rule__LikertQuestion__Group__6 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1642:2: rule__LikertQuestion__Group__5__Impl rule__LikertQuestion__Group__6
            {
            pushFollow(FOLLOW_rule__LikertQuestion__Group__5__Impl_in_rule__LikertQuestion__Group__53252);
            rule__LikertQuestion__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LikertQuestion__Group__6_in_rule__LikertQuestion__Group__53255);
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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1649:1: rule__LikertQuestion__Group__5__Impl : ( ( rule__LikertQuestion__ToAssignment_5 ) ) ;
    public final void rule__LikertQuestion__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1653:1: ( ( ( rule__LikertQuestion__ToAssignment_5 ) ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1654:1: ( ( rule__LikertQuestion__ToAssignment_5 ) )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1654:1: ( ( rule__LikertQuestion__ToAssignment_5 ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1655:1: ( rule__LikertQuestion__ToAssignment_5 )
            {
             before(grammarAccess.getLikertQuestionAccess().getToAssignment_5()); 
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1656:1: ( rule__LikertQuestion__ToAssignment_5 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1656:2: rule__LikertQuestion__ToAssignment_5
            {
            pushFollow(FOLLOW_rule__LikertQuestion__ToAssignment_5_in_rule__LikertQuestion__Group__5__Impl3282);
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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1666:1: rule__LikertQuestion__Group__6 : rule__LikertQuestion__Group__6__Impl ;
    public final void rule__LikertQuestion__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1670:1: ( rule__LikertQuestion__Group__6__Impl )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1671:2: rule__LikertQuestion__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__LikertQuestion__Group__6__Impl_in_rule__LikertQuestion__Group__63312);
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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1677:1: rule__LikertQuestion__Group__6__Impl : ( ')' ) ;
    public final void rule__LikertQuestion__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1681:1: ( ( ')' ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1682:1: ( ')' )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1682:1: ( ')' )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1683:1: ')'
            {
             before(grammarAccess.getLikertQuestionAccess().getRightParenthesisKeyword_6()); 
            match(input,27,FOLLOW_27_in_rule__LikertQuestion__Group__6__Impl3340); 
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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1710:1: rule__Answer__Group__0 : rule__Answer__Group__0__Impl rule__Answer__Group__1 ;
    public final void rule__Answer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1714:1: ( rule__Answer__Group__0__Impl rule__Answer__Group__1 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1715:2: rule__Answer__Group__0__Impl rule__Answer__Group__1
            {
            pushFollow(FOLLOW_rule__Answer__Group__0__Impl_in_rule__Answer__Group__03385);
            rule__Answer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Answer__Group__1_in_rule__Answer__Group__03388);
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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1722:1: rule__Answer__Group__0__Impl : ( ( rule__Answer__Alternatives_0 ) ) ;
    public final void rule__Answer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1726:1: ( ( ( rule__Answer__Alternatives_0 ) ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1727:1: ( ( rule__Answer__Alternatives_0 ) )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1727:1: ( ( rule__Answer__Alternatives_0 ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1728:1: ( rule__Answer__Alternatives_0 )
            {
             before(grammarAccess.getAnswerAccess().getAlternatives_0()); 
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1729:1: ( rule__Answer__Alternatives_0 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1729:2: rule__Answer__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Answer__Alternatives_0_in_rule__Answer__Group__0__Impl3415);
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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1739:1: rule__Answer__Group__1 : rule__Answer__Group__1__Impl ;
    public final void rule__Answer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1743:1: ( rule__Answer__Group__1__Impl )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1744:2: rule__Answer__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Answer__Group__1__Impl_in_rule__Answer__Group__13445);
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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1750:1: rule__Answer__Group__1__Impl : ( ( rule__Answer__EnablesAssignment_1 )? ) ;
    public final void rule__Answer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1754:1: ( ( ( rule__Answer__EnablesAssignment_1 )? ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1755:1: ( ( rule__Answer__EnablesAssignment_1 )? )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1755:1: ( ( rule__Answer__EnablesAssignment_1 )? )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1756:1: ( rule__Answer__EnablesAssignment_1 )?
            {
             before(grammarAccess.getAnswerAccess().getEnablesAssignment_1()); 
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1757:1: ( rule__Answer__EnablesAssignment_1 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==29) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1757:2: rule__Answer__EnablesAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Answer__EnablesAssignment_1_in_rule__Answer__Group__1__Impl3472);
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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1771:1: rule__InputAnswer__Group__0 : rule__InputAnswer__Group__0__Impl rule__InputAnswer__Group__1 ;
    public final void rule__InputAnswer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1775:1: ( rule__InputAnswer__Group__0__Impl rule__InputAnswer__Group__1 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1776:2: rule__InputAnswer__Group__0__Impl rule__InputAnswer__Group__1
            {
            pushFollow(FOLLOW_rule__InputAnswer__Group__0__Impl_in_rule__InputAnswer__Group__03507);
            rule__InputAnswer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InputAnswer__Group__1_in_rule__InputAnswer__Group__03510);
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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1783:1: rule__InputAnswer__Group__0__Impl : ( ( rule__InputAnswer__NameAssignment_0 ) ) ;
    public final void rule__InputAnswer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1787:1: ( ( ( rule__InputAnswer__NameAssignment_0 ) ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1788:1: ( ( rule__InputAnswer__NameAssignment_0 ) )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1788:1: ( ( rule__InputAnswer__NameAssignment_0 ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1789:1: ( rule__InputAnswer__NameAssignment_0 )
            {
             before(grammarAccess.getInputAnswerAccess().getNameAssignment_0()); 
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1790:1: ( rule__InputAnswer__NameAssignment_0 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1790:2: rule__InputAnswer__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__InputAnswer__NameAssignment_0_in_rule__InputAnswer__Group__0__Impl3537);
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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1800:1: rule__InputAnswer__Group__1 : rule__InputAnswer__Group__1__Impl ;
    public final void rule__InputAnswer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1804:1: ( rule__InputAnswer__Group__1__Impl )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1805:2: rule__InputAnswer__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__InputAnswer__Group__1__Impl_in_rule__InputAnswer__Group__13567);
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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1811:1: rule__InputAnswer__Group__1__Impl : ( '...' ) ;
    public final void rule__InputAnswer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1815:1: ( ( '...' ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1816:1: ( '...' )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1816:1: ( '...' )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1817:1: '...'
            {
             before(grammarAccess.getInputAnswerAccess().getFullStopFullStopFullStopKeyword_1()); 
            match(input,28,FOLLOW_28_in_rule__InputAnswer__Group__1__Impl3595); 
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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1834:1: rule__EnablesQuestion__Group__0 : rule__EnablesQuestion__Group__0__Impl rule__EnablesQuestion__Group__1 ;
    public final void rule__EnablesQuestion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1838:1: ( rule__EnablesQuestion__Group__0__Impl rule__EnablesQuestion__Group__1 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1839:2: rule__EnablesQuestion__Group__0__Impl rule__EnablesQuestion__Group__1
            {
            pushFollow(FOLLOW_rule__EnablesQuestion__Group__0__Impl_in_rule__EnablesQuestion__Group__03630);
            rule__EnablesQuestion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnablesQuestion__Group__1_in_rule__EnablesQuestion__Group__03633);
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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1846:1: rule__EnablesQuestion__Group__0__Impl : ( 'enables question' ) ;
    public final void rule__EnablesQuestion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1850:1: ( ( 'enables question' ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1851:1: ( 'enables question' )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1851:1: ( 'enables question' )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1852:1: 'enables question'
            {
             before(grammarAccess.getEnablesQuestionAccess().getEnablesQuestionKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__EnablesQuestion__Group__0__Impl3661); 
             after(grammarAccess.getEnablesQuestionAccess().getEnablesQuestionKeyword_0()); 

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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1865:1: rule__EnablesQuestion__Group__1 : rule__EnablesQuestion__Group__1__Impl rule__EnablesQuestion__Group__2 ;
    public final void rule__EnablesQuestion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1869:1: ( rule__EnablesQuestion__Group__1__Impl rule__EnablesQuestion__Group__2 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1870:2: rule__EnablesQuestion__Group__1__Impl rule__EnablesQuestion__Group__2
            {
            pushFollow(FOLLOW_rule__EnablesQuestion__Group__1__Impl_in_rule__EnablesQuestion__Group__13692);
            rule__EnablesQuestion__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnablesQuestion__Group__2_in_rule__EnablesQuestion__Group__13695);
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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1877:1: rule__EnablesQuestion__Group__1__Impl : ( '[' ) ;
    public final void rule__EnablesQuestion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1881:1: ( ( '[' ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1882:1: ( '[' )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1882:1: ( '[' )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1883:1: '['
            {
             before(grammarAccess.getEnablesQuestionAccess().getLeftSquareBracketKeyword_1()); 
            match(input,16,FOLLOW_16_in_rule__EnablesQuestion__Group__1__Impl3723); 
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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1896:1: rule__EnablesQuestion__Group__2 : rule__EnablesQuestion__Group__2__Impl rule__EnablesQuestion__Group__3 ;
    public final void rule__EnablesQuestion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1900:1: ( rule__EnablesQuestion__Group__2__Impl rule__EnablesQuestion__Group__3 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1901:2: rule__EnablesQuestion__Group__2__Impl rule__EnablesQuestion__Group__3
            {
            pushFollow(FOLLOW_rule__EnablesQuestion__Group__2__Impl_in_rule__EnablesQuestion__Group__23754);
            rule__EnablesQuestion__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnablesQuestion__Group__3_in_rule__EnablesQuestion__Group__23757);
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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1908:1: rule__EnablesQuestion__Group__2__Impl : ( ( rule__EnablesQuestion__QuestionAssignment_2 ) ) ;
    public final void rule__EnablesQuestion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1912:1: ( ( ( rule__EnablesQuestion__QuestionAssignment_2 ) ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1913:1: ( ( rule__EnablesQuestion__QuestionAssignment_2 ) )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1913:1: ( ( rule__EnablesQuestion__QuestionAssignment_2 ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1914:1: ( rule__EnablesQuestion__QuestionAssignment_2 )
            {
             before(grammarAccess.getEnablesQuestionAccess().getQuestionAssignment_2()); 
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1915:1: ( rule__EnablesQuestion__QuestionAssignment_2 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1915:2: rule__EnablesQuestion__QuestionAssignment_2
            {
            pushFollow(FOLLOW_rule__EnablesQuestion__QuestionAssignment_2_in_rule__EnablesQuestion__Group__2__Impl3784);
            rule__EnablesQuestion__QuestionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEnablesQuestionAccess().getQuestionAssignment_2()); 

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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1925:1: rule__EnablesQuestion__Group__3 : rule__EnablesQuestion__Group__3__Impl ;
    public final void rule__EnablesQuestion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1929:1: ( rule__EnablesQuestion__Group__3__Impl )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1930:2: rule__EnablesQuestion__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__EnablesQuestion__Group__3__Impl_in_rule__EnablesQuestion__Group__33814);
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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1936:1: rule__EnablesQuestion__Group__3__Impl : ( ']' ) ;
    public final void rule__EnablesQuestion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1940:1: ( ( ']' ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1941:1: ( ']' )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1941:1: ( ']' )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1942:1: ']'
            {
             before(grammarAccess.getEnablesQuestionAccess().getRightSquareBracketKeyword_3()); 
            match(input,17,FOLLOW_17_in_rule__EnablesQuestion__Group__3__Impl3842); 
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


    // $ANTLR start "rule__SINT__Group__0"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1963:1: rule__SINT__Group__0 : rule__SINT__Group__0__Impl rule__SINT__Group__1 ;
    public final void rule__SINT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1967:1: ( rule__SINT__Group__0__Impl rule__SINT__Group__1 )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1968:2: rule__SINT__Group__0__Impl rule__SINT__Group__1
            {
            pushFollow(FOLLOW_rule__SINT__Group__0__Impl_in_rule__SINT__Group__03881);
            rule__SINT__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SINT__Group__1_in_rule__SINT__Group__03884);
            rule__SINT__Group__1();

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
    // $ANTLR end "rule__SINT__Group__0"


    // $ANTLR start "rule__SINT__Group__0__Impl"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1975:1: rule__SINT__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__SINT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1979:1: ( ( ( '-' )? ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1980:1: ( ( '-' )? )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1980:1: ( ( '-' )? )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1981:1: ( '-' )?
            {
             before(grammarAccess.getSINTAccess().getHyphenMinusKeyword_0()); 
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1982:1: ( '-' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==30) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1983:2: '-'
                    {
                    match(input,30,FOLLOW_30_in_rule__SINT__Group__0__Impl3913); 

                    }
                    break;

            }

             after(grammarAccess.getSINTAccess().getHyphenMinusKeyword_0()); 

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
    // $ANTLR end "rule__SINT__Group__0__Impl"


    // $ANTLR start "rule__SINT__Group__1"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1994:1: rule__SINT__Group__1 : rule__SINT__Group__1__Impl ;
    public final void rule__SINT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1998:1: ( rule__SINT__Group__1__Impl )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:1999:2: rule__SINT__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SINT__Group__1__Impl_in_rule__SINT__Group__13946);
            rule__SINT__Group__1__Impl();

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
    // $ANTLR end "rule__SINT__Group__1"


    // $ANTLR start "rule__SINT__Group__1__Impl"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2005:1: rule__SINT__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__SINT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2009:1: ( ( RULE_INT ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2010:1: ( RULE_INT )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2010:1: ( RULE_INT )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2011:1: RULE_INT
            {
             before(grammarAccess.getSINTAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__SINT__Group__1__Impl3973); 
             after(grammarAccess.getSINTAccess().getINTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__SINT__Group__1__Impl"


    // $ANTLR start "rule__Questionnaire__GroupsAssignment_3"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2027:1: rule__Questionnaire__GroupsAssignment_3 : ( ruleGroup ) ;
    public final void rule__Questionnaire__GroupsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2031:1: ( ( ruleGroup ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2032:1: ( ruleGroup )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2032:1: ( ruleGroup )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2033:1: ruleGroup
            {
             before(grammarAccess.getQuestionnaireAccess().getGroupsGroupParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleGroup_in_rule__Questionnaire__GroupsAssignment_34011);
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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2042:1: rule__Questionnaire__GroupsAssignment_4_1 : ( ruleGroup ) ;
    public final void rule__Questionnaire__GroupsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2046:1: ( ( ruleGroup ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2047:1: ( ruleGroup )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2047:1: ( ruleGroup )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2048:1: ruleGroup
            {
             before(grammarAccess.getQuestionnaireAccess().getGroupsGroupParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleGroup_in_rule__Questionnaire__GroupsAssignment_4_14042);
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


    // $ANTLR start "rule__Group__QuestionsAssignment_3"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2057:1: rule__Group__QuestionsAssignment_3 : ( ruleQuestion ) ;
    public final void rule__Group__QuestionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2061:1: ( ( ruleQuestion ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2062:1: ( ruleQuestion )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2062:1: ( ruleQuestion )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2063:1: ruleQuestion
            {
             before(grammarAccess.getGroupAccess().getQuestionsQuestionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleQuestion_in_rule__Group__QuestionsAssignment_34073);
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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2072:1: rule__Group__QuestionsAssignment_4_1 : ( ruleQuestion ) ;
    public final void rule__Group__QuestionsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2076:1: ( ( ruleQuestion ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2077:1: ( ruleQuestion )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2077:1: ( ruleQuestion )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2078:1: ruleQuestion
            {
             before(grammarAccess.getGroupAccess().getQuestionsQuestionParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleQuestion_in_rule__Group__QuestionsAssignment_4_14104);
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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2087:1: rule__OpenQuestion__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__OpenQuestion__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2091:1: ( ( RULE_STRING ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2092:1: ( RULE_STRING )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2092:1: ( RULE_STRING )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2093:1: RULE_STRING
            {
             before(grammarAccess.getOpenQuestionAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__OpenQuestion__NameAssignment_24135); 
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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2102:1: rule__ClosedQuestion__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ClosedQuestion__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2106:1: ( ( RULE_STRING ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2107:1: ( RULE_STRING )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2107:1: ( RULE_STRING )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2108:1: RULE_STRING
            {
             before(grammarAccess.getClosedQuestionAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ClosedQuestion__NameAssignment_24166); 
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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2117:1: rule__ClosedQuestion__AnswersAssignment_5 : ( ruleAnswer ) ;
    public final void rule__ClosedQuestion__AnswersAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2121:1: ( ( ruleAnswer ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2122:1: ( ruleAnswer )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2122:1: ( ruleAnswer )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2123:1: ruleAnswer
            {
             before(grammarAccess.getClosedQuestionAccess().getAnswersAnswerParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleAnswer_in_rule__ClosedQuestion__AnswersAssignment_54197);
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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2132:1: rule__ClosedQuestion__AnswersAssignment_6_1 : ( ruleAnswer ) ;
    public final void rule__ClosedQuestion__AnswersAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2136:1: ( ( ruleAnswer ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2137:1: ( ruleAnswer )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2137:1: ( ruleAnswer )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2138:1: ruleAnswer
            {
             before(grammarAccess.getClosedQuestionAccess().getAnswersAnswerParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_ruleAnswer_in_rule__ClosedQuestion__AnswersAssignment_6_14228);
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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2147:1: rule__ClosedQuestion__DefaultAssignment_8_1 : ( ( RULE_STRING ) ) ;
    public final void rule__ClosedQuestion__DefaultAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2151:1: ( ( ( RULE_STRING ) ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2152:1: ( ( RULE_STRING ) )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2152:1: ( ( RULE_STRING ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2153:1: ( RULE_STRING )
            {
             before(grammarAccess.getClosedQuestionAccess().getDefaultAnswerCrossReference_8_1_0()); 
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2154:1: ( RULE_STRING )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2155:1: RULE_STRING
            {
             before(grammarAccess.getClosedQuestionAccess().getDefaultAnswerSTRINGTerminalRuleCall_8_1_0_1()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ClosedQuestion__DefaultAssignment_8_14263); 
             after(grammarAccess.getClosedQuestionAccess().getDefaultAnswerSTRINGTerminalRuleCall_8_1_0_1()); 

            }

             after(grammarAccess.getClosedQuestionAccess().getDefaultAnswerCrossReference_8_1_0()); 

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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2166:1: rule__LikertQuestion__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__LikertQuestion__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2170:1: ( ( RULE_STRING ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2171:1: ( RULE_STRING )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2171:1: ( RULE_STRING )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2172:1: RULE_STRING
            {
             before(grammarAccess.getLikertQuestionAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__LikertQuestion__NameAssignment_14298); 
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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2181:1: rule__LikertQuestion__FromAssignment_3 : ( ruleSINT ) ;
    public final void rule__LikertQuestion__FromAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2185:1: ( ( ruleSINT ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2186:1: ( ruleSINT )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2186:1: ( ruleSINT )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2187:1: ruleSINT
            {
             before(grammarAccess.getLikertQuestionAccess().getFromSINTParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleSINT_in_rule__LikertQuestion__FromAssignment_34329);
            ruleSINT();

            state._fsp--;

             after(grammarAccess.getLikertQuestionAccess().getFromSINTParserRuleCall_3_0()); 

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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2196:1: rule__LikertQuestion__ToAssignment_5 : ( ruleSINT ) ;
    public final void rule__LikertQuestion__ToAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2200:1: ( ( ruleSINT ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2201:1: ( ruleSINT )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2201:1: ( ruleSINT )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2202:1: ruleSINT
            {
             before(grammarAccess.getLikertQuestionAccess().getToSINTParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleSINT_in_rule__LikertQuestion__ToAssignment_54360);
            ruleSINT();

            state._fsp--;

             after(grammarAccess.getLikertQuestionAccess().getToSINTParserRuleCall_5_0()); 

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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2211:1: rule__Answer__EnablesAssignment_1 : ( ruleEnablesQuestion ) ;
    public final void rule__Answer__EnablesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2215:1: ( ( ruleEnablesQuestion ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2216:1: ( ruleEnablesQuestion )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2216:1: ( ruleEnablesQuestion )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2217:1: ruleEnablesQuestion
            {
             before(grammarAccess.getAnswerAccess().getEnablesEnablesQuestionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEnablesQuestion_in_rule__Answer__EnablesAssignment_14391);
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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2226:1: rule__SimpleAnswer__NameAssignment : ( RULE_STRING ) ;
    public final void rule__SimpleAnswer__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2230:1: ( ( RULE_STRING ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2231:1: ( RULE_STRING )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2231:1: ( RULE_STRING )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2232:1: RULE_STRING
            {
             before(grammarAccess.getSimpleAnswerAccess().getNameSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SimpleAnswer__NameAssignment4422); 
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
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2241:1: rule__InputAnswer__NameAssignment_0 : ( RULE_STRING ) ;
    public final void rule__InputAnswer__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2245:1: ( ( RULE_STRING ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2246:1: ( RULE_STRING )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2246:1: ( RULE_STRING )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2247:1: RULE_STRING
            {
             before(grammarAccess.getInputAnswerAccess().getNameSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__InputAnswer__NameAssignment_04453); 
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


    // $ANTLR start "rule__EnablesQuestion__QuestionAssignment_2"
    // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2256:1: rule__EnablesQuestion__QuestionAssignment_2 : ( ( RULE_STRING ) ) ;
    public final void rule__EnablesQuestion__QuestionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2260:1: ( ( ( RULE_STRING ) ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2261:1: ( ( RULE_STRING ) )
            {
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2261:1: ( ( RULE_STRING ) )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2262:1: ( RULE_STRING )
            {
             before(grammarAccess.getEnablesQuestionAccess().getQuestionQuestionCrossReference_2_0()); 
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2263:1: ( RULE_STRING )
            // ../at.ac.tuwien.big.questionnaire.ui/src-gen/at/ac/tuwien/big/ui/contentassist/antlr/internal/InternalQuestionnaire.g:2264:1: RULE_STRING
            {
             before(grammarAccess.getEnablesQuestionAccess().getQuestionQuestionSTRINGTerminalRuleCall_2_0_1()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EnablesQuestion__QuestionAssignment_24488); 
             after(grammarAccess.getEnablesQuestionAccess().getQuestionQuestionSTRINGTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getEnablesQuestionAccess().getQuestionQuestionCrossReference_2_0()); 

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
    // $ANTLR end "rule__EnablesQuestion__QuestionAssignment_2"

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
    public static final BitSet FOLLOW_ruleSINT_in_entryRuleSINT661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSINT668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SINT__Group__0_in_ruleSINT694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpenQuestion_in_rule__Question__Alternatives730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClosedQuestion_in_rule__Question__Alternatives747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLikertQuestion_in_rule__Question__Alternatives764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__OpenQuestion__Alternatives_0797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__OpenQuestion__Alternatives_0817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ClosedQuestion__Alternatives_1852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ClosedQuestion__Alternatives_1872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleAnswer_in_rule__Answer__Alternatives_0906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInputAnswer_in_rule__Answer__Alternatives_0923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__0__Impl_in_rule__Questionnaire__Group__0953 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__1_in_rule__Questionnaire__Group__0956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Questionnaire__Group__0__Impl984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__1__Impl_in_rule__Questionnaire__Group__11015 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__2_in_rule__Questionnaire__Group__11018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Questionnaire__Group__1__Impl1045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__2__Impl_in_rule__Questionnaire__Group__21074 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__3_in_rule__Questionnaire__Group__21077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Questionnaire__Group__2__Impl1105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__3__Impl_in_rule__Questionnaire__Group__31136 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__4_in_rule__Questionnaire__Group__31139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Questionnaire__GroupsAssignment_3_in_rule__Questionnaire__Group__3__Impl1166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__4__Impl_in_rule__Questionnaire__Group__41196 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__5_in_rule__Questionnaire__Group__41199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group_4__0_in_rule__Questionnaire__Group__4__Impl1226 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group__5__Impl_in_rule__Questionnaire__Group__51257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Questionnaire__Group__5__Impl1285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group_4__0__Impl_in_rule__Questionnaire__Group_4__01328 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group_4__1_in_rule__Questionnaire__Group_4__01331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Questionnaire__Group_4__0__Impl1359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Questionnaire__Group_4__1__Impl_in_rule__Questionnaire__Group_4__11390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Questionnaire__GroupsAssignment_4_1_in_rule__Questionnaire__Group_4__1__Impl1417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__Group__0__Impl_in_rule__Group__Group__01451 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Group__Group__1_in_rule__Group__Group__01454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Group__Group__0__Impl1482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__Group__1__Impl_in_rule__Group__Group__11513 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Group__Group__2_in_rule__Group__Group__11516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Group__Group__1__Impl1543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__Group__2__Impl_in_rule__Group__Group__21572 = new BitSet(new long[]{0x0000000001301800L});
    public static final BitSet FOLLOW_rule__Group__Group__3_in_rule__Group__Group__21575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Group__Group__2__Impl1603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__Group__3__Impl_in_rule__Group__Group__31634 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_rule__Group__Group__4_in_rule__Group__Group__31637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__QuestionsAssignment_3_in_rule__Group__Group__3__Impl1664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__Group__4__Impl_in_rule__Group__Group__41694 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_rule__Group__Group__5_in_rule__Group__Group__41697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__Group_4__0_in_rule__Group__Group__4__Impl1724 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__Group__Group__5__Impl_in_rule__Group__Group__51755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Group__Group__5__Impl1783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__Group_4__0__Impl_in_rule__Group__Group_4__01826 = new BitSet(new long[]{0x0000000001301800L});
    public static final BitSet FOLLOW_rule__Group__Group_4__1_in_rule__Group__Group_4__01829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Group__Group_4__0__Impl1857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__Group_4__1__Impl_in_rule__Group__Group_4__11888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group__QuestionsAssignment_4_1_in_rule__Group__Group_4__1__Impl1915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OpenQuestion__Group__0__Impl_in_rule__OpenQuestion__Group__01949 = new BitSet(new long[]{0x0000000000101800L});
    public static final BitSet FOLLOW_rule__OpenQuestion__Group__1_in_rule__OpenQuestion__Group__01952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OpenQuestion__Alternatives_0_in_rule__OpenQuestion__Group__0__Impl1979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OpenQuestion__Group__1__Impl_in_rule__OpenQuestion__Group__12010 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__OpenQuestion__Group__2_in_rule__OpenQuestion__Group__12013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__OpenQuestion__Group__1__Impl2041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OpenQuestion__Group__2__Impl_in_rule__OpenQuestion__Group__22072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OpenQuestion__NameAssignment_2_in_rule__OpenQuestion__Group__2__Impl2099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClosedQuestion__Group__0__Impl_in_rule__ClosedQuestion__Group__02135 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__ClosedQuestion__Group__1_in_rule__ClosedQuestion__Group__02138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ClosedQuestion__Group__0__Impl2166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClosedQuestion__Group__1__Impl_in_rule__ClosedQuestion__Group__12197 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ClosedQuestion__Group__2_in_rule__ClosedQuestion__Group__12200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClosedQuestion__Alternatives_1_in_rule__ClosedQuestion__Group__1__Impl2227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClosedQuestion__Group__2__Impl_in_rule__ClosedQuestion__Group__22257 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__ClosedQuestion__Group__3_in_rule__ClosedQuestion__Group__22260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClosedQuestion__NameAssignment_2_in_rule__ClosedQuestion__Group__2__Impl2287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClosedQuestion__Group__3__Impl_in_rule__ClosedQuestion__Group__32317 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__ClosedQuestion__Group__4_in_rule__ClosedQuestion__Group__32320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ClosedQuestion__Group__3__Impl2348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClosedQuestion__Group__4__Impl_in_rule__ClosedQuestion__Group__42379 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ClosedQuestion__Group__5_in_rule__ClosedQuestion__Group__42382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ClosedQuestion__Group__4__Impl2410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClosedQuestion__Group__5__Impl_in_rule__ClosedQuestion__Group__52441 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_rule__ClosedQuestion__Group__6_in_rule__ClosedQuestion__Group__52444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClosedQuestion__AnswersAssignment_5_in_rule__ClosedQuestion__Group__5__Impl2471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClosedQuestion__Group__6__Impl_in_rule__ClosedQuestion__Group__62501 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_rule__ClosedQuestion__Group__7_in_rule__ClosedQuestion__Group__62504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClosedQuestion__Group_6__0_in_rule__ClosedQuestion__Group__6__Impl2531 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__ClosedQuestion__Group__7__Impl_in_rule__ClosedQuestion__Group__72562 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__ClosedQuestion__Group__8_in_rule__ClosedQuestion__Group__72565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ClosedQuestion__Group__7__Impl2593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClosedQuestion__Group__8__Impl_in_rule__ClosedQuestion__Group__82624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClosedQuestion__Group_8__0_in_rule__ClosedQuestion__Group__8__Impl2651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClosedQuestion__Group_6__0__Impl_in_rule__ClosedQuestion__Group_6__02700 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ClosedQuestion__Group_6__1_in_rule__ClosedQuestion__Group_6__02703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ClosedQuestion__Group_6__0__Impl2731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClosedQuestion__Group_6__1__Impl_in_rule__ClosedQuestion__Group_6__12762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClosedQuestion__AnswersAssignment_6_1_in_rule__ClosedQuestion__Group_6__1__Impl2789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClosedQuestion__Group_8__0__Impl_in_rule__ClosedQuestion__Group_8__02823 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ClosedQuestion__Group_8__1_in_rule__ClosedQuestion__Group_8__02826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ClosedQuestion__Group_8__0__Impl2854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClosedQuestion__Group_8__1__Impl_in_rule__ClosedQuestion__Group_8__12885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClosedQuestion__DefaultAssignment_8_1_in_rule__ClosedQuestion__Group_8__1__Impl2912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LikertQuestion__Group__0__Impl_in_rule__LikertQuestion__Group__02946 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__LikertQuestion__Group__1_in_rule__LikertQuestion__Group__02949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__LikertQuestion__Group__0__Impl2977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LikertQuestion__Group__1__Impl_in_rule__LikertQuestion__Group__13008 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__LikertQuestion__Group__2_in_rule__LikertQuestion__Group__13011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LikertQuestion__NameAssignment_1_in_rule__LikertQuestion__Group__1__Impl3038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LikertQuestion__Group__2__Impl_in_rule__LikertQuestion__Group__23068 = new BitSet(new long[]{0x0000000040000020L});
    public static final BitSet FOLLOW_rule__LikertQuestion__Group__3_in_rule__LikertQuestion__Group__23071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__LikertQuestion__Group__2__Impl3099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LikertQuestion__Group__3__Impl_in_rule__LikertQuestion__Group__33130 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__LikertQuestion__Group__4_in_rule__LikertQuestion__Group__33133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LikertQuestion__FromAssignment_3_in_rule__LikertQuestion__Group__3__Impl3160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LikertQuestion__Group__4__Impl_in_rule__LikertQuestion__Group__43190 = new BitSet(new long[]{0x0000000040000020L});
    public static final BitSet FOLLOW_rule__LikertQuestion__Group__5_in_rule__LikertQuestion__Group__43193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__LikertQuestion__Group__4__Impl3221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LikertQuestion__Group__5__Impl_in_rule__LikertQuestion__Group__53252 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__LikertQuestion__Group__6_in_rule__LikertQuestion__Group__53255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LikertQuestion__ToAssignment_5_in_rule__LikertQuestion__Group__5__Impl3282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LikertQuestion__Group__6__Impl_in_rule__LikertQuestion__Group__63312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__LikertQuestion__Group__6__Impl3340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Answer__Group__0__Impl_in_rule__Answer__Group__03385 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Answer__Group__1_in_rule__Answer__Group__03388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Answer__Alternatives_0_in_rule__Answer__Group__0__Impl3415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Answer__Group__1__Impl_in_rule__Answer__Group__13445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Answer__EnablesAssignment_1_in_rule__Answer__Group__1__Impl3472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputAnswer__Group__0__Impl_in_rule__InputAnswer__Group__03507 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__InputAnswer__Group__1_in_rule__InputAnswer__Group__03510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputAnswer__NameAssignment_0_in_rule__InputAnswer__Group__0__Impl3537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputAnswer__Group__1__Impl_in_rule__InputAnswer__Group__13567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__InputAnswer__Group__1__Impl3595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnablesQuestion__Group__0__Impl_in_rule__EnablesQuestion__Group__03630 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__EnablesQuestion__Group__1_in_rule__EnablesQuestion__Group__03633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__EnablesQuestion__Group__0__Impl3661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnablesQuestion__Group__1__Impl_in_rule__EnablesQuestion__Group__13692 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EnablesQuestion__Group__2_in_rule__EnablesQuestion__Group__13695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__EnablesQuestion__Group__1__Impl3723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnablesQuestion__Group__2__Impl_in_rule__EnablesQuestion__Group__23754 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__EnablesQuestion__Group__3_in_rule__EnablesQuestion__Group__23757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnablesQuestion__QuestionAssignment_2_in_rule__EnablesQuestion__Group__2__Impl3784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnablesQuestion__Group__3__Impl_in_rule__EnablesQuestion__Group__33814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__EnablesQuestion__Group__3__Impl3842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SINT__Group__0__Impl_in_rule__SINT__Group__03881 = new BitSet(new long[]{0x0000000040000020L});
    public static final BitSet FOLLOW_rule__SINT__Group__1_in_rule__SINT__Group__03884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__SINT__Group__0__Impl3913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SINT__Group__1__Impl_in_rule__SINT__Group__13946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__SINT__Group__1__Impl3973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroup_in_rule__Questionnaire__GroupsAssignment_34011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroup_in_rule__Questionnaire__GroupsAssignment_4_14042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuestion_in_rule__Group__QuestionsAssignment_34073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuestion_in_rule__Group__QuestionsAssignment_4_14104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__OpenQuestion__NameAssignment_24135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ClosedQuestion__NameAssignment_24166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnswer_in_rule__ClosedQuestion__AnswersAssignment_54197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnswer_in_rule__ClosedQuestion__AnswersAssignment_6_14228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ClosedQuestion__DefaultAssignment_8_14263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__LikertQuestion__NameAssignment_14298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSINT_in_rule__LikertQuestion__FromAssignment_34329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSINT_in_rule__LikertQuestion__ToAssignment_54360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnablesQuestion_in_rule__Answer__EnablesAssignment_14391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SimpleAnswer__NameAssignment4422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__InputAnswer__NameAssignment_04453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EnablesQuestion__QuestionAssignment_24488 = new BitSet(new long[]{0x0000000000000002L});

}