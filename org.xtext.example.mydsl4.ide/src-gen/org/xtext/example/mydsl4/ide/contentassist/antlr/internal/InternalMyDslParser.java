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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'+'", "'-'", "'fixed'", "'revolute'", "'prismatic'", "'continuous'", "'Robot'", "'Topology'", "'Link'", "'def'", "'reuse'", "'edit'", "'add'", "'.'", "'Inertial'", "'Inertia'", "'ixx'", "'ixy'", "'ixz'", "'iyy'", "'iyz'", "'izz'", "'Visual'", "'Geometry'", "'Material'", "'Origin'", "'x'", "'y'", "'z'", "'roll'", "'pitch'", "'yaw'", "'Mass'", "'massKilogram'", "'Collision'", "'Box'", "'height'", "'length'", "'width'", "'Cylinder'", "'radius'", "'Mesh'", "'pathToFile'", "'Sphere'", "'Texture'", "'Color'", "'red'", "'green'", "'blue'", "'alpha'", "'Joint'", "'ChildOf'", "'ParentOf'", "'Type'", "'Axis'", "'Limit'", "'effort'", "'velocity'", "'lower'", "'upper'", "'Calibration'", "'rising'", "'falling'", "'Dynamics'", "'friction'", "'damping'", "'SafetyController'", "'k_velocity'", "'k_position'", "'softLowerLimit'", "'softUpperLimit'", "'e'", "'->'", "'r->'", "'p->'", "'c->'"
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


    // $ANTLR start "entryRuleLink"
    // InternalMyDsl.g:153:1: entryRuleLink : ruleLink EOF ;
    public final void entryRuleLink() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleLink EOF )
            // InternalMyDsl.g:155:1: ruleLink EOF
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
    // InternalMyDsl.g:162:1: ruleLink : ( ( rule__Link__Group__0 ) ) ;
    public final void ruleLink() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__Link__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__Link__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__Link__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__Link__Group__0 )
            {
             before(grammarAccess.getLinkAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__Link__Group__0 )
            // InternalMyDsl.g:169:4: rule__Link__Group__0
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


    // $ANTLR start "entryRuleReuse"
    // InternalMyDsl.g:178:1: entryRuleReuse : ruleReuse EOF ;
    public final void entryRuleReuse() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleReuse EOF )
            // InternalMyDsl.g:180:1: ruleReuse EOF
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
    // InternalMyDsl.g:187:1: ruleReuse : ( ( rule__Reuse__Group__0 ) ) ;
    public final void ruleReuse() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__Reuse__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__Reuse__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__Reuse__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__Reuse__Group__0 )
            {
             before(grammarAccess.getReuseAccess().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__Reuse__Group__0 )
            // InternalMyDsl.g:194:4: rule__Reuse__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Reuse__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReuseAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleDotExpression"
    // InternalMyDsl.g:203:1: entryRuleDotExpression : ruleDotExpression EOF ;
    public final void entryRuleDotExpression() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleDotExpression EOF )
            // InternalMyDsl.g:205:1: ruleDotExpression EOF
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
    // InternalMyDsl.g:212:1: ruleDotExpression : ( ( rule__DotExpression__Group__0 ) ) ;
    public final void ruleDotExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__DotExpression__Group__0 ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__DotExpression__Group__0 ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__DotExpression__Group__0 ) )
            // InternalMyDsl.g:218:3: ( rule__DotExpression__Group__0 )
            {
             before(grammarAccess.getDotExpressionAccess().getGroup()); 
            // InternalMyDsl.g:219:3: ( rule__DotExpression__Group__0 )
            // InternalMyDsl.g:219:4: rule__DotExpression__Group__0
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
    // InternalMyDsl.g:228:1: entryRuleReUsableRef : ruleReUsableRef EOF ;
    public final void entryRuleReUsableRef() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleReUsableRef EOF )
            // InternalMyDsl.g:230:1: ruleReUsableRef EOF
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
    // InternalMyDsl.g:237:1: ruleReUsableRef : ( ( rule__ReUsableRef__Group__0 ) ) ;
    public final void ruleReUsableRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__ReUsableRef__Group__0 ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__ReUsableRef__Group__0 ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__ReUsableRef__Group__0 ) )
            // InternalMyDsl.g:243:3: ( rule__ReUsableRef__Group__0 )
            {
             before(grammarAccess.getReUsableRefAccess().getGroup()); 
            // InternalMyDsl.g:244:3: ( rule__ReUsableRef__Group__0 )
            // InternalMyDsl.g:244:4: rule__ReUsableRef__Group__0
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
    // InternalMyDsl.g:253:1: entryRuleInertial : ruleInertial EOF ;
    public final void entryRuleInertial() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleInertial EOF )
            // InternalMyDsl.g:255:1: ruleInertial EOF
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
    // InternalMyDsl.g:262:1: ruleInertial : ( ( rule__Inertial__Group__0 ) ) ;
    public final void ruleInertial() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__Inertial__Group__0 ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__Inertial__Group__0 ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__Inertial__Group__0 ) )
            // InternalMyDsl.g:268:3: ( rule__Inertial__Group__0 )
            {
             before(grammarAccess.getInertialAccess().getGroup()); 
            // InternalMyDsl.g:269:3: ( rule__Inertial__Group__0 )
            // InternalMyDsl.g:269:4: rule__Inertial__Group__0
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
    // InternalMyDsl.g:278:1: entryRuleInertia : ruleInertia EOF ;
    public final void entryRuleInertia() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( ruleInertia EOF )
            // InternalMyDsl.g:280:1: ruleInertia EOF
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
    // InternalMyDsl.g:287:1: ruleInertia : ( ( rule__Inertia__Group__0 ) ) ;
    public final void ruleInertia() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__Inertia__Group__0 ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__Inertia__Group__0 ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__Inertia__Group__0 ) )
            // InternalMyDsl.g:293:3: ( rule__Inertia__Group__0 )
            {
             before(grammarAccess.getInertiaAccess().getGroup()); 
            // InternalMyDsl.g:294:3: ( rule__Inertia__Group__0 )
            // InternalMyDsl.g:294:4: rule__Inertia__Group__0
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
    // InternalMyDsl.g:303:1: entryRuleVisual : ruleVisual EOF ;
    public final void entryRuleVisual() throws RecognitionException {
        try {
            // InternalMyDsl.g:304:1: ( ruleVisual EOF )
            // InternalMyDsl.g:305:1: ruleVisual EOF
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
    // InternalMyDsl.g:312:1: ruleVisual : ( ( rule__Visual__Group__0 ) ) ;
    public final void ruleVisual() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:2: ( ( ( rule__Visual__Group__0 ) ) )
            // InternalMyDsl.g:317:2: ( ( rule__Visual__Group__0 ) )
            {
            // InternalMyDsl.g:317:2: ( ( rule__Visual__Group__0 ) )
            // InternalMyDsl.g:318:3: ( rule__Visual__Group__0 )
            {
             before(grammarAccess.getVisualAccess().getGroup()); 
            // InternalMyDsl.g:319:3: ( rule__Visual__Group__0 )
            // InternalMyDsl.g:319:4: rule__Visual__Group__0
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
    // InternalMyDsl.g:328:1: entryRuleOrigin : ruleOrigin EOF ;
    public final void entryRuleOrigin() throws RecognitionException {
        try {
            // InternalMyDsl.g:329:1: ( ruleOrigin EOF )
            // InternalMyDsl.g:330:1: ruleOrigin EOF
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
    // InternalMyDsl.g:337:1: ruleOrigin : ( ( rule__Origin__Group__0 ) ) ;
    public final void ruleOrigin() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:341:2: ( ( ( rule__Origin__Group__0 ) ) )
            // InternalMyDsl.g:342:2: ( ( rule__Origin__Group__0 ) )
            {
            // InternalMyDsl.g:342:2: ( ( rule__Origin__Group__0 ) )
            // InternalMyDsl.g:343:3: ( rule__Origin__Group__0 )
            {
             before(grammarAccess.getOriginAccess().getGroup()); 
            // InternalMyDsl.g:344:3: ( rule__Origin__Group__0 )
            // InternalMyDsl.g:344:4: rule__Origin__Group__0
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
    // InternalMyDsl.g:353:1: entryRuleMass : ruleMass EOF ;
    public final void entryRuleMass() throws RecognitionException {
        try {
            // InternalMyDsl.g:354:1: ( ruleMass EOF )
            // InternalMyDsl.g:355:1: ruleMass EOF
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
    // InternalMyDsl.g:362:1: ruleMass : ( ( rule__Mass__Group__0 ) ) ;
    public final void ruleMass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:366:2: ( ( ( rule__Mass__Group__0 ) ) )
            // InternalMyDsl.g:367:2: ( ( rule__Mass__Group__0 ) )
            {
            // InternalMyDsl.g:367:2: ( ( rule__Mass__Group__0 ) )
            // InternalMyDsl.g:368:3: ( rule__Mass__Group__0 )
            {
             before(grammarAccess.getMassAccess().getGroup()); 
            // InternalMyDsl.g:369:3: ( rule__Mass__Group__0 )
            // InternalMyDsl.g:369:4: rule__Mass__Group__0
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
    // InternalMyDsl.g:378:1: entryRuleCollision : ruleCollision EOF ;
    public final void entryRuleCollision() throws RecognitionException {
        try {
            // InternalMyDsl.g:379:1: ( ruleCollision EOF )
            // InternalMyDsl.g:380:1: ruleCollision EOF
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
    // InternalMyDsl.g:387:1: ruleCollision : ( ( rule__Collision__Group__0 ) ) ;
    public final void ruleCollision() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:391:2: ( ( ( rule__Collision__Group__0 ) ) )
            // InternalMyDsl.g:392:2: ( ( rule__Collision__Group__0 ) )
            {
            // InternalMyDsl.g:392:2: ( ( rule__Collision__Group__0 ) )
            // InternalMyDsl.g:393:3: ( rule__Collision__Group__0 )
            {
             before(grammarAccess.getCollisionAccess().getGroup()); 
            // InternalMyDsl.g:394:3: ( rule__Collision__Group__0 )
            // InternalMyDsl.g:394:4: rule__Collision__Group__0
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
    // InternalMyDsl.g:403:1: entryRuleGeometry : ruleGeometry EOF ;
    public final void entryRuleGeometry() throws RecognitionException {
        try {
            // InternalMyDsl.g:404:1: ( ruleGeometry EOF )
            // InternalMyDsl.g:405:1: ruleGeometry EOF
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
    // InternalMyDsl.g:412:1: ruleGeometry : ( ( rule__Geometry__Alternatives ) ) ;
    public final void ruleGeometry() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:416:2: ( ( ( rule__Geometry__Alternatives ) ) )
            // InternalMyDsl.g:417:2: ( ( rule__Geometry__Alternatives ) )
            {
            // InternalMyDsl.g:417:2: ( ( rule__Geometry__Alternatives ) )
            // InternalMyDsl.g:418:3: ( rule__Geometry__Alternatives )
            {
             before(grammarAccess.getGeometryAccess().getAlternatives()); 
            // InternalMyDsl.g:419:3: ( rule__Geometry__Alternatives )
            // InternalMyDsl.g:419:4: rule__Geometry__Alternatives
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
    // InternalMyDsl.g:428:1: entryRuleBox : ruleBox EOF ;
    public final void entryRuleBox() throws RecognitionException {
        try {
            // InternalMyDsl.g:429:1: ( ruleBox EOF )
            // InternalMyDsl.g:430:1: ruleBox EOF
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
    // InternalMyDsl.g:437:1: ruleBox : ( ( rule__Box__Group__0 ) ) ;
    public final void ruleBox() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:441:2: ( ( ( rule__Box__Group__0 ) ) )
            // InternalMyDsl.g:442:2: ( ( rule__Box__Group__0 ) )
            {
            // InternalMyDsl.g:442:2: ( ( rule__Box__Group__0 ) )
            // InternalMyDsl.g:443:3: ( rule__Box__Group__0 )
            {
             before(grammarAccess.getBoxAccess().getGroup()); 
            // InternalMyDsl.g:444:3: ( rule__Box__Group__0 )
            // InternalMyDsl.g:444:4: rule__Box__Group__0
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
    // InternalMyDsl.g:453:1: entryRuleCylinder : ruleCylinder EOF ;
    public final void entryRuleCylinder() throws RecognitionException {
        try {
            // InternalMyDsl.g:454:1: ( ruleCylinder EOF )
            // InternalMyDsl.g:455:1: ruleCylinder EOF
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
    // InternalMyDsl.g:462:1: ruleCylinder : ( ( rule__Cylinder__Group__0 ) ) ;
    public final void ruleCylinder() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:466:2: ( ( ( rule__Cylinder__Group__0 ) ) )
            // InternalMyDsl.g:467:2: ( ( rule__Cylinder__Group__0 ) )
            {
            // InternalMyDsl.g:467:2: ( ( rule__Cylinder__Group__0 ) )
            // InternalMyDsl.g:468:3: ( rule__Cylinder__Group__0 )
            {
             before(grammarAccess.getCylinderAccess().getGroup()); 
            // InternalMyDsl.g:469:3: ( rule__Cylinder__Group__0 )
            // InternalMyDsl.g:469:4: rule__Cylinder__Group__0
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
    // InternalMyDsl.g:478:1: entryRuleMesh : ruleMesh EOF ;
    public final void entryRuleMesh() throws RecognitionException {
        try {
            // InternalMyDsl.g:479:1: ( ruleMesh EOF )
            // InternalMyDsl.g:480:1: ruleMesh EOF
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
    // InternalMyDsl.g:487:1: ruleMesh : ( ( rule__Mesh__Group__0 ) ) ;
    public final void ruleMesh() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:491:2: ( ( ( rule__Mesh__Group__0 ) ) )
            // InternalMyDsl.g:492:2: ( ( rule__Mesh__Group__0 ) )
            {
            // InternalMyDsl.g:492:2: ( ( rule__Mesh__Group__0 ) )
            // InternalMyDsl.g:493:3: ( rule__Mesh__Group__0 )
            {
             before(grammarAccess.getMeshAccess().getGroup()); 
            // InternalMyDsl.g:494:3: ( rule__Mesh__Group__0 )
            // InternalMyDsl.g:494:4: rule__Mesh__Group__0
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
    // InternalMyDsl.g:503:1: entryRuleSphere : ruleSphere EOF ;
    public final void entryRuleSphere() throws RecognitionException {
        try {
            // InternalMyDsl.g:504:1: ( ruleSphere EOF )
            // InternalMyDsl.g:505:1: ruleSphere EOF
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
    // InternalMyDsl.g:512:1: ruleSphere : ( ( rule__Sphere__Group__0 ) ) ;
    public final void ruleSphere() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:516:2: ( ( ( rule__Sphere__Group__0 ) ) )
            // InternalMyDsl.g:517:2: ( ( rule__Sphere__Group__0 ) )
            {
            // InternalMyDsl.g:517:2: ( ( rule__Sphere__Group__0 ) )
            // InternalMyDsl.g:518:3: ( rule__Sphere__Group__0 )
            {
             before(grammarAccess.getSphereAccess().getGroup()); 
            // InternalMyDsl.g:519:3: ( rule__Sphere__Group__0 )
            // InternalMyDsl.g:519:4: rule__Sphere__Group__0
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
    // InternalMyDsl.g:528:1: entryRuleMaterial : ruleMaterial EOF ;
    public final void entryRuleMaterial() throws RecognitionException {
        try {
            // InternalMyDsl.g:529:1: ( ruleMaterial EOF )
            // InternalMyDsl.g:530:1: ruleMaterial EOF
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
    // InternalMyDsl.g:537:1: ruleMaterial : ( ( rule__Material__Alternatives ) ) ;
    public final void ruleMaterial() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:541:2: ( ( ( rule__Material__Alternatives ) ) )
            // InternalMyDsl.g:542:2: ( ( rule__Material__Alternatives ) )
            {
            // InternalMyDsl.g:542:2: ( ( rule__Material__Alternatives ) )
            // InternalMyDsl.g:543:3: ( rule__Material__Alternatives )
            {
             before(grammarAccess.getMaterialAccess().getAlternatives()); 
            // InternalMyDsl.g:544:3: ( rule__Material__Alternatives )
            // InternalMyDsl.g:544:4: rule__Material__Alternatives
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
    // InternalMyDsl.g:553:1: entryRuleTexture : ruleTexture EOF ;
    public final void entryRuleTexture() throws RecognitionException {
        try {
            // InternalMyDsl.g:554:1: ( ruleTexture EOF )
            // InternalMyDsl.g:555:1: ruleTexture EOF
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
    // InternalMyDsl.g:562:1: ruleTexture : ( ( rule__Texture__Group__0 ) ) ;
    public final void ruleTexture() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:566:2: ( ( ( rule__Texture__Group__0 ) ) )
            // InternalMyDsl.g:567:2: ( ( rule__Texture__Group__0 ) )
            {
            // InternalMyDsl.g:567:2: ( ( rule__Texture__Group__0 ) )
            // InternalMyDsl.g:568:3: ( rule__Texture__Group__0 )
            {
             before(grammarAccess.getTextureAccess().getGroup()); 
            // InternalMyDsl.g:569:3: ( rule__Texture__Group__0 )
            // InternalMyDsl.g:569:4: rule__Texture__Group__0
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
    // InternalMyDsl.g:578:1: entryRuleColor : ruleColor EOF ;
    public final void entryRuleColor() throws RecognitionException {
        try {
            // InternalMyDsl.g:579:1: ( ruleColor EOF )
            // InternalMyDsl.g:580:1: ruleColor EOF
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
    // InternalMyDsl.g:587:1: ruleColor : ( ( rule__Color__Group__0 ) ) ;
    public final void ruleColor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:591:2: ( ( ( rule__Color__Group__0 ) ) )
            // InternalMyDsl.g:592:2: ( ( rule__Color__Group__0 ) )
            {
            // InternalMyDsl.g:592:2: ( ( rule__Color__Group__0 ) )
            // InternalMyDsl.g:593:3: ( rule__Color__Group__0 )
            {
             before(grammarAccess.getColorAccess().getGroup()); 
            // InternalMyDsl.g:594:3: ( rule__Color__Group__0 )
            // InternalMyDsl.g:594:4: rule__Color__Group__0
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
    // InternalMyDsl.g:603:1: entryRuleJoint : ruleJoint EOF ;
    public final void entryRuleJoint() throws RecognitionException {
        try {
            // InternalMyDsl.g:604:1: ( ruleJoint EOF )
            // InternalMyDsl.g:605:1: ruleJoint EOF
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
    // InternalMyDsl.g:612:1: ruleJoint : ( ( rule__Joint__Group__0 ) ) ;
    public final void ruleJoint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:616:2: ( ( ( rule__Joint__Group__0 ) ) )
            // InternalMyDsl.g:617:2: ( ( rule__Joint__Group__0 ) )
            {
            // InternalMyDsl.g:617:2: ( ( rule__Joint__Group__0 ) )
            // InternalMyDsl.g:618:3: ( rule__Joint__Group__0 )
            {
             before(grammarAccess.getJointAccess().getGroup()); 
            // InternalMyDsl.g:619:3: ( rule__Joint__Group__0 )
            // InternalMyDsl.g:619:4: rule__Joint__Group__0
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
    // InternalMyDsl.g:628:1: entryRuleAxis : ruleAxis EOF ;
    public final void entryRuleAxis() throws RecognitionException {
        try {
            // InternalMyDsl.g:629:1: ( ruleAxis EOF )
            // InternalMyDsl.g:630:1: ruleAxis EOF
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
    // InternalMyDsl.g:637:1: ruleAxis : ( ( rule__Axis__Group__0 ) ) ;
    public final void ruleAxis() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:641:2: ( ( ( rule__Axis__Group__0 ) ) )
            // InternalMyDsl.g:642:2: ( ( rule__Axis__Group__0 ) )
            {
            // InternalMyDsl.g:642:2: ( ( rule__Axis__Group__0 ) )
            // InternalMyDsl.g:643:3: ( rule__Axis__Group__0 )
            {
             before(grammarAccess.getAxisAccess().getGroup()); 
            // InternalMyDsl.g:644:3: ( rule__Axis__Group__0 )
            // InternalMyDsl.g:644:4: rule__Axis__Group__0
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
    // InternalMyDsl.g:653:1: entryRuleLimit : ruleLimit EOF ;
    public final void entryRuleLimit() throws RecognitionException {
        try {
            // InternalMyDsl.g:654:1: ( ruleLimit EOF )
            // InternalMyDsl.g:655:1: ruleLimit EOF
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
    // InternalMyDsl.g:662:1: ruleLimit : ( ( rule__Limit__Group__0 ) ) ;
    public final void ruleLimit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:666:2: ( ( ( rule__Limit__Group__0 ) ) )
            // InternalMyDsl.g:667:2: ( ( rule__Limit__Group__0 ) )
            {
            // InternalMyDsl.g:667:2: ( ( rule__Limit__Group__0 ) )
            // InternalMyDsl.g:668:3: ( rule__Limit__Group__0 )
            {
             before(grammarAccess.getLimitAccess().getGroup()); 
            // InternalMyDsl.g:669:3: ( rule__Limit__Group__0 )
            // InternalMyDsl.g:669:4: rule__Limit__Group__0
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
    // InternalMyDsl.g:678:1: entryRuleCalibration : ruleCalibration EOF ;
    public final void entryRuleCalibration() throws RecognitionException {
        try {
            // InternalMyDsl.g:679:1: ( ruleCalibration EOF )
            // InternalMyDsl.g:680:1: ruleCalibration EOF
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
    // InternalMyDsl.g:687:1: ruleCalibration : ( ( rule__Calibration__Group__0 ) ) ;
    public final void ruleCalibration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:691:2: ( ( ( rule__Calibration__Group__0 ) ) )
            // InternalMyDsl.g:692:2: ( ( rule__Calibration__Group__0 ) )
            {
            // InternalMyDsl.g:692:2: ( ( rule__Calibration__Group__0 ) )
            // InternalMyDsl.g:693:3: ( rule__Calibration__Group__0 )
            {
             before(grammarAccess.getCalibrationAccess().getGroup()); 
            // InternalMyDsl.g:694:3: ( rule__Calibration__Group__0 )
            // InternalMyDsl.g:694:4: rule__Calibration__Group__0
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
    // InternalMyDsl.g:703:1: entryRuleDynamics : ruleDynamics EOF ;
    public final void entryRuleDynamics() throws RecognitionException {
        try {
            // InternalMyDsl.g:704:1: ( ruleDynamics EOF )
            // InternalMyDsl.g:705:1: ruleDynamics EOF
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
    // InternalMyDsl.g:712:1: ruleDynamics : ( ( rule__Dynamics__Group__0 ) ) ;
    public final void ruleDynamics() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:716:2: ( ( ( rule__Dynamics__Group__0 ) ) )
            // InternalMyDsl.g:717:2: ( ( rule__Dynamics__Group__0 ) )
            {
            // InternalMyDsl.g:717:2: ( ( rule__Dynamics__Group__0 ) )
            // InternalMyDsl.g:718:3: ( rule__Dynamics__Group__0 )
            {
             before(grammarAccess.getDynamicsAccess().getGroup()); 
            // InternalMyDsl.g:719:3: ( rule__Dynamics__Group__0 )
            // InternalMyDsl.g:719:4: rule__Dynamics__Group__0
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
    // InternalMyDsl.g:728:1: entryRuleSafetyController : ruleSafetyController EOF ;
    public final void entryRuleSafetyController() throws RecognitionException {
        try {
            // InternalMyDsl.g:729:1: ( ruleSafetyController EOF )
            // InternalMyDsl.g:730:1: ruleSafetyController EOF
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
    // InternalMyDsl.g:737:1: ruleSafetyController : ( ( rule__SafetyController__Group__0 ) ) ;
    public final void ruleSafetyController() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:741:2: ( ( ( rule__SafetyController__Group__0 ) ) )
            // InternalMyDsl.g:742:2: ( ( rule__SafetyController__Group__0 ) )
            {
            // InternalMyDsl.g:742:2: ( ( rule__SafetyController__Group__0 ) )
            // InternalMyDsl.g:743:3: ( rule__SafetyController__Group__0 )
            {
             before(grammarAccess.getSafetyControllerAccess().getGroup()); 
            // InternalMyDsl.g:744:3: ( rule__SafetyController__Group__0 )
            // InternalMyDsl.g:744:4: rule__SafetyController__Group__0
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
    // InternalMyDsl.g:753:1: entryRuleURDFAttrSignedNumeric : ruleURDFAttrSignedNumeric EOF ;
    public final void entryRuleURDFAttrSignedNumeric() throws RecognitionException {
        try {
            // InternalMyDsl.g:754:1: ( ruleURDFAttrSignedNumeric EOF )
            // InternalMyDsl.g:755:1: ruleURDFAttrSignedNumeric EOF
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
    // InternalMyDsl.g:762:1: ruleURDFAttrSignedNumeric : ( ( rule__URDFAttrSignedNumeric__Group__0 ) ) ;
    public final void ruleURDFAttrSignedNumeric() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:766:2: ( ( ( rule__URDFAttrSignedNumeric__Group__0 ) ) )
            // InternalMyDsl.g:767:2: ( ( rule__URDFAttrSignedNumeric__Group__0 ) )
            {
            // InternalMyDsl.g:767:2: ( ( rule__URDFAttrSignedNumeric__Group__0 ) )
            // InternalMyDsl.g:768:3: ( rule__URDFAttrSignedNumeric__Group__0 )
            {
             before(grammarAccess.getURDFAttrSignedNumericAccess().getGroup()); 
            // InternalMyDsl.g:769:3: ( rule__URDFAttrSignedNumeric__Group__0 )
            // InternalMyDsl.g:769:4: rule__URDFAttrSignedNumeric__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__URDFAttrSignedNumeric__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getURDFAttrSignedNumericAccess().getGroup()); 

            }


            }

        }
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
    // InternalMyDsl.g:778:1: entryRuleURDFAttrFloat : ruleURDFAttrFloat EOF ;
    public final void entryRuleURDFAttrFloat() throws RecognitionException {
        try {
            // InternalMyDsl.g:779:1: ( ruleURDFAttrFloat EOF )
            // InternalMyDsl.g:780:1: ruleURDFAttrFloat EOF
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
    // InternalMyDsl.g:787:1: ruleURDFAttrFloat : ( ( rule__URDFAttrFloat__ValueAssignment ) ) ;
    public final void ruleURDFAttrFloat() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:791:2: ( ( ( rule__URDFAttrFloat__ValueAssignment ) ) )
            // InternalMyDsl.g:792:2: ( ( rule__URDFAttrFloat__ValueAssignment ) )
            {
            // InternalMyDsl.g:792:2: ( ( rule__URDFAttrFloat__ValueAssignment ) )
            // InternalMyDsl.g:793:3: ( rule__URDFAttrFloat__ValueAssignment )
            {
             before(grammarAccess.getURDFAttrFloatAccess().getValueAssignment()); 
            // InternalMyDsl.g:794:3: ( rule__URDFAttrFloat__ValueAssignment )
            // InternalMyDsl.g:794:4: rule__URDFAttrFloat__ValueAssignment
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
    // InternalMyDsl.g:803:1: entryRuleURDFAttrINT : ruleURDFAttrINT EOF ;
    public final void entryRuleURDFAttrINT() throws RecognitionException {
        try {
            // InternalMyDsl.g:804:1: ( ruleURDFAttrINT EOF )
            // InternalMyDsl.g:805:1: ruleURDFAttrINT EOF
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
    // InternalMyDsl.g:812:1: ruleURDFAttrINT : ( ( rule__URDFAttrINT__ValueAssignment ) ) ;
    public final void ruleURDFAttrINT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:816:2: ( ( ( rule__URDFAttrINT__ValueAssignment ) ) )
            // InternalMyDsl.g:817:2: ( ( rule__URDFAttrINT__ValueAssignment ) )
            {
            // InternalMyDsl.g:817:2: ( ( rule__URDFAttrINT__ValueAssignment ) )
            // InternalMyDsl.g:818:3: ( rule__URDFAttrINT__ValueAssignment )
            {
             before(grammarAccess.getURDFAttrINTAccess().getValueAssignment()); 
            // InternalMyDsl.g:819:3: ( rule__URDFAttrINT__ValueAssignment )
            // InternalMyDsl.g:819:4: rule__URDFAttrINT__ValueAssignment
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
    // InternalMyDsl.g:828:1: entryRuleURDFAttrNumeric : ruleURDFAttrNumeric EOF ;
    public final void entryRuleURDFAttrNumeric() throws RecognitionException {
        try {
            // InternalMyDsl.g:829:1: ( ruleURDFAttrNumeric EOF )
            // InternalMyDsl.g:830:1: ruleURDFAttrNumeric EOF
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
    // InternalMyDsl.g:837:1: ruleURDFAttrNumeric : ( ( rule__URDFAttrNumeric__ValueAssignment ) ) ;
    public final void ruleURDFAttrNumeric() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:841:2: ( ( ( rule__URDFAttrNumeric__ValueAssignment ) ) )
            // InternalMyDsl.g:842:2: ( ( rule__URDFAttrNumeric__ValueAssignment ) )
            {
            // InternalMyDsl.g:842:2: ( ( rule__URDFAttrNumeric__ValueAssignment ) )
            // InternalMyDsl.g:843:3: ( rule__URDFAttrNumeric__ValueAssignment )
            {
             before(grammarAccess.getURDFAttrNumericAccess().getValueAssignment()); 
            // InternalMyDsl.g:844:3: ( rule__URDFAttrNumeric__ValueAssignment )
            // InternalMyDsl.g:844:4: rule__URDFAttrNumeric__ValueAssignment
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
    // InternalMyDsl.g:853:1: entryRuleURDFAttrSTRING : ruleURDFAttrSTRING EOF ;
    public final void entryRuleURDFAttrSTRING() throws RecognitionException {
        try {
            // InternalMyDsl.g:854:1: ( ruleURDFAttrSTRING EOF )
            // InternalMyDsl.g:855:1: ruleURDFAttrSTRING EOF
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
    // InternalMyDsl.g:862:1: ruleURDFAttrSTRING : ( ( rule__URDFAttrSTRING__ValueAssignment ) ) ;
    public final void ruleURDFAttrSTRING() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:866:2: ( ( ( rule__URDFAttrSTRING__ValueAssignment ) ) )
            // InternalMyDsl.g:867:2: ( ( rule__URDFAttrSTRING__ValueAssignment ) )
            {
            // InternalMyDsl.g:867:2: ( ( rule__URDFAttrSTRING__ValueAssignment ) )
            // InternalMyDsl.g:868:3: ( rule__URDFAttrSTRING__ValueAssignment )
            {
             before(grammarAccess.getURDFAttrSTRINGAccess().getValueAssignment()); 
            // InternalMyDsl.g:869:3: ( rule__URDFAttrSTRING__ValueAssignment )
            // InternalMyDsl.g:869:4: rule__URDFAttrSTRING__ValueAssignment
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
    // InternalMyDsl.g:878:1: entryRuleFLOAT : ruleFLOAT EOF ;
    public final void entryRuleFLOAT() throws RecognitionException {
        try {
            // InternalMyDsl.g:879:1: ( ruleFLOAT EOF )
            // InternalMyDsl.g:880:1: ruleFLOAT EOF
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
    // InternalMyDsl.g:887:1: ruleFLOAT : ( ( rule__FLOAT__Group__0 ) ) ;
    public final void ruleFLOAT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:891:2: ( ( ( rule__FLOAT__Group__0 ) ) )
            // InternalMyDsl.g:892:2: ( ( rule__FLOAT__Group__0 ) )
            {
            // InternalMyDsl.g:892:2: ( ( rule__FLOAT__Group__0 ) )
            // InternalMyDsl.g:893:3: ( rule__FLOAT__Group__0 )
            {
             before(grammarAccess.getFLOATAccess().getGroup()); 
            // InternalMyDsl.g:894:3: ( rule__FLOAT__Group__0 )
            // InternalMyDsl.g:894:4: rule__FLOAT__Group__0
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
    // InternalMyDsl.g:903:1: entryRuleSCIENTIFIC : ruleSCIENTIFIC EOF ;
    public final void entryRuleSCIENTIFIC() throws RecognitionException {
        try {
            // InternalMyDsl.g:904:1: ( ruleSCIENTIFIC EOF )
            // InternalMyDsl.g:905:1: ruleSCIENTIFIC EOF
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
    // InternalMyDsl.g:912:1: ruleSCIENTIFIC : ( ( rule__SCIENTIFIC__Group__0 ) ) ;
    public final void ruleSCIENTIFIC() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:916:2: ( ( ( rule__SCIENTIFIC__Group__0 ) ) )
            // InternalMyDsl.g:917:2: ( ( rule__SCIENTIFIC__Group__0 ) )
            {
            // InternalMyDsl.g:917:2: ( ( rule__SCIENTIFIC__Group__0 ) )
            // InternalMyDsl.g:918:3: ( rule__SCIENTIFIC__Group__0 )
            {
             before(grammarAccess.getSCIENTIFICAccess().getGroup()); 
            // InternalMyDsl.g:919:3: ( rule__SCIENTIFIC__Group__0 )
            // InternalMyDsl.g:919:4: rule__SCIENTIFIC__Group__0
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
    // InternalMyDsl.g:928:1: entryRuleSIGNED_NUMERIC : ruleSIGNED_NUMERIC EOF ;
    public final void entryRuleSIGNED_NUMERIC() throws RecognitionException {
        try {
            // InternalMyDsl.g:929:1: ( ruleSIGNED_NUMERIC EOF )
            // InternalMyDsl.g:930:1: ruleSIGNED_NUMERIC EOF
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
    // InternalMyDsl.g:937:1: ruleSIGNED_NUMERIC : ( ( rule__SIGNED_NUMERIC__Group__0 ) ) ;
    public final void ruleSIGNED_NUMERIC() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:941:2: ( ( ( rule__SIGNED_NUMERIC__Group__0 ) ) )
            // InternalMyDsl.g:942:2: ( ( rule__SIGNED_NUMERIC__Group__0 ) )
            {
            // InternalMyDsl.g:942:2: ( ( rule__SIGNED_NUMERIC__Group__0 ) )
            // InternalMyDsl.g:943:3: ( rule__SIGNED_NUMERIC__Group__0 )
            {
             before(grammarAccess.getSIGNED_NUMERICAccess().getGroup()); 
            // InternalMyDsl.g:944:3: ( rule__SIGNED_NUMERIC__Group__0 )
            // InternalMyDsl.g:944:4: rule__SIGNED_NUMERIC__Group__0
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
    // InternalMyDsl.g:953:1: entryRuleNUMERIC : ruleNUMERIC EOF ;
    public final void entryRuleNUMERIC() throws RecognitionException {
        try {
            // InternalMyDsl.g:954:1: ( ruleNUMERIC EOF )
            // InternalMyDsl.g:955:1: ruleNUMERIC EOF
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
    // InternalMyDsl.g:962:1: ruleNUMERIC : ( ( rule__NUMERIC__Alternatives ) ) ;
    public final void ruleNUMERIC() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:966:2: ( ( ( rule__NUMERIC__Alternatives ) ) )
            // InternalMyDsl.g:967:2: ( ( rule__NUMERIC__Alternatives ) )
            {
            // InternalMyDsl.g:967:2: ( ( rule__NUMERIC__Alternatives ) )
            // InternalMyDsl.g:968:3: ( rule__NUMERIC__Alternatives )
            {
             before(grammarAccess.getNUMERICAccess().getAlternatives()); 
            // InternalMyDsl.g:969:3: ( rule__NUMERIC__Alternatives )
            // InternalMyDsl.g:969:4: rule__NUMERIC__Alternatives
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
    // InternalMyDsl.g:978:1: ruleJointType : ( ( rule__JointType__Alternatives ) ) ;
    public final void ruleJointType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:982:1: ( ( ( rule__JointType__Alternatives ) ) )
            // InternalMyDsl.g:983:2: ( ( rule__JointType__Alternatives ) )
            {
            // InternalMyDsl.g:983:2: ( ( rule__JointType__Alternatives ) )
            // InternalMyDsl.g:984:3: ( rule__JointType__Alternatives )
            {
             before(grammarAccess.getJointTypeAccess().getAlternatives()); 
            // InternalMyDsl.g:985:3: ( rule__JointType__Alternatives )
            // InternalMyDsl.g:985:4: rule__JointType__Alternatives
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
    // InternalMyDsl.g:993:1: rule__Robot__Alternatives_2 : ( ( ( rule__Robot__Group_2_0__0 ) ) | ( ( rule__Robot__LinksAssignment_2_1 ) ) | ( ( rule__Robot__JointAssignment_2_2 ) ) );
    public final void rule__Robot__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:997:1: ( ( ( rule__Robot__Group_2_0__0 ) ) | ( ( rule__Robot__LinksAssignment_2_1 ) ) | ( ( rule__Robot__JointAssignment_2_2 ) ) )
            int alt1=3;
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
            case 61:
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
                    // InternalMyDsl.g:998:2: ( ( rule__Robot__Group_2_0__0 ) )
                    {
                    // InternalMyDsl.g:998:2: ( ( rule__Robot__Group_2_0__0 ) )
                    // InternalMyDsl.g:999:3: ( rule__Robot__Group_2_0__0 )
                    {
                     before(grammarAccess.getRobotAccess().getGroup_2_0()); 
                    // InternalMyDsl.g:1000:3: ( rule__Robot__Group_2_0__0 )
                    // InternalMyDsl.g:1000:4: rule__Robot__Group_2_0__0
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
                    // InternalMyDsl.g:1004:2: ( ( rule__Robot__LinksAssignment_2_1 ) )
                    {
                    // InternalMyDsl.g:1004:2: ( ( rule__Robot__LinksAssignment_2_1 ) )
                    // InternalMyDsl.g:1005:3: ( rule__Robot__LinksAssignment_2_1 )
                    {
                     before(grammarAccess.getRobotAccess().getLinksAssignment_2_1()); 
                    // InternalMyDsl.g:1006:3: ( rule__Robot__LinksAssignment_2_1 )
                    // InternalMyDsl.g:1006:4: rule__Robot__LinksAssignment_2_1
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
                    // InternalMyDsl.g:1010:2: ( ( rule__Robot__JointAssignment_2_2 ) )
                    {
                    // InternalMyDsl.g:1010:2: ( ( rule__Robot__JointAssignment_2_2 ) )
                    // InternalMyDsl.g:1011:3: ( rule__Robot__JointAssignment_2_2 )
                    {
                     before(grammarAccess.getRobotAccess().getJointAssignment_2_2()); 
                    // InternalMyDsl.g:1012:3: ( rule__Robot__JointAssignment_2_2 )
                    // InternalMyDsl.g:1012:4: rule__Robot__JointAssignment_2_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Robot__JointAssignment_2_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getRobotAccess().getJointAssignment_2_2()); 

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
    // InternalMyDsl.g:1020:1: rule__JointRef__Alternatives : ( ( ( rule__JointRef__FixAssignment_0 ) ) | ( ( rule__JointRef__RevAssignment_1 ) ) | ( ( rule__JointRef__PrisAssignment_2 ) ) | ( ( rule__JointRef__ContAssignment_3 ) ) );
    public final void rule__JointRef__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1024:1: ( ( ( rule__JointRef__FixAssignment_0 ) ) | ( ( rule__JointRef__RevAssignment_1 ) ) | ( ( rule__JointRef__PrisAssignment_2 ) ) | ( ( rule__JointRef__ContAssignment_3 ) ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 83:
                {
                alt2=1;
                }
                break;
            case 84:
                {
                alt2=2;
                }
                break;
            case 85:
                {
                alt2=3;
                }
                break;
            case 86:
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
                    // InternalMyDsl.g:1025:2: ( ( rule__JointRef__FixAssignment_0 ) )
                    {
                    // InternalMyDsl.g:1025:2: ( ( rule__JointRef__FixAssignment_0 ) )
                    // InternalMyDsl.g:1026:3: ( rule__JointRef__FixAssignment_0 )
                    {
                     before(grammarAccess.getJointRefAccess().getFixAssignment_0()); 
                    // InternalMyDsl.g:1027:3: ( rule__JointRef__FixAssignment_0 )
                    // InternalMyDsl.g:1027:4: rule__JointRef__FixAssignment_0
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
                    // InternalMyDsl.g:1031:2: ( ( rule__JointRef__RevAssignment_1 ) )
                    {
                    // InternalMyDsl.g:1031:2: ( ( rule__JointRef__RevAssignment_1 ) )
                    // InternalMyDsl.g:1032:3: ( rule__JointRef__RevAssignment_1 )
                    {
                     before(grammarAccess.getJointRefAccess().getRevAssignment_1()); 
                    // InternalMyDsl.g:1033:3: ( rule__JointRef__RevAssignment_1 )
                    // InternalMyDsl.g:1033:4: rule__JointRef__RevAssignment_1
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
                    // InternalMyDsl.g:1037:2: ( ( rule__JointRef__PrisAssignment_2 ) )
                    {
                    // InternalMyDsl.g:1037:2: ( ( rule__JointRef__PrisAssignment_2 ) )
                    // InternalMyDsl.g:1038:3: ( rule__JointRef__PrisAssignment_2 )
                    {
                     before(grammarAccess.getJointRefAccess().getPrisAssignment_2()); 
                    // InternalMyDsl.g:1039:3: ( rule__JointRef__PrisAssignment_2 )
                    // InternalMyDsl.g:1039:4: rule__JointRef__PrisAssignment_2
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
                    // InternalMyDsl.g:1043:2: ( ( rule__JointRef__ContAssignment_3 ) )
                    {
                    // InternalMyDsl.g:1043:2: ( ( rule__JointRef__ContAssignment_3 ) )
                    // InternalMyDsl.g:1044:3: ( rule__JointRef__ContAssignment_3 )
                    {
                     before(grammarAccess.getJointRefAccess().getContAssignment_3()); 
                    // InternalMyDsl.g:1045:3: ( rule__JointRef__ContAssignment_3 )
                    // InternalMyDsl.g:1045:4: rule__JointRef__ContAssignment_3
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
    // InternalMyDsl.g:1053:1: rule__ReUseAble__Alternatives : ( ( ruleLink ) | ( ruleVisual ) | ( ruleInertial ) | ( ruleCollision ) );
    public final void rule__ReUseAble__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1057:1: ( ( ruleLink ) | ( ruleVisual ) | ( ruleInertial ) | ( ruleCollision ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt3=1;
                }
                break;
            case 33:
                {
                alt3=2;
                }
                break;
            case 25:
                {
                alt3=3;
                }
                break;
            case 45:
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
                    // InternalMyDsl.g:1058:2: ( ruleLink )
                    {
                    // InternalMyDsl.g:1058:2: ( ruleLink )
                    // InternalMyDsl.g:1059:3: ruleLink
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
                    // InternalMyDsl.g:1064:2: ( ruleVisual )
                    {
                    // InternalMyDsl.g:1064:2: ( ruleVisual )
                    // InternalMyDsl.g:1065:3: ruleVisual
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
                    // InternalMyDsl.g:1070:2: ( ruleInertial )
                    {
                    // InternalMyDsl.g:1070:2: ( ruleInertial )
                    // InternalMyDsl.g:1071:3: ruleInertial
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
                    // InternalMyDsl.g:1076:2: ( ruleCollision )
                    {
                    // InternalMyDsl.g:1076:2: ( ruleCollision )
                    // InternalMyDsl.g:1077:3: ruleCollision
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


    // $ANTLR start "rule__Link__Alternatives_3"
    // InternalMyDsl.g:1086:1: rule__Link__Alternatives_3 : ( ( ( rule__Link__Group_3_0__0 ) ) | ( ( rule__Link__Group_3_1__0 ) ) );
    public final void rule__Link__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1090:1: ( ( ( rule__Link__Group_3_0__0 ) ) | ( ( rule__Link__Group_3_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==20) ) {
                alt4=1;
            }
            else if ( (LA4_0==21) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:1091:2: ( ( rule__Link__Group_3_0__0 ) )
                    {
                    // InternalMyDsl.g:1091:2: ( ( rule__Link__Group_3_0__0 ) )
                    // InternalMyDsl.g:1092:3: ( rule__Link__Group_3_0__0 )
                    {
                     before(grammarAccess.getLinkAccess().getGroup_3_0()); 
                    // InternalMyDsl.g:1093:3: ( rule__Link__Group_3_0__0 )
                    // InternalMyDsl.g:1093:4: rule__Link__Group_3_0__0
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
                    // InternalMyDsl.g:1097:2: ( ( rule__Link__Group_3_1__0 ) )
                    {
                    // InternalMyDsl.g:1097:2: ( ( rule__Link__Group_3_1__0 ) )
                    // InternalMyDsl.g:1098:3: ( rule__Link__Group_3_1__0 )
                    {
                     before(grammarAccess.getLinkAccess().getGroup_3_1()); 
                    // InternalMyDsl.g:1099:3: ( rule__Link__Group_3_1__0 )
                    // InternalMyDsl.g:1099:4: rule__Link__Group_3_1__0
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
    // InternalMyDsl.g:1107:1: rule__Link__Alternatives_3_0_1 : ( ( ( rule__Link__InertialAssignment_3_0_1_0 ) ) | ( ( rule__Link__VisualAssignment_3_0_1_1 ) ) | ( ( rule__Link__CollisionAssignment_3_0_1_2 ) ) );
    public final void rule__Link__Alternatives_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1111:1: ( ( ( rule__Link__InertialAssignment_3_0_1_0 ) ) | ( ( rule__Link__VisualAssignment_3_0_1_1 ) ) | ( ( rule__Link__CollisionAssignment_3_0_1_2 ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt5=1;
                }
                break;
            case 33:
                {
                alt5=2;
                }
                break;
            case 45:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:1112:2: ( ( rule__Link__InertialAssignment_3_0_1_0 ) )
                    {
                    // InternalMyDsl.g:1112:2: ( ( rule__Link__InertialAssignment_3_0_1_0 ) )
                    // InternalMyDsl.g:1113:3: ( rule__Link__InertialAssignment_3_0_1_0 )
                    {
                     before(grammarAccess.getLinkAccess().getInertialAssignment_3_0_1_0()); 
                    // InternalMyDsl.g:1114:3: ( rule__Link__InertialAssignment_3_0_1_0 )
                    // InternalMyDsl.g:1114:4: rule__Link__InertialAssignment_3_0_1_0
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
                    // InternalMyDsl.g:1118:2: ( ( rule__Link__VisualAssignment_3_0_1_1 ) )
                    {
                    // InternalMyDsl.g:1118:2: ( ( rule__Link__VisualAssignment_3_0_1_1 ) )
                    // InternalMyDsl.g:1119:3: ( rule__Link__VisualAssignment_3_0_1_1 )
                    {
                     before(grammarAccess.getLinkAccess().getVisualAssignment_3_0_1_1()); 
                    // InternalMyDsl.g:1120:3: ( rule__Link__VisualAssignment_3_0_1_1 )
                    // InternalMyDsl.g:1120:4: rule__Link__VisualAssignment_3_0_1_1
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
                    // InternalMyDsl.g:1124:2: ( ( rule__Link__CollisionAssignment_3_0_1_2 ) )
                    {
                    // InternalMyDsl.g:1124:2: ( ( rule__Link__CollisionAssignment_3_0_1_2 ) )
                    // InternalMyDsl.g:1125:3: ( rule__Link__CollisionAssignment_3_0_1_2 )
                    {
                     before(grammarAccess.getLinkAccess().getCollisionAssignment_3_0_1_2()); 
                    // InternalMyDsl.g:1126:3: ( rule__Link__CollisionAssignment_3_0_1_2 )
                    // InternalMyDsl.g:1126:4: rule__Link__CollisionAssignment_3_0_1_2
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


    // $ANTLR start "rule__Reuse__Alternatives_1"
    // InternalMyDsl.g:1134:1: rule__Reuse__Alternatives_1 : ( ( ( rule__Reuse__Group_1_0__0 ) ) | ( ( rule__Reuse__Group_1_1__0 ) ) );
    public final void rule__Reuse__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1138:1: ( ( ( rule__Reuse__Group_1_0__0 ) ) | ( ( rule__Reuse__Group_1_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            else if ( (LA6_0==23) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:1139:2: ( ( rule__Reuse__Group_1_0__0 ) )
                    {
                    // InternalMyDsl.g:1139:2: ( ( rule__Reuse__Group_1_0__0 ) )
                    // InternalMyDsl.g:1140:3: ( rule__Reuse__Group_1_0__0 )
                    {
                     before(grammarAccess.getReuseAccess().getGroup_1_0()); 
                    // InternalMyDsl.g:1141:3: ( rule__Reuse__Group_1_0__0 )
                    // InternalMyDsl.g:1141:4: rule__Reuse__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Reuse__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getReuseAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1145:2: ( ( rule__Reuse__Group_1_1__0 ) )
                    {
                    // InternalMyDsl.g:1145:2: ( ( rule__Reuse__Group_1_1__0 ) )
                    // InternalMyDsl.g:1146:3: ( rule__Reuse__Group_1_1__0 )
                    {
                     before(grammarAccess.getReuseAccess().getGroup_1_1()); 
                    // InternalMyDsl.g:1147:3: ( rule__Reuse__Group_1_1__0 )
                    // InternalMyDsl.g:1147:4: rule__Reuse__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Reuse__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getReuseAccess().getGroup_1_1()); 

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
    // $ANTLR end "rule__Reuse__Alternatives_1"


    // $ANTLR start "rule__Geometry__Alternatives"
    // InternalMyDsl.g:1155:1: rule__Geometry__Alternatives : ( ( ruleBox ) | ( ruleCylinder ) | ( ruleMesh ) | ( ruleSphere ) );
    public final void rule__Geometry__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1159:1: ( ( ruleBox ) | ( ruleCylinder ) | ( ruleMesh ) | ( ruleSphere ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt7=1;
                }
                break;
            case 50:
                {
                alt7=2;
                }
                break;
            case 52:
                {
                alt7=3;
                }
                break;
            case 54:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:1160:2: ( ruleBox )
                    {
                    // InternalMyDsl.g:1160:2: ( ruleBox )
                    // InternalMyDsl.g:1161:3: ruleBox
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
                    // InternalMyDsl.g:1166:2: ( ruleCylinder )
                    {
                    // InternalMyDsl.g:1166:2: ( ruleCylinder )
                    // InternalMyDsl.g:1167:3: ruleCylinder
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
                    // InternalMyDsl.g:1172:2: ( ruleMesh )
                    {
                    // InternalMyDsl.g:1172:2: ( ruleMesh )
                    // InternalMyDsl.g:1173:3: ruleMesh
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
                    // InternalMyDsl.g:1178:2: ( ruleSphere )
                    {
                    // InternalMyDsl.g:1178:2: ( ruleSphere )
                    // InternalMyDsl.g:1179:3: ruleSphere
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
    // InternalMyDsl.g:1188:1: rule__Material__Alternatives : ( ( ruleTexture ) | ( ruleColor ) );
    public final void rule__Material__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1192:1: ( ( ruleTexture ) | ( ruleColor ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==55) ) {
                alt8=1;
            }
            else if ( (LA8_0==56) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:1193:2: ( ruleTexture )
                    {
                    // InternalMyDsl.g:1193:2: ( ruleTexture )
                    // InternalMyDsl.g:1194:3: ruleTexture
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
                    // InternalMyDsl.g:1199:2: ( ruleColor )
                    {
                    // InternalMyDsl.g:1199:2: ( ruleColor )
                    // InternalMyDsl.g:1200:3: ruleColor
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
    // InternalMyDsl.g:1209:1: rule__Joint__Alternatives_2 : ( ( ( rule__Joint__Group_2_0__0 ) ) | ( ( rule__Joint__Group_2_1__0 ) ) );
    public final void rule__Joint__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1213:1: ( ( ( rule__Joint__Group_2_0__0 ) ) | ( ( rule__Joint__Group_2_1__0 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            else if ( (LA9_0==21) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:1214:2: ( ( rule__Joint__Group_2_0__0 ) )
                    {
                    // InternalMyDsl.g:1214:2: ( ( rule__Joint__Group_2_0__0 ) )
                    // InternalMyDsl.g:1215:3: ( rule__Joint__Group_2_0__0 )
                    {
                     before(grammarAccess.getJointAccess().getGroup_2_0()); 
                    // InternalMyDsl.g:1216:3: ( rule__Joint__Group_2_0__0 )
                    // InternalMyDsl.g:1216:4: rule__Joint__Group_2_0__0
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
                    // InternalMyDsl.g:1220:2: ( ( rule__Joint__Group_2_1__0 ) )
                    {
                    // InternalMyDsl.g:1220:2: ( ( rule__Joint__Group_2_1__0 ) )
                    // InternalMyDsl.g:1221:3: ( rule__Joint__Group_2_1__0 )
                    {
                     before(grammarAccess.getJointAccess().getGroup_2_1()); 
                    // InternalMyDsl.g:1222:3: ( rule__Joint__Group_2_1__0 )
                    // InternalMyDsl.g:1222:4: rule__Joint__Group_2_1__0
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
    // InternalMyDsl.g:1230:1: rule__Joint__Alternatives_2_0_1 : ( ( ( rule__Joint__OriginAssignment_2_0_1_0 ) ) | ( ( rule__Joint__AxisAssignment_2_0_1_1 ) ) | ( ( rule__Joint__LimitAssignment_2_0_1_2 ) ) | ( ( rule__Joint__CalibrationAssignment_2_0_1_3 ) ) | ( ( rule__Joint__DynamicsAssignment_2_0_1_4 ) ) | ( ( rule__Joint__SafetycontrollerAssignment_2_0_1_5 ) ) );
    public final void rule__Joint__Alternatives_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1234:1: ( ( ( rule__Joint__OriginAssignment_2_0_1_0 ) ) | ( ( rule__Joint__AxisAssignment_2_0_1_1 ) ) | ( ( rule__Joint__LimitAssignment_2_0_1_2 ) ) | ( ( rule__Joint__CalibrationAssignment_2_0_1_3 ) ) | ( ( rule__Joint__DynamicsAssignment_2_0_1_4 ) ) | ( ( rule__Joint__SafetycontrollerAssignment_2_0_1_5 ) ) )
            int alt10=6;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt10=1;
                }
                break;
            case 65:
                {
                alt10=2;
                }
                break;
            case 66:
                {
                alt10=3;
                }
                break;
            case 71:
                {
                alt10=4;
                }
                break;
            case 74:
                {
                alt10=5;
                }
                break;
            case 77:
                {
                alt10=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:1235:2: ( ( rule__Joint__OriginAssignment_2_0_1_0 ) )
                    {
                    // InternalMyDsl.g:1235:2: ( ( rule__Joint__OriginAssignment_2_0_1_0 ) )
                    // InternalMyDsl.g:1236:3: ( rule__Joint__OriginAssignment_2_0_1_0 )
                    {
                     before(grammarAccess.getJointAccess().getOriginAssignment_2_0_1_0()); 
                    // InternalMyDsl.g:1237:3: ( rule__Joint__OriginAssignment_2_0_1_0 )
                    // InternalMyDsl.g:1237:4: rule__Joint__OriginAssignment_2_0_1_0
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
                    // InternalMyDsl.g:1241:2: ( ( rule__Joint__AxisAssignment_2_0_1_1 ) )
                    {
                    // InternalMyDsl.g:1241:2: ( ( rule__Joint__AxisAssignment_2_0_1_1 ) )
                    // InternalMyDsl.g:1242:3: ( rule__Joint__AxisAssignment_2_0_1_1 )
                    {
                     before(grammarAccess.getJointAccess().getAxisAssignment_2_0_1_1()); 
                    // InternalMyDsl.g:1243:3: ( rule__Joint__AxisAssignment_2_0_1_1 )
                    // InternalMyDsl.g:1243:4: rule__Joint__AxisAssignment_2_0_1_1
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
                    // InternalMyDsl.g:1247:2: ( ( rule__Joint__LimitAssignment_2_0_1_2 ) )
                    {
                    // InternalMyDsl.g:1247:2: ( ( rule__Joint__LimitAssignment_2_0_1_2 ) )
                    // InternalMyDsl.g:1248:3: ( rule__Joint__LimitAssignment_2_0_1_2 )
                    {
                     before(grammarAccess.getJointAccess().getLimitAssignment_2_0_1_2()); 
                    // InternalMyDsl.g:1249:3: ( rule__Joint__LimitAssignment_2_0_1_2 )
                    // InternalMyDsl.g:1249:4: rule__Joint__LimitAssignment_2_0_1_2
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
                    // InternalMyDsl.g:1253:2: ( ( rule__Joint__CalibrationAssignment_2_0_1_3 ) )
                    {
                    // InternalMyDsl.g:1253:2: ( ( rule__Joint__CalibrationAssignment_2_0_1_3 ) )
                    // InternalMyDsl.g:1254:3: ( rule__Joint__CalibrationAssignment_2_0_1_3 )
                    {
                     before(grammarAccess.getJointAccess().getCalibrationAssignment_2_0_1_3()); 
                    // InternalMyDsl.g:1255:3: ( rule__Joint__CalibrationAssignment_2_0_1_3 )
                    // InternalMyDsl.g:1255:4: rule__Joint__CalibrationAssignment_2_0_1_3
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
                    // InternalMyDsl.g:1259:2: ( ( rule__Joint__DynamicsAssignment_2_0_1_4 ) )
                    {
                    // InternalMyDsl.g:1259:2: ( ( rule__Joint__DynamicsAssignment_2_0_1_4 ) )
                    // InternalMyDsl.g:1260:3: ( rule__Joint__DynamicsAssignment_2_0_1_4 )
                    {
                     before(grammarAccess.getJointAccess().getDynamicsAssignment_2_0_1_4()); 
                    // InternalMyDsl.g:1261:3: ( rule__Joint__DynamicsAssignment_2_0_1_4 )
                    // InternalMyDsl.g:1261:4: rule__Joint__DynamicsAssignment_2_0_1_4
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
                    // InternalMyDsl.g:1265:2: ( ( rule__Joint__SafetycontrollerAssignment_2_0_1_5 ) )
                    {
                    // InternalMyDsl.g:1265:2: ( ( rule__Joint__SafetycontrollerAssignment_2_0_1_5 ) )
                    // InternalMyDsl.g:1266:3: ( rule__Joint__SafetycontrollerAssignment_2_0_1_5 )
                    {
                     before(grammarAccess.getJointAccess().getSafetycontrollerAssignment_2_0_1_5()); 
                    // InternalMyDsl.g:1267:3: ( rule__Joint__SafetycontrollerAssignment_2_0_1_5 )
                    // InternalMyDsl.g:1267:4: rule__Joint__SafetycontrollerAssignment_2_0_1_5
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


    // $ANTLR start "rule__SCIENTIFIC__Alternatives_2"
    // InternalMyDsl.g:1275:1: rule__SCIENTIFIC__Alternatives_2 : ( ( '+' ) | ( '-' ) );
    public final void rule__SCIENTIFIC__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1279:1: ( ( '+' ) | ( '-' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==11) ) {
                alt11=1;
            }
            else if ( (LA11_0==12) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:1280:2: ( '+' )
                    {
                    // InternalMyDsl.g:1280:2: ( '+' )
                    // InternalMyDsl.g:1281:3: '+'
                    {
                     before(grammarAccess.getSCIENTIFICAccess().getPlusSignKeyword_2_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getSCIENTIFICAccess().getPlusSignKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1286:2: ( '-' )
                    {
                    // InternalMyDsl.g:1286:2: ( '-' )
                    // InternalMyDsl.g:1287:3: '-'
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
    // InternalMyDsl.g:1296:1: rule__SIGNED_NUMERIC__Alternatives_1 : ( ( RULE_INT ) | ( ruleFLOAT ) | ( ruleSCIENTIFIC ) );
    public final void rule__SIGNED_NUMERIC__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1300:1: ( ( RULE_INT ) | ( ruleFLOAT ) | ( ruleSCIENTIFIC ) )
            int alt12=3;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_INT) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==EOF||(LA12_1>=18 && LA12_1<=19)||LA12_1==25||(LA12_1>=28 && LA12_1<=33)||(LA12_1>=35 && LA12_1<=36)||(LA12_1>=38 && LA12_1<=43)||LA12_1==45||LA12_1==61||(LA12_1>=65 && LA12_1<=66)||(LA12_1>=68 && LA12_1<=71)||(LA12_1>=73 && LA12_1<=74)||(LA12_1>=76 && LA12_1<=77)||(LA12_1>=79 && LA12_1<=81)) ) {
                    alt12=1;
                }
                else if ( (LA12_1==24) ) {
                    int LA12_3 = input.LA(3);

                    if ( (LA12_3==RULE_INT) ) {
                        int LA12_4 = input.LA(4);

                        if ( (LA12_4==82) ) {
                            alt12=3;
                        }
                        else if ( (LA12_4==EOF||(LA12_4>=18 && LA12_4<=19)||LA12_4==25||(LA12_4>=28 && LA12_4<=33)||(LA12_4>=35 && LA12_4<=36)||(LA12_4>=38 && LA12_4<=43)||LA12_4==45||LA12_4==61||(LA12_4>=65 && LA12_4<=66)||(LA12_4>=68 && LA12_4<=71)||(LA12_4>=73 && LA12_4<=74)||(LA12_4>=76 && LA12_4<=77)||(LA12_4>=79 && LA12_4<=81)) ) {
                            alt12=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 12, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:1301:2: ( RULE_INT )
                    {
                    // InternalMyDsl.g:1301:2: ( RULE_INT )
                    // InternalMyDsl.g:1302:3: RULE_INT
                    {
                     before(grammarAccess.getSIGNED_NUMERICAccess().getINTTerminalRuleCall_1_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getSIGNED_NUMERICAccess().getINTTerminalRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1307:2: ( ruleFLOAT )
                    {
                    // InternalMyDsl.g:1307:2: ( ruleFLOAT )
                    // InternalMyDsl.g:1308:3: ruleFLOAT
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
                    // InternalMyDsl.g:1313:2: ( ruleSCIENTIFIC )
                    {
                    // InternalMyDsl.g:1313:2: ( ruleSCIENTIFIC )
                    // InternalMyDsl.g:1314:3: ruleSCIENTIFIC
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
    // InternalMyDsl.g:1323:1: rule__NUMERIC__Alternatives : ( ( RULE_INT ) | ( ruleFLOAT ) | ( ruleSCIENTIFIC ) );
    public final void rule__NUMERIC__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1327:1: ( ( RULE_INT ) | ( ruleFLOAT ) | ( ruleSCIENTIFIC ) )
            int alt13=3;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_INT) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==EOF||(LA13_1>=18 && LA13_1<=19)||LA13_1==25||LA13_1==33||(LA13_1>=35 && LA13_1<=36)||(LA13_1>=45 && LA13_1<=46)||(LA13_1>=48 && LA13_1<=50)||LA13_1==52||LA13_1==54||LA13_1==61) ) {
                    alt13=1;
                }
                else if ( (LA13_1==24) ) {
                    int LA13_3 = input.LA(3);

                    if ( (LA13_3==RULE_INT) ) {
                        int LA13_4 = input.LA(4);

                        if ( (LA13_4==82) ) {
                            alt13=3;
                        }
                        else if ( (LA13_4==EOF||(LA13_4>=18 && LA13_4<=19)||LA13_4==25||LA13_4==33||(LA13_4>=35 && LA13_4<=36)||(LA13_4>=45 && LA13_4<=46)||(LA13_4>=48 && LA13_4<=50)||LA13_4==52||LA13_4==54||LA13_4==61) ) {
                            alt13=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 13, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:1328:2: ( RULE_INT )
                    {
                    // InternalMyDsl.g:1328:2: ( RULE_INT )
                    // InternalMyDsl.g:1329:3: RULE_INT
                    {
                     before(grammarAccess.getNUMERICAccess().getINTTerminalRuleCall_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getNUMERICAccess().getINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1334:2: ( ruleFLOAT )
                    {
                    // InternalMyDsl.g:1334:2: ( ruleFLOAT )
                    // InternalMyDsl.g:1335:3: ruleFLOAT
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
                    // InternalMyDsl.g:1340:2: ( ruleSCIENTIFIC )
                    {
                    // InternalMyDsl.g:1340:2: ( ruleSCIENTIFIC )
                    // InternalMyDsl.g:1341:3: ruleSCIENTIFIC
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
    // InternalMyDsl.g:1350:1: rule__JointType__Alternatives : ( ( ( 'fixed' ) ) | ( ( 'revolute' ) ) | ( ( 'prismatic' ) ) | ( ( 'continuous' ) ) );
    public final void rule__JointType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1354:1: ( ( ( 'fixed' ) ) | ( ( 'revolute' ) ) | ( ( 'prismatic' ) ) | ( ( 'continuous' ) ) )
            int alt14=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt14=1;
                }
                break;
            case 14:
                {
                alt14=2;
                }
                break;
            case 15:
                {
                alt14=3;
                }
                break;
            case 16:
                {
                alt14=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:1355:2: ( ( 'fixed' ) )
                    {
                    // InternalMyDsl.g:1355:2: ( ( 'fixed' ) )
                    // InternalMyDsl.g:1356:3: ( 'fixed' )
                    {
                     before(grammarAccess.getJointTypeAccess().getFixedEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:1357:3: ( 'fixed' )
                    // InternalMyDsl.g:1357:4: 'fixed'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getJointTypeAccess().getFixedEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1361:2: ( ( 'revolute' ) )
                    {
                    // InternalMyDsl.g:1361:2: ( ( 'revolute' ) )
                    // InternalMyDsl.g:1362:3: ( 'revolute' )
                    {
                     before(grammarAccess.getJointTypeAccess().getRevoluteEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:1363:3: ( 'revolute' )
                    // InternalMyDsl.g:1363:4: 'revolute'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getJointTypeAccess().getRevoluteEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1367:2: ( ( 'prismatic' ) )
                    {
                    // InternalMyDsl.g:1367:2: ( ( 'prismatic' ) )
                    // InternalMyDsl.g:1368:3: ( 'prismatic' )
                    {
                     before(grammarAccess.getJointTypeAccess().getPrismaticEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:1369:3: ( 'prismatic' )
                    // InternalMyDsl.g:1369:4: 'prismatic'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getJointTypeAccess().getPrismaticEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1373:2: ( ( 'continuous' ) )
                    {
                    // InternalMyDsl.g:1373:2: ( ( 'continuous' ) )
                    // InternalMyDsl.g:1374:3: ( 'continuous' )
                    {
                     before(grammarAccess.getJointTypeAccess().getContinuousEnumLiteralDeclaration_3()); 
                    // InternalMyDsl.g:1375:3: ( 'continuous' )
                    // InternalMyDsl.g:1375:4: 'continuous'
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
    // InternalMyDsl.g:1383:1: rule__Robot__Group__0 : rule__Robot__Group__0__Impl rule__Robot__Group__1 ;
    public final void rule__Robot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1387:1: ( rule__Robot__Group__0__Impl rule__Robot__Group__1 )
            // InternalMyDsl.g:1388:2: rule__Robot__Group__0__Impl rule__Robot__Group__1
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
    // InternalMyDsl.g:1395:1: rule__Robot__Group__0__Impl : ( 'Robot' ) ;
    public final void rule__Robot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1399:1: ( ( 'Robot' ) )
            // InternalMyDsl.g:1400:1: ( 'Robot' )
            {
            // InternalMyDsl.g:1400:1: ( 'Robot' )
            // InternalMyDsl.g:1401:2: 'Robot'
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
    // InternalMyDsl.g:1410:1: rule__Robot__Group__1 : rule__Robot__Group__1__Impl rule__Robot__Group__2 ;
    public final void rule__Robot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1414:1: ( rule__Robot__Group__1__Impl rule__Robot__Group__2 )
            // InternalMyDsl.g:1415:2: rule__Robot__Group__1__Impl rule__Robot__Group__2
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
    // InternalMyDsl.g:1422:1: rule__Robot__Group__1__Impl : ( ( rule__Robot__NameAssignment_1 ) ) ;
    public final void rule__Robot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1426:1: ( ( ( rule__Robot__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1427:1: ( ( rule__Robot__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1427:1: ( ( rule__Robot__NameAssignment_1 ) )
            // InternalMyDsl.g:1428:2: ( rule__Robot__NameAssignment_1 )
            {
             before(grammarAccess.getRobotAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1429:2: ( rule__Robot__NameAssignment_1 )
            // InternalMyDsl.g:1429:3: rule__Robot__NameAssignment_1
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
    // InternalMyDsl.g:1437:1: rule__Robot__Group__2 : rule__Robot__Group__2__Impl ;
    public final void rule__Robot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1441:1: ( rule__Robot__Group__2__Impl )
            // InternalMyDsl.g:1442:2: rule__Robot__Group__2__Impl
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
    // InternalMyDsl.g:1448:1: rule__Robot__Group__2__Impl : ( ( rule__Robot__Alternatives_2 )* ) ;
    public final void rule__Robot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1452:1: ( ( ( rule__Robot__Alternatives_2 )* ) )
            // InternalMyDsl.g:1453:1: ( ( rule__Robot__Alternatives_2 )* )
            {
            // InternalMyDsl.g:1453:1: ( ( rule__Robot__Alternatives_2 )* )
            // InternalMyDsl.g:1454:2: ( rule__Robot__Alternatives_2 )*
            {
             before(grammarAccess.getRobotAccess().getAlternatives_2()); 
            // InternalMyDsl.g:1455:2: ( rule__Robot__Alternatives_2 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=18 && LA15_0<=19)||LA15_0==61) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMyDsl.g:1455:3: rule__Robot__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Robot__Alternatives_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalMyDsl.g:1464:1: rule__Robot__Group_2_0__0 : rule__Robot__Group_2_0__0__Impl rule__Robot__Group_2_0__1 ;
    public final void rule__Robot__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1468:1: ( rule__Robot__Group_2_0__0__Impl rule__Robot__Group_2_0__1 )
            // InternalMyDsl.g:1469:2: rule__Robot__Group_2_0__0__Impl rule__Robot__Group_2_0__1
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
    // InternalMyDsl.g:1476:1: rule__Robot__Group_2_0__0__Impl : ( 'Topology' ) ;
    public final void rule__Robot__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1480:1: ( ( 'Topology' ) )
            // InternalMyDsl.g:1481:1: ( 'Topology' )
            {
            // InternalMyDsl.g:1481:1: ( 'Topology' )
            // InternalMyDsl.g:1482:2: 'Topology'
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
    // InternalMyDsl.g:1491:1: rule__Robot__Group_2_0__1 : rule__Robot__Group_2_0__1__Impl ;
    public final void rule__Robot__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1495:1: ( rule__Robot__Group_2_0__1__Impl )
            // InternalMyDsl.g:1496:2: rule__Robot__Group_2_0__1__Impl
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
    // InternalMyDsl.g:1502:1: rule__Robot__Group_2_0__1__Impl : ( ( rule__Robot__TopologiesAssignment_2_0_1 ) ) ;
    public final void rule__Robot__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1506:1: ( ( ( rule__Robot__TopologiesAssignment_2_0_1 ) ) )
            // InternalMyDsl.g:1507:1: ( ( rule__Robot__TopologiesAssignment_2_0_1 ) )
            {
            // InternalMyDsl.g:1507:1: ( ( rule__Robot__TopologiesAssignment_2_0_1 ) )
            // InternalMyDsl.g:1508:2: ( rule__Robot__TopologiesAssignment_2_0_1 )
            {
             before(grammarAccess.getRobotAccess().getTopologiesAssignment_2_0_1()); 
            // InternalMyDsl.g:1509:2: ( rule__Robot__TopologiesAssignment_2_0_1 )
            // InternalMyDsl.g:1509:3: rule__Robot__TopologiesAssignment_2_0_1
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
    // InternalMyDsl.g:1518:1: rule__Topology__Group__0 : rule__Topology__Group__0__Impl rule__Topology__Group__1 ;
    public final void rule__Topology__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1522:1: ( rule__Topology__Group__0__Impl rule__Topology__Group__1 )
            // InternalMyDsl.g:1523:2: rule__Topology__Group__0__Impl rule__Topology__Group__1
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
    // InternalMyDsl.g:1530:1: rule__Topology__Group__0__Impl : ( ( rule__Topology__ParentAssignment_0 ) ) ;
    public final void rule__Topology__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1534:1: ( ( ( rule__Topology__ParentAssignment_0 ) ) )
            // InternalMyDsl.g:1535:1: ( ( rule__Topology__ParentAssignment_0 ) )
            {
            // InternalMyDsl.g:1535:1: ( ( rule__Topology__ParentAssignment_0 ) )
            // InternalMyDsl.g:1536:2: ( rule__Topology__ParentAssignment_0 )
            {
             before(grammarAccess.getTopologyAccess().getParentAssignment_0()); 
            // InternalMyDsl.g:1537:2: ( rule__Topology__ParentAssignment_0 )
            // InternalMyDsl.g:1537:3: rule__Topology__ParentAssignment_0
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
    // InternalMyDsl.g:1545:1: rule__Topology__Group__1 : rule__Topology__Group__1__Impl ;
    public final void rule__Topology__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1549:1: ( rule__Topology__Group__1__Impl )
            // InternalMyDsl.g:1550:2: rule__Topology__Group__1__Impl
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
    // InternalMyDsl.g:1556:1: rule__Topology__Group__1__Impl : ( ( rule__Topology__Group_1__0 )? ) ;
    public final void rule__Topology__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1560:1: ( ( ( rule__Topology__Group_1__0 )? ) )
            // InternalMyDsl.g:1561:1: ( ( rule__Topology__Group_1__0 )? )
            {
            // InternalMyDsl.g:1561:1: ( ( rule__Topology__Group_1__0 )? )
            // InternalMyDsl.g:1562:2: ( rule__Topology__Group_1__0 )?
            {
             before(grammarAccess.getTopologyAccess().getGroup_1()); 
            // InternalMyDsl.g:1563:2: ( rule__Topology__Group_1__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=83 && LA16_0<=86)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:1563:3: rule__Topology__Group_1__0
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
    // InternalMyDsl.g:1572:1: rule__Topology__Group_1__0 : rule__Topology__Group_1__0__Impl rule__Topology__Group_1__1 ;
    public final void rule__Topology__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1576:1: ( rule__Topology__Group_1__0__Impl rule__Topology__Group_1__1 )
            // InternalMyDsl.g:1577:2: rule__Topology__Group_1__0__Impl rule__Topology__Group_1__1
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
    // InternalMyDsl.g:1584:1: rule__Topology__Group_1__0__Impl : ( ( rule__Topology__JointAssignment_1_0 ) ) ;
    public final void rule__Topology__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1588:1: ( ( ( rule__Topology__JointAssignment_1_0 ) ) )
            // InternalMyDsl.g:1589:1: ( ( rule__Topology__JointAssignment_1_0 ) )
            {
            // InternalMyDsl.g:1589:1: ( ( rule__Topology__JointAssignment_1_0 ) )
            // InternalMyDsl.g:1590:2: ( rule__Topology__JointAssignment_1_0 )
            {
             before(grammarAccess.getTopologyAccess().getJointAssignment_1_0()); 
            // InternalMyDsl.g:1591:2: ( rule__Topology__JointAssignment_1_0 )
            // InternalMyDsl.g:1591:3: rule__Topology__JointAssignment_1_0
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
    // InternalMyDsl.g:1599:1: rule__Topology__Group_1__1 : rule__Topology__Group_1__1__Impl ;
    public final void rule__Topology__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1603:1: ( rule__Topology__Group_1__1__Impl )
            // InternalMyDsl.g:1604:2: rule__Topology__Group_1__1__Impl
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
    // InternalMyDsl.g:1610:1: rule__Topology__Group_1__1__Impl : ( ( rule__Topology__ChildAssignment_1_1 ) ) ;
    public final void rule__Topology__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1614:1: ( ( ( rule__Topology__ChildAssignment_1_1 ) ) )
            // InternalMyDsl.g:1615:1: ( ( rule__Topology__ChildAssignment_1_1 ) )
            {
            // InternalMyDsl.g:1615:1: ( ( rule__Topology__ChildAssignment_1_1 ) )
            // InternalMyDsl.g:1616:2: ( rule__Topology__ChildAssignment_1_1 )
            {
             before(grammarAccess.getTopologyAccess().getChildAssignment_1_1()); 
            // InternalMyDsl.g:1617:2: ( rule__Topology__ChildAssignment_1_1 )
            // InternalMyDsl.g:1617:3: rule__Topology__ChildAssignment_1_1
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
    // InternalMyDsl.g:1626:1: rule__Link__Group__0 : rule__Link__Group__0__Impl rule__Link__Group__1 ;
    public final void rule__Link__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1630:1: ( rule__Link__Group__0__Impl rule__Link__Group__1 )
            // InternalMyDsl.g:1631:2: rule__Link__Group__0__Impl rule__Link__Group__1
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
    // InternalMyDsl.g:1638:1: rule__Link__Group__0__Impl : ( () ) ;
    public final void rule__Link__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1642:1: ( ( () ) )
            // InternalMyDsl.g:1643:1: ( () )
            {
            // InternalMyDsl.g:1643:1: ( () )
            // InternalMyDsl.g:1644:2: ()
            {
             before(grammarAccess.getLinkAccess().getLinkAction_0()); 
            // InternalMyDsl.g:1645:2: ()
            // InternalMyDsl.g:1645:3: 
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
    // InternalMyDsl.g:1653:1: rule__Link__Group__1 : rule__Link__Group__1__Impl rule__Link__Group__2 ;
    public final void rule__Link__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1657:1: ( rule__Link__Group__1__Impl rule__Link__Group__2 )
            // InternalMyDsl.g:1658:2: rule__Link__Group__1__Impl rule__Link__Group__2
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
    // InternalMyDsl.g:1665:1: rule__Link__Group__1__Impl : ( 'Link' ) ;
    public final void rule__Link__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1669:1: ( ( 'Link' ) )
            // InternalMyDsl.g:1670:1: ( 'Link' )
            {
            // InternalMyDsl.g:1670:1: ( 'Link' )
            // InternalMyDsl.g:1671:2: 'Link'
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
    // InternalMyDsl.g:1680:1: rule__Link__Group__2 : rule__Link__Group__2__Impl rule__Link__Group__3 ;
    public final void rule__Link__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1684:1: ( rule__Link__Group__2__Impl rule__Link__Group__3 )
            // InternalMyDsl.g:1685:2: rule__Link__Group__2__Impl rule__Link__Group__3
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
    // InternalMyDsl.g:1692:1: rule__Link__Group__2__Impl : ( ( rule__Link__NameAssignment_2 ) ) ;
    public final void rule__Link__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1696:1: ( ( ( rule__Link__NameAssignment_2 ) ) )
            // InternalMyDsl.g:1697:1: ( ( rule__Link__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:1697:1: ( ( rule__Link__NameAssignment_2 ) )
            // InternalMyDsl.g:1698:2: ( rule__Link__NameAssignment_2 )
            {
             before(grammarAccess.getLinkAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:1699:2: ( rule__Link__NameAssignment_2 )
            // InternalMyDsl.g:1699:3: rule__Link__NameAssignment_2
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
    // InternalMyDsl.g:1707:1: rule__Link__Group__3 : rule__Link__Group__3__Impl ;
    public final void rule__Link__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1711:1: ( rule__Link__Group__3__Impl )
            // InternalMyDsl.g:1712:2: rule__Link__Group__3__Impl
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
    // InternalMyDsl.g:1718:1: rule__Link__Group__3__Impl : ( ( rule__Link__Alternatives_3 )? ) ;
    public final void rule__Link__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1722:1: ( ( ( rule__Link__Alternatives_3 )? ) )
            // InternalMyDsl.g:1723:1: ( ( rule__Link__Alternatives_3 )? )
            {
            // InternalMyDsl.g:1723:1: ( ( rule__Link__Alternatives_3 )? )
            // InternalMyDsl.g:1724:2: ( rule__Link__Alternatives_3 )?
            {
             before(grammarAccess.getLinkAccess().getAlternatives_3()); 
            // InternalMyDsl.g:1725:2: ( rule__Link__Alternatives_3 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=20 && LA17_0<=21)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:1725:3: rule__Link__Alternatives_3
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
    // InternalMyDsl.g:1734:1: rule__Link__Group_3_0__0 : rule__Link__Group_3_0__0__Impl rule__Link__Group_3_0__1 ;
    public final void rule__Link__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1738:1: ( rule__Link__Group_3_0__0__Impl rule__Link__Group_3_0__1 )
            // InternalMyDsl.g:1739:2: rule__Link__Group_3_0__0__Impl rule__Link__Group_3_0__1
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
    // InternalMyDsl.g:1746:1: rule__Link__Group_3_0__0__Impl : ( 'def' ) ;
    public final void rule__Link__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1750:1: ( ( 'def' ) )
            // InternalMyDsl.g:1751:1: ( 'def' )
            {
            // InternalMyDsl.g:1751:1: ( 'def' )
            // InternalMyDsl.g:1752:2: 'def'
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
    // InternalMyDsl.g:1761:1: rule__Link__Group_3_0__1 : rule__Link__Group_3_0__1__Impl ;
    public final void rule__Link__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1765:1: ( rule__Link__Group_3_0__1__Impl )
            // InternalMyDsl.g:1766:2: rule__Link__Group_3_0__1__Impl
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
    // InternalMyDsl.g:1772:1: rule__Link__Group_3_0__1__Impl : ( ( rule__Link__Alternatives_3_0_1 )* ) ;
    public final void rule__Link__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1776:1: ( ( ( rule__Link__Alternatives_3_0_1 )* ) )
            // InternalMyDsl.g:1777:1: ( ( rule__Link__Alternatives_3_0_1 )* )
            {
            // InternalMyDsl.g:1777:1: ( ( rule__Link__Alternatives_3_0_1 )* )
            // InternalMyDsl.g:1778:2: ( rule__Link__Alternatives_3_0_1 )*
            {
             before(grammarAccess.getLinkAccess().getAlternatives_3_0_1()); 
            // InternalMyDsl.g:1779:2: ( rule__Link__Alternatives_3_0_1 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==25||LA18_0==33||LA18_0==45) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMyDsl.g:1779:3: rule__Link__Alternatives_3_0_1
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Link__Alternatives_3_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getLinkAccess().getAlternatives_3_0_1()); 

            }


            }

        }
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
    // InternalMyDsl.g:1788:1: rule__Link__Group_3_1__0 : rule__Link__Group_3_1__0__Impl rule__Link__Group_3_1__1 ;
    public final void rule__Link__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1792:1: ( rule__Link__Group_3_1__0__Impl rule__Link__Group_3_1__1 )
            // InternalMyDsl.g:1793:2: rule__Link__Group_3_1__0__Impl rule__Link__Group_3_1__1
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
    // InternalMyDsl.g:1800:1: rule__Link__Group_3_1__0__Impl : ( 'reuse' ) ;
    public final void rule__Link__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1804:1: ( ( 'reuse' ) )
            // InternalMyDsl.g:1805:1: ( 'reuse' )
            {
            // InternalMyDsl.g:1805:1: ( 'reuse' )
            // InternalMyDsl.g:1806:2: 'reuse'
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
    // InternalMyDsl.g:1815:1: rule__Link__Group_3_1__1 : rule__Link__Group_3_1__1__Impl rule__Link__Group_3_1__2 ;
    public final void rule__Link__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1819:1: ( rule__Link__Group_3_1__1__Impl rule__Link__Group_3_1__2 )
            // InternalMyDsl.g:1820:2: rule__Link__Group_3_1__1__Impl rule__Link__Group_3_1__2
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
    // InternalMyDsl.g:1827:1: rule__Link__Group_3_1__1__Impl : ( ( rule__Link__LinkAssignment_3_1_1 ) ) ;
    public final void rule__Link__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1831:1: ( ( ( rule__Link__LinkAssignment_3_1_1 ) ) )
            // InternalMyDsl.g:1832:1: ( ( rule__Link__LinkAssignment_3_1_1 ) )
            {
            // InternalMyDsl.g:1832:1: ( ( rule__Link__LinkAssignment_3_1_1 ) )
            // InternalMyDsl.g:1833:2: ( rule__Link__LinkAssignment_3_1_1 )
            {
             before(grammarAccess.getLinkAccess().getLinkAssignment_3_1_1()); 
            // InternalMyDsl.g:1834:2: ( rule__Link__LinkAssignment_3_1_1 )
            // InternalMyDsl.g:1834:3: rule__Link__LinkAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Link__LinkAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getLinkAccess().getLinkAssignment_3_1_1()); 

            }


            }

        }
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
    // InternalMyDsl.g:1842:1: rule__Link__Group_3_1__2 : rule__Link__Group_3_1__2__Impl ;
    public final void rule__Link__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1846:1: ( rule__Link__Group_3_1__2__Impl )
            // InternalMyDsl.g:1847:2: rule__Link__Group_3_1__2__Impl
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
    // InternalMyDsl.g:1853:1: rule__Link__Group_3_1__2__Impl : ( ( rule__Link__ReuseAssignment_3_1_2 ) ) ;
    public final void rule__Link__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1857:1: ( ( ( rule__Link__ReuseAssignment_3_1_2 ) ) )
            // InternalMyDsl.g:1858:1: ( ( rule__Link__ReuseAssignment_3_1_2 ) )
            {
            // InternalMyDsl.g:1858:1: ( ( rule__Link__ReuseAssignment_3_1_2 ) )
            // InternalMyDsl.g:1859:2: ( rule__Link__ReuseAssignment_3_1_2 )
            {
             before(grammarAccess.getLinkAccess().getReuseAssignment_3_1_2()); 
            // InternalMyDsl.g:1860:2: ( rule__Link__ReuseAssignment_3_1_2 )
            // InternalMyDsl.g:1860:3: rule__Link__ReuseAssignment_3_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Link__ReuseAssignment_3_1_2();

            state._fsp--;


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


    // $ANTLR start "rule__Reuse__Group__0"
    // InternalMyDsl.g:1869:1: rule__Reuse__Group__0 : rule__Reuse__Group__0__Impl rule__Reuse__Group__1 ;
    public final void rule__Reuse__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1873:1: ( rule__Reuse__Group__0__Impl rule__Reuse__Group__1 )
            // InternalMyDsl.g:1874:2: rule__Reuse__Group__0__Impl rule__Reuse__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Reuse__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reuse__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reuse__Group__0"


    // $ANTLR start "rule__Reuse__Group__0__Impl"
    // InternalMyDsl.g:1881:1: rule__Reuse__Group__0__Impl : ( () ) ;
    public final void rule__Reuse__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1885:1: ( ( () ) )
            // InternalMyDsl.g:1886:1: ( () )
            {
            // InternalMyDsl.g:1886:1: ( () )
            // InternalMyDsl.g:1887:2: ()
            {
             before(grammarAccess.getReuseAccess().getReuseAction_0()); 
            // InternalMyDsl.g:1888:2: ()
            // InternalMyDsl.g:1888:3: 
            {
            }

             after(grammarAccess.getReuseAccess().getReuseAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reuse__Group__0__Impl"


    // $ANTLR start "rule__Reuse__Group__1"
    // InternalMyDsl.g:1896:1: rule__Reuse__Group__1 : rule__Reuse__Group__1__Impl ;
    public final void rule__Reuse__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1900:1: ( rule__Reuse__Group__1__Impl )
            // InternalMyDsl.g:1901:2: rule__Reuse__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Reuse__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reuse__Group__1"


    // $ANTLR start "rule__Reuse__Group__1__Impl"
    // InternalMyDsl.g:1907:1: rule__Reuse__Group__1__Impl : ( ( rule__Reuse__Alternatives_1 )? ) ;
    public final void rule__Reuse__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1911:1: ( ( ( rule__Reuse__Alternatives_1 )? ) )
            // InternalMyDsl.g:1912:1: ( ( rule__Reuse__Alternatives_1 )? )
            {
            // InternalMyDsl.g:1912:1: ( ( rule__Reuse__Alternatives_1 )? )
            // InternalMyDsl.g:1913:2: ( rule__Reuse__Alternatives_1 )?
            {
             before(grammarAccess.getReuseAccess().getAlternatives_1()); 
            // InternalMyDsl.g:1914:2: ( rule__Reuse__Alternatives_1 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=22 && LA19_0<=23)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyDsl.g:1914:3: rule__Reuse__Alternatives_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Reuse__Alternatives_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getReuseAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reuse__Group__1__Impl"


    // $ANTLR start "rule__Reuse__Group_1_0__0"
    // InternalMyDsl.g:1923:1: rule__Reuse__Group_1_0__0 : rule__Reuse__Group_1_0__0__Impl rule__Reuse__Group_1_0__1 ;
    public final void rule__Reuse__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1927:1: ( rule__Reuse__Group_1_0__0__Impl rule__Reuse__Group_1_0__1 )
            // InternalMyDsl.g:1928:2: rule__Reuse__Group_1_0__0__Impl rule__Reuse__Group_1_0__1
            {
            pushFollow(FOLLOW_3);
            rule__Reuse__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reuse__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reuse__Group_1_0__0"


    // $ANTLR start "rule__Reuse__Group_1_0__0__Impl"
    // InternalMyDsl.g:1935:1: rule__Reuse__Group_1_0__0__Impl : ( 'edit' ) ;
    public final void rule__Reuse__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1939:1: ( ( 'edit' ) )
            // InternalMyDsl.g:1940:1: ( 'edit' )
            {
            // InternalMyDsl.g:1940:1: ( 'edit' )
            // InternalMyDsl.g:1941:2: 'edit'
            {
             before(grammarAccess.getReuseAccess().getEditKeyword_1_0_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getReuseAccess().getEditKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reuse__Group_1_0__0__Impl"


    // $ANTLR start "rule__Reuse__Group_1_0__1"
    // InternalMyDsl.g:1950:1: rule__Reuse__Group_1_0__1 : rule__Reuse__Group_1_0__1__Impl ;
    public final void rule__Reuse__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1954:1: ( rule__Reuse__Group_1_0__1__Impl )
            // InternalMyDsl.g:1955:2: rule__Reuse__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Reuse__Group_1_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reuse__Group_1_0__1"


    // $ANTLR start "rule__Reuse__Group_1_0__1__Impl"
    // InternalMyDsl.g:1961:1: rule__Reuse__Group_1_0__1__Impl : ( ( rule__Reuse__RefAssignment_1_0_1 ) ) ;
    public final void rule__Reuse__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1965:1: ( ( ( rule__Reuse__RefAssignment_1_0_1 ) ) )
            // InternalMyDsl.g:1966:1: ( ( rule__Reuse__RefAssignment_1_0_1 ) )
            {
            // InternalMyDsl.g:1966:1: ( ( rule__Reuse__RefAssignment_1_0_1 ) )
            // InternalMyDsl.g:1967:2: ( rule__Reuse__RefAssignment_1_0_1 )
            {
             before(grammarAccess.getReuseAccess().getRefAssignment_1_0_1()); 
            // InternalMyDsl.g:1968:2: ( rule__Reuse__RefAssignment_1_0_1 )
            // InternalMyDsl.g:1968:3: rule__Reuse__RefAssignment_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Reuse__RefAssignment_1_0_1();

            state._fsp--;


            }

             after(grammarAccess.getReuseAccess().getRefAssignment_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reuse__Group_1_0__1__Impl"


    // $ANTLR start "rule__Reuse__Group_1_1__0"
    // InternalMyDsl.g:1977:1: rule__Reuse__Group_1_1__0 : rule__Reuse__Group_1_1__0__Impl rule__Reuse__Group_1_1__1 ;
    public final void rule__Reuse__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1981:1: ( rule__Reuse__Group_1_1__0__Impl rule__Reuse__Group_1_1__1 )
            // InternalMyDsl.g:1982:2: rule__Reuse__Group_1_1__0__Impl rule__Reuse__Group_1_1__1
            {
            pushFollow(FOLLOW_12);
            rule__Reuse__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reuse__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reuse__Group_1_1__0"


    // $ANTLR start "rule__Reuse__Group_1_1__0__Impl"
    // InternalMyDsl.g:1989:1: rule__Reuse__Group_1_1__0__Impl : ( 'add' ) ;
    public final void rule__Reuse__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1993:1: ( ( 'add' ) )
            // InternalMyDsl.g:1994:1: ( 'add' )
            {
            // InternalMyDsl.g:1994:1: ( 'add' )
            // InternalMyDsl.g:1995:2: 'add'
            {
             before(grammarAccess.getReuseAccess().getAddKeyword_1_1_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getReuseAccess().getAddKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reuse__Group_1_1__0__Impl"


    // $ANTLR start "rule__Reuse__Group_1_1__1"
    // InternalMyDsl.g:2004:1: rule__Reuse__Group_1_1__1 : rule__Reuse__Group_1_1__1__Impl ;
    public final void rule__Reuse__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2008:1: ( rule__Reuse__Group_1_1__1__Impl )
            // InternalMyDsl.g:2009:2: rule__Reuse__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Reuse__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reuse__Group_1_1__1"


    // $ANTLR start "rule__Reuse__Group_1_1__1__Impl"
    // InternalMyDsl.g:2015:1: rule__Reuse__Group_1_1__1__Impl : ( ( rule__Reuse__AddAssignment_1_1_1 ) ) ;
    public final void rule__Reuse__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2019:1: ( ( ( rule__Reuse__AddAssignment_1_1_1 ) ) )
            // InternalMyDsl.g:2020:1: ( ( rule__Reuse__AddAssignment_1_1_1 ) )
            {
            // InternalMyDsl.g:2020:1: ( ( rule__Reuse__AddAssignment_1_1_1 ) )
            // InternalMyDsl.g:2021:2: ( rule__Reuse__AddAssignment_1_1_1 )
            {
             before(grammarAccess.getReuseAccess().getAddAssignment_1_1_1()); 
            // InternalMyDsl.g:2022:2: ( rule__Reuse__AddAssignment_1_1_1 )
            // InternalMyDsl.g:2022:3: rule__Reuse__AddAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Reuse__AddAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getReuseAccess().getAddAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reuse__Group_1_1__1__Impl"


    // $ANTLR start "rule__DotExpression__Group__0"
    // InternalMyDsl.g:2031:1: rule__DotExpression__Group__0 : rule__DotExpression__Group__0__Impl rule__DotExpression__Group__1 ;
    public final void rule__DotExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2035:1: ( rule__DotExpression__Group__0__Impl rule__DotExpression__Group__1 )
            // InternalMyDsl.g:2036:2: rule__DotExpression__Group__0__Impl rule__DotExpression__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalMyDsl.g:2043:1: rule__DotExpression__Group__0__Impl : ( ruleReUsableRef ) ;
    public final void rule__DotExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2047:1: ( ( ruleReUsableRef ) )
            // InternalMyDsl.g:2048:1: ( ruleReUsableRef )
            {
            // InternalMyDsl.g:2048:1: ( ruleReUsableRef )
            // InternalMyDsl.g:2049:2: ruleReUsableRef
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
    // InternalMyDsl.g:2058:1: rule__DotExpression__Group__1 : rule__DotExpression__Group__1__Impl ;
    public final void rule__DotExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2062:1: ( rule__DotExpression__Group__1__Impl )
            // InternalMyDsl.g:2063:2: rule__DotExpression__Group__1__Impl
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
    // InternalMyDsl.g:2069:1: rule__DotExpression__Group__1__Impl : ( ( rule__DotExpression__Group_1__0 )* ) ;
    public final void rule__DotExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2073:1: ( ( ( rule__DotExpression__Group_1__0 )* ) )
            // InternalMyDsl.g:2074:1: ( ( rule__DotExpression__Group_1__0 )* )
            {
            // InternalMyDsl.g:2074:1: ( ( rule__DotExpression__Group_1__0 )* )
            // InternalMyDsl.g:2075:2: ( rule__DotExpression__Group_1__0 )*
            {
             before(grammarAccess.getDotExpressionAccess().getGroup_1()); 
            // InternalMyDsl.g:2076:2: ( rule__DotExpression__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==24) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMyDsl.g:2076:3: rule__DotExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__DotExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalMyDsl.g:2085:1: rule__DotExpression__Group_1__0 : rule__DotExpression__Group_1__0__Impl rule__DotExpression__Group_1__1 ;
    public final void rule__DotExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2089:1: ( rule__DotExpression__Group_1__0__Impl rule__DotExpression__Group_1__1 )
            // InternalMyDsl.g:2090:2: rule__DotExpression__Group_1__0__Impl rule__DotExpression__Group_1__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalMyDsl.g:2097:1: rule__DotExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__DotExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2101:1: ( ( () ) )
            // InternalMyDsl.g:2102:1: ( () )
            {
            // InternalMyDsl.g:2102:1: ( () )
            // InternalMyDsl.g:2103:2: ()
            {
             before(grammarAccess.getDotExpressionAccess().getDotExpressionRefAction_1_0()); 
            // InternalMyDsl.g:2104:2: ()
            // InternalMyDsl.g:2104:3: 
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
    // InternalMyDsl.g:2112:1: rule__DotExpression__Group_1__1 : rule__DotExpression__Group_1__1__Impl rule__DotExpression__Group_1__2 ;
    public final void rule__DotExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2116:1: ( rule__DotExpression__Group_1__1__Impl rule__DotExpression__Group_1__2 )
            // InternalMyDsl.g:2117:2: rule__DotExpression__Group_1__1__Impl rule__DotExpression__Group_1__2
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
    // InternalMyDsl.g:2124:1: rule__DotExpression__Group_1__1__Impl : ( '.' ) ;
    public final void rule__DotExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2128:1: ( ( '.' ) )
            // InternalMyDsl.g:2129:1: ( '.' )
            {
            // InternalMyDsl.g:2129:1: ( '.' )
            // InternalMyDsl.g:2130:2: '.'
            {
             before(grammarAccess.getDotExpressionAccess().getFullStopKeyword_1_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalMyDsl.g:2139:1: rule__DotExpression__Group_1__2 : rule__DotExpression__Group_1__2__Impl ;
    public final void rule__DotExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2143:1: ( rule__DotExpression__Group_1__2__Impl )
            // InternalMyDsl.g:2144:2: rule__DotExpression__Group_1__2__Impl
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
    // InternalMyDsl.g:2150:1: rule__DotExpression__Group_1__2__Impl : ( ( rule__DotExpression__TailAssignment_1_2 ) ) ;
    public final void rule__DotExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2154:1: ( ( ( rule__DotExpression__TailAssignment_1_2 ) ) )
            // InternalMyDsl.g:2155:1: ( ( rule__DotExpression__TailAssignment_1_2 ) )
            {
            // InternalMyDsl.g:2155:1: ( ( rule__DotExpression__TailAssignment_1_2 ) )
            // InternalMyDsl.g:2156:2: ( rule__DotExpression__TailAssignment_1_2 )
            {
             before(grammarAccess.getDotExpressionAccess().getTailAssignment_1_2()); 
            // InternalMyDsl.g:2157:2: ( rule__DotExpression__TailAssignment_1_2 )
            // InternalMyDsl.g:2157:3: rule__DotExpression__TailAssignment_1_2
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
    // InternalMyDsl.g:2166:1: rule__ReUsableRef__Group__0 : rule__ReUsableRef__Group__0__Impl rule__ReUsableRef__Group__1 ;
    public final void rule__ReUsableRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2170:1: ( rule__ReUsableRef__Group__0__Impl rule__ReUsableRef__Group__1 )
            // InternalMyDsl.g:2171:2: rule__ReUsableRef__Group__0__Impl rule__ReUsableRef__Group__1
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
    // InternalMyDsl.g:2178:1: rule__ReUsableRef__Group__0__Impl : ( () ) ;
    public final void rule__ReUsableRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2182:1: ( ( () ) )
            // InternalMyDsl.g:2183:1: ( () )
            {
            // InternalMyDsl.g:2183:1: ( () )
            // InternalMyDsl.g:2184:2: ()
            {
             before(grammarAccess.getReUsableRefAccess().getReUsableRefAction_0()); 
            // InternalMyDsl.g:2185:2: ()
            // InternalMyDsl.g:2185:3: 
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
    // InternalMyDsl.g:2193:1: rule__ReUsableRef__Group__1 : rule__ReUsableRef__Group__1__Impl ;
    public final void rule__ReUsableRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2197:1: ( rule__ReUsableRef__Group__1__Impl )
            // InternalMyDsl.g:2198:2: rule__ReUsableRef__Group__1__Impl
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
    // InternalMyDsl.g:2204:1: rule__ReUsableRef__Group__1__Impl : ( ( rule__ReUsableRef__ReuseableAssignment_1 ) ) ;
    public final void rule__ReUsableRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2208:1: ( ( ( rule__ReUsableRef__ReuseableAssignment_1 ) ) )
            // InternalMyDsl.g:2209:1: ( ( rule__ReUsableRef__ReuseableAssignment_1 ) )
            {
            // InternalMyDsl.g:2209:1: ( ( rule__ReUsableRef__ReuseableAssignment_1 ) )
            // InternalMyDsl.g:2210:2: ( rule__ReUsableRef__ReuseableAssignment_1 )
            {
             before(grammarAccess.getReUsableRefAccess().getReuseableAssignment_1()); 
            // InternalMyDsl.g:2211:2: ( rule__ReUsableRef__ReuseableAssignment_1 )
            // InternalMyDsl.g:2211:3: rule__ReUsableRef__ReuseableAssignment_1
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
    // InternalMyDsl.g:2220:1: rule__Inertial__Group__0 : rule__Inertial__Group__0__Impl rule__Inertial__Group__1 ;
    public final void rule__Inertial__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2224:1: ( rule__Inertial__Group__0__Impl rule__Inertial__Group__1 )
            // InternalMyDsl.g:2225:2: rule__Inertial__Group__0__Impl rule__Inertial__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyDsl.g:2232:1: rule__Inertial__Group__0__Impl : ( () ) ;
    public final void rule__Inertial__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2236:1: ( ( () ) )
            // InternalMyDsl.g:2237:1: ( () )
            {
            // InternalMyDsl.g:2237:1: ( () )
            // InternalMyDsl.g:2238:2: ()
            {
             before(grammarAccess.getInertialAccess().getInertialAction_0()); 
            // InternalMyDsl.g:2239:2: ()
            // InternalMyDsl.g:2239:3: 
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
    // InternalMyDsl.g:2247:1: rule__Inertial__Group__1 : rule__Inertial__Group__1__Impl rule__Inertial__Group__2 ;
    public final void rule__Inertial__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2251:1: ( rule__Inertial__Group__1__Impl rule__Inertial__Group__2 )
            // InternalMyDsl.g:2252:2: rule__Inertial__Group__1__Impl rule__Inertial__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalMyDsl.g:2259:1: rule__Inertial__Group__1__Impl : ( 'Inertial' ) ;
    public final void rule__Inertial__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2263:1: ( ( 'Inertial' ) )
            // InternalMyDsl.g:2264:1: ( 'Inertial' )
            {
            // InternalMyDsl.g:2264:1: ( 'Inertial' )
            // InternalMyDsl.g:2265:2: 'Inertial'
            {
             before(grammarAccess.getInertialAccess().getInertialKeyword_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalMyDsl.g:2274:1: rule__Inertial__Group__2 : rule__Inertial__Group__2__Impl rule__Inertial__Group__3 ;
    public final void rule__Inertial__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2278:1: ( rule__Inertial__Group__2__Impl rule__Inertial__Group__3 )
            // InternalMyDsl.g:2279:2: rule__Inertial__Group__2__Impl rule__Inertial__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalMyDsl.g:2286:1: rule__Inertial__Group__2__Impl : ( ( rule__Inertial__NameAssignment_2 )? ) ;
    public final void rule__Inertial__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2290:1: ( ( ( rule__Inertial__NameAssignment_2 )? ) )
            // InternalMyDsl.g:2291:1: ( ( rule__Inertial__NameAssignment_2 )? )
            {
            // InternalMyDsl.g:2291:1: ( ( rule__Inertial__NameAssignment_2 )? )
            // InternalMyDsl.g:2292:2: ( rule__Inertial__NameAssignment_2 )?
            {
             before(grammarAccess.getInertialAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:2293:2: ( rule__Inertial__NameAssignment_2 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMyDsl.g:2293:3: rule__Inertial__NameAssignment_2
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
    // InternalMyDsl.g:2301:1: rule__Inertial__Group__3 : rule__Inertial__Group__3__Impl rule__Inertial__Group__4 ;
    public final void rule__Inertial__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2305:1: ( rule__Inertial__Group__3__Impl rule__Inertial__Group__4 )
            // InternalMyDsl.g:2306:2: rule__Inertial__Group__3__Impl rule__Inertial__Group__4
            {
            pushFollow(FOLLOW_17);
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
    // InternalMyDsl.g:2313:1: rule__Inertial__Group__3__Impl : ( ( rule__Inertial__InertiaAssignment_3 ) ) ;
    public final void rule__Inertial__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2317:1: ( ( ( rule__Inertial__InertiaAssignment_3 ) ) )
            // InternalMyDsl.g:2318:1: ( ( rule__Inertial__InertiaAssignment_3 ) )
            {
            // InternalMyDsl.g:2318:1: ( ( rule__Inertial__InertiaAssignment_3 ) )
            // InternalMyDsl.g:2319:2: ( rule__Inertial__InertiaAssignment_3 )
            {
             before(grammarAccess.getInertialAccess().getInertiaAssignment_3()); 
            // InternalMyDsl.g:2320:2: ( rule__Inertial__InertiaAssignment_3 )
            // InternalMyDsl.g:2320:3: rule__Inertial__InertiaAssignment_3
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
    // InternalMyDsl.g:2328:1: rule__Inertial__Group__4 : rule__Inertial__Group__4__Impl rule__Inertial__Group__5 ;
    public final void rule__Inertial__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2332:1: ( rule__Inertial__Group__4__Impl rule__Inertial__Group__5 )
            // InternalMyDsl.g:2333:2: rule__Inertial__Group__4__Impl rule__Inertial__Group__5
            {
            pushFollow(FOLLOW_18);
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
    // InternalMyDsl.g:2340:1: rule__Inertial__Group__4__Impl : ( ( rule__Inertial__MassAssignment_4 ) ) ;
    public final void rule__Inertial__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2344:1: ( ( ( rule__Inertial__MassAssignment_4 ) ) )
            // InternalMyDsl.g:2345:1: ( ( rule__Inertial__MassAssignment_4 ) )
            {
            // InternalMyDsl.g:2345:1: ( ( rule__Inertial__MassAssignment_4 ) )
            // InternalMyDsl.g:2346:2: ( rule__Inertial__MassAssignment_4 )
            {
             before(grammarAccess.getInertialAccess().getMassAssignment_4()); 
            // InternalMyDsl.g:2347:2: ( rule__Inertial__MassAssignment_4 )
            // InternalMyDsl.g:2347:3: rule__Inertial__MassAssignment_4
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
    // InternalMyDsl.g:2355:1: rule__Inertial__Group__5 : rule__Inertial__Group__5__Impl ;
    public final void rule__Inertial__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2359:1: ( rule__Inertial__Group__5__Impl )
            // InternalMyDsl.g:2360:2: rule__Inertial__Group__5__Impl
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
    // InternalMyDsl.g:2366:1: rule__Inertial__Group__5__Impl : ( ( rule__Inertial__OriginAssignment_5 )? ) ;
    public final void rule__Inertial__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2370:1: ( ( ( rule__Inertial__OriginAssignment_5 )? ) )
            // InternalMyDsl.g:2371:1: ( ( rule__Inertial__OriginAssignment_5 )? )
            {
            // InternalMyDsl.g:2371:1: ( ( rule__Inertial__OriginAssignment_5 )? )
            // InternalMyDsl.g:2372:2: ( rule__Inertial__OriginAssignment_5 )?
            {
             before(grammarAccess.getInertialAccess().getOriginAssignment_5()); 
            // InternalMyDsl.g:2373:2: ( rule__Inertial__OriginAssignment_5 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==36) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMyDsl.g:2373:3: rule__Inertial__OriginAssignment_5
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
    // InternalMyDsl.g:2382:1: rule__Inertia__Group__0 : rule__Inertia__Group__0__Impl rule__Inertia__Group__1 ;
    public final void rule__Inertia__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2386:1: ( rule__Inertia__Group__0__Impl rule__Inertia__Group__1 )
            // InternalMyDsl.g:2387:2: rule__Inertia__Group__0__Impl rule__Inertia__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalMyDsl.g:2394:1: rule__Inertia__Group__0__Impl : ( () ) ;
    public final void rule__Inertia__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2398:1: ( ( () ) )
            // InternalMyDsl.g:2399:1: ( () )
            {
            // InternalMyDsl.g:2399:1: ( () )
            // InternalMyDsl.g:2400:2: ()
            {
             before(grammarAccess.getInertiaAccess().getInertiaAction_0()); 
            // InternalMyDsl.g:2401:2: ()
            // InternalMyDsl.g:2401:3: 
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
    // InternalMyDsl.g:2409:1: rule__Inertia__Group__1 : rule__Inertia__Group__1__Impl rule__Inertia__Group__2 ;
    public final void rule__Inertia__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2413:1: ( rule__Inertia__Group__1__Impl rule__Inertia__Group__2 )
            // InternalMyDsl.g:2414:2: rule__Inertia__Group__1__Impl rule__Inertia__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyDsl.g:2421:1: rule__Inertia__Group__1__Impl : ( 'Inertia' ) ;
    public final void rule__Inertia__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2425:1: ( ( 'Inertia' ) )
            // InternalMyDsl.g:2426:1: ( 'Inertia' )
            {
            // InternalMyDsl.g:2426:1: ( 'Inertia' )
            // InternalMyDsl.g:2427:2: 'Inertia'
            {
             before(grammarAccess.getInertiaAccess().getInertiaKeyword_1()); 
            match(input,26,FOLLOW_2); 
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
    // InternalMyDsl.g:2436:1: rule__Inertia__Group__2 : rule__Inertia__Group__2__Impl rule__Inertia__Group__3 ;
    public final void rule__Inertia__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2440:1: ( rule__Inertia__Group__2__Impl rule__Inertia__Group__3 )
            // InternalMyDsl.g:2441:2: rule__Inertia__Group__2__Impl rule__Inertia__Group__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyDsl.g:2448:1: rule__Inertia__Group__2__Impl : ( ( rule__Inertia__NameAssignment_2 )? ) ;
    public final void rule__Inertia__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2452:1: ( ( ( rule__Inertia__NameAssignment_2 )? ) )
            // InternalMyDsl.g:2453:1: ( ( rule__Inertia__NameAssignment_2 )? )
            {
            // InternalMyDsl.g:2453:1: ( ( rule__Inertia__NameAssignment_2 )? )
            // InternalMyDsl.g:2454:2: ( rule__Inertia__NameAssignment_2 )?
            {
             before(grammarAccess.getInertiaAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:2455:2: ( rule__Inertia__NameAssignment_2 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMyDsl.g:2455:3: rule__Inertia__NameAssignment_2
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
    // InternalMyDsl.g:2463:1: rule__Inertia__Group__3 : rule__Inertia__Group__3__Impl rule__Inertia__Group__4 ;
    public final void rule__Inertia__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2467:1: ( rule__Inertia__Group__3__Impl rule__Inertia__Group__4 )
            // InternalMyDsl.g:2468:2: rule__Inertia__Group__3__Impl rule__Inertia__Group__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:2475:1: rule__Inertia__Group__3__Impl : ( 'ixx' ) ;
    public final void rule__Inertia__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2479:1: ( ( 'ixx' ) )
            // InternalMyDsl.g:2480:1: ( 'ixx' )
            {
            // InternalMyDsl.g:2480:1: ( 'ixx' )
            // InternalMyDsl.g:2481:2: 'ixx'
            {
             before(grammarAccess.getInertiaAccess().getIxxKeyword_3()); 
            match(input,27,FOLLOW_2); 
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
    // InternalMyDsl.g:2490:1: rule__Inertia__Group__4 : rule__Inertia__Group__4__Impl rule__Inertia__Group__5 ;
    public final void rule__Inertia__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2494:1: ( rule__Inertia__Group__4__Impl rule__Inertia__Group__5 )
            // InternalMyDsl.g:2495:2: rule__Inertia__Group__4__Impl rule__Inertia__Group__5
            {
            pushFollow(FOLLOW_21);
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
    // InternalMyDsl.g:2502:1: rule__Inertia__Group__4__Impl : ( ( rule__Inertia__IxxAssignment_4 ) ) ;
    public final void rule__Inertia__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2506:1: ( ( ( rule__Inertia__IxxAssignment_4 ) ) )
            // InternalMyDsl.g:2507:1: ( ( rule__Inertia__IxxAssignment_4 ) )
            {
            // InternalMyDsl.g:2507:1: ( ( rule__Inertia__IxxAssignment_4 ) )
            // InternalMyDsl.g:2508:2: ( rule__Inertia__IxxAssignment_4 )
            {
             before(grammarAccess.getInertiaAccess().getIxxAssignment_4()); 
            // InternalMyDsl.g:2509:2: ( rule__Inertia__IxxAssignment_4 )
            // InternalMyDsl.g:2509:3: rule__Inertia__IxxAssignment_4
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
    // InternalMyDsl.g:2517:1: rule__Inertia__Group__5 : rule__Inertia__Group__5__Impl rule__Inertia__Group__6 ;
    public final void rule__Inertia__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2521:1: ( rule__Inertia__Group__5__Impl rule__Inertia__Group__6 )
            // InternalMyDsl.g:2522:2: rule__Inertia__Group__5__Impl rule__Inertia__Group__6
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:2529:1: rule__Inertia__Group__5__Impl : ( 'ixy' ) ;
    public final void rule__Inertia__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2533:1: ( ( 'ixy' ) )
            // InternalMyDsl.g:2534:1: ( 'ixy' )
            {
            // InternalMyDsl.g:2534:1: ( 'ixy' )
            // InternalMyDsl.g:2535:2: 'ixy'
            {
             before(grammarAccess.getInertiaAccess().getIxyKeyword_5()); 
            match(input,28,FOLLOW_2); 
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
    // InternalMyDsl.g:2544:1: rule__Inertia__Group__6 : rule__Inertia__Group__6__Impl rule__Inertia__Group__7 ;
    public final void rule__Inertia__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2548:1: ( rule__Inertia__Group__6__Impl rule__Inertia__Group__7 )
            // InternalMyDsl.g:2549:2: rule__Inertia__Group__6__Impl rule__Inertia__Group__7
            {
            pushFollow(FOLLOW_22);
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
    // InternalMyDsl.g:2556:1: rule__Inertia__Group__6__Impl : ( ( rule__Inertia__IxyAssignment_6 ) ) ;
    public final void rule__Inertia__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2560:1: ( ( ( rule__Inertia__IxyAssignment_6 ) ) )
            // InternalMyDsl.g:2561:1: ( ( rule__Inertia__IxyAssignment_6 ) )
            {
            // InternalMyDsl.g:2561:1: ( ( rule__Inertia__IxyAssignment_6 ) )
            // InternalMyDsl.g:2562:2: ( rule__Inertia__IxyAssignment_6 )
            {
             before(grammarAccess.getInertiaAccess().getIxyAssignment_6()); 
            // InternalMyDsl.g:2563:2: ( rule__Inertia__IxyAssignment_6 )
            // InternalMyDsl.g:2563:3: rule__Inertia__IxyAssignment_6
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
    // InternalMyDsl.g:2571:1: rule__Inertia__Group__7 : rule__Inertia__Group__7__Impl rule__Inertia__Group__8 ;
    public final void rule__Inertia__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2575:1: ( rule__Inertia__Group__7__Impl rule__Inertia__Group__8 )
            // InternalMyDsl.g:2576:2: rule__Inertia__Group__7__Impl rule__Inertia__Group__8
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:2583:1: rule__Inertia__Group__7__Impl : ( 'ixz' ) ;
    public final void rule__Inertia__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2587:1: ( ( 'ixz' ) )
            // InternalMyDsl.g:2588:1: ( 'ixz' )
            {
            // InternalMyDsl.g:2588:1: ( 'ixz' )
            // InternalMyDsl.g:2589:2: 'ixz'
            {
             before(grammarAccess.getInertiaAccess().getIxzKeyword_7()); 
            match(input,29,FOLLOW_2); 
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
    // InternalMyDsl.g:2598:1: rule__Inertia__Group__8 : rule__Inertia__Group__8__Impl rule__Inertia__Group__9 ;
    public final void rule__Inertia__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2602:1: ( rule__Inertia__Group__8__Impl rule__Inertia__Group__9 )
            // InternalMyDsl.g:2603:2: rule__Inertia__Group__8__Impl rule__Inertia__Group__9
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyDsl.g:2610:1: rule__Inertia__Group__8__Impl : ( ( rule__Inertia__IxzAssignment_8 ) ) ;
    public final void rule__Inertia__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2614:1: ( ( ( rule__Inertia__IxzAssignment_8 ) ) )
            // InternalMyDsl.g:2615:1: ( ( rule__Inertia__IxzAssignment_8 ) )
            {
            // InternalMyDsl.g:2615:1: ( ( rule__Inertia__IxzAssignment_8 ) )
            // InternalMyDsl.g:2616:2: ( rule__Inertia__IxzAssignment_8 )
            {
             before(grammarAccess.getInertiaAccess().getIxzAssignment_8()); 
            // InternalMyDsl.g:2617:2: ( rule__Inertia__IxzAssignment_8 )
            // InternalMyDsl.g:2617:3: rule__Inertia__IxzAssignment_8
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
    // InternalMyDsl.g:2625:1: rule__Inertia__Group__9 : rule__Inertia__Group__9__Impl rule__Inertia__Group__10 ;
    public final void rule__Inertia__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2629:1: ( rule__Inertia__Group__9__Impl rule__Inertia__Group__10 )
            // InternalMyDsl.g:2630:2: rule__Inertia__Group__9__Impl rule__Inertia__Group__10
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:2637:1: rule__Inertia__Group__9__Impl : ( 'iyy' ) ;
    public final void rule__Inertia__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2641:1: ( ( 'iyy' ) )
            // InternalMyDsl.g:2642:1: ( 'iyy' )
            {
            // InternalMyDsl.g:2642:1: ( 'iyy' )
            // InternalMyDsl.g:2643:2: 'iyy'
            {
             before(grammarAccess.getInertiaAccess().getIyyKeyword_9()); 
            match(input,30,FOLLOW_2); 
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
    // InternalMyDsl.g:2652:1: rule__Inertia__Group__10 : rule__Inertia__Group__10__Impl rule__Inertia__Group__11 ;
    public final void rule__Inertia__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2656:1: ( rule__Inertia__Group__10__Impl rule__Inertia__Group__11 )
            // InternalMyDsl.g:2657:2: rule__Inertia__Group__10__Impl rule__Inertia__Group__11
            {
            pushFollow(FOLLOW_24);
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
    // InternalMyDsl.g:2664:1: rule__Inertia__Group__10__Impl : ( ( rule__Inertia__IyyAssignment_10 ) ) ;
    public final void rule__Inertia__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2668:1: ( ( ( rule__Inertia__IyyAssignment_10 ) ) )
            // InternalMyDsl.g:2669:1: ( ( rule__Inertia__IyyAssignment_10 ) )
            {
            // InternalMyDsl.g:2669:1: ( ( rule__Inertia__IyyAssignment_10 ) )
            // InternalMyDsl.g:2670:2: ( rule__Inertia__IyyAssignment_10 )
            {
             before(grammarAccess.getInertiaAccess().getIyyAssignment_10()); 
            // InternalMyDsl.g:2671:2: ( rule__Inertia__IyyAssignment_10 )
            // InternalMyDsl.g:2671:3: rule__Inertia__IyyAssignment_10
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
    // InternalMyDsl.g:2679:1: rule__Inertia__Group__11 : rule__Inertia__Group__11__Impl rule__Inertia__Group__12 ;
    public final void rule__Inertia__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2683:1: ( rule__Inertia__Group__11__Impl rule__Inertia__Group__12 )
            // InternalMyDsl.g:2684:2: rule__Inertia__Group__11__Impl rule__Inertia__Group__12
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:2691:1: rule__Inertia__Group__11__Impl : ( 'iyz' ) ;
    public final void rule__Inertia__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2695:1: ( ( 'iyz' ) )
            // InternalMyDsl.g:2696:1: ( 'iyz' )
            {
            // InternalMyDsl.g:2696:1: ( 'iyz' )
            // InternalMyDsl.g:2697:2: 'iyz'
            {
             before(grammarAccess.getInertiaAccess().getIyzKeyword_11()); 
            match(input,31,FOLLOW_2); 
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
    // InternalMyDsl.g:2706:1: rule__Inertia__Group__12 : rule__Inertia__Group__12__Impl rule__Inertia__Group__13 ;
    public final void rule__Inertia__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2710:1: ( rule__Inertia__Group__12__Impl rule__Inertia__Group__13 )
            // InternalMyDsl.g:2711:2: rule__Inertia__Group__12__Impl rule__Inertia__Group__13
            {
            pushFollow(FOLLOW_25);
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
    // InternalMyDsl.g:2718:1: rule__Inertia__Group__12__Impl : ( ( rule__Inertia__IyzAssignment_12 ) ) ;
    public final void rule__Inertia__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2722:1: ( ( ( rule__Inertia__IyzAssignment_12 ) ) )
            // InternalMyDsl.g:2723:1: ( ( rule__Inertia__IyzAssignment_12 ) )
            {
            // InternalMyDsl.g:2723:1: ( ( rule__Inertia__IyzAssignment_12 ) )
            // InternalMyDsl.g:2724:2: ( rule__Inertia__IyzAssignment_12 )
            {
             before(grammarAccess.getInertiaAccess().getIyzAssignment_12()); 
            // InternalMyDsl.g:2725:2: ( rule__Inertia__IyzAssignment_12 )
            // InternalMyDsl.g:2725:3: rule__Inertia__IyzAssignment_12
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
    // InternalMyDsl.g:2733:1: rule__Inertia__Group__13 : rule__Inertia__Group__13__Impl rule__Inertia__Group__14 ;
    public final void rule__Inertia__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2737:1: ( rule__Inertia__Group__13__Impl rule__Inertia__Group__14 )
            // InternalMyDsl.g:2738:2: rule__Inertia__Group__13__Impl rule__Inertia__Group__14
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:2745:1: rule__Inertia__Group__13__Impl : ( 'izz' ) ;
    public final void rule__Inertia__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2749:1: ( ( 'izz' ) )
            // InternalMyDsl.g:2750:1: ( 'izz' )
            {
            // InternalMyDsl.g:2750:1: ( 'izz' )
            // InternalMyDsl.g:2751:2: 'izz'
            {
             before(grammarAccess.getInertiaAccess().getIzzKeyword_13()); 
            match(input,32,FOLLOW_2); 
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
    // InternalMyDsl.g:2760:1: rule__Inertia__Group__14 : rule__Inertia__Group__14__Impl ;
    public final void rule__Inertia__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2764:1: ( rule__Inertia__Group__14__Impl )
            // InternalMyDsl.g:2765:2: rule__Inertia__Group__14__Impl
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
    // InternalMyDsl.g:2771:1: rule__Inertia__Group__14__Impl : ( ( rule__Inertia__IzzAssignment_14 ) ) ;
    public final void rule__Inertia__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2775:1: ( ( ( rule__Inertia__IzzAssignment_14 ) ) )
            // InternalMyDsl.g:2776:1: ( ( rule__Inertia__IzzAssignment_14 ) )
            {
            // InternalMyDsl.g:2776:1: ( ( rule__Inertia__IzzAssignment_14 ) )
            // InternalMyDsl.g:2777:2: ( rule__Inertia__IzzAssignment_14 )
            {
             before(grammarAccess.getInertiaAccess().getIzzAssignment_14()); 
            // InternalMyDsl.g:2778:2: ( rule__Inertia__IzzAssignment_14 )
            // InternalMyDsl.g:2778:3: rule__Inertia__IzzAssignment_14
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
    // InternalMyDsl.g:2787:1: rule__Visual__Group__0 : rule__Visual__Group__0__Impl rule__Visual__Group__1 ;
    public final void rule__Visual__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2791:1: ( rule__Visual__Group__0__Impl rule__Visual__Group__1 )
            // InternalMyDsl.g:2792:2: rule__Visual__Group__0__Impl rule__Visual__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalMyDsl.g:2799:1: rule__Visual__Group__0__Impl : ( () ) ;
    public final void rule__Visual__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2803:1: ( ( () ) )
            // InternalMyDsl.g:2804:1: ( () )
            {
            // InternalMyDsl.g:2804:1: ( () )
            // InternalMyDsl.g:2805:2: ()
            {
             before(grammarAccess.getVisualAccess().getVisualAction_0()); 
            // InternalMyDsl.g:2806:2: ()
            // InternalMyDsl.g:2806:3: 
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
    // InternalMyDsl.g:2814:1: rule__Visual__Group__1 : rule__Visual__Group__1__Impl rule__Visual__Group__2 ;
    public final void rule__Visual__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2818:1: ( rule__Visual__Group__1__Impl rule__Visual__Group__2 )
            // InternalMyDsl.g:2819:2: rule__Visual__Group__1__Impl rule__Visual__Group__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalMyDsl.g:2826:1: rule__Visual__Group__1__Impl : ( 'Visual' ) ;
    public final void rule__Visual__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2830:1: ( ( 'Visual' ) )
            // InternalMyDsl.g:2831:1: ( 'Visual' )
            {
            // InternalMyDsl.g:2831:1: ( 'Visual' )
            // InternalMyDsl.g:2832:2: 'Visual'
            {
             before(grammarAccess.getVisualAccess().getVisualKeyword_1()); 
            match(input,33,FOLLOW_2); 
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
    // InternalMyDsl.g:2841:1: rule__Visual__Group__2 : rule__Visual__Group__2__Impl rule__Visual__Group__3 ;
    public final void rule__Visual__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2845:1: ( rule__Visual__Group__2__Impl rule__Visual__Group__3 )
            // InternalMyDsl.g:2846:2: rule__Visual__Group__2__Impl rule__Visual__Group__3
            {
            pushFollow(FOLLOW_27);
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
    // InternalMyDsl.g:2853:1: rule__Visual__Group__2__Impl : ( ( rule__Visual__NameAssignment_2 )? ) ;
    public final void rule__Visual__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2857:1: ( ( ( rule__Visual__NameAssignment_2 )? ) )
            // InternalMyDsl.g:2858:1: ( ( rule__Visual__NameAssignment_2 )? )
            {
            // InternalMyDsl.g:2858:1: ( ( rule__Visual__NameAssignment_2 )? )
            // InternalMyDsl.g:2859:2: ( rule__Visual__NameAssignment_2 )?
            {
             before(grammarAccess.getVisualAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:2860:2: ( rule__Visual__NameAssignment_2 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMyDsl.g:2860:3: rule__Visual__NameAssignment_2
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
    // InternalMyDsl.g:2868:1: rule__Visual__Group__3 : rule__Visual__Group__3__Impl rule__Visual__Group__4 ;
    public final void rule__Visual__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2872:1: ( rule__Visual__Group__3__Impl rule__Visual__Group__4 )
            // InternalMyDsl.g:2873:2: rule__Visual__Group__3__Impl rule__Visual__Group__4
            {
            pushFollow(FOLLOW_28);
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
    // InternalMyDsl.g:2880:1: rule__Visual__Group__3__Impl : ( 'Geometry' ) ;
    public final void rule__Visual__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2884:1: ( ( 'Geometry' ) )
            // InternalMyDsl.g:2885:1: ( 'Geometry' )
            {
            // InternalMyDsl.g:2885:1: ( 'Geometry' )
            // InternalMyDsl.g:2886:2: 'Geometry'
            {
             before(grammarAccess.getVisualAccess().getGeometryKeyword_3()); 
            match(input,34,FOLLOW_2); 
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
    // InternalMyDsl.g:2895:1: rule__Visual__Group__4 : rule__Visual__Group__4__Impl rule__Visual__Group__5 ;
    public final void rule__Visual__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2899:1: ( rule__Visual__Group__4__Impl rule__Visual__Group__5 )
            // InternalMyDsl.g:2900:2: rule__Visual__Group__4__Impl rule__Visual__Group__5
            {
            pushFollow(FOLLOW_28);
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
    // InternalMyDsl.g:2907:1: rule__Visual__Group__4__Impl : ( ( rule__Visual__GeometryAssignment_4 )* ) ;
    public final void rule__Visual__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2911:1: ( ( ( rule__Visual__GeometryAssignment_4 )* ) )
            // InternalMyDsl.g:2912:1: ( ( rule__Visual__GeometryAssignment_4 )* )
            {
            // InternalMyDsl.g:2912:1: ( ( rule__Visual__GeometryAssignment_4 )* )
            // InternalMyDsl.g:2913:2: ( rule__Visual__GeometryAssignment_4 )*
            {
             before(grammarAccess.getVisualAccess().getGeometryAssignment_4()); 
            // InternalMyDsl.g:2914:2: ( rule__Visual__GeometryAssignment_4 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==46||LA25_0==50||LA25_0==52||LA25_0==54) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalMyDsl.g:2914:3: rule__Visual__GeometryAssignment_4
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__Visual__GeometryAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

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
    // InternalMyDsl.g:2922:1: rule__Visual__Group__5 : rule__Visual__Group__5__Impl rule__Visual__Group__6 ;
    public final void rule__Visual__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2926:1: ( rule__Visual__Group__5__Impl rule__Visual__Group__6 )
            // InternalMyDsl.g:2927:2: rule__Visual__Group__5__Impl rule__Visual__Group__6
            {
            pushFollow(FOLLOW_28);
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
    // InternalMyDsl.g:2934:1: rule__Visual__Group__5__Impl : ( ( rule__Visual__OriginAssignment_5 )? ) ;
    public final void rule__Visual__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2938:1: ( ( ( rule__Visual__OriginAssignment_5 )? ) )
            // InternalMyDsl.g:2939:1: ( ( rule__Visual__OriginAssignment_5 )? )
            {
            // InternalMyDsl.g:2939:1: ( ( rule__Visual__OriginAssignment_5 )? )
            // InternalMyDsl.g:2940:2: ( rule__Visual__OriginAssignment_5 )?
            {
             before(grammarAccess.getVisualAccess().getOriginAssignment_5()); 
            // InternalMyDsl.g:2941:2: ( rule__Visual__OriginAssignment_5 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==36) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMyDsl.g:2941:3: rule__Visual__OriginAssignment_5
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
    // InternalMyDsl.g:2949:1: rule__Visual__Group__6 : rule__Visual__Group__6__Impl ;
    public final void rule__Visual__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2953:1: ( rule__Visual__Group__6__Impl )
            // InternalMyDsl.g:2954:2: rule__Visual__Group__6__Impl
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
    // InternalMyDsl.g:2960:1: rule__Visual__Group__6__Impl : ( ( rule__Visual__Group_6__0 )? ) ;
    public final void rule__Visual__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2964:1: ( ( ( rule__Visual__Group_6__0 )? ) )
            // InternalMyDsl.g:2965:1: ( ( rule__Visual__Group_6__0 )? )
            {
            // InternalMyDsl.g:2965:1: ( ( rule__Visual__Group_6__0 )? )
            // InternalMyDsl.g:2966:2: ( rule__Visual__Group_6__0 )?
            {
             before(grammarAccess.getVisualAccess().getGroup_6()); 
            // InternalMyDsl.g:2967:2: ( rule__Visual__Group_6__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==35) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalMyDsl.g:2967:3: rule__Visual__Group_6__0
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
    // InternalMyDsl.g:2976:1: rule__Visual__Group_6__0 : rule__Visual__Group_6__0__Impl rule__Visual__Group_6__1 ;
    public final void rule__Visual__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2980:1: ( rule__Visual__Group_6__0__Impl rule__Visual__Group_6__1 )
            // InternalMyDsl.g:2981:2: rule__Visual__Group_6__0__Impl rule__Visual__Group_6__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalMyDsl.g:2988:1: rule__Visual__Group_6__0__Impl : ( 'Material' ) ;
    public final void rule__Visual__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2992:1: ( ( 'Material' ) )
            // InternalMyDsl.g:2993:1: ( 'Material' )
            {
            // InternalMyDsl.g:2993:1: ( 'Material' )
            // InternalMyDsl.g:2994:2: 'Material'
            {
             before(grammarAccess.getVisualAccess().getMaterialKeyword_6_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalMyDsl.g:3003:1: rule__Visual__Group_6__1 : rule__Visual__Group_6__1__Impl ;
    public final void rule__Visual__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3007:1: ( rule__Visual__Group_6__1__Impl )
            // InternalMyDsl.g:3008:2: rule__Visual__Group_6__1__Impl
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
    // InternalMyDsl.g:3014:1: rule__Visual__Group_6__1__Impl : ( ( rule__Visual__MaterialAssignment_6_1 ) ) ;
    public final void rule__Visual__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3018:1: ( ( ( rule__Visual__MaterialAssignment_6_1 ) ) )
            // InternalMyDsl.g:3019:1: ( ( rule__Visual__MaterialAssignment_6_1 ) )
            {
            // InternalMyDsl.g:3019:1: ( ( rule__Visual__MaterialAssignment_6_1 ) )
            // InternalMyDsl.g:3020:2: ( rule__Visual__MaterialAssignment_6_1 )
            {
             before(grammarAccess.getVisualAccess().getMaterialAssignment_6_1()); 
            // InternalMyDsl.g:3021:2: ( rule__Visual__MaterialAssignment_6_1 )
            // InternalMyDsl.g:3021:3: rule__Visual__MaterialAssignment_6_1
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
    // InternalMyDsl.g:3030:1: rule__Origin__Group__0 : rule__Origin__Group__0__Impl rule__Origin__Group__1 ;
    public final void rule__Origin__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3034:1: ( rule__Origin__Group__0__Impl rule__Origin__Group__1 )
            // InternalMyDsl.g:3035:2: rule__Origin__Group__0__Impl rule__Origin__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalMyDsl.g:3042:1: rule__Origin__Group__0__Impl : ( () ) ;
    public final void rule__Origin__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3046:1: ( ( () ) )
            // InternalMyDsl.g:3047:1: ( () )
            {
            // InternalMyDsl.g:3047:1: ( () )
            // InternalMyDsl.g:3048:2: ()
            {
             before(grammarAccess.getOriginAccess().getOriginAction_0()); 
            // InternalMyDsl.g:3049:2: ()
            // InternalMyDsl.g:3049:3: 
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
    // InternalMyDsl.g:3057:1: rule__Origin__Group__1 : rule__Origin__Group__1__Impl rule__Origin__Group__2 ;
    public final void rule__Origin__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3061:1: ( rule__Origin__Group__1__Impl rule__Origin__Group__2 )
            // InternalMyDsl.g:3062:2: rule__Origin__Group__1__Impl rule__Origin__Group__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalMyDsl.g:3069:1: rule__Origin__Group__1__Impl : ( 'Origin' ) ;
    public final void rule__Origin__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3073:1: ( ( 'Origin' ) )
            // InternalMyDsl.g:3074:1: ( 'Origin' )
            {
            // InternalMyDsl.g:3074:1: ( 'Origin' )
            // InternalMyDsl.g:3075:2: 'Origin'
            {
             before(grammarAccess.getOriginAccess().getOriginKeyword_1()); 
            match(input,36,FOLLOW_2); 
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
    // InternalMyDsl.g:3084:1: rule__Origin__Group__2 : rule__Origin__Group__2__Impl rule__Origin__Group__3 ;
    public final void rule__Origin__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3088:1: ( rule__Origin__Group__2__Impl rule__Origin__Group__3 )
            // InternalMyDsl.g:3089:2: rule__Origin__Group__2__Impl rule__Origin__Group__3
            {
            pushFollow(FOLLOW_31);
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
    // InternalMyDsl.g:3096:1: rule__Origin__Group__2__Impl : ( ( rule__Origin__NameAssignment_2 )? ) ;
    public final void rule__Origin__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3100:1: ( ( ( rule__Origin__NameAssignment_2 )? ) )
            // InternalMyDsl.g:3101:1: ( ( rule__Origin__NameAssignment_2 )? )
            {
            // InternalMyDsl.g:3101:1: ( ( rule__Origin__NameAssignment_2 )? )
            // InternalMyDsl.g:3102:2: ( rule__Origin__NameAssignment_2 )?
            {
             before(grammarAccess.getOriginAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:3103:2: ( rule__Origin__NameAssignment_2 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_ID) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalMyDsl.g:3103:3: rule__Origin__NameAssignment_2
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
    // InternalMyDsl.g:3111:1: rule__Origin__Group__3 : rule__Origin__Group__3__Impl rule__Origin__Group__4 ;
    public final void rule__Origin__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3115:1: ( rule__Origin__Group__3__Impl rule__Origin__Group__4 )
            // InternalMyDsl.g:3116:2: rule__Origin__Group__3__Impl rule__Origin__Group__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:3123:1: rule__Origin__Group__3__Impl : ( 'x' ) ;
    public final void rule__Origin__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3127:1: ( ( 'x' ) )
            // InternalMyDsl.g:3128:1: ( 'x' )
            {
            // InternalMyDsl.g:3128:1: ( 'x' )
            // InternalMyDsl.g:3129:2: 'x'
            {
             before(grammarAccess.getOriginAccess().getXKeyword_3()); 
            match(input,37,FOLLOW_2); 
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
    // InternalMyDsl.g:3138:1: rule__Origin__Group__4 : rule__Origin__Group__4__Impl rule__Origin__Group__5 ;
    public final void rule__Origin__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3142:1: ( rule__Origin__Group__4__Impl rule__Origin__Group__5 )
            // InternalMyDsl.g:3143:2: rule__Origin__Group__4__Impl rule__Origin__Group__5
            {
            pushFollow(FOLLOW_32);
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
    // InternalMyDsl.g:3150:1: rule__Origin__Group__4__Impl : ( ( rule__Origin__XAssignment_4 ) ) ;
    public final void rule__Origin__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3154:1: ( ( ( rule__Origin__XAssignment_4 ) ) )
            // InternalMyDsl.g:3155:1: ( ( rule__Origin__XAssignment_4 ) )
            {
            // InternalMyDsl.g:3155:1: ( ( rule__Origin__XAssignment_4 ) )
            // InternalMyDsl.g:3156:2: ( rule__Origin__XAssignment_4 )
            {
             before(grammarAccess.getOriginAccess().getXAssignment_4()); 
            // InternalMyDsl.g:3157:2: ( rule__Origin__XAssignment_4 )
            // InternalMyDsl.g:3157:3: rule__Origin__XAssignment_4
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
    // InternalMyDsl.g:3165:1: rule__Origin__Group__5 : rule__Origin__Group__5__Impl rule__Origin__Group__6 ;
    public final void rule__Origin__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3169:1: ( rule__Origin__Group__5__Impl rule__Origin__Group__6 )
            // InternalMyDsl.g:3170:2: rule__Origin__Group__5__Impl rule__Origin__Group__6
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:3177:1: rule__Origin__Group__5__Impl : ( 'y' ) ;
    public final void rule__Origin__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3181:1: ( ( 'y' ) )
            // InternalMyDsl.g:3182:1: ( 'y' )
            {
            // InternalMyDsl.g:3182:1: ( 'y' )
            // InternalMyDsl.g:3183:2: 'y'
            {
             before(grammarAccess.getOriginAccess().getYKeyword_5()); 
            match(input,38,FOLLOW_2); 
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
    // InternalMyDsl.g:3192:1: rule__Origin__Group__6 : rule__Origin__Group__6__Impl rule__Origin__Group__7 ;
    public final void rule__Origin__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3196:1: ( rule__Origin__Group__6__Impl rule__Origin__Group__7 )
            // InternalMyDsl.g:3197:2: rule__Origin__Group__6__Impl rule__Origin__Group__7
            {
            pushFollow(FOLLOW_33);
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
    // InternalMyDsl.g:3204:1: rule__Origin__Group__6__Impl : ( ( rule__Origin__YAssignment_6 ) ) ;
    public final void rule__Origin__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3208:1: ( ( ( rule__Origin__YAssignment_6 ) ) )
            // InternalMyDsl.g:3209:1: ( ( rule__Origin__YAssignment_6 ) )
            {
            // InternalMyDsl.g:3209:1: ( ( rule__Origin__YAssignment_6 ) )
            // InternalMyDsl.g:3210:2: ( rule__Origin__YAssignment_6 )
            {
             before(grammarAccess.getOriginAccess().getYAssignment_6()); 
            // InternalMyDsl.g:3211:2: ( rule__Origin__YAssignment_6 )
            // InternalMyDsl.g:3211:3: rule__Origin__YAssignment_6
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
    // InternalMyDsl.g:3219:1: rule__Origin__Group__7 : rule__Origin__Group__7__Impl rule__Origin__Group__8 ;
    public final void rule__Origin__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3223:1: ( rule__Origin__Group__7__Impl rule__Origin__Group__8 )
            // InternalMyDsl.g:3224:2: rule__Origin__Group__7__Impl rule__Origin__Group__8
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:3231:1: rule__Origin__Group__7__Impl : ( 'z' ) ;
    public final void rule__Origin__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3235:1: ( ( 'z' ) )
            // InternalMyDsl.g:3236:1: ( 'z' )
            {
            // InternalMyDsl.g:3236:1: ( 'z' )
            // InternalMyDsl.g:3237:2: 'z'
            {
             before(grammarAccess.getOriginAccess().getZKeyword_7()); 
            match(input,39,FOLLOW_2); 
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
    // InternalMyDsl.g:3246:1: rule__Origin__Group__8 : rule__Origin__Group__8__Impl rule__Origin__Group__9 ;
    public final void rule__Origin__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3250:1: ( rule__Origin__Group__8__Impl rule__Origin__Group__9 )
            // InternalMyDsl.g:3251:2: rule__Origin__Group__8__Impl rule__Origin__Group__9
            {
            pushFollow(FOLLOW_34);
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
    // InternalMyDsl.g:3258:1: rule__Origin__Group__8__Impl : ( ( rule__Origin__ZAssignment_8 ) ) ;
    public final void rule__Origin__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3262:1: ( ( ( rule__Origin__ZAssignment_8 ) ) )
            // InternalMyDsl.g:3263:1: ( ( rule__Origin__ZAssignment_8 ) )
            {
            // InternalMyDsl.g:3263:1: ( ( rule__Origin__ZAssignment_8 ) )
            // InternalMyDsl.g:3264:2: ( rule__Origin__ZAssignment_8 )
            {
             before(grammarAccess.getOriginAccess().getZAssignment_8()); 
            // InternalMyDsl.g:3265:2: ( rule__Origin__ZAssignment_8 )
            // InternalMyDsl.g:3265:3: rule__Origin__ZAssignment_8
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
    // InternalMyDsl.g:3273:1: rule__Origin__Group__9 : rule__Origin__Group__9__Impl rule__Origin__Group__10 ;
    public final void rule__Origin__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3277:1: ( rule__Origin__Group__9__Impl rule__Origin__Group__10 )
            // InternalMyDsl.g:3278:2: rule__Origin__Group__9__Impl rule__Origin__Group__10
            {
            pushFollow(FOLLOW_34);
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
    // InternalMyDsl.g:3285:1: rule__Origin__Group__9__Impl : ( ( rule__Origin__Group_9__0 )? ) ;
    public final void rule__Origin__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3289:1: ( ( ( rule__Origin__Group_9__0 )? ) )
            // InternalMyDsl.g:3290:1: ( ( rule__Origin__Group_9__0 )? )
            {
            // InternalMyDsl.g:3290:1: ( ( rule__Origin__Group_9__0 )? )
            // InternalMyDsl.g:3291:2: ( rule__Origin__Group_9__0 )?
            {
             before(grammarAccess.getOriginAccess().getGroup_9()); 
            // InternalMyDsl.g:3292:2: ( rule__Origin__Group_9__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==40) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalMyDsl.g:3292:3: rule__Origin__Group_9__0
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
    // InternalMyDsl.g:3300:1: rule__Origin__Group__10 : rule__Origin__Group__10__Impl rule__Origin__Group__11 ;
    public final void rule__Origin__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3304:1: ( rule__Origin__Group__10__Impl rule__Origin__Group__11 )
            // InternalMyDsl.g:3305:2: rule__Origin__Group__10__Impl rule__Origin__Group__11
            {
            pushFollow(FOLLOW_34);
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
    // InternalMyDsl.g:3312:1: rule__Origin__Group__10__Impl : ( ( rule__Origin__Group_10__0 )? ) ;
    public final void rule__Origin__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3316:1: ( ( ( rule__Origin__Group_10__0 )? ) )
            // InternalMyDsl.g:3317:1: ( ( rule__Origin__Group_10__0 )? )
            {
            // InternalMyDsl.g:3317:1: ( ( rule__Origin__Group_10__0 )? )
            // InternalMyDsl.g:3318:2: ( rule__Origin__Group_10__0 )?
            {
             before(grammarAccess.getOriginAccess().getGroup_10()); 
            // InternalMyDsl.g:3319:2: ( rule__Origin__Group_10__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==41) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalMyDsl.g:3319:3: rule__Origin__Group_10__0
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
    // InternalMyDsl.g:3327:1: rule__Origin__Group__11 : rule__Origin__Group__11__Impl ;
    public final void rule__Origin__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3331:1: ( rule__Origin__Group__11__Impl )
            // InternalMyDsl.g:3332:2: rule__Origin__Group__11__Impl
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
    // InternalMyDsl.g:3338:1: rule__Origin__Group__11__Impl : ( ( rule__Origin__Group_11__0 )? ) ;
    public final void rule__Origin__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3342:1: ( ( ( rule__Origin__Group_11__0 )? ) )
            // InternalMyDsl.g:3343:1: ( ( rule__Origin__Group_11__0 )? )
            {
            // InternalMyDsl.g:3343:1: ( ( rule__Origin__Group_11__0 )? )
            // InternalMyDsl.g:3344:2: ( rule__Origin__Group_11__0 )?
            {
             before(grammarAccess.getOriginAccess().getGroup_11()); 
            // InternalMyDsl.g:3345:2: ( rule__Origin__Group_11__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==42) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalMyDsl.g:3345:3: rule__Origin__Group_11__0
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
    // InternalMyDsl.g:3354:1: rule__Origin__Group_9__0 : rule__Origin__Group_9__0__Impl rule__Origin__Group_9__1 ;
    public final void rule__Origin__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3358:1: ( rule__Origin__Group_9__0__Impl rule__Origin__Group_9__1 )
            // InternalMyDsl.g:3359:2: rule__Origin__Group_9__0__Impl rule__Origin__Group_9__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:3366:1: rule__Origin__Group_9__0__Impl : ( 'roll' ) ;
    public final void rule__Origin__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3370:1: ( ( 'roll' ) )
            // InternalMyDsl.g:3371:1: ( 'roll' )
            {
            // InternalMyDsl.g:3371:1: ( 'roll' )
            // InternalMyDsl.g:3372:2: 'roll'
            {
             before(grammarAccess.getOriginAccess().getRollKeyword_9_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalMyDsl.g:3381:1: rule__Origin__Group_9__1 : rule__Origin__Group_9__1__Impl ;
    public final void rule__Origin__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3385:1: ( rule__Origin__Group_9__1__Impl )
            // InternalMyDsl.g:3386:2: rule__Origin__Group_9__1__Impl
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
    // InternalMyDsl.g:3392:1: rule__Origin__Group_9__1__Impl : ( ( rule__Origin__RollAssignment_9_1 ) ) ;
    public final void rule__Origin__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3396:1: ( ( ( rule__Origin__RollAssignment_9_1 ) ) )
            // InternalMyDsl.g:3397:1: ( ( rule__Origin__RollAssignment_9_1 ) )
            {
            // InternalMyDsl.g:3397:1: ( ( rule__Origin__RollAssignment_9_1 ) )
            // InternalMyDsl.g:3398:2: ( rule__Origin__RollAssignment_9_1 )
            {
             before(grammarAccess.getOriginAccess().getRollAssignment_9_1()); 
            // InternalMyDsl.g:3399:2: ( rule__Origin__RollAssignment_9_1 )
            // InternalMyDsl.g:3399:3: rule__Origin__RollAssignment_9_1
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
    // InternalMyDsl.g:3408:1: rule__Origin__Group_10__0 : rule__Origin__Group_10__0__Impl rule__Origin__Group_10__1 ;
    public final void rule__Origin__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3412:1: ( rule__Origin__Group_10__0__Impl rule__Origin__Group_10__1 )
            // InternalMyDsl.g:3413:2: rule__Origin__Group_10__0__Impl rule__Origin__Group_10__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:3420:1: rule__Origin__Group_10__0__Impl : ( 'pitch' ) ;
    public final void rule__Origin__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3424:1: ( ( 'pitch' ) )
            // InternalMyDsl.g:3425:1: ( 'pitch' )
            {
            // InternalMyDsl.g:3425:1: ( 'pitch' )
            // InternalMyDsl.g:3426:2: 'pitch'
            {
             before(grammarAccess.getOriginAccess().getPitchKeyword_10_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalMyDsl.g:3435:1: rule__Origin__Group_10__1 : rule__Origin__Group_10__1__Impl ;
    public final void rule__Origin__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3439:1: ( rule__Origin__Group_10__1__Impl )
            // InternalMyDsl.g:3440:2: rule__Origin__Group_10__1__Impl
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
    // InternalMyDsl.g:3446:1: rule__Origin__Group_10__1__Impl : ( ( rule__Origin__PitchAssignment_10_1 ) ) ;
    public final void rule__Origin__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3450:1: ( ( ( rule__Origin__PitchAssignment_10_1 ) ) )
            // InternalMyDsl.g:3451:1: ( ( rule__Origin__PitchAssignment_10_1 ) )
            {
            // InternalMyDsl.g:3451:1: ( ( rule__Origin__PitchAssignment_10_1 ) )
            // InternalMyDsl.g:3452:2: ( rule__Origin__PitchAssignment_10_1 )
            {
             before(grammarAccess.getOriginAccess().getPitchAssignment_10_1()); 
            // InternalMyDsl.g:3453:2: ( rule__Origin__PitchAssignment_10_1 )
            // InternalMyDsl.g:3453:3: rule__Origin__PitchAssignment_10_1
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
    // InternalMyDsl.g:3462:1: rule__Origin__Group_11__0 : rule__Origin__Group_11__0__Impl rule__Origin__Group_11__1 ;
    public final void rule__Origin__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3466:1: ( rule__Origin__Group_11__0__Impl rule__Origin__Group_11__1 )
            // InternalMyDsl.g:3467:2: rule__Origin__Group_11__0__Impl rule__Origin__Group_11__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:3474:1: rule__Origin__Group_11__0__Impl : ( 'yaw' ) ;
    public final void rule__Origin__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3478:1: ( ( 'yaw' ) )
            // InternalMyDsl.g:3479:1: ( 'yaw' )
            {
            // InternalMyDsl.g:3479:1: ( 'yaw' )
            // InternalMyDsl.g:3480:2: 'yaw'
            {
             before(grammarAccess.getOriginAccess().getYawKeyword_11_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalMyDsl.g:3489:1: rule__Origin__Group_11__1 : rule__Origin__Group_11__1__Impl ;
    public final void rule__Origin__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3493:1: ( rule__Origin__Group_11__1__Impl )
            // InternalMyDsl.g:3494:2: rule__Origin__Group_11__1__Impl
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
    // InternalMyDsl.g:3500:1: rule__Origin__Group_11__1__Impl : ( ( rule__Origin__YawAssignment_11_1 ) ) ;
    public final void rule__Origin__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3504:1: ( ( ( rule__Origin__YawAssignment_11_1 ) ) )
            // InternalMyDsl.g:3505:1: ( ( rule__Origin__YawAssignment_11_1 ) )
            {
            // InternalMyDsl.g:3505:1: ( ( rule__Origin__YawAssignment_11_1 ) )
            // InternalMyDsl.g:3506:2: ( rule__Origin__YawAssignment_11_1 )
            {
             before(grammarAccess.getOriginAccess().getYawAssignment_11_1()); 
            // InternalMyDsl.g:3507:2: ( rule__Origin__YawAssignment_11_1 )
            // InternalMyDsl.g:3507:3: rule__Origin__YawAssignment_11_1
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
    // InternalMyDsl.g:3516:1: rule__Mass__Group__0 : rule__Mass__Group__0__Impl rule__Mass__Group__1 ;
    public final void rule__Mass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3520:1: ( rule__Mass__Group__0__Impl rule__Mass__Group__1 )
            // InternalMyDsl.g:3521:2: rule__Mass__Group__0__Impl rule__Mass__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalMyDsl.g:3528:1: rule__Mass__Group__0__Impl : ( () ) ;
    public final void rule__Mass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3532:1: ( ( () ) )
            // InternalMyDsl.g:3533:1: ( () )
            {
            // InternalMyDsl.g:3533:1: ( () )
            // InternalMyDsl.g:3534:2: ()
            {
             before(grammarAccess.getMassAccess().getMassAction_0()); 
            // InternalMyDsl.g:3535:2: ()
            // InternalMyDsl.g:3535:3: 
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
    // InternalMyDsl.g:3543:1: rule__Mass__Group__1 : rule__Mass__Group__1__Impl rule__Mass__Group__2 ;
    public final void rule__Mass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3547:1: ( rule__Mass__Group__1__Impl rule__Mass__Group__2 )
            // InternalMyDsl.g:3548:2: rule__Mass__Group__1__Impl rule__Mass__Group__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalMyDsl.g:3555:1: rule__Mass__Group__1__Impl : ( 'Mass' ) ;
    public final void rule__Mass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3559:1: ( ( 'Mass' ) )
            // InternalMyDsl.g:3560:1: ( 'Mass' )
            {
            // InternalMyDsl.g:3560:1: ( 'Mass' )
            // InternalMyDsl.g:3561:2: 'Mass'
            {
             before(grammarAccess.getMassAccess().getMassKeyword_1()); 
            match(input,43,FOLLOW_2); 
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
    // InternalMyDsl.g:3570:1: rule__Mass__Group__2 : rule__Mass__Group__2__Impl rule__Mass__Group__3 ;
    public final void rule__Mass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3574:1: ( rule__Mass__Group__2__Impl rule__Mass__Group__3 )
            // InternalMyDsl.g:3575:2: rule__Mass__Group__2__Impl rule__Mass__Group__3
            {
            pushFollow(FOLLOW_35);
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
    // InternalMyDsl.g:3582:1: rule__Mass__Group__2__Impl : ( ( rule__Mass__NameAssignment_2 )? ) ;
    public final void rule__Mass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3586:1: ( ( ( rule__Mass__NameAssignment_2 )? ) )
            // InternalMyDsl.g:3587:1: ( ( rule__Mass__NameAssignment_2 )? )
            {
            // InternalMyDsl.g:3587:1: ( ( rule__Mass__NameAssignment_2 )? )
            // InternalMyDsl.g:3588:2: ( rule__Mass__NameAssignment_2 )?
            {
             before(grammarAccess.getMassAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:3589:2: ( rule__Mass__NameAssignment_2 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_ID) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalMyDsl.g:3589:3: rule__Mass__NameAssignment_2
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
    // InternalMyDsl.g:3597:1: rule__Mass__Group__3 : rule__Mass__Group__3__Impl rule__Mass__Group__4 ;
    public final void rule__Mass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3601:1: ( rule__Mass__Group__3__Impl rule__Mass__Group__4 )
            // InternalMyDsl.g:3602:2: rule__Mass__Group__3__Impl rule__Mass__Group__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:3609:1: rule__Mass__Group__3__Impl : ( 'massKilogram' ) ;
    public final void rule__Mass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3613:1: ( ( 'massKilogram' ) )
            // InternalMyDsl.g:3614:1: ( 'massKilogram' )
            {
            // InternalMyDsl.g:3614:1: ( 'massKilogram' )
            // InternalMyDsl.g:3615:2: 'massKilogram'
            {
             before(grammarAccess.getMassAccess().getMassKilogramKeyword_3()); 
            match(input,44,FOLLOW_2); 
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
    // InternalMyDsl.g:3624:1: rule__Mass__Group__4 : rule__Mass__Group__4__Impl ;
    public final void rule__Mass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3628:1: ( rule__Mass__Group__4__Impl )
            // InternalMyDsl.g:3629:2: rule__Mass__Group__4__Impl
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
    // InternalMyDsl.g:3635:1: rule__Mass__Group__4__Impl : ( ( rule__Mass__MassKilogramAssignment_4 ) ) ;
    public final void rule__Mass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3639:1: ( ( ( rule__Mass__MassKilogramAssignment_4 ) ) )
            // InternalMyDsl.g:3640:1: ( ( rule__Mass__MassKilogramAssignment_4 ) )
            {
            // InternalMyDsl.g:3640:1: ( ( rule__Mass__MassKilogramAssignment_4 ) )
            // InternalMyDsl.g:3641:2: ( rule__Mass__MassKilogramAssignment_4 )
            {
             before(grammarAccess.getMassAccess().getMassKilogramAssignment_4()); 
            // InternalMyDsl.g:3642:2: ( rule__Mass__MassKilogramAssignment_4 )
            // InternalMyDsl.g:3642:3: rule__Mass__MassKilogramAssignment_4
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
    // InternalMyDsl.g:3651:1: rule__Collision__Group__0 : rule__Collision__Group__0__Impl rule__Collision__Group__1 ;
    public final void rule__Collision__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3655:1: ( rule__Collision__Group__0__Impl rule__Collision__Group__1 )
            // InternalMyDsl.g:3656:2: rule__Collision__Group__0__Impl rule__Collision__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalMyDsl.g:3663:1: rule__Collision__Group__0__Impl : ( 'Collision' ) ;
    public final void rule__Collision__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3667:1: ( ( 'Collision' ) )
            // InternalMyDsl.g:3668:1: ( 'Collision' )
            {
            // InternalMyDsl.g:3668:1: ( 'Collision' )
            // InternalMyDsl.g:3669:2: 'Collision'
            {
             before(grammarAccess.getCollisionAccess().getCollisionKeyword_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalMyDsl.g:3678:1: rule__Collision__Group__1 : rule__Collision__Group__1__Impl rule__Collision__Group__2 ;
    public final void rule__Collision__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3682:1: ( rule__Collision__Group__1__Impl rule__Collision__Group__2 )
            // InternalMyDsl.g:3683:2: rule__Collision__Group__1__Impl rule__Collision__Group__2
            {
            pushFollow(FOLLOW_36);
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
    // InternalMyDsl.g:3690:1: rule__Collision__Group__1__Impl : ( ( rule__Collision__NameAssignment_1 ) ) ;
    public final void rule__Collision__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3694:1: ( ( ( rule__Collision__NameAssignment_1 ) ) )
            // InternalMyDsl.g:3695:1: ( ( rule__Collision__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:3695:1: ( ( rule__Collision__NameAssignment_1 ) )
            // InternalMyDsl.g:3696:2: ( rule__Collision__NameAssignment_1 )
            {
             before(grammarAccess.getCollisionAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:3697:2: ( rule__Collision__NameAssignment_1 )
            // InternalMyDsl.g:3697:3: rule__Collision__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Collision__NameAssignment_1();

            state._fsp--;


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
    // InternalMyDsl.g:3705:1: rule__Collision__Group__2 : rule__Collision__Group__2__Impl rule__Collision__Group__3 ;
    public final void rule__Collision__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3709:1: ( rule__Collision__Group__2__Impl rule__Collision__Group__3 )
            // InternalMyDsl.g:3710:2: rule__Collision__Group__2__Impl rule__Collision__Group__3
            {
            pushFollow(FOLLOW_37);
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
    // InternalMyDsl.g:3717:1: rule__Collision__Group__2__Impl : ( 'Geometry' ) ;
    public final void rule__Collision__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3721:1: ( ( 'Geometry' ) )
            // InternalMyDsl.g:3722:1: ( 'Geometry' )
            {
            // InternalMyDsl.g:3722:1: ( 'Geometry' )
            // InternalMyDsl.g:3723:2: 'Geometry'
            {
             before(grammarAccess.getCollisionAccess().getGeometryKeyword_2()); 
            match(input,34,FOLLOW_2); 
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
    // InternalMyDsl.g:3732:1: rule__Collision__Group__3 : rule__Collision__Group__3__Impl rule__Collision__Group__4 ;
    public final void rule__Collision__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3736:1: ( rule__Collision__Group__3__Impl rule__Collision__Group__4 )
            // InternalMyDsl.g:3737:2: rule__Collision__Group__3__Impl rule__Collision__Group__4
            {
            pushFollow(FOLLOW_37);
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
    // InternalMyDsl.g:3744:1: rule__Collision__Group__3__Impl : ( ( rule__Collision__GeometryAssignment_3 )* ) ;
    public final void rule__Collision__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3748:1: ( ( ( rule__Collision__GeometryAssignment_3 )* ) )
            // InternalMyDsl.g:3749:1: ( ( rule__Collision__GeometryAssignment_3 )* )
            {
            // InternalMyDsl.g:3749:1: ( ( rule__Collision__GeometryAssignment_3 )* )
            // InternalMyDsl.g:3750:2: ( rule__Collision__GeometryAssignment_3 )*
            {
             before(grammarAccess.getCollisionAccess().getGeometryAssignment_3()); 
            // InternalMyDsl.g:3751:2: ( rule__Collision__GeometryAssignment_3 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==46||LA33_0==50||LA33_0==52||LA33_0==54) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalMyDsl.g:3751:3: rule__Collision__GeometryAssignment_3
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__Collision__GeometryAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

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
    // InternalMyDsl.g:3759:1: rule__Collision__Group__4 : rule__Collision__Group__4__Impl ;
    public final void rule__Collision__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3763:1: ( rule__Collision__Group__4__Impl )
            // InternalMyDsl.g:3764:2: rule__Collision__Group__4__Impl
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
    // InternalMyDsl.g:3770:1: rule__Collision__Group__4__Impl : ( ( rule__Collision__OriginAssignment_4 )? ) ;
    public final void rule__Collision__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3774:1: ( ( ( rule__Collision__OriginAssignment_4 )? ) )
            // InternalMyDsl.g:3775:1: ( ( rule__Collision__OriginAssignment_4 )? )
            {
            // InternalMyDsl.g:3775:1: ( ( rule__Collision__OriginAssignment_4 )? )
            // InternalMyDsl.g:3776:2: ( rule__Collision__OriginAssignment_4 )?
            {
             before(grammarAccess.getCollisionAccess().getOriginAssignment_4()); 
            // InternalMyDsl.g:3777:2: ( rule__Collision__OriginAssignment_4 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==36) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalMyDsl.g:3777:3: rule__Collision__OriginAssignment_4
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
    // InternalMyDsl.g:3786:1: rule__Box__Group__0 : rule__Box__Group__0__Impl rule__Box__Group__1 ;
    public final void rule__Box__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3790:1: ( rule__Box__Group__0__Impl rule__Box__Group__1 )
            // InternalMyDsl.g:3791:2: rule__Box__Group__0__Impl rule__Box__Group__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalMyDsl.g:3798:1: rule__Box__Group__0__Impl : ( 'Box' ) ;
    public final void rule__Box__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3802:1: ( ( 'Box' ) )
            // InternalMyDsl.g:3803:1: ( 'Box' )
            {
            // InternalMyDsl.g:3803:1: ( 'Box' )
            // InternalMyDsl.g:3804:2: 'Box'
            {
             before(grammarAccess.getBoxAccess().getBoxKeyword_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalMyDsl.g:3813:1: rule__Box__Group__1 : rule__Box__Group__1__Impl rule__Box__Group__2 ;
    public final void rule__Box__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3817:1: ( rule__Box__Group__1__Impl rule__Box__Group__2 )
            // InternalMyDsl.g:3818:2: rule__Box__Group__1__Impl rule__Box__Group__2
            {
            pushFollow(FOLLOW_38);
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
    // InternalMyDsl.g:3825:1: rule__Box__Group__1__Impl : ( ( rule__Box__NameAssignment_1 )? ) ;
    public final void rule__Box__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3829:1: ( ( ( rule__Box__NameAssignment_1 )? ) )
            // InternalMyDsl.g:3830:1: ( ( rule__Box__NameAssignment_1 )? )
            {
            // InternalMyDsl.g:3830:1: ( ( rule__Box__NameAssignment_1 )? )
            // InternalMyDsl.g:3831:2: ( rule__Box__NameAssignment_1 )?
            {
             before(grammarAccess.getBoxAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:3832:2: ( rule__Box__NameAssignment_1 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_ID) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalMyDsl.g:3832:3: rule__Box__NameAssignment_1
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
    // InternalMyDsl.g:3840:1: rule__Box__Group__2 : rule__Box__Group__2__Impl rule__Box__Group__3 ;
    public final void rule__Box__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3844:1: ( rule__Box__Group__2__Impl rule__Box__Group__3 )
            // InternalMyDsl.g:3845:2: rule__Box__Group__2__Impl rule__Box__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:3852:1: rule__Box__Group__2__Impl : ( 'height' ) ;
    public final void rule__Box__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3856:1: ( ( 'height' ) )
            // InternalMyDsl.g:3857:1: ( 'height' )
            {
            // InternalMyDsl.g:3857:1: ( 'height' )
            // InternalMyDsl.g:3858:2: 'height'
            {
             before(grammarAccess.getBoxAccess().getHeightKeyword_2()); 
            match(input,47,FOLLOW_2); 
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
    // InternalMyDsl.g:3867:1: rule__Box__Group__3 : rule__Box__Group__3__Impl rule__Box__Group__4 ;
    public final void rule__Box__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3871:1: ( rule__Box__Group__3__Impl rule__Box__Group__4 )
            // InternalMyDsl.g:3872:2: rule__Box__Group__3__Impl rule__Box__Group__4
            {
            pushFollow(FOLLOW_39);
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
    // InternalMyDsl.g:3879:1: rule__Box__Group__3__Impl : ( ( rule__Box__HeightAssignment_3 ) ) ;
    public final void rule__Box__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3883:1: ( ( ( rule__Box__HeightAssignment_3 ) ) )
            // InternalMyDsl.g:3884:1: ( ( rule__Box__HeightAssignment_3 ) )
            {
            // InternalMyDsl.g:3884:1: ( ( rule__Box__HeightAssignment_3 ) )
            // InternalMyDsl.g:3885:2: ( rule__Box__HeightAssignment_3 )
            {
             before(grammarAccess.getBoxAccess().getHeightAssignment_3()); 
            // InternalMyDsl.g:3886:2: ( rule__Box__HeightAssignment_3 )
            // InternalMyDsl.g:3886:3: rule__Box__HeightAssignment_3
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
    // InternalMyDsl.g:3894:1: rule__Box__Group__4 : rule__Box__Group__4__Impl rule__Box__Group__5 ;
    public final void rule__Box__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3898:1: ( rule__Box__Group__4__Impl rule__Box__Group__5 )
            // InternalMyDsl.g:3899:2: rule__Box__Group__4__Impl rule__Box__Group__5
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:3906:1: rule__Box__Group__4__Impl : ( 'length' ) ;
    public final void rule__Box__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3910:1: ( ( 'length' ) )
            // InternalMyDsl.g:3911:1: ( 'length' )
            {
            // InternalMyDsl.g:3911:1: ( 'length' )
            // InternalMyDsl.g:3912:2: 'length'
            {
             before(grammarAccess.getBoxAccess().getLengthKeyword_4()); 
            match(input,48,FOLLOW_2); 
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
    // InternalMyDsl.g:3921:1: rule__Box__Group__5 : rule__Box__Group__5__Impl rule__Box__Group__6 ;
    public final void rule__Box__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3925:1: ( rule__Box__Group__5__Impl rule__Box__Group__6 )
            // InternalMyDsl.g:3926:2: rule__Box__Group__5__Impl rule__Box__Group__6
            {
            pushFollow(FOLLOW_40);
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
    // InternalMyDsl.g:3933:1: rule__Box__Group__5__Impl : ( ( rule__Box__LengthAssignment_5 ) ) ;
    public final void rule__Box__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3937:1: ( ( ( rule__Box__LengthAssignment_5 ) ) )
            // InternalMyDsl.g:3938:1: ( ( rule__Box__LengthAssignment_5 ) )
            {
            // InternalMyDsl.g:3938:1: ( ( rule__Box__LengthAssignment_5 ) )
            // InternalMyDsl.g:3939:2: ( rule__Box__LengthAssignment_5 )
            {
             before(grammarAccess.getBoxAccess().getLengthAssignment_5()); 
            // InternalMyDsl.g:3940:2: ( rule__Box__LengthAssignment_5 )
            // InternalMyDsl.g:3940:3: rule__Box__LengthAssignment_5
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
    // InternalMyDsl.g:3948:1: rule__Box__Group__6 : rule__Box__Group__6__Impl rule__Box__Group__7 ;
    public final void rule__Box__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3952:1: ( rule__Box__Group__6__Impl rule__Box__Group__7 )
            // InternalMyDsl.g:3953:2: rule__Box__Group__6__Impl rule__Box__Group__7
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:3960:1: rule__Box__Group__6__Impl : ( 'width' ) ;
    public final void rule__Box__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3964:1: ( ( 'width' ) )
            // InternalMyDsl.g:3965:1: ( 'width' )
            {
            // InternalMyDsl.g:3965:1: ( 'width' )
            // InternalMyDsl.g:3966:2: 'width'
            {
             before(grammarAccess.getBoxAccess().getWidthKeyword_6()); 
            match(input,49,FOLLOW_2); 
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
    // InternalMyDsl.g:3975:1: rule__Box__Group__7 : rule__Box__Group__7__Impl ;
    public final void rule__Box__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3979:1: ( rule__Box__Group__7__Impl )
            // InternalMyDsl.g:3980:2: rule__Box__Group__7__Impl
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
    // InternalMyDsl.g:3986:1: rule__Box__Group__7__Impl : ( ( rule__Box__WidthAssignment_7 ) ) ;
    public final void rule__Box__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3990:1: ( ( ( rule__Box__WidthAssignment_7 ) ) )
            // InternalMyDsl.g:3991:1: ( ( rule__Box__WidthAssignment_7 ) )
            {
            // InternalMyDsl.g:3991:1: ( ( rule__Box__WidthAssignment_7 ) )
            // InternalMyDsl.g:3992:2: ( rule__Box__WidthAssignment_7 )
            {
             before(grammarAccess.getBoxAccess().getWidthAssignment_7()); 
            // InternalMyDsl.g:3993:2: ( rule__Box__WidthAssignment_7 )
            // InternalMyDsl.g:3993:3: rule__Box__WidthAssignment_7
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
    // InternalMyDsl.g:4002:1: rule__Cylinder__Group__0 : rule__Cylinder__Group__0__Impl rule__Cylinder__Group__1 ;
    public final void rule__Cylinder__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4006:1: ( rule__Cylinder__Group__0__Impl rule__Cylinder__Group__1 )
            // InternalMyDsl.g:4007:2: rule__Cylinder__Group__0__Impl rule__Cylinder__Group__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalMyDsl.g:4014:1: rule__Cylinder__Group__0__Impl : ( 'Cylinder' ) ;
    public final void rule__Cylinder__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4018:1: ( ( 'Cylinder' ) )
            // InternalMyDsl.g:4019:1: ( 'Cylinder' )
            {
            // InternalMyDsl.g:4019:1: ( 'Cylinder' )
            // InternalMyDsl.g:4020:2: 'Cylinder'
            {
             before(grammarAccess.getCylinderAccess().getCylinderKeyword_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalMyDsl.g:4029:1: rule__Cylinder__Group__1 : rule__Cylinder__Group__1__Impl rule__Cylinder__Group__2 ;
    public final void rule__Cylinder__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4033:1: ( rule__Cylinder__Group__1__Impl rule__Cylinder__Group__2 )
            // InternalMyDsl.g:4034:2: rule__Cylinder__Group__1__Impl rule__Cylinder__Group__2
            {
            pushFollow(FOLLOW_41);
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
    // InternalMyDsl.g:4041:1: rule__Cylinder__Group__1__Impl : ( ( rule__Cylinder__NameAssignment_1 )? ) ;
    public final void rule__Cylinder__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4045:1: ( ( ( rule__Cylinder__NameAssignment_1 )? ) )
            // InternalMyDsl.g:4046:1: ( ( rule__Cylinder__NameAssignment_1 )? )
            {
            // InternalMyDsl.g:4046:1: ( ( rule__Cylinder__NameAssignment_1 )? )
            // InternalMyDsl.g:4047:2: ( rule__Cylinder__NameAssignment_1 )?
            {
             before(grammarAccess.getCylinderAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:4048:2: ( rule__Cylinder__NameAssignment_1 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_ID) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalMyDsl.g:4048:3: rule__Cylinder__NameAssignment_1
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
    // InternalMyDsl.g:4056:1: rule__Cylinder__Group__2 : rule__Cylinder__Group__2__Impl rule__Cylinder__Group__3 ;
    public final void rule__Cylinder__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4060:1: ( rule__Cylinder__Group__2__Impl rule__Cylinder__Group__3 )
            // InternalMyDsl.g:4061:2: rule__Cylinder__Group__2__Impl rule__Cylinder__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:4068:1: rule__Cylinder__Group__2__Impl : ( 'radius' ) ;
    public final void rule__Cylinder__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4072:1: ( ( 'radius' ) )
            // InternalMyDsl.g:4073:1: ( 'radius' )
            {
            // InternalMyDsl.g:4073:1: ( 'radius' )
            // InternalMyDsl.g:4074:2: 'radius'
            {
             before(grammarAccess.getCylinderAccess().getRadiusKeyword_2()); 
            match(input,51,FOLLOW_2); 
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
    // InternalMyDsl.g:4083:1: rule__Cylinder__Group__3 : rule__Cylinder__Group__3__Impl rule__Cylinder__Group__4 ;
    public final void rule__Cylinder__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4087:1: ( rule__Cylinder__Group__3__Impl rule__Cylinder__Group__4 )
            // InternalMyDsl.g:4088:2: rule__Cylinder__Group__3__Impl rule__Cylinder__Group__4
            {
            pushFollow(FOLLOW_39);
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
    // InternalMyDsl.g:4095:1: rule__Cylinder__Group__3__Impl : ( ( rule__Cylinder__RadiusAssignment_3 ) ) ;
    public final void rule__Cylinder__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4099:1: ( ( ( rule__Cylinder__RadiusAssignment_3 ) ) )
            // InternalMyDsl.g:4100:1: ( ( rule__Cylinder__RadiusAssignment_3 ) )
            {
            // InternalMyDsl.g:4100:1: ( ( rule__Cylinder__RadiusAssignment_3 ) )
            // InternalMyDsl.g:4101:2: ( rule__Cylinder__RadiusAssignment_3 )
            {
             before(grammarAccess.getCylinderAccess().getRadiusAssignment_3()); 
            // InternalMyDsl.g:4102:2: ( rule__Cylinder__RadiusAssignment_3 )
            // InternalMyDsl.g:4102:3: rule__Cylinder__RadiusAssignment_3
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
    // InternalMyDsl.g:4110:1: rule__Cylinder__Group__4 : rule__Cylinder__Group__4__Impl rule__Cylinder__Group__5 ;
    public final void rule__Cylinder__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4114:1: ( rule__Cylinder__Group__4__Impl rule__Cylinder__Group__5 )
            // InternalMyDsl.g:4115:2: rule__Cylinder__Group__4__Impl rule__Cylinder__Group__5
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:4122:1: rule__Cylinder__Group__4__Impl : ( 'length' ) ;
    public final void rule__Cylinder__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4126:1: ( ( 'length' ) )
            // InternalMyDsl.g:4127:1: ( 'length' )
            {
            // InternalMyDsl.g:4127:1: ( 'length' )
            // InternalMyDsl.g:4128:2: 'length'
            {
             before(grammarAccess.getCylinderAccess().getLengthKeyword_4()); 
            match(input,48,FOLLOW_2); 
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
    // InternalMyDsl.g:4137:1: rule__Cylinder__Group__5 : rule__Cylinder__Group__5__Impl ;
    public final void rule__Cylinder__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4141:1: ( rule__Cylinder__Group__5__Impl )
            // InternalMyDsl.g:4142:2: rule__Cylinder__Group__5__Impl
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
    // InternalMyDsl.g:4148:1: rule__Cylinder__Group__5__Impl : ( ( rule__Cylinder__LengthAssignment_5 ) ) ;
    public final void rule__Cylinder__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4152:1: ( ( ( rule__Cylinder__LengthAssignment_5 ) ) )
            // InternalMyDsl.g:4153:1: ( ( rule__Cylinder__LengthAssignment_5 ) )
            {
            // InternalMyDsl.g:4153:1: ( ( rule__Cylinder__LengthAssignment_5 ) )
            // InternalMyDsl.g:4154:2: ( rule__Cylinder__LengthAssignment_5 )
            {
             before(grammarAccess.getCylinderAccess().getLengthAssignment_5()); 
            // InternalMyDsl.g:4155:2: ( rule__Cylinder__LengthAssignment_5 )
            // InternalMyDsl.g:4155:3: rule__Cylinder__LengthAssignment_5
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
    // InternalMyDsl.g:4164:1: rule__Mesh__Group__0 : rule__Mesh__Group__0__Impl rule__Mesh__Group__1 ;
    public final void rule__Mesh__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4168:1: ( rule__Mesh__Group__0__Impl rule__Mesh__Group__1 )
            // InternalMyDsl.g:4169:2: rule__Mesh__Group__0__Impl rule__Mesh__Group__1
            {
            pushFollow(FOLLOW_42);
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
    // InternalMyDsl.g:4176:1: rule__Mesh__Group__0__Impl : ( 'Mesh' ) ;
    public final void rule__Mesh__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4180:1: ( ( 'Mesh' ) )
            // InternalMyDsl.g:4181:1: ( 'Mesh' )
            {
            // InternalMyDsl.g:4181:1: ( 'Mesh' )
            // InternalMyDsl.g:4182:2: 'Mesh'
            {
             before(grammarAccess.getMeshAccess().getMeshKeyword_0()); 
            match(input,52,FOLLOW_2); 
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
    // InternalMyDsl.g:4191:1: rule__Mesh__Group__1 : rule__Mesh__Group__1__Impl rule__Mesh__Group__2 ;
    public final void rule__Mesh__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4195:1: ( rule__Mesh__Group__1__Impl rule__Mesh__Group__2 )
            // InternalMyDsl.g:4196:2: rule__Mesh__Group__1__Impl rule__Mesh__Group__2
            {
            pushFollow(FOLLOW_42);
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
    // InternalMyDsl.g:4203:1: rule__Mesh__Group__1__Impl : ( ( rule__Mesh__NameAssignment_1 )? ) ;
    public final void rule__Mesh__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4207:1: ( ( ( rule__Mesh__NameAssignment_1 )? ) )
            // InternalMyDsl.g:4208:1: ( ( rule__Mesh__NameAssignment_1 )? )
            {
            // InternalMyDsl.g:4208:1: ( ( rule__Mesh__NameAssignment_1 )? )
            // InternalMyDsl.g:4209:2: ( rule__Mesh__NameAssignment_1 )?
            {
             before(grammarAccess.getMeshAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:4210:2: ( rule__Mesh__NameAssignment_1 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_ID) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalMyDsl.g:4210:3: rule__Mesh__NameAssignment_1
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
    // InternalMyDsl.g:4218:1: rule__Mesh__Group__2 : rule__Mesh__Group__2__Impl rule__Mesh__Group__3 ;
    public final void rule__Mesh__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4222:1: ( rule__Mesh__Group__2__Impl rule__Mesh__Group__3 )
            // InternalMyDsl.g:4223:2: rule__Mesh__Group__2__Impl rule__Mesh__Group__3
            {
            pushFollow(FOLLOW_43);
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
    // InternalMyDsl.g:4230:1: rule__Mesh__Group__2__Impl : ( 'pathToFile' ) ;
    public final void rule__Mesh__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4234:1: ( ( 'pathToFile' ) )
            // InternalMyDsl.g:4235:1: ( 'pathToFile' )
            {
            // InternalMyDsl.g:4235:1: ( 'pathToFile' )
            // InternalMyDsl.g:4236:2: 'pathToFile'
            {
             before(grammarAccess.getMeshAccess().getPathToFileKeyword_2()); 
            match(input,53,FOLLOW_2); 
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
    // InternalMyDsl.g:4245:1: rule__Mesh__Group__3 : rule__Mesh__Group__3__Impl ;
    public final void rule__Mesh__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4249:1: ( rule__Mesh__Group__3__Impl )
            // InternalMyDsl.g:4250:2: rule__Mesh__Group__3__Impl
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
    // InternalMyDsl.g:4256:1: rule__Mesh__Group__3__Impl : ( ( rule__Mesh__PathToFileAssignment_3 ) ) ;
    public final void rule__Mesh__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4260:1: ( ( ( rule__Mesh__PathToFileAssignment_3 ) ) )
            // InternalMyDsl.g:4261:1: ( ( rule__Mesh__PathToFileAssignment_3 ) )
            {
            // InternalMyDsl.g:4261:1: ( ( rule__Mesh__PathToFileAssignment_3 ) )
            // InternalMyDsl.g:4262:2: ( rule__Mesh__PathToFileAssignment_3 )
            {
             before(grammarAccess.getMeshAccess().getPathToFileAssignment_3()); 
            // InternalMyDsl.g:4263:2: ( rule__Mesh__PathToFileAssignment_3 )
            // InternalMyDsl.g:4263:3: rule__Mesh__PathToFileAssignment_3
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
    // InternalMyDsl.g:4272:1: rule__Sphere__Group__0 : rule__Sphere__Group__0__Impl rule__Sphere__Group__1 ;
    public final void rule__Sphere__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4276:1: ( rule__Sphere__Group__0__Impl rule__Sphere__Group__1 )
            // InternalMyDsl.g:4277:2: rule__Sphere__Group__0__Impl rule__Sphere__Group__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalMyDsl.g:4284:1: rule__Sphere__Group__0__Impl : ( 'Sphere' ) ;
    public final void rule__Sphere__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4288:1: ( ( 'Sphere' ) )
            // InternalMyDsl.g:4289:1: ( 'Sphere' )
            {
            // InternalMyDsl.g:4289:1: ( 'Sphere' )
            // InternalMyDsl.g:4290:2: 'Sphere'
            {
             before(grammarAccess.getSphereAccess().getSphereKeyword_0()); 
            match(input,54,FOLLOW_2); 
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
    // InternalMyDsl.g:4299:1: rule__Sphere__Group__1 : rule__Sphere__Group__1__Impl rule__Sphere__Group__2 ;
    public final void rule__Sphere__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4303:1: ( rule__Sphere__Group__1__Impl rule__Sphere__Group__2 )
            // InternalMyDsl.g:4304:2: rule__Sphere__Group__1__Impl rule__Sphere__Group__2
            {
            pushFollow(FOLLOW_41);
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
    // InternalMyDsl.g:4311:1: rule__Sphere__Group__1__Impl : ( ( rule__Sphere__NameAssignment_1 )? ) ;
    public final void rule__Sphere__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4315:1: ( ( ( rule__Sphere__NameAssignment_1 )? ) )
            // InternalMyDsl.g:4316:1: ( ( rule__Sphere__NameAssignment_1 )? )
            {
            // InternalMyDsl.g:4316:1: ( ( rule__Sphere__NameAssignment_1 )? )
            // InternalMyDsl.g:4317:2: ( rule__Sphere__NameAssignment_1 )?
            {
             before(grammarAccess.getSphereAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:4318:2: ( rule__Sphere__NameAssignment_1 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_ID) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalMyDsl.g:4318:3: rule__Sphere__NameAssignment_1
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
    // InternalMyDsl.g:4326:1: rule__Sphere__Group__2 : rule__Sphere__Group__2__Impl rule__Sphere__Group__3 ;
    public final void rule__Sphere__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4330:1: ( rule__Sphere__Group__2__Impl rule__Sphere__Group__3 )
            // InternalMyDsl.g:4331:2: rule__Sphere__Group__2__Impl rule__Sphere__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:4338:1: rule__Sphere__Group__2__Impl : ( 'radius' ) ;
    public final void rule__Sphere__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4342:1: ( ( 'radius' ) )
            // InternalMyDsl.g:4343:1: ( 'radius' )
            {
            // InternalMyDsl.g:4343:1: ( 'radius' )
            // InternalMyDsl.g:4344:2: 'radius'
            {
             before(grammarAccess.getSphereAccess().getRadiusKeyword_2()); 
            match(input,51,FOLLOW_2); 
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
    // InternalMyDsl.g:4353:1: rule__Sphere__Group__3 : rule__Sphere__Group__3__Impl ;
    public final void rule__Sphere__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4357:1: ( rule__Sphere__Group__3__Impl )
            // InternalMyDsl.g:4358:2: rule__Sphere__Group__3__Impl
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
    // InternalMyDsl.g:4364:1: rule__Sphere__Group__3__Impl : ( ( rule__Sphere__RadiusAssignment_3 ) ) ;
    public final void rule__Sphere__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4368:1: ( ( ( rule__Sphere__RadiusAssignment_3 ) ) )
            // InternalMyDsl.g:4369:1: ( ( rule__Sphere__RadiusAssignment_3 ) )
            {
            // InternalMyDsl.g:4369:1: ( ( rule__Sphere__RadiusAssignment_3 ) )
            // InternalMyDsl.g:4370:2: ( rule__Sphere__RadiusAssignment_3 )
            {
             before(grammarAccess.getSphereAccess().getRadiusAssignment_3()); 
            // InternalMyDsl.g:4371:2: ( rule__Sphere__RadiusAssignment_3 )
            // InternalMyDsl.g:4371:3: rule__Sphere__RadiusAssignment_3
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
    // InternalMyDsl.g:4380:1: rule__Texture__Group__0 : rule__Texture__Group__0__Impl rule__Texture__Group__1 ;
    public final void rule__Texture__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4384:1: ( rule__Texture__Group__0__Impl rule__Texture__Group__1 )
            // InternalMyDsl.g:4385:2: rule__Texture__Group__0__Impl rule__Texture__Group__1
            {
            pushFollow(FOLLOW_42);
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
    // InternalMyDsl.g:4392:1: rule__Texture__Group__0__Impl : ( 'Texture' ) ;
    public final void rule__Texture__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4396:1: ( ( 'Texture' ) )
            // InternalMyDsl.g:4397:1: ( 'Texture' )
            {
            // InternalMyDsl.g:4397:1: ( 'Texture' )
            // InternalMyDsl.g:4398:2: 'Texture'
            {
             before(grammarAccess.getTextureAccess().getTextureKeyword_0()); 
            match(input,55,FOLLOW_2); 
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
    // InternalMyDsl.g:4407:1: rule__Texture__Group__1 : rule__Texture__Group__1__Impl rule__Texture__Group__2 ;
    public final void rule__Texture__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4411:1: ( rule__Texture__Group__1__Impl rule__Texture__Group__2 )
            // InternalMyDsl.g:4412:2: rule__Texture__Group__1__Impl rule__Texture__Group__2
            {
            pushFollow(FOLLOW_42);
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
    // InternalMyDsl.g:4419:1: rule__Texture__Group__1__Impl : ( ( rule__Texture__NameAssignment_1 )? ) ;
    public final void rule__Texture__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4423:1: ( ( ( rule__Texture__NameAssignment_1 )? ) )
            // InternalMyDsl.g:4424:1: ( ( rule__Texture__NameAssignment_1 )? )
            {
            // InternalMyDsl.g:4424:1: ( ( rule__Texture__NameAssignment_1 )? )
            // InternalMyDsl.g:4425:2: ( rule__Texture__NameAssignment_1 )?
            {
             before(grammarAccess.getTextureAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:4426:2: ( rule__Texture__NameAssignment_1 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_ID) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalMyDsl.g:4426:3: rule__Texture__NameAssignment_1
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
    // InternalMyDsl.g:4434:1: rule__Texture__Group__2 : rule__Texture__Group__2__Impl rule__Texture__Group__3 ;
    public final void rule__Texture__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4438:1: ( rule__Texture__Group__2__Impl rule__Texture__Group__3 )
            // InternalMyDsl.g:4439:2: rule__Texture__Group__2__Impl rule__Texture__Group__3
            {
            pushFollow(FOLLOW_43);
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
    // InternalMyDsl.g:4446:1: rule__Texture__Group__2__Impl : ( 'pathToFile' ) ;
    public final void rule__Texture__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4450:1: ( ( 'pathToFile' ) )
            // InternalMyDsl.g:4451:1: ( 'pathToFile' )
            {
            // InternalMyDsl.g:4451:1: ( 'pathToFile' )
            // InternalMyDsl.g:4452:2: 'pathToFile'
            {
             before(grammarAccess.getTextureAccess().getPathToFileKeyword_2()); 
            match(input,53,FOLLOW_2); 
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
    // InternalMyDsl.g:4461:1: rule__Texture__Group__3 : rule__Texture__Group__3__Impl ;
    public final void rule__Texture__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4465:1: ( rule__Texture__Group__3__Impl )
            // InternalMyDsl.g:4466:2: rule__Texture__Group__3__Impl
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
    // InternalMyDsl.g:4472:1: rule__Texture__Group__3__Impl : ( ( rule__Texture__PathToFileAssignment_3 ) ) ;
    public final void rule__Texture__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4476:1: ( ( ( rule__Texture__PathToFileAssignment_3 ) ) )
            // InternalMyDsl.g:4477:1: ( ( rule__Texture__PathToFileAssignment_3 ) )
            {
            // InternalMyDsl.g:4477:1: ( ( rule__Texture__PathToFileAssignment_3 ) )
            // InternalMyDsl.g:4478:2: ( rule__Texture__PathToFileAssignment_3 )
            {
             before(grammarAccess.getTextureAccess().getPathToFileAssignment_3()); 
            // InternalMyDsl.g:4479:2: ( rule__Texture__PathToFileAssignment_3 )
            // InternalMyDsl.g:4479:3: rule__Texture__PathToFileAssignment_3
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
    // InternalMyDsl.g:4488:1: rule__Color__Group__0 : rule__Color__Group__0__Impl rule__Color__Group__1 ;
    public final void rule__Color__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4492:1: ( rule__Color__Group__0__Impl rule__Color__Group__1 )
            // InternalMyDsl.g:4493:2: rule__Color__Group__0__Impl rule__Color__Group__1
            {
            pushFollow(FOLLOW_44);
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
    // InternalMyDsl.g:4500:1: rule__Color__Group__0__Impl : ( 'Color' ) ;
    public final void rule__Color__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4504:1: ( ( 'Color' ) )
            // InternalMyDsl.g:4505:1: ( 'Color' )
            {
            // InternalMyDsl.g:4505:1: ( 'Color' )
            // InternalMyDsl.g:4506:2: 'Color'
            {
             before(grammarAccess.getColorAccess().getColorKeyword_0()); 
            match(input,56,FOLLOW_2); 
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
    // InternalMyDsl.g:4515:1: rule__Color__Group__1 : rule__Color__Group__1__Impl rule__Color__Group__2 ;
    public final void rule__Color__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4519:1: ( rule__Color__Group__1__Impl rule__Color__Group__2 )
            // InternalMyDsl.g:4520:2: rule__Color__Group__1__Impl rule__Color__Group__2
            {
            pushFollow(FOLLOW_44);
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
    // InternalMyDsl.g:4527:1: rule__Color__Group__1__Impl : ( ( rule__Color__NameAssignment_1 )? ) ;
    public final void rule__Color__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4531:1: ( ( ( rule__Color__NameAssignment_1 )? ) )
            // InternalMyDsl.g:4532:1: ( ( rule__Color__NameAssignment_1 )? )
            {
            // InternalMyDsl.g:4532:1: ( ( rule__Color__NameAssignment_1 )? )
            // InternalMyDsl.g:4533:2: ( rule__Color__NameAssignment_1 )?
            {
             before(grammarAccess.getColorAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:4534:2: ( rule__Color__NameAssignment_1 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_ID) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalMyDsl.g:4534:3: rule__Color__NameAssignment_1
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
    // InternalMyDsl.g:4542:1: rule__Color__Group__2 : rule__Color__Group__2__Impl rule__Color__Group__3 ;
    public final void rule__Color__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4546:1: ( rule__Color__Group__2__Impl rule__Color__Group__3 )
            // InternalMyDsl.g:4547:2: rule__Color__Group__2__Impl rule__Color__Group__3
            {
            pushFollow(FOLLOW_45);
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
    // InternalMyDsl.g:4554:1: rule__Color__Group__2__Impl : ( 'red' ) ;
    public final void rule__Color__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4558:1: ( ( 'red' ) )
            // InternalMyDsl.g:4559:1: ( 'red' )
            {
            // InternalMyDsl.g:4559:1: ( 'red' )
            // InternalMyDsl.g:4560:2: 'red'
            {
             before(grammarAccess.getColorAccess().getRedKeyword_2()); 
            match(input,57,FOLLOW_2); 
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
    // InternalMyDsl.g:4569:1: rule__Color__Group__3 : rule__Color__Group__3__Impl rule__Color__Group__4 ;
    public final void rule__Color__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4573:1: ( rule__Color__Group__3__Impl rule__Color__Group__4 )
            // InternalMyDsl.g:4574:2: rule__Color__Group__3__Impl rule__Color__Group__4
            {
            pushFollow(FOLLOW_46);
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
    // InternalMyDsl.g:4581:1: rule__Color__Group__3__Impl : ( ( rule__Color__RedAssignment_3 ) ) ;
    public final void rule__Color__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4585:1: ( ( ( rule__Color__RedAssignment_3 ) ) )
            // InternalMyDsl.g:4586:1: ( ( rule__Color__RedAssignment_3 ) )
            {
            // InternalMyDsl.g:4586:1: ( ( rule__Color__RedAssignment_3 ) )
            // InternalMyDsl.g:4587:2: ( rule__Color__RedAssignment_3 )
            {
             before(grammarAccess.getColorAccess().getRedAssignment_3()); 
            // InternalMyDsl.g:4588:2: ( rule__Color__RedAssignment_3 )
            // InternalMyDsl.g:4588:3: rule__Color__RedAssignment_3
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
    // InternalMyDsl.g:4596:1: rule__Color__Group__4 : rule__Color__Group__4__Impl rule__Color__Group__5 ;
    public final void rule__Color__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4600:1: ( rule__Color__Group__4__Impl rule__Color__Group__5 )
            // InternalMyDsl.g:4601:2: rule__Color__Group__4__Impl rule__Color__Group__5
            {
            pushFollow(FOLLOW_45);
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
    // InternalMyDsl.g:4608:1: rule__Color__Group__4__Impl : ( 'green' ) ;
    public final void rule__Color__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4612:1: ( ( 'green' ) )
            // InternalMyDsl.g:4613:1: ( 'green' )
            {
            // InternalMyDsl.g:4613:1: ( 'green' )
            // InternalMyDsl.g:4614:2: 'green'
            {
             before(grammarAccess.getColorAccess().getGreenKeyword_4()); 
            match(input,58,FOLLOW_2); 
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
    // InternalMyDsl.g:4623:1: rule__Color__Group__5 : rule__Color__Group__5__Impl rule__Color__Group__6 ;
    public final void rule__Color__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4627:1: ( rule__Color__Group__5__Impl rule__Color__Group__6 )
            // InternalMyDsl.g:4628:2: rule__Color__Group__5__Impl rule__Color__Group__6
            {
            pushFollow(FOLLOW_47);
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
    // InternalMyDsl.g:4635:1: rule__Color__Group__5__Impl : ( ( rule__Color__GreenAssignment_5 ) ) ;
    public final void rule__Color__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4639:1: ( ( ( rule__Color__GreenAssignment_5 ) ) )
            // InternalMyDsl.g:4640:1: ( ( rule__Color__GreenAssignment_5 ) )
            {
            // InternalMyDsl.g:4640:1: ( ( rule__Color__GreenAssignment_5 ) )
            // InternalMyDsl.g:4641:2: ( rule__Color__GreenAssignment_5 )
            {
             before(grammarAccess.getColorAccess().getGreenAssignment_5()); 
            // InternalMyDsl.g:4642:2: ( rule__Color__GreenAssignment_5 )
            // InternalMyDsl.g:4642:3: rule__Color__GreenAssignment_5
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
    // InternalMyDsl.g:4650:1: rule__Color__Group__6 : rule__Color__Group__6__Impl rule__Color__Group__7 ;
    public final void rule__Color__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4654:1: ( rule__Color__Group__6__Impl rule__Color__Group__7 )
            // InternalMyDsl.g:4655:2: rule__Color__Group__6__Impl rule__Color__Group__7
            {
            pushFollow(FOLLOW_45);
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
    // InternalMyDsl.g:4662:1: rule__Color__Group__6__Impl : ( 'blue' ) ;
    public final void rule__Color__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4666:1: ( ( 'blue' ) )
            // InternalMyDsl.g:4667:1: ( 'blue' )
            {
            // InternalMyDsl.g:4667:1: ( 'blue' )
            // InternalMyDsl.g:4668:2: 'blue'
            {
             before(grammarAccess.getColorAccess().getBlueKeyword_6()); 
            match(input,59,FOLLOW_2); 
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
    // InternalMyDsl.g:4677:1: rule__Color__Group__7 : rule__Color__Group__7__Impl rule__Color__Group__8 ;
    public final void rule__Color__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4681:1: ( rule__Color__Group__7__Impl rule__Color__Group__8 )
            // InternalMyDsl.g:4682:2: rule__Color__Group__7__Impl rule__Color__Group__8
            {
            pushFollow(FOLLOW_48);
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
    // InternalMyDsl.g:4689:1: rule__Color__Group__7__Impl : ( ( rule__Color__BlueAssignment_7 ) ) ;
    public final void rule__Color__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4693:1: ( ( ( rule__Color__BlueAssignment_7 ) ) )
            // InternalMyDsl.g:4694:1: ( ( rule__Color__BlueAssignment_7 ) )
            {
            // InternalMyDsl.g:4694:1: ( ( rule__Color__BlueAssignment_7 ) )
            // InternalMyDsl.g:4695:2: ( rule__Color__BlueAssignment_7 )
            {
             before(grammarAccess.getColorAccess().getBlueAssignment_7()); 
            // InternalMyDsl.g:4696:2: ( rule__Color__BlueAssignment_7 )
            // InternalMyDsl.g:4696:3: rule__Color__BlueAssignment_7
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
    // InternalMyDsl.g:4704:1: rule__Color__Group__8 : rule__Color__Group__8__Impl rule__Color__Group__9 ;
    public final void rule__Color__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4708:1: ( rule__Color__Group__8__Impl rule__Color__Group__9 )
            // InternalMyDsl.g:4709:2: rule__Color__Group__8__Impl rule__Color__Group__9
            {
            pushFollow(FOLLOW_45);
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
    // InternalMyDsl.g:4716:1: rule__Color__Group__8__Impl : ( 'alpha' ) ;
    public final void rule__Color__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4720:1: ( ( 'alpha' ) )
            // InternalMyDsl.g:4721:1: ( 'alpha' )
            {
            // InternalMyDsl.g:4721:1: ( 'alpha' )
            // InternalMyDsl.g:4722:2: 'alpha'
            {
             before(grammarAccess.getColorAccess().getAlphaKeyword_8()); 
            match(input,60,FOLLOW_2); 
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
    // InternalMyDsl.g:4731:1: rule__Color__Group__9 : rule__Color__Group__9__Impl ;
    public final void rule__Color__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4735:1: ( rule__Color__Group__9__Impl )
            // InternalMyDsl.g:4736:2: rule__Color__Group__9__Impl
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
    // InternalMyDsl.g:4742:1: rule__Color__Group__9__Impl : ( ( rule__Color__AlphaAssignment_9 ) ) ;
    public final void rule__Color__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4746:1: ( ( ( rule__Color__AlphaAssignment_9 ) ) )
            // InternalMyDsl.g:4747:1: ( ( rule__Color__AlphaAssignment_9 ) )
            {
            // InternalMyDsl.g:4747:1: ( ( rule__Color__AlphaAssignment_9 ) )
            // InternalMyDsl.g:4748:2: ( rule__Color__AlphaAssignment_9 )
            {
             before(grammarAccess.getColorAccess().getAlphaAssignment_9()); 
            // InternalMyDsl.g:4749:2: ( rule__Color__AlphaAssignment_9 )
            // InternalMyDsl.g:4749:3: rule__Color__AlphaAssignment_9
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
    // InternalMyDsl.g:4758:1: rule__Joint__Group__0 : rule__Joint__Group__0__Impl rule__Joint__Group__1 ;
    public final void rule__Joint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4762:1: ( rule__Joint__Group__0__Impl rule__Joint__Group__1 )
            // InternalMyDsl.g:4763:2: rule__Joint__Group__0__Impl rule__Joint__Group__1
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
    // InternalMyDsl.g:4770:1: rule__Joint__Group__0__Impl : ( 'Joint' ) ;
    public final void rule__Joint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4774:1: ( ( 'Joint' ) )
            // InternalMyDsl.g:4775:1: ( 'Joint' )
            {
            // InternalMyDsl.g:4775:1: ( 'Joint' )
            // InternalMyDsl.g:4776:2: 'Joint'
            {
             before(grammarAccess.getJointAccess().getJointKeyword_0()); 
            match(input,61,FOLLOW_2); 
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
    // InternalMyDsl.g:4785:1: rule__Joint__Group__1 : rule__Joint__Group__1__Impl rule__Joint__Group__2 ;
    public final void rule__Joint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4789:1: ( rule__Joint__Group__1__Impl rule__Joint__Group__2 )
            // InternalMyDsl.g:4790:2: rule__Joint__Group__1__Impl rule__Joint__Group__2
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
    // InternalMyDsl.g:4797:1: rule__Joint__Group__1__Impl : ( ( rule__Joint__NameAssignment_1 ) ) ;
    public final void rule__Joint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4801:1: ( ( ( rule__Joint__NameAssignment_1 ) ) )
            // InternalMyDsl.g:4802:1: ( ( rule__Joint__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:4802:1: ( ( rule__Joint__NameAssignment_1 ) )
            // InternalMyDsl.g:4803:2: ( rule__Joint__NameAssignment_1 )
            {
             before(grammarAccess.getJointAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:4804:2: ( rule__Joint__NameAssignment_1 )
            // InternalMyDsl.g:4804:3: rule__Joint__NameAssignment_1
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
    // InternalMyDsl.g:4812:1: rule__Joint__Group__2 : rule__Joint__Group__2__Impl ;
    public final void rule__Joint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4816:1: ( rule__Joint__Group__2__Impl )
            // InternalMyDsl.g:4817:2: rule__Joint__Group__2__Impl
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
    // InternalMyDsl.g:4823:1: rule__Joint__Group__2__Impl : ( ( rule__Joint__Alternatives_2 )? ) ;
    public final void rule__Joint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4827:1: ( ( ( rule__Joint__Alternatives_2 )? ) )
            // InternalMyDsl.g:4828:1: ( ( rule__Joint__Alternatives_2 )? )
            {
            // InternalMyDsl.g:4828:1: ( ( rule__Joint__Alternatives_2 )? )
            // InternalMyDsl.g:4829:2: ( rule__Joint__Alternatives_2 )?
            {
             before(grammarAccess.getJointAccess().getAlternatives_2()); 
            // InternalMyDsl.g:4830:2: ( rule__Joint__Alternatives_2 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=20 && LA41_0<=21)) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalMyDsl.g:4830:3: rule__Joint__Alternatives_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Joint__Alternatives_2();

                    state._fsp--;


                    }
                    break;

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
    // InternalMyDsl.g:4839:1: rule__Joint__Group_2_0__0 : rule__Joint__Group_2_0__0__Impl rule__Joint__Group_2_0__1 ;
    public final void rule__Joint__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4843:1: ( rule__Joint__Group_2_0__0__Impl rule__Joint__Group_2_0__1 )
            // InternalMyDsl.g:4844:2: rule__Joint__Group_2_0__0__Impl rule__Joint__Group_2_0__1
            {
            pushFollow(FOLLOW_49);
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
    // InternalMyDsl.g:4851:1: rule__Joint__Group_2_0__0__Impl : ( ( rule__Joint__Group_2_0_0__0 ) ) ;
    public final void rule__Joint__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4855:1: ( ( ( rule__Joint__Group_2_0_0__0 ) ) )
            // InternalMyDsl.g:4856:1: ( ( rule__Joint__Group_2_0_0__0 ) )
            {
            // InternalMyDsl.g:4856:1: ( ( rule__Joint__Group_2_0_0__0 ) )
            // InternalMyDsl.g:4857:2: ( rule__Joint__Group_2_0_0__0 )
            {
             before(grammarAccess.getJointAccess().getGroup_2_0_0()); 
            // InternalMyDsl.g:4858:2: ( rule__Joint__Group_2_0_0__0 )
            // InternalMyDsl.g:4858:3: rule__Joint__Group_2_0_0__0
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
    // InternalMyDsl.g:4866:1: rule__Joint__Group_2_0__1 : rule__Joint__Group_2_0__1__Impl ;
    public final void rule__Joint__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4870:1: ( rule__Joint__Group_2_0__1__Impl )
            // InternalMyDsl.g:4871:2: rule__Joint__Group_2_0__1__Impl
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
    // InternalMyDsl.g:4877:1: rule__Joint__Group_2_0__1__Impl : ( ( rule__Joint__Alternatives_2_0_1 )* ) ;
    public final void rule__Joint__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4881:1: ( ( ( rule__Joint__Alternatives_2_0_1 )* ) )
            // InternalMyDsl.g:4882:1: ( ( rule__Joint__Alternatives_2_0_1 )* )
            {
            // InternalMyDsl.g:4882:1: ( ( rule__Joint__Alternatives_2_0_1 )* )
            // InternalMyDsl.g:4883:2: ( rule__Joint__Alternatives_2_0_1 )*
            {
             before(grammarAccess.getJointAccess().getAlternatives_2_0_1()); 
            // InternalMyDsl.g:4884:2: ( rule__Joint__Alternatives_2_0_1 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==36||(LA42_0>=65 && LA42_0<=66)||LA42_0==71||LA42_0==74||LA42_0==77) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalMyDsl.g:4884:3: rule__Joint__Alternatives_2_0_1
            	    {
            	    pushFollow(FOLLOW_50);
            	    rule__Joint__Alternatives_2_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
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
    // InternalMyDsl.g:4893:1: rule__Joint__Group_2_0_0__0 : rule__Joint__Group_2_0_0__0__Impl rule__Joint__Group_2_0_0__1 ;
    public final void rule__Joint__Group_2_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4897:1: ( rule__Joint__Group_2_0_0__0__Impl rule__Joint__Group_2_0_0__1 )
            // InternalMyDsl.g:4898:2: rule__Joint__Group_2_0_0__0__Impl rule__Joint__Group_2_0_0__1
            {
            pushFollow(FOLLOW_51);
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
    // InternalMyDsl.g:4905:1: rule__Joint__Group_2_0_0__0__Impl : ( 'def' ) ;
    public final void rule__Joint__Group_2_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4909:1: ( ( 'def' ) )
            // InternalMyDsl.g:4910:1: ( 'def' )
            {
            // InternalMyDsl.g:4910:1: ( 'def' )
            // InternalMyDsl.g:4911:2: 'def'
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
    // InternalMyDsl.g:4920:1: rule__Joint__Group_2_0_0__1 : rule__Joint__Group_2_0_0__1__Impl rule__Joint__Group_2_0_0__2 ;
    public final void rule__Joint__Group_2_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4924:1: ( rule__Joint__Group_2_0_0__1__Impl rule__Joint__Group_2_0_0__2 )
            // InternalMyDsl.g:4925:2: rule__Joint__Group_2_0_0__1__Impl rule__Joint__Group_2_0_0__2
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
    // InternalMyDsl.g:4932:1: rule__Joint__Group_2_0_0__1__Impl : ( 'ChildOf' ) ;
    public final void rule__Joint__Group_2_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4936:1: ( ( 'ChildOf' ) )
            // InternalMyDsl.g:4937:1: ( 'ChildOf' )
            {
            // InternalMyDsl.g:4937:1: ( 'ChildOf' )
            // InternalMyDsl.g:4938:2: 'ChildOf'
            {
             before(grammarAccess.getJointAccess().getChildOfKeyword_2_0_0_1()); 
            match(input,62,FOLLOW_2); 
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
    // InternalMyDsl.g:4947:1: rule__Joint__Group_2_0_0__2 : rule__Joint__Group_2_0_0__2__Impl rule__Joint__Group_2_0_0__3 ;
    public final void rule__Joint__Group_2_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4951:1: ( rule__Joint__Group_2_0_0__2__Impl rule__Joint__Group_2_0_0__3 )
            // InternalMyDsl.g:4952:2: rule__Joint__Group_2_0_0__2__Impl rule__Joint__Group_2_0_0__3
            {
            pushFollow(FOLLOW_52);
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
    // InternalMyDsl.g:4959:1: rule__Joint__Group_2_0_0__2__Impl : ( ( rule__Joint__ChildOfAssignment_2_0_0_2 ) ) ;
    public final void rule__Joint__Group_2_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4963:1: ( ( ( rule__Joint__ChildOfAssignment_2_0_0_2 ) ) )
            // InternalMyDsl.g:4964:1: ( ( rule__Joint__ChildOfAssignment_2_0_0_2 ) )
            {
            // InternalMyDsl.g:4964:1: ( ( rule__Joint__ChildOfAssignment_2_0_0_2 ) )
            // InternalMyDsl.g:4965:2: ( rule__Joint__ChildOfAssignment_2_0_0_2 )
            {
             before(grammarAccess.getJointAccess().getChildOfAssignment_2_0_0_2()); 
            // InternalMyDsl.g:4966:2: ( rule__Joint__ChildOfAssignment_2_0_0_2 )
            // InternalMyDsl.g:4966:3: rule__Joint__ChildOfAssignment_2_0_0_2
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
    // InternalMyDsl.g:4974:1: rule__Joint__Group_2_0_0__3 : rule__Joint__Group_2_0_0__3__Impl rule__Joint__Group_2_0_0__4 ;
    public final void rule__Joint__Group_2_0_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4978:1: ( rule__Joint__Group_2_0_0__3__Impl rule__Joint__Group_2_0_0__4 )
            // InternalMyDsl.g:4979:2: rule__Joint__Group_2_0_0__3__Impl rule__Joint__Group_2_0_0__4
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
    // InternalMyDsl.g:4986:1: rule__Joint__Group_2_0_0__3__Impl : ( 'ParentOf' ) ;
    public final void rule__Joint__Group_2_0_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4990:1: ( ( 'ParentOf' ) )
            // InternalMyDsl.g:4991:1: ( 'ParentOf' )
            {
            // InternalMyDsl.g:4991:1: ( 'ParentOf' )
            // InternalMyDsl.g:4992:2: 'ParentOf'
            {
             before(grammarAccess.getJointAccess().getParentOfKeyword_2_0_0_3()); 
            match(input,63,FOLLOW_2); 
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
    // InternalMyDsl.g:5001:1: rule__Joint__Group_2_0_0__4 : rule__Joint__Group_2_0_0__4__Impl rule__Joint__Group_2_0_0__5 ;
    public final void rule__Joint__Group_2_0_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5005:1: ( rule__Joint__Group_2_0_0__4__Impl rule__Joint__Group_2_0_0__5 )
            // InternalMyDsl.g:5006:2: rule__Joint__Group_2_0_0__4__Impl rule__Joint__Group_2_0_0__5
            {
            pushFollow(FOLLOW_53);
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
    // InternalMyDsl.g:5013:1: rule__Joint__Group_2_0_0__4__Impl : ( ( rule__Joint__ParentOfAssignment_2_0_0_4 ) ) ;
    public final void rule__Joint__Group_2_0_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5017:1: ( ( ( rule__Joint__ParentOfAssignment_2_0_0_4 ) ) )
            // InternalMyDsl.g:5018:1: ( ( rule__Joint__ParentOfAssignment_2_0_0_4 ) )
            {
            // InternalMyDsl.g:5018:1: ( ( rule__Joint__ParentOfAssignment_2_0_0_4 ) )
            // InternalMyDsl.g:5019:2: ( rule__Joint__ParentOfAssignment_2_0_0_4 )
            {
             before(grammarAccess.getJointAccess().getParentOfAssignment_2_0_0_4()); 
            // InternalMyDsl.g:5020:2: ( rule__Joint__ParentOfAssignment_2_0_0_4 )
            // InternalMyDsl.g:5020:3: rule__Joint__ParentOfAssignment_2_0_0_4
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
    // InternalMyDsl.g:5028:1: rule__Joint__Group_2_0_0__5 : rule__Joint__Group_2_0_0__5__Impl rule__Joint__Group_2_0_0__6 ;
    public final void rule__Joint__Group_2_0_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5032:1: ( rule__Joint__Group_2_0_0__5__Impl rule__Joint__Group_2_0_0__6 )
            // InternalMyDsl.g:5033:2: rule__Joint__Group_2_0_0__5__Impl rule__Joint__Group_2_0_0__6
            {
            pushFollow(FOLLOW_54);
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
    // InternalMyDsl.g:5040:1: rule__Joint__Group_2_0_0__5__Impl : ( 'Type' ) ;
    public final void rule__Joint__Group_2_0_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5044:1: ( ( 'Type' ) )
            // InternalMyDsl.g:5045:1: ( 'Type' )
            {
            // InternalMyDsl.g:5045:1: ( 'Type' )
            // InternalMyDsl.g:5046:2: 'Type'
            {
             before(grammarAccess.getJointAccess().getTypeKeyword_2_0_0_5()); 
            match(input,64,FOLLOW_2); 
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
    // InternalMyDsl.g:5055:1: rule__Joint__Group_2_0_0__6 : rule__Joint__Group_2_0_0__6__Impl ;
    public final void rule__Joint__Group_2_0_0__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5059:1: ( rule__Joint__Group_2_0_0__6__Impl )
            // InternalMyDsl.g:5060:2: rule__Joint__Group_2_0_0__6__Impl
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
    // InternalMyDsl.g:5066:1: rule__Joint__Group_2_0_0__6__Impl : ( ( rule__Joint__TypeAssignment_2_0_0_6 ) ) ;
    public final void rule__Joint__Group_2_0_0__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5070:1: ( ( ( rule__Joint__TypeAssignment_2_0_0_6 ) ) )
            // InternalMyDsl.g:5071:1: ( ( rule__Joint__TypeAssignment_2_0_0_6 ) )
            {
            // InternalMyDsl.g:5071:1: ( ( rule__Joint__TypeAssignment_2_0_0_6 ) )
            // InternalMyDsl.g:5072:2: ( rule__Joint__TypeAssignment_2_0_0_6 )
            {
             before(grammarAccess.getJointAccess().getTypeAssignment_2_0_0_6()); 
            // InternalMyDsl.g:5073:2: ( rule__Joint__TypeAssignment_2_0_0_6 )
            // InternalMyDsl.g:5073:3: rule__Joint__TypeAssignment_2_0_0_6
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
    // InternalMyDsl.g:5082:1: rule__Joint__Group_2_1__0 : rule__Joint__Group_2_1__0__Impl rule__Joint__Group_2_1__1 ;
    public final void rule__Joint__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5086:1: ( rule__Joint__Group_2_1__0__Impl rule__Joint__Group_2_1__1 )
            // InternalMyDsl.g:5087:2: rule__Joint__Group_2_1__0__Impl rule__Joint__Group_2_1__1
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
    // InternalMyDsl.g:5094:1: rule__Joint__Group_2_1__0__Impl : ( 'reuse' ) ;
    public final void rule__Joint__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5098:1: ( ( 'reuse' ) )
            // InternalMyDsl.g:5099:1: ( 'reuse' )
            {
            // InternalMyDsl.g:5099:1: ( 'reuse' )
            // InternalMyDsl.g:5100:2: 'reuse'
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
    // InternalMyDsl.g:5109:1: rule__Joint__Group_2_1__1 : rule__Joint__Group_2_1__1__Impl rule__Joint__Group_2_1__2 ;
    public final void rule__Joint__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5113:1: ( rule__Joint__Group_2_1__1__Impl rule__Joint__Group_2_1__2 )
            // InternalMyDsl.g:5114:2: rule__Joint__Group_2_1__1__Impl rule__Joint__Group_2_1__2
            {
            pushFollow(FOLLOW_51);
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
    // InternalMyDsl.g:5121:1: rule__Joint__Group_2_1__1__Impl : ( ( rule__Joint__IsReuseOfAssignment_2_1_1 ) ) ;
    public final void rule__Joint__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5125:1: ( ( ( rule__Joint__IsReuseOfAssignment_2_1_1 ) ) )
            // InternalMyDsl.g:5126:1: ( ( rule__Joint__IsReuseOfAssignment_2_1_1 ) )
            {
            // InternalMyDsl.g:5126:1: ( ( rule__Joint__IsReuseOfAssignment_2_1_1 ) )
            // InternalMyDsl.g:5127:2: ( rule__Joint__IsReuseOfAssignment_2_1_1 )
            {
             before(grammarAccess.getJointAccess().getIsReuseOfAssignment_2_1_1()); 
            // InternalMyDsl.g:5128:2: ( rule__Joint__IsReuseOfAssignment_2_1_1 )
            // InternalMyDsl.g:5128:3: rule__Joint__IsReuseOfAssignment_2_1_1
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
    // InternalMyDsl.g:5136:1: rule__Joint__Group_2_1__2 : rule__Joint__Group_2_1__2__Impl rule__Joint__Group_2_1__3 ;
    public final void rule__Joint__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5140:1: ( rule__Joint__Group_2_1__2__Impl rule__Joint__Group_2_1__3 )
            // InternalMyDsl.g:5141:2: rule__Joint__Group_2_1__2__Impl rule__Joint__Group_2_1__3
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
    // InternalMyDsl.g:5148:1: rule__Joint__Group_2_1__2__Impl : ( 'ChildOf' ) ;
    public final void rule__Joint__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5152:1: ( ( 'ChildOf' ) )
            // InternalMyDsl.g:5153:1: ( 'ChildOf' )
            {
            // InternalMyDsl.g:5153:1: ( 'ChildOf' )
            // InternalMyDsl.g:5154:2: 'ChildOf'
            {
             before(grammarAccess.getJointAccess().getChildOfKeyword_2_1_2()); 
            match(input,62,FOLLOW_2); 
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
    // InternalMyDsl.g:5163:1: rule__Joint__Group_2_1__3 : rule__Joint__Group_2_1__3__Impl rule__Joint__Group_2_1__4 ;
    public final void rule__Joint__Group_2_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5167:1: ( rule__Joint__Group_2_1__3__Impl rule__Joint__Group_2_1__4 )
            // InternalMyDsl.g:5168:2: rule__Joint__Group_2_1__3__Impl rule__Joint__Group_2_1__4
            {
            pushFollow(FOLLOW_52);
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
    // InternalMyDsl.g:5175:1: rule__Joint__Group_2_1__3__Impl : ( ( rule__Joint__ChildOfAssignment_2_1_3 ) ) ;
    public final void rule__Joint__Group_2_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5179:1: ( ( ( rule__Joint__ChildOfAssignment_2_1_3 ) ) )
            // InternalMyDsl.g:5180:1: ( ( rule__Joint__ChildOfAssignment_2_1_3 ) )
            {
            // InternalMyDsl.g:5180:1: ( ( rule__Joint__ChildOfAssignment_2_1_3 ) )
            // InternalMyDsl.g:5181:2: ( rule__Joint__ChildOfAssignment_2_1_3 )
            {
             before(grammarAccess.getJointAccess().getChildOfAssignment_2_1_3()); 
            // InternalMyDsl.g:5182:2: ( rule__Joint__ChildOfAssignment_2_1_3 )
            // InternalMyDsl.g:5182:3: rule__Joint__ChildOfAssignment_2_1_3
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
    // InternalMyDsl.g:5190:1: rule__Joint__Group_2_1__4 : rule__Joint__Group_2_1__4__Impl rule__Joint__Group_2_1__5 ;
    public final void rule__Joint__Group_2_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5194:1: ( rule__Joint__Group_2_1__4__Impl rule__Joint__Group_2_1__5 )
            // InternalMyDsl.g:5195:2: rule__Joint__Group_2_1__4__Impl rule__Joint__Group_2_1__5
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
    // InternalMyDsl.g:5202:1: rule__Joint__Group_2_1__4__Impl : ( 'ParentOf' ) ;
    public final void rule__Joint__Group_2_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5206:1: ( ( 'ParentOf' ) )
            // InternalMyDsl.g:5207:1: ( 'ParentOf' )
            {
            // InternalMyDsl.g:5207:1: ( 'ParentOf' )
            // InternalMyDsl.g:5208:2: 'ParentOf'
            {
             before(grammarAccess.getJointAccess().getParentOfKeyword_2_1_4()); 
            match(input,63,FOLLOW_2); 
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
    // InternalMyDsl.g:5217:1: rule__Joint__Group_2_1__5 : rule__Joint__Group_2_1__5__Impl rule__Joint__Group_2_1__6 ;
    public final void rule__Joint__Group_2_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5221:1: ( rule__Joint__Group_2_1__5__Impl rule__Joint__Group_2_1__6 )
            // InternalMyDsl.g:5222:2: rule__Joint__Group_2_1__5__Impl rule__Joint__Group_2_1__6
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
    // InternalMyDsl.g:5229:1: rule__Joint__Group_2_1__5__Impl : ( ( rule__Joint__ParentOfAssignment_2_1_5 ) ) ;
    public final void rule__Joint__Group_2_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5233:1: ( ( ( rule__Joint__ParentOfAssignment_2_1_5 ) ) )
            // InternalMyDsl.g:5234:1: ( ( rule__Joint__ParentOfAssignment_2_1_5 ) )
            {
            // InternalMyDsl.g:5234:1: ( ( rule__Joint__ParentOfAssignment_2_1_5 ) )
            // InternalMyDsl.g:5235:2: ( rule__Joint__ParentOfAssignment_2_1_5 )
            {
             before(grammarAccess.getJointAccess().getParentOfAssignment_2_1_5()); 
            // InternalMyDsl.g:5236:2: ( rule__Joint__ParentOfAssignment_2_1_5 )
            // InternalMyDsl.g:5236:3: rule__Joint__ParentOfAssignment_2_1_5
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
    // InternalMyDsl.g:5244:1: rule__Joint__Group_2_1__6 : rule__Joint__Group_2_1__6__Impl ;
    public final void rule__Joint__Group_2_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5248:1: ( rule__Joint__Group_2_1__6__Impl )
            // InternalMyDsl.g:5249:2: rule__Joint__Group_2_1__6__Impl
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
    // InternalMyDsl.g:5255:1: rule__Joint__Group_2_1__6__Impl : ( ( rule__Joint__ReuseAssignment_2_1_6 ) ) ;
    public final void rule__Joint__Group_2_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5259:1: ( ( ( rule__Joint__ReuseAssignment_2_1_6 ) ) )
            // InternalMyDsl.g:5260:1: ( ( rule__Joint__ReuseAssignment_2_1_6 ) )
            {
            // InternalMyDsl.g:5260:1: ( ( rule__Joint__ReuseAssignment_2_1_6 ) )
            // InternalMyDsl.g:5261:2: ( rule__Joint__ReuseAssignment_2_1_6 )
            {
             before(grammarAccess.getJointAccess().getReuseAssignment_2_1_6()); 
            // InternalMyDsl.g:5262:2: ( rule__Joint__ReuseAssignment_2_1_6 )
            // InternalMyDsl.g:5262:3: rule__Joint__ReuseAssignment_2_1_6
            {
            pushFollow(FOLLOW_2);
            rule__Joint__ReuseAssignment_2_1_6();

            state._fsp--;


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
    // InternalMyDsl.g:5271:1: rule__Axis__Group__0 : rule__Axis__Group__0__Impl rule__Axis__Group__1 ;
    public final void rule__Axis__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5275:1: ( rule__Axis__Group__0__Impl rule__Axis__Group__1 )
            // InternalMyDsl.g:5276:2: rule__Axis__Group__0__Impl rule__Axis__Group__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalMyDsl.g:5283:1: rule__Axis__Group__0__Impl : ( 'Axis' ) ;
    public final void rule__Axis__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5287:1: ( ( 'Axis' ) )
            // InternalMyDsl.g:5288:1: ( 'Axis' )
            {
            // InternalMyDsl.g:5288:1: ( 'Axis' )
            // InternalMyDsl.g:5289:2: 'Axis'
            {
             before(grammarAccess.getAxisAccess().getAxisKeyword_0()); 
            match(input,65,FOLLOW_2); 
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
    // InternalMyDsl.g:5298:1: rule__Axis__Group__1 : rule__Axis__Group__1__Impl rule__Axis__Group__2 ;
    public final void rule__Axis__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5302:1: ( rule__Axis__Group__1__Impl rule__Axis__Group__2 )
            // InternalMyDsl.g:5303:2: rule__Axis__Group__1__Impl rule__Axis__Group__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalMyDsl.g:5310:1: rule__Axis__Group__1__Impl : ( ( rule__Axis__NameAssignment_1 )? ) ;
    public final void rule__Axis__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5314:1: ( ( ( rule__Axis__NameAssignment_1 )? ) )
            // InternalMyDsl.g:5315:1: ( ( rule__Axis__NameAssignment_1 )? )
            {
            // InternalMyDsl.g:5315:1: ( ( rule__Axis__NameAssignment_1 )? )
            // InternalMyDsl.g:5316:2: ( rule__Axis__NameAssignment_1 )?
            {
             before(grammarAccess.getAxisAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:5317:2: ( rule__Axis__NameAssignment_1 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_ID) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalMyDsl.g:5317:3: rule__Axis__NameAssignment_1
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
    // InternalMyDsl.g:5325:1: rule__Axis__Group__2 : rule__Axis__Group__2__Impl rule__Axis__Group__3 ;
    public final void rule__Axis__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5329:1: ( rule__Axis__Group__2__Impl rule__Axis__Group__3 )
            // InternalMyDsl.g:5330:2: rule__Axis__Group__2__Impl rule__Axis__Group__3
            {
            pushFollow(FOLLOW_45);
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
    // InternalMyDsl.g:5337:1: rule__Axis__Group__2__Impl : ( 'x' ) ;
    public final void rule__Axis__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5341:1: ( ( 'x' ) )
            // InternalMyDsl.g:5342:1: ( 'x' )
            {
            // InternalMyDsl.g:5342:1: ( 'x' )
            // InternalMyDsl.g:5343:2: 'x'
            {
             before(grammarAccess.getAxisAccess().getXKeyword_2()); 
            match(input,37,FOLLOW_2); 
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
    // InternalMyDsl.g:5352:1: rule__Axis__Group__3 : rule__Axis__Group__3__Impl rule__Axis__Group__4 ;
    public final void rule__Axis__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5356:1: ( rule__Axis__Group__3__Impl rule__Axis__Group__4 )
            // InternalMyDsl.g:5357:2: rule__Axis__Group__3__Impl rule__Axis__Group__4
            {
            pushFollow(FOLLOW_32);
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
    // InternalMyDsl.g:5364:1: rule__Axis__Group__3__Impl : ( ( rule__Axis__XAssignment_3 ) ) ;
    public final void rule__Axis__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5368:1: ( ( ( rule__Axis__XAssignment_3 ) ) )
            // InternalMyDsl.g:5369:1: ( ( rule__Axis__XAssignment_3 ) )
            {
            // InternalMyDsl.g:5369:1: ( ( rule__Axis__XAssignment_3 ) )
            // InternalMyDsl.g:5370:2: ( rule__Axis__XAssignment_3 )
            {
             before(grammarAccess.getAxisAccess().getXAssignment_3()); 
            // InternalMyDsl.g:5371:2: ( rule__Axis__XAssignment_3 )
            // InternalMyDsl.g:5371:3: rule__Axis__XAssignment_3
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
    // InternalMyDsl.g:5379:1: rule__Axis__Group__4 : rule__Axis__Group__4__Impl rule__Axis__Group__5 ;
    public final void rule__Axis__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5383:1: ( rule__Axis__Group__4__Impl rule__Axis__Group__5 )
            // InternalMyDsl.g:5384:2: rule__Axis__Group__4__Impl rule__Axis__Group__5
            {
            pushFollow(FOLLOW_45);
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
    // InternalMyDsl.g:5391:1: rule__Axis__Group__4__Impl : ( 'y' ) ;
    public final void rule__Axis__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5395:1: ( ( 'y' ) )
            // InternalMyDsl.g:5396:1: ( 'y' )
            {
            // InternalMyDsl.g:5396:1: ( 'y' )
            // InternalMyDsl.g:5397:2: 'y'
            {
             before(grammarAccess.getAxisAccess().getYKeyword_4()); 
            match(input,38,FOLLOW_2); 
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
    // InternalMyDsl.g:5406:1: rule__Axis__Group__5 : rule__Axis__Group__5__Impl rule__Axis__Group__6 ;
    public final void rule__Axis__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5410:1: ( rule__Axis__Group__5__Impl rule__Axis__Group__6 )
            // InternalMyDsl.g:5411:2: rule__Axis__Group__5__Impl rule__Axis__Group__6
            {
            pushFollow(FOLLOW_33);
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
    // InternalMyDsl.g:5418:1: rule__Axis__Group__5__Impl : ( ( rule__Axis__YAssignment_5 ) ) ;
    public final void rule__Axis__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5422:1: ( ( ( rule__Axis__YAssignment_5 ) ) )
            // InternalMyDsl.g:5423:1: ( ( rule__Axis__YAssignment_5 ) )
            {
            // InternalMyDsl.g:5423:1: ( ( rule__Axis__YAssignment_5 ) )
            // InternalMyDsl.g:5424:2: ( rule__Axis__YAssignment_5 )
            {
             before(grammarAccess.getAxisAccess().getYAssignment_5()); 
            // InternalMyDsl.g:5425:2: ( rule__Axis__YAssignment_5 )
            // InternalMyDsl.g:5425:3: rule__Axis__YAssignment_5
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
    // InternalMyDsl.g:5433:1: rule__Axis__Group__6 : rule__Axis__Group__6__Impl rule__Axis__Group__7 ;
    public final void rule__Axis__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5437:1: ( rule__Axis__Group__6__Impl rule__Axis__Group__7 )
            // InternalMyDsl.g:5438:2: rule__Axis__Group__6__Impl rule__Axis__Group__7
            {
            pushFollow(FOLLOW_45);
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
    // InternalMyDsl.g:5445:1: rule__Axis__Group__6__Impl : ( 'z' ) ;
    public final void rule__Axis__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5449:1: ( ( 'z' ) )
            // InternalMyDsl.g:5450:1: ( 'z' )
            {
            // InternalMyDsl.g:5450:1: ( 'z' )
            // InternalMyDsl.g:5451:2: 'z'
            {
             before(grammarAccess.getAxisAccess().getZKeyword_6()); 
            match(input,39,FOLLOW_2); 
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
    // InternalMyDsl.g:5460:1: rule__Axis__Group__7 : rule__Axis__Group__7__Impl ;
    public final void rule__Axis__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5464:1: ( rule__Axis__Group__7__Impl )
            // InternalMyDsl.g:5465:2: rule__Axis__Group__7__Impl
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
    // InternalMyDsl.g:5471:1: rule__Axis__Group__7__Impl : ( ( rule__Axis__ZAssignment_7 ) ) ;
    public final void rule__Axis__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5475:1: ( ( ( rule__Axis__ZAssignment_7 ) ) )
            // InternalMyDsl.g:5476:1: ( ( rule__Axis__ZAssignment_7 ) )
            {
            // InternalMyDsl.g:5476:1: ( ( rule__Axis__ZAssignment_7 ) )
            // InternalMyDsl.g:5477:2: ( rule__Axis__ZAssignment_7 )
            {
             before(grammarAccess.getAxisAccess().getZAssignment_7()); 
            // InternalMyDsl.g:5478:2: ( rule__Axis__ZAssignment_7 )
            // InternalMyDsl.g:5478:3: rule__Axis__ZAssignment_7
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
    // InternalMyDsl.g:5487:1: rule__Limit__Group__0 : rule__Limit__Group__0__Impl rule__Limit__Group__1 ;
    public final void rule__Limit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5491:1: ( rule__Limit__Group__0__Impl rule__Limit__Group__1 )
            // InternalMyDsl.g:5492:2: rule__Limit__Group__0__Impl rule__Limit__Group__1
            {
            pushFollow(FOLLOW_55);
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
    // InternalMyDsl.g:5499:1: rule__Limit__Group__0__Impl : ( 'Limit' ) ;
    public final void rule__Limit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5503:1: ( ( 'Limit' ) )
            // InternalMyDsl.g:5504:1: ( 'Limit' )
            {
            // InternalMyDsl.g:5504:1: ( 'Limit' )
            // InternalMyDsl.g:5505:2: 'Limit'
            {
             before(grammarAccess.getLimitAccess().getLimitKeyword_0()); 
            match(input,66,FOLLOW_2); 
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
    // InternalMyDsl.g:5514:1: rule__Limit__Group__1 : rule__Limit__Group__1__Impl rule__Limit__Group__2 ;
    public final void rule__Limit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5518:1: ( rule__Limit__Group__1__Impl rule__Limit__Group__2 )
            // InternalMyDsl.g:5519:2: rule__Limit__Group__1__Impl rule__Limit__Group__2
            {
            pushFollow(FOLLOW_55);
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
    // InternalMyDsl.g:5526:1: rule__Limit__Group__1__Impl : ( ( rule__Limit__NameAssignment_1 )? ) ;
    public final void rule__Limit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5530:1: ( ( ( rule__Limit__NameAssignment_1 )? ) )
            // InternalMyDsl.g:5531:1: ( ( rule__Limit__NameAssignment_1 )? )
            {
            // InternalMyDsl.g:5531:1: ( ( rule__Limit__NameAssignment_1 )? )
            // InternalMyDsl.g:5532:2: ( rule__Limit__NameAssignment_1 )?
            {
             before(grammarAccess.getLimitAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:5533:2: ( rule__Limit__NameAssignment_1 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_ID) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalMyDsl.g:5533:3: rule__Limit__NameAssignment_1
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
    // InternalMyDsl.g:5541:1: rule__Limit__Group__2 : rule__Limit__Group__2__Impl rule__Limit__Group__3 ;
    public final void rule__Limit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5545:1: ( rule__Limit__Group__2__Impl rule__Limit__Group__3 )
            // InternalMyDsl.g:5546:2: rule__Limit__Group__2__Impl rule__Limit__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:5553:1: rule__Limit__Group__2__Impl : ( 'effort' ) ;
    public final void rule__Limit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5557:1: ( ( 'effort' ) )
            // InternalMyDsl.g:5558:1: ( 'effort' )
            {
            // InternalMyDsl.g:5558:1: ( 'effort' )
            // InternalMyDsl.g:5559:2: 'effort'
            {
             before(grammarAccess.getLimitAccess().getEffortKeyword_2()); 
            match(input,67,FOLLOW_2); 
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
    // InternalMyDsl.g:5568:1: rule__Limit__Group__3 : rule__Limit__Group__3__Impl rule__Limit__Group__4 ;
    public final void rule__Limit__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5572:1: ( rule__Limit__Group__3__Impl rule__Limit__Group__4 )
            // InternalMyDsl.g:5573:2: rule__Limit__Group__3__Impl rule__Limit__Group__4
            {
            pushFollow(FOLLOW_56);
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
    // InternalMyDsl.g:5580:1: rule__Limit__Group__3__Impl : ( ( rule__Limit__EffortAssignment_3 ) ) ;
    public final void rule__Limit__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5584:1: ( ( ( rule__Limit__EffortAssignment_3 ) ) )
            // InternalMyDsl.g:5585:1: ( ( rule__Limit__EffortAssignment_3 ) )
            {
            // InternalMyDsl.g:5585:1: ( ( rule__Limit__EffortAssignment_3 ) )
            // InternalMyDsl.g:5586:2: ( rule__Limit__EffortAssignment_3 )
            {
             before(grammarAccess.getLimitAccess().getEffortAssignment_3()); 
            // InternalMyDsl.g:5587:2: ( rule__Limit__EffortAssignment_3 )
            // InternalMyDsl.g:5587:3: rule__Limit__EffortAssignment_3
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
    // InternalMyDsl.g:5595:1: rule__Limit__Group__4 : rule__Limit__Group__4__Impl rule__Limit__Group__5 ;
    public final void rule__Limit__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5599:1: ( rule__Limit__Group__4__Impl rule__Limit__Group__5 )
            // InternalMyDsl.g:5600:2: rule__Limit__Group__4__Impl rule__Limit__Group__5
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:5607:1: rule__Limit__Group__4__Impl : ( 'velocity' ) ;
    public final void rule__Limit__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5611:1: ( ( 'velocity' ) )
            // InternalMyDsl.g:5612:1: ( 'velocity' )
            {
            // InternalMyDsl.g:5612:1: ( 'velocity' )
            // InternalMyDsl.g:5613:2: 'velocity'
            {
             before(grammarAccess.getLimitAccess().getVelocityKeyword_4()); 
            match(input,68,FOLLOW_2); 
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
    // InternalMyDsl.g:5622:1: rule__Limit__Group__5 : rule__Limit__Group__5__Impl rule__Limit__Group__6 ;
    public final void rule__Limit__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5626:1: ( rule__Limit__Group__5__Impl rule__Limit__Group__6 )
            // InternalMyDsl.g:5627:2: rule__Limit__Group__5__Impl rule__Limit__Group__6
            {
            pushFollow(FOLLOW_57);
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
    // InternalMyDsl.g:5634:1: rule__Limit__Group__5__Impl : ( ( rule__Limit__VelocityAssignment_5 ) ) ;
    public final void rule__Limit__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5638:1: ( ( ( rule__Limit__VelocityAssignment_5 ) ) )
            // InternalMyDsl.g:5639:1: ( ( rule__Limit__VelocityAssignment_5 ) )
            {
            // InternalMyDsl.g:5639:1: ( ( rule__Limit__VelocityAssignment_5 ) )
            // InternalMyDsl.g:5640:2: ( rule__Limit__VelocityAssignment_5 )
            {
             before(grammarAccess.getLimitAccess().getVelocityAssignment_5()); 
            // InternalMyDsl.g:5641:2: ( rule__Limit__VelocityAssignment_5 )
            // InternalMyDsl.g:5641:3: rule__Limit__VelocityAssignment_5
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
    // InternalMyDsl.g:5649:1: rule__Limit__Group__6 : rule__Limit__Group__6__Impl rule__Limit__Group__7 ;
    public final void rule__Limit__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5653:1: ( rule__Limit__Group__6__Impl rule__Limit__Group__7 )
            // InternalMyDsl.g:5654:2: rule__Limit__Group__6__Impl rule__Limit__Group__7
            {
            pushFollow(FOLLOW_58);
            rule__Limit__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Limit__Group__7();

            state._fsp--;


            }

        }
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
    // InternalMyDsl.g:5661:1: rule__Limit__Group__6__Impl : ( 'lower' ) ;
    public final void rule__Limit__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5665:1: ( ( 'lower' ) )
            // InternalMyDsl.g:5666:1: ( 'lower' )
            {
            // InternalMyDsl.g:5666:1: ( 'lower' )
            // InternalMyDsl.g:5667:2: 'lower'
            {
             before(grammarAccess.getLimitAccess().getLowerKeyword_6()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getLimitAccess().getLowerKeyword_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__Limit__Group__7"
    // InternalMyDsl.g:5676:1: rule__Limit__Group__7 : rule__Limit__Group__7__Impl rule__Limit__Group__8 ;
    public final void rule__Limit__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5680:1: ( rule__Limit__Group__7__Impl rule__Limit__Group__8 )
            // InternalMyDsl.g:5681:2: rule__Limit__Group__7__Impl rule__Limit__Group__8
            {
            pushFollow(FOLLOW_58);
            rule__Limit__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Limit__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group__7"


    // $ANTLR start "rule__Limit__Group__7__Impl"
    // InternalMyDsl.g:5688:1: rule__Limit__Group__7__Impl : ( ( rule__Limit__LowerAssignment_7 )? ) ;
    public final void rule__Limit__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5692:1: ( ( ( rule__Limit__LowerAssignment_7 )? ) )
            // InternalMyDsl.g:5693:1: ( ( rule__Limit__LowerAssignment_7 )? )
            {
            // InternalMyDsl.g:5693:1: ( ( rule__Limit__LowerAssignment_7 )? )
            // InternalMyDsl.g:5694:2: ( rule__Limit__LowerAssignment_7 )?
            {
             before(grammarAccess.getLimitAccess().getLowerAssignment_7()); 
            // InternalMyDsl.g:5695:2: ( rule__Limit__LowerAssignment_7 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=RULE_INT && LA45_0<=RULE_ID)||LA45_0==12) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalMyDsl.g:5695:3: rule__Limit__LowerAssignment_7
                    {
                    pushFollow(FOLLOW_2);
                    rule__Limit__LowerAssignment_7();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLimitAccess().getLowerAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group__7__Impl"


    // $ANTLR start "rule__Limit__Group__8"
    // InternalMyDsl.g:5703:1: rule__Limit__Group__8 : rule__Limit__Group__8__Impl rule__Limit__Group__9 ;
    public final void rule__Limit__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5707:1: ( rule__Limit__Group__8__Impl rule__Limit__Group__9 )
            // InternalMyDsl.g:5708:2: rule__Limit__Group__8__Impl rule__Limit__Group__9
            {
            pushFollow(FOLLOW_20);
            rule__Limit__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Limit__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group__8"


    // $ANTLR start "rule__Limit__Group__8__Impl"
    // InternalMyDsl.g:5715:1: rule__Limit__Group__8__Impl : ( 'upper' ) ;
    public final void rule__Limit__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5719:1: ( ( 'upper' ) )
            // InternalMyDsl.g:5720:1: ( 'upper' )
            {
            // InternalMyDsl.g:5720:1: ( 'upper' )
            // InternalMyDsl.g:5721:2: 'upper'
            {
             before(grammarAccess.getLimitAccess().getUpperKeyword_8()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getLimitAccess().getUpperKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group__8__Impl"


    // $ANTLR start "rule__Limit__Group__9"
    // InternalMyDsl.g:5730:1: rule__Limit__Group__9 : rule__Limit__Group__9__Impl ;
    public final void rule__Limit__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5734:1: ( rule__Limit__Group__9__Impl )
            // InternalMyDsl.g:5735:2: rule__Limit__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Limit__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group__9"


    // $ANTLR start "rule__Limit__Group__9__Impl"
    // InternalMyDsl.g:5741:1: rule__Limit__Group__9__Impl : ( ( rule__Limit__UpperAssignment_9 )? ) ;
    public final void rule__Limit__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5745:1: ( ( ( rule__Limit__UpperAssignment_9 )? ) )
            // InternalMyDsl.g:5746:1: ( ( rule__Limit__UpperAssignment_9 )? )
            {
            // InternalMyDsl.g:5746:1: ( ( rule__Limit__UpperAssignment_9 )? )
            // InternalMyDsl.g:5747:2: ( rule__Limit__UpperAssignment_9 )?
            {
             before(grammarAccess.getLimitAccess().getUpperAssignment_9()); 
            // InternalMyDsl.g:5748:2: ( rule__Limit__UpperAssignment_9 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( ((LA46_0>=RULE_INT && LA46_0<=RULE_ID)||LA46_0==12) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalMyDsl.g:5748:3: rule__Limit__UpperAssignment_9
                    {
                    pushFollow(FOLLOW_2);
                    rule__Limit__UpperAssignment_9();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLimitAccess().getUpperAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group__9__Impl"


    // $ANTLR start "rule__Calibration__Group__0"
    // InternalMyDsl.g:5757:1: rule__Calibration__Group__0 : rule__Calibration__Group__0__Impl rule__Calibration__Group__1 ;
    public final void rule__Calibration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5761:1: ( rule__Calibration__Group__0__Impl rule__Calibration__Group__1 )
            // InternalMyDsl.g:5762:2: rule__Calibration__Group__0__Impl rule__Calibration__Group__1
            {
            pushFollow(FOLLOW_59);
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
    // InternalMyDsl.g:5769:1: rule__Calibration__Group__0__Impl : ( () ) ;
    public final void rule__Calibration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5773:1: ( ( () ) )
            // InternalMyDsl.g:5774:1: ( () )
            {
            // InternalMyDsl.g:5774:1: ( () )
            // InternalMyDsl.g:5775:2: ()
            {
             before(grammarAccess.getCalibrationAccess().getCalibrationAction_0()); 
            // InternalMyDsl.g:5776:2: ()
            // InternalMyDsl.g:5776:3: 
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
    // InternalMyDsl.g:5784:1: rule__Calibration__Group__1 : rule__Calibration__Group__1__Impl rule__Calibration__Group__2 ;
    public final void rule__Calibration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5788:1: ( rule__Calibration__Group__1__Impl rule__Calibration__Group__2 )
            // InternalMyDsl.g:5789:2: rule__Calibration__Group__1__Impl rule__Calibration__Group__2
            {
            pushFollow(FOLLOW_60);
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
    // InternalMyDsl.g:5796:1: rule__Calibration__Group__1__Impl : ( 'Calibration' ) ;
    public final void rule__Calibration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5800:1: ( ( 'Calibration' ) )
            // InternalMyDsl.g:5801:1: ( 'Calibration' )
            {
            // InternalMyDsl.g:5801:1: ( 'Calibration' )
            // InternalMyDsl.g:5802:2: 'Calibration'
            {
             before(grammarAccess.getCalibrationAccess().getCalibrationKeyword_1()); 
            match(input,71,FOLLOW_2); 
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
    // InternalMyDsl.g:5811:1: rule__Calibration__Group__2 : rule__Calibration__Group__2__Impl rule__Calibration__Group__3 ;
    public final void rule__Calibration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5815:1: ( rule__Calibration__Group__2__Impl rule__Calibration__Group__3 )
            // InternalMyDsl.g:5816:2: rule__Calibration__Group__2__Impl rule__Calibration__Group__3
            {
            pushFollow(FOLLOW_60);
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
    // InternalMyDsl.g:5823:1: rule__Calibration__Group__2__Impl : ( ( rule__Calibration__NameAssignment_2 )? ) ;
    public final void rule__Calibration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5827:1: ( ( ( rule__Calibration__NameAssignment_2 )? ) )
            // InternalMyDsl.g:5828:1: ( ( rule__Calibration__NameAssignment_2 )? )
            {
            // InternalMyDsl.g:5828:1: ( ( rule__Calibration__NameAssignment_2 )? )
            // InternalMyDsl.g:5829:2: ( rule__Calibration__NameAssignment_2 )?
            {
             before(grammarAccess.getCalibrationAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:5830:2: ( rule__Calibration__NameAssignment_2 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_ID) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalMyDsl.g:5830:3: rule__Calibration__NameAssignment_2
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
    // InternalMyDsl.g:5838:1: rule__Calibration__Group__3 : rule__Calibration__Group__3__Impl rule__Calibration__Group__4 ;
    public final void rule__Calibration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5842:1: ( rule__Calibration__Group__3__Impl rule__Calibration__Group__4 )
            // InternalMyDsl.g:5843:2: rule__Calibration__Group__3__Impl rule__Calibration__Group__4
            {
            pushFollow(FOLLOW_60);
            rule__Calibration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Calibration__Group__4();

            state._fsp--;


            }

        }
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
    // InternalMyDsl.g:5850:1: rule__Calibration__Group__3__Impl : ( ( rule__Calibration__Group_3__0 )? ) ;
    public final void rule__Calibration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5854:1: ( ( ( rule__Calibration__Group_3__0 )? ) )
            // InternalMyDsl.g:5855:1: ( ( rule__Calibration__Group_3__0 )? )
            {
            // InternalMyDsl.g:5855:1: ( ( rule__Calibration__Group_3__0 )? )
            // InternalMyDsl.g:5856:2: ( rule__Calibration__Group_3__0 )?
            {
             before(grammarAccess.getCalibrationAccess().getGroup_3()); 
            // InternalMyDsl.g:5857:2: ( rule__Calibration__Group_3__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==72) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalMyDsl.g:5857:3: rule__Calibration__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Calibration__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCalibrationAccess().getGroup_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Calibration__Group__4"
    // InternalMyDsl.g:5865:1: rule__Calibration__Group__4 : rule__Calibration__Group__4__Impl ;
    public final void rule__Calibration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5869:1: ( rule__Calibration__Group__4__Impl )
            // InternalMyDsl.g:5870:2: rule__Calibration__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Calibration__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calibration__Group__4"


    // $ANTLR start "rule__Calibration__Group__4__Impl"
    // InternalMyDsl.g:5876:1: rule__Calibration__Group__4__Impl : ( ( rule__Calibration__Group_4__0 )? ) ;
    public final void rule__Calibration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5880:1: ( ( ( rule__Calibration__Group_4__0 )? ) )
            // InternalMyDsl.g:5881:1: ( ( rule__Calibration__Group_4__0 )? )
            {
            // InternalMyDsl.g:5881:1: ( ( rule__Calibration__Group_4__0 )? )
            // InternalMyDsl.g:5882:2: ( rule__Calibration__Group_4__0 )?
            {
             before(grammarAccess.getCalibrationAccess().getGroup_4()); 
            // InternalMyDsl.g:5883:2: ( rule__Calibration__Group_4__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==73) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalMyDsl.g:5883:3: rule__Calibration__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Calibration__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCalibrationAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calibration__Group__4__Impl"


    // $ANTLR start "rule__Calibration__Group_3__0"
    // InternalMyDsl.g:5892:1: rule__Calibration__Group_3__0 : rule__Calibration__Group_3__0__Impl rule__Calibration__Group_3__1 ;
    public final void rule__Calibration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5896:1: ( rule__Calibration__Group_3__0__Impl rule__Calibration__Group_3__1 )
            // InternalMyDsl.g:5897:2: rule__Calibration__Group_3__0__Impl rule__Calibration__Group_3__1
            {
            pushFollow(FOLLOW_20);
            rule__Calibration__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Calibration__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calibration__Group_3__0"


    // $ANTLR start "rule__Calibration__Group_3__0__Impl"
    // InternalMyDsl.g:5904:1: rule__Calibration__Group_3__0__Impl : ( 'rising' ) ;
    public final void rule__Calibration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5908:1: ( ( 'rising' ) )
            // InternalMyDsl.g:5909:1: ( 'rising' )
            {
            // InternalMyDsl.g:5909:1: ( 'rising' )
            // InternalMyDsl.g:5910:2: 'rising'
            {
             before(grammarAccess.getCalibrationAccess().getRisingKeyword_3_0()); 
            match(input,72,FOLLOW_2); 
             after(grammarAccess.getCalibrationAccess().getRisingKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calibration__Group_3__0__Impl"


    // $ANTLR start "rule__Calibration__Group_3__1"
    // InternalMyDsl.g:5919:1: rule__Calibration__Group_3__1 : rule__Calibration__Group_3__1__Impl ;
    public final void rule__Calibration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5923:1: ( rule__Calibration__Group_3__1__Impl )
            // InternalMyDsl.g:5924:2: rule__Calibration__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Calibration__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calibration__Group_3__1"


    // $ANTLR start "rule__Calibration__Group_3__1__Impl"
    // InternalMyDsl.g:5930:1: rule__Calibration__Group_3__1__Impl : ( ( rule__Calibration__RisingAssignment_3_1 ) ) ;
    public final void rule__Calibration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5934:1: ( ( ( rule__Calibration__RisingAssignment_3_1 ) ) )
            // InternalMyDsl.g:5935:1: ( ( rule__Calibration__RisingAssignment_3_1 ) )
            {
            // InternalMyDsl.g:5935:1: ( ( rule__Calibration__RisingAssignment_3_1 ) )
            // InternalMyDsl.g:5936:2: ( rule__Calibration__RisingAssignment_3_1 )
            {
             before(grammarAccess.getCalibrationAccess().getRisingAssignment_3_1()); 
            // InternalMyDsl.g:5937:2: ( rule__Calibration__RisingAssignment_3_1 )
            // InternalMyDsl.g:5937:3: rule__Calibration__RisingAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Calibration__RisingAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getCalibrationAccess().getRisingAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calibration__Group_3__1__Impl"


    // $ANTLR start "rule__Calibration__Group_4__0"
    // InternalMyDsl.g:5946:1: rule__Calibration__Group_4__0 : rule__Calibration__Group_4__0__Impl rule__Calibration__Group_4__1 ;
    public final void rule__Calibration__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5950:1: ( rule__Calibration__Group_4__0__Impl rule__Calibration__Group_4__1 )
            // InternalMyDsl.g:5951:2: rule__Calibration__Group_4__0__Impl rule__Calibration__Group_4__1
            {
            pushFollow(FOLLOW_20);
            rule__Calibration__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Calibration__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calibration__Group_4__0"


    // $ANTLR start "rule__Calibration__Group_4__0__Impl"
    // InternalMyDsl.g:5958:1: rule__Calibration__Group_4__0__Impl : ( 'falling' ) ;
    public final void rule__Calibration__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5962:1: ( ( 'falling' ) )
            // InternalMyDsl.g:5963:1: ( 'falling' )
            {
            // InternalMyDsl.g:5963:1: ( 'falling' )
            // InternalMyDsl.g:5964:2: 'falling'
            {
             before(grammarAccess.getCalibrationAccess().getFallingKeyword_4_0()); 
            match(input,73,FOLLOW_2); 
             after(grammarAccess.getCalibrationAccess().getFallingKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calibration__Group_4__0__Impl"


    // $ANTLR start "rule__Calibration__Group_4__1"
    // InternalMyDsl.g:5973:1: rule__Calibration__Group_4__1 : rule__Calibration__Group_4__1__Impl ;
    public final void rule__Calibration__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5977:1: ( rule__Calibration__Group_4__1__Impl )
            // InternalMyDsl.g:5978:2: rule__Calibration__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Calibration__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calibration__Group_4__1"


    // $ANTLR start "rule__Calibration__Group_4__1__Impl"
    // InternalMyDsl.g:5984:1: rule__Calibration__Group_4__1__Impl : ( ( rule__Calibration__FallingAssignment_4_1 ) ) ;
    public final void rule__Calibration__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5988:1: ( ( ( rule__Calibration__FallingAssignment_4_1 ) ) )
            // InternalMyDsl.g:5989:1: ( ( rule__Calibration__FallingAssignment_4_1 ) )
            {
            // InternalMyDsl.g:5989:1: ( ( rule__Calibration__FallingAssignment_4_1 ) )
            // InternalMyDsl.g:5990:2: ( rule__Calibration__FallingAssignment_4_1 )
            {
             before(grammarAccess.getCalibrationAccess().getFallingAssignment_4_1()); 
            // InternalMyDsl.g:5991:2: ( rule__Calibration__FallingAssignment_4_1 )
            // InternalMyDsl.g:5991:3: rule__Calibration__FallingAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Calibration__FallingAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getCalibrationAccess().getFallingAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calibration__Group_4__1__Impl"


    // $ANTLR start "rule__Dynamics__Group__0"
    // InternalMyDsl.g:6000:1: rule__Dynamics__Group__0 : rule__Dynamics__Group__0__Impl rule__Dynamics__Group__1 ;
    public final void rule__Dynamics__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6004:1: ( rule__Dynamics__Group__0__Impl rule__Dynamics__Group__1 )
            // InternalMyDsl.g:6005:2: rule__Dynamics__Group__0__Impl rule__Dynamics__Group__1
            {
            pushFollow(FOLLOW_61);
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
    // InternalMyDsl.g:6012:1: rule__Dynamics__Group__0__Impl : ( () ) ;
    public final void rule__Dynamics__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6016:1: ( ( () ) )
            // InternalMyDsl.g:6017:1: ( () )
            {
            // InternalMyDsl.g:6017:1: ( () )
            // InternalMyDsl.g:6018:2: ()
            {
             before(grammarAccess.getDynamicsAccess().getDynamicsAction_0()); 
            // InternalMyDsl.g:6019:2: ()
            // InternalMyDsl.g:6019:3: 
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
    // InternalMyDsl.g:6027:1: rule__Dynamics__Group__1 : rule__Dynamics__Group__1__Impl rule__Dynamics__Group__2 ;
    public final void rule__Dynamics__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6031:1: ( rule__Dynamics__Group__1__Impl rule__Dynamics__Group__2 )
            // InternalMyDsl.g:6032:2: rule__Dynamics__Group__1__Impl rule__Dynamics__Group__2
            {
            pushFollow(FOLLOW_62);
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
    // InternalMyDsl.g:6039:1: rule__Dynamics__Group__1__Impl : ( 'Dynamics' ) ;
    public final void rule__Dynamics__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6043:1: ( ( 'Dynamics' ) )
            // InternalMyDsl.g:6044:1: ( 'Dynamics' )
            {
            // InternalMyDsl.g:6044:1: ( 'Dynamics' )
            // InternalMyDsl.g:6045:2: 'Dynamics'
            {
             before(grammarAccess.getDynamicsAccess().getDynamicsKeyword_1()); 
            match(input,74,FOLLOW_2); 
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
    // InternalMyDsl.g:6054:1: rule__Dynamics__Group__2 : rule__Dynamics__Group__2__Impl rule__Dynamics__Group__3 ;
    public final void rule__Dynamics__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6058:1: ( rule__Dynamics__Group__2__Impl rule__Dynamics__Group__3 )
            // InternalMyDsl.g:6059:2: rule__Dynamics__Group__2__Impl rule__Dynamics__Group__3
            {
            pushFollow(FOLLOW_62);
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
    // InternalMyDsl.g:6066:1: rule__Dynamics__Group__2__Impl : ( ( rule__Dynamics__NameAssignment_2 )? ) ;
    public final void rule__Dynamics__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6070:1: ( ( ( rule__Dynamics__NameAssignment_2 )? ) )
            // InternalMyDsl.g:6071:1: ( ( rule__Dynamics__NameAssignment_2 )? )
            {
            // InternalMyDsl.g:6071:1: ( ( rule__Dynamics__NameAssignment_2 )? )
            // InternalMyDsl.g:6072:2: ( rule__Dynamics__NameAssignment_2 )?
            {
             before(grammarAccess.getDynamicsAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:6073:2: ( rule__Dynamics__NameAssignment_2 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_ID) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalMyDsl.g:6073:3: rule__Dynamics__NameAssignment_2
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
    // InternalMyDsl.g:6081:1: rule__Dynamics__Group__3 : rule__Dynamics__Group__3__Impl rule__Dynamics__Group__4 ;
    public final void rule__Dynamics__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6085:1: ( rule__Dynamics__Group__3__Impl rule__Dynamics__Group__4 )
            // InternalMyDsl.g:6086:2: rule__Dynamics__Group__3__Impl rule__Dynamics__Group__4
            {
            pushFollow(FOLLOW_62);
            rule__Dynamics__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dynamics__Group__4();

            state._fsp--;


            }

        }
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
    // InternalMyDsl.g:6093:1: rule__Dynamics__Group__3__Impl : ( ( rule__Dynamics__Group_3__0 )? ) ;
    public final void rule__Dynamics__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6097:1: ( ( ( rule__Dynamics__Group_3__0 )? ) )
            // InternalMyDsl.g:6098:1: ( ( rule__Dynamics__Group_3__0 )? )
            {
            // InternalMyDsl.g:6098:1: ( ( rule__Dynamics__Group_3__0 )? )
            // InternalMyDsl.g:6099:2: ( rule__Dynamics__Group_3__0 )?
            {
             before(grammarAccess.getDynamicsAccess().getGroup_3()); 
            // InternalMyDsl.g:6100:2: ( rule__Dynamics__Group_3__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==75) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalMyDsl.g:6100:3: rule__Dynamics__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Dynamics__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDynamicsAccess().getGroup_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Dynamics__Group__4"
    // InternalMyDsl.g:6108:1: rule__Dynamics__Group__4 : rule__Dynamics__Group__4__Impl ;
    public final void rule__Dynamics__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6112:1: ( rule__Dynamics__Group__4__Impl )
            // InternalMyDsl.g:6113:2: rule__Dynamics__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Dynamics__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamics__Group__4"


    // $ANTLR start "rule__Dynamics__Group__4__Impl"
    // InternalMyDsl.g:6119:1: rule__Dynamics__Group__4__Impl : ( ( rule__Dynamics__Group_4__0 )? ) ;
    public final void rule__Dynamics__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6123:1: ( ( ( rule__Dynamics__Group_4__0 )? ) )
            // InternalMyDsl.g:6124:1: ( ( rule__Dynamics__Group_4__0 )? )
            {
            // InternalMyDsl.g:6124:1: ( ( rule__Dynamics__Group_4__0 )? )
            // InternalMyDsl.g:6125:2: ( rule__Dynamics__Group_4__0 )?
            {
             before(grammarAccess.getDynamicsAccess().getGroup_4()); 
            // InternalMyDsl.g:6126:2: ( rule__Dynamics__Group_4__0 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==76) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalMyDsl.g:6126:3: rule__Dynamics__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Dynamics__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDynamicsAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamics__Group__4__Impl"


    // $ANTLR start "rule__Dynamics__Group_3__0"
    // InternalMyDsl.g:6135:1: rule__Dynamics__Group_3__0 : rule__Dynamics__Group_3__0__Impl rule__Dynamics__Group_3__1 ;
    public final void rule__Dynamics__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6139:1: ( rule__Dynamics__Group_3__0__Impl rule__Dynamics__Group_3__1 )
            // InternalMyDsl.g:6140:2: rule__Dynamics__Group_3__0__Impl rule__Dynamics__Group_3__1
            {
            pushFollow(FOLLOW_20);
            rule__Dynamics__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dynamics__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamics__Group_3__0"


    // $ANTLR start "rule__Dynamics__Group_3__0__Impl"
    // InternalMyDsl.g:6147:1: rule__Dynamics__Group_3__0__Impl : ( 'friction' ) ;
    public final void rule__Dynamics__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6151:1: ( ( 'friction' ) )
            // InternalMyDsl.g:6152:1: ( 'friction' )
            {
            // InternalMyDsl.g:6152:1: ( 'friction' )
            // InternalMyDsl.g:6153:2: 'friction'
            {
             before(grammarAccess.getDynamicsAccess().getFrictionKeyword_3_0()); 
            match(input,75,FOLLOW_2); 
             after(grammarAccess.getDynamicsAccess().getFrictionKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamics__Group_3__0__Impl"


    // $ANTLR start "rule__Dynamics__Group_3__1"
    // InternalMyDsl.g:6162:1: rule__Dynamics__Group_3__1 : rule__Dynamics__Group_3__1__Impl ;
    public final void rule__Dynamics__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6166:1: ( rule__Dynamics__Group_3__1__Impl )
            // InternalMyDsl.g:6167:2: rule__Dynamics__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Dynamics__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamics__Group_3__1"


    // $ANTLR start "rule__Dynamics__Group_3__1__Impl"
    // InternalMyDsl.g:6173:1: rule__Dynamics__Group_3__1__Impl : ( ( rule__Dynamics__FrictionAssignment_3_1 ) ) ;
    public final void rule__Dynamics__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6177:1: ( ( ( rule__Dynamics__FrictionAssignment_3_1 ) ) )
            // InternalMyDsl.g:6178:1: ( ( rule__Dynamics__FrictionAssignment_3_1 ) )
            {
            // InternalMyDsl.g:6178:1: ( ( rule__Dynamics__FrictionAssignment_3_1 ) )
            // InternalMyDsl.g:6179:2: ( rule__Dynamics__FrictionAssignment_3_1 )
            {
             before(grammarAccess.getDynamicsAccess().getFrictionAssignment_3_1()); 
            // InternalMyDsl.g:6180:2: ( rule__Dynamics__FrictionAssignment_3_1 )
            // InternalMyDsl.g:6180:3: rule__Dynamics__FrictionAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Dynamics__FrictionAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getDynamicsAccess().getFrictionAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamics__Group_3__1__Impl"


    // $ANTLR start "rule__Dynamics__Group_4__0"
    // InternalMyDsl.g:6189:1: rule__Dynamics__Group_4__0 : rule__Dynamics__Group_4__0__Impl rule__Dynamics__Group_4__1 ;
    public final void rule__Dynamics__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6193:1: ( rule__Dynamics__Group_4__0__Impl rule__Dynamics__Group_4__1 )
            // InternalMyDsl.g:6194:2: rule__Dynamics__Group_4__0__Impl rule__Dynamics__Group_4__1
            {
            pushFollow(FOLLOW_20);
            rule__Dynamics__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dynamics__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamics__Group_4__0"


    // $ANTLR start "rule__Dynamics__Group_4__0__Impl"
    // InternalMyDsl.g:6201:1: rule__Dynamics__Group_4__0__Impl : ( 'damping' ) ;
    public final void rule__Dynamics__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6205:1: ( ( 'damping' ) )
            // InternalMyDsl.g:6206:1: ( 'damping' )
            {
            // InternalMyDsl.g:6206:1: ( 'damping' )
            // InternalMyDsl.g:6207:2: 'damping'
            {
             before(grammarAccess.getDynamicsAccess().getDampingKeyword_4_0()); 
            match(input,76,FOLLOW_2); 
             after(grammarAccess.getDynamicsAccess().getDampingKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamics__Group_4__0__Impl"


    // $ANTLR start "rule__Dynamics__Group_4__1"
    // InternalMyDsl.g:6216:1: rule__Dynamics__Group_4__1 : rule__Dynamics__Group_4__1__Impl ;
    public final void rule__Dynamics__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6220:1: ( rule__Dynamics__Group_4__1__Impl )
            // InternalMyDsl.g:6221:2: rule__Dynamics__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Dynamics__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamics__Group_4__1"


    // $ANTLR start "rule__Dynamics__Group_4__1__Impl"
    // InternalMyDsl.g:6227:1: rule__Dynamics__Group_4__1__Impl : ( ( rule__Dynamics__DampingAssignment_4_1 ) ) ;
    public final void rule__Dynamics__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6231:1: ( ( ( rule__Dynamics__DampingAssignment_4_1 ) ) )
            // InternalMyDsl.g:6232:1: ( ( rule__Dynamics__DampingAssignment_4_1 ) )
            {
            // InternalMyDsl.g:6232:1: ( ( rule__Dynamics__DampingAssignment_4_1 ) )
            // InternalMyDsl.g:6233:2: ( rule__Dynamics__DampingAssignment_4_1 )
            {
             before(grammarAccess.getDynamicsAccess().getDampingAssignment_4_1()); 
            // InternalMyDsl.g:6234:2: ( rule__Dynamics__DampingAssignment_4_1 )
            // InternalMyDsl.g:6234:3: rule__Dynamics__DampingAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Dynamics__DampingAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getDynamicsAccess().getDampingAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamics__Group_4__1__Impl"


    // $ANTLR start "rule__SafetyController__Group__0"
    // InternalMyDsl.g:6243:1: rule__SafetyController__Group__0 : rule__SafetyController__Group__0__Impl rule__SafetyController__Group__1 ;
    public final void rule__SafetyController__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6247:1: ( rule__SafetyController__Group__0__Impl rule__SafetyController__Group__1 )
            // InternalMyDsl.g:6248:2: rule__SafetyController__Group__0__Impl rule__SafetyController__Group__1
            {
            pushFollow(FOLLOW_63);
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
    // InternalMyDsl.g:6255:1: rule__SafetyController__Group__0__Impl : ( 'SafetyController' ) ;
    public final void rule__SafetyController__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6259:1: ( ( 'SafetyController' ) )
            // InternalMyDsl.g:6260:1: ( 'SafetyController' )
            {
            // InternalMyDsl.g:6260:1: ( 'SafetyController' )
            // InternalMyDsl.g:6261:2: 'SafetyController'
            {
             before(grammarAccess.getSafetyControllerAccess().getSafetyControllerKeyword_0()); 
            match(input,77,FOLLOW_2); 
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
    // InternalMyDsl.g:6270:1: rule__SafetyController__Group__1 : rule__SafetyController__Group__1__Impl rule__SafetyController__Group__2 ;
    public final void rule__SafetyController__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6274:1: ( rule__SafetyController__Group__1__Impl rule__SafetyController__Group__2 )
            // InternalMyDsl.g:6275:2: rule__SafetyController__Group__1__Impl rule__SafetyController__Group__2
            {
            pushFollow(FOLLOW_63);
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
    // InternalMyDsl.g:6282:1: rule__SafetyController__Group__1__Impl : ( ( rule__SafetyController__NameAssignment_1 )? ) ;
    public final void rule__SafetyController__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6286:1: ( ( ( rule__SafetyController__NameAssignment_1 )? ) )
            // InternalMyDsl.g:6287:1: ( ( rule__SafetyController__NameAssignment_1 )? )
            {
            // InternalMyDsl.g:6287:1: ( ( rule__SafetyController__NameAssignment_1 )? )
            // InternalMyDsl.g:6288:2: ( rule__SafetyController__NameAssignment_1 )?
            {
             before(grammarAccess.getSafetyControllerAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:6289:2: ( rule__SafetyController__NameAssignment_1 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_ID) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalMyDsl.g:6289:3: rule__SafetyController__NameAssignment_1
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
    // InternalMyDsl.g:6297:1: rule__SafetyController__Group__2 : rule__SafetyController__Group__2__Impl rule__SafetyController__Group__3 ;
    public final void rule__SafetyController__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6301:1: ( rule__SafetyController__Group__2__Impl rule__SafetyController__Group__3 )
            // InternalMyDsl.g:6302:2: rule__SafetyController__Group__2__Impl rule__SafetyController__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:6309:1: rule__SafetyController__Group__2__Impl : ( 'k_velocity' ) ;
    public final void rule__SafetyController__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6313:1: ( ( 'k_velocity' ) )
            // InternalMyDsl.g:6314:1: ( 'k_velocity' )
            {
            // InternalMyDsl.g:6314:1: ( 'k_velocity' )
            // InternalMyDsl.g:6315:2: 'k_velocity'
            {
             before(grammarAccess.getSafetyControllerAccess().getK_velocityKeyword_2()); 
            match(input,78,FOLLOW_2); 
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
    // InternalMyDsl.g:6324:1: rule__SafetyController__Group__3 : rule__SafetyController__Group__3__Impl rule__SafetyController__Group__4 ;
    public final void rule__SafetyController__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6328:1: ( rule__SafetyController__Group__3__Impl rule__SafetyController__Group__4 )
            // InternalMyDsl.g:6329:2: rule__SafetyController__Group__3__Impl rule__SafetyController__Group__4
            {
            pushFollow(FOLLOW_64);
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
    // InternalMyDsl.g:6336:1: rule__SafetyController__Group__3__Impl : ( ( rule__SafetyController__K_velocityAssignment_3 ) ) ;
    public final void rule__SafetyController__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6340:1: ( ( ( rule__SafetyController__K_velocityAssignment_3 ) ) )
            // InternalMyDsl.g:6341:1: ( ( rule__SafetyController__K_velocityAssignment_3 ) )
            {
            // InternalMyDsl.g:6341:1: ( ( rule__SafetyController__K_velocityAssignment_3 ) )
            // InternalMyDsl.g:6342:2: ( rule__SafetyController__K_velocityAssignment_3 )
            {
             before(grammarAccess.getSafetyControllerAccess().getK_velocityAssignment_3()); 
            // InternalMyDsl.g:6343:2: ( rule__SafetyController__K_velocityAssignment_3 )
            // InternalMyDsl.g:6343:3: rule__SafetyController__K_velocityAssignment_3
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
    // InternalMyDsl.g:6351:1: rule__SafetyController__Group__4 : rule__SafetyController__Group__4__Impl rule__SafetyController__Group__5 ;
    public final void rule__SafetyController__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6355:1: ( rule__SafetyController__Group__4__Impl rule__SafetyController__Group__5 )
            // InternalMyDsl.g:6356:2: rule__SafetyController__Group__4__Impl rule__SafetyController__Group__5
            {
            pushFollow(FOLLOW_64);
            rule__SafetyController__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyController__Group__5();

            state._fsp--;


            }

        }
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
    // InternalMyDsl.g:6363:1: rule__SafetyController__Group__4__Impl : ( ( rule__SafetyController__Group_4__0 )? ) ;
    public final void rule__SafetyController__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6367:1: ( ( ( rule__SafetyController__Group_4__0 )? ) )
            // InternalMyDsl.g:6368:1: ( ( rule__SafetyController__Group_4__0 )? )
            {
            // InternalMyDsl.g:6368:1: ( ( rule__SafetyController__Group_4__0 )? )
            // InternalMyDsl.g:6369:2: ( rule__SafetyController__Group_4__0 )?
            {
             before(grammarAccess.getSafetyControllerAccess().getGroup_4()); 
            // InternalMyDsl.g:6370:2: ( rule__SafetyController__Group_4__0 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==79) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalMyDsl.g:6370:3: rule__SafetyController__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SafetyController__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSafetyControllerAccess().getGroup_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__SafetyController__Group__5"
    // InternalMyDsl.g:6378:1: rule__SafetyController__Group__5 : rule__SafetyController__Group__5__Impl rule__SafetyController__Group__6 ;
    public final void rule__SafetyController__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6382:1: ( rule__SafetyController__Group__5__Impl rule__SafetyController__Group__6 )
            // InternalMyDsl.g:6383:2: rule__SafetyController__Group__5__Impl rule__SafetyController__Group__6
            {
            pushFollow(FOLLOW_64);
            rule__SafetyController__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyController__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group__5"


    // $ANTLR start "rule__SafetyController__Group__5__Impl"
    // InternalMyDsl.g:6390:1: rule__SafetyController__Group__5__Impl : ( ( rule__SafetyController__Group_5__0 )? ) ;
    public final void rule__SafetyController__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6394:1: ( ( ( rule__SafetyController__Group_5__0 )? ) )
            // InternalMyDsl.g:6395:1: ( ( rule__SafetyController__Group_5__0 )? )
            {
            // InternalMyDsl.g:6395:1: ( ( rule__SafetyController__Group_5__0 )? )
            // InternalMyDsl.g:6396:2: ( rule__SafetyController__Group_5__0 )?
            {
             before(grammarAccess.getSafetyControllerAccess().getGroup_5()); 
            // InternalMyDsl.g:6397:2: ( rule__SafetyController__Group_5__0 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==80) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalMyDsl.g:6397:3: rule__SafetyController__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SafetyController__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSafetyControllerAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group__5__Impl"


    // $ANTLR start "rule__SafetyController__Group__6"
    // InternalMyDsl.g:6405:1: rule__SafetyController__Group__6 : rule__SafetyController__Group__6__Impl ;
    public final void rule__SafetyController__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6409:1: ( rule__SafetyController__Group__6__Impl )
            // InternalMyDsl.g:6410:2: rule__SafetyController__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SafetyController__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group__6"


    // $ANTLR start "rule__SafetyController__Group__6__Impl"
    // InternalMyDsl.g:6416:1: rule__SafetyController__Group__6__Impl : ( ( rule__SafetyController__Group_6__0 )? ) ;
    public final void rule__SafetyController__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6420:1: ( ( ( rule__SafetyController__Group_6__0 )? ) )
            // InternalMyDsl.g:6421:1: ( ( rule__SafetyController__Group_6__0 )? )
            {
            // InternalMyDsl.g:6421:1: ( ( rule__SafetyController__Group_6__0 )? )
            // InternalMyDsl.g:6422:2: ( rule__SafetyController__Group_6__0 )?
            {
             before(grammarAccess.getSafetyControllerAccess().getGroup_6()); 
            // InternalMyDsl.g:6423:2: ( rule__SafetyController__Group_6__0 )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==81) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalMyDsl.g:6423:3: rule__SafetyController__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SafetyController__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSafetyControllerAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group__6__Impl"


    // $ANTLR start "rule__SafetyController__Group_4__0"
    // InternalMyDsl.g:6432:1: rule__SafetyController__Group_4__0 : rule__SafetyController__Group_4__0__Impl rule__SafetyController__Group_4__1 ;
    public final void rule__SafetyController__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6436:1: ( rule__SafetyController__Group_4__0__Impl rule__SafetyController__Group_4__1 )
            // InternalMyDsl.g:6437:2: rule__SafetyController__Group_4__0__Impl rule__SafetyController__Group_4__1
            {
            pushFollow(FOLLOW_20);
            rule__SafetyController__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyController__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group_4__0"


    // $ANTLR start "rule__SafetyController__Group_4__0__Impl"
    // InternalMyDsl.g:6444:1: rule__SafetyController__Group_4__0__Impl : ( 'k_position' ) ;
    public final void rule__SafetyController__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6448:1: ( ( 'k_position' ) )
            // InternalMyDsl.g:6449:1: ( 'k_position' )
            {
            // InternalMyDsl.g:6449:1: ( 'k_position' )
            // InternalMyDsl.g:6450:2: 'k_position'
            {
             before(grammarAccess.getSafetyControllerAccess().getK_positionKeyword_4_0()); 
            match(input,79,FOLLOW_2); 
             after(grammarAccess.getSafetyControllerAccess().getK_positionKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group_4__0__Impl"


    // $ANTLR start "rule__SafetyController__Group_4__1"
    // InternalMyDsl.g:6459:1: rule__SafetyController__Group_4__1 : rule__SafetyController__Group_4__1__Impl ;
    public final void rule__SafetyController__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6463:1: ( rule__SafetyController__Group_4__1__Impl )
            // InternalMyDsl.g:6464:2: rule__SafetyController__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SafetyController__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group_4__1"


    // $ANTLR start "rule__SafetyController__Group_4__1__Impl"
    // InternalMyDsl.g:6470:1: rule__SafetyController__Group_4__1__Impl : ( ( rule__SafetyController__K_positionAssignment_4_1 ) ) ;
    public final void rule__SafetyController__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6474:1: ( ( ( rule__SafetyController__K_positionAssignment_4_1 ) ) )
            // InternalMyDsl.g:6475:1: ( ( rule__SafetyController__K_positionAssignment_4_1 ) )
            {
            // InternalMyDsl.g:6475:1: ( ( rule__SafetyController__K_positionAssignment_4_1 ) )
            // InternalMyDsl.g:6476:2: ( rule__SafetyController__K_positionAssignment_4_1 )
            {
             before(grammarAccess.getSafetyControllerAccess().getK_positionAssignment_4_1()); 
            // InternalMyDsl.g:6477:2: ( rule__SafetyController__K_positionAssignment_4_1 )
            // InternalMyDsl.g:6477:3: rule__SafetyController__K_positionAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__SafetyController__K_positionAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSafetyControllerAccess().getK_positionAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group_4__1__Impl"


    // $ANTLR start "rule__SafetyController__Group_5__0"
    // InternalMyDsl.g:6486:1: rule__SafetyController__Group_5__0 : rule__SafetyController__Group_5__0__Impl rule__SafetyController__Group_5__1 ;
    public final void rule__SafetyController__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6490:1: ( rule__SafetyController__Group_5__0__Impl rule__SafetyController__Group_5__1 )
            // InternalMyDsl.g:6491:2: rule__SafetyController__Group_5__0__Impl rule__SafetyController__Group_5__1
            {
            pushFollow(FOLLOW_20);
            rule__SafetyController__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyController__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group_5__0"


    // $ANTLR start "rule__SafetyController__Group_5__0__Impl"
    // InternalMyDsl.g:6498:1: rule__SafetyController__Group_5__0__Impl : ( 'softLowerLimit' ) ;
    public final void rule__SafetyController__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6502:1: ( ( 'softLowerLimit' ) )
            // InternalMyDsl.g:6503:1: ( 'softLowerLimit' )
            {
            // InternalMyDsl.g:6503:1: ( 'softLowerLimit' )
            // InternalMyDsl.g:6504:2: 'softLowerLimit'
            {
             before(grammarAccess.getSafetyControllerAccess().getSoftLowerLimitKeyword_5_0()); 
            match(input,80,FOLLOW_2); 
             after(grammarAccess.getSafetyControllerAccess().getSoftLowerLimitKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group_5__0__Impl"


    // $ANTLR start "rule__SafetyController__Group_5__1"
    // InternalMyDsl.g:6513:1: rule__SafetyController__Group_5__1 : rule__SafetyController__Group_5__1__Impl ;
    public final void rule__SafetyController__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6517:1: ( rule__SafetyController__Group_5__1__Impl )
            // InternalMyDsl.g:6518:2: rule__SafetyController__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SafetyController__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group_5__1"


    // $ANTLR start "rule__SafetyController__Group_5__1__Impl"
    // InternalMyDsl.g:6524:1: rule__SafetyController__Group_5__1__Impl : ( ( rule__SafetyController__SoftLowerLimitAssignment_5_1 ) ) ;
    public final void rule__SafetyController__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6528:1: ( ( ( rule__SafetyController__SoftLowerLimitAssignment_5_1 ) ) )
            // InternalMyDsl.g:6529:1: ( ( rule__SafetyController__SoftLowerLimitAssignment_5_1 ) )
            {
            // InternalMyDsl.g:6529:1: ( ( rule__SafetyController__SoftLowerLimitAssignment_5_1 ) )
            // InternalMyDsl.g:6530:2: ( rule__SafetyController__SoftLowerLimitAssignment_5_1 )
            {
             before(grammarAccess.getSafetyControllerAccess().getSoftLowerLimitAssignment_5_1()); 
            // InternalMyDsl.g:6531:2: ( rule__SafetyController__SoftLowerLimitAssignment_5_1 )
            // InternalMyDsl.g:6531:3: rule__SafetyController__SoftLowerLimitAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__SafetyController__SoftLowerLimitAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getSafetyControllerAccess().getSoftLowerLimitAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group_5__1__Impl"


    // $ANTLR start "rule__SafetyController__Group_6__0"
    // InternalMyDsl.g:6540:1: rule__SafetyController__Group_6__0 : rule__SafetyController__Group_6__0__Impl rule__SafetyController__Group_6__1 ;
    public final void rule__SafetyController__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6544:1: ( rule__SafetyController__Group_6__0__Impl rule__SafetyController__Group_6__1 )
            // InternalMyDsl.g:6545:2: rule__SafetyController__Group_6__0__Impl rule__SafetyController__Group_6__1
            {
            pushFollow(FOLLOW_20);
            rule__SafetyController__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyController__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group_6__0"


    // $ANTLR start "rule__SafetyController__Group_6__0__Impl"
    // InternalMyDsl.g:6552:1: rule__SafetyController__Group_6__0__Impl : ( 'softUpperLimit' ) ;
    public final void rule__SafetyController__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6556:1: ( ( 'softUpperLimit' ) )
            // InternalMyDsl.g:6557:1: ( 'softUpperLimit' )
            {
            // InternalMyDsl.g:6557:1: ( 'softUpperLimit' )
            // InternalMyDsl.g:6558:2: 'softUpperLimit'
            {
             before(grammarAccess.getSafetyControllerAccess().getSoftUpperLimitKeyword_6_0()); 
            match(input,81,FOLLOW_2); 
             after(grammarAccess.getSafetyControllerAccess().getSoftUpperLimitKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group_6__0__Impl"


    // $ANTLR start "rule__SafetyController__Group_6__1"
    // InternalMyDsl.g:6567:1: rule__SafetyController__Group_6__1 : rule__SafetyController__Group_6__1__Impl ;
    public final void rule__SafetyController__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6571:1: ( rule__SafetyController__Group_6__1__Impl )
            // InternalMyDsl.g:6572:2: rule__SafetyController__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SafetyController__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group_6__1"


    // $ANTLR start "rule__SafetyController__Group_6__1__Impl"
    // InternalMyDsl.g:6578:1: rule__SafetyController__Group_6__1__Impl : ( ( rule__SafetyController__SoftUpperLimitAssignment_6_1 ) ) ;
    public final void rule__SafetyController__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6582:1: ( ( ( rule__SafetyController__SoftUpperLimitAssignment_6_1 ) ) )
            // InternalMyDsl.g:6583:1: ( ( rule__SafetyController__SoftUpperLimitAssignment_6_1 ) )
            {
            // InternalMyDsl.g:6583:1: ( ( rule__SafetyController__SoftUpperLimitAssignment_6_1 ) )
            // InternalMyDsl.g:6584:2: ( rule__SafetyController__SoftUpperLimitAssignment_6_1 )
            {
             before(grammarAccess.getSafetyControllerAccess().getSoftUpperLimitAssignment_6_1()); 
            // InternalMyDsl.g:6585:2: ( rule__SafetyController__SoftUpperLimitAssignment_6_1 )
            // InternalMyDsl.g:6585:3: rule__SafetyController__SoftUpperLimitAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__SafetyController__SoftUpperLimitAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getSafetyControllerAccess().getSoftUpperLimitAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group_6__1__Impl"


    // $ANTLR start "rule__URDFAttrSignedNumeric__Group__0"
    // InternalMyDsl.g:6594:1: rule__URDFAttrSignedNumeric__Group__0 : rule__URDFAttrSignedNumeric__Group__0__Impl rule__URDFAttrSignedNumeric__Group__1 ;
    public final void rule__URDFAttrSignedNumeric__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6598:1: ( rule__URDFAttrSignedNumeric__Group__0__Impl rule__URDFAttrSignedNumeric__Group__1 )
            // InternalMyDsl.g:6599:2: rule__URDFAttrSignedNumeric__Group__0__Impl rule__URDFAttrSignedNumeric__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__URDFAttrSignedNumeric__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__URDFAttrSignedNumeric__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URDFAttrSignedNumeric__Group__0"


    // $ANTLR start "rule__URDFAttrSignedNumeric__Group__0__Impl"
    // InternalMyDsl.g:6606:1: rule__URDFAttrSignedNumeric__Group__0__Impl : ( () ) ;
    public final void rule__URDFAttrSignedNumeric__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6610:1: ( ( () ) )
            // InternalMyDsl.g:6611:1: ( () )
            {
            // InternalMyDsl.g:6611:1: ( () )
            // InternalMyDsl.g:6612:2: ()
            {
             before(grammarAccess.getURDFAttrSignedNumericAccess().getURDFAttrSignedNumericAction_0()); 
            // InternalMyDsl.g:6613:2: ()
            // InternalMyDsl.g:6613:3: 
            {
            }

             after(grammarAccess.getURDFAttrSignedNumericAccess().getURDFAttrSignedNumericAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URDFAttrSignedNumeric__Group__0__Impl"


    // $ANTLR start "rule__URDFAttrSignedNumeric__Group__1"
    // InternalMyDsl.g:6621:1: rule__URDFAttrSignedNumeric__Group__1 : rule__URDFAttrSignedNumeric__Group__1__Impl rule__URDFAttrSignedNumeric__Group__2 ;
    public final void rule__URDFAttrSignedNumeric__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6625:1: ( rule__URDFAttrSignedNumeric__Group__1__Impl rule__URDFAttrSignedNumeric__Group__2 )
            // InternalMyDsl.g:6626:2: rule__URDFAttrSignedNumeric__Group__1__Impl rule__URDFAttrSignedNumeric__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__URDFAttrSignedNumeric__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__URDFAttrSignedNumeric__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URDFAttrSignedNumeric__Group__1"


    // $ANTLR start "rule__URDFAttrSignedNumeric__Group__1__Impl"
    // InternalMyDsl.g:6633:1: rule__URDFAttrSignedNumeric__Group__1__Impl : ( ( rule__URDFAttrSignedNumeric__NameAssignment_1 )? ) ;
    public final void rule__URDFAttrSignedNumeric__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6637:1: ( ( ( rule__URDFAttrSignedNumeric__NameAssignment_1 )? ) )
            // InternalMyDsl.g:6638:1: ( ( rule__URDFAttrSignedNumeric__NameAssignment_1 )? )
            {
            // InternalMyDsl.g:6638:1: ( ( rule__URDFAttrSignedNumeric__NameAssignment_1 )? )
            // InternalMyDsl.g:6639:2: ( rule__URDFAttrSignedNumeric__NameAssignment_1 )?
            {
             before(grammarAccess.getURDFAttrSignedNumericAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:6640:2: ( rule__URDFAttrSignedNumeric__NameAssignment_1 )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_ID) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalMyDsl.g:6640:3: rule__URDFAttrSignedNumeric__NameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__URDFAttrSignedNumeric__NameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getURDFAttrSignedNumericAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URDFAttrSignedNumeric__Group__1__Impl"


    // $ANTLR start "rule__URDFAttrSignedNumeric__Group__2"
    // InternalMyDsl.g:6648:1: rule__URDFAttrSignedNumeric__Group__2 : rule__URDFAttrSignedNumeric__Group__2__Impl ;
    public final void rule__URDFAttrSignedNumeric__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6652:1: ( rule__URDFAttrSignedNumeric__Group__2__Impl )
            // InternalMyDsl.g:6653:2: rule__URDFAttrSignedNumeric__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__URDFAttrSignedNumeric__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URDFAttrSignedNumeric__Group__2"


    // $ANTLR start "rule__URDFAttrSignedNumeric__Group__2__Impl"
    // InternalMyDsl.g:6659:1: rule__URDFAttrSignedNumeric__Group__2__Impl : ( ( rule__URDFAttrSignedNumeric__ValueAssignment_2 ) ) ;
    public final void rule__URDFAttrSignedNumeric__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6663:1: ( ( ( rule__URDFAttrSignedNumeric__ValueAssignment_2 ) ) )
            // InternalMyDsl.g:6664:1: ( ( rule__URDFAttrSignedNumeric__ValueAssignment_2 ) )
            {
            // InternalMyDsl.g:6664:1: ( ( rule__URDFAttrSignedNumeric__ValueAssignment_2 ) )
            // InternalMyDsl.g:6665:2: ( rule__URDFAttrSignedNumeric__ValueAssignment_2 )
            {
             before(grammarAccess.getURDFAttrSignedNumericAccess().getValueAssignment_2()); 
            // InternalMyDsl.g:6666:2: ( rule__URDFAttrSignedNumeric__ValueAssignment_2 )
            // InternalMyDsl.g:6666:3: rule__URDFAttrSignedNumeric__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__URDFAttrSignedNumeric__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getURDFAttrSignedNumericAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URDFAttrSignedNumeric__Group__2__Impl"


    // $ANTLR start "rule__FLOAT__Group__0"
    // InternalMyDsl.g:6675:1: rule__FLOAT__Group__0 : rule__FLOAT__Group__0__Impl rule__FLOAT__Group__1 ;
    public final void rule__FLOAT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6679:1: ( rule__FLOAT__Group__0__Impl rule__FLOAT__Group__1 )
            // InternalMyDsl.g:6680:2: rule__FLOAT__Group__0__Impl rule__FLOAT__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalMyDsl.g:6687:1: rule__FLOAT__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__FLOAT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6691:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:6692:1: ( RULE_INT )
            {
            // InternalMyDsl.g:6692:1: ( RULE_INT )
            // InternalMyDsl.g:6693:2: RULE_INT
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
    // InternalMyDsl.g:6702:1: rule__FLOAT__Group__1 : rule__FLOAT__Group__1__Impl rule__FLOAT__Group__2 ;
    public final void rule__FLOAT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6706:1: ( rule__FLOAT__Group__1__Impl rule__FLOAT__Group__2 )
            // InternalMyDsl.g:6707:2: rule__FLOAT__Group__1__Impl rule__FLOAT__Group__2
            {
            pushFollow(FOLLOW_45);
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
    // InternalMyDsl.g:6714:1: rule__FLOAT__Group__1__Impl : ( '.' ) ;
    public final void rule__FLOAT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6718:1: ( ( '.' ) )
            // InternalMyDsl.g:6719:1: ( '.' )
            {
            // InternalMyDsl.g:6719:1: ( '.' )
            // InternalMyDsl.g:6720:2: '.'
            {
             before(grammarAccess.getFLOATAccess().getFullStopKeyword_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalMyDsl.g:6729:1: rule__FLOAT__Group__2 : rule__FLOAT__Group__2__Impl ;
    public final void rule__FLOAT__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6733:1: ( rule__FLOAT__Group__2__Impl )
            // InternalMyDsl.g:6734:2: rule__FLOAT__Group__2__Impl
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
    // InternalMyDsl.g:6740:1: rule__FLOAT__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__FLOAT__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6744:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:6745:1: ( RULE_INT )
            {
            // InternalMyDsl.g:6745:1: ( RULE_INT )
            // InternalMyDsl.g:6746:2: RULE_INT
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
    // InternalMyDsl.g:6756:1: rule__SCIENTIFIC__Group__0 : rule__SCIENTIFIC__Group__0__Impl rule__SCIENTIFIC__Group__1 ;
    public final void rule__SCIENTIFIC__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6760:1: ( rule__SCIENTIFIC__Group__0__Impl rule__SCIENTIFIC__Group__1 )
            // InternalMyDsl.g:6761:2: rule__SCIENTIFIC__Group__0__Impl rule__SCIENTIFIC__Group__1
            {
            pushFollow(FOLLOW_65);
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
    // InternalMyDsl.g:6768:1: rule__SCIENTIFIC__Group__0__Impl : ( ruleFLOAT ) ;
    public final void rule__SCIENTIFIC__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6772:1: ( ( ruleFLOAT ) )
            // InternalMyDsl.g:6773:1: ( ruleFLOAT )
            {
            // InternalMyDsl.g:6773:1: ( ruleFLOAT )
            // InternalMyDsl.g:6774:2: ruleFLOAT
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
    // InternalMyDsl.g:6783:1: rule__SCIENTIFIC__Group__1 : rule__SCIENTIFIC__Group__1__Impl rule__SCIENTIFIC__Group__2 ;
    public final void rule__SCIENTIFIC__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6787:1: ( rule__SCIENTIFIC__Group__1__Impl rule__SCIENTIFIC__Group__2 )
            // InternalMyDsl.g:6788:2: rule__SCIENTIFIC__Group__1__Impl rule__SCIENTIFIC__Group__2
            {
            pushFollow(FOLLOW_66);
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
    // InternalMyDsl.g:6795:1: rule__SCIENTIFIC__Group__1__Impl : ( 'e' ) ;
    public final void rule__SCIENTIFIC__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6799:1: ( ( 'e' ) )
            // InternalMyDsl.g:6800:1: ( 'e' )
            {
            // InternalMyDsl.g:6800:1: ( 'e' )
            // InternalMyDsl.g:6801:2: 'e'
            {
             before(grammarAccess.getSCIENTIFICAccess().getEKeyword_1()); 
            match(input,82,FOLLOW_2); 
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
    // InternalMyDsl.g:6810:1: rule__SCIENTIFIC__Group__2 : rule__SCIENTIFIC__Group__2__Impl rule__SCIENTIFIC__Group__3 ;
    public final void rule__SCIENTIFIC__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6814:1: ( rule__SCIENTIFIC__Group__2__Impl rule__SCIENTIFIC__Group__3 )
            // InternalMyDsl.g:6815:2: rule__SCIENTIFIC__Group__2__Impl rule__SCIENTIFIC__Group__3
            {
            pushFollow(FOLLOW_66);
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
    // InternalMyDsl.g:6822:1: rule__SCIENTIFIC__Group__2__Impl : ( ( rule__SCIENTIFIC__Alternatives_2 )? ) ;
    public final void rule__SCIENTIFIC__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6826:1: ( ( ( rule__SCIENTIFIC__Alternatives_2 )? ) )
            // InternalMyDsl.g:6827:1: ( ( rule__SCIENTIFIC__Alternatives_2 )? )
            {
            // InternalMyDsl.g:6827:1: ( ( rule__SCIENTIFIC__Alternatives_2 )? )
            // InternalMyDsl.g:6828:2: ( rule__SCIENTIFIC__Alternatives_2 )?
            {
             before(grammarAccess.getSCIENTIFICAccess().getAlternatives_2()); 
            // InternalMyDsl.g:6829:2: ( rule__SCIENTIFIC__Alternatives_2 )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( ((LA58_0>=11 && LA58_0<=12)) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalMyDsl.g:6829:3: rule__SCIENTIFIC__Alternatives_2
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
    // InternalMyDsl.g:6837:1: rule__SCIENTIFIC__Group__3 : rule__SCIENTIFIC__Group__3__Impl ;
    public final void rule__SCIENTIFIC__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6841:1: ( rule__SCIENTIFIC__Group__3__Impl )
            // InternalMyDsl.g:6842:2: rule__SCIENTIFIC__Group__3__Impl
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
    // InternalMyDsl.g:6848:1: rule__SCIENTIFIC__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__SCIENTIFIC__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6852:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:6853:1: ( RULE_INT )
            {
            // InternalMyDsl.g:6853:1: ( RULE_INT )
            // InternalMyDsl.g:6854:2: RULE_INT
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
    // InternalMyDsl.g:6864:1: rule__SIGNED_NUMERIC__Group__0 : rule__SIGNED_NUMERIC__Group__0__Impl rule__SIGNED_NUMERIC__Group__1 ;
    public final void rule__SIGNED_NUMERIC__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6868:1: ( rule__SIGNED_NUMERIC__Group__0__Impl rule__SIGNED_NUMERIC__Group__1 )
            // InternalMyDsl.g:6869:2: rule__SIGNED_NUMERIC__Group__0__Impl rule__SIGNED_NUMERIC__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:6876:1: rule__SIGNED_NUMERIC__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__SIGNED_NUMERIC__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6880:1: ( ( ( '-' )? ) )
            // InternalMyDsl.g:6881:1: ( ( '-' )? )
            {
            // InternalMyDsl.g:6881:1: ( ( '-' )? )
            // InternalMyDsl.g:6882:2: ( '-' )?
            {
             before(grammarAccess.getSIGNED_NUMERICAccess().getHyphenMinusKeyword_0()); 
            // InternalMyDsl.g:6883:2: ( '-' )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==12) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalMyDsl.g:6883:3: '-'
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
    // InternalMyDsl.g:6891:1: rule__SIGNED_NUMERIC__Group__1 : rule__SIGNED_NUMERIC__Group__1__Impl ;
    public final void rule__SIGNED_NUMERIC__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6895:1: ( rule__SIGNED_NUMERIC__Group__1__Impl )
            // InternalMyDsl.g:6896:2: rule__SIGNED_NUMERIC__Group__1__Impl
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
    // InternalMyDsl.g:6902:1: rule__SIGNED_NUMERIC__Group__1__Impl : ( ( rule__SIGNED_NUMERIC__Alternatives_1 ) ) ;
    public final void rule__SIGNED_NUMERIC__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6906:1: ( ( ( rule__SIGNED_NUMERIC__Alternatives_1 ) ) )
            // InternalMyDsl.g:6907:1: ( ( rule__SIGNED_NUMERIC__Alternatives_1 ) )
            {
            // InternalMyDsl.g:6907:1: ( ( rule__SIGNED_NUMERIC__Alternatives_1 ) )
            // InternalMyDsl.g:6908:2: ( rule__SIGNED_NUMERIC__Alternatives_1 )
            {
             before(grammarAccess.getSIGNED_NUMERICAccess().getAlternatives_1()); 
            // InternalMyDsl.g:6909:2: ( rule__SIGNED_NUMERIC__Alternatives_1 )
            // InternalMyDsl.g:6909:3: rule__SIGNED_NUMERIC__Alternatives_1
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
    // InternalMyDsl.g:6918:1: rule__Robot__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Robot__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6922:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:6923:2: ( RULE_ID )
            {
            // InternalMyDsl.g:6923:2: ( RULE_ID )
            // InternalMyDsl.g:6924:3: RULE_ID
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
    // InternalMyDsl.g:6933:1: rule__Robot__TopologiesAssignment_2_0_1 : ( ruleTopology ) ;
    public final void rule__Robot__TopologiesAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6937:1: ( ( ruleTopology ) )
            // InternalMyDsl.g:6938:2: ( ruleTopology )
            {
            // InternalMyDsl.g:6938:2: ( ruleTopology )
            // InternalMyDsl.g:6939:3: ruleTopology
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
    // InternalMyDsl.g:6948:1: rule__Robot__LinksAssignment_2_1 : ( ruleLink ) ;
    public final void rule__Robot__LinksAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6952:1: ( ( ruleLink ) )
            // InternalMyDsl.g:6953:2: ( ruleLink )
            {
            // InternalMyDsl.g:6953:2: ( ruleLink )
            // InternalMyDsl.g:6954:3: ruleLink
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
    // InternalMyDsl.g:6963:1: rule__Robot__JointAssignment_2_2 : ( ruleJoint ) ;
    public final void rule__Robot__JointAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6967:1: ( ( ruleJoint ) )
            // InternalMyDsl.g:6968:2: ( ruleJoint )
            {
            // InternalMyDsl.g:6968:2: ( ruleJoint )
            // InternalMyDsl.g:6969:3: ruleJoint
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


    // $ANTLR start "rule__Topology__ParentAssignment_0"
    // InternalMyDsl.g:6978:1: rule__Topology__ParentAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Topology__ParentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6982:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:6983:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:6983:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:6984:3: ( RULE_ID )
            {
             before(grammarAccess.getTopologyAccess().getParentLinkCrossReference_0_0()); 
            // InternalMyDsl.g:6985:3: ( RULE_ID )
            // InternalMyDsl.g:6986:4: RULE_ID
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
    // InternalMyDsl.g:6997:1: rule__Topology__JointAssignment_1_0 : ( ruleJointRef ) ;
    public final void rule__Topology__JointAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7001:1: ( ( ruleJointRef ) )
            // InternalMyDsl.g:7002:2: ( ruleJointRef )
            {
            // InternalMyDsl.g:7002:2: ( ruleJointRef )
            // InternalMyDsl.g:7003:3: ruleJointRef
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
    // InternalMyDsl.g:7012:1: rule__Topology__ChildAssignment_1_1 : ( ruleTopology ) ;
    public final void rule__Topology__ChildAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7016:1: ( ( ruleTopology ) )
            // InternalMyDsl.g:7017:2: ( ruleTopology )
            {
            // InternalMyDsl.g:7017:2: ( ruleTopology )
            // InternalMyDsl.g:7018:3: ruleTopology
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
    // InternalMyDsl.g:7027:1: rule__JointRef__FixAssignment_0 : ( ( '->' ) ) ;
    public final void rule__JointRef__FixAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7031:1: ( ( ( '->' ) ) )
            // InternalMyDsl.g:7032:2: ( ( '->' ) )
            {
            // InternalMyDsl.g:7032:2: ( ( '->' ) )
            // InternalMyDsl.g:7033:3: ( '->' )
            {
             before(grammarAccess.getJointRefAccess().getFixHyphenMinusGreaterThanSignKeyword_0_0()); 
            // InternalMyDsl.g:7034:3: ( '->' )
            // InternalMyDsl.g:7035:4: '->'
            {
             before(grammarAccess.getJointRefAccess().getFixHyphenMinusGreaterThanSignKeyword_0_0()); 
            match(input,83,FOLLOW_2); 
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
    // InternalMyDsl.g:7046:1: rule__JointRef__RevAssignment_1 : ( ( 'r->' ) ) ;
    public final void rule__JointRef__RevAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7050:1: ( ( ( 'r->' ) ) )
            // InternalMyDsl.g:7051:2: ( ( 'r->' ) )
            {
            // InternalMyDsl.g:7051:2: ( ( 'r->' ) )
            // InternalMyDsl.g:7052:3: ( 'r->' )
            {
             before(grammarAccess.getJointRefAccess().getRevRKeyword_1_0()); 
            // InternalMyDsl.g:7053:3: ( 'r->' )
            // InternalMyDsl.g:7054:4: 'r->'
            {
             before(grammarAccess.getJointRefAccess().getRevRKeyword_1_0()); 
            match(input,84,FOLLOW_2); 
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
    // InternalMyDsl.g:7065:1: rule__JointRef__PrisAssignment_2 : ( ( 'p->' ) ) ;
    public final void rule__JointRef__PrisAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7069:1: ( ( ( 'p->' ) ) )
            // InternalMyDsl.g:7070:2: ( ( 'p->' ) )
            {
            // InternalMyDsl.g:7070:2: ( ( 'p->' ) )
            // InternalMyDsl.g:7071:3: ( 'p->' )
            {
             before(grammarAccess.getJointRefAccess().getPrisPKeyword_2_0()); 
            // InternalMyDsl.g:7072:3: ( 'p->' )
            // InternalMyDsl.g:7073:4: 'p->'
            {
             before(grammarAccess.getJointRefAccess().getPrisPKeyword_2_0()); 
            match(input,85,FOLLOW_2); 
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
    // InternalMyDsl.g:7084:1: rule__JointRef__ContAssignment_3 : ( ( 'c->' ) ) ;
    public final void rule__JointRef__ContAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7088:1: ( ( ( 'c->' ) ) )
            // InternalMyDsl.g:7089:2: ( ( 'c->' ) )
            {
            // InternalMyDsl.g:7089:2: ( ( 'c->' ) )
            // InternalMyDsl.g:7090:3: ( 'c->' )
            {
             before(grammarAccess.getJointRefAccess().getContCKeyword_3_0()); 
            // InternalMyDsl.g:7091:3: ( 'c->' )
            // InternalMyDsl.g:7092:4: 'c->'
            {
             before(grammarAccess.getJointRefAccess().getContCKeyword_3_0()); 
            match(input,86,FOLLOW_2); 
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
    // InternalMyDsl.g:7103:1: rule__Link__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Link__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7107:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:7108:2: ( RULE_ID )
            {
            // InternalMyDsl.g:7108:2: ( RULE_ID )
            // InternalMyDsl.g:7109:3: RULE_ID
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
    // InternalMyDsl.g:7118:1: rule__Link__InertialAssignment_3_0_1_0 : ( ruleInertial ) ;
    public final void rule__Link__InertialAssignment_3_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7122:1: ( ( ruleInertial ) )
            // InternalMyDsl.g:7123:2: ( ruleInertial )
            {
            // InternalMyDsl.g:7123:2: ( ruleInertial )
            // InternalMyDsl.g:7124:3: ruleInertial
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
    // InternalMyDsl.g:7133:1: rule__Link__VisualAssignment_3_0_1_1 : ( ruleVisual ) ;
    public final void rule__Link__VisualAssignment_3_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7137:1: ( ( ruleVisual ) )
            // InternalMyDsl.g:7138:2: ( ruleVisual )
            {
            // InternalMyDsl.g:7138:2: ( ruleVisual )
            // InternalMyDsl.g:7139:3: ruleVisual
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
    // InternalMyDsl.g:7148:1: rule__Link__CollisionAssignment_3_0_1_2 : ( ruleCollision ) ;
    public final void rule__Link__CollisionAssignment_3_0_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7152:1: ( ( ruleCollision ) )
            // InternalMyDsl.g:7153:2: ( ruleCollision )
            {
            // InternalMyDsl.g:7153:2: ( ruleCollision )
            // InternalMyDsl.g:7154:3: ruleCollision
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


    // $ANTLR start "rule__Link__LinkAssignment_3_1_1"
    // InternalMyDsl.g:7163:1: rule__Link__LinkAssignment_3_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Link__LinkAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7167:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:7168:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:7168:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:7169:3: ( RULE_ID )
            {
             before(grammarAccess.getLinkAccess().getLinkLinkCrossReference_3_1_1_0()); 
            // InternalMyDsl.g:7170:3: ( RULE_ID )
            // InternalMyDsl.g:7171:4: RULE_ID
            {
             before(grammarAccess.getLinkAccess().getLinkLinkIDTerminalRuleCall_3_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getLinkLinkIDTerminalRuleCall_3_1_1_0_1()); 

            }

             after(grammarAccess.getLinkAccess().getLinkLinkCrossReference_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__LinkAssignment_3_1_1"


    // $ANTLR start "rule__Link__ReuseAssignment_3_1_2"
    // InternalMyDsl.g:7182:1: rule__Link__ReuseAssignment_3_1_2 : ( ruleReuse ) ;
    public final void rule__Link__ReuseAssignment_3_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7186:1: ( ( ruleReuse ) )
            // InternalMyDsl.g:7187:2: ( ruleReuse )
            {
            // InternalMyDsl.g:7187:2: ( ruleReuse )
            // InternalMyDsl.g:7188:3: ruleReuse
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


    // $ANTLR start "rule__Reuse__RefAssignment_1_0_1"
    // InternalMyDsl.g:7197:1: rule__Reuse__RefAssignment_1_0_1 : ( ruleDotExpression ) ;
    public final void rule__Reuse__RefAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7201:1: ( ( ruleDotExpression ) )
            // InternalMyDsl.g:7202:2: ( ruleDotExpression )
            {
            // InternalMyDsl.g:7202:2: ( ruleDotExpression )
            // InternalMyDsl.g:7203:3: ruleDotExpression
            {
             before(grammarAccess.getReuseAccess().getRefDotExpressionParserRuleCall_1_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDotExpression();

            state._fsp--;

             after(grammarAccess.getReuseAccess().getRefDotExpressionParserRuleCall_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reuse__RefAssignment_1_0_1"


    // $ANTLR start "rule__Reuse__AddAssignment_1_1_1"
    // InternalMyDsl.g:7212:1: rule__Reuse__AddAssignment_1_1_1 : ( ruleReUseAble ) ;
    public final void rule__Reuse__AddAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7216:1: ( ( ruleReUseAble ) )
            // InternalMyDsl.g:7217:2: ( ruleReUseAble )
            {
            // InternalMyDsl.g:7217:2: ( ruleReUseAble )
            // InternalMyDsl.g:7218:3: ruleReUseAble
            {
             before(grammarAccess.getReuseAccess().getAddReUseAbleParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleReUseAble();

            state._fsp--;

             after(grammarAccess.getReuseAccess().getAddReUseAbleParserRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reuse__AddAssignment_1_1_1"


    // $ANTLR start "rule__DotExpression__TailAssignment_1_2"
    // InternalMyDsl.g:7227:1: rule__DotExpression__TailAssignment_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__DotExpression__TailAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7231:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:7232:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:7232:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:7233:3: ( RULE_ID )
            {
             before(grammarAccess.getDotExpressionAccess().getTailReUseAbleCrossReference_1_2_0()); 
            // InternalMyDsl.g:7234:3: ( RULE_ID )
            // InternalMyDsl.g:7235:4: RULE_ID
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
    // InternalMyDsl.g:7246:1: rule__ReUsableRef__ReuseableAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ReUsableRef__ReuseableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7250:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:7251:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:7251:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:7252:3: ( RULE_ID )
            {
             before(grammarAccess.getReUsableRefAccess().getReuseableReUseAbleCrossReference_1_0()); 
            // InternalMyDsl.g:7253:3: ( RULE_ID )
            // InternalMyDsl.g:7254:4: RULE_ID
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
    // InternalMyDsl.g:7265:1: rule__Inertial__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Inertial__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7269:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:7270:2: ( RULE_ID )
            {
            // InternalMyDsl.g:7270:2: ( RULE_ID )
            // InternalMyDsl.g:7271:3: RULE_ID
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
    // InternalMyDsl.g:7280:1: rule__Inertial__InertiaAssignment_3 : ( ruleInertia ) ;
    public final void rule__Inertial__InertiaAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7284:1: ( ( ruleInertia ) )
            // InternalMyDsl.g:7285:2: ( ruleInertia )
            {
            // InternalMyDsl.g:7285:2: ( ruleInertia )
            // InternalMyDsl.g:7286:3: ruleInertia
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
    // InternalMyDsl.g:7295:1: rule__Inertial__MassAssignment_4 : ( ruleMass ) ;
    public final void rule__Inertial__MassAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7299:1: ( ( ruleMass ) )
            // InternalMyDsl.g:7300:2: ( ruleMass )
            {
            // InternalMyDsl.g:7300:2: ( ruleMass )
            // InternalMyDsl.g:7301:3: ruleMass
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
    // InternalMyDsl.g:7310:1: rule__Inertial__OriginAssignment_5 : ( ruleOrigin ) ;
    public final void rule__Inertial__OriginAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7314:1: ( ( ruleOrigin ) )
            // InternalMyDsl.g:7315:2: ( ruleOrigin )
            {
            // InternalMyDsl.g:7315:2: ( ruleOrigin )
            // InternalMyDsl.g:7316:3: ruleOrigin
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
    // InternalMyDsl.g:7325:1: rule__Inertia__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Inertia__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7329:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:7330:2: ( RULE_ID )
            {
            // InternalMyDsl.g:7330:2: ( RULE_ID )
            // InternalMyDsl.g:7331:3: RULE_ID
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
    // InternalMyDsl.g:7340:1: rule__Inertia__IxxAssignment_4 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__Inertia__IxxAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7344:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:7345:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:7345:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:7346:3: ruleURDFAttrSignedNumeric
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
    // InternalMyDsl.g:7355:1: rule__Inertia__IxyAssignment_6 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__Inertia__IxyAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7359:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:7360:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:7360:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:7361:3: ruleURDFAttrSignedNumeric
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
    // InternalMyDsl.g:7370:1: rule__Inertia__IxzAssignment_8 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__Inertia__IxzAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7374:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:7375:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:7375:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:7376:3: ruleURDFAttrSignedNumeric
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
    // InternalMyDsl.g:7385:1: rule__Inertia__IyyAssignment_10 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__Inertia__IyyAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7389:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:7390:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:7390:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:7391:3: ruleURDFAttrSignedNumeric
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
    // InternalMyDsl.g:7400:1: rule__Inertia__IyzAssignment_12 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__Inertia__IyzAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7404:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:7405:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:7405:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:7406:3: ruleURDFAttrSignedNumeric
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
    // InternalMyDsl.g:7415:1: rule__Inertia__IzzAssignment_14 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__Inertia__IzzAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7419:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:7420:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:7420:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:7421:3: ruleURDFAttrSignedNumeric
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
    // InternalMyDsl.g:7430:1: rule__Visual__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Visual__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7434:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:7435:2: ( RULE_ID )
            {
            // InternalMyDsl.g:7435:2: ( RULE_ID )
            // InternalMyDsl.g:7436:3: RULE_ID
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
    // InternalMyDsl.g:7445:1: rule__Visual__GeometryAssignment_4 : ( ruleGeometry ) ;
    public final void rule__Visual__GeometryAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7449:1: ( ( ruleGeometry ) )
            // InternalMyDsl.g:7450:2: ( ruleGeometry )
            {
            // InternalMyDsl.g:7450:2: ( ruleGeometry )
            // InternalMyDsl.g:7451:3: ruleGeometry
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
    // InternalMyDsl.g:7460:1: rule__Visual__OriginAssignment_5 : ( ruleOrigin ) ;
    public final void rule__Visual__OriginAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7464:1: ( ( ruleOrigin ) )
            // InternalMyDsl.g:7465:2: ( ruleOrigin )
            {
            // InternalMyDsl.g:7465:2: ( ruleOrigin )
            // InternalMyDsl.g:7466:3: ruleOrigin
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
    // InternalMyDsl.g:7475:1: rule__Visual__MaterialAssignment_6_1 : ( ruleMaterial ) ;
    public final void rule__Visual__MaterialAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7479:1: ( ( ruleMaterial ) )
            // InternalMyDsl.g:7480:2: ( ruleMaterial )
            {
            // InternalMyDsl.g:7480:2: ( ruleMaterial )
            // InternalMyDsl.g:7481:3: ruleMaterial
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
    // InternalMyDsl.g:7490:1: rule__Origin__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Origin__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7494:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:7495:2: ( RULE_ID )
            {
            // InternalMyDsl.g:7495:2: ( RULE_ID )
            // InternalMyDsl.g:7496:3: RULE_ID
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
    // InternalMyDsl.g:7505:1: rule__Origin__XAssignment_4 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__Origin__XAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7509:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:7510:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:7510:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:7511:3: ruleURDFAttrSignedNumeric
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
    // InternalMyDsl.g:7520:1: rule__Origin__YAssignment_6 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__Origin__YAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7524:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:7525:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:7525:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:7526:3: ruleURDFAttrSignedNumeric
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
    // InternalMyDsl.g:7535:1: rule__Origin__ZAssignment_8 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__Origin__ZAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7539:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:7540:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:7540:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:7541:3: ruleURDFAttrSignedNumeric
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
    // InternalMyDsl.g:7550:1: rule__Origin__RollAssignment_9_1 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__Origin__RollAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7554:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:7555:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:7555:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:7556:3: ruleURDFAttrSignedNumeric
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
    // InternalMyDsl.g:7565:1: rule__Origin__PitchAssignment_10_1 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__Origin__PitchAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7569:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:7570:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:7570:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:7571:3: ruleURDFAttrSignedNumeric
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
    // InternalMyDsl.g:7580:1: rule__Origin__YawAssignment_11_1 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__Origin__YawAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7584:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:7585:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:7585:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:7586:3: ruleURDFAttrSignedNumeric
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
    // InternalMyDsl.g:7595:1: rule__Mass__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Mass__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7599:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:7600:2: ( RULE_ID )
            {
            // InternalMyDsl.g:7600:2: ( RULE_ID )
            // InternalMyDsl.g:7601:3: RULE_ID
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
    // InternalMyDsl.g:7610:1: rule__Mass__MassKilogramAssignment_4 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__Mass__MassKilogramAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7614:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:7615:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:7615:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:7616:3: ruleURDFAttrSignedNumeric
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
    // InternalMyDsl.g:7625:1: rule__Collision__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Collision__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7629:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:7630:2: ( RULE_ID )
            {
            // InternalMyDsl.g:7630:2: ( RULE_ID )
            // InternalMyDsl.g:7631:3: RULE_ID
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
    // InternalMyDsl.g:7640:1: rule__Collision__GeometryAssignment_3 : ( ruleGeometry ) ;
    public final void rule__Collision__GeometryAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7644:1: ( ( ruleGeometry ) )
            // InternalMyDsl.g:7645:2: ( ruleGeometry )
            {
            // InternalMyDsl.g:7645:2: ( ruleGeometry )
            // InternalMyDsl.g:7646:3: ruleGeometry
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
    // InternalMyDsl.g:7655:1: rule__Collision__OriginAssignment_4 : ( ruleOrigin ) ;
    public final void rule__Collision__OriginAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7659:1: ( ( ruleOrigin ) )
            // InternalMyDsl.g:7660:2: ( ruleOrigin )
            {
            // InternalMyDsl.g:7660:2: ( ruleOrigin )
            // InternalMyDsl.g:7661:3: ruleOrigin
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
    // InternalMyDsl.g:7670:1: rule__Box__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Box__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7674:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:7675:2: ( RULE_ID )
            {
            // InternalMyDsl.g:7675:2: ( RULE_ID )
            // InternalMyDsl.g:7676:3: RULE_ID
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
    // InternalMyDsl.g:7685:1: rule__Box__HeightAssignment_3 : ( ruleURDFAttrNumeric ) ;
    public final void rule__Box__HeightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7689:1: ( ( ruleURDFAttrNumeric ) )
            // InternalMyDsl.g:7690:2: ( ruleURDFAttrNumeric )
            {
            // InternalMyDsl.g:7690:2: ( ruleURDFAttrNumeric )
            // InternalMyDsl.g:7691:3: ruleURDFAttrNumeric
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
    // InternalMyDsl.g:7700:1: rule__Box__LengthAssignment_5 : ( ruleURDFAttrNumeric ) ;
    public final void rule__Box__LengthAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7704:1: ( ( ruleURDFAttrNumeric ) )
            // InternalMyDsl.g:7705:2: ( ruleURDFAttrNumeric )
            {
            // InternalMyDsl.g:7705:2: ( ruleURDFAttrNumeric )
            // InternalMyDsl.g:7706:3: ruleURDFAttrNumeric
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
    // InternalMyDsl.g:7715:1: rule__Box__WidthAssignment_7 : ( ruleURDFAttrNumeric ) ;
    public final void rule__Box__WidthAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7719:1: ( ( ruleURDFAttrNumeric ) )
            // InternalMyDsl.g:7720:2: ( ruleURDFAttrNumeric )
            {
            // InternalMyDsl.g:7720:2: ( ruleURDFAttrNumeric )
            // InternalMyDsl.g:7721:3: ruleURDFAttrNumeric
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
    // InternalMyDsl.g:7730:1: rule__Cylinder__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Cylinder__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7734:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:7735:2: ( RULE_ID )
            {
            // InternalMyDsl.g:7735:2: ( RULE_ID )
            // InternalMyDsl.g:7736:3: RULE_ID
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
    // InternalMyDsl.g:7745:1: rule__Cylinder__RadiusAssignment_3 : ( ruleURDFAttrNumeric ) ;
    public final void rule__Cylinder__RadiusAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7749:1: ( ( ruleURDFAttrNumeric ) )
            // InternalMyDsl.g:7750:2: ( ruleURDFAttrNumeric )
            {
            // InternalMyDsl.g:7750:2: ( ruleURDFAttrNumeric )
            // InternalMyDsl.g:7751:3: ruleURDFAttrNumeric
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
    // InternalMyDsl.g:7760:1: rule__Cylinder__LengthAssignment_5 : ( ruleURDFAttrNumeric ) ;
    public final void rule__Cylinder__LengthAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7764:1: ( ( ruleURDFAttrNumeric ) )
            // InternalMyDsl.g:7765:2: ( ruleURDFAttrNumeric )
            {
            // InternalMyDsl.g:7765:2: ( ruleURDFAttrNumeric )
            // InternalMyDsl.g:7766:3: ruleURDFAttrNumeric
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
    // InternalMyDsl.g:7775:1: rule__Mesh__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Mesh__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7779:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:7780:2: ( RULE_ID )
            {
            // InternalMyDsl.g:7780:2: ( RULE_ID )
            // InternalMyDsl.g:7781:3: RULE_ID
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
    // InternalMyDsl.g:7790:1: rule__Mesh__PathToFileAssignment_3 : ( ruleURDFAttrSTRING ) ;
    public final void rule__Mesh__PathToFileAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7794:1: ( ( ruleURDFAttrSTRING ) )
            // InternalMyDsl.g:7795:2: ( ruleURDFAttrSTRING )
            {
            // InternalMyDsl.g:7795:2: ( ruleURDFAttrSTRING )
            // InternalMyDsl.g:7796:3: ruleURDFAttrSTRING
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
    // InternalMyDsl.g:7805:1: rule__Sphere__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Sphere__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7809:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:7810:2: ( RULE_ID )
            {
            // InternalMyDsl.g:7810:2: ( RULE_ID )
            // InternalMyDsl.g:7811:3: RULE_ID
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
    // InternalMyDsl.g:7820:1: rule__Sphere__RadiusAssignment_3 : ( ruleURDFAttrNumeric ) ;
    public final void rule__Sphere__RadiusAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7824:1: ( ( ruleURDFAttrNumeric ) )
            // InternalMyDsl.g:7825:2: ( ruleURDFAttrNumeric )
            {
            // InternalMyDsl.g:7825:2: ( ruleURDFAttrNumeric )
            // InternalMyDsl.g:7826:3: ruleURDFAttrNumeric
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
    // InternalMyDsl.g:7835:1: rule__Texture__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Texture__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7839:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:7840:2: ( RULE_ID )
            {
            // InternalMyDsl.g:7840:2: ( RULE_ID )
            // InternalMyDsl.g:7841:3: RULE_ID
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
    // InternalMyDsl.g:7850:1: rule__Texture__PathToFileAssignment_3 : ( ruleURDFAttrSTRING ) ;
    public final void rule__Texture__PathToFileAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7854:1: ( ( ruleURDFAttrSTRING ) )
            // InternalMyDsl.g:7855:2: ( ruleURDFAttrSTRING )
            {
            // InternalMyDsl.g:7855:2: ( ruleURDFAttrSTRING )
            // InternalMyDsl.g:7856:3: ruleURDFAttrSTRING
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
    // InternalMyDsl.g:7865:1: rule__Color__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Color__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7869:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:7870:2: ( RULE_ID )
            {
            // InternalMyDsl.g:7870:2: ( RULE_ID )
            // InternalMyDsl.g:7871:3: RULE_ID
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
    // InternalMyDsl.g:7880:1: rule__Color__RedAssignment_3 : ( ruleURDFAttrFloat ) ;
    public final void rule__Color__RedAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7884:1: ( ( ruleURDFAttrFloat ) )
            // InternalMyDsl.g:7885:2: ( ruleURDFAttrFloat )
            {
            // InternalMyDsl.g:7885:2: ( ruleURDFAttrFloat )
            // InternalMyDsl.g:7886:3: ruleURDFAttrFloat
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
    // InternalMyDsl.g:7895:1: rule__Color__GreenAssignment_5 : ( ruleURDFAttrFloat ) ;
    public final void rule__Color__GreenAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7899:1: ( ( ruleURDFAttrFloat ) )
            // InternalMyDsl.g:7900:2: ( ruleURDFAttrFloat )
            {
            // InternalMyDsl.g:7900:2: ( ruleURDFAttrFloat )
            // InternalMyDsl.g:7901:3: ruleURDFAttrFloat
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
    // InternalMyDsl.g:7910:1: rule__Color__BlueAssignment_7 : ( ruleURDFAttrFloat ) ;
    public final void rule__Color__BlueAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7914:1: ( ( ruleURDFAttrFloat ) )
            // InternalMyDsl.g:7915:2: ( ruleURDFAttrFloat )
            {
            // InternalMyDsl.g:7915:2: ( ruleURDFAttrFloat )
            // InternalMyDsl.g:7916:3: ruleURDFAttrFloat
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
    // InternalMyDsl.g:7925:1: rule__Color__AlphaAssignment_9 : ( ruleURDFAttrFloat ) ;
    public final void rule__Color__AlphaAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7929:1: ( ( ruleURDFAttrFloat ) )
            // InternalMyDsl.g:7930:2: ( ruleURDFAttrFloat )
            {
            // InternalMyDsl.g:7930:2: ( ruleURDFAttrFloat )
            // InternalMyDsl.g:7931:3: ruleURDFAttrFloat
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
    // InternalMyDsl.g:7940:1: rule__Joint__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Joint__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7944:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:7945:2: ( RULE_ID )
            {
            // InternalMyDsl.g:7945:2: ( RULE_ID )
            // InternalMyDsl.g:7946:3: RULE_ID
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
    // InternalMyDsl.g:7955:1: rule__Joint__ChildOfAssignment_2_0_0_2 : ( ( RULE_ID ) ) ;
    public final void rule__Joint__ChildOfAssignment_2_0_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7959:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:7960:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:7960:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:7961:3: ( RULE_ID )
            {
             before(grammarAccess.getJointAccess().getChildOfLinkCrossReference_2_0_0_2_0()); 
            // InternalMyDsl.g:7962:3: ( RULE_ID )
            // InternalMyDsl.g:7963:4: RULE_ID
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
    // InternalMyDsl.g:7974:1: rule__Joint__ParentOfAssignment_2_0_0_4 : ( ( RULE_ID ) ) ;
    public final void rule__Joint__ParentOfAssignment_2_0_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7978:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:7979:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:7979:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:7980:3: ( RULE_ID )
            {
             before(grammarAccess.getJointAccess().getParentOfLinkCrossReference_2_0_0_4_0()); 
            // InternalMyDsl.g:7981:3: ( RULE_ID )
            // InternalMyDsl.g:7982:4: RULE_ID
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
    // InternalMyDsl.g:7993:1: rule__Joint__TypeAssignment_2_0_0_6 : ( ruleJointType ) ;
    public final void rule__Joint__TypeAssignment_2_0_0_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7997:1: ( ( ruleJointType ) )
            // InternalMyDsl.g:7998:2: ( ruleJointType )
            {
            // InternalMyDsl.g:7998:2: ( ruleJointType )
            // InternalMyDsl.g:7999:3: ruleJointType
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
    // InternalMyDsl.g:8008:1: rule__Joint__OriginAssignment_2_0_1_0 : ( ruleOrigin ) ;
    public final void rule__Joint__OriginAssignment_2_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8012:1: ( ( ruleOrigin ) )
            // InternalMyDsl.g:8013:2: ( ruleOrigin )
            {
            // InternalMyDsl.g:8013:2: ( ruleOrigin )
            // InternalMyDsl.g:8014:3: ruleOrigin
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
    // InternalMyDsl.g:8023:1: rule__Joint__AxisAssignment_2_0_1_1 : ( ruleAxis ) ;
    public final void rule__Joint__AxisAssignment_2_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8027:1: ( ( ruleAxis ) )
            // InternalMyDsl.g:8028:2: ( ruleAxis )
            {
            // InternalMyDsl.g:8028:2: ( ruleAxis )
            // InternalMyDsl.g:8029:3: ruleAxis
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
    // InternalMyDsl.g:8038:1: rule__Joint__LimitAssignment_2_0_1_2 : ( ruleLimit ) ;
    public final void rule__Joint__LimitAssignment_2_0_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8042:1: ( ( ruleLimit ) )
            // InternalMyDsl.g:8043:2: ( ruleLimit )
            {
            // InternalMyDsl.g:8043:2: ( ruleLimit )
            // InternalMyDsl.g:8044:3: ruleLimit
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
    // InternalMyDsl.g:8053:1: rule__Joint__CalibrationAssignment_2_0_1_3 : ( ruleCalibration ) ;
    public final void rule__Joint__CalibrationAssignment_2_0_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8057:1: ( ( ruleCalibration ) )
            // InternalMyDsl.g:8058:2: ( ruleCalibration )
            {
            // InternalMyDsl.g:8058:2: ( ruleCalibration )
            // InternalMyDsl.g:8059:3: ruleCalibration
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
    // InternalMyDsl.g:8068:1: rule__Joint__DynamicsAssignment_2_0_1_4 : ( ruleDynamics ) ;
    public final void rule__Joint__DynamicsAssignment_2_0_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8072:1: ( ( ruleDynamics ) )
            // InternalMyDsl.g:8073:2: ( ruleDynamics )
            {
            // InternalMyDsl.g:8073:2: ( ruleDynamics )
            // InternalMyDsl.g:8074:3: ruleDynamics
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
    // InternalMyDsl.g:8083:1: rule__Joint__SafetycontrollerAssignment_2_0_1_5 : ( ruleSafetyController ) ;
    public final void rule__Joint__SafetycontrollerAssignment_2_0_1_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8087:1: ( ( ruleSafetyController ) )
            // InternalMyDsl.g:8088:2: ( ruleSafetyController )
            {
            // InternalMyDsl.g:8088:2: ( ruleSafetyController )
            // InternalMyDsl.g:8089:3: ruleSafetyController
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
    // InternalMyDsl.g:8098:1: rule__Joint__IsReuseOfAssignment_2_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Joint__IsReuseOfAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8102:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:8103:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:8103:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:8104:3: ( RULE_ID )
            {
             before(grammarAccess.getJointAccess().getIsReuseOfJointCrossReference_2_1_1_0()); 
            // InternalMyDsl.g:8105:3: ( RULE_ID )
            // InternalMyDsl.g:8106:4: RULE_ID
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
    // InternalMyDsl.g:8117:1: rule__Joint__ChildOfAssignment_2_1_3 : ( ( RULE_ID ) ) ;
    public final void rule__Joint__ChildOfAssignment_2_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8121:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:8122:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:8122:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:8123:3: ( RULE_ID )
            {
             before(grammarAccess.getJointAccess().getChildOfLinkCrossReference_2_1_3_0()); 
            // InternalMyDsl.g:8124:3: ( RULE_ID )
            // InternalMyDsl.g:8125:4: RULE_ID
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
    // InternalMyDsl.g:8136:1: rule__Joint__ParentOfAssignment_2_1_5 : ( ( RULE_ID ) ) ;
    public final void rule__Joint__ParentOfAssignment_2_1_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8140:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:8141:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:8141:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:8142:3: ( RULE_ID )
            {
             before(grammarAccess.getJointAccess().getParentOfLinkCrossReference_2_1_5_0()); 
            // InternalMyDsl.g:8143:3: ( RULE_ID )
            // InternalMyDsl.g:8144:4: RULE_ID
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
    // InternalMyDsl.g:8155:1: rule__Joint__ReuseAssignment_2_1_6 : ( ruleReuse ) ;
    public final void rule__Joint__ReuseAssignment_2_1_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8159:1: ( ( ruleReuse ) )
            // InternalMyDsl.g:8160:2: ( ruleReuse )
            {
            // InternalMyDsl.g:8160:2: ( ruleReuse )
            // InternalMyDsl.g:8161:3: ruleReuse
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
    // InternalMyDsl.g:8170:1: rule__Axis__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Axis__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8174:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:8175:2: ( RULE_ID )
            {
            // InternalMyDsl.g:8175:2: ( RULE_ID )
            // InternalMyDsl.g:8176:3: RULE_ID
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
    // InternalMyDsl.g:8185:1: rule__Axis__XAssignment_3 : ( ruleURDFAttrINT ) ;
    public final void rule__Axis__XAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8189:1: ( ( ruleURDFAttrINT ) )
            // InternalMyDsl.g:8190:2: ( ruleURDFAttrINT )
            {
            // InternalMyDsl.g:8190:2: ( ruleURDFAttrINT )
            // InternalMyDsl.g:8191:3: ruleURDFAttrINT
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
    // InternalMyDsl.g:8200:1: rule__Axis__YAssignment_5 : ( ruleURDFAttrINT ) ;
    public final void rule__Axis__YAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8204:1: ( ( ruleURDFAttrINT ) )
            // InternalMyDsl.g:8205:2: ( ruleURDFAttrINT )
            {
            // InternalMyDsl.g:8205:2: ( ruleURDFAttrINT )
            // InternalMyDsl.g:8206:3: ruleURDFAttrINT
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
    // InternalMyDsl.g:8215:1: rule__Axis__ZAssignment_7 : ( ruleURDFAttrINT ) ;
    public final void rule__Axis__ZAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8219:1: ( ( ruleURDFAttrINT ) )
            // InternalMyDsl.g:8220:2: ( ruleURDFAttrINT )
            {
            // InternalMyDsl.g:8220:2: ( ruleURDFAttrINT )
            // InternalMyDsl.g:8221:3: ruleURDFAttrINT
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
    // InternalMyDsl.g:8230:1: rule__Limit__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Limit__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8234:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:8235:2: ( RULE_ID )
            {
            // InternalMyDsl.g:8235:2: ( RULE_ID )
            // InternalMyDsl.g:8236:3: RULE_ID
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
    // InternalMyDsl.g:8245:1: rule__Limit__EffortAssignment_3 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__Limit__EffortAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8249:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:8250:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:8250:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:8251:3: ruleURDFAttrSignedNumeric
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
    // InternalMyDsl.g:8260:1: rule__Limit__VelocityAssignment_5 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__Limit__VelocityAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8264:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:8265:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:8265:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:8266:3: ruleURDFAttrSignedNumeric
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


    // $ANTLR start "rule__Limit__LowerAssignment_7"
    // InternalMyDsl.g:8275:1: rule__Limit__LowerAssignment_7 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__Limit__LowerAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8279:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:8280:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:8280:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:8281:3: ruleURDFAttrSignedNumeric
            {
             before(grammarAccess.getLimitAccess().getLowerURDFAttrSignedNumericParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleURDFAttrSignedNumeric();

            state._fsp--;

             after(grammarAccess.getLimitAccess().getLowerURDFAttrSignedNumericParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__LowerAssignment_7"


    // $ANTLR start "rule__Limit__UpperAssignment_9"
    // InternalMyDsl.g:8290:1: rule__Limit__UpperAssignment_9 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__Limit__UpperAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8294:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:8295:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:8295:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:8296:3: ruleURDFAttrSignedNumeric
            {
             before(grammarAccess.getLimitAccess().getUpperURDFAttrSignedNumericParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleURDFAttrSignedNumeric();

            state._fsp--;

             after(grammarAccess.getLimitAccess().getUpperURDFAttrSignedNumericParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__UpperAssignment_9"


    // $ANTLR start "rule__Calibration__NameAssignment_2"
    // InternalMyDsl.g:8305:1: rule__Calibration__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Calibration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8309:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:8310:2: ( RULE_ID )
            {
            // InternalMyDsl.g:8310:2: ( RULE_ID )
            // InternalMyDsl.g:8311:3: RULE_ID
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


    // $ANTLR start "rule__Calibration__RisingAssignment_3_1"
    // InternalMyDsl.g:8320:1: rule__Calibration__RisingAssignment_3_1 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__Calibration__RisingAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8324:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:8325:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:8325:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:8326:3: ruleURDFAttrSignedNumeric
            {
             before(grammarAccess.getCalibrationAccess().getRisingURDFAttrSignedNumericParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleURDFAttrSignedNumeric();

            state._fsp--;

             after(grammarAccess.getCalibrationAccess().getRisingURDFAttrSignedNumericParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calibration__RisingAssignment_3_1"


    // $ANTLR start "rule__Calibration__FallingAssignment_4_1"
    // InternalMyDsl.g:8335:1: rule__Calibration__FallingAssignment_4_1 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__Calibration__FallingAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8339:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:8340:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:8340:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:8341:3: ruleURDFAttrSignedNumeric
            {
             before(grammarAccess.getCalibrationAccess().getFallingURDFAttrSignedNumericParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleURDFAttrSignedNumeric();

            state._fsp--;

             after(grammarAccess.getCalibrationAccess().getFallingURDFAttrSignedNumericParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calibration__FallingAssignment_4_1"


    // $ANTLR start "rule__Dynamics__NameAssignment_2"
    // InternalMyDsl.g:8350:1: rule__Dynamics__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Dynamics__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8354:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:8355:2: ( RULE_ID )
            {
            // InternalMyDsl.g:8355:2: ( RULE_ID )
            // InternalMyDsl.g:8356:3: RULE_ID
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


    // $ANTLR start "rule__Dynamics__FrictionAssignment_3_1"
    // InternalMyDsl.g:8365:1: rule__Dynamics__FrictionAssignment_3_1 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__Dynamics__FrictionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8369:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:8370:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:8370:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:8371:3: ruleURDFAttrSignedNumeric
            {
             before(grammarAccess.getDynamicsAccess().getFrictionURDFAttrSignedNumericParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleURDFAttrSignedNumeric();

            state._fsp--;

             after(grammarAccess.getDynamicsAccess().getFrictionURDFAttrSignedNumericParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamics__FrictionAssignment_3_1"


    // $ANTLR start "rule__Dynamics__DampingAssignment_4_1"
    // InternalMyDsl.g:8380:1: rule__Dynamics__DampingAssignment_4_1 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__Dynamics__DampingAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8384:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:8385:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:8385:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:8386:3: ruleURDFAttrSignedNumeric
            {
             before(grammarAccess.getDynamicsAccess().getDampingURDFAttrSignedNumericParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleURDFAttrSignedNumeric();

            state._fsp--;

             after(grammarAccess.getDynamicsAccess().getDampingURDFAttrSignedNumericParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamics__DampingAssignment_4_1"


    // $ANTLR start "rule__SafetyController__NameAssignment_1"
    // InternalMyDsl.g:8395:1: rule__SafetyController__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SafetyController__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8399:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:8400:2: ( RULE_ID )
            {
            // InternalMyDsl.g:8400:2: ( RULE_ID )
            // InternalMyDsl.g:8401:3: RULE_ID
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
    // InternalMyDsl.g:8410:1: rule__SafetyController__K_velocityAssignment_3 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__SafetyController__K_velocityAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8414:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:8415:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:8415:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:8416:3: ruleURDFAttrSignedNumeric
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


    // $ANTLR start "rule__SafetyController__K_positionAssignment_4_1"
    // InternalMyDsl.g:8425:1: rule__SafetyController__K_positionAssignment_4_1 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__SafetyController__K_positionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8429:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:8430:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:8430:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:8431:3: ruleURDFAttrSignedNumeric
            {
             before(grammarAccess.getSafetyControllerAccess().getK_positionURDFAttrSignedNumericParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleURDFAttrSignedNumeric();

            state._fsp--;

             after(grammarAccess.getSafetyControllerAccess().getK_positionURDFAttrSignedNumericParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__K_positionAssignment_4_1"


    // $ANTLR start "rule__SafetyController__SoftLowerLimitAssignment_5_1"
    // InternalMyDsl.g:8440:1: rule__SafetyController__SoftLowerLimitAssignment_5_1 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__SafetyController__SoftLowerLimitAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8444:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:8445:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:8445:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:8446:3: ruleURDFAttrSignedNumeric
            {
             before(grammarAccess.getSafetyControllerAccess().getSoftLowerLimitURDFAttrSignedNumericParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleURDFAttrSignedNumeric();

            state._fsp--;

             after(grammarAccess.getSafetyControllerAccess().getSoftLowerLimitURDFAttrSignedNumericParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__SoftLowerLimitAssignment_5_1"


    // $ANTLR start "rule__SafetyController__SoftUpperLimitAssignment_6_1"
    // InternalMyDsl.g:8455:1: rule__SafetyController__SoftUpperLimitAssignment_6_1 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__SafetyController__SoftUpperLimitAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8459:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:8460:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:8460:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:8461:3: ruleURDFAttrSignedNumeric
            {
             before(grammarAccess.getSafetyControllerAccess().getSoftUpperLimitURDFAttrSignedNumericParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleURDFAttrSignedNumeric();

            state._fsp--;

             after(grammarAccess.getSafetyControllerAccess().getSoftUpperLimitURDFAttrSignedNumericParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__SoftUpperLimitAssignment_6_1"


    // $ANTLR start "rule__URDFAttrSignedNumeric__NameAssignment_1"
    // InternalMyDsl.g:8470:1: rule__URDFAttrSignedNumeric__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__URDFAttrSignedNumeric__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8474:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:8475:2: ( RULE_ID )
            {
            // InternalMyDsl.g:8475:2: ( RULE_ID )
            // InternalMyDsl.g:8476:3: RULE_ID
            {
             before(grammarAccess.getURDFAttrSignedNumericAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getURDFAttrSignedNumericAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URDFAttrSignedNumeric__NameAssignment_1"


    // $ANTLR start "rule__URDFAttrSignedNumeric__ValueAssignment_2"
    // InternalMyDsl.g:8485:1: rule__URDFAttrSignedNumeric__ValueAssignment_2 : ( ruleSIGNED_NUMERIC ) ;
    public final void rule__URDFAttrSignedNumeric__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8489:1: ( ( ruleSIGNED_NUMERIC ) )
            // InternalMyDsl.g:8490:2: ( ruleSIGNED_NUMERIC )
            {
            // InternalMyDsl.g:8490:2: ( ruleSIGNED_NUMERIC )
            // InternalMyDsl.g:8491:3: ruleSIGNED_NUMERIC
            {
             before(grammarAccess.getURDFAttrSignedNumericAccess().getValueSIGNED_NUMERICParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSIGNED_NUMERIC();

            state._fsp--;

             after(grammarAccess.getURDFAttrSignedNumericAccess().getValueSIGNED_NUMERICParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URDFAttrSignedNumeric__ValueAssignment_2"


    // $ANTLR start "rule__URDFAttrFloat__ValueAssignment"
    // InternalMyDsl.g:8500:1: rule__URDFAttrFloat__ValueAssignment : ( ruleFLOAT ) ;
    public final void rule__URDFAttrFloat__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8504:1: ( ( ruleFLOAT ) )
            // InternalMyDsl.g:8505:2: ( ruleFLOAT )
            {
            // InternalMyDsl.g:8505:2: ( ruleFLOAT )
            // InternalMyDsl.g:8506:3: ruleFLOAT
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
    // InternalMyDsl.g:8515:1: rule__URDFAttrINT__ValueAssignment : ( RULE_INT ) ;
    public final void rule__URDFAttrINT__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8519:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:8520:2: ( RULE_INT )
            {
            // InternalMyDsl.g:8520:2: ( RULE_INT )
            // InternalMyDsl.g:8521:3: RULE_INT
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
    // InternalMyDsl.g:8530:1: rule__URDFAttrNumeric__ValueAssignment : ( ruleNUMERIC ) ;
    public final void rule__URDFAttrNumeric__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8534:1: ( ( ruleNUMERIC ) )
            // InternalMyDsl.g:8535:2: ( ruleNUMERIC )
            {
            // InternalMyDsl.g:8535:2: ( ruleNUMERIC )
            // InternalMyDsl.g:8536:3: ruleNUMERIC
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
    // InternalMyDsl.g:8545:1: rule__URDFAttrSTRING__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__URDFAttrSTRING__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8549:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:8550:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:8550:2: ( RULE_STRING )
            // InternalMyDsl.g:8551:3: RULE_STRING
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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x20000000000C0000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x20000000000C0002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000000L,0x0000000000780000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000200202000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000200202000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000200202080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000001030L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000400000020L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0054401800000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0054400000000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0180000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000002000000020L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000070000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000100000000020L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0054401000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000800000000020L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0008000000000020L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0020000000000020L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0200000000000020L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000001000000000L,0x0000000000002486L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000001000000002L,0x0000000000002486L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000020L,0x0000000000000008L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000001030L,0x0000000000000040L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000020L,0x0000000000000300L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000020L,0x0000000000001800L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000020L,0x0000000000004000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000000L,0x0000000000038000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000001810L});

}