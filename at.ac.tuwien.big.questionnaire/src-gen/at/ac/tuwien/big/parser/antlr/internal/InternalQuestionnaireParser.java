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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_QUOTED_STRING", "RULE_SINT", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'questionnaire'", "'['", "','", "']'", "'group'", "'mandatory'", "'multiline'", "'open question'", "'closed question allowing'", "'single answer'", "'multiple answers'", "'answers ['", "'default answer is'", "'likert question'", "'('", "'..'", "')'", "'...'", "'enabled question'"
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
    public static final int RULE_ANY_OTHER=12;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=10;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int RULE_QUOTED_STRING=4;
    public static final int T__13=13;
    public static final int RULE_INT=8;
    public static final int RULE_WS=11;

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
    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:76:1: ruleQuestionnaire returns [EObject current=null] : (otherlv_0= 'questionnaire' ( (lv_name_1_0= RULE_QUOTED_STRING ) ) otherlv_2= '[' ( (lv_groups_3_0= ruleGroup ) ) (otherlv_4= ',' ( (lv_groups_5_0= ruleGroup ) ) )* otherlv_6= ']' ) ;
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
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:79:28: ( (otherlv_0= 'questionnaire' ( (lv_name_1_0= RULE_QUOTED_STRING ) ) otherlv_2= '[' ( (lv_groups_3_0= ruleGroup ) ) (otherlv_4= ',' ( (lv_groups_5_0= ruleGroup ) ) )* otherlv_6= ']' ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:80:1: (otherlv_0= 'questionnaire' ( (lv_name_1_0= RULE_QUOTED_STRING ) ) otherlv_2= '[' ( (lv_groups_3_0= ruleGroup ) ) (otherlv_4= ',' ( (lv_groups_5_0= ruleGroup ) ) )* otherlv_6= ']' )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:80:1: (otherlv_0= 'questionnaire' ( (lv_name_1_0= RULE_QUOTED_STRING ) ) otherlv_2= '[' ( (lv_groups_3_0= ruleGroup ) ) (otherlv_4= ',' ( (lv_groups_5_0= ruleGroup ) ) )* otherlv_6= ']' )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:80:3: otherlv_0= 'questionnaire' ( (lv_name_1_0= RULE_QUOTED_STRING ) ) otherlv_2= '[' ( (lv_groups_3_0= ruleGroup ) ) (otherlv_4= ',' ( (lv_groups_5_0= ruleGroup ) ) )* otherlv_6= ']'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleQuestionnaire122); 

                	newLeafNode(otherlv_0, grammarAccess.getQuestionnaireAccess().getQuestionnaireKeyword_0());
                
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:84:1: ( (lv_name_1_0= RULE_QUOTED_STRING ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:85:1: (lv_name_1_0= RULE_QUOTED_STRING )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:85:1: (lv_name_1_0= RULE_QUOTED_STRING )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:86:3: lv_name_1_0= RULE_QUOTED_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_QUOTED_STRING,FOLLOW_RULE_QUOTED_STRING_in_ruleQuestionnaire139); 

            			newLeafNode(lv_name_1_0, grammarAccess.getQuestionnaireAccess().getNameQUOTED_STRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getQuestionnaireRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"QUOTED_STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleQuestionnaire156); 

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

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:124:4: otherlv_4= ',' ( (lv_groups_5_0= ruleGroup ) )
            	    {
            	    otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleQuestionnaire190); 

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

            otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleQuestionnaire225); 

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
    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:167:1: ruleGroup returns [EObject current=null] : (otherlv_0= 'group' ( (lv_name_1_0= RULE_QUOTED_STRING ) ) otherlv_2= '[' ( (lv_questions_3_0= ruleQuestion ) ) (otherlv_4= ',' ( (lv_questions_5_0= ruleQuestion ) ) )* otherlv_6= ']' ) ;
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
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:170:28: ( (otherlv_0= 'group' ( (lv_name_1_0= RULE_QUOTED_STRING ) ) otherlv_2= '[' ( (lv_questions_3_0= ruleQuestion ) ) (otherlv_4= ',' ( (lv_questions_5_0= ruleQuestion ) ) )* otherlv_6= ']' ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:171:1: (otherlv_0= 'group' ( (lv_name_1_0= RULE_QUOTED_STRING ) ) otherlv_2= '[' ( (lv_questions_3_0= ruleQuestion ) ) (otherlv_4= ',' ( (lv_questions_5_0= ruleQuestion ) ) )* otherlv_6= ']' )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:171:1: (otherlv_0= 'group' ( (lv_name_1_0= RULE_QUOTED_STRING ) ) otherlv_2= '[' ( (lv_questions_3_0= ruleQuestion ) ) (otherlv_4= ',' ( (lv_questions_5_0= ruleQuestion ) ) )* otherlv_6= ']' )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:171:3: otherlv_0= 'group' ( (lv_name_1_0= RULE_QUOTED_STRING ) ) otherlv_2= '[' ( (lv_questions_3_0= ruleQuestion ) ) (otherlv_4= ',' ( (lv_questions_5_0= ruleQuestion ) ) )* otherlv_6= ']'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleGroup308); 

                	newLeafNode(otherlv_0, grammarAccess.getGroupAccess().getGroupKeyword_0());
                
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:175:1: ( (lv_name_1_0= RULE_QUOTED_STRING ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:176:1: (lv_name_1_0= RULE_QUOTED_STRING )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:176:1: (lv_name_1_0= RULE_QUOTED_STRING )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:177:3: lv_name_1_0= RULE_QUOTED_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_QUOTED_STRING,FOLLOW_RULE_QUOTED_STRING_in_ruleGroup325); 

            			newLeafNode(lv_name_1_0, grammarAccess.getGroupAccess().getNameQUOTED_STRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGroupRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"QUOTED_STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleGroup342); 

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

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:215:4: otherlv_4= ',' ( (lv_questions_5_0= ruleQuestion ) )
            	    {
            	    otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleGroup376); 

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

            otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleGroup411); 

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
            case 18:
            case 19:
            case 20:
                {
                alt3=1;
                }
                break;
            case 21:
                {
                alt3=2;
                }
                break;
            case 26:
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
    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:308:1: ruleOpenQuestion returns [EObject current=null] : ( (otherlv_0= 'mandatory' | otherlv_1= 'multiline' )? otherlv_2= 'open question' ( (lv_name_3_0= RULE_QUOTED_STRING ) ) ) ;
    public final EObject ruleOpenQuestion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;

         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:311:28: ( ( (otherlv_0= 'mandatory' | otherlv_1= 'multiline' )? otherlv_2= 'open question' ( (lv_name_3_0= RULE_QUOTED_STRING ) ) ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:312:1: ( (otherlv_0= 'mandatory' | otherlv_1= 'multiline' )? otherlv_2= 'open question' ( (lv_name_3_0= RULE_QUOTED_STRING ) ) )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:312:1: ( (otherlv_0= 'mandatory' | otherlv_1= 'multiline' )? otherlv_2= 'open question' ( (lv_name_3_0= RULE_QUOTED_STRING ) ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:312:2: (otherlv_0= 'mandatory' | otherlv_1= 'multiline' )? otherlv_2= 'open question' ( (lv_name_3_0= RULE_QUOTED_STRING ) )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:312:2: (otherlv_0= 'mandatory' | otherlv_1= 'multiline' )?
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            else if ( (LA4_0==19) ) {
                alt4=2;
            }
            switch (alt4) {
                case 1 :
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:312:4: otherlv_0= 'mandatory'
                    {
                    otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleOpenQuestion641); 

                        	newLeafNode(otherlv_0, grammarAccess.getOpenQuestionAccess().getMandatoryKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:317:7: otherlv_1= 'multiline'
                    {
                    otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleOpenQuestion659); 

                        	newLeafNode(otherlv_1, grammarAccess.getOpenQuestionAccess().getMultilineKeyword_0_1());
                        

                    }
                    break;

            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleOpenQuestion673); 

                	newLeafNode(otherlv_2, grammarAccess.getOpenQuestionAccess().getOpenQuestionKeyword_1());
                
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:325:1: ( (lv_name_3_0= RULE_QUOTED_STRING ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:326:1: (lv_name_3_0= RULE_QUOTED_STRING )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:326:1: (lv_name_3_0= RULE_QUOTED_STRING )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:327:3: lv_name_3_0= RULE_QUOTED_STRING
            {
            lv_name_3_0=(Token)match(input,RULE_QUOTED_STRING,FOLLOW_RULE_QUOTED_STRING_in_ruleOpenQuestion690); 

            			newLeafNode(lv_name_3_0, grammarAccess.getOpenQuestionAccess().getNameQUOTED_STRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getOpenQuestionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"QUOTED_STRING");
            	    

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
    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:360:1: ruleClosedQuestion returns [EObject current=null] : (otherlv_0= 'closed question allowing' (otherlv_1= 'single answer' | otherlv_2= 'multiple answers' ) ( (lv_name_3_0= RULE_QUOTED_STRING ) ) otherlv_4= 'answers [' ( (lv_answers_5_0= ruleAnswer ) ) (otherlv_6= ',' ( (lv_answers_7_0= ruleAnswer ) ) )* otherlv_8= ']' (otherlv_9= 'default answer is' ( (lv_default_10_0= RULE_QUOTED_STRING ) ) )? ) ;
    public final EObject ruleClosedQuestion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_default_10_0=null;
        EObject lv_answers_5_0 = null;

        EObject lv_answers_7_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:363:28: ( (otherlv_0= 'closed question allowing' (otherlv_1= 'single answer' | otherlv_2= 'multiple answers' ) ( (lv_name_3_0= RULE_QUOTED_STRING ) ) otherlv_4= 'answers [' ( (lv_answers_5_0= ruleAnswer ) ) (otherlv_6= ',' ( (lv_answers_7_0= ruleAnswer ) ) )* otherlv_8= ']' (otherlv_9= 'default answer is' ( (lv_default_10_0= RULE_QUOTED_STRING ) ) )? ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:364:1: (otherlv_0= 'closed question allowing' (otherlv_1= 'single answer' | otherlv_2= 'multiple answers' ) ( (lv_name_3_0= RULE_QUOTED_STRING ) ) otherlv_4= 'answers [' ( (lv_answers_5_0= ruleAnswer ) ) (otherlv_6= ',' ( (lv_answers_7_0= ruleAnswer ) ) )* otherlv_8= ']' (otherlv_9= 'default answer is' ( (lv_default_10_0= RULE_QUOTED_STRING ) ) )? )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:364:1: (otherlv_0= 'closed question allowing' (otherlv_1= 'single answer' | otherlv_2= 'multiple answers' ) ( (lv_name_3_0= RULE_QUOTED_STRING ) ) otherlv_4= 'answers [' ( (lv_answers_5_0= ruleAnswer ) ) (otherlv_6= ',' ( (lv_answers_7_0= ruleAnswer ) ) )* otherlv_8= ']' (otherlv_9= 'default answer is' ( (lv_default_10_0= RULE_QUOTED_STRING ) ) )? )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:364:3: otherlv_0= 'closed question allowing' (otherlv_1= 'single answer' | otherlv_2= 'multiple answers' ) ( (lv_name_3_0= RULE_QUOTED_STRING ) ) otherlv_4= 'answers [' ( (lv_answers_5_0= ruleAnswer ) ) (otherlv_6= ',' ( (lv_answers_7_0= ruleAnswer ) ) )* otherlv_8= ']' (otherlv_9= 'default answer is' ( (lv_default_10_0= RULE_QUOTED_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleClosedQuestion778); 

                	newLeafNode(otherlv_0, grammarAccess.getClosedQuestionAccess().getClosedQuestionAllowingKeyword_0());
                
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:368:1: (otherlv_1= 'single answer' | otherlv_2= 'multiple answers' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==22) ) {
                alt5=1;
            }
            else if ( (LA5_0==23) ) {
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
                    otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleClosedQuestion791); 

                        	newLeafNode(otherlv_1, grammarAccess.getClosedQuestionAccess().getSingleAnswerKeyword_1_0());
                        

                    }
                    break;
                case 2 :
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:373:7: otherlv_2= 'multiple answers'
                    {
                    otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleClosedQuestion809); 

                        	newLeafNode(otherlv_2, grammarAccess.getClosedQuestionAccess().getMultipleAnswersKeyword_1_1());
                        

                    }
                    break;

            }

            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:377:2: ( (lv_name_3_0= RULE_QUOTED_STRING ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:378:1: (lv_name_3_0= RULE_QUOTED_STRING )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:378:1: (lv_name_3_0= RULE_QUOTED_STRING )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:379:3: lv_name_3_0= RULE_QUOTED_STRING
            {
            lv_name_3_0=(Token)match(input,RULE_QUOTED_STRING,FOLLOW_RULE_QUOTED_STRING_in_ruleClosedQuestion827); 

            			newLeafNode(lv_name_3_0, grammarAccess.getClosedQuestionAccess().getNameQUOTED_STRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getClosedQuestionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"QUOTED_STRING");
            	    

            }


            }

            otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleClosedQuestion844); 

                	newLeafNode(otherlv_4, grammarAccess.getClosedQuestionAccess().getAnswersKeyword_3());
                
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:399:1: ( (lv_answers_5_0= ruleAnswer ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:400:1: (lv_answers_5_0= ruleAnswer )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:400:1: (lv_answers_5_0= ruleAnswer )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:401:3: lv_answers_5_0= ruleAnswer
            {
             
            	        newCompositeNode(grammarAccess.getClosedQuestionAccess().getAnswersAnswerParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleAnswer_in_ruleClosedQuestion865);
            lv_answers_5_0=ruleAnswer();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getClosedQuestionRule());
            	        }
                   		add(
                   			current, 
                   			"answers",
                    		lv_answers_5_0, 
                    		"Answer");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:417:2: (otherlv_6= ',' ( (lv_answers_7_0= ruleAnswer ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:417:4: otherlv_6= ',' ( (lv_answers_7_0= ruleAnswer ) )
            	    {
            	    otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleClosedQuestion878); 

            	        	newLeafNode(otherlv_6, grammarAccess.getClosedQuestionAccess().getCommaKeyword_5_0());
            	        
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:421:1: ( (lv_answers_7_0= ruleAnswer ) )
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:422:1: (lv_answers_7_0= ruleAnswer )
            	    {
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:422:1: (lv_answers_7_0= ruleAnswer )
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:423:3: lv_answers_7_0= ruleAnswer
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getClosedQuestionAccess().getAnswersAnswerParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAnswer_in_ruleClosedQuestion899);
            	    lv_answers_7_0=ruleAnswer();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getClosedQuestionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"answers",
            	            		lv_answers_7_0, 
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

            otherlv_8=(Token)match(input,16,FOLLOW_16_in_ruleClosedQuestion913); 

                	newLeafNode(otherlv_8, grammarAccess.getClosedQuestionAccess().getRightSquareBracketKeyword_6());
                
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:443:1: (otherlv_9= 'default answer is' ( (lv_default_10_0= RULE_QUOTED_STRING ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==25) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:443:3: otherlv_9= 'default answer is' ( (lv_default_10_0= RULE_QUOTED_STRING ) )
                    {
                    otherlv_9=(Token)match(input,25,FOLLOW_25_in_ruleClosedQuestion926); 

                        	newLeafNode(otherlv_9, grammarAccess.getClosedQuestionAccess().getDefaultAnswerIsKeyword_7_0());
                        
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:447:1: ( (lv_default_10_0= RULE_QUOTED_STRING ) )
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:448:1: (lv_default_10_0= RULE_QUOTED_STRING )
                    {
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:448:1: (lv_default_10_0= RULE_QUOTED_STRING )
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:449:3: lv_default_10_0= RULE_QUOTED_STRING
                    {
                    lv_default_10_0=(Token)match(input,RULE_QUOTED_STRING,FOLLOW_RULE_QUOTED_STRING_in_ruleClosedQuestion943); 

                    			newLeafNode(lv_default_10_0, grammarAccess.getClosedQuestionAccess().getDefaultQUOTED_STRINGTerminalRuleCall_7_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getClosedQuestionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"default",
                            		lv_default_10_0, 
                            		"QUOTED_STRING");
                    	    

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
    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:473:1: entryRuleLikertQuestion returns [EObject current=null] : iv_ruleLikertQuestion= ruleLikertQuestion EOF ;
    public final EObject entryRuleLikertQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLikertQuestion = null;


        try {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:474:2: (iv_ruleLikertQuestion= ruleLikertQuestion EOF )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:475:2: iv_ruleLikertQuestion= ruleLikertQuestion EOF
            {
             newCompositeNode(grammarAccess.getLikertQuestionRule()); 
            pushFollow(FOLLOW_ruleLikertQuestion_in_entryRuleLikertQuestion986);
            iv_ruleLikertQuestion=ruleLikertQuestion();

            state._fsp--;

             current =iv_ruleLikertQuestion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLikertQuestion996); 

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
    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:482:1: ruleLikertQuestion returns [EObject current=null] : (otherlv_0= 'likert question' ( (lv_name_1_0= RULE_QUOTED_STRING ) ) otherlv_2= '(' ( (lv_from_3_0= RULE_SINT ) ) otherlv_4= '..' ( (lv_to_5_0= RULE_SINT ) ) otherlv_6= ')' ) ;
    public final EObject ruleLikertQuestion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_from_3_0=null;
        Token otherlv_4=null;
        Token lv_to_5_0=null;
        Token otherlv_6=null;

         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:485:28: ( (otherlv_0= 'likert question' ( (lv_name_1_0= RULE_QUOTED_STRING ) ) otherlv_2= '(' ( (lv_from_3_0= RULE_SINT ) ) otherlv_4= '..' ( (lv_to_5_0= RULE_SINT ) ) otherlv_6= ')' ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:486:1: (otherlv_0= 'likert question' ( (lv_name_1_0= RULE_QUOTED_STRING ) ) otherlv_2= '(' ( (lv_from_3_0= RULE_SINT ) ) otherlv_4= '..' ( (lv_to_5_0= RULE_SINT ) ) otherlv_6= ')' )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:486:1: (otherlv_0= 'likert question' ( (lv_name_1_0= RULE_QUOTED_STRING ) ) otherlv_2= '(' ( (lv_from_3_0= RULE_SINT ) ) otherlv_4= '..' ( (lv_to_5_0= RULE_SINT ) ) otherlv_6= ')' )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:486:3: otherlv_0= 'likert question' ( (lv_name_1_0= RULE_QUOTED_STRING ) ) otherlv_2= '(' ( (lv_from_3_0= RULE_SINT ) ) otherlv_4= '..' ( (lv_to_5_0= RULE_SINT ) ) otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleLikertQuestion1033); 

                	newLeafNode(otherlv_0, grammarAccess.getLikertQuestionAccess().getLikertQuestionKeyword_0());
                
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:490:1: ( (lv_name_1_0= RULE_QUOTED_STRING ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:491:1: (lv_name_1_0= RULE_QUOTED_STRING )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:491:1: (lv_name_1_0= RULE_QUOTED_STRING )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:492:3: lv_name_1_0= RULE_QUOTED_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_QUOTED_STRING,FOLLOW_RULE_QUOTED_STRING_in_ruleLikertQuestion1050); 

            			newLeafNode(lv_name_1_0, grammarAccess.getLikertQuestionAccess().getNameQUOTED_STRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLikertQuestionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"QUOTED_STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleLikertQuestion1067); 

                	newLeafNode(otherlv_2, grammarAccess.getLikertQuestionAccess().getLeftParenthesisKeyword_2());
                
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:512:1: ( (lv_from_3_0= RULE_SINT ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:513:1: (lv_from_3_0= RULE_SINT )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:513:1: (lv_from_3_0= RULE_SINT )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:514:3: lv_from_3_0= RULE_SINT
            {
            lv_from_3_0=(Token)match(input,RULE_SINT,FOLLOW_RULE_SINT_in_ruleLikertQuestion1084); 

            			newLeafNode(lv_from_3_0, grammarAccess.getLikertQuestionAccess().getFromSINTTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLikertQuestionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"from",
                    		lv_from_3_0, 
                    		"SINT");
            	    

            }


            }

            otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleLikertQuestion1101); 

                	newLeafNode(otherlv_4, grammarAccess.getLikertQuestionAccess().getFullStopFullStopKeyword_4());
                
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:534:1: ( (lv_to_5_0= RULE_SINT ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:535:1: (lv_to_5_0= RULE_SINT )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:535:1: (lv_to_5_0= RULE_SINT )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:536:3: lv_to_5_0= RULE_SINT
            {
            lv_to_5_0=(Token)match(input,RULE_SINT,FOLLOW_RULE_SINT_in_ruleLikertQuestion1118); 

            			newLeafNode(lv_to_5_0, grammarAccess.getLikertQuestionAccess().getToSINTTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLikertQuestionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"to",
                    		lv_to_5_0, 
                    		"SINT");
            	    

            }


            }

            otherlv_6=(Token)match(input,29,FOLLOW_29_in_ruleLikertQuestion1135); 

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
    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:564:1: entryRuleAnswer returns [EObject current=null] : iv_ruleAnswer= ruleAnswer EOF ;
    public final EObject entryRuleAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnswer = null;


        try {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:565:2: (iv_ruleAnswer= ruleAnswer EOF )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:566:2: iv_ruleAnswer= ruleAnswer EOF
            {
             newCompositeNode(grammarAccess.getAnswerRule()); 
            pushFollow(FOLLOW_ruleAnswer_in_entryRuleAnswer1171);
            iv_ruleAnswer=ruleAnswer();

            state._fsp--;

             current =iv_ruleAnswer; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnswer1181); 

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
    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:573:1: ruleAnswer returns [EObject current=null] : ( (this_SimpleAnswer_0= ruleSimpleAnswer | this_InputAnswer_1= ruleInputAnswer ) ( (lv_enables_2_0= ruleEnablesQuestion ) )? ) ;
    public final EObject ruleAnswer() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleAnswer_0 = null;

        EObject this_InputAnswer_1 = null;

        EObject lv_enables_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:576:28: ( ( (this_SimpleAnswer_0= ruleSimpleAnswer | this_InputAnswer_1= ruleInputAnswer ) ( (lv_enables_2_0= ruleEnablesQuestion ) )? ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:577:1: ( (this_SimpleAnswer_0= ruleSimpleAnswer | this_InputAnswer_1= ruleInputAnswer ) ( (lv_enables_2_0= ruleEnablesQuestion ) )? )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:577:1: ( (this_SimpleAnswer_0= ruleSimpleAnswer | this_InputAnswer_1= ruleInputAnswer ) ( (lv_enables_2_0= ruleEnablesQuestion ) )? )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:577:2: (this_SimpleAnswer_0= ruleSimpleAnswer | this_InputAnswer_1= ruleInputAnswer ) ( (lv_enables_2_0= ruleEnablesQuestion ) )?
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:577:2: (this_SimpleAnswer_0= ruleSimpleAnswer | this_InputAnswer_1= ruleInputAnswer )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_QUOTED_STRING) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==EOF||(LA8_1>=15 && LA8_1<=16)||LA8_1==31) ) {
                    alt8=1;
                }
                else if ( (LA8_1==30) ) {
                    alt8=2;
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
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:578:5: this_SimpleAnswer_0= ruleSimpleAnswer
                    {
                     
                            newCompositeNode(grammarAccess.getAnswerAccess().getSimpleAnswerParserRuleCall_0_0()); 
                        
                    pushFollow(FOLLOW_ruleSimpleAnswer_in_ruleAnswer1229);
                    this_SimpleAnswer_0=ruleSimpleAnswer();

                    state._fsp--;

                     
                            current = this_SimpleAnswer_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:588:5: this_InputAnswer_1= ruleInputAnswer
                    {
                     
                            newCompositeNode(grammarAccess.getAnswerAccess().getInputAnswerParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleInputAnswer_in_ruleAnswer1256);
                    this_InputAnswer_1=ruleInputAnswer();

                    state._fsp--;

                     
                            current = this_InputAnswer_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:596:2: ( (lv_enables_2_0= ruleEnablesQuestion ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==31) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:597:1: (lv_enables_2_0= ruleEnablesQuestion )
                    {
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:597:1: (lv_enables_2_0= ruleEnablesQuestion )
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:598:3: lv_enables_2_0= ruleEnablesQuestion
                    {
                     
                    	        newCompositeNode(grammarAccess.getAnswerAccess().getEnablesEnablesQuestionParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEnablesQuestion_in_ruleAnswer1277);
                    lv_enables_2_0=ruleEnablesQuestion();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAnswerRule());
                    	        }
                           		set(
                           			current, 
                           			"enables",
                            		lv_enables_2_0, 
                            		"EnablesQuestion");
                    	        afterParserOrEnumRuleCall();
                    	    

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
    // $ANTLR end "ruleAnswer"


    // $ANTLR start "entryRuleSimpleAnswer"
    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:622:1: entryRuleSimpleAnswer returns [EObject current=null] : iv_ruleSimpleAnswer= ruleSimpleAnswer EOF ;
    public final EObject entryRuleSimpleAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleAnswer = null;


        try {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:623:2: (iv_ruleSimpleAnswer= ruleSimpleAnswer EOF )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:624:2: iv_ruleSimpleAnswer= ruleSimpleAnswer EOF
            {
             newCompositeNode(grammarAccess.getSimpleAnswerRule()); 
            pushFollow(FOLLOW_ruleSimpleAnswer_in_entryRuleSimpleAnswer1314);
            iv_ruleSimpleAnswer=ruleSimpleAnswer();

            state._fsp--;

             current =iv_ruleSimpleAnswer; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleAnswer1324); 

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
    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:631:1: ruleSimpleAnswer returns [EObject current=null] : ( (lv_name_0_0= RULE_QUOTED_STRING ) ) ;
    public final EObject ruleSimpleAnswer() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:634:28: ( ( (lv_name_0_0= RULE_QUOTED_STRING ) ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:635:1: ( (lv_name_0_0= RULE_QUOTED_STRING ) )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:635:1: ( (lv_name_0_0= RULE_QUOTED_STRING ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:636:1: (lv_name_0_0= RULE_QUOTED_STRING )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:636:1: (lv_name_0_0= RULE_QUOTED_STRING )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:637:3: lv_name_0_0= RULE_QUOTED_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_QUOTED_STRING,FOLLOW_RULE_QUOTED_STRING_in_ruleSimpleAnswer1365); 

            			newLeafNode(lv_name_0_0, grammarAccess.getSimpleAnswerAccess().getNameQUOTED_STRINGTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSimpleAnswerRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"QUOTED_STRING");
            	    

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
    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:661:1: entryRuleInputAnswer returns [EObject current=null] : iv_ruleInputAnswer= ruleInputAnswer EOF ;
    public final EObject entryRuleInputAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputAnswer = null;


        try {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:662:2: (iv_ruleInputAnswer= ruleInputAnswer EOF )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:663:2: iv_ruleInputAnswer= ruleInputAnswer EOF
            {
             newCompositeNode(grammarAccess.getInputAnswerRule()); 
            pushFollow(FOLLOW_ruleInputAnswer_in_entryRuleInputAnswer1405);
            iv_ruleInputAnswer=ruleInputAnswer();

            state._fsp--;

             current =iv_ruleInputAnswer; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInputAnswer1415); 

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
    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:670:1: ruleInputAnswer returns [EObject current=null] : ( ( (lv_name_0_0= RULE_QUOTED_STRING ) ) otherlv_1= '...' ) ;
    public final EObject ruleInputAnswer() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:673:28: ( ( ( (lv_name_0_0= RULE_QUOTED_STRING ) ) otherlv_1= '...' ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:674:1: ( ( (lv_name_0_0= RULE_QUOTED_STRING ) ) otherlv_1= '...' )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:674:1: ( ( (lv_name_0_0= RULE_QUOTED_STRING ) ) otherlv_1= '...' )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:674:2: ( (lv_name_0_0= RULE_QUOTED_STRING ) ) otherlv_1= '...'
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:674:2: ( (lv_name_0_0= RULE_QUOTED_STRING ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:675:1: (lv_name_0_0= RULE_QUOTED_STRING )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:675:1: (lv_name_0_0= RULE_QUOTED_STRING )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:676:3: lv_name_0_0= RULE_QUOTED_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_QUOTED_STRING,FOLLOW_RULE_QUOTED_STRING_in_ruleInputAnswer1457); 

            			newLeafNode(lv_name_0_0, grammarAccess.getInputAnswerAccess().getNameQUOTED_STRINGTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInputAnswerRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"QUOTED_STRING");
            	    

            }


            }

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleInputAnswer1474); 

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


    // $ANTLR start "entryRuleEnablesQuestion"
    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:704:1: entryRuleEnablesQuestion returns [EObject current=null] : iv_ruleEnablesQuestion= ruleEnablesQuestion EOF ;
    public final EObject entryRuleEnablesQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnablesQuestion = null;


        try {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:705:2: (iv_ruleEnablesQuestion= ruleEnablesQuestion EOF )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:706:2: iv_ruleEnablesQuestion= ruleEnablesQuestion EOF
            {
             newCompositeNode(grammarAccess.getEnablesQuestionRule()); 
            pushFollow(FOLLOW_ruleEnablesQuestion_in_entryRuleEnablesQuestion1510);
            iv_ruleEnablesQuestion=ruleEnablesQuestion();

            state._fsp--;

             current =iv_ruleEnablesQuestion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnablesQuestion1520); 

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
    // $ANTLR end "entryRuleEnablesQuestion"


    // $ANTLR start "ruleEnablesQuestion"
    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:713:1: ruleEnablesQuestion returns [EObject current=null] : (otherlv_0= 'enabled question' ( (lv_name_1_0= RULE_QUOTED_STRING ) ) ) ;
    public final EObject ruleEnablesQuestion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:716:28: ( (otherlv_0= 'enabled question' ( (lv_name_1_0= RULE_QUOTED_STRING ) ) ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:717:1: (otherlv_0= 'enabled question' ( (lv_name_1_0= RULE_QUOTED_STRING ) ) )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:717:1: (otherlv_0= 'enabled question' ( (lv_name_1_0= RULE_QUOTED_STRING ) ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:717:3: otherlv_0= 'enabled question' ( (lv_name_1_0= RULE_QUOTED_STRING ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleEnablesQuestion1557); 

                	newLeafNode(otherlv_0, grammarAccess.getEnablesQuestionAccess().getEnabledQuestionKeyword_0());
                
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:721:1: ( (lv_name_1_0= RULE_QUOTED_STRING ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:722:1: (lv_name_1_0= RULE_QUOTED_STRING )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:722:1: (lv_name_1_0= RULE_QUOTED_STRING )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:723:3: lv_name_1_0= RULE_QUOTED_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_QUOTED_STRING,FOLLOW_RULE_QUOTED_STRING_in_ruleEnablesQuestion1574); 

            			newLeafNode(lv_name_1_0, grammarAccess.getEnablesQuestionAccess().getNameQUOTED_STRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEnablesQuestionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"QUOTED_STRING");
            	    

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
    // $ANTLR end "ruleEnablesQuestion"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleQuestionnaire_in_entryRuleQuestionnaire75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuestionnaire85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleQuestionnaire122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_QUOTED_STRING_in_ruleQuestionnaire139 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleQuestionnaire156 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleGroup_in_ruleQuestionnaire177 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleQuestionnaire190 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleGroup_in_ruleQuestionnaire211 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16_in_ruleQuestionnaire225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroup_in_entryRuleGroup261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGroup271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleGroup308 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_QUOTED_STRING_in_ruleGroup325 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleGroup342 = new BitSet(new long[]{0x00000000043C0000L});
    public static final BitSet FOLLOW_ruleQuestion_in_ruleGroup363 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleGroup376 = new BitSet(new long[]{0x00000000043C0000L});
    public static final BitSet FOLLOW_ruleQuestion_in_ruleGroup397 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16_in_ruleGroup411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuestion_in_entryRuleQuestion447 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuestion457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpenQuestion_in_ruleQuestion504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClosedQuestion_in_ruleQuestion531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLikertQuestion_in_ruleQuestion558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpenQuestion_in_entryRuleOpenQuestion593 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpenQuestion603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleOpenQuestion641 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_19_in_ruleOpenQuestion659 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleOpenQuestion673 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_QUOTED_STRING_in_ruleOpenQuestion690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClosedQuestion_in_entryRuleClosedQuestion731 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClosedQuestion741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleClosedQuestion778 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22_in_ruleClosedQuestion791 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_23_in_ruleClosedQuestion809 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_QUOTED_STRING_in_ruleClosedQuestion827 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleClosedQuestion844 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAnswer_in_ruleClosedQuestion865 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleClosedQuestion878 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAnswer_in_ruleClosedQuestion899 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16_in_ruleClosedQuestion913 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleClosedQuestion926 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_QUOTED_STRING_in_ruleClosedQuestion943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLikertQuestion_in_entryRuleLikertQuestion986 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLikertQuestion996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleLikertQuestion1033 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_QUOTED_STRING_in_ruleLikertQuestion1050 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleLikertQuestion1067 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_SINT_in_ruleLikertQuestion1084 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleLikertQuestion1101 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_SINT_in_ruleLikertQuestion1118 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleLikertQuestion1135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnswer_in_entryRuleAnswer1171 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnswer1181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleAnswer_in_ruleAnswer1229 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_ruleInputAnswer_in_ruleAnswer1256 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_ruleEnablesQuestion_in_ruleAnswer1277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleAnswer_in_entryRuleSimpleAnswer1314 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleAnswer1324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_QUOTED_STRING_in_ruleSimpleAnswer1365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInputAnswer_in_entryRuleInputAnswer1405 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInputAnswer1415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_QUOTED_STRING_in_ruleInputAnswer1457 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleInputAnswer1474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnablesQuestion_in_entryRuleEnablesQuestion1510 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnablesQuestion1520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleEnablesQuestion1557 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_QUOTED_STRING_in_ruleEnablesQuestion1574 = new BitSet(new long[]{0x0000000000000002L});

}