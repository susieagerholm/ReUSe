package org.xtext.example.mydsl4.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl4.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'+'", "'-'", "'fixed'", "'revolute'", "'prismatic'", "'continuous'", "'Robot'", "'Topology'", "'Link'", "'def'", "'reuse'", "'add_to'", "'link'", "'joint'", "'add'", "'edit2'", "'='", "'.'", "'Inertial'", "'Inertia'", "'ixx'", "'ixy'", "'ixz'", "'iyy'", "'iyz'", "'izz'", "'Visual'", "'Geometry'", "'Material'", "'Origin'", "'x'", "'y'", "'z'", "'roll'", "'pitch'", "'yaw'", "'Mass'", "'massKilogram'", "'Collision'", "'Box'", "'height'", "'length'", "'width'", "'Cylinder'", "'radius'", "'Mesh'", "'pathToFile'", "'Sphere'", "'Texture'", "'Color'", "'red'", "'green'", "'blue'", "'alpha'", "'Joint'", "'ChildOf'", "'ParentOf'", "'Type'", "'Axis'", "'Limit'", "'effort'", "'velocity'", "'lower'", "'upper'", "'Calibration'", "'rising'", "'falling'", "'Dynamics'", "'friction'", "'damping'", "'SafetyController'", "'k_velocity'", "'k_position'", "'softLowerLimit'", "'softUpperLimit'", "'e'", "'->'", "'r->'", "'p->'", "'c->'"
    };
    public static final int T__50=50;
    public static final int T__90=90;
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
    public static final int RULE_ID=5;
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
    public static final int RULE_STRING=6;
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
    public static final int T__89=89;
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


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }


    	private MyDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleRobot"
    // InternalMyDsl.g:53:1: entryRuleRobot : ruleRobot EOF ;
    public final void entryRuleRobot() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleRobot EOF )
            // InternalMyDsl.g:55:1: ruleRobot EOF
            {
             before(grammarAccess.getRobotRule()); 
            pushFollow(FOLLOW_1);
            ruleRobot();

            state._fsp--;

             after(grammarAccess.getRobotRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRobot"


    // $ANTLR start "ruleRobot"
    // InternalMyDsl.g:62:1: ruleRobot : ( ( rule__Robot__Group__0 ) ) ;
    public final void ruleRobot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Robot__Group__0 ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__Robot__Group__0 ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Robot__Group__0 ) )
            // InternalMyDsl.g:68:3: ( rule__Robot__Group__0 )
            {
             before(grammarAccess.getRobotAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__Robot__Group__0 )
            // InternalMyDsl.g:69:4: rule__Robot__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Robot__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRobotAccess().getGroup()); 

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
    // $ANTLR end "ruleRobot"


    // $ANTLR start "entryRuleTopology"
    // InternalMyDsl.g:78:1: entryRuleTopology : ruleTopology EOF ;
    public final void entryRuleTopology() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleTopology EOF )
            // InternalMyDsl.g:80:1: ruleTopology EOF
            {
             before(grammarAccess.getTopologyRule()); 
            pushFollow(FOLLOW_1);
            ruleTopology();

            state._fsp--;

             after(grammarAccess.getTopologyRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTopology"


    // $ANTLR start "ruleTopology"
    // InternalMyDsl.g:87:1: ruleTopology : ( ( rule__Topology__Group__0 ) ) ;
    public final void ruleTopology() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Topology__Group__0 ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Topology__Group__0 ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Topology__Group__0 ) )
            // InternalMyDsl.g:93:3: ( rule__Topology__Group__0 )
            {
             before(grammarAccess.getTopologyAccess().getGroup()); 
            // InternalMyDsl.g:94:3: ( rule__Topology__Group__0 )
            // InternalMyDsl.g:94:4: rule__Topology__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Topology__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTopologyAccess().getGroup()); 

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
    // $ANTLR end "ruleTopology"


    // $ANTLR start "entryRuleJointRef"
    // InternalMyDsl.g:103:1: entryRuleJointRef : ruleJointRef EOF ;
    public final void entryRuleJointRef() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleJointRef EOF )
            // InternalMyDsl.g:105:1: ruleJointRef EOF
            {
             before(grammarAccess.getJointRefRule()); 
            pushFollow(FOLLOW_1);
            ruleJointRef();

            state._fsp--;

             after(grammarAccess.getJointRefRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleJointRef"


    // $ANTLR start "ruleJointRef"
    // InternalMyDsl.g:112:1: ruleJointRef : ( ( rule__JointRef__Alternatives ) ) ;
    public final void ruleJointRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__JointRef__Alternatives ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__JointRef__Alternatives ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__JointRef__Alternatives ) )
            // InternalMyDsl.g:118:3: ( rule__JointRef__Alternatives )
            {
             before(grammarAccess.getJointRefAccess().getAlternatives()); 
            // InternalMyDsl.g:119:3: ( rule__JointRef__Alternatives )
            // InternalMyDsl.g:119:4: rule__JointRef__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__JointRef__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getJointRefAccess().getAlternatives()); 

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
    // $ANTLR end "ruleJointRef"


    // $ANTLR start "entryRuleReUseAble"
    // InternalMyDsl.g:128:1: entryRuleReUseAble : ruleReUseAble EOF ;
    public final void entryRuleReUseAble() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleReUseAble EOF )
            // InternalMyDsl.g:130:1: ruleReUseAble EOF
            {
             before(grammarAccess.getReUseAbleRule()); 
            pushFollow(FOLLOW_1);
            ruleReUseAble();

            state._fsp--;

             after(grammarAccess.getReUseAbleRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleReUseAble"


    // $ANTLR start "ruleReUseAble"
    // InternalMyDsl.g:137:1: ruleReUseAble : ( ( rule__ReUseAble__Alternatives ) ) ;
    public final void ruleReUseAble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__ReUseAble__Alternatives ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__ReUseAble__Alternatives ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__ReUseAble__Alternatives ) )
            // InternalMyDsl.g:143:3: ( rule__ReUseAble__Alternatives )
            {
             before(grammarAccess.getReUseAbleAccess().getAlternatives()); 
            // InternalMyDsl.g:144:3: ( rule__ReUseAble__Alternatives )
            // InternalMyDsl.g:144:4: rule__ReUseAble__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ReUseAble__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getReUseAbleAccess().getAlternatives()); 

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
    // $ANTLR end "ruleReUseAble"


    // $ANTLR start "entryRuleReUseAbleReduced"
    // InternalMyDsl.g:153:1: entryRuleReUseAbleReduced : ruleReUseAbleReduced EOF ;
    public final void entryRuleReUseAbleReduced() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleReUseAbleReduced EOF )
            // InternalMyDsl.g:155:1: ruleReUseAbleReduced EOF
            {
             before(grammarAccess.getReUseAbleReducedRule()); 
            pushFollow(FOLLOW_1);
            ruleReUseAbleReduced();

            state._fsp--;

             after(grammarAccess.getReUseAbleReducedRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleReUseAbleReduced"


    // $ANTLR start "ruleReUseAbleReduced"
    // InternalMyDsl.g:162:1: ruleReUseAbleReduced : ( ( rule__ReUseAbleReduced__Alternatives ) ) ;
    public final void ruleReUseAbleReduced() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__ReUseAbleReduced__Alternatives ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__ReUseAbleReduced__Alternatives ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__ReUseAbleReduced__Alternatives ) )
            // InternalMyDsl.g:168:3: ( rule__ReUseAbleReduced__Alternatives )
            {
             before(grammarAccess.getReUseAbleReducedAccess().getAlternatives()); 
            // InternalMyDsl.g:169:3: ( rule__ReUseAbleReduced__Alternatives )
            // InternalMyDsl.g:169:4: rule__ReUseAbleReduced__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ReUseAbleReduced__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getReUseAbleReducedAccess().getAlternatives()); 

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
    // $ANTLR end "ruleReUseAbleReduced"


    // $ANTLR start "entryRuleLink"
    // InternalMyDsl.g:178:1: entryRuleLink : ruleLink EOF ;
    public final void entryRuleLink() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleLink EOF )
            // InternalMyDsl.g:180:1: ruleLink EOF
            {
             before(grammarAccess.getLinkRule()); 
            pushFollow(FOLLOW_1);
            ruleLink();

            state._fsp--;

             after(grammarAccess.getLinkRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLink"


    // $ANTLR start "ruleLink"
    // InternalMyDsl.g:187:1: ruleLink : ( ( rule__Link__Group__0 ) ) ;
    public final void ruleLink() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__Link__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__Link__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__Link__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__Link__Group__0 )
            {
             before(grammarAccess.getLinkAccess().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__Link__Group__0 )
            // InternalMyDsl.g:194:4: rule__Link__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Link__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLinkAccess().getGroup()); 

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
    // $ANTLR end "ruleLink"


    // $ANTLR start "entryRuleAddTo"
    // InternalMyDsl.g:203:1: entryRuleAddTo : ruleAddTo EOF ;
    public final void entryRuleAddTo() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleAddTo EOF )
            // InternalMyDsl.g:205:1: ruleAddTo EOF
            {
             before(grammarAccess.getAddToRule()); 
            pushFollow(FOLLOW_1);
            ruleAddTo();

            state._fsp--;

             after(grammarAccess.getAddToRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAddTo"


    // $ANTLR start "ruleAddTo"
    // InternalMyDsl.g:212:1: ruleAddTo : ( ( rule__AddTo__Alternatives ) ) ;
    public final void ruleAddTo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__AddTo__Alternatives ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__AddTo__Alternatives ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__AddTo__Alternatives ) )
            // InternalMyDsl.g:218:3: ( rule__AddTo__Alternatives )
            {
             before(grammarAccess.getAddToAccess().getAlternatives()); 
            // InternalMyDsl.g:219:3: ( rule__AddTo__Alternatives )
            // InternalMyDsl.g:219:4: rule__AddTo__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AddTo__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAddToAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAddTo"


    // $ANTLR start "entryRuleReuse"
    // InternalMyDsl.g:228:1: entryRuleReuse : ruleReuse EOF ;
    public final void entryRuleReuse() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleReuse EOF )
            // InternalMyDsl.g:230:1: ruleReuse EOF
            {
             before(grammarAccess.getReuseRule()); 
            pushFollow(FOLLOW_1);
            ruleReuse();

            state._fsp--;

             after(grammarAccess.getReuseRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleReuse"


    // $ANTLR start "ruleReuse"
    // InternalMyDsl.g:237:1: ruleReuse : ( ( rule__Reuse__Alternatives ) ) ;
    public final void ruleReuse() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__Reuse__Alternatives ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__Reuse__Alternatives ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__Reuse__Alternatives ) )
            // InternalMyDsl.g:243:3: ( rule__Reuse__Alternatives )
            {
             before(grammarAccess.getReuseAccess().getAlternatives()); 
            // InternalMyDsl.g:244:3: ( rule__Reuse__Alternatives )
            // InternalMyDsl.g:244:4: rule__Reuse__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Reuse__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getReuseAccess().getAlternatives()); 

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
    // $ANTLR end "ruleReuse"


    // $ANTLR start "entryRuleAssignNewValue"
    // InternalMyDsl.g:253:1: entryRuleAssignNewValue : ruleAssignNewValue EOF ;
    public final void entryRuleAssignNewValue() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleAssignNewValue EOF )
            // InternalMyDsl.g:255:1: ruleAssignNewValue EOF
            {
             before(grammarAccess.getAssignNewValueRule()); 
            pushFollow(FOLLOW_1);
            ruleAssignNewValue();

            state._fsp--;

             after(grammarAccess.getAssignNewValueRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAssignNewValue"


    // $ANTLR start "ruleAssignNewValue"
    // InternalMyDsl.g:262:1: ruleAssignNewValue : ( ( rule__AssignNewValue__Group__0 ) ) ;
    public final void ruleAssignNewValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__AssignNewValue__Group__0 ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__AssignNewValue__Group__0 ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__AssignNewValue__Group__0 ) )
            // InternalMyDsl.g:268:3: ( rule__AssignNewValue__Group__0 )
            {
             before(grammarAccess.getAssignNewValueAccess().getGroup()); 
            // InternalMyDsl.g:269:3: ( rule__AssignNewValue__Group__0 )
            // InternalMyDsl.g:269:4: rule__AssignNewValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AssignNewValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssignNewValueAccess().getGroup()); 

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
    // $ANTLR end "ruleAssignNewValue"


    // $ANTLR start "entryRuleDotExpression"
    // InternalMyDsl.g:278:1: entryRuleDotExpression : ruleDotExpression EOF ;
    public final void entryRuleDotExpression() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( ruleDotExpression EOF )
            // InternalMyDsl.g:280:1: ruleDotExpression EOF
            {
             before(grammarAccess.getDotExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleDotExpression();

            state._fsp--;

             after(grammarAccess.getDotExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDotExpression"


    // $ANTLR start "ruleDotExpression"
    // InternalMyDsl.g:287:1: ruleDotExpression : ( ( rule__DotExpression__Group__0 ) ) ;
    public final void ruleDotExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__DotExpression__Group__0 ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__DotExpression__Group__0 ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__DotExpression__Group__0 ) )
            // InternalMyDsl.g:293:3: ( rule__DotExpression__Group__0 )
            {
             before(grammarAccess.getDotExpressionAccess().getGroup()); 
            // InternalMyDsl.g:294:3: ( rule__DotExpression__Group__0 )
            // InternalMyDsl.g:294:4: rule__DotExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DotExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDotExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleDotExpression"


    // $ANTLR start "entryRuleReUsableRef"
    // InternalMyDsl.g:303:1: entryRuleReUsableRef : ruleReUsableRef EOF ;
    public final void entryRuleReUsableRef() throws RecognitionException {
        try {
            // InternalMyDsl.g:304:1: ( ruleReUsableRef EOF )
            // InternalMyDsl.g:305:1: ruleReUsableRef EOF
            {
             before(grammarAccess.getReUsableRefRule()); 
            pushFollow(FOLLOW_1);
            ruleReUsableRef();

            state._fsp--;

             after(grammarAccess.getReUsableRefRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleReUsableRef"


    // $ANTLR start "ruleReUsableRef"
    // InternalMyDsl.g:312:1: ruleReUsableRef : ( ( rule__ReUsableRef__Group__0 ) ) ;
    public final void ruleReUsableRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:2: ( ( ( rule__ReUsableRef__Group__0 ) ) )
            // InternalMyDsl.g:317:2: ( ( rule__ReUsableRef__Group__0 ) )
            {
            // InternalMyDsl.g:317:2: ( ( rule__ReUsableRef__Group__0 ) )
            // InternalMyDsl.g:318:3: ( rule__ReUsableRef__Group__0 )
            {
             before(grammarAccess.getReUsableRefAccess().getGroup()); 
            // InternalMyDsl.g:319:3: ( rule__ReUsableRef__Group__0 )
            // InternalMyDsl.g:319:4: rule__ReUsableRef__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ReUsableRef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReUsableRefAccess().getGroup()); 

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
    // $ANTLR end "ruleReUsableRef"


    // $ANTLR start "entryRuleInertial"
    // InternalMyDsl.g:328:1: entryRuleInertial : ruleInertial EOF ;
    public final void entryRuleInertial() throws RecognitionException {
        try {
            // InternalMyDsl.g:329:1: ( ruleInertial EOF )
            // InternalMyDsl.g:330:1: ruleInertial EOF
            {
             before(grammarAccess.getInertialRule()); 
            pushFollow(FOLLOW_1);
            ruleInertial();

            state._fsp--;

             after(grammarAccess.getInertialRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInertial"


    // $ANTLR start "ruleInertial"
    // InternalMyDsl.g:337:1: ruleInertial : ( ( rule__Inertial__Group__0 ) ) ;
    public final void ruleInertial() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:341:2: ( ( ( rule__Inertial__Group__0 ) ) )
            // InternalMyDsl.g:342:2: ( ( rule__Inertial__Group__0 ) )
            {
            // InternalMyDsl.g:342:2: ( ( rule__Inertial__Group__0 ) )
            // InternalMyDsl.g:343:3: ( rule__Inertial__Group__0 )
            {
             before(grammarAccess.getInertialAccess().getGroup()); 
            // InternalMyDsl.g:344:3: ( rule__Inertial__Group__0 )
            // InternalMyDsl.g:344:4: rule__Inertial__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Inertial__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInertialAccess().getGroup()); 

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
    // $ANTLR end "ruleInertial"


    // $ANTLR start "entryRuleInertia"
    // InternalMyDsl.g:353:1: entryRuleInertia : ruleInertia EOF ;
    public final void entryRuleInertia() throws RecognitionException {
        try {
            // InternalMyDsl.g:354:1: ( ruleInertia EOF )
            // InternalMyDsl.g:355:1: ruleInertia EOF
            {
             before(grammarAccess.getInertiaRule()); 
            pushFollow(FOLLOW_1);
            ruleInertia();

            state._fsp--;

             after(grammarAccess.getInertiaRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInertia"


    // $ANTLR start "ruleInertia"
    // InternalMyDsl.g:362:1: ruleInertia : ( ( rule__Inertia__Group__0 ) ) ;
    public final void ruleInertia() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:366:2: ( ( ( rule__Inertia__Group__0 ) ) )
            // InternalMyDsl.g:367:2: ( ( rule__Inertia__Group__0 ) )
            {
            // InternalMyDsl.g:367:2: ( ( rule__Inertia__Group__0 ) )
            // InternalMyDsl.g:368:3: ( rule__Inertia__Group__0 )
            {
             before(grammarAccess.getInertiaAccess().getGroup()); 
            // InternalMyDsl.g:369:3: ( rule__Inertia__Group__0 )
            // InternalMyDsl.g:369:4: rule__Inertia__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Inertia__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInertiaAccess().getGroup()); 

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
    // $ANTLR end "ruleInertia"


    // $ANTLR start "entryRuleVisual"
    // InternalMyDsl.g:378:1: entryRuleVisual : ruleVisual EOF ;
    public final void entryRuleVisual() throws RecognitionException {
        try {
            // InternalMyDsl.g:379:1: ( ruleVisual EOF )
            // InternalMyDsl.g:380:1: ruleVisual EOF
            {
             before(grammarAccess.getVisualRule()); 
            pushFollow(FOLLOW_1);
            ruleVisual();

            state._fsp--;

             after(grammarAccess.getVisualRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleVisual"


    // $ANTLR start "ruleVisual"
    // InternalMyDsl.g:387:1: ruleVisual : ( ( rule__Visual__Group__0 ) ) ;
    public final void ruleVisual() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:391:2: ( ( ( rule__Visual__Group__0 ) ) )
            // InternalMyDsl.g:392:2: ( ( rule__Visual__Group__0 ) )
            {
            // InternalMyDsl.g:392:2: ( ( rule__Visual__Group__0 ) )
            // InternalMyDsl.g:393:3: ( rule__Visual__Group__0 )
            {
             before(grammarAccess.getVisualAccess().getGroup()); 
            // InternalMyDsl.g:394:3: ( rule__Visual__Group__0 )
            // InternalMyDsl.g:394:4: rule__Visual__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Visual__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVisualAccess().getGroup()); 

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
    // $ANTLR end "ruleVisual"


    // $ANTLR start "entryRuleOrigin"
    // InternalMyDsl.g:403:1: entryRuleOrigin : ruleOrigin EOF ;
    public final void entryRuleOrigin() throws RecognitionException {
        try {
            // InternalMyDsl.g:404:1: ( ruleOrigin EOF )
            // InternalMyDsl.g:405:1: ruleOrigin EOF
            {
             before(grammarAccess.getOriginRule()); 
            pushFollow(FOLLOW_1);
            ruleOrigin();

            state._fsp--;

             after(grammarAccess.getOriginRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleOrigin"


    // $ANTLR start "ruleOrigin"
    // InternalMyDsl.g:412:1: ruleOrigin : ( ( rule__Origin__Group__0 ) ) ;
    public final void ruleOrigin() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:416:2: ( ( ( rule__Origin__Group__0 ) ) )
            // InternalMyDsl.g:417:2: ( ( rule__Origin__Group__0 ) )
            {
            // InternalMyDsl.g:417:2: ( ( rule__Origin__Group__0 ) )
            // InternalMyDsl.g:418:3: ( rule__Origin__Group__0 )
            {
             before(grammarAccess.getOriginAccess().getGroup()); 
            // InternalMyDsl.g:419:3: ( rule__Origin__Group__0 )
            // InternalMyDsl.g:419:4: rule__Origin__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Origin__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOriginAccess().getGroup()); 

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
    // $ANTLR end "ruleOrigin"


    // $ANTLR start "entryRuleMass"
    // InternalMyDsl.g:428:1: entryRuleMass : ruleMass EOF ;
    public final void entryRuleMass() throws RecognitionException {
        try {
            // InternalMyDsl.g:429:1: ( ruleMass EOF )
            // InternalMyDsl.g:430:1: ruleMass EOF
            {
             before(grammarAccess.getMassRule()); 
            pushFollow(FOLLOW_1);
            ruleMass();

            state._fsp--;

             after(grammarAccess.getMassRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMass"


    // $ANTLR start "ruleMass"
    // InternalMyDsl.g:437:1: ruleMass : ( ( rule__Mass__Group__0 ) ) ;
    public final void ruleMass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:441:2: ( ( ( rule__Mass__Group__0 ) ) )
            // InternalMyDsl.g:442:2: ( ( rule__Mass__Group__0 ) )
            {
            // InternalMyDsl.g:442:2: ( ( rule__Mass__Group__0 ) )
            // InternalMyDsl.g:443:3: ( rule__Mass__Group__0 )
            {
             before(grammarAccess.getMassAccess().getGroup()); 
            // InternalMyDsl.g:444:3: ( rule__Mass__Group__0 )
            // InternalMyDsl.g:444:4: rule__Mass__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Mass__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMassAccess().getGroup()); 

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
    // $ANTLR end "ruleMass"


    // $ANTLR start "entryRuleCollision"
    // InternalMyDsl.g:453:1: entryRuleCollision : ruleCollision EOF ;
    public final void entryRuleCollision() throws RecognitionException {
        try {
            // InternalMyDsl.g:454:1: ( ruleCollision EOF )
            // InternalMyDsl.g:455:1: ruleCollision EOF
            {
             before(grammarAccess.getCollisionRule()); 
            pushFollow(FOLLOW_1);
            ruleCollision();

            state._fsp--;

             after(grammarAccess.getCollisionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCollision"


    // $ANTLR start "ruleCollision"
    // InternalMyDsl.g:462:1: ruleCollision : ( ( rule__Collision__Group__0 ) ) ;
    public final void ruleCollision() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:466:2: ( ( ( rule__Collision__Group__0 ) ) )
            // InternalMyDsl.g:467:2: ( ( rule__Collision__Group__0 ) )
            {
            // InternalMyDsl.g:467:2: ( ( rule__Collision__Group__0 ) )
            // InternalMyDsl.g:468:3: ( rule__Collision__Group__0 )
            {
             before(grammarAccess.getCollisionAccess().getGroup()); 
            // InternalMyDsl.g:469:3: ( rule__Collision__Group__0 )
            // InternalMyDsl.g:469:4: rule__Collision__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Collision__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCollisionAccess().getGroup()); 

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
    // $ANTLR end "ruleCollision"


    // $ANTLR start "entryRuleGeometry"
    // InternalMyDsl.g:478:1: entryRuleGeometry : ruleGeometry EOF ;
    public final void entryRuleGeometry() throws RecognitionException {
        try {
            // InternalMyDsl.g:479:1: ( ruleGeometry EOF )
            // InternalMyDsl.g:480:1: ruleGeometry EOF
            {
             before(grammarAccess.getGeometryRule()); 
            pushFollow(FOLLOW_1);
            ruleGeometry();

            state._fsp--;

             after(grammarAccess.getGeometryRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleGeometry"


    // $ANTLR start "ruleGeometry"
    // InternalMyDsl.g:487:1: ruleGeometry : ( ( rule__Geometry__Alternatives ) ) ;
    public final void ruleGeometry() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:491:2: ( ( ( rule__Geometry__Alternatives ) ) )
            // InternalMyDsl.g:492:2: ( ( rule__Geometry__Alternatives ) )
            {
            // InternalMyDsl.g:492:2: ( ( rule__Geometry__Alternatives ) )
            // InternalMyDsl.g:493:3: ( rule__Geometry__Alternatives )
            {
             before(grammarAccess.getGeometryAccess().getAlternatives()); 
            // InternalMyDsl.g:494:3: ( rule__Geometry__Alternatives )
            // InternalMyDsl.g:494:4: rule__Geometry__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Geometry__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getGeometryAccess().getAlternatives()); 

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
    // $ANTLR end "ruleGeometry"


    // $ANTLR start "entryRuleBox"
    // InternalMyDsl.g:503:1: entryRuleBox : ruleBox EOF ;
    public final void entryRuleBox() throws RecognitionException {
        try {
            // InternalMyDsl.g:504:1: ( ruleBox EOF )
            // InternalMyDsl.g:505:1: ruleBox EOF
            {
             before(grammarAccess.getBoxRule()); 
            pushFollow(FOLLOW_1);
            ruleBox();

            state._fsp--;

             after(grammarAccess.getBoxRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBox"


    // $ANTLR start "ruleBox"
    // InternalMyDsl.g:512:1: ruleBox : ( ( rule__Box__Group__0 ) ) ;
    public final void ruleBox() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:516:2: ( ( ( rule__Box__Group__0 ) ) )
            // InternalMyDsl.g:517:2: ( ( rule__Box__Group__0 ) )
            {
            // InternalMyDsl.g:517:2: ( ( rule__Box__Group__0 ) )
            // InternalMyDsl.g:518:3: ( rule__Box__Group__0 )
            {
             before(grammarAccess.getBoxAccess().getGroup()); 
            // InternalMyDsl.g:519:3: ( rule__Box__Group__0 )
            // InternalMyDsl.g:519:4: rule__Box__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Box__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBoxAccess().getGroup()); 

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
    // $ANTLR end "ruleBox"


    // $ANTLR start "entryRuleCylinder"
    // InternalMyDsl.g:528:1: entryRuleCylinder : ruleCylinder EOF ;
    public final void entryRuleCylinder() throws RecognitionException {
        try {
            // InternalMyDsl.g:529:1: ( ruleCylinder EOF )
            // InternalMyDsl.g:530:1: ruleCylinder EOF
            {
             before(grammarAccess.getCylinderRule()); 
            pushFollow(FOLLOW_1);
            ruleCylinder();

            state._fsp--;

             after(grammarAccess.getCylinderRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCylinder"


    // $ANTLR start "ruleCylinder"
    // InternalMyDsl.g:537:1: ruleCylinder : ( ( rule__Cylinder__Group__0 ) ) ;
    public final void ruleCylinder() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:541:2: ( ( ( rule__Cylinder__Group__0 ) ) )
            // InternalMyDsl.g:542:2: ( ( rule__Cylinder__Group__0 ) )
            {
            // InternalMyDsl.g:542:2: ( ( rule__Cylinder__Group__0 ) )
            // InternalMyDsl.g:543:3: ( rule__Cylinder__Group__0 )
            {
             before(grammarAccess.getCylinderAccess().getGroup()); 
            // InternalMyDsl.g:544:3: ( rule__Cylinder__Group__0 )
            // InternalMyDsl.g:544:4: rule__Cylinder__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Cylinder__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCylinderAccess().getGroup()); 

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
    // $ANTLR end "ruleCylinder"


    // $ANTLR start "entryRuleMesh"
    // InternalMyDsl.g:553:1: entryRuleMesh : ruleMesh EOF ;
    public final void entryRuleMesh() throws RecognitionException {
        try {
            // InternalMyDsl.g:554:1: ( ruleMesh EOF )
            // InternalMyDsl.g:555:1: ruleMesh EOF
            {
             before(grammarAccess.getMeshRule()); 
            pushFollow(FOLLOW_1);
            ruleMesh();

            state._fsp--;

             after(grammarAccess.getMeshRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMesh"


    // $ANTLR start "ruleMesh"
    // InternalMyDsl.g:562:1: ruleMesh : ( ( rule__Mesh__Group__0 ) ) ;
    public final void ruleMesh() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:566:2: ( ( ( rule__Mesh__Group__0 ) ) )
            // InternalMyDsl.g:567:2: ( ( rule__Mesh__Group__0 ) )
            {
            // InternalMyDsl.g:567:2: ( ( rule__Mesh__Group__0 ) )
            // InternalMyDsl.g:568:3: ( rule__Mesh__Group__0 )
            {
             before(grammarAccess.getMeshAccess().getGroup()); 
            // InternalMyDsl.g:569:3: ( rule__Mesh__Group__0 )
            // InternalMyDsl.g:569:4: rule__Mesh__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Mesh__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMeshAccess().getGroup()); 

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
    // $ANTLR end "ruleMesh"


    // $ANTLR start "entryRuleSphere"
    // InternalMyDsl.g:578:1: entryRuleSphere : ruleSphere EOF ;
    public final void entryRuleSphere() throws RecognitionException {
        try {
            // InternalMyDsl.g:579:1: ( ruleSphere EOF )
            // InternalMyDsl.g:580:1: ruleSphere EOF
            {
             before(grammarAccess.getSphereRule()); 
            pushFollow(FOLLOW_1);
            ruleSphere();

            state._fsp--;

             after(grammarAccess.getSphereRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSphere"


    // $ANTLR start "ruleSphere"
    // InternalMyDsl.g:587:1: ruleSphere : ( ( rule__Sphere__Group__0 ) ) ;
    public final void ruleSphere() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:591:2: ( ( ( rule__Sphere__Group__0 ) ) )
            // InternalMyDsl.g:592:2: ( ( rule__Sphere__Group__0 ) )
            {
            // InternalMyDsl.g:592:2: ( ( rule__Sphere__Group__0 ) )
            // InternalMyDsl.g:593:3: ( rule__Sphere__Group__0 )
            {
             before(grammarAccess.getSphereAccess().getGroup()); 
            // InternalMyDsl.g:594:3: ( rule__Sphere__Group__0 )
            // InternalMyDsl.g:594:4: rule__Sphere__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Sphere__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSphereAccess().getGroup()); 

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
    // $ANTLR end "ruleSphere"


    // $ANTLR start "entryRuleMaterial"
    // InternalMyDsl.g:603:1: entryRuleMaterial : ruleMaterial EOF ;
    public final void entryRuleMaterial() throws RecognitionException {
        try {
            // InternalMyDsl.g:604:1: ( ruleMaterial EOF )
            // InternalMyDsl.g:605:1: ruleMaterial EOF
            {
             before(grammarAccess.getMaterialRule()); 
            pushFollow(FOLLOW_1);
            ruleMaterial();

            state._fsp--;

             after(grammarAccess.getMaterialRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMaterial"


    // $ANTLR start "ruleMaterial"
    // InternalMyDsl.g:612:1: ruleMaterial : ( ( rule__Material__Alternatives ) ) ;
    public final void ruleMaterial() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:616:2: ( ( ( rule__Material__Alternatives ) ) )
            // InternalMyDsl.g:617:2: ( ( rule__Material__Alternatives ) )
            {
            // InternalMyDsl.g:617:2: ( ( rule__Material__Alternatives ) )
            // InternalMyDsl.g:618:3: ( rule__Material__Alternatives )
            {
             before(grammarAccess.getMaterialAccess().getAlternatives()); 
            // InternalMyDsl.g:619:3: ( rule__Material__Alternatives )
            // InternalMyDsl.g:619:4: rule__Material__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Material__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMaterialAccess().getAlternatives()); 

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
    // $ANTLR end "ruleMaterial"


    // $ANTLR start "entryRuleTexture"
    // InternalMyDsl.g:628:1: entryRuleTexture : ruleTexture EOF ;
    public final void entryRuleTexture() throws RecognitionException {
        try {
            // InternalMyDsl.g:629:1: ( ruleTexture EOF )
            // InternalMyDsl.g:630:1: ruleTexture EOF
            {
             before(grammarAccess.getTextureRule()); 
            pushFollow(FOLLOW_1);
            ruleTexture();

            state._fsp--;

             after(grammarAccess.getTextureRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTexture"


    // $ANTLR start "ruleTexture"
    // InternalMyDsl.g:637:1: ruleTexture : ( ( rule__Texture__Group__0 ) ) ;
    public final void ruleTexture() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:641:2: ( ( ( rule__Texture__Group__0 ) ) )
            // InternalMyDsl.g:642:2: ( ( rule__Texture__Group__0 ) )
            {
            // InternalMyDsl.g:642:2: ( ( rule__Texture__Group__0 ) )
            // InternalMyDsl.g:643:3: ( rule__Texture__Group__0 )
            {
             before(grammarAccess.getTextureAccess().getGroup()); 
            // InternalMyDsl.g:644:3: ( rule__Texture__Group__0 )
            // InternalMyDsl.g:644:4: rule__Texture__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Texture__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTextureAccess().getGroup()); 

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
    // $ANTLR end "ruleTexture"


    // $ANTLR start "entryRuleColor"
    // InternalMyDsl.g:653:1: entryRuleColor : ruleColor EOF ;
    public final void entryRuleColor() throws RecognitionException {
        try {
            // InternalMyDsl.g:654:1: ( ruleColor EOF )
            // InternalMyDsl.g:655:1: ruleColor EOF
            {
             before(grammarAccess.getColorRule()); 
            pushFollow(FOLLOW_1);
            ruleColor();

            state._fsp--;

             after(grammarAccess.getColorRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleColor"


    // $ANTLR start "ruleColor"
    // InternalMyDsl.g:662:1: ruleColor : ( ( rule__Color__Group__0 ) ) ;
    public final void ruleColor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:666:2: ( ( ( rule__Color__Group__0 ) ) )
            // InternalMyDsl.g:667:2: ( ( rule__Color__Group__0 ) )
            {
            // InternalMyDsl.g:667:2: ( ( rule__Color__Group__0 ) )
            // InternalMyDsl.g:668:3: ( rule__Color__Group__0 )
            {
             before(grammarAccess.getColorAccess().getGroup()); 
            // InternalMyDsl.g:669:3: ( rule__Color__Group__0 )
            // InternalMyDsl.g:669:4: rule__Color__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Color__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getColorAccess().getGroup()); 

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
    // $ANTLR end "ruleColor"


    // $ANTLR start "entryRuleJoint"
    // InternalMyDsl.g:678:1: entryRuleJoint : ruleJoint EOF ;
    public final void entryRuleJoint() throws RecognitionException {
        try {
            // InternalMyDsl.g:679:1: ( ruleJoint EOF )
            // InternalMyDsl.g:680:1: ruleJoint EOF
            {
             before(grammarAccess.getJointRule()); 
            pushFollow(FOLLOW_1);
            ruleJoint();

            state._fsp--;

             after(grammarAccess.getJointRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleJoint"


    // $ANTLR start "ruleJoint"
    // InternalMyDsl.g:687:1: ruleJoint : ( ( rule__Joint__Group__0 ) ) ;
    public final void ruleJoint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:691:2: ( ( ( rule__Joint__Group__0 ) ) )
            // InternalMyDsl.g:692:2: ( ( rule__Joint__Group__0 ) )
            {
            // InternalMyDsl.g:692:2: ( ( rule__Joint__Group__0 ) )
            // InternalMyDsl.g:693:3: ( rule__Joint__Group__0 )
            {
             before(grammarAccess.getJointAccess().getGroup()); 
            // InternalMyDsl.g:694:3: ( rule__Joint__Group__0 )
            // InternalMyDsl.g:694:4: rule__Joint__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Joint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getGroup()); 

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
    // $ANTLR end "ruleJoint"


    // $ANTLR start "entryRuleAxis"
    // InternalMyDsl.g:703:1: entryRuleAxis : ruleAxis EOF ;
    public final void entryRuleAxis() throws RecognitionException {
        try {
            // InternalMyDsl.g:704:1: ( ruleAxis EOF )
            // InternalMyDsl.g:705:1: ruleAxis EOF
            {
             before(grammarAccess.getAxisRule()); 
            pushFollow(FOLLOW_1);
            ruleAxis();

            state._fsp--;

             after(grammarAccess.getAxisRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAxis"


    // $ANTLR start "ruleAxis"
    // InternalMyDsl.g:712:1: ruleAxis : ( ( rule__Axis__Group__0 ) ) ;
    public final void ruleAxis() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:716:2: ( ( ( rule__Axis__Group__0 ) ) )
            // InternalMyDsl.g:717:2: ( ( rule__Axis__Group__0 ) )
            {
            // InternalMyDsl.g:717:2: ( ( rule__Axis__Group__0 ) )
            // InternalMyDsl.g:718:3: ( rule__Axis__Group__0 )
            {
             before(grammarAccess.getAxisAccess().getGroup()); 
            // InternalMyDsl.g:719:3: ( rule__Axis__Group__0 )
            // InternalMyDsl.g:719:4: rule__Axis__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Axis__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAxisAccess().getGroup()); 

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
    // $ANTLR end "ruleAxis"


    // $ANTLR start "entryRuleLimit"
    // InternalMyDsl.g:728:1: entryRuleLimit : ruleLimit EOF ;
    public final void entryRuleLimit() throws RecognitionException {
        try {
            // InternalMyDsl.g:729:1: ( ruleLimit EOF )
            // InternalMyDsl.g:730:1: ruleLimit EOF
            {
             before(grammarAccess.getLimitRule()); 
            pushFollow(FOLLOW_1);
            ruleLimit();

            state._fsp--;

             after(grammarAccess.getLimitRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLimit"


    // $ANTLR start "ruleLimit"
    // InternalMyDsl.g:737:1: ruleLimit : ( ( rule__Limit__Group__0 ) ) ;
    public final void ruleLimit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:741:2: ( ( ( rule__Limit__Group__0 ) ) )
            // InternalMyDsl.g:742:2: ( ( rule__Limit__Group__0 ) )
            {
            // InternalMyDsl.g:742:2: ( ( rule__Limit__Group__0 ) )
            // InternalMyDsl.g:743:3: ( rule__Limit__Group__0 )
            {
             before(grammarAccess.getLimitAccess().getGroup()); 
            // InternalMyDsl.g:744:3: ( rule__Limit__Group__0 )
            // InternalMyDsl.g:744:4: rule__Limit__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Limit__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLimitAccess().getGroup()); 

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
    // $ANTLR end "ruleLimit"


    // $ANTLR start "entryRuleCalibration"
    // InternalMyDsl.g:753:1: entryRuleCalibration : ruleCalibration EOF ;
    public final void entryRuleCalibration() throws RecognitionException {
        try {
            // InternalMyDsl.g:754:1: ( ruleCalibration EOF )
            // InternalMyDsl.g:755:1: ruleCalibration EOF
            {
             before(grammarAccess.getCalibrationRule()); 
            pushFollow(FOLLOW_1);
            ruleCalibration();

            state._fsp--;

             after(grammarAccess.getCalibrationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCalibration"


    // $ANTLR start "ruleCalibration"
    // InternalMyDsl.g:762:1: ruleCalibration : ( ( rule__Calibration__Group__0 ) ) ;
    public final void ruleCalibration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:766:2: ( ( ( rule__Calibration__Group__0 ) ) )
            // InternalMyDsl.g:767:2: ( ( rule__Calibration__Group__0 ) )
            {
            // InternalMyDsl.g:767:2: ( ( rule__Calibration__Group__0 ) )
            // InternalMyDsl.g:768:3: ( rule__Calibration__Group__0 )
            {
             before(grammarAccess.getCalibrationAccess().getGroup()); 
            // InternalMyDsl.g:769:3: ( rule__Calibration__Group__0 )
            // InternalMyDsl.g:769:4: rule__Calibration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Calibration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCalibrationAccess().getGroup()); 

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
    // $ANTLR end "ruleCalibration"


    // $ANTLR start "entryRuleDynamics"
    // InternalMyDsl.g:778:1: entryRuleDynamics : ruleDynamics EOF ;
    public final void entryRuleDynamics() throws RecognitionException {
        try {
            // InternalMyDsl.g:779:1: ( ruleDynamics EOF )
            // InternalMyDsl.g:780:1: ruleDynamics EOF
            {
             before(grammarAccess.getDynamicsRule()); 
            pushFollow(FOLLOW_1);
            ruleDynamics();

            state._fsp--;

             after(grammarAccess.getDynamicsRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDynamics"


    // $ANTLR start "ruleDynamics"
    // InternalMyDsl.g:787:1: ruleDynamics : ( ( rule__Dynamics__Group__0 ) ) ;
    public final void ruleDynamics() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:791:2: ( ( ( rule__Dynamics__Group__0 ) ) )
            // InternalMyDsl.g:792:2: ( ( rule__Dynamics__Group__0 ) )
            {
            // InternalMyDsl.g:792:2: ( ( rule__Dynamics__Group__0 ) )
            // InternalMyDsl.g:793:3: ( rule__Dynamics__Group__0 )
            {
             before(grammarAccess.getDynamicsAccess().getGroup()); 
            // InternalMyDsl.g:794:3: ( rule__Dynamics__Group__0 )
            // InternalMyDsl.g:794:4: rule__Dynamics__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Dynamics__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDynamicsAccess().getGroup()); 

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
    // $ANTLR end "ruleDynamics"


    // $ANTLR start "entryRuleSafetyController"
    // InternalMyDsl.g:803:1: entryRuleSafetyController : ruleSafetyController EOF ;
    public final void entryRuleSafetyController() throws RecognitionException {
        try {
            // InternalMyDsl.g:804:1: ( ruleSafetyController EOF )
            // InternalMyDsl.g:805:1: ruleSafetyController EOF
            {
             before(grammarAccess.getSafetyControllerRule()); 
            pushFollow(FOLLOW_1);
            ruleSafetyController();

            state._fsp--;

             after(grammarAccess.getSafetyControllerRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSafetyController"


    // $ANTLR start "ruleSafetyController"
    // InternalMyDsl.g:812:1: ruleSafetyController : ( ( rule__SafetyController__Group__0 ) ) ;
    public final void ruleSafetyController() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:816:2: ( ( ( rule__SafetyController__Group__0 ) ) )
            // InternalMyDsl.g:817:2: ( ( rule__SafetyController__Group__0 ) )
            {
            // InternalMyDsl.g:817:2: ( ( rule__SafetyController__Group__0 ) )
            // InternalMyDsl.g:818:3: ( rule__SafetyController__Group__0 )
            {
             before(grammarAccess.getSafetyControllerAccess().getGroup()); 
            // InternalMyDsl.g:819:3: ( rule__SafetyController__Group__0 )
            // InternalMyDsl.g:819:4: rule__SafetyController__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SafetyController__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSafetyControllerAccess().getGroup()); 

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
    // $ANTLR end "ruleSafetyController"


    // $ANTLR start "entryRuleURDFAttrSignedNumeric"
    // InternalMyDsl.g:828:1: entryRuleURDFAttrSignedNumeric : ruleURDFAttrSignedNumeric EOF ;
    public final void entryRuleURDFAttrSignedNumeric() throws RecognitionException {
        try {
            // InternalMyDsl.g:829:1: ( ruleURDFAttrSignedNumeric EOF )
            // InternalMyDsl.g:830:1: ruleURDFAttrSignedNumeric EOF
            {
             before(grammarAccess.getURDFAttrSignedNumericRule()); 
            pushFollow(FOLLOW_1);
            ruleURDFAttrSignedNumeric();

            state._fsp--;

             after(grammarAccess.getURDFAttrSignedNumericRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleURDFAttrSignedNumeric"


    // $ANTLR start "ruleURDFAttrSignedNumeric"
    // InternalMyDsl.g:837:1: ruleURDFAttrSignedNumeric : ( ( rule__URDFAttrSignedNumeric__ValueAssignment ) ) ;
    public final void ruleURDFAttrSignedNumeric() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:841:2: ( ( ( rule__URDFAttrSignedNumeric__ValueAssignment ) ) )
            // InternalMyDsl.g:842:2: ( ( rule__URDFAttrSignedNumeric__ValueAssignment ) )
            {
            // InternalMyDsl.g:842:2: ( ( rule__URDFAttrSignedNumeric__ValueAssignment ) )
            // InternalMyDsl.g:843:3: ( rule__URDFAttrSignedNumeric__ValueAssignment )
            {
             before(grammarAccess.getURDFAttrSignedNumericAccess().getValueAssignment()); 
            // InternalMyDsl.g:844:3: ( rule__URDFAttrSignedNumeric__ValueAssignment )
            // InternalMyDsl.g:844:4: rule__URDFAttrSignedNumeric__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__URDFAttrSignedNumeric__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getURDFAttrSignedNumericAccess().getValueAssignment()); 

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
    // $ANTLR end "ruleURDFAttrSignedNumeric"


    // $ANTLR start "entryRuleURDFAttrFloat"
    // InternalMyDsl.g:853:1: entryRuleURDFAttrFloat : ruleURDFAttrFloat EOF ;
    public final void entryRuleURDFAttrFloat() throws RecognitionException {
        try {
            // InternalMyDsl.g:854:1: ( ruleURDFAttrFloat EOF )
            // InternalMyDsl.g:855:1: ruleURDFAttrFloat EOF
            {
             before(grammarAccess.getURDFAttrFloatRule()); 
            pushFollow(FOLLOW_1);
            ruleURDFAttrFloat();

            state._fsp--;

             after(grammarAccess.getURDFAttrFloatRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleURDFAttrFloat"


    // $ANTLR start "ruleURDFAttrFloat"
    // InternalMyDsl.g:862:1: ruleURDFAttrFloat : ( ( rule__URDFAttrFloat__ValueAssignment ) ) ;
    public final void ruleURDFAttrFloat() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:866:2: ( ( ( rule__URDFAttrFloat__ValueAssignment ) ) )
            // InternalMyDsl.g:867:2: ( ( rule__URDFAttrFloat__ValueAssignment ) )
            {
            // InternalMyDsl.g:867:2: ( ( rule__URDFAttrFloat__ValueAssignment ) )
            // InternalMyDsl.g:868:3: ( rule__URDFAttrFloat__ValueAssignment )
            {
             before(grammarAccess.getURDFAttrFloatAccess().getValueAssignment()); 
            // InternalMyDsl.g:869:3: ( rule__URDFAttrFloat__ValueAssignment )
            // InternalMyDsl.g:869:4: rule__URDFAttrFloat__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__URDFAttrFloat__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getURDFAttrFloatAccess().getValueAssignment()); 

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
    // $ANTLR end "ruleURDFAttrFloat"


    // $ANTLR start "entryRuleURDFAttrINT"
    // InternalMyDsl.g:878:1: entryRuleURDFAttrINT : ruleURDFAttrINT EOF ;
    public final void entryRuleURDFAttrINT() throws RecognitionException {
        try {
            // InternalMyDsl.g:879:1: ( ruleURDFAttrINT EOF )
            // InternalMyDsl.g:880:1: ruleURDFAttrINT EOF
            {
             before(grammarAccess.getURDFAttrINTRule()); 
            pushFollow(FOLLOW_1);
            ruleURDFAttrINT();

            state._fsp--;

             after(grammarAccess.getURDFAttrINTRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleURDFAttrINT"


    // $ANTLR start "ruleURDFAttrINT"
    // InternalMyDsl.g:887:1: ruleURDFAttrINT : ( ( rule__URDFAttrINT__ValueAssignment ) ) ;
    public final void ruleURDFAttrINT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:891:2: ( ( ( rule__URDFAttrINT__ValueAssignment ) ) )
            // InternalMyDsl.g:892:2: ( ( rule__URDFAttrINT__ValueAssignment ) )
            {
            // InternalMyDsl.g:892:2: ( ( rule__URDFAttrINT__ValueAssignment ) )
            // InternalMyDsl.g:893:3: ( rule__URDFAttrINT__ValueAssignment )
            {
             before(grammarAccess.getURDFAttrINTAccess().getValueAssignment()); 
            // InternalMyDsl.g:894:3: ( rule__URDFAttrINT__ValueAssignment )
            // InternalMyDsl.g:894:4: rule__URDFAttrINT__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__URDFAttrINT__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getURDFAttrINTAccess().getValueAssignment()); 

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
    // $ANTLR end "ruleURDFAttrINT"


    // $ANTLR start "entryRuleURDFAttrNumeric"
    // InternalMyDsl.g:903:1: entryRuleURDFAttrNumeric : ruleURDFAttrNumeric EOF ;
    public final void entryRuleURDFAttrNumeric() throws RecognitionException {
        try {
            // InternalMyDsl.g:904:1: ( ruleURDFAttrNumeric EOF )
            // InternalMyDsl.g:905:1: ruleURDFAttrNumeric EOF
            {
             before(grammarAccess.getURDFAttrNumericRule()); 
            pushFollow(FOLLOW_1);
            ruleURDFAttrNumeric();

            state._fsp--;

             after(grammarAccess.getURDFAttrNumericRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleURDFAttrNumeric"


    // $ANTLR start "ruleURDFAttrNumeric"
    // InternalMyDsl.g:912:1: ruleURDFAttrNumeric : ( ( rule__URDFAttrNumeric__ValueAssignment ) ) ;
    public final void ruleURDFAttrNumeric() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:916:2: ( ( ( rule__URDFAttrNumeric__ValueAssignment ) ) )
            // InternalMyDsl.g:917:2: ( ( rule__URDFAttrNumeric__ValueAssignment ) )
            {
            // InternalMyDsl.g:917:2: ( ( rule__URDFAttrNumeric__ValueAssignment ) )
            // InternalMyDsl.g:918:3: ( rule__URDFAttrNumeric__ValueAssignment )
            {
             before(grammarAccess.getURDFAttrNumericAccess().getValueAssignment()); 
            // InternalMyDsl.g:919:3: ( rule__URDFAttrNumeric__ValueAssignment )
            // InternalMyDsl.g:919:4: rule__URDFAttrNumeric__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__URDFAttrNumeric__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getURDFAttrNumericAccess().getValueAssignment()); 

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
    // $ANTLR end "ruleURDFAttrNumeric"


    // $ANTLR start "entryRuleURDFAttrSTRING"
    // InternalMyDsl.g:928:1: entryRuleURDFAttrSTRING : ruleURDFAttrSTRING EOF ;
    public final void entryRuleURDFAttrSTRING() throws RecognitionException {
        try {
            // InternalMyDsl.g:929:1: ( ruleURDFAttrSTRING EOF )
            // InternalMyDsl.g:930:1: ruleURDFAttrSTRING EOF
            {
             before(grammarAccess.getURDFAttrSTRINGRule()); 
            pushFollow(FOLLOW_1);
            ruleURDFAttrSTRING();

            state._fsp--;

             after(grammarAccess.getURDFAttrSTRINGRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleURDFAttrSTRING"


    // $ANTLR start "ruleURDFAttrSTRING"
    // InternalMyDsl.g:937:1: ruleURDFAttrSTRING : ( ( rule__URDFAttrSTRING__ValueAssignment ) ) ;
    public final void ruleURDFAttrSTRING() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:941:2: ( ( ( rule__URDFAttrSTRING__ValueAssignment ) ) )
            // InternalMyDsl.g:942:2: ( ( rule__URDFAttrSTRING__ValueAssignment ) )
            {
            // InternalMyDsl.g:942:2: ( ( rule__URDFAttrSTRING__ValueAssignment ) )
            // InternalMyDsl.g:943:3: ( rule__URDFAttrSTRING__ValueAssignment )
            {
             before(grammarAccess.getURDFAttrSTRINGAccess().getValueAssignment()); 
            // InternalMyDsl.g:944:3: ( rule__URDFAttrSTRING__ValueAssignment )
            // InternalMyDsl.g:944:4: rule__URDFAttrSTRING__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__URDFAttrSTRING__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getURDFAttrSTRINGAccess().getValueAssignment()); 

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
    // $ANTLR end "ruleURDFAttrSTRING"


    // $ANTLR start "entryRuleFLOAT"
    // InternalMyDsl.g:953:1: entryRuleFLOAT : ruleFLOAT EOF ;
    public final void entryRuleFLOAT() throws RecognitionException {
        try {
            // InternalMyDsl.g:954:1: ( ruleFLOAT EOF )
            // InternalMyDsl.g:955:1: ruleFLOAT EOF
            {
             before(grammarAccess.getFLOATRule()); 
            pushFollow(FOLLOW_1);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getFLOATRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFLOAT"


    // $ANTLR start "ruleFLOAT"
    // InternalMyDsl.g:962:1: ruleFLOAT : ( ( rule__FLOAT__Group__0 ) ) ;
    public final void ruleFLOAT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:966:2: ( ( ( rule__FLOAT__Group__0 ) ) )
            // InternalMyDsl.g:967:2: ( ( rule__FLOAT__Group__0 ) )
            {
            // InternalMyDsl.g:967:2: ( ( rule__FLOAT__Group__0 ) )
            // InternalMyDsl.g:968:3: ( rule__FLOAT__Group__0 )
            {
             before(grammarAccess.getFLOATAccess().getGroup()); 
            // InternalMyDsl.g:969:3: ( rule__FLOAT__Group__0 )
            // InternalMyDsl.g:969:4: rule__FLOAT__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FLOAT__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFLOATAccess().getGroup()); 

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
    // $ANTLR end "ruleFLOAT"


    // $ANTLR start "entryRuleSCIENTIFIC"
    // InternalMyDsl.g:978:1: entryRuleSCIENTIFIC : ruleSCIENTIFIC EOF ;
    public final void entryRuleSCIENTIFIC() throws RecognitionException {
        try {
            // InternalMyDsl.g:979:1: ( ruleSCIENTIFIC EOF )
            // InternalMyDsl.g:980:1: ruleSCIENTIFIC EOF
            {
             before(grammarAccess.getSCIENTIFICRule()); 
            pushFollow(FOLLOW_1);
            ruleSCIENTIFIC();

            state._fsp--;

             after(grammarAccess.getSCIENTIFICRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSCIENTIFIC"


    // $ANTLR start "ruleSCIENTIFIC"
    // InternalMyDsl.g:987:1: ruleSCIENTIFIC : ( ( rule__SCIENTIFIC__Group__0 ) ) ;
    public final void ruleSCIENTIFIC() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:991:2: ( ( ( rule__SCIENTIFIC__Group__0 ) ) )
            // InternalMyDsl.g:992:2: ( ( rule__SCIENTIFIC__Group__0 ) )
            {
            // InternalMyDsl.g:992:2: ( ( rule__SCIENTIFIC__Group__0 ) )
            // InternalMyDsl.g:993:3: ( rule__SCIENTIFIC__Group__0 )
            {
             before(grammarAccess.getSCIENTIFICAccess().getGroup()); 
            // InternalMyDsl.g:994:3: ( rule__SCIENTIFIC__Group__0 )
            // InternalMyDsl.g:994:4: rule__SCIENTIFIC__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SCIENTIFIC__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSCIENTIFICAccess().getGroup()); 

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
    // $ANTLR end "ruleSCIENTIFIC"


    // $ANTLR start "entryRuleSIGNED_NUMERIC"
    // InternalMyDsl.g:1003:1: entryRuleSIGNED_NUMERIC : ruleSIGNED_NUMERIC EOF ;
    public final void entryRuleSIGNED_NUMERIC() throws RecognitionException {
        try {
            // InternalMyDsl.g:1004:1: ( ruleSIGNED_NUMERIC EOF )
            // InternalMyDsl.g:1005:1: ruleSIGNED_NUMERIC EOF
            {
             before(grammarAccess.getSIGNED_NUMERICRule()); 
            pushFollow(FOLLOW_1);
            ruleSIGNED_NUMERIC();

            state._fsp--;

             after(grammarAccess.getSIGNED_NUMERICRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSIGNED_NUMERIC"


    // $ANTLR start "ruleSIGNED_NUMERIC"
    // InternalMyDsl.g:1012:1: ruleSIGNED_NUMERIC : ( ( rule__SIGNED_NUMERIC__Group__0 ) ) ;
    public final void ruleSIGNED_NUMERIC() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1016:2: ( ( ( rule__SIGNED_NUMERIC__Group__0 ) ) )
            // InternalMyDsl.g:1017:2: ( ( rule__SIGNED_NUMERIC__Group__0 ) )
            {
            // InternalMyDsl.g:1017:2: ( ( rule__SIGNED_NUMERIC__Group__0 ) )
            // InternalMyDsl.g:1018:3: ( rule__SIGNED_NUMERIC__Group__0 )
            {
             before(grammarAccess.getSIGNED_NUMERICAccess().getGroup()); 
            // InternalMyDsl.g:1019:3: ( rule__SIGNED_NUMERIC__Group__0 )
            // InternalMyDsl.g:1019:4: rule__SIGNED_NUMERIC__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SIGNED_NUMERIC__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSIGNED_NUMERICAccess().getGroup()); 

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
    // $ANTLR end "ruleSIGNED_NUMERIC"


    // $ANTLR start "entryRuleNUMERIC"
    // InternalMyDsl.g:1028:1: entryRuleNUMERIC : ruleNUMERIC EOF ;
    public final void entryRuleNUMERIC() throws RecognitionException {
        try {
            // InternalMyDsl.g:1029:1: ( ruleNUMERIC EOF )
            // InternalMyDsl.g:1030:1: ruleNUMERIC EOF
            {
             before(grammarAccess.getNUMERICRule()); 
            pushFollow(FOLLOW_1);
            ruleNUMERIC();

            state._fsp--;

             after(grammarAccess.getNUMERICRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNUMERIC"


    // $ANTLR start "ruleNUMERIC"
    // InternalMyDsl.g:1037:1: ruleNUMERIC : ( ( rule__NUMERIC__Alternatives ) ) ;
    public final void ruleNUMERIC() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1041:2: ( ( ( rule__NUMERIC__Alternatives ) ) )
            // InternalMyDsl.g:1042:2: ( ( rule__NUMERIC__Alternatives ) )
            {
            // InternalMyDsl.g:1042:2: ( ( rule__NUMERIC__Alternatives ) )
            // InternalMyDsl.g:1043:3: ( rule__NUMERIC__Alternatives )
            {
             before(grammarAccess.getNUMERICAccess().getAlternatives()); 
            // InternalMyDsl.g:1044:3: ( rule__NUMERIC__Alternatives )
            // InternalMyDsl.g:1044:4: rule__NUMERIC__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NUMERIC__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNUMERICAccess().getAlternatives()); 

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
    // $ANTLR end "ruleNUMERIC"


    // $ANTLR start "ruleJointType"
    // InternalMyDsl.g:1053:1: ruleJointType : ( ( rule__JointType__Alternatives ) ) ;
    public final void ruleJointType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1057:1: ( ( ( rule__JointType__Alternatives ) ) )
            // InternalMyDsl.g:1058:2: ( ( rule__JointType__Alternatives ) )
            {
            // InternalMyDsl.g:1058:2: ( ( rule__JointType__Alternatives ) )
            // InternalMyDsl.g:1059:3: ( rule__JointType__Alternatives )
            {
             before(grammarAccess.getJointTypeAccess().getAlternatives()); 
            // InternalMyDsl.g:1060:3: ( rule__JointType__Alternatives )
            // InternalMyDsl.g:1060:4: rule__JointType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__JointType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getJointTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleJointType"


    // $ANTLR start "rule__Robot__Alternatives_2"
    // InternalMyDsl.g:1068:1: rule__Robot__Alternatives_2 : ( ( ( rule__Robot__Group_2_0__0 ) ) | ( ( rule__Robot__LinksAssignment_2_1 ) ) | ( ( rule__Robot__JointAssignment_2_2 ) ) | ( ( rule__Robot__AddtoAssignment_2_3 ) ) );
    public final void rule__Robot__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1072:1: ( ( ( rule__Robot__Group_2_0__0 ) ) | ( ( rule__Robot__LinksAssignment_2_1 ) ) | ( ( rule__Robot__JointAssignment_2_2 ) ) | ( ( rule__Robot__AddtoAssignment_2_3 ) ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt1=1;
                }
                break;
            case 19:
                {
                alt1=2;
                }
                break;
            case 65:
                {
                alt1=3;
                }
                break;
            case 22:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:1073:2: ( ( rule__Robot__Group_2_0__0 ) )
                    {
                    // InternalMyDsl.g:1073:2: ( ( rule__Robot__Group_2_0__0 ) )
                    // InternalMyDsl.g:1074:3: ( rule__Robot__Group_2_0__0 )
                    {
                     before(grammarAccess.getRobotAccess().getGroup_2_0()); 
                    // InternalMyDsl.g:1075:3: ( rule__Robot__Group_2_0__0 )
                    // InternalMyDsl.g:1075:4: rule__Robot__Group_2_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Robot__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRobotAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1079:2: ( ( rule__Robot__LinksAssignment_2_1 ) )
                    {
                    // InternalMyDsl.g:1079:2: ( ( rule__Robot__LinksAssignment_2_1 ) )
                    // InternalMyDsl.g:1080:3: ( rule__Robot__LinksAssignment_2_1 )
                    {
                     before(grammarAccess.getRobotAccess().getLinksAssignment_2_1()); 
                    // InternalMyDsl.g:1081:3: ( rule__Robot__LinksAssignment_2_1 )
                    // InternalMyDsl.g:1081:4: rule__Robot__LinksAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Robot__LinksAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getRobotAccess().getLinksAssignment_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1085:2: ( ( rule__Robot__JointAssignment_2_2 ) )
                    {
                    // InternalMyDsl.g:1085:2: ( ( rule__Robot__JointAssignment_2_2 ) )
                    // InternalMyDsl.g:1086:3: ( rule__Robot__JointAssignment_2_2 )
                    {
                     before(grammarAccess.getRobotAccess().getJointAssignment_2_2()); 
                    // InternalMyDsl.g:1087:3: ( rule__Robot__JointAssignment_2_2 )
                    // InternalMyDsl.g:1087:4: rule__Robot__JointAssignment_2_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Robot__JointAssignment_2_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getRobotAccess().getJointAssignment_2_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1091:2: ( ( rule__Robot__AddtoAssignment_2_3 ) )
                    {
                    // InternalMyDsl.g:1091:2: ( ( rule__Robot__AddtoAssignment_2_3 ) )
                    // InternalMyDsl.g:1092:3: ( rule__Robot__AddtoAssignment_2_3 )
                    {
                     before(grammarAccess.getRobotAccess().getAddtoAssignment_2_3()); 
                    // InternalMyDsl.g:1093:3: ( rule__Robot__AddtoAssignment_2_3 )
                    // InternalMyDsl.g:1093:4: rule__Robot__AddtoAssignment_2_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Robot__AddtoAssignment_2_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getRobotAccess().getAddtoAssignment_2_3()); 

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
    // $ANTLR end "rule__Robot__Alternatives_2"


    // $ANTLR start "rule__JointRef__Alternatives"
    // InternalMyDsl.g:1101:1: rule__JointRef__Alternatives : ( ( ( rule__JointRef__FixAssignment_0 ) ) | ( ( rule__JointRef__RevAssignment_1 ) ) | ( ( rule__JointRef__PrisAssignment_2 ) ) | ( ( rule__JointRef__ContAssignment_3 ) ) );
    public final void rule__JointRef__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1105:1: ( ( ( rule__JointRef__FixAssignment_0 ) ) | ( ( rule__JointRef__RevAssignment_1 ) ) | ( ( rule__JointRef__PrisAssignment_2 ) ) | ( ( rule__JointRef__ContAssignment_3 ) ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 87:
                {
                alt2=1;
                }
                break;
            case 88:
                {
                alt2=2;
                }
                break;
            case 89:
                {
                alt2=3;
                }
                break;
            case 90:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:1106:2: ( ( rule__JointRef__FixAssignment_0 ) )
                    {
                    // InternalMyDsl.g:1106:2: ( ( rule__JointRef__FixAssignment_0 ) )
                    // InternalMyDsl.g:1107:3: ( rule__JointRef__FixAssignment_0 )
                    {
                     before(grammarAccess.getJointRefAccess().getFixAssignment_0()); 
                    // InternalMyDsl.g:1108:3: ( rule__JointRef__FixAssignment_0 )
                    // InternalMyDsl.g:1108:4: rule__JointRef__FixAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__JointRef__FixAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getJointRefAccess().getFixAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1112:2: ( ( rule__JointRef__RevAssignment_1 ) )
                    {
                    // InternalMyDsl.g:1112:2: ( ( rule__JointRef__RevAssignment_1 ) )
                    // InternalMyDsl.g:1113:3: ( rule__JointRef__RevAssignment_1 )
                    {
                     before(grammarAccess.getJointRefAccess().getRevAssignment_1()); 
                    // InternalMyDsl.g:1114:3: ( rule__JointRef__RevAssignment_1 )
                    // InternalMyDsl.g:1114:4: rule__JointRef__RevAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__JointRef__RevAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getJointRefAccess().getRevAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1118:2: ( ( rule__JointRef__PrisAssignment_2 ) )
                    {
                    // InternalMyDsl.g:1118:2: ( ( rule__JointRef__PrisAssignment_2 ) )
                    // InternalMyDsl.g:1119:3: ( rule__JointRef__PrisAssignment_2 )
                    {
                     before(grammarAccess.getJointRefAccess().getPrisAssignment_2()); 
                    // InternalMyDsl.g:1120:3: ( rule__JointRef__PrisAssignment_2 )
                    // InternalMyDsl.g:1120:4: rule__JointRef__PrisAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__JointRef__PrisAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getJointRefAccess().getPrisAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1124:2: ( ( rule__JointRef__ContAssignment_3 ) )
                    {
                    // InternalMyDsl.g:1124:2: ( ( rule__JointRef__ContAssignment_3 ) )
                    // InternalMyDsl.g:1125:3: ( rule__JointRef__ContAssignment_3 )
                    {
                     before(grammarAccess.getJointRefAccess().getContAssignment_3()); 
                    // InternalMyDsl.g:1126:3: ( rule__JointRef__ContAssignment_3 )
                    // InternalMyDsl.g:1126:4: rule__JointRef__ContAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__JointRef__ContAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getJointRefAccess().getContAssignment_3()); 

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
    // $ANTLR end "rule__JointRef__Alternatives"


    // $ANTLR start "rule__ReUseAble__Alternatives"
    // InternalMyDsl.g:1134:1: rule__ReUseAble__Alternatives : ( ( ruleLink ) | ( ruleVisual ) | ( ruleInertial ) | ( ruleCollision ) );
    public final void rule__ReUseAble__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1138:1: ( ( ruleLink ) | ( ruleVisual ) | ( ruleInertial ) | ( ruleCollision ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt3=1;
                }
                break;
            case 37:
                {
                alt3=2;
                }
                break;
            case 29:
                {
                alt3=3;
                }
                break;
            case 49:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:1139:2: ( ruleLink )
                    {
                    // InternalMyDsl.g:1139:2: ( ruleLink )
                    // InternalMyDsl.g:1140:3: ruleLink
                    {
                     before(grammarAccess.getReUseAbleAccess().getLinkParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleLink();

                    state._fsp--;

                     after(grammarAccess.getReUseAbleAccess().getLinkParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1145:2: ( ruleVisual )
                    {
                    // InternalMyDsl.g:1145:2: ( ruleVisual )
                    // InternalMyDsl.g:1146:3: ruleVisual
                    {
                     before(grammarAccess.getReUseAbleAccess().getVisualParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleVisual();

                    state._fsp--;

                     after(grammarAccess.getReUseAbleAccess().getVisualParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1151:2: ( ruleInertial )
                    {
                    // InternalMyDsl.g:1151:2: ( ruleInertial )
                    // InternalMyDsl.g:1152:3: ruleInertial
                    {
                     before(grammarAccess.getReUseAbleAccess().getInertialParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleInertial();

                    state._fsp--;

                     after(grammarAccess.getReUseAbleAccess().getInertialParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1157:2: ( ruleCollision )
                    {
                    // InternalMyDsl.g:1157:2: ( ruleCollision )
                    // InternalMyDsl.g:1158:3: ruleCollision
                    {
                     before(grammarAccess.getReUseAbleAccess().getCollisionParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleCollision();

                    state._fsp--;

                     after(grammarAccess.getReUseAbleAccess().getCollisionParserRuleCall_3()); 

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
    // $ANTLR end "rule__ReUseAble__Alternatives"


    // $ANTLR start "rule__ReUseAbleReduced__Alternatives"
    // InternalMyDsl.g:1167:1: rule__ReUseAbleReduced__Alternatives : ( ( ruleVisual ) | ( ruleInertial ) | ( ruleCollision ) );
    public final void rule__ReUseAbleReduced__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1171:1: ( ( ruleVisual ) | ( ruleInertial ) | ( ruleCollision ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt4=1;
                }
                break;
            case 29:
                {
                alt4=2;
                }
                break;
            case 49:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:1172:2: ( ruleVisual )
                    {
                    // InternalMyDsl.g:1172:2: ( ruleVisual )
                    // InternalMyDsl.g:1173:3: ruleVisual
                    {
                     before(grammarAccess.getReUseAbleReducedAccess().getVisualParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleVisual();

                    state._fsp--;

                     after(grammarAccess.getReUseAbleReducedAccess().getVisualParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1178:2: ( ruleInertial )
                    {
                    // InternalMyDsl.g:1178:2: ( ruleInertial )
                    // InternalMyDsl.g:1179:3: ruleInertial
                    {
                     before(grammarAccess.getReUseAbleReducedAccess().getInertialParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleInertial();

                    state._fsp--;

                     after(grammarAccess.getReUseAbleReducedAccess().getInertialParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1184:2: ( ruleCollision )
                    {
                    // InternalMyDsl.g:1184:2: ( ruleCollision )
                    // InternalMyDsl.g:1185:3: ruleCollision
                    {
                     before(grammarAccess.getReUseAbleReducedAccess().getCollisionParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleCollision();

                    state._fsp--;

                     after(grammarAccess.getReUseAbleReducedAccess().getCollisionParserRuleCall_2()); 

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
    // $ANTLR end "rule__ReUseAbleReduced__Alternatives"


    // $ANTLR start "rule__Link__Alternatives_3"
    // InternalMyDsl.g:1194:1: rule__Link__Alternatives_3 : ( ( ( rule__Link__Group_3_0__0 ) ) | ( ( rule__Link__Group_3_1__0 ) ) );
    public final void rule__Link__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1198:1: ( ( ( rule__Link__Group_3_0__0 ) ) | ( ( rule__Link__Group_3_1__0 ) ) )
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
                    // InternalMyDsl.g:1199:2: ( ( rule__Link__Group_3_0__0 ) )
                    {
                    // InternalMyDsl.g:1199:2: ( ( rule__Link__Group_3_0__0 ) )
                    // InternalMyDsl.g:1200:3: ( rule__Link__Group_3_0__0 )
                    {
                     before(grammarAccess.getLinkAccess().getGroup_3_0()); 
                    // InternalMyDsl.g:1201:3: ( rule__Link__Group_3_0__0 )
                    // InternalMyDsl.g:1201:4: rule__Link__Group_3_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Link__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLinkAccess().getGroup_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1205:2: ( ( rule__Link__Group_3_1__0 ) )
                    {
                    // InternalMyDsl.g:1205:2: ( ( rule__Link__Group_3_1__0 ) )
                    // InternalMyDsl.g:1206:3: ( rule__Link__Group_3_1__0 )
                    {
                     before(grammarAccess.getLinkAccess().getGroup_3_1()); 
                    // InternalMyDsl.g:1207:3: ( rule__Link__Group_3_1__0 )
                    // InternalMyDsl.g:1207:4: rule__Link__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Link__Group_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLinkAccess().getGroup_3_1()); 

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
    // $ANTLR end "rule__Link__Alternatives_3"


    // $ANTLR start "rule__Link__Alternatives_3_0_1"
    // InternalMyDsl.g:1215:1: rule__Link__Alternatives_3_0_1 : ( ( ( rule__Link__InertialAssignment_3_0_1_0 ) ) | ( ( rule__Link__VisualAssignment_3_0_1_1 ) ) | ( ( rule__Link__CollisionAssignment_3_0_1_2 ) ) );
    public final void rule__Link__Alternatives_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1219:1: ( ( ( rule__Link__InertialAssignment_3_0_1_0 ) ) | ( ( rule__Link__VisualAssignment_3_0_1_1 ) ) | ( ( rule__Link__CollisionAssignment_3_0_1_2 ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt6=1;
                }
                break;
            case 37:
                {
                alt6=2;
                }
                break;
            case 49:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:1220:2: ( ( rule__Link__InertialAssignment_3_0_1_0 ) )
                    {
                    // InternalMyDsl.g:1220:2: ( ( rule__Link__InertialAssignment_3_0_1_0 ) )
                    // InternalMyDsl.g:1221:3: ( rule__Link__InertialAssignment_3_0_1_0 )
                    {
                     before(grammarAccess.getLinkAccess().getInertialAssignment_3_0_1_0()); 
                    // InternalMyDsl.g:1222:3: ( rule__Link__InertialAssignment_3_0_1_0 )
                    // InternalMyDsl.g:1222:4: rule__Link__InertialAssignment_3_0_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Link__InertialAssignment_3_0_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLinkAccess().getInertialAssignment_3_0_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1226:2: ( ( rule__Link__VisualAssignment_3_0_1_1 ) )
                    {
                    // InternalMyDsl.g:1226:2: ( ( rule__Link__VisualAssignment_3_0_1_1 ) )
                    // InternalMyDsl.g:1227:3: ( rule__Link__VisualAssignment_3_0_1_1 )
                    {
                     before(grammarAccess.getLinkAccess().getVisualAssignment_3_0_1_1()); 
                    // InternalMyDsl.g:1228:3: ( rule__Link__VisualAssignment_3_0_1_1 )
                    // InternalMyDsl.g:1228:4: rule__Link__VisualAssignment_3_0_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Link__VisualAssignment_3_0_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getLinkAccess().getVisualAssignment_3_0_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1232:2: ( ( rule__Link__CollisionAssignment_3_0_1_2 ) )
                    {
                    // InternalMyDsl.g:1232:2: ( ( rule__Link__CollisionAssignment_3_0_1_2 ) )
                    // InternalMyDsl.g:1233:3: ( rule__Link__CollisionAssignment_3_0_1_2 )
                    {
                     before(grammarAccess.getLinkAccess().getCollisionAssignment_3_0_1_2()); 
                    // InternalMyDsl.g:1234:3: ( rule__Link__CollisionAssignment_3_0_1_2 )
                    // InternalMyDsl.g:1234:4: rule__Link__CollisionAssignment_3_0_1_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Link__CollisionAssignment_3_0_1_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getLinkAccess().getCollisionAssignment_3_0_1_2()); 

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
    // $ANTLR end "rule__Link__Alternatives_3_0_1"


    // $ANTLR start "rule__AddTo__Alternatives"
    // InternalMyDsl.g:1242:1: rule__AddTo__Alternatives : ( ( ( rule__AddTo__Group_0__0 ) ) | ( ( rule__AddTo__Group_1__0 ) ) );
    public final void rule__AddTo__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1246:1: ( ( ( rule__AddTo__Group_0__0 ) ) | ( ( rule__AddTo__Group_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==24) ) {
                    alt7=2;
                }
                else if ( (LA7_1==23) ) {
                    alt7=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:1247:2: ( ( rule__AddTo__Group_0__0 ) )
                    {
                    // InternalMyDsl.g:1247:2: ( ( rule__AddTo__Group_0__0 ) )
                    // InternalMyDsl.g:1248:3: ( rule__AddTo__Group_0__0 )
                    {
                     before(grammarAccess.getAddToAccess().getGroup_0()); 
                    // InternalMyDsl.g:1249:3: ( rule__AddTo__Group_0__0 )
                    // InternalMyDsl.g:1249:4: rule__AddTo__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AddTo__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAddToAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1253:2: ( ( rule__AddTo__Group_1__0 ) )
                    {
                    // InternalMyDsl.g:1253:2: ( ( rule__AddTo__Group_1__0 ) )
                    // InternalMyDsl.g:1254:3: ( rule__AddTo__Group_1__0 )
                    {
                     before(grammarAccess.getAddToAccess().getGroup_1()); 
                    // InternalMyDsl.g:1255:3: ( rule__AddTo__Group_1__0 )
                    // InternalMyDsl.g:1255:4: rule__AddTo__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AddTo__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAddToAccess().getGroup_1()); 

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
    // $ANTLR end "rule__AddTo__Alternatives"


    // $ANTLR start "rule__AddTo__Alternatives_0_1"
    // InternalMyDsl.g:1263:1: rule__AddTo__Alternatives_0_1 : ( ( ( rule__AddTo__InertialAssignment_0_1_0 ) ) | ( ( rule__AddTo__VisualAssignment_0_1_1 ) ) | ( ( rule__AddTo__CollisionAssignment_0_1_2 ) ) );
    public final void rule__AddTo__Alternatives_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1267:1: ( ( ( rule__AddTo__InertialAssignment_0_1_0 ) ) | ( ( rule__AddTo__VisualAssignment_0_1_1 ) ) | ( ( rule__AddTo__CollisionAssignment_0_1_2 ) ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt8=1;
                }
                break;
            case 37:
                {
                alt8=2;
                }
                break;
            case 49:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:1268:2: ( ( rule__AddTo__InertialAssignment_0_1_0 ) )
                    {
                    // InternalMyDsl.g:1268:2: ( ( rule__AddTo__InertialAssignment_0_1_0 ) )
                    // InternalMyDsl.g:1269:3: ( rule__AddTo__InertialAssignment_0_1_0 )
                    {
                     before(grammarAccess.getAddToAccess().getInertialAssignment_0_1_0()); 
                    // InternalMyDsl.g:1270:3: ( rule__AddTo__InertialAssignment_0_1_0 )
                    // InternalMyDsl.g:1270:4: rule__AddTo__InertialAssignment_0_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AddTo__InertialAssignment_0_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAddToAccess().getInertialAssignment_0_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1274:2: ( ( rule__AddTo__VisualAssignment_0_1_1 ) )
                    {
                    // InternalMyDsl.g:1274:2: ( ( rule__AddTo__VisualAssignment_0_1_1 ) )
                    // InternalMyDsl.g:1275:3: ( rule__AddTo__VisualAssignment_0_1_1 )
                    {
                     before(grammarAccess.getAddToAccess().getVisualAssignment_0_1_1()); 
                    // InternalMyDsl.g:1276:3: ( rule__AddTo__VisualAssignment_0_1_1 )
                    // InternalMyDsl.g:1276:4: rule__AddTo__VisualAssignment_0_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__AddTo__VisualAssignment_0_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getAddToAccess().getVisualAssignment_0_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1280:2: ( ( rule__AddTo__CollisionAssignment_0_1_2 ) )
                    {
                    // InternalMyDsl.g:1280:2: ( ( rule__AddTo__CollisionAssignment_0_1_2 ) )
                    // InternalMyDsl.g:1281:3: ( rule__AddTo__CollisionAssignment_0_1_2 )
                    {
                     before(grammarAccess.getAddToAccess().getCollisionAssignment_0_1_2()); 
                    // InternalMyDsl.g:1282:3: ( rule__AddTo__CollisionAssignment_0_1_2 )
                    // InternalMyDsl.g:1282:4: rule__AddTo__CollisionAssignment_0_1_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__AddTo__CollisionAssignment_0_1_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getAddToAccess().getCollisionAssignment_0_1_2()); 

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
    // $ANTLR end "rule__AddTo__Alternatives_0_1"


    // $ANTLR start "rule__Reuse__Alternatives"
    // InternalMyDsl.g:1290:1: rule__Reuse__Alternatives : ( ( ( rule__Reuse__Group_0__0 ) ) | ( ( rule__Reuse__Group_1__0 ) ) );
    public final void rule__Reuse__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1294:1: ( ( ( rule__Reuse__Group_0__0 ) ) | ( ( rule__Reuse__Group_1__0 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            else if ( (LA9_0==26) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:1295:2: ( ( rule__Reuse__Group_0__0 ) )
                    {
                    // InternalMyDsl.g:1295:2: ( ( rule__Reuse__Group_0__0 ) )
                    // InternalMyDsl.g:1296:3: ( rule__Reuse__Group_0__0 )
                    {
                     before(grammarAccess.getReuseAccess().getGroup_0()); 
                    // InternalMyDsl.g:1297:3: ( rule__Reuse__Group_0__0 )
                    // InternalMyDsl.g:1297:4: rule__Reuse__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Reuse__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getReuseAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1301:2: ( ( rule__Reuse__Group_1__0 ) )
                    {
                    // InternalMyDsl.g:1301:2: ( ( rule__Reuse__Group_1__0 ) )
                    // InternalMyDsl.g:1302:3: ( rule__Reuse__Group_1__0 )
                    {
                     before(grammarAccess.getReuseAccess().getGroup_1()); 
                    // InternalMyDsl.g:1303:3: ( rule__Reuse__Group_1__0 )
                    // InternalMyDsl.g:1303:4: rule__Reuse__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Reuse__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getReuseAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Reuse__Alternatives"


    // $ANTLR start "rule__Geometry__Alternatives"
    // InternalMyDsl.g:1311:1: rule__Geometry__Alternatives : ( ( ruleBox ) | ( ruleCylinder ) | ( ruleMesh ) | ( ruleSphere ) );
    public final void rule__Geometry__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1315:1: ( ( ruleBox ) | ( ruleCylinder ) | ( ruleMesh ) | ( ruleSphere ) )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt10=1;
                }
                break;
            case 54:
                {
                alt10=2;
                }
                break;
            case 56:
                {
                alt10=3;
                }
                break;
            case 58:
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:1316:2: ( ruleBox )
                    {
                    // InternalMyDsl.g:1316:2: ( ruleBox )
                    // InternalMyDsl.g:1317:3: ruleBox
                    {
                     before(grammarAccess.getGeometryAccess().getBoxParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleBox();

                    state._fsp--;

                     after(grammarAccess.getGeometryAccess().getBoxParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1322:2: ( ruleCylinder )
                    {
                    // InternalMyDsl.g:1322:2: ( ruleCylinder )
                    // InternalMyDsl.g:1323:3: ruleCylinder
                    {
                     before(grammarAccess.getGeometryAccess().getCylinderParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCylinder();

                    state._fsp--;

                     after(grammarAccess.getGeometryAccess().getCylinderParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1328:2: ( ruleMesh )
                    {
                    // InternalMyDsl.g:1328:2: ( ruleMesh )
                    // InternalMyDsl.g:1329:3: ruleMesh
                    {
                     before(grammarAccess.getGeometryAccess().getMeshParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleMesh();

                    state._fsp--;

                     after(grammarAccess.getGeometryAccess().getMeshParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1334:2: ( ruleSphere )
                    {
                    // InternalMyDsl.g:1334:2: ( ruleSphere )
                    // InternalMyDsl.g:1335:3: ruleSphere
                    {
                     before(grammarAccess.getGeometryAccess().getSphereParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleSphere();

                    state._fsp--;

                     after(grammarAccess.getGeometryAccess().getSphereParserRuleCall_3()); 

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
    // $ANTLR end "rule__Geometry__Alternatives"


    // $ANTLR start "rule__Material__Alternatives"
    // InternalMyDsl.g:1344:1: rule__Material__Alternatives : ( ( ruleTexture ) | ( ruleColor ) );
    public final void rule__Material__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1348:1: ( ( ruleTexture ) | ( ruleColor ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==59) ) {
                alt11=1;
            }
            else if ( (LA11_0==60) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:1349:2: ( ruleTexture )
                    {
                    // InternalMyDsl.g:1349:2: ( ruleTexture )
                    // InternalMyDsl.g:1350:3: ruleTexture
                    {
                     before(grammarAccess.getMaterialAccess().getTextureParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleTexture();

                    state._fsp--;

                     after(grammarAccess.getMaterialAccess().getTextureParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1355:2: ( ruleColor )
                    {
                    // InternalMyDsl.g:1355:2: ( ruleColor )
                    // InternalMyDsl.g:1356:3: ruleColor
                    {
                     before(grammarAccess.getMaterialAccess().getColorParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleColor();

                    state._fsp--;

                     after(grammarAccess.getMaterialAccess().getColorParserRuleCall_1()); 

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
    // $ANTLR end "rule__Material__Alternatives"


    // $ANTLR start "rule__Joint__Alternatives_2"
    // InternalMyDsl.g:1365:1: rule__Joint__Alternatives_2 : ( ( ( rule__Joint__Group_2_0__0 ) ) | ( ( rule__Joint__Group_2_1__0 ) ) );
    public final void rule__Joint__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1369:1: ( ( ( rule__Joint__Group_2_0__0 ) ) | ( ( rule__Joint__Group_2_1__0 ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==20) ) {
                alt12=1;
            }
            else if ( (LA12_0==21) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:1370:2: ( ( rule__Joint__Group_2_0__0 ) )
                    {
                    // InternalMyDsl.g:1370:2: ( ( rule__Joint__Group_2_0__0 ) )
                    // InternalMyDsl.g:1371:3: ( rule__Joint__Group_2_0__0 )
                    {
                     before(grammarAccess.getJointAccess().getGroup_2_0()); 
                    // InternalMyDsl.g:1372:3: ( rule__Joint__Group_2_0__0 )
                    // InternalMyDsl.g:1372:4: rule__Joint__Group_2_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Joint__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getJointAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1376:2: ( ( rule__Joint__Group_2_1__0 ) )
                    {
                    // InternalMyDsl.g:1376:2: ( ( rule__Joint__Group_2_1__0 ) )
                    // InternalMyDsl.g:1377:3: ( rule__Joint__Group_2_1__0 )
                    {
                     before(grammarAccess.getJointAccess().getGroup_2_1()); 
                    // InternalMyDsl.g:1378:3: ( rule__Joint__Group_2_1__0 )
                    // InternalMyDsl.g:1378:4: rule__Joint__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Joint__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getJointAccess().getGroup_2_1()); 

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
    // $ANTLR end "rule__Joint__Alternatives_2"


    // $ANTLR start "rule__Joint__Alternatives_2_0_1"
    // InternalMyDsl.g:1386:1: rule__Joint__Alternatives_2_0_1 : ( ( ( rule__Joint__OriginAssignment_2_0_1_0 ) ) | ( ( rule__Joint__AxisAssignment_2_0_1_1 ) ) | ( ( rule__Joint__LimitAssignment_2_0_1_2 ) ) | ( ( rule__Joint__CalibrationAssignment_2_0_1_3 ) ) | ( ( rule__Joint__DynamicsAssignment_2_0_1_4 ) ) | ( ( rule__Joint__SafetycontrollerAssignment_2_0_1_5 ) ) );
    public final void rule__Joint__Alternatives_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1390:1: ( ( ( rule__Joint__OriginAssignment_2_0_1_0 ) ) | ( ( rule__Joint__AxisAssignment_2_0_1_1 ) ) | ( ( rule__Joint__LimitAssignment_2_0_1_2 ) ) | ( ( rule__Joint__CalibrationAssignment_2_0_1_3 ) ) | ( ( rule__Joint__DynamicsAssignment_2_0_1_4 ) ) | ( ( rule__Joint__SafetycontrollerAssignment_2_0_1_5 ) ) )
            int alt13=6;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt13=1;
                }
                break;
            case 69:
                {
                alt13=2;
                }
                break;
            case 70:
                {
                alt13=3;
                }
                break;
            case 75:
                {
                alt13=4;
                }
                break;
            case 78:
                {
                alt13=5;
                }
                break;
            case 81:
                {
                alt13=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:1391:2: ( ( rule__Joint__OriginAssignment_2_0_1_0 ) )
                    {
                    // InternalMyDsl.g:1391:2: ( ( rule__Joint__OriginAssignment_2_0_1_0 ) )
                    // InternalMyDsl.g:1392:3: ( rule__Joint__OriginAssignment_2_0_1_0 )
                    {
                     before(grammarAccess.getJointAccess().getOriginAssignment_2_0_1_0()); 
                    // InternalMyDsl.g:1393:3: ( rule__Joint__OriginAssignment_2_0_1_0 )
                    // InternalMyDsl.g:1393:4: rule__Joint__OriginAssignment_2_0_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Joint__OriginAssignment_2_0_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getJointAccess().getOriginAssignment_2_0_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1397:2: ( ( rule__Joint__AxisAssignment_2_0_1_1 ) )
                    {
                    // InternalMyDsl.g:1397:2: ( ( rule__Joint__AxisAssignment_2_0_1_1 ) )
                    // InternalMyDsl.g:1398:3: ( rule__Joint__AxisAssignment_2_0_1_1 )
                    {
                     before(grammarAccess.getJointAccess().getAxisAssignment_2_0_1_1()); 
                    // InternalMyDsl.g:1399:3: ( rule__Joint__AxisAssignment_2_0_1_1 )
                    // InternalMyDsl.g:1399:4: rule__Joint__AxisAssignment_2_0_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Joint__AxisAssignment_2_0_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getJointAccess().getAxisAssignment_2_0_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1403:2: ( ( rule__Joint__LimitAssignment_2_0_1_2 ) )
                    {
                    // InternalMyDsl.g:1403:2: ( ( rule__Joint__LimitAssignment_2_0_1_2 ) )
                    // InternalMyDsl.g:1404:3: ( rule__Joint__LimitAssignment_2_0_1_2 )
                    {
                     before(grammarAccess.getJointAccess().getLimitAssignment_2_0_1_2()); 
                    // InternalMyDsl.g:1405:3: ( rule__Joint__LimitAssignment_2_0_1_2 )
                    // InternalMyDsl.g:1405:4: rule__Joint__LimitAssignment_2_0_1_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Joint__LimitAssignment_2_0_1_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getJointAccess().getLimitAssignment_2_0_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1409:2: ( ( rule__Joint__CalibrationAssignment_2_0_1_3 ) )
                    {
                    // InternalMyDsl.g:1409:2: ( ( rule__Joint__CalibrationAssignment_2_0_1_3 ) )
                    // InternalMyDsl.g:1410:3: ( rule__Joint__CalibrationAssignment_2_0_1_3 )
                    {
                     before(grammarAccess.getJointAccess().getCalibrationAssignment_2_0_1_3()); 
                    // InternalMyDsl.g:1411:3: ( rule__Joint__CalibrationAssignment_2_0_1_3 )
                    // InternalMyDsl.g:1411:4: rule__Joint__CalibrationAssignment_2_0_1_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Joint__CalibrationAssignment_2_0_1_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getJointAccess().getCalibrationAssignment_2_0_1_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:1415:2: ( ( rule__Joint__DynamicsAssignment_2_0_1_4 ) )
                    {
                    // InternalMyDsl.g:1415:2: ( ( rule__Joint__DynamicsAssignment_2_0_1_4 ) )
                    // InternalMyDsl.g:1416:3: ( rule__Joint__DynamicsAssignment_2_0_1_4 )
                    {
                     before(grammarAccess.getJointAccess().getDynamicsAssignment_2_0_1_4()); 
                    // InternalMyDsl.g:1417:3: ( rule__Joint__DynamicsAssignment_2_0_1_4 )
                    // InternalMyDsl.g:1417:4: rule__Joint__DynamicsAssignment_2_0_1_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Joint__DynamicsAssignment_2_0_1_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getJointAccess().getDynamicsAssignment_2_0_1_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:1421:2: ( ( rule__Joint__SafetycontrollerAssignment_2_0_1_5 ) )
                    {
                    // InternalMyDsl.g:1421:2: ( ( rule__Joint__SafetycontrollerAssignment_2_0_1_5 ) )
                    // InternalMyDsl.g:1422:3: ( rule__Joint__SafetycontrollerAssignment_2_0_1_5 )
                    {
                     before(grammarAccess.getJointAccess().getSafetycontrollerAssignment_2_0_1_5()); 
                    // InternalMyDsl.g:1423:3: ( rule__Joint__SafetycontrollerAssignment_2_0_1_5 )
                    // InternalMyDsl.g:1423:4: rule__Joint__SafetycontrollerAssignment_2_0_1_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Joint__SafetycontrollerAssignment_2_0_1_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getJointAccess().getSafetycontrollerAssignment_2_0_1_5()); 

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
    // $ANTLR end "rule__Joint__Alternatives_2_0_1"


    // $ANTLR start "rule__Limit__Alternatives_6"
    // InternalMyDsl.g:1431:1: rule__Limit__Alternatives_6 : ( ( ( rule__Limit__Group_6_0__0 ) ) | ( ( rule__Limit__Group_6_1__0 ) ) );
    public final void rule__Limit__Alternatives_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1435:1: ( ( ( rule__Limit__Group_6_0__0 ) ) | ( ( rule__Limit__Group_6_1__0 ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==73) ) {
                alt14=1;
            }
            else if ( (LA14_0==74) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:1436:2: ( ( rule__Limit__Group_6_0__0 ) )
                    {
                    // InternalMyDsl.g:1436:2: ( ( rule__Limit__Group_6_0__0 ) )
                    // InternalMyDsl.g:1437:3: ( rule__Limit__Group_6_0__0 )
                    {
                     before(grammarAccess.getLimitAccess().getGroup_6_0()); 
                    // InternalMyDsl.g:1438:3: ( rule__Limit__Group_6_0__0 )
                    // InternalMyDsl.g:1438:4: rule__Limit__Group_6_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Limit__Group_6_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLimitAccess().getGroup_6_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1442:2: ( ( rule__Limit__Group_6_1__0 ) )
                    {
                    // InternalMyDsl.g:1442:2: ( ( rule__Limit__Group_6_1__0 ) )
                    // InternalMyDsl.g:1443:3: ( rule__Limit__Group_6_1__0 )
                    {
                     before(grammarAccess.getLimitAccess().getGroup_6_1()); 
                    // InternalMyDsl.g:1444:3: ( rule__Limit__Group_6_1__0 )
                    // InternalMyDsl.g:1444:4: rule__Limit__Group_6_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Limit__Group_6_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLimitAccess().getGroup_6_1()); 

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
    // $ANTLR end "rule__Limit__Alternatives_6"


    // $ANTLR start "rule__Calibration__Alternatives_3"
    // InternalMyDsl.g:1452:1: rule__Calibration__Alternatives_3 : ( ( ( rule__Calibration__Group_3_0__0 ) ) | ( ( rule__Calibration__Group_3_1__0 ) ) );
    public final void rule__Calibration__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1456:1: ( ( ( rule__Calibration__Group_3_0__0 ) ) | ( ( rule__Calibration__Group_3_1__0 ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==76) ) {
                alt15=1;
            }
            else if ( (LA15_0==77) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:1457:2: ( ( rule__Calibration__Group_3_0__0 ) )
                    {
                    // InternalMyDsl.g:1457:2: ( ( rule__Calibration__Group_3_0__0 ) )
                    // InternalMyDsl.g:1458:3: ( rule__Calibration__Group_3_0__0 )
                    {
                     before(grammarAccess.getCalibrationAccess().getGroup_3_0()); 
                    // InternalMyDsl.g:1459:3: ( rule__Calibration__Group_3_0__0 )
                    // InternalMyDsl.g:1459:4: rule__Calibration__Group_3_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Calibration__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCalibrationAccess().getGroup_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1463:2: ( ( rule__Calibration__Group_3_1__0 ) )
                    {
                    // InternalMyDsl.g:1463:2: ( ( rule__Calibration__Group_3_1__0 ) )
                    // InternalMyDsl.g:1464:3: ( rule__Calibration__Group_3_1__0 )
                    {
                     before(grammarAccess.getCalibrationAccess().getGroup_3_1()); 
                    // InternalMyDsl.g:1465:3: ( rule__Calibration__Group_3_1__0 )
                    // InternalMyDsl.g:1465:4: rule__Calibration__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Calibration__Group_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCalibrationAccess().getGroup_3_1()); 

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
    // $ANTLR end "rule__Calibration__Alternatives_3"


    // $ANTLR start "rule__Dynamics__Alternatives_3"
    // InternalMyDsl.g:1473:1: rule__Dynamics__Alternatives_3 : ( ( ( rule__Dynamics__Group_3_0__0 ) ) | ( ( rule__Dynamics__Group_3_1__0 ) ) );
    public final void rule__Dynamics__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1477:1: ( ( ( rule__Dynamics__Group_3_0__0 ) ) | ( ( rule__Dynamics__Group_3_1__0 ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==79) ) {
                alt16=1;
            }
            else if ( (LA16_0==80) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:1478:2: ( ( rule__Dynamics__Group_3_0__0 ) )
                    {
                    // InternalMyDsl.g:1478:2: ( ( rule__Dynamics__Group_3_0__0 ) )
                    // InternalMyDsl.g:1479:3: ( rule__Dynamics__Group_3_0__0 )
                    {
                     before(grammarAccess.getDynamicsAccess().getGroup_3_0()); 
                    // InternalMyDsl.g:1480:3: ( rule__Dynamics__Group_3_0__0 )
                    // InternalMyDsl.g:1480:4: rule__Dynamics__Group_3_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Dynamics__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDynamicsAccess().getGroup_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1484:2: ( ( rule__Dynamics__Group_3_1__0 ) )
                    {
                    // InternalMyDsl.g:1484:2: ( ( rule__Dynamics__Group_3_1__0 ) )
                    // InternalMyDsl.g:1485:3: ( rule__Dynamics__Group_3_1__0 )
                    {
                     before(grammarAccess.getDynamicsAccess().getGroup_3_1()); 
                    // InternalMyDsl.g:1486:3: ( rule__Dynamics__Group_3_1__0 )
                    // InternalMyDsl.g:1486:4: rule__Dynamics__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Dynamics__Group_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDynamicsAccess().getGroup_3_1()); 

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
    // $ANTLR end "rule__Dynamics__Alternatives_3"


    // $ANTLR start "rule__SafetyController__Alternatives_4"
    // InternalMyDsl.g:1494:1: rule__SafetyController__Alternatives_4 : ( ( ( rule__SafetyController__Group_4_0__0 ) ) | ( ( rule__SafetyController__Group_4_1__0 ) ) | ( ( rule__SafetyController__Group_4_2__0 ) ) );
    public final void rule__SafetyController__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1498:1: ( ( ( rule__SafetyController__Group_4_0__0 ) ) | ( ( rule__SafetyController__Group_4_1__0 ) ) | ( ( rule__SafetyController__Group_4_2__0 ) ) )
            int alt17=3;
            switch ( input.LA(1) ) {
            case 83:
                {
                alt17=1;
                }
                break;
            case 84:
                {
                alt17=2;
                }
                break;
            case 85:
                {
                alt17=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:1499:2: ( ( rule__SafetyController__Group_4_0__0 ) )
                    {
                    // InternalMyDsl.g:1499:2: ( ( rule__SafetyController__Group_4_0__0 ) )
                    // InternalMyDsl.g:1500:3: ( rule__SafetyController__Group_4_0__0 )
                    {
                     before(grammarAccess.getSafetyControllerAccess().getGroup_4_0()); 
                    // InternalMyDsl.g:1501:3: ( rule__SafetyController__Group_4_0__0 )
                    // InternalMyDsl.g:1501:4: rule__SafetyController__Group_4_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SafetyController__Group_4_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSafetyControllerAccess().getGroup_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1505:2: ( ( rule__SafetyController__Group_4_1__0 ) )
                    {
                    // InternalMyDsl.g:1505:2: ( ( rule__SafetyController__Group_4_1__0 ) )
                    // InternalMyDsl.g:1506:3: ( rule__SafetyController__Group_4_1__0 )
                    {
                     before(grammarAccess.getSafetyControllerAccess().getGroup_4_1()); 
                    // InternalMyDsl.g:1507:3: ( rule__SafetyController__Group_4_1__0 )
                    // InternalMyDsl.g:1507:4: rule__SafetyController__Group_4_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SafetyController__Group_4_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSafetyControllerAccess().getGroup_4_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1511:2: ( ( rule__SafetyController__Group_4_2__0 ) )
                    {
                    // InternalMyDsl.g:1511:2: ( ( rule__SafetyController__Group_4_2__0 ) )
                    // InternalMyDsl.g:1512:3: ( rule__SafetyController__Group_4_2__0 )
                    {
                     before(grammarAccess.getSafetyControllerAccess().getGroup_4_2()); 
                    // InternalMyDsl.g:1513:3: ( rule__SafetyController__Group_4_2__0 )
                    // InternalMyDsl.g:1513:4: rule__SafetyController__Group_4_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SafetyController__Group_4_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSafetyControllerAccess().getGroup_4_2()); 

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
    // $ANTLR end "rule__SafetyController__Alternatives_4"


    // $ANTLR start "rule__SCIENTIFIC__Alternatives_2"
    // InternalMyDsl.g:1521:1: rule__SCIENTIFIC__Alternatives_2 : ( ( '+' ) | ( '-' ) );
    public final void rule__SCIENTIFIC__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1525:1: ( ( '+' ) | ( '-' ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==11) ) {
                alt18=1;
            }
            else if ( (LA18_0==12) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalMyDsl.g:1526:2: ( '+' )
                    {
                    // InternalMyDsl.g:1526:2: ( '+' )
                    // InternalMyDsl.g:1527:3: '+'
                    {
                     before(grammarAccess.getSCIENTIFICAccess().getPlusSignKeyword_2_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getSCIENTIFICAccess().getPlusSignKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1532:2: ( '-' )
                    {
                    // InternalMyDsl.g:1532:2: ( '-' )
                    // InternalMyDsl.g:1533:3: '-'
                    {
                     before(grammarAccess.getSCIENTIFICAccess().getHyphenMinusKeyword_2_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getSCIENTIFICAccess().getHyphenMinusKeyword_2_1()); 

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
    // $ANTLR end "rule__SCIENTIFIC__Alternatives_2"


    // $ANTLR start "rule__SIGNED_NUMERIC__Alternatives_1"
    // InternalMyDsl.g:1542:1: rule__SIGNED_NUMERIC__Alternatives_1 : ( ( RULE_INT ) | ( ruleFLOAT ) | ( ruleSCIENTIFIC ) );
    public final void rule__SIGNED_NUMERIC__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1546:1: ( ( RULE_INT ) | ( ruleFLOAT ) | ( ruleSCIENTIFIC ) )
            int alt19=3;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_INT) ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==EOF||(LA19_1>=18 && LA19_1<=19)||LA19_1==22||LA19_1==29||(LA19_1>=32 && LA19_1<=37)||(LA19_1>=39 && LA19_1<=40)||(LA19_1>=42 && LA19_1<=47)||LA19_1==49||LA19_1==65||(LA19_1>=69 && LA19_1<=70)||(LA19_1>=72 && LA19_1<=75)||(LA19_1>=78 && LA19_1<=81)||(LA19_1>=83 && LA19_1<=85)) ) {
                    alt19=1;
                }
                else if ( (LA19_1==28) ) {
                    int LA19_3 = input.LA(3);

                    if ( (LA19_3==RULE_INT) ) {
                        int LA19_4 = input.LA(4);

                        if ( (LA19_4==EOF||(LA19_4>=18 && LA19_4<=19)||LA19_4==22||LA19_4==29||(LA19_4>=32 && LA19_4<=37)||(LA19_4>=39 && LA19_4<=40)||(LA19_4>=42 && LA19_4<=47)||LA19_4==49||LA19_4==65||(LA19_4>=69 && LA19_4<=70)||(LA19_4>=72 && LA19_4<=75)||(LA19_4>=78 && LA19_4<=81)||(LA19_4>=83 && LA19_4<=85)) ) {
                            alt19=2;
                        }
                        else if ( (LA19_4==86) ) {
                            alt19=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 19, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyDsl.g:1547:2: ( RULE_INT )
                    {
                    // InternalMyDsl.g:1547:2: ( RULE_INT )
                    // InternalMyDsl.g:1548:3: RULE_INT
                    {
                     before(grammarAccess.getSIGNED_NUMERICAccess().getINTTerminalRuleCall_1_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getSIGNED_NUMERICAccess().getINTTerminalRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1553:2: ( ruleFLOAT )
                    {
                    // InternalMyDsl.g:1553:2: ( ruleFLOAT )
                    // InternalMyDsl.g:1554:3: ruleFLOAT
                    {
                     before(grammarAccess.getSIGNED_NUMERICAccess().getFLOATParserRuleCall_1_1()); 
                    pushFollow(FOLLOW_2);
                    ruleFLOAT();

                    state._fsp--;

                     after(grammarAccess.getSIGNED_NUMERICAccess().getFLOATParserRuleCall_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1559:2: ( ruleSCIENTIFIC )
                    {
                    // InternalMyDsl.g:1559:2: ( ruleSCIENTIFIC )
                    // InternalMyDsl.g:1560:3: ruleSCIENTIFIC
                    {
                     before(grammarAccess.getSIGNED_NUMERICAccess().getSCIENTIFICParserRuleCall_1_2()); 
                    pushFollow(FOLLOW_2);
                    ruleSCIENTIFIC();

                    state._fsp--;

                     after(grammarAccess.getSIGNED_NUMERICAccess().getSCIENTIFICParserRuleCall_1_2()); 

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
    // $ANTLR end "rule__SIGNED_NUMERIC__Alternatives_1"


    // $ANTLR start "rule__NUMERIC__Alternatives"
    // InternalMyDsl.g:1569:1: rule__NUMERIC__Alternatives : ( ( RULE_INT ) | ( ruleFLOAT ) | ( ruleSCIENTIFIC ) );
    public final void rule__NUMERIC__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1573:1: ( ( RULE_INT ) | ( ruleFLOAT ) | ( ruleSCIENTIFIC ) )
            int alt20=3;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_INT) ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==28) ) {
                    int LA20_2 = input.LA(3);

                    if ( (LA20_2==RULE_INT) ) {
                        int LA20_4 = input.LA(4);

                        if ( (LA20_4==86) ) {
                            alt20=3;
                        }
                        else if ( (LA20_4==EOF||(LA20_4>=18 && LA20_4<=19)||LA20_4==22||LA20_4==29||LA20_4==37||(LA20_4>=39 && LA20_4<=40)||LA20_4==49||(LA20_4>=52 && LA20_4<=53)||LA20_4==65) ) {
                            alt20=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 20, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA20_1==EOF||(LA20_1>=18 && LA20_1<=19)||LA20_1==22||LA20_1==29||LA20_1==37||(LA20_1>=39 && LA20_1<=40)||LA20_1==49||(LA20_1>=52 && LA20_1<=53)||LA20_1==65) ) {
                    alt20=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalMyDsl.g:1574:2: ( RULE_INT )
                    {
                    // InternalMyDsl.g:1574:2: ( RULE_INT )
                    // InternalMyDsl.g:1575:3: RULE_INT
                    {
                     before(grammarAccess.getNUMERICAccess().getINTTerminalRuleCall_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getNUMERICAccess().getINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1580:2: ( ruleFLOAT )
                    {
                    // InternalMyDsl.g:1580:2: ( ruleFLOAT )
                    // InternalMyDsl.g:1581:3: ruleFLOAT
                    {
                     before(grammarAccess.getNUMERICAccess().getFLOATParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleFLOAT();

                    state._fsp--;

                     after(grammarAccess.getNUMERICAccess().getFLOATParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1586:2: ( ruleSCIENTIFIC )
                    {
                    // InternalMyDsl.g:1586:2: ( ruleSCIENTIFIC )
                    // InternalMyDsl.g:1587:3: ruleSCIENTIFIC
                    {
                     before(grammarAccess.getNUMERICAccess().getSCIENTIFICParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleSCIENTIFIC();

                    state._fsp--;

                     after(grammarAccess.getNUMERICAccess().getSCIENTIFICParserRuleCall_2()); 

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
    // $ANTLR end "rule__NUMERIC__Alternatives"


    // $ANTLR start "rule__JointType__Alternatives"
    // InternalMyDsl.g:1596:1: rule__JointType__Alternatives : ( ( ( 'fixed' ) ) | ( ( 'revolute' ) ) | ( ( 'prismatic' ) ) | ( ( 'continuous' ) ) );
    public final void rule__JointType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1600:1: ( ( ( 'fixed' ) ) | ( ( 'revolute' ) ) | ( ( 'prismatic' ) ) | ( ( 'continuous' ) ) )
            int alt21=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt21=1;
                }
                break;
            case 14:
                {
                alt21=2;
                }
                break;
            case 15:
                {
                alt21=3;
                }
                break;
            case 16:
                {
                alt21=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalMyDsl.g:1601:2: ( ( 'fixed' ) )
                    {
                    // InternalMyDsl.g:1601:2: ( ( 'fixed' ) )
                    // InternalMyDsl.g:1602:3: ( 'fixed' )
                    {
                     before(grammarAccess.getJointTypeAccess().getFixedEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:1603:3: ( 'fixed' )
                    // InternalMyDsl.g:1603:4: 'fixed'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getJointTypeAccess().getFixedEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1607:2: ( ( 'revolute' ) )
                    {
                    // InternalMyDsl.g:1607:2: ( ( 'revolute' ) )
                    // InternalMyDsl.g:1608:3: ( 'revolute' )
                    {
                     before(grammarAccess.getJointTypeAccess().getRevoluteEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:1609:3: ( 'revolute' )
                    // InternalMyDsl.g:1609:4: 'revolute'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getJointTypeAccess().getRevoluteEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1613:2: ( ( 'prismatic' ) )
                    {
                    // InternalMyDsl.g:1613:2: ( ( 'prismatic' ) )
                    // InternalMyDsl.g:1614:3: ( 'prismatic' )
                    {
                     before(grammarAccess.getJointTypeAccess().getPrismaticEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:1615:3: ( 'prismatic' )
                    // InternalMyDsl.g:1615:4: 'prismatic'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getJointTypeAccess().getPrismaticEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1619:2: ( ( 'continuous' ) )
                    {
                    // InternalMyDsl.g:1619:2: ( ( 'continuous' ) )
                    // InternalMyDsl.g:1620:3: ( 'continuous' )
                    {
                     before(grammarAccess.getJointTypeAccess().getContinuousEnumLiteralDeclaration_3()); 
                    // InternalMyDsl.g:1621:3: ( 'continuous' )
                    // InternalMyDsl.g:1621:4: 'continuous'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getJointTypeAccess().getContinuousEnumLiteralDeclaration_3()); 

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
    // $ANTLR end "rule__JointType__Alternatives"


    // $ANTLR start "rule__Robot__Group__0"
    // InternalMyDsl.g:1629:1: rule__Robot__Group__0 : rule__Robot__Group__0__Impl rule__Robot__Group__1 ;
    public final void rule__Robot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1633:1: ( rule__Robot__Group__0__Impl rule__Robot__Group__1 )
            // InternalMyDsl.g:1634:2: rule__Robot__Group__0__Impl rule__Robot__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Robot__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Robot__Group__1();

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
    // $ANTLR end "rule__Robot__Group__0"


    // $ANTLR start "rule__Robot__Group__0__Impl"
    // InternalMyDsl.g:1641:1: rule__Robot__Group__0__Impl : ( 'Robot' ) ;
    public final void rule__Robot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1645:1: ( ( 'Robot' ) )
            // InternalMyDsl.g:1646:1: ( 'Robot' )
            {
            // InternalMyDsl.g:1646:1: ( 'Robot' )
            // InternalMyDsl.g:1647:2: 'Robot'
            {
             before(grammarAccess.getRobotAccess().getRobotKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getRobotAccess().getRobotKeyword_0()); 

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
    // $ANTLR end "rule__Robot__Group__0__Impl"


    // $ANTLR start "rule__Robot__Group__1"
    // InternalMyDsl.g:1656:1: rule__Robot__Group__1 : rule__Robot__Group__1__Impl rule__Robot__Group__2 ;
    public final void rule__Robot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1660:1: ( rule__Robot__Group__1__Impl rule__Robot__Group__2 )
            // InternalMyDsl.g:1661:2: rule__Robot__Group__1__Impl rule__Robot__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Robot__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Robot__Group__2();

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
    // $ANTLR end "rule__Robot__Group__1"


    // $ANTLR start "rule__Robot__Group__1__Impl"
    // InternalMyDsl.g:1668:1: rule__Robot__Group__1__Impl : ( ( rule__Robot__NameAssignment_1 ) ) ;
    public final void rule__Robot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1672:1: ( ( ( rule__Robot__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1673:1: ( ( rule__Robot__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1673:1: ( ( rule__Robot__NameAssignment_1 ) )
            // InternalMyDsl.g:1674:2: ( rule__Robot__NameAssignment_1 )
            {
             before(grammarAccess.getRobotAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1675:2: ( rule__Robot__NameAssignment_1 )
            // InternalMyDsl.g:1675:3: rule__Robot__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Robot__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRobotAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Robot__Group__1__Impl"


    // $ANTLR start "rule__Robot__Group__2"
    // InternalMyDsl.g:1683:1: rule__Robot__Group__2 : rule__Robot__Group__2__Impl ;
    public final void rule__Robot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1687:1: ( rule__Robot__Group__2__Impl )
            // InternalMyDsl.g:1688:2: rule__Robot__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Robot__Group__2__Impl();

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
    // $ANTLR end "rule__Robot__Group__2"


    // $ANTLR start "rule__Robot__Group__2__Impl"
    // InternalMyDsl.g:1694:1: rule__Robot__Group__2__Impl : ( ( rule__Robot__Alternatives_2 )* ) ;
    public final void rule__Robot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1698:1: ( ( ( rule__Robot__Alternatives_2 )* ) )
            // InternalMyDsl.g:1699:1: ( ( rule__Robot__Alternatives_2 )* )
            {
            // InternalMyDsl.g:1699:1: ( ( rule__Robot__Alternatives_2 )* )
            // InternalMyDsl.g:1700:2: ( rule__Robot__Alternatives_2 )*
            {
             before(grammarAccess.getRobotAccess().getAlternatives_2()); 
            // InternalMyDsl.g:1701:2: ( rule__Robot__Alternatives_2 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=18 && LA22_0<=19)||LA22_0==22||LA22_0==65) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalMyDsl.g:1701:3: rule__Robot__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Robot__Alternatives_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getRobotAccess().getAlternatives_2()); 

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
    // $ANTLR end "rule__Robot__Group__2__Impl"


    // $ANTLR start "rule__Robot__Group_2_0__0"
    // InternalMyDsl.g:1710:1: rule__Robot__Group_2_0__0 : rule__Robot__Group_2_0__0__Impl rule__Robot__Group_2_0__1 ;
    public final void rule__Robot__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1714:1: ( rule__Robot__Group_2_0__0__Impl rule__Robot__Group_2_0__1 )
            // InternalMyDsl.g:1715:2: rule__Robot__Group_2_0__0__Impl rule__Robot__Group_2_0__1
            {
            pushFollow(FOLLOW_3);
            rule__Robot__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Robot__Group_2_0__1();

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
    // $ANTLR end "rule__Robot__Group_2_0__0"


    // $ANTLR start "rule__Robot__Group_2_0__0__Impl"
    // InternalMyDsl.g:1722:1: rule__Robot__Group_2_0__0__Impl : ( 'Topology' ) ;
    public final void rule__Robot__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1726:1: ( ( 'Topology' ) )
            // InternalMyDsl.g:1727:1: ( 'Topology' )
            {
            // InternalMyDsl.g:1727:1: ( 'Topology' )
            // InternalMyDsl.g:1728:2: 'Topology'
            {
             before(grammarAccess.getRobotAccess().getTopologyKeyword_2_0_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getRobotAccess().getTopologyKeyword_2_0_0()); 

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
    // $ANTLR end "rule__Robot__Group_2_0__0__Impl"


    // $ANTLR start "rule__Robot__Group_2_0__1"
    // InternalMyDsl.g:1737:1: rule__Robot__Group_2_0__1 : rule__Robot__Group_2_0__1__Impl ;
    public final void rule__Robot__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1741:1: ( rule__Robot__Group_2_0__1__Impl )
            // InternalMyDsl.g:1742:2: rule__Robot__Group_2_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Robot__Group_2_0__1__Impl();

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
    // $ANTLR end "rule__Robot__Group_2_0__1"


    // $ANTLR start "rule__Robot__Group_2_0__1__Impl"
    // InternalMyDsl.g:1748:1: rule__Robot__Group_2_0__1__Impl : ( ( rule__Robot__TopologiesAssignment_2_0_1 ) ) ;
    public final void rule__Robot__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1752:1: ( ( ( rule__Robot__TopologiesAssignment_2_0_1 ) ) )
            // InternalMyDsl.g:1753:1: ( ( rule__Robot__TopologiesAssignment_2_0_1 ) )
            {
            // InternalMyDsl.g:1753:1: ( ( rule__Robot__TopologiesAssignment_2_0_1 ) )
            // InternalMyDsl.g:1754:2: ( rule__Robot__TopologiesAssignment_2_0_1 )
            {
             before(grammarAccess.getRobotAccess().getTopologiesAssignment_2_0_1()); 
            // InternalMyDsl.g:1755:2: ( rule__Robot__TopologiesAssignment_2_0_1 )
            // InternalMyDsl.g:1755:3: rule__Robot__TopologiesAssignment_2_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Robot__TopologiesAssignment_2_0_1();

            state._fsp--;


            }

             after(grammarAccess.getRobotAccess().getTopologiesAssignment_2_0_1()); 

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
    // $ANTLR end "rule__Robot__Group_2_0__1__Impl"


    // $ANTLR start "rule__Topology__Group__0"
    // InternalMyDsl.g:1764:1: rule__Topology__Group__0 : rule__Topology__Group__0__Impl rule__Topology__Group__1 ;
    public final void rule__Topology__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1768:1: ( rule__Topology__Group__0__Impl rule__Topology__Group__1 )
            // InternalMyDsl.g:1769:2: rule__Topology__Group__0__Impl rule__Topology__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Topology__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Topology__Group__1();

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
    // $ANTLR end "rule__Topology__Group__0"


    // $ANTLR start "rule__Topology__Group__0__Impl"
    // InternalMyDsl.g:1776:1: rule__Topology__Group__0__Impl : ( ( rule__Topology__ParentAssignment_0 ) ) ;
    public final void rule__Topology__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1780:1: ( ( ( rule__Topology__ParentAssignment_0 ) ) )
            // InternalMyDsl.g:1781:1: ( ( rule__Topology__ParentAssignment_0 ) )
            {
            // InternalMyDsl.g:1781:1: ( ( rule__Topology__ParentAssignment_0 ) )
            // InternalMyDsl.g:1782:2: ( rule__Topology__ParentAssignment_0 )
            {
             before(grammarAccess.getTopologyAccess().getParentAssignment_0()); 
            // InternalMyDsl.g:1783:2: ( rule__Topology__ParentAssignment_0 )
            // InternalMyDsl.g:1783:3: rule__Topology__ParentAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Topology__ParentAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTopologyAccess().getParentAssignment_0()); 

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
    // $ANTLR end "rule__Topology__Group__0__Impl"


    // $ANTLR start "rule__Topology__Group__1"
    // InternalMyDsl.g:1791:1: rule__Topology__Group__1 : rule__Topology__Group__1__Impl ;
    public final void rule__Topology__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1795:1: ( rule__Topology__Group__1__Impl )
            // InternalMyDsl.g:1796:2: rule__Topology__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Topology__Group__1__Impl();

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
    // $ANTLR end "rule__Topology__Group__1"


    // $ANTLR start "rule__Topology__Group__1__Impl"
    // InternalMyDsl.g:1802:1: rule__Topology__Group__1__Impl : ( ( rule__Topology__Group_1__0 )? ) ;
    public final void rule__Topology__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1806:1: ( ( ( rule__Topology__Group_1__0 )? ) )
            // InternalMyDsl.g:1807:1: ( ( rule__Topology__Group_1__0 )? )
            {
            // InternalMyDsl.g:1807:1: ( ( rule__Topology__Group_1__0 )? )
            // InternalMyDsl.g:1808:2: ( rule__Topology__Group_1__0 )?
            {
             before(grammarAccess.getTopologyAccess().getGroup_1()); 
            // InternalMyDsl.g:1809:2: ( rule__Topology__Group_1__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=87 && LA23_0<=90)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMyDsl.g:1809:3: rule__Topology__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Topology__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTopologyAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Topology__Group__1__Impl"


    // $ANTLR start "rule__Topology__Group_1__0"
    // InternalMyDsl.g:1818:1: rule__Topology__Group_1__0 : rule__Topology__Group_1__0__Impl rule__Topology__Group_1__1 ;
    public final void rule__Topology__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1822:1: ( rule__Topology__Group_1__0__Impl rule__Topology__Group_1__1 )
            // InternalMyDsl.g:1823:2: rule__Topology__Group_1__0__Impl rule__Topology__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__Topology__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Topology__Group_1__1();

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
    // $ANTLR end "rule__Topology__Group_1__0"


    // $ANTLR start "rule__Topology__Group_1__0__Impl"
    // InternalMyDsl.g:1830:1: rule__Topology__Group_1__0__Impl : ( ( rule__Topology__JointAssignment_1_0 ) ) ;
    public final void rule__Topology__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1834:1: ( ( ( rule__Topology__JointAssignment_1_0 ) ) )
            // InternalMyDsl.g:1835:1: ( ( rule__Topology__JointAssignment_1_0 ) )
            {
            // InternalMyDsl.g:1835:1: ( ( rule__Topology__JointAssignment_1_0 ) )
            // InternalMyDsl.g:1836:2: ( rule__Topology__JointAssignment_1_0 )
            {
             before(grammarAccess.getTopologyAccess().getJointAssignment_1_0()); 
            // InternalMyDsl.g:1837:2: ( rule__Topology__JointAssignment_1_0 )
            // InternalMyDsl.g:1837:3: rule__Topology__JointAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Topology__JointAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getTopologyAccess().getJointAssignment_1_0()); 

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
    // $ANTLR end "rule__Topology__Group_1__0__Impl"


    // $ANTLR start "rule__Topology__Group_1__1"
    // InternalMyDsl.g:1845:1: rule__Topology__Group_1__1 : rule__Topology__Group_1__1__Impl ;
    public final void rule__Topology__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1849:1: ( rule__Topology__Group_1__1__Impl )
            // InternalMyDsl.g:1850:2: rule__Topology__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Topology__Group_1__1__Impl();

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
    // $ANTLR end "rule__Topology__Group_1__1"


    // $ANTLR start "rule__Topology__Group_1__1__Impl"
    // InternalMyDsl.g:1856:1: rule__Topology__Group_1__1__Impl : ( ( rule__Topology__ChildAssignment_1_1 ) ) ;
    public final void rule__Topology__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1860:1: ( ( ( rule__Topology__ChildAssignment_1_1 ) ) )
            // InternalMyDsl.g:1861:1: ( ( rule__Topology__ChildAssignment_1_1 ) )
            {
            // InternalMyDsl.g:1861:1: ( ( rule__Topology__ChildAssignment_1_1 ) )
            // InternalMyDsl.g:1862:2: ( rule__Topology__ChildAssignment_1_1 )
            {
             before(grammarAccess.getTopologyAccess().getChildAssignment_1_1()); 
            // InternalMyDsl.g:1863:2: ( rule__Topology__ChildAssignment_1_1 )
            // InternalMyDsl.g:1863:3: rule__Topology__ChildAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Topology__ChildAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTopologyAccess().getChildAssignment_1_1()); 

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
    // $ANTLR end "rule__Topology__Group_1__1__Impl"


    // $ANTLR start "rule__Link__Group__0"
    // InternalMyDsl.g:1872:1: rule__Link__Group__0 : rule__Link__Group__0__Impl rule__Link__Group__1 ;
    public final void rule__Link__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1876:1: ( rule__Link__Group__0__Impl rule__Link__Group__1 )
            // InternalMyDsl.g:1877:2: rule__Link__Group__0__Impl rule__Link__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Link__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__1();

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
    // $ANTLR end "rule__Link__Group__0"


    // $ANTLR start "rule__Link__Group__0__Impl"
    // InternalMyDsl.g:1884:1: rule__Link__Group__0__Impl : ( () ) ;
    public final void rule__Link__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1888:1: ( ( () ) )
            // InternalMyDsl.g:1889:1: ( () )
            {
            // InternalMyDsl.g:1889:1: ( () )
            // InternalMyDsl.g:1890:2: ()
            {
             before(grammarAccess.getLinkAccess().getLinkAction_0()); 
            // InternalMyDsl.g:1891:2: ()
            // InternalMyDsl.g:1891:3: 
            {
            }

             after(grammarAccess.getLinkAccess().getLinkAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__0__Impl"


    // $ANTLR start "rule__Link__Group__1"
    // InternalMyDsl.g:1899:1: rule__Link__Group__1 : rule__Link__Group__1__Impl rule__Link__Group__2 ;
    public final void rule__Link__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1903:1: ( rule__Link__Group__1__Impl rule__Link__Group__2 )
            // InternalMyDsl.g:1904:2: rule__Link__Group__1__Impl rule__Link__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Link__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__2();

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
    // $ANTLR end "rule__Link__Group__1"


    // $ANTLR start "rule__Link__Group__1__Impl"
    // InternalMyDsl.g:1911:1: rule__Link__Group__1__Impl : ( 'Link' ) ;
    public final void rule__Link__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1915:1: ( ( 'Link' ) )
            // InternalMyDsl.g:1916:1: ( 'Link' )
            {
            // InternalMyDsl.g:1916:1: ( 'Link' )
            // InternalMyDsl.g:1917:2: 'Link'
            {
             before(grammarAccess.getLinkAccess().getLinkKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getLinkKeyword_1()); 

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
    // $ANTLR end "rule__Link__Group__1__Impl"


    // $ANTLR start "rule__Link__Group__2"
    // InternalMyDsl.g:1926:1: rule__Link__Group__2 : rule__Link__Group__2__Impl rule__Link__Group__3 ;
    public final void rule__Link__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1930:1: ( rule__Link__Group__2__Impl rule__Link__Group__3 )
            // InternalMyDsl.g:1931:2: rule__Link__Group__2__Impl rule__Link__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Link__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__3();

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
    // $ANTLR end "rule__Link__Group__2"


    // $ANTLR start "rule__Link__Group__2__Impl"
    // InternalMyDsl.g:1938:1: rule__Link__Group__2__Impl : ( ( rule__Link__NameAssignment_2 ) ) ;
    public final void rule__Link__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1942:1: ( ( ( rule__Link__NameAssignment_2 ) ) )
            // InternalMyDsl.g:1943:1: ( ( rule__Link__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:1943:1: ( ( rule__Link__NameAssignment_2 ) )
            // InternalMyDsl.g:1944:2: ( rule__Link__NameAssignment_2 )
            {
             before(grammarAccess.getLinkAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:1945:2: ( rule__Link__NameAssignment_2 )
            // InternalMyDsl.g:1945:3: rule__Link__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Link__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLinkAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Link__Group__2__Impl"


    // $ANTLR start "rule__Link__Group__3"
    // InternalMyDsl.g:1953:1: rule__Link__Group__3 : rule__Link__Group__3__Impl ;
    public final void rule__Link__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1957:1: ( rule__Link__Group__3__Impl )
            // InternalMyDsl.g:1958:2: rule__Link__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Link__Group__3__Impl();

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
    // $ANTLR end "rule__Link__Group__3"


    // $ANTLR start "rule__Link__Group__3__Impl"
    // InternalMyDsl.g:1964:1: rule__Link__Group__3__Impl : ( ( rule__Link__Alternatives_3 )? ) ;
    public final void rule__Link__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1968:1: ( ( ( rule__Link__Alternatives_3 )? ) )
            // InternalMyDsl.g:1969:1: ( ( rule__Link__Alternatives_3 )? )
            {
            // InternalMyDsl.g:1969:1: ( ( rule__Link__Alternatives_3 )? )
            // InternalMyDsl.g:1970:2: ( rule__Link__Alternatives_3 )?
            {
             before(grammarAccess.getLinkAccess().getAlternatives_3()); 
            // InternalMyDsl.g:1971:2: ( rule__Link__Alternatives_3 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=20 && LA24_0<=21)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMyDsl.g:1971:3: rule__Link__Alternatives_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Link__Alternatives_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLinkAccess().getAlternatives_3()); 

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
    // $ANTLR end "rule__Link__Group__3__Impl"


    // $ANTLR start "rule__Link__Group_3_0__0"
    // InternalMyDsl.g:1980:1: rule__Link__Group_3_0__0 : rule__Link__Group_3_0__0__Impl rule__Link__Group_3_0__1 ;
    public final void rule__Link__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1984:1: ( rule__Link__Group_3_0__0__Impl rule__Link__Group_3_0__1 )
            // InternalMyDsl.g:1985:2: rule__Link__Group_3_0__0__Impl rule__Link__Group_3_0__1
            {
            pushFollow(FOLLOW_9);
            rule__Link__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group_3_0__1();

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
    // $ANTLR end "rule__Link__Group_3_0__0"


    // $ANTLR start "rule__Link__Group_3_0__0__Impl"
    // InternalMyDsl.g:1992:1: rule__Link__Group_3_0__0__Impl : ( 'def' ) ;
    public final void rule__Link__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1996:1: ( ( 'def' ) )
            // InternalMyDsl.g:1997:1: ( 'def' )
            {
            // InternalMyDsl.g:1997:1: ( 'def' )
            // InternalMyDsl.g:1998:2: 'def'
            {
             before(grammarAccess.getLinkAccess().getDefKeyword_3_0_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getDefKeyword_3_0_0()); 

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
    // $ANTLR end "rule__Link__Group_3_0__0__Impl"


    // $ANTLR start "rule__Link__Group_3_0__1"
    // InternalMyDsl.g:2007:1: rule__Link__Group_3_0__1 : rule__Link__Group_3_0__1__Impl ;
    public final void rule__Link__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2011:1: ( rule__Link__Group_3_0__1__Impl )
            // InternalMyDsl.g:2012:2: rule__Link__Group_3_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Link__Group_3_0__1__Impl();

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
    // $ANTLR end "rule__Link__Group_3_0__1"


    // $ANTLR start "rule__Link__Group_3_0__1__Impl"
    // InternalMyDsl.g:2018:1: rule__Link__Group_3_0__1__Impl : ( ( ( rule__Link__Alternatives_3_0_1 ) ) ( ( rule__Link__Alternatives_3_0_1 )* ) ) ;
    public final void rule__Link__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2022:1: ( ( ( ( rule__Link__Alternatives_3_0_1 ) ) ( ( rule__Link__Alternatives_3_0_1 )* ) ) )
            // InternalMyDsl.g:2023:1: ( ( ( rule__Link__Alternatives_3_0_1 ) ) ( ( rule__Link__Alternatives_3_0_1 )* ) )
            {
            // InternalMyDsl.g:2023:1: ( ( ( rule__Link__Alternatives_3_0_1 ) ) ( ( rule__Link__Alternatives_3_0_1 )* ) )
            // InternalMyDsl.g:2024:2: ( ( rule__Link__Alternatives_3_0_1 ) ) ( ( rule__Link__Alternatives_3_0_1 )* )
            {
            // InternalMyDsl.g:2024:2: ( ( rule__Link__Alternatives_3_0_1 ) )
            // InternalMyDsl.g:2025:3: ( rule__Link__Alternatives_3_0_1 )
            {
             before(grammarAccess.getLinkAccess().getAlternatives_3_0_1()); 
            // InternalMyDsl.g:2026:3: ( rule__Link__Alternatives_3_0_1 )
            // InternalMyDsl.g:2026:4: rule__Link__Alternatives_3_0_1
            {
            pushFollow(FOLLOW_10);
            rule__Link__Alternatives_3_0_1();

            state._fsp--;


            }

             after(grammarAccess.getLinkAccess().getAlternatives_3_0_1()); 

            }

            // InternalMyDsl.g:2029:2: ( ( rule__Link__Alternatives_3_0_1 )* )
            // InternalMyDsl.g:2030:3: ( rule__Link__Alternatives_3_0_1 )*
            {
             before(grammarAccess.getLinkAccess().getAlternatives_3_0_1()); 
            // InternalMyDsl.g:2031:3: ( rule__Link__Alternatives_3_0_1 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==29||LA25_0==37||LA25_0==49) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalMyDsl.g:2031:4: rule__Link__Alternatives_3_0_1
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Link__Alternatives_3_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getLinkAccess().getAlternatives_3_0_1()); 

            }


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
    // $ANTLR end "rule__Link__Group_3_0__1__Impl"


    // $ANTLR start "rule__Link__Group_3_1__0"
    // InternalMyDsl.g:2041:1: rule__Link__Group_3_1__0 : rule__Link__Group_3_1__0__Impl rule__Link__Group_3_1__1 ;
    public final void rule__Link__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2045:1: ( rule__Link__Group_3_1__0__Impl rule__Link__Group_3_1__1 )
            // InternalMyDsl.g:2046:2: rule__Link__Group_3_1__0__Impl rule__Link__Group_3_1__1
            {
            pushFollow(FOLLOW_3);
            rule__Link__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group_3_1__1();

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
    // $ANTLR end "rule__Link__Group_3_1__0"


    // $ANTLR start "rule__Link__Group_3_1__0__Impl"
    // InternalMyDsl.g:2053:1: rule__Link__Group_3_1__0__Impl : ( 'reuse' ) ;
    public final void rule__Link__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2057:1: ( ( 'reuse' ) )
            // InternalMyDsl.g:2058:1: ( 'reuse' )
            {
            // InternalMyDsl.g:2058:1: ( 'reuse' )
            // InternalMyDsl.g:2059:2: 'reuse'
            {
             before(grammarAccess.getLinkAccess().getReuseKeyword_3_1_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getReuseKeyword_3_1_0()); 

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
    // $ANTLR end "rule__Link__Group_3_1__0__Impl"


    // $ANTLR start "rule__Link__Group_3_1__1"
    // InternalMyDsl.g:2068:1: rule__Link__Group_3_1__1 : rule__Link__Group_3_1__1__Impl rule__Link__Group_3_1__2 ;
    public final void rule__Link__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2072:1: ( rule__Link__Group_3_1__1__Impl rule__Link__Group_3_1__2 )
            // InternalMyDsl.g:2073:2: rule__Link__Group_3_1__1__Impl rule__Link__Group_3_1__2
            {
            pushFollow(FOLLOW_11);
            rule__Link__Group_3_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group_3_1__2();

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
    // $ANTLR end "rule__Link__Group_3_1__1"


    // $ANTLR start "rule__Link__Group_3_1__1__Impl"
    // InternalMyDsl.g:2080:1: rule__Link__Group_3_1__1__Impl : ( ( rule__Link__IsReuseOfAssignment_3_1_1 ) ) ;
    public final void rule__Link__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2084:1: ( ( ( rule__Link__IsReuseOfAssignment_3_1_1 ) ) )
            // InternalMyDsl.g:2085:1: ( ( rule__Link__IsReuseOfAssignment_3_1_1 ) )
            {
            // InternalMyDsl.g:2085:1: ( ( rule__Link__IsReuseOfAssignment_3_1_1 ) )
            // InternalMyDsl.g:2086:2: ( rule__Link__IsReuseOfAssignment_3_1_1 )
            {
             before(grammarAccess.getLinkAccess().getIsReuseOfAssignment_3_1_1()); 
            // InternalMyDsl.g:2087:2: ( rule__Link__IsReuseOfAssignment_3_1_1 )
            // InternalMyDsl.g:2087:3: rule__Link__IsReuseOfAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Link__IsReuseOfAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getLinkAccess().getIsReuseOfAssignment_3_1_1()); 

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
    // $ANTLR end "rule__Link__Group_3_1__1__Impl"


    // $ANTLR start "rule__Link__Group_3_1__2"
    // InternalMyDsl.g:2095:1: rule__Link__Group_3_1__2 : rule__Link__Group_3_1__2__Impl ;
    public final void rule__Link__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2099:1: ( rule__Link__Group_3_1__2__Impl )
            // InternalMyDsl.g:2100:2: rule__Link__Group_3_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Link__Group_3_1__2__Impl();

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
    // $ANTLR end "rule__Link__Group_3_1__2"


    // $ANTLR start "rule__Link__Group_3_1__2__Impl"
    // InternalMyDsl.g:2106:1: rule__Link__Group_3_1__2__Impl : ( ( rule__Link__ReuseAssignment_3_1_2 )? ) ;
    public final void rule__Link__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2110:1: ( ( ( rule__Link__ReuseAssignment_3_1_2 )? ) )
            // InternalMyDsl.g:2111:1: ( ( rule__Link__ReuseAssignment_3_1_2 )? )
            {
            // InternalMyDsl.g:2111:1: ( ( rule__Link__ReuseAssignment_3_1_2 )? )
            // InternalMyDsl.g:2112:2: ( rule__Link__ReuseAssignment_3_1_2 )?
            {
             before(grammarAccess.getLinkAccess().getReuseAssignment_3_1_2()); 
            // InternalMyDsl.g:2113:2: ( rule__Link__ReuseAssignment_3_1_2 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=25 && LA26_0<=26)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMyDsl.g:2113:3: rule__Link__ReuseAssignment_3_1_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Link__ReuseAssignment_3_1_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLinkAccess().getReuseAssignment_3_1_2()); 

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
    // $ANTLR end "rule__Link__Group_3_1__2__Impl"


    // $ANTLR start "rule__AddTo__Group_0__0"
    // InternalMyDsl.g:2122:1: rule__AddTo__Group_0__0 : rule__AddTo__Group_0__0__Impl rule__AddTo__Group_0__1 ;
    public final void rule__AddTo__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2126:1: ( rule__AddTo__Group_0__0__Impl rule__AddTo__Group_0__1 )
            // InternalMyDsl.g:2127:2: rule__AddTo__Group_0__0__Impl rule__AddTo__Group_0__1
            {
            pushFollow(FOLLOW_9);
            rule__AddTo__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddTo__Group_0__1();

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
    // $ANTLR end "rule__AddTo__Group_0__0"


    // $ANTLR start "rule__AddTo__Group_0__0__Impl"
    // InternalMyDsl.g:2134:1: rule__AddTo__Group_0__0__Impl : ( ( rule__AddTo__Group_0_0__0 ) ) ;
    public final void rule__AddTo__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2138:1: ( ( ( rule__AddTo__Group_0_0__0 ) ) )
            // InternalMyDsl.g:2139:1: ( ( rule__AddTo__Group_0_0__0 ) )
            {
            // InternalMyDsl.g:2139:1: ( ( rule__AddTo__Group_0_0__0 ) )
            // InternalMyDsl.g:2140:2: ( rule__AddTo__Group_0_0__0 )
            {
             before(grammarAccess.getAddToAccess().getGroup_0_0()); 
            // InternalMyDsl.g:2141:2: ( rule__AddTo__Group_0_0__0 )
            // InternalMyDsl.g:2141:3: rule__AddTo__Group_0_0__0
            {
            pushFollow(FOLLOW_2);
            rule__AddTo__Group_0_0__0();

            state._fsp--;


            }

             after(grammarAccess.getAddToAccess().getGroup_0_0()); 

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
    // $ANTLR end "rule__AddTo__Group_0__0__Impl"


    // $ANTLR start "rule__AddTo__Group_0__1"
    // InternalMyDsl.g:2149:1: rule__AddTo__Group_0__1 : rule__AddTo__Group_0__1__Impl ;
    public final void rule__AddTo__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2153:1: ( rule__AddTo__Group_0__1__Impl )
            // InternalMyDsl.g:2154:2: rule__AddTo__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AddTo__Group_0__1__Impl();

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
    // $ANTLR end "rule__AddTo__Group_0__1"


    // $ANTLR start "rule__AddTo__Group_0__1__Impl"
    // InternalMyDsl.g:2160:1: rule__AddTo__Group_0__1__Impl : ( ( ( rule__AddTo__Alternatives_0_1 ) ) ( ( rule__AddTo__Alternatives_0_1 )* ) ) ;
    public final void rule__AddTo__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2164:1: ( ( ( ( rule__AddTo__Alternatives_0_1 ) ) ( ( rule__AddTo__Alternatives_0_1 )* ) ) )
            // InternalMyDsl.g:2165:1: ( ( ( rule__AddTo__Alternatives_0_1 ) ) ( ( rule__AddTo__Alternatives_0_1 )* ) )
            {
            // InternalMyDsl.g:2165:1: ( ( ( rule__AddTo__Alternatives_0_1 ) ) ( ( rule__AddTo__Alternatives_0_1 )* ) )
            // InternalMyDsl.g:2166:2: ( ( rule__AddTo__Alternatives_0_1 ) ) ( ( rule__AddTo__Alternatives_0_1 )* )
            {
            // InternalMyDsl.g:2166:2: ( ( rule__AddTo__Alternatives_0_1 ) )
            // InternalMyDsl.g:2167:3: ( rule__AddTo__Alternatives_0_1 )
            {
             before(grammarAccess.getAddToAccess().getAlternatives_0_1()); 
            // InternalMyDsl.g:2168:3: ( rule__AddTo__Alternatives_0_1 )
            // InternalMyDsl.g:2168:4: rule__AddTo__Alternatives_0_1
            {
            pushFollow(FOLLOW_10);
            rule__AddTo__Alternatives_0_1();

            state._fsp--;


            }

             after(grammarAccess.getAddToAccess().getAlternatives_0_1()); 

            }

            // InternalMyDsl.g:2171:2: ( ( rule__AddTo__Alternatives_0_1 )* )
            // InternalMyDsl.g:2172:3: ( rule__AddTo__Alternatives_0_1 )*
            {
             before(grammarAccess.getAddToAccess().getAlternatives_0_1()); 
            // InternalMyDsl.g:2173:3: ( rule__AddTo__Alternatives_0_1 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==29||LA27_0==37||LA27_0==49) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalMyDsl.g:2173:4: rule__AddTo__Alternatives_0_1
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__AddTo__Alternatives_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getAddToAccess().getAlternatives_0_1()); 

            }


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
    // $ANTLR end "rule__AddTo__Group_0__1__Impl"


    // $ANTLR start "rule__AddTo__Group_0_0__0"
    // InternalMyDsl.g:2183:1: rule__AddTo__Group_0_0__0 : rule__AddTo__Group_0_0__0__Impl rule__AddTo__Group_0_0__1 ;
    public final void rule__AddTo__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2187:1: ( rule__AddTo__Group_0_0__0__Impl rule__AddTo__Group_0_0__1 )
            // InternalMyDsl.g:2188:2: rule__AddTo__Group_0_0__0__Impl rule__AddTo__Group_0_0__1
            {
            pushFollow(FOLLOW_12);
            rule__AddTo__Group_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddTo__Group_0_0__1();

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
    // $ANTLR end "rule__AddTo__Group_0_0__0"


    // $ANTLR start "rule__AddTo__Group_0_0__0__Impl"
    // InternalMyDsl.g:2195:1: rule__AddTo__Group_0_0__0__Impl : ( 'add_to' ) ;
    public final void rule__AddTo__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2199:1: ( ( 'add_to' ) )
            // InternalMyDsl.g:2200:1: ( 'add_to' )
            {
            // InternalMyDsl.g:2200:1: ( 'add_to' )
            // InternalMyDsl.g:2201:2: 'add_to'
            {
             before(grammarAccess.getAddToAccess().getAdd_toKeyword_0_0_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getAddToAccess().getAdd_toKeyword_0_0_0()); 

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
    // $ANTLR end "rule__AddTo__Group_0_0__0__Impl"


    // $ANTLR start "rule__AddTo__Group_0_0__1"
    // InternalMyDsl.g:2210:1: rule__AddTo__Group_0_0__1 : rule__AddTo__Group_0_0__1__Impl rule__AddTo__Group_0_0__2 ;
    public final void rule__AddTo__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2214:1: ( rule__AddTo__Group_0_0__1__Impl rule__AddTo__Group_0_0__2 )
            // InternalMyDsl.g:2215:2: rule__AddTo__Group_0_0__1__Impl rule__AddTo__Group_0_0__2
            {
            pushFollow(FOLLOW_3);
            rule__AddTo__Group_0_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddTo__Group_0_0__2();

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
    // $ANTLR end "rule__AddTo__Group_0_0__1"


    // $ANTLR start "rule__AddTo__Group_0_0__1__Impl"
    // InternalMyDsl.g:2222:1: rule__AddTo__Group_0_0__1__Impl : ( 'link' ) ;
    public final void rule__AddTo__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2226:1: ( ( 'link' ) )
            // InternalMyDsl.g:2227:1: ( 'link' )
            {
            // InternalMyDsl.g:2227:1: ( 'link' )
            // InternalMyDsl.g:2228:2: 'link'
            {
             before(grammarAccess.getAddToAccess().getLinkKeyword_0_0_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getAddToAccess().getLinkKeyword_0_0_1()); 

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
    // $ANTLR end "rule__AddTo__Group_0_0__1__Impl"


    // $ANTLR start "rule__AddTo__Group_0_0__2"
    // InternalMyDsl.g:2237:1: rule__AddTo__Group_0_0__2 : rule__AddTo__Group_0_0__2__Impl ;
    public final void rule__AddTo__Group_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2241:1: ( rule__AddTo__Group_0_0__2__Impl )
            // InternalMyDsl.g:2242:2: rule__AddTo__Group_0_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AddTo__Group_0_0__2__Impl();

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
    // $ANTLR end "rule__AddTo__Group_0_0__2"


    // $ANTLR start "rule__AddTo__Group_0_0__2__Impl"
    // InternalMyDsl.g:2248:1: rule__AddTo__Group_0_0__2__Impl : ( ( rule__AddTo__LinkAssignment_0_0_2 ) ) ;
    public final void rule__AddTo__Group_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2252:1: ( ( ( rule__AddTo__LinkAssignment_0_0_2 ) ) )
            // InternalMyDsl.g:2253:1: ( ( rule__AddTo__LinkAssignment_0_0_2 ) )
            {
            // InternalMyDsl.g:2253:1: ( ( rule__AddTo__LinkAssignment_0_0_2 ) )
            // InternalMyDsl.g:2254:2: ( rule__AddTo__LinkAssignment_0_0_2 )
            {
             before(grammarAccess.getAddToAccess().getLinkAssignment_0_0_2()); 
            // InternalMyDsl.g:2255:2: ( rule__AddTo__LinkAssignment_0_0_2 )
            // InternalMyDsl.g:2255:3: rule__AddTo__LinkAssignment_0_0_2
            {
            pushFollow(FOLLOW_2);
            rule__AddTo__LinkAssignment_0_0_2();

            state._fsp--;


            }

             after(grammarAccess.getAddToAccess().getLinkAssignment_0_0_2()); 

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
    // $ANTLR end "rule__AddTo__Group_0_0__2__Impl"


    // $ANTLR start "rule__AddTo__Group_1__0"
    // InternalMyDsl.g:2264:1: rule__AddTo__Group_1__0 : rule__AddTo__Group_1__0__Impl rule__AddTo__Group_1__1 ;
    public final void rule__AddTo__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2268:1: ( rule__AddTo__Group_1__0__Impl rule__AddTo__Group_1__1 )
            // InternalMyDsl.g:2269:2: rule__AddTo__Group_1__0__Impl rule__AddTo__Group_1__1
            {
            pushFollow(FOLLOW_13);
            rule__AddTo__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddTo__Group_1__1();

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
    // $ANTLR end "rule__AddTo__Group_1__0"


    // $ANTLR start "rule__AddTo__Group_1__0__Impl"
    // InternalMyDsl.g:2276:1: rule__AddTo__Group_1__0__Impl : ( ( rule__AddTo__Group_1_0__0 ) ) ;
    public final void rule__AddTo__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2280:1: ( ( ( rule__AddTo__Group_1_0__0 ) ) )
            // InternalMyDsl.g:2281:1: ( ( rule__AddTo__Group_1_0__0 ) )
            {
            // InternalMyDsl.g:2281:1: ( ( rule__AddTo__Group_1_0__0 ) )
            // InternalMyDsl.g:2282:2: ( rule__AddTo__Group_1_0__0 )
            {
             before(grammarAccess.getAddToAccess().getGroup_1_0()); 
            // InternalMyDsl.g:2283:2: ( rule__AddTo__Group_1_0__0 )
            // InternalMyDsl.g:2283:3: rule__AddTo__Group_1_0__0
            {
            pushFollow(FOLLOW_2);
            rule__AddTo__Group_1_0__0();

            state._fsp--;


            }

             after(grammarAccess.getAddToAccess().getGroup_1_0()); 

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
    // $ANTLR end "rule__AddTo__Group_1__0__Impl"


    // $ANTLR start "rule__AddTo__Group_1__1"
    // InternalMyDsl.g:2291:1: rule__AddTo__Group_1__1 : rule__AddTo__Group_1__1__Impl ;
    public final void rule__AddTo__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2295:1: ( rule__AddTo__Group_1__1__Impl )
            // InternalMyDsl.g:2296:2: rule__AddTo__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AddTo__Group_1__1__Impl();

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
    // $ANTLR end "rule__AddTo__Group_1__1"


    // $ANTLR start "rule__AddTo__Group_1__1__Impl"
    // InternalMyDsl.g:2302:1: rule__AddTo__Group_1__1__Impl : ( ( rule__AddTo__OriginAssignment_1_1 )* ) ;
    public final void rule__AddTo__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2306:1: ( ( ( rule__AddTo__OriginAssignment_1_1 )* ) )
            // InternalMyDsl.g:2307:1: ( ( rule__AddTo__OriginAssignment_1_1 )* )
            {
            // InternalMyDsl.g:2307:1: ( ( rule__AddTo__OriginAssignment_1_1 )* )
            // InternalMyDsl.g:2308:2: ( rule__AddTo__OriginAssignment_1_1 )*
            {
             before(grammarAccess.getAddToAccess().getOriginAssignment_1_1()); 
            // InternalMyDsl.g:2309:2: ( rule__AddTo__OriginAssignment_1_1 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==40) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalMyDsl.g:2309:3: rule__AddTo__OriginAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__AddTo__OriginAssignment_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getAddToAccess().getOriginAssignment_1_1()); 

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
    // $ANTLR end "rule__AddTo__Group_1__1__Impl"


    // $ANTLR start "rule__AddTo__Group_1_0__0"
    // InternalMyDsl.g:2318:1: rule__AddTo__Group_1_0__0 : rule__AddTo__Group_1_0__0__Impl rule__AddTo__Group_1_0__1 ;
    public final void rule__AddTo__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2322:1: ( rule__AddTo__Group_1_0__0__Impl rule__AddTo__Group_1_0__1 )
            // InternalMyDsl.g:2323:2: rule__AddTo__Group_1_0__0__Impl rule__AddTo__Group_1_0__1
            {
            pushFollow(FOLLOW_15);
            rule__AddTo__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddTo__Group_1_0__1();

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
    // $ANTLR end "rule__AddTo__Group_1_0__0"


    // $ANTLR start "rule__AddTo__Group_1_0__0__Impl"
    // InternalMyDsl.g:2330:1: rule__AddTo__Group_1_0__0__Impl : ( 'add_to' ) ;
    public final void rule__AddTo__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2334:1: ( ( 'add_to' ) )
            // InternalMyDsl.g:2335:1: ( 'add_to' )
            {
            // InternalMyDsl.g:2335:1: ( 'add_to' )
            // InternalMyDsl.g:2336:2: 'add_to'
            {
             before(grammarAccess.getAddToAccess().getAdd_toKeyword_1_0_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getAddToAccess().getAdd_toKeyword_1_0_0()); 

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
    // $ANTLR end "rule__AddTo__Group_1_0__0__Impl"


    // $ANTLR start "rule__AddTo__Group_1_0__1"
    // InternalMyDsl.g:2345:1: rule__AddTo__Group_1_0__1 : rule__AddTo__Group_1_0__1__Impl rule__AddTo__Group_1_0__2 ;
    public final void rule__AddTo__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2349:1: ( rule__AddTo__Group_1_0__1__Impl rule__AddTo__Group_1_0__2 )
            // InternalMyDsl.g:2350:2: rule__AddTo__Group_1_0__1__Impl rule__AddTo__Group_1_0__2
            {
            pushFollow(FOLLOW_3);
            rule__AddTo__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddTo__Group_1_0__2();

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
    // $ANTLR end "rule__AddTo__Group_1_0__1"


    // $ANTLR start "rule__AddTo__Group_1_0__1__Impl"
    // InternalMyDsl.g:2357:1: rule__AddTo__Group_1_0__1__Impl : ( 'joint' ) ;
    public final void rule__AddTo__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2361:1: ( ( 'joint' ) )
            // InternalMyDsl.g:2362:1: ( 'joint' )
            {
            // InternalMyDsl.g:2362:1: ( 'joint' )
            // InternalMyDsl.g:2363:2: 'joint'
            {
             before(grammarAccess.getAddToAccess().getJointKeyword_1_0_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getAddToAccess().getJointKeyword_1_0_1()); 

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
    // $ANTLR end "rule__AddTo__Group_1_0__1__Impl"


    // $ANTLR start "rule__AddTo__Group_1_0__2"
    // InternalMyDsl.g:2372:1: rule__AddTo__Group_1_0__2 : rule__AddTo__Group_1_0__2__Impl ;
    public final void rule__AddTo__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2376:1: ( rule__AddTo__Group_1_0__2__Impl )
            // InternalMyDsl.g:2377:2: rule__AddTo__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AddTo__Group_1_0__2__Impl();

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
    // $ANTLR end "rule__AddTo__Group_1_0__2"


    // $ANTLR start "rule__AddTo__Group_1_0__2__Impl"
    // InternalMyDsl.g:2383:1: rule__AddTo__Group_1_0__2__Impl : ( ( rule__AddTo__JointAssignment_1_0_2 ) ) ;
    public final void rule__AddTo__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2387:1: ( ( ( rule__AddTo__JointAssignment_1_0_2 ) ) )
            // InternalMyDsl.g:2388:1: ( ( rule__AddTo__JointAssignment_1_0_2 ) )
            {
            // InternalMyDsl.g:2388:1: ( ( rule__AddTo__JointAssignment_1_0_2 ) )
            // InternalMyDsl.g:2389:2: ( rule__AddTo__JointAssignment_1_0_2 )
            {
             before(grammarAccess.getAddToAccess().getJointAssignment_1_0_2()); 
            // InternalMyDsl.g:2390:2: ( rule__AddTo__JointAssignment_1_0_2 )
            // InternalMyDsl.g:2390:3: rule__AddTo__JointAssignment_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__AddTo__JointAssignment_1_0_2();

            state._fsp--;


            }

             after(grammarAccess.getAddToAccess().getJointAssignment_1_0_2()); 

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
    // $ANTLR end "rule__AddTo__Group_1_0__2__Impl"


    // $ANTLR start "rule__Reuse__Group_0__0"
    // InternalMyDsl.g:2399:1: rule__Reuse__Group_0__0 : rule__Reuse__Group_0__0__Impl rule__Reuse__Group_0__1 ;
    public final void rule__Reuse__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2403:1: ( rule__Reuse__Group_0__0__Impl rule__Reuse__Group_0__1 )
            // InternalMyDsl.g:2404:2: rule__Reuse__Group_0__0__Impl rule__Reuse__Group_0__1
            {
            pushFollow(FOLLOW_16);
            rule__Reuse__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reuse__Group_0__1();

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
    // $ANTLR end "rule__Reuse__Group_0__0"


    // $ANTLR start "rule__Reuse__Group_0__0__Impl"
    // InternalMyDsl.g:2411:1: rule__Reuse__Group_0__0__Impl : ( () ) ;
    public final void rule__Reuse__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2415:1: ( ( () ) )
            // InternalMyDsl.g:2416:1: ( () )
            {
            // InternalMyDsl.g:2416:1: ( () )
            // InternalMyDsl.g:2417:2: ()
            {
             before(grammarAccess.getReuseAccess().getReuseAction_0_0()); 
            // InternalMyDsl.g:2418:2: ()
            // InternalMyDsl.g:2418:3: 
            {
            }

             after(grammarAccess.getReuseAccess().getReuseAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reuse__Group_0__0__Impl"


    // $ANTLR start "rule__Reuse__Group_0__1"
    // InternalMyDsl.g:2426:1: rule__Reuse__Group_0__1 : rule__Reuse__Group_0__1__Impl rule__Reuse__Group_0__2 ;
    public final void rule__Reuse__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2430:1: ( rule__Reuse__Group_0__1__Impl rule__Reuse__Group_0__2 )
            // InternalMyDsl.g:2431:2: rule__Reuse__Group_0__1__Impl rule__Reuse__Group_0__2
            {
            pushFollow(FOLLOW_9);
            rule__Reuse__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reuse__Group_0__2();

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
    // $ANTLR end "rule__Reuse__Group_0__1"


    // $ANTLR start "rule__Reuse__Group_0__1__Impl"
    // InternalMyDsl.g:2438:1: rule__Reuse__Group_0__1__Impl : ( 'add' ) ;
    public final void rule__Reuse__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2442:1: ( ( 'add' ) )
            // InternalMyDsl.g:2443:1: ( 'add' )
            {
            // InternalMyDsl.g:2443:1: ( 'add' )
            // InternalMyDsl.g:2444:2: 'add'
            {
             before(grammarAccess.getReuseAccess().getAddKeyword_0_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getReuseAccess().getAddKeyword_0_1()); 

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
    // $ANTLR end "rule__Reuse__Group_0__1__Impl"


    // $ANTLR start "rule__Reuse__Group_0__2"
    // InternalMyDsl.g:2453:1: rule__Reuse__Group_0__2 : rule__Reuse__Group_0__2__Impl ;
    public final void rule__Reuse__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2457:1: ( rule__Reuse__Group_0__2__Impl )
            // InternalMyDsl.g:2458:2: rule__Reuse__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Reuse__Group_0__2__Impl();

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
    // $ANTLR end "rule__Reuse__Group_0__2"


    // $ANTLR start "rule__Reuse__Group_0__2__Impl"
    // InternalMyDsl.g:2464:1: rule__Reuse__Group_0__2__Impl : ( ( rule__Reuse__AddAssignment_0_2 ) ) ;
    public final void rule__Reuse__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2468:1: ( ( ( rule__Reuse__AddAssignment_0_2 ) ) )
            // InternalMyDsl.g:2469:1: ( ( rule__Reuse__AddAssignment_0_2 ) )
            {
            // InternalMyDsl.g:2469:1: ( ( rule__Reuse__AddAssignment_0_2 ) )
            // InternalMyDsl.g:2470:2: ( rule__Reuse__AddAssignment_0_2 )
            {
             before(grammarAccess.getReuseAccess().getAddAssignment_0_2()); 
            // InternalMyDsl.g:2471:2: ( rule__Reuse__AddAssignment_0_2 )
            // InternalMyDsl.g:2471:3: rule__Reuse__AddAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Reuse__AddAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getReuseAccess().getAddAssignment_0_2()); 

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
    // $ANTLR end "rule__Reuse__Group_0__2__Impl"


    // $ANTLR start "rule__Reuse__Group_1__0"
    // InternalMyDsl.g:2480:1: rule__Reuse__Group_1__0 : rule__Reuse__Group_1__0__Impl rule__Reuse__Group_1__1 ;
    public final void rule__Reuse__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2484:1: ( rule__Reuse__Group_1__0__Impl rule__Reuse__Group_1__1 )
            // InternalMyDsl.g:2485:2: rule__Reuse__Group_1__0__Impl rule__Reuse__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__Reuse__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reuse__Group_1__1();

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
    // $ANTLR end "rule__Reuse__Group_1__0"


    // $ANTLR start "rule__Reuse__Group_1__0__Impl"
    // InternalMyDsl.g:2492:1: rule__Reuse__Group_1__0__Impl : ( 'edit2' ) ;
    public final void rule__Reuse__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2496:1: ( ( 'edit2' ) )
            // InternalMyDsl.g:2497:1: ( 'edit2' )
            {
            // InternalMyDsl.g:2497:1: ( 'edit2' )
            // InternalMyDsl.g:2498:2: 'edit2'
            {
             before(grammarAccess.getReuseAccess().getEdit2Keyword_1_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getReuseAccess().getEdit2Keyword_1_0()); 

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
    // $ANTLR end "rule__Reuse__Group_1__0__Impl"


    // $ANTLR start "rule__Reuse__Group_1__1"
    // InternalMyDsl.g:2507:1: rule__Reuse__Group_1__1 : rule__Reuse__Group_1__1__Impl ;
    public final void rule__Reuse__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2511:1: ( rule__Reuse__Group_1__1__Impl )
            // InternalMyDsl.g:2512:2: rule__Reuse__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Reuse__Group_1__1__Impl();

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
    // $ANTLR end "rule__Reuse__Group_1__1"


    // $ANTLR start "rule__Reuse__Group_1__1__Impl"
    // InternalMyDsl.g:2518:1: rule__Reuse__Group_1__1__Impl : ( ( rule__Reuse__EditAssignment_1_1 ) ) ;
    public final void rule__Reuse__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2522:1: ( ( ( rule__Reuse__EditAssignment_1_1 ) ) )
            // InternalMyDsl.g:2523:1: ( ( rule__Reuse__EditAssignment_1_1 ) )
            {
            // InternalMyDsl.g:2523:1: ( ( rule__Reuse__EditAssignment_1_1 ) )
            // InternalMyDsl.g:2524:2: ( rule__Reuse__EditAssignment_1_1 )
            {
             before(grammarAccess.getReuseAccess().getEditAssignment_1_1()); 
            // InternalMyDsl.g:2525:2: ( rule__Reuse__EditAssignment_1_1 )
            // InternalMyDsl.g:2525:3: rule__Reuse__EditAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Reuse__EditAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getReuseAccess().getEditAssignment_1_1()); 

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
    // $ANTLR end "rule__Reuse__Group_1__1__Impl"


    // $ANTLR start "rule__AssignNewValue__Group__0"
    // InternalMyDsl.g:2534:1: rule__AssignNewValue__Group__0 : rule__AssignNewValue__Group__0__Impl rule__AssignNewValue__Group__1 ;
    public final void rule__AssignNewValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2538:1: ( rule__AssignNewValue__Group__0__Impl rule__AssignNewValue__Group__1 )
            // InternalMyDsl.g:2539:2: rule__AssignNewValue__Group__0__Impl rule__AssignNewValue__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__AssignNewValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssignNewValue__Group__1();

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
    // $ANTLR end "rule__AssignNewValue__Group__0"


    // $ANTLR start "rule__AssignNewValue__Group__0__Impl"
    // InternalMyDsl.g:2546:1: rule__AssignNewValue__Group__0__Impl : ( () ) ;
    public final void rule__AssignNewValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2550:1: ( ( () ) )
            // InternalMyDsl.g:2551:1: ( () )
            {
            // InternalMyDsl.g:2551:1: ( () )
            // InternalMyDsl.g:2552:2: ()
            {
             before(grammarAccess.getAssignNewValueAccess().getAssignNewValueAction_0()); 
            // InternalMyDsl.g:2553:2: ()
            // InternalMyDsl.g:2553:3: 
            {
            }

             after(grammarAccess.getAssignNewValueAccess().getAssignNewValueAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignNewValue__Group__0__Impl"


    // $ANTLR start "rule__AssignNewValue__Group__1"
    // InternalMyDsl.g:2561:1: rule__AssignNewValue__Group__1 : rule__AssignNewValue__Group__1__Impl rule__AssignNewValue__Group__2 ;
    public final void rule__AssignNewValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2565:1: ( rule__AssignNewValue__Group__1__Impl rule__AssignNewValue__Group__2 )
            // InternalMyDsl.g:2566:2: rule__AssignNewValue__Group__1__Impl rule__AssignNewValue__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__AssignNewValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssignNewValue__Group__2();

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
    // $ANTLR end "rule__AssignNewValue__Group__1"


    // $ANTLR start "rule__AssignNewValue__Group__1__Impl"
    // InternalMyDsl.g:2573:1: rule__AssignNewValue__Group__1__Impl : ( ( rule__AssignNewValue__GetRefAssignment_1 ) ) ;
    public final void rule__AssignNewValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2577:1: ( ( ( rule__AssignNewValue__GetRefAssignment_1 ) ) )
            // InternalMyDsl.g:2578:1: ( ( rule__AssignNewValue__GetRefAssignment_1 ) )
            {
            // InternalMyDsl.g:2578:1: ( ( rule__AssignNewValue__GetRefAssignment_1 ) )
            // InternalMyDsl.g:2579:2: ( rule__AssignNewValue__GetRefAssignment_1 )
            {
             before(grammarAccess.getAssignNewValueAccess().getGetRefAssignment_1()); 
            // InternalMyDsl.g:2580:2: ( rule__AssignNewValue__GetRefAssignment_1 )
            // InternalMyDsl.g:2580:3: rule__AssignNewValue__GetRefAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AssignNewValue__GetRefAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAssignNewValueAccess().getGetRefAssignment_1()); 

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
    // $ANTLR end "rule__AssignNewValue__Group__1__Impl"


    // $ANTLR start "rule__AssignNewValue__Group__2"
    // InternalMyDsl.g:2588:1: rule__AssignNewValue__Group__2 : rule__AssignNewValue__Group__2__Impl rule__AssignNewValue__Group__3 ;
    public final void rule__AssignNewValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2592:1: ( rule__AssignNewValue__Group__2__Impl rule__AssignNewValue__Group__3 )
            // InternalMyDsl.g:2593:2: rule__AssignNewValue__Group__2__Impl rule__AssignNewValue__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__AssignNewValue__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssignNewValue__Group__3();

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
    // $ANTLR end "rule__AssignNewValue__Group__2"


    // $ANTLR start "rule__AssignNewValue__Group__2__Impl"
    // InternalMyDsl.g:2600:1: rule__AssignNewValue__Group__2__Impl : ( '=' ) ;
    public final void rule__AssignNewValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2604:1: ( ( '=' ) )
            // InternalMyDsl.g:2605:1: ( '=' )
            {
            // InternalMyDsl.g:2605:1: ( '=' )
            // InternalMyDsl.g:2606:2: '='
            {
             before(grammarAccess.getAssignNewValueAccess().getEqualsSignKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getAssignNewValueAccess().getEqualsSignKeyword_2()); 

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
    // $ANTLR end "rule__AssignNewValue__Group__2__Impl"


    // $ANTLR start "rule__AssignNewValue__Group__3"
    // InternalMyDsl.g:2615:1: rule__AssignNewValue__Group__3 : rule__AssignNewValue__Group__3__Impl ;
    public final void rule__AssignNewValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2619:1: ( rule__AssignNewValue__Group__3__Impl )
            // InternalMyDsl.g:2620:2: rule__AssignNewValue__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AssignNewValue__Group__3__Impl();

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
    // $ANTLR end "rule__AssignNewValue__Group__3"


    // $ANTLR start "rule__AssignNewValue__Group__3__Impl"
    // InternalMyDsl.g:2626:1: rule__AssignNewValue__Group__3__Impl : ( ( rule__AssignNewValue__NewReuseableAssignment_3 ) ) ;
    public final void rule__AssignNewValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2630:1: ( ( ( rule__AssignNewValue__NewReuseableAssignment_3 ) ) )
            // InternalMyDsl.g:2631:1: ( ( rule__AssignNewValue__NewReuseableAssignment_3 ) )
            {
            // InternalMyDsl.g:2631:1: ( ( rule__AssignNewValue__NewReuseableAssignment_3 ) )
            // InternalMyDsl.g:2632:2: ( rule__AssignNewValue__NewReuseableAssignment_3 )
            {
             before(grammarAccess.getAssignNewValueAccess().getNewReuseableAssignment_3()); 
            // InternalMyDsl.g:2633:2: ( rule__AssignNewValue__NewReuseableAssignment_3 )
            // InternalMyDsl.g:2633:3: rule__AssignNewValue__NewReuseableAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__AssignNewValue__NewReuseableAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAssignNewValueAccess().getNewReuseableAssignment_3()); 

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
    // $ANTLR end "rule__AssignNewValue__Group__3__Impl"


    // $ANTLR start "rule__DotExpression__Group__0"
    // InternalMyDsl.g:2642:1: rule__DotExpression__Group__0 : rule__DotExpression__Group__0__Impl rule__DotExpression__Group__1 ;
    public final void rule__DotExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2646:1: ( rule__DotExpression__Group__0__Impl rule__DotExpression__Group__1 )
            // InternalMyDsl.g:2647:2: rule__DotExpression__Group__0__Impl rule__DotExpression__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__DotExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DotExpression__Group__1();

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
    // $ANTLR end "rule__DotExpression__Group__0"


    // $ANTLR start "rule__DotExpression__Group__0__Impl"
    // InternalMyDsl.g:2654:1: rule__DotExpression__Group__0__Impl : ( ruleReUsableRef ) ;
    public final void rule__DotExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2658:1: ( ( ruleReUsableRef ) )
            // InternalMyDsl.g:2659:1: ( ruleReUsableRef )
            {
            // InternalMyDsl.g:2659:1: ( ruleReUsableRef )
            // InternalMyDsl.g:2660:2: ruleReUsableRef
            {
             before(grammarAccess.getDotExpressionAccess().getReUsableRefParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleReUsableRef();

            state._fsp--;

             after(grammarAccess.getDotExpressionAccess().getReUsableRefParserRuleCall_0()); 

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
    // $ANTLR end "rule__DotExpression__Group__0__Impl"


    // $ANTLR start "rule__DotExpression__Group__1"
    // InternalMyDsl.g:2669:1: rule__DotExpression__Group__1 : rule__DotExpression__Group__1__Impl ;
    public final void rule__DotExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2673:1: ( rule__DotExpression__Group__1__Impl )
            // InternalMyDsl.g:2674:2: rule__DotExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DotExpression__Group__1__Impl();

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
    // $ANTLR end "rule__DotExpression__Group__1"


    // $ANTLR start "rule__DotExpression__Group__1__Impl"
    // InternalMyDsl.g:2680:1: rule__DotExpression__Group__1__Impl : ( ( rule__DotExpression__Group_1__0 )* ) ;
    public final void rule__DotExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2684:1: ( ( ( rule__DotExpression__Group_1__0 )* ) )
            // InternalMyDsl.g:2685:1: ( ( rule__DotExpression__Group_1__0 )* )
            {
            // InternalMyDsl.g:2685:1: ( ( rule__DotExpression__Group_1__0 )* )
            // InternalMyDsl.g:2686:2: ( rule__DotExpression__Group_1__0 )*
            {
             before(grammarAccess.getDotExpressionAccess().getGroup_1()); 
            // InternalMyDsl.g:2687:2: ( rule__DotExpression__Group_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==28) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalMyDsl.g:2687:3: rule__DotExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__DotExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getDotExpressionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__DotExpression__Group__1__Impl"


    // $ANTLR start "rule__DotExpression__Group_1__0"
    // InternalMyDsl.g:2696:1: rule__DotExpression__Group_1__0 : rule__DotExpression__Group_1__0__Impl rule__DotExpression__Group_1__1 ;
    public final void rule__DotExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2700:1: ( rule__DotExpression__Group_1__0__Impl rule__DotExpression__Group_1__1 )
            // InternalMyDsl.g:2701:2: rule__DotExpression__Group_1__0__Impl rule__DotExpression__Group_1__1
            {
            pushFollow(FOLLOW_19);
            rule__DotExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DotExpression__Group_1__1();

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
    // $ANTLR end "rule__DotExpression__Group_1__0"


    // $ANTLR start "rule__DotExpression__Group_1__0__Impl"
    // InternalMyDsl.g:2708:1: rule__DotExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__DotExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2712:1: ( ( () ) )
            // InternalMyDsl.g:2713:1: ( () )
            {
            // InternalMyDsl.g:2713:1: ( () )
            // InternalMyDsl.g:2714:2: ()
            {
             before(grammarAccess.getDotExpressionAccess().getDotExpressionRefAction_1_0()); 
            // InternalMyDsl.g:2715:2: ()
            // InternalMyDsl.g:2715:3: 
            {
            }

             after(grammarAccess.getDotExpressionAccess().getDotExpressionRefAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotExpression__Group_1__0__Impl"


    // $ANTLR start "rule__DotExpression__Group_1__1"
    // InternalMyDsl.g:2723:1: rule__DotExpression__Group_1__1 : rule__DotExpression__Group_1__1__Impl rule__DotExpression__Group_1__2 ;
    public final void rule__DotExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2727:1: ( rule__DotExpression__Group_1__1__Impl rule__DotExpression__Group_1__2 )
            // InternalMyDsl.g:2728:2: rule__DotExpression__Group_1__1__Impl rule__DotExpression__Group_1__2
            {
            pushFollow(FOLLOW_3);
            rule__DotExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DotExpression__Group_1__2();

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
    // $ANTLR end "rule__DotExpression__Group_1__1"


    // $ANTLR start "rule__DotExpression__Group_1__1__Impl"
    // InternalMyDsl.g:2735:1: rule__DotExpression__Group_1__1__Impl : ( '.' ) ;
    public final void rule__DotExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2739:1: ( ( '.' ) )
            // InternalMyDsl.g:2740:1: ( '.' )
            {
            // InternalMyDsl.g:2740:1: ( '.' )
            // InternalMyDsl.g:2741:2: '.'
            {
             before(grammarAccess.getDotExpressionAccess().getFullStopKeyword_1_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getDotExpressionAccess().getFullStopKeyword_1_1()); 

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
    // $ANTLR end "rule__DotExpression__Group_1__1__Impl"


    // $ANTLR start "rule__DotExpression__Group_1__2"
    // InternalMyDsl.g:2750:1: rule__DotExpression__Group_1__2 : rule__DotExpression__Group_1__2__Impl ;
    public final void rule__DotExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2754:1: ( rule__DotExpression__Group_1__2__Impl )
            // InternalMyDsl.g:2755:2: rule__DotExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DotExpression__Group_1__2__Impl();

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
    // $ANTLR end "rule__DotExpression__Group_1__2"


    // $ANTLR start "rule__DotExpression__Group_1__2__Impl"
    // InternalMyDsl.g:2761:1: rule__DotExpression__Group_1__2__Impl : ( ( rule__DotExpression__TailAssignment_1_2 ) ) ;
    public final void rule__DotExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2765:1: ( ( ( rule__DotExpression__TailAssignment_1_2 ) ) )
            // InternalMyDsl.g:2766:1: ( ( rule__DotExpression__TailAssignment_1_2 ) )
            {
            // InternalMyDsl.g:2766:1: ( ( rule__DotExpression__TailAssignment_1_2 ) )
            // InternalMyDsl.g:2767:2: ( rule__DotExpression__TailAssignment_1_2 )
            {
             before(grammarAccess.getDotExpressionAccess().getTailAssignment_1_2()); 
            // InternalMyDsl.g:2768:2: ( rule__DotExpression__TailAssignment_1_2 )
            // InternalMyDsl.g:2768:3: rule__DotExpression__TailAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__DotExpression__TailAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getDotExpressionAccess().getTailAssignment_1_2()); 

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
    // $ANTLR end "rule__DotExpression__Group_1__2__Impl"


    // $ANTLR start "rule__ReUsableRef__Group__0"
    // InternalMyDsl.g:2777:1: rule__ReUsableRef__Group__0 : rule__ReUsableRef__Group__0__Impl rule__ReUsableRef__Group__1 ;
    public final void rule__ReUsableRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2781:1: ( rule__ReUsableRef__Group__0__Impl rule__ReUsableRef__Group__1 )
            // InternalMyDsl.g:2782:2: rule__ReUsableRef__Group__0__Impl rule__ReUsableRef__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ReUsableRef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReUsableRef__Group__1();

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
    // $ANTLR end "rule__ReUsableRef__Group__0"


    // $ANTLR start "rule__ReUsableRef__Group__0__Impl"
    // InternalMyDsl.g:2789:1: rule__ReUsableRef__Group__0__Impl : ( () ) ;
    public final void rule__ReUsableRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2793:1: ( ( () ) )
            // InternalMyDsl.g:2794:1: ( () )
            {
            // InternalMyDsl.g:2794:1: ( () )
            // InternalMyDsl.g:2795:2: ()
            {
             before(grammarAccess.getReUsableRefAccess().getReUsableRefAction_0()); 
            // InternalMyDsl.g:2796:2: ()
            // InternalMyDsl.g:2796:3: 
            {
            }

             after(grammarAccess.getReUsableRefAccess().getReUsableRefAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReUsableRef__Group__0__Impl"


    // $ANTLR start "rule__ReUsableRef__Group__1"
    // InternalMyDsl.g:2804:1: rule__ReUsableRef__Group__1 : rule__ReUsableRef__Group__1__Impl ;
    public final void rule__ReUsableRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2808:1: ( rule__ReUsableRef__Group__1__Impl )
            // InternalMyDsl.g:2809:2: rule__ReUsableRef__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReUsableRef__Group__1__Impl();

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
    // $ANTLR end "rule__ReUsableRef__Group__1"


    // $ANTLR start "rule__ReUsableRef__Group__1__Impl"
    // InternalMyDsl.g:2815:1: rule__ReUsableRef__Group__1__Impl : ( ( rule__ReUsableRef__ReuseableAssignment_1 ) ) ;
    public final void rule__ReUsableRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2819:1: ( ( ( rule__ReUsableRef__ReuseableAssignment_1 ) ) )
            // InternalMyDsl.g:2820:1: ( ( rule__ReUsableRef__ReuseableAssignment_1 ) )
            {
            // InternalMyDsl.g:2820:1: ( ( rule__ReUsableRef__ReuseableAssignment_1 ) )
            // InternalMyDsl.g:2821:2: ( rule__ReUsableRef__ReuseableAssignment_1 )
            {
             before(grammarAccess.getReUsableRefAccess().getReuseableAssignment_1()); 
            // InternalMyDsl.g:2822:2: ( rule__ReUsableRef__ReuseableAssignment_1 )
            // InternalMyDsl.g:2822:3: rule__ReUsableRef__ReuseableAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ReUsableRef__ReuseableAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getReUsableRefAccess().getReuseableAssignment_1()); 

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
    // $ANTLR end "rule__ReUsableRef__Group__1__Impl"


    // $ANTLR start "rule__Inertial__Group__0"
    // InternalMyDsl.g:2831:1: rule__Inertial__Group__0 : rule__Inertial__Group__0__Impl rule__Inertial__Group__1 ;
    public final void rule__Inertial__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2835:1: ( rule__Inertial__Group__0__Impl rule__Inertial__Group__1 )
            // InternalMyDsl.g:2836:2: rule__Inertial__Group__0__Impl rule__Inertial__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__Inertial__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertial__Group__1();

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
    // $ANTLR end "rule__Inertial__Group__0"


    // $ANTLR start "rule__Inertial__Group__0__Impl"
    // InternalMyDsl.g:2843:1: rule__Inertial__Group__0__Impl : ( () ) ;
    public final void rule__Inertial__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2847:1: ( ( () ) )
            // InternalMyDsl.g:2848:1: ( () )
            {
            // InternalMyDsl.g:2848:1: ( () )
            // InternalMyDsl.g:2849:2: ()
            {
             before(grammarAccess.getInertialAccess().getInertialAction_0()); 
            // InternalMyDsl.g:2850:2: ()
            // InternalMyDsl.g:2850:3: 
            {
            }

             after(grammarAccess.getInertialAccess().getInertialAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertial__Group__0__Impl"


    // $ANTLR start "rule__Inertial__Group__1"
    // InternalMyDsl.g:2858:1: rule__Inertial__Group__1 : rule__Inertial__Group__1__Impl rule__Inertial__Group__2 ;
    public final void rule__Inertial__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2862:1: ( rule__Inertial__Group__1__Impl rule__Inertial__Group__2 )
            // InternalMyDsl.g:2863:2: rule__Inertial__Group__1__Impl rule__Inertial__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__Inertial__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertial__Group__2();

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
    // $ANTLR end "rule__Inertial__Group__1"


    // $ANTLR start "rule__Inertial__Group__1__Impl"
    // InternalMyDsl.g:2870:1: rule__Inertial__Group__1__Impl : ( 'Inertial' ) ;
    public final void rule__Inertial__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2874:1: ( ( 'Inertial' ) )
            // InternalMyDsl.g:2875:1: ( 'Inertial' )
            {
            // InternalMyDsl.g:2875:1: ( 'Inertial' )
            // InternalMyDsl.g:2876:2: 'Inertial'
            {
             before(grammarAccess.getInertialAccess().getInertialKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getInertialAccess().getInertialKeyword_1()); 

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
    // $ANTLR end "rule__Inertial__Group__1__Impl"


    // $ANTLR start "rule__Inertial__Group__2"
    // InternalMyDsl.g:2885:1: rule__Inertial__Group__2 : rule__Inertial__Group__2__Impl rule__Inertial__Group__3 ;
    public final void rule__Inertial__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2889:1: ( rule__Inertial__Group__2__Impl rule__Inertial__Group__3 )
            // InternalMyDsl.g:2890:2: rule__Inertial__Group__2__Impl rule__Inertial__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__Inertial__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertial__Group__3();

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
    // $ANTLR end "rule__Inertial__Group__2"


    // $ANTLR start "rule__Inertial__Group__2__Impl"
    // InternalMyDsl.g:2897:1: rule__Inertial__Group__2__Impl : ( ( rule__Inertial__NameAssignment_2 )? ) ;
    public final void rule__Inertial__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2901:1: ( ( ( rule__Inertial__NameAssignment_2 )? ) )
            // InternalMyDsl.g:2902:1: ( ( rule__Inertial__NameAssignment_2 )? )
            {
            // InternalMyDsl.g:2902:1: ( ( rule__Inertial__NameAssignment_2 )? )
            // InternalMyDsl.g:2903:2: ( rule__Inertial__NameAssignment_2 )?
            {
             before(grammarAccess.getInertialAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:2904:2: ( rule__Inertial__NameAssignment_2 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_ID) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalMyDsl.g:2904:3: rule__Inertial__NameAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Inertial__NameAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInertialAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Inertial__Group__2__Impl"


    // $ANTLR start "rule__Inertial__Group__3"
    // InternalMyDsl.g:2912:1: rule__Inertial__Group__3 : rule__Inertial__Group__3__Impl rule__Inertial__Group__4 ;
    public final void rule__Inertial__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2916:1: ( rule__Inertial__Group__3__Impl rule__Inertial__Group__4 )
            // InternalMyDsl.g:2917:2: rule__Inertial__Group__3__Impl rule__Inertial__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__Inertial__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertial__Group__4();

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
    // $ANTLR end "rule__Inertial__Group__3"


    // $ANTLR start "rule__Inertial__Group__3__Impl"
    // InternalMyDsl.g:2924:1: rule__Inertial__Group__3__Impl : ( ( rule__Inertial__InertiaAssignment_3 ) ) ;
    public final void rule__Inertial__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2928:1: ( ( ( rule__Inertial__InertiaAssignment_3 ) ) )
            // InternalMyDsl.g:2929:1: ( ( rule__Inertial__InertiaAssignment_3 ) )
            {
            // InternalMyDsl.g:2929:1: ( ( rule__Inertial__InertiaAssignment_3 ) )
            // InternalMyDsl.g:2930:2: ( rule__Inertial__InertiaAssignment_3 )
            {
             before(grammarAccess.getInertialAccess().getInertiaAssignment_3()); 
            // InternalMyDsl.g:2931:2: ( rule__Inertial__InertiaAssignment_3 )
            // InternalMyDsl.g:2931:3: rule__Inertial__InertiaAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Inertial__InertiaAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInertialAccess().getInertiaAssignment_3()); 

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
    // $ANTLR end "rule__Inertial__Group__3__Impl"


    // $ANTLR start "rule__Inertial__Group__4"
    // InternalMyDsl.g:2939:1: rule__Inertial__Group__4 : rule__Inertial__Group__4__Impl rule__Inertial__Group__5 ;
    public final void rule__Inertial__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2943:1: ( rule__Inertial__Group__4__Impl rule__Inertial__Group__5 )
            // InternalMyDsl.g:2944:2: rule__Inertial__Group__4__Impl rule__Inertial__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__Inertial__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertial__Group__5();

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
    // $ANTLR end "rule__Inertial__Group__4"


    // $ANTLR start "rule__Inertial__Group__4__Impl"
    // InternalMyDsl.g:2951:1: rule__Inertial__Group__4__Impl : ( ( rule__Inertial__MassAssignment_4 ) ) ;
    public final void rule__Inertial__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2955:1: ( ( ( rule__Inertial__MassAssignment_4 ) ) )
            // InternalMyDsl.g:2956:1: ( ( rule__Inertial__MassAssignment_4 ) )
            {
            // InternalMyDsl.g:2956:1: ( ( rule__Inertial__MassAssignment_4 ) )
            // InternalMyDsl.g:2957:2: ( rule__Inertial__MassAssignment_4 )
            {
             before(grammarAccess.getInertialAccess().getMassAssignment_4()); 
            // InternalMyDsl.g:2958:2: ( rule__Inertial__MassAssignment_4 )
            // InternalMyDsl.g:2958:3: rule__Inertial__MassAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Inertial__MassAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getInertialAccess().getMassAssignment_4()); 

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
    // $ANTLR end "rule__Inertial__Group__4__Impl"


    // $ANTLR start "rule__Inertial__Group__5"
    // InternalMyDsl.g:2966:1: rule__Inertial__Group__5 : rule__Inertial__Group__5__Impl ;
    public final void rule__Inertial__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2970:1: ( rule__Inertial__Group__5__Impl )
            // InternalMyDsl.g:2971:2: rule__Inertial__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Inertial__Group__5__Impl();

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
    // $ANTLR end "rule__Inertial__Group__5"


    // $ANTLR start "rule__Inertial__Group__5__Impl"
    // InternalMyDsl.g:2977:1: rule__Inertial__Group__5__Impl : ( ( rule__Inertial__OriginAssignment_5 )? ) ;
    public final void rule__Inertial__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2981:1: ( ( ( rule__Inertial__OriginAssignment_5 )? ) )
            // InternalMyDsl.g:2982:1: ( ( rule__Inertial__OriginAssignment_5 )? )
            {
            // InternalMyDsl.g:2982:1: ( ( rule__Inertial__OriginAssignment_5 )? )
            // InternalMyDsl.g:2983:2: ( rule__Inertial__OriginAssignment_5 )?
            {
             before(grammarAccess.getInertialAccess().getOriginAssignment_5()); 
            // InternalMyDsl.g:2984:2: ( rule__Inertial__OriginAssignment_5 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==40) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalMyDsl.g:2984:3: rule__Inertial__OriginAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Inertial__OriginAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInertialAccess().getOriginAssignment_5()); 

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
    // $ANTLR end "rule__Inertial__Group__5__Impl"


    // $ANTLR start "rule__Inertia__Group__0"
    // InternalMyDsl.g:2993:1: rule__Inertia__Group__0 : rule__Inertia__Group__0__Impl rule__Inertia__Group__1 ;
    public final void rule__Inertia__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2997:1: ( rule__Inertia__Group__0__Impl rule__Inertia__Group__1 )
            // InternalMyDsl.g:2998:2: rule__Inertia__Group__0__Impl rule__Inertia__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__Inertia__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertia__Group__1();

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
    // $ANTLR end "rule__Inertia__Group__0"


    // $ANTLR start "rule__Inertia__Group__0__Impl"
    // InternalMyDsl.g:3005:1: rule__Inertia__Group__0__Impl : ( () ) ;
    public final void rule__Inertia__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3009:1: ( ( () ) )
            // InternalMyDsl.g:3010:1: ( () )
            {
            // InternalMyDsl.g:3010:1: ( () )
            // InternalMyDsl.g:3011:2: ()
            {
             before(grammarAccess.getInertiaAccess().getInertiaAction_0()); 
            // InternalMyDsl.g:3012:2: ()
            // InternalMyDsl.g:3012:3: 
            {
            }

             after(grammarAccess.getInertiaAccess().getInertiaAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__0__Impl"


    // $ANTLR start "rule__Inertia__Group__1"
    // InternalMyDsl.g:3020:1: rule__Inertia__Group__1 : rule__Inertia__Group__1__Impl rule__Inertia__Group__2 ;
    public final void rule__Inertia__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3024:1: ( rule__Inertia__Group__1__Impl rule__Inertia__Group__2 )
            // InternalMyDsl.g:3025:2: rule__Inertia__Group__1__Impl rule__Inertia__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__Inertia__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertia__Group__2();

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
    // $ANTLR end "rule__Inertia__Group__1"


    // $ANTLR start "rule__Inertia__Group__1__Impl"
    // InternalMyDsl.g:3032:1: rule__Inertia__Group__1__Impl : ( 'Inertia' ) ;
    public final void rule__Inertia__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3036:1: ( ( 'Inertia' ) )
            // InternalMyDsl.g:3037:1: ( 'Inertia' )
            {
            // InternalMyDsl.g:3037:1: ( 'Inertia' )
            // InternalMyDsl.g:3038:2: 'Inertia'
            {
             before(grammarAccess.getInertiaAccess().getInertiaKeyword_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getInertiaAccess().getInertiaKeyword_1()); 

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
    // $ANTLR end "rule__Inertia__Group__1__Impl"


    // $ANTLR start "rule__Inertia__Group__2"
    // InternalMyDsl.g:3047:1: rule__Inertia__Group__2 : rule__Inertia__Group__2__Impl rule__Inertia__Group__3 ;
    public final void rule__Inertia__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3051:1: ( rule__Inertia__Group__2__Impl rule__Inertia__Group__3 )
            // InternalMyDsl.g:3052:2: rule__Inertia__Group__2__Impl rule__Inertia__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__Inertia__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertia__Group__3();

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
    // $ANTLR end "rule__Inertia__Group__2"


    // $ANTLR start "rule__Inertia__Group__2__Impl"
    // InternalMyDsl.g:3059:1: rule__Inertia__Group__2__Impl : ( ( rule__Inertia__NameAssignment_2 )? ) ;
    public final void rule__Inertia__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3063:1: ( ( ( rule__Inertia__NameAssignment_2 )? ) )
            // InternalMyDsl.g:3064:1: ( ( rule__Inertia__NameAssignment_2 )? )
            {
            // InternalMyDsl.g:3064:1: ( ( rule__Inertia__NameAssignment_2 )? )
            // InternalMyDsl.g:3065:2: ( rule__Inertia__NameAssignment_2 )?
            {
             before(grammarAccess.getInertiaAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:3066:2: ( rule__Inertia__NameAssignment_2 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_ID) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalMyDsl.g:3066:3: rule__Inertia__NameAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Inertia__NameAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInertiaAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Inertia__Group__2__Impl"


    // $ANTLR start "rule__Inertia__Group__3"
    // InternalMyDsl.g:3074:1: rule__Inertia__Group__3 : rule__Inertia__Group__3__Impl rule__Inertia__Group__4 ;
    public final void rule__Inertia__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3078:1: ( rule__Inertia__Group__3__Impl rule__Inertia__Group__4 )
            // InternalMyDsl.g:3079:2: rule__Inertia__Group__3__Impl rule__Inertia__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__Inertia__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertia__Group__4();

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
    // $ANTLR end "rule__Inertia__Group__3"


    // $ANTLR start "rule__Inertia__Group__3__Impl"
    // InternalMyDsl.g:3086:1: rule__Inertia__Group__3__Impl : ( 'ixx' ) ;
    public final void rule__Inertia__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3090:1: ( ( 'ixx' ) )
            // InternalMyDsl.g:3091:1: ( 'ixx' )
            {
            // InternalMyDsl.g:3091:1: ( 'ixx' )
            // InternalMyDsl.g:3092:2: 'ixx'
            {
             before(grammarAccess.getInertiaAccess().getIxxKeyword_3()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getInertiaAccess().getIxxKeyword_3()); 

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
    // $ANTLR end "rule__Inertia__Group__3__Impl"


    // $ANTLR start "rule__Inertia__Group__4"
    // InternalMyDsl.g:3101:1: rule__Inertia__Group__4 : rule__Inertia__Group__4__Impl rule__Inertia__Group__5 ;
    public final void rule__Inertia__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3105:1: ( rule__Inertia__Group__4__Impl rule__Inertia__Group__5 )
            // InternalMyDsl.g:3106:2: rule__Inertia__Group__4__Impl rule__Inertia__Group__5
            {
            pushFollow(FOLLOW_26);
            rule__Inertia__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertia__Group__5();

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
    // $ANTLR end "rule__Inertia__Group__4"


    // $ANTLR start "rule__Inertia__Group__4__Impl"
    // InternalMyDsl.g:3113:1: rule__Inertia__Group__4__Impl : ( ( rule__Inertia__IxxAssignment_4 ) ) ;
    public final void rule__Inertia__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3117:1: ( ( ( rule__Inertia__IxxAssignment_4 ) ) )
            // InternalMyDsl.g:3118:1: ( ( rule__Inertia__IxxAssignment_4 ) )
            {
            // InternalMyDsl.g:3118:1: ( ( rule__Inertia__IxxAssignment_4 ) )
            // InternalMyDsl.g:3119:2: ( rule__Inertia__IxxAssignment_4 )
            {
             before(grammarAccess.getInertiaAccess().getIxxAssignment_4()); 
            // InternalMyDsl.g:3120:2: ( rule__Inertia__IxxAssignment_4 )
            // InternalMyDsl.g:3120:3: rule__Inertia__IxxAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Inertia__IxxAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getInertiaAccess().getIxxAssignment_4()); 

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
    // $ANTLR end "rule__Inertia__Group__4__Impl"


    // $ANTLR start "rule__Inertia__Group__5"
    // InternalMyDsl.g:3128:1: rule__Inertia__Group__5 : rule__Inertia__Group__5__Impl rule__Inertia__Group__6 ;
    public final void rule__Inertia__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3132:1: ( rule__Inertia__Group__5__Impl rule__Inertia__Group__6 )
            // InternalMyDsl.g:3133:2: rule__Inertia__Group__5__Impl rule__Inertia__Group__6
            {
            pushFollow(FOLLOW_25);
            rule__Inertia__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertia__Group__6();

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
    // $ANTLR end "rule__Inertia__Group__5"


    // $ANTLR start "rule__Inertia__Group__5__Impl"
    // InternalMyDsl.g:3140:1: rule__Inertia__Group__5__Impl : ( 'ixy' ) ;
    public final void rule__Inertia__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3144:1: ( ( 'ixy' ) )
            // InternalMyDsl.g:3145:1: ( 'ixy' )
            {
            // InternalMyDsl.g:3145:1: ( 'ixy' )
            // InternalMyDsl.g:3146:2: 'ixy'
            {
             before(grammarAccess.getInertiaAccess().getIxyKeyword_5()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getInertiaAccess().getIxyKeyword_5()); 

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
    // $ANTLR end "rule__Inertia__Group__5__Impl"


    // $ANTLR start "rule__Inertia__Group__6"
    // InternalMyDsl.g:3155:1: rule__Inertia__Group__6 : rule__Inertia__Group__6__Impl rule__Inertia__Group__7 ;
    public final void rule__Inertia__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3159:1: ( rule__Inertia__Group__6__Impl rule__Inertia__Group__7 )
            // InternalMyDsl.g:3160:2: rule__Inertia__Group__6__Impl rule__Inertia__Group__7
            {
            pushFollow(FOLLOW_27);
            rule__Inertia__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertia__Group__7();

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
    // $ANTLR end "rule__Inertia__Group__6"


    // $ANTLR start "rule__Inertia__Group__6__Impl"
    // InternalMyDsl.g:3167:1: rule__Inertia__Group__6__Impl : ( ( rule__Inertia__IxyAssignment_6 ) ) ;
    public final void rule__Inertia__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3171:1: ( ( ( rule__Inertia__IxyAssignment_6 ) ) )
            // InternalMyDsl.g:3172:1: ( ( rule__Inertia__IxyAssignment_6 ) )
            {
            // InternalMyDsl.g:3172:1: ( ( rule__Inertia__IxyAssignment_6 ) )
            // InternalMyDsl.g:3173:2: ( rule__Inertia__IxyAssignment_6 )
            {
             before(grammarAccess.getInertiaAccess().getIxyAssignment_6()); 
            // InternalMyDsl.g:3174:2: ( rule__Inertia__IxyAssignment_6 )
            // InternalMyDsl.g:3174:3: rule__Inertia__IxyAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Inertia__IxyAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getInertiaAccess().getIxyAssignment_6()); 

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
    // $ANTLR end "rule__Inertia__Group__6__Impl"


    // $ANTLR start "rule__Inertia__Group__7"
    // InternalMyDsl.g:3182:1: rule__Inertia__Group__7 : rule__Inertia__Group__7__Impl rule__Inertia__Group__8 ;
    public final void rule__Inertia__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3186:1: ( rule__Inertia__Group__7__Impl rule__Inertia__Group__8 )
            // InternalMyDsl.g:3187:2: rule__Inertia__Group__7__Impl rule__Inertia__Group__8
            {
            pushFollow(FOLLOW_25);
            rule__Inertia__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertia__Group__8();

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
    // $ANTLR end "rule__Inertia__Group__7"


    // $ANTLR start "rule__Inertia__Group__7__Impl"
    // InternalMyDsl.g:3194:1: rule__Inertia__Group__7__Impl : ( 'ixz' ) ;
    public final void rule__Inertia__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3198:1: ( ( 'ixz' ) )
            // InternalMyDsl.g:3199:1: ( 'ixz' )
            {
            // InternalMyDsl.g:3199:1: ( 'ixz' )
            // InternalMyDsl.g:3200:2: 'ixz'
            {
             before(grammarAccess.getInertiaAccess().getIxzKeyword_7()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getInertiaAccess().getIxzKeyword_7()); 

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
    // $ANTLR end "rule__Inertia__Group__7__Impl"


    // $ANTLR start "rule__Inertia__Group__8"
    // InternalMyDsl.g:3209:1: rule__Inertia__Group__8 : rule__Inertia__Group__8__Impl rule__Inertia__Group__9 ;
    public final void rule__Inertia__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3213:1: ( rule__Inertia__Group__8__Impl rule__Inertia__Group__9 )
            // InternalMyDsl.g:3214:2: rule__Inertia__Group__8__Impl rule__Inertia__Group__9
            {
            pushFollow(FOLLOW_28);
            rule__Inertia__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertia__Group__9();

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
    // $ANTLR end "rule__Inertia__Group__8"


    // $ANTLR start "rule__Inertia__Group__8__Impl"
    // InternalMyDsl.g:3221:1: rule__Inertia__Group__8__Impl : ( ( rule__Inertia__IxzAssignment_8 ) ) ;
    public final void rule__Inertia__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3225:1: ( ( ( rule__Inertia__IxzAssignment_8 ) ) )
            // InternalMyDsl.g:3226:1: ( ( rule__Inertia__IxzAssignment_8 ) )
            {
            // InternalMyDsl.g:3226:1: ( ( rule__Inertia__IxzAssignment_8 ) )
            // InternalMyDsl.g:3227:2: ( rule__Inertia__IxzAssignment_8 )
            {
             before(grammarAccess.getInertiaAccess().getIxzAssignment_8()); 
            // InternalMyDsl.g:3228:2: ( rule__Inertia__IxzAssignment_8 )
            // InternalMyDsl.g:3228:3: rule__Inertia__IxzAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Inertia__IxzAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getInertiaAccess().getIxzAssignment_8()); 

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
    // $ANTLR end "rule__Inertia__Group__8__Impl"


    // $ANTLR start "rule__Inertia__Group__9"
    // InternalMyDsl.g:3236:1: rule__Inertia__Group__9 : rule__Inertia__Group__9__Impl rule__Inertia__Group__10 ;
    public final void rule__Inertia__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3240:1: ( rule__Inertia__Group__9__Impl rule__Inertia__Group__10 )
            // InternalMyDsl.g:3241:2: rule__Inertia__Group__9__Impl rule__Inertia__Group__10
            {
            pushFollow(FOLLOW_25);
            rule__Inertia__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertia__Group__10();

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
    // $ANTLR end "rule__Inertia__Group__9"


    // $ANTLR start "rule__Inertia__Group__9__Impl"
    // InternalMyDsl.g:3248:1: rule__Inertia__Group__9__Impl : ( 'iyy' ) ;
    public final void rule__Inertia__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3252:1: ( ( 'iyy' ) )
            // InternalMyDsl.g:3253:1: ( 'iyy' )
            {
            // InternalMyDsl.g:3253:1: ( 'iyy' )
            // InternalMyDsl.g:3254:2: 'iyy'
            {
             before(grammarAccess.getInertiaAccess().getIyyKeyword_9()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getInertiaAccess().getIyyKeyword_9()); 

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
    // $ANTLR end "rule__Inertia__Group__9__Impl"


    // $ANTLR start "rule__Inertia__Group__10"
    // InternalMyDsl.g:3263:1: rule__Inertia__Group__10 : rule__Inertia__Group__10__Impl rule__Inertia__Group__11 ;
    public final void rule__Inertia__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3267:1: ( rule__Inertia__Group__10__Impl rule__Inertia__Group__11 )
            // InternalMyDsl.g:3268:2: rule__Inertia__Group__10__Impl rule__Inertia__Group__11
            {
            pushFollow(FOLLOW_29);
            rule__Inertia__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertia__Group__11();

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
    // $ANTLR end "rule__Inertia__Group__10"


    // $ANTLR start "rule__Inertia__Group__10__Impl"
    // InternalMyDsl.g:3275:1: rule__Inertia__Group__10__Impl : ( ( rule__Inertia__IyyAssignment_10 ) ) ;
    public final void rule__Inertia__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3279:1: ( ( ( rule__Inertia__IyyAssignment_10 ) ) )
            // InternalMyDsl.g:3280:1: ( ( rule__Inertia__IyyAssignment_10 ) )
            {
            // InternalMyDsl.g:3280:1: ( ( rule__Inertia__IyyAssignment_10 ) )
            // InternalMyDsl.g:3281:2: ( rule__Inertia__IyyAssignment_10 )
            {
             before(grammarAccess.getInertiaAccess().getIyyAssignment_10()); 
            // InternalMyDsl.g:3282:2: ( rule__Inertia__IyyAssignment_10 )
            // InternalMyDsl.g:3282:3: rule__Inertia__IyyAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Inertia__IyyAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getInertiaAccess().getIyyAssignment_10()); 

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
    // $ANTLR end "rule__Inertia__Group__10__Impl"


    // $ANTLR start "rule__Inertia__Group__11"
    // InternalMyDsl.g:3290:1: rule__Inertia__Group__11 : rule__Inertia__Group__11__Impl rule__Inertia__Group__12 ;
    public final void rule__Inertia__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3294:1: ( rule__Inertia__Group__11__Impl rule__Inertia__Group__12 )
            // InternalMyDsl.g:3295:2: rule__Inertia__Group__11__Impl rule__Inertia__Group__12
            {
            pushFollow(FOLLOW_25);
            rule__Inertia__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertia__Group__12();

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
    // $ANTLR end "rule__Inertia__Group__11"


    // $ANTLR start "rule__Inertia__Group__11__Impl"
    // InternalMyDsl.g:3302:1: rule__Inertia__Group__11__Impl : ( 'iyz' ) ;
    public final void rule__Inertia__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3306:1: ( ( 'iyz' ) )
            // InternalMyDsl.g:3307:1: ( 'iyz' )
            {
            // InternalMyDsl.g:3307:1: ( 'iyz' )
            // InternalMyDsl.g:3308:2: 'iyz'
            {
             before(grammarAccess.getInertiaAccess().getIyzKeyword_11()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getInertiaAccess().getIyzKeyword_11()); 

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
    // $ANTLR end "rule__Inertia__Group__11__Impl"


    // $ANTLR start "rule__Inertia__Group__12"
    // InternalMyDsl.g:3317:1: rule__Inertia__Group__12 : rule__Inertia__Group__12__Impl rule__Inertia__Group__13 ;
    public final void rule__Inertia__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3321:1: ( rule__Inertia__Group__12__Impl rule__Inertia__Group__13 )
            // InternalMyDsl.g:3322:2: rule__Inertia__Group__12__Impl rule__Inertia__Group__13
            {
            pushFollow(FOLLOW_30);
            rule__Inertia__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertia__Group__13();

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
    // $ANTLR end "rule__Inertia__Group__12"


    // $ANTLR start "rule__Inertia__Group__12__Impl"
    // InternalMyDsl.g:3329:1: rule__Inertia__Group__12__Impl : ( ( rule__Inertia__IyzAssignment_12 ) ) ;
    public final void rule__Inertia__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3333:1: ( ( ( rule__Inertia__IyzAssignment_12 ) ) )
            // InternalMyDsl.g:3334:1: ( ( rule__Inertia__IyzAssignment_12 ) )
            {
            // InternalMyDsl.g:3334:1: ( ( rule__Inertia__IyzAssignment_12 ) )
            // InternalMyDsl.g:3335:2: ( rule__Inertia__IyzAssignment_12 )
            {
             before(grammarAccess.getInertiaAccess().getIyzAssignment_12()); 
            // InternalMyDsl.g:3336:2: ( rule__Inertia__IyzAssignment_12 )
            // InternalMyDsl.g:3336:3: rule__Inertia__IyzAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__Inertia__IyzAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getInertiaAccess().getIyzAssignment_12()); 

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
    // $ANTLR end "rule__Inertia__Group__12__Impl"


    // $ANTLR start "rule__Inertia__Group__13"
    // InternalMyDsl.g:3344:1: rule__Inertia__Group__13 : rule__Inertia__Group__13__Impl rule__Inertia__Group__14 ;
    public final void rule__Inertia__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3348:1: ( rule__Inertia__Group__13__Impl rule__Inertia__Group__14 )
            // InternalMyDsl.g:3349:2: rule__Inertia__Group__13__Impl rule__Inertia__Group__14
            {
            pushFollow(FOLLOW_25);
            rule__Inertia__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertia__Group__14();

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
    // $ANTLR end "rule__Inertia__Group__13"


    // $ANTLR start "rule__Inertia__Group__13__Impl"
    // InternalMyDsl.g:3356:1: rule__Inertia__Group__13__Impl : ( 'izz' ) ;
    public final void rule__Inertia__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3360:1: ( ( 'izz' ) )
            // InternalMyDsl.g:3361:1: ( 'izz' )
            {
            // InternalMyDsl.g:3361:1: ( 'izz' )
            // InternalMyDsl.g:3362:2: 'izz'
            {
             before(grammarAccess.getInertiaAccess().getIzzKeyword_13()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getInertiaAccess().getIzzKeyword_13()); 

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
    // $ANTLR end "rule__Inertia__Group__13__Impl"


    // $ANTLR start "rule__Inertia__Group__14"
    // InternalMyDsl.g:3371:1: rule__Inertia__Group__14 : rule__Inertia__Group__14__Impl ;
    public final void rule__Inertia__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3375:1: ( rule__Inertia__Group__14__Impl )
            // InternalMyDsl.g:3376:2: rule__Inertia__Group__14__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Inertia__Group__14__Impl();

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
    // $ANTLR end "rule__Inertia__Group__14"


    // $ANTLR start "rule__Inertia__Group__14__Impl"
    // InternalMyDsl.g:3382:1: rule__Inertia__Group__14__Impl : ( ( rule__Inertia__IzzAssignment_14 ) ) ;
    public final void rule__Inertia__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3386:1: ( ( ( rule__Inertia__IzzAssignment_14 ) ) )
            // InternalMyDsl.g:3387:1: ( ( rule__Inertia__IzzAssignment_14 ) )
            {
            // InternalMyDsl.g:3387:1: ( ( rule__Inertia__IzzAssignment_14 ) )
            // InternalMyDsl.g:3388:2: ( rule__Inertia__IzzAssignment_14 )
            {
             before(grammarAccess.getInertiaAccess().getIzzAssignment_14()); 
            // InternalMyDsl.g:3389:2: ( rule__Inertia__IzzAssignment_14 )
            // InternalMyDsl.g:3389:3: rule__Inertia__IzzAssignment_14
            {
            pushFollow(FOLLOW_2);
            rule__Inertia__IzzAssignment_14();

            state._fsp--;


            }

             after(grammarAccess.getInertiaAccess().getIzzAssignment_14()); 

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
    // $ANTLR end "rule__Inertia__Group__14__Impl"


    // $ANTLR start "rule__Visual__Group__0"
    // InternalMyDsl.g:3398:1: rule__Visual__Group__0 : rule__Visual__Group__0__Impl rule__Visual__Group__1 ;
    public final void rule__Visual__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3402:1: ( rule__Visual__Group__0__Impl rule__Visual__Group__1 )
            // InternalMyDsl.g:3403:2: rule__Visual__Group__0__Impl rule__Visual__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__Visual__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Visual__Group__1();

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
    // $ANTLR end "rule__Visual__Group__0"


    // $ANTLR start "rule__Visual__Group__0__Impl"
    // InternalMyDsl.g:3410:1: rule__Visual__Group__0__Impl : ( () ) ;
    public final void rule__Visual__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3414:1: ( ( () ) )
            // InternalMyDsl.g:3415:1: ( () )
            {
            // InternalMyDsl.g:3415:1: ( () )
            // InternalMyDsl.g:3416:2: ()
            {
             before(grammarAccess.getVisualAccess().getVisualAction_0()); 
            // InternalMyDsl.g:3417:2: ()
            // InternalMyDsl.g:3417:3: 
            {
            }

             after(grammarAccess.getVisualAccess().getVisualAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual__Group__0__Impl"


    // $ANTLR start "rule__Visual__Group__1"
    // InternalMyDsl.g:3425:1: rule__Visual__Group__1 : rule__Visual__Group__1__Impl rule__Visual__Group__2 ;
    public final void rule__Visual__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3429:1: ( rule__Visual__Group__1__Impl rule__Visual__Group__2 )
            // InternalMyDsl.g:3430:2: rule__Visual__Group__1__Impl rule__Visual__Group__2
            {
            pushFollow(FOLLOW_32);
            rule__Visual__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Visual__Group__2();

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
    // $ANTLR end "rule__Visual__Group__1"


    // $ANTLR start "rule__Visual__Group__1__Impl"
    // InternalMyDsl.g:3437:1: rule__Visual__Group__1__Impl : ( 'Visual' ) ;
    public final void rule__Visual__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3441:1: ( ( 'Visual' ) )
            // InternalMyDsl.g:3442:1: ( 'Visual' )
            {
            // InternalMyDsl.g:3442:1: ( 'Visual' )
            // InternalMyDsl.g:3443:2: 'Visual'
            {
             before(grammarAccess.getVisualAccess().getVisualKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getVisualAccess().getVisualKeyword_1()); 

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
    // $ANTLR end "rule__Visual__Group__1__Impl"


    // $ANTLR start "rule__Visual__Group__2"
    // InternalMyDsl.g:3452:1: rule__Visual__Group__2 : rule__Visual__Group__2__Impl rule__Visual__Group__3 ;
    public final void rule__Visual__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3456:1: ( rule__Visual__Group__2__Impl rule__Visual__Group__3 )
            // InternalMyDsl.g:3457:2: rule__Visual__Group__2__Impl rule__Visual__Group__3
            {
            pushFollow(FOLLOW_32);
            rule__Visual__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Visual__Group__3();

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
    // $ANTLR end "rule__Visual__Group__2"


    // $ANTLR start "rule__Visual__Group__2__Impl"
    // InternalMyDsl.g:3464:1: rule__Visual__Group__2__Impl : ( ( rule__Visual__NameAssignment_2 )? ) ;
    public final void rule__Visual__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3468:1: ( ( ( rule__Visual__NameAssignment_2 )? ) )
            // InternalMyDsl.g:3469:1: ( ( rule__Visual__NameAssignment_2 )? )
            {
            // InternalMyDsl.g:3469:1: ( ( rule__Visual__NameAssignment_2 )? )
            // InternalMyDsl.g:3470:2: ( rule__Visual__NameAssignment_2 )?
            {
             before(grammarAccess.getVisualAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:3471:2: ( rule__Visual__NameAssignment_2 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_ID) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalMyDsl.g:3471:3: rule__Visual__NameAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Visual__NameAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVisualAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Visual__Group__2__Impl"


    // $ANTLR start "rule__Visual__Group__3"
    // InternalMyDsl.g:3479:1: rule__Visual__Group__3 : rule__Visual__Group__3__Impl rule__Visual__Group__4 ;
    public final void rule__Visual__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3483:1: ( rule__Visual__Group__3__Impl rule__Visual__Group__4 )
            // InternalMyDsl.g:3484:2: rule__Visual__Group__3__Impl rule__Visual__Group__4
            {
            pushFollow(FOLLOW_33);
            rule__Visual__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Visual__Group__4();

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
    // $ANTLR end "rule__Visual__Group__3"


    // $ANTLR start "rule__Visual__Group__3__Impl"
    // InternalMyDsl.g:3491:1: rule__Visual__Group__3__Impl : ( 'Geometry' ) ;
    public final void rule__Visual__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3495:1: ( ( 'Geometry' ) )
            // InternalMyDsl.g:3496:1: ( 'Geometry' )
            {
            // InternalMyDsl.g:3496:1: ( 'Geometry' )
            // InternalMyDsl.g:3497:2: 'Geometry'
            {
             before(grammarAccess.getVisualAccess().getGeometryKeyword_3()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getVisualAccess().getGeometryKeyword_3()); 

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
    // $ANTLR end "rule__Visual__Group__3__Impl"


    // $ANTLR start "rule__Visual__Group__4"
    // InternalMyDsl.g:3506:1: rule__Visual__Group__4 : rule__Visual__Group__4__Impl rule__Visual__Group__5 ;
    public final void rule__Visual__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3510:1: ( rule__Visual__Group__4__Impl rule__Visual__Group__5 )
            // InternalMyDsl.g:3511:2: rule__Visual__Group__4__Impl rule__Visual__Group__5
            {
            pushFollow(FOLLOW_34);
            rule__Visual__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Visual__Group__5();

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
    // $ANTLR end "rule__Visual__Group__4"


    // $ANTLR start "rule__Visual__Group__4__Impl"
    // InternalMyDsl.g:3518:1: rule__Visual__Group__4__Impl : ( ( rule__Visual__GeometryAssignment_4 ) ) ;
    public final void rule__Visual__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3522:1: ( ( ( rule__Visual__GeometryAssignment_4 ) ) )
            // InternalMyDsl.g:3523:1: ( ( rule__Visual__GeometryAssignment_4 ) )
            {
            // InternalMyDsl.g:3523:1: ( ( rule__Visual__GeometryAssignment_4 ) )
            // InternalMyDsl.g:3524:2: ( rule__Visual__GeometryAssignment_4 )
            {
             before(grammarAccess.getVisualAccess().getGeometryAssignment_4()); 
            // InternalMyDsl.g:3525:2: ( rule__Visual__GeometryAssignment_4 )
            // InternalMyDsl.g:3525:3: rule__Visual__GeometryAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Visual__GeometryAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getVisualAccess().getGeometryAssignment_4()); 

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
    // $ANTLR end "rule__Visual__Group__4__Impl"


    // $ANTLR start "rule__Visual__Group__5"
    // InternalMyDsl.g:3533:1: rule__Visual__Group__5 : rule__Visual__Group__5__Impl rule__Visual__Group__6 ;
    public final void rule__Visual__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3537:1: ( rule__Visual__Group__5__Impl rule__Visual__Group__6 )
            // InternalMyDsl.g:3538:2: rule__Visual__Group__5__Impl rule__Visual__Group__6
            {
            pushFollow(FOLLOW_34);
            rule__Visual__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Visual__Group__6();

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
    // $ANTLR end "rule__Visual__Group__5"


    // $ANTLR start "rule__Visual__Group__5__Impl"
    // InternalMyDsl.g:3545:1: rule__Visual__Group__5__Impl : ( ( rule__Visual__OriginAssignment_5 )? ) ;
    public final void rule__Visual__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3549:1: ( ( ( rule__Visual__OriginAssignment_5 )? ) )
            // InternalMyDsl.g:3550:1: ( ( rule__Visual__OriginAssignment_5 )? )
            {
            // InternalMyDsl.g:3550:1: ( ( rule__Visual__OriginAssignment_5 )? )
            // InternalMyDsl.g:3551:2: ( rule__Visual__OriginAssignment_5 )?
            {
             before(grammarAccess.getVisualAccess().getOriginAssignment_5()); 
            // InternalMyDsl.g:3552:2: ( rule__Visual__OriginAssignment_5 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==40) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalMyDsl.g:3552:3: rule__Visual__OriginAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Visual__OriginAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVisualAccess().getOriginAssignment_5()); 

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
    // $ANTLR end "rule__Visual__Group__5__Impl"


    // $ANTLR start "rule__Visual__Group__6"
    // InternalMyDsl.g:3560:1: rule__Visual__Group__6 : rule__Visual__Group__6__Impl ;
    public final void rule__Visual__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3564:1: ( rule__Visual__Group__6__Impl )
            // InternalMyDsl.g:3565:2: rule__Visual__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Visual__Group__6__Impl();

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
    // $ANTLR end "rule__Visual__Group__6"


    // $ANTLR start "rule__Visual__Group__6__Impl"
    // InternalMyDsl.g:3571:1: rule__Visual__Group__6__Impl : ( ( rule__Visual__Group_6__0 )? ) ;
    public final void rule__Visual__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3575:1: ( ( ( rule__Visual__Group_6__0 )? ) )
            // InternalMyDsl.g:3576:1: ( ( rule__Visual__Group_6__0 )? )
            {
            // InternalMyDsl.g:3576:1: ( ( rule__Visual__Group_6__0 )? )
            // InternalMyDsl.g:3577:2: ( rule__Visual__Group_6__0 )?
            {
             before(grammarAccess.getVisualAccess().getGroup_6()); 
            // InternalMyDsl.g:3578:2: ( rule__Visual__Group_6__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==39) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalMyDsl.g:3578:3: rule__Visual__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Visual__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVisualAccess().getGroup_6()); 

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
    // $ANTLR end "rule__Visual__Group__6__Impl"


    // $ANTLR start "rule__Visual__Group_6__0"
    // InternalMyDsl.g:3587:1: rule__Visual__Group_6__0 : rule__Visual__Group_6__0__Impl rule__Visual__Group_6__1 ;
    public final void rule__Visual__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3591:1: ( rule__Visual__Group_6__0__Impl rule__Visual__Group_6__1 )
            // InternalMyDsl.g:3592:2: rule__Visual__Group_6__0__Impl rule__Visual__Group_6__1
            {
            pushFollow(FOLLOW_35);
            rule__Visual__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Visual__Group_6__1();

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
    // $ANTLR end "rule__Visual__Group_6__0"


    // $ANTLR start "rule__Visual__Group_6__0__Impl"
    // InternalMyDsl.g:3599:1: rule__Visual__Group_6__0__Impl : ( 'Material' ) ;
    public final void rule__Visual__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3603:1: ( ( 'Material' ) )
            // InternalMyDsl.g:3604:1: ( 'Material' )
            {
            // InternalMyDsl.g:3604:1: ( 'Material' )
            // InternalMyDsl.g:3605:2: 'Material'
            {
             before(grammarAccess.getVisualAccess().getMaterialKeyword_6_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getVisualAccess().getMaterialKeyword_6_0()); 

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
    // $ANTLR end "rule__Visual__Group_6__0__Impl"


    // $ANTLR start "rule__Visual__Group_6__1"
    // InternalMyDsl.g:3614:1: rule__Visual__Group_6__1 : rule__Visual__Group_6__1__Impl ;
    public final void rule__Visual__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3618:1: ( rule__Visual__Group_6__1__Impl )
            // InternalMyDsl.g:3619:2: rule__Visual__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Visual__Group_6__1__Impl();

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
    // $ANTLR end "rule__Visual__Group_6__1"


    // $ANTLR start "rule__Visual__Group_6__1__Impl"
    // InternalMyDsl.g:3625:1: rule__Visual__Group_6__1__Impl : ( ( rule__Visual__MaterialAssignment_6_1 ) ) ;
    public final void rule__Visual__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3629:1: ( ( ( rule__Visual__MaterialAssignment_6_1 ) ) )
            // InternalMyDsl.g:3630:1: ( ( rule__Visual__MaterialAssignment_6_1 ) )
            {
            // InternalMyDsl.g:3630:1: ( ( rule__Visual__MaterialAssignment_6_1 ) )
            // InternalMyDsl.g:3631:2: ( rule__Visual__MaterialAssignment_6_1 )
            {
             before(grammarAccess.getVisualAccess().getMaterialAssignment_6_1()); 
            // InternalMyDsl.g:3632:2: ( rule__Visual__MaterialAssignment_6_1 )
            // InternalMyDsl.g:3632:3: rule__Visual__MaterialAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Visual__MaterialAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getVisualAccess().getMaterialAssignment_6_1()); 

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
    // $ANTLR end "rule__Visual__Group_6__1__Impl"


    // $ANTLR start "rule__Origin__Group__0"
    // InternalMyDsl.g:3641:1: rule__Origin__Group__0 : rule__Origin__Group__0__Impl rule__Origin__Group__1 ;
    public final void rule__Origin__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3645:1: ( rule__Origin__Group__0__Impl rule__Origin__Group__1 )
            // InternalMyDsl.g:3646:2: rule__Origin__Group__0__Impl rule__Origin__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Origin__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Origin__Group__1();

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
    // $ANTLR end "rule__Origin__Group__0"


    // $ANTLR start "rule__Origin__Group__0__Impl"
    // InternalMyDsl.g:3653:1: rule__Origin__Group__0__Impl : ( () ) ;
    public final void rule__Origin__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3657:1: ( ( () ) )
            // InternalMyDsl.g:3658:1: ( () )
            {
            // InternalMyDsl.g:3658:1: ( () )
            // InternalMyDsl.g:3659:2: ()
            {
             before(grammarAccess.getOriginAccess().getOriginAction_0()); 
            // InternalMyDsl.g:3660:2: ()
            // InternalMyDsl.g:3660:3: 
            {
            }

             after(grammarAccess.getOriginAccess().getOriginAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group__0__Impl"


    // $ANTLR start "rule__Origin__Group__1"
    // InternalMyDsl.g:3668:1: rule__Origin__Group__1 : rule__Origin__Group__1__Impl rule__Origin__Group__2 ;
    public final void rule__Origin__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3672:1: ( rule__Origin__Group__1__Impl rule__Origin__Group__2 )
            // InternalMyDsl.g:3673:2: rule__Origin__Group__1__Impl rule__Origin__Group__2
            {
            pushFollow(FOLLOW_36);
            rule__Origin__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Origin__Group__2();

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
    // $ANTLR end "rule__Origin__Group__1"


    // $ANTLR start "rule__Origin__Group__1__Impl"
    // InternalMyDsl.g:3680:1: rule__Origin__Group__1__Impl : ( 'Origin' ) ;
    public final void rule__Origin__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3684:1: ( ( 'Origin' ) )
            // InternalMyDsl.g:3685:1: ( 'Origin' )
            {
            // InternalMyDsl.g:3685:1: ( 'Origin' )
            // InternalMyDsl.g:3686:2: 'Origin'
            {
             before(grammarAccess.getOriginAccess().getOriginKeyword_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getOriginAccess().getOriginKeyword_1()); 

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
    // $ANTLR end "rule__Origin__Group__1__Impl"


    // $ANTLR start "rule__Origin__Group__2"
    // InternalMyDsl.g:3695:1: rule__Origin__Group__2 : rule__Origin__Group__2__Impl rule__Origin__Group__3 ;
    public final void rule__Origin__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3699:1: ( rule__Origin__Group__2__Impl rule__Origin__Group__3 )
            // InternalMyDsl.g:3700:2: rule__Origin__Group__2__Impl rule__Origin__Group__3
            {
            pushFollow(FOLLOW_36);
            rule__Origin__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Origin__Group__3();

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
    // $ANTLR end "rule__Origin__Group__2"


    // $ANTLR start "rule__Origin__Group__2__Impl"
    // InternalMyDsl.g:3707:1: rule__Origin__Group__2__Impl : ( ( rule__Origin__NameAssignment_2 )? ) ;
    public final void rule__Origin__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3711:1: ( ( ( rule__Origin__NameAssignment_2 )? ) )
            // InternalMyDsl.g:3712:1: ( ( rule__Origin__NameAssignment_2 )? )
            {
            // InternalMyDsl.g:3712:1: ( ( rule__Origin__NameAssignment_2 )? )
            // InternalMyDsl.g:3713:2: ( rule__Origin__NameAssignment_2 )?
            {
             before(grammarAccess.getOriginAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:3714:2: ( rule__Origin__NameAssignment_2 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_ID) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalMyDsl.g:3714:3: rule__Origin__NameAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Origin__NameAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOriginAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Origin__Group__2__Impl"


    // $ANTLR start "rule__Origin__Group__3"
    // InternalMyDsl.g:3722:1: rule__Origin__Group__3 : rule__Origin__Group__3__Impl rule__Origin__Group__4 ;
    public final void rule__Origin__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3726:1: ( rule__Origin__Group__3__Impl rule__Origin__Group__4 )
            // InternalMyDsl.g:3727:2: rule__Origin__Group__3__Impl rule__Origin__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__Origin__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Origin__Group__4();

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
    // $ANTLR end "rule__Origin__Group__3"


    // $ANTLR start "rule__Origin__Group__3__Impl"
    // InternalMyDsl.g:3734:1: rule__Origin__Group__3__Impl : ( 'x' ) ;
    public final void rule__Origin__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3738:1: ( ( 'x' ) )
            // InternalMyDsl.g:3739:1: ( 'x' )
            {
            // InternalMyDsl.g:3739:1: ( 'x' )
            // InternalMyDsl.g:3740:2: 'x'
            {
             before(grammarAccess.getOriginAccess().getXKeyword_3()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getOriginAccess().getXKeyword_3()); 

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
    // $ANTLR end "rule__Origin__Group__3__Impl"


    // $ANTLR start "rule__Origin__Group__4"
    // InternalMyDsl.g:3749:1: rule__Origin__Group__4 : rule__Origin__Group__4__Impl rule__Origin__Group__5 ;
    public final void rule__Origin__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3753:1: ( rule__Origin__Group__4__Impl rule__Origin__Group__5 )
            // InternalMyDsl.g:3754:2: rule__Origin__Group__4__Impl rule__Origin__Group__5
            {
            pushFollow(FOLLOW_37);
            rule__Origin__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Origin__Group__5();

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
    // $ANTLR end "rule__Origin__Group__4"


    // $ANTLR start "rule__Origin__Group__4__Impl"
    // InternalMyDsl.g:3761:1: rule__Origin__Group__4__Impl : ( ( rule__Origin__XAssignment_4 ) ) ;
    public final void rule__Origin__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3765:1: ( ( ( rule__Origin__XAssignment_4 ) ) )
            // InternalMyDsl.g:3766:1: ( ( rule__Origin__XAssignment_4 ) )
            {
            // InternalMyDsl.g:3766:1: ( ( rule__Origin__XAssignment_4 ) )
            // InternalMyDsl.g:3767:2: ( rule__Origin__XAssignment_4 )
            {
             before(grammarAccess.getOriginAccess().getXAssignment_4()); 
            // InternalMyDsl.g:3768:2: ( rule__Origin__XAssignment_4 )
            // InternalMyDsl.g:3768:3: rule__Origin__XAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Origin__XAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getOriginAccess().getXAssignment_4()); 

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
    // $ANTLR end "rule__Origin__Group__4__Impl"


    // $ANTLR start "rule__Origin__Group__5"
    // InternalMyDsl.g:3776:1: rule__Origin__Group__5 : rule__Origin__Group__5__Impl rule__Origin__Group__6 ;
    public final void rule__Origin__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3780:1: ( rule__Origin__Group__5__Impl rule__Origin__Group__6 )
            // InternalMyDsl.g:3781:2: rule__Origin__Group__5__Impl rule__Origin__Group__6
            {
            pushFollow(FOLLOW_25);
            rule__Origin__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Origin__Group__6();

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
    // $ANTLR end "rule__Origin__Group__5"


    // $ANTLR start "rule__Origin__Group__5__Impl"
    // InternalMyDsl.g:3788:1: rule__Origin__Group__5__Impl : ( 'y' ) ;
    public final void rule__Origin__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3792:1: ( ( 'y' ) )
            // InternalMyDsl.g:3793:1: ( 'y' )
            {
            // InternalMyDsl.g:3793:1: ( 'y' )
            // InternalMyDsl.g:3794:2: 'y'
            {
             before(grammarAccess.getOriginAccess().getYKeyword_5()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getOriginAccess().getYKeyword_5()); 

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
    // $ANTLR end "rule__Origin__Group__5__Impl"


    // $ANTLR start "rule__Origin__Group__6"
    // InternalMyDsl.g:3803:1: rule__Origin__Group__6 : rule__Origin__Group__6__Impl rule__Origin__Group__7 ;
    public final void rule__Origin__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3807:1: ( rule__Origin__Group__6__Impl rule__Origin__Group__7 )
            // InternalMyDsl.g:3808:2: rule__Origin__Group__6__Impl rule__Origin__Group__7
            {
            pushFollow(FOLLOW_38);
            rule__Origin__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Origin__Group__7();

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
    // $ANTLR end "rule__Origin__Group__6"


    // $ANTLR start "rule__Origin__Group__6__Impl"
    // InternalMyDsl.g:3815:1: rule__Origin__Group__6__Impl : ( ( rule__Origin__YAssignment_6 ) ) ;
    public final void rule__Origin__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3819:1: ( ( ( rule__Origin__YAssignment_6 ) ) )
            // InternalMyDsl.g:3820:1: ( ( rule__Origin__YAssignment_6 ) )
            {
            // InternalMyDsl.g:3820:1: ( ( rule__Origin__YAssignment_6 ) )
            // InternalMyDsl.g:3821:2: ( rule__Origin__YAssignment_6 )
            {
             before(grammarAccess.getOriginAccess().getYAssignment_6()); 
            // InternalMyDsl.g:3822:2: ( rule__Origin__YAssignment_6 )
            // InternalMyDsl.g:3822:3: rule__Origin__YAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Origin__YAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getOriginAccess().getYAssignment_6()); 

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
    // $ANTLR end "rule__Origin__Group__6__Impl"


    // $ANTLR start "rule__Origin__Group__7"
    // InternalMyDsl.g:3830:1: rule__Origin__Group__7 : rule__Origin__Group__7__Impl rule__Origin__Group__8 ;
    public final void rule__Origin__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3834:1: ( rule__Origin__Group__7__Impl rule__Origin__Group__8 )
            // InternalMyDsl.g:3835:2: rule__Origin__Group__7__Impl rule__Origin__Group__8
            {
            pushFollow(FOLLOW_25);
            rule__Origin__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Origin__Group__8();

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
    // $ANTLR end "rule__Origin__Group__7"


    // $ANTLR start "rule__Origin__Group__7__Impl"
    // InternalMyDsl.g:3842:1: rule__Origin__Group__7__Impl : ( 'z' ) ;
    public final void rule__Origin__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3846:1: ( ( 'z' ) )
            // InternalMyDsl.g:3847:1: ( 'z' )
            {
            // InternalMyDsl.g:3847:1: ( 'z' )
            // InternalMyDsl.g:3848:2: 'z'
            {
             before(grammarAccess.getOriginAccess().getZKeyword_7()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getOriginAccess().getZKeyword_7()); 

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
    // $ANTLR end "rule__Origin__Group__7__Impl"


    // $ANTLR start "rule__Origin__Group__8"
    // InternalMyDsl.g:3857:1: rule__Origin__Group__8 : rule__Origin__Group__8__Impl rule__Origin__Group__9 ;
    public final void rule__Origin__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3861:1: ( rule__Origin__Group__8__Impl rule__Origin__Group__9 )
            // InternalMyDsl.g:3862:2: rule__Origin__Group__8__Impl rule__Origin__Group__9
            {
            pushFollow(FOLLOW_39);
            rule__Origin__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Origin__Group__9();

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
    // $ANTLR end "rule__Origin__Group__8"


    // $ANTLR start "rule__Origin__Group__8__Impl"
    // InternalMyDsl.g:3869:1: rule__Origin__Group__8__Impl : ( ( rule__Origin__ZAssignment_8 ) ) ;
    public final void rule__Origin__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3873:1: ( ( ( rule__Origin__ZAssignment_8 ) ) )
            // InternalMyDsl.g:3874:1: ( ( rule__Origin__ZAssignment_8 ) )
            {
            // InternalMyDsl.g:3874:1: ( ( rule__Origin__ZAssignment_8 ) )
            // InternalMyDsl.g:3875:2: ( rule__Origin__ZAssignment_8 )
            {
             before(grammarAccess.getOriginAccess().getZAssignment_8()); 
            // InternalMyDsl.g:3876:2: ( rule__Origin__ZAssignment_8 )
            // InternalMyDsl.g:3876:3: rule__Origin__ZAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Origin__ZAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getOriginAccess().getZAssignment_8()); 

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
    // $ANTLR end "rule__Origin__Group__8__Impl"


    // $ANTLR start "rule__Origin__Group__9"
    // InternalMyDsl.g:3884:1: rule__Origin__Group__9 : rule__Origin__Group__9__Impl rule__Origin__Group__10 ;
    public final void rule__Origin__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3888:1: ( rule__Origin__Group__9__Impl rule__Origin__Group__10 )
            // InternalMyDsl.g:3889:2: rule__Origin__Group__9__Impl rule__Origin__Group__10
            {
            pushFollow(FOLLOW_39);
            rule__Origin__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Origin__Group__10();

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
    // $ANTLR end "rule__Origin__Group__9"


    // $ANTLR start "rule__Origin__Group__9__Impl"
    // InternalMyDsl.g:3896:1: rule__Origin__Group__9__Impl : ( ( rule__Origin__Group_9__0 )? ) ;
    public final void rule__Origin__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3900:1: ( ( ( rule__Origin__Group_9__0 )? ) )
            // InternalMyDsl.g:3901:1: ( ( rule__Origin__Group_9__0 )? )
            {
            // InternalMyDsl.g:3901:1: ( ( rule__Origin__Group_9__0 )? )
            // InternalMyDsl.g:3902:2: ( rule__Origin__Group_9__0 )?
            {
             before(grammarAccess.getOriginAccess().getGroup_9()); 
            // InternalMyDsl.g:3903:2: ( rule__Origin__Group_9__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==44) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalMyDsl.g:3903:3: rule__Origin__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Origin__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOriginAccess().getGroup_9()); 

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
    // $ANTLR end "rule__Origin__Group__9__Impl"


    // $ANTLR start "rule__Origin__Group__10"
    // InternalMyDsl.g:3911:1: rule__Origin__Group__10 : rule__Origin__Group__10__Impl rule__Origin__Group__11 ;
    public final void rule__Origin__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3915:1: ( rule__Origin__Group__10__Impl rule__Origin__Group__11 )
            // InternalMyDsl.g:3916:2: rule__Origin__Group__10__Impl rule__Origin__Group__11
            {
            pushFollow(FOLLOW_39);
            rule__Origin__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Origin__Group__11();

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
    // $ANTLR end "rule__Origin__Group__10"


    // $ANTLR start "rule__Origin__Group__10__Impl"
    // InternalMyDsl.g:3923:1: rule__Origin__Group__10__Impl : ( ( rule__Origin__Group_10__0 )? ) ;
    public final void rule__Origin__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3927:1: ( ( ( rule__Origin__Group_10__0 )? ) )
            // InternalMyDsl.g:3928:1: ( ( rule__Origin__Group_10__0 )? )
            {
            // InternalMyDsl.g:3928:1: ( ( rule__Origin__Group_10__0 )? )
            // InternalMyDsl.g:3929:2: ( rule__Origin__Group_10__0 )?
            {
             before(grammarAccess.getOriginAccess().getGroup_10()); 
            // InternalMyDsl.g:3930:2: ( rule__Origin__Group_10__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==45) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalMyDsl.g:3930:3: rule__Origin__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Origin__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOriginAccess().getGroup_10()); 

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
    // $ANTLR end "rule__Origin__Group__10__Impl"


    // $ANTLR start "rule__Origin__Group__11"
    // InternalMyDsl.g:3938:1: rule__Origin__Group__11 : rule__Origin__Group__11__Impl ;
    public final void rule__Origin__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3942:1: ( rule__Origin__Group__11__Impl )
            // InternalMyDsl.g:3943:2: rule__Origin__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Origin__Group__11__Impl();

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
    // $ANTLR end "rule__Origin__Group__11"


    // $ANTLR start "rule__Origin__Group__11__Impl"
    // InternalMyDsl.g:3949:1: rule__Origin__Group__11__Impl : ( ( rule__Origin__Group_11__0 )? ) ;
    public final void rule__Origin__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3953:1: ( ( ( rule__Origin__Group_11__0 )? ) )
            // InternalMyDsl.g:3954:1: ( ( rule__Origin__Group_11__0 )? )
            {
            // InternalMyDsl.g:3954:1: ( ( rule__Origin__Group_11__0 )? )
            // InternalMyDsl.g:3955:2: ( rule__Origin__Group_11__0 )?
            {
             before(grammarAccess.getOriginAccess().getGroup_11()); 
            // InternalMyDsl.g:3956:2: ( rule__Origin__Group_11__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==46) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalMyDsl.g:3956:3: rule__Origin__Group_11__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Origin__Group_11__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOriginAccess().getGroup_11()); 

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
    // $ANTLR end "rule__Origin__Group__11__Impl"


    // $ANTLR start "rule__Origin__Group_9__0"
    // InternalMyDsl.g:3965:1: rule__Origin__Group_9__0 : rule__Origin__Group_9__0__Impl rule__Origin__Group_9__1 ;
    public final void rule__Origin__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3969:1: ( rule__Origin__Group_9__0__Impl rule__Origin__Group_9__1 )
            // InternalMyDsl.g:3970:2: rule__Origin__Group_9__0__Impl rule__Origin__Group_9__1
            {
            pushFollow(FOLLOW_25);
            rule__Origin__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Origin__Group_9__1();

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
    // $ANTLR end "rule__Origin__Group_9__0"


    // $ANTLR start "rule__Origin__Group_9__0__Impl"
    // InternalMyDsl.g:3977:1: rule__Origin__Group_9__0__Impl : ( 'roll' ) ;
    public final void rule__Origin__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3981:1: ( ( 'roll' ) )
            // InternalMyDsl.g:3982:1: ( 'roll' )
            {
            // InternalMyDsl.g:3982:1: ( 'roll' )
            // InternalMyDsl.g:3983:2: 'roll'
            {
             before(grammarAccess.getOriginAccess().getRollKeyword_9_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getOriginAccess().getRollKeyword_9_0()); 

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
    // $ANTLR end "rule__Origin__Group_9__0__Impl"


    // $ANTLR start "rule__Origin__Group_9__1"
    // InternalMyDsl.g:3992:1: rule__Origin__Group_9__1 : rule__Origin__Group_9__1__Impl ;
    public final void rule__Origin__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3996:1: ( rule__Origin__Group_9__1__Impl )
            // InternalMyDsl.g:3997:2: rule__Origin__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Origin__Group_9__1__Impl();

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
    // $ANTLR end "rule__Origin__Group_9__1"


    // $ANTLR start "rule__Origin__Group_9__1__Impl"
    // InternalMyDsl.g:4003:1: rule__Origin__Group_9__1__Impl : ( ( rule__Origin__RollAssignment_9_1 ) ) ;
    public final void rule__Origin__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4007:1: ( ( ( rule__Origin__RollAssignment_9_1 ) ) )
            // InternalMyDsl.g:4008:1: ( ( rule__Origin__RollAssignment_9_1 ) )
            {
            // InternalMyDsl.g:4008:1: ( ( rule__Origin__RollAssignment_9_1 ) )
            // InternalMyDsl.g:4009:2: ( rule__Origin__RollAssignment_9_1 )
            {
             before(grammarAccess.getOriginAccess().getRollAssignment_9_1()); 
            // InternalMyDsl.g:4010:2: ( rule__Origin__RollAssignment_9_1 )
            // InternalMyDsl.g:4010:3: rule__Origin__RollAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__Origin__RollAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getOriginAccess().getRollAssignment_9_1()); 

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
    // $ANTLR end "rule__Origin__Group_9__1__Impl"


    // $ANTLR start "rule__Origin__Group_10__0"
    // InternalMyDsl.g:4019:1: rule__Origin__Group_10__0 : rule__Origin__Group_10__0__Impl rule__Origin__Group_10__1 ;
    public final void rule__Origin__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4023:1: ( rule__Origin__Group_10__0__Impl rule__Origin__Group_10__1 )
            // InternalMyDsl.g:4024:2: rule__Origin__Group_10__0__Impl rule__Origin__Group_10__1
            {
            pushFollow(FOLLOW_25);
            rule__Origin__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Origin__Group_10__1();

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
    // $ANTLR end "rule__Origin__Group_10__0"


    // $ANTLR start "rule__Origin__Group_10__0__Impl"
    // InternalMyDsl.g:4031:1: rule__Origin__Group_10__0__Impl : ( 'pitch' ) ;
    public final void rule__Origin__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4035:1: ( ( 'pitch' ) )
            // InternalMyDsl.g:4036:1: ( 'pitch' )
            {
            // InternalMyDsl.g:4036:1: ( 'pitch' )
            // InternalMyDsl.g:4037:2: 'pitch'
            {
             before(grammarAccess.getOriginAccess().getPitchKeyword_10_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getOriginAccess().getPitchKeyword_10_0()); 

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
    // $ANTLR end "rule__Origin__Group_10__0__Impl"


    // $ANTLR start "rule__Origin__Group_10__1"
    // InternalMyDsl.g:4046:1: rule__Origin__Group_10__1 : rule__Origin__Group_10__1__Impl ;
    public final void rule__Origin__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4050:1: ( rule__Origin__Group_10__1__Impl )
            // InternalMyDsl.g:4051:2: rule__Origin__Group_10__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Origin__Group_10__1__Impl();

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
    // $ANTLR end "rule__Origin__Group_10__1"


    // $ANTLR start "rule__Origin__Group_10__1__Impl"
    // InternalMyDsl.g:4057:1: rule__Origin__Group_10__1__Impl : ( ( rule__Origin__PitchAssignment_10_1 ) ) ;
    public final void rule__Origin__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4061:1: ( ( ( rule__Origin__PitchAssignment_10_1 ) ) )
            // InternalMyDsl.g:4062:1: ( ( rule__Origin__PitchAssignment_10_1 ) )
            {
            // InternalMyDsl.g:4062:1: ( ( rule__Origin__PitchAssignment_10_1 ) )
            // InternalMyDsl.g:4063:2: ( rule__Origin__PitchAssignment_10_1 )
            {
             before(grammarAccess.getOriginAccess().getPitchAssignment_10_1()); 
            // InternalMyDsl.g:4064:2: ( rule__Origin__PitchAssignment_10_1 )
            // InternalMyDsl.g:4064:3: rule__Origin__PitchAssignment_10_1
            {
            pushFollow(FOLLOW_2);
            rule__Origin__PitchAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getOriginAccess().getPitchAssignment_10_1()); 

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
    // $ANTLR end "rule__Origin__Group_10__1__Impl"


    // $ANTLR start "rule__Origin__Group_11__0"
    // InternalMyDsl.g:4073:1: rule__Origin__Group_11__0 : rule__Origin__Group_11__0__Impl rule__Origin__Group_11__1 ;
    public final void rule__Origin__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4077:1: ( rule__Origin__Group_11__0__Impl rule__Origin__Group_11__1 )
            // InternalMyDsl.g:4078:2: rule__Origin__Group_11__0__Impl rule__Origin__Group_11__1
            {
            pushFollow(FOLLOW_25);
            rule__Origin__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Origin__Group_11__1();

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
    // $ANTLR end "rule__Origin__Group_11__0"


    // $ANTLR start "rule__Origin__Group_11__0__Impl"
    // InternalMyDsl.g:4085:1: rule__Origin__Group_11__0__Impl : ( 'yaw' ) ;
    public final void rule__Origin__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4089:1: ( ( 'yaw' ) )
            // InternalMyDsl.g:4090:1: ( 'yaw' )
            {
            // InternalMyDsl.g:4090:1: ( 'yaw' )
            // InternalMyDsl.g:4091:2: 'yaw'
            {
             before(grammarAccess.getOriginAccess().getYawKeyword_11_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getOriginAccess().getYawKeyword_11_0()); 

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
    // $ANTLR end "rule__Origin__Group_11__0__Impl"


    // $ANTLR start "rule__Origin__Group_11__1"
    // InternalMyDsl.g:4100:1: rule__Origin__Group_11__1 : rule__Origin__Group_11__1__Impl ;
    public final void rule__Origin__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4104:1: ( rule__Origin__Group_11__1__Impl )
            // InternalMyDsl.g:4105:2: rule__Origin__Group_11__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Origin__Group_11__1__Impl();

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
    // $ANTLR end "rule__Origin__Group_11__1"


    // $ANTLR start "rule__Origin__Group_11__1__Impl"
    // InternalMyDsl.g:4111:1: rule__Origin__Group_11__1__Impl : ( ( rule__Origin__YawAssignment_11_1 ) ) ;
    public final void rule__Origin__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4115:1: ( ( ( rule__Origin__YawAssignment_11_1 ) ) )
            // InternalMyDsl.g:4116:1: ( ( rule__Origin__YawAssignment_11_1 ) )
            {
            // InternalMyDsl.g:4116:1: ( ( rule__Origin__YawAssignment_11_1 ) )
            // InternalMyDsl.g:4117:2: ( rule__Origin__YawAssignment_11_1 )
            {
             before(grammarAccess.getOriginAccess().getYawAssignment_11_1()); 
            // InternalMyDsl.g:4118:2: ( rule__Origin__YawAssignment_11_1 )
            // InternalMyDsl.g:4118:3: rule__Origin__YawAssignment_11_1
            {
            pushFollow(FOLLOW_2);
            rule__Origin__YawAssignment_11_1();

            state._fsp--;


            }

             after(grammarAccess.getOriginAccess().getYawAssignment_11_1()); 

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
    // $ANTLR end "rule__Origin__Group_11__1__Impl"


    // $ANTLR start "rule__Mass__Group__0"
    // InternalMyDsl.g:4127:1: rule__Mass__Group__0 : rule__Mass__Group__0__Impl rule__Mass__Group__1 ;
    public final void rule__Mass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4131:1: ( rule__Mass__Group__0__Impl rule__Mass__Group__1 )
            // InternalMyDsl.g:4132:2: rule__Mass__Group__0__Impl rule__Mass__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__Mass__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mass__Group__1();

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
    // $ANTLR end "rule__Mass__Group__0"


    // $ANTLR start "rule__Mass__Group__0__Impl"
    // InternalMyDsl.g:4139:1: rule__Mass__Group__0__Impl : ( () ) ;
    public final void rule__Mass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4143:1: ( ( () ) )
            // InternalMyDsl.g:4144:1: ( () )
            {
            // InternalMyDsl.g:4144:1: ( () )
            // InternalMyDsl.g:4145:2: ()
            {
             before(grammarAccess.getMassAccess().getMassAction_0()); 
            // InternalMyDsl.g:4146:2: ()
            // InternalMyDsl.g:4146:3: 
            {
            }

             after(grammarAccess.getMassAccess().getMassAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mass__Group__0__Impl"


    // $ANTLR start "rule__Mass__Group__1"
    // InternalMyDsl.g:4154:1: rule__Mass__Group__1 : rule__Mass__Group__1__Impl rule__Mass__Group__2 ;
    public final void rule__Mass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4158:1: ( rule__Mass__Group__1__Impl rule__Mass__Group__2 )
            // InternalMyDsl.g:4159:2: rule__Mass__Group__1__Impl rule__Mass__Group__2
            {
            pushFollow(FOLLOW_40);
            rule__Mass__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mass__Group__2();

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
    // $ANTLR end "rule__Mass__Group__1"


    // $ANTLR start "rule__Mass__Group__1__Impl"
    // InternalMyDsl.g:4166:1: rule__Mass__Group__1__Impl : ( 'Mass' ) ;
    public final void rule__Mass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4170:1: ( ( 'Mass' ) )
            // InternalMyDsl.g:4171:1: ( 'Mass' )
            {
            // InternalMyDsl.g:4171:1: ( 'Mass' )
            // InternalMyDsl.g:4172:2: 'Mass'
            {
             before(grammarAccess.getMassAccess().getMassKeyword_1()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getMassAccess().getMassKeyword_1()); 

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
    // $ANTLR end "rule__Mass__Group__1__Impl"


    // $ANTLR start "rule__Mass__Group__2"
    // InternalMyDsl.g:4181:1: rule__Mass__Group__2 : rule__Mass__Group__2__Impl rule__Mass__Group__3 ;
    public final void rule__Mass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4185:1: ( rule__Mass__Group__2__Impl rule__Mass__Group__3 )
            // InternalMyDsl.g:4186:2: rule__Mass__Group__2__Impl rule__Mass__Group__3
            {
            pushFollow(FOLLOW_40);
            rule__Mass__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mass__Group__3();

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
    // $ANTLR end "rule__Mass__Group__2"


    // $ANTLR start "rule__Mass__Group__2__Impl"
    // InternalMyDsl.g:4193:1: rule__Mass__Group__2__Impl : ( ( rule__Mass__NameAssignment_2 )? ) ;
    public final void rule__Mass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4197:1: ( ( ( rule__Mass__NameAssignment_2 )? ) )
            // InternalMyDsl.g:4198:1: ( ( rule__Mass__NameAssignment_2 )? )
            {
            // InternalMyDsl.g:4198:1: ( ( rule__Mass__NameAssignment_2 )? )
            // InternalMyDsl.g:4199:2: ( rule__Mass__NameAssignment_2 )?
            {
             before(grammarAccess.getMassAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:4200:2: ( rule__Mass__NameAssignment_2 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_ID) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalMyDsl.g:4200:3: rule__Mass__NameAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Mass__NameAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMassAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Mass__Group__2__Impl"


    // $ANTLR start "rule__Mass__Group__3"
    // InternalMyDsl.g:4208:1: rule__Mass__Group__3 : rule__Mass__Group__3__Impl rule__Mass__Group__4 ;
    public final void rule__Mass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4212:1: ( rule__Mass__Group__3__Impl rule__Mass__Group__4 )
            // InternalMyDsl.g:4213:2: rule__Mass__Group__3__Impl rule__Mass__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__Mass__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mass__Group__4();

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
    // $ANTLR end "rule__Mass__Group__3"


    // $ANTLR start "rule__Mass__Group__3__Impl"
    // InternalMyDsl.g:4220:1: rule__Mass__Group__3__Impl : ( 'massKilogram' ) ;
    public final void rule__Mass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4224:1: ( ( 'massKilogram' ) )
            // InternalMyDsl.g:4225:1: ( 'massKilogram' )
            {
            // InternalMyDsl.g:4225:1: ( 'massKilogram' )
            // InternalMyDsl.g:4226:2: 'massKilogram'
            {
             before(grammarAccess.getMassAccess().getMassKilogramKeyword_3()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getMassAccess().getMassKilogramKeyword_3()); 

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
    // $ANTLR end "rule__Mass__Group__3__Impl"


    // $ANTLR start "rule__Mass__Group__4"
    // InternalMyDsl.g:4235:1: rule__Mass__Group__4 : rule__Mass__Group__4__Impl ;
    public final void rule__Mass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4239:1: ( rule__Mass__Group__4__Impl )
            // InternalMyDsl.g:4240:2: rule__Mass__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mass__Group__4__Impl();

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
    // $ANTLR end "rule__Mass__Group__4"


    // $ANTLR start "rule__Mass__Group__4__Impl"
    // InternalMyDsl.g:4246:1: rule__Mass__Group__4__Impl : ( ( rule__Mass__MassKilogramAssignment_4 ) ) ;
    public final void rule__Mass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4250:1: ( ( ( rule__Mass__MassKilogramAssignment_4 ) ) )
            // InternalMyDsl.g:4251:1: ( ( rule__Mass__MassKilogramAssignment_4 ) )
            {
            // InternalMyDsl.g:4251:1: ( ( rule__Mass__MassKilogramAssignment_4 ) )
            // InternalMyDsl.g:4252:2: ( rule__Mass__MassKilogramAssignment_4 )
            {
             before(grammarAccess.getMassAccess().getMassKilogramAssignment_4()); 
            // InternalMyDsl.g:4253:2: ( rule__Mass__MassKilogramAssignment_4 )
            // InternalMyDsl.g:4253:3: rule__Mass__MassKilogramAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Mass__MassKilogramAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMassAccess().getMassKilogramAssignment_4()); 

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
    // $ANTLR end "rule__Mass__Group__4__Impl"


    // $ANTLR start "rule__Collision__Group__0"
    // InternalMyDsl.g:4262:1: rule__Collision__Group__0 : rule__Collision__Group__0__Impl rule__Collision__Group__1 ;
    public final void rule__Collision__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4266:1: ( rule__Collision__Group__0__Impl rule__Collision__Group__1 )
            // InternalMyDsl.g:4267:2: rule__Collision__Group__0__Impl rule__Collision__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__Collision__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Collision__Group__1();

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
    // $ANTLR end "rule__Collision__Group__0"


    // $ANTLR start "rule__Collision__Group__0__Impl"
    // InternalMyDsl.g:4274:1: rule__Collision__Group__0__Impl : ( 'Collision' ) ;
    public final void rule__Collision__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4278:1: ( ( 'Collision' ) )
            // InternalMyDsl.g:4279:1: ( 'Collision' )
            {
            // InternalMyDsl.g:4279:1: ( 'Collision' )
            // InternalMyDsl.g:4280:2: 'Collision'
            {
             before(grammarAccess.getCollisionAccess().getCollisionKeyword_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getCollisionAccess().getCollisionKeyword_0()); 

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
    // $ANTLR end "rule__Collision__Group__0__Impl"


    // $ANTLR start "rule__Collision__Group__1"
    // InternalMyDsl.g:4289:1: rule__Collision__Group__1 : rule__Collision__Group__1__Impl rule__Collision__Group__2 ;
    public final void rule__Collision__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4293:1: ( rule__Collision__Group__1__Impl rule__Collision__Group__2 )
            // InternalMyDsl.g:4294:2: rule__Collision__Group__1__Impl rule__Collision__Group__2
            {
            pushFollow(FOLLOW_32);
            rule__Collision__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Collision__Group__2();

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
    // $ANTLR end "rule__Collision__Group__1"


    // $ANTLR start "rule__Collision__Group__1__Impl"
    // InternalMyDsl.g:4301:1: rule__Collision__Group__1__Impl : ( ( rule__Collision__NameAssignment_1 )? ) ;
    public final void rule__Collision__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4305:1: ( ( ( rule__Collision__NameAssignment_1 )? ) )
            // InternalMyDsl.g:4306:1: ( ( rule__Collision__NameAssignment_1 )? )
            {
            // InternalMyDsl.g:4306:1: ( ( rule__Collision__NameAssignment_1 )? )
            // InternalMyDsl.g:4307:2: ( rule__Collision__NameAssignment_1 )?
            {
             before(grammarAccess.getCollisionAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:4308:2: ( rule__Collision__NameAssignment_1 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_ID) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalMyDsl.g:4308:3: rule__Collision__NameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Collision__NameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCollisionAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Collision__Group__1__Impl"


    // $ANTLR start "rule__Collision__Group__2"
    // InternalMyDsl.g:4316:1: rule__Collision__Group__2 : rule__Collision__Group__2__Impl rule__Collision__Group__3 ;
    public final void rule__Collision__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4320:1: ( rule__Collision__Group__2__Impl rule__Collision__Group__3 )
            // InternalMyDsl.g:4321:2: rule__Collision__Group__2__Impl rule__Collision__Group__3
            {
            pushFollow(FOLLOW_33);
            rule__Collision__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Collision__Group__3();

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
    // $ANTLR end "rule__Collision__Group__2"


    // $ANTLR start "rule__Collision__Group__2__Impl"
    // InternalMyDsl.g:4328:1: rule__Collision__Group__2__Impl : ( 'Geometry' ) ;
    public final void rule__Collision__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4332:1: ( ( 'Geometry' ) )
            // InternalMyDsl.g:4333:1: ( 'Geometry' )
            {
            // InternalMyDsl.g:4333:1: ( 'Geometry' )
            // InternalMyDsl.g:4334:2: 'Geometry'
            {
             before(grammarAccess.getCollisionAccess().getGeometryKeyword_2()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getCollisionAccess().getGeometryKeyword_2()); 

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
    // $ANTLR end "rule__Collision__Group__2__Impl"


    // $ANTLR start "rule__Collision__Group__3"
    // InternalMyDsl.g:4343:1: rule__Collision__Group__3 : rule__Collision__Group__3__Impl rule__Collision__Group__4 ;
    public final void rule__Collision__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4347:1: ( rule__Collision__Group__3__Impl rule__Collision__Group__4 )
            // InternalMyDsl.g:4348:2: rule__Collision__Group__3__Impl rule__Collision__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Collision__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Collision__Group__4();

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
    // $ANTLR end "rule__Collision__Group__3"


    // $ANTLR start "rule__Collision__Group__3__Impl"
    // InternalMyDsl.g:4355:1: rule__Collision__Group__3__Impl : ( ( rule__Collision__GeometryAssignment_3 ) ) ;
    public final void rule__Collision__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4359:1: ( ( ( rule__Collision__GeometryAssignment_3 ) ) )
            // InternalMyDsl.g:4360:1: ( ( rule__Collision__GeometryAssignment_3 ) )
            {
            // InternalMyDsl.g:4360:1: ( ( rule__Collision__GeometryAssignment_3 ) )
            // InternalMyDsl.g:4361:2: ( rule__Collision__GeometryAssignment_3 )
            {
             before(grammarAccess.getCollisionAccess().getGeometryAssignment_3()); 
            // InternalMyDsl.g:4362:2: ( rule__Collision__GeometryAssignment_3 )
            // InternalMyDsl.g:4362:3: rule__Collision__GeometryAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Collision__GeometryAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCollisionAccess().getGeometryAssignment_3()); 

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
    // $ANTLR end "rule__Collision__Group__3__Impl"


    // $ANTLR start "rule__Collision__Group__4"
    // InternalMyDsl.g:4370:1: rule__Collision__Group__4 : rule__Collision__Group__4__Impl ;
    public final void rule__Collision__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4374:1: ( rule__Collision__Group__4__Impl )
            // InternalMyDsl.g:4375:2: rule__Collision__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Collision__Group__4__Impl();

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
    // $ANTLR end "rule__Collision__Group__4"


    // $ANTLR start "rule__Collision__Group__4__Impl"
    // InternalMyDsl.g:4381:1: rule__Collision__Group__4__Impl : ( ( rule__Collision__OriginAssignment_4 )? ) ;
    public final void rule__Collision__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4385:1: ( ( ( rule__Collision__OriginAssignment_4 )? ) )
            // InternalMyDsl.g:4386:1: ( ( rule__Collision__OriginAssignment_4 )? )
            {
            // InternalMyDsl.g:4386:1: ( ( rule__Collision__OriginAssignment_4 )? )
            // InternalMyDsl.g:4387:2: ( rule__Collision__OriginAssignment_4 )?
            {
             before(grammarAccess.getCollisionAccess().getOriginAssignment_4()); 
            // InternalMyDsl.g:4388:2: ( rule__Collision__OriginAssignment_4 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==40) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalMyDsl.g:4388:3: rule__Collision__OriginAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Collision__OriginAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCollisionAccess().getOriginAssignment_4()); 

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
    // $ANTLR end "rule__Collision__Group__4__Impl"


    // $ANTLR start "rule__Box__Group__0"
    // InternalMyDsl.g:4397:1: rule__Box__Group__0 : rule__Box__Group__0__Impl rule__Box__Group__1 ;
    public final void rule__Box__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4401:1: ( rule__Box__Group__0__Impl rule__Box__Group__1 )
            // InternalMyDsl.g:4402:2: rule__Box__Group__0__Impl rule__Box__Group__1
            {
            pushFollow(FOLLOW_41);
            rule__Box__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group__1();

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
    // $ANTLR end "rule__Box__Group__0"


    // $ANTLR start "rule__Box__Group__0__Impl"
    // InternalMyDsl.g:4409:1: rule__Box__Group__0__Impl : ( 'Box' ) ;
    public final void rule__Box__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4413:1: ( ( 'Box' ) )
            // InternalMyDsl.g:4414:1: ( 'Box' )
            {
            // InternalMyDsl.g:4414:1: ( 'Box' )
            // InternalMyDsl.g:4415:2: 'Box'
            {
             before(grammarAccess.getBoxAccess().getBoxKeyword_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getBoxAccess().getBoxKeyword_0()); 

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
    // $ANTLR end "rule__Box__Group__0__Impl"


    // $ANTLR start "rule__Box__Group__1"
    // InternalMyDsl.g:4424:1: rule__Box__Group__1 : rule__Box__Group__1__Impl rule__Box__Group__2 ;
    public final void rule__Box__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4428:1: ( rule__Box__Group__1__Impl rule__Box__Group__2 )
            // InternalMyDsl.g:4429:2: rule__Box__Group__1__Impl rule__Box__Group__2
            {
            pushFollow(FOLLOW_41);
            rule__Box__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group__2();

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
    // $ANTLR end "rule__Box__Group__1"


    // $ANTLR start "rule__Box__Group__1__Impl"
    // InternalMyDsl.g:4436:1: rule__Box__Group__1__Impl : ( ( rule__Box__NameAssignment_1 )? ) ;
    public final void rule__Box__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4440:1: ( ( ( rule__Box__NameAssignment_1 )? ) )
            // InternalMyDsl.g:4441:1: ( ( rule__Box__NameAssignment_1 )? )
            {
            // InternalMyDsl.g:4441:1: ( ( rule__Box__NameAssignment_1 )? )
            // InternalMyDsl.g:4442:2: ( rule__Box__NameAssignment_1 )?
            {
             before(grammarAccess.getBoxAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:4443:2: ( rule__Box__NameAssignment_1 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_ID) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalMyDsl.g:4443:3: rule__Box__NameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Box__NameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBoxAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Box__Group__1__Impl"


    // $ANTLR start "rule__Box__Group__2"
    // InternalMyDsl.g:4451:1: rule__Box__Group__2 : rule__Box__Group__2__Impl rule__Box__Group__3 ;
    public final void rule__Box__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4455:1: ( rule__Box__Group__2__Impl rule__Box__Group__3 )
            // InternalMyDsl.g:4456:2: rule__Box__Group__2__Impl rule__Box__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__Box__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group__3();

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
    // $ANTLR end "rule__Box__Group__2"


    // $ANTLR start "rule__Box__Group__2__Impl"
    // InternalMyDsl.g:4463:1: rule__Box__Group__2__Impl : ( 'height' ) ;
    public final void rule__Box__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4467:1: ( ( 'height' ) )
            // InternalMyDsl.g:4468:1: ( 'height' )
            {
            // InternalMyDsl.g:4468:1: ( 'height' )
            // InternalMyDsl.g:4469:2: 'height'
            {
             before(grammarAccess.getBoxAccess().getHeightKeyword_2()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getBoxAccess().getHeightKeyword_2()); 

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
    // $ANTLR end "rule__Box__Group__2__Impl"


    // $ANTLR start "rule__Box__Group__3"
    // InternalMyDsl.g:4478:1: rule__Box__Group__3 : rule__Box__Group__3__Impl rule__Box__Group__4 ;
    public final void rule__Box__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4482:1: ( rule__Box__Group__3__Impl rule__Box__Group__4 )
            // InternalMyDsl.g:4483:2: rule__Box__Group__3__Impl rule__Box__Group__4
            {
            pushFollow(FOLLOW_42);
            rule__Box__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group__4();

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
    // $ANTLR end "rule__Box__Group__3"


    // $ANTLR start "rule__Box__Group__3__Impl"
    // InternalMyDsl.g:4490:1: rule__Box__Group__3__Impl : ( ( rule__Box__HeightAssignment_3 ) ) ;
    public final void rule__Box__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4494:1: ( ( ( rule__Box__HeightAssignment_3 ) ) )
            // InternalMyDsl.g:4495:1: ( ( rule__Box__HeightAssignment_3 ) )
            {
            // InternalMyDsl.g:4495:1: ( ( rule__Box__HeightAssignment_3 ) )
            // InternalMyDsl.g:4496:2: ( rule__Box__HeightAssignment_3 )
            {
             before(grammarAccess.getBoxAccess().getHeightAssignment_3()); 
            // InternalMyDsl.g:4497:2: ( rule__Box__HeightAssignment_3 )
            // InternalMyDsl.g:4497:3: rule__Box__HeightAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Box__HeightAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getBoxAccess().getHeightAssignment_3()); 

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
    // $ANTLR end "rule__Box__Group__3__Impl"


    // $ANTLR start "rule__Box__Group__4"
    // InternalMyDsl.g:4505:1: rule__Box__Group__4 : rule__Box__Group__4__Impl rule__Box__Group__5 ;
    public final void rule__Box__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4509:1: ( rule__Box__Group__4__Impl rule__Box__Group__5 )
            // InternalMyDsl.g:4510:2: rule__Box__Group__4__Impl rule__Box__Group__5
            {
            pushFollow(FOLLOW_25);
            rule__Box__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group__5();

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
    // $ANTLR end "rule__Box__Group__4"


    // $ANTLR start "rule__Box__Group__4__Impl"
    // InternalMyDsl.g:4517:1: rule__Box__Group__4__Impl : ( 'length' ) ;
    public final void rule__Box__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4521:1: ( ( 'length' ) )
            // InternalMyDsl.g:4522:1: ( 'length' )
            {
            // InternalMyDsl.g:4522:1: ( 'length' )
            // InternalMyDsl.g:4523:2: 'length'
            {
             before(grammarAccess.getBoxAccess().getLengthKeyword_4()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getBoxAccess().getLengthKeyword_4()); 

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
    // $ANTLR end "rule__Box__Group__4__Impl"


    // $ANTLR start "rule__Box__Group__5"
    // InternalMyDsl.g:4532:1: rule__Box__Group__5 : rule__Box__Group__5__Impl rule__Box__Group__6 ;
    public final void rule__Box__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4536:1: ( rule__Box__Group__5__Impl rule__Box__Group__6 )
            // InternalMyDsl.g:4537:2: rule__Box__Group__5__Impl rule__Box__Group__6
            {
            pushFollow(FOLLOW_43);
            rule__Box__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group__6();

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
    // $ANTLR end "rule__Box__Group__5"


    // $ANTLR start "rule__Box__Group__5__Impl"
    // InternalMyDsl.g:4544:1: rule__Box__Group__5__Impl : ( ( rule__Box__LengthAssignment_5 ) ) ;
    public final void rule__Box__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4548:1: ( ( ( rule__Box__LengthAssignment_5 ) ) )
            // InternalMyDsl.g:4549:1: ( ( rule__Box__LengthAssignment_5 ) )
            {
            // InternalMyDsl.g:4549:1: ( ( rule__Box__LengthAssignment_5 ) )
            // InternalMyDsl.g:4550:2: ( rule__Box__LengthAssignment_5 )
            {
             before(grammarAccess.getBoxAccess().getLengthAssignment_5()); 
            // InternalMyDsl.g:4551:2: ( rule__Box__LengthAssignment_5 )
            // InternalMyDsl.g:4551:3: rule__Box__LengthAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Box__LengthAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getBoxAccess().getLengthAssignment_5()); 

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
    // $ANTLR end "rule__Box__Group__5__Impl"


    // $ANTLR start "rule__Box__Group__6"
    // InternalMyDsl.g:4559:1: rule__Box__Group__6 : rule__Box__Group__6__Impl rule__Box__Group__7 ;
    public final void rule__Box__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4563:1: ( rule__Box__Group__6__Impl rule__Box__Group__7 )
            // InternalMyDsl.g:4564:2: rule__Box__Group__6__Impl rule__Box__Group__7
            {
            pushFollow(FOLLOW_25);
            rule__Box__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group__7();

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
    // $ANTLR end "rule__Box__Group__6"


    // $ANTLR start "rule__Box__Group__6__Impl"
    // InternalMyDsl.g:4571:1: rule__Box__Group__6__Impl : ( 'width' ) ;
    public final void rule__Box__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4575:1: ( ( 'width' ) )
            // InternalMyDsl.g:4576:1: ( 'width' )
            {
            // InternalMyDsl.g:4576:1: ( 'width' )
            // InternalMyDsl.g:4577:2: 'width'
            {
             before(grammarAccess.getBoxAccess().getWidthKeyword_6()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getBoxAccess().getWidthKeyword_6()); 

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
    // $ANTLR end "rule__Box__Group__6__Impl"


    // $ANTLR start "rule__Box__Group__7"
    // InternalMyDsl.g:4586:1: rule__Box__Group__7 : rule__Box__Group__7__Impl ;
    public final void rule__Box__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4590:1: ( rule__Box__Group__7__Impl )
            // InternalMyDsl.g:4591:2: rule__Box__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Box__Group__7__Impl();

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
    // $ANTLR end "rule__Box__Group__7"


    // $ANTLR start "rule__Box__Group__7__Impl"
    // InternalMyDsl.g:4597:1: rule__Box__Group__7__Impl : ( ( rule__Box__WidthAssignment_7 ) ) ;
    public final void rule__Box__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4601:1: ( ( ( rule__Box__WidthAssignment_7 ) ) )
            // InternalMyDsl.g:4602:1: ( ( rule__Box__WidthAssignment_7 ) )
            {
            // InternalMyDsl.g:4602:1: ( ( rule__Box__WidthAssignment_7 ) )
            // InternalMyDsl.g:4603:2: ( rule__Box__WidthAssignment_7 )
            {
             before(grammarAccess.getBoxAccess().getWidthAssignment_7()); 
            // InternalMyDsl.g:4604:2: ( rule__Box__WidthAssignment_7 )
            // InternalMyDsl.g:4604:3: rule__Box__WidthAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Box__WidthAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getBoxAccess().getWidthAssignment_7()); 

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
    // $ANTLR end "rule__Box__Group__7__Impl"


    // $ANTLR start "rule__Cylinder__Group__0"
    // InternalMyDsl.g:4613:1: rule__Cylinder__Group__0 : rule__Cylinder__Group__0__Impl rule__Cylinder__Group__1 ;
    public final void rule__Cylinder__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4617:1: ( rule__Cylinder__Group__0__Impl rule__Cylinder__Group__1 )
            // InternalMyDsl.g:4618:2: rule__Cylinder__Group__0__Impl rule__Cylinder__Group__1
            {
            pushFollow(FOLLOW_44);
            rule__Cylinder__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cylinder__Group__1();

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
    // $ANTLR end "rule__Cylinder__Group__0"


    // $ANTLR start "rule__Cylinder__Group__0__Impl"
    // InternalMyDsl.g:4625:1: rule__Cylinder__Group__0__Impl : ( 'Cylinder' ) ;
    public final void rule__Cylinder__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4629:1: ( ( 'Cylinder' ) )
            // InternalMyDsl.g:4630:1: ( 'Cylinder' )
            {
            // InternalMyDsl.g:4630:1: ( 'Cylinder' )
            // InternalMyDsl.g:4631:2: 'Cylinder'
            {
             before(grammarAccess.getCylinderAccess().getCylinderKeyword_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getCylinderAccess().getCylinderKeyword_0()); 

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
    // $ANTLR end "rule__Cylinder__Group__0__Impl"


    // $ANTLR start "rule__Cylinder__Group__1"
    // InternalMyDsl.g:4640:1: rule__Cylinder__Group__1 : rule__Cylinder__Group__1__Impl rule__Cylinder__Group__2 ;
    public final void rule__Cylinder__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4644:1: ( rule__Cylinder__Group__1__Impl rule__Cylinder__Group__2 )
            // InternalMyDsl.g:4645:2: rule__Cylinder__Group__1__Impl rule__Cylinder__Group__2
            {
            pushFollow(FOLLOW_44);
            rule__Cylinder__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cylinder__Group__2();

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
    // $ANTLR end "rule__Cylinder__Group__1"


    // $ANTLR start "rule__Cylinder__Group__1__Impl"
    // InternalMyDsl.g:4652:1: rule__Cylinder__Group__1__Impl : ( ( rule__Cylinder__NameAssignment_1 )? ) ;
    public final void rule__Cylinder__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4656:1: ( ( ( rule__Cylinder__NameAssignment_1 )? ) )
            // InternalMyDsl.g:4657:1: ( ( rule__Cylinder__NameAssignment_1 )? )
            {
            // InternalMyDsl.g:4657:1: ( ( rule__Cylinder__NameAssignment_1 )? )
            // InternalMyDsl.g:4658:2: ( rule__Cylinder__NameAssignment_1 )?
            {
             before(grammarAccess.getCylinderAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:4659:2: ( rule__Cylinder__NameAssignment_1 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_ID) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalMyDsl.g:4659:3: rule__Cylinder__NameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Cylinder__NameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCylinderAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Cylinder__Group__1__Impl"


    // $ANTLR start "rule__Cylinder__Group__2"
    // InternalMyDsl.g:4667:1: rule__Cylinder__Group__2 : rule__Cylinder__Group__2__Impl rule__Cylinder__Group__3 ;
    public final void rule__Cylinder__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4671:1: ( rule__Cylinder__Group__2__Impl rule__Cylinder__Group__3 )
            // InternalMyDsl.g:4672:2: rule__Cylinder__Group__2__Impl rule__Cylinder__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__Cylinder__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cylinder__Group__3();

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
    // $ANTLR end "rule__Cylinder__Group__2"


    // $ANTLR start "rule__Cylinder__Group__2__Impl"
    // InternalMyDsl.g:4679:1: rule__Cylinder__Group__2__Impl : ( 'radius' ) ;
    public final void rule__Cylinder__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4683:1: ( ( 'radius' ) )
            // InternalMyDsl.g:4684:1: ( 'radius' )
            {
            // InternalMyDsl.g:4684:1: ( 'radius' )
            // InternalMyDsl.g:4685:2: 'radius'
            {
             before(grammarAccess.getCylinderAccess().getRadiusKeyword_2()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getCylinderAccess().getRadiusKeyword_2()); 

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
    // $ANTLR end "rule__Cylinder__Group__2__Impl"


    // $ANTLR start "rule__Cylinder__Group__3"
    // InternalMyDsl.g:4694:1: rule__Cylinder__Group__3 : rule__Cylinder__Group__3__Impl rule__Cylinder__Group__4 ;
    public final void rule__Cylinder__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4698:1: ( rule__Cylinder__Group__3__Impl rule__Cylinder__Group__4 )
            // InternalMyDsl.g:4699:2: rule__Cylinder__Group__3__Impl rule__Cylinder__Group__4
            {
            pushFollow(FOLLOW_42);
            rule__Cylinder__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cylinder__Group__4();

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
    // $ANTLR end "rule__Cylinder__Group__3"


    // $ANTLR start "rule__Cylinder__Group__3__Impl"
    // InternalMyDsl.g:4706:1: rule__Cylinder__Group__3__Impl : ( ( rule__Cylinder__RadiusAssignment_3 ) ) ;
    public final void rule__Cylinder__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4710:1: ( ( ( rule__Cylinder__RadiusAssignment_3 ) ) )
            // InternalMyDsl.g:4711:1: ( ( rule__Cylinder__RadiusAssignment_3 ) )
            {
            // InternalMyDsl.g:4711:1: ( ( rule__Cylinder__RadiusAssignment_3 ) )
            // InternalMyDsl.g:4712:2: ( rule__Cylinder__RadiusAssignment_3 )
            {
             before(grammarAccess.getCylinderAccess().getRadiusAssignment_3()); 
            // InternalMyDsl.g:4713:2: ( rule__Cylinder__RadiusAssignment_3 )
            // InternalMyDsl.g:4713:3: rule__Cylinder__RadiusAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Cylinder__RadiusAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCylinderAccess().getRadiusAssignment_3()); 

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
    // $ANTLR end "rule__Cylinder__Group__3__Impl"


    // $ANTLR start "rule__Cylinder__Group__4"
    // InternalMyDsl.g:4721:1: rule__Cylinder__Group__4 : rule__Cylinder__Group__4__Impl rule__Cylinder__Group__5 ;
    public final void rule__Cylinder__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4725:1: ( rule__Cylinder__Group__4__Impl rule__Cylinder__Group__5 )
            // InternalMyDsl.g:4726:2: rule__Cylinder__Group__4__Impl rule__Cylinder__Group__5
            {
            pushFollow(FOLLOW_25);
            rule__Cylinder__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cylinder__Group__5();

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
    // $ANTLR end "rule__Cylinder__Group__4"


    // $ANTLR start "rule__Cylinder__Group__4__Impl"
    // InternalMyDsl.g:4733:1: rule__Cylinder__Group__4__Impl : ( 'length' ) ;
    public final void rule__Cylinder__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4737:1: ( ( 'length' ) )
            // InternalMyDsl.g:4738:1: ( 'length' )
            {
            // InternalMyDsl.g:4738:1: ( 'length' )
            // InternalMyDsl.g:4739:2: 'length'
            {
             before(grammarAccess.getCylinderAccess().getLengthKeyword_4()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getCylinderAccess().getLengthKeyword_4()); 

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
    // $ANTLR end "rule__Cylinder__Group__4__Impl"


    // $ANTLR start "rule__Cylinder__Group__5"
    // InternalMyDsl.g:4748:1: rule__Cylinder__Group__5 : rule__Cylinder__Group__5__Impl ;
    public final void rule__Cylinder__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4752:1: ( rule__Cylinder__Group__5__Impl )
            // InternalMyDsl.g:4753:2: rule__Cylinder__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Cylinder__Group__5__Impl();

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
    // $ANTLR end "rule__Cylinder__Group__5"


    // $ANTLR start "rule__Cylinder__Group__5__Impl"
    // InternalMyDsl.g:4759:1: rule__Cylinder__Group__5__Impl : ( ( rule__Cylinder__LengthAssignment_5 ) ) ;
    public final void rule__Cylinder__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4763:1: ( ( ( rule__Cylinder__LengthAssignment_5 ) ) )
            // InternalMyDsl.g:4764:1: ( ( rule__Cylinder__LengthAssignment_5 ) )
            {
            // InternalMyDsl.g:4764:1: ( ( rule__Cylinder__LengthAssignment_5 ) )
            // InternalMyDsl.g:4765:2: ( rule__Cylinder__LengthAssignment_5 )
            {
             before(grammarAccess.getCylinderAccess().getLengthAssignment_5()); 
            // InternalMyDsl.g:4766:2: ( rule__Cylinder__LengthAssignment_5 )
            // InternalMyDsl.g:4766:3: rule__Cylinder__LengthAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Cylinder__LengthAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getCylinderAccess().getLengthAssignment_5()); 

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
    // $ANTLR end "rule__Cylinder__Group__5__Impl"


    // $ANTLR start "rule__Mesh__Group__0"
    // InternalMyDsl.g:4775:1: rule__Mesh__Group__0 : rule__Mesh__Group__0__Impl rule__Mesh__Group__1 ;
    public final void rule__Mesh__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4779:1: ( rule__Mesh__Group__0__Impl rule__Mesh__Group__1 )
            // InternalMyDsl.g:4780:2: rule__Mesh__Group__0__Impl rule__Mesh__Group__1
            {
            pushFollow(FOLLOW_45);
            rule__Mesh__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mesh__Group__1();

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
    // $ANTLR end "rule__Mesh__Group__0"


    // $ANTLR start "rule__Mesh__Group__0__Impl"
    // InternalMyDsl.g:4787:1: rule__Mesh__Group__0__Impl : ( 'Mesh' ) ;
    public final void rule__Mesh__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4791:1: ( ( 'Mesh' ) )
            // InternalMyDsl.g:4792:1: ( 'Mesh' )
            {
            // InternalMyDsl.g:4792:1: ( 'Mesh' )
            // InternalMyDsl.g:4793:2: 'Mesh'
            {
             before(grammarAccess.getMeshAccess().getMeshKeyword_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getMeshAccess().getMeshKeyword_0()); 

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
    // $ANTLR end "rule__Mesh__Group__0__Impl"


    // $ANTLR start "rule__Mesh__Group__1"
    // InternalMyDsl.g:4802:1: rule__Mesh__Group__1 : rule__Mesh__Group__1__Impl rule__Mesh__Group__2 ;
    public final void rule__Mesh__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4806:1: ( rule__Mesh__Group__1__Impl rule__Mesh__Group__2 )
            // InternalMyDsl.g:4807:2: rule__Mesh__Group__1__Impl rule__Mesh__Group__2
            {
            pushFollow(FOLLOW_45);
            rule__Mesh__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mesh__Group__2();

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
    // $ANTLR end "rule__Mesh__Group__1"


    // $ANTLR start "rule__Mesh__Group__1__Impl"
    // InternalMyDsl.g:4814:1: rule__Mesh__Group__1__Impl : ( ( rule__Mesh__NameAssignment_1 )? ) ;
    public final void rule__Mesh__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4818:1: ( ( ( rule__Mesh__NameAssignment_1 )? ) )
            // InternalMyDsl.g:4819:1: ( ( rule__Mesh__NameAssignment_1 )? )
            {
            // InternalMyDsl.g:4819:1: ( ( rule__Mesh__NameAssignment_1 )? )
            // InternalMyDsl.g:4820:2: ( rule__Mesh__NameAssignment_1 )?
            {
             before(grammarAccess.getMeshAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:4821:2: ( rule__Mesh__NameAssignment_1 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_ID) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalMyDsl.g:4821:3: rule__Mesh__NameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Mesh__NameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMeshAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Mesh__Group__1__Impl"


    // $ANTLR start "rule__Mesh__Group__2"
    // InternalMyDsl.g:4829:1: rule__Mesh__Group__2 : rule__Mesh__Group__2__Impl rule__Mesh__Group__3 ;
    public final void rule__Mesh__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4833:1: ( rule__Mesh__Group__2__Impl rule__Mesh__Group__3 )
            // InternalMyDsl.g:4834:2: rule__Mesh__Group__2__Impl rule__Mesh__Group__3
            {
            pushFollow(FOLLOW_46);
            rule__Mesh__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mesh__Group__3();

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
    // $ANTLR end "rule__Mesh__Group__2"


    // $ANTLR start "rule__Mesh__Group__2__Impl"
    // InternalMyDsl.g:4841:1: rule__Mesh__Group__2__Impl : ( 'pathToFile' ) ;
    public final void rule__Mesh__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4845:1: ( ( 'pathToFile' ) )
            // InternalMyDsl.g:4846:1: ( 'pathToFile' )
            {
            // InternalMyDsl.g:4846:1: ( 'pathToFile' )
            // InternalMyDsl.g:4847:2: 'pathToFile'
            {
             before(grammarAccess.getMeshAccess().getPathToFileKeyword_2()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getMeshAccess().getPathToFileKeyword_2()); 

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
    // $ANTLR end "rule__Mesh__Group__2__Impl"


    // $ANTLR start "rule__Mesh__Group__3"
    // InternalMyDsl.g:4856:1: rule__Mesh__Group__3 : rule__Mesh__Group__3__Impl ;
    public final void rule__Mesh__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4860:1: ( rule__Mesh__Group__3__Impl )
            // InternalMyDsl.g:4861:2: rule__Mesh__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mesh__Group__3__Impl();

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
    // $ANTLR end "rule__Mesh__Group__3"


    // $ANTLR start "rule__Mesh__Group__3__Impl"
    // InternalMyDsl.g:4867:1: rule__Mesh__Group__3__Impl : ( ( rule__Mesh__PathToFileAssignment_3 ) ) ;
    public final void rule__Mesh__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4871:1: ( ( ( rule__Mesh__PathToFileAssignment_3 ) ) )
            // InternalMyDsl.g:4872:1: ( ( rule__Mesh__PathToFileAssignment_3 ) )
            {
            // InternalMyDsl.g:4872:1: ( ( rule__Mesh__PathToFileAssignment_3 ) )
            // InternalMyDsl.g:4873:2: ( rule__Mesh__PathToFileAssignment_3 )
            {
             before(grammarAccess.getMeshAccess().getPathToFileAssignment_3()); 
            // InternalMyDsl.g:4874:2: ( rule__Mesh__PathToFileAssignment_3 )
            // InternalMyDsl.g:4874:3: rule__Mesh__PathToFileAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Mesh__PathToFileAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMeshAccess().getPathToFileAssignment_3()); 

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
    // $ANTLR end "rule__Mesh__Group__3__Impl"


    // $ANTLR start "rule__Sphere__Group__0"
    // InternalMyDsl.g:4883:1: rule__Sphere__Group__0 : rule__Sphere__Group__0__Impl rule__Sphere__Group__1 ;
    public final void rule__Sphere__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4887:1: ( rule__Sphere__Group__0__Impl rule__Sphere__Group__1 )
            // InternalMyDsl.g:4888:2: rule__Sphere__Group__0__Impl rule__Sphere__Group__1
            {
            pushFollow(FOLLOW_44);
            rule__Sphere__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sphere__Group__1();

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
    // $ANTLR end "rule__Sphere__Group__0"


    // $ANTLR start "rule__Sphere__Group__0__Impl"
    // InternalMyDsl.g:4895:1: rule__Sphere__Group__0__Impl : ( 'Sphere' ) ;
    public final void rule__Sphere__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4899:1: ( ( 'Sphere' ) )
            // InternalMyDsl.g:4900:1: ( 'Sphere' )
            {
            // InternalMyDsl.g:4900:1: ( 'Sphere' )
            // InternalMyDsl.g:4901:2: 'Sphere'
            {
             before(grammarAccess.getSphereAccess().getSphereKeyword_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getSphereAccess().getSphereKeyword_0()); 

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
    // $ANTLR end "rule__Sphere__Group__0__Impl"


    // $ANTLR start "rule__Sphere__Group__1"
    // InternalMyDsl.g:4910:1: rule__Sphere__Group__1 : rule__Sphere__Group__1__Impl rule__Sphere__Group__2 ;
    public final void rule__Sphere__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4914:1: ( rule__Sphere__Group__1__Impl rule__Sphere__Group__2 )
            // InternalMyDsl.g:4915:2: rule__Sphere__Group__1__Impl rule__Sphere__Group__2
            {
            pushFollow(FOLLOW_44);
            rule__Sphere__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sphere__Group__2();

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
    // $ANTLR end "rule__Sphere__Group__1"


    // $ANTLR start "rule__Sphere__Group__1__Impl"
    // InternalMyDsl.g:4922:1: rule__Sphere__Group__1__Impl : ( ( rule__Sphere__NameAssignment_1 )? ) ;
    public final void rule__Sphere__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4926:1: ( ( ( rule__Sphere__NameAssignment_1 )? ) )
            // InternalMyDsl.g:4927:1: ( ( rule__Sphere__NameAssignment_1 )? )
            {
            // InternalMyDsl.g:4927:1: ( ( rule__Sphere__NameAssignment_1 )? )
            // InternalMyDsl.g:4928:2: ( rule__Sphere__NameAssignment_1 )?
            {
             before(grammarAccess.getSphereAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:4929:2: ( rule__Sphere__NameAssignment_1 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_ID) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalMyDsl.g:4929:3: rule__Sphere__NameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Sphere__NameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSphereAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Sphere__Group__1__Impl"


    // $ANTLR start "rule__Sphere__Group__2"
    // InternalMyDsl.g:4937:1: rule__Sphere__Group__2 : rule__Sphere__Group__2__Impl rule__Sphere__Group__3 ;
    public final void rule__Sphere__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4941:1: ( rule__Sphere__Group__2__Impl rule__Sphere__Group__3 )
            // InternalMyDsl.g:4942:2: rule__Sphere__Group__2__Impl rule__Sphere__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__Sphere__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sphere__Group__3();

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
    // $ANTLR end "rule__Sphere__Group__2"


    // $ANTLR start "rule__Sphere__Group__2__Impl"
    // InternalMyDsl.g:4949:1: rule__Sphere__Group__2__Impl : ( 'radius' ) ;
    public final void rule__Sphere__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4953:1: ( ( 'radius' ) )
            // InternalMyDsl.g:4954:1: ( 'radius' )
            {
            // InternalMyDsl.g:4954:1: ( 'radius' )
            // InternalMyDsl.g:4955:2: 'radius'
            {
             before(grammarAccess.getSphereAccess().getRadiusKeyword_2()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getSphereAccess().getRadiusKeyword_2()); 

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
    // $ANTLR end "rule__Sphere__Group__2__Impl"


    // $ANTLR start "rule__Sphere__Group__3"
    // InternalMyDsl.g:4964:1: rule__Sphere__Group__3 : rule__Sphere__Group__3__Impl ;
    public final void rule__Sphere__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4968:1: ( rule__Sphere__Group__3__Impl )
            // InternalMyDsl.g:4969:2: rule__Sphere__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sphere__Group__3__Impl();

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
    // $ANTLR end "rule__Sphere__Group__3"


    // $ANTLR start "rule__Sphere__Group__3__Impl"
    // InternalMyDsl.g:4975:1: rule__Sphere__Group__3__Impl : ( ( rule__Sphere__RadiusAssignment_3 ) ) ;
    public final void rule__Sphere__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4979:1: ( ( ( rule__Sphere__RadiusAssignment_3 ) ) )
            // InternalMyDsl.g:4980:1: ( ( rule__Sphere__RadiusAssignment_3 ) )
            {
            // InternalMyDsl.g:4980:1: ( ( rule__Sphere__RadiusAssignment_3 ) )
            // InternalMyDsl.g:4981:2: ( rule__Sphere__RadiusAssignment_3 )
            {
             before(grammarAccess.getSphereAccess().getRadiusAssignment_3()); 
            // InternalMyDsl.g:4982:2: ( rule__Sphere__RadiusAssignment_3 )
            // InternalMyDsl.g:4982:3: rule__Sphere__RadiusAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Sphere__RadiusAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSphereAccess().getRadiusAssignment_3()); 

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
    // $ANTLR end "rule__Sphere__Group__3__Impl"


    // $ANTLR start "rule__Texture__Group__0"
    // InternalMyDsl.g:4991:1: rule__Texture__Group__0 : rule__Texture__Group__0__Impl rule__Texture__Group__1 ;
    public final void rule__Texture__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4995:1: ( rule__Texture__Group__0__Impl rule__Texture__Group__1 )
            // InternalMyDsl.g:4996:2: rule__Texture__Group__0__Impl rule__Texture__Group__1
            {
            pushFollow(FOLLOW_45);
            rule__Texture__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Texture__Group__1();

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
    // $ANTLR end "rule__Texture__Group__0"


    // $ANTLR start "rule__Texture__Group__0__Impl"
    // InternalMyDsl.g:5003:1: rule__Texture__Group__0__Impl : ( 'Texture' ) ;
    public final void rule__Texture__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5007:1: ( ( 'Texture' ) )
            // InternalMyDsl.g:5008:1: ( 'Texture' )
            {
            // InternalMyDsl.g:5008:1: ( 'Texture' )
            // InternalMyDsl.g:5009:2: 'Texture'
            {
             before(grammarAccess.getTextureAccess().getTextureKeyword_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getTextureAccess().getTextureKeyword_0()); 

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
    // $ANTLR end "rule__Texture__Group__0__Impl"


    // $ANTLR start "rule__Texture__Group__1"
    // InternalMyDsl.g:5018:1: rule__Texture__Group__1 : rule__Texture__Group__1__Impl rule__Texture__Group__2 ;
    public final void rule__Texture__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5022:1: ( rule__Texture__Group__1__Impl rule__Texture__Group__2 )
            // InternalMyDsl.g:5023:2: rule__Texture__Group__1__Impl rule__Texture__Group__2
            {
            pushFollow(FOLLOW_45);
            rule__Texture__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Texture__Group__2();

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
    // $ANTLR end "rule__Texture__Group__1"


    // $ANTLR start "rule__Texture__Group__1__Impl"
    // InternalMyDsl.g:5030:1: rule__Texture__Group__1__Impl : ( ( rule__Texture__NameAssignment_1 )? ) ;
    public final void rule__Texture__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5034:1: ( ( ( rule__Texture__NameAssignment_1 )? ) )
            // InternalMyDsl.g:5035:1: ( ( rule__Texture__NameAssignment_1 )? )
            {
            // InternalMyDsl.g:5035:1: ( ( rule__Texture__NameAssignment_1 )? )
            // InternalMyDsl.g:5036:2: ( rule__Texture__NameAssignment_1 )?
            {
             before(grammarAccess.getTextureAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:5037:2: ( rule__Texture__NameAssignment_1 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_ID) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalMyDsl.g:5037:3: rule__Texture__NameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Texture__NameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTextureAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Texture__Group__1__Impl"


    // $ANTLR start "rule__Texture__Group__2"
    // InternalMyDsl.g:5045:1: rule__Texture__Group__2 : rule__Texture__Group__2__Impl rule__Texture__Group__3 ;
    public final void rule__Texture__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5049:1: ( rule__Texture__Group__2__Impl rule__Texture__Group__3 )
            // InternalMyDsl.g:5050:2: rule__Texture__Group__2__Impl rule__Texture__Group__3
            {
            pushFollow(FOLLOW_46);
            rule__Texture__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Texture__Group__3();

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
    // $ANTLR end "rule__Texture__Group__2"


    // $ANTLR start "rule__Texture__Group__2__Impl"
    // InternalMyDsl.g:5057:1: rule__Texture__Group__2__Impl : ( 'pathToFile' ) ;
    public final void rule__Texture__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5061:1: ( ( 'pathToFile' ) )
            // InternalMyDsl.g:5062:1: ( 'pathToFile' )
            {
            // InternalMyDsl.g:5062:1: ( 'pathToFile' )
            // InternalMyDsl.g:5063:2: 'pathToFile'
            {
             before(grammarAccess.getTextureAccess().getPathToFileKeyword_2()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getTextureAccess().getPathToFileKeyword_2()); 

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
    // $ANTLR end "rule__Texture__Group__2__Impl"


    // $ANTLR start "rule__Texture__Group__3"
    // InternalMyDsl.g:5072:1: rule__Texture__Group__3 : rule__Texture__Group__3__Impl ;
    public final void rule__Texture__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5076:1: ( rule__Texture__Group__3__Impl )
            // InternalMyDsl.g:5077:2: rule__Texture__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Texture__Group__3__Impl();

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
    // $ANTLR end "rule__Texture__Group__3"


    // $ANTLR start "rule__Texture__Group__3__Impl"
    // InternalMyDsl.g:5083:1: rule__Texture__Group__3__Impl : ( ( rule__Texture__PathToFileAssignment_3 ) ) ;
    public final void rule__Texture__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5087:1: ( ( ( rule__Texture__PathToFileAssignment_3 ) ) )
            // InternalMyDsl.g:5088:1: ( ( rule__Texture__PathToFileAssignment_3 ) )
            {
            // InternalMyDsl.g:5088:1: ( ( rule__Texture__PathToFileAssignment_3 ) )
            // InternalMyDsl.g:5089:2: ( rule__Texture__PathToFileAssignment_3 )
            {
             before(grammarAccess.getTextureAccess().getPathToFileAssignment_3()); 
            // InternalMyDsl.g:5090:2: ( rule__Texture__PathToFileAssignment_3 )
            // InternalMyDsl.g:5090:3: rule__Texture__PathToFileAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Texture__PathToFileAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTextureAccess().getPathToFileAssignment_3()); 

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
    // $ANTLR end "rule__Texture__Group__3__Impl"


    // $ANTLR start "rule__Color__Group__0"
    // InternalMyDsl.g:5099:1: rule__Color__Group__0 : rule__Color__Group__0__Impl rule__Color__Group__1 ;
    public final void rule__Color__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5103:1: ( rule__Color__Group__0__Impl rule__Color__Group__1 )
            // InternalMyDsl.g:5104:2: rule__Color__Group__0__Impl rule__Color__Group__1
            {
            pushFollow(FOLLOW_47);
            rule__Color__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color__Group__1();

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
    // $ANTLR end "rule__Color__Group__0"


    // $ANTLR start "rule__Color__Group__0__Impl"
    // InternalMyDsl.g:5111:1: rule__Color__Group__0__Impl : ( 'Color' ) ;
    public final void rule__Color__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5115:1: ( ( 'Color' ) )
            // InternalMyDsl.g:5116:1: ( 'Color' )
            {
            // InternalMyDsl.g:5116:1: ( 'Color' )
            // InternalMyDsl.g:5117:2: 'Color'
            {
             before(grammarAccess.getColorAccess().getColorKeyword_0()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getColorAccess().getColorKeyword_0()); 

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
    // $ANTLR end "rule__Color__Group__0__Impl"


    // $ANTLR start "rule__Color__Group__1"
    // InternalMyDsl.g:5126:1: rule__Color__Group__1 : rule__Color__Group__1__Impl rule__Color__Group__2 ;
    public final void rule__Color__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5130:1: ( rule__Color__Group__1__Impl rule__Color__Group__2 )
            // InternalMyDsl.g:5131:2: rule__Color__Group__1__Impl rule__Color__Group__2
            {
            pushFollow(FOLLOW_47);
            rule__Color__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color__Group__2();

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
    // $ANTLR end "rule__Color__Group__1"


    // $ANTLR start "rule__Color__Group__1__Impl"
    // InternalMyDsl.g:5138:1: rule__Color__Group__1__Impl : ( ( rule__Color__NameAssignment_1 )? ) ;
    public final void rule__Color__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5142:1: ( ( ( rule__Color__NameAssignment_1 )? ) )
            // InternalMyDsl.g:5143:1: ( ( rule__Color__NameAssignment_1 )? )
            {
            // InternalMyDsl.g:5143:1: ( ( rule__Color__NameAssignment_1 )? )
            // InternalMyDsl.g:5144:2: ( rule__Color__NameAssignment_1 )?
            {
             before(grammarAccess.getColorAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:5145:2: ( rule__Color__NameAssignment_1 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_ID) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalMyDsl.g:5145:3: rule__Color__NameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Color__NameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getColorAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Color__Group__1__Impl"


    // $ANTLR start "rule__Color__Group__2"
    // InternalMyDsl.g:5153:1: rule__Color__Group__2 : rule__Color__Group__2__Impl rule__Color__Group__3 ;
    public final void rule__Color__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5157:1: ( rule__Color__Group__2__Impl rule__Color__Group__3 )
            // InternalMyDsl.g:5158:2: rule__Color__Group__2__Impl rule__Color__Group__3
            {
            pushFollow(FOLLOW_48);
            rule__Color__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color__Group__3();

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
    // $ANTLR end "rule__Color__Group__2"


    // $ANTLR start "rule__Color__Group__2__Impl"
    // InternalMyDsl.g:5165:1: rule__Color__Group__2__Impl : ( 'red' ) ;
    public final void rule__Color__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5169:1: ( ( 'red' ) )
            // InternalMyDsl.g:5170:1: ( 'red' )
            {
            // InternalMyDsl.g:5170:1: ( 'red' )
            // InternalMyDsl.g:5171:2: 'red'
            {
             before(grammarAccess.getColorAccess().getRedKeyword_2()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getColorAccess().getRedKeyword_2()); 

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
    // $ANTLR end "rule__Color__Group__2__Impl"


    // $ANTLR start "rule__Color__Group__3"
    // InternalMyDsl.g:5180:1: rule__Color__Group__3 : rule__Color__Group__3__Impl rule__Color__Group__4 ;
    public final void rule__Color__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5184:1: ( rule__Color__Group__3__Impl rule__Color__Group__4 )
            // InternalMyDsl.g:5185:2: rule__Color__Group__3__Impl rule__Color__Group__4
            {
            pushFollow(FOLLOW_49);
            rule__Color__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color__Group__4();

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
    // $ANTLR end "rule__Color__Group__3"


    // $ANTLR start "rule__Color__Group__3__Impl"
    // InternalMyDsl.g:5192:1: rule__Color__Group__3__Impl : ( ( rule__Color__RedAssignment_3 ) ) ;
    public final void rule__Color__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5196:1: ( ( ( rule__Color__RedAssignment_3 ) ) )
            // InternalMyDsl.g:5197:1: ( ( rule__Color__RedAssignment_3 ) )
            {
            // InternalMyDsl.g:5197:1: ( ( rule__Color__RedAssignment_3 ) )
            // InternalMyDsl.g:5198:2: ( rule__Color__RedAssignment_3 )
            {
             before(grammarAccess.getColorAccess().getRedAssignment_3()); 
            // InternalMyDsl.g:5199:2: ( rule__Color__RedAssignment_3 )
            // InternalMyDsl.g:5199:3: rule__Color__RedAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Color__RedAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getColorAccess().getRedAssignment_3()); 

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
    // $ANTLR end "rule__Color__Group__3__Impl"


    // $ANTLR start "rule__Color__Group__4"
    // InternalMyDsl.g:5207:1: rule__Color__Group__4 : rule__Color__Group__4__Impl rule__Color__Group__5 ;
    public final void rule__Color__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5211:1: ( rule__Color__Group__4__Impl rule__Color__Group__5 )
            // InternalMyDsl.g:5212:2: rule__Color__Group__4__Impl rule__Color__Group__5
            {
            pushFollow(FOLLOW_48);
            rule__Color__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color__Group__5();

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
    // $ANTLR end "rule__Color__Group__4"


    // $ANTLR start "rule__Color__Group__4__Impl"
    // InternalMyDsl.g:5219:1: rule__Color__Group__4__Impl : ( 'green' ) ;
    public final void rule__Color__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5223:1: ( ( 'green' ) )
            // InternalMyDsl.g:5224:1: ( 'green' )
            {
            // InternalMyDsl.g:5224:1: ( 'green' )
            // InternalMyDsl.g:5225:2: 'green'
            {
             before(grammarAccess.getColorAccess().getGreenKeyword_4()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getColorAccess().getGreenKeyword_4()); 

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
    // $ANTLR end "rule__Color__Group__4__Impl"


    // $ANTLR start "rule__Color__Group__5"
    // InternalMyDsl.g:5234:1: rule__Color__Group__5 : rule__Color__Group__5__Impl rule__Color__Group__6 ;
    public final void rule__Color__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5238:1: ( rule__Color__Group__5__Impl rule__Color__Group__6 )
            // InternalMyDsl.g:5239:2: rule__Color__Group__5__Impl rule__Color__Group__6
            {
            pushFollow(FOLLOW_50);
            rule__Color__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color__Group__6();

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
    // $ANTLR end "rule__Color__Group__5"


    // $ANTLR start "rule__Color__Group__5__Impl"
    // InternalMyDsl.g:5246:1: rule__Color__Group__5__Impl : ( ( rule__Color__GreenAssignment_5 ) ) ;
    public final void rule__Color__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5250:1: ( ( ( rule__Color__GreenAssignment_5 ) ) )
            // InternalMyDsl.g:5251:1: ( ( rule__Color__GreenAssignment_5 ) )
            {
            // InternalMyDsl.g:5251:1: ( ( rule__Color__GreenAssignment_5 ) )
            // InternalMyDsl.g:5252:2: ( rule__Color__GreenAssignment_5 )
            {
             before(grammarAccess.getColorAccess().getGreenAssignment_5()); 
            // InternalMyDsl.g:5253:2: ( rule__Color__GreenAssignment_5 )
            // InternalMyDsl.g:5253:3: rule__Color__GreenAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Color__GreenAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getColorAccess().getGreenAssignment_5()); 

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
    // $ANTLR end "rule__Color__Group__5__Impl"


    // $ANTLR start "rule__Color__Group__6"
    // InternalMyDsl.g:5261:1: rule__Color__Group__6 : rule__Color__Group__6__Impl rule__Color__Group__7 ;
    public final void rule__Color__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5265:1: ( rule__Color__Group__6__Impl rule__Color__Group__7 )
            // InternalMyDsl.g:5266:2: rule__Color__Group__6__Impl rule__Color__Group__7
            {
            pushFollow(FOLLOW_48);
            rule__Color__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color__Group__7();

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
    // $ANTLR end "rule__Color__Group__6"


    // $ANTLR start "rule__Color__Group__6__Impl"
    // InternalMyDsl.g:5273:1: rule__Color__Group__6__Impl : ( 'blue' ) ;
    public final void rule__Color__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5277:1: ( ( 'blue' ) )
            // InternalMyDsl.g:5278:1: ( 'blue' )
            {
            // InternalMyDsl.g:5278:1: ( 'blue' )
            // InternalMyDsl.g:5279:2: 'blue'
            {
             before(grammarAccess.getColorAccess().getBlueKeyword_6()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getColorAccess().getBlueKeyword_6()); 

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
    // $ANTLR end "rule__Color__Group__6__Impl"


    // $ANTLR start "rule__Color__Group__7"
    // InternalMyDsl.g:5288:1: rule__Color__Group__7 : rule__Color__Group__7__Impl rule__Color__Group__8 ;
    public final void rule__Color__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5292:1: ( rule__Color__Group__7__Impl rule__Color__Group__8 )
            // InternalMyDsl.g:5293:2: rule__Color__Group__7__Impl rule__Color__Group__8
            {
            pushFollow(FOLLOW_51);
            rule__Color__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color__Group__8();

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
    // $ANTLR end "rule__Color__Group__7"


    // $ANTLR start "rule__Color__Group__7__Impl"
    // InternalMyDsl.g:5300:1: rule__Color__Group__7__Impl : ( ( rule__Color__BlueAssignment_7 ) ) ;
    public final void rule__Color__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5304:1: ( ( ( rule__Color__BlueAssignment_7 ) ) )
            // InternalMyDsl.g:5305:1: ( ( rule__Color__BlueAssignment_7 ) )
            {
            // InternalMyDsl.g:5305:1: ( ( rule__Color__BlueAssignment_7 ) )
            // InternalMyDsl.g:5306:2: ( rule__Color__BlueAssignment_7 )
            {
             before(grammarAccess.getColorAccess().getBlueAssignment_7()); 
            // InternalMyDsl.g:5307:2: ( rule__Color__BlueAssignment_7 )
            // InternalMyDsl.g:5307:3: rule__Color__BlueAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Color__BlueAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getColorAccess().getBlueAssignment_7()); 

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
    // $ANTLR end "rule__Color__Group__7__Impl"


    // $ANTLR start "rule__Color__Group__8"
    // InternalMyDsl.g:5315:1: rule__Color__Group__8 : rule__Color__Group__8__Impl rule__Color__Group__9 ;
    public final void rule__Color__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5319:1: ( rule__Color__Group__8__Impl rule__Color__Group__9 )
            // InternalMyDsl.g:5320:2: rule__Color__Group__8__Impl rule__Color__Group__9
            {
            pushFollow(FOLLOW_48);
            rule__Color__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color__Group__9();

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
    // $ANTLR end "rule__Color__Group__8"


    // $ANTLR start "rule__Color__Group__8__Impl"
    // InternalMyDsl.g:5327:1: rule__Color__Group__8__Impl : ( 'alpha' ) ;
    public final void rule__Color__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5331:1: ( ( 'alpha' ) )
            // InternalMyDsl.g:5332:1: ( 'alpha' )
            {
            // InternalMyDsl.g:5332:1: ( 'alpha' )
            // InternalMyDsl.g:5333:2: 'alpha'
            {
             before(grammarAccess.getColorAccess().getAlphaKeyword_8()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getColorAccess().getAlphaKeyword_8()); 

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
    // $ANTLR end "rule__Color__Group__8__Impl"


    // $ANTLR start "rule__Color__Group__9"
    // InternalMyDsl.g:5342:1: rule__Color__Group__9 : rule__Color__Group__9__Impl ;
    public final void rule__Color__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5346:1: ( rule__Color__Group__9__Impl )
            // InternalMyDsl.g:5347:2: rule__Color__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Color__Group__9__Impl();

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
    // $ANTLR end "rule__Color__Group__9"


    // $ANTLR start "rule__Color__Group__9__Impl"
    // InternalMyDsl.g:5353:1: rule__Color__Group__9__Impl : ( ( rule__Color__AlphaAssignment_9 ) ) ;
    public final void rule__Color__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5357:1: ( ( ( rule__Color__AlphaAssignment_9 ) ) )
            // InternalMyDsl.g:5358:1: ( ( rule__Color__AlphaAssignment_9 ) )
            {
            // InternalMyDsl.g:5358:1: ( ( rule__Color__AlphaAssignment_9 ) )
            // InternalMyDsl.g:5359:2: ( rule__Color__AlphaAssignment_9 )
            {
             before(grammarAccess.getColorAccess().getAlphaAssignment_9()); 
            // InternalMyDsl.g:5360:2: ( rule__Color__AlphaAssignment_9 )
            // InternalMyDsl.g:5360:3: rule__Color__AlphaAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Color__AlphaAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getColorAccess().getAlphaAssignment_9()); 

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
    // $ANTLR end "rule__Color__Group__9__Impl"


    // $ANTLR start "rule__Joint__Group__0"
    // InternalMyDsl.g:5369:1: rule__Joint__Group__0 : rule__Joint__Group__0__Impl rule__Joint__Group__1 ;
    public final void rule__Joint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5373:1: ( rule__Joint__Group__0__Impl rule__Joint__Group__1 )
            // InternalMyDsl.g:5374:2: rule__Joint__Group__0__Impl rule__Joint__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Joint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group__1();

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
    // $ANTLR end "rule__Joint__Group__0"


    // $ANTLR start "rule__Joint__Group__0__Impl"
    // InternalMyDsl.g:5381:1: rule__Joint__Group__0__Impl : ( 'Joint' ) ;
    public final void rule__Joint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5385:1: ( ( 'Joint' ) )
            // InternalMyDsl.g:5386:1: ( 'Joint' )
            {
            // InternalMyDsl.g:5386:1: ( 'Joint' )
            // InternalMyDsl.g:5387:2: 'Joint'
            {
             before(grammarAccess.getJointAccess().getJointKeyword_0()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getJointKeyword_0()); 

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
    // $ANTLR end "rule__Joint__Group__0__Impl"


    // $ANTLR start "rule__Joint__Group__1"
    // InternalMyDsl.g:5396:1: rule__Joint__Group__1 : rule__Joint__Group__1__Impl rule__Joint__Group__2 ;
    public final void rule__Joint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5400:1: ( rule__Joint__Group__1__Impl rule__Joint__Group__2 )
            // InternalMyDsl.g:5401:2: rule__Joint__Group__1__Impl rule__Joint__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Joint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group__2();

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
    // $ANTLR end "rule__Joint__Group__1"


    // $ANTLR start "rule__Joint__Group__1__Impl"
    // InternalMyDsl.g:5408:1: rule__Joint__Group__1__Impl : ( ( rule__Joint__NameAssignment_1 ) ) ;
    public final void rule__Joint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5412:1: ( ( ( rule__Joint__NameAssignment_1 ) ) )
            // InternalMyDsl.g:5413:1: ( ( rule__Joint__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:5413:1: ( ( rule__Joint__NameAssignment_1 ) )
            // InternalMyDsl.g:5414:2: ( rule__Joint__NameAssignment_1 )
            {
             before(grammarAccess.getJointAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:5415:2: ( rule__Joint__NameAssignment_1 )
            // InternalMyDsl.g:5415:3: rule__Joint__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Joint__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Joint__Group__1__Impl"


    // $ANTLR start "rule__Joint__Group__2"
    // InternalMyDsl.g:5423:1: rule__Joint__Group__2 : rule__Joint__Group__2__Impl ;
    public final void rule__Joint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5427:1: ( rule__Joint__Group__2__Impl )
            // InternalMyDsl.g:5428:2: rule__Joint__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Joint__Group__2__Impl();

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
    // $ANTLR end "rule__Joint__Group__2"


    // $ANTLR start "rule__Joint__Group__2__Impl"
    // InternalMyDsl.g:5434:1: rule__Joint__Group__2__Impl : ( ( rule__Joint__Alternatives_2 ) ) ;
    public final void rule__Joint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5438:1: ( ( ( rule__Joint__Alternatives_2 ) ) )
            // InternalMyDsl.g:5439:1: ( ( rule__Joint__Alternatives_2 ) )
            {
            // InternalMyDsl.g:5439:1: ( ( rule__Joint__Alternatives_2 ) )
            // InternalMyDsl.g:5440:2: ( rule__Joint__Alternatives_2 )
            {
             before(grammarAccess.getJointAccess().getAlternatives_2()); 
            // InternalMyDsl.g:5441:2: ( rule__Joint__Alternatives_2 )
            // InternalMyDsl.g:5441:3: rule__Joint__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__Joint__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getAlternatives_2()); 

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
    // $ANTLR end "rule__Joint__Group__2__Impl"


    // $ANTLR start "rule__Joint__Group_2_0__0"
    // InternalMyDsl.g:5450:1: rule__Joint__Group_2_0__0 : rule__Joint__Group_2_0__0__Impl rule__Joint__Group_2_0__1 ;
    public final void rule__Joint__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5454:1: ( rule__Joint__Group_2_0__0__Impl rule__Joint__Group_2_0__1 )
            // InternalMyDsl.g:5455:2: rule__Joint__Group_2_0__0__Impl rule__Joint__Group_2_0__1
            {
            pushFollow(FOLLOW_52);
            rule__Joint__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group_2_0__1();

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
    // $ANTLR end "rule__Joint__Group_2_0__0"


    // $ANTLR start "rule__Joint__Group_2_0__0__Impl"
    // InternalMyDsl.g:5462:1: rule__Joint__Group_2_0__0__Impl : ( ( rule__Joint__Group_2_0_0__0 ) ) ;
    public final void rule__Joint__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5466:1: ( ( ( rule__Joint__Group_2_0_0__0 ) ) )
            // InternalMyDsl.g:5467:1: ( ( rule__Joint__Group_2_0_0__0 ) )
            {
            // InternalMyDsl.g:5467:1: ( ( rule__Joint__Group_2_0_0__0 ) )
            // InternalMyDsl.g:5468:2: ( rule__Joint__Group_2_0_0__0 )
            {
             before(grammarAccess.getJointAccess().getGroup_2_0_0()); 
            // InternalMyDsl.g:5469:2: ( rule__Joint__Group_2_0_0__0 )
            // InternalMyDsl.g:5469:3: rule__Joint__Group_2_0_0__0
            {
            pushFollow(FOLLOW_2);
            rule__Joint__Group_2_0_0__0();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getGroup_2_0_0()); 

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
    // $ANTLR end "rule__Joint__Group_2_0__0__Impl"


    // $ANTLR start "rule__Joint__Group_2_0__1"
    // InternalMyDsl.g:5477:1: rule__Joint__Group_2_0__1 : rule__Joint__Group_2_0__1__Impl ;
    public final void rule__Joint__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5481:1: ( rule__Joint__Group_2_0__1__Impl )
            // InternalMyDsl.g:5482:2: rule__Joint__Group_2_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Joint__Group_2_0__1__Impl();

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
    // $ANTLR end "rule__Joint__Group_2_0__1"


    // $ANTLR start "rule__Joint__Group_2_0__1__Impl"
    // InternalMyDsl.g:5488:1: rule__Joint__Group_2_0__1__Impl : ( ( rule__Joint__Alternatives_2_0_1 )* ) ;
    public final void rule__Joint__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5492:1: ( ( ( rule__Joint__Alternatives_2_0_1 )* ) )
            // InternalMyDsl.g:5493:1: ( ( rule__Joint__Alternatives_2_0_1 )* )
            {
            // InternalMyDsl.g:5493:1: ( ( rule__Joint__Alternatives_2_0_1 )* )
            // InternalMyDsl.g:5494:2: ( rule__Joint__Alternatives_2_0_1 )*
            {
             before(grammarAccess.getJointAccess().getAlternatives_2_0_1()); 
            // InternalMyDsl.g:5495:2: ( rule__Joint__Alternatives_2_0_1 )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==40||(LA49_0>=69 && LA49_0<=70)||LA49_0==75||LA49_0==78||LA49_0==81) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalMyDsl.g:5495:3: rule__Joint__Alternatives_2_0_1
            	    {
            	    pushFollow(FOLLOW_53);
            	    rule__Joint__Alternatives_2_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

             after(grammarAccess.getJointAccess().getAlternatives_2_0_1()); 

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
    // $ANTLR end "rule__Joint__Group_2_0__1__Impl"


    // $ANTLR start "rule__Joint__Group_2_0_0__0"
    // InternalMyDsl.g:5504:1: rule__Joint__Group_2_0_0__0 : rule__Joint__Group_2_0_0__0__Impl rule__Joint__Group_2_0_0__1 ;
    public final void rule__Joint__Group_2_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5508:1: ( rule__Joint__Group_2_0_0__0__Impl rule__Joint__Group_2_0_0__1 )
            // InternalMyDsl.g:5509:2: rule__Joint__Group_2_0_0__0__Impl rule__Joint__Group_2_0_0__1
            {
            pushFollow(FOLLOW_54);
            rule__Joint__Group_2_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group_2_0_0__1();

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
    // $ANTLR end "rule__Joint__Group_2_0_0__0"


    // $ANTLR start "rule__Joint__Group_2_0_0__0__Impl"
    // InternalMyDsl.g:5516:1: rule__Joint__Group_2_0_0__0__Impl : ( 'def' ) ;
    public final void rule__Joint__Group_2_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5520:1: ( ( 'def' ) )
            // InternalMyDsl.g:5521:1: ( 'def' )
            {
            // InternalMyDsl.g:5521:1: ( 'def' )
            // InternalMyDsl.g:5522:2: 'def'
            {
             before(grammarAccess.getJointAccess().getDefKeyword_2_0_0_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getDefKeyword_2_0_0_0()); 

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
    // $ANTLR end "rule__Joint__Group_2_0_0__0__Impl"


    // $ANTLR start "rule__Joint__Group_2_0_0__1"
    // InternalMyDsl.g:5531:1: rule__Joint__Group_2_0_0__1 : rule__Joint__Group_2_0_0__1__Impl rule__Joint__Group_2_0_0__2 ;
    public final void rule__Joint__Group_2_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5535:1: ( rule__Joint__Group_2_0_0__1__Impl rule__Joint__Group_2_0_0__2 )
            // InternalMyDsl.g:5536:2: rule__Joint__Group_2_0_0__1__Impl rule__Joint__Group_2_0_0__2
            {
            pushFollow(FOLLOW_3);
            rule__Joint__Group_2_0_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group_2_0_0__2();

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
    // $ANTLR end "rule__Joint__Group_2_0_0__1"


    // $ANTLR start "rule__Joint__Group_2_0_0__1__Impl"
    // InternalMyDsl.g:5543:1: rule__Joint__Group_2_0_0__1__Impl : ( 'ChildOf' ) ;
    public final void rule__Joint__Group_2_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5547:1: ( ( 'ChildOf' ) )
            // InternalMyDsl.g:5548:1: ( 'ChildOf' )
            {
            // InternalMyDsl.g:5548:1: ( 'ChildOf' )
            // InternalMyDsl.g:5549:2: 'ChildOf'
            {
             before(grammarAccess.getJointAccess().getChildOfKeyword_2_0_0_1()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getChildOfKeyword_2_0_0_1()); 

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
    // $ANTLR end "rule__Joint__Group_2_0_0__1__Impl"


    // $ANTLR start "rule__Joint__Group_2_0_0__2"
    // InternalMyDsl.g:5558:1: rule__Joint__Group_2_0_0__2 : rule__Joint__Group_2_0_0__2__Impl rule__Joint__Group_2_0_0__3 ;
    public final void rule__Joint__Group_2_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5562:1: ( rule__Joint__Group_2_0_0__2__Impl rule__Joint__Group_2_0_0__3 )
            // InternalMyDsl.g:5563:2: rule__Joint__Group_2_0_0__2__Impl rule__Joint__Group_2_0_0__3
            {
            pushFollow(FOLLOW_55);
            rule__Joint__Group_2_0_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group_2_0_0__3();

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
    // $ANTLR end "rule__Joint__Group_2_0_0__2"


    // $ANTLR start "rule__Joint__Group_2_0_0__2__Impl"
    // InternalMyDsl.g:5570:1: rule__Joint__Group_2_0_0__2__Impl : ( ( rule__Joint__ChildOfAssignment_2_0_0_2 ) ) ;
    public final void rule__Joint__Group_2_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5574:1: ( ( ( rule__Joint__ChildOfAssignment_2_0_0_2 ) ) )
            // InternalMyDsl.g:5575:1: ( ( rule__Joint__ChildOfAssignment_2_0_0_2 ) )
            {
            // InternalMyDsl.g:5575:1: ( ( rule__Joint__ChildOfAssignment_2_0_0_2 ) )
            // InternalMyDsl.g:5576:2: ( rule__Joint__ChildOfAssignment_2_0_0_2 )
            {
             before(grammarAccess.getJointAccess().getChildOfAssignment_2_0_0_2()); 
            // InternalMyDsl.g:5577:2: ( rule__Joint__ChildOfAssignment_2_0_0_2 )
            // InternalMyDsl.g:5577:3: rule__Joint__ChildOfAssignment_2_0_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Joint__ChildOfAssignment_2_0_0_2();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getChildOfAssignment_2_0_0_2()); 

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
    // $ANTLR end "rule__Joint__Group_2_0_0__2__Impl"


    // $ANTLR start "rule__Joint__Group_2_0_0__3"
    // InternalMyDsl.g:5585:1: rule__Joint__Group_2_0_0__3 : rule__Joint__Group_2_0_0__3__Impl rule__Joint__Group_2_0_0__4 ;
    public final void rule__Joint__Group_2_0_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5589:1: ( rule__Joint__Group_2_0_0__3__Impl rule__Joint__Group_2_0_0__4 )
            // InternalMyDsl.g:5590:2: rule__Joint__Group_2_0_0__3__Impl rule__Joint__Group_2_0_0__4
            {
            pushFollow(FOLLOW_3);
            rule__Joint__Group_2_0_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group_2_0_0__4();

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
    // $ANTLR end "rule__Joint__Group_2_0_0__3"


    // $ANTLR start "rule__Joint__Group_2_0_0__3__Impl"
    // InternalMyDsl.g:5597:1: rule__Joint__Group_2_0_0__3__Impl : ( 'ParentOf' ) ;
    public final void rule__Joint__Group_2_0_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5601:1: ( ( 'ParentOf' ) )
            // InternalMyDsl.g:5602:1: ( 'ParentOf' )
            {
            // InternalMyDsl.g:5602:1: ( 'ParentOf' )
            // InternalMyDsl.g:5603:2: 'ParentOf'
            {
             before(grammarAccess.getJointAccess().getParentOfKeyword_2_0_0_3()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getParentOfKeyword_2_0_0_3()); 

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
    // $ANTLR end "rule__Joint__Group_2_0_0__3__Impl"


    // $ANTLR start "rule__Joint__Group_2_0_0__4"
    // InternalMyDsl.g:5612:1: rule__Joint__Group_2_0_0__4 : rule__Joint__Group_2_0_0__4__Impl rule__Joint__Group_2_0_0__5 ;
    public final void rule__Joint__Group_2_0_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5616:1: ( rule__Joint__Group_2_0_0__4__Impl rule__Joint__Group_2_0_0__5 )
            // InternalMyDsl.g:5617:2: rule__Joint__Group_2_0_0__4__Impl rule__Joint__Group_2_0_0__5
            {
            pushFollow(FOLLOW_56);
            rule__Joint__Group_2_0_0__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group_2_0_0__5();

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
    // $ANTLR end "rule__Joint__Group_2_0_0__4"


    // $ANTLR start "rule__Joint__Group_2_0_0__4__Impl"
    // InternalMyDsl.g:5624:1: rule__Joint__Group_2_0_0__4__Impl : ( ( rule__Joint__ParentOfAssignment_2_0_0_4 ) ) ;
    public final void rule__Joint__Group_2_0_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5628:1: ( ( ( rule__Joint__ParentOfAssignment_2_0_0_4 ) ) )
            // InternalMyDsl.g:5629:1: ( ( rule__Joint__ParentOfAssignment_2_0_0_4 ) )
            {
            // InternalMyDsl.g:5629:1: ( ( rule__Joint__ParentOfAssignment_2_0_0_4 ) )
            // InternalMyDsl.g:5630:2: ( rule__Joint__ParentOfAssignment_2_0_0_4 )
            {
             before(grammarAccess.getJointAccess().getParentOfAssignment_2_0_0_4()); 
            // InternalMyDsl.g:5631:2: ( rule__Joint__ParentOfAssignment_2_0_0_4 )
            // InternalMyDsl.g:5631:3: rule__Joint__ParentOfAssignment_2_0_0_4
            {
            pushFollow(FOLLOW_2);
            rule__Joint__ParentOfAssignment_2_0_0_4();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getParentOfAssignment_2_0_0_4()); 

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
    // $ANTLR end "rule__Joint__Group_2_0_0__4__Impl"


    // $ANTLR start "rule__Joint__Group_2_0_0__5"
    // InternalMyDsl.g:5639:1: rule__Joint__Group_2_0_0__5 : rule__Joint__Group_2_0_0__5__Impl rule__Joint__Group_2_0_0__6 ;
    public final void rule__Joint__Group_2_0_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5643:1: ( rule__Joint__Group_2_0_0__5__Impl rule__Joint__Group_2_0_0__6 )
            // InternalMyDsl.g:5644:2: rule__Joint__Group_2_0_0__5__Impl rule__Joint__Group_2_0_0__6
            {
            pushFollow(FOLLOW_57);
            rule__Joint__Group_2_0_0__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group_2_0_0__6();

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
    // $ANTLR end "rule__Joint__Group_2_0_0__5"


    // $ANTLR start "rule__Joint__Group_2_0_0__5__Impl"
    // InternalMyDsl.g:5651:1: rule__Joint__Group_2_0_0__5__Impl : ( 'Type' ) ;
    public final void rule__Joint__Group_2_0_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5655:1: ( ( 'Type' ) )
            // InternalMyDsl.g:5656:1: ( 'Type' )
            {
            // InternalMyDsl.g:5656:1: ( 'Type' )
            // InternalMyDsl.g:5657:2: 'Type'
            {
             before(grammarAccess.getJointAccess().getTypeKeyword_2_0_0_5()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getTypeKeyword_2_0_0_5()); 

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
    // $ANTLR end "rule__Joint__Group_2_0_0__5__Impl"


    // $ANTLR start "rule__Joint__Group_2_0_0__6"
    // InternalMyDsl.g:5666:1: rule__Joint__Group_2_0_0__6 : rule__Joint__Group_2_0_0__6__Impl ;
    public final void rule__Joint__Group_2_0_0__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5670:1: ( rule__Joint__Group_2_0_0__6__Impl )
            // InternalMyDsl.g:5671:2: rule__Joint__Group_2_0_0__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Joint__Group_2_0_0__6__Impl();

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
    // $ANTLR end "rule__Joint__Group_2_0_0__6"


    // $ANTLR start "rule__Joint__Group_2_0_0__6__Impl"
    // InternalMyDsl.g:5677:1: rule__Joint__Group_2_0_0__6__Impl : ( ( rule__Joint__TypeAssignment_2_0_0_6 ) ) ;
    public final void rule__Joint__Group_2_0_0__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5681:1: ( ( ( rule__Joint__TypeAssignment_2_0_0_6 ) ) )
            // InternalMyDsl.g:5682:1: ( ( rule__Joint__TypeAssignment_2_0_0_6 ) )
            {
            // InternalMyDsl.g:5682:1: ( ( rule__Joint__TypeAssignment_2_0_0_6 ) )
            // InternalMyDsl.g:5683:2: ( rule__Joint__TypeAssignment_2_0_0_6 )
            {
             before(grammarAccess.getJointAccess().getTypeAssignment_2_0_0_6()); 
            // InternalMyDsl.g:5684:2: ( rule__Joint__TypeAssignment_2_0_0_6 )
            // InternalMyDsl.g:5684:3: rule__Joint__TypeAssignment_2_0_0_6
            {
            pushFollow(FOLLOW_2);
            rule__Joint__TypeAssignment_2_0_0_6();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getTypeAssignment_2_0_0_6()); 

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
    // $ANTLR end "rule__Joint__Group_2_0_0__6__Impl"


    // $ANTLR start "rule__Joint__Group_2_1__0"
    // InternalMyDsl.g:5693:1: rule__Joint__Group_2_1__0 : rule__Joint__Group_2_1__0__Impl rule__Joint__Group_2_1__1 ;
    public final void rule__Joint__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5697:1: ( rule__Joint__Group_2_1__0__Impl rule__Joint__Group_2_1__1 )
            // InternalMyDsl.g:5698:2: rule__Joint__Group_2_1__0__Impl rule__Joint__Group_2_1__1
            {
            pushFollow(FOLLOW_3);
            rule__Joint__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group_2_1__1();

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
    // $ANTLR end "rule__Joint__Group_2_1__0"


    // $ANTLR start "rule__Joint__Group_2_1__0__Impl"
    // InternalMyDsl.g:5705:1: rule__Joint__Group_2_1__0__Impl : ( 'reuse' ) ;
    public final void rule__Joint__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5709:1: ( ( 'reuse' ) )
            // InternalMyDsl.g:5710:1: ( 'reuse' )
            {
            // InternalMyDsl.g:5710:1: ( 'reuse' )
            // InternalMyDsl.g:5711:2: 'reuse'
            {
             before(grammarAccess.getJointAccess().getReuseKeyword_2_1_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getReuseKeyword_2_1_0()); 

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
    // $ANTLR end "rule__Joint__Group_2_1__0__Impl"


    // $ANTLR start "rule__Joint__Group_2_1__1"
    // InternalMyDsl.g:5720:1: rule__Joint__Group_2_1__1 : rule__Joint__Group_2_1__1__Impl rule__Joint__Group_2_1__2 ;
    public final void rule__Joint__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5724:1: ( rule__Joint__Group_2_1__1__Impl rule__Joint__Group_2_1__2 )
            // InternalMyDsl.g:5725:2: rule__Joint__Group_2_1__1__Impl rule__Joint__Group_2_1__2
            {
            pushFollow(FOLLOW_54);
            rule__Joint__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group_2_1__2();

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
    // $ANTLR end "rule__Joint__Group_2_1__1"


    // $ANTLR start "rule__Joint__Group_2_1__1__Impl"
    // InternalMyDsl.g:5732:1: rule__Joint__Group_2_1__1__Impl : ( ( rule__Joint__IsReuseOfAssignment_2_1_1 ) ) ;
    public final void rule__Joint__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5736:1: ( ( ( rule__Joint__IsReuseOfAssignment_2_1_1 ) ) )
            // InternalMyDsl.g:5737:1: ( ( rule__Joint__IsReuseOfAssignment_2_1_1 ) )
            {
            // InternalMyDsl.g:5737:1: ( ( rule__Joint__IsReuseOfAssignment_2_1_1 ) )
            // InternalMyDsl.g:5738:2: ( rule__Joint__IsReuseOfAssignment_2_1_1 )
            {
             before(grammarAccess.getJointAccess().getIsReuseOfAssignment_2_1_1()); 
            // InternalMyDsl.g:5739:2: ( rule__Joint__IsReuseOfAssignment_2_1_1 )
            // InternalMyDsl.g:5739:3: rule__Joint__IsReuseOfAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Joint__IsReuseOfAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getIsReuseOfAssignment_2_1_1()); 

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
    // $ANTLR end "rule__Joint__Group_2_1__1__Impl"


    // $ANTLR start "rule__Joint__Group_2_1__2"
    // InternalMyDsl.g:5747:1: rule__Joint__Group_2_1__2 : rule__Joint__Group_2_1__2__Impl rule__Joint__Group_2_1__3 ;
    public final void rule__Joint__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5751:1: ( rule__Joint__Group_2_1__2__Impl rule__Joint__Group_2_1__3 )
            // InternalMyDsl.g:5752:2: rule__Joint__Group_2_1__2__Impl rule__Joint__Group_2_1__3
            {
            pushFollow(FOLLOW_3);
            rule__Joint__Group_2_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group_2_1__3();

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
    // $ANTLR end "rule__Joint__Group_2_1__2"


    // $ANTLR start "rule__Joint__Group_2_1__2__Impl"
    // InternalMyDsl.g:5759:1: rule__Joint__Group_2_1__2__Impl : ( 'ChildOf' ) ;
    public final void rule__Joint__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5763:1: ( ( 'ChildOf' ) )
            // InternalMyDsl.g:5764:1: ( 'ChildOf' )
            {
            // InternalMyDsl.g:5764:1: ( 'ChildOf' )
            // InternalMyDsl.g:5765:2: 'ChildOf'
            {
             before(grammarAccess.getJointAccess().getChildOfKeyword_2_1_2()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getChildOfKeyword_2_1_2()); 

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
    // $ANTLR end "rule__Joint__Group_2_1__2__Impl"


    // $ANTLR start "rule__Joint__Group_2_1__3"
    // InternalMyDsl.g:5774:1: rule__Joint__Group_2_1__3 : rule__Joint__Group_2_1__3__Impl rule__Joint__Group_2_1__4 ;
    public final void rule__Joint__Group_2_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5778:1: ( rule__Joint__Group_2_1__3__Impl rule__Joint__Group_2_1__4 )
            // InternalMyDsl.g:5779:2: rule__Joint__Group_2_1__3__Impl rule__Joint__Group_2_1__4
            {
            pushFollow(FOLLOW_55);
            rule__Joint__Group_2_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group_2_1__4();

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
    // $ANTLR end "rule__Joint__Group_2_1__3"


    // $ANTLR start "rule__Joint__Group_2_1__3__Impl"
    // InternalMyDsl.g:5786:1: rule__Joint__Group_2_1__3__Impl : ( ( rule__Joint__ChildOfAssignment_2_1_3 ) ) ;
    public final void rule__Joint__Group_2_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5790:1: ( ( ( rule__Joint__ChildOfAssignment_2_1_3 ) ) )
            // InternalMyDsl.g:5791:1: ( ( rule__Joint__ChildOfAssignment_2_1_3 ) )
            {
            // InternalMyDsl.g:5791:1: ( ( rule__Joint__ChildOfAssignment_2_1_3 ) )
            // InternalMyDsl.g:5792:2: ( rule__Joint__ChildOfAssignment_2_1_3 )
            {
             before(grammarAccess.getJointAccess().getChildOfAssignment_2_1_3()); 
            // InternalMyDsl.g:5793:2: ( rule__Joint__ChildOfAssignment_2_1_3 )
            // InternalMyDsl.g:5793:3: rule__Joint__ChildOfAssignment_2_1_3
            {
            pushFollow(FOLLOW_2);
            rule__Joint__ChildOfAssignment_2_1_3();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getChildOfAssignment_2_1_3()); 

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
    // $ANTLR end "rule__Joint__Group_2_1__3__Impl"


    // $ANTLR start "rule__Joint__Group_2_1__4"
    // InternalMyDsl.g:5801:1: rule__Joint__Group_2_1__4 : rule__Joint__Group_2_1__4__Impl rule__Joint__Group_2_1__5 ;
    public final void rule__Joint__Group_2_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5805:1: ( rule__Joint__Group_2_1__4__Impl rule__Joint__Group_2_1__5 )
            // InternalMyDsl.g:5806:2: rule__Joint__Group_2_1__4__Impl rule__Joint__Group_2_1__5
            {
            pushFollow(FOLLOW_3);
            rule__Joint__Group_2_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group_2_1__5();

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
    // $ANTLR end "rule__Joint__Group_2_1__4"


    // $ANTLR start "rule__Joint__Group_2_1__4__Impl"
    // InternalMyDsl.g:5813:1: rule__Joint__Group_2_1__4__Impl : ( 'ParentOf' ) ;
    public final void rule__Joint__Group_2_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5817:1: ( ( 'ParentOf' ) )
            // InternalMyDsl.g:5818:1: ( 'ParentOf' )
            {
            // InternalMyDsl.g:5818:1: ( 'ParentOf' )
            // InternalMyDsl.g:5819:2: 'ParentOf'
            {
             before(grammarAccess.getJointAccess().getParentOfKeyword_2_1_4()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getParentOfKeyword_2_1_4()); 

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
    // $ANTLR end "rule__Joint__Group_2_1__4__Impl"


    // $ANTLR start "rule__Joint__Group_2_1__5"
    // InternalMyDsl.g:5828:1: rule__Joint__Group_2_1__5 : rule__Joint__Group_2_1__5__Impl rule__Joint__Group_2_1__6 ;
    public final void rule__Joint__Group_2_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5832:1: ( rule__Joint__Group_2_1__5__Impl rule__Joint__Group_2_1__6 )
            // InternalMyDsl.g:5833:2: rule__Joint__Group_2_1__5__Impl rule__Joint__Group_2_1__6
            {
            pushFollow(FOLLOW_11);
            rule__Joint__Group_2_1__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group_2_1__6();

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
    // $ANTLR end "rule__Joint__Group_2_1__5"


    // $ANTLR start "rule__Joint__Group_2_1__5__Impl"
    // InternalMyDsl.g:5840:1: rule__Joint__Group_2_1__5__Impl : ( ( rule__Joint__ParentOfAssignment_2_1_5 ) ) ;
    public final void rule__Joint__Group_2_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5844:1: ( ( ( rule__Joint__ParentOfAssignment_2_1_5 ) ) )
            // InternalMyDsl.g:5845:1: ( ( rule__Joint__ParentOfAssignment_2_1_5 ) )
            {
            // InternalMyDsl.g:5845:1: ( ( rule__Joint__ParentOfAssignment_2_1_5 ) )
            // InternalMyDsl.g:5846:2: ( rule__Joint__ParentOfAssignment_2_1_5 )
            {
             before(grammarAccess.getJointAccess().getParentOfAssignment_2_1_5()); 
            // InternalMyDsl.g:5847:2: ( rule__Joint__ParentOfAssignment_2_1_5 )
            // InternalMyDsl.g:5847:3: rule__Joint__ParentOfAssignment_2_1_5
            {
            pushFollow(FOLLOW_2);
            rule__Joint__ParentOfAssignment_2_1_5();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getParentOfAssignment_2_1_5()); 

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
    // $ANTLR end "rule__Joint__Group_2_1__5__Impl"


    // $ANTLR start "rule__Joint__Group_2_1__6"
    // InternalMyDsl.g:5855:1: rule__Joint__Group_2_1__6 : rule__Joint__Group_2_1__6__Impl ;
    public final void rule__Joint__Group_2_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5859:1: ( rule__Joint__Group_2_1__6__Impl )
            // InternalMyDsl.g:5860:2: rule__Joint__Group_2_1__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Joint__Group_2_1__6__Impl();

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
    // $ANTLR end "rule__Joint__Group_2_1__6"


    // $ANTLR start "rule__Joint__Group_2_1__6__Impl"
    // InternalMyDsl.g:5866:1: rule__Joint__Group_2_1__6__Impl : ( ( rule__Joint__ReuseAssignment_2_1_6 )? ) ;
    public final void rule__Joint__Group_2_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5870:1: ( ( ( rule__Joint__ReuseAssignment_2_1_6 )? ) )
            // InternalMyDsl.g:5871:1: ( ( rule__Joint__ReuseAssignment_2_1_6 )? )
            {
            // InternalMyDsl.g:5871:1: ( ( rule__Joint__ReuseAssignment_2_1_6 )? )
            // InternalMyDsl.g:5872:2: ( rule__Joint__ReuseAssignment_2_1_6 )?
            {
             before(grammarAccess.getJointAccess().getReuseAssignment_2_1_6()); 
            // InternalMyDsl.g:5873:2: ( rule__Joint__ReuseAssignment_2_1_6 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( ((LA50_0>=25 && LA50_0<=26)) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalMyDsl.g:5873:3: rule__Joint__ReuseAssignment_2_1_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__Joint__ReuseAssignment_2_1_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getJointAccess().getReuseAssignment_2_1_6()); 

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
    // $ANTLR end "rule__Joint__Group_2_1__6__Impl"


    // $ANTLR start "rule__Axis__Group__0"
    // InternalMyDsl.g:5882:1: rule__Axis__Group__0 : rule__Axis__Group__0__Impl rule__Axis__Group__1 ;
    public final void rule__Axis__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5886:1: ( rule__Axis__Group__0__Impl rule__Axis__Group__1 )
            // InternalMyDsl.g:5887:2: rule__Axis__Group__0__Impl rule__Axis__Group__1
            {
            pushFollow(FOLLOW_36);
            rule__Axis__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Axis__Group__1();

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
    // $ANTLR end "rule__Axis__Group__0"


    // $ANTLR start "rule__Axis__Group__0__Impl"
    // InternalMyDsl.g:5894:1: rule__Axis__Group__0__Impl : ( 'Axis' ) ;
    public final void rule__Axis__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5898:1: ( ( 'Axis' ) )
            // InternalMyDsl.g:5899:1: ( 'Axis' )
            {
            // InternalMyDsl.g:5899:1: ( 'Axis' )
            // InternalMyDsl.g:5900:2: 'Axis'
            {
             before(grammarAccess.getAxisAccess().getAxisKeyword_0()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getAxisAccess().getAxisKeyword_0()); 

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
    // $ANTLR end "rule__Axis__Group__0__Impl"


    // $ANTLR start "rule__Axis__Group__1"
    // InternalMyDsl.g:5909:1: rule__Axis__Group__1 : rule__Axis__Group__1__Impl rule__Axis__Group__2 ;
    public final void rule__Axis__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5913:1: ( rule__Axis__Group__1__Impl rule__Axis__Group__2 )
            // InternalMyDsl.g:5914:2: rule__Axis__Group__1__Impl rule__Axis__Group__2
            {
            pushFollow(FOLLOW_36);
            rule__Axis__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Axis__Group__2();

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
    // $ANTLR end "rule__Axis__Group__1"


    // $ANTLR start "rule__Axis__Group__1__Impl"
    // InternalMyDsl.g:5921:1: rule__Axis__Group__1__Impl : ( ( rule__Axis__NameAssignment_1 )? ) ;
    public final void rule__Axis__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5925:1: ( ( ( rule__Axis__NameAssignment_1 )? ) )
            // InternalMyDsl.g:5926:1: ( ( rule__Axis__NameAssignment_1 )? )
            {
            // InternalMyDsl.g:5926:1: ( ( rule__Axis__NameAssignment_1 )? )
            // InternalMyDsl.g:5927:2: ( rule__Axis__NameAssignment_1 )?
            {
             before(grammarAccess.getAxisAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:5928:2: ( rule__Axis__NameAssignment_1 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_ID) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalMyDsl.g:5928:3: rule__Axis__NameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Axis__NameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAxisAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Axis__Group__1__Impl"


    // $ANTLR start "rule__Axis__Group__2"
    // InternalMyDsl.g:5936:1: rule__Axis__Group__2 : rule__Axis__Group__2__Impl rule__Axis__Group__3 ;
    public final void rule__Axis__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5940:1: ( rule__Axis__Group__2__Impl rule__Axis__Group__3 )
            // InternalMyDsl.g:5941:2: rule__Axis__Group__2__Impl rule__Axis__Group__3
            {
            pushFollow(FOLLOW_48);
            rule__Axis__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Axis__Group__3();

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
    // $ANTLR end "rule__Axis__Group__2"


    // $ANTLR start "rule__Axis__Group__2__Impl"
    // InternalMyDsl.g:5948:1: rule__Axis__Group__2__Impl : ( 'x' ) ;
    public final void rule__Axis__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5952:1: ( ( 'x' ) )
            // InternalMyDsl.g:5953:1: ( 'x' )
            {
            // InternalMyDsl.g:5953:1: ( 'x' )
            // InternalMyDsl.g:5954:2: 'x'
            {
             before(grammarAccess.getAxisAccess().getXKeyword_2()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getAxisAccess().getXKeyword_2()); 

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
    // $ANTLR end "rule__Axis__Group__2__Impl"


    // $ANTLR start "rule__Axis__Group__3"
    // InternalMyDsl.g:5963:1: rule__Axis__Group__3 : rule__Axis__Group__3__Impl rule__Axis__Group__4 ;
    public final void rule__Axis__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5967:1: ( rule__Axis__Group__3__Impl rule__Axis__Group__4 )
            // InternalMyDsl.g:5968:2: rule__Axis__Group__3__Impl rule__Axis__Group__4
            {
            pushFollow(FOLLOW_37);
            rule__Axis__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Axis__Group__4();

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
    // $ANTLR end "rule__Axis__Group__3"


    // $ANTLR start "rule__Axis__Group__3__Impl"
    // InternalMyDsl.g:5975:1: rule__Axis__Group__3__Impl : ( ( rule__Axis__XAssignment_3 ) ) ;
    public final void rule__Axis__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5979:1: ( ( ( rule__Axis__XAssignment_3 ) ) )
            // InternalMyDsl.g:5980:1: ( ( rule__Axis__XAssignment_3 ) )
            {
            // InternalMyDsl.g:5980:1: ( ( rule__Axis__XAssignment_3 ) )
            // InternalMyDsl.g:5981:2: ( rule__Axis__XAssignment_3 )
            {
             before(grammarAccess.getAxisAccess().getXAssignment_3()); 
            // InternalMyDsl.g:5982:2: ( rule__Axis__XAssignment_3 )
            // InternalMyDsl.g:5982:3: rule__Axis__XAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Axis__XAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAxisAccess().getXAssignment_3()); 

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
    // $ANTLR end "rule__Axis__Group__3__Impl"


    // $ANTLR start "rule__Axis__Group__4"
    // InternalMyDsl.g:5990:1: rule__Axis__Group__4 : rule__Axis__Group__4__Impl rule__Axis__Group__5 ;
    public final void rule__Axis__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5994:1: ( rule__Axis__Group__4__Impl rule__Axis__Group__5 )
            // InternalMyDsl.g:5995:2: rule__Axis__Group__4__Impl rule__Axis__Group__5
            {
            pushFollow(FOLLOW_48);
            rule__Axis__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Axis__Group__5();

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
    // $ANTLR end "rule__Axis__Group__4"


    // $ANTLR start "rule__Axis__Group__4__Impl"
    // InternalMyDsl.g:6002:1: rule__Axis__Group__4__Impl : ( 'y' ) ;
    public final void rule__Axis__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6006:1: ( ( 'y' ) )
            // InternalMyDsl.g:6007:1: ( 'y' )
            {
            // InternalMyDsl.g:6007:1: ( 'y' )
            // InternalMyDsl.g:6008:2: 'y'
            {
             before(grammarAccess.getAxisAccess().getYKeyword_4()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getAxisAccess().getYKeyword_4()); 

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
    // $ANTLR end "rule__Axis__Group__4__Impl"


    // $ANTLR start "rule__Axis__Group__5"
    // InternalMyDsl.g:6017:1: rule__Axis__Group__5 : rule__Axis__Group__5__Impl rule__Axis__Group__6 ;
    public final void rule__Axis__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6021:1: ( rule__Axis__Group__5__Impl rule__Axis__Group__6 )
            // InternalMyDsl.g:6022:2: rule__Axis__Group__5__Impl rule__Axis__Group__6
            {
            pushFollow(FOLLOW_38);
            rule__Axis__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Axis__Group__6();

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
    // $ANTLR end "rule__Axis__Group__5"


    // $ANTLR start "rule__Axis__Group__5__Impl"
    // InternalMyDsl.g:6029:1: rule__Axis__Group__5__Impl : ( ( rule__Axis__YAssignment_5 ) ) ;
    public final void rule__Axis__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6033:1: ( ( ( rule__Axis__YAssignment_5 ) ) )
            // InternalMyDsl.g:6034:1: ( ( rule__Axis__YAssignment_5 ) )
            {
            // InternalMyDsl.g:6034:1: ( ( rule__Axis__YAssignment_5 ) )
            // InternalMyDsl.g:6035:2: ( rule__Axis__YAssignment_5 )
            {
             before(grammarAccess.getAxisAccess().getYAssignment_5()); 
            // InternalMyDsl.g:6036:2: ( rule__Axis__YAssignment_5 )
            // InternalMyDsl.g:6036:3: rule__Axis__YAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Axis__YAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getAxisAccess().getYAssignment_5()); 

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
    // $ANTLR end "rule__Axis__Group__5__Impl"


    // $ANTLR start "rule__Axis__Group__6"
    // InternalMyDsl.g:6044:1: rule__Axis__Group__6 : rule__Axis__Group__6__Impl rule__Axis__Group__7 ;
    public final void rule__Axis__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6048:1: ( rule__Axis__Group__6__Impl rule__Axis__Group__7 )
            // InternalMyDsl.g:6049:2: rule__Axis__Group__6__Impl rule__Axis__Group__7
            {
            pushFollow(FOLLOW_48);
            rule__Axis__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Axis__Group__7();

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
    // $ANTLR end "rule__Axis__Group__6"


    // $ANTLR start "rule__Axis__Group__6__Impl"
    // InternalMyDsl.g:6056:1: rule__Axis__Group__6__Impl : ( 'z' ) ;
    public final void rule__Axis__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6060:1: ( ( 'z' ) )
            // InternalMyDsl.g:6061:1: ( 'z' )
            {
            // InternalMyDsl.g:6061:1: ( 'z' )
            // InternalMyDsl.g:6062:2: 'z'
            {
             before(grammarAccess.getAxisAccess().getZKeyword_6()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getAxisAccess().getZKeyword_6()); 

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
    // $ANTLR end "rule__Axis__Group__6__Impl"


    // $ANTLR start "rule__Axis__Group__7"
    // InternalMyDsl.g:6071:1: rule__Axis__Group__7 : rule__Axis__Group__7__Impl ;
    public final void rule__Axis__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6075:1: ( rule__Axis__Group__7__Impl )
            // InternalMyDsl.g:6076:2: rule__Axis__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Axis__Group__7__Impl();

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
    // $ANTLR end "rule__Axis__Group__7"


    // $ANTLR start "rule__Axis__Group__7__Impl"
    // InternalMyDsl.g:6082:1: rule__Axis__Group__7__Impl : ( ( rule__Axis__ZAssignment_7 ) ) ;
    public final void rule__Axis__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6086:1: ( ( ( rule__Axis__ZAssignment_7 ) ) )
            // InternalMyDsl.g:6087:1: ( ( rule__Axis__ZAssignment_7 ) )
            {
            // InternalMyDsl.g:6087:1: ( ( rule__Axis__ZAssignment_7 ) )
            // InternalMyDsl.g:6088:2: ( rule__Axis__ZAssignment_7 )
            {
             before(grammarAccess.getAxisAccess().getZAssignment_7()); 
            // InternalMyDsl.g:6089:2: ( rule__Axis__ZAssignment_7 )
            // InternalMyDsl.g:6089:3: rule__Axis__ZAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Axis__ZAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getAxisAccess().getZAssignment_7()); 

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
    // $ANTLR end "rule__Axis__Group__7__Impl"


    // $ANTLR start "rule__Limit__Group__0"
    // InternalMyDsl.g:6098:1: rule__Limit__Group__0 : rule__Limit__Group__0__Impl rule__Limit__Group__1 ;
    public final void rule__Limit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6102:1: ( rule__Limit__Group__0__Impl rule__Limit__Group__1 )
            // InternalMyDsl.g:6103:2: rule__Limit__Group__0__Impl rule__Limit__Group__1
            {
            pushFollow(FOLLOW_58);
            rule__Limit__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Limit__Group__1();

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
    // $ANTLR end "rule__Limit__Group__0"


    // $ANTLR start "rule__Limit__Group__0__Impl"
    // InternalMyDsl.g:6110:1: rule__Limit__Group__0__Impl : ( 'Limit' ) ;
    public final void rule__Limit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6114:1: ( ( 'Limit' ) )
            // InternalMyDsl.g:6115:1: ( 'Limit' )
            {
            // InternalMyDsl.g:6115:1: ( 'Limit' )
            // InternalMyDsl.g:6116:2: 'Limit'
            {
             before(grammarAccess.getLimitAccess().getLimitKeyword_0()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getLimitAccess().getLimitKeyword_0()); 

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
    // $ANTLR end "rule__Limit__Group__0__Impl"


    // $ANTLR start "rule__Limit__Group__1"
    // InternalMyDsl.g:6125:1: rule__Limit__Group__1 : rule__Limit__Group__1__Impl rule__Limit__Group__2 ;
    public final void rule__Limit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6129:1: ( rule__Limit__Group__1__Impl rule__Limit__Group__2 )
            // InternalMyDsl.g:6130:2: rule__Limit__Group__1__Impl rule__Limit__Group__2
            {
            pushFollow(FOLLOW_58);
            rule__Limit__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Limit__Group__2();

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
    // $ANTLR end "rule__Limit__Group__1"


    // $ANTLR start "rule__Limit__Group__1__Impl"
    // InternalMyDsl.g:6137:1: rule__Limit__Group__1__Impl : ( ( rule__Limit__NameAssignment_1 )? ) ;
    public final void rule__Limit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6141:1: ( ( ( rule__Limit__NameAssignment_1 )? ) )
            // InternalMyDsl.g:6142:1: ( ( rule__Limit__NameAssignment_1 )? )
            {
            // InternalMyDsl.g:6142:1: ( ( rule__Limit__NameAssignment_1 )? )
            // InternalMyDsl.g:6143:2: ( rule__Limit__NameAssignment_1 )?
            {
             before(grammarAccess.getLimitAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:6144:2: ( rule__Limit__NameAssignment_1 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_ID) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalMyDsl.g:6144:3: rule__Limit__NameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Limit__NameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLimitAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Limit__Group__1__Impl"


    // $ANTLR start "rule__Limit__Group__2"
    // InternalMyDsl.g:6152:1: rule__Limit__Group__2 : rule__Limit__Group__2__Impl rule__Limit__Group__3 ;
    public final void rule__Limit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6156:1: ( rule__Limit__Group__2__Impl rule__Limit__Group__3 )
            // InternalMyDsl.g:6157:2: rule__Limit__Group__2__Impl rule__Limit__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__Limit__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Limit__Group__3();

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
    // $ANTLR end "rule__Limit__Group__2"


    // $ANTLR start "rule__Limit__Group__2__Impl"
    // InternalMyDsl.g:6164:1: rule__Limit__Group__2__Impl : ( 'effort' ) ;
    public final void rule__Limit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6168:1: ( ( 'effort' ) )
            // InternalMyDsl.g:6169:1: ( 'effort' )
            {
            // InternalMyDsl.g:6169:1: ( 'effort' )
            // InternalMyDsl.g:6170:2: 'effort'
            {
             before(grammarAccess.getLimitAccess().getEffortKeyword_2()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getLimitAccess().getEffortKeyword_2()); 

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
    // $ANTLR end "rule__Limit__Group__2__Impl"


    // $ANTLR start "rule__Limit__Group__3"
    // InternalMyDsl.g:6179:1: rule__Limit__Group__3 : rule__Limit__Group__3__Impl rule__Limit__Group__4 ;
    public final void rule__Limit__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6183:1: ( rule__Limit__Group__3__Impl rule__Limit__Group__4 )
            // InternalMyDsl.g:6184:2: rule__Limit__Group__3__Impl rule__Limit__Group__4
            {
            pushFollow(FOLLOW_59);
            rule__Limit__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Limit__Group__4();

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
    // $ANTLR end "rule__Limit__Group__3"


    // $ANTLR start "rule__Limit__Group__3__Impl"
    // InternalMyDsl.g:6191:1: rule__Limit__Group__3__Impl : ( ( rule__Limit__EffortAssignment_3 ) ) ;
    public final void rule__Limit__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6195:1: ( ( ( rule__Limit__EffortAssignment_3 ) ) )
            // InternalMyDsl.g:6196:1: ( ( rule__Limit__EffortAssignment_3 ) )
            {
            // InternalMyDsl.g:6196:1: ( ( rule__Limit__EffortAssignment_3 ) )
            // InternalMyDsl.g:6197:2: ( rule__Limit__EffortAssignment_3 )
            {
             before(grammarAccess.getLimitAccess().getEffortAssignment_3()); 
            // InternalMyDsl.g:6198:2: ( rule__Limit__EffortAssignment_3 )
            // InternalMyDsl.g:6198:3: rule__Limit__EffortAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Limit__EffortAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLimitAccess().getEffortAssignment_3()); 

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
    // $ANTLR end "rule__Limit__Group__3__Impl"


    // $ANTLR start "rule__Limit__Group__4"
    // InternalMyDsl.g:6206:1: rule__Limit__Group__4 : rule__Limit__Group__4__Impl rule__Limit__Group__5 ;
    public final void rule__Limit__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6210:1: ( rule__Limit__Group__4__Impl rule__Limit__Group__5 )
            // InternalMyDsl.g:6211:2: rule__Limit__Group__4__Impl rule__Limit__Group__5
            {
            pushFollow(FOLLOW_25);
            rule__Limit__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Limit__Group__5();

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
    // $ANTLR end "rule__Limit__Group__4"


    // $ANTLR start "rule__Limit__Group__4__Impl"
    // InternalMyDsl.g:6218:1: rule__Limit__Group__4__Impl : ( 'velocity' ) ;
    public final void rule__Limit__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6222:1: ( ( 'velocity' ) )
            // InternalMyDsl.g:6223:1: ( 'velocity' )
            {
            // InternalMyDsl.g:6223:1: ( 'velocity' )
            // InternalMyDsl.g:6224:2: 'velocity'
            {
             before(grammarAccess.getLimitAccess().getVelocityKeyword_4()); 
            match(input,72,FOLLOW_2); 
             after(grammarAccess.getLimitAccess().getVelocityKeyword_4()); 

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
    // $ANTLR end "rule__Limit__Group__4__Impl"


    // $ANTLR start "rule__Limit__Group__5"
    // InternalMyDsl.g:6233:1: rule__Limit__Group__5 : rule__Limit__Group__5__Impl rule__Limit__Group__6 ;
    public final void rule__Limit__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6237:1: ( rule__Limit__Group__5__Impl rule__Limit__Group__6 )
            // InternalMyDsl.g:6238:2: rule__Limit__Group__5__Impl rule__Limit__Group__6
            {
            pushFollow(FOLLOW_60);
            rule__Limit__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Limit__Group__6();

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
    // $ANTLR end "rule__Limit__Group__5"


    // $ANTLR start "rule__Limit__Group__5__Impl"
    // InternalMyDsl.g:6245:1: rule__Limit__Group__5__Impl : ( ( rule__Limit__VelocityAssignment_5 ) ) ;
    public final void rule__Limit__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6249:1: ( ( ( rule__Limit__VelocityAssignment_5 ) ) )
            // InternalMyDsl.g:6250:1: ( ( rule__Limit__VelocityAssignment_5 ) )
            {
            // InternalMyDsl.g:6250:1: ( ( rule__Limit__VelocityAssignment_5 ) )
            // InternalMyDsl.g:6251:2: ( rule__Limit__VelocityAssignment_5 )
            {
             before(grammarAccess.getLimitAccess().getVelocityAssignment_5()); 
            // InternalMyDsl.g:6252:2: ( rule__Limit__VelocityAssignment_5 )
            // InternalMyDsl.g:6252:3: rule__Limit__VelocityAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Limit__VelocityAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getLimitAccess().getVelocityAssignment_5()); 

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
    // $ANTLR end "rule__Limit__Group__5__Impl"


    // $ANTLR start "rule__Limit__Group__6"
    // InternalMyDsl.g:6260:1: rule__Limit__Group__6 : rule__Limit__Group__6__Impl ;
    public final void rule__Limit__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6264:1: ( rule__Limit__Group__6__Impl )
            // InternalMyDsl.g:6265:2: rule__Limit__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Limit__Group__6__Impl();

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
    // $ANTLR end "rule__Limit__Group__6"


    // $ANTLR start "rule__Limit__Group__6__Impl"
    // InternalMyDsl.g:6271:1: rule__Limit__Group__6__Impl : ( ( rule__Limit__Alternatives_6 )* ) ;
    public final void rule__Limit__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6275:1: ( ( ( rule__Limit__Alternatives_6 )* ) )
            // InternalMyDsl.g:6276:1: ( ( rule__Limit__Alternatives_6 )* )
            {
            // InternalMyDsl.g:6276:1: ( ( rule__Limit__Alternatives_6 )* )
            // InternalMyDsl.g:6277:2: ( rule__Limit__Alternatives_6 )*
            {
             before(grammarAccess.getLimitAccess().getAlternatives_6()); 
            // InternalMyDsl.g:6278:2: ( rule__Limit__Alternatives_6 )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( ((LA53_0>=73 && LA53_0<=74)) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalMyDsl.g:6278:3: rule__Limit__Alternatives_6
            	    {
            	    pushFollow(FOLLOW_61);
            	    rule__Limit__Alternatives_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

             after(grammarAccess.getLimitAccess().getAlternatives_6()); 

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
    // $ANTLR end "rule__Limit__Group__6__Impl"


    // $ANTLR start "rule__Limit__Group_6_0__0"
    // InternalMyDsl.g:6287:1: rule__Limit__Group_6_0__0 : rule__Limit__Group_6_0__0__Impl rule__Limit__Group_6_0__1 ;
    public final void rule__Limit__Group_6_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6291:1: ( rule__Limit__Group_6_0__0__Impl rule__Limit__Group_6_0__1 )
            // InternalMyDsl.g:6292:2: rule__Limit__Group_6_0__0__Impl rule__Limit__Group_6_0__1
            {
            pushFollow(FOLLOW_25);
            rule__Limit__Group_6_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Limit__Group_6_0__1();

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
    // $ANTLR end "rule__Limit__Group_6_0__0"


    // $ANTLR start "rule__Limit__Group_6_0__0__Impl"
    // InternalMyDsl.g:6299:1: rule__Limit__Group_6_0__0__Impl : ( 'lower' ) ;
    public final void rule__Limit__Group_6_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6303:1: ( ( 'lower' ) )
            // InternalMyDsl.g:6304:1: ( 'lower' )
            {
            // InternalMyDsl.g:6304:1: ( 'lower' )
            // InternalMyDsl.g:6305:2: 'lower'
            {
             before(grammarAccess.getLimitAccess().getLowerKeyword_6_0_0()); 
            match(input,73,FOLLOW_2); 
             after(grammarAccess.getLimitAccess().getLowerKeyword_6_0_0()); 

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
    // $ANTLR end "rule__Limit__Group_6_0__0__Impl"


    // $ANTLR start "rule__Limit__Group_6_0__1"
    // InternalMyDsl.g:6314:1: rule__Limit__Group_6_0__1 : rule__Limit__Group_6_0__1__Impl ;
    public final void rule__Limit__Group_6_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6318:1: ( rule__Limit__Group_6_0__1__Impl )
            // InternalMyDsl.g:6319:2: rule__Limit__Group_6_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Limit__Group_6_0__1__Impl();

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
    // $ANTLR end "rule__Limit__Group_6_0__1"


    // $ANTLR start "rule__Limit__Group_6_0__1__Impl"
    // InternalMyDsl.g:6325:1: rule__Limit__Group_6_0__1__Impl : ( ( rule__Limit__LowerAssignment_6_0_1 ) ) ;
    public final void rule__Limit__Group_6_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6329:1: ( ( ( rule__Limit__LowerAssignment_6_0_1 ) ) )
            // InternalMyDsl.g:6330:1: ( ( rule__Limit__LowerAssignment_6_0_1 ) )
            {
            // InternalMyDsl.g:6330:1: ( ( rule__Limit__LowerAssignment_6_0_1 ) )
            // InternalMyDsl.g:6331:2: ( rule__Limit__LowerAssignment_6_0_1 )
            {
             before(grammarAccess.getLimitAccess().getLowerAssignment_6_0_1()); 
            // InternalMyDsl.g:6332:2: ( rule__Limit__LowerAssignment_6_0_1 )
            // InternalMyDsl.g:6332:3: rule__Limit__LowerAssignment_6_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Limit__LowerAssignment_6_0_1();

            state._fsp--;


            }

             after(grammarAccess.getLimitAccess().getLowerAssignment_6_0_1()); 

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
    // $ANTLR end "rule__Limit__Group_6_0__1__Impl"


    // $ANTLR start "rule__Limit__Group_6_1__0"
    // InternalMyDsl.g:6341:1: rule__Limit__Group_6_1__0 : rule__Limit__Group_6_1__0__Impl rule__Limit__Group_6_1__1 ;
    public final void rule__Limit__Group_6_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6345:1: ( rule__Limit__Group_6_1__0__Impl rule__Limit__Group_6_1__1 )
            // InternalMyDsl.g:6346:2: rule__Limit__Group_6_1__0__Impl rule__Limit__Group_6_1__1
            {
            pushFollow(FOLLOW_25);
            rule__Limit__Group_6_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Limit__Group_6_1__1();

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
    // $ANTLR end "rule__Limit__Group_6_1__0"


    // $ANTLR start "rule__Limit__Group_6_1__0__Impl"
    // InternalMyDsl.g:6353:1: rule__Limit__Group_6_1__0__Impl : ( 'upper' ) ;
    public final void rule__Limit__Group_6_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6357:1: ( ( 'upper' ) )
            // InternalMyDsl.g:6358:1: ( 'upper' )
            {
            // InternalMyDsl.g:6358:1: ( 'upper' )
            // InternalMyDsl.g:6359:2: 'upper'
            {
             before(grammarAccess.getLimitAccess().getUpperKeyword_6_1_0()); 
            match(input,74,FOLLOW_2); 
             after(grammarAccess.getLimitAccess().getUpperKeyword_6_1_0()); 

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
    // $ANTLR end "rule__Limit__Group_6_1__0__Impl"


    // $ANTLR start "rule__Limit__Group_6_1__1"
    // InternalMyDsl.g:6368:1: rule__Limit__Group_6_1__1 : rule__Limit__Group_6_1__1__Impl ;
    public final void rule__Limit__Group_6_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6372:1: ( rule__Limit__Group_6_1__1__Impl )
            // InternalMyDsl.g:6373:2: rule__Limit__Group_6_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Limit__Group_6_1__1__Impl();

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
    // $ANTLR end "rule__Limit__Group_6_1__1"


    // $ANTLR start "rule__Limit__Group_6_1__1__Impl"
    // InternalMyDsl.g:6379:1: rule__Limit__Group_6_1__1__Impl : ( ( rule__Limit__UpperAssignment_6_1_1 ) ) ;
    public final void rule__Limit__Group_6_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6383:1: ( ( ( rule__Limit__UpperAssignment_6_1_1 ) ) )
            // InternalMyDsl.g:6384:1: ( ( rule__Limit__UpperAssignment_6_1_1 ) )
            {
            // InternalMyDsl.g:6384:1: ( ( rule__Limit__UpperAssignment_6_1_1 ) )
            // InternalMyDsl.g:6385:2: ( rule__Limit__UpperAssignment_6_1_1 )
            {
             before(grammarAccess.getLimitAccess().getUpperAssignment_6_1_1()); 
            // InternalMyDsl.g:6386:2: ( rule__Limit__UpperAssignment_6_1_1 )
            // InternalMyDsl.g:6386:3: rule__Limit__UpperAssignment_6_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Limit__UpperAssignment_6_1_1();

            state._fsp--;


            }

             after(grammarAccess.getLimitAccess().getUpperAssignment_6_1_1()); 

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
    // $ANTLR end "rule__Limit__Group_6_1__1__Impl"


    // $ANTLR start "rule__Calibration__Group__0"
    // InternalMyDsl.g:6395:1: rule__Calibration__Group__0 : rule__Calibration__Group__0__Impl rule__Calibration__Group__1 ;
    public final void rule__Calibration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6399:1: ( rule__Calibration__Group__0__Impl rule__Calibration__Group__1 )
            // InternalMyDsl.g:6400:2: rule__Calibration__Group__0__Impl rule__Calibration__Group__1
            {
            pushFollow(FOLLOW_62);
            rule__Calibration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Calibration__Group__1();

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
    // $ANTLR end "rule__Calibration__Group__0"


    // $ANTLR start "rule__Calibration__Group__0__Impl"
    // InternalMyDsl.g:6407:1: rule__Calibration__Group__0__Impl : ( () ) ;
    public final void rule__Calibration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6411:1: ( ( () ) )
            // InternalMyDsl.g:6412:1: ( () )
            {
            // InternalMyDsl.g:6412:1: ( () )
            // InternalMyDsl.g:6413:2: ()
            {
             before(grammarAccess.getCalibrationAccess().getCalibrationAction_0()); 
            // InternalMyDsl.g:6414:2: ()
            // InternalMyDsl.g:6414:3: 
            {
            }

             after(grammarAccess.getCalibrationAccess().getCalibrationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calibration__Group__0__Impl"


    // $ANTLR start "rule__Calibration__Group__1"
    // InternalMyDsl.g:6422:1: rule__Calibration__Group__1 : rule__Calibration__Group__1__Impl rule__Calibration__Group__2 ;
    public final void rule__Calibration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6426:1: ( rule__Calibration__Group__1__Impl rule__Calibration__Group__2 )
            // InternalMyDsl.g:6427:2: rule__Calibration__Group__1__Impl rule__Calibration__Group__2
            {
            pushFollow(FOLLOW_63);
            rule__Calibration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Calibration__Group__2();

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
    // $ANTLR end "rule__Calibration__Group__1"


    // $ANTLR start "rule__Calibration__Group__1__Impl"
    // InternalMyDsl.g:6434:1: rule__Calibration__Group__1__Impl : ( 'Calibration' ) ;
    public final void rule__Calibration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6438:1: ( ( 'Calibration' ) )
            // InternalMyDsl.g:6439:1: ( 'Calibration' )
            {
            // InternalMyDsl.g:6439:1: ( 'Calibration' )
            // InternalMyDsl.g:6440:2: 'Calibration'
            {
             before(grammarAccess.getCalibrationAccess().getCalibrationKeyword_1()); 
            match(input,75,FOLLOW_2); 
             after(grammarAccess.getCalibrationAccess().getCalibrationKeyword_1()); 

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
    // $ANTLR end "rule__Calibration__Group__1__Impl"


    // $ANTLR start "rule__Calibration__Group__2"
    // InternalMyDsl.g:6449:1: rule__Calibration__Group__2 : rule__Calibration__Group__2__Impl rule__Calibration__Group__3 ;
    public final void rule__Calibration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6453:1: ( rule__Calibration__Group__2__Impl rule__Calibration__Group__3 )
            // InternalMyDsl.g:6454:2: rule__Calibration__Group__2__Impl rule__Calibration__Group__3
            {
            pushFollow(FOLLOW_63);
            rule__Calibration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Calibration__Group__3();

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
    // $ANTLR end "rule__Calibration__Group__2"


    // $ANTLR start "rule__Calibration__Group__2__Impl"
    // InternalMyDsl.g:6461:1: rule__Calibration__Group__2__Impl : ( ( rule__Calibration__NameAssignment_2 )? ) ;
    public final void rule__Calibration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6465:1: ( ( ( rule__Calibration__NameAssignment_2 )? ) )
            // InternalMyDsl.g:6466:1: ( ( rule__Calibration__NameAssignment_2 )? )
            {
            // InternalMyDsl.g:6466:1: ( ( rule__Calibration__NameAssignment_2 )? )
            // InternalMyDsl.g:6467:2: ( rule__Calibration__NameAssignment_2 )?
            {
             before(grammarAccess.getCalibrationAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:6468:2: ( rule__Calibration__NameAssignment_2 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_ID) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalMyDsl.g:6468:3: rule__Calibration__NameAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Calibration__NameAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCalibrationAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Calibration__Group__2__Impl"


    // $ANTLR start "rule__Calibration__Group__3"
    // InternalMyDsl.g:6476:1: rule__Calibration__Group__3 : rule__Calibration__Group__3__Impl ;
    public final void rule__Calibration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6480:1: ( rule__Calibration__Group__3__Impl )
            // InternalMyDsl.g:6481:2: rule__Calibration__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Calibration__Group__3__Impl();

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
    // $ANTLR end "rule__Calibration__Group__3"


    // $ANTLR start "rule__Calibration__Group__3__Impl"
    // InternalMyDsl.g:6487:1: rule__Calibration__Group__3__Impl : ( ( rule__Calibration__Alternatives_3 ) ) ;
    public final void rule__Calibration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6491:1: ( ( ( rule__Calibration__Alternatives_3 ) ) )
            // InternalMyDsl.g:6492:1: ( ( rule__Calibration__Alternatives_3 ) )
            {
            // InternalMyDsl.g:6492:1: ( ( rule__Calibration__Alternatives_3 ) )
            // InternalMyDsl.g:6493:2: ( rule__Calibration__Alternatives_3 )
            {
             before(grammarAccess.getCalibrationAccess().getAlternatives_3()); 
            // InternalMyDsl.g:6494:2: ( rule__Calibration__Alternatives_3 )
            // InternalMyDsl.g:6494:3: rule__Calibration__Alternatives_3
            {
            pushFollow(FOLLOW_2);
            rule__Calibration__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getCalibrationAccess().getAlternatives_3()); 

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
    // $ANTLR end "rule__Calibration__Group__3__Impl"


    // $ANTLR start "rule__Calibration__Group_3_0__0"
    // InternalMyDsl.g:6503:1: rule__Calibration__Group_3_0__0 : rule__Calibration__Group_3_0__0__Impl rule__Calibration__Group_3_0__1 ;
    public final void rule__Calibration__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6507:1: ( rule__Calibration__Group_3_0__0__Impl rule__Calibration__Group_3_0__1 )
            // InternalMyDsl.g:6508:2: rule__Calibration__Group_3_0__0__Impl rule__Calibration__Group_3_0__1
            {
            pushFollow(FOLLOW_25);
            rule__Calibration__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Calibration__Group_3_0__1();

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
    // $ANTLR end "rule__Calibration__Group_3_0__0"


    // $ANTLR start "rule__Calibration__Group_3_0__0__Impl"
    // InternalMyDsl.g:6515:1: rule__Calibration__Group_3_0__0__Impl : ( 'rising' ) ;
    public final void rule__Calibration__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6519:1: ( ( 'rising' ) )
            // InternalMyDsl.g:6520:1: ( 'rising' )
            {
            // InternalMyDsl.g:6520:1: ( 'rising' )
            // InternalMyDsl.g:6521:2: 'rising'
            {
             before(grammarAccess.getCalibrationAccess().getRisingKeyword_3_0_0()); 
            match(input,76,FOLLOW_2); 
             after(grammarAccess.getCalibrationAccess().getRisingKeyword_3_0_0()); 

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
    // $ANTLR end "rule__Calibration__Group_3_0__0__Impl"


    // $ANTLR start "rule__Calibration__Group_3_0__1"
    // InternalMyDsl.g:6530:1: rule__Calibration__Group_3_0__1 : rule__Calibration__Group_3_0__1__Impl ;
    public final void rule__Calibration__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6534:1: ( rule__Calibration__Group_3_0__1__Impl )
            // InternalMyDsl.g:6535:2: rule__Calibration__Group_3_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Calibration__Group_3_0__1__Impl();

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
    // $ANTLR end "rule__Calibration__Group_3_0__1"


    // $ANTLR start "rule__Calibration__Group_3_0__1__Impl"
    // InternalMyDsl.g:6541:1: rule__Calibration__Group_3_0__1__Impl : ( ( rule__Calibration__RisingAssignment_3_0_1 ) ) ;
    public final void rule__Calibration__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6545:1: ( ( ( rule__Calibration__RisingAssignment_3_0_1 ) ) )
            // InternalMyDsl.g:6546:1: ( ( rule__Calibration__RisingAssignment_3_0_1 ) )
            {
            // InternalMyDsl.g:6546:1: ( ( rule__Calibration__RisingAssignment_3_0_1 ) )
            // InternalMyDsl.g:6547:2: ( rule__Calibration__RisingAssignment_3_0_1 )
            {
             before(grammarAccess.getCalibrationAccess().getRisingAssignment_3_0_1()); 
            // InternalMyDsl.g:6548:2: ( rule__Calibration__RisingAssignment_3_0_1 )
            // InternalMyDsl.g:6548:3: rule__Calibration__RisingAssignment_3_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Calibration__RisingAssignment_3_0_1();

            state._fsp--;


            }

             after(grammarAccess.getCalibrationAccess().getRisingAssignment_3_0_1()); 

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
    // $ANTLR end "rule__Calibration__Group_3_0__1__Impl"


    // $ANTLR start "rule__Calibration__Group_3_1__0"
    // InternalMyDsl.g:6557:1: rule__Calibration__Group_3_1__0 : rule__Calibration__Group_3_1__0__Impl rule__Calibration__Group_3_1__1 ;
    public final void rule__Calibration__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6561:1: ( rule__Calibration__Group_3_1__0__Impl rule__Calibration__Group_3_1__1 )
            // InternalMyDsl.g:6562:2: rule__Calibration__Group_3_1__0__Impl rule__Calibration__Group_3_1__1
            {
            pushFollow(FOLLOW_25);
            rule__Calibration__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Calibration__Group_3_1__1();

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
    // $ANTLR end "rule__Calibration__Group_3_1__0"


    // $ANTLR start "rule__Calibration__Group_3_1__0__Impl"
    // InternalMyDsl.g:6569:1: rule__Calibration__Group_3_1__0__Impl : ( 'falling' ) ;
    public final void rule__Calibration__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6573:1: ( ( 'falling' ) )
            // InternalMyDsl.g:6574:1: ( 'falling' )
            {
            // InternalMyDsl.g:6574:1: ( 'falling' )
            // InternalMyDsl.g:6575:2: 'falling'
            {
             before(grammarAccess.getCalibrationAccess().getFallingKeyword_3_1_0()); 
            match(input,77,FOLLOW_2); 
             after(grammarAccess.getCalibrationAccess().getFallingKeyword_3_1_0()); 

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
    // $ANTLR end "rule__Calibration__Group_3_1__0__Impl"


    // $ANTLR start "rule__Calibration__Group_3_1__1"
    // InternalMyDsl.g:6584:1: rule__Calibration__Group_3_1__1 : rule__Calibration__Group_3_1__1__Impl ;
    public final void rule__Calibration__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6588:1: ( rule__Calibration__Group_3_1__1__Impl )
            // InternalMyDsl.g:6589:2: rule__Calibration__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Calibration__Group_3_1__1__Impl();

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
    // $ANTLR end "rule__Calibration__Group_3_1__1"


    // $ANTLR start "rule__Calibration__Group_3_1__1__Impl"
    // InternalMyDsl.g:6595:1: rule__Calibration__Group_3_1__1__Impl : ( ( rule__Calibration__FallingAssignment_3_1_1 ) ) ;
    public final void rule__Calibration__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6599:1: ( ( ( rule__Calibration__FallingAssignment_3_1_1 ) ) )
            // InternalMyDsl.g:6600:1: ( ( rule__Calibration__FallingAssignment_3_1_1 ) )
            {
            // InternalMyDsl.g:6600:1: ( ( rule__Calibration__FallingAssignment_3_1_1 ) )
            // InternalMyDsl.g:6601:2: ( rule__Calibration__FallingAssignment_3_1_1 )
            {
             before(grammarAccess.getCalibrationAccess().getFallingAssignment_3_1_1()); 
            // InternalMyDsl.g:6602:2: ( rule__Calibration__FallingAssignment_3_1_1 )
            // InternalMyDsl.g:6602:3: rule__Calibration__FallingAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Calibration__FallingAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCalibrationAccess().getFallingAssignment_3_1_1()); 

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
    // $ANTLR end "rule__Calibration__Group_3_1__1__Impl"


    // $ANTLR start "rule__Dynamics__Group__0"
    // InternalMyDsl.g:6611:1: rule__Dynamics__Group__0 : rule__Dynamics__Group__0__Impl rule__Dynamics__Group__1 ;
    public final void rule__Dynamics__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6615:1: ( rule__Dynamics__Group__0__Impl rule__Dynamics__Group__1 )
            // InternalMyDsl.g:6616:2: rule__Dynamics__Group__0__Impl rule__Dynamics__Group__1
            {
            pushFollow(FOLLOW_64);
            rule__Dynamics__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dynamics__Group__1();

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
    // $ANTLR end "rule__Dynamics__Group__0"


    // $ANTLR start "rule__Dynamics__Group__0__Impl"
    // InternalMyDsl.g:6623:1: rule__Dynamics__Group__0__Impl : ( () ) ;
    public final void rule__Dynamics__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6627:1: ( ( () ) )
            // InternalMyDsl.g:6628:1: ( () )
            {
            // InternalMyDsl.g:6628:1: ( () )
            // InternalMyDsl.g:6629:2: ()
            {
             before(grammarAccess.getDynamicsAccess().getDynamicsAction_0()); 
            // InternalMyDsl.g:6630:2: ()
            // InternalMyDsl.g:6630:3: 
            {
            }

             after(grammarAccess.getDynamicsAccess().getDynamicsAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamics__Group__0__Impl"


    // $ANTLR start "rule__Dynamics__Group__1"
    // InternalMyDsl.g:6638:1: rule__Dynamics__Group__1 : rule__Dynamics__Group__1__Impl rule__Dynamics__Group__2 ;
    public final void rule__Dynamics__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6642:1: ( rule__Dynamics__Group__1__Impl rule__Dynamics__Group__2 )
            // InternalMyDsl.g:6643:2: rule__Dynamics__Group__1__Impl rule__Dynamics__Group__2
            {
            pushFollow(FOLLOW_65);
            rule__Dynamics__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dynamics__Group__2();

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
    // $ANTLR end "rule__Dynamics__Group__1"


    // $ANTLR start "rule__Dynamics__Group__1__Impl"
    // InternalMyDsl.g:6650:1: rule__Dynamics__Group__1__Impl : ( 'Dynamics' ) ;
    public final void rule__Dynamics__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6654:1: ( ( 'Dynamics' ) )
            // InternalMyDsl.g:6655:1: ( 'Dynamics' )
            {
            // InternalMyDsl.g:6655:1: ( 'Dynamics' )
            // InternalMyDsl.g:6656:2: 'Dynamics'
            {
             before(grammarAccess.getDynamicsAccess().getDynamicsKeyword_1()); 
            match(input,78,FOLLOW_2); 
             after(grammarAccess.getDynamicsAccess().getDynamicsKeyword_1()); 

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
    // $ANTLR end "rule__Dynamics__Group__1__Impl"


    // $ANTLR start "rule__Dynamics__Group__2"
    // InternalMyDsl.g:6665:1: rule__Dynamics__Group__2 : rule__Dynamics__Group__2__Impl rule__Dynamics__Group__3 ;
    public final void rule__Dynamics__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6669:1: ( rule__Dynamics__Group__2__Impl rule__Dynamics__Group__3 )
            // InternalMyDsl.g:6670:2: rule__Dynamics__Group__2__Impl rule__Dynamics__Group__3
            {
            pushFollow(FOLLOW_65);
            rule__Dynamics__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dynamics__Group__3();

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
    // $ANTLR end "rule__Dynamics__Group__2"


    // $ANTLR start "rule__Dynamics__Group__2__Impl"
    // InternalMyDsl.g:6677:1: rule__Dynamics__Group__2__Impl : ( ( rule__Dynamics__NameAssignment_2 )? ) ;
    public final void rule__Dynamics__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6681:1: ( ( ( rule__Dynamics__NameAssignment_2 )? ) )
            // InternalMyDsl.g:6682:1: ( ( rule__Dynamics__NameAssignment_2 )? )
            {
            // InternalMyDsl.g:6682:1: ( ( rule__Dynamics__NameAssignment_2 )? )
            // InternalMyDsl.g:6683:2: ( rule__Dynamics__NameAssignment_2 )?
            {
             before(grammarAccess.getDynamicsAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:6684:2: ( rule__Dynamics__NameAssignment_2 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_ID) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalMyDsl.g:6684:3: rule__Dynamics__NameAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Dynamics__NameAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDynamicsAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Dynamics__Group__2__Impl"


    // $ANTLR start "rule__Dynamics__Group__3"
    // InternalMyDsl.g:6692:1: rule__Dynamics__Group__3 : rule__Dynamics__Group__3__Impl ;
    public final void rule__Dynamics__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6696:1: ( rule__Dynamics__Group__3__Impl )
            // InternalMyDsl.g:6697:2: rule__Dynamics__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Dynamics__Group__3__Impl();

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
    // $ANTLR end "rule__Dynamics__Group__3"


    // $ANTLR start "rule__Dynamics__Group__3__Impl"
    // InternalMyDsl.g:6703:1: rule__Dynamics__Group__3__Impl : ( ( ( rule__Dynamics__Alternatives_3 ) ) ( ( rule__Dynamics__Alternatives_3 )* ) ) ;
    public final void rule__Dynamics__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6707:1: ( ( ( ( rule__Dynamics__Alternatives_3 ) ) ( ( rule__Dynamics__Alternatives_3 )* ) ) )
            // InternalMyDsl.g:6708:1: ( ( ( rule__Dynamics__Alternatives_3 ) ) ( ( rule__Dynamics__Alternatives_3 )* ) )
            {
            // InternalMyDsl.g:6708:1: ( ( ( rule__Dynamics__Alternatives_3 ) ) ( ( rule__Dynamics__Alternatives_3 )* ) )
            // InternalMyDsl.g:6709:2: ( ( rule__Dynamics__Alternatives_3 ) ) ( ( rule__Dynamics__Alternatives_3 )* )
            {
            // InternalMyDsl.g:6709:2: ( ( rule__Dynamics__Alternatives_3 ) )
            // InternalMyDsl.g:6710:3: ( rule__Dynamics__Alternatives_3 )
            {
             before(grammarAccess.getDynamicsAccess().getAlternatives_3()); 
            // InternalMyDsl.g:6711:3: ( rule__Dynamics__Alternatives_3 )
            // InternalMyDsl.g:6711:4: rule__Dynamics__Alternatives_3
            {
            pushFollow(FOLLOW_66);
            rule__Dynamics__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getDynamicsAccess().getAlternatives_3()); 

            }

            // InternalMyDsl.g:6714:2: ( ( rule__Dynamics__Alternatives_3 )* )
            // InternalMyDsl.g:6715:3: ( rule__Dynamics__Alternatives_3 )*
            {
             before(grammarAccess.getDynamicsAccess().getAlternatives_3()); 
            // InternalMyDsl.g:6716:3: ( rule__Dynamics__Alternatives_3 )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( ((LA56_0>=79 && LA56_0<=80)) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalMyDsl.g:6716:4: rule__Dynamics__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_66);
            	    rule__Dynamics__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);

             after(grammarAccess.getDynamicsAccess().getAlternatives_3()); 

            }


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
    // $ANTLR end "rule__Dynamics__Group__3__Impl"


    // $ANTLR start "rule__Dynamics__Group_3_0__0"
    // InternalMyDsl.g:6726:1: rule__Dynamics__Group_3_0__0 : rule__Dynamics__Group_3_0__0__Impl rule__Dynamics__Group_3_0__1 ;
    public final void rule__Dynamics__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6730:1: ( rule__Dynamics__Group_3_0__0__Impl rule__Dynamics__Group_3_0__1 )
            // InternalMyDsl.g:6731:2: rule__Dynamics__Group_3_0__0__Impl rule__Dynamics__Group_3_0__1
            {
            pushFollow(FOLLOW_25);
            rule__Dynamics__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dynamics__Group_3_0__1();

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
    // $ANTLR end "rule__Dynamics__Group_3_0__0"


    // $ANTLR start "rule__Dynamics__Group_3_0__0__Impl"
    // InternalMyDsl.g:6738:1: rule__Dynamics__Group_3_0__0__Impl : ( 'friction' ) ;
    public final void rule__Dynamics__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6742:1: ( ( 'friction' ) )
            // InternalMyDsl.g:6743:1: ( 'friction' )
            {
            // InternalMyDsl.g:6743:1: ( 'friction' )
            // InternalMyDsl.g:6744:2: 'friction'
            {
             before(grammarAccess.getDynamicsAccess().getFrictionKeyword_3_0_0()); 
            match(input,79,FOLLOW_2); 
             after(grammarAccess.getDynamicsAccess().getFrictionKeyword_3_0_0()); 

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
    // $ANTLR end "rule__Dynamics__Group_3_0__0__Impl"


    // $ANTLR start "rule__Dynamics__Group_3_0__1"
    // InternalMyDsl.g:6753:1: rule__Dynamics__Group_3_0__1 : rule__Dynamics__Group_3_0__1__Impl ;
    public final void rule__Dynamics__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6757:1: ( rule__Dynamics__Group_3_0__1__Impl )
            // InternalMyDsl.g:6758:2: rule__Dynamics__Group_3_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Dynamics__Group_3_0__1__Impl();

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
    // $ANTLR end "rule__Dynamics__Group_3_0__1"


    // $ANTLR start "rule__Dynamics__Group_3_0__1__Impl"
    // InternalMyDsl.g:6764:1: rule__Dynamics__Group_3_0__1__Impl : ( ( rule__Dynamics__FrictionAssignment_3_0_1 ) ) ;
    public final void rule__Dynamics__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6768:1: ( ( ( rule__Dynamics__FrictionAssignment_3_0_1 ) ) )
            // InternalMyDsl.g:6769:1: ( ( rule__Dynamics__FrictionAssignment_3_0_1 ) )
            {
            // InternalMyDsl.g:6769:1: ( ( rule__Dynamics__FrictionAssignment_3_0_1 ) )
            // InternalMyDsl.g:6770:2: ( rule__Dynamics__FrictionAssignment_3_0_1 )
            {
             before(grammarAccess.getDynamicsAccess().getFrictionAssignment_3_0_1()); 
            // InternalMyDsl.g:6771:2: ( rule__Dynamics__FrictionAssignment_3_0_1 )
            // InternalMyDsl.g:6771:3: rule__Dynamics__FrictionAssignment_3_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Dynamics__FrictionAssignment_3_0_1();

            state._fsp--;


            }

             after(grammarAccess.getDynamicsAccess().getFrictionAssignment_3_0_1()); 

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
    // $ANTLR end "rule__Dynamics__Group_3_0__1__Impl"


    // $ANTLR start "rule__Dynamics__Group_3_1__0"
    // InternalMyDsl.g:6780:1: rule__Dynamics__Group_3_1__0 : rule__Dynamics__Group_3_1__0__Impl rule__Dynamics__Group_3_1__1 ;
    public final void rule__Dynamics__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6784:1: ( rule__Dynamics__Group_3_1__0__Impl rule__Dynamics__Group_3_1__1 )
            // InternalMyDsl.g:6785:2: rule__Dynamics__Group_3_1__0__Impl rule__Dynamics__Group_3_1__1
            {
            pushFollow(FOLLOW_25);
            rule__Dynamics__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dynamics__Group_3_1__1();

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
    // $ANTLR end "rule__Dynamics__Group_3_1__0"


    // $ANTLR start "rule__Dynamics__Group_3_1__0__Impl"
    // InternalMyDsl.g:6792:1: rule__Dynamics__Group_3_1__0__Impl : ( 'damping' ) ;
    public final void rule__Dynamics__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6796:1: ( ( 'damping' ) )
            // InternalMyDsl.g:6797:1: ( 'damping' )
            {
            // InternalMyDsl.g:6797:1: ( 'damping' )
            // InternalMyDsl.g:6798:2: 'damping'
            {
             before(grammarAccess.getDynamicsAccess().getDampingKeyword_3_1_0()); 
            match(input,80,FOLLOW_2); 
             after(grammarAccess.getDynamicsAccess().getDampingKeyword_3_1_0()); 

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
    // $ANTLR end "rule__Dynamics__Group_3_1__0__Impl"


    // $ANTLR start "rule__Dynamics__Group_3_1__1"
    // InternalMyDsl.g:6807:1: rule__Dynamics__Group_3_1__1 : rule__Dynamics__Group_3_1__1__Impl ;
    public final void rule__Dynamics__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6811:1: ( rule__Dynamics__Group_3_1__1__Impl )
            // InternalMyDsl.g:6812:2: rule__Dynamics__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Dynamics__Group_3_1__1__Impl();

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
    // $ANTLR end "rule__Dynamics__Group_3_1__1"


    // $ANTLR start "rule__Dynamics__Group_3_1__1__Impl"
    // InternalMyDsl.g:6818:1: rule__Dynamics__Group_3_1__1__Impl : ( ( rule__Dynamics__DampingAssignment_3_1_1 ) ) ;
    public final void rule__Dynamics__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6822:1: ( ( ( rule__Dynamics__DampingAssignment_3_1_1 ) ) )
            // InternalMyDsl.g:6823:1: ( ( rule__Dynamics__DampingAssignment_3_1_1 ) )
            {
            // InternalMyDsl.g:6823:1: ( ( rule__Dynamics__DampingAssignment_3_1_1 ) )
            // InternalMyDsl.g:6824:2: ( rule__Dynamics__DampingAssignment_3_1_1 )
            {
             before(grammarAccess.getDynamicsAccess().getDampingAssignment_3_1_1()); 
            // InternalMyDsl.g:6825:2: ( rule__Dynamics__DampingAssignment_3_1_1 )
            // InternalMyDsl.g:6825:3: rule__Dynamics__DampingAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Dynamics__DampingAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getDynamicsAccess().getDampingAssignment_3_1_1()); 

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
    // $ANTLR end "rule__Dynamics__Group_3_1__1__Impl"


    // $ANTLR start "rule__SafetyController__Group__0"
    // InternalMyDsl.g:6834:1: rule__SafetyController__Group__0 : rule__SafetyController__Group__0__Impl rule__SafetyController__Group__1 ;
    public final void rule__SafetyController__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6838:1: ( rule__SafetyController__Group__0__Impl rule__SafetyController__Group__1 )
            // InternalMyDsl.g:6839:2: rule__SafetyController__Group__0__Impl rule__SafetyController__Group__1
            {
            pushFollow(FOLLOW_67);
            rule__SafetyController__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyController__Group__1();

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
    // $ANTLR end "rule__SafetyController__Group__0"


    // $ANTLR start "rule__SafetyController__Group__0__Impl"
    // InternalMyDsl.g:6846:1: rule__SafetyController__Group__0__Impl : ( 'SafetyController' ) ;
    public final void rule__SafetyController__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6850:1: ( ( 'SafetyController' ) )
            // InternalMyDsl.g:6851:1: ( 'SafetyController' )
            {
            // InternalMyDsl.g:6851:1: ( 'SafetyController' )
            // InternalMyDsl.g:6852:2: 'SafetyController'
            {
             before(grammarAccess.getSafetyControllerAccess().getSafetyControllerKeyword_0()); 
            match(input,81,FOLLOW_2); 
             after(grammarAccess.getSafetyControllerAccess().getSafetyControllerKeyword_0()); 

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
    // $ANTLR end "rule__SafetyController__Group__0__Impl"


    // $ANTLR start "rule__SafetyController__Group__1"
    // InternalMyDsl.g:6861:1: rule__SafetyController__Group__1 : rule__SafetyController__Group__1__Impl rule__SafetyController__Group__2 ;
    public final void rule__SafetyController__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6865:1: ( rule__SafetyController__Group__1__Impl rule__SafetyController__Group__2 )
            // InternalMyDsl.g:6866:2: rule__SafetyController__Group__1__Impl rule__SafetyController__Group__2
            {
            pushFollow(FOLLOW_67);
            rule__SafetyController__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyController__Group__2();

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
    // $ANTLR end "rule__SafetyController__Group__1"


    // $ANTLR start "rule__SafetyController__Group__1__Impl"
    // InternalMyDsl.g:6873:1: rule__SafetyController__Group__1__Impl : ( ( rule__SafetyController__NameAssignment_1 )? ) ;
    public final void rule__SafetyController__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6877:1: ( ( ( rule__SafetyController__NameAssignment_1 )? ) )
            // InternalMyDsl.g:6878:1: ( ( rule__SafetyController__NameAssignment_1 )? )
            {
            // InternalMyDsl.g:6878:1: ( ( rule__SafetyController__NameAssignment_1 )? )
            // InternalMyDsl.g:6879:2: ( rule__SafetyController__NameAssignment_1 )?
            {
             before(grammarAccess.getSafetyControllerAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:6880:2: ( rule__SafetyController__NameAssignment_1 )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_ID) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalMyDsl.g:6880:3: rule__SafetyController__NameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__SafetyController__NameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSafetyControllerAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__SafetyController__Group__1__Impl"


    // $ANTLR start "rule__SafetyController__Group__2"
    // InternalMyDsl.g:6888:1: rule__SafetyController__Group__2 : rule__SafetyController__Group__2__Impl rule__SafetyController__Group__3 ;
    public final void rule__SafetyController__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6892:1: ( rule__SafetyController__Group__2__Impl rule__SafetyController__Group__3 )
            // InternalMyDsl.g:6893:2: rule__SafetyController__Group__2__Impl rule__SafetyController__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__SafetyController__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyController__Group__3();

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
    // $ANTLR end "rule__SafetyController__Group__2"


    // $ANTLR start "rule__SafetyController__Group__2__Impl"
    // InternalMyDsl.g:6900:1: rule__SafetyController__Group__2__Impl : ( 'k_velocity' ) ;
    public final void rule__SafetyController__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6904:1: ( ( 'k_velocity' ) )
            // InternalMyDsl.g:6905:1: ( 'k_velocity' )
            {
            // InternalMyDsl.g:6905:1: ( 'k_velocity' )
            // InternalMyDsl.g:6906:2: 'k_velocity'
            {
             before(grammarAccess.getSafetyControllerAccess().getK_velocityKeyword_2()); 
            match(input,82,FOLLOW_2); 
             after(grammarAccess.getSafetyControllerAccess().getK_velocityKeyword_2()); 

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
    // $ANTLR end "rule__SafetyController__Group__2__Impl"


    // $ANTLR start "rule__SafetyController__Group__3"
    // InternalMyDsl.g:6915:1: rule__SafetyController__Group__3 : rule__SafetyController__Group__3__Impl rule__SafetyController__Group__4 ;
    public final void rule__SafetyController__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6919:1: ( rule__SafetyController__Group__3__Impl rule__SafetyController__Group__4 )
            // InternalMyDsl.g:6920:2: rule__SafetyController__Group__3__Impl rule__SafetyController__Group__4
            {
            pushFollow(FOLLOW_68);
            rule__SafetyController__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyController__Group__4();

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
    // $ANTLR end "rule__SafetyController__Group__3"


    // $ANTLR start "rule__SafetyController__Group__3__Impl"
    // InternalMyDsl.g:6927:1: rule__SafetyController__Group__3__Impl : ( ( rule__SafetyController__K_velocityAssignment_3 ) ) ;
    public final void rule__SafetyController__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6931:1: ( ( ( rule__SafetyController__K_velocityAssignment_3 ) ) )
            // InternalMyDsl.g:6932:1: ( ( rule__SafetyController__K_velocityAssignment_3 ) )
            {
            // InternalMyDsl.g:6932:1: ( ( rule__SafetyController__K_velocityAssignment_3 ) )
            // InternalMyDsl.g:6933:2: ( rule__SafetyController__K_velocityAssignment_3 )
            {
             before(grammarAccess.getSafetyControllerAccess().getK_velocityAssignment_3()); 
            // InternalMyDsl.g:6934:2: ( rule__SafetyController__K_velocityAssignment_3 )
            // InternalMyDsl.g:6934:3: rule__SafetyController__K_velocityAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SafetyController__K_velocityAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSafetyControllerAccess().getK_velocityAssignment_3()); 

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
    // $ANTLR end "rule__SafetyController__Group__3__Impl"


    // $ANTLR start "rule__SafetyController__Group__4"
    // InternalMyDsl.g:6942:1: rule__SafetyController__Group__4 : rule__SafetyController__Group__4__Impl ;
    public final void rule__SafetyController__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6946:1: ( rule__SafetyController__Group__4__Impl )
            // InternalMyDsl.g:6947:2: rule__SafetyController__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SafetyController__Group__4__Impl();

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
    // $ANTLR end "rule__SafetyController__Group__4"


    // $ANTLR start "rule__SafetyController__Group__4__Impl"
    // InternalMyDsl.g:6953:1: rule__SafetyController__Group__4__Impl : ( ( rule__SafetyController__Alternatives_4 )* ) ;
    public final void rule__SafetyController__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6957:1: ( ( ( rule__SafetyController__Alternatives_4 )* ) )
            // InternalMyDsl.g:6958:1: ( ( rule__SafetyController__Alternatives_4 )* )
            {
            // InternalMyDsl.g:6958:1: ( ( rule__SafetyController__Alternatives_4 )* )
            // InternalMyDsl.g:6959:2: ( rule__SafetyController__Alternatives_4 )*
            {
             before(grammarAccess.getSafetyControllerAccess().getAlternatives_4()); 
            // InternalMyDsl.g:6960:2: ( rule__SafetyController__Alternatives_4 )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( ((LA58_0>=83 && LA58_0<=85)) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalMyDsl.g:6960:3: rule__SafetyController__Alternatives_4
            	    {
            	    pushFollow(FOLLOW_69);
            	    rule__SafetyController__Alternatives_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);

             after(grammarAccess.getSafetyControllerAccess().getAlternatives_4()); 

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
    // $ANTLR end "rule__SafetyController__Group__4__Impl"


    // $ANTLR start "rule__SafetyController__Group_4_0__0"
    // InternalMyDsl.g:6969:1: rule__SafetyController__Group_4_0__0 : rule__SafetyController__Group_4_0__0__Impl rule__SafetyController__Group_4_0__1 ;
    public final void rule__SafetyController__Group_4_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6973:1: ( rule__SafetyController__Group_4_0__0__Impl rule__SafetyController__Group_4_0__1 )
            // InternalMyDsl.g:6974:2: rule__SafetyController__Group_4_0__0__Impl rule__SafetyController__Group_4_0__1
            {
            pushFollow(FOLLOW_25);
            rule__SafetyController__Group_4_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyController__Group_4_0__1();

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
    // $ANTLR end "rule__SafetyController__Group_4_0__0"


    // $ANTLR start "rule__SafetyController__Group_4_0__0__Impl"
    // InternalMyDsl.g:6981:1: rule__SafetyController__Group_4_0__0__Impl : ( 'k_position' ) ;
    public final void rule__SafetyController__Group_4_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6985:1: ( ( 'k_position' ) )
            // InternalMyDsl.g:6986:1: ( 'k_position' )
            {
            // InternalMyDsl.g:6986:1: ( 'k_position' )
            // InternalMyDsl.g:6987:2: 'k_position'
            {
             before(grammarAccess.getSafetyControllerAccess().getK_positionKeyword_4_0_0()); 
            match(input,83,FOLLOW_2); 
             after(grammarAccess.getSafetyControllerAccess().getK_positionKeyword_4_0_0()); 

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
    // $ANTLR end "rule__SafetyController__Group_4_0__0__Impl"


    // $ANTLR start "rule__SafetyController__Group_4_0__1"
    // InternalMyDsl.g:6996:1: rule__SafetyController__Group_4_0__1 : rule__SafetyController__Group_4_0__1__Impl ;
    public final void rule__SafetyController__Group_4_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7000:1: ( rule__SafetyController__Group_4_0__1__Impl )
            // InternalMyDsl.g:7001:2: rule__SafetyController__Group_4_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SafetyController__Group_4_0__1__Impl();

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
    // $ANTLR end "rule__SafetyController__Group_4_0__1"


    // $ANTLR start "rule__SafetyController__Group_4_0__1__Impl"
    // InternalMyDsl.g:7007:1: rule__SafetyController__Group_4_0__1__Impl : ( ( rule__SafetyController__K_positionAssignment_4_0_1 ) ) ;
    public final void rule__SafetyController__Group_4_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7011:1: ( ( ( rule__SafetyController__K_positionAssignment_4_0_1 ) ) )
            // InternalMyDsl.g:7012:1: ( ( rule__SafetyController__K_positionAssignment_4_0_1 ) )
            {
            // InternalMyDsl.g:7012:1: ( ( rule__SafetyController__K_positionAssignment_4_0_1 ) )
            // InternalMyDsl.g:7013:2: ( rule__SafetyController__K_positionAssignment_4_0_1 )
            {
             before(grammarAccess.getSafetyControllerAccess().getK_positionAssignment_4_0_1()); 
            // InternalMyDsl.g:7014:2: ( rule__SafetyController__K_positionAssignment_4_0_1 )
            // InternalMyDsl.g:7014:3: rule__SafetyController__K_positionAssignment_4_0_1
            {
            pushFollow(FOLLOW_2);
            rule__SafetyController__K_positionAssignment_4_0_1();

            state._fsp--;


            }

             after(grammarAccess.getSafetyControllerAccess().getK_positionAssignment_4_0_1()); 

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
    // $ANTLR end "rule__SafetyController__Group_4_0__1__Impl"


    // $ANTLR start "rule__SafetyController__Group_4_1__0"
    // InternalMyDsl.g:7023:1: rule__SafetyController__Group_4_1__0 : rule__SafetyController__Group_4_1__0__Impl rule__SafetyController__Group_4_1__1 ;
    public final void rule__SafetyController__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7027:1: ( rule__SafetyController__Group_4_1__0__Impl rule__SafetyController__Group_4_1__1 )
            // InternalMyDsl.g:7028:2: rule__SafetyController__Group_4_1__0__Impl rule__SafetyController__Group_4_1__1
            {
            pushFollow(FOLLOW_25);
            rule__SafetyController__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyController__Group_4_1__1();

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
    // $ANTLR end "rule__SafetyController__Group_4_1__0"


    // $ANTLR start "rule__SafetyController__Group_4_1__0__Impl"
    // InternalMyDsl.g:7035:1: rule__SafetyController__Group_4_1__0__Impl : ( 'softLowerLimit' ) ;
    public final void rule__SafetyController__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7039:1: ( ( 'softLowerLimit' ) )
            // InternalMyDsl.g:7040:1: ( 'softLowerLimit' )
            {
            // InternalMyDsl.g:7040:1: ( 'softLowerLimit' )
            // InternalMyDsl.g:7041:2: 'softLowerLimit'
            {
             before(grammarAccess.getSafetyControllerAccess().getSoftLowerLimitKeyword_4_1_0()); 
            match(input,84,FOLLOW_2); 
             after(grammarAccess.getSafetyControllerAccess().getSoftLowerLimitKeyword_4_1_0()); 

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
    // $ANTLR end "rule__SafetyController__Group_4_1__0__Impl"


    // $ANTLR start "rule__SafetyController__Group_4_1__1"
    // InternalMyDsl.g:7050:1: rule__SafetyController__Group_4_1__1 : rule__SafetyController__Group_4_1__1__Impl ;
    public final void rule__SafetyController__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7054:1: ( rule__SafetyController__Group_4_1__1__Impl )
            // InternalMyDsl.g:7055:2: rule__SafetyController__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SafetyController__Group_4_1__1__Impl();

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
    // $ANTLR end "rule__SafetyController__Group_4_1__1"


    // $ANTLR start "rule__SafetyController__Group_4_1__1__Impl"
    // InternalMyDsl.g:7061:1: rule__SafetyController__Group_4_1__1__Impl : ( ( rule__SafetyController__SoftLowerLimitAssignment_4_1_1 ) ) ;
    public final void rule__SafetyController__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7065:1: ( ( ( rule__SafetyController__SoftLowerLimitAssignment_4_1_1 ) ) )
            // InternalMyDsl.g:7066:1: ( ( rule__SafetyController__SoftLowerLimitAssignment_4_1_1 ) )
            {
            // InternalMyDsl.g:7066:1: ( ( rule__SafetyController__SoftLowerLimitAssignment_4_1_1 ) )
            // InternalMyDsl.g:7067:2: ( rule__SafetyController__SoftLowerLimitAssignment_4_1_1 )
            {
             before(grammarAccess.getSafetyControllerAccess().getSoftLowerLimitAssignment_4_1_1()); 
            // InternalMyDsl.g:7068:2: ( rule__SafetyController__SoftLowerLimitAssignment_4_1_1 )
            // InternalMyDsl.g:7068:3: rule__SafetyController__SoftLowerLimitAssignment_4_1_1
            {
            pushFollow(FOLLOW_2);
            rule__SafetyController__SoftLowerLimitAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSafetyControllerAccess().getSoftLowerLimitAssignment_4_1_1()); 

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
    // $ANTLR end "rule__SafetyController__Group_4_1__1__Impl"


    // $ANTLR start "rule__SafetyController__Group_4_2__0"
    // InternalMyDsl.g:7077:1: rule__SafetyController__Group_4_2__0 : rule__SafetyController__Group_4_2__0__Impl rule__SafetyController__Group_4_2__1 ;
    public final void rule__SafetyController__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7081:1: ( rule__SafetyController__Group_4_2__0__Impl rule__SafetyController__Group_4_2__1 )
            // InternalMyDsl.g:7082:2: rule__SafetyController__Group_4_2__0__Impl rule__SafetyController__Group_4_2__1
            {
            pushFollow(FOLLOW_25);
            rule__SafetyController__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyController__Group_4_2__1();

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
    // $ANTLR end "rule__SafetyController__Group_4_2__0"


    // $ANTLR start "rule__SafetyController__Group_4_2__0__Impl"
    // InternalMyDsl.g:7089:1: rule__SafetyController__Group_4_2__0__Impl : ( 'softUpperLimit' ) ;
    public final void rule__SafetyController__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7093:1: ( ( 'softUpperLimit' ) )
            // InternalMyDsl.g:7094:1: ( 'softUpperLimit' )
            {
            // InternalMyDsl.g:7094:1: ( 'softUpperLimit' )
            // InternalMyDsl.g:7095:2: 'softUpperLimit'
            {
             before(grammarAccess.getSafetyControllerAccess().getSoftUpperLimitKeyword_4_2_0()); 
            match(input,85,FOLLOW_2); 
             after(grammarAccess.getSafetyControllerAccess().getSoftUpperLimitKeyword_4_2_0()); 

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
    // $ANTLR end "rule__SafetyController__Group_4_2__0__Impl"


    // $ANTLR start "rule__SafetyController__Group_4_2__1"
    // InternalMyDsl.g:7104:1: rule__SafetyController__Group_4_2__1 : rule__SafetyController__Group_4_2__1__Impl ;
    public final void rule__SafetyController__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7108:1: ( rule__SafetyController__Group_4_2__1__Impl )
            // InternalMyDsl.g:7109:2: rule__SafetyController__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SafetyController__Group_4_2__1__Impl();

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
    // $ANTLR end "rule__SafetyController__Group_4_2__1"


    // $ANTLR start "rule__SafetyController__Group_4_2__1__Impl"
    // InternalMyDsl.g:7115:1: rule__SafetyController__Group_4_2__1__Impl : ( ( rule__SafetyController__SoftUpperLimitAssignment_4_2_1 ) ) ;
    public final void rule__SafetyController__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7119:1: ( ( ( rule__SafetyController__SoftUpperLimitAssignment_4_2_1 ) ) )
            // InternalMyDsl.g:7120:1: ( ( rule__SafetyController__SoftUpperLimitAssignment_4_2_1 ) )
            {
            // InternalMyDsl.g:7120:1: ( ( rule__SafetyController__SoftUpperLimitAssignment_4_2_1 ) )
            // InternalMyDsl.g:7121:2: ( rule__SafetyController__SoftUpperLimitAssignment_4_2_1 )
            {
             before(grammarAccess.getSafetyControllerAccess().getSoftUpperLimitAssignment_4_2_1()); 
            // InternalMyDsl.g:7122:2: ( rule__SafetyController__SoftUpperLimitAssignment_4_2_1 )
            // InternalMyDsl.g:7122:3: rule__SafetyController__SoftUpperLimitAssignment_4_2_1
            {
            pushFollow(FOLLOW_2);
            rule__SafetyController__SoftUpperLimitAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSafetyControllerAccess().getSoftUpperLimitAssignment_4_2_1()); 

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
    // $ANTLR end "rule__SafetyController__Group_4_2__1__Impl"


    // $ANTLR start "rule__FLOAT__Group__0"
    // InternalMyDsl.g:7131:1: rule__FLOAT__Group__0 : rule__FLOAT__Group__0__Impl rule__FLOAT__Group__1 ;
    public final void rule__FLOAT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7135:1: ( rule__FLOAT__Group__0__Impl rule__FLOAT__Group__1 )
            // InternalMyDsl.g:7136:2: rule__FLOAT__Group__0__Impl rule__FLOAT__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__FLOAT__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FLOAT__Group__1();

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
    // $ANTLR end "rule__FLOAT__Group__0"


    // $ANTLR start "rule__FLOAT__Group__0__Impl"
    // InternalMyDsl.g:7143:1: rule__FLOAT__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__FLOAT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7147:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:7148:1: ( RULE_INT )
            {
            // InternalMyDsl.g:7148:1: ( RULE_INT )
            // InternalMyDsl.g:7149:2: RULE_INT
            {
             before(grammarAccess.getFLOATAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFLOATAccess().getINTTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__FLOAT__Group__0__Impl"


    // $ANTLR start "rule__FLOAT__Group__1"
    // InternalMyDsl.g:7158:1: rule__FLOAT__Group__1 : rule__FLOAT__Group__1__Impl rule__FLOAT__Group__2 ;
    public final void rule__FLOAT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7162:1: ( rule__FLOAT__Group__1__Impl rule__FLOAT__Group__2 )
            // InternalMyDsl.g:7163:2: rule__FLOAT__Group__1__Impl rule__FLOAT__Group__2
            {
            pushFollow(FOLLOW_48);
            rule__FLOAT__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FLOAT__Group__2();

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
    // $ANTLR end "rule__FLOAT__Group__1"


    // $ANTLR start "rule__FLOAT__Group__1__Impl"
    // InternalMyDsl.g:7170:1: rule__FLOAT__Group__1__Impl : ( '.' ) ;
    public final void rule__FLOAT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7174:1: ( ( '.' ) )
            // InternalMyDsl.g:7175:1: ( '.' )
            {
            // InternalMyDsl.g:7175:1: ( '.' )
            // InternalMyDsl.g:7176:2: '.'
            {
             before(grammarAccess.getFLOATAccess().getFullStopKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getFLOATAccess().getFullStopKeyword_1()); 

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
    // $ANTLR end "rule__FLOAT__Group__1__Impl"


    // $ANTLR start "rule__FLOAT__Group__2"
    // InternalMyDsl.g:7185:1: rule__FLOAT__Group__2 : rule__FLOAT__Group__2__Impl ;
    public final void rule__FLOAT__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7189:1: ( rule__FLOAT__Group__2__Impl )
            // InternalMyDsl.g:7190:2: rule__FLOAT__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FLOAT__Group__2__Impl();

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
    // $ANTLR end "rule__FLOAT__Group__2"


    // $ANTLR start "rule__FLOAT__Group__2__Impl"
    // InternalMyDsl.g:7196:1: rule__FLOAT__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__FLOAT__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7200:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:7201:1: ( RULE_INT )
            {
            // InternalMyDsl.g:7201:1: ( RULE_INT )
            // InternalMyDsl.g:7202:2: RULE_INT
            {
             before(grammarAccess.getFLOATAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFLOATAccess().getINTTerminalRuleCall_2()); 

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
    // $ANTLR end "rule__FLOAT__Group__2__Impl"


    // $ANTLR start "rule__SCIENTIFIC__Group__0"
    // InternalMyDsl.g:7212:1: rule__SCIENTIFIC__Group__0 : rule__SCIENTIFIC__Group__0__Impl rule__SCIENTIFIC__Group__1 ;
    public final void rule__SCIENTIFIC__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7216:1: ( rule__SCIENTIFIC__Group__0__Impl rule__SCIENTIFIC__Group__1 )
            // InternalMyDsl.g:7217:2: rule__SCIENTIFIC__Group__0__Impl rule__SCIENTIFIC__Group__1
            {
            pushFollow(FOLLOW_70);
            rule__SCIENTIFIC__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SCIENTIFIC__Group__1();

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
    // $ANTLR end "rule__SCIENTIFIC__Group__0"


    // $ANTLR start "rule__SCIENTIFIC__Group__0__Impl"
    // InternalMyDsl.g:7224:1: rule__SCIENTIFIC__Group__0__Impl : ( ruleFLOAT ) ;
    public final void rule__SCIENTIFIC__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7228:1: ( ( ruleFLOAT ) )
            // InternalMyDsl.g:7229:1: ( ruleFLOAT )
            {
            // InternalMyDsl.g:7229:1: ( ruleFLOAT )
            // InternalMyDsl.g:7230:2: ruleFLOAT
            {
             before(grammarAccess.getSCIENTIFICAccess().getFLOATParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getSCIENTIFICAccess().getFLOATParserRuleCall_0()); 

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
    // $ANTLR end "rule__SCIENTIFIC__Group__0__Impl"


    // $ANTLR start "rule__SCIENTIFIC__Group__1"
    // InternalMyDsl.g:7239:1: rule__SCIENTIFIC__Group__1 : rule__SCIENTIFIC__Group__1__Impl rule__SCIENTIFIC__Group__2 ;
    public final void rule__SCIENTIFIC__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7243:1: ( rule__SCIENTIFIC__Group__1__Impl rule__SCIENTIFIC__Group__2 )
            // InternalMyDsl.g:7244:2: rule__SCIENTIFIC__Group__1__Impl rule__SCIENTIFIC__Group__2
            {
            pushFollow(FOLLOW_71);
            rule__SCIENTIFIC__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SCIENTIFIC__Group__2();

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
    // $ANTLR end "rule__SCIENTIFIC__Group__1"


    // $ANTLR start "rule__SCIENTIFIC__Group__1__Impl"
    // InternalMyDsl.g:7251:1: rule__SCIENTIFIC__Group__1__Impl : ( 'e' ) ;
    public final void rule__SCIENTIFIC__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7255:1: ( ( 'e' ) )
            // InternalMyDsl.g:7256:1: ( 'e' )
            {
            // InternalMyDsl.g:7256:1: ( 'e' )
            // InternalMyDsl.g:7257:2: 'e'
            {
             before(grammarAccess.getSCIENTIFICAccess().getEKeyword_1()); 
            match(input,86,FOLLOW_2); 
             after(grammarAccess.getSCIENTIFICAccess().getEKeyword_1()); 

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
    // $ANTLR end "rule__SCIENTIFIC__Group__1__Impl"


    // $ANTLR start "rule__SCIENTIFIC__Group__2"
    // InternalMyDsl.g:7266:1: rule__SCIENTIFIC__Group__2 : rule__SCIENTIFIC__Group__2__Impl rule__SCIENTIFIC__Group__3 ;
    public final void rule__SCIENTIFIC__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7270:1: ( rule__SCIENTIFIC__Group__2__Impl rule__SCIENTIFIC__Group__3 )
            // InternalMyDsl.g:7271:2: rule__SCIENTIFIC__Group__2__Impl rule__SCIENTIFIC__Group__3
            {
            pushFollow(FOLLOW_71);
            rule__SCIENTIFIC__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SCIENTIFIC__Group__3();

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
    // $ANTLR end "rule__SCIENTIFIC__Group__2"


    // $ANTLR start "rule__SCIENTIFIC__Group__2__Impl"
    // InternalMyDsl.g:7278:1: rule__SCIENTIFIC__Group__2__Impl : ( ( rule__SCIENTIFIC__Alternatives_2 )? ) ;
    public final void rule__SCIENTIFIC__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7282:1: ( ( ( rule__SCIENTIFIC__Alternatives_2 )? ) )
            // InternalMyDsl.g:7283:1: ( ( rule__SCIENTIFIC__Alternatives_2 )? )
            {
            // InternalMyDsl.g:7283:1: ( ( rule__SCIENTIFIC__Alternatives_2 )? )
            // InternalMyDsl.g:7284:2: ( rule__SCIENTIFIC__Alternatives_2 )?
            {
             before(grammarAccess.getSCIENTIFICAccess().getAlternatives_2()); 
            // InternalMyDsl.g:7285:2: ( rule__SCIENTIFIC__Alternatives_2 )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( ((LA59_0>=11 && LA59_0<=12)) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalMyDsl.g:7285:3: rule__SCIENTIFIC__Alternatives_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__SCIENTIFIC__Alternatives_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSCIENTIFICAccess().getAlternatives_2()); 

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
    // $ANTLR end "rule__SCIENTIFIC__Group__2__Impl"


    // $ANTLR start "rule__SCIENTIFIC__Group__3"
    // InternalMyDsl.g:7293:1: rule__SCIENTIFIC__Group__3 : rule__SCIENTIFIC__Group__3__Impl ;
    public final void rule__SCIENTIFIC__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7297:1: ( rule__SCIENTIFIC__Group__3__Impl )
            // InternalMyDsl.g:7298:2: rule__SCIENTIFIC__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SCIENTIFIC__Group__3__Impl();

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
    // $ANTLR end "rule__SCIENTIFIC__Group__3"


    // $ANTLR start "rule__SCIENTIFIC__Group__3__Impl"
    // InternalMyDsl.g:7304:1: rule__SCIENTIFIC__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__SCIENTIFIC__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7308:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:7309:1: ( RULE_INT )
            {
            // InternalMyDsl.g:7309:1: ( RULE_INT )
            // InternalMyDsl.g:7310:2: RULE_INT
            {
             before(grammarAccess.getSCIENTIFICAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSCIENTIFICAccess().getINTTerminalRuleCall_3()); 

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
    // $ANTLR end "rule__SCIENTIFIC__Group__3__Impl"


    // $ANTLR start "rule__SIGNED_NUMERIC__Group__0"
    // InternalMyDsl.g:7320:1: rule__SIGNED_NUMERIC__Group__0 : rule__SIGNED_NUMERIC__Group__0__Impl rule__SIGNED_NUMERIC__Group__1 ;
    public final void rule__SIGNED_NUMERIC__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7324:1: ( rule__SIGNED_NUMERIC__Group__0__Impl rule__SIGNED_NUMERIC__Group__1 )
            // InternalMyDsl.g:7325:2: rule__SIGNED_NUMERIC__Group__0__Impl rule__SIGNED_NUMERIC__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__SIGNED_NUMERIC__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SIGNED_NUMERIC__Group__1();

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
    // $ANTLR end "rule__SIGNED_NUMERIC__Group__0"


    // $ANTLR start "rule__SIGNED_NUMERIC__Group__0__Impl"
    // InternalMyDsl.g:7332:1: rule__SIGNED_NUMERIC__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__SIGNED_NUMERIC__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7336:1: ( ( ( '-' )? ) )
            // InternalMyDsl.g:7337:1: ( ( '-' )? )
            {
            // InternalMyDsl.g:7337:1: ( ( '-' )? )
            // InternalMyDsl.g:7338:2: ( '-' )?
            {
             before(grammarAccess.getSIGNED_NUMERICAccess().getHyphenMinusKeyword_0()); 
            // InternalMyDsl.g:7339:2: ( '-' )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==12) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalMyDsl.g:7339:3: '-'
                    {
                    match(input,12,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getSIGNED_NUMERICAccess().getHyphenMinusKeyword_0()); 

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
    // $ANTLR end "rule__SIGNED_NUMERIC__Group__0__Impl"


    // $ANTLR start "rule__SIGNED_NUMERIC__Group__1"
    // InternalMyDsl.g:7347:1: rule__SIGNED_NUMERIC__Group__1 : rule__SIGNED_NUMERIC__Group__1__Impl ;
    public final void rule__SIGNED_NUMERIC__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7351:1: ( rule__SIGNED_NUMERIC__Group__1__Impl )
            // InternalMyDsl.g:7352:2: rule__SIGNED_NUMERIC__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SIGNED_NUMERIC__Group__1__Impl();

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
    // $ANTLR end "rule__SIGNED_NUMERIC__Group__1"


    // $ANTLR start "rule__SIGNED_NUMERIC__Group__1__Impl"
    // InternalMyDsl.g:7358:1: rule__SIGNED_NUMERIC__Group__1__Impl : ( ( rule__SIGNED_NUMERIC__Alternatives_1 ) ) ;
    public final void rule__SIGNED_NUMERIC__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7362:1: ( ( ( rule__SIGNED_NUMERIC__Alternatives_1 ) ) )
            // InternalMyDsl.g:7363:1: ( ( rule__SIGNED_NUMERIC__Alternatives_1 ) )
            {
            // InternalMyDsl.g:7363:1: ( ( rule__SIGNED_NUMERIC__Alternatives_1 ) )
            // InternalMyDsl.g:7364:2: ( rule__SIGNED_NUMERIC__Alternatives_1 )
            {
             before(grammarAccess.getSIGNED_NUMERICAccess().getAlternatives_1()); 
            // InternalMyDsl.g:7365:2: ( rule__SIGNED_NUMERIC__Alternatives_1 )
            // InternalMyDsl.g:7365:3: rule__SIGNED_NUMERIC__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__SIGNED_NUMERIC__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getSIGNED_NUMERICAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__SIGNED_NUMERIC__Group__1__Impl"


    // $ANTLR start "rule__Robot__NameAssignment_1"
    // InternalMyDsl.g:7374:1: rule__Robot__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Robot__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7378:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:7379:2: ( RULE_ID )
            {
            // InternalMyDsl.g:7379:2: ( RULE_ID )
            // InternalMyDsl.g:7380:3: RULE_ID
            {
             before(grammarAccess.getRobotAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRobotAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Robot__NameAssignment_1"


    // $ANTLR start "rule__Robot__TopologiesAssignment_2_0_1"
    // InternalMyDsl.g:7389:1: rule__Robot__TopologiesAssignment_2_0_1 : ( ruleTopology ) ;
    public final void rule__Robot__TopologiesAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7393:1: ( ( ruleTopology ) )
            // InternalMyDsl.g:7394:2: ( ruleTopology )
            {
            // InternalMyDsl.g:7394:2: ( ruleTopology )
            // InternalMyDsl.g:7395:3: ruleTopology
            {
             before(grammarAccess.getRobotAccess().getTopologiesTopologyParserRuleCall_2_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTopology();

            state._fsp--;

             after(grammarAccess.getRobotAccess().getTopologiesTopologyParserRuleCall_2_0_1_0()); 

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
    // $ANTLR end "rule__Robot__TopologiesAssignment_2_0_1"


    // $ANTLR start "rule__Robot__LinksAssignment_2_1"
    // InternalMyDsl.g:7404:1: rule__Robot__LinksAssignment_2_1 : ( ruleLink ) ;
    public final void rule__Robot__LinksAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7408:1: ( ( ruleLink ) )
            // InternalMyDsl.g:7409:2: ( ruleLink )
            {
            // InternalMyDsl.g:7409:2: ( ruleLink )
            // InternalMyDsl.g:7410:3: ruleLink
            {
             before(grammarAccess.getRobotAccess().getLinksLinkParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLink();

            state._fsp--;

             after(grammarAccess.getRobotAccess().getLinksLinkParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Robot__LinksAssignment_2_1"


    // $ANTLR start "rule__Robot__JointAssignment_2_2"
    // InternalMyDsl.g:7419:1: rule__Robot__JointAssignment_2_2 : ( ruleJoint ) ;
    public final void rule__Robot__JointAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7423:1: ( ( ruleJoint ) )
            // InternalMyDsl.g:7424:2: ( ruleJoint )
            {
            // InternalMyDsl.g:7424:2: ( ruleJoint )
            // InternalMyDsl.g:7425:3: ruleJoint
            {
             before(grammarAccess.getRobotAccess().getJointJointParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleJoint();

            state._fsp--;

             after(grammarAccess.getRobotAccess().getJointJointParserRuleCall_2_2_0()); 

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
    // $ANTLR end "rule__Robot__JointAssignment_2_2"


    // $ANTLR start "rule__Robot__AddtoAssignment_2_3"
    // InternalMyDsl.g:7434:1: rule__Robot__AddtoAssignment_2_3 : ( ruleAddTo ) ;
    public final void rule__Robot__AddtoAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7438:1: ( ( ruleAddTo ) )
            // InternalMyDsl.g:7439:2: ( ruleAddTo )
            {
            // InternalMyDsl.g:7439:2: ( ruleAddTo )
            // InternalMyDsl.g:7440:3: ruleAddTo
            {
             before(grammarAccess.getRobotAccess().getAddtoAddToParserRuleCall_2_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAddTo();

            state._fsp--;

             after(grammarAccess.getRobotAccess().getAddtoAddToParserRuleCall_2_3_0()); 

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
    // $ANTLR end "rule__Robot__AddtoAssignment_2_3"


    // $ANTLR start "rule__Topology__ParentAssignment_0"
    // InternalMyDsl.g:7449:1: rule__Topology__ParentAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Topology__ParentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7453:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:7454:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:7454:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:7455:3: ( RULE_ID )
            {
             before(grammarAccess.getTopologyAccess().getParentLinkCrossReference_0_0()); 
            // InternalMyDsl.g:7456:3: ( RULE_ID )
            // InternalMyDsl.g:7457:4: RULE_ID
            {
             before(grammarAccess.getTopologyAccess().getParentLinkIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTopologyAccess().getParentLinkIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getTopologyAccess().getParentLinkCrossReference_0_0()); 

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
    // $ANTLR end "rule__Topology__ParentAssignment_0"


    // $ANTLR start "rule__Topology__JointAssignment_1_0"
    // InternalMyDsl.g:7468:1: rule__Topology__JointAssignment_1_0 : ( ruleJointRef ) ;
    public final void rule__Topology__JointAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7472:1: ( ( ruleJointRef ) )
            // InternalMyDsl.g:7473:2: ( ruleJointRef )
            {
            // InternalMyDsl.g:7473:2: ( ruleJointRef )
            // InternalMyDsl.g:7474:3: ruleJointRef
            {
             before(grammarAccess.getTopologyAccess().getJointJointRefParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleJointRef();

            state._fsp--;

             after(grammarAccess.getTopologyAccess().getJointJointRefParserRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__Topology__JointAssignment_1_0"


    // $ANTLR start "rule__Topology__ChildAssignment_1_1"
    // InternalMyDsl.g:7483:1: rule__Topology__ChildAssignment_1_1 : ( ruleTopology ) ;
    public final void rule__Topology__ChildAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7487:1: ( ( ruleTopology ) )
            // InternalMyDsl.g:7488:2: ( ruleTopology )
            {
            // InternalMyDsl.g:7488:2: ( ruleTopology )
            // InternalMyDsl.g:7489:3: ruleTopology
            {
             before(grammarAccess.getTopologyAccess().getChildTopologyParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTopology();

            state._fsp--;

             after(grammarAccess.getTopologyAccess().getChildTopologyParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Topology__ChildAssignment_1_1"


    // $ANTLR start "rule__JointRef__FixAssignment_0"
    // InternalMyDsl.g:7498:1: rule__JointRef__FixAssignment_0 : ( ( '->' ) ) ;
    public final void rule__JointRef__FixAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7502:1: ( ( ( '->' ) ) )
            // InternalMyDsl.g:7503:2: ( ( '->' ) )
            {
            // InternalMyDsl.g:7503:2: ( ( '->' ) )
            // InternalMyDsl.g:7504:3: ( '->' )
            {
             before(grammarAccess.getJointRefAccess().getFixHyphenMinusGreaterThanSignKeyword_0_0()); 
            // InternalMyDsl.g:7505:3: ( '->' )
            // InternalMyDsl.g:7506:4: '->'
            {
             before(grammarAccess.getJointRefAccess().getFixHyphenMinusGreaterThanSignKeyword_0_0()); 
            match(input,87,FOLLOW_2); 
             after(grammarAccess.getJointRefAccess().getFixHyphenMinusGreaterThanSignKeyword_0_0()); 

            }

             after(grammarAccess.getJointRefAccess().getFixHyphenMinusGreaterThanSignKeyword_0_0()); 

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
    // $ANTLR end "rule__JointRef__FixAssignment_0"


    // $ANTLR start "rule__JointRef__RevAssignment_1"
    // InternalMyDsl.g:7517:1: rule__JointRef__RevAssignment_1 : ( ( 'r->' ) ) ;
    public final void rule__JointRef__RevAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7521:1: ( ( ( 'r->' ) ) )
            // InternalMyDsl.g:7522:2: ( ( 'r->' ) )
            {
            // InternalMyDsl.g:7522:2: ( ( 'r->' ) )
            // InternalMyDsl.g:7523:3: ( 'r->' )
            {
             before(grammarAccess.getJointRefAccess().getRevRKeyword_1_0()); 
            // InternalMyDsl.g:7524:3: ( 'r->' )
            // InternalMyDsl.g:7525:4: 'r->'
            {
             before(grammarAccess.getJointRefAccess().getRevRKeyword_1_0()); 
            match(input,88,FOLLOW_2); 
             after(grammarAccess.getJointRefAccess().getRevRKeyword_1_0()); 

            }

             after(grammarAccess.getJointRefAccess().getRevRKeyword_1_0()); 

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
    // $ANTLR end "rule__JointRef__RevAssignment_1"


    // $ANTLR start "rule__JointRef__PrisAssignment_2"
    // InternalMyDsl.g:7536:1: rule__JointRef__PrisAssignment_2 : ( ( 'p->' ) ) ;
    public final void rule__JointRef__PrisAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7540:1: ( ( ( 'p->' ) ) )
            // InternalMyDsl.g:7541:2: ( ( 'p->' ) )
            {
            // InternalMyDsl.g:7541:2: ( ( 'p->' ) )
            // InternalMyDsl.g:7542:3: ( 'p->' )
            {
             before(grammarAccess.getJointRefAccess().getPrisPKeyword_2_0()); 
            // InternalMyDsl.g:7543:3: ( 'p->' )
            // InternalMyDsl.g:7544:4: 'p->'
            {
             before(grammarAccess.getJointRefAccess().getPrisPKeyword_2_0()); 
            match(input,89,FOLLOW_2); 
             after(grammarAccess.getJointRefAccess().getPrisPKeyword_2_0()); 

            }

             after(grammarAccess.getJointRefAccess().getPrisPKeyword_2_0()); 

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
    // $ANTLR end "rule__JointRef__PrisAssignment_2"


    // $ANTLR start "rule__JointRef__ContAssignment_3"
    // InternalMyDsl.g:7555:1: rule__JointRef__ContAssignment_3 : ( ( 'c->' ) ) ;
    public final void rule__JointRef__ContAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7559:1: ( ( ( 'c->' ) ) )
            // InternalMyDsl.g:7560:2: ( ( 'c->' ) )
            {
            // InternalMyDsl.g:7560:2: ( ( 'c->' ) )
            // InternalMyDsl.g:7561:3: ( 'c->' )
            {
             before(grammarAccess.getJointRefAccess().getContCKeyword_3_0()); 
            // InternalMyDsl.g:7562:3: ( 'c->' )
            // InternalMyDsl.g:7563:4: 'c->'
            {
             before(grammarAccess.getJointRefAccess().getContCKeyword_3_0()); 
            match(input,90,FOLLOW_2); 
             after(grammarAccess.getJointRefAccess().getContCKeyword_3_0()); 

            }

             after(grammarAccess.getJointRefAccess().getContCKeyword_3_0()); 

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
    // $ANTLR end "rule__JointRef__ContAssignment_3"


    // $ANTLR start "rule__Link__NameAssignment_2"
    // InternalMyDsl.g:7574:1: rule__Link__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Link__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7578:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:7579:2: ( RULE_ID )
            {
            // InternalMyDsl.g:7579:2: ( RULE_ID )
            // InternalMyDsl.g:7580:3: RULE_ID
            {
             before(grammarAccess.getLinkAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Link__NameAssignment_2"


    // $ANTLR start "rule__Link__InertialAssignment_3_0_1_0"
    // InternalMyDsl.g:7589:1: rule__Link__InertialAssignment_3_0_1_0 : ( ruleInertial ) ;
    public final void rule__Link__InertialAssignment_3_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7593:1: ( ( ruleInertial ) )
            // InternalMyDsl.g:7594:2: ( ruleInertial )
            {
            // InternalMyDsl.g:7594:2: ( ruleInertial )
            // InternalMyDsl.g:7595:3: ruleInertial
            {
             before(grammarAccess.getLinkAccess().getInertialInertialParserRuleCall_3_0_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleInertial();

            state._fsp--;

             after(grammarAccess.getLinkAccess().getInertialInertialParserRuleCall_3_0_1_0_0()); 

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
    // $ANTLR end "rule__Link__InertialAssignment_3_0_1_0"


    // $ANTLR start "rule__Link__VisualAssignment_3_0_1_1"
    // InternalMyDsl.g:7604:1: rule__Link__VisualAssignment_3_0_1_1 : ( ruleVisual ) ;
    public final void rule__Link__VisualAssignment_3_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7608:1: ( ( ruleVisual ) )
            // InternalMyDsl.g:7609:2: ( ruleVisual )
            {
            // InternalMyDsl.g:7609:2: ( ruleVisual )
            // InternalMyDsl.g:7610:3: ruleVisual
            {
             before(grammarAccess.getLinkAccess().getVisualVisualParserRuleCall_3_0_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVisual();

            state._fsp--;

             after(grammarAccess.getLinkAccess().getVisualVisualParserRuleCall_3_0_1_1_0()); 

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
    // $ANTLR end "rule__Link__VisualAssignment_3_0_1_1"


    // $ANTLR start "rule__Link__CollisionAssignment_3_0_1_2"
    // InternalMyDsl.g:7619:1: rule__Link__CollisionAssignment_3_0_1_2 : ( ruleCollision ) ;
    public final void rule__Link__CollisionAssignment_3_0_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7623:1: ( ( ruleCollision ) )
            // InternalMyDsl.g:7624:2: ( ruleCollision )
            {
            // InternalMyDsl.g:7624:2: ( ruleCollision )
            // InternalMyDsl.g:7625:3: ruleCollision
            {
             before(grammarAccess.getLinkAccess().getCollisionCollisionParserRuleCall_3_0_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCollision();

            state._fsp--;

             after(grammarAccess.getLinkAccess().getCollisionCollisionParserRuleCall_3_0_1_2_0()); 

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
    // $ANTLR end "rule__Link__CollisionAssignment_3_0_1_2"


    // $ANTLR start "rule__Link__IsReuseOfAssignment_3_1_1"
    // InternalMyDsl.g:7634:1: rule__Link__IsReuseOfAssignment_3_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Link__IsReuseOfAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7638:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:7639:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:7639:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:7640:3: ( RULE_ID )
            {
             before(grammarAccess.getLinkAccess().getIsReuseOfLinkCrossReference_3_1_1_0()); 
            // InternalMyDsl.g:7641:3: ( RULE_ID )
            // InternalMyDsl.g:7642:4: RULE_ID
            {
             before(grammarAccess.getLinkAccess().getIsReuseOfLinkIDTerminalRuleCall_3_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getIsReuseOfLinkIDTerminalRuleCall_3_1_1_0_1()); 

            }

             after(grammarAccess.getLinkAccess().getIsReuseOfLinkCrossReference_3_1_1_0()); 

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
    // $ANTLR end "rule__Link__IsReuseOfAssignment_3_1_1"


    // $ANTLR start "rule__Link__ReuseAssignment_3_1_2"
    // InternalMyDsl.g:7653:1: rule__Link__ReuseAssignment_3_1_2 : ( ruleReuse ) ;
    public final void rule__Link__ReuseAssignment_3_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7657:1: ( ( ruleReuse ) )
            // InternalMyDsl.g:7658:2: ( ruleReuse )
            {
            // InternalMyDsl.g:7658:2: ( ruleReuse )
            // InternalMyDsl.g:7659:3: ruleReuse
            {
             before(grammarAccess.getLinkAccess().getReuseReuseParserRuleCall_3_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleReuse();

            state._fsp--;

             after(grammarAccess.getLinkAccess().getReuseReuseParserRuleCall_3_1_2_0()); 

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
    // $ANTLR end "rule__Link__ReuseAssignment_3_1_2"


    // $ANTLR start "rule__AddTo__LinkAssignment_0_0_2"
    // InternalMyDsl.g:7668:1: rule__AddTo__LinkAssignment_0_0_2 : ( ( RULE_ID ) ) ;
    public final void rule__AddTo__LinkAssignment_0_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7672:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:7673:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:7673:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:7674:3: ( RULE_ID )
            {
             before(grammarAccess.getAddToAccess().getLinkLinkCrossReference_0_0_2_0()); 
            // InternalMyDsl.g:7675:3: ( RULE_ID )
            // InternalMyDsl.g:7676:4: RULE_ID
            {
             before(grammarAccess.getAddToAccess().getLinkLinkIDTerminalRuleCall_0_0_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAddToAccess().getLinkLinkIDTerminalRuleCall_0_0_2_0_1()); 

            }

             after(grammarAccess.getAddToAccess().getLinkLinkCrossReference_0_0_2_0()); 

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
    // $ANTLR end "rule__AddTo__LinkAssignment_0_0_2"


    // $ANTLR start "rule__AddTo__InertialAssignment_0_1_0"
    // InternalMyDsl.g:7687:1: rule__AddTo__InertialAssignment_0_1_0 : ( ruleInertial ) ;
    public final void rule__AddTo__InertialAssignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7691:1: ( ( ruleInertial ) )
            // InternalMyDsl.g:7692:2: ( ruleInertial )
            {
            // InternalMyDsl.g:7692:2: ( ruleInertial )
            // InternalMyDsl.g:7693:3: ruleInertial
            {
             before(grammarAccess.getAddToAccess().getInertialInertialParserRuleCall_0_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleInertial();

            state._fsp--;

             after(grammarAccess.getAddToAccess().getInertialInertialParserRuleCall_0_1_0_0()); 

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
    // $ANTLR end "rule__AddTo__InertialAssignment_0_1_0"


    // $ANTLR start "rule__AddTo__VisualAssignment_0_1_1"
    // InternalMyDsl.g:7702:1: rule__AddTo__VisualAssignment_0_1_1 : ( ruleVisual ) ;
    public final void rule__AddTo__VisualAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7706:1: ( ( ruleVisual ) )
            // InternalMyDsl.g:7707:2: ( ruleVisual )
            {
            // InternalMyDsl.g:7707:2: ( ruleVisual )
            // InternalMyDsl.g:7708:3: ruleVisual
            {
             before(grammarAccess.getAddToAccess().getVisualVisualParserRuleCall_0_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVisual();

            state._fsp--;

             after(grammarAccess.getAddToAccess().getVisualVisualParserRuleCall_0_1_1_0()); 

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
    // $ANTLR end "rule__AddTo__VisualAssignment_0_1_1"


    // $ANTLR start "rule__AddTo__CollisionAssignment_0_1_2"
    // InternalMyDsl.g:7717:1: rule__AddTo__CollisionAssignment_0_1_2 : ( ruleCollision ) ;
    public final void rule__AddTo__CollisionAssignment_0_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7721:1: ( ( ruleCollision ) )
            // InternalMyDsl.g:7722:2: ( ruleCollision )
            {
            // InternalMyDsl.g:7722:2: ( ruleCollision )
            // InternalMyDsl.g:7723:3: ruleCollision
            {
             before(grammarAccess.getAddToAccess().getCollisionCollisionParserRuleCall_0_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCollision();

            state._fsp--;

             after(grammarAccess.getAddToAccess().getCollisionCollisionParserRuleCall_0_1_2_0()); 

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
    // $ANTLR end "rule__AddTo__CollisionAssignment_0_1_2"


    // $ANTLR start "rule__AddTo__JointAssignment_1_0_2"
    // InternalMyDsl.g:7732:1: rule__AddTo__JointAssignment_1_0_2 : ( ( RULE_ID ) ) ;
    public final void rule__AddTo__JointAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7736:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:7737:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:7737:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:7738:3: ( RULE_ID )
            {
             before(grammarAccess.getAddToAccess().getJointJointCrossReference_1_0_2_0()); 
            // InternalMyDsl.g:7739:3: ( RULE_ID )
            // InternalMyDsl.g:7740:4: RULE_ID
            {
             before(grammarAccess.getAddToAccess().getJointJointIDTerminalRuleCall_1_0_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAddToAccess().getJointJointIDTerminalRuleCall_1_0_2_0_1()); 

            }

             after(grammarAccess.getAddToAccess().getJointJointCrossReference_1_0_2_0()); 

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
    // $ANTLR end "rule__AddTo__JointAssignment_1_0_2"


    // $ANTLR start "rule__AddTo__OriginAssignment_1_1"
    // InternalMyDsl.g:7751:1: rule__AddTo__OriginAssignment_1_1 : ( ruleOrigin ) ;
    public final void rule__AddTo__OriginAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7755:1: ( ( ruleOrigin ) )
            // InternalMyDsl.g:7756:2: ( ruleOrigin )
            {
            // InternalMyDsl.g:7756:2: ( ruleOrigin )
            // InternalMyDsl.g:7757:3: ruleOrigin
            {
             before(grammarAccess.getAddToAccess().getOriginOriginParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOrigin();

            state._fsp--;

             after(grammarAccess.getAddToAccess().getOriginOriginParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__AddTo__OriginAssignment_1_1"


    // $ANTLR start "rule__Reuse__AddAssignment_0_2"
    // InternalMyDsl.g:7766:1: rule__Reuse__AddAssignment_0_2 : ( ruleReUseAbleReduced ) ;
    public final void rule__Reuse__AddAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7770:1: ( ( ruleReUseAbleReduced ) )
            // InternalMyDsl.g:7771:2: ( ruleReUseAbleReduced )
            {
            // InternalMyDsl.g:7771:2: ( ruleReUseAbleReduced )
            // InternalMyDsl.g:7772:3: ruleReUseAbleReduced
            {
             before(grammarAccess.getReuseAccess().getAddReUseAbleReducedParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleReUseAbleReduced();

            state._fsp--;

             after(grammarAccess.getReuseAccess().getAddReUseAbleReducedParserRuleCall_0_2_0()); 

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
    // $ANTLR end "rule__Reuse__AddAssignment_0_2"


    // $ANTLR start "rule__Reuse__EditAssignment_1_1"
    // InternalMyDsl.g:7781:1: rule__Reuse__EditAssignment_1_1 : ( ruleAssignNewValue ) ;
    public final void rule__Reuse__EditAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7785:1: ( ( ruleAssignNewValue ) )
            // InternalMyDsl.g:7786:2: ( ruleAssignNewValue )
            {
            // InternalMyDsl.g:7786:2: ( ruleAssignNewValue )
            // InternalMyDsl.g:7787:3: ruleAssignNewValue
            {
             before(grammarAccess.getReuseAccess().getEditAssignNewValueParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAssignNewValue();

            state._fsp--;

             after(grammarAccess.getReuseAccess().getEditAssignNewValueParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Reuse__EditAssignment_1_1"


    // $ANTLR start "rule__AssignNewValue__GetRefAssignment_1"
    // InternalMyDsl.g:7796:1: rule__AssignNewValue__GetRefAssignment_1 : ( ruleDotExpression ) ;
    public final void rule__AssignNewValue__GetRefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7800:1: ( ( ruleDotExpression ) )
            // InternalMyDsl.g:7801:2: ( ruleDotExpression )
            {
            // InternalMyDsl.g:7801:2: ( ruleDotExpression )
            // InternalMyDsl.g:7802:3: ruleDotExpression
            {
             before(grammarAccess.getAssignNewValueAccess().getGetRefDotExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDotExpression();

            state._fsp--;

             after(grammarAccess.getAssignNewValueAccess().getGetRefDotExpressionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__AssignNewValue__GetRefAssignment_1"


    // $ANTLR start "rule__AssignNewValue__NewReuseableAssignment_3"
    // InternalMyDsl.g:7811:1: rule__AssignNewValue__NewReuseableAssignment_3 : ( ruleReUseAble ) ;
    public final void rule__AssignNewValue__NewReuseableAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7815:1: ( ( ruleReUseAble ) )
            // InternalMyDsl.g:7816:2: ( ruleReUseAble )
            {
            // InternalMyDsl.g:7816:2: ( ruleReUseAble )
            // InternalMyDsl.g:7817:3: ruleReUseAble
            {
             before(grammarAccess.getAssignNewValueAccess().getNewReuseableReUseAbleParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleReUseAble();

            state._fsp--;

             after(grammarAccess.getAssignNewValueAccess().getNewReuseableReUseAbleParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__AssignNewValue__NewReuseableAssignment_3"


    // $ANTLR start "rule__DotExpression__TailAssignment_1_2"
    // InternalMyDsl.g:7826:1: rule__DotExpression__TailAssignment_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__DotExpression__TailAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7830:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:7831:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:7831:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:7832:3: ( RULE_ID )
            {
             before(grammarAccess.getDotExpressionAccess().getTailReUseAbleCrossReference_1_2_0()); 
            // InternalMyDsl.g:7833:3: ( RULE_ID )
            // InternalMyDsl.g:7834:4: RULE_ID
            {
             before(grammarAccess.getDotExpressionAccess().getTailReUseAbleIDTerminalRuleCall_1_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDotExpressionAccess().getTailReUseAbleIDTerminalRuleCall_1_2_0_1()); 

            }

             after(grammarAccess.getDotExpressionAccess().getTailReUseAbleCrossReference_1_2_0()); 

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
    // $ANTLR end "rule__DotExpression__TailAssignment_1_2"


    // $ANTLR start "rule__ReUsableRef__ReuseableAssignment_1"
    // InternalMyDsl.g:7845:1: rule__ReUsableRef__ReuseableAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ReUsableRef__ReuseableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7849:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:7850:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:7850:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:7851:3: ( RULE_ID )
            {
             before(grammarAccess.getReUsableRefAccess().getReuseableReUseAbleCrossReference_1_0()); 
            // InternalMyDsl.g:7852:3: ( RULE_ID )
            // InternalMyDsl.g:7853:4: RULE_ID
            {
             before(grammarAccess.getReUsableRefAccess().getReuseableReUseAbleIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getReUsableRefAccess().getReuseableReUseAbleIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getReUsableRefAccess().getReuseableReUseAbleCrossReference_1_0()); 

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
    // $ANTLR end "rule__ReUsableRef__ReuseableAssignment_1"


    // $ANTLR start "rule__Inertial__NameAssignment_2"
    // InternalMyDsl.g:7864:1: rule__Inertial__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Inertial__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7868:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:7869:2: ( RULE_ID )
            {
            // InternalMyDsl.g:7869:2: ( RULE_ID )
            // InternalMyDsl.g:7870:3: RULE_ID
            {
             before(grammarAccess.getInertialAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInertialAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Inertial__NameAssignment_2"


    // $ANTLR start "rule__Inertial__InertiaAssignment_3"
    // InternalMyDsl.g:7879:1: rule__Inertial__InertiaAssignment_3 : ( ruleInertia ) ;
    public final void rule__Inertial__InertiaAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7883:1: ( ( ruleInertia ) )
            // InternalMyDsl.g:7884:2: ( ruleInertia )
            {
            // InternalMyDsl.g:7884:2: ( ruleInertia )
            // InternalMyDsl.g:7885:3: ruleInertia
            {
             before(grammarAccess.getInertialAccess().getInertiaInertiaParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleInertia();

            state._fsp--;

             after(grammarAccess.getInertialAccess().getInertiaInertiaParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Inertial__InertiaAssignment_3"


    // $ANTLR start "rule__Inertial__MassAssignment_4"
    // InternalMyDsl.g:7894:1: rule__Inertial__MassAssignment_4 : ( ruleMass ) ;
    public final void rule__Inertial__MassAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7898:1: ( ( ruleMass ) )
            // InternalMyDsl.g:7899:2: ( ruleMass )
            {
            // InternalMyDsl.g:7899:2: ( ruleMass )
            // InternalMyDsl.g:7900:3: ruleMass
            {
             before(grammarAccess.getInertialAccess().getMassMassParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleMass();

            state._fsp--;

             after(grammarAccess.getInertialAccess().getMassMassParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Inertial__MassAssignment_4"


    // $ANTLR start "rule__Inertial__OriginAssignment_5"
    // InternalMyDsl.g:7909:1: rule__Inertial__OriginAssignment_5 : ( ruleOrigin ) ;
    public final void rule__Inertial__OriginAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7913:1: ( ( ruleOrigin ) )
            // InternalMyDsl.g:7914:2: ( ruleOrigin )
            {
            // InternalMyDsl.g:7914:2: ( ruleOrigin )
            // InternalMyDsl.g:7915:3: ruleOrigin
            {
             before(grammarAccess.getInertialAccess().getOriginOriginParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleOrigin();

            state._fsp--;

             after(grammarAccess.getInertialAccess().getOriginOriginParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Inertial__OriginAssignment_5"


    // $ANTLR start "rule__Inertia__NameAssignment_2"
    // InternalMyDsl.g:7924:1: rule__Inertia__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Inertia__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7928:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:7929:2: ( RULE_ID )
            {
            // InternalMyDsl.g:7929:2: ( RULE_ID )
            // InternalMyDsl.g:7930:3: RULE_ID
            {
             before(grammarAccess.getInertiaAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInertiaAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Inertia__NameAssignment_2"


    // $ANTLR start "rule__Inertia__IxxAssignment_4"
    // InternalMyDsl.g:7939:1: rule__Inertia__IxxAssignment_4 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__Inertia__IxxAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7943:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:7944:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:7944:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:7945:3: ruleURDFAttrSignedNumeric
            {
             before(grammarAccess.getInertiaAccess().getIxxURDFAttrSignedNumericParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleURDFAttrSignedNumeric();

            state._fsp--;

             after(grammarAccess.getInertiaAccess().getIxxURDFAttrSignedNumericParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Inertia__IxxAssignment_4"


    // $ANTLR start "rule__Inertia__IxyAssignment_6"
    // InternalMyDsl.g:7954:1: rule__Inertia__IxyAssignment_6 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__Inertia__IxyAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7958:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:7959:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:7959:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:7960:3: ruleURDFAttrSignedNumeric
            {
             before(grammarAccess.getInertiaAccess().getIxyURDFAttrSignedNumericParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleURDFAttrSignedNumeric();

            state._fsp--;

             after(grammarAccess.getInertiaAccess().getIxyURDFAttrSignedNumericParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Inertia__IxyAssignment_6"


    // $ANTLR start "rule__Inertia__IxzAssignment_8"
    // InternalMyDsl.g:7969:1: rule__Inertia__IxzAssignment_8 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__Inertia__IxzAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7973:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:7974:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:7974:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:7975:3: ruleURDFAttrSignedNumeric
            {
             before(grammarAccess.getInertiaAccess().getIxzURDFAttrSignedNumericParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleURDFAttrSignedNumeric();

            state._fsp--;

             after(grammarAccess.getInertiaAccess().getIxzURDFAttrSignedNumericParserRuleCall_8_0()); 

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
    // $ANTLR end "rule__Inertia__IxzAssignment_8"


    // $ANTLR start "rule__Inertia__IyyAssignment_10"
    // InternalMyDsl.g:7984:1: rule__Inertia__IyyAssignment_10 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__Inertia__IyyAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7988:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:7989:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:7989:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:7990:3: ruleURDFAttrSignedNumeric
            {
             before(grammarAccess.getInertiaAccess().getIyyURDFAttrSignedNumericParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleURDFAttrSignedNumeric();

            state._fsp--;

             after(grammarAccess.getInertiaAccess().getIyyURDFAttrSignedNumericParserRuleCall_10_0()); 

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
    // $ANTLR end "rule__Inertia__IyyAssignment_10"


    // $ANTLR start "rule__Inertia__IyzAssignment_12"
    // InternalMyDsl.g:7999:1: rule__Inertia__IyzAssignment_12 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__Inertia__IyzAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8003:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:8004:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:8004:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:8005:3: ruleURDFAttrSignedNumeric
            {
             before(grammarAccess.getInertiaAccess().getIyzURDFAttrSignedNumericParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            ruleURDFAttrSignedNumeric();

            state._fsp--;

             after(grammarAccess.getInertiaAccess().getIyzURDFAttrSignedNumericParserRuleCall_12_0()); 

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
    // $ANTLR end "rule__Inertia__IyzAssignment_12"


    // $ANTLR start "rule__Inertia__IzzAssignment_14"
    // InternalMyDsl.g:8014:1: rule__Inertia__IzzAssignment_14 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__Inertia__IzzAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8018:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:8019:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:8019:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:8020:3: ruleURDFAttrSignedNumeric
            {
             before(grammarAccess.getInertiaAccess().getIzzURDFAttrSignedNumericParserRuleCall_14_0()); 
            pushFollow(FOLLOW_2);
            ruleURDFAttrSignedNumeric();

            state._fsp--;

             after(grammarAccess.getInertiaAccess().getIzzURDFAttrSignedNumericParserRuleCall_14_0()); 

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
    // $ANTLR end "rule__Inertia__IzzAssignment_14"


    // $ANTLR start "rule__Visual__NameAssignment_2"
    // InternalMyDsl.g:8029:1: rule__Visual__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Visual__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8033:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:8034:2: ( RULE_ID )
            {
            // InternalMyDsl.g:8034:2: ( RULE_ID )
            // InternalMyDsl.g:8035:3: RULE_ID
            {
             before(grammarAccess.getVisualAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVisualAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Visual__NameAssignment_2"


    // $ANTLR start "rule__Visual__GeometryAssignment_4"
    // InternalMyDsl.g:8044:1: rule__Visual__GeometryAssignment_4 : ( ruleGeometry ) ;
    public final void rule__Visual__GeometryAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8048:1: ( ( ruleGeometry ) )
            // InternalMyDsl.g:8049:2: ( ruleGeometry )
            {
            // InternalMyDsl.g:8049:2: ( ruleGeometry )
            // InternalMyDsl.g:8050:3: ruleGeometry
            {
             before(grammarAccess.getVisualAccess().getGeometryGeometryParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleGeometry();

            state._fsp--;

             after(grammarAccess.getVisualAccess().getGeometryGeometryParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Visual__GeometryAssignment_4"


    // $ANTLR start "rule__Visual__OriginAssignment_5"
    // InternalMyDsl.g:8059:1: rule__Visual__OriginAssignment_5 : ( ruleOrigin ) ;
    public final void rule__Visual__OriginAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8063:1: ( ( ruleOrigin ) )
            // InternalMyDsl.g:8064:2: ( ruleOrigin )
            {
            // InternalMyDsl.g:8064:2: ( ruleOrigin )
            // InternalMyDsl.g:8065:3: ruleOrigin
            {
             before(grammarAccess.getVisualAccess().getOriginOriginParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleOrigin();

            state._fsp--;

             after(grammarAccess.getVisualAccess().getOriginOriginParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Visual__OriginAssignment_5"


    // $ANTLR start "rule__Visual__MaterialAssignment_6_1"
    // InternalMyDsl.g:8074:1: rule__Visual__MaterialAssignment_6_1 : ( ruleMaterial ) ;
    public final void rule__Visual__MaterialAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8078:1: ( ( ruleMaterial ) )
            // InternalMyDsl.g:8079:2: ( ruleMaterial )
            {
            // InternalMyDsl.g:8079:2: ( ruleMaterial )
            // InternalMyDsl.g:8080:3: ruleMaterial
            {
             before(grammarAccess.getVisualAccess().getMaterialMaterialParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMaterial();

            state._fsp--;

             after(grammarAccess.getVisualAccess().getMaterialMaterialParserRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__Visual__MaterialAssignment_6_1"


    // $ANTLR start "rule__Origin__NameAssignment_2"
    // InternalMyDsl.g:8089:1: rule__Origin__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Origin__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8093:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:8094:2: ( RULE_ID )
            {
            // InternalMyDsl.g:8094:2: ( RULE_ID )
            // InternalMyDsl.g:8095:3: RULE_ID
            {
             before(grammarAccess.getOriginAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getOriginAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Origin__NameAssignment_2"


    // $ANTLR start "rule__Origin__XAssignment_4"
    // InternalMyDsl.g:8104:1: rule__Origin__XAssignment_4 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__Origin__XAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8108:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:8109:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:8109:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:8110:3: ruleURDFAttrSignedNumeric
            {
             before(grammarAccess.getOriginAccess().getXURDFAttrSignedNumericParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleURDFAttrSignedNumeric();

            state._fsp--;

             after(grammarAccess.getOriginAccess().getXURDFAttrSignedNumericParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Origin__XAssignment_4"


    // $ANTLR start "rule__Origin__YAssignment_6"
    // InternalMyDsl.g:8119:1: rule__Origin__YAssignment_6 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__Origin__YAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8123:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:8124:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:8124:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:8125:3: ruleURDFAttrSignedNumeric
            {
             before(grammarAccess.getOriginAccess().getYURDFAttrSignedNumericParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleURDFAttrSignedNumeric();

            state._fsp--;

             after(grammarAccess.getOriginAccess().getYURDFAttrSignedNumericParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Origin__YAssignment_6"


    // $ANTLR start "rule__Origin__ZAssignment_8"
    // InternalMyDsl.g:8134:1: rule__Origin__ZAssignment_8 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__Origin__ZAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8138:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:8139:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:8139:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:8140:3: ruleURDFAttrSignedNumeric
            {
             before(grammarAccess.getOriginAccess().getZURDFAttrSignedNumericParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleURDFAttrSignedNumeric();

            state._fsp--;

             after(grammarAccess.getOriginAccess().getZURDFAttrSignedNumericParserRuleCall_8_0()); 

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
    // $ANTLR end "rule__Origin__ZAssignment_8"


    // $ANTLR start "rule__Origin__RollAssignment_9_1"
    // InternalMyDsl.g:8149:1: rule__Origin__RollAssignment_9_1 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__Origin__RollAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8153:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:8154:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:8154:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:8155:3: ruleURDFAttrSignedNumeric
            {
             before(grammarAccess.getOriginAccess().getRollURDFAttrSignedNumericParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleURDFAttrSignedNumeric();

            state._fsp--;

             after(grammarAccess.getOriginAccess().getRollURDFAttrSignedNumericParserRuleCall_9_1_0()); 

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
    // $ANTLR end "rule__Origin__RollAssignment_9_1"


    // $ANTLR start "rule__Origin__PitchAssignment_10_1"
    // InternalMyDsl.g:8164:1: rule__Origin__PitchAssignment_10_1 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__Origin__PitchAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8168:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:8169:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:8169:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:8170:3: ruleURDFAttrSignedNumeric
            {
             before(grammarAccess.getOriginAccess().getPitchURDFAttrSignedNumericParserRuleCall_10_1_0()); 
            pushFollow(FOLLOW_2);
            ruleURDFAttrSignedNumeric();

            state._fsp--;

             after(grammarAccess.getOriginAccess().getPitchURDFAttrSignedNumericParserRuleCall_10_1_0()); 

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
    // $ANTLR end "rule__Origin__PitchAssignment_10_1"


    // $ANTLR start "rule__Origin__YawAssignment_11_1"
    // InternalMyDsl.g:8179:1: rule__Origin__YawAssignment_11_1 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__Origin__YawAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8183:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:8184:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:8184:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:8185:3: ruleURDFAttrSignedNumeric
            {
             before(grammarAccess.getOriginAccess().getYawURDFAttrSignedNumericParserRuleCall_11_1_0()); 
            pushFollow(FOLLOW_2);
            ruleURDFAttrSignedNumeric();

            state._fsp--;

             after(grammarAccess.getOriginAccess().getYawURDFAttrSignedNumericParserRuleCall_11_1_0()); 

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
    // $ANTLR end "rule__Origin__YawAssignment_11_1"


    // $ANTLR start "rule__Mass__NameAssignment_2"
    // InternalMyDsl.g:8194:1: rule__Mass__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Mass__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8198:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:8199:2: ( RULE_ID )
            {
            // InternalMyDsl.g:8199:2: ( RULE_ID )
            // InternalMyDsl.g:8200:3: RULE_ID
            {
             before(grammarAccess.getMassAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMassAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Mass__NameAssignment_2"


    // $ANTLR start "rule__Mass__MassKilogramAssignment_4"
    // InternalMyDsl.g:8209:1: rule__Mass__MassKilogramAssignment_4 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__Mass__MassKilogramAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8213:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:8214:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:8214:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:8215:3: ruleURDFAttrSignedNumeric
            {
             before(grammarAccess.getMassAccess().getMassKilogramURDFAttrSignedNumericParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleURDFAttrSignedNumeric();

            state._fsp--;

             after(grammarAccess.getMassAccess().getMassKilogramURDFAttrSignedNumericParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Mass__MassKilogramAssignment_4"


    // $ANTLR start "rule__Collision__NameAssignment_1"
    // InternalMyDsl.g:8224:1: rule__Collision__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Collision__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8228:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:8229:2: ( RULE_ID )
            {
            // InternalMyDsl.g:8229:2: ( RULE_ID )
            // InternalMyDsl.g:8230:3: RULE_ID
            {
             before(grammarAccess.getCollisionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCollisionAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Collision__NameAssignment_1"


    // $ANTLR start "rule__Collision__GeometryAssignment_3"
    // InternalMyDsl.g:8239:1: rule__Collision__GeometryAssignment_3 : ( ruleGeometry ) ;
    public final void rule__Collision__GeometryAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8243:1: ( ( ruleGeometry ) )
            // InternalMyDsl.g:8244:2: ( ruleGeometry )
            {
            // InternalMyDsl.g:8244:2: ( ruleGeometry )
            // InternalMyDsl.g:8245:3: ruleGeometry
            {
             before(grammarAccess.getCollisionAccess().getGeometryGeometryParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleGeometry();

            state._fsp--;

             after(grammarAccess.getCollisionAccess().getGeometryGeometryParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Collision__GeometryAssignment_3"


    // $ANTLR start "rule__Collision__OriginAssignment_4"
    // InternalMyDsl.g:8254:1: rule__Collision__OriginAssignment_4 : ( ruleOrigin ) ;
    public final void rule__Collision__OriginAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8258:1: ( ( ruleOrigin ) )
            // InternalMyDsl.g:8259:2: ( ruleOrigin )
            {
            // InternalMyDsl.g:8259:2: ( ruleOrigin )
            // InternalMyDsl.g:8260:3: ruleOrigin
            {
             before(grammarAccess.getCollisionAccess().getOriginOriginParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleOrigin();

            state._fsp--;

             after(grammarAccess.getCollisionAccess().getOriginOriginParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Collision__OriginAssignment_4"


    // $ANTLR start "rule__Box__NameAssignment_1"
    // InternalMyDsl.g:8269:1: rule__Box__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Box__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8273:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:8274:2: ( RULE_ID )
            {
            // InternalMyDsl.g:8274:2: ( RULE_ID )
            // InternalMyDsl.g:8275:3: RULE_ID
            {
             before(grammarAccess.getBoxAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBoxAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Box__NameAssignment_1"


    // $ANTLR start "rule__Box__HeightAssignment_3"
    // InternalMyDsl.g:8284:1: rule__Box__HeightAssignment_3 : ( ruleURDFAttrNumeric ) ;
    public final void rule__Box__HeightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8288:1: ( ( ruleURDFAttrNumeric ) )
            // InternalMyDsl.g:8289:2: ( ruleURDFAttrNumeric )
            {
            // InternalMyDsl.g:8289:2: ( ruleURDFAttrNumeric )
            // InternalMyDsl.g:8290:3: ruleURDFAttrNumeric
            {
             before(grammarAccess.getBoxAccess().getHeightURDFAttrNumericParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleURDFAttrNumeric();

            state._fsp--;

             after(grammarAccess.getBoxAccess().getHeightURDFAttrNumericParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Box__HeightAssignment_3"


    // $ANTLR start "rule__Box__LengthAssignment_5"
    // InternalMyDsl.g:8299:1: rule__Box__LengthAssignment_5 : ( ruleURDFAttrNumeric ) ;
    public final void rule__Box__LengthAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8303:1: ( ( ruleURDFAttrNumeric ) )
            // InternalMyDsl.g:8304:2: ( ruleURDFAttrNumeric )
            {
            // InternalMyDsl.g:8304:2: ( ruleURDFAttrNumeric )
            // InternalMyDsl.g:8305:3: ruleURDFAttrNumeric
            {
             before(grammarAccess.getBoxAccess().getLengthURDFAttrNumericParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleURDFAttrNumeric();

            state._fsp--;

             after(grammarAccess.getBoxAccess().getLengthURDFAttrNumericParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Box__LengthAssignment_5"


    // $ANTLR start "rule__Box__WidthAssignment_7"
    // InternalMyDsl.g:8314:1: rule__Box__WidthAssignment_7 : ( ruleURDFAttrNumeric ) ;
    public final void rule__Box__WidthAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8318:1: ( ( ruleURDFAttrNumeric ) )
            // InternalMyDsl.g:8319:2: ( ruleURDFAttrNumeric )
            {
            // InternalMyDsl.g:8319:2: ( ruleURDFAttrNumeric )
            // InternalMyDsl.g:8320:3: ruleURDFAttrNumeric
            {
             before(grammarAccess.getBoxAccess().getWidthURDFAttrNumericParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleURDFAttrNumeric();

            state._fsp--;

             after(grammarAccess.getBoxAccess().getWidthURDFAttrNumericParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__Box__WidthAssignment_7"


    // $ANTLR start "rule__Cylinder__NameAssignment_1"
    // InternalMyDsl.g:8329:1: rule__Cylinder__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Cylinder__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8333:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:8334:2: ( RULE_ID )
            {
            // InternalMyDsl.g:8334:2: ( RULE_ID )
            // InternalMyDsl.g:8335:3: RULE_ID
            {
             before(grammarAccess.getCylinderAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCylinderAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Cylinder__NameAssignment_1"


    // $ANTLR start "rule__Cylinder__RadiusAssignment_3"
    // InternalMyDsl.g:8344:1: rule__Cylinder__RadiusAssignment_3 : ( ruleURDFAttrNumeric ) ;
    public final void rule__Cylinder__RadiusAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8348:1: ( ( ruleURDFAttrNumeric ) )
            // InternalMyDsl.g:8349:2: ( ruleURDFAttrNumeric )
            {
            // InternalMyDsl.g:8349:2: ( ruleURDFAttrNumeric )
            // InternalMyDsl.g:8350:3: ruleURDFAttrNumeric
            {
             before(grammarAccess.getCylinderAccess().getRadiusURDFAttrNumericParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleURDFAttrNumeric();

            state._fsp--;

             after(grammarAccess.getCylinderAccess().getRadiusURDFAttrNumericParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Cylinder__RadiusAssignment_3"


    // $ANTLR start "rule__Cylinder__LengthAssignment_5"
    // InternalMyDsl.g:8359:1: rule__Cylinder__LengthAssignment_5 : ( ruleURDFAttrNumeric ) ;
    public final void rule__Cylinder__LengthAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8363:1: ( ( ruleURDFAttrNumeric ) )
            // InternalMyDsl.g:8364:2: ( ruleURDFAttrNumeric )
            {
            // InternalMyDsl.g:8364:2: ( ruleURDFAttrNumeric )
            // InternalMyDsl.g:8365:3: ruleURDFAttrNumeric
            {
             before(grammarAccess.getCylinderAccess().getLengthURDFAttrNumericParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleURDFAttrNumeric();

            state._fsp--;

             after(grammarAccess.getCylinderAccess().getLengthURDFAttrNumericParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Cylinder__LengthAssignment_5"


    // $ANTLR start "rule__Mesh__NameAssignment_1"
    // InternalMyDsl.g:8374:1: rule__Mesh__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Mesh__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8378:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:8379:2: ( RULE_ID )
            {
            // InternalMyDsl.g:8379:2: ( RULE_ID )
            // InternalMyDsl.g:8380:3: RULE_ID
            {
             before(grammarAccess.getMeshAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMeshAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Mesh__NameAssignment_1"


    // $ANTLR start "rule__Mesh__PathToFileAssignment_3"
    // InternalMyDsl.g:8389:1: rule__Mesh__PathToFileAssignment_3 : ( ruleURDFAttrSTRING ) ;
    public final void rule__Mesh__PathToFileAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8393:1: ( ( ruleURDFAttrSTRING ) )
            // InternalMyDsl.g:8394:2: ( ruleURDFAttrSTRING )
            {
            // InternalMyDsl.g:8394:2: ( ruleURDFAttrSTRING )
            // InternalMyDsl.g:8395:3: ruleURDFAttrSTRING
            {
             before(grammarAccess.getMeshAccess().getPathToFileURDFAttrSTRINGParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleURDFAttrSTRING();

            state._fsp--;

             after(grammarAccess.getMeshAccess().getPathToFileURDFAttrSTRINGParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Mesh__PathToFileAssignment_3"


    // $ANTLR start "rule__Sphere__NameAssignment_1"
    // InternalMyDsl.g:8404:1: rule__Sphere__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Sphere__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8408:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:8409:2: ( RULE_ID )
            {
            // InternalMyDsl.g:8409:2: ( RULE_ID )
            // InternalMyDsl.g:8410:3: RULE_ID
            {
             before(grammarAccess.getSphereAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSphereAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Sphere__NameAssignment_1"


    // $ANTLR start "rule__Sphere__RadiusAssignment_3"
    // InternalMyDsl.g:8419:1: rule__Sphere__RadiusAssignment_3 : ( ruleURDFAttrNumeric ) ;
    public final void rule__Sphere__RadiusAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8423:1: ( ( ruleURDFAttrNumeric ) )
            // InternalMyDsl.g:8424:2: ( ruleURDFAttrNumeric )
            {
            // InternalMyDsl.g:8424:2: ( ruleURDFAttrNumeric )
            // InternalMyDsl.g:8425:3: ruleURDFAttrNumeric
            {
             before(grammarAccess.getSphereAccess().getRadiusURDFAttrNumericParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleURDFAttrNumeric();

            state._fsp--;

             after(grammarAccess.getSphereAccess().getRadiusURDFAttrNumericParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Sphere__RadiusAssignment_3"


    // $ANTLR start "rule__Texture__NameAssignment_1"
    // InternalMyDsl.g:8434:1: rule__Texture__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Texture__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8438:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:8439:2: ( RULE_ID )
            {
            // InternalMyDsl.g:8439:2: ( RULE_ID )
            // InternalMyDsl.g:8440:3: RULE_ID
            {
             before(grammarAccess.getTextureAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTextureAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Texture__NameAssignment_1"


    // $ANTLR start "rule__Texture__PathToFileAssignment_3"
    // InternalMyDsl.g:8449:1: rule__Texture__PathToFileAssignment_3 : ( ruleURDFAttrSTRING ) ;
    public final void rule__Texture__PathToFileAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8453:1: ( ( ruleURDFAttrSTRING ) )
            // InternalMyDsl.g:8454:2: ( ruleURDFAttrSTRING )
            {
            // InternalMyDsl.g:8454:2: ( ruleURDFAttrSTRING )
            // InternalMyDsl.g:8455:3: ruleURDFAttrSTRING
            {
             before(grammarAccess.getTextureAccess().getPathToFileURDFAttrSTRINGParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleURDFAttrSTRING();

            state._fsp--;

             after(grammarAccess.getTextureAccess().getPathToFileURDFAttrSTRINGParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Texture__PathToFileAssignment_3"


    // $ANTLR start "rule__Color__NameAssignment_1"
    // InternalMyDsl.g:8464:1: rule__Color__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Color__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8468:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:8469:2: ( RULE_ID )
            {
            // InternalMyDsl.g:8469:2: ( RULE_ID )
            // InternalMyDsl.g:8470:3: RULE_ID
            {
             before(grammarAccess.getColorAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getColorAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Color__NameAssignment_1"


    // $ANTLR start "rule__Color__RedAssignment_3"
    // InternalMyDsl.g:8479:1: rule__Color__RedAssignment_3 : ( ruleURDFAttrFloat ) ;
    public final void rule__Color__RedAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8483:1: ( ( ruleURDFAttrFloat ) )
            // InternalMyDsl.g:8484:2: ( ruleURDFAttrFloat )
            {
            // InternalMyDsl.g:8484:2: ( ruleURDFAttrFloat )
            // InternalMyDsl.g:8485:3: ruleURDFAttrFloat
            {
             before(grammarAccess.getColorAccess().getRedURDFAttrFloatParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleURDFAttrFloat();

            state._fsp--;

             after(grammarAccess.getColorAccess().getRedURDFAttrFloatParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Color__RedAssignment_3"


    // $ANTLR start "rule__Color__GreenAssignment_5"
    // InternalMyDsl.g:8494:1: rule__Color__GreenAssignment_5 : ( ruleURDFAttrFloat ) ;
    public final void rule__Color__GreenAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8498:1: ( ( ruleURDFAttrFloat ) )
            // InternalMyDsl.g:8499:2: ( ruleURDFAttrFloat )
            {
            // InternalMyDsl.g:8499:2: ( ruleURDFAttrFloat )
            // InternalMyDsl.g:8500:3: ruleURDFAttrFloat
            {
             before(grammarAccess.getColorAccess().getGreenURDFAttrFloatParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleURDFAttrFloat();

            state._fsp--;

             after(grammarAccess.getColorAccess().getGreenURDFAttrFloatParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Color__GreenAssignment_5"


    // $ANTLR start "rule__Color__BlueAssignment_7"
    // InternalMyDsl.g:8509:1: rule__Color__BlueAssignment_7 : ( ruleURDFAttrFloat ) ;
    public final void rule__Color__BlueAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8513:1: ( ( ruleURDFAttrFloat ) )
            // InternalMyDsl.g:8514:2: ( ruleURDFAttrFloat )
            {
            // InternalMyDsl.g:8514:2: ( ruleURDFAttrFloat )
            // InternalMyDsl.g:8515:3: ruleURDFAttrFloat
            {
             before(grammarAccess.getColorAccess().getBlueURDFAttrFloatParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleURDFAttrFloat();

            state._fsp--;

             after(grammarAccess.getColorAccess().getBlueURDFAttrFloatParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__Color__BlueAssignment_7"


    // $ANTLR start "rule__Color__AlphaAssignment_9"
    // InternalMyDsl.g:8524:1: rule__Color__AlphaAssignment_9 : ( ruleURDFAttrFloat ) ;
    public final void rule__Color__AlphaAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8528:1: ( ( ruleURDFAttrFloat ) )
            // InternalMyDsl.g:8529:2: ( ruleURDFAttrFloat )
            {
            // InternalMyDsl.g:8529:2: ( ruleURDFAttrFloat )
            // InternalMyDsl.g:8530:3: ruleURDFAttrFloat
            {
             before(grammarAccess.getColorAccess().getAlphaURDFAttrFloatParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleURDFAttrFloat();

            state._fsp--;

             after(grammarAccess.getColorAccess().getAlphaURDFAttrFloatParserRuleCall_9_0()); 

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
    // $ANTLR end "rule__Color__AlphaAssignment_9"


    // $ANTLR start "rule__Joint__NameAssignment_1"
    // InternalMyDsl.g:8539:1: rule__Joint__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Joint__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8543:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:8544:2: ( RULE_ID )
            {
            // InternalMyDsl.g:8544:2: ( RULE_ID )
            // InternalMyDsl.g:8545:3: RULE_ID
            {
             before(grammarAccess.getJointAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Joint__NameAssignment_1"


    // $ANTLR start "rule__Joint__ChildOfAssignment_2_0_0_2"
    // InternalMyDsl.g:8554:1: rule__Joint__ChildOfAssignment_2_0_0_2 : ( ( RULE_ID ) ) ;
    public final void rule__Joint__ChildOfAssignment_2_0_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8558:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:8559:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:8559:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:8560:3: ( RULE_ID )
            {
             before(grammarAccess.getJointAccess().getChildOfLinkCrossReference_2_0_0_2_0()); 
            // InternalMyDsl.g:8561:3: ( RULE_ID )
            // InternalMyDsl.g:8562:4: RULE_ID
            {
             before(grammarAccess.getJointAccess().getChildOfLinkIDTerminalRuleCall_2_0_0_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getChildOfLinkIDTerminalRuleCall_2_0_0_2_0_1()); 

            }

             after(grammarAccess.getJointAccess().getChildOfLinkCrossReference_2_0_0_2_0()); 

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
    // $ANTLR end "rule__Joint__ChildOfAssignment_2_0_0_2"


    // $ANTLR start "rule__Joint__ParentOfAssignment_2_0_0_4"
    // InternalMyDsl.g:8573:1: rule__Joint__ParentOfAssignment_2_0_0_4 : ( ( RULE_ID ) ) ;
    public final void rule__Joint__ParentOfAssignment_2_0_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8577:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:8578:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:8578:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:8579:3: ( RULE_ID )
            {
             before(grammarAccess.getJointAccess().getParentOfLinkCrossReference_2_0_0_4_0()); 
            // InternalMyDsl.g:8580:3: ( RULE_ID )
            // InternalMyDsl.g:8581:4: RULE_ID
            {
             before(grammarAccess.getJointAccess().getParentOfLinkIDTerminalRuleCall_2_0_0_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getParentOfLinkIDTerminalRuleCall_2_0_0_4_0_1()); 

            }

             after(grammarAccess.getJointAccess().getParentOfLinkCrossReference_2_0_0_4_0()); 

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
    // $ANTLR end "rule__Joint__ParentOfAssignment_2_0_0_4"


    // $ANTLR start "rule__Joint__TypeAssignment_2_0_0_6"
    // InternalMyDsl.g:8592:1: rule__Joint__TypeAssignment_2_0_0_6 : ( ruleJointType ) ;
    public final void rule__Joint__TypeAssignment_2_0_0_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8596:1: ( ( ruleJointType ) )
            // InternalMyDsl.g:8597:2: ( ruleJointType )
            {
            // InternalMyDsl.g:8597:2: ( ruleJointType )
            // InternalMyDsl.g:8598:3: ruleJointType
            {
             before(grammarAccess.getJointAccess().getTypeJointTypeEnumRuleCall_2_0_0_6_0()); 
            pushFollow(FOLLOW_2);
            ruleJointType();

            state._fsp--;

             after(grammarAccess.getJointAccess().getTypeJointTypeEnumRuleCall_2_0_0_6_0()); 

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
    // $ANTLR end "rule__Joint__TypeAssignment_2_0_0_6"


    // $ANTLR start "rule__Joint__OriginAssignment_2_0_1_0"
    // InternalMyDsl.g:8607:1: rule__Joint__OriginAssignment_2_0_1_0 : ( ruleOrigin ) ;
    public final void rule__Joint__OriginAssignment_2_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8611:1: ( ( ruleOrigin ) )
            // InternalMyDsl.g:8612:2: ( ruleOrigin )
            {
            // InternalMyDsl.g:8612:2: ( ruleOrigin )
            // InternalMyDsl.g:8613:3: ruleOrigin
            {
             before(grammarAccess.getJointAccess().getOriginOriginParserRuleCall_2_0_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleOrigin();

            state._fsp--;

             after(grammarAccess.getJointAccess().getOriginOriginParserRuleCall_2_0_1_0_0()); 

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
    // $ANTLR end "rule__Joint__OriginAssignment_2_0_1_0"


    // $ANTLR start "rule__Joint__AxisAssignment_2_0_1_1"
    // InternalMyDsl.g:8622:1: rule__Joint__AxisAssignment_2_0_1_1 : ( ruleAxis ) ;
    public final void rule__Joint__AxisAssignment_2_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8626:1: ( ( ruleAxis ) )
            // InternalMyDsl.g:8627:2: ( ruleAxis )
            {
            // InternalMyDsl.g:8627:2: ( ruleAxis )
            // InternalMyDsl.g:8628:3: ruleAxis
            {
             before(grammarAccess.getJointAccess().getAxisAxisParserRuleCall_2_0_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAxis();

            state._fsp--;

             after(grammarAccess.getJointAccess().getAxisAxisParserRuleCall_2_0_1_1_0()); 

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
    // $ANTLR end "rule__Joint__AxisAssignment_2_0_1_1"


    // $ANTLR start "rule__Joint__LimitAssignment_2_0_1_2"
    // InternalMyDsl.g:8637:1: rule__Joint__LimitAssignment_2_0_1_2 : ( ruleLimit ) ;
    public final void rule__Joint__LimitAssignment_2_0_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8641:1: ( ( ruleLimit ) )
            // InternalMyDsl.g:8642:2: ( ruleLimit )
            {
            // InternalMyDsl.g:8642:2: ( ruleLimit )
            // InternalMyDsl.g:8643:3: ruleLimit
            {
             before(grammarAccess.getJointAccess().getLimitLimitParserRuleCall_2_0_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLimit();

            state._fsp--;

             after(grammarAccess.getJointAccess().getLimitLimitParserRuleCall_2_0_1_2_0()); 

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
    // $ANTLR end "rule__Joint__LimitAssignment_2_0_1_2"


    // $ANTLR start "rule__Joint__CalibrationAssignment_2_0_1_3"
    // InternalMyDsl.g:8652:1: rule__Joint__CalibrationAssignment_2_0_1_3 : ( ruleCalibration ) ;
    public final void rule__Joint__CalibrationAssignment_2_0_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8656:1: ( ( ruleCalibration ) )
            // InternalMyDsl.g:8657:2: ( ruleCalibration )
            {
            // InternalMyDsl.g:8657:2: ( ruleCalibration )
            // InternalMyDsl.g:8658:3: ruleCalibration
            {
             before(grammarAccess.getJointAccess().getCalibrationCalibrationParserRuleCall_2_0_1_3_0()); 
            pushFollow(FOLLOW_2);
            ruleCalibration();

            state._fsp--;

             after(grammarAccess.getJointAccess().getCalibrationCalibrationParserRuleCall_2_0_1_3_0()); 

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
    // $ANTLR end "rule__Joint__CalibrationAssignment_2_0_1_3"


    // $ANTLR start "rule__Joint__DynamicsAssignment_2_0_1_4"
    // InternalMyDsl.g:8667:1: rule__Joint__DynamicsAssignment_2_0_1_4 : ( ruleDynamics ) ;
    public final void rule__Joint__DynamicsAssignment_2_0_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8671:1: ( ( ruleDynamics ) )
            // InternalMyDsl.g:8672:2: ( ruleDynamics )
            {
            // InternalMyDsl.g:8672:2: ( ruleDynamics )
            // InternalMyDsl.g:8673:3: ruleDynamics
            {
             before(grammarAccess.getJointAccess().getDynamicsDynamicsParserRuleCall_2_0_1_4_0()); 
            pushFollow(FOLLOW_2);
            ruleDynamics();

            state._fsp--;

             after(grammarAccess.getJointAccess().getDynamicsDynamicsParserRuleCall_2_0_1_4_0()); 

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
    // $ANTLR end "rule__Joint__DynamicsAssignment_2_0_1_4"


    // $ANTLR start "rule__Joint__SafetycontrollerAssignment_2_0_1_5"
    // InternalMyDsl.g:8682:1: rule__Joint__SafetycontrollerAssignment_2_0_1_5 : ( ruleSafetyController ) ;
    public final void rule__Joint__SafetycontrollerAssignment_2_0_1_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8686:1: ( ( ruleSafetyController ) )
            // InternalMyDsl.g:8687:2: ( ruleSafetyController )
            {
            // InternalMyDsl.g:8687:2: ( ruleSafetyController )
            // InternalMyDsl.g:8688:3: ruleSafetyController
            {
             before(grammarAccess.getJointAccess().getSafetycontrollerSafetyControllerParserRuleCall_2_0_1_5_0()); 
            pushFollow(FOLLOW_2);
            ruleSafetyController();

            state._fsp--;

             after(grammarAccess.getJointAccess().getSafetycontrollerSafetyControllerParserRuleCall_2_0_1_5_0()); 

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
    // $ANTLR end "rule__Joint__SafetycontrollerAssignment_2_0_1_5"


    // $ANTLR start "rule__Joint__IsReuseOfAssignment_2_1_1"
    // InternalMyDsl.g:8697:1: rule__Joint__IsReuseOfAssignment_2_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Joint__IsReuseOfAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8701:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:8702:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:8702:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:8703:3: ( RULE_ID )
            {
             before(grammarAccess.getJointAccess().getIsReuseOfJointCrossReference_2_1_1_0()); 
            // InternalMyDsl.g:8704:3: ( RULE_ID )
            // InternalMyDsl.g:8705:4: RULE_ID
            {
             before(grammarAccess.getJointAccess().getIsReuseOfJointIDTerminalRuleCall_2_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getIsReuseOfJointIDTerminalRuleCall_2_1_1_0_1()); 

            }

             after(grammarAccess.getJointAccess().getIsReuseOfJointCrossReference_2_1_1_0()); 

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
    // $ANTLR end "rule__Joint__IsReuseOfAssignment_2_1_1"


    // $ANTLR start "rule__Joint__ChildOfAssignment_2_1_3"
    // InternalMyDsl.g:8716:1: rule__Joint__ChildOfAssignment_2_1_3 : ( ( RULE_ID ) ) ;
    public final void rule__Joint__ChildOfAssignment_2_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8720:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:8721:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:8721:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:8722:3: ( RULE_ID )
            {
             before(grammarAccess.getJointAccess().getChildOfLinkCrossReference_2_1_3_0()); 
            // InternalMyDsl.g:8723:3: ( RULE_ID )
            // InternalMyDsl.g:8724:4: RULE_ID
            {
             before(grammarAccess.getJointAccess().getChildOfLinkIDTerminalRuleCall_2_1_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getChildOfLinkIDTerminalRuleCall_2_1_3_0_1()); 

            }

             after(grammarAccess.getJointAccess().getChildOfLinkCrossReference_2_1_3_0()); 

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
    // $ANTLR end "rule__Joint__ChildOfAssignment_2_1_3"


    // $ANTLR start "rule__Joint__ParentOfAssignment_2_1_5"
    // InternalMyDsl.g:8735:1: rule__Joint__ParentOfAssignment_2_1_5 : ( ( RULE_ID ) ) ;
    public final void rule__Joint__ParentOfAssignment_2_1_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8739:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:8740:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:8740:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:8741:3: ( RULE_ID )
            {
             before(grammarAccess.getJointAccess().getParentOfLinkCrossReference_2_1_5_0()); 
            // InternalMyDsl.g:8742:3: ( RULE_ID )
            // InternalMyDsl.g:8743:4: RULE_ID
            {
             before(grammarAccess.getJointAccess().getParentOfLinkIDTerminalRuleCall_2_1_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getParentOfLinkIDTerminalRuleCall_2_1_5_0_1()); 

            }

             after(grammarAccess.getJointAccess().getParentOfLinkCrossReference_2_1_5_0()); 

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
    // $ANTLR end "rule__Joint__ParentOfAssignment_2_1_5"


    // $ANTLR start "rule__Joint__ReuseAssignment_2_1_6"
    // InternalMyDsl.g:8754:1: rule__Joint__ReuseAssignment_2_1_6 : ( ruleReuse ) ;
    public final void rule__Joint__ReuseAssignment_2_1_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8758:1: ( ( ruleReuse ) )
            // InternalMyDsl.g:8759:2: ( ruleReuse )
            {
            // InternalMyDsl.g:8759:2: ( ruleReuse )
            // InternalMyDsl.g:8760:3: ruleReuse
            {
             before(grammarAccess.getJointAccess().getReuseReuseParserRuleCall_2_1_6_0()); 
            pushFollow(FOLLOW_2);
            ruleReuse();

            state._fsp--;

             after(grammarAccess.getJointAccess().getReuseReuseParserRuleCall_2_1_6_0()); 

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
    // $ANTLR end "rule__Joint__ReuseAssignment_2_1_6"


    // $ANTLR start "rule__Axis__NameAssignment_1"
    // InternalMyDsl.g:8769:1: rule__Axis__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Axis__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8773:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:8774:2: ( RULE_ID )
            {
            // InternalMyDsl.g:8774:2: ( RULE_ID )
            // InternalMyDsl.g:8775:3: RULE_ID
            {
             before(grammarAccess.getAxisAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAxisAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Axis__NameAssignment_1"


    // $ANTLR start "rule__Axis__XAssignment_3"
    // InternalMyDsl.g:8784:1: rule__Axis__XAssignment_3 : ( ruleURDFAttrINT ) ;
    public final void rule__Axis__XAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8788:1: ( ( ruleURDFAttrINT ) )
            // InternalMyDsl.g:8789:2: ( ruleURDFAttrINT )
            {
            // InternalMyDsl.g:8789:2: ( ruleURDFAttrINT )
            // InternalMyDsl.g:8790:3: ruleURDFAttrINT
            {
             before(grammarAccess.getAxisAccess().getXURDFAttrINTParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleURDFAttrINT();

            state._fsp--;

             after(grammarAccess.getAxisAccess().getXURDFAttrINTParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Axis__XAssignment_3"


    // $ANTLR start "rule__Axis__YAssignment_5"
    // InternalMyDsl.g:8799:1: rule__Axis__YAssignment_5 : ( ruleURDFAttrINT ) ;
    public final void rule__Axis__YAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8803:1: ( ( ruleURDFAttrINT ) )
            // InternalMyDsl.g:8804:2: ( ruleURDFAttrINT )
            {
            // InternalMyDsl.g:8804:2: ( ruleURDFAttrINT )
            // InternalMyDsl.g:8805:3: ruleURDFAttrINT
            {
             before(grammarAccess.getAxisAccess().getYURDFAttrINTParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleURDFAttrINT();

            state._fsp--;

             after(grammarAccess.getAxisAccess().getYURDFAttrINTParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Axis__YAssignment_5"


    // $ANTLR start "rule__Axis__ZAssignment_7"
    // InternalMyDsl.g:8814:1: rule__Axis__ZAssignment_7 : ( ruleURDFAttrINT ) ;
    public final void rule__Axis__ZAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8818:1: ( ( ruleURDFAttrINT ) )
            // InternalMyDsl.g:8819:2: ( ruleURDFAttrINT )
            {
            // InternalMyDsl.g:8819:2: ( ruleURDFAttrINT )
            // InternalMyDsl.g:8820:3: ruleURDFAttrINT
            {
             before(grammarAccess.getAxisAccess().getZURDFAttrINTParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleURDFAttrINT();

            state._fsp--;

             after(grammarAccess.getAxisAccess().getZURDFAttrINTParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__Axis__ZAssignment_7"


    // $ANTLR start "rule__Limit__NameAssignment_1"
    // InternalMyDsl.g:8829:1: rule__Limit__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Limit__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8833:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:8834:2: ( RULE_ID )
            {
            // InternalMyDsl.g:8834:2: ( RULE_ID )
            // InternalMyDsl.g:8835:3: RULE_ID
            {
             before(grammarAccess.getLimitAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLimitAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Limit__NameAssignment_1"


    // $ANTLR start "rule__Limit__EffortAssignment_3"
    // InternalMyDsl.g:8844:1: rule__Limit__EffortAssignment_3 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__Limit__EffortAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8848:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:8849:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:8849:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:8850:3: ruleURDFAttrSignedNumeric
            {
             before(grammarAccess.getLimitAccess().getEffortURDFAttrSignedNumericParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleURDFAttrSignedNumeric();

            state._fsp--;

             after(grammarAccess.getLimitAccess().getEffortURDFAttrSignedNumericParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Limit__EffortAssignment_3"


    // $ANTLR start "rule__Limit__VelocityAssignment_5"
    // InternalMyDsl.g:8859:1: rule__Limit__VelocityAssignment_5 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__Limit__VelocityAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8863:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:8864:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:8864:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:8865:3: ruleURDFAttrSignedNumeric
            {
             before(grammarAccess.getLimitAccess().getVelocityURDFAttrSignedNumericParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleURDFAttrSignedNumeric();

            state._fsp--;

             after(grammarAccess.getLimitAccess().getVelocityURDFAttrSignedNumericParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Limit__VelocityAssignment_5"


    // $ANTLR start "rule__Limit__LowerAssignment_6_0_1"
    // InternalMyDsl.g:8874:1: rule__Limit__LowerAssignment_6_0_1 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__Limit__LowerAssignment_6_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8878:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:8879:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:8879:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:8880:3: ruleURDFAttrSignedNumeric
            {
             before(grammarAccess.getLimitAccess().getLowerURDFAttrSignedNumericParserRuleCall_6_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleURDFAttrSignedNumeric();

            state._fsp--;

             after(grammarAccess.getLimitAccess().getLowerURDFAttrSignedNumericParserRuleCall_6_0_1_0()); 

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
    // $ANTLR end "rule__Limit__LowerAssignment_6_0_1"


    // $ANTLR start "rule__Limit__UpperAssignment_6_1_1"
    // InternalMyDsl.g:8889:1: rule__Limit__UpperAssignment_6_1_1 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__Limit__UpperAssignment_6_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8893:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:8894:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:8894:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:8895:3: ruleURDFAttrSignedNumeric
            {
             before(grammarAccess.getLimitAccess().getUpperURDFAttrSignedNumericParserRuleCall_6_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleURDFAttrSignedNumeric();

            state._fsp--;

             after(grammarAccess.getLimitAccess().getUpperURDFAttrSignedNumericParserRuleCall_6_1_1_0()); 

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
    // $ANTLR end "rule__Limit__UpperAssignment_6_1_1"


    // $ANTLR start "rule__Calibration__NameAssignment_2"
    // InternalMyDsl.g:8904:1: rule__Calibration__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Calibration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8908:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:8909:2: ( RULE_ID )
            {
            // InternalMyDsl.g:8909:2: ( RULE_ID )
            // InternalMyDsl.g:8910:3: RULE_ID
            {
             before(grammarAccess.getCalibrationAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCalibrationAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Calibration__NameAssignment_2"


    // $ANTLR start "rule__Calibration__RisingAssignment_3_0_1"
    // InternalMyDsl.g:8919:1: rule__Calibration__RisingAssignment_3_0_1 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__Calibration__RisingAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8923:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:8924:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:8924:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:8925:3: ruleURDFAttrSignedNumeric
            {
             before(grammarAccess.getCalibrationAccess().getRisingURDFAttrSignedNumericParserRuleCall_3_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleURDFAttrSignedNumeric();

            state._fsp--;

             after(grammarAccess.getCalibrationAccess().getRisingURDFAttrSignedNumericParserRuleCall_3_0_1_0()); 

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
    // $ANTLR end "rule__Calibration__RisingAssignment_3_0_1"


    // $ANTLR start "rule__Calibration__FallingAssignment_3_1_1"
    // InternalMyDsl.g:8934:1: rule__Calibration__FallingAssignment_3_1_1 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__Calibration__FallingAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8938:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:8939:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:8939:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:8940:3: ruleURDFAttrSignedNumeric
            {
             before(grammarAccess.getCalibrationAccess().getFallingURDFAttrSignedNumericParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleURDFAttrSignedNumeric();

            state._fsp--;

             after(grammarAccess.getCalibrationAccess().getFallingURDFAttrSignedNumericParserRuleCall_3_1_1_0()); 

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
    // $ANTLR end "rule__Calibration__FallingAssignment_3_1_1"


    // $ANTLR start "rule__Dynamics__NameAssignment_2"
    // InternalMyDsl.g:8949:1: rule__Dynamics__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Dynamics__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8953:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:8954:2: ( RULE_ID )
            {
            // InternalMyDsl.g:8954:2: ( RULE_ID )
            // InternalMyDsl.g:8955:3: RULE_ID
            {
             before(grammarAccess.getDynamicsAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDynamicsAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Dynamics__NameAssignment_2"


    // $ANTLR start "rule__Dynamics__FrictionAssignment_3_0_1"
    // InternalMyDsl.g:8964:1: rule__Dynamics__FrictionAssignment_3_0_1 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__Dynamics__FrictionAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8968:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:8969:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:8969:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:8970:3: ruleURDFAttrSignedNumeric
            {
             before(grammarAccess.getDynamicsAccess().getFrictionURDFAttrSignedNumericParserRuleCall_3_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleURDFAttrSignedNumeric();

            state._fsp--;

             after(grammarAccess.getDynamicsAccess().getFrictionURDFAttrSignedNumericParserRuleCall_3_0_1_0()); 

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
    // $ANTLR end "rule__Dynamics__FrictionAssignment_3_0_1"


    // $ANTLR start "rule__Dynamics__DampingAssignment_3_1_1"
    // InternalMyDsl.g:8979:1: rule__Dynamics__DampingAssignment_3_1_1 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__Dynamics__DampingAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8983:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:8984:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:8984:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:8985:3: ruleURDFAttrSignedNumeric
            {
             before(grammarAccess.getDynamicsAccess().getDampingURDFAttrSignedNumericParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleURDFAttrSignedNumeric();

            state._fsp--;

             after(grammarAccess.getDynamicsAccess().getDampingURDFAttrSignedNumericParserRuleCall_3_1_1_0()); 

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
    // $ANTLR end "rule__Dynamics__DampingAssignment_3_1_1"


    // $ANTLR start "rule__SafetyController__NameAssignment_1"
    // InternalMyDsl.g:8994:1: rule__SafetyController__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SafetyController__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8998:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:8999:2: ( RULE_ID )
            {
            // InternalMyDsl.g:8999:2: ( RULE_ID )
            // InternalMyDsl.g:9000:3: RULE_ID
            {
             before(grammarAccess.getSafetyControllerAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSafetyControllerAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__SafetyController__NameAssignment_1"


    // $ANTLR start "rule__SafetyController__K_velocityAssignment_3"
    // InternalMyDsl.g:9009:1: rule__SafetyController__K_velocityAssignment_3 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__SafetyController__K_velocityAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9013:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:9014:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:9014:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:9015:3: ruleURDFAttrSignedNumeric
            {
             before(grammarAccess.getSafetyControllerAccess().getK_velocityURDFAttrSignedNumericParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleURDFAttrSignedNumeric();

            state._fsp--;

             after(grammarAccess.getSafetyControllerAccess().getK_velocityURDFAttrSignedNumericParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__SafetyController__K_velocityAssignment_3"


    // $ANTLR start "rule__SafetyController__K_positionAssignment_4_0_1"
    // InternalMyDsl.g:9024:1: rule__SafetyController__K_positionAssignment_4_0_1 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__SafetyController__K_positionAssignment_4_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9028:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:9029:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:9029:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:9030:3: ruleURDFAttrSignedNumeric
            {
             before(grammarAccess.getSafetyControllerAccess().getK_positionURDFAttrSignedNumericParserRuleCall_4_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleURDFAttrSignedNumeric();

            state._fsp--;

             after(grammarAccess.getSafetyControllerAccess().getK_positionURDFAttrSignedNumericParserRuleCall_4_0_1_0()); 

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
    // $ANTLR end "rule__SafetyController__K_positionAssignment_4_0_1"


    // $ANTLR start "rule__SafetyController__SoftLowerLimitAssignment_4_1_1"
    // InternalMyDsl.g:9039:1: rule__SafetyController__SoftLowerLimitAssignment_4_1_1 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__SafetyController__SoftLowerLimitAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9043:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:9044:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:9044:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:9045:3: ruleURDFAttrSignedNumeric
            {
             before(grammarAccess.getSafetyControllerAccess().getSoftLowerLimitURDFAttrSignedNumericParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleURDFAttrSignedNumeric();

            state._fsp--;

             after(grammarAccess.getSafetyControllerAccess().getSoftLowerLimitURDFAttrSignedNumericParserRuleCall_4_1_1_0()); 

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
    // $ANTLR end "rule__SafetyController__SoftLowerLimitAssignment_4_1_1"


    // $ANTLR start "rule__SafetyController__SoftUpperLimitAssignment_4_2_1"
    // InternalMyDsl.g:9054:1: rule__SafetyController__SoftUpperLimitAssignment_4_2_1 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__SafetyController__SoftUpperLimitAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9058:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:9059:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:9059:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:9060:3: ruleURDFAttrSignedNumeric
            {
             before(grammarAccess.getSafetyControllerAccess().getSoftUpperLimitURDFAttrSignedNumericParserRuleCall_4_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleURDFAttrSignedNumeric();

            state._fsp--;

             after(grammarAccess.getSafetyControllerAccess().getSoftUpperLimitURDFAttrSignedNumericParserRuleCall_4_2_1_0()); 

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
    // $ANTLR end "rule__SafetyController__SoftUpperLimitAssignment_4_2_1"


    // $ANTLR start "rule__URDFAttrSignedNumeric__ValueAssignment"
    // InternalMyDsl.g:9069:1: rule__URDFAttrSignedNumeric__ValueAssignment : ( ruleSIGNED_NUMERIC ) ;
    public final void rule__URDFAttrSignedNumeric__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9073:1: ( ( ruleSIGNED_NUMERIC ) )
            // InternalMyDsl.g:9074:2: ( ruleSIGNED_NUMERIC )
            {
            // InternalMyDsl.g:9074:2: ( ruleSIGNED_NUMERIC )
            // InternalMyDsl.g:9075:3: ruleSIGNED_NUMERIC
            {
             before(grammarAccess.getURDFAttrSignedNumericAccess().getValueSIGNED_NUMERICParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleSIGNED_NUMERIC();

            state._fsp--;

             after(grammarAccess.getURDFAttrSignedNumericAccess().getValueSIGNED_NUMERICParserRuleCall_0()); 

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
    // $ANTLR end "rule__URDFAttrSignedNumeric__ValueAssignment"


    // $ANTLR start "rule__URDFAttrFloat__ValueAssignment"
    // InternalMyDsl.g:9084:1: rule__URDFAttrFloat__ValueAssignment : ( ruleFLOAT ) ;
    public final void rule__URDFAttrFloat__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9088:1: ( ( ruleFLOAT ) )
            // InternalMyDsl.g:9089:2: ( ruleFLOAT )
            {
            // InternalMyDsl.g:9089:2: ( ruleFLOAT )
            // InternalMyDsl.g:9090:3: ruleFLOAT
            {
             before(grammarAccess.getURDFAttrFloatAccess().getValueFLOATParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getURDFAttrFloatAccess().getValueFLOATParserRuleCall_0()); 

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
    // $ANTLR end "rule__URDFAttrFloat__ValueAssignment"


    // $ANTLR start "rule__URDFAttrINT__ValueAssignment"
    // InternalMyDsl.g:9099:1: rule__URDFAttrINT__ValueAssignment : ( RULE_INT ) ;
    public final void rule__URDFAttrINT__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9103:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:9104:2: ( RULE_INT )
            {
            // InternalMyDsl.g:9104:2: ( RULE_INT )
            // InternalMyDsl.g:9105:3: RULE_INT
            {
             before(grammarAccess.getURDFAttrINTAccess().getValueINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getURDFAttrINTAccess().getValueINTTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__URDFAttrINT__ValueAssignment"


    // $ANTLR start "rule__URDFAttrNumeric__ValueAssignment"
    // InternalMyDsl.g:9114:1: rule__URDFAttrNumeric__ValueAssignment : ( ruleNUMERIC ) ;
    public final void rule__URDFAttrNumeric__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9118:1: ( ( ruleNUMERIC ) )
            // InternalMyDsl.g:9119:2: ( ruleNUMERIC )
            {
            // InternalMyDsl.g:9119:2: ( ruleNUMERIC )
            // InternalMyDsl.g:9120:3: ruleNUMERIC
            {
             before(grammarAccess.getURDFAttrNumericAccess().getValueNUMERICParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleNUMERIC();

            state._fsp--;

             after(grammarAccess.getURDFAttrNumericAccess().getValueNUMERICParserRuleCall_0()); 

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
    // $ANTLR end "rule__URDFAttrNumeric__ValueAssignment"


    // $ANTLR start "rule__URDFAttrSTRING__ValueAssignment"
    // InternalMyDsl.g:9129:1: rule__URDFAttrSTRING__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__URDFAttrSTRING__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9133:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:9134:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:9134:2: ( RULE_STRING )
            // InternalMyDsl.g:9135:3: RULE_STRING
            {
             before(grammarAccess.getURDFAttrSTRINGAccess().getValueSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getURDFAttrSTRINGAccess().getValueSTRINGTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__URDFAttrSTRING__ValueAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000004C0000L,0x0000000000000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000004C0002L,0x0000000000000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000000L,0x0000000007800000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0002002020000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0002002020000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0002002020080000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000020L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000020L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000004000000020L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0544000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x1800000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000020000000020L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000700000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0001000000000020L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0008000000000020L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0080000000000020L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0200000000000020L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x2000000000000020L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000010000000000L,0x0000000000024860L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000010000000002L,0x0000000000024860L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000020L,0x0000000000000080L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000600L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000600L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000020L,0x0000000000003000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000020L,0x0000000000018000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000022L,0x0000000000018000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000020L,0x0000000000040000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000000L,0x0000000000380000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000002L,0x0000000000380000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000001810L});

}