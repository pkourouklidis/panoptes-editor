package org.lowcomote.panoptes.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPanoptesXLexer extends Lexer {
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

    public InternalPanoptesXLexer() {;} 
    public InternalPanoptesXLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalPanoptesXLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalPanoptesX.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPanoptesX.g:11:7: ( 'Model' )
            // InternalPanoptesX.g:11:9: 'Model'
            {
            match("Model"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPanoptesX.g:12:7: ( '{' )
            // InternalPanoptesX.g:12:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPanoptesX.g:13:7: ( 'uses' )
            // InternalPanoptesX.g:13:9: 'uses'
            {
            match("uses"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPanoptesX.g:14:7: ( ',' )
            // InternalPanoptesX.g:14:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPanoptesX.g:15:7: ( 'outputs' )
            // InternalPanoptesX.g:15:9: 'outputs'
            {
            match("outputs"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPanoptesX.g:16:7: ( '}' )
            // InternalPanoptesX.g:16:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPanoptesX.g:17:7: ( 'FeatureStore' )
            // InternalPanoptesX.g:17:9: 'FeatureStore'
            {
            match("FeatureStore"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPanoptesX.g:18:7: ( 'features' )
            // InternalPanoptesX.g:18:9: 'features'
            {
            match("features"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPanoptesX.g:19:7: ( 'entities' )
            // InternalPanoptesX.g:19:9: 'entities'
            {
            match("entities"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPanoptesX.g:20:7: ( 'labels' )
            // InternalPanoptesX.g:20:9: 'labels'
            {
            match("labels"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPanoptesX.g:21:7: ( 'request' )
            // InternalPanoptesX.g:21:9: 'request'
            {
            match("request"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPanoptesX.g:22:7: ( 'data' )
            // InternalPanoptesX.g:22:9: 'data'
            {
            match("data"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPanoptesX.g:23:7: ( 'keys' )
            // InternalPanoptesX.g:23:9: 'keys'
            {
            match("keys"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPanoptesX.g:24:7: ( ':' )
            // InternalPanoptesX.g:24:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPanoptesX.g:25:7: ( 'requires' )
            // InternalPanoptesX.g:25:9: 'requires'
            {
            match("requires"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPanoptesX.g:26:7: ( 'predicts' )
            // InternalPanoptesX.g:26:9: 'predicts'
            {
            match("predicts"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPanoptesX.g:27:7: ( 'Deployment' )
            // InternalPanoptesX.g:27:9: 'Deployment'
            {
            match("Deployment"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPanoptesX.g:28:7: ( 'model' )
            // InternalPanoptesX.g:28:9: 'model'
            {
            match("model"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPanoptesX.g:29:7: ( 'inputs' )
            // InternalPanoptesX.g:29:9: 'inputs'
            {
            match("inputs"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPanoptesX.g:30:7: ( 'BaseAlgorithm' )
            // InternalPanoptesX.g:30:9: 'BaseAlgorithm'
            {
            match("BaseAlgorithm"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPanoptesX.g:31:7: ( 'codebase' )
            // InternalPanoptesX.g:31:9: 'codebase'
            {
            match("codebase"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPanoptesX.g:32:7: ( 'runtime' )
            // InternalPanoptesX.g:32:9: 'runtime'
            {
            match("runtime"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPanoptesX.g:33:7: ( 'severity' )
            // InternalPanoptesX.g:33:9: 'severity'
            {
            match("severity"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPanoptesX.g:34:7: ( 'levels' )
            // InternalPanoptesX.g:34:9: 'levels'
            {
            match("levels"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPanoptesX.g:35:7: ( 'accepts' )
            // InternalPanoptesX.g:35:9: 'accepts'
            {
            match("accepts"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPanoptesX.g:36:7: ( 'only' )
            // InternalPanoptesX.g:36:9: 'only'
            {
            match("only"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPanoptesX.g:37:7: ( 'parameters' )
            // InternalPanoptesX.g:37:9: 'parameters'
            {
            match("parameters"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPanoptesX.g:38:7: ( 'HigherOrderAlgorithm' )
            // InternalPanoptesX.g:38:9: 'HigherOrderAlgorithm'
            {
            match("HigherOrderAlgorithm"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPanoptesX.g:39:7: ( 'BaseAlgorithmRuntime' )
            // InternalPanoptesX.g:39:9: 'BaseAlgorithmRuntime'
            {
            match("BaseAlgorithmRuntime"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPanoptesX.g:40:7: ( 'endpoint' )
            // InternalPanoptesX.g:40:9: 'endpoint'
            {
            match("endpoint"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPanoptesX.g:41:7: ( 'HigherOrderAlgorithmRuntime' )
            // InternalPanoptesX.g:41:9: 'HigherOrderAlgorithmRuntime'
            {
            match("HigherOrderAlgorithmRuntime"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPanoptesX.g:42:7: ( 'BaseAlgorithmExecution' )
            // InternalPanoptesX.g:42:9: 'BaseAlgorithmExecution'
            {
            match("BaseAlgorithmExecution"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPanoptesX.g:43:7: ( 'algorithm' )
            // InternalPanoptesX.g:43:9: 'algorithm'
            {
            match("algorithm"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPanoptesX.g:44:7: ( 'live' )
            // InternalPanoptesX.g:44:9: 'live'
            {
            match("live"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPanoptesX.g:45:7: ( 'historic' )
            // InternalPanoptesX.g:45:9: 'historic'
            {
            match("historic"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPanoptesX.g:46:7: ( 'actions' )
            // InternalPanoptesX.g:46:9: 'actions'
            {
            match("actions"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPanoptesX.g:47:7: ( 'parameter' )
            // InternalPanoptesX.g:47:9: 'parameter'
            {
            match("parameter"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPanoptesX.g:48:7: ( 'values' )
            // InternalPanoptesX.g:48:9: 'values'
            {
            match("values"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPanoptesX.g:49:7: ( 'HigherOrderAlgorithmExecution' )
            // InternalPanoptesX.g:49:9: 'HigherOrderAlgorithmExecution'
            {
            match("HigherOrderAlgorithmExecution"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPanoptesX.g:50:7: ( 'observed' )
            // InternalPanoptesX.g:50:9: 'observed'
            {
            match("observed"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPanoptesX.g:51:7: ( 'execution' )
            // InternalPanoptesX.g:51:9: 'execution'
            {
            match("execution"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPanoptesX.g:52:7: ( 'minimum' )
            // InternalPanoptesX.g:52:9: 'minimum'
            {
            match("minimum"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPanoptesX.g:53:7: ( 'min' )
            // InternalPanoptesX.g:53:9: 'min'
            {
            match("min"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPanoptesX.g:54:7: ( 'observations' )
            // InternalPanoptesX.g:54:9: 'observations'
            {
            match("observations"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPanoptesX.g:55:7: ( 'maximum' )
            // InternalPanoptesX.g:55:9: 'maximum'
            {
            match("maximum"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPanoptesX.g:56:7: ( 'max' )
            // InternalPanoptesX.g:56:9: 'max'
            {
            match("max"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPanoptesX.g:57:7: ( '->' )
            // InternalPanoptesX.g:57:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPanoptesX.g:58:7: ( 'Trigger' )
            // InternalPanoptesX.g:58:9: 'Trigger'
            {
            match("Trigger"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPanoptesX.g:59:7: ( 'or' )
            // InternalPanoptesX.g:59:9: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPanoptesX.g:60:7: ( 'execute' )
            // InternalPanoptesX.g:60:9: 'execute'
            {
            match("execute"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPanoptesX.g:61:7: ( 'every' )
            // InternalPanoptesX.g:61:9: 'every'
            {
            match("every"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPanoptesX.g:62:7: ( 'one' )
            // InternalPanoptesX.g:62:9: 'one'
            {
            match("one"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPanoptesX.g:63:7: ( 'samples' )
            // InternalPanoptesX.g:63:9: 'samples'
            {
            match("samples"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPanoptesX.g:64:7: ( 'predictions' )
            // InternalPanoptesX.g:64:9: 'predictions'
            {
            match("predictions"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPanoptesX.g:65:7: ( 'Action' )
            // InternalPanoptesX.g:65:9: 'Action'
            {
            match("Action"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPanoptesX.g:66:7: ( 'mandatory' )
            // InternalPanoptesX.g:66:9: 'mandatory'
            {
            match("mandatory"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPanoptesX.g:67:7: ( '=' )
            // InternalPanoptesX.g:67:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPanoptesX.g:68:7: ( 'ActionExecution' )
            // InternalPanoptesX.g:68:9: 'ActionExecution'
            {
            match("ActionExecution"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPanoptesX.g:69:7: ( 'action' )
            // InternalPanoptesX.g:69:9: 'action'
            {
            match("action"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPanoptesX.g:70:7: ( '-' )
            // InternalPanoptesX.g:70:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPanoptesX.g:71:7: ( 'continuous' )
            // InternalPanoptesX.g:71:9: 'continuous'
            {
            match("continuous"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPanoptesX.g:72:7: ( 'categorical' )
            // InternalPanoptesX.g:72:9: 'categorical'
            {
            match("categorical"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPanoptesX.g:73:7: ( 'ordered categorical' )
            // InternalPanoptesX.g:73:9: 'ordered categorical'
            {
            match("ordered categorical"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPanoptesX.g:74:7: ( 'hour' )
            // InternalPanoptesX.g:74:9: 'hour'
            {
            match("hour"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPanoptesX.g:75:7: ( 'day' )
            // InternalPanoptesX.g:75:9: 'day'
            {
            match("day"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPanoptesX.g:76:7: ( 'week' )
            // InternalPanoptesX.g:76:9: 'week'
            {
            match("week"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPanoptesX.g:77:7: ( 'month' )
            // InternalPanoptesX.g:77:9: 'month'
            {
            match("month"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPanoptesX.g:78:7: ( 'year' )
            // InternalPanoptesX.g:78:9: 'year'
            {
            match("year"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPanoptesX.g:79:7: ( 'Integer' )
            // InternalPanoptesX.g:79:9: 'Integer'
            {
            match("Integer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPanoptesX.g:80:7: ( 'Real' )
            // InternalPanoptesX.g:80:9: 'Real'
            {
            match("Real"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPanoptesX.g:81:7: ( 'String' )
            // InternalPanoptesX.g:81:9: 'String'
            {
            match("String"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPanoptesX.g:82:7: ( 'Boolean' )
            // InternalPanoptesX.g:82:9: 'Boolean'
            {
            match("Boolean"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "RULE_PANOPTESSTRING"
    public final void mRULE_PANOPTESSTRING() throws RecognitionException {
        try {
            int _type = RULE_PANOPTESSTRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPanoptesX.g:4113:21: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '.' | '@' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '.' | '@' | '0' .. '9' )* )
            // InternalPanoptesX.g:4113:23: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '.' | '@' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '.' | '@' | '0' .. '9' )*
            {
            if ( input.LA(1)=='.'||(input.LA(1)>='@' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalPanoptesX.g:4113:55: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '.' | '@' | '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='.'||(LA1_0>='0' && LA1_0<='9')||(LA1_0>='@' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalPanoptesX.g:
            	    {
            	    if ( input.LA(1)=='.'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='@' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PANOPTESSTRING"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPanoptesX.g:4115:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalPanoptesX.g:4115:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalPanoptesX.g:4115:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalPanoptesX.g:4115:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalPanoptesX.g:4115:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalPanoptesX.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPanoptesX.g:4117:10: ( ( '0' .. '9' )+ )
            // InternalPanoptesX.g:4117:12: ( '0' .. '9' )+
            {
            // InternalPanoptesX.g:4117:12: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalPanoptesX.g:4117:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPanoptesX.g:4119:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalPanoptesX.g:4119:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalPanoptesX.g:4119:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\"') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\'') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalPanoptesX.g:4119:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalPanoptesX.g:4119:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalPanoptesX.g:4119:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalPanoptesX.g:4119:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalPanoptesX.g:4119:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalPanoptesX.g:4119:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalPanoptesX.g:4119:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalPanoptesX.g:4119:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPanoptesX.g:4121:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalPanoptesX.g:4121:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalPanoptesX.g:4121:24: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalPanoptesX.g:4121:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPanoptesX.g:4123:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalPanoptesX.g:4123:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalPanoptesX.g:4123:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalPanoptesX.g:4123:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // InternalPanoptesX.g:4123:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalPanoptesX.g:4123:41: ( '\\r' )? '\\n'
                    {
                    // InternalPanoptesX.g:4123:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalPanoptesX.g:4123:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPanoptesX.g:4125:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalPanoptesX.g:4125:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalPanoptesX.g:4125:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalPanoptesX.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPanoptesX.g:4127:16: ( . )
            // InternalPanoptesX.g:4127:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalPanoptesX.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | RULE_PANOPTESSTRING | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=80;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // InternalPanoptesX.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // InternalPanoptesX.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // InternalPanoptesX.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // InternalPanoptesX.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // InternalPanoptesX.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // InternalPanoptesX.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // InternalPanoptesX.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // InternalPanoptesX.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // InternalPanoptesX.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // InternalPanoptesX.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // InternalPanoptesX.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // InternalPanoptesX.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // InternalPanoptesX.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // InternalPanoptesX.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // InternalPanoptesX.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // InternalPanoptesX.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // InternalPanoptesX.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // InternalPanoptesX.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // InternalPanoptesX.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // InternalPanoptesX.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // InternalPanoptesX.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // InternalPanoptesX.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // InternalPanoptesX.g:1:142: T__34
                {
                mT__34(); 

                }
                break;
            case 24 :
                // InternalPanoptesX.g:1:148: T__35
                {
                mT__35(); 

                }
                break;
            case 25 :
                // InternalPanoptesX.g:1:154: T__36
                {
                mT__36(); 

                }
                break;
            case 26 :
                // InternalPanoptesX.g:1:160: T__37
                {
                mT__37(); 

                }
                break;
            case 27 :
                // InternalPanoptesX.g:1:166: T__38
                {
                mT__38(); 

                }
                break;
            case 28 :
                // InternalPanoptesX.g:1:172: T__39
                {
                mT__39(); 

                }
                break;
            case 29 :
                // InternalPanoptesX.g:1:178: T__40
                {
                mT__40(); 

                }
                break;
            case 30 :
                // InternalPanoptesX.g:1:184: T__41
                {
                mT__41(); 

                }
                break;
            case 31 :
                // InternalPanoptesX.g:1:190: T__42
                {
                mT__42(); 

                }
                break;
            case 32 :
                // InternalPanoptesX.g:1:196: T__43
                {
                mT__43(); 

                }
                break;
            case 33 :
                // InternalPanoptesX.g:1:202: T__44
                {
                mT__44(); 

                }
                break;
            case 34 :
                // InternalPanoptesX.g:1:208: T__45
                {
                mT__45(); 

                }
                break;
            case 35 :
                // InternalPanoptesX.g:1:214: T__46
                {
                mT__46(); 

                }
                break;
            case 36 :
                // InternalPanoptesX.g:1:220: T__47
                {
                mT__47(); 

                }
                break;
            case 37 :
                // InternalPanoptesX.g:1:226: T__48
                {
                mT__48(); 

                }
                break;
            case 38 :
                // InternalPanoptesX.g:1:232: T__49
                {
                mT__49(); 

                }
                break;
            case 39 :
                // InternalPanoptesX.g:1:238: T__50
                {
                mT__50(); 

                }
                break;
            case 40 :
                // InternalPanoptesX.g:1:244: T__51
                {
                mT__51(); 

                }
                break;
            case 41 :
                // InternalPanoptesX.g:1:250: T__52
                {
                mT__52(); 

                }
                break;
            case 42 :
                // InternalPanoptesX.g:1:256: T__53
                {
                mT__53(); 

                }
                break;
            case 43 :
                // InternalPanoptesX.g:1:262: T__54
                {
                mT__54(); 

                }
                break;
            case 44 :
                // InternalPanoptesX.g:1:268: T__55
                {
                mT__55(); 

                }
                break;
            case 45 :
                // InternalPanoptesX.g:1:274: T__56
                {
                mT__56(); 

                }
                break;
            case 46 :
                // InternalPanoptesX.g:1:280: T__57
                {
                mT__57(); 

                }
                break;
            case 47 :
                // InternalPanoptesX.g:1:286: T__58
                {
                mT__58(); 

                }
                break;
            case 48 :
                // InternalPanoptesX.g:1:292: T__59
                {
                mT__59(); 

                }
                break;
            case 49 :
                // InternalPanoptesX.g:1:298: T__60
                {
                mT__60(); 

                }
                break;
            case 50 :
                // InternalPanoptesX.g:1:304: T__61
                {
                mT__61(); 

                }
                break;
            case 51 :
                // InternalPanoptesX.g:1:310: T__62
                {
                mT__62(); 

                }
                break;
            case 52 :
                // InternalPanoptesX.g:1:316: T__63
                {
                mT__63(); 

                }
                break;
            case 53 :
                // InternalPanoptesX.g:1:322: T__64
                {
                mT__64(); 

                }
                break;
            case 54 :
                // InternalPanoptesX.g:1:328: T__65
                {
                mT__65(); 

                }
                break;
            case 55 :
                // InternalPanoptesX.g:1:334: T__66
                {
                mT__66(); 

                }
                break;
            case 56 :
                // InternalPanoptesX.g:1:340: T__67
                {
                mT__67(); 

                }
                break;
            case 57 :
                // InternalPanoptesX.g:1:346: T__68
                {
                mT__68(); 

                }
                break;
            case 58 :
                // InternalPanoptesX.g:1:352: T__69
                {
                mT__69(); 

                }
                break;
            case 59 :
                // InternalPanoptesX.g:1:358: T__70
                {
                mT__70(); 

                }
                break;
            case 60 :
                // InternalPanoptesX.g:1:364: T__71
                {
                mT__71(); 

                }
                break;
            case 61 :
                // InternalPanoptesX.g:1:370: T__72
                {
                mT__72(); 

                }
                break;
            case 62 :
                // InternalPanoptesX.g:1:376: T__73
                {
                mT__73(); 

                }
                break;
            case 63 :
                // InternalPanoptesX.g:1:382: T__74
                {
                mT__74(); 

                }
                break;
            case 64 :
                // InternalPanoptesX.g:1:388: T__75
                {
                mT__75(); 

                }
                break;
            case 65 :
                // InternalPanoptesX.g:1:394: T__76
                {
                mT__76(); 

                }
                break;
            case 66 :
                // InternalPanoptesX.g:1:400: T__77
                {
                mT__77(); 

                }
                break;
            case 67 :
                // InternalPanoptesX.g:1:406: T__78
                {
                mT__78(); 

                }
                break;
            case 68 :
                // InternalPanoptesX.g:1:412: T__79
                {
                mT__79(); 

                }
                break;
            case 69 :
                // InternalPanoptesX.g:1:418: T__80
                {
                mT__80(); 

                }
                break;
            case 70 :
                // InternalPanoptesX.g:1:424: T__81
                {
                mT__81(); 

                }
                break;
            case 71 :
                // InternalPanoptesX.g:1:430: T__82
                {
                mT__82(); 

                }
                break;
            case 72 :
                // InternalPanoptesX.g:1:436: T__83
                {
                mT__83(); 

                }
                break;
            case 73 :
                // InternalPanoptesX.g:1:442: RULE_PANOPTESSTRING
                {
                mRULE_PANOPTESSTRING(); 

                }
                break;
            case 74 :
                // InternalPanoptesX.g:1:462: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 75 :
                // InternalPanoptesX.g:1:470: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 76 :
                // InternalPanoptesX.g:1:479: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 77 :
                // InternalPanoptesX.g:1:491: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 78 :
                // InternalPanoptesX.g:1:507: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 79 :
                // InternalPanoptesX.g:1:523: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 80 :
                // InternalPanoptesX.g:1:531: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\1\55\1\uffff\1\55\1\uffff\1\55\1\uffff\7\55\1\uffff\13\55\1\130\2\55\1\uffff\6\55\1\53\2\uffff\3\53\2\uffff\1\55\1\uffff\1\55\1\uffff\1\55\1\uffff\3\55\1\156\1\uffff\14\55\1\uffff\23\55\2\uffff\2\55\1\uffff\5\55\6\uffff\4\55\1\u009f\2\55\1\uffff\14\55\1\u00ae\6\55\1\u00b6\1\u00b8\30\55\1\u00d1\1\55\1\u00d3\1\uffff\12\55\1\u00de\2\55\1\u00e2\1\uffff\1\u00e3\6\55\1\uffff\1\55\1\uffff\16\55\1\u00f9\3\55\1\u00fd\1\u00fe\1\55\1\u0100\1\55\1\u0102\1\uffff\1\55\1\uffff\7\55\1\u010b\2\55\1\uffff\3\55\2\uffff\3\55\1\u0114\1\u0115\20\55\1\uffff\3\55\2\uffff\1\55\1\uffff\1\55\1\uffff\10\55\1\uffff\1\u0135\1\u0136\6\55\2\uffff\3\55\1\u0140\10\55\1\u014a\3\55\1\u014e\1\55\1\u0151\1\55\1\u0153\1\u0154\10\55\1\u015d\2\uffff\1\u015e\1\55\1\u0160\3\55\1\u0165\1\u0166\1\55\1\uffff\1\55\1\u0169\4\55\1\u016e\1\u016f\1\u0170\1\uffff\3\55\1\uffff\1\u0174\1\55\1\uffff\1\u0176\2\uffff\1\u0177\1\55\1\uffff\1\55\1\u017a\1\u017b\1\u017c\1\55\2\uffff\1\u017e\1\uffff\1\u017f\3\55\2\uffff\2\55\1\uffff\1\u0185\2\55\1\u0188\3\uffff\2\55\1\u018b\1\uffff\1\55\2\uffff\2\55\3\uffff\1\u018f\2\uffff\1\55\1\u0192\1\55\1\u0194\1\55\1\uffff\2\55\1\uffff\1\u0198\1\55\1\uffff\3\55\1\uffff\1\55\1\u019e\1\uffff\1\u019f\1\uffff\1\55\1\u01a1\1\55\1\uffff\4\55\1\u01a7\2\uffff\1\55\1\uffff\1\u01a9\2\55\1\u01ac\1\u01ad\1\uffff\1\55\1\uffff\2\55\2\uffff\1\u01b3\4\55\1\uffff\5\55\1\u01bd\3\55\1\uffff\11\55\1\u01ca\1\55\1\u01ce\1\uffff\3\55\1\uffff\1\u01d2\2\55\1\uffff\10\55\1\u01dd\1\55\1\uffff\1\55\1\u01e0\1\uffff";
    static final String DFA13_eofS =
        "\u01e1\uffff";
    static final String DFA13_minS =
        "\1\0\1\60\1\uffff\1\60\1\uffff\1\60\1\uffff\7\60\1\uffff\13\60\1\76\2\60\1\uffff\6\60\1\101\2\uffff\2\0\1\52\2\uffff\1\60\1\uffff\1\60\1\uffff\1\60\1\uffff\3\60\1\56\1\uffff\14\60\1\uffff\23\60\2\uffff\2\60\1\uffff\5\60\6\uffff\4\60\1\56\2\60\1\uffff\14\60\1\56\6\60\2\56\30\60\1\56\1\60\1\56\1\uffff\12\60\1\56\2\60\1\56\1\uffff\1\56\6\60\1\uffff\1\60\1\uffff\16\60\1\56\3\60\2\56\1\60\1\56\1\60\1\56\1\uffff\1\60\1\uffff\7\60\1\56\2\60\1\uffff\3\60\2\uffff\3\60\2\56\20\60\1\uffff\3\60\2\uffff\1\60\1\uffff\1\60\1\uffff\10\60\1\uffff\2\56\6\60\2\uffff\3\60\1\56\10\60\1\56\3\60\1\56\1\60\1\56\1\60\2\56\2\60\1\40\5\60\1\56\2\uffff\1\56\1\60\1\56\3\60\2\56\1\60\1\uffff\1\60\1\56\4\60\3\56\1\uffff\3\60\1\uffff\1\56\1\60\1\uffff\1\56\2\uffff\1\56\1\60\1\uffff\1\60\3\56\1\60\2\uffff\1\56\1\uffff\1\56\3\60\2\uffff\2\60\1\uffff\1\56\2\60\1\56\3\uffff\2\60\1\56\1\uffff\1\60\2\uffff\2\60\3\uffff\1\56\2\uffff\1\60\1\56\1\60\1\56\1\60\1\uffff\2\60\1\uffff\1\56\1\60\1\uffff\3\60\1\uffff\1\60\1\56\1\uffff\1\56\1\uffff\1\60\1\56\1\60\1\uffff\4\60\1\56\2\uffff\1\60\1\uffff\1\56\2\60\2\56\1\uffff\1\60\1\uffff\2\60\2\uffff\1\56\4\60\1\uffff\5\60\1\56\3\60\1\uffff\11\60\1\56\1\60\1\56\1\uffff\3\60\1\uffff\1\56\2\60\1\uffff\10\60\1\56\1\60\1\uffff\1\60\1\56\1\uffff";
    static final String DFA13_maxS =
        "\1\uffff\1\172\1\uffff\1\172\1\uffff\1\172\1\uffff\7\172\1\uffff\13\172\1\76\2\172\1\uffff\7\172\2\uffff\2\uffff\1\57\2\uffff\1\172\1\uffff\1\172\1\uffff\1\172\1\uffff\4\172\1\uffff\14\172\1\uffff\23\172\2\uffff\2\172\1\uffff\5\172\6\uffff\7\172\1\uffff\60\172\1\uffff\16\172\1\uffff\7\172\1\uffff\1\172\1\uffff\30\172\1\uffff\1\172\1\uffff\12\172\1\uffff\3\172\2\uffff\25\172\1\uffff\3\172\2\uffff\1\172\1\uffff\1\172\1\uffff\10\172\1\uffff\10\172\2\uffff\37\172\2\uffff\11\172\1\uffff\11\172\1\uffff\3\172\1\uffff\2\172\1\uffff\1\172\2\uffff\2\172\1\uffff\5\172\2\uffff\1\172\1\uffff\4\172\2\uffff\2\172\1\uffff\4\172\3\uffff\3\172\1\uffff\1\172\2\uffff\2\172\3\uffff\1\172\2\uffff\5\172\1\uffff\2\172\1\uffff\2\172\1\uffff\3\172\1\uffff\2\172\1\uffff\1\172\1\uffff\3\172\1\uffff\5\172\2\uffff\1\172\1\uffff\5\172\1\uffff\1\172\1\uffff\2\172\2\uffff\5\172\1\uffff\11\172\1\uffff\14\172\1\uffff\3\172\1\uffff\3\172\1\uffff\12\172\1\uffff\2\172\1\uffff";
    static final String DFA13_acceptS =
        "\2\uffff\1\2\1\uffff\1\4\1\uffff\1\6\7\uffff\1\16\16\uffff\1\71\7\uffff\1\111\1\113\3\uffff\1\117\1\120\1\uffff\1\111\1\uffff\1\2\1\uffff\1\4\4\uffff\1\6\14\uffff\1\16\23\uffff\1\57\1\74\2\uffff\1\71\5\uffff\1\112\1\113\1\114\1\115\1\116\1\117\7\uffff\1\61\60\uffff\1\64\16\uffff\1\101\7\uffff\1\53\1\uffff\1\56\30\uffff\1\3\1\uffff\1\32\12\uffff\1\42\3\uffff\1\14\1\15\25\uffff\1\100\3\uffff\1\102\1\104\1\uffff\1\106\1\uffff\1\1\10\uffff\1\63\10\uffff\1\22\1\103\37\uffff\1\12\1\30\11\uffff\1\23\11\uffff\1\73\3\uffff\1\46\2\uffff\1\67\1\uffff\1\107\1\5\2\uffff\1\77\5\uffff\1\62\1\13\1\uffff\1\26\4\uffff\1\52\1\55\2\uffff\1\110\4\uffff\1\65\1\31\1\44\3\uffff\1\60\1\uffff\1\105\1\50\2\uffff\1\10\1\11\1\36\1\uffff\1\17\1\20\5\uffff\1\25\2\uffff\1\27\2\uffff\1\43\3\uffff\1\51\2\uffff\1\45\1\uffff\1\70\3\uffff\1\41\5\uffff\1\33\1\21\1\uffff\1\75\5\uffff\1\66\1\uffff\1\76\2\uffff\1\54\1\7\5\uffff\1\24\11\uffff\1\72\14\uffff\1\35\3\uffff\1\34\3\uffff\1\40\12\uffff\1\37\2\uffff\1\47";
    static final String DFA13_specialS =
        "\1\0\46\uffff\1\1\1\2\u01b8\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\53\2\52\2\53\1\52\22\53\1\52\1\53\1\47\4\53\1\50\4\53\1\4\1\32\1\45\1\51\12\46\1\16\2\53\1\35\2\53\1\45\1\34\1\23\1\43\1\20\1\43\1\7\1\43\1\27\1\40\3\43\1\1\4\43\1\41\1\42\1\33\6\43\3\53\1\44\1\43\1\53\1\26\1\43\1\24\1\14\1\11\1\10\1\43\1\30\1\22\1\43\1\15\1\12\1\21\1\43\1\5\1\17\1\43\1\13\1\25\1\43\1\3\1\31\1\36\1\43\1\37\1\43\1\2\1\53\1\6\uff82\53",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\16\56\1\54\13\56",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\60\7\56",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\1\56\1\64\13\56\1\63\3\56\1\65\2\56\1\62\5\56",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\67\25\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\70\25\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\15\56\1\71\7\56\1\73\1\56\1\72\2\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\1\74\3\56\1\75\3\56\1\76\21\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\77\17\56\1\100\5\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\1\101\31\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\102\25\56",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\1\105\20\56\1\104\10\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\106\25\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\1\111\7\56\1\110\5\56\1\107\13\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\15\56\1\112\14\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\1\113\15\56\1\114\13\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\1\116\15\56\1\115\13\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\1\120\3\56\1\117\25\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\2\56\1\121\10\56\1\122\16\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\10\56\1\123\21\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\10\56\1\124\5\56\1\125\13\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\1\126\31\56",
            "\1\127",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\131\10\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\2\56\1\132\27\56",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\134\25\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\135\25\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\15\56\1\136\14\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\137\25\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\140\6\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\32\141\4\uffff\1\141\1\uffff\32\141",
            "",
            "",
            "\0\143",
            "\0\143",
            "\1\144\4\uffff\1\145",
            "",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\3\56\1\147\26\56",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\150\25\56",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\151\6\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\153\6\56\1\152\16\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\154\7\56",
            "\1\55\1\uffff\12\56\6\uffff\1\55\32\56\4\uffff\1\56\1\uffff\3\56\1\155\26\56",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\1\157\31\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\1\160\31\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\3\56\1\162\17\56\1\161\6\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\163\25\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\164\25\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\1\56\1\165\30\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\25\56\1\166\4\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\25\56\1\167\4\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\20\56\1\170\11\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\15\56\1\171\14\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\172\4\56\1\173\1\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\30\56\1\174\1\56",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\175\25\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\176\10\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\17\56\1\177\12\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\3\56\1\u0080\11\56\1\u0081\14\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\15\56\1\u0082\14\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\15\56\1\u0084\11\56\1\u0083\2\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\17\56\1\u0085\12\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\u0086\7\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\16\56\1\u0087\13\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\3\56\1\u0088\11\56\1\u0089\14\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u008a\6\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\25\56\1\u008b\4\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\14\56\1\u008c\15\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\2\56\1\u008d\20\56\1\u008e\6\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\6\56\1\u008f\23\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\6\56\1\u0090\23\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\u0091\7\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\24\56\1\u0092\5\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\13\56\1\u0093\16\56",
            "",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\10\56\1\u0094\21\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u0095\6\56",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u0096\25\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\1\u0097\31\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u0098\6\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\1\u0099\31\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\u009a\10\56",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u009b\25\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\u009c\7\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\17\56\1\u009d\12\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\30\56\1\u009e\1\56",
            "\1\55\1\uffff\12\56\6\uffff\1\55\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u00a0\25\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u00a1\25\56",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u00a2\6\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u00a3\6\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\10\56\1\u00a4\21\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\17\56\1\u00a5\12\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\2\56\1\u00a6\27\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\u00a7\10\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u00a8\25\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u00a9\25\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u00aa\25\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\24\56\1\u00ab\5\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u00ac\6\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\1\u00ad\31\56",
            "\1\55\1\uffff\12\56\6\uffff\1\55\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\u00af\7\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\3\56\1\u00b0\26\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\1\u00b1\31\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\13\56\1\u00b2\16\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u00b3\25\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u00b4\6\56",
            "\1\55\1\uffff\12\56\6\uffff\1\55\32\56\4\uffff\1\56\1\uffff\10\56\1\u00b5\21\56",
            "\1\55\1\uffff\12\56\6\uffff\1\55\32\56\4\uffff\1\56\1\uffff\10\56\1\u00b7\21\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\3\56\1\u00b9\26\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\24\56\1\u00ba\5\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u00bb\25\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\13\56\1\u00bc\16\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u00bd\25\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u00be\6\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u00bf\25\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u00c0\25\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\17\56\1\u00c1\12\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u00c2\25\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\10\56\1\u00c3\21\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\16\56\1\u00c4\13\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\7\56\1\u00c5\22\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u00c6\6\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\u00c7\10\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\24\56\1\u00c8\5\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\6\56\1\u00c9\23\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\10\56\1\u00ca\21\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\12\56\1\u00cb\17\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\u00cc\10\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u00cd\25\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\13\56\1\u00ce\16\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\10\56\1\u00cf\21\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\13\56\1\u00d0\16\56",
            "\1\55\1\uffff\12\56\6\uffff\1\55\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\24\56\1\u00d2\5\56",
            "\1\55\1\uffff\12\56\6\uffff\1\55\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\u00d4\10\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\u00d5\10\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\24\56\1\u00d6\5\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\24\56\1\u00d7\5\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u00d8\6\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\16\56\1\u00d9\13\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\24\56\1\u00da\5\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\30\56\1\u00db\1\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\13\56\1\u00dc\16\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\13\56\1\u00dd\16\56",
            "\1\55\1\uffff\12\56\6\uffff\1\55\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u00df\3\56\1\u00e0\21\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\10\56\1\u00e1\21\56",
            "\1\55\1\uffff\12\56\6\uffff\1\55\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\55\1\uffff\12\56\6\uffff\1\55\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\10\56\1\u00e4\21\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\14\56\1\u00e5\15\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\16\56\1\u00e6\13\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\13\56\1\u00e7\16\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\7\56\1\u00e8\22\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\14\56\1\u00e9\15\56",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\14\56\1\u00ea\15\56",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\1\u00eb\31\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u00ec\6\56",
            "\12\56\7\uffff\1\u00ed\31\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u00ee\25\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\1\56\1\u00ef\30\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\10\56\1\u00f0\21\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\6\56\1\u00f1\23\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\u00f2\10\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\13\56\1\u00f3\16\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\17\56\1\u00f4\12\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\16\56\1\u00f5\13\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\u00f6\10\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u00f7\25\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\16\56\1\u00f8\13\56",
            "\1\55\1\uffff\12\56\6\uffff\1\55\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u00fa\25\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\6\56\1\u00fb\23\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\16\56\1\u00fc\13\56",
            "\1\55\1\uffff\12\56\6\uffff\1\55\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\55\1\uffff\12\56\6\uffff\1\55\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\6\56\1\u00ff\23\56",
            "\1\55\1\uffff\12\56\6\uffff\1\55\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\15\56\1\u0101\14\56",
            "\1\55\1\uffff\12\56\6\uffff\1\55\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u0103\6\56",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\25\56\1\u0104\4\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u0105\25\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\u0106\10\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\u0107\10\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\10\56\1\u0108\21\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\10\56\1\u0109\21\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u010a\6\56",
            "\1\55\1\uffff\12\56\6\uffff\1\55\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\u010c\7\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\u010d\7\56",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\u010e\7\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\u010f\10\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\14\56\1\u0110\15\56",
            "",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\2\56\1\u0111\27\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u0112\25\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\30\56\1\u0113\1\56",
            "\1\55\1\uffff\12\56\6\uffff\1\55\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\55\1\uffff\12\56\6\uffff\1\55\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\24\56\1\u0116\5\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\24\56\1\u0117\5\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u0118\6\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\u0119\7\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\13\56\1\u011a\16\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\1\u011b\31\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\1\u011c\31\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\15\56\1\u011d\14\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\16\56\1\u011e\13\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\10\56\1\u011f\21\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u0120\25\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u0121\6\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\15\56\1\u0122\14\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\10\56\1\u0123\21\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\u0124\10\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\u0125\10\56",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\u0126\7\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u0127\25\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\15\56\1\u0128\14\56",
            "",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u0129\25\56",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\6\56\1\u012a\23\56",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\u012b\7\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\1\u012d\3\56\1\u012c\25\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\3\56\1\u012e\26\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u012f\25\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u0130\25\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u0131\25\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\15\56\1\u0132\14\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u0134\3\56\1\u0133\21\56",
            "",
            "\1\55\1\uffff\12\56\6\uffff\1\55\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\55\1\uffff\12\56\6\uffff\1\55\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u0137\6\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u0138\25\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u0139\25\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u013a\6\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u013b\6\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\14\56\1\u013c\15\56",
            "",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\14\56\1\u013d\15\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\14\56\1\u013e\15\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\16\56\1\u013f\13\56",
            "\1\55\1\uffff\12\56\6\uffff\1\55\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\6\56\1\u0141\23\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\15\56\1\u0142\14\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\u0143\7\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\24\56\1\u0144\5\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\u0145\10\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u0146\6\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\u0147\7\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\u0148\7\56",
            "\1\55\1\uffff\12\56\6\uffff\1\55\32\56\4\uffff\1\56\1\uffff\22\56\1\u0149\7\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u014b\6\56",
            "\12\56\7\uffff\16\56\1\u014c\13\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\10\56\1\u014d\21\56",
            "\1\55\1\uffff\12\56\6\uffff\1\55\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\u014f\10\56",
            "\1\55\1\uffff\12\56\6\uffff\1\55\4\56\1\u0150\25\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\u0152\10\56",
            "\1\55\1\uffff\12\56\6\uffff\1\55\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\55\1\uffff\12\56\6\uffff\1\55\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\3\56\1\u0155\26\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u0156\6\56",
            "\1\u0157\17\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\22\56\1\u0158\7\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\u0159\7\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\u015a\7\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u015b\6\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\16\56\1\u015c\13\56",
            "\1\55\1\uffff\12\56\6\uffff\1\55\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "\1\55\1\uffff\12\56\6\uffff\1\55\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\u015f\7\56",
            "\1\55\1\uffff\12\56\6\uffff\1\55\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\10\56\1\u0162\11\56\1\u0161\7\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u0163\25\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u0164\25\56",
            "\1\55\1\uffff\12\56\6\uffff\1\55\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\55\1\uffff\12\56\6\uffff\1\55\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\u0167\10\56",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\16\56\1\u0168\13\56",
            "\1\55\1\uffff\12\56\6\uffff\1\55\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u016a\25\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\16\56\1\u016b\13\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\10\56\1\u016c\21\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\30\56\1\u016d\1\56",
            "\1\55\1\uffff\12\56\6\uffff\1\55\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\55\1\uffff\12\56\6\uffff\1\55\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\55\1\uffff\12\56\6\uffff\1\55\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\7\56\1\u0171\22\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\u0172\10\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\2\56\1\u0173\27\56",
            "",
            "\1\55\1\uffff\12\56\6\uffff\1\55\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\27\56\1\u0175\2\56",
            "",
            "\1\55\1\uffff\12\56\6\uffff\1\55\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "\1\55\1\uffff\12\56\6\uffff\1\55\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\10\56\1\u0178\21\56",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u0179\6\56",
            "\1\55\1\uffff\12\56\6\uffff\1\55\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\55\1\uffff\12\56\6\uffff\1\55\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\55\1\uffff\12\56\6\uffff\1\55\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\15\56\1\u017d\14\56",
            "",
            "",
            "\1\55\1\uffff\12\56\6\uffff\1\55\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\55\1\uffff\12\56\6\uffff\1\55\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\16\56\1\u0180\13\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\u0181\10\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\15\56\1\u0182\14\56",
            "",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\30\56\1\u0183\1\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\u0184\10\56",
            "",
            "\1\55\1\uffff\12\56\6\uffff\1\55\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\24\56\1\u0186\5\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\2\56\1\u0187\27\56",
            "\1\55\1\uffff\12\56\6\uffff\1\55\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\14\56\1\u0189\15\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\3\56\1\u018a\26\56",
            "\1\55\1\uffff\12\56\6\uffff\1\55\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u018c\25\56",
            "",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\16\56\1\u018d\13\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\16\56\1\u018e\13\56",
            "",
            "",
            "",
            "\1\55\1\uffff\12\56\6\uffff\1\55\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\15\56\1\u0190\14\56",
            "\1\55\1\uffff\12\56\6\uffff\1\55\32\56\4\uffff\1\56\1\uffff\22\56\1\u0191\7\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u0193\6\56",
            "\1\55\1\uffff\12\56\6\uffff\1\55\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\10\56\1\u0195\21\56",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\u0196\7\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\1\u0197\31\56",
            "",
            "\1\55\1\uffff\12\56\6\uffff\1\55\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u0199\25\56",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\2\56\1\u019a\27\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\15\56\1\u019b\14\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\u019c\10\56",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\u019d\7\56",
            "\1\55\1\uffff\12\56\6\uffff\1\55\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\55\1\uffff\12\56\6\uffff\1\55\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u01a0\6\56",
            "\1\55\1\uffff\12\56\6\uffff\1\55\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\13\56\1\u01a2\16\56",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\u01a3\10\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\24\56\1\u01a4\5\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\u01a5\7\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u01a6\25\56",
            "\1\55\1\uffff\12\56\6\uffff\1\55\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\7\56\1\u01a8\22\56",
            "",
            "\1\55\1\uffff\12\56\6\uffff\1\55\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\1\u01aa\31\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u01ab\6\56",
            "\1\55\1\uffff\12\56\6\uffff\1\55\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\55\1\uffff\12\56\6\uffff\1\55\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\14\56\1\u01ae\15\56",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\13\56\1\u01af\16\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\10\56\1\u01b0\21\56",
            "",
            "",
            "\1\55\1\uffff\12\56\6\uffff\1\55\4\56\1\u01b2\14\56\1\u01b1\10\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\6\56\1\u01b4\23\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\16\56\1\u01b5\13\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\24\56\1\u01b6\5\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\27\56\1\u01b7\2\56",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\16\56\1\u01b8\13\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\15\56\1\u01b9\14\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\15\56\1\u01ba\14\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u01bb\25\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\u01bc\10\56",
            "\1\55\1\uffff\12\56\6\uffff\1\55\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u01be\6\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\2\56\1\u01bf\27\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\10\56\1\u01c0\21\56",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\10\56\1\u01c1\21\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\24\56\1\u01c2\5\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u01c3\6\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\14\56\1\u01c4\15\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u01c5\6\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\7\56\1\u01c6\22\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u01c7\25\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\10\56\1\u01c8\21\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\14\56\1\u01c9\15\56",
            "\1\55\1\uffff\12\56\6\uffff\1\55\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\16\56\1\u01cb\13\56",
            "\1\55\1\uffff\12\56\6\uffff\1\55\4\56\1\u01cd\14\56\1\u01cc\10\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\15\56\1\u01cf\14\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\24\56\1\u01d0\5\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\27\56\1\u01d1\2\56",
            "",
            "\1\55\1\uffff\12\56\6\uffff\1\55\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\15\56\1\u01d3\14\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u01d4\25\56",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u01d5\6\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\2\56\1\u01d6\27\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\10\56\1\u01d7\21\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\24\56\1\u01d8\5\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\14\56\1\u01d9\15\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u01da\6\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u01db\25\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\10\56\1\u01dc\21\56",
            "\1\55\1\uffff\12\56\6\uffff\1\55\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\16\56\1\u01de\13\56",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\15\56\1\u01df\14\56",
            "\1\55\1\uffff\12\56\6\uffff\1\55\32\56\4\uffff\1\56\1\uffff\32\56",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | RULE_PANOPTESSTRING | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='M') ) {s = 1;}

                        else if ( (LA13_0=='{') ) {s = 2;}

                        else if ( (LA13_0=='u') ) {s = 3;}

                        else if ( (LA13_0==',') ) {s = 4;}

                        else if ( (LA13_0=='o') ) {s = 5;}

                        else if ( (LA13_0=='}') ) {s = 6;}

                        else if ( (LA13_0=='F') ) {s = 7;}

                        else if ( (LA13_0=='f') ) {s = 8;}

                        else if ( (LA13_0=='e') ) {s = 9;}

                        else if ( (LA13_0=='l') ) {s = 10;}

                        else if ( (LA13_0=='r') ) {s = 11;}

                        else if ( (LA13_0=='d') ) {s = 12;}

                        else if ( (LA13_0=='k') ) {s = 13;}

                        else if ( (LA13_0==':') ) {s = 14;}

                        else if ( (LA13_0=='p') ) {s = 15;}

                        else if ( (LA13_0=='D') ) {s = 16;}

                        else if ( (LA13_0=='m') ) {s = 17;}

                        else if ( (LA13_0=='i') ) {s = 18;}

                        else if ( (LA13_0=='B') ) {s = 19;}

                        else if ( (LA13_0=='c') ) {s = 20;}

                        else if ( (LA13_0=='s') ) {s = 21;}

                        else if ( (LA13_0=='a') ) {s = 22;}

                        else if ( (LA13_0=='H') ) {s = 23;}

                        else if ( (LA13_0=='h') ) {s = 24;}

                        else if ( (LA13_0=='v') ) {s = 25;}

                        else if ( (LA13_0=='-') ) {s = 26;}

                        else if ( (LA13_0=='T') ) {s = 27;}

                        else if ( (LA13_0=='A') ) {s = 28;}

                        else if ( (LA13_0=='=') ) {s = 29;}

                        else if ( (LA13_0=='w') ) {s = 30;}

                        else if ( (LA13_0=='y') ) {s = 31;}

                        else if ( (LA13_0=='I') ) {s = 32;}

                        else if ( (LA13_0=='R') ) {s = 33;}

                        else if ( (LA13_0=='S') ) {s = 34;}

                        else if ( (LA13_0=='C'||LA13_0=='E'||LA13_0=='G'||(LA13_0>='J' && LA13_0<='L')||(LA13_0>='N' && LA13_0<='Q')||(LA13_0>='U' && LA13_0<='Z')||LA13_0=='_'||LA13_0=='b'||LA13_0=='g'||LA13_0=='j'||LA13_0=='n'||LA13_0=='q'||LA13_0=='t'||LA13_0=='x'||LA13_0=='z') ) {s = 35;}

                        else if ( (LA13_0=='^') ) {s = 36;}

                        else if ( (LA13_0=='.'||LA13_0=='@') ) {s = 37;}

                        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {s = 38;}

                        else if ( (LA13_0=='\"') ) {s = 39;}

                        else if ( (LA13_0=='\'') ) {s = 40;}

                        else if ( (LA13_0=='/') ) {s = 41;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 42;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='!'||(LA13_0>='#' && LA13_0<='&')||(LA13_0>='(' && LA13_0<='+')||(LA13_0>=';' && LA13_0<='<')||(LA13_0>='>' && LA13_0<='?')||(LA13_0>='[' && LA13_0<=']')||LA13_0=='`'||LA13_0=='|'||(LA13_0>='~' && LA13_0<='\uFFFF')) ) {s = 43;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_39 = input.LA(1);

                        s = -1;
                        if ( ((LA13_39>='\u0000' && LA13_39<='\uFFFF')) ) {s = 99;}

                        else s = 43;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_40 = input.LA(1);

                        s = -1;
                        if ( ((LA13_40>='\u0000' && LA13_40<='\uFFFF')) ) {s = 99;}

                        else s = 43;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}