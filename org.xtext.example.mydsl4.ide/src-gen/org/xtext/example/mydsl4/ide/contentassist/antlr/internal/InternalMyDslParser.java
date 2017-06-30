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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'fixed'", "'+'", "'-'", "'Robot'", "'Link'", "'def'", "'reuse'", "'edit'", "'add'", "'.'", "'Inertial'", "'Inertia'", "'ixx'", "'ixy'", "'ixz'", "'iyy'", "'iyz'", "'izz'", "'Visual'", "'Geometry'", "'Material'", "'Origin'", "'x'", "'y'", "'z'", "'roll'", "'pitch'", "'yaw'", "'Mass'", "'massKilogram'", "'Collision'", "'Box'", "'height'", "'length'", "'width'", "'Cylinder'", "'radius'", "'Mesh'", "'pathToFile'", "'Sphere'", "'Texture'", "'Color'", "'red'", "'green'", "'blue'", "'alpha'", "'Joint'", "'ChildOf'", "'ParentOf'", "'Type'", "'isReuseOf'", "'e'"
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
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
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


    // $ANTLR start "entryRuleURDFAttrSignedNumeric"
    // InternalMyDsl.g:578:1: entryRuleURDFAttrSignedNumeric : ruleURDFAttrSignedNumeric EOF ;
    public final void entryRuleURDFAttrSignedNumeric() throws RecognitionException {
        try {
            // InternalMyDsl.g:579:1: ( ruleURDFAttrSignedNumeric EOF )
            // InternalMyDsl.g:580:1: ruleURDFAttrSignedNumeric EOF
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
    // InternalMyDsl.g:587:1: ruleURDFAttrSignedNumeric : ( ( rule__URDFAttrSignedNumeric__ValueAssignment ) ) ;
    public final void ruleURDFAttrSignedNumeric() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:591:2: ( ( ( rule__URDFAttrSignedNumeric__ValueAssignment ) ) )
            // InternalMyDsl.g:592:2: ( ( rule__URDFAttrSignedNumeric__ValueAssignment ) )
            {
            // InternalMyDsl.g:592:2: ( ( rule__URDFAttrSignedNumeric__ValueAssignment ) )
            // InternalMyDsl.g:593:3: ( rule__URDFAttrSignedNumeric__ValueAssignment )
            {
             before(grammarAccess.getURDFAttrSignedNumericAccess().getValueAssignment()); 
            // InternalMyDsl.g:594:3: ( rule__URDFAttrSignedNumeric__ValueAssignment )
            // InternalMyDsl.g:594:4: rule__URDFAttrSignedNumeric__ValueAssignment
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
    // InternalMyDsl.g:603:1: entryRuleURDFAttrFloat : ruleURDFAttrFloat EOF ;
    public final void entryRuleURDFAttrFloat() throws RecognitionException {
        try {
            // InternalMyDsl.g:604:1: ( ruleURDFAttrFloat EOF )
            // InternalMyDsl.g:605:1: ruleURDFAttrFloat EOF
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
    // InternalMyDsl.g:612:1: ruleURDFAttrFloat : ( ( rule__URDFAttrFloat__ValueAssignment ) ) ;
    public final void ruleURDFAttrFloat() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:616:2: ( ( ( rule__URDFAttrFloat__ValueAssignment ) ) )
            // InternalMyDsl.g:617:2: ( ( rule__URDFAttrFloat__ValueAssignment ) )
            {
            // InternalMyDsl.g:617:2: ( ( rule__URDFAttrFloat__ValueAssignment ) )
            // InternalMyDsl.g:618:3: ( rule__URDFAttrFloat__ValueAssignment )
            {
             before(grammarAccess.getURDFAttrFloatAccess().getValueAssignment()); 
            // InternalMyDsl.g:619:3: ( rule__URDFAttrFloat__ValueAssignment )
            // InternalMyDsl.g:619:4: rule__URDFAttrFloat__ValueAssignment
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


    // $ANTLR start "entryRuleURDFAttrNumeric"
    // InternalMyDsl.g:628:1: entryRuleURDFAttrNumeric : ruleURDFAttrNumeric EOF ;
    public final void entryRuleURDFAttrNumeric() throws RecognitionException {
        try {
            // InternalMyDsl.g:629:1: ( ruleURDFAttrNumeric EOF )
            // InternalMyDsl.g:630:1: ruleURDFAttrNumeric EOF
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
    // InternalMyDsl.g:637:1: ruleURDFAttrNumeric : ( ( rule__URDFAttrNumeric__ValueAssignment ) ) ;
    public final void ruleURDFAttrNumeric() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:641:2: ( ( ( rule__URDFAttrNumeric__ValueAssignment ) ) )
            // InternalMyDsl.g:642:2: ( ( rule__URDFAttrNumeric__ValueAssignment ) )
            {
            // InternalMyDsl.g:642:2: ( ( rule__URDFAttrNumeric__ValueAssignment ) )
            // InternalMyDsl.g:643:3: ( rule__URDFAttrNumeric__ValueAssignment )
            {
             before(grammarAccess.getURDFAttrNumericAccess().getValueAssignment()); 
            // InternalMyDsl.g:644:3: ( rule__URDFAttrNumeric__ValueAssignment )
            // InternalMyDsl.g:644:4: rule__URDFAttrNumeric__ValueAssignment
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
    // InternalMyDsl.g:653:1: entryRuleURDFAttrSTRING : ruleURDFAttrSTRING EOF ;
    public final void entryRuleURDFAttrSTRING() throws RecognitionException {
        try {
            // InternalMyDsl.g:654:1: ( ruleURDFAttrSTRING EOF )
            // InternalMyDsl.g:655:1: ruleURDFAttrSTRING EOF
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
    // InternalMyDsl.g:662:1: ruleURDFAttrSTRING : ( ( rule__URDFAttrSTRING__ValueAssignment ) ) ;
    public final void ruleURDFAttrSTRING() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:666:2: ( ( ( rule__URDFAttrSTRING__ValueAssignment ) ) )
            // InternalMyDsl.g:667:2: ( ( rule__URDFAttrSTRING__ValueAssignment ) )
            {
            // InternalMyDsl.g:667:2: ( ( rule__URDFAttrSTRING__ValueAssignment ) )
            // InternalMyDsl.g:668:3: ( rule__URDFAttrSTRING__ValueAssignment )
            {
             before(grammarAccess.getURDFAttrSTRINGAccess().getValueAssignment()); 
            // InternalMyDsl.g:669:3: ( rule__URDFAttrSTRING__ValueAssignment )
            // InternalMyDsl.g:669:4: rule__URDFAttrSTRING__ValueAssignment
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
    // InternalMyDsl.g:678:1: entryRuleFLOAT : ruleFLOAT EOF ;
    public final void entryRuleFLOAT() throws RecognitionException {
        try {
            // InternalMyDsl.g:679:1: ( ruleFLOAT EOF )
            // InternalMyDsl.g:680:1: ruleFLOAT EOF
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
    // InternalMyDsl.g:687:1: ruleFLOAT : ( ( rule__FLOAT__Group__0 ) ) ;
    public final void ruleFLOAT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:691:2: ( ( ( rule__FLOAT__Group__0 ) ) )
            // InternalMyDsl.g:692:2: ( ( rule__FLOAT__Group__0 ) )
            {
            // InternalMyDsl.g:692:2: ( ( rule__FLOAT__Group__0 ) )
            // InternalMyDsl.g:693:3: ( rule__FLOAT__Group__0 )
            {
             before(grammarAccess.getFLOATAccess().getGroup()); 
            // InternalMyDsl.g:694:3: ( rule__FLOAT__Group__0 )
            // InternalMyDsl.g:694:4: rule__FLOAT__Group__0
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
    // InternalMyDsl.g:703:1: entryRuleSCIENTIFIC : ruleSCIENTIFIC EOF ;
    public final void entryRuleSCIENTIFIC() throws RecognitionException {
        try {
            // InternalMyDsl.g:704:1: ( ruleSCIENTIFIC EOF )
            // InternalMyDsl.g:705:1: ruleSCIENTIFIC EOF
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
    // InternalMyDsl.g:712:1: ruleSCIENTIFIC : ( ( rule__SCIENTIFIC__Group__0 ) ) ;
    public final void ruleSCIENTIFIC() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:716:2: ( ( ( rule__SCIENTIFIC__Group__0 ) ) )
            // InternalMyDsl.g:717:2: ( ( rule__SCIENTIFIC__Group__0 ) )
            {
            // InternalMyDsl.g:717:2: ( ( rule__SCIENTIFIC__Group__0 ) )
            // InternalMyDsl.g:718:3: ( rule__SCIENTIFIC__Group__0 )
            {
             before(grammarAccess.getSCIENTIFICAccess().getGroup()); 
            // InternalMyDsl.g:719:3: ( rule__SCIENTIFIC__Group__0 )
            // InternalMyDsl.g:719:4: rule__SCIENTIFIC__Group__0
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
    // InternalMyDsl.g:728:1: entryRuleSIGNED_NUMERIC : ruleSIGNED_NUMERIC EOF ;
    public final void entryRuleSIGNED_NUMERIC() throws RecognitionException {
        try {
            // InternalMyDsl.g:729:1: ( ruleSIGNED_NUMERIC EOF )
            // InternalMyDsl.g:730:1: ruleSIGNED_NUMERIC EOF
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
    // InternalMyDsl.g:737:1: ruleSIGNED_NUMERIC : ( ( rule__SIGNED_NUMERIC__Group__0 ) ) ;
    public final void ruleSIGNED_NUMERIC() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:741:2: ( ( ( rule__SIGNED_NUMERIC__Group__0 ) ) )
            // InternalMyDsl.g:742:2: ( ( rule__SIGNED_NUMERIC__Group__0 ) )
            {
            // InternalMyDsl.g:742:2: ( ( rule__SIGNED_NUMERIC__Group__0 ) )
            // InternalMyDsl.g:743:3: ( rule__SIGNED_NUMERIC__Group__0 )
            {
             before(grammarAccess.getSIGNED_NUMERICAccess().getGroup()); 
            // InternalMyDsl.g:744:3: ( rule__SIGNED_NUMERIC__Group__0 )
            // InternalMyDsl.g:744:4: rule__SIGNED_NUMERIC__Group__0
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
    // InternalMyDsl.g:753:1: entryRuleNUMERIC : ruleNUMERIC EOF ;
    public final void entryRuleNUMERIC() throws RecognitionException {
        try {
            // InternalMyDsl.g:754:1: ( ruleNUMERIC EOF )
            // InternalMyDsl.g:755:1: ruleNUMERIC EOF
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
    // InternalMyDsl.g:762:1: ruleNUMERIC : ( ( rule__NUMERIC__Alternatives ) ) ;
    public final void ruleNUMERIC() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:766:2: ( ( ( rule__NUMERIC__Alternatives ) ) )
            // InternalMyDsl.g:767:2: ( ( rule__NUMERIC__Alternatives ) )
            {
            // InternalMyDsl.g:767:2: ( ( rule__NUMERIC__Alternatives ) )
            // InternalMyDsl.g:768:3: ( rule__NUMERIC__Alternatives )
            {
             before(grammarAccess.getNUMERICAccess().getAlternatives()); 
            // InternalMyDsl.g:769:3: ( rule__NUMERIC__Alternatives )
            // InternalMyDsl.g:769:4: rule__NUMERIC__Alternatives
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
    // InternalMyDsl.g:778:1: ruleJointType : ( ( 'fixed' ) ) ;
    public final void ruleJointType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:782:1: ( ( ( 'fixed' ) ) )
            // InternalMyDsl.g:783:2: ( ( 'fixed' ) )
            {
            // InternalMyDsl.g:783:2: ( ( 'fixed' ) )
            // InternalMyDsl.g:784:3: ( 'fixed' )
            {
             before(grammarAccess.getJointTypeAccess().getFixedEnumLiteralDeclaration()); 
            // InternalMyDsl.g:785:3: ( 'fixed' )
            // InternalMyDsl.g:785:4: 'fixed'
            {
            match(input,11,FOLLOW_2); 

            }

             after(grammarAccess.getJointTypeAccess().getFixedEnumLiteralDeclaration()); 

            }


            }

        }
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
    // InternalMyDsl.g:793:1: rule__Robot__Alternatives_2 : ( ( ( rule__Robot__LinksAssignment_2_0 ) ) | ( ( rule__Robot__JointAssignment_2_1 ) ) );
    public final void rule__Robot__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:797:1: ( ( ( rule__Robot__LinksAssignment_2_0 ) ) | ( ( rule__Robot__JointAssignment_2_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==15) ) {
                alt1=1;
            }
            else if ( (LA1_0==57) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:798:2: ( ( rule__Robot__LinksAssignment_2_0 ) )
                    {
                    // InternalMyDsl.g:798:2: ( ( rule__Robot__LinksAssignment_2_0 ) )
                    // InternalMyDsl.g:799:3: ( rule__Robot__LinksAssignment_2_0 )
                    {
                     before(grammarAccess.getRobotAccess().getLinksAssignment_2_0()); 
                    // InternalMyDsl.g:800:3: ( rule__Robot__LinksAssignment_2_0 )
                    // InternalMyDsl.g:800:4: rule__Robot__LinksAssignment_2_0
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
                    // InternalMyDsl.g:804:2: ( ( rule__Robot__JointAssignment_2_1 ) )
                    {
                    // InternalMyDsl.g:804:2: ( ( rule__Robot__JointAssignment_2_1 ) )
                    // InternalMyDsl.g:805:3: ( rule__Robot__JointAssignment_2_1 )
                    {
                     before(grammarAccess.getRobotAccess().getJointAssignment_2_1()); 
                    // InternalMyDsl.g:806:3: ( rule__Robot__JointAssignment_2_1 )
                    // InternalMyDsl.g:806:4: rule__Robot__JointAssignment_2_1
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
    // InternalMyDsl.g:814:1: rule__ReUseAble__Alternatives : ( ( ruleLink ) | ( ruleVisual ) | ( ruleInertial ) | ( ruleCollision ) );
    public final void rule__ReUseAble__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:818:1: ( ( ruleLink ) | ( ruleVisual ) | ( ruleInertial ) | ( ruleCollision ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt2=1;
                }
                break;
            case 29:
                {
                alt2=2;
                }
                break;
            case 21:
                {
                alt2=3;
                }
                break;
            case 41:
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
                    // InternalMyDsl.g:819:2: ( ruleLink )
                    {
                    // InternalMyDsl.g:819:2: ( ruleLink )
                    // InternalMyDsl.g:820:3: ruleLink
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
                    // InternalMyDsl.g:825:2: ( ruleVisual )
                    {
                    // InternalMyDsl.g:825:2: ( ruleVisual )
                    // InternalMyDsl.g:826:3: ruleVisual
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
                    // InternalMyDsl.g:831:2: ( ruleInertial )
                    {
                    // InternalMyDsl.g:831:2: ( ruleInertial )
                    // InternalMyDsl.g:832:3: ruleInertial
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
                    // InternalMyDsl.g:837:2: ( ruleCollision )
                    {
                    // InternalMyDsl.g:837:2: ( ruleCollision )
                    // InternalMyDsl.g:838:3: ruleCollision
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
    // InternalMyDsl.g:847:1: rule__Link__Alternatives_3 : ( ( ( rule__Link__Group_3_0__0 ) ) | ( ( rule__Link__Group_3_1__0 ) ) );
    public final void rule__Link__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:851:1: ( ( ( rule__Link__Group_3_0__0 ) ) | ( ( rule__Link__Group_3_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            else if ( (LA3_0==17) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:852:2: ( ( rule__Link__Group_3_0__0 ) )
                    {
                    // InternalMyDsl.g:852:2: ( ( rule__Link__Group_3_0__0 ) )
                    // InternalMyDsl.g:853:3: ( rule__Link__Group_3_0__0 )
                    {
                     before(grammarAccess.getLinkAccess().getGroup_3_0()); 
                    // InternalMyDsl.g:854:3: ( rule__Link__Group_3_0__0 )
                    // InternalMyDsl.g:854:4: rule__Link__Group_3_0__0
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
                    // InternalMyDsl.g:858:2: ( ( rule__Link__Group_3_1__0 ) )
                    {
                    // InternalMyDsl.g:858:2: ( ( rule__Link__Group_3_1__0 ) )
                    // InternalMyDsl.g:859:3: ( rule__Link__Group_3_1__0 )
                    {
                     before(grammarAccess.getLinkAccess().getGroup_3_1()); 
                    // InternalMyDsl.g:860:3: ( rule__Link__Group_3_1__0 )
                    // InternalMyDsl.g:860:4: rule__Link__Group_3_1__0
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
    // InternalMyDsl.g:868:1: rule__Link__Alternatives_3_0_1 : ( ( ( rule__Link__InertialAssignment_3_0_1_0 ) ) | ( ( rule__Link__VisualAssignment_3_0_1_1 ) ) | ( ( rule__Link__CollisionAssignment_3_0_1_2 ) ) );
    public final void rule__Link__Alternatives_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:872:1: ( ( ( rule__Link__InertialAssignment_3_0_1_0 ) ) | ( ( rule__Link__VisualAssignment_3_0_1_1 ) ) | ( ( rule__Link__CollisionAssignment_3_0_1_2 ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt4=1;
                }
                break;
            case 29:
                {
                alt4=2;
                }
                break;
            case 41:
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
                    // InternalMyDsl.g:873:2: ( ( rule__Link__InertialAssignment_3_0_1_0 ) )
                    {
                    // InternalMyDsl.g:873:2: ( ( rule__Link__InertialAssignment_3_0_1_0 ) )
                    // InternalMyDsl.g:874:3: ( rule__Link__InertialAssignment_3_0_1_0 )
                    {
                     before(grammarAccess.getLinkAccess().getInertialAssignment_3_0_1_0()); 
                    // InternalMyDsl.g:875:3: ( rule__Link__InertialAssignment_3_0_1_0 )
                    // InternalMyDsl.g:875:4: rule__Link__InertialAssignment_3_0_1_0
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
                    // InternalMyDsl.g:879:2: ( ( rule__Link__VisualAssignment_3_0_1_1 ) )
                    {
                    // InternalMyDsl.g:879:2: ( ( rule__Link__VisualAssignment_3_0_1_1 ) )
                    // InternalMyDsl.g:880:3: ( rule__Link__VisualAssignment_3_0_1_1 )
                    {
                     before(grammarAccess.getLinkAccess().getVisualAssignment_3_0_1_1()); 
                    // InternalMyDsl.g:881:3: ( rule__Link__VisualAssignment_3_0_1_1 )
                    // InternalMyDsl.g:881:4: rule__Link__VisualAssignment_3_0_1_1
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
                    // InternalMyDsl.g:885:2: ( ( rule__Link__CollisionAssignment_3_0_1_2 ) )
                    {
                    // InternalMyDsl.g:885:2: ( ( rule__Link__CollisionAssignment_3_0_1_2 ) )
                    // InternalMyDsl.g:886:3: ( rule__Link__CollisionAssignment_3_0_1_2 )
                    {
                     before(grammarAccess.getLinkAccess().getCollisionAssignment_3_0_1_2()); 
                    // InternalMyDsl.g:887:3: ( rule__Link__CollisionAssignment_3_0_1_2 )
                    // InternalMyDsl.g:887:4: rule__Link__CollisionAssignment_3_0_1_2
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
    // InternalMyDsl.g:895:1: rule__Reuse__Alternatives_1 : ( ( ( rule__Reuse__Group_1_0__0 ) ) | ( ( rule__Reuse__Group_1_1__0 ) ) );
    public final void rule__Reuse__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:899:1: ( ( ( rule__Reuse__Group_1_0__0 ) ) | ( ( rule__Reuse__Group_1_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            else if ( (LA5_0==19) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:900:2: ( ( rule__Reuse__Group_1_0__0 ) )
                    {
                    // InternalMyDsl.g:900:2: ( ( rule__Reuse__Group_1_0__0 ) )
                    // InternalMyDsl.g:901:3: ( rule__Reuse__Group_1_0__0 )
                    {
                     before(grammarAccess.getReuseAccess().getGroup_1_0()); 
                    // InternalMyDsl.g:902:3: ( rule__Reuse__Group_1_0__0 )
                    // InternalMyDsl.g:902:4: rule__Reuse__Group_1_0__0
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
                    // InternalMyDsl.g:906:2: ( ( rule__Reuse__Group_1_1__0 ) )
                    {
                    // InternalMyDsl.g:906:2: ( ( rule__Reuse__Group_1_1__0 ) )
                    // InternalMyDsl.g:907:3: ( rule__Reuse__Group_1_1__0 )
                    {
                     before(grammarAccess.getReuseAccess().getGroup_1_1()); 
                    // InternalMyDsl.g:908:3: ( rule__Reuse__Group_1_1__0 )
                    // InternalMyDsl.g:908:4: rule__Reuse__Group_1_1__0
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
    // InternalMyDsl.g:916:1: rule__Geometry__Alternatives : ( ( ruleBox ) | ( ruleCylinder ) | ( ruleMesh ) | ( ruleSphere ) );
    public final void rule__Geometry__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:920:1: ( ( ruleBox ) | ( ruleCylinder ) | ( ruleMesh ) | ( ruleSphere ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt6=1;
                }
                break;
            case 46:
                {
                alt6=2;
                }
                break;
            case 48:
                {
                alt6=3;
                }
                break;
            case 50:
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
                    // InternalMyDsl.g:921:2: ( ruleBox )
                    {
                    // InternalMyDsl.g:921:2: ( ruleBox )
                    // InternalMyDsl.g:922:3: ruleBox
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
                    // InternalMyDsl.g:927:2: ( ruleCylinder )
                    {
                    // InternalMyDsl.g:927:2: ( ruleCylinder )
                    // InternalMyDsl.g:928:3: ruleCylinder
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
                    // InternalMyDsl.g:933:2: ( ruleMesh )
                    {
                    // InternalMyDsl.g:933:2: ( ruleMesh )
                    // InternalMyDsl.g:934:3: ruleMesh
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
                    // InternalMyDsl.g:939:2: ( ruleSphere )
                    {
                    // InternalMyDsl.g:939:2: ( ruleSphere )
                    // InternalMyDsl.g:940:3: ruleSphere
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
    // InternalMyDsl.g:949:1: rule__Material__Alternatives : ( ( ruleTexture ) | ( ruleColor ) );
    public final void rule__Material__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:953:1: ( ( ruleTexture ) | ( ruleColor ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==51) ) {
                alt7=1;
            }
            else if ( (LA7_0==52) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:954:2: ( ruleTexture )
                    {
                    // InternalMyDsl.g:954:2: ( ruleTexture )
                    // InternalMyDsl.g:955:3: ruleTexture
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
                    // InternalMyDsl.g:960:2: ( ruleColor )
                    {
                    // InternalMyDsl.g:960:2: ( ruleColor )
                    // InternalMyDsl.g:961:3: ruleColor
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


    // $ANTLR start "rule__SCIENTIFIC__Alternatives_2"
    // InternalMyDsl.g:970:1: rule__SCIENTIFIC__Alternatives_2 : ( ( '+' ) | ( '-' ) );
    public final void rule__SCIENTIFIC__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:974:1: ( ( '+' ) | ( '-' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==12) ) {
                alt8=1;
            }
            else if ( (LA8_0==13) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:975:2: ( '+' )
                    {
                    // InternalMyDsl.g:975:2: ( '+' )
                    // InternalMyDsl.g:976:3: '+'
                    {
                     before(grammarAccess.getSCIENTIFICAccess().getPlusSignKeyword_2_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getSCIENTIFICAccess().getPlusSignKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:981:2: ( '-' )
                    {
                    // InternalMyDsl.g:981:2: ( '-' )
                    // InternalMyDsl.g:982:3: '-'
                    {
                     before(grammarAccess.getSCIENTIFICAccess().getHyphenMinusKeyword_2_1()); 
                    match(input,13,FOLLOW_2); 
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
    // InternalMyDsl.g:991:1: rule__SIGNED_NUMERIC__Alternatives_1 : ( ( RULE_INT ) | ( ruleFLOAT ) | ( ruleSCIENTIFIC ) );
    public final void rule__SIGNED_NUMERIC__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:995:1: ( ( RULE_INT ) | ( ruleFLOAT ) | ( ruleSCIENTIFIC ) )
            int alt9=3;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_INT) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==20) ) {
                    int LA9_2 = input.LA(3);

                    if ( (LA9_2==RULE_INT) ) {
                        int LA9_4 = input.LA(4);

                        if ( (LA9_4==EOF||LA9_4==15||LA9_4==21||(LA9_4>=24 && LA9_4<=29)||(LA9_4>=31 && LA9_4<=32)||(LA9_4>=34 && LA9_4<=39)||LA9_4==41||LA9_4==57) ) {
                            alt9=2;
                        }
                        else if ( (LA9_4==62) ) {
                            alt9=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 9, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA9_1==EOF||LA9_1==15||LA9_1==21||(LA9_1>=24 && LA9_1<=29)||(LA9_1>=31 && LA9_1<=32)||(LA9_1>=34 && LA9_1<=39)||LA9_1==41||LA9_1==57) ) {
                    alt9=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:996:2: ( RULE_INT )
                    {
                    // InternalMyDsl.g:996:2: ( RULE_INT )
                    // InternalMyDsl.g:997:3: RULE_INT
                    {
                     before(grammarAccess.getSIGNED_NUMERICAccess().getINTTerminalRuleCall_1_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getSIGNED_NUMERICAccess().getINTTerminalRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1002:2: ( ruleFLOAT )
                    {
                    // InternalMyDsl.g:1002:2: ( ruleFLOAT )
                    // InternalMyDsl.g:1003:3: ruleFLOAT
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
                    // InternalMyDsl.g:1008:2: ( ruleSCIENTIFIC )
                    {
                    // InternalMyDsl.g:1008:2: ( ruleSCIENTIFIC )
                    // InternalMyDsl.g:1009:3: ruleSCIENTIFIC
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
    // InternalMyDsl.g:1018:1: rule__NUMERIC__Alternatives : ( ( RULE_INT ) | ( ruleFLOAT ) | ( ruleSCIENTIFIC ) );
    public final void rule__NUMERIC__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1022:1: ( ( RULE_INT ) | ( ruleFLOAT ) | ( ruleSCIENTIFIC ) )
            int alt10=3;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_INT) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==EOF||LA10_1==15||LA10_1==21||LA10_1==29||(LA10_1>=31 && LA10_1<=32)||(LA10_1>=41 && LA10_1<=42)||(LA10_1>=44 && LA10_1<=46)||LA10_1==48||LA10_1==50||LA10_1==57) ) {
                    alt10=1;
                }
                else if ( (LA10_1==20) ) {
                    int LA10_3 = input.LA(3);

                    if ( (LA10_3==RULE_INT) ) {
                        int LA10_4 = input.LA(4);

                        if ( (LA10_4==62) ) {
                            alt10=3;
                        }
                        else if ( (LA10_4==EOF||LA10_4==15||LA10_4==21||LA10_4==29||(LA10_4>=31 && LA10_4<=32)||(LA10_4>=41 && LA10_4<=42)||(LA10_4>=44 && LA10_4<=46)||LA10_4==48||LA10_4==50||LA10_4==57) ) {
                            alt10=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 10, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:1023:2: ( RULE_INT )
                    {
                    // InternalMyDsl.g:1023:2: ( RULE_INT )
                    // InternalMyDsl.g:1024:3: RULE_INT
                    {
                     before(grammarAccess.getNUMERICAccess().getINTTerminalRuleCall_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getNUMERICAccess().getINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1029:2: ( ruleFLOAT )
                    {
                    // InternalMyDsl.g:1029:2: ( ruleFLOAT )
                    // InternalMyDsl.g:1030:3: ruleFLOAT
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
                    // InternalMyDsl.g:1035:2: ( ruleSCIENTIFIC )
                    {
                    // InternalMyDsl.g:1035:2: ( ruleSCIENTIFIC )
                    // InternalMyDsl.g:1036:3: ruleSCIENTIFIC
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


    // $ANTLR start "rule__Robot__Group__0"
    // InternalMyDsl.g:1045:1: rule__Robot__Group__0 : rule__Robot__Group__0__Impl rule__Robot__Group__1 ;
    public final void rule__Robot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1049:1: ( rule__Robot__Group__0__Impl rule__Robot__Group__1 )
            // InternalMyDsl.g:1050:2: rule__Robot__Group__0__Impl rule__Robot__Group__1
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
    // InternalMyDsl.g:1057:1: rule__Robot__Group__0__Impl : ( 'Robot' ) ;
    public final void rule__Robot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1061:1: ( ( 'Robot' ) )
            // InternalMyDsl.g:1062:1: ( 'Robot' )
            {
            // InternalMyDsl.g:1062:1: ( 'Robot' )
            // InternalMyDsl.g:1063:2: 'Robot'
            {
             before(grammarAccess.getRobotAccess().getRobotKeyword_0()); 
            match(input,14,FOLLOW_2); 
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
    // InternalMyDsl.g:1072:1: rule__Robot__Group__1 : rule__Robot__Group__1__Impl rule__Robot__Group__2 ;
    public final void rule__Robot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1076:1: ( rule__Robot__Group__1__Impl rule__Robot__Group__2 )
            // InternalMyDsl.g:1077:2: rule__Robot__Group__1__Impl rule__Robot__Group__2
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
    // InternalMyDsl.g:1084:1: rule__Robot__Group__1__Impl : ( ( rule__Robot__NameAssignment_1 ) ) ;
    public final void rule__Robot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1088:1: ( ( ( rule__Robot__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1089:1: ( ( rule__Robot__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1089:1: ( ( rule__Robot__NameAssignment_1 ) )
            // InternalMyDsl.g:1090:2: ( rule__Robot__NameAssignment_1 )
            {
             before(grammarAccess.getRobotAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1091:2: ( rule__Robot__NameAssignment_1 )
            // InternalMyDsl.g:1091:3: rule__Robot__NameAssignment_1
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
    // InternalMyDsl.g:1099:1: rule__Robot__Group__2 : rule__Robot__Group__2__Impl ;
    public final void rule__Robot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1103:1: ( rule__Robot__Group__2__Impl )
            // InternalMyDsl.g:1104:2: rule__Robot__Group__2__Impl
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
    // InternalMyDsl.g:1110:1: rule__Robot__Group__2__Impl : ( ( rule__Robot__Alternatives_2 )* ) ;
    public final void rule__Robot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1114:1: ( ( ( rule__Robot__Alternatives_2 )* ) )
            // InternalMyDsl.g:1115:1: ( ( rule__Robot__Alternatives_2 )* )
            {
            // InternalMyDsl.g:1115:1: ( ( rule__Robot__Alternatives_2 )* )
            // InternalMyDsl.g:1116:2: ( rule__Robot__Alternatives_2 )*
            {
             before(grammarAccess.getRobotAccess().getAlternatives_2()); 
            // InternalMyDsl.g:1117:2: ( rule__Robot__Alternatives_2 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==15||LA11_0==57) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:1117:3: rule__Robot__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Robot__Alternatives_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalMyDsl.g:1126:1: rule__Link__Group__0 : rule__Link__Group__0__Impl rule__Link__Group__1 ;
    public final void rule__Link__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1130:1: ( rule__Link__Group__0__Impl rule__Link__Group__1 )
            // InternalMyDsl.g:1131:2: rule__Link__Group__0__Impl rule__Link__Group__1
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
    // InternalMyDsl.g:1138:1: rule__Link__Group__0__Impl : ( () ) ;
    public final void rule__Link__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1142:1: ( ( () ) )
            // InternalMyDsl.g:1143:1: ( () )
            {
            // InternalMyDsl.g:1143:1: ( () )
            // InternalMyDsl.g:1144:2: ()
            {
             before(grammarAccess.getLinkAccess().getLinkAction_0()); 
            // InternalMyDsl.g:1145:2: ()
            // InternalMyDsl.g:1145:3: 
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
    // InternalMyDsl.g:1153:1: rule__Link__Group__1 : rule__Link__Group__1__Impl rule__Link__Group__2 ;
    public final void rule__Link__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1157:1: ( rule__Link__Group__1__Impl rule__Link__Group__2 )
            // InternalMyDsl.g:1158:2: rule__Link__Group__1__Impl rule__Link__Group__2
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
    // InternalMyDsl.g:1165:1: rule__Link__Group__1__Impl : ( 'Link' ) ;
    public final void rule__Link__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1169:1: ( ( 'Link' ) )
            // InternalMyDsl.g:1170:1: ( 'Link' )
            {
            // InternalMyDsl.g:1170:1: ( 'Link' )
            // InternalMyDsl.g:1171:2: 'Link'
            {
             before(grammarAccess.getLinkAccess().getLinkKeyword_1()); 
            match(input,15,FOLLOW_2); 
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
    // InternalMyDsl.g:1180:1: rule__Link__Group__2 : rule__Link__Group__2__Impl rule__Link__Group__3 ;
    public final void rule__Link__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1184:1: ( rule__Link__Group__2__Impl rule__Link__Group__3 )
            // InternalMyDsl.g:1185:2: rule__Link__Group__2__Impl rule__Link__Group__3
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
    // InternalMyDsl.g:1192:1: rule__Link__Group__2__Impl : ( ( rule__Link__NameAssignment_2 ) ) ;
    public final void rule__Link__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1196:1: ( ( ( rule__Link__NameAssignment_2 ) ) )
            // InternalMyDsl.g:1197:1: ( ( rule__Link__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:1197:1: ( ( rule__Link__NameAssignment_2 ) )
            // InternalMyDsl.g:1198:2: ( rule__Link__NameAssignment_2 )
            {
             before(grammarAccess.getLinkAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:1199:2: ( rule__Link__NameAssignment_2 )
            // InternalMyDsl.g:1199:3: rule__Link__NameAssignment_2
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
    // InternalMyDsl.g:1207:1: rule__Link__Group__3 : rule__Link__Group__3__Impl ;
    public final void rule__Link__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1211:1: ( rule__Link__Group__3__Impl )
            // InternalMyDsl.g:1212:2: rule__Link__Group__3__Impl
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
    // InternalMyDsl.g:1218:1: rule__Link__Group__3__Impl : ( ( rule__Link__Alternatives_3 )? ) ;
    public final void rule__Link__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1222:1: ( ( ( rule__Link__Alternatives_3 )? ) )
            // InternalMyDsl.g:1223:1: ( ( rule__Link__Alternatives_3 )? )
            {
            // InternalMyDsl.g:1223:1: ( ( rule__Link__Alternatives_3 )? )
            // InternalMyDsl.g:1224:2: ( rule__Link__Alternatives_3 )?
            {
             before(grammarAccess.getLinkAccess().getAlternatives_3()); 
            // InternalMyDsl.g:1225:2: ( rule__Link__Alternatives_3 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=16 && LA12_0<=17)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:1225:3: rule__Link__Alternatives_3
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
    // InternalMyDsl.g:1234:1: rule__Link__Group_3_0__0 : rule__Link__Group_3_0__0__Impl rule__Link__Group_3_0__1 ;
    public final void rule__Link__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1238:1: ( rule__Link__Group_3_0__0__Impl rule__Link__Group_3_0__1 )
            // InternalMyDsl.g:1239:2: rule__Link__Group_3_0__0__Impl rule__Link__Group_3_0__1
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
    // InternalMyDsl.g:1246:1: rule__Link__Group_3_0__0__Impl : ( 'def' ) ;
    public final void rule__Link__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1250:1: ( ( 'def' ) )
            // InternalMyDsl.g:1251:1: ( 'def' )
            {
            // InternalMyDsl.g:1251:1: ( 'def' )
            // InternalMyDsl.g:1252:2: 'def'
            {
             before(grammarAccess.getLinkAccess().getDefKeyword_3_0_0()); 
            match(input,16,FOLLOW_2); 
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
    // InternalMyDsl.g:1261:1: rule__Link__Group_3_0__1 : rule__Link__Group_3_0__1__Impl ;
    public final void rule__Link__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1265:1: ( rule__Link__Group_3_0__1__Impl )
            // InternalMyDsl.g:1266:2: rule__Link__Group_3_0__1__Impl
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
    // InternalMyDsl.g:1272:1: rule__Link__Group_3_0__1__Impl : ( ( rule__Link__Alternatives_3_0_1 )* ) ;
    public final void rule__Link__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1276:1: ( ( ( rule__Link__Alternatives_3_0_1 )* ) )
            // InternalMyDsl.g:1277:1: ( ( rule__Link__Alternatives_3_0_1 )* )
            {
            // InternalMyDsl.g:1277:1: ( ( rule__Link__Alternatives_3_0_1 )* )
            // InternalMyDsl.g:1278:2: ( rule__Link__Alternatives_3_0_1 )*
            {
             before(grammarAccess.getLinkAccess().getAlternatives_3_0_1()); 
            // InternalMyDsl.g:1279:2: ( rule__Link__Alternatives_3_0_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==21||LA13_0==29||LA13_0==41) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:1279:3: rule__Link__Alternatives_3_0_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Link__Alternatives_3_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalMyDsl.g:1288:1: rule__Link__Group_3_1__0 : rule__Link__Group_3_1__0__Impl rule__Link__Group_3_1__1 ;
    public final void rule__Link__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1292:1: ( rule__Link__Group_3_1__0__Impl rule__Link__Group_3_1__1 )
            // InternalMyDsl.g:1293:2: rule__Link__Group_3_1__0__Impl rule__Link__Group_3_1__1
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
    // InternalMyDsl.g:1300:1: rule__Link__Group_3_1__0__Impl : ( 'reuse' ) ;
    public final void rule__Link__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1304:1: ( ( 'reuse' ) )
            // InternalMyDsl.g:1305:1: ( 'reuse' )
            {
            // InternalMyDsl.g:1305:1: ( 'reuse' )
            // InternalMyDsl.g:1306:2: 'reuse'
            {
             before(grammarAccess.getLinkAccess().getReuseKeyword_3_1_0()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMyDsl.g:1315:1: rule__Link__Group_3_1__1 : rule__Link__Group_3_1__1__Impl rule__Link__Group_3_1__2 ;
    public final void rule__Link__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1319:1: ( rule__Link__Group_3_1__1__Impl rule__Link__Group_3_1__2 )
            // InternalMyDsl.g:1320:2: rule__Link__Group_3_1__1__Impl rule__Link__Group_3_1__2
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
    // InternalMyDsl.g:1327:1: rule__Link__Group_3_1__1__Impl : ( ( rule__Link__LinkAssignment_3_1_1 ) ) ;
    public final void rule__Link__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1331:1: ( ( ( rule__Link__LinkAssignment_3_1_1 ) ) )
            // InternalMyDsl.g:1332:1: ( ( rule__Link__LinkAssignment_3_1_1 ) )
            {
            // InternalMyDsl.g:1332:1: ( ( rule__Link__LinkAssignment_3_1_1 ) )
            // InternalMyDsl.g:1333:2: ( rule__Link__LinkAssignment_3_1_1 )
            {
             before(grammarAccess.getLinkAccess().getLinkAssignment_3_1_1()); 
            // InternalMyDsl.g:1334:2: ( rule__Link__LinkAssignment_3_1_1 )
            // InternalMyDsl.g:1334:3: rule__Link__LinkAssignment_3_1_1
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
    // InternalMyDsl.g:1342:1: rule__Link__Group_3_1__2 : rule__Link__Group_3_1__2__Impl ;
    public final void rule__Link__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1346:1: ( rule__Link__Group_3_1__2__Impl )
            // InternalMyDsl.g:1347:2: rule__Link__Group_3_1__2__Impl
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
    // InternalMyDsl.g:1353:1: rule__Link__Group_3_1__2__Impl : ( ( rule__Link__ReuseAssignment_3_1_2 ) ) ;
    public final void rule__Link__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1357:1: ( ( ( rule__Link__ReuseAssignment_3_1_2 ) ) )
            // InternalMyDsl.g:1358:1: ( ( rule__Link__ReuseAssignment_3_1_2 ) )
            {
            // InternalMyDsl.g:1358:1: ( ( rule__Link__ReuseAssignment_3_1_2 ) )
            // InternalMyDsl.g:1359:2: ( rule__Link__ReuseAssignment_3_1_2 )
            {
             before(grammarAccess.getLinkAccess().getReuseAssignment_3_1_2()); 
            // InternalMyDsl.g:1360:2: ( rule__Link__ReuseAssignment_3_1_2 )
            // InternalMyDsl.g:1360:3: rule__Link__ReuseAssignment_3_1_2
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
    // InternalMyDsl.g:1369:1: rule__Reuse__Group__0 : rule__Reuse__Group__0__Impl rule__Reuse__Group__1 ;
    public final void rule__Reuse__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1373:1: ( rule__Reuse__Group__0__Impl rule__Reuse__Group__1 )
            // InternalMyDsl.g:1374:2: rule__Reuse__Group__0__Impl rule__Reuse__Group__1
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
    // InternalMyDsl.g:1381:1: rule__Reuse__Group__0__Impl : ( () ) ;
    public final void rule__Reuse__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1385:1: ( ( () ) )
            // InternalMyDsl.g:1386:1: ( () )
            {
            // InternalMyDsl.g:1386:1: ( () )
            // InternalMyDsl.g:1387:2: ()
            {
             before(grammarAccess.getReuseAccess().getReuseAction_0()); 
            // InternalMyDsl.g:1388:2: ()
            // InternalMyDsl.g:1388:3: 
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
    // InternalMyDsl.g:1396:1: rule__Reuse__Group__1 : rule__Reuse__Group__1__Impl ;
    public final void rule__Reuse__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1400:1: ( rule__Reuse__Group__1__Impl )
            // InternalMyDsl.g:1401:2: rule__Reuse__Group__1__Impl
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
    // InternalMyDsl.g:1407:1: rule__Reuse__Group__1__Impl : ( ( rule__Reuse__Alternatives_1 )? ) ;
    public final void rule__Reuse__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1411:1: ( ( ( rule__Reuse__Alternatives_1 )? ) )
            // InternalMyDsl.g:1412:1: ( ( rule__Reuse__Alternatives_1 )? )
            {
            // InternalMyDsl.g:1412:1: ( ( rule__Reuse__Alternatives_1 )? )
            // InternalMyDsl.g:1413:2: ( rule__Reuse__Alternatives_1 )?
            {
             before(grammarAccess.getReuseAccess().getAlternatives_1()); 
            // InternalMyDsl.g:1414:2: ( rule__Reuse__Alternatives_1 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=18 && LA14_0<=19)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:1414:3: rule__Reuse__Alternatives_1
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
    // InternalMyDsl.g:1423:1: rule__Reuse__Group_1_0__0 : rule__Reuse__Group_1_0__0__Impl rule__Reuse__Group_1_0__1 ;
    public final void rule__Reuse__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1427:1: ( rule__Reuse__Group_1_0__0__Impl rule__Reuse__Group_1_0__1 )
            // InternalMyDsl.g:1428:2: rule__Reuse__Group_1_0__0__Impl rule__Reuse__Group_1_0__1
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
    // InternalMyDsl.g:1435:1: rule__Reuse__Group_1_0__0__Impl : ( 'edit' ) ;
    public final void rule__Reuse__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1439:1: ( ( 'edit' ) )
            // InternalMyDsl.g:1440:1: ( 'edit' )
            {
            // InternalMyDsl.g:1440:1: ( 'edit' )
            // InternalMyDsl.g:1441:2: 'edit'
            {
             before(grammarAccess.getReuseAccess().getEditKeyword_1_0_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalMyDsl.g:1450:1: rule__Reuse__Group_1_0__1 : rule__Reuse__Group_1_0__1__Impl ;
    public final void rule__Reuse__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1454:1: ( rule__Reuse__Group_1_0__1__Impl )
            // InternalMyDsl.g:1455:2: rule__Reuse__Group_1_0__1__Impl
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
    // InternalMyDsl.g:1461:1: rule__Reuse__Group_1_0__1__Impl : ( ( rule__Reuse__RefAssignment_1_0_1 ) ) ;
    public final void rule__Reuse__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1465:1: ( ( ( rule__Reuse__RefAssignment_1_0_1 ) ) )
            // InternalMyDsl.g:1466:1: ( ( rule__Reuse__RefAssignment_1_0_1 ) )
            {
            // InternalMyDsl.g:1466:1: ( ( rule__Reuse__RefAssignment_1_0_1 ) )
            // InternalMyDsl.g:1467:2: ( rule__Reuse__RefAssignment_1_0_1 )
            {
             before(grammarAccess.getReuseAccess().getRefAssignment_1_0_1()); 
            // InternalMyDsl.g:1468:2: ( rule__Reuse__RefAssignment_1_0_1 )
            // InternalMyDsl.g:1468:3: rule__Reuse__RefAssignment_1_0_1
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
    // InternalMyDsl.g:1477:1: rule__Reuse__Group_1_1__0 : rule__Reuse__Group_1_1__0__Impl rule__Reuse__Group_1_1__1 ;
    public final void rule__Reuse__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1481:1: ( rule__Reuse__Group_1_1__0__Impl rule__Reuse__Group_1_1__1 )
            // InternalMyDsl.g:1482:2: rule__Reuse__Group_1_1__0__Impl rule__Reuse__Group_1_1__1
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
    // InternalMyDsl.g:1489:1: rule__Reuse__Group_1_1__0__Impl : ( 'add' ) ;
    public final void rule__Reuse__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1493:1: ( ( 'add' ) )
            // InternalMyDsl.g:1494:1: ( 'add' )
            {
            // InternalMyDsl.g:1494:1: ( 'add' )
            // InternalMyDsl.g:1495:2: 'add'
            {
             before(grammarAccess.getReuseAccess().getAddKeyword_1_1_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalMyDsl.g:1504:1: rule__Reuse__Group_1_1__1 : rule__Reuse__Group_1_1__1__Impl ;
    public final void rule__Reuse__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1508:1: ( rule__Reuse__Group_1_1__1__Impl )
            // InternalMyDsl.g:1509:2: rule__Reuse__Group_1_1__1__Impl
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
    // InternalMyDsl.g:1515:1: rule__Reuse__Group_1_1__1__Impl : ( ( rule__Reuse__AddAssignment_1_1_1 ) ) ;
    public final void rule__Reuse__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1519:1: ( ( ( rule__Reuse__AddAssignment_1_1_1 ) ) )
            // InternalMyDsl.g:1520:1: ( ( rule__Reuse__AddAssignment_1_1_1 ) )
            {
            // InternalMyDsl.g:1520:1: ( ( rule__Reuse__AddAssignment_1_1_1 ) )
            // InternalMyDsl.g:1521:2: ( rule__Reuse__AddAssignment_1_1_1 )
            {
             before(grammarAccess.getReuseAccess().getAddAssignment_1_1_1()); 
            // InternalMyDsl.g:1522:2: ( rule__Reuse__AddAssignment_1_1_1 )
            // InternalMyDsl.g:1522:3: rule__Reuse__AddAssignment_1_1_1
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
    // InternalMyDsl.g:1531:1: rule__DotExpression__Group__0 : rule__DotExpression__Group__0__Impl rule__DotExpression__Group__1 ;
    public final void rule__DotExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1535:1: ( rule__DotExpression__Group__0__Impl rule__DotExpression__Group__1 )
            // InternalMyDsl.g:1536:2: rule__DotExpression__Group__0__Impl rule__DotExpression__Group__1
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
    // InternalMyDsl.g:1543:1: rule__DotExpression__Group__0__Impl : ( ruleReUsableRef ) ;
    public final void rule__DotExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1547:1: ( ( ruleReUsableRef ) )
            // InternalMyDsl.g:1548:1: ( ruleReUsableRef )
            {
            // InternalMyDsl.g:1548:1: ( ruleReUsableRef )
            // InternalMyDsl.g:1549:2: ruleReUsableRef
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
    // InternalMyDsl.g:1558:1: rule__DotExpression__Group__1 : rule__DotExpression__Group__1__Impl ;
    public final void rule__DotExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1562:1: ( rule__DotExpression__Group__1__Impl )
            // InternalMyDsl.g:1563:2: rule__DotExpression__Group__1__Impl
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
    // InternalMyDsl.g:1569:1: rule__DotExpression__Group__1__Impl : ( ( rule__DotExpression__Group_1__0 )* ) ;
    public final void rule__DotExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1573:1: ( ( ( rule__DotExpression__Group_1__0 )* ) )
            // InternalMyDsl.g:1574:1: ( ( rule__DotExpression__Group_1__0 )* )
            {
            // InternalMyDsl.g:1574:1: ( ( rule__DotExpression__Group_1__0 )* )
            // InternalMyDsl.g:1575:2: ( rule__DotExpression__Group_1__0 )*
            {
             before(grammarAccess.getDotExpressionAccess().getGroup_1()); 
            // InternalMyDsl.g:1576:2: ( rule__DotExpression__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==20) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMyDsl.g:1576:3: rule__DotExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__DotExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalMyDsl.g:1585:1: rule__DotExpression__Group_1__0 : rule__DotExpression__Group_1__0__Impl rule__DotExpression__Group_1__1 ;
    public final void rule__DotExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1589:1: ( rule__DotExpression__Group_1__0__Impl rule__DotExpression__Group_1__1 )
            // InternalMyDsl.g:1590:2: rule__DotExpression__Group_1__0__Impl rule__DotExpression__Group_1__1
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
    // InternalMyDsl.g:1597:1: rule__DotExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__DotExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1601:1: ( ( () ) )
            // InternalMyDsl.g:1602:1: ( () )
            {
            // InternalMyDsl.g:1602:1: ( () )
            // InternalMyDsl.g:1603:2: ()
            {
             before(grammarAccess.getDotExpressionAccess().getDotExpressionRefAction_1_0()); 
            // InternalMyDsl.g:1604:2: ()
            // InternalMyDsl.g:1604:3: 
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
    // InternalMyDsl.g:1612:1: rule__DotExpression__Group_1__1 : rule__DotExpression__Group_1__1__Impl rule__DotExpression__Group_1__2 ;
    public final void rule__DotExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1616:1: ( rule__DotExpression__Group_1__1__Impl rule__DotExpression__Group_1__2 )
            // InternalMyDsl.g:1617:2: rule__DotExpression__Group_1__1__Impl rule__DotExpression__Group_1__2
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
    // InternalMyDsl.g:1624:1: rule__DotExpression__Group_1__1__Impl : ( '.' ) ;
    public final void rule__DotExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1628:1: ( ( '.' ) )
            // InternalMyDsl.g:1629:1: ( '.' )
            {
            // InternalMyDsl.g:1629:1: ( '.' )
            // InternalMyDsl.g:1630:2: '.'
            {
             before(grammarAccess.getDotExpressionAccess().getFullStopKeyword_1_1()); 
            match(input,20,FOLLOW_2); 
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
    // InternalMyDsl.g:1639:1: rule__DotExpression__Group_1__2 : rule__DotExpression__Group_1__2__Impl ;
    public final void rule__DotExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1643:1: ( rule__DotExpression__Group_1__2__Impl )
            // InternalMyDsl.g:1644:2: rule__DotExpression__Group_1__2__Impl
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
    // InternalMyDsl.g:1650:1: rule__DotExpression__Group_1__2__Impl : ( ( rule__DotExpression__TailAssignment_1_2 ) ) ;
    public final void rule__DotExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1654:1: ( ( ( rule__DotExpression__TailAssignment_1_2 ) ) )
            // InternalMyDsl.g:1655:1: ( ( rule__DotExpression__TailAssignment_1_2 ) )
            {
            // InternalMyDsl.g:1655:1: ( ( rule__DotExpression__TailAssignment_1_2 ) )
            // InternalMyDsl.g:1656:2: ( rule__DotExpression__TailAssignment_1_2 )
            {
             before(grammarAccess.getDotExpressionAccess().getTailAssignment_1_2()); 
            // InternalMyDsl.g:1657:2: ( rule__DotExpression__TailAssignment_1_2 )
            // InternalMyDsl.g:1657:3: rule__DotExpression__TailAssignment_1_2
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
    // InternalMyDsl.g:1666:1: rule__ReUsableRef__Group__0 : rule__ReUsableRef__Group__0__Impl rule__ReUsableRef__Group__1 ;
    public final void rule__ReUsableRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1670:1: ( rule__ReUsableRef__Group__0__Impl rule__ReUsableRef__Group__1 )
            // InternalMyDsl.g:1671:2: rule__ReUsableRef__Group__0__Impl rule__ReUsableRef__Group__1
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
    // InternalMyDsl.g:1678:1: rule__ReUsableRef__Group__0__Impl : ( () ) ;
    public final void rule__ReUsableRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1682:1: ( ( () ) )
            // InternalMyDsl.g:1683:1: ( () )
            {
            // InternalMyDsl.g:1683:1: ( () )
            // InternalMyDsl.g:1684:2: ()
            {
             before(grammarAccess.getReUsableRefAccess().getReUsableRefAction_0()); 
            // InternalMyDsl.g:1685:2: ()
            // InternalMyDsl.g:1685:3: 
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
    // InternalMyDsl.g:1693:1: rule__ReUsableRef__Group__1 : rule__ReUsableRef__Group__1__Impl ;
    public final void rule__ReUsableRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1697:1: ( rule__ReUsableRef__Group__1__Impl )
            // InternalMyDsl.g:1698:2: rule__ReUsableRef__Group__1__Impl
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
    // InternalMyDsl.g:1704:1: rule__ReUsableRef__Group__1__Impl : ( ( rule__ReUsableRef__ReuseableAssignment_1 ) ) ;
    public final void rule__ReUsableRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1708:1: ( ( ( rule__ReUsableRef__ReuseableAssignment_1 ) ) )
            // InternalMyDsl.g:1709:1: ( ( rule__ReUsableRef__ReuseableAssignment_1 ) )
            {
            // InternalMyDsl.g:1709:1: ( ( rule__ReUsableRef__ReuseableAssignment_1 ) )
            // InternalMyDsl.g:1710:2: ( rule__ReUsableRef__ReuseableAssignment_1 )
            {
             before(grammarAccess.getReUsableRefAccess().getReuseableAssignment_1()); 
            // InternalMyDsl.g:1711:2: ( rule__ReUsableRef__ReuseableAssignment_1 )
            // InternalMyDsl.g:1711:3: rule__ReUsableRef__ReuseableAssignment_1
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
    // InternalMyDsl.g:1720:1: rule__Inertial__Group__0 : rule__Inertial__Group__0__Impl rule__Inertial__Group__1 ;
    public final void rule__Inertial__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1724:1: ( rule__Inertial__Group__0__Impl rule__Inertial__Group__1 )
            // InternalMyDsl.g:1725:2: rule__Inertial__Group__0__Impl rule__Inertial__Group__1
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
    // InternalMyDsl.g:1732:1: rule__Inertial__Group__0__Impl : ( () ) ;
    public final void rule__Inertial__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1736:1: ( ( () ) )
            // InternalMyDsl.g:1737:1: ( () )
            {
            // InternalMyDsl.g:1737:1: ( () )
            // InternalMyDsl.g:1738:2: ()
            {
             before(grammarAccess.getInertialAccess().getInertialAction_0()); 
            // InternalMyDsl.g:1739:2: ()
            // InternalMyDsl.g:1739:3: 
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
    // InternalMyDsl.g:1747:1: rule__Inertial__Group__1 : rule__Inertial__Group__1__Impl rule__Inertial__Group__2 ;
    public final void rule__Inertial__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1751:1: ( rule__Inertial__Group__1__Impl rule__Inertial__Group__2 )
            // InternalMyDsl.g:1752:2: rule__Inertial__Group__1__Impl rule__Inertial__Group__2
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
    // InternalMyDsl.g:1759:1: rule__Inertial__Group__1__Impl : ( 'Inertial' ) ;
    public final void rule__Inertial__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1763:1: ( ( 'Inertial' ) )
            // InternalMyDsl.g:1764:1: ( 'Inertial' )
            {
            // InternalMyDsl.g:1764:1: ( 'Inertial' )
            // InternalMyDsl.g:1765:2: 'Inertial'
            {
             before(grammarAccess.getInertialAccess().getInertialKeyword_1()); 
            match(input,21,FOLLOW_2); 
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
    // InternalMyDsl.g:1774:1: rule__Inertial__Group__2 : rule__Inertial__Group__2__Impl rule__Inertial__Group__3 ;
    public final void rule__Inertial__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1778:1: ( rule__Inertial__Group__2__Impl rule__Inertial__Group__3 )
            // InternalMyDsl.g:1779:2: rule__Inertial__Group__2__Impl rule__Inertial__Group__3
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
    // InternalMyDsl.g:1786:1: rule__Inertial__Group__2__Impl : ( ( rule__Inertial__NameAssignment_2 )? ) ;
    public final void rule__Inertial__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1790:1: ( ( ( rule__Inertial__NameAssignment_2 )? ) )
            // InternalMyDsl.g:1791:1: ( ( rule__Inertial__NameAssignment_2 )? )
            {
            // InternalMyDsl.g:1791:1: ( ( rule__Inertial__NameAssignment_2 )? )
            // InternalMyDsl.g:1792:2: ( rule__Inertial__NameAssignment_2 )?
            {
             before(grammarAccess.getInertialAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:1793:2: ( rule__Inertial__NameAssignment_2 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:1793:3: rule__Inertial__NameAssignment_2
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
    // InternalMyDsl.g:1801:1: rule__Inertial__Group__3 : rule__Inertial__Group__3__Impl rule__Inertial__Group__4 ;
    public final void rule__Inertial__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1805:1: ( rule__Inertial__Group__3__Impl rule__Inertial__Group__4 )
            // InternalMyDsl.g:1806:2: rule__Inertial__Group__3__Impl rule__Inertial__Group__4
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
    // InternalMyDsl.g:1813:1: rule__Inertial__Group__3__Impl : ( ( rule__Inertial__InertiaAssignment_3 ) ) ;
    public final void rule__Inertial__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1817:1: ( ( ( rule__Inertial__InertiaAssignment_3 ) ) )
            // InternalMyDsl.g:1818:1: ( ( rule__Inertial__InertiaAssignment_3 ) )
            {
            // InternalMyDsl.g:1818:1: ( ( rule__Inertial__InertiaAssignment_3 ) )
            // InternalMyDsl.g:1819:2: ( rule__Inertial__InertiaAssignment_3 )
            {
             before(grammarAccess.getInertialAccess().getInertiaAssignment_3()); 
            // InternalMyDsl.g:1820:2: ( rule__Inertial__InertiaAssignment_3 )
            // InternalMyDsl.g:1820:3: rule__Inertial__InertiaAssignment_3
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
    // InternalMyDsl.g:1828:1: rule__Inertial__Group__4 : rule__Inertial__Group__4__Impl rule__Inertial__Group__5 ;
    public final void rule__Inertial__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1832:1: ( rule__Inertial__Group__4__Impl rule__Inertial__Group__5 )
            // InternalMyDsl.g:1833:2: rule__Inertial__Group__4__Impl rule__Inertial__Group__5
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
    // InternalMyDsl.g:1840:1: rule__Inertial__Group__4__Impl : ( ( rule__Inertial__MassAssignment_4 ) ) ;
    public final void rule__Inertial__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1844:1: ( ( ( rule__Inertial__MassAssignment_4 ) ) )
            // InternalMyDsl.g:1845:1: ( ( rule__Inertial__MassAssignment_4 ) )
            {
            // InternalMyDsl.g:1845:1: ( ( rule__Inertial__MassAssignment_4 ) )
            // InternalMyDsl.g:1846:2: ( rule__Inertial__MassAssignment_4 )
            {
             before(grammarAccess.getInertialAccess().getMassAssignment_4()); 
            // InternalMyDsl.g:1847:2: ( rule__Inertial__MassAssignment_4 )
            // InternalMyDsl.g:1847:3: rule__Inertial__MassAssignment_4
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
    // InternalMyDsl.g:1855:1: rule__Inertial__Group__5 : rule__Inertial__Group__5__Impl ;
    public final void rule__Inertial__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1859:1: ( rule__Inertial__Group__5__Impl )
            // InternalMyDsl.g:1860:2: rule__Inertial__Group__5__Impl
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
    // InternalMyDsl.g:1866:1: rule__Inertial__Group__5__Impl : ( ( rule__Inertial__OriginAssignment_5 )? ) ;
    public final void rule__Inertial__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1870:1: ( ( ( rule__Inertial__OriginAssignment_5 )? ) )
            // InternalMyDsl.g:1871:1: ( ( rule__Inertial__OriginAssignment_5 )? )
            {
            // InternalMyDsl.g:1871:1: ( ( rule__Inertial__OriginAssignment_5 )? )
            // InternalMyDsl.g:1872:2: ( rule__Inertial__OriginAssignment_5 )?
            {
             before(grammarAccess.getInertialAccess().getOriginAssignment_5()); 
            // InternalMyDsl.g:1873:2: ( rule__Inertial__OriginAssignment_5 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==32) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:1873:3: rule__Inertial__OriginAssignment_5
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
    // InternalMyDsl.g:1882:1: rule__Inertia__Group__0 : rule__Inertia__Group__0__Impl rule__Inertia__Group__1 ;
    public final void rule__Inertia__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1886:1: ( rule__Inertia__Group__0__Impl rule__Inertia__Group__1 )
            // InternalMyDsl.g:1887:2: rule__Inertia__Group__0__Impl rule__Inertia__Group__1
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
    // InternalMyDsl.g:1894:1: rule__Inertia__Group__0__Impl : ( () ) ;
    public final void rule__Inertia__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1898:1: ( ( () ) )
            // InternalMyDsl.g:1899:1: ( () )
            {
            // InternalMyDsl.g:1899:1: ( () )
            // InternalMyDsl.g:1900:2: ()
            {
             before(grammarAccess.getInertiaAccess().getInertiaAction_0()); 
            // InternalMyDsl.g:1901:2: ()
            // InternalMyDsl.g:1901:3: 
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
    // InternalMyDsl.g:1909:1: rule__Inertia__Group__1 : rule__Inertia__Group__1__Impl rule__Inertia__Group__2 ;
    public final void rule__Inertia__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1913:1: ( rule__Inertia__Group__1__Impl rule__Inertia__Group__2 )
            // InternalMyDsl.g:1914:2: rule__Inertia__Group__1__Impl rule__Inertia__Group__2
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
    // InternalMyDsl.g:1921:1: rule__Inertia__Group__1__Impl : ( 'Inertia' ) ;
    public final void rule__Inertia__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1925:1: ( ( 'Inertia' ) )
            // InternalMyDsl.g:1926:1: ( 'Inertia' )
            {
            // InternalMyDsl.g:1926:1: ( 'Inertia' )
            // InternalMyDsl.g:1927:2: 'Inertia'
            {
             before(grammarAccess.getInertiaAccess().getInertiaKeyword_1()); 
            match(input,22,FOLLOW_2); 
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
    // InternalMyDsl.g:1936:1: rule__Inertia__Group__2 : rule__Inertia__Group__2__Impl rule__Inertia__Group__3 ;
    public final void rule__Inertia__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1940:1: ( rule__Inertia__Group__2__Impl rule__Inertia__Group__3 )
            // InternalMyDsl.g:1941:2: rule__Inertia__Group__2__Impl rule__Inertia__Group__3
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
    // InternalMyDsl.g:1948:1: rule__Inertia__Group__2__Impl : ( ( rule__Inertia__NameAssignment_2 )? ) ;
    public final void rule__Inertia__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1952:1: ( ( ( rule__Inertia__NameAssignment_2 )? ) )
            // InternalMyDsl.g:1953:1: ( ( rule__Inertia__NameAssignment_2 )? )
            {
            // InternalMyDsl.g:1953:1: ( ( rule__Inertia__NameAssignment_2 )? )
            // InternalMyDsl.g:1954:2: ( rule__Inertia__NameAssignment_2 )?
            {
             before(grammarAccess.getInertiaAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:1955:2: ( rule__Inertia__NameAssignment_2 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMyDsl.g:1955:3: rule__Inertia__NameAssignment_2
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
    // InternalMyDsl.g:1963:1: rule__Inertia__Group__3 : rule__Inertia__Group__3__Impl rule__Inertia__Group__4 ;
    public final void rule__Inertia__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1967:1: ( rule__Inertia__Group__3__Impl rule__Inertia__Group__4 )
            // InternalMyDsl.g:1968:2: rule__Inertia__Group__3__Impl rule__Inertia__Group__4
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
    // InternalMyDsl.g:1975:1: rule__Inertia__Group__3__Impl : ( 'ixx' ) ;
    public final void rule__Inertia__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1979:1: ( ( 'ixx' ) )
            // InternalMyDsl.g:1980:1: ( 'ixx' )
            {
            // InternalMyDsl.g:1980:1: ( 'ixx' )
            // InternalMyDsl.g:1981:2: 'ixx'
            {
             before(grammarAccess.getInertiaAccess().getIxxKeyword_3()); 
            match(input,23,FOLLOW_2); 
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
    // InternalMyDsl.g:1990:1: rule__Inertia__Group__4 : rule__Inertia__Group__4__Impl rule__Inertia__Group__5 ;
    public final void rule__Inertia__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1994:1: ( rule__Inertia__Group__4__Impl rule__Inertia__Group__5 )
            // InternalMyDsl.g:1995:2: rule__Inertia__Group__4__Impl rule__Inertia__Group__5
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
    // InternalMyDsl.g:2002:1: rule__Inertia__Group__4__Impl : ( ( rule__Inertia__IxxAssignment_4 ) ) ;
    public final void rule__Inertia__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2006:1: ( ( ( rule__Inertia__IxxAssignment_4 ) ) )
            // InternalMyDsl.g:2007:1: ( ( rule__Inertia__IxxAssignment_4 ) )
            {
            // InternalMyDsl.g:2007:1: ( ( rule__Inertia__IxxAssignment_4 ) )
            // InternalMyDsl.g:2008:2: ( rule__Inertia__IxxAssignment_4 )
            {
             before(grammarAccess.getInertiaAccess().getIxxAssignment_4()); 
            // InternalMyDsl.g:2009:2: ( rule__Inertia__IxxAssignment_4 )
            // InternalMyDsl.g:2009:3: rule__Inertia__IxxAssignment_4
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
    // InternalMyDsl.g:2017:1: rule__Inertia__Group__5 : rule__Inertia__Group__5__Impl rule__Inertia__Group__6 ;
    public final void rule__Inertia__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2021:1: ( rule__Inertia__Group__5__Impl rule__Inertia__Group__6 )
            // InternalMyDsl.g:2022:2: rule__Inertia__Group__5__Impl rule__Inertia__Group__6
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
    // InternalMyDsl.g:2029:1: rule__Inertia__Group__5__Impl : ( 'ixy' ) ;
    public final void rule__Inertia__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2033:1: ( ( 'ixy' ) )
            // InternalMyDsl.g:2034:1: ( 'ixy' )
            {
            // InternalMyDsl.g:2034:1: ( 'ixy' )
            // InternalMyDsl.g:2035:2: 'ixy'
            {
             before(grammarAccess.getInertiaAccess().getIxyKeyword_5()); 
            match(input,24,FOLLOW_2); 
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
    // InternalMyDsl.g:2044:1: rule__Inertia__Group__6 : rule__Inertia__Group__6__Impl rule__Inertia__Group__7 ;
    public final void rule__Inertia__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2048:1: ( rule__Inertia__Group__6__Impl rule__Inertia__Group__7 )
            // InternalMyDsl.g:2049:2: rule__Inertia__Group__6__Impl rule__Inertia__Group__7
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
    // InternalMyDsl.g:2056:1: rule__Inertia__Group__6__Impl : ( ( rule__Inertia__IxyAssignment_6 ) ) ;
    public final void rule__Inertia__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2060:1: ( ( ( rule__Inertia__IxyAssignment_6 ) ) )
            // InternalMyDsl.g:2061:1: ( ( rule__Inertia__IxyAssignment_6 ) )
            {
            // InternalMyDsl.g:2061:1: ( ( rule__Inertia__IxyAssignment_6 ) )
            // InternalMyDsl.g:2062:2: ( rule__Inertia__IxyAssignment_6 )
            {
             before(grammarAccess.getInertiaAccess().getIxyAssignment_6()); 
            // InternalMyDsl.g:2063:2: ( rule__Inertia__IxyAssignment_6 )
            // InternalMyDsl.g:2063:3: rule__Inertia__IxyAssignment_6
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
    // InternalMyDsl.g:2071:1: rule__Inertia__Group__7 : rule__Inertia__Group__7__Impl rule__Inertia__Group__8 ;
    public final void rule__Inertia__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2075:1: ( rule__Inertia__Group__7__Impl rule__Inertia__Group__8 )
            // InternalMyDsl.g:2076:2: rule__Inertia__Group__7__Impl rule__Inertia__Group__8
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
    // InternalMyDsl.g:2083:1: rule__Inertia__Group__7__Impl : ( 'ixz' ) ;
    public final void rule__Inertia__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2087:1: ( ( 'ixz' ) )
            // InternalMyDsl.g:2088:1: ( 'ixz' )
            {
            // InternalMyDsl.g:2088:1: ( 'ixz' )
            // InternalMyDsl.g:2089:2: 'ixz'
            {
             before(grammarAccess.getInertiaAccess().getIxzKeyword_7()); 
            match(input,25,FOLLOW_2); 
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
    // InternalMyDsl.g:2098:1: rule__Inertia__Group__8 : rule__Inertia__Group__8__Impl rule__Inertia__Group__9 ;
    public final void rule__Inertia__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2102:1: ( rule__Inertia__Group__8__Impl rule__Inertia__Group__9 )
            // InternalMyDsl.g:2103:2: rule__Inertia__Group__8__Impl rule__Inertia__Group__9
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
    // InternalMyDsl.g:2110:1: rule__Inertia__Group__8__Impl : ( ( rule__Inertia__IxzAssignment_8 ) ) ;
    public final void rule__Inertia__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2114:1: ( ( ( rule__Inertia__IxzAssignment_8 ) ) )
            // InternalMyDsl.g:2115:1: ( ( rule__Inertia__IxzAssignment_8 ) )
            {
            // InternalMyDsl.g:2115:1: ( ( rule__Inertia__IxzAssignment_8 ) )
            // InternalMyDsl.g:2116:2: ( rule__Inertia__IxzAssignment_8 )
            {
             before(grammarAccess.getInertiaAccess().getIxzAssignment_8()); 
            // InternalMyDsl.g:2117:2: ( rule__Inertia__IxzAssignment_8 )
            // InternalMyDsl.g:2117:3: rule__Inertia__IxzAssignment_8
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
    // InternalMyDsl.g:2125:1: rule__Inertia__Group__9 : rule__Inertia__Group__9__Impl rule__Inertia__Group__10 ;
    public final void rule__Inertia__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2129:1: ( rule__Inertia__Group__9__Impl rule__Inertia__Group__10 )
            // InternalMyDsl.g:2130:2: rule__Inertia__Group__9__Impl rule__Inertia__Group__10
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
    // InternalMyDsl.g:2137:1: rule__Inertia__Group__9__Impl : ( 'iyy' ) ;
    public final void rule__Inertia__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2141:1: ( ( 'iyy' ) )
            // InternalMyDsl.g:2142:1: ( 'iyy' )
            {
            // InternalMyDsl.g:2142:1: ( 'iyy' )
            // InternalMyDsl.g:2143:2: 'iyy'
            {
             before(grammarAccess.getInertiaAccess().getIyyKeyword_9()); 
            match(input,26,FOLLOW_2); 
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
    // InternalMyDsl.g:2152:1: rule__Inertia__Group__10 : rule__Inertia__Group__10__Impl rule__Inertia__Group__11 ;
    public final void rule__Inertia__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2156:1: ( rule__Inertia__Group__10__Impl rule__Inertia__Group__11 )
            // InternalMyDsl.g:2157:2: rule__Inertia__Group__10__Impl rule__Inertia__Group__11
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
    // InternalMyDsl.g:2164:1: rule__Inertia__Group__10__Impl : ( ( rule__Inertia__IyyAssignment_10 ) ) ;
    public final void rule__Inertia__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2168:1: ( ( ( rule__Inertia__IyyAssignment_10 ) ) )
            // InternalMyDsl.g:2169:1: ( ( rule__Inertia__IyyAssignment_10 ) )
            {
            // InternalMyDsl.g:2169:1: ( ( rule__Inertia__IyyAssignment_10 ) )
            // InternalMyDsl.g:2170:2: ( rule__Inertia__IyyAssignment_10 )
            {
             before(grammarAccess.getInertiaAccess().getIyyAssignment_10()); 
            // InternalMyDsl.g:2171:2: ( rule__Inertia__IyyAssignment_10 )
            // InternalMyDsl.g:2171:3: rule__Inertia__IyyAssignment_10
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
    // InternalMyDsl.g:2179:1: rule__Inertia__Group__11 : rule__Inertia__Group__11__Impl rule__Inertia__Group__12 ;
    public final void rule__Inertia__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2183:1: ( rule__Inertia__Group__11__Impl rule__Inertia__Group__12 )
            // InternalMyDsl.g:2184:2: rule__Inertia__Group__11__Impl rule__Inertia__Group__12
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
    // InternalMyDsl.g:2191:1: rule__Inertia__Group__11__Impl : ( 'iyz' ) ;
    public final void rule__Inertia__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2195:1: ( ( 'iyz' ) )
            // InternalMyDsl.g:2196:1: ( 'iyz' )
            {
            // InternalMyDsl.g:2196:1: ( 'iyz' )
            // InternalMyDsl.g:2197:2: 'iyz'
            {
             before(grammarAccess.getInertiaAccess().getIyzKeyword_11()); 
            match(input,27,FOLLOW_2); 
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
    // InternalMyDsl.g:2206:1: rule__Inertia__Group__12 : rule__Inertia__Group__12__Impl rule__Inertia__Group__13 ;
    public final void rule__Inertia__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2210:1: ( rule__Inertia__Group__12__Impl rule__Inertia__Group__13 )
            // InternalMyDsl.g:2211:2: rule__Inertia__Group__12__Impl rule__Inertia__Group__13
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
    // InternalMyDsl.g:2218:1: rule__Inertia__Group__12__Impl : ( ( rule__Inertia__IyzAssignment_12 ) ) ;
    public final void rule__Inertia__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2222:1: ( ( ( rule__Inertia__IyzAssignment_12 ) ) )
            // InternalMyDsl.g:2223:1: ( ( rule__Inertia__IyzAssignment_12 ) )
            {
            // InternalMyDsl.g:2223:1: ( ( rule__Inertia__IyzAssignment_12 ) )
            // InternalMyDsl.g:2224:2: ( rule__Inertia__IyzAssignment_12 )
            {
             before(grammarAccess.getInertiaAccess().getIyzAssignment_12()); 
            // InternalMyDsl.g:2225:2: ( rule__Inertia__IyzAssignment_12 )
            // InternalMyDsl.g:2225:3: rule__Inertia__IyzAssignment_12
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
    // InternalMyDsl.g:2233:1: rule__Inertia__Group__13 : rule__Inertia__Group__13__Impl rule__Inertia__Group__14 ;
    public final void rule__Inertia__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2237:1: ( rule__Inertia__Group__13__Impl rule__Inertia__Group__14 )
            // InternalMyDsl.g:2238:2: rule__Inertia__Group__13__Impl rule__Inertia__Group__14
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
    // InternalMyDsl.g:2245:1: rule__Inertia__Group__13__Impl : ( 'izz' ) ;
    public final void rule__Inertia__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2249:1: ( ( 'izz' ) )
            // InternalMyDsl.g:2250:1: ( 'izz' )
            {
            // InternalMyDsl.g:2250:1: ( 'izz' )
            // InternalMyDsl.g:2251:2: 'izz'
            {
             before(grammarAccess.getInertiaAccess().getIzzKeyword_13()); 
            match(input,28,FOLLOW_2); 
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
    // InternalMyDsl.g:2260:1: rule__Inertia__Group__14 : rule__Inertia__Group__14__Impl ;
    public final void rule__Inertia__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2264:1: ( rule__Inertia__Group__14__Impl )
            // InternalMyDsl.g:2265:2: rule__Inertia__Group__14__Impl
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
    // InternalMyDsl.g:2271:1: rule__Inertia__Group__14__Impl : ( ( rule__Inertia__IzzAssignment_14 ) ) ;
    public final void rule__Inertia__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2275:1: ( ( ( rule__Inertia__IzzAssignment_14 ) ) )
            // InternalMyDsl.g:2276:1: ( ( rule__Inertia__IzzAssignment_14 ) )
            {
            // InternalMyDsl.g:2276:1: ( ( rule__Inertia__IzzAssignment_14 ) )
            // InternalMyDsl.g:2277:2: ( rule__Inertia__IzzAssignment_14 )
            {
             before(grammarAccess.getInertiaAccess().getIzzAssignment_14()); 
            // InternalMyDsl.g:2278:2: ( rule__Inertia__IzzAssignment_14 )
            // InternalMyDsl.g:2278:3: rule__Inertia__IzzAssignment_14
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
    // InternalMyDsl.g:2287:1: rule__Visual__Group__0 : rule__Visual__Group__0__Impl rule__Visual__Group__1 ;
    public final void rule__Visual__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2291:1: ( rule__Visual__Group__0__Impl rule__Visual__Group__1 )
            // InternalMyDsl.g:2292:2: rule__Visual__Group__0__Impl rule__Visual__Group__1
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
    // InternalMyDsl.g:2299:1: rule__Visual__Group__0__Impl : ( () ) ;
    public final void rule__Visual__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2303:1: ( ( () ) )
            // InternalMyDsl.g:2304:1: ( () )
            {
            // InternalMyDsl.g:2304:1: ( () )
            // InternalMyDsl.g:2305:2: ()
            {
             before(grammarAccess.getVisualAccess().getVisualAction_0()); 
            // InternalMyDsl.g:2306:2: ()
            // InternalMyDsl.g:2306:3: 
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
    // InternalMyDsl.g:2314:1: rule__Visual__Group__1 : rule__Visual__Group__1__Impl rule__Visual__Group__2 ;
    public final void rule__Visual__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2318:1: ( rule__Visual__Group__1__Impl rule__Visual__Group__2 )
            // InternalMyDsl.g:2319:2: rule__Visual__Group__1__Impl rule__Visual__Group__2
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
    // InternalMyDsl.g:2326:1: rule__Visual__Group__1__Impl : ( 'Visual' ) ;
    public final void rule__Visual__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2330:1: ( ( 'Visual' ) )
            // InternalMyDsl.g:2331:1: ( 'Visual' )
            {
            // InternalMyDsl.g:2331:1: ( 'Visual' )
            // InternalMyDsl.g:2332:2: 'Visual'
            {
             before(grammarAccess.getVisualAccess().getVisualKeyword_1()); 
            match(input,29,FOLLOW_2); 
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
    // InternalMyDsl.g:2341:1: rule__Visual__Group__2 : rule__Visual__Group__2__Impl rule__Visual__Group__3 ;
    public final void rule__Visual__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2345:1: ( rule__Visual__Group__2__Impl rule__Visual__Group__3 )
            // InternalMyDsl.g:2346:2: rule__Visual__Group__2__Impl rule__Visual__Group__3
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
    // InternalMyDsl.g:2353:1: rule__Visual__Group__2__Impl : ( ( rule__Visual__NameAssignment_2 )? ) ;
    public final void rule__Visual__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2357:1: ( ( ( rule__Visual__NameAssignment_2 )? ) )
            // InternalMyDsl.g:2358:1: ( ( rule__Visual__NameAssignment_2 )? )
            {
            // InternalMyDsl.g:2358:1: ( ( rule__Visual__NameAssignment_2 )? )
            // InternalMyDsl.g:2359:2: ( rule__Visual__NameAssignment_2 )?
            {
             before(grammarAccess.getVisualAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:2360:2: ( rule__Visual__NameAssignment_2 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyDsl.g:2360:3: rule__Visual__NameAssignment_2
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
    // InternalMyDsl.g:2368:1: rule__Visual__Group__3 : rule__Visual__Group__3__Impl rule__Visual__Group__4 ;
    public final void rule__Visual__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2372:1: ( rule__Visual__Group__3__Impl rule__Visual__Group__4 )
            // InternalMyDsl.g:2373:2: rule__Visual__Group__3__Impl rule__Visual__Group__4
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
    // InternalMyDsl.g:2380:1: rule__Visual__Group__3__Impl : ( 'Geometry' ) ;
    public final void rule__Visual__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2384:1: ( ( 'Geometry' ) )
            // InternalMyDsl.g:2385:1: ( 'Geometry' )
            {
            // InternalMyDsl.g:2385:1: ( 'Geometry' )
            // InternalMyDsl.g:2386:2: 'Geometry'
            {
             before(grammarAccess.getVisualAccess().getGeometryKeyword_3()); 
            match(input,30,FOLLOW_2); 
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
    // InternalMyDsl.g:2395:1: rule__Visual__Group__4 : rule__Visual__Group__4__Impl rule__Visual__Group__5 ;
    public final void rule__Visual__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2399:1: ( rule__Visual__Group__4__Impl rule__Visual__Group__5 )
            // InternalMyDsl.g:2400:2: rule__Visual__Group__4__Impl rule__Visual__Group__5
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
    // InternalMyDsl.g:2407:1: rule__Visual__Group__4__Impl : ( ( rule__Visual__GeometryAssignment_4 )* ) ;
    public final void rule__Visual__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2411:1: ( ( ( rule__Visual__GeometryAssignment_4 )* ) )
            // InternalMyDsl.g:2412:1: ( ( rule__Visual__GeometryAssignment_4 )* )
            {
            // InternalMyDsl.g:2412:1: ( ( rule__Visual__GeometryAssignment_4 )* )
            // InternalMyDsl.g:2413:2: ( rule__Visual__GeometryAssignment_4 )*
            {
             before(grammarAccess.getVisualAccess().getGeometryAssignment_4()); 
            // InternalMyDsl.g:2414:2: ( rule__Visual__GeometryAssignment_4 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==42||LA20_0==46||LA20_0==48||LA20_0==50) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMyDsl.g:2414:3: rule__Visual__GeometryAssignment_4
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__Visual__GeometryAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalMyDsl.g:2422:1: rule__Visual__Group__5 : rule__Visual__Group__5__Impl rule__Visual__Group__6 ;
    public final void rule__Visual__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2426:1: ( rule__Visual__Group__5__Impl rule__Visual__Group__6 )
            // InternalMyDsl.g:2427:2: rule__Visual__Group__5__Impl rule__Visual__Group__6
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
    // InternalMyDsl.g:2434:1: rule__Visual__Group__5__Impl : ( ( rule__Visual__OriginAssignment_5 )? ) ;
    public final void rule__Visual__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2438:1: ( ( ( rule__Visual__OriginAssignment_5 )? ) )
            // InternalMyDsl.g:2439:1: ( ( rule__Visual__OriginAssignment_5 )? )
            {
            // InternalMyDsl.g:2439:1: ( ( rule__Visual__OriginAssignment_5 )? )
            // InternalMyDsl.g:2440:2: ( rule__Visual__OriginAssignment_5 )?
            {
             before(grammarAccess.getVisualAccess().getOriginAssignment_5()); 
            // InternalMyDsl.g:2441:2: ( rule__Visual__OriginAssignment_5 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==32) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMyDsl.g:2441:3: rule__Visual__OriginAssignment_5
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
    // InternalMyDsl.g:2449:1: rule__Visual__Group__6 : rule__Visual__Group__6__Impl ;
    public final void rule__Visual__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2453:1: ( rule__Visual__Group__6__Impl )
            // InternalMyDsl.g:2454:2: rule__Visual__Group__6__Impl
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
    // InternalMyDsl.g:2460:1: rule__Visual__Group__6__Impl : ( ( rule__Visual__Group_6__0 )? ) ;
    public final void rule__Visual__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2464:1: ( ( ( rule__Visual__Group_6__0 )? ) )
            // InternalMyDsl.g:2465:1: ( ( rule__Visual__Group_6__0 )? )
            {
            // InternalMyDsl.g:2465:1: ( ( rule__Visual__Group_6__0 )? )
            // InternalMyDsl.g:2466:2: ( rule__Visual__Group_6__0 )?
            {
             before(grammarAccess.getVisualAccess().getGroup_6()); 
            // InternalMyDsl.g:2467:2: ( rule__Visual__Group_6__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==31) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMyDsl.g:2467:3: rule__Visual__Group_6__0
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
    // InternalMyDsl.g:2476:1: rule__Visual__Group_6__0 : rule__Visual__Group_6__0__Impl rule__Visual__Group_6__1 ;
    public final void rule__Visual__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2480:1: ( rule__Visual__Group_6__0__Impl rule__Visual__Group_6__1 )
            // InternalMyDsl.g:2481:2: rule__Visual__Group_6__0__Impl rule__Visual__Group_6__1
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
    // InternalMyDsl.g:2488:1: rule__Visual__Group_6__0__Impl : ( 'Material' ) ;
    public final void rule__Visual__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2492:1: ( ( 'Material' ) )
            // InternalMyDsl.g:2493:1: ( 'Material' )
            {
            // InternalMyDsl.g:2493:1: ( 'Material' )
            // InternalMyDsl.g:2494:2: 'Material'
            {
             before(grammarAccess.getVisualAccess().getMaterialKeyword_6_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalMyDsl.g:2503:1: rule__Visual__Group_6__1 : rule__Visual__Group_6__1__Impl ;
    public final void rule__Visual__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2507:1: ( rule__Visual__Group_6__1__Impl )
            // InternalMyDsl.g:2508:2: rule__Visual__Group_6__1__Impl
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
    // InternalMyDsl.g:2514:1: rule__Visual__Group_6__1__Impl : ( ( rule__Visual__MaterialAssignment_6_1 ) ) ;
    public final void rule__Visual__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2518:1: ( ( ( rule__Visual__MaterialAssignment_6_1 ) ) )
            // InternalMyDsl.g:2519:1: ( ( rule__Visual__MaterialAssignment_6_1 ) )
            {
            // InternalMyDsl.g:2519:1: ( ( rule__Visual__MaterialAssignment_6_1 ) )
            // InternalMyDsl.g:2520:2: ( rule__Visual__MaterialAssignment_6_1 )
            {
             before(grammarAccess.getVisualAccess().getMaterialAssignment_6_1()); 
            // InternalMyDsl.g:2521:2: ( rule__Visual__MaterialAssignment_6_1 )
            // InternalMyDsl.g:2521:3: rule__Visual__MaterialAssignment_6_1
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
    // InternalMyDsl.g:2530:1: rule__Origin__Group__0 : rule__Origin__Group__0__Impl rule__Origin__Group__1 ;
    public final void rule__Origin__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2534:1: ( rule__Origin__Group__0__Impl rule__Origin__Group__1 )
            // InternalMyDsl.g:2535:2: rule__Origin__Group__0__Impl rule__Origin__Group__1
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
    // InternalMyDsl.g:2542:1: rule__Origin__Group__0__Impl : ( () ) ;
    public final void rule__Origin__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2546:1: ( ( () ) )
            // InternalMyDsl.g:2547:1: ( () )
            {
            // InternalMyDsl.g:2547:1: ( () )
            // InternalMyDsl.g:2548:2: ()
            {
             before(grammarAccess.getOriginAccess().getOriginAction_0()); 
            // InternalMyDsl.g:2549:2: ()
            // InternalMyDsl.g:2549:3: 
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
    // InternalMyDsl.g:2557:1: rule__Origin__Group__1 : rule__Origin__Group__1__Impl rule__Origin__Group__2 ;
    public final void rule__Origin__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2561:1: ( rule__Origin__Group__1__Impl rule__Origin__Group__2 )
            // InternalMyDsl.g:2562:2: rule__Origin__Group__1__Impl rule__Origin__Group__2
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
    // InternalMyDsl.g:2569:1: rule__Origin__Group__1__Impl : ( 'Origin' ) ;
    public final void rule__Origin__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2573:1: ( ( 'Origin' ) )
            // InternalMyDsl.g:2574:1: ( 'Origin' )
            {
            // InternalMyDsl.g:2574:1: ( 'Origin' )
            // InternalMyDsl.g:2575:2: 'Origin'
            {
             before(grammarAccess.getOriginAccess().getOriginKeyword_1()); 
            match(input,32,FOLLOW_2); 
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
    // InternalMyDsl.g:2584:1: rule__Origin__Group__2 : rule__Origin__Group__2__Impl rule__Origin__Group__3 ;
    public final void rule__Origin__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2588:1: ( rule__Origin__Group__2__Impl rule__Origin__Group__3 )
            // InternalMyDsl.g:2589:2: rule__Origin__Group__2__Impl rule__Origin__Group__3
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
    // InternalMyDsl.g:2596:1: rule__Origin__Group__2__Impl : ( ( rule__Origin__NameAssignment_2 )? ) ;
    public final void rule__Origin__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2600:1: ( ( ( rule__Origin__NameAssignment_2 )? ) )
            // InternalMyDsl.g:2601:1: ( ( rule__Origin__NameAssignment_2 )? )
            {
            // InternalMyDsl.g:2601:1: ( ( rule__Origin__NameAssignment_2 )? )
            // InternalMyDsl.g:2602:2: ( rule__Origin__NameAssignment_2 )?
            {
             before(grammarAccess.getOriginAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:2603:2: ( rule__Origin__NameAssignment_2 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMyDsl.g:2603:3: rule__Origin__NameAssignment_2
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
    // InternalMyDsl.g:2611:1: rule__Origin__Group__3 : rule__Origin__Group__3__Impl rule__Origin__Group__4 ;
    public final void rule__Origin__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2615:1: ( rule__Origin__Group__3__Impl rule__Origin__Group__4 )
            // InternalMyDsl.g:2616:2: rule__Origin__Group__3__Impl rule__Origin__Group__4
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
    // InternalMyDsl.g:2623:1: rule__Origin__Group__3__Impl : ( 'x' ) ;
    public final void rule__Origin__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2627:1: ( ( 'x' ) )
            // InternalMyDsl.g:2628:1: ( 'x' )
            {
            // InternalMyDsl.g:2628:1: ( 'x' )
            // InternalMyDsl.g:2629:2: 'x'
            {
             before(grammarAccess.getOriginAccess().getXKeyword_3()); 
            match(input,33,FOLLOW_2); 
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
    // InternalMyDsl.g:2638:1: rule__Origin__Group__4 : rule__Origin__Group__4__Impl rule__Origin__Group__5 ;
    public final void rule__Origin__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2642:1: ( rule__Origin__Group__4__Impl rule__Origin__Group__5 )
            // InternalMyDsl.g:2643:2: rule__Origin__Group__4__Impl rule__Origin__Group__5
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
    // InternalMyDsl.g:2650:1: rule__Origin__Group__4__Impl : ( ( rule__Origin__XAssignment_4 ) ) ;
    public final void rule__Origin__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2654:1: ( ( ( rule__Origin__XAssignment_4 ) ) )
            // InternalMyDsl.g:2655:1: ( ( rule__Origin__XAssignment_4 ) )
            {
            // InternalMyDsl.g:2655:1: ( ( rule__Origin__XAssignment_4 ) )
            // InternalMyDsl.g:2656:2: ( rule__Origin__XAssignment_4 )
            {
             before(grammarAccess.getOriginAccess().getXAssignment_4()); 
            // InternalMyDsl.g:2657:2: ( rule__Origin__XAssignment_4 )
            // InternalMyDsl.g:2657:3: rule__Origin__XAssignment_4
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
    // InternalMyDsl.g:2665:1: rule__Origin__Group__5 : rule__Origin__Group__5__Impl rule__Origin__Group__6 ;
    public final void rule__Origin__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2669:1: ( rule__Origin__Group__5__Impl rule__Origin__Group__6 )
            // InternalMyDsl.g:2670:2: rule__Origin__Group__5__Impl rule__Origin__Group__6
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
    // InternalMyDsl.g:2677:1: rule__Origin__Group__5__Impl : ( 'y' ) ;
    public final void rule__Origin__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2681:1: ( ( 'y' ) )
            // InternalMyDsl.g:2682:1: ( 'y' )
            {
            // InternalMyDsl.g:2682:1: ( 'y' )
            // InternalMyDsl.g:2683:2: 'y'
            {
             before(grammarAccess.getOriginAccess().getYKeyword_5()); 
            match(input,34,FOLLOW_2); 
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
    // InternalMyDsl.g:2692:1: rule__Origin__Group__6 : rule__Origin__Group__6__Impl rule__Origin__Group__7 ;
    public final void rule__Origin__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2696:1: ( rule__Origin__Group__6__Impl rule__Origin__Group__7 )
            // InternalMyDsl.g:2697:2: rule__Origin__Group__6__Impl rule__Origin__Group__7
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
    // InternalMyDsl.g:2704:1: rule__Origin__Group__6__Impl : ( ( rule__Origin__YAssignment_6 ) ) ;
    public final void rule__Origin__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2708:1: ( ( ( rule__Origin__YAssignment_6 ) ) )
            // InternalMyDsl.g:2709:1: ( ( rule__Origin__YAssignment_6 ) )
            {
            // InternalMyDsl.g:2709:1: ( ( rule__Origin__YAssignment_6 ) )
            // InternalMyDsl.g:2710:2: ( rule__Origin__YAssignment_6 )
            {
             before(grammarAccess.getOriginAccess().getYAssignment_6()); 
            // InternalMyDsl.g:2711:2: ( rule__Origin__YAssignment_6 )
            // InternalMyDsl.g:2711:3: rule__Origin__YAssignment_6
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
    // InternalMyDsl.g:2719:1: rule__Origin__Group__7 : rule__Origin__Group__7__Impl rule__Origin__Group__8 ;
    public final void rule__Origin__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2723:1: ( rule__Origin__Group__7__Impl rule__Origin__Group__8 )
            // InternalMyDsl.g:2724:2: rule__Origin__Group__7__Impl rule__Origin__Group__8
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
    // InternalMyDsl.g:2731:1: rule__Origin__Group__7__Impl : ( 'z' ) ;
    public final void rule__Origin__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2735:1: ( ( 'z' ) )
            // InternalMyDsl.g:2736:1: ( 'z' )
            {
            // InternalMyDsl.g:2736:1: ( 'z' )
            // InternalMyDsl.g:2737:2: 'z'
            {
             before(grammarAccess.getOriginAccess().getZKeyword_7()); 
            match(input,35,FOLLOW_2); 
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
    // InternalMyDsl.g:2746:1: rule__Origin__Group__8 : rule__Origin__Group__8__Impl rule__Origin__Group__9 ;
    public final void rule__Origin__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2750:1: ( rule__Origin__Group__8__Impl rule__Origin__Group__9 )
            // InternalMyDsl.g:2751:2: rule__Origin__Group__8__Impl rule__Origin__Group__9
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
    // InternalMyDsl.g:2758:1: rule__Origin__Group__8__Impl : ( ( rule__Origin__ZAssignment_8 ) ) ;
    public final void rule__Origin__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2762:1: ( ( ( rule__Origin__ZAssignment_8 ) ) )
            // InternalMyDsl.g:2763:1: ( ( rule__Origin__ZAssignment_8 ) )
            {
            // InternalMyDsl.g:2763:1: ( ( rule__Origin__ZAssignment_8 ) )
            // InternalMyDsl.g:2764:2: ( rule__Origin__ZAssignment_8 )
            {
             before(grammarAccess.getOriginAccess().getZAssignment_8()); 
            // InternalMyDsl.g:2765:2: ( rule__Origin__ZAssignment_8 )
            // InternalMyDsl.g:2765:3: rule__Origin__ZAssignment_8
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
    // InternalMyDsl.g:2773:1: rule__Origin__Group__9 : rule__Origin__Group__9__Impl rule__Origin__Group__10 ;
    public final void rule__Origin__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2777:1: ( rule__Origin__Group__9__Impl rule__Origin__Group__10 )
            // InternalMyDsl.g:2778:2: rule__Origin__Group__9__Impl rule__Origin__Group__10
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
    // InternalMyDsl.g:2785:1: rule__Origin__Group__9__Impl : ( ( rule__Origin__Group_9__0 )? ) ;
    public final void rule__Origin__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2789:1: ( ( ( rule__Origin__Group_9__0 )? ) )
            // InternalMyDsl.g:2790:1: ( ( rule__Origin__Group_9__0 )? )
            {
            // InternalMyDsl.g:2790:1: ( ( rule__Origin__Group_9__0 )? )
            // InternalMyDsl.g:2791:2: ( rule__Origin__Group_9__0 )?
            {
             before(grammarAccess.getOriginAccess().getGroup_9()); 
            // InternalMyDsl.g:2792:2: ( rule__Origin__Group_9__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==36) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMyDsl.g:2792:3: rule__Origin__Group_9__0
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
    // InternalMyDsl.g:2800:1: rule__Origin__Group__10 : rule__Origin__Group__10__Impl rule__Origin__Group__11 ;
    public final void rule__Origin__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2804:1: ( rule__Origin__Group__10__Impl rule__Origin__Group__11 )
            // InternalMyDsl.g:2805:2: rule__Origin__Group__10__Impl rule__Origin__Group__11
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
    // InternalMyDsl.g:2812:1: rule__Origin__Group__10__Impl : ( ( rule__Origin__Group_10__0 )? ) ;
    public final void rule__Origin__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2816:1: ( ( ( rule__Origin__Group_10__0 )? ) )
            // InternalMyDsl.g:2817:1: ( ( rule__Origin__Group_10__0 )? )
            {
            // InternalMyDsl.g:2817:1: ( ( rule__Origin__Group_10__0 )? )
            // InternalMyDsl.g:2818:2: ( rule__Origin__Group_10__0 )?
            {
             before(grammarAccess.getOriginAccess().getGroup_10()); 
            // InternalMyDsl.g:2819:2: ( rule__Origin__Group_10__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==37) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMyDsl.g:2819:3: rule__Origin__Group_10__0
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
    // InternalMyDsl.g:2827:1: rule__Origin__Group__11 : rule__Origin__Group__11__Impl ;
    public final void rule__Origin__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2831:1: ( rule__Origin__Group__11__Impl )
            // InternalMyDsl.g:2832:2: rule__Origin__Group__11__Impl
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
    // InternalMyDsl.g:2838:1: rule__Origin__Group__11__Impl : ( ( rule__Origin__Group_11__0 )? ) ;
    public final void rule__Origin__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2842:1: ( ( ( rule__Origin__Group_11__0 )? ) )
            // InternalMyDsl.g:2843:1: ( ( rule__Origin__Group_11__0 )? )
            {
            // InternalMyDsl.g:2843:1: ( ( rule__Origin__Group_11__0 )? )
            // InternalMyDsl.g:2844:2: ( rule__Origin__Group_11__0 )?
            {
             before(grammarAccess.getOriginAccess().getGroup_11()); 
            // InternalMyDsl.g:2845:2: ( rule__Origin__Group_11__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==38) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMyDsl.g:2845:3: rule__Origin__Group_11__0
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
    // InternalMyDsl.g:2854:1: rule__Origin__Group_9__0 : rule__Origin__Group_9__0__Impl rule__Origin__Group_9__1 ;
    public final void rule__Origin__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2858:1: ( rule__Origin__Group_9__0__Impl rule__Origin__Group_9__1 )
            // InternalMyDsl.g:2859:2: rule__Origin__Group_9__0__Impl rule__Origin__Group_9__1
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
    // InternalMyDsl.g:2866:1: rule__Origin__Group_9__0__Impl : ( 'roll' ) ;
    public final void rule__Origin__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2870:1: ( ( 'roll' ) )
            // InternalMyDsl.g:2871:1: ( 'roll' )
            {
            // InternalMyDsl.g:2871:1: ( 'roll' )
            // InternalMyDsl.g:2872:2: 'roll'
            {
             before(grammarAccess.getOriginAccess().getRollKeyword_9_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalMyDsl.g:2881:1: rule__Origin__Group_9__1 : rule__Origin__Group_9__1__Impl ;
    public final void rule__Origin__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2885:1: ( rule__Origin__Group_9__1__Impl )
            // InternalMyDsl.g:2886:2: rule__Origin__Group_9__1__Impl
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
    // InternalMyDsl.g:2892:1: rule__Origin__Group_9__1__Impl : ( ( rule__Origin__RollAssignment_9_1 ) ) ;
    public final void rule__Origin__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2896:1: ( ( ( rule__Origin__RollAssignment_9_1 ) ) )
            // InternalMyDsl.g:2897:1: ( ( rule__Origin__RollAssignment_9_1 ) )
            {
            // InternalMyDsl.g:2897:1: ( ( rule__Origin__RollAssignment_9_1 ) )
            // InternalMyDsl.g:2898:2: ( rule__Origin__RollAssignment_9_1 )
            {
             before(grammarAccess.getOriginAccess().getRollAssignment_9_1()); 
            // InternalMyDsl.g:2899:2: ( rule__Origin__RollAssignment_9_1 )
            // InternalMyDsl.g:2899:3: rule__Origin__RollAssignment_9_1
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
    // InternalMyDsl.g:2908:1: rule__Origin__Group_10__0 : rule__Origin__Group_10__0__Impl rule__Origin__Group_10__1 ;
    public final void rule__Origin__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2912:1: ( rule__Origin__Group_10__0__Impl rule__Origin__Group_10__1 )
            // InternalMyDsl.g:2913:2: rule__Origin__Group_10__0__Impl rule__Origin__Group_10__1
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
    // InternalMyDsl.g:2920:1: rule__Origin__Group_10__0__Impl : ( 'pitch' ) ;
    public final void rule__Origin__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2924:1: ( ( 'pitch' ) )
            // InternalMyDsl.g:2925:1: ( 'pitch' )
            {
            // InternalMyDsl.g:2925:1: ( 'pitch' )
            // InternalMyDsl.g:2926:2: 'pitch'
            {
             before(grammarAccess.getOriginAccess().getPitchKeyword_10_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalMyDsl.g:2935:1: rule__Origin__Group_10__1 : rule__Origin__Group_10__1__Impl ;
    public final void rule__Origin__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2939:1: ( rule__Origin__Group_10__1__Impl )
            // InternalMyDsl.g:2940:2: rule__Origin__Group_10__1__Impl
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
    // InternalMyDsl.g:2946:1: rule__Origin__Group_10__1__Impl : ( ( rule__Origin__PitchAssignment_10_1 ) ) ;
    public final void rule__Origin__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2950:1: ( ( ( rule__Origin__PitchAssignment_10_1 ) ) )
            // InternalMyDsl.g:2951:1: ( ( rule__Origin__PitchAssignment_10_1 ) )
            {
            // InternalMyDsl.g:2951:1: ( ( rule__Origin__PitchAssignment_10_1 ) )
            // InternalMyDsl.g:2952:2: ( rule__Origin__PitchAssignment_10_1 )
            {
             before(grammarAccess.getOriginAccess().getPitchAssignment_10_1()); 
            // InternalMyDsl.g:2953:2: ( rule__Origin__PitchAssignment_10_1 )
            // InternalMyDsl.g:2953:3: rule__Origin__PitchAssignment_10_1
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
    // InternalMyDsl.g:2962:1: rule__Origin__Group_11__0 : rule__Origin__Group_11__0__Impl rule__Origin__Group_11__1 ;
    public final void rule__Origin__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2966:1: ( rule__Origin__Group_11__0__Impl rule__Origin__Group_11__1 )
            // InternalMyDsl.g:2967:2: rule__Origin__Group_11__0__Impl rule__Origin__Group_11__1
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
    // InternalMyDsl.g:2974:1: rule__Origin__Group_11__0__Impl : ( 'yaw' ) ;
    public final void rule__Origin__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2978:1: ( ( 'yaw' ) )
            // InternalMyDsl.g:2979:1: ( 'yaw' )
            {
            // InternalMyDsl.g:2979:1: ( 'yaw' )
            // InternalMyDsl.g:2980:2: 'yaw'
            {
             before(grammarAccess.getOriginAccess().getYawKeyword_11_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalMyDsl.g:2989:1: rule__Origin__Group_11__1 : rule__Origin__Group_11__1__Impl ;
    public final void rule__Origin__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2993:1: ( rule__Origin__Group_11__1__Impl )
            // InternalMyDsl.g:2994:2: rule__Origin__Group_11__1__Impl
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
    // InternalMyDsl.g:3000:1: rule__Origin__Group_11__1__Impl : ( ( rule__Origin__YawAssignment_11_1 ) ) ;
    public final void rule__Origin__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3004:1: ( ( ( rule__Origin__YawAssignment_11_1 ) ) )
            // InternalMyDsl.g:3005:1: ( ( rule__Origin__YawAssignment_11_1 ) )
            {
            // InternalMyDsl.g:3005:1: ( ( rule__Origin__YawAssignment_11_1 ) )
            // InternalMyDsl.g:3006:2: ( rule__Origin__YawAssignment_11_1 )
            {
             before(grammarAccess.getOriginAccess().getYawAssignment_11_1()); 
            // InternalMyDsl.g:3007:2: ( rule__Origin__YawAssignment_11_1 )
            // InternalMyDsl.g:3007:3: rule__Origin__YawAssignment_11_1
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
    // InternalMyDsl.g:3016:1: rule__Mass__Group__0 : rule__Mass__Group__0__Impl rule__Mass__Group__1 ;
    public final void rule__Mass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3020:1: ( rule__Mass__Group__0__Impl rule__Mass__Group__1 )
            // InternalMyDsl.g:3021:2: rule__Mass__Group__0__Impl rule__Mass__Group__1
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
    // InternalMyDsl.g:3028:1: rule__Mass__Group__0__Impl : ( () ) ;
    public final void rule__Mass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3032:1: ( ( () ) )
            // InternalMyDsl.g:3033:1: ( () )
            {
            // InternalMyDsl.g:3033:1: ( () )
            // InternalMyDsl.g:3034:2: ()
            {
             before(grammarAccess.getMassAccess().getMassAction_0()); 
            // InternalMyDsl.g:3035:2: ()
            // InternalMyDsl.g:3035:3: 
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
    // InternalMyDsl.g:3043:1: rule__Mass__Group__1 : rule__Mass__Group__1__Impl rule__Mass__Group__2 ;
    public final void rule__Mass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3047:1: ( rule__Mass__Group__1__Impl rule__Mass__Group__2 )
            // InternalMyDsl.g:3048:2: rule__Mass__Group__1__Impl rule__Mass__Group__2
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
    // InternalMyDsl.g:3055:1: rule__Mass__Group__1__Impl : ( 'Mass' ) ;
    public final void rule__Mass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3059:1: ( ( 'Mass' ) )
            // InternalMyDsl.g:3060:1: ( 'Mass' )
            {
            // InternalMyDsl.g:3060:1: ( 'Mass' )
            // InternalMyDsl.g:3061:2: 'Mass'
            {
             before(grammarAccess.getMassAccess().getMassKeyword_1()); 
            match(input,39,FOLLOW_2); 
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
    // InternalMyDsl.g:3070:1: rule__Mass__Group__2 : rule__Mass__Group__2__Impl rule__Mass__Group__3 ;
    public final void rule__Mass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3074:1: ( rule__Mass__Group__2__Impl rule__Mass__Group__3 )
            // InternalMyDsl.g:3075:2: rule__Mass__Group__2__Impl rule__Mass__Group__3
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
    // InternalMyDsl.g:3082:1: rule__Mass__Group__2__Impl : ( ( rule__Mass__NameAssignment_2 )? ) ;
    public final void rule__Mass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3086:1: ( ( ( rule__Mass__NameAssignment_2 )? ) )
            // InternalMyDsl.g:3087:1: ( ( rule__Mass__NameAssignment_2 )? )
            {
            // InternalMyDsl.g:3087:1: ( ( rule__Mass__NameAssignment_2 )? )
            // InternalMyDsl.g:3088:2: ( rule__Mass__NameAssignment_2 )?
            {
             before(grammarAccess.getMassAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:3089:2: ( rule__Mass__NameAssignment_2 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ID) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalMyDsl.g:3089:3: rule__Mass__NameAssignment_2
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
    // InternalMyDsl.g:3097:1: rule__Mass__Group__3 : rule__Mass__Group__3__Impl rule__Mass__Group__4 ;
    public final void rule__Mass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3101:1: ( rule__Mass__Group__3__Impl rule__Mass__Group__4 )
            // InternalMyDsl.g:3102:2: rule__Mass__Group__3__Impl rule__Mass__Group__4
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
    // InternalMyDsl.g:3109:1: rule__Mass__Group__3__Impl : ( 'massKilogram' ) ;
    public final void rule__Mass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3113:1: ( ( 'massKilogram' ) )
            // InternalMyDsl.g:3114:1: ( 'massKilogram' )
            {
            // InternalMyDsl.g:3114:1: ( 'massKilogram' )
            // InternalMyDsl.g:3115:2: 'massKilogram'
            {
             before(grammarAccess.getMassAccess().getMassKilogramKeyword_3()); 
            match(input,40,FOLLOW_2); 
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
    // InternalMyDsl.g:3124:1: rule__Mass__Group__4 : rule__Mass__Group__4__Impl ;
    public final void rule__Mass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3128:1: ( rule__Mass__Group__4__Impl )
            // InternalMyDsl.g:3129:2: rule__Mass__Group__4__Impl
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
    // InternalMyDsl.g:3135:1: rule__Mass__Group__4__Impl : ( ( rule__Mass__MassKilogramAssignment_4 ) ) ;
    public final void rule__Mass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3139:1: ( ( ( rule__Mass__MassKilogramAssignment_4 ) ) )
            // InternalMyDsl.g:3140:1: ( ( rule__Mass__MassKilogramAssignment_4 ) )
            {
            // InternalMyDsl.g:3140:1: ( ( rule__Mass__MassKilogramAssignment_4 ) )
            // InternalMyDsl.g:3141:2: ( rule__Mass__MassKilogramAssignment_4 )
            {
             before(grammarAccess.getMassAccess().getMassKilogramAssignment_4()); 
            // InternalMyDsl.g:3142:2: ( rule__Mass__MassKilogramAssignment_4 )
            // InternalMyDsl.g:3142:3: rule__Mass__MassKilogramAssignment_4
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
    // InternalMyDsl.g:3151:1: rule__Collision__Group__0 : rule__Collision__Group__0__Impl rule__Collision__Group__1 ;
    public final void rule__Collision__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3155:1: ( rule__Collision__Group__0__Impl rule__Collision__Group__1 )
            // InternalMyDsl.g:3156:2: rule__Collision__Group__0__Impl rule__Collision__Group__1
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
    // InternalMyDsl.g:3163:1: rule__Collision__Group__0__Impl : ( 'Collision' ) ;
    public final void rule__Collision__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3167:1: ( ( 'Collision' ) )
            // InternalMyDsl.g:3168:1: ( 'Collision' )
            {
            // InternalMyDsl.g:3168:1: ( 'Collision' )
            // InternalMyDsl.g:3169:2: 'Collision'
            {
             before(grammarAccess.getCollisionAccess().getCollisionKeyword_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalMyDsl.g:3178:1: rule__Collision__Group__1 : rule__Collision__Group__1__Impl rule__Collision__Group__2 ;
    public final void rule__Collision__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3182:1: ( rule__Collision__Group__1__Impl rule__Collision__Group__2 )
            // InternalMyDsl.g:3183:2: rule__Collision__Group__1__Impl rule__Collision__Group__2
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
    // InternalMyDsl.g:3190:1: rule__Collision__Group__1__Impl : ( ( rule__Collision__NameAssignment_1 ) ) ;
    public final void rule__Collision__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3194:1: ( ( ( rule__Collision__NameAssignment_1 ) ) )
            // InternalMyDsl.g:3195:1: ( ( rule__Collision__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:3195:1: ( ( rule__Collision__NameAssignment_1 ) )
            // InternalMyDsl.g:3196:2: ( rule__Collision__NameAssignment_1 )
            {
             before(grammarAccess.getCollisionAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:3197:2: ( rule__Collision__NameAssignment_1 )
            // InternalMyDsl.g:3197:3: rule__Collision__NameAssignment_1
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
    // InternalMyDsl.g:3205:1: rule__Collision__Group__2 : rule__Collision__Group__2__Impl rule__Collision__Group__3 ;
    public final void rule__Collision__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3209:1: ( rule__Collision__Group__2__Impl rule__Collision__Group__3 )
            // InternalMyDsl.g:3210:2: rule__Collision__Group__2__Impl rule__Collision__Group__3
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
    // InternalMyDsl.g:3217:1: rule__Collision__Group__2__Impl : ( 'Geometry' ) ;
    public final void rule__Collision__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3221:1: ( ( 'Geometry' ) )
            // InternalMyDsl.g:3222:1: ( 'Geometry' )
            {
            // InternalMyDsl.g:3222:1: ( 'Geometry' )
            // InternalMyDsl.g:3223:2: 'Geometry'
            {
             before(grammarAccess.getCollisionAccess().getGeometryKeyword_2()); 
            match(input,30,FOLLOW_2); 
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
    // InternalMyDsl.g:3232:1: rule__Collision__Group__3 : rule__Collision__Group__3__Impl rule__Collision__Group__4 ;
    public final void rule__Collision__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3236:1: ( rule__Collision__Group__3__Impl rule__Collision__Group__4 )
            // InternalMyDsl.g:3237:2: rule__Collision__Group__3__Impl rule__Collision__Group__4
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
    // InternalMyDsl.g:3244:1: rule__Collision__Group__3__Impl : ( ( rule__Collision__GeometryAssignment_3 )* ) ;
    public final void rule__Collision__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3248:1: ( ( ( rule__Collision__GeometryAssignment_3 )* ) )
            // InternalMyDsl.g:3249:1: ( ( rule__Collision__GeometryAssignment_3 )* )
            {
            // InternalMyDsl.g:3249:1: ( ( rule__Collision__GeometryAssignment_3 )* )
            // InternalMyDsl.g:3250:2: ( rule__Collision__GeometryAssignment_3 )*
            {
             before(grammarAccess.getCollisionAccess().getGeometryAssignment_3()); 
            // InternalMyDsl.g:3251:2: ( rule__Collision__GeometryAssignment_3 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==42||LA28_0==46||LA28_0==48||LA28_0==50) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalMyDsl.g:3251:3: rule__Collision__GeometryAssignment_3
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__Collision__GeometryAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // InternalMyDsl.g:3259:1: rule__Collision__Group__4 : rule__Collision__Group__4__Impl ;
    public final void rule__Collision__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3263:1: ( rule__Collision__Group__4__Impl )
            // InternalMyDsl.g:3264:2: rule__Collision__Group__4__Impl
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
    // InternalMyDsl.g:3270:1: rule__Collision__Group__4__Impl : ( ( rule__Collision__OriginAssignment_4 )? ) ;
    public final void rule__Collision__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3274:1: ( ( ( rule__Collision__OriginAssignment_4 )? ) )
            // InternalMyDsl.g:3275:1: ( ( rule__Collision__OriginAssignment_4 )? )
            {
            // InternalMyDsl.g:3275:1: ( ( rule__Collision__OriginAssignment_4 )? )
            // InternalMyDsl.g:3276:2: ( rule__Collision__OriginAssignment_4 )?
            {
             before(grammarAccess.getCollisionAccess().getOriginAssignment_4()); 
            // InternalMyDsl.g:3277:2: ( rule__Collision__OriginAssignment_4 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==32) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalMyDsl.g:3277:3: rule__Collision__OriginAssignment_4
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
    // InternalMyDsl.g:3286:1: rule__Box__Group__0 : rule__Box__Group__0__Impl rule__Box__Group__1 ;
    public final void rule__Box__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3290:1: ( rule__Box__Group__0__Impl rule__Box__Group__1 )
            // InternalMyDsl.g:3291:2: rule__Box__Group__0__Impl rule__Box__Group__1
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
    // InternalMyDsl.g:3298:1: rule__Box__Group__0__Impl : ( 'Box' ) ;
    public final void rule__Box__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3302:1: ( ( 'Box' ) )
            // InternalMyDsl.g:3303:1: ( 'Box' )
            {
            // InternalMyDsl.g:3303:1: ( 'Box' )
            // InternalMyDsl.g:3304:2: 'Box'
            {
             before(grammarAccess.getBoxAccess().getBoxKeyword_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalMyDsl.g:3313:1: rule__Box__Group__1 : rule__Box__Group__1__Impl rule__Box__Group__2 ;
    public final void rule__Box__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3317:1: ( rule__Box__Group__1__Impl rule__Box__Group__2 )
            // InternalMyDsl.g:3318:2: rule__Box__Group__1__Impl rule__Box__Group__2
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
    // InternalMyDsl.g:3325:1: rule__Box__Group__1__Impl : ( ( rule__Box__NameAssignment_1 )? ) ;
    public final void rule__Box__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3329:1: ( ( ( rule__Box__NameAssignment_1 )? ) )
            // InternalMyDsl.g:3330:1: ( ( rule__Box__NameAssignment_1 )? )
            {
            // InternalMyDsl.g:3330:1: ( ( rule__Box__NameAssignment_1 )? )
            // InternalMyDsl.g:3331:2: ( rule__Box__NameAssignment_1 )?
            {
             before(grammarAccess.getBoxAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:3332:2: ( rule__Box__NameAssignment_1 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_ID) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalMyDsl.g:3332:3: rule__Box__NameAssignment_1
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
    // InternalMyDsl.g:3340:1: rule__Box__Group__2 : rule__Box__Group__2__Impl rule__Box__Group__3 ;
    public final void rule__Box__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3344:1: ( rule__Box__Group__2__Impl rule__Box__Group__3 )
            // InternalMyDsl.g:3345:2: rule__Box__Group__2__Impl rule__Box__Group__3
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
    // InternalMyDsl.g:3352:1: rule__Box__Group__2__Impl : ( 'height' ) ;
    public final void rule__Box__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3356:1: ( ( 'height' ) )
            // InternalMyDsl.g:3357:1: ( 'height' )
            {
            // InternalMyDsl.g:3357:1: ( 'height' )
            // InternalMyDsl.g:3358:2: 'height'
            {
             before(grammarAccess.getBoxAccess().getHeightKeyword_2()); 
            match(input,43,FOLLOW_2); 
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
    // InternalMyDsl.g:3367:1: rule__Box__Group__3 : rule__Box__Group__3__Impl rule__Box__Group__4 ;
    public final void rule__Box__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3371:1: ( rule__Box__Group__3__Impl rule__Box__Group__4 )
            // InternalMyDsl.g:3372:2: rule__Box__Group__3__Impl rule__Box__Group__4
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
    // InternalMyDsl.g:3379:1: rule__Box__Group__3__Impl : ( ( rule__Box__HeightAssignment_3 ) ) ;
    public final void rule__Box__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3383:1: ( ( ( rule__Box__HeightAssignment_3 ) ) )
            // InternalMyDsl.g:3384:1: ( ( rule__Box__HeightAssignment_3 ) )
            {
            // InternalMyDsl.g:3384:1: ( ( rule__Box__HeightAssignment_3 ) )
            // InternalMyDsl.g:3385:2: ( rule__Box__HeightAssignment_3 )
            {
             before(grammarAccess.getBoxAccess().getHeightAssignment_3()); 
            // InternalMyDsl.g:3386:2: ( rule__Box__HeightAssignment_3 )
            // InternalMyDsl.g:3386:3: rule__Box__HeightAssignment_3
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
    // InternalMyDsl.g:3394:1: rule__Box__Group__4 : rule__Box__Group__4__Impl rule__Box__Group__5 ;
    public final void rule__Box__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3398:1: ( rule__Box__Group__4__Impl rule__Box__Group__5 )
            // InternalMyDsl.g:3399:2: rule__Box__Group__4__Impl rule__Box__Group__5
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
    // InternalMyDsl.g:3406:1: rule__Box__Group__4__Impl : ( 'length' ) ;
    public final void rule__Box__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3410:1: ( ( 'length' ) )
            // InternalMyDsl.g:3411:1: ( 'length' )
            {
            // InternalMyDsl.g:3411:1: ( 'length' )
            // InternalMyDsl.g:3412:2: 'length'
            {
             before(grammarAccess.getBoxAccess().getLengthKeyword_4()); 
            match(input,44,FOLLOW_2); 
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
    // InternalMyDsl.g:3421:1: rule__Box__Group__5 : rule__Box__Group__5__Impl rule__Box__Group__6 ;
    public final void rule__Box__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3425:1: ( rule__Box__Group__5__Impl rule__Box__Group__6 )
            // InternalMyDsl.g:3426:2: rule__Box__Group__5__Impl rule__Box__Group__6
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
    // InternalMyDsl.g:3433:1: rule__Box__Group__5__Impl : ( ( rule__Box__LengthAssignment_5 ) ) ;
    public final void rule__Box__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3437:1: ( ( ( rule__Box__LengthAssignment_5 ) ) )
            // InternalMyDsl.g:3438:1: ( ( rule__Box__LengthAssignment_5 ) )
            {
            // InternalMyDsl.g:3438:1: ( ( rule__Box__LengthAssignment_5 ) )
            // InternalMyDsl.g:3439:2: ( rule__Box__LengthAssignment_5 )
            {
             before(grammarAccess.getBoxAccess().getLengthAssignment_5()); 
            // InternalMyDsl.g:3440:2: ( rule__Box__LengthAssignment_5 )
            // InternalMyDsl.g:3440:3: rule__Box__LengthAssignment_5
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
    // InternalMyDsl.g:3448:1: rule__Box__Group__6 : rule__Box__Group__6__Impl rule__Box__Group__7 ;
    public final void rule__Box__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3452:1: ( rule__Box__Group__6__Impl rule__Box__Group__7 )
            // InternalMyDsl.g:3453:2: rule__Box__Group__6__Impl rule__Box__Group__7
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
    // InternalMyDsl.g:3460:1: rule__Box__Group__6__Impl : ( 'width' ) ;
    public final void rule__Box__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3464:1: ( ( 'width' ) )
            // InternalMyDsl.g:3465:1: ( 'width' )
            {
            // InternalMyDsl.g:3465:1: ( 'width' )
            // InternalMyDsl.g:3466:2: 'width'
            {
             before(grammarAccess.getBoxAccess().getWidthKeyword_6()); 
            match(input,45,FOLLOW_2); 
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
    // InternalMyDsl.g:3475:1: rule__Box__Group__7 : rule__Box__Group__7__Impl ;
    public final void rule__Box__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3479:1: ( rule__Box__Group__7__Impl )
            // InternalMyDsl.g:3480:2: rule__Box__Group__7__Impl
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
    // InternalMyDsl.g:3486:1: rule__Box__Group__7__Impl : ( ( rule__Box__WidthAssignment_7 ) ) ;
    public final void rule__Box__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3490:1: ( ( ( rule__Box__WidthAssignment_7 ) ) )
            // InternalMyDsl.g:3491:1: ( ( rule__Box__WidthAssignment_7 ) )
            {
            // InternalMyDsl.g:3491:1: ( ( rule__Box__WidthAssignment_7 ) )
            // InternalMyDsl.g:3492:2: ( rule__Box__WidthAssignment_7 )
            {
             before(grammarAccess.getBoxAccess().getWidthAssignment_7()); 
            // InternalMyDsl.g:3493:2: ( rule__Box__WidthAssignment_7 )
            // InternalMyDsl.g:3493:3: rule__Box__WidthAssignment_7
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
    // InternalMyDsl.g:3502:1: rule__Cylinder__Group__0 : rule__Cylinder__Group__0__Impl rule__Cylinder__Group__1 ;
    public final void rule__Cylinder__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3506:1: ( rule__Cylinder__Group__0__Impl rule__Cylinder__Group__1 )
            // InternalMyDsl.g:3507:2: rule__Cylinder__Group__0__Impl rule__Cylinder__Group__1
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
    // InternalMyDsl.g:3514:1: rule__Cylinder__Group__0__Impl : ( 'Cylinder' ) ;
    public final void rule__Cylinder__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3518:1: ( ( 'Cylinder' ) )
            // InternalMyDsl.g:3519:1: ( 'Cylinder' )
            {
            // InternalMyDsl.g:3519:1: ( 'Cylinder' )
            // InternalMyDsl.g:3520:2: 'Cylinder'
            {
             before(grammarAccess.getCylinderAccess().getCylinderKeyword_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalMyDsl.g:3529:1: rule__Cylinder__Group__1 : rule__Cylinder__Group__1__Impl rule__Cylinder__Group__2 ;
    public final void rule__Cylinder__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3533:1: ( rule__Cylinder__Group__1__Impl rule__Cylinder__Group__2 )
            // InternalMyDsl.g:3534:2: rule__Cylinder__Group__1__Impl rule__Cylinder__Group__2
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
    // InternalMyDsl.g:3541:1: rule__Cylinder__Group__1__Impl : ( ( rule__Cylinder__NameAssignment_1 )? ) ;
    public final void rule__Cylinder__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3545:1: ( ( ( rule__Cylinder__NameAssignment_1 )? ) )
            // InternalMyDsl.g:3546:1: ( ( rule__Cylinder__NameAssignment_1 )? )
            {
            // InternalMyDsl.g:3546:1: ( ( rule__Cylinder__NameAssignment_1 )? )
            // InternalMyDsl.g:3547:2: ( rule__Cylinder__NameAssignment_1 )?
            {
             before(grammarAccess.getCylinderAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:3548:2: ( rule__Cylinder__NameAssignment_1 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_ID) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalMyDsl.g:3548:3: rule__Cylinder__NameAssignment_1
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
    // InternalMyDsl.g:3556:1: rule__Cylinder__Group__2 : rule__Cylinder__Group__2__Impl rule__Cylinder__Group__3 ;
    public final void rule__Cylinder__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3560:1: ( rule__Cylinder__Group__2__Impl rule__Cylinder__Group__3 )
            // InternalMyDsl.g:3561:2: rule__Cylinder__Group__2__Impl rule__Cylinder__Group__3
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
    // InternalMyDsl.g:3568:1: rule__Cylinder__Group__2__Impl : ( 'radius' ) ;
    public final void rule__Cylinder__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3572:1: ( ( 'radius' ) )
            // InternalMyDsl.g:3573:1: ( 'radius' )
            {
            // InternalMyDsl.g:3573:1: ( 'radius' )
            // InternalMyDsl.g:3574:2: 'radius'
            {
             before(grammarAccess.getCylinderAccess().getRadiusKeyword_2()); 
            match(input,47,FOLLOW_2); 
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
    // InternalMyDsl.g:3583:1: rule__Cylinder__Group__3 : rule__Cylinder__Group__3__Impl rule__Cylinder__Group__4 ;
    public final void rule__Cylinder__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3587:1: ( rule__Cylinder__Group__3__Impl rule__Cylinder__Group__4 )
            // InternalMyDsl.g:3588:2: rule__Cylinder__Group__3__Impl rule__Cylinder__Group__4
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
    // InternalMyDsl.g:3595:1: rule__Cylinder__Group__3__Impl : ( ( rule__Cylinder__RadiusAssignment_3 ) ) ;
    public final void rule__Cylinder__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3599:1: ( ( ( rule__Cylinder__RadiusAssignment_3 ) ) )
            // InternalMyDsl.g:3600:1: ( ( rule__Cylinder__RadiusAssignment_3 ) )
            {
            // InternalMyDsl.g:3600:1: ( ( rule__Cylinder__RadiusAssignment_3 ) )
            // InternalMyDsl.g:3601:2: ( rule__Cylinder__RadiusAssignment_3 )
            {
             before(grammarAccess.getCylinderAccess().getRadiusAssignment_3()); 
            // InternalMyDsl.g:3602:2: ( rule__Cylinder__RadiusAssignment_3 )
            // InternalMyDsl.g:3602:3: rule__Cylinder__RadiusAssignment_3
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
    // InternalMyDsl.g:3610:1: rule__Cylinder__Group__4 : rule__Cylinder__Group__4__Impl rule__Cylinder__Group__5 ;
    public final void rule__Cylinder__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3614:1: ( rule__Cylinder__Group__4__Impl rule__Cylinder__Group__5 )
            // InternalMyDsl.g:3615:2: rule__Cylinder__Group__4__Impl rule__Cylinder__Group__5
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
    // InternalMyDsl.g:3622:1: rule__Cylinder__Group__4__Impl : ( 'length' ) ;
    public final void rule__Cylinder__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3626:1: ( ( 'length' ) )
            // InternalMyDsl.g:3627:1: ( 'length' )
            {
            // InternalMyDsl.g:3627:1: ( 'length' )
            // InternalMyDsl.g:3628:2: 'length'
            {
             before(grammarAccess.getCylinderAccess().getLengthKeyword_4()); 
            match(input,44,FOLLOW_2); 
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
    // InternalMyDsl.g:3637:1: rule__Cylinder__Group__5 : rule__Cylinder__Group__5__Impl ;
    public final void rule__Cylinder__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3641:1: ( rule__Cylinder__Group__5__Impl )
            // InternalMyDsl.g:3642:2: rule__Cylinder__Group__5__Impl
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
    // InternalMyDsl.g:3648:1: rule__Cylinder__Group__5__Impl : ( ( rule__Cylinder__LengthAssignment_5 ) ) ;
    public final void rule__Cylinder__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3652:1: ( ( ( rule__Cylinder__LengthAssignment_5 ) ) )
            // InternalMyDsl.g:3653:1: ( ( rule__Cylinder__LengthAssignment_5 ) )
            {
            // InternalMyDsl.g:3653:1: ( ( rule__Cylinder__LengthAssignment_5 ) )
            // InternalMyDsl.g:3654:2: ( rule__Cylinder__LengthAssignment_5 )
            {
             before(grammarAccess.getCylinderAccess().getLengthAssignment_5()); 
            // InternalMyDsl.g:3655:2: ( rule__Cylinder__LengthAssignment_5 )
            // InternalMyDsl.g:3655:3: rule__Cylinder__LengthAssignment_5
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
    // InternalMyDsl.g:3664:1: rule__Mesh__Group__0 : rule__Mesh__Group__0__Impl rule__Mesh__Group__1 ;
    public final void rule__Mesh__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3668:1: ( rule__Mesh__Group__0__Impl rule__Mesh__Group__1 )
            // InternalMyDsl.g:3669:2: rule__Mesh__Group__0__Impl rule__Mesh__Group__1
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
    // InternalMyDsl.g:3676:1: rule__Mesh__Group__0__Impl : ( 'Mesh' ) ;
    public final void rule__Mesh__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3680:1: ( ( 'Mesh' ) )
            // InternalMyDsl.g:3681:1: ( 'Mesh' )
            {
            // InternalMyDsl.g:3681:1: ( 'Mesh' )
            // InternalMyDsl.g:3682:2: 'Mesh'
            {
             before(grammarAccess.getMeshAccess().getMeshKeyword_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalMyDsl.g:3691:1: rule__Mesh__Group__1 : rule__Mesh__Group__1__Impl rule__Mesh__Group__2 ;
    public final void rule__Mesh__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3695:1: ( rule__Mesh__Group__1__Impl rule__Mesh__Group__2 )
            // InternalMyDsl.g:3696:2: rule__Mesh__Group__1__Impl rule__Mesh__Group__2
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
    // InternalMyDsl.g:3703:1: rule__Mesh__Group__1__Impl : ( ( rule__Mesh__NameAssignment_1 )? ) ;
    public final void rule__Mesh__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3707:1: ( ( ( rule__Mesh__NameAssignment_1 )? ) )
            // InternalMyDsl.g:3708:1: ( ( rule__Mesh__NameAssignment_1 )? )
            {
            // InternalMyDsl.g:3708:1: ( ( rule__Mesh__NameAssignment_1 )? )
            // InternalMyDsl.g:3709:2: ( rule__Mesh__NameAssignment_1 )?
            {
             before(grammarAccess.getMeshAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:3710:2: ( rule__Mesh__NameAssignment_1 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_ID) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalMyDsl.g:3710:3: rule__Mesh__NameAssignment_1
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
    // InternalMyDsl.g:3718:1: rule__Mesh__Group__2 : rule__Mesh__Group__2__Impl rule__Mesh__Group__3 ;
    public final void rule__Mesh__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3722:1: ( rule__Mesh__Group__2__Impl rule__Mesh__Group__3 )
            // InternalMyDsl.g:3723:2: rule__Mesh__Group__2__Impl rule__Mesh__Group__3
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
    // InternalMyDsl.g:3730:1: rule__Mesh__Group__2__Impl : ( 'pathToFile' ) ;
    public final void rule__Mesh__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3734:1: ( ( 'pathToFile' ) )
            // InternalMyDsl.g:3735:1: ( 'pathToFile' )
            {
            // InternalMyDsl.g:3735:1: ( 'pathToFile' )
            // InternalMyDsl.g:3736:2: 'pathToFile'
            {
             before(grammarAccess.getMeshAccess().getPathToFileKeyword_2()); 
            match(input,49,FOLLOW_2); 
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
    // InternalMyDsl.g:3745:1: rule__Mesh__Group__3 : rule__Mesh__Group__3__Impl ;
    public final void rule__Mesh__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3749:1: ( rule__Mesh__Group__3__Impl )
            // InternalMyDsl.g:3750:2: rule__Mesh__Group__3__Impl
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
    // InternalMyDsl.g:3756:1: rule__Mesh__Group__3__Impl : ( ( rule__Mesh__PathToFileAssignment_3 ) ) ;
    public final void rule__Mesh__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3760:1: ( ( ( rule__Mesh__PathToFileAssignment_3 ) ) )
            // InternalMyDsl.g:3761:1: ( ( rule__Mesh__PathToFileAssignment_3 ) )
            {
            // InternalMyDsl.g:3761:1: ( ( rule__Mesh__PathToFileAssignment_3 ) )
            // InternalMyDsl.g:3762:2: ( rule__Mesh__PathToFileAssignment_3 )
            {
             before(grammarAccess.getMeshAccess().getPathToFileAssignment_3()); 
            // InternalMyDsl.g:3763:2: ( rule__Mesh__PathToFileAssignment_3 )
            // InternalMyDsl.g:3763:3: rule__Mesh__PathToFileAssignment_3
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
    // InternalMyDsl.g:3772:1: rule__Sphere__Group__0 : rule__Sphere__Group__0__Impl rule__Sphere__Group__1 ;
    public final void rule__Sphere__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3776:1: ( rule__Sphere__Group__0__Impl rule__Sphere__Group__1 )
            // InternalMyDsl.g:3777:2: rule__Sphere__Group__0__Impl rule__Sphere__Group__1
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
    // InternalMyDsl.g:3784:1: rule__Sphere__Group__0__Impl : ( 'Sphere' ) ;
    public final void rule__Sphere__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3788:1: ( ( 'Sphere' ) )
            // InternalMyDsl.g:3789:1: ( 'Sphere' )
            {
            // InternalMyDsl.g:3789:1: ( 'Sphere' )
            // InternalMyDsl.g:3790:2: 'Sphere'
            {
             before(grammarAccess.getSphereAccess().getSphereKeyword_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalMyDsl.g:3799:1: rule__Sphere__Group__1 : rule__Sphere__Group__1__Impl rule__Sphere__Group__2 ;
    public final void rule__Sphere__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3803:1: ( rule__Sphere__Group__1__Impl rule__Sphere__Group__2 )
            // InternalMyDsl.g:3804:2: rule__Sphere__Group__1__Impl rule__Sphere__Group__2
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
    // InternalMyDsl.g:3811:1: rule__Sphere__Group__1__Impl : ( ( rule__Sphere__NameAssignment_1 )? ) ;
    public final void rule__Sphere__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3815:1: ( ( ( rule__Sphere__NameAssignment_1 )? ) )
            // InternalMyDsl.g:3816:1: ( ( rule__Sphere__NameAssignment_1 )? )
            {
            // InternalMyDsl.g:3816:1: ( ( rule__Sphere__NameAssignment_1 )? )
            // InternalMyDsl.g:3817:2: ( rule__Sphere__NameAssignment_1 )?
            {
             before(grammarAccess.getSphereAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:3818:2: ( rule__Sphere__NameAssignment_1 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_ID) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalMyDsl.g:3818:3: rule__Sphere__NameAssignment_1
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
    // InternalMyDsl.g:3826:1: rule__Sphere__Group__2 : rule__Sphere__Group__2__Impl rule__Sphere__Group__3 ;
    public final void rule__Sphere__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3830:1: ( rule__Sphere__Group__2__Impl rule__Sphere__Group__3 )
            // InternalMyDsl.g:3831:2: rule__Sphere__Group__2__Impl rule__Sphere__Group__3
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
    // InternalMyDsl.g:3838:1: rule__Sphere__Group__2__Impl : ( 'radius' ) ;
    public final void rule__Sphere__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3842:1: ( ( 'radius' ) )
            // InternalMyDsl.g:3843:1: ( 'radius' )
            {
            // InternalMyDsl.g:3843:1: ( 'radius' )
            // InternalMyDsl.g:3844:2: 'radius'
            {
             before(grammarAccess.getSphereAccess().getRadiusKeyword_2()); 
            match(input,47,FOLLOW_2); 
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
    // InternalMyDsl.g:3853:1: rule__Sphere__Group__3 : rule__Sphere__Group__3__Impl ;
    public final void rule__Sphere__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3857:1: ( rule__Sphere__Group__3__Impl )
            // InternalMyDsl.g:3858:2: rule__Sphere__Group__3__Impl
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
    // InternalMyDsl.g:3864:1: rule__Sphere__Group__3__Impl : ( ( rule__Sphere__RadiusAssignment_3 ) ) ;
    public final void rule__Sphere__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3868:1: ( ( ( rule__Sphere__RadiusAssignment_3 ) ) )
            // InternalMyDsl.g:3869:1: ( ( rule__Sphere__RadiusAssignment_3 ) )
            {
            // InternalMyDsl.g:3869:1: ( ( rule__Sphere__RadiusAssignment_3 ) )
            // InternalMyDsl.g:3870:2: ( rule__Sphere__RadiusAssignment_3 )
            {
             before(grammarAccess.getSphereAccess().getRadiusAssignment_3()); 
            // InternalMyDsl.g:3871:2: ( rule__Sphere__RadiusAssignment_3 )
            // InternalMyDsl.g:3871:3: rule__Sphere__RadiusAssignment_3
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
    // InternalMyDsl.g:3880:1: rule__Texture__Group__0 : rule__Texture__Group__0__Impl rule__Texture__Group__1 ;
    public final void rule__Texture__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3884:1: ( rule__Texture__Group__0__Impl rule__Texture__Group__1 )
            // InternalMyDsl.g:3885:2: rule__Texture__Group__0__Impl rule__Texture__Group__1
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
    // InternalMyDsl.g:3892:1: rule__Texture__Group__0__Impl : ( 'Texture' ) ;
    public final void rule__Texture__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3896:1: ( ( 'Texture' ) )
            // InternalMyDsl.g:3897:1: ( 'Texture' )
            {
            // InternalMyDsl.g:3897:1: ( 'Texture' )
            // InternalMyDsl.g:3898:2: 'Texture'
            {
             before(grammarAccess.getTextureAccess().getTextureKeyword_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalMyDsl.g:3907:1: rule__Texture__Group__1 : rule__Texture__Group__1__Impl rule__Texture__Group__2 ;
    public final void rule__Texture__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3911:1: ( rule__Texture__Group__1__Impl rule__Texture__Group__2 )
            // InternalMyDsl.g:3912:2: rule__Texture__Group__1__Impl rule__Texture__Group__2
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
    // InternalMyDsl.g:3919:1: rule__Texture__Group__1__Impl : ( ( rule__Texture__NameAssignment_1 )? ) ;
    public final void rule__Texture__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3923:1: ( ( ( rule__Texture__NameAssignment_1 )? ) )
            // InternalMyDsl.g:3924:1: ( ( rule__Texture__NameAssignment_1 )? )
            {
            // InternalMyDsl.g:3924:1: ( ( rule__Texture__NameAssignment_1 )? )
            // InternalMyDsl.g:3925:2: ( rule__Texture__NameAssignment_1 )?
            {
             before(grammarAccess.getTextureAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:3926:2: ( rule__Texture__NameAssignment_1 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_ID) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalMyDsl.g:3926:3: rule__Texture__NameAssignment_1
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
    // InternalMyDsl.g:3934:1: rule__Texture__Group__2 : rule__Texture__Group__2__Impl rule__Texture__Group__3 ;
    public final void rule__Texture__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3938:1: ( rule__Texture__Group__2__Impl rule__Texture__Group__3 )
            // InternalMyDsl.g:3939:2: rule__Texture__Group__2__Impl rule__Texture__Group__3
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
    // InternalMyDsl.g:3946:1: rule__Texture__Group__2__Impl : ( 'pathToFile' ) ;
    public final void rule__Texture__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3950:1: ( ( 'pathToFile' ) )
            // InternalMyDsl.g:3951:1: ( 'pathToFile' )
            {
            // InternalMyDsl.g:3951:1: ( 'pathToFile' )
            // InternalMyDsl.g:3952:2: 'pathToFile'
            {
             before(grammarAccess.getTextureAccess().getPathToFileKeyword_2()); 
            match(input,49,FOLLOW_2); 
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
    // InternalMyDsl.g:3961:1: rule__Texture__Group__3 : rule__Texture__Group__3__Impl ;
    public final void rule__Texture__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3965:1: ( rule__Texture__Group__3__Impl )
            // InternalMyDsl.g:3966:2: rule__Texture__Group__3__Impl
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
    // InternalMyDsl.g:3972:1: rule__Texture__Group__3__Impl : ( ( rule__Texture__PathToFileAssignment_3 ) ) ;
    public final void rule__Texture__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3976:1: ( ( ( rule__Texture__PathToFileAssignment_3 ) ) )
            // InternalMyDsl.g:3977:1: ( ( rule__Texture__PathToFileAssignment_3 ) )
            {
            // InternalMyDsl.g:3977:1: ( ( rule__Texture__PathToFileAssignment_3 ) )
            // InternalMyDsl.g:3978:2: ( rule__Texture__PathToFileAssignment_3 )
            {
             before(grammarAccess.getTextureAccess().getPathToFileAssignment_3()); 
            // InternalMyDsl.g:3979:2: ( rule__Texture__PathToFileAssignment_3 )
            // InternalMyDsl.g:3979:3: rule__Texture__PathToFileAssignment_3
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
    // InternalMyDsl.g:3988:1: rule__Color__Group__0 : rule__Color__Group__0__Impl rule__Color__Group__1 ;
    public final void rule__Color__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3992:1: ( rule__Color__Group__0__Impl rule__Color__Group__1 )
            // InternalMyDsl.g:3993:2: rule__Color__Group__0__Impl rule__Color__Group__1
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
    // InternalMyDsl.g:4000:1: rule__Color__Group__0__Impl : ( 'Color' ) ;
    public final void rule__Color__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4004:1: ( ( 'Color' ) )
            // InternalMyDsl.g:4005:1: ( 'Color' )
            {
            // InternalMyDsl.g:4005:1: ( 'Color' )
            // InternalMyDsl.g:4006:2: 'Color'
            {
             before(grammarAccess.getColorAccess().getColorKeyword_0()); 
            match(input,52,FOLLOW_2); 
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
    // InternalMyDsl.g:4015:1: rule__Color__Group__1 : rule__Color__Group__1__Impl rule__Color__Group__2 ;
    public final void rule__Color__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4019:1: ( rule__Color__Group__1__Impl rule__Color__Group__2 )
            // InternalMyDsl.g:4020:2: rule__Color__Group__1__Impl rule__Color__Group__2
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
    // InternalMyDsl.g:4027:1: rule__Color__Group__1__Impl : ( ( rule__Color__NameAssignment_1 )? ) ;
    public final void rule__Color__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4031:1: ( ( ( rule__Color__NameAssignment_1 )? ) )
            // InternalMyDsl.g:4032:1: ( ( rule__Color__NameAssignment_1 )? )
            {
            // InternalMyDsl.g:4032:1: ( ( rule__Color__NameAssignment_1 )? )
            // InternalMyDsl.g:4033:2: ( rule__Color__NameAssignment_1 )?
            {
             before(grammarAccess.getColorAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:4034:2: ( rule__Color__NameAssignment_1 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_ID) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalMyDsl.g:4034:3: rule__Color__NameAssignment_1
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
    // InternalMyDsl.g:4042:1: rule__Color__Group__2 : rule__Color__Group__2__Impl rule__Color__Group__3 ;
    public final void rule__Color__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4046:1: ( rule__Color__Group__2__Impl rule__Color__Group__3 )
            // InternalMyDsl.g:4047:2: rule__Color__Group__2__Impl rule__Color__Group__3
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
    // InternalMyDsl.g:4054:1: rule__Color__Group__2__Impl : ( 'red' ) ;
    public final void rule__Color__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4058:1: ( ( 'red' ) )
            // InternalMyDsl.g:4059:1: ( 'red' )
            {
            // InternalMyDsl.g:4059:1: ( 'red' )
            // InternalMyDsl.g:4060:2: 'red'
            {
             before(grammarAccess.getColorAccess().getRedKeyword_2()); 
            match(input,53,FOLLOW_2); 
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
    // InternalMyDsl.g:4069:1: rule__Color__Group__3 : rule__Color__Group__3__Impl rule__Color__Group__4 ;
    public final void rule__Color__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4073:1: ( rule__Color__Group__3__Impl rule__Color__Group__4 )
            // InternalMyDsl.g:4074:2: rule__Color__Group__3__Impl rule__Color__Group__4
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
    // InternalMyDsl.g:4081:1: rule__Color__Group__3__Impl : ( ( rule__Color__RedAssignment_3 ) ) ;
    public final void rule__Color__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4085:1: ( ( ( rule__Color__RedAssignment_3 ) ) )
            // InternalMyDsl.g:4086:1: ( ( rule__Color__RedAssignment_3 ) )
            {
            // InternalMyDsl.g:4086:1: ( ( rule__Color__RedAssignment_3 ) )
            // InternalMyDsl.g:4087:2: ( rule__Color__RedAssignment_3 )
            {
             before(grammarAccess.getColorAccess().getRedAssignment_3()); 
            // InternalMyDsl.g:4088:2: ( rule__Color__RedAssignment_3 )
            // InternalMyDsl.g:4088:3: rule__Color__RedAssignment_3
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
    // InternalMyDsl.g:4096:1: rule__Color__Group__4 : rule__Color__Group__4__Impl rule__Color__Group__5 ;
    public final void rule__Color__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4100:1: ( rule__Color__Group__4__Impl rule__Color__Group__5 )
            // InternalMyDsl.g:4101:2: rule__Color__Group__4__Impl rule__Color__Group__5
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
    // InternalMyDsl.g:4108:1: rule__Color__Group__4__Impl : ( 'green' ) ;
    public final void rule__Color__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4112:1: ( ( 'green' ) )
            // InternalMyDsl.g:4113:1: ( 'green' )
            {
            // InternalMyDsl.g:4113:1: ( 'green' )
            // InternalMyDsl.g:4114:2: 'green'
            {
             before(grammarAccess.getColorAccess().getGreenKeyword_4()); 
            match(input,54,FOLLOW_2); 
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
    // InternalMyDsl.g:4123:1: rule__Color__Group__5 : rule__Color__Group__5__Impl rule__Color__Group__6 ;
    public final void rule__Color__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4127:1: ( rule__Color__Group__5__Impl rule__Color__Group__6 )
            // InternalMyDsl.g:4128:2: rule__Color__Group__5__Impl rule__Color__Group__6
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
    // InternalMyDsl.g:4135:1: rule__Color__Group__5__Impl : ( ( rule__Color__GreenAssignment_5 ) ) ;
    public final void rule__Color__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4139:1: ( ( ( rule__Color__GreenAssignment_5 ) ) )
            // InternalMyDsl.g:4140:1: ( ( rule__Color__GreenAssignment_5 ) )
            {
            // InternalMyDsl.g:4140:1: ( ( rule__Color__GreenAssignment_5 ) )
            // InternalMyDsl.g:4141:2: ( rule__Color__GreenAssignment_5 )
            {
             before(grammarAccess.getColorAccess().getGreenAssignment_5()); 
            // InternalMyDsl.g:4142:2: ( rule__Color__GreenAssignment_5 )
            // InternalMyDsl.g:4142:3: rule__Color__GreenAssignment_5
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
    // InternalMyDsl.g:4150:1: rule__Color__Group__6 : rule__Color__Group__6__Impl rule__Color__Group__7 ;
    public final void rule__Color__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4154:1: ( rule__Color__Group__6__Impl rule__Color__Group__7 )
            // InternalMyDsl.g:4155:2: rule__Color__Group__6__Impl rule__Color__Group__7
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
    // InternalMyDsl.g:4162:1: rule__Color__Group__6__Impl : ( 'blue' ) ;
    public final void rule__Color__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4166:1: ( ( 'blue' ) )
            // InternalMyDsl.g:4167:1: ( 'blue' )
            {
            // InternalMyDsl.g:4167:1: ( 'blue' )
            // InternalMyDsl.g:4168:2: 'blue'
            {
             before(grammarAccess.getColorAccess().getBlueKeyword_6()); 
            match(input,55,FOLLOW_2); 
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
    // InternalMyDsl.g:4177:1: rule__Color__Group__7 : rule__Color__Group__7__Impl rule__Color__Group__8 ;
    public final void rule__Color__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4181:1: ( rule__Color__Group__7__Impl rule__Color__Group__8 )
            // InternalMyDsl.g:4182:2: rule__Color__Group__7__Impl rule__Color__Group__8
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
    // InternalMyDsl.g:4189:1: rule__Color__Group__7__Impl : ( ( rule__Color__BlueAssignment_7 ) ) ;
    public final void rule__Color__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4193:1: ( ( ( rule__Color__BlueAssignment_7 ) ) )
            // InternalMyDsl.g:4194:1: ( ( rule__Color__BlueAssignment_7 ) )
            {
            // InternalMyDsl.g:4194:1: ( ( rule__Color__BlueAssignment_7 ) )
            // InternalMyDsl.g:4195:2: ( rule__Color__BlueAssignment_7 )
            {
             before(grammarAccess.getColorAccess().getBlueAssignment_7()); 
            // InternalMyDsl.g:4196:2: ( rule__Color__BlueAssignment_7 )
            // InternalMyDsl.g:4196:3: rule__Color__BlueAssignment_7
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
    // InternalMyDsl.g:4204:1: rule__Color__Group__8 : rule__Color__Group__8__Impl rule__Color__Group__9 ;
    public final void rule__Color__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4208:1: ( rule__Color__Group__8__Impl rule__Color__Group__9 )
            // InternalMyDsl.g:4209:2: rule__Color__Group__8__Impl rule__Color__Group__9
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
    // InternalMyDsl.g:4216:1: rule__Color__Group__8__Impl : ( 'alpha' ) ;
    public final void rule__Color__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4220:1: ( ( 'alpha' ) )
            // InternalMyDsl.g:4221:1: ( 'alpha' )
            {
            // InternalMyDsl.g:4221:1: ( 'alpha' )
            // InternalMyDsl.g:4222:2: 'alpha'
            {
             before(grammarAccess.getColorAccess().getAlphaKeyword_8()); 
            match(input,56,FOLLOW_2); 
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
    // InternalMyDsl.g:4231:1: rule__Color__Group__9 : rule__Color__Group__9__Impl ;
    public final void rule__Color__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4235:1: ( rule__Color__Group__9__Impl )
            // InternalMyDsl.g:4236:2: rule__Color__Group__9__Impl
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
    // InternalMyDsl.g:4242:1: rule__Color__Group__9__Impl : ( ( rule__Color__AlphaAssignment_9 ) ) ;
    public final void rule__Color__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4246:1: ( ( ( rule__Color__AlphaAssignment_9 ) ) )
            // InternalMyDsl.g:4247:1: ( ( rule__Color__AlphaAssignment_9 ) )
            {
            // InternalMyDsl.g:4247:1: ( ( rule__Color__AlphaAssignment_9 ) )
            // InternalMyDsl.g:4248:2: ( rule__Color__AlphaAssignment_9 )
            {
             before(grammarAccess.getColorAccess().getAlphaAssignment_9()); 
            // InternalMyDsl.g:4249:2: ( rule__Color__AlphaAssignment_9 )
            // InternalMyDsl.g:4249:3: rule__Color__AlphaAssignment_9
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
    // InternalMyDsl.g:4258:1: rule__Joint__Group__0 : rule__Joint__Group__0__Impl rule__Joint__Group__1 ;
    public final void rule__Joint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4262:1: ( rule__Joint__Group__0__Impl rule__Joint__Group__1 )
            // InternalMyDsl.g:4263:2: rule__Joint__Group__0__Impl rule__Joint__Group__1
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
    // InternalMyDsl.g:4270:1: rule__Joint__Group__0__Impl : ( 'Joint' ) ;
    public final void rule__Joint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4274:1: ( ( 'Joint' ) )
            // InternalMyDsl.g:4275:1: ( 'Joint' )
            {
            // InternalMyDsl.g:4275:1: ( 'Joint' )
            // InternalMyDsl.g:4276:2: 'Joint'
            {
             before(grammarAccess.getJointAccess().getJointKeyword_0()); 
            match(input,57,FOLLOW_2); 
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
    // InternalMyDsl.g:4285:1: rule__Joint__Group__1 : rule__Joint__Group__1__Impl rule__Joint__Group__2 ;
    public final void rule__Joint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4289:1: ( rule__Joint__Group__1__Impl rule__Joint__Group__2 )
            // InternalMyDsl.g:4290:2: rule__Joint__Group__1__Impl rule__Joint__Group__2
            {
            pushFollow(FOLLOW_48);
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
    // InternalMyDsl.g:4297:1: rule__Joint__Group__1__Impl : ( ( rule__Joint__NameAssignment_1 ) ) ;
    public final void rule__Joint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4301:1: ( ( ( rule__Joint__NameAssignment_1 ) ) )
            // InternalMyDsl.g:4302:1: ( ( rule__Joint__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:4302:1: ( ( rule__Joint__NameAssignment_1 ) )
            // InternalMyDsl.g:4303:2: ( rule__Joint__NameAssignment_1 )
            {
             before(grammarAccess.getJointAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:4304:2: ( rule__Joint__NameAssignment_1 )
            // InternalMyDsl.g:4304:3: rule__Joint__NameAssignment_1
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
    // InternalMyDsl.g:4312:1: rule__Joint__Group__2 : rule__Joint__Group__2__Impl rule__Joint__Group__3 ;
    public final void rule__Joint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4316:1: ( rule__Joint__Group__2__Impl rule__Joint__Group__3 )
            // InternalMyDsl.g:4317:2: rule__Joint__Group__2__Impl rule__Joint__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Joint__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group__3();

            state._fsp--;


            }

        }
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
    // InternalMyDsl.g:4324:1: rule__Joint__Group__2__Impl : ( 'ChildOf' ) ;
    public final void rule__Joint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4328:1: ( ( 'ChildOf' ) )
            // InternalMyDsl.g:4329:1: ( 'ChildOf' )
            {
            // InternalMyDsl.g:4329:1: ( 'ChildOf' )
            // InternalMyDsl.g:4330:2: 'ChildOf'
            {
             before(grammarAccess.getJointAccess().getChildOfKeyword_2()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getChildOfKeyword_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Joint__Group__3"
    // InternalMyDsl.g:4339:1: rule__Joint__Group__3 : rule__Joint__Group__3__Impl rule__Joint__Group__4 ;
    public final void rule__Joint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4343:1: ( rule__Joint__Group__3__Impl rule__Joint__Group__4 )
            // InternalMyDsl.g:4344:2: rule__Joint__Group__3__Impl rule__Joint__Group__4
            {
            pushFollow(FOLLOW_49);
            rule__Joint__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__3"


    // $ANTLR start "rule__Joint__Group__3__Impl"
    // InternalMyDsl.g:4351:1: rule__Joint__Group__3__Impl : ( ( rule__Joint__ChildOfAssignment_3 ) ) ;
    public final void rule__Joint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4355:1: ( ( ( rule__Joint__ChildOfAssignment_3 ) ) )
            // InternalMyDsl.g:4356:1: ( ( rule__Joint__ChildOfAssignment_3 ) )
            {
            // InternalMyDsl.g:4356:1: ( ( rule__Joint__ChildOfAssignment_3 ) )
            // InternalMyDsl.g:4357:2: ( rule__Joint__ChildOfAssignment_3 )
            {
             before(grammarAccess.getJointAccess().getChildOfAssignment_3()); 
            // InternalMyDsl.g:4358:2: ( rule__Joint__ChildOfAssignment_3 )
            // InternalMyDsl.g:4358:3: rule__Joint__ChildOfAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Joint__ChildOfAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getChildOfAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__3__Impl"


    // $ANTLR start "rule__Joint__Group__4"
    // InternalMyDsl.g:4366:1: rule__Joint__Group__4 : rule__Joint__Group__4__Impl rule__Joint__Group__5 ;
    public final void rule__Joint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4370:1: ( rule__Joint__Group__4__Impl rule__Joint__Group__5 )
            // InternalMyDsl.g:4371:2: rule__Joint__Group__4__Impl rule__Joint__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__Joint__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__4"


    // $ANTLR start "rule__Joint__Group__4__Impl"
    // InternalMyDsl.g:4378:1: rule__Joint__Group__4__Impl : ( 'ParentOf' ) ;
    public final void rule__Joint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4382:1: ( ( 'ParentOf' ) )
            // InternalMyDsl.g:4383:1: ( 'ParentOf' )
            {
            // InternalMyDsl.g:4383:1: ( 'ParentOf' )
            // InternalMyDsl.g:4384:2: 'ParentOf'
            {
             before(grammarAccess.getJointAccess().getParentOfKeyword_4()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getParentOfKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__4__Impl"


    // $ANTLR start "rule__Joint__Group__5"
    // InternalMyDsl.g:4393:1: rule__Joint__Group__5 : rule__Joint__Group__5__Impl rule__Joint__Group__6 ;
    public final void rule__Joint__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4397:1: ( rule__Joint__Group__5__Impl rule__Joint__Group__6 )
            // InternalMyDsl.g:4398:2: rule__Joint__Group__5__Impl rule__Joint__Group__6
            {
            pushFollow(FOLLOW_50);
            rule__Joint__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__5"


    // $ANTLR start "rule__Joint__Group__5__Impl"
    // InternalMyDsl.g:4405:1: rule__Joint__Group__5__Impl : ( ( rule__Joint__ParentOfAssignment_5 ) ) ;
    public final void rule__Joint__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4409:1: ( ( ( rule__Joint__ParentOfAssignment_5 ) ) )
            // InternalMyDsl.g:4410:1: ( ( rule__Joint__ParentOfAssignment_5 ) )
            {
            // InternalMyDsl.g:4410:1: ( ( rule__Joint__ParentOfAssignment_5 ) )
            // InternalMyDsl.g:4411:2: ( rule__Joint__ParentOfAssignment_5 )
            {
             before(grammarAccess.getJointAccess().getParentOfAssignment_5()); 
            // InternalMyDsl.g:4412:2: ( rule__Joint__ParentOfAssignment_5 )
            // InternalMyDsl.g:4412:3: rule__Joint__ParentOfAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Joint__ParentOfAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getParentOfAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__5__Impl"


    // $ANTLR start "rule__Joint__Group__6"
    // InternalMyDsl.g:4420:1: rule__Joint__Group__6 : rule__Joint__Group__6__Impl rule__Joint__Group__7 ;
    public final void rule__Joint__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4424:1: ( rule__Joint__Group__6__Impl rule__Joint__Group__7 )
            // InternalMyDsl.g:4425:2: rule__Joint__Group__6__Impl rule__Joint__Group__7
            {
            pushFollow(FOLLOW_51);
            rule__Joint__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__6"


    // $ANTLR start "rule__Joint__Group__6__Impl"
    // InternalMyDsl.g:4432:1: rule__Joint__Group__6__Impl : ( 'Type' ) ;
    public final void rule__Joint__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4436:1: ( ( 'Type' ) )
            // InternalMyDsl.g:4437:1: ( 'Type' )
            {
            // InternalMyDsl.g:4437:1: ( 'Type' )
            // InternalMyDsl.g:4438:2: 'Type'
            {
             before(grammarAccess.getJointAccess().getTypeKeyword_6()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getTypeKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__6__Impl"


    // $ANTLR start "rule__Joint__Group__7"
    // InternalMyDsl.g:4447:1: rule__Joint__Group__7 : rule__Joint__Group__7__Impl rule__Joint__Group__8 ;
    public final void rule__Joint__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4451:1: ( rule__Joint__Group__7__Impl rule__Joint__Group__8 )
            // InternalMyDsl.g:4452:2: rule__Joint__Group__7__Impl rule__Joint__Group__8
            {
            pushFollow(FOLLOW_52);
            rule__Joint__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__7"


    // $ANTLR start "rule__Joint__Group__7__Impl"
    // InternalMyDsl.g:4459:1: rule__Joint__Group__7__Impl : ( ( rule__Joint__TypeAssignment_7 ) ) ;
    public final void rule__Joint__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4463:1: ( ( ( rule__Joint__TypeAssignment_7 ) ) )
            // InternalMyDsl.g:4464:1: ( ( rule__Joint__TypeAssignment_7 ) )
            {
            // InternalMyDsl.g:4464:1: ( ( rule__Joint__TypeAssignment_7 ) )
            // InternalMyDsl.g:4465:2: ( rule__Joint__TypeAssignment_7 )
            {
             before(grammarAccess.getJointAccess().getTypeAssignment_7()); 
            // InternalMyDsl.g:4466:2: ( rule__Joint__TypeAssignment_7 )
            // InternalMyDsl.g:4466:3: rule__Joint__TypeAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Joint__TypeAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getTypeAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__7__Impl"


    // $ANTLR start "rule__Joint__Group__8"
    // InternalMyDsl.g:4474:1: rule__Joint__Group__8 : rule__Joint__Group__8__Impl ;
    public final void rule__Joint__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4478:1: ( rule__Joint__Group__8__Impl )
            // InternalMyDsl.g:4479:2: rule__Joint__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Joint__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__8"


    // $ANTLR start "rule__Joint__Group__8__Impl"
    // InternalMyDsl.g:4485:1: rule__Joint__Group__8__Impl : ( ( rule__Joint__Group_8__0 )? ) ;
    public final void rule__Joint__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4489:1: ( ( ( rule__Joint__Group_8__0 )? ) )
            // InternalMyDsl.g:4490:1: ( ( rule__Joint__Group_8__0 )? )
            {
            // InternalMyDsl.g:4490:1: ( ( rule__Joint__Group_8__0 )? )
            // InternalMyDsl.g:4491:2: ( rule__Joint__Group_8__0 )?
            {
             before(grammarAccess.getJointAccess().getGroup_8()); 
            // InternalMyDsl.g:4492:2: ( rule__Joint__Group_8__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==61) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalMyDsl.g:4492:3: rule__Joint__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Joint__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getJointAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__8__Impl"


    // $ANTLR start "rule__Joint__Group_8__0"
    // InternalMyDsl.g:4501:1: rule__Joint__Group_8__0 : rule__Joint__Group_8__0__Impl rule__Joint__Group_8__1 ;
    public final void rule__Joint__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4505:1: ( rule__Joint__Group_8__0__Impl rule__Joint__Group_8__1 )
            // InternalMyDsl.g:4506:2: rule__Joint__Group_8__0__Impl rule__Joint__Group_8__1
            {
            pushFollow(FOLLOW_3);
            rule__Joint__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_8__0"


    // $ANTLR start "rule__Joint__Group_8__0__Impl"
    // InternalMyDsl.g:4513:1: rule__Joint__Group_8__0__Impl : ( 'isReuseOf' ) ;
    public final void rule__Joint__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4517:1: ( ( 'isReuseOf' ) )
            // InternalMyDsl.g:4518:1: ( 'isReuseOf' )
            {
            // InternalMyDsl.g:4518:1: ( 'isReuseOf' )
            // InternalMyDsl.g:4519:2: 'isReuseOf'
            {
             before(grammarAccess.getJointAccess().getIsReuseOfKeyword_8_0()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getIsReuseOfKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_8__0__Impl"


    // $ANTLR start "rule__Joint__Group_8__1"
    // InternalMyDsl.g:4528:1: rule__Joint__Group_8__1 : rule__Joint__Group_8__1__Impl ;
    public final void rule__Joint__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4532:1: ( rule__Joint__Group_8__1__Impl )
            // InternalMyDsl.g:4533:2: rule__Joint__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Joint__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_8__1"


    // $ANTLR start "rule__Joint__Group_8__1__Impl"
    // InternalMyDsl.g:4539:1: rule__Joint__Group_8__1__Impl : ( ( rule__Joint__IsReuseOfAssignment_8_1 ) ) ;
    public final void rule__Joint__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4543:1: ( ( ( rule__Joint__IsReuseOfAssignment_8_1 ) ) )
            // InternalMyDsl.g:4544:1: ( ( rule__Joint__IsReuseOfAssignment_8_1 ) )
            {
            // InternalMyDsl.g:4544:1: ( ( rule__Joint__IsReuseOfAssignment_8_1 ) )
            // InternalMyDsl.g:4545:2: ( rule__Joint__IsReuseOfAssignment_8_1 )
            {
             before(grammarAccess.getJointAccess().getIsReuseOfAssignment_8_1()); 
            // InternalMyDsl.g:4546:2: ( rule__Joint__IsReuseOfAssignment_8_1 )
            // InternalMyDsl.g:4546:3: rule__Joint__IsReuseOfAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__Joint__IsReuseOfAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getIsReuseOfAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_8__1__Impl"


    // $ANTLR start "rule__FLOAT__Group__0"
    // InternalMyDsl.g:4555:1: rule__FLOAT__Group__0 : rule__FLOAT__Group__0__Impl rule__FLOAT__Group__1 ;
    public final void rule__FLOAT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4559:1: ( rule__FLOAT__Group__0__Impl rule__FLOAT__Group__1 )
            // InternalMyDsl.g:4560:2: rule__FLOAT__Group__0__Impl rule__FLOAT__Group__1
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
    // InternalMyDsl.g:4567:1: rule__FLOAT__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__FLOAT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4571:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:4572:1: ( RULE_INT )
            {
            // InternalMyDsl.g:4572:1: ( RULE_INT )
            // InternalMyDsl.g:4573:2: RULE_INT
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
    // InternalMyDsl.g:4582:1: rule__FLOAT__Group__1 : rule__FLOAT__Group__1__Impl rule__FLOAT__Group__2 ;
    public final void rule__FLOAT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4586:1: ( rule__FLOAT__Group__1__Impl rule__FLOAT__Group__2 )
            // InternalMyDsl.g:4587:2: rule__FLOAT__Group__1__Impl rule__FLOAT__Group__2
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
    // InternalMyDsl.g:4594:1: rule__FLOAT__Group__1__Impl : ( '.' ) ;
    public final void rule__FLOAT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4598:1: ( ( '.' ) )
            // InternalMyDsl.g:4599:1: ( '.' )
            {
            // InternalMyDsl.g:4599:1: ( '.' )
            // InternalMyDsl.g:4600:2: '.'
            {
             before(grammarAccess.getFLOATAccess().getFullStopKeyword_1()); 
            match(input,20,FOLLOW_2); 
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
    // InternalMyDsl.g:4609:1: rule__FLOAT__Group__2 : rule__FLOAT__Group__2__Impl ;
    public final void rule__FLOAT__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4613:1: ( rule__FLOAT__Group__2__Impl )
            // InternalMyDsl.g:4614:2: rule__FLOAT__Group__2__Impl
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
    // InternalMyDsl.g:4620:1: rule__FLOAT__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__FLOAT__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4624:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:4625:1: ( RULE_INT )
            {
            // InternalMyDsl.g:4625:1: ( RULE_INT )
            // InternalMyDsl.g:4626:2: RULE_INT
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
    // InternalMyDsl.g:4636:1: rule__SCIENTIFIC__Group__0 : rule__SCIENTIFIC__Group__0__Impl rule__SCIENTIFIC__Group__1 ;
    public final void rule__SCIENTIFIC__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4640:1: ( rule__SCIENTIFIC__Group__0__Impl rule__SCIENTIFIC__Group__1 )
            // InternalMyDsl.g:4641:2: rule__SCIENTIFIC__Group__0__Impl rule__SCIENTIFIC__Group__1
            {
            pushFollow(FOLLOW_53);
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
    // InternalMyDsl.g:4648:1: rule__SCIENTIFIC__Group__0__Impl : ( ruleFLOAT ) ;
    public final void rule__SCIENTIFIC__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4652:1: ( ( ruleFLOAT ) )
            // InternalMyDsl.g:4653:1: ( ruleFLOAT )
            {
            // InternalMyDsl.g:4653:1: ( ruleFLOAT )
            // InternalMyDsl.g:4654:2: ruleFLOAT
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
    // InternalMyDsl.g:4663:1: rule__SCIENTIFIC__Group__1 : rule__SCIENTIFIC__Group__1__Impl rule__SCIENTIFIC__Group__2 ;
    public final void rule__SCIENTIFIC__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4667:1: ( rule__SCIENTIFIC__Group__1__Impl rule__SCIENTIFIC__Group__2 )
            // InternalMyDsl.g:4668:2: rule__SCIENTIFIC__Group__1__Impl rule__SCIENTIFIC__Group__2
            {
            pushFollow(FOLLOW_54);
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
    // InternalMyDsl.g:4675:1: rule__SCIENTIFIC__Group__1__Impl : ( 'e' ) ;
    public final void rule__SCIENTIFIC__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4679:1: ( ( 'e' ) )
            // InternalMyDsl.g:4680:1: ( 'e' )
            {
            // InternalMyDsl.g:4680:1: ( 'e' )
            // InternalMyDsl.g:4681:2: 'e'
            {
             before(grammarAccess.getSCIENTIFICAccess().getEKeyword_1()); 
            match(input,62,FOLLOW_2); 
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
    // InternalMyDsl.g:4690:1: rule__SCIENTIFIC__Group__2 : rule__SCIENTIFIC__Group__2__Impl rule__SCIENTIFIC__Group__3 ;
    public final void rule__SCIENTIFIC__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4694:1: ( rule__SCIENTIFIC__Group__2__Impl rule__SCIENTIFIC__Group__3 )
            // InternalMyDsl.g:4695:2: rule__SCIENTIFIC__Group__2__Impl rule__SCIENTIFIC__Group__3
            {
            pushFollow(FOLLOW_54);
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
    // InternalMyDsl.g:4702:1: rule__SCIENTIFIC__Group__2__Impl : ( ( rule__SCIENTIFIC__Alternatives_2 )? ) ;
    public final void rule__SCIENTIFIC__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4706:1: ( ( ( rule__SCIENTIFIC__Alternatives_2 )? ) )
            // InternalMyDsl.g:4707:1: ( ( rule__SCIENTIFIC__Alternatives_2 )? )
            {
            // InternalMyDsl.g:4707:1: ( ( rule__SCIENTIFIC__Alternatives_2 )? )
            // InternalMyDsl.g:4708:2: ( rule__SCIENTIFIC__Alternatives_2 )?
            {
             before(grammarAccess.getSCIENTIFICAccess().getAlternatives_2()); 
            // InternalMyDsl.g:4709:2: ( rule__SCIENTIFIC__Alternatives_2 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=12 && LA37_0<=13)) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalMyDsl.g:4709:3: rule__SCIENTIFIC__Alternatives_2
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
    // InternalMyDsl.g:4717:1: rule__SCIENTIFIC__Group__3 : rule__SCIENTIFIC__Group__3__Impl ;
    public final void rule__SCIENTIFIC__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4721:1: ( rule__SCIENTIFIC__Group__3__Impl )
            // InternalMyDsl.g:4722:2: rule__SCIENTIFIC__Group__3__Impl
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
    // InternalMyDsl.g:4728:1: rule__SCIENTIFIC__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__SCIENTIFIC__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4732:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:4733:1: ( RULE_INT )
            {
            // InternalMyDsl.g:4733:1: ( RULE_INT )
            // InternalMyDsl.g:4734:2: RULE_INT
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
    // InternalMyDsl.g:4744:1: rule__SIGNED_NUMERIC__Group__0 : rule__SIGNED_NUMERIC__Group__0__Impl rule__SIGNED_NUMERIC__Group__1 ;
    public final void rule__SIGNED_NUMERIC__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4748:1: ( rule__SIGNED_NUMERIC__Group__0__Impl rule__SIGNED_NUMERIC__Group__1 )
            // InternalMyDsl.g:4749:2: rule__SIGNED_NUMERIC__Group__0__Impl rule__SIGNED_NUMERIC__Group__1
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
    // InternalMyDsl.g:4756:1: rule__SIGNED_NUMERIC__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__SIGNED_NUMERIC__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4760:1: ( ( ( '-' )? ) )
            // InternalMyDsl.g:4761:1: ( ( '-' )? )
            {
            // InternalMyDsl.g:4761:1: ( ( '-' )? )
            // InternalMyDsl.g:4762:2: ( '-' )?
            {
             before(grammarAccess.getSIGNED_NUMERICAccess().getHyphenMinusKeyword_0()); 
            // InternalMyDsl.g:4763:2: ( '-' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==13) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalMyDsl.g:4763:3: '-'
                    {
                    match(input,13,FOLLOW_2); 

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
    // InternalMyDsl.g:4771:1: rule__SIGNED_NUMERIC__Group__1 : rule__SIGNED_NUMERIC__Group__1__Impl ;
    public final void rule__SIGNED_NUMERIC__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4775:1: ( rule__SIGNED_NUMERIC__Group__1__Impl )
            // InternalMyDsl.g:4776:2: rule__SIGNED_NUMERIC__Group__1__Impl
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
    // InternalMyDsl.g:4782:1: rule__SIGNED_NUMERIC__Group__1__Impl : ( ( rule__SIGNED_NUMERIC__Alternatives_1 ) ) ;
    public final void rule__SIGNED_NUMERIC__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4786:1: ( ( ( rule__SIGNED_NUMERIC__Alternatives_1 ) ) )
            // InternalMyDsl.g:4787:1: ( ( rule__SIGNED_NUMERIC__Alternatives_1 ) )
            {
            // InternalMyDsl.g:4787:1: ( ( rule__SIGNED_NUMERIC__Alternatives_1 ) )
            // InternalMyDsl.g:4788:2: ( rule__SIGNED_NUMERIC__Alternatives_1 )
            {
             before(grammarAccess.getSIGNED_NUMERICAccess().getAlternatives_1()); 
            // InternalMyDsl.g:4789:2: ( rule__SIGNED_NUMERIC__Alternatives_1 )
            // InternalMyDsl.g:4789:3: rule__SIGNED_NUMERIC__Alternatives_1
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
    // InternalMyDsl.g:4798:1: rule__Robot__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Robot__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4802:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4803:2: ( RULE_ID )
            {
            // InternalMyDsl.g:4803:2: ( RULE_ID )
            // InternalMyDsl.g:4804:3: RULE_ID
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
    // InternalMyDsl.g:4813:1: rule__Robot__LinksAssignment_2_0 : ( ruleLink ) ;
    public final void rule__Robot__LinksAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4817:1: ( ( ruleLink ) )
            // InternalMyDsl.g:4818:2: ( ruleLink )
            {
            // InternalMyDsl.g:4818:2: ( ruleLink )
            // InternalMyDsl.g:4819:3: ruleLink
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
    // InternalMyDsl.g:4828:1: rule__Robot__JointAssignment_2_1 : ( ruleJoint ) ;
    public final void rule__Robot__JointAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4832:1: ( ( ruleJoint ) )
            // InternalMyDsl.g:4833:2: ( ruleJoint )
            {
            // InternalMyDsl.g:4833:2: ( ruleJoint )
            // InternalMyDsl.g:4834:3: ruleJoint
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
    // InternalMyDsl.g:4843:1: rule__Link__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Link__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4847:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4848:2: ( RULE_ID )
            {
            // InternalMyDsl.g:4848:2: ( RULE_ID )
            // InternalMyDsl.g:4849:3: RULE_ID
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
    // InternalMyDsl.g:4858:1: rule__Link__InertialAssignment_3_0_1_0 : ( ruleInertial ) ;
    public final void rule__Link__InertialAssignment_3_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4862:1: ( ( ruleInertial ) )
            // InternalMyDsl.g:4863:2: ( ruleInertial )
            {
            // InternalMyDsl.g:4863:2: ( ruleInertial )
            // InternalMyDsl.g:4864:3: ruleInertial
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
    // InternalMyDsl.g:4873:1: rule__Link__VisualAssignment_3_0_1_1 : ( ruleVisual ) ;
    public final void rule__Link__VisualAssignment_3_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4877:1: ( ( ruleVisual ) )
            // InternalMyDsl.g:4878:2: ( ruleVisual )
            {
            // InternalMyDsl.g:4878:2: ( ruleVisual )
            // InternalMyDsl.g:4879:3: ruleVisual
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
    // InternalMyDsl.g:4888:1: rule__Link__CollisionAssignment_3_0_1_2 : ( ruleCollision ) ;
    public final void rule__Link__CollisionAssignment_3_0_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4892:1: ( ( ruleCollision ) )
            // InternalMyDsl.g:4893:2: ( ruleCollision )
            {
            // InternalMyDsl.g:4893:2: ( ruleCollision )
            // InternalMyDsl.g:4894:3: ruleCollision
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
    // InternalMyDsl.g:4903:1: rule__Link__LinkAssignment_3_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Link__LinkAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4907:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:4908:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:4908:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:4909:3: ( RULE_ID )
            {
             before(grammarAccess.getLinkAccess().getLinkLinkCrossReference_3_1_1_0()); 
            // InternalMyDsl.g:4910:3: ( RULE_ID )
            // InternalMyDsl.g:4911:4: RULE_ID
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
    // InternalMyDsl.g:4922:1: rule__Link__ReuseAssignment_3_1_2 : ( ruleReuse ) ;
    public final void rule__Link__ReuseAssignment_3_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4926:1: ( ( ruleReuse ) )
            // InternalMyDsl.g:4927:2: ( ruleReuse )
            {
            // InternalMyDsl.g:4927:2: ( ruleReuse )
            // InternalMyDsl.g:4928:3: ruleReuse
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
    // InternalMyDsl.g:4937:1: rule__Reuse__RefAssignment_1_0_1 : ( ruleDotExpression ) ;
    public final void rule__Reuse__RefAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4941:1: ( ( ruleDotExpression ) )
            // InternalMyDsl.g:4942:2: ( ruleDotExpression )
            {
            // InternalMyDsl.g:4942:2: ( ruleDotExpression )
            // InternalMyDsl.g:4943:3: ruleDotExpression
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
    // InternalMyDsl.g:4952:1: rule__Reuse__AddAssignment_1_1_1 : ( ruleReUseAble ) ;
    public final void rule__Reuse__AddAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4956:1: ( ( ruleReUseAble ) )
            // InternalMyDsl.g:4957:2: ( ruleReUseAble )
            {
            // InternalMyDsl.g:4957:2: ( ruleReUseAble )
            // InternalMyDsl.g:4958:3: ruleReUseAble
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
    // InternalMyDsl.g:4967:1: rule__DotExpression__TailAssignment_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__DotExpression__TailAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4971:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:4972:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:4972:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:4973:3: ( RULE_ID )
            {
             before(grammarAccess.getDotExpressionAccess().getTailReUseAbleCrossReference_1_2_0()); 
            // InternalMyDsl.g:4974:3: ( RULE_ID )
            // InternalMyDsl.g:4975:4: RULE_ID
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
    // InternalMyDsl.g:4986:1: rule__ReUsableRef__ReuseableAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ReUsableRef__ReuseableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4990:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:4991:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:4991:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:4992:3: ( RULE_ID )
            {
             before(grammarAccess.getReUsableRefAccess().getReuseableReUseAbleCrossReference_1_0()); 
            // InternalMyDsl.g:4993:3: ( RULE_ID )
            // InternalMyDsl.g:4994:4: RULE_ID
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
    // InternalMyDsl.g:5005:1: rule__Inertial__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Inertial__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5009:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:5010:2: ( RULE_ID )
            {
            // InternalMyDsl.g:5010:2: ( RULE_ID )
            // InternalMyDsl.g:5011:3: RULE_ID
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
    // InternalMyDsl.g:5020:1: rule__Inertial__InertiaAssignment_3 : ( ruleInertia ) ;
    public final void rule__Inertial__InertiaAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5024:1: ( ( ruleInertia ) )
            // InternalMyDsl.g:5025:2: ( ruleInertia )
            {
            // InternalMyDsl.g:5025:2: ( ruleInertia )
            // InternalMyDsl.g:5026:3: ruleInertia
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
    // InternalMyDsl.g:5035:1: rule__Inertial__MassAssignment_4 : ( ruleMass ) ;
    public final void rule__Inertial__MassAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5039:1: ( ( ruleMass ) )
            // InternalMyDsl.g:5040:2: ( ruleMass )
            {
            // InternalMyDsl.g:5040:2: ( ruleMass )
            // InternalMyDsl.g:5041:3: ruleMass
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
    // InternalMyDsl.g:5050:1: rule__Inertial__OriginAssignment_5 : ( ruleOrigin ) ;
    public final void rule__Inertial__OriginAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5054:1: ( ( ruleOrigin ) )
            // InternalMyDsl.g:5055:2: ( ruleOrigin )
            {
            // InternalMyDsl.g:5055:2: ( ruleOrigin )
            // InternalMyDsl.g:5056:3: ruleOrigin
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
    // InternalMyDsl.g:5065:1: rule__Inertia__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Inertia__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5069:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:5070:2: ( RULE_ID )
            {
            // InternalMyDsl.g:5070:2: ( RULE_ID )
            // InternalMyDsl.g:5071:3: RULE_ID
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
    // InternalMyDsl.g:5080:1: rule__Inertia__IxxAssignment_4 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__Inertia__IxxAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5084:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:5085:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:5085:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:5086:3: ruleURDFAttrSignedNumeric
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
    // InternalMyDsl.g:5095:1: rule__Inertia__IxyAssignment_6 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__Inertia__IxyAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5099:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:5100:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:5100:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:5101:3: ruleURDFAttrSignedNumeric
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
    // InternalMyDsl.g:5110:1: rule__Inertia__IxzAssignment_8 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__Inertia__IxzAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5114:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:5115:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:5115:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:5116:3: ruleURDFAttrSignedNumeric
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
    // InternalMyDsl.g:5125:1: rule__Inertia__IyyAssignment_10 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__Inertia__IyyAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5129:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:5130:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:5130:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:5131:3: ruleURDFAttrSignedNumeric
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
    // InternalMyDsl.g:5140:1: rule__Inertia__IyzAssignment_12 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__Inertia__IyzAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5144:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:5145:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:5145:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:5146:3: ruleURDFAttrSignedNumeric
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
    // InternalMyDsl.g:5155:1: rule__Inertia__IzzAssignment_14 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__Inertia__IzzAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5159:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:5160:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:5160:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:5161:3: ruleURDFAttrSignedNumeric
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
    // InternalMyDsl.g:5170:1: rule__Visual__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Visual__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5174:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:5175:2: ( RULE_ID )
            {
            // InternalMyDsl.g:5175:2: ( RULE_ID )
            // InternalMyDsl.g:5176:3: RULE_ID
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
    // InternalMyDsl.g:5185:1: rule__Visual__GeometryAssignment_4 : ( ruleGeometry ) ;
    public final void rule__Visual__GeometryAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5189:1: ( ( ruleGeometry ) )
            // InternalMyDsl.g:5190:2: ( ruleGeometry )
            {
            // InternalMyDsl.g:5190:2: ( ruleGeometry )
            // InternalMyDsl.g:5191:3: ruleGeometry
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
    // InternalMyDsl.g:5200:1: rule__Visual__OriginAssignment_5 : ( ruleOrigin ) ;
    public final void rule__Visual__OriginAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5204:1: ( ( ruleOrigin ) )
            // InternalMyDsl.g:5205:2: ( ruleOrigin )
            {
            // InternalMyDsl.g:5205:2: ( ruleOrigin )
            // InternalMyDsl.g:5206:3: ruleOrigin
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
    // InternalMyDsl.g:5215:1: rule__Visual__MaterialAssignment_6_1 : ( ruleMaterial ) ;
    public final void rule__Visual__MaterialAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5219:1: ( ( ruleMaterial ) )
            // InternalMyDsl.g:5220:2: ( ruleMaterial )
            {
            // InternalMyDsl.g:5220:2: ( ruleMaterial )
            // InternalMyDsl.g:5221:3: ruleMaterial
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
    // InternalMyDsl.g:5230:1: rule__Origin__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Origin__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5234:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:5235:2: ( RULE_ID )
            {
            // InternalMyDsl.g:5235:2: ( RULE_ID )
            // InternalMyDsl.g:5236:3: RULE_ID
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
    // InternalMyDsl.g:5245:1: rule__Origin__XAssignment_4 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__Origin__XAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5249:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:5250:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:5250:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:5251:3: ruleURDFAttrSignedNumeric
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
    // InternalMyDsl.g:5260:1: rule__Origin__YAssignment_6 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__Origin__YAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5264:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:5265:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:5265:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:5266:3: ruleURDFAttrSignedNumeric
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
    // InternalMyDsl.g:5275:1: rule__Origin__ZAssignment_8 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__Origin__ZAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5279:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:5280:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:5280:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:5281:3: ruleURDFAttrSignedNumeric
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
    // InternalMyDsl.g:5290:1: rule__Origin__RollAssignment_9_1 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__Origin__RollAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5294:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:5295:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:5295:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:5296:3: ruleURDFAttrSignedNumeric
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
    // InternalMyDsl.g:5305:1: rule__Origin__PitchAssignment_10_1 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__Origin__PitchAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5309:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:5310:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:5310:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:5311:3: ruleURDFAttrSignedNumeric
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
    // InternalMyDsl.g:5320:1: rule__Origin__YawAssignment_11_1 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__Origin__YawAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5324:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:5325:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:5325:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:5326:3: ruleURDFAttrSignedNumeric
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
    // InternalMyDsl.g:5335:1: rule__Mass__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Mass__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5339:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:5340:2: ( RULE_ID )
            {
            // InternalMyDsl.g:5340:2: ( RULE_ID )
            // InternalMyDsl.g:5341:3: RULE_ID
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
    // InternalMyDsl.g:5350:1: rule__Mass__MassKilogramAssignment_4 : ( ruleURDFAttrSignedNumeric ) ;
    public final void rule__Mass__MassKilogramAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5354:1: ( ( ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:5355:2: ( ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:5355:2: ( ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:5356:3: ruleURDFAttrSignedNumeric
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
    // InternalMyDsl.g:5365:1: rule__Collision__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Collision__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5369:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:5370:2: ( RULE_ID )
            {
            // InternalMyDsl.g:5370:2: ( RULE_ID )
            // InternalMyDsl.g:5371:3: RULE_ID
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
    // InternalMyDsl.g:5380:1: rule__Collision__GeometryAssignment_3 : ( ruleGeometry ) ;
    public final void rule__Collision__GeometryAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5384:1: ( ( ruleGeometry ) )
            // InternalMyDsl.g:5385:2: ( ruleGeometry )
            {
            // InternalMyDsl.g:5385:2: ( ruleGeometry )
            // InternalMyDsl.g:5386:3: ruleGeometry
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
    // InternalMyDsl.g:5395:1: rule__Collision__OriginAssignment_4 : ( ruleOrigin ) ;
    public final void rule__Collision__OriginAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5399:1: ( ( ruleOrigin ) )
            // InternalMyDsl.g:5400:2: ( ruleOrigin )
            {
            // InternalMyDsl.g:5400:2: ( ruleOrigin )
            // InternalMyDsl.g:5401:3: ruleOrigin
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
    // InternalMyDsl.g:5410:1: rule__Box__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Box__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5414:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:5415:2: ( RULE_ID )
            {
            // InternalMyDsl.g:5415:2: ( RULE_ID )
            // InternalMyDsl.g:5416:3: RULE_ID
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
    // InternalMyDsl.g:5425:1: rule__Box__HeightAssignment_3 : ( ruleURDFAttrNumeric ) ;
    public final void rule__Box__HeightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5429:1: ( ( ruleURDFAttrNumeric ) )
            // InternalMyDsl.g:5430:2: ( ruleURDFAttrNumeric )
            {
            // InternalMyDsl.g:5430:2: ( ruleURDFAttrNumeric )
            // InternalMyDsl.g:5431:3: ruleURDFAttrNumeric
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
    // InternalMyDsl.g:5440:1: rule__Box__LengthAssignment_5 : ( ruleURDFAttrNumeric ) ;
    public final void rule__Box__LengthAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5444:1: ( ( ruleURDFAttrNumeric ) )
            // InternalMyDsl.g:5445:2: ( ruleURDFAttrNumeric )
            {
            // InternalMyDsl.g:5445:2: ( ruleURDFAttrNumeric )
            // InternalMyDsl.g:5446:3: ruleURDFAttrNumeric
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
    // InternalMyDsl.g:5455:1: rule__Box__WidthAssignment_7 : ( ruleURDFAttrNumeric ) ;
    public final void rule__Box__WidthAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5459:1: ( ( ruleURDFAttrNumeric ) )
            // InternalMyDsl.g:5460:2: ( ruleURDFAttrNumeric )
            {
            // InternalMyDsl.g:5460:2: ( ruleURDFAttrNumeric )
            // InternalMyDsl.g:5461:3: ruleURDFAttrNumeric
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
    // InternalMyDsl.g:5470:1: rule__Cylinder__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Cylinder__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5474:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:5475:2: ( RULE_ID )
            {
            // InternalMyDsl.g:5475:2: ( RULE_ID )
            // InternalMyDsl.g:5476:3: RULE_ID
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
    // InternalMyDsl.g:5485:1: rule__Cylinder__RadiusAssignment_3 : ( ruleURDFAttrNumeric ) ;
    public final void rule__Cylinder__RadiusAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5489:1: ( ( ruleURDFAttrNumeric ) )
            // InternalMyDsl.g:5490:2: ( ruleURDFAttrNumeric )
            {
            // InternalMyDsl.g:5490:2: ( ruleURDFAttrNumeric )
            // InternalMyDsl.g:5491:3: ruleURDFAttrNumeric
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
    // InternalMyDsl.g:5500:1: rule__Cylinder__LengthAssignment_5 : ( ruleURDFAttrNumeric ) ;
    public final void rule__Cylinder__LengthAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5504:1: ( ( ruleURDFAttrNumeric ) )
            // InternalMyDsl.g:5505:2: ( ruleURDFAttrNumeric )
            {
            // InternalMyDsl.g:5505:2: ( ruleURDFAttrNumeric )
            // InternalMyDsl.g:5506:3: ruleURDFAttrNumeric
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
    // InternalMyDsl.g:5515:1: rule__Mesh__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Mesh__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5519:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:5520:2: ( RULE_ID )
            {
            // InternalMyDsl.g:5520:2: ( RULE_ID )
            // InternalMyDsl.g:5521:3: RULE_ID
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
    // InternalMyDsl.g:5530:1: rule__Mesh__PathToFileAssignment_3 : ( ruleURDFAttrSTRING ) ;
    public final void rule__Mesh__PathToFileAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5534:1: ( ( ruleURDFAttrSTRING ) )
            // InternalMyDsl.g:5535:2: ( ruleURDFAttrSTRING )
            {
            // InternalMyDsl.g:5535:2: ( ruleURDFAttrSTRING )
            // InternalMyDsl.g:5536:3: ruleURDFAttrSTRING
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
    // InternalMyDsl.g:5545:1: rule__Sphere__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Sphere__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5549:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:5550:2: ( RULE_ID )
            {
            // InternalMyDsl.g:5550:2: ( RULE_ID )
            // InternalMyDsl.g:5551:3: RULE_ID
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
    // InternalMyDsl.g:5560:1: rule__Sphere__RadiusAssignment_3 : ( ruleURDFAttrNumeric ) ;
    public final void rule__Sphere__RadiusAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5564:1: ( ( ruleURDFAttrNumeric ) )
            // InternalMyDsl.g:5565:2: ( ruleURDFAttrNumeric )
            {
            // InternalMyDsl.g:5565:2: ( ruleURDFAttrNumeric )
            // InternalMyDsl.g:5566:3: ruleURDFAttrNumeric
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
    // InternalMyDsl.g:5575:1: rule__Texture__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Texture__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5579:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:5580:2: ( RULE_ID )
            {
            // InternalMyDsl.g:5580:2: ( RULE_ID )
            // InternalMyDsl.g:5581:3: RULE_ID
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
    // InternalMyDsl.g:5590:1: rule__Texture__PathToFileAssignment_3 : ( ruleURDFAttrSTRING ) ;
    public final void rule__Texture__PathToFileAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5594:1: ( ( ruleURDFAttrSTRING ) )
            // InternalMyDsl.g:5595:2: ( ruleURDFAttrSTRING )
            {
            // InternalMyDsl.g:5595:2: ( ruleURDFAttrSTRING )
            // InternalMyDsl.g:5596:3: ruleURDFAttrSTRING
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
    // InternalMyDsl.g:5605:1: rule__Color__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Color__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5609:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:5610:2: ( RULE_ID )
            {
            // InternalMyDsl.g:5610:2: ( RULE_ID )
            // InternalMyDsl.g:5611:3: RULE_ID
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
    // InternalMyDsl.g:5620:1: rule__Color__RedAssignment_3 : ( ruleURDFAttrFloat ) ;
    public final void rule__Color__RedAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5624:1: ( ( ruleURDFAttrFloat ) )
            // InternalMyDsl.g:5625:2: ( ruleURDFAttrFloat )
            {
            // InternalMyDsl.g:5625:2: ( ruleURDFAttrFloat )
            // InternalMyDsl.g:5626:3: ruleURDFAttrFloat
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
    // InternalMyDsl.g:5635:1: rule__Color__GreenAssignment_5 : ( ruleURDFAttrFloat ) ;
    public final void rule__Color__GreenAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5639:1: ( ( ruleURDFAttrFloat ) )
            // InternalMyDsl.g:5640:2: ( ruleURDFAttrFloat )
            {
            // InternalMyDsl.g:5640:2: ( ruleURDFAttrFloat )
            // InternalMyDsl.g:5641:3: ruleURDFAttrFloat
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
    // InternalMyDsl.g:5650:1: rule__Color__BlueAssignment_7 : ( ruleURDFAttrFloat ) ;
    public final void rule__Color__BlueAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5654:1: ( ( ruleURDFAttrFloat ) )
            // InternalMyDsl.g:5655:2: ( ruleURDFAttrFloat )
            {
            // InternalMyDsl.g:5655:2: ( ruleURDFAttrFloat )
            // InternalMyDsl.g:5656:3: ruleURDFAttrFloat
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
    // InternalMyDsl.g:5665:1: rule__Color__AlphaAssignment_9 : ( ruleURDFAttrFloat ) ;
    public final void rule__Color__AlphaAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5669:1: ( ( ruleURDFAttrFloat ) )
            // InternalMyDsl.g:5670:2: ( ruleURDFAttrFloat )
            {
            // InternalMyDsl.g:5670:2: ( ruleURDFAttrFloat )
            // InternalMyDsl.g:5671:3: ruleURDFAttrFloat
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
    // InternalMyDsl.g:5680:1: rule__Joint__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Joint__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5684:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:5685:2: ( RULE_ID )
            {
            // InternalMyDsl.g:5685:2: ( RULE_ID )
            // InternalMyDsl.g:5686:3: RULE_ID
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


    // $ANTLR start "rule__Joint__ChildOfAssignment_3"
    // InternalMyDsl.g:5695:1: rule__Joint__ChildOfAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Joint__ChildOfAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5699:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:5700:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:5700:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:5701:3: ( RULE_ID )
            {
             before(grammarAccess.getJointAccess().getChildOfLinkCrossReference_3_0()); 
            // InternalMyDsl.g:5702:3: ( RULE_ID )
            // InternalMyDsl.g:5703:4: RULE_ID
            {
             before(grammarAccess.getJointAccess().getChildOfLinkIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getChildOfLinkIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getJointAccess().getChildOfLinkCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__ChildOfAssignment_3"


    // $ANTLR start "rule__Joint__ParentOfAssignment_5"
    // InternalMyDsl.g:5714:1: rule__Joint__ParentOfAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Joint__ParentOfAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5718:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:5719:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:5719:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:5720:3: ( RULE_ID )
            {
             before(grammarAccess.getJointAccess().getParentOfLinkCrossReference_5_0()); 
            // InternalMyDsl.g:5721:3: ( RULE_ID )
            // InternalMyDsl.g:5722:4: RULE_ID
            {
             before(grammarAccess.getJointAccess().getParentOfLinkIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getParentOfLinkIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getJointAccess().getParentOfLinkCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__ParentOfAssignment_5"


    // $ANTLR start "rule__Joint__TypeAssignment_7"
    // InternalMyDsl.g:5733:1: rule__Joint__TypeAssignment_7 : ( ruleJointType ) ;
    public final void rule__Joint__TypeAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5737:1: ( ( ruleJointType ) )
            // InternalMyDsl.g:5738:2: ( ruleJointType )
            {
            // InternalMyDsl.g:5738:2: ( ruleJointType )
            // InternalMyDsl.g:5739:3: ruleJointType
            {
             before(grammarAccess.getJointAccess().getTypeJointTypeEnumRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleJointType();

            state._fsp--;

             after(grammarAccess.getJointAccess().getTypeJointTypeEnumRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__TypeAssignment_7"


    // $ANTLR start "rule__Joint__IsReuseOfAssignment_8_1"
    // InternalMyDsl.g:5748:1: rule__Joint__IsReuseOfAssignment_8_1 : ( ( RULE_ID ) ) ;
    public final void rule__Joint__IsReuseOfAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5752:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:5753:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:5753:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:5754:3: ( RULE_ID )
            {
             before(grammarAccess.getJointAccess().getIsReuseOfJointCrossReference_8_1_0()); 
            // InternalMyDsl.g:5755:3: ( RULE_ID )
            // InternalMyDsl.g:5756:4: RULE_ID
            {
             before(grammarAccess.getJointAccess().getIsReuseOfJointIDTerminalRuleCall_8_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getIsReuseOfJointIDTerminalRuleCall_8_1_0_1()); 

            }

             after(grammarAccess.getJointAccess().getIsReuseOfJointCrossReference_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__IsReuseOfAssignment_8_1"


    // $ANTLR start "rule__URDFAttrSignedNumeric__ValueAssignment"
    // InternalMyDsl.g:5767:1: rule__URDFAttrSignedNumeric__ValueAssignment : ( ruleSIGNED_NUMERIC ) ;
    public final void rule__URDFAttrSignedNumeric__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5771:1: ( ( ruleSIGNED_NUMERIC ) )
            // InternalMyDsl.g:5772:2: ( ruleSIGNED_NUMERIC )
            {
            // InternalMyDsl.g:5772:2: ( ruleSIGNED_NUMERIC )
            // InternalMyDsl.g:5773:3: ruleSIGNED_NUMERIC
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
    // InternalMyDsl.g:5782:1: rule__URDFAttrFloat__ValueAssignment : ( ruleFLOAT ) ;
    public final void rule__URDFAttrFloat__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5786:1: ( ( ruleFLOAT ) )
            // InternalMyDsl.g:5787:2: ( ruleFLOAT )
            {
            // InternalMyDsl.g:5787:2: ( ruleFLOAT )
            // InternalMyDsl.g:5788:3: ruleFLOAT
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


    // $ANTLR start "rule__URDFAttrNumeric__ValueAssignment"
    // InternalMyDsl.g:5797:1: rule__URDFAttrNumeric__ValueAssignment : ( ruleNUMERIC ) ;
    public final void rule__URDFAttrNumeric__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5801:1: ( ( ruleNUMERIC ) )
            // InternalMyDsl.g:5802:2: ( ruleNUMERIC )
            {
            // InternalMyDsl.g:5802:2: ( ruleNUMERIC )
            // InternalMyDsl.g:5803:3: ruleNUMERIC
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
    // InternalMyDsl.g:5812:1: rule__URDFAttrSTRING__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__URDFAttrSTRING__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5816:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:5817:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:5817:2: ( RULE_STRING )
            // InternalMyDsl.g:5818:3: RULE_STRING
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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0200000000008000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0200000000008002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000020020200000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000020020200002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000020020208000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040000020L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0005440180000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0005440000000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0018000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000200000020L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000007000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000010000000020L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0005440100000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000080000000020L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000800000000020L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0002000000000020L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0020000000000020L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000003010L});

}