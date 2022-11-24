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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_PANOPTESSTRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Model'", "'{'", "'uses'", "','", "'outputs'", "'}'", "'FeatureStore'", "'features'", "'entities'", "'labels'", "'request'", "'data'", "'keys'", "':'", "'requires'", "'predicts'", "'Deployment'", "'model'", "'inputs'", "'BaseAlgorithm'", "'codebase'", "'runtime'", "'severity'", "'levels'", "'accepts'", "'only'", "'parameters'", "'HigherOrderAlgorithm'", "'BaseAlgorithmRuntime'", "'endpoint'", "'HigherOrderAlgorithmRuntime'", "'BaseAlgorithmExecution'", "'algorithm'", "'live'", "'historic'", "'actions'", "'parameter'", "'values'", "'HigherOrderAlgorithmExecution'", "'observed'", "'execution'", "'minimum'", "'min'", "'observations'", "'maximum'", "'max'", "'->'", "'Trigger'", "'or'", "'execute'", "'every'", "'one'", "'samples'", "'predictions'", "'Action'", "'mandatory'", "'='", "'ActionExecution'", "'action'", "'-'", "'continuous'", "'categorical'", "'ordered categorical'", "'hour'", "'day'", "'week'", "'month'", "'year'", "'Integer'", "'Real'", "'String'", "'Boolean'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__12=12;
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
    public static final int RULE_ID=7;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=8;
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
    public static final int RULE_PANOPTESSTRING=6;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=9;
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
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
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
                case 18:
                    {
                    alt1=1;
                    }
                    break;
                case 12:
                    {
                    alt1=2;
                    }
                    break;
                case 28:
                    {
                    alt1=3;
                    }
                    break;
                case 31:
                case 39:
                    {
                    alt1=4;
                    }
                    break;
                case 40:
                case 42:
                    {
                    alt1=5;
                    }
                    break;
                case 66:
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
    // InternalPanoptesX.g:210:1: ruleModel returns [EObject current=null] : ( () otherlv_1= 'Model' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'uses' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'outputs' ( (lv_output_10_0= rulePrediction ) ) ) ) ) ) )+ {...}?) ) ) otherlv_11= '}' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_output_10_0 = null;



        	enterRule();

        try {
            // InternalPanoptesX.g:216:2: ( ( () otherlv_1= 'Model' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'uses' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'outputs' ( (lv_output_10_0= rulePrediction ) ) ) ) ) ) )+ {...}?) ) ) otherlv_11= '}' ) )
            // InternalPanoptesX.g:217:2: ( () otherlv_1= 'Model' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'uses' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'outputs' ( (lv_output_10_0= rulePrediction ) ) ) ) ) ) )+ {...}?) ) ) otherlv_11= '}' )
            {
            // InternalPanoptesX.g:217:2: ( () otherlv_1= 'Model' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'uses' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'outputs' ( (lv_output_10_0= rulePrediction ) ) ) ) ) ) )+ {...}?) ) ) otherlv_11= '}' )
            // InternalPanoptesX.g:218:3: () otherlv_1= 'Model' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'uses' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'outputs' ( (lv_output_10_0= rulePrediction ) ) ) ) ) ) )+ {...}?) ) ) otherlv_11= '}'
            {
            // InternalPanoptesX.g:218:3: ()
            // InternalPanoptesX.g:219:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getModelAccess().getModelAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getModelAccess().getModelKeyword_1());
            		
            // InternalPanoptesX.g:229:3: ( (lv_name_2_0= ruleEString ) )
            // InternalPanoptesX.g:230:4: (lv_name_2_0= ruleEString )
            {
            // InternalPanoptesX.g:230:4: (lv_name_2_0= ruleEString )
            // InternalPanoptesX.g:231:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getModelAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.lowcomote.panoptes.PanoptesX.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalPanoptesX.g:252:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'uses' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'outputs' ( (lv_output_10_0= rulePrediction ) ) ) ) ) ) )+ {...}?) ) )
            // InternalPanoptesX.g:253:4: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'uses' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'outputs' ( (lv_output_10_0= rulePrediction ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalPanoptesX.g:253:4: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'uses' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'outputs' ( (lv_output_10_0= rulePrediction ) ) ) ) ) ) )+ {...}?) )
            // InternalPanoptesX.g:254:5: ( ( ({...}? => ( ({...}? => (otherlv_5= 'uses' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'outputs' ( (lv_output_10_0= rulePrediction ) ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getModelAccess().getUnorderedGroup_4());
            				
            // InternalPanoptesX.g:257:5: ( ( ({...}? => ( ({...}? => (otherlv_5= 'uses' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'outputs' ( (lv_output_10_0= rulePrediction ) ) ) ) ) ) )+ {...}?)
            // InternalPanoptesX.g:258:6: ( ({...}? => ( ({...}? => (otherlv_5= 'uses' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'outputs' ( (lv_output_10_0= rulePrediction ) ) ) ) ) ) )+ {...}?
            {
            // InternalPanoptesX.g:258:6: ( ({...}? => ( ({...}? => (otherlv_5= 'uses' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'outputs' ( (lv_output_10_0= rulePrediction ) ) ) ) ) ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( LA3_0 == 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_4(), 0) ) {
                    alt3=1;
                }
                else if ( LA3_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_4(), 1) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalPanoptesX.g:259:4: ({...}? => ( ({...}? => (otherlv_5= 'uses' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* ) ) ) )
            	    {
            	    // InternalPanoptesX.g:259:4: ({...}? => ( ({...}? => (otherlv_5= 'uses' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* ) ) ) )
            	    // InternalPanoptesX.g:260:5: {...}? => ( ({...}? => (otherlv_5= 'uses' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_4(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // InternalPanoptesX.g:260:102: ( ({...}? => (otherlv_5= 'uses' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* ) ) )
            	    // InternalPanoptesX.g:261:6: ({...}? => (otherlv_5= 'uses' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup_4(), 0);
            	    					
            	    // InternalPanoptesX.g:264:9: ({...}? => (otherlv_5= 'uses' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* ) )
            	    // InternalPanoptesX.g:264:10: {...}? => (otherlv_5= 'uses' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleModel", "true");
            	    }
            	    // InternalPanoptesX.g:264:19: (otherlv_5= 'uses' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )
            	    // InternalPanoptesX.g:264:20: otherlv_5= 'uses' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )*
            	    {
            	    otherlv_5=(Token)match(input,14,FOLLOW_4); 

            	    									newLeafNode(otherlv_5, grammarAccess.getModelAccess().getUsesKeyword_4_0_0());
            	    								
            	    // InternalPanoptesX.g:268:9: ( ( ruleEString ) )
            	    // InternalPanoptesX.g:269:10: ( ruleEString )
            	    {
            	    // InternalPanoptesX.g:269:10: ( ruleEString )
            	    // InternalPanoptesX.g:270:11: ruleEString
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getModelRule());
            	    											}
            	    										

            	    											newCompositeNode(grammarAccess.getModelAccess().getInputsFeatureCrossReference_4_0_1_0());
            	    										
            	    pushFollow(FOLLOW_7);
            	    ruleEString();

            	    state._fsp--;


            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalPanoptesX.g:284:9: (otherlv_7= ',' ( ( ruleEString ) ) )*
            	    loop2:
            	    do {
            	        int alt2=2;
            	        int LA2_0 = input.LA(1);

            	        if ( (LA2_0==15) ) {
            	            alt2=1;
            	        }


            	        switch (alt2) {
            	    	case 1 :
            	    	    // InternalPanoptesX.g:285:10: otherlv_7= ',' ( ( ruleEString ) )
            	    	    {
            	    	    otherlv_7=(Token)match(input,15,FOLLOW_4); 

            	    	    										newLeafNode(otherlv_7, grammarAccess.getModelAccess().getCommaKeyword_4_0_2_0());
            	    	    									
            	    	    // InternalPanoptesX.g:289:10: ( ( ruleEString ) )
            	    	    // InternalPanoptesX.g:290:11: ( ruleEString )
            	    	    {
            	    	    // InternalPanoptesX.g:290:11: ( ruleEString )
            	    	    // InternalPanoptesX.g:291:12: ruleEString
            	    	    {

            	    	    												if (current==null) {
            	    	    													current = createModelElement(grammarAccess.getModelRule());
            	    	    												}
            	    	    											

            	    	    												newCompositeNode(grammarAccess.getModelAccess().getInputsFeatureCrossReference_4_0_2_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_7);
            	    	    ruleEString();

            	    	    state._fsp--;


            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop2;
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
            	    // InternalPanoptesX.g:312:4: ({...}? => ( ({...}? => (otherlv_9= 'outputs' ( (lv_output_10_0= rulePrediction ) ) ) ) ) )
            	    {
            	    // InternalPanoptesX.g:312:4: ({...}? => ( ({...}? => (otherlv_9= 'outputs' ( (lv_output_10_0= rulePrediction ) ) ) ) ) )
            	    // InternalPanoptesX.g:313:5: {...}? => ( ({...}? => (otherlv_9= 'outputs' ( (lv_output_10_0= rulePrediction ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_4(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // InternalPanoptesX.g:313:102: ( ({...}? => (otherlv_9= 'outputs' ( (lv_output_10_0= rulePrediction ) ) ) ) )
            	    // InternalPanoptesX.g:314:6: ({...}? => (otherlv_9= 'outputs' ( (lv_output_10_0= rulePrediction ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup_4(), 1);
            	    					
            	    // InternalPanoptesX.g:317:9: ({...}? => (otherlv_9= 'outputs' ( (lv_output_10_0= rulePrediction ) ) ) )
            	    // InternalPanoptesX.g:317:10: {...}? => (otherlv_9= 'outputs' ( (lv_output_10_0= rulePrediction ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleModel", "true");
            	    }
            	    // InternalPanoptesX.g:317:19: (otherlv_9= 'outputs' ( (lv_output_10_0= rulePrediction ) ) )
            	    // InternalPanoptesX.g:317:20: otherlv_9= 'outputs' ( (lv_output_10_0= rulePrediction ) )
            	    {
            	    otherlv_9=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_9, grammarAccess.getModelAccess().getOutputsKeyword_4_1_0());
            	    								
            	    // InternalPanoptesX.g:321:9: ( (lv_output_10_0= rulePrediction ) )
            	    // InternalPanoptesX.g:322:10: (lv_output_10_0= rulePrediction )
            	    {
            	    // InternalPanoptesX.g:322:10: (lv_output_10_0= rulePrediction )
            	    // InternalPanoptesX.g:323:11: lv_output_10_0= rulePrediction
            	    {

            	    											newCompositeNode(grammarAccess.getModelAccess().getOutputPredictionParserRuleCall_4_1_1_0());
            	    										
            	    pushFollow(FOLLOW_8);
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
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getModelAccess().getUnorderedGroup_4()) ) {
                throw new FailedPredicateException(input, "ruleModel", "getUnorderedGroupHelper().canLeave(grammarAccess.getModelAccess().getUnorderedGroup_4())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getModelAccess().getUnorderedGroup_4());
            				

            }

            otherlv_11=(Token)match(input,17,FOLLOW_2); 

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
    // InternalPanoptesX.g:362:1: entryRuleFeatureStore returns [EObject current=null] : iv_ruleFeatureStore= ruleFeatureStore EOF ;
    public final EObject entryRuleFeatureStore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureStore = null;


        try {
            // InternalPanoptesX.g:362:53: (iv_ruleFeatureStore= ruleFeatureStore EOF )
            // InternalPanoptesX.g:363:2: iv_ruleFeatureStore= ruleFeatureStore EOF
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
    // InternalPanoptesX.g:369:1: ruleFeatureStore returns [EObject current=null] : ( () otherlv_1= 'FeatureStore' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'features' ( (lv_features_5_0= ruleFeature ) ) (otherlv_6= ',' ( (lv_features_7_0= ruleFeature ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'entities' ( (lv_entities_9_0= ruleEntity ) ) (otherlv_10= ',' ( (lv_entities_11_0= ruleEntity ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'labels' ( (lv_labels_13_0= ruleLabel ) ) (otherlv_14= ',' ( (lv_labels_15_0= ruleLabel ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'request' otherlv_17= 'data' ( (lv_requestData_18_0= ruleRequestData ) ) (otherlv_19= ',' ( (lv_requestData_20_0= ruleRequestData ) ) )* ) ) ) ) )* ) ) ) otherlv_21= '}' ) ;
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
            // InternalPanoptesX.g:375:2: ( ( () otherlv_1= 'FeatureStore' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'features' ( (lv_features_5_0= ruleFeature ) ) (otherlv_6= ',' ( (lv_features_7_0= ruleFeature ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'entities' ( (lv_entities_9_0= ruleEntity ) ) (otherlv_10= ',' ( (lv_entities_11_0= ruleEntity ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'labels' ( (lv_labels_13_0= ruleLabel ) ) (otherlv_14= ',' ( (lv_labels_15_0= ruleLabel ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'request' otherlv_17= 'data' ( (lv_requestData_18_0= ruleRequestData ) ) (otherlv_19= ',' ( (lv_requestData_20_0= ruleRequestData ) ) )* ) ) ) ) )* ) ) ) otherlv_21= '}' ) )
            // InternalPanoptesX.g:376:2: ( () otherlv_1= 'FeatureStore' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'features' ( (lv_features_5_0= ruleFeature ) ) (otherlv_6= ',' ( (lv_features_7_0= ruleFeature ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'entities' ( (lv_entities_9_0= ruleEntity ) ) (otherlv_10= ',' ( (lv_entities_11_0= ruleEntity ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'labels' ( (lv_labels_13_0= ruleLabel ) ) (otherlv_14= ',' ( (lv_labels_15_0= ruleLabel ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'request' otherlv_17= 'data' ( (lv_requestData_18_0= ruleRequestData ) ) (otherlv_19= ',' ( (lv_requestData_20_0= ruleRequestData ) ) )* ) ) ) ) )* ) ) ) otherlv_21= '}' )
            {
            // InternalPanoptesX.g:376:2: ( () otherlv_1= 'FeatureStore' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'features' ( (lv_features_5_0= ruleFeature ) ) (otherlv_6= ',' ( (lv_features_7_0= ruleFeature ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'entities' ( (lv_entities_9_0= ruleEntity ) ) (otherlv_10= ',' ( (lv_entities_11_0= ruleEntity ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'labels' ( (lv_labels_13_0= ruleLabel ) ) (otherlv_14= ',' ( (lv_labels_15_0= ruleLabel ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'request' otherlv_17= 'data' ( (lv_requestData_18_0= ruleRequestData ) ) (otherlv_19= ',' ( (lv_requestData_20_0= ruleRequestData ) ) )* ) ) ) ) )* ) ) ) otherlv_21= '}' )
            // InternalPanoptesX.g:377:3: () otherlv_1= 'FeatureStore' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'features' ( (lv_features_5_0= ruleFeature ) ) (otherlv_6= ',' ( (lv_features_7_0= ruleFeature ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'entities' ( (lv_entities_9_0= ruleEntity ) ) (otherlv_10= ',' ( (lv_entities_11_0= ruleEntity ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'labels' ( (lv_labels_13_0= ruleLabel ) ) (otherlv_14= ',' ( (lv_labels_15_0= ruleLabel ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'request' otherlv_17= 'data' ( (lv_requestData_18_0= ruleRequestData ) ) (otherlv_19= ',' ( (lv_requestData_20_0= ruleRequestData ) ) )* ) ) ) ) )* ) ) ) otherlv_21= '}'
            {
            // InternalPanoptesX.g:377:3: ()
            // InternalPanoptesX.g:378:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFeatureStoreAccess().getFeatureStoreAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getFeatureStoreAccess().getFeatureStoreKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getFeatureStoreAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalPanoptesX.g:392:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'features' ( (lv_features_5_0= ruleFeature ) ) (otherlv_6= ',' ( (lv_features_7_0= ruleFeature ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'entities' ( (lv_entities_9_0= ruleEntity ) ) (otherlv_10= ',' ( (lv_entities_11_0= ruleEntity ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'labels' ( (lv_labels_13_0= ruleLabel ) ) (otherlv_14= ',' ( (lv_labels_15_0= ruleLabel ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'request' otherlv_17= 'data' ( (lv_requestData_18_0= ruleRequestData ) ) (otherlv_19= ',' ( (lv_requestData_20_0= ruleRequestData ) ) )* ) ) ) ) )* ) ) )
            // InternalPanoptesX.g:393:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'features' ( (lv_features_5_0= ruleFeature ) ) (otherlv_6= ',' ( (lv_features_7_0= ruleFeature ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'entities' ( (lv_entities_9_0= ruleEntity ) ) (otherlv_10= ',' ( (lv_entities_11_0= ruleEntity ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'labels' ( (lv_labels_13_0= ruleLabel ) ) (otherlv_14= ',' ( (lv_labels_15_0= ruleLabel ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'request' otherlv_17= 'data' ( (lv_requestData_18_0= ruleRequestData ) ) (otherlv_19= ',' ( (lv_requestData_20_0= ruleRequestData ) ) )* ) ) ) ) )* ) )
            {
            // InternalPanoptesX.g:393:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'features' ( (lv_features_5_0= ruleFeature ) ) (otherlv_6= ',' ( (lv_features_7_0= ruleFeature ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'entities' ( (lv_entities_9_0= ruleEntity ) ) (otherlv_10= ',' ( (lv_entities_11_0= ruleEntity ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'labels' ( (lv_labels_13_0= ruleLabel ) ) (otherlv_14= ',' ( (lv_labels_15_0= ruleLabel ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'request' otherlv_17= 'data' ( (lv_requestData_18_0= ruleRequestData ) ) (otherlv_19= ',' ( (lv_requestData_20_0= ruleRequestData ) ) )* ) ) ) ) )* ) )
            // InternalPanoptesX.g:394:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'features' ( (lv_features_5_0= ruleFeature ) ) (otherlv_6= ',' ( (lv_features_7_0= ruleFeature ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'entities' ( (lv_entities_9_0= ruleEntity ) ) (otherlv_10= ',' ( (lv_entities_11_0= ruleEntity ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'labels' ( (lv_labels_13_0= ruleLabel ) ) (otherlv_14= ',' ( (lv_labels_15_0= ruleLabel ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'request' otherlv_17= 'data' ( (lv_requestData_18_0= ruleRequestData ) ) (otherlv_19= ',' ( (lv_requestData_20_0= ruleRequestData ) ) )* ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getFeatureStoreAccess().getUnorderedGroup_3());
            				
            // InternalPanoptesX.g:397:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'features' ( (lv_features_5_0= ruleFeature ) ) (otherlv_6= ',' ( (lv_features_7_0= ruleFeature ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'entities' ( (lv_entities_9_0= ruleEntity ) ) (otherlv_10= ',' ( (lv_entities_11_0= ruleEntity ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'labels' ( (lv_labels_13_0= ruleLabel ) ) (otherlv_14= ',' ( (lv_labels_15_0= ruleLabel ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'request' otherlv_17= 'data' ( (lv_requestData_18_0= ruleRequestData ) ) (otherlv_19= ',' ( (lv_requestData_20_0= ruleRequestData ) ) )* ) ) ) ) )* )
            // InternalPanoptesX.g:398:6: ( ({...}? => ( ({...}? => (otherlv_4= 'features' ( (lv_features_5_0= ruleFeature ) ) (otherlv_6= ',' ( (lv_features_7_0= ruleFeature ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'entities' ( (lv_entities_9_0= ruleEntity ) ) (otherlv_10= ',' ( (lv_entities_11_0= ruleEntity ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'labels' ( (lv_labels_13_0= ruleLabel ) ) (otherlv_14= ',' ( (lv_labels_15_0= ruleLabel ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'request' otherlv_17= 'data' ( (lv_requestData_18_0= ruleRequestData ) ) (otherlv_19= ',' ( (lv_requestData_20_0= ruleRequestData ) ) )* ) ) ) ) )*
            {
            // InternalPanoptesX.g:398:6: ( ({...}? => ( ({...}? => (otherlv_4= 'features' ( (lv_features_5_0= ruleFeature ) ) (otherlv_6= ',' ( (lv_features_7_0= ruleFeature ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'entities' ( (lv_entities_9_0= ruleEntity ) ) (otherlv_10= ',' ( (lv_entities_11_0= ruleEntity ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'labels' ( (lv_labels_13_0= ruleLabel ) ) (otherlv_14= ',' ( (lv_labels_15_0= ruleLabel ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'request' otherlv_17= 'data' ( (lv_requestData_18_0= ruleRequestData ) ) (otherlv_19= ',' ( (lv_requestData_20_0= ruleRequestData ) ) )* ) ) ) ) )*
            loop8:
            do {
                int alt8=5;
                int LA8_0 = input.LA(1);

                if ( LA8_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureStoreAccess().getUnorderedGroup_3(), 0) ) {
                    alt8=1;
                }
                else if ( LA8_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureStoreAccess().getUnorderedGroup_3(), 1) ) {
                    alt8=2;
                }
                else if ( LA8_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureStoreAccess().getUnorderedGroup_3(), 2) ) {
                    alt8=3;
                }
                else if ( LA8_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureStoreAccess().getUnorderedGroup_3(), 3) ) {
                    alt8=4;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalPanoptesX.g:399:4: ({...}? => ( ({...}? => (otherlv_4= 'features' ( (lv_features_5_0= ruleFeature ) ) (otherlv_6= ',' ( (lv_features_7_0= ruleFeature ) ) )* ) ) ) )
            	    {
            	    // InternalPanoptesX.g:399:4: ({...}? => ( ({...}? => (otherlv_4= 'features' ( (lv_features_5_0= ruleFeature ) ) (otherlv_6= ',' ( (lv_features_7_0= ruleFeature ) ) )* ) ) ) )
            	    // InternalPanoptesX.g:400:5: {...}? => ( ({...}? => (otherlv_4= 'features' ( (lv_features_5_0= ruleFeature ) ) (otherlv_6= ',' ( (lv_features_7_0= ruleFeature ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureStoreAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleFeatureStore", "getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureStoreAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalPanoptesX.g:400:109: ( ({...}? => (otherlv_4= 'features' ( (lv_features_5_0= ruleFeature ) ) (otherlv_6= ',' ( (lv_features_7_0= ruleFeature ) ) )* ) ) )
            	    // InternalPanoptesX.g:401:6: ({...}? => (otherlv_4= 'features' ( (lv_features_5_0= ruleFeature ) ) (otherlv_6= ',' ( (lv_features_7_0= ruleFeature ) ) )* ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFeatureStoreAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalPanoptesX.g:404:9: ({...}? => (otherlv_4= 'features' ( (lv_features_5_0= ruleFeature ) ) (otherlv_6= ',' ( (lv_features_7_0= ruleFeature ) ) )* ) )
            	    // InternalPanoptesX.g:404:10: {...}? => (otherlv_4= 'features' ( (lv_features_5_0= ruleFeature ) ) (otherlv_6= ',' ( (lv_features_7_0= ruleFeature ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFeatureStore", "true");
            	    }
            	    // InternalPanoptesX.g:404:19: (otherlv_4= 'features' ( (lv_features_5_0= ruleFeature ) ) (otherlv_6= ',' ( (lv_features_7_0= ruleFeature ) ) )* )
            	    // InternalPanoptesX.g:404:20: otherlv_4= 'features' ( (lv_features_5_0= ruleFeature ) ) (otherlv_6= ',' ( (lv_features_7_0= ruleFeature ) ) )*
            	    {
            	    otherlv_4=(Token)match(input,19,FOLLOW_4); 

            	    									newLeafNode(otherlv_4, grammarAccess.getFeatureStoreAccess().getFeaturesKeyword_3_0_0());
            	    								
            	    // InternalPanoptesX.g:408:9: ( (lv_features_5_0= ruleFeature ) )
            	    // InternalPanoptesX.g:409:10: (lv_features_5_0= ruleFeature )
            	    {
            	    // InternalPanoptesX.g:409:10: (lv_features_5_0= ruleFeature )
            	    // InternalPanoptesX.g:410:11: lv_features_5_0= ruleFeature
            	    {

            	    											newCompositeNode(grammarAccess.getFeatureStoreAccess().getFeaturesFeatureParserRuleCall_3_0_1_0());
            	    										
            	    pushFollow(FOLLOW_10);
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

            	    // InternalPanoptesX.g:427:9: (otherlv_6= ',' ( (lv_features_7_0= ruleFeature ) ) )*
            	    loop4:
            	    do {
            	        int alt4=2;
            	        int LA4_0 = input.LA(1);

            	        if ( (LA4_0==15) ) {
            	            alt4=1;
            	        }


            	        switch (alt4) {
            	    	case 1 :
            	    	    // InternalPanoptesX.g:428:10: otherlv_6= ',' ( (lv_features_7_0= ruleFeature ) )
            	    	    {
            	    	    otherlv_6=(Token)match(input,15,FOLLOW_4); 

            	    	    										newLeafNode(otherlv_6, grammarAccess.getFeatureStoreAccess().getCommaKeyword_3_0_2_0());
            	    	    									
            	    	    // InternalPanoptesX.g:432:10: ( (lv_features_7_0= ruleFeature ) )
            	    	    // InternalPanoptesX.g:433:11: (lv_features_7_0= ruleFeature )
            	    	    {
            	    	    // InternalPanoptesX.g:433:11: (lv_features_7_0= ruleFeature )
            	    	    // InternalPanoptesX.g:434:12: lv_features_7_0= ruleFeature
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getFeatureStoreAccess().getFeaturesFeatureParserRuleCall_3_0_2_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_10);
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
            	    	    break loop4;
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
            	    // InternalPanoptesX.g:458:4: ({...}? => ( ({...}? => (otherlv_8= 'entities' ( (lv_entities_9_0= ruleEntity ) ) (otherlv_10= ',' ( (lv_entities_11_0= ruleEntity ) ) )* ) ) ) )
            	    {
            	    // InternalPanoptesX.g:458:4: ({...}? => ( ({...}? => (otherlv_8= 'entities' ( (lv_entities_9_0= ruleEntity ) ) (otherlv_10= ',' ( (lv_entities_11_0= ruleEntity ) ) )* ) ) ) )
            	    // InternalPanoptesX.g:459:5: {...}? => ( ({...}? => (otherlv_8= 'entities' ( (lv_entities_9_0= ruleEntity ) ) (otherlv_10= ',' ( (lv_entities_11_0= ruleEntity ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureStoreAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleFeatureStore", "getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureStoreAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalPanoptesX.g:459:109: ( ({...}? => (otherlv_8= 'entities' ( (lv_entities_9_0= ruleEntity ) ) (otherlv_10= ',' ( (lv_entities_11_0= ruleEntity ) ) )* ) ) )
            	    // InternalPanoptesX.g:460:6: ({...}? => (otherlv_8= 'entities' ( (lv_entities_9_0= ruleEntity ) ) (otherlv_10= ',' ( (lv_entities_11_0= ruleEntity ) ) )* ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFeatureStoreAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalPanoptesX.g:463:9: ({...}? => (otherlv_8= 'entities' ( (lv_entities_9_0= ruleEntity ) ) (otherlv_10= ',' ( (lv_entities_11_0= ruleEntity ) ) )* ) )
            	    // InternalPanoptesX.g:463:10: {...}? => (otherlv_8= 'entities' ( (lv_entities_9_0= ruleEntity ) ) (otherlv_10= ',' ( (lv_entities_11_0= ruleEntity ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFeatureStore", "true");
            	    }
            	    // InternalPanoptesX.g:463:19: (otherlv_8= 'entities' ( (lv_entities_9_0= ruleEntity ) ) (otherlv_10= ',' ( (lv_entities_11_0= ruleEntity ) ) )* )
            	    // InternalPanoptesX.g:463:20: otherlv_8= 'entities' ( (lv_entities_9_0= ruleEntity ) ) (otherlv_10= ',' ( (lv_entities_11_0= ruleEntity ) ) )*
            	    {
            	    otherlv_8=(Token)match(input,20,FOLLOW_4); 

            	    									newLeafNode(otherlv_8, grammarAccess.getFeatureStoreAccess().getEntitiesKeyword_3_1_0());
            	    								
            	    // InternalPanoptesX.g:467:9: ( (lv_entities_9_0= ruleEntity ) )
            	    // InternalPanoptesX.g:468:10: (lv_entities_9_0= ruleEntity )
            	    {
            	    // InternalPanoptesX.g:468:10: (lv_entities_9_0= ruleEntity )
            	    // InternalPanoptesX.g:469:11: lv_entities_9_0= ruleEntity
            	    {

            	    											newCompositeNode(grammarAccess.getFeatureStoreAccess().getEntitiesEntityParserRuleCall_3_1_1_0());
            	    										
            	    pushFollow(FOLLOW_10);
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

            	    // InternalPanoptesX.g:486:9: (otherlv_10= ',' ( (lv_entities_11_0= ruleEntity ) ) )*
            	    loop5:
            	    do {
            	        int alt5=2;
            	        int LA5_0 = input.LA(1);

            	        if ( (LA5_0==15) ) {
            	            alt5=1;
            	        }


            	        switch (alt5) {
            	    	case 1 :
            	    	    // InternalPanoptesX.g:487:10: otherlv_10= ',' ( (lv_entities_11_0= ruleEntity ) )
            	    	    {
            	    	    otherlv_10=(Token)match(input,15,FOLLOW_4); 

            	    	    										newLeafNode(otherlv_10, grammarAccess.getFeatureStoreAccess().getCommaKeyword_3_1_2_0());
            	    	    									
            	    	    // InternalPanoptesX.g:491:10: ( (lv_entities_11_0= ruleEntity ) )
            	    	    // InternalPanoptesX.g:492:11: (lv_entities_11_0= ruleEntity )
            	    	    {
            	    	    // InternalPanoptesX.g:492:11: (lv_entities_11_0= ruleEntity )
            	    	    // InternalPanoptesX.g:493:12: lv_entities_11_0= ruleEntity
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getFeatureStoreAccess().getEntitiesEntityParserRuleCall_3_1_2_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_10);
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
            	case 3 :
            	    // InternalPanoptesX.g:517:4: ({...}? => ( ({...}? => (otherlv_12= 'labels' ( (lv_labels_13_0= ruleLabel ) ) (otherlv_14= ',' ( (lv_labels_15_0= ruleLabel ) ) )* ) ) ) )
            	    {
            	    // InternalPanoptesX.g:517:4: ({...}? => ( ({...}? => (otherlv_12= 'labels' ( (lv_labels_13_0= ruleLabel ) ) (otherlv_14= ',' ( (lv_labels_15_0= ruleLabel ) ) )* ) ) ) )
            	    // InternalPanoptesX.g:518:5: {...}? => ( ({...}? => (otherlv_12= 'labels' ( (lv_labels_13_0= ruleLabel ) ) (otherlv_14= ',' ( (lv_labels_15_0= ruleLabel ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureStoreAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleFeatureStore", "getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureStoreAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalPanoptesX.g:518:109: ( ({...}? => (otherlv_12= 'labels' ( (lv_labels_13_0= ruleLabel ) ) (otherlv_14= ',' ( (lv_labels_15_0= ruleLabel ) ) )* ) ) )
            	    // InternalPanoptesX.g:519:6: ({...}? => (otherlv_12= 'labels' ( (lv_labels_13_0= ruleLabel ) ) (otherlv_14= ',' ( (lv_labels_15_0= ruleLabel ) ) )* ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFeatureStoreAccess().getUnorderedGroup_3(), 2);
            	    					
            	    // InternalPanoptesX.g:522:9: ({...}? => (otherlv_12= 'labels' ( (lv_labels_13_0= ruleLabel ) ) (otherlv_14= ',' ( (lv_labels_15_0= ruleLabel ) ) )* ) )
            	    // InternalPanoptesX.g:522:10: {...}? => (otherlv_12= 'labels' ( (lv_labels_13_0= ruleLabel ) ) (otherlv_14= ',' ( (lv_labels_15_0= ruleLabel ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFeatureStore", "true");
            	    }
            	    // InternalPanoptesX.g:522:19: (otherlv_12= 'labels' ( (lv_labels_13_0= ruleLabel ) ) (otherlv_14= ',' ( (lv_labels_15_0= ruleLabel ) ) )* )
            	    // InternalPanoptesX.g:522:20: otherlv_12= 'labels' ( (lv_labels_13_0= ruleLabel ) ) (otherlv_14= ',' ( (lv_labels_15_0= ruleLabel ) ) )*
            	    {
            	    otherlv_12=(Token)match(input,21,FOLLOW_4); 

            	    									newLeafNode(otherlv_12, grammarAccess.getFeatureStoreAccess().getLabelsKeyword_3_2_0());
            	    								
            	    // InternalPanoptesX.g:526:9: ( (lv_labels_13_0= ruleLabel ) )
            	    // InternalPanoptesX.g:527:10: (lv_labels_13_0= ruleLabel )
            	    {
            	    // InternalPanoptesX.g:527:10: (lv_labels_13_0= ruleLabel )
            	    // InternalPanoptesX.g:528:11: lv_labels_13_0= ruleLabel
            	    {

            	    											newCompositeNode(grammarAccess.getFeatureStoreAccess().getLabelsLabelParserRuleCall_3_2_1_0());
            	    										
            	    pushFollow(FOLLOW_10);
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

            	    // InternalPanoptesX.g:545:9: (otherlv_14= ',' ( (lv_labels_15_0= ruleLabel ) ) )*
            	    loop6:
            	    do {
            	        int alt6=2;
            	        int LA6_0 = input.LA(1);

            	        if ( (LA6_0==15) ) {
            	            alt6=1;
            	        }


            	        switch (alt6) {
            	    	case 1 :
            	    	    // InternalPanoptesX.g:546:10: otherlv_14= ',' ( (lv_labels_15_0= ruleLabel ) )
            	    	    {
            	    	    otherlv_14=(Token)match(input,15,FOLLOW_4); 

            	    	    										newLeafNode(otherlv_14, grammarAccess.getFeatureStoreAccess().getCommaKeyword_3_2_2_0());
            	    	    									
            	    	    // InternalPanoptesX.g:550:10: ( (lv_labels_15_0= ruleLabel ) )
            	    	    // InternalPanoptesX.g:551:11: (lv_labels_15_0= ruleLabel )
            	    	    {
            	    	    // InternalPanoptesX.g:551:11: (lv_labels_15_0= ruleLabel )
            	    	    // InternalPanoptesX.g:552:12: lv_labels_15_0= ruleLabel
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getFeatureStoreAccess().getLabelsLabelParserRuleCall_3_2_2_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_10);
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
            	case 4 :
            	    // InternalPanoptesX.g:576:4: ({...}? => ( ({...}? => (otherlv_16= 'request' otherlv_17= 'data' ( (lv_requestData_18_0= ruleRequestData ) ) (otherlv_19= ',' ( (lv_requestData_20_0= ruleRequestData ) ) )* ) ) ) )
            	    {
            	    // InternalPanoptesX.g:576:4: ({...}? => ( ({...}? => (otherlv_16= 'request' otherlv_17= 'data' ( (lv_requestData_18_0= ruleRequestData ) ) (otherlv_19= ',' ( (lv_requestData_20_0= ruleRequestData ) ) )* ) ) ) )
            	    // InternalPanoptesX.g:577:5: {...}? => ( ({...}? => (otherlv_16= 'request' otherlv_17= 'data' ( (lv_requestData_18_0= ruleRequestData ) ) (otherlv_19= ',' ( (lv_requestData_20_0= ruleRequestData ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureStoreAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleFeatureStore", "getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureStoreAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // InternalPanoptesX.g:577:109: ( ({...}? => (otherlv_16= 'request' otherlv_17= 'data' ( (lv_requestData_18_0= ruleRequestData ) ) (otherlv_19= ',' ( (lv_requestData_20_0= ruleRequestData ) ) )* ) ) )
            	    // InternalPanoptesX.g:578:6: ({...}? => (otherlv_16= 'request' otherlv_17= 'data' ( (lv_requestData_18_0= ruleRequestData ) ) (otherlv_19= ',' ( (lv_requestData_20_0= ruleRequestData ) ) )* ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFeatureStoreAccess().getUnorderedGroup_3(), 3);
            	    					
            	    // InternalPanoptesX.g:581:9: ({...}? => (otherlv_16= 'request' otherlv_17= 'data' ( (lv_requestData_18_0= ruleRequestData ) ) (otherlv_19= ',' ( (lv_requestData_20_0= ruleRequestData ) ) )* ) )
            	    // InternalPanoptesX.g:581:10: {...}? => (otherlv_16= 'request' otherlv_17= 'data' ( (lv_requestData_18_0= ruleRequestData ) ) (otherlv_19= ',' ( (lv_requestData_20_0= ruleRequestData ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFeatureStore", "true");
            	    }
            	    // InternalPanoptesX.g:581:19: (otherlv_16= 'request' otherlv_17= 'data' ( (lv_requestData_18_0= ruleRequestData ) ) (otherlv_19= ',' ( (lv_requestData_20_0= ruleRequestData ) ) )* )
            	    // InternalPanoptesX.g:581:20: otherlv_16= 'request' otherlv_17= 'data' ( (lv_requestData_18_0= ruleRequestData ) ) (otherlv_19= ',' ( (lv_requestData_20_0= ruleRequestData ) ) )*
            	    {
            	    otherlv_16=(Token)match(input,22,FOLLOW_11); 

            	    									newLeafNode(otherlv_16, grammarAccess.getFeatureStoreAccess().getRequestKeyword_3_3_0());
            	    								
            	    otherlv_17=(Token)match(input,23,FOLLOW_4); 

            	    									newLeafNode(otherlv_17, grammarAccess.getFeatureStoreAccess().getDataKeyword_3_3_1());
            	    								
            	    // InternalPanoptesX.g:589:9: ( (lv_requestData_18_0= ruleRequestData ) )
            	    // InternalPanoptesX.g:590:10: (lv_requestData_18_0= ruleRequestData )
            	    {
            	    // InternalPanoptesX.g:590:10: (lv_requestData_18_0= ruleRequestData )
            	    // InternalPanoptesX.g:591:11: lv_requestData_18_0= ruleRequestData
            	    {

            	    											newCompositeNode(grammarAccess.getFeatureStoreAccess().getRequestDataRequestDataParserRuleCall_3_3_2_0());
            	    										
            	    pushFollow(FOLLOW_10);
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

            	    // InternalPanoptesX.g:608:9: (otherlv_19= ',' ( (lv_requestData_20_0= ruleRequestData ) ) )*
            	    loop7:
            	    do {
            	        int alt7=2;
            	        int LA7_0 = input.LA(1);

            	        if ( (LA7_0==15) ) {
            	            alt7=1;
            	        }


            	        switch (alt7) {
            	    	case 1 :
            	    	    // InternalPanoptesX.g:609:10: otherlv_19= ',' ( (lv_requestData_20_0= ruleRequestData ) )
            	    	    {
            	    	    otherlv_19=(Token)match(input,15,FOLLOW_4); 

            	    	    										newLeafNode(otherlv_19, grammarAccess.getFeatureStoreAccess().getCommaKeyword_3_3_3_0());
            	    	    									
            	    	    // InternalPanoptesX.g:613:10: ( (lv_requestData_20_0= ruleRequestData ) )
            	    	    // InternalPanoptesX.g:614:11: (lv_requestData_20_0= ruleRequestData )
            	    	    {
            	    	    // InternalPanoptesX.g:614:11: (lv_requestData_20_0= ruleRequestData )
            	    	    // InternalPanoptesX.g:615:12: lv_requestData_20_0= ruleRequestData
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getFeatureStoreAccess().getRequestDataRequestDataParserRuleCall_3_3_3_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_10);
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

            	default :
            	    break loop8;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getFeatureStoreAccess().getUnorderedGroup_3());
            				

            }

            otherlv_21=(Token)match(input,17,FOLLOW_2); 

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
    // InternalPanoptesX.g:654:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalPanoptesX.g:654:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalPanoptesX.g:655:2: iv_ruleEntity= ruleEntity EOF
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
    // InternalPanoptesX.g:661:1: ruleEntity returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'keys' ( (lv_keys_3_0= ruleKey ) ) (otherlv_4= ',' ( (lv_keys_5_0= ruleKey ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_keys_3_0 = null;

        EObject lv_keys_5_0 = null;



        	enterRule();

        try {
            // InternalPanoptesX.g:667:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'keys' ( (lv_keys_3_0= ruleKey ) ) (otherlv_4= ',' ( (lv_keys_5_0= ruleKey ) ) )* otherlv_6= '}' ) )
            // InternalPanoptesX.g:668:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'keys' ( (lv_keys_3_0= ruleKey ) ) (otherlv_4= ',' ( (lv_keys_5_0= ruleKey ) ) )* otherlv_6= '}' )
            {
            // InternalPanoptesX.g:668:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'keys' ( (lv_keys_3_0= ruleKey ) ) (otherlv_4= ',' ( (lv_keys_5_0= ruleKey ) ) )* otherlv_6= '}' )
            // InternalPanoptesX.g:669:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'keys' ( (lv_keys_3_0= ruleKey ) ) (otherlv_4= ',' ( (lv_keys_5_0= ruleKey ) ) )* otherlv_6= '}'
            {
            // InternalPanoptesX.g:669:3: ( (lv_name_0_0= ruleEString ) )
            // InternalPanoptesX.g:670:4: (lv_name_0_0= ruleEString )
            {
            // InternalPanoptesX.g:670:4: (lv_name_0_0= ruleEString )
            // InternalPanoptesX.g:671:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEntityAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntityRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.lowcomote.panoptes.PanoptesX.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getKeysKeyword_2());
            		
            // InternalPanoptesX.g:696:3: ( (lv_keys_3_0= ruleKey ) )
            // InternalPanoptesX.g:697:4: (lv_keys_3_0= ruleKey )
            {
            // InternalPanoptesX.g:697:4: (lv_keys_3_0= ruleKey )
            // InternalPanoptesX.g:698:5: lv_keys_3_0= ruleKey
            {

            					newCompositeNode(grammarAccess.getEntityAccess().getKeysKeyParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_13);
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

            // InternalPanoptesX.g:715:3: (otherlv_4= ',' ( (lv_keys_5_0= ruleKey ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==15) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalPanoptesX.g:716:4: otherlv_4= ',' ( (lv_keys_5_0= ruleKey ) )
            	    {
            	    otherlv_4=(Token)match(input,15,FOLLOW_4); 

            	    				newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalPanoptesX.g:720:4: ( (lv_keys_5_0= ruleKey ) )
            	    // InternalPanoptesX.g:721:5: (lv_keys_5_0= ruleKey )
            	    {
            	    // InternalPanoptesX.g:721:5: (lv_keys_5_0= ruleKey )
            	    // InternalPanoptesX.g:722:6: lv_keys_5_0= ruleKey
            	    {

            	    						newCompositeNode(grammarAccess.getEntityAccess().getKeysKeyParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_13);
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
            	    break loop9;
                }
            } while (true);

            otherlv_6=(Token)match(input,17,FOLLOW_2); 

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
    // InternalPanoptesX.g:748:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // InternalPanoptesX.g:748:48: (iv_ruleFeature= ruleFeature EOF )
            // InternalPanoptesX.g:749:2: iv_ruleFeature= ruleFeature EOF
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
    // InternalPanoptesX.g:755:1: ruleFeature returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= ':' ( (lv_type_2_0= rulestatisticalVariableType ) ) )? (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'requires' otherlv_6= 'entities' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'requires' otherlv_11= 'request' otherlv_12= 'data' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* ) ) ) ) )* ) ) ) otherlv_16= '}' )? ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

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
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        Enumerator lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalPanoptesX.g:761:2: ( ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= ':' ( (lv_type_2_0= rulestatisticalVariableType ) ) )? (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'requires' otherlv_6= 'entities' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'requires' otherlv_11= 'request' otherlv_12= 'data' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* ) ) ) ) )* ) ) ) otherlv_16= '}' )? ) )
            // InternalPanoptesX.g:762:2: ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= ':' ( (lv_type_2_0= rulestatisticalVariableType ) ) )? (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'requires' otherlv_6= 'entities' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'requires' otherlv_11= 'request' otherlv_12= 'data' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* ) ) ) ) )* ) ) ) otherlv_16= '}' )? )
            {
            // InternalPanoptesX.g:762:2: ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= ':' ( (lv_type_2_0= rulestatisticalVariableType ) ) )? (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'requires' otherlv_6= 'entities' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'requires' otherlv_11= 'request' otherlv_12= 'data' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* ) ) ) ) )* ) ) ) otherlv_16= '}' )? )
            // InternalPanoptesX.g:763:3: ( (lv_name_0_0= ruleEString ) ) (otherlv_1= ':' ( (lv_type_2_0= rulestatisticalVariableType ) ) )? (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'requires' otherlv_6= 'entities' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'requires' otherlv_11= 'request' otherlv_12= 'data' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* ) ) ) ) )* ) ) ) otherlv_16= '}' )?
            {
            // InternalPanoptesX.g:763:3: ( (lv_name_0_0= ruleEString ) )
            // InternalPanoptesX.g:764:4: (lv_name_0_0= ruleEString )
            {
            // InternalPanoptesX.g:764:4: (lv_name_0_0= ruleEString )
            // InternalPanoptesX.g:765:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFeatureAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_14);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFeatureRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.lowcomote.panoptes.PanoptesX.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPanoptesX.g:782:3: (otherlv_1= ':' ( (lv_type_2_0= rulestatisticalVariableType ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalPanoptesX.g:783:4: otherlv_1= ':' ( (lv_type_2_0= rulestatisticalVariableType ) )
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_15); 

                    				newLeafNode(otherlv_1, grammarAccess.getFeatureAccess().getColonKeyword_1_0());
                    			
                    // InternalPanoptesX.g:787:4: ( (lv_type_2_0= rulestatisticalVariableType ) )
                    // InternalPanoptesX.g:788:5: (lv_type_2_0= rulestatisticalVariableType )
                    {
                    // InternalPanoptesX.g:788:5: (lv_type_2_0= rulestatisticalVariableType )
                    // InternalPanoptesX.g:789:6: lv_type_2_0= rulestatisticalVariableType
                    {

                    						newCompositeNode(grammarAccess.getFeatureAccess().getTypeStatisticalVariableTypeEnumRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_16);
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

            // InternalPanoptesX.g:807:3: (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'requires' otherlv_6= 'entities' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'requires' otherlv_11= 'request' otherlv_12= 'data' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* ) ) ) ) )* ) ) ) otherlv_16= '}' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==13) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalPanoptesX.g:808:4: otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'requires' otherlv_6= 'entities' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'requires' otherlv_11= 'request' otherlv_12= 'data' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* ) ) ) ) )* ) ) ) otherlv_16= '}'
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_17); 

                    				newLeafNode(otherlv_3, grammarAccess.getFeatureAccess().getLeftCurlyBracketKeyword_2_0());
                    			
                    // InternalPanoptesX.g:812:4: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'requires' otherlv_6= 'entities' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'requires' otherlv_11= 'request' otherlv_12= 'data' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* ) ) ) ) )* ) ) )
                    // InternalPanoptesX.g:813:5: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'requires' otherlv_6= 'entities' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'requires' otherlv_11= 'request' otherlv_12= 'data' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* ) ) ) ) )* ) )
                    {
                    // InternalPanoptesX.g:813:5: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'requires' otherlv_6= 'entities' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'requires' otherlv_11= 'request' otherlv_12= 'data' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* ) ) ) ) )* ) )
                    // InternalPanoptesX.g:814:6: ( ( ({...}? => ( ({...}? => (otherlv_5= 'requires' otherlv_6= 'entities' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'requires' otherlv_11= 'request' otherlv_12= 'data' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* ) ) ) ) )* )
                    {
                     
                    					  getUnorderedGroupHelper().enter(grammarAccess.getFeatureAccess().getUnorderedGroup_2_1());
                    					
                    // InternalPanoptesX.g:817:6: ( ( ({...}? => ( ({...}? => (otherlv_5= 'requires' otherlv_6= 'entities' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'requires' otherlv_11= 'request' otherlv_12= 'data' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* ) ) ) ) )* )
                    // InternalPanoptesX.g:818:7: ( ({...}? => ( ({...}? => (otherlv_5= 'requires' otherlv_6= 'entities' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'requires' otherlv_11= 'request' otherlv_12= 'data' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* ) ) ) ) )*
                    {
                    // InternalPanoptesX.g:818:7: ( ({...}? => ( ({...}? => (otherlv_5= 'requires' otherlv_6= 'entities' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'requires' otherlv_11= 'request' otherlv_12= 'data' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* ) ) ) ) )*
                    loop13:
                    do {
                        int alt13=3;
                        int LA13_0 = input.LA(1);

                        if ( LA13_0 == 26 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureAccess().getUnorderedGroup_2_1(), 1) || getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureAccess().getUnorderedGroup_2_1(), 0) ) ) {
                            int LA13_2 = input.LA(2);

                            if ( LA13_2 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureAccess().getUnorderedGroup_2_1(), 1) ) {
                                alt13=2;
                            }
                            else if ( LA13_2 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureAccess().getUnorderedGroup_2_1(), 0) ) {
                                alt13=1;
                            }


                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalPanoptesX.g:819:5: ({...}? => ( ({...}? => (otherlv_5= 'requires' otherlv_6= 'entities' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* ) ) ) )
                    	    {
                    	    // InternalPanoptesX.g:819:5: ({...}? => ( ({...}? => (otherlv_5= 'requires' otherlv_6= 'entities' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* ) ) ) )
                    	    // InternalPanoptesX.g:820:6: {...}? => ( ({...}? => (otherlv_5= 'requires' otherlv_6= 'entities' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureAccess().getUnorderedGroup_2_1(), 0) ) {
                    	        throw new FailedPredicateException(input, "ruleFeature", "getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureAccess().getUnorderedGroup_2_1(), 0)");
                    	    }
                    	    // InternalPanoptesX.g:820:107: ( ({...}? => (otherlv_5= 'requires' otherlv_6= 'entities' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* ) ) )
                    	    // InternalPanoptesX.g:821:7: ({...}? => (otherlv_5= 'requires' otherlv_6= 'entities' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getFeatureAccess().getUnorderedGroup_2_1(), 0);
                    	    						
                    	    // InternalPanoptesX.g:824:10: ({...}? => (otherlv_5= 'requires' otherlv_6= 'entities' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* ) )
                    	    // InternalPanoptesX.g:824:11: {...}? => (otherlv_5= 'requires' otherlv_6= 'entities' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleFeature", "true");
                    	    }
                    	    // InternalPanoptesX.g:824:20: (otherlv_5= 'requires' otherlv_6= 'entities' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )
                    	    // InternalPanoptesX.g:824:21: otherlv_5= 'requires' otherlv_6= 'entities' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )*
                    	    {
                    	    otherlv_5=(Token)match(input,26,FOLLOW_18); 

                    	    										newLeafNode(otherlv_5, grammarAccess.getFeatureAccess().getRequiresKeyword_2_1_0_0());
                    	    									
                    	    otherlv_6=(Token)match(input,20,FOLLOW_4); 

                    	    										newLeafNode(otherlv_6, grammarAccess.getFeatureAccess().getEntitiesKeyword_2_1_0_1());
                    	    									
                    	    // InternalPanoptesX.g:832:10: ( ( ruleEString ) )
                    	    // InternalPanoptesX.g:833:11: ( ruleEString )
                    	    {
                    	    // InternalPanoptesX.g:833:11: ( ruleEString )
                    	    // InternalPanoptesX.g:834:12: ruleEString
                    	    {

                    	    												if (current==null) {
                    	    													current = createModelElement(grammarAccess.getFeatureRule());
                    	    												}
                    	    											

                    	    												newCompositeNode(grammarAccess.getFeatureAccess().getEntitiesEntityCrossReference_2_1_0_2_0());
                    	    											
                    	    pushFollow(FOLLOW_19);
                    	    ruleEString();

                    	    state._fsp--;


                    	    												afterParserOrEnumRuleCall();
                    	    											

                    	    }


                    	    }

                    	    // InternalPanoptesX.g:848:10: (otherlv_8= ',' ( ( ruleEString ) ) )*
                    	    loop11:
                    	    do {
                    	        int alt11=2;
                    	        int LA11_0 = input.LA(1);

                    	        if ( (LA11_0==15) ) {
                    	            alt11=1;
                    	        }


                    	        switch (alt11) {
                    	    	case 1 :
                    	    	    // InternalPanoptesX.g:849:11: otherlv_8= ',' ( ( ruleEString ) )
                    	    	    {
                    	    	    otherlv_8=(Token)match(input,15,FOLLOW_4); 

                    	    	    											newLeafNode(otherlv_8, grammarAccess.getFeatureAccess().getCommaKeyword_2_1_0_3_0());
                    	    	    										
                    	    	    // InternalPanoptesX.g:853:11: ( ( ruleEString ) )
                    	    	    // InternalPanoptesX.g:854:12: ( ruleEString )
                    	    	    {
                    	    	    // InternalPanoptesX.g:854:12: ( ruleEString )
                    	    	    // InternalPanoptesX.g:855:13: ruleEString
                    	    	    {

                    	    	    													if (current==null) {
                    	    	    														current = createModelElement(grammarAccess.getFeatureRule());
                    	    	    													}
                    	    	    												

                    	    	    													newCompositeNode(grammarAccess.getFeatureAccess().getEntitiesEntityCrossReference_2_1_0_3_1_0());
                    	    	    												
                    	    	    pushFollow(FOLLOW_19);
                    	    	    ruleEString();

                    	    	    state._fsp--;


                    	    	    													afterParserOrEnumRuleCall();
                    	    	    												

                    	    	    }


                    	    	    }


                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop11;
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
                    	    // InternalPanoptesX.g:876:5: ({...}? => ( ({...}? => (otherlv_10= 'requires' otherlv_11= 'request' otherlv_12= 'data' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* ) ) ) )
                    	    {
                    	    // InternalPanoptesX.g:876:5: ({...}? => ( ({...}? => (otherlv_10= 'requires' otherlv_11= 'request' otherlv_12= 'data' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* ) ) ) )
                    	    // InternalPanoptesX.g:877:6: {...}? => ( ({...}? => (otherlv_10= 'requires' otherlv_11= 'request' otherlv_12= 'data' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureAccess().getUnorderedGroup_2_1(), 1) ) {
                    	        throw new FailedPredicateException(input, "ruleFeature", "getUnorderedGroupHelper().canSelect(grammarAccess.getFeatureAccess().getUnorderedGroup_2_1(), 1)");
                    	    }
                    	    // InternalPanoptesX.g:877:107: ( ({...}? => (otherlv_10= 'requires' otherlv_11= 'request' otherlv_12= 'data' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* ) ) )
                    	    // InternalPanoptesX.g:878:7: ({...}? => (otherlv_10= 'requires' otherlv_11= 'request' otherlv_12= 'data' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getFeatureAccess().getUnorderedGroup_2_1(), 1);
                    	    						
                    	    // InternalPanoptesX.g:881:10: ({...}? => (otherlv_10= 'requires' otherlv_11= 'request' otherlv_12= 'data' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* ) )
                    	    // InternalPanoptesX.g:881:11: {...}? => (otherlv_10= 'requires' otherlv_11= 'request' otherlv_12= 'data' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleFeature", "true");
                    	    }
                    	    // InternalPanoptesX.g:881:20: (otherlv_10= 'requires' otherlv_11= 'request' otherlv_12= 'data' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* )
                    	    // InternalPanoptesX.g:881:21: otherlv_10= 'requires' otherlv_11= 'request' otherlv_12= 'data' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )*
                    	    {
                    	    otherlv_10=(Token)match(input,26,FOLLOW_20); 

                    	    										newLeafNode(otherlv_10, grammarAccess.getFeatureAccess().getRequiresKeyword_2_1_1_0());
                    	    									
                    	    otherlv_11=(Token)match(input,22,FOLLOW_11); 

                    	    										newLeafNode(otherlv_11, grammarAccess.getFeatureAccess().getRequestKeyword_2_1_1_1());
                    	    									
                    	    otherlv_12=(Token)match(input,23,FOLLOW_4); 

                    	    										newLeafNode(otherlv_12, grammarAccess.getFeatureAccess().getDataKeyword_2_1_1_2());
                    	    									
                    	    // InternalPanoptesX.g:893:10: ( ( ruleEString ) )
                    	    // InternalPanoptesX.g:894:11: ( ruleEString )
                    	    {
                    	    // InternalPanoptesX.g:894:11: ( ruleEString )
                    	    // InternalPanoptesX.g:895:12: ruleEString
                    	    {

                    	    												if (current==null) {
                    	    													current = createModelElement(grammarAccess.getFeatureRule());
                    	    												}
                    	    											

                    	    												newCompositeNode(grammarAccess.getFeatureAccess().getRequestDataRequestDataCrossReference_2_1_1_3_0());
                    	    											
                    	    pushFollow(FOLLOW_19);
                    	    ruleEString();

                    	    state._fsp--;


                    	    												afterParserOrEnumRuleCall();
                    	    											

                    	    }


                    	    }

                    	    // InternalPanoptesX.g:909:10: (otherlv_14= ',' ( ( ruleEString ) ) )*
                    	    loop12:
                    	    do {
                    	        int alt12=2;
                    	        int LA12_0 = input.LA(1);

                    	        if ( (LA12_0==15) ) {
                    	            alt12=1;
                    	        }


                    	        switch (alt12) {
                    	    	case 1 :
                    	    	    // InternalPanoptesX.g:910:11: otherlv_14= ',' ( ( ruleEString ) )
                    	    	    {
                    	    	    otherlv_14=(Token)match(input,15,FOLLOW_4); 

                    	    	    											newLeafNode(otherlv_14, grammarAccess.getFeatureAccess().getCommaKeyword_2_1_1_4_0());
                    	    	    										
                    	    	    // InternalPanoptesX.g:914:11: ( ( ruleEString ) )
                    	    	    // InternalPanoptesX.g:915:12: ( ruleEString )
                    	    	    {
                    	    	    // InternalPanoptesX.g:915:12: ( ruleEString )
                    	    	    // InternalPanoptesX.g:916:13: ruleEString
                    	    	    {

                    	    	    													if (current==null) {
                    	    	    														current = createModelElement(grammarAccess.getFeatureRule());
                    	    	    													}
                    	    	    												

                    	    	    													newCompositeNode(grammarAccess.getFeatureAccess().getRequestDataRequestDataCrossReference_2_1_1_4_1_0());
                    	    	    												
                    	    	    pushFollow(FOLLOW_19);
                    	    	    ruleEString();

                    	    	    state._fsp--;


                    	    	    													afterParserOrEnumRuleCall();
                    	    	    												

                    	    	    }


                    	    	    }


                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop12;
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
                    	    break loop13;
                        }
                    } while (true);


                    }


                    }

                     
                    					  getUnorderedGroupHelper().leave(grammarAccess.getFeatureAccess().getUnorderedGroup_2_1());
                    					

                    }

                    otherlv_16=(Token)match(input,17,FOLLOW_2); 

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
    // InternalPanoptesX.g:953:1: entryRulePrediction returns [EObject current=null] : iv_rulePrediction= rulePrediction EOF ;
    public final EObject entryRulePrediction() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrediction = null;


        try {
            // InternalPanoptesX.g:953:51: (iv_rulePrediction= rulePrediction EOF )
            // InternalPanoptesX.g:954:2: iv_rulePrediction= rulePrediction EOF
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
    // InternalPanoptesX.g:960:1: rulePrediction returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'predicts' ( ( ruleEString ) ) )? ) ;
    public final EObject rulePrediction() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalPanoptesX.g:966:2: ( ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'predicts' ( ( ruleEString ) ) )? ) )
            // InternalPanoptesX.g:967:2: ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'predicts' ( ( ruleEString ) ) )? )
            {
            // InternalPanoptesX.g:967:2: ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'predicts' ( ( ruleEString ) ) )? )
            // InternalPanoptesX.g:968:3: () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'predicts' ( ( ruleEString ) ) )?
            {
            // InternalPanoptesX.g:968:3: ()
            // InternalPanoptesX.g:969:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPredictionAccess().getPredictionAction_0(),
            					current);
            			

            }

            // InternalPanoptesX.g:975:3: ( (lv_name_1_0= ruleEString ) )
            // InternalPanoptesX.g:976:4: (lv_name_1_0= ruleEString )
            {
            // InternalPanoptesX.g:976:4: (lv_name_1_0= ruleEString )
            // InternalPanoptesX.g:977:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPredictionAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_21);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPredictionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.lowcomote.panoptes.PanoptesX.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPanoptesX.g:994:3: (otherlv_2= 'predicts' ( ( ruleEString ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==27) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalPanoptesX.g:995:4: otherlv_2= 'predicts' ( ( ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getPredictionAccess().getPredictsKeyword_2_0());
                    			
                    // InternalPanoptesX.g:999:4: ( ( ruleEString ) )
                    // InternalPanoptesX.g:1000:5: ( ruleEString )
                    {
                    // InternalPanoptesX.g:1000:5: ( ruleEString )
                    // InternalPanoptesX.g:1001:6: ruleEString
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
    // InternalPanoptesX.g:1020:1: entryRuleLabel returns [EObject current=null] : iv_ruleLabel= ruleLabel EOF ;
    public final EObject entryRuleLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabel = null;


        try {
            // InternalPanoptesX.g:1020:46: (iv_ruleLabel= ruleLabel EOF )
            // InternalPanoptesX.g:1021:2: iv_ruleLabel= ruleLabel EOF
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
    // InternalPanoptesX.g:1027:1: ruleLabel returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= ':' ( (lv_type_3_0= rulestatisticalVariableType ) ) )? ) ;
    public final EObject ruleLabel() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        Enumerator lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalPanoptesX.g:1033:2: ( ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= ':' ( (lv_type_3_0= rulestatisticalVariableType ) ) )? ) )
            // InternalPanoptesX.g:1034:2: ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= ':' ( (lv_type_3_0= rulestatisticalVariableType ) ) )? )
            {
            // InternalPanoptesX.g:1034:2: ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= ':' ( (lv_type_3_0= rulestatisticalVariableType ) ) )? )
            // InternalPanoptesX.g:1035:3: () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= ':' ( (lv_type_3_0= rulestatisticalVariableType ) ) )?
            {
            // InternalPanoptesX.g:1035:3: ()
            // InternalPanoptesX.g:1036:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLabelAccess().getLabelAction_0(),
            					current);
            			

            }

            // InternalPanoptesX.g:1042:3: ( (lv_name_1_0= ruleEString ) )
            // InternalPanoptesX.g:1043:4: (lv_name_1_0= ruleEString )
            {
            // InternalPanoptesX.g:1043:4: (lv_name_1_0= ruleEString )
            // InternalPanoptesX.g:1044:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLabelAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_22);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLabelRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.lowcomote.panoptes.PanoptesX.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPanoptesX.g:1061:3: (otherlv_2= ':' ( (lv_type_3_0= rulestatisticalVariableType ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==25) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalPanoptesX.g:1062:4: otherlv_2= ':' ( (lv_type_3_0= rulestatisticalVariableType ) )
                    {
                    otherlv_2=(Token)match(input,25,FOLLOW_15); 

                    				newLeafNode(otherlv_2, grammarAccess.getLabelAccess().getColonKeyword_2_0());
                    			
                    // InternalPanoptesX.g:1066:4: ( (lv_type_3_0= rulestatisticalVariableType ) )
                    // InternalPanoptesX.g:1067:5: (lv_type_3_0= rulestatisticalVariableType )
                    {
                    // InternalPanoptesX.g:1067:5: (lv_type_3_0= rulestatisticalVariableType )
                    // InternalPanoptesX.g:1068:6: lv_type_3_0= rulestatisticalVariableType
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
    // InternalPanoptesX.g:1090:1: entryRuleRequestData returns [EObject current=null] : iv_ruleRequestData= ruleRequestData EOF ;
    public final EObject entryRuleRequestData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequestData = null;


        try {
            // InternalPanoptesX.g:1090:52: (iv_ruleRequestData= ruleRequestData EOF )
            // InternalPanoptesX.g:1091:2: iv_ruleRequestData= ruleRequestData EOF
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
    // InternalPanoptesX.g:1097:1: ruleRequestData returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleRequestData() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalPanoptesX.g:1103:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalPanoptesX.g:1104:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalPanoptesX.g:1104:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalPanoptesX.g:1105:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalPanoptesX.g:1105:3: ()
            // InternalPanoptesX.g:1106:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRequestDataAccess().getRequestDataAction_0(),
            					current);
            			

            }

            // InternalPanoptesX.g:1112:3: ( (lv_name_1_0= ruleEString ) )
            // InternalPanoptesX.g:1113:4: (lv_name_1_0= ruleEString )
            {
            // InternalPanoptesX.g:1113:4: (lv_name_1_0= ruleEString )
            // InternalPanoptesX.g:1114:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRequestDataAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRequestDataRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
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
    // $ANTLR end "ruleRequestData"


    // $ANTLR start "entryRuleKey"
    // InternalPanoptesX.g:1135:1: entryRuleKey returns [EObject current=null] : iv_ruleKey= ruleKey EOF ;
    public final EObject entryRuleKey() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKey = null;


        try {
            // InternalPanoptesX.g:1135:44: (iv_ruleKey= ruleKey EOF )
            // InternalPanoptesX.g:1136:2: iv_ruleKey= ruleKey EOF
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
    // InternalPanoptesX.g:1142:1: ruleKey returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleKey() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalPanoptesX.g:1148:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalPanoptesX.g:1149:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalPanoptesX.g:1149:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalPanoptesX.g:1150:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalPanoptesX.g:1150:3: ()
            // InternalPanoptesX.g:1151:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getKeyAccess().getKeyAction_0(),
            					current);
            			

            }

            // InternalPanoptesX.g:1157:3: ( (lv_name_1_0= ruleEString ) )
            // InternalPanoptesX.g:1158:4: (lv_name_1_0= ruleEString )
            {
            // InternalPanoptesX.g:1158:4: (lv_name_1_0= ruleEString )
            // InternalPanoptesX.g:1159:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getKeyAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getKeyRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
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
    // $ANTLR end "ruleKey"


    // $ANTLR start "entryRuleDeployment"
    // InternalPanoptesX.g:1180:1: entryRuleDeployment returns [EObject current=null] : iv_ruleDeployment= ruleDeployment EOF ;
    public final EObject entryRuleDeployment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeployment = null;


        try {
            // InternalPanoptesX.g:1180:51: (iv_ruleDeployment= ruleDeployment EOF )
            // InternalPanoptesX.g:1181:2: iv_ruleDeployment= ruleDeployment EOF
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
    // InternalPanoptesX.g:1187:1: ruleDeployment returns [EObject current=null] : (otherlv_0= 'Deployment' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (otherlv_3= 'model' ( ( ruleEString ) ) ) | (otherlv_5= 'inputs' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* ) | ( (lv_algorithmexecutions_9_0= ruleAlgorithmExecution ) ) | ( (lv_actionExecutions_10_0= ruleActionExecution ) ) | ( (lv_triggerGroups_11_0= ruleTriggerGroup ) ) )* otherlv_12= '}' ) ;
    public final EObject ruleDeployment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_algorithmexecutions_9_0 = null;

        EObject lv_actionExecutions_10_0 = null;

        EObject lv_triggerGroups_11_0 = null;



        	enterRule();

        try {
            // InternalPanoptesX.g:1193:2: ( (otherlv_0= 'Deployment' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (otherlv_3= 'model' ( ( ruleEString ) ) ) | (otherlv_5= 'inputs' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* ) | ( (lv_algorithmexecutions_9_0= ruleAlgorithmExecution ) ) | ( (lv_actionExecutions_10_0= ruleActionExecution ) ) | ( (lv_triggerGroups_11_0= ruleTriggerGroup ) ) )* otherlv_12= '}' ) )
            // InternalPanoptesX.g:1194:2: (otherlv_0= 'Deployment' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (otherlv_3= 'model' ( ( ruleEString ) ) ) | (otherlv_5= 'inputs' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* ) | ( (lv_algorithmexecutions_9_0= ruleAlgorithmExecution ) ) | ( (lv_actionExecutions_10_0= ruleActionExecution ) ) | ( (lv_triggerGroups_11_0= ruleTriggerGroup ) ) )* otherlv_12= '}' )
            {
            // InternalPanoptesX.g:1194:2: (otherlv_0= 'Deployment' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (otherlv_3= 'model' ( ( ruleEString ) ) ) | (otherlv_5= 'inputs' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* ) | ( (lv_algorithmexecutions_9_0= ruleAlgorithmExecution ) ) | ( (lv_actionExecutions_10_0= ruleActionExecution ) ) | ( (lv_triggerGroups_11_0= ruleTriggerGroup ) ) )* otherlv_12= '}' )
            // InternalPanoptesX.g:1195:3: otherlv_0= 'Deployment' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (otherlv_3= 'model' ( ( ruleEString ) ) ) | (otherlv_5= 'inputs' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* ) | ( (lv_algorithmexecutions_9_0= ruleAlgorithmExecution ) ) | ( (lv_actionExecutions_10_0= ruleActionExecution ) ) | ( (lv_triggerGroups_11_0= ruleTriggerGroup ) ) )* otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDeploymentAccess().getDeploymentKeyword_0());
            		
            // InternalPanoptesX.g:1199:3: ( (lv_name_1_0= ruleEString ) )
            // InternalPanoptesX.g:1200:4: (lv_name_1_0= ruleEString )
            {
            // InternalPanoptesX.g:1200:4: (lv_name_1_0= ruleEString )
            // InternalPanoptesX.g:1201:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDeploymentAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeploymentRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.lowcomote.panoptes.PanoptesX.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getDeploymentAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalPanoptesX.g:1222:3: ( (otherlv_3= 'model' ( ( ruleEString ) ) ) | (otherlv_5= 'inputs' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* ) | ( (lv_algorithmexecutions_9_0= ruleAlgorithmExecution ) ) | ( (lv_actionExecutions_10_0= ruleActionExecution ) ) | ( (lv_triggerGroups_11_0= ruleTriggerGroup ) ) )*
            loop18:
            do {
                int alt18=6;
                switch ( input.LA(1) ) {
                case 29:
                    {
                    alt18=1;
                    }
                    break;
                case 30:
                    {
                    alt18=2;
                    }
                    break;
                case 43:
                case 50:
                    {
                    alt18=3;
                    }
                    break;
                case 69:
                    {
                    alt18=4;
                    }
                    break;
                case 59:
                    {
                    alt18=5;
                    }
                    break;

                }

                switch (alt18) {
            	case 1 :
            	    // InternalPanoptesX.g:1223:4: (otherlv_3= 'model' ( ( ruleEString ) ) )
            	    {
            	    // InternalPanoptesX.g:1223:4: (otherlv_3= 'model' ( ( ruleEString ) ) )
            	    // InternalPanoptesX.g:1224:5: otherlv_3= 'model' ( ( ruleEString ) )
            	    {
            	    otherlv_3=(Token)match(input,29,FOLLOW_4); 

            	    					newLeafNode(otherlv_3, grammarAccess.getDeploymentAccess().getModelKeyword_3_0_0());
            	    				
            	    // InternalPanoptesX.g:1228:5: ( ( ruleEString ) )
            	    // InternalPanoptesX.g:1229:6: ( ruleEString )
            	    {
            	    // InternalPanoptesX.g:1229:6: ( ruleEString )
            	    // InternalPanoptesX.g:1230:7: ruleEString
            	    {

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getDeploymentRule());
            	    							}
            	    						

            	    							newCompositeNode(grammarAccess.getDeploymentAccess().getMlModelModelCrossReference_3_0_1_0());
            	    						
            	    pushFollow(FOLLOW_23);
            	    ruleEString();

            	    state._fsp--;


            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalPanoptesX.g:1246:4: (otherlv_5= 'inputs' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )
            	    {
            	    // InternalPanoptesX.g:1246:4: (otherlv_5= 'inputs' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )
            	    // InternalPanoptesX.g:1247:5: otherlv_5= 'inputs' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )*
            	    {
            	    otherlv_5=(Token)match(input,30,FOLLOW_4); 

            	    					newLeafNode(otherlv_5, grammarAccess.getDeploymentAccess().getInputsKeyword_3_1_0());
            	    				
            	    // InternalPanoptesX.g:1251:5: ( ( ruleEString ) )
            	    // InternalPanoptesX.g:1252:6: ( ruleEString )
            	    {
            	    // InternalPanoptesX.g:1252:6: ( ruleEString )
            	    // InternalPanoptesX.g:1253:7: ruleEString
            	    {

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getDeploymentRule());
            	    							}
            	    						

            	    							newCompositeNode(grammarAccess.getDeploymentAccess().getInputsDeploymentIOCrossReference_3_1_1_0());
            	    						
            	    pushFollow(FOLLOW_24);
            	    ruleEString();

            	    state._fsp--;


            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }

            	    // InternalPanoptesX.g:1267:5: (otherlv_7= ',' ( ( ruleEString ) ) )*
            	    loop17:
            	    do {
            	        int alt17=2;
            	        int LA17_0 = input.LA(1);

            	        if ( (LA17_0==15) ) {
            	            alt17=1;
            	        }


            	        switch (alt17) {
            	    	case 1 :
            	    	    // InternalPanoptesX.g:1268:6: otherlv_7= ',' ( ( ruleEString ) )
            	    	    {
            	    	    otherlv_7=(Token)match(input,15,FOLLOW_4); 

            	    	    						newLeafNode(otherlv_7, grammarAccess.getDeploymentAccess().getCommaKeyword_3_1_2_0());
            	    	    					
            	    	    // InternalPanoptesX.g:1272:6: ( ( ruleEString ) )
            	    	    // InternalPanoptesX.g:1273:7: ( ruleEString )
            	    	    {
            	    	    // InternalPanoptesX.g:1273:7: ( ruleEString )
            	    	    // InternalPanoptesX.g:1274:8: ruleEString
            	    	    {

            	    	    								if (current==null) {
            	    	    									current = createModelElement(grammarAccess.getDeploymentRule());
            	    	    								}
            	    	    							

            	    	    								newCompositeNode(grammarAccess.getDeploymentAccess().getInputsDeploymentIOCrossReference_3_1_2_1_0());
            	    	    							
            	    	    pushFollow(FOLLOW_24);
            	    	    ruleEString();

            	    	    state._fsp--;


            	    	    								afterParserOrEnumRuleCall();
            	    	    							

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop17;
            	        }
            	    } while (true);


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalPanoptesX.g:1291:4: ( (lv_algorithmexecutions_9_0= ruleAlgorithmExecution ) )
            	    {
            	    // InternalPanoptesX.g:1291:4: ( (lv_algorithmexecutions_9_0= ruleAlgorithmExecution ) )
            	    // InternalPanoptesX.g:1292:5: (lv_algorithmexecutions_9_0= ruleAlgorithmExecution )
            	    {
            	    // InternalPanoptesX.g:1292:5: (lv_algorithmexecutions_9_0= ruleAlgorithmExecution )
            	    // InternalPanoptesX.g:1293:6: lv_algorithmexecutions_9_0= ruleAlgorithmExecution
            	    {

            	    						newCompositeNode(grammarAccess.getDeploymentAccess().getAlgorithmexecutionsAlgorithmExecutionParserRuleCall_3_2_0());
            	    					
            	    pushFollow(FOLLOW_23);
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
            	    // InternalPanoptesX.g:1311:4: ( (lv_actionExecutions_10_0= ruleActionExecution ) )
            	    {
            	    // InternalPanoptesX.g:1311:4: ( (lv_actionExecutions_10_0= ruleActionExecution ) )
            	    // InternalPanoptesX.g:1312:5: (lv_actionExecutions_10_0= ruleActionExecution )
            	    {
            	    // InternalPanoptesX.g:1312:5: (lv_actionExecutions_10_0= ruleActionExecution )
            	    // InternalPanoptesX.g:1313:6: lv_actionExecutions_10_0= ruleActionExecution
            	    {

            	    						newCompositeNode(grammarAccess.getDeploymentAccess().getActionExecutionsActionExecutionParserRuleCall_3_3_0());
            	    					
            	    pushFollow(FOLLOW_23);
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
            	    // InternalPanoptesX.g:1331:4: ( (lv_triggerGroups_11_0= ruleTriggerGroup ) )
            	    {
            	    // InternalPanoptesX.g:1331:4: ( (lv_triggerGroups_11_0= ruleTriggerGroup ) )
            	    // InternalPanoptesX.g:1332:5: (lv_triggerGroups_11_0= ruleTriggerGroup )
            	    {
            	    // InternalPanoptesX.g:1332:5: (lv_triggerGroups_11_0= ruleTriggerGroup )
            	    // InternalPanoptesX.g:1333:6: lv_triggerGroups_11_0= ruleTriggerGroup
            	    {

            	    						newCompositeNode(grammarAccess.getDeploymentAccess().getTriggerGroupsTriggerGroupParserRuleCall_3_4_0());
            	    					
            	    pushFollow(FOLLOW_23);
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
            	    break loop18;
                }
            } while (true);

            otherlv_12=(Token)match(input,17,FOLLOW_2); 

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
    // InternalPanoptesX.g:1359:1: entryRuleAlgorithm returns [EObject current=null] : iv_ruleAlgorithm= ruleAlgorithm EOF ;
    public final EObject entryRuleAlgorithm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlgorithm = null;


        try {
            // InternalPanoptesX.g:1359:50: (iv_ruleAlgorithm= ruleAlgorithm EOF )
            // InternalPanoptesX.g:1360:2: iv_ruleAlgorithm= ruleAlgorithm EOF
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
    // InternalPanoptesX.g:1366:1: ruleAlgorithm returns [EObject current=null] : (this_BaseAlgorithm_0= ruleBaseAlgorithm | this_HigherOrderAlgorithm_1= ruleHigherOrderAlgorithm ) ;
    public final EObject ruleAlgorithm() throws RecognitionException {
        EObject current = null;

        EObject this_BaseAlgorithm_0 = null;

        EObject this_HigherOrderAlgorithm_1 = null;



        	enterRule();

        try {
            // InternalPanoptesX.g:1372:2: ( (this_BaseAlgorithm_0= ruleBaseAlgorithm | this_HigherOrderAlgorithm_1= ruleHigherOrderAlgorithm ) )
            // InternalPanoptesX.g:1373:2: (this_BaseAlgorithm_0= ruleBaseAlgorithm | this_HigherOrderAlgorithm_1= ruleHigherOrderAlgorithm )
            {
            // InternalPanoptesX.g:1373:2: (this_BaseAlgorithm_0= ruleBaseAlgorithm | this_HigherOrderAlgorithm_1= ruleHigherOrderAlgorithm )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==31) ) {
                alt19=1;
            }
            else if ( (LA19_0==39) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalPanoptesX.g:1374:3: this_BaseAlgorithm_0= ruleBaseAlgorithm
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
                    // InternalPanoptesX.g:1383:3: this_HigherOrderAlgorithm_1= ruleHigherOrderAlgorithm
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
    // InternalPanoptesX.g:1395:1: entryRuleBaseAlgorithm returns [EObject current=null] : iv_ruleBaseAlgorithm= ruleBaseAlgorithm EOF ;
    public final EObject entryRuleBaseAlgorithm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaseAlgorithm = null;


        try {
            // InternalPanoptesX.g:1395:54: (iv_ruleBaseAlgorithm= ruleBaseAlgorithm EOF )
            // InternalPanoptesX.g:1396:2: iv_ruleBaseAlgorithm= ruleBaseAlgorithm EOF
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
    // InternalPanoptesX.g:1402:1: ruleBaseAlgorithm returns [EObject current=null] : (otherlv_0= 'BaseAlgorithm' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'codebase' ( (lv_codebase_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'runtime' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'severity' otherlv_9= 'levels' ( (lv_driftLevels_10_0= ruleEIntegerObject ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'accepts' ( (lv_strict_12_0= 'only' ) )? ( (lv_supportedTypes_13_0= rulestatisticalVariableType ) ) (otherlv_14= ',' ( (lv_supportedTypes_15_0= rulestatisticalVariableType ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'parameters' ( (lv_additionalParameters_17_0= ruleParameter ) ) (otherlv_18= ',' ( (lv_additionalParameters_19_0= ruleParameter ) ) )* ) ) ) ) )+ {...}?) ) ) otherlv_20= '}' ) ;
    public final EObject ruleBaseAlgorithm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token lv_strict_12_0=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_codebase_5_0 = null;

        AntlrDatatypeRuleToken lv_driftLevels_10_0 = null;

        Enumerator lv_supportedTypes_13_0 = null;

        Enumerator lv_supportedTypes_15_0 = null;

        EObject lv_additionalParameters_17_0 = null;

        EObject lv_additionalParameters_19_0 = null;



        	enterRule();

        try {
            // InternalPanoptesX.g:1408:2: ( (otherlv_0= 'BaseAlgorithm' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'codebase' ( (lv_codebase_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'runtime' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'severity' otherlv_9= 'levels' ( (lv_driftLevels_10_0= ruleEIntegerObject ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'accepts' ( (lv_strict_12_0= 'only' ) )? ( (lv_supportedTypes_13_0= rulestatisticalVariableType ) ) (otherlv_14= ',' ( (lv_supportedTypes_15_0= rulestatisticalVariableType ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'parameters' ( (lv_additionalParameters_17_0= ruleParameter ) ) (otherlv_18= ',' ( (lv_additionalParameters_19_0= ruleParameter ) ) )* ) ) ) ) )+ {...}?) ) ) otherlv_20= '}' ) )
            // InternalPanoptesX.g:1409:2: (otherlv_0= 'BaseAlgorithm' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'codebase' ( (lv_codebase_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'runtime' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'severity' otherlv_9= 'levels' ( (lv_driftLevels_10_0= ruleEIntegerObject ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'accepts' ( (lv_strict_12_0= 'only' ) )? ( (lv_supportedTypes_13_0= rulestatisticalVariableType ) ) (otherlv_14= ',' ( (lv_supportedTypes_15_0= rulestatisticalVariableType ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'parameters' ( (lv_additionalParameters_17_0= ruleParameter ) ) (otherlv_18= ',' ( (lv_additionalParameters_19_0= ruleParameter ) ) )* ) ) ) ) )+ {...}?) ) ) otherlv_20= '}' )
            {
            // InternalPanoptesX.g:1409:2: (otherlv_0= 'BaseAlgorithm' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'codebase' ( (lv_codebase_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'runtime' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'severity' otherlv_9= 'levels' ( (lv_driftLevels_10_0= ruleEIntegerObject ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'accepts' ( (lv_strict_12_0= 'only' ) )? ( (lv_supportedTypes_13_0= rulestatisticalVariableType ) ) (otherlv_14= ',' ( (lv_supportedTypes_15_0= rulestatisticalVariableType ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'parameters' ( (lv_additionalParameters_17_0= ruleParameter ) ) (otherlv_18= ',' ( (lv_additionalParameters_19_0= ruleParameter ) ) )* ) ) ) ) )+ {...}?) ) ) otherlv_20= '}' )
            // InternalPanoptesX.g:1410:3: otherlv_0= 'BaseAlgorithm' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'codebase' ( (lv_codebase_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'runtime' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'severity' otherlv_9= 'levels' ( (lv_driftLevels_10_0= ruleEIntegerObject ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'accepts' ( (lv_strict_12_0= 'only' ) )? ( (lv_supportedTypes_13_0= rulestatisticalVariableType ) ) (otherlv_14= ',' ( (lv_supportedTypes_15_0= rulestatisticalVariableType ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'parameters' ( (lv_additionalParameters_17_0= ruleParameter ) ) (otherlv_18= ',' ( (lv_additionalParameters_19_0= ruleParameter ) ) )* ) ) ) ) )+ {...}?) ) ) otherlv_20= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getBaseAlgorithmAccess().getBaseAlgorithmKeyword_0());
            		
            // InternalPanoptesX.g:1414:3: ( (lv_name_1_0= ruleEString ) )
            // InternalPanoptesX.g:1415:4: (lv_name_1_0= ruleEString )
            {
            // InternalPanoptesX.g:1415:4: (lv_name_1_0= ruleEString )
            // InternalPanoptesX.g:1416:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBaseAlgorithmAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBaseAlgorithmRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.lowcomote.panoptes.PanoptesX.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getBaseAlgorithmAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalPanoptesX.g:1437:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'codebase' ( (lv_codebase_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'runtime' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'severity' otherlv_9= 'levels' ( (lv_driftLevels_10_0= ruleEIntegerObject ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'accepts' ( (lv_strict_12_0= 'only' ) )? ( (lv_supportedTypes_13_0= rulestatisticalVariableType ) ) (otherlv_14= ',' ( (lv_supportedTypes_15_0= rulestatisticalVariableType ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'parameters' ( (lv_additionalParameters_17_0= ruleParameter ) ) (otherlv_18= ',' ( (lv_additionalParameters_19_0= ruleParameter ) ) )* ) ) ) ) )+ {...}?) ) )
            // InternalPanoptesX.g:1438:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'codebase' ( (lv_codebase_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'runtime' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'severity' otherlv_9= 'levels' ( (lv_driftLevels_10_0= ruleEIntegerObject ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'accepts' ( (lv_strict_12_0= 'only' ) )? ( (lv_supportedTypes_13_0= rulestatisticalVariableType ) ) (otherlv_14= ',' ( (lv_supportedTypes_15_0= rulestatisticalVariableType ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'parameters' ( (lv_additionalParameters_17_0= ruleParameter ) ) (otherlv_18= ',' ( (lv_additionalParameters_19_0= ruleParameter ) ) )* ) ) ) ) )+ {...}?) )
            {
            // InternalPanoptesX.g:1438:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'codebase' ( (lv_codebase_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'runtime' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'severity' otherlv_9= 'levels' ( (lv_driftLevels_10_0= ruleEIntegerObject ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'accepts' ( (lv_strict_12_0= 'only' ) )? ( (lv_supportedTypes_13_0= rulestatisticalVariableType ) ) (otherlv_14= ',' ( (lv_supportedTypes_15_0= rulestatisticalVariableType ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'parameters' ( (lv_additionalParameters_17_0= ruleParameter ) ) (otherlv_18= ',' ( (lv_additionalParameters_19_0= ruleParameter ) ) )* ) ) ) ) )+ {...}?) )
            // InternalPanoptesX.g:1439:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'codebase' ( (lv_codebase_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'runtime' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'severity' otherlv_9= 'levels' ( (lv_driftLevels_10_0= ruleEIntegerObject ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'accepts' ( (lv_strict_12_0= 'only' ) )? ( (lv_supportedTypes_13_0= rulestatisticalVariableType ) ) (otherlv_14= ',' ( (lv_supportedTypes_15_0= rulestatisticalVariableType ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'parameters' ( (lv_additionalParameters_17_0= ruleParameter ) ) (otherlv_18= ',' ( (lv_additionalParameters_19_0= ruleParameter ) ) )* ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getBaseAlgorithmAccess().getUnorderedGroup_3());
            				
            // InternalPanoptesX.g:1442:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'codebase' ( (lv_codebase_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'runtime' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'severity' otherlv_9= 'levels' ( (lv_driftLevels_10_0= ruleEIntegerObject ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'accepts' ( (lv_strict_12_0= 'only' ) )? ( (lv_supportedTypes_13_0= rulestatisticalVariableType ) ) (otherlv_14= ',' ( (lv_supportedTypes_15_0= rulestatisticalVariableType ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'parameters' ( (lv_additionalParameters_17_0= ruleParameter ) ) (otherlv_18= ',' ( (lv_additionalParameters_19_0= ruleParameter ) ) )* ) ) ) ) )+ {...}?)
            // InternalPanoptesX.g:1443:6: ( ({...}? => ( ({...}? => (otherlv_4= 'codebase' ( (lv_codebase_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'runtime' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'severity' otherlv_9= 'levels' ( (lv_driftLevels_10_0= ruleEIntegerObject ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'accepts' ( (lv_strict_12_0= 'only' ) )? ( (lv_supportedTypes_13_0= rulestatisticalVariableType ) ) (otherlv_14= ',' ( (lv_supportedTypes_15_0= rulestatisticalVariableType ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'parameters' ( (lv_additionalParameters_17_0= ruleParameter ) ) (otherlv_18= ',' ( (lv_additionalParameters_19_0= ruleParameter ) ) )* ) ) ) ) )+ {...}?
            {
            // InternalPanoptesX.g:1443:6: ( ({...}? => ( ({...}? => (otherlv_4= 'codebase' ( (lv_codebase_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'runtime' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'severity' otherlv_9= 'levels' ( (lv_driftLevels_10_0= ruleEIntegerObject ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'accepts' ( (lv_strict_12_0= 'only' ) )? ( (lv_supportedTypes_13_0= rulestatisticalVariableType ) ) (otherlv_14= ',' ( (lv_supportedTypes_15_0= rulestatisticalVariableType ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'parameters' ( (lv_additionalParameters_17_0= ruleParameter ) ) (otherlv_18= ',' ( (lv_additionalParameters_19_0= ruleParameter ) ) )* ) ) ) ) )+
            int cnt23=0;
            loop23:
            do {
                int alt23=6;
                int LA23_0 = input.LA(1);

                if ( LA23_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getBaseAlgorithmAccess().getUnorderedGroup_3(), 0) ) {
                    alt23=1;
                }
                else if ( LA23_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getBaseAlgorithmAccess().getUnorderedGroup_3(), 1) ) {
                    alt23=2;
                }
                else if ( LA23_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getBaseAlgorithmAccess().getUnorderedGroup_3(), 2) ) {
                    alt23=3;
                }
                else if ( LA23_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getBaseAlgorithmAccess().getUnorderedGroup_3(), 3) ) {
                    alt23=4;
                }
                else if ( LA23_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getBaseAlgorithmAccess().getUnorderedGroup_3(), 4) ) {
                    alt23=5;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalPanoptesX.g:1444:4: ({...}? => ( ({...}? => (otherlv_4= 'codebase' ( (lv_codebase_5_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalPanoptesX.g:1444:4: ({...}? => ( ({...}? => (otherlv_4= 'codebase' ( (lv_codebase_5_0= ruleEString ) ) ) ) ) )
            	    // InternalPanoptesX.g:1445:5: {...}? => ( ({...}? => (otherlv_4= 'codebase' ( (lv_codebase_5_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBaseAlgorithmAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleBaseAlgorithm", "getUnorderedGroupHelper().canSelect(grammarAccess.getBaseAlgorithmAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalPanoptesX.g:1445:110: ( ({...}? => (otherlv_4= 'codebase' ( (lv_codebase_5_0= ruleEString ) ) ) ) )
            	    // InternalPanoptesX.g:1446:6: ({...}? => (otherlv_4= 'codebase' ( (lv_codebase_5_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getBaseAlgorithmAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalPanoptesX.g:1449:9: ({...}? => (otherlv_4= 'codebase' ( (lv_codebase_5_0= ruleEString ) ) ) )
            	    // InternalPanoptesX.g:1449:10: {...}? => (otherlv_4= 'codebase' ( (lv_codebase_5_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBaseAlgorithm", "true");
            	    }
            	    // InternalPanoptesX.g:1449:19: (otherlv_4= 'codebase' ( (lv_codebase_5_0= ruleEString ) ) )
            	    // InternalPanoptesX.g:1449:20: otherlv_4= 'codebase' ( (lv_codebase_5_0= ruleEString ) )
            	    {
            	    otherlv_4=(Token)match(input,32,FOLLOW_4); 

            	    									newLeafNode(otherlv_4, grammarAccess.getBaseAlgorithmAccess().getCodebaseKeyword_3_0_0());
            	    								
            	    // InternalPanoptesX.g:1453:9: ( (lv_codebase_5_0= ruleEString ) )
            	    // InternalPanoptesX.g:1454:10: (lv_codebase_5_0= ruleEString )
            	    {
            	    // InternalPanoptesX.g:1454:10: (lv_codebase_5_0= ruleEString )
            	    // InternalPanoptesX.g:1455:11: lv_codebase_5_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getBaseAlgorithmAccess().getCodebaseEStringParserRuleCall_3_0_1_0());
            	    										
            	    pushFollow(FOLLOW_26);
            	    lv_codebase_5_0=ruleEString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getBaseAlgorithmRule());
            	    											}
            	    											set(
            	    												current,
            	    												"codebase",
            	    												lv_codebase_5_0,
            	    												"org.lowcomote.panoptes.PanoptesX.EString");
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
            	case 2 :
            	    // InternalPanoptesX.g:1478:4: ({...}? => ( ({...}? => (otherlv_6= 'runtime' ( ( ruleEString ) ) ) ) ) )
            	    {
            	    // InternalPanoptesX.g:1478:4: ({...}? => ( ({...}? => (otherlv_6= 'runtime' ( ( ruleEString ) ) ) ) ) )
            	    // InternalPanoptesX.g:1479:5: {...}? => ( ({...}? => (otherlv_6= 'runtime' ( ( ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBaseAlgorithmAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleBaseAlgorithm", "getUnorderedGroupHelper().canSelect(grammarAccess.getBaseAlgorithmAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalPanoptesX.g:1479:110: ( ({...}? => (otherlv_6= 'runtime' ( ( ruleEString ) ) ) ) )
            	    // InternalPanoptesX.g:1480:6: ({...}? => (otherlv_6= 'runtime' ( ( ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getBaseAlgorithmAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalPanoptesX.g:1483:9: ({...}? => (otherlv_6= 'runtime' ( ( ruleEString ) ) ) )
            	    // InternalPanoptesX.g:1483:10: {...}? => (otherlv_6= 'runtime' ( ( ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBaseAlgorithm", "true");
            	    }
            	    // InternalPanoptesX.g:1483:19: (otherlv_6= 'runtime' ( ( ruleEString ) ) )
            	    // InternalPanoptesX.g:1483:20: otherlv_6= 'runtime' ( ( ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,33,FOLLOW_4); 

            	    									newLeafNode(otherlv_6, grammarAccess.getBaseAlgorithmAccess().getRuntimeKeyword_3_1_0());
            	    								
            	    // InternalPanoptesX.g:1487:9: ( ( ruleEString ) )
            	    // InternalPanoptesX.g:1488:10: ( ruleEString )
            	    {
            	    // InternalPanoptesX.g:1488:10: ( ruleEString )
            	    // InternalPanoptesX.g:1489:11: ruleEString
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getBaseAlgorithmRule());
            	    											}
            	    										

            	    											newCompositeNode(grammarAccess.getBaseAlgorithmAccess().getRuntimeBaseAlgorithmRuntimeCrossReference_3_1_1_0());
            	    										
            	    pushFollow(FOLLOW_26);
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
            	    // InternalPanoptesX.g:1509:4: ({...}? => ( ({...}? => (otherlv_8= 'severity' otherlv_9= 'levels' ( (lv_driftLevels_10_0= ruleEIntegerObject ) ) ) ) ) )
            	    {
            	    // InternalPanoptesX.g:1509:4: ({...}? => ( ({...}? => (otherlv_8= 'severity' otherlv_9= 'levels' ( (lv_driftLevels_10_0= ruleEIntegerObject ) ) ) ) ) )
            	    // InternalPanoptesX.g:1510:5: {...}? => ( ({...}? => (otherlv_8= 'severity' otherlv_9= 'levels' ( (lv_driftLevels_10_0= ruleEIntegerObject ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBaseAlgorithmAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleBaseAlgorithm", "getUnorderedGroupHelper().canSelect(grammarAccess.getBaseAlgorithmAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalPanoptesX.g:1510:110: ( ({...}? => (otherlv_8= 'severity' otherlv_9= 'levels' ( (lv_driftLevels_10_0= ruleEIntegerObject ) ) ) ) )
            	    // InternalPanoptesX.g:1511:6: ({...}? => (otherlv_8= 'severity' otherlv_9= 'levels' ( (lv_driftLevels_10_0= ruleEIntegerObject ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getBaseAlgorithmAccess().getUnorderedGroup_3(), 2);
            	    					
            	    // InternalPanoptesX.g:1514:9: ({...}? => (otherlv_8= 'severity' otherlv_9= 'levels' ( (lv_driftLevels_10_0= ruleEIntegerObject ) ) ) )
            	    // InternalPanoptesX.g:1514:10: {...}? => (otherlv_8= 'severity' otherlv_9= 'levels' ( (lv_driftLevels_10_0= ruleEIntegerObject ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBaseAlgorithm", "true");
            	    }
            	    // InternalPanoptesX.g:1514:19: (otherlv_8= 'severity' otherlv_9= 'levels' ( (lv_driftLevels_10_0= ruleEIntegerObject ) ) )
            	    // InternalPanoptesX.g:1514:20: otherlv_8= 'severity' otherlv_9= 'levels' ( (lv_driftLevels_10_0= ruleEIntegerObject ) )
            	    {
            	    otherlv_8=(Token)match(input,34,FOLLOW_27); 

            	    									newLeafNode(otherlv_8, grammarAccess.getBaseAlgorithmAccess().getSeverityKeyword_3_2_0());
            	    								
            	    otherlv_9=(Token)match(input,35,FOLLOW_28); 

            	    									newLeafNode(otherlv_9, grammarAccess.getBaseAlgorithmAccess().getLevelsKeyword_3_2_1());
            	    								
            	    // InternalPanoptesX.g:1522:9: ( (lv_driftLevels_10_0= ruleEIntegerObject ) )
            	    // InternalPanoptesX.g:1523:10: (lv_driftLevels_10_0= ruleEIntegerObject )
            	    {
            	    // InternalPanoptesX.g:1523:10: (lv_driftLevels_10_0= ruleEIntegerObject )
            	    // InternalPanoptesX.g:1524:11: lv_driftLevels_10_0= ruleEIntegerObject
            	    {

            	    											newCompositeNode(grammarAccess.getBaseAlgorithmAccess().getDriftLevelsEIntegerObjectParserRuleCall_3_2_2_0());
            	    										
            	    pushFollow(FOLLOW_26);
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
            	    // InternalPanoptesX.g:1547:4: ({...}? => ( ({...}? => (otherlv_11= 'accepts' ( (lv_strict_12_0= 'only' ) )? ( (lv_supportedTypes_13_0= rulestatisticalVariableType ) ) (otherlv_14= ',' ( (lv_supportedTypes_15_0= rulestatisticalVariableType ) ) )* ) ) ) )
            	    {
            	    // InternalPanoptesX.g:1547:4: ({...}? => ( ({...}? => (otherlv_11= 'accepts' ( (lv_strict_12_0= 'only' ) )? ( (lv_supportedTypes_13_0= rulestatisticalVariableType ) ) (otherlv_14= ',' ( (lv_supportedTypes_15_0= rulestatisticalVariableType ) ) )* ) ) ) )
            	    // InternalPanoptesX.g:1548:5: {...}? => ( ({...}? => (otherlv_11= 'accepts' ( (lv_strict_12_0= 'only' ) )? ( (lv_supportedTypes_13_0= rulestatisticalVariableType ) ) (otherlv_14= ',' ( (lv_supportedTypes_15_0= rulestatisticalVariableType ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBaseAlgorithmAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleBaseAlgorithm", "getUnorderedGroupHelper().canSelect(grammarAccess.getBaseAlgorithmAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // InternalPanoptesX.g:1548:110: ( ({...}? => (otherlv_11= 'accepts' ( (lv_strict_12_0= 'only' ) )? ( (lv_supportedTypes_13_0= rulestatisticalVariableType ) ) (otherlv_14= ',' ( (lv_supportedTypes_15_0= rulestatisticalVariableType ) ) )* ) ) )
            	    // InternalPanoptesX.g:1549:6: ({...}? => (otherlv_11= 'accepts' ( (lv_strict_12_0= 'only' ) )? ( (lv_supportedTypes_13_0= rulestatisticalVariableType ) ) (otherlv_14= ',' ( (lv_supportedTypes_15_0= rulestatisticalVariableType ) ) )* ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getBaseAlgorithmAccess().getUnorderedGroup_3(), 3);
            	    					
            	    // InternalPanoptesX.g:1552:9: ({...}? => (otherlv_11= 'accepts' ( (lv_strict_12_0= 'only' ) )? ( (lv_supportedTypes_13_0= rulestatisticalVariableType ) ) (otherlv_14= ',' ( (lv_supportedTypes_15_0= rulestatisticalVariableType ) ) )* ) )
            	    // InternalPanoptesX.g:1552:10: {...}? => (otherlv_11= 'accepts' ( (lv_strict_12_0= 'only' ) )? ( (lv_supportedTypes_13_0= rulestatisticalVariableType ) ) (otherlv_14= ',' ( (lv_supportedTypes_15_0= rulestatisticalVariableType ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBaseAlgorithm", "true");
            	    }
            	    // InternalPanoptesX.g:1552:19: (otherlv_11= 'accepts' ( (lv_strict_12_0= 'only' ) )? ( (lv_supportedTypes_13_0= rulestatisticalVariableType ) ) (otherlv_14= ',' ( (lv_supportedTypes_15_0= rulestatisticalVariableType ) ) )* )
            	    // InternalPanoptesX.g:1552:20: otherlv_11= 'accepts' ( (lv_strict_12_0= 'only' ) )? ( (lv_supportedTypes_13_0= rulestatisticalVariableType ) ) (otherlv_14= ',' ( (lv_supportedTypes_15_0= rulestatisticalVariableType ) ) )*
            	    {
            	    otherlv_11=(Token)match(input,36,FOLLOW_29); 

            	    									newLeafNode(otherlv_11, grammarAccess.getBaseAlgorithmAccess().getAcceptsKeyword_3_3_0());
            	    								
            	    // InternalPanoptesX.g:1556:9: ( (lv_strict_12_0= 'only' ) )?
            	    int alt20=2;
            	    int LA20_0 = input.LA(1);

            	    if ( (LA20_0==37) ) {
            	        alt20=1;
            	    }
            	    switch (alt20) {
            	        case 1 :
            	            // InternalPanoptesX.g:1557:10: (lv_strict_12_0= 'only' )
            	            {
            	            // InternalPanoptesX.g:1557:10: (lv_strict_12_0= 'only' )
            	            // InternalPanoptesX.g:1558:11: lv_strict_12_0= 'only'
            	            {
            	            lv_strict_12_0=(Token)match(input,37,FOLLOW_15); 

            	            											newLeafNode(lv_strict_12_0, grammarAccess.getBaseAlgorithmAccess().getStrictOnlyKeyword_3_3_1_0());
            	            										

            	            											if (current==null) {
            	            												current = createModelElement(grammarAccess.getBaseAlgorithmRule());
            	            											}
            	            											setWithLastConsumed(current, "strict", lv_strict_12_0 != null, "only");
            	            										

            	            }


            	            }
            	            break;

            	    }

            	    // InternalPanoptesX.g:1570:9: ( (lv_supportedTypes_13_0= rulestatisticalVariableType ) )
            	    // InternalPanoptesX.g:1571:10: (lv_supportedTypes_13_0= rulestatisticalVariableType )
            	    {
            	    // InternalPanoptesX.g:1571:10: (lv_supportedTypes_13_0= rulestatisticalVariableType )
            	    // InternalPanoptesX.g:1572:11: lv_supportedTypes_13_0= rulestatisticalVariableType
            	    {

            	    											newCompositeNode(grammarAccess.getBaseAlgorithmAccess().getSupportedTypesStatisticalVariableTypeEnumRuleCall_3_3_2_0());
            	    										
            	    pushFollow(FOLLOW_30);
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

            	    // InternalPanoptesX.g:1589:9: (otherlv_14= ',' ( (lv_supportedTypes_15_0= rulestatisticalVariableType ) ) )*
            	    loop21:
            	    do {
            	        int alt21=2;
            	        int LA21_0 = input.LA(1);

            	        if ( (LA21_0==15) ) {
            	            alt21=1;
            	        }


            	        switch (alt21) {
            	    	case 1 :
            	    	    // InternalPanoptesX.g:1590:10: otherlv_14= ',' ( (lv_supportedTypes_15_0= rulestatisticalVariableType ) )
            	    	    {
            	    	    otherlv_14=(Token)match(input,15,FOLLOW_15); 

            	    	    										newLeafNode(otherlv_14, grammarAccess.getBaseAlgorithmAccess().getCommaKeyword_3_3_3_0());
            	    	    									
            	    	    // InternalPanoptesX.g:1594:10: ( (lv_supportedTypes_15_0= rulestatisticalVariableType ) )
            	    	    // InternalPanoptesX.g:1595:11: (lv_supportedTypes_15_0= rulestatisticalVariableType )
            	    	    {
            	    	    // InternalPanoptesX.g:1595:11: (lv_supportedTypes_15_0= rulestatisticalVariableType )
            	    	    // InternalPanoptesX.g:1596:12: lv_supportedTypes_15_0= rulestatisticalVariableType
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getBaseAlgorithmAccess().getSupportedTypesStatisticalVariableTypeEnumRuleCall_3_3_3_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_30);
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
            	    	    break loop21;
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
            	    // InternalPanoptesX.g:1620:4: ({...}? => ( ({...}? => (otherlv_16= 'parameters' ( (lv_additionalParameters_17_0= ruleParameter ) ) (otherlv_18= ',' ( (lv_additionalParameters_19_0= ruleParameter ) ) )* ) ) ) )
            	    {
            	    // InternalPanoptesX.g:1620:4: ({...}? => ( ({...}? => (otherlv_16= 'parameters' ( (lv_additionalParameters_17_0= ruleParameter ) ) (otherlv_18= ',' ( (lv_additionalParameters_19_0= ruleParameter ) ) )* ) ) ) )
            	    // InternalPanoptesX.g:1621:5: {...}? => ( ({...}? => (otherlv_16= 'parameters' ( (lv_additionalParameters_17_0= ruleParameter ) ) (otherlv_18= ',' ( (lv_additionalParameters_19_0= ruleParameter ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBaseAlgorithmAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleBaseAlgorithm", "getUnorderedGroupHelper().canSelect(grammarAccess.getBaseAlgorithmAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // InternalPanoptesX.g:1621:110: ( ({...}? => (otherlv_16= 'parameters' ( (lv_additionalParameters_17_0= ruleParameter ) ) (otherlv_18= ',' ( (lv_additionalParameters_19_0= ruleParameter ) ) )* ) ) )
            	    // InternalPanoptesX.g:1622:6: ({...}? => (otherlv_16= 'parameters' ( (lv_additionalParameters_17_0= ruleParameter ) ) (otherlv_18= ',' ( (lv_additionalParameters_19_0= ruleParameter ) ) )* ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getBaseAlgorithmAccess().getUnorderedGroup_3(), 4);
            	    					
            	    // InternalPanoptesX.g:1625:9: ({...}? => (otherlv_16= 'parameters' ( (lv_additionalParameters_17_0= ruleParameter ) ) (otherlv_18= ',' ( (lv_additionalParameters_19_0= ruleParameter ) ) )* ) )
            	    // InternalPanoptesX.g:1625:10: {...}? => (otherlv_16= 'parameters' ( (lv_additionalParameters_17_0= ruleParameter ) ) (otherlv_18= ',' ( (lv_additionalParameters_19_0= ruleParameter ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBaseAlgorithm", "true");
            	    }
            	    // InternalPanoptesX.g:1625:19: (otherlv_16= 'parameters' ( (lv_additionalParameters_17_0= ruleParameter ) ) (otherlv_18= ',' ( (lv_additionalParameters_19_0= ruleParameter ) ) )* )
            	    // InternalPanoptesX.g:1625:20: otherlv_16= 'parameters' ( (lv_additionalParameters_17_0= ruleParameter ) ) (otherlv_18= ',' ( (lv_additionalParameters_19_0= ruleParameter ) ) )*
            	    {
            	    otherlv_16=(Token)match(input,38,FOLLOW_31); 

            	    									newLeafNode(otherlv_16, grammarAccess.getBaseAlgorithmAccess().getParametersKeyword_3_4_0());
            	    								
            	    // InternalPanoptesX.g:1629:9: ( (lv_additionalParameters_17_0= ruleParameter ) )
            	    // InternalPanoptesX.g:1630:10: (lv_additionalParameters_17_0= ruleParameter )
            	    {
            	    // InternalPanoptesX.g:1630:10: (lv_additionalParameters_17_0= ruleParameter )
            	    // InternalPanoptesX.g:1631:11: lv_additionalParameters_17_0= ruleParameter
            	    {

            	    											newCompositeNode(grammarAccess.getBaseAlgorithmAccess().getAdditionalParametersParameterParserRuleCall_3_4_1_0());
            	    										
            	    pushFollow(FOLLOW_30);
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

            	    // InternalPanoptesX.g:1648:9: (otherlv_18= ',' ( (lv_additionalParameters_19_0= ruleParameter ) ) )*
            	    loop22:
            	    do {
            	        int alt22=2;
            	        int LA22_0 = input.LA(1);

            	        if ( (LA22_0==15) ) {
            	            alt22=1;
            	        }


            	        switch (alt22) {
            	    	case 1 :
            	    	    // InternalPanoptesX.g:1649:10: otherlv_18= ',' ( (lv_additionalParameters_19_0= ruleParameter ) )
            	    	    {
            	    	    otherlv_18=(Token)match(input,15,FOLLOW_31); 

            	    	    										newLeafNode(otherlv_18, grammarAccess.getBaseAlgorithmAccess().getCommaKeyword_3_4_2_0());
            	    	    									
            	    	    // InternalPanoptesX.g:1653:10: ( (lv_additionalParameters_19_0= ruleParameter ) )
            	    	    // InternalPanoptesX.g:1654:11: (lv_additionalParameters_19_0= ruleParameter )
            	    	    {
            	    	    // InternalPanoptesX.g:1654:11: (lv_additionalParameters_19_0= ruleParameter )
            	    	    // InternalPanoptesX.g:1655:12: lv_additionalParameters_19_0= ruleParameter
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getBaseAlgorithmAccess().getAdditionalParametersParameterParserRuleCall_3_4_2_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_30);
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
            	    	    break loop22;
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
            	    if ( cnt23 >= 1 ) break loop23;
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getBaseAlgorithmAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "ruleBaseAlgorithm", "getUnorderedGroupHelper().canLeave(grammarAccess.getBaseAlgorithmAccess().getUnorderedGroup_3())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getBaseAlgorithmAccess().getUnorderedGroup_3());
            				

            }

            otherlv_20=(Token)match(input,17,FOLLOW_2); 

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
    // InternalPanoptesX.g:1695:1: entryRuleHigherOrderAlgorithm returns [EObject current=null] : iv_ruleHigherOrderAlgorithm= ruleHigherOrderAlgorithm EOF ;
    public final EObject entryRuleHigherOrderAlgorithm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHigherOrderAlgorithm = null;


        try {
            // InternalPanoptesX.g:1695:61: (iv_ruleHigherOrderAlgorithm= ruleHigherOrderAlgorithm EOF )
            // InternalPanoptesX.g:1696:2: iv_ruleHigherOrderAlgorithm= ruleHigherOrderAlgorithm EOF
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
    // InternalPanoptesX.g:1702:1: ruleHigherOrderAlgorithm returns [EObject current=null] : ( () otherlv_1= 'HigherOrderAlgorithm' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'codebase' ( (lv_codebase_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'runtime' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'severity' otherlv_10= 'levels' ( (lv_driftLevels_11_0= ruleEIntegerObject ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'parameters' ( (lv_additionalParameters_13_0= ruleParameter ) ) (otherlv_14= ',' ( (lv_additionalParameters_15_0= ruleParameter ) ) )* ) ) ) ) )+ {...}?) ) ) otherlv_16= '}' ) ;
    public final EObject ruleHigherOrderAlgorithm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_codebase_6_0 = null;

        AntlrDatatypeRuleToken lv_driftLevels_11_0 = null;

        EObject lv_additionalParameters_13_0 = null;

        EObject lv_additionalParameters_15_0 = null;



        	enterRule();

        try {
            // InternalPanoptesX.g:1708:2: ( ( () otherlv_1= 'HigherOrderAlgorithm' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'codebase' ( (lv_codebase_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'runtime' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'severity' otherlv_10= 'levels' ( (lv_driftLevels_11_0= ruleEIntegerObject ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'parameters' ( (lv_additionalParameters_13_0= ruleParameter ) ) (otherlv_14= ',' ( (lv_additionalParameters_15_0= ruleParameter ) ) )* ) ) ) ) )+ {...}?) ) ) otherlv_16= '}' ) )
            // InternalPanoptesX.g:1709:2: ( () otherlv_1= 'HigherOrderAlgorithm' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'codebase' ( (lv_codebase_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'runtime' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'severity' otherlv_10= 'levels' ( (lv_driftLevels_11_0= ruleEIntegerObject ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'parameters' ( (lv_additionalParameters_13_0= ruleParameter ) ) (otherlv_14= ',' ( (lv_additionalParameters_15_0= ruleParameter ) ) )* ) ) ) ) )+ {...}?) ) ) otherlv_16= '}' )
            {
            // InternalPanoptesX.g:1709:2: ( () otherlv_1= 'HigherOrderAlgorithm' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'codebase' ( (lv_codebase_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'runtime' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'severity' otherlv_10= 'levels' ( (lv_driftLevels_11_0= ruleEIntegerObject ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'parameters' ( (lv_additionalParameters_13_0= ruleParameter ) ) (otherlv_14= ',' ( (lv_additionalParameters_15_0= ruleParameter ) ) )* ) ) ) ) )+ {...}?) ) ) otherlv_16= '}' )
            // InternalPanoptesX.g:1710:3: () otherlv_1= 'HigherOrderAlgorithm' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'codebase' ( (lv_codebase_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'runtime' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'severity' otherlv_10= 'levels' ( (lv_driftLevels_11_0= ruleEIntegerObject ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'parameters' ( (lv_additionalParameters_13_0= ruleParameter ) ) (otherlv_14= ',' ( (lv_additionalParameters_15_0= ruleParameter ) ) )* ) ) ) ) )+ {...}?) ) ) otherlv_16= '}'
            {
            // InternalPanoptesX.g:1710:3: ()
            // InternalPanoptesX.g:1711:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getHigherOrderAlgorithmAccess().getHigherOrderAlgorithmAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,39,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getHigherOrderAlgorithmAccess().getHigherOrderAlgorithmKeyword_1());
            		
            // InternalPanoptesX.g:1721:3: ( (lv_name_2_0= ruleEString ) )
            // InternalPanoptesX.g:1722:4: (lv_name_2_0= ruleEString )
            {
            // InternalPanoptesX.g:1722:4: (lv_name_2_0= ruleEString )
            // InternalPanoptesX.g:1723:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getHigherOrderAlgorithmAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHigherOrderAlgorithmRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.lowcomote.panoptes.PanoptesX.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_32); 

            			newLeafNode(otherlv_3, grammarAccess.getHigherOrderAlgorithmAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalPanoptesX.g:1744:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'codebase' ( (lv_codebase_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'runtime' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'severity' otherlv_10= 'levels' ( (lv_driftLevels_11_0= ruleEIntegerObject ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'parameters' ( (lv_additionalParameters_13_0= ruleParameter ) ) (otherlv_14= ',' ( (lv_additionalParameters_15_0= ruleParameter ) ) )* ) ) ) ) )+ {...}?) ) )
            // InternalPanoptesX.g:1745:4: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'codebase' ( (lv_codebase_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'runtime' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'severity' otherlv_10= 'levels' ( (lv_driftLevels_11_0= ruleEIntegerObject ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'parameters' ( (lv_additionalParameters_13_0= ruleParameter ) ) (otherlv_14= ',' ( (lv_additionalParameters_15_0= ruleParameter ) ) )* ) ) ) ) )+ {...}?) )
            {
            // InternalPanoptesX.g:1745:4: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'codebase' ( (lv_codebase_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'runtime' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'severity' otherlv_10= 'levels' ( (lv_driftLevels_11_0= ruleEIntegerObject ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'parameters' ( (lv_additionalParameters_13_0= ruleParameter ) ) (otherlv_14= ',' ( (lv_additionalParameters_15_0= ruleParameter ) ) )* ) ) ) ) )+ {...}?) )
            // InternalPanoptesX.g:1746:5: ( ( ({...}? => ( ({...}? => (otherlv_5= 'codebase' ( (lv_codebase_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'runtime' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'severity' otherlv_10= 'levels' ( (lv_driftLevels_11_0= ruleEIntegerObject ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'parameters' ( (lv_additionalParameters_13_0= ruleParameter ) ) (otherlv_14= ',' ( (lv_additionalParameters_15_0= ruleParameter ) ) )* ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getHigherOrderAlgorithmAccess().getUnorderedGroup_4());
            				
            // InternalPanoptesX.g:1749:5: ( ( ({...}? => ( ({...}? => (otherlv_5= 'codebase' ( (lv_codebase_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'runtime' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'severity' otherlv_10= 'levels' ( (lv_driftLevels_11_0= ruleEIntegerObject ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'parameters' ( (lv_additionalParameters_13_0= ruleParameter ) ) (otherlv_14= ',' ( (lv_additionalParameters_15_0= ruleParameter ) ) )* ) ) ) ) )+ {...}?)
            // InternalPanoptesX.g:1750:6: ( ({...}? => ( ({...}? => (otherlv_5= 'codebase' ( (lv_codebase_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'runtime' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'severity' otherlv_10= 'levels' ( (lv_driftLevels_11_0= ruleEIntegerObject ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'parameters' ( (lv_additionalParameters_13_0= ruleParameter ) ) (otherlv_14= ',' ( (lv_additionalParameters_15_0= ruleParameter ) ) )* ) ) ) ) )+ {...}?
            {
            // InternalPanoptesX.g:1750:6: ( ({...}? => ( ({...}? => (otherlv_5= 'codebase' ( (lv_codebase_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'runtime' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'severity' otherlv_10= 'levels' ( (lv_driftLevels_11_0= ruleEIntegerObject ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'parameters' ( (lv_additionalParameters_13_0= ruleParameter ) ) (otherlv_14= ',' ( (lv_additionalParameters_15_0= ruleParameter ) ) )* ) ) ) ) )+
            int cnt25=0;
            loop25:
            do {
                int alt25=5;
                int LA25_0 = input.LA(1);

                if ( LA25_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getHigherOrderAlgorithmAccess().getUnorderedGroup_4(), 0) ) {
                    alt25=1;
                }
                else if ( LA25_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getHigherOrderAlgorithmAccess().getUnorderedGroup_4(), 1) ) {
                    alt25=2;
                }
                else if ( LA25_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getHigherOrderAlgorithmAccess().getUnorderedGroup_4(), 2) ) {
                    alt25=3;
                }
                else if ( LA25_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getHigherOrderAlgorithmAccess().getUnorderedGroup_4(), 3) ) {
                    alt25=4;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalPanoptesX.g:1751:4: ({...}? => ( ({...}? => (otherlv_5= 'codebase' ( (lv_codebase_6_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalPanoptesX.g:1751:4: ({...}? => ( ({...}? => (otherlv_5= 'codebase' ( (lv_codebase_6_0= ruleEString ) ) ) ) ) )
            	    // InternalPanoptesX.g:1752:5: {...}? => ( ({...}? => (otherlv_5= 'codebase' ( (lv_codebase_6_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getHigherOrderAlgorithmAccess().getUnorderedGroup_4(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleHigherOrderAlgorithm", "getUnorderedGroupHelper().canSelect(grammarAccess.getHigherOrderAlgorithmAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // InternalPanoptesX.g:1752:117: ( ({...}? => (otherlv_5= 'codebase' ( (lv_codebase_6_0= ruleEString ) ) ) ) )
            	    // InternalPanoptesX.g:1753:6: ({...}? => (otherlv_5= 'codebase' ( (lv_codebase_6_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getHigherOrderAlgorithmAccess().getUnorderedGroup_4(), 0);
            	    					
            	    // InternalPanoptesX.g:1756:9: ({...}? => (otherlv_5= 'codebase' ( (lv_codebase_6_0= ruleEString ) ) ) )
            	    // InternalPanoptesX.g:1756:10: {...}? => (otherlv_5= 'codebase' ( (lv_codebase_6_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleHigherOrderAlgorithm", "true");
            	    }
            	    // InternalPanoptesX.g:1756:19: (otherlv_5= 'codebase' ( (lv_codebase_6_0= ruleEString ) ) )
            	    // InternalPanoptesX.g:1756:20: otherlv_5= 'codebase' ( (lv_codebase_6_0= ruleEString ) )
            	    {
            	    otherlv_5=(Token)match(input,32,FOLLOW_4); 

            	    									newLeafNode(otherlv_5, grammarAccess.getHigherOrderAlgorithmAccess().getCodebaseKeyword_4_0_0());
            	    								
            	    // InternalPanoptesX.g:1760:9: ( (lv_codebase_6_0= ruleEString ) )
            	    // InternalPanoptesX.g:1761:10: (lv_codebase_6_0= ruleEString )
            	    {
            	    // InternalPanoptesX.g:1761:10: (lv_codebase_6_0= ruleEString )
            	    // InternalPanoptesX.g:1762:11: lv_codebase_6_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getHigherOrderAlgorithmAccess().getCodebaseEStringParserRuleCall_4_0_1_0());
            	    										
            	    pushFollow(FOLLOW_33);
            	    lv_codebase_6_0=ruleEString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getHigherOrderAlgorithmRule());
            	    											}
            	    											set(
            	    												current,
            	    												"codebase",
            	    												lv_codebase_6_0,
            	    												"org.lowcomote.panoptes.PanoptesX.EString");
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
            	case 2 :
            	    // InternalPanoptesX.g:1785:4: ({...}? => ( ({...}? => (otherlv_7= 'runtime' ( ( ruleEString ) ) ) ) ) )
            	    {
            	    // InternalPanoptesX.g:1785:4: ({...}? => ( ({...}? => (otherlv_7= 'runtime' ( ( ruleEString ) ) ) ) ) )
            	    // InternalPanoptesX.g:1786:5: {...}? => ( ({...}? => (otherlv_7= 'runtime' ( ( ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getHigherOrderAlgorithmAccess().getUnorderedGroup_4(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleHigherOrderAlgorithm", "getUnorderedGroupHelper().canSelect(grammarAccess.getHigherOrderAlgorithmAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // InternalPanoptesX.g:1786:117: ( ({...}? => (otherlv_7= 'runtime' ( ( ruleEString ) ) ) ) )
            	    // InternalPanoptesX.g:1787:6: ({...}? => (otherlv_7= 'runtime' ( ( ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getHigherOrderAlgorithmAccess().getUnorderedGroup_4(), 1);
            	    					
            	    // InternalPanoptesX.g:1790:9: ({...}? => (otherlv_7= 'runtime' ( ( ruleEString ) ) ) )
            	    // InternalPanoptesX.g:1790:10: {...}? => (otherlv_7= 'runtime' ( ( ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleHigherOrderAlgorithm", "true");
            	    }
            	    // InternalPanoptesX.g:1790:19: (otherlv_7= 'runtime' ( ( ruleEString ) ) )
            	    // InternalPanoptesX.g:1790:20: otherlv_7= 'runtime' ( ( ruleEString ) )
            	    {
            	    otherlv_7=(Token)match(input,33,FOLLOW_4); 

            	    									newLeafNode(otherlv_7, grammarAccess.getHigherOrderAlgorithmAccess().getRuntimeKeyword_4_1_0());
            	    								
            	    // InternalPanoptesX.g:1794:9: ( ( ruleEString ) )
            	    // InternalPanoptesX.g:1795:10: ( ruleEString )
            	    {
            	    // InternalPanoptesX.g:1795:10: ( ruleEString )
            	    // InternalPanoptesX.g:1796:11: ruleEString
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getHigherOrderAlgorithmRule());
            	    											}
            	    										

            	    											newCompositeNode(grammarAccess.getHigherOrderAlgorithmAccess().getRuntimeHigherOrderAlgorithmRuntimeCrossReference_4_1_1_0());
            	    										
            	    pushFollow(FOLLOW_33);
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
            	    // InternalPanoptesX.g:1816:4: ({...}? => ( ({...}? => (otherlv_9= 'severity' otherlv_10= 'levels' ( (lv_driftLevels_11_0= ruleEIntegerObject ) ) ) ) ) )
            	    {
            	    // InternalPanoptesX.g:1816:4: ({...}? => ( ({...}? => (otherlv_9= 'severity' otherlv_10= 'levels' ( (lv_driftLevels_11_0= ruleEIntegerObject ) ) ) ) ) )
            	    // InternalPanoptesX.g:1817:5: {...}? => ( ({...}? => (otherlv_9= 'severity' otherlv_10= 'levels' ( (lv_driftLevels_11_0= ruleEIntegerObject ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getHigherOrderAlgorithmAccess().getUnorderedGroup_4(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleHigherOrderAlgorithm", "getUnorderedGroupHelper().canSelect(grammarAccess.getHigherOrderAlgorithmAccess().getUnorderedGroup_4(), 2)");
            	    }
            	    // InternalPanoptesX.g:1817:117: ( ({...}? => (otherlv_9= 'severity' otherlv_10= 'levels' ( (lv_driftLevels_11_0= ruleEIntegerObject ) ) ) ) )
            	    // InternalPanoptesX.g:1818:6: ({...}? => (otherlv_9= 'severity' otherlv_10= 'levels' ( (lv_driftLevels_11_0= ruleEIntegerObject ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getHigherOrderAlgorithmAccess().getUnorderedGroup_4(), 2);
            	    					
            	    // InternalPanoptesX.g:1821:9: ({...}? => (otherlv_9= 'severity' otherlv_10= 'levels' ( (lv_driftLevels_11_0= ruleEIntegerObject ) ) ) )
            	    // InternalPanoptesX.g:1821:10: {...}? => (otherlv_9= 'severity' otherlv_10= 'levels' ( (lv_driftLevels_11_0= ruleEIntegerObject ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleHigherOrderAlgorithm", "true");
            	    }
            	    // InternalPanoptesX.g:1821:19: (otherlv_9= 'severity' otherlv_10= 'levels' ( (lv_driftLevels_11_0= ruleEIntegerObject ) ) )
            	    // InternalPanoptesX.g:1821:20: otherlv_9= 'severity' otherlv_10= 'levels' ( (lv_driftLevels_11_0= ruleEIntegerObject ) )
            	    {
            	    otherlv_9=(Token)match(input,34,FOLLOW_27); 

            	    									newLeafNode(otherlv_9, grammarAccess.getHigherOrderAlgorithmAccess().getSeverityKeyword_4_2_0());
            	    								
            	    otherlv_10=(Token)match(input,35,FOLLOW_28); 

            	    									newLeafNode(otherlv_10, grammarAccess.getHigherOrderAlgorithmAccess().getLevelsKeyword_4_2_1());
            	    								
            	    // InternalPanoptesX.g:1829:9: ( (lv_driftLevels_11_0= ruleEIntegerObject ) )
            	    // InternalPanoptesX.g:1830:10: (lv_driftLevels_11_0= ruleEIntegerObject )
            	    {
            	    // InternalPanoptesX.g:1830:10: (lv_driftLevels_11_0= ruleEIntegerObject )
            	    // InternalPanoptesX.g:1831:11: lv_driftLevels_11_0= ruleEIntegerObject
            	    {

            	    											newCompositeNode(grammarAccess.getHigherOrderAlgorithmAccess().getDriftLevelsEIntegerObjectParserRuleCall_4_2_2_0());
            	    										
            	    pushFollow(FOLLOW_33);
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
            	    // InternalPanoptesX.g:1854:4: ({...}? => ( ({...}? => (otherlv_12= 'parameters' ( (lv_additionalParameters_13_0= ruleParameter ) ) (otherlv_14= ',' ( (lv_additionalParameters_15_0= ruleParameter ) ) )* ) ) ) )
            	    {
            	    // InternalPanoptesX.g:1854:4: ({...}? => ( ({...}? => (otherlv_12= 'parameters' ( (lv_additionalParameters_13_0= ruleParameter ) ) (otherlv_14= ',' ( (lv_additionalParameters_15_0= ruleParameter ) ) )* ) ) ) )
            	    // InternalPanoptesX.g:1855:5: {...}? => ( ({...}? => (otherlv_12= 'parameters' ( (lv_additionalParameters_13_0= ruleParameter ) ) (otherlv_14= ',' ( (lv_additionalParameters_15_0= ruleParameter ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getHigherOrderAlgorithmAccess().getUnorderedGroup_4(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleHigherOrderAlgorithm", "getUnorderedGroupHelper().canSelect(grammarAccess.getHigherOrderAlgorithmAccess().getUnorderedGroup_4(), 3)");
            	    }
            	    // InternalPanoptesX.g:1855:117: ( ({...}? => (otherlv_12= 'parameters' ( (lv_additionalParameters_13_0= ruleParameter ) ) (otherlv_14= ',' ( (lv_additionalParameters_15_0= ruleParameter ) ) )* ) ) )
            	    // InternalPanoptesX.g:1856:6: ({...}? => (otherlv_12= 'parameters' ( (lv_additionalParameters_13_0= ruleParameter ) ) (otherlv_14= ',' ( (lv_additionalParameters_15_0= ruleParameter ) ) )* ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getHigherOrderAlgorithmAccess().getUnorderedGroup_4(), 3);
            	    					
            	    // InternalPanoptesX.g:1859:9: ({...}? => (otherlv_12= 'parameters' ( (lv_additionalParameters_13_0= ruleParameter ) ) (otherlv_14= ',' ( (lv_additionalParameters_15_0= ruleParameter ) ) )* ) )
            	    // InternalPanoptesX.g:1859:10: {...}? => (otherlv_12= 'parameters' ( (lv_additionalParameters_13_0= ruleParameter ) ) (otherlv_14= ',' ( (lv_additionalParameters_15_0= ruleParameter ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleHigherOrderAlgorithm", "true");
            	    }
            	    // InternalPanoptesX.g:1859:19: (otherlv_12= 'parameters' ( (lv_additionalParameters_13_0= ruleParameter ) ) (otherlv_14= ',' ( (lv_additionalParameters_15_0= ruleParameter ) ) )* )
            	    // InternalPanoptesX.g:1859:20: otherlv_12= 'parameters' ( (lv_additionalParameters_13_0= ruleParameter ) ) (otherlv_14= ',' ( (lv_additionalParameters_15_0= ruleParameter ) ) )*
            	    {
            	    otherlv_12=(Token)match(input,38,FOLLOW_31); 

            	    									newLeafNode(otherlv_12, grammarAccess.getHigherOrderAlgorithmAccess().getParametersKeyword_4_3_0());
            	    								
            	    // InternalPanoptesX.g:1863:9: ( (lv_additionalParameters_13_0= ruleParameter ) )
            	    // InternalPanoptesX.g:1864:10: (lv_additionalParameters_13_0= ruleParameter )
            	    {
            	    // InternalPanoptesX.g:1864:10: (lv_additionalParameters_13_0= ruleParameter )
            	    // InternalPanoptesX.g:1865:11: lv_additionalParameters_13_0= ruleParameter
            	    {

            	    											newCompositeNode(grammarAccess.getHigherOrderAlgorithmAccess().getAdditionalParametersParameterParserRuleCall_4_3_1_0());
            	    										
            	    pushFollow(FOLLOW_34);
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

            	    // InternalPanoptesX.g:1882:9: (otherlv_14= ',' ( (lv_additionalParameters_15_0= ruleParameter ) ) )*
            	    loop24:
            	    do {
            	        int alt24=2;
            	        int LA24_0 = input.LA(1);

            	        if ( (LA24_0==15) ) {
            	            alt24=1;
            	        }


            	        switch (alt24) {
            	    	case 1 :
            	    	    // InternalPanoptesX.g:1883:10: otherlv_14= ',' ( (lv_additionalParameters_15_0= ruleParameter ) )
            	    	    {
            	    	    otherlv_14=(Token)match(input,15,FOLLOW_31); 

            	    	    										newLeafNode(otherlv_14, grammarAccess.getHigherOrderAlgorithmAccess().getCommaKeyword_4_3_2_0());
            	    	    									
            	    	    // InternalPanoptesX.g:1887:10: ( (lv_additionalParameters_15_0= ruleParameter ) )
            	    	    // InternalPanoptesX.g:1888:11: (lv_additionalParameters_15_0= ruleParameter )
            	    	    {
            	    	    // InternalPanoptesX.g:1888:11: (lv_additionalParameters_15_0= ruleParameter )
            	    	    // InternalPanoptesX.g:1889:12: lv_additionalParameters_15_0= ruleParameter
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getHigherOrderAlgorithmAccess().getAdditionalParametersParameterParserRuleCall_4_3_2_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_34);
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
            	    	    break loop24;
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
            	    if ( cnt25 >= 1 ) break loop25;
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getHigherOrderAlgorithmAccess().getUnorderedGroup_4()) ) {
                throw new FailedPredicateException(input, "ruleHigherOrderAlgorithm", "getUnorderedGroupHelper().canLeave(grammarAccess.getHigherOrderAlgorithmAccess().getUnorderedGroup_4())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getHigherOrderAlgorithmAccess().getUnorderedGroup_4());
            				

            }

            otherlv_16=(Token)match(input,17,FOLLOW_2); 

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
    // InternalPanoptesX.g:1929:1: entryRuleAlgorithmRuntime returns [EObject current=null] : iv_ruleAlgorithmRuntime= ruleAlgorithmRuntime EOF ;
    public final EObject entryRuleAlgorithmRuntime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlgorithmRuntime = null;


        try {
            // InternalPanoptesX.g:1929:57: (iv_ruleAlgorithmRuntime= ruleAlgorithmRuntime EOF )
            // InternalPanoptesX.g:1930:2: iv_ruleAlgorithmRuntime= ruleAlgorithmRuntime EOF
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
    // InternalPanoptesX.g:1936:1: ruleAlgorithmRuntime returns [EObject current=null] : (this_BaseAlgorithmRuntime_0= ruleBaseAlgorithmRuntime | this_HigherOrderAlgorithmRuntime_1= ruleHigherOrderAlgorithmRuntime ) ;
    public final EObject ruleAlgorithmRuntime() throws RecognitionException {
        EObject current = null;

        EObject this_BaseAlgorithmRuntime_0 = null;

        EObject this_HigherOrderAlgorithmRuntime_1 = null;



        	enterRule();

        try {
            // InternalPanoptesX.g:1942:2: ( (this_BaseAlgorithmRuntime_0= ruleBaseAlgorithmRuntime | this_HigherOrderAlgorithmRuntime_1= ruleHigherOrderAlgorithmRuntime ) )
            // InternalPanoptesX.g:1943:2: (this_BaseAlgorithmRuntime_0= ruleBaseAlgorithmRuntime | this_HigherOrderAlgorithmRuntime_1= ruleHigherOrderAlgorithmRuntime )
            {
            // InternalPanoptesX.g:1943:2: (this_BaseAlgorithmRuntime_0= ruleBaseAlgorithmRuntime | this_HigherOrderAlgorithmRuntime_1= ruleHigherOrderAlgorithmRuntime )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==40) ) {
                alt26=1;
            }
            else if ( (LA26_0==42) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalPanoptesX.g:1944:3: this_BaseAlgorithmRuntime_0= ruleBaseAlgorithmRuntime
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
                    // InternalPanoptesX.g:1953:3: this_HigherOrderAlgorithmRuntime_1= ruleHigherOrderAlgorithmRuntime
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
    // InternalPanoptesX.g:1965:1: entryRuleBaseAlgorithmRuntime returns [EObject current=null] : iv_ruleBaseAlgorithmRuntime= ruleBaseAlgorithmRuntime EOF ;
    public final EObject entryRuleBaseAlgorithmRuntime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaseAlgorithmRuntime = null;


        try {
            // InternalPanoptesX.g:1965:61: (iv_ruleBaseAlgorithmRuntime= ruleBaseAlgorithmRuntime EOF )
            // InternalPanoptesX.g:1966:2: iv_ruleBaseAlgorithmRuntime= ruleBaseAlgorithmRuntime EOF
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
    // InternalPanoptesX.g:1972:1: ruleBaseAlgorithmRuntime returns [EObject current=null] : ( () otherlv_1= 'BaseAlgorithmRuntime' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '{' otherlv_4= 'endpoint' ( (lv_endpoint_5_0= ruleEString ) ) otherlv_6= '}' )? ) ;
    public final EObject ruleBaseAlgorithmRuntime() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_endpoint_5_0 = null;



        	enterRule();

        try {
            // InternalPanoptesX.g:1978:2: ( ( () otherlv_1= 'BaseAlgorithmRuntime' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '{' otherlv_4= 'endpoint' ( (lv_endpoint_5_0= ruleEString ) ) otherlv_6= '}' )? ) )
            // InternalPanoptesX.g:1979:2: ( () otherlv_1= 'BaseAlgorithmRuntime' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '{' otherlv_4= 'endpoint' ( (lv_endpoint_5_0= ruleEString ) ) otherlv_6= '}' )? )
            {
            // InternalPanoptesX.g:1979:2: ( () otherlv_1= 'BaseAlgorithmRuntime' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '{' otherlv_4= 'endpoint' ( (lv_endpoint_5_0= ruleEString ) ) otherlv_6= '}' )? )
            // InternalPanoptesX.g:1980:3: () otherlv_1= 'BaseAlgorithmRuntime' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '{' otherlv_4= 'endpoint' ( (lv_endpoint_5_0= ruleEString ) ) otherlv_6= '}' )?
            {
            // InternalPanoptesX.g:1980:3: ()
            // InternalPanoptesX.g:1981:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBaseAlgorithmRuntimeAccess().getBaseAlgorithmRuntimeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,40,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getBaseAlgorithmRuntimeAccess().getBaseAlgorithmRuntimeKeyword_1());
            		
            // InternalPanoptesX.g:1991:3: ( (lv_name_2_0= ruleEString ) )
            // InternalPanoptesX.g:1992:4: (lv_name_2_0= ruleEString )
            {
            // InternalPanoptesX.g:1992:4: (lv_name_2_0= ruleEString )
            // InternalPanoptesX.g:1993:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBaseAlgorithmRuntimeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_16);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBaseAlgorithmRuntimeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.lowcomote.panoptes.PanoptesX.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPanoptesX.g:2010:3: (otherlv_3= '{' otherlv_4= 'endpoint' ( (lv_endpoint_5_0= ruleEString ) ) otherlv_6= '}' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==13) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalPanoptesX.g:2011:4: otherlv_3= '{' otherlv_4= 'endpoint' ( (lv_endpoint_5_0= ruleEString ) ) otherlv_6= '}'
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_35); 

                    				newLeafNode(otherlv_3, grammarAccess.getBaseAlgorithmRuntimeAccess().getLeftCurlyBracketKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,41,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getBaseAlgorithmRuntimeAccess().getEndpointKeyword_3_1());
                    			
                    // InternalPanoptesX.g:2019:4: ( (lv_endpoint_5_0= ruleEString ) )
                    // InternalPanoptesX.g:2020:5: (lv_endpoint_5_0= ruleEString )
                    {
                    // InternalPanoptesX.g:2020:5: (lv_endpoint_5_0= ruleEString )
                    // InternalPanoptesX.g:2021:6: lv_endpoint_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getBaseAlgorithmRuntimeAccess().getEndpointEStringParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_36);
                    lv_endpoint_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBaseAlgorithmRuntimeRule());
                    						}
                    						set(
                    							current,
                    							"endpoint",
                    							lv_endpoint_5_0,
                    							"org.lowcomote.panoptes.PanoptesX.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,17,FOLLOW_2); 

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
    // InternalPanoptesX.g:2047:1: entryRuleHigherOrderAlgorithmRuntime returns [EObject current=null] : iv_ruleHigherOrderAlgorithmRuntime= ruleHigherOrderAlgorithmRuntime EOF ;
    public final EObject entryRuleHigherOrderAlgorithmRuntime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHigherOrderAlgorithmRuntime = null;


        try {
            // InternalPanoptesX.g:2047:68: (iv_ruleHigherOrderAlgorithmRuntime= ruleHigherOrderAlgorithmRuntime EOF )
            // InternalPanoptesX.g:2048:2: iv_ruleHigherOrderAlgorithmRuntime= ruleHigherOrderAlgorithmRuntime EOF
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
    // InternalPanoptesX.g:2054:1: ruleHigherOrderAlgorithmRuntime returns [EObject current=null] : ( () otherlv_1= 'HigherOrderAlgorithmRuntime' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '{' otherlv_4= 'endpoint' ( (lv_endpoint_5_0= ruleEString ) ) otherlv_6= '}' )? ) ;
    public final EObject ruleHigherOrderAlgorithmRuntime() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_endpoint_5_0 = null;



        	enterRule();

        try {
            // InternalPanoptesX.g:2060:2: ( ( () otherlv_1= 'HigherOrderAlgorithmRuntime' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '{' otherlv_4= 'endpoint' ( (lv_endpoint_5_0= ruleEString ) ) otherlv_6= '}' )? ) )
            // InternalPanoptesX.g:2061:2: ( () otherlv_1= 'HigherOrderAlgorithmRuntime' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '{' otherlv_4= 'endpoint' ( (lv_endpoint_5_0= ruleEString ) ) otherlv_6= '}' )? )
            {
            // InternalPanoptesX.g:2061:2: ( () otherlv_1= 'HigherOrderAlgorithmRuntime' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '{' otherlv_4= 'endpoint' ( (lv_endpoint_5_0= ruleEString ) ) otherlv_6= '}' )? )
            // InternalPanoptesX.g:2062:3: () otherlv_1= 'HigherOrderAlgorithmRuntime' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '{' otherlv_4= 'endpoint' ( (lv_endpoint_5_0= ruleEString ) ) otherlv_6= '}' )?
            {
            // InternalPanoptesX.g:2062:3: ()
            // InternalPanoptesX.g:2063:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getHigherOrderAlgorithmRuntimeAccess().getHigherOrderAlgorithmRuntimeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,42,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getHigherOrderAlgorithmRuntimeAccess().getHigherOrderAlgorithmRuntimeKeyword_1());
            		
            // InternalPanoptesX.g:2073:3: ( (lv_name_2_0= ruleEString ) )
            // InternalPanoptesX.g:2074:4: (lv_name_2_0= ruleEString )
            {
            // InternalPanoptesX.g:2074:4: (lv_name_2_0= ruleEString )
            // InternalPanoptesX.g:2075:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getHigherOrderAlgorithmRuntimeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_16);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHigherOrderAlgorithmRuntimeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.lowcomote.panoptes.PanoptesX.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPanoptesX.g:2092:3: (otherlv_3= '{' otherlv_4= 'endpoint' ( (lv_endpoint_5_0= ruleEString ) ) otherlv_6= '}' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==13) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalPanoptesX.g:2093:4: otherlv_3= '{' otherlv_4= 'endpoint' ( (lv_endpoint_5_0= ruleEString ) ) otherlv_6= '}'
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_35); 

                    				newLeafNode(otherlv_3, grammarAccess.getHigherOrderAlgorithmRuntimeAccess().getLeftCurlyBracketKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,41,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getHigherOrderAlgorithmRuntimeAccess().getEndpointKeyword_3_1());
                    			
                    // InternalPanoptesX.g:2101:4: ( (lv_endpoint_5_0= ruleEString ) )
                    // InternalPanoptesX.g:2102:5: (lv_endpoint_5_0= ruleEString )
                    {
                    // InternalPanoptesX.g:2102:5: (lv_endpoint_5_0= ruleEString )
                    // InternalPanoptesX.g:2103:6: lv_endpoint_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getHigherOrderAlgorithmRuntimeAccess().getEndpointEStringParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_36);
                    lv_endpoint_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getHigherOrderAlgorithmRuntimeRule());
                    						}
                    						set(
                    							current,
                    							"endpoint",
                    							lv_endpoint_5_0,
                    							"org.lowcomote.panoptes.PanoptesX.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,17,FOLLOW_2); 

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
    // InternalPanoptesX.g:2129:1: entryRuleAlgorithmExecution returns [EObject current=null] : iv_ruleAlgorithmExecution= ruleAlgorithmExecution EOF ;
    public final EObject entryRuleAlgorithmExecution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlgorithmExecution = null;


        try {
            // InternalPanoptesX.g:2129:59: (iv_ruleAlgorithmExecution= ruleAlgorithmExecution EOF )
            // InternalPanoptesX.g:2130:2: iv_ruleAlgorithmExecution= ruleAlgorithmExecution EOF
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
    // InternalPanoptesX.g:2136:1: ruleAlgorithmExecution returns [EObject current=null] : (this_BaseAlgorithmExecution_0= ruleBaseAlgorithmExecution | this_HigherOrderAlgorithmExecution_1= ruleHigherOrderAlgorithmExecution ) ;
    public final EObject ruleAlgorithmExecution() throws RecognitionException {
        EObject current = null;

        EObject this_BaseAlgorithmExecution_0 = null;

        EObject this_HigherOrderAlgorithmExecution_1 = null;



        	enterRule();

        try {
            // InternalPanoptesX.g:2142:2: ( (this_BaseAlgorithmExecution_0= ruleBaseAlgorithmExecution | this_HigherOrderAlgorithmExecution_1= ruleHigherOrderAlgorithmExecution ) )
            // InternalPanoptesX.g:2143:2: (this_BaseAlgorithmExecution_0= ruleBaseAlgorithmExecution | this_HigherOrderAlgorithmExecution_1= ruleHigherOrderAlgorithmExecution )
            {
            // InternalPanoptesX.g:2143:2: (this_BaseAlgorithmExecution_0= ruleBaseAlgorithmExecution | this_HigherOrderAlgorithmExecution_1= ruleHigherOrderAlgorithmExecution )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==43) ) {
                alt29=1;
            }
            else if ( (LA29_0==50) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalPanoptesX.g:2144:3: this_BaseAlgorithmExecution_0= ruleBaseAlgorithmExecution
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
                    // InternalPanoptesX.g:2153:3: this_HigherOrderAlgorithmExecution_1= ruleHigherOrderAlgorithmExecution
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
    // InternalPanoptesX.g:2165:1: entryRuleBaseAlgorithmExecution returns [EObject current=null] : iv_ruleBaseAlgorithmExecution= ruleBaseAlgorithmExecution EOF ;
    public final EObject entryRuleBaseAlgorithmExecution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaseAlgorithmExecution = null;


        try {
            // InternalPanoptesX.g:2165:63: (iv_ruleBaseAlgorithmExecution= ruleBaseAlgorithmExecution EOF )
            // InternalPanoptesX.g:2166:2: iv_ruleBaseAlgorithmExecution= ruleBaseAlgorithmExecution EOF
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
    // InternalPanoptesX.g:2172:1: ruleBaseAlgorithmExecution returns [EObject current=null] : ( () otherlv_1= 'BaseAlgorithmExecution' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'algorithm' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'live' otherlv_8= 'data' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'historic' otherlv_13= 'data' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'actions' ( (lv_ActionExecutionMap_18_0= ruleactionExecutionEntry ) ) (otherlv_19= ',' ( (lv_ActionExecutionMap_20_0= ruleactionExecutionEntry ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'parameter' otherlv_22= 'values' ( (lv_parameterValueMap_23_0= ruleparameterValueEntry ) ) (otherlv_24= ',' ( (lv_parameterValueMap_25_0= ruleparameterValueEntry ) ) )* ) ) ) ) )+ {...}?) ) ) otherlv_26= '}' ) ;
    public final EObject ruleBaseAlgorithmExecution() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
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
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_ActionExecutionMap_18_0 = null;

        EObject lv_ActionExecutionMap_20_0 = null;

        EObject lv_parameterValueMap_23_0 = null;

        EObject lv_parameterValueMap_25_0 = null;



        	enterRule();

        try {
            // InternalPanoptesX.g:2178:2: ( ( () otherlv_1= 'BaseAlgorithmExecution' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'algorithm' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'live' otherlv_8= 'data' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'historic' otherlv_13= 'data' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'actions' ( (lv_ActionExecutionMap_18_0= ruleactionExecutionEntry ) ) (otherlv_19= ',' ( (lv_ActionExecutionMap_20_0= ruleactionExecutionEntry ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'parameter' otherlv_22= 'values' ( (lv_parameterValueMap_23_0= ruleparameterValueEntry ) ) (otherlv_24= ',' ( (lv_parameterValueMap_25_0= ruleparameterValueEntry ) ) )* ) ) ) ) )+ {...}?) ) ) otherlv_26= '}' ) )
            // InternalPanoptesX.g:2179:2: ( () otherlv_1= 'BaseAlgorithmExecution' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'algorithm' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'live' otherlv_8= 'data' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'historic' otherlv_13= 'data' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'actions' ( (lv_ActionExecutionMap_18_0= ruleactionExecutionEntry ) ) (otherlv_19= ',' ( (lv_ActionExecutionMap_20_0= ruleactionExecutionEntry ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'parameter' otherlv_22= 'values' ( (lv_parameterValueMap_23_0= ruleparameterValueEntry ) ) (otherlv_24= ',' ( (lv_parameterValueMap_25_0= ruleparameterValueEntry ) ) )* ) ) ) ) )+ {...}?) ) ) otherlv_26= '}' )
            {
            // InternalPanoptesX.g:2179:2: ( () otherlv_1= 'BaseAlgorithmExecution' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'algorithm' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'live' otherlv_8= 'data' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'historic' otherlv_13= 'data' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'actions' ( (lv_ActionExecutionMap_18_0= ruleactionExecutionEntry ) ) (otherlv_19= ',' ( (lv_ActionExecutionMap_20_0= ruleactionExecutionEntry ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'parameter' otherlv_22= 'values' ( (lv_parameterValueMap_23_0= ruleparameterValueEntry ) ) (otherlv_24= ',' ( (lv_parameterValueMap_25_0= ruleparameterValueEntry ) ) )* ) ) ) ) )+ {...}?) ) ) otherlv_26= '}' )
            // InternalPanoptesX.g:2180:3: () otherlv_1= 'BaseAlgorithmExecution' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'algorithm' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'live' otherlv_8= 'data' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'historic' otherlv_13= 'data' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'actions' ( (lv_ActionExecutionMap_18_0= ruleactionExecutionEntry ) ) (otherlv_19= ',' ( (lv_ActionExecutionMap_20_0= ruleactionExecutionEntry ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'parameter' otherlv_22= 'values' ( (lv_parameterValueMap_23_0= ruleparameterValueEntry ) ) (otherlv_24= ',' ( (lv_parameterValueMap_25_0= ruleparameterValueEntry ) ) )* ) ) ) ) )+ {...}?) ) ) otherlv_26= '}'
            {
            // InternalPanoptesX.g:2180:3: ()
            // InternalPanoptesX.g:2181:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBaseAlgorithmExecutionAccess().getBaseAlgorithmExecutionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,43,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getBaseAlgorithmExecutionAccess().getBaseAlgorithmExecutionKeyword_1());
            		
            // InternalPanoptesX.g:2191:3: ( (lv_name_2_0= ruleEString ) )
            // InternalPanoptesX.g:2192:4: (lv_name_2_0= ruleEString )
            {
            // InternalPanoptesX.g:2192:4: (lv_name_2_0= ruleEString )
            // InternalPanoptesX.g:2193:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBaseAlgorithmExecutionAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBaseAlgorithmExecutionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.lowcomote.panoptes.PanoptesX.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_37); 

            			newLeafNode(otherlv_3, grammarAccess.getBaseAlgorithmExecutionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalPanoptesX.g:2214:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'algorithm' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'live' otherlv_8= 'data' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'historic' otherlv_13= 'data' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'actions' ( (lv_ActionExecutionMap_18_0= ruleactionExecutionEntry ) ) (otherlv_19= ',' ( (lv_ActionExecutionMap_20_0= ruleactionExecutionEntry ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'parameter' otherlv_22= 'values' ( (lv_parameterValueMap_23_0= ruleparameterValueEntry ) ) (otherlv_24= ',' ( (lv_parameterValueMap_25_0= ruleparameterValueEntry ) ) )* ) ) ) ) )+ {...}?) ) )
            // InternalPanoptesX.g:2215:4: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'algorithm' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'live' otherlv_8= 'data' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'historic' otherlv_13= 'data' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'actions' ( (lv_ActionExecutionMap_18_0= ruleactionExecutionEntry ) ) (otherlv_19= ',' ( (lv_ActionExecutionMap_20_0= ruleactionExecutionEntry ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'parameter' otherlv_22= 'values' ( (lv_parameterValueMap_23_0= ruleparameterValueEntry ) ) (otherlv_24= ',' ( (lv_parameterValueMap_25_0= ruleparameterValueEntry ) ) )* ) ) ) ) )+ {...}?) )
            {
            // InternalPanoptesX.g:2215:4: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'algorithm' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'live' otherlv_8= 'data' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'historic' otherlv_13= 'data' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'actions' ( (lv_ActionExecutionMap_18_0= ruleactionExecutionEntry ) ) (otherlv_19= ',' ( (lv_ActionExecutionMap_20_0= ruleactionExecutionEntry ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'parameter' otherlv_22= 'values' ( (lv_parameterValueMap_23_0= ruleparameterValueEntry ) ) (otherlv_24= ',' ( (lv_parameterValueMap_25_0= ruleparameterValueEntry ) ) )* ) ) ) ) )+ {...}?) )
            // InternalPanoptesX.g:2216:5: ( ( ({...}? => ( ({...}? => (otherlv_5= 'algorithm' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'live' otherlv_8= 'data' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'historic' otherlv_13= 'data' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'actions' ( (lv_ActionExecutionMap_18_0= ruleactionExecutionEntry ) ) (otherlv_19= ',' ( (lv_ActionExecutionMap_20_0= ruleactionExecutionEntry ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'parameter' otherlv_22= 'values' ( (lv_parameterValueMap_23_0= ruleparameterValueEntry ) ) (otherlv_24= ',' ( (lv_parameterValueMap_25_0= ruleparameterValueEntry ) ) )* ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getBaseAlgorithmExecutionAccess().getUnorderedGroup_4());
            				
            // InternalPanoptesX.g:2219:5: ( ( ({...}? => ( ({...}? => (otherlv_5= 'algorithm' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'live' otherlv_8= 'data' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'historic' otherlv_13= 'data' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'actions' ( (lv_ActionExecutionMap_18_0= ruleactionExecutionEntry ) ) (otherlv_19= ',' ( (lv_ActionExecutionMap_20_0= ruleactionExecutionEntry ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'parameter' otherlv_22= 'values' ( (lv_parameterValueMap_23_0= ruleparameterValueEntry ) ) (otherlv_24= ',' ( (lv_parameterValueMap_25_0= ruleparameterValueEntry ) ) )* ) ) ) ) )+ {...}?)
            // InternalPanoptesX.g:2220:6: ( ({...}? => ( ({...}? => (otherlv_5= 'algorithm' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'live' otherlv_8= 'data' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'historic' otherlv_13= 'data' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'actions' ( (lv_ActionExecutionMap_18_0= ruleactionExecutionEntry ) ) (otherlv_19= ',' ( (lv_ActionExecutionMap_20_0= ruleactionExecutionEntry ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'parameter' otherlv_22= 'values' ( (lv_parameterValueMap_23_0= ruleparameterValueEntry ) ) (otherlv_24= ',' ( (lv_parameterValueMap_25_0= ruleparameterValueEntry ) ) )* ) ) ) ) )+ {...}?
            {
            // InternalPanoptesX.g:2220:6: ( ({...}? => ( ({...}? => (otherlv_5= 'algorithm' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'live' otherlv_8= 'data' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'historic' otherlv_13= 'data' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'actions' ( (lv_ActionExecutionMap_18_0= ruleactionExecutionEntry ) ) (otherlv_19= ',' ( (lv_ActionExecutionMap_20_0= ruleactionExecutionEntry ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'parameter' otherlv_22= 'values' ( (lv_parameterValueMap_23_0= ruleparameterValueEntry ) ) (otherlv_24= ',' ( (lv_parameterValueMap_25_0= ruleparameterValueEntry ) ) )* ) ) ) ) )+
            int cnt34=0;
            loop34:
            do {
                int alt34=6;
                int LA34_0 = input.LA(1);

                if ( LA34_0 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getBaseAlgorithmExecutionAccess().getUnorderedGroup_4(), 0) ) {
                    alt34=1;
                }
                else if ( LA34_0 == 45 && getUnorderedGroupHelper().canSelect(grammarAccess.getBaseAlgorithmExecutionAccess().getUnorderedGroup_4(), 1) ) {
                    alt34=2;
                }
                else if ( LA34_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getBaseAlgorithmExecutionAccess().getUnorderedGroup_4(), 2) ) {
                    alt34=3;
                }
                else if ( LA34_0 == 47 && getUnorderedGroupHelper().canSelect(grammarAccess.getBaseAlgorithmExecutionAccess().getUnorderedGroup_4(), 3) ) {
                    alt34=4;
                }
                else if ( LA34_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getBaseAlgorithmExecutionAccess().getUnorderedGroup_4(), 4) ) {
                    alt34=5;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalPanoptesX.g:2221:4: ({...}? => ( ({...}? => (otherlv_5= 'algorithm' ( ( ruleEString ) ) ) ) ) )
            	    {
            	    // InternalPanoptesX.g:2221:4: ({...}? => ( ({...}? => (otherlv_5= 'algorithm' ( ( ruleEString ) ) ) ) ) )
            	    // InternalPanoptesX.g:2222:5: {...}? => ( ({...}? => (otherlv_5= 'algorithm' ( ( ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBaseAlgorithmExecutionAccess().getUnorderedGroup_4(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleBaseAlgorithmExecution", "getUnorderedGroupHelper().canSelect(grammarAccess.getBaseAlgorithmExecutionAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // InternalPanoptesX.g:2222:119: ( ({...}? => (otherlv_5= 'algorithm' ( ( ruleEString ) ) ) ) )
            	    // InternalPanoptesX.g:2223:6: ({...}? => (otherlv_5= 'algorithm' ( ( ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getBaseAlgorithmExecutionAccess().getUnorderedGroup_4(), 0);
            	    					
            	    // InternalPanoptesX.g:2226:9: ({...}? => (otherlv_5= 'algorithm' ( ( ruleEString ) ) ) )
            	    // InternalPanoptesX.g:2226:10: {...}? => (otherlv_5= 'algorithm' ( ( ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBaseAlgorithmExecution", "true");
            	    }
            	    // InternalPanoptesX.g:2226:19: (otherlv_5= 'algorithm' ( ( ruleEString ) ) )
            	    // InternalPanoptesX.g:2226:20: otherlv_5= 'algorithm' ( ( ruleEString ) )
            	    {
            	    otherlv_5=(Token)match(input,44,FOLLOW_4); 

            	    									newLeafNode(otherlv_5, grammarAccess.getBaseAlgorithmExecutionAccess().getAlgorithmKeyword_4_0_0());
            	    								
            	    // InternalPanoptesX.g:2230:9: ( ( ruleEString ) )
            	    // InternalPanoptesX.g:2231:10: ( ruleEString )
            	    {
            	    // InternalPanoptesX.g:2231:10: ( ruleEString )
            	    // InternalPanoptesX.g:2232:11: ruleEString
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getBaseAlgorithmExecutionRule());
            	    											}
            	    										

            	    											newCompositeNode(grammarAccess.getBaseAlgorithmExecutionAccess().getAlgorithmBaseAlgorithmCrossReference_4_0_1_0());
            	    										
            	    pushFollow(FOLLOW_38);
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
            	    // InternalPanoptesX.g:2252:4: ({...}? => ( ({...}? => (otherlv_7= 'live' otherlv_8= 'data' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* ) ) ) )
            	    {
            	    // InternalPanoptesX.g:2252:4: ({...}? => ( ({...}? => (otherlv_7= 'live' otherlv_8= 'data' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* ) ) ) )
            	    // InternalPanoptesX.g:2253:5: {...}? => ( ({...}? => (otherlv_7= 'live' otherlv_8= 'data' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBaseAlgorithmExecutionAccess().getUnorderedGroup_4(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleBaseAlgorithmExecution", "getUnorderedGroupHelper().canSelect(grammarAccess.getBaseAlgorithmExecutionAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // InternalPanoptesX.g:2253:119: ( ({...}? => (otherlv_7= 'live' otherlv_8= 'data' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* ) ) )
            	    // InternalPanoptesX.g:2254:6: ({...}? => (otherlv_7= 'live' otherlv_8= 'data' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getBaseAlgorithmExecutionAccess().getUnorderedGroup_4(), 1);
            	    					
            	    // InternalPanoptesX.g:2257:9: ({...}? => (otherlv_7= 'live' otherlv_8= 'data' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* ) )
            	    // InternalPanoptesX.g:2257:10: {...}? => (otherlv_7= 'live' otherlv_8= 'data' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBaseAlgorithmExecution", "true");
            	    }
            	    // InternalPanoptesX.g:2257:19: (otherlv_7= 'live' otherlv_8= 'data' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* )
            	    // InternalPanoptesX.g:2257:20: otherlv_7= 'live' otherlv_8= 'data' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )*
            	    {
            	    otherlv_7=(Token)match(input,45,FOLLOW_11); 

            	    									newLeafNode(otherlv_7, grammarAccess.getBaseAlgorithmExecutionAccess().getLiveKeyword_4_1_0());
            	    								
            	    otherlv_8=(Token)match(input,23,FOLLOW_4); 

            	    									newLeafNode(otherlv_8, grammarAccess.getBaseAlgorithmExecutionAccess().getDataKeyword_4_1_1());
            	    								
            	    // InternalPanoptesX.g:2265:9: ( ( ruleEString ) )
            	    // InternalPanoptesX.g:2266:10: ( ruleEString )
            	    {
            	    // InternalPanoptesX.g:2266:10: ( ruleEString )
            	    // InternalPanoptesX.g:2267:11: ruleEString
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getBaseAlgorithmExecutionRule());
            	    											}
            	    										

            	    											newCompositeNode(grammarAccess.getBaseAlgorithmExecutionAccess().getCurrentIOValuesModelIOCrossReference_4_1_2_0());
            	    										
            	    pushFollow(FOLLOW_39);
            	    ruleEString();

            	    state._fsp--;


            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalPanoptesX.g:2281:9: (otherlv_10= ',' ( ( ruleEString ) ) )*
            	    loop30:
            	    do {
            	        int alt30=2;
            	        int LA30_0 = input.LA(1);

            	        if ( (LA30_0==15) ) {
            	            alt30=1;
            	        }


            	        switch (alt30) {
            	    	case 1 :
            	    	    // InternalPanoptesX.g:2282:10: otherlv_10= ',' ( ( ruleEString ) )
            	    	    {
            	    	    otherlv_10=(Token)match(input,15,FOLLOW_4); 

            	    	    										newLeafNode(otherlv_10, grammarAccess.getBaseAlgorithmExecutionAccess().getCommaKeyword_4_1_3_0());
            	    	    									
            	    	    // InternalPanoptesX.g:2286:10: ( ( ruleEString ) )
            	    	    // InternalPanoptesX.g:2287:11: ( ruleEString )
            	    	    {
            	    	    // InternalPanoptesX.g:2287:11: ( ruleEString )
            	    	    // InternalPanoptesX.g:2288:12: ruleEString
            	    	    {

            	    	    												if (current==null) {
            	    	    													current = createModelElement(grammarAccess.getBaseAlgorithmExecutionRule());
            	    	    												}
            	    	    											

            	    	    												newCompositeNode(grammarAccess.getBaseAlgorithmExecutionAccess().getCurrentIOValuesModelIOCrossReference_4_1_3_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_39);
            	    	    ruleEString();

            	    	    state._fsp--;


            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop30;
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
            	    // InternalPanoptesX.g:2309:4: ({...}? => ( ({...}? => (otherlv_12= 'historic' otherlv_13= 'data' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* ) ) ) )
            	    {
            	    // InternalPanoptesX.g:2309:4: ({...}? => ( ({...}? => (otherlv_12= 'historic' otherlv_13= 'data' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* ) ) ) )
            	    // InternalPanoptesX.g:2310:5: {...}? => ( ({...}? => (otherlv_12= 'historic' otherlv_13= 'data' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBaseAlgorithmExecutionAccess().getUnorderedGroup_4(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleBaseAlgorithmExecution", "getUnorderedGroupHelper().canSelect(grammarAccess.getBaseAlgorithmExecutionAccess().getUnorderedGroup_4(), 2)");
            	    }
            	    // InternalPanoptesX.g:2310:119: ( ({...}? => (otherlv_12= 'historic' otherlv_13= 'data' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* ) ) )
            	    // InternalPanoptesX.g:2311:6: ({...}? => (otherlv_12= 'historic' otherlv_13= 'data' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getBaseAlgorithmExecutionAccess().getUnorderedGroup_4(), 2);
            	    					
            	    // InternalPanoptesX.g:2314:9: ({...}? => (otherlv_12= 'historic' otherlv_13= 'data' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* ) )
            	    // InternalPanoptesX.g:2314:10: {...}? => (otherlv_12= 'historic' otherlv_13= 'data' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBaseAlgorithmExecution", "true");
            	    }
            	    // InternalPanoptesX.g:2314:19: (otherlv_12= 'historic' otherlv_13= 'data' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* )
            	    // InternalPanoptesX.g:2314:20: otherlv_12= 'historic' otherlv_13= 'data' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )*
            	    {
            	    otherlv_12=(Token)match(input,46,FOLLOW_11); 

            	    									newLeafNode(otherlv_12, grammarAccess.getBaseAlgorithmExecutionAccess().getHistoricKeyword_4_2_0());
            	    								
            	    otherlv_13=(Token)match(input,23,FOLLOW_4); 

            	    									newLeafNode(otherlv_13, grammarAccess.getBaseAlgorithmExecutionAccess().getDataKeyword_4_2_1());
            	    								
            	    // InternalPanoptesX.g:2322:9: ( ( ruleEString ) )
            	    // InternalPanoptesX.g:2323:10: ( ruleEString )
            	    {
            	    // InternalPanoptesX.g:2323:10: ( ruleEString )
            	    // InternalPanoptesX.g:2324:11: ruleEString
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getBaseAlgorithmExecutionRule());
            	    											}
            	    										

            	    											newCompositeNode(grammarAccess.getBaseAlgorithmExecutionAccess().getHistoricIOValuesModelIOCrossReference_4_2_2_0());
            	    										
            	    pushFollow(FOLLOW_39);
            	    ruleEString();

            	    state._fsp--;


            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalPanoptesX.g:2338:9: (otherlv_15= ',' ( ( ruleEString ) ) )*
            	    loop31:
            	    do {
            	        int alt31=2;
            	        int LA31_0 = input.LA(1);

            	        if ( (LA31_0==15) ) {
            	            alt31=1;
            	        }


            	        switch (alt31) {
            	    	case 1 :
            	    	    // InternalPanoptesX.g:2339:10: otherlv_15= ',' ( ( ruleEString ) )
            	    	    {
            	    	    otherlv_15=(Token)match(input,15,FOLLOW_4); 

            	    	    										newLeafNode(otherlv_15, grammarAccess.getBaseAlgorithmExecutionAccess().getCommaKeyword_4_2_3_0());
            	    	    									
            	    	    // InternalPanoptesX.g:2343:10: ( ( ruleEString ) )
            	    	    // InternalPanoptesX.g:2344:11: ( ruleEString )
            	    	    {
            	    	    // InternalPanoptesX.g:2344:11: ( ruleEString )
            	    	    // InternalPanoptesX.g:2345:12: ruleEString
            	    	    {

            	    	    												if (current==null) {
            	    	    													current = createModelElement(grammarAccess.getBaseAlgorithmExecutionRule());
            	    	    												}
            	    	    											

            	    	    												newCompositeNode(grammarAccess.getBaseAlgorithmExecutionAccess().getHistoricIOValuesModelIOCrossReference_4_2_3_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_39);
            	    	    ruleEString();

            	    	    state._fsp--;


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

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBaseAlgorithmExecutionAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalPanoptesX.g:2366:4: ({...}? => ( ({...}? => (otherlv_17= 'actions' ( (lv_ActionExecutionMap_18_0= ruleactionExecutionEntry ) ) (otherlv_19= ',' ( (lv_ActionExecutionMap_20_0= ruleactionExecutionEntry ) ) )* ) ) ) )
            	    {
            	    // InternalPanoptesX.g:2366:4: ({...}? => ( ({...}? => (otherlv_17= 'actions' ( (lv_ActionExecutionMap_18_0= ruleactionExecutionEntry ) ) (otherlv_19= ',' ( (lv_ActionExecutionMap_20_0= ruleactionExecutionEntry ) ) )* ) ) ) )
            	    // InternalPanoptesX.g:2367:5: {...}? => ( ({...}? => (otherlv_17= 'actions' ( (lv_ActionExecutionMap_18_0= ruleactionExecutionEntry ) ) (otherlv_19= ',' ( (lv_ActionExecutionMap_20_0= ruleactionExecutionEntry ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBaseAlgorithmExecutionAccess().getUnorderedGroup_4(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleBaseAlgorithmExecution", "getUnorderedGroupHelper().canSelect(grammarAccess.getBaseAlgorithmExecutionAccess().getUnorderedGroup_4(), 3)");
            	    }
            	    // InternalPanoptesX.g:2367:119: ( ({...}? => (otherlv_17= 'actions' ( (lv_ActionExecutionMap_18_0= ruleactionExecutionEntry ) ) (otherlv_19= ',' ( (lv_ActionExecutionMap_20_0= ruleactionExecutionEntry ) ) )* ) ) )
            	    // InternalPanoptesX.g:2368:6: ({...}? => (otherlv_17= 'actions' ( (lv_ActionExecutionMap_18_0= ruleactionExecutionEntry ) ) (otherlv_19= ',' ( (lv_ActionExecutionMap_20_0= ruleactionExecutionEntry ) ) )* ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getBaseAlgorithmExecutionAccess().getUnorderedGroup_4(), 3);
            	    					
            	    // InternalPanoptesX.g:2371:9: ({...}? => (otherlv_17= 'actions' ( (lv_ActionExecutionMap_18_0= ruleactionExecutionEntry ) ) (otherlv_19= ',' ( (lv_ActionExecutionMap_20_0= ruleactionExecutionEntry ) ) )* ) )
            	    // InternalPanoptesX.g:2371:10: {...}? => (otherlv_17= 'actions' ( (lv_ActionExecutionMap_18_0= ruleactionExecutionEntry ) ) (otherlv_19= ',' ( (lv_ActionExecutionMap_20_0= ruleactionExecutionEntry ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBaseAlgorithmExecution", "true");
            	    }
            	    // InternalPanoptesX.g:2371:19: (otherlv_17= 'actions' ( (lv_ActionExecutionMap_18_0= ruleactionExecutionEntry ) ) (otherlv_19= ',' ( (lv_ActionExecutionMap_20_0= ruleactionExecutionEntry ) ) )* )
            	    // InternalPanoptesX.g:2371:20: otherlv_17= 'actions' ( (lv_ActionExecutionMap_18_0= ruleactionExecutionEntry ) ) (otherlv_19= ',' ( (lv_ActionExecutionMap_20_0= ruleactionExecutionEntry ) ) )*
            	    {
            	    otherlv_17=(Token)match(input,47,FOLLOW_28); 

            	    									newLeafNode(otherlv_17, grammarAccess.getBaseAlgorithmExecutionAccess().getActionsKeyword_4_3_0());
            	    								
            	    // InternalPanoptesX.g:2375:9: ( (lv_ActionExecutionMap_18_0= ruleactionExecutionEntry ) )
            	    // InternalPanoptesX.g:2376:10: (lv_ActionExecutionMap_18_0= ruleactionExecutionEntry )
            	    {
            	    // InternalPanoptesX.g:2376:10: (lv_ActionExecutionMap_18_0= ruleactionExecutionEntry )
            	    // InternalPanoptesX.g:2377:11: lv_ActionExecutionMap_18_0= ruleactionExecutionEntry
            	    {

            	    											newCompositeNode(grammarAccess.getBaseAlgorithmExecutionAccess().getActionExecutionMapActionExecutionEntryParserRuleCall_4_3_1_0());
            	    										
            	    pushFollow(FOLLOW_39);
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

            	    // InternalPanoptesX.g:2394:9: (otherlv_19= ',' ( (lv_ActionExecutionMap_20_0= ruleactionExecutionEntry ) ) )*
            	    loop32:
            	    do {
            	        int alt32=2;
            	        int LA32_0 = input.LA(1);

            	        if ( (LA32_0==15) ) {
            	            alt32=1;
            	        }


            	        switch (alt32) {
            	    	case 1 :
            	    	    // InternalPanoptesX.g:2395:10: otherlv_19= ',' ( (lv_ActionExecutionMap_20_0= ruleactionExecutionEntry ) )
            	    	    {
            	    	    otherlv_19=(Token)match(input,15,FOLLOW_28); 

            	    	    										newLeafNode(otherlv_19, grammarAccess.getBaseAlgorithmExecutionAccess().getCommaKeyword_4_3_2_0());
            	    	    									
            	    	    // InternalPanoptesX.g:2399:10: ( (lv_ActionExecutionMap_20_0= ruleactionExecutionEntry ) )
            	    	    // InternalPanoptesX.g:2400:11: (lv_ActionExecutionMap_20_0= ruleactionExecutionEntry )
            	    	    {
            	    	    // InternalPanoptesX.g:2400:11: (lv_ActionExecutionMap_20_0= ruleactionExecutionEntry )
            	    	    // InternalPanoptesX.g:2401:12: lv_ActionExecutionMap_20_0= ruleactionExecutionEntry
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getBaseAlgorithmExecutionAccess().getActionExecutionMapActionExecutionEntryParserRuleCall_4_3_2_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_39);
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
            	    	    break loop32;
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
            	    // InternalPanoptesX.g:2425:4: ({...}? => ( ({...}? => (otherlv_21= 'parameter' otherlv_22= 'values' ( (lv_parameterValueMap_23_0= ruleparameterValueEntry ) ) (otherlv_24= ',' ( (lv_parameterValueMap_25_0= ruleparameterValueEntry ) ) )* ) ) ) )
            	    {
            	    // InternalPanoptesX.g:2425:4: ({...}? => ( ({...}? => (otherlv_21= 'parameter' otherlv_22= 'values' ( (lv_parameterValueMap_23_0= ruleparameterValueEntry ) ) (otherlv_24= ',' ( (lv_parameterValueMap_25_0= ruleparameterValueEntry ) ) )* ) ) ) )
            	    // InternalPanoptesX.g:2426:5: {...}? => ( ({...}? => (otherlv_21= 'parameter' otherlv_22= 'values' ( (lv_parameterValueMap_23_0= ruleparameterValueEntry ) ) (otherlv_24= ',' ( (lv_parameterValueMap_25_0= ruleparameterValueEntry ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBaseAlgorithmExecutionAccess().getUnorderedGroup_4(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleBaseAlgorithmExecution", "getUnorderedGroupHelper().canSelect(grammarAccess.getBaseAlgorithmExecutionAccess().getUnorderedGroup_4(), 4)");
            	    }
            	    // InternalPanoptesX.g:2426:119: ( ({...}? => (otherlv_21= 'parameter' otherlv_22= 'values' ( (lv_parameterValueMap_23_0= ruleparameterValueEntry ) ) (otherlv_24= ',' ( (lv_parameterValueMap_25_0= ruleparameterValueEntry ) ) )* ) ) )
            	    // InternalPanoptesX.g:2427:6: ({...}? => (otherlv_21= 'parameter' otherlv_22= 'values' ( (lv_parameterValueMap_23_0= ruleparameterValueEntry ) ) (otherlv_24= ',' ( (lv_parameterValueMap_25_0= ruleparameterValueEntry ) ) )* ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getBaseAlgorithmExecutionAccess().getUnorderedGroup_4(), 4);
            	    					
            	    // InternalPanoptesX.g:2430:9: ({...}? => (otherlv_21= 'parameter' otherlv_22= 'values' ( (lv_parameterValueMap_23_0= ruleparameterValueEntry ) ) (otherlv_24= ',' ( (lv_parameterValueMap_25_0= ruleparameterValueEntry ) ) )* ) )
            	    // InternalPanoptesX.g:2430:10: {...}? => (otherlv_21= 'parameter' otherlv_22= 'values' ( (lv_parameterValueMap_23_0= ruleparameterValueEntry ) ) (otherlv_24= ',' ( (lv_parameterValueMap_25_0= ruleparameterValueEntry ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBaseAlgorithmExecution", "true");
            	    }
            	    // InternalPanoptesX.g:2430:19: (otherlv_21= 'parameter' otherlv_22= 'values' ( (lv_parameterValueMap_23_0= ruleparameterValueEntry ) ) (otherlv_24= ',' ( (lv_parameterValueMap_25_0= ruleparameterValueEntry ) ) )* )
            	    // InternalPanoptesX.g:2430:20: otherlv_21= 'parameter' otherlv_22= 'values' ( (lv_parameterValueMap_23_0= ruleparameterValueEntry ) ) (otherlv_24= ',' ( (lv_parameterValueMap_25_0= ruleparameterValueEntry ) ) )*
            	    {
            	    otherlv_21=(Token)match(input,48,FOLLOW_40); 

            	    									newLeafNode(otherlv_21, grammarAccess.getBaseAlgorithmExecutionAccess().getParameterKeyword_4_4_0());
            	    								
            	    otherlv_22=(Token)match(input,49,FOLLOW_4); 

            	    									newLeafNode(otherlv_22, grammarAccess.getBaseAlgorithmExecutionAccess().getValuesKeyword_4_4_1());
            	    								
            	    // InternalPanoptesX.g:2438:9: ( (lv_parameterValueMap_23_0= ruleparameterValueEntry ) )
            	    // InternalPanoptesX.g:2439:10: (lv_parameterValueMap_23_0= ruleparameterValueEntry )
            	    {
            	    // InternalPanoptesX.g:2439:10: (lv_parameterValueMap_23_0= ruleparameterValueEntry )
            	    // InternalPanoptesX.g:2440:11: lv_parameterValueMap_23_0= ruleparameterValueEntry
            	    {

            	    											newCompositeNode(grammarAccess.getBaseAlgorithmExecutionAccess().getParameterValueMapParameterValueEntryParserRuleCall_4_4_2_0());
            	    										
            	    pushFollow(FOLLOW_39);
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

            	    // InternalPanoptesX.g:2457:9: (otherlv_24= ',' ( (lv_parameterValueMap_25_0= ruleparameterValueEntry ) ) )*
            	    loop33:
            	    do {
            	        int alt33=2;
            	        int LA33_0 = input.LA(1);

            	        if ( (LA33_0==15) ) {
            	            alt33=1;
            	        }


            	        switch (alt33) {
            	    	case 1 :
            	    	    // InternalPanoptesX.g:2458:10: otherlv_24= ',' ( (lv_parameterValueMap_25_0= ruleparameterValueEntry ) )
            	    	    {
            	    	    otherlv_24=(Token)match(input,15,FOLLOW_4); 

            	    	    										newLeafNode(otherlv_24, grammarAccess.getBaseAlgorithmExecutionAccess().getCommaKeyword_4_4_3_0());
            	    	    									
            	    	    // InternalPanoptesX.g:2462:10: ( (lv_parameterValueMap_25_0= ruleparameterValueEntry ) )
            	    	    // InternalPanoptesX.g:2463:11: (lv_parameterValueMap_25_0= ruleparameterValueEntry )
            	    	    {
            	    	    // InternalPanoptesX.g:2463:11: (lv_parameterValueMap_25_0= ruleparameterValueEntry )
            	    	    // InternalPanoptesX.g:2464:12: lv_parameterValueMap_25_0= ruleparameterValueEntry
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getBaseAlgorithmExecutionAccess().getParameterValueMapParameterValueEntryParserRuleCall_4_4_3_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_39);
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
            	    	    break loop33;
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
            	    if ( cnt34 >= 1 ) break loop34;
                        EarlyExitException eee =
                            new EarlyExitException(34, input);
                        throw eee;
                }
                cnt34++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getBaseAlgorithmExecutionAccess().getUnorderedGroup_4()) ) {
                throw new FailedPredicateException(input, "ruleBaseAlgorithmExecution", "getUnorderedGroupHelper().canLeave(grammarAccess.getBaseAlgorithmExecutionAccess().getUnorderedGroup_4())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getBaseAlgorithmExecutionAccess().getUnorderedGroup_4());
            				

            }

            otherlv_26=(Token)match(input,17,FOLLOW_2); 

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
    // InternalPanoptesX.g:2504:1: entryRuleHigherOrderAlgorithmExecution returns [EObject current=null] : iv_ruleHigherOrderAlgorithmExecution= ruleHigherOrderAlgorithmExecution EOF ;
    public final EObject entryRuleHigherOrderAlgorithmExecution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHigherOrderAlgorithmExecution = null;


        try {
            // InternalPanoptesX.g:2504:70: (iv_ruleHigherOrderAlgorithmExecution= ruleHigherOrderAlgorithmExecution EOF )
            // InternalPanoptesX.g:2505:2: iv_ruleHigherOrderAlgorithmExecution= ruleHigherOrderAlgorithmExecution EOF
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
    // InternalPanoptesX.g:2511:1: ruleHigherOrderAlgorithmExecution returns [EObject current=null] : ( () otherlv_1= 'HigherOrderAlgorithmExecution' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'algorithm' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'observed' otherlv_8= 'execution' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'actions' ( (lv_ActionExecutionMap_11_0= ruleactionExecutionEntry ) ) (otherlv_12= ',' ( (lv_ActionExecutionMap_13_0= ruleactionExecutionEntry ) ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_14= 'minimum' | otherlv_15= 'min' ) otherlv_16= 'observations' ( (lv_minDataPoints_17_0= ruleEIntegerObject ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_18= 'maximum' | otherlv_19= 'max' ) otherlv_20= 'observations' ( (lv_maxDataPoints_21_0= ruleEIntegerObject ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'parameter' otherlv_23= 'values' ( (lv_parameterValueMap_24_0= ruleparameterValueEntry ) ) (otherlv_25= ',' ( (lv_parameterValueMap_26_0= ruleparameterValueEntry ) ) )* ) ) ) ) )+ {...}?) ) ) otherlv_27= '}' ) ;
    public final EObject ruleHigherOrderAlgorithmExecution() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
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
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_ActionExecutionMap_11_0 = null;

        EObject lv_ActionExecutionMap_13_0 = null;

        AntlrDatatypeRuleToken lv_minDataPoints_17_0 = null;

        AntlrDatatypeRuleToken lv_maxDataPoints_21_0 = null;

        EObject lv_parameterValueMap_24_0 = null;

        EObject lv_parameterValueMap_26_0 = null;



        	enterRule();

        try {
            // InternalPanoptesX.g:2517:2: ( ( () otherlv_1= 'HigherOrderAlgorithmExecution' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'algorithm' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'observed' otherlv_8= 'execution' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'actions' ( (lv_ActionExecutionMap_11_0= ruleactionExecutionEntry ) ) (otherlv_12= ',' ( (lv_ActionExecutionMap_13_0= ruleactionExecutionEntry ) ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_14= 'minimum' | otherlv_15= 'min' ) otherlv_16= 'observations' ( (lv_minDataPoints_17_0= ruleEIntegerObject ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_18= 'maximum' | otherlv_19= 'max' ) otherlv_20= 'observations' ( (lv_maxDataPoints_21_0= ruleEIntegerObject ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'parameter' otherlv_23= 'values' ( (lv_parameterValueMap_24_0= ruleparameterValueEntry ) ) (otherlv_25= ',' ( (lv_parameterValueMap_26_0= ruleparameterValueEntry ) ) )* ) ) ) ) )+ {...}?) ) ) otherlv_27= '}' ) )
            // InternalPanoptesX.g:2518:2: ( () otherlv_1= 'HigherOrderAlgorithmExecution' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'algorithm' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'observed' otherlv_8= 'execution' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'actions' ( (lv_ActionExecutionMap_11_0= ruleactionExecutionEntry ) ) (otherlv_12= ',' ( (lv_ActionExecutionMap_13_0= ruleactionExecutionEntry ) ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_14= 'minimum' | otherlv_15= 'min' ) otherlv_16= 'observations' ( (lv_minDataPoints_17_0= ruleEIntegerObject ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_18= 'maximum' | otherlv_19= 'max' ) otherlv_20= 'observations' ( (lv_maxDataPoints_21_0= ruleEIntegerObject ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'parameter' otherlv_23= 'values' ( (lv_parameterValueMap_24_0= ruleparameterValueEntry ) ) (otherlv_25= ',' ( (lv_parameterValueMap_26_0= ruleparameterValueEntry ) ) )* ) ) ) ) )+ {...}?) ) ) otherlv_27= '}' )
            {
            // InternalPanoptesX.g:2518:2: ( () otherlv_1= 'HigherOrderAlgorithmExecution' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'algorithm' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'observed' otherlv_8= 'execution' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'actions' ( (lv_ActionExecutionMap_11_0= ruleactionExecutionEntry ) ) (otherlv_12= ',' ( (lv_ActionExecutionMap_13_0= ruleactionExecutionEntry ) ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_14= 'minimum' | otherlv_15= 'min' ) otherlv_16= 'observations' ( (lv_minDataPoints_17_0= ruleEIntegerObject ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_18= 'maximum' | otherlv_19= 'max' ) otherlv_20= 'observations' ( (lv_maxDataPoints_21_0= ruleEIntegerObject ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'parameter' otherlv_23= 'values' ( (lv_parameterValueMap_24_0= ruleparameterValueEntry ) ) (otherlv_25= ',' ( (lv_parameterValueMap_26_0= ruleparameterValueEntry ) ) )* ) ) ) ) )+ {...}?) ) ) otherlv_27= '}' )
            // InternalPanoptesX.g:2519:3: () otherlv_1= 'HigherOrderAlgorithmExecution' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'algorithm' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'observed' otherlv_8= 'execution' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'actions' ( (lv_ActionExecutionMap_11_0= ruleactionExecutionEntry ) ) (otherlv_12= ',' ( (lv_ActionExecutionMap_13_0= ruleactionExecutionEntry ) ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_14= 'minimum' | otherlv_15= 'min' ) otherlv_16= 'observations' ( (lv_minDataPoints_17_0= ruleEIntegerObject ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_18= 'maximum' | otherlv_19= 'max' ) otherlv_20= 'observations' ( (lv_maxDataPoints_21_0= ruleEIntegerObject ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'parameter' otherlv_23= 'values' ( (lv_parameterValueMap_24_0= ruleparameterValueEntry ) ) (otherlv_25= ',' ( (lv_parameterValueMap_26_0= ruleparameterValueEntry ) ) )* ) ) ) ) )+ {...}?) ) ) otherlv_27= '}'
            {
            // InternalPanoptesX.g:2519:3: ()
            // InternalPanoptesX.g:2520:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getHigherOrderAlgorithmExecutionAccess().getHigherOrderAlgorithmExecutionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,50,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getHigherOrderAlgorithmExecutionAccess().getHigherOrderAlgorithmExecutionKeyword_1());
            		
            // InternalPanoptesX.g:2530:3: ( (lv_name_2_0= ruleEString ) )
            // InternalPanoptesX.g:2531:4: (lv_name_2_0= ruleEString )
            {
            // InternalPanoptesX.g:2531:4: (lv_name_2_0= ruleEString )
            // InternalPanoptesX.g:2532:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHigherOrderAlgorithmExecutionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.lowcomote.panoptes.PanoptesX.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_41); 

            			newLeafNode(otherlv_3, grammarAccess.getHigherOrderAlgorithmExecutionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalPanoptesX.g:2553:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'algorithm' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'observed' otherlv_8= 'execution' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'actions' ( (lv_ActionExecutionMap_11_0= ruleactionExecutionEntry ) ) (otherlv_12= ',' ( (lv_ActionExecutionMap_13_0= ruleactionExecutionEntry ) ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_14= 'minimum' | otherlv_15= 'min' ) otherlv_16= 'observations' ( (lv_minDataPoints_17_0= ruleEIntegerObject ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_18= 'maximum' | otherlv_19= 'max' ) otherlv_20= 'observations' ( (lv_maxDataPoints_21_0= ruleEIntegerObject ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'parameter' otherlv_23= 'values' ( (lv_parameterValueMap_24_0= ruleparameterValueEntry ) ) (otherlv_25= ',' ( (lv_parameterValueMap_26_0= ruleparameterValueEntry ) ) )* ) ) ) ) )+ {...}?) ) )
            // InternalPanoptesX.g:2554:4: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'algorithm' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'observed' otherlv_8= 'execution' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'actions' ( (lv_ActionExecutionMap_11_0= ruleactionExecutionEntry ) ) (otherlv_12= ',' ( (lv_ActionExecutionMap_13_0= ruleactionExecutionEntry ) ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_14= 'minimum' | otherlv_15= 'min' ) otherlv_16= 'observations' ( (lv_minDataPoints_17_0= ruleEIntegerObject ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_18= 'maximum' | otherlv_19= 'max' ) otherlv_20= 'observations' ( (lv_maxDataPoints_21_0= ruleEIntegerObject ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'parameter' otherlv_23= 'values' ( (lv_parameterValueMap_24_0= ruleparameterValueEntry ) ) (otherlv_25= ',' ( (lv_parameterValueMap_26_0= ruleparameterValueEntry ) ) )* ) ) ) ) )+ {...}?) )
            {
            // InternalPanoptesX.g:2554:4: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'algorithm' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'observed' otherlv_8= 'execution' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'actions' ( (lv_ActionExecutionMap_11_0= ruleactionExecutionEntry ) ) (otherlv_12= ',' ( (lv_ActionExecutionMap_13_0= ruleactionExecutionEntry ) ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_14= 'minimum' | otherlv_15= 'min' ) otherlv_16= 'observations' ( (lv_minDataPoints_17_0= ruleEIntegerObject ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_18= 'maximum' | otherlv_19= 'max' ) otherlv_20= 'observations' ( (lv_maxDataPoints_21_0= ruleEIntegerObject ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'parameter' otherlv_23= 'values' ( (lv_parameterValueMap_24_0= ruleparameterValueEntry ) ) (otherlv_25= ',' ( (lv_parameterValueMap_26_0= ruleparameterValueEntry ) ) )* ) ) ) ) )+ {...}?) )
            // InternalPanoptesX.g:2555:5: ( ( ({...}? => ( ({...}? => (otherlv_5= 'algorithm' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'observed' otherlv_8= 'execution' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'actions' ( (lv_ActionExecutionMap_11_0= ruleactionExecutionEntry ) ) (otherlv_12= ',' ( (lv_ActionExecutionMap_13_0= ruleactionExecutionEntry ) ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_14= 'minimum' | otherlv_15= 'min' ) otherlv_16= 'observations' ( (lv_minDataPoints_17_0= ruleEIntegerObject ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_18= 'maximum' | otherlv_19= 'max' ) otherlv_20= 'observations' ( (lv_maxDataPoints_21_0= ruleEIntegerObject ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'parameter' otherlv_23= 'values' ( (lv_parameterValueMap_24_0= ruleparameterValueEntry ) ) (otherlv_25= ',' ( (lv_parameterValueMap_26_0= ruleparameterValueEntry ) ) )* ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getUnorderedGroup_4());
            				
            // InternalPanoptesX.g:2558:5: ( ( ({...}? => ( ({...}? => (otherlv_5= 'algorithm' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'observed' otherlv_8= 'execution' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'actions' ( (lv_ActionExecutionMap_11_0= ruleactionExecutionEntry ) ) (otherlv_12= ',' ( (lv_ActionExecutionMap_13_0= ruleactionExecutionEntry ) ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_14= 'minimum' | otherlv_15= 'min' ) otherlv_16= 'observations' ( (lv_minDataPoints_17_0= ruleEIntegerObject ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_18= 'maximum' | otherlv_19= 'max' ) otherlv_20= 'observations' ( (lv_maxDataPoints_21_0= ruleEIntegerObject ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'parameter' otherlv_23= 'values' ( (lv_parameterValueMap_24_0= ruleparameterValueEntry ) ) (otherlv_25= ',' ( (lv_parameterValueMap_26_0= ruleparameterValueEntry ) ) )* ) ) ) ) )+ {...}?)
            // InternalPanoptesX.g:2559:6: ( ({...}? => ( ({...}? => (otherlv_5= 'algorithm' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'observed' otherlv_8= 'execution' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'actions' ( (lv_ActionExecutionMap_11_0= ruleactionExecutionEntry ) ) (otherlv_12= ',' ( (lv_ActionExecutionMap_13_0= ruleactionExecutionEntry ) ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_14= 'minimum' | otherlv_15= 'min' ) otherlv_16= 'observations' ( (lv_minDataPoints_17_0= ruleEIntegerObject ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_18= 'maximum' | otherlv_19= 'max' ) otherlv_20= 'observations' ( (lv_maxDataPoints_21_0= ruleEIntegerObject ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'parameter' otherlv_23= 'values' ( (lv_parameterValueMap_24_0= ruleparameterValueEntry ) ) (otherlv_25= ',' ( (lv_parameterValueMap_26_0= ruleparameterValueEntry ) ) )* ) ) ) ) )+ {...}?
            {
            // InternalPanoptesX.g:2559:6: ( ({...}? => ( ({...}? => (otherlv_5= 'algorithm' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'observed' otherlv_8= 'execution' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'actions' ( (lv_ActionExecutionMap_11_0= ruleactionExecutionEntry ) ) (otherlv_12= ',' ( (lv_ActionExecutionMap_13_0= ruleactionExecutionEntry ) ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_14= 'minimum' | otherlv_15= 'min' ) otherlv_16= 'observations' ( (lv_minDataPoints_17_0= ruleEIntegerObject ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_18= 'maximum' | otherlv_19= 'max' ) otherlv_20= 'observations' ( (lv_maxDataPoints_21_0= ruleEIntegerObject ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'parameter' otherlv_23= 'values' ( (lv_parameterValueMap_24_0= ruleparameterValueEntry ) ) (otherlv_25= ',' ( (lv_parameterValueMap_26_0= ruleparameterValueEntry ) ) )* ) ) ) ) )+
            int cnt39=0;
            loop39:
            do {
                int alt39=7;
                int LA39_0 = input.LA(1);

                if ( LA39_0 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getUnorderedGroup_4(), 0) ) {
                    alt39=1;
                }
                else if ( LA39_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getUnorderedGroup_4(), 1) ) {
                    alt39=2;
                }
                else if ( LA39_0 == 47 && getUnorderedGroupHelper().canSelect(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getUnorderedGroup_4(), 2) ) {
                    alt39=3;
                }
                else if ( LA39_0 >= 53 && LA39_0 <= 54 && getUnorderedGroupHelper().canSelect(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getUnorderedGroup_4(), 3) ) {
                    alt39=4;
                }
                else if ( LA39_0 >= 56 && LA39_0 <= 57 && getUnorderedGroupHelper().canSelect(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getUnorderedGroup_4(), 4) ) {
                    alt39=5;
                }
                else if ( LA39_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getUnorderedGroup_4(), 5) ) {
                    alt39=6;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalPanoptesX.g:2560:4: ({...}? => ( ({...}? => (otherlv_5= 'algorithm' ( ( ruleEString ) ) ) ) ) )
            	    {
            	    // InternalPanoptesX.g:2560:4: ({...}? => ( ({...}? => (otherlv_5= 'algorithm' ( ( ruleEString ) ) ) ) ) )
            	    // InternalPanoptesX.g:2561:5: {...}? => ( ({...}? => (otherlv_5= 'algorithm' ( ( ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getUnorderedGroup_4(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleHigherOrderAlgorithmExecution", "getUnorderedGroupHelper().canSelect(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // InternalPanoptesX.g:2561:126: ( ({...}? => (otherlv_5= 'algorithm' ( ( ruleEString ) ) ) ) )
            	    // InternalPanoptesX.g:2562:6: ({...}? => (otherlv_5= 'algorithm' ( ( ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getUnorderedGroup_4(), 0);
            	    					
            	    // InternalPanoptesX.g:2565:9: ({...}? => (otherlv_5= 'algorithm' ( ( ruleEString ) ) ) )
            	    // InternalPanoptesX.g:2565:10: {...}? => (otherlv_5= 'algorithm' ( ( ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleHigherOrderAlgorithmExecution", "true");
            	    }
            	    // InternalPanoptesX.g:2565:19: (otherlv_5= 'algorithm' ( ( ruleEString ) ) )
            	    // InternalPanoptesX.g:2565:20: otherlv_5= 'algorithm' ( ( ruleEString ) )
            	    {
            	    otherlv_5=(Token)match(input,44,FOLLOW_4); 

            	    									newLeafNode(otherlv_5, grammarAccess.getHigherOrderAlgorithmExecutionAccess().getAlgorithmKeyword_4_0_0());
            	    								
            	    // InternalPanoptesX.g:2569:9: ( ( ruleEString ) )
            	    // InternalPanoptesX.g:2570:10: ( ruleEString )
            	    {
            	    // InternalPanoptesX.g:2570:10: ( ruleEString )
            	    // InternalPanoptesX.g:2571:11: ruleEString
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getHigherOrderAlgorithmExecutionRule());
            	    											}
            	    										

            	    											newCompositeNode(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getAlgorithmHigherOrderAlgorithmCrossReference_4_0_1_0());
            	    										
            	    pushFollow(FOLLOW_42);
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
            	    // InternalPanoptesX.g:2591:4: ({...}? => ( ({...}? => (otherlv_7= 'observed' otherlv_8= 'execution' ( ( ruleEString ) ) ) ) ) )
            	    {
            	    // InternalPanoptesX.g:2591:4: ({...}? => ( ({...}? => (otherlv_7= 'observed' otherlv_8= 'execution' ( ( ruleEString ) ) ) ) ) )
            	    // InternalPanoptesX.g:2592:5: {...}? => ( ({...}? => (otherlv_7= 'observed' otherlv_8= 'execution' ( ( ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getUnorderedGroup_4(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleHigherOrderAlgorithmExecution", "getUnorderedGroupHelper().canSelect(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // InternalPanoptesX.g:2592:126: ( ({...}? => (otherlv_7= 'observed' otherlv_8= 'execution' ( ( ruleEString ) ) ) ) )
            	    // InternalPanoptesX.g:2593:6: ({...}? => (otherlv_7= 'observed' otherlv_8= 'execution' ( ( ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getUnorderedGroup_4(), 1);
            	    					
            	    // InternalPanoptesX.g:2596:9: ({...}? => (otherlv_7= 'observed' otherlv_8= 'execution' ( ( ruleEString ) ) ) )
            	    // InternalPanoptesX.g:2596:10: {...}? => (otherlv_7= 'observed' otherlv_8= 'execution' ( ( ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleHigherOrderAlgorithmExecution", "true");
            	    }
            	    // InternalPanoptesX.g:2596:19: (otherlv_7= 'observed' otherlv_8= 'execution' ( ( ruleEString ) ) )
            	    // InternalPanoptesX.g:2596:20: otherlv_7= 'observed' otherlv_8= 'execution' ( ( ruleEString ) )
            	    {
            	    otherlv_7=(Token)match(input,51,FOLLOW_43); 

            	    									newLeafNode(otherlv_7, grammarAccess.getHigherOrderAlgorithmExecutionAccess().getObservedKeyword_4_1_0());
            	    								
            	    otherlv_8=(Token)match(input,52,FOLLOW_4); 

            	    									newLeafNode(otherlv_8, grammarAccess.getHigherOrderAlgorithmExecutionAccess().getExecutionKeyword_4_1_1());
            	    								
            	    // InternalPanoptesX.g:2604:9: ( ( ruleEString ) )
            	    // InternalPanoptesX.g:2605:10: ( ruleEString )
            	    {
            	    // InternalPanoptesX.g:2605:10: ( ruleEString )
            	    // InternalPanoptesX.g:2606:11: ruleEString
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getHigherOrderAlgorithmExecutionRule());
            	    											}
            	    										

            	    											newCompositeNode(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getAlgorithmExecutionAlgorithmExecutionCrossReference_4_1_2_0());
            	    										
            	    pushFollow(FOLLOW_42);
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
            	    // InternalPanoptesX.g:2626:4: ({...}? => ( ({...}? => (otherlv_10= 'actions' ( (lv_ActionExecutionMap_11_0= ruleactionExecutionEntry ) ) (otherlv_12= ',' ( (lv_ActionExecutionMap_13_0= ruleactionExecutionEntry ) ) )* ) ) ) )
            	    {
            	    // InternalPanoptesX.g:2626:4: ({...}? => ( ({...}? => (otherlv_10= 'actions' ( (lv_ActionExecutionMap_11_0= ruleactionExecutionEntry ) ) (otherlv_12= ',' ( (lv_ActionExecutionMap_13_0= ruleactionExecutionEntry ) ) )* ) ) ) )
            	    // InternalPanoptesX.g:2627:5: {...}? => ( ({...}? => (otherlv_10= 'actions' ( (lv_ActionExecutionMap_11_0= ruleactionExecutionEntry ) ) (otherlv_12= ',' ( (lv_ActionExecutionMap_13_0= ruleactionExecutionEntry ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getUnorderedGroup_4(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleHigherOrderAlgorithmExecution", "getUnorderedGroupHelper().canSelect(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getUnorderedGroup_4(), 2)");
            	    }
            	    // InternalPanoptesX.g:2627:126: ( ({...}? => (otherlv_10= 'actions' ( (lv_ActionExecutionMap_11_0= ruleactionExecutionEntry ) ) (otherlv_12= ',' ( (lv_ActionExecutionMap_13_0= ruleactionExecutionEntry ) ) )* ) ) )
            	    // InternalPanoptesX.g:2628:6: ({...}? => (otherlv_10= 'actions' ( (lv_ActionExecutionMap_11_0= ruleactionExecutionEntry ) ) (otherlv_12= ',' ( (lv_ActionExecutionMap_13_0= ruleactionExecutionEntry ) ) )* ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getUnorderedGroup_4(), 2);
            	    					
            	    // InternalPanoptesX.g:2631:9: ({...}? => (otherlv_10= 'actions' ( (lv_ActionExecutionMap_11_0= ruleactionExecutionEntry ) ) (otherlv_12= ',' ( (lv_ActionExecutionMap_13_0= ruleactionExecutionEntry ) ) )* ) )
            	    // InternalPanoptesX.g:2631:10: {...}? => (otherlv_10= 'actions' ( (lv_ActionExecutionMap_11_0= ruleactionExecutionEntry ) ) (otherlv_12= ',' ( (lv_ActionExecutionMap_13_0= ruleactionExecutionEntry ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleHigherOrderAlgorithmExecution", "true");
            	    }
            	    // InternalPanoptesX.g:2631:19: (otherlv_10= 'actions' ( (lv_ActionExecutionMap_11_0= ruleactionExecutionEntry ) ) (otherlv_12= ',' ( (lv_ActionExecutionMap_13_0= ruleactionExecutionEntry ) ) )* )
            	    // InternalPanoptesX.g:2631:20: otherlv_10= 'actions' ( (lv_ActionExecutionMap_11_0= ruleactionExecutionEntry ) ) (otherlv_12= ',' ( (lv_ActionExecutionMap_13_0= ruleactionExecutionEntry ) ) )*
            	    {
            	    otherlv_10=(Token)match(input,47,FOLLOW_28); 

            	    									newLeafNode(otherlv_10, grammarAccess.getHigherOrderAlgorithmExecutionAccess().getActionsKeyword_4_2_0());
            	    								
            	    // InternalPanoptesX.g:2635:9: ( (lv_ActionExecutionMap_11_0= ruleactionExecutionEntry ) )
            	    // InternalPanoptesX.g:2636:10: (lv_ActionExecutionMap_11_0= ruleactionExecutionEntry )
            	    {
            	    // InternalPanoptesX.g:2636:10: (lv_ActionExecutionMap_11_0= ruleactionExecutionEntry )
            	    // InternalPanoptesX.g:2637:11: lv_ActionExecutionMap_11_0= ruleactionExecutionEntry
            	    {

            	    											newCompositeNode(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getActionExecutionMapActionExecutionEntryParserRuleCall_4_2_1_0());
            	    										
            	    pushFollow(FOLLOW_44);
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

            	    // InternalPanoptesX.g:2654:9: (otherlv_12= ',' ( (lv_ActionExecutionMap_13_0= ruleactionExecutionEntry ) ) )*
            	    loop35:
            	    do {
            	        int alt35=2;
            	        int LA35_0 = input.LA(1);

            	        if ( (LA35_0==15) ) {
            	            alt35=1;
            	        }


            	        switch (alt35) {
            	    	case 1 :
            	    	    // InternalPanoptesX.g:2655:10: otherlv_12= ',' ( (lv_ActionExecutionMap_13_0= ruleactionExecutionEntry ) )
            	    	    {
            	    	    otherlv_12=(Token)match(input,15,FOLLOW_28); 

            	    	    										newLeafNode(otherlv_12, grammarAccess.getHigherOrderAlgorithmExecutionAccess().getCommaKeyword_4_2_2_0());
            	    	    									
            	    	    // InternalPanoptesX.g:2659:10: ( (lv_ActionExecutionMap_13_0= ruleactionExecutionEntry ) )
            	    	    // InternalPanoptesX.g:2660:11: (lv_ActionExecutionMap_13_0= ruleactionExecutionEntry )
            	    	    {
            	    	    // InternalPanoptesX.g:2660:11: (lv_ActionExecutionMap_13_0= ruleactionExecutionEntry )
            	    	    // InternalPanoptesX.g:2661:12: lv_ActionExecutionMap_13_0= ruleactionExecutionEntry
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getActionExecutionMapActionExecutionEntryParserRuleCall_4_2_2_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_44);
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
            	    	    break loop35;
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
            	    // InternalPanoptesX.g:2685:4: ({...}? => ( ({...}? => ( (otherlv_14= 'minimum' | otherlv_15= 'min' ) otherlv_16= 'observations' ( (lv_minDataPoints_17_0= ruleEIntegerObject ) ) ) ) ) )
            	    {
            	    // InternalPanoptesX.g:2685:4: ({...}? => ( ({...}? => ( (otherlv_14= 'minimum' | otherlv_15= 'min' ) otherlv_16= 'observations' ( (lv_minDataPoints_17_0= ruleEIntegerObject ) ) ) ) ) )
            	    // InternalPanoptesX.g:2686:5: {...}? => ( ({...}? => ( (otherlv_14= 'minimum' | otherlv_15= 'min' ) otherlv_16= 'observations' ( (lv_minDataPoints_17_0= ruleEIntegerObject ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getUnorderedGroup_4(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleHigherOrderAlgorithmExecution", "getUnorderedGroupHelper().canSelect(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getUnorderedGroup_4(), 3)");
            	    }
            	    // InternalPanoptesX.g:2686:126: ( ({...}? => ( (otherlv_14= 'minimum' | otherlv_15= 'min' ) otherlv_16= 'observations' ( (lv_minDataPoints_17_0= ruleEIntegerObject ) ) ) ) )
            	    // InternalPanoptesX.g:2687:6: ({...}? => ( (otherlv_14= 'minimum' | otherlv_15= 'min' ) otherlv_16= 'observations' ( (lv_minDataPoints_17_0= ruleEIntegerObject ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getUnorderedGroup_4(), 3);
            	    					
            	    // InternalPanoptesX.g:2690:9: ({...}? => ( (otherlv_14= 'minimum' | otherlv_15= 'min' ) otherlv_16= 'observations' ( (lv_minDataPoints_17_0= ruleEIntegerObject ) ) ) )
            	    // InternalPanoptesX.g:2690:10: {...}? => ( (otherlv_14= 'minimum' | otherlv_15= 'min' ) otherlv_16= 'observations' ( (lv_minDataPoints_17_0= ruleEIntegerObject ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleHigherOrderAlgorithmExecution", "true");
            	    }
            	    // InternalPanoptesX.g:2690:19: ( (otherlv_14= 'minimum' | otherlv_15= 'min' ) otherlv_16= 'observations' ( (lv_minDataPoints_17_0= ruleEIntegerObject ) ) )
            	    // InternalPanoptesX.g:2690:20: (otherlv_14= 'minimum' | otherlv_15= 'min' ) otherlv_16= 'observations' ( (lv_minDataPoints_17_0= ruleEIntegerObject ) )
            	    {
            	    // InternalPanoptesX.g:2690:20: (otherlv_14= 'minimum' | otherlv_15= 'min' )
            	    int alt36=2;
            	    int LA36_0 = input.LA(1);

            	    if ( (LA36_0==53) ) {
            	        alt36=1;
            	    }
            	    else if ( (LA36_0==54) ) {
            	        alt36=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 36, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt36) {
            	        case 1 :
            	            // InternalPanoptesX.g:2691:10: otherlv_14= 'minimum'
            	            {
            	            otherlv_14=(Token)match(input,53,FOLLOW_45); 

            	            										newLeafNode(otherlv_14, grammarAccess.getHigherOrderAlgorithmExecutionAccess().getMinimumKeyword_4_3_0_0());
            	            									

            	            }
            	            break;
            	        case 2 :
            	            // InternalPanoptesX.g:2696:10: otherlv_15= 'min'
            	            {
            	            otherlv_15=(Token)match(input,54,FOLLOW_45); 

            	            										newLeafNode(otherlv_15, grammarAccess.getHigherOrderAlgorithmExecutionAccess().getMinKeyword_4_3_0_1());
            	            									

            	            }
            	            break;

            	    }

            	    otherlv_16=(Token)match(input,55,FOLLOW_28); 

            	    									newLeafNode(otherlv_16, grammarAccess.getHigherOrderAlgorithmExecutionAccess().getObservationsKeyword_4_3_1());
            	    								
            	    // InternalPanoptesX.g:2705:9: ( (lv_minDataPoints_17_0= ruleEIntegerObject ) )
            	    // InternalPanoptesX.g:2706:10: (lv_minDataPoints_17_0= ruleEIntegerObject )
            	    {
            	    // InternalPanoptesX.g:2706:10: (lv_minDataPoints_17_0= ruleEIntegerObject )
            	    // InternalPanoptesX.g:2707:11: lv_minDataPoints_17_0= ruleEIntegerObject
            	    {

            	    											newCompositeNode(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getMinDataPointsEIntegerObjectParserRuleCall_4_3_2_0());
            	    										
            	    pushFollow(FOLLOW_42);
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
            	    // InternalPanoptesX.g:2730:4: ({...}? => ( ({...}? => ( (otherlv_18= 'maximum' | otherlv_19= 'max' ) otherlv_20= 'observations' ( (lv_maxDataPoints_21_0= ruleEIntegerObject ) ) ) ) ) )
            	    {
            	    // InternalPanoptesX.g:2730:4: ({...}? => ( ({...}? => ( (otherlv_18= 'maximum' | otherlv_19= 'max' ) otherlv_20= 'observations' ( (lv_maxDataPoints_21_0= ruleEIntegerObject ) ) ) ) ) )
            	    // InternalPanoptesX.g:2731:5: {...}? => ( ({...}? => ( (otherlv_18= 'maximum' | otherlv_19= 'max' ) otherlv_20= 'observations' ( (lv_maxDataPoints_21_0= ruleEIntegerObject ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getUnorderedGroup_4(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleHigherOrderAlgorithmExecution", "getUnorderedGroupHelper().canSelect(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getUnorderedGroup_4(), 4)");
            	    }
            	    // InternalPanoptesX.g:2731:126: ( ({...}? => ( (otherlv_18= 'maximum' | otherlv_19= 'max' ) otherlv_20= 'observations' ( (lv_maxDataPoints_21_0= ruleEIntegerObject ) ) ) ) )
            	    // InternalPanoptesX.g:2732:6: ({...}? => ( (otherlv_18= 'maximum' | otherlv_19= 'max' ) otherlv_20= 'observations' ( (lv_maxDataPoints_21_0= ruleEIntegerObject ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getUnorderedGroup_4(), 4);
            	    					
            	    // InternalPanoptesX.g:2735:9: ({...}? => ( (otherlv_18= 'maximum' | otherlv_19= 'max' ) otherlv_20= 'observations' ( (lv_maxDataPoints_21_0= ruleEIntegerObject ) ) ) )
            	    // InternalPanoptesX.g:2735:10: {...}? => ( (otherlv_18= 'maximum' | otherlv_19= 'max' ) otherlv_20= 'observations' ( (lv_maxDataPoints_21_0= ruleEIntegerObject ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleHigherOrderAlgorithmExecution", "true");
            	    }
            	    // InternalPanoptesX.g:2735:19: ( (otherlv_18= 'maximum' | otherlv_19= 'max' ) otherlv_20= 'observations' ( (lv_maxDataPoints_21_0= ruleEIntegerObject ) ) )
            	    // InternalPanoptesX.g:2735:20: (otherlv_18= 'maximum' | otherlv_19= 'max' ) otherlv_20= 'observations' ( (lv_maxDataPoints_21_0= ruleEIntegerObject ) )
            	    {
            	    // InternalPanoptesX.g:2735:20: (otherlv_18= 'maximum' | otherlv_19= 'max' )
            	    int alt37=2;
            	    int LA37_0 = input.LA(1);

            	    if ( (LA37_0==56) ) {
            	        alt37=1;
            	    }
            	    else if ( (LA37_0==57) ) {
            	        alt37=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 37, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt37) {
            	        case 1 :
            	            // InternalPanoptesX.g:2736:10: otherlv_18= 'maximum'
            	            {
            	            otherlv_18=(Token)match(input,56,FOLLOW_45); 

            	            										newLeafNode(otherlv_18, grammarAccess.getHigherOrderAlgorithmExecutionAccess().getMaximumKeyword_4_4_0_0());
            	            									

            	            }
            	            break;
            	        case 2 :
            	            // InternalPanoptesX.g:2741:10: otherlv_19= 'max'
            	            {
            	            otherlv_19=(Token)match(input,57,FOLLOW_45); 

            	            										newLeafNode(otherlv_19, grammarAccess.getHigherOrderAlgorithmExecutionAccess().getMaxKeyword_4_4_0_1());
            	            									

            	            }
            	            break;

            	    }

            	    otherlv_20=(Token)match(input,55,FOLLOW_28); 

            	    									newLeafNode(otherlv_20, grammarAccess.getHigherOrderAlgorithmExecutionAccess().getObservationsKeyword_4_4_1());
            	    								
            	    // InternalPanoptesX.g:2750:9: ( (lv_maxDataPoints_21_0= ruleEIntegerObject ) )
            	    // InternalPanoptesX.g:2751:10: (lv_maxDataPoints_21_0= ruleEIntegerObject )
            	    {
            	    // InternalPanoptesX.g:2751:10: (lv_maxDataPoints_21_0= ruleEIntegerObject )
            	    // InternalPanoptesX.g:2752:11: lv_maxDataPoints_21_0= ruleEIntegerObject
            	    {

            	    											newCompositeNode(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getMaxDataPointsEIntegerObjectParserRuleCall_4_4_2_0());
            	    										
            	    pushFollow(FOLLOW_42);
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
            	    // InternalPanoptesX.g:2775:4: ({...}? => ( ({...}? => (otherlv_22= 'parameter' otherlv_23= 'values' ( (lv_parameterValueMap_24_0= ruleparameterValueEntry ) ) (otherlv_25= ',' ( (lv_parameterValueMap_26_0= ruleparameterValueEntry ) ) )* ) ) ) )
            	    {
            	    // InternalPanoptesX.g:2775:4: ({...}? => ( ({...}? => (otherlv_22= 'parameter' otherlv_23= 'values' ( (lv_parameterValueMap_24_0= ruleparameterValueEntry ) ) (otherlv_25= ',' ( (lv_parameterValueMap_26_0= ruleparameterValueEntry ) ) )* ) ) ) )
            	    // InternalPanoptesX.g:2776:5: {...}? => ( ({...}? => (otherlv_22= 'parameter' otherlv_23= 'values' ( (lv_parameterValueMap_24_0= ruleparameterValueEntry ) ) (otherlv_25= ',' ( (lv_parameterValueMap_26_0= ruleparameterValueEntry ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getUnorderedGroup_4(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleHigherOrderAlgorithmExecution", "getUnorderedGroupHelper().canSelect(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getUnorderedGroup_4(), 5)");
            	    }
            	    // InternalPanoptesX.g:2776:126: ( ({...}? => (otherlv_22= 'parameter' otherlv_23= 'values' ( (lv_parameterValueMap_24_0= ruleparameterValueEntry ) ) (otherlv_25= ',' ( (lv_parameterValueMap_26_0= ruleparameterValueEntry ) ) )* ) ) )
            	    // InternalPanoptesX.g:2777:6: ({...}? => (otherlv_22= 'parameter' otherlv_23= 'values' ( (lv_parameterValueMap_24_0= ruleparameterValueEntry ) ) (otherlv_25= ',' ( (lv_parameterValueMap_26_0= ruleparameterValueEntry ) ) )* ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getUnorderedGroup_4(), 5);
            	    					
            	    // InternalPanoptesX.g:2780:9: ({...}? => (otherlv_22= 'parameter' otherlv_23= 'values' ( (lv_parameterValueMap_24_0= ruleparameterValueEntry ) ) (otherlv_25= ',' ( (lv_parameterValueMap_26_0= ruleparameterValueEntry ) ) )* ) )
            	    // InternalPanoptesX.g:2780:10: {...}? => (otherlv_22= 'parameter' otherlv_23= 'values' ( (lv_parameterValueMap_24_0= ruleparameterValueEntry ) ) (otherlv_25= ',' ( (lv_parameterValueMap_26_0= ruleparameterValueEntry ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleHigherOrderAlgorithmExecution", "true");
            	    }
            	    // InternalPanoptesX.g:2780:19: (otherlv_22= 'parameter' otherlv_23= 'values' ( (lv_parameterValueMap_24_0= ruleparameterValueEntry ) ) (otherlv_25= ',' ( (lv_parameterValueMap_26_0= ruleparameterValueEntry ) ) )* )
            	    // InternalPanoptesX.g:2780:20: otherlv_22= 'parameter' otherlv_23= 'values' ( (lv_parameterValueMap_24_0= ruleparameterValueEntry ) ) (otherlv_25= ',' ( (lv_parameterValueMap_26_0= ruleparameterValueEntry ) ) )*
            	    {
            	    otherlv_22=(Token)match(input,48,FOLLOW_40); 

            	    									newLeafNode(otherlv_22, grammarAccess.getHigherOrderAlgorithmExecutionAccess().getParameterKeyword_4_5_0());
            	    								
            	    otherlv_23=(Token)match(input,49,FOLLOW_4); 

            	    									newLeafNode(otherlv_23, grammarAccess.getHigherOrderAlgorithmExecutionAccess().getValuesKeyword_4_5_1());
            	    								
            	    // InternalPanoptesX.g:2788:9: ( (lv_parameterValueMap_24_0= ruleparameterValueEntry ) )
            	    // InternalPanoptesX.g:2789:10: (lv_parameterValueMap_24_0= ruleparameterValueEntry )
            	    {
            	    // InternalPanoptesX.g:2789:10: (lv_parameterValueMap_24_0= ruleparameterValueEntry )
            	    // InternalPanoptesX.g:2790:11: lv_parameterValueMap_24_0= ruleparameterValueEntry
            	    {

            	    											newCompositeNode(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getParameterValueMapParameterValueEntryParserRuleCall_4_5_2_0());
            	    										
            	    pushFollow(FOLLOW_44);
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

            	    // InternalPanoptesX.g:2807:9: (otherlv_25= ',' ( (lv_parameterValueMap_26_0= ruleparameterValueEntry ) ) )*
            	    loop38:
            	    do {
            	        int alt38=2;
            	        int LA38_0 = input.LA(1);

            	        if ( (LA38_0==15) ) {
            	            alt38=1;
            	        }


            	        switch (alt38) {
            	    	case 1 :
            	    	    // InternalPanoptesX.g:2808:10: otherlv_25= ',' ( (lv_parameterValueMap_26_0= ruleparameterValueEntry ) )
            	    	    {
            	    	    otherlv_25=(Token)match(input,15,FOLLOW_4); 

            	    	    										newLeafNode(otherlv_25, grammarAccess.getHigherOrderAlgorithmExecutionAccess().getCommaKeyword_4_5_3_0());
            	    	    									
            	    	    // InternalPanoptesX.g:2812:10: ( (lv_parameterValueMap_26_0= ruleparameterValueEntry ) )
            	    	    // InternalPanoptesX.g:2813:11: (lv_parameterValueMap_26_0= ruleparameterValueEntry )
            	    	    {
            	    	    // InternalPanoptesX.g:2813:11: (lv_parameterValueMap_26_0= ruleparameterValueEntry )
            	    	    // InternalPanoptesX.g:2814:12: lv_parameterValueMap_26_0= ruleparameterValueEntry
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getParameterValueMapParameterValueEntryParserRuleCall_4_5_3_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_44);
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
            	    	    break loop38;
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
            	    if ( cnt39 >= 1 ) break loop39;
                        EarlyExitException eee =
                            new EarlyExitException(39, input);
                        throw eee;
                }
                cnt39++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getUnorderedGroup_4()) ) {
                throw new FailedPredicateException(input, "ruleHigherOrderAlgorithmExecution", "getUnorderedGroupHelper().canLeave(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getUnorderedGroup_4())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getUnorderedGroup_4());
            				

            }

            otherlv_27=(Token)match(input,17,FOLLOW_2); 

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
    // InternalPanoptesX.g:2854:1: entryRuleactionExecutionEntry returns [EObject current=null] : iv_ruleactionExecutionEntry= ruleactionExecutionEntry EOF ;
    public final EObject entryRuleactionExecutionEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleactionExecutionEntry = null;


        try {
            // InternalPanoptesX.g:2854:61: (iv_ruleactionExecutionEntry= ruleactionExecutionEntry EOF )
            // InternalPanoptesX.g:2855:2: iv_ruleactionExecutionEntry= ruleactionExecutionEntry EOF
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
    // InternalPanoptesX.g:2861:1: ruleactionExecutionEntry returns [EObject current=null] : ( () ( (lv_key_1_0= ruleEIntegerObject ) ) otherlv_2= '->' ( ( ruleEString ) ) ) ;
    public final EObject ruleactionExecutionEntry() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_key_1_0 = null;



        	enterRule();

        try {
            // InternalPanoptesX.g:2867:2: ( ( () ( (lv_key_1_0= ruleEIntegerObject ) ) otherlv_2= '->' ( ( ruleEString ) ) ) )
            // InternalPanoptesX.g:2868:2: ( () ( (lv_key_1_0= ruleEIntegerObject ) ) otherlv_2= '->' ( ( ruleEString ) ) )
            {
            // InternalPanoptesX.g:2868:2: ( () ( (lv_key_1_0= ruleEIntegerObject ) ) otherlv_2= '->' ( ( ruleEString ) ) )
            // InternalPanoptesX.g:2869:3: () ( (lv_key_1_0= ruleEIntegerObject ) ) otherlv_2= '->' ( ( ruleEString ) )
            {
            // InternalPanoptesX.g:2869:3: ()
            // InternalPanoptesX.g:2870:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActionExecutionEntryAccess().getActionExecutionEntryAction_0(),
            					current);
            			

            }

            // InternalPanoptesX.g:2876:3: ( (lv_key_1_0= ruleEIntegerObject ) )
            // InternalPanoptesX.g:2877:4: (lv_key_1_0= ruleEIntegerObject )
            {
            // InternalPanoptesX.g:2877:4: (lv_key_1_0= ruleEIntegerObject )
            // InternalPanoptesX.g:2878:5: lv_key_1_0= ruleEIntegerObject
            {

            					newCompositeNode(grammarAccess.getActionExecutionEntryAccess().getKeyEIntegerObjectParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_46);
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

            otherlv_2=(Token)match(input,58,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getActionExecutionEntryAccess().getHyphenMinusGreaterThanSignKeyword_2());
            		
            // InternalPanoptesX.g:2899:3: ( ( ruleEString ) )
            // InternalPanoptesX.g:2900:4: ( ruleEString )
            {
            // InternalPanoptesX.g:2900:4: ( ruleEString )
            // InternalPanoptesX.g:2901:5: ruleEString
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
    // InternalPanoptesX.g:2919:1: entryRuleTriggerGroup returns [EObject current=null] : iv_ruleTriggerGroup= ruleTriggerGroup EOF ;
    public final EObject entryRuleTriggerGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTriggerGroup = null;


        try {
            // InternalPanoptesX.g:2919:53: (iv_ruleTriggerGroup= ruleTriggerGroup EOF )
            // InternalPanoptesX.g:2920:2: iv_ruleTriggerGroup= ruleTriggerGroup EOF
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
    // InternalPanoptesX.g:2926:1: ruleTriggerGroup returns [EObject current=null] : ( () otherlv_1= 'Trigger' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_compositeTriggers_4_0= ruleCompositeTrigger ) ) (otherlv_5= 'or' ( (lv_compositeTriggers_6_0= ruleCompositeTrigger ) ) )* otherlv_7= 'execute' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= '}' ) ;
    public final EObject ruleTriggerGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_compositeTriggers_4_0 = null;

        EObject lv_compositeTriggers_6_0 = null;



        	enterRule();

        try {
            // InternalPanoptesX.g:2932:2: ( ( () otherlv_1= 'Trigger' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_compositeTriggers_4_0= ruleCompositeTrigger ) ) (otherlv_5= 'or' ( (lv_compositeTriggers_6_0= ruleCompositeTrigger ) ) )* otherlv_7= 'execute' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= '}' ) )
            // InternalPanoptesX.g:2933:2: ( () otherlv_1= 'Trigger' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_compositeTriggers_4_0= ruleCompositeTrigger ) ) (otherlv_5= 'or' ( (lv_compositeTriggers_6_0= ruleCompositeTrigger ) ) )* otherlv_7= 'execute' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= '}' )
            {
            // InternalPanoptesX.g:2933:2: ( () otherlv_1= 'Trigger' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_compositeTriggers_4_0= ruleCompositeTrigger ) ) (otherlv_5= 'or' ( (lv_compositeTriggers_6_0= ruleCompositeTrigger ) ) )* otherlv_7= 'execute' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= '}' )
            // InternalPanoptesX.g:2934:3: () otherlv_1= 'Trigger' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_compositeTriggers_4_0= ruleCompositeTrigger ) ) (otherlv_5= 'or' ( (lv_compositeTriggers_6_0= ruleCompositeTrigger ) ) )* otherlv_7= 'execute' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= '}'
            {
            // InternalPanoptesX.g:2934:3: ()
            // InternalPanoptesX.g:2935:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTriggerGroupAccess().getTriggerGroupAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,59,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getTriggerGroupAccess().getTriggerKeyword_1());
            		
            // InternalPanoptesX.g:2945:3: ( (lv_name_2_0= ruleEString ) )
            // InternalPanoptesX.g:2946:4: (lv_name_2_0= ruleEString )
            {
            // InternalPanoptesX.g:2946:4: (lv_name_2_0= ruleEString )
            // InternalPanoptesX.g:2947:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTriggerGroupAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTriggerGroupRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.lowcomote.panoptes.PanoptesX.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_47); 

            			newLeafNode(otherlv_3, grammarAccess.getTriggerGroupAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalPanoptesX.g:2968:3: ( (lv_compositeTriggers_4_0= ruleCompositeTrigger ) )
            // InternalPanoptesX.g:2969:4: (lv_compositeTriggers_4_0= ruleCompositeTrigger )
            {
            // InternalPanoptesX.g:2969:4: (lv_compositeTriggers_4_0= ruleCompositeTrigger )
            // InternalPanoptesX.g:2970:5: lv_compositeTriggers_4_0= ruleCompositeTrigger
            {

            					newCompositeNode(grammarAccess.getTriggerGroupAccess().getCompositeTriggersCompositeTriggerParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_48);
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

            // InternalPanoptesX.g:2987:3: (otherlv_5= 'or' ( (lv_compositeTriggers_6_0= ruleCompositeTrigger ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==60) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalPanoptesX.g:2988:4: otherlv_5= 'or' ( (lv_compositeTriggers_6_0= ruleCompositeTrigger ) )
            	    {
            	    otherlv_5=(Token)match(input,60,FOLLOW_47); 

            	    				newLeafNode(otherlv_5, grammarAccess.getTriggerGroupAccess().getOrKeyword_5_0());
            	    			
            	    // InternalPanoptesX.g:2992:4: ( (lv_compositeTriggers_6_0= ruleCompositeTrigger ) )
            	    // InternalPanoptesX.g:2993:5: (lv_compositeTriggers_6_0= ruleCompositeTrigger )
            	    {
            	    // InternalPanoptesX.g:2993:5: (lv_compositeTriggers_6_0= ruleCompositeTrigger )
            	    // InternalPanoptesX.g:2994:6: lv_compositeTriggers_6_0= ruleCompositeTrigger
            	    {

            	    						newCompositeNode(grammarAccess.getTriggerGroupAccess().getCompositeTriggersCompositeTriggerParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_48);
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
            	    break loop40;
                }
            } while (true);

            otherlv_7=(Token)match(input,61,FOLLOW_4); 

            			newLeafNode(otherlv_7, grammarAccess.getTriggerGroupAccess().getExecuteKeyword_6());
            		
            // InternalPanoptesX.g:3016:3: ( ( ruleEString ) )
            // InternalPanoptesX.g:3017:4: ( ruleEString )
            {
            // InternalPanoptesX.g:3017:4: ( ruleEString )
            // InternalPanoptesX.g:3018:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTriggerGroupRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTriggerGroupAccess().getTargetsBaseAlgorithmExecutionCrossReference_7_0());
            				
            pushFollow(FOLLOW_13);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPanoptesX.g:3032:3: (otherlv_9= ',' ( ( ruleEString ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==15) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalPanoptesX.g:3033:4: otherlv_9= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_9=(Token)match(input,15,FOLLOW_4); 

            	    				newLeafNode(otherlv_9, grammarAccess.getTriggerGroupAccess().getCommaKeyword_8_0());
            	    			
            	    // InternalPanoptesX.g:3037:4: ( ( ruleEString ) )
            	    // InternalPanoptesX.g:3038:5: ( ruleEString )
            	    {
            	    // InternalPanoptesX.g:3038:5: ( ruleEString )
            	    // InternalPanoptesX.g:3039:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getTriggerGroupRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getTriggerGroupAccess().getTargetsBaseAlgorithmExecutionCrossReference_8_1_0());
            	    					
            	    pushFollow(FOLLOW_13);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            otherlv_11=(Token)match(input,17,FOLLOW_2); 

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
    // InternalPanoptesX.g:3062:1: entryRuleCompositeTrigger returns [EObject current=null] : iv_ruleCompositeTrigger= ruleCompositeTrigger EOF ;
    public final EObject entryRuleCompositeTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeTrigger = null;


        try {
            // InternalPanoptesX.g:3062:57: (iv_ruleCompositeTrigger= ruleCompositeTrigger EOF )
            // InternalPanoptesX.g:3063:2: iv_ruleCompositeTrigger= ruleCompositeTrigger EOF
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
    // InternalPanoptesX.g:3069:1: ruleCompositeTrigger returns [EObject current=null] : ( () otherlv_1= 'every' ( ( ( ( ({...}? => ( ({...}? => ( (lv_tt_3_0= ruleTemporalTrigger ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_st_4_0= ruleSampleBasedTrigger ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_pt_5_0= rulePredictionBasedTrigger ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lt_6_0= ruleLabelBasedTrigger ) ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleCompositeTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_tt_3_0 = null;

        EObject lv_st_4_0 = null;

        EObject lv_pt_5_0 = null;

        EObject lv_lt_6_0 = null;



        	enterRule();

        try {
            // InternalPanoptesX.g:3075:2: ( ( () otherlv_1= 'every' ( ( ( ( ({...}? => ( ({...}? => ( (lv_tt_3_0= ruleTemporalTrigger ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_st_4_0= ruleSampleBasedTrigger ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_pt_5_0= rulePredictionBasedTrigger ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lt_6_0= ruleLabelBasedTrigger ) ) ) ) ) )* ) ) ) ) )
            // InternalPanoptesX.g:3076:2: ( () otherlv_1= 'every' ( ( ( ( ({...}? => ( ({...}? => ( (lv_tt_3_0= ruleTemporalTrigger ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_st_4_0= ruleSampleBasedTrigger ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_pt_5_0= rulePredictionBasedTrigger ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lt_6_0= ruleLabelBasedTrigger ) ) ) ) ) )* ) ) ) )
            {
            // InternalPanoptesX.g:3076:2: ( () otherlv_1= 'every' ( ( ( ( ({...}? => ( ({...}? => ( (lv_tt_3_0= ruleTemporalTrigger ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_st_4_0= ruleSampleBasedTrigger ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_pt_5_0= rulePredictionBasedTrigger ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lt_6_0= ruleLabelBasedTrigger ) ) ) ) ) )* ) ) ) )
            // InternalPanoptesX.g:3077:3: () otherlv_1= 'every' ( ( ( ( ({...}? => ( ({...}? => ( (lv_tt_3_0= ruleTemporalTrigger ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_st_4_0= ruleSampleBasedTrigger ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_pt_5_0= rulePredictionBasedTrigger ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lt_6_0= ruleLabelBasedTrigger ) ) ) ) ) )* ) ) )
            {
            // InternalPanoptesX.g:3077:3: ()
            // InternalPanoptesX.g:3078:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCompositeTriggerAccess().getCompositeTriggerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,62,FOLLOW_49); 

            			newLeafNode(otherlv_1, grammarAccess.getCompositeTriggerAccess().getEveryKeyword_1());
            		
            // InternalPanoptesX.g:3088:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_tt_3_0= ruleTemporalTrigger ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_st_4_0= ruleSampleBasedTrigger ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_pt_5_0= rulePredictionBasedTrigger ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lt_6_0= ruleLabelBasedTrigger ) ) ) ) ) )* ) ) )
            // InternalPanoptesX.g:3089:4: ( ( ( ({...}? => ( ({...}? => ( (lv_tt_3_0= ruleTemporalTrigger ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_st_4_0= ruleSampleBasedTrigger ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_pt_5_0= rulePredictionBasedTrigger ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lt_6_0= ruleLabelBasedTrigger ) ) ) ) ) )* ) )
            {
            // InternalPanoptesX.g:3089:4: ( ( ( ({...}? => ( ({...}? => ( (lv_tt_3_0= ruleTemporalTrigger ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_st_4_0= ruleSampleBasedTrigger ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_pt_5_0= rulePredictionBasedTrigger ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lt_6_0= ruleLabelBasedTrigger ) ) ) ) ) )* ) )
            // InternalPanoptesX.g:3090:5: ( ( ({...}? => ( ({...}? => ( (lv_tt_3_0= ruleTemporalTrigger ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_st_4_0= ruleSampleBasedTrigger ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_pt_5_0= rulePredictionBasedTrigger ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lt_6_0= ruleLabelBasedTrigger ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_2());
            				
            // InternalPanoptesX.g:3093:5: ( ( ({...}? => ( ({...}? => ( (lv_tt_3_0= ruleTemporalTrigger ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_st_4_0= ruleSampleBasedTrigger ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_pt_5_0= rulePredictionBasedTrigger ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lt_6_0= ruleLabelBasedTrigger ) ) ) ) ) )* )
            // InternalPanoptesX.g:3094:6: ( ({...}? => ( ({...}? => ( (lv_tt_3_0= ruleTemporalTrigger ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_st_4_0= ruleSampleBasedTrigger ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_pt_5_0= rulePredictionBasedTrigger ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lt_6_0= ruleLabelBasedTrigger ) ) ) ) ) )*
            {
            // InternalPanoptesX.g:3094:6: ( ({...}? => ( ({...}? => ( (lv_tt_3_0= ruleTemporalTrigger ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_st_4_0= ruleSampleBasedTrigger ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_pt_5_0= rulePredictionBasedTrigger ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lt_6_0= ruleLabelBasedTrigger ) ) ) ) ) )*
            loop42:
            do {
                int alt42=5;
                int LA42_0 = input.LA(1);

                if ( ( LA42_0 >= RULE_STRING && LA42_0 <= RULE_PANOPTESSTRING || LA42_0 == 63 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_2(), 0) ) {
                    alt42=1;
                }
                else if ( LA42_0 == 71 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_2(), 3) || getUnorderedGroupHelper().canSelect(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_2(), 2) || getUnorderedGroupHelper().canSelect(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_2(), 1) ) ) {
                    int LA42_3 = input.LA(2);

                    if ( LA42_3 == RULE_INT && ( getUnorderedGroupHelper().canSelect(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_2(), 3) || getUnorderedGroupHelper().canSelect(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_2(), 2) || getUnorderedGroupHelper().canSelect(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_2(), 1) ) ) {
                        int LA42_4 = input.LA(3);

                        if ( LA42_4 == 64 && getUnorderedGroupHelper().canSelect(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_2(), 1) ) {
                            alt42=2;
                        }
                        else if ( LA42_4 == 65 && getUnorderedGroupHelper().canSelect(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_2(), 2) ) {
                            alt42=3;
                        }
                        else if ( LA42_4 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_2(), 3) ) {
                            alt42=4;
                        }


                    }


                }
                else if ( LA42_0 == RULE_INT && ( getUnorderedGroupHelper().canSelect(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_2(), 3) || getUnorderedGroupHelper().canSelect(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_2(), 2) || getUnorderedGroupHelper().canSelect(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_2(), 1) ) ) {
                    int LA42_4 = input.LA(2);

                    if ( LA42_4 == 64 && getUnorderedGroupHelper().canSelect(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_2(), 1) ) {
                        alt42=2;
                    }
                    else if ( LA42_4 == 65 && getUnorderedGroupHelper().canSelect(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_2(), 2) ) {
                        alt42=3;
                    }
                    else if ( LA42_4 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_2(), 3) ) {
                        alt42=4;
                    }


                }


                switch (alt42) {
            	case 1 :
            	    // InternalPanoptesX.g:3095:4: ({...}? => ( ({...}? => ( (lv_tt_3_0= ruleTemporalTrigger ) ) ) ) )
            	    {
            	    // InternalPanoptesX.g:3095:4: ({...}? => ( ({...}? => ( (lv_tt_3_0= ruleTemporalTrigger ) ) ) ) )
            	    // InternalPanoptesX.g:3096:5: {...}? => ( ({...}? => ( (lv_tt_3_0= ruleTemporalTrigger ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleCompositeTrigger", "getUnorderedGroupHelper().canSelect(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalPanoptesX.g:3096:113: ( ({...}? => ( (lv_tt_3_0= ruleTemporalTrigger ) ) ) )
            	    // InternalPanoptesX.g:3097:6: ({...}? => ( (lv_tt_3_0= ruleTemporalTrigger ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalPanoptesX.g:3100:9: ({...}? => ( (lv_tt_3_0= ruleTemporalTrigger ) ) )
            	    // InternalPanoptesX.g:3100:10: {...}? => ( (lv_tt_3_0= ruleTemporalTrigger ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCompositeTrigger", "true");
            	    }
            	    // InternalPanoptesX.g:3100:19: ( (lv_tt_3_0= ruleTemporalTrigger ) )
            	    // InternalPanoptesX.g:3100:20: (lv_tt_3_0= ruleTemporalTrigger )
            	    {
            	    // InternalPanoptesX.g:3100:20: (lv_tt_3_0= ruleTemporalTrigger )
            	    // InternalPanoptesX.g:3101:10: lv_tt_3_0= ruleTemporalTrigger
            	    {

            	    										newCompositeNode(grammarAccess.getCompositeTriggerAccess().getTtTemporalTriggerParserRuleCall_2_0_0());
            	    									
            	    pushFollow(FOLLOW_49);
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
            	    // InternalPanoptesX.g:3123:4: ({...}? => ( ({...}? => ( (lv_st_4_0= ruleSampleBasedTrigger ) ) ) ) )
            	    {
            	    // InternalPanoptesX.g:3123:4: ({...}? => ( ({...}? => ( (lv_st_4_0= ruleSampleBasedTrigger ) ) ) ) )
            	    // InternalPanoptesX.g:3124:5: {...}? => ( ({...}? => ( (lv_st_4_0= ruleSampleBasedTrigger ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleCompositeTrigger", "getUnorderedGroupHelper().canSelect(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalPanoptesX.g:3124:113: ( ({...}? => ( (lv_st_4_0= ruleSampleBasedTrigger ) ) ) )
            	    // InternalPanoptesX.g:3125:6: ({...}? => ( (lv_st_4_0= ruleSampleBasedTrigger ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalPanoptesX.g:3128:9: ({...}? => ( (lv_st_4_0= ruleSampleBasedTrigger ) ) )
            	    // InternalPanoptesX.g:3128:10: {...}? => ( (lv_st_4_0= ruleSampleBasedTrigger ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCompositeTrigger", "true");
            	    }
            	    // InternalPanoptesX.g:3128:19: ( (lv_st_4_0= ruleSampleBasedTrigger ) )
            	    // InternalPanoptesX.g:3128:20: (lv_st_4_0= ruleSampleBasedTrigger )
            	    {
            	    // InternalPanoptesX.g:3128:20: (lv_st_4_0= ruleSampleBasedTrigger )
            	    // InternalPanoptesX.g:3129:10: lv_st_4_0= ruleSampleBasedTrigger
            	    {

            	    										newCompositeNode(grammarAccess.getCompositeTriggerAccess().getStSampleBasedTriggerParserRuleCall_2_1_0());
            	    									
            	    pushFollow(FOLLOW_49);
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
            	    // InternalPanoptesX.g:3151:4: ({...}? => ( ({...}? => ( (lv_pt_5_0= rulePredictionBasedTrigger ) ) ) ) )
            	    {
            	    // InternalPanoptesX.g:3151:4: ({...}? => ( ({...}? => ( (lv_pt_5_0= rulePredictionBasedTrigger ) ) ) ) )
            	    // InternalPanoptesX.g:3152:5: {...}? => ( ({...}? => ( (lv_pt_5_0= rulePredictionBasedTrigger ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleCompositeTrigger", "getUnorderedGroupHelper().canSelect(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalPanoptesX.g:3152:113: ( ({...}? => ( (lv_pt_5_0= rulePredictionBasedTrigger ) ) ) )
            	    // InternalPanoptesX.g:3153:6: ({...}? => ( (lv_pt_5_0= rulePredictionBasedTrigger ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalPanoptesX.g:3156:9: ({...}? => ( (lv_pt_5_0= rulePredictionBasedTrigger ) ) )
            	    // InternalPanoptesX.g:3156:10: {...}? => ( (lv_pt_5_0= rulePredictionBasedTrigger ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCompositeTrigger", "true");
            	    }
            	    // InternalPanoptesX.g:3156:19: ( (lv_pt_5_0= rulePredictionBasedTrigger ) )
            	    // InternalPanoptesX.g:3156:20: (lv_pt_5_0= rulePredictionBasedTrigger )
            	    {
            	    // InternalPanoptesX.g:3156:20: (lv_pt_5_0= rulePredictionBasedTrigger )
            	    // InternalPanoptesX.g:3157:10: lv_pt_5_0= rulePredictionBasedTrigger
            	    {

            	    										newCompositeNode(grammarAccess.getCompositeTriggerAccess().getPtPredictionBasedTriggerParserRuleCall_2_2_0());
            	    									
            	    pushFollow(FOLLOW_49);
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
            	    // InternalPanoptesX.g:3179:4: ({...}? => ( ({...}? => ( (lv_lt_6_0= ruleLabelBasedTrigger ) ) ) ) )
            	    {
            	    // InternalPanoptesX.g:3179:4: ({...}? => ( ({...}? => ( (lv_lt_6_0= ruleLabelBasedTrigger ) ) ) ) )
            	    // InternalPanoptesX.g:3180:5: {...}? => ( ({...}? => ( (lv_lt_6_0= ruleLabelBasedTrigger ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleCompositeTrigger", "getUnorderedGroupHelper().canSelect(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // InternalPanoptesX.g:3180:113: ( ({...}? => ( (lv_lt_6_0= ruleLabelBasedTrigger ) ) ) )
            	    // InternalPanoptesX.g:3181:6: ({...}? => ( (lv_lt_6_0= ruleLabelBasedTrigger ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_2(), 3);
            	    					
            	    // InternalPanoptesX.g:3184:9: ({...}? => ( (lv_lt_6_0= ruleLabelBasedTrigger ) ) )
            	    // InternalPanoptesX.g:3184:10: {...}? => ( (lv_lt_6_0= ruleLabelBasedTrigger ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCompositeTrigger", "true");
            	    }
            	    // InternalPanoptesX.g:3184:19: ( (lv_lt_6_0= ruleLabelBasedTrigger ) )
            	    // InternalPanoptesX.g:3184:20: (lv_lt_6_0= ruleLabelBasedTrigger )
            	    {
            	    // InternalPanoptesX.g:3184:20: (lv_lt_6_0= ruleLabelBasedTrigger )
            	    // InternalPanoptesX.g:3185:10: lv_lt_6_0= ruleLabelBasedTrigger
            	    {

            	    										newCompositeNode(grammarAccess.getCompositeTriggerAccess().getLtLabelBasedTriggerParserRuleCall_2_3_0());
            	    									
            	    pushFollow(FOLLOW_49);
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
            	    break loop42;
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
    // InternalPanoptesX.g:3218:1: entryRuleTemporalTrigger returns [EObject current=null] : iv_ruleTemporalTrigger= ruleTemporalTrigger EOF ;
    public final EObject entryRuleTemporalTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemporalTrigger = null;


        try {
            // InternalPanoptesX.g:3218:56: (iv_ruleTemporalTrigger= ruleTemporalTrigger EOF )
            // InternalPanoptesX.g:3219:2: iv_ruleTemporalTrigger= ruleTemporalTrigger EOF
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
    // InternalPanoptesX.g:3225:1: ruleTemporalTrigger returns [EObject current=null] : ( ( () (otherlv_1= 'one' ( (lv_frequency_2_0= rulefrequencyEnum ) ) ) ) | ( (lv_cronString_3_0= ruleEString ) ) ) ;
    public final EObject ruleTemporalTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Enumerator lv_frequency_2_0 = null;

        AntlrDatatypeRuleToken lv_cronString_3_0 = null;



        	enterRule();

        try {
            // InternalPanoptesX.g:3231:2: ( ( ( () (otherlv_1= 'one' ( (lv_frequency_2_0= rulefrequencyEnum ) ) ) ) | ( (lv_cronString_3_0= ruleEString ) ) ) )
            // InternalPanoptesX.g:3232:2: ( ( () (otherlv_1= 'one' ( (lv_frequency_2_0= rulefrequencyEnum ) ) ) ) | ( (lv_cronString_3_0= ruleEString ) ) )
            {
            // InternalPanoptesX.g:3232:2: ( ( () (otherlv_1= 'one' ( (lv_frequency_2_0= rulefrequencyEnum ) ) ) ) | ( (lv_cronString_3_0= ruleEString ) ) )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==63) ) {
                alt43=1;
            }
            else if ( ((LA43_0>=RULE_STRING && LA43_0<=RULE_PANOPTESSTRING)) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // InternalPanoptesX.g:3233:3: ( () (otherlv_1= 'one' ( (lv_frequency_2_0= rulefrequencyEnum ) ) ) )
                    {
                    // InternalPanoptesX.g:3233:3: ( () (otherlv_1= 'one' ( (lv_frequency_2_0= rulefrequencyEnum ) ) ) )
                    // InternalPanoptesX.g:3234:4: () (otherlv_1= 'one' ( (lv_frequency_2_0= rulefrequencyEnum ) ) )
                    {
                    // InternalPanoptesX.g:3234:4: ()
                    // InternalPanoptesX.g:3235:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTemporalTriggerAccess().getTemporalTriggerAction_0_0(),
                    						current);
                    				

                    }

                    // InternalPanoptesX.g:3241:4: (otherlv_1= 'one' ( (lv_frequency_2_0= rulefrequencyEnum ) ) )
                    // InternalPanoptesX.g:3242:5: otherlv_1= 'one' ( (lv_frequency_2_0= rulefrequencyEnum ) )
                    {
                    otherlv_1=(Token)match(input,63,FOLLOW_50); 

                    					newLeafNode(otherlv_1, grammarAccess.getTemporalTriggerAccess().getOneKeyword_0_1_0());
                    				
                    // InternalPanoptesX.g:3246:5: ( (lv_frequency_2_0= rulefrequencyEnum ) )
                    // InternalPanoptesX.g:3247:6: (lv_frequency_2_0= rulefrequencyEnum )
                    {
                    // InternalPanoptesX.g:3247:6: (lv_frequency_2_0= rulefrequencyEnum )
                    // InternalPanoptesX.g:3248:7: lv_frequency_2_0= rulefrequencyEnum
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
                    // InternalPanoptesX.g:3268:3: ( (lv_cronString_3_0= ruleEString ) )
                    {
                    // InternalPanoptesX.g:3268:3: ( (lv_cronString_3_0= ruleEString ) )
                    // InternalPanoptesX.g:3269:4: (lv_cronString_3_0= ruleEString )
                    {
                    // InternalPanoptesX.g:3269:4: (lv_cronString_3_0= ruleEString )
                    // InternalPanoptesX.g:3270:5: lv_cronString_3_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getTemporalTriggerAccess().getCronStringEStringParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_cronString_3_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTemporalTriggerRule());
                    					}
                    					set(
                    						current,
                    						"cronString",
                    						lv_cronString_3_0,
                    						"org.lowcomote.panoptes.PanoptesX.EString");
                    					afterParserOrEnumRuleCall();
                    				

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
    // InternalPanoptesX.g:3291:1: entryRuleSampleBasedTrigger returns [EObject current=null] : iv_ruleSampleBasedTrigger= ruleSampleBasedTrigger EOF ;
    public final EObject entryRuleSampleBasedTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSampleBasedTrigger = null;


        try {
            // InternalPanoptesX.g:3291:59: (iv_ruleSampleBasedTrigger= ruleSampleBasedTrigger EOF )
            // InternalPanoptesX.g:3292:2: iv_ruleSampleBasedTrigger= ruleSampleBasedTrigger EOF
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
    // InternalPanoptesX.g:3298:1: ruleSampleBasedTrigger returns [EObject current=null] : ( () ( (lv_frequency_1_0= ruleEIntegerObject ) ) otherlv_2= 'samples' ) ;
    public final EObject ruleSampleBasedTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_frequency_1_0 = null;



        	enterRule();

        try {
            // InternalPanoptesX.g:3304:2: ( ( () ( (lv_frequency_1_0= ruleEIntegerObject ) ) otherlv_2= 'samples' ) )
            // InternalPanoptesX.g:3305:2: ( () ( (lv_frequency_1_0= ruleEIntegerObject ) ) otherlv_2= 'samples' )
            {
            // InternalPanoptesX.g:3305:2: ( () ( (lv_frequency_1_0= ruleEIntegerObject ) ) otherlv_2= 'samples' )
            // InternalPanoptesX.g:3306:3: () ( (lv_frequency_1_0= ruleEIntegerObject ) ) otherlv_2= 'samples'
            {
            // InternalPanoptesX.g:3306:3: ()
            // InternalPanoptesX.g:3307:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSampleBasedTriggerAccess().getSampleBasedTriggerAction_0(),
            					current);
            			

            }

            // InternalPanoptesX.g:3313:3: ( (lv_frequency_1_0= ruleEIntegerObject ) )
            // InternalPanoptesX.g:3314:4: (lv_frequency_1_0= ruleEIntegerObject )
            {
            // InternalPanoptesX.g:3314:4: (lv_frequency_1_0= ruleEIntegerObject )
            // InternalPanoptesX.g:3315:5: lv_frequency_1_0= ruleEIntegerObject
            {

            					newCompositeNode(grammarAccess.getSampleBasedTriggerAccess().getFrequencyEIntegerObjectParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_51);
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

            otherlv_2=(Token)match(input,64,FOLLOW_2); 

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
    // InternalPanoptesX.g:3340:1: entryRulePredictionBasedTrigger returns [EObject current=null] : iv_rulePredictionBasedTrigger= rulePredictionBasedTrigger EOF ;
    public final EObject entryRulePredictionBasedTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredictionBasedTrigger = null;


        try {
            // InternalPanoptesX.g:3340:63: (iv_rulePredictionBasedTrigger= rulePredictionBasedTrigger EOF )
            // InternalPanoptesX.g:3341:2: iv_rulePredictionBasedTrigger= rulePredictionBasedTrigger EOF
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
    // InternalPanoptesX.g:3347:1: rulePredictionBasedTrigger returns [EObject current=null] : ( () ( (lv_frequency_1_0= ruleEIntegerObject ) ) otherlv_2= 'predictions' ) ;
    public final EObject rulePredictionBasedTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_frequency_1_0 = null;



        	enterRule();

        try {
            // InternalPanoptesX.g:3353:2: ( ( () ( (lv_frequency_1_0= ruleEIntegerObject ) ) otherlv_2= 'predictions' ) )
            // InternalPanoptesX.g:3354:2: ( () ( (lv_frequency_1_0= ruleEIntegerObject ) ) otherlv_2= 'predictions' )
            {
            // InternalPanoptesX.g:3354:2: ( () ( (lv_frequency_1_0= ruleEIntegerObject ) ) otherlv_2= 'predictions' )
            // InternalPanoptesX.g:3355:3: () ( (lv_frequency_1_0= ruleEIntegerObject ) ) otherlv_2= 'predictions'
            {
            // InternalPanoptesX.g:3355:3: ()
            // InternalPanoptesX.g:3356:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPredictionBasedTriggerAccess().getPredictionBasedTriggerAction_0(),
            					current);
            			

            }

            // InternalPanoptesX.g:3362:3: ( (lv_frequency_1_0= ruleEIntegerObject ) )
            // InternalPanoptesX.g:3363:4: (lv_frequency_1_0= ruleEIntegerObject )
            {
            // InternalPanoptesX.g:3363:4: (lv_frequency_1_0= ruleEIntegerObject )
            // InternalPanoptesX.g:3364:5: lv_frequency_1_0= ruleEIntegerObject
            {

            					newCompositeNode(grammarAccess.getPredictionBasedTriggerAccess().getFrequencyEIntegerObjectParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_52);
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

            otherlv_2=(Token)match(input,65,FOLLOW_2); 

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
    // InternalPanoptesX.g:3389:1: entryRuleLabelBasedTrigger returns [EObject current=null] : iv_ruleLabelBasedTrigger= ruleLabelBasedTrigger EOF ;
    public final EObject entryRuleLabelBasedTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabelBasedTrigger = null;


        try {
            // InternalPanoptesX.g:3389:58: (iv_ruleLabelBasedTrigger= ruleLabelBasedTrigger EOF )
            // InternalPanoptesX.g:3390:2: iv_ruleLabelBasedTrigger= ruleLabelBasedTrigger EOF
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
    // InternalPanoptesX.g:3396:1: ruleLabelBasedTrigger returns [EObject current=null] : ( () ( (lv_frequency_1_0= ruleEIntegerObject ) ) otherlv_2= 'labels' ) ;
    public final EObject ruleLabelBasedTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_frequency_1_0 = null;



        	enterRule();

        try {
            // InternalPanoptesX.g:3402:2: ( ( () ( (lv_frequency_1_0= ruleEIntegerObject ) ) otherlv_2= 'labels' ) )
            // InternalPanoptesX.g:3403:2: ( () ( (lv_frequency_1_0= ruleEIntegerObject ) ) otherlv_2= 'labels' )
            {
            // InternalPanoptesX.g:3403:2: ( () ( (lv_frequency_1_0= ruleEIntegerObject ) ) otherlv_2= 'labels' )
            // InternalPanoptesX.g:3404:3: () ( (lv_frequency_1_0= ruleEIntegerObject ) ) otherlv_2= 'labels'
            {
            // InternalPanoptesX.g:3404:3: ()
            // InternalPanoptesX.g:3405:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLabelBasedTriggerAccess().getLabelBasedTriggerAction_0(),
            					current);
            			

            }

            // InternalPanoptesX.g:3411:3: ( (lv_frequency_1_0= ruleEIntegerObject ) )
            // InternalPanoptesX.g:3412:4: (lv_frequency_1_0= ruleEIntegerObject )
            {
            // InternalPanoptesX.g:3412:4: (lv_frequency_1_0= ruleEIntegerObject )
            // InternalPanoptesX.g:3413:5: lv_frequency_1_0= ruleEIntegerObject
            {

            					newCompositeNode(grammarAccess.getLabelBasedTriggerAccess().getFrequencyEIntegerObjectParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_53);
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

            otherlv_2=(Token)match(input,21,FOLLOW_2); 

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
    // InternalPanoptesX.g:3438:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalPanoptesX.g:3438:47: (iv_ruleAction= ruleAction EOF )
            // InternalPanoptesX.g:3439:2: iv_ruleAction= ruleAction EOF
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
    // InternalPanoptesX.g:3445:1: ruleAction returns [EObject current=null] : ( () otherlv_1= 'Action' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'endpoint' ( (lv_endpoint_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'parameters' ( (lv_additionalParameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_additionalParameters_10_0= ruleParameter ) ) )* ) ) ) ) )* ) ) ) otherlv_11= '}' ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_endpoint_6_0 = null;

        EObject lv_additionalParameters_8_0 = null;

        EObject lv_additionalParameters_10_0 = null;



        	enterRule();

        try {
            // InternalPanoptesX.g:3451:2: ( ( () otherlv_1= 'Action' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'endpoint' ( (lv_endpoint_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'parameters' ( (lv_additionalParameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_additionalParameters_10_0= ruleParameter ) ) )* ) ) ) ) )* ) ) ) otherlv_11= '}' ) )
            // InternalPanoptesX.g:3452:2: ( () otherlv_1= 'Action' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'endpoint' ( (lv_endpoint_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'parameters' ( (lv_additionalParameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_additionalParameters_10_0= ruleParameter ) ) )* ) ) ) ) )* ) ) ) otherlv_11= '}' )
            {
            // InternalPanoptesX.g:3452:2: ( () otherlv_1= 'Action' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'endpoint' ( (lv_endpoint_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'parameters' ( (lv_additionalParameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_additionalParameters_10_0= ruleParameter ) ) )* ) ) ) ) )* ) ) ) otherlv_11= '}' )
            // InternalPanoptesX.g:3453:3: () otherlv_1= 'Action' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'endpoint' ( (lv_endpoint_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'parameters' ( (lv_additionalParameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_additionalParameters_10_0= ruleParameter ) ) )* ) ) ) ) )* ) ) ) otherlv_11= '}'
            {
            // InternalPanoptesX.g:3453:3: ()
            // InternalPanoptesX.g:3454:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActionAccess().getActionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,66,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getActionAccess().getActionKeyword_1());
            		
            // InternalPanoptesX.g:3464:3: ( (lv_name_2_0= ruleEString ) )
            // InternalPanoptesX.g:3465:4: (lv_name_2_0= ruleEString )
            {
            // InternalPanoptesX.g:3465:4: (lv_name_2_0= ruleEString )
            // InternalPanoptesX.g:3466:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getActionAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.lowcomote.panoptes.PanoptesX.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_54); 

            			newLeafNode(otherlv_3, grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalPanoptesX.g:3487:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'endpoint' ( (lv_endpoint_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'parameters' ( (lv_additionalParameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_additionalParameters_10_0= ruleParameter ) ) )* ) ) ) ) )* ) ) )
            // InternalPanoptesX.g:3488:4: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'endpoint' ( (lv_endpoint_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'parameters' ( (lv_additionalParameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_additionalParameters_10_0= ruleParameter ) ) )* ) ) ) ) )* ) )
            {
            // InternalPanoptesX.g:3488:4: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'endpoint' ( (lv_endpoint_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'parameters' ( (lv_additionalParameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_additionalParameters_10_0= ruleParameter ) ) )* ) ) ) ) )* ) )
            // InternalPanoptesX.g:3489:5: ( ( ({...}? => ( ({...}? => (otherlv_5= 'endpoint' ( (lv_endpoint_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'parameters' ( (lv_additionalParameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_additionalParameters_10_0= ruleParameter ) ) )* ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getActionAccess().getUnorderedGroup_4());
            				
            // InternalPanoptesX.g:3492:5: ( ( ({...}? => ( ({...}? => (otherlv_5= 'endpoint' ( (lv_endpoint_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'parameters' ( (lv_additionalParameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_additionalParameters_10_0= ruleParameter ) ) )* ) ) ) ) )* )
            // InternalPanoptesX.g:3493:6: ( ({...}? => ( ({...}? => (otherlv_5= 'endpoint' ( (lv_endpoint_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'parameters' ( (lv_additionalParameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_additionalParameters_10_0= ruleParameter ) ) )* ) ) ) ) )*
            {
            // InternalPanoptesX.g:3493:6: ( ({...}? => ( ({...}? => (otherlv_5= 'endpoint' ( (lv_endpoint_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'parameters' ( (lv_additionalParameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_additionalParameters_10_0= ruleParameter ) ) )* ) ) ) ) )*
            loop45:
            do {
                int alt45=3;
                int LA45_0 = input.LA(1);

                if ( LA45_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getActionAccess().getUnorderedGroup_4(), 0) ) {
                    alt45=1;
                }
                else if ( LA45_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getActionAccess().getUnorderedGroup_4(), 1) ) {
                    alt45=2;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalPanoptesX.g:3494:4: ({...}? => ( ({...}? => (otherlv_5= 'endpoint' ( (lv_endpoint_6_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalPanoptesX.g:3494:4: ({...}? => ( ({...}? => (otherlv_5= 'endpoint' ( (lv_endpoint_6_0= ruleEString ) ) ) ) ) )
            	    // InternalPanoptesX.g:3495:5: {...}? => ( ({...}? => (otherlv_5= 'endpoint' ( (lv_endpoint_6_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActionAccess().getUnorderedGroup_4(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleAction", "getUnorderedGroupHelper().canSelect(grammarAccess.getActionAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // InternalPanoptesX.g:3495:103: ( ({...}? => (otherlv_5= 'endpoint' ( (lv_endpoint_6_0= ruleEString ) ) ) ) )
            	    // InternalPanoptesX.g:3496:6: ({...}? => (otherlv_5= 'endpoint' ( (lv_endpoint_6_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getActionAccess().getUnorderedGroup_4(), 0);
            	    					
            	    // InternalPanoptesX.g:3499:9: ({...}? => (otherlv_5= 'endpoint' ( (lv_endpoint_6_0= ruleEString ) ) ) )
            	    // InternalPanoptesX.g:3499:10: {...}? => (otherlv_5= 'endpoint' ( (lv_endpoint_6_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAction", "true");
            	    }
            	    // InternalPanoptesX.g:3499:19: (otherlv_5= 'endpoint' ( (lv_endpoint_6_0= ruleEString ) ) )
            	    // InternalPanoptesX.g:3499:20: otherlv_5= 'endpoint' ( (lv_endpoint_6_0= ruleEString ) )
            	    {
            	    otherlv_5=(Token)match(input,41,FOLLOW_4); 

            	    									newLeafNode(otherlv_5, grammarAccess.getActionAccess().getEndpointKeyword_4_0_0());
            	    								
            	    // InternalPanoptesX.g:3503:9: ( (lv_endpoint_6_0= ruleEString ) )
            	    // InternalPanoptesX.g:3504:10: (lv_endpoint_6_0= ruleEString )
            	    {
            	    // InternalPanoptesX.g:3504:10: (lv_endpoint_6_0= ruleEString )
            	    // InternalPanoptesX.g:3505:11: lv_endpoint_6_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getActionAccess().getEndpointEStringParserRuleCall_4_0_1_0());
            	    										
            	    pushFollow(FOLLOW_54);
            	    lv_endpoint_6_0=ruleEString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getActionRule());
            	    											}
            	    											set(
            	    												current,
            	    												"endpoint",
            	    												lv_endpoint_6_0,
            	    												"org.lowcomote.panoptes.PanoptesX.EString");
            	    											afterParserOrEnumRuleCall();
            	    										

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
            	    // InternalPanoptesX.g:3528:4: ({...}? => ( ({...}? => (otherlv_7= 'parameters' ( (lv_additionalParameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_additionalParameters_10_0= ruleParameter ) ) )* ) ) ) )
            	    {
            	    // InternalPanoptesX.g:3528:4: ({...}? => ( ({...}? => (otherlv_7= 'parameters' ( (lv_additionalParameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_additionalParameters_10_0= ruleParameter ) ) )* ) ) ) )
            	    // InternalPanoptesX.g:3529:5: {...}? => ( ({...}? => (otherlv_7= 'parameters' ( (lv_additionalParameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_additionalParameters_10_0= ruleParameter ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActionAccess().getUnorderedGroup_4(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleAction", "getUnorderedGroupHelper().canSelect(grammarAccess.getActionAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // InternalPanoptesX.g:3529:103: ( ({...}? => (otherlv_7= 'parameters' ( (lv_additionalParameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_additionalParameters_10_0= ruleParameter ) ) )* ) ) )
            	    // InternalPanoptesX.g:3530:6: ({...}? => (otherlv_7= 'parameters' ( (lv_additionalParameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_additionalParameters_10_0= ruleParameter ) ) )* ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getActionAccess().getUnorderedGroup_4(), 1);
            	    					
            	    // InternalPanoptesX.g:3533:9: ({...}? => (otherlv_7= 'parameters' ( (lv_additionalParameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_additionalParameters_10_0= ruleParameter ) ) )* ) )
            	    // InternalPanoptesX.g:3533:10: {...}? => (otherlv_7= 'parameters' ( (lv_additionalParameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_additionalParameters_10_0= ruleParameter ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAction", "true");
            	    }
            	    // InternalPanoptesX.g:3533:19: (otherlv_7= 'parameters' ( (lv_additionalParameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_additionalParameters_10_0= ruleParameter ) ) )* )
            	    // InternalPanoptesX.g:3533:20: otherlv_7= 'parameters' ( (lv_additionalParameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_additionalParameters_10_0= ruleParameter ) ) )*
            	    {
            	    otherlv_7=(Token)match(input,38,FOLLOW_31); 

            	    									newLeafNode(otherlv_7, grammarAccess.getActionAccess().getParametersKeyword_4_1_0());
            	    								
            	    // InternalPanoptesX.g:3537:9: ( (lv_additionalParameters_8_0= ruleParameter ) )
            	    // InternalPanoptesX.g:3538:10: (lv_additionalParameters_8_0= ruleParameter )
            	    {
            	    // InternalPanoptesX.g:3538:10: (lv_additionalParameters_8_0= ruleParameter )
            	    // InternalPanoptesX.g:3539:11: lv_additionalParameters_8_0= ruleParameter
            	    {

            	    											newCompositeNode(grammarAccess.getActionAccess().getAdditionalParametersParameterParserRuleCall_4_1_1_0());
            	    										
            	    pushFollow(FOLLOW_55);
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

            	    // InternalPanoptesX.g:3556:9: (otherlv_9= ',' ( (lv_additionalParameters_10_0= ruleParameter ) ) )*
            	    loop44:
            	    do {
            	        int alt44=2;
            	        int LA44_0 = input.LA(1);

            	        if ( (LA44_0==15) ) {
            	            alt44=1;
            	        }


            	        switch (alt44) {
            	    	case 1 :
            	    	    // InternalPanoptesX.g:3557:10: otherlv_9= ',' ( (lv_additionalParameters_10_0= ruleParameter ) )
            	    	    {
            	    	    otherlv_9=(Token)match(input,15,FOLLOW_31); 

            	    	    										newLeafNode(otherlv_9, grammarAccess.getActionAccess().getCommaKeyword_4_1_2_0());
            	    	    									
            	    	    // InternalPanoptesX.g:3561:10: ( (lv_additionalParameters_10_0= ruleParameter ) )
            	    	    // InternalPanoptesX.g:3562:11: (lv_additionalParameters_10_0= ruleParameter )
            	    	    {
            	    	    // InternalPanoptesX.g:3562:11: (lv_additionalParameters_10_0= ruleParameter )
            	    	    // InternalPanoptesX.g:3563:12: lv_additionalParameters_10_0= ruleParameter
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getActionAccess().getAdditionalParametersParameterParserRuleCall_4_1_2_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_55);
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
            	    	    break loop44;
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
            	    break loop45;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getActionAccess().getUnorderedGroup_4());
            				

            }

            otherlv_11=(Token)match(input,17,FOLLOW_2); 

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
    // InternalPanoptesX.g:3602:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalPanoptesX.g:3602:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalPanoptesX.g:3603:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalPanoptesX.g:3609:1: ruleParameter returns [EObject current=null] : ( () ( (lv_mandatory_1_0= 'mandatory' ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_type_4_0= ruleparameterType ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_mandatory_1_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_type_4_0 = null;



        	enterRule();

        try {
            // InternalPanoptesX.g:3615:2: ( ( () ( (lv_mandatory_1_0= 'mandatory' ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_type_4_0= ruleparameterType ) ) ) )
            // InternalPanoptesX.g:3616:2: ( () ( (lv_mandatory_1_0= 'mandatory' ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_type_4_0= ruleparameterType ) ) )
            {
            // InternalPanoptesX.g:3616:2: ( () ( (lv_mandatory_1_0= 'mandatory' ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_type_4_0= ruleparameterType ) ) )
            // InternalPanoptesX.g:3617:3: () ( (lv_mandatory_1_0= 'mandatory' ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_type_4_0= ruleparameterType ) )
            {
            // InternalPanoptesX.g:3617:3: ()
            // InternalPanoptesX.g:3618:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterAccess().getParameterAction_0(),
            					current);
            			

            }

            // InternalPanoptesX.g:3624:3: ( (lv_mandatory_1_0= 'mandatory' ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==67) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalPanoptesX.g:3625:4: (lv_mandatory_1_0= 'mandatory' )
                    {
                    // InternalPanoptesX.g:3625:4: (lv_mandatory_1_0= 'mandatory' )
                    // InternalPanoptesX.g:3626:5: lv_mandatory_1_0= 'mandatory'
                    {
                    lv_mandatory_1_0=(Token)match(input,67,FOLLOW_4); 

                    					newLeafNode(lv_mandatory_1_0, grammarAccess.getParameterAccess().getMandatoryMandatoryKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getParameterRule());
                    					}
                    					setWithLastConsumed(current, "mandatory", lv_mandatory_1_0 != null, "mandatory");
                    				

                    }


                    }
                    break;

            }

            // InternalPanoptesX.g:3638:3: ( (lv_name_2_0= ruleEString ) )
            // InternalPanoptesX.g:3639:4: (lv_name_2_0= ruleEString )
            {
            // InternalPanoptesX.g:3639:4: (lv_name_2_0= ruleEString )
            // InternalPanoptesX.g:3640:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_56);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.lowcomote.panoptes.PanoptesX.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_57); 

            			newLeafNode(otherlv_3, grammarAccess.getParameterAccess().getColonKeyword_3());
            		
            // InternalPanoptesX.g:3661:3: ( (lv_type_4_0= ruleparameterType ) )
            // InternalPanoptesX.g:3662:4: (lv_type_4_0= ruleparameterType )
            {
            // InternalPanoptesX.g:3662:4: (lv_type_4_0= ruleparameterType )
            // InternalPanoptesX.g:3663:5: lv_type_4_0= ruleparameterType
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getTypeParameterTypeEnumRuleCall_4_0());
            				
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
    // InternalPanoptesX.g:3684:1: entryRuleparameterValueEntry returns [EObject current=null] : iv_ruleparameterValueEntry= ruleparameterValueEntry EOF ;
    public final EObject entryRuleparameterValueEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleparameterValueEntry = null;


        try {
            // InternalPanoptesX.g:3684:60: (iv_ruleparameterValueEntry= ruleparameterValueEntry EOF )
            // InternalPanoptesX.g:3685:2: iv_ruleparameterValueEntry= ruleparameterValueEntry EOF
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
    // InternalPanoptesX.g:3691:1: ruleparameterValueEntry returns [EObject current=null] : ( () ( (lv_key_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_value_3_0= ruleEString ) ) ) ;
    public final EObject ruleparameterValueEntry() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_key_1_0 = null;

        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalPanoptesX.g:3697:2: ( ( () ( (lv_key_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_value_3_0= ruleEString ) ) ) )
            // InternalPanoptesX.g:3698:2: ( () ( (lv_key_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_value_3_0= ruleEString ) ) )
            {
            // InternalPanoptesX.g:3698:2: ( () ( (lv_key_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_value_3_0= ruleEString ) ) )
            // InternalPanoptesX.g:3699:3: () ( (lv_key_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_value_3_0= ruleEString ) )
            {
            // InternalPanoptesX.g:3699:3: ()
            // InternalPanoptesX.g:3700:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterValueEntryAccess().getParameterValueEntryAction_0(),
            					current);
            			

            }

            // InternalPanoptesX.g:3706:3: ( (lv_key_1_0= ruleEString ) )
            // InternalPanoptesX.g:3707:4: (lv_key_1_0= ruleEString )
            {
            // InternalPanoptesX.g:3707:4: (lv_key_1_0= ruleEString )
            // InternalPanoptesX.g:3708:5: lv_key_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParameterValueEntryAccess().getKeyEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_58);
            lv_key_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterValueEntryRule());
            					}
            					set(
            						current,
            						"key",
            						lv_key_1_0,
            						"org.lowcomote.panoptes.PanoptesX.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,68,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterValueEntryAccess().getEqualsSignKeyword_2());
            		
            // InternalPanoptesX.g:3729:3: ( (lv_value_3_0= ruleEString ) )
            // InternalPanoptesX.g:3730:4: (lv_value_3_0= ruleEString )
            {
            // InternalPanoptesX.g:3730:4: (lv_value_3_0= ruleEString )
            // InternalPanoptesX.g:3731:5: lv_value_3_0= ruleEString
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
    // InternalPanoptesX.g:3752:1: entryRuleActionExecution returns [EObject current=null] : iv_ruleActionExecution= ruleActionExecution EOF ;
    public final EObject entryRuleActionExecution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionExecution = null;


        try {
            // InternalPanoptesX.g:3752:56: (iv_ruleActionExecution= ruleActionExecution EOF )
            // InternalPanoptesX.g:3753:2: iv_ruleActionExecution= ruleActionExecution EOF
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
    // InternalPanoptesX.g:3759:1: ruleActionExecution returns [EObject current=null] : ( () otherlv_1= 'ActionExecution' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'action' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'parameter' otherlv_8= 'values' ( (lv_parameterValueMap_9_0= ruleparameterValueEntry ) ) (otherlv_10= ',' ( (lv_parameterValueMap_11_0= ruleparameterValueEntry ) ) )* ) ) ) ) )+ {...}?) ) ) otherlv_12= '}' ) ;
    public final EObject ruleActionExecution() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_parameterValueMap_9_0 = null;

        EObject lv_parameterValueMap_11_0 = null;



        	enterRule();

        try {
            // InternalPanoptesX.g:3765:2: ( ( () otherlv_1= 'ActionExecution' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'action' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'parameter' otherlv_8= 'values' ( (lv_parameterValueMap_9_0= ruleparameterValueEntry ) ) (otherlv_10= ',' ( (lv_parameterValueMap_11_0= ruleparameterValueEntry ) ) )* ) ) ) ) )+ {...}?) ) ) otherlv_12= '}' ) )
            // InternalPanoptesX.g:3766:2: ( () otherlv_1= 'ActionExecution' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'action' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'parameter' otherlv_8= 'values' ( (lv_parameterValueMap_9_0= ruleparameterValueEntry ) ) (otherlv_10= ',' ( (lv_parameterValueMap_11_0= ruleparameterValueEntry ) ) )* ) ) ) ) )+ {...}?) ) ) otherlv_12= '}' )
            {
            // InternalPanoptesX.g:3766:2: ( () otherlv_1= 'ActionExecution' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'action' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'parameter' otherlv_8= 'values' ( (lv_parameterValueMap_9_0= ruleparameterValueEntry ) ) (otherlv_10= ',' ( (lv_parameterValueMap_11_0= ruleparameterValueEntry ) ) )* ) ) ) ) )+ {...}?) ) ) otherlv_12= '}' )
            // InternalPanoptesX.g:3767:3: () otherlv_1= 'ActionExecution' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'action' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'parameter' otherlv_8= 'values' ( (lv_parameterValueMap_9_0= ruleparameterValueEntry ) ) (otherlv_10= ',' ( (lv_parameterValueMap_11_0= ruleparameterValueEntry ) ) )* ) ) ) ) )+ {...}?) ) ) otherlv_12= '}'
            {
            // InternalPanoptesX.g:3767:3: ()
            // InternalPanoptesX.g:3768:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActionExecutionAccess().getActionExecutionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,69,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getActionExecutionAccess().getActionExecutionKeyword_1());
            		
            // InternalPanoptesX.g:3778:3: ( (lv_name_2_0= ruleEString ) )
            // InternalPanoptesX.g:3779:4: (lv_name_2_0= ruleEString )
            {
            // InternalPanoptesX.g:3779:4: (lv_name_2_0= ruleEString )
            // InternalPanoptesX.g:3780:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getActionExecutionAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActionExecutionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.lowcomote.panoptes.PanoptesX.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_59); 

            			newLeafNode(otherlv_3, grammarAccess.getActionExecutionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalPanoptesX.g:3801:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'action' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'parameter' otherlv_8= 'values' ( (lv_parameterValueMap_9_0= ruleparameterValueEntry ) ) (otherlv_10= ',' ( (lv_parameterValueMap_11_0= ruleparameterValueEntry ) ) )* ) ) ) ) )+ {...}?) ) )
            // InternalPanoptesX.g:3802:4: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'action' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'parameter' otherlv_8= 'values' ( (lv_parameterValueMap_9_0= ruleparameterValueEntry ) ) (otherlv_10= ',' ( (lv_parameterValueMap_11_0= ruleparameterValueEntry ) ) )* ) ) ) ) )+ {...}?) )
            {
            // InternalPanoptesX.g:3802:4: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'action' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'parameter' otherlv_8= 'values' ( (lv_parameterValueMap_9_0= ruleparameterValueEntry ) ) (otherlv_10= ',' ( (lv_parameterValueMap_11_0= ruleparameterValueEntry ) ) )* ) ) ) ) )+ {...}?) )
            // InternalPanoptesX.g:3803:5: ( ( ({...}? => ( ({...}? => (otherlv_5= 'action' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'parameter' otherlv_8= 'values' ( (lv_parameterValueMap_9_0= ruleparameterValueEntry ) ) (otherlv_10= ',' ( (lv_parameterValueMap_11_0= ruleparameterValueEntry ) ) )* ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getActionExecutionAccess().getUnorderedGroup_4());
            				
            // InternalPanoptesX.g:3806:5: ( ( ({...}? => ( ({...}? => (otherlv_5= 'action' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'parameter' otherlv_8= 'values' ( (lv_parameterValueMap_9_0= ruleparameterValueEntry ) ) (otherlv_10= ',' ( (lv_parameterValueMap_11_0= ruleparameterValueEntry ) ) )* ) ) ) ) )+ {...}?)
            // InternalPanoptesX.g:3807:6: ( ({...}? => ( ({...}? => (otherlv_5= 'action' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'parameter' otherlv_8= 'values' ( (lv_parameterValueMap_9_0= ruleparameterValueEntry ) ) (otherlv_10= ',' ( (lv_parameterValueMap_11_0= ruleparameterValueEntry ) ) )* ) ) ) ) )+ {...}?
            {
            // InternalPanoptesX.g:3807:6: ( ({...}? => ( ({...}? => (otherlv_5= 'action' ( ( ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'parameter' otherlv_8= 'values' ( (lv_parameterValueMap_9_0= ruleparameterValueEntry ) ) (otherlv_10= ',' ( (lv_parameterValueMap_11_0= ruleparameterValueEntry ) ) )* ) ) ) ) )+
            int cnt48=0;
            loop48:
            do {
                int alt48=3;
                int LA48_0 = input.LA(1);

                if ( LA48_0 == 70 && getUnorderedGroupHelper().canSelect(grammarAccess.getActionExecutionAccess().getUnorderedGroup_4(), 0) ) {
                    alt48=1;
                }
                else if ( LA48_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getActionExecutionAccess().getUnorderedGroup_4(), 1) ) {
                    alt48=2;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalPanoptesX.g:3808:4: ({...}? => ( ({...}? => (otherlv_5= 'action' ( ( ruleEString ) ) ) ) ) )
            	    {
            	    // InternalPanoptesX.g:3808:4: ({...}? => ( ({...}? => (otherlv_5= 'action' ( ( ruleEString ) ) ) ) ) )
            	    // InternalPanoptesX.g:3809:5: {...}? => ( ({...}? => (otherlv_5= 'action' ( ( ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActionExecutionAccess().getUnorderedGroup_4(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleActionExecution", "getUnorderedGroupHelper().canSelect(grammarAccess.getActionExecutionAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // InternalPanoptesX.g:3809:112: ( ({...}? => (otherlv_5= 'action' ( ( ruleEString ) ) ) ) )
            	    // InternalPanoptesX.g:3810:6: ({...}? => (otherlv_5= 'action' ( ( ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getActionExecutionAccess().getUnorderedGroup_4(), 0);
            	    					
            	    // InternalPanoptesX.g:3813:9: ({...}? => (otherlv_5= 'action' ( ( ruleEString ) ) ) )
            	    // InternalPanoptesX.g:3813:10: {...}? => (otherlv_5= 'action' ( ( ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleActionExecution", "true");
            	    }
            	    // InternalPanoptesX.g:3813:19: (otherlv_5= 'action' ( ( ruleEString ) ) )
            	    // InternalPanoptesX.g:3813:20: otherlv_5= 'action' ( ( ruleEString ) )
            	    {
            	    otherlv_5=(Token)match(input,70,FOLLOW_4); 

            	    									newLeafNode(otherlv_5, grammarAccess.getActionExecutionAccess().getActionKeyword_4_0_0());
            	    								
            	    // InternalPanoptesX.g:3817:9: ( ( ruleEString ) )
            	    // InternalPanoptesX.g:3818:10: ( ruleEString )
            	    {
            	    // InternalPanoptesX.g:3818:10: ( ruleEString )
            	    // InternalPanoptesX.g:3819:11: ruleEString
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
            	    // InternalPanoptesX.g:3839:4: ({...}? => ( ({...}? => (otherlv_7= 'parameter' otherlv_8= 'values' ( (lv_parameterValueMap_9_0= ruleparameterValueEntry ) ) (otherlv_10= ',' ( (lv_parameterValueMap_11_0= ruleparameterValueEntry ) ) )* ) ) ) )
            	    {
            	    // InternalPanoptesX.g:3839:4: ({...}? => ( ({...}? => (otherlv_7= 'parameter' otherlv_8= 'values' ( (lv_parameterValueMap_9_0= ruleparameterValueEntry ) ) (otherlv_10= ',' ( (lv_parameterValueMap_11_0= ruleparameterValueEntry ) ) )* ) ) ) )
            	    // InternalPanoptesX.g:3840:5: {...}? => ( ({...}? => (otherlv_7= 'parameter' otherlv_8= 'values' ( (lv_parameterValueMap_9_0= ruleparameterValueEntry ) ) (otherlv_10= ',' ( (lv_parameterValueMap_11_0= ruleparameterValueEntry ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActionExecutionAccess().getUnorderedGroup_4(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleActionExecution", "getUnorderedGroupHelper().canSelect(grammarAccess.getActionExecutionAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // InternalPanoptesX.g:3840:112: ( ({...}? => (otherlv_7= 'parameter' otherlv_8= 'values' ( (lv_parameterValueMap_9_0= ruleparameterValueEntry ) ) (otherlv_10= ',' ( (lv_parameterValueMap_11_0= ruleparameterValueEntry ) ) )* ) ) )
            	    // InternalPanoptesX.g:3841:6: ({...}? => (otherlv_7= 'parameter' otherlv_8= 'values' ( (lv_parameterValueMap_9_0= ruleparameterValueEntry ) ) (otherlv_10= ',' ( (lv_parameterValueMap_11_0= ruleparameterValueEntry ) ) )* ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getActionExecutionAccess().getUnorderedGroup_4(), 1);
            	    					
            	    // InternalPanoptesX.g:3844:9: ({...}? => (otherlv_7= 'parameter' otherlv_8= 'values' ( (lv_parameterValueMap_9_0= ruleparameterValueEntry ) ) (otherlv_10= ',' ( (lv_parameterValueMap_11_0= ruleparameterValueEntry ) ) )* ) )
            	    // InternalPanoptesX.g:3844:10: {...}? => (otherlv_7= 'parameter' otherlv_8= 'values' ( (lv_parameterValueMap_9_0= ruleparameterValueEntry ) ) (otherlv_10= ',' ( (lv_parameterValueMap_11_0= ruleparameterValueEntry ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleActionExecution", "true");
            	    }
            	    // InternalPanoptesX.g:3844:19: (otherlv_7= 'parameter' otherlv_8= 'values' ( (lv_parameterValueMap_9_0= ruleparameterValueEntry ) ) (otherlv_10= ',' ( (lv_parameterValueMap_11_0= ruleparameterValueEntry ) ) )* )
            	    // InternalPanoptesX.g:3844:20: otherlv_7= 'parameter' otherlv_8= 'values' ( (lv_parameterValueMap_9_0= ruleparameterValueEntry ) ) (otherlv_10= ',' ( (lv_parameterValueMap_11_0= ruleparameterValueEntry ) ) )*
            	    {
            	    otherlv_7=(Token)match(input,48,FOLLOW_40); 

            	    									newLeafNode(otherlv_7, grammarAccess.getActionExecutionAccess().getParameterKeyword_4_1_0());
            	    								
            	    otherlv_8=(Token)match(input,49,FOLLOW_4); 

            	    									newLeafNode(otherlv_8, grammarAccess.getActionExecutionAccess().getValuesKeyword_4_1_1());
            	    								
            	    // InternalPanoptesX.g:3852:9: ( (lv_parameterValueMap_9_0= ruleparameterValueEntry ) )
            	    // InternalPanoptesX.g:3853:10: (lv_parameterValueMap_9_0= ruleparameterValueEntry )
            	    {
            	    // InternalPanoptesX.g:3853:10: (lv_parameterValueMap_9_0= ruleparameterValueEntry )
            	    // InternalPanoptesX.g:3854:11: lv_parameterValueMap_9_0= ruleparameterValueEntry
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

            	    // InternalPanoptesX.g:3871:9: (otherlv_10= ',' ( (lv_parameterValueMap_11_0= ruleparameterValueEntry ) ) )*
            	    loop47:
            	    do {
            	        int alt47=2;
            	        int LA47_0 = input.LA(1);

            	        if ( (LA47_0==15) ) {
            	            alt47=1;
            	        }


            	        switch (alt47) {
            	    	case 1 :
            	    	    // InternalPanoptesX.g:3872:10: otherlv_10= ',' ( (lv_parameterValueMap_11_0= ruleparameterValueEntry ) )
            	    	    {
            	    	    otherlv_10=(Token)match(input,15,FOLLOW_4); 

            	    	    										newLeafNode(otherlv_10, grammarAccess.getActionExecutionAccess().getCommaKeyword_4_1_3_0());
            	    	    									
            	    	    // InternalPanoptesX.g:3876:10: ( (lv_parameterValueMap_11_0= ruleparameterValueEntry ) )
            	    	    // InternalPanoptesX.g:3877:11: (lv_parameterValueMap_11_0= ruleparameterValueEntry )
            	    	    {
            	    	    // InternalPanoptesX.g:3877:11: (lv_parameterValueMap_11_0= ruleparameterValueEntry )
            	    	    // InternalPanoptesX.g:3878:12: lv_parameterValueMap_11_0= ruleparameterValueEntry
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
            	    	    break loop47;
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
            	    if ( cnt48 >= 1 ) break loop48;
                        EarlyExitException eee =
                            new EarlyExitException(48, input);
                        throw eee;
                }
                cnt48++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getActionExecutionAccess().getUnorderedGroup_4()) ) {
                throw new FailedPredicateException(input, "ruleActionExecution", "getUnorderedGroupHelper().canLeave(grammarAccess.getActionExecutionAccess().getUnorderedGroup_4())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getActionExecutionAccess().getUnorderedGroup_4());
            				

            }

            otherlv_12=(Token)match(input,17,FOLLOW_2); 

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
    // InternalPanoptesX.g:3918:1: entryRuleEIntegerObject returns [String current=null] : iv_ruleEIntegerObject= ruleEIntegerObject EOF ;
    public final String entryRuleEIntegerObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEIntegerObject = null;


        try {
            // InternalPanoptesX.g:3918:54: (iv_ruleEIntegerObject= ruleEIntegerObject EOF )
            // InternalPanoptesX.g:3919:2: iv_ruleEIntegerObject= ruleEIntegerObject EOF
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
    // InternalPanoptesX.g:3925:1: ruleEIntegerObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEIntegerObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalPanoptesX.g:3931:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalPanoptesX.g:3932:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalPanoptesX.g:3932:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalPanoptesX.g:3933:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalPanoptesX.g:3933:3: (kw= '-' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==71) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalPanoptesX.g:3934:4: kw= '-'
                    {
                    kw=(Token)match(input,71,FOLLOW_62); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntegerObjectAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntegerObjectAccess().getINTTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleEIntegerObject"


    // $ANTLR start "entryRuleEString"
    // InternalPanoptesX.g:3951:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalPanoptesX.g:3951:47: (iv_ruleEString= ruleEString EOF )
            // InternalPanoptesX.g:3952:2: iv_ruleEString= ruleEString EOF
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
    // InternalPanoptesX.g:3958:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_PANOPTESSTRING_1= RULE_PANOPTESSTRING ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_PANOPTESSTRING_1=null;


        	enterRule();

        try {
            // InternalPanoptesX.g:3964:2: ( (this_STRING_0= RULE_STRING | this_PANOPTESSTRING_1= RULE_PANOPTESSTRING ) )
            // InternalPanoptesX.g:3965:2: (this_STRING_0= RULE_STRING | this_PANOPTESSTRING_1= RULE_PANOPTESSTRING )
            {
            // InternalPanoptesX.g:3965:2: (this_STRING_0= RULE_STRING | this_PANOPTESSTRING_1= RULE_PANOPTESSTRING )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_STRING) ) {
                alt50=1;
            }
            else if ( (LA50_0==RULE_PANOPTESSTRING) ) {
                alt50=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // InternalPanoptesX.g:3966:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPanoptesX.g:3974:3: this_PANOPTESSTRING_1= RULE_PANOPTESSTRING
                    {
                    this_PANOPTESSTRING_1=(Token)match(input,RULE_PANOPTESSTRING,FOLLOW_2); 

                    			current.merge(this_PANOPTESSTRING_1);
                    		

                    			newLeafNode(this_PANOPTESSTRING_1, grammarAccess.getEStringAccess().getPANOPTESSTRINGTerminalRuleCall_1());
                    		

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
    // InternalPanoptesX.g:3985:1: rulestatisticalVariableType returns [Enumerator current=null] : ( (enumLiteral_0= 'continuous' ) | (enumLiteral_1= 'categorical' ) | (enumLiteral_2= 'ordered categorical' ) ) ;
    public final Enumerator rulestatisticalVariableType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalPanoptesX.g:3991:2: ( ( (enumLiteral_0= 'continuous' ) | (enumLiteral_1= 'categorical' ) | (enumLiteral_2= 'ordered categorical' ) ) )
            // InternalPanoptesX.g:3992:2: ( (enumLiteral_0= 'continuous' ) | (enumLiteral_1= 'categorical' ) | (enumLiteral_2= 'ordered categorical' ) )
            {
            // InternalPanoptesX.g:3992:2: ( (enumLiteral_0= 'continuous' ) | (enumLiteral_1= 'categorical' ) | (enumLiteral_2= 'ordered categorical' ) )
            int alt51=3;
            switch ( input.LA(1) ) {
            case 72:
                {
                alt51=1;
                }
                break;
            case 73:
                {
                alt51=2;
                }
                break;
            case 74:
                {
                alt51=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }

            switch (alt51) {
                case 1 :
                    // InternalPanoptesX.g:3993:3: (enumLiteral_0= 'continuous' )
                    {
                    // InternalPanoptesX.g:3993:3: (enumLiteral_0= 'continuous' )
                    // InternalPanoptesX.g:3994:4: enumLiteral_0= 'continuous'
                    {
                    enumLiteral_0=(Token)match(input,72,FOLLOW_2); 

                    				current = grammarAccess.getStatisticalVariableTypeAccess().getContinuousEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getStatisticalVariableTypeAccess().getContinuousEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPanoptesX.g:4001:3: (enumLiteral_1= 'categorical' )
                    {
                    // InternalPanoptesX.g:4001:3: (enumLiteral_1= 'categorical' )
                    // InternalPanoptesX.g:4002:4: enumLiteral_1= 'categorical'
                    {
                    enumLiteral_1=(Token)match(input,73,FOLLOW_2); 

                    				current = grammarAccess.getStatisticalVariableTypeAccess().getCategoricalEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getStatisticalVariableTypeAccess().getCategoricalEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalPanoptesX.g:4009:3: (enumLiteral_2= 'ordered categorical' )
                    {
                    // InternalPanoptesX.g:4009:3: (enumLiteral_2= 'ordered categorical' )
                    // InternalPanoptesX.g:4010:4: enumLiteral_2= 'ordered categorical'
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
    // InternalPanoptesX.g:4020:1: rulefrequencyEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'hour' ) | (enumLiteral_1= 'day' ) | (enumLiteral_2= 'week' ) | (enumLiteral_3= 'month' ) | (enumLiteral_4= 'year' ) ) ;
    public final Enumerator rulefrequencyEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalPanoptesX.g:4026:2: ( ( (enumLiteral_0= 'hour' ) | (enumLiteral_1= 'day' ) | (enumLiteral_2= 'week' ) | (enumLiteral_3= 'month' ) | (enumLiteral_4= 'year' ) ) )
            // InternalPanoptesX.g:4027:2: ( (enumLiteral_0= 'hour' ) | (enumLiteral_1= 'day' ) | (enumLiteral_2= 'week' ) | (enumLiteral_3= 'month' ) | (enumLiteral_4= 'year' ) )
            {
            // InternalPanoptesX.g:4027:2: ( (enumLiteral_0= 'hour' ) | (enumLiteral_1= 'day' ) | (enumLiteral_2= 'week' ) | (enumLiteral_3= 'month' ) | (enumLiteral_4= 'year' ) )
            int alt52=5;
            switch ( input.LA(1) ) {
            case 75:
                {
                alt52=1;
                }
                break;
            case 76:
                {
                alt52=2;
                }
                break;
            case 77:
                {
                alt52=3;
                }
                break;
            case 78:
                {
                alt52=4;
                }
                break;
            case 79:
                {
                alt52=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }

            switch (alt52) {
                case 1 :
                    // InternalPanoptesX.g:4028:3: (enumLiteral_0= 'hour' )
                    {
                    // InternalPanoptesX.g:4028:3: (enumLiteral_0= 'hour' )
                    // InternalPanoptesX.g:4029:4: enumLiteral_0= 'hour'
                    {
                    enumLiteral_0=(Token)match(input,75,FOLLOW_2); 

                    				current = grammarAccess.getFrequencyEnumAccess().getHourlyEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getFrequencyEnumAccess().getHourlyEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPanoptesX.g:4036:3: (enumLiteral_1= 'day' )
                    {
                    // InternalPanoptesX.g:4036:3: (enumLiteral_1= 'day' )
                    // InternalPanoptesX.g:4037:4: enumLiteral_1= 'day'
                    {
                    enumLiteral_1=(Token)match(input,76,FOLLOW_2); 

                    				current = grammarAccess.getFrequencyEnumAccess().getDailyEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getFrequencyEnumAccess().getDailyEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalPanoptesX.g:4044:3: (enumLiteral_2= 'week' )
                    {
                    // InternalPanoptesX.g:4044:3: (enumLiteral_2= 'week' )
                    // InternalPanoptesX.g:4045:4: enumLiteral_2= 'week'
                    {
                    enumLiteral_2=(Token)match(input,77,FOLLOW_2); 

                    				current = grammarAccess.getFrequencyEnumAccess().getWeeklyEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getFrequencyEnumAccess().getWeeklyEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalPanoptesX.g:4052:3: (enumLiteral_3= 'month' )
                    {
                    // InternalPanoptesX.g:4052:3: (enumLiteral_3= 'month' )
                    // InternalPanoptesX.g:4053:4: enumLiteral_3= 'month'
                    {
                    enumLiteral_3=(Token)match(input,78,FOLLOW_2); 

                    				current = grammarAccess.getFrequencyEnumAccess().getMonthlyEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getFrequencyEnumAccess().getMonthlyEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalPanoptesX.g:4060:3: (enumLiteral_4= 'year' )
                    {
                    // InternalPanoptesX.g:4060:3: (enumLiteral_4= 'year' )
                    // InternalPanoptesX.g:4061:4: enumLiteral_4= 'year'
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
    // InternalPanoptesX.g:4071:1: ruleparameterType returns [Enumerator current=null] : ( (enumLiteral_0= 'Integer' ) | (enumLiteral_1= 'Real' ) | (enumLiteral_2= 'String' ) | (enumLiteral_3= 'Boolean' ) ) ;
    public final Enumerator ruleparameterType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalPanoptesX.g:4077:2: ( ( (enumLiteral_0= 'Integer' ) | (enumLiteral_1= 'Real' ) | (enumLiteral_2= 'String' ) | (enumLiteral_3= 'Boolean' ) ) )
            // InternalPanoptesX.g:4078:2: ( (enumLiteral_0= 'Integer' ) | (enumLiteral_1= 'Real' ) | (enumLiteral_2= 'String' ) | (enumLiteral_3= 'Boolean' ) )
            {
            // InternalPanoptesX.g:4078:2: ( (enumLiteral_0= 'Integer' ) | (enumLiteral_1= 'Real' ) | (enumLiteral_2= 'String' ) | (enumLiteral_3= 'Boolean' ) )
            int alt53=4;
            switch ( input.LA(1) ) {
            case 80:
                {
                alt53=1;
                }
                break;
            case 81:
                {
                alt53=2;
                }
                break;
            case 82:
                {
                alt53=3;
                }
                break;
            case 83:
                {
                alt53=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // InternalPanoptesX.g:4079:3: (enumLiteral_0= 'Integer' )
                    {
                    // InternalPanoptesX.g:4079:3: (enumLiteral_0= 'Integer' )
                    // InternalPanoptesX.g:4080:4: enumLiteral_0= 'Integer'
                    {
                    enumLiteral_0=(Token)match(input,80,FOLLOW_2); 

                    				current = grammarAccess.getParameterTypeAccess().getIntegerEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getParameterTypeAccess().getIntegerEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPanoptesX.g:4087:3: (enumLiteral_1= 'Real' )
                    {
                    // InternalPanoptesX.g:4087:3: (enumLiteral_1= 'Real' )
                    // InternalPanoptesX.g:4088:4: enumLiteral_1= 'Real'
                    {
                    enumLiteral_1=(Token)match(input,81,FOLLOW_2); 

                    				current = grammarAccess.getParameterTypeAccess().getRealEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getParameterTypeAccess().getRealEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalPanoptesX.g:4095:3: (enumLiteral_2= 'String' )
                    {
                    // InternalPanoptesX.g:4095:3: (enumLiteral_2= 'String' )
                    // InternalPanoptesX.g:4096:4: enumLiteral_2= 'String'
                    {
                    enumLiteral_2=(Token)match(input,82,FOLLOW_2); 

                    				current = grammarAccess.getParameterTypeAccess().getStringEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getParameterTypeAccess().getStringEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalPanoptesX.g:4103:3: (enumLiteral_3= 'Boolean' )
                    {
                    // InternalPanoptesX.g:4103:3: (enumLiteral_3= 'Boolean' )
                    // InternalPanoptesX.g:4104:4: enumLiteral_3= 'Boolean'
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000058090041002L,0x0000000000000004L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000003C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000034000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000007A0000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000007A8000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002002002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000700L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004020000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004028000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0804080060020000L,0x0000000000000020L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0804080060028000L,0x0000000000000020L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000005700000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000005700020000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000080L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000002000000000L,0x0000000000000700L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000005700028000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000060L,0x0000000000000008L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000004700000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000004700020000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000004700028000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0001F00000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0001F00000020000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0001F00000028000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0369900000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0369900000020000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0369900000028000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x3000000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x8000000000000072L,0x0000000000000080L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000000L,0x000000000000F800L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000024000020000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000024000028000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000000L,0x00000000000F0000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0001000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0001000000020000L,0x0000000000000040L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0001000000028000L,0x0000000000000040L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000010L});

}
