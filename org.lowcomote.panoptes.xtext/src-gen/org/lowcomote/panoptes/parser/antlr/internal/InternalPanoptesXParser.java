package org.lowcomote.panoptes.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.lowcomote.panoptes.services.PanoptesXGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPanoptesXParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_SAFESTRING", "RULE_INT", "RULE_FLOAT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Model'", "'{'", "'uses'", "','", "'outputs'", "'}'", "'FeatureStore'", "'features'", "'entities'", "'labels'", "'request'", "'data'", "'keys'", "':'", "'requires'", "'predicts'", "'Deployment'", "'model'", "'inputs'", "'BaseAlgorithm'", "'codebase'", "'runtime'", "'severity'", "'levels'", "'accepts'", "'only'", "'parameters'", "'HigherOrderAlgorithm'", "'BaseAlgorithmRuntime'", "'endpoint'", "'HigherOrderAlgorithmRuntime'", "'BaseAlgorithmExecution'", "'algorithm'", "'live'", "'historical'", "'actions'", "'parameter'", "'values'", "'HigherOrderAlgorithmExecution'", "'observed'", "'execution'", "'minimum'", "'min'", "'observations'", "'maximum'", "'max'", "'->'", "'Trigger'", "'or'", "'execute'", "'every'", "'one'", "'samples'", "'predictions'", "'Action'", "'mandatory'", "'='", "'ActionExecution'", "'action'", "'continuous'", "'categorical'", "'ordered categorical'", "'hour'", "'day'", "'week'", "'month'", "'year'", "'Integer'", "'Real'", "'String'", "'Boolean'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=8;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=4;
    public static final int RULE_SAFESTRING=5;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_FLOAT=7;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalPanoptesXParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPanoptesXParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPanoptesXParser.tokenNames; }
    public String getGrammarFileName() { return "InternalPanoptesX.g"; }



     	private PanoptesXGrammarAccess grammarAccess;

        public InternalPanoptesXParser(TokenStream input, PanoptesXGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Platform";
       	}

       	@Override
       	protected PanoptesXGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRulePlatform"
    // InternalPanoptesX.g:65:1: entryRulePlatform returns [EObject current=null] : iv_rulePlatform= rulePlatform EOF ;
    public final EObject entryRulePlatform() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatform = null;


        try {
            // InternalPanoptesX.g:65:49: (iv_rulePlatform= rulePlatform EOF )
            // InternalPanoptesX.g:66:2: iv_rulePlatform= rulePlatform EOF
            {
             newCompositeNode(grammarAccess.getPlatformRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlatform=rulePlatform();

            state._fsp--;

             current =iv_rulePlatform; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePlatform"


    // $ANTLR start "rulePlatform"
    // InternalPanoptesX.g:72:1: rulePlatform returns [EObject current=null] : ( ( (lv_featureStore_0_0= ruleFeatureStore ) ) | ( (lv_mlModels_1_0= ruleModel ) ) | ( (lv_deployments_2_0= ruleDeployment ) ) | ( (lv_algorithms_3_0= ruleAlgorithm ) ) | ( (lv_algorithmRuntimes_4_0= ruleAlgorithmRuntime ) ) | ( (lv_actions_5_0= ruleAction ) ) )* ;
    public final EObject rulePlatform() throws RecognitionException {
        EObject current = null;

        EObject lv_featureStore_0_0 = null;

        EObject lv_mlModels_1_0 = null;

        EObject lv_deployments_2_0 = null;

        EObject lv_algorithms_3_0 = null;

        EObject lv_algorithmRuntimes_4_0 = null;

        EObject lv_actions_5_0 = null;



        	enterRule();

        try {
            // InternalPanoptesX.g:78:2: ( ( ( (lv_featureStore_0_0= ruleFeatureStore ) ) | ( (lv_mlModels_1_0= ruleModel ) ) | ( (lv_deployments_2_0= ruleDeployment ) ) | ( (lv_algorithms_3_0= ruleAlgorithm ) ) | ( (lv_algorithmRuntimes_4_0= ruleAlgorithmRuntime ) ) | ( (lv_actions_5_0= ruleAction ) ) )* )
            // InternalPanoptesX.g:79:2: ( ( (lv_featureStore_0_0= ruleFeatureStore ) ) | ( (lv_mlModels_1_0= ruleModel ) ) | ( (lv_deployments_2_0= ruleDeployment ) ) | ( (lv_algorithms_3_0= ruleAlgorithm ) ) | ( (lv_algorithmRuntimes_4_0= ruleAlgorithmRuntime ) ) | ( (lv_actions_5_0= ruleAction ) ) )*
            {
            // InternalPanoptesX.g:79:2: ( ( (lv_featureStore_0_0= ruleFeatureStore ) ) | ( (lv_mlModels_1_0= ruleModel ) ) | ( (lv_deployments_2_0= ruleDeployment ) ) | ( (lv_algorithms_3_0= ruleAlgorithm ) ) | ( (lv_algorithmRuntimes_4_0= ruleAlgorithmRuntime ) ) | ( (lv_actions_5_0= ruleAction ) ) )*
            loop1:
            do {
                int alt1=7;
                switch ( input.LA(1) ) {
                case 19:
                    {
                    alt1=1;
                    }
                    break;
                case 13:
                    {
                    alt1=2;
                    }
                    break;
                case 29:
                    {
                    alt1=3;
                    }
                    break;
                case 32:
                case 40:
                    {
                    alt1=4;
                    }
                    break;
                case 41:
                case 43:
                    {
                    alt1=5;
                    }
                    break;
                case 67:
                    {
                    alt1=6;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // InternalPanoptesX.g:80:3: ( (lv_featureStore_0_0= ruleFeatureStore ) )
            	    {
            	    // InternalPanoptesX.g:80:3: ( (lv_featureStore_0_0= ruleFeatureStore ) )
            	    // InternalPanoptesX.g:81:4: (lv_featureStore_0_0= ruleFeatureStore )
            	    {
            	    // InternalPanoptesX.g:81:4: (lv_featureStore_0_0= ruleFeatureStore )
            	    // InternalPanoptesX.g:82:5: lv_featureStore_0_0= ruleFeatureStore
            	    {

            	    					newCompositeNode(grammarAccess.getPlatformAccess().getFeatureStoreFeatureStoreParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_featureStore_0_0=ruleFeatureStore();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPlatformRule());
            	    					}
            	    					set(
            	    						current,
            	    						"featureStore",
            	    						lv_featureStore_0_0,
            	    						"org.lowcomote.panoptes.PanoptesX.FeatureStore");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalPanoptesX.g:100:3: ( (lv_mlModels_1_0= ruleModel ) )
            	    {
            	    // InternalPanoptesX.g:100:3: ( (lv_mlModels_1_0= ruleModel ) )
            	    // InternalPanoptesX.g:101:4: (lv_mlModels_1_0= ruleModel )
            	    {
            	    // InternalPanoptesX.g:101:4: (lv_mlModels_1_0= ruleModel )
            	    // InternalPanoptesX.g:102:5: lv_mlModels_1_0= ruleModel
            	    {

            	    					newCompositeNode(grammarAccess.getPlatformAccess().getMlModelsModelParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_mlModels_1_0=ruleModel();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPlatformRule());
            	    					}
            	    					add(
            	    						current,
            	    						"mlModels",
            	    						lv_mlModels_1_0,
            	    						"org.lowcomote.panoptes.PanoptesX.Model");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalPanoptesX.g:120:3: ( (lv_deployments_2_0= ruleDeployment ) )
            	    {
            	    // InternalPanoptesX.g:120:3: ( (lv_deployments_2_0= ruleDeployment ) )
            	    // InternalPanoptesX.g:121:4: (lv_deployments_2_0= ruleDeployment )
            	    {
            	    // InternalPanoptesX.g:121:4: (lv_deployments_2_0= ruleDeployment )
            	    // InternalPanoptesX.g:122:5: lv_deployments_2_0= ruleDeployment
            	    {

            	    					newCompositeNode(grammarAccess.getPlatformAccess().getDeploymentsDeploymentParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_deployments_2_0=ruleDeployment();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPlatformRule());
            	    					}
            	    					add(
            	    						current,
            	    						"deployments",
            	    						lv_deployments_2_0,
            	    						"org.lowcomote.panoptes.PanoptesX.Deployment");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalPanoptesX.g:140:3: ( (lv_algorithms_3_0= ruleAlgorithm ) )
            	    {
            	    // InternalPanoptesX.g:140:3: ( (lv_algorithms_3_0= ruleAlgorithm ) )
            	    // InternalPanoptesX.g:141:4: (lv_algorithms_3_0= ruleAlgorithm )
            	    {
            	    // InternalPanoptesX.g:141:4: (lv_algorithms_3_0= ruleAlgorithm )
            	    // InternalPanoptesX.g:142:5: lv_algorithms_3_0= ruleAlgorithm
            	    {

            	    					newCompositeNode(grammarAccess.getPlatformAccess().getAlgorithmsAlgorithmParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_algorithms_3_0=ruleAlgorithm();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPlatformRule());
            	    					}
            	    					add(
            	    						current,
            	    						"algorithms",
            	    						lv_algorithms_3_0,
            	    						"org.lowcomote.panoptes.PanoptesX.Algorithm");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalPanoptesX.g:160:3: ( (lv_algorithmRuntimes_4_0= ruleAlgorithmRuntime ) )
            	    {
            	    // InternalPanoptesX.g:160:3: ( (lv_algorithmRuntimes_4_0= ruleAlgorithmRuntime ) )
            	    // InternalPanoptesX.g:161:4: (lv_algorithmRuntimes_4_0= ruleAlgorithmRuntime )
            	    {
            	    // InternalPanoptesX.g:161:4: (lv_algorithmRuntimes_4_0= ruleAlgorithmRuntime )
            	    // InternalPanoptesX.g:162:5: lv_algorithmRuntimes_4_0= ruleAlgorithmRuntime
            	    {

            	    					newCompositeNode(grammarAccess.getPlatformAccess().getAlgorithmRuntimesAlgorithmRuntimeParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_algorithmRuntimes_4_0=ruleAlgorithmRuntime();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPlatformRule());
            	    					}
            	    					add(
            	    						current,
            	    						"algorithmRuntimes",
            	    						lv_algorithmRuntimes_4_0,
            	    						"org.lowcomote.panoptes.PanoptesX.AlgorithmRuntime");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalPanoptesX.g:180:3: ( (lv_actions_5_0= ruleAction ) )
            	    {
            	    // InternalPanoptesX.g:180:3: ( (lv_actions_5_0= ruleAction ) )
            	    // InternalPanoptesX.g:181:4: (lv_actions_5_0= ruleAction )
            	    {
            	    // InternalPanoptesX.g:181:4: (lv_actions_5_0= ruleAction )
            	    // InternalPanoptesX.g:182:5: lv_actions_5_0= ruleAction
            	    {

            	    					newCompositeNode(grammarAccess.getPlatformAccess().getActionsActionParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_actions_5_0=ruleAction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPlatformRule());
            	    					}
            	    					add(
            	    						current,
            	    						"actions",
            	    						lv_actions_5_0,
            	    						"org.lowcomote.panoptes.PanoptesX.Action");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "rulePlatform"


    // $ANTLR start "entryRuleModel"
    // InternalPanoptesX.g:203:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalPanoptesX.g:203:46: (iv_ruleModel= ruleModel EOF )
            // InternalPanoptesX.g:204:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalPanoptesX.g:210:1: ruleModel returns [EObject current=null] : ( () otherlv_1= 'Model' ( ( (lv_name_2_1= RULE_STRING | lv_name_2_2= RULE_SAFESTRING ) ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'uses' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'outputs' ( (lv_output_10_0= rulePrediction ) ) ) ) ) ) )+ {...}?) ) ) otherlv_11= '}' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_1=null;
        Token lv_name_2_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_output_10_0 = null;



        	enterRule();

        try {
            // InternalPanoptesX.g:216:2: ( ( () otherlv_1= 'Model' ( ( (lv_name_2_1= RULE_STRING | lv_name_2_2= RULE_SAFESTRING ) ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'uses' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'outputs' ( (lv_output_10_0= rulePrediction ) ) ) ) ) ) )+ {...}?) ) ) otherlv_11= '}' ) )
            // InternalPanoptesX.g:217:2: ( () otherlv_1= 'Model' ( ( (lv_name_2_1= RULE_STRING | lv_name_2_2= RULE_SAFESTRING ) ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'uses' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'outputs' ( (lv_output_10_0= rulePrediction ) ) ) ) ) ) )+ {...}?) ) ) otherlv_11= '}' )
            {
            // InternalPanoptesX.g:217:2: ( () otherlv_1= 'Model' ( ( (lv_name_2_1= RULE_STRING | lv_name_2_2= RULE_SAFESTRING ) ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'uses' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'outputs' ( (lv_output_10_0= rulePrediction ) ) ) ) ) ) )+ {...}?) ) ) otherlv_11= '}' )
            // InternalPanoptesX.g:218:3: () otherlv_1= 'Model' ( ( (lv_name_2_1= RULE_STRING | lv_name_2_2= RULE_SAFESTRING ) ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'uses' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'outputs' ( (lv_output_10_0= rulePrediction ) ) ) ) ) ) )+ {...}?) ) ) otherlv_11= '}'
            {
            // InternalPanoptesX.g:218:3: ()
            // InternalPanoptesX.g:219:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getModelAccess().getModelAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getModelAccess().getModelKeyword_1());
            		
            // InternalPanoptesX.g:229:3: ( ( (lv_name_2_1= RULE_STRING | lv_name_2_2= RULE_SAFESTRING ) ) )
            // InternalPanoptesX.g:230:4: ( (lv_name_2_1= RULE_STRING | lv_name_2_2= RULE_SAFESTRING ) )
            {
            // InternalPanoptesX.g:230:4: ( (lv_name_2_1= RULE_STRING | lv_name_2_2= RULE_SAFESTRING ) )
            // InternalPanoptesX.g:231:5: (lv_name_2_1= RULE_STRING | lv_name_2_2= RULE_SAFESTRING )
            {
            // InternalPanoptesX.g:231:5: (lv_name_2_1= RULE_STRING | lv_name_2_2= RULE_SAFESTRING )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_SAFESTRING) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalPanoptesX.g:232:6: lv_name_2_1= RULE_STRING
                    {
                    lv_name_2_1=(Token)match(input,RULE_STRING,FOLLOW_5); 

                    						newLeafNode(lv_name_2_1, grammarAccess.getModelAccess().getNameSTRINGTerminalRuleCall_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getModelRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_2_1,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }
                    break;
                case 2 :
                    // InternalPanoptesX.g:247:6: lv_name_2_2= RULE_SAFESTRING
                    {
                    lv_name_2_2=(Token)match(input,RULE_SAFESTRING,FOLLOW_5); 

                    						newLeafNode(lv_name_2_2, grammarAccess.getModelAccess().getNameSAFESTRINGTerminalRuleCall_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getModelRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_2_2,
                    							"org.lowcomote.panoptes.PanoptesX.SAFESTRING");
                    					

                    }
                    break;

            }


            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalPanoptesX.g:268:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'uses' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'outputs' ( (lv_output_10_0= rulePrediction ) ) ) ) ) ) )+ {...}?) ) )
            // InternalPanoptesX.g:269:4: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'uses' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'outputs' ( (lv_output_10_0= rulePrediction ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalPanoptesX.g:269:4: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'uses' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'outputs' ( (lv_output_10_0= rulePrediction ) ) ) ) ) ) )+ {...}?) )
            // InternalPanoptesX.g:270:5: ( ( ({...}? => ( ({...}? => (otherlv_5= 'uses' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'outputs' ( (lv_output_10_0= rulePrediction ) ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getModelAccess().getUnorderedGroup_4());
            				
            // InternalPanoptesX.g:273:5: ( ( ({...}? => ( ({...}? => (otherlv_5= 'uses' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'outputs' ( (lv_output_10_0= rulePrediction ) ) ) ) ) ) )+ {...}?)
            // InternalPanoptesX.g:274:6: ( ({...}? => ( ({...}? => (otherlv_5= 'uses' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'outputs' ( (lv_output_10_0= rulePrediction ) ) ) ) ) ) )+ {...}?
            {
            // InternalPanoptesX.g:274:6: ( ({...}? => ( ({...}? => (otherlv_5= 'uses' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'outputs' ( (lv_output_10_0= rulePrediction ) ) ) ) ) ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=3;
                int LA4_0 = input.LA(1);

                if ( LA4_0 == 15 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_4(), 0) ) {
                    alt4=1;
                }
                else if ( LA4_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_4(), 1) ) {
                    alt4=2;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalPanoptesX.g:275:4: ({...}? => ( ({...}? => (otherlv_5= 'uses' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* ) ) ) )
            	    {
            	    // InternalPanoptesX.g:275:4: ({...}? => ( ({...}? => (otherlv_5= 'uses' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* ) ) ) )
            	    // InternalPanoptesX.g:276:5: {...}? => ( ({...}? => (otherlv_5= 'uses' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_4(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // InternalPanoptesX.g:276:102: ( ({...}? => (otherlv_5= 'uses' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* ) ) )
            	    // InternalPanoptesX.g:277:6: ({...}? => (otherlv_5= 'uses' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup_4(), 0);
            	    					
            	    // InternalPanoptesX.g:280:9: ({...}? => (otherlv_5= 'uses' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* ) )
            	    // InternalPanoptesX.g:280:10: {...}? => (otherlv_5= 'uses' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleModel", "true");
            	    }
            	    // InternalPanoptesX.g:280:19: (otherlv_5= 'uses' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )
            	    // InternalPanoptesX.g:280:20: otherlv_5= 'uses' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )*
            	    {
            	    otherlv_5=(Token)match(input,15,FOLLOW_7); 

            	    									newLeafNode(otherlv_5, grammarAccess.getModelAccess().getUsesKeyword_4_0_0());
            	    								
            	    // InternalPanoptesX.g:284:9: ( ( ruleEString ) )
            	    // InternalPanoptesX.g:285:10: ( ruleEString )
            	    {
            	    // InternalPanoptesX.g:285:10: ( ruleEString )
            	    // InternalPanoptesX.g:286:11: ruleEString
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getModelRule());
            	    											}
            	    										

            	    											newCompositeNode(grammarAccess.getModelAccess().getInputsFeatureCrossReference_4_0_1_0());
            	    										
            	    pushFollow(FOLLOW_8);
            	    ruleEString();

            	    state._fsp--;


            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalPanoptesX.g:300:9: (otherlv_7= ',' ( ( ruleEString ) ) )*
            	    loop3:
            	    do {
            	        int alt3=2;
            	        int LA3_0 = input.LA(1);

            	        if ( (LA3_0==16) ) {
            	            alt3=1;
            	        }


            	        switch (alt3) {
            	    	case 1 :
            	    	    // InternalPanoptesX.g:301:10: otherlv_7= ',' ( ( ruleEString ) )
            	    	    {
            	    	    otherlv_7=(Token)match(input,16,FOLLOW_7); 

            	    	    										newLeafNode(otherlv_7, grammarAccess.getModelAccess().getCommaKeyword_4_0_2_0());
            	    	    									
            	    	    // InternalPanoptesX.g:305:10: ( ( ruleEString ) )
            	    	    // InternalPanoptesX.g:306:11: ( ruleEString )
            	    	    {
            	    	    // InternalPanoptesX.g:306:11: ( ruleEString )
            	    	    // InternalPanoptesX.g:307:12: ruleEString
            	    	    {

            	    	    												if (current==null) {
            	    	    													current = createModelElement(grammarAccess.getModelRule());
            	    	    												}
            	    	    											

            	    	    												newCompositeNode(grammarAccess.getModelAccess().getInputsFeatureCrossReference_4_0_2_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_8);
            	    	    ruleEString();

            	    	    state._fsp--;


            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop3;
            	        }
            	    } while (true);


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalPanoptesX.g:328:4: ({...}? => ( ({...}? => (otherlv_9= 'outputs' ( (lv_output_10_0= rulePrediction ) ) ) ) ) )
            	    {
            	    // InternalPanoptesX.g:328:4: ({...}? => ( ({...}? => (otherlv_9= 'outputs' ( (lv_output_10_0= rulePrediction ) ) ) ) ) )
            	    // InternalPanoptesX.g:329:5: {...}? => ( ({...}? => (otherlv_9= 'outputs' ( (lv_output_10_0= rulePrediction ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_4(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // InternalPanoptesX.g:329:102: ( ({...}? => (otherlv_9= 'outputs' ( (lv_output_10_0= rulePrediction ) ) ) ) )
            	    // InternalPanoptesX.g:330:6: ({...}? => (otherlv_9= 'outputs' ( (lv_output_10_0= rulePrediction ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup_4(), 1);
            	    					
            	    // InternalPanoptesX.g:333:9: ({...}? => (otherlv_9= 'outputs' ( (lv_output_10_0= rulePrediction ) ) ) )
            	    // InternalPanoptesX.g:333:10: {...}? => (otherlv_9= 'outputs' ( (lv_output_10_0= rulePrediction ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleModel", "true");
            	    }
            	    // InternalPanoptesX.g:333:19: (otherlv_9= 'outputs' ( (lv_output_10_0= rulePrediction ) ) )
            	    // InternalPanoptesX.g:333:20: otherlv_9= 'outputs' ( (lv_output_10_0= rulePrediction ) )
            	    {
            	    otherlv_9=(Token)match(input,17,FOLLOW_4); 

            	    									newLeafNode(otherlv_9, grammarAccess.getModelAccess().getOutputsKeyword_4_1_0());
            	    								
            	    // InternalPanoptesX.g:337:9: ( (lv_output_10_0= rulePrediction ) )
            	    // InternalPanoptesX.g:338:10: (lv_output_10_0= rulePrediction )
            	    {
            	    // InternalPanoptesX.g:338:10: (lv_output_10_0= rulePrediction )
            	    // InternalPanoptesX.g:339:11: lv_output_10_0= rulePrediction
            	    {

            	    											newCompositeNode(grammarAccess.getModelAccess().getOutputPredictionParserRuleCall_4_1_1_0());
            	    										
            	    pushFollow(FOLLOW_9);
            	    lv_output_10_0=rulePrediction();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getModelRule());
            	    											}
            	    											set(
            	    												current,
            	    												"output",
            	    												lv_output_10_0,
            	    												"org.lowcomote.panoptes.PanoptesX.Prediction");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getModelAccess().getUnorderedGroup_4()) ) {
                throw new FailedPredicateException(input, "ruleModel", "getUnorderedGroupHelper().canLeave(grammarAccess.getModelAccess().getUnorderedGroup_4())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getModelAccess().getUnorderedGroup_4());
            				

            }

            otherlv_11=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleFeatureStore"
    // InternalPanoptesX.g:378:1: entryRuleFeatureStore returns [EObject current=null] : iv_ruleFeatureStore= ruleFeatureStore EOF ;
    public final EObject entryRuleFeatureStore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureStore = null;


        try {
            // InternalPanoptesX.g:378:53: (iv_ruleFeatureStore= ruleFeatureStore EOF )
            // InternalPanoptesX.g:379:2: iv_ruleFeatureStore= ruleFeatureStore EOF
            {
             newCompositeNode(grammarAccess.getFeatureStoreRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFeatureStore=ruleFeatureStore();

            state._fsp--;

             current =iv_ruleFeatureStore; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFeatureStore"


    // $ANTLR start "ruleFeatureStore"
    // InternalPanoptesX.g:385:1: ruleFeatureStore returns [EObject current=null] : ( () otherlv_1= 'FeatureStore' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'features' ( (lv_features_5_0= ruleFeature ) ) (otherlv_6= ',' ( (lv_features_7_0= ruleFeature ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'entities' ( (lv_entities_9_0= ruleEntity ) ) (otherlv_10= ',' ( (lv_entities_11_0= ruleEntity ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'labels' ( (lv_labels_13_0= ruleLabel ) ) (otherlv_14= ',' ( (lv_labels_15_0= ruleLabel ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'request' otherlv_17= 'data' ( (lv_requestData_18_0= ruleRequestData ) ) (otherlv_19= ',' ( (lv_requestData_20_0= ruleRequestData ) ) )* ) ) ) ) )* ) ) ) otherlv_21= '}' ) ;
    public final EObject ruleFeatureStore() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        EObject lv_features_5_0 = null;

        EObject lv_features_7_0 = null;

        EObject lv_entities_9_0 = null;

        EObject lv_entities_11_0 = null;

        EObject lv_labels_13_0 = null;

        EObject lv_labels_15_0 = null;

        EObject lv_requestData_18_0 = null;

        EObject lv_requestData_20_0 = null;



        	enterRule();

        try {
            // InternalPanoptesX.g:391:2: ( ( () otherlv_1= 'FeatureStore' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'features' ( (lv_features_5_0= ruleFeature ) ) (otherlv_6= ',' ( (lv_features_7_0= ruleFeature ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'entities' ( (lv_entities_9_0= ruleEntity ) ) (otherlv_10= ',' ( (lv_entities_11_0= ruleEntity ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'labels' ( (lv_labels_13_0= ruleLabel ) ) (otherlv_14= ',' ( (lv_labels_15_0= ruleLabel ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'request' otherlv_17= 'data' ( (lv_requestData_18_0= ruleRequestData ) ) (otherlv_19= ',' ( (lv_requestData_20_0= ruleRequestData ) ) )* ) ) ) ) )* ) ) ) otherlv_21= '}' ) )
            // InternalPanoptesX.g:392:2: ( () otherlv_1= 'FeatureStore' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'features' ( (lv_features_5_0= ruleFeature ) ) (otherlv_6= ',' ( (lv_features_7_0= ruleFeature ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'entities' ( (lv_entities_9_0= ruleEntity ) ) (otherlv_10= ',' ( (lv_entities_11_0= ruleEntity ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'labels' ( (lv_labels_13_0= ruleLabel ) ) (otherlv_14= ',' ( (lv_labels_15_0= ruleLabel ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'request' otherlv_17= 'data' ( (lv_requestData_18_0= ruleRequestData ) ) (otherlv_19= ',' ( (lv_requestData_20_0= ruleRequestData ) ) )* ) ) ) ) )* ) ) ) otherlv_21= '}' )
            {
            // InternalPanoptesX.g:392:2: ( () otherlv_1= 'FeatureStore' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'features' ( (lv_features_5_0= ruleFeature ) ) (otherlv_6= ',' ( (lv_features_7_0= ruleFeature ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'entities' ( (lv_entities_9_0= ruleEntity ) ) (otherlv_10= ',' ( (lv_entities_11_0= ruleEntity ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'labels' ( (lv_labels_13_0= ruleLabel ) ) (otherlv_14= ',' ( (lv_labels_15_0= ruleLabel ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'request' otherlv_17= 'data' ( (lv_requestData_18_0= ruleRequestData ) ) (otherlv_19= ',' ( (lv_requestData_20_0= ruleRequestData ) ) )* ) ) ) ) )* ) ) ) otherlv_21= '}' )
            // InternalPanoptesX.g:393:3: () otherlv_1= 'FeatureStore' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'features' ( (lv_features_5_0= ruleFeature ) ) (otherlv_6= ',' ( (lv_features_7_0= ruleFeature ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'entities' ( (lv_entities_9_0= ruleEntity ) ) (otherlv_10= ',' ( (lv_entities_11_0= ruleEntity ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'labels' ( (lv_labels_13_0= ruleLabel ) ) (otherlv_14= ',' ( (lv_labels_15_0= ruleLabel ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'request' otherlv_17= 'data' ( (lv_requestData_18_0= ruleRequestData ) ) (otherlv_19= ',' ( (lv_requestData_20_0= ruleRequestData ) ) )* ) ) ) ) )* ) ) ) otherlv_21= '}'
            {
            // InternalPanoptesX.g:393:3: ()
            // InternalPanoptesX.g:394:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFeatureStoreAccess().getFeatureStoreAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getFeatureStoreAccess().getFeatureStoreKeyword_1());
            		
            otherlv_2=(Token)match(input,14,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getFeatureStoreAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalPanoptesX.g:408:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'features' ( (lv_features_5_0= ruleFeature ) ) (otherlv_6= ',' ( (lv_features_7_0= ruleFeature ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'entities' ( (lv_entities_9_0= ruleEntity ) ) (otherlv_10= ',' ( (lv_entities_11_0= ruleEntity ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'labels' ( (lv_labels_13_0= ruleLabel ) ) (otherlv_14= ',' ( (lv_labels_15_0= ruleLabel ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'request' otherlv_17= 'data' ( (lv_requestData_18_0= ruleRequestData ) ) (otherlv_19= ',' ( (lv_requestData_20_0= ruleRequestData ) ) )* ) ) ) ) )* ) ) )
            // InternalPanoptesX.g:409:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'features' ( (lv_features_5_0= ruleFeature ) ) (otherlv_6= ',' ( (lv_features_7_0= ruleFeature ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'entities' ( (lv_entities_9_0= ruleEntity ) ) (otherlv_10= ',' ( (lv_entities_11_0= ruleEntity ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'labels' ( (lv_labels_13_0= ruleLabel ) ) (otherlv_14= ',' ( (lv_labels_15_0= ruleLabel ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'request' otherlv_17= 'data' ( (lv_requestData_18_0= ruleRequestData ) ) (otherlv_19= ',' ( (lv_requestData_20_0= ruleRequestData ) ) )* ) ) ) ) )* ) )
            {
            // InternalPanoptesX.g:409:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'features' ( (lv_features_5_0= ruleFeature ) ) (otherlv_6= ',' ( (lv_features_7_0= ruleFeature ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'entities' ( (lv_entities_9_0= ruleEntity ) ) (otherlv_10= ',' ( (lv_entities_11_0= ruleEntity ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'labels' ( (lv_labels_13_0= ruleLabel ) ) (otherlv_14= ',' ( (lv_labels_15_0= ruleLabel ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'request' otherlv_17= 'data' ( (lv_requestData_18_0= ruleRequestData ) ) (otherlv_19= ',' ( (lv_requestData_20_0= ruleRequestData ) ) )* ) ) ) ) )* ) )
            // InternalPanoptesX.g:410:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'features' ( (lv_features_5_0= ruleFeature ) ) (otherlv_6= ',' ( (lv_features_7_0= ruleFeature ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'entities' ( (lv_entities_9_0= ruleEntity ) ) (otherlv_10= ',' ( (lv_entities_11_0= ruleEntity ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'labels' ( (lv_labels_13_0= ruleLabel ) ) (otherlv_14= ',' ( (lv_labels_15_0= ruleLabel ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'request' otherlv_17= 'data' ( (lv_requestData_18_0= ruleRequestData ) ) (otherlv_19= ',' ( (lv_requestData_20_0= ruleRequestData ) ) )* ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getFeatureStoreAccess().getUnorderedGroup_3());
            				
            // InternalPanoptesX.g:413:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'features' ( (lv_features_5_0= ruleFeature ) ) (otherlv_6= ',' ( (lv_features_7_0= ruleFeature ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'entities' ( (lv_entities_9_0= ruleEntity ) ) (otherlv_10= ',' ( (lv_entities_11_0= ruleEntity ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'labels' ( (lv_labels_13_0= ruleLabel ) ) (otherlv_14= ',' ( (lv_labels_15_0= ruleLabel ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'request' otherlv_17= 'data' ( (lv_requestData_18_0= ruleRequestData ) ) (otherlv_19= ',' ( (lv_requestData_20_0= ruleRequestData ) ) )* ) ) ) ) )* )
            // InternalPanoptesX.g:414:6: ( ({...}? => ( ({...}? => (otherlv_4= 'features' ( (lv_features_5_0= ruleFeature ) ) (otherlv_6= ',' ( (lv_features_7_0= ruleFeature ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'entities' ( (lv_entities_9_0= ruleEntity ) ) (otherlv_10= ',' ( (lv_entities_11_0= ruleEntity ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'labels' ( (lv_labels_13_0= ruleLabel ) ) (otherlv_14= ',' ( (lv_labels_15_0= ruleLabel ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'request' otherlv_17= 'data' ( (lv_requestData_18_0= ruleRequestData ) ) (otherlv_19= ',' ( (lv_requestData_20_0= ruleRequestData ) ) )* ) ) ) ) )*
            {
            // InternalPanoptesX.g:414:6: ( ({...}? => ( ({...}? => (otherlv_4= 'features' ( (lv_features_5_0= ruleFeature ) ) (otherlv_6= ',' ( (lv_features_7_0= ruleFeature ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'entities' ( (lv_entities_9_0= ruleEntity ) ) (otherlv_10= ',' ( (lv_entities_11_0= ruleEntity ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'labels' ( (lv_labels_13_0= ruleLabel ) ) (otherlv_14= ',' ( (lv_labels_15_0= ruleLabel ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'request' otherlv_17= 'data' ( (lv_requestData_18_0= ruleRequestData ) ) (otherlv_19= ',' ( (lv_requestData_20_0= ruleRequestData ) ) )* ) ) ) ) )*
            loop9:
            do {
                int alt9=5;
                int LA9_0 = input.LA(1);

                if ( LA9_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureStoreAccess().getUnorderedGroup_3(), 0) ) {
                    alt9=1;
                }
                else if ( LA9_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureStoreAccess().getUnorderedGroup_3(), 1) ) {
                    alt9=2;
                }
                else if ( LA9_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureStoreAccess().getUnorderedGroup_3(), 2) ) {
                    alt9=3;
                }
                else if ( LA9_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureStoreAccess().getUnorderedGroup_3(), 3) ) {
                    alt9=4;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalPanoptesX.g:415:4: ({...}? => ( ({...}? => (otherlv_4= 'features' ( (lv_features_5_0= ruleFeature ) ) (otherlv_6= ',' ( (lv_features_7_0= ruleFeature ) ) )* ) ) ) )
            	    {
            	    // InternalPanoptesX.g:415:4: ({...}? => ( ({...}? => (otherlv_4= 'features' ( (lv_features_5_0= ruleFeature ) ) (otherlv_6= ',' ( (lv_features_7_0= ruleFeature ) ) )* ) ) ) )
            	    // InternalPanoptesX.g:416:5: {...}? => ( ({...}? => (otherlv_4= 'features' ( (lv_features_5_0= ruleFeature ) ) (otherlv_6= ',' ( (lv_features_7_0= ruleFeature ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureStoreAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleFeatureStore", "getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureStoreAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalPanoptesX.g:416:109: ( ({...}? => (otherlv_4= 'features' ( (lv_features_5_0= ruleFeature ) ) (otherlv_6= ',' ( (lv_features_7_0= ruleFeature ) ) )* ) ) )
            	    // InternalPanoptesX.g:417:6: ({...}? => (otherlv_4= 'features' ( (lv_features_5_0= ruleFeature ) ) (otherlv_6= ',' ( (lv_features_7_0= ruleFeature ) ) )* ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFeatureStoreAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalPanoptesX.g:420:9: ({...}? => (otherlv_4= 'features' ( (lv_features_5_0= ruleFeature ) ) (otherlv_6= ',' ( (lv_features_7_0= ruleFeature ) ) )* ) )
            	    // InternalPanoptesX.g:420:10: {...}? => (otherlv_4= 'features' ( (lv_features_5_0= ruleFeature ) ) (otherlv_6= ',' ( (lv_features_7_0= ruleFeature ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFeatureStore", "true");
            	    }
            	    // InternalPanoptesX.g:420:19: (otherlv_4= 'features' ( (lv_features_5_0= ruleFeature ) ) (otherlv_6= ',' ( (lv_features_7_0= ruleFeature ) ) )* )
            	    // InternalPanoptesX.g:420:20: otherlv_4= 'features' ( (lv_features_5_0= ruleFeature ) ) (otherlv_6= ',' ( (lv_features_7_0= ruleFeature ) ) )*
            	    {
            	    otherlv_4=(Token)match(input,20,FOLLOW_4); 

            	    									newLeafNode(otherlv_4, grammarAccess.getFeatureStoreAccess().getFeaturesKeyword_3_0_0());
            	    								
            	    // InternalPanoptesX.g:424:9: ( (lv_features_5_0= ruleFeature ) )
            	    // InternalPanoptesX.g:425:10: (lv_features_5_0= ruleFeature )
            	    {
            	    // InternalPanoptesX.g:425:10: (lv_features_5_0= ruleFeature )
            	    // InternalPanoptesX.g:426:11: lv_features_5_0= ruleFeature
            	    {

            	    											newCompositeNode(grammarAccess.getFeatureStoreAccess().getFeaturesFeatureParserRuleCall_3_0_1_0());
            	    										
            	    pushFollow(FOLLOW_11);
            	    lv_features_5_0=ruleFeature();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getFeatureStoreRule());
            	    											}
            	    											add(
            	    												current,
            	    												"features",
            	    												lv_features_5_0,
            	    												"org.lowcomote.panoptes.PanoptesX.Feature");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalPanoptesX.g:443:9: (otherlv_6= ',' ( (lv_features_7_0= ruleFeature ) ) )*
            	    loop5:
            	    do {
            	        int alt5=2;
            	        int LA5_0 = input.LA(1);

            	        if ( (LA5_0==16) ) {
            	            alt5=1;
            	        }


            	        switch (alt5) {
            	    	case 1 :
            	    	    // InternalPanoptesX.g:444:10: otherlv_6= ',' ( (lv_features_7_0= ruleFeature ) )
            	    	    {
            	    	    otherlv_6=(Token)match(input,16,FOLLOW_4); 

            	    	    										newLeafNode(otherlv_6, grammarAccess.getFeatureStoreAccess().getCommaKeyword_3_0_2_0());
            	    	    									
            	    	    // InternalPanoptesX.g:448:10: ( (lv_features_7_0= ruleFeature ) )
            	    	    // InternalPanoptesX.g:449:11: (lv_features_7_0= ruleFeature )
            	    	    {
            	    	    // InternalPanoptesX.g:449:11: (lv_features_7_0= ruleFeature )
            	    	    // InternalPanoptesX.g:450:12: lv_features_7_0= ruleFeature
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getFeatureStoreAccess().getFeaturesFeatureParserRuleCall_3_0_2_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_11);
            	    	    lv_features_7_0=ruleFeature();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getFeatureStoreRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"features",
            	    	    													lv_features_7_0,
            	    	    													"org.lowcomote.panoptes.PanoptesX.Feature");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop5;
            	        }
            	    } while (true);


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFeatureStoreAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalPanoptesX.g:474:4: ({...}? => ( ({...}? => (otherlv_8= 'entities' ( (lv_entities_9_0= ruleEntity ) ) (otherlv_10= ',' ( (lv_entities_11_0= ruleEntity ) ) )* ) ) ) )
            	    {
            	    // InternalPanoptesX.g:474:4: ({...}? => ( ({...}? => (otherlv_8= 'entities' ( (lv_entities_9_0= ruleEntity ) ) (otherlv_10= ',' ( (lv_entities_11_0= ruleEntity ) ) )* ) ) ) )
            	    // InternalPanoptesX.g:475:5: {...}? => ( ({...}? => (otherlv_8= 'entities' ( (lv_entities_9_0= ruleEntity ) ) (otherlv_10= ',' ( (lv_entities_11_0= ruleEntity ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureStoreAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleFeatureStore", "getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureStoreAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalPanoptesX.g:475:109: ( ({...}? => (otherlv_8= 'entities' ( (lv_entities_9_0= ruleEntity ) ) (otherlv_10= ',' ( (lv_entities_11_0= ruleEntity ) ) )* ) ) )
            	    // InternalPanoptesX.g:476:6: ({...}? => (otherlv_8= 'entities' ( (lv_entities_9_0= ruleEntity ) ) (otherlv_10= ',' ( (lv_entities_11_0= ruleEntity ) ) )* ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFeatureStoreAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalPanoptesX.g:479:9: ({...}? => (otherlv_8= 'entities' ( (lv_entities_9_0= ruleEntity ) ) (otherlv_10= ',' ( (lv_entities_11_0= ruleEntity ) ) )* ) )
            	    // InternalPanoptesX.g:479:10: {...}? => (otherlv_8= 'entities' ( (lv_entities_9_0= ruleEntity ) ) (otherlv_10= ',' ( (lv_entities_11_0= ruleEntity ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFeatureStore", "true");
            	    }
            	    // InternalPanoptesX.g:479:19: (otherlv_8= 'entities' ( (lv_entities_9_0= ruleEntity ) ) (otherlv_10= ',' ( (lv_entities_11_0= ruleEntity ) ) )* )
            	    // InternalPanoptesX.g:479:20: otherlv_8= 'entities' ( (lv_entities_9_0= ruleEntity ) ) (otherlv_10= ',' ( (lv_entities_11_0= ruleEntity ) ) )*
            	    {
            	    otherlv_8=(Token)match(input,21,FOLLOW_4); 

            	    									newLeafNode(otherlv_8, grammarAccess.getFeatureStoreAccess().getEntitiesKeyword_3_1_0());
            	    								
            	    // InternalPanoptesX.g:483:9: ( (lv_entities_9_0= ruleEntity ) )
            	    // InternalPanoptesX.g:484:10: (lv_entities_9_0= ruleEntity )
            	    {
            	    // InternalPanoptesX.g:484:10: (lv_entities_9_0= ruleEntity )
            	    // InternalPanoptesX.g:485:11: lv_entities_9_0= ruleEntity
            	    {

            	    											newCompositeNode(grammarAccess.getFeatureStoreAccess().getEntitiesEntityParserRuleCall_3_1_1_0());
            	    										
            	    pushFollow(FOLLOW_11);
            	    lv_entities_9_0=ruleEntity();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getFeatureStoreRule());
            	    											}
            	    											add(
            	    												current,
            	    												"entities",
            	    												lv_entities_9_0,
            	    												"org.lowcomote.panoptes.PanoptesX.Entity");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalPanoptesX.g:502:9: (otherlv_10= ',' ( (lv_entities_11_0= ruleEntity ) ) )*
            	    loop6:
            	    do {
            	        int alt6=2;
            	        int LA6_0 = input.LA(1);

            	        if ( (LA6_0==16) ) {
            	            alt6=1;
            	        }


            	        switch (alt6) {
            	    	case 1 :
            	    	    // InternalPanoptesX.g:503:10: otherlv_10= ',' ( (lv_entities_11_0= ruleEntity ) )
            	    	    {
            	    	    otherlv_10=(Token)match(input,16,FOLLOW_4); 

            	    	    										newLeafNode(otherlv_10, grammarAccess.getFeatureStoreAccess().getCommaKeyword_3_1_2_0());
            	    	    									
            	    	    // InternalPanoptesX.g:507:10: ( (lv_entities_11_0= ruleEntity ) )
            	    	    // InternalPanoptesX.g:508:11: (lv_entities_11_0= ruleEntity )
            	    	    {
            	    	    // InternalPanoptesX.g:508:11: (lv_entities_11_0= ruleEntity )
            	    	    // InternalPanoptesX.g:509:12: lv_entities_11_0= ruleEntity
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getFeatureStoreAccess().getEntitiesEntityParserRuleCall_3_1_2_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_11);
            	    	    lv_entities_11_0=ruleEntity();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getFeatureStoreRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"entities",
            	    	    													lv_entities_11_0,
            	    	    													"org.lowcomote.panoptes.PanoptesX.Entity");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop6;
            	        }
            	    } while (true);


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFeatureStoreAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalPanoptesX.g:533:4: ({...}? => ( ({...}? => (otherlv_12= 'labels' ( (lv_labels_13_0= ruleLabel ) ) (otherlv_14= ',' ( (lv_labels_15_0= ruleLabel ) ) )* ) ) ) )
            	    {
            	    // InternalPanoptesX.g:533:4: ({...}? => ( ({...}? => (otherlv_12= 'labels' ( (lv_labels_13_0= ruleLabel ) ) (otherlv_14= ',' ( (lv_labels_15_0= ruleLabel ) ) )* ) ) ) )
            	    // InternalPanoptesX.g:534:5: {...}? => ( ({...}? => (otherlv_12= 'labels' ( (lv_labels_13_0= ruleLabel ) ) (otherlv_14= ',' ( (lv_labels_15_0= ruleLabel ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureStoreAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleFeatureStore", "getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureStoreAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalPanoptesX.g:534:109: ( ({...}? => (otherlv_12= 'labels' ( (lv_labels_13_0= ruleLabel ) ) (otherlv_14= ',' ( (lv_labels_15_0= ruleLabel ) ) )* ) ) )
            	    // InternalPanoptesX.g:535:6: ({...}? => (otherlv_12= 'labels' ( (lv_labels_13_0= ruleLabel ) ) (otherlv_14= ',' ( (lv_labels_15_0= ruleLabel ) ) )* ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFeatureStoreAccess().getUnorderedGroup_3(), 2);
            	    					
            	    // InternalPanoptesX.g:538:9: ({...}? => (otherlv_12= 'labels' ( (lv_labels_13_0= ruleLabel ) ) (otherlv_14= ',' ( (lv_labels_15_0= ruleLabel ) ) )* ) )
            	    // InternalPanoptesX.g:538:10: {...}? => (otherlv_12= 'labels' ( (lv_labels_13_0= ruleLabel ) ) (otherlv_14= ',' ( (lv_labels_15_0= ruleLabel ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFeatureStore", "true");
            	    }
            	    // InternalPanoptesX.g:538:19: (otherlv_12= 'labels' ( (lv_labels_13_0= ruleLabel ) ) (otherlv_14= ',' ( (lv_labels_15_0= ruleLabel ) ) )* )
            	    // InternalPanoptesX.g:538:20: otherlv_12= 'labels' ( (lv_labels_13_0= ruleLabel ) ) (otherlv_14= ',' ( (lv_labels_15_0= ruleLabel ) ) )*
            	    {
            	    otherlv_12=(Token)match(input,22,FOLLOW_4); 

            	    									newLeafNode(otherlv_12, grammarAccess.getFeatureStoreAccess().getLabelsKeyword_3_2_0());
            	    								
            	    // InternalPanoptesX.g:542:9: ( (lv_labels_13_0= ruleLabel ) )
            	    // InternalPanoptesX.g:543:10: (lv_labels_13_0= ruleLabel )
            	    {
            	    // InternalPanoptesX.g:543:10: (lv_labels_13_0= ruleLabel )
            	    // InternalPanoptesX.g:544:11: lv_labels_13_0= ruleLabel
            	    {

            	    											newCompositeNode(grammarAccess.getFeatureStoreAccess().getLabelsLabelParserRuleCall_3_2_1_0());
            	    										
            	    pushFollow(FOLLOW_11);
            	    lv_labels_13_0=ruleLabel();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getFeatureStoreRule());
            	    											}
            	    											add(
            	    												current,
            	    												"labels",
            	    												lv_labels_13_0,
            	    												"org.lowcomote.panoptes.PanoptesX.Label");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalPanoptesX.g:561:9: (otherlv_14= ',' ( (lv_labels_15_0= ruleLabel ) ) )*
            	    loop7:
            	    do {
            	        int alt7=2;
            	        int LA7_0 = input.LA(1);

            	        if ( (LA7_0==16) ) {
            	            alt7=1;
            	        }


            	        switch (alt7) {
            	    	case 1 :
            	    	    // InternalPanoptesX.g:562:10: otherlv_14= ',' ( (lv_labels_15_0= ruleLabel ) )
            	    	    {
            	    	    otherlv_14=(Token)match(input,16,FOLLOW_4); 

            	    	    										newLeafNode(otherlv_14, grammarAccess.getFeatureStoreAccess().getCommaKeyword_3_2_2_0());
            	    	    									
            	    	    // InternalPanoptesX.g:566:10: ( (lv_labels_15_0= ruleLabel ) )
            	    	    // InternalPanoptesX.g:567:11: (lv_labels_15_0= ruleLabel )
            	    	    {
            	    	    // InternalPanoptesX.g:567:11: (lv_labels_15_0= ruleLabel )
            	    	    // InternalPanoptesX.g:568:12: lv_labels_15_0= ruleLabel
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getFeatureStoreAccess().getLabelsLabelParserRuleCall_3_2_2_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_11);
            	    	    lv_labels_15_0=ruleLabel();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getFeatureStoreRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"labels",
            	    	    													lv_labels_15_0,
            	    	    													"org.lowcomote.panoptes.PanoptesX.Label");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop7;
            	        }
            	    } while (true);


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFeatureStoreAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalPanoptesX.g:592:4: ({...}? => ( ({...}? => (otherlv_16= 'request' otherlv_17= 'data' ( (lv_requestData_18_0= ruleRequestData ) ) (otherlv_19= ',' ( (lv_requestData_20_0= ruleRequestData ) ) )* ) ) ) )
            	    {
            	    // InternalPanoptesX.g:592:4: ({...}? => ( ({...}? => (otherlv_16= 'request' otherlv_17= 'data' ( (lv_requestData_18_0= ruleRequestData ) ) (otherlv_19= ',' ( (lv_requestData_20_0= ruleRequestData ) ) )* ) ) ) )
            	    // InternalPanoptesX.g:593:5: {...}? => ( ({...}? => (otherlv_16= 'request' otherlv_17= 'data' ( (lv_requestData_18_0= ruleRequestData ) ) (otherlv_19= ',' ( (lv_requestData_20_0= ruleRequestData ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureStoreAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleFeatureStore", "getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureStoreAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // InternalPanoptesX.g:593:109: ( ({...}? => (otherlv_16= 'request' otherlv_17= 'data' ( (lv_requestData_18_0= ruleRequestData ) ) (otherlv_19= ',' ( (lv_requestData_20_0= ruleRequestData ) ) )* ) ) )
            	    // InternalPanoptesX.g:594:6: ({...}? => (otherlv_16= 'request' otherlv_17= 'data' ( (lv_requestData_18_0= ruleRequestData ) ) (otherlv_19= ',' ( (lv_requestData_20_0= ruleRequestData ) ) )* ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFeatureStoreAccess().getUnorderedGroup_3(), 3);
            	    					
            	    // InternalPanoptesX.g:597:9: ({...}? => (otherlv_16= 'request' otherlv_17= 'data' ( (lv_requestData_18_0= ruleRequestData ) ) (otherlv_19= ',' ( (lv_requestData_20_0= ruleRequestData ) ) )* ) )
            	    // InternalPanoptesX.g:597:10: {...}? => (otherlv_16= 'request' otherlv_17= 'data' ( (lv_requestData_18_0= ruleRequestData ) ) (otherlv_19= ',' ( (lv_requestData_20_0= ruleRequestData ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFeatureStore", "true");
            	    }
            	    // InternalPanoptesX.g:597:19: (otherlv_16= 'request' otherlv_17= 'data' ( (lv_requestData_18_0= ruleRequestData ) ) (otherlv_19= ',' ( (lv_requestData_20_0= ruleRequestData ) ) )* )
            	    // InternalPanoptesX.g:597:20: otherlv_16= 'request' otherlv_17= 'data' ( (lv_requestData_18_0= ruleRequestData ) ) (otherlv_19= ',' ( (lv_requestData_20_0= ruleRequestData ) ) )*
            	    {
            	    otherlv_16=(Token)match(input,23,FOLLOW_12); 

            	    									newLeafNode(otherlv_16, grammarAccess.getFeatureStoreAccess().getRequestKeyword_3_3_0());
            	    								
            	    otherlv_17=(Token)match(input,24,FOLLOW_4); 

            	    									newLeafNode(otherlv_17, grammarAccess.getFeatureStoreAccess().getDataKeyword_3_3_1());
            	    								
            	    // InternalPanoptesX.g:605:9: ( (lv_requestData_18_0= ruleRequestData ) )
            	    // InternalPanoptesX.g:606:10: (lv_requestData_18_0= ruleRequestData )
            	    {
            	    // InternalPanoptesX.g:606:10: (lv_requestData_18_0= ruleRequestData )
            	    // InternalPanoptesX.g:607:11: lv_requestData_18_0= ruleRequestData
            	    {

            	    											newCompositeNode(grammarAccess.getFeatureStoreAccess().getRequestDataRequestDataParserRuleCall_3_3_2_0());
            	    										
            	    pushFollow(FOLLOW_11);
            	    lv_requestData_18_0=ruleRequestData();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getFeatureStoreRule());
            	    											}
            	    											add(
            	    												current,
            	    												"requestData",
            	    												lv_requestData_18_0,
            	    												"org.lowcomote.panoptes.PanoptesX.RequestData");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalPanoptesX.g:624:9: (otherlv_19= ',' ( (lv_requestData_20_0= ruleRequestData ) ) )*
            	    loop8:
            	    do {
            	        int alt8=2;
            	        int LA8_0 = input.LA(1);

            	        if ( (LA8_0==16) ) {
            	            alt8=1;
            	        }


            	        switch (alt8) {
            	    	case 1 :
            	    	    // InternalPanoptesX.g:625:10: otherlv_19= ',' ( (lv_requestData_20_0= ruleRequestData ) )
            	    	    {
            	    	    otherlv_19=(Token)match(input,16,FOLLOW_4); 

            	    	    										newLeafNode(otherlv_19, grammarAccess.getFeatureStoreAccess().getCommaKeyword_3_3_3_0());
            	    	    									
            	    	    // InternalPanoptesX.g:629:10: ( (lv_requestData_20_0= ruleRequestData ) )
            	    	    // InternalPanoptesX.g:630:11: (lv_requestData_20_0= ruleRequestData )
            	    	    {
            	    	    // InternalPanoptesX.g:630:11: (lv_requestData_20_0= ruleRequestData )
            	    	    // InternalPanoptesX.g:631:12: lv_requestData_20_0= ruleRequestData
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getFeatureStoreAccess().getRequestDataRequestDataParserRuleCall_3_3_3_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_11);
            	    	    lv_requestData_20_0=ruleRequestData();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getFeatureStoreRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"requestData",
            	    	    													lv_requestData_20_0,
            	    	    													"org.lowcomote.panoptes.PanoptesX.RequestData");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop8;
            	        }
            	    } while (true);


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFeatureStoreAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getFeatureStoreAccess().getUnorderedGroup_3());
            				

            }

            otherlv_21=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_21, grammarAccess.getFeatureStoreAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleFeatureStore"


    // $ANTLR start "entryRuleEntity"
    // InternalPanoptesX.g:670:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalPanoptesX.g:670:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalPanoptesX.g:671:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalPanoptesX.g:677:1: ruleEntity returns [EObject current=null] : ( ( ( (lv_name_0_1= RULE_STRING | lv_name_0_2= RULE_SAFESTRING ) ) ) otherlv_1= '{' otherlv_2= 'keys' ( (lv_keys_3_0= ruleKey ) ) (otherlv_4= ',' ( (lv_keys_5_0= ruleKey ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_keys_3_0 = null;

        EObject lv_keys_5_0 = null;



        	enterRule();

        try {
            // InternalPanoptesX.g:683:2: ( ( ( ( (lv_name_0_1= RULE_STRING | lv_name_0_2= RULE_SAFESTRING ) ) ) otherlv_1= '{' otherlv_2= 'keys' ( (lv_keys_3_0= ruleKey ) ) (otherlv_4= ',' ( (lv_keys_5_0= ruleKey ) ) )* otherlv_6= '}' ) )
            // InternalPanoptesX.g:684:2: ( ( ( (lv_name_0_1= RULE_STRING | lv_name_0_2= RULE_SAFESTRING ) ) ) otherlv_1= '{' otherlv_2= 'keys' ( (lv_keys_3_0= ruleKey ) ) (otherlv_4= ',' ( (lv_keys_5_0= ruleKey ) ) )* otherlv_6= '}' )
            {
            // InternalPanoptesX.g:684:2: ( ( ( (lv_name_0_1= RULE_STRING | lv_name_0_2= RULE_SAFESTRING ) ) ) otherlv_1= '{' otherlv_2= 'keys' ( (lv_keys_3_0= ruleKey ) ) (otherlv_4= ',' ( (lv_keys_5_0= ruleKey ) ) )* otherlv_6= '}' )
            // InternalPanoptesX.g:685:3: ( ( (lv_name_0_1= RULE_STRING | lv_name_0_2= RULE_SAFESTRING ) ) ) otherlv_1= '{' otherlv_2= 'keys' ( (lv_keys_3_0= ruleKey ) ) (otherlv_4= ',' ( (lv_keys_5_0= ruleKey ) ) )* otherlv_6= '}'
            {
            // InternalPanoptesX.g:685:3: ( ( (lv_name_0_1= RULE_STRING | lv_name_0_2= RULE_SAFESTRING ) ) )
            // InternalPanoptesX.g:686:4: ( (lv_name_0_1= RULE_STRING | lv_name_0_2= RULE_SAFESTRING ) )
            {
            // InternalPanoptesX.g:686:4: ( (lv_name_0_1= RULE_STRING | lv_name_0_2= RULE_SAFESTRING ) )
            // InternalPanoptesX.g:687:5: (lv_name_0_1= RULE_STRING | lv_name_0_2= RULE_SAFESTRING )
            {
            // InternalPanoptesX.g:687:5: (lv_name_0_1= RULE_STRING | lv_name_0_2= RULE_SAFESTRING )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_SAFESTRING) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalPanoptesX.g:688:6: lv_name_0_1= RULE_STRING
                    {
                    lv_name_0_1=(Token)match(input,RULE_STRING,FOLLOW_5); 

                    						newLeafNode(lv_name_0_1, grammarAccess.getEntityAccess().getNameSTRINGTerminalRuleCall_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEntityRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_0_1,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }
                    break;
                case 2 :
                    // InternalPanoptesX.g:703:6: lv_name_0_2= RULE_SAFESTRING
                    {
                    lv_name_0_2=(Token)match(input,RULE_SAFESTRING,FOLLOW_5); 

                    						newLeafNode(lv_name_0_2, grammarAccess.getEntityAccess().getNameSAFESTRINGTerminalRuleCall_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEntityRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_0_2,
                    							"org.lowcomote.panoptes.PanoptesX.SAFESTRING");
                    					

                    }
                    break;

            }


            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getKeysKeyword_2());
            		
            // InternalPanoptesX.g:728:3: ( (lv_keys_3_0= ruleKey ) )
            // InternalPanoptesX.g:729:4: (lv_keys_3_0= ruleKey )
            {
            // InternalPanoptesX.g:729:4: (lv_keys_3_0= ruleKey )
            // InternalPanoptesX.g:730:5: lv_keys_3_0= ruleKey
            {

            					newCompositeNode(grammarAccess.getEntityAccess().getKeysKeyParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_14);
            lv_keys_3_0=ruleKey();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntityRule());
            					}
            					add(
            						current,
            						"keys",
            						lv_keys_3_0,
            						"org.lowcomote.panoptes.PanoptesX.Key");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPanoptesX.g:747:3: (otherlv_4= ',' ( (lv_keys_5_0= ruleKey ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==16) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalPanoptesX.g:748:4: otherlv_4= ',' ( (lv_keys_5_0= ruleKey ) )
            	    {
            	    otherlv_4=(Token)match(input,16,FOLLOW_4); 

            	    				newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalPanoptesX.g:752:4: ( (lv_keys_5_0= ruleKey ) )
            	    // InternalPanoptesX.g:753:5: (lv_keys_5_0= ruleKey )
            	    {
            	    // InternalPanoptesX.g:753:5: (lv_keys_5_0= ruleKey )
            	    // InternalPanoptesX.g:754:6: lv_keys_5_0= ruleKey
            	    {

            	    						newCompositeNode(grammarAccess.getEntityAccess().getKeysKeyParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_keys_5_0=ruleKey();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEntityRule());
            	    						}
            	    						add(
            	    							current,
            	    							"keys",
            	    							lv_keys_5_0,
            	    							"org.lowcomote.panoptes.PanoptesX.Key");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_6=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleFeature"
    // InternalPanoptesX.g:780:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // InternalPanoptesX.g:780:48: (iv_ruleFeature= ruleFeature EOF )
            // InternalPanoptesX.g:781:2: iv_ruleFeature= ruleFeature EOF
            {
             newCompositeNode(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFeature=ruleFeature();

            state._fsp--;

             current =iv_ruleFeature; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // InternalPanoptesX.g:787:1: ruleFeature returns [EObject current=null] : ( ( ( (lv_name_0_1= RULE_STRING | lv_name_0_2= RULE_SAFESTRING ) ) ) (otherlv_1= ':' ( (lv_type_2_0= rulestatisticalVariableType ) ) )? (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'requires' otherlv_6= 'entities' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'requires' otherlv_11= 'request' otherlv_12= 'data' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* ) ) ) ) )* ) ) ) otherlv_16= '}' )? ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Enumerator lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalPanoptesX.g:793:2: ( ( ( ( (lv_name_0_1= RULE_STRING | lv_name_0_2= RULE_SAFESTRING ) ) ) (otherlv_1= ':' ( (lv_type_2_0= rulestatisticalVariableType ) ) )? (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'requires' otherlv_6= 'entities' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'requires' otherlv_11= 'request' otherlv_12= 'data' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* ) ) ) ) )* ) ) ) otherlv_16= '}' )? ) )
            // InternalPanoptesX.g:794:2: ( ( ( (lv_name_0_1= RULE_STRING | lv_name_0_2= RULE_SAFESTRING ) ) ) (otherlv_1= ':' ( (lv_type_2_0= rulestatisticalVariableType ) ) )? (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'requires' otherlv_6= 'entities' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'requires' otherlv_11= 'request' otherlv_12= 'data' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* ) ) ) ) )* ) ) ) otherlv_16= '}' )? )
            {
            // InternalPanoptesX.g:794:2: ( ( ( (lv_name_0_1= RULE_STRING | lv_name_0_2= RULE_SAFESTRING ) ) ) (otherlv_1= ':' ( (lv_type_2_0= rulestatisticalVariableType ) ) )? (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'requires' otherlv_6= 'entities' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'requires' otherlv_11= 'request' otherlv_12= 'data' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* ) ) ) ) )* ) ) ) otherlv_16= '}' )? )
            // InternalPanoptesX.g:795:3: ( ( (lv_name_0_1= RULE_STRING | lv_name_0_2= RULE_SAFESTRING ) ) ) (otherlv_1= ':' ( (lv_type_2_0= rulestatisticalVariableType ) ) )? (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'requires' otherlv_6= 'entities' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'requires' otherlv_11= 'request' otherlv_12= 'data' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* ) ) ) ) )* ) ) ) otherlv_16= '}' )?
            {
            // InternalPanoptesX.g:795:3: ( ( (lv_name_0_1= RULE_STRING | lv_name_0_2= RULE_SAFESTRING ) ) )
            // InternalPanoptesX.g:796:4: ( (lv_name_0_1= RULE_STRING | lv_name_0_2= RULE_SAFESTRING ) )
            {
            // InternalPanoptesX.g:796:4: ( (lv_name_0_1= RULE_STRING | lv_name_0_2= RULE_SAFESTRING ) )
            // InternalPanoptesX.g:797:5: (lv_name_0_1= RULE_STRING | lv_name_0_2= RULE_SAFESTRING )
            {
            // InternalPanoptesX.g:797:5: (lv_name_0_1= RULE_STRING | lv_name_0_2= RULE_SAFESTRING )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_SAFESTRING) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalPanoptesX.g:798:6: lv_name_0_1= RULE_STRING
                    {
                    lv_name_0_1=(Token)match(input,RULE_STRING,FOLLOW_15); 

                    						newLeafNode(lv_name_0_1, grammarAccess.getFeatureAccess().getNameSTRINGTerminalRuleCall_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFeatureRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_0_1,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }
                    break;
                case 2 :
                    // InternalPanoptesX.g:813:6: lv_name_0_2= RULE_SAFESTRING
                    {
                    lv_name_0_2=(Token)match(input,RULE_SAFESTRING,FOLLOW_15); 

                    						newLeafNode(lv_name_0_2, grammarAccess.getFeatureAccess().getNameSAFESTRINGTerminalRuleCall_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFeatureRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_0_2,
                    							"org.lowcomote.panoptes.PanoptesX.SAFESTRING");
                    					

                    }
                    break;

            }


            }


            }

            // InternalPanoptesX.g:830:3: (otherlv_1= ':' ( (lv_type_2_0= rulestatisticalVariableType ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==26) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalPanoptesX.g:831:4: otherlv_1= ':' ( (lv_type_2_0= rulestatisticalVariableType ) )
                    {
                    otherlv_1=(Token)match(input,26,FOLLOW_16); 

                    				newLeafNode(otherlv_1, grammarAccess.getFeatureAccess().getColonKeyword_1_0());
                    			
                    // InternalPanoptesX.g:835:4: ( (lv_type_2_0= rulestatisticalVariableType ) )
                    // InternalPanoptesX.g:836:5: (lv_type_2_0= rulestatisticalVariableType )
                    {
                    // InternalPanoptesX.g:836:5: (lv_type_2_0= rulestatisticalVariableType )
                    // InternalPanoptesX.g:837:6: lv_type_2_0= rulestatisticalVariableType
                    {

                    						newCompositeNode(grammarAccess.getFeatureAccess().getTypeStatisticalVariableTypeEnumRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_type_2_0=rulestatisticalVariableType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFeatureRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_2_0,
                    							"org.lowcomote.panoptes.PanoptesX.statisticalVariableType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPanoptesX.g:855:3: (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'requires' otherlv_6= 'entities' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'requires' otherlv_11= 'request' otherlv_12= 'data' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* ) ) ) ) )* ) ) ) otherlv_16= '}' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==14) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalPanoptesX.g:856:4: otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'requires' otherlv_6= 'entities' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'requires' otherlv_11= 'request' otherlv_12= 'data' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* ) ) ) ) )* ) ) ) otherlv_16= '}'
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_18); 

                    				newLeafNode(otherlv_3, grammarAccess.getFeatureAccess().getLeftCurlyBracketKeyword_2_0());
                    			
                    // InternalPanoptesX.g:860:4: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'requires' otherlv_6= 'entities' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'requires' otherlv_11= 'request' otherlv_12= 'data' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* ) ) ) ) )* ) ) )
                    // InternalPanoptesX.g:861:5: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'requires' otherlv_6= 'entities' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'requires' otherlv_11= 'request' otherlv_12= 'data' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* ) ) ) ) )* ) )
                    {
                    // InternalPanoptesX.g:861:5: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'requires' otherlv_6= 'entities' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'requires' otherlv_11= 'request' otherlv_12= 'data' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* ) ) ) ) )* ) )
                    // InternalPanoptesX.g:862:6: ( ( ({...}? => ( ({...}? => (otherlv_5= 'requires' otherlv_6= 'entities' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'requires' otherlv_11= 'request' otherlv_12= 'data' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* ) ) ) ) )* )
                    {
                     
                    					  getUnorderedGroupHelper().enter(grammarAccess.getFeatureAccess().getUnorderedGroup_2_1());
                    					
                    // InternalPanoptesX.g:865:6: ( ( ({...}? => ( ({...}? => (otherlv_5= 'requires' otherlv_6= 'entities' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'requires' otherlv_11= 'request' otherlv_12= 'data' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* ) ) ) ) )* )
                    // InternalPanoptesX.g:866:7: ( ({...}? => ( ({...}? => (otherlv_5= 'requires' otherlv_6= 'entities' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'requires' otherlv_11= 'request' otherlv_12= 'data' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* ) ) ) ) )*
                    {
                    // InternalPanoptesX.g:866:7: ( ({...}? => ( ({...}? => (otherlv_5= 'requires' otherlv_6= 'entities' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'requires' otherlv_11= 'request' otherlv_12= 'data' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* ) ) ) ) )*
                    loop16:
                    do {
                        int alt16=3;
                        int LA16_0 = input.LA(1);

                        if ( LA16_0 == 27 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureAccess().getUnorderedGroup_2_1(), 1) || getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureAccess().getUnorderedGroup_2_1(), 0) ) ) {
                            int LA16_2 = input.LA(2);

                            if ( LA16_2 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureAccess().getUnorderedGroup_2_1(), 0) ) {
                                alt16=1;
                            }
                            else if ( LA16_2 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureAccess().getUnorderedGroup_2_1(), 1) ) {
                                alt16=2;
                            }


                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalPanoptesX.g:867:5: ({...}? => ( ({...}? => (otherlv_5= 'requires' otherlv_6= 'entities' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* ) ) ) )
                    	    {
                    	    // InternalPanoptesX.g:867:5: ({...}? => ( ({...}? => (otherlv_5= 'requires' otherlv_6= 'entities' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* ) ) ) )
                    	    // InternalPanoptesX.g:868:6: {...}? => ( ({...}? => (otherlv_5= 'requires' otherlv_6= 'entities' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureAccess().getUnorderedGroup_2_1(), 0) ) {
                    	        throw new FailedPredicateException(input, "ruleFeature", "getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureAccess().getUnorderedGroup_2_1(), 0)");
                    	    }
                    	    // InternalPanoptesX.g:868:107: ( ({...}? => (otherlv_5= 'requires' otherlv_6= 'entities' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* ) ) )
                    	    // InternalPanoptesX.g:869:7: ({...}? => (otherlv_5= 'requires' otherlv_6= 'entities' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getFeatureAccess().getUnorderedGroup_2_1(), 0);
                    	    						
                    	    // InternalPanoptesX.g:872:10: ({...}? => (otherlv_5= 'requires' otherlv_6= 'entities' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* ) )
                    	    // InternalPanoptesX.g:872:11: {...}? => (otherlv_5= 'requires' otherlv_6= 'entities' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleFeature", "true");
                    	    }
                    	    // InternalPanoptesX.g:872:20: (otherlv_5= 'requires' otherlv_6= 'entities' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )
                    	    // InternalPanoptesX.g:872:21: otherlv_5= 'requires' otherlv_6= 'entities' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )*
                    	    {
                    	    otherlv_5=(Token)match(input,27,FOLLOW_19); 

                    	    										newLeafNode(otherlv_5, grammarAccess.getFeatureAccess().getRequiresKeyword_2_1_0_0());
                    	    									
                    	    otherlv_6=(Token)match(input,21,FOLLOW_7); 

                    	    										newLeafNode(otherlv_6, grammarAccess.getFeatureAccess().getEntitiesKeyword_2_1_0_1());
                    	    									
                    	    // InternalPanoptesX.g:880:10: ( ( ruleEString ) )
                    	    // InternalPanoptesX.g:881:11: ( ruleEString )
                    	    {
                    	    // InternalPanoptesX.g:881:11: ( ruleEString )
                    	    // InternalPanoptesX.g:882:12: ruleEString
                    	    {

                    	    												if (current==null) {
                    	    													current = createModelElement(grammarAccess.getFeatureRule());
                    	    												}
                    	    											

                    	    												newCompositeNode(grammarAccess.getFeatureAccess().getEntitiesEntityCrossReference_2_1_0_2_0());
                    	    											
                    	    pushFollow(FOLLOW_20);
                    	    ruleEString();

                    	    state._fsp--;


                    	    												afterParserOrEnumRuleCall();
                    	    											

                    	    }


                    	    }

                    	    // InternalPanoptesX.g:896:10: (otherlv_8= ',' ( ( ruleEString ) ) )*
                    	    loop14:
                    	    do {
                    	        int alt14=2;
                    	        int LA14_0 = input.LA(1);

                    	        if ( (LA14_0==16) ) {
                    	            alt14=1;
                    	        }


                    	        switch (alt14) {
                    	    	case 1 :
                    	    	    // InternalPanoptesX.g:897:11: otherlv_8= ',' ( ( ruleEString ) )
                    	    	    {
                    	    	    otherlv_8=(Token)match(input,16,FOLLOW_7); 

                    	    	    											newLeafNode(otherlv_8, grammarAccess.getFeatureAccess().getCommaKeyword_2_1_0_3_0());
                    	    	    										
                    	    	    // InternalPanoptesX.g:901:11: ( ( ruleEString ) )
                    	    	    // InternalPanoptesX.g:902:12: ( ruleEString )
                    	    	    {
                    	    	    // InternalPanoptesX.g:902:12: ( ruleEString )
                    	    	    // InternalPanoptesX.g:903:13: ruleEString
                    	    	    {

                    	    	    													if (current==null) {
                    	    	    														current = createModelElement(grammarAccess.getFeatureRule());
                    	    	    													}
                    	    	    												

                    	    	    													newCompositeNode(grammarAccess.getFeatureAccess().getEntitiesEntityCrossReference_2_1_0_3_1_0());
                    	    	    												
                    	    	    pushFollow(FOLLOW_20);
                    	    	    ruleEString();

                    	    	    state._fsp--;


                    	    	    													afterParserOrEnumRuleCall();
                    	    	    												

                    	    	    }


                    	    	    }


                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop14;
                    	        }
                    	    } while (true);


                    	    }


                    	    }

                    	     
                    	    							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFeatureAccess().getUnorderedGroup_2_1());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalPanoptesX.g:924:5: ({...}? => ( ({...}? => (otherlv_10= 'requires' otherlv_11= 'request' otherlv_12= 'data' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* ) ) ) )
                    	    {
                    	    // InternalPanoptesX.g:924:5: ({...}? => ( ({...}? => (otherlv_10= 'requires' otherlv_11= 'request' otherlv_12= 'data' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* ) ) ) )
                    	    // InternalPanoptesX.g:925:6: {...}? => ( ({...}? => (otherlv_10= 'requires' otherlv_11= 'request' otherlv_12= 'data' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureAccess().getUnorderedGroup_2_1(), 1) ) {
                    	        throw new FailedPredicateException(input, "ruleFeature", "getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureAccess().getUnorderedGroup_2_1(), 1)");
                    	    }
                    	    // InternalPanoptesX.g:925:107: ( ({...}? => (otherlv_10= 'requires' otherlv_11= 'request' otherlv_12= 'data' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* ) ) )
                    	    // InternalPanoptesX.g:926:7: ({...}? => (otherlv_10= 'requires' otherlv_11= 'request' otherlv_12= 'data' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getFeatureAccess().getUnorderedGroup_2_1(), 1);
                    	    						
                    	    // InternalPanoptesX.g:929:10: ({...}? => (otherlv_10= 'requires' otherlv_11= 'request' otherlv_12= 'data' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* ) )
                    	    // InternalPanoptesX.g:929:11: {...}? => (otherlv_10= 'requires' otherlv_11= 'request' otherlv_12= 'data' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleFeature", "true");
                    	    }
                    	    // InternalPanoptesX.g:929:20: (otherlv_10= 'requires' otherlv_11= 'request' otherlv_12= 'data' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* )
                    	    // InternalPanoptesX.g:929:21: otherlv_10= 'requires' otherlv_11= 'request' otherlv_12= 'data' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )*
                    	    {
                    	    otherlv_10=(Token)match(input,27,FOLLOW_21); 

                    	    										newLeafNode(otherlv_10, grammarAccess.getFeatureAccess().getRequiresKeyword_2_1_1_0());
                    	    									
                    	    otherlv_11=(Token)match(input,23,FOLLOW_12); 

                    	    										newLeafNode(otherlv_11, grammarAccess.getFeatureAccess().getRequestKeyword_2_1_1_1());
                    	    									
                    	    otherlv_12=(Token)match(input,24,FOLLOW_7); 

                    	    										newLeafNode(otherlv_12, grammarAccess.getFeatureAccess().getDataKeyword_2_1_1_2());
                    	    									
                    	    // InternalPanoptesX.g:941:10: ( ( ruleEString ) )
                    	    // InternalPanoptesX.g:942:11: ( ruleEString )
                    	    {
                    	    // InternalPanoptesX.g:942:11: ( ruleEString )
                    	    // InternalPanoptesX.g:943:12: ruleEString
                    	    {

                    	    												if (current==null) {
                    	    													current = createModelElement(grammarAccess.getFeatureRule());
                    	    												}
                    	    											

                    	    												newCompositeNode(grammarAccess.getFeatureAccess().getRequestDataRequestDataCrossReference_2_1_1_3_0());
                    	    											
                    	    pushFollow(FOLLOW_20);
                    	    ruleEString();

                    	    state._fsp--;


                    	    												afterParserOrEnumRuleCall();
                    	    											

                    	    }


                    	    }

                    	    // InternalPanoptesX.g:957:10: (otherlv_14= ',' ( ( ruleEString ) ) )*
                    	    loop15:
                    	    do {
                    	        int alt15=2;
                    	        int LA15_0 = input.LA(1);

                    	        if ( (LA15_0==16) ) {
                    	            alt15=1;
                    	        }


                    	        switch (alt15) {
                    	    	case 1 :
                    	    	    // InternalPanoptesX.g:958:11: otherlv_14= ',' ( ( ruleEString ) )
                    	    	    {
                    	    	    otherlv_14=(Token)match(input,16,FOLLOW_7); 

                    	    	    											newLeafNode(otherlv_14, grammarAccess.getFeatureAccess().getCommaKeyword_2_1_1_4_0());
                    	    	    										
                    	    	    // InternalPanoptesX.g:962:11: ( ( ruleEString ) )
                    	    	    // InternalPanoptesX.g:963:12: ( ruleEString )
                    	    	    {
                    	    	    // InternalPanoptesX.g:963:12: ( ruleEString )
                    	    	    // InternalPanoptesX.g:964:13: ruleEString
                    	    	    {

                    	    	    													if (current==null) {
                    	    	    														current = createModelElement(grammarAccess.getFeatureRule());
                    	    	    													}
                    	    	    												

                    	    	    													newCompositeNode(grammarAccess.getFeatureAccess().getRequestDataRequestDataCrossReference_2_1_1_4_1_0());
                    	    	    												
                    	    	    pushFollow(FOLLOW_20);
                    	    	    ruleEString();

                    	    	    state._fsp--;


                    	    	    													afterParserOrEnumRuleCall();
                    	    	    												

                    	    	    }


                    	    	    }


                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop15;
                    	        }
                    	    } while (true);


                    	    }


                    	    }

                    	     
                    	    							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFeatureAccess().getUnorderedGroup_2_1());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);


                    }


                    }

                     
                    					  getUnorderedGroupHelper().leave(grammarAccess.getFeatureAccess().getUnorderedGroup_2_1());
                    					

                    }

                    otherlv_16=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_16, grammarAccess.getFeatureAccess().getRightCurlyBracketKeyword_2_2());
                    			

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
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRulePrediction"
    // InternalPanoptesX.g:1001:1: entryRulePrediction returns [EObject current=null] : iv_rulePrediction= rulePrediction EOF ;
    public final EObject entryRulePrediction() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrediction = null;


        try {
            // InternalPanoptesX.g:1001:51: (iv_rulePrediction= rulePrediction EOF )
            // InternalPanoptesX.g:1002:2: iv_rulePrediction= rulePrediction EOF
            {
             newCompositeNode(grammarAccess.getPredictionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrediction=rulePrediction();

            state._fsp--;

             current =iv_rulePrediction; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePrediction"


    // $ANTLR start "rulePrediction"
    // InternalPanoptesX.g:1008:1: rulePrediction returns [EObject current=null] : ( () ( ( (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_SAFESTRING ) ) ) (otherlv_2= 'predicts' ( ( ruleEString ) ) )? ) ;
    public final EObject rulePrediction() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_1=null;
        Token lv_name_1_2=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalPanoptesX.g:1014:2: ( ( () ( ( (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_SAFESTRING ) ) ) (otherlv_2= 'predicts' ( ( ruleEString ) ) )? ) )
            // InternalPanoptesX.g:1015:2: ( () ( ( (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_SAFESTRING ) ) ) (otherlv_2= 'predicts' ( ( ruleEString ) ) )? )
            {
            // InternalPanoptesX.g:1015:2: ( () ( ( (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_SAFESTRING ) ) ) (otherlv_2= 'predicts' ( ( ruleEString ) ) )? )
            // InternalPanoptesX.g:1016:3: () ( ( (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_SAFESTRING ) ) ) (otherlv_2= 'predicts' ( ( ruleEString ) ) )?
            {
            // InternalPanoptesX.g:1016:3: ()
            // InternalPanoptesX.g:1017:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPredictionAccess().getPredictionAction_0(),
            					current);
            			

            }

            // InternalPanoptesX.g:1023:3: ( ( (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_SAFESTRING ) ) )
            // InternalPanoptesX.g:1024:4: ( (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_SAFESTRING ) )
            {
            // InternalPanoptesX.g:1024:4: ( (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_SAFESTRING ) )
            // InternalPanoptesX.g:1025:5: (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_SAFESTRING )
            {
            // InternalPanoptesX.g:1025:5: (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_SAFESTRING )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_STRING) ) {
                alt18=1;
            }
            else if ( (LA18_0==RULE_SAFESTRING) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalPanoptesX.g:1026:6: lv_name_1_1= RULE_STRING
                    {
                    lv_name_1_1=(Token)match(input,RULE_STRING,FOLLOW_22); 

                    						newLeafNode(lv_name_1_1, grammarAccess.getPredictionAccess().getNameSTRINGTerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPredictionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_1,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }
                    break;
                case 2 :
                    // InternalPanoptesX.g:1041:6: lv_name_1_2= RULE_SAFESTRING
                    {
                    lv_name_1_2=(Token)match(input,RULE_SAFESTRING,FOLLOW_22); 

                    						newLeafNode(lv_name_1_2, grammarAccess.getPredictionAccess().getNameSAFESTRINGTerminalRuleCall_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPredictionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_2,
                    							"org.lowcomote.panoptes.PanoptesX.SAFESTRING");
                    					

                    }
                    break;

            }


            }


            }

            // InternalPanoptesX.g:1058:3: (otherlv_2= 'predicts' ( ( ruleEString ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==28) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalPanoptesX.g:1059:4: otherlv_2= 'predicts' ( ( ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getPredictionAccess().getPredictsKeyword_2_0());
                    			
                    // InternalPanoptesX.g:1063:4: ( ( ruleEString ) )
                    // InternalPanoptesX.g:1064:5: ( ruleEString )
                    {
                    // InternalPanoptesX.g:1064:5: ( ruleEString )
                    // InternalPanoptesX.g:1065:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPredictionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getPredictionAccess().getLabelLabelCrossReference_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

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
    // $ANTLR end "rulePrediction"


    // $ANTLR start "entryRuleLabel"
    // InternalPanoptesX.g:1084:1: entryRuleLabel returns [EObject current=null] : iv_ruleLabel= ruleLabel EOF ;
    public final EObject entryRuleLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabel = null;


        try {
            // InternalPanoptesX.g:1084:46: (iv_ruleLabel= ruleLabel EOF )
            // InternalPanoptesX.g:1085:2: iv_ruleLabel= ruleLabel EOF
            {
             newCompositeNode(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLabel=ruleLabel();

            state._fsp--;

             current =iv_ruleLabel; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLabel"


    // $ANTLR start "ruleLabel"
    // InternalPanoptesX.g:1091:1: ruleLabel returns [EObject current=null] : ( () ( ( (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_SAFESTRING ) ) ) (otherlv_2= ':' ( (lv_type_3_0= rulestatisticalVariableType ) ) )? ) ;
    public final EObject ruleLabel() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_1=null;
        Token lv_name_1_2=null;
        Token otherlv_2=null;
        Enumerator lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalPanoptesX.g:1097:2: ( ( () ( ( (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_SAFESTRING ) ) ) (otherlv_2= ':' ( (lv_type_3_0= rulestatisticalVariableType ) ) )? ) )
            // InternalPanoptesX.g:1098:2: ( () ( ( (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_SAFESTRING ) ) ) (otherlv_2= ':' ( (lv_type_3_0= rulestatisticalVariableType ) ) )? )
            {
            // InternalPanoptesX.g:1098:2: ( () ( ( (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_SAFESTRING ) ) ) (otherlv_2= ':' ( (lv_type_3_0= rulestatisticalVariableType ) ) )? )
            // InternalPanoptesX.g:1099:3: () ( ( (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_SAFESTRING ) ) ) (otherlv_2= ':' ( (lv_type_3_0= rulestatisticalVariableType ) ) )?
            {
            // InternalPanoptesX.g:1099:3: ()
            // InternalPanoptesX.g:1100:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLabelAccess().getLabelAction_0(),
            					current);
            			

            }

            // InternalPanoptesX.g:1106:3: ( ( (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_SAFESTRING ) ) )
            // InternalPanoptesX.g:1107:4: ( (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_SAFESTRING ) )
            {
            // InternalPanoptesX.g:1107:4: ( (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_SAFESTRING ) )
            // InternalPanoptesX.g:1108:5: (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_SAFESTRING )
            {
            // InternalPanoptesX.g:1108:5: (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_SAFESTRING )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_STRING) ) {
                alt20=1;
            }
            else if ( (LA20_0==RULE_SAFESTRING) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalPanoptesX.g:1109:6: lv_name_1_1= RULE_STRING
                    {
                    lv_name_1_1=(Token)match(input,RULE_STRING,FOLLOW_23); 

                    						newLeafNode(lv_name_1_1, grammarAccess.getLabelAccess().getNameSTRINGTerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLabelRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_1,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }
                    break;
                case 2 :
                    // InternalPanoptesX.g:1124:6: lv_name_1_2= RULE_SAFESTRING
                    {
                    lv_name_1_2=(Token)match(input,RULE_SAFESTRING,FOLLOW_23); 

                    						newLeafNode(lv_name_1_2, grammarAccess.getLabelAccess().getNameSAFESTRINGTerminalRuleCall_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLabelRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_2,
                    							"org.lowcomote.panoptes.PanoptesX.SAFESTRING");
                    					

                    }
                    break;

            }


            }


            }

            // InternalPanoptesX.g:1141:3: (otherlv_2= ':' ( (lv_type_3_0= rulestatisticalVariableType ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==26) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalPanoptesX.g:1142:4: otherlv_2= ':' ( (lv_type_3_0= rulestatisticalVariableType ) )
                    {
                    otherlv_2=(Token)match(input,26,FOLLOW_16); 

                    				newLeafNode(otherlv_2, grammarAccess.getLabelAccess().getColonKeyword_2_0());
                    			
                    // InternalPanoptesX.g:1146:4: ( (lv_type_3_0= rulestatisticalVariableType ) )
                    // InternalPanoptesX.g:1147:5: (lv_type_3_0= rulestatisticalVariableType )
                    {
                    // InternalPanoptesX.g:1147:5: (lv_type_3_0= rulestatisticalVariableType )
                    // InternalPanoptesX.g:1148:6: lv_type_3_0= rulestatisticalVariableType
                    {

                    						newCompositeNode(grammarAccess.getLabelAccess().getTypeStatisticalVariableTypeEnumRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_type_3_0=rulestatisticalVariableType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLabelRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_3_0,
                    							"org.lowcomote.panoptes.PanoptesX.statisticalVariableType");
                    						afterParserOrEnumRuleCall();
                    					

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
    // $ANTLR end "ruleLabel"


    // $ANTLR start "entryRuleRequestData"
    // InternalPanoptesX.g:1170:1: entryRuleRequestData returns [EObject current=null] : iv_ruleRequestData= ruleRequestData EOF ;
    public final EObject entryRuleRequestData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequestData = null;


        try {
            // InternalPanoptesX.g:1170:52: (iv_ruleRequestData= ruleRequestData EOF )
            // InternalPanoptesX.g:1171:2: iv_ruleRequestData= ruleRequestData EOF
            {
             newCompositeNode(grammarAccess.getRequestDataRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRequestData=ruleRequestData();

            state._fsp--;

             current =iv_ruleRequestData; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRequestData"


    // $ANTLR start "ruleRequestData"
    // InternalPanoptesX.g:1177:1: ruleRequestData returns [EObject current=null] : ( () ( ( (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_SAFESTRING ) ) ) ) ;
    public final EObject ruleRequestData() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_1=null;
        Token lv_name_1_2=null;


        	enterRule();

        try {
            // InternalPanoptesX.g:1183:2: ( ( () ( ( (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_SAFESTRING ) ) ) ) )
            // InternalPanoptesX.g:1184:2: ( () ( ( (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_SAFESTRING ) ) ) )
            {
            // InternalPanoptesX.g:1184:2: ( () ( ( (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_SAFESTRING ) ) ) )
            // InternalPanoptesX.g:1185:3: () ( ( (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_SAFESTRING ) ) )
            {
            // InternalPanoptesX.g:1185:3: ()
            // InternalPanoptesX.g:1186:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRequestDataAccess().getRequestDataAction_0(),
            					current);
            			

            }

            // InternalPanoptesX.g:1192:3: ( ( (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_SAFESTRING ) ) )
            // InternalPanoptesX.g:1193:4: ( (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_SAFESTRING ) )
            {
            // InternalPanoptesX.g:1193:4: ( (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_SAFESTRING ) )
            // InternalPanoptesX.g:1194:5: (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_SAFESTRING )
            {
            // InternalPanoptesX.g:1194:5: (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_SAFESTRING )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_STRING) ) {
                alt22=1;
            }
            else if ( (LA22_0==RULE_SAFESTRING) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalPanoptesX.g:1195:6: lv_name_1_1= RULE_STRING
                    {
                    lv_name_1_1=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_name_1_1, grammarAccess.getRequestDataAccess().getNameSTRINGTerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRequestDataRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_1,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }
                    break;
                case 2 :
                    // InternalPanoptesX.g:1210:6: lv_name_1_2= RULE_SAFESTRING
                    {
                    lv_name_1_2=(Token)match(input,RULE_SAFESTRING,FOLLOW_2); 

                    						newLeafNode(lv_name_1_2, grammarAccess.getRequestDataAccess().getNameSAFESTRINGTerminalRuleCall_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRequestDataRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_2,
                    							"org.lowcomote.panoptes.PanoptesX.SAFESTRING");
                    					

                    }
                    break;

            }


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
    // $ANTLR end "ruleRequestData"


    // $ANTLR start "entryRuleKey"
    // InternalPanoptesX.g:1231:1: entryRuleKey returns [EObject current=null] : iv_ruleKey= ruleKey EOF ;
    public final EObject entryRuleKey() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKey = null;


        try {
            // InternalPanoptesX.g:1231:44: (iv_ruleKey= ruleKey EOF )
            // InternalPanoptesX.g:1232:2: iv_ruleKey= ruleKey EOF
            {
             newCompositeNode(grammarAccess.getKeyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKey=ruleKey();

            state._fsp--;

             current =iv_ruleKey; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleKey"


    // $ANTLR start "ruleKey"
    // InternalPanoptesX.g:1238:1: ruleKey returns [EObject current=null] : ( () ( ( (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_SAFESTRING ) ) ) ) ;
    public final EObject ruleKey() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_1=null;
        Token lv_name_1_2=null;


        	enterRule();

        try {
            // InternalPanoptesX.g:1244:2: ( ( () ( ( (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_SAFESTRING ) ) ) ) )
            // InternalPanoptesX.g:1245:2: ( () ( ( (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_SAFESTRING ) ) ) )
            {
            // InternalPanoptesX.g:1245:2: ( () ( ( (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_SAFESTRING ) ) ) )
            // InternalPanoptesX.g:1246:3: () ( ( (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_SAFESTRING ) ) )
            {
            // InternalPanoptesX.g:1246:3: ()
            // InternalPanoptesX.g:1247:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getKeyAccess().getKeyAction_0(),
            					current);
            			

            }

            // InternalPanoptesX.g:1253:3: ( ( (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_SAFESTRING ) ) )
            // InternalPanoptesX.g:1254:4: ( (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_SAFESTRING ) )
            {
            // InternalPanoptesX.g:1254:4: ( (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_SAFESTRING ) )
            // InternalPanoptesX.g:1255:5: (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_SAFESTRING )
            {
            // InternalPanoptesX.g:1255:5: (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_SAFESTRING )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_STRING) ) {
                alt23=1;
            }
            else if ( (LA23_0==RULE_SAFESTRING) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalPanoptesX.g:1256:6: lv_name_1_1= RULE_STRING
                    {
                    lv_name_1_1=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_name_1_1, grammarAccess.getKeyAccess().getNameSTRINGTerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getKeyRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_1,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }
                    break;
                case 2 :
                    // InternalPanoptesX.g:1271:6: lv_name_1_2= RULE_SAFESTRING
                    {
                    lv_name_1_2=(Token)match(input,RULE_SAFESTRING,FOLLOW_2); 

                    						newLeafNode(lv_name_1_2, grammarAccess.getKeyAccess().getNameSAFESTRINGTerminalRuleCall_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getKeyRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_2,
                    							"org.lowcomote.panoptes.PanoptesX.SAFESTRING");
                    					

                    }
                    break;

            }


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
    // $ANTLR end "ruleKey"


    // $ANTLR start "entryRuleDeployment"
    // InternalPanoptesX.g:1292:1: entryRuleDeployment returns [EObject current=null] : iv_ruleDeployment= ruleDeployment EOF ;
    public final EObject entryRuleDeployment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeployment = null;


        try {
            // InternalPanoptesX.g:1292:51: (iv_ruleDeployment= ruleDeployment EOF )
            // InternalPanoptesX.g:1293:2: iv_ruleDeployment= ruleDeployment EOF
            {
             newCompositeNode(grammarAccess.getDeploymentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeployment=ruleDeployment();

            state._fsp--;

             current =iv_ruleDeployment; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDeployment"


    // $ANTLR start "ruleDeployment"
    // InternalPanoptesX.g:1299:1: ruleDeployment returns [EObject current=null] : (otherlv_0= 'Deployment' ( ( (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_SAFESTRING ) ) ) otherlv_2= '{' ( (otherlv_3= 'model' ( ( ruleEString ) ) ) | (otherlv_5= 'inputs' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* ) | ( (lv_algorithmexecutions_9_0= ruleAlgorithmExecution ) ) | ( (lv_actionExecutions_10_0= ruleActionExecution ) ) | ( (lv_triggerGroups_11_0= ruleTriggerGroup ) ) )* otherlv_12= '}' ) ;
    public final EObject ruleDeployment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_1=null;
        Token lv_name_1_2=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_12=null;
        EObject lv_algorithmexecutions_9_0 = null;

        EObject lv_actionExecutions_10_0 = null;

        EObject lv_triggerGroups_11_0 = null;



        	enterRule();

        try {
            // InternalPanoptesX.g:1305:2: ( (otherlv_0= 'Deployment' ( ( (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_SAFESTRING ) ) ) otherlv_2= '{' ( (otherlv_3= 'model' ( ( ruleEString ) ) ) | (otherlv_5= 'inputs' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* ) | ( (lv_algorithmexecutions_9_0= ruleAlgorithmExecution ) ) | ( (lv_actionExecutions_10_0= ruleActionExecution ) ) | ( (lv_triggerGroups_11_0= ruleTriggerGroup ) ) )* otherlv_12= '}' ) )
            // InternalPanoptesX.g:1306:2: (otherlv_0= 'Deployment' ( ( (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_SAFESTRING ) ) ) otherlv_2= '{' ( (otherlv_3= 'model' ( ( ruleEString ) ) ) | (otherlv_5= 'inputs' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* ) | ( (lv_algorithmexecutions_9_0= ruleAlgorithmExecution ) ) | ( (lv_actionExecutions_10_0= ruleActionExecution ) ) | ( (lv_triggerGroups_11_0= ruleTriggerGroup ) ) )* otherlv_12= '}' )
            {
            // InternalPanoptesX.g:1306:2: (otherlv_0= 'Deployment' ( ( (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_SAFESTRING ) ) ) otherlv_2= '{' ( (otherlv_3= 'model' ( ( ruleEString ) ) ) | (otherlv_5= 'inputs' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* ) | ( (lv_algorithmexecutions_9_0= ruleAlgorithmExecution ) ) | ( (lv_actionExecutions_10_0= ruleActionExecution ) ) | ( (lv_triggerGroups_11_0= ruleTriggerGroup ) ) )* otherlv_12= '}' )
            // InternalPanoptesX.g:1307:3: otherlv_0= 'Deployment' ( ( (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_SAFESTRING ) ) ) otherlv_2= '{' ( (otherlv_3= 'model' ( ( ruleEString ) ) ) | (otherlv_5= 'inputs' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* ) | ( (lv_algorithmexecutions_9_0= ruleAlgorithmExecution ) ) | ( (lv_actionExecutions_10_0= ruleActionExecution ) ) | ( (lv_triggerGroups_11_0= ruleTriggerGroup ) ) )* otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDeploymentAccess().getDeploymentKeyword_0());
            		
            // InternalPanoptesX.g:1311:3: ( ( (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_SAFESTRING ) ) )
            // InternalPanoptesX.g:1312:4: ( (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_SAFESTRING ) )
            {
            // InternalPanoptesX.g:1312:4: ( (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_SAFESTRING ) )
            // InternalPanoptesX.g:1313:5: (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_SAFESTRING )
            {
            // InternalPanoptesX.g:1313:5: (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_SAFESTRING )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_STRING) ) {
                alt24=1;
            }
            else if ( (LA24_0==RULE_SAFESTRING) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalPanoptesX.g:1314:6: lv_name_1_1= RULE_STRING
                    {
                    lv_name_1_1=(Token)match(input,RULE_STRING,FOLLOW_5); 

                    						newLeafNode(lv_name_1_1, grammarAccess.getDeploymentAccess().getNameSTRINGTerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDeploymentRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_1,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }
                    break;
                case 2 :
                    // InternalPanoptesX.g:1329:6: lv_name_1_2= RULE_SAFESTRING
                    {
                    lv_name_1_2=(Token)match(input,RULE_SAFESTRING,FOLLOW_5); 

                    						newLeafNode(lv_name_1_2, grammarAccess.getDeploymentAccess().getNameSAFESTRINGTerminalRuleCall_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDeploymentRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_2,
                    							"org.lowcomote.panoptes.PanoptesX.SAFESTRING");
                    					

                    }
                    break;

            }


            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getDeploymentAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalPanoptesX.g:1350:3: ( (otherlv_3= 'model' ( ( ruleEString ) ) ) | (otherlv_5= 'inputs' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* ) | ( (lv_algorithmexecutions_9_0= ruleAlgorithmExecution ) ) | ( (lv_actionExecutions_10_0= ruleActionExecution ) ) | ( (lv_triggerGroups_11_0= ruleTriggerGroup ) ) )*
            loop26:
            do {
                int alt26=6;
                switch ( input.LA(1) ) {
                case 30:
                    {
                    alt26=1;
                    }
                    break;
                case 31:
                    {
                    alt26=2;
                    }
                    break;
                case 44:
                case 51:
                    {
                    alt26=3;
                    }
                    break;
                case 70:
                    {
                    alt26=4;
                    }
                    break;
                case 60:
                    {
                    alt26=5;
                    }
                    break;

                }

                switch (alt26) {
            	case 1 :
            	    // InternalPanoptesX.g:1351:4: (otherlv_3= 'model' ( ( ruleEString ) ) )
            	    {
            	    // InternalPanoptesX.g:1351:4: (otherlv_3= 'model' ( ( ruleEString ) ) )
            	    // InternalPanoptesX.g:1352:5: otherlv_3= 'model' ( ( ruleEString ) )
            	    {
            	    otherlv_3=(Token)match(input,30,FOLLOW_7); 

            	    					newLeafNode(otherlv_3, grammarAccess.getDeploymentAccess().getModelKeyword_3_0_0());
            	    				
            	    // InternalPanoptesX.g:1356:5: ( ( ruleEString ) )
            	    // InternalPanoptesX.g:1357:6: ( ruleEString )
            	    {
            	    // InternalPanoptesX.g:1357:6: ( ruleEString )
            	    // InternalPanoptesX.g:1358:7: ruleEString
            	    {

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getDeploymentRule());
            	    							}
            	    						

            	    							newCompositeNode(grammarAccess.getDeploymentAccess().getMlModelModelCrossReference_3_0_1_0());
            	    						
            	    pushFollow(FOLLOW_24);
            	    ruleEString();

            	    state._fsp--;


            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalPanoptesX.g:1374:4: (otherlv_5= 'inputs' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )
            	    {
            	    // InternalPanoptesX.g:1374:4: (otherlv_5= 'inputs' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )
            	    // InternalPanoptesX.g:1375:5: otherlv_5= 'inputs' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )*
            	    {
            	    otherlv_5=(Token)match(input,31,FOLLOW_7); 

            	    					newLeafNode(otherlv_5, grammarAccess.getDeploymentAccess().getInputsKeyword_3_1_0());
            	    				
            	    // InternalPanoptesX.g:1379:5: ( ( ruleEString ) )
            	    // InternalPanoptesX.g:1380:6: ( ruleEString )
            	    {
            	    // InternalPanoptesX.g:1380:6: ( ruleEString )
            	    // InternalPanoptesX.g:1381:7: ruleEString
            	    {

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getDeploymentRule());
            	    							}
            	    						

            	    							newCompositeNode(grammarAccess.getDeploymentAccess().getInputsDeploymentIOCrossReference_3_1_1_0());
            	    						
            	    pushFollow(FOLLOW_25);
            	    ruleEString();

            	    state._fsp--;


            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }

            	    // InternalPanoptesX.g:1395:5: (otherlv_7= ',' ( ( ruleEString ) ) )*
            	    loop25:
            	    do {
            	        int alt25=2;
            	        int LA25_0 = input.LA(1);

            	        if ( (LA25_0==16) ) {
            	            alt25=1;
            	        }


            	        switch (alt25) {
            	    	case 1 :
            	    	    // InternalPanoptesX.g:1396:6: otherlv_7= ',' ( ( ruleEString ) )
            	    	    {
            	    	    otherlv_7=(Token)match(input,16,FOLLOW_7); 

            	    	    						newLeafNode(otherlv_7, grammarAccess.getDeploymentAccess().getCommaKeyword_3_1_2_0());
            	    	    					
            	    	    // InternalPanoptesX.g:1400:6: ( ( ruleEString ) )
            	    	    // InternalPanoptesX.g:1401:7: ( ruleEString )
            	    	    {
            	    	    // InternalPanoptesX.g:1401:7: ( ruleEString )
            	    	    // InternalPanoptesX.g:1402:8: ruleEString
            	    	    {

            	    	    								if (current==null) {
            	    	    									current = createModelElement(grammarAccess.getDeploymentRule());
            	    	    								}
            	    	    							

            	    	    								newCompositeNode(grammarAccess.getDeploymentAccess().getInputsDeploymentIOCrossReference_3_1_2_1_0());
            	    	    							
            	    	    pushFollow(FOLLOW_25);
            	    	    ruleEString();

            	    	    state._fsp--;


            	    	    								afterParserOrEnumRuleCall();
            	    	    							

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop25;
            	        }
            	    } while (true);


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalPanoptesX.g:1419:4: ( (lv_algorithmexecutions_9_0= ruleAlgorithmExecution ) )
            	    {
            	    // InternalPanoptesX.g:1419:4: ( (lv_algorithmexecutions_9_0= ruleAlgorithmExecution ) )
            	    // InternalPanoptesX.g:1420:5: (lv_algorithmexecutions_9_0= ruleAlgorithmExecution )
            	    {
            	    // InternalPanoptesX.g:1420:5: (lv_algorithmexecutions_9_0= ruleAlgorithmExecution )
            	    // InternalPanoptesX.g:1421:6: lv_algorithmexecutions_9_0= ruleAlgorithmExecution
            	    {

            	    						newCompositeNode(grammarAccess.getDeploymentAccess().getAlgorithmexecutionsAlgorithmExecutionParserRuleCall_3_2_0());
            	    					
            	    pushFollow(FOLLOW_24);
            	    lv_algorithmexecutions_9_0=ruleAlgorithmExecution();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDeploymentRule());
            	    						}
            	    						add(
            	    							current,
            	    							"algorithmexecutions",
            	    							lv_algorithmexecutions_9_0,
            	    							"org.lowcomote.panoptes.PanoptesX.AlgorithmExecution");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalPanoptesX.g:1439:4: ( (lv_actionExecutions_10_0= ruleActionExecution ) )
            	    {
            	    // InternalPanoptesX.g:1439:4: ( (lv_actionExecutions_10_0= ruleActionExecution ) )
            	    // InternalPanoptesX.g:1440:5: (lv_actionExecutions_10_0= ruleActionExecution )
            	    {
            	    // InternalPanoptesX.g:1440:5: (lv_actionExecutions_10_0= ruleActionExecution )
            	    // InternalPanoptesX.g:1441:6: lv_actionExecutions_10_0= ruleActionExecution
            	    {

            	    						newCompositeNode(grammarAccess.getDeploymentAccess().getActionExecutionsActionExecutionParserRuleCall_3_3_0());
            	    					
            	    pushFollow(FOLLOW_24);
            	    lv_actionExecutions_10_0=ruleActionExecution();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDeploymentRule());
            	    						}
            	    						add(
            	    							current,
            	    							"actionExecutions",
            	    							lv_actionExecutions_10_0,
            	    							"org.lowcomote.panoptes.PanoptesX.ActionExecution");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalPanoptesX.g:1459:4: ( (lv_triggerGroups_11_0= ruleTriggerGroup ) )
            	    {
            	    // InternalPanoptesX.g:1459:4: ( (lv_triggerGroups_11_0= ruleTriggerGroup ) )
            	    // InternalPanoptesX.g:1460:5: (lv_triggerGroups_11_0= ruleTriggerGroup )
            	    {
            	    // InternalPanoptesX.g:1460:5: (lv_triggerGroups_11_0= ruleTriggerGroup )
            	    // InternalPanoptesX.g:1461:6: lv_triggerGroups_11_0= ruleTriggerGroup
            	    {

            	    						newCompositeNode(grammarAccess.getDeploymentAccess().getTriggerGroupsTriggerGroupParserRuleCall_3_4_0());
            	    					
            	    pushFollow(FOLLOW_24);
            	    lv_triggerGroups_11_0=ruleTriggerGroup();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDeploymentRule());
            	    						}
            	    						add(
            	    							current,
            	    							"triggerGroups",
            	    							lv_triggerGroups_11_0,
            	    							"org.lowcomote.panoptes.PanoptesX.TriggerGroup");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            otherlv_12=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getDeploymentAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleDeployment"


    // $ANTLR start "entryRuleAlgorithm"
    // InternalPanoptesX.g:1487:1: entryRuleAlgorithm returns [EObject current=null] : iv_ruleAlgorithm= ruleAlgorithm EOF ;
    public final EObject entryRuleAlgorithm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlgorithm = null;


        try {
            // InternalPanoptesX.g:1487:50: (iv_ruleAlgorithm= ruleAlgorithm EOF )
            // InternalPanoptesX.g:1488:2: iv_ruleAlgorithm= ruleAlgorithm EOF
            {
             newCompositeNode(grammarAccess.getAlgorithmRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlgorithm=ruleAlgorithm();

            state._fsp--;

             current =iv_ruleAlgorithm; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAlgorithm"


    // $ANTLR start "ruleAlgorithm"
    // InternalPanoptesX.g:1494:1: ruleAlgorithm returns [EObject current=null] : (this_BaseAlgorithm_0= ruleBaseAlgorithm | this_HigherOrderAlgorithm_1= ruleHigherOrderAlgorithm ) ;
    public final EObject ruleAlgorithm() throws RecognitionException {
        EObject current = null;

        EObject this_BaseAlgorithm_0 = null;

        EObject this_HigherOrderAlgorithm_1 = null;



        	enterRule();

        try {
            // InternalPanoptesX.g:1500:2: ( (this_BaseAlgorithm_0= ruleBaseAlgorithm | this_HigherOrderAlgorithm_1= ruleHigherOrderAlgorithm ) )
            // InternalPanoptesX.g:1501:2: (this_BaseAlgorithm_0= ruleBaseAlgorithm | this_HigherOrderAlgorithm_1= ruleHigherOrderAlgorithm )
            {
            // InternalPanoptesX.g:1501:2: (this_BaseAlgorithm_0= ruleBaseAlgorithm | this_HigherOrderAlgorithm_1= ruleHigherOrderAlgorithm )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==32) ) {
                alt27=1;
            }
            else if ( (LA27_0==40) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalPanoptesX.g:1502:3: this_BaseAlgorithm_0= ruleBaseAlgorithm
                    {

                    			newCompositeNode(grammarAccess.getAlgorithmAccess().getBaseAlgorithmParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_BaseAlgorithm_0=ruleBaseAlgorithm();

                    state._fsp--;


                    			current = this_BaseAlgorithm_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPanoptesX.g:1511:3: this_HigherOrderAlgorithm_1= ruleHigherOrderAlgorithm
                    {

                    			newCompositeNode(grammarAccess.getAlgorithmAccess().getHigherOrderAlgorithmParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_HigherOrderAlgorithm_1=ruleHigherOrderAlgorithm();

                    state._fsp--;


                    			current = this_HigherOrderAlgorithm_1;
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
    // $ANTLR end "ruleAlgorithm"


    // $ANTLR start "entryRuleBaseAlgorithm"
    // InternalPanoptesX.g:1523:1: entryRuleBaseAlgorithm returns [EObject current=null] : iv_ruleBaseAlgorithm= ruleBaseAlgorithm EOF ;
    public final EObject entryRuleBaseAlgorithm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaseAlgorithm = null;


        try {
            // InternalPanoptesX.g:1523:54: (iv_ruleBaseAlgorithm= ruleBaseAlgorithm EOF )
            // InternalPanoptesX.g:1524:2: iv_ruleBaseAlgorithm= ruleBaseAlgorithm EOF
            {
             newCompositeNode(grammarAccess.getBaseAlgorithmRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBaseAlgorithm=ruleBaseAlgorithm();

            state._fsp--;

             current =iv_ruleBaseAlgorithm; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBaseAlgorithm"


    // $ANTLR start "ruleBaseAlgorithm"
    // InternalPanoptesX.g:1530:1: ruleBaseAlgorithm returns [EObject current=null] : (otherlv_0= 'BaseAlgorithm' ( ( (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_SAFESTRING ) ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'codebase' ( ( (lv_codebase_5_1= RULE_STRING | lv_codebase_5_2= RULE_SAFESTRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'runtime' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'severity' otherlv_9= 'levels' ( (lv_driftLevels_10_0= ruleEIntegerObject ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'accepts' ( (lv_strict_12_0= 'only' ) )? ( (lv_supportedTypes_13_0= rulestatisticalVariableType ) ) (otherlv_14= ',' ( (lv_supportedTypes_15_0= rulestatisticalVariableType ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'parameters' ( (lv_additionalParameters_17_0= ruleParameter ) ) (otherlv_18= ',' ( (lv_additionalParameters_19_0= ruleParameter ) ) )* ) ) ) ) )+ {...}?) ) ) otherlv_20= '}' ) ;
    public final EObject ruleBaseAlgorithm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_1=null;
        Token lv_name_1_2=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_codebase_5_1=null;
        Token lv_codebase_5_2=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token lv_strict_12_0=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        AntlrDatatypeRuleToken lv_driftLevels_10_0 = null;

        Enumerator lv_supportedTypes_13_0 = null;

        Enumerator lv_supportedTypes_15_0 = null;

        EObject lv_additionalParameters_17_0 = null;

        EObject lv_additionalParameters_19_0 = null;



        	enterRule();

        try {
            // InternalPanoptesX.g:1536:2: ( (otherlv_0= 'BaseAlgorithm' ( ( (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_SAFESTRING ) ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'codebase' ( ( (lv_codebase_5_1= RULE_STRING | lv_codebase_5_2= RULE_SAFESTRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'runtime' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'severity' otherlv_9= 'levels' ( (lv_driftLevels_10_0= ruleEIntegerObject ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'accepts' ( (lv_strict_12_0= 'only' ) )? ( (lv_supportedTypes_13_0= rulestatisticalVariableType ) ) (otherlv_14= ',' ( (lv_supportedTypes_15_0= rulestatisticalVariableType ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'parameters' ( (lv_additionalParameters_17_0= ruleParameter ) ) (otherlv_18= ',' ( (lv_additionalParameters_19_0= ruleParameter ) ) )* ) ) ) ) )+ {...}?) ) ) otherlv_20= '}' ) )
            // InternalPanoptesX.g:1537:2: (otherlv_0= 'BaseAlgorithm' ( ( (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_SAFESTRING ) ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'codebase' ( ( (lv_codebase_5_1= RULE_STRING | lv_codebase_5_2= RULE_SAFESTRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'runtime' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'severity' otherlv_9= 'levels' ( (lv_driftLevels_10_0= ruleEIntegerObject ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'accepts' ( (lv_strict_12_0= 'only' ) )? ( (lv_supportedTypes_13_0= rulestatisticalVariableType ) ) (otherlv_14= ',' ( (lv_supportedTypes_15_0= rulestatisticalVariableType ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'parameters' ( (lv_additionalParameters_17_0= ruleParameter ) ) (otherlv_18= ',' ( (lv_additionalParameters_19_0= ruleParameter ) ) )* ) ) ) ) )+ {...}?) ) ) otherlv_20= '}' )
            {
            // InternalPanoptesX.g:1537:2: (otherlv_0= 'BaseAlgorithm' ( ( (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_SAFESTRING ) ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'codebase' ( ( (lv_codebase_5_1= RULE_STRING | lv_codebase_5_2= RULE_SAFESTRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'runtime' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'severity' otherlv_9= 'levels' ( (lv_driftLevels_10_0= ruleEIntegerObject ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'accepts' ( (lv_strict_12_0= 'only' ) )? ( (lv_supportedTypes_13_0= rulestatisticalVariableType ) ) (otherlv_14= ',' ( (lv_supportedTypes_15_0= rulestatisticalVariableType ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'parameters' ( (lv_additionalParameters_17_0= ruleParameter ) ) (otherlv_18= ',' ( (lv_additionalParameters_19_0= ruleParameter ) ) )* ) ) ) ) )+ {...}?) ) ) otherlv_20= '}' )
            // InternalPanoptesX.g:1538:3: otherlv_0= 'BaseAlgorithm' ( ( (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_SAFESTRING ) ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'codebase' ( ( (lv_codebase_5_1= RULE_STRING | lv_codebase_5_2= RULE_SAFESTRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'runtime' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'severity' otherlv_9= 'levels' ( (lv_driftLevels_10_0= ruleEIntegerObject ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'accepts' ( (lv_strict_12_0= 'only' ) )? ( (lv_supportedTypes_13_0= rulestatisticalVariableType ) ) (otherlv_14= ',' ( (lv_supportedTypes_15_0= rulestatisticalVariableType ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'parameters' ( (lv_additionalParameters_17_0= ruleParameter ) ) (otherlv_18= ',' ( (lv_additionalParameters_19_0= ruleParameter ) ) )* ) ) ) ) )+ {...}?) ) ) otherlv_20= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getBaseAlgorithmAccess().getBaseAlgorithmKeyword_0());
            		
            // InternalPanoptesX.g:1542:3: ( ( (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_SAFESTRING ) ) )
            // InternalPanoptesX.g:1543:4: ( (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_SAFESTRING ) )
            {
            // InternalPanoptesX.g:1543:4: ( (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_SAFESTRING ) )
            // InternalPanoptesX.g:1544:5: (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_SAFESTRING )
            {
            // InternalPanoptesX.g:1544:5: (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_SAFESTRING )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_STRING) ) {
                alt28=1;
            }
            else if ( (LA28_0==RULE_SAFESTRING) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalPanoptesX.g:1545:6: lv_name_1_1= RULE_STRING
                    {
                    lv_name_1_1=(Token)match(input,RULE_STRING,FOLLOW_5); 

                    						newLeafNode(lv_name_1_1, grammarAccess.getBaseAlgorithmAccess().getNameSTRINGTerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBaseAlgorithmRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_1,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }
                    break;
                case 2 :
                    // InternalPanoptesX.g:1560:6: lv_name_1_2= RULE_SAFESTRING
                    {
                    lv_name_1_2=(Token)match(input,RULE_SAFESTRING,FOLLOW_5); 

                    						newLeafNode(lv_name_1_2, grammarAccess.getBaseAlgorithmAccess().getNameSAFESTRINGTerminalRuleCall_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBaseAlgorithmRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_2,
                    							"org.lowcomote.panoptes.PanoptesX.SAFESTRING");
                    					

                    }
                    break;

            }


            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getBaseAlgorithmAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalPanoptesX.g:1581:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'codebase' ( ( (lv_codebase_5_1= RULE_STRING | lv_codebase_5_2= RULE_SAFESTRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'runtime' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'severity' otherlv_9= 'levels' ( (lv_driftLevels_10_0= ruleEIntegerObject ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'accepts' ( (lv_strict_12_0= 'only' ) )? ( (lv_supportedTypes_13_0= rulestatisticalVariableType ) ) (otherlv_14= ',' ( (lv_supportedTypes_15_0= rulestatisticalVariableType ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'parameters' ( (lv_additionalParameters_17_0= ruleParameter ) ) (otherlv_18= ',' ( (lv_additionalParameters_19_0= ruleParameter ) ) )* ) ) ) ) )+ {...}?) ) )
            // InternalPanoptesX.g:1582:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'codebase' ( ( (lv_codebase_5_1= RULE_STRING | lv_codebase_5_2= RULE_SAFESTRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'runtime' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'severity' otherlv_9= 'levels' ( (lv_driftLevels_10_0= ruleEIntegerObject ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'accepts' ( (lv_strict_12_0= 'only' ) )? ( (lv_supportedTypes_13_0= rulestatisticalVariableType ) ) (otherlv_14= ',' ( (lv_supportedTypes_15_0= rulestatisticalVariableType ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'parameters' ( (lv_additionalParameters_17_0= ruleParameter ) ) (otherlv_18= ',' ( (lv_additionalParameters_19_0= ruleParameter ) ) )* ) ) ) ) )+ {...}?) )
            {
            // InternalPanoptesX.g:1582:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'codebase' ( ( (lv_codebase_5_1= RULE_STRING | lv_codebase_5_2= RULE_SAFESTRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'runtime' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'severity' otherlv_9= 'levels' ( (lv_driftLevels_10_0= ruleEIntegerObject ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'accepts' ( (lv_strict_12_0= 'only' ) )? ( (lv_supportedTypes_13_0= rulestatisticalVariableType ) ) (otherlv_14= ',' ( (lv_supportedTypes_15_0= rulestatisticalVariableType ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'parameters' ( (lv_additionalParameters_17_0= ruleParameter ) ) (otherlv_18= ',' ( (lv_additionalParameters_19_0= ruleParameter ) ) )* ) ) ) ) )+ {...}?) )
            // InternalPanoptesX.g:1583:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'codebase' ( ( (lv_codebase_5_1= RULE_STRING | lv_codebase_5_2= RULE_SAFESTRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'runtime' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'severity' otherlv_9= 'levels' ( (lv_driftLevels_10_0= ruleEIntegerObject ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'accepts' ( (lv_strict_12_0= 'only' ) )? ( (lv_supportedTypes_13_0= rulestatisticalVariableType ) ) (otherlv_14= ',' ( (lv_supportedTypes_15_0= rulestatisticalVariableType ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'parameters' ( (lv_additionalParameters_17_0= ruleParameter ) ) (otherlv_18= ',' ( (lv_additionalParameters_19_0= ruleParameter ) ) )* ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getBaseAlgorithmAccess().getUnorderedGroup_3());
            				
            // InternalPanoptesX.g:1586:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'codebase' ( ( (lv_codebase_5_1= RULE_STRING | lv_codebase_5_2= RULE_SAFESTRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'runtime' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'severity' otherlv_9= 'levels' ( (lv_driftLevels_10_0= ruleEIntegerObject ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'accepts' ( (lv_strict_12_0= 'only' ) )? ( (lv_supportedTypes_13_0= rulestatisticalVariableType ) ) (otherlv_14= ',' ( (lv_supportedTypes_15_0= rulestatisticalVariableType ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'parameters' ( (lv_additionalParameters_17_0= ruleParameter ) ) (otherlv_18= ',' ( (lv_additionalParameters_19_0= ruleParameter ) ) )* ) ) ) ) )+ {...}?)
            // InternalPanoptesX.g:1587:6: ( ({...}? => ( ({...}? => (otherlv_4= 'codebase' ( ( (lv_codebase_5_1= RULE_STRING | lv_codebase_5_2= RULE_SAFESTRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'runtime' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'severity' otherlv_9= 'levels' ( (lv_driftLevels_10_0= ruleEIntegerObject ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'accepts' ( (lv_strict_12_0= 'only' ) )? ( (lv_supportedTypes_13_0= rulestatisticalVariableType ) ) (otherlv_14= ',' ( (lv_supportedTypes_15_0= rulestatisticalVariableType ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'parameters' ( (lv_additionalParameters_17_0= ruleParameter ) ) (otherlv_18= ',' ( (lv_additionalParameters_19_0= ruleParameter ) ) )* ) ) ) ) )+ {...}?
            {
            // InternalPanoptesX.g:1587:6: ( ({...}? => ( ({...}? => (otherlv_4= 'codebase' ( ( (lv_codebase_5_1= RULE_STRING | lv_codebase_5_2= RULE_SAFESTRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'runtime' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'severity' otherlv_9= 'levels' ( (lv_driftLevels_10_0= ruleEIntegerObject ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'accepts' ( (lv_strict_12_0= 'only' ) )? ( (lv_supportedTypes_13_0= rulestatisticalVariableType ) ) (otherlv_14= ',' ( (lv_supportedTypes_15_0= rulestatisticalVariableType ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'parameters' ( (lv_additionalParameters_17_0= ruleParameter ) ) (otherlv_18= ',' ( (lv_additionalParameters_19_0= ruleParameter ) ) )* ) ) ) ) )+
            int cnt33=0;
            loop33:
            do {
                int alt33=6;
                int LA33_0 = input.LA(1);

                if ( LA33_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getBaseAlgorithmAccess().getUnorderedGroup_3(), 0) ) {
                    alt33=1;
                }
                else if ( LA33_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getBaseAlgorithmAccess().getUnorderedGroup_3(), 1) ) {
                    alt33=2;
                }
                else if ( LA33_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getBaseAlgorithmAccess().getUnorderedGroup_3(), 2) ) {
                    alt33=3;
                }
                else if ( LA33_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getBaseAlgorithmAccess().getUnorderedGroup_3(), 3) ) {
                    alt33=4;
                }
                else if ( LA33_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getBaseAlgorithmAccess().getUnorderedGroup_3(), 4) ) {
                    alt33=5;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalPanoptesX.g:1588:4: ({...}? => ( ({...}? => (otherlv_4= 'codebase' ( ( (lv_codebase_5_1= RULE_STRING | lv_codebase_5_2= RULE_SAFESTRING ) ) ) ) ) ) )
            	    {
            	    // InternalPanoptesX.g:1588:4: ({...}? => ( ({...}? => (otherlv_4= 'codebase' ( ( (lv_codebase_5_1= RULE_STRING | lv_codebase_5_2= RULE_SAFESTRING ) ) ) ) ) ) )
            	    // InternalPanoptesX.g:1589:5: {...}? => ( ({...}? => (otherlv_4= 'codebase' ( ( (lv_codebase_5_1= RULE_STRING | lv_codebase_5_2= RULE_SAFESTRING ) ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBaseAlgorithmAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleBaseAlgorithm", "getUnorderedGroupHelper().canSelect(grammarAccess.getBaseAlgorithmAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalPanoptesX.g:1589:110: ( ({...}? => (otherlv_4= 'codebase' ( ( (lv_codebase_5_1= RULE_STRING | lv_codebase_5_2= RULE_SAFESTRING ) ) ) ) ) )
            	    // InternalPanoptesX.g:1590:6: ({...}? => (otherlv_4= 'codebase' ( ( (lv_codebase_5_1= RULE_STRING | lv_codebase_5_2= RULE_SAFESTRING ) ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getBaseAlgorithmAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalPanoptesX.g:1593:9: ({...}? => (otherlv_4= 'codebase' ( ( (lv_codebase_5_1= RULE_STRING | lv_codebase_5_2= RULE_SAFESTRING ) ) ) ) )
            	    // InternalPanoptesX.g:1593:10: {...}? => (otherlv_4= 'codebase' ( ( (lv_codebase_5_1= RULE_STRING | lv_codebase_5_2= RULE_SAFESTRING ) ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBaseAlgorithm", "true");
            	    }
            	    // InternalPanoptesX.g:1593:19: (otherlv_4= 'codebase' ( ( (lv_codebase_5_1= RULE_STRING | lv_codebase_5_2= RULE_SAFESTRING ) ) ) )
            	    // InternalPanoptesX.g:1593:20: otherlv_4= 'codebase' ( ( (lv_codebase_5_1= RULE_STRING | lv_codebase_5_2= RULE_SAFESTRING ) ) )
            	    {
            	    otherlv_4=(Token)match(input,33,FOLLOW_4); 

            	    									newLeafNode(otherlv_4, grammarAccess.getBaseAlgorithmAccess().getCodebaseKeyword_3_0_0());
            	    								
            	    // InternalPanoptesX.g:1597:9: ( ( (lv_codebase_5_1= RULE_STRING | lv_codebase_5_2= RULE_SAFESTRING ) ) )
            	    // InternalPanoptesX.g:1598:10: ( (lv_codebase_5_1= RULE_STRING | lv_codebase_5_2= RULE_SAFESTRING ) )
            	    {
            	    // InternalPanoptesX.g:1598:10: ( (lv_codebase_5_1= RULE_STRING | lv_codebase_5_2= RULE_SAFESTRING ) )
            	    // InternalPanoptesX.g:1599:11: (lv_codebase_5_1= RULE_STRING | lv_codebase_5_2= RULE_SAFESTRING )
            	    {
            	    // InternalPanoptesX.g:1599:11: (lv_codebase_5_1= RULE_STRING | lv_codebase_5_2= RULE_SAFESTRING )
            	    int alt29=2;
            	    int LA29_0 = input.LA(1);

            	    if ( (LA29_0==RULE_STRING) ) {
            	        alt29=1;
            	    }
            	    else if ( (LA29_0==RULE_SAFESTRING) ) {
            	        alt29=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 29, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt29) {
            	        case 1 :
            	            // InternalPanoptesX.g:1600:12: lv_codebase_5_1= RULE_STRING
            	            {
            	            lv_codebase_5_1=(Token)match(input,RULE_STRING,FOLLOW_27); 

            	            												newLeafNode(lv_codebase_5_1, grammarAccess.getBaseAlgorithmAccess().getCodebaseSTRINGTerminalRuleCall_3_0_1_0_0());
            	            											

            	            												if (current==null) {
            	            													current = createModelElement(grammarAccess.getBaseAlgorithmRule());
            	            												}
            	            												setWithLastConsumed(
            	            													current,
            	            													"codebase",
            	            													lv_codebase_5_1,
            	            													"org.eclipse.xtext.common.Terminals.STRING");
            	            											

            	            }
            	            break;
            	        case 2 :
            	            // InternalPanoptesX.g:1615:12: lv_codebase_5_2= RULE_SAFESTRING
            	            {
            	            lv_codebase_5_2=(Token)match(input,RULE_SAFESTRING,FOLLOW_27); 

            	            												newLeafNode(lv_codebase_5_2, grammarAccess.getBaseAlgorithmAccess().getCodebaseSAFESTRINGTerminalRuleCall_3_0_1_0_1());
            	            											

            	            												if (current==null) {
            	            													current = createModelElement(grammarAccess.getBaseAlgorithmRule());
            	            												}
            	            												setWithLastConsumed(
            	            													current,
            	            													"codebase",
            	            													lv_codebase_5_2,
            	            													"org.lowcomote.panoptes.PanoptesX.SAFESTRING");
            	            											

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBaseAlgorithmAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalPanoptesX.g:1638:4: ({...}? => ( ({...}? => (otherlv_6= 'runtime' ( ( ruleEString ) ) ) ) ) )
            	    {
            	    // InternalPanoptesX.g:1638:4: ({...}? => ( ({...}? => (otherlv_6= 'runtime' ( ( ruleEString ) ) ) ) ) )
            	    // InternalPanoptesX.g:1639:5: {...}? => ( ({...}? => (otherlv_6= 'runtime' ( ( ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBaseAlgorithmAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleBaseAlgorithm", "getUnorderedGroupHelper().canSelect(grammarAccess.getBaseAlgorithmAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalPanoptesX.g:1639:110: ( ({...}? => (otherlv_6= 'runtime' ( ( ruleEString ) ) ) ) )
            	    // InternalPanoptesX.g:1640:6: ({...}? => (otherlv_6= 'runtime' ( ( ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getBaseAlgorithmAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalPanoptesX.g:1643:9: ({...}? => (otherlv_6= 'runtime' ( ( ruleEString ) ) ) )
            	    // InternalPanoptesX.g:1643:10: {...}? => (otherlv_6= 'runtime' ( ( ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBaseAlgorithm", "true");
            	    }
            	    // InternalPanoptesX.g:1643:19: (otherlv_6= 'runtime' ( ( ruleEString ) ) )
            	    // InternalPanoptesX.g:1643:20: otherlv_6= 'runtime' ( ( ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,34,FOLLOW_7); 

            	    									newLeafNode(otherlv_6, grammarAccess.getBaseAlgorithmAccess().getRuntimeKeyword_3_1_0());
            	    								
            	    // InternalPanoptesX.g:1647:9: ( ( ruleEString ) )
            	    // InternalPanoptesX.g:1648:10: ( ruleEString )
            	    {
            	    // InternalPanoptesX.g:1648:10: ( ruleEString )
            	    // InternalPanoptesX.g:1649:11: ruleEString
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getBaseAlgorithmRule());
            	    											}
            	    										

            	    											newCompositeNode(grammarAccess.getBaseAlgorithmAccess().getRuntimeBaseAlgorithmRuntimeCrossReference_3_1_1_0());
            	    										
            	    pushFollow(FOLLOW_27);
            	    ruleEString();

            	    state._fsp--;


            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBaseAlgorithmAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalPanoptesX.g:1669:4: ({...}? => ( ({...}? => (otherlv_8= 'severity' otherlv_9= 'levels' ( (lv_driftLevels_10_0= ruleEIntegerObject ) ) ) ) ) )
            	    {
            	    // InternalPanoptesX.g:1669:4: ({...}? => ( ({...}? => (otherlv_8= 'severity' otherlv_9= 'levels' ( (lv_driftLevels_10_0= ruleEIntegerObject ) ) ) ) ) )
            	    // InternalPanoptesX.g:1670:5: {...}? => ( ({...}? => (otherlv_8= 'severity' otherlv_9= 'levels' ( (lv_driftLevels_10_0= ruleEIntegerObject ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBaseAlgorithmAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleBaseAlgorithm", "getUnorderedGroupHelper().canSelect(grammarAccess.getBaseAlgorithmAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalPanoptesX.g:1670:110: ( ({...}? => (otherlv_8= 'severity' otherlv_9= 'levels' ( (lv_driftLevels_10_0= ruleEIntegerObject ) ) ) ) )
            	    // InternalPanoptesX.g:1671:6: ({...}? => (otherlv_8= 'severity' otherlv_9= 'levels' ( (lv_driftLevels_10_0= ruleEIntegerObject ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getBaseAlgorithmAccess().getUnorderedGroup_3(), 2);
            	    					
            	    // InternalPanoptesX.g:1674:9: ({...}? => (otherlv_8= 'severity' otherlv_9= 'levels' ( (lv_driftLevels_10_0= ruleEIntegerObject ) ) ) )
            	    // InternalPanoptesX.g:1674:10: {...}? => (otherlv_8= 'severity' otherlv_9= 'levels' ( (lv_driftLevels_10_0= ruleEIntegerObject ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBaseAlgorithm", "true");
            	    }
            	    // InternalPanoptesX.g:1674:19: (otherlv_8= 'severity' otherlv_9= 'levels' ( (lv_driftLevels_10_0= ruleEIntegerObject ) ) )
            	    // InternalPanoptesX.g:1674:20: otherlv_8= 'severity' otherlv_9= 'levels' ( (lv_driftLevels_10_0= ruleEIntegerObject ) )
            	    {
            	    otherlv_8=(Token)match(input,35,FOLLOW_28); 

            	    									newLeafNode(otherlv_8, grammarAccess.getBaseAlgorithmAccess().getSeverityKeyword_3_2_0());
            	    								
            	    otherlv_9=(Token)match(input,36,FOLLOW_29); 

            	    									newLeafNode(otherlv_9, grammarAccess.getBaseAlgorithmAccess().getLevelsKeyword_3_2_1());
            	    								
            	    // InternalPanoptesX.g:1682:9: ( (lv_driftLevels_10_0= ruleEIntegerObject ) )
            	    // InternalPanoptesX.g:1683:10: (lv_driftLevels_10_0= ruleEIntegerObject )
            	    {
            	    // InternalPanoptesX.g:1683:10: (lv_driftLevels_10_0= ruleEIntegerObject )
            	    // InternalPanoptesX.g:1684:11: lv_driftLevels_10_0= ruleEIntegerObject
            	    {

            	    											newCompositeNode(grammarAccess.getBaseAlgorithmAccess().getDriftLevelsEIntegerObjectParserRuleCall_3_2_2_0());
            	    										
            	    pushFollow(FOLLOW_27);
            	    lv_driftLevels_10_0=ruleEIntegerObject();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getBaseAlgorithmRule());
            	    											}
            	    											set(
            	    												current,
            	    												"driftLevels",
            	    												lv_driftLevels_10_0,
            	    												"org.lowcomote.panoptes.PanoptesX.EIntegerObject");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBaseAlgorithmAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalPanoptesX.g:1707:4: ({...}? => ( ({...}? => (otherlv_11= 'accepts' ( (lv_strict_12_0= 'only' ) )? ( (lv_supportedTypes_13_0= rulestatisticalVariableType ) ) (otherlv_14= ',' ( (lv_supportedTypes_15_0= rulestatisticalVariableType ) ) )* ) ) ) )
            	    {
            	    // InternalPanoptesX.g:1707:4: ({...}? => ( ({...}? => (otherlv_11= 'accepts' ( (lv_strict_12_0= 'only' ) )? ( (lv_supportedTypes_13_0= rulestatisticalVariableType ) ) (otherlv_14= ',' ( (lv_supportedTypes_15_0= rulestatisticalVariableType ) ) )* ) ) ) )
            	    // InternalPanoptesX.g:1708:5: {...}? => ( ({...}? => (otherlv_11= 'accepts' ( (lv_strict_12_0= 'only' ) )? ( (lv_supportedTypes_13_0= rulestatisticalVariableType ) ) (otherlv_14= ',' ( (lv_supportedTypes_15_0= rulestatisticalVariableType ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBaseAlgorithmAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleBaseAlgorithm", "getUnorderedGroupHelper().canSelect(grammarAccess.getBaseAlgorithmAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // InternalPanoptesX.g:1708:110: ( ({...}? => (otherlv_11= 'accepts' ( (lv_strict_12_0= 'only' ) )? ( (lv_supportedTypes_13_0= rulestatisticalVariableType ) ) (otherlv_14= ',' ( (lv_supportedTypes_15_0= rulestatisticalVariableType ) ) )* ) ) )
            	    // InternalPanoptesX.g:1709:6: ({...}? => (otherlv_11= 'accepts' ( (lv_strict_12_0= 'only' ) )? ( (lv_supportedTypes_13_0= rulestatisticalVariableType ) ) (otherlv_14= ',' ( (lv_supportedTypes_15_0= rulestatisticalVariableType ) ) )* ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getBaseAlgorithmAccess().getUnorderedGroup_3(), 3);
            	    					
            	    // InternalPanoptesX.g:1712:9: ({...}? => (otherlv_11= 'accepts' ( (lv_strict_12_0= 'only' ) )? ( (lv_supportedTypes_13_0= rulestatisticalVariableType ) ) (otherlv_14= ',' ( (lv_supportedTypes_15_0= rulestatisticalVariableType ) ) )* ) )
            	    // InternalPanoptesX.g:1712:10: {...}? => (otherlv_11= 'accepts' ( (lv_strict_12_0= 'only' ) )? ( (lv_supportedTypes_13_0= rulestatisticalVariableType ) ) (otherlv_14= ',' ( (lv_supportedTypes_15_0= rulestatisticalVariableType ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBaseAlgorithm", "true");
            	    }
            	    // InternalPanoptesX.g:1712:19: (otherlv_11= 'accepts' ( (lv_strict_12_0= 'only' ) )? ( (lv_supportedTypes_13_0= rulestatisticalVariableType ) ) (otherlv_14= ',' ( (lv_supportedTypes_15_0= rulestatisticalVariableType ) ) )* )
            	    // InternalPanoptesX.g:1712:20: otherlv_11= 'accepts' ( (lv_strict_12_0= 'only' ) )? ( (lv_supportedTypes_13_0= rulestatisticalVariableType ) ) (otherlv_14= ',' ( (lv_supportedTypes_15_0= rulestatisticalVariableType ) ) )*
            	    {
            	    otherlv_11=(Token)match(input,37,FOLLOW_30); 

            	    									newLeafNode(otherlv_11, grammarAccess.getBaseAlgorithmAccess().getAcceptsKeyword_3_3_0());
            	    								
            	    // InternalPanoptesX.g:1716:9: ( (lv_strict_12_0= 'only' ) )?
            	    int alt30=2;
            	    int LA30_0 = input.LA(1);

            	    if ( (LA30_0==38) ) {
            	        alt30=1;
            	    }
            	    switch (alt30) {
            	        case 1 :
            	            // InternalPanoptesX.g:1717:10: (lv_strict_12_0= 'only' )
            	            {
            	            // InternalPanoptesX.g:1717:10: (lv_strict_12_0= 'only' )
            	            // InternalPanoptesX.g:1718:11: lv_strict_12_0= 'only'
            	            {
            	            lv_strict_12_0=(Token)match(input,38,FOLLOW_16); 

            	            											newLeafNode(lv_strict_12_0, grammarAccess.getBaseAlgorithmAccess().getStrictOnlyKeyword_3_3_1_0());
            	            										

            	            											if (current==null) {
            	            												current = createModelElement(grammarAccess.getBaseAlgorithmRule());
            	            											}
            	            											setWithLastConsumed(current, "strict", lv_strict_12_0 != null, "only");
            	            										

            	            }


            	            }
            	            break;

            	    }

            	    // InternalPanoptesX.g:1730:9: ( (lv_supportedTypes_13_0= rulestatisticalVariableType ) )
            	    // InternalPanoptesX.g:1731:10: (lv_supportedTypes_13_0= rulestatisticalVariableType )
            	    {
            	    // InternalPanoptesX.g:1731:10: (lv_supportedTypes_13_0= rulestatisticalVariableType )
            	    // InternalPanoptesX.g:1732:11: lv_supportedTypes_13_0= rulestatisticalVariableType
            	    {

            	    											newCompositeNode(grammarAccess.getBaseAlgorithmAccess().getSupportedTypesStatisticalVariableTypeEnumRuleCall_3_3_2_0());
            	    										
            	    pushFollow(FOLLOW_31);
            	    lv_supportedTypes_13_0=rulestatisticalVariableType();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getBaseAlgorithmRule());
            	    											}
            	    											add(
            	    												current,
            	    												"supportedTypes",
            	    												lv_supportedTypes_13_0,
            	    												"org.lowcomote.panoptes.PanoptesX.statisticalVariableType");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalPanoptesX.g:1749:9: (otherlv_14= ',' ( (lv_supportedTypes_15_0= rulestatisticalVariableType ) ) )*
            	    loop31:
            	    do {
            	        int alt31=2;
            	        int LA31_0 = input.LA(1);

            	        if ( (LA31_0==16) ) {
            	            alt31=1;
            	        }


            	        switch (alt31) {
            	    	case 1 :
            	    	    // InternalPanoptesX.g:1750:10: otherlv_14= ',' ( (lv_supportedTypes_15_0= rulestatisticalVariableType ) )
            	    	    {
            	    	    otherlv_14=(Token)match(input,16,FOLLOW_16); 

            	    	    										newLeafNode(otherlv_14, grammarAccess.getBaseAlgorithmAccess().getCommaKeyword_3_3_3_0());
            	    	    									
            	    	    // InternalPanoptesX.g:1754:10: ( (lv_supportedTypes_15_0= rulestatisticalVariableType ) )
            	    	    // InternalPanoptesX.g:1755:11: (lv_supportedTypes_15_0= rulestatisticalVariableType )
            	    	    {
            	    	    // InternalPanoptesX.g:1755:11: (lv_supportedTypes_15_0= rulestatisticalVariableType )
            	    	    // InternalPanoptesX.g:1756:12: lv_supportedTypes_15_0= rulestatisticalVariableType
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getBaseAlgorithmAccess().getSupportedTypesStatisticalVariableTypeEnumRuleCall_3_3_3_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_31);
            	    	    lv_supportedTypes_15_0=rulestatisticalVariableType();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getBaseAlgorithmRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"supportedTypes",
            	    	    													lv_supportedTypes_15_0,
            	    	    													"org.lowcomote.panoptes.PanoptesX.statisticalVariableType");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop31;
            	        }
            	    } while (true);


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBaseAlgorithmAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalPanoptesX.g:1780:4: ({...}? => ( ({...}? => (otherlv_16= 'parameters' ( (lv_additionalParameters_17_0= ruleParameter ) ) (otherlv_18= ',' ( (lv_additionalParameters_19_0= ruleParameter ) ) )* ) ) ) )
            	    {
            	    // InternalPanoptesX.g:1780:4: ({...}? => ( ({...}? => (otherlv_16= 'parameters' ( (lv_additionalParameters_17_0= ruleParameter ) ) (otherlv_18= ',' ( (lv_additionalParameters_19_0= ruleParameter ) ) )* ) ) ) )
            	    // InternalPanoptesX.g:1781:5: {...}? => ( ({...}? => (otherlv_16= 'parameters' ( (lv_additionalParameters_17_0= ruleParameter ) ) (otherlv_18= ',' ( (lv_additionalParameters_19_0= ruleParameter ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBaseAlgorithmAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleBaseAlgorithm", "getUnorderedGroupHelper().canSelect(grammarAccess.getBaseAlgorithmAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // InternalPanoptesX.g:1781:110: ( ({...}? => (otherlv_16= 'parameters' ( (lv_additionalParameters_17_0= ruleParameter ) ) (otherlv_18= ',' ( (lv_additionalParameters_19_0= ruleParameter ) ) )* ) ) )
            	    // InternalPanoptesX.g:1782:6: ({...}? => (otherlv_16= 'parameters' ( (lv_additionalParameters_17_0= ruleParameter ) ) (otherlv_18= ',' ( (lv_additionalParameters_19_0= ruleParameter ) ) )* ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getBaseAlgorithmAccess().getUnorderedGroup_3(), 4);
            	    					
            	    // InternalPanoptesX.g:1785:9: ({...}? => (otherlv_16= 'parameters' ( (lv_additionalParameters_17_0= ruleParameter ) ) (otherlv_18= ',' ( (lv_additionalParameters_19_0= ruleParameter ) ) )* ) )
            	    // InternalPanoptesX.g:1785:10: {...}? => (otherlv_16= 'parameters' ( (lv_additionalParameters_17_0= ruleParameter ) ) (otherlv_18= ',' ( (lv_additionalParameters_19_0= ruleParameter ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBaseAlgorithm", "true");
            	    }
            	    // InternalPanoptesX.g:1785:19: (otherlv_16= 'parameters' ( (lv_additionalParameters_17_0= ruleParameter ) ) (otherlv_18= ',' ( (lv_additionalParameters_19_0= ruleParameter ) ) )* )
            	    // InternalPanoptesX.g:1785:20: otherlv_16= 'parameters' ( (lv_additionalParameters_17_0= ruleParameter ) ) (otherlv_18= ',' ( (lv_additionalParameters_19_0= ruleParameter ) ) )*
            	    {
            	    otherlv_16=(Token)match(input,39,FOLLOW_32); 

            	    									newLeafNode(otherlv_16, grammarAccess.getBaseAlgorithmAccess().getParametersKeyword_3_4_0());
            	    								
            	    // InternalPanoptesX.g:1789:9: ( (lv_additionalParameters_17_0= ruleParameter ) )
            	    // InternalPanoptesX.g:1790:10: (lv_additionalParameters_17_0= ruleParameter )
            	    {
            	    // InternalPanoptesX.g:1790:10: (lv_additionalParameters_17_0= ruleParameter )
            	    // InternalPanoptesX.g:1791:11: lv_additionalParameters_17_0= ruleParameter
            	    {

            	    											newCompositeNode(grammarAccess.getBaseAlgorithmAccess().getAdditionalParametersParameterParserRuleCall_3_4_1_0());
            	    										
            	    pushFollow(FOLLOW_31);
            	    lv_additionalParameters_17_0=ruleParameter();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getBaseAlgorithmRule());
            	    											}
            	    											add(
            	    												current,
            	    												"additionalParameters",
            	    												lv_additionalParameters_17_0,
            	    												"org.lowcomote.panoptes.PanoptesX.Parameter");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalPanoptesX.g:1808:9: (otherlv_18= ',' ( (lv_additionalParameters_19_0= ruleParameter ) ) )*
            	    loop32:
            	    do {
            	        int alt32=2;
            	        int LA32_0 = input.LA(1);

            	        if ( (LA32_0==16) ) {
            	            alt32=1;
            	        }


            	        switch (alt32) {
            	    	case 1 :
            	    	    // InternalPanoptesX.g:1809:10: otherlv_18= ',' ( (lv_additionalParameters_19_0= ruleParameter ) )
            	    	    {
            	    	    otherlv_18=(Token)match(input,16,FOLLOW_32); 

            	    	    										newLeafNode(otherlv_18, grammarAccess.getBaseAlgorithmAccess().getCommaKeyword_3_4_2_0());
            	    	    									
            	    	    // InternalPanoptesX.g:1813:10: ( (lv_additionalParameters_19_0= ruleParameter ) )
            	    	    // InternalPanoptesX.g:1814:11: (lv_additionalParameters_19_0= ruleParameter )
            	    	    {
            	    	    // InternalPanoptesX.g:1814:11: (lv_additionalParameters_19_0= ruleParameter )
            	    	    // InternalPanoptesX.g:1815:12: lv_additionalParameters_19_0= ruleParameter
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getBaseAlgorithmAccess().getAdditionalParametersParameterParserRuleCall_3_4_2_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_31);
            	    	    lv_additionalParameters_19_0=ruleParameter();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getBaseAlgorithmRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"additionalParameters",
            	    	    													lv_additionalParameters_19_0,
            	    	    													"org.lowcomote.panoptes.PanoptesX.Parameter");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop32;
            	        }
            	    } while (true);


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBaseAlgorithmAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt33 >= 1 ) break loop33;
                        EarlyExitException eee =
                            new EarlyExitException(33, input);
                        throw eee;
                }
                cnt33++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getBaseAlgorithmAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "ruleBaseAlgorithm", "getUnorderedGroupHelper().canLeave(grammarAccess.getBaseAlgorithmAccess().getUnorderedGroup_3())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getBaseAlgorithmAccess().getUnorderedGroup_3());
            				

            }

            otherlv_20=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_20, grammarAccess.getBaseAlgorithmAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleBaseAlgorithm"


    // $ANTLR start "entryRuleHigherOrderAlgorithm"
    // InternalPanoptesX.g:1855:1: entryRuleHigherOrderAlgorithm returns [EObject current=null] : iv_ruleHigherOrderAlgorithm= ruleHigherOrderAlgorithm EOF ;
    public final EObject entryRuleHigherOrderAlgorithm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHigherOrderAlgorithm = null;


        try {
            // InternalPanoptesX.g:1855:61: (iv_ruleHigherOrderAlgorithm= ruleHigherOrderAlgorithm EOF )
            // InternalPanoptesX.g:1856:2: iv_ruleHigherOrderAlgorithm= ruleHigherOrderAlgorithm EOF
            {
             newCompositeNode(grammarAccess.getHigherOrderAlgorithmRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHigherOrderAlgorithm=ruleHigherOrderAlgorithm();

            state._fsp--;

             current =iv_ruleHigherOrderAlgorithm; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleHigherOrderAlgorithm"


    // $ANTLR start "ruleHigherOrderAlgorithm"
    // InternalPanoptesX.g:1862:1: ruleHigherOrderAlgorithm returns [EObject current=null] : ( () otherlv_1= 'HigherOrderAlgorithm' ( ( (lv_name_2_1= RULE_STRING | lv_name_2_2= RULE_SAFESTRING ) ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'codebase' ( ( (lv_codebase_6_1= RULE_STRING | lv_codebase_6_2= RULE_SAFESTRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'runtime' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'severity' otherlv_10= 'levels' ( (lv_driftLevels_11_0= ruleEIntegerObject ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'parameters' ( (lv_additionalParameters_13_0= ruleParameter ) ) (otherlv_14= ',' ( (lv_additionalParameters_15_0= ruleParameter ) ) )* ) ) ) ) )+ {...}?) ) ) otherlv_16= '}' ) ;
    public final EObject ruleHigherOrderAlgorithm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_1=null;
        Token lv_name_2_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_codebase_6_1=null;
        Token lv_codebase_6_2=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_driftLevels_11_0 = null;

        EObject lv_additionalParameters_13_0 = null;

        EObject lv_additionalParameters_15_0 = null;



        	enterRule();

        try {
            // InternalPanoptesX.g:1868:2: ( ( () otherlv_1= 'HigherOrderAlgorithm' ( ( (lv_name_2_1= RULE_STRING | lv_name_2_2= RULE_SAFESTRING ) ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'codebase' ( ( (lv_codebase_6_1= RULE_STRING | lv_codebase_6_2= RULE_SAFESTRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'runtime' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'severity' otherlv_10= 'levels' ( (lv_driftLevels_11_0= ruleEIntegerObject ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'parameters' ( (lv_additionalParameters_13_0= ruleParameter ) ) (otherlv_14= ',' ( (lv_additionalParameters_15_0= ruleParameter ) ) )* ) ) ) ) )+ {...}?) ) ) otherlv_16= '}' ) )
            // InternalPanoptesX.g:1869:2: ( () otherlv_1= 'HigherOrderAlgorithm' ( ( (lv_name_2_1= RULE_STRING | lv_name_2_2= RULE_SAFESTRING ) ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'codebase' ( ( (lv_codebase_6_1= RULE_STRING | lv_codebase_6_2= RULE_SAFESTRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'runtime' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'severity' otherlv_10= 'levels' ( (lv_driftLevels_11_0= ruleEIntegerObject ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'parameters' ( (lv_additionalParameters_13_0= ruleParameter ) ) (otherlv_14= ',' ( (lv_additionalParameters_15_0= ruleParameter ) ) )* ) ) ) ) )+ {...}?) ) ) otherlv_16= '}' )
            {
            // InternalPanoptesX.g:1869:2: ( () otherlv_1= 'HigherOrderAlgorithm' ( ( (lv_name_2_1= RULE_STRING | lv_name_2_2= RULE_SAFESTRING ) ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'codebase' ( ( (lv_codebase_6_1= RULE_STRING | lv_codebase_6_2= RULE_SAFESTRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'runtime' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'severity' otherlv_10= 'levels' ( (lv_driftLevels_11_0= ruleEIntegerObject ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'parameters' ( (lv_additionalParameters_13_0= ruleParameter ) ) (otherlv_14= ',' ( (lv_additionalParameters_15_0= ruleParameter ) ) )* ) ) ) ) )+ {...}?) ) ) otherlv_16= '}' )
            // InternalPanoptesX.g:1870:3: () otherlv_1= 'HigherOrderAlgorithm' ( ( (lv_name_2_1= RULE_STRING | lv_name_2_2= RULE_SAFESTRING ) ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'codebase' ( ( (lv_codebase_6_1= RULE_STRING | lv_codebase_6_2= RULE_SAFESTRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'runtime' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'severity' otherlv_10= 'levels' ( (lv_driftLevels_11_0= ruleEIntegerObject ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'parameters' ( (lv_additionalParameters_13_0= ruleParameter ) ) (otherlv_14= ',' ( (lv_additionalParameters_15_0= ruleParameter ) ) )* ) ) ) ) )+ {...}?) ) ) otherlv_16= '}'
            {
            // InternalPanoptesX.g:1870:3: ()
            // InternalPanoptesX.g:1871:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getHigherOrderAlgorithmAccess().getHigherOrderAlgorithmAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,40,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getHigherOrderAlgorithmAccess().getHigherOrderAlgorithmKeyword_1());
            		
            // InternalPanoptesX.g:1881:3: ( ( (lv_name_2_1= RULE_STRING | lv_name_2_2= RULE_SAFESTRING ) ) )
            // InternalPanoptesX.g:1882:4: ( (lv_name_2_1= RULE_STRING | lv_name_2_2= RULE_SAFESTRING ) )
            {
            // InternalPanoptesX.g:1882:4: ( (lv_name_2_1= RULE_STRING | lv_name_2_2= RULE_SAFESTRING ) )
            // InternalPanoptesX.g:1883:5: (lv_name_2_1= RULE_STRING | lv_name_2_2= RULE_SAFESTRING )
            {
            // InternalPanoptesX.g:1883:5: (lv_name_2_1= RULE_STRING | lv_name_2_2= RULE_SAFESTRING )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_STRING) ) {
                alt34=1;
            }
            else if ( (LA34_0==RULE_SAFESTRING) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalPanoptesX.g:1884:6: lv_name_2_1= RULE_STRING
                    {
                    lv_name_2_1=(Token)match(input,RULE_STRING,FOLLOW_5); 

                    						newLeafNode(lv_name_2_1, grammarAccess.getHigherOrderAlgorithmAccess().getNameSTRINGTerminalRuleCall_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getHigherOrderAlgorithmRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_2_1,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }
                    break;
                case 2 :
                    // InternalPanoptesX.g:1899:6: lv_name_2_2= RULE_SAFESTRING
                    {
                    lv_name_2_2=(Token)match(input,RULE_SAFESTRING,FOLLOW_5); 

                    						newLeafNode(lv_name_2_2, grammarAccess.getHigherOrderAlgorithmAccess().getNameSAFESTRINGTerminalRuleCall_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getHigherOrderAlgorithmRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_2_2,
                    							"org.lowcomote.panoptes.PanoptesX.SAFESTRING");
                    					

                    }
                    break;

            }


            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_33); 

            			newLeafNode(otherlv_3, grammarAccess.getHigherOrderAlgorithmAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalPanoptesX.g:1920:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'codebase' ( ( (lv_codebase_6_1= RULE_STRING | lv_codebase_6_2= RULE_SAFESTRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'runtime' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'severity' otherlv_10= 'levels' ( (lv_driftLevels_11_0= ruleEIntegerObject ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'parameters' ( (lv_additionalParameters_13_0= ruleParameter ) ) (otherlv_14= ',' ( (lv_additionalParameters_15_0= ruleParameter ) ) )* ) ) ) ) )+ {...}?) ) )
            // InternalPanoptesX.g:1921:4: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'codebase' ( ( (lv_codebase_6_1= RULE_STRING | lv_codebase_6_2= RULE_SAFESTRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'runtime' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'severity' otherlv_10= 'levels' ( (lv_driftLevels_11_0= ruleEIntegerObject ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'parameters' ( (lv_additionalParameters_13_0= ruleParameter ) ) (otherlv_14= ',' ( (lv_additionalParameters_15_0= ruleParameter ) ) )* ) ) ) ) )+ {...}?) )
            {
            // InternalPanoptesX.g:1921:4: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'codebase' ( ( (lv_codebase_6_1= RULE_STRING | lv_codebase_6_2= RULE_SAFESTRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'runtime' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'severity' otherlv_10= 'levels' ( (lv_driftLevels_11_0= ruleEIntegerObject ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'parameters' ( (lv_additionalParameters_13_0= ruleParameter ) ) (otherlv_14= ',' ( (lv_additionalParameters_15_0= ruleParameter ) ) )* ) ) ) ) )+ {...}?) )
            // InternalPanoptesX.g:1922:5: ( ( ({...}? => ( ({...}? => (otherlv_5= 'codebase' ( ( (lv_codebase_6_1= RULE_STRING | lv_codebase_6_2= RULE_SAFESTRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'runtime' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'severity' otherlv_10= 'levels' ( (lv_driftLevels_11_0= ruleEIntegerObject ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'parameters' ( (lv_additionalParameters_13_0= ruleParameter ) ) (otherlv_14= ',' ( (lv_additionalParameters_15_0= ruleParameter ) ) )* ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getHigherOrderAlgorithmAccess().getUnorderedGroup_4());
            				
            // InternalPanoptesX.g:1925:5: ( ( ({...}? => ( ({...}? => (otherlv_5= 'codebase' ( ( (lv_codebase_6_1= RULE_STRING | lv_codebase_6_2= RULE_SAFESTRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'runtime' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'severity' otherlv_10= 'levels' ( (lv_driftLevels_11_0= ruleEIntegerObject ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'parameters' ( (lv_additionalParameters_13_0= ruleParameter ) ) (otherlv_14= ',' ( (lv_additionalParameters_15_0= ruleParameter ) ) )* ) ) ) ) )+ {...}?)
            // InternalPanoptesX.g:1926:6: ( ({...}? => ( ({...}? => (otherlv_5= 'codebase' ( ( (lv_codebase_6_1= RULE_STRING | lv_codebase_6_2= RULE_SAFESTRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'runtime' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'severity' otherlv_10= 'levels' ( (lv_driftLevels_11_0= ruleEIntegerObject ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'parameters' ( (lv_additionalParameters_13_0= ruleParameter ) ) (otherlv_14= ',' ( (lv_additionalParameters_15_0= ruleParameter ) ) )* ) ) ) ) )+ {...}?
            {
            // InternalPanoptesX.g:1926:6: ( ({...}? => ( ({...}? => (otherlv_5= 'codebase' ( ( (lv_codebase_6_1= RULE_STRING | lv_codebase_6_2= RULE_SAFESTRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'runtime' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'severity' otherlv_10= 'levels' ( (lv_driftLevels_11_0= ruleEIntegerObject ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'parameters' ( (lv_additionalParameters_13_0= ruleParameter ) ) (otherlv_14= ',' ( (lv_additionalParameters_15_0= ruleParameter ) ) )* ) ) ) ) )+
            int cnt37=0;
            loop37:
            do {
                int alt37=5;
                int LA37_0 = input.LA(1);

                if ( LA37_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getHigherOrderAlgorithmAccess().getUnorderedGroup_4(), 0) ) {
                    alt37=1;
                }
                else if ( LA37_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getHigherOrderAlgorithmAccess().getUnorderedGroup_4(), 1) ) {
                    alt37=2;
                }
                else if ( LA37_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getHigherOrderAlgorithmAccess().getUnorderedGroup_4(), 2) ) {
                    alt37=3;
                }
                else if ( LA37_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getHigherOrderAlgorithmAccess().getUnorderedGroup_4(), 3) ) {
                    alt37=4;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalPanoptesX.g:1927:4: ({...}? => ( ({...}? => (otherlv_5= 'codebase' ( ( (lv_codebase_6_1= RULE_STRING | lv_codebase_6_2= RULE_SAFESTRING ) ) ) ) ) ) )
            	    {
            	    // InternalPanoptesX.g:1927:4: ({...}? => ( ({...}? => (otherlv_5= 'codebase' ( ( (lv_codebase_6_1= RULE_STRING | lv_codebase_6_2= RULE_SAFESTRING ) ) ) ) ) ) )
            	    // InternalPanoptesX.g:1928:5: {...}? => ( ({...}? => (otherlv_5= 'codebase' ( ( (lv_codebase_6_1= RULE_STRING | lv_codebase_6_2= RULE_SAFESTRING ) ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getHigherOrderAlgorithmAccess().getUnorderedGroup_4(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleHigherOrderAlgorithm", "getUnorderedGroupHelper().canSelect(grammarAccess.getHigherOrderAlgorithmAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // InternalPanoptesX.g:1928:117: ( ({...}? => (otherlv_5= 'codebase' ( ( (lv_codebase_6_1= RULE_STRING | lv_codebase_6_2= RULE_SAFESTRING ) ) ) ) ) )
            	    // InternalPanoptesX.g:1929:6: ({...}? => (otherlv_5= 'codebase' ( ( (lv_codebase_6_1= RULE_STRING | lv_codebase_6_2= RULE_SAFESTRING ) ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getHigherOrderAlgorithmAccess().getUnorderedGroup_4(), 0);
            	    					
            	    // InternalPanoptesX.g:1932:9: ({...}? => (otherlv_5= 'codebase' ( ( (lv_codebase_6_1= RULE_STRING | lv_codebase_6_2= RULE_SAFESTRING ) ) ) ) )
            	    // InternalPanoptesX.g:1932:10: {...}? => (otherlv_5= 'codebase' ( ( (lv_codebase_6_1= RULE_STRING | lv_codebase_6_2= RULE_SAFESTRING ) ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleHigherOrderAlgorithm", "true");
            	    }
            	    // InternalPanoptesX.g:1932:19: (otherlv_5= 'codebase' ( ( (lv_codebase_6_1= RULE_STRING | lv_codebase_6_2= RULE_SAFESTRING ) ) ) )
            	    // InternalPanoptesX.g:1932:20: otherlv_5= 'codebase' ( ( (lv_codebase_6_1= RULE_STRING | lv_codebase_6_2= RULE_SAFESTRING ) ) )
            	    {
            	    otherlv_5=(Token)match(input,33,FOLLOW_4); 

            	    									newLeafNode(otherlv_5, grammarAccess.getHigherOrderAlgorithmAccess().getCodebaseKeyword_4_0_0());
            	    								
            	    // InternalPanoptesX.g:1936:9: ( ( (lv_codebase_6_1= RULE_STRING | lv_codebase_6_2= RULE_SAFESTRING ) ) )
            	    // InternalPanoptesX.g:1937:10: ( (lv_codebase_6_1= RULE_STRING | lv_codebase_6_2= RULE_SAFESTRING ) )
            	    {
            	    // InternalPanoptesX.g:1937:10: ( (lv_codebase_6_1= RULE_STRING | lv_codebase_6_2= RULE_SAFESTRING ) )
            	    // InternalPanoptesX.g:1938:11: (lv_codebase_6_1= RULE_STRING | lv_codebase_6_2= RULE_SAFESTRING )
            	    {
            	    // InternalPanoptesX.g:1938:11: (lv_codebase_6_1= RULE_STRING | lv_codebase_6_2= RULE_SAFESTRING )
            	    int alt35=2;
            	    int LA35_0 = input.LA(1);

            	    if ( (LA35_0==RULE_STRING) ) {
            	        alt35=1;
            	    }
            	    else if ( (LA35_0==RULE_SAFESTRING) ) {
            	        alt35=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 35, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt35) {
            	        case 1 :
            	            // InternalPanoptesX.g:1939:12: lv_codebase_6_1= RULE_STRING
            	            {
            	            lv_codebase_6_1=(Token)match(input,RULE_STRING,FOLLOW_34); 

            	            												newLeafNode(lv_codebase_6_1, grammarAccess.getHigherOrderAlgorithmAccess().getCodebaseSTRINGTerminalRuleCall_4_0_1_0_0());
            	            											

            	            												if (current==null) {
            	            													current = createModelElement(grammarAccess.getHigherOrderAlgorithmRule());
            	            												}
            	            												setWithLastConsumed(
            	            													current,
            	            													"codebase",
            	            													lv_codebase_6_1,
            	            													"org.eclipse.xtext.common.Terminals.STRING");
            	            											

            	            }
            	            break;
            	        case 2 :
            	            // InternalPanoptesX.g:1954:12: lv_codebase_6_2= RULE_SAFESTRING
            	            {
            	            lv_codebase_6_2=(Token)match(input,RULE_SAFESTRING,FOLLOW_34); 

            	            												newLeafNode(lv_codebase_6_2, grammarAccess.getHigherOrderAlgorithmAccess().getCodebaseSAFESTRINGTerminalRuleCall_4_0_1_0_1());
            	            											

            	            												if (current==null) {
            	            													current = createModelElement(grammarAccess.getHigherOrderAlgorithmRule());
            	            												}
            	            												setWithLastConsumed(
            	            													current,
            	            													"codebase",
            	            													lv_codebase_6_2,
            	            													"org.lowcomote.panoptes.PanoptesX.SAFESTRING");
            	            											

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getHigherOrderAlgorithmAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalPanoptesX.g:1977:4: ({...}? => ( ({...}? => (otherlv_7= 'runtime' ( ( ruleEString ) ) ) ) ) )
            	    {
            	    // InternalPanoptesX.g:1977:4: ({...}? => ( ({...}? => (otherlv_7= 'runtime' ( ( ruleEString ) ) ) ) ) )
            	    // InternalPanoptesX.g:1978:5: {...}? => ( ({...}? => (otherlv_7= 'runtime' ( ( ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getHigherOrderAlgorithmAccess().getUnorderedGroup_4(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleHigherOrderAlgorithm", "getUnorderedGroupHelper().canSelect(grammarAccess.getHigherOrderAlgorithmAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // InternalPanoptesX.g:1978:117: ( ({...}? => (otherlv_7= 'runtime' ( ( ruleEString ) ) ) ) )
            	    // InternalPanoptesX.g:1979:6: ({...}? => (otherlv_7= 'runtime' ( ( ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getHigherOrderAlgorithmAccess().getUnorderedGroup_4(), 1);
            	    					
            	    // InternalPanoptesX.g:1982:9: ({...}? => (otherlv_7= 'runtime' ( ( ruleEString ) ) ) )
            	    // InternalPanoptesX.g:1982:10: {...}? => (otherlv_7= 'runtime' ( ( ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleHigherOrderAlgorithm", "true");
            	    }
            	    // InternalPanoptesX.g:1982:19: (otherlv_7= 'runtime' ( ( ruleEString ) ) )
            	    // InternalPanoptesX.g:1982:20: otherlv_7= 'runtime' ( ( ruleEString ) )
            	    {
            	    otherlv_7=(Token)match(input,34,FOLLOW_7); 

            	    									newLeafNode(otherlv_7, grammarAccess.getHigherOrderAlgorithmAccess().getRuntimeKeyword_4_1_0());
            	    								
            	    // InternalPanoptesX.g:1986:9: ( ( ruleEString ) )
            	    // InternalPanoptesX.g:1987:10: ( ruleEString )
            	    {
            	    // InternalPanoptesX.g:1987:10: ( ruleEString )
            	    // InternalPanoptesX.g:1988:11: ruleEString
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getHigherOrderAlgorithmRule());
            	    											}
            	    										

            	    											newCompositeNode(grammarAccess.getHigherOrderAlgorithmAccess().getRuntimeHigherOrderAlgorithmRuntimeCrossReference_4_1_1_0());
            	    										
            	    pushFollow(FOLLOW_34);
            	    ruleEString();

            	    state._fsp--;


            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getHigherOrderAlgorithmAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalPanoptesX.g:2008:4: ({...}? => ( ({...}? => (otherlv_9= 'severity' otherlv_10= 'levels' ( (lv_driftLevels_11_0= ruleEIntegerObject ) ) ) ) ) )
            	    {
            	    // InternalPanoptesX.g:2008:4: ({...}? => ( ({...}? => (otherlv_9= 'severity' otherlv_10= 'levels' ( (lv_driftLevels_11_0= ruleEIntegerObject ) ) ) ) ) )
            	    // InternalPanoptesX.g:2009:5: {...}? => ( ({...}? => (otherlv_9= 'severity' otherlv_10= 'levels' ( (lv_driftLevels_11_0= ruleEIntegerObject ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getHigherOrderAlgorithmAccess().getUnorderedGroup_4(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleHigherOrderAlgorithm", "getUnorderedGroupHelper().canSelect(grammarAccess.getHigherOrderAlgorithmAccess().getUnorderedGroup_4(), 2)");
            	    }
            	    // InternalPanoptesX.g:2009:117: ( ({...}? => (otherlv_9= 'severity' otherlv_10= 'levels' ( (lv_driftLevels_11_0= ruleEIntegerObject ) ) ) ) )
            	    // InternalPanoptesX.g:2010:6: ({...}? => (otherlv_9= 'severity' otherlv_10= 'levels' ( (lv_driftLevels_11_0= ruleEIntegerObject ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getHigherOrderAlgorithmAccess().getUnorderedGroup_4(), 2);
            	    					
            	    // InternalPanoptesX.g:2013:9: ({...}? => (otherlv_9= 'severity' otherlv_10= 'levels' ( (lv_driftLevels_11_0= ruleEIntegerObject ) ) ) )
            	    // InternalPanoptesX.g:2013:10: {...}? => (otherlv_9= 'severity' otherlv_10= 'levels' ( (lv_driftLevels_11_0= ruleEIntegerObject ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleHigherOrderAlgorithm", "true");
            	    }
            	    // InternalPanoptesX.g:2013:19: (otherlv_9= 'severity' otherlv_10= 'levels' ( (lv_driftLevels_11_0= ruleEIntegerObject ) ) )
            	    // InternalPanoptesX.g:2013:20: otherlv_9= 'severity' otherlv_10= 'levels' ( (lv_driftLevels_11_0= ruleEIntegerObject ) )
            	    {
            	    otherlv_9=(Token)match(input,35,FOLLOW_28); 

            	    									newLeafNode(otherlv_9, grammarAccess.getHigherOrderAlgorithmAccess().getSeverityKeyword_4_2_0());
            	    								
            	    otherlv_10=(Token)match(input,36,FOLLOW_29); 

            	    									newLeafNode(otherlv_10, grammarAccess.getHigherOrderAlgorithmAccess().getLevelsKeyword_4_2_1());
            	    								
            	    // InternalPanoptesX.g:2021:9: ( (lv_driftLevels_11_0= ruleEIntegerObject ) )
            	    // InternalPanoptesX.g:2022:10: (lv_driftLevels_11_0= ruleEIntegerObject )
            	    {
            	    // InternalPanoptesX.g:2022:10: (lv_driftLevels_11_0= ruleEIntegerObject )
            	    // InternalPanoptesX.g:2023:11: lv_driftLevels_11_0= ruleEIntegerObject
            	    {

            	    											newCompositeNode(grammarAccess.getHigherOrderAlgorithmAccess().getDriftLevelsEIntegerObjectParserRuleCall_4_2_2_0());
            	    										
            	    pushFollow(FOLLOW_34);
            	    lv_driftLevels_11_0=ruleEIntegerObject();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getHigherOrderAlgorithmRule());
            	    											}
            	    											set(
            	    												current,
            	    												"driftLevels",
            	    												lv_driftLevels_11_0,
            	    												"org.lowcomote.panoptes.PanoptesX.EIntegerObject");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getHigherOrderAlgorithmAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalPanoptesX.g:2046:4: ({...}? => ( ({...}? => (otherlv_12= 'parameters' ( (lv_additionalParameters_13_0= ruleParameter ) ) (otherlv_14= ',' ( (lv_additionalParameters_15_0= ruleParameter ) ) )* ) ) ) )
            	    {
            	    // InternalPanoptesX.g:2046:4: ({...}? => ( ({...}? => (otherlv_12= 'parameters' ( (lv_additionalParameters_13_0= ruleParameter ) ) (otherlv_14= ',' ( (lv_additionalParameters_15_0= ruleParameter ) ) )* ) ) ) )
            	    // InternalPanoptesX.g:2047:5: {...}? => ( ({...}? => (otherlv_12= 'parameters' ( (lv_additionalParameters_13_0= ruleParameter ) ) (otherlv_14= ',' ( (lv_additionalParameters_15_0= ruleParameter ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getHigherOrderAlgorithmAccess().getUnorderedGroup_4(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleHigherOrderAlgorithm", "getUnorderedGroupHelper().canSelect(grammarAccess.getHigherOrderAlgorithmAccess().getUnorderedGroup_4(), 3)");
            	    }
            	    // InternalPanoptesX.g:2047:117: ( ({...}? => (otherlv_12= 'parameters' ( (lv_additionalParameters_13_0= ruleParameter ) ) (otherlv_14= ',' ( (lv_additionalParameters_15_0= ruleParameter ) ) )* ) ) )
            	    // InternalPanoptesX.g:2048:6: ({...}? => (otherlv_12= 'parameters' ( (lv_additionalParameters_13_0= ruleParameter ) ) (otherlv_14= ',' ( (lv_additionalParameters_15_0= ruleParameter ) ) )* ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getHigherOrderAlgorithmAccess().getUnorderedGroup_4(), 3);
            	    					
            	    // InternalPanoptesX.g:2051:9: ({...}? => (otherlv_12= 'parameters' ( (lv_additionalParameters_13_0= ruleParameter ) ) (otherlv_14= ',' ( (lv_additionalParameters_15_0= ruleParameter ) ) )* ) )
            	    // InternalPanoptesX.g:2051:10: {...}? => (otherlv_12= 'parameters' ( (lv_additionalParameters_13_0= ruleParameter ) ) (otherlv_14= ',' ( (lv_additionalParameters_15_0= ruleParameter ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleHigherOrderAlgorithm", "true");
            	    }
            	    // InternalPanoptesX.g:2051:19: (otherlv_12= 'parameters' ( (lv_additionalParameters_13_0= ruleParameter ) ) (otherlv_14= ',' ( (lv_additionalParameters_15_0= ruleParameter ) ) )* )
            	    // InternalPanoptesX.g:2051:20: otherlv_12= 'parameters' ( (lv_additionalParameters_13_0= ruleParameter ) ) (otherlv_14= ',' ( (lv_additionalParameters_15_0= ruleParameter ) ) )*
            	    {
            	    otherlv_12=(Token)match(input,39,FOLLOW_32); 

            	    									newLeafNode(otherlv_12, grammarAccess.getHigherOrderAlgorithmAccess().getParametersKeyword_4_3_0());
            	    								
            	    // InternalPanoptesX.g:2055:9: ( (lv_additionalParameters_13_0= ruleParameter ) )
            	    // InternalPanoptesX.g:2056:10: (lv_additionalParameters_13_0= ruleParameter )
            	    {
            	    // InternalPanoptesX.g:2056:10: (lv_additionalParameters_13_0= ruleParameter )
            	    // InternalPanoptesX.g:2057:11: lv_additionalParameters_13_0= ruleParameter
            	    {

            	    											newCompositeNode(grammarAccess.getHigherOrderAlgorithmAccess().getAdditionalParametersParameterParserRuleCall_4_3_1_0());
            	    										
            	    pushFollow(FOLLOW_35);
            	    lv_additionalParameters_13_0=ruleParameter();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getHigherOrderAlgorithmRule());
            	    											}
            	    											add(
            	    												current,
            	    												"additionalParameters",
            	    												lv_additionalParameters_13_0,
            	    												"org.lowcomote.panoptes.PanoptesX.Parameter");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalPanoptesX.g:2074:9: (otherlv_14= ',' ( (lv_additionalParameters_15_0= ruleParameter ) ) )*
            	    loop36:
            	    do {
            	        int alt36=2;
            	        int LA36_0 = input.LA(1);

            	        if ( (LA36_0==16) ) {
            	            alt36=1;
            	        }


            	        switch (alt36) {
            	    	case 1 :
            	    	    // InternalPanoptesX.g:2075:10: otherlv_14= ',' ( (lv_additionalParameters_15_0= ruleParameter ) )
            	    	    {
            	    	    otherlv_14=(Token)match(input,16,FOLLOW_32); 

            	    	    										newLeafNode(otherlv_14, grammarAccess.getHigherOrderAlgorithmAccess().getCommaKeyword_4_3_2_0());
            	    	    									
            	    	    // InternalPanoptesX.g:2079:10: ( (lv_additionalParameters_15_0= ruleParameter ) )
            	    	    // InternalPanoptesX.g:2080:11: (lv_additionalParameters_15_0= ruleParameter )
            	    	    {
            	    	    // InternalPanoptesX.g:2080:11: (lv_additionalParameters_15_0= ruleParameter )
            	    	    // InternalPanoptesX.g:2081:12: lv_additionalParameters_15_0= ruleParameter
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getHigherOrderAlgorithmAccess().getAdditionalParametersParameterParserRuleCall_4_3_2_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_35);
            	    	    lv_additionalParameters_15_0=ruleParameter();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getHigherOrderAlgorithmRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"additionalParameters",
            	    	    													lv_additionalParameters_15_0,
            	    	    													"org.lowcomote.panoptes.PanoptesX.Parameter");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop36;
            	        }
            	    } while (true);


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getHigherOrderAlgorithmAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt37 >= 1 ) break loop37;
                        EarlyExitException eee =
                            new EarlyExitException(37, input);
                        throw eee;
                }
                cnt37++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getHigherOrderAlgorithmAccess().getUnorderedGroup_4()) ) {
                throw new FailedPredicateException(input, "ruleHigherOrderAlgorithm", "getUnorderedGroupHelper().canLeave(grammarAccess.getHigherOrderAlgorithmAccess().getUnorderedGroup_4())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getHigherOrderAlgorithmAccess().getUnorderedGroup_4());
            				

            }

            otherlv_16=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getHigherOrderAlgorithmAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleHigherOrderAlgorithm"


    // $ANTLR start "entryRuleAlgorithmRuntime"
    // InternalPanoptesX.g:2121:1: entryRuleAlgorithmRuntime returns [EObject current=null] : iv_ruleAlgorithmRuntime= ruleAlgorithmRuntime EOF ;
    public final EObject entryRuleAlgorithmRuntime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlgorithmRuntime = null;


        try {
            // InternalPanoptesX.g:2121:57: (iv_ruleAlgorithmRuntime= ruleAlgorithmRuntime EOF )
            // InternalPanoptesX.g:2122:2: iv_ruleAlgorithmRuntime= ruleAlgorithmRuntime EOF
            {
             newCompositeNode(grammarAccess.getAlgorithmRuntimeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlgorithmRuntime=ruleAlgorithmRuntime();

            state._fsp--;

             current =iv_ruleAlgorithmRuntime; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAlgorithmRuntime"


    // $ANTLR start "ruleAlgorithmRuntime"
    // InternalPanoptesX.g:2128:1: ruleAlgorithmRuntime returns [EObject current=null] : (this_BaseAlgorithmRuntime_0= ruleBaseAlgorithmRuntime | this_HigherOrderAlgorithmRuntime_1= ruleHigherOrderAlgorithmRuntime ) ;
    public final EObject ruleAlgorithmRuntime() throws RecognitionException {
        EObject current = null;

        EObject this_BaseAlgorithmRuntime_0 = null;

        EObject this_HigherOrderAlgorithmRuntime_1 = null;



        	enterRule();

        try {
            // InternalPanoptesX.g:2134:2: ( (this_BaseAlgorithmRuntime_0= ruleBaseAlgorithmRuntime | this_HigherOrderAlgorithmRuntime_1= ruleHigherOrderAlgorithmRuntime ) )
            // InternalPanoptesX.g:2135:2: (this_BaseAlgorithmRuntime_0= ruleBaseAlgorithmRuntime | this_HigherOrderAlgorithmRuntime_1= ruleHigherOrderAlgorithmRuntime )
            {
            // InternalPanoptesX.g:2135:2: (this_BaseAlgorithmRuntime_0= ruleBaseAlgorithmRuntime | this_HigherOrderAlgorithmRuntime_1= ruleHigherOrderAlgorithmRuntime )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==41) ) {
                alt38=1;
            }
            else if ( (LA38_0==43) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalPanoptesX.g:2136:3: this_BaseAlgorithmRuntime_0= ruleBaseAlgorithmRuntime
                    {

                    			newCompositeNode(grammarAccess.getAlgorithmRuntimeAccess().getBaseAlgorithmRuntimeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_BaseAlgorithmRuntime_0=ruleBaseAlgorithmRuntime();

                    state._fsp--;


                    			current = this_BaseAlgorithmRuntime_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPanoptesX.g:2145:3: this_HigherOrderAlgorithmRuntime_1= ruleHigherOrderAlgorithmRuntime
                    {

                    			newCompositeNode(grammarAccess.getAlgorithmRuntimeAccess().getHigherOrderAlgorithmRuntimeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_HigherOrderAlgorithmRuntime_1=ruleHigherOrderAlgorithmRuntime();

                    state._fsp--;


                    			current = this_HigherOrderAlgorithmRuntime_1;
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
    // $ANTLR end "ruleAlgorithmRuntime"


    // $ANTLR start "entryRuleBaseAlgorithmRuntime"
    // InternalPanoptesX.g:2157:1: entryRuleBaseAlgorithmRuntime returns [EObject current=null] : iv_ruleBaseAlgorithmRuntime= ruleBaseAlgorithmRuntime EOF ;
    public final EObject entryRuleBaseAlgorithmRuntime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaseAlgorithmRuntime = null;


        try {
            // InternalPanoptesX.g:2157:61: (iv_ruleBaseAlgorithmRuntime= ruleBaseAlgorithmRuntime EOF )
            // InternalPanoptesX.g:2158:2: iv_ruleBaseAlgorithmRuntime= ruleBaseAlgorithmRuntime EOF
            {
             newCompositeNode(grammarAccess.getBaseAlgorithmRuntimeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBaseAlgorithmRuntime=ruleBaseAlgorithmRuntime();

            state._fsp--;

             current =iv_ruleBaseAlgorithmRuntime; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBaseAlgorithmRuntime"


    // $ANTLR start "ruleBaseAlgorithmRuntime"
    // InternalPanoptesX.g:2164:1: ruleBaseAlgorithmRuntime returns [EObject current=null] : ( () otherlv_1= 'BaseAlgorithmRuntime' ( ( (lv_name_2_1= RULE_STRING | lv_name_2_2= RULE_SAFESTRING ) ) ) (otherlv_3= '{' otherlv_4= 'endpoint' ( ( (lv_endpoint_5_1= RULE_STRING | lv_endpoint_5_2= RULE_SAFESTRING ) ) ) otherlv_6= '}' )? ) ;
    public final EObject ruleBaseAlgorithmRuntime() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_1=null;
        Token lv_name_2_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_endpoint_5_1=null;
        Token lv_endpoint_5_2=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalPanoptesX.g:2170:2: ( ( () otherlv_1= 'BaseAlgorithmRuntime' ( ( (lv_name_2_1= RULE_STRING | lv_name_2_2= RULE_SAFESTRING ) ) ) (otherlv_3= '{' otherlv_4= 'endpoint' ( ( (lv_endpoint_5_1= RULE_STRING | lv_endpoint_5_2= RULE_SAFESTRING ) ) ) otherlv_6= '}' )? ) )
            // InternalPanoptesX.g:2171:2: ( () otherlv_1= 'BaseAlgorithmRuntime' ( ( (lv_name_2_1= RULE_STRING | lv_name_2_2= RULE_SAFESTRING ) ) ) (otherlv_3= '{' otherlv_4= 'endpoint' ( ( (lv_endpoint_5_1= RULE_STRING | lv_endpoint_5_2= RULE_SAFESTRING ) ) ) otherlv_6= '}' )? )
            {
            // InternalPanoptesX.g:2171:2: ( () otherlv_1= 'BaseAlgorithmRuntime' ( ( (lv_name_2_1= RULE_STRING | lv_name_2_2= RULE_SAFESTRING ) ) ) (otherlv_3= '{' otherlv_4= 'endpoint' ( ( (lv_endpoint_5_1= RULE_STRING | lv_endpoint_5_2= RULE_SAFESTRING ) ) ) otherlv_6= '}' )? )
            // InternalPanoptesX.g:2172:3: () otherlv_1= 'BaseAlgorithmRuntime' ( ( (lv_name_2_1= RULE_STRING | lv_name_2_2= RULE_SAFESTRING ) ) ) (otherlv_3= '{' otherlv_4= 'endpoint' ( ( (lv_endpoint_5_1= RULE_STRING | lv_endpoint_5_2= RULE_SAFESTRING ) ) ) otherlv_6= '}' )?
            {
            // InternalPanoptesX.g:2172:3: ()
            // InternalPanoptesX.g:2173:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBaseAlgorithmRuntimeAccess().getBaseAlgorithmRuntimeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,41,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getBaseAlgorithmRuntimeAccess().getBaseAlgorithmRuntimeKeyword_1());
            		
            // InternalPanoptesX.g:2183:3: ( ( (lv_name_2_1= RULE_STRING | lv_name_2_2= RULE_SAFESTRING ) ) )
            // InternalPanoptesX.g:2184:4: ( (lv_name_2_1= RULE_STRING | lv_name_2_2= RULE_SAFESTRING ) )
            {
            // InternalPanoptesX.g:2184:4: ( (lv_name_2_1= RULE_STRING | lv_name_2_2= RULE_SAFESTRING ) )
            // InternalPanoptesX.g:2185:5: (lv_name_2_1= RULE_STRING | lv_name_2_2= RULE_SAFESTRING )
            {
            // InternalPanoptesX.g:2185:5: (lv_name_2_1= RULE_STRING | lv_name_2_2= RULE_SAFESTRING )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_STRING) ) {
                alt39=1;
            }
            else if ( (LA39_0==RULE_SAFESTRING) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // InternalPanoptesX.g:2186:6: lv_name_2_1= RULE_STRING
                    {
                    lv_name_2_1=(Token)match(input,RULE_STRING,FOLLOW_17); 

                    						newLeafNode(lv_name_2_1, grammarAccess.getBaseAlgorithmRuntimeAccess().getNameSTRINGTerminalRuleCall_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBaseAlgorithmRuntimeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_2_1,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }
                    break;
                case 2 :
                    // InternalPanoptesX.g:2201:6: lv_name_2_2= RULE_SAFESTRING
                    {
                    lv_name_2_2=(Token)match(input,RULE_SAFESTRING,FOLLOW_17); 

                    						newLeafNode(lv_name_2_2, grammarAccess.getBaseAlgorithmRuntimeAccess().getNameSAFESTRINGTerminalRuleCall_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBaseAlgorithmRuntimeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_2_2,
                    							"org.lowcomote.panoptes.PanoptesX.SAFESTRING");
                    					

                    }
                    break;

            }


            }


            }

            // InternalPanoptesX.g:2218:3: (otherlv_3= '{' otherlv_4= 'endpoint' ( ( (lv_endpoint_5_1= RULE_STRING | lv_endpoint_5_2= RULE_SAFESTRING ) ) ) otherlv_6= '}' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==14) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalPanoptesX.g:2219:4: otherlv_3= '{' otherlv_4= 'endpoint' ( ( (lv_endpoint_5_1= RULE_STRING | lv_endpoint_5_2= RULE_SAFESTRING ) ) ) otherlv_6= '}'
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_36); 

                    				newLeafNode(otherlv_3, grammarAccess.getBaseAlgorithmRuntimeAccess().getLeftCurlyBracketKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,42,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getBaseAlgorithmRuntimeAccess().getEndpointKeyword_3_1());
                    			
                    // InternalPanoptesX.g:2227:4: ( ( (lv_endpoint_5_1= RULE_STRING | lv_endpoint_5_2= RULE_SAFESTRING ) ) )
                    // InternalPanoptesX.g:2228:5: ( (lv_endpoint_5_1= RULE_STRING | lv_endpoint_5_2= RULE_SAFESTRING ) )
                    {
                    // InternalPanoptesX.g:2228:5: ( (lv_endpoint_5_1= RULE_STRING | lv_endpoint_5_2= RULE_SAFESTRING ) )
                    // InternalPanoptesX.g:2229:6: (lv_endpoint_5_1= RULE_STRING | lv_endpoint_5_2= RULE_SAFESTRING )
                    {
                    // InternalPanoptesX.g:2229:6: (lv_endpoint_5_1= RULE_STRING | lv_endpoint_5_2= RULE_SAFESTRING )
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==RULE_STRING) ) {
                        alt40=1;
                    }
                    else if ( (LA40_0==RULE_SAFESTRING) ) {
                        alt40=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 40, 0, input);

                        throw nvae;
                    }
                    switch (alt40) {
                        case 1 :
                            // InternalPanoptesX.g:2230:7: lv_endpoint_5_1= RULE_STRING
                            {
                            lv_endpoint_5_1=(Token)match(input,RULE_STRING,FOLLOW_37); 

                            							newLeafNode(lv_endpoint_5_1, grammarAccess.getBaseAlgorithmRuntimeAccess().getEndpointSTRINGTerminalRuleCall_3_2_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getBaseAlgorithmRuntimeRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"endpoint",
                            								lv_endpoint_5_1,
                            								"org.eclipse.xtext.common.Terminals.STRING");
                            						

                            }
                            break;
                        case 2 :
                            // InternalPanoptesX.g:2245:7: lv_endpoint_5_2= RULE_SAFESTRING
                            {
                            lv_endpoint_5_2=(Token)match(input,RULE_SAFESTRING,FOLLOW_37); 

                            							newLeafNode(lv_endpoint_5_2, grammarAccess.getBaseAlgorithmRuntimeAccess().getEndpointSAFESTRINGTerminalRuleCall_3_2_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getBaseAlgorithmRuntimeRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"endpoint",
                            								lv_endpoint_5_2,
                            								"org.lowcomote.panoptes.PanoptesX.SAFESTRING");
                            						

                            }
                            break;

                    }


                    }


                    }

                    otherlv_6=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getBaseAlgorithmRuntimeAccess().getRightCurlyBracketKeyword_3_3());
                    			

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
    // $ANTLR end "ruleBaseAlgorithmRuntime"


    // $ANTLR start "entryRuleHigherOrderAlgorithmRuntime"
    // InternalPanoptesX.g:2271:1: entryRuleHigherOrderAlgorithmRuntime returns [EObject current=null] : iv_ruleHigherOrderAlgorithmRuntime= ruleHigherOrderAlgorithmRuntime EOF ;
    public final EObject entryRuleHigherOrderAlgorithmRuntime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHigherOrderAlgorithmRuntime = null;


        try {
            // InternalPanoptesX.g:2271:68: (iv_ruleHigherOrderAlgorithmRuntime= ruleHigherOrderAlgorithmRuntime EOF )
            // InternalPanoptesX.g:2272:2: iv_ruleHigherOrderAlgorithmRuntime= ruleHigherOrderAlgorithmRuntime EOF
            {
             newCompositeNode(grammarAccess.getHigherOrderAlgorithmRuntimeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHigherOrderAlgorithmRuntime=ruleHigherOrderAlgorithmRuntime();

            state._fsp--;

             current =iv_ruleHigherOrderAlgorithmRuntime; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleHigherOrderAlgorithmRuntime"


    // $ANTLR start "ruleHigherOrderAlgorithmRuntime"
    // InternalPanoptesX.g:2278:1: ruleHigherOrderAlgorithmRuntime returns [EObject current=null] : ( () otherlv_1= 'HigherOrderAlgorithmRuntime' ( ( (lv_name_2_1= RULE_STRING | lv_name_2_2= RULE_SAFESTRING ) ) ) (otherlv_3= '{' otherlv_4= 'endpoint' ( ( (lv_endpoint_5_1= RULE_STRING | lv_endpoint_5_2= RULE_SAFESTRING ) ) ) otherlv_6= '}' )? ) ;
    public final EObject ruleHigherOrderAlgorithmRuntime() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_1=null;
        Token lv_name_2_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_endpoint_5_1=null;
        Token lv_endpoint_5_2=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalPanoptesX.g:2284:2: ( ( () otherlv_1= 'HigherOrderAlgorithmRuntime' ( ( (lv_name_2_1= RULE_STRING | lv_name_2_2= RULE_SAFESTRING ) ) ) (otherlv_3= '{' otherlv_4= 'endpoint' ( ( (lv_endpoint_5_1= RULE_STRING | lv_endpoint_5_2= RULE_SAFESTRING ) ) ) otherlv_6= '}' )? ) )
            // InternalPanoptesX.g:2285:2: ( () otherlv_1= 'HigherOrderAlgorithmRuntime' ( ( (lv_name_2_1= RULE_STRING | lv_name_2_2= RULE_SAFESTRING ) ) ) (otherlv_3= '{' otherlv_4= 'endpoint' ( ( (lv_endpoint_5_1= RULE_STRING | lv_endpoint_5_2= RULE_SAFESTRING ) ) ) otherlv_6= '}' )? )
            {
            // InternalPanoptesX.g:2285:2: ( () otherlv_1= 'HigherOrderAlgorithmRuntime' ( ( (lv_name_2_1= RULE_STRING | lv_name_2_2= RULE_SAFESTRING ) ) ) (otherlv_3= '{' otherlv_4= 'endpoint' ( ( (lv_endpoint_5_1= RULE_STRING | lv_endpoint_5_2= RULE_SAFESTRING ) ) ) otherlv_6= '}' )? )
            // InternalPanoptesX.g:2286:3: () otherlv_1= 'HigherOrderAlgorithmRuntime' ( ( (lv_name_2_1= RULE_STRING | lv_name_2_2= RULE_SAFESTRING ) ) ) (otherlv_3= '{' otherlv_4= 'endpoint' ( ( (lv_endpoint_5_1= RULE_STRING | lv_endpoint_5_2= RULE_SAFESTRING ) ) ) otherlv_6= '}' )?
            {
            // InternalPanoptesX.g:2286:3: ()
            // InternalPanoptesX.g:2287:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getHigherOrderAlgorithmRuntimeAccess().getHigherOrderAlgorithmRuntimeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,43,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getHigherOrderAlgorithmRuntimeAccess().getHigherOrderAlgorithmRuntimeKeyword_1());
            		
            // InternalPanoptesX.g:2297:3: ( ( (lv_name_2_1= RULE_STRING | lv_name_2_2= RULE_SAFESTRING ) ) )
            // InternalPanoptesX.g:2298:4: ( (lv_name_2_1= RULE_STRING | lv_name_2_2= RULE_SAFESTRING ) )
            {
            // InternalPanoptesX.g:2298:4: ( (lv_name_2_1= RULE_STRING | lv_name_2_2= RULE_SAFESTRING ) )
            // InternalPanoptesX.g:2299:5: (lv_name_2_1= RULE_STRING | lv_name_2_2= RULE_SAFESTRING )
            {
            // InternalPanoptesX.g:2299:5: (lv_name_2_1= RULE_STRING | lv_name_2_2= RULE_SAFESTRING )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_STRING) ) {
                alt42=1;
            }
            else if ( (LA42_0==RULE_SAFESTRING) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalPanoptesX.g:2300:6: lv_name_2_1= RULE_STRING
                    {
                    lv_name_2_1=(Token)match(input,RULE_STRING,FOLLOW_17); 

                    						newLeafNode(lv_name_2_1, grammarAccess.getHigherOrderAlgorithmRuntimeAccess().getNameSTRINGTerminalRuleCall_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getHigherOrderAlgorithmRuntimeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_2_1,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }
                    break;
                case 2 :
                    // InternalPanoptesX.g:2315:6: lv_name_2_2= RULE_SAFESTRING
                    {
                    lv_name_2_2=(Token)match(input,RULE_SAFESTRING,FOLLOW_17); 

                    						newLeafNode(lv_name_2_2, grammarAccess.getHigherOrderAlgorithmRuntimeAccess().getNameSAFESTRINGTerminalRuleCall_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getHigherOrderAlgorithmRuntimeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_2_2,
                    							"org.lowcomote.panoptes.PanoptesX.SAFESTRING");
                    					

                    }
                    break;

            }


            }


            }

            // InternalPanoptesX.g:2332:3: (otherlv_3= '{' otherlv_4= 'endpoint' ( ( (lv_endpoint_5_1= RULE_STRING | lv_endpoint_5_2= RULE_SAFESTRING ) ) ) otherlv_6= '}' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==14) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalPanoptesX.g:2333:4: otherlv_3= '{' otherlv_4= 'endpoint' ( ( (lv_endpoint_5_1= RULE_STRING | lv_endpoint_5_2= RULE_SAFESTRING ) ) ) otherlv_6= '}'
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_36); 

                    				newLeafNode(otherlv_3, grammarAccess.getHigherOrderAlgorithmRuntimeAccess().getLeftCurlyBracketKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,42,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getHigherOrderAlgorithmRuntimeAccess().getEndpointKeyword_3_1());
                    			
                    // InternalPanoptesX.g:2341:4: ( ( (lv_endpoint_5_1= RULE_STRING | lv_endpoint_5_2= RULE_SAFESTRING ) ) )
                    // InternalPanoptesX.g:2342:5: ( (lv_endpoint_5_1= RULE_STRING | lv_endpoint_5_2= RULE_SAFESTRING ) )
                    {
                    // InternalPanoptesX.g:2342:5: ( (lv_endpoint_5_1= RULE_STRING | lv_endpoint_5_2= RULE_SAFESTRING ) )
                    // InternalPanoptesX.g:2343:6: (lv_endpoint_5_1= RULE_STRING | lv_endpoint_5_2= RULE_SAFESTRING )
                    {
                    // InternalPanoptesX.g:2343:6: (lv_endpoint_5_1= RULE_STRING | lv_endpoint_5_2= RULE_SAFESTRING )
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==RULE_STRING) ) {
                        alt43=1;
                    }
                    else if ( (LA43_0==RULE_SAFESTRING) ) {
                        alt43=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 43, 0, input);

                        throw nvae;
                    }
                    switch (alt43) {
                        case 1 :
                            // InternalPanoptesX.g:2344:7: lv_endpoint_5_1= RULE_STRING
                            {
                            lv_endpoint_5_1=(Token)match(input,RULE_STRING,FOLLOW_37); 

                            							newLeafNode(lv_endpoint_5_1, grammarAccess.getHigherOrderAlgorithmRuntimeAccess().getEndpointSTRINGTerminalRuleCall_3_2_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getHigherOrderAlgorithmRuntimeRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"endpoint",
                            								lv_endpoint_5_1,
                            								"org.eclipse.xtext.common.Terminals.STRING");
                            						

                            }
                            break;
                        case 2 :
                            // InternalPanoptesX.g:2359:7: lv_endpoint_5_2= RULE_SAFESTRING
                            {
                            lv_endpoint_5_2=(Token)match(input,RULE_SAFESTRING,FOLLOW_37); 

                            							newLeafNode(lv_endpoint_5_2, grammarAccess.getHigherOrderAlgorithmRuntimeAccess().getEndpointSAFESTRINGTerminalRuleCall_3_2_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getHigherOrderAlgorithmRuntimeRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"endpoint",
                            								lv_endpoint_5_2,
                            								"org.lowcomote.panoptes.PanoptesX.SAFESTRING");
                            						

                            }
                            break;

                    }


                    }


                    }

                    otherlv_6=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getHigherOrderAlgorithmRuntimeAccess().getRightCurlyBracketKeyword_3_3());
                    			

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
    // $ANTLR end "ruleHigherOrderAlgorithmRuntime"


    // $ANTLR start "entryRuleAlgorithmExecution"
    // InternalPanoptesX.g:2385:1: entryRuleAlgorithmExecution returns [EObject current=null] : iv_ruleAlgorithmExecution= ruleAlgorithmExecution EOF ;
    public final EObject entryRuleAlgorithmExecution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlgorithmExecution = null;


        try {
            // InternalPanoptesX.g:2385:59: (iv_ruleAlgorithmExecution= ruleAlgorithmExecution EOF )
            // InternalPanoptesX.g:2386:2: iv_ruleAlgorithmExecution= ruleAlgorithmExecution EOF
            {
             newCompositeNode(grammarAccess.getAlgorithmExecutionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlgorithmExecution=ruleAlgorithmExecution();

            state._fsp--;

             current =iv_ruleAlgorithmExecution; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAlgorithmExecution"


    // $ANTLR start "ruleAlgorithmExecution"
    // InternalPanoptesX.g:2392:1: ruleAlgorithmExecution returns [EObject current=null] : (this_BaseAlgorithmExecution_0= ruleBaseAlgorithmExecution | this_HigherOrderAlgorithmExecution_1= ruleHigherOrderAlgorithmExecution ) ;
    public final EObject ruleAlgorithmExecution() throws RecognitionException {
        EObject current = null;

        EObject this_BaseAlgorithmExecution_0 = null;

        EObject this_HigherOrderAlgorithmExecution_1 = null;



        	enterRule();

        try {
            // InternalPanoptesX.g:2398:2: ( (this_BaseAlgorithmExecution_0= ruleBaseAlgorithmExecution | this_HigherOrderAlgorithmExecution_1= ruleHigherOrderAlgorithmExecution ) )
            // InternalPanoptesX.g:2399:2: (this_BaseAlgorithmExecution_0= ruleBaseAlgorithmExecution | this_HigherOrderAlgorithmExecution_1= ruleHigherOrderAlgorithmExecution )
            {
            // InternalPanoptesX.g:2399:2: (this_BaseAlgorithmExecution_0= ruleBaseAlgorithmExecution | this_HigherOrderAlgorithmExecution_1= ruleHigherOrderAlgorithmExecution )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==44) ) {
                alt45=1;
            }
            else if ( (LA45_0==51) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // InternalPanoptesX.g:2400:3: this_BaseAlgorithmExecution_0= ruleBaseAlgorithmExecution
                    {

                    			newCompositeNode(grammarAccess.getAlgorithmExecutionAccess().getBaseAlgorithmExecutionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_BaseAlgorithmExecution_0=ruleBaseAlgorithmExecution();

                    state._fsp--;


                    			current = this_BaseAlgorithmExecution_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPanoptesX.g:2409:3: this_HigherOrderAlgorithmExecution_1= ruleHigherOrderAlgorithmExecution
                    {

                    			newCompositeNode(grammarAccess.getAlgorithmExecutionAccess().getHigherOrderAlgorithmExecutionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_HigherOrderAlgorithmExecution_1=ruleHigherOrderAlgorithmExecution();

                    state._fsp--;


                    			current = this_HigherOrderAlgorithmExecution_1;
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
    // $ANTLR end "ruleAlgorithmExecution"


    // $ANTLR start "entryRuleBaseAlgorithmExecution"
    // InternalPanoptesX.g:2421:1: entryRuleBaseAlgorithmExecution returns [EObject current=null] : iv_ruleBaseAlgorithmExecution= ruleBaseAlgorithmExecution EOF ;
    public final EObject entryRuleBaseAlgorithmExecution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaseAlgorithmExecution = null;


        try {
            // InternalPanoptesX.g:2421:63: (iv_ruleBaseAlgorithmExecution= ruleBaseAlgorithmExecution EOF )
            // InternalPanoptesX.g:2422:2: iv_ruleBaseAlgorithmExecution= ruleBaseAlgorithmExecution EOF
            {
             newCompositeNode(grammarAccess.getBaseAlgorithmExecutionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBaseAlgorithmExecution=ruleBaseAlgorithmExecution();

            state._fsp--;

             current =iv_ruleBaseAlgorithmExecution; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBaseAlgorithmExecution"


    // $ANTLR start "ruleBaseAlgorithmExecution"
    // InternalPanoptesX.g:2428:1: ruleBaseAlgorithmExecution returns [EObject current=null] : ( () otherlv_1= 'BaseAlgorithmExecution' ( ( (lv_name_2_1= RULE_STRING | lv_name_2_2= RULE_SAFESTRING ) ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'algorithm' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'live' otherlv_8= 'data' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'historical' otherlv_13= 'data' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'actions' ( (lv_ActionExecutionMap_18_0= ruleactionExecutionEntry ) ) (otherlv_19= ',' ( (lv_ActionExecutionMap_20_0= ruleactionExecutionEntry ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'parameter' otherlv_22= 'values' ( (lv_parameterValueMap_23_0= ruleparameterValueEntry ) ) (otherlv_24= ',' ( (lv_parameterValueMap_25_0= ruleparameterValueEntry ) ) )* ) ) ) ) )+ {...}?) ) ) otherlv_26= '}' ) ;
    public final EObject ruleBaseAlgorithmExecution() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_1=null;
        Token lv_name_2_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        EObject lv_ActionExecutionMap_18_0 = null;

        EObject lv_ActionExecutionMap_20_0 = null;

        EObject lv_parameterValueMap_23_0 = null;

        EObject lv_parameterValueMap_25_0 = null;



        	enterRule();

        try {
            // InternalPanoptesX.g:2434:2: ( ( () otherlv_1= 'BaseAlgorithmExecution' ( ( (lv_name_2_1= RULE_STRING | lv_name_2_2= RULE_SAFESTRING ) ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'algorithm' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'live' otherlv_8= 'data' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'historical' otherlv_13= 'data' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'actions' ( (lv_ActionExecutionMap_18_0= ruleactionExecutionEntry ) ) (otherlv_19= ',' ( (lv_ActionExecutionMap_20_0= ruleactionExecutionEntry ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'parameter' otherlv_22= 'values' ( (lv_parameterValueMap_23_0= ruleparameterValueEntry ) ) (otherlv_24= ',' ( (lv_parameterValueMap_25_0= ruleparameterValueEntry ) ) )* ) ) ) ) )+ {...}?) ) ) otherlv_26= '}' ) )
            // InternalPanoptesX.g:2435:2: ( () otherlv_1= 'BaseAlgorithmExecution' ( ( (lv_name_2_1= RULE_STRING | lv_name_2_2= RULE_SAFESTRING ) ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'algorithm' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'live' otherlv_8= 'data' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'historical' otherlv_13= 'data' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'actions' ( (lv_ActionExecutionMap_18_0= ruleactionExecutionEntry ) ) (otherlv_19= ',' ( (lv_ActionExecutionMap_20_0= ruleactionExecutionEntry ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'parameter' otherlv_22= 'values' ( (lv_parameterValueMap_23_0= ruleparameterValueEntry ) ) (otherlv_24= ',' ( (lv_parameterValueMap_25_0= ruleparameterValueEntry ) ) )* ) ) ) ) )+ {...}?) ) ) otherlv_26= '}' )
            {
            // InternalPanoptesX.g:2435:2: ( () otherlv_1= 'BaseAlgorithmExecution' ( ( (lv_name_2_1= RULE_STRING | lv_name_2_2= RULE_SAFESTRING ) ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'algorithm' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'live' otherlv_8= 'data' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'historical' otherlv_13= 'data' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'actions' ( (lv_ActionExecutionMap_18_0= ruleactionExecutionEntry ) ) (otherlv_19= ',' ( (lv_ActionExecutionMap_20_0= ruleactionExecutionEntry ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'parameter' otherlv_22= 'values' ( (lv_parameterValueMap_23_0= ruleparameterValueEntry ) ) (otherlv_24= ',' ( (lv_parameterValueMap_25_0= ruleparameterValueEntry ) ) )* ) ) ) ) )+ {...}?) ) ) otherlv_26= '}' )
            // InternalPanoptesX.g:2436:3: () otherlv_1= 'BaseAlgorithmExecution' ( ( (lv_name_2_1= RULE_STRING | lv_name_2_2= RULE_SAFESTRING ) ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'algorithm' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'live' otherlv_8= 'data' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'historical' otherlv_13= 'data' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'actions' ( (lv_ActionExecutionMap_18_0= ruleactionExecutionEntry ) ) (otherlv_19= ',' ( (lv_ActionExecutionMap_20_0= ruleactionExecutionEntry ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'parameter' otherlv_22= 'values' ( (lv_parameterValueMap_23_0= ruleparameterValueEntry ) ) (otherlv_24= ',' ( (lv_parameterValueMap_25_0= ruleparameterValueEntry ) ) )* ) ) ) ) )+ {...}?) ) ) otherlv_26= '}'
            {
            // InternalPanoptesX.g:2436:3: ()
            // InternalPanoptesX.g:2437:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBaseAlgorithmExecutionAccess().getBaseAlgorithmExecutionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,44,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getBaseAlgorithmExecutionAccess().getBaseAlgorithmExecutionKeyword_1());
            		
            // InternalPanoptesX.g:2447:3: ( ( (lv_name_2_1= RULE_STRING | lv_name_2_2= RULE_SAFESTRING ) ) )
            // InternalPanoptesX.g:2448:4: ( (lv_name_2_1= RULE_STRING | lv_name_2_2= RULE_SAFESTRING ) )
            {
            // InternalPanoptesX.g:2448:4: ( (lv_name_2_1= RULE_STRING | lv_name_2_2= RULE_SAFESTRING ) )
            // InternalPanoptesX.g:2449:5: (lv_name_2_1= RULE_STRING | lv_name_2_2= RULE_SAFESTRING )
            {
            // InternalPanoptesX.g:2449:5: (lv_name_2_1= RULE_STRING | lv_name_2_2= RULE_SAFESTRING )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_STRING) ) {
                alt46=1;
            }
            else if ( (LA46_0==RULE_SAFESTRING) ) {
                alt46=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // InternalPanoptesX.g:2450:6: lv_name_2_1= RULE_STRING
                    {
                    lv_name_2_1=(Token)match(input,RULE_STRING,FOLLOW_5); 

                    						newLeafNode(lv_name_2_1, grammarAccess.getBaseAlgorithmExecutionAccess().getNameSTRINGTerminalRuleCall_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBaseAlgorithmExecutionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_2_1,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }
                    break;
                case 2 :
                    // InternalPanoptesX.g:2465:6: lv_name_2_2= RULE_SAFESTRING
                    {
                    lv_name_2_2=(Token)match(input,RULE_SAFESTRING,FOLLOW_5); 

                    						newLeafNode(lv_name_2_2, grammarAccess.getBaseAlgorithmExecutionAccess().getNameSAFESTRINGTerminalRuleCall_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBaseAlgorithmExecutionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_2_2,
                    							"org.lowcomote.panoptes.PanoptesX.SAFESTRING");
                    					

                    }
                    break;

            }


            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_38); 

            			newLeafNode(otherlv_3, grammarAccess.getBaseAlgorithmExecutionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalPanoptesX.g:2486:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'algorithm' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'live' otherlv_8= 'data' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'historical' otherlv_13= 'data' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'actions' ( (lv_ActionExecutionMap_18_0= ruleactionExecutionEntry ) ) (otherlv_19= ',' ( (lv_ActionExecutionMap_20_0= ruleactionExecutionEntry ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'parameter' otherlv_22= 'values' ( (lv_parameterValueMap_23_0= ruleparameterValueEntry ) ) (otherlv_24= ',' ( (lv_parameterValueMap_25_0= ruleparameterValueEntry ) ) )* ) ) ) ) )+ {...}?) ) )
            // InternalPanoptesX.g:2487:4: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'algorithm' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'live' otherlv_8= 'data' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'historical' otherlv_13= 'data' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'actions' ( (lv_ActionExecutionMap_18_0= ruleactionExecutionEntry ) ) (otherlv_19= ',' ( (lv_ActionExecutionMap_20_0= ruleactionExecutionEntry ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'parameter' otherlv_22= 'values' ( (lv_parameterValueMap_23_0= ruleparameterValueEntry ) ) (otherlv_24= ',' ( (lv_parameterValueMap_25_0= ruleparameterValueEntry ) ) )* ) ) ) ) )+ {...}?) )
            {
            // InternalPanoptesX.g:2487:4: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'algorithm' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'live' otherlv_8= 'data' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'historical' otherlv_13= 'data' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'actions' ( (lv_ActionExecutionMap_18_0= ruleactionExecutionEntry ) ) (otherlv_19= ',' ( (lv_ActionExecutionMap_20_0= ruleactionExecutionEntry ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'parameter' otherlv_22= 'values' ( (lv_parameterValueMap_23_0= ruleparameterValueEntry ) ) (otherlv_24= ',' ( (lv_parameterValueMap_25_0= ruleparameterValueEntry ) ) )* ) ) ) ) )+ {...}?) )
            // InternalPanoptesX.g:2488:5: ( ( ({...}? => ( ({...}? => (otherlv_5= 'algorithm' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'live' otherlv_8= 'data' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'historical' otherlv_13= 'data' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'actions' ( (lv_ActionExecutionMap_18_0= ruleactionExecutionEntry ) ) (otherlv_19= ',' ( (lv_ActionExecutionMap_20_0= ruleactionExecutionEntry ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'parameter' otherlv_22= 'values' ( (lv_parameterValueMap_23_0= ruleparameterValueEntry ) ) (otherlv_24= ',' ( (lv_parameterValueMap_25_0= ruleparameterValueEntry ) ) )* ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getBaseAlgorithmExecutionAccess().getUnorderedGroup_4());
            				
            // InternalPanoptesX.g:2491:5: ( ( ({...}? => ( ({...}? => (otherlv_5= 'algorithm' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'live' otherlv_8= 'data' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'historical' otherlv_13= 'data' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'actions' ( (lv_ActionExecutionMap_18_0= ruleactionExecutionEntry ) ) (otherlv_19= ',' ( (lv_ActionExecutionMap_20_0= ruleactionExecutionEntry ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'parameter' otherlv_22= 'values' ( (lv_parameterValueMap_23_0= ruleparameterValueEntry ) ) (otherlv_24= ',' ( (lv_parameterValueMap_25_0= ruleparameterValueEntry ) ) )* ) ) ) ) )+ {...}?)
            // InternalPanoptesX.g:2492:6: ( ({...}? => ( ({...}? => (otherlv_5= 'algorithm' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'live' otherlv_8= 'data' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'historical' otherlv_13= 'data' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'actions' ( (lv_ActionExecutionMap_18_0= ruleactionExecutionEntry ) ) (otherlv_19= ',' ( (lv_ActionExecutionMap_20_0= ruleactionExecutionEntry ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'parameter' otherlv_22= 'values' ( (lv_parameterValueMap_23_0= ruleparameterValueEntry ) ) (otherlv_24= ',' ( (lv_parameterValueMap_25_0= ruleparameterValueEntry ) ) )* ) ) ) ) )+ {...}?
            {
            // InternalPanoptesX.g:2492:6: ( ({...}? => ( ({...}? => (otherlv_5= 'algorithm' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'live' otherlv_8= 'data' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'historical' otherlv_13= 'data' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'actions' ( (lv_ActionExecutionMap_18_0= ruleactionExecutionEntry ) ) (otherlv_19= ',' ( (lv_ActionExecutionMap_20_0= ruleactionExecutionEntry ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'parameter' otherlv_22= 'values' ( (lv_parameterValueMap_23_0= ruleparameterValueEntry ) ) (otherlv_24= ',' ( (lv_parameterValueMap_25_0= ruleparameterValueEntry ) ) )* ) ) ) ) )+
            int cnt51=0;
            loop51:
            do {
                int alt51=6;
                int LA51_0 = input.LA(1);

                if ( LA51_0 == 45 && getUnorderedGroupHelper().canSelect(grammarAccess.getBaseAlgorithmExecutionAccess().getUnorderedGroup_4(), 0) ) {
                    alt51=1;
                }
                else if ( LA51_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getBaseAlgorithmExecutionAccess().getUnorderedGroup_4(), 1) ) {
                    alt51=2;
                }
                else if ( LA51_0 == 47 && getUnorderedGroupHelper().canSelect(grammarAccess.getBaseAlgorithmExecutionAccess().getUnorderedGroup_4(), 2) ) {
                    alt51=3;
                }
                else if ( LA51_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getBaseAlgorithmExecutionAccess().getUnorderedGroup_4(), 3) ) {
                    alt51=4;
                }
                else if ( LA51_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getBaseAlgorithmExecutionAccess().getUnorderedGroup_4(), 4) ) {
                    alt51=5;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalPanoptesX.g:2493:4: ({...}? => ( ({...}? => (otherlv_5= 'algorithm' ( ( ruleEString ) ) ) ) ) )
            	    {
            	    // InternalPanoptesX.g:2493:4: ({...}? => ( ({...}? => (otherlv_5= 'algorithm' ( ( ruleEString ) ) ) ) ) )
            	    // InternalPanoptesX.g:2494:5: {...}? => ( ({...}? => (otherlv_5= 'algorithm' ( ( ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBaseAlgorithmExecutionAccess().getUnorderedGroup_4(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleBaseAlgorithmExecution", "getUnorderedGroupHelper().canSelect(grammarAccess.getBaseAlgorithmExecutionAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // InternalPanoptesX.g:2494:119: ( ({...}? => (otherlv_5= 'algorithm' ( ( ruleEString ) ) ) ) )
            	    // InternalPanoptesX.g:2495:6: ({...}? => (otherlv_5= 'algorithm' ( ( ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getBaseAlgorithmExecutionAccess().getUnorderedGroup_4(), 0);
            	    					
            	    // InternalPanoptesX.g:2498:9: ({...}? => (otherlv_5= 'algorithm' ( ( ruleEString ) ) ) )
            	    // InternalPanoptesX.g:2498:10: {...}? => (otherlv_5= 'algorithm' ( ( ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBaseAlgorithmExecution", "true");
            	    }
            	    // InternalPanoptesX.g:2498:19: (otherlv_5= 'algorithm' ( ( ruleEString ) ) )
            	    // InternalPanoptesX.g:2498:20: otherlv_5= 'algorithm' ( ( ruleEString ) )
            	    {
            	    otherlv_5=(Token)match(input,45,FOLLOW_7); 

            	    									newLeafNode(otherlv_5, grammarAccess.getBaseAlgorithmExecutionAccess().getAlgorithmKeyword_4_0_0());
            	    								
            	    // InternalPanoptesX.g:2502:9: ( ( ruleEString ) )
            	    // InternalPanoptesX.g:2503:10: ( ruleEString )
            	    {
            	    // InternalPanoptesX.g:2503:10: ( ruleEString )
            	    // InternalPanoptesX.g:2504:11: ruleEString
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getBaseAlgorithmExecutionRule());
            	    											}
            	    										

            	    											newCompositeNode(grammarAccess.getBaseAlgorithmExecutionAccess().getAlgorithmBaseAlgorithmCrossReference_4_0_1_0());
            	    										
            	    pushFollow(FOLLOW_39);
            	    ruleEString();

            	    state._fsp--;


            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBaseAlgorithmExecutionAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalPanoptesX.g:2524:4: ({...}? => ( ({...}? => (otherlv_7= 'live' otherlv_8= 'data' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* ) ) ) )
            	    {
            	    // InternalPanoptesX.g:2524:4: ({...}? => ( ({...}? => (otherlv_7= 'live' otherlv_8= 'data' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* ) ) ) )
            	    // InternalPanoptesX.g:2525:5: {...}? => ( ({...}? => (otherlv_7= 'live' otherlv_8= 'data' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBaseAlgorithmExecutionAccess().getUnorderedGroup_4(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleBaseAlgorithmExecution", "getUnorderedGroupHelper().canSelect(grammarAccess.getBaseAlgorithmExecutionAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // InternalPanoptesX.g:2525:119: ( ({...}? => (otherlv_7= 'live' otherlv_8= 'data' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* ) ) )
            	    // InternalPanoptesX.g:2526:6: ({...}? => (otherlv_7= 'live' otherlv_8= 'data' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getBaseAlgorithmExecutionAccess().getUnorderedGroup_4(), 1);
            	    					
            	    // InternalPanoptesX.g:2529:9: ({...}? => (otherlv_7= 'live' otherlv_8= 'data' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* ) )
            	    // InternalPanoptesX.g:2529:10: {...}? => (otherlv_7= 'live' otherlv_8= 'data' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBaseAlgorithmExecution", "true");
            	    }
            	    // InternalPanoptesX.g:2529:19: (otherlv_7= 'live' otherlv_8= 'data' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* )
            	    // InternalPanoptesX.g:2529:20: otherlv_7= 'live' otherlv_8= 'data' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )*
            	    {
            	    otherlv_7=(Token)match(input,46,FOLLOW_12); 

            	    									newLeafNode(otherlv_7, grammarAccess.getBaseAlgorithmExecutionAccess().getLiveKeyword_4_1_0());
            	    								
            	    otherlv_8=(Token)match(input,24,FOLLOW_7); 

            	    									newLeafNode(otherlv_8, grammarAccess.getBaseAlgorithmExecutionAccess().getDataKeyword_4_1_1());
            	    								
            	    // InternalPanoptesX.g:2537:9: ( ( ruleEString ) )
            	    // InternalPanoptesX.g:2538:10: ( ruleEString )
            	    {
            	    // InternalPanoptesX.g:2538:10: ( ruleEString )
            	    // InternalPanoptesX.g:2539:11: ruleEString
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getBaseAlgorithmExecutionRule());
            	    											}
            	    										

            	    											newCompositeNode(grammarAccess.getBaseAlgorithmExecutionAccess().getCurrentIOValuesModelIOCrossReference_4_1_2_0());
            	    										
            	    pushFollow(FOLLOW_40);
            	    ruleEString();

            	    state._fsp--;


            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalPanoptesX.g:2553:9: (otherlv_10= ',' ( ( ruleEString ) ) )*
            	    loop47:
            	    do {
            	        int alt47=2;
            	        int LA47_0 = input.LA(1);

            	        if ( (LA47_0==16) ) {
            	            alt47=1;
            	        }


            	        switch (alt47) {
            	    	case 1 :
            	    	    // InternalPanoptesX.g:2554:10: otherlv_10= ',' ( ( ruleEString ) )
            	    	    {
            	    	    otherlv_10=(Token)match(input,16,FOLLOW_7); 

            	    	    										newLeafNode(otherlv_10, grammarAccess.getBaseAlgorithmExecutionAccess().getCommaKeyword_4_1_3_0());
            	    	    									
            	    	    // InternalPanoptesX.g:2558:10: ( ( ruleEString ) )
            	    	    // InternalPanoptesX.g:2559:11: ( ruleEString )
            	    	    {
            	    	    // InternalPanoptesX.g:2559:11: ( ruleEString )
            	    	    // InternalPanoptesX.g:2560:12: ruleEString
            	    	    {

            	    	    												if (current==null) {
            	    	    													current = createModelElement(grammarAccess.getBaseAlgorithmExecutionRule());
            	    	    												}
            	    	    											

            	    	    												newCompositeNode(grammarAccess.getBaseAlgorithmExecutionAccess().getCurrentIOValuesModelIOCrossReference_4_1_3_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_40);
            	    	    ruleEString();

            	    	    state._fsp--;


            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop47;
            	        }
            	    } while (true);


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBaseAlgorithmExecutionAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalPanoptesX.g:2581:4: ({...}? => ( ({...}? => (otherlv_12= 'historical' otherlv_13= 'data' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* ) ) ) )
            	    {
            	    // InternalPanoptesX.g:2581:4: ({...}? => ( ({...}? => (otherlv_12= 'historical' otherlv_13= 'data' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* ) ) ) )
            	    // InternalPanoptesX.g:2582:5: {...}? => ( ({...}? => (otherlv_12= 'historical' otherlv_13= 'data' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBaseAlgorithmExecutionAccess().getUnorderedGroup_4(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleBaseAlgorithmExecution", "getUnorderedGroupHelper().canSelect(grammarAccess.getBaseAlgorithmExecutionAccess().getUnorderedGroup_4(), 2)");
            	    }
            	    // InternalPanoptesX.g:2582:119: ( ({...}? => (otherlv_12= 'historical' otherlv_13= 'data' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* ) ) )
            	    // InternalPanoptesX.g:2583:6: ({...}? => (otherlv_12= 'historical' otherlv_13= 'data' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getBaseAlgorithmExecutionAccess().getUnorderedGroup_4(), 2);
            	    					
            	    // InternalPanoptesX.g:2586:9: ({...}? => (otherlv_12= 'historical' otherlv_13= 'data' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* ) )
            	    // InternalPanoptesX.g:2586:10: {...}? => (otherlv_12= 'historical' otherlv_13= 'data' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBaseAlgorithmExecution", "true");
            	    }
            	    // InternalPanoptesX.g:2586:19: (otherlv_12= 'historical' otherlv_13= 'data' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* )
            	    // InternalPanoptesX.g:2586:20: otherlv_12= 'historical' otherlv_13= 'data' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )*
            	    {
            	    otherlv_12=(Token)match(input,47,FOLLOW_12); 

            	    									newLeafNode(otherlv_12, grammarAccess.getBaseAlgorithmExecutionAccess().getHistoricalKeyword_4_2_0());
            	    								
            	    otherlv_13=(Token)match(input,24,FOLLOW_7); 

            	    									newLeafNode(otherlv_13, grammarAccess.getBaseAlgorithmExecutionAccess().getDataKeyword_4_2_1());
            	    								
            	    // InternalPanoptesX.g:2594:9: ( ( ruleEString ) )
            	    // InternalPanoptesX.g:2595:10: ( ruleEString )
            	    {
            	    // InternalPanoptesX.g:2595:10: ( ruleEString )
            	    // InternalPanoptesX.g:2596:11: ruleEString
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getBaseAlgorithmExecutionRule());
            	    											}
            	    										

            	    											newCompositeNode(grammarAccess.getBaseAlgorithmExecutionAccess().getHistoricIOValuesModelIOCrossReference_4_2_2_0());
            	    										
            	    pushFollow(FOLLOW_40);
            	    ruleEString();

            	    state._fsp--;


            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalPanoptesX.g:2610:9: (otherlv_15= ',' ( ( ruleEString ) ) )*
            	    loop48:
            	    do {
            	        int alt48=2;
            	        int LA48_0 = input.LA(1);

            	        if ( (LA48_0==16) ) {
            	            alt48=1;
            	        }


            	        switch (alt48) {
            	    	case 1 :
            	    	    // InternalPanoptesX.g:2611:10: otherlv_15= ',' ( ( ruleEString ) )
            	    	    {
            	    	    otherlv_15=(Token)match(input,16,FOLLOW_7); 

            	    	    										newLeafNode(otherlv_15, grammarAccess.getBaseAlgorithmExecutionAccess().getCommaKeyword_4_2_3_0());
            	    	    									
            	    	    // InternalPanoptesX.g:2615:10: ( ( ruleEString ) )
            	    	    // InternalPanoptesX.g:2616:11: ( ruleEString )
            	    	    {
            	    	    // InternalPanoptesX.g:2616:11: ( ruleEString )
            	    	    // InternalPanoptesX.g:2617:12: ruleEString
            	    	    {

            	    	    												if (current==null) {
            	    	    													current = createModelElement(grammarAccess.getBaseAlgorithmExecutionRule());
            	    	    												}
            	    	    											

            	    	    												newCompositeNode(grammarAccess.getBaseAlgorithmExecutionAccess().getHistoricIOValuesModelIOCrossReference_4_2_3_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_40);
            	    	    ruleEString();

            	    	    state._fsp--;


            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop48;
            	        }
            	    } while (true);


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBaseAlgorithmExecutionAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalPanoptesX.g:2638:4: ({...}? => ( ({...}? => (otherlv_17= 'actions' ( (lv_ActionExecutionMap_18_0= ruleactionExecutionEntry ) ) (otherlv_19= ',' ( (lv_ActionExecutionMap_20_0= ruleactionExecutionEntry ) ) )* ) ) ) )
            	    {
            	    // InternalPanoptesX.g:2638:4: ({...}? => ( ({...}? => (otherlv_17= 'actions' ( (lv_ActionExecutionMap_18_0= ruleactionExecutionEntry ) ) (otherlv_19= ',' ( (lv_ActionExecutionMap_20_0= ruleactionExecutionEntry ) ) )* ) ) ) )
            	    // InternalPanoptesX.g:2639:5: {...}? => ( ({...}? => (otherlv_17= 'actions' ( (lv_ActionExecutionMap_18_0= ruleactionExecutionEntry ) ) (otherlv_19= ',' ( (lv_ActionExecutionMap_20_0= ruleactionExecutionEntry ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBaseAlgorithmExecutionAccess().getUnorderedGroup_4(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleBaseAlgorithmExecution", "getUnorderedGroupHelper().canSelect(grammarAccess.getBaseAlgorithmExecutionAccess().getUnorderedGroup_4(), 3)");
            	    }
            	    // InternalPanoptesX.g:2639:119: ( ({...}? => (otherlv_17= 'actions' ( (lv_ActionExecutionMap_18_0= ruleactionExecutionEntry ) ) (otherlv_19= ',' ( (lv_ActionExecutionMap_20_0= ruleactionExecutionEntry ) ) )* ) ) )
            	    // InternalPanoptesX.g:2640:6: ({...}? => (otherlv_17= 'actions' ( (lv_ActionExecutionMap_18_0= ruleactionExecutionEntry ) ) (otherlv_19= ',' ( (lv_ActionExecutionMap_20_0= ruleactionExecutionEntry ) ) )* ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getBaseAlgorithmExecutionAccess().getUnorderedGroup_4(), 3);
            	    					
            	    // InternalPanoptesX.g:2643:9: ({...}? => (otherlv_17= 'actions' ( (lv_ActionExecutionMap_18_0= ruleactionExecutionEntry ) ) (otherlv_19= ',' ( (lv_ActionExecutionMap_20_0= ruleactionExecutionEntry ) ) )* ) )
            	    // InternalPanoptesX.g:2643:10: {...}? => (otherlv_17= 'actions' ( (lv_ActionExecutionMap_18_0= ruleactionExecutionEntry ) ) (otherlv_19= ',' ( (lv_ActionExecutionMap_20_0= ruleactionExecutionEntry ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBaseAlgorithmExecution", "true");
            	    }
            	    // InternalPanoptesX.g:2643:19: (otherlv_17= 'actions' ( (lv_ActionExecutionMap_18_0= ruleactionExecutionEntry ) ) (otherlv_19= ',' ( (lv_ActionExecutionMap_20_0= ruleactionExecutionEntry ) ) )* )
            	    // InternalPanoptesX.g:2643:20: otherlv_17= 'actions' ( (lv_ActionExecutionMap_18_0= ruleactionExecutionEntry ) ) (otherlv_19= ',' ( (lv_ActionExecutionMap_20_0= ruleactionExecutionEntry ) ) )*
            	    {
            	    otherlv_17=(Token)match(input,48,FOLLOW_29); 

            	    									newLeafNode(otherlv_17, grammarAccess.getBaseAlgorithmExecutionAccess().getActionsKeyword_4_3_0());
            	    								
            	    // InternalPanoptesX.g:2647:9: ( (lv_ActionExecutionMap_18_0= ruleactionExecutionEntry ) )
            	    // InternalPanoptesX.g:2648:10: (lv_ActionExecutionMap_18_0= ruleactionExecutionEntry )
            	    {
            	    // InternalPanoptesX.g:2648:10: (lv_ActionExecutionMap_18_0= ruleactionExecutionEntry )
            	    // InternalPanoptesX.g:2649:11: lv_ActionExecutionMap_18_0= ruleactionExecutionEntry
            	    {

            	    											newCompositeNode(grammarAccess.getBaseAlgorithmExecutionAccess().getActionExecutionMapActionExecutionEntryParserRuleCall_4_3_1_0());
            	    										
            	    pushFollow(FOLLOW_40);
            	    lv_ActionExecutionMap_18_0=ruleactionExecutionEntry();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getBaseAlgorithmExecutionRule());
            	    											}
            	    											add(
            	    												current,
            	    												"ActionExecutionMap",
            	    												lv_ActionExecutionMap_18_0,
            	    												"org.lowcomote.panoptes.PanoptesX.actionExecutionEntry");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalPanoptesX.g:2666:9: (otherlv_19= ',' ( (lv_ActionExecutionMap_20_0= ruleactionExecutionEntry ) ) )*
            	    loop49:
            	    do {
            	        int alt49=2;
            	        int LA49_0 = input.LA(1);

            	        if ( (LA49_0==16) ) {
            	            alt49=1;
            	        }


            	        switch (alt49) {
            	    	case 1 :
            	    	    // InternalPanoptesX.g:2667:10: otherlv_19= ',' ( (lv_ActionExecutionMap_20_0= ruleactionExecutionEntry ) )
            	    	    {
            	    	    otherlv_19=(Token)match(input,16,FOLLOW_29); 

            	    	    										newLeafNode(otherlv_19, grammarAccess.getBaseAlgorithmExecutionAccess().getCommaKeyword_4_3_2_0());
            	    	    									
            	    	    // InternalPanoptesX.g:2671:10: ( (lv_ActionExecutionMap_20_0= ruleactionExecutionEntry ) )
            	    	    // InternalPanoptesX.g:2672:11: (lv_ActionExecutionMap_20_0= ruleactionExecutionEntry )
            	    	    {
            	    	    // InternalPanoptesX.g:2672:11: (lv_ActionExecutionMap_20_0= ruleactionExecutionEntry )
            	    	    // InternalPanoptesX.g:2673:12: lv_ActionExecutionMap_20_0= ruleactionExecutionEntry
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getBaseAlgorithmExecutionAccess().getActionExecutionMapActionExecutionEntryParserRuleCall_4_3_2_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_40);
            	    	    lv_ActionExecutionMap_20_0=ruleactionExecutionEntry();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getBaseAlgorithmExecutionRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"ActionExecutionMap",
            	    	    													lv_ActionExecutionMap_20_0,
            	    	    													"org.lowcomote.panoptes.PanoptesX.actionExecutionEntry");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop49;
            	        }
            	    } while (true);


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBaseAlgorithmExecutionAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalPanoptesX.g:2697:4: ({...}? => ( ({...}? => (otherlv_21= 'parameter' otherlv_22= 'values' ( (lv_parameterValueMap_23_0= ruleparameterValueEntry ) ) (otherlv_24= ',' ( (lv_parameterValueMap_25_0= ruleparameterValueEntry ) ) )* ) ) ) )
            	    {
            	    // InternalPanoptesX.g:2697:4: ({...}? => ( ({...}? => (otherlv_21= 'parameter' otherlv_22= 'values' ( (lv_parameterValueMap_23_0= ruleparameterValueEntry ) ) (otherlv_24= ',' ( (lv_parameterValueMap_25_0= ruleparameterValueEntry ) ) )* ) ) ) )
            	    // InternalPanoptesX.g:2698:5: {...}? => ( ({...}? => (otherlv_21= 'parameter' otherlv_22= 'values' ( (lv_parameterValueMap_23_0= ruleparameterValueEntry ) ) (otherlv_24= ',' ( (lv_parameterValueMap_25_0= ruleparameterValueEntry ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBaseAlgorithmExecutionAccess().getUnorderedGroup_4(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleBaseAlgorithmExecution", "getUnorderedGroupHelper().canSelect(grammarAccess.getBaseAlgorithmExecutionAccess().getUnorderedGroup_4(), 4)");
            	    }
            	    // InternalPanoptesX.g:2698:119: ( ({...}? => (otherlv_21= 'parameter' otherlv_22= 'values' ( (lv_parameterValueMap_23_0= ruleparameterValueEntry ) ) (otherlv_24= ',' ( (lv_parameterValueMap_25_0= ruleparameterValueEntry ) ) )* ) ) )
            	    // InternalPanoptesX.g:2699:6: ({...}? => (otherlv_21= 'parameter' otherlv_22= 'values' ( (lv_parameterValueMap_23_0= ruleparameterValueEntry ) ) (otherlv_24= ',' ( (lv_parameterValueMap_25_0= ruleparameterValueEntry ) ) )* ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getBaseAlgorithmExecutionAccess().getUnorderedGroup_4(), 4);
            	    					
            	    // InternalPanoptesX.g:2702:9: ({...}? => (otherlv_21= 'parameter' otherlv_22= 'values' ( (lv_parameterValueMap_23_0= ruleparameterValueEntry ) ) (otherlv_24= ',' ( (lv_parameterValueMap_25_0= ruleparameterValueEntry ) ) )* ) )
            	    // InternalPanoptesX.g:2702:10: {...}? => (otherlv_21= 'parameter' otherlv_22= 'values' ( (lv_parameterValueMap_23_0= ruleparameterValueEntry ) ) (otherlv_24= ',' ( (lv_parameterValueMap_25_0= ruleparameterValueEntry ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBaseAlgorithmExecution", "true");
            	    }
            	    // InternalPanoptesX.g:2702:19: (otherlv_21= 'parameter' otherlv_22= 'values' ( (lv_parameterValueMap_23_0= ruleparameterValueEntry ) ) (otherlv_24= ',' ( (lv_parameterValueMap_25_0= ruleparameterValueEntry ) ) )* )
            	    // InternalPanoptesX.g:2702:20: otherlv_21= 'parameter' otherlv_22= 'values' ( (lv_parameterValueMap_23_0= ruleparameterValueEntry ) ) (otherlv_24= ',' ( (lv_parameterValueMap_25_0= ruleparameterValueEntry ) ) )*
            	    {
            	    otherlv_21=(Token)match(input,49,FOLLOW_41); 

            	    									newLeafNode(otherlv_21, grammarAccess.getBaseAlgorithmExecutionAccess().getParameterKeyword_4_4_0());
            	    								
            	    otherlv_22=(Token)match(input,50,FOLLOW_4); 

            	    									newLeafNode(otherlv_22, grammarAccess.getBaseAlgorithmExecutionAccess().getValuesKeyword_4_4_1());
            	    								
            	    // InternalPanoptesX.g:2710:9: ( (lv_parameterValueMap_23_0= ruleparameterValueEntry ) )
            	    // InternalPanoptesX.g:2711:10: (lv_parameterValueMap_23_0= ruleparameterValueEntry )
            	    {
            	    // InternalPanoptesX.g:2711:10: (lv_parameterValueMap_23_0= ruleparameterValueEntry )
            	    // InternalPanoptesX.g:2712:11: lv_parameterValueMap_23_0= ruleparameterValueEntry
            	    {

            	    											newCompositeNode(grammarAccess.getBaseAlgorithmExecutionAccess().getParameterValueMapParameterValueEntryParserRuleCall_4_4_2_0());
            	    										
            	    pushFollow(FOLLOW_40);
            	    lv_parameterValueMap_23_0=ruleparameterValueEntry();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getBaseAlgorithmExecutionRule());
            	    											}
            	    											add(
            	    												current,
            	    												"parameterValueMap",
            	    												lv_parameterValueMap_23_0,
            	    												"org.lowcomote.panoptes.PanoptesX.parameterValueEntry");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalPanoptesX.g:2729:9: (otherlv_24= ',' ( (lv_parameterValueMap_25_0= ruleparameterValueEntry ) ) )*
            	    loop50:
            	    do {
            	        int alt50=2;
            	        int LA50_0 = input.LA(1);

            	        if ( (LA50_0==16) ) {
            	            alt50=1;
            	        }


            	        switch (alt50) {
            	    	case 1 :
            	    	    // InternalPanoptesX.g:2730:10: otherlv_24= ',' ( (lv_parameterValueMap_25_0= ruleparameterValueEntry ) )
            	    	    {
            	    	    otherlv_24=(Token)match(input,16,FOLLOW_4); 

            	    	    										newLeafNode(otherlv_24, grammarAccess.getBaseAlgorithmExecutionAccess().getCommaKeyword_4_4_3_0());
            	    	    									
            	    	    // InternalPanoptesX.g:2734:10: ( (lv_parameterValueMap_25_0= ruleparameterValueEntry ) )
            	    	    // InternalPanoptesX.g:2735:11: (lv_parameterValueMap_25_0= ruleparameterValueEntry )
            	    	    {
            	    	    // InternalPanoptesX.g:2735:11: (lv_parameterValueMap_25_0= ruleparameterValueEntry )
            	    	    // InternalPanoptesX.g:2736:12: lv_parameterValueMap_25_0= ruleparameterValueEntry
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getBaseAlgorithmExecutionAccess().getParameterValueMapParameterValueEntryParserRuleCall_4_4_3_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_40);
            	    	    lv_parameterValueMap_25_0=ruleparameterValueEntry();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getBaseAlgorithmExecutionRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"parameterValueMap",
            	    	    													lv_parameterValueMap_25_0,
            	    	    													"org.lowcomote.panoptes.PanoptesX.parameterValueEntry");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop50;
            	        }
            	    } while (true);


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBaseAlgorithmExecutionAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt51 >= 1 ) break loop51;
                        EarlyExitException eee =
                            new EarlyExitException(51, input);
                        throw eee;
                }
                cnt51++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getBaseAlgorithmExecutionAccess().getUnorderedGroup_4()) ) {
                throw new FailedPredicateException(input, "ruleBaseAlgorithmExecution", "getUnorderedGroupHelper().canLeave(grammarAccess.getBaseAlgorithmExecutionAccess().getUnorderedGroup_4())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getBaseAlgorithmExecutionAccess().getUnorderedGroup_4());
            				

            }

            otherlv_26=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_26, grammarAccess.getBaseAlgorithmExecutionAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleBaseAlgorithmExecution"


    // $ANTLR start "entryRuleHigherOrderAlgorithmExecution"
    // InternalPanoptesX.g:2776:1: entryRuleHigherOrderAlgorithmExecution returns [EObject current=null] : iv_ruleHigherOrderAlgorithmExecution= ruleHigherOrderAlgorithmExecution EOF ;
    public final EObject entryRuleHigherOrderAlgorithmExecution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHigherOrderAlgorithmExecution = null;


        try {
            // InternalPanoptesX.g:2776:70: (iv_ruleHigherOrderAlgorithmExecution= ruleHigherOrderAlgorithmExecution EOF )
            // InternalPanoptesX.g:2777:2: iv_ruleHigherOrderAlgorithmExecution= ruleHigherOrderAlgorithmExecution EOF
            {
             newCompositeNode(grammarAccess.getHigherOrderAlgorithmExecutionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHigherOrderAlgorithmExecution=ruleHigherOrderAlgorithmExecution();

            state._fsp--;

             current =iv_ruleHigherOrderAlgorithmExecution; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleHigherOrderAlgorithmExecution"


    // $ANTLR start "ruleHigherOrderAlgorithmExecution"
    // InternalPanoptesX.g:2783:1: ruleHigherOrderAlgorithmExecution returns [EObject current=null] : ( () otherlv_1= 'HigherOrderAlgorithmExecution' ( ( (lv_name_2_1= RULE_STRING | lv_name_2_2= RULE_SAFESTRING ) ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'algorithm' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'observed' otherlv_8= 'execution' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'actions' ( (lv_ActionExecutionMap_11_0= ruleactionExecutionEntry ) ) (otherlv_12= ',' ( (lv_ActionExecutionMap_13_0= ruleactionExecutionEntry ) ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_14= 'minimum' | otherlv_15= 'min' ) otherlv_16= 'observations' ( (lv_minDataPoints_17_0= ruleEIntegerObject ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_18= 'maximum' | otherlv_19= 'max' ) otherlv_20= 'observations' ( (lv_maxDataPoints_21_0= ruleEIntegerObject ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'parameter' otherlv_23= 'values' ( (lv_parameterValueMap_24_0= ruleparameterValueEntry ) ) (otherlv_25= ',' ( (lv_parameterValueMap_26_0= ruleparameterValueEntry ) ) )* ) ) ) ) )+ {...}?) ) ) otherlv_27= '}' ) ;
    public final EObject ruleHigherOrderAlgorithmExecution() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_1=null;
        Token lv_name_2_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        EObject lv_ActionExecutionMap_11_0 = null;

        EObject lv_ActionExecutionMap_13_0 = null;

        AntlrDatatypeRuleToken lv_minDataPoints_17_0 = null;

        AntlrDatatypeRuleToken lv_maxDataPoints_21_0 = null;

        EObject lv_parameterValueMap_24_0 = null;

        EObject lv_parameterValueMap_26_0 = null;



        	enterRule();

        try {
            // InternalPanoptesX.g:2789:2: ( ( () otherlv_1= 'HigherOrderAlgorithmExecution' ( ( (lv_name_2_1= RULE_STRING | lv_name_2_2= RULE_SAFESTRING ) ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'algorithm' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'observed' otherlv_8= 'execution' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'actions' ( (lv_ActionExecutionMap_11_0= ruleactionExecutionEntry ) ) (otherlv_12= ',' ( (lv_ActionExecutionMap_13_0= ruleactionExecutionEntry ) ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_14= 'minimum' | otherlv_15= 'min' ) otherlv_16= 'observations' ( (lv_minDataPoints_17_0= ruleEIntegerObject ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_18= 'maximum' | otherlv_19= 'max' ) otherlv_20= 'observations' ( (lv_maxDataPoints_21_0= ruleEIntegerObject ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'parameter' otherlv_23= 'values' ( (lv_parameterValueMap_24_0= ruleparameterValueEntry ) ) (otherlv_25= ',' ( (lv_parameterValueMap_26_0= ruleparameterValueEntry ) ) )* ) ) ) ) )+ {...}?) ) ) otherlv_27= '}' ) )
            // InternalPanoptesX.g:2790:2: ( () otherlv_1= 'HigherOrderAlgorithmExecution' ( ( (lv_name_2_1= RULE_STRING | lv_name_2_2= RULE_SAFESTRING ) ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'algorithm' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'observed' otherlv_8= 'execution' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'actions' ( (lv_ActionExecutionMap_11_0= ruleactionExecutionEntry ) ) (otherlv_12= ',' ( (lv_ActionExecutionMap_13_0= ruleactionExecutionEntry ) ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_14= 'minimum' | otherlv_15= 'min' ) otherlv_16= 'observations' ( (lv_minDataPoints_17_0= ruleEIntegerObject ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_18= 'maximum' | otherlv_19= 'max' ) otherlv_20= 'observations' ( (lv_maxDataPoints_21_0= ruleEIntegerObject ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'parameter' otherlv_23= 'values' ( (lv_parameterValueMap_24_0= ruleparameterValueEntry ) ) (otherlv_25= ',' ( (lv_parameterValueMap_26_0= ruleparameterValueEntry ) ) )* ) ) ) ) )+ {...}?) ) ) otherlv_27= '}' )
            {
            // InternalPanoptesX.g:2790:2: ( () otherlv_1= 'HigherOrderAlgorithmExecution' ( ( (lv_name_2_1= RULE_STRING | lv_name_2_2= RULE_SAFESTRING ) ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'algorithm' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'observed' otherlv_8= 'execution' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'actions' ( (lv_ActionExecutionMap_11_0= ruleactionExecutionEntry ) ) (otherlv_12= ',' ( (lv_ActionExecutionMap_13_0= ruleactionExecutionEntry ) ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_14= 'minimum' | otherlv_15= 'min' ) otherlv_16= 'observations' ( (lv_minDataPoints_17_0= ruleEIntegerObject ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_18= 'maximum' | otherlv_19= 'max' ) otherlv_20= 'observations' ( (lv_maxDataPoints_21_0= ruleEIntegerObject ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'parameter' otherlv_23= 'values' ( (lv_parameterValueMap_24_0= ruleparameterValueEntry ) ) (otherlv_25= ',' ( (lv_parameterValueMap_26_0= ruleparameterValueEntry ) ) )* ) ) ) ) )+ {...}?) ) ) otherlv_27= '}' )
            // InternalPanoptesX.g:2791:3: () otherlv_1= 'HigherOrderAlgorithmExecution' ( ( (lv_name_2_1= RULE_STRING | lv_name_2_2= RULE_SAFESTRING ) ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'algorithm' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'observed' otherlv_8= 'execution' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'actions' ( (lv_ActionExecutionMap_11_0= ruleactionExecutionEntry ) ) (otherlv_12= ',' ( (lv_ActionExecutionMap_13_0= ruleactionExecutionEntry ) ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_14= 'minimum' | otherlv_15= 'min' ) otherlv_16= 'observations' ( (lv_minDataPoints_17_0= ruleEIntegerObject ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_18= 'maximum' | otherlv_19= 'max' ) otherlv_20= 'observations' ( (lv_maxDataPoints_21_0= ruleEIntegerObject ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'parameter' otherlv_23= 'values' ( (lv_parameterValueMap_24_0= ruleparameterValueEntry ) ) (otherlv_25= ',' ( (lv_parameterValueMap_26_0= ruleparameterValueEntry ) ) )* ) ) ) ) )+ {...}?) ) ) otherlv_27= '}'
            {
            // InternalPanoptesX.g:2791:3: ()
            // InternalPanoptesX.g:2792:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getHigherOrderAlgorithmExecutionAccess().getHigherOrderAlgorithmExecutionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,51,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getHigherOrderAlgorithmExecutionAccess().getHigherOrderAlgorithmExecutionKeyword_1());
            		
            // InternalPanoptesX.g:2802:3: ( ( (lv_name_2_1= RULE_STRING | lv_name_2_2= RULE_SAFESTRING ) ) )
            // InternalPanoptesX.g:2803:4: ( (lv_name_2_1= RULE_STRING | lv_name_2_2= RULE_SAFESTRING ) )
            {
            // InternalPanoptesX.g:2803:4: ( (lv_name_2_1= RULE_STRING | lv_name_2_2= RULE_SAFESTRING ) )
            // InternalPanoptesX.g:2804:5: (lv_name_2_1= RULE_STRING | lv_name_2_2= RULE_SAFESTRING )
            {
            // InternalPanoptesX.g:2804:5: (lv_name_2_1= RULE_STRING | lv_name_2_2= RULE_SAFESTRING )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_STRING) ) {
                alt52=1;
            }
            else if ( (LA52_0==RULE_SAFESTRING) ) {
                alt52=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // InternalPanoptesX.g:2805:6: lv_name_2_1= RULE_STRING
                    {
                    lv_name_2_1=(Token)match(input,RULE_STRING,FOLLOW_5); 

                    						newLeafNode(lv_name_2_1, grammarAccess.getHigherOrderAlgorithmExecutionAccess().getNameSTRINGTerminalRuleCall_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getHigherOrderAlgorithmExecutionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_2_1,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }
                    break;
                case 2 :
                    // InternalPanoptesX.g:2820:6: lv_name_2_2= RULE_SAFESTRING
                    {
                    lv_name_2_2=(Token)match(input,RULE_SAFESTRING,FOLLOW_5); 

                    						newLeafNode(lv_name_2_2, grammarAccess.getHigherOrderAlgorithmExecutionAccess().getNameSAFESTRINGTerminalRuleCall_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getHigherOrderAlgorithmExecutionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_2_2,
                    							"org.lowcomote.panoptes.PanoptesX.SAFESTRING");
                    					

                    }
                    break;

            }


            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_42); 

            			newLeafNode(otherlv_3, grammarAccess.getHigherOrderAlgorithmExecutionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalPanoptesX.g:2841:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'algorithm' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'observed' otherlv_8= 'execution' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'actions' ( (lv_ActionExecutionMap_11_0= ruleactionExecutionEntry ) ) (otherlv_12= ',' ( (lv_ActionExecutionMap_13_0= ruleactionExecutionEntry ) ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_14= 'minimum' | otherlv_15= 'min' ) otherlv_16= 'observations' ( (lv_minDataPoints_17_0= ruleEIntegerObject ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_18= 'maximum' | otherlv_19= 'max' ) otherlv_20= 'observations' ( (lv_maxDataPoints_21_0= ruleEIntegerObject ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'parameter' otherlv_23= 'values' ( (lv_parameterValueMap_24_0= ruleparameterValueEntry ) ) (otherlv_25= ',' ( (lv_parameterValueMap_26_0= ruleparameterValueEntry ) ) )* ) ) ) ) )+ {...}?) ) )
            // InternalPanoptesX.g:2842:4: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'algorithm' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'observed' otherlv_8= 'execution' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'actions' ( (lv_ActionExecutionMap_11_0= ruleactionExecutionEntry ) ) (otherlv_12= ',' ( (lv_ActionExecutionMap_13_0= ruleactionExecutionEntry ) ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_14= 'minimum' | otherlv_15= 'min' ) otherlv_16= 'observations' ( (lv_minDataPoints_17_0= ruleEIntegerObject ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_18= 'maximum' | otherlv_19= 'max' ) otherlv_20= 'observations' ( (lv_maxDataPoints_21_0= ruleEIntegerObject ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'parameter' otherlv_23= 'values' ( (lv_parameterValueMap_24_0= ruleparameterValueEntry ) ) (otherlv_25= ',' ( (lv_parameterValueMap_26_0= ruleparameterValueEntry ) ) )* ) ) ) ) )+ {...}?) )
            {
            // InternalPanoptesX.g:2842:4: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'algorithm' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'observed' otherlv_8= 'execution' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'actions' ( (lv_ActionExecutionMap_11_0= ruleactionExecutionEntry ) ) (otherlv_12= ',' ( (lv_ActionExecutionMap_13_0= ruleactionExecutionEntry ) ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_14= 'minimum' | otherlv_15= 'min' ) otherlv_16= 'observations' ( (lv_minDataPoints_17_0= ruleEIntegerObject ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_18= 'maximum' | otherlv_19= 'max' ) otherlv_20= 'observations' ( (lv_maxDataPoints_21_0= ruleEIntegerObject ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'parameter' otherlv_23= 'values' ( (lv_parameterValueMap_24_0= ruleparameterValueEntry ) ) (otherlv_25= ',' ( (lv_parameterValueMap_26_0= ruleparameterValueEntry ) ) )* ) ) ) ) )+ {...}?) )
            // InternalPanoptesX.g:2843:5: ( ( ({...}? => ( ({...}? => (otherlv_5= 'algorithm' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'observed' otherlv_8= 'execution' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'actions' ( (lv_ActionExecutionMap_11_0= ruleactionExecutionEntry ) ) (otherlv_12= ',' ( (lv_ActionExecutionMap_13_0= ruleactionExecutionEntry ) ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_14= 'minimum' | otherlv_15= 'min' ) otherlv_16= 'observations' ( (lv_minDataPoints_17_0= ruleEIntegerObject ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_18= 'maximum' | otherlv_19= 'max' ) otherlv_20= 'observations' ( (lv_maxDataPoints_21_0= ruleEIntegerObject ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'parameter' otherlv_23= 'values' ( (lv_parameterValueMap_24_0= ruleparameterValueEntry ) ) (otherlv_25= ',' ( (lv_parameterValueMap_26_0= ruleparameterValueEntry ) ) )* ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getUnorderedGroup_4());
            				
            // InternalPanoptesX.g:2846:5: ( ( ({...}? => ( ({...}? => (otherlv_5= 'algorithm' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'observed' otherlv_8= 'execution' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'actions' ( (lv_ActionExecutionMap_11_0= ruleactionExecutionEntry ) ) (otherlv_12= ',' ( (lv_ActionExecutionMap_13_0= ruleactionExecutionEntry ) ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_14= 'minimum' | otherlv_15= 'min' ) otherlv_16= 'observations' ( (lv_minDataPoints_17_0= ruleEIntegerObject ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_18= 'maximum' | otherlv_19= 'max' ) otherlv_20= 'observations' ( (lv_maxDataPoints_21_0= ruleEIntegerObject ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'parameter' otherlv_23= 'values' ( (lv_parameterValueMap_24_0= ruleparameterValueEntry ) ) (otherlv_25= ',' ( (lv_parameterValueMap_26_0= ruleparameterValueEntry ) ) )* ) ) ) ) )+ {...}?)
            // InternalPanoptesX.g:2847:6: ( ({...}? => ( ({...}? => (otherlv_5= 'algorithm' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'observed' otherlv_8= 'execution' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'actions' ( (lv_ActionExecutionMap_11_0= ruleactionExecutionEntry ) ) (otherlv_12= ',' ( (lv_ActionExecutionMap_13_0= ruleactionExecutionEntry ) ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_14= 'minimum' | otherlv_15= 'min' ) otherlv_16= 'observations' ( (lv_minDataPoints_17_0= ruleEIntegerObject ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_18= 'maximum' | otherlv_19= 'max' ) otherlv_20= 'observations' ( (lv_maxDataPoints_21_0= ruleEIntegerObject ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'parameter' otherlv_23= 'values' ( (lv_parameterValueMap_24_0= ruleparameterValueEntry ) ) (otherlv_25= ',' ( (lv_parameterValueMap_26_0= ruleparameterValueEntry ) ) )* ) ) ) ) )+ {...}?
            {
            // InternalPanoptesX.g:2847:6: ( ({...}? => ( ({...}? => (otherlv_5= 'algorithm' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'observed' otherlv_8= 'execution' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'actions' ( (lv_ActionExecutionMap_11_0= ruleactionExecutionEntry ) ) (otherlv_12= ',' ( (lv_ActionExecutionMap_13_0= ruleactionExecutionEntry ) ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_14= 'minimum' | otherlv_15= 'min' ) otherlv_16= 'observations' ( (lv_minDataPoints_17_0= ruleEIntegerObject ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_18= 'maximum' | otherlv_19= 'max' ) otherlv_20= 'observations' ( (lv_maxDataPoints_21_0= ruleEIntegerObject ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'parameter' otherlv_23= 'values' ( (lv_parameterValueMap_24_0= ruleparameterValueEntry ) ) (otherlv_25= ',' ( (lv_parameterValueMap_26_0= ruleparameterValueEntry ) ) )* ) ) ) ) )+
            int cnt57=0;
            loop57:
            do {
                int alt57=7;
                int LA57_0 = input.LA(1);

                if ( LA57_0 == 45 && getUnorderedGroupHelper().canSelect(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getUnorderedGroup_4(), 0) ) {
                    alt57=1;
                }
                else if ( LA57_0 == 52 && getUnorderedGroupHelper().canSelect(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getUnorderedGroup_4(), 1) ) {
                    alt57=2;
                }
                else if ( LA57_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getUnorderedGroup_4(), 2) ) {
                    alt57=3;
                }
                else if ( LA57_0 >= 54 && LA57_0 <= 55 && getUnorderedGroupHelper().canSelect(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getUnorderedGroup_4(), 3) ) {
                    alt57=4;
                }
                else if ( LA57_0 >= 57 && LA57_0 <= 58 && getUnorderedGroupHelper().canSelect(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getUnorderedGroup_4(), 4) ) {
                    alt57=5;
                }
                else if ( LA57_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getUnorderedGroup_4(), 5) ) {
                    alt57=6;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalPanoptesX.g:2848:4: ({...}? => ( ({...}? => (otherlv_5= 'algorithm' ( ( ruleEString ) ) ) ) ) )
            	    {
            	    // InternalPanoptesX.g:2848:4: ({...}? => ( ({...}? => (otherlv_5= 'algorithm' ( ( ruleEString ) ) ) ) ) )
            	    // InternalPanoptesX.g:2849:5: {...}? => ( ({...}? => (otherlv_5= 'algorithm' ( ( ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getUnorderedGroup_4(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleHigherOrderAlgorithmExecution", "getUnorderedGroupHelper().canSelect(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // InternalPanoptesX.g:2849:126: ( ({...}? => (otherlv_5= 'algorithm' ( ( ruleEString ) ) ) ) )
            	    // InternalPanoptesX.g:2850:6: ({...}? => (otherlv_5= 'algorithm' ( ( ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getUnorderedGroup_4(), 0);
            	    					
            	    // InternalPanoptesX.g:2853:9: ({...}? => (otherlv_5= 'algorithm' ( ( ruleEString ) ) ) )
            	    // InternalPanoptesX.g:2853:10: {...}? => (otherlv_5= 'algorithm' ( ( ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleHigherOrderAlgorithmExecution", "true");
            	    }
            	    // InternalPanoptesX.g:2853:19: (otherlv_5= 'algorithm' ( ( ruleEString ) ) )
            	    // InternalPanoptesX.g:2853:20: otherlv_5= 'algorithm' ( ( ruleEString ) )
            	    {
            	    otherlv_5=(Token)match(input,45,FOLLOW_7); 

            	    									newLeafNode(otherlv_5, grammarAccess.getHigherOrderAlgorithmExecutionAccess().getAlgorithmKeyword_4_0_0());
            	    								
            	    // InternalPanoptesX.g:2857:9: ( ( ruleEString ) )
            	    // InternalPanoptesX.g:2858:10: ( ruleEString )
            	    {
            	    // InternalPanoptesX.g:2858:10: ( ruleEString )
            	    // InternalPanoptesX.g:2859:11: ruleEString
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getHigherOrderAlgorithmExecutionRule());
            	    											}
            	    										

            	    											newCompositeNode(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getAlgorithmHigherOrderAlgorithmCrossReference_4_0_1_0());
            	    										
            	    pushFollow(FOLLOW_43);
            	    ruleEString();

            	    state._fsp--;


            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalPanoptesX.g:2879:4: ({...}? => ( ({...}? => (otherlv_7= 'observed' otherlv_8= 'execution' ( ( ruleEString ) ) ) ) ) )
            	    {
            	    // InternalPanoptesX.g:2879:4: ({...}? => ( ({...}? => (otherlv_7= 'observed' otherlv_8= 'execution' ( ( ruleEString ) ) ) ) ) )
            	    // InternalPanoptesX.g:2880:5: {...}? => ( ({...}? => (otherlv_7= 'observed' otherlv_8= 'execution' ( ( ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getUnorderedGroup_4(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleHigherOrderAlgorithmExecution", "getUnorderedGroupHelper().canSelect(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // InternalPanoptesX.g:2880:126: ( ({...}? => (otherlv_7= 'observed' otherlv_8= 'execution' ( ( ruleEString ) ) ) ) )
            	    // InternalPanoptesX.g:2881:6: ({...}? => (otherlv_7= 'observed' otherlv_8= 'execution' ( ( ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getUnorderedGroup_4(), 1);
            	    					
            	    // InternalPanoptesX.g:2884:9: ({...}? => (otherlv_7= 'observed' otherlv_8= 'execution' ( ( ruleEString ) ) ) )
            	    // InternalPanoptesX.g:2884:10: {...}? => (otherlv_7= 'observed' otherlv_8= 'execution' ( ( ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleHigherOrderAlgorithmExecution", "true");
            	    }
            	    // InternalPanoptesX.g:2884:19: (otherlv_7= 'observed' otherlv_8= 'execution' ( ( ruleEString ) ) )
            	    // InternalPanoptesX.g:2884:20: otherlv_7= 'observed' otherlv_8= 'execution' ( ( ruleEString ) )
            	    {
            	    otherlv_7=(Token)match(input,52,FOLLOW_44); 

            	    									newLeafNode(otherlv_7, grammarAccess.getHigherOrderAlgorithmExecutionAccess().getObservedKeyword_4_1_0());
            	    								
            	    otherlv_8=(Token)match(input,53,FOLLOW_7); 

            	    									newLeafNode(otherlv_8, grammarAccess.getHigherOrderAlgorithmExecutionAccess().getExecutionKeyword_4_1_1());
            	    								
            	    // InternalPanoptesX.g:2892:9: ( ( ruleEString ) )
            	    // InternalPanoptesX.g:2893:10: ( ruleEString )
            	    {
            	    // InternalPanoptesX.g:2893:10: ( ruleEString )
            	    // InternalPanoptesX.g:2894:11: ruleEString
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getHigherOrderAlgorithmExecutionRule());
            	    											}
            	    										

            	    											newCompositeNode(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getAlgorithmExecutionAlgorithmExecutionCrossReference_4_1_2_0());
            	    										
            	    pushFollow(FOLLOW_43);
            	    ruleEString();

            	    state._fsp--;


            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalPanoptesX.g:2914:4: ({...}? => ( ({...}? => (otherlv_10= 'actions' ( (lv_ActionExecutionMap_11_0= ruleactionExecutionEntry ) ) (otherlv_12= ',' ( (lv_ActionExecutionMap_13_0= ruleactionExecutionEntry ) ) )* ) ) ) )
            	    {
            	    // InternalPanoptesX.g:2914:4: ({...}? => ( ({...}? => (otherlv_10= 'actions' ( (lv_ActionExecutionMap_11_0= ruleactionExecutionEntry ) ) (otherlv_12= ',' ( (lv_ActionExecutionMap_13_0= ruleactionExecutionEntry ) ) )* ) ) ) )
            	    // InternalPanoptesX.g:2915:5: {...}? => ( ({...}? => (otherlv_10= 'actions' ( (lv_ActionExecutionMap_11_0= ruleactionExecutionEntry ) ) (otherlv_12= ',' ( (lv_ActionExecutionMap_13_0= ruleactionExecutionEntry ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getUnorderedGroup_4(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleHigherOrderAlgorithmExecution", "getUnorderedGroupHelper().canSelect(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getUnorderedGroup_4(), 2)");
            	    }
            	    // InternalPanoptesX.g:2915:126: ( ({...}? => (otherlv_10= 'actions' ( (lv_ActionExecutionMap_11_0= ruleactionExecutionEntry ) ) (otherlv_12= ',' ( (lv_ActionExecutionMap_13_0= ruleactionExecutionEntry ) ) )* ) ) )
            	    // InternalPanoptesX.g:2916:6: ({...}? => (otherlv_10= 'actions' ( (lv_ActionExecutionMap_11_0= ruleactionExecutionEntry ) ) (otherlv_12= ',' ( (lv_ActionExecutionMap_13_0= ruleactionExecutionEntry ) ) )* ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getUnorderedGroup_4(), 2);
            	    					
            	    // InternalPanoptesX.g:2919:9: ({...}? => (otherlv_10= 'actions' ( (lv_ActionExecutionMap_11_0= ruleactionExecutionEntry ) ) (otherlv_12= ',' ( (lv_ActionExecutionMap_13_0= ruleactionExecutionEntry ) ) )* ) )
            	    // InternalPanoptesX.g:2919:10: {...}? => (otherlv_10= 'actions' ( (lv_ActionExecutionMap_11_0= ruleactionExecutionEntry ) ) (otherlv_12= ',' ( (lv_ActionExecutionMap_13_0= ruleactionExecutionEntry ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleHigherOrderAlgorithmExecution", "true");
            	    }
            	    // InternalPanoptesX.g:2919:19: (otherlv_10= 'actions' ( (lv_ActionExecutionMap_11_0= ruleactionExecutionEntry ) ) (otherlv_12= ',' ( (lv_ActionExecutionMap_13_0= ruleactionExecutionEntry ) ) )* )
            	    // InternalPanoptesX.g:2919:20: otherlv_10= 'actions' ( (lv_ActionExecutionMap_11_0= ruleactionExecutionEntry ) ) (otherlv_12= ',' ( (lv_ActionExecutionMap_13_0= ruleactionExecutionEntry ) ) )*
            	    {
            	    otherlv_10=(Token)match(input,48,FOLLOW_29); 

            	    									newLeafNode(otherlv_10, grammarAccess.getHigherOrderAlgorithmExecutionAccess().getActionsKeyword_4_2_0());
            	    								
            	    // InternalPanoptesX.g:2923:9: ( (lv_ActionExecutionMap_11_0= ruleactionExecutionEntry ) )
            	    // InternalPanoptesX.g:2924:10: (lv_ActionExecutionMap_11_0= ruleactionExecutionEntry )
            	    {
            	    // InternalPanoptesX.g:2924:10: (lv_ActionExecutionMap_11_0= ruleactionExecutionEntry )
            	    // InternalPanoptesX.g:2925:11: lv_ActionExecutionMap_11_0= ruleactionExecutionEntry
            	    {

            	    											newCompositeNode(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getActionExecutionMapActionExecutionEntryParserRuleCall_4_2_1_0());
            	    										
            	    pushFollow(FOLLOW_45);
            	    lv_ActionExecutionMap_11_0=ruleactionExecutionEntry();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getHigherOrderAlgorithmExecutionRule());
            	    											}
            	    											add(
            	    												current,
            	    												"ActionExecutionMap",
            	    												lv_ActionExecutionMap_11_0,
            	    												"org.lowcomote.panoptes.PanoptesX.actionExecutionEntry");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalPanoptesX.g:2942:9: (otherlv_12= ',' ( (lv_ActionExecutionMap_13_0= ruleactionExecutionEntry ) ) )*
            	    loop53:
            	    do {
            	        int alt53=2;
            	        int LA53_0 = input.LA(1);

            	        if ( (LA53_0==16) ) {
            	            alt53=1;
            	        }


            	        switch (alt53) {
            	    	case 1 :
            	    	    // InternalPanoptesX.g:2943:10: otherlv_12= ',' ( (lv_ActionExecutionMap_13_0= ruleactionExecutionEntry ) )
            	    	    {
            	    	    otherlv_12=(Token)match(input,16,FOLLOW_29); 

            	    	    										newLeafNode(otherlv_12, grammarAccess.getHigherOrderAlgorithmExecutionAccess().getCommaKeyword_4_2_2_0());
            	    	    									
            	    	    // InternalPanoptesX.g:2947:10: ( (lv_ActionExecutionMap_13_0= ruleactionExecutionEntry ) )
            	    	    // InternalPanoptesX.g:2948:11: (lv_ActionExecutionMap_13_0= ruleactionExecutionEntry )
            	    	    {
            	    	    // InternalPanoptesX.g:2948:11: (lv_ActionExecutionMap_13_0= ruleactionExecutionEntry )
            	    	    // InternalPanoptesX.g:2949:12: lv_ActionExecutionMap_13_0= ruleactionExecutionEntry
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getActionExecutionMapActionExecutionEntryParserRuleCall_4_2_2_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_45);
            	    	    lv_ActionExecutionMap_13_0=ruleactionExecutionEntry();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getHigherOrderAlgorithmExecutionRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"ActionExecutionMap",
            	    	    													lv_ActionExecutionMap_13_0,
            	    	    													"org.lowcomote.panoptes.PanoptesX.actionExecutionEntry");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop53;
            	        }
            	    } while (true);


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalPanoptesX.g:2973:4: ({...}? => ( ({...}? => ( (otherlv_14= 'minimum' | otherlv_15= 'min' ) otherlv_16= 'observations' ( (lv_minDataPoints_17_0= ruleEIntegerObject ) ) ) ) ) )
            	    {
            	    // InternalPanoptesX.g:2973:4: ({...}? => ( ({...}? => ( (otherlv_14= 'minimum' | otherlv_15= 'min' ) otherlv_16= 'observations' ( (lv_minDataPoints_17_0= ruleEIntegerObject ) ) ) ) ) )
            	    // InternalPanoptesX.g:2974:5: {...}? => ( ({...}? => ( (otherlv_14= 'minimum' | otherlv_15= 'min' ) otherlv_16= 'observations' ( (lv_minDataPoints_17_0= ruleEIntegerObject ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getUnorderedGroup_4(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleHigherOrderAlgorithmExecution", "getUnorderedGroupHelper().canSelect(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getUnorderedGroup_4(), 3)");
            	    }
            	    // InternalPanoptesX.g:2974:126: ( ({...}? => ( (otherlv_14= 'minimum' | otherlv_15= 'min' ) otherlv_16= 'observations' ( (lv_minDataPoints_17_0= ruleEIntegerObject ) ) ) ) )
            	    // InternalPanoptesX.g:2975:6: ({...}? => ( (otherlv_14= 'minimum' | otherlv_15= 'min' ) otherlv_16= 'observations' ( (lv_minDataPoints_17_0= ruleEIntegerObject ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getUnorderedGroup_4(), 3);
            	    					
            	    // InternalPanoptesX.g:2978:9: ({...}? => ( (otherlv_14= 'minimum' | otherlv_15= 'min' ) otherlv_16= 'observations' ( (lv_minDataPoints_17_0= ruleEIntegerObject ) ) ) )
            	    // InternalPanoptesX.g:2978:10: {...}? => ( (otherlv_14= 'minimum' | otherlv_15= 'min' ) otherlv_16= 'observations' ( (lv_minDataPoints_17_0= ruleEIntegerObject ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleHigherOrderAlgorithmExecution", "true");
            	    }
            	    // InternalPanoptesX.g:2978:19: ( (otherlv_14= 'minimum' | otherlv_15= 'min' ) otherlv_16= 'observations' ( (lv_minDataPoints_17_0= ruleEIntegerObject ) ) )
            	    // InternalPanoptesX.g:2978:20: (otherlv_14= 'minimum' | otherlv_15= 'min' ) otherlv_16= 'observations' ( (lv_minDataPoints_17_0= ruleEIntegerObject ) )
            	    {
            	    // InternalPanoptesX.g:2978:20: (otherlv_14= 'minimum' | otherlv_15= 'min' )
            	    int alt54=2;
            	    int LA54_0 = input.LA(1);

            	    if ( (LA54_0==54) ) {
            	        alt54=1;
            	    }
            	    else if ( (LA54_0==55) ) {
            	        alt54=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 54, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt54) {
            	        case 1 :
            	            // InternalPanoptesX.g:2979:10: otherlv_14= 'minimum'
            	            {
            	            otherlv_14=(Token)match(input,54,FOLLOW_46); 

            	            										newLeafNode(otherlv_14, grammarAccess.getHigherOrderAlgorithmExecutionAccess().getMinimumKeyword_4_3_0_0());
            	            									

            	            }
            	            break;
            	        case 2 :
            	            // InternalPanoptesX.g:2984:10: otherlv_15= 'min'
            	            {
            	            otherlv_15=(Token)match(input,55,FOLLOW_46); 

            	            										newLeafNode(otherlv_15, grammarAccess.getHigherOrderAlgorithmExecutionAccess().getMinKeyword_4_3_0_1());
            	            									

            	            }
            	            break;

            	    }

            	    otherlv_16=(Token)match(input,56,FOLLOW_29); 

            	    									newLeafNode(otherlv_16, grammarAccess.getHigherOrderAlgorithmExecutionAccess().getObservationsKeyword_4_3_1());
            	    								
            	    // InternalPanoptesX.g:2993:9: ( (lv_minDataPoints_17_0= ruleEIntegerObject ) )
            	    // InternalPanoptesX.g:2994:10: (lv_minDataPoints_17_0= ruleEIntegerObject )
            	    {
            	    // InternalPanoptesX.g:2994:10: (lv_minDataPoints_17_0= ruleEIntegerObject )
            	    // InternalPanoptesX.g:2995:11: lv_minDataPoints_17_0= ruleEIntegerObject
            	    {

            	    											newCompositeNode(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getMinDataPointsEIntegerObjectParserRuleCall_4_3_2_0());
            	    										
            	    pushFollow(FOLLOW_43);
            	    lv_minDataPoints_17_0=ruleEIntegerObject();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getHigherOrderAlgorithmExecutionRule());
            	    											}
            	    											set(
            	    												current,
            	    												"minDataPoints",
            	    												lv_minDataPoints_17_0,
            	    												"org.lowcomote.panoptes.PanoptesX.EIntegerObject");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalPanoptesX.g:3018:4: ({...}? => ( ({...}? => ( (otherlv_18= 'maximum' | otherlv_19= 'max' ) otherlv_20= 'observations' ( (lv_maxDataPoints_21_0= ruleEIntegerObject ) ) ) ) ) )
            	    {
            	    // InternalPanoptesX.g:3018:4: ({...}? => ( ({...}? => ( (otherlv_18= 'maximum' | otherlv_19= 'max' ) otherlv_20= 'observations' ( (lv_maxDataPoints_21_0= ruleEIntegerObject ) ) ) ) ) )
            	    // InternalPanoptesX.g:3019:5: {...}? => ( ({...}? => ( (otherlv_18= 'maximum' | otherlv_19= 'max' ) otherlv_20= 'observations' ( (lv_maxDataPoints_21_0= ruleEIntegerObject ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getUnorderedGroup_4(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleHigherOrderAlgorithmExecution", "getUnorderedGroupHelper().canSelect(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getUnorderedGroup_4(), 4)");
            	    }
            	    // InternalPanoptesX.g:3019:126: ( ({...}? => ( (otherlv_18= 'maximum' | otherlv_19= 'max' ) otherlv_20= 'observations' ( (lv_maxDataPoints_21_0= ruleEIntegerObject ) ) ) ) )
            	    // InternalPanoptesX.g:3020:6: ({...}? => ( (otherlv_18= 'maximum' | otherlv_19= 'max' ) otherlv_20= 'observations' ( (lv_maxDataPoints_21_0= ruleEIntegerObject ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getUnorderedGroup_4(), 4);
            	    					
            	    // InternalPanoptesX.g:3023:9: ({...}? => ( (otherlv_18= 'maximum' | otherlv_19= 'max' ) otherlv_20= 'observations' ( (lv_maxDataPoints_21_0= ruleEIntegerObject ) ) ) )
            	    // InternalPanoptesX.g:3023:10: {...}? => ( (otherlv_18= 'maximum' | otherlv_19= 'max' ) otherlv_20= 'observations' ( (lv_maxDataPoints_21_0= ruleEIntegerObject ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleHigherOrderAlgorithmExecution", "true");
            	    }
            	    // InternalPanoptesX.g:3023:19: ( (otherlv_18= 'maximum' | otherlv_19= 'max' ) otherlv_20= 'observations' ( (lv_maxDataPoints_21_0= ruleEIntegerObject ) ) )
            	    // InternalPanoptesX.g:3023:20: (otherlv_18= 'maximum' | otherlv_19= 'max' ) otherlv_20= 'observations' ( (lv_maxDataPoints_21_0= ruleEIntegerObject ) )
            	    {
            	    // InternalPanoptesX.g:3023:20: (otherlv_18= 'maximum' | otherlv_19= 'max' )
            	    int alt55=2;
            	    int LA55_0 = input.LA(1);

            	    if ( (LA55_0==57) ) {
            	        alt55=1;
            	    }
            	    else if ( (LA55_0==58) ) {
            	        alt55=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 55, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt55) {
            	        case 1 :
            	            // InternalPanoptesX.g:3024:10: otherlv_18= 'maximum'
            	            {
            	            otherlv_18=(Token)match(input,57,FOLLOW_46); 

            	            										newLeafNode(otherlv_18, grammarAccess.getHigherOrderAlgorithmExecutionAccess().getMaximumKeyword_4_4_0_0());
            	            									

            	            }
            	            break;
            	        case 2 :
            	            // InternalPanoptesX.g:3029:10: otherlv_19= 'max'
            	            {
            	            otherlv_19=(Token)match(input,58,FOLLOW_46); 

            	            										newLeafNode(otherlv_19, grammarAccess.getHigherOrderAlgorithmExecutionAccess().getMaxKeyword_4_4_0_1());
            	            									

            	            }
            	            break;

            	    }

            	    otherlv_20=(Token)match(input,56,FOLLOW_29); 

            	    									newLeafNode(otherlv_20, grammarAccess.getHigherOrderAlgorithmExecutionAccess().getObservationsKeyword_4_4_1());
            	    								
            	    // InternalPanoptesX.g:3038:9: ( (lv_maxDataPoints_21_0= ruleEIntegerObject ) )
            	    // InternalPanoptesX.g:3039:10: (lv_maxDataPoints_21_0= ruleEIntegerObject )
            	    {
            	    // InternalPanoptesX.g:3039:10: (lv_maxDataPoints_21_0= ruleEIntegerObject )
            	    // InternalPanoptesX.g:3040:11: lv_maxDataPoints_21_0= ruleEIntegerObject
            	    {

            	    											newCompositeNode(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getMaxDataPointsEIntegerObjectParserRuleCall_4_4_2_0());
            	    										
            	    pushFollow(FOLLOW_43);
            	    lv_maxDataPoints_21_0=ruleEIntegerObject();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getHigherOrderAlgorithmExecutionRule());
            	    											}
            	    											set(
            	    												current,
            	    												"maxDataPoints",
            	    												lv_maxDataPoints_21_0,
            	    												"org.lowcomote.panoptes.PanoptesX.EIntegerObject");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalPanoptesX.g:3063:4: ({...}? => ( ({...}? => (otherlv_22= 'parameter' otherlv_23= 'values' ( (lv_parameterValueMap_24_0= ruleparameterValueEntry ) ) (otherlv_25= ',' ( (lv_parameterValueMap_26_0= ruleparameterValueEntry ) ) )* ) ) ) )
            	    {
            	    // InternalPanoptesX.g:3063:4: ({...}? => ( ({...}? => (otherlv_22= 'parameter' otherlv_23= 'values' ( (lv_parameterValueMap_24_0= ruleparameterValueEntry ) ) (otherlv_25= ',' ( (lv_parameterValueMap_26_0= ruleparameterValueEntry ) ) )* ) ) ) )
            	    // InternalPanoptesX.g:3064:5: {...}? => ( ({...}? => (otherlv_22= 'parameter' otherlv_23= 'values' ( (lv_parameterValueMap_24_0= ruleparameterValueEntry ) ) (otherlv_25= ',' ( (lv_parameterValueMap_26_0= ruleparameterValueEntry ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getUnorderedGroup_4(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleHigherOrderAlgorithmExecution", "getUnorderedGroupHelper().canSelect(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getUnorderedGroup_4(), 5)");
            	    }
            	    // InternalPanoptesX.g:3064:126: ( ({...}? => (otherlv_22= 'parameter' otherlv_23= 'values' ( (lv_parameterValueMap_24_0= ruleparameterValueEntry ) ) (otherlv_25= ',' ( (lv_parameterValueMap_26_0= ruleparameterValueEntry ) ) )* ) ) )
            	    // InternalPanoptesX.g:3065:6: ({...}? => (otherlv_22= 'parameter' otherlv_23= 'values' ( (lv_parameterValueMap_24_0= ruleparameterValueEntry ) ) (otherlv_25= ',' ( (lv_parameterValueMap_26_0= ruleparameterValueEntry ) ) )* ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getUnorderedGroup_4(), 5);
            	    					
            	    // InternalPanoptesX.g:3068:9: ({...}? => (otherlv_22= 'parameter' otherlv_23= 'values' ( (lv_parameterValueMap_24_0= ruleparameterValueEntry ) ) (otherlv_25= ',' ( (lv_parameterValueMap_26_0= ruleparameterValueEntry ) ) )* ) )
            	    // InternalPanoptesX.g:3068:10: {...}? => (otherlv_22= 'parameter' otherlv_23= 'values' ( (lv_parameterValueMap_24_0= ruleparameterValueEntry ) ) (otherlv_25= ',' ( (lv_parameterValueMap_26_0= ruleparameterValueEntry ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleHigherOrderAlgorithmExecution", "true");
            	    }
            	    // InternalPanoptesX.g:3068:19: (otherlv_22= 'parameter' otherlv_23= 'values' ( (lv_parameterValueMap_24_0= ruleparameterValueEntry ) ) (otherlv_25= ',' ( (lv_parameterValueMap_26_0= ruleparameterValueEntry ) ) )* )
            	    // InternalPanoptesX.g:3068:20: otherlv_22= 'parameter' otherlv_23= 'values' ( (lv_parameterValueMap_24_0= ruleparameterValueEntry ) ) (otherlv_25= ',' ( (lv_parameterValueMap_26_0= ruleparameterValueEntry ) ) )*
            	    {
            	    otherlv_22=(Token)match(input,49,FOLLOW_41); 

            	    									newLeafNode(otherlv_22, grammarAccess.getHigherOrderAlgorithmExecutionAccess().getParameterKeyword_4_5_0());
            	    								
            	    otherlv_23=(Token)match(input,50,FOLLOW_4); 

            	    									newLeafNode(otherlv_23, grammarAccess.getHigherOrderAlgorithmExecutionAccess().getValuesKeyword_4_5_1());
            	    								
            	    // InternalPanoptesX.g:3076:9: ( (lv_parameterValueMap_24_0= ruleparameterValueEntry ) )
            	    // InternalPanoptesX.g:3077:10: (lv_parameterValueMap_24_0= ruleparameterValueEntry )
            	    {
            	    // InternalPanoptesX.g:3077:10: (lv_parameterValueMap_24_0= ruleparameterValueEntry )
            	    // InternalPanoptesX.g:3078:11: lv_parameterValueMap_24_0= ruleparameterValueEntry
            	    {

            	    											newCompositeNode(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getParameterValueMapParameterValueEntryParserRuleCall_4_5_2_0());
            	    										
            	    pushFollow(FOLLOW_45);
            	    lv_parameterValueMap_24_0=ruleparameterValueEntry();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getHigherOrderAlgorithmExecutionRule());
            	    											}
            	    											add(
            	    												current,
            	    												"parameterValueMap",
            	    												lv_parameterValueMap_24_0,
            	    												"org.lowcomote.panoptes.PanoptesX.parameterValueEntry");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalPanoptesX.g:3095:9: (otherlv_25= ',' ( (lv_parameterValueMap_26_0= ruleparameterValueEntry ) ) )*
            	    loop56:
            	    do {
            	        int alt56=2;
            	        int LA56_0 = input.LA(1);

            	        if ( (LA56_0==16) ) {
            	            alt56=1;
            	        }


            	        switch (alt56) {
            	    	case 1 :
            	    	    // InternalPanoptesX.g:3096:10: otherlv_25= ',' ( (lv_parameterValueMap_26_0= ruleparameterValueEntry ) )
            	    	    {
            	    	    otherlv_25=(Token)match(input,16,FOLLOW_4); 

            	    	    										newLeafNode(otherlv_25, grammarAccess.getHigherOrderAlgorithmExecutionAccess().getCommaKeyword_4_5_3_0());
            	    	    									
            	    	    // InternalPanoptesX.g:3100:10: ( (lv_parameterValueMap_26_0= ruleparameterValueEntry ) )
            	    	    // InternalPanoptesX.g:3101:11: (lv_parameterValueMap_26_0= ruleparameterValueEntry )
            	    	    {
            	    	    // InternalPanoptesX.g:3101:11: (lv_parameterValueMap_26_0= ruleparameterValueEntry )
            	    	    // InternalPanoptesX.g:3102:12: lv_parameterValueMap_26_0= ruleparameterValueEntry
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getParameterValueMapParameterValueEntryParserRuleCall_4_5_3_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_45);
            	    	    lv_parameterValueMap_26_0=ruleparameterValueEntry();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getHigherOrderAlgorithmExecutionRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"parameterValueMap",
            	    	    													lv_parameterValueMap_26_0,
            	    	    													"org.lowcomote.panoptes.PanoptesX.parameterValueEntry");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop56;
            	        }
            	    } while (true);


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt57 >= 1 ) break loop57;
                        EarlyExitException eee =
                            new EarlyExitException(57, input);
                        throw eee;
                }
                cnt57++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getUnorderedGroup_4()) ) {
                throw new FailedPredicateException(input, "ruleHigherOrderAlgorithmExecution", "getUnorderedGroupHelper().canLeave(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getUnorderedGroup_4())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getUnorderedGroup_4());
            				

            }

            otherlv_27=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_27, grammarAccess.getHigherOrderAlgorithmExecutionAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleHigherOrderAlgorithmExecution"


    // $ANTLR start "entryRuleactionExecutionEntry"
    // InternalPanoptesX.g:3142:1: entryRuleactionExecutionEntry returns [EObject current=null] : iv_ruleactionExecutionEntry= ruleactionExecutionEntry EOF ;
    public final EObject entryRuleactionExecutionEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleactionExecutionEntry = null;


        try {
            // InternalPanoptesX.g:3142:61: (iv_ruleactionExecutionEntry= ruleactionExecutionEntry EOF )
            // InternalPanoptesX.g:3143:2: iv_ruleactionExecutionEntry= ruleactionExecutionEntry EOF
            {
             newCompositeNode(grammarAccess.getActionExecutionEntryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleactionExecutionEntry=ruleactionExecutionEntry();

            state._fsp--;

             current =iv_ruleactionExecutionEntry; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleactionExecutionEntry"


    // $ANTLR start "ruleactionExecutionEntry"
    // InternalPanoptesX.g:3149:1: ruleactionExecutionEntry returns [EObject current=null] : ( () ( (lv_key_1_0= ruleEIntegerObject ) ) otherlv_2= '->' ( ( ruleEString ) ) ) ;
    public final EObject ruleactionExecutionEntry() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_key_1_0 = null;



        	enterRule();

        try {
            // InternalPanoptesX.g:3155:2: ( ( () ( (lv_key_1_0= ruleEIntegerObject ) ) otherlv_2= '->' ( ( ruleEString ) ) ) )
            // InternalPanoptesX.g:3156:2: ( () ( (lv_key_1_0= ruleEIntegerObject ) ) otherlv_2= '->' ( ( ruleEString ) ) )
            {
            // InternalPanoptesX.g:3156:2: ( () ( (lv_key_1_0= ruleEIntegerObject ) ) otherlv_2= '->' ( ( ruleEString ) ) )
            // InternalPanoptesX.g:3157:3: () ( (lv_key_1_0= ruleEIntegerObject ) ) otherlv_2= '->' ( ( ruleEString ) )
            {
            // InternalPanoptesX.g:3157:3: ()
            // InternalPanoptesX.g:3158:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActionExecutionEntryAccess().getActionExecutionEntryAction_0(),
            					current);
            			

            }

            // InternalPanoptesX.g:3164:3: ( (lv_key_1_0= ruleEIntegerObject ) )
            // InternalPanoptesX.g:3165:4: (lv_key_1_0= ruleEIntegerObject )
            {
            // InternalPanoptesX.g:3165:4: (lv_key_1_0= ruleEIntegerObject )
            // InternalPanoptesX.g:3166:5: lv_key_1_0= ruleEIntegerObject
            {

            					newCompositeNode(grammarAccess.getActionExecutionEntryAccess().getKeyEIntegerObjectParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_47);
            lv_key_1_0=ruleEIntegerObject();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActionExecutionEntryRule());
            					}
            					set(
            						current,
            						"key",
            						lv_key_1_0,
            						"org.lowcomote.panoptes.PanoptesX.EIntegerObject");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,59,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getActionExecutionEntryAccess().getHyphenMinusGreaterThanSignKeyword_2());
            		
            // InternalPanoptesX.g:3187:3: ( ( ruleEString ) )
            // InternalPanoptesX.g:3188:4: ( ruleEString )
            {
            // InternalPanoptesX.g:3188:4: ( ruleEString )
            // InternalPanoptesX.g:3189:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionExecutionEntryRule());
            					}
            				

            					newCompositeNode(grammarAccess.getActionExecutionEntryAccess().getValueActionExecutionCrossReference_3_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleactionExecutionEntry"


    // $ANTLR start "entryRuleTriggerGroup"
    // InternalPanoptesX.g:3207:1: entryRuleTriggerGroup returns [EObject current=null] : iv_ruleTriggerGroup= ruleTriggerGroup EOF ;
    public final EObject entryRuleTriggerGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTriggerGroup = null;


        try {
            // InternalPanoptesX.g:3207:53: (iv_ruleTriggerGroup= ruleTriggerGroup EOF )
            // InternalPanoptesX.g:3208:2: iv_ruleTriggerGroup= ruleTriggerGroup EOF
            {
             newCompositeNode(grammarAccess.getTriggerGroupRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTriggerGroup=ruleTriggerGroup();

            state._fsp--;

             current =iv_ruleTriggerGroup; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTriggerGroup"


    // $ANTLR start "ruleTriggerGroup"
    // InternalPanoptesX.g:3214:1: ruleTriggerGroup returns [EObject current=null] : ( () otherlv_1= 'Trigger' ( ( (lv_name_2_1= RULE_STRING | lv_name_2_2= RULE_SAFESTRING ) ) ) otherlv_3= '{' ( (lv_compositeTriggers_4_0= ruleCompositeTrigger ) ) (otherlv_5= 'or' ( (lv_compositeTriggers_6_0= ruleCompositeTrigger ) ) )* otherlv_7= 'execute' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= '}' ) ;
    public final EObject ruleTriggerGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_1=null;
        Token lv_name_2_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_compositeTriggers_4_0 = null;

        EObject lv_compositeTriggers_6_0 = null;



        	enterRule();

        try {
            // InternalPanoptesX.g:3220:2: ( ( () otherlv_1= 'Trigger' ( ( (lv_name_2_1= RULE_STRING | lv_name_2_2= RULE_SAFESTRING ) ) ) otherlv_3= '{' ( (lv_compositeTriggers_4_0= ruleCompositeTrigger ) ) (otherlv_5= 'or' ( (lv_compositeTriggers_6_0= ruleCompositeTrigger ) ) )* otherlv_7= 'execute' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= '}' ) )
            // InternalPanoptesX.g:3221:2: ( () otherlv_1= 'Trigger' ( ( (lv_name_2_1= RULE_STRING | lv_name_2_2= RULE_SAFESTRING ) ) ) otherlv_3= '{' ( (lv_compositeTriggers_4_0= ruleCompositeTrigger ) ) (otherlv_5= 'or' ( (lv_compositeTriggers_6_0= ruleCompositeTrigger ) ) )* otherlv_7= 'execute' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= '}' )
            {
            // InternalPanoptesX.g:3221:2: ( () otherlv_1= 'Trigger' ( ( (lv_name_2_1= RULE_STRING | lv_name_2_2= RULE_SAFESTRING ) ) ) otherlv_3= '{' ( (lv_compositeTriggers_4_0= ruleCompositeTrigger ) ) (otherlv_5= 'or' ( (lv_compositeTriggers_6_0= ruleCompositeTrigger ) ) )* otherlv_7= 'execute' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= '}' )
            // InternalPanoptesX.g:3222:3: () otherlv_1= 'Trigger' ( ( (lv_name_2_1= RULE_STRING | lv_name_2_2= RULE_SAFESTRING ) ) ) otherlv_3= '{' ( (lv_compositeTriggers_4_0= ruleCompositeTrigger ) ) (otherlv_5= 'or' ( (lv_compositeTriggers_6_0= ruleCompositeTrigger ) ) )* otherlv_7= 'execute' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= '}'
            {
            // InternalPanoptesX.g:3222:3: ()
            // InternalPanoptesX.g:3223:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTriggerGroupAccess().getTriggerGroupAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,60,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getTriggerGroupAccess().getTriggerKeyword_1());
            		
            // InternalPanoptesX.g:3233:3: ( ( (lv_name_2_1= RULE_STRING | lv_name_2_2= RULE_SAFESTRING ) ) )
            // InternalPanoptesX.g:3234:4: ( (lv_name_2_1= RULE_STRING | lv_name_2_2= RULE_SAFESTRING ) )
            {
            // InternalPanoptesX.g:3234:4: ( (lv_name_2_1= RULE_STRING | lv_name_2_2= RULE_SAFESTRING ) )
            // InternalPanoptesX.g:3235:5: (lv_name_2_1= RULE_STRING | lv_name_2_2= RULE_SAFESTRING )
            {
            // InternalPanoptesX.g:3235:5: (lv_name_2_1= RULE_STRING | lv_name_2_2= RULE_SAFESTRING )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_STRING) ) {
                alt58=1;
            }
            else if ( (LA58_0==RULE_SAFESTRING) ) {
                alt58=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // InternalPanoptesX.g:3236:6: lv_name_2_1= RULE_STRING
                    {
                    lv_name_2_1=(Token)match(input,RULE_STRING,FOLLOW_5); 

                    						newLeafNode(lv_name_2_1, grammarAccess.getTriggerGroupAccess().getNameSTRINGTerminalRuleCall_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTriggerGroupRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_2_1,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }
                    break;
                case 2 :
                    // InternalPanoptesX.g:3251:6: lv_name_2_2= RULE_SAFESTRING
                    {
                    lv_name_2_2=(Token)match(input,RULE_SAFESTRING,FOLLOW_5); 

                    						newLeafNode(lv_name_2_2, grammarAccess.getTriggerGroupAccess().getNameSAFESTRINGTerminalRuleCall_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTriggerGroupRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_2_2,
                    							"org.lowcomote.panoptes.PanoptesX.SAFESTRING");
                    					

                    }
                    break;

            }


            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_48); 

            			newLeafNode(otherlv_3, grammarAccess.getTriggerGroupAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalPanoptesX.g:3272:3: ( (lv_compositeTriggers_4_0= ruleCompositeTrigger ) )
            // InternalPanoptesX.g:3273:4: (lv_compositeTriggers_4_0= ruleCompositeTrigger )
            {
            // InternalPanoptesX.g:3273:4: (lv_compositeTriggers_4_0= ruleCompositeTrigger )
            // InternalPanoptesX.g:3274:5: lv_compositeTriggers_4_0= ruleCompositeTrigger
            {

            					newCompositeNode(grammarAccess.getTriggerGroupAccess().getCompositeTriggersCompositeTriggerParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_49);
            lv_compositeTriggers_4_0=ruleCompositeTrigger();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTriggerGroupRule());
            					}
            					add(
            						current,
            						"compositeTriggers",
            						lv_compositeTriggers_4_0,
            						"org.lowcomote.panoptes.PanoptesX.CompositeTrigger");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPanoptesX.g:3291:3: (otherlv_5= 'or' ( (lv_compositeTriggers_6_0= ruleCompositeTrigger ) ) )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==61) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // InternalPanoptesX.g:3292:4: otherlv_5= 'or' ( (lv_compositeTriggers_6_0= ruleCompositeTrigger ) )
            	    {
            	    otherlv_5=(Token)match(input,61,FOLLOW_48); 

            	    				newLeafNode(otherlv_5, grammarAccess.getTriggerGroupAccess().getOrKeyword_5_0());
            	    			
            	    // InternalPanoptesX.g:3296:4: ( (lv_compositeTriggers_6_0= ruleCompositeTrigger ) )
            	    // InternalPanoptesX.g:3297:5: (lv_compositeTriggers_6_0= ruleCompositeTrigger )
            	    {
            	    // InternalPanoptesX.g:3297:5: (lv_compositeTriggers_6_0= ruleCompositeTrigger )
            	    // InternalPanoptesX.g:3298:6: lv_compositeTriggers_6_0= ruleCompositeTrigger
            	    {

            	    						newCompositeNode(grammarAccess.getTriggerGroupAccess().getCompositeTriggersCompositeTriggerParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_49);
            	    lv_compositeTriggers_6_0=ruleCompositeTrigger();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTriggerGroupRule());
            	    						}
            	    						add(
            	    							current,
            	    							"compositeTriggers",
            	    							lv_compositeTriggers_6_0,
            	    							"org.lowcomote.panoptes.PanoptesX.CompositeTrigger");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop59;
                }
            } while (true);

            otherlv_7=(Token)match(input,62,FOLLOW_7); 

            			newLeafNode(otherlv_7, grammarAccess.getTriggerGroupAccess().getExecuteKeyword_6());
            		
            // InternalPanoptesX.g:3320:3: ( ( ruleEString ) )
            // InternalPanoptesX.g:3321:4: ( ruleEString )
            {
            // InternalPanoptesX.g:3321:4: ( ruleEString )
            // InternalPanoptesX.g:3322:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTriggerGroupRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTriggerGroupAccess().getTargetsBaseAlgorithmExecutionCrossReference_7_0());
            				
            pushFollow(FOLLOW_14);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPanoptesX.g:3336:3: (otherlv_9= ',' ( ( ruleEString ) ) )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==16) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // InternalPanoptesX.g:3337:4: otherlv_9= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_9=(Token)match(input,16,FOLLOW_7); 

            	    				newLeafNode(otherlv_9, grammarAccess.getTriggerGroupAccess().getCommaKeyword_8_0());
            	    			
            	    // InternalPanoptesX.g:3341:4: ( ( ruleEString ) )
            	    // InternalPanoptesX.g:3342:5: ( ruleEString )
            	    {
            	    // InternalPanoptesX.g:3342:5: ( ruleEString )
            	    // InternalPanoptesX.g:3343:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getTriggerGroupRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getTriggerGroupAccess().getTargetsBaseAlgorithmExecutionCrossReference_8_1_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);

            otherlv_11=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getTriggerGroupAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleTriggerGroup"


    // $ANTLR start "entryRuleCompositeTrigger"
    // InternalPanoptesX.g:3366:1: entryRuleCompositeTrigger returns [EObject current=null] : iv_ruleCompositeTrigger= ruleCompositeTrigger EOF ;
    public final EObject entryRuleCompositeTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeTrigger = null;


        try {
            // InternalPanoptesX.g:3366:57: (iv_ruleCompositeTrigger= ruleCompositeTrigger EOF )
            // InternalPanoptesX.g:3367:2: iv_ruleCompositeTrigger= ruleCompositeTrigger EOF
            {
             newCompositeNode(grammarAccess.getCompositeTriggerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompositeTrigger=ruleCompositeTrigger();

            state._fsp--;

             current =iv_ruleCompositeTrigger; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCompositeTrigger"


    // $ANTLR start "ruleCompositeTrigger"
    // InternalPanoptesX.g:3373:1: ruleCompositeTrigger returns [EObject current=null] : ( () otherlv_1= 'every' ( ( ( ( ({...}? => ( ({...}? => ( (lv_tt_3_0= ruleTemporalTrigger ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_st_4_0= ruleSampleBasedTrigger ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_pt_5_0= rulePredictionBasedTrigger ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lt_6_0= ruleLabelBasedTrigger ) ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleCompositeTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_tt_3_0 = null;

        EObject lv_st_4_0 = null;

        EObject lv_pt_5_0 = null;

        EObject lv_lt_6_0 = null;



        	enterRule();

        try {
            // InternalPanoptesX.g:3379:2: ( ( () otherlv_1= 'every' ( ( ( ( ({...}? => ( ({...}? => ( (lv_tt_3_0= ruleTemporalTrigger ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_st_4_0= ruleSampleBasedTrigger ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_pt_5_0= rulePredictionBasedTrigger ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lt_6_0= ruleLabelBasedTrigger ) ) ) ) ) )* ) ) ) ) )
            // InternalPanoptesX.g:3380:2: ( () otherlv_1= 'every' ( ( ( ( ({...}? => ( ({...}? => ( (lv_tt_3_0= ruleTemporalTrigger ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_st_4_0= ruleSampleBasedTrigger ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_pt_5_0= rulePredictionBasedTrigger ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lt_6_0= ruleLabelBasedTrigger ) ) ) ) ) )* ) ) ) )
            {
            // InternalPanoptesX.g:3380:2: ( () otherlv_1= 'every' ( ( ( ( ({...}? => ( ({...}? => ( (lv_tt_3_0= ruleTemporalTrigger ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_st_4_0= ruleSampleBasedTrigger ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_pt_5_0= rulePredictionBasedTrigger ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lt_6_0= ruleLabelBasedTrigger ) ) ) ) ) )* ) ) ) )
            // InternalPanoptesX.g:3381:3: () otherlv_1= 'every' ( ( ( ( ({...}? => ( ({...}? => ( (lv_tt_3_0= ruleTemporalTrigger ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_st_4_0= ruleSampleBasedTrigger ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_pt_5_0= rulePredictionBasedTrigger ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lt_6_0= ruleLabelBasedTrigger ) ) ) ) ) )* ) ) )
            {
            // InternalPanoptesX.g:3381:3: ()
            // InternalPanoptesX.g:3382:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCompositeTriggerAccess().getCompositeTriggerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,63,FOLLOW_50); 

            			newLeafNode(otherlv_1, grammarAccess.getCompositeTriggerAccess().getEveryKeyword_1());
            		
            // InternalPanoptesX.g:3392:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_tt_3_0= ruleTemporalTrigger ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_st_4_0= ruleSampleBasedTrigger ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_pt_5_0= rulePredictionBasedTrigger ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lt_6_0= ruleLabelBasedTrigger ) ) ) ) ) )* ) ) )
            // InternalPanoptesX.g:3393:4: ( ( ( ({...}? => ( ({...}? => ( (lv_tt_3_0= ruleTemporalTrigger ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_st_4_0= ruleSampleBasedTrigger ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_pt_5_0= rulePredictionBasedTrigger ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lt_6_0= ruleLabelBasedTrigger ) ) ) ) ) )* ) )
            {
            // InternalPanoptesX.g:3393:4: ( ( ( ({...}? => ( ({...}? => ( (lv_tt_3_0= ruleTemporalTrigger ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_st_4_0= ruleSampleBasedTrigger ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_pt_5_0= rulePredictionBasedTrigger ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lt_6_0= ruleLabelBasedTrigger ) ) ) ) ) )* ) )
            // InternalPanoptesX.g:3394:5: ( ( ({...}? => ( ({...}? => ( (lv_tt_3_0= ruleTemporalTrigger ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_st_4_0= ruleSampleBasedTrigger ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_pt_5_0= rulePredictionBasedTrigger ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lt_6_0= ruleLabelBasedTrigger ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_2());
            				
            // InternalPanoptesX.g:3397:5: ( ( ({...}? => ( ({...}? => ( (lv_tt_3_0= ruleTemporalTrigger ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_st_4_0= ruleSampleBasedTrigger ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_pt_5_0= rulePredictionBasedTrigger ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lt_6_0= ruleLabelBasedTrigger ) ) ) ) ) )* )
            // InternalPanoptesX.g:3398:6: ( ({...}? => ( ({...}? => ( (lv_tt_3_0= ruleTemporalTrigger ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_st_4_0= ruleSampleBasedTrigger ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_pt_5_0= rulePredictionBasedTrigger ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lt_6_0= ruleLabelBasedTrigger ) ) ) ) ) )*
            {
            // InternalPanoptesX.g:3398:6: ( ({...}? => ( ({...}? => ( (lv_tt_3_0= ruleTemporalTrigger ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_st_4_0= ruleSampleBasedTrigger ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_pt_5_0= rulePredictionBasedTrigger ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lt_6_0= ruleLabelBasedTrigger ) ) ) ) ) )*
            loop61:
            do {
                int alt61=5;
                int LA61_0 = input.LA(1);

                if ( ( LA61_0 == RULE_STRING || LA61_0 == 64 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_2(), 0) ) {
                    alt61=1;
                }
                else if ( LA61_0 == RULE_INT && ( getUnorderedGroupHelper().canSelect(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_2(), 3) || getUnorderedGroupHelper().canSelect(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_2(), 2) || getUnorderedGroupHelper().canSelect(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_2(), 1) ) ) {
                    int LA61_3 = input.LA(2);

                    if ( LA61_3 == 65 && getUnorderedGroupHelper().canSelect(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_2(), 1) ) {
                        alt61=2;
                    }
                    else if ( LA61_3 == 66 && getUnorderedGroupHelper().canSelect(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_2(), 2) ) {
                        alt61=3;
                    }
                    else if ( LA61_3 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_2(), 3) ) {
                        alt61=4;
                    }


                }


                switch (alt61) {
            	case 1 :
            	    // InternalPanoptesX.g:3399:4: ({...}? => ( ({...}? => ( (lv_tt_3_0= ruleTemporalTrigger ) ) ) ) )
            	    {
            	    // InternalPanoptesX.g:3399:4: ({...}? => ( ({...}? => ( (lv_tt_3_0= ruleTemporalTrigger ) ) ) ) )
            	    // InternalPanoptesX.g:3400:5: {...}? => ( ({...}? => ( (lv_tt_3_0= ruleTemporalTrigger ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleCompositeTrigger", "getUnorderedGroupHelper().canSelect(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalPanoptesX.g:3400:113: ( ({...}? => ( (lv_tt_3_0= ruleTemporalTrigger ) ) ) )
            	    // InternalPanoptesX.g:3401:6: ({...}? => ( (lv_tt_3_0= ruleTemporalTrigger ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalPanoptesX.g:3404:9: ({...}? => ( (lv_tt_3_0= ruleTemporalTrigger ) ) )
            	    // InternalPanoptesX.g:3404:10: {...}? => ( (lv_tt_3_0= ruleTemporalTrigger ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCompositeTrigger", "true");
            	    }
            	    // InternalPanoptesX.g:3404:19: ( (lv_tt_3_0= ruleTemporalTrigger ) )
            	    // InternalPanoptesX.g:3404:20: (lv_tt_3_0= ruleTemporalTrigger )
            	    {
            	    // InternalPanoptesX.g:3404:20: (lv_tt_3_0= ruleTemporalTrigger )
            	    // InternalPanoptesX.g:3405:10: lv_tt_3_0= ruleTemporalTrigger
            	    {

            	    										newCompositeNode(grammarAccess.getCompositeTriggerAccess().getTtTemporalTriggerParserRuleCall_2_0_0());
            	    									
            	    pushFollow(FOLLOW_50);
            	    lv_tt_3_0=ruleTemporalTrigger();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getCompositeTriggerRule());
            	    										}
            	    										set(
            	    											current,
            	    											"tt",
            	    											lv_tt_3_0,
            	    											"org.lowcomote.panoptes.PanoptesX.TemporalTrigger");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalPanoptesX.g:3427:4: ({...}? => ( ({...}? => ( (lv_st_4_0= ruleSampleBasedTrigger ) ) ) ) )
            	    {
            	    // InternalPanoptesX.g:3427:4: ({...}? => ( ({...}? => ( (lv_st_4_0= ruleSampleBasedTrigger ) ) ) ) )
            	    // InternalPanoptesX.g:3428:5: {...}? => ( ({...}? => ( (lv_st_4_0= ruleSampleBasedTrigger ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleCompositeTrigger", "getUnorderedGroupHelper().canSelect(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalPanoptesX.g:3428:113: ( ({...}? => ( (lv_st_4_0= ruleSampleBasedTrigger ) ) ) )
            	    // InternalPanoptesX.g:3429:6: ({...}? => ( (lv_st_4_0= ruleSampleBasedTrigger ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalPanoptesX.g:3432:9: ({...}? => ( (lv_st_4_0= ruleSampleBasedTrigger ) ) )
            	    // InternalPanoptesX.g:3432:10: {...}? => ( (lv_st_4_0= ruleSampleBasedTrigger ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCompositeTrigger", "true");
            	    }
            	    // InternalPanoptesX.g:3432:19: ( (lv_st_4_0= ruleSampleBasedTrigger ) )
            	    // InternalPanoptesX.g:3432:20: (lv_st_4_0= ruleSampleBasedTrigger )
            	    {
            	    // InternalPanoptesX.g:3432:20: (lv_st_4_0= ruleSampleBasedTrigger )
            	    // InternalPanoptesX.g:3433:10: lv_st_4_0= ruleSampleBasedTrigger
            	    {

            	    										newCompositeNode(grammarAccess.getCompositeTriggerAccess().getStSampleBasedTriggerParserRuleCall_2_1_0());
            	    									
            	    pushFollow(FOLLOW_50);
            	    lv_st_4_0=ruleSampleBasedTrigger();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getCompositeTriggerRule());
            	    										}
            	    										set(
            	    											current,
            	    											"st",
            	    											lv_st_4_0,
            	    											"org.lowcomote.panoptes.PanoptesX.SampleBasedTrigger");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalPanoptesX.g:3455:4: ({...}? => ( ({...}? => ( (lv_pt_5_0= rulePredictionBasedTrigger ) ) ) ) )
            	    {
            	    // InternalPanoptesX.g:3455:4: ({...}? => ( ({...}? => ( (lv_pt_5_0= rulePredictionBasedTrigger ) ) ) ) )
            	    // InternalPanoptesX.g:3456:5: {...}? => ( ({...}? => ( (lv_pt_5_0= rulePredictionBasedTrigger ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleCompositeTrigger", "getUnorderedGroupHelper().canSelect(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalPanoptesX.g:3456:113: ( ({...}? => ( (lv_pt_5_0= rulePredictionBasedTrigger ) ) ) )
            	    // InternalPanoptesX.g:3457:6: ({...}? => ( (lv_pt_5_0= rulePredictionBasedTrigger ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalPanoptesX.g:3460:9: ({...}? => ( (lv_pt_5_0= rulePredictionBasedTrigger ) ) )
            	    // InternalPanoptesX.g:3460:10: {...}? => ( (lv_pt_5_0= rulePredictionBasedTrigger ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCompositeTrigger", "true");
            	    }
            	    // InternalPanoptesX.g:3460:19: ( (lv_pt_5_0= rulePredictionBasedTrigger ) )
            	    // InternalPanoptesX.g:3460:20: (lv_pt_5_0= rulePredictionBasedTrigger )
            	    {
            	    // InternalPanoptesX.g:3460:20: (lv_pt_5_0= rulePredictionBasedTrigger )
            	    // InternalPanoptesX.g:3461:10: lv_pt_5_0= rulePredictionBasedTrigger
            	    {

            	    										newCompositeNode(grammarAccess.getCompositeTriggerAccess().getPtPredictionBasedTriggerParserRuleCall_2_2_0());
            	    									
            	    pushFollow(FOLLOW_50);
            	    lv_pt_5_0=rulePredictionBasedTrigger();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getCompositeTriggerRule());
            	    										}
            	    										set(
            	    											current,
            	    											"pt",
            	    											lv_pt_5_0,
            	    											"org.lowcomote.panoptes.PanoptesX.PredictionBasedTrigger");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalPanoptesX.g:3483:4: ({...}? => ( ({...}? => ( (lv_lt_6_0= ruleLabelBasedTrigger ) ) ) ) )
            	    {
            	    // InternalPanoptesX.g:3483:4: ({...}? => ( ({...}? => ( (lv_lt_6_0= ruleLabelBasedTrigger ) ) ) ) )
            	    // InternalPanoptesX.g:3484:5: {...}? => ( ({...}? => ( (lv_lt_6_0= ruleLabelBasedTrigger ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleCompositeTrigger", "getUnorderedGroupHelper().canSelect(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // InternalPanoptesX.g:3484:113: ( ({...}? => ( (lv_lt_6_0= ruleLabelBasedTrigger ) ) ) )
            	    // InternalPanoptesX.g:3485:6: ({...}? => ( (lv_lt_6_0= ruleLabelBasedTrigger ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_2(), 3);
            	    					
            	    // InternalPanoptesX.g:3488:9: ({...}? => ( (lv_lt_6_0= ruleLabelBasedTrigger ) ) )
            	    // InternalPanoptesX.g:3488:10: {...}? => ( (lv_lt_6_0= ruleLabelBasedTrigger ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCompositeTrigger", "true");
            	    }
            	    // InternalPanoptesX.g:3488:19: ( (lv_lt_6_0= ruleLabelBasedTrigger ) )
            	    // InternalPanoptesX.g:3488:20: (lv_lt_6_0= ruleLabelBasedTrigger )
            	    {
            	    // InternalPanoptesX.g:3488:20: (lv_lt_6_0= ruleLabelBasedTrigger )
            	    // InternalPanoptesX.g:3489:10: lv_lt_6_0= ruleLabelBasedTrigger
            	    {

            	    										newCompositeNode(grammarAccess.getCompositeTriggerAccess().getLtLabelBasedTriggerParserRuleCall_2_3_0());
            	    									
            	    pushFollow(FOLLOW_50);
            	    lv_lt_6_0=ruleLabelBasedTrigger();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getCompositeTriggerRule());
            	    										}
            	    										set(
            	    											current,
            	    											"lt",
            	    											lv_lt_6_0,
            	    											"org.lowcomote.panoptes.PanoptesX.LabelBasedTrigger");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop61;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_2());
            				

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
    // $ANTLR end "ruleCompositeTrigger"


    // $ANTLR start "entryRuleTemporalTrigger"
    // InternalPanoptesX.g:3522:1: entryRuleTemporalTrigger returns [EObject current=null] : iv_ruleTemporalTrigger= ruleTemporalTrigger EOF ;
    public final EObject entryRuleTemporalTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemporalTrigger = null;


        try {
            // InternalPanoptesX.g:3522:56: (iv_ruleTemporalTrigger= ruleTemporalTrigger EOF )
            // InternalPanoptesX.g:3523:2: iv_ruleTemporalTrigger= ruleTemporalTrigger EOF
            {
             newCompositeNode(grammarAccess.getTemporalTriggerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTemporalTrigger=ruleTemporalTrigger();

            state._fsp--;

             current =iv_ruleTemporalTrigger; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTemporalTrigger"


    // $ANTLR start "ruleTemporalTrigger"
    // InternalPanoptesX.g:3529:1: ruleTemporalTrigger returns [EObject current=null] : ( ( () (otherlv_1= 'one' ( (lv_frequency_2_0= rulefrequencyEnum ) ) ) ) | ( (lv_cronString_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleTemporalTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_cronString_3_0=null;
        Enumerator lv_frequency_2_0 = null;



        	enterRule();

        try {
            // InternalPanoptesX.g:3535:2: ( ( ( () (otherlv_1= 'one' ( (lv_frequency_2_0= rulefrequencyEnum ) ) ) ) | ( (lv_cronString_3_0= RULE_STRING ) ) ) )
            // InternalPanoptesX.g:3536:2: ( ( () (otherlv_1= 'one' ( (lv_frequency_2_0= rulefrequencyEnum ) ) ) ) | ( (lv_cronString_3_0= RULE_STRING ) ) )
            {
            // InternalPanoptesX.g:3536:2: ( ( () (otherlv_1= 'one' ( (lv_frequency_2_0= rulefrequencyEnum ) ) ) ) | ( (lv_cronString_3_0= RULE_STRING ) ) )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==64) ) {
                alt62=1;
            }
            else if ( (LA62_0==RULE_STRING) ) {
                alt62=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // InternalPanoptesX.g:3537:3: ( () (otherlv_1= 'one' ( (lv_frequency_2_0= rulefrequencyEnum ) ) ) )
                    {
                    // InternalPanoptesX.g:3537:3: ( () (otherlv_1= 'one' ( (lv_frequency_2_0= rulefrequencyEnum ) ) ) )
                    // InternalPanoptesX.g:3538:4: () (otherlv_1= 'one' ( (lv_frequency_2_0= rulefrequencyEnum ) ) )
                    {
                    // InternalPanoptesX.g:3538:4: ()
                    // InternalPanoptesX.g:3539:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTemporalTriggerAccess().getTemporalTriggerAction_0_0(),
                    						current);
                    				

                    }

                    // InternalPanoptesX.g:3545:4: (otherlv_1= 'one' ( (lv_frequency_2_0= rulefrequencyEnum ) ) )
                    // InternalPanoptesX.g:3546:5: otherlv_1= 'one' ( (lv_frequency_2_0= rulefrequencyEnum ) )
                    {
                    otherlv_1=(Token)match(input,64,FOLLOW_51); 

                    					newLeafNode(otherlv_1, grammarAccess.getTemporalTriggerAccess().getOneKeyword_0_1_0());
                    				
                    // InternalPanoptesX.g:3550:5: ( (lv_frequency_2_0= rulefrequencyEnum ) )
                    // InternalPanoptesX.g:3551:6: (lv_frequency_2_0= rulefrequencyEnum )
                    {
                    // InternalPanoptesX.g:3551:6: (lv_frequency_2_0= rulefrequencyEnum )
                    // InternalPanoptesX.g:3552:7: lv_frequency_2_0= rulefrequencyEnum
                    {

                    							newCompositeNode(grammarAccess.getTemporalTriggerAccess().getFrequencyFrequencyEnumEnumRuleCall_0_1_1_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_frequency_2_0=rulefrequencyEnum();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getTemporalTriggerRule());
                    							}
                    							set(
                    								current,
                    								"frequency",
                    								lv_frequency_2_0,
                    								"org.lowcomote.panoptes.PanoptesX.frequencyEnum");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPanoptesX.g:3572:3: ( (lv_cronString_3_0= RULE_STRING ) )
                    {
                    // InternalPanoptesX.g:3572:3: ( (lv_cronString_3_0= RULE_STRING ) )
                    // InternalPanoptesX.g:3573:4: (lv_cronString_3_0= RULE_STRING )
                    {
                    // InternalPanoptesX.g:3573:4: (lv_cronString_3_0= RULE_STRING )
                    // InternalPanoptesX.g:3574:5: lv_cronString_3_0= RULE_STRING
                    {
                    lv_cronString_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_cronString_3_0, grammarAccess.getTemporalTriggerAccess().getCronStringSTRINGTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTemporalTriggerRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"cronString",
                    						lv_cronString_3_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }


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
    // $ANTLR end "ruleTemporalTrigger"


    // $ANTLR start "entryRuleSampleBasedTrigger"
    // InternalPanoptesX.g:3594:1: entryRuleSampleBasedTrigger returns [EObject current=null] : iv_ruleSampleBasedTrigger= ruleSampleBasedTrigger EOF ;
    public final EObject entryRuleSampleBasedTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSampleBasedTrigger = null;


        try {
            // InternalPanoptesX.g:3594:59: (iv_ruleSampleBasedTrigger= ruleSampleBasedTrigger EOF )
            // InternalPanoptesX.g:3595:2: iv_ruleSampleBasedTrigger= ruleSampleBasedTrigger EOF
            {
             newCompositeNode(grammarAccess.getSampleBasedTriggerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSampleBasedTrigger=ruleSampleBasedTrigger();

            state._fsp--;

             current =iv_ruleSampleBasedTrigger; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSampleBasedTrigger"


    // $ANTLR start "ruleSampleBasedTrigger"
    // InternalPanoptesX.g:3601:1: ruleSampleBasedTrigger returns [EObject current=null] : ( () ( (lv_frequency_1_0= ruleEIntegerObject ) ) otherlv_2= 'samples' ) ;
    public final EObject ruleSampleBasedTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_frequency_1_0 = null;



        	enterRule();

        try {
            // InternalPanoptesX.g:3607:2: ( ( () ( (lv_frequency_1_0= ruleEIntegerObject ) ) otherlv_2= 'samples' ) )
            // InternalPanoptesX.g:3608:2: ( () ( (lv_frequency_1_0= ruleEIntegerObject ) ) otherlv_2= 'samples' )
            {
            // InternalPanoptesX.g:3608:2: ( () ( (lv_frequency_1_0= ruleEIntegerObject ) ) otherlv_2= 'samples' )
            // InternalPanoptesX.g:3609:3: () ( (lv_frequency_1_0= ruleEIntegerObject ) ) otherlv_2= 'samples'
            {
            // InternalPanoptesX.g:3609:3: ()
            // InternalPanoptesX.g:3610:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSampleBasedTriggerAccess().getSampleBasedTriggerAction_0(),
            					current);
            			

            }

            // InternalPanoptesX.g:3616:3: ( (lv_frequency_1_0= ruleEIntegerObject ) )
            // InternalPanoptesX.g:3617:4: (lv_frequency_1_0= ruleEIntegerObject )
            {
            // InternalPanoptesX.g:3617:4: (lv_frequency_1_0= ruleEIntegerObject )
            // InternalPanoptesX.g:3618:5: lv_frequency_1_0= ruleEIntegerObject
            {

            					newCompositeNode(grammarAccess.getSampleBasedTriggerAccess().getFrequencyEIntegerObjectParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_52);
            lv_frequency_1_0=ruleEIntegerObject();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSampleBasedTriggerRule());
            					}
            					set(
            						current,
            						"frequency",
            						lv_frequency_1_0,
            						"org.lowcomote.panoptes.PanoptesX.EIntegerObject");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,65,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getSampleBasedTriggerAccess().getSamplesKeyword_2());
            		

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
    // $ANTLR end "ruleSampleBasedTrigger"


    // $ANTLR start "entryRulePredictionBasedTrigger"
    // InternalPanoptesX.g:3643:1: entryRulePredictionBasedTrigger returns [EObject current=null] : iv_rulePredictionBasedTrigger= rulePredictionBasedTrigger EOF ;
    public final EObject entryRulePredictionBasedTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredictionBasedTrigger = null;


        try {
            // InternalPanoptesX.g:3643:63: (iv_rulePredictionBasedTrigger= rulePredictionBasedTrigger EOF )
            // InternalPanoptesX.g:3644:2: iv_rulePredictionBasedTrigger= rulePredictionBasedTrigger EOF
            {
             newCompositeNode(grammarAccess.getPredictionBasedTriggerRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePredictionBasedTrigger=rulePredictionBasedTrigger();

            state._fsp--;

             current =iv_rulePredictionBasedTrigger; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePredictionBasedTrigger"


    // $ANTLR start "rulePredictionBasedTrigger"
    // InternalPanoptesX.g:3650:1: rulePredictionBasedTrigger returns [EObject current=null] : ( () ( (lv_frequency_1_0= ruleEIntegerObject ) ) otherlv_2= 'predictions' ) ;
    public final EObject rulePredictionBasedTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_frequency_1_0 = null;



        	enterRule();

        try {
            // InternalPanoptesX.g:3656:2: ( ( () ( (lv_frequency_1_0= ruleEIntegerObject ) ) otherlv_2= 'predictions' ) )
            // InternalPanoptesX.g:3657:2: ( () ( (lv_frequency_1_0= ruleEIntegerObject ) ) otherlv_2= 'predictions' )
            {
            // InternalPanoptesX.g:3657:2: ( () ( (lv_frequency_1_0= ruleEIntegerObject ) ) otherlv_2= 'predictions' )
            // InternalPanoptesX.g:3658:3: () ( (lv_frequency_1_0= ruleEIntegerObject ) ) otherlv_2= 'predictions'
            {
            // InternalPanoptesX.g:3658:3: ()
            // InternalPanoptesX.g:3659:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPredictionBasedTriggerAccess().getPredictionBasedTriggerAction_0(),
            					current);
            			

            }

            // InternalPanoptesX.g:3665:3: ( (lv_frequency_1_0= ruleEIntegerObject ) )
            // InternalPanoptesX.g:3666:4: (lv_frequency_1_0= ruleEIntegerObject )
            {
            // InternalPanoptesX.g:3666:4: (lv_frequency_1_0= ruleEIntegerObject )
            // InternalPanoptesX.g:3667:5: lv_frequency_1_0= ruleEIntegerObject
            {

            					newCompositeNode(grammarAccess.getPredictionBasedTriggerAccess().getFrequencyEIntegerObjectParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_53);
            lv_frequency_1_0=ruleEIntegerObject();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPredictionBasedTriggerRule());
            					}
            					set(
            						current,
            						"frequency",
            						lv_frequency_1_0,
            						"org.lowcomote.panoptes.PanoptesX.EIntegerObject");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,66,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getPredictionBasedTriggerAccess().getPredictionsKeyword_2());
            		

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
    // $ANTLR end "rulePredictionBasedTrigger"


    // $ANTLR start "entryRuleLabelBasedTrigger"
    // InternalPanoptesX.g:3692:1: entryRuleLabelBasedTrigger returns [EObject current=null] : iv_ruleLabelBasedTrigger= ruleLabelBasedTrigger EOF ;
    public final EObject entryRuleLabelBasedTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabelBasedTrigger = null;


        try {
            // InternalPanoptesX.g:3692:58: (iv_ruleLabelBasedTrigger= ruleLabelBasedTrigger EOF )
            // InternalPanoptesX.g:3693:2: iv_ruleLabelBasedTrigger= ruleLabelBasedTrigger EOF
            {
             newCompositeNode(grammarAccess.getLabelBasedTriggerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLabelBasedTrigger=ruleLabelBasedTrigger();

            state._fsp--;

             current =iv_ruleLabelBasedTrigger; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLabelBasedTrigger"


    // $ANTLR start "ruleLabelBasedTrigger"
    // InternalPanoptesX.g:3699:1: ruleLabelBasedTrigger returns [EObject current=null] : ( () ( (lv_frequency_1_0= ruleEIntegerObject ) ) otherlv_2= 'labels' ) ;
    public final EObject ruleLabelBasedTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_frequency_1_0 = null;



        	enterRule();

        try {
            // InternalPanoptesX.g:3705:2: ( ( () ( (lv_frequency_1_0= ruleEIntegerObject ) ) otherlv_2= 'labels' ) )
            // InternalPanoptesX.g:3706:2: ( () ( (lv_frequency_1_0= ruleEIntegerObject ) ) otherlv_2= 'labels' )
            {
            // InternalPanoptesX.g:3706:2: ( () ( (lv_frequency_1_0= ruleEIntegerObject ) ) otherlv_2= 'labels' )
            // InternalPanoptesX.g:3707:3: () ( (lv_frequency_1_0= ruleEIntegerObject ) ) otherlv_2= 'labels'
            {
            // InternalPanoptesX.g:3707:3: ()
            // InternalPanoptesX.g:3708:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLabelBasedTriggerAccess().getLabelBasedTriggerAction_0(),
            					current);
            			

            }

            // InternalPanoptesX.g:3714:3: ( (lv_frequency_1_0= ruleEIntegerObject ) )
            // InternalPanoptesX.g:3715:4: (lv_frequency_1_0= ruleEIntegerObject )
            {
            // InternalPanoptesX.g:3715:4: (lv_frequency_1_0= ruleEIntegerObject )
            // InternalPanoptesX.g:3716:5: lv_frequency_1_0= ruleEIntegerObject
            {

            					newCompositeNode(grammarAccess.getLabelBasedTriggerAccess().getFrequencyEIntegerObjectParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_54);
            lv_frequency_1_0=ruleEIntegerObject();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLabelBasedTriggerRule());
            					}
            					set(
            						current,
            						"frequency",
            						lv_frequency_1_0,
            						"org.lowcomote.panoptes.PanoptesX.EIntegerObject");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getLabelBasedTriggerAccess().getLabelsKeyword_2());
            		

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
    // $ANTLR end "ruleLabelBasedTrigger"


    // $ANTLR start "entryRuleAction"
    // InternalPanoptesX.g:3741:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalPanoptesX.g:3741:47: (iv_ruleAction= ruleAction EOF )
            // InternalPanoptesX.g:3742:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalPanoptesX.g:3748:1: ruleAction returns [EObject current=null] : ( () otherlv_1= 'Action' ( ( (lv_name_2_1= RULE_STRING | lv_name_2_2= RULE_SAFESTRING ) ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'endpoint' ( ( (lv_endpoint_6_1= RULE_STRING | lv_endpoint_6_2= RULE_SAFESTRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'parameters' ( (lv_additionalParameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_additionalParameters_10_0= ruleParameter ) ) )* ) ) ) ) )* ) ) ) otherlv_11= '}' ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_1=null;
        Token lv_name_2_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_endpoint_6_1=null;
        Token lv_endpoint_6_2=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_additionalParameters_8_0 = null;

        EObject lv_additionalParameters_10_0 = null;



        	enterRule();

        try {
            // InternalPanoptesX.g:3754:2: ( ( () otherlv_1= 'Action' ( ( (lv_name_2_1= RULE_STRING | lv_name_2_2= RULE_SAFESTRING ) ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'endpoint' ( ( (lv_endpoint_6_1= RULE_STRING | lv_endpoint_6_2= RULE_SAFESTRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'parameters' ( (lv_additionalParameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_additionalParameters_10_0= ruleParameter ) ) )* ) ) ) ) )* ) ) ) otherlv_11= '}' ) )
            // InternalPanoptesX.g:3755:2: ( () otherlv_1= 'Action' ( ( (lv_name_2_1= RULE_STRING | lv_name_2_2= RULE_SAFESTRING ) ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'endpoint' ( ( (lv_endpoint_6_1= RULE_STRING | lv_endpoint_6_2= RULE_SAFESTRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'parameters' ( (lv_additionalParameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_additionalParameters_10_0= ruleParameter ) ) )* ) ) ) ) )* ) ) ) otherlv_11= '}' )
            {
            // InternalPanoptesX.g:3755:2: ( () otherlv_1= 'Action' ( ( (lv_name_2_1= RULE_STRING | lv_name_2_2= RULE_SAFESTRING ) ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'endpoint' ( ( (lv_endpoint_6_1= RULE_STRING | lv_endpoint_6_2= RULE_SAFESTRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'parameters' ( (lv_additionalParameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_additionalParameters_10_0= ruleParameter ) ) )* ) ) ) ) )* ) ) ) otherlv_11= '}' )
            // InternalPanoptesX.g:3756:3: () otherlv_1= 'Action' ( ( (lv_name_2_1= RULE_STRING | lv_name_2_2= RULE_SAFESTRING ) ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'endpoint' ( ( (lv_endpoint_6_1= RULE_STRING | lv_endpoint_6_2= RULE_SAFESTRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'parameters' ( (lv_additionalParameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_additionalParameters_10_0= ruleParameter ) ) )* ) ) ) ) )* ) ) ) otherlv_11= '}'
            {
            // InternalPanoptesX.g:3756:3: ()
            // InternalPanoptesX.g:3757:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActionAccess().getActionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,67,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getActionAccess().getActionKeyword_1());
            		
            // InternalPanoptesX.g:3767:3: ( ( (lv_name_2_1= RULE_STRING | lv_name_2_2= RULE_SAFESTRING ) ) )
            // InternalPanoptesX.g:3768:4: ( (lv_name_2_1= RULE_STRING | lv_name_2_2= RULE_SAFESTRING ) )
            {
            // InternalPanoptesX.g:3768:4: ( (lv_name_2_1= RULE_STRING | lv_name_2_2= RULE_SAFESTRING ) )
            // InternalPanoptesX.g:3769:5: (lv_name_2_1= RULE_STRING | lv_name_2_2= RULE_SAFESTRING )
            {
            // InternalPanoptesX.g:3769:5: (lv_name_2_1= RULE_STRING | lv_name_2_2= RULE_SAFESTRING )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==RULE_STRING) ) {
                alt63=1;
            }
            else if ( (LA63_0==RULE_SAFESTRING) ) {
                alt63=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // InternalPanoptesX.g:3770:6: lv_name_2_1= RULE_STRING
                    {
                    lv_name_2_1=(Token)match(input,RULE_STRING,FOLLOW_5); 

                    						newLeafNode(lv_name_2_1, grammarAccess.getActionAccess().getNameSTRINGTerminalRuleCall_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getActionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_2_1,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }
                    break;
                case 2 :
                    // InternalPanoptesX.g:3785:6: lv_name_2_2= RULE_SAFESTRING
                    {
                    lv_name_2_2=(Token)match(input,RULE_SAFESTRING,FOLLOW_5); 

                    						newLeafNode(lv_name_2_2, grammarAccess.getActionAccess().getNameSAFESTRINGTerminalRuleCall_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getActionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_2_2,
                    							"org.lowcomote.panoptes.PanoptesX.SAFESTRING");
                    					

                    }
                    break;

            }


            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_55); 

            			newLeafNode(otherlv_3, grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalPanoptesX.g:3806:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'endpoint' ( ( (lv_endpoint_6_1= RULE_STRING | lv_endpoint_6_2= RULE_SAFESTRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'parameters' ( (lv_additionalParameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_additionalParameters_10_0= ruleParameter ) ) )* ) ) ) ) )* ) ) )
            // InternalPanoptesX.g:3807:4: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'endpoint' ( ( (lv_endpoint_6_1= RULE_STRING | lv_endpoint_6_2= RULE_SAFESTRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'parameters' ( (lv_additionalParameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_additionalParameters_10_0= ruleParameter ) ) )* ) ) ) ) )* ) )
            {
            // InternalPanoptesX.g:3807:4: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'endpoint' ( ( (lv_endpoint_6_1= RULE_STRING | lv_endpoint_6_2= RULE_SAFESTRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'parameters' ( (lv_additionalParameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_additionalParameters_10_0= ruleParameter ) ) )* ) ) ) ) )* ) )
            // InternalPanoptesX.g:3808:5: ( ( ({...}? => ( ({...}? => (otherlv_5= 'endpoint' ( ( (lv_endpoint_6_1= RULE_STRING | lv_endpoint_6_2= RULE_SAFESTRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'parameters' ( (lv_additionalParameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_additionalParameters_10_0= ruleParameter ) ) )* ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getActionAccess().getUnorderedGroup_4());
            				
            // InternalPanoptesX.g:3811:5: ( ( ({...}? => ( ({...}? => (otherlv_5= 'endpoint' ( ( (lv_endpoint_6_1= RULE_STRING | lv_endpoint_6_2= RULE_SAFESTRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'parameters' ( (lv_additionalParameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_additionalParameters_10_0= ruleParameter ) ) )* ) ) ) ) )* )
            // InternalPanoptesX.g:3812:6: ( ({...}? => ( ({...}? => (otherlv_5= 'endpoint' ( ( (lv_endpoint_6_1= RULE_STRING | lv_endpoint_6_2= RULE_SAFESTRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'parameters' ( (lv_additionalParameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_additionalParameters_10_0= ruleParameter ) ) )* ) ) ) ) )*
            {
            // InternalPanoptesX.g:3812:6: ( ({...}? => ( ({...}? => (otherlv_5= 'endpoint' ( ( (lv_endpoint_6_1= RULE_STRING | lv_endpoint_6_2= RULE_SAFESTRING ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'parameters' ( (lv_additionalParameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_additionalParameters_10_0= ruleParameter ) ) )* ) ) ) ) )*
            loop66:
            do {
                int alt66=3;
                int LA66_0 = input.LA(1);

                if ( LA66_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getActionAccess().getUnorderedGroup_4(), 0) ) {
                    alt66=1;
                }
                else if ( LA66_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getActionAccess().getUnorderedGroup_4(), 1) ) {
                    alt66=2;
                }


                switch (alt66) {
            	case 1 :
            	    // InternalPanoptesX.g:3813:4: ({...}? => ( ({...}? => (otherlv_5= 'endpoint' ( ( (lv_endpoint_6_1= RULE_STRING | lv_endpoint_6_2= RULE_SAFESTRING ) ) ) ) ) ) )
            	    {
            	    // InternalPanoptesX.g:3813:4: ({...}? => ( ({...}? => (otherlv_5= 'endpoint' ( ( (lv_endpoint_6_1= RULE_STRING | lv_endpoint_6_2= RULE_SAFESTRING ) ) ) ) ) ) )
            	    // InternalPanoptesX.g:3814:5: {...}? => ( ({...}? => (otherlv_5= 'endpoint' ( ( (lv_endpoint_6_1= RULE_STRING | lv_endpoint_6_2= RULE_SAFESTRING ) ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActionAccess().getUnorderedGroup_4(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleAction", "getUnorderedGroupHelper().canSelect(grammarAccess.getActionAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // InternalPanoptesX.g:3814:103: ( ({...}? => (otherlv_5= 'endpoint' ( ( (lv_endpoint_6_1= RULE_STRING | lv_endpoint_6_2= RULE_SAFESTRING ) ) ) ) ) )
            	    // InternalPanoptesX.g:3815:6: ({...}? => (otherlv_5= 'endpoint' ( ( (lv_endpoint_6_1= RULE_STRING | lv_endpoint_6_2= RULE_SAFESTRING ) ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getActionAccess().getUnorderedGroup_4(), 0);
            	    					
            	    // InternalPanoptesX.g:3818:9: ({...}? => (otherlv_5= 'endpoint' ( ( (lv_endpoint_6_1= RULE_STRING | lv_endpoint_6_2= RULE_SAFESTRING ) ) ) ) )
            	    // InternalPanoptesX.g:3818:10: {...}? => (otherlv_5= 'endpoint' ( ( (lv_endpoint_6_1= RULE_STRING | lv_endpoint_6_2= RULE_SAFESTRING ) ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAction", "true");
            	    }
            	    // InternalPanoptesX.g:3818:19: (otherlv_5= 'endpoint' ( ( (lv_endpoint_6_1= RULE_STRING | lv_endpoint_6_2= RULE_SAFESTRING ) ) ) )
            	    // InternalPanoptesX.g:3818:20: otherlv_5= 'endpoint' ( ( (lv_endpoint_6_1= RULE_STRING | lv_endpoint_6_2= RULE_SAFESTRING ) ) )
            	    {
            	    otherlv_5=(Token)match(input,42,FOLLOW_4); 

            	    									newLeafNode(otherlv_5, grammarAccess.getActionAccess().getEndpointKeyword_4_0_0());
            	    								
            	    // InternalPanoptesX.g:3822:9: ( ( (lv_endpoint_6_1= RULE_STRING | lv_endpoint_6_2= RULE_SAFESTRING ) ) )
            	    // InternalPanoptesX.g:3823:10: ( (lv_endpoint_6_1= RULE_STRING | lv_endpoint_6_2= RULE_SAFESTRING ) )
            	    {
            	    // InternalPanoptesX.g:3823:10: ( (lv_endpoint_6_1= RULE_STRING | lv_endpoint_6_2= RULE_SAFESTRING ) )
            	    // InternalPanoptesX.g:3824:11: (lv_endpoint_6_1= RULE_STRING | lv_endpoint_6_2= RULE_SAFESTRING )
            	    {
            	    // InternalPanoptesX.g:3824:11: (lv_endpoint_6_1= RULE_STRING | lv_endpoint_6_2= RULE_SAFESTRING )
            	    int alt64=2;
            	    int LA64_0 = input.LA(1);

            	    if ( (LA64_0==RULE_STRING) ) {
            	        alt64=1;
            	    }
            	    else if ( (LA64_0==RULE_SAFESTRING) ) {
            	        alt64=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 64, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt64) {
            	        case 1 :
            	            // InternalPanoptesX.g:3825:12: lv_endpoint_6_1= RULE_STRING
            	            {
            	            lv_endpoint_6_1=(Token)match(input,RULE_STRING,FOLLOW_55); 

            	            												newLeafNode(lv_endpoint_6_1, grammarAccess.getActionAccess().getEndpointSTRINGTerminalRuleCall_4_0_1_0_0());
            	            											

            	            												if (current==null) {
            	            													current = createModelElement(grammarAccess.getActionRule());
            	            												}
            	            												setWithLastConsumed(
            	            													current,
            	            													"endpoint",
            	            													lv_endpoint_6_1,
            	            													"org.eclipse.xtext.common.Terminals.STRING");
            	            											

            	            }
            	            break;
            	        case 2 :
            	            // InternalPanoptesX.g:3840:12: lv_endpoint_6_2= RULE_SAFESTRING
            	            {
            	            lv_endpoint_6_2=(Token)match(input,RULE_SAFESTRING,FOLLOW_55); 

            	            												newLeafNode(lv_endpoint_6_2, grammarAccess.getActionAccess().getEndpointSAFESTRINGTerminalRuleCall_4_0_1_0_1());
            	            											

            	            												if (current==null) {
            	            													current = createModelElement(grammarAccess.getActionRule());
            	            												}
            	            												setWithLastConsumed(
            	            													current,
            	            													"endpoint",
            	            													lv_endpoint_6_2,
            	            													"org.lowcomote.panoptes.PanoptesX.SAFESTRING");
            	            											

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getActionAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalPanoptesX.g:3863:4: ({...}? => ( ({...}? => (otherlv_7= 'parameters' ( (lv_additionalParameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_additionalParameters_10_0= ruleParameter ) ) )* ) ) ) )
            	    {
            	    // InternalPanoptesX.g:3863:4: ({...}? => ( ({...}? => (otherlv_7= 'parameters' ( (lv_additionalParameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_additionalParameters_10_0= ruleParameter ) ) )* ) ) ) )
            	    // InternalPanoptesX.g:3864:5: {...}? => ( ({...}? => (otherlv_7= 'parameters' ( (lv_additionalParameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_additionalParameters_10_0= ruleParameter ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActionAccess().getUnorderedGroup_4(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleAction", "getUnorderedGroupHelper().canSelect(grammarAccess.getActionAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // InternalPanoptesX.g:3864:103: ( ({...}? => (otherlv_7= 'parameters' ( (lv_additionalParameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_additionalParameters_10_0= ruleParameter ) ) )* ) ) )
            	    // InternalPanoptesX.g:3865:6: ({...}? => (otherlv_7= 'parameters' ( (lv_additionalParameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_additionalParameters_10_0= ruleParameter ) ) )* ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getActionAccess().getUnorderedGroup_4(), 1);
            	    					
            	    // InternalPanoptesX.g:3868:9: ({...}? => (otherlv_7= 'parameters' ( (lv_additionalParameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_additionalParameters_10_0= ruleParameter ) ) )* ) )
            	    // InternalPanoptesX.g:3868:10: {...}? => (otherlv_7= 'parameters' ( (lv_additionalParameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_additionalParameters_10_0= ruleParameter ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAction", "true");
            	    }
            	    // InternalPanoptesX.g:3868:19: (otherlv_7= 'parameters' ( (lv_additionalParameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_additionalParameters_10_0= ruleParameter ) ) )* )
            	    // InternalPanoptesX.g:3868:20: otherlv_7= 'parameters' ( (lv_additionalParameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_additionalParameters_10_0= ruleParameter ) ) )*
            	    {
            	    otherlv_7=(Token)match(input,39,FOLLOW_32); 

            	    									newLeafNode(otherlv_7, grammarAccess.getActionAccess().getParametersKeyword_4_1_0());
            	    								
            	    // InternalPanoptesX.g:3872:9: ( (lv_additionalParameters_8_0= ruleParameter ) )
            	    // InternalPanoptesX.g:3873:10: (lv_additionalParameters_8_0= ruleParameter )
            	    {
            	    // InternalPanoptesX.g:3873:10: (lv_additionalParameters_8_0= ruleParameter )
            	    // InternalPanoptesX.g:3874:11: lv_additionalParameters_8_0= ruleParameter
            	    {

            	    											newCompositeNode(grammarAccess.getActionAccess().getAdditionalParametersParameterParserRuleCall_4_1_1_0());
            	    										
            	    pushFollow(FOLLOW_56);
            	    lv_additionalParameters_8_0=ruleParameter();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getActionRule());
            	    											}
            	    											add(
            	    												current,
            	    												"additionalParameters",
            	    												lv_additionalParameters_8_0,
            	    												"org.lowcomote.panoptes.PanoptesX.Parameter");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalPanoptesX.g:3891:9: (otherlv_9= ',' ( (lv_additionalParameters_10_0= ruleParameter ) ) )*
            	    loop65:
            	    do {
            	        int alt65=2;
            	        int LA65_0 = input.LA(1);

            	        if ( (LA65_0==16) ) {
            	            alt65=1;
            	        }


            	        switch (alt65) {
            	    	case 1 :
            	    	    // InternalPanoptesX.g:3892:10: otherlv_9= ',' ( (lv_additionalParameters_10_0= ruleParameter ) )
            	    	    {
            	    	    otherlv_9=(Token)match(input,16,FOLLOW_32); 

            	    	    										newLeafNode(otherlv_9, grammarAccess.getActionAccess().getCommaKeyword_4_1_2_0());
            	    	    									
            	    	    // InternalPanoptesX.g:3896:10: ( (lv_additionalParameters_10_0= ruleParameter ) )
            	    	    // InternalPanoptesX.g:3897:11: (lv_additionalParameters_10_0= ruleParameter )
            	    	    {
            	    	    // InternalPanoptesX.g:3897:11: (lv_additionalParameters_10_0= ruleParameter )
            	    	    // InternalPanoptesX.g:3898:12: lv_additionalParameters_10_0= ruleParameter
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getActionAccess().getAdditionalParametersParameterParserRuleCall_4_1_2_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_56);
            	    	    lv_additionalParameters_10_0=ruleParameter();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getActionRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"additionalParameters",
            	    	    													lv_additionalParameters_10_0,
            	    	    													"org.lowcomote.panoptes.PanoptesX.Parameter");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop65;
            	        }
            	    } while (true);


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getActionAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop66;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getActionAccess().getUnorderedGroup_4());
            				

            }

            otherlv_11=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getActionAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleParameter"
    // InternalPanoptesX.g:3937:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalPanoptesX.g:3937:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalPanoptesX.g:3938:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalPanoptesX.g:3944:1: ruleParameter returns [EObject current=null] : ( () ( (lv_mandatory_1_0= 'mandatory' ) )? ( ( (lv_name_2_1= RULE_STRING | lv_name_2_2= RULE_SAFESTRING ) ) ) (otherlv_3= ':' ( (lv_type_4_0= ruleparameterType ) ) )? ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_mandatory_1_0=null;
        Token lv_name_2_1=null;
        Token lv_name_2_2=null;
        Token otherlv_3=null;
        Enumerator lv_type_4_0 = null;



        	enterRule();

        try {
            // InternalPanoptesX.g:3950:2: ( ( () ( (lv_mandatory_1_0= 'mandatory' ) )? ( ( (lv_name_2_1= RULE_STRING | lv_name_2_2= RULE_SAFESTRING ) ) ) (otherlv_3= ':' ( (lv_type_4_0= ruleparameterType ) ) )? ) )
            // InternalPanoptesX.g:3951:2: ( () ( (lv_mandatory_1_0= 'mandatory' ) )? ( ( (lv_name_2_1= RULE_STRING | lv_name_2_2= RULE_SAFESTRING ) ) ) (otherlv_3= ':' ( (lv_type_4_0= ruleparameterType ) ) )? )
            {
            // InternalPanoptesX.g:3951:2: ( () ( (lv_mandatory_1_0= 'mandatory' ) )? ( ( (lv_name_2_1= RULE_STRING | lv_name_2_2= RULE_SAFESTRING ) ) ) (otherlv_3= ':' ( (lv_type_4_0= ruleparameterType ) ) )? )
            // InternalPanoptesX.g:3952:3: () ( (lv_mandatory_1_0= 'mandatory' ) )? ( ( (lv_name_2_1= RULE_STRING | lv_name_2_2= RULE_SAFESTRING ) ) ) (otherlv_3= ':' ( (lv_type_4_0= ruleparameterType ) ) )?
            {
            // InternalPanoptesX.g:3952:3: ()
            // InternalPanoptesX.g:3953:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterAccess().getParameterAction_0(),
            					current);
            			

            }

            // InternalPanoptesX.g:3959:3: ( (lv_mandatory_1_0= 'mandatory' ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==68) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalPanoptesX.g:3960:4: (lv_mandatory_1_0= 'mandatory' )
                    {
                    // InternalPanoptesX.g:3960:4: (lv_mandatory_1_0= 'mandatory' )
                    // InternalPanoptesX.g:3961:5: lv_mandatory_1_0= 'mandatory'
                    {
                    lv_mandatory_1_0=(Token)match(input,68,FOLLOW_4); 

                    					newLeafNode(lv_mandatory_1_0, grammarAccess.getParameterAccess().getMandatoryMandatoryKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getParameterRule());
                    					}
                    					setWithLastConsumed(current, "mandatory", lv_mandatory_1_0 != null, "mandatory");
                    				

                    }


                    }
                    break;

            }

            // InternalPanoptesX.g:3973:3: ( ( (lv_name_2_1= RULE_STRING | lv_name_2_2= RULE_SAFESTRING ) ) )
            // InternalPanoptesX.g:3974:4: ( (lv_name_2_1= RULE_STRING | lv_name_2_2= RULE_SAFESTRING ) )
            {
            // InternalPanoptesX.g:3974:4: ( (lv_name_2_1= RULE_STRING | lv_name_2_2= RULE_SAFESTRING ) )
            // InternalPanoptesX.g:3975:5: (lv_name_2_1= RULE_STRING | lv_name_2_2= RULE_SAFESTRING )
            {
            // InternalPanoptesX.g:3975:5: (lv_name_2_1= RULE_STRING | lv_name_2_2= RULE_SAFESTRING )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==RULE_STRING) ) {
                alt68=1;
            }
            else if ( (LA68_0==RULE_SAFESTRING) ) {
                alt68=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }
            switch (alt68) {
                case 1 :
                    // InternalPanoptesX.g:3976:6: lv_name_2_1= RULE_STRING
                    {
                    lv_name_2_1=(Token)match(input,RULE_STRING,FOLLOW_23); 

                    						newLeafNode(lv_name_2_1, grammarAccess.getParameterAccess().getNameSTRINGTerminalRuleCall_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getParameterRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_2_1,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }
                    break;
                case 2 :
                    // InternalPanoptesX.g:3991:6: lv_name_2_2= RULE_SAFESTRING
                    {
                    lv_name_2_2=(Token)match(input,RULE_SAFESTRING,FOLLOW_23); 

                    						newLeafNode(lv_name_2_2, grammarAccess.getParameterAccess().getNameSAFESTRINGTerminalRuleCall_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getParameterRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_2_2,
                    							"org.lowcomote.panoptes.PanoptesX.SAFESTRING");
                    					

                    }
                    break;

            }


            }


            }

            // InternalPanoptesX.g:4008:3: (otherlv_3= ':' ( (lv_type_4_0= ruleparameterType ) ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==26) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalPanoptesX.g:4009:4: otherlv_3= ':' ( (lv_type_4_0= ruleparameterType ) )
                    {
                    otherlv_3=(Token)match(input,26,FOLLOW_57); 

                    				newLeafNode(otherlv_3, grammarAccess.getParameterAccess().getColonKeyword_3_0());
                    			
                    // InternalPanoptesX.g:4013:4: ( (lv_type_4_0= ruleparameterType ) )
                    // InternalPanoptesX.g:4014:5: (lv_type_4_0= ruleparameterType )
                    {
                    // InternalPanoptesX.g:4014:5: (lv_type_4_0= ruleparameterType )
                    // InternalPanoptesX.g:4015:6: lv_type_4_0= ruleparameterType
                    {

                    						newCompositeNode(grammarAccess.getParameterAccess().getTypeParameterTypeEnumRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_type_4_0=ruleparameterType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_4_0,
                    							"org.lowcomote.panoptes.PanoptesX.parameterType");
                    						afterParserOrEnumRuleCall();
                    					

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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleparameterValueEntry"
    // InternalPanoptesX.g:4037:1: entryRuleparameterValueEntry returns [EObject current=null] : iv_ruleparameterValueEntry= ruleparameterValueEntry EOF ;
    public final EObject entryRuleparameterValueEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleparameterValueEntry = null;


        try {
            // InternalPanoptesX.g:4037:60: (iv_ruleparameterValueEntry= ruleparameterValueEntry EOF )
            // InternalPanoptesX.g:4038:2: iv_ruleparameterValueEntry= ruleparameterValueEntry EOF
            {
             newCompositeNode(grammarAccess.getParameterValueEntryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleparameterValueEntry=ruleparameterValueEntry();

            state._fsp--;

             current =iv_ruleparameterValueEntry; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleparameterValueEntry"


    // $ANTLR start "ruleparameterValueEntry"
    // InternalPanoptesX.g:4044:1: ruleparameterValueEntry returns [EObject current=null] : ( () ( ( (lv_key_1_1= RULE_STRING | lv_key_1_2= RULE_SAFESTRING ) ) ) otherlv_2= '=' ( (lv_value_3_0= ruleEString ) ) ) ;
    public final EObject ruleparameterValueEntry() throws RecognitionException {
        EObject current = null;

        Token lv_key_1_1=null;
        Token lv_key_1_2=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalPanoptesX.g:4050:2: ( ( () ( ( (lv_key_1_1= RULE_STRING | lv_key_1_2= RULE_SAFESTRING ) ) ) otherlv_2= '=' ( (lv_value_3_0= ruleEString ) ) ) )
            // InternalPanoptesX.g:4051:2: ( () ( ( (lv_key_1_1= RULE_STRING | lv_key_1_2= RULE_SAFESTRING ) ) ) otherlv_2= '=' ( (lv_value_3_0= ruleEString ) ) )
            {
            // InternalPanoptesX.g:4051:2: ( () ( ( (lv_key_1_1= RULE_STRING | lv_key_1_2= RULE_SAFESTRING ) ) ) otherlv_2= '=' ( (lv_value_3_0= ruleEString ) ) )
            // InternalPanoptesX.g:4052:3: () ( ( (lv_key_1_1= RULE_STRING | lv_key_1_2= RULE_SAFESTRING ) ) ) otherlv_2= '=' ( (lv_value_3_0= ruleEString ) )
            {
            // InternalPanoptesX.g:4052:3: ()
            // InternalPanoptesX.g:4053:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterValueEntryAccess().getParameterValueEntryAction_0(),
            					current);
            			

            }

            // InternalPanoptesX.g:4059:3: ( ( (lv_key_1_1= RULE_STRING | lv_key_1_2= RULE_SAFESTRING ) ) )
            // InternalPanoptesX.g:4060:4: ( (lv_key_1_1= RULE_STRING | lv_key_1_2= RULE_SAFESTRING ) )
            {
            // InternalPanoptesX.g:4060:4: ( (lv_key_1_1= RULE_STRING | lv_key_1_2= RULE_SAFESTRING ) )
            // InternalPanoptesX.g:4061:5: (lv_key_1_1= RULE_STRING | lv_key_1_2= RULE_SAFESTRING )
            {
            // InternalPanoptesX.g:4061:5: (lv_key_1_1= RULE_STRING | lv_key_1_2= RULE_SAFESTRING )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==RULE_STRING) ) {
                alt70=1;
            }
            else if ( (LA70_0==RULE_SAFESTRING) ) {
                alt70=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }
            switch (alt70) {
                case 1 :
                    // InternalPanoptesX.g:4062:6: lv_key_1_1= RULE_STRING
                    {
                    lv_key_1_1=(Token)match(input,RULE_STRING,FOLLOW_58); 

                    						newLeafNode(lv_key_1_1, grammarAccess.getParameterValueEntryAccess().getKeySTRINGTerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getParameterValueEntryRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"key",
                    							lv_key_1_1,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }
                    break;
                case 2 :
                    // InternalPanoptesX.g:4077:6: lv_key_1_2= RULE_SAFESTRING
                    {
                    lv_key_1_2=(Token)match(input,RULE_SAFESTRING,FOLLOW_58); 

                    						newLeafNode(lv_key_1_2, grammarAccess.getParameterValueEntryAccess().getKeySAFESTRINGTerminalRuleCall_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getParameterValueEntryRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"key",
                    							lv_key_1_2,
                    							"org.lowcomote.panoptes.PanoptesX.SAFESTRING");
                    					

                    }
                    break;

            }


            }


            }

            otherlv_2=(Token)match(input,69,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterValueEntryAccess().getEqualsSignKeyword_2());
            		
            // InternalPanoptesX.g:4098:3: ( (lv_value_3_0= ruleEString ) )
            // InternalPanoptesX.g:4099:4: (lv_value_3_0= ruleEString )
            {
            // InternalPanoptesX.g:4099:4: (lv_value_3_0= ruleEString )
            // InternalPanoptesX.g:4100:5: lv_value_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParameterValueEntryAccess().getValueEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterValueEntryRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"org.lowcomote.panoptes.PanoptesX.EString");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleparameterValueEntry"


    // $ANTLR start "entryRuleActionExecution"
    // InternalPanoptesX.g:4121:1: entryRuleActionExecution returns [EObject current=null] : iv_ruleActionExecution= ruleActionExecution EOF ;
    public final EObject entryRuleActionExecution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionExecution = null;


        try {
            // InternalPanoptesX.g:4121:56: (iv_ruleActionExecution= ruleActionExecution EOF )
            // InternalPanoptesX.g:4122:2: iv_ruleActionExecution= ruleActionExecution EOF
            {
             newCompositeNode(grammarAccess.getActionExecutionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActionExecution=ruleActionExecution();

            state._fsp--;

             current =iv_ruleActionExecution; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleActionExecution"


    // $ANTLR start "ruleActionExecution"
    // InternalPanoptesX.g:4128:1: ruleActionExecution returns [EObject current=null] : ( () otherlv_1= 'ActionExecution' ( ( (lv_name_2_1= RULE_STRING | lv_name_2_2= RULE_SAFESTRING ) ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'action' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'parameter' otherlv_8= 'values' ( (lv_parameterValueMap_9_0= ruleparameterValueEntry ) ) (otherlv_10= ',' ( (lv_parameterValueMap_11_0= ruleparameterValueEntry ) ) )* ) ) ) ) )+ {...}?) ) ) otherlv_12= '}' ) ;
    public final EObject ruleActionExecution() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_1=null;
        Token lv_name_2_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_parameterValueMap_9_0 = null;

        EObject lv_parameterValueMap_11_0 = null;



        	enterRule();

        try {
            // InternalPanoptesX.g:4134:2: ( ( () otherlv_1= 'ActionExecution' ( ( (lv_name_2_1= RULE_STRING | lv_name_2_2= RULE_SAFESTRING ) ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'action' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'parameter' otherlv_8= 'values' ( (lv_parameterValueMap_9_0= ruleparameterValueEntry ) ) (otherlv_10= ',' ( (lv_parameterValueMap_11_0= ruleparameterValueEntry ) ) )* ) ) ) ) )+ {...}?) ) ) otherlv_12= '}' ) )
            // InternalPanoptesX.g:4135:2: ( () otherlv_1= 'ActionExecution' ( ( (lv_name_2_1= RULE_STRING | lv_name_2_2= RULE_SAFESTRING ) ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'action' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'parameter' otherlv_8= 'values' ( (lv_parameterValueMap_9_0= ruleparameterValueEntry ) ) (otherlv_10= ',' ( (lv_parameterValueMap_11_0= ruleparameterValueEntry ) ) )* ) ) ) ) )+ {...}?) ) ) otherlv_12= '}' )
            {
            // InternalPanoptesX.g:4135:2: ( () otherlv_1= 'ActionExecution' ( ( (lv_name_2_1= RULE_STRING | lv_name_2_2= RULE_SAFESTRING ) ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'action' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'parameter' otherlv_8= 'values' ( (lv_parameterValueMap_9_0= ruleparameterValueEntry ) ) (otherlv_10= ',' ( (lv_parameterValueMap_11_0= ruleparameterValueEntry ) ) )* ) ) ) ) )+ {...}?) ) ) otherlv_12= '}' )
            // InternalPanoptesX.g:4136:3: () otherlv_1= 'ActionExecution' ( ( (lv_name_2_1= RULE_STRING | lv_name_2_2= RULE_SAFESTRING ) ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'action' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'parameter' otherlv_8= 'values' ( (lv_parameterValueMap_9_0= ruleparameterValueEntry ) ) (otherlv_10= ',' ( (lv_parameterValueMap_11_0= ruleparameterValueEntry ) ) )* ) ) ) ) )+ {...}?) ) ) otherlv_12= '}'
            {
            // InternalPanoptesX.g:4136:3: ()
            // InternalPanoptesX.g:4137:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActionExecutionAccess().getActionExecutionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,70,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getActionExecutionAccess().getActionExecutionKeyword_1());
            		
            // InternalPanoptesX.g:4147:3: ( ( (lv_name_2_1= RULE_STRING | lv_name_2_2= RULE_SAFESTRING ) ) )
            // InternalPanoptesX.g:4148:4: ( (lv_name_2_1= RULE_STRING | lv_name_2_2= RULE_SAFESTRING ) )
            {
            // InternalPanoptesX.g:4148:4: ( (lv_name_2_1= RULE_STRING | lv_name_2_2= RULE_SAFESTRING ) )
            // InternalPanoptesX.g:4149:5: (lv_name_2_1= RULE_STRING | lv_name_2_2= RULE_SAFESTRING )
            {
            // InternalPanoptesX.g:4149:5: (lv_name_2_1= RULE_STRING | lv_name_2_2= RULE_SAFESTRING )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==RULE_STRING) ) {
                alt71=1;
            }
            else if ( (LA71_0==RULE_SAFESTRING) ) {
                alt71=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }
            switch (alt71) {
                case 1 :
                    // InternalPanoptesX.g:4150:6: lv_name_2_1= RULE_STRING
                    {
                    lv_name_2_1=(Token)match(input,RULE_STRING,FOLLOW_5); 

                    						newLeafNode(lv_name_2_1, grammarAccess.getActionExecutionAccess().getNameSTRINGTerminalRuleCall_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getActionExecutionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_2_1,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }
                    break;
                case 2 :
                    // InternalPanoptesX.g:4165:6: lv_name_2_2= RULE_SAFESTRING
                    {
                    lv_name_2_2=(Token)match(input,RULE_SAFESTRING,FOLLOW_5); 

                    						newLeafNode(lv_name_2_2, grammarAccess.getActionExecutionAccess().getNameSAFESTRINGTerminalRuleCall_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getActionExecutionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_2_2,
                    							"org.lowcomote.panoptes.PanoptesX.SAFESTRING");
                    					

                    }
                    break;

            }


            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_59); 

            			newLeafNode(otherlv_3, grammarAccess.getActionExecutionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalPanoptesX.g:4186:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'action' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'parameter' otherlv_8= 'values' ( (lv_parameterValueMap_9_0= ruleparameterValueEntry ) ) (otherlv_10= ',' ( (lv_parameterValueMap_11_0= ruleparameterValueEntry ) ) )* ) ) ) ) )+ {...}?) ) )
            // InternalPanoptesX.g:4187:4: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'action' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'parameter' otherlv_8= 'values' ( (lv_parameterValueMap_9_0= ruleparameterValueEntry ) ) (otherlv_10= ',' ( (lv_parameterValueMap_11_0= ruleparameterValueEntry ) ) )* ) ) ) ) )+ {...}?) )
            {
            // InternalPanoptesX.g:4187:4: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'action' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'parameter' otherlv_8= 'values' ( (lv_parameterValueMap_9_0= ruleparameterValueEntry ) ) (otherlv_10= ',' ( (lv_parameterValueMap_11_0= ruleparameterValueEntry ) ) )* ) ) ) ) )+ {...}?) )
            // InternalPanoptesX.g:4188:5: ( ( ({...}? => ( ({...}? => (otherlv_5= 'action' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'parameter' otherlv_8= 'values' ( (lv_parameterValueMap_9_0= ruleparameterValueEntry ) ) (otherlv_10= ',' ( (lv_parameterValueMap_11_0= ruleparameterValueEntry ) ) )* ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getActionExecutionAccess().getUnorderedGroup_4());
            				
            // InternalPanoptesX.g:4191:5: ( ( ({...}? => ( ({...}? => (otherlv_5= 'action' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'parameter' otherlv_8= 'values' ( (lv_parameterValueMap_9_0= ruleparameterValueEntry ) ) (otherlv_10= ',' ( (lv_parameterValueMap_11_0= ruleparameterValueEntry ) ) )* ) ) ) ) )+ {...}?)
            // InternalPanoptesX.g:4192:6: ( ({...}? => ( ({...}? => (otherlv_5= 'action' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'parameter' otherlv_8= 'values' ( (lv_parameterValueMap_9_0= ruleparameterValueEntry ) ) (otherlv_10= ',' ( (lv_parameterValueMap_11_0= ruleparameterValueEntry ) ) )* ) ) ) ) )+ {...}?
            {
            // InternalPanoptesX.g:4192:6: ( ({...}? => ( ({...}? => (otherlv_5= 'action' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'parameter' otherlv_8= 'values' ( (lv_parameterValueMap_9_0= ruleparameterValueEntry ) ) (otherlv_10= ',' ( (lv_parameterValueMap_11_0= ruleparameterValueEntry ) ) )* ) ) ) ) )+
            int cnt73=0;
            loop73:
            do {
                int alt73=3;
                int LA73_0 = input.LA(1);

                if ( LA73_0 == 71 && getUnorderedGroupHelper().canSelect(grammarAccess.getActionExecutionAccess().getUnorderedGroup_4(), 0) ) {
                    alt73=1;
                }
                else if ( LA73_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getActionExecutionAccess().getUnorderedGroup_4(), 1) ) {
                    alt73=2;
                }


                switch (alt73) {
            	case 1 :
            	    // InternalPanoptesX.g:4193:4: ({...}? => ( ({...}? => (otherlv_5= 'action' ( ( ruleEString ) ) ) ) ) )
            	    {
            	    // InternalPanoptesX.g:4193:4: ({...}? => ( ({...}? => (otherlv_5= 'action' ( ( ruleEString ) ) ) ) ) )
            	    // InternalPanoptesX.g:4194:5: {...}? => ( ({...}? => (otherlv_5= 'action' ( ( ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActionExecutionAccess().getUnorderedGroup_4(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleActionExecution", "getUnorderedGroupHelper().canSelect(grammarAccess.getActionExecutionAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // InternalPanoptesX.g:4194:112: ( ({...}? => (otherlv_5= 'action' ( ( ruleEString ) ) ) ) )
            	    // InternalPanoptesX.g:4195:6: ({...}? => (otherlv_5= 'action' ( ( ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getActionExecutionAccess().getUnorderedGroup_4(), 0);
            	    					
            	    // InternalPanoptesX.g:4198:9: ({...}? => (otherlv_5= 'action' ( ( ruleEString ) ) ) )
            	    // InternalPanoptesX.g:4198:10: {...}? => (otherlv_5= 'action' ( ( ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleActionExecution", "true");
            	    }
            	    // InternalPanoptesX.g:4198:19: (otherlv_5= 'action' ( ( ruleEString ) ) )
            	    // InternalPanoptesX.g:4198:20: otherlv_5= 'action' ( ( ruleEString ) )
            	    {
            	    otherlv_5=(Token)match(input,71,FOLLOW_7); 

            	    									newLeafNode(otherlv_5, grammarAccess.getActionExecutionAccess().getActionKeyword_4_0_0());
            	    								
            	    // InternalPanoptesX.g:4202:9: ( ( ruleEString ) )
            	    // InternalPanoptesX.g:4203:10: ( ruleEString )
            	    {
            	    // InternalPanoptesX.g:4203:10: ( ruleEString )
            	    // InternalPanoptesX.g:4204:11: ruleEString
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getActionExecutionRule());
            	    											}
            	    										

            	    											newCompositeNode(grammarAccess.getActionExecutionAccess().getActionActionCrossReference_4_0_1_0());
            	    										
            	    pushFollow(FOLLOW_60);
            	    ruleEString();

            	    state._fsp--;


            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getActionExecutionAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalPanoptesX.g:4224:4: ({...}? => ( ({...}? => (otherlv_7= 'parameter' otherlv_8= 'values' ( (lv_parameterValueMap_9_0= ruleparameterValueEntry ) ) (otherlv_10= ',' ( (lv_parameterValueMap_11_0= ruleparameterValueEntry ) ) )* ) ) ) )
            	    {
            	    // InternalPanoptesX.g:4224:4: ({...}? => ( ({...}? => (otherlv_7= 'parameter' otherlv_8= 'values' ( (lv_parameterValueMap_9_0= ruleparameterValueEntry ) ) (otherlv_10= ',' ( (lv_parameterValueMap_11_0= ruleparameterValueEntry ) ) )* ) ) ) )
            	    // InternalPanoptesX.g:4225:5: {...}? => ( ({...}? => (otherlv_7= 'parameter' otherlv_8= 'values' ( (lv_parameterValueMap_9_0= ruleparameterValueEntry ) ) (otherlv_10= ',' ( (lv_parameterValueMap_11_0= ruleparameterValueEntry ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActionExecutionAccess().getUnorderedGroup_4(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleActionExecution", "getUnorderedGroupHelper().canSelect(grammarAccess.getActionExecutionAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // InternalPanoptesX.g:4225:112: ( ({...}? => (otherlv_7= 'parameter' otherlv_8= 'values' ( (lv_parameterValueMap_9_0= ruleparameterValueEntry ) ) (otherlv_10= ',' ( (lv_parameterValueMap_11_0= ruleparameterValueEntry ) ) )* ) ) )
            	    // InternalPanoptesX.g:4226:6: ({...}? => (otherlv_7= 'parameter' otherlv_8= 'values' ( (lv_parameterValueMap_9_0= ruleparameterValueEntry ) ) (otherlv_10= ',' ( (lv_parameterValueMap_11_0= ruleparameterValueEntry ) ) )* ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getActionExecutionAccess().getUnorderedGroup_4(), 1);
            	    					
            	    // InternalPanoptesX.g:4229:9: ({...}? => (otherlv_7= 'parameter' otherlv_8= 'values' ( (lv_parameterValueMap_9_0= ruleparameterValueEntry ) ) (otherlv_10= ',' ( (lv_parameterValueMap_11_0= ruleparameterValueEntry ) ) )* ) )
            	    // InternalPanoptesX.g:4229:10: {...}? => (otherlv_7= 'parameter' otherlv_8= 'values' ( (lv_parameterValueMap_9_0= ruleparameterValueEntry ) ) (otherlv_10= ',' ( (lv_parameterValueMap_11_0= ruleparameterValueEntry ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleActionExecution", "true");
            	    }
            	    // InternalPanoptesX.g:4229:19: (otherlv_7= 'parameter' otherlv_8= 'values' ( (lv_parameterValueMap_9_0= ruleparameterValueEntry ) ) (otherlv_10= ',' ( (lv_parameterValueMap_11_0= ruleparameterValueEntry ) ) )* )
            	    // InternalPanoptesX.g:4229:20: otherlv_7= 'parameter' otherlv_8= 'values' ( (lv_parameterValueMap_9_0= ruleparameterValueEntry ) ) (otherlv_10= ',' ( (lv_parameterValueMap_11_0= ruleparameterValueEntry ) ) )*
            	    {
            	    otherlv_7=(Token)match(input,49,FOLLOW_41); 

            	    									newLeafNode(otherlv_7, grammarAccess.getActionExecutionAccess().getParameterKeyword_4_1_0());
            	    								
            	    otherlv_8=(Token)match(input,50,FOLLOW_4); 

            	    									newLeafNode(otherlv_8, grammarAccess.getActionExecutionAccess().getValuesKeyword_4_1_1());
            	    								
            	    // InternalPanoptesX.g:4237:9: ( (lv_parameterValueMap_9_0= ruleparameterValueEntry ) )
            	    // InternalPanoptesX.g:4238:10: (lv_parameterValueMap_9_0= ruleparameterValueEntry )
            	    {
            	    // InternalPanoptesX.g:4238:10: (lv_parameterValueMap_9_0= ruleparameterValueEntry )
            	    // InternalPanoptesX.g:4239:11: lv_parameterValueMap_9_0= ruleparameterValueEntry
            	    {

            	    											newCompositeNode(grammarAccess.getActionExecutionAccess().getParameterValueMapParameterValueEntryParserRuleCall_4_1_2_0());
            	    										
            	    pushFollow(FOLLOW_61);
            	    lv_parameterValueMap_9_0=ruleparameterValueEntry();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getActionExecutionRule());
            	    											}
            	    											add(
            	    												current,
            	    												"parameterValueMap",
            	    												lv_parameterValueMap_9_0,
            	    												"org.lowcomote.panoptes.PanoptesX.parameterValueEntry");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalPanoptesX.g:4256:9: (otherlv_10= ',' ( (lv_parameterValueMap_11_0= ruleparameterValueEntry ) ) )*
            	    loop72:
            	    do {
            	        int alt72=2;
            	        int LA72_0 = input.LA(1);

            	        if ( (LA72_0==16) ) {
            	            alt72=1;
            	        }


            	        switch (alt72) {
            	    	case 1 :
            	    	    // InternalPanoptesX.g:4257:10: otherlv_10= ',' ( (lv_parameterValueMap_11_0= ruleparameterValueEntry ) )
            	    	    {
            	    	    otherlv_10=(Token)match(input,16,FOLLOW_4); 

            	    	    										newLeafNode(otherlv_10, grammarAccess.getActionExecutionAccess().getCommaKeyword_4_1_3_0());
            	    	    									
            	    	    // InternalPanoptesX.g:4261:10: ( (lv_parameterValueMap_11_0= ruleparameterValueEntry ) )
            	    	    // InternalPanoptesX.g:4262:11: (lv_parameterValueMap_11_0= ruleparameterValueEntry )
            	    	    {
            	    	    // InternalPanoptesX.g:4262:11: (lv_parameterValueMap_11_0= ruleparameterValueEntry )
            	    	    // InternalPanoptesX.g:4263:12: lv_parameterValueMap_11_0= ruleparameterValueEntry
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getActionExecutionAccess().getParameterValueMapParameterValueEntryParserRuleCall_4_1_3_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_61);
            	    	    lv_parameterValueMap_11_0=ruleparameterValueEntry();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getActionExecutionRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"parameterValueMap",
            	    	    													lv_parameterValueMap_11_0,
            	    	    													"org.lowcomote.panoptes.PanoptesX.parameterValueEntry");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop72;
            	        }
            	    } while (true);


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getActionExecutionAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt73 >= 1 ) break loop73;
                        EarlyExitException eee =
                            new EarlyExitException(73, input);
                        throw eee;
                }
                cnt73++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getActionExecutionAccess().getUnorderedGroup_4()) ) {
                throw new FailedPredicateException(input, "ruleActionExecution", "getUnorderedGroupHelper().canLeave(grammarAccess.getActionExecutionAccess().getUnorderedGroup_4())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getActionExecutionAccess().getUnorderedGroup_4());
            				

            }

            otherlv_12=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getActionExecutionAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleActionExecution"


    // $ANTLR start "entryRuleEIntegerObject"
    // InternalPanoptesX.g:4303:1: entryRuleEIntegerObject returns [String current=null] : iv_ruleEIntegerObject= ruleEIntegerObject EOF ;
    public final String entryRuleEIntegerObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEIntegerObject = null;


        try {
            // InternalPanoptesX.g:4303:54: (iv_ruleEIntegerObject= ruleEIntegerObject EOF )
            // InternalPanoptesX.g:4304:2: iv_ruleEIntegerObject= ruleEIntegerObject EOF
            {
             newCompositeNode(grammarAccess.getEIntegerObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEIntegerObject=ruleEIntegerObject();

            state._fsp--;

             current =iv_ruleEIntegerObject.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEIntegerObject"


    // $ANTLR start "ruleEIntegerObject"
    // InternalPanoptesX.g:4310:1: ruleEIntegerObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleEIntegerObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalPanoptesX.g:4316:2: (this_INT_0= RULE_INT )
            // InternalPanoptesX.g:4317:2: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            		current.merge(this_INT_0);
            	

            		newLeafNode(this_INT_0, grammarAccess.getEIntegerObjectAccess().getINTTerminalRuleCall());
            	

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
    // $ANTLR end "ruleEIntegerObject"


    // $ANTLR start "entryRuleEString"
    // InternalPanoptesX.g:4327:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalPanoptesX.g:4327:47: (iv_ruleEString= ruleEString EOF )
            // InternalPanoptesX.g:4328:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalPanoptesX.g:4334:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FLOAT_0= RULE_FLOAT | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING | this_SAFESTRING_3= RULE_SAFESTRING ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_FLOAT_0=null;
        Token this_INT_1=null;
        Token this_STRING_2=null;
        Token this_SAFESTRING_3=null;


        	enterRule();

        try {
            // InternalPanoptesX.g:4340:2: ( (this_FLOAT_0= RULE_FLOAT | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING | this_SAFESTRING_3= RULE_SAFESTRING ) )
            // InternalPanoptesX.g:4341:2: (this_FLOAT_0= RULE_FLOAT | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING | this_SAFESTRING_3= RULE_SAFESTRING )
            {
            // InternalPanoptesX.g:4341:2: (this_FLOAT_0= RULE_FLOAT | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING | this_SAFESTRING_3= RULE_SAFESTRING )
            int alt74=4;
            switch ( input.LA(1) ) {
            case RULE_FLOAT:
                {
                alt74=1;
                }
                break;
            case RULE_INT:
                {
                alt74=2;
                }
                break;
            case RULE_STRING:
                {
                alt74=3;
                }
                break;
            case RULE_SAFESTRING:
                {
                alt74=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }

            switch (alt74) {
                case 1 :
                    // InternalPanoptesX.g:4342:3: this_FLOAT_0= RULE_FLOAT
                    {
                    this_FLOAT_0=(Token)match(input,RULE_FLOAT,FOLLOW_2); 

                    			current.merge(this_FLOAT_0);
                    		

                    			newLeafNode(this_FLOAT_0, grammarAccess.getEStringAccess().getFLOATTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPanoptesX.g:4350:3: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_1);
                    		

                    			newLeafNode(this_INT_1, grammarAccess.getEStringAccess().getINTTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalPanoptesX.g:4358:3: this_STRING_2= RULE_STRING
                    {
                    this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_2);
                    		

                    			newLeafNode(this_STRING_2, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalPanoptesX.g:4366:3: this_SAFESTRING_3= RULE_SAFESTRING
                    {
                    this_SAFESTRING_3=(Token)match(input,RULE_SAFESTRING,FOLLOW_2); 

                    			current.merge(this_SAFESTRING_3);
                    		

                    			newLeafNode(this_SAFESTRING_3, grammarAccess.getEStringAccess().getSAFESTRINGTerminalRuleCall_3());
                    		

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "rulestatisticalVariableType"
    // InternalPanoptesX.g:4377:1: rulestatisticalVariableType returns [Enumerator current=null] : ( (enumLiteral_0= 'continuous' ) | (enumLiteral_1= 'categorical' ) | (enumLiteral_2= 'ordered categorical' ) ) ;
    public final Enumerator rulestatisticalVariableType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalPanoptesX.g:4383:2: ( ( (enumLiteral_0= 'continuous' ) | (enumLiteral_1= 'categorical' ) | (enumLiteral_2= 'ordered categorical' ) ) )
            // InternalPanoptesX.g:4384:2: ( (enumLiteral_0= 'continuous' ) | (enumLiteral_1= 'categorical' ) | (enumLiteral_2= 'ordered categorical' ) )
            {
            // InternalPanoptesX.g:4384:2: ( (enumLiteral_0= 'continuous' ) | (enumLiteral_1= 'categorical' ) | (enumLiteral_2= 'ordered categorical' ) )
            int alt75=3;
            switch ( input.LA(1) ) {
            case 72:
                {
                alt75=1;
                }
                break;
            case 73:
                {
                alt75=2;
                }
                break;
            case 74:
                {
                alt75=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }

            switch (alt75) {
                case 1 :
                    // InternalPanoptesX.g:4385:3: (enumLiteral_0= 'continuous' )
                    {
                    // InternalPanoptesX.g:4385:3: (enumLiteral_0= 'continuous' )
                    // InternalPanoptesX.g:4386:4: enumLiteral_0= 'continuous'
                    {
                    enumLiteral_0=(Token)match(input,72,FOLLOW_2); 

                    				current = grammarAccess.getStatisticalVariableTypeAccess().getContinuousEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getStatisticalVariableTypeAccess().getContinuousEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPanoptesX.g:4393:3: (enumLiteral_1= 'categorical' )
                    {
                    // InternalPanoptesX.g:4393:3: (enumLiteral_1= 'categorical' )
                    // InternalPanoptesX.g:4394:4: enumLiteral_1= 'categorical'
                    {
                    enumLiteral_1=(Token)match(input,73,FOLLOW_2); 

                    				current = grammarAccess.getStatisticalVariableTypeAccess().getCategoricalEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getStatisticalVariableTypeAccess().getCategoricalEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalPanoptesX.g:4401:3: (enumLiteral_2= 'ordered categorical' )
                    {
                    // InternalPanoptesX.g:4401:3: (enumLiteral_2= 'ordered categorical' )
                    // InternalPanoptesX.g:4402:4: enumLiteral_2= 'ordered categorical'
                    {
                    enumLiteral_2=(Token)match(input,74,FOLLOW_2); 

                    				current = grammarAccess.getStatisticalVariableTypeAccess().getOrderedCategoricalEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getStatisticalVariableTypeAccess().getOrderedCategoricalEnumLiteralDeclaration_2());
                    			

                    }


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
    // $ANTLR end "rulestatisticalVariableType"


    // $ANTLR start "rulefrequencyEnum"
    // InternalPanoptesX.g:4412:1: rulefrequencyEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'hour' ) | (enumLiteral_1= 'day' ) | (enumLiteral_2= 'week' ) | (enumLiteral_3= 'month' ) | (enumLiteral_4= 'year' ) ) ;
    public final Enumerator rulefrequencyEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalPanoptesX.g:4418:2: ( ( (enumLiteral_0= 'hour' ) | (enumLiteral_1= 'day' ) | (enumLiteral_2= 'week' ) | (enumLiteral_3= 'month' ) | (enumLiteral_4= 'year' ) ) )
            // InternalPanoptesX.g:4419:2: ( (enumLiteral_0= 'hour' ) | (enumLiteral_1= 'day' ) | (enumLiteral_2= 'week' ) | (enumLiteral_3= 'month' ) | (enumLiteral_4= 'year' ) )
            {
            // InternalPanoptesX.g:4419:2: ( (enumLiteral_0= 'hour' ) | (enumLiteral_1= 'day' ) | (enumLiteral_2= 'week' ) | (enumLiteral_3= 'month' ) | (enumLiteral_4= 'year' ) )
            int alt76=5;
            switch ( input.LA(1) ) {
            case 75:
                {
                alt76=1;
                }
                break;
            case 76:
                {
                alt76=2;
                }
                break;
            case 77:
                {
                alt76=3;
                }
                break;
            case 78:
                {
                alt76=4;
                }
                break;
            case 79:
                {
                alt76=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }

            switch (alt76) {
                case 1 :
                    // InternalPanoptesX.g:4420:3: (enumLiteral_0= 'hour' )
                    {
                    // InternalPanoptesX.g:4420:3: (enumLiteral_0= 'hour' )
                    // InternalPanoptesX.g:4421:4: enumLiteral_0= 'hour'
                    {
                    enumLiteral_0=(Token)match(input,75,FOLLOW_2); 

                    				current = grammarAccess.getFrequencyEnumAccess().getHourlyEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getFrequencyEnumAccess().getHourlyEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPanoptesX.g:4428:3: (enumLiteral_1= 'day' )
                    {
                    // InternalPanoptesX.g:4428:3: (enumLiteral_1= 'day' )
                    // InternalPanoptesX.g:4429:4: enumLiteral_1= 'day'
                    {
                    enumLiteral_1=(Token)match(input,76,FOLLOW_2); 

                    				current = grammarAccess.getFrequencyEnumAccess().getDailyEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getFrequencyEnumAccess().getDailyEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalPanoptesX.g:4436:3: (enumLiteral_2= 'week' )
                    {
                    // InternalPanoptesX.g:4436:3: (enumLiteral_2= 'week' )
                    // InternalPanoptesX.g:4437:4: enumLiteral_2= 'week'
                    {
                    enumLiteral_2=(Token)match(input,77,FOLLOW_2); 

                    				current = grammarAccess.getFrequencyEnumAccess().getWeeklyEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getFrequencyEnumAccess().getWeeklyEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalPanoptesX.g:4444:3: (enumLiteral_3= 'month' )
                    {
                    // InternalPanoptesX.g:4444:3: (enumLiteral_3= 'month' )
                    // InternalPanoptesX.g:4445:4: enumLiteral_3= 'month'
                    {
                    enumLiteral_3=(Token)match(input,78,FOLLOW_2); 

                    				current = grammarAccess.getFrequencyEnumAccess().getMonthlyEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getFrequencyEnumAccess().getMonthlyEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalPanoptesX.g:4452:3: (enumLiteral_4= 'year' )
                    {
                    // InternalPanoptesX.g:4452:3: (enumLiteral_4= 'year' )
                    // InternalPanoptesX.g:4453:4: enumLiteral_4= 'year'
                    {
                    enumLiteral_4=(Token)match(input,79,FOLLOW_2); 

                    				current = grammarAccess.getFrequencyEnumAccess().getYearlyEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getFrequencyEnumAccess().getYearlyEnumLiteralDeclaration_4());
                    			

                    }


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
    // $ANTLR end "rulefrequencyEnum"


    // $ANTLR start "ruleparameterType"
    // InternalPanoptesX.g:4463:1: ruleparameterType returns [Enumerator current=null] : ( (enumLiteral_0= 'Integer' ) | (enumLiteral_1= 'Real' ) | (enumLiteral_2= 'String' ) | (enumLiteral_3= 'Boolean' ) ) ;
    public final Enumerator ruleparameterType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalPanoptesX.g:4469:2: ( ( (enumLiteral_0= 'Integer' ) | (enumLiteral_1= 'Real' ) | (enumLiteral_2= 'String' ) | (enumLiteral_3= 'Boolean' ) ) )
            // InternalPanoptesX.g:4470:2: ( (enumLiteral_0= 'Integer' ) | (enumLiteral_1= 'Real' ) | (enumLiteral_2= 'String' ) | (enumLiteral_3= 'Boolean' ) )
            {
            // InternalPanoptesX.g:4470:2: ( (enumLiteral_0= 'Integer' ) | (enumLiteral_1= 'Real' ) | (enumLiteral_2= 'String' ) | (enumLiteral_3= 'Boolean' ) )
            int alt77=4;
            switch ( input.LA(1) ) {
            case 80:
                {
                alt77=1;
                }
                break;
            case 81:
                {
                alt77=2;
                }
                break;
            case 82:
                {
                alt77=3;
                }
                break;
            case 83:
                {
                alt77=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }

            switch (alt77) {
                case 1 :
                    // InternalPanoptesX.g:4471:3: (enumLiteral_0= 'Integer' )
                    {
                    // InternalPanoptesX.g:4471:3: (enumLiteral_0= 'Integer' )
                    // InternalPanoptesX.g:4472:4: enumLiteral_0= 'Integer'
                    {
                    enumLiteral_0=(Token)match(input,80,FOLLOW_2); 

                    				current = grammarAccess.getParameterTypeAccess().getIntegerEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getParameterTypeAccess().getIntegerEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPanoptesX.g:4479:3: (enumLiteral_1= 'Real' )
                    {
                    // InternalPanoptesX.g:4479:3: (enumLiteral_1= 'Real' )
                    // InternalPanoptesX.g:4480:4: enumLiteral_1= 'Real'
                    {
                    enumLiteral_1=(Token)match(input,81,FOLLOW_2); 

                    				current = grammarAccess.getParameterTypeAccess().getRealEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getParameterTypeAccess().getRealEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalPanoptesX.g:4487:3: (enumLiteral_2= 'String' )
                    {
                    // InternalPanoptesX.g:4487:3: (enumLiteral_2= 'String' )
                    // InternalPanoptesX.g:4488:4: enumLiteral_2= 'String'
                    {
                    enumLiteral_2=(Token)match(input,82,FOLLOW_2); 

                    				current = grammarAccess.getParameterTypeAccess().getStringEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getParameterTypeAccess().getStringEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalPanoptesX.g:4495:3: (enumLiteral_3= 'Boolean' )
                    {
                    // InternalPanoptesX.g:4495:3: (enumLiteral_3= 'Boolean' )
                    // InternalPanoptesX.g:4496:4: enumLiteral_3= 'Boolean'
                    {
                    enumLiteral_3=(Token)match(input,83,FOLLOW_2); 

                    				current = grammarAccess.getParameterTypeAccess().getBooleanEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getParameterTypeAccess().getBooleanEnumLiteralDeclaration_3());
                    			

                    }


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
    // $ANTLR end "ruleparameterType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000B0120082002L,0x0000000000000008L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000078000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000068000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000F40000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000F50000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004004002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000700L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008040000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008050000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x10081000C0040000L,0x0000000000000040L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x10081000C0050000L,0x0000000000000040L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x000000AE00000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x000000AE00040000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000004000000000L,0x0000000000000700L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x000000AE00050000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000030L,0x0000000000000010L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000008E00000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000008E00040000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000008E00050000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0003E00000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0003E00000040000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0003E00000050000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x06D3200000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x06D3200000040000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x06D3200000050000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x6000000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000052L,0x0000000000000001L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000000L,0x000000000000F800L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000048000040000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000048000050000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000000L,0x00000000000F0000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0002000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0002000000040000L,0x0000000000000080L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0002000000050000L,0x0000000000000080L});

}
