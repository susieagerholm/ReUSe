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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'+'", "'-'", "'fixed'", "'revolute'", "'prismatic'", "'continuous'", "'Robot'", "'Link'", "'def'", "'reuse'", "'edit'", "'add'", "'.'", "'Inertial'", "'Inertia'", "'ixx'", "'ixy'", "'ixz'", "'iyy'", "'iyz'", "'izz'", "'Visual'", "'Geometry'", "'Material'", "'Origin'", "'x'", "'y'", "'z'", "'roll'", "'pitch'", "'yaw'", "'Mass'", "'massKilogram'", "'Collision'", "'Box'", "'height'", "'length'", "'width'", "'Cylinder'", "'radius'", "'Mesh'", "'pathToFile'", "'Sphere'", "'Texture'", "'Color'", "'red'", "'green'", "'blue'", "'alpha'", "'Joint'", "'ChildOf'", "'ParentOf'", "'Type'", "'Axis'", "'Limit'", "'effort'", "'velocity'", "'lower'", "'upper'", "'Calibration'", "'rising'", "'falling'", "'Dynamics'", "'friction'", "'damping'", "'SafetyController'", "'k_velocity'", "'k_position'", "'softLowerLimit'", "'softUpperLimit'", "'e'"
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
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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


    // $ANTLR start "entryRuleReUseAble"
    // InternalMyDsl.g:78:1: entryRuleReUseAble : ruleReUseAble EOF ;
    public final void entryRuleReUseAble() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleReUseAble EOF )
            // InternalMyDsl.g:80:1: ruleReUseAble EOF
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
    // InternalMyDsl.g:87:1: ruleReUseAble : ( ( rule__ReUseAble__Alternatives ) ) ;
    public final void ruleReUseAble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__ReUseAble__Alternatives ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__ReUseAble__Alternatives ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__ReUseAble__Alternatives ) )
            // InternalMyDsl.g:93:3: ( rule__ReUseAble__Alternatives )
            {
             before(grammarAccess.getReUseAbleAccess().getAlternatives()); 
            // InternalMyDsl.g:94:3: ( rule__ReUseAble__Alternatives )
            // InternalMyDsl.g:94:4: rule__ReUseAble__Alternatives
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
    // InternalMyDsl.g:103:1: entryRuleLink : ruleLink EOF ;
    public final void entryRuleLink() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleLink EOF )
            // InternalMyDsl.g:105:1: ruleLink EOF
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
    // InternalMyDsl.g:112:1: ruleLink : ( ( rule__Link__Group__0 ) ) ;
    public final void ruleLink() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Link__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Link__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Link__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__Link__Group__0 )
            {
             before(grammarAccess.getLinkAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__Link__Group__0 )
            // InternalMyDsl.g:119:4: rule__Link__Group__0
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
    // InternalMyDsl.g:128:1: entryRuleReuse : ruleReuse EOF ;
    public final void entryRuleReuse() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleReuse EOF )
            // InternalMyDsl.g:130:1: ruleReuse EOF
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
    // InternalMyDsl.g:137:1: ruleReuse : ( ( rule__Reuse__Group__0 ) ) ;
    public final void ruleReuse() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Reuse__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Reuse__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Reuse__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__Reuse__Group__0 )
            {
             before(grammarAccess.getReuseAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__Reuse__Group__0 )
            // InternalMyDsl.g:144:4: rule__Reuse__Group__0
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
    // InternalMyDsl.g:153:1: entryRuleDotExpression : ruleDotExpression EOF ;
    public final void entryRuleDotExpression() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleDotExpression EOF )
            // InternalMyDsl.g:155:1: ruleDotExpression EOF
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
    // InternalMyDsl.g:162:1: ruleDotExpression : ( ( rule__DotExpression__Group__0 ) ) ;
    public final void ruleDotExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__DotExpression__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__DotExpression__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__DotExpression__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__DotExpression__Group__0 )
            {
             before(grammarAccess.getDotExpressionAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__DotExpression__Group__0 )
            // InternalMyDsl.g:169:4: rule__DotExpression__Group__0
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
    // InternalMyDsl.g:178:1: entryRuleReUsableRef : ruleReUsableRef EOF ;
    public final void entryRuleReUsableRef() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleReUsableRef EOF )
            // InternalMyDsl.g:180:1: ruleReUsableRef EOF
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
    // InternalMyDsl.g:187:1: ruleReUsableRef : ( ( rule__ReUsableRef__Group__0 ) ) ;
    public final void ruleReUsableRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__ReUsableRef__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__ReUsableRef__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__ReUsableRef__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__ReUsableRef__Group__0 )
            {
             before(grammarAccess.getReUsableRefAccess().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__ReUsableRef__Group__0 )
            // InternalMyDsl.g:194:4: rule__ReUsableRef__Group__0
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
    // InternalMyDsl.g:203:1: entryRuleInertial : ruleInertial EOF ;
    public final void entryRuleInertial() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleInertial EOF )
            // InternalMyDsl.g:205:1: ruleInertial EOF
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
    // InternalMyDsl.g:212:1: ruleInertial : ( ( rule__Inertial__Group__0 ) ) ;
    public final void ruleInertial() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__Inertial__Group__0 ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__Inertial__Group__0 ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__Inertial__Group__0 ) )
            // InternalMyDsl.g:218:3: ( rule__Inertial__Group__0 )
            {
             before(grammarAccess.getInertialAccess().getGroup()); 
            // InternalMyDsl.g:219:3: ( rule__Inertial__Group__0 )
            // InternalMyDsl.g:219:4: rule__Inertial__Group__0
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
    // InternalMyDsl.g:228:1: entryRuleInertia : ruleInertia EOF ;
    public final void entryRuleInertia() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleInertia EOF )
            // InternalMyDsl.g:230:1: ruleInertia EOF
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
    // InternalMyDsl.g:237:1: ruleInertia : ( ( rule__Inertia__Group__0 ) ) ;
    public final void ruleInertia() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__Inertia__Group__0 ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__Inertia__Group__0 ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__Inertia__Group__0 ) )
            // InternalMyDsl.g:243:3: ( rule__Inertia__Group__0 )
            {
             before(grammarAccess.getInertiaAccess().getGroup()); 
            // InternalMyDsl.g:244:3: ( rule__Inertia__Group__0 )
            // InternalMyDsl.g:244:4: rule__Inertia__Group__0
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
    // InternalMyDsl.g:253:1: entryRuleVisual : ruleVisual EOF ;
    public final void entryRuleVisual() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleVisual EOF )
            // InternalMyDsl.g:255:1: ruleVisual EOF
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
    // InternalMyDsl.g:262:1: ruleVisual : ( ( rule__Visual__Group__0 ) ) ;
    public final void ruleVisual() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__Visual__Group__0 ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__Visual__Group__0 ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__Visual__Group__0 ) )
            // InternalMyDsl.g:268:3: ( rule__Visual__Group__0 )
            {
             before(grammarAccess.getVisualAccess().getGroup()); 
            // InternalMyDsl.g:269:3: ( rule__Visual__Group__0 )
            // InternalMyDsl.g:269:4: rule__Visual__Group__0
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
    // InternalMyDsl.g:278:1: entryRuleOrigin : ruleOrigin EOF ;
    public final void entryRuleOrigin() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( ruleOrigin EOF )
            // InternalMyDsl.g:280:1: ruleOrigin EOF
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
    // InternalMyDsl.g:287:1: ruleOrigin : ( ( rule__Origin__Group__0 ) ) ;
    public final void ruleOrigin() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__Origin__Group__0 ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__Origin__Group__0 ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__Origin__Group__0 ) )
            // InternalMyDsl.g:293:3: ( rule__Origin__Group__0 )
            {
             before(grammarAccess.getOriginAccess().getGroup()); 
            // InternalMyDsl.g:294:3: ( rule__Origin__Group__0 )
            // InternalMyDsl.g:294:4: rule__Origin__Group__0
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
    // InternalMyDsl.g:303:1: entryRuleMass : ruleMass EOF ;
    public final void entryRuleMass() throws RecognitionException {
        try {
            // InternalMyDsl.g:304:1: ( ruleMass EOF )
            // InternalMyDsl.g:305:1: ruleMass EOF
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
    // InternalMyDsl.g:312:1: ruleMass : ( ( rule__Mass__Group__0 ) ) ;
    public final void ruleMass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:2: ( ( ( rule__Mass__Group__0 ) ) )
            // InternalMyDsl.g:317:2: ( ( rule__Mass__Group__0 ) )
            {
            // InternalMyDsl.g:317:2: ( ( rule__Mass__Group__0 ) )
            // InternalMyDsl.g:318:3: ( rule__Mass__Group__0 )
            {
             before(grammarAccess.getMassAccess().getGroup()); 
            // InternalMyDsl.g:319:3: ( rule__Mass__Group__0 )
            // InternalMyDsl.g:319:4: rule__Mass__Group__0
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
    // InternalMyDsl.g:328:1: entryRuleCollision : ruleCollision EOF ;
    public final void entryRuleCollision() throws RecognitionException {
        try {
            // InternalMyDsl.g:329:1: ( ruleCollision EOF )
            // InternalMyDsl.g:330:1: ruleCollision EOF
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
    // InternalMyDsl.g:337:1: ruleCollision : ( ( rule__Collision__Group__0 ) ) ;
    public final void ruleCollision() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:341:2: ( ( ( rule__Collision__Group__0 ) ) )
            // InternalMyDsl.g:342:2: ( ( rule__Collision__Group__0 ) )
            {
            // InternalMyDsl.g:342:2: ( ( rule__Collision__Group__0 ) )
            // InternalMyDsl.g:343:3: ( rule__Collision__Group__0 )
            {
             before(grammarAccess.getCollisionAccess().getGroup()); 
            // InternalMyDsl.g:344:3: ( rule__Collision__Group__0 )
            // InternalMyDsl.g:344:4: rule__Collision__Group__0
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
    // InternalMyDsl.g:353:1: entryRuleGeometry : ruleGeometry EOF ;
    public final void entryRuleGeometry() throws RecognitionException {
        try {
            // InternalMyDsl.g:354:1: ( ruleGeometry EOF )
            // InternalMyDsl.g:355:1: ruleGeometry EOF
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
    // InternalMyDsl.g:362:1: ruleGeometry : ( ( rule__Geometry__Alternatives ) ) ;
    public final void ruleGeometry() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:366:2: ( ( ( rule__Geometry__Alternatives ) ) )
            // InternalMyDsl.g:367:2: ( ( rule__Geometry__Alternatives ) )
            {
            // InternalMyDsl.g:367:2: ( ( rule__Geometry__Alternatives ) )
            // InternalMyDsl.g:368:3: ( rule__Geometry__Alternatives )
            {
             before(grammarAccess.getGeometryAccess().getAlternatives()); 
            // InternalMyDsl.g:369:3: ( rule__Geometry__Alternatives )
            // InternalMyDsl.g:369:4: rule__Geometry__Alternatives
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
    // InternalMyDsl.g:378:1: entryRuleBox : ruleBox EOF ;
    public final void entryRuleBox() throws RecognitionException {
        try {
            // InternalMyDsl.g:379:1: ( ruleBox EOF )
            // InternalMyDsl.g:380:1: ruleBox EOF
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
    // InternalMyDsl.g:387:1: ruleBox : ( ( rule__Box__Group__0 ) ) ;
    public final void ruleBox() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:391:2: ( ( ( rule__Box__Group__0 ) ) )
            // InternalMyDsl.g:392:2: ( ( rule__Box__Group__0 ) )
            {
            // InternalMyDsl.g:392:2: ( ( rule__Box__Group__0 ) )
            // InternalMyDsl.g:393:3: ( rule__Box__Group__0 )
            {
             before(grammarAccess.getBoxAccess().getGroup()); 
            // InternalMyDsl.g:394:3: ( rule__Box__Group__0 )
            // InternalMyDsl.g:394:4: rule__Box__Group__0
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
    // InternalMyDsl.g:403:1: entryRuleCylinder : ruleCylinder EOF ;
    public final void entryRuleCylinder() throws RecognitionException {
        try {
            // InternalMyDsl.g:404:1: ( ruleCylinder EOF )
            // InternalMyDsl.g:405:1: ruleCylinder EOF
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
    // InternalMyDsl.g:412:1: ruleCylinder : ( ( rule__Cylinder__Group__0 ) ) ;
    public final void ruleCylinder() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:416:2: ( ( ( rule__Cylinder__Group__0 ) ) )
            // InternalMyDsl.g:417:2: ( ( rule__Cylinder__Group__0 ) )
            {
            // InternalMyDsl.g:417:2: ( ( rule__Cylinder__Group__0 ) )
            // InternalMyDsl.g:418:3: ( rule__Cylinder__Group__0 )
            {
             before(grammarAccess.getCylinderAccess().getGroup()); 
            // InternalMyDsl.g:419:3: ( rule__Cylinder__Group__0 )
            // InternalMyDsl.g:419:4: rule__Cylinder__Group__0
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
    // InternalMyDsl.g:428:1: entryRuleMesh : ruleMesh EOF ;
    public final void entryRuleMesh() throws RecognitionException {
        try {
            // InternalMyDsl.g:429:1: ( ruleMesh EOF )
            // InternalMyDsl.g:430:1: ruleMesh EOF
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
    // InternalMyDsl.g:437:1: ruleMesh : ( ( rule__Mesh__Group__0 ) ) ;
    public final void ruleMesh() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:441:2: ( ( ( rule__Mesh__Group__0 ) ) )
            // InternalMyDsl.g:442:2: ( ( rule__Mesh__Group__0 ) )
            {
            // InternalMyDsl.g:442:2: ( ( rule__Mesh__Group__0 ) )
            // InternalMyDsl.g:443:3: ( rule__Mesh__Group__0 )
            {
             before(grammarAccess.getMeshAccess().getGroup()); 
            // InternalMyDsl.g:444:3: ( rule__Mesh__Group__0 )
            // InternalMyDsl.g:444:4: rule__Mesh__Group__0
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
    // InternalMyDsl.g:453:1: entryRuleSphere : ruleSphere EOF ;
    public final void entryRuleSphere() throws RecognitionException {
        try {
            // InternalMyDsl.g:454:1: ( ruleSphere EOF )
            // InternalMyDsl.g:455:1: ruleSphere EOF
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
    // InternalMyDsl.g:462:1: ruleSphere : ( ( rule__Sphere__Group__0 ) ) ;
    public final void ruleSphere() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:466:2: ( ( ( rule__Sphere__Group__0 ) ) )
            // InternalMyDsl.g:467:2: ( ( rule__Sphere__Group__0 ) )
            {
            // InternalMyDsl.g:467:2: ( ( rule__Sphere__Group__0 ) )
            // InternalMyDsl.g:468:3: ( rule__Sphere__Group__0 )
            {
             before(grammarAccess.getSphereAccess().getGroup()); 
            // InternalMyDsl.g:469:3: ( rule__Sphere__Group__0 )
            // InternalMyDsl.g:469:4: rule__Sphere__Group__0
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
    // InternalMyDsl.g:478:1: entryRuleMaterial : ruleMaterial EOF ;
    public final void entryRuleMaterial() throws RecognitionException {
        try {
            // InternalMyDsl.g:479:1: ( ruleMaterial EOF )
            // InternalMyDsl.g:480:1: ruleMaterial EOF
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
    // InternalMyDsl.g:487:1: ruleMaterial : ( ( rule__Material__Alternatives ) ) ;
    public final void ruleMaterial() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:491:2: ( ( ( rule__Material__Alternatives ) ) )
            // InternalMyDsl.g:492:2: ( ( rule__Material__Alternatives ) )
            {
            // InternalMyDsl.g:492:2: ( ( rule__Material__Alternatives ) )
            // InternalMyDsl.g:493:3: ( rule__Material__Alternatives )
            {
             before(grammarAccess.getMaterialAccess().getAlternatives()); 
            // InternalMyDsl.g:494:3: ( rule__Material__Alternatives )
            // InternalMyDsl.g:494:4: rule__Material__Alternatives
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
    // InternalMyDsl.g:503:1: entryRuleTexture : ruleTexture EOF ;
    public final void entryRuleTexture() throws RecognitionException {
        try {
            // InternalMyDsl.g:504:1: ( ruleTexture EOF )
            // InternalMyDsl.g:505:1: ruleTexture EOF
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
    // InternalMyDsl.g:512:1: ruleTexture : ( ( rule__Texture__Group__0 ) ) ;
    public final void ruleTexture() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:516:2: ( ( ( rule__Texture__Group__0 ) ) )
            // InternalMyDsl.g:517:2: ( ( rule__Texture__Group__0 ) )
            {
            // InternalMyDsl.g:517:2: ( ( rule__Texture__Group__0 ) )
            // InternalMyDsl.g:518:3: ( rule__Texture__Group__0 )
            {
             before(grammarAccess.getTextureAccess().getGroup()); 
            // InternalMyDsl.g:519:3: ( rule__Texture__Group__0 )
            // InternalMyDsl.g:519:4: rule__Texture__Group__0
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
    // InternalMyDsl.g:528:1: entryRuleColor : ruleColor EOF ;
    public final void entryRuleColor() throws RecognitionException {
        try {
            // InternalMyDsl.g:529:1: ( ruleColor EOF )
            // InternalMyDsl.g:530:1: ruleColor EOF
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
    // InternalMyDsl.g:537:1: ruleColor : ( ( rule__Color__Group__0 ) ) ;
    public final void ruleColor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:541:2: ( ( ( rule__Color__Group__0 ) ) )
            // InternalMyDsl.g:542:2: ( ( rule__Color__Group__0 ) )
            {
            // InternalMyDsl.g:542:2: ( ( rule__Color__Group__0 ) )
            // InternalMyDsl.g:543:3: ( rule__Color__Group__0 )
            {
             before(grammarAccess.getColorAccess().getGroup()); 
            // InternalMyDsl.g:544:3: ( rule__Color__Group__0 )
            // InternalMyDsl.g:544:4: rule__Color__Group__0
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
    // InternalMyDsl.g:553:1: entryRuleJoint : ruleJoint EOF ;
    public final void entryRuleJoint() throws RecognitionException {
        try {
            // InternalMyDsl.g:554:1: ( ruleJoint EOF )
            // InternalMyDsl.g:555:1: ruleJoint EOF
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
    // InternalMyDsl.g:562:1: ruleJoint : ( ( rule__Joint__Group__0 ) ) ;
    public final void ruleJoint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:566:2: ( ( ( rule__Joint__Group__0 ) ) )
            // InternalMyDsl.g:567:2: ( ( rule__Joint__Group__0 ) )
            {
            // InternalMyDsl.g:567:2: ( ( rule__Joint__Group__0 ) )
            // InternalMyDsl.g:568:3: ( rule__Joint__Group__0 )
            {
             before(grammarAccess.getJointAccess().getGroup()); 
            // InternalMyDsl.g:569:3: ( rule__Joint__Group__0 )
            // InternalMyDsl.g:569:4: rule__Joint__Group__0
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
    // InternalMyDsl.g:578:1: entryRuleAxis : ruleAxis EOF ;
    public final void entryRuleAxis() throws RecognitionException {
        try {
            // InternalMyDsl.g:579:1: ( ruleAxis EOF )
            // InternalMyDsl.g:580:1: ruleAxis EOF
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
    // InternalMyDsl.g:587:1: ruleAxis : ( ( rule__Axis__Group__0 ) ) ;
    public final void ruleAxis() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:591:2: ( ( ( rule__Axis__Group__0 ) ) )
            // InternalMyDsl.g:592:2: ( ( rule__Axis__Group__0 ) )
            {
            // InternalMyDsl.g:592:2: ( ( rule__Axis__Group__0 ) )
            // InternalMyDsl.g:593:3: ( rule__Axis__Group__0 )
            {
             before(grammarAccess.getAxisAccess().getGroup()); 
            // InternalMyDsl.g:594:3: ( rule__Axis__Group__0 )
            // InternalMyDsl.g:594:4: rule__Axis__Group__0
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
    // InternalMyDsl.g:603:1: entryRuleLimit : ruleLimit EOF ;
    public final void entryRuleLimit() throws RecognitionException {
        try {
            // InternalMyDsl.g:604:1: ( ruleLimit EOF )
            // InternalMyDsl.g:605:1: ruleLimit EOF
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
    // InternalMyDsl.g:612:1: ruleLimit : ( ( rule__Limit__Group__0 ) ) ;
    public final void ruleLimit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:616:2: ( ( ( rule__Limit__Group__0 ) ) )
            // InternalMyDsl.g:617:2: ( ( rule__Limit__Group__0 ) )
            {
            // InternalMyDsl.g:617:2: ( ( rule__Limit__Group__0 ) )
            // InternalMyDsl.g:618:3: ( rule__Limit__Group__0 )
            {
             before(grammarAccess.getLimitAccess().getGroup()); 
            // InternalMyDsl.g:619:3: ( rule__Limit__Group__0 )
            // InternalMyDsl.g:619:4: rule__Limit__Group__0
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
    // InternalMyDsl.g:628:1: entryRuleCalibration : ruleCalibration EOF ;
    public final void entryRuleCalibration() throws RecognitionException {
        try {
            // InternalMyDsl.g:629:1: ( ruleCalibration EOF )
            // InternalMyDsl.g:630:1: ruleCalibration EOF
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
    // InternalMyDsl.g:637:1: ruleCalibration : ( ( rule__Calibration__Group__0 ) ) ;
    public final void ruleCalibration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:641:2: ( ( ( rule__Calibration__Group__0 ) ) )
            // InternalMyDsl.g:642:2: ( ( rule__Calibration__Group__0 ) )
            {
            // InternalMyDsl.g:642:2: ( ( rule__Calibration__Group__0 ) )
            // InternalMyDsl.g:643:3: ( rule__Calibration__Group__0 )
            {
             before(grammarAccess.getCalibrationAccess().getGroup()); 
            // InternalMyDsl.g:644:3: ( rule__Calibration__Group__0 )
            // InternalMyDsl.g:644:4: rule__Calibration__Group__0
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
    // InternalMyDsl.g:653:1: entryRuleDynamics : ruleDynamics EOF ;
    public final void entryRuleDynamics() throws RecognitionException {
        try {
            // InternalMyDsl.g:654:1: ( ruleDynamics EOF )
            // InternalMyDsl.g:655:1: ruleDynamics EOF
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
    // InternalMyDsl.g:662:1: ruleDynamics : ( ( rule__Dynamics__Group__0 ) ) ;
    public final void ruleDynamics() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:666:2: ( ( ( rule__Dynamics__Group__0 ) ) )
            // InternalMyDsl.g:667:2: ( ( rule__Dynamics__Group__0 ) )
            {
            // InternalMyDsl.g:667:2: ( ( rule__Dynamics__Group__0 ) )
            // InternalMyDsl.g:668:3: ( rule__Dynamics__Group__0 )
            {
             before(grammarAccess.getDynamicsAccess().getGroup()); 
            // InternalMyDsl.g:669:3: ( rule__Dynamics__Group__0 )
            // InternalMyDsl.g:669:4: rule__Dynamics__Group__0
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
    // InternalMyDsl.g:678:1: entryRuleSafetyController : ruleSafetyController EOF ;
    public final void entryRuleSafetyController() throws RecognitionException {
        try {
            // InternalMyDsl.g:679:1: ( ruleSafetyController EOF )
            // InternalMyDsl.g:680:1: ruleSafetyController EOF
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
    // InternalMyDsl.g:687:1: ruleSafetyController : ( ( rule__SafetyController__Group__0 ) ) ;
    public final void ruleSafetyController() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:691:2: ( ( ( rule__SafetyController__Group__0 ) ) )
            // InternalMyDsl.g:692:2: ( ( rule__SafetyController__Group__0 ) )
            {
            // InternalMyDsl.g:692:2: ( ( rule__SafetyController__Group__0 ) )
            // InternalMyDsl.g:693:3: ( rule__SafetyController__Group__0 )
            {
             before(grammarAccess.getSafetyControllerAccess().getGroup()); 
            // InternalMyDsl.g:694:3: ( rule__SafetyController__Group__0 )
            // InternalMyDsl.g:694:4: rule__SafetyController__Group__0
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
    // InternalMyDsl.g:703:1: entryRuleURDFAttrSignedNumeric : ruleURDFAttrSignedNumeric EOF ;
    public final void entryRuleURDFAttrSignedNumeric() throws RecognitionException {
        try {
            // InternalMyDsl.g:704:1: ( ruleURDFAttrSignedNumeric EOF )
            // InternalMyDsl.g:705:1: ruleURDFAttrSignedNumeric EOF
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
    // InternalMyDsl.g:712:1: ruleURDFAttrSignedNumeric : ( ( rule__URDFAttrSignedNumeric__ValueAssignment ) ) ;
    public final void ruleURDFAttrSignedNumeric() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:716:2: ( ( ( rule__URDFAttrSignedNumeric__ValueAssignment ) ) )
            // InternalMyDsl.g:717:2: ( ( rule__URDFAttrSignedNumeric__ValueAssignment ) )
            {
            // InternalMyDsl.g:717:2: ( ( rule__URDFAttrSignedNumeric__ValueAssignment ) )
            // InternalMyDsl.g:718:3: ( rule__URDFAttrSignedNumeric__ValueAssignment )
            {
             before(grammarAccess.getURDFAttrSignedNumericAccess().getValueAssignment()); 
            // InternalMyDsl.g:719:3: ( rule__URDFAttrSignedNumeric__ValueAssignment )
            // InternalMyDsl.g:719:4: rule__URDFAttrSignedNumeric__ValueAssignment
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
    // InternalMyDsl.g:728:1: entryRuleURDFAttrFloat : ruleURDFAttrFloat EOF ;
    public final void entryRuleURDFAttrFloat() throws RecognitionException {
        try {
            // InternalMyDsl.g:729:1: ( ruleURDFAttrFloat EOF )
            // InternalMyDsl.g:730:1: ruleURDFAttrFloat EOF
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
    // InternalMyDsl.g:737:1: ruleURDFAttrFloat : ( ( rule__URDFAttrFloat__ValueAssignment ) ) ;
    public final void ruleURDFAttrFloat() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:741:2: ( ( ( rule__URDFAttrFloat__ValueAssignment ) ) )
            // InternalMyDsl.g:742:2: ( ( rule__URDFAttrFloat__ValueAssignment ) )
            {
            // InternalMyDsl.g:742:2: ( ( rule__URDFAttrFloat__ValueAssignment ) )
            // InternalMyDsl.g:743:3: ( rule__URDFAttrFloat__ValueAssignment )
            {
             before(grammarAccess.getURDFAttrFloatAccess().getValueAssignment()); 
            // InternalMyDsl.g:744:3: ( rule__URDFAttrFloat__ValueAssignment )
            // InternalMyDsl.g:744:4: rule__URDFAttrFloat__ValueAssignment
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
    // InternalMyDsl.g:753:1: entryRuleURDFAttrINT : ruleURDFAttrINT EOF ;
    public final void entryRuleURDFAttrINT() throws RecognitionException {
        try {
            // InternalMyDsl.g:754:1: ( ruleURDFAttrINT EOF )
            // InternalMyDsl.g:755:1: ruleURDFAttrINT EOF
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
    // InternalMyDsl.g:762:1: ruleURDFAttrINT : ( ( rule__URDFAttrINT__ValueAssignment ) ) ;
    public final void ruleURDFAttrINT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:766:2: ( ( ( rule__URDFAttrINT__ValueAssignment ) ) )
            // InternalMyDsl.g:767:2: ( ( rule__URDFAttrINT__ValueAssignment ) )
            {
            // InternalMyDsl.g:767:2: ( ( rule__URDFAttrINT__ValueAssignment ) )
            // InternalMyDsl.g:768:3: ( rule__URDFAttrINT__ValueAssignment )
            {
             before(grammarAccess.getURDFAttrINTAccess().getValueAssignment()); 
            // InternalMyDsl.g:769:3: ( rule__URDFAttrINT__ValueAssignment )
            // InternalMyDsl.g:769:4: rule__URDFAttrINT__ValueAssignment
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
    // InternalMyDsl.g:778:1: entryRuleURDFAttrNumeric : ruleURDFAttrNumeric EOF ;
    public final void entryRuleURDFAttrNumeric() throws RecognitionException {
        try {
            // InternalMyDsl.g:779:1: ( ruleURDFAttrNumeric EOF )
            // InternalMyDsl.g:780:1: ruleURDFAttrNumeric EOF
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
    // InternalMyDsl.g:787:1: ruleURDFAttrNumeric : ( ( rule__URDFAttrNumeric__ValueAssignment ) ) ;
    public final void ruleURDFAttrNumeric() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:791:2: ( ( ( rule__URDFAttrNumeric__ValueAssignment ) ) )
            // InternalMyDsl.g:792:2: ( ( rule__URDFAttrNumeric__ValueAssignment ) )
            {
            // InternalMyDsl.g:792:2: ( ( rule__URDFAttrNumeric__ValueAssignment ) )
            // InternalMyDsl.g:793:3: ( rule__URDFAttrNumeric__ValueAssignment )
            {
             before(grammarAccess.getURDFAttrNumericAccess().getValueAssignment()); 
            // InternalMyDsl.g:794:3: ( rule__URDFAttrNumeric__ValueAssignment )
            // InternalMyDsl.g:794:4: rule__URDFAttrNumeric__ValueAssignment
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
    // InternalMyDsl.g:803:1: entryRuleURDFAttrSTRING : ruleURDFAttrSTRING EOF ;
    public final void entryRuleURDFAttrSTRING() throws RecognitionException {
        try {
            // InternalMyDsl.g:804:1: ( ruleURDFAttrSTRING EOF )
            // InternalMyDsl.g:805:1: ruleURDFAttrSTRING EOF
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
    // InternalMyDsl.g:812:1: ruleURDFAttrSTRING : ( ( rule__URDFAttrSTRING__ValueAssignment ) ) ;
    public final void ruleURDFAttrSTRING() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:816:2: ( ( ( rule__URDFAttrSTRING__ValueAssignment ) ) )
            // InternalMyDsl.g:817:2: ( ( rule__URDFAttrSTRING__ValueAssignment ) )
            {
            // InternalMyDsl.g:817:2: ( ( rule__URDFAttrSTRING__ValueAssignment ) )
            // InternalMyDsl.g:818:3: ( rule__URDFAttrSTRING__ValueAssignment )
            {
             before(grammarAccess.getURDFAttrSTRINGAccess().getValueAssignment()); 
            // InternalMyDsl.g:819:3: ( rule__URDFAttrSTRING__ValueAssignment )
            // InternalMyDsl.g:819:4: rule__URDFAttrSTRING__ValueAssignment
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
    // InternalMyDsl.g:828:1: entryRuleFLOAT : ruleFLOAT EOF ;
    public final void entryRuleFLOAT() throws RecognitionException {
        try {
            // InternalMyDsl.g:829:1: ( ruleFLOAT EOF )
            // InternalMyDsl.g:830:1: ruleFLOAT EOF
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
    // InternalMyDsl.g:837:1: ruleFLOAT : ( ( rule__FLOAT__Group__0 ) ) ;
    public final void ruleFLOAT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:841:2: ( ( ( rule__FLOAT__Group__0 ) ) )
            // InternalMyDsl.g:842:2: ( ( rule__FLOAT__Group__0 ) )
            {
            // InternalMyDsl.g:842:2: ( ( rule__FLOAT__Group__0 ) )
            // InternalMyDsl.g:843:3: ( rule__FLOAT__Group__0 )
            {
             before(grammarAccess.getFLOATAccess().getGroup()); 
            // InternalMyDsl.g:844:3: ( rule__FLOAT__Group__0 )
            // InternalMyDsl.g:844:4: rule__FLOAT__Group__0
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
    // InternalMyDsl.g:853:1: entryRuleSCIENTIFIC : ruleSCIENTIFIC EOF ;
    public final void entryRuleSCIENTIFIC() throws RecognitionException {
        try {
            // InternalMyDsl.g:854:1: ( ruleSCIENTIFIC EOF )
            // InternalMyDsl.g:855:1: ruleSCIENTIFIC EOF
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
    // InternalMyDsl.g:862:1: ruleSCIENTIFIC : ( ( rule__SCIENTIFIC__Group__0 ) ) ;
    public final void ruleSCIENTIFIC() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:866:2: ( ( ( rule__SCIENTIFIC__Group__0 ) ) )
            // InternalMyDsl.g:867:2: ( ( rule__SCIENTIFIC__Group__0 ) )
            {
            // InternalMyDsl.g:867:2: ( ( rule__SCIENTIFIC__Group__0 ) )
            // InternalMyDsl.g:868:3: ( rule__SCIENTIFIC__Group__0 )
            {
             before(grammarAccess.getSCIENTIFICAccess().getGroup()); 
            // InternalMyDsl.g:869:3: ( rule__SCIENTIFIC__Group__0 )
            // InternalMyDsl.g:869:4: rule__SCIENTIFIC__Group__0
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
    // InternalMyDsl.g:878:1: entryRuleSIGNED_NUMERIC : ruleSIGNED_NUMERIC EOF ;
    public final void entryRuleSIGNED_NUMERIC() throws RecognitionException {
        try {
            // InternalMyDsl.g:879:1: ( ruleSIGNED_NUMERIC EOF )
            // InternalMyDsl.g:880:1: ruleSIGNED_NUMERIC EOF
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
    // InternalMyDsl.g:887:1: ruleSIGNED_NUMERIC : ( ( rule__SIGNED_NUMERIC__Group__0 ) ) ;
    public final void ruleSIGNED_NUMERIC() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:891:2: ( ( ( rule__SIGNED_NUMERIC__Group__0 ) ) )
            // InternalMyDsl.g:892:2: ( ( rule__SIGNED_NUMERIC__Group__0 ) )
            {
            // InternalMyDsl.g:892:2: ( ( rule__SIGNED_NUMERIC__Group__0 ) )
            // InternalMyDsl.g:893:3: ( rule__SIGNED_NUMERIC__Group__0 )
            {
             before(grammarAccess.getSIGNED_NUMERICAccess().getGroup()); 
            // InternalMyDsl.g:894:3: ( rule__SIGNED_NUMERIC__Group__0 )
            // InternalMyDsl.g:894:4: rule__SIGNED_NUMERIC__Group__0
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
    // InternalMyDsl.g:903:1: entryRuleNUMERIC : ruleNUMERIC EOF ;
    public final void entryRuleNUMERIC() throws RecognitionException {
        try {
            // InternalMyDsl.g:904:1: ( ruleNUMERIC EOF )
            // InternalMyDsl.g:905:1: ruleNUMERIC EOF
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
    // InternalMyDsl.g:912:1: ruleNUMERIC : ( ( rule__NUMERIC__Alternatives ) ) ;
    public final void ruleNUMERIC() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:916:2: ( ( ( rule__NUMERIC__Alternatives ) ) )
            // InternalMyDsl.g:917:2: ( ( rule__NUMERIC__Alternatives ) )
            {
            // InternalMyDsl.g:917:2: ( ( rule__NUMERIC__Alternatives ) )
            // InternalMyDsl.g:918:3: ( rule__NUMERIC__Alternatives )
            {
             before(grammarAccess.getNUMERICAccess().getAlternatives()); 
            // InternalMyDsl.g:919:3: ( rule__NUMERIC__Alternatives )
            // InternalMyDsl.g:919:4: rule__NUMERIC__Alternatives
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
    // InternalMyDsl.g:928:1: ruleJointType : ( ( rule__JointType__Alternatives ) ) ;
    public final void ruleJointType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:932:1: ( ( ( rule__JointType__Alternatives ) ) )
            // InternalMyDsl.g:933:2: ( ( rule__JointType__Alternatives ) )
            {
            // InternalMyDsl.g:933:2: ( ( rule__JointType__Alternatives ) )
            // InternalMyDsl.g:934:3: ( rule__JointType__Alternatives )
            {
             before(grammarAccess.getJointTypeAccess().getAlternatives()); 
            // InternalMyDsl.g:935:3: ( rule__JointType__Alternatives )
            // InternalMyDsl.g:935:4: rule__JointType__Alternatives
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
    // InternalMyDsl.g:943:1: rule__Robot__Alternatives_2 : ( ( ( rule__Robot__LinksAssignment_2_0 ) ) | ( ( rule__Robot__JointAssignment_2_1 ) ) );
    public final void rule__Robot__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:947:1: ( ( ( rule__Robot__LinksAssignment_2_0 ) ) | ( ( rule__Robot__JointAssignment_2_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==18) ) {
                alt1=1;
            }
            else if ( (LA1_0==60) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:948:2: ( ( rule__Robot__LinksAssignment_2_0 ) )
                    {
                    // InternalMyDsl.g:948:2: ( ( rule__Robot__LinksAssignment_2_0 ) )
                    // InternalMyDsl.g:949:3: ( rule__Robot__LinksAssignment_2_0 )
                    {
                     before(grammarAccess.getRobotAccess().getLinksAssignment_2_0()); 
                    // InternalMyDsl.g:950:3: ( rule__Robot__LinksAssignment_2_0 )
                    // InternalMyDsl.g:950:4: rule__Robot__LinksAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Robot__LinksAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRobotAccess().getLinksAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:954:2: ( ( rule__Robot__JointAssignment_2_1 ) )
                    {
                    // InternalMyDsl.g:954:2: ( ( rule__Robot__JointAssignment_2_1 ) )
                    // InternalMyDsl.g:955:3: ( rule__Robot__JointAssignment_2_1 )
                    {
                     before(grammarAccess.getRobotAccess().getJointAssignment_2_1()); 
                    // InternalMyDsl.g:956:3: ( rule__Robot__JointAssignment_2_1 )
                    // InternalMyDsl.g:956:4: rule__Robot__JointAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Robot__JointAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getRobotAccess().getJointAssignment_2_1()); 

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


    // $ANTLR start "rule__ReUseAble__Alternatives"
    // InternalMyDsl.g:964:1: rule__ReUseAble__Alternatives : ( ( ruleLink ) | ( ruleVisual ) | ( ruleInertial ) | ( ruleCollision ) );
    public final void rule__ReUseAble__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:968:1: ( ( ruleLink ) | ( ruleVisual ) | ( ruleInertial ) | ( ruleCollision ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt2=1;
                }
                break;
            case 32:
                {
                alt2=2;
                }
                break;
            case 24:
                {
                alt2=3;
                }
                break;
            case 44:
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
                    // InternalMyDsl.g:969:2: ( ruleLink )
                    {
                    // InternalMyDsl.g:969:2: ( ruleLink )
                    // InternalMyDsl.g:970:3: ruleLink
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
                    // InternalMyDsl.g:975:2: ( ruleVisual )
                    {
                    // InternalMyDsl.g:975:2: ( ruleVisual )
                    // InternalMyDsl.g:976:3: ruleVisual
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
                    // InternalMyDsl.g:981:2: ( ruleInertial )
                    {
                    // InternalMyDsl.g:981:2: ( ruleInertial )
                    // InternalMyDsl.g:982:3: ruleInertial
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
                    // InternalMyDsl.g:987:2: ( ruleCollision )
                    {
                    // InternalMyDsl.g:987:2: ( ruleCollision )
                    // InternalMyDsl.g:988:3: ruleCollision
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
    // InternalMyDsl.g:997:1: rule__Link__Alternatives_3 : ( ( ( rule__Link__Group_3_0__0 ) ) | ( ( rule__Link__Group_3_1__0 ) ) );
    public final void rule__Link__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1001:1: ( ( ( rule__Link__Group_3_0__0 ) ) | ( ( rule__Link__Group_3_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==19) ) {
                alt3=1;
            }
            else if ( (LA3_0==20) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:1002:2: ( ( rule__Link__Group_3_0__0 ) )
                    {
                    // InternalMyDsl.g:1002:2: ( ( rule__Link__Group_3_0__0 ) )
                    // InternalMyDsl.g:1003:3: ( rule__Link__Group_3_0__0 )
                    {
                     before(grammarAccess.getLinkAccess().getGroup_3_0()); 
                    // InternalMyDsl.g:1004:3: ( rule__Link__Group_3_0__0 )
                    // InternalMyDsl.g:1004:4: rule__Link__Group_3_0__0
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
                    // InternalMyDsl.g:1008:2: ( ( rule__Link__Group_3_1__0 ) )
                    {
                    // InternalMyDsl.g:1008:2: ( ( rule__Link__Group_3_1__0 ) )
                    // InternalMyDsl.g:1009:3: ( rule__Link__Group_3_1__0 )
                    {
                     before(grammarAccess.getLinkAccess().getGroup_3_1()); 
                    // InternalMyDsl.g:1010:3: ( rule__Link__Group_3_1__0 )
                    // InternalMyDsl.g:1010:4: rule__Link__Group_3_1__0
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
    // InternalMyDsl.g:1018:1: rule__Link__Alternatives_3_0_1 : ( ( ( rule__Link__InertialAssignment_3_0_1_0 ) ) | ( ( rule__Link__VisualAssignment_3_0_1_1 ) ) | ( ( rule__Link__CollisionAssignment_3_0_1_2 ) ) );
    public final void rule__Link__Alternatives_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1022:1: ( ( ( rule__Link__InertialAssignment_3_0_1_0 ) ) | ( ( rule__Link__VisualAssignment_3_0_1_1 ) ) | ( ( rule__Link__CollisionAssignment_3_0_1_2 ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt4=1;
                }
                break;
            case 32:
                {
                alt4=2;
                }
                break;
            case 44:
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
                    // InternalMyDsl.g:1023:2: ( ( rule__Link__InertialAssignment_3_0_1_0 ) )
                    {
                    // InternalMyDsl.g:1023:2: ( ( rule__Link__InertialAssignment_3_0_1_0 ) )
                    // InternalMyDsl.g:1024:3: ( rule__Link__InertialAssignment_3_0_1_0 )
                    {
                     before(grammarAccess.getLinkAccess().getInertialAssignment_3_0_1_0()); 
                    // InternalMyDsl.g:1025:3: ( rule__Link__InertialAssignment_3_0_1_0 )
                    // InternalMyDsl.g:1025:4: rule__Link__InertialAssignment_3_0_1_0
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
                    // InternalMyDsl.g:1029:2: ( ( rule__Link__VisualAssignment_3_0_1_1 ) )
                    {
                    // InternalMyDsl.g:1029:2: ( ( rule__Link__VisualAssignment_3_0_1_1 ) )
                    // InternalMyDsl.g:1030:3: ( rule__Link__VisualAssignment_3_0_1_1 )
                    {
                     before(grammarAccess.getLinkAccess().getVisualAssignment_3_0_1_1()); 
                    // InternalMyDsl.g:1031:3: ( rule__Link__VisualAssignment_3_0_1_1 )
                    // InternalMyDsl.g:1031:4: rule__Link__VisualAssignment_3_0_1_1
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
                    // InternalMyDsl.g:1035:2: ( ( rule__Link__CollisionAssignment_3_0_1_2 ) )
                    {
                    // InternalMyDsl.g:1035:2: ( ( rule__Link__CollisionAssignment_3_0_1_2 ) )
                    // InternalMyDsl.g:1036:3: ( rule__Link__CollisionAssignment_3_0_1_2 )
                    {
                     before(grammarAccess.getLinkAccess().getCollisionAssignment_3_0_1_2()); 
                    // InternalMyDsl.g:1037:3: ( rule__Link__CollisionAssignment_3_0_1_2 )
                    // InternalMyDsl.g:1037:4: rule__Link__CollisionAssignment_3_0_1_2
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
    // InternalMyDsl.g:1045:1: rule__Reuse__Alternatives_1 : ( ( ( rule__Reuse__Group_1_0__0 ) ) | ( ( rule__Reuse__Group_1_1__0 ) ) );
    public final void rule__Reuse__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1049:1: ( ( ( rule__Reuse__Group_1_0__0 ) ) | ( ( rule__Reuse__Group_1_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            else if ( (LA5_0==22) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:1050:2: ( ( rule__Reuse__Group_1_0__0 ) )
                    {
                    // InternalMyDsl.g:1050:2: ( ( rule__Reuse__Group_1_0__0 ) )
                    // InternalMyDsl.g:1051:3: ( rule__Reuse__Group_1_0__0 )
                    {
                     before(grammarAccess.getReuseAccess().getGroup_1_0()); 
                    // InternalMyDsl.g:1052:3: ( rule__Reuse__Group_1_0__0 )
                    // InternalMyDsl.g:1052:4: rule__Reuse__Group_1_0__0
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
                    // InternalMyDsl.g:1056:2: ( ( rule__Reuse__Group_1_1__0 ) )
                    {
                    // InternalMyDsl.g:1056:2: ( ( rule__Reuse__Group_1_1__0 ) )
                    // InternalMyDsl.g:1057:3: ( rule__Reuse__Group_1_1__0 )
                    {
                     before(grammarAccess.getReuseAccess().getGroup_1_1()); 
                    // InternalMyDsl.g:1058:3: ( rule__Reuse__Group_1_1__0 )
                    // InternalMyDsl.g:1058:4: rule__Reuse__Group_1_1__0
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
    // InternalMyDsl.g:1066:1: rule__Geometry__Alternatives : ( ( ruleBox ) | ( ruleCylinder ) | ( ruleMesh ) | ( ruleSphere ) );
    public final void rule__Geometry__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1070:1: ( ( ruleBox ) | ( ruleCylinder ) | ( ruleMesh ) | ( ruleSphere ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt6=1;
                }
                break;
            case 49:
                {
                alt6=2;
                }
                break;
            case 51:
                {
                alt6=3;
                }
                break;
            case 53:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:1071:2: ( ruleBox )
                    {
                    // InternalMyDsl.g:1071:2: ( ruleBox )
                    // InternalMyDsl.g:1072:3: ruleBox
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
                    // InternalMyDsl.g:1077:2: ( ruleCylinder )
                    {
                    // InternalMyDsl.g:1077:2: ( ruleCylinder )
                    // InternalMyDsl.g:1078:3: ruleCylinder
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
                    // InternalMyDsl.g:1083:2: ( ruleMesh )
                    {
                    // InternalMyDsl.g:1083:2: ( ruleMesh )
                    // InternalMyDsl.g:1084:3: ruleMesh
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
                    // InternalMyDsl.g:1089:2: ( ruleSphere )
                    {
                    // InternalMyDsl.g:1089:2: ( ruleSphere )
                    // InternalMyDsl.g:1090:3: ruleSphere
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
    // InternalMyDsl.g:1099:1: rule__Material__Alternatives : ( ( ruleTexture ) | ( ruleColor ) );
    public final void rule__Material__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1103:1: ( ( ruleTexture ) | ( ruleColor ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==54) ) {
                alt7=1;
            }
            else if ( (LA7_0==55) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:1104:2: ( ruleTexture )
                    {
                    // InternalMyDsl.g:1104:2: ( ruleTexture )
                    // InternalMyDsl.g:1105:3: ruleTexture
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
                    // InternalMyDsl.g:1110:2: ( ruleColor )
                    {
                    // InternalMyDsl.g:1110:2: ( ruleColor )
                    // InternalMyDsl.g:1111:3: ruleColor
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
    // InternalMyDsl.g:1120:1: rule__Joint__Alternatives_2 : ( ( ( rule__Joint__Group_2_0__0 ) ) | ( ( rule__Joint__Group_2_1__0 ) ) );
    public final void rule__Joint__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1124:1: ( ( ( rule__Joint__Group_2_0__0 ) ) | ( ( rule__Joint__Group_2_1__0 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            else if ( (LA8_0==20) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:1125:2: ( ( rule__Joint__Group_2_0__0 ) )
                    {
                    // InternalMyDsl.g:1125:2: ( ( rule__Joint__Group_2_0__0 ) )
                    // InternalMyDsl.g:1126:3: ( rule__Joint__Group_2_0__0 )
                    {
                     before(grammarAccess.getJointAccess().getGroup_2_0()); 
                    // InternalMyDsl.g:1127:3: ( rule__Joint__Group_2_0__0 )
                    // InternalMyDsl.g:1127:4: rule__Joint__Group_2_0__0
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
                    // InternalMyDsl.g:1131:2: ( ( rule__Joint__Group_2_1__0 ) )
                    {
                    // InternalMyDsl.g:1131:2: ( ( rule__Joint__Group_2_1__0 ) )
                    // InternalMyDsl.g:1132:3: ( rule__Joint__Group_2_1__0 )
                    {
                     before(grammarAccess.getJointAccess().getGroup_2_1()); 
                    // InternalMyDsl.g:1133:3: ( rule__Joint__Group_2_1__0 )
                    // InternalMyDsl.g:1133:4: rule__Joint__Group_2_1__0
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
    // InternalMyDsl.g:1141:1: rule__Joint__Alternatives_2_0_1 : ( ( ( rule__Joint__OriginAssignment_2_0_1_0 ) ) | ( ( rule__Joint__AxisAssignment_2_0_1_1 ) ) | ( ( rule__Joint__LimitAssignment_2_0_1_2 ) ) | ( ( rule__Joint__CalibrationAssignment_2_0_1_3 ) ) | ( ( rule__Joint__DynamicsAssignment_2_0_1_4 ) ) | ( ( rule__Joint__SafetycontrollerAssignment_2_0_1_5 ) ) );
    public final void rule__Joint__Alternatives_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1145:1: ( ( ( rule__Joint__OriginAssignment_2_0_1_0 ) ) | ( ( rule__Joint__AxisAssignment_2_0_1_1 ) ) | ( ( rule__Joint__LimitAssignment_2_0_1_2 ) ) | ( ( rule__Joint__CalibrationAssignment_2_0_1_3 ) ) | ( ( rule__Joint__DynamicsAssignment_2_0_1_4 ) ) | ( ( rule__Joint__SafetycontrollerAssignment_2_0_1_5 ) ) )
            int alt9=6;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt9=1;
                }
                break;
            case 64:
                {
                alt9=2;
                }
                break;
            case 65:
                {
                alt9=3;
                }
                break;
            case 70:
                {
                alt9=4;
                }
                break;
            case 73:
                {
                alt9=5;
                }
                break;
            case 76:
                {
                alt9=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:1146:2: ( ( rule__Joint__OriginAssignment_2_0_1_0 ) )
                    {
                    // InternalMyDsl.g:1146:2: ( ( rule__Joint__OriginAssignment_2_0_1_0 ) )
                    // InternalMyDsl.g:1147:3: ( rule__Joint__OriginAssignment_2_0_1_0 )
                    {
                     before(grammarAccess.getJointAccess().getOriginAssignment_2_0_1_0()); 
                    // InternalMyDsl.g:1148:3: ( rule__Joint__OriginAssignment_2_0_1_0 )
                    // InternalMyDsl.g:1148:4: rule__Joint__OriginAssignment_2_0_1_0
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
                    // InternalMyDsl.g:1152:2: ( ( rule__Joint__AxisAssignment_2_0_1_1 ) )
                    {
                    // InternalMyDsl.g:1152:2: ( ( rule__Joint__AxisAssignment_2_0_1_1 ) )
                    // InternalMyDsl.g:1153:3: ( rule__Joint__AxisAssignment_2_0_1_1 )
                    {
                     before(grammarAccess.getJointAccess().getAxisAssignment_2_0_1_1()); 
                    // InternalMyDsl.g:1154:3: ( rule__Joint__AxisAssignment_2_0_1_1 )
                    // InternalMyDsl.g:1154:4: rule__Joint__AxisAssignment_2_0_1_1
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
                    // InternalMyDsl.g:1158:2: ( ( rule__Joint__LimitAssignment_2_0_1_2 ) )
                    {
                    // InternalMyDsl.g:1158:2: ( ( rule__Joint__LimitAssignment_2_0_1_2 ) )
                    // InternalMyDsl.g:1159:3: ( rule__Joint__LimitAssignment_2_0_1_2 )
                    {
                     before(grammarAccess.getJointAccess().getLimitAssignment_2_0_1_2()); 
                    // InternalMyDsl.g:1160:3: ( rule__Joint__LimitAssignment_2_0_1_2 )
                    // InternalMyDsl.g:1160:4: rule__Joint__LimitAssignment_2_0_1_2
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
                    // InternalMyDsl.g:1164:2: ( ( rule__Joint__CalibrationAssignment_2_0_1_3 ) )
                    {
                    // InternalMyDsl.g:1164:2: ( ( rule__Joint__CalibrationAssignment_2_0_1_3 ) )
                    // InternalMyDsl.g:1165:3: ( rule__Joint__CalibrationAssignment_2_0_1_3 )
                    {
                     before(grammarAccess.getJointAccess().getCalibrationAssignment_2_0_1_3()); 
                    // InternalMyDsl.g:1166:3: ( rule__Joint__CalibrationAssignment_2_0_1_3 )
                    // InternalMyDsl.g:1166:4: rule__Joint__CalibrationAssignment_2_0_1_3
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
                    // InternalMyDsl.g:1170:2: ( ( rule__Joint__DynamicsAssignment_2_0_1_4 ) )
                    {
                    // InternalMyDsl.g:1170:2: ( ( rule__Joint__DynamicsAssignment_2_0_1_4 ) )
                    // InternalMyDsl.g:1171:3: ( rule__Joint__DynamicsAssignment_2_0_1_4 )
                    {
                     before(grammarAccess.getJointAccess().getDynamicsAssignment_2_0_1_4()); 
                    // InternalMyDsl.g:1172:3: ( rule__Joint__DynamicsAssignment_2_0_1_4 )
                    // InternalMyDsl.g:1172:4: rule__Joint__DynamicsAssignment_2_0_1_4
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
                    // InternalMyDsl.g:1176:2: ( ( rule__Joint__SafetycontrollerAssignment_2_0_1_5 ) )
                    {
                    // InternalMyDsl.g:1176:2: ( ( rule__Joint__SafetycontrollerAssignment_2_0_1_5 ) )
                    // InternalMyDsl.g:1177:3: ( rule__Joint__SafetycontrollerAssignment_2_0_1_5 )
                    {
                     before(grammarAccess.getJointAccess().getSafetycontrollerAssignment_2_0_1_5()); 
                    // InternalMyDsl.g:1178:3: ( rule__Joint__SafetycontrollerAssignment_2_0_1_5 )
                    // InternalMyDsl.g:1178:4: rule__Joint__SafetycontrollerAssignment_2_0_1_5
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
    // InternalMyDsl.g:1186:1: rule__SCIENTIFIC__Alternatives_2 : ( ( '+' ) | ( '-' ) );
    public final void rule__SCIENTIFIC__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1190:1: ( ( '+' ) | ( '-' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==11) ) {
                alt10=1;
            }
            else if ( (LA10_0==12) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:1191:2: ( '+' )
                    {
                    // InternalMyDsl.g:1191:2: ( '+' )
                    // InternalMyDsl.g:1192:3: '+'
                    {
                     before(grammarAccess.getSCIENTIFICAccess().getPlusSignKeyword_2_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getSCIENTIFICAccess().getPlusSignKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1197:2: ( '-' )
                    {
                    // InternalMyDsl.g:1197:2: ( '-' )
                    // InternalMyDsl.g:1198:3: '-'
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
    // InternalMyDsl.g:1207:1: rule__SIGNED_NUMERIC__Alternatives_1 : ( ( RULE_INT ) | ( ruleFLOAT ) | ( ruleSCIENTIFIC ) );
    public final void rule__SIGNED_NUMERIC__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1211:1: ( ( RULE_INT ) | ( ruleFLOAT ) | ( ruleSCIENTIFIC ) )
            int alt11=3;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_INT) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==23) ) {
                    int LA11_2 = input.LA(3);

                    if ( (LA11_2==RULE_INT) ) {
                        int LA11_4 = input.LA(4);

                        if ( (LA11_4==81) ) {
                            alt11=3;
                        }
                        else if ( (LA11_4==EOF||LA11_4==18||LA11_4==24||(LA11_4>=27 && LA11_4<=32)||(LA11_4>=34 && LA11_4<=35)||(LA11_4>=37 && LA11_4<=42)||LA11_4==44||LA11_4==60||(LA11_4>=64 && LA11_4<=65)||(LA11_4>=67 && LA11_4<=70)||(LA11_4>=72 && LA11_4<=73)||(LA11_4>=75 && LA11_4<=76)||(LA11_4>=78 && LA11_4<=80)) ) {
                            alt11=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 11, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA11_1==EOF||LA11_1==18||LA11_1==24||(LA11_1>=27 && LA11_1<=32)||(LA11_1>=34 && LA11_1<=35)||(LA11_1>=37 && LA11_1<=42)||LA11_1==44||LA11_1==60||(LA11_1>=64 && LA11_1<=65)||(LA11_1>=67 && LA11_1<=70)||(LA11_1>=72 && LA11_1<=73)||(LA11_1>=75 && LA11_1<=76)||(LA11_1>=78 && LA11_1<=80)) ) {
                    alt11=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:1212:2: ( RULE_INT )
                    {
                    // InternalMyDsl.g:1212:2: ( RULE_INT )
                    // InternalMyDsl.g:1213:3: RULE_INT
                    {
                     before(grammarAccess.getSIGNED_NUMERICAccess().getINTTerminalRuleCall_1_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getSIGNED_NUMERICAccess().getINTTerminalRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1218:2: ( ruleFLOAT )
                    {
                    // InternalMyDsl.g:1218:2: ( ruleFLOAT )
                    // InternalMyDsl.g:1219:3: ruleFLOAT
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
                    // InternalMyDsl.g:1224:2: ( ruleSCIENTIFIC )
                    {
                    // InternalMyDsl.g:1224:2: ( ruleSCIENTIFIC )
                    // InternalMyDsl.g:1225:3: ruleSCIENTIFIC
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
    // InternalMyDsl.g:1234:1: rule__NUMERIC__Alternatives : ( ( RULE_INT ) | ( ruleFLOAT ) | ( ruleSCIENTIFIC ) );
    public final void rule__NUMERIC__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1238:1: ( ( RULE_INT ) | ( ruleFLOAT ) | ( ruleSCIENTIFIC ) )
            int alt12=3;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_INT) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==EOF||LA12_1==18||LA12_1==24||LA12_1==32||(LA12_1>=34 && LA12_1<=35)||(LA12_1>=44 && LA12_1<=45)||(LA12_1>=47 && LA12_1<=49)||LA12_1==51||LA12_1==53||LA12_1==60) ) {
                    alt12=1;
                }
                else if ( (LA12_1==23) ) {
                    int LA12_3 = input.LA(3);

                    if ( (LA12_3==RULE_INT) ) {
                        int LA12_4 = input.LA(4);

                        if ( (LA12_4==81) ) {
                            alt12=3;
                        }
                        else if ( (LA12_4==EOF||LA12_4==18||LA12_4==24||LA12_4==32||(LA12_4>=34 && LA12_4<=35)||(LA12_4>=44 && LA12_4<=45)||(LA12_4>=47 && LA12_4<=49)||LA12_4==51||LA12_4==53||LA12_4==60) ) {
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
                    // InternalMyDsl.g:1239:2: ( RULE_INT )
                    {
                    // InternalMyDsl.g:1239:2: ( RULE_INT )
                    // InternalMyDsl.g:1240:3: RULE_INT
                    {
                     before(grammarAccess.getNUMERICAccess().getINTTerminalRuleCall_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getNUMERICAccess().getINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1245:2: ( ruleFLOAT )
                    {
                    // InternalMyDsl.g:1245:2: ( ruleFLOAT )
                    // InternalMyDsl.g:1246:3: ruleFLOAT
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
                    // InternalMyDsl.g:1251:2: ( ruleSCIENTIFIC )
                    {
                    // InternalMyDsl.g:1251:2: ( ruleSCIENTIFIC )
                    // InternalMyDsl.g:1252:3: ruleSCIENTIFIC
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
    // InternalMyDsl.g:1261:1: rule__JointType__Alternatives : ( ( ( 'fixed' ) ) | ( ( 'revolute' ) ) | ( ( 'prismatic' ) ) | ( ( 'continuous' ) ) );
    public final void rule__JointType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1265:1: ( ( ( 'fixed' ) ) | ( ( 'revolute' ) ) | ( ( 'prismatic' ) ) | ( ( 'continuous' ) ) )
            int alt13=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt13=1;
                }
                break;
            case 14:
                {
                alt13=2;
                }
                break;
            case 15:
                {
                alt13=3;
                }
                break;
            case 16:
                {
                alt13=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:1266:2: ( ( 'fixed' ) )
                    {
                    // InternalMyDsl.g:1266:2: ( ( 'fixed' ) )
                    // InternalMyDsl.g:1267:3: ( 'fixed' )
                    {
                     before(grammarAccess.getJointTypeAccess().getFixedEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:1268:3: ( 'fixed' )
                    // InternalMyDsl.g:1268:4: 'fixed'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getJointTypeAccess().getFixedEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1272:2: ( ( 'revolute' ) )
                    {
                    // InternalMyDsl.g:1272:2: ( ( 'revolute' ) )
                    // InternalMyDsl.g:1273:3: ( 'revolute' )
                    {
                     before(grammarAccess.getJointTypeAccess().getRevoluteEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:1274:3: ( 'revolute' )
                    // InternalMyDsl.g:1274:4: 'revolute'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getJointTypeAccess().getRevoluteEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1278:2: ( ( 'prismatic' ) )
                    {
                    // InternalMyDsl.g:1278:2: ( ( 'prismatic' ) )
                    // InternalMyDsl.g:1279:3: ( 'prismatic' )
                    {
                     before(grammarAccess.getJointTypeAccess().getPrismaticEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:1280:3: ( 'prismatic' )
                    // InternalMyDsl.g:1280:4: 'prismatic'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getJointTypeAccess().getPrismaticEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1284:2: ( ( 'continuous' ) )
                    {
                    // InternalMyDsl.g:1284:2: ( ( 'continuous' ) )
                    // InternalMyDsl.g:1285:3: ( 'continuous' )
                    {
                     before(grammarAccess.getJointTypeAccess().getContinuousEnumLiteralDeclaration_3()); 
                    // InternalMyDsl.g:1286:3: ( 'continuous' )
                    // InternalMyDsl.g:1286:4: 'continuous'
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
    // InternalMyDsl.g:1294:1: rule__Robot__Group__0 : rule__Robot__Group__0__Impl rule__Robot__Group__1 ;
    public final void rule__Robot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1298:1: ( rule__Robot__Group__0__Impl rule__Robot__Group__1 )
            // InternalMyDsl.g:1299:2: rule__Robot__Group__0__Impl rule__Robot__Group__1
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
    // InternalMyDsl.g:1306:1: rule__Robot__Group__0__Impl : ( 'Robot' ) ;
    public final void rule__Robot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1310:1: ( ( 'Robot' ) )
            // InternalMyDsl.g:1311:1: ( 'Robot' )
            {
            // InternalMyDsl.g:1311:1: ( 'Robot' )
            // InternalMyDsl.g:1312:2: 'Robot'
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
    // InternalMyDsl.g:1321:1: rule__Robot__Group__1 : rule__Robot__Group__1__Impl rule__Robot__Group__2 ;
    public final void rule__Robot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1325:1: ( rule__Robot__Group__1__Impl rule__Robot__Group__2 )
            // InternalMyDsl.g:1326:2: rule__Robot__Group__1__Impl rule__Robot__Group__2
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
    // InternalMyDsl.g:1333:1: rule__Robot__Group__1__Impl : ( ( rule__Robot__NameAssignment_1 ) ) ;
    public final void rule__Robot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1337:1: ( ( ( rule__Robot__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1338:1: ( ( rule__Robot__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1338:1: ( ( rule__Robot__NameAssignment_1 ) )
            // InternalMyDsl.g:1339:2: ( rule__Robot__NameAssignment_1 )
            {
             before(grammarAccess.getRobotAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1340:2: ( rule__Robot__NameAssignment_1 )
            // InternalMyDsl.g:1340:3: rule__Robot__NameAssignment_1
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
    // InternalMyDsl.g:1348:1: rule__Robot__Group__2 : rule__Robot__Group__2__Impl ;
    public final void rule__Robot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1352:1: ( rule__Robot__Group__2__Impl )
            // InternalMyDsl.g:1353:2: rule__Robot__Group__2__Impl
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
    // InternalMyDsl.g:1359:1: rule__Robot__Group__2__Impl : ( ( rule__Robot__Alternatives_2 )* ) ;
    public final void rule__Robot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1363:1: ( ( ( rule__Robot__Alternatives_2 )* ) )
            // InternalMyDsl.g:1364:1: ( ( rule__Robot__Alternatives_2 )* )
            {
            // InternalMyDsl.g:1364:1: ( ( rule__Robot__Alternatives_2 )* )
            // InternalMyDsl.g:1365:2: ( rule__Robot__Alternatives_2 )*
            {
             before(grammarAccess.getRobotAccess().getAlternatives_2()); 
            // InternalMyDsl.g:1366:2: ( rule__Robot__Alternatives_2 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==18||LA14_0==60) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMyDsl.g:1366:3: rule__Robot__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Robot__Alternatives_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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


    // $ANTLR start "rule__Link__Group__0"
    // InternalMyDsl.g:1375:1: rule__Link__Group__0 : rule__Link__Group__0__Impl rule__Link__Group__1 ;
    public final void rule__Link__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1379:1: ( rule__Link__Group__0__Impl rule__Link__Group__1 )
            // InternalMyDsl.g:1380:2: rule__Link__Group__0__Impl rule__Link__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:1387:1: rule__Link__Group__0__Impl : ( () ) ;
    public final void rule__Link__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1391:1: ( ( () ) )
            // InternalMyDsl.g:1392:1: ( () )
            {
            // InternalMyDsl.g:1392:1: ( () )
            // InternalMyDsl.g:1393:2: ()
            {
             before(grammarAccess.getLinkAccess().getLinkAction_0()); 
            // InternalMyDsl.g:1394:2: ()
            // InternalMyDsl.g:1394:3: 
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
    // InternalMyDsl.g:1402:1: rule__Link__Group__1 : rule__Link__Group__1__Impl rule__Link__Group__2 ;
    public final void rule__Link__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1406:1: ( rule__Link__Group__1__Impl rule__Link__Group__2 )
            // InternalMyDsl.g:1407:2: rule__Link__Group__1__Impl rule__Link__Group__2
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
    // InternalMyDsl.g:1414:1: rule__Link__Group__1__Impl : ( 'Link' ) ;
    public final void rule__Link__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1418:1: ( ( 'Link' ) )
            // InternalMyDsl.g:1419:1: ( 'Link' )
            {
            // InternalMyDsl.g:1419:1: ( 'Link' )
            // InternalMyDsl.g:1420:2: 'Link'
            {
             before(grammarAccess.getLinkAccess().getLinkKeyword_1()); 
            match(input,18,FOLLOW_2); 
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
    // InternalMyDsl.g:1429:1: rule__Link__Group__2 : rule__Link__Group__2__Impl rule__Link__Group__3 ;
    public final void rule__Link__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1433:1: ( rule__Link__Group__2__Impl rule__Link__Group__3 )
            // InternalMyDsl.g:1434:2: rule__Link__Group__2__Impl rule__Link__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalMyDsl.g:1441:1: rule__Link__Group__2__Impl : ( ( rule__Link__NameAssignment_2 ) ) ;
    public final void rule__Link__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1445:1: ( ( ( rule__Link__NameAssignment_2 ) ) )
            // InternalMyDsl.g:1446:1: ( ( rule__Link__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:1446:1: ( ( rule__Link__NameAssignment_2 ) )
            // InternalMyDsl.g:1447:2: ( rule__Link__NameAssignment_2 )
            {
             before(grammarAccess.getLinkAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:1448:2: ( rule__Link__NameAssignment_2 )
            // InternalMyDsl.g:1448:3: rule__Link__NameAssignment_2
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
    // InternalMyDsl.g:1456:1: rule__Link__Group__3 : rule__Link__Group__3__Impl ;
    public final void rule__Link__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1460:1: ( rule__Link__Group__3__Impl )
            // InternalMyDsl.g:1461:2: rule__Link__Group__3__Impl
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
    // InternalMyDsl.g:1467:1: rule__Link__Group__3__Impl : ( ( rule__Link__Alternatives_3 )? ) ;
    public final void rule__Link__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1471:1: ( ( ( rule__Link__Alternatives_3 )? ) )
            // InternalMyDsl.g:1472:1: ( ( rule__Link__Alternatives_3 )? )
            {
            // InternalMyDsl.g:1472:1: ( ( rule__Link__Alternatives_3 )? )
            // InternalMyDsl.g:1473:2: ( rule__Link__Alternatives_3 )?
            {
             before(grammarAccess.getLinkAccess().getAlternatives_3()); 
            // InternalMyDsl.g:1474:2: ( rule__Link__Alternatives_3 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=19 && LA15_0<=20)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:1474:3: rule__Link__Alternatives_3
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
    // InternalMyDsl.g:1483:1: rule__Link__Group_3_0__0 : rule__Link__Group_3_0__0__Impl rule__Link__Group_3_0__1 ;
    public final void rule__Link__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1487:1: ( rule__Link__Group_3_0__0__Impl rule__Link__Group_3_0__1 )
            // InternalMyDsl.g:1488:2: rule__Link__Group_3_0__0__Impl rule__Link__Group_3_0__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalMyDsl.g:1495:1: rule__Link__Group_3_0__0__Impl : ( 'def' ) ;
    public final void rule__Link__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1499:1: ( ( 'def' ) )
            // InternalMyDsl.g:1500:1: ( 'def' )
            {
            // InternalMyDsl.g:1500:1: ( 'def' )
            // InternalMyDsl.g:1501:2: 'def'
            {
             before(grammarAccess.getLinkAccess().getDefKeyword_3_0_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalMyDsl.g:1510:1: rule__Link__Group_3_0__1 : rule__Link__Group_3_0__1__Impl ;
    public final void rule__Link__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1514:1: ( rule__Link__Group_3_0__1__Impl )
            // InternalMyDsl.g:1515:2: rule__Link__Group_3_0__1__Impl
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
    // InternalMyDsl.g:1521:1: rule__Link__Group_3_0__1__Impl : ( ( rule__Link__Alternatives_3_0_1 )* ) ;
    public final void rule__Link__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1525:1: ( ( ( rule__Link__Alternatives_3_0_1 )* ) )
            // InternalMyDsl.g:1526:1: ( ( rule__Link__Alternatives_3_0_1 )* )
            {
            // InternalMyDsl.g:1526:1: ( ( rule__Link__Alternatives_3_0_1 )* )
            // InternalMyDsl.g:1527:2: ( rule__Link__Alternatives_3_0_1 )*
            {
             before(grammarAccess.getLinkAccess().getAlternatives_3_0_1()); 
            // InternalMyDsl.g:1528:2: ( rule__Link__Alternatives_3_0_1 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==24||LA16_0==32||LA16_0==44) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMyDsl.g:1528:3: rule__Link__Alternatives_3_0_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Link__Alternatives_3_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalMyDsl.g:1537:1: rule__Link__Group_3_1__0 : rule__Link__Group_3_1__0__Impl rule__Link__Group_3_1__1 ;
    public final void rule__Link__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1541:1: ( rule__Link__Group_3_1__0__Impl rule__Link__Group_3_1__1 )
            // InternalMyDsl.g:1542:2: rule__Link__Group_3_1__0__Impl rule__Link__Group_3_1__1
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
    // InternalMyDsl.g:1549:1: rule__Link__Group_3_1__0__Impl : ( 'reuse' ) ;
    public final void rule__Link__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1553:1: ( ( 'reuse' ) )
            // InternalMyDsl.g:1554:1: ( 'reuse' )
            {
            // InternalMyDsl.g:1554:1: ( 'reuse' )
            // InternalMyDsl.g:1555:2: 'reuse'
            {
             before(grammarAccess.getLinkAccess().getReuseKeyword_3_1_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalMyDsl.g:1564:1: rule__Link__Group_3_1__1 : rule__Link__Group_3_1__1__Impl rule__Link__Group_3_1__2 ;
    public final void rule__Link__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1568:1: ( rule__Link__Group_3_1__1__Impl rule__Link__Group_3_1__2 )
            // InternalMyDsl.g:1569:2: rule__Link__Group_3_1__1__Impl rule__Link__Group_3_1__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:1576:1: rule__Link__Group_3_1__1__Impl : ( ( rule__Link__LinkAssignment_3_1_1 ) ) ;
    public final void rule__Link__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1580:1: ( ( ( rule__Link__LinkAssignment_3_1_1 ) ) )
            // InternalMyDsl.g:1581:1: ( ( rule__Link__LinkAssignment_3_1_1 ) )
            {
            // InternalMyDsl.g:1581:1: ( ( rule__Link__LinkAssignment_3_1_1 ) )
            // InternalMyDsl.g:1582:2: ( rule__Link__LinkAssignment_3_1_1 )
            {
             before(grammarAccess.getLinkAccess().getLinkAssignment_3_1_1()); 
            // InternalMyDsl.g:1583:2: ( rule__Link__LinkAssignment_3_1_1 )
            // InternalMyDsl.g:1583:3: rule__Link__LinkAssignment_3_1_1
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
    // InternalMyDsl.g:1591:1: rule__Link__Group_3_1__2 : rule__Link__Group_3_1__2__Impl ;
    public final void rule__Link__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1595:1: ( rule__Link__Group_3_1__2__Impl )
            // InternalMyDsl.g:1596:2: rule__Link__Group_3_1__2__Impl
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
    // InternalMyDsl.g:1602:1: rule__Link__Group_3_1__2__Impl : ( ( rule__Link__ReuseAssignment_3_1_2 ) ) ;
    public final void rule__Link__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1606:1: ( ( ( rule__Link__ReuseAssignment_3_1_2 ) ) )
            // InternalMyDsl.g:1607:1: ( ( rule__Link__ReuseAssignment_3_1_2 ) )
            {
            // InternalMyDsl.g:1607:1: ( ( rule__Link__ReuseAssignment_3_1_2 ) )
            // InternalMyDsl.g:1608:2: ( rule__Link__ReuseAssignment_3_1_2 )
            {
             before(grammarAccess.getLinkAccess().getReuseAssignment_3_1_2()); 
            // InternalMyDsl.g:1609:2: ( rule__Link__ReuseAssignment_3_1_2 )
            // InternalMyDsl.g:1609:3: rule__Link__ReuseAssignment_3_1_2
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
    // InternalMyDsl.g:1618:1: rule__Reuse__Group__0 : rule__Reuse__Group__0__Impl rule__Reuse__Group__1 ;
    public final void rule__Reuse__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1622:1: ( rule__Reuse__Group__0__Impl rule__Reuse__Group__1 )
            // InternalMyDsl.g:1623:2: rule__Reuse__Group__0__Impl rule__Reuse__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:1630:1: rule__Reuse__Group__0__Impl : ( () ) ;
    public final void rule__Reuse__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1634:1: ( ( () ) )
            // InternalMyDsl.g:1635:1: ( () )
            {
            // InternalMyDsl.g:1635:1: ( () )
            // InternalMyDsl.g:1636:2: ()
            {
             before(grammarAccess.getReuseAccess().getReuseAction_0()); 
            // InternalMyDsl.g:1637:2: ()
            // InternalMyDsl.g:1637:3: 
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
    // InternalMyDsl.g:1645:1: rule__Reuse__Group__1 : rule__Reuse__Group__1__Impl ;
    public final void rule__Reuse__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1649:1: ( rule__Reuse__Group__1__Impl )
            // InternalMyDsl.g:1650:2: rule__Reuse__Group__1__Impl
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
    // InternalMyDsl.g:1656:1: rule__Reuse__Group__1__Impl : ( ( rule__Reuse__Alternatives_1 )? ) ;
    public final void rule__Reuse__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1660:1: ( ( ( rule__Reuse__Alternatives_1 )? ) )
            // InternalMyDsl.g:1661:1: ( ( rule__Reuse__Alternatives_1 )? )
            {
            // InternalMyDsl.g:1661:1: ( ( rule__Reuse__Alternatives_1 )? )
            // InternalMyDsl.g:1662:2: ( rule__Reuse__Alternatives_1 )?
            {
             before(grammarAccess.getReuseAccess().getAlternatives_1()); 
            // InternalMyDsl.g:1663:2: ( rule__Reuse__Alternatives_1 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=21 && LA17_0<=22)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:1663:3: rule__Reuse__Alternatives_1
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
    // InternalMyDsl.g:1672:1: rule__Reuse__Group_1_0__0 : rule__Reuse__Group_1_0__0__Impl rule__Reuse__Group_1_0__1 ;
    public final void rule__Reuse__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1676:1: ( rule__Reuse__Group_1_0__0__Impl rule__Reuse__Group_1_0__1 )
            // InternalMyDsl.g:1677:2: rule__Reuse__Group_1_0__0__Impl rule__Reuse__Group_1_0__1
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
    // InternalMyDsl.g:1684:1: rule__Reuse__Group_1_0__0__Impl : ( 'edit' ) ;
    public final void rule__Reuse__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1688:1: ( ( 'edit' ) )
            // InternalMyDsl.g:1689:1: ( 'edit' )
            {
            // InternalMyDsl.g:1689:1: ( 'edit' )
            // InternalMyDsl.g:1690:2: 'edit'
            {
             before(grammarAccess.getReuseAccess().getEditKeyword_1_0_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalMyDsl.g:1699:1: rule__Reuse__Group_1_0__1 : rule__Reuse__Group_1_0__1__Impl ;
    public final void rule__Reuse__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1703:1: ( rule__Reuse__Group_1_0__1__Impl )
            // InternalMyDsl.g:1704:2: rule__Reuse__Group_1_0__1__Impl
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
    // InternalMyDsl.g:1710:1: rule__Reuse__Group_1_0__1__Impl : ( ( rule__Reuse__RefAssignment_1_0_1 ) ) ;
    public final void rule__Reuse__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1714:1: ( ( ( rule__Reuse__RefAssignment_1_0_1 ) ) )
            // InternalMyDsl.g:1715:1: ( ( rule__Reuse__RefAssignment_1_0_1 ) )
            {
            // InternalMyDsl.g:1715:1: ( ( rule__Reuse__RefAssignment_1_0_1 ) )
            // InternalMyDsl.g:1716:2: ( rule__Reuse__RefAssignment_1_0_1 )
            {
             before(grammarAccess.getReuseAccess().getRefAssignment_1_0_1()); 
            // InternalMyDsl.g:1717:2: ( rule__Reuse__RefAssignment_1_0_1 )
            // InternalMyDsl.g:1717:3: rule__Reuse__RefAssignment_1_0_1
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
    // InternalMyDsl.g:1726:1: rule__Reuse__Group_1_1__0 : rule__Reuse__Group_1_1__0__Impl rule__Reuse__Group_1_1__1 ;
    public final void rule__Reuse__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1730:1: ( rule__Reuse__Group_1_1__0__Impl rule__Reuse__Group_1_1__1 )
            // InternalMyDsl.g:1731:2: rule__Reuse__Group_1_1__0__Impl rule__Reuse__Group_1_1__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalMyDsl.g:1738:1: rule__Reuse__Group_1_1__0__Impl : ( 'add' ) ;
    public final void rule__Reuse__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1742:1: ( ( 'add' ) )
            // InternalMyDsl.g:1743:1: ( 'add' )
            {
            // InternalMyDsl.g:1743:1: ( 'add' )
            // InternalMyDsl.g:1744:2: 'add'
            {
             before(grammarAccess.getReuseAccess().getAddKeyword_1_1_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalMyDsl.g:1753:1: rule__Reuse__Group_1_1__1 : rule__Reuse__Group_1_1__1__Impl ;
    public final void rule__Reuse__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1757:1: ( rule__Reuse__Group_1_1__1__Impl )
            // InternalMyDsl.g:1758:2: rule__Reuse__Group_1_1__1__Impl
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
    // InternalMyDsl.g:1764:1: rule__Reuse__Group_1_1__1__Impl : ( ( rule__Reuse__AddAssignment_1_1_1 ) ) ;
    public final void rule__Reuse__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1768:1: ( ( ( rule__Reuse__AddAssignment_1_1_1 ) ) )
            // InternalMyDsl.g:1769:1: ( ( rule__Reuse__AddAssignment_1_1_1 ) )
            {
            // InternalMyDsl.g:1769:1: ( ( rule__Reuse__AddAssignment_1_1_1 ) )
            // InternalMyDsl.g:1770:2: ( rule__Reuse__AddAssignment_1_1_1 )
            {
             before(grammarAccess.getReuseAccess().getAddAssignment_1_1_1()); 
            // InternalMyDsl.g:1771:2: ( rule__Reuse__AddAssignment_1_1_1 )
            // InternalMyDsl.g:1771:3: rule__Reuse__AddAssignment_1_1_1
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
    // InternalMyDsl.g:1780:1: rule__DotExpression__Group__0 : rule__DotExpression__Group__0__Impl rule__DotExpression__Group__1 ;
    public final void rule__DotExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1784:1: ( rule__DotExpression__Group__0__Impl rule__DotExpression__Group__1 )
            // InternalMyDsl.g:1785:2: rule__DotExpression__Group__0__Impl rule__DotExpression__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:1792:1: rule__DotExpression__Group__0__Impl : ( ruleReUsableRef ) ;
    public final void rule__DotExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1796:1: ( ( ruleReUsableRef ) )
            // InternalMyDsl.g:1797:1: ( ruleReUsableRef )
            {
            // InternalMyDsl.g:1797:1: ( ruleReUsableRef )
            // InternalMyDsl.g:1798:2: ruleReUsableRef
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
    // InternalMyDsl.g:1807:1: rule__DotExpression__Group__1 : rule__DotExpression__Group__1__Impl ;
    public final void rule__DotExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1811:1: ( rule__DotExpression__Group__1__Impl )
            // InternalMyDsl.g:1812:2: rule__DotExpression__Group__1__Impl
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
    // InternalMyDsl.g:1818:1: rule__DotExpression__Group__1__Impl : ( ( rule__DotExpression__Group_1__0 )* ) ;
    public final void rule__DotExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1822:1: ( ( ( rule__DotExpression__Group_1__0 )* ) )
            // InternalMyDsl.g:1823:1: ( ( rule__DotExpression__Group_1__0 )* )
            {
            // InternalMyDsl.g:1823:1: ( ( rule__DotExpression__Group_1__0 )* )
            // InternalMyDsl.g:1824:2: ( rule__DotExpression__Group_1__0 )*
            {
             before(grammarAccess.getDotExpressionAccess().getGroup_1()); 
            // InternalMyDsl.g:1825:2: ( rule__DotExpression__Group_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==23) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMyDsl.g:1825:3: rule__DotExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__DotExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalMyDsl.g:1834:1: rule__DotExpression__Group_1__0 : rule__DotExpression__Group_1__0__Impl rule__DotExpression__Group_1__1 ;
    public final void rule__DotExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1838:1: ( rule__DotExpression__Group_1__0__Impl rule__DotExpression__Group_1__1 )
            // InternalMyDsl.g:1839:2: rule__DotExpression__Group_1__0__Impl rule__DotExpression__Group_1__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:1846:1: rule__DotExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__DotExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1850:1: ( ( () ) )
            // InternalMyDsl.g:1851:1: ( () )
            {
            // InternalMyDsl.g:1851:1: ( () )
            // InternalMyDsl.g:1852:2: ()
            {
             before(grammarAccess.getDotExpressionAccess().getDotExpressionRefAction_1_0()); 
            // InternalMyDsl.g:1853:2: ()
            // InternalMyDsl.g:1853:3: 
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
    // InternalMyDsl.g:1861:1: rule__DotExpression__Group_1__1 : rule__DotExpression__Group_1__1__Impl rule__DotExpression__Group_1__2 ;
    public final void rule__DotExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1865:1: ( rule__DotExpression__Group_1__1__Impl rule__DotExpression__Group_1__2 )
            // InternalMyDsl.g:1866:2: rule__DotExpression__Group_1__1__Impl rule__DotExpression__Group_1__2
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
    // InternalMyDsl.g:1873:1: rule__DotExpression__Group_1__1__Impl : ( '.' ) ;
    public final void rule__DotExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1877:1: ( ( '.' ) )
            // InternalMyDsl.g:1878:1: ( '.' )
            {
            // InternalMyDsl.g:1878:1: ( '.' )
            // InternalMyDsl.g:1879:2: '.'
            {
             before(grammarAccess.getDotExpressionAccess().getFullStopKeyword_1_1()); 
            match(input,23,FOLLOW_2); 
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
    // InternalMyDsl.g:1888:1: rule__DotExpression__Group_1__2 : rule__DotExpression__Group_1__2__Impl ;
    public final void rule__DotExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1892:1: ( rule__DotExpression__Group_1__2__Impl )
            // InternalMyDsl.g:1893:2: rule__DotExpression__Group_1__2__Impl
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
    // InternalMyDsl.g:1899:1: rule__DotExpression__Group_1__2__Impl : ( ( rule__DotExpression__TailAssignment_1_2 ) ) ;
    public final void rule__DotExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1903:1: ( ( ( rule__DotExpression__TailAssignment_1_2 ) ) )
            // InternalMyDsl.g:1904:1: ( ( rule__DotExpression__TailAssignment_1_2 ) )
            {
            // InternalMyDsl.g:1904:1: ( ( rule__DotExpression__TailAssignment_1_2 ) )
            // InternalMyDsl.g:1905:2: ( rule__DotExpression__TailAssignment_1_2 )
            {
             before(grammarAccess.getDotExpressionAccess().getTailAssignment_1_2()); 
            // InternalMyDsl.g:1906:2: ( rule__DotExpression__TailAssignment_1_2 )
            // InternalMyDsl.g:1906:3: rule__DotExpression__TailAssignment_1_2
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
    // InternalMyDsl.g:1915:1: rule__ReUsableRef__Group__0 : rule__ReUsableRef__Group__0__Impl rule__ReUsableRef__Group__1 ;
    public final void rule__ReUsableRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1919:1: ( rule__ReUsableRef__Group__0__Impl rule__ReUsableRef__Group__1 )
            // InternalMyDsl.g:1920:2: rule__ReUsableRef__Group__0__Impl rule__ReUsableRef__Group__1
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
    // InternalMyDsl.g:1927:1: rule__ReUsableRef__Group__0__Impl : ( () ) ;
    public final void rule__ReUsableRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1931:1: ( ( () ) )
            // InternalMyDsl.g:1932:1: ( () )
            {
            // InternalMyDsl.g:1932:1: ( () )
            // InternalMyDsl.g:1933:2: ()
            {
             before(grammarAccess.getReUsableRefAccess().getReUsableRefAction_0()); 
            // InternalMyDsl.g:1934:2: ()
            // InternalMyDsl.g:1934:3: 
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
    // InternalMyDsl.g:1942:1: rule__ReUsableRef__Group__1 : rule__ReUsableRef__Group__1__Impl ;
    public final void rule__ReUsableRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1946:1: ( rule__ReUsableRef__Group__1__Impl )
            // InternalMyDsl.g:1947:2: rule__ReUsableRef__Group__1__Impl
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
    // InternalMyDsl.g:1953:1: rule__ReUsableRef__Group__1__Impl : ( ( rule__ReUsableRef__ReuseableAssignment_1 ) ) ;
    public final void rule__ReUsableRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1957:1: ( ( ( rule__ReUsableRef__ReuseableAssignment_1 ) ) )
            // InternalMyDsl.g:1958:1: ( ( rule__ReUsableRef__ReuseableAssignment_1 ) )
            {
            // InternalMyDsl.g:1958:1: ( ( rule__ReUsableRef__ReuseableAssignment_1 ) )
            // InternalMyDsl.g:1959:2: ( rule__ReUsableRef__ReuseableAssignment_1 )
            {
             before(grammarAccess.getReUsableRefAccess().getReuseableAssignment_1()); 
            // InternalMyDsl.g:1960:2: ( rule__ReUsableRef__ReuseableAssignment_1 )
            // InternalMyDsl.g:1960:3: rule__ReUsableRef__ReuseableAssignment_1
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
    // InternalMyDsl.g:1969:1: rule__Inertial__Group__0 : rule__Inertial__Group__0__Impl rule__Inertial__Group__1 ;
    public final void rule__Inertial__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1973:1: ( rule__Inertial__Group__0__Impl rule__Inertial__Group__1 )
            // InternalMyDsl.g:1974:2: rule__Inertial__Group__0__Impl rule__Inertial__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalMyDsl.g:1981:1: rule__Inertial__Group__0__Impl : ( () ) ;
    public final void rule__Inertial__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1985:1: ( ( () ) )
            // InternalMyDsl.g:1986:1: ( () )
            {
            // InternalMyDsl.g:1986:1: ( () )
            // InternalMyDsl.g:1987:2: ()
            {
             before(grammarAccess.getInertialAccess().getInertialAction_0()); 
            // InternalMyDsl.g:1988:2: ()
            // InternalMyDsl.g:1988:3: 
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
    // InternalMyDsl.g:1996:1: rule__Inertial__Group__1 : rule__Inertial__Group__1__Impl rule__Inertial__Group__2 ;
    public final void rule__Inertial__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2000:1: ( rule__Inertial__Group__1__Impl rule__Inertial__Group__2 )
            // InternalMyDsl.g:2001:2: rule__Inertial__Group__1__Impl rule__Inertial__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyDsl.g:2008:1: rule__Inertial__Group__1__Impl : ( 'Inertial' ) ;
    public final void rule__Inertial__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2012:1: ( ( 'Inertial' ) )
            // InternalMyDsl.g:2013:1: ( 'Inertial' )
            {
            // InternalMyDsl.g:2013:1: ( 'Inertial' )
            // InternalMyDsl.g:2014:2: 'Inertial'
            {
             before(grammarAccess.getInertialAccess().getInertialKeyword_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalMyDsl.g:2023:1: rule__Inertial__Group__2 : rule__Inertial__Group__2__Impl rule__Inertial__Group__3 ;
    public final void rule__Inertial__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2027:1: ( rule__Inertial__Group__2__Impl rule__Inertial__Group__3 )
            // InternalMyDsl.g:2028:2: rule__Inertial__Group__2__Impl rule__Inertial__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyDsl.g:2035:1: rule__Inertial__Group__2__Impl : ( ( rule__Inertial__NameAssignment_2 )? ) ;
    public final void rule__Inertial__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2039:1: ( ( ( rule__Inertial__NameAssignment_2 )? ) )
            // InternalMyDsl.g:2040:1: ( ( rule__Inertial__NameAssignment_2 )? )
            {
            // InternalMyDsl.g:2040:1: ( ( rule__Inertial__NameAssignment_2 )? )
            // InternalMyDsl.g:2041:2: ( rule__Inertial__NameAssignment_2 )?
            {
             before(grammarAccess.getInertialAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:2042:2: ( rule__Inertial__NameAssignment_2 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyDsl.g:2042:3: rule__Inertial__NameAssignment_2
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
    // InternalMyDsl.g:2050:1: rule__Inertial__Group__3 : rule__Inertial__Group__3__Impl rule__Inertial__Group__4 ;
    public final void rule__Inertial__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2054:1: ( rule__Inertial__Group__3__Impl rule__Inertial__Group__4 )
            // InternalMyDsl.g:2055:2: rule__Inertial__Group__3__Impl rule__Inertial__Group__4
            {
            pushFollow(FOLLOW_16);
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
    // InternalMyDsl.g:2062:1: rule__Inertial__Group__3__Impl : ( ( rule__Inertial__InertiaAssignment_3 ) ) ;
    public final void rule__Inertial__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2066:1: ( ( ( rule__Inertial__InertiaAssignment_3 ) ) )
            // InternalMyDsl.g:2067:1: ( ( rule__Inertial__InertiaAssignment_3 ) )
            {
            // InternalMyDsl.g:2067:1: ( ( rule__Inertial__InertiaAssignment_3 ) )
            // InternalMyDsl.g:2068:2: ( rule__Inertial__InertiaAssignment_3 )
            {
             before(grammarAccess.getInertialAccess().getInertiaAssignment_3()); 
            // InternalMyDsl.g:2069:2: ( rule__Inertial__InertiaAssignment_3 )
            // InternalMyDsl.g:2069:3: rule__Inertial__InertiaAssignment_3
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
    // InternalMyDsl.g:2077:1: rule__Inertial__Group__4 : rule__Inertial__Group__4__Impl rule__Inertial__Group__5 ;
    public final void rule__Inertial__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2081:1: ( rule__Inertial__Group__4__Impl rule__Inertial__Group__5 )
            // InternalMyDsl.g:2082:2: rule__Inertial__Group__4__Impl rule__Inertial__Group__5
            {
            pushFollow(FOLLOW_17);
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
    // InternalMyDsl.g:2089:1: rule__Inertial__Group__4__Impl : ( ( rule__Inertial__MassAssignment_4 ) ) ;
    public final void rule__Inertial__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2093:1: ( ( ( rule__Inertial__MassAssignment_4 ) ) )
            // InternalMyDsl.g:2094:1: ( ( rule__Inertial__MassAssignment_4 ) )
            {
            // InternalMyDsl.g:2094:1: ( ( rule__Inertial__MassAssignment_4 ) )
            // InternalMyDsl.g:2095:2: ( rule__Inertial__MassAssignment_4 )
            {
             before(grammarAccess.getInertialAccess().getMassAssignment_4()); 
            // InternalMyDsl.g:2096:2: ( rule__Inertial__MassAssignment_4 )
            // InternalMyDsl.g:2096:3: rule__Inertial__MassAssignment_4
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
    // InternalMyDsl.g:2104:1: rule__Inertial__Group__5 : rule__Inertial__Group__5__Impl ;
    public final void rule__Inertial__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2108:1: ( rule__Inertial__Group__5__Impl )
            // InternalMyDsl.g:2109:2: rule__Inertial__Group__5__Impl
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
    // InternalMyDsl.g:2115:1: rule__Inertial__Group__5__Impl : ( ( rule__Inertial__OriginAssignment_5 )? ) ;
    public final void rule__Inertial__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2119:1: ( ( ( rule__Inertial__OriginAssignment_5 )? ) )
            // InternalMyDsl.g:2120:1: ( ( rule__Inertial__OriginAssignment_5 )? )
            {
            // InternalMyDsl.g:2120:1: ( ( rule__Inertial__OriginAssignment_5 )? )
            // InternalMyDsl.g:2121:2: ( rule__Inertial__OriginAssignment_5 )?
            {
             before(grammarAccess.getInertialAccess().getOriginAssignment_5()); 
            // InternalMyDsl.g:2122:2: ( rule__Inertial__OriginAssignment_5 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==35) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMyDsl.g:2122:3: rule__Inertial__OriginAssignment_5
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
    // InternalMyDsl.g:2131:1: rule__Inertia__Group__0 : rule__Inertia__Group__0__Impl rule__Inertia__Group__1 ;
    public final void rule__Inertia__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2135:1: ( rule__Inertia__Group__0__Impl rule__Inertia__Group__1 )
            // InternalMyDsl.g:2136:2: rule__Inertia__Group__0__Impl rule__Inertia__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyDsl.g:2143:1: rule__Inertia__Group__0__Impl : ( () ) ;
    public final void rule__Inertia__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2147:1: ( ( () ) )
            // InternalMyDsl.g:2148:1: ( () )
            {
            // InternalMyDsl.g:2148:1: ( () )
            // InternalMyDsl.g:2149:2: ()
            {
             before(grammarAccess.getInertiaAccess().getInertiaAction_0()); 
            // InternalMyDsl.g:2150:2: ()
            // InternalMyDsl.g:2150:3: 
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
    // InternalMyDsl.g:2158:1: rule__Inertia__Group__1 : rule__Inertia__Group__1__Impl rule__Inertia__Group__2 ;
    public final void rule__Inertia__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2162:1: ( rule__Inertia__Group__1__Impl rule__Inertia__Group__2 )
            // InternalMyDsl.g:2163:2: rule__Inertia__Group__1__Impl rule__Inertia__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalMyDsl.g:2170:1: rule__Inertia__Group__1__Impl : ( 'Inertia' ) ;
    public final void rule__Inertia__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2174:1: ( ( 'Inertia' ) )
            // InternalMyDsl.g:2175:1: ( 'Inertia' )
            {
            // InternalMyDsl.g:2175:1: ( 'Inertia' )
            // InternalMyDsl.g:2176:2: 'Inertia'
            {
             before(grammarAccess.getInertiaAccess().getInertiaKeyword_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalMyDsl.g:2185:1: rule__Inertia__Group__2 : rule__Inertia__Group__2__Impl rule__Inertia__Group__3 ;
    public final void rule__Inertia__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2189:1: ( rule__Inertia__Group__2__Impl rule__Inertia__Group__3 )
            // InternalMyDsl.g:2190:2: rule__Inertia__Group__2__Impl rule__Inertia__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalMyDsl.g:2197:1: rule__Inertia__Group__2__Impl : ( ( rule__Inertia__NameAssignment_2 )? ) ;
    public final void rule__Inertia__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2201:1: ( ( ( rule__Inertia__NameAssignment_2 )? ) )
            // InternalMyDsl.g:2202:1: ( ( rule__Inertia__NameAssignment_2 )? )
            {
            // InternalMyDsl.g:2202:1: ( ( rule__Inertia__NameAssignment_2 )? )
            // InternalMyDsl.g:2203:2: ( rule__Inertia__NameAssignment_2 )?
            {
             before(grammarAccess.getInertiaAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:2204:2: ( rule__Inertia__NameAssignment_2 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMyDsl.g:2204:3: rule__Inertia__NameAssignment_2
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
    // InternalMyDsl.g:2212:1: rule__Inertia__Group__3 : rule__Inertia__Group__3__Impl rule__Inertia__Group__4 ;
    public final void rule__Inertia__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2216:1: ( rule__Inertia__Group__3__Impl rule__Inertia__Group__4 )
            // InternalMyDsl.g:2217:2: rule__Inertia__Group__3__Impl rule__Inertia__Group__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyDsl.g:2224:1: rule__Inertia__Group__3__Impl : ( 'ixx' ) ;
    public final void rule__Inertia__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2228:1: ( ( 'ixx' ) )
            // InternalMyDsl.g:2229:1: ( 'ixx' )
            {
            // InternalMyDsl.g:2229:1: ( 'ixx' )
            // InternalMyDsl.g:2230:2: 'ixx'
            {
             before(grammarAccess.getInertiaAccess().getIxxKeyword_3()); 
            match(input,26,FOLLOW_2); 
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
    // InternalMyDsl.g:2239:1: rule__Inertia__Group__4 : rule__Inertia__Group__4__Impl rule__Inertia__Group__5 ;
    public final void rule__Inertia__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2243:1: ( rule__Inertia__Group__4__Impl rule__Inertia__Group__5 )
            // InternalMyDsl.g:2244:2: rule__Inertia__Group__4__Impl rule__Inertia__Group__5
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:2251:1: rule__Inertia__Group__4__Impl : ( ( rule__Inertia__IxxAssignment_4 ) ) ;
    public final void rule__Inertia__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2255:1: ( ( ( rule__Inertia__IxxAssignment_4 ) ) )
            // InternalMyDsl.g:2256:1: ( ( rule__Inertia__IxxAssignment_4 ) )
            {
            // InternalMyDsl.g:2256:1: ( ( rule__Inertia__IxxAssignment_4 ) )
            // InternalMyDsl.g:2257:2: ( rule__Inertia__IxxAssignment_4 )
            {
             before(grammarAccess.getInertiaAccess().getIxxAssignment_4()); 
            // InternalMyDsl.g:2258:2: ( rule__Inertia__IxxAssignment_4 )
            // InternalMyDsl.g:2258:3: rule__Inertia__IxxAssignment_4
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
    // InternalMyDsl.g:2266:1: rule__Inertia__Group__5 : rule__Inertia__Group__5__Impl rule__Inertia__Group__6 ;
    public final void rule__Inertia__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2270:1: ( rule__Inertia__Group__5__Impl rule__Inertia__Group__6 )
            // InternalMyDsl.g:2271:2: rule__Inertia__Group__5__Impl rule__Inertia__Group__6
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyDsl.g:2278:1: rule__Inertia__Group__5__Impl : ( 'ixy' ) ;
    public final void rule__Inertia__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2282:1: ( ( 'ixy' ) )
            // InternalMyDsl.g:2283:1: ( 'ixy' )
            {
            // InternalMyDsl.g:2283:1: ( 'ixy' )
            // InternalMyDsl.g:2284:2: 'ixy'
            {
             before(grammarAccess.getInertiaAccess().getIxyKeyword_5()); 
            match(input,27,FOLLOW_2); 
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
    // InternalMyDsl.g:2293:1: rule__Inertia__Group__6 : rule__Inertia__Group__6__Impl rule__Inertia__Group__7 ;
    public final void rule__Inertia__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2297:1: ( rule__Inertia__Group__6__Impl rule__Inertia__Group__7 )
            // InternalMyDsl.g:2298:2: rule__Inertia__Group__6__Impl rule__Inertia__Group__7
            {
            pushFollow(FOLLOW_21);
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
    // InternalMyDsl.g:2305:1: rule__Inertia__Group__6__Impl : ( ( rule__Inertia__IxyAssignment_6 ) ) ;
    public final void rule__Inertia__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2309:1: ( ( ( rule__Inertia__IxyAssignment_6 ) ) )
            // InternalMyDsl.g:2310:1: ( ( rule__Inertia__IxyAssignment_6 ) )
            {
            // InternalMyDsl.g:2310:1: ( ( rule__Inertia__IxyAssignment_6 ) )
            // InternalMyDsl.g:2311:2: ( rule__Inertia__IxyAssignment_6 )
            {
             before(grammarAccess.getInertiaAccess().getIxyAssignment_6()); 
            // InternalMyDsl.g:2312:2: ( rule__Inertia__IxyAssignment_6 )
            // InternalMyDsl.g:2312:3: rule__Inertia__IxyAssignment_6
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
    // InternalMyDsl.g:2320:1: rule__Inertia__Group__7 : rule__Inertia__Group__7__Impl rule__Inertia__Group__8 ;
    public final void rule__Inertia__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2324:1: ( rule__Inertia__Group__7__Impl rule__Inertia__Group__8 )
            // InternalMyDsl.g:2325:2: rule__Inertia__Group__7__Impl rule__Inertia__Group__8
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyDsl.g:2332:1: rule__Inertia__Group__7__Impl : ( 'ixz' ) ;
    public final void rule__Inertia__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2336:1: ( ( 'ixz' ) )
            // InternalMyDsl.g:2337:1: ( 'ixz' )
            {
            // InternalMyDsl.g:2337:1: ( 'ixz' )
            // InternalMyDsl.g:2338:2: 'ixz'
            {
             before(grammarAccess.getInertiaAccess().getIxzKeyword_7()); 
            match(input,28,FOLLOW_2); 
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
    // InternalMyDsl.g:2347:1: rule__Inertia__Group__8 : rule__Inertia__Group__8__Impl rule__Inertia__Group__9 ;
    public final void rule__Inertia__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2351:1: ( rule__Inertia__Group__8__Impl rule__Inertia__Group__9 )
            // InternalMyDsl.g:2352:2: rule__Inertia__Group__8__Impl rule__Inertia__Group__9
            {
            pushFollow(FOLLOW_22);
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
    // InternalMyDsl.g:2359:1: rule__Inertia__Group__8__Impl : ( ( rule__Inertia__IxzAssignment_8 ) ) ;
    public final void rule__Inertia__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2363:1: ( ( ( rule__Inertia__IxzAssignment_8 ) ) )
            // InternalMyDsl.g:2364:1: ( ( rule__Inertia__IxzAssignment_8 ) )
            {
            // InternalMyDsl.g:2364:1: ( ( rule__Inertia__IxzAssignment_8 ) )
            // InternalMyDsl.g:2365:2: ( rule__Inertia__IxzAssignment_8 )
            {
             before(grammarAccess.getInertiaAccess().getIxzAssignment_8()); 
            // InternalMyDsl.g:2366:2: ( rule__Inertia__IxzAssignment_8 )
            // InternalMyDsl.g:2366:3: rule__Inertia__IxzAssignment_8
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
    // InternalMyDsl.g:2374:1: rule__Inertia__Group__9 : rule__Inertia__Group__9__Impl rule__Inertia__Group__10 ;
    public final void rule__Inertia__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2378:1: ( rule__Inertia__Group__9__Impl rule__Inertia__Group__10 )
            // InternalMyDsl.g:2379:2: rule__Inertia__Group__9__Impl rule__Inertia__Group__10
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyDsl.g:2386:1: rule__Inertia__Group__9__Impl : ( 'iyy' ) ;
    public final void rule__Inertia__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2390:1: ( ( 'iyy' ) )
            // InternalMyDsl.g:2391:1: ( 'iyy' )
            {
            // InternalMyDsl.g:2391:1: ( 'iyy' )
            // InternalMyDsl.g:2392:2: 'iyy'
            {
             before(grammarAccess.getInertiaAccess().getIyyKeyword_9()); 
            match(input,29,FOLLOW_2); 
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
    // InternalMyDsl.g:2401:1: rule__Inertia__Group__10 : rule__Inertia__Group__10__Impl rule__Inertia__Group__11 ;
    public final void rule__Inertia__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2405:1: ( rule__Inertia__Group__10__Impl rule__Inertia__Group__11 )
            // InternalMyDsl.g:2406:2: rule__Inertia__Group__10__Impl rule__Inertia__Group__11
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyDsl.g:2413:1: rule__Inertia__Group__10__Impl : ( ( rule__Inertia__IyyAssignment_10 ) ) ;
    public final void rule__Inertia__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2417:1: ( ( ( rule__Inertia__IyyAssignment_10 ) ) )
            // InternalMyDsl.g:2418:1: ( ( rule__Inertia__IyyAssignment_10 ) )
            {
            // InternalMyDsl.g:2418:1: ( ( rule__Inertia__IyyAssignment_10 ) )
            // InternalMyDsl.g:2419:2: ( rule__Inertia__IyyAssignment_10 )
            {
             before(grammarAccess.getInertiaAccess().getIyyAssignment_10()); 
            // InternalMyDsl.g:2420:2: ( rule__Inertia__IyyAssignment_10 )
            // InternalMyDsl.g:2420:3: rule__Inertia__IyyAssignment_10
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
    // InternalMyDsl.g:2428:1: rule__Inertia__Group__11 : rule__Inertia__Group__11__Impl rule__Inertia__Group__12 ;
    public final void rule__Inertia__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2432:1: ( rule__Inertia__Group__11__Impl rule__Inertia__Group__12 )
            // InternalMyDsl.g:2433:2: rule__Inertia__Group__11__Impl rule__Inertia__Group__12
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyDsl.g:2440:1: rule__Inertia__Group__11__Impl : ( 'iyz' ) ;
    public final void rule__Inertia__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2444:1: ( ( 'iyz' ) )
            // InternalMyDsl.g:2445:1: ( 'iyz' )
            {
            // InternalMyDsl.g:2445:1: ( 'iyz' )
            // InternalMyDsl.g:2446:2: 'iyz'
            {
             before(grammarAccess.getInertiaAccess().getIyzKeyword_11()); 
            match(input,30,FOLLOW_2); 
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
    // InternalMyDsl.g:2455:1: rule__Inertia__Group__12 : rule__Inertia__Group__12__Impl rule__Inertia__Group__13 ;
    public final void rule__Inertia__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2459:1: ( rule__Inertia__Group__12__Impl rule__Inertia__Group__13 )
            // InternalMyDsl.g:2460:2: rule__Inertia__Group__12__Impl rule__Inertia__Group__13
            {
            pushFollow(FOLLOW_24);
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
    // InternalMyDsl.g:2467:1: rule__Inertia__Group__12__Impl : ( ( rule__Inertia__IyzAssignment_12 ) ) ;
    public final void rule__Inertia__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2471:1: ( ( ( rule__Inertia__IyzAssignment_12 ) ) )
            // InternalMyDsl.g:2472:1: ( ( rule__Inertia__IyzAssignment_12 ) )
            {
            // InternalMyDsl.g:2472:1: ( ( rule__Inertia__IyzAssignment_12 ) )
            // InternalMyDsl.g:2473:2: ( rule__Inertia__IyzAssignment_12 )
            {
             before(grammarAccess.getInertiaAccess().getIyzAssignment_12()); 
            // InternalMyDsl.g:2474:2: ( rule__Inertia__IyzAssignment_12 )
            // InternalMyDsl.g:2474:3: rule__Inertia__IyzAssignment_12
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
    // InternalMyDsl.g:2482:1: rule__Inertia__Group__13 : rule__Inertia__Group__13__Impl rule__Inertia__Group__14 ;
    public final void rule__Inertia__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2486:1: ( rule__Inertia__Group__13__Impl rule__Inertia__Group__14 )
            // InternalMyDsl.g:2487:2: rule__Inertia__Group__13__Impl rule__Inertia__Group__14
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyDsl.g:2494:1: rule__Inertia__Group__13__Impl : ( 'izz' ) ;
    public final void rule__Inertia__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2498:1: ( ( 'izz' ) )
            // InternalMyDsl.g:2499:1: ( 'izz' )
            {
            // InternalMyDsl.g:2499:1: ( 'izz' )
            // InternalMyDsl.g:2500:2: 'izz'
            {
             before(grammarAccess.getInertiaAccess().getIzzKeyword_13()); 
            match(input,31,FOLLOW_2); 
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
    // InternalMyDsl.g:2509:1: rule__Inertia__Group__14 : rule__Inertia__Group__14__Impl ;
    public final void rule__Inertia__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2513:1: ( rule__Inertia__Group__14__Impl )
            // InternalMyDsl.g:2514:2: rule__Inertia__Group__14__Impl
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
    // InternalMyDsl.g:2520:1: rule__Inertia__Group__14__Impl : ( ( rule__Inertia__IzzAssignment_14 ) ) ;
    public final void rule__Inertia__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2524:1: ( ( ( rule__Inertia__IzzAssignment_14 ) ) )
            // InternalMyDsl.g:2525:1: ( ( rule__Inertia__IzzAssignment_14 ) )
            {
            // InternalMyDsl.g:2525:1: ( ( rule__Inertia__IzzAssignment_14 ) )
            // InternalMyDsl.g:2526:2: ( rule__Inertia__IzzAssignment_14 )
            {
             before(grammarAccess.getInertiaAccess().getIzzAssignment_14()); 
            // InternalMyDsl.g:2527:2: ( rule__Inertia__IzzAssignment_14 )
            // InternalMyDsl.g:2527:3: rule__Inertia__IzzAssignment_14
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
    // InternalMyDsl.g:2536:1: rule__Visual__Group__0 : rule__Visual__Group__0__Impl rule__Visual__Group__1 ;
    public final void rule__Visual__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2540:1: ( rule__Visual__Group__0__Impl rule__Visual__Group__1 )
            // InternalMyDsl.g:2541:2: rule__Visual__Group__0__Impl rule__Visual__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalMyDsl.g:2548:1: rule__Visual__Group__0__Impl : ( () ) ;
    public final void rule__Visual__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2552:1: ( ( () ) )
            // InternalMyDsl.g:2553:1: ( () )
            {
            // InternalMyDsl.g:2553:1: ( () )
            // InternalMyDsl.g:2554:2: ()
            {
             before(grammarAccess.getVisualAccess().getVisualAction_0()); 
            // InternalMyDsl.g:2555:2: ()
            // InternalMyDsl.g:2555:3: 
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
    // InternalMyDsl.g:2563:1: rule__Visual__Group__1 : rule__Visual__Group__1__Impl rule__Visual__Group__2 ;
    public final void rule__Visual__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2567:1: ( rule__Visual__Group__1__Impl rule__Visual__Group__2 )
            // InternalMyDsl.g:2568:2: rule__Visual__Group__1__Impl rule__Visual__Group__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalMyDsl.g:2575:1: rule__Visual__Group__1__Impl : ( 'Visual' ) ;
    public final void rule__Visual__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2579:1: ( ( 'Visual' ) )
            // InternalMyDsl.g:2580:1: ( 'Visual' )
            {
            // InternalMyDsl.g:2580:1: ( 'Visual' )
            // InternalMyDsl.g:2581:2: 'Visual'
            {
             before(grammarAccess.getVisualAccess().getVisualKeyword_1()); 
            match(input,32,FOLLOW_2); 
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
    // InternalMyDsl.g:2590:1: rule__Visual__Group__2 : rule__Visual__Group__2__Impl rule__Visual__Group__3 ;
    public final void rule__Visual__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2594:1: ( rule__Visual__Group__2__Impl rule__Visual__Group__3 )
            // InternalMyDsl.g:2595:2: rule__Visual__Group__2__Impl rule__Visual__Group__3
            {
            pushFollow(FOLLOW_26);
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
    // InternalMyDsl.g:2602:1: rule__Visual__Group__2__Impl : ( ( rule__Visual__NameAssignment_2 )? ) ;
    public final void rule__Visual__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2606:1: ( ( ( rule__Visual__NameAssignment_2 )? ) )
            // InternalMyDsl.g:2607:1: ( ( rule__Visual__NameAssignment_2 )? )
            {
            // InternalMyDsl.g:2607:1: ( ( rule__Visual__NameAssignment_2 )? )
            // InternalMyDsl.g:2608:2: ( rule__Visual__NameAssignment_2 )?
            {
             before(grammarAccess.getVisualAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:2609:2: ( rule__Visual__NameAssignment_2 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMyDsl.g:2609:3: rule__Visual__NameAssignment_2
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
    // InternalMyDsl.g:2617:1: rule__Visual__Group__3 : rule__Visual__Group__3__Impl rule__Visual__Group__4 ;
    public final void rule__Visual__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2621:1: ( rule__Visual__Group__3__Impl rule__Visual__Group__4 )
            // InternalMyDsl.g:2622:2: rule__Visual__Group__3__Impl rule__Visual__Group__4
            {
            pushFollow(FOLLOW_27);
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
    // InternalMyDsl.g:2629:1: rule__Visual__Group__3__Impl : ( 'Geometry' ) ;
    public final void rule__Visual__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2633:1: ( ( 'Geometry' ) )
            // InternalMyDsl.g:2634:1: ( 'Geometry' )
            {
            // InternalMyDsl.g:2634:1: ( 'Geometry' )
            // InternalMyDsl.g:2635:2: 'Geometry'
            {
             before(grammarAccess.getVisualAccess().getGeometryKeyword_3()); 
            match(input,33,FOLLOW_2); 
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
    // InternalMyDsl.g:2644:1: rule__Visual__Group__4 : rule__Visual__Group__4__Impl rule__Visual__Group__5 ;
    public final void rule__Visual__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2648:1: ( rule__Visual__Group__4__Impl rule__Visual__Group__5 )
            // InternalMyDsl.g:2649:2: rule__Visual__Group__4__Impl rule__Visual__Group__5
            {
            pushFollow(FOLLOW_27);
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
    // InternalMyDsl.g:2656:1: rule__Visual__Group__4__Impl : ( ( rule__Visual__GeometryAssignment_4 )* ) ;
    public final void rule__Visual__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2660:1: ( ( ( rule__Visual__GeometryAssignment_4 )* ) )
            // InternalMyDsl.g:2661:1: ( ( rule__Visual__GeometryAssignment_4 )* )
            {
            // InternalMyDsl.g:2661:1: ( ( rule__Visual__GeometryAssignment_4 )* )
            // InternalMyDsl.g:2662:2: ( rule__Visual__GeometryAssignment_4 )*
            {
             before(grammarAccess.getVisualAccess().getGeometryAssignment_4()); 
            // InternalMyDsl.g:2663:2: ( rule__Visual__GeometryAssignment_4 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==45||LA23_0==49||LA23_0==51||LA23_0==53) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalMyDsl.g:2663:3: rule__Visual__GeometryAssignment_4
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__Visual__GeometryAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalMyDsl.g:2671:1: rule__Visual__Group__5 : rule__Visual__Group__5__Impl rule__Visual__Group__6 ;
    public final void rule__Visual__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2675:1: ( rule__Visual__Group__5__Impl rule__Visual__Group__6 )
            // InternalMyDsl.g:2676:2: rule__Visual__Group__5__Impl rule__Visual__Group__6
            {
            pushFollow(FOLLOW_27);
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
    // InternalMyDsl.g:2683:1: rule__Visual__Group__5__Impl : ( ( rule__Visual__OriginAssignment_5 )? ) ;
    public final void rule__Visual__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2687:1: ( ( ( rule__Visual__OriginAssignment_5 )? ) )
            // InternalMyDsl.g:2688:1: ( ( rule__Visual__OriginAssignment_5 )? )
            {
            // InternalMyDsl.g:2688:1: ( ( rule__Visual__OriginAssignment_5 )? )
            // InternalMyDsl.g:2689:2: ( rule__Visual__OriginAssignment_5 )?
            {
             before(grammarAccess.getVisualAccess().getOriginAssignment_5()); 
            // InternalMyDsl.g:2690:2: ( rule__Visual__OriginAssignment_5 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==35) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMyDsl.g:2690:3: rule__Visual__OriginAssignment_5
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
    // InternalMyDsl.g:2698:1: rule__Visual__Group__6 : rule__Visual__Group__6__Impl ;
    public final void rule__Visual__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2702:1: ( rule__Visual__Group__6__Impl )
            // InternalMyDsl.g:2703:2: rule__Visual__Group__6__Impl
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
    // InternalMyDsl.g:2709:1: rule__Visual__Group__6__Impl : ( ( rule__Visual__Group_6__0 )? ) ;
    public final void rule__Visual__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2713:1: ( ( ( rule__Visual__Group_6__0 )? ) )
            // InternalMyDsl.g:2714:1: ( ( rule__Visual__Group_6__0 )? )
            {
            // InternalMyDsl.g:2714:1: ( ( rule__Visual__Group_6__0 )? )
            // InternalMyDsl.g:2715:2: ( rule__Visual__Group_6__0 )?
            {
             before(grammarAccess.getVisualAccess().getGroup_6()); 
            // InternalMyDsl.g:2716:2: ( rule__Visual__Group_6__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==34) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMyDsl.g:2716:3: rule__Visual__Group_6__0
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
    // InternalMyDsl.g:2725:1: rule__Visual__Group_6__0 : rule__Visual__Group_6__0__Impl rule__Visual__Group_6__1 ;
    public final void rule__Visual__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2729:1: ( rule__Visual__Group_6__0__Impl rule__Visual__Group_6__1 )
            // InternalMyDsl.g:2730:2: rule__Visual__Group_6__0__Impl rule__Visual__Group_6__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalMyDsl.g:2737:1: rule__Visual__Group_6__0__Impl : ( 'Material' ) ;
    public final void rule__Visual__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2741:1: ( ( 'Material' ) )
            // InternalMyDsl.g:2742:1: ( 'Material' )
            {
            // InternalMyDsl.g:2742:1: ( 'Material' )
            // InternalMyDsl.g:2743:2: 'Material'
            {
             before(grammarAccess.getVisualAccess().getMaterialKeyword_6_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalMyDsl.g:2752:1: rule__Visual__Group_6__1 : rule__Visual__Group_6__1__Impl ;
    public final void rule__Visual__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2756:1: ( rule__Visual__Group_6__1__Impl )
            // InternalMyDsl.g:2757:2: rule__Visual__Group_6__1__Impl
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
    // InternalMyDsl.g:2763:1: rule__Visual__Group_6__1__Impl : ( ( rule__Visual__MaterialAssignment_6_1 ) ) ;
    public final void rule__Visual__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2767:1: ( ( ( rule__Visual__MaterialAssignment_6_1 ) ) )
            // InternalMyDsl.g:2768:1: ( ( rule__Visual__MaterialAssignment_6_1 ) )
            {
            // InternalMyDsl.g:2768:1: ( ( rule__Visual__MaterialAssignment_6_1 ) )
            // InternalMyDsl.g:2769:2: ( rule__Visual__MaterialAssignment_6_1 )
            {
             before(grammarAccess.getVisualAccess().getMaterialAssignment_6_1()); 
            // InternalMyDsl.g:2770:2: ( rule__Visual__MaterialAssignment_6_1 )
            // InternalMyDsl.g:2770:3: rule__Visual__MaterialAssignment_6_1
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
    // InternalMyDsl.g:2779:1: rule__Origin__Group__0 : rule__Origin__Group__0__Impl rule__Origin__Group__1 ;
    public final void rule__Origin__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2783:1: ( rule__Origin__Group__0__Impl rule__Origin__Group__1 )
            // InternalMyDsl.g:2784:2: rule__Origin__Group__0__Impl rule__Origin__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalMyDsl.g:2791:1: rule__Origin__Group__0__Impl : ( () ) ;
    public final void rule__Origin__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2795:1: ( ( () ) )
            // InternalMyDsl.g:2796:1: ( () )
            {
            // InternalMyDsl.g:2796:1: ( () )
            // InternalMyDsl.g:2797:2: ()
            {
             before(grammarAccess.getOriginAccess().getOriginAction_0()); 
            // InternalMyDsl.g:2798:2: ()
            // InternalMyDsl.g:2798:3: 
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
    // InternalMyDsl.g:2806:1: rule__Origin__Group__1 : rule__Origin__Group__1__Impl rule__Origin__Group__2 ;
    public final void rule__Origin__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2810:1: ( rule__Origin__Group__1__Impl rule__Origin__Group__2 )
            // InternalMyDsl.g:2811:2: rule__Origin__Group__1__Impl rule__Origin__Group__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalMyDsl.g:2818:1: rule__Origin__Group__1__Impl : ( 'Origin' ) ;
    public final void rule__Origin__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2822:1: ( ( 'Origin' ) )
            // InternalMyDsl.g:2823:1: ( 'Origin' )
            {
            // InternalMyDsl.g:2823:1: ( 'Origin' )
            // InternalMyDsl.g:2824:2: 'Origin'
            {
             before(grammarAccess.getOriginAccess().getOriginKeyword_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalMyDsl.g:2833:1: rule__Origin__Group__2 : rule__Origin__Group__2__Impl rule__Origin__Group__3 ;
    public final void rule__Origin__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2837:1: ( rule__Origin__Group__2__Impl rule__Origin__Group__3 )
            // InternalMyDsl.g:2838:2: rule__Origin__Group__2__Impl rule__Origin__Group__3
            {
            pushFollow(FOLLOW_30);
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
    // InternalMyDsl.g:2845:1: rule__Origin__Group__2__Impl : ( ( rule__Origin__NameAssignment_2 )? ) ;
    public final void rule__Origin__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2849:1: ( ( ( rule__Origin__NameAssignment_2 )? ) )
            // InternalMyDsl.g:2850:1: ( ( rule__Origin__NameAssignment_2 )? )
            {
            // InternalMyDsl.g:2850:1: ( ( rule__Origin__NameAssignment_2 )? )
            // InternalMyDsl.g:2851:2: ( rule__Origin__NameAssignment_2 )?
            {
             before(grammarAccess.getOriginAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:2852:2: ( rule__Origin__NameAssignment_2 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMyDsl.g:2852:3: rule__Origin__NameAssignment_2
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
    // InternalMyDsl.g:2860:1: rule__Origin__Group__3 : rule__Origin__Group__3__Impl rule__Origin__Group__4 ;
    public final void rule__Origin__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2864:1: ( rule__Origin__Group__3__Impl rule__Origin__Group__4 )
            // InternalMyDsl.g:2865:2: rule__Origin__Group__3__Impl rule__Origin__Group__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyDsl.g:2872:1: rule__Origin__Group__3__Impl : ( 'x' ) ;
    public final void rule__Origin__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2876:1: ( ( 'x' ) )
            // InternalMyDsl.g:2877:1: ( 'x' )
            {
            // InternalMyDsl.g:2877:1: ( 'x' )
            // InternalMyDsl.g:2878:2: 'x'
            {
             before(grammarAccess.getOriginAccess().getXKeyword_3()); 
            match(input,36,FOLLOW_2); 
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
    // InternalMyDsl.g:2887:1: rule__Origin__Group__4 : rule__Origin__Group__4__Impl rule__Origin__Group__5 ;
    public final void rule__Origin__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2891:1: ( rule__Origin__Group__4__Impl rule__Origin__Group__5 )
            // InternalMyDsl.g:2892:2: rule__Origin__Group__4__Impl rule__Origin__Group__5
            {
            pushFollow(FOLLOW_31);
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
    // InternalMyDsl.g:2899:1: rule__Origin__Group__4__Impl : ( ( rule__Origin__XAssignment_4 ) ) ;
    public final void rule__Origin__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2903:1: ( ( ( rule__Origin__XAssignment_4 ) ) )
            // InternalMyDsl.g:2904:1: ( ( rule__Origin__XAssignment_4 ) )
            {
            // InternalMyDsl.g:2904:1: ( ( rule__Origin__XAssignment_4 ) )
            // InternalMyDsl.g:2905:2: ( rule__Origin__XAssignment_4 )
            {
             before(grammarAccess.getOriginAccess().getXAssignment_4()); 
            // InternalMyDsl.g:2906:2: ( rule__Origin__XAssignment_4 )
            // InternalMyDsl.g:2906:3: rule__Origin__XAssignment_4
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
    // InternalMyDsl.g:2914:1: rule__Origin__Group__5 : rule__Origin__Group__5__Impl rule__Origin__Group__6 ;
    public final void rule__Origin__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2918:1: ( rule__Origin__Group__5__Impl rule__Origin__Group__6 )
            // InternalMyDsl.g:2919:2: rule__Origin__Group__5__Impl rule__Origin__Group__6
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyDsl.g:2926:1: rule__Origin__Group__5__Impl : ( 'y' ) ;
    public final void rule__Origin__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2930:1: ( ( 'y' ) )
            // InternalMyDsl.g:2931:1: ( 'y' )
            {
            // InternalMyDsl.g:2931:1: ( 'y' )
            // InternalMyDsl.g:2932:2: 'y'
            {
             before(grammarAccess.getOriginAccess().getYKeyword_5()); 
            match(input,37,FOLLOW_2); 
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
    // InternalMyDsl.g:2941:1: rule__Origin__Group__6 : rule__Origin__Group__6__Impl rule__Origin__Group__7 ;
    public final void rule__Origin__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2945:1: ( rule__Origin__Group__6__Impl rule__Origin__Group__7 )
            // InternalMyDsl.g:2946:2: rule__Origin__Group__6__Impl rule__Origin__Group__7
            {
            pushFollow(FOLLOW_32);
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
    // InternalMyDsl.g:2953:1: rule__Origin__Group__6__Impl : ( ( rule__Origin__YAssignment_6 ) ) ;
    public final void rule__Origin__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2957:1: ( ( ( rule__Origin__YAssignment_6 ) ) )
            // InternalMyDsl.g:2958:1: ( ( rule__Origin__YAssignment_6 ) )
            {
            // InternalMyDsl.g:2958:1: ( ( rule__Origin__YAssignment_6 ) )
            // InternalMyDsl.g:2959:2: ( rule__Origin__YAssignment_6 )
            {
             before(grammarAccess.getOriginAccess().getYAssignment_6()); 
            // InternalMyDsl.g:2960:2: ( rule__Origin__YAssignment_6 )
            // InternalMyDsl.g:2960:3: rule__Origin__YAssignment_6
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
    // InternalMyDsl.g:2968:1: rule__Origin__Group__7 : rule__Origin__Group__7__Impl rule__Origin__Group__8 ;
    public final void rule__Origin__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2972:1: ( rule__Origin__Group__7__Impl rule__Origin__Group__8 )
            // InternalMyDsl.g:2973:2: rule__Origin__Group__7__Impl rule__Origin__Group__8
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyDsl.g:2980:1: rule__Origin__Group__7__Impl : ( 'z' ) ;
    public final void rule__Origin__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2984:1: ( ( 'z' ) )
            // InternalMyDsl.g:2985:1: ( 'z' )
            {
            // InternalMyDsl.g:2985:1: ( 'z' )
            // InternalMyDsl.g:2986:2: 'z'
            {
             before(grammarAccess.getOriginAccess().getZKeyword_7()); 
            match(input,38,FOLLOW_2); 
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
    // InternalMyDsl.g:2995:1: rule__Origin__Group__8 : rule__Origin__Group__8__Impl rule__Origin__Group__9 ;
    public final void rule__Origin__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2999:1: ( rule__Origin__Group__8__Impl rule__Origin__Group__9 )
            // InternalMyDsl.g:3000:2: rule__Origin__Group__8__Impl rule__Origin__Group__9
            {
            pushFollow(FOLLOW_33);
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
    // InternalMyDsl.g:3007:1: rule__Origin__Group__8__Impl : ( ( rule__Origin__ZAssignment_8 ) ) ;
    public final void rule__Origin__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3011:1: ( ( ( rule__Origin__ZAssignment_8 ) ) )
            // InternalMyDsl.g:3012:1: ( ( rule__Origin__ZAssignment_8 ) )
            {
            // InternalMyDsl.g:3012:1: ( ( rule__Origin__ZAssignment_8 ) )
            // InternalMyDsl.g:3013:2: ( rule__Origin__ZAssignment_8 )
            {
             before(grammarAccess.getOriginAccess().getZAssignment_8()); 
            // InternalMyDsl.g:3014:2: ( rule__Origin__ZAssignment_8 )
            // InternalMyDsl.g:3014:3: rule__Origin__ZAssignment_8
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
    // InternalMyDsl.g:3022:1: rule__Origin__Group__9 : rule__Origin__Group__9__Impl rule__Origin__Group__10 ;
    public final void rule__Origin__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3026:1: ( rule__Origin__Group__9__Impl rule__Origin__Group__10 )
            // InternalMyDsl.g:3027:2: rule__Origin__Group__9__Impl rule__Origin__Group__10
            {
            pushFollow(FOLLOW_33);
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
    // InternalMyDsl.g:3034:1: rule__Origin__Group__9__Impl : ( ( rule__Origin__Group_9__0 )? ) ;
    public final void rule__Origin__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3038:1: ( ( ( rule__Origin__Group_9__0 )? ) )
            // InternalMyDsl.g:3039:1: ( ( rule__Origin__Group_9__0 )? )
            {
            // InternalMyDsl.g:3039:1: ( ( rule__Origin__Group_9__0 )? )
            // InternalMyDsl.g:3040:2: ( rule__Origin__Group_9__0 )?
            {
             before(grammarAccess.getOriginAccess().getGroup_9()); 
            // InternalMyDsl.g:3041:2: ( rule__Origin__Group_9__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==39) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalMyDsl.g:3041:3: rule__Origin__Group_9__0
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
    // InternalMyDsl.g:3049:1: rule__Origin__Group__10 : rule__Origin__Group__10__Impl rule__Origin__Group__11 ;
    public final void rule__Origin__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3053:1: ( rule__Origin__Group__10__Impl rule__Origin__Group__11 )
            // InternalMyDsl.g:3054:2: rule__Origin__Group__10__Impl rule__Origin__Group__11
            {
            pushFollow(FOLLOW_33);
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
    // InternalMyDsl.g:3061:1: rule__Origin__Group__10__Impl : ( ( rule__Origin__Group_10__0 )? ) ;
    public final void rule__Origin__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3065:1: ( ( ( rule__Origin__Group_10__0 )? ) )
            // InternalMyDsl.g:3066:1: ( ( rule__Origin__Group_10__0 )? )
            {
            // InternalMyDsl.g:3066:1: ( ( rule__Origin__Group_10__0 )? )
            // InternalMyDsl.g:3067:2: ( rule__Origin__Group_10__0 )?
            {
             before(grammarAccess.getOriginAccess().getGroup_10()); 
            // InternalMyDsl.g:3068:2: ( rule__Origin__Group_10__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==40) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalMyDsl.g:3068:3: rule__Origin__Group_10__0
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
    // InternalMyDsl.g:3076:1: rule__Origin__Group__11 : rule__Origin__Group__11__Impl ;
    public final void rule__Origin__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3080:1: ( rule__Origin__Group__11__Impl )
            // InternalMyDsl.g:3081:2: rule__Origin__Group__11__Impl
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
    // InternalMyDsl.g:3087:1: rule__Origin__Group__11__Impl : ( ( rule__Origin__Group_11__0 )? ) ;
    public final void rule__Origin__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3091:1: ( ( ( rule__Origin__Group_11__0 )? ) )
            // InternalMyDsl.g:3092:1: ( ( rule__Origin__Group_11__0 )? )
            {
            // InternalMyDsl.g:3092:1: ( ( rule__Origin__Group_11__0 )? )
            // InternalMyDsl.g:3093:2: ( rule__Origin__Group_11__0 )?
            {
             before(grammarAccess.getOriginAccess().getGroup_11()); 
            // InternalMyDsl.g:3094:2: ( rule__Origin__Group_11__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==41) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalMyDsl.g:3094:3: rule__Origin__Group_11__0
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
    // InternalMyDsl.g:3103:1: rule__Origin__Group_9__0 : rule__Origin__Group_9__0__Impl rule__Origin__Group_9__1 ;
    public final void rule__Origin__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3107:1: ( rule__Origin__Group_9__0__Impl rule__Origin__Group_9__1 )
            // InternalMyDsl.g:3108:2: rule__Origin__Group_9__0__Impl rule__Origin__Group_9__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyDsl.g:3115:1: rule__Origin__Group_9__0__Impl : ( 'roll' ) ;
    public final void rule__Origin__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3119:1: ( ( 'roll' ) )
            // InternalMyDsl.g:3120:1: ( 'roll' )
            {
            // InternalMyDsl.g:3120:1: ( 'roll' )
            // InternalMyDsl.g:3121:2: 'roll'
            {
             before(grammarAccess.getOriginAccess().getRollKeyword_9_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalMyDsl.g:3130:1: rule__Origin__Group_9__1 : rule__Origin__Group_9__1__Impl ;
    public final void rule__Origin__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3134:1: ( rule__Origin__Group_9__1__Impl )
            // InternalMyDsl.g:3135:2: rule__Origin__Group_9__1__Impl
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
    // InternalMyDsl.g:3141:1: rule__Origin__Group_9__1__Impl : ( ( rule__Origin__RollAssignment_9_1 ) ) ;
    public final void rule__Origin__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3145:1: ( ( ( rule__Origin__RollAssignment_9_1 ) ) )
            // InternalMyDsl.g:3146:1: ( ( rule__Origin__RollAssignment_9_1 ) )
            {
            // InternalMyDsl.g:3146:1: ( ( rule__Origin__RollAssignment_9_1 ) )
            // InternalMyDsl.g:3147:2: ( rule__Origin__RollAssignment_9_1 )
            {
             before(grammarAccess.getOriginAccess().getRollAssignment_9_1()); 
            // InternalMyDsl.g:3148:2: ( rule__Origin__RollAssignment_9_1 )
            // InternalMyDsl.g:3148:3: rule__Origin__RollAssignment_9_1
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
    // InternalMyDsl.g:3157:1: rule__Origin__Group_10__0 : rule__Origin__Group_10__0__Impl rule__Origin__Group_10__1 ;
    public final void rule__Origin__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3161:1: ( rule__Origin__Group_10__0__Impl rule__Origin__Group_10__1 )
            // InternalMyDsl.g:3162:2: rule__Origin__Group_10__0__Impl rule__Origin__Group_10__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyDsl.g:3169:1: rule__Origin__Group_10__0__Impl : ( 'pitch' ) ;
    public final void rule__Origin__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3173:1: ( ( 'pitch' ) )
            // InternalMyDsl.g:3174:1: ( 'pitch' )
            {
            // InternalMyDsl.g:3174:1: ( 'pitch' )
            // InternalMyDsl.g:3175:2: 'pitch'
            {
             before(grammarAccess.getOriginAccess().getPitchKeyword_10_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalMyDsl.g:3184:1: rule__Origin__Group_10__1 : rule__Origin__Group_10__1__Impl ;
    public final void rule__Origin__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3188:1: ( rule__Origin__Group_10__1__Impl )
            // InternalMyDsl.g:3189:2: rule__Origin__Group_10__1__Impl
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
    // InternalMyDsl.g:3195:1: rule__Origin__Group_10__1__Impl : ( ( rule__Origin__PitchAssignment_10_1 ) ) ;
    public final void rule__Origin__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3199:1: ( ( ( rule__Origin__PitchAssignment_10_1 ) ) )
            // InternalMyDsl.g:3200:1: ( ( rule__Origin__PitchAssignment_10_1 ) )
            {
            // InternalMyDsl.g:3200:1: ( ( rule__Origin__PitchAssignment_10_1 ) )
            // InternalMyDsl.g:3201:2: ( rule__Origin__PitchAssignment_10_1 )
            {
             before(grammarAccess.getOriginAccess().getPitchAssignment_10_1()); 
            // InternalMyDsl.g:3202:2: ( rule__Origin__PitchAssignment_10_1 )
            // InternalMyDsl.g:3202:3: rule__Origin__PitchAssignment_10_1
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
    // InternalMyDsl.g:3211:1: rule__Origin__Group_11__0 : rule__Origin__Group_11__0__Impl rule__Origin__Group_11__1 ;
    public final void rule__Origin__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3215:1: ( rule__Origin__Group_11__0__Impl rule__Origin__Group_11__1 )
            // InternalMyDsl.g:3216:2: rule__Origin__Group_11__0__Impl rule__Origin__Group_11__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyDsl.g:3223:1: rule__Origin__Group_11__0__Impl : ( 'yaw' ) ;
    public final void rule__Origin__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3227:1: ( ( 'yaw' ) )
            // InternalMyDsl.g:3228:1: ( 'yaw' )
            {
            // InternalMyDsl.g:3228:1: ( 'yaw' )
            // InternalMyDsl.g:3229:2: 'yaw'
            {
             before(grammarAccess.getOriginAccess().getYawKeyword_11_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalMyDsl.g:3238:1: rule__Origin__Group_11__1 : rule__Origin__Group_11__1__Impl ;
    public final void rule__Origin__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3242:1: ( rule__Origin__Group_11__1__Impl )
            // InternalMyDsl.g:3243:2: rule__Origin__Group_11__1__Impl
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
    // InternalMyDsl.g:3249:1: rule__Origin__Group_11__1__Impl : ( ( rule__Origin__YawAssignment_11_1 ) ) ;
    public final void rule__Origin__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3253:1: ( ( ( rule__Origin__YawAssignment_11_1 ) ) )
            // InternalMyDsl.g:3254:1: ( ( rule__Origin__YawAssignment_11_1 ) )
            {
            // InternalMyDsl.g:3254:1: ( ( rule__Origin__YawAssignment_11_1 ) )
            // InternalMyDsl.g:3255:2: ( rule__Origin__YawAssignment_11_1 )
            {
             before(grammarAccess.getOriginAccess().getYawAssignment_11_1()); 
            // InternalMyDsl.g:3256:2: ( rule__Origin__YawAssignment_11_1 )
            // InternalMyDsl.g:3256:3: rule__Origin__YawAssignment_11_1
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
    // InternalMyDsl.g:3265:1: rule__Mass__Group__0 : rule__Mass__Group__0__Impl rule__Mass__Group__1 ;
    public final void rule__Mass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3269:1: ( rule__Mass__Group__0__Impl rule__Mass__Group__1 )
            // InternalMyDsl.g:3270:2: rule__Mass__Group__0__Impl rule__Mass__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalMyDsl.g:3277:1: rule__Mass__Group__0__Impl : ( () ) ;
    public final void rule__Mass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3281:1: ( ( () ) )
            // InternalMyDsl.g:3282:1: ( () )
            {
            // InternalMyDsl.g:3282:1: ( () )
            // InternalMyDsl.g:3283:2: ()
            {
             before(grammarAccess.getMassAccess().getMassAction_0()); 
            // InternalMyDsl.g:3284:2: ()
            // InternalMyDsl.g:3284:3: 
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
    // InternalMyDsl.g:3292:1: rule__Mass__Group__1 : rule__Mass__Group__1__Impl rule__Mass__Group__2 ;
    public final void rule__Mass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3296:1: ( rule__Mass__Group__1__Impl rule__Mass__Group__2 )
            // InternalMyDsl.g:3297:2: rule__Mass__Group__1__Impl rule__Mass__Group__2
            {
            pushFollow(FOLLOW_34);
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
    // InternalMyDsl.g:3304:1: rule__Mass__Group__1__Impl : ( 'Mass' ) ;
    public final void rule__Mass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3308:1: ( ( 'Mass' ) )
            // InternalMyDsl.g:3309:1: ( 'Mass' )
            {
            // InternalMyDsl.g:3309:1: ( 'Mass' )
            // InternalMyDsl.g:3310:2: 'Mass'
            {
             before(grammarAccess.getMassAccess().getMassKeyword_1()); 
            match(input,42,FOLLOW_2); 
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
    // InternalMyDsl.g:3319:1: rule__Mass__Group__2 : rule__Mass__Group__2__Impl rule__Mass__Group__3 ;
    public final void rule__Mass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3323:1: ( rule__Mass__Group__2__Impl rule__Mass__Group__3 )
            // InternalMyDsl.g:3324:2: rule__Mass__Group__2__Impl rule__Mass__Group__3
            {
            pushFollow(FOLLOW_34);
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
    // InternalMyDsl.g:3331:1: rule__Mass__Group__2__Impl : ( ( rule__Mass__NameAssignment_2 )? ) ;
    public final void rule__Mass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3335:1: ( ( ( rule__Mass__NameAssignment_2 )? ) )
            // InternalMyDsl.g:3336:1: ( ( rule__Mass__NameAssignment_2 )? )
            {
            // InternalMyDsl.g:3336:1: ( ( rule__Mass__NameAssignment_2 )? )
            // InternalMyDsl.g:3337:2: ( rule__Mass__NameAssignment_2 )?
            {
             before(grammarAccess.getMassAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:3338:2: ( rule__Mass__NameAssignment_2 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_ID) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalMyDsl.g:3338:3: rule__Mass__NameAssignment_2
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
    // InternalMyDsl.g:3346:1: rule__Mass__Group__3 : rule__Mass__Group__3__Impl rule__Mass__Group__4 ;
    public final void rule__Mass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3350:1: ( rule__Mass__Group__3__Impl rule__Mass__Group__4 )
            // InternalMyDsl.g:3351:2: rule__Mass__Group__3__Impl rule__Mass__Group__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyDsl.g:3358:1: rule__Mass__Group__3__Impl : ( 'massKilogram' ) ;
    public final void rule__Mass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3362:1: ( ( 'massKilogram' ) )
            // InternalMyDsl.g:3363:1: ( 'massKilogram' )
            {
            // InternalMyDsl.g:3363:1: ( 'massKilogram' )
            // InternalMyDsl.g:3364:2: 'massKilogram'
            {
             before(grammarAccess.getMassAccess().getMassKilogramKeyword_3()); 
            match(input,43,FOLLOW_2); 
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
    // InternalMyDsl.g:3373:1: rule__Mass__Group__4 : rule__Mass__Group__4__Impl ;
    public final void rule__Mass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3377:1: ( rule__Mass__Group__4__Impl )
            // InternalMyDsl.g:3378:2: rule__Mass__Group__4__Impl
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
    // InternalMyDsl.g:3384:1: rule__Mass__Group__4__Impl : ( ( rule__Mass__MassKilogramAssignment_4 ) ) ;
    public final void rule__Mass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3388:1: ( ( ( rule__Mass__MassKilogramAssignment_4 ) ) )
            // InternalMyDsl.g:3389:1: ( ( rule__Mass__MassKilogramAssignment_4 ) )
            {
            // InternalMyDsl.g:3389:1: ( ( rule__Mass__MassKilogramAssignment_4 ) )
            // InternalMyDsl.g:3390:2: ( rule__Mass__MassKilogramAssignment_4 )
            {
             before(grammarAccess.getMassAccess().getMassKilogramAssignment_4()); 
            // InternalMyDsl.g:3391:2: ( rule__Mass__MassKilogramAssignment_4 )
            // InternalMyDsl.g:3391:3: rule__Mass__MassKilogramAssignment_4
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
    // InternalMyDsl.g:3400:1: rule__Collision__Group__0 : rule__Collision__Group__0__Impl rule__Collision__Group__1 ;
    public final void rule__Collision__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3404:1: ( rule__Collision__Group__0__Impl rule__Collision__Group__1 )
            // InternalMyDsl.g:3405:2: rule__Collision__Group__0__Impl rule__Collision__Group__1
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
    // InternalMyDsl.g:3412:1: rule__Collision__Group__0__Impl : ( 'Collision' ) ;
    public final void rule__Collision__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3416:1: ( ( 'Collision' ) )
            // InternalMyDsl.g:3417:1: ( 'Collision' )
            {
            // InternalMyDsl.g:3417:1: ( 'Collision' )
            // InternalMyDsl.g:3418:2: 'Collision'
            {
             before(grammarAccess.getCollisionAccess().getCollisionKeyword_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalMyDsl.g:3427:1: rule__Collision__Group__1 : rule__Collision__Group__1__Impl rule__Collision__Group__2 ;
    public final void rule__Collision__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3431:1: ( rule__Collision__Group__1__Impl rule__Collision__Group__2 )
            // InternalMyDsl.g:3432:2: rule__Collision__Group__1__Impl rule__Collision__Group__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalMyDsl.g:3439:1: rule__Collision__Group__1__Impl : ( ( rule__Collision__NameAssignment_1 ) ) ;
    public final void rule__Collision__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3443:1: ( ( ( rule__Collision__NameAssignment_1 ) ) )
            // InternalMyDsl.g:3444:1: ( ( rule__Collision__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:3444:1: ( ( rule__Collision__NameAssignment_1 ) )
            // InternalMyDsl.g:3445:2: ( rule__Collision__NameAssignment_1 )
            {
             before(grammarAccess.getCollisionAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:3446:2: ( rule__Collision__NameAssignment_1 )
            // InternalMyDsl.g:3446:3: rule__Collision__NameAssignment_1
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
    // InternalMyDsl.g:3454:1: rule__Collision__Group__2 : rule__Collision__Group__2__Impl rule__Collision__Group__3 ;
    public final void rule__Collision__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3458:1: ( rule__Collision__Group__2__Impl rule__Collision__Group__3 )
            // InternalMyDsl.g:3459:2: rule__Collision__Group__2__Impl rule__Collision__Group__3
            {
            pushFollow(FOLLOW_36);
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
    // InternalMyDsl.g:3466:1: rule__Collision__Group__2__Impl : ( 'Geometry' ) ;
    public final void rule__Collision__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3470:1: ( ( 'Geometry' ) )
            // InternalMyDsl.g:3471:1: ( 'Geometry' )
            {
            // InternalMyDsl.g:3471:1: ( 'Geometry' )
            // InternalMyDsl.g:3472:2: 'Geometry'
            {
             before(grammarAccess.getCollisionAccess().getGeometryKeyword_2()); 
            match(input,33,FOLLOW_2); 
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
    // InternalMyDsl.g:3481:1: rule__Collision__Group__3 : rule__Collision__Group__3__Impl rule__Collision__Group__4 ;
    public final void rule__Collision__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3485:1: ( rule__Collision__Group__3__Impl rule__Collision__Group__4 )
            // InternalMyDsl.g:3486:2: rule__Collision__Group__3__Impl rule__Collision__Group__4
            {
            pushFollow(FOLLOW_36);
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
    // InternalMyDsl.g:3493:1: rule__Collision__Group__3__Impl : ( ( rule__Collision__GeometryAssignment_3 )* ) ;
    public final void rule__Collision__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3497:1: ( ( ( rule__Collision__GeometryAssignment_3 )* ) )
            // InternalMyDsl.g:3498:1: ( ( rule__Collision__GeometryAssignment_3 )* )
            {
            // InternalMyDsl.g:3498:1: ( ( rule__Collision__GeometryAssignment_3 )* )
            // InternalMyDsl.g:3499:2: ( rule__Collision__GeometryAssignment_3 )*
            {
             before(grammarAccess.getCollisionAccess().getGeometryAssignment_3()); 
            // InternalMyDsl.g:3500:2: ( rule__Collision__GeometryAssignment_3 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==45||LA31_0==49||LA31_0==51||LA31_0==53) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalMyDsl.g:3500:3: rule__Collision__GeometryAssignment_3
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__Collision__GeometryAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
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
    // InternalMyDsl.g:3508:1: rule__Collision__Group__4 : rule__Collision__Group__4__Impl ;
    public final void rule__Collision__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3512:1: ( rule__Collision__Group__4__Impl )
            // InternalMyDsl.g:3513:2: rule__Collision__Group__4__Impl
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
    // InternalMyDsl.g:3519:1: rule__Collision__Group__4__Impl : ( ( rule__Collision__OriginAssignment_4 )? ) ;
    public final void rule__Collision__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3523:1: ( ( ( rule__Collision__OriginAssignment_4 )? ) )
            // InternalMyDsl.g:3524:1: ( ( rule__Collision__OriginAssignment_4 )? )
            {
            // InternalMyDsl.g:3524:1: ( ( rule__Collision__OriginAssignment_4 )? )
            // InternalMyDsl.g:3525:2: ( rule__Collision__OriginAssignment_4 )?
            {
             before(grammarAccess.getCollisionAccess().getOriginAssignment_4()); 
            // InternalMyDsl.g:3526:2: ( rule__Collision__OriginAssignment_4 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==35) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalMyDsl.g:3526:3: rule__Collision__OriginAssignment_4
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
    // InternalMyDsl.g:3535:1: rule__Box__Group__0 : rule__Box__Group__0__Impl rule__Box__Group__1 ;
    public final void rule__Box__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3539:1: ( rule__Box__Group__0__Impl rule__Box__Group__1 )
            // InternalMyDsl.g:3540:2: rule__Box__Group__0__Impl rule__Box__Group__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalMyDsl.g:3547:1: rule__Box__Group__0__Impl : ( 'Box' ) ;
    public final void rule__Box__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3551:1: ( ( 'Box' ) )
            // InternalMyDsl.g:3552:1: ( 'Box' )
            {
            // InternalMyDsl.g:3552:1: ( 'Box' )
            // InternalMyDsl.g:3553:2: 'Box'
            {
             before(grammarAccess.getBoxAccess().getBoxKeyword_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalMyDsl.g:3562:1: rule__Box__Group__1 : rule__Box__Group__1__Impl rule__Box__Group__2 ;
    public final void rule__Box__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3566:1: ( rule__Box__Group__1__Impl rule__Box__Group__2 )
            // InternalMyDsl.g:3567:2: rule__Box__Group__1__Impl rule__Box__Group__2
            {
            pushFollow(FOLLOW_37);
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
    // InternalMyDsl.g:3574:1: rule__Box__Group__1__Impl : ( ( rule__Box__NameAssignment_1 )? ) ;
    public final void rule__Box__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3578:1: ( ( ( rule__Box__NameAssignment_1 )? ) )
            // InternalMyDsl.g:3579:1: ( ( rule__Box__NameAssignment_1 )? )
            {
            // InternalMyDsl.g:3579:1: ( ( rule__Box__NameAssignment_1 )? )
            // InternalMyDsl.g:3580:2: ( rule__Box__NameAssignment_1 )?
            {
             before(grammarAccess.getBoxAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:3581:2: ( rule__Box__NameAssignment_1 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_ID) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalMyDsl.g:3581:3: rule__Box__NameAssignment_1
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
    // InternalMyDsl.g:3589:1: rule__Box__Group__2 : rule__Box__Group__2__Impl rule__Box__Group__3 ;
    public final void rule__Box__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3593:1: ( rule__Box__Group__2__Impl rule__Box__Group__3 )
            // InternalMyDsl.g:3594:2: rule__Box__Group__2__Impl rule__Box__Group__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyDsl.g:3601:1: rule__Box__Group__2__Impl : ( 'height' ) ;
    public final void rule__Box__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3605:1: ( ( 'height' ) )
            // InternalMyDsl.g:3606:1: ( 'height' )
            {
            // InternalMyDsl.g:3606:1: ( 'height' )
            // InternalMyDsl.g:3607:2: 'height'
            {
             before(grammarAccess.getBoxAccess().getHeightKeyword_2()); 
            match(input,46,FOLLOW_2); 
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
    // InternalMyDsl.g:3616:1: rule__Box__Group__3 : rule__Box__Group__3__Impl rule__Box__Group__4 ;
    public final void rule__Box__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3620:1: ( rule__Box__Group__3__Impl rule__Box__Group__4 )
            // InternalMyDsl.g:3621:2: rule__Box__Group__3__Impl rule__Box__Group__4
            {
            pushFollow(FOLLOW_38);
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
    // InternalMyDsl.g:3628:1: rule__Box__Group__3__Impl : ( ( rule__Box__HeightAssignment_3 ) ) ;
    public final void rule__Box__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3632:1: ( ( ( rule__Box__HeightAssignment_3 ) ) )
            // InternalMyDsl.g:3633:1: ( ( rule__Box__HeightAssignment_3 ) )
            {
            // InternalMyDsl.g:3633:1: ( ( rule__Box__HeightAssignment_3 ) )
            // InternalMyDsl.g:3634:2: ( rule__Box__HeightAssignment_3 )
            {
             before(grammarAccess.getBoxAccess().getHeightAssignment_3()); 
            // InternalMyDsl.g:3635:2: ( rule__Box__HeightAssignment_3 )
            // InternalMyDsl.g:3635:3: rule__Box__HeightAssignment_3
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
    // InternalMyDsl.g:3643:1: rule__Box__Group__4 : rule__Box__Group__4__Impl rule__Box__Group__5 ;
    public final void rule__Box__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3647:1: ( rule__Box__Group__4__Impl rule__Box__Group__5 )
            // InternalMyDsl.g:3648:2: rule__Box__Group__4__Impl rule__Box__Group__5
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyDsl.g:3655:1: rule__Box__Group__4__Impl : ( 'length' ) ;
    public final void rule__Box__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3659:1: ( ( 'length' ) )
            // InternalMyDsl.g:3660:1: ( 'length' )
            {
            // InternalMyDsl.g:3660:1: ( 'length' )
            // InternalMyDsl.g:3661:2: 'length'
            {
             before(grammarAccess.getBoxAccess().getLengthKeyword_4()); 
            match(input,47,FOLLOW_2); 
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
    // InternalMyDsl.g:3670:1: rule__Box__Group__5 : rule__Box__Group__5__Impl rule__Box__Group__6 ;
    public final void rule__Box__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3674:1: ( rule__Box__Group__5__Impl rule__Box__Group__6 )
            // InternalMyDsl.g:3675:2: rule__Box__Group__5__Impl rule__Box__Group__6
            {
            pushFollow(FOLLOW_39);
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
    // InternalMyDsl.g:3682:1: rule__Box__Group__5__Impl : ( ( rule__Box__LengthAssignment_5 ) ) ;
    public final void rule__Box__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3686:1: ( ( ( rule__Box__LengthAssignment_5 ) ) )
            // InternalMyDsl.g:3687:1: ( ( rule__Box__LengthAssignment_5 ) )
            {
            // InternalMyDsl.g:3687:1: ( ( rule__Box__LengthAssignment_5 ) )
            // InternalMyDsl.g:3688:2: ( rule__Box__LengthAssignment_5 )
            {
             before(grammarAccess.getBoxAccess().getLengthAssignment_5()); 
            // InternalMyDsl.g:3689:2: ( rule__Box__LengthAssignment_5 )
            // InternalMyDsl.g:3689:3: rule__Box__LengthAssignment_5
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
    // InternalMyDsl.g:3697:1: rule__Box__Group__6 : rule__Box__Group__6__Impl rule__Box__Group__7 ;
    public final void rule__Box__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3701:1: ( rule__Box__Group__6__Impl rule__Box__Group__7 )
            // InternalMyDsl.g:3702:2: rule__Box__Group__6__Impl rule__Box__Group__7
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyDsl.g:3709:1: rule__Box__Group__6__Impl : ( 'width' ) ;
    public final void rule__Box__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3713:1: ( ( 'width' ) )
            // InternalMyDsl.g:3714:1: ( 'width' )
            {
            // InternalMyDsl.g:3714:1: ( 'width' )
            // InternalMyDsl.g:3715:2: 'width'
            {
             before(grammarAccess.getBoxAccess().getWidthKeyword_6()); 
            match(input,48,FOLLOW_2); 
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
    // InternalMyDsl.g:3724:1: rule__Box__Group__7 : rule__Box__Group__7__Impl ;
    public final void rule__Box__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3728:1: ( rule__Box__Group__7__Impl )
            // InternalMyDsl.g:3729:2: rule__Box__Group__7__Impl
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
    // InternalMyDsl.g:3735:1: rule__Box__Group__7__Impl : ( ( rule__Box__WidthAssignment_7 ) ) ;
    public final void rule__Box__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3739:1: ( ( ( rule__Box__WidthAssignment_7 ) ) )
            // InternalMyDsl.g:3740:1: ( ( rule__Box__WidthAssignment_7 ) )
            {
            // InternalMyDsl.g:3740:1: ( ( rule__Box__WidthAssignment_7 ) )
            // InternalMyDsl.g:3741:2: ( rule__Box__WidthAssignment_7 )
            {
             before(grammarAccess.getBoxAccess().getWidthAssignment_7()); 
            // InternalMyDsl.g:3742:2: ( rule__Box__WidthAssignment_7 )
            // InternalMyDsl.g:3742:3: rule__Box__WidthAssignment_7
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
    // InternalMyDsl.g:3751:1: rule__Cylinder__Group__0 : rule__Cylinder__Group__0__Impl rule__Cylinder__Group__1 ;
    public final void rule__Cylinder__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3755:1: ( rule__Cylinder__Group__0__Impl rule__Cylinder__Group__1 )
            // InternalMyDsl.g:3756:2: rule__Cylinder__Group__0__Impl rule__Cylinder__Group__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalMyDsl.g:3763:1: rule__Cylinder__Group__0__Impl : ( 'Cylinder' ) ;
    public final void rule__Cylinder__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3767:1: ( ( 'Cylinder' ) )
            // InternalMyDsl.g:3768:1: ( 'Cylinder' )
            {
            // InternalMyDsl.g:3768:1: ( 'Cylinder' )
            // InternalMyDsl.g:3769:2: 'Cylinder'
            {
             before(grammarAccess.getCylinderAccess().getCylinderKeyword_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalMyDsl.g:3778:1: rule__Cylinder__Group__1 : rule__Cylinder__Group__1__Impl rule__Cylinder__Group__2 ;
    public final void rule__Cylinder__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3782:1: ( rule__Cylinder__Group__1__Impl rule__Cylinder__Group__2 )
            // InternalMyDsl.g:3783:2: rule__Cylinder__Group__1__Impl rule__Cylinder__Group__2
            {
            pushFollow(FOLLOW_40);
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
    // InternalMyDsl.g:3790:1: rule__Cylinder__Group__1__Impl : ( ( rule__Cylinder__NameAssignment_1 )? ) ;
    public final void rule__Cylinder__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3794:1: ( ( ( rule__Cylinder__NameAssignment_1 )? ) )
            // InternalMyDsl.g:3795:1: ( ( rule__Cylinder__NameAssignment_1 )? )
            {
            // InternalMyDsl.g:3795:1: ( ( rule__Cylinder__NameAssignment_1 )? )
            // InternalMyDsl.g:3796:2: ( rule__Cylinder__NameAssignment_1 )?
            {
             before(grammarAccess.getCylinderAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:3797:2: ( rule__Cylinder__NameAssignment_1 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_ID) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalMyDsl.g:3797:3: rule__Cylinder__NameAssignment_1
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
    // InternalMyDsl.g:3805:1: rule__Cylinder__Group__2 : rule__Cylinder__Group__2__Impl rule__Cylinder__Group__3 ;
    public final void rule__Cylinder__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3809:1: ( rule__Cylinder__Group__2__Impl rule__Cylinder__Group__3 )
            // InternalMyDsl.g:3810:2: rule__Cylinder__Group__2__Impl rule__Cylinder__Group__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyDsl.g:3817:1: rule__Cylinder__Group__2__Impl : ( 'radius' ) ;
    public final void rule__Cylinder__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3821:1: ( ( 'radius' ) )
            // InternalMyDsl.g:3822:1: ( 'radius' )
            {
            // InternalMyDsl.g:3822:1: ( 'radius' )
            // InternalMyDsl.g:3823:2: 'radius'
            {
             before(grammarAccess.getCylinderAccess().getRadiusKeyword_2()); 
            match(input,50,FOLLOW_2); 
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
    // InternalMyDsl.g:3832:1: rule__Cylinder__Group__3 : rule__Cylinder__Group__3__Impl rule__Cylinder__Group__4 ;
    public final void rule__Cylinder__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3836:1: ( rule__Cylinder__Group__3__Impl rule__Cylinder__Group__4 )
            // InternalMyDsl.g:3837:2: rule__Cylinder__Group__3__Impl rule__Cylinder__Group__4
            {
            pushFollow(FOLLOW_38);
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
    // InternalMyDsl.g:3844:1: rule__Cylinder__Group__3__Impl : ( ( rule__Cylinder__RadiusAssignment_3 ) ) ;
    public final void rule__Cylinder__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3848:1: ( ( ( rule__Cylinder__RadiusAssignment_3 ) ) )
            // InternalMyDsl.g:3849:1: ( ( rule__Cylinder__RadiusAssignment_3 ) )
            {
            // InternalMyDsl.g:3849:1: ( ( rule__Cylinder__RadiusAssignment_3 ) )
            // InternalMyDsl.g:3850:2: ( rule__Cylinder__RadiusAssignment_3 )
            {
             before(grammarAccess.getCylinderAccess().getRadiusAssignment_3()); 
            // InternalMyDsl.g:3851:2: ( rule__Cylinder__RadiusAssignment_3 )
            // InternalMyDsl.g:3851:3: rule__Cylinder__RadiusAssignment_3
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
    // InternalMyDsl.g:3859:1: rule__Cylinder__Group__4 : rule__Cylinder__Group__4__Impl rule__Cylinder__Group__5 ;
    public final void rule__Cylinder__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3863:1: ( rule__Cylinder__Group__4__Impl rule__Cylinder__Group__5 )
            // InternalMyDsl.g:3864:2: rule__Cylinder__Group__4__Impl rule__Cylinder__Group__5
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyDsl.g:3871:1: rule__Cylinder__Group__4__Impl : ( 'length' ) ;
    public final void rule__Cylinder__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3875:1: ( ( 'length' ) )
            // InternalMyDsl.g:3876:1: ( 'length' )
            {
            // InternalMyDsl.g:3876:1: ( 'length' )
            // InternalMyDsl.g:3877:2: 'length'
            {
             before(grammarAccess.getCylinderAccess().getLengthKeyword_4()); 
            match(input,47,FOLLOW_2); 
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
    // InternalMyDsl.g:3886:1: rule__Cylinder__Group__5 : rule__Cylinder__Group__5__Impl ;
    public final void rule__Cylinder__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3890:1: ( rule__Cylinder__Group__5__Impl )
            // InternalMyDsl.g:3891:2: rule__Cylinder__Group__5__Impl
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
    // InternalMyDsl.g:3897:1: rule__Cylinder__Group__5__Impl : ( ( rule__Cylinder__LengthAssignment_5 ) ) ;
    public final void rule__Cylinder__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3901:1: ( ( ( rule__Cylinder__LengthAssignment_5 ) ) )
            // InternalMyDsl.g:3902:1: ( ( rule__Cylinder__LengthAssignment_5 ) )
            {
            // InternalMyDsl.g:3902:1: ( ( rule__Cylinder__LengthAssignment_5 ) )
            // InternalMyDsl.g:3903:2: ( rule__Cylinder__LengthAssignment_5 )
            {
             before(grammarAccess.getCylinderAccess().getLengthAssignment_5()); 
            // InternalMyDsl.g:3904:2: ( rule__Cylinder__LengthAssignment_5 )
            // InternalMyDsl.g:3904:3: rule__Cylinder__LengthAssignment_5
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
    // InternalMyDsl.g:3913:1: rule__Mesh__Group__0 : rule__Mesh__Group__0__Impl rule__Mesh__Group__1 ;
    public final void rule__Mesh__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3917:1: ( rule__Mesh__Group__0__Impl rule__Mesh__Group__1 )
            // InternalMyDsl.g:3918:2: rule__Mesh__Group__0__Impl rule__Mesh__Group__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalMyDsl.g:3925:1: rule__Mesh__Group__0__Impl : ( 'Mesh' ) ;
    public final void rule__Mesh__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3929:1: ( ( 'Mesh' ) )
            // InternalMyDsl.g:3930:1: ( 'Mesh' )
            {
            // InternalMyDsl.g:3930:1: ( 'Mesh' )
            // InternalMyDsl.g:3931:2: 'Mesh'
            {
             before(grammarAccess.getMeshAccess().getMeshKeyword_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalMyDsl.g:3940:1: rule__Mesh__Group__1 : rule__Mesh__Group__1__Impl rule__Mesh__Group__2 ;
    public final void rule__Mesh__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3944:1: ( rule__Mesh__Group__1__Impl rule__Mesh__Group__2 )
            // InternalMyDsl.g:3945:2: rule__Mesh__Group__1__Impl rule__Mesh__Group__2
            {
            pushFollow(FOLLOW_41);
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
    // InternalMyDsl.g:3952:1: rule__Mesh__Group__1__Impl : ( ( rule__Mesh__NameAssignment_1 )? ) ;
    public final void rule__Mesh__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3956:1: ( ( ( rule__Mesh__NameAssignment_1 )? ) )
            // InternalMyDsl.g:3957:1: ( ( rule__Mesh__NameAssignment_1 )? )
            {
            // InternalMyDsl.g:3957:1: ( ( rule__Mesh__NameAssignment_1 )? )
            // InternalMyDsl.g:3958:2: ( rule__Mesh__NameAssignment_1 )?
            {
             before(grammarAccess.getMeshAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:3959:2: ( rule__Mesh__NameAssignment_1 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_ID) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalMyDsl.g:3959:3: rule__Mesh__NameAssignment_1
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
    // InternalMyDsl.g:3967:1: rule__Mesh__Group__2 : rule__Mesh__Group__2__Impl rule__Mesh__Group__3 ;
    public final void rule__Mesh__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3971:1: ( rule__Mesh__Group__2__Impl rule__Mesh__Group__3 )
            // InternalMyDsl.g:3972:2: rule__Mesh__Group__2__Impl rule__Mesh__Group__3
            {
            pushFollow(FOLLOW_42);
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
    // InternalMyDsl.g:3979:1: rule__Mesh__Group__2__Impl : ( 'pathToFile' ) ;
    public final void rule__Mesh__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3983:1: ( ( 'pathToFile' ) )
            // InternalMyDsl.g:3984:1: ( 'pathToFile' )
            {
            // InternalMyDsl.g:3984:1: ( 'pathToFile' )
            // InternalMyDsl.g:3985:2: 'pathToFile'
            {
             before(grammarAccess.getMeshAccess().getPathToFileKeyword_2()); 
            match(input,52,FOLLOW_2); 
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
    // InternalMyDsl.g:3994:1: rule__Mesh__Group__3 : rule__Mesh__Group__3__Impl ;
    public final void rule__Mesh__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3998:1: ( rule__Mesh__Group__3__Impl )
            // InternalMyDsl.g:3999:2: rule__Mesh__Group__3__Impl
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
    // InternalMyDsl.g:4005:1: rule__Mesh__Group__3__Impl : ( ( rule__Mesh__PathToFileAssignment_3 ) ) ;
    public final void rule__Mesh__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4009:1: ( ( ( rule__Mesh__PathToFileAssignment_3 ) ) )
            // InternalMyDsl.g:4010:1: ( ( rule__Mesh__PathToFileAssignment_3 ) )
            {
            // InternalMyDsl.g:4010:1: ( ( rule__Mesh__PathToFileAssignment_3 ) )
            // InternalMyDsl.g:4011:2: ( rule__Mesh__PathToFileAssignment_3 )
            {
             before(grammarAccess.getMeshAccess().getPathToFileAssignment_3()); 
            // InternalMyDsl.g:4012:2: ( rule__Mesh__PathToFileAssignment_3 )
            // InternalMyDsl.g:4012:3: rule__Mesh__PathToFileAssignment_3
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
    // InternalMyDsl.g:4021:1: rule__Sphere__Group__0 : rule__Sphere__Group__0__Impl rule__Sphere__Group__1 ;
    public final void rule__Sphere__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4025:1: ( rule__Sphere__Group__0__Impl rule__Sphere__Group__1 )
            // InternalMyDsl.g:4026:2: rule__Sphere__Group__0__Impl rule__Sphere__Group__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalMyDsl.g:4033:1: rule__Sphere__Group__0__Impl : ( 'Sphere' ) ;
    public final void rule__Sphere__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4037:1: ( ( 'Sphere' ) )
            // InternalMyDsl.g:4038:1: ( 'Sphere' )
            {
            // InternalMyDsl.g:4038:1: ( 'Sphere' )
            // InternalMyDsl.g:4039:2: 'Sphere'
            {
             before(grammarAccess.getSphereAccess().getSphereKeyword_0()); 
            match(input,53,FOLLOW_2); 
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
    // InternalMyDsl.g:4048:1: rule__Sphere__Group__1 : rule__Sphere__Group__1__Impl rule__Sphere__Group__2 ;
    public final void rule__Sphere__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4052:1: ( rule__Sphere__Group__1__Impl rule__Sphere__Group__2 )
            // InternalMyDsl.g:4053:2: rule__Sphere__Group__1__Impl rule__Sphere__Group__2
            {
            pushFollow(FOLLOW_40);
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
    // InternalMyDsl.g:4060:1: rule__Sphere__Group__1__Impl : ( ( rule__Sphere__NameAssignment_1 )? ) ;
    public final void rule__Sphere__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4064:1: ( ( ( rule__Sphere__NameAssignment_1 )? ) )
            // InternalMyDsl.g:4065:1: ( ( rule__Sphere__NameAssignment_1 )? )
            {
            // InternalMyDsl.g:4065:1: ( ( rule__Sphere__NameAssignment_1 )? )
            // InternalMyDsl.g:4066:2: ( rule__Sphere__NameAssignment_1 )?
            {
             before(grammarAccess.getSphereAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:4067:2: ( rule__Sphere__NameAssignment_1 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_ID) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalMyDsl.g:4067:3: rule__Sphere__NameAssignment_1
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
    // InternalMyDsl.g:4075:1: rule__Sphere__Group__2 : rule__Sphere__Group__2__Impl rule__Sphere__Group__3 ;
    public final void rule__Sphere__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4079:1: ( rule__Sphere__Group__2__Impl rule__Sphere__Group__3 )
            // InternalMyDsl.g:4080:2: rule__Sphere__Group__2__Impl rule__Sphere__Group__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyDsl.g:4087:1: rule__Sphere__Group__2__Impl : ( 'radius' ) ;
    public final void rule__Sphere__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4091:1: ( ( 'radius' ) )
            // InternalMyDsl.g:4092:1: ( 'radius' )
            {
            // InternalMyDsl.g:4092:1: ( 'radius' )
            // InternalMyDsl.g:4093:2: 'radius'
            {
             before(grammarAccess.getSphereAccess().getRadiusKeyword_2()); 
            match(input,50,FOLLOW_2); 
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
    // InternalMyDsl.g:4102:1: rule__Sphere__Group__3 : rule__Sphere__Group__3__Impl ;
    public final void rule__Sphere__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4106:1: ( rule__Sphere__Group__3__Impl )
            // InternalMyDsl.g:4107:2: rule__Sphere__Group__3__Impl
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
    // InternalMyDsl.g:4113:1: rule__Sphere__Group__3__Impl : ( ( rule__Sphere__RadiusAssignment_3 ) ) ;
    public final void rule__Sphere__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4117:1: ( ( ( rule__Sphere__RadiusAssignment_3 ) ) )
            // InternalMyDsl.g:4118:1: ( ( rule__Sphere__RadiusAssignment_3 ) )
            {
            // InternalMyDsl.g:4118:1: ( ( rule__Sphere__RadiusAssignment_3 ) )
            // InternalMyDsl.g:4119:2: ( rule__Sphere__RadiusAssignment_3 )
            {
             before(grammarAccess.getSphereAccess().getRadiusAssignment_3()); 
            // InternalMyDsl.g:4120:2: ( rule__Sphere__RadiusAssignment_3 )
            // InternalMyDsl.g:4120:3: rule__Sphere__RadiusAssignment_3
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
    // InternalMyDsl.g:4129:1: rule__Texture__Group__0 : rule__Texture__Group__0__Impl rule__Texture__Group__1 ;
    public final void rule__Texture__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4133:1: ( rule__Texture__Group__0__Impl rule__Texture__Group__1 )
            // InternalMyDsl.g:4134:2: rule__Texture__Group__0__Impl rule__Texture__Group__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalMyDsl.g:4141:1: rule__Texture__Group__0__Impl : ( 'Texture' ) ;
    public final void rule__Texture__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4145:1: ( ( 'Texture' ) )
            // InternalMyDsl.g:4146:1: ( 'Texture' )
            {
            // InternalMyDsl.g:4146:1: ( 'Texture' )
            // InternalMyDsl.g:4147:2: 'Texture'
            {
             before(grammarAccess.getTextureAccess().getTextureKeyword_0()); 
            match(input,54,FOLLOW_2); 
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
    // InternalMyDsl.g:4156:1: rule__Texture__Group__1 : rule__Texture__Group__1__Impl rule__Texture__Group__2 ;
    public final void rule__Texture__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4160:1: ( rule__Texture__Group__1__Impl rule__Texture__Group__2 )
            // InternalMyDsl.g:4161:2: rule__Texture__Group__1__Impl rule__Texture__Group__2
            {
            pushFollow(FOLLOW_41);
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
    // InternalMyDsl.g:4168:1: rule__Texture__Group__1__Impl : ( ( rule__Texture__NameAssignment_1 )? ) ;
    public final void rule__Texture__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4172:1: ( ( ( rule__Texture__NameAssignment_1 )? ) )
            // InternalMyDsl.g:4173:1: ( ( rule__Texture__NameAssignment_1 )? )
            {
            // InternalMyDsl.g:4173:1: ( ( rule__Texture__NameAssignment_1 )? )
            // InternalMyDsl.g:4174:2: ( rule__Texture__NameAssignment_1 )?
            {
             before(grammarAccess.getTextureAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:4175:2: ( rule__Texture__NameAssignment_1 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_ID) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalMyDsl.g:4175:3: rule__Texture__NameAssignment_1
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
    // InternalMyDsl.g:4183:1: rule__Texture__Group__2 : rule__Texture__Group__2__Impl rule__Texture__Group__3 ;
    public final void rule__Texture__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4187:1: ( rule__Texture__Group__2__Impl rule__Texture__Group__3 )
            // InternalMyDsl.g:4188:2: rule__Texture__Group__2__Impl rule__Texture__Group__3
            {
            pushFollow(FOLLOW_42);
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
    // InternalMyDsl.g:4195:1: rule__Texture__Group__2__Impl : ( 'pathToFile' ) ;
    public final void rule__Texture__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4199:1: ( ( 'pathToFile' ) )
            // InternalMyDsl.g:4200:1: ( 'pathToFile' )
            {
            // InternalMyDsl.g:4200:1: ( 'pathToFile' )
            // InternalMyDsl.g:4201:2: 'pathToFile'
            {
             before(grammarAccess.getTextureAccess().getPathToFileKeyword_2()); 
            match(input,52,FOLLOW_2); 
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
    // InternalMyDsl.g:4210:1: rule__Texture__Group__3 : rule__Texture__Group__3__Impl ;
    public final void rule__Texture__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4214:1: ( rule__Texture__Group__3__Impl )
            // InternalMyDsl.g:4215:2: rule__Texture__Group__3__Impl
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
    // InternalMyDsl.g:4221:1: rule__Texture__Group__3__Impl : ( ( rule__Texture__PathToFileAssignment_3 ) ) ;
    public final void rule__Texture__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4225:1: ( ( ( rule__Texture__PathToFileAssignment_3 ) ) )
            // InternalMyDsl.g:4226:1: ( ( rule__Texture__PathToFileAssignment_3 ) )
            {
            // InternalMyDsl.g:4226:1: ( ( rule__Texture__PathToFileAssignment_3 ) )
            // InternalMyDsl.g:4227:2: ( rule__Texture__PathToFileAssignment_3 )
            {
             before(grammarAccess.getTextureAccess().getPathToFileAssignment_3()); 
            // InternalMyDsl.g:4228:2: ( rule__Texture__PathToFileAssignment_3 )
            // InternalMyDsl.g:4228:3: rule__Texture__PathToFileAssignment_3
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
    // InternalMyDsl.g:4237:1: rule__Color__Group__0 : rule__Color__Group__0__Impl rule__Color__Group__1 ;
    public final void rule__Color__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4241:1: ( rule__Color__Group__0__Impl rule__Color__Group__1 )
            // InternalMyDsl.g:4242:2: rule__Color__Group__0__Impl rule__Color__Group__1
            {
            pushFollow(FOLLOW_43);
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
    // InternalMyDsl.g:4249:1: rule__Color__Group__0__Impl : ( 'Color' ) ;
    public final void rule__Color__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4253:1: ( ( 'Color' ) )
            // InternalMyDsl.g:4254:1: ( 'Color' )
            {
            // InternalMyDsl.g:4254:1: ( 'Color' )
            // InternalMyDsl.g:4255:2: 'Color'
            {
             before(grammarAccess.getColorAccess().getColorKeyword_0()); 
            match(input,55,FOLLOW_2); 
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
    // InternalMyDsl.g:4264:1: rule__Color__Group__1 : rule__Color__Group__1__Impl rule__Color__Group__2 ;
    public final void rule__Color__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4268:1: ( rule__Color__Group__1__Impl rule__Color__Group__2 )
            // InternalMyDsl.g:4269:2: rule__Color__Group__1__Impl rule__Color__Group__2
            {
            pushFollow(FOLLOW_43);
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
    // InternalMyDsl.g:4276:1: rule__Color__Group__1__Impl : ( ( rule__Color__NameAssignment_1 )? ) ;
    public final void rule__Color__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4280:1: ( ( ( rule__Color__NameAssignment_1 )? ) )
            // InternalMyDsl.g:4281:1: ( ( rule__Color__NameAssignment_1 )? )
            {
            // InternalMyDsl.g:4281:1: ( ( rule__Color__NameAssignment_1 )? )
            // InternalMyDsl.g:4282:2: ( rule__Color__NameAssignment_1 )?
            {
             before(grammarAccess.getColorAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:4283:2: ( rule__Color__NameAssignment_1 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_ID) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalMyDsl.g:4283:3: rule__Color__NameAssignment_1
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
    // InternalMyDsl.g:4291:1: rule__Color__Group__2 : rule__Color__Group__2__Impl rule__Color__Group__3 ;
    public final void rule__Color__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4295:1: ( rule__Color__Group__2__Impl rule__Color__Group__3 )
            // InternalMyDsl.g:4296:2: rule__Color__Group__2__Impl rule__Color__Group__3
            {
            pushFollow(FOLLOW_44);
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
    // InternalMyDsl.g:4303:1: rule__Color__Group__2__Impl : ( 'red' ) ;
    public final void rule__Color__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4307:1: ( ( 'red' ) )
            // InternalMyDsl.g:4308:1: ( 'red' )
            {
            // InternalMyDsl.g:4308:1: ( 'red' )
            // InternalMyDsl.g:4309:2: 'red'
            {
             before(grammarAccess.getColorAccess().getRedKeyword_2()); 
            match(input,56,FOLLOW_2); 
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
    // InternalMyDsl.g:4318:1: rule__Color__Group__3 : rule__Color__Group__3__Impl rule__Color__Group__4 ;
    public final void rule__Color__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4322:1: ( rule__Color__Group__3__Impl rule__Color__Group__4 )
            // InternalMyDsl.g:4323:2: rule__Color__Group__3__Impl rule__Color__Group__4
            {
            pushFollow(FOLLOW_45);
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
    // InternalMyDsl.g:4330:1: rule__Color__Group__3__Impl : ( ( rule__Color__RedAssignment_3 ) ) ;
    public final void rule__Color__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4334:1: ( ( ( rule__Color__RedAssignment_3 ) ) )
            // InternalMyDsl.g:4335:1: ( ( rule__Color__RedAssignment_3 ) )
            {
            // InternalMyDsl.g:4335:1: ( ( rule__Color__RedAssignment_3 ) )
            // InternalMyDsl.g:4336:2: ( rule__Color__RedAssignment_3 )
            {
             before(grammarAccess.getColorAccess().getRedAssignment_3()); 
            // InternalMyDsl.g:4337:2: ( rule__Color__RedAssignment_3 )
            // InternalMyDsl.g:4337:3: rule__Color__RedAssignment_3
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
    // InternalMyDsl.g:4345:1: rule__Color__Group__4 : rule__Color__Group__4__Impl rule__Color__Group__5 ;
    public final void rule__Color__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4349:1: ( rule__Color__Group__4__Impl rule__Color__Group__5 )
            // InternalMyDsl.g:4350:2: rule__Color__Group__4__Impl rule__Color__Group__5
            {
            pushFollow(FOLLOW_44);
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
    // InternalMyDsl.g:4357:1: rule__Color__Group__4__Impl : ( 'green' ) ;
    public final void rule__Color__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4361:1: ( ( 'green' ) )
            // InternalMyDsl.g:4362:1: ( 'green' )
            {
            // InternalMyDsl.g:4362:1: ( 'green' )
            // InternalMyDsl.g:4363:2: 'green'
            {
             before(grammarAccess.getColorAccess().getGreenKeyword_4()); 
            match(input,57,FOLLOW_2); 
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
    // InternalMyDsl.g:4372:1: rule__Color__Group__5 : rule__Color__Group__5__Impl rule__Color__Group__6 ;
    public final void rule__Color__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4376:1: ( rule__Color__Group__5__Impl rule__Color__Group__6 )
            // InternalMyDsl.g:4377:2: rule__Color__Group__5__Impl rule__Color__Group__6
            {
            pushFollow(FOLLOW_46);
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
    // InternalMyDsl.g:4384:1: rule__Color__Group__5__Impl : ( ( rule__Color__GreenAssignment_5 ) ) ;
    public final void rule__Color__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4388:1: ( ( ( rule__Color__GreenAssignment_5 ) ) )
            // InternalMyDsl.g:4389:1: ( ( rule__Color__GreenAssignment_5 ) )
            {
            // InternalMyDsl.g:4389:1: ( ( rule__Color__GreenAssignment_5 ) )
            // InternalMyDsl.g:4390:2: ( rule__Color__GreenAssignment_5 )
            {
             before(grammarAccess.getColorAccess().getGreenAssignment_5()); 
            // InternalMyDsl.g:4391:2: ( rule__Color__GreenAssignment_5 )
            // InternalMyDsl.g:4391:3: rule__Color__GreenAssignment_5
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
    // InternalMyDsl.g:4399:1: rule__Color__Group__6 : rule__Color__Group__6__Impl rule__Color__Group__7 ;
    public final void rule__Color__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4403:1: ( rule__Color__Group__6__Impl rule__Color__Group__7 )
            // InternalMyDsl.g:4404:2: rule__Color__Group__6__Impl rule__Color__Group__7
            {
            pushFollow(FOLLOW_44);
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
    // InternalMyDsl.g:4411:1: rule__Color__Group__6__Impl : ( 'blue' ) ;
    public final void rule__Color__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4415:1: ( ( 'blue' ) )
            // InternalMyDsl.g:4416:1: ( 'blue' )
            {
            // InternalMyDsl.g:4416:1: ( 'blue' )
            // InternalMyDsl.g:4417:2: 'blue'
            {
             before(grammarAccess.getColorAccess().getBlueKeyword_6()); 
            match(input,58,FOLLOW_2); 
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
    // InternalMyDsl.g:4426:1: rule__Color__Group__7 : rule__Color__Group__7__Impl rule__Color__Group__8 ;
    public final void rule__Color__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4430:1: ( rule__Color__Group__7__Impl rule__Color__Group__8 )
            // InternalMyDsl.g:4431:2: rule__Color__Group__7__Impl rule__Color__Group__8
            {
            pushFollow(FOLLOW_47);
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
    // InternalMyDsl.g:4438:1: rule__Color__Group__7__Impl : ( ( rule__Color__BlueAssignment_7 ) ) ;
    public final void rule__Color__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4442:1: ( ( ( rule__Color__BlueAssignment_7 ) ) )
            // InternalMyDsl.g:4443:1: ( ( rule__Color__BlueAssignment_7 ) )
            {
            // InternalMyDsl.g:4443:1: ( ( rule__Color__BlueAssignment_7 ) )
            // InternalMyDsl.g:4444:2: ( rule__Color__BlueAssignment_7 )
            {
             before(grammarAccess.getColorAccess().getBlueAssignment_7()); 
            // InternalMyDsl.g:4445:2: ( rule__Color__BlueAssignment_7 )
            // InternalMyDsl.g:4445:3: rule__Color__BlueAssignment_7
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
    // InternalMyDsl.g:4453:1: rule__Color__Group__8 : rule__Color__Group__8__Impl rule__Color__Group__9 ;
    public final void rule__Color__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4457:1: ( rule__Color__Group__8__Impl rule__Color__Group__9 )
            // InternalMyDsl.g:4458:2: rule__Color__Group__8__Impl rule__Color__Group__9
            {
            pushFollow(FOLLOW_44);
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
    // InternalMyDsl.g:4465:1: rule__Color__Group__8__Impl : ( 'alpha' ) ;
    public final void rule__Color__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4469:1: ( ( 'alpha' ) )
            // InternalMyDsl.g:4470:1: ( 'alpha' )
            {
            // InternalMyDsl.g:4470:1: ( 'alpha' )
            // InternalMyDsl.g:4471:2: 'alpha'
            {
             before(grammarAccess.getColorAccess().getAlphaKeyword_8()); 
            match(input,59,FOLLOW_2); 
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
    // InternalMyDsl.g:4480:1: rule__Color__Group__9 : rule__Color__Group__9__Impl ;
    public final void rule__Color__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4484:1: ( rule__Color__Group__9__Impl )
            // InternalMyDsl.g:4485:2: rule__Color__Group__9__Impl
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
    // InternalMyDsl.g:4491:1: rule__Color__Group__9__Impl : ( ( rule__Color__AlphaAssignment_9 ) ) ;
    public final void rule__Color__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4495:1: ( ( ( rule__Color__AlphaAssignment_9 ) ) )
            // InternalMyDsl.g:4496:1: ( ( rule__Color__AlphaAssignment_9 ) )
            {
            // InternalMyDsl.g:4496:1: ( ( rule__Color__AlphaAssignment_9 ) )
            // InternalMyDsl.g:4497:2: ( rule__Color__AlphaAssignment_9 )
            {
             before(grammarAccess.getColorAccess().getAlphaAssignment_9()); 
            // InternalMyDsl.g:4498:2: ( rule__Color__AlphaAssignment_9 )
            // InternalMyDsl.g:4498:3: rule__Color__AlphaAssignment_9
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
    // InternalMyDsl.g:4507:1: rule__Joint__Group__0 : rule__Joint__Group__0__Impl rule__Joint__Group__1 ;
    public final void rule__Joint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4511:1: ( rule__Joint__Group__0__Impl rule__Joint__Group__1 )
            // InternalMyDsl.g:4512:2: rule__Joint__Group__0__Impl rule__Joint__Group__1
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
    // InternalMyDsl.g:4519:1: rule__Joint__Group__0__Impl : ( 'Joint' ) ;
    public final void rule__Joint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4523:1: ( ( 'Joint' ) )
            // InternalMyDsl.g:4524:1: ( 'Joint' )
            {
            // InternalMyDsl.g:4524:1: ( 'Joint' )
            // InternalMyDsl.g:4525:2: 'Joint'
            {
             before(grammarAccess.getJointAccess().getJointKeyword_0()); 
            match(input,60,FOLLOW_2); 
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
    // InternalMyDsl.g:4534:1: rule__Joint__Group__1 : rule__Joint__Group__1__Impl rule__Joint__Group__2 ;
    public final void rule__Joint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4538:1: ( rule__Joint__Group__1__Impl rule__Joint__Group__2 )
            // InternalMyDsl.g:4539:2: rule__Joint__Group__1__Impl rule__Joint__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalMyDsl.g:4546:1: rule__Joint__Group__1__Impl : ( ( rule__Joint__NameAssignment_1 ) ) ;
    public final void rule__Joint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4550:1: ( ( ( rule__Joint__NameAssignment_1 ) ) )
            // InternalMyDsl.g:4551:1: ( ( rule__Joint__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:4551:1: ( ( rule__Joint__NameAssignment_1 ) )
            // InternalMyDsl.g:4552:2: ( rule__Joint__NameAssignment_1 )
            {
             before(grammarAccess.getJointAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:4553:2: ( rule__Joint__NameAssignment_1 )
            // InternalMyDsl.g:4553:3: rule__Joint__NameAssignment_1
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
    // InternalMyDsl.g:4561:1: rule__Joint__Group__2 : rule__Joint__Group__2__Impl ;
    public final void rule__Joint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4565:1: ( rule__Joint__Group__2__Impl )
            // InternalMyDsl.g:4566:2: rule__Joint__Group__2__Impl
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
    // InternalMyDsl.g:4572:1: rule__Joint__Group__2__Impl : ( ( rule__Joint__Alternatives_2 )? ) ;
    public final void rule__Joint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4576:1: ( ( ( rule__Joint__Alternatives_2 )? ) )
            // InternalMyDsl.g:4577:1: ( ( rule__Joint__Alternatives_2 )? )
            {
            // InternalMyDsl.g:4577:1: ( ( rule__Joint__Alternatives_2 )? )
            // InternalMyDsl.g:4578:2: ( rule__Joint__Alternatives_2 )?
            {
             before(grammarAccess.getJointAccess().getAlternatives_2()); 
            // InternalMyDsl.g:4579:2: ( rule__Joint__Alternatives_2 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=19 && LA39_0<=20)) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalMyDsl.g:4579:3: rule__Joint__Alternatives_2
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
    // InternalMyDsl.g:4588:1: rule__Joint__Group_2_0__0 : rule__Joint__Group_2_0__0__Impl rule__Joint__Group_2_0__1 ;
    public final void rule__Joint__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4592:1: ( rule__Joint__Group_2_0__0__Impl rule__Joint__Group_2_0__1 )
            // InternalMyDsl.g:4593:2: rule__Joint__Group_2_0__0__Impl rule__Joint__Group_2_0__1
            {
            pushFollow(FOLLOW_48);
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
    // InternalMyDsl.g:4600:1: rule__Joint__Group_2_0__0__Impl : ( ( rule__Joint__Group_2_0_0__0 ) ) ;
    public final void rule__Joint__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4604:1: ( ( ( rule__Joint__Group_2_0_0__0 ) ) )
            // InternalMyDsl.g:4605:1: ( ( rule__Joint__Group_2_0_0__0 ) )
            {
            // InternalMyDsl.g:4605:1: ( ( rule__Joint__Group_2_0_0__0 ) )
            // InternalMyDsl.g:4606:2: ( rule__Joint__Group_2_0_0__0 )
            {
             before(grammarAccess.getJointAccess().getGroup_2_0_0()); 
            // InternalMyDsl.g:4607:2: ( rule__Joint__Group_2_0_0__0 )
            // InternalMyDsl.g:4607:3: rule__Joint__Group_2_0_0__0
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
    // InternalMyDsl.g:4615:1: rule__Joint__Group_2_0__1 : rule__Joint__Group_2_0__1__Impl ;
    public final void rule__Joint__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4619:1: ( rule__Joint__Group_2_0__1__Impl )
            // InternalMyDsl.g:4620:2: rule__Joint__Group_2_0__1__Impl
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
    // InternalMyDsl.g:4626:1: rule__Joint__Group_2_0__1__Impl : ( ( rule__Joint__Alternatives_2_0_1 )* ) ;
    public final void rule__Joint__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4630:1: ( ( ( rule__Joint__Alternatives_2_0_1 )* ) )
            // InternalMyDsl.g:4631:1: ( ( rule__Joint__Alternatives_2_0_1 )* )
            {
            // InternalMyDsl.g:4631:1: ( ( rule__Joint__Alternatives_2_0_1 )* )
            // InternalMyDsl.g:4632:2: ( rule__Joint__Alternatives_2_0_1 )*
            {
             before(grammarAccess.getJointAccess().getAlternatives_2_0_1()); 
            // InternalMyDsl.g:4633:2: ( rule__Joint__Alternatives_2_0_1 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==35||(LA40_0>=64 && LA40_0<=65)||LA40_0==70||LA40_0==73||LA40_0==76) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalMyDsl.g:4633:3: rule__Joint__Alternatives_2_0_1
            	    {
            	    pushFollow(FOLLOW_49);
            	    rule__Joint__Alternatives_2_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
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
    // InternalMyDsl.g:4642:1: rule__Joint__Group_2_0_0__0 : rule__Joint__Group_2_0_0__0__Impl rule__Joint__Group_2_0_0__1 ;
    public final void rule__Joint__Group_2_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4646:1: ( rule__Joint__Group_2_0_0__0__Impl rule__Joint__Group_2_0_0__1 )
            // InternalMyDsl.g:4647:2: rule__Joint__Group_2_0_0__0__Impl rule__Joint__Group_2_0_0__1
            {
            pushFollow(FOLLOW_50);
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
    // InternalMyDsl.g:4654:1: rule__Joint__Group_2_0_0__0__Impl : ( 'def' ) ;
    public final void rule__Joint__Group_2_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4658:1: ( ( 'def' ) )
            // InternalMyDsl.g:4659:1: ( 'def' )
            {
            // InternalMyDsl.g:4659:1: ( 'def' )
            // InternalMyDsl.g:4660:2: 'def'
            {
             before(grammarAccess.getJointAccess().getDefKeyword_2_0_0_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalMyDsl.g:4669:1: rule__Joint__Group_2_0_0__1 : rule__Joint__Group_2_0_0__1__Impl rule__Joint__Group_2_0_0__2 ;
    public final void rule__Joint__Group_2_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4673:1: ( rule__Joint__Group_2_0_0__1__Impl rule__Joint__Group_2_0_0__2 )
            // InternalMyDsl.g:4674:2: rule__Joint__Group_2_0_0__1__Impl rule__Joint__Group_2_0_0__2
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
    // InternalMyDsl.g:4681:1: rule__Joint__Group_2_0_0__1__Impl : ( 'ChildOf' ) ;
    public final void rule__Joint__Group_2_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4685:1: ( ( 'ChildOf' ) )
            // InternalMyDsl.g:4686:1: ( 'ChildOf' )
            {
            // InternalMyDsl.g:4686:1: ( 'ChildOf' )
            // InternalMyDsl.g:4687:2: 'ChildOf'
            {
             before(grammarAccess.getJointAccess().getChildOfKeyword_2_0_0_1()); 
            match(input,61,FOLLOW_2); 
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
    // InternalMyDsl.g:4696:1: rule__Joint__Group_2_0_0__2 : rule__Joint__Group_2_0_0__2__Impl rule__Joint__Group_2_0_0__3 ;
    public final void rule__Joint__Group_2_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4700:1: ( rule__Joint__Group_2_0_0__2__Impl rule__Joint__Group_2_0_0__3 )
            // InternalMyDsl.g:4701:2: rule__Joint__Group_2_0_0__2__Impl rule__Joint__Group_2_0_0__3
            {
            pushFollow(FOLLOW_51);
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
    // InternalMyDsl.g:4708:1: rule__Joint__Group_2_0_0__2__Impl : ( ( rule__Joint__ChildOfAssignment_2_0_0_2 ) ) ;
    public final void rule__Joint__Group_2_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4712:1: ( ( ( rule__Joint__ChildOfAssignment_2_0_0_2 ) ) )
            // InternalMyDsl.g:4713:1: ( ( rule__Joint__ChildOfAssignment_2_0_0_2 ) )
            {
            // InternalMyDsl.g:4713:1: ( ( rule__Joint__ChildOfAssignment_2_0_0_2 ) )
            // InternalMyDsl.g:4714:2: ( rule__Joint__ChildOfAssignment_2_0_0_2 )
            {
             before(grammarAccess.getJointAccess().getChildOfAssignment_2_0_0_2()); 
            // InternalMyDsl.g:4715:2: ( rule__Joint__ChildOfAssignment_2_0_0_2 )
            // InternalMyDsl.g:4715:3: rule__Joint__ChildOfAssignment_2_0_0_2
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
    // InternalMyDsl.g:4723:1: rule__Joint__Group_2_0_0__3 : rule__Joint__Group_2_0_0__3__Impl rule__Joint__Group_2_0_0__4 ;
    public final void rule__Joint__Group_2_0_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4727:1: ( rule__Joint__Group_2_0_0__3__Impl rule__Joint__Group_2_0_0__4 )
            // InternalMyDsl.g:4728:2: rule__Joint__Group_2_0_0__3__Impl rule__Joint__Group_2_0_0__4
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
    // InternalMyDsl.g:4735:1: rule__Joint__Group_2_0_0__3__Impl : ( 'ParentOf' ) ;
    public final void rule__Joint__Group_2_0_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4739:1: ( ( 'ParentOf' ) )
            // InternalMyDsl.g:4740:1: ( 'ParentOf' )
            {
            // InternalMyDsl.g:4740:1: ( 'ParentOf' )
            // InternalMyDsl.g:4741:2: 'ParentOf'
            {
             before(grammarAccess.getJointAccess().getParentOfKeyword_2_0_0_3()); 
            match(input,62,FOLLOW_2); 
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
    // InternalMyDsl.g:4750:1: rule__Joint__Group_2_0_0__4 : rule__Joint__Group_2_0_0__4__Impl rule__Joint__Group_2_0_0__5 ;
    public final void rule__Joint__Group_2_0_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4754:1: ( rule__Joint__Group_2_0_0__4__Impl rule__Joint__Group_2_0_0__5 )
            // InternalMyDsl.g:4755:2: rule__Joint__Group_2_0_0__4__Impl rule__Joint__Group_2_0_0__5
            {
            pushFollow(FOLLOW_52);
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
    // InternalMyDsl.g:4762:1: rule__Joint__Group_2_0_0__4__Impl : ( ( rule__Joint__ParentOfAssignment_2_0_0_4 ) ) ;
    public final void rule__Joint__Group_2_0_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4766:1: ( ( ( rule__Joint__ParentOfAssignment_2_0_0_4 ) ) )
            // InternalMyDsl.g:4767:1: ( ( rule__Joint__ParentOfAssignment_2_0_0_4 ) )
            {
            // InternalMyDsl.g:4767:1: ( ( rule__Joint__ParentOfAssignment_2_0_0_4 ) )
            // InternalMyDsl.g:4768:2: ( rule__Joint__ParentOfAssignment_2_0_0_4 )
            {
             before(grammarAccess.getJointAccess().getParentOfAssignment_2_0_0_4()); 
            // InternalMyDsl.g:4769:2: ( rule__Joint__ParentOfAssignment_2_0_0_4 )
            // InternalMyDsl.g:4769:3: rule__Joint__ParentOfAssignment_2_0_0_4
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
    // InternalMyDsl.g:4777:1: rule__Joint__Group_2_0_0__5 : rule__Joint__Group_2_0_0__5__Impl rule__Joint__Group_2_0_0__6 ;
    public final void rule__Joint__Group_2_0_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4781:1: ( rule__Joint__Group_2_0_0__5__Impl rule__Joint__Group_2_0_0__6 )
            // InternalMyDsl.g:4782:2: rule__Joint__Group_2_0_0__5__Impl rule__Joint__Group_2_0_0__6
            {
            pushFollow(FOLLOW_53);
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
    // InternalMyDsl.g:4789:1: rule__Joint__Group_2_0_0__5__Impl : ( 'Type' ) ;
    public final void rule__Joint__Group_2_0_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4793:1: ( ( 'Type' ) )
            // InternalMyDsl.g:4794:1: ( 'Type' )
            {
            // InternalMyDsl.g:4794:1: ( 'Type' )
            // InternalMyDsl.g:4795:2: 'Type'
            {
             before(grammarAccess.getJointAccess().getTypeKeyword_2_0_0_5()); 
            match(input,63,FOLLOW_2); 
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
    // InternalMyDsl.g:4804:1: rule__Joint__Group_2_0_0__6 : rule__Joint__Group_2_0_0__6__Impl ;
    public final void rule__Joint__Group_2_0_0__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4808:1: ( rule__Joint__Group_2_0_0__6__Impl )
            // InternalMyDsl.g:4809:2: rule__Joint__Group_2_0_0__6__Impl
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
    // InternalMyDsl.g:4815:1: rule__Joint__Group_2_0_0__6__Impl : ( ( rule__Joint__TypeAssignment_2_0_0_6 ) ) ;
    public final void rule__Joint__Group_2_0_0__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4819:1: ( ( ( rule__Joint__TypeAssignment_2_0_0_6 ) ) )
            // InternalMyDsl.g:4820:1: ( ( rule__Joint__TypeAssignment_2_0_0_6 ) )
            {
            // InternalMyDsl.g:4820:1: ( ( rule__Joint__TypeAssignment_2_0_0_6 ) )
            // InternalMyDsl.g:4821:2: ( rule__Joint__TypeAssignment_2_0_0_6 )
            {
             before(grammarAccess.getJointAccess().getTypeAssignment_2_0_0_6()); 
            // InternalMyDsl.g:4822:2: ( rule__Joint__TypeAssignment_2_0_0_6 )
            // InternalMyDsl.g:4822:3: rule__Joint__TypeAssignment_2_0_0_6
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
    // InternalMyDsl.g:4831:1: rule__Joint__Group_2_1__0 : rule__Joint__Group_2_1__0__Impl rule__Joint__Group_2_1__1 ;
    public final void rule__Joint__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4835:1: ( rule__Joint__Group_2_1__0__Impl rule__Joint__Group_2_1__1 )
            // InternalMyDsl.g:4836:2: rule__Joint__Group_2_1__0__Impl rule__Joint__Group_2_1__1
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
    // InternalMyDsl.g:4843:1: rule__Joint__Group_2_1__0__Impl : ( 'reuse' ) ;
    public final void rule__Joint__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4847:1: ( ( 'reuse' ) )
            // InternalMyDsl.g:4848:1: ( 'reuse' )
            {
            // InternalMyDsl.g:4848:1: ( 'reuse' )
            // InternalMyDsl.g:4849:2: 'reuse'
            {
             before(grammarAccess.getJointAccess().getReuseKeyword_2_1_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalMyDsl.g:4858:1: rule__Joint__Group_2_1__1 : rule__Joint__Group_2_1__1__Impl rule__Joint__Group_2_1__2 ;
    public final void rule__Joint__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4862:1: ( rule__Joint__Group_2_1__1__Impl rule__Joint__Group_2_1__2 )
            // InternalMyDsl.g:4863:2: rule__Joint__Group_2_1__1__Impl rule__Joint__Group_2_1__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:4870:1: rule__Joint__Group_2_1__1__Impl : ( ( rule__Joint__IsReuseOfAssignment_2_1_1 ) ) ;
    public final void rule__Joint__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4874:1: ( ( ( rule__Joint__IsReuseOfAssignment_2_1_1 ) ) )
            // InternalMyDsl.g:4875:1: ( ( rule__Joint__IsReuseOfAssignment_2_1_1 ) )
            {
            // InternalMyDsl.g:4875:1: ( ( rule__Joint__IsReuseOfAssignment_2_1_1 ) )
            // InternalMyDsl.g:4876:2: ( rule__Joint__IsReuseOfAssignment_2_1_1 )
            {
             before(grammarAccess.getJointAccess().getIsReuseOfAssignment_2_1_1()); 
            // InternalMyDsl.g:4877:2: ( rule__Joint__IsReuseOfAssignment_2_1_1 )
            // InternalMyDsl.g:4877:3: rule__Joint__IsReuseOfAssignment_2_1_1
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
    // InternalMyDsl.g:4885:1: rule__Joint__Group_2_1__2 : rule__Joint__Group_2_1__2__Impl ;
    public final void rule__Joint__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4889:1: ( rule__Joint__Group_2_1__2__Impl )
            // InternalMyDsl.g:4890:2: rule__Joint__Group_2_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Joint__Group_2_1__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalMyDsl.g:4896:1: rule__Joint__Group_2_1__2__Impl : ( ( rule__Joint__ReuseAssignment_2_1_2 ) ) ;
    public final void rule__Joint__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4900:1: ( ( ( rule__Joint__ReuseAssignment_2_1_2 ) ) )
            // InternalMyDsl.g:4901:1: ( ( rule__Joint__ReuseAssignment_2_1_2 ) )
            {
            // InternalMyDsl.g:4901:1: ( ( rule__Joint__ReuseAssignment_2_1_2 ) )
            // InternalMyDsl.g:4902:2: ( rule__Joint__ReuseAssignment_2_1_2 )
            {
             before(grammarAccess.getJointAccess().getReuseAssignment_2_1_2()); 
            // InternalMyDsl.g:4903:2: ( rule__Joint__ReuseAssignment_2_1_2 )
            // InternalMyDsl.g:4903:3: rule__Joint__ReuseAssignment_2_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Joint__ReuseAssignment_2_1_2();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getReuseAssignment_2_1_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Axis__Group__0"
    // InternalMyDsl.g:4912:1: rule__Axis__Group__0 : rule__Axis__Group__0__Impl rule__Axis__Group__1 ;
    public final void rule__Axis__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4916:1: ( rule__Axis__Group__0__Impl rule__Axis__Group__1 )
            // InternalMyDsl.g:4917:2: rule__Axis__Group__0__Impl rule__Axis__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalMyDsl.g:4924:1: rule__Axis__Group__0__Impl : ( 'Axis' ) ;
    public final void rule__Axis__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4928:1: ( ( 'Axis' ) )
            // InternalMyDsl.g:4929:1: ( 'Axis' )
            {
            // InternalMyDsl.g:4929:1: ( 'Axis' )
            // InternalMyDsl.g:4930:2: 'Axis'
            {
             before(grammarAccess.getAxisAccess().getAxisKeyword_0()); 
            match(input,64,FOLLOW_2); 
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
    // InternalMyDsl.g:4939:1: rule__Axis__Group__1 : rule__Axis__Group__1__Impl rule__Axis__Group__2 ;
    public final void rule__Axis__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4943:1: ( rule__Axis__Group__1__Impl rule__Axis__Group__2 )
            // InternalMyDsl.g:4944:2: rule__Axis__Group__1__Impl rule__Axis__Group__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalMyDsl.g:4951:1: rule__Axis__Group__1__Impl : ( ( rule__Axis__NameAssignment_1 )? ) ;
    public final void rule__Axis__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4955:1: ( ( ( rule__Axis__NameAssignment_1 )? ) )
            // InternalMyDsl.g:4956:1: ( ( rule__Axis__NameAssignment_1 )? )
            {
            // InternalMyDsl.g:4956:1: ( ( rule__Axis__NameAssignment_1 )? )
            // InternalMyDsl.g:4957:2: ( rule__Axis__NameAssignment_1 )?
            {
             before(grammarAccess.getAxisAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:4958:2: ( rule__Axis__NameAssignment_1 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_ID) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalMyDsl.g:4958:3: rule__Axis__NameAssignment_1
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
    // InternalMyDsl.g:4966:1: rule__Axis__Group__2 : rule__Axis__Group__2__Impl rule__Axis__Group__3 ;
    public final void rule__Axis__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4970:1: ( rule__Axis__Group__2__Impl rule__Axis__Group__3 )
            // InternalMyDsl.g:4971:2: rule__Axis__Group__2__Impl rule__Axis__Group__3
            {
            pushFollow(FOLLOW_44);
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
    // InternalMyDsl.g:4978:1: rule__Axis__Group__2__Impl : ( 'x' ) ;
    public final void rule__Axis__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4982:1: ( ( 'x' ) )
            // InternalMyDsl.g:4983:1: ( 'x' )
            {
            // InternalMyDsl.g:4983:1: ( 'x' )
            // InternalMyDsl.g:4984:2: 'x'
            {
             before(grammarAccess.getAxisAccess().getXKeyword_2()); 
            match(input,36,FOLLOW_2); 
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
    // InternalMyDsl.g:4993:1: rule__Axis__Group__3 : rule__Axis__Group__3__Impl rule__Axis__Group__4 ;
    public final void rule__Axis__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4997:1: ( rule__Axis__Group__3__Impl rule__Axis__Group__4 )
            // InternalMyDsl.g:4998:2: rule__Axis__Group__3__Impl rule__Axis__Group__4
            {
            pushFollow(FOLLOW_31);
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
    // InternalMyDsl.g:5005:1: rule__Axis__Group__3__Impl : ( ( rule__Axis__XAssignment_3 ) ) ;
    public final void rule__Axis__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5009:1: ( ( ( rule__Axis__XAssignment_3 ) ) )
            // InternalMyDsl.g:5010:1: ( ( rule__Axis__XAssignment_3 ) )
            {
            // InternalMyDsl.g:5010:1: ( ( rule__Axis__XAssignment_3 ) )
            // InternalMyDsl.g:5011:2: ( rule__Axis__XAssignment_3 )
            {
             before(grammarAccess.getAxisAccess().getXAssignment_3()); 
            // InternalMyDsl.g:5012:2: ( rule__Axis__XAssignment_3 )
            // InternalMyDsl.g:5012:3: rule__Axis__XAssignment_3
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
    // InternalMyDsl.g:5020:1: rule__Axis__Group__4 : rule__Axis__Group__4__Impl rule__Axis__Group__5 ;
    public final void rule__Axis__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5024:1: ( rule__Axis__Group__4__Impl rule__Axis__Group__5 )
            // InternalMyDsl.g:5025:2: rule__Axis__Group__4__Impl rule__Axis__Group__5
            {
            pushFollow(FOLLOW_44);
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
    // InternalMyDsl.g:5032:1: rule__Axis__Group__4__Impl : ( 'y' ) ;
    public final void rule__Axis__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5036:1: ( ( 'y' ) )
            // InternalMyDsl.g:5037:1: ( 'y' )
            {
            // InternalMyDsl.g:5037:1: ( 'y' )
            // InternalMyDsl.g:5038:2: 'y'
            {
             before(grammarAccess.getAxisAccess().getYKeyword_4()); 
            match(input,37,FOLLOW_2); 
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
    // InternalMyDsl.g:5047:1: rule__Axis__Group__5 : rule__Axis__Group__5__Impl rule__Axis__Group__6 ;
    public final void rule__Axis__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5051:1: ( rule__Axis__Group__5__Impl rule__Axis__Group__6 )
            // InternalMyDsl.g:5052:2: rule__Axis__Group__5__Impl rule__Axis__Group__6
            {
            pushFollow(FOLLOW_32);
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
    // InternalMyDsl.g:5059:1: rule__Axis__Group__5__Impl : ( ( rule__Axis__YAssignment_5 ) ) ;
    public final void rule__Axis__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5063:1: ( ( ( rule__Axis__YAssignment_5 ) ) )
            // InternalMyDsl.g:5064:1: ( ( rule__Axis__YAssignment_5 ) )
            {
            // InternalMyDsl.g:5064:1: ( ( rule__Axis__YAssignment_5 ) )
            // InternalMyDsl.g:5065:2: ( rule__Axis__YAssignment_5 )
            {
             before(grammarAccess.getAxisAccess().getYAssignment_5()); 
            // InternalMyDsl.g:5066:2: ( rule__Axis__YAssignment_5 )
            // InternalMyDsl.g:5066:3: rule__Axis__YAssignment_5
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
    // InternalMyDsl.g:5074:1: rule__Axis__Group__6 : rule__Axis__Group__6__Impl rule__Axis__Group__7 ;
    public final void rule__Axis__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5078:1: ( rule__Axis__Group__6__Impl rule__Axis__Group__7 )
            // InternalMyDsl.g:5079:2: rule__Axis__Group__6__Impl rule__Axis__Group__7
            {
            pushFollow(FOLLOW_44);
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
    // InternalMyDsl.g:5086:1: rule__Axis__Group__6__Impl : ( 'z' ) ;
    public final void rule__Axis__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5090:1: ( ( 'z' ) )
            // InternalMyDsl.g:5091:1: ( 'z' )
            {
            // InternalMyDsl.g:5091:1: ( 'z' )
            // InternalMyDsl.g:5092:2: 'z'
            {
             before(grammarAccess.getAxisAccess().getZKeyword_6()); 
            match(input,38,FOLLOW_2); 
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
    // InternalMyDsl.g:5101:1: rule__Axis__Group__7 : rule__Axis__Group__7__Impl ;
    public final void rule__Axis__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5105:1: ( rule__Axis__Group__7__Impl )
            // InternalMyDsl.g:5106:2: rule__Axis__Group__7__Impl
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
    // InternalMyDsl.g:5112:1: rule__Axis__Group__7__Impl : ( ( rule__Axis__ZAssignment_7 ) ) ;
    public final void rule__Axis__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5116:1: ( ( ( rule__Axis__ZAssignment_7 ) ) )
            // InternalMyDsl.g:5117:1: ( ( rule__Axis__ZAssignment_7 ) )
            {
            // InternalMyDsl.g:5117:1: ( ( rule__Axis__ZAssignment_7 ) )
            // InternalMyDsl.g:5118:2: ( rule__Axis__ZAssignment_7 )
            {
             before(grammarAccess.getAxisAccess().getZAssignment_7()); 
            // InternalMyDsl.g:5119:2: ( rule__Axis__ZAssignment_7 )
            // InternalMyDsl.g:5119:3: rule__Axis__ZAssignment_7
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
    // InternalMyDsl.g:5128:1: rule__Limit__Group__0 : rule__Limit__Group__0__Impl rule__Limit__Group__1 ;
    public final void rule__Limit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5132:1: ( rule__Limit__Group__0__Impl rule__Limit__Group__1 )
            // InternalMyDsl.g:5133:2: rule__Limit__Group__0__Impl rule__Limit__Group__1
            {
            pushFollow(FOLLOW_54);
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
    // InternalMyDsl.g:5140:1: rule__Limit__Group__0__Impl : ( 'Limit' ) ;
    public final void rule__Limit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5144:1: ( ( 'Limit' ) )
            // InternalMyDsl.g:5145:1: ( 'Limit' )
            {
            // InternalMyDsl.g:5145:1: ( 'Limit' )
            // InternalMyDsl.g:5146:2: 'Limit'
            {
             before(grammarAccess.getLimitAccess().getLimitKeyword_0()); 
            match(input,65,FOLLOW_2); 
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
    // InternalMyDsl.g:5155:1: rule__Limit__Group__1 : rule__Limit__Group__1__Impl rule__Limit__Group__2 ;
    public final void rule__Limit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5159:1: ( rule__Limit__Group__1__Impl rule__Limit__Group__2 )
            // InternalMyDsl.g:5160:2: rule__Limit__Group__1__Impl rule__Limit__Group__2
            {
            pushFollow(FOLLOW_54);
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
    // InternalMyDsl.g:5167:1: rule__Limit__Group__1__Impl : ( ( rule__Limit__NameAssignment_1 )? ) ;
    public final void rule__Limit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5171:1: ( ( ( rule__Limit__NameAssignment_1 )? ) )
            // InternalMyDsl.g:5172:1: ( ( rule__Limit__NameAssignment_1 )? )
            {
            // InternalMyDsl.g:5172:1: ( ( rule__Limit__NameAssignment_1 )? )
            // InternalMyDsl.g:5173:2: ( rule__Limit__NameAssignment_1 )?
            {
             before(grammarAccess.getLimitAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:5174:2: ( rule__Limit__NameAssignment_1 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_ID) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalMyDsl.g:5174:3: rule__Limit__NameAssignment_1
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
    // InternalMyDsl.g:5182:1: rule__Limit__Group__2 : rule__Limit__Group__2__Impl rule__Limit__Group__3 ;
    public final void rule__Limit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5186:1: ( rule__Limit__Group__2__Impl rule__Limit__Group__3 )
            // InternalMyDsl.g:5187:2: rule__Limit__Group__2__Impl rule__Limit__Group__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyDsl.g:5194:1: rule__Limit__Group__2__Impl : ( 'effort' ) ;
    public final void rule__Limit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5198:1: ( ( 'effort' ) )
            // InternalMyDsl.g:5199:1: ( 'effort' )
            {
            // InternalMyDsl.g:5199:1: ( 'effort' )
            // InternalMyDsl.g:5200:2: 'effort'
            {
             before(grammarAccess.getLimitAccess().getEffortKeyword_2()); 
            match(input,66,FOLLOW_2); 
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
    // InternalMyDsl.g:5209:1: rule__Limit__Group__3 : rule__Limit__Group__3__Impl rule__Limit__Group__4 ;
    public final void rule__Limit__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5213:1: ( rule__Limit__Group__3__Impl rule__Limit__Group__4 )
            // InternalMyDsl.g:5214:2: rule__Limit__Group__3__Impl rule__Limit__Group__4
            {
            pushFollow(FOLLOW_55);
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
    // InternalMyDsl.g:5221:1: rule__Limit__Group__3__Impl : ( ( rule__Limit__EffortAssignment_3 ) ) ;
    public final void rule__Limit__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5225:1: ( ( ( rule__Limit__EffortAssignment_3 ) ) )
            // InternalMyDsl.g:5226:1: ( ( rule__Limit__EffortAssignment_3 ) )
            {
            // InternalMyDsl.g:5226:1: ( ( rule__Limit__EffortAssignment_3 ) )
            // InternalMyDsl.g:5227:2: ( rule__Limit__EffortAssignment_3 )
            {
             before(grammarAccess.getLimitAccess().getEffortAssignment_3()); 
            // InternalMyDsl.g:5228:2: ( rule__Limit__EffortAssignment_3 )
            // InternalMyDsl.g:5228:3: rule__Limit__EffortAssignment_3
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
    // InternalMyDsl.g:5236:1: rule__Limit__Group__4 : rule__Limit__Group__4__Impl rule__Limit__Group__5 ;
    public final void rule__Limit__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5240:1: ( rule__Limit__Group__4__Impl rule__Limit__Group__5 )
            // InternalMyDsl.g:5241:2: rule__Limit__Group__4__Impl rule__Limit__Group__5
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyDsl.g:5248:1: rule__Limit__Group__4__Impl : ( 'velocity' ) ;
    public final void rule__Limit__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5252:1: ( ( 'velocity' ) )
            // InternalMyDsl.g:5253:1: ( 'velocity' )
            {
            // InternalMyDsl.g:5253:1: ( 'velocity' )
            // InternalMyDsl.g:5254:2: 'velocity'
            {
             before(grammarAccess.getLimitAccess().getVelocityKeyword_4()); 
            match(input,67,FOLLOW_2); 
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
    // InternalMyDsl.g:5263:1: rule__Limit__Group__5 : rule__Limit__Group__5__Impl rule__Limit__Group__6 ;
    public final void rule__Limit__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5267:1: ( rule__Limit__Group__5__Impl rule__Limit__Group__6 )
            // InternalMyDsl.g:5268:2: rule__Limit__Group__5__Impl rule__Limit__Group__6
            {
            pushFollow(FOLLOW_56);
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
    // InternalMyDsl.g:5275:1: rule__Limit__Group__5__Impl : ( ( rule__Limit__VelocityAssignment_5 ) ) ;
    public final void rule__Limit__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5279:1: ( ( ( rule__Limit__VelocityAssignment_5 ) ) )
            // InternalMyDsl.g:5280:1: ( ( rule__Limit__VelocityAssignment_5 ) )
            {
            // InternalMyDsl.g:5280:1: ( ( rule__Limit__VelocityAssignment_5 ) )
            // InternalMyDsl.g:5281:2: ( rule__Limit__VelocityAssignment_5 )
            {
             before(grammarAccess.getLimitAccess().getVelocityAssignment_5()); 
            // InternalMyDsl.g:5282:2: ( rule__Limit__VelocityAssignment_5 )
            // InternalMyDsl.g:5282:3: rule__Limit__VelocityAssignment_5
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
    // InternalMyDsl.g:5290:1: rule__Limit__Group__6 : rule__Limit__Group__6__Impl rule__Limit__Group__7 ;
    public final void rule__Limit__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5294:1: ( rule__Limit__Group__6__Impl rule__Limit__Group__7 )
            // InternalMyDsl.g:5295:2: rule__Limit__Group__6__Impl rule__Limit__Group__7
            {
            pushFollow(FOLLOW_57);
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
    // InternalMyDsl.g:5302:1: rule__Limit__Group__6__Impl : ( 'lower' ) ;
    public final void rule__Limit__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5306:1: ( ( 'lower' ) )
            // InternalMyDsl.g:5307:1: ( 'lower' )
            {
            // InternalMyDsl.g:5307:1: ( 'lower' )
            // InternalMyDsl.g:5308:2: 'lower'
            {
             before(grammarAccess.getLimitAccess().getLowerKeyword_6()); 
            match(input,68,FOLLOW_2); 
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
    // InternalMyDsl.g:5317:1: rule__Limit__Group__7 : rule__Limit__Group__7__Impl rule__Limit__Group__8 ;
    public final void rule__Limit__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5321:1: ( rule__Limit__Group__7__Impl rule__Limit__Group__8 )
            // InternalMyDsl.g:5322:2: rule__Limit__Group__7__Impl rule__Limit__Group__8
            {
            pushFollow(FOLLOW_57);
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
    // InternalMyDsl.g:5329:1: rule__Limit__Group__7__Impl : ( ( rule__Limit__LowerAssignment_7 )? ) ;
    public final void rule__Limit__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5333:1: ( ( ( rule__Limit__LowerAssignment_7 )? ) )
            // InternalMyDsl.g:5334:1: ( ( rule__Limit__LowerAssignment_7 )? )
            {
            // InternalMyDsl.g:5334:1: ( ( rule__Limit__LowerAssignment_7 )? )
            // InternalMyDsl.g:5335:2: ( rule__Limit__LowerAssignment_7 )?
            {
             before(grammarAccess.getLimitAccess().getLowerAssignment_7()); 
            // InternalMyDsl.g:5336:2: ( rule__Limit__LowerAssignment_7 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_INT||LA43_0==12) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalMyDsl.g:5336:3: rule__Limit__LowerAssignment_7
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
    // InternalMyDsl.g:5344:1: rule__Limit__Group__8 : rule__Limit__Group__8__Impl rule__Limit__Group__9 ;
    public final void rule__Limit__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5348:1: ( rule__Limit__Group__8__Impl rule__Limit__Group__9 )
            // InternalMyDsl.g:5349:2: rule__Limit__Group__8__Impl rule__Limit__Group__9
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyDsl.g:5356:1: rule__Limit__Group__8__Impl : ( 'upper' ) ;
    public final void rule__Limit__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5360:1: ( ( 'upper' ) )
            // InternalMyDsl.g:5361:1: ( 'upper' )
            {
            // InternalMyDsl.g:5361:1: ( 'upper' )
            // InternalMyDsl.g:5362:2: 'upper'
            {
             before(grammarAccess.getLimitAccess().getUpperKeyword_8()); 
            match(input,69,FOLLOW_2); 
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
    // InternalMyDsl.g:5371:1: rule__Limit__Group__9 : rule__Limit__Group__9__Impl ;
    public final void rule__Limit__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5375:1: ( rule__Limit__Group__9__Impl )
            // InternalMyDsl.g:5376:2: rule__Limit__Group__9__Impl
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
    // InternalMyDsl.g:5382:1: rule__Limit__Group__9__Impl : ( ( rule__Limit__UpperAssignment_9 )? ) ;
    public final void rule__Limit__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5386:1: ( ( ( rule__Limit__UpperAssignment_9 )? ) )
            // InternalMyDsl.g:5387:1: ( ( rule__Limit__UpperAssignment_9 )? )
            {
            // InternalMyDsl.g:5387:1: ( ( rule__Limit__UpperAssignment_9 )? )
            // InternalMyDsl.g:5388:2: ( rule__Limit__UpperAssignment_9 )?
            {
             before(grammarAccess.getLimitAccess().getUpperAssignment_9()); 
            // InternalMyDsl.g:5389:2: ( rule__Limit__UpperAssignment_9 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_INT||LA44_0==12) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalMyDsl.g:5389:3: rule__Limit__UpperAssignment_9
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
    // InternalMyDsl.g:5398:1: rule__Calibration__Group__0 : rule__Calibration__Group__0__Impl rule__Calibration__Group__1 ;
    public final void rule__Calibration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5402:1: ( rule__Calibration__Group__0__Impl rule__Calibration__Group__1 )
            // InternalMyDsl.g:5403:2: rule__Calibration__Group__0__Impl rule__Calibration__Group__1
            {
            pushFollow(FOLLOW_58);
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
    // InternalMyDsl.g:5410:1: rule__Calibration__Group__0__Impl : ( () ) ;
    public final void rule__Calibration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5414:1: ( ( () ) )
            // InternalMyDsl.g:5415:1: ( () )
            {
            // InternalMyDsl.g:5415:1: ( () )
            // InternalMyDsl.g:5416:2: ()
            {
             before(grammarAccess.getCalibrationAccess().getCalibrationAction_0()); 
            // InternalMyDsl.g:5417:2: ()
            // InternalMyDsl.g:5417:3: 
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
    // InternalMyDsl.g:5425:1: rule__Calibration__Group__1 : rule__Calibration__Group__1__Impl rule__Calibration__Group__2 ;
    public final void rule__Calibration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5429:1: ( rule__Calibration__Group__1__Impl rule__Calibration__Group__2 )
            // InternalMyDsl.g:5430:2: rule__Calibration__Group__1__Impl rule__Calibration__Group__2
            {
            pushFollow(FOLLOW_59);
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
    // InternalMyDsl.g:5437:1: rule__Calibration__Group__1__Impl : ( 'Calibration' ) ;
    public final void rule__Calibration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5441:1: ( ( 'Calibration' ) )
            // InternalMyDsl.g:5442:1: ( 'Calibration' )
            {
            // InternalMyDsl.g:5442:1: ( 'Calibration' )
            // InternalMyDsl.g:5443:2: 'Calibration'
            {
             before(grammarAccess.getCalibrationAccess().getCalibrationKeyword_1()); 
            match(input,70,FOLLOW_2); 
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
    // InternalMyDsl.g:5452:1: rule__Calibration__Group__2 : rule__Calibration__Group__2__Impl rule__Calibration__Group__3 ;
    public final void rule__Calibration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5456:1: ( rule__Calibration__Group__2__Impl rule__Calibration__Group__3 )
            // InternalMyDsl.g:5457:2: rule__Calibration__Group__2__Impl rule__Calibration__Group__3
            {
            pushFollow(FOLLOW_59);
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
    // InternalMyDsl.g:5464:1: rule__Calibration__Group__2__Impl : ( ( rule__Calibration__NameAssignment_2 )? ) ;
    public final void rule__Calibration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5468:1: ( ( ( rule__Calibration__NameAssignment_2 )? ) )
            // InternalMyDsl.g:5469:1: ( ( rule__Calibration__NameAssignment_2 )? )
            {
            // InternalMyDsl.g:5469:1: ( ( rule__Calibration__NameAssignment_2 )? )
            // InternalMyDsl.g:5470:2: ( rule__Calibration__NameAssignment_2 )?
            {
             before(grammarAccess.getCalibrationAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:5471:2: ( rule__Calibration__NameAssignment_2 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_ID) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalMyDsl.g:5471:3: rule__Calibration__NameAssignment_2
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
    // InternalMyDsl.g:5479:1: rule__Calibration__Group__3 : rule__Calibration__Group__3__Impl rule__Calibration__Group__4 ;
    public final void rule__Calibration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5483:1: ( rule__Calibration__Group__3__Impl rule__Calibration__Group__4 )
            // InternalMyDsl.g:5484:2: rule__Calibration__Group__3__Impl rule__Calibration__Group__4
            {
            pushFollow(FOLLOW_59);
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
    // InternalMyDsl.g:5491:1: rule__Calibration__Group__3__Impl : ( ( rule__Calibration__Group_3__0 )? ) ;
    public final void rule__Calibration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5495:1: ( ( ( rule__Calibration__Group_3__0 )? ) )
            // InternalMyDsl.g:5496:1: ( ( rule__Calibration__Group_3__0 )? )
            {
            // InternalMyDsl.g:5496:1: ( ( rule__Calibration__Group_3__0 )? )
            // InternalMyDsl.g:5497:2: ( rule__Calibration__Group_3__0 )?
            {
             before(grammarAccess.getCalibrationAccess().getGroup_3()); 
            // InternalMyDsl.g:5498:2: ( rule__Calibration__Group_3__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==71) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalMyDsl.g:5498:3: rule__Calibration__Group_3__0
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
    // InternalMyDsl.g:5506:1: rule__Calibration__Group__4 : rule__Calibration__Group__4__Impl ;
    public final void rule__Calibration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5510:1: ( rule__Calibration__Group__4__Impl )
            // InternalMyDsl.g:5511:2: rule__Calibration__Group__4__Impl
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
    // InternalMyDsl.g:5517:1: rule__Calibration__Group__4__Impl : ( ( rule__Calibration__Group_4__0 )? ) ;
    public final void rule__Calibration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5521:1: ( ( ( rule__Calibration__Group_4__0 )? ) )
            // InternalMyDsl.g:5522:1: ( ( rule__Calibration__Group_4__0 )? )
            {
            // InternalMyDsl.g:5522:1: ( ( rule__Calibration__Group_4__0 )? )
            // InternalMyDsl.g:5523:2: ( rule__Calibration__Group_4__0 )?
            {
             before(grammarAccess.getCalibrationAccess().getGroup_4()); 
            // InternalMyDsl.g:5524:2: ( rule__Calibration__Group_4__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==72) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalMyDsl.g:5524:3: rule__Calibration__Group_4__0
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
    // InternalMyDsl.g:5533:1: rule__Calibration__Group_3__0 : rule__Calibration__Group_3__0__Impl rule__Calibration__Group_3__1 ;
    public final void rule__Calibration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5537:1: ( rule__Calibration__Group_3__0__Impl rule__Calibration__Group_3__1 )
            // InternalMyDsl.g:5538:2: rule__Calibration__Group_3__0__Impl rule__Calibration__Group_3__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyDsl.g:5545:1: rule__Calibration__Group_3__0__Impl : ( 'rising' ) ;
    public final void rule__Calibration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5549:1: ( ( 'rising' ) )
            // InternalMyDsl.g:5550:1: ( 'rising' )
            {
            // InternalMyDsl.g:5550:1: ( 'rising' )
            // InternalMyDsl.g:5551:2: 'rising'
            {
             before(grammarAccess.getCalibrationAccess().getRisingKeyword_3_0()); 
            match(input,71,FOLLOW_2); 
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
    // InternalMyDsl.g:5560:1: rule__Calibration__Group_3__1 : rule__Calibration__Group_3__1__Impl ;
    public final void rule__Calibration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5564:1: ( rule__Calibration__Group_3__1__Impl )
            // InternalMyDsl.g:5565:2: rule__Calibration__Group_3__1__Impl
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
    // InternalMyDsl.g:5571:1: rule__Calibration__Group_3__1__Impl : ( ( rule__Calibration__RisingAssignment_3_1 ) ) ;
    public final void rule__Calibration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5575:1: ( ( ( rule__Calibration__RisingAssignment_3_1 ) ) )
            // InternalMyDsl.g:5576:1: ( ( rule__Calibration__RisingAssignment_3_1 ) )
            {
            // InternalMyDsl.g:5576:1: ( ( rule__Calibration__RisingAssignment_3_1 ) )
            // InternalMyDsl.g:5577:2: ( rule__Calibration__RisingAssignment_3_1 )
            {
             before(grammarAccess.getCalibrationAccess().getRisingAssignment_3_1()); 
            // InternalMyDsl.g:5578:2: ( rule__Calibration__RisingAssignment_3_1 )
            // InternalMyDsl.g:5578:3: rule__Calibration__RisingAssignment_3_1
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
    // InternalMyDsl.g:5587:1: rule__Calibration__Group_4__0 : rule__Calibration__Group_4__0__Impl rule__Calibration__Group_4__1 ;
    public final void rule__Calibration__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5591:1: ( rule__Calibration__Group_4__0__Impl rule__Calibration__Group_4__1 )
            // InternalMyDsl.g:5592:2: rule__Calibration__Group_4__0__Impl rule__Calibration__Group_4__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyDsl.g:5599:1: rule__Calibration__Group_4__0__Impl : ( 'falling' ) ;
    public final void rule__Calibration__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5603:1: ( ( 'falling' ) )
            // InternalMyDsl.g:5604:1: ( 'falling' )
            {
            // InternalMyDsl.g:5604:1: ( 'falling' )
            // InternalMyDsl.g:5605:2: 'falling'
            {
             before(grammarAccess.getCalibrationAccess().getFallingKeyword_4_0()); 
            match(input,72,FOLLOW_2); 
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
    // InternalMyDsl.g:5614:1: rule__Calibration__Group_4__1 : rule__Calibration__Group_4__1__Impl ;
    public final void rule__Calibration__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5618:1: ( rule__Calibration__Group_4__1__Impl )
            // InternalMyDsl.g:5619:2: rule__Calibration__Group_4__1__Impl
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
    // InternalMyDsl.g:5625:1: rule__Calibration__Group_4__1__Impl : ( ( rule__Calibration__FallingAssignment_4_1 ) ) ;
    public final void rule__Calibration__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5629:1: ( ( ( rule__Calibration__FallingAssignment_4_1 ) ) )
            // InternalMyDsl.g:5630:1: ( ( rule__Calibration__FallingAssignment_4_1 ) )
            {
            // InternalMyDsl.g:5630:1: ( ( rule__Calibration__FallingAssignment_4_1 ) )
            // InternalMyDsl.g:5631:2: ( rule__Calibration__FallingAssignment_4_1 )
            {
             before(grammarAccess.getCalibrationAccess().getFallingAssignment_4_1()); 
            // InternalMyDsl.g:5632:2: ( rule__Calibration__FallingAssignment_4_1 )
            // InternalMyDsl.g:5632:3: rule__Calibration__FallingAssignment_4_1
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
    // InternalMyDsl.g:5641:1: rule__Dynamics__Group__0 : rule__Dynamics__Group__0__Impl rule__Dynamics__Group__1 ;
    public final void rule__Dynamics__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5645:1: ( rule__Dynamics__Group__0__Impl rule__Dynamics__Group__1 )
            // InternalMyDsl.g:5646:2: rule__Dynamics__Group__0__Impl rule__Dynamics__Group__1
            {
            pushFollow(FOLLOW_60);
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
    // InternalMyDsl.g:5653:1: rule__Dynamics__Group__0__Impl : ( () ) ;
    public final void rule__Dynamics__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5657:1: ( ( () ) )
            // InternalMyDsl.g:5658:1: ( () )
            {
            // InternalMyDsl.g:5658:1: ( () )
            // InternalMyDsl.g:5659:2: ()
            {
             before(grammarAccess.getDynamicsAccess().getDynamicsAction_0()); 
            // InternalMyDsl.g:5660:2: ()
            // InternalMyDsl.g:5660:3: 
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
    // InternalMyDsl.g:5668:1: rule__Dynamics__Group__1 : rule__Dynamics__Group__1__Impl rule__Dynamics__Group__2 ;
    public final void rule__Dynamics__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5672:1: ( rule__Dynamics__Group__1__Impl rule__Dynamics__Group__2 )
            // InternalMyDsl.g:5673:2: rule__Dynamics__Group__1__Impl rule__Dynamics__Group__2
            {
            pushFollow(FOLLOW_61);
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
    // InternalMyDsl.g:5680:1: rule__Dynamics__Group__1__Impl : ( 'Dynamics' ) ;
    public final void rule__Dynamics__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5684:1: ( ( 'Dynamics' ) )
            // InternalMyDsl.g:5685:1: ( 'Dynamics' )
            {
            // InternalMyDsl.g:5685:1: ( 'Dynamics' )
            // InternalMyDsl.g:5686:2: 'Dynamics'
            {
             before(grammarAccess.getDynamicsAccess().getDynamicsKeyword_1()); 
            match(input,73,FOLLOW_2); 
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
    // InternalMyDsl.g:5695:1: rule__Dynamics__Group__2 : rule__Dynamics__Group__2__Impl rule__Dynamics__Group__3 ;
    public final void rule__Dynamics__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5699:1: ( rule__Dynamics__Group__2__Impl rule__Dynamics__Group__3 )
            // InternalMyDsl.g:5700:2: rule__Dynamics__Group__2__Impl rule__Dynamics__Group__3
            {
            pushFollow(FOLLOW_61);
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
    // InternalMyDsl.g:5707:1: rule__Dynamics__Group__2__Impl : ( ( rule__Dynamics__NameAssignment_2 )? ) ;
    public final void rule__Dynamics__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5711:1: ( ( ( rule__Dynamics__NameAssignment_2 )? ) )
            // InternalMyDsl.g:5712:1: ( ( rule__Dynamics__NameAssignment_2 )? )
            {
            // InternalMyDsl.g:5712:1: ( ( rule__Dynamics__NameAssignment_2 )? )
            // InternalMyDsl.g:5713:2: ( rule__Dynamics__NameAssignment_2 )?
            {
             before(grammarAccess.getDynamicsAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:5714:2: ( rule__Dynamics__NameAssignment_2 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_ID) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalMyDsl.g:5714:3: rule__Dynamics__NameAssignment_2
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
    // InternalMyDsl.g:5722:1: rule__Dynamics__Group__3 : rule__Dynamics__Group__3__Impl rule__Dynamics__Group__4 ;
    public final void rule__Dynamics__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5726:1: ( rule__Dynamics__Group__3__Impl rule__Dynamics__Group__4 )
            // InternalMyDsl.g:5727:2: rule__Dynamics__Group__3__Impl rule__Dynamics__Group__4
            {
            pushFollow(FOLLOW_61);
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
    // InternalMyDsl.g:5734:1: rule__Dynamics__Group__3__Impl : ( ( rule__Dynamics__Group_3__0 )? ) ;
    public final void rule__Dynamics__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5738:1: ( ( ( rule__Dynamics__Group_3__0 )? ) )
            // InternalMyDsl.g:5739:1: ( ( rule__Dynamics__Group_3__0 )? )
            {
            // InternalMyDsl.g:5739:1: ( ( rule__Dynamics__Group_3__0 )? )
            // InternalMyDsl.g:5740:2: ( rule__Dynamics__Group_3__0 )?
            {
             before(grammarAccess.getDynamicsAccess().getGroup_3()); 
            // InternalMyDsl.g:5741:2: ( rule__Dynamics__Group_3__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==74) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalMyDsl.g:5741:3: rule__Dynamics__Group_3__0
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
    // InternalMyDsl.g:5749:1: rule__Dynamics__Group__4 : rule__Dynamics__Group__4__Impl ;
    public final void rule__Dynamics__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5753:1: ( rule__Dynamics__Group__4__Impl )
            // InternalMyDsl.g:5754:2: rule__Dynamics__Group__4__Impl
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
    // InternalMyDsl.g:5760:1: rule__Dynamics__Group__4__Impl : ( ( rule__Dynamics__Group_4__0 )? ) ;
    public final void rule__Dynamics__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5764:1: ( ( ( rule__Dynamics__Group_4__0 )? ) )
            // InternalMyDsl.g:5765:1: ( ( rule__Dynamics__Group_4__0 )? )
            {
            // InternalMyDsl.g:5765:1: ( ( rule__Dynamics__Group_4__0 )? )
            // InternalMyDsl.g:5766:2: ( rule__Dynamics__Group_4__0 )?
            {
             before(grammarAccess.getDynamicsAccess().getGroup_4()); 
            // InternalMyDsl.g:5767:2: ( rule__Dynamics__Group_4__0 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==75) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalMyDsl.g:5767:3: rule__Dynamics__Group_4__0
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
    // InternalMyDsl.g:5776:1: rule__Dynamics__Group_3__0 : rule__Dynamics__Group_3__0__Impl rule__Dynamics__Group_3__1 ;
    public final void rule__Dynamics__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5780:1: ( rule__Dynamics__Group_3__0__Impl rule__Dynamics__Group_3__1 )
            // InternalMyDsl.g:5781:2: rule__Dynamics__Group_3__0__Impl rule__Dynamics__Group_3__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyDsl.g:5788:1: rule__Dynamics__Group_3__0__Impl : ( 'friction' ) ;
    public final void rule__Dynamics__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5792:1: ( ( 'friction' ) )
            // InternalMyDsl.g:5793:1: ( 'friction' )
            {
            // InternalMyDsl.g:5793:1: ( 'friction' )
            // InternalMyDsl.g:5794:2: 'friction'
            {
             before(grammarAccess.getDynamicsAccess().getFrictionKeyword_3_0()); 
            match(input,74,FOLLOW_2); 
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
    // InternalMyDsl.g:5803:1: rule__Dynamics__Group_3__1 : rule__Dynamics__Group_3__1__Impl ;
    public final void rule__Dynamics__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5807:1: ( rule__Dynamics__Group_3__1__Impl )
            // InternalMyDsl.g:5808:2: rule__Dynamics__Group_3__1__Impl
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
    // InternalMyDsl.g:5814:1: rule__Dynamics__Group_3__1__Impl : ( ( rule__Dynamics__FrictionAssignment_3_1 ) ) ;
    public final void rule__Dynamics__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5818:1: ( ( ( rule__Dynamics__FrictionAssignment_3_1 ) ) )
            // InternalMyDsl.g:5819:1: ( ( rule__Dynamics__FrictionAssignment_3_1 ) )
            {
            // InternalMyDsl.g:5819:1: ( ( rule__Dynamics__FrictionAssignment_3_1 ) )
            // InternalMyDsl.g:5820:2: ( rule__Dynamics__FrictionAssignment_3_1 )
            {
             before(grammarAccess.getDynamicsAccess().getFrictionAssignment_3_1()); 
            // InternalMyDsl.g:5821:2: ( rule__Dynamics__FrictionAssignment_3_1 )
            // InternalMyDsl.g:5821:3: rule__Dynamics__FrictionAssignment_3_1
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
    // InternalMyDsl.g:5830:1: rule__Dynamics__Group_4__0 : rule__Dynamics__Group_4__0__Impl rule__Dynamics__Group_4__1 ;
    public final void rule__Dynamics__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5834:1: ( rule__Dynamics__Group_4__0__Impl rule__Dynamics__Group_4__1 )
            // InternalMyDsl.g:5835:2: rule__Dynamics__Group_4__0__Impl rule__Dynamics__Group_4__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyDsl.g:5842:1: rule__Dynamics__Group_4__0__Impl : ( 'damping' ) ;
    public final void rule__Dynamics__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5846:1: ( ( 'damping' ) )
            // InternalMyDsl.g:5847:1: ( 'damping' )
            {
            // InternalMyDsl.g:5847:1: ( 'damping' )
            // InternalMyDsl.g:5848:2: 'damping'
            {
             before(grammarAccess.getDynamicsAccess().getDampingKeyword_4_0()); 
            match(input,75,FOLLOW_2); 
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
    // InternalMyDsl.g:5857:1: rule__Dynamics__Group_4__1 : rule__Dynamics__Group_4__1__Impl ;
    public final void rule__Dynamics__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5861:1: ( rule__Dynamics__Group_4__1__Impl )
            // InternalMyDsl.g:5862:2: rule__Dynamics__Group_4__1__Impl
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
    // InternalMyDsl.g:5868:1: rule__Dynamics__Group_4__1__Impl : ( ( rule__Dynamics__DampingAssignment_4_1 ) ) ;
    public final void rule__Dynamics__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5872:1: ( ( ( rule__Dynamics__DampingAssignment_4_1 ) ) )
            // InternalMyDsl.g:5873:1: ( ( rule__Dynamics__DampingAssignment_4_1 ) )
            {
            // InternalMyDsl.g:5873:1: ( ( rule__Dynamics__DampingAssignment_4_1 ) )
            // InternalMyDsl.g:5874:2: ( rule__Dynamics__DampingAssignment_4_1 )
            {
             before(grammarAccess.getDynamicsAccess().getDampingAssignment_4_1()); 
            // InternalMyDsl.g:5875:2: ( rule__Dynamics__DampingAssignment_4_1 )
            // InternalMyDsl.g:5875:3: rule__Dynamics__DampingAssignment_4_1
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
    // InternalMyDsl.g:5884:1: rule__SafetyController__Group__0 : rule__SafetyController__Group__0__Impl rule__SafetyController__Group__1 ;
    public final void rule__SafetyController__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5888:1: ( rule__SafetyController__Group__0__Impl rule__SafetyController__Group__1 )
            // InternalMyDsl.g:5889:2: rule__SafetyController__Group__0__Impl rule__SafetyController__Group__1
            {
            pushFollow(FOLLOW_62);
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
    // InternalMyDsl.g:5896:1: rule__SafetyController__Group__0__Impl : ( 'SafetyController' ) ;
    public final void rule__SafetyController__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5900:1: ( ( 'SafetyController' ) )
            // InternalMyDsl.g:5901:1: ( 'SafetyController' )
            {
            // InternalMyDsl.g:5901:1: ( 'SafetyController' )
            // InternalMyDsl.g:5902:2: 'SafetyController'
            {
             before(grammarAccess.getSafetyControllerAccess().getSafetyControllerKeyword_0()); 
            match(input,76,FOLLOW_2); 
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
    // InternalMyDsl.g:5911:1: rule__SafetyController__Group__1 : rule__SafetyController__Group__1__Impl rule__SafetyController__Group__2 ;
    public final void rule__SafetyController__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5915:1: ( rule__SafetyController__Group__1__Impl rule__SafetyController__Group__2 )
            // InternalMyDsl.g:5916:2: rule__SafetyController__Group__1__Impl rule__SafetyController__Group__2
            {
            pushFollow(FOLLOW_62);
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
    // InternalMyDsl.g:5923:1: rule__SafetyController__Group__1__Impl : ( ( rule__SafetyController__NameAssignment_1 )? ) ;
    public final void rule__SafetyController__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5927:1: ( ( ( rule__SafetyController__NameAssignment_1 )? ) )
            // InternalMyDsl.g:5928:1: ( ( rule__SafetyController__NameAssignment_1 )? )
            {
            // InternalMyDsl.g:5928:1: ( ( rule__SafetyController__NameAssignment_1 )? )
            // InternalMyDsl.g:5929:2: ( rule__SafetyController__NameAssignment_1 )?
            {
             before(grammarAccess.getSafetyControllerAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:5930:2: ( rule__SafetyController__NameAssignment_1 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_ID) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalMyDsl.g:5930:3: rule__SafetyController__NameAssignment_1
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
    // InternalMyDsl.g:5938:1: rule__SafetyController__Group__2 : rule__SafetyController__Group__2__Impl rule__SafetyController__Group__3 ;
    public final void rule__SafetyController__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5942:1: ( rule__SafetyController__Group__2__Impl rule__SafetyController__Group__3 )
            // InternalMyDsl.g:5943:2: rule__SafetyController__Group__2__Impl rule__SafetyController__Group__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyDsl.g:5950:1: rule__SafetyController__Group__2__Impl : ( 'k_velocity' ) ;
    public final void rule__SafetyController__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5954:1: ( ( 'k_velocity' ) )
            // InternalMyDsl.g:5955:1: ( 'k_velocity' )
            {
            // InternalMyDsl.g:5955:1: ( 'k_velocity' )
            // InternalMyDsl.g:5956:2: 'k_velocity'
            {
             before(grammarAccess.getSafetyControllerAccess().getK_velocityKeyword_2()); 
            match(input,77,FOLLOW_2); 
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
    // InternalMyDsl.g:5965:1: rule__SafetyController__Group__3 : rule__SafetyController__Group__3__Impl rule__SafetyController__Group__4 ;
    public final void rule__SafetyController__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5969:1: ( rule__SafetyController__Group__3__Impl rule__SafetyController__Group__4 )
            // InternalMyDsl.g:5970:2: rule__SafetyController__Group__3__Impl rule__SafetyController__Group__4
            {
            pushFollow(FOLLOW_63);
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
    // InternalMyDsl.g:5977:1: rule__SafetyController__Group__3__Impl : ( ( rule__SafetyController__K_velocityAssignment_3 ) ) ;
    public final void rule__SafetyController__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5981:1: ( ( ( rule__SafetyController__K_velocityAssignment_3 ) ) )
            // InternalMyDsl.g:5982:1: ( ( rule__SafetyController__K_velocityAssignment_3 ) )
            {
            // InternalMyDsl.g:5982:1: ( ( rule__SafetyController__K_velocityAssignment_3 ) )
            // InternalMyDsl.g:5983:2: ( rule__SafetyController__K_velocityAssignment_3 )
            {
             before(grammarAccess.getSafetyControllerAccess().getK_velocityAssignment_3()); 
            // InternalMyDsl.g:5984:2: ( rule__SafetyController__K_velocityAssignment_3 )
            // InternalMyDsl.g:5984:3: rule__SafetyController__K_velocityAssignment_3
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
    // InternalMyDsl.g:5992:1: rule__SafetyController__Group__4 : rule__SafetyController__Group__4__Impl rule__SafetyController__Group__5 ;
    public final void rule__SafetyController__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5996:1: ( rule__SafetyController__Group__4__Impl rule__SafetyController__Group__5 )
            // InternalMyDsl.g:5997:2: rule__SafetyController__Group__4__Impl rule__SafetyController__Group__5
            {
            pushFollow(FOLLOW_63);
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
    // InternalMyDsl.g:6004:1: rule__SafetyController__Group__4__Impl : ( ( rule__SafetyController__Group_4__0 )? ) ;
    public final void rule__SafetyController__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6008:1: ( ( ( rule__SafetyController__Group_4__0 )? ) )
            // InternalMyDsl.g:6009:1: ( ( rule__SafetyController__Group_4__0 )? )
            {
            // InternalMyDsl.g:6009:1: ( ( rule__SafetyController__Group_4__0 )? )
            // InternalMyDsl.g:6010:2: ( rule__SafetyController__Group_4__0 )?
            {
             before(grammarAccess.getSafetyControllerAccess().getGroup_4()); 
            // InternalMyDsl.g:6011:2: ( rule__SafetyController__Group_4__0 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==78) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalMyDsl.g:6011:3: rule__SafetyController__Group_4__0
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
    // InternalMyDsl.g:6019:1: rule__SafetyController__Group__5 : rule__SafetyController__Group__5__Impl rule__SafetyController__Group__6 ;
    public final void rule__SafetyController__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6023:1: ( rule__SafetyController__Group__5__Impl rule__SafetyController__Group__6 )
            // InternalMyDsl.g:6024:2: rule__SafetyController__Group__5__Impl rule__SafetyController__Group__6
            {
            pushFollow(FOLLOW_63);
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
    // InternalMyDsl.g:6031:1: rule__SafetyController__Group__5__Impl : ( ( rule__SafetyController__Group_5__0 )? ) ;
    public final void rule__SafetyController__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6035:1: ( ( ( rule__SafetyController__Group_5__0 )? ) )
            // InternalMyDsl.g:6036:1: ( ( rule__SafetyController__Group_5__0 )? )
            {
            // InternalMyDsl.g:6036:1: ( ( rule__SafetyController__Group_5__0 )? )
            // InternalMyDsl.g:6037:2: ( rule__SafetyController__Group_5__0 )?
            {
             before(grammarAccess.getSafetyControllerAccess().getGroup_5()); 
            // InternalMyDsl.g:6038:2: ( rule__SafetyController__Group_5__0 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==79) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalMyDsl.g:6038:3: rule__SafetyController__Group_5__0
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
    // InternalMyDsl.g:6046:1: rule__SafetyController__Group__6 : rule__SafetyController__Group__6__Impl ;
    public final void rule__SafetyController__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6050:1: ( rule__SafetyController__Group__6__Impl )
            // InternalMyDsl.g:6051:2: rule__SafetyController__Group__6__Impl
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
    // InternalMyDsl.g:6057:1: rule__SafetyController__Group__6__Impl : ( ( rule__SafetyController__Group_6__0 )? ) ;
    public final void rule__SafetyController__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6061:1: ( ( ( rule__SafetyController__Group_6__0 )? ) )
            // InternalMyDsl.g:6062:1: ( ( rule__SafetyController__Group_6__0 )? )
            {
            // InternalMyDsl.g:6062:1: ( ( rule__SafetyController__Group_6__0 )? )
            // InternalMyDsl.g:6063:2: ( rule__SafetyController__Group_6__0 )?
            {
             before(grammarAccess.getSafetyControllerAccess().getGroup_6()); 
            // InternalMyDsl.g:6064:2: ( rule__SafetyController__Group_6__0 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==80) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalMyDsl.g:6064:3: rule__SafetyController__Group_6__0
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
    // InternalMyDsl.g:6073:1: rule__SafetyController__Group_4__0 : rule__SafetyController__Group_4__0__Impl rule__SafetyController__Group_4__1 ;
    public final void rule__SafetyController__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6077:1: ( rule__SafetyController__Group_4__0__Impl rule__SafetyController__Group_4__1 )
            // InternalMyDsl.g:6078:2: rule__SafetyController__Group_4__0__Impl rule__SafetyController__Group_4__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyDsl.g:6085:1: rule__SafetyController__Group_4__0__Impl : ( 'k_position' ) ;
    public final void rule__SafetyController__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6089:1: ( ( 'k_position' ) )
            // InternalMyDsl.g:6090:1: ( 'k_position' )
            {
            // InternalMyDsl.g:6090:1: ( 'k_position' )
            // InternalMyDsl.g:6091:2: 'k_position'
            {
             before(grammarAccess.getSafetyControllerAccess().getK_positionKeyword_4_0()); 
            match(input,78,FOLLOW_2); 
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
    // InternalMyDsl.g:6100:1: rule__SafetyController__Group_4__1 : rule__SafetyController__Group_4__1__Impl ;
    public final void rule__SafetyController__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6104:1: ( rule__SafetyController__Group_4__1__Impl )
            // InternalMyDsl.g:6105:2: rule__SafetyController__Group_4__1__Impl
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
    // InternalMyDsl.g:6111:1: rule__SafetyController__Group_4__1__Impl : ( ( rule__SafetyController__K_positionAssignment_4_1 ) ) ;
    public final void rule__SafetyController__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6115:1: ( ( ( rule__SafetyController__K_positionAssignment_4_1 ) ) )
            // InternalMyDsl.g:6116:1: ( ( rule__SafetyController__K_positionAssignment_4_1 ) )
            {
            // InternalMyDsl.g:6116:1: ( ( rule__SafetyController__K_positionAssignment_4_1 ) )
            // InternalMyDsl.g:6117:2: ( rule__SafetyController__K_positionAssignment_4_1 )
            {
             before(grammarAccess.getSafetyControllerAccess().getK_positionAssignment_4_1()); 
            // InternalMyDsl.g:6118:2: ( rule__SafetyController__K_positionAssignment_4_1 )
            // InternalMyDsl.g:6118:3: rule__SafetyController__K_positionAssignment_4_1
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
    // InternalMyDsl.g:6127:1: rule__SafetyController__Group_5__0 : rule__SafetyController__Group_5__0__Impl rule__SafetyController__Group_5__1 ;
    public final void rule__SafetyController__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6131:1: ( rule__SafetyController__Group_5__0__Impl rule__SafetyController__Group_5__1 )
            // InternalMyDsl.g:6132:2: rule__SafetyController__Group_5__0__Impl rule__SafetyController__Group_5__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyDsl.g:6139:1: rule__SafetyController__Group_5__0__Impl : ( 'softLowerLimit' ) ;
    public final void rule__SafetyController__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6143:1: ( ( 'softLowerLimit' ) )
            // InternalMyDsl.g:6144:1: ( 'softLowerLimit' )
            {
            // InternalMyDsl.g:6144:1: ( 'softLowerLimit' )
            // InternalMyDsl.g:6145:2: 'softLowerLimit'
            {
             before(grammarAccess.getSafetyControllerAccess().getSoftLowerLimitKeyword_5_0()); 
            match(input,79,FOLLOW_2); 
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
    // InternalMyDsl.g:6154:1: rule__SafetyController__Group_5__1 : rule__SafetyController__Group_5__1__Impl ;
    public final void rule__SafetyController__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6158:1: ( rule__SafetyController__Group_5__1__Impl )
            // InternalMyDsl.g:6159:2: rule__SafetyController__Group_5__1__Impl
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
    // InternalMyDsl.g:6165:1: rule__SafetyController__Group_5__1__Impl : ( ( rule__SafetyController__SoftLowerLimitAssignment_5_1 ) ) ;
    public final void rule__SafetyController__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6169:1: ( ( ( rule__SafetyController__SoftLowerLimitAssignment_5_1 ) ) )
            // InternalMyDsl.g:6170:1: ( ( rule__SafetyController__SoftLowerLimitAssignment_5_1 ) )
            {
            // InternalMyDsl.g:6170:1: ( ( rule__SafetyController__SoftLowerLimitAssignment_5_1 ) )
            // InternalMyDsl.g:6171:2: ( rule__SafetyController__SoftLowerLimitAssignment_5_1 )
            {
             before(grammarAccess.getSafetyControllerAccess().getSoftLowerLimitAssignment_5_1()); 
            // InternalMyDsl.g:6172:2: ( rule__SafetyController__SoftLowerLimitAssignment_5_1 )
            // InternalMyDsl.g:6172:3: rule__SafetyController__SoftLowerLimitAssignment_5_1
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
    // InternalMyDsl.g:6181:1: rule__SafetyController__Group_6__0 : rule__SafetyController__Group_6__0__Impl rule__SafetyController__Group_6__1 ;
    public final void rule__SafetyController__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6185:1: ( rule__SafetyController__Group_6__0__Impl rule__SafetyController__Group_6__1 )
            // InternalMyDsl.g:6186:2: rule__SafetyController__Group_6__0__Impl rule__SafetyController__Group_6__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyDsl.g:6193:1: rule__SafetyController__Group_6__0__Impl : ( 'softUpperLimit' ) ;
    public final void rule__SafetyController__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6197:1: ( ( 'softUpperLimit' ) )
            // InternalMyDsl.g:6198:1: ( 'softUpperLimit' )
            {
            // InternalMyDsl.g:6198:1: ( 'softUpperLimit' )
            // InternalMyDsl.g:6199:2: 'softUpperLimit'
            {
             before(grammarAccess.getSafetyControllerAccess().getSoftUpperLimitKeyword_6_0()); 
            match(input,80,FOLLOW_2); 
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
    // InternalMyDsl.g:6208:1: rule__SafetyController__Group_6__1 : rule__SafetyController__Group_6__1__Impl ;
    public final void rule__SafetyController__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6212:1: ( rule__SafetyController__Group_6__1__Impl )
            // InternalMyDsl.g:6213:2: rule__SafetyController__Group_6__1__Impl
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
    // InternalMyDsl.g:6219:1: rule__SafetyController__Group_6__1__Impl : ( ( rule__SafetyController__SoftUpperLimitAssignment_6_1 ) ) ;
    public final void rule__SafetyController__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6223:1: ( ( ( rule__SafetyController__SoftUpperLimitAssignment_6_1 ) ) )
            // InternalMyDsl.g:6224:1: ( ( rule__SafetyController__SoftUpperLimitAssignment_6_1 ) )
            {
            // InternalMyDsl.g:6224:1: ( ( rule__SafetyController__SoftUpperLimitAssignment_6_1 ) )
            // InternalMyDsl.g:6225:2: ( rule__SafetyController__SoftUpperLimitAssignment_6_1 )
            {
             before(grammarAccess.getSafetyControllerAccess().getSoftUpperLimitAssignment_6_1()); 
            // InternalMyDsl.g:6226:2: ( rule__SafetyController__SoftUpperLimitAssignment_6_1 )
            // InternalMyDsl.g:6226:3: rule__SafetyController__SoftUpperLimitAssignment_6_1
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


    // $ANTLR start "rule__FLOAT__Group__0"
    // InternalMyDsl.g:6235:1: rule__FLOAT__Group__0 : rule__FLOAT__Group__0__Impl rule__FLOAT__Group__1 ;
    public final void rule__FLOAT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6239:1: ( rule__FLOAT__Group__0__Impl rule__FLOAT__Group__1 )
            // InternalMyDsl.g:6240:2: rule__FLOAT__Group__0__Impl rule__FLOAT__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:6247:1: rule__FLOAT__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__FLOAT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6251:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:6252:1: ( RULE_INT )
            {
            // InternalMyDsl.g:6252:1: ( RULE_INT )
            // InternalMyDsl.g:6253:2: RULE_INT
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
    // InternalMyDsl.g:6262:1: rule__FLOAT__Group__1 : rule__FLOAT__Group__1__Impl rule__FLOAT__Group__2 ;
    public final void rule__FLOAT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6266:1: ( rule__FLOAT__Group__1__Impl rule__FLOAT__Group__2 )
            // InternalMyDsl.g:6267:2: rule__FLOAT__Group__1__Impl rule__FLOAT__Group__2
            {
            pushFollow(FOLLOW_44);
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
    // InternalMyDsl.g:6274:1: rule__FLOAT__Group__1__Impl : ( '.' ) ;
    public final void rule__FLOAT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6278:1: ( ( '.' ) )
            // InternalMyDsl.g:6279:1: ( '.' )
            {
            // InternalMyDsl.g:6279:1: ( '.' )
            // InternalMyDsl.g:6280:2: '.'
            {
             before(grammarAccess.getFLOATAccess().getFullStopKeyword_1()); 
            match(input,23,FOLLOW_2); 
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
    // InternalMyDsl.g:6289:1: rule__FLOAT__Group__2 : rule__FLOAT__Group__2__Impl ;
    public final void rule__FLOAT__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6293:1: ( rule__FLOAT__Group__2__Impl )
            // InternalMyDsl.g:6294:2: rule__FLOAT__Group__2__Impl
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
    // InternalMyDsl.g:6300:1: rule__FLOAT__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__FLOAT__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6304:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:6305:1: ( RULE_INT )
            {
            // InternalMyDsl.g:6305:1: ( RULE_INT )
            // InternalMyDsl.g:6306:2: RULE_INT
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
    // InternalMyDsl.g:6316:1: rule__SCIENTIFIC__Group__0 : rule__SCIENTIFIC__Group__0__Impl rule__SCIENTIFIC__Group__1 ;
    public final void rule__SCIENTIFIC__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6320:1: ( rule__SCIENTIFIC__Group__0__Impl rule__SCIENTIFIC__Group__1 )
            // InternalMyDsl.g:6321:2: rule__SCIENTIFIC__Group__0__Impl rule__SCIENTIFIC__Group__1
            {
            pushFollow(FOLLOW_64);
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
    // InternalMyDsl.g:6328:1: rule__SCIENTIFIC__Group__0__Impl : ( ruleFLOAT ) ;
    public final void rule__SCIENTIFIC__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6332:1: ( ( ruleFLOAT ) )
            // InternalMyDsl.g:6333:1: ( ruleFLOAT )
            {
            // InternalMyDsl.g:6333:1: ( ruleFLOAT )
            // InternalMyDsl.g:6334:2: ruleFLOAT
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
    // InternalMyDsl.g:6343:1: rule__SCIENTIFIC__Group__1 : rule__SCIENTIFIC__Group__1__Impl rule__SCIENTIFIC__Group__2 ;
    public final void rule__SCIENTIFIC__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6347:1: ( rule__SCIENTIFIC__Group__1__Impl rule__SCIENTIFIC__Group__2 )
            // InternalMyDsl.g:6348:2: rule__SCIENTIFIC__Group__1__Impl rule__SCIENTIFIC__Group__2
            {
            pushFollow(FOLLOW_65);
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
    // InternalMyDsl.g:6355:1: rule__SCIENTIFIC__Group__1__Impl : ( 'e' ) ;
    public final void rule__SCIENTIFIC__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6359:1: ( ( 'e' ) )
            // InternalMyDsl.g:6360:1: ( 'e' )
            {
            // InternalMyDsl.g:6360:1: ( 'e' )
            // InternalMyDsl.g:6361:2: 'e'
            {
             before(grammarAccess.getSCIENTIFICAccess().getEKeyword_1()); 
            match(input,81,FOLLOW_2); 
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
    // InternalMyDsl.g:6370:1: rule__SCIENTIFIC__Group__2 : rule__SCIENTIFIC__Group__2__Impl rule__SCIENTIFIC__Group__3 ;
    public final void rule__SCIENTIFIC__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6374:1: ( rule__SCIENTIFIC__Group__2__Impl rule__SCIENTIFIC__Group__3 )
            // InternalMyDsl.g:6375:2: rule__SCIENTIFIC__Group__2__Impl rule__SCIENTIFIC__Group__3
            {
            pushFollow(FOLLOW_65);
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
    // InternalMyDsl.g:6382:1: rule__SCIENTIFIC__Group__2__Impl : ( ( rule__SCIENTIFIC__Alternatives_2 )? ) ;
    public final void rule__SCIENTIFIC__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6386:1: ( ( ( rule__SCIENTIFIC__Alternatives_2 )? ) )
            // InternalMyDsl.g:6387:1: ( ( rule__SCIENTIFIC__Alternatives_2 )? )
            {
            // InternalMyDsl.g:6387:1: ( ( rule__SCIENTIFIC__Alternatives_2 )? )
            // InternalMyDsl.g:6388:2: ( rule__SCIENTIFIC__Alternatives_2 )?
            {
             before(grammarAccess.getSCIENTIFICAccess().getAlternatives_2()); 
            // InternalMyDsl.g:6389:2: ( rule__SCIENTIFIC__Alternatives_2 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( ((LA55_0>=11 && LA55_0<=12)) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalMyDsl.g:6389:3: rule__SCIENTIFIC__Alternatives_2
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
    // InternalMyDsl.g:6397:1: rule__SCIENTIFIC__Group__3 : rule__SCIENTIFIC__Group__3__Impl ;
    public final void rule__SCIENTIFIC__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6401:1: ( rule__SCIENTIFIC__Group__3__Impl )
            // InternalMyDsl.g:6402:2: rule__SCIENTIFIC__Group__3__Impl
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
    // InternalMyDsl.g:6408:1: rule__SCIENTIFIC__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__SCIENTIFIC__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6412:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:6413:1: ( RULE_INT )
            {
            // InternalMyDsl.g:6413:1: ( RULE_INT )
            // InternalMyDsl.g:6414:2: RULE_INT
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
    // InternalMyDsl.g:6424:1: rule__SIGNED_NUMERIC__Group__0 : rule__SIGNED_NUMERIC__Group__0__Impl rule__SIGNED_NUMERIC__Group__1 ;
    public final void rule__SIGNED_NUMERIC__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6428:1: ( rule__SIGNED_NUMERIC__Group__0__Impl rule__SIGNED_NUMERIC__Group__1 )
            // InternalMyDsl.g:6429:2: rule__SIGNED_NUMERIC__Group__0__Impl rule__SIGNED_NUMERIC__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyDsl.g:6436:1: rule__SIGNED_NUMERIC__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__SIGNED_NUMERIC__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6440:1: ( ( ( '-' )? ) )
            // InternalMyDsl.g:6441:1: ( ( '-' )? )
            {
            // InternalMyDsl.g:6441:1: ( ( '-' )? )
            // InternalMyDsl.g:6442:2: ( '-' )?
            {
             before(grammarAccess.getSIGNED_NUMERICAccess().getHyphenMinusKeyword_0()); 
            // InternalMyDsl.g:6443:2: ( '-' )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==12) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalMyDsl.g:6443:3: '-'
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
    // InternalMyDsl.g:6451:1: rule__SIGNED_NUMERIC__Group__1 : rule__SIGNED_NUMERIC__Group__1__Impl ;
    public final void rule__SIGNED_NUMERIC__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6455:1: ( rule__SIGNED_NUMERIC__Group__1__Impl )
            // InternalMyDsl.g:6456:2: rule__SIGNED_NUMERIC__Group__1__Impl
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
    // InternalMyDsl.g:6462:1: rule__SIGNED_NUMERIC__Group__1__Impl : ( ( rule__SIGNED_NUMERIC__Alternatives_1 ) ) ;
    public final void rule__SIGNED_NUMERIC__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6466:1: ( ( ( rule__SIGNED_NUMERIC__Alternatives_1 ) ) )
            // InternalMyDsl.g:6467:1: ( ( rule__SIGNED_NUMERIC__Alternatives_1 ) )
            {
            // InternalMyDsl.g:6467:1: ( ( rule__SIGNED_NUMERIC__Alternatives_1 ) )
            // InternalMyDsl.g:6468:2: ( rule__SIGNED_NUMERIC__Alternatives_1 )
            {
             before(grammarAccess.getSIGNED_NUMERICAccess().getAlternatives_1()); 
            // InternalMyDsl.g:6469:2: ( rule__SIGNED_NUMERIC__Alternatives_1 )
            // InternalMyDsl.g:6469:3: rule__SIGNED_NUMERIC__Alternatives_1
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
    // InternalMyDsl.g:6478:1: rule__Robot__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Robot__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6482:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:6483:2: ( RULE_ID )
            {
            // InternalMyDsl.g:6483:2: ( RULE_ID )
            // InternalMyDsl.g:6484:3: RULE_ID
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


    // $ANTLR start "rule__Robot__LinksAssignment_2_0"
    // InternalMyDsl.g:6493:1: rule__Robot__LinksAssignment_2_0 : ( ruleLink ) ;
    public final void rule__Robot__LinksAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6497:1: ( ( ruleLink ) )
            // InternalMyDsl.g:6498:2: ( ruleLink )
            {
            // InternalMyDsl.g:6498:2: ( ruleLink )
            // InternalMyDsl.g:6499:3: ruleLink
            {
             before(grammarAccess.getRobotAccess().getLinksLinkParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleLink();

            state._fsp--;

             after(grammarAccess.getRobotAccess().getLinksLinkParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__LinksAssignment_2_0"


    // $ANTLR start "rule__Robot__JointAssignment_2_1"
    // InternalMyDsl.g:6508:1: rule__Robot__JointAssignment_2_1 : ( ruleJoint ) ;
    public final void rule__Robot__JointAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6512:1: ( ( ruleJoint ) )
            // InternalMyDsl.g:6513:2: ( ruleJoint )
            {
            // InternalMyDsl.g:6513:2: ( ruleJoint )
            // InternalMyDsl.g:6514:3: ruleJoint
            {
             before(grammarAccess.getRobotAccess().getJointJointParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleJoint();

            state._fsp--;

             after(grammarAccess.getRobotAccess().getJointJointParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__JointAssignment_2_1"


    // $ANTLR start "rule__Link__NameAssignment_2"
    // InternalMyDsl.g:6523:1: rule__Link__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Link__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6527:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:6528:2: ( RULE_ID )
            {
            // InternalMyDsl.g:6528:2: ( RULE_ID )
            // InternalMyDsl.g:6529:3: RULE_ID
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
    // InternalMyDsl.g:6538:1: rule__Link__InertialAssignment_3_0_1_0 : ( ruleInertial ) ;
    public final void rule__Link__InertialAssignment_3_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6542:1: ( ( ruleInertial ) )
            // InternalMyDsl.g:6543:2: ( ruleInertial )
            {
            // InternalMyDsl.g:6543:2: ( ruleInertial )
            // InternalMyDsl.g:6544:3: ruleInertial
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
    // InternalMyDsl.g:6553:1: rule__Link__VisualAssignment_3_0_1_1 : ( ruleVisual ) ;
    public final void rule__Link__VisualAssignment_3_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6557:1: ( ( ruleVisual ) )
            // InternalMyDsl.g:6558:2: ( ruleVisual )
            {
            // InternalMyDsl.g:6558:2: ( ruleVisual )
            // InternalMyDsl.g:6559:3: ruleVisual
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
    // InternalMyDsl.g:6568:1: rule__Link__CollisionAssignment_3_0_1_2 : ( ruleCollision ) ;
    public final void rule__Link__CollisionAssignment_3_0_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6572:1: ( ( ruleCollision ) )
            // InternalMyDsl.g:6573:2: ( ruleCollision )
            {
            // InternalMyDsl.g:6573:2: ( ruleCollision )
            // InternalMyDsl.g:6574:3: ruleCollision
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
    // InternalMyDsl.g:6583:1: rule__Link__LinkAssignment_3_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Link__LinkAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6587:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:6588:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:6588:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:6589:3: ( RULE_ID )
            {
             before(grammarAccess.getLinkAccess().getLinkLinkCrossReference_3_1_1_0()); 
            // InternalMyDsl.g:6590:3: ( RULE_ID )
            // InternalMyDsl.g:6591:4: RULE_ID
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
    // InternalMyDsl.g:6602:1: rule__Link__ReuseAssignment_3_1_2 : ( ruleReuse ) ;
    public final void rule__Link__ReuseAssignment_3_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6606:1: ( ( ruleReuse ) )
            // InternalMyDsl.g:6607:2: ( ruleReuse )
            {
            // InternalMyDsl.g:6607:2: ( ruleReuse )
            // InternalMyDsl.g:6608:3: ruleReuse
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
    // InternalMyDsl.g:6617:1: rule__Reuse__RefAssignment_1_0_1 : ( ruleDotExpression ) ;
    public final void rule__Reuse__RefAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6621:1: ( ( ruleDotExpression ) )
            // InternalMyDsl.g:6622:2: ( ruleDotExpression )
            {
            // InternalMyDsl.g:6622:2: ( ruleDotExpression )
            // InternalMyDsl.g:6623:3: ruleDotExpression
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
    // InternalMyDsl.g:6632:1: rule__Reuse__AddAssignment_1_1_1 : ( ruleReUseAble ) ;
    public final void rule__Reuse__AddAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6636:1: ( ( ruleReUseAble ) )
            // InternalMyDsl.g:6637:2: ( ruleReUseAble )
            {
            // InternalMyDsl.g:6637:2: ( ruleReUseAble )
            // InternalMyDsl.g:6638:3: ruleReUseAble
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
    // InternalMyDsl.g:6647:1: rule__DotExpression__TailAssignment_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__DotExpression__TailAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6651:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:6652:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:6652:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:6653:3: ( RULE_ID )
            {
             before(grammarAccess.getDotExpressionAccess().getTailReUseAbleCrossReference_1_2_0()); 
            // InternalMyDsl.g:6654:3: ( RULE_ID )
            // InternalMyDsl.g:6655:4: RULE_ID
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
    // InternalMyDsl.g:6666:1: rule__ReUsableRef__ReuseableAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ReUsableRef__ReuseableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6670:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:6671:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:6671:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:6672:3: ( RULE_ID )
            {
             before(grammarAccess.getReUsableRefAccess().getReuseableReUseAbleCrossReference_1_0()); 
            // InternalMyDsl.g:6673:3: ( RULE_ID )
            // InternalMyDsl.g:6674:4: RULE_ID
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
    // InternalMyDsl.g:6685:1: rule__Inertial__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Inertial__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6689:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:6690:2: ( RULE_ID )
            {
            // InternalMyDsl.g:6690:2: ( RULE_ID )
            // InternalMyDsl.g:6691:3: RULE_ID
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
    // InternalMyDsl.g:6700:1: rule__Inertial__InertiaAssignment_3 : ( ruleInertia ) ;
    public final void rule__Inertial__InertiaAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6704:1: ( ( ruleInertia ) )
            // InternalMyDsl.g:6705:2: ( ruleInertia )
            {
            // InternalMyDsl.g:6705:2: ( ruleInertia )
            // InternalMyDsl.g:6706:3: ruleInertia
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
    // InternalMyDsl.g:6715:1: rule__Inertial__MassAssignment_4 : ( ruleMass ) ;
    public final void rule__Inertial__MassAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6719:1: ( ( ruleMass ) )
            // InternalMyDsl.g:6720:2: ( ruleMass )
            {
            // InternalMyDsl.g:6720:2: ( ruleMass )
            // InternalMyDsl.g:6721:3: ruleMass
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
    // InternalMyDsl.g:6730:1: rule__Inertial__OriginAssignment_5 : ( ruleOrigin ) ;
    public final void rule__Inertial__OriginAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6734:1: ( ( ruleOrigin ) )
            // InternalMyDsl.g:6735:2: ( ruleOrigin )
            {
            // InternalMyDsl.g:6735:2: ( ruleOrigin )
            // InternalMyDsl.g:6736:3: ruleOrigin
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
    // InternalMyDsl.g:6745:1: rule__Inertia__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Inertia__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6749:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:6750:2: ( RULE_ID )
            {
            // InternalMyDsl.g:6750:2: ( RULE_ID )
            // InternalMyDsl.g:6751:3: RULE_ID
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
    // InternalMyDsl.g:6760:1: rule__Inertia__IxxAssignment_4 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__Inertia__IxxAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6764:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:6765:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:6765:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:6766:3: ruleURDFAttrSignedNumeric
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
    // InternalMyDsl.g:6775:1: rule__Inertia__IxyAssignment_6 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__Inertia__IxyAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6779:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:6780:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:6780:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:6781:3: ruleURDFAttrSignedNumeric
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
    // InternalMyDsl.g:6790:1: rule__Inertia__IxzAssignment_8 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__Inertia__IxzAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6794:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:6795:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:6795:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:6796:3: ruleURDFAttrSignedNumeric
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
    // InternalMyDsl.g:6805:1: rule__Inertia__IyyAssignment_10 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__Inertia__IyyAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6809:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:6810:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:6810:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:6811:3: ruleURDFAttrSignedNumeric
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
    // InternalMyDsl.g:6820:1: rule__Inertia__IyzAssignment_12 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__Inertia__IyzAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6824:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:6825:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:6825:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:6826:3: ruleURDFAttrSignedNumeric
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
    // InternalMyDsl.g:6835:1: rule__Inertia__IzzAssignment_14 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__Inertia__IzzAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6839:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:6840:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:6840:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:6841:3: ruleURDFAttrSignedNumeric
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
    // InternalMyDsl.g:6850:1: rule__Visual__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Visual__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6854:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:6855:2: ( RULE_ID )
            {
            // InternalMyDsl.g:6855:2: ( RULE_ID )
            // InternalMyDsl.g:6856:3: RULE_ID
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
    // InternalMyDsl.g:6865:1: rule__Visual__GeometryAssignment_4 : ( ruleGeometry ) ;
    public final void rule__Visual__GeometryAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6869:1: ( ( ruleGeometry ) )
            // InternalMyDsl.g:6870:2: ( ruleGeometry )
            {
            // InternalMyDsl.g:6870:2: ( ruleGeometry )
            // InternalMyDsl.g:6871:3: ruleGeometry
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
    // InternalMyDsl.g:6880:1: rule__Visual__OriginAssignment_5 : ( ruleOrigin ) ;
    public final void rule__Visual__OriginAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6884:1: ( ( ruleOrigin ) )
            // InternalMyDsl.g:6885:2: ( ruleOrigin )
            {
            // InternalMyDsl.g:6885:2: ( ruleOrigin )
            // InternalMyDsl.g:6886:3: ruleOrigin
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
    // InternalMyDsl.g:6895:1: rule__Visual__MaterialAssignment_6_1 : ( ruleMaterial ) ;
    public final void rule__Visual__MaterialAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6899:1: ( ( ruleMaterial ) )
            // InternalMyDsl.g:6900:2: ( ruleMaterial )
            {
            // InternalMyDsl.g:6900:2: ( ruleMaterial )
            // InternalMyDsl.g:6901:3: ruleMaterial
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
    // InternalMyDsl.g:6910:1: rule__Origin__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Origin__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6914:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:6915:2: ( RULE_ID )
            {
            // InternalMyDsl.g:6915:2: ( RULE_ID )
            // InternalMyDsl.g:6916:3: RULE_ID
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
    // InternalMyDsl.g:6925:1: rule__Origin__XAssignment_4 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__Origin__XAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6929:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:6930:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:6930:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:6931:3: ruleURDFAttrSignedNumeric
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
    // InternalMyDsl.g:6940:1: rule__Origin__YAssignment_6 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__Origin__YAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6944:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:6945:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:6945:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:6946:3: ruleURDFAttrSignedNumeric
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
    // InternalMyDsl.g:6955:1: rule__Origin__ZAssignment_8 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__Origin__ZAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6959:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:6960:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:6960:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:6961:3: ruleURDFAttrSignedNumeric
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
    // InternalMyDsl.g:6970:1: rule__Origin__RollAssignment_9_1 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__Origin__RollAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6974:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:6975:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:6975:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:6976:3: ruleURDFAttrSignedNumeric
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
    // InternalMyDsl.g:6985:1: rule__Origin__PitchAssignment_10_1 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__Origin__PitchAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6989:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:6990:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:6990:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:6991:3: ruleURDFAttrSignedNumeric
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
    // InternalMyDsl.g:7000:1: rule__Origin__YawAssignment_11_1 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__Origin__YawAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7004:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:7005:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:7005:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:7006:3: ruleURDFAttrSignedNumeric
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
    // InternalMyDsl.g:7015:1: rule__Mass__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Mass__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7019:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:7020:2: ( RULE_ID )
            {
            // InternalMyDsl.g:7020:2: ( RULE_ID )
            // InternalMyDsl.g:7021:3: RULE_ID
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
    // InternalMyDsl.g:7030:1: rule__Mass__MassKilogramAssignment_4 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__Mass__MassKilogramAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7034:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:7035:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:7035:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:7036:3: ruleURDFAttrSignedNumeric
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
    // InternalMyDsl.g:7045:1: rule__Collision__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Collision__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7049:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:7050:2: ( RULE_ID )
            {
            // InternalMyDsl.g:7050:2: ( RULE_ID )
            // InternalMyDsl.g:7051:3: RULE_ID
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
    // InternalMyDsl.g:7060:1: rule__Collision__GeometryAssignment_3 : ( ruleGeometry ) ;
    public final void rule__Collision__GeometryAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7064:1: ( ( ruleGeometry ) )
            // InternalMyDsl.g:7065:2: ( ruleGeometry )
            {
            // InternalMyDsl.g:7065:2: ( ruleGeometry )
            // InternalMyDsl.g:7066:3: ruleGeometry
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
    // InternalMyDsl.g:7075:1: rule__Collision__OriginAssignment_4 : ( ruleOrigin ) ;
    public final void rule__Collision__OriginAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7079:1: ( ( ruleOrigin ) )
            // InternalMyDsl.g:7080:2: ( ruleOrigin )
            {
            // InternalMyDsl.g:7080:2: ( ruleOrigin )
            // InternalMyDsl.g:7081:3: ruleOrigin
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
    // InternalMyDsl.g:7090:1: rule__Box__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Box__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7094:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:7095:2: ( RULE_ID )
            {
            // InternalMyDsl.g:7095:2: ( RULE_ID )
            // InternalMyDsl.g:7096:3: RULE_ID
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
    // InternalMyDsl.g:7105:1: rule__Box__HeightAssignment_3 : ( ruleURDFAttrNumeric ) ;
    public final void rule__Box__HeightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7109:1: ( ( ruleURDFAttrNumeric ) )
            // InternalMyDsl.g:7110:2: ( ruleURDFAttrNumeric )
            {
            // InternalMyDsl.g:7110:2: ( ruleURDFAttrNumeric )
            // InternalMyDsl.g:7111:3: ruleURDFAttrNumeric
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
    // InternalMyDsl.g:7120:1: rule__Box__LengthAssignment_5 : ( ruleURDFAttrNumeric ) ;
    public final void rule__Box__LengthAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7124:1: ( ( ruleURDFAttrNumeric ) )
            // InternalMyDsl.g:7125:2: ( ruleURDFAttrNumeric )
            {
            // InternalMyDsl.g:7125:2: ( ruleURDFAttrNumeric )
            // InternalMyDsl.g:7126:3: ruleURDFAttrNumeric
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
    // InternalMyDsl.g:7135:1: rule__Box__WidthAssignment_7 : ( ruleURDFAttrNumeric ) ;
    public final void rule__Box__WidthAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7139:1: ( ( ruleURDFAttrNumeric ) )
            // InternalMyDsl.g:7140:2: ( ruleURDFAttrNumeric )
            {
            // InternalMyDsl.g:7140:2: ( ruleURDFAttrNumeric )
            // InternalMyDsl.g:7141:3: ruleURDFAttrNumeric
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
    // InternalMyDsl.g:7150:1: rule__Cylinder__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Cylinder__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7154:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:7155:2: ( RULE_ID )
            {
            // InternalMyDsl.g:7155:2: ( RULE_ID )
            // InternalMyDsl.g:7156:3: RULE_ID
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
    // InternalMyDsl.g:7165:1: rule__Cylinder__RadiusAssignment_3 : ( ruleURDFAttrNumeric ) ;
    public final void rule__Cylinder__RadiusAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7169:1: ( ( ruleURDFAttrNumeric ) )
            // InternalMyDsl.g:7170:2: ( ruleURDFAttrNumeric )
            {
            // InternalMyDsl.g:7170:2: ( ruleURDFAttrNumeric )
            // InternalMyDsl.g:7171:3: ruleURDFAttrNumeric
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
    // InternalMyDsl.g:7180:1: rule__Cylinder__LengthAssignment_5 : ( ruleURDFAttrNumeric ) ;
    public final void rule__Cylinder__LengthAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7184:1: ( ( ruleURDFAttrNumeric ) )
            // InternalMyDsl.g:7185:2: ( ruleURDFAttrNumeric )
            {
            // InternalMyDsl.g:7185:2: ( ruleURDFAttrNumeric )
            // InternalMyDsl.g:7186:3: ruleURDFAttrNumeric
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
    // InternalMyDsl.g:7195:1: rule__Mesh__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Mesh__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7199:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:7200:2: ( RULE_ID )
            {
            // InternalMyDsl.g:7200:2: ( RULE_ID )
            // InternalMyDsl.g:7201:3: RULE_ID
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
    // InternalMyDsl.g:7210:1: rule__Mesh__PathToFileAssignment_3 : ( ruleURDFAttrSTRING ) ;
    public final void rule__Mesh__PathToFileAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7214:1: ( ( ruleURDFAttrSTRING ) )
            // InternalMyDsl.g:7215:2: ( ruleURDFAttrSTRING )
            {
            // InternalMyDsl.g:7215:2: ( ruleURDFAttrSTRING )
            // InternalMyDsl.g:7216:3: ruleURDFAttrSTRING
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
    // InternalMyDsl.g:7225:1: rule__Sphere__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Sphere__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7229:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:7230:2: ( RULE_ID )
            {
            // InternalMyDsl.g:7230:2: ( RULE_ID )
            // InternalMyDsl.g:7231:3: RULE_ID
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
    // InternalMyDsl.g:7240:1: rule__Sphere__RadiusAssignment_3 : ( ruleURDFAttrNumeric ) ;
    public final void rule__Sphere__RadiusAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7244:1: ( ( ruleURDFAttrNumeric ) )
            // InternalMyDsl.g:7245:2: ( ruleURDFAttrNumeric )
            {
            // InternalMyDsl.g:7245:2: ( ruleURDFAttrNumeric )
            // InternalMyDsl.g:7246:3: ruleURDFAttrNumeric
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
    // InternalMyDsl.g:7255:1: rule__Texture__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Texture__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7259:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:7260:2: ( RULE_ID )
            {
            // InternalMyDsl.g:7260:2: ( RULE_ID )
            // InternalMyDsl.g:7261:3: RULE_ID
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
    // InternalMyDsl.g:7270:1: rule__Texture__PathToFileAssignment_3 : ( ruleURDFAttrSTRING ) ;
    public final void rule__Texture__PathToFileAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7274:1: ( ( ruleURDFAttrSTRING ) )
            // InternalMyDsl.g:7275:2: ( ruleURDFAttrSTRING )
            {
            // InternalMyDsl.g:7275:2: ( ruleURDFAttrSTRING )
            // InternalMyDsl.g:7276:3: ruleURDFAttrSTRING
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
    // InternalMyDsl.g:7285:1: rule__Color__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Color__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7289:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:7290:2: ( RULE_ID )
            {
            // InternalMyDsl.g:7290:2: ( RULE_ID )
            // InternalMyDsl.g:7291:3: RULE_ID
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
    // InternalMyDsl.g:7300:1: rule__Color__RedAssignment_3 : ( ruleURDFAttrFloat ) ;
    public final void rule__Color__RedAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7304:1: ( ( ruleURDFAttrFloat ) )
            // InternalMyDsl.g:7305:2: ( ruleURDFAttrFloat )
            {
            // InternalMyDsl.g:7305:2: ( ruleURDFAttrFloat )
            // InternalMyDsl.g:7306:3: ruleURDFAttrFloat
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
    // InternalMyDsl.g:7315:1: rule__Color__GreenAssignment_5 : ( ruleURDFAttrFloat ) ;
    public final void rule__Color__GreenAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7319:1: ( ( ruleURDFAttrFloat ) )
            // InternalMyDsl.g:7320:2: ( ruleURDFAttrFloat )
            {
            // InternalMyDsl.g:7320:2: ( ruleURDFAttrFloat )
            // InternalMyDsl.g:7321:3: ruleURDFAttrFloat
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
    // InternalMyDsl.g:7330:1: rule__Color__BlueAssignment_7 : ( ruleURDFAttrFloat ) ;
    public final void rule__Color__BlueAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7334:1: ( ( ruleURDFAttrFloat ) )
            // InternalMyDsl.g:7335:2: ( ruleURDFAttrFloat )
            {
            // InternalMyDsl.g:7335:2: ( ruleURDFAttrFloat )
            // InternalMyDsl.g:7336:3: ruleURDFAttrFloat
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
    // InternalMyDsl.g:7345:1: rule__Color__AlphaAssignment_9 : ( ruleURDFAttrFloat ) ;
    public final void rule__Color__AlphaAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7349:1: ( ( ruleURDFAttrFloat ) )
            // InternalMyDsl.g:7350:2: ( ruleURDFAttrFloat )
            {
            // InternalMyDsl.g:7350:2: ( ruleURDFAttrFloat )
            // InternalMyDsl.g:7351:3: ruleURDFAttrFloat
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
    // InternalMyDsl.g:7360:1: rule__Joint__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Joint__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7364:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:7365:2: ( RULE_ID )
            {
            // InternalMyDsl.g:7365:2: ( RULE_ID )
            // InternalMyDsl.g:7366:3: RULE_ID
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
    // InternalMyDsl.g:7375:1: rule__Joint__ChildOfAssignment_2_0_0_2 : ( ( RULE_ID ) ) ;
    public final void rule__Joint__ChildOfAssignment_2_0_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7379:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:7380:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:7380:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:7381:3: ( RULE_ID )
            {
             before(grammarAccess.getJointAccess().getChildOfLinkCrossReference_2_0_0_2_0()); 
            // InternalMyDsl.g:7382:3: ( RULE_ID )
            // InternalMyDsl.g:7383:4: RULE_ID
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
    // InternalMyDsl.g:7394:1: rule__Joint__ParentOfAssignment_2_0_0_4 : ( ( RULE_ID ) ) ;
    public final void rule__Joint__ParentOfAssignment_2_0_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7398:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:7399:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:7399:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:7400:3: ( RULE_ID )
            {
             before(grammarAccess.getJointAccess().getParentOfLinkCrossReference_2_0_0_4_0()); 
            // InternalMyDsl.g:7401:3: ( RULE_ID )
            // InternalMyDsl.g:7402:4: RULE_ID
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
    // InternalMyDsl.g:7413:1: rule__Joint__TypeAssignment_2_0_0_6 : ( ruleJointType ) ;
    public final void rule__Joint__TypeAssignment_2_0_0_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7417:1: ( ( ruleJointType ) )
            // InternalMyDsl.g:7418:2: ( ruleJointType )
            {
            // InternalMyDsl.g:7418:2: ( ruleJointType )
            // InternalMyDsl.g:7419:3: ruleJointType
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
    // InternalMyDsl.g:7428:1: rule__Joint__OriginAssignment_2_0_1_0 : ( ruleOrigin ) ;
    public final void rule__Joint__OriginAssignment_2_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7432:1: ( ( ruleOrigin ) )
            // InternalMyDsl.g:7433:2: ( ruleOrigin )
            {
            // InternalMyDsl.g:7433:2: ( ruleOrigin )
            // InternalMyDsl.g:7434:3: ruleOrigin
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
    // InternalMyDsl.g:7443:1: rule__Joint__AxisAssignment_2_0_1_1 : ( ruleAxis ) ;
    public final void rule__Joint__AxisAssignment_2_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7447:1: ( ( ruleAxis ) )
            // InternalMyDsl.g:7448:2: ( ruleAxis )
            {
            // InternalMyDsl.g:7448:2: ( ruleAxis )
            // InternalMyDsl.g:7449:3: ruleAxis
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
    // InternalMyDsl.g:7458:1: rule__Joint__LimitAssignment_2_0_1_2 : ( ruleLimit ) ;
    public final void rule__Joint__LimitAssignment_2_0_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7462:1: ( ( ruleLimit ) )
            // InternalMyDsl.g:7463:2: ( ruleLimit )
            {
            // InternalMyDsl.g:7463:2: ( ruleLimit )
            // InternalMyDsl.g:7464:3: ruleLimit
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
    // InternalMyDsl.g:7473:1: rule__Joint__CalibrationAssignment_2_0_1_3 : ( ruleCalibration ) ;
    public final void rule__Joint__CalibrationAssignment_2_0_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7477:1: ( ( ruleCalibration ) )
            // InternalMyDsl.g:7478:2: ( ruleCalibration )
            {
            // InternalMyDsl.g:7478:2: ( ruleCalibration )
            // InternalMyDsl.g:7479:3: ruleCalibration
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
    // InternalMyDsl.g:7488:1: rule__Joint__DynamicsAssignment_2_0_1_4 : ( ruleDynamics ) ;
    public final void rule__Joint__DynamicsAssignment_2_0_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7492:1: ( ( ruleDynamics ) )
            // InternalMyDsl.g:7493:2: ( ruleDynamics )
            {
            // InternalMyDsl.g:7493:2: ( ruleDynamics )
            // InternalMyDsl.g:7494:3: ruleDynamics
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
    // InternalMyDsl.g:7503:1: rule__Joint__SafetycontrollerAssignment_2_0_1_5 : ( ruleSafetyController ) ;
    public final void rule__Joint__SafetycontrollerAssignment_2_0_1_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7507:1: ( ( ruleSafetyController ) )
            // InternalMyDsl.g:7508:2: ( ruleSafetyController )
            {
            // InternalMyDsl.g:7508:2: ( ruleSafetyController )
            // InternalMyDsl.g:7509:3: ruleSafetyController
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
    // InternalMyDsl.g:7518:1: rule__Joint__IsReuseOfAssignment_2_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Joint__IsReuseOfAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7522:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:7523:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:7523:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:7524:3: ( RULE_ID )
            {
             before(grammarAccess.getJointAccess().getIsReuseOfJointCrossReference_2_1_1_0()); 
            // InternalMyDsl.g:7525:3: ( RULE_ID )
            // InternalMyDsl.g:7526:4: RULE_ID
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


    // $ANTLR start "rule__Joint__ReuseAssignment_2_1_2"
    // InternalMyDsl.g:7537:1: rule__Joint__ReuseAssignment_2_1_2 : ( ruleReuse ) ;
    public final void rule__Joint__ReuseAssignment_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7541:1: ( ( ruleReuse ) )
            // InternalMyDsl.g:7542:2: ( ruleReuse )
            {
            // InternalMyDsl.g:7542:2: ( ruleReuse )
            // InternalMyDsl.g:7543:3: ruleReuse
            {
             before(grammarAccess.getJointAccess().getReuseReuseParserRuleCall_2_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleReuse();

            state._fsp--;

             after(grammarAccess.getJointAccess().getReuseReuseParserRuleCall_2_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__ReuseAssignment_2_1_2"


    // $ANTLR start "rule__Axis__NameAssignment_1"
    // InternalMyDsl.g:7552:1: rule__Axis__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Axis__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7556:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:7557:2: ( RULE_ID )
            {
            // InternalMyDsl.g:7557:2: ( RULE_ID )
            // InternalMyDsl.g:7558:3: RULE_ID
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
    // InternalMyDsl.g:7567:1: rule__Axis__XAssignment_3 : ( ruleURDFAttrINT ) ;
    public final void rule__Axis__XAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7571:1: ( ( ruleURDFAttrINT ) )
            // InternalMyDsl.g:7572:2: ( ruleURDFAttrINT )
            {
            // InternalMyDsl.g:7572:2: ( ruleURDFAttrINT )
            // InternalMyDsl.g:7573:3: ruleURDFAttrINT
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
    // InternalMyDsl.g:7582:1: rule__Axis__YAssignment_5 : ( ruleURDFAttrINT ) ;
    public final void rule__Axis__YAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7586:1: ( ( ruleURDFAttrINT ) )
            // InternalMyDsl.g:7587:2: ( ruleURDFAttrINT )
            {
            // InternalMyDsl.g:7587:2: ( ruleURDFAttrINT )
            // InternalMyDsl.g:7588:3: ruleURDFAttrINT
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
    // InternalMyDsl.g:7597:1: rule__Axis__ZAssignment_7 : ( ruleURDFAttrINT ) ;
    public final void rule__Axis__ZAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7601:1: ( ( ruleURDFAttrINT ) )
            // InternalMyDsl.g:7602:2: ( ruleURDFAttrINT )
            {
            // InternalMyDsl.g:7602:2: ( ruleURDFAttrINT )
            // InternalMyDsl.g:7603:3: ruleURDFAttrINT
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
    // InternalMyDsl.g:7612:1: rule__Limit__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Limit__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7616:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:7617:2: ( RULE_ID )
            {
            // InternalMyDsl.g:7617:2: ( RULE_ID )
            // InternalMyDsl.g:7618:3: RULE_ID
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
    // InternalMyDsl.g:7627:1: rule__Limit__EffortAssignment_3 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__Limit__EffortAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7631:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:7632:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:7632:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:7633:3: ruleURDFAttrSignedNumeric
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
    // InternalMyDsl.g:7642:1: rule__Limit__VelocityAssignment_5 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__Limit__VelocityAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7646:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:7647:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:7647:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:7648:3: ruleURDFAttrSignedNumeric
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
    // InternalMyDsl.g:7657:1: rule__Limit__LowerAssignment_7 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__Limit__LowerAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7661:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:7662:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:7662:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:7663:3: ruleURDFAttrSignedNumeric
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
    // InternalMyDsl.g:7672:1: rule__Limit__UpperAssignment_9 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__Limit__UpperAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7676:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:7677:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:7677:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:7678:3: ruleURDFAttrSignedNumeric
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
    // InternalMyDsl.g:7687:1: rule__Calibration__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Calibration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7691:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:7692:2: ( RULE_ID )
            {
            // InternalMyDsl.g:7692:2: ( RULE_ID )
            // InternalMyDsl.g:7693:3: RULE_ID
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
    // InternalMyDsl.g:7702:1: rule__Calibration__RisingAssignment_3_1 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__Calibration__RisingAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7706:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:7707:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:7707:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:7708:3: ruleURDFAttrSignedNumeric
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
    // InternalMyDsl.g:7717:1: rule__Calibration__FallingAssignment_4_1 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__Calibration__FallingAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7721:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:7722:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:7722:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:7723:3: ruleURDFAttrSignedNumeric
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
    // InternalMyDsl.g:7732:1: rule__Dynamics__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Dynamics__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7736:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:7737:2: ( RULE_ID )
            {
            // InternalMyDsl.g:7737:2: ( RULE_ID )
            // InternalMyDsl.g:7738:3: RULE_ID
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
    // InternalMyDsl.g:7747:1: rule__Dynamics__FrictionAssignment_3_1 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__Dynamics__FrictionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7751:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:7752:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:7752:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:7753:3: ruleURDFAttrSignedNumeric
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
    // InternalMyDsl.g:7762:1: rule__Dynamics__DampingAssignment_4_1 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__Dynamics__DampingAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7766:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:7767:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:7767:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:7768:3: ruleURDFAttrSignedNumeric
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
    // InternalMyDsl.g:7777:1: rule__SafetyController__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SafetyController__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7781:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:7782:2: ( RULE_ID )
            {
            // InternalMyDsl.g:7782:2: ( RULE_ID )
            // InternalMyDsl.g:7783:3: RULE_ID
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
    // InternalMyDsl.g:7792:1: rule__SafetyController__K_velocityAssignment_3 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__SafetyController__K_velocityAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7796:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:7797:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:7797:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:7798:3: ruleURDFAttrSignedNumeric
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
    // InternalMyDsl.g:7807:1: rule__SafetyController__K_positionAssignment_4_1 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__SafetyController__K_positionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7811:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:7812:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:7812:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:7813:3: ruleURDFAttrSignedNumeric
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
    // InternalMyDsl.g:7822:1: rule__SafetyController__SoftLowerLimitAssignment_5_1 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__SafetyController__SoftLowerLimitAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7826:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:7827:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:7827:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:7828:3: ruleURDFAttrSignedNumeric
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
    // InternalMyDsl.g:7837:1: rule__SafetyController__SoftUpperLimitAssignment_6_1 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__SafetyController__SoftUpperLimitAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7841:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:7842:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:7842:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:7843:3: ruleURDFAttrSignedNumeric
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


    // $ANTLR start "rule__URDFAttrSignedNumeric__ValueAssignment"
    // InternalMyDsl.g:7852:1: rule__URDFAttrSignedNumeric__ValueAssignment : ( ruleSIGNED_NUMERIC ) ;
    public final void rule__URDFAttrSignedNumeric__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7856:1: ( ( ruleSIGNED_NUMERIC ) )
            // InternalMyDsl.g:7857:2: ( ruleSIGNED_NUMERIC )
            {
            // InternalMyDsl.g:7857:2: ( ruleSIGNED_NUMERIC )
            // InternalMyDsl.g:7858:3: ruleSIGNED_NUMERIC
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
    // InternalMyDsl.g:7867:1: rule__URDFAttrFloat__ValueAssignment : ( ruleFLOAT ) ;
    public final void rule__URDFAttrFloat__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7871:1: ( ( ruleFLOAT ) )
            // InternalMyDsl.g:7872:2: ( ruleFLOAT )
            {
            // InternalMyDsl.g:7872:2: ( ruleFLOAT )
            // InternalMyDsl.g:7873:3: ruleFLOAT
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
    // InternalMyDsl.g:7882:1: rule__URDFAttrINT__ValueAssignment : ( RULE_INT ) ;
    public final void rule__URDFAttrINT__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7886:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:7887:2: ( RULE_INT )
            {
            // InternalMyDsl.g:7887:2: ( RULE_INT )
            // InternalMyDsl.g:7888:3: RULE_INT
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
    // InternalMyDsl.g:7897:1: rule__URDFAttrNumeric__ValueAssignment : ( ruleNUMERIC ) ;
    public final void rule__URDFAttrNumeric__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7901:1: ( ( ruleNUMERIC ) )
            // InternalMyDsl.g:7902:2: ( ruleNUMERIC )
            {
            // InternalMyDsl.g:7902:2: ( ruleNUMERIC )
            // InternalMyDsl.g:7903:3: ruleNUMERIC
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
    // InternalMyDsl.g:7912:1: rule__URDFAttrSTRING__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__URDFAttrSTRING__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7916:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:7917:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:7917:2: ( RULE_STRING )
            // InternalMyDsl.g:7918:3: RULE_STRING
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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x1000000000040000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x1000000000040002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000100101000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000100101000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000100101040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200000020L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x002A200C00000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x002A200000000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00C0000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001000000020L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000038000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000080000000020L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x002A200800000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000400000000020L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0004000000000020L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0010000000000020L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0100000000000020L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000800000000L,0x0000000000001243L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000800000002L,0x0000000000001243L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000020L,0x0000000000000004L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000001010L,0x0000000000000020L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000020L,0x0000000000000180L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000020L,0x0000000000000C00L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000020L,0x0000000000002000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000000L,0x000000000001C000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000001810L});

}