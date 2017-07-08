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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'+'", "'-'", "'fixed'", "'revolute'", "'prismatic'", "'continuous'", "'Robot'", "'Topology'", "'Link'", "'def'", "'reuse'", "'add'", "'edit2'", "'='", "'.'", "'Inertial'", "'Inertia'", "'ixx'", "'ixy'", "'ixz'", "'iyy'", "'iyz'", "'izz'", "'Visual'", "'Geometry'", "'Material'", "'Origin'", "'x'", "'y'", "'z'", "'roll'", "'pitch'", "'yaw'", "'Mass'", "'massKilogram'", "'Collision'", "'Box'", "'height'", "'length'", "'width'", "'Cylinder'", "'radius'", "'Mesh'", "'pathToFile'", "'Sphere'", "'Texture'", "'Color'", "'red'", "'green'", "'blue'", "'alpha'", "'Joint'", "'ChildOf'", "'ParentOf'", "'Type'", "'Axis'", "'Limit'", "'effort'", "'velocity'", "'lower'", "'upper'", "'Calibration'", "'rising'", "'falling'", "'Dynamics'", "'friction'", "'damping'", "'SafetyController'", "'k_velocity'", "'k_position'", "'softLowerLimit'", "'softUpperLimit'", "'e'", "'->'", "'r->'", "'p->'", "'c->'"
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
    // InternalMyDsl.g:187:1: ruleReuse : ( ( rule__Reuse__Alternatives ) ) ;
    public final void ruleReuse() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__Reuse__Alternatives ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__Reuse__Alternatives ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__Reuse__Alternatives ) )
            // InternalMyDsl.g:193:3: ( rule__Reuse__Alternatives )
            {
             before(grammarAccess.getReuseAccess().getAlternatives()); 
            // InternalMyDsl.g:194:3: ( rule__Reuse__Alternatives )
            // InternalMyDsl.g:194:4: rule__Reuse__Alternatives
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
    // InternalMyDsl.g:203:1: entryRuleAssignNewValue : ruleAssignNewValue EOF ;
    public final void entryRuleAssignNewValue() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleAssignNewValue EOF )
            // InternalMyDsl.g:205:1: ruleAssignNewValue EOF
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
    // InternalMyDsl.g:212:1: ruleAssignNewValue : ( ( rule__AssignNewValue__Group__0 ) ) ;
    public final void ruleAssignNewValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__AssignNewValue__Group__0 ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__AssignNewValue__Group__0 ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__AssignNewValue__Group__0 ) )
            // InternalMyDsl.g:218:3: ( rule__AssignNewValue__Group__0 )
            {
             before(grammarAccess.getAssignNewValueAccess().getGroup()); 
            // InternalMyDsl.g:219:3: ( rule__AssignNewValue__Group__0 )
            // InternalMyDsl.g:219:4: rule__AssignNewValue__Group__0
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
    // InternalMyDsl.g:228:1: entryRuleDotExpression : ruleDotExpression EOF ;
    public final void entryRuleDotExpression() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleDotExpression EOF )
            // InternalMyDsl.g:230:1: ruleDotExpression EOF
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
    // InternalMyDsl.g:237:1: ruleDotExpression : ( ( rule__DotExpression__Group__0 ) ) ;
    public final void ruleDotExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__DotExpression__Group__0 ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__DotExpression__Group__0 ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__DotExpression__Group__0 ) )
            // InternalMyDsl.g:243:3: ( rule__DotExpression__Group__0 )
            {
             before(grammarAccess.getDotExpressionAccess().getGroup()); 
            // InternalMyDsl.g:244:3: ( rule__DotExpression__Group__0 )
            // InternalMyDsl.g:244:4: rule__DotExpression__Group__0
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
    // InternalMyDsl.g:253:1: entryRuleReUsableRef : ruleReUsableRef EOF ;
    public final void entryRuleReUsableRef() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleReUsableRef EOF )
            // InternalMyDsl.g:255:1: ruleReUsableRef EOF
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
    // InternalMyDsl.g:262:1: ruleReUsableRef : ( ( rule__ReUsableRef__Group__0 ) ) ;
    public final void ruleReUsableRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__ReUsableRef__Group__0 ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__ReUsableRef__Group__0 ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__ReUsableRef__Group__0 ) )
            // InternalMyDsl.g:268:3: ( rule__ReUsableRef__Group__0 )
            {
             before(grammarAccess.getReUsableRefAccess().getGroup()); 
            // InternalMyDsl.g:269:3: ( rule__ReUsableRef__Group__0 )
            // InternalMyDsl.g:269:4: rule__ReUsableRef__Group__0
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
    // InternalMyDsl.g:278:1: entryRuleInertial : ruleInertial EOF ;
    public final void entryRuleInertial() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( ruleInertial EOF )
            // InternalMyDsl.g:280:1: ruleInertial EOF
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
    // InternalMyDsl.g:287:1: ruleInertial : ( ( rule__Inertial__Group__0 ) ) ;
    public final void ruleInertial() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__Inertial__Group__0 ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__Inertial__Group__0 ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__Inertial__Group__0 ) )
            // InternalMyDsl.g:293:3: ( rule__Inertial__Group__0 )
            {
             before(grammarAccess.getInertialAccess().getGroup()); 
            // InternalMyDsl.g:294:3: ( rule__Inertial__Group__0 )
            // InternalMyDsl.g:294:4: rule__Inertial__Group__0
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
    // InternalMyDsl.g:303:1: entryRuleInertia : ruleInertia EOF ;
    public final void entryRuleInertia() throws RecognitionException {
        try {
            // InternalMyDsl.g:304:1: ( ruleInertia EOF )
            // InternalMyDsl.g:305:1: ruleInertia EOF
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
    // InternalMyDsl.g:312:1: ruleInertia : ( ( rule__Inertia__Group__0 ) ) ;
    public final void ruleInertia() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:2: ( ( ( rule__Inertia__Group__0 ) ) )
            // InternalMyDsl.g:317:2: ( ( rule__Inertia__Group__0 ) )
            {
            // InternalMyDsl.g:317:2: ( ( rule__Inertia__Group__0 ) )
            // InternalMyDsl.g:318:3: ( rule__Inertia__Group__0 )
            {
             before(grammarAccess.getInertiaAccess().getGroup()); 
            // InternalMyDsl.g:319:3: ( rule__Inertia__Group__0 )
            // InternalMyDsl.g:319:4: rule__Inertia__Group__0
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
    // InternalMyDsl.g:328:1: entryRuleVisual : ruleVisual EOF ;
    public final void entryRuleVisual() throws RecognitionException {
        try {
            // InternalMyDsl.g:329:1: ( ruleVisual EOF )
            // InternalMyDsl.g:330:1: ruleVisual EOF
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
    // InternalMyDsl.g:337:1: ruleVisual : ( ( rule__Visual__Group__0 ) ) ;
    public final void ruleVisual() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:341:2: ( ( ( rule__Visual__Group__0 ) ) )
            // InternalMyDsl.g:342:2: ( ( rule__Visual__Group__0 ) )
            {
            // InternalMyDsl.g:342:2: ( ( rule__Visual__Group__0 ) )
            // InternalMyDsl.g:343:3: ( rule__Visual__Group__0 )
            {
             before(grammarAccess.getVisualAccess().getGroup()); 
            // InternalMyDsl.g:344:3: ( rule__Visual__Group__0 )
            // InternalMyDsl.g:344:4: rule__Visual__Group__0
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
    // InternalMyDsl.g:353:1: entryRuleOrigin : ruleOrigin EOF ;
    public final void entryRuleOrigin() throws RecognitionException {
        try {
            // InternalMyDsl.g:354:1: ( ruleOrigin EOF )
            // InternalMyDsl.g:355:1: ruleOrigin EOF
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
    // InternalMyDsl.g:362:1: ruleOrigin : ( ( rule__Origin__Group__0 ) ) ;
    public final void ruleOrigin() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:366:2: ( ( ( rule__Origin__Group__0 ) ) )
            // InternalMyDsl.g:367:2: ( ( rule__Origin__Group__0 ) )
            {
            // InternalMyDsl.g:367:2: ( ( rule__Origin__Group__0 ) )
            // InternalMyDsl.g:368:3: ( rule__Origin__Group__0 )
            {
             before(grammarAccess.getOriginAccess().getGroup()); 
            // InternalMyDsl.g:369:3: ( rule__Origin__Group__0 )
            // InternalMyDsl.g:369:4: rule__Origin__Group__0
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
    // InternalMyDsl.g:378:1: entryRuleMass : ruleMass EOF ;
    public final void entryRuleMass() throws RecognitionException {
        try {
            // InternalMyDsl.g:379:1: ( ruleMass EOF )
            // InternalMyDsl.g:380:1: ruleMass EOF
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
    // InternalMyDsl.g:387:1: ruleMass : ( ( rule__Mass__Group__0 ) ) ;
    public final void ruleMass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:391:2: ( ( ( rule__Mass__Group__0 ) ) )
            // InternalMyDsl.g:392:2: ( ( rule__Mass__Group__0 ) )
            {
            // InternalMyDsl.g:392:2: ( ( rule__Mass__Group__0 ) )
            // InternalMyDsl.g:393:3: ( rule__Mass__Group__0 )
            {
             before(grammarAccess.getMassAccess().getGroup()); 
            // InternalMyDsl.g:394:3: ( rule__Mass__Group__0 )
            // InternalMyDsl.g:394:4: rule__Mass__Group__0
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
    // InternalMyDsl.g:403:1: entryRuleCollision : ruleCollision EOF ;
    public final void entryRuleCollision() throws RecognitionException {
        try {
            // InternalMyDsl.g:404:1: ( ruleCollision EOF )
            // InternalMyDsl.g:405:1: ruleCollision EOF
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
    // InternalMyDsl.g:412:1: ruleCollision : ( ( rule__Collision__Group__0 ) ) ;
    public final void ruleCollision() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:416:2: ( ( ( rule__Collision__Group__0 ) ) )
            // InternalMyDsl.g:417:2: ( ( rule__Collision__Group__0 ) )
            {
            // InternalMyDsl.g:417:2: ( ( rule__Collision__Group__0 ) )
            // InternalMyDsl.g:418:3: ( rule__Collision__Group__0 )
            {
             before(grammarAccess.getCollisionAccess().getGroup()); 
            // InternalMyDsl.g:419:3: ( rule__Collision__Group__0 )
            // InternalMyDsl.g:419:4: rule__Collision__Group__0
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
    // InternalMyDsl.g:428:1: entryRuleGeometry : ruleGeometry EOF ;
    public final void entryRuleGeometry() throws RecognitionException {
        try {
            // InternalMyDsl.g:429:1: ( ruleGeometry EOF )
            // InternalMyDsl.g:430:1: ruleGeometry EOF
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
    // InternalMyDsl.g:437:1: ruleGeometry : ( ( rule__Geometry__Alternatives ) ) ;
    public final void ruleGeometry() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:441:2: ( ( ( rule__Geometry__Alternatives ) ) )
            // InternalMyDsl.g:442:2: ( ( rule__Geometry__Alternatives ) )
            {
            // InternalMyDsl.g:442:2: ( ( rule__Geometry__Alternatives ) )
            // InternalMyDsl.g:443:3: ( rule__Geometry__Alternatives )
            {
             before(grammarAccess.getGeometryAccess().getAlternatives()); 
            // InternalMyDsl.g:444:3: ( rule__Geometry__Alternatives )
            // InternalMyDsl.g:444:4: rule__Geometry__Alternatives
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
    // InternalMyDsl.g:453:1: entryRuleBox : ruleBox EOF ;
    public final void entryRuleBox() throws RecognitionException {
        try {
            // InternalMyDsl.g:454:1: ( ruleBox EOF )
            // InternalMyDsl.g:455:1: ruleBox EOF
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
    // InternalMyDsl.g:462:1: ruleBox : ( ( rule__Box__Group__0 ) ) ;
    public final void ruleBox() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:466:2: ( ( ( rule__Box__Group__0 ) ) )
            // InternalMyDsl.g:467:2: ( ( rule__Box__Group__0 ) )
            {
            // InternalMyDsl.g:467:2: ( ( rule__Box__Group__0 ) )
            // InternalMyDsl.g:468:3: ( rule__Box__Group__0 )
            {
             before(grammarAccess.getBoxAccess().getGroup()); 
            // InternalMyDsl.g:469:3: ( rule__Box__Group__0 )
            // InternalMyDsl.g:469:4: rule__Box__Group__0
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
    // InternalMyDsl.g:478:1: entryRuleCylinder : ruleCylinder EOF ;
    public final void entryRuleCylinder() throws RecognitionException {
        try {
            // InternalMyDsl.g:479:1: ( ruleCylinder EOF )
            // InternalMyDsl.g:480:1: ruleCylinder EOF
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
    // InternalMyDsl.g:487:1: ruleCylinder : ( ( rule__Cylinder__Group__0 ) ) ;
    public final void ruleCylinder() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:491:2: ( ( ( rule__Cylinder__Group__0 ) ) )
            // InternalMyDsl.g:492:2: ( ( rule__Cylinder__Group__0 ) )
            {
            // InternalMyDsl.g:492:2: ( ( rule__Cylinder__Group__0 ) )
            // InternalMyDsl.g:493:3: ( rule__Cylinder__Group__0 )
            {
             before(grammarAccess.getCylinderAccess().getGroup()); 
            // InternalMyDsl.g:494:3: ( rule__Cylinder__Group__0 )
            // InternalMyDsl.g:494:4: rule__Cylinder__Group__0
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
    // InternalMyDsl.g:503:1: entryRuleMesh : ruleMesh EOF ;
    public final void entryRuleMesh() throws RecognitionException {
        try {
            // InternalMyDsl.g:504:1: ( ruleMesh EOF )
            // InternalMyDsl.g:505:1: ruleMesh EOF
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
    // InternalMyDsl.g:512:1: ruleMesh : ( ( rule__Mesh__Group__0 ) ) ;
    public final void ruleMesh() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:516:2: ( ( ( rule__Mesh__Group__0 ) ) )
            // InternalMyDsl.g:517:2: ( ( rule__Mesh__Group__0 ) )
            {
            // InternalMyDsl.g:517:2: ( ( rule__Mesh__Group__0 ) )
            // InternalMyDsl.g:518:3: ( rule__Mesh__Group__0 )
            {
             before(grammarAccess.getMeshAccess().getGroup()); 
            // InternalMyDsl.g:519:3: ( rule__Mesh__Group__0 )
            // InternalMyDsl.g:519:4: rule__Mesh__Group__0
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
    // InternalMyDsl.g:528:1: entryRuleSphere : ruleSphere EOF ;
    public final void entryRuleSphere() throws RecognitionException {
        try {
            // InternalMyDsl.g:529:1: ( ruleSphere EOF )
            // InternalMyDsl.g:530:1: ruleSphere EOF
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
    // InternalMyDsl.g:537:1: ruleSphere : ( ( rule__Sphere__Group__0 ) ) ;
    public final void ruleSphere() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:541:2: ( ( ( rule__Sphere__Group__0 ) ) )
            // InternalMyDsl.g:542:2: ( ( rule__Sphere__Group__0 ) )
            {
            // InternalMyDsl.g:542:2: ( ( rule__Sphere__Group__0 ) )
            // InternalMyDsl.g:543:3: ( rule__Sphere__Group__0 )
            {
             before(grammarAccess.getSphereAccess().getGroup()); 
            // InternalMyDsl.g:544:3: ( rule__Sphere__Group__0 )
            // InternalMyDsl.g:544:4: rule__Sphere__Group__0
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
    // InternalMyDsl.g:553:1: entryRuleMaterial : ruleMaterial EOF ;
    public final void entryRuleMaterial() throws RecognitionException {
        try {
            // InternalMyDsl.g:554:1: ( ruleMaterial EOF )
            // InternalMyDsl.g:555:1: ruleMaterial EOF
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
    // InternalMyDsl.g:562:1: ruleMaterial : ( ( rule__Material__Alternatives ) ) ;
    public final void ruleMaterial() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:566:2: ( ( ( rule__Material__Alternatives ) ) )
            // InternalMyDsl.g:567:2: ( ( rule__Material__Alternatives ) )
            {
            // InternalMyDsl.g:567:2: ( ( rule__Material__Alternatives ) )
            // InternalMyDsl.g:568:3: ( rule__Material__Alternatives )
            {
             before(grammarAccess.getMaterialAccess().getAlternatives()); 
            // InternalMyDsl.g:569:3: ( rule__Material__Alternatives )
            // InternalMyDsl.g:569:4: rule__Material__Alternatives
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
    // InternalMyDsl.g:578:1: entryRuleTexture : ruleTexture EOF ;
    public final void entryRuleTexture() throws RecognitionException {
        try {
            // InternalMyDsl.g:579:1: ( ruleTexture EOF )
            // InternalMyDsl.g:580:1: ruleTexture EOF
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
    // InternalMyDsl.g:587:1: ruleTexture : ( ( rule__Texture__Group__0 ) ) ;
    public final void ruleTexture() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:591:2: ( ( ( rule__Texture__Group__0 ) ) )
            // InternalMyDsl.g:592:2: ( ( rule__Texture__Group__0 ) )
            {
            // InternalMyDsl.g:592:2: ( ( rule__Texture__Group__0 ) )
            // InternalMyDsl.g:593:3: ( rule__Texture__Group__0 )
            {
             before(grammarAccess.getTextureAccess().getGroup()); 
            // InternalMyDsl.g:594:3: ( rule__Texture__Group__0 )
            // InternalMyDsl.g:594:4: rule__Texture__Group__0
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
    // InternalMyDsl.g:603:1: entryRuleColor : ruleColor EOF ;
    public final void entryRuleColor() throws RecognitionException {
        try {
            // InternalMyDsl.g:604:1: ( ruleColor EOF )
            // InternalMyDsl.g:605:1: ruleColor EOF
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
    // InternalMyDsl.g:612:1: ruleColor : ( ( rule__Color__Group__0 ) ) ;
    public final void ruleColor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:616:2: ( ( ( rule__Color__Group__0 ) ) )
            // InternalMyDsl.g:617:2: ( ( rule__Color__Group__0 ) )
            {
            // InternalMyDsl.g:617:2: ( ( rule__Color__Group__0 ) )
            // InternalMyDsl.g:618:3: ( rule__Color__Group__0 )
            {
             before(grammarAccess.getColorAccess().getGroup()); 
            // InternalMyDsl.g:619:3: ( rule__Color__Group__0 )
            // InternalMyDsl.g:619:4: rule__Color__Group__0
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
    // InternalMyDsl.g:628:1: entryRuleJoint : ruleJoint EOF ;
    public final void entryRuleJoint() throws RecognitionException {
        try {
            // InternalMyDsl.g:629:1: ( ruleJoint EOF )
            // InternalMyDsl.g:630:1: ruleJoint EOF
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
    // InternalMyDsl.g:637:1: ruleJoint : ( ( rule__Joint__Group__0 ) ) ;
    public final void ruleJoint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:641:2: ( ( ( rule__Joint__Group__0 ) ) )
            // InternalMyDsl.g:642:2: ( ( rule__Joint__Group__0 ) )
            {
            // InternalMyDsl.g:642:2: ( ( rule__Joint__Group__0 ) )
            // InternalMyDsl.g:643:3: ( rule__Joint__Group__0 )
            {
             before(grammarAccess.getJointAccess().getGroup()); 
            // InternalMyDsl.g:644:3: ( rule__Joint__Group__0 )
            // InternalMyDsl.g:644:4: rule__Joint__Group__0
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
    // InternalMyDsl.g:653:1: entryRuleAxis : ruleAxis EOF ;
    public final void entryRuleAxis() throws RecognitionException {
        try {
            // InternalMyDsl.g:654:1: ( ruleAxis EOF )
            // InternalMyDsl.g:655:1: ruleAxis EOF
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
    // InternalMyDsl.g:662:1: ruleAxis : ( ( rule__Axis__Group__0 ) ) ;
    public final void ruleAxis() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:666:2: ( ( ( rule__Axis__Group__0 ) ) )
            // InternalMyDsl.g:667:2: ( ( rule__Axis__Group__0 ) )
            {
            // InternalMyDsl.g:667:2: ( ( rule__Axis__Group__0 ) )
            // InternalMyDsl.g:668:3: ( rule__Axis__Group__0 )
            {
             before(grammarAccess.getAxisAccess().getGroup()); 
            // InternalMyDsl.g:669:3: ( rule__Axis__Group__0 )
            // InternalMyDsl.g:669:4: rule__Axis__Group__0
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
    // InternalMyDsl.g:678:1: entryRuleLimit : ruleLimit EOF ;
    public final void entryRuleLimit() throws RecognitionException {
        try {
            // InternalMyDsl.g:679:1: ( ruleLimit EOF )
            // InternalMyDsl.g:680:1: ruleLimit EOF
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
    // InternalMyDsl.g:687:1: ruleLimit : ( ( rule__Limit__Group__0 ) ) ;
    public final void ruleLimit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:691:2: ( ( ( rule__Limit__Group__0 ) ) )
            // InternalMyDsl.g:692:2: ( ( rule__Limit__Group__0 ) )
            {
            // InternalMyDsl.g:692:2: ( ( rule__Limit__Group__0 ) )
            // InternalMyDsl.g:693:3: ( rule__Limit__Group__0 )
            {
             before(grammarAccess.getLimitAccess().getGroup()); 
            // InternalMyDsl.g:694:3: ( rule__Limit__Group__0 )
            // InternalMyDsl.g:694:4: rule__Limit__Group__0
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
    // InternalMyDsl.g:703:1: entryRuleCalibration : ruleCalibration EOF ;
    public final void entryRuleCalibration() throws RecognitionException {
        try {
            // InternalMyDsl.g:704:1: ( ruleCalibration EOF )
            // InternalMyDsl.g:705:1: ruleCalibration EOF
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
    // InternalMyDsl.g:712:1: ruleCalibration : ( ( rule__Calibration__Group__0 ) ) ;
    public final void ruleCalibration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:716:2: ( ( ( rule__Calibration__Group__0 ) ) )
            // InternalMyDsl.g:717:2: ( ( rule__Calibration__Group__0 ) )
            {
            // InternalMyDsl.g:717:2: ( ( rule__Calibration__Group__0 ) )
            // InternalMyDsl.g:718:3: ( rule__Calibration__Group__0 )
            {
             before(grammarAccess.getCalibrationAccess().getGroup()); 
            // InternalMyDsl.g:719:3: ( rule__Calibration__Group__0 )
            // InternalMyDsl.g:719:4: rule__Calibration__Group__0
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
    // InternalMyDsl.g:728:1: entryRuleDynamics : ruleDynamics EOF ;
    public final void entryRuleDynamics() throws RecognitionException {
        try {
            // InternalMyDsl.g:729:1: ( ruleDynamics EOF )
            // InternalMyDsl.g:730:1: ruleDynamics EOF
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
    // InternalMyDsl.g:737:1: ruleDynamics : ( ( rule__Dynamics__Group__0 ) ) ;
    public final void ruleDynamics() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:741:2: ( ( ( rule__Dynamics__Group__0 ) ) )
            // InternalMyDsl.g:742:2: ( ( rule__Dynamics__Group__0 ) )
            {
            // InternalMyDsl.g:742:2: ( ( rule__Dynamics__Group__0 ) )
            // InternalMyDsl.g:743:3: ( rule__Dynamics__Group__0 )
            {
             before(grammarAccess.getDynamicsAccess().getGroup()); 
            // InternalMyDsl.g:744:3: ( rule__Dynamics__Group__0 )
            // InternalMyDsl.g:744:4: rule__Dynamics__Group__0
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
    // InternalMyDsl.g:753:1: entryRuleSafetyController : ruleSafetyController EOF ;
    public final void entryRuleSafetyController() throws RecognitionException {
        try {
            // InternalMyDsl.g:754:1: ( ruleSafetyController EOF )
            // InternalMyDsl.g:755:1: ruleSafetyController EOF
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
    // InternalMyDsl.g:762:1: ruleSafetyController : ( ( rule__SafetyController__Group__0 ) ) ;
    public final void ruleSafetyController() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:766:2: ( ( ( rule__SafetyController__Group__0 ) ) )
            // InternalMyDsl.g:767:2: ( ( rule__SafetyController__Group__0 ) )
            {
            // InternalMyDsl.g:767:2: ( ( rule__SafetyController__Group__0 ) )
            // InternalMyDsl.g:768:3: ( rule__SafetyController__Group__0 )
            {
             before(grammarAccess.getSafetyControllerAccess().getGroup()); 
            // InternalMyDsl.g:769:3: ( rule__SafetyController__Group__0 )
            // InternalMyDsl.g:769:4: rule__SafetyController__Group__0
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
    // InternalMyDsl.g:778:1: entryRuleURDFAttrSignedNumeric : ruleURDFAttrSignedNumeric EOF ;
    public final void entryRuleURDFAttrSignedNumeric() throws RecognitionException {
        try {
            // InternalMyDsl.g:779:1: ( ruleURDFAttrSignedNumeric EOF )
            // InternalMyDsl.g:780:1: ruleURDFAttrSignedNumeric EOF
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
    // InternalMyDsl.g:787:1: ruleURDFAttrSignedNumeric : ( ( rule__URDFAttrSignedNumeric__Group__0 ) ) ;
    public final void ruleURDFAttrSignedNumeric() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:791:2: ( ( ( rule__URDFAttrSignedNumeric__Group__0 ) ) )
            // InternalMyDsl.g:792:2: ( ( rule__URDFAttrSignedNumeric__Group__0 ) )
            {
            // InternalMyDsl.g:792:2: ( ( rule__URDFAttrSignedNumeric__Group__0 ) )
            // InternalMyDsl.g:793:3: ( rule__URDFAttrSignedNumeric__Group__0 )
            {
             before(grammarAccess.getURDFAttrSignedNumericAccess().getGroup()); 
            // InternalMyDsl.g:794:3: ( rule__URDFAttrSignedNumeric__Group__0 )
            // InternalMyDsl.g:794:4: rule__URDFAttrSignedNumeric__Group__0
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
    // InternalMyDsl.g:803:1: entryRuleURDFAttrFloat : ruleURDFAttrFloat EOF ;
    public final void entryRuleURDFAttrFloat() throws RecognitionException {
        try {
            // InternalMyDsl.g:804:1: ( ruleURDFAttrFloat EOF )
            // InternalMyDsl.g:805:1: ruleURDFAttrFloat EOF
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
    // InternalMyDsl.g:812:1: ruleURDFAttrFloat : ( ( rule__URDFAttrFloat__ValueAssignment ) ) ;
    public final void ruleURDFAttrFloat() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:816:2: ( ( ( rule__URDFAttrFloat__ValueAssignment ) ) )
            // InternalMyDsl.g:817:2: ( ( rule__URDFAttrFloat__ValueAssignment ) )
            {
            // InternalMyDsl.g:817:2: ( ( rule__URDFAttrFloat__ValueAssignment ) )
            // InternalMyDsl.g:818:3: ( rule__URDFAttrFloat__ValueAssignment )
            {
             before(grammarAccess.getURDFAttrFloatAccess().getValueAssignment()); 
            // InternalMyDsl.g:819:3: ( rule__URDFAttrFloat__ValueAssignment )
            // InternalMyDsl.g:819:4: rule__URDFAttrFloat__ValueAssignment
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
    // InternalMyDsl.g:828:1: entryRuleURDFAttrINT : ruleURDFAttrINT EOF ;
    public final void entryRuleURDFAttrINT() throws RecognitionException {
        try {
            // InternalMyDsl.g:829:1: ( ruleURDFAttrINT EOF )
            // InternalMyDsl.g:830:1: ruleURDFAttrINT EOF
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
    // InternalMyDsl.g:837:1: ruleURDFAttrINT : ( ( rule__URDFAttrINT__ValueAssignment ) ) ;
    public final void ruleURDFAttrINT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:841:2: ( ( ( rule__URDFAttrINT__ValueAssignment ) ) )
            // InternalMyDsl.g:842:2: ( ( rule__URDFAttrINT__ValueAssignment ) )
            {
            // InternalMyDsl.g:842:2: ( ( rule__URDFAttrINT__ValueAssignment ) )
            // InternalMyDsl.g:843:3: ( rule__URDFAttrINT__ValueAssignment )
            {
             before(grammarAccess.getURDFAttrINTAccess().getValueAssignment()); 
            // InternalMyDsl.g:844:3: ( rule__URDFAttrINT__ValueAssignment )
            // InternalMyDsl.g:844:4: rule__URDFAttrINT__ValueAssignment
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
    // InternalMyDsl.g:853:1: entryRuleURDFAttrNumeric : ruleURDFAttrNumeric EOF ;
    public final void entryRuleURDFAttrNumeric() throws RecognitionException {
        try {
            // InternalMyDsl.g:854:1: ( ruleURDFAttrNumeric EOF )
            // InternalMyDsl.g:855:1: ruleURDFAttrNumeric EOF
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
    // InternalMyDsl.g:862:1: ruleURDFAttrNumeric : ( ( rule__URDFAttrNumeric__ValueAssignment ) ) ;
    public final void ruleURDFAttrNumeric() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:866:2: ( ( ( rule__URDFAttrNumeric__ValueAssignment ) ) )
            // InternalMyDsl.g:867:2: ( ( rule__URDFAttrNumeric__ValueAssignment ) )
            {
            // InternalMyDsl.g:867:2: ( ( rule__URDFAttrNumeric__ValueAssignment ) )
            // InternalMyDsl.g:868:3: ( rule__URDFAttrNumeric__ValueAssignment )
            {
             before(grammarAccess.getURDFAttrNumericAccess().getValueAssignment()); 
            // InternalMyDsl.g:869:3: ( rule__URDFAttrNumeric__ValueAssignment )
            // InternalMyDsl.g:869:4: rule__URDFAttrNumeric__ValueAssignment
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
    // InternalMyDsl.g:878:1: entryRuleURDFAttrSTRING : ruleURDFAttrSTRING EOF ;
    public final void entryRuleURDFAttrSTRING() throws RecognitionException {
        try {
            // InternalMyDsl.g:879:1: ( ruleURDFAttrSTRING EOF )
            // InternalMyDsl.g:880:1: ruleURDFAttrSTRING EOF
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
    // InternalMyDsl.g:887:1: ruleURDFAttrSTRING : ( ( rule__URDFAttrSTRING__ValueAssignment ) ) ;
    public final void ruleURDFAttrSTRING() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:891:2: ( ( ( rule__URDFAttrSTRING__ValueAssignment ) ) )
            // InternalMyDsl.g:892:2: ( ( rule__URDFAttrSTRING__ValueAssignment ) )
            {
            // InternalMyDsl.g:892:2: ( ( rule__URDFAttrSTRING__ValueAssignment ) )
            // InternalMyDsl.g:893:3: ( rule__URDFAttrSTRING__ValueAssignment )
            {
             before(grammarAccess.getURDFAttrSTRINGAccess().getValueAssignment()); 
            // InternalMyDsl.g:894:3: ( rule__URDFAttrSTRING__ValueAssignment )
            // InternalMyDsl.g:894:4: rule__URDFAttrSTRING__ValueAssignment
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
    // InternalMyDsl.g:903:1: entryRuleFLOAT : ruleFLOAT EOF ;
    public final void entryRuleFLOAT() throws RecognitionException {
        try {
            // InternalMyDsl.g:904:1: ( ruleFLOAT EOF )
            // InternalMyDsl.g:905:1: ruleFLOAT EOF
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
    // InternalMyDsl.g:912:1: ruleFLOAT : ( ( rule__FLOAT__Group__0 ) ) ;
    public final void ruleFLOAT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:916:2: ( ( ( rule__FLOAT__Group__0 ) ) )
            // InternalMyDsl.g:917:2: ( ( rule__FLOAT__Group__0 ) )
            {
            // InternalMyDsl.g:917:2: ( ( rule__FLOAT__Group__0 ) )
            // InternalMyDsl.g:918:3: ( rule__FLOAT__Group__0 )
            {
             before(grammarAccess.getFLOATAccess().getGroup()); 
            // InternalMyDsl.g:919:3: ( rule__FLOAT__Group__0 )
            // InternalMyDsl.g:919:4: rule__FLOAT__Group__0
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
    // InternalMyDsl.g:928:1: entryRuleSCIENTIFIC : ruleSCIENTIFIC EOF ;
    public final void entryRuleSCIENTIFIC() throws RecognitionException {
        try {
            // InternalMyDsl.g:929:1: ( ruleSCIENTIFIC EOF )
            // InternalMyDsl.g:930:1: ruleSCIENTIFIC EOF
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
    // InternalMyDsl.g:937:1: ruleSCIENTIFIC : ( ( rule__SCIENTIFIC__Group__0 ) ) ;
    public final void ruleSCIENTIFIC() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:941:2: ( ( ( rule__SCIENTIFIC__Group__0 ) ) )
            // InternalMyDsl.g:942:2: ( ( rule__SCIENTIFIC__Group__0 ) )
            {
            // InternalMyDsl.g:942:2: ( ( rule__SCIENTIFIC__Group__0 ) )
            // InternalMyDsl.g:943:3: ( rule__SCIENTIFIC__Group__0 )
            {
             before(grammarAccess.getSCIENTIFICAccess().getGroup()); 
            // InternalMyDsl.g:944:3: ( rule__SCIENTIFIC__Group__0 )
            // InternalMyDsl.g:944:4: rule__SCIENTIFIC__Group__0
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
    // InternalMyDsl.g:953:1: entryRuleSIGNED_NUMERIC : ruleSIGNED_NUMERIC EOF ;
    public final void entryRuleSIGNED_NUMERIC() throws RecognitionException {
        try {
            // InternalMyDsl.g:954:1: ( ruleSIGNED_NUMERIC EOF )
            // InternalMyDsl.g:955:1: ruleSIGNED_NUMERIC EOF
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
    // InternalMyDsl.g:962:1: ruleSIGNED_NUMERIC : ( ( rule__SIGNED_NUMERIC__Group__0 ) ) ;
    public final void ruleSIGNED_NUMERIC() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:966:2: ( ( ( rule__SIGNED_NUMERIC__Group__0 ) ) )
            // InternalMyDsl.g:967:2: ( ( rule__SIGNED_NUMERIC__Group__0 ) )
            {
            // InternalMyDsl.g:967:2: ( ( rule__SIGNED_NUMERIC__Group__0 ) )
            // InternalMyDsl.g:968:3: ( rule__SIGNED_NUMERIC__Group__0 )
            {
             before(grammarAccess.getSIGNED_NUMERICAccess().getGroup()); 
            // InternalMyDsl.g:969:3: ( rule__SIGNED_NUMERIC__Group__0 )
            // InternalMyDsl.g:969:4: rule__SIGNED_NUMERIC__Group__0
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
    // InternalMyDsl.g:978:1: entryRuleNUMERIC : ruleNUMERIC EOF ;
    public final void entryRuleNUMERIC() throws RecognitionException {
        try {
            // InternalMyDsl.g:979:1: ( ruleNUMERIC EOF )
            // InternalMyDsl.g:980:1: ruleNUMERIC EOF
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
    // InternalMyDsl.g:987:1: ruleNUMERIC : ( ( rule__NUMERIC__Alternatives ) ) ;
    public final void ruleNUMERIC() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:991:2: ( ( ( rule__NUMERIC__Alternatives ) ) )
            // InternalMyDsl.g:992:2: ( ( rule__NUMERIC__Alternatives ) )
            {
            // InternalMyDsl.g:992:2: ( ( rule__NUMERIC__Alternatives ) )
            // InternalMyDsl.g:993:3: ( rule__NUMERIC__Alternatives )
            {
             before(grammarAccess.getNUMERICAccess().getAlternatives()); 
            // InternalMyDsl.g:994:3: ( rule__NUMERIC__Alternatives )
            // InternalMyDsl.g:994:4: rule__NUMERIC__Alternatives
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
    // InternalMyDsl.g:1003:1: ruleJointType : ( ( rule__JointType__Alternatives ) ) ;
    public final void ruleJointType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1007:1: ( ( ( rule__JointType__Alternatives ) ) )
            // InternalMyDsl.g:1008:2: ( ( rule__JointType__Alternatives ) )
            {
            // InternalMyDsl.g:1008:2: ( ( rule__JointType__Alternatives ) )
            // InternalMyDsl.g:1009:3: ( rule__JointType__Alternatives )
            {
             before(grammarAccess.getJointTypeAccess().getAlternatives()); 
            // InternalMyDsl.g:1010:3: ( rule__JointType__Alternatives )
            // InternalMyDsl.g:1010:4: rule__JointType__Alternatives
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
    // InternalMyDsl.g:1018:1: rule__Robot__Alternatives_2 : ( ( ( rule__Robot__Group_2_0__0 ) ) | ( ( rule__Robot__LinksAssignment_2_1 ) ) | ( ( rule__Robot__JointAssignment_2_2 ) ) );
    public final void rule__Robot__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1022:1: ( ( ( rule__Robot__Group_2_0__0 ) ) | ( ( rule__Robot__LinksAssignment_2_1 ) ) | ( ( rule__Robot__JointAssignment_2_2 ) ) )
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
            case 62:
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
                    // InternalMyDsl.g:1023:2: ( ( rule__Robot__Group_2_0__0 ) )
                    {
                    // InternalMyDsl.g:1023:2: ( ( rule__Robot__Group_2_0__0 ) )
                    // InternalMyDsl.g:1024:3: ( rule__Robot__Group_2_0__0 )
                    {
                     before(grammarAccess.getRobotAccess().getGroup_2_0()); 
                    // InternalMyDsl.g:1025:3: ( rule__Robot__Group_2_0__0 )
                    // InternalMyDsl.g:1025:4: rule__Robot__Group_2_0__0
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
                    // InternalMyDsl.g:1029:2: ( ( rule__Robot__LinksAssignment_2_1 ) )
                    {
                    // InternalMyDsl.g:1029:2: ( ( rule__Robot__LinksAssignment_2_1 ) )
                    // InternalMyDsl.g:1030:3: ( rule__Robot__LinksAssignment_2_1 )
                    {
                     before(grammarAccess.getRobotAccess().getLinksAssignment_2_1()); 
                    // InternalMyDsl.g:1031:3: ( rule__Robot__LinksAssignment_2_1 )
                    // InternalMyDsl.g:1031:4: rule__Robot__LinksAssignment_2_1
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
                    // InternalMyDsl.g:1035:2: ( ( rule__Robot__JointAssignment_2_2 ) )
                    {
                    // InternalMyDsl.g:1035:2: ( ( rule__Robot__JointAssignment_2_2 ) )
                    // InternalMyDsl.g:1036:3: ( rule__Robot__JointAssignment_2_2 )
                    {
                     before(grammarAccess.getRobotAccess().getJointAssignment_2_2()); 
                    // InternalMyDsl.g:1037:3: ( rule__Robot__JointAssignment_2_2 )
                    // InternalMyDsl.g:1037:4: rule__Robot__JointAssignment_2_2
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
    // InternalMyDsl.g:1045:1: rule__JointRef__Alternatives : ( ( ( rule__JointRef__FixAssignment_0 ) ) | ( ( rule__JointRef__RevAssignment_1 ) ) | ( ( rule__JointRef__PrisAssignment_2 ) ) | ( ( rule__JointRef__ContAssignment_3 ) ) );
    public final void rule__JointRef__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1049:1: ( ( ( rule__JointRef__FixAssignment_0 ) ) | ( ( rule__JointRef__RevAssignment_1 ) ) | ( ( rule__JointRef__PrisAssignment_2 ) ) | ( ( rule__JointRef__ContAssignment_3 ) ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 84:
                {
                alt2=1;
                }
                break;
            case 85:
                {
                alt2=2;
                }
                break;
            case 86:
                {
                alt2=3;
                }
                break;
            case 87:
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
                    // InternalMyDsl.g:1050:2: ( ( rule__JointRef__FixAssignment_0 ) )
                    {
                    // InternalMyDsl.g:1050:2: ( ( rule__JointRef__FixAssignment_0 ) )
                    // InternalMyDsl.g:1051:3: ( rule__JointRef__FixAssignment_0 )
                    {
                     before(grammarAccess.getJointRefAccess().getFixAssignment_0()); 
                    // InternalMyDsl.g:1052:3: ( rule__JointRef__FixAssignment_0 )
                    // InternalMyDsl.g:1052:4: rule__JointRef__FixAssignment_0
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
                    // InternalMyDsl.g:1056:2: ( ( rule__JointRef__RevAssignment_1 ) )
                    {
                    // InternalMyDsl.g:1056:2: ( ( rule__JointRef__RevAssignment_1 ) )
                    // InternalMyDsl.g:1057:3: ( rule__JointRef__RevAssignment_1 )
                    {
                     before(grammarAccess.getJointRefAccess().getRevAssignment_1()); 
                    // InternalMyDsl.g:1058:3: ( rule__JointRef__RevAssignment_1 )
                    // InternalMyDsl.g:1058:4: rule__JointRef__RevAssignment_1
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
                    // InternalMyDsl.g:1062:2: ( ( rule__JointRef__PrisAssignment_2 ) )
                    {
                    // InternalMyDsl.g:1062:2: ( ( rule__JointRef__PrisAssignment_2 ) )
                    // InternalMyDsl.g:1063:3: ( rule__JointRef__PrisAssignment_2 )
                    {
                     before(grammarAccess.getJointRefAccess().getPrisAssignment_2()); 
                    // InternalMyDsl.g:1064:3: ( rule__JointRef__PrisAssignment_2 )
                    // InternalMyDsl.g:1064:4: rule__JointRef__PrisAssignment_2
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
                    // InternalMyDsl.g:1068:2: ( ( rule__JointRef__ContAssignment_3 ) )
                    {
                    // InternalMyDsl.g:1068:2: ( ( rule__JointRef__ContAssignment_3 ) )
                    // InternalMyDsl.g:1069:3: ( rule__JointRef__ContAssignment_3 )
                    {
                     before(grammarAccess.getJointRefAccess().getContAssignment_3()); 
                    // InternalMyDsl.g:1070:3: ( rule__JointRef__ContAssignment_3 )
                    // InternalMyDsl.g:1070:4: rule__JointRef__ContAssignment_3
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
    // InternalMyDsl.g:1078:1: rule__ReUseAble__Alternatives : ( ( ruleLink ) | ( ruleVisual ) | ( ruleInertial ) | ( ruleCollision ) );
    public final void rule__ReUseAble__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1082:1: ( ( ruleLink ) | ( ruleVisual ) | ( ruleInertial ) | ( ruleCollision ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt3=1;
                }
                break;
            case 34:
                {
                alt3=2;
                }
                break;
            case 26:
                {
                alt3=3;
                }
                break;
            case 46:
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
                    // InternalMyDsl.g:1083:2: ( ruleLink )
                    {
                    // InternalMyDsl.g:1083:2: ( ruleLink )
                    // InternalMyDsl.g:1084:3: ruleLink
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
                    // InternalMyDsl.g:1089:2: ( ruleVisual )
                    {
                    // InternalMyDsl.g:1089:2: ( ruleVisual )
                    // InternalMyDsl.g:1090:3: ruleVisual
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
                    // InternalMyDsl.g:1095:2: ( ruleInertial )
                    {
                    // InternalMyDsl.g:1095:2: ( ruleInertial )
                    // InternalMyDsl.g:1096:3: ruleInertial
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
                    // InternalMyDsl.g:1101:2: ( ruleCollision )
                    {
                    // InternalMyDsl.g:1101:2: ( ruleCollision )
                    // InternalMyDsl.g:1102:3: ruleCollision
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
    // InternalMyDsl.g:1111:1: rule__Link__Alternatives_3 : ( ( ( rule__Link__Group_3_0__0 ) ) | ( ( rule__Link__Group_3_1__0 ) ) );
    public final void rule__Link__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1115:1: ( ( ( rule__Link__Group_3_0__0 ) ) | ( ( rule__Link__Group_3_1__0 ) ) )
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
                    // InternalMyDsl.g:1116:2: ( ( rule__Link__Group_3_0__0 ) )
                    {
                    // InternalMyDsl.g:1116:2: ( ( rule__Link__Group_3_0__0 ) )
                    // InternalMyDsl.g:1117:3: ( rule__Link__Group_3_0__0 )
                    {
                     before(grammarAccess.getLinkAccess().getGroup_3_0()); 
                    // InternalMyDsl.g:1118:3: ( rule__Link__Group_3_0__0 )
                    // InternalMyDsl.g:1118:4: rule__Link__Group_3_0__0
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
                    // InternalMyDsl.g:1122:2: ( ( rule__Link__Group_3_1__0 ) )
                    {
                    // InternalMyDsl.g:1122:2: ( ( rule__Link__Group_3_1__0 ) )
                    // InternalMyDsl.g:1123:3: ( rule__Link__Group_3_1__0 )
                    {
                     before(grammarAccess.getLinkAccess().getGroup_3_1()); 
                    // InternalMyDsl.g:1124:3: ( rule__Link__Group_3_1__0 )
                    // InternalMyDsl.g:1124:4: rule__Link__Group_3_1__0
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
    // InternalMyDsl.g:1132:1: rule__Link__Alternatives_3_0_1 : ( ( ( rule__Link__InertialAssignment_3_0_1_0 ) ) | ( ( rule__Link__VisualAssignment_3_0_1_1 ) ) | ( ( rule__Link__CollisionAssignment_3_0_1_2 ) ) );
    public final void rule__Link__Alternatives_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1136:1: ( ( ( rule__Link__InertialAssignment_3_0_1_0 ) ) | ( ( rule__Link__VisualAssignment_3_0_1_1 ) ) | ( ( rule__Link__CollisionAssignment_3_0_1_2 ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt5=1;
                }
                break;
            case 34:
                {
                alt5=2;
                }
                break;
            case 46:
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
                    // InternalMyDsl.g:1137:2: ( ( rule__Link__InertialAssignment_3_0_1_0 ) )
                    {
                    // InternalMyDsl.g:1137:2: ( ( rule__Link__InertialAssignment_3_0_1_0 ) )
                    // InternalMyDsl.g:1138:3: ( rule__Link__InertialAssignment_3_0_1_0 )
                    {
                     before(grammarAccess.getLinkAccess().getInertialAssignment_3_0_1_0()); 
                    // InternalMyDsl.g:1139:3: ( rule__Link__InertialAssignment_3_0_1_0 )
                    // InternalMyDsl.g:1139:4: rule__Link__InertialAssignment_3_0_1_0
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
                    // InternalMyDsl.g:1143:2: ( ( rule__Link__VisualAssignment_3_0_1_1 ) )
                    {
                    // InternalMyDsl.g:1143:2: ( ( rule__Link__VisualAssignment_3_0_1_1 ) )
                    // InternalMyDsl.g:1144:3: ( rule__Link__VisualAssignment_3_0_1_1 )
                    {
                     before(grammarAccess.getLinkAccess().getVisualAssignment_3_0_1_1()); 
                    // InternalMyDsl.g:1145:3: ( rule__Link__VisualAssignment_3_0_1_1 )
                    // InternalMyDsl.g:1145:4: rule__Link__VisualAssignment_3_0_1_1
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
                    // InternalMyDsl.g:1149:2: ( ( rule__Link__CollisionAssignment_3_0_1_2 ) )
                    {
                    // InternalMyDsl.g:1149:2: ( ( rule__Link__CollisionAssignment_3_0_1_2 ) )
                    // InternalMyDsl.g:1150:3: ( rule__Link__CollisionAssignment_3_0_1_2 )
                    {
                     before(grammarAccess.getLinkAccess().getCollisionAssignment_3_0_1_2()); 
                    // InternalMyDsl.g:1151:3: ( rule__Link__CollisionAssignment_3_0_1_2 )
                    // InternalMyDsl.g:1151:4: rule__Link__CollisionAssignment_3_0_1_2
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


    // $ANTLR start "rule__Reuse__Alternatives"
    // InternalMyDsl.g:1159:1: rule__Reuse__Alternatives : ( ( ( rule__Reuse__Group_0__0 ) ) | ( ( rule__Reuse__Group_1__0 ) ) );
    public final void rule__Reuse__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1163:1: ( ( ( rule__Reuse__Group_0__0 ) ) | ( ( rule__Reuse__Group_1__0 ) ) )
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
                    // InternalMyDsl.g:1164:2: ( ( rule__Reuse__Group_0__0 ) )
                    {
                    // InternalMyDsl.g:1164:2: ( ( rule__Reuse__Group_0__0 ) )
                    // InternalMyDsl.g:1165:3: ( rule__Reuse__Group_0__0 )
                    {
                     before(grammarAccess.getReuseAccess().getGroup_0()); 
                    // InternalMyDsl.g:1166:3: ( rule__Reuse__Group_0__0 )
                    // InternalMyDsl.g:1166:4: rule__Reuse__Group_0__0
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
                    // InternalMyDsl.g:1170:2: ( ( rule__Reuse__Group_1__0 ) )
                    {
                    // InternalMyDsl.g:1170:2: ( ( rule__Reuse__Group_1__0 ) )
                    // InternalMyDsl.g:1171:3: ( rule__Reuse__Group_1__0 )
                    {
                     before(grammarAccess.getReuseAccess().getGroup_1()); 
                    // InternalMyDsl.g:1172:3: ( rule__Reuse__Group_1__0 )
                    // InternalMyDsl.g:1172:4: rule__Reuse__Group_1__0
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
    // InternalMyDsl.g:1180:1: rule__Geometry__Alternatives : ( ( ruleBox ) | ( ruleCylinder ) | ( ruleMesh ) | ( ruleSphere ) );
    public final void rule__Geometry__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1184:1: ( ( ruleBox ) | ( ruleCylinder ) | ( ruleMesh ) | ( ruleSphere ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt7=1;
                }
                break;
            case 51:
                {
                alt7=2;
                }
                break;
            case 53:
                {
                alt7=3;
                }
                break;
            case 55:
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
                    // InternalMyDsl.g:1185:2: ( ruleBox )
                    {
                    // InternalMyDsl.g:1185:2: ( ruleBox )
                    // InternalMyDsl.g:1186:3: ruleBox
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
                    // InternalMyDsl.g:1191:2: ( ruleCylinder )
                    {
                    // InternalMyDsl.g:1191:2: ( ruleCylinder )
                    // InternalMyDsl.g:1192:3: ruleCylinder
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
                    // InternalMyDsl.g:1197:2: ( ruleMesh )
                    {
                    // InternalMyDsl.g:1197:2: ( ruleMesh )
                    // InternalMyDsl.g:1198:3: ruleMesh
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
                    // InternalMyDsl.g:1203:2: ( ruleSphere )
                    {
                    // InternalMyDsl.g:1203:2: ( ruleSphere )
                    // InternalMyDsl.g:1204:3: ruleSphere
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
    // InternalMyDsl.g:1213:1: rule__Material__Alternatives : ( ( ruleTexture ) | ( ruleColor ) );
    public final void rule__Material__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1217:1: ( ( ruleTexture ) | ( ruleColor ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==56) ) {
                alt8=1;
            }
            else if ( (LA8_0==57) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:1218:2: ( ruleTexture )
                    {
                    // InternalMyDsl.g:1218:2: ( ruleTexture )
                    // InternalMyDsl.g:1219:3: ruleTexture
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
                    // InternalMyDsl.g:1224:2: ( ruleColor )
                    {
                    // InternalMyDsl.g:1224:2: ( ruleColor )
                    // InternalMyDsl.g:1225:3: ruleColor
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
    // InternalMyDsl.g:1234:1: rule__Joint__Alternatives_2 : ( ( ( rule__Joint__Group_2_0__0 ) ) | ( ( rule__Joint__Group_2_1__0 ) ) );
    public final void rule__Joint__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1238:1: ( ( ( rule__Joint__Group_2_0__0 ) ) | ( ( rule__Joint__Group_2_1__0 ) ) )
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
                    // InternalMyDsl.g:1239:2: ( ( rule__Joint__Group_2_0__0 ) )
                    {
                    // InternalMyDsl.g:1239:2: ( ( rule__Joint__Group_2_0__0 ) )
                    // InternalMyDsl.g:1240:3: ( rule__Joint__Group_2_0__0 )
                    {
                     before(grammarAccess.getJointAccess().getGroup_2_0()); 
                    // InternalMyDsl.g:1241:3: ( rule__Joint__Group_2_0__0 )
                    // InternalMyDsl.g:1241:4: rule__Joint__Group_2_0__0
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
                    // InternalMyDsl.g:1245:2: ( ( rule__Joint__Group_2_1__0 ) )
                    {
                    // InternalMyDsl.g:1245:2: ( ( rule__Joint__Group_2_1__0 ) )
                    // InternalMyDsl.g:1246:3: ( rule__Joint__Group_2_1__0 )
                    {
                     before(grammarAccess.getJointAccess().getGroup_2_1()); 
                    // InternalMyDsl.g:1247:3: ( rule__Joint__Group_2_1__0 )
                    // InternalMyDsl.g:1247:4: rule__Joint__Group_2_1__0
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
    // InternalMyDsl.g:1255:1: rule__Joint__Alternatives_2_0_1 : ( ( ( rule__Joint__OriginAssignment_2_0_1_0 ) ) | ( ( rule__Joint__AxisAssignment_2_0_1_1 ) ) | ( ( rule__Joint__LimitAssignment_2_0_1_2 ) ) | ( ( rule__Joint__CalibrationAssignment_2_0_1_3 ) ) | ( ( rule__Joint__DynamicsAssignment_2_0_1_4 ) ) | ( ( rule__Joint__SafetycontrollerAssignment_2_0_1_5 ) ) );
    public final void rule__Joint__Alternatives_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1259:1: ( ( ( rule__Joint__OriginAssignment_2_0_1_0 ) ) | ( ( rule__Joint__AxisAssignment_2_0_1_1 ) ) | ( ( rule__Joint__LimitAssignment_2_0_1_2 ) ) | ( ( rule__Joint__CalibrationAssignment_2_0_1_3 ) ) | ( ( rule__Joint__DynamicsAssignment_2_0_1_4 ) ) | ( ( rule__Joint__SafetycontrollerAssignment_2_0_1_5 ) ) )
            int alt10=6;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt10=1;
                }
                break;
            case 66:
                {
                alt10=2;
                }
                break;
            case 67:
                {
                alt10=3;
                }
                break;
            case 72:
                {
                alt10=4;
                }
                break;
            case 75:
                {
                alt10=5;
                }
                break;
            case 78:
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
                    // InternalMyDsl.g:1260:2: ( ( rule__Joint__OriginAssignment_2_0_1_0 ) )
                    {
                    // InternalMyDsl.g:1260:2: ( ( rule__Joint__OriginAssignment_2_0_1_0 ) )
                    // InternalMyDsl.g:1261:3: ( rule__Joint__OriginAssignment_2_0_1_0 )
                    {
                     before(grammarAccess.getJointAccess().getOriginAssignment_2_0_1_0()); 
                    // InternalMyDsl.g:1262:3: ( rule__Joint__OriginAssignment_2_0_1_0 )
                    // InternalMyDsl.g:1262:4: rule__Joint__OriginAssignment_2_0_1_0
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
                    // InternalMyDsl.g:1266:2: ( ( rule__Joint__AxisAssignment_2_0_1_1 ) )
                    {
                    // InternalMyDsl.g:1266:2: ( ( rule__Joint__AxisAssignment_2_0_1_1 ) )
                    // InternalMyDsl.g:1267:3: ( rule__Joint__AxisAssignment_2_0_1_1 )
                    {
                     before(grammarAccess.getJointAccess().getAxisAssignment_2_0_1_1()); 
                    // InternalMyDsl.g:1268:3: ( rule__Joint__AxisAssignment_2_0_1_1 )
                    // InternalMyDsl.g:1268:4: rule__Joint__AxisAssignment_2_0_1_1
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
                    // InternalMyDsl.g:1272:2: ( ( rule__Joint__LimitAssignment_2_0_1_2 ) )
                    {
                    // InternalMyDsl.g:1272:2: ( ( rule__Joint__LimitAssignment_2_0_1_2 ) )
                    // InternalMyDsl.g:1273:3: ( rule__Joint__LimitAssignment_2_0_1_2 )
                    {
                     before(grammarAccess.getJointAccess().getLimitAssignment_2_0_1_2()); 
                    // InternalMyDsl.g:1274:3: ( rule__Joint__LimitAssignment_2_0_1_2 )
                    // InternalMyDsl.g:1274:4: rule__Joint__LimitAssignment_2_0_1_2
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
                    // InternalMyDsl.g:1278:2: ( ( rule__Joint__CalibrationAssignment_2_0_1_3 ) )
                    {
                    // InternalMyDsl.g:1278:2: ( ( rule__Joint__CalibrationAssignment_2_0_1_3 ) )
                    // InternalMyDsl.g:1279:3: ( rule__Joint__CalibrationAssignment_2_0_1_3 )
                    {
                     before(grammarAccess.getJointAccess().getCalibrationAssignment_2_0_1_3()); 
                    // InternalMyDsl.g:1280:3: ( rule__Joint__CalibrationAssignment_2_0_1_3 )
                    // InternalMyDsl.g:1280:4: rule__Joint__CalibrationAssignment_2_0_1_3
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
                    // InternalMyDsl.g:1284:2: ( ( rule__Joint__DynamicsAssignment_2_0_1_4 ) )
                    {
                    // InternalMyDsl.g:1284:2: ( ( rule__Joint__DynamicsAssignment_2_0_1_4 ) )
                    // InternalMyDsl.g:1285:3: ( rule__Joint__DynamicsAssignment_2_0_1_4 )
                    {
                     before(grammarAccess.getJointAccess().getDynamicsAssignment_2_0_1_4()); 
                    // InternalMyDsl.g:1286:3: ( rule__Joint__DynamicsAssignment_2_0_1_4 )
                    // InternalMyDsl.g:1286:4: rule__Joint__DynamicsAssignment_2_0_1_4
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
                    // InternalMyDsl.g:1290:2: ( ( rule__Joint__SafetycontrollerAssignment_2_0_1_5 ) )
                    {
                    // InternalMyDsl.g:1290:2: ( ( rule__Joint__SafetycontrollerAssignment_2_0_1_5 ) )
                    // InternalMyDsl.g:1291:3: ( rule__Joint__SafetycontrollerAssignment_2_0_1_5 )
                    {
                     before(grammarAccess.getJointAccess().getSafetycontrollerAssignment_2_0_1_5()); 
                    // InternalMyDsl.g:1292:3: ( rule__Joint__SafetycontrollerAssignment_2_0_1_5 )
                    // InternalMyDsl.g:1292:4: rule__Joint__SafetycontrollerAssignment_2_0_1_5
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
    // InternalMyDsl.g:1300:1: rule__SCIENTIFIC__Alternatives_2 : ( ( '+' ) | ( '-' ) );
    public final void rule__SCIENTIFIC__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1304:1: ( ( '+' ) | ( '-' ) )
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
                    // InternalMyDsl.g:1305:2: ( '+' )
                    {
                    // InternalMyDsl.g:1305:2: ( '+' )
                    // InternalMyDsl.g:1306:3: '+'
                    {
                     before(grammarAccess.getSCIENTIFICAccess().getPlusSignKeyword_2_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getSCIENTIFICAccess().getPlusSignKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1311:2: ( '-' )
                    {
                    // InternalMyDsl.g:1311:2: ( '-' )
                    // InternalMyDsl.g:1312:3: '-'
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
    // InternalMyDsl.g:1321:1: rule__SIGNED_NUMERIC__Alternatives_1 : ( ( RULE_INT ) | ( ruleFLOAT ) | ( ruleSCIENTIFIC ) );
    public final void rule__SIGNED_NUMERIC__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1325:1: ( ( RULE_INT ) | ( ruleFLOAT ) | ( ruleSCIENTIFIC ) )
            int alt12=3;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_INT) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==EOF||(LA12_1>=18 && LA12_1<=19)||LA12_1==26||(LA12_1>=29 && LA12_1<=34)||(LA12_1>=36 && LA12_1<=37)||(LA12_1>=39 && LA12_1<=44)||LA12_1==46||LA12_1==62||(LA12_1>=66 && LA12_1<=67)||(LA12_1>=69 && LA12_1<=72)||(LA12_1>=74 && LA12_1<=75)||(LA12_1>=77 && LA12_1<=78)||(LA12_1>=80 && LA12_1<=82)) ) {
                    alt12=1;
                }
                else if ( (LA12_1==25) ) {
                    int LA12_3 = input.LA(3);

                    if ( (LA12_3==RULE_INT) ) {
                        int LA12_4 = input.LA(4);

                        if ( (LA12_4==83) ) {
                            alt12=3;
                        }
                        else if ( (LA12_4==EOF||(LA12_4>=18 && LA12_4<=19)||LA12_4==26||(LA12_4>=29 && LA12_4<=34)||(LA12_4>=36 && LA12_4<=37)||(LA12_4>=39 && LA12_4<=44)||LA12_4==46||LA12_4==62||(LA12_4>=66 && LA12_4<=67)||(LA12_4>=69 && LA12_4<=72)||(LA12_4>=74 && LA12_4<=75)||(LA12_4>=77 && LA12_4<=78)||(LA12_4>=80 && LA12_4<=82)) ) {
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
                    // InternalMyDsl.g:1326:2: ( RULE_INT )
                    {
                    // InternalMyDsl.g:1326:2: ( RULE_INT )
                    // InternalMyDsl.g:1327:3: RULE_INT
                    {
                     before(grammarAccess.getSIGNED_NUMERICAccess().getINTTerminalRuleCall_1_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getSIGNED_NUMERICAccess().getINTTerminalRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1332:2: ( ruleFLOAT )
                    {
                    // InternalMyDsl.g:1332:2: ( ruleFLOAT )
                    // InternalMyDsl.g:1333:3: ruleFLOAT
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
                    // InternalMyDsl.g:1338:2: ( ruleSCIENTIFIC )
                    {
                    // InternalMyDsl.g:1338:2: ( ruleSCIENTIFIC )
                    // InternalMyDsl.g:1339:3: ruleSCIENTIFIC
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
    // InternalMyDsl.g:1348:1: rule__NUMERIC__Alternatives : ( ( RULE_INT ) | ( ruleFLOAT ) | ( ruleSCIENTIFIC ) );
    public final void rule__NUMERIC__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1352:1: ( ( RULE_INT ) | ( ruleFLOAT ) | ( ruleSCIENTIFIC ) )
            int alt13=3;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_INT) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==25) ) {
                    int LA13_2 = input.LA(3);

                    if ( (LA13_2==RULE_INT) ) {
                        int LA13_4 = input.LA(4);

                        if ( (LA13_4==EOF||(LA13_4>=18 && LA13_4<=19)||LA13_4==26||LA13_4==34||(LA13_4>=36 && LA13_4<=37)||(LA13_4>=46 && LA13_4<=47)||(LA13_4>=49 && LA13_4<=51)||LA13_4==53||LA13_4==55||LA13_4==62) ) {
                            alt13=2;
                        }
                        else if ( (LA13_4==83) ) {
                            alt13=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 13, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA13_1==EOF||(LA13_1>=18 && LA13_1<=19)||LA13_1==26||LA13_1==34||(LA13_1>=36 && LA13_1<=37)||(LA13_1>=46 && LA13_1<=47)||(LA13_1>=49 && LA13_1<=51)||LA13_1==53||LA13_1==55||LA13_1==62) ) {
                    alt13=1;
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
                    // InternalMyDsl.g:1353:2: ( RULE_INT )
                    {
                    // InternalMyDsl.g:1353:2: ( RULE_INT )
                    // InternalMyDsl.g:1354:3: RULE_INT
                    {
                     before(grammarAccess.getNUMERICAccess().getINTTerminalRuleCall_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getNUMERICAccess().getINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1359:2: ( ruleFLOAT )
                    {
                    // InternalMyDsl.g:1359:2: ( ruleFLOAT )
                    // InternalMyDsl.g:1360:3: ruleFLOAT
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
                    // InternalMyDsl.g:1365:2: ( ruleSCIENTIFIC )
                    {
                    // InternalMyDsl.g:1365:2: ( ruleSCIENTIFIC )
                    // InternalMyDsl.g:1366:3: ruleSCIENTIFIC
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
    // InternalMyDsl.g:1375:1: rule__JointType__Alternatives : ( ( ( 'fixed' ) ) | ( ( 'revolute' ) ) | ( ( 'prismatic' ) ) | ( ( 'continuous' ) ) );
    public final void rule__JointType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1379:1: ( ( ( 'fixed' ) ) | ( ( 'revolute' ) ) | ( ( 'prismatic' ) ) | ( ( 'continuous' ) ) )
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
                    // InternalMyDsl.g:1380:2: ( ( 'fixed' ) )
                    {
                    // InternalMyDsl.g:1380:2: ( ( 'fixed' ) )
                    // InternalMyDsl.g:1381:3: ( 'fixed' )
                    {
                     before(grammarAccess.getJointTypeAccess().getFixedEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:1382:3: ( 'fixed' )
                    // InternalMyDsl.g:1382:4: 'fixed'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getJointTypeAccess().getFixedEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1386:2: ( ( 'revolute' ) )
                    {
                    // InternalMyDsl.g:1386:2: ( ( 'revolute' ) )
                    // InternalMyDsl.g:1387:3: ( 'revolute' )
                    {
                     before(grammarAccess.getJointTypeAccess().getRevoluteEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:1388:3: ( 'revolute' )
                    // InternalMyDsl.g:1388:4: 'revolute'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getJointTypeAccess().getRevoluteEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1392:2: ( ( 'prismatic' ) )
                    {
                    // InternalMyDsl.g:1392:2: ( ( 'prismatic' ) )
                    // InternalMyDsl.g:1393:3: ( 'prismatic' )
                    {
                     before(grammarAccess.getJointTypeAccess().getPrismaticEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:1394:3: ( 'prismatic' )
                    // InternalMyDsl.g:1394:4: 'prismatic'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getJointTypeAccess().getPrismaticEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1398:2: ( ( 'continuous' ) )
                    {
                    // InternalMyDsl.g:1398:2: ( ( 'continuous' ) )
                    // InternalMyDsl.g:1399:3: ( 'continuous' )
                    {
                     before(grammarAccess.getJointTypeAccess().getContinuousEnumLiteralDeclaration_3()); 
                    // InternalMyDsl.g:1400:3: ( 'continuous' )
                    // InternalMyDsl.g:1400:4: 'continuous'
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
    // InternalMyDsl.g:1408:1: rule__Robot__Group__0 : rule__Robot__Group__0__Impl rule__Robot__Group__1 ;
    public final void rule__Robot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1412:1: ( rule__Robot__Group__0__Impl rule__Robot__Group__1 )
            // InternalMyDsl.g:1413:2: rule__Robot__Group__0__Impl rule__Robot__Group__1
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
    // InternalMyDsl.g:1420:1: rule__Robot__Group__0__Impl : ( 'Robot' ) ;
    public final void rule__Robot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1424:1: ( ( 'Robot' ) )
            // InternalMyDsl.g:1425:1: ( 'Robot' )
            {
            // InternalMyDsl.g:1425:1: ( 'Robot' )
            // InternalMyDsl.g:1426:2: 'Robot'
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
    // InternalMyDsl.g:1435:1: rule__Robot__Group__1 : rule__Robot__Group__1__Impl rule__Robot__Group__2 ;
    public final void rule__Robot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1439:1: ( rule__Robot__Group__1__Impl rule__Robot__Group__2 )
            // InternalMyDsl.g:1440:2: rule__Robot__Group__1__Impl rule__Robot__Group__2
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
    // InternalMyDsl.g:1447:1: rule__Robot__Group__1__Impl : ( ( rule__Robot__NameAssignment_1 ) ) ;
    public final void rule__Robot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1451:1: ( ( ( rule__Robot__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1452:1: ( ( rule__Robot__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1452:1: ( ( rule__Robot__NameAssignment_1 ) )
            // InternalMyDsl.g:1453:2: ( rule__Robot__NameAssignment_1 )
            {
             before(grammarAccess.getRobotAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1454:2: ( rule__Robot__NameAssignment_1 )
            // InternalMyDsl.g:1454:3: rule__Robot__NameAssignment_1
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
    // InternalMyDsl.g:1462:1: rule__Robot__Group__2 : rule__Robot__Group__2__Impl ;
    public final void rule__Robot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1466:1: ( rule__Robot__Group__2__Impl )
            // InternalMyDsl.g:1467:2: rule__Robot__Group__2__Impl
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
    // InternalMyDsl.g:1473:1: rule__Robot__Group__2__Impl : ( ( rule__Robot__Alternatives_2 )* ) ;
    public final void rule__Robot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1477:1: ( ( ( rule__Robot__Alternatives_2 )* ) )
            // InternalMyDsl.g:1478:1: ( ( rule__Robot__Alternatives_2 )* )
            {
            // InternalMyDsl.g:1478:1: ( ( rule__Robot__Alternatives_2 )* )
            // InternalMyDsl.g:1479:2: ( rule__Robot__Alternatives_2 )*
            {
             before(grammarAccess.getRobotAccess().getAlternatives_2()); 
            // InternalMyDsl.g:1480:2: ( rule__Robot__Alternatives_2 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=18 && LA15_0<=19)||LA15_0==62) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMyDsl.g:1480:3: rule__Robot__Alternatives_2
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
    // InternalMyDsl.g:1489:1: rule__Robot__Group_2_0__0 : rule__Robot__Group_2_0__0__Impl rule__Robot__Group_2_0__1 ;
    public final void rule__Robot__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1493:1: ( rule__Robot__Group_2_0__0__Impl rule__Robot__Group_2_0__1 )
            // InternalMyDsl.g:1494:2: rule__Robot__Group_2_0__0__Impl rule__Robot__Group_2_0__1
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
    // InternalMyDsl.g:1501:1: rule__Robot__Group_2_0__0__Impl : ( 'Topology' ) ;
    public final void rule__Robot__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1505:1: ( ( 'Topology' ) )
            // InternalMyDsl.g:1506:1: ( 'Topology' )
            {
            // InternalMyDsl.g:1506:1: ( 'Topology' )
            // InternalMyDsl.g:1507:2: 'Topology'
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
    // InternalMyDsl.g:1516:1: rule__Robot__Group_2_0__1 : rule__Robot__Group_2_0__1__Impl ;
    public final void rule__Robot__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1520:1: ( rule__Robot__Group_2_0__1__Impl )
            // InternalMyDsl.g:1521:2: rule__Robot__Group_2_0__1__Impl
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
    // InternalMyDsl.g:1527:1: rule__Robot__Group_2_0__1__Impl : ( ( rule__Robot__TopologiesAssignment_2_0_1 ) ) ;
    public final void rule__Robot__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1531:1: ( ( ( rule__Robot__TopologiesAssignment_2_0_1 ) ) )
            // InternalMyDsl.g:1532:1: ( ( rule__Robot__TopologiesAssignment_2_0_1 ) )
            {
            // InternalMyDsl.g:1532:1: ( ( rule__Robot__TopologiesAssignment_2_0_1 ) )
            // InternalMyDsl.g:1533:2: ( rule__Robot__TopologiesAssignment_2_0_1 )
            {
             before(grammarAccess.getRobotAccess().getTopologiesAssignment_2_0_1()); 
            // InternalMyDsl.g:1534:2: ( rule__Robot__TopologiesAssignment_2_0_1 )
            // InternalMyDsl.g:1534:3: rule__Robot__TopologiesAssignment_2_0_1
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
    // InternalMyDsl.g:1543:1: rule__Topology__Group__0 : rule__Topology__Group__0__Impl rule__Topology__Group__1 ;
    public final void rule__Topology__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1547:1: ( rule__Topology__Group__0__Impl rule__Topology__Group__1 )
            // InternalMyDsl.g:1548:2: rule__Topology__Group__0__Impl rule__Topology__Group__1
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
    // InternalMyDsl.g:1555:1: rule__Topology__Group__0__Impl : ( ( rule__Topology__ParentAssignment_0 ) ) ;
    public final void rule__Topology__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1559:1: ( ( ( rule__Topology__ParentAssignment_0 ) ) )
            // InternalMyDsl.g:1560:1: ( ( rule__Topology__ParentAssignment_0 ) )
            {
            // InternalMyDsl.g:1560:1: ( ( rule__Topology__ParentAssignment_0 ) )
            // InternalMyDsl.g:1561:2: ( rule__Topology__ParentAssignment_0 )
            {
             before(grammarAccess.getTopologyAccess().getParentAssignment_0()); 
            // InternalMyDsl.g:1562:2: ( rule__Topology__ParentAssignment_0 )
            // InternalMyDsl.g:1562:3: rule__Topology__ParentAssignment_0
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
    // InternalMyDsl.g:1570:1: rule__Topology__Group__1 : rule__Topology__Group__1__Impl ;
    public final void rule__Topology__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1574:1: ( rule__Topology__Group__1__Impl )
            // InternalMyDsl.g:1575:2: rule__Topology__Group__1__Impl
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
    // InternalMyDsl.g:1581:1: rule__Topology__Group__1__Impl : ( ( rule__Topology__Group_1__0 )? ) ;
    public final void rule__Topology__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1585:1: ( ( ( rule__Topology__Group_1__0 )? ) )
            // InternalMyDsl.g:1586:1: ( ( rule__Topology__Group_1__0 )? )
            {
            // InternalMyDsl.g:1586:1: ( ( rule__Topology__Group_1__0 )? )
            // InternalMyDsl.g:1587:2: ( rule__Topology__Group_1__0 )?
            {
             before(grammarAccess.getTopologyAccess().getGroup_1()); 
            // InternalMyDsl.g:1588:2: ( rule__Topology__Group_1__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=84 && LA16_0<=87)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:1588:3: rule__Topology__Group_1__0
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
    // InternalMyDsl.g:1597:1: rule__Topology__Group_1__0 : rule__Topology__Group_1__0__Impl rule__Topology__Group_1__1 ;
    public final void rule__Topology__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1601:1: ( rule__Topology__Group_1__0__Impl rule__Topology__Group_1__1 )
            // InternalMyDsl.g:1602:2: rule__Topology__Group_1__0__Impl rule__Topology__Group_1__1
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
    // InternalMyDsl.g:1609:1: rule__Topology__Group_1__0__Impl : ( ( rule__Topology__JointAssignment_1_0 ) ) ;
    public final void rule__Topology__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1613:1: ( ( ( rule__Topology__JointAssignment_1_0 ) ) )
            // InternalMyDsl.g:1614:1: ( ( rule__Topology__JointAssignment_1_0 ) )
            {
            // InternalMyDsl.g:1614:1: ( ( rule__Topology__JointAssignment_1_0 ) )
            // InternalMyDsl.g:1615:2: ( rule__Topology__JointAssignment_1_0 )
            {
             before(grammarAccess.getTopologyAccess().getJointAssignment_1_0()); 
            // InternalMyDsl.g:1616:2: ( rule__Topology__JointAssignment_1_0 )
            // InternalMyDsl.g:1616:3: rule__Topology__JointAssignment_1_0
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
    // InternalMyDsl.g:1624:1: rule__Topology__Group_1__1 : rule__Topology__Group_1__1__Impl ;
    public final void rule__Topology__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1628:1: ( rule__Topology__Group_1__1__Impl )
            // InternalMyDsl.g:1629:2: rule__Topology__Group_1__1__Impl
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
    // InternalMyDsl.g:1635:1: rule__Topology__Group_1__1__Impl : ( ( rule__Topology__ChildAssignment_1_1 ) ) ;
    public final void rule__Topology__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1639:1: ( ( ( rule__Topology__ChildAssignment_1_1 ) ) )
            // InternalMyDsl.g:1640:1: ( ( rule__Topology__ChildAssignment_1_1 ) )
            {
            // InternalMyDsl.g:1640:1: ( ( rule__Topology__ChildAssignment_1_1 ) )
            // InternalMyDsl.g:1641:2: ( rule__Topology__ChildAssignment_1_1 )
            {
             before(grammarAccess.getTopologyAccess().getChildAssignment_1_1()); 
            // InternalMyDsl.g:1642:2: ( rule__Topology__ChildAssignment_1_1 )
            // InternalMyDsl.g:1642:3: rule__Topology__ChildAssignment_1_1
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
    // InternalMyDsl.g:1651:1: rule__Link__Group__0 : rule__Link__Group__0__Impl rule__Link__Group__1 ;
    public final void rule__Link__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1655:1: ( rule__Link__Group__0__Impl rule__Link__Group__1 )
            // InternalMyDsl.g:1656:2: rule__Link__Group__0__Impl rule__Link__Group__1
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
    // InternalMyDsl.g:1663:1: rule__Link__Group__0__Impl : ( () ) ;
    public final void rule__Link__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1667:1: ( ( () ) )
            // InternalMyDsl.g:1668:1: ( () )
            {
            // InternalMyDsl.g:1668:1: ( () )
            // InternalMyDsl.g:1669:2: ()
            {
             before(grammarAccess.getLinkAccess().getLinkAction_0()); 
            // InternalMyDsl.g:1670:2: ()
            // InternalMyDsl.g:1670:3: 
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
    // InternalMyDsl.g:1678:1: rule__Link__Group__1 : rule__Link__Group__1__Impl rule__Link__Group__2 ;
    public final void rule__Link__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1682:1: ( rule__Link__Group__1__Impl rule__Link__Group__2 )
            // InternalMyDsl.g:1683:2: rule__Link__Group__1__Impl rule__Link__Group__2
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
    // InternalMyDsl.g:1690:1: rule__Link__Group__1__Impl : ( 'Link' ) ;
    public final void rule__Link__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1694:1: ( ( 'Link' ) )
            // InternalMyDsl.g:1695:1: ( 'Link' )
            {
            // InternalMyDsl.g:1695:1: ( 'Link' )
            // InternalMyDsl.g:1696:2: 'Link'
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
    // InternalMyDsl.g:1705:1: rule__Link__Group__2 : rule__Link__Group__2__Impl rule__Link__Group__3 ;
    public final void rule__Link__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1709:1: ( rule__Link__Group__2__Impl rule__Link__Group__3 )
            // InternalMyDsl.g:1710:2: rule__Link__Group__2__Impl rule__Link__Group__3
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
    // InternalMyDsl.g:1717:1: rule__Link__Group__2__Impl : ( ( rule__Link__NameAssignment_2 ) ) ;
    public final void rule__Link__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1721:1: ( ( ( rule__Link__NameAssignment_2 ) ) )
            // InternalMyDsl.g:1722:1: ( ( rule__Link__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:1722:1: ( ( rule__Link__NameAssignment_2 ) )
            // InternalMyDsl.g:1723:2: ( rule__Link__NameAssignment_2 )
            {
             before(grammarAccess.getLinkAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:1724:2: ( rule__Link__NameAssignment_2 )
            // InternalMyDsl.g:1724:3: rule__Link__NameAssignment_2
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
    // InternalMyDsl.g:1732:1: rule__Link__Group__3 : rule__Link__Group__3__Impl ;
    public final void rule__Link__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1736:1: ( rule__Link__Group__3__Impl )
            // InternalMyDsl.g:1737:2: rule__Link__Group__3__Impl
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
    // InternalMyDsl.g:1743:1: rule__Link__Group__3__Impl : ( ( rule__Link__Alternatives_3 )? ) ;
    public final void rule__Link__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1747:1: ( ( ( rule__Link__Alternatives_3 )? ) )
            // InternalMyDsl.g:1748:1: ( ( rule__Link__Alternatives_3 )? )
            {
            // InternalMyDsl.g:1748:1: ( ( rule__Link__Alternatives_3 )? )
            // InternalMyDsl.g:1749:2: ( rule__Link__Alternatives_3 )?
            {
             before(grammarAccess.getLinkAccess().getAlternatives_3()); 
            // InternalMyDsl.g:1750:2: ( rule__Link__Alternatives_3 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=20 && LA17_0<=21)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:1750:3: rule__Link__Alternatives_3
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
    // InternalMyDsl.g:1759:1: rule__Link__Group_3_0__0 : rule__Link__Group_3_0__0__Impl rule__Link__Group_3_0__1 ;
    public final void rule__Link__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1763:1: ( rule__Link__Group_3_0__0__Impl rule__Link__Group_3_0__1 )
            // InternalMyDsl.g:1764:2: rule__Link__Group_3_0__0__Impl rule__Link__Group_3_0__1
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
    // InternalMyDsl.g:1771:1: rule__Link__Group_3_0__0__Impl : ( 'def' ) ;
    public final void rule__Link__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1775:1: ( ( 'def' ) )
            // InternalMyDsl.g:1776:1: ( 'def' )
            {
            // InternalMyDsl.g:1776:1: ( 'def' )
            // InternalMyDsl.g:1777:2: 'def'
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
    // InternalMyDsl.g:1786:1: rule__Link__Group_3_0__1 : rule__Link__Group_3_0__1__Impl ;
    public final void rule__Link__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1790:1: ( rule__Link__Group_3_0__1__Impl )
            // InternalMyDsl.g:1791:2: rule__Link__Group_3_0__1__Impl
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
    // InternalMyDsl.g:1797:1: rule__Link__Group_3_0__1__Impl : ( ( ( rule__Link__Alternatives_3_0_1 ) ) ( ( rule__Link__Alternatives_3_0_1 )* ) ) ;
    public final void rule__Link__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1801:1: ( ( ( ( rule__Link__Alternatives_3_0_1 ) ) ( ( rule__Link__Alternatives_3_0_1 )* ) ) )
            // InternalMyDsl.g:1802:1: ( ( ( rule__Link__Alternatives_3_0_1 ) ) ( ( rule__Link__Alternatives_3_0_1 )* ) )
            {
            // InternalMyDsl.g:1802:1: ( ( ( rule__Link__Alternatives_3_0_1 ) ) ( ( rule__Link__Alternatives_3_0_1 )* ) )
            // InternalMyDsl.g:1803:2: ( ( rule__Link__Alternatives_3_0_1 ) ) ( ( rule__Link__Alternatives_3_0_1 )* )
            {
            // InternalMyDsl.g:1803:2: ( ( rule__Link__Alternatives_3_0_1 ) )
            // InternalMyDsl.g:1804:3: ( rule__Link__Alternatives_3_0_1 )
            {
             before(grammarAccess.getLinkAccess().getAlternatives_3_0_1()); 
            // InternalMyDsl.g:1805:3: ( rule__Link__Alternatives_3_0_1 )
            // InternalMyDsl.g:1805:4: rule__Link__Alternatives_3_0_1
            {
            pushFollow(FOLLOW_10);
            rule__Link__Alternatives_3_0_1();

            state._fsp--;


            }

             after(grammarAccess.getLinkAccess().getAlternatives_3_0_1()); 

            }

            // InternalMyDsl.g:1808:2: ( ( rule__Link__Alternatives_3_0_1 )* )
            // InternalMyDsl.g:1809:3: ( rule__Link__Alternatives_3_0_1 )*
            {
             before(grammarAccess.getLinkAccess().getAlternatives_3_0_1()); 
            // InternalMyDsl.g:1810:3: ( rule__Link__Alternatives_3_0_1 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==26||LA18_0==34||LA18_0==46) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMyDsl.g:1810:4: rule__Link__Alternatives_3_0_1
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

        }
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
    // InternalMyDsl.g:1820:1: rule__Link__Group_3_1__0 : rule__Link__Group_3_1__0__Impl rule__Link__Group_3_1__1 ;
    public final void rule__Link__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1824:1: ( rule__Link__Group_3_1__0__Impl rule__Link__Group_3_1__1 )
            // InternalMyDsl.g:1825:2: rule__Link__Group_3_1__0__Impl rule__Link__Group_3_1__1
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
    // InternalMyDsl.g:1832:1: rule__Link__Group_3_1__0__Impl : ( 'reuse' ) ;
    public final void rule__Link__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1836:1: ( ( 'reuse' ) )
            // InternalMyDsl.g:1837:1: ( 'reuse' )
            {
            // InternalMyDsl.g:1837:1: ( 'reuse' )
            // InternalMyDsl.g:1838:2: 'reuse'
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
    // InternalMyDsl.g:1847:1: rule__Link__Group_3_1__1 : rule__Link__Group_3_1__1__Impl rule__Link__Group_3_1__2 ;
    public final void rule__Link__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1851:1: ( rule__Link__Group_3_1__1__Impl rule__Link__Group_3_1__2 )
            // InternalMyDsl.g:1852:2: rule__Link__Group_3_1__1__Impl rule__Link__Group_3_1__2
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
    // InternalMyDsl.g:1859:1: rule__Link__Group_3_1__1__Impl : ( ( rule__Link__LinkAssignment_3_1_1 ) ) ;
    public final void rule__Link__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1863:1: ( ( ( rule__Link__LinkAssignment_3_1_1 ) ) )
            // InternalMyDsl.g:1864:1: ( ( rule__Link__LinkAssignment_3_1_1 ) )
            {
            // InternalMyDsl.g:1864:1: ( ( rule__Link__LinkAssignment_3_1_1 ) )
            // InternalMyDsl.g:1865:2: ( rule__Link__LinkAssignment_3_1_1 )
            {
             before(grammarAccess.getLinkAccess().getLinkAssignment_3_1_1()); 
            // InternalMyDsl.g:1866:2: ( rule__Link__LinkAssignment_3_1_1 )
            // InternalMyDsl.g:1866:3: rule__Link__LinkAssignment_3_1_1
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
    // InternalMyDsl.g:1874:1: rule__Link__Group_3_1__2 : rule__Link__Group_3_1__2__Impl ;
    public final void rule__Link__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1878:1: ( rule__Link__Group_3_1__2__Impl )
            // InternalMyDsl.g:1879:2: rule__Link__Group_3_1__2__Impl
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
    // InternalMyDsl.g:1885:1: rule__Link__Group_3_1__2__Impl : ( ( rule__Link__ReuseAssignment_3_1_2 )? ) ;
    public final void rule__Link__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1889:1: ( ( ( rule__Link__ReuseAssignment_3_1_2 )? ) )
            // InternalMyDsl.g:1890:1: ( ( rule__Link__ReuseAssignment_3_1_2 )? )
            {
            // InternalMyDsl.g:1890:1: ( ( rule__Link__ReuseAssignment_3_1_2 )? )
            // InternalMyDsl.g:1891:2: ( rule__Link__ReuseAssignment_3_1_2 )?
            {
             before(grammarAccess.getLinkAccess().getReuseAssignment_3_1_2()); 
            // InternalMyDsl.g:1892:2: ( rule__Link__ReuseAssignment_3_1_2 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=22 && LA19_0<=23)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyDsl.g:1892:3: rule__Link__ReuseAssignment_3_1_2
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


    // $ANTLR start "rule__Reuse__Group_0__0"
    // InternalMyDsl.g:1901:1: rule__Reuse__Group_0__0 : rule__Reuse__Group_0__0__Impl rule__Reuse__Group_0__1 ;
    public final void rule__Reuse__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1905:1: ( rule__Reuse__Group_0__0__Impl rule__Reuse__Group_0__1 )
            // InternalMyDsl.g:1906:2: rule__Reuse__Group_0__0__Impl rule__Reuse__Group_0__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:1913:1: rule__Reuse__Group_0__0__Impl : ( () ) ;
    public final void rule__Reuse__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1917:1: ( ( () ) )
            // InternalMyDsl.g:1918:1: ( () )
            {
            // InternalMyDsl.g:1918:1: ( () )
            // InternalMyDsl.g:1919:2: ()
            {
             before(grammarAccess.getReuseAccess().getReuseAction_0_0()); 
            // InternalMyDsl.g:1920:2: ()
            // InternalMyDsl.g:1920:3: 
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
    // InternalMyDsl.g:1928:1: rule__Reuse__Group_0__1 : rule__Reuse__Group_0__1__Impl rule__Reuse__Group_0__2 ;
    public final void rule__Reuse__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1932:1: ( rule__Reuse__Group_0__1__Impl rule__Reuse__Group_0__2 )
            // InternalMyDsl.g:1933:2: rule__Reuse__Group_0__1__Impl rule__Reuse__Group_0__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalMyDsl.g:1940:1: rule__Reuse__Group_0__1__Impl : ( 'add' ) ;
    public final void rule__Reuse__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1944:1: ( ( 'add' ) )
            // InternalMyDsl.g:1945:1: ( 'add' )
            {
            // InternalMyDsl.g:1945:1: ( 'add' )
            // InternalMyDsl.g:1946:2: 'add'
            {
             before(grammarAccess.getReuseAccess().getAddKeyword_0_1()); 
            match(input,22,FOLLOW_2); 
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
    // InternalMyDsl.g:1955:1: rule__Reuse__Group_0__2 : rule__Reuse__Group_0__2__Impl ;
    public final void rule__Reuse__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1959:1: ( rule__Reuse__Group_0__2__Impl )
            // InternalMyDsl.g:1960:2: rule__Reuse__Group_0__2__Impl
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
    // InternalMyDsl.g:1966:1: rule__Reuse__Group_0__2__Impl : ( ( rule__Reuse__AddAssignment_0_2 ) ) ;
    public final void rule__Reuse__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1970:1: ( ( ( rule__Reuse__AddAssignment_0_2 ) ) )
            // InternalMyDsl.g:1971:1: ( ( rule__Reuse__AddAssignment_0_2 ) )
            {
            // InternalMyDsl.g:1971:1: ( ( rule__Reuse__AddAssignment_0_2 ) )
            // InternalMyDsl.g:1972:2: ( rule__Reuse__AddAssignment_0_2 )
            {
             before(grammarAccess.getReuseAccess().getAddAssignment_0_2()); 
            // InternalMyDsl.g:1973:2: ( rule__Reuse__AddAssignment_0_2 )
            // InternalMyDsl.g:1973:3: rule__Reuse__AddAssignment_0_2
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
    // InternalMyDsl.g:1982:1: rule__Reuse__Group_1__0 : rule__Reuse__Group_1__0__Impl rule__Reuse__Group_1__1 ;
    public final void rule__Reuse__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1986:1: ( rule__Reuse__Group_1__0__Impl rule__Reuse__Group_1__1 )
            // InternalMyDsl.g:1987:2: rule__Reuse__Group_1__0__Impl rule__Reuse__Group_1__1
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
    // InternalMyDsl.g:1994:1: rule__Reuse__Group_1__0__Impl : ( 'edit2' ) ;
    public final void rule__Reuse__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1998:1: ( ( 'edit2' ) )
            // InternalMyDsl.g:1999:1: ( 'edit2' )
            {
            // InternalMyDsl.g:1999:1: ( 'edit2' )
            // InternalMyDsl.g:2000:2: 'edit2'
            {
             before(grammarAccess.getReuseAccess().getEdit2Keyword_1_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalMyDsl.g:2009:1: rule__Reuse__Group_1__1 : rule__Reuse__Group_1__1__Impl ;
    public final void rule__Reuse__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2013:1: ( rule__Reuse__Group_1__1__Impl )
            // InternalMyDsl.g:2014:2: rule__Reuse__Group_1__1__Impl
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
    // InternalMyDsl.g:2020:1: rule__Reuse__Group_1__1__Impl : ( ( rule__Reuse__EditAssignment_1_1 ) ) ;
    public final void rule__Reuse__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2024:1: ( ( ( rule__Reuse__EditAssignment_1_1 ) ) )
            // InternalMyDsl.g:2025:1: ( ( rule__Reuse__EditAssignment_1_1 ) )
            {
            // InternalMyDsl.g:2025:1: ( ( rule__Reuse__EditAssignment_1_1 ) )
            // InternalMyDsl.g:2026:2: ( rule__Reuse__EditAssignment_1_1 )
            {
             before(grammarAccess.getReuseAccess().getEditAssignment_1_1()); 
            // InternalMyDsl.g:2027:2: ( rule__Reuse__EditAssignment_1_1 )
            // InternalMyDsl.g:2027:3: rule__Reuse__EditAssignment_1_1
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
    // InternalMyDsl.g:2036:1: rule__AssignNewValue__Group__0 : rule__AssignNewValue__Group__0__Impl rule__AssignNewValue__Group__1 ;
    public final void rule__AssignNewValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2040:1: ( rule__AssignNewValue__Group__0__Impl rule__AssignNewValue__Group__1 )
            // InternalMyDsl.g:2041:2: rule__AssignNewValue__Group__0__Impl rule__AssignNewValue__Group__1
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
    // InternalMyDsl.g:2048:1: rule__AssignNewValue__Group__0__Impl : ( () ) ;
    public final void rule__AssignNewValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2052:1: ( ( () ) )
            // InternalMyDsl.g:2053:1: ( () )
            {
            // InternalMyDsl.g:2053:1: ( () )
            // InternalMyDsl.g:2054:2: ()
            {
             before(grammarAccess.getAssignNewValueAccess().getAssignNewValueAction_0()); 
            // InternalMyDsl.g:2055:2: ()
            // InternalMyDsl.g:2055:3: 
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
    // InternalMyDsl.g:2063:1: rule__AssignNewValue__Group__1 : rule__AssignNewValue__Group__1__Impl rule__AssignNewValue__Group__2 ;
    public final void rule__AssignNewValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2067:1: ( rule__AssignNewValue__Group__1__Impl rule__AssignNewValue__Group__2 )
            // InternalMyDsl.g:2068:2: rule__AssignNewValue__Group__1__Impl rule__AssignNewValue__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalMyDsl.g:2075:1: rule__AssignNewValue__Group__1__Impl : ( ( rule__AssignNewValue__GetRefAssignment_1 ) ) ;
    public final void rule__AssignNewValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2079:1: ( ( ( rule__AssignNewValue__GetRefAssignment_1 ) ) )
            // InternalMyDsl.g:2080:1: ( ( rule__AssignNewValue__GetRefAssignment_1 ) )
            {
            // InternalMyDsl.g:2080:1: ( ( rule__AssignNewValue__GetRefAssignment_1 ) )
            // InternalMyDsl.g:2081:2: ( rule__AssignNewValue__GetRefAssignment_1 )
            {
             before(grammarAccess.getAssignNewValueAccess().getGetRefAssignment_1()); 
            // InternalMyDsl.g:2082:2: ( rule__AssignNewValue__GetRefAssignment_1 )
            // InternalMyDsl.g:2082:3: rule__AssignNewValue__GetRefAssignment_1
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
    // InternalMyDsl.g:2090:1: rule__AssignNewValue__Group__2 : rule__AssignNewValue__Group__2__Impl rule__AssignNewValue__Group__3 ;
    public final void rule__AssignNewValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2094:1: ( rule__AssignNewValue__Group__2__Impl rule__AssignNewValue__Group__3 )
            // InternalMyDsl.g:2095:2: rule__AssignNewValue__Group__2__Impl rule__AssignNewValue__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyDsl.g:2102:1: rule__AssignNewValue__Group__2__Impl : ( '=' ) ;
    public final void rule__AssignNewValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2106:1: ( ( '=' ) )
            // InternalMyDsl.g:2107:1: ( '=' )
            {
            // InternalMyDsl.g:2107:1: ( '=' )
            // InternalMyDsl.g:2108:2: '='
            {
             before(grammarAccess.getAssignNewValueAccess().getEqualsSignKeyword_2()); 
            match(input,24,FOLLOW_2); 
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
    // InternalMyDsl.g:2117:1: rule__AssignNewValue__Group__3 : rule__AssignNewValue__Group__3__Impl ;
    public final void rule__AssignNewValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2121:1: ( rule__AssignNewValue__Group__3__Impl )
            // InternalMyDsl.g:2122:2: rule__AssignNewValue__Group__3__Impl
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
    // InternalMyDsl.g:2128:1: rule__AssignNewValue__Group__3__Impl : ( ( rule__AssignNewValue__NewValueAssignment_3 ) ) ;
    public final void rule__AssignNewValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2132:1: ( ( ( rule__AssignNewValue__NewValueAssignment_3 ) ) )
            // InternalMyDsl.g:2133:1: ( ( rule__AssignNewValue__NewValueAssignment_3 ) )
            {
            // InternalMyDsl.g:2133:1: ( ( rule__AssignNewValue__NewValueAssignment_3 ) )
            // InternalMyDsl.g:2134:2: ( rule__AssignNewValue__NewValueAssignment_3 )
            {
             before(grammarAccess.getAssignNewValueAccess().getNewValueAssignment_3()); 
            // InternalMyDsl.g:2135:2: ( rule__AssignNewValue__NewValueAssignment_3 )
            // InternalMyDsl.g:2135:3: rule__AssignNewValue__NewValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__AssignNewValue__NewValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAssignNewValueAccess().getNewValueAssignment_3()); 

            }


            }

        }
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
    // InternalMyDsl.g:2144:1: rule__DotExpression__Group__0 : rule__DotExpression__Group__0__Impl rule__DotExpression__Group__1 ;
    public final void rule__DotExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2148:1: ( rule__DotExpression__Group__0__Impl rule__DotExpression__Group__1 )
            // InternalMyDsl.g:2149:2: rule__DotExpression__Group__0__Impl rule__DotExpression__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalMyDsl.g:2156:1: rule__DotExpression__Group__0__Impl : ( ruleReUsableRef ) ;
    public final void rule__DotExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2160:1: ( ( ruleReUsableRef ) )
            // InternalMyDsl.g:2161:1: ( ruleReUsableRef )
            {
            // InternalMyDsl.g:2161:1: ( ruleReUsableRef )
            // InternalMyDsl.g:2162:2: ruleReUsableRef
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
    // InternalMyDsl.g:2171:1: rule__DotExpression__Group__1 : rule__DotExpression__Group__1__Impl ;
    public final void rule__DotExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2175:1: ( rule__DotExpression__Group__1__Impl )
            // InternalMyDsl.g:2176:2: rule__DotExpression__Group__1__Impl
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
    // InternalMyDsl.g:2182:1: rule__DotExpression__Group__1__Impl : ( ( rule__DotExpression__Group_1__0 )* ) ;
    public final void rule__DotExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2186:1: ( ( ( rule__DotExpression__Group_1__0 )* ) )
            // InternalMyDsl.g:2187:1: ( ( rule__DotExpression__Group_1__0 )* )
            {
            // InternalMyDsl.g:2187:1: ( ( rule__DotExpression__Group_1__0 )* )
            // InternalMyDsl.g:2188:2: ( rule__DotExpression__Group_1__0 )*
            {
             before(grammarAccess.getDotExpressionAccess().getGroup_1()); 
            // InternalMyDsl.g:2189:2: ( rule__DotExpression__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==25) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMyDsl.g:2189:3: rule__DotExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_17);
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
    // InternalMyDsl.g:2198:1: rule__DotExpression__Group_1__0 : rule__DotExpression__Group_1__0__Impl rule__DotExpression__Group_1__1 ;
    public final void rule__DotExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2202:1: ( rule__DotExpression__Group_1__0__Impl rule__DotExpression__Group_1__1 )
            // InternalMyDsl.g:2203:2: rule__DotExpression__Group_1__0__Impl rule__DotExpression__Group_1__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalMyDsl.g:2210:1: rule__DotExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__DotExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2214:1: ( ( () ) )
            // InternalMyDsl.g:2215:1: ( () )
            {
            // InternalMyDsl.g:2215:1: ( () )
            // InternalMyDsl.g:2216:2: ()
            {
             before(grammarAccess.getDotExpressionAccess().getDotExpressionRefAction_1_0()); 
            // InternalMyDsl.g:2217:2: ()
            // InternalMyDsl.g:2217:3: 
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
    // InternalMyDsl.g:2225:1: rule__DotExpression__Group_1__1 : rule__DotExpression__Group_1__1__Impl rule__DotExpression__Group_1__2 ;
    public final void rule__DotExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2229:1: ( rule__DotExpression__Group_1__1__Impl rule__DotExpression__Group_1__2 )
            // InternalMyDsl.g:2230:2: rule__DotExpression__Group_1__1__Impl rule__DotExpression__Group_1__2
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
    // InternalMyDsl.g:2237:1: rule__DotExpression__Group_1__1__Impl : ( '.' ) ;
    public final void rule__DotExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2241:1: ( ( '.' ) )
            // InternalMyDsl.g:2242:1: ( '.' )
            {
            // InternalMyDsl.g:2242:1: ( '.' )
            // InternalMyDsl.g:2243:2: '.'
            {
             before(grammarAccess.getDotExpressionAccess().getFullStopKeyword_1_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalMyDsl.g:2252:1: rule__DotExpression__Group_1__2 : rule__DotExpression__Group_1__2__Impl ;
    public final void rule__DotExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2256:1: ( rule__DotExpression__Group_1__2__Impl )
            // InternalMyDsl.g:2257:2: rule__DotExpression__Group_1__2__Impl
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
    // InternalMyDsl.g:2263:1: rule__DotExpression__Group_1__2__Impl : ( ( rule__DotExpression__TailAssignment_1_2 ) ) ;
    public final void rule__DotExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2267:1: ( ( ( rule__DotExpression__TailAssignment_1_2 ) ) )
            // InternalMyDsl.g:2268:1: ( ( rule__DotExpression__TailAssignment_1_2 ) )
            {
            // InternalMyDsl.g:2268:1: ( ( rule__DotExpression__TailAssignment_1_2 ) )
            // InternalMyDsl.g:2269:2: ( rule__DotExpression__TailAssignment_1_2 )
            {
             before(grammarAccess.getDotExpressionAccess().getTailAssignment_1_2()); 
            // InternalMyDsl.g:2270:2: ( rule__DotExpression__TailAssignment_1_2 )
            // InternalMyDsl.g:2270:3: rule__DotExpression__TailAssignment_1_2
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
    // InternalMyDsl.g:2279:1: rule__ReUsableRef__Group__0 : rule__ReUsableRef__Group__0__Impl rule__ReUsableRef__Group__1 ;
    public final void rule__ReUsableRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2283:1: ( rule__ReUsableRef__Group__0__Impl rule__ReUsableRef__Group__1 )
            // InternalMyDsl.g:2284:2: rule__ReUsableRef__Group__0__Impl rule__ReUsableRef__Group__1
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
    // InternalMyDsl.g:2291:1: rule__ReUsableRef__Group__0__Impl : ( () ) ;
    public final void rule__ReUsableRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2295:1: ( ( () ) )
            // InternalMyDsl.g:2296:1: ( () )
            {
            // InternalMyDsl.g:2296:1: ( () )
            // InternalMyDsl.g:2297:2: ()
            {
             before(grammarAccess.getReUsableRefAccess().getReUsableRefAction_0()); 
            // InternalMyDsl.g:2298:2: ()
            // InternalMyDsl.g:2298:3: 
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
    // InternalMyDsl.g:2306:1: rule__ReUsableRef__Group__1 : rule__ReUsableRef__Group__1__Impl ;
    public final void rule__ReUsableRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2310:1: ( rule__ReUsableRef__Group__1__Impl )
            // InternalMyDsl.g:2311:2: rule__ReUsableRef__Group__1__Impl
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
    // InternalMyDsl.g:2317:1: rule__ReUsableRef__Group__1__Impl : ( ( rule__ReUsableRef__ReuseableAssignment_1 ) ) ;
    public final void rule__ReUsableRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2321:1: ( ( ( rule__ReUsableRef__ReuseableAssignment_1 ) ) )
            // InternalMyDsl.g:2322:1: ( ( rule__ReUsableRef__ReuseableAssignment_1 ) )
            {
            // InternalMyDsl.g:2322:1: ( ( rule__ReUsableRef__ReuseableAssignment_1 ) )
            // InternalMyDsl.g:2323:2: ( rule__ReUsableRef__ReuseableAssignment_1 )
            {
             before(grammarAccess.getReUsableRefAccess().getReuseableAssignment_1()); 
            // InternalMyDsl.g:2324:2: ( rule__ReUsableRef__ReuseableAssignment_1 )
            // InternalMyDsl.g:2324:3: rule__ReUsableRef__ReuseableAssignment_1
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
    // InternalMyDsl.g:2333:1: rule__Inertial__Group__0 : rule__Inertial__Group__0__Impl rule__Inertial__Group__1 ;
    public final void rule__Inertial__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2337:1: ( rule__Inertial__Group__0__Impl rule__Inertial__Group__1 )
            // InternalMyDsl.g:2338:2: rule__Inertial__Group__0__Impl rule__Inertial__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalMyDsl.g:2345:1: rule__Inertial__Group__0__Impl : ( () ) ;
    public final void rule__Inertial__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2349:1: ( ( () ) )
            // InternalMyDsl.g:2350:1: ( () )
            {
            // InternalMyDsl.g:2350:1: ( () )
            // InternalMyDsl.g:2351:2: ()
            {
             before(grammarAccess.getInertialAccess().getInertialAction_0()); 
            // InternalMyDsl.g:2352:2: ()
            // InternalMyDsl.g:2352:3: 
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
    // InternalMyDsl.g:2360:1: rule__Inertial__Group__1 : rule__Inertial__Group__1__Impl rule__Inertial__Group__2 ;
    public final void rule__Inertial__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2364:1: ( rule__Inertial__Group__1__Impl rule__Inertial__Group__2 )
            // InternalMyDsl.g:2365:2: rule__Inertial__Group__1__Impl rule__Inertial__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyDsl.g:2372:1: rule__Inertial__Group__1__Impl : ( 'Inertial' ) ;
    public final void rule__Inertial__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2376:1: ( ( 'Inertial' ) )
            // InternalMyDsl.g:2377:1: ( 'Inertial' )
            {
            // InternalMyDsl.g:2377:1: ( 'Inertial' )
            // InternalMyDsl.g:2378:2: 'Inertial'
            {
             before(grammarAccess.getInertialAccess().getInertialKeyword_1()); 
            match(input,26,FOLLOW_2); 
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
    // InternalMyDsl.g:2387:1: rule__Inertial__Group__2 : rule__Inertial__Group__2__Impl rule__Inertial__Group__3 ;
    public final void rule__Inertial__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2391:1: ( rule__Inertial__Group__2__Impl rule__Inertial__Group__3 )
            // InternalMyDsl.g:2392:2: rule__Inertial__Group__2__Impl rule__Inertial__Group__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyDsl.g:2399:1: rule__Inertial__Group__2__Impl : ( ( rule__Inertial__NameAssignment_2 )? ) ;
    public final void rule__Inertial__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2403:1: ( ( ( rule__Inertial__NameAssignment_2 )? ) )
            // InternalMyDsl.g:2404:1: ( ( rule__Inertial__NameAssignment_2 )? )
            {
            // InternalMyDsl.g:2404:1: ( ( rule__Inertial__NameAssignment_2 )? )
            // InternalMyDsl.g:2405:2: ( rule__Inertial__NameAssignment_2 )?
            {
             before(grammarAccess.getInertialAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:2406:2: ( rule__Inertial__NameAssignment_2 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMyDsl.g:2406:3: rule__Inertial__NameAssignment_2
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
    // InternalMyDsl.g:2414:1: rule__Inertial__Group__3 : rule__Inertial__Group__3__Impl rule__Inertial__Group__4 ;
    public final void rule__Inertial__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2418:1: ( rule__Inertial__Group__3__Impl rule__Inertial__Group__4 )
            // InternalMyDsl.g:2419:2: rule__Inertial__Group__3__Impl rule__Inertial__Group__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:2426:1: rule__Inertial__Group__3__Impl : ( ( rule__Inertial__InertiaAssignment_3 ) ) ;
    public final void rule__Inertial__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2430:1: ( ( ( rule__Inertial__InertiaAssignment_3 ) ) )
            // InternalMyDsl.g:2431:1: ( ( rule__Inertial__InertiaAssignment_3 ) )
            {
            // InternalMyDsl.g:2431:1: ( ( rule__Inertial__InertiaAssignment_3 ) )
            // InternalMyDsl.g:2432:2: ( rule__Inertial__InertiaAssignment_3 )
            {
             before(grammarAccess.getInertialAccess().getInertiaAssignment_3()); 
            // InternalMyDsl.g:2433:2: ( rule__Inertial__InertiaAssignment_3 )
            // InternalMyDsl.g:2433:3: rule__Inertial__InertiaAssignment_3
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
    // InternalMyDsl.g:2441:1: rule__Inertial__Group__4 : rule__Inertial__Group__4__Impl rule__Inertial__Group__5 ;
    public final void rule__Inertial__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2445:1: ( rule__Inertial__Group__4__Impl rule__Inertial__Group__5 )
            // InternalMyDsl.g:2446:2: rule__Inertial__Group__4__Impl rule__Inertial__Group__5
            {
            pushFollow(FOLLOW_21);
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
    // InternalMyDsl.g:2453:1: rule__Inertial__Group__4__Impl : ( ( rule__Inertial__MassAssignment_4 ) ) ;
    public final void rule__Inertial__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2457:1: ( ( ( rule__Inertial__MassAssignment_4 ) ) )
            // InternalMyDsl.g:2458:1: ( ( rule__Inertial__MassAssignment_4 ) )
            {
            // InternalMyDsl.g:2458:1: ( ( rule__Inertial__MassAssignment_4 ) )
            // InternalMyDsl.g:2459:2: ( rule__Inertial__MassAssignment_4 )
            {
             before(grammarAccess.getInertialAccess().getMassAssignment_4()); 
            // InternalMyDsl.g:2460:2: ( rule__Inertial__MassAssignment_4 )
            // InternalMyDsl.g:2460:3: rule__Inertial__MassAssignment_4
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
    // InternalMyDsl.g:2468:1: rule__Inertial__Group__5 : rule__Inertial__Group__5__Impl ;
    public final void rule__Inertial__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2472:1: ( rule__Inertial__Group__5__Impl )
            // InternalMyDsl.g:2473:2: rule__Inertial__Group__5__Impl
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
    // InternalMyDsl.g:2479:1: rule__Inertial__Group__5__Impl : ( ( rule__Inertial__OriginAssignment_5 )? ) ;
    public final void rule__Inertial__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2483:1: ( ( ( rule__Inertial__OriginAssignment_5 )? ) )
            // InternalMyDsl.g:2484:1: ( ( rule__Inertial__OriginAssignment_5 )? )
            {
            // InternalMyDsl.g:2484:1: ( ( rule__Inertial__OriginAssignment_5 )? )
            // InternalMyDsl.g:2485:2: ( rule__Inertial__OriginAssignment_5 )?
            {
             before(grammarAccess.getInertialAccess().getOriginAssignment_5()); 
            // InternalMyDsl.g:2486:2: ( rule__Inertial__OriginAssignment_5 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==37) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMyDsl.g:2486:3: rule__Inertial__OriginAssignment_5
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
    // InternalMyDsl.g:2495:1: rule__Inertia__Group__0 : rule__Inertia__Group__0__Impl rule__Inertia__Group__1 ;
    public final void rule__Inertia__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2499:1: ( rule__Inertia__Group__0__Impl rule__Inertia__Group__1 )
            // InternalMyDsl.g:2500:2: rule__Inertia__Group__0__Impl rule__Inertia__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyDsl.g:2507:1: rule__Inertia__Group__0__Impl : ( () ) ;
    public final void rule__Inertia__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2511:1: ( ( () ) )
            // InternalMyDsl.g:2512:1: ( () )
            {
            // InternalMyDsl.g:2512:1: ( () )
            // InternalMyDsl.g:2513:2: ()
            {
             before(grammarAccess.getInertiaAccess().getInertiaAction_0()); 
            // InternalMyDsl.g:2514:2: ()
            // InternalMyDsl.g:2514:3: 
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
    // InternalMyDsl.g:2522:1: rule__Inertia__Group__1 : rule__Inertia__Group__1__Impl rule__Inertia__Group__2 ;
    public final void rule__Inertia__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2526:1: ( rule__Inertia__Group__1__Impl rule__Inertia__Group__2 )
            // InternalMyDsl.g:2527:2: rule__Inertia__Group__1__Impl rule__Inertia__Group__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalMyDsl.g:2534:1: rule__Inertia__Group__1__Impl : ( 'Inertia' ) ;
    public final void rule__Inertia__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2538:1: ( ( 'Inertia' ) )
            // InternalMyDsl.g:2539:1: ( 'Inertia' )
            {
            // InternalMyDsl.g:2539:1: ( 'Inertia' )
            // InternalMyDsl.g:2540:2: 'Inertia'
            {
             before(grammarAccess.getInertiaAccess().getInertiaKeyword_1()); 
            match(input,27,FOLLOW_2); 
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
    // InternalMyDsl.g:2549:1: rule__Inertia__Group__2 : rule__Inertia__Group__2__Impl rule__Inertia__Group__3 ;
    public final void rule__Inertia__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2553:1: ( rule__Inertia__Group__2__Impl rule__Inertia__Group__3 )
            // InternalMyDsl.g:2554:2: rule__Inertia__Group__2__Impl rule__Inertia__Group__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalMyDsl.g:2561:1: rule__Inertia__Group__2__Impl : ( ( rule__Inertia__NameAssignment_2 )? ) ;
    public final void rule__Inertia__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2565:1: ( ( ( rule__Inertia__NameAssignment_2 )? ) )
            // InternalMyDsl.g:2566:1: ( ( rule__Inertia__NameAssignment_2 )? )
            {
            // InternalMyDsl.g:2566:1: ( ( rule__Inertia__NameAssignment_2 )? )
            // InternalMyDsl.g:2567:2: ( rule__Inertia__NameAssignment_2 )?
            {
             before(grammarAccess.getInertiaAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:2568:2: ( rule__Inertia__NameAssignment_2 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMyDsl.g:2568:3: rule__Inertia__NameAssignment_2
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
    // InternalMyDsl.g:2576:1: rule__Inertia__Group__3 : rule__Inertia__Group__3__Impl rule__Inertia__Group__4 ;
    public final void rule__Inertia__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2580:1: ( rule__Inertia__Group__3__Impl rule__Inertia__Group__4 )
            // InternalMyDsl.g:2581:2: rule__Inertia__Group__3__Impl rule__Inertia__Group__4
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyDsl.g:2588:1: rule__Inertia__Group__3__Impl : ( 'ixx' ) ;
    public final void rule__Inertia__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2592:1: ( ( 'ixx' ) )
            // InternalMyDsl.g:2593:1: ( 'ixx' )
            {
            // InternalMyDsl.g:2593:1: ( 'ixx' )
            // InternalMyDsl.g:2594:2: 'ixx'
            {
             before(grammarAccess.getInertiaAccess().getIxxKeyword_3()); 
            match(input,28,FOLLOW_2); 
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
    // InternalMyDsl.g:2603:1: rule__Inertia__Group__4 : rule__Inertia__Group__4__Impl rule__Inertia__Group__5 ;
    public final void rule__Inertia__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2607:1: ( rule__Inertia__Group__4__Impl rule__Inertia__Group__5 )
            // InternalMyDsl.g:2608:2: rule__Inertia__Group__4__Impl rule__Inertia__Group__5
            {
            pushFollow(FOLLOW_24);
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
    // InternalMyDsl.g:2615:1: rule__Inertia__Group__4__Impl : ( ( rule__Inertia__IxxAssignment_4 ) ) ;
    public final void rule__Inertia__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2619:1: ( ( ( rule__Inertia__IxxAssignment_4 ) ) )
            // InternalMyDsl.g:2620:1: ( ( rule__Inertia__IxxAssignment_4 ) )
            {
            // InternalMyDsl.g:2620:1: ( ( rule__Inertia__IxxAssignment_4 ) )
            // InternalMyDsl.g:2621:2: ( rule__Inertia__IxxAssignment_4 )
            {
             before(grammarAccess.getInertiaAccess().getIxxAssignment_4()); 
            // InternalMyDsl.g:2622:2: ( rule__Inertia__IxxAssignment_4 )
            // InternalMyDsl.g:2622:3: rule__Inertia__IxxAssignment_4
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
    // InternalMyDsl.g:2630:1: rule__Inertia__Group__5 : rule__Inertia__Group__5__Impl rule__Inertia__Group__6 ;
    public final void rule__Inertia__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2634:1: ( rule__Inertia__Group__5__Impl rule__Inertia__Group__6 )
            // InternalMyDsl.g:2635:2: rule__Inertia__Group__5__Impl rule__Inertia__Group__6
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyDsl.g:2642:1: rule__Inertia__Group__5__Impl : ( 'ixy' ) ;
    public final void rule__Inertia__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2646:1: ( ( 'ixy' ) )
            // InternalMyDsl.g:2647:1: ( 'ixy' )
            {
            // InternalMyDsl.g:2647:1: ( 'ixy' )
            // InternalMyDsl.g:2648:2: 'ixy'
            {
             before(grammarAccess.getInertiaAccess().getIxyKeyword_5()); 
            match(input,29,FOLLOW_2); 
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
    // InternalMyDsl.g:2657:1: rule__Inertia__Group__6 : rule__Inertia__Group__6__Impl rule__Inertia__Group__7 ;
    public final void rule__Inertia__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2661:1: ( rule__Inertia__Group__6__Impl rule__Inertia__Group__7 )
            // InternalMyDsl.g:2662:2: rule__Inertia__Group__6__Impl rule__Inertia__Group__7
            {
            pushFollow(FOLLOW_25);
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
    // InternalMyDsl.g:2669:1: rule__Inertia__Group__6__Impl : ( ( rule__Inertia__IxyAssignment_6 ) ) ;
    public final void rule__Inertia__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2673:1: ( ( ( rule__Inertia__IxyAssignment_6 ) ) )
            // InternalMyDsl.g:2674:1: ( ( rule__Inertia__IxyAssignment_6 ) )
            {
            // InternalMyDsl.g:2674:1: ( ( rule__Inertia__IxyAssignment_6 ) )
            // InternalMyDsl.g:2675:2: ( rule__Inertia__IxyAssignment_6 )
            {
             before(grammarAccess.getInertiaAccess().getIxyAssignment_6()); 
            // InternalMyDsl.g:2676:2: ( rule__Inertia__IxyAssignment_6 )
            // InternalMyDsl.g:2676:3: rule__Inertia__IxyAssignment_6
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
    // InternalMyDsl.g:2684:1: rule__Inertia__Group__7 : rule__Inertia__Group__7__Impl rule__Inertia__Group__8 ;
    public final void rule__Inertia__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2688:1: ( rule__Inertia__Group__7__Impl rule__Inertia__Group__8 )
            // InternalMyDsl.g:2689:2: rule__Inertia__Group__7__Impl rule__Inertia__Group__8
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyDsl.g:2696:1: rule__Inertia__Group__7__Impl : ( 'ixz' ) ;
    public final void rule__Inertia__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2700:1: ( ( 'ixz' ) )
            // InternalMyDsl.g:2701:1: ( 'ixz' )
            {
            // InternalMyDsl.g:2701:1: ( 'ixz' )
            // InternalMyDsl.g:2702:2: 'ixz'
            {
             before(grammarAccess.getInertiaAccess().getIxzKeyword_7()); 
            match(input,30,FOLLOW_2); 
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
    // InternalMyDsl.g:2711:1: rule__Inertia__Group__8 : rule__Inertia__Group__8__Impl rule__Inertia__Group__9 ;
    public final void rule__Inertia__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2715:1: ( rule__Inertia__Group__8__Impl rule__Inertia__Group__9 )
            // InternalMyDsl.g:2716:2: rule__Inertia__Group__8__Impl rule__Inertia__Group__9
            {
            pushFollow(FOLLOW_26);
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
    // InternalMyDsl.g:2723:1: rule__Inertia__Group__8__Impl : ( ( rule__Inertia__IxzAssignment_8 ) ) ;
    public final void rule__Inertia__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2727:1: ( ( ( rule__Inertia__IxzAssignment_8 ) ) )
            // InternalMyDsl.g:2728:1: ( ( rule__Inertia__IxzAssignment_8 ) )
            {
            // InternalMyDsl.g:2728:1: ( ( rule__Inertia__IxzAssignment_8 ) )
            // InternalMyDsl.g:2729:2: ( rule__Inertia__IxzAssignment_8 )
            {
             before(grammarAccess.getInertiaAccess().getIxzAssignment_8()); 
            // InternalMyDsl.g:2730:2: ( rule__Inertia__IxzAssignment_8 )
            // InternalMyDsl.g:2730:3: rule__Inertia__IxzAssignment_8
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
    // InternalMyDsl.g:2738:1: rule__Inertia__Group__9 : rule__Inertia__Group__9__Impl rule__Inertia__Group__10 ;
    public final void rule__Inertia__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2742:1: ( rule__Inertia__Group__9__Impl rule__Inertia__Group__10 )
            // InternalMyDsl.g:2743:2: rule__Inertia__Group__9__Impl rule__Inertia__Group__10
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyDsl.g:2750:1: rule__Inertia__Group__9__Impl : ( 'iyy' ) ;
    public final void rule__Inertia__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2754:1: ( ( 'iyy' ) )
            // InternalMyDsl.g:2755:1: ( 'iyy' )
            {
            // InternalMyDsl.g:2755:1: ( 'iyy' )
            // InternalMyDsl.g:2756:2: 'iyy'
            {
             before(grammarAccess.getInertiaAccess().getIyyKeyword_9()); 
            match(input,31,FOLLOW_2); 
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
    // InternalMyDsl.g:2765:1: rule__Inertia__Group__10 : rule__Inertia__Group__10__Impl rule__Inertia__Group__11 ;
    public final void rule__Inertia__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2769:1: ( rule__Inertia__Group__10__Impl rule__Inertia__Group__11 )
            // InternalMyDsl.g:2770:2: rule__Inertia__Group__10__Impl rule__Inertia__Group__11
            {
            pushFollow(FOLLOW_27);
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
    // InternalMyDsl.g:2777:1: rule__Inertia__Group__10__Impl : ( ( rule__Inertia__IyyAssignment_10 ) ) ;
    public final void rule__Inertia__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2781:1: ( ( ( rule__Inertia__IyyAssignment_10 ) ) )
            // InternalMyDsl.g:2782:1: ( ( rule__Inertia__IyyAssignment_10 ) )
            {
            // InternalMyDsl.g:2782:1: ( ( rule__Inertia__IyyAssignment_10 ) )
            // InternalMyDsl.g:2783:2: ( rule__Inertia__IyyAssignment_10 )
            {
             before(grammarAccess.getInertiaAccess().getIyyAssignment_10()); 
            // InternalMyDsl.g:2784:2: ( rule__Inertia__IyyAssignment_10 )
            // InternalMyDsl.g:2784:3: rule__Inertia__IyyAssignment_10
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
    // InternalMyDsl.g:2792:1: rule__Inertia__Group__11 : rule__Inertia__Group__11__Impl rule__Inertia__Group__12 ;
    public final void rule__Inertia__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2796:1: ( rule__Inertia__Group__11__Impl rule__Inertia__Group__12 )
            // InternalMyDsl.g:2797:2: rule__Inertia__Group__11__Impl rule__Inertia__Group__12
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyDsl.g:2804:1: rule__Inertia__Group__11__Impl : ( 'iyz' ) ;
    public final void rule__Inertia__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2808:1: ( ( 'iyz' ) )
            // InternalMyDsl.g:2809:1: ( 'iyz' )
            {
            // InternalMyDsl.g:2809:1: ( 'iyz' )
            // InternalMyDsl.g:2810:2: 'iyz'
            {
             before(grammarAccess.getInertiaAccess().getIyzKeyword_11()); 
            match(input,32,FOLLOW_2); 
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
    // InternalMyDsl.g:2819:1: rule__Inertia__Group__12 : rule__Inertia__Group__12__Impl rule__Inertia__Group__13 ;
    public final void rule__Inertia__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2823:1: ( rule__Inertia__Group__12__Impl rule__Inertia__Group__13 )
            // InternalMyDsl.g:2824:2: rule__Inertia__Group__12__Impl rule__Inertia__Group__13
            {
            pushFollow(FOLLOW_28);
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
    // InternalMyDsl.g:2831:1: rule__Inertia__Group__12__Impl : ( ( rule__Inertia__IyzAssignment_12 ) ) ;
    public final void rule__Inertia__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2835:1: ( ( ( rule__Inertia__IyzAssignment_12 ) ) )
            // InternalMyDsl.g:2836:1: ( ( rule__Inertia__IyzAssignment_12 ) )
            {
            // InternalMyDsl.g:2836:1: ( ( rule__Inertia__IyzAssignment_12 ) )
            // InternalMyDsl.g:2837:2: ( rule__Inertia__IyzAssignment_12 )
            {
             before(grammarAccess.getInertiaAccess().getIyzAssignment_12()); 
            // InternalMyDsl.g:2838:2: ( rule__Inertia__IyzAssignment_12 )
            // InternalMyDsl.g:2838:3: rule__Inertia__IyzAssignment_12
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
    // InternalMyDsl.g:2846:1: rule__Inertia__Group__13 : rule__Inertia__Group__13__Impl rule__Inertia__Group__14 ;
    public final void rule__Inertia__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2850:1: ( rule__Inertia__Group__13__Impl rule__Inertia__Group__14 )
            // InternalMyDsl.g:2851:2: rule__Inertia__Group__13__Impl rule__Inertia__Group__14
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyDsl.g:2858:1: rule__Inertia__Group__13__Impl : ( 'izz' ) ;
    public final void rule__Inertia__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2862:1: ( ( 'izz' ) )
            // InternalMyDsl.g:2863:1: ( 'izz' )
            {
            // InternalMyDsl.g:2863:1: ( 'izz' )
            // InternalMyDsl.g:2864:2: 'izz'
            {
             before(grammarAccess.getInertiaAccess().getIzzKeyword_13()); 
            match(input,33,FOLLOW_2); 
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
    // InternalMyDsl.g:2873:1: rule__Inertia__Group__14 : rule__Inertia__Group__14__Impl ;
    public final void rule__Inertia__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2877:1: ( rule__Inertia__Group__14__Impl )
            // InternalMyDsl.g:2878:2: rule__Inertia__Group__14__Impl
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
    // InternalMyDsl.g:2884:1: rule__Inertia__Group__14__Impl : ( ( rule__Inertia__IzzAssignment_14 ) ) ;
    public final void rule__Inertia__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2888:1: ( ( ( rule__Inertia__IzzAssignment_14 ) ) )
            // InternalMyDsl.g:2889:1: ( ( rule__Inertia__IzzAssignment_14 ) )
            {
            // InternalMyDsl.g:2889:1: ( ( rule__Inertia__IzzAssignment_14 ) )
            // InternalMyDsl.g:2890:2: ( rule__Inertia__IzzAssignment_14 )
            {
             before(grammarAccess.getInertiaAccess().getIzzAssignment_14()); 
            // InternalMyDsl.g:2891:2: ( rule__Inertia__IzzAssignment_14 )
            // InternalMyDsl.g:2891:3: rule__Inertia__IzzAssignment_14
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
    // InternalMyDsl.g:2900:1: rule__Visual__Group__0 : rule__Visual__Group__0__Impl rule__Visual__Group__1 ;
    public final void rule__Visual__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2904:1: ( rule__Visual__Group__0__Impl rule__Visual__Group__1 )
            // InternalMyDsl.g:2905:2: rule__Visual__Group__0__Impl rule__Visual__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalMyDsl.g:2912:1: rule__Visual__Group__0__Impl : ( () ) ;
    public final void rule__Visual__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2916:1: ( ( () ) )
            // InternalMyDsl.g:2917:1: ( () )
            {
            // InternalMyDsl.g:2917:1: ( () )
            // InternalMyDsl.g:2918:2: ()
            {
             before(grammarAccess.getVisualAccess().getVisualAction_0()); 
            // InternalMyDsl.g:2919:2: ()
            // InternalMyDsl.g:2919:3: 
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
    // InternalMyDsl.g:2927:1: rule__Visual__Group__1 : rule__Visual__Group__1__Impl rule__Visual__Group__2 ;
    public final void rule__Visual__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2931:1: ( rule__Visual__Group__1__Impl rule__Visual__Group__2 )
            // InternalMyDsl.g:2932:2: rule__Visual__Group__1__Impl rule__Visual__Group__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalMyDsl.g:2939:1: rule__Visual__Group__1__Impl : ( 'Visual' ) ;
    public final void rule__Visual__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2943:1: ( ( 'Visual' ) )
            // InternalMyDsl.g:2944:1: ( 'Visual' )
            {
            // InternalMyDsl.g:2944:1: ( 'Visual' )
            // InternalMyDsl.g:2945:2: 'Visual'
            {
             before(grammarAccess.getVisualAccess().getVisualKeyword_1()); 
            match(input,34,FOLLOW_2); 
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
    // InternalMyDsl.g:2954:1: rule__Visual__Group__2 : rule__Visual__Group__2__Impl rule__Visual__Group__3 ;
    public final void rule__Visual__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2958:1: ( rule__Visual__Group__2__Impl rule__Visual__Group__3 )
            // InternalMyDsl.g:2959:2: rule__Visual__Group__2__Impl rule__Visual__Group__3
            {
            pushFollow(FOLLOW_30);
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
    // InternalMyDsl.g:2966:1: rule__Visual__Group__2__Impl : ( ( rule__Visual__NameAssignment_2 )? ) ;
    public final void rule__Visual__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2970:1: ( ( ( rule__Visual__NameAssignment_2 )? ) )
            // InternalMyDsl.g:2971:1: ( ( rule__Visual__NameAssignment_2 )? )
            {
            // InternalMyDsl.g:2971:1: ( ( rule__Visual__NameAssignment_2 )? )
            // InternalMyDsl.g:2972:2: ( rule__Visual__NameAssignment_2 )?
            {
             before(grammarAccess.getVisualAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:2973:2: ( rule__Visual__NameAssignment_2 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMyDsl.g:2973:3: rule__Visual__NameAssignment_2
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
    // InternalMyDsl.g:2981:1: rule__Visual__Group__3 : rule__Visual__Group__3__Impl rule__Visual__Group__4 ;
    public final void rule__Visual__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2985:1: ( rule__Visual__Group__3__Impl rule__Visual__Group__4 )
            // InternalMyDsl.g:2986:2: rule__Visual__Group__3__Impl rule__Visual__Group__4
            {
            pushFollow(FOLLOW_31);
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
    // InternalMyDsl.g:2993:1: rule__Visual__Group__3__Impl : ( 'Geometry' ) ;
    public final void rule__Visual__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2997:1: ( ( 'Geometry' ) )
            // InternalMyDsl.g:2998:1: ( 'Geometry' )
            {
            // InternalMyDsl.g:2998:1: ( 'Geometry' )
            // InternalMyDsl.g:2999:2: 'Geometry'
            {
             before(grammarAccess.getVisualAccess().getGeometryKeyword_3()); 
            match(input,35,FOLLOW_2); 
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
    // InternalMyDsl.g:3008:1: rule__Visual__Group__4 : rule__Visual__Group__4__Impl rule__Visual__Group__5 ;
    public final void rule__Visual__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3012:1: ( rule__Visual__Group__4__Impl rule__Visual__Group__5 )
            // InternalMyDsl.g:3013:2: rule__Visual__Group__4__Impl rule__Visual__Group__5
            {
            pushFollow(FOLLOW_32);
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
    // InternalMyDsl.g:3020:1: rule__Visual__Group__4__Impl : ( ( ( rule__Visual__GeometryAssignment_4 ) ) ( ( rule__Visual__GeometryAssignment_4 )* ) ) ;
    public final void rule__Visual__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3024:1: ( ( ( ( rule__Visual__GeometryAssignment_4 ) ) ( ( rule__Visual__GeometryAssignment_4 )* ) ) )
            // InternalMyDsl.g:3025:1: ( ( ( rule__Visual__GeometryAssignment_4 ) ) ( ( rule__Visual__GeometryAssignment_4 )* ) )
            {
            // InternalMyDsl.g:3025:1: ( ( ( rule__Visual__GeometryAssignment_4 ) ) ( ( rule__Visual__GeometryAssignment_4 )* ) )
            // InternalMyDsl.g:3026:2: ( ( rule__Visual__GeometryAssignment_4 ) ) ( ( rule__Visual__GeometryAssignment_4 )* )
            {
            // InternalMyDsl.g:3026:2: ( ( rule__Visual__GeometryAssignment_4 ) )
            // InternalMyDsl.g:3027:3: ( rule__Visual__GeometryAssignment_4 )
            {
             before(grammarAccess.getVisualAccess().getGeometryAssignment_4()); 
            // InternalMyDsl.g:3028:3: ( rule__Visual__GeometryAssignment_4 )
            // InternalMyDsl.g:3028:4: rule__Visual__GeometryAssignment_4
            {
            pushFollow(FOLLOW_33);
            rule__Visual__GeometryAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getVisualAccess().getGeometryAssignment_4()); 

            }

            // InternalMyDsl.g:3031:2: ( ( rule__Visual__GeometryAssignment_4 )* )
            // InternalMyDsl.g:3032:3: ( rule__Visual__GeometryAssignment_4 )*
            {
             before(grammarAccess.getVisualAccess().getGeometryAssignment_4()); 
            // InternalMyDsl.g:3033:3: ( rule__Visual__GeometryAssignment_4 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==47||LA25_0==51||LA25_0==53||LA25_0==55) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalMyDsl.g:3033:4: rule__Visual__GeometryAssignment_4
            	    {
            	    pushFollow(FOLLOW_33);
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

        }
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
    // InternalMyDsl.g:3042:1: rule__Visual__Group__5 : rule__Visual__Group__5__Impl rule__Visual__Group__6 ;
    public final void rule__Visual__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3046:1: ( rule__Visual__Group__5__Impl rule__Visual__Group__6 )
            // InternalMyDsl.g:3047:2: rule__Visual__Group__5__Impl rule__Visual__Group__6
            {
            pushFollow(FOLLOW_32);
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
    // InternalMyDsl.g:3054:1: rule__Visual__Group__5__Impl : ( ( rule__Visual__OriginAssignment_5 )? ) ;
    public final void rule__Visual__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3058:1: ( ( ( rule__Visual__OriginAssignment_5 )? ) )
            // InternalMyDsl.g:3059:1: ( ( rule__Visual__OriginAssignment_5 )? )
            {
            // InternalMyDsl.g:3059:1: ( ( rule__Visual__OriginAssignment_5 )? )
            // InternalMyDsl.g:3060:2: ( rule__Visual__OriginAssignment_5 )?
            {
             before(grammarAccess.getVisualAccess().getOriginAssignment_5()); 
            // InternalMyDsl.g:3061:2: ( rule__Visual__OriginAssignment_5 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==37) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMyDsl.g:3061:3: rule__Visual__OriginAssignment_5
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
    // InternalMyDsl.g:3069:1: rule__Visual__Group__6 : rule__Visual__Group__6__Impl ;
    public final void rule__Visual__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3073:1: ( rule__Visual__Group__6__Impl )
            // InternalMyDsl.g:3074:2: rule__Visual__Group__6__Impl
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
    // InternalMyDsl.g:3080:1: rule__Visual__Group__6__Impl : ( ( rule__Visual__Group_6__0 )? ) ;
    public final void rule__Visual__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3084:1: ( ( ( rule__Visual__Group_6__0 )? ) )
            // InternalMyDsl.g:3085:1: ( ( rule__Visual__Group_6__0 )? )
            {
            // InternalMyDsl.g:3085:1: ( ( rule__Visual__Group_6__0 )? )
            // InternalMyDsl.g:3086:2: ( rule__Visual__Group_6__0 )?
            {
             before(grammarAccess.getVisualAccess().getGroup_6()); 
            // InternalMyDsl.g:3087:2: ( rule__Visual__Group_6__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==36) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalMyDsl.g:3087:3: rule__Visual__Group_6__0
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
    // InternalMyDsl.g:3096:1: rule__Visual__Group_6__0 : rule__Visual__Group_6__0__Impl rule__Visual__Group_6__1 ;
    public final void rule__Visual__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3100:1: ( rule__Visual__Group_6__0__Impl rule__Visual__Group_6__1 )
            // InternalMyDsl.g:3101:2: rule__Visual__Group_6__0__Impl rule__Visual__Group_6__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalMyDsl.g:3108:1: rule__Visual__Group_6__0__Impl : ( 'Material' ) ;
    public final void rule__Visual__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3112:1: ( ( 'Material' ) )
            // InternalMyDsl.g:3113:1: ( 'Material' )
            {
            // InternalMyDsl.g:3113:1: ( 'Material' )
            // InternalMyDsl.g:3114:2: 'Material'
            {
             before(grammarAccess.getVisualAccess().getMaterialKeyword_6_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalMyDsl.g:3123:1: rule__Visual__Group_6__1 : rule__Visual__Group_6__1__Impl ;
    public final void rule__Visual__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3127:1: ( rule__Visual__Group_6__1__Impl )
            // InternalMyDsl.g:3128:2: rule__Visual__Group_6__1__Impl
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
    // InternalMyDsl.g:3134:1: rule__Visual__Group_6__1__Impl : ( ( rule__Visual__MaterialAssignment_6_1 ) ) ;
    public final void rule__Visual__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3138:1: ( ( ( rule__Visual__MaterialAssignment_6_1 ) ) )
            // InternalMyDsl.g:3139:1: ( ( rule__Visual__MaterialAssignment_6_1 ) )
            {
            // InternalMyDsl.g:3139:1: ( ( rule__Visual__MaterialAssignment_6_1 ) )
            // InternalMyDsl.g:3140:2: ( rule__Visual__MaterialAssignment_6_1 )
            {
             before(grammarAccess.getVisualAccess().getMaterialAssignment_6_1()); 
            // InternalMyDsl.g:3141:2: ( rule__Visual__MaterialAssignment_6_1 )
            // InternalMyDsl.g:3141:3: rule__Visual__MaterialAssignment_6_1
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
    // InternalMyDsl.g:3150:1: rule__Origin__Group__0 : rule__Origin__Group__0__Impl rule__Origin__Group__1 ;
    public final void rule__Origin__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3154:1: ( rule__Origin__Group__0__Impl rule__Origin__Group__1 )
            // InternalMyDsl.g:3155:2: rule__Origin__Group__0__Impl rule__Origin__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalMyDsl.g:3162:1: rule__Origin__Group__0__Impl : ( () ) ;
    public final void rule__Origin__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3166:1: ( ( () ) )
            // InternalMyDsl.g:3167:1: ( () )
            {
            // InternalMyDsl.g:3167:1: ( () )
            // InternalMyDsl.g:3168:2: ()
            {
             before(grammarAccess.getOriginAccess().getOriginAction_0()); 
            // InternalMyDsl.g:3169:2: ()
            // InternalMyDsl.g:3169:3: 
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
    // InternalMyDsl.g:3177:1: rule__Origin__Group__1 : rule__Origin__Group__1__Impl rule__Origin__Group__2 ;
    public final void rule__Origin__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3181:1: ( rule__Origin__Group__1__Impl rule__Origin__Group__2 )
            // InternalMyDsl.g:3182:2: rule__Origin__Group__1__Impl rule__Origin__Group__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalMyDsl.g:3189:1: rule__Origin__Group__1__Impl : ( 'Origin' ) ;
    public final void rule__Origin__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3193:1: ( ( 'Origin' ) )
            // InternalMyDsl.g:3194:1: ( 'Origin' )
            {
            // InternalMyDsl.g:3194:1: ( 'Origin' )
            // InternalMyDsl.g:3195:2: 'Origin'
            {
             before(grammarAccess.getOriginAccess().getOriginKeyword_1()); 
            match(input,37,FOLLOW_2); 
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
    // InternalMyDsl.g:3204:1: rule__Origin__Group__2 : rule__Origin__Group__2__Impl rule__Origin__Group__3 ;
    public final void rule__Origin__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3208:1: ( rule__Origin__Group__2__Impl rule__Origin__Group__3 )
            // InternalMyDsl.g:3209:2: rule__Origin__Group__2__Impl rule__Origin__Group__3
            {
            pushFollow(FOLLOW_35);
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
    // InternalMyDsl.g:3216:1: rule__Origin__Group__2__Impl : ( ( rule__Origin__NameAssignment_2 )? ) ;
    public final void rule__Origin__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3220:1: ( ( ( rule__Origin__NameAssignment_2 )? ) )
            // InternalMyDsl.g:3221:1: ( ( rule__Origin__NameAssignment_2 )? )
            {
            // InternalMyDsl.g:3221:1: ( ( rule__Origin__NameAssignment_2 )? )
            // InternalMyDsl.g:3222:2: ( rule__Origin__NameAssignment_2 )?
            {
             before(grammarAccess.getOriginAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:3223:2: ( rule__Origin__NameAssignment_2 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_ID) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalMyDsl.g:3223:3: rule__Origin__NameAssignment_2
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
    // InternalMyDsl.g:3231:1: rule__Origin__Group__3 : rule__Origin__Group__3__Impl rule__Origin__Group__4 ;
    public final void rule__Origin__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3235:1: ( rule__Origin__Group__3__Impl rule__Origin__Group__4 )
            // InternalMyDsl.g:3236:2: rule__Origin__Group__3__Impl rule__Origin__Group__4
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyDsl.g:3243:1: rule__Origin__Group__3__Impl : ( 'x' ) ;
    public final void rule__Origin__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3247:1: ( ( 'x' ) )
            // InternalMyDsl.g:3248:1: ( 'x' )
            {
            // InternalMyDsl.g:3248:1: ( 'x' )
            // InternalMyDsl.g:3249:2: 'x'
            {
             before(grammarAccess.getOriginAccess().getXKeyword_3()); 
            match(input,38,FOLLOW_2); 
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
    // InternalMyDsl.g:3258:1: rule__Origin__Group__4 : rule__Origin__Group__4__Impl rule__Origin__Group__5 ;
    public final void rule__Origin__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3262:1: ( rule__Origin__Group__4__Impl rule__Origin__Group__5 )
            // InternalMyDsl.g:3263:2: rule__Origin__Group__4__Impl rule__Origin__Group__5
            {
            pushFollow(FOLLOW_36);
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
    // InternalMyDsl.g:3270:1: rule__Origin__Group__4__Impl : ( ( rule__Origin__XAssignment_4 ) ) ;
    public final void rule__Origin__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3274:1: ( ( ( rule__Origin__XAssignment_4 ) ) )
            // InternalMyDsl.g:3275:1: ( ( rule__Origin__XAssignment_4 ) )
            {
            // InternalMyDsl.g:3275:1: ( ( rule__Origin__XAssignment_4 ) )
            // InternalMyDsl.g:3276:2: ( rule__Origin__XAssignment_4 )
            {
             before(grammarAccess.getOriginAccess().getXAssignment_4()); 
            // InternalMyDsl.g:3277:2: ( rule__Origin__XAssignment_4 )
            // InternalMyDsl.g:3277:3: rule__Origin__XAssignment_4
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
    // InternalMyDsl.g:3285:1: rule__Origin__Group__5 : rule__Origin__Group__5__Impl rule__Origin__Group__6 ;
    public final void rule__Origin__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3289:1: ( rule__Origin__Group__5__Impl rule__Origin__Group__6 )
            // InternalMyDsl.g:3290:2: rule__Origin__Group__5__Impl rule__Origin__Group__6
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyDsl.g:3297:1: rule__Origin__Group__5__Impl : ( 'y' ) ;
    public final void rule__Origin__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3301:1: ( ( 'y' ) )
            // InternalMyDsl.g:3302:1: ( 'y' )
            {
            // InternalMyDsl.g:3302:1: ( 'y' )
            // InternalMyDsl.g:3303:2: 'y'
            {
             before(grammarAccess.getOriginAccess().getYKeyword_5()); 
            match(input,39,FOLLOW_2); 
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
    // InternalMyDsl.g:3312:1: rule__Origin__Group__6 : rule__Origin__Group__6__Impl rule__Origin__Group__7 ;
    public final void rule__Origin__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3316:1: ( rule__Origin__Group__6__Impl rule__Origin__Group__7 )
            // InternalMyDsl.g:3317:2: rule__Origin__Group__6__Impl rule__Origin__Group__7
            {
            pushFollow(FOLLOW_37);
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
    // InternalMyDsl.g:3324:1: rule__Origin__Group__6__Impl : ( ( rule__Origin__YAssignment_6 ) ) ;
    public final void rule__Origin__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3328:1: ( ( ( rule__Origin__YAssignment_6 ) ) )
            // InternalMyDsl.g:3329:1: ( ( rule__Origin__YAssignment_6 ) )
            {
            // InternalMyDsl.g:3329:1: ( ( rule__Origin__YAssignment_6 ) )
            // InternalMyDsl.g:3330:2: ( rule__Origin__YAssignment_6 )
            {
             before(grammarAccess.getOriginAccess().getYAssignment_6()); 
            // InternalMyDsl.g:3331:2: ( rule__Origin__YAssignment_6 )
            // InternalMyDsl.g:3331:3: rule__Origin__YAssignment_6
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
    // InternalMyDsl.g:3339:1: rule__Origin__Group__7 : rule__Origin__Group__7__Impl rule__Origin__Group__8 ;
    public final void rule__Origin__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3343:1: ( rule__Origin__Group__7__Impl rule__Origin__Group__8 )
            // InternalMyDsl.g:3344:2: rule__Origin__Group__7__Impl rule__Origin__Group__8
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyDsl.g:3351:1: rule__Origin__Group__7__Impl : ( 'z' ) ;
    public final void rule__Origin__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3355:1: ( ( 'z' ) )
            // InternalMyDsl.g:3356:1: ( 'z' )
            {
            // InternalMyDsl.g:3356:1: ( 'z' )
            // InternalMyDsl.g:3357:2: 'z'
            {
             before(grammarAccess.getOriginAccess().getZKeyword_7()); 
            match(input,40,FOLLOW_2); 
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
    // InternalMyDsl.g:3366:1: rule__Origin__Group__8 : rule__Origin__Group__8__Impl rule__Origin__Group__9 ;
    public final void rule__Origin__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3370:1: ( rule__Origin__Group__8__Impl rule__Origin__Group__9 )
            // InternalMyDsl.g:3371:2: rule__Origin__Group__8__Impl rule__Origin__Group__9
            {
            pushFollow(FOLLOW_38);
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
    // InternalMyDsl.g:3378:1: rule__Origin__Group__8__Impl : ( ( rule__Origin__ZAssignment_8 ) ) ;
    public final void rule__Origin__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3382:1: ( ( ( rule__Origin__ZAssignment_8 ) ) )
            // InternalMyDsl.g:3383:1: ( ( rule__Origin__ZAssignment_8 ) )
            {
            // InternalMyDsl.g:3383:1: ( ( rule__Origin__ZAssignment_8 ) )
            // InternalMyDsl.g:3384:2: ( rule__Origin__ZAssignment_8 )
            {
             before(grammarAccess.getOriginAccess().getZAssignment_8()); 
            // InternalMyDsl.g:3385:2: ( rule__Origin__ZAssignment_8 )
            // InternalMyDsl.g:3385:3: rule__Origin__ZAssignment_8
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
    // InternalMyDsl.g:3393:1: rule__Origin__Group__9 : rule__Origin__Group__9__Impl rule__Origin__Group__10 ;
    public final void rule__Origin__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3397:1: ( rule__Origin__Group__9__Impl rule__Origin__Group__10 )
            // InternalMyDsl.g:3398:2: rule__Origin__Group__9__Impl rule__Origin__Group__10
            {
            pushFollow(FOLLOW_38);
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
    // InternalMyDsl.g:3405:1: rule__Origin__Group__9__Impl : ( ( rule__Origin__Group_9__0 )? ) ;
    public final void rule__Origin__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3409:1: ( ( ( rule__Origin__Group_9__0 )? ) )
            // InternalMyDsl.g:3410:1: ( ( rule__Origin__Group_9__0 )? )
            {
            // InternalMyDsl.g:3410:1: ( ( rule__Origin__Group_9__0 )? )
            // InternalMyDsl.g:3411:2: ( rule__Origin__Group_9__0 )?
            {
             before(grammarAccess.getOriginAccess().getGroup_9()); 
            // InternalMyDsl.g:3412:2: ( rule__Origin__Group_9__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==41) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalMyDsl.g:3412:3: rule__Origin__Group_9__0
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
    // InternalMyDsl.g:3420:1: rule__Origin__Group__10 : rule__Origin__Group__10__Impl rule__Origin__Group__11 ;
    public final void rule__Origin__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3424:1: ( rule__Origin__Group__10__Impl rule__Origin__Group__11 )
            // InternalMyDsl.g:3425:2: rule__Origin__Group__10__Impl rule__Origin__Group__11
            {
            pushFollow(FOLLOW_38);
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
    // InternalMyDsl.g:3432:1: rule__Origin__Group__10__Impl : ( ( rule__Origin__Group_10__0 )? ) ;
    public final void rule__Origin__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3436:1: ( ( ( rule__Origin__Group_10__0 )? ) )
            // InternalMyDsl.g:3437:1: ( ( rule__Origin__Group_10__0 )? )
            {
            // InternalMyDsl.g:3437:1: ( ( rule__Origin__Group_10__0 )? )
            // InternalMyDsl.g:3438:2: ( rule__Origin__Group_10__0 )?
            {
             before(grammarAccess.getOriginAccess().getGroup_10()); 
            // InternalMyDsl.g:3439:2: ( rule__Origin__Group_10__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==42) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalMyDsl.g:3439:3: rule__Origin__Group_10__0
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
    // InternalMyDsl.g:3447:1: rule__Origin__Group__11 : rule__Origin__Group__11__Impl ;
    public final void rule__Origin__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3451:1: ( rule__Origin__Group__11__Impl )
            // InternalMyDsl.g:3452:2: rule__Origin__Group__11__Impl
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
    // InternalMyDsl.g:3458:1: rule__Origin__Group__11__Impl : ( ( rule__Origin__Group_11__0 )? ) ;
    public final void rule__Origin__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3462:1: ( ( ( rule__Origin__Group_11__0 )? ) )
            // InternalMyDsl.g:3463:1: ( ( rule__Origin__Group_11__0 )? )
            {
            // InternalMyDsl.g:3463:1: ( ( rule__Origin__Group_11__0 )? )
            // InternalMyDsl.g:3464:2: ( rule__Origin__Group_11__0 )?
            {
             before(grammarAccess.getOriginAccess().getGroup_11()); 
            // InternalMyDsl.g:3465:2: ( rule__Origin__Group_11__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==43) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalMyDsl.g:3465:3: rule__Origin__Group_11__0
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
    // InternalMyDsl.g:3474:1: rule__Origin__Group_9__0 : rule__Origin__Group_9__0__Impl rule__Origin__Group_9__1 ;
    public final void rule__Origin__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3478:1: ( rule__Origin__Group_9__0__Impl rule__Origin__Group_9__1 )
            // InternalMyDsl.g:3479:2: rule__Origin__Group_9__0__Impl rule__Origin__Group_9__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyDsl.g:3486:1: rule__Origin__Group_9__0__Impl : ( 'roll' ) ;
    public final void rule__Origin__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3490:1: ( ( 'roll' ) )
            // InternalMyDsl.g:3491:1: ( 'roll' )
            {
            // InternalMyDsl.g:3491:1: ( 'roll' )
            // InternalMyDsl.g:3492:2: 'roll'
            {
             before(grammarAccess.getOriginAccess().getRollKeyword_9_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalMyDsl.g:3501:1: rule__Origin__Group_9__1 : rule__Origin__Group_9__1__Impl ;
    public final void rule__Origin__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3505:1: ( rule__Origin__Group_9__1__Impl )
            // InternalMyDsl.g:3506:2: rule__Origin__Group_9__1__Impl
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
    // InternalMyDsl.g:3512:1: rule__Origin__Group_9__1__Impl : ( ( rule__Origin__RollAssignment_9_1 ) ) ;
    public final void rule__Origin__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3516:1: ( ( ( rule__Origin__RollAssignment_9_1 ) ) )
            // InternalMyDsl.g:3517:1: ( ( rule__Origin__RollAssignment_9_1 ) )
            {
            // InternalMyDsl.g:3517:1: ( ( rule__Origin__RollAssignment_9_1 ) )
            // InternalMyDsl.g:3518:2: ( rule__Origin__RollAssignment_9_1 )
            {
             before(grammarAccess.getOriginAccess().getRollAssignment_9_1()); 
            // InternalMyDsl.g:3519:2: ( rule__Origin__RollAssignment_9_1 )
            // InternalMyDsl.g:3519:3: rule__Origin__RollAssignment_9_1
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
    // InternalMyDsl.g:3528:1: rule__Origin__Group_10__0 : rule__Origin__Group_10__0__Impl rule__Origin__Group_10__1 ;
    public final void rule__Origin__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3532:1: ( rule__Origin__Group_10__0__Impl rule__Origin__Group_10__1 )
            // InternalMyDsl.g:3533:2: rule__Origin__Group_10__0__Impl rule__Origin__Group_10__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyDsl.g:3540:1: rule__Origin__Group_10__0__Impl : ( 'pitch' ) ;
    public final void rule__Origin__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3544:1: ( ( 'pitch' ) )
            // InternalMyDsl.g:3545:1: ( 'pitch' )
            {
            // InternalMyDsl.g:3545:1: ( 'pitch' )
            // InternalMyDsl.g:3546:2: 'pitch'
            {
             before(grammarAccess.getOriginAccess().getPitchKeyword_10_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalMyDsl.g:3555:1: rule__Origin__Group_10__1 : rule__Origin__Group_10__1__Impl ;
    public final void rule__Origin__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3559:1: ( rule__Origin__Group_10__1__Impl )
            // InternalMyDsl.g:3560:2: rule__Origin__Group_10__1__Impl
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
    // InternalMyDsl.g:3566:1: rule__Origin__Group_10__1__Impl : ( ( rule__Origin__PitchAssignment_10_1 ) ) ;
    public final void rule__Origin__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3570:1: ( ( ( rule__Origin__PitchAssignment_10_1 ) ) )
            // InternalMyDsl.g:3571:1: ( ( rule__Origin__PitchAssignment_10_1 ) )
            {
            // InternalMyDsl.g:3571:1: ( ( rule__Origin__PitchAssignment_10_1 ) )
            // InternalMyDsl.g:3572:2: ( rule__Origin__PitchAssignment_10_1 )
            {
             before(grammarAccess.getOriginAccess().getPitchAssignment_10_1()); 
            // InternalMyDsl.g:3573:2: ( rule__Origin__PitchAssignment_10_1 )
            // InternalMyDsl.g:3573:3: rule__Origin__PitchAssignment_10_1
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
    // InternalMyDsl.g:3582:1: rule__Origin__Group_11__0 : rule__Origin__Group_11__0__Impl rule__Origin__Group_11__1 ;
    public final void rule__Origin__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3586:1: ( rule__Origin__Group_11__0__Impl rule__Origin__Group_11__1 )
            // InternalMyDsl.g:3587:2: rule__Origin__Group_11__0__Impl rule__Origin__Group_11__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyDsl.g:3594:1: rule__Origin__Group_11__0__Impl : ( 'yaw' ) ;
    public final void rule__Origin__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3598:1: ( ( 'yaw' ) )
            // InternalMyDsl.g:3599:1: ( 'yaw' )
            {
            // InternalMyDsl.g:3599:1: ( 'yaw' )
            // InternalMyDsl.g:3600:2: 'yaw'
            {
             before(grammarAccess.getOriginAccess().getYawKeyword_11_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalMyDsl.g:3609:1: rule__Origin__Group_11__1 : rule__Origin__Group_11__1__Impl ;
    public final void rule__Origin__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3613:1: ( rule__Origin__Group_11__1__Impl )
            // InternalMyDsl.g:3614:2: rule__Origin__Group_11__1__Impl
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
    // InternalMyDsl.g:3620:1: rule__Origin__Group_11__1__Impl : ( ( rule__Origin__YawAssignment_11_1 ) ) ;
    public final void rule__Origin__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3624:1: ( ( ( rule__Origin__YawAssignment_11_1 ) ) )
            // InternalMyDsl.g:3625:1: ( ( rule__Origin__YawAssignment_11_1 ) )
            {
            // InternalMyDsl.g:3625:1: ( ( rule__Origin__YawAssignment_11_1 ) )
            // InternalMyDsl.g:3626:2: ( rule__Origin__YawAssignment_11_1 )
            {
             before(grammarAccess.getOriginAccess().getYawAssignment_11_1()); 
            // InternalMyDsl.g:3627:2: ( rule__Origin__YawAssignment_11_1 )
            // InternalMyDsl.g:3627:3: rule__Origin__YawAssignment_11_1
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
    // InternalMyDsl.g:3636:1: rule__Mass__Group__0 : rule__Mass__Group__0__Impl rule__Mass__Group__1 ;
    public final void rule__Mass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3640:1: ( rule__Mass__Group__0__Impl rule__Mass__Group__1 )
            // InternalMyDsl.g:3641:2: rule__Mass__Group__0__Impl rule__Mass__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:3648:1: rule__Mass__Group__0__Impl : ( () ) ;
    public final void rule__Mass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3652:1: ( ( () ) )
            // InternalMyDsl.g:3653:1: ( () )
            {
            // InternalMyDsl.g:3653:1: ( () )
            // InternalMyDsl.g:3654:2: ()
            {
             before(grammarAccess.getMassAccess().getMassAction_0()); 
            // InternalMyDsl.g:3655:2: ()
            // InternalMyDsl.g:3655:3: 
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
    // InternalMyDsl.g:3663:1: rule__Mass__Group__1 : rule__Mass__Group__1__Impl rule__Mass__Group__2 ;
    public final void rule__Mass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3667:1: ( rule__Mass__Group__1__Impl rule__Mass__Group__2 )
            // InternalMyDsl.g:3668:2: rule__Mass__Group__1__Impl rule__Mass__Group__2
            {
            pushFollow(FOLLOW_39);
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
    // InternalMyDsl.g:3675:1: rule__Mass__Group__1__Impl : ( 'Mass' ) ;
    public final void rule__Mass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3679:1: ( ( 'Mass' ) )
            // InternalMyDsl.g:3680:1: ( 'Mass' )
            {
            // InternalMyDsl.g:3680:1: ( 'Mass' )
            // InternalMyDsl.g:3681:2: 'Mass'
            {
             before(grammarAccess.getMassAccess().getMassKeyword_1()); 
            match(input,44,FOLLOW_2); 
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
    // InternalMyDsl.g:3690:1: rule__Mass__Group__2 : rule__Mass__Group__2__Impl rule__Mass__Group__3 ;
    public final void rule__Mass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3694:1: ( rule__Mass__Group__2__Impl rule__Mass__Group__3 )
            // InternalMyDsl.g:3695:2: rule__Mass__Group__2__Impl rule__Mass__Group__3
            {
            pushFollow(FOLLOW_39);
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
    // InternalMyDsl.g:3702:1: rule__Mass__Group__2__Impl : ( ( rule__Mass__NameAssignment_2 )? ) ;
    public final void rule__Mass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3706:1: ( ( ( rule__Mass__NameAssignment_2 )? ) )
            // InternalMyDsl.g:3707:1: ( ( rule__Mass__NameAssignment_2 )? )
            {
            // InternalMyDsl.g:3707:1: ( ( rule__Mass__NameAssignment_2 )? )
            // InternalMyDsl.g:3708:2: ( rule__Mass__NameAssignment_2 )?
            {
             before(grammarAccess.getMassAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:3709:2: ( rule__Mass__NameAssignment_2 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_ID) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalMyDsl.g:3709:3: rule__Mass__NameAssignment_2
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
    // InternalMyDsl.g:3717:1: rule__Mass__Group__3 : rule__Mass__Group__3__Impl rule__Mass__Group__4 ;
    public final void rule__Mass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3721:1: ( rule__Mass__Group__3__Impl rule__Mass__Group__4 )
            // InternalMyDsl.g:3722:2: rule__Mass__Group__3__Impl rule__Mass__Group__4
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyDsl.g:3729:1: rule__Mass__Group__3__Impl : ( 'massKilogram' ) ;
    public final void rule__Mass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3733:1: ( ( 'massKilogram' ) )
            // InternalMyDsl.g:3734:1: ( 'massKilogram' )
            {
            // InternalMyDsl.g:3734:1: ( 'massKilogram' )
            // InternalMyDsl.g:3735:2: 'massKilogram'
            {
             before(grammarAccess.getMassAccess().getMassKilogramKeyword_3()); 
            match(input,45,FOLLOW_2); 
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
    // InternalMyDsl.g:3744:1: rule__Mass__Group__4 : rule__Mass__Group__4__Impl ;
    public final void rule__Mass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3748:1: ( rule__Mass__Group__4__Impl )
            // InternalMyDsl.g:3749:2: rule__Mass__Group__4__Impl
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
    // InternalMyDsl.g:3755:1: rule__Mass__Group__4__Impl : ( ( rule__Mass__MassKilogramAssignment_4 ) ) ;
    public final void rule__Mass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3759:1: ( ( ( rule__Mass__MassKilogramAssignment_4 ) ) )
            // InternalMyDsl.g:3760:1: ( ( rule__Mass__MassKilogramAssignment_4 ) )
            {
            // InternalMyDsl.g:3760:1: ( ( rule__Mass__MassKilogramAssignment_4 ) )
            // InternalMyDsl.g:3761:2: ( rule__Mass__MassKilogramAssignment_4 )
            {
             before(grammarAccess.getMassAccess().getMassKilogramAssignment_4()); 
            // InternalMyDsl.g:3762:2: ( rule__Mass__MassKilogramAssignment_4 )
            // InternalMyDsl.g:3762:3: rule__Mass__MassKilogramAssignment_4
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
    // InternalMyDsl.g:3771:1: rule__Collision__Group__0 : rule__Collision__Group__0__Impl rule__Collision__Group__1 ;
    public final void rule__Collision__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3775:1: ( rule__Collision__Group__0__Impl rule__Collision__Group__1 )
            // InternalMyDsl.g:3776:2: rule__Collision__Group__0__Impl rule__Collision__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalMyDsl.g:3783:1: rule__Collision__Group__0__Impl : ( 'Collision' ) ;
    public final void rule__Collision__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3787:1: ( ( 'Collision' ) )
            // InternalMyDsl.g:3788:1: ( 'Collision' )
            {
            // InternalMyDsl.g:3788:1: ( 'Collision' )
            // InternalMyDsl.g:3789:2: 'Collision'
            {
             before(grammarAccess.getCollisionAccess().getCollisionKeyword_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalMyDsl.g:3798:1: rule__Collision__Group__1 : rule__Collision__Group__1__Impl rule__Collision__Group__2 ;
    public final void rule__Collision__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3802:1: ( rule__Collision__Group__1__Impl rule__Collision__Group__2 )
            // InternalMyDsl.g:3803:2: rule__Collision__Group__1__Impl rule__Collision__Group__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalMyDsl.g:3810:1: rule__Collision__Group__1__Impl : ( ( rule__Collision__NameAssignment_1 )? ) ;
    public final void rule__Collision__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3814:1: ( ( ( rule__Collision__NameAssignment_1 )? ) )
            // InternalMyDsl.g:3815:1: ( ( rule__Collision__NameAssignment_1 )? )
            {
            // InternalMyDsl.g:3815:1: ( ( rule__Collision__NameAssignment_1 )? )
            // InternalMyDsl.g:3816:2: ( rule__Collision__NameAssignment_1 )?
            {
             before(grammarAccess.getCollisionAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:3817:2: ( rule__Collision__NameAssignment_1 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_ID) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalMyDsl.g:3817:3: rule__Collision__NameAssignment_1
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
    // InternalMyDsl.g:3825:1: rule__Collision__Group__2 : rule__Collision__Group__2__Impl rule__Collision__Group__3 ;
    public final void rule__Collision__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3829:1: ( rule__Collision__Group__2__Impl rule__Collision__Group__3 )
            // InternalMyDsl.g:3830:2: rule__Collision__Group__2__Impl rule__Collision__Group__3
            {
            pushFollow(FOLLOW_31);
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
    // InternalMyDsl.g:3837:1: rule__Collision__Group__2__Impl : ( 'Geometry' ) ;
    public final void rule__Collision__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3841:1: ( ( 'Geometry' ) )
            // InternalMyDsl.g:3842:1: ( 'Geometry' )
            {
            // InternalMyDsl.g:3842:1: ( 'Geometry' )
            // InternalMyDsl.g:3843:2: 'Geometry'
            {
             before(grammarAccess.getCollisionAccess().getGeometryKeyword_2()); 
            match(input,35,FOLLOW_2); 
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
    // InternalMyDsl.g:3852:1: rule__Collision__Group__3 : rule__Collision__Group__3__Impl rule__Collision__Group__4 ;
    public final void rule__Collision__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3856:1: ( rule__Collision__Group__3__Impl rule__Collision__Group__4 )
            // InternalMyDsl.g:3857:2: rule__Collision__Group__3__Impl rule__Collision__Group__4
            {
            pushFollow(FOLLOW_21);
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
    // InternalMyDsl.g:3864:1: rule__Collision__Group__3__Impl : ( ( ( rule__Collision__GeometryAssignment_3 ) ) ( ( rule__Collision__GeometryAssignment_3 )* ) ) ;
    public final void rule__Collision__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3868:1: ( ( ( ( rule__Collision__GeometryAssignment_3 ) ) ( ( rule__Collision__GeometryAssignment_3 )* ) ) )
            // InternalMyDsl.g:3869:1: ( ( ( rule__Collision__GeometryAssignment_3 ) ) ( ( rule__Collision__GeometryAssignment_3 )* ) )
            {
            // InternalMyDsl.g:3869:1: ( ( ( rule__Collision__GeometryAssignment_3 ) ) ( ( rule__Collision__GeometryAssignment_3 )* ) )
            // InternalMyDsl.g:3870:2: ( ( rule__Collision__GeometryAssignment_3 ) ) ( ( rule__Collision__GeometryAssignment_3 )* )
            {
            // InternalMyDsl.g:3870:2: ( ( rule__Collision__GeometryAssignment_3 ) )
            // InternalMyDsl.g:3871:3: ( rule__Collision__GeometryAssignment_3 )
            {
             before(grammarAccess.getCollisionAccess().getGeometryAssignment_3()); 
            // InternalMyDsl.g:3872:3: ( rule__Collision__GeometryAssignment_3 )
            // InternalMyDsl.g:3872:4: rule__Collision__GeometryAssignment_3
            {
            pushFollow(FOLLOW_33);
            rule__Collision__GeometryAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCollisionAccess().getGeometryAssignment_3()); 

            }

            // InternalMyDsl.g:3875:2: ( ( rule__Collision__GeometryAssignment_3 )* )
            // InternalMyDsl.g:3876:3: ( rule__Collision__GeometryAssignment_3 )*
            {
             before(grammarAccess.getCollisionAccess().getGeometryAssignment_3()); 
            // InternalMyDsl.g:3877:3: ( rule__Collision__GeometryAssignment_3 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==47||LA34_0==51||LA34_0==53||LA34_0==55) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalMyDsl.g:3877:4: rule__Collision__GeometryAssignment_3
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__Collision__GeometryAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getCollisionAccess().getGeometryAssignment_3()); 

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
    // $ANTLR end "rule__Collision__Group__3__Impl"


    // $ANTLR start "rule__Collision__Group__4"
    // InternalMyDsl.g:3886:1: rule__Collision__Group__4 : rule__Collision__Group__4__Impl ;
    public final void rule__Collision__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3890:1: ( rule__Collision__Group__4__Impl )
            // InternalMyDsl.g:3891:2: rule__Collision__Group__4__Impl
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
    // InternalMyDsl.g:3897:1: rule__Collision__Group__4__Impl : ( ( rule__Collision__OriginAssignment_4 )? ) ;
    public final void rule__Collision__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3901:1: ( ( ( rule__Collision__OriginAssignment_4 )? ) )
            // InternalMyDsl.g:3902:1: ( ( rule__Collision__OriginAssignment_4 )? )
            {
            // InternalMyDsl.g:3902:1: ( ( rule__Collision__OriginAssignment_4 )? )
            // InternalMyDsl.g:3903:2: ( rule__Collision__OriginAssignment_4 )?
            {
             before(grammarAccess.getCollisionAccess().getOriginAssignment_4()); 
            // InternalMyDsl.g:3904:2: ( rule__Collision__OriginAssignment_4 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==37) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalMyDsl.g:3904:3: rule__Collision__OriginAssignment_4
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
    // InternalMyDsl.g:3913:1: rule__Box__Group__0 : rule__Box__Group__0__Impl rule__Box__Group__1 ;
    public final void rule__Box__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3917:1: ( rule__Box__Group__0__Impl rule__Box__Group__1 )
            // InternalMyDsl.g:3918:2: rule__Box__Group__0__Impl rule__Box__Group__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalMyDsl.g:3925:1: rule__Box__Group__0__Impl : ( 'Box' ) ;
    public final void rule__Box__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3929:1: ( ( 'Box' ) )
            // InternalMyDsl.g:3930:1: ( 'Box' )
            {
            // InternalMyDsl.g:3930:1: ( 'Box' )
            // InternalMyDsl.g:3931:2: 'Box'
            {
             before(grammarAccess.getBoxAccess().getBoxKeyword_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalMyDsl.g:3940:1: rule__Box__Group__1 : rule__Box__Group__1__Impl rule__Box__Group__2 ;
    public final void rule__Box__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3944:1: ( rule__Box__Group__1__Impl rule__Box__Group__2 )
            // InternalMyDsl.g:3945:2: rule__Box__Group__1__Impl rule__Box__Group__2
            {
            pushFollow(FOLLOW_40);
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
    // InternalMyDsl.g:3952:1: rule__Box__Group__1__Impl : ( ( rule__Box__NameAssignment_1 )? ) ;
    public final void rule__Box__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3956:1: ( ( ( rule__Box__NameAssignment_1 )? ) )
            // InternalMyDsl.g:3957:1: ( ( rule__Box__NameAssignment_1 )? )
            {
            // InternalMyDsl.g:3957:1: ( ( rule__Box__NameAssignment_1 )? )
            // InternalMyDsl.g:3958:2: ( rule__Box__NameAssignment_1 )?
            {
             before(grammarAccess.getBoxAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:3959:2: ( rule__Box__NameAssignment_1 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_ID) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalMyDsl.g:3959:3: rule__Box__NameAssignment_1
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
    // InternalMyDsl.g:3967:1: rule__Box__Group__2 : rule__Box__Group__2__Impl rule__Box__Group__3 ;
    public final void rule__Box__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3971:1: ( rule__Box__Group__2__Impl rule__Box__Group__3 )
            // InternalMyDsl.g:3972:2: rule__Box__Group__2__Impl rule__Box__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyDsl.g:3979:1: rule__Box__Group__2__Impl : ( 'height' ) ;
    public final void rule__Box__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3983:1: ( ( 'height' ) )
            // InternalMyDsl.g:3984:1: ( 'height' )
            {
            // InternalMyDsl.g:3984:1: ( 'height' )
            // InternalMyDsl.g:3985:2: 'height'
            {
             before(grammarAccess.getBoxAccess().getHeightKeyword_2()); 
            match(input,48,FOLLOW_2); 
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
    // InternalMyDsl.g:3994:1: rule__Box__Group__3 : rule__Box__Group__3__Impl rule__Box__Group__4 ;
    public final void rule__Box__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3998:1: ( rule__Box__Group__3__Impl rule__Box__Group__4 )
            // InternalMyDsl.g:3999:2: rule__Box__Group__3__Impl rule__Box__Group__4
            {
            pushFollow(FOLLOW_41);
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
    // InternalMyDsl.g:4006:1: rule__Box__Group__3__Impl : ( ( rule__Box__HeightAssignment_3 ) ) ;
    public final void rule__Box__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4010:1: ( ( ( rule__Box__HeightAssignment_3 ) ) )
            // InternalMyDsl.g:4011:1: ( ( rule__Box__HeightAssignment_3 ) )
            {
            // InternalMyDsl.g:4011:1: ( ( rule__Box__HeightAssignment_3 ) )
            // InternalMyDsl.g:4012:2: ( rule__Box__HeightAssignment_3 )
            {
             before(grammarAccess.getBoxAccess().getHeightAssignment_3()); 
            // InternalMyDsl.g:4013:2: ( rule__Box__HeightAssignment_3 )
            // InternalMyDsl.g:4013:3: rule__Box__HeightAssignment_3
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
    // InternalMyDsl.g:4021:1: rule__Box__Group__4 : rule__Box__Group__4__Impl rule__Box__Group__5 ;
    public final void rule__Box__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4025:1: ( rule__Box__Group__4__Impl rule__Box__Group__5 )
            // InternalMyDsl.g:4026:2: rule__Box__Group__4__Impl rule__Box__Group__5
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyDsl.g:4033:1: rule__Box__Group__4__Impl : ( 'length' ) ;
    public final void rule__Box__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4037:1: ( ( 'length' ) )
            // InternalMyDsl.g:4038:1: ( 'length' )
            {
            // InternalMyDsl.g:4038:1: ( 'length' )
            // InternalMyDsl.g:4039:2: 'length'
            {
             before(grammarAccess.getBoxAccess().getLengthKeyword_4()); 
            match(input,49,FOLLOW_2); 
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
    // InternalMyDsl.g:4048:1: rule__Box__Group__5 : rule__Box__Group__5__Impl rule__Box__Group__6 ;
    public final void rule__Box__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4052:1: ( rule__Box__Group__5__Impl rule__Box__Group__6 )
            // InternalMyDsl.g:4053:2: rule__Box__Group__5__Impl rule__Box__Group__6
            {
            pushFollow(FOLLOW_42);
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
    // InternalMyDsl.g:4060:1: rule__Box__Group__5__Impl : ( ( rule__Box__LengthAssignment_5 ) ) ;
    public final void rule__Box__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4064:1: ( ( ( rule__Box__LengthAssignment_5 ) ) )
            // InternalMyDsl.g:4065:1: ( ( rule__Box__LengthAssignment_5 ) )
            {
            // InternalMyDsl.g:4065:1: ( ( rule__Box__LengthAssignment_5 ) )
            // InternalMyDsl.g:4066:2: ( rule__Box__LengthAssignment_5 )
            {
             before(grammarAccess.getBoxAccess().getLengthAssignment_5()); 
            // InternalMyDsl.g:4067:2: ( rule__Box__LengthAssignment_5 )
            // InternalMyDsl.g:4067:3: rule__Box__LengthAssignment_5
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
    // InternalMyDsl.g:4075:1: rule__Box__Group__6 : rule__Box__Group__6__Impl rule__Box__Group__7 ;
    public final void rule__Box__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4079:1: ( rule__Box__Group__6__Impl rule__Box__Group__7 )
            // InternalMyDsl.g:4080:2: rule__Box__Group__6__Impl rule__Box__Group__7
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyDsl.g:4087:1: rule__Box__Group__6__Impl : ( 'width' ) ;
    public final void rule__Box__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4091:1: ( ( 'width' ) )
            // InternalMyDsl.g:4092:1: ( 'width' )
            {
            // InternalMyDsl.g:4092:1: ( 'width' )
            // InternalMyDsl.g:4093:2: 'width'
            {
             before(grammarAccess.getBoxAccess().getWidthKeyword_6()); 
            match(input,50,FOLLOW_2); 
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
    // InternalMyDsl.g:4102:1: rule__Box__Group__7 : rule__Box__Group__7__Impl ;
    public final void rule__Box__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4106:1: ( rule__Box__Group__7__Impl )
            // InternalMyDsl.g:4107:2: rule__Box__Group__7__Impl
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
    // InternalMyDsl.g:4113:1: rule__Box__Group__7__Impl : ( ( rule__Box__WidthAssignment_7 ) ) ;
    public final void rule__Box__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4117:1: ( ( ( rule__Box__WidthAssignment_7 ) ) )
            // InternalMyDsl.g:4118:1: ( ( rule__Box__WidthAssignment_7 ) )
            {
            // InternalMyDsl.g:4118:1: ( ( rule__Box__WidthAssignment_7 ) )
            // InternalMyDsl.g:4119:2: ( rule__Box__WidthAssignment_7 )
            {
             before(grammarAccess.getBoxAccess().getWidthAssignment_7()); 
            // InternalMyDsl.g:4120:2: ( rule__Box__WidthAssignment_7 )
            // InternalMyDsl.g:4120:3: rule__Box__WidthAssignment_7
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
    // InternalMyDsl.g:4129:1: rule__Cylinder__Group__0 : rule__Cylinder__Group__0__Impl rule__Cylinder__Group__1 ;
    public final void rule__Cylinder__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4133:1: ( rule__Cylinder__Group__0__Impl rule__Cylinder__Group__1 )
            // InternalMyDsl.g:4134:2: rule__Cylinder__Group__0__Impl rule__Cylinder__Group__1
            {
            pushFollow(FOLLOW_43);
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
    // InternalMyDsl.g:4141:1: rule__Cylinder__Group__0__Impl : ( 'Cylinder' ) ;
    public final void rule__Cylinder__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4145:1: ( ( 'Cylinder' ) )
            // InternalMyDsl.g:4146:1: ( 'Cylinder' )
            {
            // InternalMyDsl.g:4146:1: ( 'Cylinder' )
            // InternalMyDsl.g:4147:2: 'Cylinder'
            {
             before(grammarAccess.getCylinderAccess().getCylinderKeyword_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalMyDsl.g:4156:1: rule__Cylinder__Group__1 : rule__Cylinder__Group__1__Impl rule__Cylinder__Group__2 ;
    public final void rule__Cylinder__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4160:1: ( rule__Cylinder__Group__1__Impl rule__Cylinder__Group__2 )
            // InternalMyDsl.g:4161:2: rule__Cylinder__Group__1__Impl rule__Cylinder__Group__2
            {
            pushFollow(FOLLOW_43);
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
    // InternalMyDsl.g:4168:1: rule__Cylinder__Group__1__Impl : ( ( rule__Cylinder__NameAssignment_1 )? ) ;
    public final void rule__Cylinder__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4172:1: ( ( ( rule__Cylinder__NameAssignment_1 )? ) )
            // InternalMyDsl.g:4173:1: ( ( rule__Cylinder__NameAssignment_1 )? )
            {
            // InternalMyDsl.g:4173:1: ( ( rule__Cylinder__NameAssignment_1 )? )
            // InternalMyDsl.g:4174:2: ( rule__Cylinder__NameAssignment_1 )?
            {
             before(grammarAccess.getCylinderAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:4175:2: ( rule__Cylinder__NameAssignment_1 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_ID) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalMyDsl.g:4175:3: rule__Cylinder__NameAssignment_1
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
    // InternalMyDsl.g:4183:1: rule__Cylinder__Group__2 : rule__Cylinder__Group__2__Impl rule__Cylinder__Group__3 ;
    public final void rule__Cylinder__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4187:1: ( rule__Cylinder__Group__2__Impl rule__Cylinder__Group__3 )
            // InternalMyDsl.g:4188:2: rule__Cylinder__Group__2__Impl rule__Cylinder__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyDsl.g:4195:1: rule__Cylinder__Group__2__Impl : ( 'radius' ) ;
    public final void rule__Cylinder__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4199:1: ( ( 'radius' ) )
            // InternalMyDsl.g:4200:1: ( 'radius' )
            {
            // InternalMyDsl.g:4200:1: ( 'radius' )
            // InternalMyDsl.g:4201:2: 'radius'
            {
             before(grammarAccess.getCylinderAccess().getRadiusKeyword_2()); 
            match(input,52,FOLLOW_2); 
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
    // InternalMyDsl.g:4210:1: rule__Cylinder__Group__3 : rule__Cylinder__Group__3__Impl rule__Cylinder__Group__4 ;
    public final void rule__Cylinder__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4214:1: ( rule__Cylinder__Group__3__Impl rule__Cylinder__Group__4 )
            // InternalMyDsl.g:4215:2: rule__Cylinder__Group__3__Impl rule__Cylinder__Group__4
            {
            pushFollow(FOLLOW_41);
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
    // InternalMyDsl.g:4222:1: rule__Cylinder__Group__3__Impl : ( ( rule__Cylinder__RadiusAssignment_3 ) ) ;
    public final void rule__Cylinder__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4226:1: ( ( ( rule__Cylinder__RadiusAssignment_3 ) ) )
            // InternalMyDsl.g:4227:1: ( ( rule__Cylinder__RadiusAssignment_3 ) )
            {
            // InternalMyDsl.g:4227:1: ( ( rule__Cylinder__RadiusAssignment_3 ) )
            // InternalMyDsl.g:4228:2: ( rule__Cylinder__RadiusAssignment_3 )
            {
             before(grammarAccess.getCylinderAccess().getRadiusAssignment_3()); 
            // InternalMyDsl.g:4229:2: ( rule__Cylinder__RadiusAssignment_3 )
            // InternalMyDsl.g:4229:3: rule__Cylinder__RadiusAssignment_3
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
    // InternalMyDsl.g:4237:1: rule__Cylinder__Group__4 : rule__Cylinder__Group__4__Impl rule__Cylinder__Group__5 ;
    public final void rule__Cylinder__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4241:1: ( rule__Cylinder__Group__4__Impl rule__Cylinder__Group__5 )
            // InternalMyDsl.g:4242:2: rule__Cylinder__Group__4__Impl rule__Cylinder__Group__5
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyDsl.g:4249:1: rule__Cylinder__Group__4__Impl : ( 'length' ) ;
    public final void rule__Cylinder__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4253:1: ( ( 'length' ) )
            // InternalMyDsl.g:4254:1: ( 'length' )
            {
            // InternalMyDsl.g:4254:1: ( 'length' )
            // InternalMyDsl.g:4255:2: 'length'
            {
             before(grammarAccess.getCylinderAccess().getLengthKeyword_4()); 
            match(input,49,FOLLOW_2); 
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
    // InternalMyDsl.g:4264:1: rule__Cylinder__Group__5 : rule__Cylinder__Group__5__Impl ;
    public final void rule__Cylinder__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4268:1: ( rule__Cylinder__Group__5__Impl )
            // InternalMyDsl.g:4269:2: rule__Cylinder__Group__5__Impl
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
    // InternalMyDsl.g:4275:1: rule__Cylinder__Group__5__Impl : ( ( rule__Cylinder__LengthAssignment_5 ) ) ;
    public final void rule__Cylinder__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4279:1: ( ( ( rule__Cylinder__LengthAssignment_5 ) ) )
            // InternalMyDsl.g:4280:1: ( ( rule__Cylinder__LengthAssignment_5 ) )
            {
            // InternalMyDsl.g:4280:1: ( ( rule__Cylinder__LengthAssignment_5 ) )
            // InternalMyDsl.g:4281:2: ( rule__Cylinder__LengthAssignment_5 )
            {
             before(grammarAccess.getCylinderAccess().getLengthAssignment_5()); 
            // InternalMyDsl.g:4282:2: ( rule__Cylinder__LengthAssignment_5 )
            // InternalMyDsl.g:4282:3: rule__Cylinder__LengthAssignment_5
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
    // InternalMyDsl.g:4291:1: rule__Mesh__Group__0 : rule__Mesh__Group__0__Impl rule__Mesh__Group__1 ;
    public final void rule__Mesh__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4295:1: ( rule__Mesh__Group__0__Impl rule__Mesh__Group__1 )
            // InternalMyDsl.g:4296:2: rule__Mesh__Group__0__Impl rule__Mesh__Group__1
            {
            pushFollow(FOLLOW_44);
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
    // InternalMyDsl.g:4303:1: rule__Mesh__Group__0__Impl : ( 'Mesh' ) ;
    public final void rule__Mesh__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4307:1: ( ( 'Mesh' ) )
            // InternalMyDsl.g:4308:1: ( 'Mesh' )
            {
            // InternalMyDsl.g:4308:1: ( 'Mesh' )
            // InternalMyDsl.g:4309:2: 'Mesh'
            {
             before(grammarAccess.getMeshAccess().getMeshKeyword_0()); 
            match(input,53,FOLLOW_2); 
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
    // InternalMyDsl.g:4318:1: rule__Mesh__Group__1 : rule__Mesh__Group__1__Impl rule__Mesh__Group__2 ;
    public final void rule__Mesh__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4322:1: ( rule__Mesh__Group__1__Impl rule__Mesh__Group__2 )
            // InternalMyDsl.g:4323:2: rule__Mesh__Group__1__Impl rule__Mesh__Group__2
            {
            pushFollow(FOLLOW_44);
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
    // InternalMyDsl.g:4330:1: rule__Mesh__Group__1__Impl : ( ( rule__Mesh__NameAssignment_1 )? ) ;
    public final void rule__Mesh__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4334:1: ( ( ( rule__Mesh__NameAssignment_1 )? ) )
            // InternalMyDsl.g:4335:1: ( ( rule__Mesh__NameAssignment_1 )? )
            {
            // InternalMyDsl.g:4335:1: ( ( rule__Mesh__NameAssignment_1 )? )
            // InternalMyDsl.g:4336:2: ( rule__Mesh__NameAssignment_1 )?
            {
             before(grammarAccess.getMeshAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:4337:2: ( rule__Mesh__NameAssignment_1 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_ID) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalMyDsl.g:4337:3: rule__Mesh__NameAssignment_1
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
    // InternalMyDsl.g:4345:1: rule__Mesh__Group__2 : rule__Mesh__Group__2__Impl rule__Mesh__Group__3 ;
    public final void rule__Mesh__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4349:1: ( rule__Mesh__Group__2__Impl rule__Mesh__Group__3 )
            // InternalMyDsl.g:4350:2: rule__Mesh__Group__2__Impl rule__Mesh__Group__3
            {
            pushFollow(FOLLOW_45);
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
    // InternalMyDsl.g:4357:1: rule__Mesh__Group__2__Impl : ( 'pathToFile' ) ;
    public final void rule__Mesh__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4361:1: ( ( 'pathToFile' ) )
            // InternalMyDsl.g:4362:1: ( 'pathToFile' )
            {
            // InternalMyDsl.g:4362:1: ( 'pathToFile' )
            // InternalMyDsl.g:4363:2: 'pathToFile'
            {
             before(grammarAccess.getMeshAccess().getPathToFileKeyword_2()); 
            match(input,54,FOLLOW_2); 
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
    // InternalMyDsl.g:4372:1: rule__Mesh__Group__3 : rule__Mesh__Group__3__Impl ;
    public final void rule__Mesh__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4376:1: ( rule__Mesh__Group__3__Impl )
            // InternalMyDsl.g:4377:2: rule__Mesh__Group__3__Impl
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
    // InternalMyDsl.g:4383:1: rule__Mesh__Group__3__Impl : ( ( rule__Mesh__PathToFileAssignment_3 ) ) ;
    public final void rule__Mesh__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4387:1: ( ( ( rule__Mesh__PathToFileAssignment_3 ) ) )
            // InternalMyDsl.g:4388:1: ( ( rule__Mesh__PathToFileAssignment_3 ) )
            {
            // InternalMyDsl.g:4388:1: ( ( rule__Mesh__PathToFileAssignment_3 ) )
            // InternalMyDsl.g:4389:2: ( rule__Mesh__PathToFileAssignment_3 )
            {
             before(grammarAccess.getMeshAccess().getPathToFileAssignment_3()); 
            // InternalMyDsl.g:4390:2: ( rule__Mesh__PathToFileAssignment_3 )
            // InternalMyDsl.g:4390:3: rule__Mesh__PathToFileAssignment_3
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
    // InternalMyDsl.g:4399:1: rule__Sphere__Group__0 : rule__Sphere__Group__0__Impl rule__Sphere__Group__1 ;
    public final void rule__Sphere__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4403:1: ( rule__Sphere__Group__0__Impl rule__Sphere__Group__1 )
            // InternalMyDsl.g:4404:2: rule__Sphere__Group__0__Impl rule__Sphere__Group__1
            {
            pushFollow(FOLLOW_43);
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
    // InternalMyDsl.g:4411:1: rule__Sphere__Group__0__Impl : ( 'Sphere' ) ;
    public final void rule__Sphere__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4415:1: ( ( 'Sphere' ) )
            // InternalMyDsl.g:4416:1: ( 'Sphere' )
            {
            // InternalMyDsl.g:4416:1: ( 'Sphere' )
            // InternalMyDsl.g:4417:2: 'Sphere'
            {
             before(grammarAccess.getSphereAccess().getSphereKeyword_0()); 
            match(input,55,FOLLOW_2); 
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
    // InternalMyDsl.g:4426:1: rule__Sphere__Group__1 : rule__Sphere__Group__1__Impl rule__Sphere__Group__2 ;
    public final void rule__Sphere__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4430:1: ( rule__Sphere__Group__1__Impl rule__Sphere__Group__2 )
            // InternalMyDsl.g:4431:2: rule__Sphere__Group__1__Impl rule__Sphere__Group__2
            {
            pushFollow(FOLLOW_43);
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
    // InternalMyDsl.g:4438:1: rule__Sphere__Group__1__Impl : ( ( rule__Sphere__NameAssignment_1 )? ) ;
    public final void rule__Sphere__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4442:1: ( ( ( rule__Sphere__NameAssignment_1 )? ) )
            // InternalMyDsl.g:4443:1: ( ( rule__Sphere__NameAssignment_1 )? )
            {
            // InternalMyDsl.g:4443:1: ( ( rule__Sphere__NameAssignment_1 )? )
            // InternalMyDsl.g:4444:2: ( rule__Sphere__NameAssignment_1 )?
            {
             before(grammarAccess.getSphereAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:4445:2: ( rule__Sphere__NameAssignment_1 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_ID) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalMyDsl.g:4445:3: rule__Sphere__NameAssignment_1
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
    // InternalMyDsl.g:4453:1: rule__Sphere__Group__2 : rule__Sphere__Group__2__Impl rule__Sphere__Group__3 ;
    public final void rule__Sphere__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4457:1: ( rule__Sphere__Group__2__Impl rule__Sphere__Group__3 )
            // InternalMyDsl.g:4458:2: rule__Sphere__Group__2__Impl rule__Sphere__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyDsl.g:4465:1: rule__Sphere__Group__2__Impl : ( 'radius' ) ;
    public final void rule__Sphere__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4469:1: ( ( 'radius' ) )
            // InternalMyDsl.g:4470:1: ( 'radius' )
            {
            // InternalMyDsl.g:4470:1: ( 'radius' )
            // InternalMyDsl.g:4471:2: 'radius'
            {
             before(grammarAccess.getSphereAccess().getRadiusKeyword_2()); 
            match(input,52,FOLLOW_2); 
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
    // InternalMyDsl.g:4480:1: rule__Sphere__Group__3 : rule__Sphere__Group__3__Impl ;
    public final void rule__Sphere__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4484:1: ( rule__Sphere__Group__3__Impl )
            // InternalMyDsl.g:4485:2: rule__Sphere__Group__3__Impl
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
    // InternalMyDsl.g:4491:1: rule__Sphere__Group__3__Impl : ( ( rule__Sphere__RadiusAssignment_3 ) ) ;
    public final void rule__Sphere__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4495:1: ( ( ( rule__Sphere__RadiusAssignment_3 ) ) )
            // InternalMyDsl.g:4496:1: ( ( rule__Sphere__RadiusAssignment_3 ) )
            {
            // InternalMyDsl.g:4496:1: ( ( rule__Sphere__RadiusAssignment_3 ) )
            // InternalMyDsl.g:4497:2: ( rule__Sphere__RadiusAssignment_3 )
            {
             before(grammarAccess.getSphereAccess().getRadiusAssignment_3()); 
            // InternalMyDsl.g:4498:2: ( rule__Sphere__RadiusAssignment_3 )
            // InternalMyDsl.g:4498:3: rule__Sphere__RadiusAssignment_3
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
    // InternalMyDsl.g:4507:1: rule__Texture__Group__0 : rule__Texture__Group__0__Impl rule__Texture__Group__1 ;
    public final void rule__Texture__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4511:1: ( rule__Texture__Group__0__Impl rule__Texture__Group__1 )
            // InternalMyDsl.g:4512:2: rule__Texture__Group__0__Impl rule__Texture__Group__1
            {
            pushFollow(FOLLOW_44);
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
    // InternalMyDsl.g:4519:1: rule__Texture__Group__0__Impl : ( 'Texture' ) ;
    public final void rule__Texture__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4523:1: ( ( 'Texture' ) )
            // InternalMyDsl.g:4524:1: ( 'Texture' )
            {
            // InternalMyDsl.g:4524:1: ( 'Texture' )
            // InternalMyDsl.g:4525:2: 'Texture'
            {
             before(grammarAccess.getTextureAccess().getTextureKeyword_0()); 
            match(input,56,FOLLOW_2); 
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
    // InternalMyDsl.g:4534:1: rule__Texture__Group__1 : rule__Texture__Group__1__Impl rule__Texture__Group__2 ;
    public final void rule__Texture__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4538:1: ( rule__Texture__Group__1__Impl rule__Texture__Group__2 )
            // InternalMyDsl.g:4539:2: rule__Texture__Group__1__Impl rule__Texture__Group__2
            {
            pushFollow(FOLLOW_44);
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
    // InternalMyDsl.g:4546:1: rule__Texture__Group__1__Impl : ( ( rule__Texture__NameAssignment_1 )? ) ;
    public final void rule__Texture__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4550:1: ( ( ( rule__Texture__NameAssignment_1 )? ) )
            // InternalMyDsl.g:4551:1: ( ( rule__Texture__NameAssignment_1 )? )
            {
            // InternalMyDsl.g:4551:1: ( ( rule__Texture__NameAssignment_1 )? )
            // InternalMyDsl.g:4552:2: ( rule__Texture__NameAssignment_1 )?
            {
             before(grammarAccess.getTextureAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:4553:2: ( rule__Texture__NameAssignment_1 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_ID) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalMyDsl.g:4553:3: rule__Texture__NameAssignment_1
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
    // InternalMyDsl.g:4561:1: rule__Texture__Group__2 : rule__Texture__Group__2__Impl rule__Texture__Group__3 ;
    public final void rule__Texture__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4565:1: ( rule__Texture__Group__2__Impl rule__Texture__Group__3 )
            // InternalMyDsl.g:4566:2: rule__Texture__Group__2__Impl rule__Texture__Group__3
            {
            pushFollow(FOLLOW_45);
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
    // InternalMyDsl.g:4573:1: rule__Texture__Group__2__Impl : ( 'pathToFile' ) ;
    public final void rule__Texture__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4577:1: ( ( 'pathToFile' ) )
            // InternalMyDsl.g:4578:1: ( 'pathToFile' )
            {
            // InternalMyDsl.g:4578:1: ( 'pathToFile' )
            // InternalMyDsl.g:4579:2: 'pathToFile'
            {
             before(grammarAccess.getTextureAccess().getPathToFileKeyword_2()); 
            match(input,54,FOLLOW_2); 
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
    // InternalMyDsl.g:4588:1: rule__Texture__Group__3 : rule__Texture__Group__3__Impl ;
    public final void rule__Texture__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4592:1: ( rule__Texture__Group__3__Impl )
            // InternalMyDsl.g:4593:2: rule__Texture__Group__3__Impl
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
    // InternalMyDsl.g:4599:1: rule__Texture__Group__3__Impl : ( ( rule__Texture__PathToFileAssignment_3 ) ) ;
    public final void rule__Texture__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4603:1: ( ( ( rule__Texture__PathToFileAssignment_3 ) ) )
            // InternalMyDsl.g:4604:1: ( ( rule__Texture__PathToFileAssignment_3 ) )
            {
            // InternalMyDsl.g:4604:1: ( ( rule__Texture__PathToFileAssignment_3 ) )
            // InternalMyDsl.g:4605:2: ( rule__Texture__PathToFileAssignment_3 )
            {
             before(grammarAccess.getTextureAccess().getPathToFileAssignment_3()); 
            // InternalMyDsl.g:4606:2: ( rule__Texture__PathToFileAssignment_3 )
            // InternalMyDsl.g:4606:3: rule__Texture__PathToFileAssignment_3
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
    // InternalMyDsl.g:4615:1: rule__Color__Group__0 : rule__Color__Group__0__Impl rule__Color__Group__1 ;
    public final void rule__Color__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4619:1: ( rule__Color__Group__0__Impl rule__Color__Group__1 )
            // InternalMyDsl.g:4620:2: rule__Color__Group__0__Impl rule__Color__Group__1
            {
            pushFollow(FOLLOW_46);
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
    // InternalMyDsl.g:4627:1: rule__Color__Group__0__Impl : ( 'Color' ) ;
    public final void rule__Color__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4631:1: ( ( 'Color' ) )
            // InternalMyDsl.g:4632:1: ( 'Color' )
            {
            // InternalMyDsl.g:4632:1: ( 'Color' )
            // InternalMyDsl.g:4633:2: 'Color'
            {
             before(grammarAccess.getColorAccess().getColorKeyword_0()); 
            match(input,57,FOLLOW_2); 
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
    // InternalMyDsl.g:4642:1: rule__Color__Group__1 : rule__Color__Group__1__Impl rule__Color__Group__2 ;
    public final void rule__Color__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4646:1: ( rule__Color__Group__1__Impl rule__Color__Group__2 )
            // InternalMyDsl.g:4647:2: rule__Color__Group__1__Impl rule__Color__Group__2
            {
            pushFollow(FOLLOW_46);
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
    // InternalMyDsl.g:4654:1: rule__Color__Group__1__Impl : ( ( rule__Color__NameAssignment_1 )? ) ;
    public final void rule__Color__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4658:1: ( ( ( rule__Color__NameAssignment_1 )? ) )
            // InternalMyDsl.g:4659:1: ( ( rule__Color__NameAssignment_1 )? )
            {
            // InternalMyDsl.g:4659:1: ( ( rule__Color__NameAssignment_1 )? )
            // InternalMyDsl.g:4660:2: ( rule__Color__NameAssignment_1 )?
            {
             before(grammarAccess.getColorAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:4661:2: ( rule__Color__NameAssignment_1 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_ID) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalMyDsl.g:4661:3: rule__Color__NameAssignment_1
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
    // InternalMyDsl.g:4669:1: rule__Color__Group__2 : rule__Color__Group__2__Impl rule__Color__Group__3 ;
    public final void rule__Color__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4673:1: ( rule__Color__Group__2__Impl rule__Color__Group__3 )
            // InternalMyDsl.g:4674:2: rule__Color__Group__2__Impl rule__Color__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyDsl.g:4681:1: rule__Color__Group__2__Impl : ( 'red' ) ;
    public final void rule__Color__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4685:1: ( ( 'red' ) )
            // InternalMyDsl.g:4686:1: ( 'red' )
            {
            // InternalMyDsl.g:4686:1: ( 'red' )
            // InternalMyDsl.g:4687:2: 'red'
            {
             before(grammarAccess.getColorAccess().getRedKeyword_2()); 
            match(input,58,FOLLOW_2); 
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
    // InternalMyDsl.g:4696:1: rule__Color__Group__3 : rule__Color__Group__3__Impl rule__Color__Group__4 ;
    public final void rule__Color__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4700:1: ( rule__Color__Group__3__Impl rule__Color__Group__4 )
            // InternalMyDsl.g:4701:2: rule__Color__Group__3__Impl rule__Color__Group__4
            {
            pushFollow(FOLLOW_47);
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
    // InternalMyDsl.g:4708:1: rule__Color__Group__3__Impl : ( ( rule__Color__RedAssignment_3 ) ) ;
    public final void rule__Color__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4712:1: ( ( ( rule__Color__RedAssignment_3 ) ) )
            // InternalMyDsl.g:4713:1: ( ( rule__Color__RedAssignment_3 ) )
            {
            // InternalMyDsl.g:4713:1: ( ( rule__Color__RedAssignment_3 ) )
            // InternalMyDsl.g:4714:2: ( rule__Color__RedAssignment_3 )
            {
             before(grammarAccess.getColorAccess().getRedAssignment_3()); 
            // InternalMyDsl.g:4715:2: ( rule__Color__RedAssignment_3 )
            // InternalMyDsl.g:4715:3: rule__Color__RedAssignment_3
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
    // InternalMyDsl.g:4723:1: rule__Color__Group__4 : rule__Color__Group__4__Impl rule__Color__Group__5 ;
    public final void rule__Color__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4727:1: ( rule__Color__Group__4__Impl rule__Color__Group__5 )
            // InternalMyDsl.g:4728:2: rule__Color__Group__4__Impl rule__Color__Group__5
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyDsl.g:4735:1: rule__Color__Group__4__Impl : ( 'green' ) ;
    public final void rule__Color__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4739:1: ( ( 'green' ) )
            // InternalMyDsl.g:4740:1: ( 'green' )
            {
            // InternalMyDsl.g:4740:1: ( 'green' )
            // InternalMyDsl.g:4741:2: 'green'
            {
             before(grammarAccess.getColorAccess().getGreenKeyword_4()); 
            match(input,59,FOLLOW_2); 
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
    // InternalMyDsl.g:4750:1: rule__Color__Group__5 : rule__Color__Group__5__Impl rule__Color__Group__6 ;
    public final void rule__Color__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4754:1: ( rule__Color__Group__5__Impl rule__Color__Group__6 )
            // InternalMyDsl.g:4755:2: rule__Color__Group__5__Impl rule__Color__Group__6
            {
            pushFollow(FOLLOW_48);
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
    // InternalMyDsl.g:4762:1: rule__Color__Group__5__Impl : ( ( rule__Color__GreenAssignment_5 ) ) ;
    public final void rule__Color__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4766:1: ( ( ( rule__Color__GreenAssignment_5 ) ) )
            // InternalMyDsl.g:4767:1: ( ( rule__Color__GreenAssignment_5 ) )
            {
            // InternalMyDsl.g:4767:1: ( ( rule__Color__GreenAssignment_5 ) )
            // InternalMyDsl.g:4768:2: ( rule__Color__GreenAssignment_5 )
            {
             before(grammarAccess.getColorAccess().getGreenAssignment_5()); 
            // InternalMyDsl.g:4769:2: ( rule__Color__GreenAssignment_5 )
            // InternalMyDsl.g:4769:3: rule__Color__GreenAssignment_5
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
    // InternalMyDsl.g:4777:1: rule__Color__Group__6 : rule__Color__Group__6__Impl rule__Color__Group__7 ;
    public final void rule__Color__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4781:1: ( rule__Color__Group__6__Impl rule__Color__Group__7 )
            // InternalMyDsl.g:4782:2: rule__Color__Group__6__Impl rule__Color__Group__7
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyDsl.g:4789:1: rule__Color__Group__6__Impl : ( 'blue' ) ;
    public final void rule__Color__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4793:1: ( ( 'blue' ) )
            // InternalMyDsl.g:4794:1: ( 'blue' )
            {
            // InternalMyDsl.g:4794:1: ( 'blue' )
            // InternalMyDsl.g:4795:2: 'blue'
            {
             before(grammarAccess.getColorAccess().getBlueKeyword_6()); 
            match(input,60,FOLLOW_2); 
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
    // InternalMyDsl.g:4804:1: rule__Color__Group__7 : rule__Color__Group__7__Impl rule__Color__Group__8 ;
    public final void rule__Color__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4808:1: ( rule__Color__Group__7__Impl rule__Color__Group__8 )
            // InternalMyDsl.g:4809:2: rule__Color__Group__7__Impl rule__Color__Group__8
            {
            pushFollow(FOLLOW_49);
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
    // InternalMyDsl.g:4816:1: rule__Color__Group__7__Impl : ( ( rule__Color__BlueAssignment_7 ) ) ;
    public final void rule__Color__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4820:1: ( ( ( rule__Color__BlueAssignment_7 ) ) )
            // InternalMyDsl.g:4821:1: ( ( rule__Color__BlueAssignment_7 ) )
            {
            // InternalMyDsl.g:4821:1: ( ( rule__Color__BlueAssignment_7 ) )
            // InternalMyDsl.g:4822:2: ( rule__Color__BlueAssignment_7 )
            {
             before(grammarAccess.getColorAccess().getBlueAssignment_7()); 
            // InternalMyDsl.g:4823:2: ( rule__Color__BlueAssignment_7 )
            // InternalMyDsl.g:4823:3: rule__Color__BlueAssignment_7
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
    // InternalMyDsl.g:4831:1: rule__Color__Group__8 : rule__Color__Group__8__Impl rule__Color__Group__9 ;
    public final void rule__Color__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4835:1: ( rule__Color__Group__8__Impl rule__Color__Group__9 )
            // InternalMyDsl.g:4836:2: rule__Color__Group__8__Impl rule__Color__Group__9
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyDsl.g:4843:1: rule__Color__Group__8__Impl : ( 'alpha' ) ;
    public final void rule__Color__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4847:1: ( ( 'alpha' ) )
            // InternalMyDsl.g:4848:1: ( 'alpha' )
            {
            // InternalMyDsl.g:4848:1: ( 'alpha' )
            // InternalMyDsl.g:4849:2: 'alpha'
            {
             before(grammarAccess.getColorAccess().getAlphaKeyword_8()); 
            match(input,61,FOLLOW_2); 
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
    // InternalMyDsl.g:4858:1: rule__Color__Group__9 : rule__Color__Group__9__Impl ;
    public final void rule__Color__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4862:1: ( rule__Color__Group__9__Impl )
            // InternalMyDsl.g:4863:2: rule__Color__Group__9__Impl
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
    // InternalMyDsl.g:4869:1: rule__Color__Group__9__Impl : ( ( rule__Color__AlphaAssignment_9 ) ) ;
    public final void rule__Color__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4873:1: ( ( ( rule__Color__AlphaAssignment_9 ) ) )
            // InternalMyDsl.g:4874:1: ( ( rule__Color__AlphaAssignment_9 ) )
            {
            // InternalMyDsl.g:4874:1: ( ( rule__Color__AlphaAssignment_9 ) )
            // InternalMyDsl.g:4875:2: ( rule__Color__AlphaAssignment_9 )
            {
             before(grammarAccess.getColorAccess().getAlphaAssignment_9()); 
            // InternalMyDsl.g:4876:2: ( rule__Color__AlphaAssignment_9 )
            // InternalMyDsl.g:4876:3: rule__Color__AlphaAssignment_9
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
    // InternalMyDsl.g:4885:1: rule__Joint__Group__0 : rule__Joint__Group__0__Impl rule__Joint__Group__1 ;
    public final void rule__Joint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4889:1: ( rule__Joint__Group__0__Impl rule__Joint__Group__1 )
            // InternalMyDsl.g:4890:2: rule__Joint__Group__0__Impl rule__Joint__Group__1
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
    // InternalMyDsl.g:4897:1: rule__Joint__Group__0__Impl : ( 'Joint' ) ;
    public final void rule__Joint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4901:1: ( ( 'Joint' ) )
            // InternalMyDsl.g:4902:1: ( 'Joint' )
            {
            // InternalMyDsl.g:4902:1: ( 'Joint' )
            // InternalMyDsl.g:4903:2: 'Joint'
            {
             before(grammarAccess.getJointAccess().getJointKeyword_0()); 
            match(input,62,FOLLOW_2); 
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
    // InternalMyDsl.g:4912:1: rule__Joint__Group__1 : rule__Joint__Group__1__Impl rule__Joint__Group__2 ;
    public final void rule__Joint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4916:1: ( rule__Joint__Group__1__Impl rule__Joint__Group__2 )
            // InternalMyDsl.g:4917:2: rule__Joint__Group__1__Impl rule__Joint__Group__2
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
    // InternalMyDsl.g:4924:1: rule__Joint__Group__1__Impl : ( ( rule__Joint__NameAssignment_1 ) ) ;
    public final void rule__Joint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4928:1: ( ( ( rule__Joint__NameAssignment_1 ) ) )
            // InternalMyDsl.g:4929:1: ( ( rule__Joint__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:4929:1: ( ( rule__Joint__NameAssignment_1 ) )
            // InternalMyDsl.g:4930:2: ( rule__Joint__NameAssignment_1 )
            {
             before(grammarAccess.getJointAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:4931:2: ( rule__Joint__NameAssignment_1 )
            // InternalMyDsl.g:4931:3: rule__Joint__NameAssignment_1
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
    // InternalMyDsl.g:4939:1: rule__Joint__Group__2 : rule__Joint__Group__2__Impl ;
    public final void rule__Joint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4943:1: ( rule__Joint__Group__2__Impl )
            // InternalMyDsl.g:4944:2: rule__Joint__Group__2__Impl
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
    // InternalMyDsl.g:4950:1: rule__Joint__Group__2__Impl : ( ( rule__Joint__Alternatives_2 )? ) ;
    public final void rule__Joint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4954:1: ( ( ( rule__Joint__Alternatives_2 )? ) )
            // InternalMyDsl.g:4955:1: ( ( rule__Joint__Alternatives_2 )? )
            {
            // InternalMyDsl.g:4955:1: ( ( rule__Joint__Alternatives_2 )? )
            // InternalMyDsl.g:4956:2: ( rule__Joint__Alternatives_2 )?
            {
             before(grammarAccess.getJointAccess().getAlternatives_2()); 
            // InternalMyDsl.g:4957:2: ( rule__Joint__Alternatives_2 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=20 && LA42_0<=21)) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalMyDsl.g:4957:3: rule__Joint__Alternatives_2
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
    // InternalMyDsl.g:4966:1: rule__Joint__Group_2_0__0 : rule__Joint__Group_2_0__0__Impl rule__Joint__Group_2_0__1 ;
    public final void rule__Joint__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4970:1: ( rule__Joint__Group_2_0__0__Impl rule__Joint__Group_2_0__1 )
            // InternalMyDsl.g:4971:2: rule__Joint__Group_2_0__0__Impl rule__Joint__Group_2_0__1
            {
            pushFollow(FOLLOW_50);
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
    // InternalMyDsl.g:4978:1: rule__Joint__Group_2_0__0__Impl : ( ( rule__Joint__Group_2_0_0__0 ) ) ;
    public final void rule__Joint__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4982:1: ( ( ( rule__Joint__Group_2_0_0__0 ) ) )
            // InternalMyDsl.g:4983:1: ( ( rule__Joint__Group_2_0_0__0 ) )
            {
            // InternalMyDsl.g:4983:1: ( ( rule__Joint__Group_2_0_0__0 ) )
            // InternalMyDsl.g:4984:2: ( rule__Joint__Group_2_0_0__0 )
            {
             before(grammarAccess.getJointAccess().getGroup_2_0_0()); 
            // InternalMyDsl.g:4985:2: ( rule__Joint__Group_2_0_0__0 )
            // InternalMyDsl.g:4985:3: rule__Joint__Group_2_0_0__0
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
    // InternalMyDsl.g:4993:1: rule__Joint__Group_2_0__1 : rule__Joint__Group_2_0__1__Impl ;
    public final void rule__Joint__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4997:1: ( rule__Joint__Group_2_0__1__Impl )
            // InternalMyDsl.g:4998:2: rule__Joint__Group_2_0__1__Impl
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
    // InternalMyDsl.g:5004:1: rule__Joint__Group_2_0__1__Impl : ( ( ( rule__Joint__Alternatives_2_0_1 ) ) ( ( rule__Joint__Alternatives_2_0_1 )* ) ) ;
    public final void rule__Joint__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5008:1: ( ( ( ( rule__Joint__Alternatives_2_0_1 ) ) ( ( rule__Joint__Alternatives_2_0_1 )* ) ) )
            // InternalMyDsl.g:5009:1: ( ( ( rule__Joint__Alternatives_2_0_1 ) ) ( ( rule__Joint__Alternatives_2_0_1 )* ) )
            {
            // InternalMyDsl.g:5009:1: ( ( ( rule__Joint__Alternatives_2_0_1 ) ) ( ( rule__Joint__Alternatives_2_0_1 )* ) )
            // InternalMyDsl.g:5010:2: ( ( rule__Joint__Alternatives_2_0_1 ) ) ( ( rule__Joint__Alternatives_2_0_1 )* )
            {
            // InternalMyDsl.g:5010:2: ( ( rule__Joint__Alternatives_2_0_1 ) )
            // InternalMyDsl.g:5011:3: ( rule__Joint__Alternatives_2_0_1 )
            {
             before(grammarAccess.getJointAccess().getAlternatives_2_0_1()); 
            // InternalMyDsl.g:5012:3: ( rule__Joint__Alternatives_2_0_1 )
            // InternalMyDsl.g:5012:4: rule__Joint__Alternatives_2_0_1
            {
            pushFollow(FOLLOW_51);
            rule__Joint__Alternatives_2_0_1();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getAlternatives_2_0_1()); 

            }

            // InternalMyDsl.g:5015:2: ( ( rule__Joint__Alternatives_2_0_1 )* )
            // InternalMyDsl.g:5016:3: ( rule__Joint__Alternatives_2_0_1 )*
            {
             before(grammarAccess.getJointAccess().getAlternatives_2_0_1()); 
            // InternalMyDsl.g:5017:3: ( rule__Joint__Alternatives_2_0_1 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==37||(LA43_0>=66 && LA43_0<=67)||LA43_0==72||LA43_0==75||LA43_0==78) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalMyDsl.g:5017:4: rule__Joint__Alternatives_2_0_1
            	    {
            	    pushFollow(FOLLOW_51);
            	    rule__Joint__Alternatives_2_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

             after(grammarAccess.getJointAccess().getAlternatives_2_0_1()); 

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
    // $ANTLR end "rule__Joint__Group_2_0__1__Impl"


    // $ANTLR start "rule__Joint__Group_2_0_0__0"
    // InternalMyDsl.g:5027:1: rule__Joint__Group_2_0_0__0 : rule__Joint__Group_2_0_0__0__Impl rule__Joint__Group_2_0_0__1 ;
    public final void rule__Joint__Group_2_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5031:1: ( rule__Joint__Group_2_0_0__0__Impl rule__Joint__Group_2_0_0__1 )
            // InternalMyDsl.g:5032:2: rule__Joint__Group_2_0_0__0__Impl rule__Joint__Group_2_0_0__1
            {
            pushFollow(FOLLOW_52);
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
    // InternalMyDsl.g:5039:1: rule__Joint__Group_2_0_0__0__Impl : ( 'def' ) ;
    public final void rule__Joint__Group_2_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5043:1: ( ( 'def' ) )
            // InternalMyDsl.g:5044:1: ( 'def' )
            {
            // InternalMyDsl.g:5044:1: ( 'def' )
            // InternalMyDsl.g:5045:2: 'def'
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
    // InternalMyDsl.g:5054:1: rule__Joint__Group_2_0_0__1 : rule__Joint__Group_2_0_0__1__Impl rule__Joint__Group_2_0_0__2 ;
    public final void rule__Joint__Group_2_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5058:1: ( rule__Joint__Group_2_0_0__1__Impl rule__Joint__Group_2_0_0__2 )
            // InternalMyDsl.g:5059:2: rule__Joint__Group_2_0_0__1__Impl rule__Joint__Group_2_0_0__2
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
    // InternalMyDsl.g:5066:1: rule__Joint__Group_2_0_0__1__Impl : ( 'ChildOf' ) ;
    public final void rule__Joint__Group_2_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5070:1: ( ( 'ChildOf' ) )
            // InternalMyDsl.g:5071:1: ( 'ChildOf' )
            {
            // InternalMyDsl.g:5071:1: ( 'ChildOf' )
            // InternalMyDsl.g:5072:2: 'ChildOf'
            {
             before(grammarAccess.getJointAccess().getChildOfKeyword_2_0_0_1()); 
            match(input,63,FOLLOW_2); 
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
    // InternalMyDsl.g:5081:1: rule__Joint__Group_2_0_0__2 : rule__Joint__Group_2_0_0__2__Impl rule__Joint__Group_2_0_0__3 ;
    public final void rule__Joint__Group_2_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5085:1: ( rule__Joint__Group_2_0_0__2__Impl rule__Joint__Group_2_0_0__3 )
            // InternalMyDsl.g:5086:2: rule__Joint__Group_2_0_0__2__Impl rule__Joint__Group_2_0_0__3
            {
            pushFollow(FOLLOW_53);
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
    // InternalMyDsl.g:5093:1: rule__Joint__Group_2_0_0__2__Impl : ( ( rule__Joint__ChildOfAssignment_2_0_0_2 ) ) ;
    public final void rule__Joint__Group_2_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5097:1: ( ( ( rule__Joint__ChildOfAssignment_2_0_0_2 ) ) )
            // InternalMyDsl.g:5098:1: ( ( rule__Joint__ChildOfAssignment_2_0_0_2 ) )
            {
            // InternalMyDsl.g:5098:1: ( ( rule__Joint__ChildOfAssignment_2_0_0_2 ) )
            // InternalMyDsl.g:5099:2: ( rule__Joint__ChildOfAssignment_2_0_0_2 )
            {
             before(grammarAccess.getJointAccess().getChildOfAssignment_2_0_0_2()); 
            // InternalMyDsl.g:5100:2: ( rule__Joint__ChildOfAssignment_2_0_0_2 )
            // InternalMyDsl.g:5100:3: rule__Joint__ChildOfAssignment_2_0_0_2
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
    // InternalMyDsl.g:5108:1: rule__Joint__Group_2_0_0__3 : rule__Joint__Group_2_0_0__3__Impl rule__Joint__Group_2_0_0__4 ;
    public final void rule__Joint__Group_2_0_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5112:1: ( rule__Joint__Group_2_0_0__3__Impl rule__Joint__Group_2_0_0__4 )
            // InternalMyDsl.g:5113:2: rule__Joint__Group_2_0_0__3__Impl rule__Joint__Group_2_0_0__4
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
    // InternalMyDsl.g:5120:1: rule__Joint__Group_2_0_0__3__Impl : ( 'ParentOf' ) ;
    public final void rule__Joint__Group_2_0_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5124:1: ( ( 'ParentOf' ) )
            // InternalMyDsl.g:5125:1: ( 'ParentOf' )
            {
            // InternalMyDsl.g:5125:1: ( 'ParentOf' )
            // InternalMyDsl.g:5126:2: 'ParentOf'
            {
             before(grammarAccess.getJointAccess().getParentOfKeyword_2_0_0_3()); 
            match(input,64,FOLLOW_2); 
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
    // InternalMyDsl.g:5135:1: rule__Joint__Group_2_0_0__4 : rule__Joint__Group_2_0_0__4__Impl rule__Joint__Group_2_0_0__5 ;
    public final void rule__Joint__Group_2_0_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5139:1: ( rule__Joint__Group_2_0_0__4__Impl rule__Joint__Group_2_0_0__5 )
            // InternalMyDsl.g:5140:2: rule__Joint__Group_2_0_0__4__Impl rule__Joint__Group_2_0_0__5
            {
            pushFollow(FOLLOW_54);
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
    // InternalMyDsl.g:5147:1: rule__Joint__Group_2_0_0__4__Impl : ( ( rule__Joint__ParentOfAssignment_2_0_0_4 ) ) ;
    public final void rule__Joint__Group_2_0_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5151:1: ( ( ( rule__Joint__ParentOfAssignment_2_0_0_4 ) ) )
            // InternalMyDsl.g:5152:1: ( ( rule__Joint__ParentOfAssignment_2_0_0_4 ) )
            {
            // InternalMyDsl.g:5152:1: ( ( rule__Joint__ParentOfAssignment_2_0_0_4 ) )
            // InternalMyDsl.g:5153:2: ( rule__Joint__ParentOfAssignment_2_0_0_4 )
            {
             before(grammarAccess.getJointAccess().getParentOfAssignment_2_0_0_4()); 
            // InternalMyDsl.g:5154:2: ( rule__Joint__ParentOfAssignment_2_0_0_4 )
            // InternalMyDsl.g:5154:3: rule__Joint__ParentOfAssignment_2_0_0_4
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
    // InternalMyDsl.g:5162:1: rule__Joint__Group_2_0_0__5 : rule__Joint__Group_2_0_0__5__Impl rule__Joint__Group_2_0_0__6 ;
    public final void rule__Joint__Group_2_0_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5166:1: ( rule__Joint__Group_2_0_0__5__Impl rule__Joint__Group_2_0_0__6 )
            // InternalMyDsl.g:5167:2: rule__Joint__Group_2_0_0__5__Impl rule__Joint__Group_2_0_0__6
            {
            pushFollow(FOLLOW_55);
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
    // InternalMyDsl.g:5174:1: rule__Joint__Group_2_0_0__5__Impl : ( 'Type' ) ;
    public final void rule__Joint__Group_2_0_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5178:1: ( ( 'Type' ) )
            // InternalMyDsl.g:5179:1: ( 'Type' )
            {
            // InternalMyDsl.g:5179:1: ( 'Type' )
            // InternalMyDsl.g:5180:2: 'Type'
            {
             before(grammarAccess.getJointAccess().getTypeKeyword_2_0_0_5()); 
            match(input,65,FOLLOW_2); 
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
    // InternalMyDsl.g:5189:1: rule__Joint__Group_2_0_0__6 : rule__Joint__Group_2_0_0__6__Impl ;
    public final void rule__Joint__Group_2_0_0__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5193:1: ( rule__Joint__Group_2_0_0__6__Impl )
            // InternalMyDsl.g:5194:2: rule__Joint__Group_2_0_0__6__Impl
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
    // InternalMyDsl.g:5200:1: rule__Joint__Group_2_0_0__6__Impl : ( ( rule__Joint__TypeAssignment_2_0_0_6 ) ) ;
    public final void rule__Joint__Group_2_0_0__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5204:1: ( ( ( rule__Joint__TypeAssignment_2_0_0_6 ) ) )
            // InternalMyDsl.g:5205:1: ( ( rule__Joint__TypeAssignment_2_0_0_6 ) )
            {
            // InternalMyDsl.g:5205:1: ( ( rule__Joint__TypeAssignment_2_0_0_6 ) )
            // InternalMyDsl.g:5206:2: ( rule__Joint__TypeAssignment_2_0_0_6 )
            {
             before(grammarAccess.getJointAccess().getTypeAssignment_2_0_0_6()); 
            // InternalMyDsl.g:5207:2: ( rule__Joint__TypeAssignment_2_0_0_6 )
            // InternalMyDsl.g:5207:3: rule__Joint__TypeAssignment_2_0_0_6
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
    // InternalMyDsl.g:5216:1: rule__Joint__Group_2_1__0 : rule__Joint__Group_2_1__0__Impl rule__Joint__Group_2_1__1 ;
    public final void rule__Joint__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5220:1: ( rule__Joint__Group_2_1__0__Impl rule__Joint__Group_2_1__1 )
            // InternalMyDsl.g:5221:2: rule__Joint__Group_2_1__0__Impl rule__Joint__Group_2_1__1
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
    // InternalMyDsl.g:5228:1: rule__Joint__Group_2_1__0__Impl : ( 'reuse' ) ;
    public final void rule__Joint__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5232:1: ( ( 'reuse' ) )
            // InternalMyDsl.g:5233:1: ( 'reuse' )
            {
            // InternalMyDsl.g:5233:1: ( 'reuse' )
            // InternalMyDsl.g:5234:2: 'reuse'
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
    // InternalMyDsl.g:5243:1: rule__Joint__Group_2_1__1 : rule__Joint__Group_2_1__1__Impl rule__Joint__Group_2_1__2 ;
    public final void rule__Joint__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5247:1: ( rule__Joint__Group_2_1__1__Impl rule__Joint__Group_2_1__2 )
            // InternalMyDsl.g:5248:2: rule__Joint__Group_2_1__1__Impl rule__Joint__Group_2_1__2
            {
            pushFollow(FOLLOW_52);
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
    // InternalMyDsl.g:5255:1: rule__Joint__Group_2_1__1__Impl : ( ( rule__Joint__IsReuseOfAssignment_2_1_1 ) ) ;
    public final void rule__Joint__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5259:1: ( ( ( rule__Joint__IsReuseOfAssignment_2_1_1 ) ) )
            // InternalMyDsl.g:5260:1: ( ( rule__Joint__IsReuseOfAssignment_2_1_1 ) )
            {
            // InternalMyDsl.g:5260:1: ( ( rule__Joint__IsReuseOfAssignment_2_1_1 ) )
            // InternalMyDsl.g:5261:2: ( rule__Joint__IsReuseOfAssignment_2_1_1 )
            {
             before(grammarAccess.getJointAccess().getIsReuseOfAssignment_2_1_1()); 
            // InternalMyDsl.g:5262:2: ( rule__Joint__IsReuseOfAssignment_2_1_1 )
            // InternalMyDsl.g:5262:3: rule__Joint__IsReuseOfAssignment_2_1_1
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
    // InternalMyDsl.g:5270:1: rule__Joint__Group_2_1__2 : rule__Joint__Group_2_1__2__Impl rule__Joint__Group_2_1__3 ;
    public final void rule__Joint__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5274:1: ( rule__Joint__Group_2_1__2__Impl rule__Joint__Group_2_1__3 )
            // InternalMyDsl.g:5275:2: rule__Joint__Group_2_1__2__Impl rule__Joint__Group_2_1__3
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
    // InternalMyDsl.g:5282:1: rule__Joint__Group_2_1__2__Impl : ( 'ChildOf' ) ;
    public final void rule__Joint__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5286:1: ( ( 'ChildOf' ) )
            // InternalMyDsl.g:5287:1: ( 'ChildOf' )
            {
            // InternalMyDsl.g:5287:1: ( 'ChildOf' )
            // InternalMyDsl.g:5288:2: 'ChildOf'
            {
             before(grammarAccess.getJointAccess().getChildOfKeyword_2_1_2()); 
            match(input,63,FOLLOW_2); 
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
    // InternalMyDsl.g:5297:1: rule__Joint__Group_2_1__3 : rule__Joint__Group_2_1__3__Impl rule__Joint__Group_2_1__4 ;
    public final void rule__Joint__Group_2_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5301:1: ( rule__Joint__Group_2_1__3__Impl rule__Joint__Group_2_1__4 )
            // InternalMyDsl.g:5302:2: rule__Joint__Group_2_1__3__Impl rule__Joint__Group_2_1__4
            {
            pushFollow(FOLLOW_53);
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
    // InternalMyDsl.g:5309:1: rule__Joint__Group_2_1__3__Impl : ( ( rule__Joint__ChildOfAssignment_2_1_3 ) ) ;
    public final void rule__Joint__Group_2_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5313:1: ( ( ( rule__Joint__ChildOfAssignment_2_1_3 ) ) )
            // InternalMyDsl.g:5314:1: ( ( rule__Joint__ChildOfAssignment_2_1_3 ) )
            {
            // InternalMyDsl.g:5314:1: ( ( rule__Joint__ChildOfAssignment_2_1_3 ) )
            // InternalMyDsl.g:5315:2: ( rule__Joint__ChildOfAssignment_2_1_3 )
            {
             before(grammarAccess.getJointAccess().getChildOfAssignment_2_1_3()); 
            // InternalMyDsl.g:5316:2: ( rule__Joint__ChildOfAssignment_2_1_3 )
            // InternalMyDsl.g:5316:3: rule__Joint__ChildOfAssignment_2_1_3
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
    // InternalMyDsl.g:5324:1: rule__Joint__Group_2_1__4 : rule__Joint__Group_2_1__4__Impl rule__Joint__Group_2_1__5 ;
    public final void rule__Joint__Group_2_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5328:1: ( rule__Joint__Group_2_1__4__Impl rule__Joint__Group_2_1__5 )
            // InternalMyDsl.g:5329:2: rule__Joint__Group_2_1__4__Impl rule__Joint__Group_2_1__5
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
    // InternalMyDsl.g:5336:1: rule__Joint__Group_2_1__4__Impl : ( 'ParentOf' ) ;
    public final void rule__Joint__Group_2_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5340:1: ( ( 'ParentOf' ) )
            // InternalMyDsl.g:5341:1: ( 'ParentOf' )
            {
            // InternalMyDsl.g:5341:1: ( 'ParentOf' )
            // InternalMyDsl.g:5342:2: 'ParentOf'
            {
             before(grammarAccess.getJointAccess().getParentOfKeyword_2_1_4()); 
            match(input,64,FOLLOW_2); 
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
    // InternalMyDsl.g:5351:1: rule__Joint__Group_2_1__5 : rule__Joint__Group_2_1__5__Impl rule__Joint__Group_2_1__6 ;
    public final void rule__Joint__Group_2_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5355:1: ( rule__Joint__Group_2_1__5__Impl rule__Joint__Group_2_1__6 )
            // InternalMyDsl.g:5356:2: rule__Joint__Group_2_1__5__Impl rule__Joint__Group_2_1__6
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
    // InternalMyDsl.g:5363:1: rule__Joint__Group_2_1__5__Impl : ( ( rule__Joint__ParentOfAssignment_2_1_5 ) ) ;
    public final void rule__Joint__Group_2_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5367:1: ( ( ( rule__Joint__ParentOfAssignment_2_1_5 ) ) )
            // InternalMyDsl.g:5368:1: ( ( rule__Joint__ParentOfAssignment_2_1_5 ) )
            {
            // InternalMyDsl.g:5368:1: ( ( rule__Joint__ParentOfAssignment_2_1_5 ) )
            // InternalMyDsl.g:5369:2: ( rule__Joint__ParentOfAssignment_2_1_5 )
            {
             before(grammarAccess.getJointAccess().getParentOfAssignment_2_1_5()); 
            // InternalMyDsl.g:5370:2: ( rule__Joint__ParentOfAssignment_2_1_5 )
            // InternalMyDsl.g:5370:3: rule__Joint__ParentOfAssignment_2_1_5
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
    // InternalMyDsl.g:5378:1: rule__Joint__Group_2_1__6 : rule__Joint__Group_2_1__6__Impl ;
    public final void rule__Joint__Group_2_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5382:1: ( rule__Joint__Group_2_1__6__Impl )
            // InternalMyDsl.g:5383:2: rule__Joint__Group_2_1__6__Impl
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
    // InternalMyDsl.g:5389:1: rule__Joint__Group_2_1__6__Impl : ( ( rule__Joint__ReuseAssignment_2_1_6 ) ) ;
    public final void rule__Joint__Group_2_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5393:1: ( ( ( rule__Joint__ReuseAssignment_2_1_6 ) ) )
            // InternalMyDsl.g:5394:1: ( ( rule__Joint__ReuseAssignment_2_1_6 ) )
            {
            // InternalMyDsl.g:5394:1: ( ( rule__Joint__ReuseAssignment_2_1_6 ) )
            // InternalMyDsl.g:5395:2: ( rule__Joint__ReuseAssignment_2_1_6 )
            {
             before(grammarAccess.getJointAccess().getReuseAssignment_2_1_6()); 
            // InternalMyDsl.g:5396:2: ( rule__Joint__ReuseAssignment_2_1_6 )
            // InternalMyDsl.g:5396:3: rule__Joint__ReuseAssignment_2_1_6
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
    // InternalMyDsl.g:5405:1: rule__Axis__Group__0 : rule__Axis__Group__0__Impl rule__Axis__Group__1 ;
    public final void rule__Axis__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5409:1: ( rule__Axis__Group__0__Impl rule__Axis__Group__1 )
            // InternalMyDsl.g:5410:2: rule__Axis__Group__0__Impl rule__Axis__Group__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalMyDsl.g:5417:1: rule__Axis__Group__0__Impl : ( 'Axis' ) ;
    public final void rule__Axis__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5421:1: ( ( 'Axis' ) )
            // InternalMyDsl.g:5422:1: ( 'Axis' )
            {
            // InternalMyDsl.g:5422:1: ( 'Axis' )
            // InternalMyDsl.g:5423:2: 'Axis'
            {
             before(grammarAccess.getAxisAccess().getAxisKeyword_0()); 
            match(input,66,FOLLOW_2); 
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
    // InternalMyDsl.g:5432:1: rule__Axis__Group__1 : rule__Axis__Group__1__Impl rule__Axis__Group__2 ;
    public final void rule__Axis__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5436:1: ( rule__Axis__Group__1__Impl rule__Axis__Group__2 )
            // InternalMyDsl.g:5437:2: rule__Axis__Group__1__Impl rule__Axis__Group__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalMyDsl.g:5444:1: rule__Axis__Group__1__Impl : ( ( rule__Axis__NameAssignment_1 )? ) ;
    public final void rule__Axis__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5448:1: ( ( ( rule__Axis__NameAssignment_1 )? ) )
            // InternalMyDsl.g:5449:1: ( ( rule__Axis__NameAssignment_1 )? )
            {
            // InternalMyDsl.g:5449:1: ( ( rule__Axis__NameAssignment_1 )? )
            // InternalMyDsl.g:5450:2: ( rule__Axis__NameAssignment_1 )?
            {
             before(grammarAccess.getAxisAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:5451:2: ( rule__Axis__NameAssignment_1 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_ID) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalMyDsl.g:5451:3: rule__Axis__NameAssignment_1
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
    // InternalMyDsl.g:5459:1: rule__Axis__Group__2 : rule__Axis__Group__2__Impl rule__Axis__Group__3 ;
    public final void rule__Axis__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5463:1: ( rule__Axis__Group__2__Impl rule__Axis__Group__3 )
            // InternalMyDsl.g:5464:2: rule__Axis__Group__2__Impl rule__Axis__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyDsl.g:5471:1: rule__Axis__Group__2__Impl : ( 'x' ) ;
    public final void rule__Axis__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5475:1: ( ( 'x' ) )
            // InternalMyDsl.g:5476:1: ( 'x' )
            {
            // InternalMyDsl.g:5476:1: ( 'x' )
            // InternalMyDsl.g:5477:2: 'x'
            {
             before(grammarAccess.getAxisAccess().getXKeyword_2()); 
            match(input,38,FOLLOW_2); 
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
    // InternalMyDsl.g:5486:1: rule__Axis__Group__3 : rule__Axis__Group__3__Impl rule__Axis__Group__4 ;
    public final void rule__Axis__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5490:1: ( rule__Axis__Group__3__Impl rule__Axis__Group__4 )
            // InternalMyDsl.g:5491:2: rule__Axis__Group__3__Impl rule__Axis__Group__4
            {
            pushFollow(FOLLOW_36);
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
    // InternalMyDsl.g:5498:1: rule__Axis__Group__3__Impl : ( ( rule__Axis__XAssignment_3 ) ) ;
    public final void rule__Axis__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5502:1: ( ( ( rule__Axis__XAssignment_3 ) ) )
            // InternalMyDsl.g:5503:1: ( ( rule__Axis__XAssignment_3 ) )
            {
            // InternalMyDsl.g:5503:1: ( ( rule__Axis__XAssignment_3 ) )
            // InternalMyDsl.g:5504:2: ( rule__Axis__XAssignment_3 )
            {
             before(grammarAccess.getAxisAccess().getXAssignment_3()); 
            // InternalMyDsl.g:5505:2: ( rule__Axis__XAssignment_3 )
            // InternalMyDsl.g:5505:3: rule__Axis__XAssignment_3
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
    // InternalMyDsl.g:5513:1: rule__Axis__Group__4 : rule__Axis__Group__4__Impl rule__Axis__Group__5 ;
    public final void rule__Axis__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5517:1: ( rule__Axis__Group__4__Impl rule__Axis__Group__5 )
            // InternalMyDsl.g:5518:2: rule__Axis__Group__4__Impl rule__Axis__Group__5
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyDsl.g:5525:1: rule__Axis__Group__4__Impl : ( 'y' ) ;
    public final void rule__Axis__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5529:1: ( ( 'y' ) )
            // InternalMyDsl.g:5530:1: ( 'y' )
            {
            // InternalMyDsl.g:5530:1: ( 'y' )
            // InternalMyDsl.g:5531:2: 'y'
            {
             before(grammarAccess.getAxisAccess().getYKeyword_4()); 
            match(input,39,FOLLOW_2); 
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
    // InternalMyDsl.g:5540:1: rule__Axis__Group__5 : rule__Axis__Group__5__Impl rule__Axis__Group__6 ;
    public final void rule__Axis__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5544:1: ( rule__Axis__Group__5__Impl rule__Axis__Group__6 )
            // InternalMyDsl.g:5545:2: rule__Axis__Group__5__Impl rule__Axis__Group__6
            {
            pushFollow(FOLLOW_37);
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
    // InternalMyDsl.g:5552:1: rule__Axis__Group__5__Impl : ( ( rule__Axis__YAssignment_5 ) ) ;
    public final void rule__Axis__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5556:1: ( ( ( rule__Axis__YAssignment_5 ) ) )
            // InternalMyDsl.g:5557:1: ( ( rule__Axis__YAssignment_5 ) )
            {
            // InternalMyDsl.g:5557:1: ( ( rule__Axis__YAssignment_5 ) )
            // InternalMyDsl.g:5558:2: ( rule__Axis__YAssignment_5 )
            {
             before(grammarAccess.getAxisAccess().getYAssignment_5()); 
            // InternalMyDsl.g:5559:2: ( rule__Axis__YAssignment_5 )
            // InternalMyDsl.g:5559:3: rule__Axis__YAssignment_5
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
    // InternalMyDsl.g:5567:1: rule__Axis__Group__6 : rule__Axis__Group__6__Impl rule__Axis__Group__7 ;
    public final void rule__Axis__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5571:1: ( rule__Axis__Group__6__Impl rule__Axis__Group__7 )
            // InternalMyDsl.g:5572:2: rule__Axis__Group__6__Impl rule__Axis__Group__7
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyDsl.g:5579:1: rule__Axis__Group__6__Impl : ( 'z' ) ;
    public final void rule__Axis__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5583:1: ( ( 'z' ) )
            // InternalMyDsl.g:5584:1: ( 'z' )
            {
            // InternalMyDsl.g:5584:1: ( 'z' )
            // InternalMyDsl.g:5585:2: 'z'
            {
             before(grammarAccess.getAxisAccess().getZKeyword_6()); 
            match(input,40,FOLLOW_2); 
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
    // InternalMyDsl.g:5594:1: rule__Axis__Group__7 : rule__Axis__Group__7__Impl ;
    public final void rule__Axis__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5598:1: ( rule__Axis__Group__7__Impl )
            // InternalMyDsl.g:5599:2: rule__Axis__Group__7__Impl
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
    // InternalMyDsl.g:5605:1: rule__Axis__Group__7__Impl : ( ( rule__Axis__ZAssignment_7 ) ) ;
    public final void rule__Axis__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5609:1: ( ( ( rule__Axis__ZAssignment_7 ) ) )
            // InternalMyDsl.g:5610:1: ( ( rule__Axis__ZAssignment_7 ) )
            {
            // InternalMyDsl.g:5610:1: ( ( rule__Axis__ZAssignment_7 ) )
            // InternalMyDsl.g:5611:2: ( rule__Axis__ZAssignment_7 )
            {
             before(grammarAccess.getAxisAccess().getZAssignment_7()); 
            // InternalMyDsl.g:5612:2: ( rule__Axis__ZAssignment_7 )
            // InternalMyDsl.g:5612:3: rule__Axis__ZAssignment_7
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
    // InternalMyDsl.g:5621:1: rule__Limit__Group__0 : rule__Limit__Group__0__Impl rule__Limit__Group__1 ;
    public final void rule__Limit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5625:1: ( rule__Limit__Group__0__Impl rule__Limit__Group__1 )
            // InternalMyDsl.g:5626:2: rule__Limit__Group__0__Impl rule__Limit__Group__1
            {
            pushFollow(FOLLOW_56);
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
    // InternalMyDsl.g:5633:1: rule__Limit__Group__0__Impl : ( 'Limit' ) ;
    public final void rule__Limit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5637:1: ( ( 'Limit' ) )
            // InternalMyDsl.g:5638:1: ( 'Limit' )
            {
            // InternalMyDsl.g:5638:1: ( 'Limit' )
            // InternalMyDsl.g:5639:2: 'Limit'
            {
             before(grammarAccess.getLimitAccess().getLimitKeyword_0()); 
            match(input,67,FOLLOW_2); 
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
    // InternalMyDsl.g:5648:1: rule__Limit__Group__1 : rule__Limit__Group__1__Impl rule__Limit__Group__2 ;
    public final void rule__Limit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5652:1: ( rule__Limit__Group__1__Impl rule__Limit__Group__2 )
            // InternalMyDsl.g:5653:2: rule__Limit__Group__1__Impl rule__Limit__Group__2
            {
            pushFollow(FOLLOW_56);
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
    // InternalMyDsl.g:5660:1: rule__Limit__Group__1__Impl : ( ( rule__Limit__NameAssignment_1 )? ) ;
    public final void rule__Limit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5664:1: ( ( ( rule__Limit__NameAssignment_1 )? ) )
            // InternalMyDsl.g:5665:1: ( ( rule__Limit__NameAssignment_1 )? )
            {
            // InternalMyDsl.g:5665:1: ( ( rule__Limit__NameAssignment_1 )? )
            // InternalMyDsl.g:5666:2: ( rule__Limit__NameAssignment_1 )?
            {
             before(grammarAccess.getLimitAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:5667:2: ( rule__Limit__NameAssignment_1 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_ID) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalMyDsl.g:5667:3: rule__Limit__NameAssignment_1
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
    // InternalMyDsl.g:5675:1: rule__Limit__Group__2 : rule__Limit__Group__2__Impl rule__Limit__Group__3 ;
    public final void rule__Limit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5679:1: ( rule__Limit__Group__2__Impl rule__Limit__Group__3 )
            // InternalMyDsl.g:5680:2: rule__Limit__Group__2__Impl rule__Limit__Group__3
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyDsl.g:5687:1: rule__Limit__Group__2__Impl : ( 'effort' ) ;
    public final void rule__Limit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5691:1: ( ( 'effort' ) )
            // InternalMyDsl.g:5692:1: ( 'effort' )
            {
            // InternalMyDsl.g:5692:1: ( 'effort' )
            // InternalMyDsl.g:5693:2: 'effort'
            {
             before(grammarAccess.getLimitAccess().getEffortKeyword_2()); 
            match(input,68,FOLLOW_2); 
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
    // InternalMyDsl.g:5702:1: rule__Limit__Group__3 : rule__Limit__Group__3__Impl rule__Limit__Group__4 ;
    public final void rule__Limit__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5706:1: ( rule__Limit__Group__3__Impl rule__Limit__Group__4 )
            // InternalMyDsl.g:5707:2: rule__Limit__Group__3__Impl rule__Limit__Group__4
            {
            pushFollow(FOLLOW_57);
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
    // InternalMyDsl.g:5714:1: rule__Limit__Group__3__Impl : ( ( rule__Limit__EffortAssignment_3 ) ) ;
    public final void rule__Limit__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5718:1: ( ( ( rule__Limit__EffortAssignment_3 ) ) )
            // InternalMyDsl.g:5719:1: ( ( rule__Limit__EffortAssignment_3 ) )
            {
            // InternalMyDsl.g:5719:1: ( ( rule__Limit__EffortAssignment_3 ) )
            // InternalMyDsl.g:5720:2: ( rule__Limit__EffortAssignment_3 )
            {
             before(grammarAccess.getLimitAccess().getEffortAssignment_3()); 
            // InternalMyDsl.g:5721:2: ( rule__Limit__EffortAssignment_3 )
            // InternalMyDsl.g:5721:3: rule__Limit__EffortAssignment_3
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
    // InternalMyDsl.g:5729:1: rule__Limit__Group__4 : rule__Limit__Group__4__Impl rule__Limit__Group__5 ;
    public final void rule__Limit__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5733:1: ( rule__Limit__Group__4__Impl rule__Limit__Group__5 )
            // InternalMyDsl.g:5734:2: rule__Limit__Group__4__Impl rule__Limit__Group__5
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyDsl.g:5741:1: rule__Limit__Group__4__Impl : ( 'velocity' ) ;
    public final void rule__Limit__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5745:1: ( ( 'velocity' ) )
            // InternalMyDsl.g:5746:1: ( 'velocity' )
            {
            // InternalMyDsl.g:5746:1: ( 'velocity' )
            // InternalMyDsl.g:5747:2: 'velocity'
            {
             before(grammarAccess.getLimitAccess().getVelocityKeyword_4()); 
            match(input,69,FOLLOW_2); 
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
    // InternalMyDsl.g:5756:1: rule__Limit__Group__5 : rule__Limit__Group__5__Impl rule__Limit__Group__6 ;
    public final void rule__Limit__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5760:1: ( rule__Limit__Group__5__Impl rule__Limit__Group__6 )
            // InternalMyDsl.g:5761:2: rule__Limit__Group__5__Impl rule__Limit__Group__6
            {
            pushFollow(FOLLOW_58);
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
    // InternalMyDsl.g:5768:1: rule__Limit__Group__5__Impl : ( ( rule__Limit__VelocityAssignment_5 ) ) ;
    public final void rule__Limit__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5772:1: ( ( ( rule__Limit__VelocityAssignment_5 ) ) )
            // InternalMyDsl.g:5773:1: ( ( rule__Limit__VelocityAssignment_5 ) )
            {
            // InternalMyDsl.g:5773:1: ( ( rule__Limit__VelocityAssignment_5 ) )
            // InternalMyDsl.g:5774:2: ( rule__Limit__VelocityAssignment_5 )
            {
             before(grammarAccess.getLimitAccess().getVelocityAssignment_5()); 
            // InternalMyDsl.g:5775:2: ( rule__Limit__VelocityAssignment_5 )
            // InternalMyDsl.g:5775:3: rule__Limit__VelocityAssignment_5
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
    // InternalMyDsl.g:5783:1: rule__Limit__Group__6 : rule__Limit__Group__6__Impl rule__Limit__Group__7 ;
    public final void rule__Limit__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5787:1: ( rule__Limit__Group__6__Impl rule__Limit__Group__7 )
            // InternalMyDsl.g:5788:2: rule__Limit__Group__6__Impl rule__Limit__Group__7
            {
            pushFollow(FOLLOW_59);
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
    // InternalMyDsl.g:5795:1: rule__Limit__Group__6__Impl : ( 'lower' ) ;
    public final void rule__Limit__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5799:1: ( ( 'lower' ) )
            // InternalMyDsl.g:5800:1: ( 'lower' )
            {
            // InternalMyDsl.g:5800:1: ( 'lower' )
            // InternalMyDsl.g:5801:2: 'lower'
            {
             before(grammarAccess.getLimitAccess().getLowerKeyword_6()); 
            match(input,70,FOLLOW_2); 
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
    // InternalMyDsl.g:5810:1: rule__Limit__Group__7 : rule__Limit__Group__7__Impl rule__Limit__Group__8 ;
    public final void rule__Limit__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5814:1: ( rule__Limit__Group__7__Impl rule__Limit__Group__8 )
            // InternalMyDsl.g:5815:2: rule__Limit__Group__7__Impl rule__Limit__Group__8
            {
            pushFollow(FOLLOW_59);
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
    // InternalMyDsl.g:5822:1: rule__Limit__Group__7__Impl : ( ( rule__Limit__LowerAssignment_7 )? ) ;
    public final void rule__Limit__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5826:1: ( ( ( rule__Limit__LowerAssignment_7 )? ) )
            // InternalMyDsl.g:5827:1: ( ( rule__Limit__LowerAssignment_7 )? )
            {
            // InternalMyDsl.g:5827:1: ( ( rule__Limit__LowerAssignment_7 )? )
            // InternalMyDsl.g:5828:2: ( rule__Limit__LowerAssignment_7 )?
            {
             before(grammarAccess.getLimitAccess().getLowerAssignment_7()); 
            // InternalMyDsl.g:5829:2: ( rule__Limit__LowerAssignment_7 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( ((LA46_0>=RULE_INT && LA46_0<=RULE_ID)||LA46_0==12) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalMyDsl.g:5829:3: rule__Limit__LowerAssignment_7
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
    // InternalMyDsl.g:5837:1: rule__Limit__Group__8 : rule__Limit__Group__8__Impl rule__Limit__Group__9 ;
    public final void rule__Limit__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5841:1: ( rule__Limit__Group__8__Impl rule__Limit__Group__9 )
            // InternalMyDsl.g:5842:2: rule__Limit__Group__8__Impl rule__Limit__Group__9
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyDsl.g:5849:1: rule__Limit__Group__8__Impl : ( 'upper' ) ;
    public final void rule__Limit__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5853:1: ( ( 'upper' ) )
            // InternalMyDsl.g:5854:1: ( 'upper' )
            {
            // InternalMyDsl.g:5854:1: ( 'upper' )
            // InternalMyDsl.g:5855:2: 'upper'
            {
             before(grammarAccess.getLimitAccess().getUpperKeyword_8()); 
            match(input,71,FOLLOW_2); 
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
    // InternalMyDsl.g:5864:1: rule__Limit__Group__9 : rule__Limit__Group__9__Impl ;
    public final void rule__Limit__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5868:1: ( rule__Limit__Group__9__Impl )
            // InternalMyDsl.g:5869:2: rule__Limit__Group__9__Impl
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
    // InternalMyDsl.g:5875:1: rule__Limit__Group__9__Impl : ( ( rule__Limit__UpperAssignment_9 )? ) ;
    public final void rule__Limit__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5879:1: ( ( ( rule__Limit__UpperAssignment_9 )? ) )
            // InternalMyDsl.g:5880:1: ( ( rule__Limit__UpperAssignment_9 )? )
            {
            // InternalMyDsl.g:5880:1: ( ( rule__Limit__UpperAssignment_9 )? )
            // InternalMyDsl.g:5881:2: ( rule__Limit__UpperAssignment_9 )?
            {
             before(grammarAccess.getLimitAccess().getUpperAssignment_9()); 
            // InternalMyDsl.g:5882:2: ( rule__Limit__UpperAssignment_9 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( ((LA47_0>=RULE_INT && LA47_0<=RULE_ID)||LA47_0==12) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalMyDsl.g:5882:3: rule__Limit__UpperAssignment_9
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
    // InternalMyDsl.g:5891:1: rule__Calibration__Group__0 : rule__Calibration__Group__0__Impl rule__Calibration__Group__1 ;
    public final void rule__Calibration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5895:1: ( rule__Calibration__Group__0__Impl rule__Calibration__Group__1 )
            // InternalMyDsl.g:5896:2: rule__Calibration__Group__0__Impl rule__Calibration__Group__1
            {
            pushFollow(FOLLOW_60);
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
    // InternalMyDsl.g:5903:1: rule__Calibration__Group__0__Impl : ( () ) ;
    public final void rule__Calibration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5907:1: ( ( () ) )
            // InternalMyDsl.g:5908:1: ( () )
            {
            // InternalMyDsl.g:5908:1: ( () )
            // InternalMyDsl.g:5909:2: ()
            {
             before(grammarAccess.getCalibrationAccess().getCalibrationAction_0()); 
            // InternalMyDsl.g:5910:2: ()
            // InternalMyDsl.g:5910:3: 
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
    // InternalMyDsl.g:5918:1: rule__Calibration__Group__1 : rule__Calibration__Group__1__Impl rule__Calibration__Group__2 ;
    public final void rule__Calibration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5922:1: ( rule__Calibration__Group__1__Impl rule__Calibration__Group__2 )
            // InternalMyDsl.g:5923:2: rule__Calibration__Group__1__Impl rule__Calibration__Group__2
            {
            pushFollow(FOLLOW_61);
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
    // InternalMyDsl.g:5930:1: rule__Calibration__Group__1__Impl : ( 'Calibration' ) ;
    public final void rule__Calibration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5934:1: ( ( 'Calibration' ) )
            // InternalMyDsl.g:5935:1: ( 'Calibration' )
            {
            // InternalMyDsl.g:5935:1: ( 'Calibration' )
            // InternalMyDsl.g:5936:2: 'Calibration'
            {
             before(grammarAccess.getCalibrationAccess().getCalibrationKeyword_1()); 
            match(input,72,FOLLOW_2); 
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
    // InternalMyDsl.g:5945:1: rule__Calibration__Group__2 : rule__Calibration__Group__2__Impl rule__Calibration__Group__3 ;
    public final void rule__Calibration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5949:1: ( rule__Calibration__Group__2__Impl rule__Calibration__Group__3 )
            // InternalMyDsl.g:5950:2: rule__Calibration__Group__2__Impl rule__Calibration__Group__3
            {
            pushFollow(FOLLOW_61);
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
    // InternalMyDsl.g:5957:1: rule__Calibration__Group__2__Impl : ( ( rule__Calibration__NameAssignment_2 )? ) ;
    public final void rule__Calibration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5961:1: ( ( ( rule__Calibration__NameAssignment_2 )? ) )
            // InternalMyDsl.g:5962:1: ( ( rule__Calibration__NameAssignment_2 )? )
            {
            // InternalMyDsl.g:5962:1: ( ( rule__Calibration__NameAssignment_2 )? )
            // InternalMyDsl.g:5963:2: ( rule__Calibration__NameAssignment_2 )?
            {
             before(grammarAccess.getCalibrationAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:5964:2: ( rule__Calibration__NameAssignment_2 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_ID) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalMyDsl.g:5964:3: rule__Calibration__NameAssignment_2
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
    // InternalMyDsl.g:5972:1: rule__Calibration__Group__3 : rule__Calibration__Group__3__Impl rule__Calibration__Group__4 ;
    public final void rule__Calibration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5976:1: ( rule__Calibration__Group__3__Impl rule__Calibration__Group__4 )
            // InternalMyDsl.g:5977:2: rule__Calibration__Group__3__Impl rule__Calibration__Group__4
            {
            pushFollow(FOLLOW_61);
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
    // InternalMyDsl.g:5984:1: rule__Calibration__Group__3__Impl : ( ( rule__Calibration__Group_3__0 )? ) ;
    public final void rule__Calibration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5988:1: ( ( ( rule__Calibration__Group_3__0 )? ) )
            // InternalMyDsl.g:5989:1: ( ( rule__Calibration__Group_3__0 )? )
            {
            // InternalMyDsl.g:5989:1: ( ( rule__Calibration__Group_3__0 )? )
            // InternalMyDsl.g:5990:2: ( rule__Calibration__Group_3__0 )?
            {
             before(grammarAccess.getCalibrationAccess().getGroup_3()); 
            // InternalMyDsl.g:5991:2: ( rule__Calibration__Group_3__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==73) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalMyDsl.g:5991:3: rule__Calibration__Group_3__0
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
    // InternalMyDsl.g:5999:1: rule__Calibration__Group__4 : rule__Calibration__Group__4__Impl ;
    public final void rule__Calibration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6003:1: ( rule__Calibration__Group__4__Impl )
            // InternalMyDsl.g:6004:2: rule__Calibration__Group__4__Impl
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
    // InternalMyDsl.g:6010:1: rule__Calibration__Group__4__Impl : ( ( rule__Calibration__Group_4__0 )? ) ;
    public final void rule__Calibration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6014:1: ( ( ( rule__Calibration__Group_4__0 )? ) )
            // InternalMyDsl.g:6015:1: ( ( rule__Calibration__Group_4__0 )? )
            {
            // InternalMyDsl.g:6015:1: ( ( rule__Calibration__Group_4__0 )? )
            // InternalMyDsl.g:6016:2: ( rule__Calibration__Group_4__0 )?
            {
             before(grammarAccess.getCalibrationAccess().getGroup_4()); 
            // InternalMyDsl.g:6017:2: ( rule__Calibration__Group_4__0 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==74) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalMyDsl.g:6017:3: rule__Calibration__Group_4__0
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
    // InternalMyDsl.g:6026:1: rule__Calibration__Group_3__0 : rule__Calibration__Group_3__0__Impl rule__Calibration__Group_3__1 ;
    public final void rule__Calibration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6030:1: ( rule__Calibration__Group_3__0__Impl rule__Calibration__Group_3__1 )
            // InternalMyDsl.g:6031:2: rule__Calibration__Group_3__0__Impl rule__Calibration__Group_3__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyDsl.g:6038:1: rule__Calibration__Group_3__0__Impl : ( 'rising' ) ;
    public final void rule__Calibration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6042:1: ( ( 'rising' ) )
            // InternalMyDsl.g:6043:1: ( 'rising' )
            {
            // InternalMyDsl.g:6043:1: ( 'rising' )
            // InternalMyDsl.g:6044:2: 'rising'
            {
             before(grammarAccess.getCalibrationAccess().getRisingKeyword_3_0()); 
            match(input,73,FOLLOW_2); 
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
    // InternalMyDsl.g:6053:1: rule__Calibration__Group_3__1 : rule__Calibration__Group_3__1__Impl ;
    public final void rule__Calibration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6057:1: ( rule__Calibration__Group_3__1__Impl )
            // InternalMyDsl.g:6058:2: rule__Calibration__Group_3__1__Impl
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
    // InternalMyDsl.g:6064:1: rule__Calibration__Group_3__1__Impl : ( ( rule__Calibration__RisingAssignment_3_1 ) ) ;
    public final void rule__Calibration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6068:1: ( ( ( rule__Calibration__RisingAssignment_3_1 ) ) )
            // InternalMyDsl.g:6069:1: ( ( rule__Calibration__RisingAssignment_3_1 ) )
            {
            // InternalMyDsl.g:6069:1: ( ( rule__Calibration__RisingAssignment_3_1 ) )
            // InternalMyDsl.g:6070:2: ( rule__Calibration__RisingAssignment_3_1 )
            {
             before(grammarAccess.getCalibrationAccess().getRisingAssignment_3_1()); 
            // InternalMyDsl.g:6071:2: ( rule__Calibration__RisingAssignment_3_1 )
            // InternalMyDsl.g:6071:3: rule__Calibration__RisingAssignment_3_1
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
    // InternalMyDsl.g:6080:1: rule__Calibration__Group_4__0 : rule__Calibration__Group_4__0__Impl rule__Calibration__Group_4__1 ;
    public final void rule__Calibration__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6084:1: ( rule__Calibration__Group_4__0__Impl rule__Calibration__Group_4__1 )
            // InternalMyDsl.g:6085:2: rule__Calibration__Group_4__0__Impl rule__Calibration__Group_4__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyDsl.g:6092:1: rule__Calibration__Group_4__0__Impl : ( 'falling' ) ;
    public final void rule__Calibration__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6096:1: ( ( 'falling' ) )
            // InternalMyDsl.g:6097:1: ( 'falling' )
            {
            // InternalMyDsl.g:6097:1: ( 'falling' )
            // InternalMyDsl.g:6098:2: 'falling'
            {
             before(grammarAccess.getCalibrationAccess().getFallingKeyword_4_0()); 
            match(input,74,FOLLOW_2); 
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
    // InternalMyDsl.g:6107:1: rule__Calibration__Group_4__1 : rule__Calibration__Group_4__1__Impl ;
    public final void rule__Calibration__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6111:1: ( rule__Calibration__Group_4__1__Impl )
            // InternalMyDsl.g:6112:2: rule__Calibration__Group_4__1__Impl
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
    // InternalMyDsl.g:6118:1: rule__Calibration__Group_4__1__Impl : ( ( rule__Calibration__FallingAssignment_4_1 ) ) ;
    public final void rule__Calibration__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6122:1: ( ( ( rule__Calibration__FallingAssignment_4_1 ) ) )
            // InternalMyDsl.g:6123:1: ( ( rule__Calibration__FallingAssignment_4_1 ) )
            {
            // InternalMyDsl.g:6123:1: ( ( rule__Calibration__FallingAssignment_4_1 ) )
            // InternalMyDsl.g:6124:2: ( rule__Calibration__FallingAssignment_4_1 )
            {
             before(grammarAccess.getCalibrationAccess().getFallingAssignment_4_1()); 
            // InternalMyDsl.g:6125:2: ( rule__Calibration__FallingAssignment_4_1 )
            // InternalMyDsl.g:6125:3: rule__Calibration__FallingAssignment_4_1
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
    // InternalMyDsl.g:6134:1: rule__Dynamics__Group__0 : rule__Dynamics__Group__0__Impl rule__Dynamics__Group__1 ;
    public final void rule__Dynamics__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6138:1: ( rule__Dynamics__Group__0__Impl rule__Dynamics__Group__1 )
            // InternalMyDsl.g:6139:2: rule__Dynamics__Group__0__Impl rule__Dynamics__Group__1
            {
            pushFollow(FOLLOW_62);
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
    // InternalMyDsl.g:6146:1: rule__Dynamics__Group__0__Impl : ( () ) ;
    public final void rule__Dynamics__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6150:1: ( ( () ) )
            // InternalMyDsl.g:6151:1: ( () )
            {
            // InternalMyDsl.g:6151:1: ( () )
            // InternalMyDsl.g:6152:2: ()
            {
             before(grammarAccess.getDynamicsAccess().getDynamicsAction_0()); 
            // InternalMyDsl.g:6153:2: ()
            // InternalMyDsl.g:6153:3: 
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
    // InternalMyDsl.g:6161:1: rule__Dynamics__Group__1 : rule__Dynamics__Group__1__Impl rule__Dynamics__Group__2 ;
    public final void rule__Dynamics__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6165:1: ( rule__Dynamics__Group__1__Impl rule__Dynamics__Group__2 )
            // InternalMyDsl.g:6166:2: rule__Dynamics__Group__1__Impl rule__Dynamics__Group__2
            {
            pushFollow(FOLLOW_63);
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
    // InternalMyDsl.g:6173:1: rule__Dynamics__Group__1__Impl : ( 'Dynamics' ) ;
    public final void rule__Dynamics__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6177:1: ( ( 'Dynamics' ) )
            // InternalMyDsl.g:6178:1: ( 'Dynamics' )
            {
            // InternalMyDsl.g:6178:1: ( 'Dynamics' )
            // InternalMyDsl.g:6179:2: 'Dynamics'
            {
             before(grammarAccess.getDynamicsAccess().getDynamicsKeyword_1()); 
            match(input,75,FOLLOW_2); 
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
    // InternalMyDsl.g:6188:1: rule__Dynamics__Group__2 : rule__Dynamics__Group__2__Impl rule__Dynamics__Group__3 ;
    public final void rule__Dynamics__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6192:1: ( rule__Dynamics__Group__2__Impl rule__Dynamics__Group__3 )
            // InternalMyDsl.g:6193:2: rule__Dynamics__Group__2__Impl rule__Dynamics__Group__3
            {
            pushFollow(FOLLOW_63);
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
    // InternalMyDsl.g:6200:1: rule__Dynamics__Group__2__Impl : ( ( rule__Dynamics__NameAssignment_2 )? ) ;
    public final void rule__Dynamics__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6204:1: ( ( ( rule__Dynamics__NameAssignment_2 )? ) )
            // InternalMyDsl.g:6205:1: ( ( rule__Dynamics__NameAssignment_2 )? )
            {
            // InternalMyDsl.g:6205:1: ( ( rule__Dynamics__NameAssignment_2 )? )
            // InternalMyDsl.g:6206:2: ( rule__Dynamics__NameAssignment_2 )?
            {
             before(grammarAccess.getDynamicsAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:6207:2: ( rule__Dynamics__NameAssignment_2 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_ID) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalMyDsl.g:6207:3: rule__Dynamics__NameAssignment_2
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
    // InternalMyDsl.g:6215:1: rule__Dynamics__Group__3 : rule__Dynamics__Group__3__Impl rule__Dynamics__Group__4 ;
    public final void rule__Dynamics__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6219:1: ( rule__Dynamics__Group__3__Impl rule__Dynamics__Group__4 )
            // InternalMyDsl.g:6220:2: rule__Dynamics__Group__3__Impl rule__Dynamics__Group__4
            {
            pushFollow(FOLLOW_63);
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
    // InternalMyDsl.g:6227:1: rule__Dynamics__Group__3__Impl : ( ( rule__Dynamics__Group_3__0 )? ) ;
    public final void rule__Dynamics__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6231:1: ( ( ( rule__Dynamics__Group_3__0 )? ) )
            // InternalMyDsl.g:6232:1: ( ( rule__Dynamics__Group_3__0 )? )
            {
            // InternalMyDsl.g:6232:1: ( ( rule__Dynamics__Group_3__0 )? )
            // InternalMyDsl.g:6233:2: ( rule__Dynamics__Group_3__0 )?
            {
             before(grammarAccess.getDynamicsAccess().getGroup_3()); 
            // InternalMyDsl.g:6234:2: ( rule__Dynamics__Group_3__0 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==76) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalMyDsl.g:6234:3: rule__Dynamics__Group_3__0
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
    // InternalMyDsl.g:6242:1: rule__Dynamics__Group__4 : rule__Dynamics__Group__4__Impl ;
    public final void rule__Dynamics__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6246:1: ( rule__Dynamics__Group__4__Impl )
            // InternalMyDsl.g:6247:2: rule__Dynamics__Group__4__Impl
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
    // InternalMyDsl.g:6253:1: rule__Dynamics__Group__4__Impl : ( ( rule__Dynamics__Group_4__0 )? ) ;
    public final void rule__Dynamics__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6257:1: ( ( ( rule__Dynamics__Group_4__0 )? ) )
            // InternalMyDsl.g:6258:1: ( ( rule__Dynamics__Group_4__0 )? )
            {
            // InternalMyDsl.g:6258:1: ( ( rule__Dynamics__Group_4__0 )? )
            // InternalMyDsl.g:6259:2: ( rule__Dynamics__Group_4__0 )?
            {
             before(grammarAccess.getDynamicsAccess().getGroup_4()); 
            // InternalMyDsl.g:6260:2: ( rule__Dynamics__Group_4__0 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==77) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalMyDsl.g:6260:3: rule__Dynamics__Group_4__0
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
    // InternalMyDsl.g:6269:1: rule__Dynamics__Group_3__0 : rule__Dynamics__Group_3__0__Impl rule__Dynamics__Group_3__1 ;
    public final void rule__Dynamics__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6273:1: ( rule__Dynamics__Group_3__0__Impl rule__Dynamics__Group_3__1 )
            // InternalMyDsl.g:6274:2: rule__Dynamics__Group_3__0__Impl rule__Dynamics__Group_3__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyDsl.g:6281:1: rule__Dynamics__Group_3__0__Impl : ( 'friction' ) ;
    public final void rule__Dynamics__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6285:1: ( ( 'friction' ) )
            // InternalMyDsl.g:6286:1: ( 'friction' )
            {
            // InternalMyDsl.g:6286:1: ( 'friction' )
            // InternalMyDsl.g:6287:2: 'friction'
            {
             before(grammarAccess.getDynamicsAccess().getFrictionKeyword_3_0()); 
            match(input,76,FOLLOW_2); 
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
    // InternalMyDsl.g:6296:1: rule__Dynamics__Group_3__1 : rule__Dynamics__Group_3__1__Impl ;
    public final void rule__Dynamics__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6300:1: ( rule__Dynamics__Group_3__1__Impl )
            // InternalMyDsl.g:6301:2: rule__Dynamics__Group_3__1__Impl
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
    // InternalMyDsl.g:6307:1: rule__Dynamics__Group_3__1__Impl : ( ( rule__Dynamics__FrictionAssignment_3_1 ) ) ;
    public final void rule__Dynamics__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6311:1: ( ( ( rule__Dynamics__FrictionAssignment_3_1 ) ) )
            // InternalMyDsl.g:6312:1: ( ( rule__Dynamics__FrictionAssignment_3_1 ) )
            {
            // InternalMyDsl.g:6312:1: ( ( rule__Dynamics__FrictionAssignment_3_1 ) )
            // InternalMyDsl.g:6313:2: ( rule__Dynamics__FrictionAssignment_3_1 )
            {
             before(grammarAccess.getDynamicsAccess().getFrictionAssignment_3_1()); 
            // InternalMyDsl.g:6314:2: ( rule__Dynamics__FrictionAssignment_3_1 )
            // InternalMyDsl.g:6314:3: rule__Dynamics__FrictionAssignment_3_1
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
    // InternalMyDsl.g:6323:1: rule__Dynamics__Group_4__0 : rule__Dynamics__Group_4__0__Impl rule__Dynamics__Group_4__1 ;
    public final void rule__Dynamics__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6327:1: ( rule__Dynamics__Group_4__0__Impl rule__Dynamics__Group_4__1 )
            // InternalMyDsl.g:6328:2: rule__Dynamics__Group_4__0__Impl rule__Dynamics__Group_4__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyDsl.g:6335:1: rule__Dynamics__Group_4__0__Impl : ( 'damping' ) ;
    public final void rule__Dynamics__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6339:1: ( ( 'damping' ) )
            // InternalMyDsl.g:6340:1: ( 'damping' )
            {
            // InternalMyDsl.g:6340:1: ( 'damping' )
            // InternalMyDsl.g:6341:2: 'damping'
            {
             before(grammarAccess.getDynamicsAccess().getDampingKeyword_4_0()); 
            match(input,77,FOLLOW_2); 
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
    // InternalMyDsl.g:6350:1: rule__Dynamics__Group_4__1 : rule__Dynamics__Group_4__1__Impl ;
    public final void rule__Dynamics__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6354:1: ( rule__Dynamics__Group_4__1__Impl )
            // InternalMyDsl.g:6355:2: rule__Dynamics__Group_4__1__Impl
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
    // InternalMyDsl.g:6361:1: rule__Dynamics__Group_4__1__Impl : ( ( rule__Dynamics__DampingAssignment_4_1 ) ) ;
    public final void rule__Dynamics__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6365:1: ( ( ( rule__Dynamics__DampingAssignment_4_1 ) ) )
            // InternalMyDsl.g:6366:1: ( ( rule__Dynamics__DampingAssignment_4_1 ) )
            {
            // InternalMyDsl.g:6366:1: ( ( rule__Dynamics__DampingAssignment_4_1 ) )
            // InternalMyDsl.g:6367:2: ( rule__Dynamics__DampingAssignment_4_1 )
            {
             before(grammarAccess.getDynamicsAccess().getDampingAssignment_4_1()); 
            // InternalMyDsl.g:6368:2: ( rule__Dynamics__DampingAssignment_4_1 )
            // InternalMyDsl.g:6368:3: rule__Dynamics__DampingAssignment_4_1
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
    // InternalMyDsl.g:6377:1: rule__SafetyController__Group__0 : rule__SafetyController__Group__0__Impl rule__SafetyController__Group__1 ;
    public final void rule__SafetyController__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6381:1: ( rule__SafetyController__Group__0__Impl rule__SafetyController__Group__1 )
            // InternalMyDsl.g:6382:2: rule__SafetyController__Group__0__Impl rule__SafetyController__Group__1
            {
            pushFollow(FOLLOW_64);
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
    // InternalMyDsl.g:6389:1: rule__SafetyController__Group__0__Impl : ( 'SafetyController' ) ;
    public final void rule__SafetyController__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6393:1: ( ( 'SafetyController' ) )
            // InternalMyDsl.g:6394:1: ( 'SafetyController' )
            {
            // InternalMyDsl.g:6394:1: ( 'SafetyController' )
            // InternalMyDsl.g:6395:2: 'SafetyController'
            {
             before(grammarAccess.getSafetyControllerAccess().getSafetyControllerKeyword_0()); 
            match(input,78,FOLLOW_2); 
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
    // InternalMyDsl.g:6404:1: rule__SafetyController__Group__1 : rule__SafetyController__Group__1__Impl rule__SafetyController__Group__2 ;
    public final void rule__SafetyController__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6408:1: ( rule__SafetyController__Group__1__Impl rule__SafetyController__Group__2 )
            // InternalMyDsl.g:6409:2: rule__SafetyController__Group__1__Impl rule__SafetyController__Group__2
            {
            pushFollow(FOLLOW_64);
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
    // InternalMyDsl.g:6416:1: rule__SafetyController__Group__1__Impl : ( ( rule__SafetyController__NameAssignment_1 )? ) ;
    public final void rule__SafetyController__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6420:1: ( ( ( rule__SafetyController__NameAssignment_1 )? ) )
            // InternalMyDsl.g:6421:1: ( ( rule__SafetyController__NameAssignment_1 )? )
            {
            // InternalMyDsl.g:6421:1: ( ( rule__SafetyController__NameAssignment_1 )? )
            // InternalMyDsl.g:6422:2: ( rule__SafetyController__NameAssignment_1 )?
            {
             before(grammarAccess.getSafetyControllerAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:6423:2: ( rule__SafetyController__NameAssignment_1 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_ID) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalMyDsl.g:6423:3: rule__SafetyController__NameAssignment_1
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
    // InternalMyDsl.g:6431:1: rule__SafetyController__Group__2 : rule__SafetyController__Group__2__Impl rule__SafetyController__Group__3 ;
    public final void rule__SafetyController__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6435:1: ( rule__SafetyController__Group__2__Impl rule__SafetyController__Group__3 )
            // InternalMyDsl.g:6436:2: rule__SafetyController__Group__2__Impl rule__SafetyController__Group__3
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyDsl.g:6443:1: rule__SafetyController__Group__2__Impl : ( 'k_velocity' ) ;
    public final void rule__SafetyController__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6447:1: ( ( 'k_velocity' ) )
            // InternalMyDsl.g:6448:1: ( 'k_velocity' )
            {
            // InternalMyDsl.g:6448:1: ( 'k_velocity' )
            // InternalMyDsl.g:6449:2: 'k_velocity'
            {
             before(grammarAccess.getSafetyControllerAccess().getK_velocityKeyword_2()); 
            match(input,79,FOLLOW_2); 
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
    // InternalMyDsl.g:6458:1: rule__SafetyController__Group__3 : rule__SafetyController__Group__3__Impl rule__SafetyController__Group__4 ;
    public final void rule__SafetyController__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6462:1: ( rule__SafetyController__Group__3__Impl rule__SafetyController__Group__4 )
            // InternalMyDsl.g:6463:2: rule__SafetyController__Group__3__Impl rule__SafetyController__Group__4
            {
            pushFollow(FOLLOW_65);
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
    // InternalMyDsl.g:6470:1: rule__SafetyController__Group__3__Impl : ( ( rule__SafetyController__K_velocityAssignment_3 ) ) ;
    public final void rule__SafetyController__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6474:1: ( ( ( rule__SafetyController__K_velocityAssignment_3 ) ) )
            // InternalMyDsl.g:6475:1: ( ( rule__SafetyController__K_velocityAssignment_3 ) )
            {
            // InternalMyDsl.g:6475:1: ( ( rule__SafetyController__K_velocityAssignment_3 ) )
            // InternalMyDsl.g:6476:2: ( rule__SafetyController__K_velocityAssignment_3 )
            {
             before(grammarAccess.getSafetyControllerAccess().getK_velocityAssignment_3()); 
            // InternalMyDsl.g:6477:2: ( rule__SafetyController__K_velocityAssignment_3 )
            // InternalMyDsl.g:6477:3: rule__SafetyController__K_velocityAssignment_3
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
    // InternalMyDsl.g:6485:1: rule__SafetyController__Group__4 : rule__SafetyController__Group__4__Impl rule__SafetyController__Group__5 ;
    public final void rule__SafetyController__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6489:1: ( rule__SafetyController__Group__4__Impl rule__SafetyController__Group__5 )
            // InternalMyDsl.g:6490:2: rule__SafetyController__Group__4__Impl rule__SafetyController__Group__5
            {
            pushFollow(FOLLOW_65);
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
    // InternalMyDsl.g:6497:1: rule__SafetyController__Group__4__Impl : ( ( rule__SafetyController__Group_4__0 )? ) ;
    public final void rule__SafetyController__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6501:1: ( ( ( rule__SafetyController__Group_4__0 )? ) )
            // InternalMyDsl.g:6502:1: ( ( rule__SafetyController__Group_4__0 )? )
            {
            // InternalMyDsl.g:6502:1: ( ( rule__SafetyController__Group_4__0 )? )
            // InternalMyDsl.g:6503:2: ( rule__SafetyController__Group_4__0 )?
            {
             before(grammarAccess.getSafetyControllerAccess().getGroup_4()); 
            // InternalMyDsl.g:6504:2: ( rule__SafetyController__Group_4__0 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==80) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalMyDsl.g:6504:3: rule__SafetyController__Group_4__0
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
    // InternalMyDsl.g:6512:1: rule__SafetyController__Group__5 : rule__SafetyController__Group__5__Impl rule__SafetyController__Group__6 ;
    public final void rule__SafetyController__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6516:1: ( rule__SafetyController__Group__5__Impl rule__SafetyController__Group__6 )
            // InternalMyDsl.g:6517:2: rule__SafetyController__Group__5__Impl rule__SafetyController__Group__6
            {
            pushFollow(FOLLOW_65);
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
    // InternalMyDsl.g:6524:1: rule__SafetyController__Group__5__Impl : ( ( rule__SafetyController__Group_5__0 )? ) ;
    public final void rule__SafetyController__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6528:1: ( ( ( rule__SafetyController__Group_5__0 )? ) )
            // InternalMyDsl.g:6529:1: ( ( rule__SafetyController__Group_5__0 )? )
            {
            // InternalMyDsl.g:6529:1: ( ( rule__SafetyController__Group_5__0 )? )
            // InternalMyDsl.g:6530:2: ( rule__SafetyController__Group_5__0 )?
            {
             before(grammarAccess.getSafetyControllerAccess().getGroup_5()); 
            // InternalMyDsl.g:6531:2: ( rule__SafetyController__Group_5__0 )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==81) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalMyDsl.g:6531:3: rule__SafetyController__Group_5__0
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
    // InternalMyDsl.g:6539:1: rule__SafetyController__Group__6 : rule__SafetyController__Group__6__Impl ;
    public final void rule__SafetyController__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6543:1: ( rule__SafetyController__Group__6__Impl )
            // InternalMyDsl.g:6544:2: rule__SafetyController__Group__6__Impl
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
    // InternalMyDsl.g:6550:1: rule__SafetyController__Group__6__Impl : ( ( rule__SafetyController__Group_6__0 )? ) ;
    public final void rule__SafetyController__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6554:1: ( ( ( rule__SafetyController__Group_6__0 )? ) )
            // InternalMyDsl.g:6555:1: ( ( rule__SafetyController__Group_6__0 )? )
            {
            // InternalMyDsl.g:6555:1: ( ( rule__SafetyController__Group_6__0 )? )
            // InternalMyDsl.g:6556:2: ( rule__SafetyController__Group_6__0 )?
            {
             before(grammarAccess.getSafetyControllerAccess().getGroup_6()); 
            // InternalMyDsl.g:6557:2: ( rule__SafetyController__Group_6__0 )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==82) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalMyDsl.g:6557:3: rule__SafetyController__Group_6__0
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
    // InternalMyDsl.g:6566:1: rule__SafetyController__Group_4__0 : rule__SafetyController__Group_4__0__Impl rule__SafetyController__Group_4__1 ;
    public final void rule__SafetyController__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6570:1: ( rule__SafetyController__Group_4__0__Impl rule__SafetyController__Group_4__1 )
            // InternalMyDsl.g:6571:2: rule__SafetyController__Group_4__0__Impl rule__SafetyController__Group_4__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyDsl.g:6578:1: rule__SafetyController__Group_4__0__Impl : ( 'k_position' ) ;
    public final void rule__SafetyController__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6582:1: ( ( 'k_position' ) )
            // InternalMyDsl.g:6583:1: ( 'k_position' )
            {
            // InternalMyDsl.g:6583:1: ( 'k_position' )
            // InternalMyDsl.g:6584:2: 'k_position'
            {
             before(grammarAccess.getSafetyControllerAccess().getK_positionKeyword_4_0()); 
            match(input,80,FOLLOW_2); 
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
    // InternalMyDsl.g:6593:1: rule__SafetyController__Group_4__1 : rule__SafetyController__Group_4__1__Impl ;
    public final void rule__SafetyController__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6597:1: ( rule__SafetyController__Group_4__1__Impl )
            // InternalMyDsl.g:6598:2: rule__SafetyController__Group_4__1__Impl
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
    // InternalMyDsl.g:6604:1: rule__SafetyController__Group_4__1__Impl : ( ( rule__SafetyController__K_positionAssignment_4_1 ) ) ;
    public final void rule__SafetyController__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6608:1: ( ( ( rule__SafetyController__K_positionAssignment_4_1 ) ) )
            // InternalMyDsl.g:6609:1: ( ( rule__SafetyController__K_positionAssignment_4_1 ) )
            {
            // InternalMyDsl.g:6609:1: ( ( rule__SafetyController__K_positionAssignment_4_1 ) )
            // InternalMyDsl.g:6610:2: ( rule__SafetyController__K_positionAssignment_4_1 )
            {
             before(grammarAccess.getSafetyControllerAccess().getK_positionAssignment_4_1()); 
            // InternalMyDsl.g:6611:2: ( rule__SafetyController__K_positionAssignment_4_1 )
            // InternalMyDsl.g:6611:3: rule__SafetyController__K_positionAssignment_4_1
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
    // InternalMyDsl.g:6620:1: rule__SafetyController__Group_5__0 : rule__SafetyController__Group_5__0__Impl rule__SafetyController__Group_5__1 ;
    public final void rule__SafetyController__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6624:1: ( rule__SafetyController__Group_5__0__Impl rule__SafetyController__Group_5__1 )
            // InternalMyDsl.g:6625:2: rule__SafetyController__Group_5__0__Impl rule__SafetyController__Group_5__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyDsl.g:6632:1: rule__SafetyController__Group_5__0__Impl : ( 'softLowerLimit' ) ;
    public final void rule__SafetyController__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6636:1: ( ( 'softLowerLimit' ) )
            // InternalMyDsl.g:6637:1: ( 'softLowerLimit' )
            {
            // InternalMyDsl.g:6637:1: ( 'softLowerLimit' )
            // InternalMyDsl.g:6638:2: 'softLowerLimit'
            {
             before(grammarAccess.getSafetyControllerAccess().getSoftLowerLimitKeyword_5_0()); 
            match(input,81,FOLLOW_2); 
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
    // InternalMyDsl.g:6647:1: rule__SafetyController__Group_5__1 : rule__SafetyController__Group_5__1__Impl ;
    public final void rule__SafetyController__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6651:1: ( rule__SafetyController__Group_5__1__Impl )
            // InternalMyDsl.g:6652:2: rule__SafetyController__Group_5__1__Impl
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
    // InternalMyDsl.g:6658:1: rule__SafetyController__Group_5__1__Impl : ( ( rule__SafetyController__SoftLowerLimitAssignment_5_1 ) ) ;
    public final void rule__SafetyController__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6662:1: ( ( ( rule__SafetyController__SoftLowerLimitAssignment_5_1 ) ) )
            // InternalMyDsl.g:6663:1: ( ( rule__SafetyController__SoftLowerLimitAssignment_5_1 ) )
            {
            // InternalMyDsl.g:6663:1: ( ( rule__SafetyController__SoftLowerLimitAssignment_5_1 ) )
            // InternalMyDsl.g:6664:2: ( rule__SafetyController__SoftLowerLimitAssignment_5_1 )
            {
             before(grammarAccess.getSafetyControllerAccess().getSoftLowerLimitAssignment_5_1()); 
            // InternalMyDsl.g:6665:2: ( rule__SafetyController__SoftLowerLimitAssignment_5_1 )
            // InternalMyDsl.g:6665:3: rule__SafetyController__SoftLowerLimitAssignment_5_1
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
    // InternalMyDsl.g:6674:1: rule__SafetyController__Group_6__0 : rule__SafetyController__Group_6__0__Impl rule__SafetyController__Group_6__1 ;
    public final void rule__SafetyController__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6678:1: ( rule__SafetyController__Group_6__0__Impl rule__SafetyController__Group_6__1 )
            // InternalMyDsl.g:6679:2: rule__SafetyController__Group_6__0__Impl rule__SafetyController__Group_6__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyDsl.g:6686:1: rule__SafetyController__Group_6__0__Impl : ( 'softUpperLimit' ) ;
    public final void rule__SafetyController__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6690:1: ( ( 'softUpperLimit' ) )
            // InternalMyDsl.g:6691:1: ( 'softUpperLimit' )
            {
            // InternalMyDsl.g:6691:1: ( 'softUpperLimit' )
            // InternalMyDsl.g:6692:2: 'softUpperLimit'
            {
             before(grammarAccess.getSafetyControllerAccess().getSoftUpperLimitKeyword_6_0()); 
            match(input,82,FOLLOW_2); 
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
    // InternalMyDsl.g:6701:1: rule__SafetyController__Group_6__1 : rule__SafetyController__Group_6__1__Impl ;
    public final void rule__SafetyController__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6705:1: ( rule__SafetyController__Group_6__1__Impl )
            // InternalMyDsl.g:6706:2: rule__SafetyController__Group_6__1__Impl
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
    // InternalMyDsl.g:6712:1: rule__SafetyController__Group_6__1__Impl : ( ( rule__SafetyController__SoftUpperLimitAssignment_6_1 ) ) ;
    public final void rule__SafetyController__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6716:1: ( ( ( rule__SafetyController__SoftUpperLimitAssignment_6_1 ) ) )
            // InternalMyDsl.g:6717:1: ( ( rule__SafetyController__SoftUpperLimitAssignment_6_1 ) )
            {
            // InternalMyDsl.g:6717:1: ( ( rule__SafetyController__SoftUpperLimitAssignment_6_1 ) )
            // InternalMyDsl.g:6718:2: ( rule__SafetyController__SoftUpperLimitAssignment_6_1 )
            {
             before(grammarAccess.getSafetyControllerAccess().getSoftUpperLimitAssignment_6_1()); 
            // InternalMyDsl.g:6719:2: ( rule__SafetyController__SoftUpperLimitAssignment_6_1 )
            // InternalMyDsl.g:6719:3: rule__SafetyController__SoftUpperLimitAssignment_6_1
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
    // InternalMyDsl.g:6728:1: rule__URDFAttrSignedNumeric__Group__0 : rule__URDFAttrSignedNumeric__Group__0__Impl rule__URDFAttrSignedNumeric__Group__1 ;
    public final void rule__URDFAttrSignedNumeric__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6732:1: ( rule__URDFAttrSignedNumeric__Group__0__Impl rule__URDFAttrSignedNumeric__Group__1 )
            // InternalMyDsl.g:6733:2: rule__URDFAttrSignedNumeric__Group__0__Impl rule__URDFAttrSignedNumeric__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyDsl.g:6740:1: rule__URDFAttrSignedNumeric__Group__0__Impl : ( () ) ;
    public final void rule__URDFAttrSignedNumeric__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6744:1: ( ( () ) )
            // InternalMyDsl.g:6745:1: ( () )
            {
            // InternalMyDsl.g:6745:1: ( () )
            // InternalMyDsl.g:6746:2: ()
            {
             before(grammarAccess.getURDFAttrSignedNumericAccess().getURDFAttrSignedNumericAction_0()); 
            // InternalMyDsl.g:6747:2: ()
            // InternalMyDsl.g:6747:3: 
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
    // InternalMyDsl.g:6755:1: rule__URDFAttrSignedNumeric__Group__1 : rule__URDFAttrSignedNumeric__Group__1__Impl rule__URDFAttrSignedNumeric__Group__2 ;
    public final void rule__URDFAttrSignedNumeric__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6759:1: ( rule__URDFAttrSignedNumeric__Group__1__Impl rule__URDFAttrSignedNumeric__Group__2 )
            // InternalMyDsl.g:6760:2: rule__URDFAttrSignedNumeric__Group__1__Impl rule__URDFAttrSignedNumeric__Group__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyDsl.g:6767:1: rule__URDFAttrSignedNumeric__Group__1__Impl : ( ( rule__URDFAttrSignedNumeric__NameAssignment_1 )? ) ;
    public final void rule__URDFAttrSignedNumeric__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6771:1: ( ( ( rule__URDFAttrSignedNumeric__NameAssignment_1 )? ) )
            // InternalMyDsl.g:6772:1: ( ( rule__URDFAttrSignedNumeric__NameAssignment_1 )? )
            {
            // InternalMyDsl.g:6772:1: ( ( rule__URDFAttrSignedNumeric__NameAssignment_1 )? )
            // InternalMyDsl.g:6773:2: ( rule__URDFAttrSignedNumeric__NameAssignment_1 )?
            {
             before(grammarAccess.getURDFAttrSignedNumericAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:6774:2: ( rule__URDFAttrSignedNumeric__NameAssignment_1 )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_ID) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalMyDsl.g:6774:3: rule__URDFAttrSignedNumeric__NameAssignment_1
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
    // InternalMyDsl.g:6782:1: rule__URDFAttrSignedNumeric__Group__2 : rule__URDFAttrSignedNumeric__Group__2__Impl ;
    public final void rule__URDFAttrSignedNumeric__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6786:1: ( rule__URDFAttrSignedNumeric__Group__2__Impl )
            // InternalMyDsl.g:6787:2: rule__URDFAttrSignedNumeric__Group__2__Impl
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
    // InternalMyDsl.g:6793:1: rule__URDFAttrSignedNumeric__Group__2__Impl : ( ( rule__URDFAttrSignedNumeric__ValueAssignment_2 ) ) ;
    public final void rule__URDFAttrSignedNumeric__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6797:1: ( ( ( rule__URDFAttrSignedNumeric__ValueAssignment_2 ) ) )
            // InternalMyDsl.g:6798:1: ( ( rule__URDFAttrSignedNumeric__ValueAssignment_2 ) )
            {
            // InternalMyDsl.g:6798:1: ( ( rule__URDFAttrSignedNumeric__ValueAssignment_2 ) )
            // InternalMyDsl.g:6799:2: ( rule__URDFAttrSignedNumeric__ValueAssignment_2 )
            {
             before(grammarAccess.getURDFAttrSignedNumericAccess().getValueAssignment_2()); 
            // InternalMyDsl.g:6800:2: ( rule__URDFAttrSignedNumeric__ValueAssignment_2 )
            // InternalMyDsl.g:6800:3: rule__URDFAttrSignedNumeric__ValueAssignment_2
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
    // InternalMyDsl.g:6809:1: rule__FLOAT__Group__0 : rule__FLOAT__Group__0__Impl rule__FLOAT__Group__1 ;
    public final void rule__FLOAT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6813:1: ( rule__FLOAT__Group__0__Impl rule__FLOAT__Group__1 )
            // InternalMyDsl.g:6814:2: rule__FLOAT__Group__0__Impl rule__FLOAT__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalMyDsl.g:6821:1: rule__FLOAT__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__FLOAT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6825:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:6826:1: ( RULE_INT )
            {
            // InternalMyDsl.g:6826:1: ( RULE_INT )
            // InternalMyDsl.g:6827:2: RULE_INT
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
    // InternalMyDsl.g:6836:1: rule__FLOAT__Group__1 : rule__FLOAT__Group__1__Impl rule__FLOAT__Group__2 ;
    public final void rule__FLOAT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6840:1: ( rule__FLOAT__Group__1__Impl rule__FLOAT__Group__2 )
            // InternalMyDsl.g:6841:2: rule__FLOAT__Group__1__Impl rule__FLOAT__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyDsl.g:6848:1: rule__FLOAT__Group__1__Impl : ( '.' ) ;
    public final void rule__FLOAT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6852:1: ( ( '.' ) )
            // InternalMyDsl.g:6853:1: ( '.' )
            {
            // InternalMyDsl.g:6853:1: ( '.' )
            // InternalMyDsl.g:6854:2: '.'
            {
             before(grammarAccess.getFLOATAccess().getFullStopKeyword_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalMyDsl.g:6863:1: rule__FLOAT__Group__2 : rule__FLOAT__Group__2__Impl ;
    public final void rule__FLOAT__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6867:1: ( rule__FLOAT__Group__2__Impl )
            // InternalMyDsl.g:6868:2: rule__FLOAT__Group__2__Impl
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
    // InternalMyDsl.g:6874:1: rule__FLOAT__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__FLOAT__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6878:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:6879:1: ( RULE_INT )
            {
            // InternalMyDsl.g:6879:1: ( RULE_INT )
            // InternalMyDsl.g:6880:2: RULE_INT
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
    // InternalMyDsl.g:6890:1: rule__SCIENTIFIC__Group__0 : rule__SCIENTIFIC__Group__0__Impl rule__SCIENTIFIC__Group__1 ;
    public final void rule__SCIENTIFIC__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6894:1: ( rule__SCIENTIFIC__Group__0__Impl rule__SCIENTIFIC__Group__1 )
            // InternalMyDsl.g:6895:2: rule__SCIENTIFIC__Group__0__Impl rule__SCIENTIFIC__Group__1
            {
            pushFollow(FOLLOW_66);
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
    // InternalMyDsl.g:6902:1: rule__SCIENTIFIC__Group__0__Impl : ( ruleFLOAT ) ;
    public final void rule__SCIENTIFIC__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6906:1: ( ( ruleFLOAT ) )
            // InternalMyDsl.g:6907:1: ( ruleFLOAT )
            {
            // InternalMyDsl.g:6907:1: ( ruleFLOAT )
            // InternalMyDsl.g:6908:2: ruleFLOAT
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
    // InternalMyDsl.g:6917:1: rule__SCIENTIFIC__Group__1 : rule__SCIENTIFIC__Group__1__Impl rule__SCIENTIFIC__Group__2 ;
    public final void rule__SCIENTIFIC__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6921:1: ( rule__SCIENTIFIC__Group__1__Impl rule__SCIENTIFIC__Group__2 )
            // InternalMyDsl.g:6922:2: rule__SCIENTIFIC__Group__1__Impl rule__SCIENTIFIC__Group__2
            {
            pushFollow(FOLLOW_67);
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
    // InternalMyDsl.g:6929:1: rule__SCIENTIFIC__Group__1__Impl : ( 'e' ) ;
    public final void rule__SCIENTIFIC__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6933:1: ( ( 'e' ) )
            // InternalMyDsl.g:6934:1: ( 'e' )
            {
            // InternalMyDsl.g:6934:1: ( 'e' )
            // InternalMyDsl.g:6935:2: 'e'
            {
             before(grammarAccess.getSCIENTIFICAccess().getEKeyword_1()); 
            match(input,83,FOLLOW_2); 
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
    // InternalMyDsl.g:6944:1: rule__SCIENTIFIC__Group__2 : rule__SCIENTIFIC__Group__2__Impl rule__SCIENTIFIC__Group__3 ;
    public final void rule__SCIENTIFIC__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6948:1: ( rule__SCIENTIFIC__Group__2__Impl rule__SCIENTIFIC__Group__3 )
            // InternalMyDsl.g:6949:2: rule__SCIENTIFIC__Group__2__Impl rule__SCIENTIFIC__Group__3
            {
            pushFollow(FOLLOW_67);
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
    // InternalMyDsl.g:6956:1: rule__SCIENTIFIC__Group__2__Impl : ( ( rule__SCIENTIFIC__Alternatives_2 )? ) ;
    public final void rule__SCIENTIFIC__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6960:1: ( ( ( rule__SCIENTIFIC__Alternatives_2 )? ) )
            // InternalMyDsl.g:6961:1: ( ( rule__SCIENTIFIC__Alternatives_2 )? )
            {
            // InternalMyDsl.g:6961:1: ( ( rule__SCIENTIFIC__Alternatives_2 )? )
            // InternalMyDsl.g:6962:2: ( rule__SCIENTIFIC__Alternatives_2 )?
            {
             before(grammarAccess.getSCIENTIFICAccess().getAlternatives_2()); 
            // InternalMyDsl.g:6963:2: ( rule__SCIENTIFIC__Alternatives_2 )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( ((LA59_0>=11 && LA59_0<=12)) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalMyDsl.g:6963:3: rule__SCIENTIFIC__Alternatives_2
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
    // InternalMyDsl.g:6971:1: rule__SCIENTIFIC__Group__3 : rule__SCIENTIFIC__Group__3__Impl ;
    public final void rule__SCIENTIFIC__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6975:1: ( rule__SCIENTIFIC__Group__3__Impl )
            // InternalMyDsl.g:6976:2: rule__SCIENTIFIC__Group__3__Impl
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
    // InternalMyDsl.g:6982:1: rule__SCIENTIFIC__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__SCIENTIFIC__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6986:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:6987:1: ( RULE_INT )
            {
            // InternalMyDsl.g:6987:1: ( RULE_INT )
            // InternalMyDsl.g:6988:2: RULE_INT
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
    // InternalMyDsl.g:6998:1: rule__SIGNED_NUMERIC__Group__0 : rule__SIGNED_NUMERIC__Group__0__Impl rule__SIGNED_NUMERIC__Group__1 ;
    public final void rule__SIGNED_NUMERIC__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7002:1: ( rule__SIGNED_NUMERIC__Group__0__Impl rule__SIGNED_NUMERIC__Group__1 )
            // InternalMyDsl.g:7003:2: rule__SIGNED_NUMERIC__Group__0__Impl rule__SIGNED_NUMERIC__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyDsl.g:7010:1: rule__SIGNED_NUMERIC__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__SIGNED_NUMERIC__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7014:1: ( ( ( '-' )? ) )
            // InternalMyDsl.g:7015:1: ( ( '-' )? )
            {
            // InternalMyDsl.g:7015:1: ( ( '-' )? )
            // InternalMyDsl.g:7016:2: ( '-' )?
            {
             before(grammarAccess.getSIGNED_NUMERICAccess().getHyphenMinusKeyword_0()); 
            // InternalMyDsl.g:7017:2: ( '-' )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==12) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalMyDsl.g:7017:3: '-'
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
    // InternalMyDsl.g:7025:1: rule__SIGNED_NUMERIC__Group__1 : rule__SIGNED_NUMERIC__Group__1__Impl ;
    public final void rule__SIGNED_NUMERIC__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7029:1: ( rule__SIGNED_NUMERIC__Group__1__Impl )
            // InternalMyDsl.g:7030:2: rule__SIGNED_NUMERIC__Group__1__Impl
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
    // InternalMyDsl.g:7036:1: rule__SIGNED_NUMERIC__Group__1__Impl : ( ( rule__SIGNED_NUMERIC__Alternatives_1 ) ) ;
    public final void rule__SIGNED_NUMERIC__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7040:1: ( ( ( rule__SIGNED_NUMERIC__Alternatives_1 ) ) )
            // InternalMyDsl.g:7041:1: ( ( rule__SIGNED_NUMERIC__Alternatives_1 ) )
            {
            // InternalMyDsl.g:7041:1: ( ( rule__SIGNED_NUMERIC__Alternatives_1 ) )
            // InternalMyDsl.g:7042:2: ( rule__SIGNED_NUMERIC__Alternatives_1 )
            {
             before(grammarAccess.getSIGNED_NUMERICAccess().getAlternatives_1()); 
            // InternalMyDsl.g:7043:2: ( rule__SIGNED_NUMERIC__Alternatives_1 )
            // InternalMyDsl.g:7043:3: rule__SIGNED_NUMERIC__Alternatives_1
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
    // InternalMyDsl.g:7052:1: rule__Robot__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Robot__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7056:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:7057:2: ( RULE_ID )
            {
            // InternalMyDsl.g:7057:2: ( RULE_ID )
            // InternalMyDsl.g:7058:3: RULE_ID
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
    // InternalMyDsl.g:7067:1: rule__Robot__TopologiesAssignment_2_0_1 : ( ruleTopology ) ;
    public final void rule__Robot__TopologiesAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7071:1: ( ( ruleTopology ) )
            // InternalMyDsl.g:7072:2: ( ruleTopology )
            {
            // InternalMyDsl.g:7072:2: ( ruleTopology )
            // InternalMyDsl.g:7073:3: ruleTopology
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
    // InternalMyDsl.g:7082:1: rule__Robot__LinksAssignment_2_1 : ( ruleLink ) ;
    public final void rule__Robot__LinksAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7086:1: ( ( ruleLink ) )
            // InternalMyDsl.g:7087:2: ( ruleLink )
            {
            // InternalMyDsl.g:7087:2: ( ruleLink )
            // InternalMyDsl.g:7088:3: ruleLink
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
    // InternalMyDsl.g:7097:1: rule__Robot__JointAssignment_2_2 : ( ruleJoint ) ;
    public final void rule__Robot__JointAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7101:1: ( ( ruleJoint ) )
            // InternalMyDsl.g:7102:2: ( ruleJoint )
            {
            // InternalMyDsl.g:7102:2: ( ruleJoint )
            // InternalMyDsl.g:7103:3: ruleJoint
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
    // InternalMyDsl.g:7112:1: rule__Topology__ParentAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Topology__ParentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7116:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:7117:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:7117:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:7118:3: ( RULE_ID )
            {
             before(grammarAccess.getTopologyAccess().getParentLinkCrossReference_0_0()); 
            // InternalMyDsl.g:7119:3: ( RULE_ID )
            // InternalMyDsl.g:7120:4: RULE_ID
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
    // InternalMyDsl.g:7131:1: rule__Topology__JointAssignment_1_0 : ( ruleJointRef ) ;
    public final void rule__Topology__JointAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7135:1: ( ( ruleJointRef ) )
            // InternalMyDsl.g:7136:2: ( ruleJointRef )
            {
            // InternalMyDsl.g:7136:2: ( ruleJointRef )
            // InternalMyDsl.g:7137:3: ruleJointRef
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
    // InternalMyDsl.g:7146:1: rule__Topology__ChildAssignment_1_1 : ( ruleTopology ) ;
    public final void rule__Topology__ChildAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7150:1: ( ( ruleTopology ) )
            // InternalMyDsl.g:7151:2: ( ruleTopology )
            {
            // InternalMyDsl.g:7151:2: ( ruleTopology )
            // InternalMyDsl.g:7152:3: ruleTopology
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
    // InternalMyDsl.g:7161:1: rule__JointRef__FixAssignment_0 : ( ( '->' ) ) ;
    public final void rule__JointRef__FixAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7165:1: ( ( ( '->' ) ) )
            // InternalMyDsl.g:7166:2: ( ( '->' ) )
            {
            // InternalMyDsl.g:7166:2: ( ( '->' ) )
            // InternalMyDsl.g:7167:3: ( '->' )
            {
             before(grammarAccess.getJointRefAccess().getFixHyphenMinusGreaterThanSignKeyword_0_0()); 
            // InternalMyDsl.g:7168:3: ( '->' )
            // InternalMyDsl.g:7169:4: '->'
            {
             before(grammarAccess.getJointRefAccess().getFixHyphenMinusGreaterThanSignKeyword_0_0()); 
            match(input,84,FOLLOW_2); 
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
    // InternalMyDsl.g:7180:1: rule__JointRef__RevAssignment_1 : ( ( 'r->' ) ) ;
    public final void rule__JointRef__RevAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7184:1: ( ( ( 'r->' ) ) )
            // InternalMyDsl.g:7185:2: ( ( 'r->' ) )
            {
            // InternalMyDsl.g:7185:2: ( ( 'r->' ) )
            // InternalMyDsl.g:7186:3: ( 'r->' )
            {
             before(grammarAccess.getJointRefAccess().getRevRKeyword_1_0()); 
            // InternalMyDsl.g:7187:3: ( 'r->' )
            // InternalMyDsl.g:7188:4: 'r->'
            {
             before(grammarAccess.getJointRefAccess().getRevRKeyword_1_0()); 
            match(input,85,FOLLOW_2); 
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
    // InternalMyDsl.g:7199:1: rule__JointRef__PrisAssignment_2 : ( ( 'p->' ) ) ;
    public final void rule__JointRef__PrisAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7203:1: ( ( ( 'p->' ) ) )
            // InternalMyDsl.g:7204:2: ( ( 'p->' ) )
            {
            // InternalMyDsl.g:7204:2: ( ( 'p->' ) )
            // InternalMyDsl.g:7205:3: ( 'p->' )
            {
             before(grammarAccess.getJointRefAccess().getPrisPKeyword_2_0()); 
            // InternalMyDsl.g:7206:3: ( 'p->' )
            // InternalMyDsl.g:7207:4: 'p->'
            {
             before(grammarAccess.getJointRefAccess().getPrisPKeyword_2_0()); 
            match(input,86,FOLLOW_2); 
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
    // InternalMyDsl.g:7218:1: rule__JointRef__ContAssignment_3 : ( ( 'c->' ) ) ;
    public final void rule__JointRef__ContAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7222:1: ( ( ( 'c->' ) ) )
            // InternalMyDsl.g:7223:2: ( ( 'c->' ) )
            {
            // InternalMyDsl.g:7223:2: ( ( 'c->' ) )
            // InternalMyDsl.g:7224:3: ( 'c->' )
            {
             before(grammarAccess.getJointRefAccess().getContCKeyword_3_0()); 
            // InternalMyDsl.g:7225:3: ( 'c->' )
            // InternalMyDsl.g:7226:4: 'c->'
            {
             before(grammarAccess.getJointRefAccess().getContCKeyword_3_0()); 
            match(input,87,FOLLOW_2); 
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
    // InternalMyDsl.g:7237:1: rule__Link__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Link__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7241:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:7242:2: ( RULE_ID )
            {
            // InternalMyDsl.g:7242:2: ( RULE_ID )
            // InternalMyDsl.g:7243:3: RULE_ID
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
    // InternalMyDsl.g:7252:1: rule__Link__InertialAssignment_3_0_1_0 : ( ruleInertial ) ;
    public final void rule__Link__InertialAssignment_3_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7256:1: ( ( ruleInertial ) )
            // InternalMyDsl.g:7257:2: ( ruleInertial )
            {
            // InternalMyDsl.g:7257:2: ( ruleInertial )
            // InternalMyDsl.g:7258:3: ruleInertial
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
    // InternalMyDsl.g:7267:1: rule__Link__VisualAssignment_3_0_1_1 : ( ruleVisual ) ;
    public final void rule__Link__VisualAssignment_3_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7271:1: ( ( ruleVisual ) )
            // InternalMyDsl.g:7272:2: ( ruleVisual )
            {
            // InternalMyDsl.g:7272:2: ( ruleVisual )
            // InternalMyDsl.g:7273:3: ruleVisual
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
    // InternalMyDsl.g:7282:1: rule__Link__CollisionAssignment_3_0_1_2 : ( ruleCollision ) ;
    public final void rule__Link__CollisionAssignment_3_0_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7286:1: ( ( ruleCollision ) )
            // InternalMyDsl.g:7287:2: ( ruleCollision )
            {
            // InternalMyDsl.g:7287:2: ( ruleCollision )
            // InternalMyDsl.g:7288:3: ruleCollision
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
    // InternalMyDsl.g:7297:1: rule__Link__LinkAssignment_3_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Link__LinkAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7301:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:7302:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:7302:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:7303:3: ( RULE_ID )
            {
             before(grammarAccess.getLinkAccess().getLinkLinkCrossReference_3_1_1_0()); 
            // InternalMyDsl.g:7304:3: ( RULE_ID )
            // InternalMyDsl.g:7305:4: RULE_ID
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
    // InternalMyDsl.g:7316:1: rule__Link__ReuseAssignment_3_1_2 : ( ruleReuse ) ;
    public final void rule__Link__ReuseAssignment_3_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7320:1: ( ( ruleReuse ) )
            // InternalMyDsl.g:7321:2: ( ruleReuse )
            {
            // InternalMyDsl.g:7321:2: ( ruleReuse )
            // InternalMyDsl.g:7322:3: ruleReuse
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


    // $ANTLR start "rule__Reuse__AddAssignment_0_2"
    // InternalMyDsl.g:7331:1: rule__Reuse__AddAssignment_0_2 : ( ruleReUseAble ) ;
    public final void rule__Reuse__AddAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7335:1: ( ( ruleReUseAble ) )
            // InternalMyDsl.g:7336:2: ( ruleReUseAble )
            {
            // InternalMyDsl.g:7336:2: ( ruleReUseAble )
            // InternalMyDsl.g:7337:3: ruleReUseAble
            {
             before(grammarAccess.getReuseAccess().getAddReUseAbleParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleReUseAble();

            state._fsp--;

             after(grammarAccess.getReuseAccess().getAddReUseAbleParserRuleCall_0_2_0()); 

            }


            }

        }
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
    // InternalMyDsl.g:7346:1: rule__Reuse__EditAssignment_1_1 : ( ruleAssignNewValue ) ;
    public final void rule__Reuse__EditAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7350:1: ( ( ruleAssignNewValue ) )
            // InternalMyDsl.g:7351:2: ( ruleAssignNewValue )
            {
            // InternalMyDsl.g:7351:2: ( ruleAssignNewValue )
            // InternalMyDsl.g:7352:3: ruleAssignNewValue
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
    // InternalMyDsl.g:7361:1: rule__AssignNewValue__GetRefAssignment_1 : ( ruleDotExpression ) ;
    public final void rule__AssignNewValue__GetRefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7365:1: ( ( ruleDotExpression ) )
            // InternalMyDsl.g:7366:2: ( ruleDotExpression )
            {
            // InternalMyDsl.g:7366:2: ( ruleDotExpression )
            // InternalMyDsl.g:7367:3: ruleDotExpression
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


    // $ANTLR start "rule__AssignNewValue__NewValueAssignment_3"
    // InternalMyDsl.g:7376:1: rule__AssignNewValue__NewValueAssignment_3 : ( ruleURDFAttrNumeric ) ;
    public final void rule__AssignNewValue__NewValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7380:1: ( ( ruleURDFAttrNumeric ) )
            // InternalMyDsl.g:7381:2: ( ruleURDFAttrNumeric )
            {
            // InternalMyDsl.g:7381:2: ( ruleURDFAttrNumeric )
            // InternalMyDsl.g:7382:3: ruleURDFAttrNumeric
            {
             before(grammarAccess.getAssignNewValueAccess().getNewValueURDFAttrNumericParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleURDFAttrNumeric();

            state._fsp--;

             after(grammarAccess.getAssignNewValueAccess().getNewValueURDFAttrNumericParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignNewValue__NewValueAssignment_3"


    // $ANTLR start "rule__DotExpression__TailAssignment_1_2"
    // InternalMyDsl.g:7391:1: rule__DotExpression__TailAssignment_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__DotExpression__TailAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7395:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:7396:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:7396:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:7397:3: ( RULE_ID )
            {
             before(grammarAccess.getDotExpressionAccess().getTailReUseAbleCrossReference_1_2_0()); 
            // InternalMyDsl.g:7398:3: ( RULE_ID )
            // InternalMyDsl.g:7399:4: RULE_ID
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
    // InternalMyDsl.g:7410:1: rule__ReUsableRef__ReuseableAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ReUsableRef__ReuseableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7414:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:7415:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:7415:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:7416:3: ( RULE_ID )
            {
             before(grammarAccess.getReUsableRefAccess().getReuseableReUseAbleCrossReference_1_0()); 
            // InternalMyDsl.g:7417:3: ( RULE_ID )
            // InternalMyDsl.g:7418:4: RULE_ID
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
    // InternalMyDsl.g:7429:1: rule__Inertial__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Inertial__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7433:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:7434:2: ( RULE_ID )
            {
            // InternalMyDsl.g:7434:2: ( RULE_ID )
            // InternalMyDsl.g:7435:3: RULE_ID
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
    // InternalMyDsl.g:7444:1: rule__Inertial__InertiaAssignment_3 : ( ruleInertia ) ;
    public final void rule__Inertial__InertiaAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7448:1: ( ( ruleInertia ) )
            // InternalMyDsl.g:7449:2: ( ruleInertia )
            {
            // InternalMyDsl.g:7449:2: ( ruleInertia )
            // InternalMyDsl.g:7450:3: ruleInertia
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
    // InternalMyDsl.g:7459:1: rule__Inertial__MassAssignment_4 : ( ruleMass ) ;
    public final void rule__Inertial__MassAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7463:1: ( ( ruleMass ) )
            // InternalMyDsl.g:7464:2: ( ruleMass )
            {
            // InternalMyDsl.g:7464:2: ( ruleMass )
            // InternalMyDsl.g:7465:3: ruleMass
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
    // InternalMyDsl.g:7474:1: rule__Inertial__OriginAssignment_5 : ( ruleOrigin ) ;
    public final void rule__Inertial__OriginAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7478:1: ( ( ruleOrigin ) )
            // InternalMyDsl.g:7479:2: ( ruleOrigin )
            {
            // InternalMyDsl.g:7479:2: ( ruleOrigin )
            // InternalMyDsl.g:7480:3: ruleOrigin
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
    // InternalMyDsl.g:7489:1: rule__Inertia__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Inertia__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7493:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:7494:2: ( RULE_ID )
            {
            // InternalMyDsl.g:7494:2: ( RULE_ID )
            // InternalMyDsl.g:7495:3: RULE_ID
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
    // InternalMyDsl.g:7504:1: rule__Inertia__IxxAssignment_4 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__Inertia__IxxAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7508:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:7509:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:7509:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:7510:3: ruleURDFAttrSignedNumeric
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
    // InternalMyDsl.g:7519:1: rule__Inertia__IxyAssignment_6 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__Inertia__IxyAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7523:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:7524:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:7524:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:7525:3: ruleURDFAttrSignedNumeric
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
    // InternalMyDsl.g:7534:1: rule__Inertia__IxzAssignment_8 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__Inertia__IxzAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7538:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:7539:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:7539:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:7540:3: ruleURDFAttrSignedNumeric
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
    // InternalMyDsl.g:7549:1: rule__Inertia__IyyAssignment_10 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__Inertia__IyyAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7553:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:7554:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:7554:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:7555:3: ruleURDFAttrSignedNumeric
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
    // InternalMyDsl.g:7564:1: rule__Inertia__IyzAssignment_12 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__Inertia__IyzAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7568:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:7569:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:7569:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:7570:3: ruleURDFAttrSignedNumeric
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
    // InternalMyDsl.g:7579:1: rule__Inertia__IzzAssignment_14 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__Inertia__IzzAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7583:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:7584:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:7584:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:7585:3: ruleURDFAttrSignedNumeric
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
    // InternalMyDsl.g:7594:1: rule__Visual__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Visual__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7598:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:7599:2: ( RULE_ID )
            {
            // InternalMyDsl.g:7599:2: ( RULE_ID )
            // InternalMyDsl.g:7600:3: RULE_ID
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
    // InternalMyDsl.g:7609:1: rule__Visual__GeometryAssignment_4 : ( ruleGeometry ) ;
    public final void rule__Visual__GeometryAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7613:1: ( ( ruleGeometry ) )
            // InternalMyDsl.g:7614:2: ( ruleGeometry )
            {
            // InternalMyDsl.g:7614:2: ( ruleGeometry )
            // InternalMyDsl.g:7615:3: ruleGeometry
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
    // InternalMyDsl.g:7624:1: rule__Visual__OriginAssignment_5 : ( ruleOrigin ) ;
    public final void rule__Visual__OriginAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7628:1: ( ( ruleOrigin ) )
            // InternalMyDsl.g:7629:2: ( ruleOrigin )
            {
            // InternalMyDsl.g:7629:2: ( ruleOrigin )
            // InternalMyDsl.g:7630:3: ruleOrigin
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
    // InternalMyDsl.g:7639:1: rule__Visual__MaterialAssignment_6_1 : ( ruleMaterial ) ;
    public final void rule__Visual__MaterialAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7643:1: ( ( ruleMaterial ) )
            // InternalMyDsl.g:7644:2: ( ruleMaterial )
            {
            // InternalMyDsl.g:7644:2: ( ruleMaterial )
            // InternalMyDsl.g:7645:3: ruleMaterial
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
    // InternalMyDsl.g:7654:1: rule__Origin__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Origin__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7658:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:7659:2: ( RULE_ID )
            {
            // InternalMyDsl.g:7659:2: ( RULE_ID )
            // InternalMyDsl.g:7660:3: RULE_ID
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
    // InternalMyDsl.g:7669:1: rule__Origin__XAssignment_4 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__Origin__XAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7673:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:7674:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:7674:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:7675:3: ruleURDFAttrSignedNumeric
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
    // InternalMyDsl.g:7684:1: rule__Origin__YAssignment_6 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__Origin__YAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7688:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:7689:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:7689:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:7690:3: ruleURDFAttrSignedNumeric
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
    // InternalMyDsl.g:7699:1: rule__Origin__ZAssignment_8 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__Origin__ZAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7703:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:7704:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:7704:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:7705:3: ruleURDFAttrSignedNumeric
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
    // InternalMyDsl.g:7714:1: rule__Origin__RollAssignment_9_1 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__Origin__RollAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7718:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:7719:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:7719:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:7720:3: ruleURDFAttrSignedNumeric
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
    // InternalMyDsl.g:7729:1: rule__Origin__PitchAssignment_10_1 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__Origin__PitchAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7733:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:7734:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:7734:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:7735:3: ruleURDFAttrSignedNumeric
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
    // InternalMyDsl.g:7744:1: rule__Origin__YawAssignment_11_1 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__Origin__YawAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7748:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:7749:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:7749:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:7750:3: ruleURDFAttrSignedNumeric
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
    // InternalMyDsl.g:7759:1: rule__Mass__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Mass__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7763:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:7764:2: ( RULE_ID )
            {
            // InternalMyDsl.g:7764:2: ( RULE_ID )
            // InternalMyDsl.g:7765:3: RULE_ID
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
    // InternalMyDsl.g:7774:1: rule__Mass__MassKilogramAssignment_4 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__Mass__MassKilogramAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7778:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:7779:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:7779:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:7780:3: ruleURDFAttrSignedNumeric
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
    // InternalMyDsl.g:7789:1: rule__Collision__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Collision__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7793:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:7794:2: ( RULE_ID )
            {
            // InternalMyDsl.g:7794:2: ( RULE_ID )
            // InternalMyDsl.g:7795:3: RULE_ID
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
    // InternalMyDsl.g:7804:1: rule__Collision__GeometryAssignment_3 : ( ruleGeometry ) ;
    public final void rule__Collision__GeometryAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7808:1: ( ( ruleGeometry ) )
            // InternalMyDsl.g:7809:2: ( ruleGeometry )
            {
            // InternalMyDsl.g:7809:2: ( ruleGeometry )
            // InternalMyDsl.g:7810:3: ruleGeometry
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
    // InternalMyDsl.g:7819:1: rule__Collision__OriginAssignment_4 : ( ruleOrigin ) ;
    public final void rule__Collision__OriginAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7823:1: ( ( ruleOrigin ) )
            // InternalMyDsl.g:7824:2: ( ruleOrigin )
            {
            // InternalMyDsl.g:7824:2: ( ruleOrigin )
            // InternalMyDsl.g:7825:3: ruleOrigin
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
    // InternalMyDsl.g:7834:1: rule__Box__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Box__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7838:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:7839:2: ( RULE_ID )
            {
            // InternalMyDsl.g:7839:2: ( RULE_ID )
            // InternalMyDsl.g:7840:3: RULE_ID
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
    // InternalMyDsl.g:7849:1: rule__Box__HeightAssignment_3 : ( ruleURDFAttrNumeric ) ;
    public final void rule__Box__HeightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7853:1: ( ( ruleURDFAttrNumeric ) )
            // InternalMyDsl.g:7854:2: ( ruleURDFAttrNumeric )
            {
            // InternalMyDsl.g:7854:2: ( ruleURDFAttrNumeric )
            // InternalMyDsl.g:7855:3: ruleURDFAttrNumeric
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
    // InternalMyDsl.g:7864:1: rule__Box__LengthAssignment_5 : ( ruleURDFAttrNumeric ) ;
    public final void rule__Box__LengthAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7868:1: ( ( ruleURDFAttrNumeric ) )
            // InternalMyDsl.g:7869:2: ( ruleURDFAttrNumeric )
            {
            // InternalMyDsl.g:7869:2: ( ruleURDFAttrNumeric )
            // InternalMyDsl.g:7870:3: ruleURDFAttrNumeric
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
    // InternalMyDsl.g:7879:1: rule__Box__WidthAssignment_7 : ( ruleURDFAttrNumeric ) ;
    public final void rule__Box__WidthAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7883:1: ( ( ruleURDFAttrNumeric ) )
            // InternalMyDsl.g:7884:2: ( ruleURDFAttrNumeric )
            {
            // InternalMyDsl.g:7884:2: ( ruleURDFAttrNumeric )
            // InternalMyDsl.g:7885:3: ruleURDFAttrNumeric
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
    // InternalMyDsl.g:7894:1: rule__Cylinder__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Cylinder__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7898:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:7899:2: ( RULE_ID )
            {
            // InternalMyDsl.g:7899:2: ( RULE_ID )
            // InternalMyDsl.g:7900:3: RULE_ID
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
    // InternalMyDsl.g:7909:1: rule__Cylinder__RadiusAssignment_3 : ( ruleURDFAttrNumeric ) ;
    public final void rule__Cylinder__RadiusAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7913:1: ( ( ruleURDFAttrNumeric ) )
            // InternalMyDsl.g:7914:2: ( ruleURDFAttrNumeric )
            {
            // InternalMyDsl.g:7914:2: ( ruleURDFAttrNumeric )
            // InternalMyDsl.g:7915:3: ruleURDFAttrNumeric
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
    // InternalMyDsl.g:7924:1: rule__Cylinder__LengthAssignment_5 : ( ruleURDFAttrNumeric ) ;
    public final void rule__Cylinder__LengthAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7928:1: ( ( ruleURDFAttrNumeric ) )
            // InternalMyDsl.g:7929:2: ( ruleURDFAttrNumeric )
            {
            // InternalMyDsl.g:7929:2: ( ruleURDFAttrNumeric )
            // InternalMyDsl.g:7930:3: ruleURDFAttrNumeric
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
    // InternalMyDsl.g:7939:1: rule__Mesh__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Mesh__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7943:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:7944:2: ( RULE_ID )
            {
            // InternalMyDsl.g:7944:2: ( RULE_ID )
            // InternalMyDsl.g:7945:3: RULE_ID
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
    // InternalMyDsl.g:7954:1: rule__Mesh__PathToFileAssignment_3 : ( ruleURDFAttrSTRING ) ;
    public final void rule__Mesh__PathToFileAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7958:1: ( ( ruleURDFAttrSTRING ) )
            // InternalMyDsl.g:7959:2: ( ruleURDFAttrSTRING )
            {
            // InternalMyDsl.g:7959:2: ( ruleURDFAttrSTRING )
            // InternalMyDsl.g:7960:3: ruleURDFAttrSTRING
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
    // InternalMyDsl.g:7969:1: rule__Sphere__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Sphere__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7973:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:7974:2: ( RULE_ID )
            {
            // InternalMyDsl.g:7974:2: ( RULE_ID )
            // InternalMyDsl.g:7975:3: RULE_ID
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
    // InternalMyDsl.g:7984:1: rule__Sphere__RadiusAssignment_3 : ( ruleURDFAttrNumeric ) ;
    public final void rule__Sphere__RadiusAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7988:1: ( ( ruleURDFAttrNumeric ) )
            // InternalMyDsl.g:7989:2: ( ruleURDFAttrNumeric )
            {
            // InternalMyDsl.g:7989:2: ( ruleURDFAttrNumeric )
            // InternalMyDsl.g:7990:3: ruleURDFAttrNumeric
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
    // InternalMyDsl.g:7999:1: rule__Texture__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Texture__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8003:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:8004:2: ( RULE_ID )
            {
            // InternalMyDsl.g:8004:2: ( RULE_ID )
            // InternalMyDsl.g:8005:3: RULE_ID
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
    // InternalMyDsl.g:8014:1: rule__Texture__PathToFileAssignment_3 : ( ruleURDFAttrSTRING ) ;
    public final void rule__Texture__PathToFileAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8018:1: ( ( ruleURDFAttrSTRING ) )
            // InternalMyDsl.g:8019:2: ( ruleURDFAttrSTRING )
            {
            // InternalMyDsl.g:8019:2: ( ruleURDFAttrSTRING )
            // InternalMyDsl.g:8020:3: ruleURDFAttrSTRING
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
    // InternalMyDsl.g:8029:1: rule__Color__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Color__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8033:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:8034:2: ( RULE_ID )
            {
            // InternalMyDsl.g:8034:2: ( RULE_ID )
            // InternalMyDsl.g:8035:3: RULE_ID
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
    // InternalMyDsl.g:8044:1: rule__Color__RedAssignment_3 : ( ruleURDFAttrFloat ) ;
    public final void rule__Color__RedAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8048:1: ( ( ruleURDFAttrFloat ) )
            // InternalMyDsl.g:8049:2: ( ruleURDFAttrFloat )
            {
            // InternalMyDsl.g:8049:2: ( ruleURDFAttrFloat )
            // InternalMyDsl.g:8050:3: ruleURDFAttrFloat
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
    // InternalMyDsl.g:8059:1: rule__Color__GreenAssignment_5 : ( ruleURDFAttrFloat ) ;
    public final void rule__Color__GreenAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8063:1: ( ( ruleURDFAttrFloat ) )
            // InternalMyDsl.g:8064:2: ( ruleURDFAttrFloat )
            {
            // InternalMyDsl.g:8064:2: ( ruleURDFAttrFloat )
            // InternalMyDsl.g:8065:3: ruleURDFAttrFloat
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
    // InternalMyDsl.g:8074:1: rule__Color__BlueAssignment_7 : ( ruleURDFAttrFloat ) ;
    public final void rule__Color__BlueAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8078:1: ( ( ruleURDFAttrFloat ) )
            // InternalMyDsl.g:8079:2: ( ruleURDFAttrFloat )
            {
            // InternalMyDsl.g:8079:2: ( ruleURDFAttrFloat )
            // InternalMyDsl.g:8080:3: ruleURDFAttrFloat
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
    // InternalMyDsl.g:8089:1: rule__Color__AlphaAssignment_9 : ( ruleURDFAttrFloat ) ;
    public final void rule__Color__AlphaAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8093:1: ( ( ruleURDFAttrFloat ) )
            // InternalMyDsl.g:8094:2: ( ruleURDFAttrFloat )
            {
            // InternalMyDsl.g:8094:2: ( ruleURDFAttrFloat )
            // InternalMyDsl.g:8095:3: ruleURDFAttrFloat
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
    // InternalMyDsl.g:8104:1: rule__Joint__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Joint__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8108:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:8109:2: ( RULE_ID )
            {
            // InternalMyDsl.g:8109:2: ( RULE_ID )
            // InternalMyDsl.g:8110:3: RULE_ID
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
    // InternalMyDsl.g:8119:1: rule__Joint__ChildOfAssignment_2_0_0_2 : ( ( RULE_ID ) ) ;
    public final void rule__Joint__ChildOfAssignment_2_0_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8123:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:8124:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:8124:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:8125:3: ( RULE_ID )
            {
             before(grammarAccess.getJointAccess().getChildOfLinkCrossReference_2_0_0_2_0()); 
            // InternalMyDsl.g:8126:3: ( RULE_ID )
            // InternalMyDsl.g:8127:4: RULE_ID
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
    // InternalMyDsl.g:8138:1: rule__Joint__ParentOfAssignment_2_0_0_4 : ( ( RULE_ID ) ) ;
    public final void rule__Joint__ParentOfAssignment_2_0_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8142:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:8143:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:8143:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:8144:3: ( RULE_ID )
            {
             before(grammarAccess.getJointAccess().getParentOfLinkCrossReference_2_0_0_4_0()); 
            // InternalMyDsl.g:8145:3: ( RULE_ID )
            // InternalMyDsl.g:8146:4: RULE_ID
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
    // InternalMyDsl.g:8157:1: rule__Joint__TypeAssignment_2_0_0_6 : ( ruleJointType ) ;
    public final void rule__Joint__TypeAssignment_2_0_0_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8161:1: ( ( ruleJointType ) )
            // InternalMyDsl.g:8162:2: ( ruleJointType )
            {
            // InternalMyDsl.g:8162:2: ( ruleJointType )
            // InternalMyDsl.g:8163:3: ruleJointType
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
    // InternalMyDsl.g:8172:1: rule__Joint__OriginAssignment_2_0_1_0 : ( ruleOrigin ) ;
    public final void rule__Joint__OriginAssignment_2_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8176:1: ( ( ruleOrigin ) )
            // InternalMyDsl.g:8177:2: ( ruleOrigin )
            {
            // InternalMyDsl.g:8177:2: ( ruleOrigin )
            // InternalMyDsl.g:8178:3: ruleOrigin
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
    // InternalMyDsl.g:8187:1: rule__Joint__AxisAssignment_2_0_1_1 : ( ruleAxis ) ;
    public final void rule__Joint__AxisAssignment_2_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8191:1: ( ( ruleAxis ) )
            // InternalMyDsl.g:8192:2: ( ruleAxis )
            {
            // InternalMyDsl.g:8192:2: ( ruleAxis )
            // InternalMyDsl.g:8193:3: ruleAxis
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
    // InternalMyDsl.g:8202:1: rule__Joint__LimitAssignment_2_0_1_2 : ( ruleLimit ) ;
    public final void rule__Joint__LimitAssignment_2_0_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8206:1: ( ( ruleLimit ) )
            // InternalMyDsl.g:8207:2: ( ruleLimit )
            {
            // InternalMyDsl.g:8207:2: ( ruleLimit )
            // InternalMyDsl.g:8208:3: ruleLimit
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
    // InternalMyDsl.g:8217:1: rule__Joint__CalibrationAssignment_2_0_1_3 : ( ruleCalibration ) ;
    public final void rule__Joint__CalibrationAssignment_2_0_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8221:1: ( ( ruleCalibration ) )
            // InternalMyDsl.g:8222:2: ( ruleCalibration )
            {
            // InternalMyDsl.g:8222:2: ( ruleCalibration )
            // InternalMyDsl.g:8223:3: ruleCalibration
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
    // InternalMyDsl.g:8232:1: rule__Joint__DynamicsAssignment_2_0_1_4 : ( ruleDynamics ) ;
    public final void rule__Joint__DynamicsAssignment_2_0_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8236:1: ( ( ruleDynamics ) )
            // InternalMyDsl.g:8237:2: ( ruleDynamics )
            {
            // InternalMyDsl.g:8237:2: ( ruleDynamics )
            // InternalMyDsl.g:8238:3: ruleDynamics
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
    // InternalMyDsl.g:8247:1: rule__Joint__SafetycontrollerAssignment_2_0_1_5 : ( ruleSafetyController ) ;
    public final void rule__Joint__SafetycontrollerAssignment_2_0_1_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8251:1: ( ( ruleSafetyController ) )
            // InternalMyDsl.g:8252:2: ( ruleSafetyController )
            {
            // InternalMyDsl.g:8252:2: ( ruleSafetyController )
            // InternalMyDsl.g:8253:3: ruleSafetyController
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
    // InternalMyDsl.g:8262:1: rule__Joint__IsReuseOfAssignment_2_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Joint__IsReuseOfAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8266:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:8267:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:8267:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:8268:3: ( RULE_ID )
            {
             before(grammarAccess.getJointAccess().getIsReuseOfJointCrossReference_2_1_1_0()); 
            // InternalMyDsl.g:8269:3: ( RULE_ID )
            // InternalMyDsl.g:8270:4: RULE_ID
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
    // InternalMyDsl.g:8281:1: rule__Joint__ChildOfAssignment_2_1_3 : ( ( RULE_ID ) ) ;
    public final void rule__Joint__ChildOfAssignment_2_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8285:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:8286:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:8286:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:8287:3: ( RULE_ID )
            {
             before(grammarAccess.getJointAccess().getChildOfLinkCrossReference_2_1_3_0()); 
            // InternalMyDsl.g:8288:3: ( RULE_ID )
            // InternalMyDsl.g:8289:4: RULE_ID
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
    // InternalMyDsl.g:8300:1: rule__Joint__ParentOfAssignment_2_1_5 : ( ( RULE_ID ) ) ;
    public final void rule__Joint__ParentOfAssignment_2_1_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8304:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:8305:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:8305:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:8306:3: ( RULE_ID )
            {
             before(grammarAccess.getJointAccess().getParentOfLinkCrossReference_2_1_5_0()); 
            // InternalMyDsl.g:8307:3: ( RULE_ID )
            // InternalMyDsl.g:8308:4: RULE_ID
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
    // InternalMyDsl.g:8319:1: rule__Joint__ReuseAssignment_2_1_6 : ( ruleReuse ) ;
    public final void rule__Joint__ReuseAssignment_2_1_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8323:1: ( ( ruleReuse ) )
            // InternalMyDsl.g:8324:2: ( ruleReuse )
            {
            // InternalMyDsl.g:8324:2: ( ruleReuse )
            // InternalMyDsl.g:8325:3: ruleReuse
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
    // InternalMyDsl.g:8334:1: rule__Axis__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Axis__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8338:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:8339:2: ( RULE_ID )
            {
            // InternalMyDsl.g:8339:2: ( RULE_ID )
            // InternalMyDsl.g:8340:3: RULE_ID
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
    // InternalMyDsl.g:8349:1: rule__Axis__XAssignment_3 : ( ruleURDFAttrINT ) ;
    public final void rule__Axis__XAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8353:1: ( ( ruleURDFAttrINT ) )
            // InternalMyDsl.g:8354:2: ( ruleURDFAttrINT )
            {
            // InternalMyDsl.g:8354:2: ( ruleURDFAttrINT )
            // InternalMyDsl.g:8355:3: ruleURDFAttrINT
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
    // InternalMyDsl.g:8364:1: rule__Axis__YAssignment_5 : ( ruleURDFAttrINT ) ;
    public final void rule__Axis__YAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8368:1: ( ( ruleURDFAttrINT ) )
            // InternalMyDsl.g:8369:2: ( ruleURDFAttrINT )
            {
            // InternalMyDsl.g:8369:2: ( ruleURDFAttrINT )
            // InternalMyDsl.g:8370:3: ruleURDFAttrINT
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
    // InternalMyDsl.g:8379:1: rule__Axis__ZAssignment_7 : ( ruleURDFAttrINT ) ;
    public final void rule__Axis__ZAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8383:1: ( ( ruleURDFAttrINT ) )
            // InternalMyDsl.g:8384:2: ( ruleURDFAttrINT )
            {
            // InternalMyDsl.g:8384:2: ( ruleURDFAttrINT )
            // InternalMyDsl.g:8385:3: ruleURDFAttrINT
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
    // InternalMyDsl.g:8394:1: rule__Limit__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Limit__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8398:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:8399:2: ( RULE_ID )
            {
            // InternalMyDsl.g:8399:2: ( RULE_ID )
            // InternalMyDsl.g:8400:3: RULE_ID
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
    // InternalMyDsl.g:8409:1: rule__Limit__EffortAssignment_3 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__Limit__EffortAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8413:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:8414:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:8414:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:8415:3: ruleURDFAttrSignedNumeric
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
    // InternalMyDsl.g:8424:1: rule__Limit__VelocityAssignment_5 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__Limit__VelocityAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8428:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:8429:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:8429:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:8430:3: ruleURDFAttrSignedNumeric
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
    // InternalMyDsl.g:8439:1: rule__Limit__LowerAssignment_7 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__Limit__LowerAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8443:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:8444:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:8444:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:8445:3: ruleURDFAttrSignedNumeric
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
    // InternalMyDsl.g:8454:1: rule__Limit__UpperAssignment_9 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__Limit__UpperAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8458:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:8459:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:8459:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:8460:3: ruleURDFAttrSignedNumeric
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
    // InternalMyDsl.g:8469:1: rule__Calibration__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Calibration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8473:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:8474:2: ( RULE_ID )
            {
            // InternalMyDsl.g:8474:2: ( RULE_ID )
            // InternalMyDsl.g:8475:3: RULE_ID
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
    // InternalMyDsl.g:8484:1: rule__Calibration__RisingAssignment_3_1 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__Calibration__RisingAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8488:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:8489:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:8489:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:8490:3: ruleURDFAttrSignedNumeric
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
    // InternalMyDsl.g:8499:1: rule__Calibration__FallingAssignment_4_1 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__Calibration__FallingAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8503:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:8504:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:8504:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:8505:3: ruleURDFAttrSignedNumeric
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
    // InternalMyDsl.g:8514:1: rule__Dynamics__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Dynamics__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8518:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:8519:2: ( RULE_ID )
            {
            // InternalMyDsl.g:8519:2: ( RULE_ID )
            // InternalMyDsl.g:8520:3: RULE_ID
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
    // InternalMyDsl.g:8529:1: rule__Dynamics__FrictionAssignment_3_1 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__Dynamics__FrictionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8533:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:8534:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:8534:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:8535:3: ruleURDFAttrSignedNumeric
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
    // InternalMyDsl.g:8544:1: rule__Dynamics__DampingAssignment_4_1 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__Dynamics__DampingAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8548:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:8549:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:8549:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:8550:3: ruleURDFAttrSignedNumeric
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
    // InternalMyDsl.g:8559:1: rule__SafetyController__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SafetyController__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8563:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:8564:2: ( RULE_ID )
            {
            // InternalMyDsl.g:8564:2: ( RULE_ID )
            // InternalMyDsl.g:8565:3: RULE_ID
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
    // InternalMyDsl.g:8574:1: rule__SafetyController__K_velocityAssignment_3 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__SafetyController__K_velocityAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8578:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:8579:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:8579:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:8580:3: ruleURDFAttrSignedNumeric
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
    // InternalMyDsl.g:8589:1: rule__SafetyController__K_positionAssignment_4_1 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__SafetyController__K_positionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8593:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:8594:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:8594:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:8595:3: ruleURDFAttrSignedNumeric
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
    // InternalMyDsl.g:8604:1: rule__SafetyController__SoftLowerLimitAssignment_5_1 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__SafetyController__SoftLowerLimitAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8608:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:8609:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:8609:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:8610:3: ruleURDFAttrSignedNumeric
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
    // InternalMyDsl.g:8619:1: rule__SafetyController__SoftUpperLimitAssignment_6_1 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__SafetyController__SoftUpperLimitAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8623:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:8624:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:8624:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:8625:3: ruleURDFAttrSignedNumeric
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
    // InternalMyDsl.g:8634:1: rule__URDFAttrSignedNumeric__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__URDFAttrSignedNumeric__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8638:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:8639:2: ( RULE_ID )
            {
            // InternalMyDsl.g:8639:2: ( RULE_ID )
            // InternalMyDsl.g:8640:3: RULE_ID
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
    // InternalMyDsl.g:8649:1: rule__URDFAttrSignedNumeric__ValueAssignment_2 : ( ruleSIGNED_NUMERIC ) ;
    public final void rule__URDFAttrSignedNumeric__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8653:1: ( ( ruleSIGNED_NUMERIC ) )
            // InternalMyDsl.g:8654:2: ( ruleSIGNED_NUMERIC )
            {
            // InternalMyDsl.g:8654:2: ( ruleSIGNED_NUMERIC )
            // InternalMyDsl.g:8655:3: ruleSIGNED_NUMERIC
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
    // InternalMyDsl.g:8664:1: rule__URDFAttrFloat__ValueAssignment : ( ruleFLOAT ) ;
    public final void rule__URDFAttrFloat__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8668:1: ( ( ruleFLOAT ) )
            // InternalMyDsl.g:8669:2: ( ruleFLOAT )
            {
            // InternalMyDsl.g:8669:2: ( ruleFLOAT )
            // InternalMyDsl.g:8670:3: ruleFLOAT
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
    // InternalMyDsl.g:8679:1: rule__URDFAttrINT__ValueAssignment : ( RULE_INT ) ;
    public final void rule__URDFAttrINT__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8683:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:8684:2: ( RULE_INT )
            {
            // InternalMyDsl.g:8684:2: ( RULE_INT )
            // InternalMyDsl.g:8685:3: RULE_INT
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
    // InternalMyDsl.g:8694:1: rule__URDFAttrNumeric__ValueAssignment : ( ruleNUMERIC ) ;
    public final void rule__URDFAttrNumeric__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8698:1: ( ( ruleNUMERIC ) )
            // InternalMyDsl.g:8699:2: ( ruleNUMERIC )
            {
            // InternalMyDsl.g:8699:2: ( ruleNUMERIC )
            // InternalMyDsl.g:8700:3: ruleNUMERIC
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
    // InternalMyDsl.g:8709:1: rule__URDFAttrSTRING__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__URDFAttrSTRING__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8713:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:8714:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:8714:2: ( RULE_STRING )
            // InternalMyDsl.g:8715:3: RULE_STRING
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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x40000000000C0000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x40000000000C0002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000000L,0x0000000000F00000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000400404000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000400404000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000400404080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000020L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000001030L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000800000020L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x00A8800000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x00A8800000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0300000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000004000000020L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x00000E0000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000200000000020L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0001000000000020L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0010000000000020L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0040000000000020L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0400000000000020L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000002000000000L,0x000000000000490CL});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000002000000002L,0x000000000000490CL});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000020L,0x0000000000000010L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000001030L,0x0000000000000080L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000020L,0x0000000000000600L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000020L,0x0000000000003000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000020L,0x0000000000008000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000000L,0x0000000000070000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000001810L});

}