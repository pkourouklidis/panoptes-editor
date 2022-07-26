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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Model'", "'{'", "'uses'", "','", "'outputs'", "'}'", "'FeatureStore'", "'features'", "'entities'", "'labels'", "'request'", "'data'", "'keys'", "':'", "'requires'", "'predicts'", "'Deployment'", "'model'", "'inputs'", "'BaseAlgorithm'", "'codebase'", "'runtime'", "'severity'", "'levels'", "'accepts'", "'only'", "'parameters'", "'HigherOrderAlgorithm'", "'BaseAlgorithmRuntime'", "'endpoint'", "'HigherOrderAlgorithmRuntime'", "'BaseAlgorithmExecution'", "'algorithm'", "'from'", "'live'", "'use'", "'historic'", "'actions'", "'parameter'", "'values'", "'HigherOrderAlgorithmExecution'", "'observed'", "'execution'", "'minimum'", "'min'", "'observations'", "'maximum'", "'max'", "'->'", "'When'", "'when'", "'or'", "'Execute'", "'and'", "'one'", "'passed'", "'samples'", "'received'", "'predictions'", "'served'", "'Action'", "'mandatory'", "'='", "'ActionExecution'", "'action'", "'-'", "'continuous'", "'categorical'", "'ordered categorical'", "'hour'", "'day'", "'week'", "'month'", "'year'", "'Integer'", "'Real'", "'String'", "'Boolean'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
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
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
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
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
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
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__88=88;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__84=84;
    public static final int T__41=41;
    public static final int T__85=85;
    public static final int T__42=42;
    public static final int T__86=86;
    public static final int T__43=43;
    public static final int T__87=87;

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
                case 17:
                    {
                    alt1=1;
                    }
                    break;
                case 11:
                    {
                    alt1=2;
                    }
                    break;
                case 27:
                    {
                    alt1=3;
                    }
                    break;
                case 30:
                case 38:
                    {
                    alt1=4;
                    }
                    break;
                case 39:
                case 41:
                    {
                    alt1=5;
                    }
                    break;
                case 71:
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
    // InternalPanoptesX.g:210:1: ruleModel returns [EObject current=null] : ( () otherlv_1= 'Model' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'uses' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= 'outputs' ( (lv_output_9_0= rulePrediction ) ) otherlv_10= '}' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_output_9_0 = null;



        	enterRule();

        try {
            // InternalPanoptesX.g:216:2: ( ( () otherlv_1= 'Model' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'uses' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= 'outputs' ( (lv_output_9_0= rulePrediction ) ) otherlv_10= '}' ) )
            // InternalPanoptesX.g:217:2: ( () otherlv_1= 'Model' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'uses' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= 'outputs' ( (lv_output_9_0= rulePrediction ) ) otherlv_10= '}' )
            {
            // InternalPanoptesX.g:217:2: ( () otherlv_1= 'Model' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'uses' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= 'outputs' ( (lv_output_9_0= rulePrediction ) ) otherlv_10= '}' )
            // InternalPanoptesX.g:218:3: () otherlv_1= 'Model' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'uses' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= 'outputs' ( (lv_output_9_0= rulePrediction ) ) otherlv_10= '}'
            {
            // InternalPanoptesX.g:218:3: ()
            // InternalPanoptesX.g:219:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getModelAccess().getModelAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_4); 

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

            otherlv_3=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getModelAccess().getUsesKeyword_4());
            		
            // InternalPanoptesX.g:256:3: ( ( ruleEString ) )
            // InternalPanoptesX.g:257:4: ( ruleEString )
            {
            // InternalPanoptesX.g:257:4: ( ruleEString )
            // InternalPanoptesX.g:258:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModelRule());
            					}
            				

            					newCompositeNode(grammarAccess.getModelAccess().getInputsFeatureCrossReference_5_0());
            				
            pushFollow(FOLLOW_7);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPanoptesX.g:272:3: (otherlv_6= ',' ( ( ruleEString ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalPanoptesX.g:273:4: otherlv_6= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,14,FOLLOW_4); 

            	    				newLeafNode(otherlv_6, grammarAccess.getModelAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalPanoptesX.g:277:4: ( ( ruleEString ) )
            	    // InternalPanoptesX.g:278:5: ( ruleEString )
            	    {
            	    // InternalPanoptesX.g:278:5: ( ruleEString )
            	    // InternalPanoptesX.g:279:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getModelRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getModelAccess().getInputsFeatureCrossReference_6_1_0());
            	    					
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

            otherlv_8=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_8, grammarAccess.getModelAccess().getOutputsKeyword_7());
            		
            // InternalPanoptesX.g:298:3: ( (lv_output_9_0= rulePrediction ) )
            // InternalPanoptesX.g:299:4: (lv_output_9_0= rulePrediction )
            {
            // InternalPanoptesX.g:299:4: (lv_output_9_0= rulePrediction )
            // InternalPanoptesX.g:300:5: lv_output_9_0= rulePrediction
            {

            					newCompositeNode(grammarAccess.getModelAccess().getOutputPredictionParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_8);
            lv_output_9_0=rulePrediction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"output",
            						lv_output_9_0,
            						"org.lowcomote.panoptes.PanoptesX.Prediction");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_9());
            		

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
    // InternalPanoptesX.g:325:1: entryRuleFeatureStore returns [EObject current=null] : iv_ruleFeatureStore= ruleFeatureStore EOF ;
    public final EObject entryRuleFeatureStore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureStore = null;


        try {
            // InternalPanoptesX.g:325:53: (iv_ruleFeatureStore= ruleFeatureStore EOF )
            // InternalPanoptesX.g:326:2: iv_ruleFeatureStore= ruleFeatureStore EOF
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
    // InternalPanoptesX.g:332:1: ruleFeatureStore returns [EObject current=null] : ( () otherlv_1= 'FeatureStore' otherlv_2= '{' (otherlv_3= 'features' ( (lv_features_4_0= ruleFeature ) ) (otherlv_5= ',' ( (lv_features_6_0= ruleFeature ) ) )* )? (otherlv_7= 'entities' ( (lv_entities_8_0= ruleEntity ) ) (otherlv_9= ',' ( (lv_entities_10_0= ruleEntity ) ) )* )? (otherlv_11= 'labels' ( (lv_labels_12_0= ruleLabel ) ) (otherlv_13= ',' ( (lv_labels_14_0= ruleLabel ) ) )* )? (otherlv_15= 'request' otherlv_16= 'data' ( (lv_requestData_17_0= ruleRequestData ) ) (otherlv_18= ',' ( (lv_requestData_19_0= ruleRequestData ) ) )* )? otherlv_20= '}' ) ;
    public final EObject ruleFeatureStore() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        EObject lv_features_4_0 = null;

        EObject lv_features_6_0 = null;

        EObject lv_entities_8_0 = null;

        EObject lv_entities_10_0 = null;

        EObject lv_labels_12_0 = null;

        EObject lv_labels_14_0 = null;

        EObject lv_requestData_17_0 = null;

        EObject lv_requestData_19_0 = null;



        	enterRule();

        try {
            // InternalPanoptesX.g:338:2: ( ( () otherlv_1= 'FeatureStore' otherlv_2= '{' (otherlv_3= 'features' ( (lv_features_4_0= ruleFeature ) ) (otherlv_5= ',' ( (lv_features_6_0= ruleFeature ) ) )* )? (otherlv_7= 'entities' ( (lv_entities_8_0= ruleEntity ) ) (otherlv_9= ',' ( (lv_entities_10_0= ruleEntity ) ) )* )? (otherlv_11= 'labels' ( (lv_labels_12_0= ruleLabel ) ) (otherlv_13= ',' ( (lv_labels_14_0= ruleLabel ) ) )* )? (otherlv_15= 'request' otherlv_16= 'data' ( (lv_requestData_17_0= ruleRequestData ) ) (otherlv_18= ',' ( (lv_requestData_19_0= ruleRequestData ) ) )* )? otherlv_20= '}' ) )
            // InternalPanoptesX.g:339:2: ( () otherlv_1= 'FeatureStore' otherlv_2= '{' (otherlv_3= 'features' ( (lv_features_4_0= ruleFeature ) ) (otherlv_5= ',' ( (lv_features_6_0= ruleFeature ) ) )* )? (otherlv_7= 'entities' ( (lv_entities_8_0= ruleEntity ) ) (otherlv_9= ',' ( (lv_entities_10_0= ruleEntity ) ) )* )? (otherlv_11= 'labels' ( (lv_labels_12_0= ruleLabel ) ) (otherlv_13= ',' ( (lv_labels_14_0= ruleLabel ) ) )* )? (otherlv_15= 'request' otherlv_16= 'data' ( (lv_requestData_17_0= ruleRequestData ) ) (otherlv_18= ',' ( (lv_requestData_19_0= ruleRequestData ) ) )* )? otherlv_20= '}' )
            {
            // InternalPanoptesX.g:339:2: ( () otherlv_1= 'FeatureStore' otherlv_2= '{' (otherlv_3= 'features' ( (lv_features_4_0= ruleFeature ) ) (otherlv_5= ',' ( (lv_features_6_0= ruleFeature ) ) )* )? (otherlv_7= 'entities' ( (lv_entities_8_0= ruleEntity ) ) (otherlv_9= ',' ( (lv_entities_10_0= ruleEntity ) ) )* )? (otherlv_11= 'labels' ( (lv_labels_12_0= ruleLabel ) ) (otherlv_13= ',' ( (lv_labels_14_0= ruleLabel ) ) )* )? (otherlv_15= 'request' otherlv_16= 'data' ( (lv_requestData_17_0= ruleRequestData ) ) (otherlv_18= ',' ( (lv_requestData_19_0= ruleRequestData ) ) )* )? otherlv_20= '}' )
            // InternalPanoptesX.g:340:3: () otherlv_1= 'FeatureStore' otherlv_2= '{' (otherlv_3= 'features' ( (lv_features_4_0= ruleFeature ) ) (otherlv_5= ',' ( (lv_features_6_0= ruleFeature ) ) )* )? (otherlv_7= 'entities' ( (lv_entities_8_0= ruleEntity ) ) (otherlv_9= ',' ( (lv_entities_10_0= ruleEntity ) ) )* )? (otherlv_11= 'labels' ( (lv_labels_12_0= ruleLabel ) ) (otherlv_13= ',' ( (lv_labels_14_0= ruleLabel ) ) )* )? (otherlv_15= 'request' otherlv_16= 'data' ( (lv_requestData_17_0= ruleRequestData ) ) (otherlv_18= ',' ( (lv_requestData_19_0= ruleRequestData ) ) )* )? otherlv_20= '}'
            {
            // InternalPanoptesX.g:340:3: ()
            // InternalPanoptesX.g:341:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFeatureStoreAccess().getFeatureStoreAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getFeatureStoreAccess().getFeatureStoreKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getFeatureStoreAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalPanoptesX.g:355:3: (otherlv_3= 'features' ( (lv_features_4_0= ruleFeature ) ) (otherlv_5= ',' ( (lv_features_6_0= ruleFeature ) ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalPanoptesX.g:356:4: otherlv_3= 'features' ( (lv_features_4_0= ruleFeature ) ) (otherlv_5= ',' ( (lv_features_6_0= ruleFeature ) ) )*
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getFeatureStoreAccess().getFeaturesKeyword_3_0());
                    			
                    // InternalPanoptesX.g:360:4: ( (lv_features_4_0= ruleFeature ) )
                    // InternalPanoptesX.g:361:5: (lv_features_4_0= ruleFeature )
                    {
                    // InternalPanoptesX.g:361:5: (lv_features_4_0= ruleFeature )
                    // InternalPanoptesX.g:362:6: lv_features_4_0= ruleFeature
                    {

                    						newCompositeNode(grammarAccess.getFeatureStoreAccess().getFeaturesFeatureParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_features_4_0=ruleFeature();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFeatureStoreRule());
                    						}
                    						add(
                    							current,
                    							"features",
                    							lv_features_4_0,
                    							"org.lowcomote.panoptes.PanoptesX.Feature");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPanoptesX.g:379:4: (otherlv_5= ',' ( (lv_features_6_0= ruleFeature ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==14) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalPanoptesX.g:380:5: otherlv_5= ',' ( (lv_features_6_0= ruleFeature ) )
                    	    {
                    	    otherlv_5=(Token)match(input,14,FOLLOW_4); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getFeatureStoreAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalPanoptesX.g:384:5: ( (lv_features_6_0= ruleFeature ) )
                    	    // InternalPanoptesX.g:385:6: (lv_features_6_0= ruleFeature )
                    	    {
                    	    // InternalPanoptesX.g:385:6: (lv_features_6_0= ruleFeature )
                    	    // InternalPanoptesX.g:386:7: lv_features_6_0= ruleFeature
                    	    {

                    	    							newCompositeNode(grammarAccess.getFeatureStoreAccess().getFeaturesFeatureParserRuleCall_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_features_6_0=ruleFeature();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFeatureStoreRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"features",
                    	    								lv_features_6_0,
                    	    								"org.lowcomote.panoptes.PanoptesX.Feature");
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
                    break;

            }

            // InternalPanoptesX.g:405:3: (otherlv_7= 'entities' ( (lv_entities_8_0= ruleEntity ) ) (otherlv_9= ',' ( (lv_entities_10_0= ruleEntity ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalPanoptesX.g:406:4: otherlv_7= 'entities' ( (lv_entities_8_0= ruleEntity ) ) (otherlv_9= ',' ( (lv_entities_10_0= ruleEntity ) ) )*
                    {
                    otherlv_7=(Token)match(input,19,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getFeatureStoreAccess().getEntitiesKeyword_4_0());
                    			
                    // InternalPanoptesX.g:410:4: ( (lv_entities_8_0= ruleEntity ) )
                    // InternalPanoptesX.g:411:5: (lv_entities_8_0= ruleEntity )
                    {
                    // InternalPanoptesX.g:411:5: (lv_entities_8_0= ruleEntity )
                    // InternalPanoptesX.g:412:6: lv_entities_8_0= ruleEntity
                    {

                    						newCompositeNode(grammarAccess.getFeatureStoreAccess().getEntitiesEntityParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_entities_8_0=ruleEntity();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFeatureStoreRule());
                    						}
                    						add(
                    							current,
                    							"entities",
                    							lv_entities_8_0,
                    							"org.lowcomote.panoptes.PanoptesX.Entity");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPanoptesX.g:429:4: (otherlv_9= ',' ( (lv_entities_10_0= ruleEntity ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==14) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalPanoptesX.g:430:5: otherlv_9= ',' ( (lv_entities_10_0= ruleEntity ) )
                    	    {
                    	    otherlv_9=(Token)match(input,14,FOLLOW_4); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getFeatureStoreAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalPanoptesX.g:434:5: ( (lv_entities_10_0= ruleEntity ) )
                    	    // InternalPanoptesX.g:435:6: (lv_entities_10_0= ruleEntity )
                    	    {
                    	    // InternalPanoptesX.g:435:6: (lv_entities_10_0= ruleEntity )
                    	    // InternalPanoptesX.g:436:7: lv_entities_10_0= ruleEntity
                    	    {

                    	    							newCompositeNode(grammarAccess.getFeatureStoreAccess().getEntitiesEntityParserRuleCall_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_entities_10_0=ruleEntity();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFeatureStoreRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"entities",
                    	    								lv_entities_10_0,
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
                    break;

            }

            // InternalPanoptesX.g:455:3: (otherlv_11= 'labels' ( (lv_labels_12_0= ruleLabel ) ) (otherlv_13= ',' ( (lv_labels_14_0= ruleLabel ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalPanoptesX.g:456:4: otherlv_11= 'labels' ( (lv_labels_12_0= ruleLabel ) ) (otherlv_13= ',' ( (lv_labels_14_0= ruleLabel ) ) )*
                    {
                    otherlv_11=(Token)match(input,20,FOLLOW_4); 

                    				newLeafNode(otherlv_11, grammarAccess.getFeatureStoreAccess().getLabelsKeyword_5_0());
                    			
                    // InternalPanoptesX.g:460:4: ( (lv_labels_12_0= ruleLabel ) )
                    // InternalPanoptesX.g:461:5: (lv_labels_12_0= ruleLabel )
                    {
                    // InternalPanoptesX.g:461:5: (lv_labels_12_0= ruleLabel )
                    // InternalPanoptesX.g:462:6: lv_labels_12_0= ruleLabel
                    {

                    						newCompositeNode(grammarAccess.getFeatureStoreAccess().getLabelsLabelParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_labels_12_0=ruleLabel();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFeatureStoreRule());
                    						}
                    						add(
                    							current,
                    							"labels",
                    							lv_labels_12_0,
                    							"org.lowcomote.panoptes.PanoptesX.Label");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPanoptesX.g:479:4: (otherlv_13= ',' ( (lv_labels_14_0= ruleLabel ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==14) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalPanoptesX.g:480:5: otherlv_13= ',' ( (lv_labels_14_0= ruleLabel ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_4); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getFeatureStoreAccess().getCommaKeyword_5_2_0());
                    	    				
                    	    // InternalPanoptesX.g:484:5: ( (lv_labels_14_0= ruleLabel ) )
                    	    // InternalPanoptesX.g:485:6: (lv_labels_14_0= ruleLabel )
                    	    {
                    	    // InternalPanoptesX.g:485:6: (lv_labels_14_0= ruleLabel )
                    	    // InternalPanoptesX.g:486:7: lv_labels_14_0= ruleLabel
                    	    {

                    	    							newCompositeNode(grammarAccess.getFeatureStoreAccess().getLabelsLabelParserRuleCall_5_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_labels_14_0=ruleLabel();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFeatureStoreRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"labels",
                    	    								lv_labels_14_0,
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
                    break;

            }

            // InternalPanoptesX.g:505:3: (otherlv_15= 'request' otherlv_16= 'data' ( (lv_requestData_17_0= ruleRequestData ) ) (otherlv_18= ',' ( (lv_requestData_19_0= ruleRequestData ) ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalPanoptesX.g:506:4: otherlv_15= 'request' otherlv_16= 'data' ( (lv_requestData_17_0= ruleRequestData ) ) (otherlv_18= ',' ( (lv_requestData_19_0= ruleRequestData ) ) )*
                    {
                    otherlv_15=(Token)match(input,21,FOLLOW_13); 

                    				newLeafNode(otherlv_15, grammarAccess.getFeatureStoreAccess().getRequestKeyword_6_0());
                    			
                    otherlv_16=(Token)match(input,22,FOLLOW_4); 

                    				newLeafNode(otherlv_16, grammarAccess.getFeatureStoreAccess().getDataKeyword_6_1());
                    			
                    // InternalPanoptesX.g:514:4: ( (lv_requestData_17_0= ruleRequestData ) )
                    // InternalPanoptesX.g:515:5: (lv_requestData_17_0= ruleRequestData )
                    {
                    // InternalPanoptesX.g:515:5: (lv_requestData_17_0= ruleRequestData )
                    // InternalPanoptesX.g:516:6: lv_requestData_17_0= ruleRequestData
                    {

                    						newCompositeNode(grammarAccess.getFeatureStoreAccess().getRequestDataRequestDataParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_requestData_17_0=ruleRequestData();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFeatureStoreRule());
                    						}
                    						add(
                    							current,
                    							"requestData",
                    							lv_requestData_17_0,
                    							"org.lowcomote.panoptes.PanoptesX.RequestData");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPanoptesX.g:533:4: (otherlv_18= ',' ( (lv_requestData_19_0= ruleRequestData ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==14) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalPanoptesX.g:534:5: otherlv_18= ',' ( (lv_requestData_19_0= ruleRequestData ) )
                    	    {
                    	    otherlv_18=(Token)match(input,14,FOLLOW_4); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getFeatureStoreAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalPanoptesX.g:538:5: ( (lv_requestData_19_0= ruleRequestData ) )
                    	    // InternalPanoptesX.g:539:6: (lv_requestData_19_0= ruleRequestData )
                    	    {
                    	    // InternalPanoptesX.g:539:6: (lv_requestData_19_0= ruleRequestData )
                    	    // InternalPanoptesX.g:540:7: lv_requestData_19_0= ruleRequestData
                    	    {

                    	    							newCompositeNode(grammarAccess.getFeatureStoreAccess().getRequestDataRequestDataParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_requestData_19_0=ruleRequestData();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFeatureStoreRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"requestData",
                    	    								lv_requestData_19_0,
                    	    								"org.lowcomote.panoptes.PanoptesX.RequestData");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_20=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_20, grammarAccess.getFeatureStoreAccess().getRightCurlyBracketKeyword_7());
            		

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
    // InternalPanoptesX.g:567:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalPanoptesX.g:567:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalPanoptesX.g:568:2: iv_ruleEntity= ruleEntity EOF
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
    // InternalPanoptesX.g:574:1: ruleEntity returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'keys' ( (lv_keys_3_0= ruleKey ) ) (otherlv_4= ',' ( (lv_keys_5_0= ruleKey ) ) )* otherlv_6= '}' ) ;
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
            // InternalPanoptesX.g:580:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'keys' ( (lv_keys_3_0= ruleKey ) ) (otherlv_4= ',' ( (lv_keys_5_0= ruleKey ) ) )* otherlv_6= '}' ) )
            // InternalPanoptesX.g:581:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'keys' ( (lv_keys_3_0= ruleKey ) ) (otherlv_4= ',' ( (lv_keys_5_0= ruleKey ) ) )* otherlv_6= '}' )
            {
            // InternalPanoptesX.g:581:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'keys' ( (lv_keys_3_0= ruleKey ) ) (otherlv_4= ',' ( (lv_keys_5_0= ruleKey ) ) )* otherlv_6= '}' )
            // InternalPanoptesX.g:582:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'keys' ( (lv_keys_3_0= ruleKey ) ) (otherlv_4= ',' ( (lv_keys_5_0= ruleKey ) ) )* otherlv_6= '}'
            {
            // InternalPanoptesX.g:582:3: ( (lv_name_0_0= ruleEString ) )
            // InternalPanoptesX.g:583:4: (lv_name_0_0= ruleEString )
            {
            // InternalPanoptesX.g:583:4: (lv_name_0_0= ruleEString )
            // InternalPanoptesX.g:584:5: lv_name_0_0= ruleEString
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

            otherlv_1=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getKeysKeyword_2());
            		
            // InternalPanoptesX.g:609:3: ( (lv_keys_3_0= ruleKey ) )
            // InternalPanoptesX.g:610:4: (lv_keys_3_0= ruleKey )
            {
            // InternalPanoptesX.g:610:4: (lv_keys_3_0= ruleKey )
            // InternalPanoptesX.g:611:5: lv_keys_3_0= ruleKey
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

            // InternalPanoptesX.g:628:3: (otherlv_4= ',' ( (lv_keys_5_0= ruleKey ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==14) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalPanoptesX.g:629:4: otherlv_4= ',' ( (lv_keys_5_0= ruleKey ) )
            	    {
            	    otherlv_4=(Token)match(input,14,FOLLOW_4); 

            	    				newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalPanoptesX.g:633:4: ( (lv_keys_5_0= ruleKey ) )
            	    // InternalPanoptesX.g:634:5: (lv_keys_5_0= ruleKey )
            	    {
            	    // InternalPanoptesX.g:634:5: (lv_keys_5_0= ruleKey )
            	    // InternalPanoptesX.g:635:6: lv_keys_5_0= ruleKey
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

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

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
    // InternalPanoptesX.g:661:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // InternalPanoptesX.g:661:48: (iv_ruleFeature= ruleFeature EOF )
            // InternalPanoptesX.g:662:2: iv_ruleFeature= ruleFeature EOF
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
    // InternalPanoptesX.g:668:1: ruleFeature returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= ':' ( (lv_type_2_0= rulestatisticalVariableType ) ) )? (otherlv_3= '{' (otherlv_4= 'requires' otherlv_5= 'entities' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? (otherlv_9= 'requires' otherlv_10= 'request' otherlv_11= 'data' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* )? otherlv_15= '}' )? ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        Enumerator lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalPanoptesX.g:674:2: ( ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= ':' ( (lv_type_2_0= rulestatisticalVariableType ) ) )? (otherlv_3= '{' (otherlv_4= 'requires' otherlv_5= 'entities' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? (otherlv_9= 'requires' otherlv_10= 'request' otherlv_11= 'data' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* )? otherlv_15= '}' )? ) )
            // InternalPanoptesX.g:675:2: ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= ':' ( (lv_type_2_0= rulestatisticalVariableType ) ) )? (otherlv_3= '{' (otherlv_4= 'requires' otherlv_5= 'entities' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? (otherlv_9= 'requires' otherlv_10= 'request' otherlv_11= 'data' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* )? otherlv_15= '}' )? )
            {
            // InternalPanoptesX.g:675:2: ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= ':' ( (lv_type_2_0= rulestatisticalVariableType ) ) )? (otherlv_3= '{' (otherlv_4= 'requires' otherlv_5= 'entities' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? (otherlv_9= 'requires' otherlv_10= 'request' otherlv_11= 'data' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* )? otherlv_15= '}' )? )
            // InternalPanoptesX.g:676:3: ( (lv_name_0_0= ruleEString ) ) (otherlv_1= ':' ( (lv_type_2_0= rulestatisticalVariableType ) ) )? (otherlv_3= '{' (otherlv_4= 'requires' otherlv_5= 'entities' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? (otherlv_9= 'requires' otherlv_10= 'request' otherlv_11= 'data' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* )? otherlv_15= '}' )?
            {
            // InternalPanoptesX.g:676:3: ( (lv_name_0_0= ruleEString ) )
            // InternalPanoptesX.g:677:4: (lv_name_0_0= ruleEString )
            {
            // InternalPanoptesX.g:677:4: (lv_name_0_0= ruleEString )
            // InternalPanoptesX.g:678:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFeatureAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_16);
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

            // InternalPanoptesX.g:695:3: (otherlv_1= ':' ( (lv_type_2_0= rulestatisticalVariableType ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalPanoptesX.g:696:4: otherlv_1= ':' ( (lv_type_2_0= rulestatisticalVariableType ) )
                    {
                    otherlv_1=(Token)match(input,24,FOLLOW_17); 

                    				newLeafNode(otherlv_1, grammarAccess.getFeatureAccess().getColonKeyword_1_0());
                    			
                    // InternalPanoptesX.g:700:4: ( (lv_type_2_0= rulestatisticalVariableType ) )
                    // InternalPanoptesX.g:701:5: (lv_type_2_0= rulestatisticalVariableType )
                    {
                    // InternalPanoptesX.g:701:5: (lv_type_2_0= rulestatisticalVariableType )
                    // InternalPanoptesX.g:702:6: lv_type_2_0= rulestatisticalVariableType
                    {

                    						newCompositeNode(grammarAccess.getFeatureAccess().getTypeStatisticalVariableTypeEnumRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_18);
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

            // InternalPanoptesX.g:720:3: (otherlv_3= '{' (otherlv_4= 'requires' otherlv_5= 'entities' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? (otherlv_9= 'requires' otherlv_10= 'request' otherlv_11= 'data' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* )? otherlv_15= '}' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==12) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalPanoptesX.g:721:4: otherlv_3= '{' (otherlv_4= 'requires' otherlv_5= 'entities' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? (otherlv_9= 'requires' otherlv_10= 'request' otherlv_11= 'data' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* )? otherlv_15= '}'
                    {
                    otherlv_3=(Token)match(input,12,FOLLOW_19); 

                    				newLeafNode(otherlv_3, grammarAccess.getFeatureAccess().getLeftCurlyBracketKeyword_2_0());
                    			
                    // InternalPanoptesX.g:725:4: (otherlv_4= 'requires' otherlv_5= 'entities' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==25) ) {
                        int LA14_1 = input.LA(2);

                        if ( (LA14_1==19) ) {
                            alt14=1;
                        }
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalPanoptesX.g:726:5: otherlv_4= 'requires' otherlv_5= 'entities' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )*
                            {
                            otherlv_4=(Token)match(input,25,FOLLOW_20); 

                            					newLeafNode(otherlv_4, grammarAccess.getFeatureAccess().getRequiresKeyword_2_1_0());
                            				
                            otherlv_5=(Token)match(input,19,FOLLOW_4); 

                            					newLeafNode(otherlv_5, grammarAccess.getFeatureAccess().getEntitiesKeyword_2_1_1());
                            				
                            // InternalPanoptesX.g:734:5: ( ( ruleEString ) )
                            // InternalPanoptesX.g:735:6: ( ruleEString )
                            {
                            // InternalPanoptesX.g:735:6: ( ruleEString )
                            // InternalPanoptesX.g:736:7: ruleEString
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getFeatureRule());
                            							}
                            						

                            							newCompositeNode(grammarAccess.getFeatureAccess().getEntitiesEntityCrossReference_2_1_2_0());
                            						
                            pushFollow(FOLLOW_21);
                            ruleEString();

                            state._fsp--;


                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalPanoptesX.g:750:5: (otherlv_7= ',' ( ( ruleEString ) ) )*
                            loop13:
                            do {
                                int alt13=2;
                                int LA13_0 = input.LA(1);

                                if ( (LA13_0==14) ) {
                                    alt13=1;
                                }


                                switch (alt13) {
                            	case 1 :
                            	    // InternalPanoptesX.g:751:6: otherlv_7= ',' ( ( ruleEString ) )
                            	    {
                            	    otherlv_7=(Token)match(input,14,FOLLOW_4); 

                            	    						newLeafNode(otherlv_7, grammarAccess.getFeatureAccess().getCommaKeyword_2_1_3_0());
                            	    					
                            	    // InternalPanoptesX.g:755:6: ( ( ruleEString ) )
                            	    // InternalPanoptesX.g:756:7: ( ruleEString )
                            	    {
                            	    // InternalPanoptesX.g:756:7: ( ruleEString )
                            	    // InternalPanoptesX.g:757:8: ruleEString
                            	    {

                            	    								if (current==null) {
                            	    									current = createModelElement(grammarAccess.getFeatureRule());
                            	    								}
                            	    							

                            	    								newCompositeNode(grammarAccess.getFeatureAccess().getEntitiesEntityCrossReference_2_1_3_1_0());
                            	    							
                            	    pushFollow(FOLLOW_21);
                            	    ruleEString();

                            	    state._fsp--;


                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop13;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // InternalPanoptesX.g:773:4: (otherlv_9= 'requires' otherlv_10= 'request' otherlv_11= 'data' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==25) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalPanoptesX.g:774:5: otherlv_9= 'requires' otherlv_10= 'request' otherlv_11= 'data' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )*
                            {
                            otherlv_9=(Token)match(input,25,FOLLOW_22); 

                            					newLeafNode(otherlv_9, grammarAccess.getFeatureAccess().getRequiresKeyword_2_2_0());
                            				
                            otherlv_10=(Token)match(input,21,FOLLOW_13); 

                            					newLeafNode(otherlv_10, grammarAccess.getFeatureAccess().getRequestKeyword_2_2_1());
                            				
                            otherlv_11=(Token)match(input,22,FOLLOW_4); 

                            					newLeafNode(otherlv_11, grammarAccess.getFeatureAccess().getDataKeyword_2_2_2());
                            				
                            // InternalPanoptesX.g:786:5: ( ( ruleEString ) )
                            // InternalPanoptesX.g:787:6: ( ruleEString )
                            {
                            // InternalPanoptesX.g:787:6: ( ruleEString )
                            // InternalPanoptesX.g:788:7: ruleEString
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getFeatureRule());
                            							}
                            						

                            							newCompositeNode(grammarAccess.getFeatureAccess().getRequestDataRequestDataCrossReference_2_2_3_0());
                            						
                            pushFollow(FOLLOW_14);
                            ruleEString();

                            state._fsp--;


                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalPanoptesX.g:802:5: (otherlv_13= ',' ( ( ruleEString ) ) )*
                            loop15:
                            do {
                                int alt15=2;
                                int LA15_0 = input.LA(1);

                                if ( (LA15_0==14) ) {
                                    alt15=1;
                                }


                                switch (alt15) {
                            	case 1 :
                            	    // InternalPanoptesX.g:803:6: otherlv_13= ',' ( ( ruleEString ) )
                            	    {
                            	    otherlv_13=(Token)match(input,14,FOLLOW_4); 

                            	    						newLeafNode(otherlv_13, grammarAccess.getFeatureAccess().getCommaKeyword_2_2_4_0());
                            	    					
                            	    // InternalPanoptesX.g:807:6: ( ( ruleEString ) )
                            	    // InternalPanoptesX.g:808:7: ( ruleEString )
                            	    {
                            	    // InternalPanoptesX.g:808:7: ( ruleEString )
                            	    // InternalPanoptesX.g:809:8: ruleEString
                            	    {

                            	    								if (current==null) {
                            	    									current = createModelElement(grammarAccess.getFeatureRule());
                            	    								}
                            	    							

                            	    								newCompositeNode(grammarAccess.getFeatureAccess().getRequestDataRequestDataCrossReference_2_2_4_1_0());
                            	    							
                            	    pushFollow(FOLLOW_14);
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
                            break;

                    }

                    otherlv_15=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_15, grammarAccess.getFeatureAccess().getRightCurlyBracketKeyword_2_3());
                    			

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
    // InternalPanoptesX.g:834:1: entryRulePrediction returns [EObject current=null] : iv_rulePrediction= rulePrediction EOF ;
    public final EObject entryRulePrediction() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrediction = null;


        try {
            // InternalPanoptesX.g:834:51: (iv_rulePrediction= rulePrediction EOF )
            // InternalPanoptesX.g:835:2: iv_rulePrediction= rulePrediction EOF
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
    // InternalPanoptesX.g:841:1: rulePrediction returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'predicts' ( ( ruleEString ) ) )? ) ;
    public final EObject rulePrediction() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalPanoptesX.g:847:2: ( ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'predicts' ( ( ruleEString ) ) )? ) )
            // InternalPanoptesX.g:848:2: ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'predicts' ( ( ruleEString ) ) )? )
            {
            // InternalPanoptesX.g:848:2: ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'predicts' ( ( ruleEString ) ) )? )
            // InternalPanoptesX.g:849:3: () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'predicts' ( ( ruleEString ) ) )?
            {
            // InternalPanoptesX.g:849:3: ()
            // InternalPanoptesX.g:850:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPredictionAccess().getPredictionAction_0(),
            					current);
            			

            }

            // InternalPanoptesX.g:856:3: ( (lv_name_1_0= ruleEString ) )
            // InternalPanoptesX.g:857:4: (lv_name_1_0= ruleEString )
            {
            // InternalPanoptesX.g:857:4: (lv_name_1_0= ruleEString )
            // InternalPanoptesX.g:858:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPredictionAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_23);
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

            // InternalPanoptesX.g:875:3: (otherlv_2= 'predicts' ( ( ruleEString ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==26) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalPanoptesX.g:876:4: otherlv_2= 'predicts' ( ( ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,26,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getPredictionAccess().getPredictsKeyword_2_0());
                    			
                    // InternalPanoptesX.g:880:4: ( ( ruleEString ) )
                    // InternalPanoptesX.g:881:5: ( ruleEString )
                    {
                    // InternalPanoptesX.g:881:5: ( ruleEString )
                    // InternalPanoptesX.g:882:6: ruleEString
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
    // InternalPanoptesX.g:901:1: entryRuleLabel returns [EObject current=null] : iv_ruleLabel= ruleLabel EOF ;
    public final EObject entryRuleLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabel = null;


        try {
            // InternalPanoptesX.g:901:46: (iv_ruleLabel= ruleLabel EOF )
            // InternalPanoptesX.g:902:2: iv_ruleLabel= ruleLabel EOF
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
    // InternalPanoptesX.g:908:1: ruleLabel returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= ':' ( (lv_type_3_0= rulestatisticalVariableType ) ) )? ) ;
    public final EObject ruleLabel() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        Enumerator lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalPanoptesX.g:914:2: ( ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= ':' ( (lv_type_3_0= rulestatisticalVariableType ) ) )? ) )
            // InternalPanoptesX.g:915:2: ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= ':' ( (lv_type_3_0= rulestatisticalVariableType ) ) )? )
            {
            // InternalPanoptesX.g:915:2: ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= ':' ( (lv_type_3_0= rulestatisticalVariableType ) ) )? )
            // InternalPanoptesX.g:916:3: () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= ':' ( (lv_type_3_0= rulestatisticalVariableType ) ) )?
            {
            // InternalPanoptesX.g:916:3: ()
            // InternalPanoptesX.g:917:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLabelAccess().getLabelAction_0(),
            					current);
            			

            }

            // InternalPanoptesX.g:923:3: ( (lv_name_1_0= ruleEString ) )
            // InternalPanoptesX.g:924:4: (lv_name_1_0= ruleEString )
            {
            // InternalPanoptesX.g:924:4: (lv_name_1_0= ruleEString )
            // InternalPanoptesX.g:925:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLabelAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_24);
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

            // InternalPanoptesX.g:942:3: (otherlv_2= ':' ( (lv_type_3_0= rulestatisticalVariableType ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==24) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalPanoptesX.g:943:4: otherlv_2= ':' ( (lv_type_3_0= rulestatisticalVariableType ) )
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_17); 

                    				newLeafNode(otherlv_2, grammarAccess.getLabelAccess().getColonKeyword_2_0());
                    			
                    // InternalPanoptesX.g:947:4: ( (lv_type_3_0= rulestatisticalVariableType ) )
                    // InternalPanoptesX.g:948:5: (lv_type_3_0= rulestatisticalVariableType )
                    {
                    // InternalPanoptesX.g:948:5: (lv_type_3_0= rulestatisticalVariableType )
                    // InternalPanoptesX.g:949:6: lv_type_3_0= rulestatisticalVariableType
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
    // InternalPanoptesX.g:971:1: entryRuleRequestData returns [EObject current=null] : iv_ruleRequestData= ruleRequestData EOF ;
    public final EObject entryRuleRequestData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequestData = null;


        try {
            // InternalPanoptesX.g:971:52: (iv_ruleRequestData= ruleRequestData EOF )
            // InternalPanoptesX.g:972:2: iv_ruleRequestData= ruleRequestData EOF
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
    // InternalPanoptesX.g:978:1: ruleRequestData returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleRequestData() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalPanoptesX.g:984:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalPanoptesX.g:985:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalPanoptesX.g:985:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalPanoptesX.g:986:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalPanoptesX.g:986:3: ()
            // InternalPanoptesX.g:987:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRequestDataAccess().getRequestDataAction_0(),
            					current);
            			

            }

            // InternalPanoptesX.g:993:3: ( (lv_name_1_0= ruleEString ) )
            // InternalPanoptesX.g:994:4: (lv_name_1_0= ruleEString )
            {
            // InternalPanoptesX.g:994:4: (lv_name_1_0= ruleEString )
            // InternalPanoptesX.g:995:5: lv_name_1_0= ruleEString
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
    // InternalPanoptesX.g:1016:1: entryRuleKey returns [EObject current=null] : iv_ruleKey= ruleKey EOF ;
    public final EObject entryRuleKey() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKey = null;


        try {
            // InternalPanoptesX.g:1016:44: (iv_ruleKey= ruleKey EOF )
            // InternalPanoptesX.g:1017:2: iv_ruleKey= ruleKey EOF
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
    // InternalPanoptesX.g:1023:1: ruleKey returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleKey() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalPanoptesX.g:1029:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalPanoptesX.g:1030:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalPanoptesX.g:1030:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalPanoptesX.g:1031:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalPanoptesX.g:1031:3: ()
            // InternalPanoptesX.g:1032:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getKeyAccess().getKeyAction_0(),
            					current);
            			

            }

            // InternalPanoptesX.g:1038:3: ( (lv_name_1_0= ruleEString ) )
            // InternalPanoptesX.g:1039:4: (lv_name_1_0= ruleEString )
            {
            // InternalPanoptesX.g:1039:4: (lv_name_1_0= ruleEString )
            // InternalPanoptesX.g:1040:5: lv_name_1_0= ruleEString
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
    // InternalPanoptesX.g:1061:1: entryRuleDeployment returns [EObject current=null] : iv_ruleDeployment= ruleDeployment EOF ;
    public final EObject entryRuleDeployment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeployment = null;


        try {
            // InternalPanoptesX.g:1061:51: (iv_ruleDeployment= ruleDeployment EOF )
            // InternalPanoptesX.g:1062:2: iv_ruleDeployment= ruleDeployment EOF
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
    // InternalPanoptesX.g:1068:1: ruleDeployment returns [EObject current=null] : (otherlv_0= 'Deployment' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'model' ( ( ruleEString ) ) (otherlv_5= 'inputs' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? ( (lv_algorithmexecutions_9_0= ruleAlgorithmExecution ) )* ( (lv_actionExecutions_10_0= ruleActionExecution ) )* ( (lv_triggerGroups_11_0= ruleTriggerGroup ) )* otherlv_12= '}' ) ;
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
            // InternalPanoptesX.g:1074:2: ( (otherlv_0= 'Deployment' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'model' ( ( ruleEString ) ) (otherlv_5= 'inputs' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? ( (lv_algorithmexecutions_9_0= ruleAlgorithmExecution ) )* ( (lv_actionExecutions_10_0= ruleActionExecution ) )* ( (lv_triggerGroups_11_0= ruleTriggerGroup ) )* otherlv_12= '}' ) )
            // InternalPanoptesX.g:1075:2: (otherlv_0= 'Deployment' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'model' ( ( ruleEString ) ) (otherlv_5= 'inputs' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? ( (lv_algorithmexecutions_9_0= ruleAlgorithmExecution ) )* ( (lv_actionExecutions_10_0= ruleActionExecution ) )* ( (lv_triggerGroups_11_0= ruleTriggerGroup ) )* otherlv_12= '}' )
            {
            // InternalPanoptesX.g:1075:2: (otherlv_0= 'Deployment' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'model' ( ( ruleEString ) ) (otherlv_5= 'inputs' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? ( (lv_algorithmexecutions_9_0= ruleAlgorithmExecution ) )* ( (lv_actionExecutions_10_0= ruleActionExecution ) )* ( (lv_triggerGroups_11_0= ruleTriggerGroup ) )* otherlv_12= '}' )
            // InternalPanoptesX.g:1076:3: otherlv_0= 'Deployment' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'model' ( ( ruleEString ) ) (otherlv_5= 'inputs' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? ( (lv_algorithmexecutions_9_0= ruleAlgorithmExecution ) )* ( (lv_actionExecutions_10_0= ruleActionExecution ) )* ( (lv_triggerGroups_11_0= ruleTriggerGroup ) )* otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDeploymentAccess().getDeploymentKeyword_0());
            		
            // InternalPanoptesX.g:1080:3: ( (lv_name_1_0= ruleEString ) )
            // InternalPanoptesX.g:1081:4: (lv_name_1_0= ruleEString )
            {
            // InternalPanoptesX.g:1081:4: (lv_name_1_0= ruleEString )
            // InternalPanoptesX.g:1082:5: lv_name_1_0= ruleEString
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

            otherlv_2=(Token)match(input,12,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getDeploymentAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getDeploymentAccess().getModelKeyword_3());
            		
            // InternalPanoptesX.g:1107:3: ( ( ruleEString ) )
            // InternalPanoptesX.g:1108:4: ( ruleEString )
            {
            // InternalPanoptesX.g:1108:4: ( ruleEString )
            // InternalPanoptesX.g:1109:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeploymentRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDeploymentAccess().getMlModelModelCrossReference_4_0());
            				
            pushFollow(FOLLOW_26);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPanoptesX.g:1123:3: (otherlv_5= 'inputs' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==29) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalPanoptesX.g:1124:4: otherlv_5= 'inputs' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_5=(Token)match(input,29,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getDeploymentAccess().getInputsKeyword_5_0());
                    			
                    // InternalPanoptesX.g:1128:4: ( ( ruleEString ) )
                    // InternalPanoptesX.g:1129:5: ( ruleEString )
                    {
                    // InternalPanoptesX.g:1129:5: ( ruleEString )
                    // InternalPanoptesX.g:1130:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDeploymentRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDeploymentAccess().getInputsDeploymentIOCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPanoptesX.g:1144:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==14) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalPanoptesX.g:1145:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_4); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getDeploymentAccess().getCommaKeyword_5_2_0());
                    	    				
                    	    // InternalPanoptesX.g:1149:5: ( ( ruleEString ) )
                    	    // InternalPanoptesX.g:1150:6: ( ruleEString )
                    	    {
                    	    // InternalPanoptesX.g:1150:6: ( ruleEString )
                    	    // InternalPanoptesX.g:1151:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getDeploymentRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getDeploymentAccess().getInputsDeploymentIOCrossReference_5_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_27);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalPanoptesX.g:1167:3: ( (lv_algorithmexecutions_9_0= ruleAlgorithmExecution ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==42||LA22_0==51) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalPanoptesX.g:1168:4: (lv_algorithmexecutions_9_0= ruleAlgorithmExecution )
            	    {
            	    // InternalPanoptesX.g:1168:4: (lv_algorithmexecutions_9_0= ruleAlgorithmExecution )
            	    // InternalPanoptesX.g:1169:5: lv_algorithmexecutions_9_0= ruleAlgorithmExecution
            	    {

            	    					newCompositeNode(grammarAccess.getDeploymentAccess().getAlgorithmexecutionsAlgorithmExecutionParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_28);
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
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            // InternalPanoptesX.g:1186:3: ( (lv_actionExecutions_10_0= ruleActionExecution ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==74) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalPanoptesX.g:1187:4: (lv_actionExecutions_10_0= ruleActionExecution )
            	    {
            	    // InternalPanoptesX.g:1187:4: (lv_actionExecutions_10_0= ruleActionExecution )
            	    // InternalPanoptesX.g:1188:5: lv_actionExecutions_10_0= ruleActionExecution
            	    {

            	    					newCompositeNode(grammarAccess.getDeploymentAccess().getActionExecutionsActionExecutionParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_29);
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
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            // InternalPanoptesX.g:1205:3: ( (lv_triggerGroups_11_0= ruleTriggerGroup ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=60 && LA24_0<=61)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalPanoptesX.g:1206:4: (lv_triggerGroups_11_0= ruleTriggerGroup )
            	    {
            	    // InternalPanoptesX.g:1206:4: (lv_triggerGroups_11_0= ruleTriggerGroup )
            	    // InternalPanoptesX.g:1207:5: lv_triggerGroups_11_0= ruleTriggerGroup
            	    {

            	    					newCompositeNode(grammarAccess.getDeploymentAccess().getTriggerGroupsTriggerGroupParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_30);
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
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            otherlv_12=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getDeploymentAccess().getRightCurlyBracketKeyword_9());
            		

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
    // InternalPanoptesX.g:1232:1: entryRuleAlgorithm returns [EObject current=null] : iv_ruleAlgorithm= ruleAlgorithm EOF ;
    public final EObject entryRuleAlgorithm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlgorithm = null;


        try {
            // InternalPanoptesX.g:1232:50: (iv_ruleAlgorithm= ruleAlgorithm EOF )
            // InternalPanoptesX.g:1233:2: iv_ruleAlgorithm= ruleAlgorithm EOF
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
    // InternalPanoptesX.g:1239:1: ruleAlgorithm returns [EObject current=null] : (this_BaseAlgorithm_0= ruleBaseAlgorithm | this_HigherOrderAlgorithm_1= ruleHigherOrderAlgorithm ) ;
    public final EObject ruleAlgorithm() throws RecognitionException {
        EObject current = null;

        EObject this_BaseAlgorithm_0 = null;

        EObject this_HigherOrderAlgorithm_1 = null;



        	enterRule();

        try {
            // InternalPanoptesX.g:1245:2: ( (this_BaseAlgorithm_0= ruleBaseAlgorithm | this_HigherOrderAlgorithm_1= ruleHigherOrderAlgorithm ) )
            // InternalPanoptesX.g:1246:2: (this_BaseAlgorithm_0= ruleBaseAlgorithm | this_HigherOrderAlgorithm_1= ruleHigherOrderAlgorithm )
            {
            // InternalPanoptesX.g:1246:2: (this_BaseAlgorithm_0= ruleBaseAlgorithm | this_HigherOrderAlgorithm_1= ruleHigherOrderAlgorithm )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==30) ) {
                alt25=1;
            }
            else if ( (LA25_0==38) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalPanoptesX.g:1247:3: this_BaseAlgorithm_0= ruleBaseAlgorithm
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
                    // InternalPanoptesX.g:1256:3: this_HigherOrderAlgorithm_1= ruleHigherOrderAlgorithm
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
    // InternalPanoptesX.g:1268:1: entryRuleBaseAlgorithm returns [EObject current=null] : iv_ruleBaseAlgorithm= ruleBaseAlgorithm EOF ;
    public final EObject entryRuleBaseAlgorithm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaseAlgorithm = null;


        try {
            // InternalPanoptesX.g:1268:54: (iv_ruleBaseAlgorithm= ruleBaseAlgorithm EOF )
            // InternalPanoptesX.g:1269:2: iv_ruleBaseAlgorithm= ruleBaseAlgorithm EOF
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
    // InternalPanoptesX.g:1275:1: ruleBaseAlgorithm returns [EObject current=null] : (otherlv_0= 'BaseAlgorithm' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'codebase' ( (lv_codebase_4_0= ruleEString ) ) ) (otherlv_5= 'runtime' ( ( ruleEString ) ) ) (otherlv_7= 'severity' otherlv_8= 'levels' ( (lv_driftLevels_9_0= ruleEIntegerObject ) ) ) (otherlv_10= 'accepts' ( (lv_strict_11_0= 'only' ) )? ( (lv_supportedTypes_12_0= rulestatisticalVariableType ) ) (otherlv_13= ',' ( (lv_supportedTypes_14_0= rulestatisticalVariableType ) ) )* )? (otherlv_15= 'parameters' ( (lv_additionalParameters_16_0= ruleParameter ) ) (otherlv_17= ',' ( (lv_additionalParameters_18_0= ruleParameter ) ) )* )? otherlv_19= '}' ) ;
    public final EObject ruleBaseAlgorithm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token lv_strict_11_0=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_codebase_4_0 = null;

        AntlrDatatypeRuleToken lv_driftLevels_9_0 = null;

        Enumerator lv_supportedTypes_12_0 = null;

        Enumerator lv_supportedTypes_14_0 = null;

        EObject lv_additionalParameters_16_0 = null;

        EObject lv_additionalParameters_18_0 = null;



        	enterRule();

        try {
            // InternalPanoptesX.g:1281:2: ( (otherlv_0= 'BaseAlgorithm' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'codebase' ( (lv_codebase_4_0= ruleEString ) ) ) (otherlv_5= 'runtime' ( ( ruleEString ) ) ) (otherlv_7= 'severity' otherlv_8= 'levels' ( (lv_driftLevels_9_0= ruleEIntegerObject ) ) ) (otherlv_10= 'accepts' ( (lv_strict_11_0= 'only' ) )? ( (lv_supportedTypes_12_0= rulestatisticalVariableType ) ) (otherlv_13= ',' ( (lv_supportedTypes_14_0= rulestatisticalVariableType ) ) )* )? (otherlv_15= 'parameters' ( (lv_additionalParameters_16_0= ruleParameter ) ) (otherlv_17= ',' ( (lv_additionalParameters_18_0= ruleParameter ) ) )* )? otherlv_19= '}' ) )
            // InternalPanoptesX.g:1282:2: (otherlv_0= 'BaseAlgorithm' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'codebase' ( (lv_codebase_4_0= ruleEString ) ) ) (otherlv_5= 'runtime' ( ( ruleEString ) ) ) (otherlv_7= 'severity' otherlv_8= 'levels' ( (lv_driftLevels_9_0= ruleEIntegerObject ) ) ) (otherlv_10= 'accepts' ( (lv_strict_11_0= 'only' ) )? ( (lv_supportedTypes_12_0= rulestatisticalVariableType ) ) (otherlv_13= ',' ( (lv_supportedTypes_14_0= rulestatisticalVariableType ) ) )* )? (otherlv_15= 'parameters' ( (lv_additionalParameters_16_0= ruleParameter ) ) (otherlv_17= ',' ( (lv_additionalParameters_18_0= ruleParameter ) ) )* )? otherlv_19= '}' )
            {
            // InternalPanoptesX.g:1282:2: (otherlv_0= 'BaseAlgorithm' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'codebase' ( (lv_codebase_4_0= ruleEString ) ) ) (otherlv_5= 'runtime' ( ( ruleEString ) ) ) (otherlv_7= 'severity' otherlv_8= 'levels' ( (lv_driftLevels_9_0= ruleEIntegerObject ) ) ) (otherlv_10= 'accepts' ( (lv_strict_11_0= 'only' ) )? ( (lv_supportedTypes_12_0= rulestatisticalVariableType ) ) (otherlv_13= ',' ( (lv_supportedTypes_14_0= rulestatisticalVariableType ) ) )* )? (otherlv_15= 'parameters' ( (lv_additionalParameters_16_0= ruleParameter ) ) (otherlv_17= ',' ( (lv_additionalParameters_18_0= ruleParameter ) ) )* )? otherlv_19= '}' )
            // InternalPanoptesX.g:1283:3: otherlv_0= 'BaseAlgorithm' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'codebase' ( (lv_codebase_4_0= ruleEString ) ) ) (otherlv_5= 'runtime' ( ( ruleEString ) ) ) (otherlv_7= 'severity' otherlv_8= 'levels' ( (lv_driftLevels_9_0= ruleEIntegerObject ) ) ) (otherlv_10= 'accepts' ( (lv_strict_11_0= 'only' ) )? ( (lv_supportedTypes_12_0= rulestatisticalVariableType ) ) (otherlv_13= ',' ( (lv_supportedTypes_14_0= rulestatisticalVariableType ) ) )* )? (otherlv_15= 'parameters' ( (lv_additionalParameters_16_0= ruleParameter ) ) (otherlv_17= ',' ( (lv_additionalParameters_18_0= ruleParameter ) ) )* )? otherlv_19= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getBaseAlgorithmAccess().getBaseAlgorithmKeyword_0());
            		
            // InternalPanoptesX.g:1287:3: ( (lv_name_1_0= ruleEString ) )
            // InternalPanoptesX.g:1288:4: (lv_name_1_0= ruleEString )
            {
            // InternalPanoptesX.g:1288:4: (lv_name_1_0= ruleEString )
            // InternalPanoptesX.g:1289:5: lv_name_1_0= ruleEString
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

            otherlv_2=(Token)match(input,12,FOLLOW_31); 

            			newLeafNode(otherlv_2, grammarAccess.getBaseAlgorithmAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalPanoptesX.g:1310:3: (otherlv_3= 'codebase' ( (lv_codebase_4_0= ruleEString ) ) )
            // InternalPanoptesX.g:1311:4: otherlv_3= 'codebase' ( (lv_codebase_4_0= ruleEString ) )
            {
            otherlv_3=(Token)match(input,31,FOLLOW_4); 

            				newLeafNode(otherlv_3, grammarAccess.getBaseAlgorithmAccess().getCodebaseKeyword_3_0());
            			
            // InternalPanoptesX.g:1315:4: ( (lv_codebase_4_0= ruleEString ) )
            // InternalPanoptesX.g:1316:5: (lv_codebase_4_0= ruleEString )
            {
            // InternalPanoptesX.g:1316:5: (lv_codebase_4_0= ruleEString )
            // InternalPanoptesX.g:1317:6: lv_codebase_4_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getBaseAlgorithmAccess().getCodebaseEStringParserRuleCall_3_1_0());
            					
            pushFollow(FOLLOW_32);
            lv_codebase_4_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getBaseAlgorithmRule());
            						}
            						set(
            							current,
            							"codebase",
            							lv_codebase_4_0,
            							"org.lowcomote.panoptes.PanoptesX.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalPanoptesX.g:1335:3: (otherlv_5= 'runtime' ( ( ruleEString ) ) )
            // InternalPanoptesX.g:1336:4: otherlv_5= 'runtime' ( ( ruleEString ) )
            {
            otherlv_5=(Token)match(input,32,FOLLOW_4); 

            				newLeafNode(otherlv_5, grammarAccess.getBaseAlgorithmAccess().getRuntimeKeyword_4_0());
            			
            // InternalPanoptesX.g:1340:4: ( ( ruleEString ) )
            // InternalPanoptesX.g:1341:5: ( ruleEString )
            {
            // InternalPanoptesX.g:1341:5: ( ruleEString )
            // InternalPanoptesX.g:1342:6: ruleEString
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getBaseAlgorithmRule());
            						}
            					

            						newCompositeNode(grammarAccess.getBaseAlgorithmAccess().getRuntimeBaseAlgorithmRuntimeCrossReference_4_1_0());
            					
            pushFollow(FOLLOW_33);
            ruleEString();

            state._fsp--;


            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalPanoptesX.g:1357:3: (otherlv_7= 'severity' otherlv_8= 'levels' ( (lv_driftLevels_9_0= ruleEIntegerObject ) ) )
            // InternalPanoptesX.g:1358:4: otherlv_7= 'severity' otherlv_8= 'levels' ( (lv_driftLevels_9_0= ruleEIntegerObject ) )
            {
            otherlv_7=(Token)match(input,33,FOLLOW_34); 

            				newLeafNode(otherlv_7, grammarAccess.getBaseAlgorithmAccess().getSeverityKeyword_5_0());
            			
            otherlv_8=(Token)match(input,34,FOLLOW_35); 

            				newLeafNode(otherlv_8, grammarAccess.getBaseAlgorithmAccess().getLevelsKeyword_5_1());
            			
            // InternalPanoptesX.g:1366:4: ( (lv_driftLevels_9_0= ruleEIntegerObject ) )
            // InternalPanoptesX.g:1367:5: (lv_driftLevels_9_0= ruleEIntegerObject )
            {
            // InternalPanoptesX.g:1367:5: (lv_driftLevels_9_0= ruleEIntegerObject )
            // InternalPanoptesX.g:1368:6: lv_driftLevels_9_0= ruleEIntegerObject
            {

            						newCompositeNode(grammarAccess.getBaseAlgorithmAccess().getDriftLevelsEIntegerObjectParserRuleCall_5_2_0());
            					
            pushFollow(FOLLOW_36);
            lv_driftLevels_9_0=ruleEIntegerObject();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getBaseAlgorithmRule());
            						}
            						set(
            							current,
            							"driftLevels",
            							lv_driftLevels_9_0,
            							"org.lowcomote.panoptes.PanoptesX.EIntegerObject");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalPanoptesX.g:1386:3: (otherlv_10= 'accepts' ( (lv_strict_11_0= 'only' ) )? ( (lv_supportedTypes_12_0= rulestatisticalVariableType ) ) (otherlv_13= ',' ( (lv_supportedTypes_14_0= rulestatisticalVariableType ) ) )* )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==35) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalPanoptesX.g:1387:4: otherlv_10= 'accepts' ( (lv_strict_11_0= 'only' ) )? ( (lv_supportedTypes_12_0= rulestatisticalVariableType ) ) (otherlv_13= ',' ( (lv_supportedTypes_14_0= rulestatisticalVariableType ) ) )*
                    {
                    otherlv_10=(Token)match(input,35,FOLLOW_37); 

                    				newLeafNode(otherlv_10, grammarAccess.getBaseAlgorithmAccess().getAcceptsKeyword_6_0());
                    			
                    // InternalPanoptesX.g:1391:4: ( (lv_strict_11_0= 'only' ) )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==36) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // InternalPanoptesX.g:1392:5: (lv_strict_11_0= 'only' )
                            {
                            // InternalPanoptesX.g:1392:5: (lv_strict_11_0= 'only' )
                            // InternalPanoptesX.g:1393:6: lv_strict_11_0= 'only'
                            {
                            lv_strict_11_0=(Token)match(input,36,FOLLOW_17); 

                            						newLeafNode(lv_strict_11_0, grammarAccess.getBaseAlgorithmAccess().getStrictOnlyKeyword_6_1_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getBaseAlgorithmRule());
                            						}
                            						setWithLastConsumed(current, "strict", lv_strict_11_0 != null, "only");
                            					

                            }


                            }
                            break;

                    }

                    // InternalPanoptesX.g:1405:4: ( (lv_supportedTypes_12_0= rulestatisticalVariableType ) )
                    // InternalPanoptesX.g:1406:5: (lv_supportedTypes_12_0= rulestatisticalVariableType )
                    {
                    // InternalPanoptesX.g:1406:5: (lv_supportedTypes_12_0= rulestatisticalVariableType )
                    // InternalPanoptesX.g:1407:6: lv_supportedTypes_12_0= rulestatisticalVariableType
                    {

                    						newCompositeNode(grammarAccess.getBaseAlgorithmAccess().getSupportedTypesStatisticalVariableTypeEnumRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_38);
                    lv_supportedTypes_12_0=rulestatisticalVariableType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBaseAlgorithmRule());
                    						}
                    						add(
                    							current,
                    							"supportedTypes",
                    							lv_supportedTypes_12_0,
                    							"org.lowcomote.panoptes.PanoptesX.statisticalVariableType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPanoptesX.g:1424:4: (otherlv_13= ',' ( (lv_supportedTypes_14_0= rulestatisticalVariableType ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==14) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalPanoptesX.g:1425:5: otherlv_13= ',' ( (lv_supportedTypes_14_0= rulestatisticalVariableType ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_17); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getBaseAlgorithmAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalPanoptesX.g:1429:5: ( (lv_supportedTypes_14_0= rulestatisticalVariableType ) )
                    	    // InternalPanoptesX.g:1430:6: (lv_supportedTypes_14_0= rulestatisticalVariableType )
                    	    {
                    	    // InternalPanoptesX.g:1430:6: (lv_supportedTypes_14_0= rulestatisticalVariableType )
                    	    // InternalPanoptesX.g:1431:7: lv_supportedTypes_14_0= rulestatisticalVariableType
                    	    {

                    	    							newCompositeNode(grammarAccess.getBaseAlgorithmAccess().getSupportedTypesStatisticalVariableTypeEnumRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_38);
                    	    lv_supportedTypes_14_0=rulestatisticalVariableType();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBaseAlgorithmRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"supportedTypes",
                    	    								lv_supportedTypes_14_0,
                    	    								"org.lowcomote.panoptes.PanoptesX.statisticalVariableType");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalPanoptesX.g:1450:3: (otherlv_15= 'parameters' ( (lv_additionalParameters_16_0= ruleParameter ) ) (otherlv_17= ',' ( (lv_additionalParameters_18_0= ruleParameter ) ) )* )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==37) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalPanoptesX.g:1451:4: otherlv_15= 'parameters' ( (lv_additionalParameters_16_0= ruleParameter ) ) (otherlv_17= ',' ( (lv_additionalParameters_18_0= ruleParameter ) ) )*
                    {
                    otherlv_15=(Token)match(input,37,FOLLOW_39); 

                    				newLeafNode(otherlv_15, grammarAccess.getBaseAlgorithmAccess().getParametersKeyword_7_0());
                    			
                    // InternalPanoptesX.g:1455:4: ( (lv_additionalParameters_16_0= ruleParameter ) )
                    // InternalPanoptesX.g:1456:5: (lv_additionalParameters_16_0= ruleParameter )
                    {
                    // InternalPanoptesX.g:1456:5: (lv_additionalParameters_16_0= ruleParameter )
                    // InternalPanoptesX.g:1457:6: lv_additionalParameters_16_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getBaseAlgorithmAccess().getAdditionalParametersParameterParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_additionalParameters_16_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBaseAlgorithmRule());
                    						}
                    						add(
                    							current,
                    							"additionalParameters",
                    							lv_additionalParameters_16_0,
                    							"org.lowcomote.panoptes.PanoptesX.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPanoptesX.g:1474:4: (otherlv_17= ',' ( (lv_additionalParameters_18_0= ruleParameter ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==14) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalPanoptesX.g:1475:5: otherlv_17= ',' ( (lv_additionalParameters_18_0= ruleParameter ) )
                    	    {
                    	    otherlv_17=(Token)match(input,14,FOLLOW_39); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getBaseAlgorithmAccess().getCommaKeyword_7_2_0());
                    	    				
                    	    // InternalPanoptesX.g:1479:5: ( (lv_additionalParameters_18_0= ruleParameter ) )
                    	    // InternalPanoptesX.g:1480:6: (lv_additionalParameters_18_0= ruleParameter )
                    	    {
                    	    // InternalPanoptesX.g:1480:6: (lv_additionalParameters_18_0= ruleParameter )
                    	    // InternalPanoptesX.g:1481:7: lv_additionalParameters_18_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getBaseAlgorithmAccess().getAdditionalParametersParameterParserRuleCall_7_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_additionalParameters_18_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBaseAlgorithmRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"additionalParameters",
                    	    								lv_additionalParameters_18_0,
                    	    								"org.lowcomote.panoptes.PanoptesX.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_19=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getBaseAlgorithmAccess().getRightCurlyBracketKeyword_8());
            		

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
    // InternalPanoptesX.g:1508:1: entryRuleHigherOrderAlgorithm returns [EObject current=null] : iv_ruleHigherOrderAlgorithm= ruleHigherOrderAlgorithm EOF ;
    public final EObject entryRuleHigherOrderAlgorithm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHigherOrderAlgorithm = null;


        try {
            // InternalPanoptesX.g:1508:61: (iv_ruleHigherOrderAlgorithm= ruleHigherOrderAlgorithm EOF )
            // InternalPanoptesX.g:1509:2: iv_ruleHigherOrderAlgorithm= ruleHigherOrderAlgorithm EOF
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
    // InternalPanoptesX.g:1515:1: ruleHigherOrderAlgorithm returns [EObject current=null] : ( () otherlv_1= 'HigherOrderAlgorithm' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'codebase' ( (lv_codebase_5_0= ruleEString ) ) ) (otherlv_6= 'runtime' ( ( ruleEString ) ) ) (otherlv_8= 'severity' otherlv_9= 'levels' ( (lv_driftLevels_10_0= ruleEIntegerObject ) ) ) (otherlv_11= 'parameters' ( (lv_additionalParameters_12_0= ruleParameter ) ) (otherlv_13= ',' ( (lv_additionalParameters_14_0= ruleParameter ) ) )* )? otherlv_15= '}' ) ;
    public final EObject ruleHigherOrderAlgorithm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_codebase_5_0 = null;

        AntlrDatatypeRuleToken lv_driftLevels_10_0 = null;

        EObject lv_additionalParameters_12_0 = null;

        EObject lv_additionalParameters_14_0 = null;



        	enterRule();

        try {
            // InternalPanoptesX.g:1521:2: ( ( () otherlv_1= 'HigherOrderAlgorithm' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'codebase' ( (lv_codebase_5_0= ruleEString ) ) ) (otherlv_6= 'runtime' ( ( ruleEString ) ) ) (otherlv_8= 'severity' otherlv_9= 'levels' ( (lv_driftLevels_10_0= ruleEIntegerObject ) ) ) (otherlv_11= 'parameters' ( (lv_additionalParameters_12_0= ruleParameter ) ) (otherlv_13= ',' ( (lv_additionalParameters_14_0= ruleParameter ) ) )* )? otherlv_15= '}' ) )
            // InternalPanoptesX.g:1522:2: ( () otherlv_1= 'HigherOrderAlgorithm' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'codebase' ( (lv_codebase_5_0= ruleEString ) ) ) (otherlv_6= 'runtime' ( ( ruleEString ) ) ) (otherlv_8= 'severity' otherlv_9= 'levels' ( (lv_driftLevels_10_0= ruleEIntegerObject ) ) ) (otherlv_11= 'parameters' ( (lv_additionalParameters_12_0= ruleParameter ) ) (otherlv_13= ',' ( (lv_additionalParameters_14_0= ruleParameter ) ) )* )? otherlv_15= '}' )
            {
            // InternalPanoptesX.g:1522:2: ( () otherlv_1= 'HigherOrderAlgorithm' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'codebase' ( (lv_codebase_5_0= ruleEString ) ) ) (otherlv_6= 'runtime' ( ( ruleEString ) ) ) (otherlv_8= 'severity' otherlv_9= 'levels' ( (lv_driftLevels_10_0= ruleEIntegerObject ) ) ) (otherlv_11= 'parameters' ( (lv_additionalParameters_12_0= ruleParameter ) ) (otherlv_13= ',' ( (lv_additionalParameters_14_0= ruleParameter ) ) )* )? otherlv_15= '}' )
            // InternalPanoptesX.g:1523:3: () otherlv_1= 'HigherOrderAlgorithm' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'codebase' ( (lv_codebase_5_0= ruleEString ) ) ) (otherlv_6= 'runtime' ( ( ruleEString ) ) ) (otherlv_8= 'severity' otherlv_9= 'levels' ( (lv_driftLevels_10_0= ruleEIntegerObject ) ) ) (otherlv_11= 'parameters' ( (lv_additionalParameters_12_0= ruleParameter ) ) (otherlv_13= ',' ( (lv_additionalParameters_14_0= ruleParameter ) ) )* )? otherlv_15= '}'
            {
            // InternalPanoptesX.g:1523:3: ()
            // InternalPanoptesX.g:1524:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getHigherOrderAlgorithmAccess().getHigherOrderAlgorithmAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,38,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getHigherOrderAlgorithmAccess().getHigherOrderAlgorithmKeyword_1());
            		
            // InternalPanoptesX.g:1534:3: ( (lv_name_2_0= ruleEString ) )
            // InternalPanoptesX.g:1535:4: (lv_name_2_0= ruleEString )
            {
            // InternalPanoptesX.g:1535:4: (lv_name_2_0= ruleEString )
            // InternalPanoptesX.g:1536:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_31); 

            			newLeafNode(otherlv_3, grammarAccess.getHigherOrderAlgorithmAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalPanoptesX.g:1557:3: (otherlv_4= 'codebase' ( (lv_codebase_5_0= ruleEString ) ) )
            // InternalPanoptesX.g:1558:4: otherlv_4= 'codebase' ( (lv_codebase_5_0= ruleEString ) )
            {
            otherlv_4=(Token)match(input,31,FOLLOW_4); 

            				newLeafNode(otherlv_4, grammarAccess.getHigherOrderAlgorithmAccess().getCodebaseKeyword_4_0());
            			
            // InternalPanoptesX.g:1562:4: ( (lv_codebase_5_0= ruleEString ) )
            // InternalPanoptesX.g:1563:5: (lv_codebase_5_0= ruleEString )
            {
            // InternalPanoptesX.g:1563:5: (lv_codebase_5_0= ruleEString )
            // InternalPanoptesX.g:1564:6: lv_codebase_5_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getHigherOrderAlgorithmAccess().getCodebaseEStringParserRuleCall_4_1_0());
            					
            pushFollow(FOLLOW_32);
            lv_codebase_5_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getHigherOrderAlgorithmRule());
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

            // InternalPanoptesX.g:1582:3: (otherlv_6= 'runtime' ( ( ruleEString ) ) )
            // InternalPanoptesX.g:1583:4: otherlv_6= 'runtime' ( ( ruleEString ) )
            {
            otherlv_6=(Token)match(input,32,FOLLOW_4); 

            				newLeafNode(otherlv_6, grammarAccess.getHigherOrderAlgorithmAccess().getRuntimeKeyword_5_0());
            			
            // InternalPanoptesX.g:1587:4: ( ( ruleEString ) )
            // InternalPanoptesX.g:1588:5: ( ruleEString )
            {
            // InternalPanoptesX.g:1588:5: ( ruleEString )
            // InternalPanoptesX.g:1589:6: ruleEString
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getHigherOrderAlgorithmRule());
            						}
            					

            						newCompositeNode(grammarAccess.getHigherOrderAlgorithmAccess().getRuntimeHigherOrderAlgorithmRuntimeCrossReference_5_1_0());
            					
            pushFollow(FOLLOW_33);
            ruleEString();

            state._fsp--;


            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalPanoptesX.g:1604:3: (otherlv_8= 'severity' otherlv_9= 'levels' ( (lv_driftLevels_10_0= ruleEIntegerObject ) ) )
            // InternalPanoptesX.g:1605:4: otherlv_8= 'severity' otherlv_9= 'levels' ( (lv_driftLevels_10_0= ruleEIntegerObject ) )
            {
            otherlv_8=(Token)match(input,33,FOLLOW_34); 

            				newLeafNode(otherlv_8, grammarAccess.getHigherOrderAlgorithmAccess().getSeverityKeyword_6_0());
            			
            otherlv_9=(Token)match(input,34,FOLLOW_35); 

            				newLeafNode(otherlv_9, grammarAccess.getHigherOrderAlgorithmAccess().getLevelsKeyword_6_1());
            			
            // InternalPanoptesX.g:1613:4: ( (lv_driftLevels_10_0= ruleEIntegerObject ) )
            // InternalPanoptesX.g:1614:5: (lv_driftLevels_10_0= ruleEIntegerObject )
            {
            // InternalPanoptesX.g:1614:5: (lv_driftLevels_10_0= ruleEIntegerObject )
            // InternalPanoptesX.g:1615:6: lv_driftLevels_10_0= ruleEIntegerObject
            {

            						newCompositeNode(grammarAccess.getHigherOrderAlgorithmAccess().getDriftLevelsEIntegerObjectParserRuleCall_6_2_0());
            					
            pushFollow(FOLLOW_40);
            lv_driftLevels_10_0=ruleEIntegerObject();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getHigherOrderAlgorithmRule());
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

            // InternalPanoptesX.g:1633:3: (otherlv_11= 'parameters' ( (lv_additionalParameters_12_0= ruleParameter ) ) (otherlv_13= ',' ( (lv_additionalParameters_14_0= ruleParameter ) ) )* )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==37) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalPanoptesX.g:1634:4: otherlv_11= 'parameters' ( (lv_additionalParameters_12_0= ruleParameter ) ) (otherlv_13= ',' ( (lv_additionalParameters_14_0= ruleParameter ) ) )*
                    {
                    otherlv_11=(Token)match(input,37,FOLLOW_39); 

                    				newLeafNode(otherlv_11, grammarAccess.getHigherOrderAlgorithmAccess().getParametersKeyword_7_0());
                    			
                    // InternalPanoptesX.g:1638:4: ( (lv_additionalParameters_12_0= ruleParameter ) )
                    // InternalPanoptesX.g:1639:5: (lv_additionalParameters_12_0= ruleParameter )
                    {
                    // InternalPanoptesX.g:1639:5: (lv_additionalParameters_12_0= ruleParameter )
                    // InternalPanoptesX.g:1640:6: lv_additionalParameters_12_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getHigherOrderAlgorithmAccess().getAdditionalParametersParameterParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_additionalParameters_12_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getHigherOrderAlgorithmRule());
                    						}
                    						add(
                    							current,
                    							"additionalParameters",
                    							lv_additionalParameters_12_0,
                    							"org.lowcomote.panoptes.PanoptesX.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPanoptesX.g:1657:4: (otherlv_13= ',' ( (lv_additionalParameters_14_0= ruleParameter ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==14) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalPanoptesX.g:1658:5: otherlv_13= ',' ( (lv_additionalParameters_14_0= ruleParameter ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_39); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getHigherOrderAlgorithmAccess().getCommaKeyword_7_2_0());
                    	    				
                    	    // InternalPanoptesX.g:1662:5: ( (lv_additionalParameters_14_0= ruleParameter ) )
                    	    // InternalPanoptesX.g:1663:6: (lv_additionalParameters_14_0= ruleParameter )
                    	    {
                    	    // InternalPanoptesX.g:1663:6: (lv_additionalParameters_14_0= ruleParameter )
                    	    // InternalPanoptesX.g:1664:7: lv_additionalParameters_14_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getHigherOrderAlgorithmAccess().getAdditionalParametersParameterParserRuleCall_7_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_additionalParameters_14_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getHigherOrderAlgorithmRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"additionalParameters",
                    	    								lv_additionalParameters_14_0,
                    	    								"org.lowcomote.panoptes.PanoptesX.Parameter");
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
                    break;

            }

            otherlv_15=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getHigherOrderAlgorithmAccess().getRightCurlyBracketKeyword_8());
            		

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
    // InternalPanoptesX.g:1691:1: entryRuleAlgorithmRuntime returns [EObject current=null] : iv_ruleAlgorithmRuntime= ruleAlgorithmRuntime EOF ;
    public final EObject entryRuleAlgorithmRuntime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlgorithmRuntime = null;


        try {
            // InternalPanoptesX.g:1691:57: (iv_ruleAlgorithmRuntime= ruleAlgorithmRuntime EOF )
            // InternalPanoptesX.g:1692:2: iv_ruleAlgorithmRuntime= ruleAlgorithmRuntime EOF
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
    // InternalPanoptesX.g:1698:1: ruleAlgorithmRuntime returns [EObject current=null] : (this_BaseAlgorithmRuntime_0= ruleBaseAlgorithmRuntime | this_HigherOrderAlgorithmRuntime_1= ruleHigherOrderAlgorithmRuntime ) ;
    public final EObject ruleAlgorithmRuntime() throws RecognitionException {
        EObject current = null;

        EObject this_BaseAlgorithmRuntime_0 = null;

        EObject this_HigherOrderAlgorithmRuntime_1 = null;



        	enterRule();

        try {
            // InternalPanoptesX.g:1704:2: ( (this_BaseAlgorithmRuntime_0= ruleBaseAlgorithmRuntime | this_HigherOrderAlgorithmRuntime_1= ruleHigherOrderAlgorithmRuntime ) )
            // InternalPanoptesX.g:1705:2: (this_BaseAlgorithmRuntime_0= ruleBaseAlgorithmRuntime | this_HigherOrderAlgorithmRuntime_1= ruleHigherOrderAlgorithmRuntime )
            {
            // InternalPanoptesX.g:1705:2: (this_BaseAlgorithmRuntime_0= ruleBaseAlgorithmRuntime | this_HigherOrderAlgorithmRuntime_1= ruleHigherOrderAlgorithmRuntime )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==39) ) {
                alt33=1;
            }
            else if ( (LA33_0==41) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // InternalPanoptesX.g:1706:3: this_BaseAlgorithmRuntime_0= ruleBaseAlgorithmRuntime
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
                    // InternalPanoptesX.g:1715:3: this_HigherOrderAlgorithmRuntime_1= ruleHigherOrderAlgorithmRuntime
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
    // InternalPanoptesX.g:1727:1: entryRuleBaseAlgorithmRuntime returns [EObject current=null] : iv_ruleBaseAlgorithmRuntime= ruleBaseAlgorithmRuntime EOF ;
    public final EObject entryRuleBaseAlgorithmRuntime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaseAlgorithmRuntime = null;


        try {
            // InternalPanoptesX.g:1727:61: (iv_ruleBaseAlgorithmRuntime= ruleBaseAlgorithmRuntime EOF )
            // InternalPanoptesX.g:1728:2: iv_ruleBaseAlgorithmRuntime= ruleBaseAlgorithmRuntime EOF
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
    // InternalPanoptesX.g:1734:1: ruleBaseAlgorithmRuntime returns [EObject current=null] : ( () otherlv_1= 'BaseAlgorithmRuntime' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'endpoint' ( (lv_endpoint_5_0= ruleEString ) ) )? otherlv_6= '}' ) ;
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
            // InternalPanoptesX.g:1740:2: ( ( () otherlv_1= 'BaseAlgorithmRuntime' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'endpoint' ( (lv_endpoint_5_0= ruleEString ) ) )? otherlv_6= '}' ) )
            // InternalPanoptesX.g:1741:2: ( () otherlv_1= 'BaseAlgorithmRuntime' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'endpoint' ( (lv_endpoint_5_0= ruleEString ) ) )? otherlv_6= '}' )
            {
            // InternalPanoptesX.g:1741:2: ( () otherlv_1= 'BaseAlgorithmRuntime' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'endpoint' ( (lv_endpoint_5_0= ruleEString ) ) )? otherlv_6= '}' )
            // InternalPanoptesX.g:1742:3: () otherlv_1= 'BaseAlgorithmRuntime' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'endpoint' ( (lv_endpoint_5_0= ruleEString ) ) )? otherlv_6= '}'
            {
            // InternalPanoptesX.g:1742:3: ()
            // InternalPanoptesX.g:1743:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBaseAlgorithmRuntimeAccess().getBaseAlgorithmRuntimeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,39,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getBaseAlgorithmRuntimeAccess().getBaseAlgorithmRuntimeKeyword_1());
            		
            // InternalPanoptesX.g:1753:3: ( (lv_name_2_0= ruleEString ) )
            // InternalPanoptesX.g:1754:4: (lv_name_2_0= ruleEString )
            {
            // InternalPanoptesX.g:1754:4: (lv_name_2_0= ruleEString )
            // InternalPanoptesX.g:1755:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBaseAlgorithmRuntimeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
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

            otherlv_3=(Token)match(input,12,FOLLOW_41); 

            			newLeafNode(otherlv_3, grammarAccess.getBaseAlgorithmRuntimeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalPanoptesX.g:1776:3: (otherlv_4= 'endpoint' ( (lv_endpoint_5_0= ruleEString ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==40) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalPanoptesX.g:1777:4: otherlv_4= 'endpoint' ( (lv_endpoint_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,40,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getBaseAlgorithmRuntimeAccess().getEndpointKeyword_4_0());
                    			
                    // InternalPanoptesX.g:1781:4: ( (lv_endpoint_5_0= ruleEString ) )
                    // InternalPanoptesX.g:1782:5: (lv_endpoint_5_0= ruleEString )
                    {
                    // InternalPanoptesX.g:1782:5: (lv_endpoint_5_0= ruleEString )
                    // InternalPanoptesX.g:1783:6: lv_endpoint_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getBaseAlgorithmRuntimeAccess().getEndpointEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_8);
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


                    }
                    break;

            }

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getBaseAlgorithmRuntimeAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalPanoptesX.g:1809:1: entryRuleHigherOrderAlgorithmRuntime returns [EObject current=null] : iv_ruleHigherOrderAlgorithmRuntime= ruleHigherOrderAlgorithmRuntime EOF ;
    public final EObject entryRuleHigherOrderAlgorithmRuntime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHigherOrderAlgorithmRuntime = null;


        try {
            // InternalPanoptesX.g:1809:68: (iv_ruleHigherOrderAlgorithmRuntime= ruleHigherOrderAlgorithmRuntime EOF )
            // InternalPanoptesX.g:1810:2: iv_ruleHigherOrderAlgorithmRuntime= ruleHigherOrderAlgorithmRuntime EOF
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
    // InternalPanoptesX.g:1816:1: ruleHigherOrderAlgorithmRuntime returns [EObject current=null] : ( () otherlv_1= 'HigherOrderAlgorithmRuntime' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'endpoint' ( (lv_endpoint_5_0= ruleEString ) ) )? otherlv_6= '}' ) ;
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
            // InternalPanoptesX.g:1822:2: ( ( () otherlv_1= 'HigherOrderAlgorithmRuntime' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'endpoint' ( (lv_endpoint_5_0= ruleEString ) ) )? otherlv_6= '}' ) )
            // InternalPanoptesX.g:1823:2: ( () otherlv_1= 'HigherOrderAlgorithmRuntime' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'endpoint' ( (lv_endpoint_5_0= ruleEString ) ) )? otherlv_6= '}' )
            {
            // InternalPanoptesX.g:1823:2: ( () otherlv_1= 'HigherOrderAlgorithmRuntime' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'endpoint' ( (lv_endpoint_5_0= ruleEString ) ) )? otherlv_6= '}' )
            // InternalPanoptesX.g:1824:3: () otherlv_1= 'HigherOrderAlgorithmRuntime' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'endpoint' ( (lv_endpoint_5_0= ruleEString ) ) )? otherlv_6= '}'
            {
            // InternalPanoptesX.g:1824:3: ()
            // InternalPanoptesX.g:1825:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getHigherOrderAlgorithmRuntimeAccess().getHigherOrderAlgorithmRuntimeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,41,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getHigherOrderAlgorithmRuntimeAccess().getHigherOrderAlgorithmRuntimeKeyword_1());
            		
            // InternalPanoptesX.g:1835:3: ( (lv_name_2_0= ruleEString ) )
            // InternalPanoptesX.g:1836:4: (lv_name_2_0= ruleEString )
            {
            // InternalPanoptesX.g:1836:4: (lv_name_2_0= ruleEString )
            // InternalPanoptesX.g:1837:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getHigherOrderAlgorithmRuntimeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
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

            otherlv_3=(Token)match(input,12,FOLLOW_41); 

            			newLeafNode(otherlv_3, grammarAccess.getHigherOrderAlgorithmRuntimeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalPanoptesX.g:1858:3: (otherlv_4= 'endpoint' ( (lv_endpoint_5_0= ruleEString ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==40) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalPanoptesX.g:1859:4: otherlv_4= 'endpoint' ( (lv_endpoint_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,40,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getHigherOrderAlgorithmRuntimeAccess().getEndpointKeyword_4_0());
                    			
                    // InternalPanoptesX.g:1863:4: ( (lv_endpoint_5_0= ruleEString ) )
                    // InternalPanoptesX.g:1864:5: (lv_endpoint_5_0= ruleEString )
                    {
                    // InternalPanoptesX.g:1864:5: (lv_endpoint_5_0= ruleEString )
                    // InternalPanoptesX.g:1865:6: lv_endpoint_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getHigherOrderAlgorithmRuntimeAccess().getEndpointEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_8);
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


                    }
                    break;

            }

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getHigherOrderAlgorithmRuntimeAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalPanoptesX.g:1891:1: entryRuleAlgorithmExecution returns [EObject current=null] : iv_ruleAlgorithmExecution= ruleAlgorithmExecution EOF ;
    public final EObject entryRuleAlgorithmExecution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlgorithmExecution = null;


        try {
            // InternalPanoptesX.g:1891:59: (iv_ruleAlgorithmExecution= ruleAlgorithmExecution EOF )
            // InternalPanoptesX.g:1892:2: iv_ruleAlgorithmExecution= ruleAlgorithmExecution EOF
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
    // InternalPanoptesX.g:1898:1: ruleAlgorithmExecution returns [EObject current=null] : (this_BaseAlgorithmExecution_0= ruleBaseAlgorithmExecution | this_HigherOrderAlgorithmExecution_1= ruleHigherOrderAlgorithmExecution ) ;
    public final EObject ruleAlgorithmExecution() throws RecognitionException {
        EObject current = null;

        EObject this_BaseAlgorithmExecution_0 = null;

        EObject this_HigherOrderAlgorithmExecution_1 = null;



        	enterRule();

        try {
            // InternalPanoptesX.g:1904:2: ( (this_BaseAlgorithmExecution_0= ruleBaseAlgorithmExecution | this_HigherOrderAlgorithmExecution_1= ruleHigherOrderAlgorithmExecution ) )
            // InternalPanoptesX.g:1905:2: (this_BaseAlgorithmExecution_0= ruleBaseAlgorithmExecution | this_HigherOrderAlgorithmExecution_1= ruleHigherOrderAlgorithmExecution )
            {
            // InternalPanoptesX.g:1905:2: (this_BaseAlgorithmExecution_0= ruleBaseAlgorithmExecution | this_HigherOrderAlgorithmExecution_1= ruleHigherOrderAlgorithmExecution )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==42) ) {
                alt36=1;
            }
            else if ( (LA36_0==51) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalPanoptesX.g:1906:3: this_BaseAlgorithmExecution_0= ruleBaseAlgorithmExecution
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
                    // InternalPanoptesX.g:1915:3: this_HigherOrderAlgorithmExecution_1= ruleHigherOrderAlgorithmExecution
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
    // InternalPanoptesX.g:1927:1: entryRuleBaseAlgorithmExecution returns [EObject current=null] : iv_ruleBaseAlgorithmExecution= ruleBaseAlgorithmExecution EOF ;
    public final EObject entryRuleBaseAlgorithmExecution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaseAlgorithmExecution = null;


        try {
            // InternalPanoptesX.g:1927:63: (iv_ruleBaseAlgorithmExecution= ruleBaseAlgorithmExecution EOF )
            // InternalPanoptesX.g:1928:2: iv_ruleBaseAlgorithmExecution= ruleBaseAlgorithmExecution EOF
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
    // InternalPanoptesX.g:1934:1: ruleBaseAlgorithmExecution returns [EObject current=null] : ( () otherlv_1= 'BaseAlgorithmExecution' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'algorithm' ( ( ruleEString ) ) ) (otherlv_6= 'from' otherlv_7= 'live' otherlv_8= 'data' otherlv_9= 'use' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* )? (otherlv_13= 'from' otherlv_14= 'historic' otherlv_15= 'data' otherlv_16= 'use' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* )? (otherlv_20= 'actions' ( (lv_ActionExecutionMap_21_0= ruleactionExecutionEntry ) ) (otherlv_22= ',' ( (lv_ActionExecutionMap_23_0= ruleactionExecutionEntry ) ) )* ) (otherlv_24= 'parameter' otherlv_25= 'values' ( (lv_parameterValueMap_26_0= ruleparameterValueEntry ) ) (otherlv_27= ',' ( (lv_parameterValueMap_28_0= ruleparameterValueEntry ) ) )* )? otherlv_29= '}' ) ;
    public final EObject ruleBaseAlgorithmExecution() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_ActionExecutionMap_21_0 = null;

        EObject lv_ActionExecutionMap_23_0 = null;

        EObject lv_parameterValueMap_26_0 = null;

        EObject lv_parameterValueMap_28_0 = null;



        	enterRule();

        try {
            // InternalPanoptesX.g:1940:2: ( ( () otherlv_1= 'BaseAlgorithmExecution' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'algorithm' ( ( ruleEString ) ) ) (otherlv_6= 'from' otherlv_7= 'live' otherlv_8= 'data' otherlv_9= 'use' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* )? (otherlv_13= 'from' otherlv_14= 'historic' otherlv_15= 'data' otherlv_16= 'use' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* )? (otherlv_20= 'actions' ( (lv_ActionExecutionMap_21_0= ruleactionExecutionEntry ) ) (otherlv_22= ',' ( (lv_ActionExecutionMap_23_0= ruleactionExecutionEntry ) ) )* ) (otherlv_24= 'parameter' otherlv_25= 'values' ( (lv_parameterValueMap_26_0= ruleparameterValueEntry ) ) (otherlv_27= ',' ( (lv_parameterValueMap_28_0= ruleparameterValueEntry ) ) )* )? otherlv_29= '}' ) )
            // InternalPanoptesX.g:1941:2: ( () otherlv_1= 'BaseAlgorithmExecution' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'algorithm' ( ( ruleEString ) ) ) (otherlv_6= 'from' otherlv_7= 'live' otherlv_8= 'data' otherlv_9= 'use' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* )? (otherlv_13= 'from' otherlv_14= 'historic' otherlv_15= 'data' otherlv_16= 'use' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* )? (otherlv_20= 'actions' ( (lv_ActionExecutionMap_21_0= ruleactionExecutionEntry ) ) (otherlv_22= ',' ( (lv_ActionExecutionMap_23_0= ruleactionExecutionEntry ) ) )* ) (otherlv_24= 'parameter' otherlv_25= 'values' ( (lv_parameterValueMap_26_0= ruleparameterValueEntry ) ) (otherlv_27= ',' ( (lv_parameterValueMap_28_0= ruleparameterValueEntry ) ) )* )? otherlv_29= '}' )
            {
            // InternalPanoptesX.g:1941:2: ( () otherlv_1= 'BaseAlgorithmExecution' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'algorithm' ( ( ruleEString ) ) ) (otherlv_6= 'from' otherlv_7= 'live' otherlv_8= 'data' otherlv_9= 'use' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* )? (otherlv_13= 'from' otherlv_14= 'historic' otherlv_15= 'data' otherlv_16= 'use' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* )? (otherlv_20= 'actions' ( (lv_ActionExecutionMap_21_0= ruleactionExecutionEntry ) ) (otherlv_22= ',' ( (lv_ActionExecutionMap_23_0= ruleactionExecutionEntry ) ) )* ) (otherlv_24= 'parameter' otherlv_25= 'values' ( (lv_parameterValueMap_26_0= ruleparameterValueEntry ) ) (otherlv_27= ',' ( (lv_parameterValueMap_28_0= ruleparameterValueEntry ) ) )* )? otherlv_29= '}' )
            // InternalPanoptesX.g:1942:3: () otherlv_1= 'BaseAlgorithmExecution' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'algorithm' ( ( ruleEString ) ) ) (otherlv_6= 'from' otherlv_7= 'live' otherlv_8= 'data' otherlv_9= 'use' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* )? (otherlv_13= 'from' otherlv_14= 'historic' otherlv_15= 'data' otherlv_16= 'use' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* )? (otherlv_20= 'actions' ( (lv_ActionExecutionMap_21_0= ruleactionExecutionEntry ) ) (otherlv_22= ',' ( (lv_ActionExecutionMap_23_0= ruleactionExecutionEntry ) ) )* ) (otherlv_24= 'parameter' otherlv_25= 'values' ( (lv_parameterValueMap_26_0= ruleparameterValueEntry ) ) (otherlv_27= ',' ( (lv_parameterValueMap_28_0= ruleparameterValueEntry ) ) )* )? otherlv_29= '}'
            {
            // InternalPanoptesX.g:1942:3: ()
            // InternalPanoptesX.g:1943:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBaseAlgorithmExecutionAccess().getBaseAlgorithmExecutionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,42,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getBaseAlgorithmExecutionAccess().getBaseAlgorithmExecutionKeyword_1());
            		
            // InternalPanoptesX.g:1953:3: ( (lv_name_2_0= ruleEString ) )
            // InternalPanoptesX.g:1954:4: (lv_name_2_0= ruleEString )
            {
            // InternalPanoptesX.g:1954:4: (lv_name_2_0= ruleEString )
            // InternalPanoptesX.g:1955:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_42); 

            			newLeafNode(otherlv_3, grammarAccess.getBaseAlgorithmExecutionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalPanoptesX.g:1976:3: (otherlv_4= 'algorithm' ( ( ruleEString ) ) )
            // InternalPanoptesX.g:1977:4: otherlv_4= 'algorithm' ( ( ruleEString ) )
            {
            otherlv_4=(Token)match(input,43,FOLLOW_4); 

            				newLeafNode(otherlv_4, grammarAccess.getBaseAlgorithmExecutionAccess().getAlgorithmKeyword_4_0());
            			
            // InternalPanoptesX.g:1981:4: ( ( ruleEString ) )
            // InternalPanoptesX.g:1982:5: ( ruleEString )
            {
            // InternalPanoptesX.g:1982:5: ( ruleEString )
            // InternalPanoptesX.g:1983:6: ruleEString
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getBaseAlgorithmExecutionRule());
            						}
            					

            						newCompositeNode(grammarAccess.getBaseAlgorithmExecutionAccess().getExecutableBaseAlgorithmCrossReference_4_1_0());
            					
            pushFollow(FOLLOW_43);
            ruleEString();

            state._fsp--;


            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalPanoptesX.g:1998:3: (otherlv_6= 'from' otherlv_7= 'live' otherlv_8= 'data' otherlv_9= 'use' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==44) ) {
                int LA38_1 = input.LA(2);

                if ( (LA38_1==45) ) {
                    alt38=1;
                }
            }
            switch (alt38) {
                case 1 :
                    // InternalPanoptesX.g:1999:4: otherlv_6= 'from' otherlv_7= 'live' otherlv_8= 'data' otherlv_9= 'use' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_6=(Token)match(input,44,FOLLOW_44); 

                    				newLeafNode(otherlv_6, grammarAccess.getBaseAlgorithmExecutionAccess().getFromKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,45,FOLLOW_13); 

                    				newLeafNode(otherlv_7, grammarAccess.getBaseAlgorithmExecutionAccess().getLiveKeyword_5_1());
                    			
                    otherlv_8=(Token)match(input,22,FOLLOW_45); 

                    				newLeafNode(otherlv_8, grammarAccess.getBaseAlgorithmExecutionAccess().getDataKeyword_5_2());
                    			
                    otherlv_9=(Token)match(input,46,FOLLOW_4); 

                    				newLeafNode(otherlv_9, grammarAccess.getBaseAlgorithmExecutionAccess().getUseKeyword_5_3());
                    			
                    // InternalPanoptesX.g:2015:4: ( ( ruleEString ) )
                    // InternalPanoptesX.g:2016:5: ( ruleEString )
                    {
                    // InternalPanoptesX.g:2016:5: ( ruleEString )
                    // InternalPanoptesX.g:2017:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBaseAlgorithmExecutionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getBaseAlgorithmExecutionAccess().getCurrentIOValuesModelIOCrossReference_5_4_0());
                    					
                    pushFollow(FOLLOW_46);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPanoptesX.g:2031:4: (otherlv_11= ',' ( ( ruleEString ) ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==14) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // InternalPanoptesX.g:2032:5: otherlv_11= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_11=(Token)match(input,14,FOLLOW_4); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getBaseAlgorithmExecutionAccess().getCommaKeyword_5_5_0());
                    	    				
                    	    // InternalPanoptesX.g:2036:5: ( ( ruleEString ) )
                    	    // InternalPanoptesX.g:2037:6: ( ruleEString )
                    	    {
                    	    // InternalPanoptesX.g:2037:6: ( ruleEString )
                    	    // InternalPanoptesX.g:2038:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getBaseAlgorithmExecutionRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getBaseAlgorithmExecutionAccess().getCurrentIOValuesModelIOCrossReference_5_5_1_0());
                    	    						
                    	    pushFollow(FOLLOW_46);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalPanoptesX.g:2054:3: (otherlv_13= 'from' otherlv_14= 'historic' otherlv_15= 'data' otherlv_16= 'use' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==44) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalPanoptesX.g:2055:4: otherlv_13= 'from' otherlv_14= 'historic' otherlv_15= 'data' otherlv_16= 'use' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_13=(Token)match(input,44,FOLLOW_47); 

                    				newLeafNode(otherlv_13, grammarAccess.getBaseAlgorithmExecutionAccess().getFromKeyword_6_0());
                    			
                    otherlv_14=(Token)match(input,47,FOLLOW_13); 

                    				newLeafNode(otherlv_14, grammarAccess.getBaseAlgorithmExecutionAccess().getHistoricKeyword_6_1());
                    			
                    otherlv_15=(Token)match(input,22,FOLLOW_45); 

                    				newLeafNode(otherlv_15, grammarAccess.getBaseAlgorithmExecutionAccess().getDataKeyword_6_2());
                    			
                    otherlv_16=(Token)match(input,46,FOLLOW_4); 

                    				newLeafNode(otherlv_16, grammarAccess.getBaseAlgorithmExecutionAccess().getUseKeyword_6_3());
                    			
                    // InternalPanoptesX.g:2071:4: ( ( ruleEString ) )
                    // InternalPanoptesX.g:2072:5: ( ruleEString )
                    {
                    // InternalPanoptesX.g:2072:5: ( ruleEString )
                    // InternalPanoptesX.g:2073:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBaseAlgorithmExecutionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getBaseAlgorithmExecutionAccess().getHistoricIOValuesModelIOCrossReference_6_4_0());
                    					
                    pushFollow(FOLLOW_48);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPanoptesX.g:2087:4: (otherlv_18= ',' ( ( ruleEString ) ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==14) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // InternalPanoptesX.g:2088:5: otherlv_18= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_18=(Token)match(input,14,FOLLOW_4); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getBaseAlgorithmExecutionAccess().getCommaKeyword_6_5_0());
                    	    				
                    	    // InternalPanoptesX.g:2092:5: ( ( ruleEString ) )
                    	    // InternalPanoptesX.g:2093:6: ( ruleEString )
                    	    {
                    	    // InternalPanoptesX.g:2093:6: ( ruleEString )
                    	    // InternalPanoptesX.g:2094:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getBaseAlgorithmExecutionRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getBaseAlgorithmExecutionAccess().getHistoricIOValuesModelIOCrossReference_6_5_1_0());
                    	    						
                    	    pushFollow(FOLLOW_48);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalPanoptesX.g:2110:3: (otherlv_20= 'actions' ( (lv_ActionExecutionMap_21_0= ruleactionExecutionEntry ) ) (otherlv_22= ',' ( (lv_ActionExecutionMap_23_0= ruleactionExecutionEntry ) ) )* )
            // InternalPanoptesX.g:2111:4: otherlv_20= 'actions' ( (lv_ActionExecutionMap_21_0= ruleactionExecutionEntry ) ) (otherlv_22= ',' ( (lv_ActionExecutionMap_23_0= ruleactionExecutionEntry ) ) )*
            {
            otherlv_20=(Token)match(input,48,FOLLOW_35); 

            				newLeafNode(otherlv_20, grammarAccess.getBaseAlgorithmExecutionAccess().getActionsKeyword_7_0());
            			
            // InternalPanoptesX.g:2115:4: ( (lv_ActionExecutionMap_21_0= ruleactionExecutionEntry ) )
            // InternalPanoptesX.g:2116:5: (lv_ActionExecutionMap_21_0= ruleactionExecutionEntry )
            {
            // InternalPanoptesX.g:2116:5: (lv_ActionExecutionMap_21_0= ruleactionExecutionEntry )
            // InternalPanoptesX.g:2117:6: lv_ActionExecutionMap_21_0= ruleactionExecutionEntry
            {

            						newCompositeNode(grammarAccess.getBaseAlgorithmExecutionAccess().getActionExecutionMapActionExecutionEntryParserRuleCall_7_1_0());
            					
            pushFollow(FOLLOW_49);
            lv_ActionExecutionMap_21_0=ruleactionExecutionEntry();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getBaseAlgorithmExecutionRule());
            						}
            						add(
            							current,
            							"ActionExecutionMap",
            							lv_ActionExecutionMap_21_0,
            							"org.lowcomote.panoptes.PanoptesX.actionExecutionEntry");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalPanoptesX.g:2134:4: (otherlv_22= ',' ( (lv_ActionExecutionMap_23_0= ruleactionExecutionEntry ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==14) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalPanoptesX.g:2135:5: otherlv_22= ',' ( (lv_ActionExecutionMap_23_0= ruleactionExecutionEntry ) )
            	    {
            	    otherlv_22=(Token)match(input,14,FOLLOW_35); 

            	    					newLeafNode(otherlv_22, grammarAccess.getBaseAlgorithmExecutionAccess().getCommaKeyword_7_2_0());
            	    				
            	    // InternalPanoptesX.g:2139:5: ( (lv_ActionExecutionMap_23_0= ruleactionExecutionEntry ) )
            	    // InternalPanoptesX.g:2140:6: (lv_ActionExecutionMap_23_0= ruleactionExecutionEntry )
            	    {
            	    // InternalPanoptesX.g:2140:6: (lv_ActionExecutionMap_23_0= ruleactionExecutionEntry )
            	    // InternalPanoptesX.g:2141:7: lv_ActionExecutionMap_23_0= ruleactionExecutionEntry
            	    {

            	    							newCompositeNode(grammarAccess.getBaseAlgorithmExecutionAccess().getActionExecutionMapActionExecutionEntryParserRuleCall_7_2_1_0());
            	    						
            	    pushFollow(FOLLOW_49);
            	    lv_ActionExecutionMap_23_0=ruleactionExecutionEntry();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getBaseAlgorithmExecutionRule());
            	    							}
            	    							add(
            	    								current,
            	    								"ActionExecutionMap",
            	    								lv_ActionExecutionMap_23_0,
            	    								"org.lowcomote.panoptes.PanoptesX.actionExecutionEntry");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);


            }

            // InternalPanoptesX.g:2160:3: (otherlv_24= 'parameter' otherlv_25= 'values' ( (lv_parameterValueMap_26_0= ruleparameterValueEntry ) ) (otherlv_27= ',' ( (lv_parameterValueMap_28_0= ruleparameterValueEntry ) ) )* )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==49) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalPanoptesX.g:2161:4: otherlv_24= 'parameter' otherlv_25= 'values' ( (lv_parameterValueMap_26_0= ruleparameterValueEntry ) ) (otherlv_27= ',' ( (lv_parameterValueMap_28_0= ruleparameterValueEntry ) ) )*
                    {
                    otherlv_24=(Token)match(input,49,FOLLOW_50); 

                    				newLeafNode(otherlv_24, grammarAccess.getBaseAlgorithmExecutionAccess().getParameterKeyword_8_0());
                    			
                    otherlv_25=(Token)match(input,50,FOLLOW_4); 

                    				newLeafNode(otherlv_25, grammarAccess.getBaseAlgorithmExecutionAccess().getValuesKeyword_8_1());
                    			
                    // InternalPanoptesX.g:2169:4: ( (lv_parameterValueMap_26_0= ruleparameterValueEntry ) )
                    // InternalPanoptesX.g:2170:5: (lv_parameterValueMap_26_0= ruleparameterValueEntry )
                    {
                    // InternalPanoptesX.g:2170:5: (lv_parameterValueMap_26_0= ruleparameterValueEntry )
                    // InternalPanoptesX.g:2171:6: lv_parameterValueMap_26_0= ruleparameterValueEntry
                    {

                    						newCompositeNode(grammarAccess.getBaseAlgorithmExecutionAccess().getParameterValueMapParameterValueEntryParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_parameterValueMap_26_0=ruleparameterValueEntry();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBaseAlgorithmExecutionRule());
                    						}
                    						add(
                    							current,
                    							"parameterValueMap",
                    							lv_parameterValueMap_26_0,
                    							"org.lowcomote.panoptes.PanoptesX.parameterValueEntry");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPanoptesX.g:2188:4: (otherlv_27= ',' ( (lv_parameterValueMap_28_0= ruleparameterValueEntry ) ) )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==14) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // InternalPanoptesX.g:2189:5: otherlv_27= ',' ( (lv_parameterValueMap_28_0= ruleparameterValueEntry ) )
                    	    {
                    	    otherlv_27=(Token)match(input,14,FOLLOW_4); 

                    	    					newLeafNode(otherlv_27, grammarAccess.getBaseAlgorithmExecutionAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalPanoptesX.g:2193:5: ( (lv_parameterValueMap_28_0= ruleparameterValueEntry ) )
                    	    // InternalPanoptesX.g:2194:6: (lv_parameterValueMap_28_0= ruleparameterValueEntry )
                    	    {
                    	    // InternalPanoptesX.g:2194:6: (lv_parameterValueMap_28_0= ruleparameterValueEntry )
                    	    // InternalPanoptesX.g:2195:7: lv_parameterValueMap_28_0= ruleparameterValueEntry
                    	    {

                    	    							newCompositeNode(grammarAccess.getBaseAlgorithmExecutionAccess().getParameterValueMapParameterValueEntryParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_parameterValueMap_28_0=ruleparameterValueEntry();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBaseAlgorithmExecutionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameterValueMap",
                    	    								lv_parameterValueMap_28_0,
                    	    								"org.lowcomote.panoptes.PanoptesX.parameterValueEntry");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop42;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_29=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_29, grammarAccess.getBaseAlgorithmExecutionAccess().getRightCurlyBracketKeyword_9());
            		

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
    // InternalPanoptesX.g:2222:1: entryRuleHigherOrderAlgorithmExecution returns [EObject current=null] : iv_ruleHigherOrderAlgorithmExecution= ruleHigherOrderAlgorithmExecution EOF ;
    public final EObject entryRuleHigherOrderAlgorithmExecution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHigherOrderAlgorithmExecution = null;


        try {
            // InternalPanoptesX.g:2222:70: (iv_ruleHigherOrderAlgorithmExecution= ruleHigherOrderAlgorithmExecution EOF )
            // InternalPanoptesX.g:2223:2: iv_ruleHigherOrderAlgorithmExecution= ruleHigherOrderAlgorithmExecution EOF
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
    // InternalPanoptesX.g:2229:1: ruleHigherOrderAlgorithmExecution returns [EObject current=null] : ( () otherlv_1= 'HigherOrderAlgorithmExecution' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'algorithm' ( ( ruleEString ) ) ) (otherlv_6= 'observed' otherlv_7= 'execution' ( ( ruleEString ) ) ) (otherlv_9= 'actions' ( (lv_ActionExecutionMap_10_0= ruleactionExecutionEntry ) ) (otherlv_11= ',' ( (lv_ActionExecutionMap_12_0= ruleactionExecutionEntry ) ) )* ) ( (otherlv_13= 'minimum' | otherlv_14= 'min' ) otherlv_15= 'observations' ( (lv_minDataPoints_16_0= ruleEIntegerObject ) ) )? ( (otherlv_17= 'maximum' | otherlv_18= 'max' ) otherlv_19= 'observations' ( (lv_maxDataPoints_20_0= ruleEIntegerObject ) ) )? (otherlv_21= 'parameter' otherlv_22= 'values' ( (lv_parameterValueMap_23_0= ruleparameterValueEntry ) ) (otherlv_24= ',' ( (lv_parameterValueMap_25_0= ruleparameterValueEntry ) ) )* )? otherlv_26= '}' ) ;
    public final EObject ruleHigherOrderAlgorithmExecution() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_ActionExecutionMap_10_0 = null;

        EObject lv_ActionExecutionMap_12_0 = null;

        AntlrDatatypeRuleToken lv_minDataPoints_16_0 = null;

        AntlrDatatypeRuleToken lv_maxDataPoints_20_0 = null;

        EObject lv_parameterValueMap_23_0 = null;

        EObject lv_parameterValueMap_25_0 = null;



        	enterRule();

        try {
            // InternalPanoptesX.g:2235:2: ( ( () otherlv_1= 'HigherOrderAlgorithmExecution' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'algorithm' ( ( ruleEString ) ) ) (otherlv_6= 'observed' otherlv_7= 'execution' ( ( ruleEString ) ) ) (otherlv_9= 'actions' ( (lv_ActionExecutionMap_10_0= ruleactionExecutionEntry ) ) (otherlv_11= ',' ( (lv_ActionExecutionMap_12_0= ruleactionExecutionEntry ) ) )* ) ( (otherlv_13= 'minimum' | otherlv_14= 'min' ) otherlv_15= 'observations' ( (lv_minDataPoints_16_0= ruleEIntegerObject ) ) )? ( (otherlv_17= 'maximum' | otherlv_18= 'max' ) otherlv_19= 'observations' ( (lv_maxDataPoints_20_0= ruleEIntegerObject ) ) )? (otherlv_21= 'parameter' otherlv_22= 'values' ( (lv_parameterValueMap_23_0= ruleparameterValueEntry ) ) (otherlv_24= ',' ( (lv_parameterValueMap_25_0= ruleparameterValueEntry ) ) )* )? otherlv_26= '}' ) )
            // InternalPanoptesX.g:2236:2: ( () otherlv_1= 'HigherOrderAlgorithmExecution' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'algorithm' ( ( ruleEString ) ) ) (otherlv_6= 'observed' otherlv_7= 'execution' ( ( ruleEString ) ) ) (otherlv_9= 'actions' ( (lv_ActionExecutionMap_10_0= ruleactionExecutionEntry ) ) (otherlv_11= ',' ( (lv_ActionExecutionMap_12_0= ruleactionExecutionEntry ) ) )* ) ( (otherlv_13= 'minimum' | otherlv_14= 'min' ) otherlv_15= 'observations' ( (lv_minDataPoints_16_0= ruleEIntegerObject ) ) )? ( (otherlv_17= 'maximum' | otherlv_18= 'max' ) otherlv_19= 'observations' ( (lv_maxDataPoints_20_0= ruleEIntegerObject ) ) )? (otherlv_21= 'parameter' otherlv_22= 'values' ( (lv_parameterValueMap_23_0= ruleparameterValueEntry ) ) (otherlv_24= ',' ( (lv_parameterValueMap_25_0= ruleparameterValueEntry ) ) )* )? otherlv_26= '}' )
            {
            // InternalPanoptesX.g:2236:2: ( () otherlv_1= 'HigherOrderAlgorithmExecution' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'algorithm' ( ( ruleEString ) ) ) (otherlv_6= 'observed' otherlv_7= 'execution' ( ( ruleEString ) ) ) (otherlv_9= 'actions' ( (lv_ActionExecutionMap_10_0= ruleactionExecutionEntry ) ) (otherlv_11= ',' ( (lv_ActionExecutionMap_12_0= ruleactionExecutionEntry ) ) )* ) ( (otherlv_13= 'minimum' | otherlv_14= 'min' ) otherlv_15= 'observations' ( (lv_minDataPoints_16_0= ruleEIntegerObject ) ) )? ( (otherlv_17= 'maximum' | otherlv_18= 'max' ) otherlv_19= 'observations' ( (lv_maxDataPoints_20_0= ruleEIntegerObject ) ) )? (otherlv_21= 'parameter' otherlv_22= 'values' ( (lv_parameterValueMap_23_0= ruleparameterValueEntry ) ) (otherlv_24= ',' ( (lv_parameterValueMap_25_0= ruleparameterValueEntry ) ) )* )? otherlv_26= '}' )
            // InternalPanoptesX.g:2237:3: () otherlv_1= 'HigherOrderAlgorithmExecution' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'algorithm' ( ( ruleEString ) ) ) (otherlv_6= 'observed' otherlv_7= 'execution' ( ( ruleEString ) ) ) (otherlv_9= 'actions' ( (lv_ActionExecutionMap_10_0= ruleactionExecutionEntry ) ) (otherlv_11= ',' ( (lv_ActionExecutionMap_12_0= ruleactionExecutionEntry ) ) )* ) ( (otherlv_13= 'minimum' | otherlv_14= 'min' ) otherlv_15= 'observations' ( (lv_minDataPoints_16_0= ruleEIntegerObject ) ) )? ( (otherlv_17= 'maximum' | otherlv_18= 'max' ) otherlv_19= 'observations' ( (lv_maxDataPoints_20_0= ruleEIntegerObject ) ) )? (otherlv_21= 'parameter' otherlv_22= 'values' ( (lv_parameterValueMap_23_0= ruleparameterValueEntry ) ) (otherlv_24= ',' ( (lv_parameterValueMap_25_0= ruleparameterValueEntry ) ) )* )? otherlv_26= '}'
            {
            // InternalPanoptesX.g:2237:3: ()
            // InternalPanoptesX.g:2238:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getHigherOrderAlgorithmExecutionAccess().getHigherOrderAlgorithmExecutionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,51,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getHigherOrderAlgorithmExecutionAccess().getHigherOrderAlgorithmExecutionKeyword_1());
            		
            // InternalPanoptesX.g:2248:3: ( (lv_name_2_0= ruleEString ) )
            // InternalPanoptesX.g:2249:4: (lv_name_2_0= ruleEString )
            {
            // InternalPanoptesX.g:2249:4: (lv_name_2_0= ruleEString )
            // InternalPanoptesX.g:2250:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_42); 

            			newLeafNode(otherlv_3, grammarAccess.getHigherOrderAlgorithmExecutionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalPanoptesX.g:2271:3: (otherlv_4= 'algorithm' ( ( ruleEString ) ) )
            // InternalPanoptesX.g:2272:4: otherlv_4= 'algorithm' ( ( ruleEString ) )
            {
            otherlv_4=(Token)match(input,43,FOLLOW_4); 

            				newLeafNode(otherlv_4, grammarAccess.getHigherOrderAlgorithmExecutionAccess().getAlgorithmKeyword_4_0());
            			
            // InternalPanoptesX.g:2276:4: ( ( ruleEString ) )
            // InternalPanoptesX.g:2277:5: ( ruleEString )
            {
            // InternalPanoptesX.g:2277:5: ( ruleEString )
            // InternalPanoptesX.g:2278:6: ruleEString
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getHigherOrderAlgorithmExecutionRule());
            						}
            					

            						newCompositeNode(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getExecutableHigherOrderAlgorithmCrossReference_4_1_0());
            					
            pushFollow(FOLLOW_51);
            ruleEString();

            state._fsp--;


            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalPanoptesX.g:2293:3: (otherlv_6= 'observed' otherlv_7= 'execution' ( ( ruleEString ) ) )
            // InternalPanoptesX.g:2294:4: otherlv_6= 'observed' otherlv_7= 'execution' ( ( ruleEString ) )
            {
            otherlv_6=(Token)match(input,52,FOLLOW_52); 

            				newLeafNode(otherlv_6, grammarAccess.getHigherOrderAlgorithmExecutionAccess().getObservedKeyword_5_0());
            			
            otherlv_7=(Token)match(input,53,FOLLOW_4); 

            				newLeafNode(otherlv_7, grammarAccess.getHigherOrderAlgorithmExecutionAccess().getExecutionKeyword_5_1());
            			
            // InternalPanoptesX.g:2302:4: ( ( ruleEString ) )
            // InternalPanoptesX.g:2303:5: ( ruleEString )
            {
            // InternalPanoptesX.g:2303:5: ( ruleEString )
            // InternalPanoptesX.g:2304:6: ruleEString
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getHigherOrderAlgorithmExecutionRule());
            						}
            					

            						newCompositeNode(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getAlgorithmExecutionAlgorithmExecutionCrossReference_5_2_0());
            					
            pushFollow(FOLLOW_53);
            ruleEString();

            state._fsp--;


            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalPanoptesX.g:2319:3: (otherlv_9= 'actions' ( (lv_ActionExecutionMap_10_0= ruleactionExecutionEntry ) ) (otherlv_11= ',' ( (lv_ActionExecutionMap_12_0= ruleactionExecutionEntry ) ) )* )
            // InternalPanoptesX.g:2320:4: otherlv_9= 'actions' ( (lv_ActionExecutionMap_10_0= ruleactionExecutionEntry ) ) (otherlv_11= ',' ( (lv_ActionExecutionMap_12_0= ruleactionExecutionEntry ) ) )*
            {
            otherlv_9=(Token)match(input,48,FOLLOW_35); 

            				newLeafNode(otherlv_9, grammarAccess.getHigherOrderAlgorithmExecutionAccess().getActionsKeyword_6_0());
            			
            // InternalPanoptesX.g:2324:4: ( (lv_ActionExecutionMap_10_0= ruleactionExecutionEntry ) )
            // InternalPanoptesX.g:2325:5: (lv_ActionExecutionMap_10_0= ruleactionExecutionEntry )
            {
            // InternalPanoptesX.g:2325:5: (lv_ActionExecutionMap_10_0= ruleactionExecutionEntry )
            // InternalPanoptesX.g:2326:6: lv_ActionExecutionMap_10_0= ruleactionExecutionEntry
            {

            						newCompositeNode(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getActionExecutionMapActionExecutionEntryParserRuleCall_6_1_0());
            					
            pushFollow(FOLLOW_54);
            lv_ActionExecutionMap_10_0=ruleactionExecutionEntry();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getHigherOrderAlgorithmExecutionRule());
            						}
            						add(
            							current,
            							"ActionExecutionMap",
            							lv_ActionExecutionMap_10_0,
            							"org.lowcomote.panoptes.PanoptesX.actionExecutionEntry");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalPanoptesX.g:2343:4: (otherlv_11= ',' ( (lv_ActionExecutionMap_12_0= ruleactionExecutionEntry ) ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==14) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalPanoptesX.g:2344:5: otherlv_11= ',' ( (lv_ActionExecutionMap_12_0= ruleactionExecutionEntry ) )
            	    {
            	    otherlv_11=(Token)match(input,14,FOLLOW_35); 

            	    					newLeafNode(otherlv_11, grammarAccess.getHigherOrderAlgorithmExecutionAccess().getCommaKeyword_6_2_0());
            	    				
            	    // InternalPanoptesX.g:2348:5: ( (lv_ActionExecutionMap_12_0= ruleactionExecutionEntry ) )
            	    // InternalPanoptesX.g:2349:6: (lv_ActionExecutionMap_12_0= ruleactionExecutionEntry )
            	    {
            	    // InternalPanoptesX.g:2349:6: (lv_ActionExecutionMap_12_0= ruleactionExecutionEntry )
            	    // InternalPanoptesX.g:2350:7: lv_ActionExecutionMap_12_0= ruleactionExecutionEntry
            	    {

            	    							newCompositeNode(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getActionExecutionMapActionExecutionEntryParserRuleCall_6_2_1_0());
            	    						
            	    pushFollow(FOLLOW_54);
            	    lv_ActionExecutionMap_12_0=ruleactionExecutionEntry();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getHigherOrderAlgorithmExecutionRule());
            	    							}
            	    							add(
            	    								current,
            	    								"ActionExecutionMap",
            	    								lv_ActionExecutionMap_12_0,
            	    								"org.lowcomote.panoptes.PanoptesX.actionExecutionEntry");
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

            // InternalPanoptesX.g:2369:3: ( (otherlv_13= 'minimum' | otherlv_14= 'min' ) otherlv_15= 'observations' ( (lv_minDataPoints_16_0= ruleEIntegerObject ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( ((LA46_0>=54 && LA46_0<=55)) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalPanoptesX.g:2370:4: (otherlv_13= 'minimum' | otherlv_14= 'min' ) otherlv_15= 'observations' ( (lv_minDataPoints_16_0= ruleEIntegerObject ) )
                    {
                    // InternalPanoptesX.g:2370:4: (otherlv_13= 'minimum' | otherlv_14= 'min' )
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==54) ) {
                        alt45=1;
                    }
                    else if ( (LA45_0==55) ) {
                        alt45=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 45, 0, input);

                        throw nvae;
                    }
                    switch (alt45) {
                        case 1 :
                            // InternalPanoptesX.g:2371:5: otherlv_13= 'minimum'
                            {
                            otherlv_13=(Token)match(input,54,FOLLOW_55); 

                            					newLeafNode(otherlv_13, grammarAccess.getHigherOrderAlgorithmExecutionAccess().getMinimumKeyword_7_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalPanoptesX.g:2376:5: otherlv_14= 'min'
                            {
                            otherlv_14=(Token)match(input,55,FOLLOW_55); 

                            					newLeafNode(otherlv_14, grammarAccess.getHigherOrderAlgorithmExecutionAccess().getMinKeyword_7_0_1());
                            				

                            }
                            break;

                    }

                    otherlv_15=(Token)match(input,56,FOLLOW_35); 

                    				newLeafNode(otherlv_15, grammarAccess.getHigherOrderAlgorithmExecutionAccess().getObservationsKeyword_7_1());
                    			
                    // InternalPanoptesX.g:2385:4: ( (lv_minDataPoints_16_0= ruleEIntegerObject ) )
                    // InternalPanoptesX.g:2386:5: (lv_minDataPoints_16_0= ruleEIntegerObject )
                    {
                    // InternalPanoptesX.g:2386:5: (lv_minDataPoints_16_0= ruleEIntegerObject )
                    // InternalPanoptesX.g:2387:6: lv_minDataPoints_16_0= ruleEIntegerObject
                    {

                    						newCompositeNode(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getMinDataPointsEIntegerObjectParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_56);
                    lv_minDataPoints_16_0=ruleEIntegerObject();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getHigherOrderAlgorithmExecutionRule());
                    						}
                    						set(
                    							current,
                    							"minDataPoints",
                    							lv_minDataPoints_16_0,
                    							"org.lowcomote.panoptes.PanoptesX.EIntegerObject");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPanoptesX.g:2405:3: ( (otherlv_17= 'maximum' | otherlv_18= 'max' ) otherlv_19= 'observations' ( (lv_maxDataPoints_20_0= ruleEIntegerObject ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=57 && LA48_0<=58)) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalPanoptesX.g:2406:4: (otherlv_17= 'maximum' | otherlv_18= 'max' ) otherlv_19= 'observations' ( (lv_maxDataPoints_20_0= ruleEIntegerObject ) )
                    {
                    // InternalPanoptesX.g:2406:4: (otherlv_17= 'maximum' | otherlv_18= 'max' )
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==57) ) {
                        alt47=1;
                    }
                    else if ( (LA47_0==58) ) {
                        alt47=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 47, 0, input);

                        throw nvae;
                    }
                    switch (alt47) {
                        case 1 :
                            // InternalPanoptesX.g:2407:5: otherlv_17= 'maximum'
                            {
                            otherlv_17=(Token)match(input,57,FOLLOW_55); 

                            					newLeafNode(otherlv_17, grammarAccess.getHigherOrderAlgorithmExecutionAccess().getMaximumKeyword_8_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalPanoptesX.g:2412:5: otherlv_18= 'max'
                            {
                            otherlv_18=(Token)match(input,58,FOLLOW_55); 

                            					newLeafNode(otherlv_18, grammarAccess.getHigherOrderAlgorithmExecutionAccess().getMaxKeyword_8_0_1());
                            				

                            }
                            break;

                    }

                    otherlv_19=(Token)match(input,56,FOLLOW_35); 

                    				newLeafNode(otherlv_19, grammarAccess.getHigherOrderAlgorithmExecutionAccess().getObservationsKeyword_8_1());
                    			
                    // InternalPanoptesX.g:2421:4: ( (lv_maxDataPoints_20_0= ruleEIntegerObject ) )
                    // InternalPanoptesX.g:2422:5: (lv_maxDataPoints_20_0= ruleEIntegerObject )
                    {
                    // InternalPanoptesX.g:2422:5: (lv_maxDataPoints_20_0= ruleEIntegerObject )
                    // InternalPanoptesX.g:2423:6: lv_maxDataPoints_20_0= ruleEIntegerObject
                    {

                    						newCompositeNode(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getMaxDataPointsEIntegerObjectParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_57);
                    lv_maxDataPoints_20_0=ruleEIntegerObject();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getHigherOrderAlgorithmExecutionRule());
                    						}
                    						set(
                    							current,
                    							"maxDataPoints",
                    							lv_maxDataPoints_20_0,
                    							"org.lowcomote.panoptes.PanoptesX.EIntegerObject");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPanoptesX.g:2441:3: (otherlv_21= 'parameter' otherlv_22= 'values' ( (lv_parameterValueMap_23_0= ruleparameterValueEntry ) ) (otherlv_24= ',' ( (lv_parameterValueMap_25_0= ruleparameterValueEntry ) ) )* )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==49) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalPanoptesX.g:2442:4: otherlv_21= 'parameter' otherlv_22= 'values' ( (lv_parameterValueMap_23_0= ruleparameterValueEntry ) ) (otherlv_24= ',' ( (lv_parameterValueMap_25_0= ruleparameterValueEntry ) ) )*
                    {
                    otherlv_21=(Token)match(input,49,FOLLOW_50); 

                    				newLeafNode(otherlv_21, grammarAccess.getHigherOrderAlgorithmExecutionAccess().getParameterKeyword_9_0());
                    			
                    otherlv_22=(Token)match(input,50,FOLLOW_4); 

                    				newLeafNode(otherlv_22, grammarAccess.getHigherOrderAlgorithmExecutionAccess().getValuesKeyword_9_1());
                    			
                    // InternalPanoptesX.g:2450:4: ( (lv_parameterValueMap_23_0= ruleparameterValueEntry ) )
                    // InternalPanoptesX.g:2451:5: (lv_parameterValueMap_23_0= ruleparameterValueEntry )
                    {
                    // InternalPanoptesX.g:2451:5: (lv_parameterValueMap_23_0= ruleparameterValueEntry )
                    // InternalPanoptesX.g:2452:6: lv_parameterValueMap_23_0= ruleparameterValueEntry
                    {

                    						newCompositeNode(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getParameterValueMapParameterValueEntryParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_parameterValueMap_23_0=ruleparameterValueEntry();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getHigherOrderAlgorithmExecutionRule());
                    						}
                    						add(
                    							current,
                    							"parameterValueMap",
                    							lv_parameterValueMap_23_0,
                    							"org.lowcomote.panoptes.PanoptesX.parameterValueEntry");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPanoptesX.g:2469:4: (otherlv_24= ',' ( (lv_parameterValueMap_25_0= ruleparameterValueEntry ) ) )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==14) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // InternalPanoptesX.g:2470:5: otherlv_24= ',' ( (lv_parameterValueMap_25_0= ruleparameterValueEntry ) )
                    	    {
                    	    otherlv_24=(Token)match(input,14,FOLLOW_4); 

                    	    					newLeafNode(otherlv_24, grammarAccess.getHigherOrderAlgorithmExecutionAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalPanoptesX.g:2474:5: ( (lv_parameterValueMap_25_0= ruleparameterValueEntry ) )
                    	    // InternalPanoptesX.g:2475:6: (lv_parameterValueMap_25_0= ruleparameterValueEntry )
                    	    {
                    	    // InternalPanoptesX.g:2475:6: (lv_parameterValueMap_25_0= ruleparameterValueEntry )
                    	    // InternalPanoptesX.g:2476:7: lv_parameterValueMap_25_0= ruleparameterValueEntry
                    	    {

                    	    							newCompositeNode(grammarAccess.getHigherOrderAlgorithmExecutionAccess().getParameterValueMapParameterValueEntryParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_parameterValueMap_25_0=ruleparameterValueEntry();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getHigherOrderAlgorithmExecutionRule());
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
                    	    break loop49;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_26=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_26, grammarAccess.getHigherOrderAlgorithmExecutionAccess().getRightCurlyBracketKeyword_10());
            		

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
    // InternalPanoptesX.g:2503:1: entryRuleactionExecutionEntry returns [EObject current=null] : iv_ruleactionExecutionEntry= ruleactionExecutionEntry EOF ;
    public final EObject entryRuleactionExecutionEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleactionExecutionEntry = null;


        try {
            // InternalPanoptesX.g:2503:61: (iv_ruleactionExecutionEntry= ruleactionExecutionEntry EOF )
            // InternalPanoptesX.g:2504:2: iv_ruleactionExecutionEntry= ruleactionExecutionEntry EOF
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
    // InternalPanoptesX.g:2510:1: ruleactionExecutionEntry returns [EObject current=null] : ( () ( (lv_key_1_0= ruleEIntegerObject ) ) otherlv_2= '->' ( ( ruleEString ) ) ) ;
    public final EObject ruleactionExecutionEntry() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_key_1_0 = null;



        	enterRule();

        try {
            // InternalPanoptesX.g:2516:2: ( ( () ( (lv_key_1_0= ruleEIntegerObject ) ) otherlv_2= '->' ( ( ruleEString ) ) ) )
            // InternalPanoptesX.g:2517:2: ( () ( (lv_key_1_0= ruleEIntegerObject ) ) otherlv_2= '->' ( ( ruleEString ) ) )
            {
            // InternalPanoptesX.g:2517:2: ( () ( (lv_key_1_0= ruleEIntegerObject ) ) otherlv_2= '->' ( ( ruleEString ) ) )
            // InternalPanoptesX.g:2518:3: () ( (lv_key_1_0= ruleEIntegerObject ) ) otherlv_2= '->' ( ( ruleEString ) )
            {
            // InternalPanoptesX.g:2518:3: ()
            // InternalPanoptesX.g:2519:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActionExecutionEntryAccess().getActionExecutionEntryAction_0(),
            					current);
            			

            }

            // InternalPanoptesX.g:2525:3: ( (lv_key_1_0= ruleEIntegerObject ) )
            // InternalPanoptesX.g:2526:4: (lv_key_1_0= ruleEIntegerObject )
            {
            // InternalPanoptesX.g:2526:4: (lv_key_1_0= ruleEIntegerObject )
            // InternalPanoptesX.g:2527:5: lv_key_1_0= ruleEIntegerObject
            {

            					newCompositeNode(grammarAccess.getActionExecutionEntryAccess().getKeyEIntegerObjectParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_58);
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

            otherlv_2=(Token)match(input,59,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getActionExecutionEntryAccess().getHyphenMinusGreaterThanSignKeyword_2());
            		
            // InternalPanoptesX.g:2548:3: ( ( ruleEString ) )
            // InternalPanoptesX.g:2549:4: ( ruleEString )
            {
            // InternalPanoptesX.g:2549:4: ( ruleEString )
            // InternalPanoptesX.g:2550:5: ruleEString
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
    // InternalPanoptesX.g:2568:1: entryRuleTriggerGroup returns [EObject current=null] : iv_ruleTriggerGroup= ruleTriggerGroup EOF ;
    public final EObject entryRuleTriggerGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTriggerGroup = null;


        try {
            // InternalPanoptesX.g:2568:53: (iv_ruleTriggerGroup= ruleTriggerGroup EOF )
            // InternalPanoptesX.g:2569:2: iv_ruleTriggerGroup= ruleTriggerGroup EOF
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
    // InternalPanoptesX.g:2575:1: ruleTriggerGroup returns [EObject current=null] : ( () (otherlv_1= 'When' | otherlv_2= 'when' ) ( (lv_compositeTriggers_3_0= ruleCompositeTrigger ) ) (otherlv_4= 'or' ( (lv_compositeTriggers_5_0= ruleCompositeTrigger ) ) )* otherlv_6= 'Execute' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* ) ;
    public final EObject ruleTriggerGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_compositeTriggers_3_0 = null;

        EObject lv_compositeTriggers_5_0 = null;



        	enterRule();

        try {
            // InternalPanoptesX.g:2581:2: ( ( () (otherlv_1= 'When' | otherlv_2= 'when' ) ( (lv_compositeTriggers_3_0= ruleCompositeTrigger ) ) (otherlv_4= 'or' ( (lv_compositeTriggers_5_0= ruleCompositeTrigger ) ) )* otherlv_6= 'Execute' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* ) )
            // InternalPanoptesX.g:2582:2: ( () (otherlv_1= 'When' | otherlv_2= 'when' ) ( (lv_compositeTriggers_3_0= ruleCompositeTrigger ) ) (otherlv_4= 'or' ( (lv_compositeTriggers_5_0= ruleCompositeTrigger ) ) )* otherlv_6= 'Execute' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )
            {
            // InternalPanoptesX.g:2582:2: ( () (otherlv_1= 'When' | otherlv_2= 'when' ) ( (lv_compositeTriggers_3_0= ruleCompositeTrigger ) ) (otherlv_4= 'or' ( (lv_compositeTriggers_5_0= ruleCompositeTrigger ) ) )* otherlv_6= 'Execute' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )
            // InternalPanoptesX.g:2583:3: () (otherlv_1= 'When' | otherlv_2= 'when' ) ( (lv_compositeTriggers_3_0= ruleCompositeTrigger ) ) (otherlv_4= 'or' ( (lv_compositeTriggers_5_0= ruleCompositeTrigger ) ) )* otherlv_6= 'Execute' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )*
            {
            // InternalPanoptesX.g:2583:3: ()
            // InternalPanoptesX.g:2584:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTriggerGroupAccess().getTriggerGroupAction_0(),
            					current);
            			

            }

            // InternalPanoptesX.g:2590:3: (otherlv_1= 'When' | otherlv_2= 'when' )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==60) ) {
                alt51=1;
            }
            else if ( (LA51_0==61) ) {
                alt51=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // InternalPanoptesX.g:2591:4: otherlv_1= 'When'
                    {
                    otherlv_1=(Token)match(input,60,FOLLOW_59); 

                    				newLeafNode(otherlv_1, grammarAccess.getTriggerGroupAccess().getWhenKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalPanoptesX.g:2596:4: otherlv_2= 'when'
                    {
                    otherlv_2=(Token)match(input,61,FOLLOW_59); 

                    				newLeafNode(otherlv_2, grammarAccess.getTriggerGroupAccess().getWhenKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalPanoptesX.g:2601:3: ( (lv_compositeTriggers_3_0= ruleCompositeTrigger ) )
            // InternalPanoptesX.g:2602:4: (lv_compositeTriggers_3_0= ruleCompositeTrigger )
            {
            // InternalPanoptesX.g:2602:4: (lv_compositeTriggers_3_0= ruleCompositeTrigger )
            // InternalPanoptesX.g:2603:5: lv_compositeTriggers_3_0= ruleCompositeTrigger
            {

            					newCompositeNode(grammarAccess.getTriggerGroupAccess().getCompositeTriggersCompositeTriggerParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_60);
            lv_compositeTriggers_3_0=ruleCompositeTrigger();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTriggerGroupRule());
            					}
            					add(
            						current,
            						"compositeTriggers",
            						lv_compositeTriggers_3_0,
            						"org.lowcomote.panoptes.PanoptesX.CompositeTrigger");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPanoptesX.g:2620:3: (otherlv_4= 'or' ( (lv_compositeTriggers_5_0= ruleCompositeTrigger ) ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==62) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalPanoptesX.g:2621:4: otherlv_4= 'or' ( (lv_compositeTriggers_5_0= ruleCompositeTrigger ) )
            	    {
            	    otherlv_4=(Token)match(input,62,FOLLOW_59); 

            	    				newLeafNode(otherlv_4, grammarAccess.getTriggerGroupAccess().getOrKeyword_3_0());
            	    			
            	    // InternalPanoptesX.g:2625:4: ( (lv_compositeTriggers_5_0= ruleCompositeTrigger ) )
            	    // InternalPanoptesX.g:2626:5: (lv_compositeTriggers_5_0= ruleCompositeTrigger )
            	    {
            	    // InternalPanoptesX.g:2626:5: (lv_compositeTriggers_5_0= ruleCompositeTrigger )
            	    // InternalPanoptesX.g:2627:6: lv_compositeTriggers_5_0= ruleCompositeTrigger
            	    {

            	    						newCompositeNode(grammarAccess.getTriggerGroupAccess().getCompositeTriggersCompositeTriggerParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_60);
            	    lv_compositeTriggers_5_0=ruleCompositeTrigger();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTriggerGroupRule());
            	    						}
            	    						add(
            	    							current,
            	    							"compositeTriggers",
            	    							lv_compositeTriggers_5_0,
            	    							"org.lowcomote.panoptes.PanoptesX.CompositeTrigger");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

            otherlv_6=(Token)match(input,63,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getTriggerGroupAccess().getExecuteKeyword_4());
            		
            // InternalPanoptesX.g:2649:3: ( ( ruleEString ) )
            // InternalPanoptesX.g:2650:4: ( ruleEString )
            {
            // InternalPanoptesX.g:2650:4: ( ruleEString )
            // InternalPanoptesX.g:2651:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTriggerGroupRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTriggerGroupAccess().getTargetsBaseAlgorithmExecutionCrossReference_5_0());
            				
            pushFollow(FOLLOW_61);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPanoptesX.g:2665:3: (otherlv_8= ',' ( ( ruleEString ) ) )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==14) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalPanoptesX.g:2666:4: otherlv_8= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_8=(Token)match(input,14,FOLLOW_4); 

            	    				newLeafNode(otherlv_8, grammarAccess.getTriggerGroupAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalPanoptesX.g:2670:4: ( ( ruleEString ) )
            	    // InternalPanoptesX.g:2671:5: ( ruleEString )
            	    {
            	    // InternalPanoptesX.g:2671:5: ( ruleEString )
            	    // InternalPanoptesX.g:2672:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getTriggerGroupRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getTriggerGroupAccess().getTargetsBaseAlgorithmExecutionCrossReference_6_1_0());
            	    					
            	    pushFollow(FOLLOW_61);
            	    ruleEString();

            	    state._fsp--;


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
    // InternalPanoptesX.g:2691:1: entryRuleCompositeTrigger returns [EObject current=null] : iv_ruleCompositeTrigger= ruleCompositeTrigger EOF ;
    public final EObject entryRuleCompositeTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeTrigger = null;


        try {
            // InternalPanoptesX.g:2691:57: (iv_ruleCompositeTrigger= ruleCompositeTrigger EOF )
            // InternalPanoptesX.g:2692:2: iv_ruleCompositeTrigger= ruleCompositeTrigger EOF
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
    // InternalPanoptesX.g:2698:1: ruleCompositeTrigger returns [EObject current=null] : ( () ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_2= 'and' )? ( (lv_tt_3_0= ruleTemporalTrigger ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_4= 'and' )? ( (lv_st_5_0= ruleSampleBasedTrigger ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_6= 'and' )? ( (lv_pt_7_0= rulePredictionBasedTrigger ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'and' )? ( (lv_lt_9_0= ruleLabelBasedTrigger ) ) ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleCompositeTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_tt_3_0 = null;

        EObject lv_st_5_0 = null;

        EObject lv_pt_7_0 = null;

        EObject lv_lt_9_0 = null;



        	enterRule();

        try {
            // InternalPanoptesX.g:2704:2: ( ( () ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_2= 'and' )? ( (lv_tt_3_0= ruleTemporalTrigger ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_4= 'and' )? ( (lv_st_5_0= ruleSampleBasedTrigger ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_6= 'and' )? ( (lv_pt_7_0= rulePredictionBasedTrigger ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'and' )? ( (lv_lt_9_0= ruleLabelBasedTrigger ) ) ) ) ) ) )* ) ) ) ) )
            // InternalPanoptesX.g:2705:2: ( () ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_2= 'and' )? ( (lv_tt_3_0= ruleTemporalTrigger ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_4= 'and' )? ( (lv_st_5_0= ruleSampleBasedTrigger ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_6= 'and' )? ( (lv_pt_7_0= rulePredictionBasedTrigger ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'and' )? ( (lv_lt_9_0= ruleLabelBasedTrigger ) ) ) ) ) ) )* ) ) ) )
            {
            // InternalPanoptesX.g:2705:2: ( () ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_2= 'and' )? ( (lv_tt_3_0= ruleTemporalTrigger ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_4= 'and' )? ( (lv_st_5_0= ruleSampleBasedTrigger ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_6= 'and' )? ( (lv_pt_7_0= rulePredictionBasedTrigger ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'and' )? ( (lv_lt_9_0= ruleLabelBasedTrigger ) ) ) ) ) ) )* ) ) ) )
            // InternalPanoptesX.g:2706:3: () ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_2= 'and' )? ( (lv_tt_3_0= ruleTemporalTrigger ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_4= 'and' )? ( (lv_st_5_0= ruleSampleBasedTrigger ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_6= 'and' )? ( (lv_pt_7_0= rulePredictionBasedTrigger ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'and' )? ( (lv_lt_9_0= ruleLabelBasedTrigger ) ) ) ) ) ) )* ) ) )
            {
            // InternalPanoptesX.g:2706:3: ()
            // InternalPanoptesX.g:2707:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCompositeTriggerAccess().getCompositeTriggerAction_0(),
            					current);
            			

            }

            // InternalPanoptesX.g:2713:3: ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_2= 'and' )? ( (lv_tt_3_0= ruleTemporalTrigger ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_4= 'and' )? ( (lv_st_5_0= ruleSampleBasedTrigger ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_6= 'and' )? ( (lv_pt_7_0= rulePredictionBasedTrigger ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'and' )? ( (lv_lt_9_0= ruleLabelBasedTrigger ) ) ) ) ) ) )* ) ) )
            // InternalPanoptesX.g:2714:4: ( ( ( ({...}? => ( ({...}? => ( (otherlv_2= 'and' )? ( (lv_tt_3_0= ruleTemporalTrigger ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_4= 'and' )? ( (lv_st_5_0= ruleSampleBasedTrigger ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_6= 'and' )? ( (lv_pt_7_0= rulePredictionBasedTrigger ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'and' )? ( (lv_lt_9_0= ruleLabelBasedTrigger ) ) ) ) ) ) )* ) )
            {
            // InternalPanoptesX.g:2714:4: ( ( ( ({...}? => ( ({...}? => ( (otherlv_2= 'and' )? ( (lv_tt_3_0= ruleTemporalTrigger ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_4= 'and' )? ( (lv_st_5_0= ruleSampleBasedTrigger ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_6= 'and' )? ( (lv_pt_7_0= rulePredictionBasedTrigger ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'and' )? ( (lv_lt_9_0= ruleLabelBasedTrigger ) ) ) ) ) ) )* ) )
            // InternalPanoptesX.g:2715:5: ( ( ({...}? => ( ({...}? => ( (otherlv_2= 'and' )? ( (lv_tt_3_0= ruleTemporalTrigger ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_4= 'and' )? ( (lv_st_5_0= ruleSampleBasedTrigger ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_6= 'and' )? ( (lv_pt_7_0= rulePredictionBasedTrigger ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'and' )? ( (lv_lt_9_0= ruleLabelBasedTrigger ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_1());
            				
            // InternalPanoptesX.g:2718:5: ( ( ({...}? => ( ({...}? => ( (otherlv_2= 'and' )? ( (lv_tt_3_0= ruleTemporalTrigger ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_4= 'and' )? ( (lv_st_5_0= ruleSampleBasedTrigger ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_6= 'and' )? ( (lv_pt_7_0= rulePredictionBasedTrigger ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'and' )? ( (lv_lt_9_0= ruleLabelBasedTrigger ) ) ) ) ) ) )* )
            // InternalPanoptesX.g:2719:6: ( ({...}? => ( ({...}? => ( (otherlv_2= 'and' )? ( (lv_tt_3_0= ruleTemporalTrigger ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_4= 'and' )? ( (lv_st_5_0= ruleSampleBasedTrigger ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_6= 'and' )? ( (lv_pt_7_0= rulePredictionBasedTrigger ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'and' )? ( (lv_lt_9_0= ruleLabelBasedTrigger ) ) ) ) ) ) )*
            {
            // InternalPanoptesX.g:2719:6: ( ({...}? => ( ({...}? => ( (otherlv_2= 'and' )? ( (lv_tt_3_0= ruleTemporalTrigger ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_4= 'and' )? ( (lv_st_5_0= ruleSampleBasedTrigger ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_6= 'and' )? ( (lv_pt_7_0= rulePredictionBasedTrigger ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'and' )? ( (lv_lt_9_0= ruleLabelBasedTrigger ) ) ) ) ) ) )*
            loop58:
            do {
                int alt58=5;
                int LA58_0 = input.LA(1);

                if ( LA58_0 == 64 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_1(), 3) || getUnorderedGroupHelper().canSelect(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_1(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_1(), 2) || getUnorderedGroupHelper().canSelect(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_1(), 1) ) ) {
                    int LA58_2 = input.LA(2);

                    if ( LA58_2 == 76 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_1(), 3) || getUnorderedGroupHelper().canSelect(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_1(), 2) || getUnorderedGroupHelper().canSelect(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_1(), 1) ) ) {
                        int LA58_4 = input.LA(3);

                        if ( LA58_4 == RULE_INT && ( getUnorderedGroupHelper().canSelect(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_1(), 3) || getUnorderedGroupHelper().canSelect(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_1(), 2) || getUnorderedGroupHelper().canSelect(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_1(), 1) ) ) {
                            int LA58_5 = input.LA(4);

                            if ( LA58_5 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_1(), 3) ) {
                                alt58=4;
                            }
                            else if ( LA58_5 == 69 && getUnorderedGroupHelper().canSelect(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_1(), 2) ) {
                                alt58=3;
                            }
                            else if ( LA58_5 == 67 && getUnorderedGroupHelper().canSelect(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_1(), 1) ) {
                                alt58=2;
                            }


                        }


                    }
                    else if ( LA58_2 == RULE_INT && ( getUnorderedGroupHelper().canSelect(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_1(), 3) || getUnorderedGroupHelper().canSelect(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_1(), 2) || getUnorderedGroupHelper().canSelect(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_1(), 1) ) ) {
                        int LA58_5 = input.LA(3);

                        if ( LA58_5 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_1(), 3) ) {
                            alt58=4;
                        }
                        else if ( LA58_5 == 69 && getUnorderedGroupHelper().canSelect(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_1(), 2) ) {
                            alt58=3;
                        }
                        else if ( LA58_5 == 67 && getUnorderedGroupHelper().canSelect(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_1(), 1) ) {
                            alt58=2;
                        }


                    }
                    else if ( ( LA58_2 >= RULE_STRING && LA58_2 <= RULE_ID || LA58_2 == 65 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_1(), 0) ) {
                        alt58=1;
                    }


                }
                else if ( ( LA58_0 >= RULE_STRING && LA58_0 <= RULE_ID || LA58_0 == 65 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_1(), 0) ) {
                    alt58=1;
                }
                else if ( LA58_0 == 76 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_1(), 3) || getUnorderedGroupHelper().canSelect(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_1(), 2) || getUnorderedGroupHelper().canSelect(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_1(), 1) ) ) {
                    int LA58_4 = input.LA(2);

                    if ( LA58_4 == RULE_INT && ( getUnorderedGroupHelper().canSelect(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_1(), 3) || getUnorderedGroupHelper().canSelect(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_1(), 2) || getUnorderedGroupHelper().canSelect(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_1(), 1) ) ) {
                        int LA58_5 = input.LA(3);

                        if ( LA58_5 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_1(), 3) ) {
                            alt58=4;
                        }
                        else if ( LA58_5 == 69 && getUnorderedGroupHelper().canSelect(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_1(), 2) ) {
                            alt58=3;
                        }
                        else if ( LA58_5 == 67 && getUnorderedGroupHelper().canSelect(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_1(), 1) ) {
                            alt58=2;
                        }


                    }


                }
                else if ( LA58_0 == RULE_INT && ( getUnorderedGroupHelper().canSelect(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_1(), 3) || getUnorderedGroupHelper().canSelect(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_1(), 2) || getUnorderedGroupHelper().canSelect(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_1(), 1) ) ) {
                    int LA58_5 = input.LA(2);

                    if ( LA58_5 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_1(), 3) ) {
                        alt58=4;
                    }
                    else if ( LA58_5 == 69 && getUnorderedGroupHelper().canSelect(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_1(), 2) ) {
                        alt58=3;
                    }
                    else if ( LA58_5 == 67 && getUnorderedGroupHelper().canSelect(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_1(), 1) ) {
                        alt58=2;
                    }


                }


                switch (alt58) {
            	case 1 :
            	    // InternalPanoptesX.g:2720:4: ({...}? => ( ({...}? => ( (otherlv_2= 'and' )? ( (lv_tt_3_0= ruleTemporalTrigger ) ) ) ) ) )
            	    {
            	    // InternalPanoptesX.g:2720:4: ({...}? => ( ({...}? => ( (otherlv_2= 'and' )? ( (lv_tt_3_0= ruleTemporalTrigger ) ) ) ) ) )
            	    // InternalPanoptesX.g:2721:5: {...}? => ( ({...}? => ( (otherlv_2= 'and' )? ( (lv_tt_3_0= ruleTemporalTrigger ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleCompositeTrigger", "getUnorderedGroupHelper().canSelect(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalPanoptesX.g:2721:113: ( ({...}? => ( (otherlv_2= 'and' )? ( (lv_tt_3_0= ruleTemporalTrigger ) ) ) ) )
            	    // InternalPanoptesX.g:2722:6: ({...}? => ( (otherlv_2= 'and' )? ( (lv_tt_3_0= ruleTemporalTrigger ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalPanoptesX.g:2725:9: ({...}? => ( (otherlv_2= 'and' )? ( (lv_tt_3_0= ruleTemporalTrigger ) ) ) )
            	    // InternalPanoptesX.g:2725:10: {...}? => ( (otherlv_2= 'and' )? ( (lv_tt_3_0= ruleTemporalTrigger ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCompositeTrigger", "true");
            	    }
            	    // InternalPanoptesX.g:2725:19: ( (otherlv_2= 'and' )? ( (lv_tt_3_0= ruleTemporalTrigger ) ) )
            	    // InternalPanoptesX.g:2725:20: (otherlv_2= 'and' )? ( (lv_tt_3_0= ruleTemporalTrigger ) )
            	    {
            	    // InternalPanoptesX.g:2725:20: (otherlv_2= 'and' )?
            	    int alt54=2;
            	    int LA54_0 = input.LA(1);

            	    if ( (LA54_0==64) ) {
            	        alt54=1;
            	    }
            	    switch (alt54) {
            	        case 1 :
            	            // InternalPanoptesX.g:2726:10: otherlv_2= 'and'
            	            {
            	            otherlv_2=(Token)match(input,64,FOLLOW_62); 

            	            										newLeafNode(otherlv_2, grammarAccess.getCompositeTriggerAccess().getAndKeyword_1_0_0());
            	            									

            	            }
            	            break;

            	    }

            	    // InternalPanoptesX.g:2731:9: ( (lv_tt_3_0= ruleTemporalTrigger ) )
            	    // InternalPanoptesX.g:2732:10: (lv_tt_3_0= ruleTemporalTrigger )
            	    {
            	    // InternalPanoptesX.g:2732:10: (lv_tt_3_0= ruleTemporalTrigger )
            	    // InternalPanoptesX.g:2733:11: lv_tt_3_0= ruleTemporalTrigger
            	    {

            	    											newCompositeNode(grammarAccess.getCompositeTriggerAccess().getTtTemporalTriggerParserRuleCall_1_0_1_0());
            	    										
            	    pushFollow(FOLLOW_63);
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


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalPanoptesX.g:2756:4: ({...}? => ( ({...}? => ( (otherlv_4= 'and' )? ( (lv_st_5_0= ruleSampleBasedTrigger ) ) ) ) ) )
            	    {
            	    // InternalPanoptesX.g:2756:4: ({...}? => ( ({...}? => ( (otherlv_4= 'and' )? ( (lv_st_5_0= ruleSampleBasedTrigger ) ) ) ) ) )
            	    // InternalPanoptesX.g:2757:5: {...}? => ( ({...}? => ( (otherlv_4= 'and' )? ( (lv_st_5_0= ruleSampleBasedTrigger ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleCompositeTrigger", "getUnorderedGroupHelper().canSelect(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalPanoptesX.g:2757:113: ( ({...}? => ( (otherlv_4= 'and' )? ( (lv_st_5_0= ruleSampleBasedTrigger ) ) ) ) )
            	    // InternalPanoptesX.g:2758:6: ({...}? => ( (otherlv_4= 'and' )? ( (lv_st_5_0= ruleSampleBasedTrigger ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalPanoptesX.g:2761:9: ({...}? => ( (otherlv_4= 'and' )? ( (lv_st_5_0= ruleSampleBasedTrigger ) ) ) )
            	    // InternalPanoptesX.g:2761:10: {...}? => ( (otherlv_4= 'and' )? ( (lv_st_5_0= ruleSampleBasedTrigger ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCompositeTrigger", "true");
            	    }
            	    // InternalPanoptesX.g:2761:19: ( (otherlv_4= 'and' )? ( (lv_st_5_0= ruleSampleBasedTrigger ) ) )
            	    // InternalPanoptesX.g:2761:20: (otherlv_4= 'and' )? ( (lv_st_5_0= ruleSampleBasedTrigger ) )
            	    {
            	    // InternalPanoptesX.g:2761:20: (otherlv_4= 'and' )?
            	    int alt55=2;
            	    int LA55_0 = input.LA(1);

            	    if ( (LA55_0==64) ) {
            	        alt55=1;
            	    }
            	    switch (alt55) {
            	        case 1 :
            	            // InternalPanoptesX.g:2762:10: otherlv_4= 'and'
            	            {
            	            otherlv_4=(Token)match(input,64,FOLLOW_64); 

            	            										newLeafNode(otherlv_4, grammarAccess.getCompositeTriggerAccess().getAndKeyword_1_1_0());
            	            									

            	            }
            	            break;

            	    }

            	    // InternalPanoptesX.g:2767:9: ( (lv_st_5_0= ruleSampleBasedTrigger ) )
            	    // InternalPanoptesX.g:2768:10: (lv_st_5_0= ruleSampleBasedTrigger )
            	    {
            	    // InternalPanoptesX.g:2768:10: (lv_st_5_0= ruleSampleBasedTrigger )
            	    // InternalPanoptesX.g:2769:11: lv_st_5_0= ruleSampleBasedTrigger
            	    {

            	    											newCompositeNode(grammarAccess.getCompositeTriggerAccess().getStSampleBasedTriggerParserRuleCall_1_1_1_0());
            	    										
            	    pushFollow(FOLLOW_63);
            	    lv_st_5_0=ruleSampleBasedTrigger();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getCompositeTriggerRule());
            	    											}
            	    											set(
            	    												current,
            	    												"st",
            	    												lv_st_5_0,
            	    												"org.lowcomote.panoptes.PanoptesX.SampleBasedTrigger");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalPanoptesX.g:2792:4: ({...}? => ( ({...}? => ( (otherlv_6= 'and' )? ( (lv_pt_7_0= rulePredictionBasedTrigger ) ) ) ) ) )
            	    {
            	    // InternalPanoptesX.g:2792:4: ({...}? => ( ({...}? => ( (otherlv_6= 'and' )? ( (lv_pt_7_0= rulePredictionBasedTrigger ) ) ) ) ) )
            	    // InternalPanoptesX.g:2793:5: {...}? => ( ({...}? => ( (otherlv_6= 'and' )? ( (lv_pt_7_0= rulePredictionBasedTrigger ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleCompositeTrigger", "getUnorderedGroupHelper().canSelect(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalPanoptesX.g:2793:113: ( ({...}? => ( (otherlv_6= 'and' )? ( (lv_pt_7_0= rulePredictionBasedTrigger ) ) ) ) )
            	    // InternalPanoptesX.g:2794:6: ({...}? => ( (otherlv_6= 'and' )? ( (lv_pt_7_0= rulePredictionBasedTrigger ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalPanoptesX.g:2797:9: ({...}? => ( (otherlv_6= 'and' )? ( (lv_pt_7_0= rulePredictionBasedTrigger ) ) ) )
            	    // InternalPanoptesX.g:2797:10: {...}? => ( (otherlv_6= 'and' )? ( (lv_pt_7_0= rulePredictionBasedTrigger ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCompositeTrigger", "true");
            	    }
            	    // InternalPanoptesX.g:2797:19: ( (otherlv_6= 'and' )? ( (lv_pt_7_0= rulePredictionBasedTrigger ) ) )
            	    // InternalPanoptesX.g:2797:20: (otherlv_6= 'and' )? ( (lv_pt_7_0= rulePredictionBasedTrigger ) )
            	    {
            	    // InternalPanoptesX.g:2797:20: (otherlv_6= 'and' )?
            	    int alt56=2;
            	    int LA56_0 = input.LA(1);

            	    if ( (LA56_0==64) ) {
            	        alt56=1;
            	    }
            	    switch (alt56) {
            	        case 1 :
            	            // InternalPanoptesX.g:2798:10: otherlv_6= 'and'
            	            {
            	            otherlv_6=(Token)match(input,64,FOLLOW_64); 

            	            										newLeafNode(otherlv_6, grammarAccess.getCompositeTriggerAccess().getAndKeyword_1_2_0());
            	            									

            	            }
            	            break;

            	    }

            	    // InternalPanoptesX.g:2803:9: ( (lv_pt_7_0= rulePredictionBasedTrigger ) )
            	    // InternalPanoptesX.g:2804:10: (lv_pt_7_0= rulePredictionBasedTrigger )
            	    {
            	    // InternalPanoptesX.g:2804:10: (lv_pt_7_0= rulePredictionBasedTrigger )
            	    // InternalPanoptesX.g:2805:11: lv_pt_7_0= rulePredictionBasedTrigger
            	    {

            	    											newCompositeNode(grammarAccess.getCompositeTriggerAccess().getPtPredictionBasedTriggerParserRuleCall_1_2_1_0());
            	    										
            	    pushFollow(FOLLOW_63);
            	    lv_pt_7_0=rulePredictionBasedTrigger();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getCompositeTriggerRule());
            	    											}
            	    											set(
            	    												current,
            	    												"pt",
            	    												lv_pt_7_0,
            	    												"org.lowcomote.panoptes.PanoptesX.PredictionBasedTrigger");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalPanoptesX.g:2828:4: ({...}? => ( ({...}? => ( (otherlv_8= 'and' )? ( (lv_lt_9_0= ruleLabelBasedTrigger ) ) ) ) ) )
            	    {
            	    // InternalPanoptesX.g:2828:4: ({...}? => ( ({...}? => ( (otherlv_8= 'and' )? ( (lv_lt_9_0= ruleLabelBasedTrigger ) ) ) ) ) )
            	    // InternalPanoptesX.g:2829:5: {...}? => ( ({...}? => ( (otherlv_8= 'and' )? ( (lv_lt_9_0= ruleLabelBasedTrigger ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleCompositeTrigger", "getUnorderedGroupHelper().canSelect(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // InternalPanoptesX.g:2829:113: ( ({...}? => ( (otherlv_8= 'and' )? ( (lv_lt_9_0= ruleLabelBasedTrigger ) ) ) ) )
            	    // InternalPanoptesX.g:2830:6: ({...}? => ( (otherlv_8= 'and' )? ( (lv_lt_9_0= ruleLabelBasedTrigger ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_1(), 3);
            	    					
            	    // InternalPanoptesX.g:2833:9: ({...}? => ( (otherlv_8= 'and' )? ( (lv_lt_9_0= ruleLabelBasedTrigger ) ) ) )
            	    // InternalPanoptesX.g:2833:10: {...}? => ( (otherlv_8= 'and' )? ( (lv_lt_9_0= ruleLabelBasedTrigger ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCompositeTrigger", "true");
            	    }
            	    // InternalPanoptesX.g:2833:19: ( (otherlv_8= 'and' )? ( (lv_lt_9_0= ruleLabelBasedTrigger ) ) )
            	    // InternalPanoptesX.g:2833:20: (otherlv_8= 'and' )? ( (lv_lt_9_0= ruleLabelBasedTrigger ) )
            	    {
            	    // InternalPanoptesX.g:2833:20: (otherlv_8= 'and' )?
            	    int alt57=2;
            	    int LA57_0 = input.LA(1);

            	    if ( (LA57_0==64) ) {
            	        alt57=1;
            	    }
            	    switch (alt57) {
            	        case 1 :
            	            // InternalPanoptesX.g:2834:10: otherlv_8= 'and'
            	            {
            	            otherlv_8=(Token)match(input,64,FOLLOW_65); 

            	            										newLeafNode(otherlv_8, grammarAccess.getCompositeTriggerAccess().getAndKeyword_1_3_0());
            	            									

            	            }
            	            break;

            	    }

            	    // InternalPanoptesX.g:2839:9: ( (lv_lt_9_0= ruleLabelBasedTrigger ) )
            	    // InternalPanoptesX.g:2840:10: (lv_lt_9_0= ruleLabelBasedTrigger )
            	    {
            	    // InternalPanoptesX.g:2840:10: (lv_lt_9_0= ruleLabelBasedTrigger )
            	    // InternalPanoptesX.g:2841:11: lv_lt_9_0= ruleLabelBasedTrigger
            	    {

            	    											newCompositeNode(grammarAccess.getCompositeTriggerAccess().getLtLabelBasedTriggerParserRuleCall_1_3_1_0());
            	    										
            	    pushFollow(FOLLOW_63);
            	    lv_lt_9_0=ruleLabelBasedTrigger();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getCompositeTriggerRule());
            	    											}
            	    											set(
            	    												current,
            	    												"lt",
            	    												lv_lt_9_0,
            	    												"org.lowcomote.panoptes.PanoptesX.LabelBasedTrigger");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getCompositeTriggerAccess().getUnorderedGroup_1());
            				

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
    // InternalPanoptesX.g:2875:1: entryRuleTemporalTrigger returns [EObject current=null] : iv_ruleTemporalTrigger= ruleTemporalTrigger EOF ;
    public final EObject entryRuleTemporalTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemporalTrigger = null;


        try {
            // InternalPanoptesX.g:2875:56: (iv_ruleTemporalTrigger= ruleTemporalTrigger EOF )
            // InternalPanoptesX.g:2876:2: iv_ruleTemporalTrigger= ruleTemporalTrigger EOF
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
    // InternalPanoptesX.g:2882:1: ruleTemporalTrigger returns [EObject current=null] : ( ( () (otherlv_1= 'one' ( (lv_frequency_2_0= rulefrequencyEnum ) ) otherlv_3= 'passed' ) ) | ( (lv_cronString_4_0= ruleEString ) ) ) ;
    public final EObject ruleTemporalTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_frequency_2_0 = null;

        AntlrDatatypeRuleToken lv_cronString_4_0 = null;



        	enterRule();

        try {
            // InternalPanoptesX.g:2888:2: ( ( ( () (otherlv_1= 'one' ( (lv_frequency_2_0= rulefrequencyEnum ) ) otherlv_3= 'passed' ) ) | ( (lv_cronString_4_0= ruleEString ) ) ) )
            // InternalPanoptesX.g:2889:2: ( ( () (otherlv_1= 'one' ( (lv_frequency_2_0= rulefrequencyEnum ) ) otherlv_3= 'passed' ) ) | ( (lv_cronString_4_0= ruleEString ) ) )
            {
            // InternalPanoptesX.g:2889:2: ( ( () (otherlv_1= 'one' ( (lv_frequency_2_0= rulefrequencyEnum ) ) otherlv_3= 'passed' ) ) | ( (lv_cronString_4_0= ruleEString ) ) )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==65) ) {
                alt59=1;
            }
            else if ( ((LA59_0>=RULE_STRING && LA59_0<=RULE_ID)) ) {
                alt59=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // InternalPanoptesX.g:2890:3: ( () (otherlv_1= 'one' ( (lv_frequency_2_0= rulefrequencyEnum ) ) otherlv_3= 'passed' ) )
                    {
                    // InternalPanoptesX.g:2890:3: ( () (otherlv_1= 'one' ( (lv_frequency_2_0= rulefrequencyEnum ) ) otherlv_3= 'passed' ) )
                    // InternalPanoptesX.g:2891:4: () (otherlv_1= 'one' ( (lv_frequency_2_0= rulefrequencyEnum ) ) otherlv_3= 'passed' )
                    {
                    // InternalPanoptesX.g:2891:4: ()
                    // InternalPanoptesX.g:2892:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTemporalTriggerAccess().getTemporalTriggerAction_0_0(),
                    						current);
                    				

                    }

                    // InternalPanoptesX.g:2898:4: (otherlv_1= 'one' ( (lv_frequency_2_0= rulefrequencyEnum ) ) otherlv_3= 'passed' )
                    // InternalPanoptesX.g:2899:5: otherlv_1= 'one' ( (lv_frequency_2_0= rulefrequencyEnum ) ) otherlv_3= 'passed'
                    {
                    otherlv_1=(Token)match(input,65,FOLLOW_66); 

                    					newLeafNode(otherlv_1, grammarAccess.getTemporalTriggerAccess().getOneKeyword_0_1_0());
                    				
                    // InternalPanoptesX.g:2903:5: ( (lv_frequency_2_0= rulefrequencyEnum ) )
                    // InternalPanoptesX.g:2904:6: (lv_frequency_2_0= rulefrequencyEnum )
                    {
                    // InternalPanoptesX.g:2904:6: (lv_frequency_2_0= rulefrequencyEnum )
                    // InternalPanoptesX.g:2905:7: lv_frequency_2_0= rulefrequencyEnum
                    {

                    							newCompositeNode(grammarAccess.getTemporalTriggerAccess().getFrequencyFrequencyEnumEnumRuleCall_0_1_1_0());
                    						
                    pushFollow(FOLLOW_67);
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

                    otherlv_3=(Token)match(input,66,FOLLOW_2); 

                    					newLeafNode(otherlv_3, grammarAccess.getTemporalTriggerAccess().getPassedKeyword_0_1_2());
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPanoptesX.g:2929:3: ( (lv_cronString_4_0= ruleEString ) )
                    {
                    // InternalPanoptesX.g:2929:3: ( (lv_cronString_4_0= ruleEString ) )
                    // InternalPanoptesX.g:2930:4: (lv_cronString_4_0= ruleEString )
                    {
                    // InternalPanoptesX.g:2930:4: (lv_cronString_4_0= ruleEString )
                    // InternalPanoptesX.g:2931:5: lv_cronString_4_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getTemporalTriggerAccess().getCronStringEStringParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_cronString_4_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTemporalTriggerRule());
                    					}
                    					set(
                    						current,
                    						"cronString",
                    						lv_cronString_4_0,
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
    // InternalPanoptesX.g:2952:1: entryRuleSampleBasedTrigger returns [EObject current=null] : iv_ruleSampleBasedTrigger= ruleSampleBasedTrigger EOF ;
    public final EObject entryRuleSampleBasedTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSampleBasedTrigger = null;


        try {
            // InternalPanoptesX.g:2952:59: (iv_ruleSampleBasedTrigger= ruleSampleBasedTrigger EOF )
            // InternalPanoptesX.g:2953:2: iv_ruleSampleBasedTrigger= ruleSampleBasedTrigger EOF
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
    // InternalPanoptesX.g:2959:1: ruleSampleBasedTrigger returns [EObject current=null] : ( () ( (lv_frequency_1_0= ruleEIntegerObject ) ) otherlv_2= 'samples' otherlv_3= 'received' ) ;
    public final EObject ruleSampleBasedTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_frequency_1_0 = null;



        	enterRule();

        try {
            // InternalPanoptesX.g:2965:2: ( ( () ( (lv_frequency_1_0= ruleEIntegerObject ) ) otherlv_2= 'samples' otherlv_3= 'received' ) )
            // InternalPanoptesX.g:2966:2: ( () ( (lv_frequency_1_0= ruleEIntegerObject ) ) otherlv_2= 'samples' otherlv_3= 'received' )
            {
            // InternalPanoptesX.g:2966:2: ( () ( (lv_frequency_1_0= ruleEIntegerObject ) ) otherlv_2= 'samples' otherlv_3= 'received' )
            // InternalPanoptesX.g:2967:3: () ( (lv_frequency_1_0= ruleEIntegerObject ) ) otherlv_2= 'samples' otherlv_3= 'received'
            {
            // InternalPanoptesX.g:2967:3: ()
            // InternalPanoptesX.g:2968:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSampleBasedTriggerAccess().getSampleBasedTriggerAction_0(),
            					current);
            			

            }

            // InternalPanoptesX.g:2974:3: ( (lv_frequency_1_0= ruleEIntegerObject ) )
            // InternalPanoptesX.g:2975:4: (lv_frequency_1_0= ruleEIntegerObject )
            {
            // InternalPanoptesX.g:2975:4: (lv_frequency_1_0= ruleEIntegerObject )
            // InternalPanoptesX.g:2976:5: lv_frequency_1_0= ruleEIntegerObject
            {

            					newCompositeNode(grammarAccess.getSampleBasedTriggerAccess().getFrequencyEIntegerObjectParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_68);
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

            otherlv_2=(Token)match(input,67,FOLLOW_69); 

            			newLeafNode(otherlv_2, grammarAccess.getSampleBasedTriggerAccess().getSamplesKeyword_2());
            		
            otherlv_3=(Token)match(input,68,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getSampleBasedTriggerAccess().getReceivedKeyword_3());
            		

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
    // InternalPanoptesX.g:3005:1: entryRulePredictionBasedTrigger returns [EObject current=null] : iv_rulePredictionBasedTrigger= rulePredictionBasedTrigger EOF ;
    public final EObject entryRulePredictionBasedTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredictionBasedTrigger = null;


        try {
            // InternalPanoptesX.g:3005:63: (iv_rulePredictionBasedTrigger= rulePredictionBasedTrigger EOF )
            // InternalPanoptesX.g:3006:2: iv_rulePredictionBasedTrigger= rulePredictionBasedTrigger EOF
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
    // InternalPanoptesX.g:3012:1: rulePredictionBasedTrigger returns [EObject current=null] : ( () ( (lv_frequency_1_0= ruleEIntegerObject ) ) otherlv_2= 'predictions' otherlv_3= 'served' ) ;
    public final EObject rulePredictionBasedTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_frequency_1_0 = null;



        	enterRule();

        try {
            // InternalPanoptesX.g:3018:2: ( ( () ( (lv_frequency_1_0= ruleEIntegerObject ) ) otherlv_2= 'predictions' otherlv_3= 'served' ) )
            // InternalPanoptesX.g:3019:2: ( () ( (lv_frequency_1_0= ruleEIntegerObject ) ) otherlv_2= 'predictions' otherlv_3= 'served' )
            {
            // InternalPanoptesX.g:3019:2: ( () ( (lv_frequency_1_0= ruleEIntegerObject ) ) otherlv_2= 'predictions' otherlv_3= 'served' )
            // InternalPanoptesX.g:3020:3: () ( (lv_frequency_1_0= ruleEIntegerObject ) ) otherlv_2= 'predictions' otherlv_3= 'served'
            {
            // InternalPanoptesX.g:3020:3: ()
            // InternalPanoptesX.g:3021:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPredictionBasedTriggerAccess().getPredictionBasedTriggerAction_0(),
            					current);
            			

            }

            // InternalPanoptesX.g:3027:3: ( (lv_frequency_1_0= ruleEIntegerObject ) )
            // InternalPanoptesX.g:3028:4: (lv_frequency_1_0= ruleEIntegerObject )
            {
            // InternalPanoptesX.g:3028:4: (lv_frequency_1_0= ruleEIntegerObject )
            // InternalPanoptesX.g:3029:5: lv_frequency_1_0= ruleEIntegerObject
            {

            					newCompositeNode(grammarAccess.getPredictionBasedTriggerAccess().getFrequencyEIntegerObjectParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_70);
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

            otherlv_2=(Token)match(input,69,FOLLOW_71); 

            			newLeafNode(otherlv_2, grammarAccess.getPredictionBasedTriggerAccess().getPredictionsKeyword_2());
            		
            otherlv_3=(Token)match(input,70,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getPredictionBasedTriggerAccess().getServedKeyword_3());
            		

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
    // InternalPanoptesX.g:3058:1: entryRuleLabelBasedTrigger returns [EObject current=null] : iv_ruleLabelBasedTrigger= ruleLabelBasedTrigger EOF ;
    public final EObject entryRuleLabelBasedTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabelBasedTrigger = null;


        try {
            // InternalPanoptesX.g:3058:58: (iv_ruleLabelBasedTrigger= ruleLabelBasedTrigger EOF )
            // InternalPanoptesX.g:3059:2: iv_ruleLabelBasedTrigger= ruleLabelBasedTrigger EOF
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
    // InternalPanoptesX.g:3065:1: ruleLabelBasedTrigger returns [EObject current=null] : ( () ( (lv_frequency_1_0= ruleEIntegerObject ) ) otherlv_2= 'labels' otherlv_3= 'received' ) ;
    public final EObject ruleLabelBasedTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_frequency_1_0 = null;



        	enterRule();

        try {
            // InternalPanoptesX.g:3071:2: ( ( () ( (lv_frequency_1_0= ruleEIntegerObject ) ) otherlv_2= 'labels' otherlv_3= 'received' ) )
            // InternalPanoptesX.g:3072:2: ( () ( (lv_frequency_1_0= ruleEIntegerObject ) ) otherlv_2= 'labels' otherlv_3= 'received' )
            {
            // InternalPanoptesX.g:3072:2: ( () ( (lv_frequency_1_0= ruleEIntegerObject ) ) otherlv_2= 'labels' otherlv_3= 'received' )
            // InternalPanoptesX.g:3073:3: () ( (lv_frequency_1_0= ruleEIntegerObject ) ) otherlv_2= 'labels' otherlv_3= 'received'
            {
            // InternalPanoptesX.g:3073:3: ()
            // InternalPanoptesX.g:3074:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLabelBasedTriggerAccess().getLabelBasedTriggerAction_0(),
            					current);
            			

            }

            // InternalPanoptesX.g:3080:3: ( (lv_frequency_1_0= ruleEIntegerObject ) )
            // InternalPanoptesX.g:3081:4: (lv_frequency_1_0= ruleEIntegerObject )
            {
            // InternalPanoptesX.g:3081:4: (lv_frequency_1_0= ruleEIntegerObject )
            // InternalPanoptesX.g:3082:5: lv_frequency_1_0= ruleEIntegerObject
            {

            					newCompositeNode(grammarAccess.getLabelBasedTriggerAccess().getFrequencyEIntegerObjectParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_72);
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

            otherlv_2=(Token)match(input,20,FOLLOW_69); 

            			newLeafNode(otherlv_2, grammarAccess.getLabelBasedTriggerAccess().getLabelsKeyword_2());
            		
            otherlv_3=(Token)match(input,68,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getLabelBasedTriggerAccess().getReceivedKeyword_3());
            		

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
    // InternalPanoptesX.g:3111:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalPanoptesX.g:3111:47: (iv_ruleAction= ruleAction EOF )
            // InternalPanoptesX.g:3112:2: iv_ruleAction= ruleAction EOF
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
    // InternalPanoptesX.g:3118:1: ruleAction returns [EObject current=null] : ( () otherlv_1= 'Action' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'endpoint' ( (lv_endpoint_5_0= ruleEString ) ) ) (otherlv_6= 'parameters' ( (lv_additionalParameters_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_additionalParameters_9_0= ruleParameter ) ) )* )? otherlv_10= '}' ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_endpoint_5_0 = null;

        EObject lv_additionalParameters_7_0 = null;

        EObject lv_additionalParameters_9_0 = null;



        	enterRule();

        try {
            // InternalPanoptesX.g:3124:2: ( ( () otherlv_1= 'Action' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'endpoint' ( (lv_endpoint_5_0= ruleEString ) ) ) (otherlv_6= 'parameters' ( (lv_additionalParameters_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_additionalParameters_9_0= ruleParameter ) ) )* )? otherlv_10= '}' ) )
            // InternalPanoptesX.g:3125:2: ( () otherlv_1= 'Action' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'endpoint' ( (lv_endpoint_5_0= ruleEString ) ) ) (otherlv_6= 'parameters' ( (lv_additionalParameters_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_additionalParameters_9_0= ruleParameter ) ) )* )? otherlv_10= '}' )
            {
            // InternalPanoptesX.g:3125:2: ( () otherlv_1= 'Action' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'endpoint' ( (lv_endpoint_5_0= ruleEString ) ) ) (otherlv_6= 'parameters' ( (lv_additionalParameters_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_additionalParameters_9_0= ruleParameter ) ) )* )? otherlv_10= '}' )
            // InternalPanoptesX.g:3126:3: () otherlv_1= 'Action' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'endpoint' ( (lv_endpoint_5_0= ruleEString ) ) ) (otherlv_6= 'parameters' ( (lv_additionalParameters_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_additionalParameters_9_0= ruleParameter ) ) )* )? otherlv_10= '}'
            {
            // InternalPanoptesX.g:3126:3: ()
            // InternalPanoptesX.g:3127:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActionAccess().getActionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,71,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getActionAccess().getActionKeyword_1());
            		
            // InternalPanoptesX.g:3137:3: ( (lv_name_2_0= ruleEString ) )
            // InternalPanoptesX.g:3138:4: (lv_name_2_0= ruleEString )
            {
            // InternalPanoptesX.g:3138:4: (lv_name_2_0= ruleEString )
            // InternalPanoptesX.g:3139:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_73); 

            			newLeafNode(otherlv_3, grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalPanoptesX.g:3160:3: (otherlv_4= 'endpoint' ( (lv_endpoint_5_0= ruleEString ) ) )
            // InternalPanoptesX.g:3161:4: otherlv_4= 'endpoint' ( (lv_endpoint_5_0= ruleEString ) )
            {
            otherlv_4=(Token)match(input,40,FOLLOW_4); 

            				newLeafNode(otherlv_4, grammarAccess.getActionAccess().getEndpointKeyword_4_0());
            			
            // InternalPanoptesX.g:3165:4: ( (lv_endpoint_5_0= ruleEString ) )
            // InternalPanoptesX.g:3166:5: (lv_endpoint_5_0= ruleEString )
            {
            // InternalPanoptesX.g:3166:5: (lv_endpoint_5_0= ruleEString )
            // InternalPanoptesX.g:3167:6: lv_endpoint_5_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getActionAccess().getEndpointEStringParserRuleCall_4_1_0());
            					
            pushFollow(FOLLOW_40);
            lv_endpoint_5_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getActionRule());
            						}
            						set(
            							current,
            							"endpoint",
            							lv_endpoint_5_0,
            							"org.lowcomote.panoptes.PanoptesX.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalPanoptesX.g:3185:3: (otherlv_6= 'parameters' ( (lv_additionalParameters_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_additionalParameters_9_0= ruleParameter ) ) )* )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==37) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalPanoptesX.g:3186:4: otherlv_6= 'parameters' ( (lv_additionalParameters_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_additionalParameters_9_0= ruleParameter ) ) )*
                    {
                    otherlv_6=(Token)match(input,37,FOLLOW_39); 

                    				newLeafNode(otherlv_6, grammarAccess.getActionAccess().getParametersKeyword_5_0());
                    			
                    // InternalPanoptesX.g:3190:4: ( (lv_additionalParameters_7_0= ruleParameter ) )
                    // InternalPanoptesX.g:3191:5: (lv_additionalParameters_7_0= ruleParameter )
                    {
                    // InternalPanoptesX.g:3191:5: (lv_additionalParameters_7_0= ruleParameter )
                    // InternalPanoptesX.g:3192:6: lv_additionalParameters_7_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getActionAccess().getAdditionalParametersParameterParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_additionalParameters_7_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionRule());
                    						}
                    						add(
                    							current,
                    							"additionalParameters",
                    							lv_additionalParameters_7_0,
                    							"org.lowcomote.panoptes.PanoptesX.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPanoptesX.g:3209:4: (otherlv_8= ',' ( (lv_additionalParameters_9_0= ruleParameter ) ) )*
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( (LA60_0==14) ) {
                            alt60=1;
                        }


                        switch (alt60) {
                    	case 1 :
                    	    // InternalPanoptesX.g:3210:5: otherlv_8= ',' ( (lv_additionalParameters_9_0= ruleParameter ) )
                    	    {
                    	    otherlv_8=(Token)match(input,14,FOLLOW_39); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getActionAccess().getCommaKeyword_5_2_0());
                    	    				
                    	    // InternalPanoptesX.g:3214:5: ( (lv_additionalParameters_9_0= ruleParameter ) )
                    	    // InternalPanoptesX.g:3215:6: (lv_additionalParameters_9_0= ruleParameter )
                    	    {
                    	    // InternalPanoptesX.g:3215:6: (lv_additionalParameters_9_0= ruleParameter )
                    	    // InternalPanoptesX.g:3216:7: lv_additionalParameters_9_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getActionAccess().getAdditionalParametersParameterParserRuleCall_5_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_additionalParameters_9_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getActionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"additionalParameters",
                    	    								lv_additionalParameters_9_0,
                    	    								"org.lowcomote.panoptes.PanoptesX.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop60;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_10=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getActionAccess().getRightCurlyBracketKeyword_6());
            		

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
    // InternalPanoptesX.g:3243:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalPanoptesX.g:3243:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalPanoptesX.g:3244:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalPanoptesX.g:3250:1: ruleParameter returns [EObject current=null] : ( () ( (lv_mandatory_1_0= 'mandatory' ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_type_4_0= ruleparameterType ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_mandatory_1_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_type_4_0 = null;



        	enterRule();

        try {
            // InternalPanoptesX.g:3256:2: ( ( () ( (lv_mandatory_1_0= 'mandatory' ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_type_4_0= ruleparameterType ) ) ) )
            // InternalPanoptesX.g:3257:2: ( () ( (lv_mandatory_1_0= 'mandatory' ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_type_4_0= ruleparameterType ) ) )
            {
            // InternalPanoptesX.g:3257:2: ( () ( (lv_mandatory_1_0= 'mandatory' ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_type_4_0= ruleparameterType ) ) )
            // InternalPanoptesX.g:3258:3: () ( (lv_mandatory_1_0= 'mandatory' ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_type_4_0= ruleparameterType ) )
            {
            // InternalPanoptesX.g:3258:3: ()
            // InternalPanoptesX.g:3259:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterAccess().getParameterAction_0(),
            					current);
            			

            }

            // InternalPanoptesX.g:3265:3: ( (lv_mandatory_1_0= 'mandatory' ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==72) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalPanoptesX.g:3266:4: (lv_mandatory_1_0= 'mandatory' )
                    {
                    // InternalPanoptesX.g:3266:4: (lv_mandatory_1_0= 'mandatory' )
                    // InternalPanoptesX.g:3267:5: lv_mandatory_1_0= 'mandatory'
                    {
                    lv_mandatory_1_0=(Token)match(input,72,FOLLOW_4); 

                    					newLeafNode(lv_mandatory_1_0, grammarAccess.getParameterAccess().getMandatoryMandatoryKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getParameterRule());
                    					}
                    					setWithLastConsumed(current, "mandatory", lv_mandatory_1_0 != null, "mandatory");
                    				

                    }


                    }
                    break;

            }

            // InternalPanoptesX.g:3279:3: ( (lv_name_2_0= ruleEString ) )
            // InternalPanoptesX.g:3280:4: (lv_name_2_0= ruleEString )
            {
            // InternalPanoptesX.g:3280:4: (lv_name_2_0= ruleEString )
            // InternalPanoptesX.g:3281:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_74);
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

            otherlv_3=(Token)match(input,24,FOLLOW_75); 

            			newLeafNode(otherlv_3, grammarAccess.getParameterAccess().getColonKeyword_3());
            		
            // InternalPanoptesX.g:3302:3: ( (lv_type_4_0= ruleparameterType ) )
            // InternalPanoptesX.g:3303:4: (lv_type_4_0= ruleparameterType )
            {
            // InternalPanoptesX.g:3303:4: (lv_type_4_0= ruleparameterType )
            // InternalPanoptesX.g:3304:5: lv_type_4_0= ruleparameterType
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
    // InternalPanoptesX.g:3325:1: entryRuleparameterValueEntry returns [EObject current=null] : iv_ruleparameterValueEntry= ruleparameterValueEntry EOF ;
    public final EObject entryRuleparameterValueEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleparameterValueEntry = null;


        try {
            // InternalPanoptesX.g:3325:60: (iv_ruleparameterValueEntry= ruleparameterValueEntry EOF )
            // InternalPanoptesX.g:3326:2: iv_ruleparameterValueEntry= ruleparameterValueEntry EOF
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
    // InternalPanoptesX.g:3332:1: ruleparameterValueEntry returns [EObject current=null] : ( () ( (lv_key_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_value_3_0= ruleEString ) ) ) ;
    public final EObject ruleparameterValueEntry() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_key_1_0 = null;

        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalPanoptesX.g:3338:2: ( ( () ( (lv_key_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_value_3_0= ruleEString ) ) ) )
            // InternalPanoptesX.g:3339:2: ( () ( (lv_key_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_value_3_0= ruleEString ) ) )
            {
            // InternalPanoptesX.g:3339:2: ( () ( (lv_key_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_value_3_0= ruleEString ) ) )
            // InternalPanoptesX.g:3340:3: () ( (lv_key_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_value_3_0= ruleEString ) )
            {
            // InternalPanoptesX.g:3340:3: ()
            // InternalPanoptesX.g:3341:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterValueEntryAccess().getParameterValueEntryAction_0(),
            					current);
            			

            }

            // InternalPanoptesX.g:3347:3: ( (lv_key_1_0= ruleEString ) )
            // InternalPanoptesX.g:3348:4: (lv_key_1_0= ruleEString )
            {
            // InternalPanoptesX.g:3348:4: (lv_key_1_0= ruleEString )
            // InternalPanoptesX.g:3349:5: lv_key_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParameterValueEntryAccess().getKeyEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_76);
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

            otherlv_2=(Token)match(input,73,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterValueEntryAccess().getEqualsSignKeyword_2());
            		
            // InternalPanoptesX.g:3370:3: ( (lv_value_3_0= ruleEString ) )
            // InternalPanoptesX.g:3371:4: (lv_value_3_0= ruleEString )
            {
            // InternalPanoptesX.g:3371:4: (lv_value_3_0= ruleEString )
            // InternalPanoptesX.g:3372:5: lv_value_3_0= ruleEString
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
    // InternalPanoptesX.g:3393:1: entryRuleActionExecution returns [EObject current=null] : iv_ruleActionExecution= ruleActionExecution EOF ;
    public final EObject entryRuleActionExecution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionExecution = null;


        try {
            // InternalPanoptesX.g:3393:56: (iv_ruleActionExecution= ruleActionExecution EOF )
            // InternalPanoptesX.g:3394:2: iv_ruleActionExecution= ruleActionExecution EOF
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
    // InternalPanoptesX.g:3400:1: ruleActionExecution returns [EObject current=null] : ( () otherlv_1= 'ActionExecution' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (otherlv_4= 'action' ( ( ruleEString ) ) ) (otherlv_6= 'parameter' otherlv_7= 'values' ( (lv_parameterValueMap_8_0= ruleparameterValueEntry ) ) (otherlv_9= ',' ( (lv_parameterValueMap_10_0= ruleparameterValueEntry ) ) )* )? ) otherlv_11= '}' ) ;
    public final EObject ruleActionExecution() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_parameterValueMap_8_0 = null;

        EObject lv_parameterValueMap_10_0 = null;



        	enterRule();

        try {
            // InternalPanoptesX.g:3406:2: ( ( () otherlv_1= 'ActionExecution' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (otherlv_4= 'action' ( ( ruleEString ) ) ) (otherlv_6= 'parameter' otherlv_7= 'values' ( (lv_parameterValueMap_8_0= ruleparameterValueEntry ) ) (otherlv_9= ',' ( (lv_parameterValueMap_10_0= ruleparameterValueEntry ) ) )* )? ) otherlv_11= '}' ) )
            // InternalPanoptesX.g:3407:2: ( () otherlv_1= 'ActionExecution' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (otherlv_4= 'action' ( ( ruleEString ) ) ) (otherlv_6= 'parameter' otherlv_7= 'values' ( (lv_parameterValueMap_8_0= ruleparameterValueEntry ) ) (otherlv_9= ',' ( (lv_parameterValueMap_10_0= ruleparameterValueEntry ) ) )* )? ) otherlv_11= '}' )
            {
            // InternalPanoptesX.g:3407:2: ( () otherlv_1= 'ActionExecution' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (otherlv_4= 'action' ( ( ruleEString ) ) ) (otherlv_6= 'parameter' otherlv_7= 'values' ( (lv_parameterValueMap_8_0= ruleparameterValueEntry ) ) (otherlv_9= ',' ( (lv_parameterValueMap_10_0= ruleparameterValueEntry ) ) )* )? ) otherlv_11= '}' )
            // InternalPanoptesX.g:3408:3: () otherlv_1= 'ActionExecution' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (otherlv_4= 'action' ( ( ruleEString ) ) ) (otherlv_6= 'parameter' otherlv_7= 'values' ( (lv_parameterValueMap_8_0= ruleparameterValueEntry ) ) (otherlv_9= ',' ( (lv_parameterValueMap_10_0= ruleparameterValueEntry ) ) )* )? ) otherlv_11= '}'
            {
            // InternalPanoptesX.g:3408:3: ()
            // InternalPanoptesX.g:3409:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActionExecutionAccess().getActionExecutionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,74,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getActionExecutionAccess().getActionExecutionKeyword_1());
            		
            // InternalPanoptesX.g:3419:3: ( (lv_name_2_0= ruleEString ) )
            // InternalPanoptesX.g:3420:4: (lv_name_2_0= ruleEString )
            {
            // InternalPanoptesX.g:3420:4: (lv_name_2_0= ruleEString )
            // InternalPanoptesX.g:3421:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_77); 

            			newLeafNode(otherlv_3, grammarAccess.getActionExecutionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalPanoptesX.g:3442:3: ( (otherlv_4= 'action' ( ( ruleEString ) ) ) (otherlv_6= 'parameter' otherlv_7= 'values' ( (lv_parameterValueMap_8_0= ruleparameterValueEntry ) ) (otherlv_9= ',' ( (lv_parameterValueMap_10_0= ruleparameterValueEntry ) ) )* )? )
            // InternalPanoptesX.g:3443:4: (otherlv_4= 'action' ( ( ruleEString ) ) ) (otherlv_6= 'parameter' otherlv_7= 'values' ( (lv_parameterValueMap_8_0= ruleparameterValueEntry ) ) (otherlv_9= ',' ( (lv_parameterValueMap_10_0= ruleparameterValueEntry ) ) )* )?
            {
            // InternalPanoptesX.g:3443:4: (otherlv_4= 'action' ( ( ruleEString ) ) )
            // InternalPanoptesX.g:3444:5: otherlv_4= 'action' ( ( ruleEString ) )
            {
            otherlv_4=(Token)match(input,75,FOLLOW_4); 

            					newLeafNode(otherlv_4, grammarAccess.getActionExecutionAccess().getActionKeyword_4_0_0());
            				
            // InternalPanoptesX.g:3448:5: ( ( ruleEString ) )
            // InternalPanoptesX.g:3449:6: ( ruleEString )
            {
            // InternalPanoptesX.g:3449:6: ( ruleEString )
            // InternalPanoptesX.g:3450:7: ruleEString
            {

            							if (current==null) {
            								current = createModelElement(grammarAccess.getActionExecutionRule());
            							}
            						

            							newCompositeNode(grammarAccess.getActionExecutionAccess().getExecutableActionCrossReference_4_0_1_0());
            						
            pushFollow(FOLLOW_57);
            ruleEString();

            state._fsp--;


            							afterParserOrEnumRuleCall();
            						

            }


            }


            }

            // InternalPanoptesX.g:3465:4: (otherlv_6= 'parameter' otherlv_7= 'values' ( (lv_parameterValueMap_8_0= ruleparameterValueEntry ) ) (otherlv_9= ',' ( (lv_parameterValueMap_10_0= ruleparameterValueEntry ) ) )* )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==49) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalPanoptesX.g:3466:5: otherlv_6= 'parameter' otherlv_7= 'values' ( (lv_parameterValueMap_8_0= ruleparameterValueEntry ) ) (otherlv_9= ',' ( (lv_parameterValueMap_10_0= ruleparameterValueEntry ) ) )*
                    {
                    otherlv_6=(Token)match(input,49,FOLLOW_50); 

                    					newLeafNode(otherlv_6, grammarAccess.getActionExecutionAccess().getParameterKeyword_4_1_0());
                    				
                    otherlv_7=(Token)match(input,50,FOLLOW_4); 

                    					newLeafNode(otherlv_7, grammarAccess.getActionExecutionAccess().getValuesKeyword_4_1_1());
                    				
                    // InternalPanoptesX.g:3474:5: ( (lv_parameterValueMap_8_0= ruleparameterValueEntry ) )
                    // InternalPanoptesX.g:3475:6: (lv_parameterValueMap_8_0= ruleparameterValueEntry )
                    {
                    // InternalPanoptesX.g:3475:6: (lv_parameterValueMap_8_0= ruleparameterValueEntry )
                    // InternalPanoptesX.g:3476:7: lv_parameterValueMap_8_0= ruleparameterValueEntry
                    {

                    							newCompositeNode(grammarAccess.getActionExecutionAccess().getParameterValueMapParameterValueEntryParserRuleCall_4_1_2_0());
                    						
                    pushFollow(FOLLOW_14);
                    lv_parameterValueMap_8_0=ruleparameterValueEntry();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getActionExecutionRule());
                    							}
                    							add(
                    								current,
                    								"parameterValueMap",
                    								lv_parameterValueMap_8_0,
                    								"org.lowcomote.panoptes.PanoptesX.parameterValueEntry");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalPanoptesX.g:3493:5: (otherlv_9= ',' ( (lv_parameterValueMap_10_0= ruleparameterValueEntry ) ) )*
                    loop63:
                    do {
                        int alt63=2;
                        int LA63_0 = input.LA(1);

                        if ( (LA63_0==14) ) {
                            alt63=1;
                        }


                        switch (alt63) {
                    	case 1 :
                    	    // InternalPanoptesX.g:3494:6: otherlv_9= ',' ( (lv_parameterValueMap_10_0= ruleparameterValueEntry ) )
                    	    {
                    	    otherlv_9=(Token)match(input,14,FOLLOW_4); 

                    	    						newLeafNode(otherlv_9, grammarAccess.getActionExecutionAccess().getCommaKeyword_4_1_3_0());
                    	    					
                    	    // InternalPanoptesX.g:3498:6: ( (lv_parameterValueMap_10_0= ruleparameterValueEntry ) )
                    	    // InternalPanoptesX.g:3499:7: (lv_parameterValueMap_10_0= ruleparameterValueEntry )
                    	    {
                    	    // InternalPanoptesX.g:3499:7: (lv_parameterValueMap_10_0= ruleparameterValueEntry )
                    	    // InternalPanoptesX.g:3500:8: lv_parameterValueMap_10_0= ruleparameterValueEntry
                    	    {

                    	    								newCompositeNode(grammarAccess.getActionExecutionAccess().getParameterValueMapParameterValueEntryParserRuleCall_4_1_3_1_0());
                    	    							
                    	    pushFollow(FOLLOW_14);
                    	    lv_parameterValueMap_10_0=ruleparameterValueEntry();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getActionExecutionRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"parameterValueMap",
                    	    									lv_parameterValueMap_10_0,
                    	    									"org.lowcomote.panoptes.PanoptesX.parameterValueEntry");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop63;
                        }
                    } while (true);


                    }
                    break;

            }


            }

            otherlv_11=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getActionExecutionAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalPanoptesX.g:3528:1: entryRuleEIntegerObject returns [String current=null] : iv_ruleEIntegerObject= ruleEIntegerObject EOF ;
    public final String entryRuleEIntegerObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEIntegerObject = null;


        try {
            // InternalPanoptesX.g:3528:54: (iv_ruleEIntegerObject= ruleEIntegerObject EOF )
            // InternalPanoptesX.g:3529:2: iv_ruleEIntegerObject= ruleEIntegerObject EOF
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
    // InternalPanoptesX.g:3535:1: ruleEIntegerObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEIntegerObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalPanoptesX.g:3541:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalPanoptesX.g:3542:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalPanoptesX.g:3542:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalPanoptesX.g:3543:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalPanoptesX.g:3543:3: (kw= '-' )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==76) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalPanoptesX.g:3544:4: kw= '-'
                    {
                    kw=(Token)match(input,76,FOLLOW_78); 

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
    // InternalPanoptesX.g:3561:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalPanoptesX.g:3561:47: (iv_ruleEString= ruleEString EOF )
            // InternalPanoptesX.g:3562:2: iv_ruleEString= ruleEString EOF
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
    // InternalPanoptesX.g:3568:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalPanoptesX.g:3574:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalPanoptesX.g:3575:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalPanoptesX.g:3575:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==RULE_STRING) ) {
                alt66=1;
            }
            else if ( (LA66_0==RULE_ID) ) {
                alt66=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // InternalPanoptesX.g:3576:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPanoptesX.g:3584:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // InternalPanoptesX.g:3595:1: rulestatisticalVariableType returns [Enumerator current=null] : ( (enumLiteral_0= 'continuous' ) | (enumLiteral_1= 'categorical' ) | (enumLiteral_2= 'ordered categorical' ) ) ;
    public final Enumerator rulestatisticalVariableType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalPanoptesX.g:3601:2: ( ( (enumLiteral_0= 'continuous' ) | (enumLiteral_1= 'categorical' ) | (enumLiteral_2= 'ordered categorical' ) ) )
            // InternalPanoptesX.g:3602:2: ( (enumLiteral_0= 'continuous' ) | (enumLiteral_1= 'categorical' ) | (enumLiteral_2= 'ordered categorical' ) )
            {
            // InternalPanoptesX.g:3602:2: ( (enumLiteral_0= 'continuous' ) | (enumLiteral_1= 'categorical' ) | (enumLiteral_2= 'ordered categorical' ) )
            int alt67=3;
            switch ( input.LA(1) ) {
            case 77:
                {
                alt67=1;
                }
                break;
            case 78:
                {
                alt67=2;
                }
                break;
            case 79:
                {
                alt67=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }

            switch (alt67) {
                case 1 :
                    // InternalPanoptesX.g:3603:3: (enumLiteral_0= 'continuous' )
                    {
                    // InternalPanoptesX.g:3603:3: (enumLiteral_0= 'continuous' )
                    // InternalPanoptesX.g:3604:4: enumLiteral_0= 'continuous'
                    {
                    enumLiteral_0=(Token)match(input,77,FOLLOW_2); 

                    				current = grammarAccess.getStatisticalVariableTypeAccess().getContinuousEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getStatisticalVariableTypeAccess().getContinuousEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPanoptesX.g:3611:3: (enumLiteral_1= 'categorical' )
                    {
                    // InternalPanoptesX.g:3611:3: (enumLiteral_1= 'categorical' )
                    // InternalPanoptesX.g:3612:4: enumLiteral_1= 'categorical'
                    {
                    enumLiteral_1=(Token)match(input,78,FOLLOW_2); 

                    				current = grammarAccess.getStatisticalVariableTypeAccess().getCategoricalEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getStatisticalVariableTypeAccess().getCategoricalEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalPanoptesX.g:3619:3: (enumLiteral_2= 'ordered categorical' )
                    {
                    // InternalPanoptesX.g:3619:3: (enumLiteral_2= 'ordered categorical' )
                    // InternalPanoptesX.g:3620:4: enumLiteral_2= 'ordered categorical'
                    {
                    enumLiteral_2=(Token)match(input,79,FOLLOW_2); 

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
    // InternalPanoptesX.g:3630:1: rulefrequencyEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'hour' ) | (enumLiteral_1= 'day' ) | (enumLiteral_2= 'week' ) | (enumLiteral_3= 'month' ) | (enumLiteral_4= 'year' ) ) ;
    public final Enumerator rulefrequencyEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalPanoptesX.g:3636:2: ( ( (enumLiteral_0= 'hour' ) | (enumLiteral_1= 'day' ) | (enumLiteral_2= 'week' ) | (enumLiteral_3= 'month' ) | (enumLiteral_4= 'year' ) ) )
            // InternalPanoptesX.g:3637:2: ( (enumLiteral_0= 'hour' ) | (enumLiteral_1= 'day' ) | (enumLiteral_2= 'week' ) | (enumLiteral_3= 'month' ) | (enumLiteral_4= 'year' ) )
            {
            // InternalPanoptesX.g:3637:2: ( (enumLiteral_0= 'hour' ) | (enumLiteral_1= 'day' ) | (enumLiteral_2= 'week' ) | (enumLiteral_3= 'month' ) | (enumLiteral_4= 'year' ) )
            int alt68=5;
            switch ( input.LA(1) ) {
            case 80:
                {
                alt68=1;
                }
                break;
            case 81:
                {
                alt68=2;
                }
                break;
            case 82:
                {
                alt68=3;
                }
                break;
            case 83:
                {
                alt68=4;
                }
                break;
            case 84:
                {
                alt68=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }

            switch (alt68) {
                case 1 :
                    // InternalPanoptesX.g:3638:3: (enumLiteral_0= 'hour' )
                    {
                    // InternalPanoptesX.g:3638:3: (enumLiteral_0= 'hour' )
                    // InternalPanoptesX.g:3639:4: enumLiteral_0= 'hour'
                    {
                    enumLiteral_0=(Token)match(input,80,FOLLOW_2); 

                    				current = grammarAccess.getFrequencyEnumAccess().getHourlyEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getFrequencyEnumAccess().getHourlyEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPanoptesX.g:3646:3: (enumLiteral_1= 'day' )
                    {
                    // InternalPanoptesX.g:3646:3: (enumLiteral_1= 'day' )
                    // InternalPanoptesX.g:3647:4: enumLiteral_1= 'day'
                    {
                    enumLiteral_1=(Token)match(input,81,FOLLOW_2); 

                    				current = grammarAccess.getFrequencyEnumAccess().getDailyEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getFrequencyEnumAccess().getDailyEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalPanoptesX.g:3654:3: (enumLiteral_2= 'week' )
                    {
                    // InternalPanoptesX.g:3654:3: (enumLiteral_2= 'week' )
                    // InternalPanoptesX.g:3655:4: enumLiteral_2= 'week'
                    {
                    enumLiteral_2=(Token)match(input,82,FOLLOW_2); 

                    				current = grammarAccess.getFrequencyEnumAccess().getWeeklyEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getFrequencyEnumAccess().getWeeklyEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalPanoptesX.g:3662:3: (enumLiteral_3= 'month' )
                    {
                    // InternalPanoptesX.g:3662:3: (enumLiteral_3= 'month' )
                    // InternalPanoptesX.g:3663:4: enumLiteral_3= 'month'
                    {
                    enumLiteral_3=(Token)match(input,83,FOLLOW_2); 

                    				current = grammarAccess.getFrequencyEnumAccess().getMonthlyEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getFrequencyEnumAccess().getMonthlyEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalPanoptesX.g:3670:3: (enumLiteral_4= 'year' )
                    {
                    // InternalPanoptesX.g:3670:3: (enumLiteral_4= 'year' )
                    // InternalPanoptesX.g:3671:4: enumLiteral_4= 'year'
                    {
                    enumLiteral_4=(Token)match(input,84,FOLLOW_2); 

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
    // InternalPanoptesX.g:3681:1: ruleparameterType returns [Enumerator current=null] : ( (enumLiteral_0= 'Integer' ) | (enumLiteral_1= 'Real' ) | (enumLiteral_2= 'String' ) | (enumLiteral_3= 'Boolean' ) ) ;
    public final Enumerator ruleparameterType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalPanoptesX.g:3687:2: ( ( (enumLiteral_0= 'Integer' ) | (enumLiteral_1= 'Real' ) | (enumLiteral_2= 'String' ) | (enumLiteral_3= 'Boolean' ) ) )
            // InternalPanoptesX.g:3688:2: ( (enumLiteral_0= 'Integer' ) | (enumLiteral_1= 'Real' ) | (enumLiteral_2= 'String' ) | (enumLiteral_3= 'Boolean' ) )
            {
            // InternalPanoptesX.g:3688:2: ( (enumLiteral_0= 'Integer' ) | (enumLiteral_1= 'Real' ) | (enumLiteral_2= 'String' ) | (enumLiteral_3= 'Boolean' ) )
            int alt69=4;
            switch ( input.LA(1) ) {
            case 85:
                {
                alt69=1;
                }
                break;
            case 86:
                {
                alt69=2;
                }
                break;
            case 87:
                {
                alt69=3;
                }
                break;
            case 88:
                {
                alt69=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }

            switch (alt69) {
                case 1 :
                    // InternalPanoptesX.g:3689:3: (enumLiteral_0= 'Integer' )
                    {
                    // InternalPanoptesX.g:3689:3: (enumLiteral_0= 'Integer' )
                    // InternalPanoptesX.g:3690:4: enumLiteral_0= 'Integer'
                    {
                    enumLiteral_0=(Token)match(input,85,FOLLOW_2); 

                    				current = grammarAccess.getParameterTypeAccess().getIntegerEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getParameterTypeAccess().getIntegerEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPanoptesX.g:3697:3: (enumLiteral_1= 'Real' )
                    {
                    // InternalPanoptesX.g:3697:3: (enumLiteral_1= 'Real' )
                    // InternalPanoptesX.g:3698:4: enumLiteral_1= 'Real'
                    {
                    enumLiteral_1=(Token)match(input,86,FOLLOW_2); 

                    				current = grammarAccess.getParameterTypeAccess().getRealEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getParameterTypeAccess().getRealEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalPanoptesX.g:3705:3: (enumLiteral_2= 'String' )
                    {
                    // InternalPanoptesX.g:3705:3: (enumLiteral_2= 'String' )
                    // InternalPanoptesX.g:3706:4: enumLiteral_2= 'String'
                    {
                    enumLiteral_2=(Token)match(input,87,FOLLOW_2); 

                    				current = grammarAccess.getParameterTypeAccess().getStringEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getParameterTypeAccess().getStringEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalPanoptesX.g:3713:3: (enumLiteral_3= 'Boolean' )
                    {
                    // InternalPanoptesX.g:3713:3: (enumLiteral_3= 'Boolean' )
                    // InternalPanoptesX.g:3714:4: enumLiteral_3= 'Boolean'
                    {
                    enumLiteral_3=(Token)match(input,88,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000002C048020802L,0x0000000000000080L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000003D0000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000394000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000314000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000214000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001001002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000000L,0x000000000000E000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002010000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002014000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x3008040020010000L,0x0000000000000400L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x3008040000014000L,0x0000000000000400L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x3008040000010000L,0x0000000000000400L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x3000000000010000L,0x0000000000000400L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x3000000000010000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000010L,0x0000000000001000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000002800010000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000001000000000L,0x000000000000E000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000002000014000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000060L,0x0000000000000100L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000002000010000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000010000010000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0001100000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0001100000004000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0001000000004000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0002000000014000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x06C2000000014000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0602000000010000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0002000000010000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0xC000000000000070L,0x0000000000001003L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0xC000000000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000060L,0x0000000000000003L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000072L,0x0000000000001003L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000010L,0x0000000000001001L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000070L,0x0000000000001003L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000000L,0x00000000001F0000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000000L,0x0000000001E00000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000010L});

}
