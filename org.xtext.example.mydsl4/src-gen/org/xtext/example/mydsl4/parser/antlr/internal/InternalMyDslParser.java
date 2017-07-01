package org.xtext.example.mydsl4.parser.antlr.internal;

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
import org.xtext.example.mydsl4.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Robot'", "'Link'", "'def'", "'reuse'", "'edit'", "'add'", "'.'", "'Inertial'", "'Inertia'", "'ixx'", "'ixy'", "'ixz'", "'iyy'", "'iyz'", "'izz'", "'Visual'", "'Geometry'", "'Material'", "'Origin'", "'x'", "'y'", "'z'", "'roll'", "'pitch'", "'yaw'", "'Mass'", "'massKilogram'", "'Collision'", "'Box'", "'height'", "'length'", "'width'", "'Cylinder'", "'radius'", "'Mesh'", "'pathToFile'", "'Sphere'", "'Texture'", "'Color'", "'red'", "'green'", "'blue'", "'alpha'", "'Joint'", "'ChildOf'", "'ParentOf'", "'Type'", "'Axis'", "'Limit'", "'effort'", "'velocity'", "'lower'", "'upper'", "'Calibration'", "'rising'", "'falling'", "'Dynamics'", "'friction'", "'damping'", "'SafetyController'", "'k_velocity'", "'k_position'", "'softLowerLimit'", "'softUpperLimit'", "'e'", "'+'", "'-'", "'fixed'", "'revolute'", "'prismatic'", "'continuous'"
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
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
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

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Robot";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRobot"
    // InternalMyDsl.g:65:1: entryRuleRobot returns [EObject current=null] : iv_ruleRobot= ruleRobot EOF ;
    public final EObject entryRuleRobot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRobot = null;


        try {
            // InternalMyDsl.g:65:46: (iv_ruleRobot= ruleRobot EOF )
            // InternalMyDsl.g:66:2: iv_ruleRobot= ruleRobot EOF
            {
             newCompositeNode(grammarAccess.getRobotRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRobot=ruleRobot();

            state._fsp--;

             current =iv_ruleRobot; 
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
    // $ANTLR end "entryRuleRobot"


    // $ANTLR start "ruleRobot"
    // InternalMyDsl.g:72:1: ruleRobot returns [EObject current=null] : (otherlv_0= 'Robot' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_links_2_0= ruleLink ) ) | ( (lv_joint_3_0= ruleJoint ) ) )* ) ;
    public final EObject ruleRobot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_links_2_0 = null;

        EObject lv_joint_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:78:2: ( (otherlv_0= 'Robot' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_links_2_0= ruleLink ) ) | ( (lv_joint_3_0= ruleJoint ) ) )* ) )
            // InternalMyDsl.g:79:2: (otherlv_0= 'Robot' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_links_2_0= ruleLink ) ) | ( (lv_joint_3_0= ruleJoint ) ) )* )
            {
            // InternalMyDsl.g:79:2: (otherlv_0= 'Robot' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_links_2_0= ruleLink ) ) | ( (lv_joint_3_0= ruleJoint ) ) )* )
            // InternalMyDsl.g:80:3: otherlv_0= 'Robot' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_links_2_0= ruleLink ) ) | ( (lv_joint_3_0= ruleJoint ) ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRobotAccess().getRobotKeyword_0());
            		
            // InternalMyDsl.g:84:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:85:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:85:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:86:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRobotAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRobotRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMyDsl.g:102:3: ( ( (lv_links_2_0= ruleLink ) ) | ( (lv_joint_3_0= ruleJoint ) ) )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }
                else if ( (LA1_0==54) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:103:4: ( (lv_links_2_0= ruleLink ) )
            	    {
            	    // InternalMyDsl.g:103:4: ( (lv_links_2_0= ruleLink ) )
            	    // InternalMyDsl.g:104:5: (lv_links_2_0= ruleLink )
            	    {
            	    // InternalMyDsl.g:104:5: (lv_links_2_0= ruleLink )
            	    // InternalMyDsl.g:105:6: lv_links_2_0= ruleLink
            	    {

            	    						newCompositeNode(grammarAccess.getRobotAccess().getLinksLinkParserRuleCall_2_0_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_links_2_0=ruleLink();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRobotRule());
            	    						}
            	    						add(
            	    							current,
            	    							"links",
            	    							lv_links_2_0,
            	    							"org.xtext.example.mydsl4.MyDsl.Link");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMyDsl.g:123:4: ( (lv_joint_3_0= ruleJoint ) )
            	    {
            	    // InternalMyDsl.g:123:4: ( (lv_joint_3_0= ruleJoint ) )
            	    // InternalMyDsl.g:124:5: (lv_joint_3_0= ruleJoint )
            	    {
            	    // InternalMyDsl.g:124:5: (lv_joint_3_0= ruleJoint )
            	    // InternalMyDsl.g:125:6: lv_joint_3_0= ruleJoint
            	    {

            	    						newCompositeNode(grammarAccess.getRobotAccess().getJointJointParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_joint_3_0=ruleJoint();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRobotRule());
            	    						}
            	    						add(
            	    							current,
            	    							"joint",
            	    							lv_joint_3_0,
            	    							"org.xtext.example.mydsl4.MyDsl.Joint");
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
    // $ANTLR end "ruleRobot"


    // $ANTLR start "entryRuleReUseAble"
    // InternalMyDsl.g:147:1: entryRuleReUseAble returns [EObject current=null] : iv_ruleReUseAble= ruleReUseAble EOF ;
    public final EObject entryRuleReUseAble() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReUseAble = null;


        try {
            // InternalMyDsl.g:147:50: (iv_ruleReUseAble= ruleReUseAble EOF )
            // InternalMyDsl.g:148:2: iv_ruleReUseAble= ruleReUseAble EOF
            {
             newCompositeNode(grammarAccess.getReUseAbleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReUseAble=ruleReUseAble();

            state._fsp--;

             current =iv_ruleReUseAble; 
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
    // $ANTLR end "entryRuleReUseAble"


    // $ANTLR start "ruleReUseAble"
    // InternalMyDsl.g:154:1: ruleReUseAble returns [EObject current=null] : (this_Link_0= ruleLink | this_Visual_1= ruleVisual | this_Inertial_2= ruleInertial | this_Collision_3= ruleCollision ) ;
    public final EObject ruleReUseAble() throws RecognitionException {
        EObject current = null;

        EObject this_Link_0 = null;

        EObject this_Visual_1 = null;

        EObject this_Inertial_2 = null;

        EObject this_Collision_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:160:2: ( (this_Link_0= ruleLink | this_Visual_1= ruleVisual | this_Inertial_2= ruleInertial | this_Collision_3= ruleCollision ) )
            // InternalMyDsl.g:161:2: (this_Link_0= ruleLink | this_Visual_1= ruleVisual | this_Inertial_2= ruleInertial | this_Collision_3= ruleCollision )
            {
            // InternalMyDsl.g:161:2: (this_Link_0= ruleLink | this_Visual_1= ruleVisual | this_Inertial_2= ruleInertial | this_Collision_3= ruleCollision )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt2=1;
                }
                break;
            case 26:
                {
                alt2=2;
                }
                break;
            case 18:
                {
                alt2=3;
                }
                break;
            case 38:
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
                    // InternalMyDsl.g:162:3: this_Link_0= ruleLink
                    {

                    			newCompositeNode(grammarAccess.getReUseAbleAccess().getLinkParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Link_0=ruleLink();

                    state._fsp--;


                    			current = this_Link_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:171:3: this_Visual_1= ruleVisual
                    {

                    			newCompositeNode(grammarAccess.getReUseAbleAccess().getVisualParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Visual_1=ruleVisual();

                    state._fsp--;


                    			current = this_Visual_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:180:3: this_Inertial_2= ruleInertial
                    {

                    			newCompositeNode(grammarAccess.getReUseAbleAccess().getInertialParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Inertial_2=ruleInertial();

                    state._fsp--;


                    			current = this_Inertial_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:189:3: this_Collision_3= ruleCollision
                    {

                    			newCompositeNode(grammarAccess.getReUseAbleAccess().getCollisionParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Collision_3=ruleCollision();

                    state._fsp--;


                    			current = this_Collision_3;
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
    // $ANTLR end "ruleReUseAble"


    // $ANTLR start "entryRuleLink"
    // InternalMyDsl.g:201:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // InternalMyDsl.g:201:45: (iv_ruleLink= ruleLink EOF )
            // InternalMyDsl.g:202:2: iv_ruleLink= ruleLink EOF
            {
             newCompositeNode(grammarAccess.getLinkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLink=ruleLink();

            state._fsp--;

             current =iv_ruleLink; 
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
    // $ANTLR end "entryRuleLink"


    // $ANTLR start "ruleLink"
    // InternalMyDsl.g:208:1: ruleLink returns [EObject current=null] : ( () otherlv_1= 'Link' ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= 'def' ( ( (lv_inertial_4_0= ruleInertial ) ) | ( (lv_visual_5_0= ruleVisual ) ) | ( (lv_collision_6_0= ruleCollision ) ) )* ) | (otherlv_7= 'reuse' ( (otherlv_8= RULE_ID ) ) ( (lv_reuse_9_0= ruleReuse ) ) ) )? ) ;
    public final EObject ruleLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_inertial_4_0 = null;

        EObject lv_visual_5_0 = null;

        EObject lv_collision_6_0 = null;

        EObject lv_reuse_9_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:214:2: ( ( () otherlv_1= 'Link' ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= 'def' ( ( (lv_inertial_4_0= ruleInertial ) ) | ( (lv_visual_5_0= ruleVisual ) ) | ( (lv_collision_6_0= ruleCollision ) ) )* ) | (otherlv_7= 'reuse' ( (otherlv_8= RULE_ID ) ) ( (lv_reuse_9_0= ruleReuse ) ) ) )? ) )
            // InternalMyDsl.g:215:2: ( () otherlv_1= 'Link' ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= 'def' ( ( (lv_inertial_4_0= ruleInertial ) ) | ( (lv_visual_5_0= ruleVisual ) ) | ( (lv_collision_6_0= ruleCollision ) ) )* ) | (otherlv_7= 'reuse' ( (otherlv_8= RULE_ID ) ) ( (lv_reuse_9_0= ruleReuse ) ) ) )? )
            {
            // InternalMyDsl.g:215:2: ( () otherlv_1= 'Link' ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= 'def' ( ( (lv_inertial_4_0= ruleInertial ) ) | ( (lv_visual_5_0= ruleVisual ) ) | ( (lv_collision_6_0= ruleCollision ) ) )* ) | (otherlv_7= 'reuse' ( (otherlv_8= RULE_ID ) ) ( (lv_reuse_9_0= ruleReuse ) ) ) )? )
            // InternalMyDsl.g:216:3: () otherlv_1= 'Link' ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= 'def' ( ( (lv_inertial_4_0= ruleInertial ) ) | ( (lv_visual_5_0= ruleVisual ) ) | ( (lv_collision_6_0= ruleCollision ) ) )* ) | (otherlv_7= 'reuse' ( (otherlv_8= RULE_ID ) ) ( (lv_reuse_9_0= ruleReuse ) ) ) )?
            {
            // InternalMyDsl.g:216:3: ()
            // InternalMyDsl.g:217:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLinkAccess().getLinkAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getLinkAccess().getLinkKeyword_1());
            		
            // InternalMyDsl.g:227:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalMyDsl.g:228:4: (lv_name_2_0= RULE_ID )
            {
            // InternalMyDsl.g:228:4: (lv_name_2_0= RULE_ID )
            // InternalMyDsl.g:229:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_2_0, grammarAccess.getLinkAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLinkRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMyDsl.g:245:3: ( (otherlv_3= 'def' ( ( (lv_inertial_4_0= ruleInertial ) ) | ( (lv_visual_5_0= ruleVisual ) ) | ( (lv_collision_6_0= ruleCollision ) ) )* ) | (otherlv_7= 'reuse' ( (otherlv_8= RULE_ID ) ) ( (lv_reuse_9_0= ruleReuse ) ) ) )?
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            else if ( (LA4_0==14) ) {
                alt4=2;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:246:4: (otherlv_3= 'def' ( ( (lv_inertial_4_0= ruleInertial ) ) | ( (lv_visual_5_0= ruleVisual ) ) | ( (lv_collision_6_0= ruleCollision ) ) )* )
                    {
                    // InternalMyDsl.g:246:4: (otherlv_3= 'def' ( ( (lv_inertial_4_0= ruleInertial ) ) | ( (lv_visual_5_0= ruleVisual ) ) | ( (lv_collision_6_0= ruleCollision ) ) )* )
                    // InternalMyDsl.g:247:5: otherlv_3= 'def' ( ( (lv_inertial_4_0= ruleInertial ) ) | ( (lv_visual_5_0= ruleVisual ) ) | ( (lv_collision_6_0= ruleCollision ) ) )*
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_6); 

                    					newLeafNode(otherlv_3, grammarAccess.getLinkAccess().getDefKeyword_3_0_0());
                    				
                    // InternalMyDsl.g:251:5: ( ( (lv_inertial_4_0= ruleInertial ) ) | ( (lv_visual_5_0= ruleVisual ) ) | ( (lv_collision_6_0= ruleCollision ) ) )*
                    loop3:
                    do {
                        int alt3=4;
                        switch ( input.LA(1) ) {
                        case 18:
                            {
                            alt3=1;
                            }
                            break;
                        case 26:
                            {
                            alt3=2;
                            }
                            break;
                        case 38:
                            {
                            alt3=3;
                            }
                            break;

                        }

                        switch (alt3) {
                    	case 1 :
                    	    // InternalMyDsl.g:252:6: ( (lv_inertial_4_0= ruleInertial ) )
                    	    {
                    	    // InternalMyDsl.g:252:6: ( (lv_inertial_4_0= ruleInertial ) )
                    	    // InternalMyDsl.g:253:7: (lv_inertial_4_0= ruleInertial )
                    	    {
                    	    // InternalMyDsl.g:253:7: (lv_inertial_4_0= ruleInertial )
                    	    // InternalMyDsl.g:254:8: lv_inertial_4_0= ruleInertial
                    	    {

                    	    								newCompositeNode(grammarAccess.getLinkAccess().getInertialInertialParserRuleCall_3_0_1_0_0());
                    	    							
                    	    pushFollow(FOLLOW_6);
                    	    lv_inertial_4_0=ruleInertial();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getLinkRule());
                    	    								}
                    	    								set(
                    	    									current,
                    	    									"inertial",
                    	    									lv_inertial_4_0,
                    	    									"org.xtext.example.mydsl4.MyDsl.Inertial");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDsl.g:272:6: ( (lv_visual_5_0= ruleVisual ) )
                    	    {
                    	    // InternalMyDsl.g:272:6: ( (lv_visual_5_0= ruleVisual ) )
                    	    // InternalMyDsl.g:273:7: (lv_visual_5_0= ruleVisual )
                    	    {
                    	    // InternalMyDsl.g:273:7: (lv_visual_5_0= ruleVisual )
                    	    // InternalMyDsl.g:274:8: lv_visual_5_0= ruleVisual
                    	    {

                    	    								newCompositeNode(grammarAccess.getLinkAccess().getVisualVisualParserRuleCall_3_0_1_1_0());
                    	    							
                    	    pushFollow(FOLLOW_6);
                    	    lv_visual_5_0=ruleVisual();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getLinkRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"visual",
                    	    									lv_visual_5_0,
                    	    									"org.xtext.example.mydsl4.MyDsl.Visual");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 3 :
                    	    // InternalMyDsl.g:292:6: ( (lv_collision_6_0= ruleCollision ) )
                    	    {
                    	    // InternalMyDsl.g:292:6: ( (lv_collision_6_0= ruleCollision ) )
                    	    // InternalMyDsl.g:293:7: (lv_collision_6_0= ruleCollision )
                    	    {
                    	    // InternalMyDsl.g:293:7: (lv_collision_6_0= ruleCollision )
                    	    // InternalMyDsl.g:294:8: lv_collision_6_0= ruleCollision
                    	    {

                    	    								newCompositeNode(grammarAccess.getLinkAccess().getCollisionCollisionParserRuleCall_3_0_1_2_0());
                    	    							
                    	    pushFollow(FOLLOW_6);
                    	    lv_collision_6_0=ruleCollision();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getLinkRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"collision",
                    	    									lv_collision_6_0,
                    	    									"org.xtext.example.mydsl4.MyDsl.Collision");
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
                    break;
                case 2 :
                    // InternalMyDsl.g:314:4: (otherlv_7= 'reuse' ( (otherlv_8= RULE_ID ) ) ( (lv_reuse_9_0= ruleReuse ) ) )
                    {
                    // InternalMyDsl.g:314:4: (otherlv_7= 'reuse' ( (otherlv_8= RULE_ID ) ) ( (lv_reuse_9_0= ruleReuse ) ) )
                    // InternalMyDsl.g:315:5: otherlv_7= 'reuse' ( (otherlv_8= RULE_ID ) ) ( (lv_reuse_9_0= ruleReuse ) )
                    {
                    otherlv_7=(Token)match(input,14,FOLLOW_3); 

                    					newLeafNode(otherlv_7, grammarAccess.getLinkAccess().getReuseKeyword_3_1_0());
                    				
                    // InternalMyDsl.g:319:5: ( (otherlv_8= RULE_ID ) )
                    // InternalMyDsl.g:320:6: (otherlv_8= RULE_ID )
                    {
                    // InternalMyDsl.g:320:6: (otherlv_8= RULE_ID )
                    // InternalMyDsl.g:321:7: otherlv_8= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getLinkRule());
                    							}
                    						
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_7); 

                    							newLeafNode(otherlv_8, grammarAccess.getLinkAccess().getLinkLinkCrossReference_3_1_1_0());
                    						

                    }


                    }

                    // InternalMyDsl.g:332:5: ( (lv_reuse_9_0= ruleReuse ) )
                    // InternalMyDsl.g:333:6: (lv_reuse_9_0= ruleReuse )
                    {
                    // InternalMyDsl.g:333:6: (lv_reuse_9_0= ruleReuse )
                    // InternalMyDsl.g:334:7: lv_reuse_9_0= ruleReuse
                    {

                    							newCompositeNode(grammarAccess.getLinkAccess().getReuseReuseParserRuleCall_3_1_2_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_reuse_9_0=ruleReuse();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getLinkRule());
                    							}
                    							set(
                    								current,
                    								"reuse",
                    								lv_reuse_9_0,
                    								"org.xtext.example.mydsl4.MyDsl.Reuse");
                    							afterParserOrEnumRuleCall();
                    						

                    }


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
    // $ANTLR end "ruleLink"


    // $ANTLR start "entryRuleReuse"
    // InternalMyDsl.g:357:1: entryRuleReuse returns [EObject current=null] : iv_ruleReuse= ruleReuse EOF ;
    public final EObject entryRuleReuse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReuse = null;


        try {
            // InternalMyDsl.g:357:46: (iv_ruleReuse= ruleReuse EOF )
            // InternalMyDsl.g:358:2: iv_ruleReuse= ruleReuse EOF
            {
             newCompositeNode(grammarAccess.getReuseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReuse=ruleReuse();

            state._fsp--;

             current =iv_ruleReuse; 
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
    // $ANTLR end "entryRuleReuse"


    // $ANTLR start "ruleReuse"
    // InternalMyDsl.g:364:1: ruleReuse returns [EObject current=null] : ( () ( (otherlv_1= 'edit' ( (lv_ref_2_0= ruleDotExpression ) ) ) | (otherlv_3= 'add' ( (lv_add_4_0= ruleReUseAble ) ) ) )? ) ;
    public final EObject ruleReuse() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_ref_2_0 = null;

        EObject lv_add_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:370:2: ( ( () ( (otherlv_1= 'edit' ( (lv_ref_2_0= ruleDotExpression ) ) ) | (otherlv_3= 'add' ( (lv_add_4_0= ruleReUseAble ) ) ) )? ) )
            // InternalMyDsl.g:371:2: ( () ( (otherlv_1= 'edit' ( (lv_ref_2_0= ruleDotExpression ) ) ) | (otherlv_3= 'add' ( (lv_add_4_0= ruleReUseAble ) ) ) )? )
            {
            // InternalMyDsl.g:371:2: ( () ( (otherlv_1= 'edit' ( (lv_ref_2_0= ruleDotExpression ) ) ) | (otherlv_3= 'add' ( (lv_add_4_0= ruleReUseAble ) ) ) )? )
            // InternalMyDsl.g:372:3: () ( (otherlv_1= 'edit' ( (lv_ref_2_0= ruleDotExpression ) ) ) | (otherlv_3= 'add' ( (lv_add_4_0= ruleReUseAble ) ) ) )?
            {
            // InternalMyDsl.g:372:3: ()
            // InternalMyDsl.g:373:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getReuseAccess().getReuseAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:379:3: ( (otherlv_1= 'edit' ( (lv_ref_2_0= ruleDotExpression ) ) ) | (otherlv_3= 'add' ( (lv_add_4_0= ruleReUseAble ) ) ) )?
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            else if ( (LA5_0==16) ) {
                alt5=2;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:380:4: (otherlv_1= 'edit' ( (lv_ref_2_0= ruleDotExpression ) ) )
                    {
                    // InternalMyDsl.g:380:4: (otherlv_1= 'edit' ( (lv_ref_2_0= ruleDotExpression ) ) )
                    // InternalMyDsl.g:381:5: otherlv_1= 'edit' ( (lv_ref_2_0= ruleDotExpression ) )
                    {
                    otherlv_1=(Token)match(input,15,FOLLOW_3); 

                    					newLeafNode(otherlv_1, grammarAccess.getReuseAccess().getEditKeyword_1_0_0());
                    				
                    // InternalMyDsl.g:385:5: ( (lv_ref_2_0= ruleDotExpression ) )
                    // InternalMyDsl.g:386:6: (lv_ref_2_0= ruleDotExpression )
                    {
                    // InternalMyDsl.g:386:6: (lv_ref_2_0= ruleDotExpression )
                    // InternalMyDsl.g:387:7: lv_ref_2_0= ruleDotExpression
                    {

                    							newCompositeNode(grammarAccess.getReuseAccess().getRefDotExpressionParserRuleCall_1_0_1_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_ref_2_0=ruleDotExpression();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getReuseRule());
                    							}
                    							set(
                    								current,
                    								"ref",
                    								lv_ref_2_0,
                    								"org.xtext.example.mydsl4.MyDsl.DotExpression");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:406:4: (otherlv_3= 'add' ( (lv_add_4_0= ruleReUseAble ) ) )
                    {
                    // InternalMyDsl.g:406:4: (otherlv_3= 'add' ( (lv_add_4_0= ruleReUseAble ) ) )
                    // InternalMyDsl.g:407:5: otherlv_3= 'add' ( (lv_add_4_0= ruleReUseAble ) )
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_8); 

                    					newLeafNode(otherlv_3, grammarAccess.getReuseAccess().getAddKeyword_1_1_0());
                    				
                    // InternalMyDsl.g:411:5: ( (lv_add_4_0= ruleReUseAble ) )
                    // InternalMyDsl.g:412:6: (lv_add_4_0= ruleReUseAble )
                    {
                    // InternalMyDsl.g:412:6: (lv_add_4_0= ruleReUseAble )
                    // InternalMyDsl.g:413:7: lv_add_4_0= ruleReUseAble
                    {

                    							newCompositeNode(grammarAccess.getReuseAccess().getAddReUseAbleParserRuleCall_1_1_1_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_add_4_0=ruleReUseAble();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getReuseRule());
                    							}
                    							set(
                    								current,
                    								"add",
                    								lv_add_4_0,
                    								"org.xtext.example.mydsl4.MyDsl.ReUseAble");
                    							afterParserOrEnumRuleCall();
                    						

                    }


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
    // $ANTLR end "ruleReuse"


    // $ANTLR start "entryRuleDotExpression"
    // InternalMyDsl.g:436:1: entryRuleDotExpression returns [EObject current=null] : iv_ruleDotExpression= ruleDotExpression EOF ;
    public final EObject entryRuleDotExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDotExpression = null;


        try {
            // InternalMyDsl.g:436:54: (iv_ruleDotExpression= ruleDotExpression EOF )
            // InternalMyDsl.g:437:2: iv_ruleDotExpression= ruleDotExpression EOF
            {
             newCompositeNode(grammarAccess.getDotExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDotExpression=ruleDotExpression();

            state._fsp--;

             current =iv_ruleDotExpression; 
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
    // $ANTLR end "entryRuleDotExpression"


    // $ANTLR start "ruleDotExpression"
    // InternalMyDsl.g:443:1: ruleDotExpression returns [EObject current=null] : (this_ReUsableRef_0= ruleReUsableRef ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )* ) ;
    public final EObject ruleDotExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_ReUsableRef_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:449:2: ( (this_ReUsableRef_0= ruleReUsableRef ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )* ) )
            // InternalMyDsl.g:450:2: (this_ReUsableRef_0= ruleReUsableRef ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )* )
            {
            // InternalMyDsl.g:450:2: (this_ReUsableRef_0= ruleReUsableRef ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )* )
            // InternalMyDsl.g:451:3: this_ReUsableRef_0= ruleReUsableRef ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )*
            {

            			newCompositeNode(grammarAccess.getDotExpressionAccess().getReUsableRefParserRuleCall_0());
            		
            pushFollow(FOLLOW_9);
            this_ReUsableRef_0=ruleReUsableRef();

            state._fsp--;


            			current = this_ReUsableRef_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMyDsl.g:459:3: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==17) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:460:4: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) )
            	    {
            	    // InternalMyDsl.g:460:4: ()
            	    // InternalMyDsl.g:461:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getDotExpressionAccess().getDotExpressionRefAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,17,FOLLOW_3); 

            	    				newLeafNode(otherlv_2, grammarAccess.getDotExpressionAccess().getFullStopKeyword_1_1());
            	    			
            	    // InternalMyDsl.g:471:4: ( (otherlv_3= RULE_ID ) )
            	    // InternalMyDsl.g:472:5: (otherlv_3= RULE_ID )
            	    {
            	    // InternalMyDsl.g:472:5: (otherlv_3= RULE_ID )
            	    // InternalMyDsl.g:473:6: otherlv_3= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getDotExpressionRule());
            	    						}
            	    					
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_9); 

            	    						newLeafNode(otherlv_3, grammarAccess.getDotExpressionAccess().getTailReUseAbleCrossReference_1_2_0());
            	    					

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
    // $ANTLR end "ruleDotExpression"


    // $ANTLR start "entryRuleReUsableRef"
    // InternalMyDsl.g:489:1: entryRuleReUsableRef returns [EObject current=null] : iv_ruleReUsableRef= ruleReUsableRef EOF ;
    public final EObject entryRuleReUsableRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReUsableRef = null;


        try {
            // InternalMyDsl.g:489:52: (iv_ruleReUsableRef= ruleReUsableRef EOF )
            // InternalMyDsl.g:490:2: iv_ruleReUsableRef= ruleReUsableRef EOF
            {
             newCompositeNode(grammarAccess.getReUsableRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReUsableRef=ruleReUsableRef();

            state._fsp--;

             current =iv_ruleReUsableRef; 
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
    // $ANTLR end "entryRuleReUsableRef"


    // $ANTLR start "ruleReUsableRef"
    // InternalMyDsl.g:496:1: ruleReUsableRef returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleReUsableRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:502:2: ( ( () ( (otherlv_1= RULE_ID ) ) ) )
            // InternalMyDsl.g:503:2: ( () ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalMyDsl.g:503:2: ( () ( (otherlv_1= RULE_ID ) ) )
            // InternalMyDsl.g:504:3: () ( (otherlv_1= RULE_ID ) )
            {
            // InternalMyDsl.g:504:3: ()
            // InternalMyDsl.g:505:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getReUsableRefAccess().getReUsableRefAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:511:3: ( (otherlv_1= RULE_ID ) )
            // InternalMyDsl.g:512:4: (otherlv_1= RULE_ID )
            {
            // InternalMyDsl.g:512:4: (otherlv_1= RULE_ID )
            // InternalMyDsl.g:513:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReUsableRefRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getReUsableRefAccess().getReuseableReUseAbleCrossReference_1_0());
            				

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
    // $ANTLR end "ruleReUsableRef"


    // $ANTLR start "entryRuleInertial"
    // InternalMyDsl.g:528:1: entryRuleInertial returns [EObject current=null] : iv_ruleInertial= ruleInertial EOF ;
    public final EObject entryRuleInertial() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInertial = null;


        try {
            // InternalMyDsl.g:528:49: (iv_ruleInertial= ruleInertial EOF )
            // InternalMyDsl.g:529:2: iv_ruleInertial= ruleInertial EOF
            {
             newCompositeNode(grammarAccess.getInertialRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInertial=ruleInertial();

            state._fsp--;

             current =iv_ruleInertial; 
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
    // $ANTLR end "entryRuleInertial"


    // $ANTLR start "ruleInertial"
    // InternalMyDsl.g:535:1: ruleInertial returns [EObject current=null] : ( () otherlv_1= 'Inertial' ( (lv_name_2_0= RULE_ID ) )? ( (lv_inertia_3_0= ruleInertia ) ) ( (lv_mass_4_0= ruleMass ) ) ( (lv_origin_5_0= ruleOrigin ) )? ) ;
    public final EObject ruleInertial() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        EObject lv_inertia_3_0 = null;

        EObject lv_mass_4_0 = null;

        EObject lv_origin_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:541:2: ( ( () otherlv_1= 'Inertial' ( (lv_name_2_0= RULE_ID ) )? ( (lv_inertia_3_0= ruleInertia ) ) ( (lv_mass_4_0= ruleMass ) ) ( (lv_origin_5_0= ruleOrigin ) )? ) )
            // InternalMyDsl.g:542:2: ( () otherlv_1= 'Inertial' ( (lv_name_2_0= RULE_ID ) )? ( (lv_inertia_3_0= ruleInertia ) ) ( (lv_mass_4_0= ruleMass ) ) ( (lv_origin_5_0= ruleOrigin ) )? )
            {
            // InternalMyDsl.g:542:2: ( () otherlv_1= 'Inertial' ( (lv_name_2_0= RULE_ID ) )? ( (lv_inertia_3_0= ruleInertia ) ) ( (lv_mass_4_0= ruleMass ) ) ( (lv_origin_5_0= ruleOrigin ) )? )
            // InternalMyDsl.g:543:3: () otherlv_1= 'Inertial' ( (lv_name_2_0= RULE_ID ) )? ( (lv_inertia_3_0= ruleInertia ) ) ( (lv_mass_4_0= ruleMass ) ) ( (lv_origin_5_0= ruleOrigin ) )?
            {
            // InternalMyDsl.g:543:3: ()
            // InternalMyDsl.g:544:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInertialAccess().getInertialAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getInertialAccess().getInertialKeyword_1());
            		
            // InternalMyDsl.g:554:3: ( (lv_name_2_0= RULE_ID ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:555:4: (lv_name_2_0= RULE_ID )
                    {
                    // InternalMyDsl.g:555:4: (lv_name_2_0= RULE_ID )
                    // InternalMyDsl.g:556:5: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_10); 

                    					newLeafNode(lv_name_2_0, grammarAccess.getInertialAccess().getNameIDTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getInertialRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_2_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:572:3: ( (lv_inertia_3_0= ruleInertia ) )
            // InternalMyDsl.g:573:4: (lv_inertia_3_0= ruleInertia )
            {
            // InternalMyDsl.g:573:4: (lv_inertia_3_0= ruleInertia )
            // InternalMyDsl.g:574:5: lv_inertia_3_0= ruleInertia
            {

            					newCompositeNode(grammarAccess.getInertialAccess().getInertiaInertiaParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_11);
            lv_inertia_3_0=ruleInertia();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInertialRule());
            					}
            					set(
            						current,
            						"inertia",
            						lv_inertia_3_0,
            						"org.xtext.example.mydsl4.MyDsl.Inertia");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:591:3: ( (lv_mass_4_0= ruleMass ) )
            // InternalMyDsl.g:592:4: (lv_mass_4_0= ruleMass )
            {
            // InternalMyDsl.g:592:4: (lv_mass_4_0= ruleMass )
            // InternalMyDsl.g:593:5: lv_mass_4_0= ruleMass
            {

            					newCompositeNode(grammarAccess.getInertialAccess().getMassMassParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_12);
            lv_mass_4_0=ruleMass();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInertialRule());
            					}
            					set(
            						current,
            						"mass",
            						lv_mass_4_0,
            						"org.xtext.example.mydsl4.MyDsl.Mass");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:610:3: ( (lv_origin_5_0= ruleOrigin ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==29) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:611:4: (lv_origin_5_0= ruleOrigin )
                    {
                    // InternalMyDsl.g:611:4: (lv_origin_5_0= ruleOrigin )
                    // InternalMyDsl.g:612:5: lv_origin_5_0= ruleOrigin
                    {

                    					newCompositeNode(grammarAccess.getInertialAccess().getOriginOriginParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_origin_5_0=ruleOrigin();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getInertialRule());
                    					}
                    					set(
                    						current,
                    						"origin",
                    						lv_origin_5_0,
                    						"org.xtext.example.mydsl4.MyDsl.Origin");
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
    // $ANTLR end "ruleInertial"


    // $ANTLR start "entryRuleInertia"
    // InternalMyDsl.g:633:1: entryRuleInertia returns [EObject current=null] : iv_ruleInertia= ruleInertia EOF ;
    public final EObject entryRuleInertia() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInertia = null;


        try {
            // InternalMyDsl.g:633:48: (iv_ruleInertia= ruleInertia EOF )
            // InternalMyDsl.g:634:2: iv_ruleInertia= ruleInertia EOF
            {
             newCompositeNode(grammarAccess.getInertiaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInertia=ruleInertia();

            state._fsp--;

             current =iv_ruleInertia; 
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
    // $ANTLR end "entryRuleInertia"


    // $ANTLR start "ruleInertia"
    // InternalMyDsl.g:640:1: ruleInertia returns [EObject current=null] : ( () otherlv_1= 'Inertia' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= 'ixx' ( (lv_ixx_4_0= ruleURDFAttrSignedNumeric ) ) otherlv_5= 'ixy' ( (lv_ixy_6_0= ruleURDFAttrSignedNumeric ) ) otherlv_7= 'ixz' ( (lv_ixz_8_0= ruleURDFAttrSignedNumeric ) ) otherlv_9= 'iyy' ( (lv_iyy_10_0= ruleURDFAttrSignedNumeric ) ) otherlv_11= 'iyz' ( (lv_iyz_12_0= ruleURDFAttrSignedNumeric ) ) otherlv_13= 'izz' ( (lv_izz_14_0= ruleURDFAttrSignedNumeric ) ) ) ;
    public final EObject ruleInertia() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_ixx_4_0 = null;

        EObject lv_ixy_6_0 = null;

        EObject lv_ixz_8_0 = null;

        EObject lv_iyy_10_0 = null;

        EObject lv_iyz_12_0 = null;

        EObject lv_izz_14_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:646:2: ( ( () otherlv_1= 'Inertia' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= 'ixx' ( (lv_ixx_4_0= ruleURDFAttrSignedNumeric ) ) otherlv_5= 'ixy' ( (lv_ixy_6_0= ruleURDFAttrSignedNumeric ) ) otherlv_7= 'ixz' ( (lv_ixz_8_0= ruleURDFAttrSignedNumeric ) ) otherlv_9= 'iyy' ( (lv_iyy_10_0= ruleURDFAttrSignedNumeric ) ) otherlv_11= 'iyz' ( (lv_iyz_12_0= ruleURDFAttrSignedNumeric ) ) otherlv_13= 'izz' ( (lv_izz_14_0= ruleURDFAttrSignedNumeric ) ) ) )
            // InternalMyDsl.g:647:2: ( () otherlv_1= 'Inertia' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= 'ixx' ( (lv_ixx_4_0= ruleURDFAttrSignedNumeric ) ) otherlv_5= 'ixy' ( (lv_ixy_6_0= ruleURDFAttrSignedNumeric ) ) otherlv_7= 'ixz' ( (lv_ixz_8_0= ruleURDFAttrSignedNumeric ) ) otherlv_9= 'iyy' ( (lv_iyy_10_0= ruleURDFAttrSignedNumeric ) ) otherlv_11= 'iyz' ( (lv_iyz_12_0= ruleURDFAttrSignedNumeric ) ) otherlv_13= 'izz' ( (lv_izz_14_0= ruleURDFAttrSignedNumeric ) ) )
            {
            // InternalMyDsl.g:647:2: ( () otherlv_1= 'Inertia' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= 'ixx' ( (lv_ixx_4_0= ruleURDFAttrSignedNumeric ) ) otherlv_5= 'ixy' ( (lv_ixy_6_0= ruleURDFAttrSignedNumeric ) ) otherlv_7= 'ixz' ( (lv_ixz_8_0= ruleURDFAttrSignedNumeric ) ) otherlv_9= 'iyy' ( (lv_iyy_10_0= ruleURDFAttrSignedNumeric ) ) otherlv_11= 'iyz' ( (lv_iyz_12_0= ruleURDFAttrSignedNumeric ) ) otherlv_13= 'izz' ( (lv_izz_14_0= ruleURDFAttrSignedNumeric ) ) )
            // InternalMyDsl.g:648:3: () otherlv_1= 'Inertia' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= 'ixx' ( (lv_ixx_4_0= ruleURDFAttrSignedNumeric ) ) otherlv_5= 'ixy' ( (lv_ixy_6_0= ruleURDFAttrSignedNumeric ) ) otherlv_7= 'ixz' ( (lv_ixz_8_0= ruleURDFAttrSignedNumeric ) ) otherlv_9= 'iyy' ( (lv_iyy_10_0= ruleURDFAttrSignedNumeric ) ) otherlv_11= 'iyz' ( (lv_iyz_12_0= ruleURDFAttrSignedNumeric ) ) otherlv_13= 'izz' ( (lv_izz_14_0= ruleURDFAttrSignedNumeric ) )
            {
            // InternalMyDsl.g:648:3: ()
            // InternalMyDsl.g:649:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInertiaAccess().getInertiaAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getInertiaAccess().getInertiaKeyword_1());
            		
            // InternalMyDsl.g:659:3: ( (lv_name_2_0= RULE_ID ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:660:4: (lv_name_2_0= RULE_ID )
                    {
                    // InternalMyDsl.g:660:4: (lv_name_2_0= RULE_ID )
                    // InternalMyDsl.g:661:5: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_14); 

                    					newLeafNode(lv_name_2_0, grammarAccess.getInertiaAccess().getNameIDTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getInertiaRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_2_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,20,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getInertiaAccess().getIxxKeyword_3());
            		
            // InternalMyDsl.g:681:3: ( (lv_ixx_4_0= ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:682:4: (lv_ixx_4_0= ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:682:4: (lv_ixx_4_0= ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:683:5: lv_ixx_4_0= ruleURDFAttrSignedNumeric
            {

            					newCompositeNode(grammarAccess.getInertiaAccess().getIxxURDFAttrSignedNumericParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_16);
            lv_ixx_4_0=ruleURDFAttrSignedNumeric();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInertiaRule());
            					}
            					set(
            						current,
            						"ixx",
            						lv_ixx_4_0,
            						"org.xtext.example.mydsl4.MyDsl.URDFAttrSignedNumeric");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,21,FOLLOW_15); 

            			newLeafNode(otherlv_5, grammarAccess.getInertiaAccess().getIxyKeyword_5());
            		
            // InternalMyDsl.g:704:3: ( (lv_ixy_6_0= ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:705:4: (lv_ixy_6_0= ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:705:4: (lv_ixy_6_0= ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:706:5: lv_ixy_6_0= ruleURDFAttrSignedNumeric
            {

            					newCompositeNode(grammarAccess.getInertiaAccess().getIxyURDFAttrSignedNumericParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_17);
            lv_ixy_6_0=ruleURDFAttrSignedNumeric();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInertiaRule());
            					}
            					set(
            						current,
            						"ixy",
            						lv_ixy_6_0,
            						"org.xtext.example.mydsl4.MyDsl.URDFAttrSignedNumeric");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,22,FOLLOW_15); 

            			newLeafNode(otherlv_7, grammarAccess.getInertiaAccess().getIxzKeyword_7());
            		
            // InternalMyDsl.g:727:3: ( (lv_ixz_8_0= ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:728:4: (lv_ixz_8_0= ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:728:4: (lv_ixz_8_0= ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:729:5: lv_ixz_8_0= ruleURDFAttrSignedNumeric
            {

            					newCompositeNode(grammarAccess.getInertiaAccess().getIxzURDFAttrSignedNumericParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_18);
            lv_ixz_8_0=ruleURDFAttrSignedNumeric();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInertiaRule());
            					}
            					set(
            						current,
            						"ixz",
            						lv_ixz_8_0,
            						"org.xtext.example.mydsl4.MyDsl.URDFAttrSignedNumeric");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,23,FOLLOW_15); 

            			newLeafNode(otherlv_9, grammarAccess.getInertiaAccess().getIyyKeyword_9());
            		
            // InternalMyDsl.g:750:3: ( (lv_iyy_10_0= ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:751:4: (lv_iyy_10_0= ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:751:4: (lv_iyy_10_0= ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:752:5: lv_iyy_10_0= ruleURDFAttrSignedNumeric
            {

            					newCompositeNode(grammarAccess.getInertiaAccess().getIyyURDFAttrSignedNumericParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_19);
            lv_iyy_10_0=ruleURDFAttrSignedNumeric();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInertiaRule());
            					}
            					set(
            						current,
            						"iyy",
            						lv_iyy_10_0,
            						"org.xtext.example.mydsl4.MyDsl.URDFAttrSignedNumeric");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,24,FOLLOW_15); 

            			newLeafNode(otherlv_11, grammarAccess.getInertiaAccess().getIyzKeyword_11());
            		
            // InternalMyDsl.g:773:3: ( (lv_iyz_12_0= ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:774:4: (lv_iyz_12_0= ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:774:4: (lv_iyz_12_0= ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:775:5: lv_iyz_12_0= ruleURDFAttrSignedNumeric
            {

            					newCompositeNode(grammarAccess.getInertiaAccess().getIyzURDFAttrSignedNumericParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_20);
            lv_iyz_12_0=ruleURDFAttrSignedNumeric();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInertiaRule());
            					}
            					set(
            						current,
            						"iyz",
            						lv_iyz_12_0,
            						"org.xtext.example.mydsl4.MyDsl.URDFAttrSignedNumeric");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,25,FOLLOW_15); 

            			newLeafNode(otherlv_13, grammarAccess.getInertiaAccess().getIzzKeyword_13());
            		
            // InternalMyDsl.g:796:3: ( (lv_izz_14_0= ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:797:4: (lv_izz_14_0= ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:797:4: (lv_izz_14_0= ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:798:5: lv_izz_14_0= ruleURDFAttrSignedNumeric
            {

            					newCompositeNode(grammarAccess.getInertiaAccess().getIzzURDFAttrSignedNumericParserRuleCall_14_0());
            				
            pushFollow(FOLLOW_2);
            lv_izz_14_0=ruleURDFAttrSignedNumeric();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInertiaRule());
            					}
            					set(
            						current,
            						"izz",
            						lv_izz_14_0,
            						"org.xtext.example.mydsl4.MyDsl.URDFAttrSignedNumeric");
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
    // $ANTLR end "ruleInertia"


    // $ANTLR start "entryRuleVisual"
    // InternalMyDsl.g:819:1: entryRuleVisual returns [EObject current=null] : iv_ruleVisual= ruleVisual EOF ;
    public final EObject entryRuleVisual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVisual = null;


        try {
            // InternalMyDsl.g:819:47: (iv_ruleVisual= ruleVisual EOF )
            // InternalMyDsl.g:820:2: iv_ruleVisual= ruleVisual EOF
            {
             newCompositeNode(grammarAccess.getVisualRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVisual=ruleVisual();

            state._fsp--;

             current =iv_ruleVisual; 
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
    // $ANTLR end "entryRuleVisual"


    // $ANTLR start "ruleVisual"
    // InternalMyDsl.g:826:1: ruleVisual returns [EObject current=null] : ( () otherlv_1= 'Visual' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= 'Geometry' ( (lv_geometry_4_0= ruleGeometry ) )* ( (lv_origin_5_0= ruleOrigin ) )? (otherlv_6= 'Material' ( (lv_material_7_0= ruleMaterial ) ) )? ) ;
    public final EObject ruleVisual() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_geometry_4_0 = null;

        EObject lv_origin_5_0 = null;

        EObject lv_material_7_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:832:2: ( ( () otherlv_1= 'Visual' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= 'Geometry' ( (lv_geometry_4_0= ruleGeometry ) )* ( (lv_origin_5_0= ruleOrigin ) )? (otherlv_6= 'Material' ( (lv_material_7_0= ruleMaterial ) ) )? ) )
            // InternalMyDsl.g:833:2: ( () otherlv_1= 'Visual' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= 'Geometry' ( (lv_geometry_4_0= ruleGeometry ) )* ( (lv_origin_5_0= ruleOrigin ) )? (otherlv_6= 'Material' ( (lv_material_7_0= ruleMaterial ) ) )? )
            {
            // InternalMyDsl.g:833:2: ( () otherlv_1= 'Visual' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= 'Geometry' ( (lv_geometry_4_0= ruleGeometry ) )* ( (lv_origin_5_0= ruleOrigin ) )? (otherlv_6= 'Material' ( (lv_material_7_0= ruleMaterial ) ) )? )
            // InternalMyDsl.g:834:3: () otherlv_1= 'Visual' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= 'Geometry' ( (lv_geometry_4_0= ruleGeometry ) )* ( (lv_origin_5_0= ruleOrigin ) )? (otherlv_6= 'Material' ( (lv_material_7_0= ruleMaterial ) ) )?
            {
            // InternalMyDsl.g:834:3: ()
            // InternalMyDsl.g:835:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVisualAccess().getVisualAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getVisualAccess().getVisualKeyword_1());
            		
            // InternalMyDsl.g:845:3: ( (lv_name_2_0= RULE_ID ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:846:4: (lv_name_2_0= RULE_ID )
                    {
                    // InternalMyDsl.g:846:4: (lv_name_2_0= RULE_ID )
                    // InternalMyDsl.g:847:5: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_22); 

                    					newLeafNode(lv_name_2_0, grammarAccess.getVisualAccess().getNameIDTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getVisualRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_2_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,27,FOLLOW_23); 

            			newLeafNode(otherlv_3, grammarAccess.getVisualAccess().getGeometryKeyword_3());
            		
            // InternalMyDsl.g:867:3: ( (lv_geometry_4_0= ruleGeometry ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==39||LA11_0==43||LA11_0==45||LA11_0==47) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:868:4: (lv_geometry_4_0= ruleGeometry )
            	    {
            	    // InternalMyDsl.g:868:4: (lv_geometry_4_0= ruleGeometry )
            	    // InternalMyDsl.g:869:5: lv_geometry_4_0= ruleGeometry
            	    {

            	    					newCompositeNode(grammarAccess.getVisualAccess().getGeometryGeometryParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_23);
            	    lv_geometry_4_0=ruleGeometry();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getVisualRule());
            	    					}
            	    					add(
            	    						current,
            	    						"geometry",
            	    						lv_geometry_4_0,
            	    						"org.xtext.example.mydsl4.MyDsl.Geometry");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // InternalMyDsl.g:886:3: ( (lv_origin_5_0= ruleOrigin ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==29) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:887:4: (lv_origin_5_0= ruleOrigin )
                    {
                    // InternalMyDsl.g:887:4: (lv_origin_5_0= ruleOrigin )
                    // InternalMyDsl.g:888:5: lv_origin_5_0= ruleOrigin
                    {

                    					newCompositeNode(grammarAccess.getVisualAccess().getOriginOriginParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_24);
                    lv_origin_5_0=ruleOrigin();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getVisualRule());
                    					}
                    					set(
                    						current,
                    						"origin",
                    						lv_origin_5_0,
                    						"org.xtext.example.mydsl4.MyDsl.Origin");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:905:3: (otherlv_6= 'Material' ( (lv_material_7_0= ruleMaterial ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==28) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:906:4: otherlv_6= 'Material' ( (lv_material_7_0= ruleMaterial ) )
                    {
                    otherlv_6=(Token)match(input,28,FOLLOW_25); 

                    				newLeafNode(otherlv_6, grammarAccess.getVisualAccess().getMaterialKeyword_6_0());
                    			
                    // InternalMyDsl.g:910:4: ( (lv_material_7_0= ruleMaterial ) )
                    // InternalMyDsl.g:911:5: (lv_material_7_0= ruleMaterial )
                    {
                    // InternalMyDsl.g:911:5: (lv_material_7_0= ruleMaterial )
                    // InternalMyDsl.g:912:6: lv_material_7_0= ruleMaterial
                    {

                    						newCompositeNode(grammarAccess.getVisualAccess().getMaterialMaterialParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_material_7_0=ruleMaterial();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVisualRule());
                    						}
                    						set(
                    							current,
                    							"material",
                    							lv_material_7_0,
                    							"org.xtext.example.mydsl4.MyDsl.Material");
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
    // $ANTLR end "ruleVisual"


    // $ANTLR start "entryRuleOrigin"
    // InternalMyDsl.g:934:1: entryRuleOrigin returns [EObject current=null] : iv_ruleOrigin= ruleOrigin EOF ;
    public final EObject entryRuleOrigin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrigin = null;


        try {
            // InternalMyDsl.g:934:47: (iv_ruleOrigin= ruleOrigin EOF )
            // InternalMyDsl.g:935:2: iv_ruleOrigin= ruleOrigin EOF
            {
             newCompositeNode(grammarAccess.getOriginRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrigin=ruleOrigin();

            state._fsp--;

             current =iv_ruleOrigin; 
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
    // $ANTLR end "entryRuleOrigin"


    // $ANTLR start "ruleOrigin"
    // InternalMyDsl.g:941:1: ruleOrigin returns [EObject current=null] : ( () otherlv_1= 'Origin' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= 'x' ( (lv_x_4_0= ruleURDFAttrSignedNumeric ) ) otherlv_5= 'y' ( (lv_y_6_0= ruleURDFAttrSignedNumeric ) ) otherlv_7= 'z' ( (lv_z_8_0= ruleURDFAttrSignedNumeric ) ) (otherlv_9= 'roll' ( (lv_roll_10_0= ruleURDFAttrSignedNumeric ) ) )? (otherlv_11= 'pitch' ( (lv_pitch_12_0= ruleURDFAttrSignedNumeric ) ) )? (otherlv_13= 'yaw' ( (lv_yaw_14_0= ruleURDFAttrSignedNumeric ) ) )? ) ;
    public final EObject ruleOrigin() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_x_4_0 = null;

        EObject lv_y_6_0 = null;

        EObject lv_z_8_0 = null;

        EObject lv_roll_10_0 = null;

        EObject lv_pitch_12_0 = null;

        EObject lv_yaw_14_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:947:2: ( ( () otherlv_1= 'Origin' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= 'x' ( (lv_x_4_0= ruleURDFAttrSignedNumeric ) ) otherlv_5= 'y' ( (lv_y_6_0= ruleURDFAttrSignedNumeric ) ) otherlv_7= 'z' ( (lv_z_8_0= ruleURDFAttrSignedNumeric ) ) (otherlv_9= 'roll' ( (lv_roll_10_0= ruleURDFAttrSignedNumeric ) ) )? (otherlv_11= 'pitch' ( (lv_pitch_12_0= ruleURDFAttrSignedNumeric ) ) )? (otherlv_13= 'yaw' ( (lv_yaw_14_0= ruleURDFAttrSignedNumeric ) ) )? ) )
            // InternalMyDsl.g:948:2: ( () otherlv_1= 'Origin' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= 'x' ( (lv_x_4_0= ruleURDFAttrSignedNumeric ) ) otherlv_5= 'y' ( (lv_y_6_0= ruleURDFAttrSignedNumeric ) ) otherlv_7= 'z' ( (lv_z_8_0= ruleURDFAttrSignedNumeric ) ) (otherlv_9= 'roll' ( (lv_roll_10_0= ruleURDFAttrSignedNumeric ) ) )? (otherlv_11= 'pitch' ( (lv_pitch_12_0= ruleURDFAttrSignedNumeric ) ) )? (otherlv_13= 'yaw' ( (lv_yaw_14_0= ruleURDFAttrSignedNumeric ) ) )? )
            {
            // InternalMyDsl.g:948:2: ( () otherlv_1= 'Origin' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= 'x' ( (lv_x_4_0= ruleURDFAttrSignedNumeric ) ) otherlv_5= 'y' ( (lv_y_6_0= ruleURDFAttrSignedNumeric ) ) otherlv_7= 'z' ( (lv_z_8_0= ruleURDFAttrSignedNumeric ) ) (otherlv_9= 'roll' ( (lv_roll_10_0= ruleURDFAttrSignedNumeric ) ) )? (otherlv_11= 'pitch' ( (lv_pitch_12_0= ruleURDFAttrSignedNumeric ) ) )? (otherlv_13= 'yaw' ( (lv_yaw_14_0= ruleURDFAttrSignedNumeric ) ) )? )
            // InternalMyDsl.g:949:3: () otherlv_1= 'Origin' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= 'x' ( (lv_x_4_0= ruleURDFAttrSignedNumeric ) ) otherlv_5= 'y' ( (lv_y_6_0= ruleURDFAttrSignedNumeric ) ) otherlv_7= 'z' ( (lv_z_8_0= ruleURDFAttrSignedNumeric ) ) (otherlv_9= 'roll' ( (lv_roll_10_0= ruleURDFAttrSignedNumeric ) ) )? (otherlv_11= 'pitch' ( (lv_pitch_12_0= ruleURDFAttrSignedNumeric ) ) )? (otherlv_13= 'yaw' ( (lv_yaw_14_0= ruleURDFAttrSignedNumeric ) ) )?
            {
            // InternalMyDsl.g:949:3: ()
            // InternalMyDsl.g:950:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOriginAccess().getOriginAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getOriginAccess().getOriginKeyword_1());
            		
            // InternalMyDsl.g:960:3: ( (lv_name_2_0= RULE_ID ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:961:4: (lv_name_2_0= RULE_ID )
                    {
                    // InternalMyDsl.g:961:4: (lv_name_2_0= RULE_ID )
                    // InternalMyDsl.g:962:5: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_27); 

                    					newLeafNode(lv_name_2_0, grammarAccess.getOriginAccess().getNameIDTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOriginRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_2_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,30,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getOriginAccess().getXKeyword_3());
            		
            // InternalMyDsl.g:982:3: ( (lv_x_4_0= ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:983:4: (lv_x_4_0= ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:983:4: (lv_x_4_0= ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:984:5: lv_x_4_0= ruleURDFAttrSignedNumeric
            {

            					newCompositeNode(grammarAccess.getOriginAccess().getXURDFAttrSignedNumericParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_28);
            lv_x_4_0=ruleURDFAttrSignedNumeric();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOriginRule());
            					}
            					set(
            						current,
            						"x",
            						lv_x_4_0,
            						"org.xtext.example.mydsl4.MyDsl.URDFAttrSignedNumeric");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,31,FOLLOW_15); 

            			newLeafNode(otherlv_5, grammarAccess.getOriginAccess().getYKeyword_5());
            		
            // InternalMyDsl.g:1005:3: ( (lv_y_6_0= ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:1006:4: (lv_y_6_0= ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:1006:4: (lv_y_6_0= ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:1007:5: lv_y_6_0= ruleURDFAttrSignedNumeric
            {

            					newCompositeNode(grammarAccess.getOriginAccess().getYURDFAttrSignedNumericParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_29);
            lv_y_6_0=ruleURDFAttrSignedNumeric();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOriginRule());
            					}
            					set(
            						current,
            						"y",
            						lv_y_6_0,
            						"org.xtext.example.mydsl4.MyDsl.URDFAttrSignedNumeric");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,32,FOLLOW_15); 

            			newLeafNode(otherlv_7, grammarAccess.getOriginAccess().getZKeyword_7());
            		
            // InternalMyDsl.g:1028:3: ( (lv_z_8_0= ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:1029:4: (lv_z_8_0= ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:1029:4: (lv_z_8_0= ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:1030:5: lv_z_8_0= ruleURDFAttrSignedNumeric
            {

            					newCompositeNode(grammarAccess.getOriginAccess().getZURDFAttrSignedNumericParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_30);
            lv_z_8_0=ruleURDFAttrSignedNumeric();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOriginRule());
            					}
            					set(
            						current,
            						"z",
            						lv_z_8_0,
            						"org.xtext.example.mydsl4.MyDsl.URDFAttrSignedNumeric");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1047:3: (otherlv_9= 'roll' ( (lv_roll_10_0= ruleURDFAttrSignedNumeric ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==33) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:1048:4: otherlv_9= 'roll' ( (lv_roll_10_0= ruleURDFAttrSignedNumeric ) )
                    {
                    otherlv_9=(Token)match(input,33,FOLLOW_15); 

                    				newLeafNode(otherlv_9, grammarAccess.getOriginAccess().getRollKeyword_9_0());
                    			
                    // InternalMyDsl.g:1052:4: ( (lv_roll_10_0= ruleURDFAttrSignedNumeric ) )
                    // InternalMyDsl.g:1053:5: (lv_roll_10_0= ruleURDFAttrSignedNumeric )
                    {
                    // InternalMyDsl.g:1053:5: (lv_roll_10_0= ruleURDFAttrSignedNumeric )
                    // InternalMyDsl.g:1054:6: lv_roll_10_0= ruleURDFAttrSignedNumeric
                    {

                    						newCompositeNode(grammarAccess.getOriginAccess().getRollURDFAttrSignedNumericParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_roll_10_0=ruleURDFAttrSignedNumeric();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOriginRule());
                    						}
                    						set(
                    							current,
                    							"roll",
                    							lv_roll_10_0,
                    							"org.xtext.example.mydsl4.MyDsl.URDFAttrSignedNumeric");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1072:3: (otherlv_11= 'pitch' ( (lv_pitch_12_0= ruleURDFAttrSignedNumeric ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==34) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:1073:4: otherlv_11= 'pitch' ( (lv_pitch_12_0= ruleURDFAttrSignedNumeric ) )
                    {
                    otherlv_11=(Token)match(input,34,FOLLOW_15); 

                    				newLeafNode(otherlv_11, grammarAccess.getOriginAccess().getPitchKeyword_10_0());
                    			
                    // InternalMyDsl.g:1077:4: ( (lv_pitch_12_0= ruleURDFAttrSignedNumeric ) )
                    // InternalMyDsl.g:1078:5: (lv_pitch_12_0= ruleURDFAttrSignedNumeric )
                    {
                    // InternalMyDsl.g:1078:5: (lv_pitch_12_0= ruleURDFAttrSignedNumeric )
                    // InternalMyDsl.g:1079:6: lv_pitch_12_0= ruleURDFAttrSignedNumeric
                    {

                    						newCompositeNode(grammarAccess.getOriginAccess().getPitchURDFAttrSignedNumericParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_32);
                    lv_pitch_12_0=ruleURDFAttrSignedNumeric();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOriginRule());
                    						}
                    						set(
                    							current,
                    							"pitch",
                    							lv_pitch_12_0,
                    							"org.xtext.example.mydsl4.MyDsl.URDFAttrSignedNumeric");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1097:3: (otherlv_13= 'yaw' ( (lv_yaw_14_0= ruleURDFAttrSignedNumeric ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==35) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:1098:4: otherlv_13= 'yaw' ( (lv_yaw_14_0= ruleURDFAttrSignedNumeric ) )
                    {
                    otherlv_13=(Token)match(input,35,FOLLOW_15); 

                    				newLeafNode(otherlv_13, grammarAccess.getOriginAccess().getYawKeyword_11_0());
                    			
                    // InternalMyDsl.g:1102:4: ( (lv_yaw_14_0= ruleURDFAttrSignedNumeric ) )
                    // InternalMyDsl.g:1103:5: (lv_yaw_14_0= ruleURDFAttrSignedNumeric )
                    {
                    // InternalMyDsl.g:1103:5: (lv_yaw_14_0= ruleURDFAttrSignedNumeric )
                    // InternalMyDsl.g:1104:6: lv_yaw_14_0= ruleURDFAttrSignedNumeric
                    {

                    						newCompositeNode(grammarAccess.getOriginAccess().getYawURDFAttrSignedNumericParserRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_yaw_14_0=ruleURDFAttrSignedNumeric();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOriginRule());
                    						}
                    						set(
                    							current,
                    							"yaw",
                    							lv_yaw_14_0,
                    							"org.xtext.example.mydsl4.MyDsl.URDFAttrSignedNumeric");
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
    // $ANTLR end "ruleOrigin"


    // $ANTLR start "entryRuleMass"
    // InternalMyDsl.g:1126:1: entryRuleMass returns [EObject current=null] : iv_ruleMass= ruleMass EOF ;
    public final EObject entryRuleMass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMass = null;


        try {
            // InternalMyDsl.g:1126:45: (iv_ruleMass= ruleMass EOF )
            // InternalMyDsl.g:1127:2: iv_ruleMass= ruleMass EOF
            {
             newCompositeNode(grammarAccess.getMassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMass=ruleMass();

            state._fsp--;

             current =iv_ruleMass; 
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
    // $ANTLR end "entryRuleMass"


    // $ANTLR start "ruleMass"
    // InternalMyDsl.g:1133:1: ruleMass returns [EObject current=null] : ( () otherlv_1= 'Mass' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= 'massKilogram' ( (lv_massKilogram_4_0= ruleURDFAttrSignedNumeric ) ) ) ;
    public final EObject ruleMass() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        EObject lv_massKilogram_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1139:2: ( ( () otherlv_1= 'Mass' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= 'massKilogram' ( (lv_massKilogram_4_0= ruleURDFAttrSignedNumeric ) ) ) )
            // InternalMyDsl.g:1140:2: ( () otherlv_1= 'Mass' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= 'massKilogram' ( (lv_massKilogram_4_0= ruleURDFAttrSignedNumeric ) ) )
            {
            // InternalMyDsl.g:1140:2: ( () otherlv_1= 'Mass' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= 'massKilogram' ( (lv_massKilogram_4_0= ruleURDFAttrSignedNumeric ) ) )
            // InternalMyDsl.g:1141:3: () otherlv_1= 'Mass' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= 'massKilogram' ( (lv_massKilogram_4_0= ruleURDFAttrSignedNumeric ) )
            {
            // InternalMyDsl.g:1141:3: ()
            // InternalMyDsl.g:1142:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMassAccess().getMassAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,36,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getMassAccess().getMassKeyword_1());
            		
            // InternalMyDsl.g:1152:3: ( (lv_name_2_0= RULE_ID ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMyDsl.g:1153:4: (lv_name_2_0= RULE_ID )
                    {
                    // InternalMyDsl.g:1153:4: (lv_name_2_0= RULE_ID )
                    // InternalMyDsl.g:1154:5: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_34); 

                    					newLeafNode(lv_name_2_0, grammarAccess.getMassAccess().getNameIDTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMassRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_2_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,37,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getMassAccess().getMassKilogramKeyword_3());
            		
            // InternalMyDsl.g:1174:3: ( (lv_massKilogram_4_0= ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:1175:4: (lv_massKilogram_4_0= ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:1175:4: (lv_massKilogram_4_0= ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:1176:5: lv_massKilogram_4_0= ruleURDFAttrSignedNumeric
            {

            					newCompositeNode(grammarAccess.getMassAccess().getMassKilogramURDFAttrSignedNumericParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_massKilogram_4_0=ruleURDFAttrSignedNumeric();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMassRule());
            					}
            					set(
            						current,
            						"massKilogram",
            						lv_massKilogram_4_0,
            						"org.xtext.example.mydsl4.MyDsl.URDFAttrSignedNumeric");
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
    // $ANTLR end "ruleMass"


    // $ANTLR start "entryRuleCollision"
    // InternalMyDsl.g:1197:1: entryRuleCollision returns [EObject current=null] : iv_ruleCollision= ruleCollision EOF ;
    public final EObject entryRuleCollision() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollision = null;


        try {
            // InternalMyDsl.g:1197:50: (iv_ruleCollision= ruleCollision EOF )
            // InternalMyDsl.g:1198:2: iv_ruleCollision= ruleCollision EOF
            {
             newCompositeNode(grammarAccess.getCollisionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCollision=ruleCollision();

            state._fsp--;

             current =iv_ruleCollision; 
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
    // $ANTLR end "entryRuleCollision"


    // $ANTLR start "ruleCollision"
    // InternalMyDsl.g:1204:1: ruleCollision returns [EObject current=null] : (otherlv_0= 'Collision' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Geometry' ( (lv_geometry_3_0= ruleGeometry ) )* ( (lv_origin_4_0= ruleOrigin ) )? ) ;
    public final EObject ruleCollision() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_geometry_3_0 = null;

        EObject lv_origin_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1210:2: ( (otherlv_0= 'Collision' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Geometry' ( (lv_geometry_3_0= ruleGeometry ) )* ( (lv_origin_4_0= ruleOrigin ) )? ) )
            // InternalMyDsl.g:1211:2: (otherlv_0= 'Collision' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Geometry' ( (lv_geometry_3_0= ruleGeometry ) )* ( (lv_origin_4_0= ruleOrigin ) )? )
            {
            // InternalMyDsl.g:1211:2: (otherlv_0= 'Collision' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Geometry' ( (lv_geometry_3_0= ruleGeometry ) )* ( (lv_origin_4_0= ruleOrigin ) )? )
            // InternalMyDsl.g:1212:3: otherlv_0= 'Collision' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Geometry' ( (lv_geometry_3_0= ruleGeometry ) )* ( (lv_origin_4_0= ruleOrigin ) )?
            {
            otherlv_0=(Token)match(input,38,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCollisionAccess().getCollisionKeyword_0());
            		
            // InternalMyDsl.g:1216:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:1217:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:1217:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:1218:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCollisionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCollisionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_35); 

            			newLeafNode(otherlv_2, grammarAccess.getCollisionAccess().getGeometryKeyword_2());
            		
            // InternalMyDsl.g:1238:3: ( (lv_geometry_3_0= ruleGeometry ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==39||LA19_0==43||LA19_0==45||LA19_0==47) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMyDsl.g:1239:4: (lv_geometry_3_0= ruleGeometry )
            	    {
            	    // InternalMyDsl.g:1239:4: (lv_geometry_3_0= ruleGeometry )
            	    // InternalMyDsl.g:1240:5: lv_geometry_3_0= ruleGeometry
            	    {

            	    					newCompositeNode(grammarAccess.getCollisionAccess().getGeometryGeometryParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_35);
            	    lv_geometry_3_0=ruleGeometry();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCollisionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"geometry",
            	    						lv_geometry_3_0,
            	    						"org.xtext.example.mydsl4.MyDsl.Geometry");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            // InternalMyDsl.g:1257:3: ( (lv_origin_4_0= ruleOrigin ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==29) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMyDsl.g:1258:4: (lv_origin_4_0= ruleOrigin )
                    {
                    // InternalMyDsl.g:1258:4: (lv_origin_4_0= ruleOrigin )
                    // InternalMyDsl.g:1259:5: lv_origin_4_0= ruleOrigin
                    {

                    					newCompositeNode(grammarAccess.getCollisionAccess().getOriginOriginParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_origin_4_0=ruleOrigin();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getCollisionRule());
                    					}
                    					set(
                    						current,
                    						"origin",
                    						lv_origin_4_0,
                    						"org.xtext.example.mydsl4.MyDsl.Origin");
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
    // $ANTLR end "ruleCollision"


    // $ANTLR start "entryRuleGeometry"
    // InternalMyDsl.g:1280:1: entryRuleGeometry returns [EObject current=null] : iv_ruleGeometry= ruleGeometry EOF ;
    public final EObject entryRuleGeometry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeometry = null;


        try {
            // InternalMyDsl.g:1280:49: (iv_ruleGeometry= ruleGeometry EOF )
            // InternalMyDsl.g:1281:2: iv_ruleGeometry= ruleGeometry EOF
            {
             newCompositeNode(grammarAccess.getGeometryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGeometry=ruleGeometry();

            state._fsp--;

             current =iv_ruleGeometry; 
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
    // $ANTLR end "entryRuleGeometry"


    // $ANTLR start "ruleGeometry"
    // InternalMyDsl.g:1287:1: ruleGeometry returns [EObject current=null] : (this_Box_0= ruleBox | this_Cylinder_1= ruleCylinder | this_Mesh_2= ruleMesh | this_Sphere_3= ruleSphere ) ;
    public final EObject ruleGeometry() throws RecognitionException {
        EObject current = null;

        EObject this_Box_0 = null;

        EObject this_Cylinder_1 = null;

        EObject this_Mesh_2 = null;

        EObject this_Sphere_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1293:2: ( (this_Box_0= ruleBox | this_Cylinder_1= ruleCylinder | this_Mesh_2= ruleMesh | this_Sphere_3= ruleSphere ) )
            // InternalMyDsl.g:1294:2: (this_Box_0= ruleBox | this_Cylinder_1= ruleCylinder | this_Mesh_2= ruleMesh | this_Sphere_3= ruleSphere )
            {
            // InternalMyDsl.g:1294:2: (this_Box_0= ruleBox | this_Cylinder_1= ruleCylinder | this_Mesh_2= ruleMesh | this_Sphere_3= ruleSphere )
            int alt21=4;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt21=1;
                }
                break;
            case 43:
                {
                alt21=2;
                }
                break;
            case 45:
                {
                alt21=3;
                }
                break;
            case 47:
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
                    // InternalMyDsl.g:1295:3: this_Box_0= ruleBox
                    {

                    			newCompositeNode(grammarAccess.getGeometryAccess().getBoxParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Box_0=ruleBox();

                    state._fsp--;


                    			current = this_Box_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1304:3: this_Cylinder_1= ruleCylinder
                    {

                    			newCompositeNode(grammarAccess.getGeometryAccess().getCylinderParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Cylinder_1=ruleCylinder();

                    state._fsp--;


                    			current = this_Cylinder_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1313:3: this_Mesh_2= ruleMesh
                    {

                    			newCompositeNode(grammarAccess.getGeometryAccess().getMeshParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Mesh_2=ruleMesh();

                    state._fsp--;


                    			current = this_Mesh_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1322:3: this_Sphere_3= ruleSphere
                    {

                    			newCompositeNode(grammarAccess.getGeometryAccess().getSphereParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Sphere_3=ruleSphere();

                    state._fsp--;


                    			current = this_Sphere_3;
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
    // $ANTLR end "ruleGeometry"


    // $ANTLR start "entryRuleBox"
    // InternalMyDsl.g:1334:1: entryRuleBox returns [EObject current=null] : iv_ruleBox= ruleBox EOF ;
    public final EObject entryRuleBox() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBox = null;


        try {
            // InternalMyDsl.g:1334:44: (iv_ruleBox= ruleBox EOF )
            // InternalMyDsl.g:1335:2: iv_ruleBox= ruleBox EOF
            {
             newCompositeNode(grammarAccess.getBoxRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBox=ruleBox();

            state._fsp--;

             current =iv_ruleBox; 
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
    // $ANTLR end "entryRuleBox"


    // $ANTLR start "ruleBox"
    // InternalMyDsl.g:1341:1: ruleBox returns [EObject current=null] : (otherlv_0= 'Box' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'height' ( (lv_height_3_0= ruleURDFAttrNumeric ) ) otherlv_4= 'length' ( (lv_length_5_0= ruleURDFAttrNumeric ) ) otherlv_6= 'width' ( (lv_width_7_0= ruleURDFAttrNumeric ) ) ) ;
    public final EObject ruleBox() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_height_3_0 = null;

        EObject lv_length_5_0 = null;

        EObject lv_width_7_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1347:2: ( (otherlv_0= 'Box' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'height' ( (lv_height_3_0= ruleURDFAttrNumeric ) ) otherlv_4= 'length' ( (lv_length_5_0= ruleURDFAttrNumeric ) ) otherlv_6= 'width' ( (lv_width_7_0= ruleURDFAttrNumeric ) ) ) )
            // InternalMyDsl.g:1348:2: (otherlv_0= 'Box' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'height' ( (lv_height_3_0= ruleURDFAttrNumeric ) ) otherlv_4= 'length' ( (lv_length_5_0= ruleURDFAttrNumeric ) ) otherlv_6= 'width' ( (lv_width_7_0= ruleURDFAttrNumeric ) ) )
            {
            // InternalMyDsl.g:1348:2: (otherlv_0= 'Box' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'height' ( (lv_height_3_0= ruleURDFAttrNumeric ) ) otherlv_4= 'length' ( (lv_length_5_0= ruleURDFAttrNumeric ) ) otherlv_6= 'width' ( (lv_width_7_0= ruleURDFAttrNumeric ) ) )
            // InternalMyDsl.g:1349:3: otherlv_0= 'Box' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'height' ( (lv_height_3_0= ruleURDFAttrNumeric ) ) otherlv_4= 'length' ( (lv_length_5_0= ruleURDFAttrNumeric ) ) otherlv_6= 'width' ( (lv_width_7_0= ruleURDFAttrNumeric ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_36); 

            			newLeafNode(otherlv_0, grammarAccess.getBoxAccess().getBoxKeyword_0());
            		
            // InternalMyDsl.g:1353:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMyDsl.g:1354:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalMyDsl.g:1354:4: (lv_name_1_0= RULE_ID )
                    // InternalMyDsl.g:1355:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_37); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getBoxAccess().getNameIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBoxRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,40,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getBoxAccess().getHeightKeyword_2());
            		
            // InternalMyDsl.g:1375:3: ( (lv_height_3_0= ruleURDFAttrNumeric ) )
            // InternalMyDsl.g:1376:4: (lv_height_3_0= ruleURDFAttrNumeric )
            {
            // InternalMyDsl.g:1376:4: (lv_height_3_0= ruleURDFAttrNumeric )
            // InternalMyDsl.g:1377:5: lv_height_3_0= ruleURDFAttrNumeric
            {

            					newCompositeNode(grammarAccess.getBoxAccess().getHeightURDFAttrNumericParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_38);
            lv_height_3_0=ruleURDFAttrNumeric();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBoxRule());
            					}
            					set(
            						current,
            						"height",
            						lv_height_3_0,
            						"org.xtext.example.mydsl4.MyDsl.URDFAttrNumeric");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,41,FOLLOW_15); 

            			newLeafNode(otherlv_4, grammarAccess.getBoxAccess().getLengthKeyword_4());
            		
            // InternalMyDsl.g:1398:3: ( (lv_length_5_0= ruleURDFAttrNumeric ) )
            // InternalMyDsl.g:1399:4: (lv_length_5_0= ruleURDFAttrNumeric )
            {
            // InternalMyDsl.g:1399:4: (lv_length_5_0= ruleURDFAttrNumeric )
            // InternalMyDsl.g:1400:5: lv_length_5_0= ruleURDFAttrNumeric
            {

            					newCompositeNode(grammarAccess.getBoxAccess().getLengthURDFAttrNumericParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_39);
            lv_length_5_0=ruleURDFAttrNumeric();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBoxRule());
            					}
            					set(
            						current,
            						"length",
            						lv_length_5_0,
            						"org.xtext.example.mydsl4.MyDsl.URDFAttrNumeric");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,42,FOLLOW_15); 

            			newLeafNode(otherlv_6, grammarAccess.getBoxAccess().getWidthKeyword_6());
            		
            // InternalMyDsl.g:1421:3: ( (lv_width_7_0= ruleURDFAttrNumeric ) )
            // InternalMyDsl.g:1422:4: (lv_width_7_0= ruleURDFAttrNumeric )
            {
            // InternalMyDsl.g:1422:4: (lv_width_7_0= ruleURDFAttrNumeric )
            // InternalMyDsl.g:1423:5: lv_width_7_0= ruleURDFAttrNumeric
            {

            					newCompositeNode(grammarAccess.getBoxAccess().getWidthURDFAttrNumericParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_2);
            lv_width_7_0=ruleURDFAttrNumeric();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBoxRule());
            					}
            					set(
            						current,
            						"width",
            						lv_width_7_0,
            						"org.xtext.example.mydsl4.MyDsl.URDFAttrNumeric");
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
    // $ANTLR end "ruleBox"


    // $ANTLR start "entryRuleCylinder"
    // InternalMyDsl.g:1444:1: entryRuleCylinder returns [EObject current=null] : iv_ruleCylinder= ruleCylinder EOF ;
    public final EObject entryRuleCylinder() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCylinder = null;


        try {
            // InternalMyDsl.g:1444:49: (iv_ruleCylinder= ruleCylinder EOF )
            // InternalMyDsl.g:1445:2: iv_ruleCylinder= ruleCylinder EOF
            {
             newCompositeNode(grammarAccess.getCylinderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCylinder=ruleCylinder();

            state._fsp--;

             current =iv_ruleCylinder; 
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
    // $ANTLR end "entryRuleCylinder"


    // $ANTLR start "ruleCylinder"
    // InternalMyDsl.g:1451:1: ruleCylinder returns [EObject current=null] : (otherlv_0= 'Cylinder' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'radius' ( (lv_radius_3_0= ruleURDFAttrNumeric ) ) otherlv_4= 'length' ( (lv_length_5_0= ruleURDFAttrNumeric ) ) ) ;
    public final EObject ruleCylinder() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_radius_3_0 = null;

        EObject lv_length_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1457:2: ( (otherlv_0= 'Cylinder' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'radius' ( (lv_radius_3_0= ruleURDFAttrNumeric ) ) otherlv_4= 'length' ( (lv_length_5_0= ruleURDFAttrNumeric ) ) ) )
            // InternalMyDsl.g:1458:2: (otherlv_0= 'Cylinder' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'radius' ( (lv_radius_3_0= ruleURDFAttrNumeric ) ) otherlv_4= 'length' ( (lv_length_5_0= ruleURDFAttrNumeric ) ) )
            {
            // InternalMyDsl.g:1458:2: (otherlv_0= 'Cylinder' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'radius' ( (lv_radius_3_0= ruleURDFAttrNumeric ) ) otherlv_4= 'length' ( (lv_length_5_0= ruleURDFAttrNumeric ) ) )
            // InternalMyDsl.g:1459:3: otherlv_0= 'Cylinder' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'radius' ( (lv_radius_3_0= ruleURDFAttrNumeric ) ) otherlv_4= 'length' ( (lv_length_5_0= ruleURDFAttrNumeric ) )
            {
            otherlv_0=(Token)match(input,43,FOLLOW_40); 

            			newLeafNode(otherlv_0, grammarAccess.getCylinderAccess().getCylinderKeyword_0());
            		
            // InternalMyDsl.g:1463:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMyDsl.g:1464:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalMyDsl.g:1464:4: (lv_name_1_0= RULE_ID )
                    // InternalMyDsl.g:1465:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_41); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getCylinderAccess().getNameIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCylinderRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,44,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getCylinderAccess().getRadiusKeyword_2());
            		
            // InternalMyDsl.g:1485:3: ( (lv_radius_3_0= ruleURDFAttrNumeric ) )
            // InternalMyDsl.g:1486:4: (lv_radius_3_0= ruleURDFAttrNumeric )
            {
            // InternalMyDsl.g:1486:4: (lv_radius_3_0= ruleURDFAttrNumeric )
            // InternalMyDsl.g:1487:5: lv_radius_3_0= ruleURDFAttrNumeric
            {

            					newCompositeNode(grammarAccess.getCylinderAccess().getRadiusURDFAttrNumericParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_38);
            lv_radius_3_0=ruleURDFAttrNumeric();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCylinderRule());
            					}
            					set(
            						current,
            						"radius",
            						lv_radius_3_0,
            						"org.xtext.example.mydsl4.MyDsl.URDFAttrNumeric");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,41,FOLLOW_15); 

            			newLeafNode(otherlv_4, grammarAccess.getCylinderAccess().getLengthKeyword_4());
            		
            // InternalMyDsl.g:1508:3: ( (lv_length_5_0= ruleURDFAttrNumeric ) )
            // InternalMyDsl.g:1509:4: (lv_length_5_0= ruleURDFAttrNumeric )
            {
            // InternalMyDsl.g:1509:4: (lv_length_5_0= ruleURDFAttrNumeric )
            // InternalMyDsl.g:1510:5: lv_length_5_0= ruleURDFAttrNumeric
            {

            					newCompositeNode(grammarAccess.getCylinderAccess().getLengthURDFAttrNumericParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_length_5_0=ruleURDFAttrNumeric();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCylinderRule());
            					}
            					set(
            						current,
            						"length",
            						lv_length_5_0,
            						"org.xtext.example.mydsl4.MyDsl.URDFAttrNumeric");
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
    // $ANTLR end "ruleCylinder"


    // $ANTLR start "entryRuleMesh"
    // InternalMyDsl.g:1531:1: entryRuleMesh returns [EObject current=null] : iv_ruleMesh= ruleMesh EOF ;
    public final EObject entryRuleMesh() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMesh = null;


        try {
            // InternalMyDsl.g:1531:45: (iv_ruleMesh= ruleMesh EOF )
            // InternalMyDsl.g:1532:2: iv_ruleMesh= ruleMesh EOF
            {
             newCompositeNode(grammarAccess.getMeshRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMesh=ruleMesh();

            state._fsp--;

             current =iv_ruleMesh; 
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
    // $ANTLR end "entryRuleMesh"


    // $ANTLR start "ruleMesh"
    // InternalMyDsl.g:1538:1: ruleMesh returns [EObject current=null] : (otherlv_0= 'Mesh' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'pathToFile' ( (lv_pathToFile_3_0= ruleURDFAttrSTRING ) ) ) ;
    public final EObject ruleMesh() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_pathToFile_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1544:2: ( (otherlv_0= 'Mesh' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'pathToFile' ( (lv_pathToFile_3_0= ruleURDFAttrSTRING ) ) ) )
            // InternalMyDsl.g:1545:2: (otherlv_0= 'Mesh' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'pathToFile' ( (lv_pathToFile_3_0= ruleURDFAttrSTRING ) ) )
            {
            // InternalMyDsl.g:1545:2: (otherlv_0= 'Mesh' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'pathToFile' ( (lv_pathToFile_3_0= ruleURDFAttrSTRING ) ) )
            // InternalMyDsl.g:1546:3: otherlv_0= 'Mesh' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'pathToFile' ( (lv_pathToFile_3_0= ruleURDFAttrSTRING ) )
            {
            otherlv_0=(Token)match(input,45,FOLLOW_42); 

            			newLeafNode(otherlv_0, grammarAccess.getMeshAccess().getMeshKeyword_0());
            		
            // InternalMyDsl.g:1550:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMyDsl.g:1551:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalMyDsl.g:1551:4: (lv_name_1_0= RULE_ID )
                    // InternalMyDsl.g:1552:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_43); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getMeshAccess().getNameIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMeshRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,46,FOLLOW_44); 

            			newLeafNode(otherlv_2, grammarAccess.getMeshAccess().getPathToFileKeyword_2());
            		
            // InternalMyDsl.g:1572:3: ( (lv_pathToFile_3_0= ruleURDFAttrSTRING ) )
            // InternalMyDsl.g:1573:4: (lv_pathToFile_3_0= ruleURDFAttrSTRING )
            {
            // InternalMyDsl.g:1573:4: (lv_pathToFile_3_0= ruleURDFAttrSTRING )
            // InternalMyDsl.g:1574:5: lv_pathToFile_3_0= ruleURDFAttrSTRING
            {

            					newCompositeNode(grammarAccess.getMeshAccess().getPathToFileURDFAttrSTRINGParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_pathToFile_3_0=ruleURDFAttrSTRING();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMeshRule());
            					}
            					set(
            						current,
            						"pathToFile",
            						lv_pathToFile_3_0,
            						"org.xtext.example.mydsl4.MyDsl.URDFAttrSTRING");
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
    // $ANTLR end "ruleMesh"


    // $ANTLR start "entryRuleSphere"
    // InternalMyDsl.g:1595:1: entryRuleSphere returns [EObject current=null] : iv_ruleSphere= ruleSphere EOF ;
    public final EObject entryRuleSphere() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSphere = null;


        try {
            // InternalMyDsl.g:1595:47: (iv_ruleSphere= ruleSphere EOF )
            // InternalMyDsl.g:1596:2: iv_ruleSphere= ruleSphere EOF
            {
             newCompositeNode(grammarAccess.getSphereRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSphere=ruleSphere();

            state._fsp--;

             current =iv_ruleSphere; 
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
    // $ANTLR end "entryRuleSphere"


    // $ANTLR start "ruleSphere"
    // InternalMyDsl.g:1602:1: ruleSphere returns [EObject current=null] : (otherlv_0= 'Sphere' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'radius' ( (lv_radius_3_0= ruleURDFAttrNumeric ) ) ) ;
    public final EObject ruleSphere() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_radius_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1608:2: ( (otherlv_0= 'Sphere' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'radius' ( (lv_radius_3_0= ruleURDFAttrNumeric ) ) ) )
            // InternalMyDsl.g:1609:2: (otherlv_0= 'Sphere' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'radius' ( (lv_radius_3_0= ruleURDFAttrNumeric ) ) )
            {
            // InternalMyDsl.g:1609:2: (otherlv_0= 'Sphere' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'radius' ( (lv_radius_3_0= ruleURDFAttrNumeric ) ) )
            // InternalMyDsl.g:1610:3: otherlv_0= 'Sphere' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'radius' ( (lv_radius_3_0= ruleURDFAttrNumeric ) )
            {
            otherlv_0=(Token)match(input,47,FOLLOW_40); 

            			newLeafNode(otherlv_0, grammarAccess.getSphereAccess().getSphereKeyword_0());
            		
            // InternalMyDsl.g:1614:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_ID) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMyDsl.g:1615:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalMyDsl.g:1615:4: (lv_name_1_0= RULE_ID )
                    // InternalMyDsl.g:1616:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_41); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getSphereAccess().getNameIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSphereRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,44,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getSphereAccess().getRadiusKeyword_2());
            		
            // InternalMyDsl.g:1636:3: ( (lv_radius_3_0= ruleURDFAttrNumeric ) )
            // InternalMyDsl.g:1637:4: (lv_radius_3_0= ruleURDFAttrNumeric )
            {
            // InternalMyDsl.g:1637:4: (lv_radius_3_0= ruleURDFAttrNumeric )
            // InternalMyDsl.g:1638:5: lv_radius_3_0= ruleURDFAttrNumeric
            {

            					newCompositeNode(grammarAccess.getSphereAccess().getRadiusURDFAttrNumericParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_radius_3_0=ruleURDFAttrNumeric();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSphereRule());
            					}
            					set(
            						current,
            						"radius",
            						lv_radius_3_0,
            						"org.xtext.example.mydsl4.MyDsl.URDFAttrNumeric");
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
    // $ANTLR end "ruleSphere"


    // $ANTLR start "entryRuleMaterial"
    // InternalMyDsl.g:1659:1: entryRuleMaterial returns [EObject current=null] : iv_ruleMaterial= ruleMaterial EOF ;
    public final EObject entryRuleMaterial() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaterial = null;


        try {
            // InternalMyDsl.g:1659:49: (iv_ruleMaterial= ruleMaterial EOF )
            // InternalMyDsl.g:1660:2: iv_ruleMaterial= ruleMaterial EOF
            {
             newCompositeNode(grammarAccess.getMaterialRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMaterial=ruleMaterial();

            state._fsp--;

             current =iv_ruleMaterial; 
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
    // $ANTLR end "entryRuleMaterial"


    // $ANTLR start "ruleMaterial"
    // InternalMyDsl.g:1666:1: ruleMaterial returns [EObject current=null] : (this_Texture_0= ruleTexture | this_Color_1= ruleColor ) ;
    public final EObject ruleMaterial() throws RecognitionException {
        EObject current = null;

        EObject this_Texture_0 = null;

        EObject this_Color_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1672:2: ( (this_Texture_0= ruleTexture | this_Color_1= ruleColor ) )
            // InternalMyDsl.g:1673:2: (this_Texture_0= ruleTexture | this_Color_1= ruleColor )
            {
            // InternalMyDsl.g:1673:2: (this_Texture_0= ruleTexture | this_Color_1= ruleColor )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==48) ) {
                alt26=1;
            }
            else if ( (LA26_0==49) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalMyDsl.g:1674:3: this_Texture_0= ruleTexture
                    {

                    			newCompositeNode(grammarAccess.getMaterialAccess().getTextureParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Texture_0=ruleTexture();

                    state._fsp--;


                    			current = this_Texture_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1683:3: this_Color_1= ruleColor
                    {

                    			newCompositeNode(grammarAccess.getMaterialAccess().getColorParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Color_1=ruleColor();

                    state._fsp--;


                    			current = this_Color_1;
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
    // $ANTLR end "ruleMaterial"


    // $ANTLR start "entryRuleTexture"
    // InternalMyDsl.g:1695:1: entryRuleTexture returns [EObject current=null] : iv_ruleTexture= ruleTexture EOF ;
    public final EObject entryRuleTexture() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTexture = null;


        try {
            // InternalMyDsl.g:1695:48: (iv_ruleTexture= ruleTexture EOF )
            // InternalMyDsl.g:1696:2: iv_ruleTexture= ruleTexture EOF
            {
             newCompositeNode(grammarAccess.getTextureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTexture=ruleTexture();

            state._fsp--;

             current =iv_ruleTexture; 
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
    // $ANTLR end "entryRuleTexture"


    // $ANTLR start "ruleTexture"
    // InternalMyDsl.g:1702:1: ruleTexture returns [EObject current=null] : (otherlv_0= 'Texture' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'pathToFile' ( (lv_pathToFile_3_0= ruleURDFAttrSTRING ) ) ) ;
    public final EObject ruleTexture() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_pathToFile_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1708:2: ( (otherlv_0= 'Texture' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'pathToFile' ( (lv_pathToFile_3_0= ruleURDFAttrSTRING ) ) ) )
            // InternalMyDsl.g:1709:2: (otherlv_0= 'Texture' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'pathToFile' ( (lv_pathToFile_3_0= ruleURDFAttrSTRING ) ) )
            {
            // InternalMyDsl.g:1709:2: (otherlv_0= 'Texture' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'pathToFile' ( (lv_pathToFile_3_0= ruleURDFAttrSTRING ) ) )
            // InternalMyDsl.g:1710:3: otherlv_0= 'Texture' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'pathToFile' ( (lv_pathToFile_3_0= ruleURDFAttrSTRING ) )
            {
            otherlv_0=(Token)match(input,48,FOLLOW_42); 

            			newLeafNode(otherlv_0, grammarAccess.getTextureAccess().getTextureKeyword_0());
            		
            // InternalMyDsl.g:1714:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ID) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalMyDsl.g:1715:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalMyDsl.g:1715:4: (lv_name_1_0= RULE_ID )
                    // InternalMyDsl.g:1716:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_43); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getTextureAccess().getNameIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTextureRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,46,FOLLOW_44); 

            			newLeafNode(otherlv_2, grammarAccess.getTextureAccess().getPathToFileKeyword_2());
            		
            // InternalMyDsl.g:1736:3: ( (lv_pathToFile_3_0= ruleURDFAttrSTRING ) )
            // InternalMyDsl.g:1737:4: (lv_pathToFile_3_0= ruleURDFAttrSTRING )
            {
            // InternalMyDsl.g:1737:4: (lv_pathToFile_3_0= ruleURDFAttrSTRING )
            // InternalMyDsl.g:1738:5: lv_pathToFile_3_0= ruleURDFAttrSTRING
            {

            					newCompositeNode(grammarAccess.getTextureAccess().getPathToFileURDFAttrSTRINGParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_pathToFile_3_0=ruleURDFAttrSTRING();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTextureRule());
            					}
            					set(
            						current,
            						"pathToFile",
            						lv_pathToFile_3_0,
            						"org.xtext.example.mydsl4.MyDsl.URDFAttrSTRING");
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
    // $ANTLR end "ruleTexture"


    // $ANTLR start "entryRuleColor"
    // InternalMyDsl.g:1759:1: entryRuleColor returns [EObject current=null] : iv_ruleColor= ruleColor EOF ;
    public final EObject entryRuleColor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColor = null;


        try {
            // InternalMyDsl.g:1759:46: (iv_ruleColor= ruleColor EOF )
            // InternalMyDsl.g:1760:2: iv_ruleColor= ruleColor EOF
            {
             newCompositeNode(grammarAccess.getColorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColor=ruleColor();

            state._fsp--;

             current =iv_ruleColor; 
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
    // $ANTLR end "entryRuleColor"


    // $ANTLR start "ruleColor"
    // InternalMyDsl.g:1766:1: ruleColor returns [EObject current=null] : (otherlv_0= 'Color' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'red' ( (lv_red_3_0= ruleURDFAttrFloat ) ) otherlv_4= 'green' ( (lv_green_5_0= ruleURDFAttrFloat ) ) otherlv_6= 'blue' ( (lv_blue_7_0= ruleURDFAttrFloat ) ) otherlv_8= 'alpha' ( (lv_alpha_9_0= ruleURDFAttrFloat ) ) ) ;
    public final EObject ruleColor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_red_3_0 = null;

        EObject lv_green_5_0 = null;

        EObject lv_blue_7_0 = null;

        EObject lv_alpha_9_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1772:2: ( (otherlv_0= 'Color' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'red' ( (lv_red_3_0= ruleURDFAttrFloat ) ) otherlv_4= 'green' ( (lv_green_5_0= ruleURDFAttrFloat ) ) otherlv_6= 'blue' ( (lv_blue_7_0= ruleURDFAttrFloat ) ) otherlv_8= 'alpha' ( (lv_alpha_9_0= ruleURDFAttrFloat ) ) ) )
            // InternalMyDsl.g:1773:2: (otherlv_0= 'Color' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'red' ( (lv_red_3_0= ruleURDFAttrFloat ) ) otherlv_4= 'green' ( (lv_green_5_0= ruleURDFAttrFloat ) ) otherlv_6= 'blue' ( (lv_blue_7_0= ruleURDFAttrFloat ) ) otherlv_8= 'alpha' ( (lv_alpha_9_0= ruleURDFAttrFloat ) ) )
            {
            // InternalMyDsl.g:1773:2: (otherlv_0= 'Color' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'red' ( (lv_red_3_0= ruleURDFAttrFloat ) ) otherlv_4= 'green' ( (lv_green_5_0= ruleURDFAttrFloat ) ) otherlv_6= 'blue' ( (lv_blue_7_0= ruleURDFAttrFloat ) ) otherlv_8= 'alpha' ( (lv_alpha_9_0= ruleURDFAttrFloat ) ) )
            // InternalMyDsl.g:1774:3: otherlv_0= 'Color' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'red' ( (lv_red_3_0= ruleURDFAttrFloat ) ) otherlv_4= 'green' ( (lv_green_5_0= ruleURDFAttrFloat ) ) otherlv_6= 'blue' ( (lv_blue_7_0= ruleURDFAttrFloat ) ) otherlv_8= 'alpha' ( (lv_alpha_9_0= ruleURDFAttrFloat ) )
            {
            otherlv_0=(Token)match(input,49,FOLLOW_45); 

            			newLeafNode(otherlv_0, grammarAccess.getColorAccess().getColorKeyword_0());
            		
            // InternalMyDsl.g:1778:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_ID) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalMyDsl.g:1779:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalMyDsl.g:1779:4: (lv_name_1_0= RULE_ID )
                    // InternalMyDsl.g:1780:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_46); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getColorAccess().getNameIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getColorRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,50,FOLLOW_47); 

            			newLeafNode(otherlv_2, grammarAccess.getColorAccess().getRedKeyword_2());
            		
            // InternalMyDsl.g:1800:3: ( (lv_red_3_0= ruleURDFAttrFloat ) )
            // InternalMyDsl.g:1801:4: (lv_red_3_0= ruleURDFAttrFloat )
            {
            // InternalMyDsl.g:1801:4: (lv_red_3_0= ruleURDFAttrFloat )
            // InternalMyDsl.g:1802:5: lv_red_3_0= ruleURDFAttrFloat
            {

            					newCompositeNode(grammarAccess.getColorAccess().getRedURDFAttrFloatParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_48);
            lv_red_3_0=ruleURDFAttrFloat();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getColorRule());
            					}
            					set(
            						current,
            						"red",
            						lv_red_3_0,
            						"org.xtext.example.mydsl4.MyDsl.URDFAttrFloat");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,51,FOLLOW_47); 

            			newLeafNode(otherlv_4, grammarAccess.getColorAccess().getGreenKeyword_4());
            		
            // InternalMyDsl.g:1823:3: ( (lv_green_5_0= ruleURDFAttrFloat ) )
            // InternalMyDsl.g:1824:4: (lv_green_5_0= ruleURDFAttrFloat )
            {
            // InternalMyDsl.g:1824:4: (lv_green_5_0= ruleURDFAttrFloat )
            // InternalMyDsl.g:1825:5: lv_green_5_0= ruleURDFAttrFloat
            {

            					newCompositeNode(grammarAccess.getColorAccess().getGreenURDFAttrFloatParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_49);
            lv_green_5_0=ruleURDFAttrFloat();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getColorRule());
            					}
            					set(
            						current,
            						"green",
            						lv_green_5_0,
            						"org.xtext.example.mydsl4.MyDsl.URDFAttrFloat");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,52,FOLLOW_47); 

            			newLeafNode(otherlv_6, grammarAccess.getColorAccess().getBlueKeyword_6());
            		
            // InternalMyDsl.g:1846:3: ( (lv_blue_7_0= ruleURDFAttrFloat ) )
            // InternalMyDsl.g:1847:4: (lv_blue_7_0= ruleURDFAttrFloat )
            {
            // InternalMyDsl.g:1847:4: (lv_blue_7_0= ruleURDFAttrFloat )
            // InternalMyDsl.g:1848:5: lv_blue_7_0= ruleURDFAttrFloat
            {

            					newCompositeNode(grammarAccess.getColorAccess().getBlueURDFAttrFloatParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_50);
            lv_blue_7_0=ruleURDFAttrFloat();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getColorRule());
            					}
            					set(
            						current,
            						"blue",
            						lv_blue_7_0,
            						"org.xtext.example.mydsl4.MyDsl.URDFAttrFloat");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,53,FOLLOW_47); 

            			newLeafNode(otherlv_8, grammarAccess.getColorAccess().getAlphaKeyword_8());
            		
            // InternalMyDsl.g:1869:3: ( (lv_alpha_9_0= ruleURDFAttrFloat ) )
            // InternalMyDsl.g:1870:4: (lv_alpha_9_0= ruleURDFAttrFloat )
            {
            // InternalMyDsl.g:1870:4: (lv_alpha_9_0= ruleURDFAttrFloat )
            // InternalMyDsl.g:1871:5: lv_alpha_9_0= ruleURDFAttrFloat
            {

            					newCompositeNode(grammarAccess.getColorAccess().getAlphaURDFAttrFloatParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_2);
            lv_alpha_9_0=ruleURDFAttrFloat();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getColorRule());
            					}
            					set(
            						current,
            						"alpha",
            						lv_alpha_9_0,
            						"org.xtext.example.mydsl4.MyDsl.URDFAttrFloat");
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
    // $ANTLR end "ruleColor"


    // $ANTLR start "entryRuleJoint"
    // InternalMyDsl.g:1892:1: entryRuleJoint returns [EObject current=null] : iv_ruleJoint= ruleJoint EOF ;
    public final EObject entryRuleJoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoint = null;


        try {
            // InternalMyDsl.g:1892:46: (iv_ruleJoint= ruleJoint EOF )
            // InternalMyDsl.g:1893:2: iv_ruleJoint= ruleJoint EOF
            {
             newCompositeNode(grammarAccess.getJointRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJoint=ruleJoint();

            state._fsp--;

             current =iv_ruleJoint; 
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
    // $ANTLR end "entryRuleJoint"


    // $ANTLR start "ruleJoint"
    // InternalMyDsl.g:1899:1: ruleJoint returns [EObject current=null] : (otherlv_0= 'Joint' ( (lv_name_1_0= RULE_ID ) ) ( ( (otherlv_2= 'def' otherlv_3= 'ChildOf' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'ParentOf' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'Type' ( (lv_type_8_0= ruleJointType ) ) ) ( ( (lv_origin_9_0= ruleOrigin ) ) | ( (lv_axis_10_0= ruleAxis ) ) | ( (lv_limit_11_0= ruleLimit ) ) | ( (lv_calibration_12_0= ruleCalibration ) ) | ( (lv_dynamics_13_0= ruleDynamics ) ) | ( (lv_safetycontroller_14_0= ruleSafetyController ) ) )* ) | (otherlv_15= 'reuse' ( (otherlv_16= RULE_ID ) ) ( (lv_reuse_17_0= ruleReuse ) ) ) )? ) ;
    public final EObject ruleJoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Enumerator lv_type_8_0 = null;

        EObject lv_origin_9_0 = null;

        EObject lv_axis_10_0 = null;

        EObject lv_limit_11_0 = null;

        EObject lv_calibration_12_0 = null;

        EObject lv_dynamics_13_0 = null;

        EObject lv_safetycontroller_14_0 = null;

        EObject lv_reuse_17_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1905:2: ( (otherlv_0= 'Joint' ( (lv_name_1_0= RULE_ID ) ) ( ( (otherlv_2= 'def' otherlv_3= 'ChildOf' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'ParentOf' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'Type' ( (lv_type_8_0= ruleJointType ) ) ) ( ( (lv_origin_9_0= ruleOrigin ) ) | ( (lv_axis_10_0= ruleAxis ) ) | ( (lv_limit_11_0= ruleLimit ) ) | ( (lv_calibration_12_0= ruleCalibration ) ) | ( (lv_dynamics_13_0= ruleDynamics ) ) | ( (lv_safetycontroller_14_0= ruleSafetyController ) ) )* ) | (otherlv_15= 'reuse' ( (otherlv_16= RULE_ID ) ) ( (lv_reuse_17_0= ruleReuse ) ) ) )? ) )
            // InternalMyDsl.g:1906:2: (otherlv_0= 'Joint' ( (lv_name_1_0= RULE_ID ) ) ( ( (otherlv_2= 'def' otherlv_3= 'ChildOf' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'ParentOf' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'Type' ( (lv_type_8_0= ruleJointType ) ) ) ( ( (lv_origin_9_0= ruleOrigin ) ) | ( (lv_axis_10_0= ruleAxis ) ) | ( (lv_limit_11_0= ruleLimit ) ) | ( (lv_calibration_12_0= ruleCalibration ) ) | ( (lv_dynamics_13_0= ruleDynamics ) ) | ( (lv_safetycontroller_14_0= ruleSafetyController ) ) )* ) | (otherlv_15= 'reuse' ( (otherlv_16= RULE_ID ) ) ( (lv_reuse_17_0= ruleReuse ) ) ) )? )
            {
            // InternalMyDsl.g:1906:2: (otherlv_0= 'Joint' ( (lv_name_1_0= RULE_ID ) ) ( ( (otherlv_2= 'def' otherlv_3= 'ChildOf' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'ParentOf' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'Type' ( (lv_type_8_0= ruleJointType ) ) ) ( ( (lv_origin_9_0= ruleOrigin ) ) | ( (lv_axis_10_0= ruleAxis ) ) | ( (lv_limit_11_0= ruleLimit ) ) | ( (lv_calibration_12_0= ruleCalibration ) ) | ( (lv_dynamics_13_0= ruleDynamics ) ) | ( (lv_safetycontroller_14_0= ruleSafetyController ) ) )* ) | (otherlv_15= 'reuse' ( (otherlv_16= RULE_ID ) ) ( (lv_reuse_17_0= ruleReuse ) ) ) )? )
            // InternalMyDsl.g:1907:3: otherlv_0= 'Joint' ( (lv_name_1_0= RULE_ID ) ) ( ( (otherlv_2= 'def' otherlv_3= 'ChildOf' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'ParentOf' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'Type' ( (lv_type_8_0= ruleJointType ) ) ) ( ( (lv_origin_9_0= ruleOrigin ) ) | ( (lv_axis_10_0= ruleAxis ) ) | ( (lv_limit_11_0= ruleLimit ) ) | ( (lv_calibration_12_0= ruleCalibration ) ) | ( (lv_dynamics_13_0= ruleDynamics ) ) | ( (lv_safetycontroller_14_0= ruleSafetyController ) ) )* ) | (otherlv_15= 'reuse' ( (otherlv_16= RULE_ID ) ) ( (lv_reuse_17_0= ruleReuse ) ) ) )?
            {
            otherlv_0=(Token)match(input,54,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getJointAccess().getJointKeyword_0());
            		
            // InternalMyDsl.g:1911:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:1912:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:1912:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:1913:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getJointAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJointRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMyDsl.g:1929:3: ( ( (otherlv_2= 'def' otherlv_3= 'ChildOf' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'ParentOf' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'Type' ( (lv_type_8_0= ruleJointType ) ) ) ( ( (lv_origin_9_0= ruleOrigin ) ) | ( (lv_axis_10_0= ruleAxis ) ) | ( (lv_limit_11_0= ruleLimit ) ) | ( (lv_calibration_12_0= ruleCalibration ) ) | ( (lv_dynamics_13_0= ruleDynamics ) ) | ( (lv_safetycontroller_14_0= ruleSafetyController ) ) )* ) | (otherlv_15= 'reuse' ( (otherlv_16= RULE_ID ) ) ( (lv_reuse_17_0= ruleReuse ) ) ) )?
            int alt30=3;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==13) ) {
                alt30=1;
            }
            else if ( (LA30_0==14) ) {
                alt30=2;
            }
            switch (alt30) {
                case 1 :
                    // InternalMyDsl.g:1930:4: ( (otherlv_2= 'def' otherlv_3= 'ChildOf' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'ParentOf' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'Type' ( (lv_type_8_0= ruleJointType ) ) ) ( ( (lv_origin_9_0= ruleOrigin ) ) | ( (lv_axis_10_0= ruleAxis ) ) | ( (lv_limit_11_0= ruleLimit ) ) | ( (lv_calibration_12_0= ruleCalibration ) ) | ( (lv_dynamics_13_0= ruleDynamics ) ) | ( (lv_safetycontroller_14_0= ruleSafetyController ) ) )* )
                    {
                    // InternalMyDsl.g:1930:4: ( (otherlv_2= 'def' otherlv_3= 'ChildOf' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'ParentOf' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'Type' ( (lv_type_8_0= ruleJointType ) ) ) ( ( (lv_origin_9_0= ruleOrigin ) ) | ( (lv_axis_10_0= ruleAxis ) ) | ( (lv_limit_11_0= ruleLimit ) ) | ( (lv_calibration_12_0= ruleCalibration ) ) | ( (lv_dynamics_13_0= ruleDynamics ) ) | ( (lv_safetycontroller_14_0= ruleSafetyController ) ) )* )
                    // InternalMyDsl.g:1931:5: (otherlv_2= 'def' otherlv_3= 'ChildOf' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'ParentOf' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'Type' ( (lv_type_8_0= ruleJointType ) ) ) ( ( (lv_origin_9_0= ruleOrigin ) ) | ( (lv_axis_10_0= ruleAxis ) ) | ( (lv_limit_11_0= ruleLimit ) ) | ( (lv_calibration_12_0= ruleCalibration ) ) | ( (lv_dynamics_13_0= ruleDynamics ) ) | ( (lv_safetycontroller_14_0= ruleSafetyController ) ) )*
                    {
                    // InternalMyDsl.g:1931:5: (otherlv_2= 'def' otherlv_3= 'ChildOf' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'ParentOf' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'Type' ( (lv_type_8_0= ruleJointType ) ) )
                    // InternalMyDsl.g:1932:6: otherlv_2= 'def' otherlv_3= 'ChildOf' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'ParentOf' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'Type' ( (lv_type_8_0= ruleJointType ) )
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_51); 

                    						newLeafNode(otherlv_2, grammarAccess.getJointAccess().getDefKeyword_2_0_0_0());
                    					
                    otherlv_3=(Token)match(input,55,FOLLOW_3); 

                    						newLeafNode(otherlv_3, grammarAccess.getJointAccess().getChildOfKeyword_2_0_0_1());
                    					
                    // InternalMyDsl.g:1940:6: ( (otherlv_4= RULE_ID ) )
                    // InternalMyDsl.g:1941:7: (otherlv_4= RULE_ID )
                    {
                    // InternalMyDsl.g:1941:7: (otherlv_4= RULE_ID )
                    // InternalMyDsl.g:1942:8: otherlv_4= RULE_ID
                    {

                    								if (current==null) {
                    									current = createModelElement(grammarAccess.getJointRule());
                    								}
                    							
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_52); 

                    								newLeafNode(otherlv_4, grammarAccess.getJointAccess().getChildOfLinkCrossReference_2_0_0_2_0());
                    							

                    }


                    }

                    otherlv_5=(Token)match(input,56,FOLLOW_3); 

                    						newLeafNode(otherlv_5, grammarAccess.getJointAccess().getParentOfKeyword_2_0_0_3());
                    					
                    // InternalMyDsl.g:1957:6: ( (otherlv_6= RULE_ID ) )
                    // InternalMyDsl.g:1958:7: (otherlv_6= RULE_ID )
                    {
                    // InternalMyDsl.g:1958:7: (otherlv_6= RULE_ID )
                    // InternalMyDsl.g:1959:8: otherlv_6= RULE_ID
                    {

                    								if (current==null) {
                    									current = createModelElement(grammarAccess.getJointRule());
                    								}
                    							
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_53); 

                    								newLeafNode(otherlv_6, grammarAccess.getJointAccess().getParentOfLinkCrossReference_2_0_0_4_0());
                    							

                    }


                    }

                    otherlv_7=(Token)match(input,57,FOLLOW_54); 

                    						newLeafNode(otherlv_7, grammarAccess.getJointAccess().getTypeKeyword_2_0_0_5());
                    					
                    // InternalMyDsl.g:1974:6: ( (lv_type_8_0= ruleJointType ) )
                    // InternalMyDsl.g:1975:7: (lv_type_8_0= ruleJointType )
                    {
                    // InternalMyDsl.g:1975:7: (lv_type_8_0= ruleJointType )
                    // InternalMyDsl.g:1976:8: lv_type_8_0= ruleJointType
                    {

                    								newCompositeNode(grammarAccess.getJointAccess().getTypeJointTypeEnumRuleCall_2_0_0_6_0());
                    							
                    pushFollow(FOLLOW_55);
                    lv_type_8_0=ruleJointType();

                    state._fsp--;


                    								if (current==null) {
                    									current = createModelElementForParent(grammarAccess.getJointRule());
                    								}
                    								set(
                    									current,
                    									"type",
                    									lv_type_8_0,
                    									"org.xtext.example.mydsl4.MyDsl.JointType");
                    								afterParserOrEnumRuleCall();
                    							

                    }


                    }


                    }

                    // InternalMyDsl.g:1994:5: ( ( (lv_origin_9_0= ruleOrigin ) ) | ( (lv_axis_10_0= ruleAxis ) ) | ( (lv_limit_11_0= ruleLimit ) ) | ( (lv_calibration_12_0= ruleCalibration ) ) | ( (lv_dynamics_13_0= ruleDynamics ) ) | ( (lv_safetycontroller_14_0= ruleSafetyController ) ) )*
                    loop29:
                    do {
                        int alt29=7;
                        switch ( input.LA(1) ) {
                        case 29:
                            {
                            alt29=1;
                            }
                            break;
                        case 58:
                            {
                            alt29=2;
                            }
                            break;
                        case 59:
                            {
                            alt29=3;
                            }
                            break;
                        case 64:
                            {
                            alt29=4;
                            }
                            break;
                        case 67:
                            {
                            alt29=5;
                            }
                            break;
                        case 70:
                            {
                            alt29=6;
                            }
                            break;

                        }

                        switch (alt29) {
                    	case 1 :
                    	    // InternalMyDsl.g:1995:6: ( (lv_origin_9_0= ruleOrigin ) )
                    	    {
                    	    // InternalMyDsl.g:1995:6: ( (lv_origin_9_0= ruleOrigin ) )
                    	    // InternalMyDsl.g:1996:7: (lv_origin_9_0= ruleOrigin )
                    	    {
                    	    // InternalMyDsl.g:1996:7: (lv_origin_9_0= ruleOrigin )
                    	    // InternalMyDsl.g:1997:8: lv_origin_9_0= ruleOrigin
                    	    {

                    	    								newCompositeNode(grammarAccess.getJointAccess().getOriginOriginParserRuleCall_2_0_1_0_0());
                    	    							
                    	    pushFollow(FOLLOW_55);
                    	    lv_origin_9_0=ruleOrigin();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getJointRule());
                    	    								}
                    	    								set(
                    	    									current,
                    	    									"origin",
                    	    									lv_origin_9_0,
                    	    									"org.xtext.example.mydsl4.MyDsl.Origin");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDsl.g:2015:6: ( (lv_axis_10_0= ruleAxis ) )
                    	    {
                    	    // InternalMyDsl.g:2015:6: ( (lv_axis_10_0= ruleAxis ) )
                    	    // InternalMyDsl.g:2016:7: (lv_axis_10_0= ruleAxis )
                    	    {
                    	    // InternalMyDsl.g:2016:7: (lv_axis_10_0= ruleAxis )
                    	    // InternalMyDsl.g:2017:8: lv_axis_10_0= ruleAxis
                    	    {

                    	    								newCompositeNode(grammarAccess.getJointAccess().getAxisAxisParserRuleCall_2_0_1_1_0());
                    	    							
                    	    pushFollow(FOLLOW_55);
                    	    lv_axis_10_0=ruleAxis();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getJointRule());
                    	    								}
                    	    								set(
                    	    									current,
                    	    									"axis",
                    	    									lv_axis_10_0,
                    	    									"org.xtext.example.mydsl4.MyDsl.Axis");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 3 :
                    	    // InternalMyDsl.g:2035:6: ( (lv_limit_11_0= ruleLimit ) )
                    	    {
                    	    // InternalMyDsl.g:2035:6: ( (lv_limit_11_0= ruleLimit ) )
                    	    // InternalMyDsl.g:2036:7: (lv_limit_11_0= ruleLimit )
                    	    {
                    	    // InternalMyDsl.g:2036:7: (lv_limit_11_0= ruleLimit )
                    	    // InternalMyDsl.g:2037:8: lv_limit_11_0= ruleLimit
                    	    {

                    	    								newCompositeNode(grammarAccess.getJointAccess().getLimitLimitParserRuleCall_2_0_1_2_0());
                    	    							
                    	    pushFollow(FOLLOW_55);
                    	    lv_limit_11_0=ruleLimit();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getJointRule());
                    	    								}
                    	    								set(
                    	    									current,
                    	    									"limit",
                    	    									lv_limit_11_0,
                    	    									"org.xtext.example.mydsl4.MyDsl.Limit");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 4 :
                    	    // InternalMyDsl.g:2055:6: ( (lv_calibration_12_0= ruleCalibration ) )
                    	    {
                    	    // InternalMyDsl.g:2055:6: ( (lv_calibration_12_0= ruleCalibration ) )
                    	    // InternalMyDsl.g:2056:7: (lv_calibration_12_0= ruleCalibration )
                    	    {
                    	    // InternalMyDsl.g:2056:7: (lv_calibration_12_0= ruleCalibration )
                    	    // InternalMyDsl.g:2057:8: lv_calibration_12_0= ruleCalibration
                    	    {

                    	    								newCompositeNode(grammarAccess.getJointAccess().getCalibrationCalibrationParserRuleCall_2_0_1_3_0());
                    	    							
                    	    pushFollow(FOLLOW_55);
                    	    lv_calibration_12_0=ruleCalibration();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getJointRule());
                    	    								}
                    	    								set(
                    	    									current,
                    	    									"calibration",
                    	    									lv_calibration_12_0,
                    	    									"org.xtext.example.mydsl4.MyDsl.Calibration");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 5 :
                    	    // InternalMyDsl.g:2075:6: ( (lv_dynamics_13_0= ruleDynamics ) )
                    	    {
                    	    // InternalMyDsl.g:2075:6: ( (lv_dynamics_13_0= ruleDynamics ) )
                    	    // InternalMyDsl.g:2076:7: (lv_dynamics_13_0= ruleDynamics )
                    	    {
                    	    // InternalMyDsl.g:2076:7: (lv_dynamics_13_0= ruleDynamics )
                    	    // InternalMyDsl.g:2077:8: lv_dynamics_13_0= ruleDynamics
                    	    {

                    	    								newCompositeNode(grammarAccess.getJointAccess().getDynamicsDynamicsParserRuleCall_2_0_1_4_0());
                    	    							
                    	    pushFollow(FOLLOW_55);
                    	    lv_dynamics_13_0=ruleDynamics();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getJointRule());
                    	    								}
                    	    								set(
                    	    									current,
                    	    									"dynamics",
                    	    									lv_dynamics_13_0,
                    	    									"org.xtext.example.mydsl4.MyDsl.Dynamics");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 6 :
                    	    // InternalMyDsl.g:2095:6: ( (lv_safetycontroller_14_0= ruleSafetyController ) )
                    	    {
                    	    // InternalMyDsl.g:2095:6: ( (lv_safetycontroller_14_0= ruleSafetyController ) )
                    	    // InternalMyDsl.g:2096:7: (lv_safetycontroller_14_0= ruleSafetyController )
                    	    {
                    	    // InternalMyDsl.g:2096:7: (lv_safetycontroller_14_0= ruleSafetyController )
                    	    // InternalMyDsl.g:2097:8: lv_safetycontroller_14_0= ruleSafetyController
                    	    {

                    	    								newCompositeNode(grammarAccess.getJointAccess().getSafetycontrollerSafetyControllerParserRuleCall_2_0_1_5_0());
                    	    							
                    	    pushFollow(FOLLOW_55);
                    	    lv_safetycontroller_14_0=ruleSafetyController();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getJointRule());
                    	    								}
                    	    								set(
                    	    									current,
                    	    									"safetycontroller",
                    	    									lv_safetycontroller_14_0,
                    	    									"org.xtext.example.mydsl4.MyDsl.SafetyController");
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


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2117:4: (otherlv_15= 'reuse' ( (otherlv_16= RULE_ID ) ) ( (lv_reuse_17_0= ruleReuse ) ) )
                    {
                    // InternalMyDsl.g:2117:4: (otherlv_15= 'reuse' ( (otherlv_16= RULE_ID ) ) ( (lv_reuse_17_0= ruleReuse ) ) )
                    // InternalMyDsl.g:2118:5: otherlv_15= 'reuse' ( (otherlv_16= RULE_ID ) ) ( (lv_reuse_17_0= ruleReuse ) )
                    {
                    otherlv_15=(Token)match(input,14,FOLLOW_3); 

                    					newLeafNode(otherlv_15, grammarAccess.getJointAccess().getReuseKeyword_2_1_0());
                    				
                    // InternalMyDsl.g:2122:5: ( (otherlv_16= RULE_ID ) )
                    // InternalMyDsl.g:2123:6: (otherlv_16= RULE_ID )
                    {
                    // InternalMyDsl.g:2123:6: (otherlv_16= RULE_ID )
                    // InternalMyDsl.g:2124:7: otherlv_16= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getJointRule());
                    							}
                    						
                    otherlv_16=(Token)match(input,RULE_ID,FOLLOW_7); 

                    							newLeafNode(otherlv_16, grammarAccess.getJointAccess().getIsReuseOfJointCrossReference_2_1_1_0());
                    						

                    }


                    }

                    // InternalMyDsl.g:2135:5: ( (lv_reuse_17_0= ruleReuse ) )
                    // InternalMyDsl.g:2136:6: (lv_reuse_17_0= ruleReuse )
                    {
                    // InternalMyDsl.g:2136:6: (lv_reuse_17_0= ruleReuse )
                    // InternalMyDsl.g:2137:7: lv_reuse_17_0= ruleReuse
                    {

                    							newCompositeNode(grammarAccess.getJointAccess().getReuseReuseParserRuleCall_2_1_2_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_reuse_17_0=ruleReuse();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getJointRule());
                    							}
                    							set(
                    								current,
                    								"reuse",
                    								lv_reuse_17_0,
                    								"org.xtext.example.mydsl4.MyDsl.Reuse");
                    							afterParserOrEnumRuleCall();
                    						

                    }


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
    // $ANTLR end "ruleJoint"


    // $ANTLR start "entryRuleAxis"
    // InternalMyDsl.g:2160:1: entryRuleAxis returns [EObject current=null] : iv_ruleAxis= ruleAxis EOF ;
    public final EObject entryRuleAxis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAxis = null;


        try {
            // InternalMyDsl.g:2160:45: (iv_ruleAxis= ruleAxis EOF )
            // InternalMyDsl.g:2161:2: iv_ruleAxis= ruleAxis EOF
            {
             newCompositeNode(grammarAccess.getAxisRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAxis=ruleAxis();

            state._fsp--;

             current =iv_ruleAxis; 
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
    // $ANTLR end "entryRuleAxis"


    // $ANTLR start "ruleAxis"
    // InternalMyDsl.g:2167:1: ruleAxis returns [EObject current=null] : (otherlv_0= 'Axis' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'x' ( (lv_x_3_0= ruleURDFAttrINT ) ) otherlv_4= 'y' ( (lv_y_5_0= ruleURDFAttrINT ) ) otherlv_6= 'z' ( (lv_z_7_0= ruleURDFAttrINT ) ) ) ;
    public final EObject ruleAxis() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_x_3_0 = null;

        EObject lv_y_5_0 = null;

        EObject lv_z_7_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2173:2: ( (otherlv_0= 'Axis' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'x' ( (lv_x_3_0= ruleURDFAttrINT ) ) otherlv_4= 'y' ( (lv_y_5_0= ruleURDFAttrINT ) ) otherlv_6= 'z' ( (lv_z_7_0= ruleURDFAttrINT ) ) ) )
            // InternalMyDsl.g:2174:2: (otherlv_0= 'Axis' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'x' ( (lv_x_3_0= ruleURDFAttrINT ) ) otherlv_4= 'y' ( (lv_y_5_0= ruleURDFAttrINT ) ) otherlv_6= 'z' ( (lv_z_7_0= ruleURDFAttrINT ) ) )
            {
            // InternalMyDsl.g:2174:2: (otherlv_0= 'Axis' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'x' ( (lv_x_3_0= ruleURDFAttrINT ) ) otherlv_4= 'y' ( (lv_y_5_0= ruleURDFAttrINT ) ) otherlv_6= 'z' ( (lv_z_7_0= ruleURDFAttrINT ) ) )
            // InternalMyDsl.g:2175:3: otherlv_0= 'Axis' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'x' ( (lv_x_3_0= ruleURDFAttrINT ) ) otherlv_4= 'y' ( (lv_y_5_0= ruleURDFAttrINT ) ) otherlv_6= 'z' ( (lv_z_7_0= ruleURDFAttrINT ) )
            {
            otherlv_0=(Token)match(input,58,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getAxisAccess().getAxisKeyword_0());
            		
            // InternalMyDsl.g:2179:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_ID) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalMyDsl.g:2180:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalMyDsl.g:2180:4: (lv_name_1_0= RULE_ID )
                    // InternalMyDsl.g:2181:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_27); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getAxisAccess().getNameIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAxisRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,30,FOLLOW_47); 

            			newLeafNode(otherlv_2, grammarAccess.getAxisAccess().getXKeyword_2());
            		
            // InternalMyDsl.g:2201:3: ( (lv_x_3_0= ruleURDFAttrINT ) )
            // InternalMyDsl.g:2202:4: (lv_x_3_0= ruleURDFAttrINT )
            {
            // InternalMyDsl.g:2202:4: (lv_x_3_0= ruleURDFAttrINT )
            // InternalMyDsl.g:2203:5: lv_x_3_0= ruleURDFAttrINT
            {

            					newCompositeNode(grammarAccess.getAxisAccess().getXURDFAttrINTParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_28);
            lv_x_3_0=ruleURDFAttrINT();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAxisRule());
            					}
            					set(
            						current,
            						"x",
            						lv_x_3_0,
            						"org.xtext.example.mydsl4.MyDsl.URDFAttrINT");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,31,FOLLOW_47); 

            			newLeafNode(otherlv_4, grammarAccess.getAxisAccess().getYKeyword_4());
            		
            // InternalMyDsl.g:2224:3: ( (lv_y_5_0= ruleURDFAttrINT ) )
            // InternalMyDsl.g:2225:4: (lv_y_5_0= ruleURDFAttrINT )
            {
            // InternalMyDsl.g:2225:4: (lv_y_5_0= ruleURDFAttrINT )
            // InternalMyDsl.g:2226:5: lv_y_5_0= ruleURDFAttrINT
            {

            					newCompositeNode(grammarAccess.getAxisAccess().getYURDFAttrINTParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_29);
            lv_y_5_0=ruleURDFAttrINT();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAxisRule());
            					}
            					set(
            						current,
            						"y",
            						lv_y_5_0,
            						"org.xtext.example.mydsl4.MyDsl.URDFAttrINT");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,32,FOLLOW_47); 

            			newLeafNode(otherlv_6, grammarAccess.getAxisAccess().getZKeyword_6());
            		
            // InternalMyDsl.g:2247:3: ( (lv_z_7_0= ruleURDFAttrINT ) )
            // InternalMyDsl.g:2248:4: (lv_z_7_0= ruleURDFAttrINT )
            {
            // InternalMyDsl.g:2248:4: (lv_z_7_0= ruleURDFAttrINT )
            // InternalMyDsl.g:2249:5: lv_z_7_0= ruleURDFAttrINT
            {

            					newCompositeNode(grammarAccess.getAxisAccess().getZURDFAttrINTParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_2);
            lv_z_7_0=ruleURDFAttrINT();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAxisRule());
            					}
            					set(
            						current,
            						"z",
            						lv_z_7_0,
            						"org.xtext.example.mydsl4.MyDsl.URDFAttrINT");
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
    // $ANTLR end "ruleAxis"


    // $ANTLR start "entryRuleLimit"
    // InternalMyDsl.g:2270:1: entryRuleLimit returns [EObject current=null] : iv_ruleLimit= ruleLimit EOF ;
    public final EObject entryRuleLimit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLimit = null;


        try {
            // InternalMyDsl.g:2270:46: (iv_ruleLimit= ruleLimit EOF )
            // InternalMyDsl.g:2271:2: iv_ruleLimit= ruleLimit EOF
            {
             newCompositeNode(grammarAccess.getLimitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLimit=ruleLimit();

            state._fsp--;

             current =iv_ruleLimit; 
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
    // $ANTLR end "entryRuleLimit"


    // $ANTLR start "ruleLimit"
    // InternalMyDsl.g:2277:1: ruleLimit returns [EObject current=null] : (otherlv_0= 'Limit' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'effort' ( (lv_effort_3_0= ruleURDFAttrSignedNumeric ) ) otherlv_4= 'velocity' ( (lv_velocity_5_0= ruleURDFAttrSignedNumeric ) ) otherlv_6= 'lower' ( (lv_lower_7_0= ruleURDFAttrSignedNumeric ) )? otherlv_8= 'upper' ( (lv_upper_9_0= ruleURDFAttrSignedNumeric ) )? ) ;
    public final EObject ruleLimit() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_effort_3_0 = null;

        EObject lv_velocity_5_0 = null;

        EObject lv_lower_7_0 = null;

        EObject lv_upper_9_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2283:2: ( (otherlv_0= 'Limit' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'effort' ( (lv_effort_3_0= ruleURDFAttrSignedNumeric ) ) otherlv_4= 'velocity' ( (lv_velocity_5_0= ruleURDFAttrSignedNumeric ) ) otherlv_6= 'lower' ( (lv_lower_7_0= ruleURDFAttrSignedNumeric ) )? otherlv_8= 'upper' ( (lv_upper_9_0= ruleURDFAttrSignedNumeric ) )? ) )
            // InternalMyDsl.g:2284:2: (otherlv_0= 'Limit' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'effort' ( (lv_effort_3_0= ruleURDFAttrSignedNumeric ) ) otherlv_4= 'velocity' ( (lv_velocity_5_0= ruleURDFAttrSignedNumeric ) ) otherlv_6= 'lower' ( (lv_lower_7_0= ruleURDFAttrSignedNumeric ) )? otherlv_8= 'upper' ( (lv_upper_9_0= ruleURDFAttrSignedNumeric ) )? )
            {
            // InternalMyDsl.g:2284:2: (otherlv_0= 'Limit' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'effort' ( (lv_effort_3_0= ruleURDFAttrSignedNumeric ) ) otherlv_4= 'velocity' ( (lv_velocity_5_0= ruleURDFAttrSignedNumeric ) ) otherlv_6= 'lower' ( (lv_lower_7_0= ruleURDFAttrSignedNumeric ) )? otherlv_8= 'upper' ( (lv_upper_9_0= ruleURDFAttrSignedNumeric ) )? )
            // InternalMyDsl.g:2285:3: otherlv_0= 'Limit' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'effort' ( (lv_effort_3_0= ruleURDFAttrSignedNumeric ) ) otherlv_4= 'velocity' ( (lv_velocity_5_0= ruleURDFAttrSignedNumeric ) ) otherlv_6= 'lower' ( (lv_lower_7_0= ruleURDFAttrSignedNumeric ) )? otherlv_8= 'upper' ( (lv_upper_9_0= ruleURDFAttrSignedNumeric ) )?
            {
            otherlv_0=(Token)match(input,59,FOLLOW_56); 

            			newLeafNode(otherlv_0, grammarAccess.getLimitAccess().getLimitKeyword_0());
            		
            // InternalMyDsl.g:2289:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_ID) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalMyDsl.g:2290:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalMyDsl.g:2290:4: (lv_name_1_0= RULE_ID )
                    // InternalMyDsl.g:2291:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_57); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getLimitAccess().getNameIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLimitRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,60,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getLimitAccess().getEffortKeyword_2());
            		
            // InternalMyDsl.g:2311:3: ( (lv_effort_3_0= ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:2312:4: (lv_effort_3_0= ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:2312:4: (lv_effort_3_0= ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:2313:5: lv_effort_3_0= ruleURDFAttrSignedNumeric
            {

            					newCompositeNode(grammarAccess.getLimitAccess().getEffortURDFAttrSignedNumericParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_58);
            lv_effort_3_0=ruleURDFAttrSignedNumeric();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLimitRule());
            					}
            					set(
            						current,
            						"effort",
            						lv_effort_3_0,
            						"org.xtext.example.mydsl4.MyDsl.URDFAttrSignedNumeric");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,61,FOLLOW_15); 

            			newLeafNode(otherlv_4, grammarAccess.getLimitAccess().getVelocityKeyword_4());
            		
            // InternalMyDsl.g:2334:3: ( (lv_velocity_5_0= ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:2335:4: (lv_velocity_5_0= ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:2335:4: (lv_velocity_5_0= ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:2336:5: lv_velocity_5_0= ruleURDFAttrSignedNumeric
            {

            					newCompositeNode(grammarAccess.getLimitAccess().getVelocityURDFAttrSignedNumericParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_59);
            lv_velocity_5_0=ruleURDFAttrSignedNumeric();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLimitRule());
            					}
            					set(
            						current,
            						"velocity",
            						lv_velocity_5_0,
            						"org.xtext.example.mydsl4.MyDsl.URDFAttrSignedNumeric");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,62,FOLLOW_60); 

            			newLeafNode(otherlv_6, grammarAccess.getLimitAccess().getLowerKeyword_6());
            		
            // InternalMyDsl.g:2357:3: ( (lv_lower_7_0= ruleURDFAttrSignedNumeric ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_INT||LA33_0==77) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalMyDsl.g:2358:4: (lv_lower_7_0= ruleURDFAttrSignedNumeric )
                    {
                    // InternalMyDsl.g:2358:4: (lv_lower_7_0= ruleURDFAttrSignedNumeric )
                    // InternalMyDsl.g:2359:5: lv_lower_7_0= ruleURDFAttrSignedNumeric
                    {

                    					newCompositeNode(grammarAccess.getLimitAccess().getLowerURDFAttrSignedNumericParserRuleCall_7_0());
                    				
                    pushFollow(FOLLOW_61);
                    lv_lower_7_0=ruleURDFAttrSignedNumeric();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLimitRule());
                    					}
                    					set(
                    						current,
                    						"lower",
                    						lv_lower_7_0,
                    						"org.xtext.example.mydsl4.MyDsl.URDFAttrSignedNumeric");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,63,FOLLOW_62); 

            			newLeafNode(otherlv_8, grammarAccess.getLimitAccess().getUpperKeyword_8());
            		
            // InternalMyDsl.g:2380:3: ( (lv_upper_9_0= ruleURDFAttrSignedNumeric ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_INT||LA34_0==77) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalMyDsl.g:2381:4: (lv_upper_9_0= ruleURDFAttrSignedNumeric )
                    {
                    // InternalMyDsl.g:2381:4: (lv_upper_9_0= ruleURDFAttrSignedNumeric )
                    // InternalMyDsl.g:2382:5: lv_upper_9_0= ruleURDFAttrSignedNumeric
                    {

                    					newCompositeNode(grammarAccess.getLimitAccess().getUpperURDFAttrSignedNumericParserRuleCall_9_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_upper_9_0=ruleURDFAttrSignedNumeric();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLimitRule());
                    					}
                    					set(
                    						current,
                    						"upper",
                    						lv_upper_9_0,
                    						"org.xtext.example.mydsl4.MyDsl.URDFAttrSignedNumeric");
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
    // $ANTLR end "ruleLimit"


    // $ANTLR start "entryRuleCalibration"
    // InternalMyDsl.g:2403:1: entryRuleCalibration returns [EObject current=null] : iv_ruleCalibration= ruleCalibration EOF ;
    public final EObject entryRuleCalibration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCalibration = null;


        try {
            // InternalMyDsl.g:2403:52: (iv_ruleCalibration= ruleCalibration EOF )
            // InternalMyDsl.g:2404:2: iv_ruleCalibration= ruleCalibration EOF
            {
             newCompositeNode(grammarAccess.getCalibrationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCalibration=ruleCalibration();

            state._fsp--;

             current =iv_ruleCalibration; 
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
    // $ANTLR end "entryRuleCalibration"


    // $ANTLR start "ruleCalibration"
    // InternalMyDsl.g:2410:1: ruleCalibration returns [EObject current=null] : ( () otherlv_1= 'Calibration' ( (lv_name_2_0= RULE_ID ) )? (otherlv_3= 'rising' ( (lv_rising_4_0= ruleURDFAttrSignedNumeric ) ) )? (otherlv_5= 'falling' ( (lv_falling_6_0= ruleURDFAttrSignedNumeric ) ) )? ) ;
    public final EObject ruleCalibration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_rising_4_0 = null;

        EObject lv_falling_6_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2416:2: ( ( () otherlv_1= 'Calibration' ( (lv_name_2_0= RULE_ID ) )? (otherlv_3= 'rising' ( (lv_rising_4_0= ruleURDFAttrSignedNumeric ) ) )? (otherlv_5= 'falling' ( (lv_falling_6_0= ruleURDFAttrSignedNumeric ) ) )? ) )
            // InternalMyDsl.g:2417:2: ( () otherlv_1= 'Calibration' ( (lv_name_2_0= RULE_ID ) )? (otherlv_3= 'rising' ( (lv_rising_4_0= ruleURDFAttrSignedNumeric ) ) )? (otherlv_5= 'falling' ( (lv_falling_6_0= ruleURDFAttrSignedNumeric ) ) )? )
            {
            // InternalMyDsl.g:2417:2: ( () otherlv_1= 'Calibration' ( (lv_name_2_0= RULE_ID ) )? (otherlv_3= 'rising' ( (lv_rising_4_0= ruleURDFAttrSignedNumeric ) ) )? (otherlv_5= 'falling' ( (lv_falling_6_0= ruleURDFAttrSignedNumeric ) ) )? )
            // InternalMyDsl.g:2418:3: () otherlv_1= 'Calibration' ( (lv_name_2_0= RULE_ID ) )? (otherlv_3= 'rising' ( (lv_rising_4_0= ruleURDFAttrSignedNumeric ) ) )? (otherlv_5= 'falling' ( (lv_falling_6_0= ruleURDFAttrSignedNumeric ) ) )?
            {
            // InternalMyDsl.g:2418:3: ()
            // InternalMyDsl.g:2419:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCalibrationAccess().getCalibrationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,64,FOLLOW_63); 

            			newLeafNode(otherlv_1, grammarAccess.getCalibrationAccess().getCalibrationKeyword_1());
            		
            // InternalMyDsl.g:2429:3: ( (lv_name_2_0= RULE_ID ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_ID) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalMyDsl.g:2430:4: (lv_name_2_0= RULE_ID )
                    {
                    // InternalMyDsl.g:2430:4: (lv_name_2_0= RULE_ID )
                    // InternalMyDsl.g:2431:5: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_64); 

                    					newLeafNode(lv_name_2_0, grammarAccess.getCalibrationAccess().getNameIDTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCalibrationRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_2_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:2447:3: (otherlv_3= 'rising' ( (lv_rising_4_0= ruleURDFAttrSignedNumeric ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==65) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalMyDsl.g:2448:4: otherlv_3= 'rising' ( (lv_rising_4_0= ruleURDFAttrSignedNumeric ) )
                    {
                    otherlv_3=(Token)match(input,65,FOLLOW_15); 

                    				newLeafNode(otherlv_3, grammarAccess.getCalibrationAccess().getRisingKeyword_3_0());
                    			
                    // InternalMyDsl.g:2452:4: ( (lv_rising_4_0= ruleURDFAttrSignedNumeric ) )
                    // InternalMyDsl.g:2453:5: (lv_rising_4_0= ruleURDFAttrSignedNumeric )
                    {
                    // InternalMyDsl.g:2453:5: (lv_rising_4_0= ruleURDFAttrSignedNumeric )
                    // InternalMyDsl.g:2454:6: lv_rising_4_0= ruleURDFAttrSignedNumeric
                    {

                    						newCompositeNode(grammarAccess.getCalibrationAccess().getRisingURDFAttrSignedNumericParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_65);
                    lv_rising_4_0=ruleURDFAttrSignedNumeric();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCalibrationRule());
                    						}
                    						set(
                    							current,
                    							"rising",
                    							lv_rising_4_0,
                    							"org.xtext.example.mydsl4.MyDsl.URDFAttrSignedNumeric");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:2472:3: (otherlv_5= 'falling' ( (lv_falling_6_0= ruleURDFAttrSignedNumeric ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==66) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalMyDsl.g:2473:4: otherlv_5= 'falling' ( (lv_falling_6_0= ruleURDFAttrSignedNumeric ) )
                    {
                    otherlv_5=(Token)match(input,66,FOLLOW_15); 

                    				newLeafNode(otherlv_5, grammarAccess.getCalibrationAccess().getFallingKeyword_4_0());
                    			
                    // InternalMyDsl.g:2477:4: ( (lv_falling_6_0= ruleURDFAttrSignedNumeric ) )
                    // InternalMyDsl.g:2478:5: (lv_falling_6_0= ruleURDFAttrSignedNumeric )
                    {
                    // InternalMyDsl.g:2478:5: (lv_falling_6_0= ruleURDFAttrSignedNumeric )
                    // InternalMyDsl.g:2479:6: lv_falling_6_0= ruleURDFAttrSignedNumeric
                    {

                    						newCompositeNode(grammarAccess.getCalibrationAccess().getFallingURDFAttrSignedNumericParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_falling_6_0=ruleURDFAttrSignedNumeric();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCalibrationRule());
                    						}
                    						set(
                    							current,
                    							"falling",
                    							lv_falling_6_0,
                    							"org.xtext.example.mydsl4.MyDsl.URDFAttrSignedNumeric");
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
    // $ANTLR end "ruleCalibration"


    // $ANTLR start "entryRuleDynamics"
    // InternalMyDsl.g:2501:1: entryRuleDynamics returns [EObject current=null] : iv_ruleDynamics= ruleDynamics EOF ;
    public final EObject entryRuleDynamics() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDynamics = null;


        try {
            // InternalMyDsl.g:2501:49: (iv_ruleDynamics= ruleDynamics EOF )
            // InternalMyDsl.g:2502:2: iv_ruleDynamics= ruleDynamics EOF
            {
             newCompositeNode(grammarAccess.getDynamicsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDynamics=ruleDynamics();

            state._fsp--;

             current =iv_ruleDynamics; 
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
    // $ANTLR end "entryRuleDynamics"


    // $ANTLR start "ruleDynamics"
    // InternalMyDsl.g:2508:1: ruleDynamics returns [EObject current=null] : ( () otherlv_1= 'Dynamics' ( (lv_name_2_0= RULE_ID ) )? (otherlv_3= 'friction' ( (lv_friction_4_0= ruleURDFAttrSignedNumeric ) ) )? (otherlv_5= 'damping' ( (lv_damping_6_0= ruleURDFAttrSignedNumeric ) ) )? ) ;
    public final EObject ruleDynamics() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_friction_4_0 = null;

        EObject lv_damping_6_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2514:2: ( ( () otherlv_1= 'Dynamics' ( (lv_name_2_0= RULE_ID ) )? (otherlv_3= 'friction' ( (lv_friction_4_0= ruleURDFAttrSignedNumeric ) ) )? (otherlv_5= 'damping' ( (lv_damping_6_0= ruleURDFAttrSignedNumeric ) ) )? ) )
            // InternalMyDsl.g:2515:2: ( () otherlv_1= 'Dynamics' ( (lv_name_2_0= RULE_ID ) )? (otherlv_3= 'friction' ( (lv_friction_4_0= ruleURDFAttrSignedNumeric ) ) )? (otherlv_5= 'damping' ( (lv_damping_6_0= ruleURDFAttrSignedNumeric ) ) )? )
            {
            // InternalMyDsl.g:2515:2: ( () otherlv_1= 'Dynamics' ( (lv_name_2_0= RULE_ID ) )? (otherlv_3= 'friction' ( (lv_friction_4_0= ruleURDFAttrSignedNumeric ) ) )? (otherlv_5= 'damping' ( (lv_damping_6_0= ruleURDFAttrSignedNumeric ) ) )? )
            // InternalMyDsl.g:2516:3: () otherlv_1= 'Dynamics' ( (lv_name_2_0= RULE_ID ) )? (otherlv_3= 'friction' ( (lv_friction_4_0= ruleURDFAttrSignedNumeric ) ) )? (otherlv_5= 'damping' ( (lv_damping_6_0= ruleURDFAttrSignedNumeric ) ) )?
            {
            // InternalMyDsl.g:2516:3: ()
            // InternalMyDsl.g:2517:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDynamicsAccess().getDynamicsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,67,FOLLOW_66); 

            			newLeafNode(otherlv_1, grammarAccess.getDynamicsAccess().getDynamicsKeyword_1());
            		
            // InternalMyDsl.g:2527:3: ( (lv_name_2_0= RULE_ID ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_ID) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalMyDsl.g:2528:4: (lv_name_2_0= RULE_ID )
                    {
                    // InternalMyDsl.g:2528:4: (lv_name_2_0= RULE_ID )
                    // InternalMyDsl.g:2529:5: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_67); 

                    					newLeafNode(lv_name_2_0, grammarAccess.getDynamicsAccess().getNameIDTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDynamicsRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_2_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:2545:3: (otherlv_3= 'friction' ( (lv_friction_4_0= ruleURDFAttrSignedNumeric ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==68) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalMyDsl.g:2546:4: otherlv_3= 'friction' ( (lv_friction_4_0= ruleURDFAttrSignedNumeric ) )
                    {
                    otherlv_3=(Token)match(input,68,FOLLOW_15); 

                    				newLeafNode(otherlv_3, grammarAccess.getDynamicsAccess().getFrictionKeyword_3_0());
                    			
                    // InternalMyDsl.g:2550:4: ( (lv_friction_4_0= ruleURDFAttrSignedNumeric ) )
                    // InternalMyDsl.g:2551:5: (lv_friction_4_0= ruleURDFAttrSignedNumeric )
                    {
                    // InternalMyDsl.g:2551:5: (lv_friction_4_0= ruleURDFAttrSignedNumeric )
                    // InternalMyDsl.g:2552:6: lv_friction_4_0= ruleURDFAttrSignedNumeric
                    {

                    						newCompositeNode(grammarAccess.getDynamicsAccess().getFrictionURDFAttrSignedNumericParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_68);
                    lv_friction_4_0=ruleURDFAttrSignedNumeric();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDynamicsRule());
                    						}
                    						set(
                    							current,
                    							"friction",
                    							lv_friction_4_0,
                    							"org.xtext.example.mydsl4.MyDsl.URDFAttrSignedNumeric");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:2570:3: (otherlv_5= 'damping' ( (lv_damping_6_0= ruleURDFAttrSignedNumeric ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==69) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalMyDsl.g:2571:4: otherlv_5= 'damping' ( (lv_damping_6_0= ruleURDFAttrSignedNumeric ) )
                    {
                    otherlv_5=(Token)match(input,69,FOLLOW_15); 

                    				newLeafNode(otherlv_5, grammarAccess.getDynamicsAccess().getDampingKeyword_4_0());
                    			
                    // InternalMyDsl.g:2575:4: ( (lv_damping_6_0= ruleURDFAttrSignedNumeric ) )
                    // InternalMyDsl.g:2576:5: (lv_damping_6_0= ruleURDFAttrSignedNumeric )
                    {
                    // InternalMyDsl.g:2576:5: (lv_damping_6_0= ruleURDFAttrSignedNumeric )
                    // InternalMyDsl.g:2577:6: lv_damping_6_0= ruleURDFAttrSignedNumeric
                    {

                    						newCompositeNode(grammarAccess.getDynamicsAccess().getDampingURDFAttrSignedNumericParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_damping_6_0=ruleURDFAttrSignedNumeric();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDynamicsRule());
                    						}
                    						set(
                    							current,
                    							"damping",
                    							lv_damping_6_0,
                    							"org.xtext.example.mydsl4.MyDsl.URDFAttrSignedNumeric");
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
    // $ANTLR end "ruleDynamics"


    // $ANTLR start "entryRuleSafetyController"
    // InternalMyDsl.g:2599:1: entryRuleSafetyController returns [EObject current=null] : iv_ruleSafetyController= ruleSafetyController EOF ;
    public final EObject entryRuleSafetyController() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSafetyController = null;


        try {
            // InternalMyDsl.g:2599:57: (iv_ruleSafetyController= ruleSafetyController EOF )
            // InternalMyDsl.g:2600:2: iv_ruleSafetyController= ruleSafetyController EOF
            {
             newCompositeNode(grammarAccess.getSafetyControllerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSafetyController=ruleSafetyController();

            state._fsp--;

             current =iv_ruleSafetyController; 
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
    // $ANTLR end "entryRuleSafetyController"


    // $ANTLR start "ruleSafetyController"
    // InternalMyDsl.g:2606:1: ruleSafetyController returns [EObject current=null] : (otherlv_0= 'SafetyController' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'k_velocity' ( (lv_k_velocity_3_0= ruleURDFAttrSignedNumeric ) ) (otherlv_4= 'k_position' ( (lv_k_position_5_0= ruleURDFAttrSignedNumeric ) ) )? (otherlv_6= 'softLowerLimit' ( (lv_softLowerLimit_7_0= ruleURDFAttrSignedNumeric ) ) )? (otherlv_8= 'softUpperLimit' ( (lv_softUpperLimit_9_0= ruleURDFAttrSignedNumeric ) ) )? ) ;
    public final EObject ruleSafetyController() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_k_velocity_3_0 = null;

        EObject lv_k_position_5_0 = null;

        EObject lv_softLowerLimit_7_0 = null;

        EObject lv_softUpperLimit_9_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2612:2: ( (otherlv_0= 'SafetyController' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'k_velocity' ( (lv_k_velocity_3_0= ruleURDFAttrSignedNumeric ) ) (otherlv_4= 'k_position' ( (lv_k_position_5_0= ruleURDFAttrSignedNumeric ) ) )? (otherlv_6= 'softLowerLimit' ( (lv_softLowerLimit_7_0= ruleURDFAttrSignedNumeric ) ) )? (otherlv_8= 'softUpperLimit' ( (lv_softUpperLimit_9_0= ruleURDFAttrSignedNumeric ) ) )? ) )
            // InternalMyDsl.g:2613:2: (otherlv_0= 'SafetyController' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'k_velocity' ( (lv_k_velocity_3_0= ruleURDFAttrSignedNumeric ) ) (otherlv_4= 'k_position' ( (lv_k_position_5_0= ruleURDFAttrSignedNumeric ) ) )? (otherlv_6= 'softLowerLimit' ( (lv_softLowerLimit_7_0= ruleURDFAttrSignedNumeric ) ) )? (otherlv_8= 'softUpperLimit' ( (lv_softUpperLimit_9_0= ruleURDFAttrSignedNumeric ) ) )? )
            {
            // InternalMyDsl.g:2613:2: (otherlv_0= 'SafetyController' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'k_velocity' ( (lv_k_velocity_3_0= ruleURDFAttrSignedNumeric ) ) (otherlv_4= 'k_position' ( (lv_k_position_5_0= ruleURDFAttrSignedNumeric ) ) )? (otherlv_6= 'softLowerLimit' ( (lv_softLowerLimit_7_0= ruleURDFAttrSignedNumeric ) ) )? (otherlv_8= 'softUpperLimit' ( (lv_softUpperLimit_9_0= ruleURDFAttrSignedNumeric ) ) )? )
            // InternalMyDsl.g:2614:3: otherlv_0= 'SafetyController' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'k_velocity' ( (lv_k_velocity_3_0= ruleURDFAttrSignedNumeric ) ) (otherlv_4= 'k_position' ( (lv_k_position_5_0= ruleURDFAttrSignedNumeric ) ) )? (otherlv_6= 'softLowerLimit' ( (lv_softLowerLimit_7_0= ruleURDFAttrSignedNumeric ) ) )? (otherlv_8= 'softUpperLimit' ( (lv_softUpperLimit_9_0= ruleURDFAttrSignedNumeric ) ) )?
            {
            otherlv_0=(Token)match(input,70,FOLLOW_69); 

            			newLeafNode(otherlv_0, grammarAccess.getSafetyControllerAccess().getSafetyControllerKeyword_0());
            		
            // InternalMyDsl.g:2618:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_ID) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalMyDsl.g:2619:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalMyDsl.g:2619:4: (lv_name_1_0= RULE_ID )
                    // InternalMyDsl.g:2620:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_70); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getSafetyControllerAccess().getNameIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSafetyControllerRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,71,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getSafetyControllerAccess().getK_velocityKeyword_2());
            		
            // InternalMyDsl.g:2640:3: ( (lv_k_velocity_3_0= ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:2641:4: (lv_k_velocity_3_0= ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:2641:4: (lv_k_velocity_3_0= ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:2642:5: lv_k_velocity_3_0= ruleURDFAttrSignedNumeric
            {

            					newCompositeNode(grammarAccess.getSafetyControllerAccess().getK_velocityURDFAttrSignedNumericParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_71);
            lv_k_velocity_3_0=ruleURDFAttrSignedNumeric();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSafetyControllerRule());
            					}
            					set(
            						current,
            						"k_velocity",
            						lv_k_velocity_3_0,
            						"org.xtext.example.mydsl4.MyDsl.URDFAttrSignedNumeric");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:2659:3: (otherlv_4= 'k_position' ( (lv_k_position_5_0= ruleURDFAttrSignedNumeric ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==72) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalMyDsl.g:2660:4: otherlv_4= 'k_position' ( (lv_k_position_5_0= ruleURDFAttrSignedNumeric ) )
                    {
                    otherlv_4=(Token)match(input,72,FOLLOW_15); 

                    				newLeafNode(otherlv_4, grammarAccess.getSafetyControllerAccess().getK_positionKeyword_4_0());
                    			
                    // InternalMyDsl.g:2664:4: ( (lv_k_position_5_0= ruleURDFAttrSignedNumeric ) )
                    // InternalMyDsl.g:2665:5: (lv_k_position_5_0= ruleURDFAttrSignedNumeric )
                    {
                    // InternalMyDsl.g:2665:5: (lv_k_position_5_0= ruleURDFAttrSignedNumeric )
                    // InternalMyDsl.g:2666:6: lv_k_position_5_0= ruleURDFAttrSignedNumeric
                    {

                    						newCompositeNode(grammarAccess.getSafetyControllerAccess().getK_positionURDFAttrSignedNumericParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_72);
                    lv_k_position_5_0=ruleURDFAttrSignedNumeric();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSafetyControllerRule());
                    						}
                    						set(
                    							current,
                    							"k_position",
                    							lv_k_position_5_0,
                    							"org.xtext.example.mydsl4.MyDsl.URDFAttrSignedNumeric");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:2684:3: (otherlv_6= 'softLowerLimit' ( (lv_softLowerLimit_7_0= ruleURDFAttrSignedNumeric ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==73) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalMyDsl.g:2685:4: otherlv_6= 'softLowerLimit' ( (lv_softLowerLimit_7_0= ruleURDFAttrSignedNumeric ) )
                    {
                    otherlv_6=(Token)match(input,73,FOLLOW_15); 

                    				newLeafNode(otherlv_6, grammarAccess.getSafetyControllerAccess().getSoftLowerLimitKeyword_5_0());
                    			
                    // InternalMyDsl.g:2689:4: ( (lv_softLowerLimit_7_0= ruleURDFAttrSignedNumeric ) )
                    // InternalMyDsl.g:2690:5: (lv_softLowerLimit_7_0= ruleURDFAttrSignedNumeric )
                    {
                    // InternalMyDsl.g:2690:5: (lv_softLowerLimit_7_0= ruleURDFAttrSignedNumeric )
                    // InternalMyDsl.g:2691:6: lv_softLowerLimit_7_0= ruleURDFAttrSignedNumeric
                    {

                    						newCompositeNode(grammarAccess.getSafetyControllerAccess().getSoftLowerLimitURDFAttrSignedNumericParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_73);
                    lv_softLowerLimit_7_0=ruleURDFAttrSignedNumeric();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSafetyControllerRule());
                    						}
                    						set(
                    							current,
                    							"softLowerLimit",
                    							lv_softLowerLimit_7_0,
                    							"org.xtext.example.mydsl4.MyDsl.URDFAttrSignedNumeric");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:2709:3: (otherlv_8= 'softUpperLimit' ( (lv_softUpperLimit_9_0= ruleURDFAttrSignedNumeric ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==74) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalMyDsl.g:2710:4: otherlv_8= 'softUpperLimit' ( (lv_softUpperLimit_9_0= ruleURDFAttrSignedNumeric ) )
                    {
                    otherlv_8=(Token)match(input,74,FOLLOW_15); 

                    				newLeafNode(otherlv_8, grammarAccess.getSafetyControllerAccess().getSoftUpperLimitKeyword_6_0());
                    			
                    // InternalMyDsl.g:2714:4: ( (lv_softUpperLimit_9_0= ruleURDFAttrSignedNumeric ) )
                    // InternalMyDsl.g:2715:5: (lv_softUpperLimit_9_0= ruleURDFAttrSignedNumeric )
                    {
                    // InternalMyDsl.g:2715:5: (lv_softUpperLimit_9_0= ruleURDFAttrSignedNumeric )
                    // InternalMyDsl.g:2716:6: lv_softUpperLimit_9_0= ruleURDFAttrSignedNumeric
                    {

                    						newCompositeNode(grammarAccess.getSafetyControllerAccess().getSoftUpperLimitURDFAttrSignedNumericParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_softUpperLimit_9_0=ruleURDFAttrSignedNumeric();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSafetyControllerRule());
                    						}
                    						set(
                    							current,
                    							"softUpperLimit",
                    							lv_softUpperLimit_9_0,
                    							"org.xtext.example.mydsl4.MyDsl.URDFAttrSignedNumeric");
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
    // $ANTLR end "ruleSafetyController"


    // $ANTLR start "entryRuleURDFAttrSignedNumeric"
    // InternalMyDsl.g:2738:1: entryRuleURDFAttrSignedNumeric returns [EObject current=null] : iv_ruleURDFAttrSignedNumeric= ruleURDFAttrSignedNumeric EOF ;
    public final EObject entryRuleURDFAttrSignedNumeric() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleURDFAttrSignedNumeric = null;


        try {
            // InternalMyDsl.g:2738:62: (iv_ruleURDFAttrSignedNumeric= ruleURDFAttrSignedNumeric EOF )
            // InternalMyDsl.g:2739:2: iv_ruleURDFAttrSignedNumeric= ruleURDFAttrSignedNumeric EOF
            {
             newCompositeNode(grammarAccess.getURDFAttrSignedNumericRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleURDFAttrSignedNumeric=ruleURDFAttrSignedNumeric();

            state._fsp--;

             current =iv_ruleURDFAttrSignedNumeric; 
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
    // $ANTLR end "entryRuleURDFAttrSignedNumeric"


    // $ANTLR start "ruleURDFAttrSignedNumeric"
    // InternalMyDsl.g:2745:1: ruleURDFAttrSignedNumeric returns [EObject current=null] : ( (lv_value_0_0= ruleSIGNED_NUMERIC ) ) ;
    public final EObject ruleURDFAttrSignedNumeric() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2751:2: ( ( (lv_value_0_0= ruleSIGNED_NUMERIC ) ) )
            // InternalMyDsl.g:2752:2: ( (lv_value_0_0= ruleSIGNED_NUMERIC ) )
            {
            // InternalMyDsl.g:2752:2: ( (lv_value_0_0= ruleSIGNED_NUMERIC ) )
            // InternalMyDsl.g:2753:3: (lv_value_0_0= ruleSIGNED_NUMERIC )
            {
            // InternalMyDsl.g:2753:3: (lv_value_0_0= ruleSIGNED_NUMERIC )
            // InternalMyDsl.g:2754:4: lv_value_0_0= ruleSIGNED_NUMERIC
            {

            				newCompositeNode(grammarAccess.getURDFAttrSignedNumericAccess().getValueSIGNED_NUMERICParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleSIGNED_NUMERIC();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getURDFAttrSignedNumericRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.xtext.example.mydsl4.MyDsl.SIGNED_NUMERIC");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleURDFAttrSignedNumeric"


    // $ANTLR start "entryRuleURDFAttrFloat"
    // InternalMyDsl.g:2774:1: entryRuleURDFAttrFloat returns [EObject current=null] : iv_ruleURDFAttrFloat= ruleURDFAttrFloat EOF ;
    public final EObject entryRuleURDFAttrFloat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleURDFAttrFloat = null;


        try {
            // InternalMyDsl.g:2774:54: (iv_ruleURDFAttrFloat= ruleURDFAttrFloat EOF )
            // InternalMyDsl.g:2775:2: iv_ruleURDFAttrFloat= ruleURDFAttrFloat EOF
            {
             newCompositeNode(grammarAccess.getURDFAttrFloatRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleURDFAttrFloat=ruleURDFAttrFloat();

            state._fsp--;

             current =iv_ruleURDFAttrFloat; 
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
    // $ANTLR end "entryRuleURDFAttrFloat"


    // $ANTLR start "ruleURDFAttrFloat"
    // InternalMyDsl.g:2781:1: ruleURDFAttrFloat returns [EObject current=null] : ( (lv_value_0_0= ruleFLOAT ) ) ;
    public final EObject ruleURDFAttrFloat() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2787:2: ( ( (lv_value_0_0= ruleFLOAT ) ) )
            // InternalMyDsl.g:2788:2: ( (lv_value_0_0= ruleFLOAT ) )
            {
            // InternalMyDsl.g:2788:2: ( (lv_value_0_0= ruleFLOAT ) )
            // InternalMyDsl.g:2789:3: (lv_value_0_0= ruleFLOAT )
            {
            // InternalMyDsl.g:2789:3: (lv_value_0_0= ruleFLOAT )
            // InternalMyDsl.g:2790:4: lv_value_0_0= ruleFLOAT
            {

            				newCompositeNode(grammarAccess.getURDFAttrFloatAccess().getValueFLOATParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleFLOAT();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getURDFAttrFloatRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.xtext.example.mydsl4.MyDsl.FLOAT");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleURDFAttrFloat"


    // $ANTLR start "entryRuleURDFAttrINT"
    // InternalMyDsl.g:2810:1: entryRuleURDFAttrINT returns [EObject current=null] : iv_ruleURDFAttrINT= ruleURDFAttrINT EOF ;
    public final EObject entryRuleURDFAttrINT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleURDFAttrINT = null;


        try {
            // InternalMyDsl.g:2810:52: (iv_ruleURDFAttrINT= ruleURDFAttrINT EOF )
            // InternalMyDsl.g:2811:2: iv_ruleURDFAttrINT= ruleURDFAttrINT EOF
            {
             newCompositeNode(grammarAccess.getURDFAttrINTRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleURDFAttrINT=ruleURDFAttrINT();

            state._fsp--;

             current =iv_ruleURDFAttrINT; 
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
    // $ANTLR end "entryRuleURDFAttrINT"


    // $ANTLR start "ruleURDFAttrINT"
    // InternalMyDsl.g:2817:1: ruleURDFAttrINT returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleURDFAttrINT() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2823:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalMyDsl.g:2824:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalMyDsl.g:2824:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalMyDsl.g:2825:3: (lv_value_0_0= RULE_INT )
            {
            // InternalMyDsl.g:2825:3: (lv_value_0_0= RULE_INT )
            // InternalMyDsl.g:2826:4: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getURDFAttrINTAccess().getValueINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getURDFAttrINTRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

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
    // $ANTLR end "ruleURDFAttrINT"


    // $ANTLR start "entryRuleURDFAttrNumeric"
    // InternalMyDsl.g:2845:1: entryRuleURDFAttrNumeric returns [EObject current=null] : iv_ruleURDFAttrNumeric= ruleURDFAttrNumeric EOF ;
    public final EObject entryRuleURDFAttrNumeric() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleURDFAttrNumeric = null;


        try {
            // InternalMyDsl.g:2845:56: (iv_ruleURDFAttrNumeric= ruleURDFAttrNumeric EOF )
            // InternalMyDsl.g:2846:2: iv_ruleURDFAttrNumeric= ruleURDFAttrNumeric EOF
            {
             newCompositeNode(grammarAccess.getURDFAttrNumericRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleURDFAttrNumeric=ruleURDFAttrNumeric();

            state._fsp--;

             current =iv_ruleURDFAttrNumeric; 
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
    // $ANTLR end "entryRuleURDFAttrNumeric"


    // $ANTLR start "ruleURDFAttrNumeric"
    // InternalMyDsl.g:2852:1: ruleURDFAttrNumeric returns [EObject current=null] : ( (lv_value_0_0= ruleNUMERIC ) ) ;
    public final EObject ruleURDFAttrNumeric() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2858:2: ( ( (lv_value_0_0= ruleNUMERIC ) ) )
            // InternalMyDsl.g:2859:2: ( (lv_value_0_0= ruleNUMERIC ) )
            {
            // InternalMyDsl.g:2859:2: ( (lv_value_0_0= ruleNUMERIC ) )
            // InternalMyDsl.g:2860:3: (lv_value_0_0= ruleNUMERIC )
            {
            // InternalMyDsl.g:2860:3: (lv_value_0_0= ruleNUMERIC )
            // InternalMyDsl.g:2861:4: lv_value_0_0= ruleNUMERIC
            {

            				newCompositeNode(grammarAccess.getURDFAttrNumericAccess().getValueNUMERICParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleNUMERIC();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getURDFAttrNumericRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.xtext.example.mydsl4.MyDsl.NUMERIC");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleURDFAttrNumeric"


    // $ANTLR start "entryRuleURDFAttrSTRING"
    // InternalMyDsl.g:2881:1: entryRuleURDFAttrSTRING returns [EObject current=null] : iv_ruleURDFAttrSTRING= ruleURDFAttrSTRING EOF ;
    public final EObject entryRuleURDFAttrSTRING() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleURDFAttrSTRING = null;


        try {
            // InternalMyDsl.g:2881:55: (iv_ruleURDFAttrSTRING= ruleURDFAttrSTRING EOF )
            // InternalMyDsl.g:2882:2: iv_ruleURDFAttrSTRING= ruleURDFAttrSTRING EOF
            {
             newCompositeNode(grammarAccess.getURDFAttrSTRINGRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleURDFAttrSTRING=ruleURDFAttrSTRING();

            state._fsp--;

             current =iv_ruleURDFAttrSTRING; 
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
    // $ANTLR end "entryRuleURDFAttrSTRING"


    // $ANTLR start "ruleURDFAttrSTRING"
    // InternalMyDsl.g:2888:1: ruleURDFAttrSTRING returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleURDFAttrSTRING() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2894:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalMyDsl.g:2895:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalMyDsl.g:2895:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalMyDsl.g:2896:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalMyDsl.g:2896:3: (lv_value_0_0= RULE_STRING )
            // InternalMyDsl.g:2897:4: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getURDFAttrSTRINGAccess().getValueSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getURDFAttrSTRINGRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

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
    // $ANTLR end "ruleURDFAttrSTRING"


    // $ANTLR start "entryRuleFLOAT"
    // InternalMyDsl.g:2916:1: entryRuleFLOAT returns [String current=null] : iv_ruleFLOAT= ruleFLOAT EOF ;
    public final String entryRuleFLOAT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFLOAT = null;


        try {
            // InternalMyDsl.g:2916:45: (iv_ruleFLOAT= ruleFLOAT EOF )
            // InternalMyDsl.g:2917:2: iv_ruleFLOAT= ruleFLOAT EOF
            {
             newCompositeNode(grammarAccess.getFLOATRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFLOAT=ruleFLOAT();

            state._fsp--;

             current =iv_ruleFLOAT.getText(); 
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
    // $ANTLR end "entryRuleFLOAT"


    // $ANTLR start "ruleFLOAT"
    // InternalMyDsl.g:2923:1: ruleFLOAT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleFLOAT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2929:2: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) )
            // InternalMyDsl.g:2930:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            {
            // InternalMyDsl.g:2930:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            // InternalMyDsl.g:2931:3: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_74); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getFLOATAccess().getINTTerminalRuleCall_0());
            		
            kw=(Token)match(input,17,FOLLOW_47); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getFLOATAccess().getFullStopKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getFLOATAccess().getINTTerminalRuleCall_2());
            		

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
    // $ANTLR end "ruleFLOAT"


    // $ANTLR start "entryRuleSCIENTIFIC"
    // InternalMyDsl.g:2954:1: entryRuleSCIENTIFIC returns [String current=null] : iv_ruleSCIENTIFIC= ruleSCIENTIFIC EOF ;
    public final String entryRuleSCIENTIFIC() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSCIENTIFIC = null;


        try {
            // InternalMyDsl.g:2954:50: (iv_ruleSCIENTIFIC= ruleSCIENTIFIC EOF )
            // InternalMyDsl.g:2955:2: iv_ruleSCIENTIFIC= ruleSCIENTIFIC EOF
            {
             newCompositeNode(grammarAccess.getSCIENTIFICRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSCIENTIFIC=ruleSCIENTIFIC();

            state._fsp--;

             current =iv_ruleSCIENTIFIC.getText(); 
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
    // $ANTLR end "entryRuleSCIENTIFIC"


    // $ANTLR start "ruleSCIENTIFIC"
    // InternalMyDsl.g:2961:1: ruleSCIENTIFIC returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FLOAT_0= ruleFLOAT kw= 'e' (kw= '+' | kw= '-' )? this_INT_4= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleSCIENTIFIC() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_4=null;
        AntlrDatatypeRuleToken this_FLOAT_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2967:2: ( (this_FLOAT_0= ruleFLOAT kw= 'e' (kw= '+' | kw= '-' )? this_INT_4= RULE_INT ) )
            // InternalMyDsl.g:2968:2: (this_FLOAT_0= ruleFLOAT kw= 'e' (kw= '+' | kw= '-' )? this_INT_4= RULE_INT )
            {
            // InternalMyDsl.g:2968:2: (this_FLOAT_0= ruleFLOAT kw= 'e' (kw= '+' | kw= '-' )? this_INT_4= RULE_INT )
            // InternalMyDsl.g:2969:3: this_FLOAT_0= ruleFLOAT kw= 'e' (kw= '+' | kw= '-' )? this_INT_4= RULE_INT
            {

            			newCompositeNode(grammarAccess.getSCIENTIFICAccess().getFLOATParserRuleCall_0());
            		
            pushFollow(FOLLOW_75);
            this_FLOAT_0=ruleFLOAT();

            state._fsp--;


            			current.merge(this_FLOAT_0);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,75,FOLLOW_76); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getSCIENTIFICAccess().getEKeyword_1());
            		
            // InternalMyDsl.g:2984:3: (kw= '+' | kw= '-' )?
            int alt45=3;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==76) ) {
                alt45=1;
            }
            else if ( (LA45_0==77) ) {
                alt45=2;
            }
            switch (alt45) {
                case 1 :
                    // InternalMyDsl.g:2985:4: kw= '+'
                    {
                    kw=(Token)match(input,76,FOLLOW_47); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getSCIENTIFICAccess().getPlusSignKeyword_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2991:4: kw= '-'
                    {
                    kw=(Token)match(input,77,FOLLOW_47); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getSCIENTIFICAccess().getHyphenMinusKeyword_2_1());
                    			

                    }
                    break;

            }

            this_INT_4=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_4);
            		

            			newLeafNode(this_INT_4, grammarAccess.getSCIENTIFICAccess().getINTTerminalRuleCall_3());
            		

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
    // $ANTLR end "ruleSCIENTIFIC"


    // $ANTLR start "entryRuleSIGNED_NUMERIC"
    // InternalMyDsl.g:3008:1: entryRuleSIGNED_NUMERIC returns [String current=null] : iv_ruleSIGNED_NUMERIC= ruleSIGNED_NUMERIC EOF ;
    public final String entryRuleSIGNED_NUMERIC() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSIGNED_NUMERIC = null;


        try {
            // InternalMyDsl.g:3008:54: (iv_ruleSIGNED_NUMERIC= ruleSIGNED_NUMERIC EOF )
            // InternalMyDsl.g:3009:2: iv_ruleSIGNED_NUMERIC= ruleSIGNED_NUMERIC EOF
            {
             newCompositeNode(grammarAccess.getSIGNED_NUMERICRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSIGNED_NUMERIC=ruleSIGNED_NUMERIC();

            state._fsp--;

             current =iv_ruleSIGNED_NUMERIC.getText(); 
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
    // $ANTLR end "entryRuleSIGNED_NUMERIC"


    // $ANTLR start "ruleSIGNED_NUMERIC"
    // InternalMyDsl.g:3015:1: ruleSIGNED_NUMERIC returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT | this_FLOAT_2= ruleFLOAT | this_SCIENTIFIC_3= ruleSCIENTIFIC ) ) ;
    public final AntlrDatatypeRuleToken ruleSIGNED_NUMERIC() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        AntlrDatatypeRuleToken this_FLOAT_2 = null;

        AntlrDatatypeRuleToken this_SCIENTIFIC_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3021:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT | this_FLOAT_2= ruleFLOAT | this_SCIENTIFIC_3= ruleSCIENTIFIC ) ) )
            // InternalMyDsl.g:3022:2: ( (kw= '-' )? (this_INT_1= RULE_INT | this_FLOAT_2= ruleFLOAT | this_SCIENTIFIC_3= ruleSCIENTIFIC ) )
            {
            // InternalMyDsl.g:3022:2: ( (kw= '-' )? (this_INT_1= RULE_INT | this_FLOAT_2= ruleFLOAT | this_SCIENTIFIC_3= ruleSCIENTIFIC ) )
            // InternalMyDsl.g:3023:3: (kw= '-' )? (this_INT_1= RULE_INT | this_FLOAT_2= ruleFLOAT | this_SCIENTIFIC_3= ruleSCIENTIFIC )
            {
            // InternalMyDsl.g:3023:3: (kw= '-' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==77) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalMyDsl.g:3024:4: kw= '-'
                    {
                    kw=(Token)match(input,77,FOLLOW_15); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getSIGNED_NUMERICAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:3030:3: (this_INT_1= RULE_INT | this_FLOAT_2= ruleFLOAT | this_SCIENTIFIC_3= ruleSCIENTIFIC )
            int alt47=3;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_INT) ) {
                int LA47_1 = input.LA(2);

                if ( (LA47_1==EOF||LA47_1==12||LA47_1==18||(LA47_1>=21 && LA47_1<=26)||(LA47_1>=28 && LA47_1<=29)||(LA47_1>=31 && LA47_1<=36)||LA47_1==38||LA47_1==54||(LA47_1>=58 && LA47_1<=59)||(LA47_1>=61 && LA47_1<=64)||(LA47_1>=66 && LA47_1<=67)||(LA47_1>=69 && LA47_1<=70)||(LA47_1>=72 && LA47_1<=74)) ) {
                    alt47=1;
                }
                else if ( (LA47_1==17) ) {
                    int LA47_3 = input.LA(3);

                    if ( (LA47_3==RULE_INT) ) {
                        int LA47_4 = input.LA(4);

                        if ( (LA47_4==EOF||LA47_4==12||LA47_4==18||(LA47_4>=21 && LA47_4<=26)||(LA47_4>=28 && LA47_4<=29)||(LA47_4>=31 && LA47_4<=36)||LA47_4==38||LA47_4==54||(LA47_4>=58 && LA47_4<=59)||(LA47_4>=61 && LA47_4<=64)||(LA47_4>=66 && LA47_4<=67)||(LA47_4>=69 && LA47_4<=70)||(LA47_4>=72 && LA47_4<=74)) ) {
                            alt47=2;
                        }
                        else if ( (LA47_4==75) ) {
                            alt47=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 47, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 47, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 47, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // InternalMyDsl.g:3031:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getSIGNED_NUMERICAccess().getINTTerminalRuleCall_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:3039:4: this_FLOAT_2= ruleFLOAT
                    {

                    				newCompositeNode(grammarAccess.getSIGNED_NUMERICAccess().getFLOATParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_FLOAT_2=ruleFLOAT();

                    state._fsp--;


                    				current.merge(this_FLOAT_2);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:3050:4: this_SCIENTIFIC_3= ruleSCIENTIFIC
                    {

                    				newCompositeNode(grammarAccess.getSIGNED_NUMERICAccess().getSCIENTIFICParserRuleCall_1_2());
                    			
                    pushFollow(FOLLOW_2);
                    this_SCIENTIFIC_3=ruleSCIENTIFIC();

                    state._fsp--;


                    				current.merge(this_SCIENTIFIC_3);
                    			

                    				afterParserOrEnumRuleCall();
                    			

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
    // $ANTLR end "ruleSIGNED_NUMERIC"


    // $ANTLR start "entryRuleNUMERIC"
    // InternalMyDsl.g:3065:1: entryRuleNUMERIC returns [String current=null] : iv_ruleNUMERIC= ruleNUMERIC EOF ;
    public final String entryRuleNUMERIC() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNUMERIC = null;


        try {
            // InternalMyDsl.g:3065:47: (iv_ruleNUMERIC= ruleNUMERIC EOF )
            // InternalMyDsl.g:3066:2: iv_ruleNUMERIC= ruleNUMERIC EOF
            {
             newCompositeNode(grammarAccess.getNUMERICRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNUMERIC=ruleNUMERIC();

            state._fsp--;

             current =iv_ruleNUMERIC.getText(); 
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
    // $ANTLR end "entryRuleNUMERIC"


    // $ANTLR start "ruleNUMERIC"
    // InternalMyDsl.g:3072:1: ruleNUMERIC returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_FLOAT_1= ruleFLOAT | this_SCIENTIFIC_2= ruleSCIENTIFIC ) ;
    public final AntlrDatatypeRuleToken ruleNUMERIC() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        AntlrDatatypeRuleToken this_FLOAT_1 = null;

        AntlrDatatypeRuleToken this_SCIENTIFIC_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3078:2: ( (this_INT_0= RULE_INT | this_FLOAT_1= ruleFLOAT | this_SCIENTIFIC_2= ruleSCIENTIFIC ) )
            // InternalMyDsl.g:3079:2: (this_INT_0= RULE_INT | this_FLOAT_1= ruleFLOAT | this_SCIENTIFIC_2= ruleSCIENTIFIC )
            {
            // InternalMyDsl.g:3079:2: (this_INT_0= RULE_INT | this_FLOAT_1= ruleFLOAT | this_SCIENTIFIC_2= ruleSCIENTIFIC )
            int alt48=3;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_INT) ) {
                int LA48_1 = input.LA(2);

                if ( (LA48_1==EOF||LA48_1==12||LA48_1==18||LA48_1==26||(LA48_1>=28 && LA48_1<=29)||(LA48_1>=38 && LA48_1<=39)||(LA48_1>=41 && LA48_1<=43)||LA48_1==45||LA48_1==47||LA48_1==54) ) {
                    alt48=1;
                }
                else if ( (LA48_1==17) ) {
                    int LA48_3 = input.LA(3);

                    if ( (LA48_3==RULE_INT) ) {
                        int LA48_4 = input.LA(4);

                        if ( (LA48_4==EOF||LA48_4==12||LA48_4==18||LA48_4==26||(LA48_4>=28 && LA48_4<=29)||(LA48_4>=38 && LA48_4<=39)||(LA48_4>=41 && LA48_4<=43)||LA48_4==45||LA48_4==47||LA48_4==54) ) {
                            alt48=2;
                        }
                        else if ( (LA48_4==75) ) {
                            alt48=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 48, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 48, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 48, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // InternalMyDsl.g:3080:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getNUMERICAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:3088:3: this_FLOAT_1= ruleFLOAT
                    {

                    			newCompositeNode(grammarAccess.getNUMERICAccess().getFLOATParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_FLOAT_1=ruleFLOAT();

                    state._fsp--;


                    			current.merge(this_FLOAT_1);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:3099:3: this_SCIENTIFIC_2= ruleSCIENTIFIC
                    {

                    			newCompositeNode(grammarAccess.getNUMERICAccess().getSCIENTIFICParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_SCIENTIFIC_2=ruleSCIENTIFIC();

                    state._fsp--;


                    			current.merge(this_SCIENTIFIC_2);
                    		

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
    // $ANTLR end "ruleNUMERIC"


    // $ANTLR start "ruleJointType"
    // InternalMyDsl.g:3113:1: ruleJointType returns [Enumerator current=null] : ( (enumLiteral_0= 'fixed' ) | (enumLiteral_1= 'revolute' ) | (enumLiteral_2= 'prismatic' ) | (enumLiteral_3= 'continuous' ) ) ;
    public final Enumerator ruleJointType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:3119:2: ( ( (enumLiteral_0= 'fixed' ) | (enumLiteral_1= 'revolute' ) | (enumLiteral_2= 'prismatic' ) | (enumLiteral_3= 'continuous' ) ) )
            // InternalMyDsl.g:3120:2: ( (enumLiteral_0= 'fixed' ) | (enumLiteral_1= 'revolute' ) | (enumLiteral_2= 'prismatic' ) | (enumLiteral_3= 'continuous' ) )
            {
            // InternalMyDsl.g:3120:2: ( (enumLiteral_0= 'fixed' ) | (enumLiteral_1= 'revolute' ) | (enumLiteral_2= 'prismatic' ) | (enumLiteral_3= 'continuous' ) )
            int alt49=4;
            switch ( input.LA(1) ) {
            case 78:
                {
                alt49=1;
                }
                break;
            case 79:
                {
                alt49=2;
                }
                break;
            case 80:
                {
                alt49=3;
                }
                break;
            case 81:
                {
                alt49=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // InternalMyDsl.g:3121:3: (enumLiteral_0= 'fixed' )
                    {
                    // InternalMyDsl.g:3121:3: (enumLiteral_0= 'fixed' )
                    // InternalMyDsl.g:3122:4: enumLiteral_0= 'fixed'
                    {
                    enumLiteral_0=(Token)match(input,78,FOLLOW_2); 

                    				current = grammarAccess.getJointTypeAccess().getFixedEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getJointTypeAccess().getFixedEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:3129:3: (enumLiteral_1= 'revolute' )
                    {
                    // InternalMyDsl.g:3129:3: (enumLiteral_1= 'revolute' )
                    // InternalMyDsl.g:3130:4: enumLiteral_1= 'revolute'
                    {
                    enumLiteral_1=(Token)match(input,79,FOLLOW_2); 

                    				current = grammarAccess.getJointTypeAccess().getRevoluteEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getJointTypeAccess().getRevoluteEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:3137:3: (enumLiteral_2= 'prismatic' )
                    {
                    // InternalMyDsl.g:3137:3: (enumLiteral_2= 'prismatic' )
                    // InternalMyDsl.g:3138:4: enumLiteral_2= 'prismatic'
                    {
                    enumLiteral_2=(Token)match(input,80,FOLLOW_2); 

                    				current = grammarAccess.getJointTypeAccess().getPrismaticEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getJointTypeAccess().getPrismaticEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:3145:3: (enumLiteral_3= 'continuous' )
                    {
                    // InternalMyDsl.g:3145:3: (enumLiteral_3= 'continuous' )
                    // InternalMyDsl.g:3146:4: enumLiteral_3= 'continuous'
                    {
                    enumLiteral_3=(Token)match(input,81,FOLLOW_2); 

                    				current = grammarAccess.getJointTypeAccess().getContinuousEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getJointTypeAccess().getContinuousEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleJointType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0040000000001002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000004004040002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000004004041000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000020L,0x0000000000002000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000A88030000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000E00000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000002000000010L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000A88020000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000010000000010L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000100000000010L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000400000000010L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0004000000000010L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000000L,0x000000000003C000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0C00000020000002L,0x0000000000000049L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x1000000000000010L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x8000000000000020L,0x0000000000002000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000022L,0x0000000000002000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000006L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000006L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000030L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000030L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000080L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000700L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000600L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000020L,0x0000000000003000L});

}