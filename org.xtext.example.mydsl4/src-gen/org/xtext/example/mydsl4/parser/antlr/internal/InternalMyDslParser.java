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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Robot'", "'Link'", "'def'", "'reuse'", "'edit'", "'add'", "'.'", "'Inertial'", "'Inertia'", "'ixx'", "'ixy'", "'ixz'", "'iyy'", "'iyz'", "'izz'", "'Visual'", "'Geometry'", "'Material'", "'Origin'", "'x'", "'y'", "'z'", "'roll'", "'pitch'", "'yaw'", "'Mass'", "'massKilogram'", "'Collision'", "'Box'", "'height'", "'length'", "'width'", "'Cylinder'", "'radius'", "'Mesh'", "'pathToFile'", "'Sphere'", "'Texture'", "'Color'", "'red'", "'green'", "'blue'", "'alpha'", "'Joint'", "'ChildOf'", "'ParentOf'", "'Type'", "'isReuseOf'", "'e'", "'+'", "'-'", "'fixed'"
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
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
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
    // InternalMyDsl.g:1899:1: ruleJoint returns [EObject current=null] : (otherlv_0= 'Joint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'ChildOf' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'ParentOf' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'Type' ( (lv_type_7_0= ruleJointType ) ) (otherlv_8= 'isReuseOf' ( (otherlv_9= RULE_ID ) ) )? ) ;
    public final EObject ruleJoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Enumerator lv_type_7_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1905:2: ( (otherlv_0= 'Joint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'ChildOf' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'ParentOf' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'Type' ( (lv_type_7_0= ruleJointType ) ) (otherlv_8= 'isReuseOf' ( (otherlv_9= RULE_ID ) ) )? ) )
            // InternalMyDsl.g:1906:2: (otherlv_0= 'Joint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'ChildOf' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'ParentOf' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'Type' ( (lv_type_7_0= ruleJointType ) ) (otherlv_8= 'isReuseOf' ( (otherlv_9= RULE_ID ) ) )? )
            {
            // InternalMyDsl.g:1906:2: (otherlv_0= 'Joint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'ChildOf' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'ParentOf' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'Type' ( (lv_type_7_0= ruleJointType ) ) (otherlv_8= 'isReuseOf' ( (otherlv_9= RULE_ID ) ) )? )
            // InternalMyDsl.g:1907:3: otherlv_0= 'Joint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'ChildOf' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'ParentOf' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'Type' ( (lv_type_7_0= ruleJointType ) ) (otherlv_8= 'isReuseOf' ( (otherlv_9= RULE_ID ) ) )?
            {
            otherlv_0=(Token)match(input,54,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getJointAccess().getJointKeyword_0());
            		
            // InternalMyDsl.g:1911:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:1912:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:1912:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:1913:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_51); 

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

            otherlv_2=(Token)match(input,55,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getJointAccess().getChildOfKeyword_2());
            		
            // InternalMyDsl.g:1933:3: ( (otherlv_3= RULE_ID ) )
            // InternalMyDsl.g:1934:4: (otherlv_3= RULE_ID )
            {
            // InternalMyDsl.g:1934:4: (otherlv_3= RULE_ID )
            // InternalMyDsl.g:1935:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJointRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_52); 

            					newLeafNode(otherlv_3, grammarAccess.getJointAccess().getChildOfLinkCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,56,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getJointAccess().getParentOfKeyword_4());
            		
            // InternalMyDsl.g:1950:3: ( (otherlv_5= RULE_ID ) )
            // InternalMyDsl.g:1951:4: (otherlv_5= RULE_ID )
            {
            // InternalMyDsl.g:1951:4: (otherlv_5= RULE_ID )
            // InternalMyDsl.g:1952:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJointRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_53); 

            					newLeafNode(otherlv_5, grammarAccess.getJointAccess().getParentOfLinkCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,57,FOLLOW_54); 

            			newLeafNode(otherlv_6, grammarAccess.getJointAccess().getTypeKeyword_6());
            		
            // InternalMyDsl.g:1967:3: ( (lv_type_7_0= ruleJointType ) )
            // InternalMyDsl.g:1968:4: (lv_type_7_0= ruleJointType )
            {
            // InternalMyDsl.g:1968:4: (lv_type_7_0= ruleJointType )
            // InternalMyDsl.g:1969:5: lv_type_7_0= ruleJointType
            {

            					newCompositeNode(grammarAccess.getJointAccess().getTypeJointTypeEnumRuleCall_7_0());
            				
            pushFollow(FOLLOW_55);
            lv_type_7_0=ruleJointType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJointRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_7_0,
            						"org.xtext.example.mydsl4.MyDsl.JointType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1986:3: (otherlv_8= 'isReuseOf' ( (otherlv_9= RULE_ID ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==58) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalMyDsl.g:1987:4: otherlv_8= 'isReuseOf' ( (otherlv_9= RULE_ID ) )
                    {
                    otherlv_8=(Token)match(input,58,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getJointAccess().getIsReuseOfKeyword_8_0());
                    			
                    // InternalMyDsl.g:1991:4: ( (otherlv_9= RULE_ID ) )
                    // InternalMyDsl.g:1992:5: (otherlv_9= RULE_ID )
                    {
                    // InternalMyDsl.g:1992:5: (otherlv_9= RULE_ID )
                    // InternalMyDsl.g:1993:6: otherlv_9= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getJointRule());
                    						}
                    					
                    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_9, grammarAccess.getJointAccess().getIsReuseOfJointCrossReference_8_1_0());
                    					

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


    // $ANTLR start "entryRuleURDFAttrSignedNumeric"
    // InternalMyDsl.g:2009:1: entryRuleURDFAttrSignedNumeric returns [EObject current=null] : iv_ruleURDFAttrSignedNumeric= ruleURDFAttrSignedNumeric EOF ;
    public final EObject entryRuleURDFAttrSignedNumeric() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleURDFAttrSignedNumeric = null;


        try {
            // InternalMyDsl.g:2009:62: (iv_ruleURDFAttrSignedNumeric= ruleURDFAttrSignedNumeric EOF )
            // InternalMyDsl.g:2010:2: iv_ruleURDFAttrSignedNumeric= ruleURDFAttrSignedNumeric EOF
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
    // InternalMyDsl.g:2016:1: ruleURDFAttrSignedNumeric returns [EObject current=null] : ( (lv_value_0_0= ruleSIGNED_NUMERIC ) ) ;
    public final EObject ruleURDFAttrSignedNumeric() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2022:2: ( ( (lv_value_0_0= ruleSIGNED_NUMERIC ) ) )
            // InternalMyDsl.g:2023:2: ( (lv_value_0_0= ruleSIGNED_NUMERIC ) )
            {
            // InternalMyDsl.g:2023:2: ( (lv_value_0_0= ruleSIGNED_NUMERIC ) )
            // InternalMyDsl.g:2024:3: (lv_value_0_0= ruleSIGNED_NUMERIC )
            {
            // InternalMyDsl.g:2024:3: (lv_value_0_0= ruleSIGNED_NUMERIC )
            // InternalMyDsl.g:2025:4: lv_value_0_0= ruleSIGNED_NUMERIC
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
    // InternalMyDsl.g:2045:1: entryRuleURDFAttrFloat returns [EObject current=null] : iv_ruleURDFAttrFloat= ruleURDFAttrFloat EOF ;
    public final EObject entryRuleURDFAttrFloat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleURDFAttrFloat = null;


        try {
            // InternalMyDsl.g:2045:54: (iv_ruleURDFAttrFloat= ruleURDFAttrFloat EOF )
            // InternalMyDsl.g:2046:2: iv_ruleURDFAttrFloat= ruleURDFAttrFloat EOF
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
    // InternalMyDsl.g:2052:1: ruleURDFAttrFloat returns [EObject current=null] : ( (lv_value_0_0= ruleFLOAT ) ) ;
    public final EObject ruleURDFAttrFloat() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2058:2: ( ( (lv_value_0_0= ruleFLOAT ) ) )
            // InternalMyDsl.g:2059:2: ( (lv_value_0_0= ruleFLOAT ) )
            {
            // InternalMyDsl.g:2059:2: ( (lv_value_0_0= ruleFLOAT ) )
            // InternalMyDsl.g:2060:3: (lv_value_0_0= ruleFLOAT )
            {
            // InternalMyDsl.g:2060:3: (lv_value_0_0= ruleFLOAT )
            // InternalMyDsl.g:2061:4: lv_value_0_0= ruleFLOAT
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


    // $ANTLR start "entryRuleURDFAttrNumeric"
    // InternalMyDsl.g:2081:1: entryRuleURDFAttrNumeric returns [EObject current=null] : iv_ruleURDFAttrNumeric= ruleURDFAttrNumeric EOF ;
    public final EObject entryRuleURDFAttrNumeric() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleURDFAttrNumeric = null;


        try {
            // InternalMyDsl.g:2081:56: (iv_ruleURDFAttrNumeric= ruleURDFAttrNumeric EOF )
            // InternalMyDsl.g:2082:2: iv_ruleURDFAttrNumeric= ruleURDFAttrNumeric EOF
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
    // InternalMyDsl.g:2088:1: ruleURDFAttrNumeric returns [EObject current=null] : ( (lv_value_0_0= ruleNUMERIC ) ) ;
    public final EObject ruleURDFAttrNumeric() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2094:2: ( ( (lv_value_0_0= ruleNUMERIC ) ) )
            // InternalMyDsl.g:2095:2: ( (lv_value_0_0= ruleNUMERIC ) )
            {
            // InternalMyDsl.g:2095:2: ( (lv_value_0_0= ruleNUMERIC ) )
            // InternalMyDsl.g:2096:3: (lv_value_0_0= ruleNUMERIC )
            {
            // InternalMyDsl.g:2096:3: (lv_value_0_0= ruleNUMERIC )
            // InternalMyDsl.g:2097:4: lv_value_0_0= ruleNUMERIC
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
    // InternalMyDsl.g:2117:1: entryRuleURDFAttrSTRING returns [EObject current=null] : iv_ruleURDFAttrSTRING= ruleURDFAttrSTRING EOF ;
    public final EObject entryRuleURDFAttrSTRING() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleURDFAttrSTRING = null;


        try {
            // InternalMyDsl.g:2117:55: (iv_ruleURDFAttrSTRING= ruleURDFAttrSTRING EOF )
            // InternalMyDsl.g:2118:2: iv_ruleURDFAttrSTRING= ruleURDFAttrSTRING EOF
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
    // InternalMyDsl.g:2124:1: ruleURDFAttrSTRING returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleURDFAttrSTRING() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2130:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalMyDsl.g:2131:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalMyDsl.g:2131:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalMyDsl.g:2132:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalMyDsl.g:2132:3: (lv_value_0_0= RULE_STRING )
            // InternalMyDsl.g:2133:4: lv_value_0_0= RULE_STRING
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
    // InternalMyDsl.g:2152:1: entryRuleFLOAT returns [String current=null] : iv_ruleFLOAT= ruleFLOAT EOF ;
    public final String entryRuleFLOAT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFLOAT = null;


        try {
            // InternalMyDsl.g:2152:45: (iv_ruleFLOAT= ruleFLOAT EOF )
            // InternalMyDsl.g:2153:2: iv_ruleFLOAT= ruleFLOAT EOF
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
    // InternalMyDsl.g:2159:1: ruleFLOAT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleFLOAT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2165:2: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) )
            // InternalMyDsl.g:2166:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            {
            // InternalMyDsl.g:2166:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            // InternalMyDsl.g:2167:3: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_56); 

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
    // InternalMyDsl.g:2190:1: entryRuleSCIENTIFIC returns [String current=null] : iv_ruleSCIENTIFIC= ruleSCIENTIFIC EOF ;
    public final String entryRuleSCIENTIFIC() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSCIENTIFIC = null;


        try {
            // InternalMyDsl.g:2190:50: (iv_ruleSCIENTIFIC= ruleSCIENTIFIC EOF )
            // InternalMyDsl.g:2191:2: iv_ruleSCIENTIFIC= ruleSCIENTIFIC EOF
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
    // InternalMyDsl.g:2197:1: ruleSCIENTIFIC returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FLOAT_0= ruleFLOAT kw= 'e' (kw= '+' | kw= '-' )? this_INT_4= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleSCIENTIFIC() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_4=null;
        AntlrDatatypeRuleToken this_FLOAT_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2203:2: ( (this_FLOAT_0= ruleFLOAT kw= 'e' (kw= '+' | kw= '-' )? this_INT_4= RULE_INT ) )
            // InternalMyDsl.g:2204:2: (this_FLOAT_0= ruleFLOAT kw= 'e' (kw= '+' | kw= '-' )? this_INT_4= RULE_INT )
            {
            // InternalMyDsl.g:2204:2: (this_FLOAT_0= ruleFLOAT kw= 'e' (kw= '+' | kw= '-' )? this_INT_4= RULE_INT )
            // InternalMyDsl.g:2205:3: this_FLOAT_0= ruleFLOAT kw= 'e' (kw= '+' | kw= '-' )? this_INT_4= RULE_INT
            {

            			newCompositeNode(grammarAccess.getSCIENTIFICAccess().getFLOATParserRuleCall_0());
            		
            pushFollow(FOLLOW_57);
            this_FLOAT_0=ruleFLOAT();

            state._fsp--;


            			current.merge(this_FLOAT_0);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,59,FOLLOW_58); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getSCIENTIFICAccess().getEKeyword_1());
            		
            // InternalMyDsl.g:2220:3: (kw= '+' | kw= '-' )?
            int alt30=3;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==60) ) {
                alt30=1;
            }
            else if ( (LA30_0==61) ) {
                alt30=2;
            }
            switch (alt30) {
                case 1 :
                    // InternalMyDsl.g:2221:4: kw= '+'
                    {
                    kw=(Token)match(input,60,FOLLOW_47); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getSCIENTIFICAccess().getPlusSignKeyword_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2227:4: kw= '-'
                    {
                    kw=(Token)match(input,61,FOLLOW_47); 

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
    // InternalMyDsl.g:2244:1: entryRuleSIGNED_NUMERIC returns [String current=null] : iv_ruleSIGNED_NUMERIC= ruleSIGNED_NUMERIC EOF ;
    public final String entryRuleSIGNED_NUMERIC() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSIGNED_NUMERIC = null;


        try {
            // InternalMyDsl.g:2244:54: (iv_ruleSIGNED_NUMERIC= ruleSIGNED_NUMERIC EOF )
            // InternalMyDsl.g:2245:2: iv_ruleSIGNED_NUMERIC= ruleSIGNED_NUMERIC EOF
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
    // InternalMyDsl.g:2251:1: ruleSIGNED_NUMERIC returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT | this_FLOAT_2= ruleFLOAT | this_SCIENTIFIC_3= ruleSCIENTIFIC ) ) ;
    public final AntlrDatatypeRuleToken ruleSIGNED_NUMERIC() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        AntlrDatatypeRuleToken this_FLOAT_2 = null;

        AntlrDatatypeRuleToken this_SCIENTIFIC_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2257:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT | this_FLOAT_2= ruleFLOAT | this_SCIENTIFIC_3= ruleSCIENTIFIC ) ) )
            // InternalMyDsl.g:2258:2: ( (kw= '-' )? (this_INT_1= RULE_INT | this_FLOAT_2= ruleFLOAT | this_SCIENTIFIC_3= ruleSCIENTIFIC ) )
            {
            // InternalMyDsl.g:2258:2: ( (kw= '-' )? (this_INT_1= RULE_INT | this_FLOAT_2= ruleFLOAT | this_SCIENTIFIC_3= ruleSCIENTIFIC ) )
            // InternalMyDsl.g:2259:3: (kw= '-' )? (this_INT_1= RULE_INT | this_FLOAT_2= ruleFLOAT | this_SCIENTIFIC_3= ruleSCIENTIFIC )
            {
            // InternalMyDsl.g:2259:3: (kw= '-' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==61) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalMyDsl.g:2260:4: kw= '-'
                    {
                    kw=(Token)match(input,61,FOLLOW_15); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getSIGNED_NUMERICAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:2266:3: (this_INT_1= RULE_INT | this_FLOAT_2= ruleFLOAT | this_SCIENTIFIC_3= ruleSCIENTIFIC )
            int alt32=3;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_INT) ) {
                int LA32_1 = input.LA(2);

                if ( (LA32_1==17) ) {
                    int LA32_2 = input.LA(3);

                    if ( (LA32_2==RULE_INT) ) {
                        int LA32_4 = input.LA(4);

                        if ( (LA32_4==EOF||LA32_4==12||LA32_4==18||(LA32_4>=21 && LA32_4<=26)||(LA32_4>=28 && LA32_4<=29)||(LA32_4>=31 && LA32_4<=36)||LA32_4==38||LA32_4==54) ) {
                            alt32=2;
                        }
                        else if ( (LA32_4==59) ) {
                            alt32=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 32, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 32, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA32_1==EOF||LA32_1==12||LA32_1==18||(LA32_1>=21 && LA32_1<=26)||(LA32_1>=28 && LA32_1<=29)||(LA32_1>=31 && LA32_1<=36)||LA32_1==38||LA32_1==54) ) {
                    alt32=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 32, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalMyDsl.g:2267:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getSIGNED_NUMERICAccess().getINTTerminalRuleCall_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2275:4: this_FLOAT_2= ruleFLOAT
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
                    // InternalMyDsl.g:2286:4: this_SCIENTIFIC_3= ruleSCIENTIFIC
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
    // InternalMyDsl.g:2301:1: entryRuleNUMERIC returns [String current=null] : iv_ruleNUMERIC= ruleNUMERIC EOF ;
    public final String entryRuleNUMERIC() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNUMERIC = null;


        try {
            // InternalMyDsl.g:2301:47: (iv_ruleNUMERIC= ruleNUMERIC EOF )
            // InternalMyDsl.g:2302:2: iv_ruleNUMERIC= ruleNUMERIC EOF
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
    // InternalMyDsl.g:2308:1: ruleNUMERIC returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_FLOAT_1= ruleFLOAT | this_SCIENTIFIC_2= ruleSCIENTIFIC ) ;
    public final AntlrDatatypeRuleToken ruleNUMERIC() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        AntlrDatatypeRuleToken this_FLOAT_1 = null;

        AntlrDatatypeRuleToken this_SCIENTIFIC_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2314:2: ( (this_INT_0= RULE_INT | this_FLOAT_1= ruleFLOAT | this_SCIENTIFIC_2= ruleSCIENTIFIC ) )
            // InternalMyDsl.g:2315:2: (this_INT_0= RULE_INT | this_FLOAT_1= ruleFLOAT | this_SCIENTIFIC_2= ruleSCIENTIFIC )
            {
            // InternalMyDsl.g:2315:2: (this_INT_0= RULE_INT | this_FLOAT_1= ruleFLOAT | this_SCIENTIFIC_2= ruleSCIENTIFIC )
            int alt33=3;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_INT) ) {
                int LA33_1 = input.LA(2);

                if ( (LA33_1==17) ) {
                    int LA33_2 = input.LA(3);

                    if ( (LA33_2==RULE_INT) ) {
                        int LA33_4 = input.LA(4);

                        if ( (LA33_4==EOF||LA33_4==12||LA33_4==18||LA33_4==26||(LA33_4>=28 && LA33_4<=29)||(LA33_4>=38 && LA33_4<=39)||(LA33_4>=41 && LA33_4<=43)||LA33_4==45||LA33_4==47||LA33_4==54) ) {
                            alt33=2;
                        }
                        else if ( (LA33_4==59) ) {
                            alt33=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 33, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 33, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA33_1==EOF||LA33_1==12||LA33_1==18||LA33_1==26||(LA33_1>=28 && LA33_1<=29)||(LA33_1>=38 && LA33_1<=39)||(LA33_1>=41 && LA33_1<=43)||LA33_1==45||LA33_1==47||LA33_1==54) ) {
                    alt33=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // InternalMyDsl.g:2316:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getNUMERICAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2324:3: this_FLOAT_1= ruleFLOAT
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
                    // InternalMyDsl.g:2335:3: this_SCIENTIFIC_2= ruleSCIENTIFIC
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
    // InternalMyDsl.g:2349:1: ruleJointType returns [Enumerator current=null] : (enumLiteral_0= 'fixed' ) ;
    public final Enumerator ruleJointType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2355:2: ( (enumLiteral_0= 'fixed' ) )
            // InternalMyDsl.g:2356:2: (enumLiteral_0= 'fixed' )
            {
            // InternalMyDsl.g:2356:2: (enumLiteral_0= 'fixed' )
            // InternalMyDsl.g:2357:3: enumLiteral_0= 'fixed'
            {
            enumLiteral_0=(Token)match(input,62,FOLLOW_2); 

            			current = grammarAccess.getJointTypeAccess().getFixedEnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getJointTypeAccess().getFixedEnumLiteralDeclaration());
            		

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
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x2000000000000040L});
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
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0004000000000010L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x3000000000000040L});

}