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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalQuestionnaireParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'questionnaire'", "'['", "','", "']'", "'group'", "'mandatory'", "'multiline'", "'open question'", "'closed question allowing'", "'single answer'", "'multiple answers'", "'answers'", "'default answer is'", "'likert question'", "'('", "'..'", "')'", "'enables question'", "'...'", "'-'"
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
    public String getGrammarFileName() { return "../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g"; }



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



    // $ANTLR start "entryRuleQuestionnaire"
    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:67:1: entryRuleQuestionnaire returns [EObject current=null] : iv_ruleQuestionnaire= ruleQuestionnaire EOF ;
    public final EObject entryRuleQuestionnaire() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestionnaire = null;


        try {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:68:2: (iv_ruleQuestionnaire= ruleQuestionnaire EOF )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:69:2: iv_ruleQuestionnaire= ruleQuestionnaire EOF
            {
             newCompositeNode(grammarAccess.getQuestionnaireRule()); 
            pushFollow(FOLLOW_ruleQuestionnaire_in_entryRuleQuestionnaire75);
            iv_ruleQuestionnaire=ruleQuestionnaire();

            state._fsp--;

             current =iv_ruleQuestionnaire; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuestionnaire85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQuestionnaire"


    // $ANTLR start "ruleQuestionnaire"
    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:76:1: ruleQuestionnaire returns [EObject current=null] : (otherlv_0= 'questionnaire' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_groups_3_0= ruleGroup ) ) (otherlv_4= ',' ( (lv_groups_5_0= ruleGroup ) ) )* otherlv_6= ']' ) ;
    public final EObject ruleQuestionnaire() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_groups_3_0 = null;

        EObject lv_groups_5_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:79:28: ( (otherlv_0= 'questionnaire' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_groups_3_0= ruleGroup ) ) (otherlv_4= ',' ( (lv_groups_5_0= ruleGroup ) ) )* otherlv_6= ']' ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:80:1: (otherlv_0= 'questionnaire' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_groups_3_0= ruleGroup ) ) (otherlv_4= ',' ( (lv_groups_5_0= ruleGroup ) ) )* otherlv_6= ']' )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:80:1: (otherlv_0= 'questionnaire' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_groups_3_0= ruleGroup ) ) (otherlv_4= ',' ( (lv_groups_5_0= ruleGroup ) ) )* otherlv_6= ']' )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:80:3: otherlv_0= 'questionnaire' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_groups_3_0= ruleGroup ) ) (otherlv_4= ',' ( (lv_groups_5_0= ruleGroup ) ) )* otherlv_6= ']'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleQuestionnaire122); 

                	newLeafNode(otherlv_0, grammarAccess.getQuestionnaireAccess().getQuestionnaireKeyword_0());
                
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:84:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:85:1: (lv_name_1_0= RULE_STRING )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:85:1: (lv_name_1_0= RULE_STRING )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:86:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleQuestionnaire139); 

            			newLeafNode(lv_name_1_0, grammarAccess.getQuestionnaireAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getQuestionnaireRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleQuestionnaire156); 

                	newLeafNode(otherlv_2, grammarAccess.getQuestionnaireAccess().getLeftSquareBracketKeyword_2());
                
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:106:1: ( (lv_groups_3_0= ruleGroup ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:107:1: (lv_groups_3_0= ruleGroup )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:107:1: (lv_groups_3_0= ruleGroup )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:108:3: lv_groups_3_0= ruleGroup
            {
             
            	        newCompositeNode(grammarAccess.getQuestionnaireAccess().getGroupsGroupParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleGroup_in_ruleQuestionnaire177);
            lv_groups_3_0=ruleGroup();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getQuestionnaireRule());
            	        }
                   		add(
                   			current, 
                   			"groups",
                    		lv_groups_3_0, 
                    		"Group");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:124:2: (otherlv_4= ',' ( (lv_groups_5_0= ruleGroup ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:124:4: otherlv_4= ',' ( (lv_groups_5_0= ruleGroup ) )
            	    {
            	    otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleQuestionnaire190); 

            	        	newLeafNode(otherlv_4, grammarAccess.getQuestionnaireAccess().getCommaKeyword_4_0());
            	        
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:128:1: ( (lv_groups_5_0= ruleGroup ) )
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:129:1: (lv_groups_5_0= ruleGroup )
            	    {
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:129:1: (lv_groups_5_0= ruleGroup )
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:130:3: lv_groups_5_0= ruleGroup
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getQuestionnaireAccess().getGroupsGroupParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleGroup_in_ruleQuestionnaire211);
            	    lv_groups_5_0=ruleGroup();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getQuestionnaireRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"groups",
            	            		lv_groups_5_0, 
            	            		"Group");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleQuestionnaire225); 

                	newLeafNode(otherlv_6, grammarAccess.getQuestionnaireAccess().getRightSquareBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQuestionnaire"


    // $ANTLR start "entryRuleGroup"
    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:158:1: entryRuleGroup returns [EObject current=null] : iv_ruleGroup= ruleGroup EOF ;
    public final EObject entryRuleGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroup = null;


        try {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:159:2: (iv_ruleGroup= ruleGroup EOF )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:160:2: iv_ruleGroup= ruleGroup EOF
            {
             newCompositeNode(grammarAccess.getGroupRule()); 
            pushFollow(FOLLOW_ruleGroup_in_entryRuleGroup261);
            iv_ruleGroup=ruleGroup();

            state._fsp--;

             current =iv_ruleGroup; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGroup271); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGroup"


    // $ANTLR start "ruleGroup"
    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:167:1: ruleGroup returns [EObject current=null] : (otherlv_0= 'group' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_questions_3_0= ruleQuestion ) ) (otherlv_4= ',' ( (lv_questions_5_0= ruleQuestion ) ) )* otherlv_6= ']' ) ;
    public final EObject ruleGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_questions_3_0 = null;

        EObject lv_questions_5_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:170:28: ( (otherlv_0= 'group' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_questions_3_0= ruleQuestion ) ) (otherlv_4= ',' ( (lv_questions_5_0= ruleQuestion ) ) )* otherlv_6= ']' ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:171:1: (otherlv_0= 'group' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_questions_3_0= ruleQuestion ) ) (otherlv_4= ',' ( (lv_questions_5_0= ruleQuestion ) ) )* otherlv_6= ']' )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:171:1: (otherlv_0= 'group' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_questions_3_0= ruleQuestion ) ) (otherlv_4= ',' ( (lv_questions_5_0= ruleQuestion ) ) )* otherlv_6= ']' )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:171:3: otherlv_0= 'group' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_questions_3_0= ruleQuestion ) ) (otherlv_4= ',' ( (lv_questions_5_0= ruleQuestion ) ) )* otherlv_6= ']'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleGroup308); 

                	newLeafNode(otherlv_0, grammarAccess.getGroupAccess().getGroupKeyword_0());
                
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:175:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:176:1: (lv_name_1_0= RULE_STRING )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:176:1: (lv_name_1_0= RULE_STRING )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:177:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGroup325); 

            			newLeafNode(lv_name_1_0, grammarAccess.getGroupAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGroupRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleGroup342); 

                	newLeafNode(otherlv_2, grammarAccess.getGroupAccess().getLeftSquareBracketKeyword_2());
                
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:197:1: ( (lv_questions_3_0= ruleQuestion ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:198:1: (lv_questions_3_0= ruleQuestion )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:198:1: (lv_questions_3_0= ruleQuestion )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:199:3: lv_questions_3_0= ruleQuestion
            {
             
            	        newCompositeNode(grammarAccess.getGroupAccess().getQuestionsQuestionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleQuestion_in_ruleGroup363);
            lv_questions_3_0=ruleQuestion();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGroupRule());
            	        }
                   		add(
                   			current, 
                   			"questions",
                    		lv_questions_3_0, 
                    		"Question");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:215:2: (otherlv_4= ',' ( (lv_questions_5_0= ruleQuestion ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:215:4: otherlv_4= ',' ( (lv_questions_5_0= ruleQuestion ) )
            	    {
            	    otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleGroup376); 

            	        	newLeafNode(otherlv_4, grammarAccess.getGroupAccess().getCommaKeyword_4_0());
            	        
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:219:1: ( (lv_questions_5_0= ruleQuestion ) )
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:220:1: (lv_questions_5_0= ruleQuestion )
            	    {
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:220:1: (lv_questions_5_0= ruleQuestion )
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:221:3: lv_questions_5_0= ruleQuestion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGroupAccess().getQuestionsQuestionParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQuestion_in_ruleGroup397);
            	    lv_questions_5_0=ruleQuestion();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGroupRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"questions",
            	            		lv_questions_5_0, 
            	            		"Question");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleGroup411); 

                	newLeafNode(otherlv_6, grammarAccess.getGroupAccess().getRightSquareBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGroup"


    // $ANTLR start "entryRuleQuestion"
    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:249:1: entryRuleQuestion returns [EObject current=null] : iv_ruleQuestion= ruleQuestion EOF ;
    public final EObject entryRuleQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestion = null;


        try {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:250:2: (iv_ruleQuestion= ruleQuestion EOF )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:251:2: iv_ruleQuestion= ruleQuestion EOF
            {
             newCompositeNode(grammarAccess.getQuestionRule()); 
            pushFollow(FOLLOW_ruleQuestion_in_entryRuleQuestion447);
            iv_ruleQuestion=ruleQuestion();

            state._fsp--;

             current =iv_ruleQuestion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuestion457); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQuestion"


    // $ANTLR start "ruleQuestion"
    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:258:1: ruleQuestion returns [EObject current=null] : (this_OpenQuestion_0= ruleOpenQuestion | this_ClosedQuestion_1= ruleClosedQuestion | this_LikertQuestion_2= ruleLikertQuestion ) ;
    public final EObject ruleQuestion() throws RecognitionException {
        EObject current = null;

        EObject this_OpenQuestion_0 = null;

        EObject this_ClosedQuestion_1 = null;

        EObject this_LikertQuestion_2 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:261:28: ( (this_OpenQuestion_0= ruleOpenQuestion | this_ClosedQuestion_1= ruleClosedQuestion | this_LikertQuestion_2= ruleLikertQuestion ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:262:1: (this_OpenQuestion_0= ruleOpenQuestion | this_ClosedQuestion_1= ruleClosedQuestion | this_LikertQuestion_2= ruleLikertQuestion )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:262:1: (this_OpenQuestion_0= ruleOpenQuestion | this_ClosedQuestion_1= ruleClosedQuestion | this_LikertQuestion_2= ruleLikertQuestion )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 16:
            case 17:
            case 18:
                {
                alt3=1;
                }
                break;
            case 19:
                {
                alt3=2;
                }
                break;
            case 24:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:263:5: this_OpenQuestion_0= ruleOpenQuestion
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getOpenQuestionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleOpenQuestion_in_ruleQuestion504);
                    this_OpenQuestion_0=ruleOpenQuestion();

                    state._fsp--;

                     
                            current = this_OpenQuestion_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:273:5: this_ClosedQuestion_1= ruleClosedQuestion
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getClosedQuestionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleClosedQuestion_in_ruleQuestion531);
                    this_ClosedQuestion_1=ruleClosedQuestion();

                    state._fsp--;

                     
                            current = this_ClosedQuestion_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:283:5: this_LikertQuestion_2= ruleLikertQuestion
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getLikertQuestionParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleLikertQuestion_in_ruleQuestion558);
                    this_LikertQuestion_2=ruleLikertQuestion();

                    state._fsp--;

                     
                            current = this_LikertQuestion_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQuestion"


    // $ANTLR start "entryRuleOpenQuestion"
    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:299:1: entryRuleOpenQuestion returns [EObject current=null] : iv_ruleOpenQuestion= ruleOpenQuestion EOF ;
    public final EObject entryRuleOpenQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpenQuestion = null;


        try {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:300:2: (iv_ruleOpenQuestion= ruleOpenQuestion EOF )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:301:2: iv_ruleOpenQuestion= ruleOpenQuestion EOF
            {
             newCompositeNode(grammarAccess.getOpenQuestionRule()); 
            pushFollow(FOLLOW_ruleOpenQuestion_in_entryRuleOpenQuestion593);
            iv_ruleOpenQuestion=ruleOpenQuestion();

            state._fsp--;

             current =iv_ruleOpenQuestion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpenQuestion603); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpenQuestion"


    // $ANTLR start "ruleOpenQuestion"
    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:308:1: ruleOpenQuestion returns [EObject current=null] : ( (otherlv_0= 'mandatory' | otherlv_1= 'multiline' )? otherlv_2= 'open question' ( (lv_name_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleOpenQuestion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;

         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:311:28: ( ( (otherlv_0= 'mandatory' | otherlv_1= 'multiline' )? otherlv_2= 'open question' ( (lv_name_3_0= RULE_STRING ) ) ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:312:1: ( (otherlv_0= 'mandatory' | otherlv_1= 'multiline' )? otherlv_2= 'open question' ( (lv_name_3_0= RULE_STRING ) ) )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:312:1: ( (otherlv_0= 'mandatory' | otherlv_1= 'multiline' )? otherlv_2= 'open question' ( (lv_name_3_0= RULE_STRING ) ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:312:2: (otherlv_0= 'mandatory' | otherlv_1= 'multiline' )? otherlv_2= 'open question' ( (lv_name_3_0= RULE_STRING ) )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:312:2: (otherlv_0= 'mandatory' | otherlv_1= 'multiline' )?
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            else if ( (LA4_0==17) ) {
                alt4=2;
            }
            switch (alt4) {
                case 1 :
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:312:4: otherlv_0= 'mandatory'
                    {
                    otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleOpenQuestion641); 

                        	newLeafNode(otherlv_0, grammarAccess.getOpenQuestionAccess().getMandatoryKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:317:7: otherlv_1= 'multiline'
                    {
                    otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleOpenQuestion659); 

                        	newLeafNode(otherlv_1, grammarAccess.getOpenQuestionAccess().getMultilineKeyword_0_1());
                        

                    }
                    break;

            }

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleOpenQuestion673); 

                	newLeafNode(otherlv_2, grammarAccess.getOpenQuestionAccess().getOpenQuestionKeyword_1());
                
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:325:1: ( (lv_name_3_0= RULE_STRING ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:326:1: (lv_name_3_0= RULE_STRING )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:326:1: (lv_name_3_0= RULE_STRING )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:327:3: lv_name_3_0= RULE_STRING
            {
            lv_name_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleOpenQuestion690); 

            			newLeafNode(lv_name_3_0, grammarAccess.getOpenQuestionAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getOpenQuestionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpenQuestion"


    // $ANTLR start "entryRuleClosedQuestion"
    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:351:1: entryRuleClosedQuestion returns [EObject current=null] : iv_ruleClosedQuestion= ruleClosedQuestion EOF ;
    public final EObject entryRuleClosedQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClosedQuestion = null;


        try {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:352:2: (iv_ruleClosedQuestion= ruleClosedQuestion EOF )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:353:2: iv_ruleClosedQuestion= ruleClosedQuestion EOF
            {
             newCompositeNode(grammarAccess.getClosedQuestionRule()); 
            pushFollow(FOLLOW_ruleClosedQuestion_in_entryRuleClosedQuestion731);
            iv_ruleClosedQuestion=ruleClosedQuestion();

            state._fsp--;

             current =iv_ruleClosedQuestion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClosedQuestion741); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClosedQuestion"


    // $ANTLR start "ruleClosedQuestion"
    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:360:1: ruleClosedQuestion returns [EObject current=null] : (otherlv_0= 'closed question allowing' (otherlv_1= 'single answer' | otherlv_2= 'multiple answers' ) ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'answers' otherlv_5= '[' ( (lv_answers_6_0= ruleAnswer ) ) (otherlv_7= ',' ( (lv_answers_8_0= ruleAnswer ) ) )* otherlv_9= ']' (otherlv_10= 'default answer is' ( (otherlv_11= RULE_STRING ) ) )? ) ;
    public final EObject ruleClosedQuestion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_answers_6_0 = null;

        EObject lv_answers_8_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:363:28: ( (otherlv_0= 'closed question allowing' (otherlv_1= 'single answer' | otherlv_2= 'multiple answers' ) ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'answers' otherlv_5= '[' ( (lv_answers_6_0= ruleAnswer ) ) (otherlv_7= ',' ( (lv_answers_8_0= ruleAnswer ) ) )* otherlv_9= ']' (otherlv_10= 'default answer is' ( (otherlv_11= RULE_STRING ) ) )? ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:364:1: (otherlv_0= 'closed question allowing' (otherlv_1= 'single answer' | otherlv_2= 'multiple answers' ) ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'answers' otherlv_5= '[' ( (lv_answers_6_0= ruleAnswer ) ) (otherlv_7= ',' ( (lv_answers_8_0= ruleAnswer ) ) )* otherlv_9= ']' (otherlv_10= 'default answer is' ( (otherlv_11= RULE_STRING ) ) )? )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:364:1: (otherlv_0= 'closed question allowing' (otherlv_1= 'single answer' | otherlv_2= 'multiple answers' ) ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'answers' otherlv_5= '[' ( (lv_answers_6_0= ruleAnswer ) ) (otherlv_7= ',' ( (lv_answers_8_0= ruleAnswer ) ) )* otherlv_9= ']' (otherlv_10= 'default answer is' ( (otherlv_11= RULE_STRING ) ) )? )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:364:3: otherlv_0= 'closed question allowing' (otherlv_1= 'single answer' | otherlv_2= 'multiple answers' ) ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'answers' otherlv_5= '[' ( (lv_answers_6_0= ruleAnswer ) ) (otherlv_7= ',' ( (lv_answers_8_0= ruleAnswer ) ) )* otherlv_9= ']' (otherlv_10= 'default answer is' ( (otherlv_11= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleClosedQuestion778); 

                	newLeafNode(otherlv_0, grammarAccess.getClosedQuestionAccess().getClosedQuestionAllowingKeyword_0());
                
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:368:1: (otherlv_1= 'single answer' | otherlv_2= 'multiple answers' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            else if ( (LA5_0==21) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:368:3: otherlv_1= 'single answer'
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleClosedQuestion791); 

                        	newLeafNode(otherlv_1, grammarAccess.getClosedQuestionAccess().getSingleAnswerKeyword_1_0());
                        

                    }
                    break;
                case 2 :
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:373:7: otherlv_2= 'multiple answers'
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleClosedQuestion809); 

                        	newLeafNode(otherlv_2, grammarAccess.getClosedQuestionAccess().getMultipleAnswersKeyword_1_1());
                        

                    }
                    break;

            }

            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:377:2: ( (lv_name_3_0= RULE_STRING ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:378:1: (lv_name_3_0= RULE_STRING )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:378:1: (lv_name_3_0= RULE_STRING )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:379:3: lv_name_3_0= RULE_STRING
            {
            lv_name_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleClosedQuestion827); 

            			newLeafNode(lv_name_3_0, grammarAccess.getClosedQuestionAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getClosedQuestionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_4=(Token)match(input,22,FOLLOW_22_in_ruleClosedQuestion844); 

                	newLeafNode(otherlv_4, grammarAccess.getClosedQuestionAccess().getAnswersKeyword_3());
                
            otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleClosedQuestion856); 

                	newLeafNode(otherlv_5, grammarAccess.getClosedQuestionAccess().getLeftSquareBracketKeyword_4());
                
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:403:1: ( (lv_answers_6_0= ruleAnswer ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:404:1: (lv_answers_6_0= ruleAnswer )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:404:1: (lv_answers_6_0= ruleAnswer )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:405:3: lv_answers_6_0= ruleAnswer
            {
             
            	        newCompositeNode(grammarAccess.getClosedQuestionAccess().getAnswersAnswerParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleAnswer_in_ruleClosedQuestion877);
            lv_answers_6_0=ruleAnswer();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getClosedQuestionRule());
            	        }
                   		add(
                   			current, 
                   			"answers",
                    		lv_answers_6_0, 
                    		"Answer");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:421:2: (otherlv_7= ',' ( (lv_answers_8_0= ruleAnswer ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==13) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:421:4: otherlv_7= ',' ( (lv_answers_8_0= ruleAnswer ) )
            	    {
            	    otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleClosedQuestion890); 

            	        	newLeafNode(otherlv_7, grammarAccess.getClosedQuestionAccess().getCommaKeyword_6_0());
            	        
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:425:1: ( (lv_answers_8_0= ruleAnswer ) )
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:426:1: (lv_answers_8_0= ruleAnswer )
            	    {
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:426:1: (lv_answers_8_0= ruleAnswer )
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:427:3: lv_answers_8_0= ruleAnswer
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getClosedQuestionAccess().getAnswersAnswerParserRuleCall_6_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAnswer_in_ruleClosedQuestion911);
            	    lv_answers_8_0=ruleAnswer();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getClosedQuestionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"answers",
            	            		lv_answers_8_0, 
            	            		"Answer");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_9=(Token)match(input,14,FOLLOW_14_in_ruleClosedQuestion925); 

                	newLeafNode(otherlv_9, grammarAccess.getClosedQuestionAccess().getRightSquareBracketKeyword_7());
                
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:447:1: (otherlv_10= 'default answer is' ( (otherlv_11= RULE_STRING ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:447:3: otherlv_10= 'default answer is' ( (otherlv_11= RULE_STRING ) )
                    {
                    otherlv_10=(Token)match(input,23,FOLLOW_23_in_ruleClosedQuestion938); 

                        	newLeafNode(otherlv_10, grammarAccess.getClosedQuestionAccess().getDefaultAnswerIsKeyword_8_0());
                        
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:451:1: ( (otherlv_11= RULE_STRING ) )
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:452:1: (otherlv_11= RULE_STRING )
                    {
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:452:1: (otherlv_11= RULE_STRING )
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:453:3: otherlv_11= RULE_STRING
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getClosedQuestionRule());
                    	        }
                            
                    otherlv_11=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleClosedQuestion958); 

                    		newLeafNode(otherlv_11, grammarAccess.getClosedQuestionAccess().getDefaultAnswerCrossReference_8_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClosedQuestion"


    // $ANTLR start "entryRuleLikertQuestion"
    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:472:1: entryRuleLikertQuestion returns [EObject current=null] : iv_ruleLikertQuestion= ruleLikertQuestion EOF ;
    public final EObject entryRuleLikertQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLikertQuestion = null;


        try {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:473:2: (iv_ruleLikertQuestion= ruleLikertQuestion EOF )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:474:2: iv_ruleLikertQuestion= ruleLikertQuestion EOF
            {
             newCompositeNode(grammarAccess.getLikertQuestionRule()); 
            pushFollow(FOLLOW_ruleLikertQuestion_in_entryRuleLikertQuestion996);
            iv_ruleLikertQuestion=ruleLikertQuestion();

            state._fsp--;

             current =iv_ruleLikertQuestion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLikertQuestion1006); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLikertQuestion"


    // $ANTLR start "ruleLikertQuestion"
    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:481:1: ruleLikertQuestion returns [EObject current=null] : (otherlv_0= 'likert question' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '(' ( (lv_from_3_0= ruleSINT ) ) otherlv_4= '..' ( (lv_to_5_0= ruleSINT ) ) otherlv_6= ')' ) ;
    public final EObject ruleLikertQuestion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_from_3_0 = null;

        AntlrDatatypeRuleToken lv_to_5_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:484:28: ( (otherlv_0= 'likert question' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '(' ( (lv_from_3_0= ruleSINT ) ) otherlv_4= '..' ( (lv_to_5_0= ruleSINT ) ) otherlv_6= ')' ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:485:1: (otherlv_0= 'likert question' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '(' ( (lv_from_3_0= ruleSINT ) ) otherlv_4= '..' ( (lv_to_5_0= ruleSINT ) ) otherlv_6= ')' )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:485:1: (otherlv_0= 'likert question' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '(' ( (lv_from_3_0= ruleSINT ) ) otherlv_4= '..' ( (lv_to_5_0= ruleSINT ) ) otherlv_6= ')' )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:485:3: otherlv_0= 'likert question' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '(' ( (lv_from_3_0= ruleSINT ) ) otherlv_4= '..' ( (lv_to_5_0= ruleSINT ) ) otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleLikertQuestion1043); 

                	newLeafNode(otherlv_0, grammarAccess.getLikertQuestionAccess().getLikertQuestionKeyword_0());
                
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:489:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:490:1: (lv_name_1_0= RULE_STRING )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:490:1: (lv_name_1_0= RULE_STRING )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:491:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLikertQuestion1060); 

            			newLeafNode(lv_name_1_0, grammarAccess.getLikertQuestionAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLikertQuestionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleLikertQuestion1077); 

                	newLeafNode(otherlv_2, grammarAccess.getLikertQuestionAccess().getLeftParenthesisKeyword_2());
                
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:511:1: ( (lv_from_3_0= ruleSINT ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:512:1: (lv_from_3_0= ruleSINT )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:512:1: (lv_from_3_0= ruleSINT )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:513:3: lv_from_3_0= ruleSINT
            {
             
            	        newCompositeNode(grammarAccess.getLikertQuestionAccess().getFromSINTParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleSINT_in_ruleLikertQuestion1098);
            lv_from_3_0=ruleSINT();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLikertQuestionRule());
            	        }
                   		set(
                   			current, 
                   			"from",
                    		lv_from_3_0, 
                    		"SINT");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,26,FOLLOW_26_in_ruleLikertQuestion1110); 

                	newLeafNode(otherlv_4, grammarAccess.getLikertQuestionAccess().getFullStopFullStopKeyword_4());
                
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:533:1: ( (lv_to_5_0= ruleSINT ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:534:1: (lv_to_5_0= ruleSINT )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:534:1: (lv_to_5_0= ruleSINT )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:535:3: lv_to_5_0= ruleSINT
            {
             
            	        newCompositeNode(grammarAccess.getLikertQuestionAccess().getToSINTParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleSINT_in_ruleLikertQuestion1131);
            lv_to_5_0=ruleSINT();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLikertQuestionRule());
            	        }
                   		set(
                   			current, 
                   			"to",
                    		lv_to_5_0, 
                    		"SINT");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,27,FOLLOW_27_in_ruleLikertQuestion1143); 

                	newLeafNode(otherlv_6, grammarAccess.getLikertQuestionAccess().getRightParenthesisKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLikertQuestion"


    // $ANTLR start "entryRuleAnswer"
    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:563:1: entryRuleAnswer returns [EObject current=null] : iv_ruleAnswer= ruleAnswer EOF ;
    public final EObject entryRuleAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnswer = null;


        try {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:564:2: (iv_ruleAnswer= ruleAnswer EOF )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:565:2: iv_ruleAnswer= ruleAnswer EOF
            {
             newCompositeNode(grammarAccess.getAnswerRule()); 
            pushFollow(FOLLOW_ruleAnswer_in_entryRuleAnswer1179);
            iv_ruleAnswer=ruleAnswer();

            state._fsp--;

             current =iv_ruleAnswer; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnswer1189); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnswer"


    // $ANTLR start "ruleAnswer"
    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:572:1: ruleAnswer returns [EObject current=null] : ( (this_SimpleAnswer_0= ruleSimpleAnswer | this_InputAnswer_1= ruleInputAnswer ) (otherlv_2= 'enables question' otherlv_3= '[' ( (otherlv_4= RULE_STRING ) ) (otherlv_5= ',' ( (otherlv_6= RULE_STRING ) ) )* otherlv_7= ']' )? ) ;
    public final EObject ruleAnswer() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject this_SimpleAnswer_0 = null;

        EObject this_InputAnswer_1 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:575:28: ( ( (this_SimpleAnswer_0= ruleSimpleAnswer | this_InputAnswer_1= ruleInputAnswer ) (otherlv_2= 'enables question' otherlv_3= '[' ( (otherlv_4= RULE_STRING ) ) (otherlv_5= ',' ( (otherlv_6= RULE_STRING ) ) )* otherlv_7= ']' )? ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:576:1: ( (this_SimpleAnswer_0= ruleSimpleAnswer | this_InputAnswer_1= ruleInputAnswer ) (otherlv_2= 'enables question' otherlv_3= '[' ( (otherlv_4= RULE_STRING ) ) (otherlv_5= ',' ( (otherlv_6= RULE_STRING ) ) )* otherlv_7= ']' )? )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:576:1: ( (this_SimpleAnswer_0= ruleSimpleAnswer | this_InputAnswer_1= ruleInputAnswer ) (otherlv_2= 'enables question' otherlv_3= '[' ( (otherlv_4= RULE_STRING ) ) (otherlv_5= ',' ( (otherlv_6= RULE_STRING ) ) )* otherlv_7= ']' )? )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:576:2: (this_SimpleAnswer_0= ruleSimpleAnswer | this_InputAnswer_1= ruleInputAnswer ) (otherlv_2= 'enables question' otherlv_3= '[' ( (otherlv_4= RULE_STRING ) ) (otherlv_5= ',' ( (otherlv_6= RULE_STRING ) ) )* otherlv_7= ']' )?
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:576:2: (this_SimpleAnswer_0= ruleSimpleAnswer | this_InputAnswer_1= ruleInputAnswer )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==29) ) {
                    alt8=2;
                }
                else if ( (LA8_1==EOF||(LA8_1>=13 && LA8_1<=14)||LA8_1==28) ) {
                    alt8=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:577:5: this_SimpleAnswer_0= ruleSimpleAnswer
                    {
                     
                            newCompositeNode(grammarAccess.getAnswerAccess().getSimpleAnswerParserRuleCall_0_0()); 
                        
                    pushFollow(FOLLOW_ruleSimpleAnswer_in_ruleAnswer1237);
                    this_SimpleAnswer_0=ruleSimpleAnswer();

                    state._fsp--;

                     
                            current = this_SimpleAnswer_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:587:5: this_InputAnswer_1= ruleInputAnswer
                    {
                     
                            newCompositeNode(grammarAccess.getAnswerAccess().getInputAnswerParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleInputAnswer_in_ruleAnswer1264);
                    this_InputAnswer_1=ruleInputAnswer();

                    state._fsp--;

                     
                            current = this_InputAnswer_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:595:2: (otherlv_2= 'enables question' otherlv_3= '[' ( (otherlv_4= RULE_STRING ) ) (otherlv_5= ',' ( (otherlv_6= RULE_STRING ) ) )* otherlv_7= ']' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==28) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:595:4: otherlv_2= 'enables question' otherlv_3= '[' ( (otherlv_4= RULE_STRING ) ) (otherlv_5= ',' ( (otherlv_6= RULE_STRING ) ) )* otherlv_7= ']'
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleAnswer1277); 

                        	newLeafNode(otherlv_2, grammarAccess.getAnswerAccess().getEnablesQuestionKeyword_1_0());
                        
                    otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleAnswer1289); 

                        	newLeafNode(otherlv_3, grammarAccess.getAnswerAccess().getLeftSquareBracketKeyword_1_1());
                        
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:603:1: ( (otherlv_4= RULE_STRING ) )
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:604:1: (otherlv_4= RULE_STRING )
                    {
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:604:1: (otherlv_4= RULE_STRING )
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:605:3: otherlv_4= RULE_STRING
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAnswerRule());
                    	        }
                            
                    otherlv_4=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAnswer1309); 

                    		newLeafNode(otherlv_4, grammarAccess.getAnswerAccess().getEnablesQuestionCrossReference_1_2_0()); 
                    	

                    }


                    }

                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:616:2: (otherlv_5= ',' ( (otherlv_6= RULE_STRING ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==13) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:616:4: otherlv_5= ',' ( (otherlv_6= RULE_STRING ) )
                    	    {
                    	    otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleAnswer1322); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getAnswerAccess().getCommaKeyword_1_3_0());
                    	        
                    	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:620:1: ( (otherlv_6= RULE_STRING ) )
                    	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:621:1: (otherlv_6= RULE_STRING )
                    	    {
                    	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:621:1: (otherlv_6= RULE_STRING )
                    	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:622:3: otherlv_6= RULE_STRING
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getAnswerRule());
                    	    	        }
                    	            
                    	    otherlv_6=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAnswer1342); 

                    	    		newLeafNode(otherlv_6, grammarAccess.getAnswerAccess().getEnablesQuestionCrossReference_1_3_1_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleAnswer1356); 

                        	newLeafNode(otherlv_7, grammarAccess.getAnswerAccess().getRightSquareBracketKeyword_1_4());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnswer"


    // $ANTLR start "entryRuleSimpleAnswer"
    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:645:1: entryRuleSimpleAnswer returns [EObject current=null] : iv_ruleSimpleAnswer= ruleSimpleAnswer EOF ;
    public final EObject entryRuleSimpleAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleAnswer = null;


        try {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:646:2: (iv_ruleSimpleAnswer= ruleSimpleAnswer EOF )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:647:2: iv_ruleSimpleAnswer= ruleSimpleAnswer EOF
            {
             newCompositeNode(grammarAccess.getSimpleAnswerRule()); 
            pushFollow(FOLLOW_ruleSimpleAnswer_in_entryRuleSimpleAnswer1394);
            iv_ruleSimpleAnswer=ruleSimpleAnswer();

            state._fsp--;

             current =iv_ruleSimpleAnswer; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleAnswer1404); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimpleAnswer"


    // $ANTLR start "ruleSimpleAnswer"
    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:654:1: ruleSimpleAnswer returns [EObject current=null] : ( (lv_name_0_0= RULE_STRING ) ) ;
    public final EObject ruleSimpleAnswer() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:657:28: ( ( (lv_name_0_0= RULE_STRING ) ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:658:1: ( (lv_name_0_0= RULE_STRING ) )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:658:1: ( (lv_name_0_0= RULE_STRING ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:659:1: (lv_name_0_0= RULE_STRING )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:659:1: (lv_name_0_0= RULE_STRING )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:660:3: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSimpleAnswer1445); 

            			newLeafNode(lv_name_0_0, grammarAccess.getSimpleAnswerAccess().getNameSTRINGTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSimpleAnswerRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"STRING");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimpleAnswer"


    // $ANTLR start "entryRuleInputAnswer"
    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:684:1: entryRuleInputAnswer returns [EObject current=null] : iv_ruleInputAnswer= ruleInputAnswer EOF ;
    public final EObject entryRuleInputAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputAnswer = null;


        try {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:685:2: (iv_ruleInputAnswer= ruleInputAnswer EOF )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:686:2: iv_ruleInputAnswer= ruleInputAnswer EOF
            {
             newCompositeNode(grammarAccess.getInputAnswerRule()); 
            pushFollow(FOLLOW_ruleInputAnswer_in_entryRuleInputAnswer1485);
            iv_ruleInputAnswer=ruleInputAnswer();

            state._fsp--;

             current =iv_ruleInputAnswer; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInputAnswer1495); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInputAnswer"


    // $ANTLR start "ruleInputAnswer"
    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:693:1: ruleInputAnswer returns [EObject current=null] : ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= '...' ) ;
    public final EObject ruleInputAnswer() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:696:28: ( ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= '...' ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:697:1: ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= '...' )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:697:1: ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= '...' )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:697:2: ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= '...'
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:697:2: ( (lv_name_0_0= RULE_STRING ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:698:1: (lv_name_0_0= RULE_STRING )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:698:1: (lv_name_0_0= RULE_STRING )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:699:3: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInputAnswer1537); 

            			newLeafNode(lv_name_0_0, grammarAccess.getInputAnswerAccess().getNameSTRINGTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInputAnswerRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleInputAnswer1554); 

                	newLeafNode(otherlv_1, grammarAccess.getInputAnswerAccess().getFullStopFullStopFullStopKeyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInputAnswer"


    // $ANTLR start "entryRuleSINT"
    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:727:1: entryRuleSINT returns [String current=null] : iv_ruleSINT= ruleSINT EOF ;
    public final String entryRuleSINT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSINT = null;


        try {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:728:2: (iv_ruleSINT= ruleSINT EOF )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:729:2: iv_ruleSINT= ruleSINT EOF
            {
             newCompositeNode(grammarAccess.getSINTRule()); 
            pushFollow(FOLLOW_ruleSINT_in_entryRuleSINT1591);
            iv_ruleSINT=ruleSINT();

            state._fsp--;

             current =iv_ruleSINT.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSINT1602); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSINT"


    // $ANTLR start "ruleSINT"
    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:736:1: ruleSINT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleSINT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:739:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:740:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:740:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:740:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:740:2: (kw= '-' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==30) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:741:2: kw= '-'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleSINT1641); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSINTAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSINT1658); 

            		current.merge(this_INT_1);
                
             
                newLeafNode(this_INT_1, grammarAccess.getSINTAccess().getINTTerminalRuleCall_1()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSINT"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleQuestionnaire_in_entryRuleQuestionnaire75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuestionnaire85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleQuestionnaire122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleQuestionnaire139 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleQuestionnaire156 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleGroup_in_ruleQuestionnaire177 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleQuestionnaire190 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleGroup_in_ruleQuestionnaire211 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_14_in_ruleQuestionnaire225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroup_in_entryRuleGroup261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGroup271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleGroup308 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGroup325 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleGroup342 = new BitSet(new long[]{0x00000000010F0000L});
    public static final BitSet FOLLOW_ruleQuestion_in_ruleGroup363 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleGroup376 = new BitSet(new long[]{0x00000000010F0000L});
    public static final BitSet FOLLOW_ruleQuestion_in_ruleGroup397 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_14_in_ruleGroup411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuestion_in_entryRuleQuestion447 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuestion457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpenQuestion_in_ruleQuestion504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClosedQuestion_in_ruleQuestion531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLikertQuestion_in_ruleQuestion558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpenQuestion_in_entryRuleOpenQuestion593 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpenQuestion603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleOpenQuestion641 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_17_in_ruleOpenQuestion659 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleOpenQuestion673 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOpenQuestion690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClosedQuestion_in_entryRuleClosedQuestion731 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClosedQuestion741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleClosedQuestion778 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_ruleClosedQuestion791 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_21_in_ruleClosedQuestion809 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClosedQuestion827 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleClosedQuestion844 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleClosedQuestion856 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAnswer_in_ruleClosedQuestion877 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleClosedQuestion890 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAnswer_in_ruleClosedQuestion911 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_14_in_ruleClosedQuestion925 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleClosedQuestion938 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClosedQuestion958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLikertQuestion_in_entryRuleLikertQuestion996 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLikertQuestion1006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleLikertQuestion1043 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLikertQuestion1060 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleLikertQuestion1077 = new BitSet(new long[]{0x0000000040000020L});
    public static final BitSet FOLLOW_ruleSINT_in_ruleLikertQuestion1098 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleLikertQuestion1110 = new BitSet(new long[]{0x0000000040000020L});
    public static final BitSet FOLLOW_ruleSINT_in_ruleLikertQuestion1131 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleLikertQuestion1143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnswer_in_entryRuleAnswer1179 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnswer1189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleAnswer_in_ruleAnswer1237 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_ruleInputAnswer_in_ruleAnswer1264 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_ruleAnswer1277 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAnswer1289 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAnswer1309 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleAnswer1322 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAnswer1342 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_14_in_ruleAnswer1356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleAnswer_in_entryRuleSimpleAnswer1394 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleAnswer1404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSimpleAnswer1445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInputAnswer_in_entryRuleInputAnswer1485 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInputAnswer1495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInputAnswer1537 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleInputAnswer1554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSINT_in_entryRuleSINT1591 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSINT1602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleSINT1641 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSINT1658 = new BitSet(new long[]{0x0000000000000002L});

}