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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Robot'", "'Topology'", "'->'", "'r->'", "'p->'", "'c->'", "'Link'", "'def'", "'reuse'", "'Add'", "'to'", "'link'", "'joint'", "'add'", "'edit'", "'='", "'.'", "'Inertial'", "'Inertia'", "'ixx'", "'ixy'", "'ixz'", "'iyy'", "'iyz'", "'izz'", "'Visual'", "'Geometry'", "'Material'", "'Origin'", "'x'", "'y'", "'z'", "'roll'", "'pitch'", "'yaw'", "'Mass'", "'massKilogram'", "'Collision'", "'Box'", "'height'", "'length'", "'width'", "'Cylinder'", "'radius'", "'Mesh'", "'pathToFile'", "'Sphere'", "'Texture'", "'Color'", "'red'", "'green'", "'blue'", "'alpha'", "'Joint'", "'ChildOf'", "'ParentOf'", "'Type'", "'Axis'", "'Limit'", "'effort'", "'velocity'", "'lower'", "'upper'", "'Calibration'", "'rising'", "'falling'", "'Dynamics'", "'friction'", "'damping'", "'SafetyController'", "'k_velocity'", "'k_position'", "'softLowerLimit'", "'softUpperLimit'", "'e'", "'+'", "'-'", "'fixed'", "'revolute'", "'prismatic'", "'continuous'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int RULE_INT=5;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
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
    public static final int T__91=91;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
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
    // InternalMyDsl.g:72:1: ruleRobot returns [EObject current=null] : (otherlv_0= 'Robot' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= 'Topology' ( (lv_topologies_3_0= ruleTopology ) ) ) | ( (lv_links_4_0= ruleLink ) ) | ( (lv_joint_5_0= ruleJoint ) ) | ( (lv_addto_6_0= ruleAddTo ) ) )* ) ;
    public final EObject ruleRobot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_topologies_3_0 = null;

        EObject lv_links_4_0 = null;

        EObject lv_joint_5_0 = null;

        EObject lv_addto_6_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:78:2: ( (otherlv_0= 'Robot' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= 'Topology' ( (lv_topologies_3_0= ruleTopology ) ) ) | ( (lv_links_4_0= ruleLink ) ) | ( (lv_joint_5_0= ruleJoint ) ) | ( (lv_addto_6_0= ruleAddTo ) ) )* ) )
            // InternalMyDsl.g:79:2: (otherlv_0= 'Robot' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= 'Topology' ( (lv_topologies_3_0= ruleTopology ) ) ) | ( (lv_links_4_0= ruleLink ) ) | ( (lv_joint_5_0= ruleJoint ) ) | ( (lv_addto_6_0= ruleAddTo ) ) )* )
            {
            // InternalMyDsl.g:79:2: (otherlv_0= 'Robot' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= 'Topology' ( (lv_topologies_3_0= ruleTopology ) ) ) | ( (lv_links_4_0= ruleLink ) ) | ( (lv_joint_5_0= ruleJoint ) ) | ( (lv_addto_6_0= ruleAddTo ) ) )* )
            // InternalMyDsl.g:80:3: otherlv_0= 'Robot' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= 'Topology' ( (lv_topologies_3_0= ruleTopology ) ) ) | ( (lv_links_4_0= ruleLink ) ) | ( (lv_joint_5_0= ruleJoint ) ) | ( (lv_addto_6_0= ruleAddTo ) ) )*
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

            // InternalMyDsl.g:102:3: ( (otherlv_2= 'Topology' ( (lv_topologies_3_0= ruleTopology ) ) ) | ( (lv_links_4_0= ruleLink ) ) | ( (lv_joint_5_0= ruleJoint ) ) | ( (lv_addto_6_0= ruleAddTo ) ) )*
            loop1:
            do {
                int alt1=5;
                switch ( input.LA(1) ) {
                case 12:
                    {
                    alt1=1;
                    }
                    break;
                case 17:
                    {
                    alt1=2;
                    }
                    break;
                case 64:
                    {
                    alt1=3;
                    }
                    break;
                case 20:
                    {
                    alt1=4;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:103:4: (otherlv_2= 'Topology' ( (lv_topologies_3_0= ruleTopology ) ) )
            	    {
            	    // InternalMyDsl.g:103:4: (otherlv_2= 'Topology' ( (lv_topologies_3_0= ruleTopology ) ) )
            	    // InternalMyDsl.g:104:5: otherlv_2= 'Topology' ( (lv_topologies_3_0= ruleTopology ) )
            	    {
            	    otherlv_2=(Token)match(input,12,FOLLOW_3); 

            	    					newLeafNode(otherlv_2, grammarAccess.getRobotAccess().getTopologyKeyword_2_0_0());
            	    				
            	    // InternalMyDsl.g:108:5: ( (lv_topologies_3_0= ruleTopology ) )
            	    // InternalMyDsl.g:109:6: (lv_topologies_3_0= ruleTopology )
            	    {
            	    // InternalMyDsl.g:109:6: (lv_topologies_3_0= ruleTopology )
            	    // InternalMyDsl.g:110:7: lv_topologies_3_0= ruleTopology
            	    {

            	    							newCompositeNode(grammarAccess.getRobotAccess().getTopologiesTopologyParserRuleCall_2_0_1_0());
            	    						
            	    pushFollow(FOLLOW_4);
            	    lv_topologies_3_0=ruleTopology();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getRobotRule());
            	    							}
            	    							add(
            	    								current,
            	    								"topologies",
            	    								lv_topologies_3_0,
            	    								"org.xtext.example.mydsl4.MyDsl.Topology");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMyDsl.g:129:4: ( (lv_links_4_0= ruleLink ) )
            	    {
            	    // InternalMyDsl.g:129:4: ( (lv_links_4_0= ruleLink ) )
            	    // InternalMyDsl.g:130:5: (lv_links_4_0= ruleLink )
            	    {
            	    // InternalMyDsl.g:130:5: (lv_links_4_0= ruleLink )
            	    // InternalMyDsl.g:131:6: lv_links_4_0= ruleLink
            	    {

            	    						newCompositeNode(grammarAccess.getRobotAccess().getLinksLinkParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_links_4_0=ruleLink();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRobotRule());
            	    						}
            	    						add(
            	    							current,
            	    							"links",
            	    							lv_links_4_0,
            	    							"org.xtext.example.mydsl4.MyDsl.Link");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalMyDsl.g:149:4: ( (lv_joint_5_0= ruleJoint ) )
            	    {
            	    // InternalMyDsl.g:149:4: ( (lv_joint_5_0= ruleJoint ) )
            	    // InternalMyDsl.g:150:5: (lv_joint_5_0= ruleJoint )
            	    {
            	    // InternalMyDsl.g:150:5: (lv_joint_5_0= ruleJoint )
            	    // InternalMyDsl.g:151:6: lv_joint_5_0= ruleJoint
            	    {

            	    						newCompositeNode(grammarAccess.getRobotAccess().getJointJointParserRuleCall_2_2_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_joint_5_0=ruleJoint();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRobotRule());
            	    						}
            	    						add(
            	    							current,
            	    							"joint",
            	    							lv_joint_5_0,
            	    							"org.xtext.example.mydsl4.MyDsl.Joint");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalMyDsl.g:169:4: ( (lv_addto_6_0= ruleAddTo ) )
            	    {
            	    // InternalMyDsl.g:169:4: ( (lv_addto_6_0= ruleAddTo ) )
            	    // InternalMyDsl.g:170:5: (lv_addto_6_0= ruleAddTo )
            	    {
            	    // InternalMyDsl.g:170:5: (lv_addto_6_0= ruleAddTo )
            	    // InternalMyDsl.g:171:6: lv_addto_6_0= ruleAddTo
            	    {

            	    						newCompositeNode(grammarAccess.getRobotAccess().getAddtoAddToParserRuleCall_2_3_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_addto_6_0=ruleAddTo();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRobotRule());
            	    						}
            	    						add(
            	    							current,
            	    							"addto",
            	    							lv_addto_6_0,
            	    							"org.xtext.example.mydsl4.MyDsl.AddTo");
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


    // $ANTLR start "entryRuleTopology"
    // InternalMyDsl.g:193:1: entryRuleTopology returns [EObject current=null] : iv_ruleTopology= ruleTopology EOF ;
    public final EObject entryRuleTopology() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTopology = null;


        try {
            // InternalMyDsl.g:193:49: (iv_ruleTopology= ruleTopology EOF )
            // InternalMyDsl.g:194:2: iv_ruleTopology= ruleTopology EOF
            {
             newCompositeNode(grammarAccess.getTopologyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTopology=ruleTopology();

            state._fsp--;

             current =iv_ruleTopology; 
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
    // $ANTLR end "entryRuleTopology"


    // $ANTLR start "ruleTopology"
    // InternalMyDsl.g:200:1: ruleTopology returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_joint_1_0= ruleJointRef ) ) ( (lv_child_2_0= ruleTopology ) ) )? ) ;
    public final EObject ruleTopology() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_joint_1_0 = null;

        EObject lv_child_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:206:2: ( ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_joint_1_0= ruleJointRef ) ) ( (lv_child_2_0= ruleTopology ) ) )? ) )
            // InternalMyDsl.g:207:2: ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_joint_1_0= ruleJointRef ) ) ( (lv_child_2_0= ruleTopology ) ) )? )
            {
            // InternalMyDsl.g:207:2: ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_joint_1_0= ruleJointRef ) ) ( (lv_child_2_0= ruleTopology ) ) )? )
            // InternalMyDsl.g:208:3: ( (otherlv_0= RULE_ID ) ) ( ( (lv_joint_1_0= ruleJointRef ) ) ( (lv_child_2_0= ruleTopology ) ) )?
            {
            // InternalMyDsl.g:208:3: ( (otherlv_0= RULE_ID ) )
            // InternalMyDsl.g:209:4: (otherlv_0= RULE_ID )
            {
            // InternalMyDsl.g:209:4: (otherlv_0= RULE_ID )
            // InternalMyDsl.g:210:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTopologyRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(otherlv_0, grammarAccess.getTopologyAccess().getParentLinkCrossReference_0_0());
            				

            }


            }

            // InternalMyDsl.g:221:3: ( ( (lv_joint_1_0= ruleJointRef ) ) ( (lv_child_2_0= ruleTopology ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=13 && LA2_0<=16)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:222:4: ( (lv_joint_1_0= ruleJointRef ) ) ( (lv_child_2_0= ruleTopology ) )
                    {
                    // InternalMyDsl.g:222:4: ( (lv_joint_1_0= ruleJointRef ) )
                    // InternalMyDsl.g:223:5: (lv_joint_1_0= ruleJointRef )
                    {
                    // InternalMyDsl.g:223:5: (lv_joint_1_0= ruleJointRef )
                    // InternalMyDsl.g:224:6: lv_joint_1_0= ruleJointRef
                    {

                    						newCompositeNode(grammarAccess.getTopologyAccess().getJointJointRefParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_3);
                    lv_joint_1_0=ruleJointRef();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTopologyRule());
                    						}
                    						set(
                    							current,
                    							"joint",
                    							lv_joint_1_0,
                    							"org.xtext.example.mydsl4.MyDsl.JointRef");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:241:4: ( (lv_child_2_0= ruleTopology ) )
                    // InternalMyDsl.g:242:5: (lv_child_2_0= ruleTopology )
                    {
                    // InternalMyDsl.g:242:5: (lv_child_2_0= ruleTopology )
                    // InternalMyDsl.g:243:6: lv_child_2_0= ruleTopology
                    {

                    						newCompositeNode(grammarAccess.getTopologyAccess().getChildTopologyParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_child_2_0=ruleTopology();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTopologyRule());
                    						}
                    						set(
                    							current,
                    							"child",
                    							lv_child_2_0,
                    							"org.xtext.example.mydsl4.MyDsl.Topology");
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
    // $ANTLR end "ruleTopology"


    // $ANTLR start "entryRuleJointRef"
    // InternalMyDsl.g:265:1: entryRuleJointRef returns [EObject current=null] : iv_ruleJointRef= ruleJointRef EOF ;
    public final EObject entryRuleJointRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJointRef = null;


        try {
            // InternalMyDsl.g:265:49: (iv_ruleJointRef= ruleJointRef EOF )
            // InternalMyDsl.g:266:2: iv_ruleJointRef= ruleJointRef EOF
            {
             newCompositeNode(grammarAccess.getJointRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJointRef=ruleJointRef();

            state._fsp--;

             current =iv_ruleJointRef; 
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
    // $ANTLR end "entryRuleJointRef"


    // $ANTLR start "ruleJointRef"
    // InternalMyDsl.g:272:1: ruleJointRef returns [EObject current=null] : ( ( (lv_fix_0_0= '->' ) ) | ( (lv_rev_1_0= 'r->' ) ) | ( (lv_pris_2_0= 'p->' ) ) | ( (lv_cont_3_0= 'c->' ) ) ) ;
    public final EObject ruleJointRef() throws RecognitionException {
        EObject current = null;

        Token lv_fix_0_0=null;
        Token lv_rev_1_0=null;
        Token lv_pris_2_0=null;
        Token lv_cont_3_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:278:2: ( ( ( (lv_fix_0_0= '->' ) ) | ( (lv_rev_1_0= 'r->' ) ) | ( (lv_pris_2_0= 'p->' ) ) | ( (lv_cont_3_0= 'c->' ) ) ) )
            // InternalMyDsl.g:279:2: ( ( (lv_fix_0_0= '->' ) ) | ( (lv_rev_1_0= 'r->' ) ) | ( (lv_pris_2_0= 'p->' ) ) | ( (lv_cont_3_0= 'c->' ) ) )
            {
            // InternalMyDsl.g:279:2: ( ( (lv_fix_0_0= '->' ) ) | ( (lv_rev_1_0= 'r->' ) ) | ( (lv_pris_2_0= 'p->' ) ) | ( (lv_cont_3_0= 'c->' ) ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt3=1;
                }
                break;
            case 14:
                {
                alt3=2;
                }
                break;
            case 15:
                {
                alt3=3;
                }
                break;
            case 16:
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
                    // InternalMyDsl.g:280:3: ( (lv_fix_0_0= '->' ) )
                    {
                    // InternalMyDsl.g:280:3: ( (lv_fix_0_0= '->' ) )
                    // InternalMyDsl.g:281:4: (lv_fix_0_0= '->' )
                    {
                    // InternalMyDsl.g:281:4: (lv_fix_0_0= '->' )
                    // InternalMyDsl.g:282:5: lv_fix_0_0= '->'
                    {
                    lv_fix_0_0=(Token)match(input,13,FOLLOW_2); 

                    					newLeafNode(lv_fix_0_0, grammarAccess.getJointRefAccess().getFixHyphenMinusGreaterThanSignKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getJointRefRule());
                    					}
                    					setWithLastConsumed(current, "fix", lv_fix_0_0, "->");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:295:3: ( (lv_rev_1_0= 'r->' ) )
                    {
                    // InternalMyDsl.g:295:3: ( (lv_rev_1_0= 'r->' ) )
                    // InternalMyDsl.g:296:4: (lv_rev_1_0= 'r->' )
                    {
                    // InternalMyDsl.g:296:4: (lv_rev_1_0= 'r->' )
                    // InternalMyDsl.g:297:5: lv_rev_1_0= 'r->'
                    {
                    lv_rev_1_0=(Token)match(input,14,FOLLOW_2); 

                    					newLeafNode(lv_rev_1_0, grammarAccess.getJointRefAccess().getRevRKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getJointRefRule());
                    					}
                    					setWithLastConsumed(current, "rev", lv_rev_1_0, "r->");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:310:3: ( (lv_pris_2_0= 'p->' ) )
                    {
                    // InternalMyDsl.g:310:3: ( (lv_pris_2_0= 'p->' ) )
                    // InternalMyDsl.g:311:4: (lv_pris_2_0= 'p->' )
                    {
                    // InternalMyDsl.g:311:4: (lv_pris_2_0= 'p->' )
                    // InternalMyDsl.g:312:5: lv_pris_2_0= 'p->'
                    {
                    lv_pris_2_0=(Token)match(input,15,FOLLOW_2); 

                    					newLeafNode(lv_pris_2_0, grammarAccess.getJointRefAccess().getPrisPKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getJointRefRule());
                    					}
                    					setWithLastConsumed(current, "pris", lv_pris_2_0, "p->");
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:325:3: ( (lv_cont_3_0= 'c->' ) )
                    {
                    // InternalMyDsl.g:325:3: ( (lv_cont_3_0= 'c->' ) )
                    // InternalMyDsl.g:326:4: (lv_cont_3_0= 'c->' )
                    {
                    // InternalMyDsl.g:326:4: (lv_cont_3_0= 'c->' )
                    // InternalMyDsl.g:327:5: lv_cont_3_0= 'c->'
                    {
                    lv_cont_3_0=(Token)match(input,16,FOLLOW_2); 

                    					newLeafNode(lv_cont_3_0, grammarAccess.getJointRefAccess().getContCKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getJointRefRule());
                    					}
                    					setWithLastConsumed(current, "cont", lv_cont_3_0, "c->");
                    				

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
    // $ANTLR end "ruleJointRef"


    // $ANTLR start "entryRuleReUseAble"
    // InternalMyDsl.g:343:1: entryRuleReUseAble returns [EObject current=null] : iv_ruleReUseAble= ruleReUseAble EOF ;
    public final EObject entryRuleReUseAble() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReUseAble = null;


        try {
            // InternalMyDsl.g:343:50: (iv_ruleReUseAble= ruleReUseAble EOF )
            // InternalMyDsl.g:344:2: iv_ruleReUseAble= ruleReUseAble EOF
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
    // InternalMyDsl.g:350:1: ruleReUseAble returns [EObject current=null] : (this_Link_0= ruleLink | this_Visual_1= ruleVisual | this_Inertial_2= ruleInertial | this_Collision_3= ruleCollision ) ;
    public final EObject ruleReUseAble() throws RecognitionException {
        EObject current = null;

        EObject this_Link_0 = null;

        EObject this_Visual_1 = null;

        EObject this_Inertial_2 = null;

        EObject this_Collision_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:356:2: ( (this_Link_0= ruleLink | this_Visual_1= ruleVisual | this_Inertial_2= ruleInertial | this_Collision_3= ruleCollision ) )
            // InternalMyDsl.g:357:2: (this_Link_0= ruleLink | this_Visual_1= ruleVisual | this_Inertial_2= ruleInertial | this_Collision_3= ruleCollision )
            {
            // InternalMyDsl.g:357:2: (this_Link_0= ruleLink | this_Visual_1= ruleVisual | this_Inertial_2= ruleInertial | this_Collision_3= ruleCollision )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt4=1;
                }
                break;
            case 36:
                {
                alt4=2;
                }
                break;
            case 28:
                {
                alt4=3;
                }
                break;
            case 48:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:358:3: this_Link_0= ruleLink
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
                    // InternalMyDsl.g:367:3: this_Visual_1= ruleVisual
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
                    // InternalMyDsl.g:376:3: this_Inertial_2= ruleInertial
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
                    // InternalMyDsl.g:385:3: this_Collision_3= ruleCollision
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


    // $ANTLR start "entryRuleReUseAbleReduced"
    // InternalMyDsl.g:397:1: entryRuleReUseAbleReduced returns [EObject current=null] : iv_ruleReUseAbleReduced= ruleReUseAbleReduced EOF ;
    public final EObject entryRuleReUseAbleReduced() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReUseAbleReduced = null;


        try {
            // InternalMyDsl.g:397:57: (iv_ruleReUseAbleReduced= ruleReUseAbleReduced EOF )
            // InternalMyDsl.g:398:2: iv_ruleReUseAbleReduced= ruleReUseAbleReduced EOF
            {
             newCompositeNode(grammarAccess.getReUseAbleReducedRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReUseAbleReduced=ruleReUseAbleReduced();

            state._fsp--;

             current =iv_ruleReUseAbleReduced; 
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
    // $ANTLR end "entryRuleReUseAbleReduced"


    // $ANTLR start "ruleReUseAbleReduced"
    // InternalMyDsl.g:404:1: ruleReUseAbleReduced returns [EObject current=null] : (this_Visual_0= ruleVisual | this_Inertial_1= ruleInertial | this_Collision_2= ruleCollision ) ;
    public final EObject ruleReUseAbleReduced() throws RecognitionException {
        EObject current = null;

        EObject this_Visual_0 = null;

        EObject this_Inertial_1 = null;

        EObject this_Collision_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:410:2: ( (this_Visual_0= ruleVisual | this_Inertial_1= ruleInertial | this_Collision_2= ruleCollision ) )
            // InternalMyDsl.g:411:2: (this_Visual_0= ruleVisual | this_Inertial_1= ruleInertial | this_Collision_2= ruleCollision )
            {
            // InternalMyDsl.g:411:2: (this_Visual_0= ruleVisual | this_Inertial_1= ruleInertial | this_Collision_2= ruleCollision )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt5=1;
                }
                break;
            case 28:
                {
                alt5=2;
                }
                break;
            case 48:
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
                    // InternalMyDsl.g:412:3: this_Visual_0= ruleVisual
                    {

                    			newCompositeNode(grammarAccess.getReUseAbleReducedAccess().getVisualParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Visual_0=ruleVisual();

                    state._fsp--;


                    			current = this_Visual_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:421:3: this_Inertial_1= ruleInertial
                    {

                    			newCompositeNode(grammarAccess.getReUseAbleReducedAccess().getInertialParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Inertial_1=ruleInertial();

                    state._fsp--;


                    			current = this_Inertial_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:430:3: this_Collision_2= ruleCollision
                    {

                    			newCompositeNode(grammarAccess.getReUseAbleReducedAccess().getCollisionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Collision_2=ruleCollision();

                    state._fsp--;


                    			current = this_Collision_2;
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
    // $ANTLR end "ruleReUseAbleReduced"


    // $ANTLR start "entryRuleReUseAbleReduce"
    // InternalMyDsl.g:442:1: entryRuleReUseAbleReduce returns [EObject current=null] : iv_ruleReUseAbleReduce= ruleReUseAbleReduce EOF ;
    public final EObject entryRuleReUseAbleReduce() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReUseAbleReduce = null;


        try {
            // InternalMyDsl.g:442:56: (iv_ruleReUseAbleReduce= ruleReUseAbleReduce EOF )
            // InternalMyDsl.g:443:2: iv_ruleReUseAbleReduce= ruleReUseAbleReduce EOF
            {
             newCompositeNode(grammarAccess.getReUseAbleReduceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReUseAbleReduce=ruleReUseAbleReduce();

            state._fsp--;

             current =iv_ruleReUseAbleReduce; 
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
    // $ANTLR end "entryRuleReUseAbleReduce"


    // $ANTLR start "ruleReUseAbleReduce"
    // InternalMyDsl.g:449:1: ruleReUseAbleReduce returns [EObject current=null] : (this_Origin_0= ruleOrigin | this_Axis_1= ruleAxis | this_Limit_2= ruleLimit | this_Calibration_3= ruleCalibration | this_Dynamics_4= ruleDynamics | this_SafetyController_5= ruleSafetyController ) ;
    public final EObject ruleReUseAbleReduce() throws RecognitionException {
        EObject current = null;

        EObject this_Origin_0 = null;

        EObject this_Axis_1 = null;

        EObject this_Limit_2 = null;

        EObject this_Calibration_3 = null;

        EObject this_Dynamics_4 = null;

        EObject this_SafetyController_5 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:455:2: ( (this_Origin_0= ruleOrigin | this_Axis_1= ruleAxis | this_Limit_2= ruleLimit | this_Calibration_3= ruleCalibration | this_Dynamics_4= ruleDynamics | this_SafetyController_5= ruleSafetyController ) )
            // InternalMyDsl.g:456:2: (this_Origin_0= ruleOrigin | this_Axis_1= ruleAxis | this_Limit_2= ruleLimit | this_Calibration_3= ruleCalibration | this_Dynamics_4= ruleDynamics | this_SafetyController_5= ruleSafetyController )
            {
            // InternalMyDsl.g:456:2: (this_Origin_0= ruleOrigin | this_Axis_1= ruleAxis | this_Limit_2= ruleLimit | this_Calibration_3= ruleCalibration | this_Dynamics_4= ruleDynamics | this_SafetyController_5= ruleSafetyController )
            int alt6=6;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt6=1;
                }
                break;
            case 68:
                {
                alt6=2;
                }
                break;
            case 69:
                {
                alt6=3;
                }
                break;
            case 74:
                {
                alt6=4;
                }
                break;
            case 77:
                {
                alt6=5;
                }
                break;
            case 80:
                {
                alt6=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:457:3: this_Origin_0= ruleOrigin
                    {

                    			newCompositeNode(grammarAccess.getReUseAbleReduceAccess().getOriginParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Origin_0=ruleOrigin();

                    state._fsp--;


                    			current = this_Origin_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:466:3: this_Axis_1= ruleAxis
                    {

                    			newCompositeNode(grammarAccess.getReUseAbleReduceAccess().getAxisParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Axis_1=ruleAxis();

                    state._fsp--;


                    			current = this_Axis_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:475:3: this_Limit_2= ruleLimit
                    {

                    			newCompositeNode(grammarAccess.getReUseAbleReduceAccess().getLimitParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Limit_2=ruleLimit();

                    state._fsp--;


                    			current = this_Limit_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:484:3: this_Calibration_3= ruleCalibration
                    {

                    			newCompositeNode(grammarAccess.getReUseAbleReduceAccess().getCalibrationParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Calibration_3=ruleCalibration();

                    state._fsp--;


                    			current = this_Calibration_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:493:3: this_Dynamics_4= ruleDynamics
                    {

                    			newCompositeNode(grammarAccess.getReUseAbleReduceAccess().getDynamicsParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Dynamics_4=ruleDynamics();

                    state._fsp--;


                    			current = this_Dynamics_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:502:3: this_SafetyController_5= ruleSafetyController
                    {

                    			newCompositeNode(grammarAccess.getReUseAbleReduceAccess().getSafetyControllerParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_SafetyController_5=ruleSafetyController();

                    state._fsp--;


                    			current = this_SafetyController_5;
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
    // $ANTLR end "ruleReUseAbleReduce"


    // $ANTLR start "entryRuleLink"
    // InternalMyDsl.g:514:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // InternalMyDsl.g:514:45: (iv_ruleLink= ruleLink EOF )
            // InternalMyDsl.g:515:2: iv_ruleLink= ruleLink EOF
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
    // InternalMyDsl.g:521:1: ruleLink returns [EObject current=null] : ( () otherlv_1= 'Link' ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= 'def' ( ( (lv_inertial_4_0= ruleInertial ) ) | ( (lv_visual_5_0= ruleVisual ) ) | ( (lv_collision_6_0= ruleCollision ) ) )+ ) | (otherlv_7= 'reuse' ( (otherlv_8= RULE_ID ) ) ( (lv_reuse_9_0= ruleReuse ) )? ) )? ) ;
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
            // InternalMyDsl.g:527:2: ( ( () otherlv_1= 'Link' ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= 'def' ( ( (lv_inertial_4_0= ruleInertial ) ) | ( (lv_visual_5_0= ruleVisual ) ) | ( (lv_collision_6_0= ruleCollision ) ) )+ ) | (otherlv_7= 'reuse' ( (otherlv_8= RULE_ID ) ) ( (lv_reuse_9_0= ruleReuse ) )? ) )? ) )
            // InternalMyDsl.g:528:2: ( () otherlv_1= 'Link' ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= 'def' ( ( (lv_inertial_4_0= ruleInertial ) ) | ( (lv_visual_5_0= ruleVisual ) ) | ( (lv_collision_6_0= ruleCollision ) ) )+ ) | (otherlv_7= 'reuse' ( (otherlv_8= RULE_ID ) ) ( (lv_reuse_9_0= ruleReuse ) )? ) )? )
            {
            // InternalMyDsl.g:528:2: ( () otherlv_1= 'Link' ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= 'def' ( ( (lv_inertial_4_0= ruleInertial ) ) | ( (lv_visual_5_0= ruleVisual ) ) | ( (lv_collision_6_0= ruleCollision ) ) )+ ) | (otherlv_7= 'reuse' ( (otherlv_8= RULE_ID ) ) ( (lv_reuse_9_0= ruleReuse ) )? ) )? )
            // InternalMyDsl.g:529:3: () otherlv_1= 'Link' ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= 'def' ( ( (lv_inertial_4_0= ruleInertial ) ) | ( (lv_visual_5_0= ruleVisual ) ) | ( (lv_collision_6_0= ruleCollision ) ) )+ ) | (otherlv_7= 'reuse' ( (otherlv_8= RULE_ID ) ) ( (lv_reuse_9_0= ruleReuse ) )? ) )?
            {
            // InternalMyDsl.g:529:3: ()
            // InternalMyDsl.g:530:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLinkAccess().getLinkAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getLinkAccess().getLinkKeyword_1());
            		
            // InternalMyDsl.g:540:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalMyDsl.g:541:4: (lv_name_2_0= RULE_ID )
            {
            // InternalMyDsl.g:541:4: (lv_name_2_0= RULE_ID )
            // InternalMyDsl.g:542:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_6); 

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

            // InternalMyDsl.g:558:3: ( (otherlv_3= 'def' ( ( (lv_inertial_4_0= ruleInertial ) ) | ( (lv_visual_5_0= ruleVisual ) ) | ( (lv_collision_6_0= ruleCollision ) ) )+ ) | (otherlv_7= 'reuse' ( (otherlv_8= RULE_ID ) ) ( (lv_reuse_9_0= ruleReuse ) )? ) )?
            int alt9=3;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            else if ( (LA9_0==19) ) {
                alt9=2;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:559:4: (otherlv_3= 'def' ( ( (lv_inertial_4_0= ruleInertial ) ) | ( (lv_visual_5_0= ruleVisual ) ) | ( (lv_collision_6_0= ruleCollision ) ) )+ )
                    {
                    // InternalMyDsl.g:559:4: (otherlv_3= 'def' ( ( (lv_inertial_4_0= ruleInertial ) ) | ( (lv_visual_5_0= ruleVisual ) ) | ( (lv_collision_6_0= ruleCollision ) ) )+ )
                    // InternalMyDsl.g:560:5: otherlv_3= 'def' ( ( (lv_inertial_4_0= ruleInertial ) ) | ( (lv_visual_5_0= ruleVisual ) ) | ( (lv_collision_6_0= ruleCollision ) ) )+
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_7); 

                    					newLeafNode(otherlv_3, grammarAccess.getLinkAccess().getDefKeyword_3_0_0());
                    				
                    // InternalMyDsl.g:564:5: ( ( (lv_inertial_4_0= ruleInertial ) ) | ( (lv_visual_5_0= ruleVisual ) ) | ( (lv_collision_6_0= ruleCollision ) ) )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=4;
                        switch ( input.LA(1) ) {
                        case 28:
                            {
                            alt7=1;
                            }
                            break;
                        case 36:
                            {
                            alt7=2;
                            }
                            break;
                        case 48:
                            {
                            alt7=3;
                            }
                            break;

                        }

                        switch (alt7) {
                    	case 1 :
                    	    // InternalMyDsl.g:565:6: ( (lv_inertial_4_0= ruleInertial ) )
                    	    {
                    	    // InternalMyDsl.g:565:6: ( (lv_inertial_4_0= ruleInertial ) )
                    	    // InternalMyDsl.g:566:7: (lv_inertial_4_0= ruleInertial )
                    	    {
                    	    // InternalMyDsl.g:566:7: (lv_inertial_4_0= ruleInertial )
                    	    // InternalMyDsl.g:567:8: lv_inertial_4_0= ruleInertial
                    	    {

                    	    								newCompositeNode(grammarAccess.getLinkAccess().getInertialInertialParserRuleCall_3_0_1_0_0());
                    	    							
                    	    pushFollow(FOLLOW_8);
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
                    	    // InternalMyDsl.g:585:6: ( (lv_visual_5_0= ruleVisual ) )
                    	    {
                    	    // InternalMyDsl.g:585:6: ( (lv_visual_5_0= ruleVisual ) )
                    	    // InternalMyDsl.g:586:7: (lv_visual_5_0= ruleVisual )
                    	    {
                    	    // InternalMyDsl.g:586:7: (lv_visual_5_0= ruleVisual )
                    	    // InternalMyDsl.g:587:8: lv_visual_5_0= ruleVisual
                    	    {

                    	    								newCompositeNode(grammarAccess.getLinkAccess().getVisualVisualParserRuleCall_3_0_1_1_0());
                    	    							
                    	    pushFollow(FOLLOW_8);
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
                    	    // InternalMyDsl.g:605:6: ( (lv_collision_6_0= ruleCollision ) )
                    	    {
                    	    // InternalMyDsl.g:605:6: ( (lv_collision_6_0= ruleCollision ) )
                    	    // InternalMyDsl.g:606:7: (lv_collision_6_0= ruleCollision )
                    	    {
                    	    // InternalMyDsl.g:606:7: (lv_collision_6_0= ruleCollision )
                    	    // InternalMyDsl.g:607:8: lv_collision_6_0= ruleCollision
                    	    {

                    	    								newCompositeNode(grammarAccess.getLinkAccess().getCollisionCollisionParserRuleCall_3_0_1_2_0());
                    	    							
                    	    pushFollow(FOLLOW_8);
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
                    	    if ( cnt7 >= 1 ) break loop7;
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:627:4: (otherlv_7= 'reuse' ( (otherlv_8= RULE_ID ) ) ( (lv_reuse_9_0= ruleReuse ) )? )
                    {
                    // InternalMyDsl.g:627:4: (otherlv_7= 'reuse' ( (otherlv_8= RULE_ID ) ) ( (lv_reuse_9_0= ruleReuse ) )? )
                    // InternalMyDsl.g:628:5: otherlv_7= 'reuse' ( (otherlv_8= RULE_ID ) ) ( (lv_reuse_9_0= ruleReuse ) )?
                    {
                    otherlv_7=(Token)match(input,19,FOLLOW_3); 

                    					newLeafNode(otherlv_7, grammarAccess.getLinkAccess().getReuseKeyword_3_1_0());
                    				
                    // InternalMyDsl.g:632:5: ( (otherlv_8= RULE_ID ) )
                    // InternalMyDsl.g:633:6: (otherlv_8= RULE_ID )
                    {
                    // InternalMyDsl.g:633:6: (otherlv_8= RULE_ID )
                    // InternalMyDsl.g:634:7: otherlv_8= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getLinkRule());
                    							}
                    						
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_9); 

                    							newLeafNode(otherlv_8, grammarAccess.getLinkAccess().getIsReuseOfLinkCrossReference_3_1_1_0());
                    						

                    }


                    }

                    // InternalMyDsl.g:645:5: ( (lv_reuse_9_0= ruleReuse ) )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( ((LA8_0>=24 && LA8_0<=25)) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalMyDsl.g:646:6: (lv_reuse_9_0= ruleReuse )
                            {
                            // InternalMyDsl.g:646:6: (lv_reuse_9_0= ruleReuse )
                            // InternalMyDsl.g:647:7: lv_reuse_9_0= ruleReuse
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
                            break;

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


    // $ANTLR start "entryRuleAddTo"
    // InternalMyDsl.g:670:1: entryRuleAddTo returns [EObject current=null] : iv_ruleAddTo= ruleAddTo EOF ;
    public final EObject entryRuleAddTo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddTo = null;


        try {
            // InternalMyDsl.g:670:46: (iv_ruleAddTo= ruleAddTo EOF )
            // InternalMyDsl.g:671:2: iv_ruleAddTo= ruleAddTo EOF
            {
             newCompositeNode(grammarAccess.getAddToRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddTo=ruleAddTo();

            state._fsp--;

             current =iv_ruleAddTo; 
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
    // $ANTLR end "entryRuleAddTo"


    // $ANTLR start "ruleAddTo"
    // InternalMyDsl.g:677:1: ruleAddTo returns [EObject current=null] : ( ( ruleAddToLink ( (otherlv_1= RULE_ID ) ) ( (lv_add_2_0= ruleReUseAbleReduced ) ) ) | ( ruleAddToJoint ( (otherlv_4= RULE_ID ) ) ( (lv_add_5_0= ruleReUseAbleReduce ) ) ) ) ;
    public final EObject ruleAddTo() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_add_2_0 = null;

        EObject lv_add_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:683:2: ( ( ( ruleAddToLink ( (otherlv_1= RULE_ID ) ) ( (lv_add_2_0= ruleReUseAbleReduced ) ) ) | ( ruleAddToJoint ( (otherlv_4= RULE_ID ) ) ( (lv_add_5_0= ruleReUseAbleReduce ) ) ) ) )
            // InternalMyDsl.g:684:2: ( ( ruleAddToLink ( (otherlv_1= RULE_ID ) ) ( (lv_add_2_0= ruleReUseAbleReduced ) ) ) | ( ruleAddToJoint ( (otherlv_4= RULE_ID ) ) ( (lv_add_5_0= ruleReUseAbleReduce ) ) ) )
            {
            // InternalMyDsl.g:684:2: ( ( ruleAddToLink ( (otherlv_1= RULE_ID ) ) ( (lv_add_2_0= ruleReUseAbleReduced ) ) ) | ( ruleAddToJoint ( (otherlv_4= RULE_ID ) ) ( (lv_add_5_0= ruleReUseAbleReduce ) ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==21) ) {
                    int LA10_2 = input.LA(3);

                    if ( (LA10_2==22) ) {
                        alt10=1;
                    }
                    else if ( (LA10_2==23) ) {
                        alt10=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 2, input);

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
                    // InternalMyDsl.g:685:3: ( ruleAddToLink ( (otherlv_1= RULE_ID ) ) ( (lv_add_2_0= ruleReUseAbleReduced ) ) )
                    {
                    // InternalMyDsl.g:685:3: ( ruleAddToLink ( (otherlv_1= RULE_ID ) ) ( (lv_add_2_0= ruleReUseAbleReduced ) ) )
                    // InternalMyDsl.g:686:4: ruleAddToLink ( (otherlv_1= RULE_ID ) ) ( (lv_add_2_0= ruleReUseAbleReduced ) )
                    {

                    				newCompositeNode(grammarAccess.getAddToAccess().getAddToLinkParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_3);
                    ruleAddToLink();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			
                    // InternalMyDsl.g:693:4: ( (otherlv_1= RULE_ID ) )
                    // InternalMyDsl.g:694:5: (otherlv_1= RULE_ID )
                    {
                    // InternalMyDsl.g:694:5: (otherlv_1= RULE_ID )
                    // InternalMyDsl.g:695:6: otherlv_1= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAddToRule());
                    						}
                    					
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_7); 

                    						newLeafNode(otherlv_1, grammarAccess.getAddToAccess().getLinkLinkCrossReference_0_1_0());
                    					

                    }


                    }

                    // InternalMyDsl.g:706:4: ( (lv_add_2_0= ruleReUseAbleReduced ) )
                    // InternalMyDsl.g:707:5: (lv_add_2_0= ruleReUseAbleReduced )
                    {
                    // InternalMyDsl.g:707:5: (lv_add_2_0= ruleReUseAbleReduced )
                    // InternalMyDsl.g:708:6: lv_add_2_0= ruleReUseAbleReduced
                    {

                    						newCompositeNode(grammarAccess.getAddToAccess().getAddReUseAbleReducedParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_add_2_0=ruleReUseAbleReduced();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAddToRule());
                    						}
                    						set(
                    							current,
                    							"add",
                    							lv_add_2_0,
                    							"org.xtext.example.mydsl4.MyDsl.ReUseAbleReduced");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:727:3: ( ruleAddToJoint ( (otherlv_4= RULE_ID ) ) ( (lv_add_5_0= ruleReUseAbleReduce ) ) )
                    {
                    // InternalMyDsl.g:727:3: ( ruleAddToJoint ( (otherlv_4= RULE_ID ) ) ( (lv_add_5_0= ruleReUseAbleReduce ) ) )
                    // InternalMyDsl.g:728:4: ruleAddToJoint ( (otherlv_4= RULE_ID ) ) ( (lv_add_5_0= ruleReUseAbleReduce ) )
                    {

                    				newCompositeNode(grammarAccess.getAddToAccess().getAddToJointParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_3);
                    ruleAddToJoint();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			
                    // InternalMyDsl.g:735:4: ( (otherlv_4= RULE_ID ) )
                    // InternalMyDsl.g:736:5: (otherlv_4= RULE_ID )
                    {
                    // InternalMyDsl.g:736:5: (otherlv_4= RULE_ID )
                    // InternalMyDsl.g:737:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAddToRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_10); 

                    						newLeafNode(otherlv_4, grammarAccess.getAddToAccess().getJointJointCrossReference_1_1_0());
                    					

                    }


                    }

                    // InternalMyDsl.g:748:4: ( (lv_add_5_0= ruleReUseAbleReduce ) )
                    // InternalMyDsl.g:749:5: (lv_add_5_0= ruleReUseAbleReduce )
                    {
                    // InternalMyDsl.g:749:5: (lv_add_5_0= ruleReUseAbleReduce )
                    // InternalMyDsl.g:750:6: lv_add_5_0= ruleReUseAbleReduce
                    {

                    						newCompositeNode(grammarAccess.getAddToAccess().getAddReUseAbleReduceParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_add_5_0=ruleReUseAbleReduce();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAddToRule());
                    						}
                    						set(
                    							current,
                    							"add",
                    							lv_add_5_0,
                    							"org.xtext.example.mydsl4.MyDsl.ReUseAbleReduce");
                    						afterParserOrEnumRuleCall();
                    					

                    }


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
    // $ANTLR end "ruleAddTo"


    // $ANTLR start "entryRuleAddToLink"
    // InternalMyDsl.g:772:1: entryRuleAddToLink returns [String current=null] : iv_ruleAddToLink= ruleAddToLink EOF ;
    public final String entryRuleAddToLink() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAddToLink = null;


        try {
            // InternalMyDsl.g:772:49: (iv_ruleAddToLink= ruleAddToLink EOF )
            // InternalMyDsl.g:773:2: iv_ruleAddToLink= ruleAddToLink EOF
            {
             newCompositeNode(grammarAccess.getAddToLinkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddToLink=ruleAddToLink();

            state._fsp--;

             current =iv_ruleAddToLink.getText(); 
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
    // $ANTLR end "entryRuleAddToLink"


    // $ANTLR start "ruleAddToLink"
    // InternalMyDsl.g:779:1: ruleAddToLink returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Add' kw= 'to' kw= 'link' ) ;
    public final AntlrDatatypeRuleToken ruleAddToLink() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:785:2: ( (kw= 'Add' kw= 'to' kw= 'link' ) )
            // InternalMyDsl.g:786:2: (kw= 'Add' kw= 'to' kw= 'link' )
            {
            // InternalMyDsl.g:786:2: (kw= 'Add' kw= 'to' kw= 'link' )
            // InternalMyDsl.g:787:3: kw= 'Add' kw= 'to' kw= 'link'
            {
            kw=(Token)match(input,20,FOLLOW_11); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAddToLinkAccess().getAddKeyword_0());
            		
            kw=(Token)match(input,21,FOLLOW_12); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAddToLinkAccess().getToKeyword_1());
            		
            kw=(Token)match(input,22,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAddToLinkAccess().getLinkKeyword_2());
            		

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
    // $ANTLR end "ruleAddToLink"


    // $ANTLR start "entryRuleAddToJoint"
    // InternalMyDsl.g:806:1: entryRuleAddToJoint returns [String current=null] : iv_ruleAddToJoint= ruleAddToJoint EOF ;
    public final String entryRuleAddToJoint() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAddToJoint = null;


        try {
            // InternalMyDsl.g:806:50: (iv_ruleAddToJoint= ruleAddToJoint EOF )
            // InternalMyDsl.g:807:2: iv_ruleAddToJoint= ruleAddToJoint EOF
            {
             newCompositeNode(grammarAccess.getAddToJointRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddToJoint=ruleAddToJoint();

            state._fsp--;

             current =iv_ruleAddToJoint.getText(); 
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
    // $ANTLR end "entryRuleAddToJoint"


    // $ANTLR start "ruleAddToJoint"
    // InternalMyDsl.g:813:1: ruleAddToJoint returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Add' kw= 'to' kw= 'joint' ) ;
    public final AntlrDatatypeRuleToken ruleAddToJoint() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:819:2: ( (kw= 'Add' kw= 'to' kw= 'joint' ) )
            // InternalMyDsl.g:820:2: (kw= 'Add' kw= 'to' kw= 'joint' )
            {
            // InternalMyDsl.g:820:2: (kw= 'Add' kw= 'to' kw= 'joint' )
            // InternalMyDsl.g:821:3: kw= 'Add' kw= 'to' kw= 'joint'
            {
            kw=(Token)match(input,20,FOLLOW_11); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAddToJointAccess().getAddKeyword_0());
            		
            kw=(Token)match(input,21,FOLLOW_13); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAddToJointAccess().getToKeyword_1());
            		
            kw=(Token)match(input,23,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAddToJointAccess().getJointKeyword_2());
            		

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
    // $ANTLR end "ruleAddToJoint"


    // $ANTLR start "entryRuleReuse"
    // InternalMyDsl.g:840:1: entryRuleReuse returns [EObject current=null] : iv_ruleReuse= ruleReuse EOF ;
    public final EObject entryRuleReuse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReuse = null;


        try {
            // InternalMyDsl.g:840:46: (iv_ruleReuse= ruleReuse EOF )
            // InternalMyDsl.g:841:2: iv_ruleReuse= ruleReuse EOF
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
    // InternalMyDsl.g:847:1: ruleReuse returns [EObject current=null] : ( ( () otherlv_1= 'add' ( (lv_add_2_0= ruleReUseAbleReduced ) ) ) | (otherlv_3= 'edit' ( (lv_edit_4_0= ruleAssignNewValue ) ) ) ) ;
    public final EObject ruleReuse() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_add_2_0 = null;

        EObject lv_edit_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:853:2: ( ( ( () otherlv_1= 'add' ( (lv_add_2_0= ruleReUseAbleReduced ) ) ) | (otherlv_3= 'edit' ( (lv_edit_4_0= ruleAssignNewValue ) ) ) ) )
            // InternalMyDsl.g:854:2: ( ( () otherlv_1= 'add' ( (lv_add_2_0= ruleReUseAbleReduced ) ) ) | (otherlv_3= 'edit' ( (lv_edit_4_0= ruleAssignNewValue ) ) ) )
            {
            // InternalMyDsl.g:854:2: ( ( () otherlv_1= 'add' ( (lv_add_2_0= ruleReUseAbleReduced ) ) ) | (otherlv_3= 'edit' ( (lv_edit_4_0= ruleAssignNewValue ) ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==24) ) {
                alt11=1;
            }
            else if ( (LA11_0==25) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:855:3: ( () otherlv_1= 'add' ( (lv_add_2_0= ruleReUseAbleReduced ) ) )
                    {
                    // InternalMyDsl.g:855:3: ( () otherlv_1= 'add' ( (lv_add_2_0= ruleReUseAbleReduced ) ) )
                    // InternalMyDsl.g:856:4: () otherlv_1= 'add' ( (lv_add_2_0= ruleReUseAbleReduced ) )
                    {
                    // InternalMyDsl.g:856:4: ()
                    // InternalMyDsl.g:857:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getReuseAccess().getReuseAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,24,FOLLOW_7); 

                    				newLeafNode(otherlv_1, grammarAccess.getReuseAccess().getAddKeyword_0_1());
                    			
                    // InternalMyDsl.g:867:4: ( (lv_add_2_0= ruleReUseAbleReduced ) )
                    // InternalMyDsl.g:868:5: (lv_add_2_0= ruleReUseAbleReduced )
                    {
                    // InternalMyDsl.g:868:5: (lv_add_2_0= ruleReUseAbleReduced )
                    // InternalMyDsl.g:869:6: lv_add_2_0= ruleReUseAbleReduced
                    {

                    						newCompositeNode(grammarAccess.getReuseAccess().getAddReUseAbleReducedParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_add_2_0=ruleReUseAbleReduced();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getReuseRule());
                    						}
                    						set(
                    							current,
                    							"add",
                    							lv_add_2_0,
                    							"org.xtext.example.mydsl4.MyDsl.ReUseAbleReduced");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:888:3: (otherlv_3= 'edit' ( (lv_edit_4_0= ruleAssignNewValue ) ) )
                    {
                    // InternalMyDsl.g:888:3: (otherlv_3= 'edit' ( (lv_edit_4_0= ruleAssignNewValue ) ) )
                    // InternalMyDsl.g:889:4: otherlv_3= 'edit' ( (lv_edit_4_0= ruleAssignNewValue ) )
                    {
                    otherlv_3=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getReuseAccess().getEditKeyword_1_0());
                    			
                    // InternalMyDsl.g:893:4: ( (lv_edit_4_0= ruleAssignNewValue ) )
                    // InternalMyDsl.g:894:5: (lv_edit_4_0= ruleAssignNewValue )
                    {
                    // InternalMyDsl.g:894:5: (lv_edit_4_0= ruleAssignNewValue )
                    // InternalMyDsl.g:895:6: lv_edit_4_0= ruleAssignNewValue
                    {

                    						newCompositeNode(grammarAccess.getReuseAccess().getEditAssignNewValueParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_edit_4_0=ruleAssignNewValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getReuseRule());
                    						}
                    						set(
                    							current,
                    							"edit",
                    							lv_edit_4_0,
                    							"org.xtext.example.mydsl4.MyDsl.AssignNewValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


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
    // $ANTLR end "ruleReuse"


    // $ANTLR start "entryRuleAssignNewValue"
    // InternalMyDsl.g:917:1: entryRuleAssignNewValue returns [EObject current=null] : iv_ruleAssignNewValue= ruleAssignNewValue EOF ;
    public final EObject entryRuleAssignNewValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignNewValue = null;


        try {
            // InternalMyDsl.g:917:55: (iv_ruleAssignNewValue= ruleAssignNewValue EOF )
            // InternalMyDsl.g:918:2: iv_ruleAssignNewValue= ruleAssignNewValue EOF
            {
             newCompositeNode(grammarAccess.getAssignNewValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssignNewValue=ruleAssignNewValue();

            state._fsp--;

             current =iv_ruleAssignNewValue; 
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
    // $ANTLR end "entryRuleAssignNewValue"


    // $ANTLR start "ruleAssignNewValue"
    // InternalMyDsl.g:924:1: ruleAssignNewValue returns [EObject current=null] : ( () ( (lv_getRef_1_0= ruleDotExpression ) ) otherlv_2= '=' ( (lv_newReuseable_3_0= ruleReUseAble ) ) ) ;
    public final EObject ruleAssignNewValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_getRef_1_0 = null;

        EObject lv_newReuseable_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:930:2: ( ( () ( (lv_getRef_1_0= ruleDotExpression ) ) otherlv_2= '=' ( (lv_newReuseable_3_0= ruleReUseAble ) ) ) )
            // InternalMyDsl.g:931:2: ( () ( (lv_getRef_1_0= ruleDotExpression ) ) otherlv_2= '=' ( (lv_newReuseable_3_0= ruleReUseAble ) ) )
            {
            // InternalMyDsl.g:931:2: ( () ( (lv_getRef_1_0= ruleDotExpression ) ) otherlv_2= '=' ( (lv_newReuseable_3_0= ruleReUseAble ) ) )
            // InternalMyDsl.g:932:3: () ( (lv_getRef_1_0= ruleDotExpression ) ) otherlv_2= '=' ( (lv_newReuseable_3_0= ruleReUseAble ) )
            {
            // InternalMyDsl.g:932:3: ()
            // InternalMyDsl.g:933:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAssignNewValueAccess().getAssignNewValueAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:939:3: ( (lv_getRef_1_0= ruleDotExpression ) )
            // InternalMyDsl.g:940:4: (lv_getRef_1_0= ruleDotExpression )
            {
            // InternalMyDsl.g:940:4: (lv_getRef_1_0= ruleDotExpression )
            // InternalMyDsl.g:941:5: lv_getRef_1_0= ruleDotExpression
            {

            					newCompositeNode(grammarAccess.getAssignNewValueAccess().getGetRefDotExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_14);
            lv_getRef_1_0=ruleDotExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssignNewValueRule());
            					}
            					set(
            						current,
            						"getRef",
            						lv_getRef_1_0,
            						"org.xtext.example.mydsl4.MyDsl.DotExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,26,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getAssignNewValueAccess().getEqualsSignKeyword_2());
            		
            // InternalMyDsl.g:962:3: ( (lv_newReuseable_3_0= ruleReUseAble ) )
            // InternalMyDsl.g:963:4: (lv_newReuseable_3_0= ruleReUseAble )
            {
            // InternalMyDsl.g:963:4: (lv_newReuseable_3_0= ruleReUseAble )
            // InternalMyDsl.g:964:5: lv_newReuseable_3_0= ruleReUseAble
            {

            					newCompositeNode(grammarAccess.getAssignNewValueAccess().getNewReuseableReUseAbleParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_newReuseable_3_0=ruleReUseAble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssignNewValueRule());
            					}
            					set(
            						current,
            						"newReuseable",
            						lv_newReuseable_3_0,
            						"org.xtext.example.mydsl4.MyDsl.ReUseAble");
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
    // $ANTLR end "ruleAssignNewValue"


    // $ANTLR start "entryRuleDotExpression"
    // InternalMyDsl.g:985:1: entryRuleDotExpression returns [EObject current=null] : iv_ruleDotExpression= ruleDotExpression EOF ;
    public final EObject entryRuleDotExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDotExpression = null;


        try {
            // InternalMyDsl.g:985:54: (iv_ruleDotExpression= ruleDotExpression EOF )
            // InternalMyDsl.g:986:2: iv_ruleDotExpression= ruleDotExpression EOF
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
    // InternalMyDsl.g:992:1: ruleDotExpression returns [EObject current=null] : (this_ReUsableRef_0= ruleReUsableRef ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )* ) ;
    public final EObject ruleDotExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_ReUsableRef_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:998:2: ( (this_ReUsableRef_0= ruleReUsableRef ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )* ) )
            // InternalMyDsl.g:999:2: (this_ReUsableRef_0= ruleReUsableRef ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )* )
            {
            // InternalMyDsl.g:999:2: (this_ReUsableRef_0= ruleReUsableRef ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )* )
            // InternalMyDsl.g:1000:3: this_ReUsableRef_0= ruleReUsableRef ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )*
            {

            			newCompositeNode(grammarAccess.getDotExpressionAccess().getReUsableRefParserRuleCall_0());
            		
            pushFollow(FOLLOW_16);
            this_ReUsableRef_0=ruleReUsableRef();

            state._fsp--;


            			current = this_ReUsableRef_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMyDsl.g:1008:3: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==27) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:1009:4: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) )
            	    {
            	    // InternalMyDsl.g:1009:4: ()
            	    // InternalMyDsl.g:1010:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getDotExpressionAccess().getDotExpressionRefAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,27,FOLLOW_3); 

            	    				newLeafNode(otherlv_2, grammarAccess.getDotExpressionAccess().getFullStopKeyword_1_1());
            	    			
            	    // InternalMyDsl.g:1020:4: ( (otherlv_3= RULE_ID ) )
            	    // InternalMyDsl.g:1021:5: (otherlv_3= RULE_ID )
            	    {
            	    // InternalMyDsl.g:1021:5: (otherlv_3= RULE_ID )
            	    // InternalMyDsl.g:1022:6: otherlv_3= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getDotExpressionRule());
            	    						}
            	    					
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_16); 

            	    						newLeafNode(otherlv_3, grammarAccess.getDotExpressionAccess().getTailReUseAbleCrossReference_1_2_0());
            	    					

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
    // InternalMyDsl.g:1038:1: entryRuleReUsableRef returns [EObject current=null] : iv_ruleReUsableRef= ruleReUsableRef EOF ;
    public final EObject entryRuleReUsableRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReUsableRef = null;


        try {
            // InternalMyDsl.g:1038:52: (iv_ruleReUsableRef= ruleReUsableRef EOF )
            // InternalMyDsl.g:1039:2: iv_ruleReUsableRef= ruleReUsableRef EOF
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
    // InternalMyDsl.g:1045:1: ruleReUsableRef returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleReUsableRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1051:2: ( ( () ( (otherlv_1= RULE_ID ) ) ) )
            // InternalMyDsl.g:1052:2: ( () ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalMyDsl.g:1052:2: ( () ( (otherlv_1= RULE_ID ) ) )
            // InternalMyDsl.g:1053:3: () ( (otherlv_1= RULE_ID ) )
            {
            // InternalMyDsl.g:1053:3: ()
            // InternalMyDsl.g:1054:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getReUsableRefAccess().getReUsableRefAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:1060:3: ( (otherlv_1= RULE_ID ) )
            // InternalMyDsl.g:1061:4: (otherlv_1= RULE_ID )
            {
            // InternalMyDsl.g:1061:4: (otherlv_1= RULE_ID )
            // InternalMyDsl.g:1062:5: otherlv_1= RULE_ID
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
    // InternalMyDsl.g:1077:1: entryRuleInertial returns [EObject current=null] : iv_ruleInertial= ruleInertial EOF ;
    public final EObject entryRuleInertial() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInertial = null;


        try {
            // InternalMyDsl.g:1077:49: (iv_ruleInertial= ruleInertial EOF )
            // InternalMyDsl.g:1078:2: iv_ruleInertial= ruleInertial EOF
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
    // InternalMyDsl.g:1084:1: ruleInertial returns [EObject current=null] : ( () otherlv_1= 'Inertial' ( (lv_name_2_0= RULE_ID ) )? ( (lv_inertia_3_0= ruleInertia ) ) ( (lv_mass_4_0= ruleMass ) ) ( (lv_origin_5_0= ruleOrigin ) )? ) ;
    public final EObject ruleInertial() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        EObject lv_inertia_3_0 = null;

        EObject lv_mass_4_0 = null;

        EObject lv_origin_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1090:2: ( ( () otherlv_1= 'Inertial' ( (lv_name_2_0= RULE_ID ) )? ( (lv_inertia_3_0= ruleInertia ) ) ( (lv_mass_4_0= ruleMass ) ) ( (lv_origin_5_0= ruleOrigin ) )? ) )
            // InternalMyDsl.g:1091:2: ( () otherlv_1= 'Inertial' ( (lv_name_2_0= RULE_ID ) )? ( (lv_inertia_3_0= ruleInertia ) ) ( (lv_mass_4_0= ruleMass ) ) ( (lv_origin_5_0= ruleOrigin ) )? )
            {
            // InternalMyDsl.g:1091:2: ( () otherlv_1= 'Inertial' ( (lv_name_2_0= RULE_ID ) )? ( (lv_inertia_3_0= ruleInertia ) ) ( (lv_mass_4_0= ruleMass ) ) ( (lv_origin_5_0= ruleOrigin ) )? )
            // InternalMyDsl.g:1092:3: () otherlv_1= 'Inertial' ( (lv_name_2_0= RULE_ID ) )? ( (lv_inertia_3_0= ruleInertia ) ) ( (lv_mass_4_0= ruleMass ) ) ( (lv_origin_5_0= ruleOrigin ) )?
            {
            // InternalMyDsl.g:1092:3: ()
            // InternalMyDsl.g:1093:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInertialAccess().getInertialAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,28,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getInertialAccess().getInertialKeyword_1());
            		
            // InternalMyDsl.g:1103:3: ( (lv_name_2_0= RULE_ID ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:1104:4: (lv_name_2_0= RULE_ID )
                    {
                    // InternalMyDsl.g:1104:4: (lv_name_2_0= RULE_ID )
                    // InternalMyDsl.g:1105:5: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_17); 

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

            // InternalMyDsl.g:1121:3: ( (lv_inertia_3_0= ruleInertia ) )
            // InternalMyDsl.g:1122:4: (lv_inertia_3_0= ruleInertia )
            {
            // InternalMyDsl.g:1122:4: (lv_inertia_3_0= ruleInertia )
            // InternalMyDsl.g:1123:5: lv_inertia_3_0= ruleInertia
            {

            					newCompositeNode(grammarAccess.getInertialAccess().getInertiaInertiaParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_18);
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

            // InternalMyDsl.g:1140:3: ( (lv_mass_4_0= ruleMass ) )
            // InternalMyDsl.g:1141:4: (lv_mass_4_0= ruleMass )
            {
            // InternalMyDsl.g:1141:4: (lv_mass_4_0= ruleMass )
            // InternalMyDsl.g:1142:5: lv_mass_4_0= ruleMass
            {

            					newCompositeNode(grammarAccess.getInertialAccess().getMassMassParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_19);
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

            // InternalMyDsl.g:1159:3: ( (lv_origin_5_0= ruleOrigin ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==39) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:1160:4: (lv_origin_5_0= ruleOrigin )
                    {
                    // InternalMyDsl.g:1160:4: (lv_origin_5_0= ruleOrigin )
                    // InternalMyDsl.g:1161:5: lv_origin_5_0= ruleOrigin
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
    // InternalMyDsl.g:1182:1: entryRuleInertia returns [EObject current=null] : iv_ruleInertia= ruleInertia EOF ;
    public final EObject entryRuleInertia() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInertia = null;


        try {
            // InternalMyDsl.g:1182:48: (iv_ruleInertia= ruleInertia EOF )
            // InternalMyDsl.g:1183:2: iv_ruleInertia= ruleInertia EOF
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
    // InternalMyDsl.g:1189:1: ruleInertia returns [EObject current=null] : ( () otherlv_1= 'Inertia' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= 'ixx' ( (lv_ixx_4_0= ruleURDFAttrSignedNumeric ) ) otherlv_5= 'ixy' ( (lv_ixy_6_0= ruleURDFAttrSignedNumeric ) ) otherlv_7= 'ixz' ( (lv_ixz_8_0= ruleURDFAttrSignedNumeric ) ) otherlv_9= 'iyy' ( (lv_iyy_10_0= ruleURDFAttrSignedNumeric ) ) otherlv_11= 'iyz' ( (lv_iyz_12_0= ruleURDFAttrSignedNumeric ) ) otherlv_13= 'izz' ( (lv_izz_14_0= ruleURDFAttrSignedNumeric ) ) ) ;
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
            // InternalMyDsl.g:1195:2: ( ( () otherlv_1= 'Inertia' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= 'ixx' ( (lv_ixx_4_0= ruleURDFAttrSignedNumeric ) ) otherlv_5= 'ixy' ( (lv_ixy_6_0= ruleURDFAttrSignedNumeric ) ) otherlv_7= 'ixz' ( (lv_ixz_8_0= ruleURDFAttrSignedNumeric ) ) otherlv_9= 'iyy' ( (lv_iyy_10_0= ruleURDFAttrSignedNumeric ) ) otherlv_11= 'iyz' ( (lv_iyz_12_0= ruleURDFAttrSignedNumeric ) ) otherlv_13= 'izz' ( (lv_izz_14_0= ruleURDFAttrSignedNumeric ) ) ) )
            // InternalMyDsl.g:1196:2: ( () otherlv_1= 'Inertia' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= 'ixx' ( (lv_ixx_4_0= ruleURDFAttrSignedNumeric ) ) otherlv_5= 'ixy' ( (lv_ixy_6_0= ruleURDFAttrSignedNumeric ) ) otherlv_7= 'ixz' ( (lv_ixz_8_0= ruleURDFAttrSignedNumeric ) ) otherlv_9= 'iyy' ( (lv_iyy_10_0= ruleURDFAttrSignedNumeric ) ) otherlv_11= 'iyz' ( (lv_iyz_12_0= ruleURDFAttrSignedNumeric ) ) otherlv_13= 'izz' ( (lv_izz_14_0= ruleURDFAttrSignedNumeric ) ) )
            {
            // InternalMyDsl.g:1196:2: ( () otherlv_1= 'Inertia' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= 'ixx' ( (lv_ixx_4_0= ruleURDFAttrSignedNumeric ) ) otherlv_5= 'ixy' ( (lv_ixy_6_0= ruleURDFAttrSignedNumeric ) ) otherlv_7= 'ixz' ( (lv_ixz_8_0= ruleURDFAttrSignedNumeric ) ) otherlv_9= 'iyy' ( (lv_iyy_10_0= ruleURDFAttrSignedNumeric ) ) otherlv_11= 'iyz' ( (lv_iyz_12_0= ruleURDFAttrSignedNumeric ) ) otherlv_13= 'izz' ( (lv_izz_14_0= ruleURDFAttrSignedNumeric ) ) )
            // InternalMyDsl.g:1197:3: () otherlv_1= 'Inertia' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= 'ixx' ( (lv_ixx_4_0= ruleURDFAttrSignedNumeric ) ) otherlv_5= 'ixy' ( (lv_ixy_6_0= ruleURDFAttrSignedNumeric ) ) otherlv_7= 'ixz' ( (lv_ixz_8_0= ruleURDFAttrSignedNumeric ) ) otherlv_9= 'iyy' ( (lv_iyy_10_0= ruleURDFAttrSignedNumeric ) ) otherlv_11= 'iyz' ( (lv_iyz_12_0= ruleURDFAttrSignedNumeric ) ) otherlv_13= 'izz' ( (lv_izz_14_0= ruleURDFAttrSignedNumeric ) )
            {
            // InternalMyDsl.g:1197:3: ()
            // InternalMyDsl.g:1198:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInertiaAccess().getInertiaAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getInertiaAccess().getInertiaKeyword_1());
            		
            // InternalMyDsl.g:1208:3: ( (lv_name_2_0= RULE_ID ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:1209:4: (lv_name_2_0= RULE_ID )
                    {
                    // InternalMyDsl.g:1209:4: (lv_name_2_0= RULE_ID )
                    // InternalMyDsl.g:1210:5: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_21); 

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

            otherlv_3=(Token)match(input,30,FOLLOW_22); 

            			newLeafNode(otherlv_3, grammarAccess.getInertiaAccess().getIxxKeyword_3());
            		
            // InternalMyDsl.g:1230:3: ( (lv_ixx_4_0= ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:1231:4: (lv_ixx_4_0= ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:1231:4: (lv_ixx_4_0= ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:1232:5: lv_ixx_4_0= ruleURDFAttrSignedNumeric
            {

            					newCompositeNode(grammarAccess.getInertiaAccess().getIxxURDFAttrSignedNumericParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_23);
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

            otherlv_5=(Token)match(input,31,FOLLOW_22); 

            			newLeafNode(otherlv_5, grammarAccess.getInertiaAccess().getIxyKeyword_5());
            		
            // InternalMyDsl.g:1253:3: ( (lv_ixy_6_0= ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:1254:4: (lv_ixy_6_0= ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:1254:4: (lv_ixy_6_0= ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:1255:5: lv_ixy_6_0= ruleURDFAttrSignedNumeric
            {

            					newCompositeNode(grammarAccess.getInertiaAccess().getIxyURDFAttrSignedNumericParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_24);
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

            otherlv_7=(Token)match(input,32,FOLLOW_22); 

            			newLeafNode(otherlv_7, grammarAccess.getInertiaAccess().getIxzKeyword_7());
            		
            // InternalMyDsl.g:1276:3: ( (lv_ixz_8_0= ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:1277:4: (lv_ixz_8_0= ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:1277:4: (lv_ixz_8_0= ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:1278:5: lv_ixz_8_0= ruleURDFAttrSignedNumeric
            {

            					newCompositeNode(grammarAccess.getInertiaAccess().getIxzURDFAttrSignedNumericParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_25);
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

            otherlv_9=(Token)match(input,33,FOLLOW_22); 

            			newLeafNode(otherlv_9, grammarAccess.getInertiaAccess().getIyyKeyword_9());
            		
            // InternalMyDsl.g:1299:3: ( (lv_iyy_10_0= ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:1300:4: (lv_iyy_10_0= ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:1300:4: (lv_iyy_10_0= ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:1301:5: lv_iyy_10_0= ruleURDFAttrSignedNumeric
            {

            					newCompositeNode(grammarAccess.getInertiaAccess().getIyyURDFAttrSignedNumericParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_26);
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

            otherlv_11=(Token)match(input,34,FOLLOW_22); 

            			newLeafNode(otherlv_11, grammarAccess.getInertiaAccess().getIyzKeyword_11());
            		
            // InternalMyDsl.g:1322:3: ( (lv_iyz_12_0= ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:1323:4: (lv_iyz_12_0= ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:1323:4: (lv_iyz_12_0= ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:1324:5: lv_iyz_12_0= ruleURDFAttrSignedNumeric
            {

            					newCompositeNode(grammarAccess.getInertiaAccess().getIyzURDFAttrSignedNumericParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_27);
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

            otherlv_13=(Token)match(input,35,FOLLOW_22); 

            			newLeafNode(otherlv_13, grammarAccess.getInertiaAccess().getIzzKeyword_13());
            		
            // InternalMyDsl.g:1345:3: ( (lv_izz_14_0= ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:1346:4: (lv_izz_14_0= ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:1346:4: (lv_izz_14_0= ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:1347:5: lv_izz_14_0= ruleURDFAttrSignedNumeric
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
    // InternalMyDsl.g:1368:1: entryRuleVisual returns [EObject current=null] : iv_ruleVisual= ruleVisual EOF ;
    public final EObject entryRuleVisual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVisual = null;


        try {
            // InternalMyDsl.g:1368:47: (iv_ruleVisual= ruleVisual EOF )
            // InternalMyDsl.g:1369:2: iv_ruleVisual= ruleVisual EOF
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
    // InternalMyDsl.g:1375:1: ruleVisual returns [EObject current=null] : ( () otherlv_1= 'Visual' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= 'Geometry' ( (lv_geometry_4_0= ruleGeometry ) ) ( (lv_origin_5_0= ruleOrigin ) )? (otherlv_6= 'Material' ( (lv_material_7_0= ruleMaterial ) ) )? ) ;
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
            // InternalMyDsl.g:1381:2: ( ( () otherlv_1= 'Visual' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= 'Geometry' ( (lv_geometry_4_0= ruleGeometry ) ) ( (lv_origin_5_0= ruleOrigin ) )? (otherlv_6= 'Material' ( (lv_material_7_0= ruleMaterial ) ) )? ) )
            // InternalMyDsl.g:1382:2: ( () otherlv_1= 'Visual' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= 'Geometry' ( (lv_geometry_4_0= ruleGeometry ) ) ( (lv_origin_5_0= ruleOrigin ) )? (otherlv_6= 'Material' ( (lv_material_7_0= ruleMaterial ) ) )? )
            {
            // InternalMyDsl.g:1382:2: ( () otherlv_1= 'Visual' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= 'Geometry' ( (lv_geometry_4_0= ruleGeometry ) ) ( (lv_origin_5_0= ruleOrigin ) )? (otherlv_6= 'Material' ( (lv_material_7_0= ruleMaterial ) ) )? )
            // InternalMyDsl.g:1383:3: () otherlv_1= 'Visual' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= 'Geometry' ( (lv_geometry_4_0= ruleGeometry ) ) ( (lv_origin_5_0= ruleOrigin ) )? (otherlv_6= 'Material' ( (lv_material_7_0= ruleMaterial ) ) )?
            {
            // InternalMyDsl.g:1383:3: ()
            // InternalMyDsl.g:1384:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVisualAccess().getVisualAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,36,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getVisualAccess().getVisualKeyword_1());
            		
            // InternalMyDsl.g:1394:3: ( (lv_name_2_0= RULE_ID ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:1395:4: (lv_name_2_0= RULE_ID )
                    {
                    // InternalMyDsl.g:1395:4: (lv_name_2_0= RULE_ID )
                    // InternalMyDsl.g:1396:5: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_29); 

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

            otherlv_3=(Token)match(input,37,FOLLOW_30); 

            			newLeafNode(otherlv_3, grammarAccess.getVisualAccess().getGeometryKeyword_3());
            		
            // InternalMyDsl.g:1416:3: ( (lv_geometry_4_0= ruleGeometry ) )
            // InternalMyDsl.g:1417:4: (lv_geometry_4_0= ruleGeometry )
            {
            // InternalMyDsl.g:1417:4: (lv_geometry_4_0= ruleGeometry )
            // InternalMyDsl.g:1418:5: lv_geometry_4_0= ruleGeometry
            {

            					newCompositeNode(grammarAccess.getVisualAccess().getGeometryGeometryParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_31);
            lv_geometry_4_0=ruleGeometry();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVisualRule());
            					}
            					set(
            						current,
            						"geometry",
            						lv_geometry_4_0,
            						"org.xtext.example.mydsl4.MyDsl.Geometry");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1435:3: ( (lv_origin_5_0= ruleOrigin ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==39) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:1436:4: (lv_origin_5_0= ruleOrigin )
                    {
                    // InternalMyDsl.g:1436:4: (lv_origin_5_0= ruleOrigin )
                    // InternalMyDsl.g:1437:5: lv_origin_5_0= ruleOrigin
                    {

                    					newCompositeNode(grammarAccess.getVisualAccess().getOriginOriginParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_32);
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

            // InternalMyDsl.g:1454:3: (otherlv_6= 'Material' ( (lv_material_7_0= ruleMaterial ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==38) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMyDsl.g:1455:4: otherlv_6= 'Material' ( (lv_material_7_0= ruleMaterial ) )
                    {
                    otherlv_6=(Token)match(input,38,FOLLOW_33); 

                    				newLeafNode(otherlv_6, grammarAccess.getVisualAccess().getMaterialKeyword_6_0());
                    			
                    // InternalMyDsl.g:1459:4: ( (lv_material_7_0= ruleMaterial ) )
                    // InternalMyDsl.g:1460:5: (lv_material_7_0= ruleMaterial )
                    {
                    // InternalMyDsl.g:1460:5: (lv_material_7_0= ruleMaterial )
                    // InternalMyDsl.g:1461:6: lv_material_7_0= ruleMaterial
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
    // InternalMyDsl.g:1483:1: entryRuleOrigin returns [EObject current=null] : iv_ruleOrigin= ruleOrigin EOF ;
    public final EObject entryRuleOrigin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrigin = null;


        try {
            // InternalMyDsl.g:1483:47: (iv_ruleOrigin= ruleOrigin EOF )
            // InternalMyDsl.g:1484:2: iv_ruleOrigin= ruleOrigin EOF
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
    // InternalMyDsl.g:1490:1: ruleOrigin returns [EObject current=null] : ( () otherlv_1= 'Origin' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= 'x' ( (lv_x_4_0= ruleURDFAttrSignedNumeric ) ) otherlv_5= 'y' ( (lv_y_6_0= ruleURDFAttrSignedNumeric ) ) otherlv_7= 'z' ( (lv_z_8_0= ruleURDFAttrSignedNumeric ) ) (otherlv_9= 'roll' ( (lv_roll_10_0= ruleURDFAttrSignedNumeric ) ) )? (otherlv_11= 'pitch' ( (lv_pitch_12_0= ruleURDFAttrSignedNumeric ) ) )? (otherlv_13= 'yaw' ( (lv_yaw_14_0= ruleURDFAttrSignedNumeric ) ) )? ) ;
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
            // InternalMyDsl.g:1496:2: ( ( () otherlv_1= 'Origin' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= 'x' ( (lv_x_4_0= ruleURDFAttrSignedNumeric ) ) otherlv_5= 'y' ( (lv_y_6_0= ruleURDFAttrSignedNumeric ) ) otherlv_7= 'z' ( (lv_z_8_0= ruleURDFAttrSignedNumeric ) ) (otherlv_9= 'roll' ( (lv_roll_10_0= ruleURDFAttrSignedNumeric ) ) )? (otherlv_11= 'pitch' ( (lv_pitch_12_0= ruleURDFAttrSignedNumeric ) ) )? (otherlv_13= 'yaw' ( (lv_yaw_14_0= ruleURDFAttrSignedNumeric ) ) )? ) )
            // InternalMyDsl.g:1497:2: ( () otherlv_1= 'Origin' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= 'x' ( (lv_x_4_0= ruleURDFAttrSignedNumeric ) ) otherlv_5= 'y' ( (lv_y_6_0= ruleURDFAttrSignedNumeric ) ) otherlv_7= 'z' ( (lv_z_8_0= ruleURDFAttrSignedNumeric ) ) (otherlv_9= 'roll' ( (lv_roll_10_0= ruleURDFAttrSignedNumeric ) ) )? (otherlv_11= 'pitch' ( (lv_pitch_12_0= ruleURDFAttrSignedNumeric ) ) )? (otherlv_13= 'yaw' ( (lv_yaw_14_0= ruleURDFAttrSignedNumeric ) ) )? )
            {
            // InternalMyDsl.g:1497:2: ( () otherlv_1= 'Origin' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= 'x' ( (lv_x_4_0= ruleURDFAttrSignedNumeric ) ) otherlv_5= 'y' ( (lv_y_6_0= ruleURDFAttrSignedNumeric ) ) otherlv_7= 'z' ( (lv_z_8_0= ruleURDFAttrSignedNumeric ) ) (otherlv_9= 'roll' ( (lv_roll_10_0= ruleURDFAttrSignedNumeric ) ) )? (otherlv_11= 'pitch' ( (lv_pitch_12_0= ruleURDFAttrSignedNumeric ) ) )? (otherlv_13= 'yaw' ( (lv_yaw_14_0= ruleURDFAttrSignedNumeric ) ) )? )
            // InternalMyDsl.g:1498:3: () otherlv_1= 'Origin' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= 'x' ( (lv_x_4_0= ruleURDFAttrSignedNumeric ) ) otherlv_5= 'y' ( (lv_y_6_0= ruleURDFAttrSignedNumeric ) ) otherlv_7= 'z' ( (lv_z_8_0= ruleURDFAttrSignedNumeric ) ) (otherlv_9= 'roll' ( (lv_roll_10_0= ruleURDFAttrSignedNumeric ) ) )? (otherlv_11= 'pitch' ( (lv_pitch_12_0= ruleURDFAttrSignedNumeric ) ) )? (otherlv_13= 'yaw' ( (lv_yaw_14_0= ruleURDFAttrSignedNumeric ) ) )?
            {
            // InternalMyDsl.g:1498:3: ()
            // InternalMyDsl.g:1499:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOriginAccess().getOriginAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,39,FOLLOW_34); 

            			newLeafNode(otherlv_1, grammarAccess.getOriginAccess().getOriginKeyword_1());
            		
            // InternalMyDsl.g:1509:3: ( (lv_name_2_0= RULE_ID ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyDsl.g:1510:4: (lv_name_2_0= RULE_ID )
                    {
                    // InternalMyDsl.g:1510:4: (lv_name_2_0= RULE_ID )
                    // InternalMyDsl.g:1511:5: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_35); 

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

            otherlv_3=(Token)match(input,40,FOLLOW_22); 

            			newLeafNode(otherlv_3, grammarAccess.getOriginAccess().getXKeyword_3());
            		
            // InternalMyDsl.g:1531:3: ( (lv_x_4_0= ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:1532:4: (lv_x_4_0= ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:1532:4: (lv_x_4_0= ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:1533:5: lv_x_4_0= ruleURDFAttrSignedNumeric
            {

            					newCompositeNode(grammarAccess.getOriginAccess().getXURDFAttrSignedNumericParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_36);
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

            otherlv_5=(Token)match(input,41,FOLLOW_22); 

            			newLeafNode(otherlv_5, grammarAccess.getOriginAccess().getYKeyword_5());
            		
            // InternalMyDsl.g:1554:3: ( (lv_y_6_0= ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:1555:4: (lv_y_6_0= ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:1555:4: (lv_y_6_0= ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:1556:5: lv_y_6_0= ruleURDFAttrSignedNumeric
            {

            					newCompositeNode(grammarAccess.getOriginAccess().getYURDFAttrSignedNumericParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_37);
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

            otherlv_7=(Token)match(input,42,FOLLOW_22); 

            			newLeafNode(otherlv_7, grammarAccess.getOriginAccess().getZKeyword_7());
            		
            // InternalMyDsl.g:1577:3: ( (lv_z_8_0= ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:1578:4: (lv_z_8_0= ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:1578:4: (lv_z_8_0= ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:1579:5: lv_z_8_0= ruleURDFAttrSignedNumeric
            {

            					newCompositeNode(grammarAccess.getOriginAccess().getZURDFAttrSignedNumericParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_38);
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

            // InternalMyDsl.g:1596:3: (otherlv_9= 'roll' ( (lv_roll_10_0= ruleURDFAttrSignedNumeric ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==43) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMyDsl.g:1597:4: otherlv_9= 'roll' ( (lv_roll_10_0= ruleURDFAttrSignedNumeric ) )
                    {
                    otherlv_9=(Token)match(input,43,FOLLOW_22); 

                    				newLeafNode(otherlv_9, grammarAccess.getOriginAccess().getRollKeyword_9_0());
                    			
                    // InternalMyDsl.g:1601:4: ( (lv_roll_10_0= ruleURDFAttrSignedNumeric ) )
                    // InternalMyDsl.g:1602:5: (lv_roll_10_0= ruleURDFAttrSignedNumeric )
                    {
                    // InternalMyDsl.g:1602:5: (lv_roll_10_0= ruleURDFAttrSignedNumeric )
                    // InternalMyDsl.g:1603:6: lv_roll_10_0= ruleURDFAttrSignedNumeric
                    {

                    						newCompositeNode(grammarAccess.getOriginAccess().getRollURDFAttrSignedNumericParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_39);
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

            // InternalMyDsl.g:1621:3: (otherlv_11= 'pitch' ( (lv_pitch_12_0= ruleURDFAttrSignedNumeric ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==44) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMyDsl.g:1622:4: otherlv_11= 'pitch' ( (lv_pitch_12_0= ruleURDFAttrSignedNumeric ) )
                    {
                    otherlv_11=(Token)match(input,44,FOLLOW_22); 

                    				newLeafNode(otherlv_11, grammarAccess.getOriginAccess().getPitchKeyword_10_0());
                    			
                    // InternalMyDsl.g:1626:4: ( (lv_pitch_12_0= ruleURDFAttrSignedNumeric ) )
                    // InternalMyDsl.g:1627:5: (lv_pitch_12_0= ruleURDFAttrSignedNumeric )
                    {
                    // InternalMyDsl.g:1627:5: (lv_pitch_12_0= ruleURDFAttrSignedNumeric )
                    // InternalMyDsl.g:1628:6: lv_pitch_12_0= ruleURDFAttrSignedNumeric
                    {

                    						newCompositeNode(grammarAccess.getOriginAccess().getPitchURDFAttrSignedNumericParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_40);
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

            // InternalMyDsl.g:1646:3: (otherlv_13= 'yaw' ( (lv_yaw_14_0= ruleURDFAttrSignedNumeric ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==45) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMyDsl.g:1647:4: otherlv_13= 'yaw' ( (lv_yaw_14_0= ruleURDFAttrSignedNumeric ) )
                    {
                    otherlv_13=(Token)match(input,45,FOLLOW_22); 

                    				newLeafNode(otherlv_13, grammarAccess.getOriginAccess().getYawKeyword_11_0());
                    			
                    // InternalMyDsl.g:1651:4: ( (lv_yaw_14_0= ruleURDFAttrSignedNumeric ) )
                    // InternalMyDsl.g:1652:5: (lv_yaw_14_0= ruleURDFAttrSignedNumeric )
                    {
                    // InternalMyDsl.g:1652:5: (lv_yaw_14_0= ruleURDFAttrSignedNumeric )
                    // InternalMyDsl.g:1653:6: lv_yaw_14_0= ruleURDFAttrSignedNumeric
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
    // InternalMyDsl.g:1675:1: entryRuleMass returns [EObject current=null] : iv_ruleMass= ruleMass EOF ;
    public final EObject entryRuleMass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMass = null;


        try {
            // InternalMyDsl.g:1675:45: (iv_ruleMass= ruleMass EOF )
            // InternalMyDsl.g:1676:2: iv_ruleMass= ruleMass EOF
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
    // InternalMyDsl.g:1682:1: ruleMass returns [EObject current=null] : ( () otherlv_1= 'Mass' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= 'massKilogram' ( (lv_massKilogram_4_0= ruleURDFAttrSignedNumeric ) ) ) ;
    public final EObject ruleMass() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        EObject lv_massKilogram_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1688:2: ( ( () otherlv_1= 'Mass' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= 'massKilogram' ( (lv_massKilogram_4_0= ruleURDFAttrSignedNumeric ) ) ) )
            // InternalMyDsl.g:1689:2: ( () otherlv_1= 'Mass' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= 'massKilogram' ( (lv_massKilogram_4_0= ruleURDFAttrSignedNumeric ) ) )
            {
            // InternalMyDsl.g:1689:2: ( () otherlv_1= 'Mass' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= 'massKilogram' ( (lv_massKilogram_4_0= ruleURDFAttrSignedNumeric ) ) )
            // InternalMyDsl.g:1690:3: () otherlv_1= 'Mass' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= 'massKilogram' ( (lv_massKilogram_4_0= ruleURDFAttrSignedNumeric ) )
            {
            // InternalMyDsl.g:1690:3: ()
            // InternalMyDsl.g:1691:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMassAccess().getMassAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,46,FOLLOW_41); 

            			newLeafNode(otherlv_1, grammarAccess.getMassAccess().getMassKeyword_1());
            		
            // InternalMyDsl.g:1701:3: ( (lv_name_2_0= RULE_ID ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMyDsl.g:1702:4: (lv_name_2_0= RULE_ID )
                    {
                    // InternalMyDsl.g:1702:4: (lv_name_2_0= RULE_ID )
                    // InternalMyDsl.g:1703:5: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_42); 

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

            otherlv_3=(Token)match(input,47,FOLLOW_22); 

            			newLeafNode(otherlv_3, grammarAccess.getMassAccess().getMassKilogramKeyword_3());
            		
            // InternalMyDsl.g:1723:3: ( (lv_massKilogram_4_0= ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:1724:4: (lv_massKilogram_4_0= ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:1724:4: (lv_massKilogram_4_0= ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:1725:5: lv_massKilogram_4_0= ruleURDFAttrSignedNumeric
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
    // InternalMyDsl.g:1746:1: entryRuleCollision returns [EObject current=null] : iv_ruleCollision= ruleCollision EOF ;
    public final EObject entryRuleCollision() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollision = null;


        try {
            // InternalMyDsl.g:1746:50: (iv_ruleCollision= ruleCollision EOF )
            // InternalMyDsl.g:1747:2: iv_ruleCollision= ruleCollision EOF
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
    // InternalMyDsl.g:1753:1: ruleCollision returns [EObject current=null] : (otherlv_0= 'Collision' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'Geometry' ( (lv_geometry_3_0= ruleGeometry ) ) ( (lv_origin_4_0= ruleOrigin ) )? ) ;
    public final EObject ruleCollision() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_geometry_3_0 = null;

        EObject lv_origin_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1759:2: ( (otherlv_0= 'Collision' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'Geometry' ( (lv_geometry_3_0= ruleGeometry ) ) ( (lv_origin_4_0= ruleOrigin ) )? ) )
            // InternalMyDsl.g:1760:2: (otherlv_0= 'Collision' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'Geometry' ( (lv_geometry_3_0= ruleGeometry ) ) ( (lv_origin_4_0= ruleOrigin ) )? )
            {
            // InternalMyDsl.g:1760:2: (otherlv_0= 'Collision' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'Geometry' ( (lv_geometry_3_0= ruleGeometry ) ) ( (lv_origin_4_0= ruleOrigin ) )? )
            // InternalMyDsl.g:1761:3: otherlv_0= 'Collision' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'Geometry' ( (lv_geometry_3_0= ruleGeometry ) ) ( (lv_origin_4_0= ruleOrigin ) )?
            {
            otherlv_0=(Token)match(input,48,FOLLOW_28); 

            			newLeafNode(otherlv_0, grammarAccess.getCollisionAccess().getCollisionKeyword_0());
            		
            // InternalMyDsl.g:1765:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMyDsl.g:1766:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalMyDsl.g:1766:4: (lv_name_1_0= RULE_ID )
                    // InternalMyDsl.g:1767:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_29); 

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
                    break;

            }

            otherlv_2=(Token)match(input,37,FOLLOW_30); 

            			newLeafNode(otherlv_2, grammarAccess.getCollisionAccess().getGeometryKeyword_2());
            		
            // InternalMyDsl.g:1787:3: ( (lv_geometry_3_0= ruleGeometry ) )
            // InternalMyDsl.g:1788:4: (lv_geometry_3_0= ruleGeometry )
            {
            // InternalMyDsl.g:1788:4: (lv_geometry_3_0= ruleGeometry )
            // InternalMyDsl.g:1789:5: lv_geometry_3_0= ruleGeometry
            {

            					newCompositeNode(grammarAccess.getCollisionAccess().getGeometryGeometryParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_19);
            lv_geometry_3_0=ruleGeometry();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCollisionRule());
            					}
            					set(
            						current,
            						"geometry",
            						lv_geometry_3_0,
            						"org.xtext.example.mydsl4.MyDsl.Geometry");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1806:3: ( (lv_origin_4_0= ruleOrigin ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==39) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMyDsl.g:1807:4: (lv_origin_4_0= ruleOrigin )
                    {
                    // InternalMyDsl.g:1807:4: (lv_origin_4_0= ruleOrigin )
                    // InternalMyDsl.g:1808:5: lv_origin_4_0= ruleOrigin
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
    // InternalMyDsl.g:1829:1: entryRuleGeometry returns [EObject current=null] : iv_ruleGeometry= ruleGeometry EOF ;
    public final EObject entryRuleGeometry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeometry = null;


        try {
            // InternalMyDsl.g:1829:49: (iv_ruleGeometry= ruleGeometry EOF )
            // InternalMyDsl.g:1830:2: iv_ruleGeometry= ruleGeometry EOF
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
    // InternalMyDsl.g:1836:1: ruleGeometry returns [EObject current=null] : (this_Box_0= ruleBox | this_Cylinder_1= ruleCylinder | this_Mesh_2= ruleMesh | this_Sphere_3= ruleSphere ) ;
    public final EObject ruleGeometry() throws RecognitionException {
        EObject current = null;

        EObject this_Box_0 = null;

        EObject this_Cylinder_1 = null;

        EObject this_Mesh_2 = null;

        EObject this_Sphere_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1842:2: ( (this_Box_0= ruleBox | this_Cylinder_1= ruleCylinder | this_Mesh_2= ruleMesh | this_Sphere_3= ruleSphere ) )
            // InternalMyDsl.g:1843:2: (this_Box_0= ruleBox | this_Cylinder_1= ruleCylinder | this_Mesh_2= ruleMesh | this_Sphere_3= ruleSphere )
            {
            // InternalMyDsl.g:1843:2: (this_Box_0= ruleBox | this_Cylinder_1= ruleCylinder | this_Mesh_2= ruleMesh | this_Sphere_3= ruleSphere )
            int alt26=4;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt26=1;
                }
                break;
            case 53:
                {
                alt26=2;
                }
                break;
            case 55:
                {
                alt26=3;
                }
                break;
            case 57:
                {
                alt26=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalMyDsl.g:1844:3: this_Box_0= ruleBox
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
                    // InternalMyDsl.g:1853:3: this_Cylinder_1= ruleCylinder
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
                    // InternalMyDsl.g:1862:3: this_Mesh_2= ruleMesh
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
                    // InternalMyDsl.g:1871:3: this_Sphere_3= ruleSphere
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
    // InternalMyDsl.g:1883:1: entryRuleBox returns [EObject current=null] : iv_ruleBox= ruleBox EOF ;
    public final EObject entryRuleBox() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBox = null;


        try {
            // InternalMyDsl.g:1883:44: (iv_ruleBox= ruleBox EOF )
            // InternalMyDsl.g:1884:2: iv_ruleBox= ruleBox EOF
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
    // InternalMyDsl.g:1890:1: ruleBox returns [EObject current=null] : (otherlv_0= 'Box' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'height' ( (lv_height_3_0= ruleURDFAttrNumeric ) ) otherlv_4= 'length' ( (lv_length_5_0= ruleURDFAttrNumeric ) ) otherlv_6= 'width' ( (lv_width_7_0= ruleURDFAttrNumeric ) ) ) ;
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
            // InternalMyDsl.g:1896:2: ( (otherlv_0= 'Box' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'height' ( (lv_height_3_0= ruleURDFAttrNumeric ) ) otherlv_4= 'length' ( (lv_length_5_0= ruleURDFAttrNumeric ) ) otherlv_6= 'width' ( (lv_width_7_0= ruleURDFAttrNumeric ) ) ) )
            // InternalMyDsl.g:1897:2: (otherlv_0= 'Box' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'height' ( (lv_height_3_0= ruleURDFAttrNumeric ) ) otherlv_4= 'length' ( (lv_length_5_0= ruleURDFAttrNumeric ) ) otherlv_6= 'width' ( (lv_width_7_0= ruleURDFAttrNumeric ) ) )
            {
            // InternalMyDsl.g:1897:2: (otherlv_0= 'Box' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'height' ( (lv_height_3_0= ruleURDFAttrNumeric ) ) otherlv_4= 'length' ( (lv_length_5_0= ruleURDFAttrNumeric ) ) otherlv_6= 'width' ( (lv_width_7_0= ruleURDFAttrNumeric ) ) )
            // InternalMyDsl.g:1898:3: otherlv_0= 'Box' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'height' ( (lv_height_3_0= ruleURDFAttrNumeric ) ) otherlv_4= 'length' ( (lv_length_5_0= ruleURDFAttrNumeric ) ) otherlv_6= 'width' ( (lv_width_7_0= ruleURDFAttrNumeric ) )
            {
            otherlv_0=(Token)match(input,49,FOLLOW_43); 

            			newLeafNode(otherlv_0, grammarAccess.getBoxAccess().getBoxKeyword_0());
            		
            // InternalMyDsl.g:1902:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ID) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalMyDsl.g:1903:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalMyDsl.g:1903:4: (lv_name_1_0= RULE_ID )
                    // InternalMyDsl.g:1904:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_44); 

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

            otherlv_2=(Token)match(input,50,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getBoxAccess().getHeightKeyword_2());
            		
            // InternalMyDsl.g:1924:3: ( (lv_height_3_0= ruleURDFAttrNumeric ) )
            // InternalMyDsl.g:1925:4: (lv_height_3_0= ruleURDFAttrNumeric )
            {
            // InternalMyDsl.g:1925:4: (lv_height_3_0= ruleURDFAttrNumeric )
            // InternalMyDsl.g:1926:5: lv_height_3_0= ruleURDFAttrNumeric
            {

            					newCompositeNode(grammarAccess.getBoxAccess().getHeightURDFAttrNumericParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_45);
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

            otherlv_4=(Token)match(input,51,FOLLOW_22); 

            			newLeafNode(otherlv_4, grammarAccess.getBoxAccess().getLengthKeyword_4());
            		
            // InternalMyDsl.g:1947:3: ( (lv_length_5_0= ruleURDFAttrNumeric ) )
            // InternalMyDsl.g:1948:4: (lv_length_5_0= ruleURDFAttrNumeric )
            {
            // InternalMyDsl.g:1948:4: (lv_length_5_0= ruleURDFAttrNumeric )
            // InternalMyDsl.g:1949:5: lv_length_5_0= ruleURDFAttrNumeric
            {

            					newCompositeNode(grammarAccess.getBoxAccess().getLengthURDFAttrNumericParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_46);
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

            otherlv_6=(Token)match(input,52,FOLLOW_22); 

            			newLeafNode(otherlv_6, grammarAccess.getBoxAccess().getWidthKeyword_6());
            		
            // InternalMyDsl.g:1970:3: ( (lv_width_7_0= ruleURDFAttrNumeric ) )
            // InternalMyDsl.g:1971:4: (lv_width_7_0= ruleURDFAttrNumeric )
            {
            // InternalMyDsl.g:1971:4: (lv_width_7_0= ruleURDFAttrNumeric )
            // InternalMyDsl.g:1972:5: lv_width_7_0= ruleURDFAttrNumeric
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
    // InternalMyDsl.g:1993:1: entryRuleCylinder returns [EObject current=null] : iv_ruleCylinder= ruleCylinder EOF ;
    public final EObject entryRuleCylinder() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCylinder = null;


        try {
            // InternalMyDsl.g:1993:49: (iv_ruleCylinder= ruleCylinder EOF )
            // InternalMyDsl.g:1994:2: iv_ruleCylinder= ruleCylinder EOF
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
    // InternalMyDsl.g:2000:1: ruleCylinder returns [EObject current=null] : (otherlv_0= 'Cylinder' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'radius' ( (lv_radius_3_0= ruleURDFAttrNumeric ) ) otherlv_4= 'length' ( (lv_length_5_0= ruleURDFAttrNumeric ) ) ) ;
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
            // InternalMyDsl.g:2006:2: ( (otherlv_0= 'Cylinder' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'radius' ( (lv_radius_3_0= ruleURDFAttrNumeric ) ) otherlv_4= 'length' ( (lv_length_5_0= ruleURDFAttrNumeric ) ) ) )
            // InternalMyDsl.g:2007:2: (otherlv_0= 'Cylinder' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'radius' ( (lv_radius_3_0= ruleURDFAttrNumeric ) ) otherlv_4= 'length' ( (lv_length_5_0= ruleURDFAttrNumeric ) ) )
            {
            // InternalMyDsl.g:2007:2: (otherlv_0= 'Cylinder' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'radius' ( (lv_radius_3_0= ruleURDFAttrNumeric ) ) otherlv_4= 'length' ( (lv_length_5_0= ruleURDFAttrNumeric ) ) )
            // InternalMyDsl.g:2008:3: otherlv_0= 'Cylinder' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'radius' ( (lv_radius_3_0= ruleURDFAttrNumeric ) ) otherlv_4= 'length' ( (lv_length_5_0= ruleURDFAttrNumeric ) )
            {
            otherlv_0=(Token)match(input,53,FOLLOW_47); 

            			newLeafNode(otherlv_0, grammarAccess.getCylinderAccess().getCylinderKeyword_0());
            		
            // InternalMyDsl.g:2012:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_ID) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalMyDsl.g:2013:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalMyDsl.g:2013:4: (lv_name_1_0= RULE_ID )
                    // InternalMyDsl.g:2014:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_48); 

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

            otherlv_2=(Token)match(input,54,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getCylinderAccess().getRadiusKeyword_2());
            		
            // InternalMyDsl.g:2034:3: ( (lv_radius_3_0= ruleURDFAttrNumeric ) )
            // InternalMyDsl.g:2035:4: (lv_radius_3_0= ruleURDFAttrNumeric )
            {
            // InternalMyDsl.g:2035:4: (lv_radius_3_0= ruleURDFAttrNumeric )
            // InternalMyDsl.g:2036:5: lv_radius_3_0= ruleURDFAttrNumeric
            {

            					newCompositeNode(grammarAccess.getCylinderAccess().getRadiusURDFAttrNumericParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_45);
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

            otherlv_4=(Token)match(input,51,FOLLOW_22); 

            			newLeafNode(otherlv_4, grammarAccess.getCylinderAccess().getLengthKeyword_4());
            		
            // InternalMyDsl.g:2057:3: ( (lv_length_5_0= ruleURDFAttrNumeric ) )
            // InternalMyDsl.g:2058:4: (lv_length_5_0= ruleURDFAttrNumeric )
            {
            // InternalMyDsl.g:2058:4: (lv_length_5_0= ruleURDFAttrNumeric )
            // InternalMyDsl.g:2059:5: lv_length_5_0= ruleURDFAttrNumeric
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
    // InternalMyDsl.g:2080:1: entryRuleMesh returns [EObject current=null] : iv_ruleMesh= ruleMesh EOF ;
    public final EObject entryRuleMesh() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMesh = null;


        try {
            // InternalMyDsl.g:2080:45: (iv_ruleMesh= ruleMesh EOF )
            // InternalMyDsl.g:2081:2: iv_ruleMesh= ruleMesh EOF
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
    // InternalMyDsl.g:2087:1: ruleMesh returns [EObject current=null] : (otherlv_0= 'Mesh' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'pathToFile' ( (lv_pathToFile_3_0= ruleURDFAttrSTRING ) ) ) ;
    public final EObject ruleMesh() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_pathToFile_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2093:2: ( (otherlv_0= 'Mesh' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'pathToFile' ( (lv_pathToFile_3_0= ruleURDFAttrSTRING ) ) ) )
            // InternalMyDsl.g:2094:2: (otherlv_0= 'Mesh' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'pathToFile' ( (lv_pathToFile_3_0= ruleURDFAttrSTRING ) ) )
            {
            // InternalMyDsl.g:2094:2: (otherlv_0= 'Mesh' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'pathToFile' ( (lv_pathToFile_3_0= ruleURDFAttrSTRING ) ) )
            // InternalMyDsl.g:2095:3: otherlv_0= 'Mesh' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'pathToFile' ( (lv_pathToFile_3_0= ruleURDFAttrSTRING ) )
            {
            otherlv_0=(Token)match(input,55,FOLLOW_49); 

            			newLeafNode(otherlv_0, grammarAccess.getMeshAccess().getMeshKeyword_0());
            		
            // InternalMyDsl.g:2099:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_ID) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalMyDsl.g:2100:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalMyDsl.g:2100:4: (lv_name_1_0= RULE_ID )
                    // InternalMyDsl.g:2101:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_50); 

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

            otherlv_2=(Token)match(input,56,FOLLOW_51); 

            			newLeafNode(otherlv_2, grammarAccess.getMeshAccess().getPathToFileKeyword_2());
            		
            // InternalMyDsl.g:2121:3: ( (lv_pathToFile_3_0= ruleURDFAttrSTRING ) )
            // InternalMyDsl.g:2122:4: (lv_pathToFile_3_0= ruleURDFAttrSTRING )
            {
            // InternalMyDsl.g:2122:4: (lv_pathToFile_3_0= ruleURDFAttrSTRING )
            // InternalMyDsl.g:2123:5: lv_pathToFile_3_0= ruleURDFAttrSTRING
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
    // InternalMyDsl.g:2144:1: entryRuleSphere returns [EObject current=null] : iv_ruleSphere= ruleSphere EOF ;
    public final EObject entryRuleSphere() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSphere = null;


        try {
            // InternalMyDsl.g:2144:47: (iv_ruleSphere= ruleSphere EOF )
            // InternalMyDsl.g:2145:2: iv_ruleSphere= ruleSphere EOF
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
    // InternalMyDsl.g:2151:1: ruleSphere returns [EObject current=null] : (otherlv_0= 'Sphere' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'radius' ( (lv_radius_3_0= ruleURDFAttrNumeric ) ) ) ;
    public final EObject ruleSphere() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_radius_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2157:2: ( (otherlv_0= 'Sphere' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'radius' ( (lv_radius_3_0= ruleURDFAttrNumeric ) ) ) )
            // InternalMyDsl.g:2158:2: (otherlv_0= 'Sphere' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'radius' ( (lv_radius_3_0= ruleURDFAttrNumeric ) ) )
            {
            // InternalMyDsl.g:2158:2: (otherlv_0= 'Sphere' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'radius' ( (lv_radius_3_0= ruleURDFAttrNumeric ) ) )
            // InternalMyDsl.g:2159:3: otherlv_0= 'Sphere' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'radius' ( (lv_radius_3_0= ruleURDFAttrNumeric ) )
            {
            otherlv_0=(Token)match(input,57,FOLLOW_47); 

            			newLeafNode(otherlv_0, grammarAccess.getSphereAccess().getSphereKeyword_0());
            		
            // InternalMyDsl.g:2163:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_ID) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalMyDsl.g:2164:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalMyDsl.g:2164:4: (lv_name_1_0= RULE_ID )
                    // InternalMyDsl.g:2165:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_48); 

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

            otherlv_2=(Token)match(input,54,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getSphereAccess().getRadiusKeyword_2());
            		
            // InternalMyDsl.g:2185:3: ( (lv_radius_3_0= ruleURDFAttrNumeric ) )
            // InternalMyDsl.g:2186:4: (lv_radius_3_0= ruleURDFAttrNumeric )
            {
            // InternalMyDsl.g:2186:4: (lv_radius_3_0= ruleURDFAttrNumeric )
            // InternalMyDsl.g:2187:5: lv_radius_3_0= ruleURDFAttrNumeric
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
    // InternalMyDsl.g:2208:1: entryRuleMaterial returns [EObject current=null] : iv_ruleMaterial= ruleMaterial EOF ;
    public final EObject entryRuleMaterial() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaterial = null;


        try {
            // InternalMyDsl.g:2208:49: (iv_ruleMaterial= ruleMaterial EOF )
            // InternalMyDsl.g:2209:2: iv_ruleMaterial= ruleMaterial EOF
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
    // InternalMyDsl.g:2215:1: ruleMaterial returns [EObject current=null] : (this_Texture_0= ruleTexture | this_Color_1= ruleColor ) ;
    public final EObject ruleMaterial() throws RecognitionException {
        EObject current = null;

        EObject this_Texture_0 = null;

        EObject this_Color_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2221:2: ( (this_Texture_0= ruleTexture | this_Color_1= ruleColor ) )
            // InternalMyDsl.g:2222:2: (this_Texture_0= ruleTexture | this_Color_1= ruleColor )
            {
            // InternalMyDsl.g:2222:2: (this_Texture_0= ruleTexture | this_Color_1= ruleColor )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==58) ) {
                alt31=1;
            }
            else if ( (LA31_0==59) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalMyDsl.g:2223:3: this_Texture_0= ruleTexture
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
                    // InternalMyDsl.g:2232:3: this_Color_1= ruleColor
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
    // InternalMyDsl.g:2244:1: entryRuleTexture returns [EObject current=null] : iv_ruleTexture= ruleTexture EOF ;
    public final EObject entryRuleTexture() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTexture = null;


        try {
            // InternalMyDsl.g:2244:48: (iv_ruleTexture= ruleTexture EOF )
            // InternalMyDsl.g:2245:2: iv_ruleTexture= ruleTexture EOF
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
    // InternalMyDsl.g:2251:1: ruleTexture returns [EObject current=null] : (otherlv_0= 'Texture' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'pathToFile' ( (lv_pathToFile_3_0= ruleURDFAttrSTRING ) ) ) ;
    public final EObject ruleTexture() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_pathToFile_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2257:2: ( (otherlv_0= 'Texture' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'pathToFile' ( (lv_pathToFile_3_0= ruleURDFAttrSTRING ) ) ) )
            // InternalMyDsl.g:2258:2: (otherlv_0= 'Texture' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'pathToFile' ( (lv_pathToFile_3_0= ruleURDFAttrSTRING ) ) )
            {
            // InternalMyDsl.g:2258:2: (otherlv_0= 'Texture' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'pathToFile' ( (lv_pathToFile_3_0= ruleURDFAttrSTRING ) ) )
            // InternalMyDsl.g:2259:3: otherlv_0= 'Texture' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'pathToFile' ( (lv_pathToFile_3_0= ruleURDFAttrSTRING ) )
            {
            otherlv_0=(Token)match(input,58,FOLLOW_49); 

            			newLeafNode(otherlv_0, grammarAccess.getTextureAccess().getTextureKeyword_0());
            		
            // InternalMyDsl.g:2263:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_ID) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalMyDsl.g:2264:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalMyDsl.g:2264:4: (lv_name_1_0= RULE_ID )
                    // InternalMyDsl.g:2265:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_50); 

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

            otherlv_2=(Token)match(input,56,FOLLOW_51); 

            			newLeafNode(otherlv_2, grammarAccess.getTextureAccess().getPathToFileKeyword_2());
            		
            // InternalMyDsl.g:2285:3: ( (lv_pathToFile_3_0= ruleURDFAttrSTRING ) )
            // InternalMyDsl.g:2286:4: (lv_pathToFile_3_0= ruleURDFAttrSTRING )
            {
            // InternalMyDsl.g:2286:4: (lv_pathToFile_3_0= ruleURDFAttrSTRING )
            // InternalMyDsl.g:2287:5: lv_pathToFile_3_0= ruleURDFAttrSTRING
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
    // InternalMyDsl.g:2308:1: entryRuleColor returns [EObject current=null] : iv_ruleColor= ruleColor EOF ;
    public final EObject entryRuleColor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColor = null;


        try {
            // InternalMyDsl.g:2308:46: (iv_ruleColor= ruleColor EOF )
            // InternalMyDsl.g:2309:2: iv_ruleColor= ruleColor EOF
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
    // InternalMyDsl.g:2315:1: ruleColor returns [EObject current=null] : (otherlv_0= 'Color' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'red' ( (lv_red_3_0= ruleURDFAttrFloat ) ) otherlv_4= 'green' ( (lv_green_5_0= ruleURDFAttrFloat ) ) otherlv_6= 'blue' ( (lv_blue_7_0= ruleURDFAttrFloat ) ) otherlv_8= 'alpha' ( (lv_alpha_9_0= ruleURDFAttrFloat ) ) ) ;
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
            // InternalMyDsl.g:2321:2: ( (otherlv_0= 'Color' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'red' ( (lv_red_3_0= ruleURDFAttrFloat ) ) otherlv_4= 'green' ( (lv_green_5_0= ruleURDFAttrFloat ) ) otherlv_6= 'blue' ( (lv_blue_7_0= ruleURDFAttrFloat ) ) otherlv_8= 'alpha' ( (lv_alpha_9_0= ruleURDFAttrFloat ) ) ) )
            // InternalMyDsl.g:2322:2: (otherlv_0= 'Color' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'red' ( (lv_red_3_0= ruleURDFAttrFloat ) ) otherlv_4= 'green' ( (lv_green_5_0= ruleURDFAttrFloat ) ) otherlv_6= 'blue' ( (lv_blue_7_0= ruleURDFAttrFloat ) ) otherlv_8= 'alpha' ( (lv_alpha_9_0= ruleURDFAttrFloat ) ) )
            {
            // InternalMyDsl.g:2322:2: (otherlv_0= 'Color' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'red' ( (lv_red_3_0= ruleURDFAttrFloat ) ) otherlv_4= 'green' ( (lv_green_5_0= ruleURDFAttrFloat ) ) otherlv_6= 'blue' ( (lv_blue_7_0= ruleURDFAttrFloat ) ) otherlv_8= 'alpha' ( (lv_alpha_9_0= ruleURDFAttrFloat ) ) )
            // InternalMyDsl.g:2323:3: otherlv_0= 'Color' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'red' ( (lv_red_3_0= ruleURDFAttrFloat ) ) otherlv_4= 'green' ( (lv_green_5_0= ruleURDFAttrFloat ) ) otherlv_6= 'blue' ( (lv_blue_7_0= ruleURDFAttrFloat ) ) otherlv_8= 'alpha' ( (lv_alpha_9_0= ruleURDFAttrFloat ) )
            {
            otherlv_0=(Token)match(input,59,FOLLOW_52); 

            			newLeafNode(otherlv_0, grammarAccess.getColorAccess().getColorKeyword_0());
            		
            // InternalMyDsl.g:2327:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_ID) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalMyDsl.g:2328:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalMyDsl.g:2328:4: (lv_name_1_0= RULE_ID )
                    // InternalMyDsl.g:2329:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_53); 

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

            otherlv_2=(Token)match(input,60,FOLLOW_54); 

            			newLeafNode(otherlv_2, grammarAccess.getColorAccess().getRedKeyword_2());
            		
            // InternalMyDsl.g:2349:3: ( (lv_red_3_0= ruleURDFAttrFloat ) )
            // InternalMyDsl.g:2350:4: (lv_red_3_0= ruleURDFAttrFloat )
            {
            // InternalMyDsl.g:2350:4: (lv_red_3_0= ruleURDFAttrFloat )
            // InternalMyDsl.g:2351:5: lv_red_3_0= ruleURDFAttrFloat
            {

            					newCompositeNode(grammarAccess.getColorAccess().getRedURDFAttrFloatParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_55);
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

            otherlv_4=(Token)match(input,61,FOLLOW_54); 

            			newLeafNode(otherlv_4, grammarAccess.getColorAccess().getGreenKeyword_4());
            		
            // InternalMyDsl.g:2372:3: ( (lv_green_5_0= ruleURDFAttrFloat ) )
            // InternalMyDsl.g:2373:4: (lv_green_5_0= ruleURDFAttrFloat )
            {
            // InternalMyDsl.g:2373:4: (lv_green_5_0= ruleURDFAttrFloat )
            // InternalMyDsl.g:2374:5: lv_green_5_0= ruleURDFAttrFloat
            {

            					newCompositeNode(grammarAccess.getColorAccess().getGreenURDFAttrFloatParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_56);
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

            otherlv_6=(Token)match(input,62,FOLLOW_54); 

            			newLeafNode(otherlv_6, grammarAccess.getColorAccess().getBlueKeyword_6());
            		
            // InternalMyDsl.g:2395:3: ( (lv_blue_7_0= ruleURDFAttrFloat ) )
            // InternalMyDsl.g:2396:4: (lv_blue_7_0= ruleURDFAttrFloat )
            {
            // InternalMyDsl.g:2396:4: (lv_blue_7_0= ruleURDFAttrFloat )
            // InternalMyDsl.g:2397:5: lv_blue_7_0= ruleURDFAttrFloat
            {

            					newCompositeNode(grammarAccess.getColorAccess().getBlueURDFAttrFloatParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_57);
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

            otherlv_8=(Token)match(input,63,FOLLOW_54); 

            			newLeafNode(otherlv_8, grammarAccess.getColorAccess().getAlphaKeyword_8());
            		
            // InternalMyDsl.g:2418:3: ( (lv_alpha_9_0= ruleURDFAttrFloat ) )
            // InternalMyDsl.g:2419:4: (lv_alpha_9_0= ruleURDFAttrFloat )
            {
            // InternalMyDsl.g:2419:4: (lv_alpha_9_0= ruleURDFAttrFloat )
            // InternalMyDsl.g:2420:5: lv_alpha_9_0= ruleURDFAttrFloat
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
    // InternalMyDsl.g:2441:1: entryRuleJoint returns [EObject current=null] : iv_ruleJoint= ruleJoint EOF ;
    public final EObject entryRuleJoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoint = null;


        try {
            // InternalMyDsl.g:2441:46: (iv_ruleJoint= ruleJoint EOF )
            // InternalMyDsl.g:2442:2: iv_ruleJoint= ruleJoint EOF
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
    // InternalMyDsl.g:2448:1: ruleJoint returns [EObject current=null] : (otherlv_0= 'Joint' ( (lv_name_1_0= RULE_ID ) ) ( ( (otherlv_2= 'def' otherlv_3= 'ChildOf' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'ParentOf' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'Type' ( (lv_type_8_0= ruleJointType ) ) ) ( ( (lv_origin_9_0= ruleOrigin ) ) | ( (lv_axis_10_0= ruleAxis ) ) | ( (lv_limit_11_0= ruleLimit ) ) | ( (lv_calibration_12_0= ruleCalibration ) ) | ( (lv_dynamics_13_0= ruleDynamics ) ) | ( (lv_safetycontroller_14_0= ruleSafetyController ) ) )* ) | (otherlv_15= 'reuse' ( (otherlv_16= RULE_ID ) ) otherlv_17= 'ChildOf' ( (otherlv_18= RULE_ID ) ) otherlv_19= 'ParentOf' ( (otherlv_20= RULE_ID ) ) ( (lv_reuse_21_0= ruleReuse ) )? ) ) ) ;
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
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Enumerator lv_type_8_0 = null;

        EObject lv_origin_9_0 = null;

        EObject lv_axis_10_0 = null;

        EObject lv_limit_11_0 = null;

        EObject lv_calibration_12_0 = null;

        EObject lv_dynamics_13_0 = null;

        EObject lv_safetycontroller_14_0 = null;

        EObject lv_reuse_21_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2454:2: ( (otherlv_0= 'Joint' ( (lv_name_1_0= RULE_ID ) ) ( ( (otherlv_2= 'def' otherlv_3= 'ChildOf' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'ParentOf' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'Type' ( (lv_type_8_0= ruleJointType ) ) ) ( ( (lv_origin_9_0= ruleOrigin ) ) | ( (lv_axis_10_0= ruleAxis ) ) | ( (lv_limit_11_0= ruleLimit ) ) | ( (lv_calibration_12_0= ruleCalibration ) ) | ( (lv_dynamics_13_0= ruleDynamics ) ) | ( (lv_safetycontroller_14_0= ruleSafetyController ) ) )* ) | (otherlv_15= 'reuse' ( (otherlv_16= RULE_ID ) ) otherlv_17= 'ChildOf' ( (otherlv_18= RULE_ID ) ) otherlv_19= 'ParentOf' ( (otherlv_20= RULE_ID ) ) ( (lv_reuse_21_0= ruleReuse ) )? ) ) ) )
            // InternalMyDsl.g:2455:2: (otherlv_0= 'Joint' ( (lv_name_1_0= RULE_ID ) ) ( ( (otherlv_2= 'def' otherlv_3= 'ChildOf' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'ParentOf' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'Type' ( (lv_type_8_0= ruleJointType ) ) ) ( ( (lv_origin_9_0= ruleOrigin ) ) | ( (lv_axis_10_0= ruleAxis ) ) | ( (lv_limit_11_0= ruleLimit ) ) | ( (lv_calibration_12_0= ruleCalibration ) ) | ( (lv_dynamics_13_0= ruleDynamics ) ) | ( (lv_safetycontroller_14_0= ruleSafetyController ) ) )* ) | (otherlv_15= 'reuse' ( (otherlv_16= RULE_ID ) ) otherlv_17= 'ChildOf' ( (otherlv_18= RULE_ID ) ) otherlv_19= 'ParentOf' ( (otherlv_20= RULE_ID ) ) ( (lv_reuse_21_0= ruleReuse ) )? ) ) )
            {
            // InternalMyDsl.g:2455:2: (otherlv_0= 'Joint' ( (lv_name_1_0= RULE_ID ) ) ( ( (otherlv_2= 'def' otherlv_3= 'ChildOf' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'ParentOf' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'Type' ( (lv_type_8_0= ruleJointType ) ) ) ( ( (lv_origin_9_0= ruleOrigin ) ) | ( (lv_axis_10_0= ruleAxis ) ) | ( (lv_limit_11_0= ruleLimit ) ) | ( (lv_calibration_12_0= ruleCalibration ) ) | ( (lv_dynamics_13_0= ruleDynamics ) ) | ( (lv_safetycontroller_14_0= ruleSafetyController ) ) )* ) | (otherlv_15= 'reuse' ( (otherlv_16= RULE_ID ) ) otherlv_17= 'ChildOf' ( (otherlv_18= RULE_ID ) ) otherlv_19= 'ParentOf' ( (otherlv_20= RULE_ID ) ) ( (lv_reuse_21_0= ruleReuse ) )? ) ) )
            // InternalMyDsl.g:2456:3: otherlv_0= 'Joint' ( (lv_name_1_0= RULE_ID ) ) ( ( (otherlv_2= 'def' otherlv_3= 'ChildOf' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'ParentOf' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'Type' ( (lv_type_8_0= ruleJointType ) ) ) ( ( (lv_origin_9_0= ruleOrigin ) ) | ( (lv_axis_10_0= ruleAxis ) ) | ( (lv_limit_11_0= ruleLimit ) ) | ( (lv_calibration_12_0= ruleCalibration ) ) | ( (lv_dynamics_13_0= ruleDynamics ) ) | ( (lv_safetycontroller_14_0= ruleSafetyController ) ) )* ) | (otherlv_15= 'reuse' ( (otherlv_16= RULE_ID ) ) otherlv_17= 'ChildOf' ( (otherlv_18= RULE_ID ) ) otherlv_19= 'ParentOf' ( (otherlv_20= RULE_ID ) ) ( (lv_reuse_21_0= ruleReuse ) )? ) )
            {
            otherlv_0=(Token)match(input,64,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getJointAccess().getJointKeyword_0());
            		
            // InternalMyDsl.g:2460:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:2461:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:2461:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:2462:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_58); 

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

            // InternalMyDsl.g:2478:3: ( ( (otherlv_2= 'def' otherlv_3= 'ChildOf' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'ParentOf' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'Type' ( (lv_type_8_0= ruleJointType ) ) ) ( ( (lv_origin_9_0= ruleOrigin ) ) | ( (lv_axis_10_0= ruleAxis ) ) | ( (lv_limit_11_0= ruleLimit ) ) | ( (lv_calibration_12_0= ruleCalibration ) ) | ( (lv_dynamics_13_0= ruleDynamics ) ) | ( (lv_safetycontroller_14_0= ruleSafetyController ) ) )* ) | (otherlv_15= 'reuse' ( (otherlv_16= RULE_ID ) ) otherlv_17= 'ChildOf' ( (otherlv_18= RULE_ID ) ) otherlv_19= 'ParentOf' ( (otherlv_20= RULE_ID ) ) ( (lv_reuse_21_0= ruleReuse ) )? ) )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==18) ) {
                alt36=1;
            }
            else if ( (LA36_0==19) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalMyDsl.g:2479:4: ( (otherlv_2= 'def' otherlv_3= 'ChildOf' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'ParentOf' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'Type' ( (lv_type_8_0= ruleJointType ) ) ) ( ( (lv_origin_9_0= ruleOrigin ) ) | ( (lv_axis_10_0= ruleAxis ) ) | ( (lv_limit_11_0= ruleLimit ) ) | ( (lv_calibration_12_0= ruleCalibration ) ) | ( (lv_dynamics_13_0= ruleDynamics ) ) | ( (lv_safetycontroller_14_0= ruleSafetyController ) ) )* )
                    {
                    // InternalMyDsl.g:2479:4: ( (otherlv_2= 'def' otherlv_3= 'ChildOf' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'ParentOf' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'Type' ( (lv_type_8_0= ruleJointType ) ) ) ( ( (lv_origin_9_0= ruleOrigin ) ) | ( (lv_axis_10_0= ruleAxis ) ) | ( (lv_limit_11_0= ruleLimit ) ) | ( (lv_calibration_12_0= ruleCalibration ) ) | ( (lv_dynamics_13_0= ruleDynamics ) ) | ( (lv_safetycontroller_14_0= ruleSafetyController ) ) )* )
                    // InternalMyDsl.g:2480:5: (otherlv_2= 'def' otherlv_3= 'ChildOf' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'ParentOf' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'Type' ( (lv_type_8_0= ruleJointType ) ) ) ( ( (lv_origin_9_0= ruleOrigin ) ) | ( (lv_axis_10_0= ruleAxis ) ) | ( (lv_limit_11_0= ruleLimit ) ) | ( (lv_calibration_12_0= ruleCalibration ) ) | ( (lv_dynamics_13_0= ruleDynamics ) ) | ( (lv_safetycontroller_14_0= ruleSafetyController ) ) )*
                    {
                    // InternalMyDsl.g:2480:5: (otherlv_2= 'def' otherlv_3= 'ChildOf' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'ParentOf' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'Type' ( (lv_type_8_0= ruleJointType ) ) )
                    // InternalMyDsl.g:2481:6: otherlv_2= 'def' otherlv_3= 'ChildOf' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'ParentOf' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'Type' ( (lv_type_8_0= ruleJointType ) )
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_59); 

                    						newLeafNode(otherlv_2, grammarAccess.getJointAccess().getDefKeyword_2_0_0_0());
                    					
                    otherlv_3=(Token)match(input,65,FOLLOW_3); 

                    						newLeafNode(otherlv_3, grammarAccess.getJointAccess().getChildOfKeyword_2_0_0_1());
                    					
                    // InternalMyDsl.g:2489:6: ( (otherlv_4= RULE_ID ) )
                    // InternalMyDsl.g:2490:7: (otherlv_4= RULE_ID )
                    {
                    // InternalMyDsl.g:2490:7: (otherlv_4= RULE_ID )
                    // InternalMyDsl.g:2491:8: otherlv_4= RULE_ID
                    {

                    								if (current==null) {
                    									current = createModelElement(grammarAccess.getJointRule());
                    								}
                    							
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_60); 

                    								newLeafNode(otherlv_4, grammarAccess.getJointAccess().getChildOfLinkCrossReference_2_0_0_2_0());
                    							

                    }


                    }

                    otherlv_5=(Token)match(input,66,FOLLOW_3); 

                    						newLeafNode(otherlv_5, grammarAccess.getJointAccess().getParentOfKeyword_2_0_0_3());
                    					
                    // InternalMyDsl.g:2506:6: ( (otherlv_6= RULE_ID ) )
                    // InternalMyDsl.g:2507:7: (otherlv_6= RULE_ID )
                    {
                    // InternalMyDsl.g:2507:7: (otherlv_6= RULE_ID )
                    // InternalMyDsl.g:2508:8: otherlv_6= RULE_ID
                    {

                    								if (current==null) {
                    									current = createModelElement(grammarAccess.getJointRule());
                    								}
                    							
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_61); 

                    								newLeafNode(otherlv_6, grammarAccess.getJointAccess().getParentOfLinkCrossReference_2_0_0_4_0());
                    							

                    }


                    }

                    otherlv_7=(Token)match(input,67,FOLLOW_62); 

                    						newLeafNode(otherlv_7, grammarAccess.getJointAccess().getTypeKeyword_2_0_0_5());
                    					
                    // InternalMyDsl.g:2523:6: ( (lv_type_8_0= ruleJointType ) )
                    // InternalMyDsl.g:2524:7: (lv_type_8_0= ruleJointType )
                    {
                    // InternalMyDsl.g:2524:7: (lv_type_8_0= ruleJointType )
                    // InternalMyDsl.g:2525:8: lv_type_8_0= ruleJointType
                    {

                    								newCompositeNode(grammarAccess.getJointAccess().getTypeJointTypeEnumRuleCall_2_0_0_6_0());
                    							
                    pushFollow(FOLLOW_63);
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

                    // InternalMyDsl.g:2543:5: ( ( (lv_origin_9_0= ruleOrigin ) ) | ( (lv_axis_10_0= ruleAxis ) ) | ( (lv_limit_11_0= ruleLimit ) ) | ( (lv_calibration_12_0= ruleCalibration ) ) | ( (lv_dynamics_13_0= ruleDynamics ) ) | ( (lv_safetycontroller_14_0= ruleSafetyController ) ) )*
                    loop34:
                    do {
                        int alt34=7;
                        switch ( input.LA(1) ) {
                        case 39:
                            {
                            alt34=1;
                            }
                            break;
                        case 68:
                            {
                            alt34=2;
                            }
                            break;
                        case 69:
                            {
                            alt34=3;
                            }
                            break;
                        case 74:
                            {
                            alt34=4;
                            }
                            break;
                        case 77:
                            {
                            alt34=5;
                            }
                            break;
                        case 80:
                            {
                            alt34=6;
                            }
                            break;

                        }

                        switch (alt34) {
                    	case 1 :
                    	    // InternalMyDsl.g:2544:6: ( (lv_origin_9_0= ruleOrigin ) )
                    	    {
                    	    // InternalMyDsl.g:2544:6: ( (lv_origin_9_0= ruleOrigin ) )
                    	    // InternalMyDsl.g:2545:7: (lv_origin_9_0= ruleOrigin )
                    	    {
                    	    // InternalMyDsl.g:2545:7: (lv_origin_9_0= ruleOrigin )
                    	    // InternalMyDsl.g:2546:8: lv_origin_9_0= ruleOrigin
                    	    {

                    	    								newCompositeNode(grammarAccess.getJointAccess().getOriginOriginParserRuleCall_2_0_1_0_0());
                    	    							
                    	    pushFollow(FOLLOW_63);
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
                    	    // InternalMyDsl.g:2564:6: ( (lv_axis_10_0= ruleAxis ) )
                    	    {
                    	    // InternalMyDsl.g:2564:6: ( (lv_axis_10_0= ruleAxis ) )
                    	    // InternalMyDsl.g:2565:7: (lv_axis_10_0= ruleAxis )
                    	    {
                    	    // InternalMyDsl.g:2565:7: (lv_axis_10_0= ruleAxis )
                    	    // InternalMyDsl.g:2566:8: lv_axis_10_0= ruleAxis
                    	    {

                    	    								newCompositeNode(grammarAccess.getJointAccess().getAxisAxisParserRuleCall_2_0_1_1_0());
                    	    							
                    	    pushFollow(FOLLOW_63);
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
                    	    // InternalMyDsl.g:2584:6: ( (lv_limit_11_0= ruleLimit ) )
                    	    {
                    	    // InternalMyDsl.g:2584:6: ( (lv_limit_11_0= ruleLimit ) )
                    	    // InternalMyDsl.g:2585:7: (lv_limit_11_0= ruleLimit )
                    	    {
                    	    // InternalMyDsl.g:2585:7: (lv_limit_11_0= ruleLimit )
                    	    // InternalMyDsl.g:2586:8: lv_limit_11_0= ruleLimit
                    	    {

                    	    								newCompositeNode(grammarAccess.getJointAccess().getLimitLimitParserRuleCall_2_0_1_2_0());
                    	    							
                    	    pushFollow(FOLLOW_63);
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
                    	    // InternalMyDsl.g:2604:6: ( (lv_calibration_12_0= ruleCalibration ) )
                    	    {
                    	    // InternalMyDsl.g:2604:6: ( (lv_calibration_12_0= ruleCalibration ) )
                    	    // InternalMyDsl.g:2605:7: (lv_calibration_12_0= ruleCalibration )
                    	    {
                    	    // InternalMyDsl.g:2605:7: (lv_calibration_12_0= ruleCalibration )
                    	    // InternalMyDsl.g:2606:8: lv_calibration_12_0= ruleCalibration
                    	    {

                    	    								newCompositeNode(grammarAccess.getJointAccess().getCalibrationCalibrationParserRuleCall_2_0_1_3_0());
                    	    							
                    	    pushFollow(FOLLOW_63);
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
                    	    // InternalMyDsl.g:2624:6: ( (lv_dynamics_13_0= ruleDynamics ) )
                    	    {
                    	    // InternalMyDsl.g:2624:6: ( (lv_dynamics_13_0= ruleDynamics ) )
                    	    // InternalMyDsl.g:2625:7: (lv_dynamics_13_0= ruleDynamics )
                    	    {
                    	    // InternalMyDsl.g:2625:7: (lv_dynamics_13_0= ruleDynamics )
                    	    // InternalMyDsl.g:2626:8: lv_dynamics_13_0= ruleDynamics
                    	    {

                    	    								newCompositeNode(grammarAccess.getJointAccess().getDynamicsDynamicsParserRuleCall_2_0_1_4_0());
                    	    							
                    	    pushFollow(FOLLOW_63);
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
                    	    // InternalMyDsl.g:2644:6: ( (lv_safetycontroller_14_0= ruleSafetyController ) )
                    	    {
                    	    // InternalMyDsl.g:2644:6: ( (lv_safetycontroller_14_0= ruleSafetyController ) )
                    	    // InternalMyDsl.g:2645:7: (lv_safetycontroller_14_0= ruleSafetyController )
                    	    {
                    	    // InternalMyDsl.g:2645:7: (lv_safetycontroller_14_0= ruleSafetyController )
                    	    // InternalMyDsl.g:2646:8: lv_safetycontroller_14_0= ruleSafetyController
                    	    {

                    	    								newCompositeNode(grammarAccess.getJointAccess().getSafetycontrollerSafetyControllerParserRuleCall_2_0_1_5_0());
                    	    							
                    	    pushFollow(FOLLOW_63);
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
                    	    break loop34;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2666:4: (otherlv_15= 'reuse' ( (otherlv_16= RULE_ID ) ) otherlv_17= 'ChildOf' ( (otherlv_18= RULE_ID ) ) otherlv_19= 'ParentOf' ( (otherlv_20= RULE_ID ) ) ( (lv_reuse_21_0= ruleReuse ) )? )
                    {
                    // InternalMyDsl.g:2666:4: (otherlv_15= 'reuse' ( (otherlv_16= RULE_ID ) ) otherlv_17= 'ChildOf' ( (otherlv_18= RULE_ID ) ) otherlv_19= 'ParentOf' ( (otherlv_20= RULE_ID ) ) ( (lv_reuse_21_0= ruleReuse ) )? )
                    // InternalMyDsl.g:2667:5: otherlv_15= 'reuse' ( (otherlv_16= RULE_ID ) ) otherlv_17= 'ChildOf' ( (otherlv_18= RULE_ID ) ) otherlv_19= 'ParentOf' ( (otherlv_20= RULE_ID ) ) ( (lv_reuse_21_0= ruleReuse ) )?
                    {
                    otherlv_15=(Token)match(input,19,FOLLOW_3); 

                    					newLeafNode(otherlv_15, grammarAccess.getJointAccess().getReuseKeyword_2_1_0());
                    				
                    // InternalMyDsl.g:2671:5: ( (otherlv_16= RULE_ID ) )
                    // InternalMyDsl.g:2672:6: (otherlv_16= RULE_ID )
                    {
                    // InternalMyDsl.g:2672:6: (otherlv_16= RULE_ID )
                    // InternalMyDsl.g:2673:7: otherlv_16= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getJointRule());
                    							}
                    						
                    otherlv_16=(Token)match(input,RULE_ID,FOLLOW_59); 

                    							newLeafNode(otherlv_16, grammarAccess.getJointAccess().getIsReuseOfJointCrossReference_2_1_1_0());
                    						

                    }


                    }

                    otherlv_17=(Token)match(input,65,FOLLOW_3); 

                    					newLeafNode(otherlv_17, grammarAccess.getJointAccess().getChildOfKeyword_2_1_2());
                    				
                    // InternalMyDsl.g:2688:5: ( (otherlv_18= RULE_ID ) )
                    // InternalMyDsl.g:2689:6: (otherlv_18= RULE_ID )
                    {
                    // InternalMyDsl.g:2689:6: (otherlv_18= RULE_ID )
                    // InternalMyDsl.g:2690:7: otherlv_18= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getJointRule());
                    							}
                    						
                    otherlv_18=(Token)match(input,RULE_ID,FOLLOW_60); 

                    							newLeafNode(otherlv_18, grammarAccess.getJointAccess().getChildOfLinkCrossReference_2_1_3_0());
                    						

                    }


                    }

                    otherlv_19=(Token)match(input,66,FOLLOW_3); 

                    					newLeafNode(otherlv_19, grammarAccess.getJointAccess().getParentOfKeyword_2_1_4());
                    				
                    // InternalMyDsl.g:2705:5: ( (otherlv_20= RULE_ID ) )
                    // InternalMyDsl.g:2706:6: (otherlv_20= RULE_ID )
                    {
                    // InternalMyDsl.g:2706:6: (otherlv_20= RULE_ID )
                    // InternalMyDsl.g:2707:7: otherlv_20= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getJointRule());
                    							}
                    						
                    otherlv_20=(Token)match(input,RULE_ID,FOLLOW_9); 

                    							newLeafNode(otherlv_20, grammarAccess.getJointAccess().getParentOfLinkCrossReference_2_1_5_0());
                    						

                    }


                    }

                    // InternalMyDsl.g:2718:5: ( (lv_reuse_21_0= ruleReuse ) )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( ((LA35_0>=24 && LA35_0<=25)) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // InternalMyDsl.g:2719:6: (lv_reuse_21_0= ruleReuse )
                            {
                            // InternalMyDsl.g:2719:6: (lv_reuse_21_0= ruleReuse )
                            // InternalMyDsl.g:2720:7: lv_reuse_21_0= ruleReuse
                            {

                            							newCompositeNode(grammarAccess.getJointAccess().getReuseReuseParserRuleCall_2_1_6_0());
                            						
                            pushFollow(FOLLOW_2);
                            lv_reuse_21_0=ruleReuse();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getJointRule());
                            							}
                            							set(
                            								current,
                            								"reuse",
                            								lv_reuse_21_0,
                            								"org.xtext.example.mydsl4.MyDsl.Reuse");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }
                            break;

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
    // InternalMyDsl.g:2743:1: entryRuleAxis returns [EObject current=null] : iv_ruleAxis= ruleAxis EOF ;
    public final EObject entryRuleAxis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAxis = null;


        try {
            // InternalMyDsl.g:2743:45: (iv_ruleAxis= ruleAxis EOF )
            // InternalMyDsl.g:2744:2: iv_ruleAxis= ruleAxis EOF
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
    // InternalMyDsl.g:2750:1: ruleAxis returns [EObject current=null] : (otherlv_0= 'Axis' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'x' ( (lv_x_3_0= ruleURDFAttrINT ) ) otherlv_4= 'y' ( (lv_y_5_0= ruleURDFAttrINT ) ) otherlv_6= 'z' ( (lv_z_7_0= ruleURDFAttrINT ) ) ) ;
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
            // InternalMyDsl.g:2756:2: ( (otherlv_0= 'Axis' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'x' ( (lv_x_3_0= ruleURDFAttrINT ) ) otherlv_4= 'y' ( (lv_y_5_0= ruleURDFAttrINT ) ) otherlv_6= 'z' ( (lv_z_7_0= ruleURDFAttrINT ) ) ) )
            // InternalMyDsl.g:2757:2: (otherlv_0= 'Axis' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'x' ( (lv_x_3_0= ruleURDFAttrINT ) ) otherlv_4= 'y' ( (lv_y_5_0= ruleURDFAttrINT ) ) otherlv_6= 'z' ( (lv_z_7_0= ruleURDFAttrINT ) ) )
            {
            // InternalMyDsl.g:2757:2: (otherlv_0= 'Axis' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'x' ( (lv_x_3_0= ruleURDFAttrINT ) ) otherlv_4= 'y' ( (lv_y_5_0= ruleURDFAttrINT ) ) otherlv_6= 'z' ( (lv_z_7_0= ruleURDFAttrINT ) ) )
            // InternalMyDsl.g:2758:3: otherlv_0= 'Axis' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'x' ( (lv_x_3_0= ruleURDFAttrINT ) ) otherlv_4= 'y' ( (lv_y_5_0= ruleURDFAttrINT ) ) otherlv_6= 'z' ( (lv_z_7_0= ruleURDFAttrINT ) )
            {
            otherlv_0=(Token)match(input,68,FOLLOW_34); 

            			newLeafNode(otherlv_0, grammarAccess.getAxisAccess().getAxisKeyword_0());
            		
            // InternalMyDsl.g:2762:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_ID) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalMyDsl.g:2763:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalMyDsl.g:2763:4: (lv_name_1_0= RULE_ID )
                    // InternalMyDsl.g:2764:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_35); 

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

            otherlv_2=(Token)match(input,40,FOLLOW_54); 

            			newLeafNode(otherlv_2, grammarAccess.getAxisAccess().getXKeyword_2());
            		
            // InternalMyDsl.g:2784:3: ( (lv_x_3_0= ruleURDFAttrINT ) )
            // InternalMyDsl.g:2785:4: (lv_x_3_0= ruleURDFAttrINT )
            {
            // InternalMyDsl.g:2785:4: (lv_x_3_0= ruleURDFAttrINT )
            // InternalMyDsl.g:2786:5: lv_x_3_0= ruleURDFAttrINT
            {

            					newCompositeNode(grammarAccess.getAxisAccess().getXURDFAttrINTParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_36);
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

            otherlv_4=(Token)match(input,41,FOLLOW_54); 

            			newLeafNode(otherlv_4, grammarAccess.getAxisAccess().getYKeyword_4());
            		
            // InternalMyDsl.g:2807:3: ( (lv_y_5_0= ruleURDFAttrINT ) )
            // InternalMyDsl.g:2808:4: (lv_y_5_0= ruleURDFAttrINT )
            {
            // InternalMyDsl.g:2808:4: (lv_y_5_0= ruleURDFAttrINT )
            // InternalMyDsl.g:2809:5: lv_y_5_0= ruleURDFAttrINT
            {

            					newCompositeNode(grammarAccess.getAxisAccess().getYURDFAttrINTParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_37);
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

            otherlv_6=(Token)match(input,42,FOLLOW_54); 

            			newLeafNode(otherlv_6, grammarAccess.getAxisAccess().getZKeyword_6());
            		
            // InternalMyDsl.g:2830:3: ( (lv_z_7_0= ruleURDFAttrINT ) )
            // InternalMyDsl.g:2831:4: (lv_z_7_0= ruleURDFAttrINT )
            {
            // InternalMyDsl.g:2831:4: (lv_z_7_0= ruleURDFAttrINT )
            // InternalMyDsl.g:2832:5: lv_z_7_0= ruleURDFAttrINT
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
    // InternalMyDsl.g:2853:1: entryRuleLimit returns [EObject current=null] : iv_ruleLimit= ruleLimit EOF ;
    public final EObject entryRuleLimit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLimit = null;


        try {
            // InternalMyDsl.g:2853:46: (iv_ruleLimit= ruleLimit EOF )
            // InternalMyDsl.g:2854:2: iv_ruleLimit= ruleLimit EOF
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
    // InternalMyDsl.g:2860:1: ruleLimit returns [EObject current=null] : (otherlv_0= 'Limit' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'effort' ( (lv_effort_3_0= ruleURDFAttrSignedNumeric ) ) otherlv_4= 'velocity' ( (lv_velocity_5_0= ruleURDFAttrSignedNumeric ) ) ( (otherlv_6= 'lower' ( (lv_lower_7_0= ruleURDFAttrSignedNumeric ) ) ) | (otherlv_8= 'upper' ( (lv_upper_9_0= ruleURDFAttrSignedNumeric ) ) ) )* ) ;
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
            // InternalMyDsl.g:2866:2: ( (otherlv_0= 'Limit' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'effort' ( (lv_effort_3_0= ruleURDFAttrSignedNumeric ) ) otherlv_4= 'velocity' ( (lv_velocity_5_0= ruleURDFAttrSignedNumeric ) ) ( (otherlv_6= 'lower' ( (lv_lower_7_0= ruleURDFAttrSignedNumeric ) ) ) | (otherlv_8= 'upper' ( (lv_upper_9_0= ruleURDFAttrSignedNumeric ) ) ) )* ) )
            // InternalMyDsl.g:2867:2: (otherlv_0= 'Limit' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'effort' ( (lv_effort_3_0= ruleURDFAttrSignedNumeric ) ) otherlv_4= 'velocity' ( (lv_velocity_5_0= ruleURDFAttrSignedNumeric ) ) ( (otherlv_6= 'lower' ( (lv_lower_7_0= ruleURDFAttrSignedNumeric ) ) ) | (otherlv_8= 'upper' ( (lv_upper_9_0= ruleURDFAttrSignedNumeric ) ) ) )* )
            {
            // InternalMyDsl.g:2867:2: (otherlv_0= 'Limit' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'effort' ( (lv_effort_3_0= ruleURDFAttrSignedNumeric ) ) otherlv_4= 'velocity' ( (lv_velocity_5_0= ruleURDFAttrSignedNumeric ) ) ( (otherlv_6= 'lower' ( (lv_lower_7_0= ruleURDFAttrSignedNumeric ) ) ) | (otherlv_8= 'upper' ( (lv_upper_9_0= ruleURDFAttrSignedNumeric ) ) ) )* )
            // InternalMyDsl.g:2868:3: otherlv_0= 'Limit' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'effort' ( (lv_effort_3_0= ruleURDFAttrSignedNumeric ) ) otherlv_4= 'velocity' ( (lv_velocity_5_0= ruleURDFAttrSignedNumeric ) ) ( (otherlv_6= 'lower' ( (lv_lower_7_0= ruleURDFAttrSignedNumeric ) ) ) | (otherlv_8= 'upper' ( (lv_upper_9_0= ruleURDFAttrSignedNumeric ) ) ) )*
            {
            otherlv_0=(Token)match(input,69,FOLLOW_64); 

            			newLeafNode(otherlv_0, grammarAccess.getLimitAccess().getLimitKeyword_0());
            		
            // InternalMyDsl.g:2872:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_ID) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalMyDsl.g:2873:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalMyDsl.g:2873:4: (lv_name_1_0= RULE_ID )
                    // InternalMyDsl.g:2874:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_65); 

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

            otherlv_2=(Token)match(input,70,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getLimitAccess().getEffortKeyword_2());
            		
            // InternalMyDsl.g:2894:3: ( (lv_effort_3_0= ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:2895:4: (lv_effort_3_0= ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:2895:4: (lv_effort_3_0= ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:2896:5: lv_effort_3_0= ruleURDFAttrSignedNumeric
            {

            					newCompositeNode(grammarAccess.getLimitAccess().getEffortURDFAttrSignedNumericParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_66);
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

            otherlv_4=(Token)match(input,71,FOLLOW_22); 

            			newLeafNode(otherlv_4, grammarAccess.getLimitAccess().getVelocityKeyword_4());
            		
            // InternalMyDsl.g:2917:3: ( (lv_velocity_5_0= ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:2918:4: (lv_velocity_5_0= ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:2918:4: (lv_velocity_5_0= ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:2919:5: lv_velocity_5_0= ruleURDFAttrSignedNumeric
            {

            					newCompositeNode(grammarAccess.getLimitAccess().getVelocityURDFAttrSignedNumericParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_67);
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

            // InternalMyDsl.g:2936:3: ( (otherlv_6= 'lower' ( (lv_lower_7_0= ruleURDFAttrSignedNumeric ) ) ) | (otherlv_8= 'upper' ( (lv_upper_9_0= ruleURDFAttrSignedNumeric ) ) ) )*
            loop39:
            do {
                int alt39=3;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==72) ) {
                    alt39=1;
                }
                else if ( (LA39_0==73) ) {
                    alt39=2;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalMyDsl.g:2937:4: (otherlv_6= 'lower' ( (lv_lower_7_0= ruleURDFAttrSignedNumeric ) ) )
            	    {
            	    // InternalMyDsl.g:2937:4: (otherlv_6= 'lower' ( (lv_lower_7_0= ruleURDFAttrSignedNumeric ) ) )
            	    // InternalMyDsl.g:2938:5: otherlv_6= 'lower' ( (lv_lower_7_0= ruleURDFAttrSignedNumeric ) )
            	    {
            	    otherlv_6=(Token)match(input,72,FOLLOW_22); 

            	    					newLeafNode(otherlv_6, grammarAccess.getLimitAccess().getLowerKeyword_6_0_0());
            	    				
            	    // InternalMyDsl.g:2942:5: ( (lv_lower_7_0= ruleURDFAttrSignedNumeric ) )
            	    // InternalMyDsl.g:2943:6: (lv_lower_7_0= ruleURDFAttrSignedNumeric )
            	    {
            	    // InternalMyDsl.g:2943:6: (lv_lower_7_0= ruleURDFAttrSignedNumeric )
            	    // InternalMyDsl.g:2944:7: lv_lower_7_0= ruleURDFAttrSignedNumeric
            	    {

            	    							newCompositeNode(grammarAccess.getLimitAccess().getLowerURDFAttrSignedNumericParserRuleCall_6_0_1_0());
            	    						
            	    pushFollow(FOLLOW_67);
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


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMyDsl.g:2963:4: (otherlv_8= 'upper' ( (lv_upper_9_0= ruleURDFAttrSignedNumeric ) ) )
            	    {
            	    // InternalMyDsl.g:2963:4: (otherlv_8= 'upper' ( (lv_upper_9_0= ruleURDFAttrSignedNumeric ) ) )
            	    // InternalMyDsl.g:2964:5: otherlv_8= 'upper' ( (lv_upper_9_0= ruleURDFAttrSignedNumeric ) )
            	    {
            	    otherlv_8=(Token)match(input,73,FOLLOW_22); 

            	    					newLeafNode(otherlv_8, grammarAccess.getLimitAccess().getUpperKeyword_6_1_0());
            	    				
            	    // InternalMyDsl.g:2968:5: ( (lv_upper_9_0= ruleURDFAttrSignedNumeric ) )
            	    // InternalMyDsl.g:2969:6: (lv_upper_9_0= ruleURDFAttrSignedNumeric )
            	    {
            	    // InternalMyDsl.g:2969:6: (lv_upper_9_0= ruleURDFAttrSignedNumeric )
            	    // InternalMyDsl.g:2970:7: lv_upper_9_0= ruleURDFAttrSignedNumeric
            	    {

            	    							newCompositeNode(grammarAccess.getLimitAccess().getUpperURDFAttrSignedNumericParserRuleCall_6_1_1_0());
            	    						
            	    pushFollow(FOLLOW_67);
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


            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
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
    // $ANTLR end "ruleLimit"


    // $ANTLR start "entryRuleCalibration"
    // InternalMyDsl.g:2993:1: entryRuleCalibration returns [EObject current=null] : iv_ruleCalibration= ruleCalibration EOF ;
    public final EObject entryRuleCalibration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCalibration = null;


        try {
            // InternalMyDsl.g:2993:52: (iv_ruleCalibration= ruleCalibration EOF )
            // InternalMyDsl.g:2994:2: iv_ruleCalibration= ruleCalibration EOF
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
    // InternalMyDsl.g:3000:1: ruleCalibration returns [EObject current=null] : ( () otherlv_1= 'Calibration' ( (lv_name_2_0= RULE_ID ) )? ( (otherlv_3= 'rising' ( (lv_rising_4_0= ruleURDFAttrSignedNumeric ) ) ) | (otherlv_5= 'falling' ( (lv_falling_6_0= ruleURDFAttrSignedNumeric ) ) ) ) ) ;
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
            // InternalMyDsl.g:3006:2: ( ( () otherlv_1= 'Calibration' ( (lv_name_2_0= RULE_ID ) )? ( (otherlv_3= 'rising' ( (lv_rising_4_0= ruleURDFAttrSignedNumeric ) ) ) | (otherlv_5= 'falling' ( (lv_falling_6_0= ruleURDFAttrSignedNumeric ) ) ) ) ) )
            // InternalMyDsl.g:3007:2: ( () otherlv_1= 'Calibration' ( (lv_name_2_0= RULE_ID ) )? ( (otherlv_3= 'rising' ( (lv_rising_4_0= ruleURDFAttrSignedNumeric ) ) ) | (otherlv_5= 'falling' ( (lv_falling_6_0= ruleURDFAttrSignedNumeric ) ) ) ) )
            {
            // InternalMyDsl.g:3007:2: ( () otherlv_1= 'Calibration' ( (lv_name_2_0= RULE_ID ) )? ( (otherlv_3= 'rising' ( (lv_rising_4_0= ruleURDFAttrSignedNumeric ) ) ) | (otherlv_5= 'falling' ( (lv_falling_6_0= ruleURDFAttrSignedNumeric ) ) ) ) )
            // InternalMyDsl.g:3008:3: () otherlv_1= 'Calibration' ( (lv_name_2_0= RULE_ID ) )? ( (otherlv_3= 'rising' ( (lv_rising_4_0= ruleURDFAttrSignedNumeric ) ) ) | (otherlv_5= 'falling' ( (lv_falling_6_0= ruleURDFAttrSignedNumeric ) ) ) )
            {
            // InternalMyDsl.g:3008:3: ()
            // InternalMyDsl.g:3009:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCalibrationAccess().getCalibrationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,74,FOLLOW_68); 

            			newLeafNode(otherlv_1, grammarAccess.getCalibrationAccess().getCalibrationKeyword_1());
            		
            // InternalMyDsl.g:3019:3: ( (lv_name_2_0= RULE_ID ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_ID) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalMyDsl.g:3020:4: (lv_name_2_0= RULE_ID )
                    {
                    // InternalMyDsl.g:3020:4: (lv_name_2_0= RULE_ID )
                    // InternalMyDsl.g:3021:5: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_69); 

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

            // InternalMyDsl.g:3037:3: ( (otherlv_3= 'rising' ( (lv_rising_4_0= ruleURDFAttrSignedNumeric ) ) ) | (otherlv_5= 'falling' ( (lv_falling_6_0= ruleURDFAttrSignedNumeric ) ) ) )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==75) ) {
                alt41=1;
            }
            else if ( (LA41_0==76) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // InternalMyDsl.g:3038:4: (otherlv_3= 'rising' ( (lv_rising_4_0= ruleURDFAttrSignedNumeric ) ) )
                    {
                    // InternalMyDsl.g:3038:4: (otherlv_3= 'rising' ( (lv_rising_4_0= ruleURDFAttrSignedNumeric ) ) )
                    // InternalMyDsl.g:3039:5: otherlv_3= 'rising' ( (lv_rising_4_0= ruleURDFAttrSignedNumeric ) )
                    {
                    otherlv_3=(Token)match(input,75,FOLLOW_22); 

                    					newLeafNode(otherlv_3, grammarAccess.getCalibrationAccess().getRisingKeyword_3_0_0());
                    				
                    // InternalMyDsl.g:3043:5: ( (lv_rising_4_0= ruleURDFAttrSignedNumeric ) )
                    // InternalMyDsl.g:3044:6: (lv_rising_4_0= ruleURDFAttrSignedNumeric )
                    {
                    // InternalMyDsl.g:3044:6: (lv_rising_4_0= ruleURDFAttrSignedNumeric )
                    // InternalMyDsl.g:3045:7: lv_rising_4_0= ruleURDFAttrSignedNumeric
                    {

                    							newCompositeNode(grammarAccess.getCalibrationAccess().getRisingURDFAttrSignedNumericParserRuleCall_3_0_1_0());
                    						
                    pushFollow(FOLLOW_2);
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


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:3064:4: (otherlv_5= 'falling' ( (lv_falling_6_0= ruleURDFAttrSignedNumeric ) ) )
                    {
                    // InternalMyDsl.g:3064:4: (otherlv_5= 'falling' ( (lv_falling_6_0= ruleURDFAttrSignedNumeric ) ) )
                    // InternalMyDsl.g:3065:5: otherlv_5= 'falling' ( (lv_falling_6_0= ruleURDFAttrSignedNumeric ) )
                    {
                    otherlv_5=(Token)match(input,76,FOLLOW_22); 

                    					newLeafNode(otherlv_5, grammarAccess.getCalibrationAccess().getFallingKeyword_3_1_0());
                    				
                    // InternalMyDsl.g:3069:5: ( (lv_falling_6_0= ruleURDFAttrSignedNumeric ) )
                    // InternalMyDsl.g:3070:6: (lv_falling_6_0= ruleURDFAttrSignedNumeric )
                    {
                    // InternalMyDsl.g:3070:6: (lv_falling_6_0= ruleURDFAttrSignedNumeric )
                    // InternalMyDsl.g:3071:7: lv_falling_6_0= ruleURDFAttrSignedNumeric
                    {

                    							newCompositeNode(grammarAccess.getCalibrationAccess().getFallingURDFAttrSignedNumericParserRuleCall_3_1_1_0());
                    						
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
    // InternalMyDsl.g:3094:1: entryRuleDynamics returns [EObject current=null] : iv_ruleDynamics= ruleDynamics EOF ;
    public final EObject entryRuleDynamics() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDynamics = null;


        try {
            // InternalMyDsl.g:3094:49: (iv_ruleDynamics= ruleDynamics EOF )
            // InternalMyDsl.g:3095:2: iv_ruleDynamics= ruleDynamics EOF
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
    // InternalMyDsl.g:3101:1: ruleDynamics returns [EObject current=null] : ( () otherlv_1= 'Dynamics' ( (lv_name_2_0= RULE_ID ) )? ( (otherlv_3= 'friction' ( (lv_friction_4_0= ruleURDFAttrSignedNumeric ) ) ) | (otherlv_5= 'damping' ( (lv_damping_6_0= ruleURDFAttrSignedNumeric ) ) ) )+ ) ;
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
            // InternalMyDsl.g:3107:2: ( ( () otherlv_1= 'Dynamics' ( (lv_name_2_0= RULE_ID ) )? ( (otherlv_3= 'friction' ( (lv_friction_4_0= ruleURDFAttrSignedNumeric ) ) ) | (otherlv_5= 'damping' ( (lv_damping_6_0= ruleURDFAttrSignedNumeric ) ) ) )+ ) )
            // InternalMyDsl.g:3108:2: ( () otherlv_1= 'Dynamics' ( (lv_name_2_0= RULE_ID ) )? ( (otherlv_3= 'friction' ( (lv_friction_4_0= ruleURDFAttrSignedNumeric ) ) ) | (otherlv_5= 'damping' ( (lv_damping_6_0= ruleURDFAttrSignedNumeric ) ) ) )+ )
            {
            // InternalMyDsl.g:3108:2: ( () otherlv_1= 'Dynamics' ( (lv_name_2_0= RULE_ID ) )? ( (otherlv_3= 'friction' ( (lv_friction_4_0= ruleURDFAttrSignedNumeric ) ) ) | (otherlv_5= 'damping' ( (lv_damping_6_0= ruleURDFAttrSignedNumeric ) ) ) )+ )
            // InternalMyDsl.g:3109:3: () otherlv_1= 'Dynamics' ( (lv_name_2_0= RULE_ID ) )? ( (otherlv_3= 'friction' ( (lv_friction_4_0= ruleURDFAttrSignedNumeric ) ) ) | (otherlv_5= 'damping' ( (lv_damping_6_0= ruleURDFAttrSignedNumeric ) ) ) )+
            {
            // InternalMyDsl.g:3109:3: ()
            // InternalMyDsl.g:3110:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDynamicsAccess().getDynamicsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,77,FOLLOW_70); 

            			newLeafNode(otherlv_1, grammarAccess.getDynamicsAccess().getDynamicsKeyword_1());
            		
            // InternalMyDsl.g:3120:3: ( (lv_name_2_0= RULE_ID ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_ID) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalMyDsl.g:3121:4: (lv_name_2_0= RULE_ID )
                    {
                    // InternalMyDsl.g:3121:4: (lv_name_2_0= RULE_ID )
                    // InternalMyDsl.g:3122:5: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_71); 

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

            // InternalMyDsl.g:3138:3: ( (otherlv_3= 'friction' ( (lv_friction_4_0= ruleURDFAttrSignedNumeric ) ) ) | (otherlv_5= 'damping' ( (lv_damping_6_0= ruleURDFAttrSignedNumeric ) ) ) )+
            int cnt43=0;
            loop43:
            do {
                int alt43=3;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==78) ) {
                    alt43=1;
                }
                else if ( (LA43_0==79) ) {
                    alt43=2;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalMyDsl.g:3139:4: (otherlv_3= 'friction' ( (lv_friction_4_0= ruleURDFAttrSignedNumeric ) ) )
            	    {
            	    // InternalMyDsl.g:3139:4: (otherlv_3= 'friction' ( (lv_friction_4_0= ruleURDFAttrSignedNumeric ) ) )
            	    // InternalMyDsl.g:3140:5: otherlv_3= 'friction' ( (lv_friction_4_0= ruleURDFAttrSignedNumeric ) )
            	    {
            	    otherlv_3=(Token)match(input,78,FOLLOW_22); 

            	    					newLeafNode(otherlv_3, grammarAccess.getDynamicsAccess().getFrictionKeyword_3_0_0());
            	    				
            	    // InternalMyDsl.g:3144:5: ( (lv_friction_4_0= ruleURDFAttrSignedNumeric ) )
            	    // InternalMyDsl.g:3145:6: (lv_friction_4_0= ruleURDFAttrSignedNumeric )
            	    {
            	    // InternalMyDsl.g:3145:6: (lv_friction_4_0= ruleURDFAttrSignedNumeric )
            	    // InternalMyDsl.g:3146:7: lv_friction_4_0= ruleURDFAttrSignedNumeric
            	    {

            	    							newCompositeNode(grammarAccess.getDynamicsAccess().getFrictionURDFAttrSignedNumericParserRuleCall_3_0_1_0());
            	    						
            	    pushFollow(FOLLOW_72);
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


            	    }
            	    break;
            	case 2 :
            	    // InternalMyDsl.g:3165:4: (otherlv_5= 'damping' ( (lv_damping_6_0= ruleURDFAttrSignedNumeric ) ) )
            	    {
            	    // InternalMyDsl.g:3165:4: (otherlv_5= 'damping' ( (lv_damping_6_0= ruleURDFAttrSignedNumeric ) ) )
            	    // InternalMyDsl.g:3166:5: otherlv_5= 'damping' ( (lv_damping_6_0= ruleURDFAttrSignedNumeric ) )
            	    {
            	    otherlv_5=(Token)match(input,79,FOLLOW_22); 

            	    					newLeafNode(otherlv_5, grammarAccess.getDynamicsAccess().getDampingKeyword_3_1_0());
            	    				
            	    // InternalMyDsl.g:3170:5: ( (lv_damping_6_0= ruleURDFAttrSignedNumeric ) )
            	    // InternalMyDsl.g:3171:6: (lv_damping_6_0= ruleURDFAttrSignedNumeric )
            	    {
            	    // InternalMyDsl.g:3171:6: (lv_damping_6_0= ruleURDFAttrSignedNumeric )
            	    // InternalMyDsl.g:3172:7: lv_damping_6_0= ruleURDFAttrSignedNumeric
            	    {

            	    							newCompositeNode(grammarAccess.getDynamicsAccess().getDampingURDFAttrSignedNumericParserRuleCall_3_1_1_0());
            	    						
            	    pushFollow(FOLLOW_72);
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


            	    }
            	    break;

            	default :
            	    if ( cnt43 >= 1 ) break loop43;
                        EarlyExitException eee =
                            new EarlyExitException(43, input);
                        throw eee;
                }
                cnt43++;
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
    // $ANTLR end "ruleDynamics"


    // $ANTLR start "entryRuleSafetyController"
    // InternalMyDsl.g:3195:1: entryRuleSafetyController returns [EObject current=null] : iv_ruleSafetyController= ruleSafetyController EOF ;
    public final EObject entryRuleSafetyController() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSafetyController = null;


        try {
            // InternalMyDsl.g:3195:57: (iv_ruleSafetyController= ruleSafetyController EOF )
            // InternalMyDsl.g:3196:2: iv_ruleSafetyController= ruleSafetyController EOF
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
    // InternalMyDsl.g:3202:1: ruleSafetyController returns [EObject current=null] : (otherlv_0= 'SafetyController' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'k_velocity' ( (lv_k_velocity_3_0= ruleURDFAttrSignedNumeric ) ) ( (otherlv_4= 'k_position' ( (lv_k_position_5_0= ruleURDFAttrSignedNumeric ) ) ) | (otherlv_6= 'softLowerLimit' ( (lv_softLowerLimit_7_0= ruleURDFAttrSignedNumeric ) ) ) | (otherlv_8= 'softUpperLimit' ( (lv_softUpperLimit_9_0= ruleURDFAttrSignedNumeric ) ) ) )* ) ;
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
            // InternalMyDsl.g:3208:2: ( (otherlv_0= 'SafetyController' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'k_velocity' ( (lv_k_velocity_3_0= ruleURDFAttrSignedNumeric ) ) ( (otherlv_4= 'k_position' ( (lv_k_position_5_0= ruleURDFAttrSignedNumeric ) ) ) | (otherlv_6= 'softLowerLimit' ( (lv_softLowerLimit_7_0= ruleURDFAttrSignedNumeric ) ) ) | (otherlv_8= 'softUpperLimit' ( (lv_softUpperLimit_9_0= ruleURDFAttrSignedNumeric ) ) ) )* ) )
            // InternalMyDsl.g:3209:2: (otherlv_0= 'SafetyController' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'k_velocity' ( (lv_k_velocity_3_0= ruleURDFAttrSignedNumeric ) ) ( (otherlv_4= 'k_position' ( (lv_k_position_5_0= ruleURDFAttrSignedNumeric ) ) ) | (otherlv_6= 'softLowerLimit' ( (lv_softLowerLimit_7_0= ruleURDFAttrSignedNumeric ) ) ) | (otherlv_8= 'softUpperLimit' ( (lv_softUpperLimit_9_0= ruleURDFAttrSignedNumeric ) ) ) )* )
            {
            // InternalMyDsl.g:3209:2: (otherlv_0= 'SafetyController' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'k_velocity' ( (lv_k_velocity_3_0= ruleURDFAttrSignedNumeric ) ) ( (otherlv_4= 'k_position' ( (lv_k_position_5_0= ruleURDFAttrSignedNumeric ) ) ) | (otherlv_6= 'softLowerLimit' ( (lv_softLowerLimit_7_0= ruleURDFAttrSignedNumeric ) ) ) | (otherlv_8= 'softUpperLimit' ( (lv_softUpperLimit_9_0= ruleURDFAttrSignedNumeric ) ) ) )* )
            // InternalMyDsl.g:3210:3: otherlv_0= 'SafetyController' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'k_velocity' ( (lv_k_velocity_3_0= ruleURDFAttrSignedNumeric ) ) ( (otherlv_4= 'k_position' ( (lv_k_position_5_0= ruleURDFAttrSignedNumeric ) ) ) | (otherlv_6= 'softLowerLimit' ( (lv_softLowerLimit_7_0= ruleURDFAttrSignedNumeric ) ) ) | (otherlv_8= 'softUpperLimit' ( (lv_softUpperLimit_9_0= ruleURDFAttrSignedNumeric ) ) ) )*
            {
            otherlv_0=(Token)match(input,80,FOLLOW_73); 

            			newLeafNode(otherlv_0, grammarAccess.getSafetyControllerAccess().getSafetyControllerKeyword_0());
            		
            // InternalMyDsl.g:3214:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_ID) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalMyDsl.g:3215:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalMyDsl.g:3215:4: (lv_name_1_0= RULE_ID )
                    // InternalMyDsl.g:3216:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_74); 

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

            otherlv_2=(Token)match(input,81,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getSafetyControllerAccess().getK_velocityKeyword_2());
            		
            // InternalMyDsl.g:3236:3: ( (lv_k_velocity_3_0= ruleURDFAttrSignedNumeric ) )
            // InternalMyDsl.g:3237:4: (lv_k_velocity_3_0= ruleURDFAttrSignedNumeric )
            {
            // InternalMyDsl.g:3237:4: (lv_k_velocity_3_0= ruleURDFAttrSignedNumeric )
            // InternalMyDsl.g:3238:5: lv_k_velocity_3_0= ruleURDFAttrSignedNumeric
            {

            					newCompositeNode(grammarAccess.getSafetyControllerAccess().getK_velocityURDFAttrSignedNumericParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_75);
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

            // InternalMyDsl.g:3255:3: ( (otherlv_4= 'k_position' ( (lv_k_position_5_0= ruleURDFAttrSignedNumeric ) ) ) | (otherlv_6= 'softLowerLimit' ( (lv_softLowerLimit_7_0= ruleURDFAttrSignedNumeric ) ) ) | (otherlv_8= 'softUpperLimit' ( (lv_softUpperLimit_9_0= ruleURDFAttrSignedNumeric ) ) ) )*
            loop45:
            do {
                int alt45=4;
                switch ( input.LA(1) ) {
                case 82:
                    {
                    alt45=1;
                    }
                    break;
                case 83:
                    {
                    alt45=2;
                    }
                    break;
                case 84:
                    {
                    alt45=3;
                    }
                    break;

                }

                switch (alt45) {
            	case 1 :
            	    // InternalMyDsl.g:3256:4: (otherlv_4= 'k_position' ( (lv_k_position_5_0= ruleURDFAttrSignedNumeric ) ) )
            	    {
            	    // InternalMyDsl.g:3256:4: (otherlv_4= 'k_position' ( (lv_k_position_5_0= ruleURDFAttrSignedNumeric ) ) )
            	    // InternalMyDsl.g:3257:5: otherlv_4= 'k_position' ( (lv_k_position_5_0= ruleURDFAttrSignedNumeric ) )
            	    {
            	    otherlv_4=(Token)match(input,82,FOLLOW_22); 

            	    					newLeafNode(otherlv_4, grammarAccess.getSafetyControllerAccess().getK_positionKeyword_4_0_0());
            	    				
            	    // InternalMyDsl.g:3261:5: ( (lv_k_position_5_0= ruleURDFAttrSignedNumeric ) )
            	    // InternalMyDsl.g:3262:6: (lv_k_position_5_0= ruleURDFAttrSignedNumeric )
            	    {
            	    // InternalMyDsl.g:3262:6: (lv_k_position_5_0= ruleURDFAttrSignedNumeric )
            	    // InternalMyDsl.g:3263:7: lv_k_position_5_0= ruleURDFAttrSignedNumeric
            	    {

            	    							newCompositeNode(grammarAccess.getSafetyControllerAccess().getK_positionURDFAttrSignedNumericParserRuleCall_4_0_1_0());
            	    						
            	    pushFollow(FOLLOW_75);
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


            	    }
            	    break;
            	case 2 :
            	    // InternalMyDsl.g:3282:4: (otherlv_6= 'softLowerLimit' ( (lv_softLowerLimit_7_0= ruleURDFAttrSignedNumeric ) ) )
            	    {
            	    // InternalMyDsl.g:3282:4: (otherlv_6= 'softLowerLimit' ( (lv_softLowerLimit_7_0= ruleURDFAttrSignedNumeric ) ) )
            	    // InternalMyDsl.g:3283:5: otherlv_6= 'softLowerLimit' ( (lv_softLowerLimit_7_0= ruleURDFAttrSignedNumeric ) )
            	    {
            	    otherlv_6=(Token)match(input,83,FOLLOW_22); 

            	    					newLeafNode(otherlv_6, grammarAccess.getSafetyControllerAccess().getSoftLowerLimitKeyword_4_1_0());
            	    				
            	    // InternalMyDsl.g:3287:5: ( (lv_softLowerLimit_7_0= ruleURDFAttrSignedNumeric ) )
            	    // InternalMyDsl.g:3288:6: (lv_softLowerLimit_7_0= ruleURDFAttrSignedNumeric )
            	    {
            	    // InternalMyDsl.g:3288:6: (lv_softLowerLimit_7_0= ruleURDFAttrSignedNumeric )
            	    // InternalMyDsl.g:3289:7: lv_softLowerLimit_7_0= ruleURDFAttrSignedNumeric
            	    {

            	    							newCompositeNode(grammarAccess.getSafetyControllerAccess().getSoftLowerLimitURDFAttrSignedNumericParserRuleCall_4_1_1_0());
            	    						
            	    pushFollow(FOLLOW_75);
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


            	    }
            	    break;
            	case 3 :
            	    // InternalMyDsl.g:3308:4: (otherlv_8= 'softUpperLimit' ( (lv_softUpperLimit_9_0= ruleURDFAttrSignedNumeric ) ) )
            	    {
            	    // InternalMyDsl.g:3308:4: (otherlv_8= 'softUpperLimit' ( (lv_softUpperLimit_9_0= ruleURDFAttrSignedNumeric ) ) )
            	    // InternalMyDsl.g:3309:5: otherlv_8= 'softUpperLimit' ( (lv_softUpperLimit_9_0= ruleURDFAttrSignedNumeric ) )
            	    {
            	    otherlv_8=(Token)match(input,84,FOLLOW_22); 

            	    					newLeafNode(otherlv_8, grammarAccess.getSafetyControllerAccess().getSoftUpperLimitKeyword_4_2_0());
            	    				
            	    // InternalMyDsl.g:3313:5: ( (lv_softUpperLimit_9_0= ruleURDFAttrSignedNumeric ) )
            	    // InternalMyDsl.g:3314:6: (lv_softUpperLimit_9_0= ruleURDFAttrSignedNumeric )
            	    {
            	    // InternalMyDsl.g:3314:6: (lv_softUpperLimit_9_0= ruleURDFAttrSignedNumeric )
            	    // InternalMyDsl.g:3315:7: lv_softUpperLimit_9_0= ruleURDFAttrSignedNumeric
            	    {

            	    							newCompositeNode(grammarAccess.getSafetyControllerAccess().getSoftUpperLimitURDFAttrSignedNumericParserRuleCall_4_2_1_0());
            	    						
            	    pushFollow(FOLLOW_75);
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


            	    }
            	    break;

            	default :
            	    break loop45;
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
    // $ANTLR end "ruleSafetyController"


    // $ANTLR start "entryRuleURDFAttrSignedNumeric"
    // InternalMyDsl.g:3338:1: entryRuleURDFAttrSignedNumeric returns [EObject current=null] : iv_ruleURDFAttrSignedNumeric= ruleURDFAttrSignedNumeric EOF ;
    public final EObject entryRuleURDFAttrSignedNumeric() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleURDFAttrSignedNumeric = null;


        try {
            // InternalMyDsl.g:3338:62: (iv_ruleURDFAttrSignedNumeric= ruleURDFAttrSignedNumeric EOF )
            // InternalMyDsl.g:3339:2: iv_ruleURDFAttrSignedNumeric= ruleURDFAttrSignedNumeric EOF
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
    // InternalMyDsl.g:3345:1: ruleURDFAttrSignedNumeric returns [EObject current=null] : ( (lv_value_0_0= ruleSIGNED_NUMERIC ) ) ;
    public final EObject ruleURDFAttrSignedNumeric() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3351:2: ( ( (lv_value_0_0= ruleSIGNED_NUMERIC ) ) )
            // InternalMyDsl.g:3352:2: ( (lv_value_0_0= ruleSIGNED_NUMERIC ) )
            {
            // InternalMyDsl.g:3352:2: ( (lv_value_0_0= ruleSIGNED_NUMERIC ) )
            // InternalMyDsl.g:3353:3: (lv_value_0_0= ruleSIGNED_NUMERIC )
            {
            // InternalMyDsl.g:3353:3: (lv_value_0_0= ruleSIGNED_NUMERIC )
            // InternalMyDsl.g:3354:4: lv_value_0_0= ruleSIGNED_NUMERIC
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
    // InternalMyDsl.g:3374:1: entryRuleURDFAttrFloat returns [EObject current=null] : iv_ruleURDFAttrFloat= ruleURDFAttrFloat EOF ;
    public final EObject entryRuleURDFAttrFloat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleURDFAttrFloat = null;


        try {
            // InternalMyDsl.g:3374:54: (iv_ruleURDFAttrFloat= ruleURDFAttrFloat EOF )
            // InternalMyDsl.g:3375:2: iv_ruleURDFAttrFloat= ruleURDFAttrFloat EOF
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
    // InternalMyDsl.g:3381:1: ruleURDFAttrFloat returns [EObject current=null] : ( (lv_value_0_0= ruleFLOAT ) ) ;
    public final EObject ruleURDFAttrFloat() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3387:2: ( ( (lv_value_0_0= ruleFLOAT ) ) )
            // InternalMyDsl.g:3388:2: ( (lv_value_0_0= ruleFLOAT ) )
            {
            // InternalMyDsl.g:3388:2: ( (lv_value_0_0= ruleFLOAT ) )
            // InternalMyDsl.g:3389:3: (lv_value_0_0= ruleFLOAT )
            {
            // InternalMyDsl.g:3389:3: (lv_value_0_0= ruleFLOAT )
            // InternalMyDsl.g:3390:4: lv_value_0_0= ruleFLOAT
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
    // InternalMyDsl.g:3410:1: entryRuleURDFAttrINT returns [EObject current=null] : iv_ruleURDFAttrINT= ruleURDFAttrINT EOF ;
    public final EObject entryRuleURDFAttrINT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleURDFAttrINT = null;


        try {
            // InternalMyDsl.g:3410:52: (iv_ruleURDFAttrINT= ruleURDFAttrINT EOF )
            // InternalMyDsl.g:3411:2: iv_ruleURDFAttrINT= ruleURDFAttrINT EOF
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
    // InternalMyDsl.g:3417:1: ruleURDFAttrINT returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleURDFAttrINT() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:3423:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalMyDsl.g:3424:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalMyDsl.g:3424:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalMyDsl.g:3425:3: (lv_value_0_0= RULE_INT )
            {
            // InternalMyDsl.g:3425:3: (lv_value_0_0= RULE_INT )
            // InternalMyDsl.g:3426:4: lv_value_0_0= RULE_INT
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
    // InternalMyDsl.g:3445:1: entryRuleURDFAttrNumeric returns [EObject current=null] : iv_ruleURDFAttrNumeric= ruleURDFAttrNumeric EOF ;
    public final EObject entryRuleURDFAttrNumeric() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleURDFAttrNumeric = null;


        try {
            // InternalMyDsl.g:3445:56: (iv_ruleURDFAttrNumeric= ruleURDFAttrNumeric EOF )
            // InternalMyDsl.g:3446:2: iv_ruleURDFAttrNumeric= ruleURDFAttrNumeric EOF
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
    // InternalMyDsl.g:3452:1: ruleURDFAttrNumeric returns [EObject current=null] : ( (lv_value_0_0= ruleNUMERIC ) ) ;
    public final EObject ruleURDFAttrNumeric() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3458:2: ( ( (lv_value_0_0= ruleNUMERIC ) ) )
            // InternalMyDsl.g:3459:2: ( (lv_value_0_0= ruleNUMERIC ) )
            {
            // InternalMyDsl.g:3459:2: ( (lv_value_0_0= ruleNUMERIC ) )
            // InternalMyDsl.g:3460:3: (lv_value_0_0= ruleNUMERIC )
            {
            // InternalMyDsl.g:3460:3: (lv_value_0_0= ruleNUMERIC )
            // InternalMyDsl.g:3461:4: lv_value_0_0= ruleNUMERIC
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
    // InternalMyDsl.g:3481:1: entryRuleURDFAttrSTRING returns [EObject current=null] : iv_ruleURDFAttrSTRING= ruleURDFAttrSTRING EOF ;
    public final EObject entryRuleURDFAttrSTRING() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleURDFAttrSTRING = null;


        try {
            // InternalMyDsl.g:3481:55: (iv_ruleURDFAttrSTRING= ruleURDFAttrSTRING EOF )
            // InternalMyDsl.g:3482:2: iv_ruleURDFAttrSTRING= ruleURDFAttrSTRING EOF
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
    // InternalMyDsl.g:3488:1: ruleURDFAttrSTRING returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleURDFAttrSTRING() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:3494:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalMyDsl.g:3495:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalMyDsl.g:3495:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalMyDsl.g:3496:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalMyDsl.g:3496:3: (lv_value_0_0= RULE_STRING )
            // InternalMyDsl.g:3497:4: lv_value_0_0= RULE_STRING
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
    // InternalMyDsl.g:3516:1: entryRuleFLOAT returns [String current=null] : iv_ruleFLOAT= ruleFLOAT EOF ;
    public final String entryRuleFLOAT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFLOAT = null;


        try {
            // InternalMyDsl.g:3516:45: (iv_ruleFLOAT= ruleFLOAT EOF )
            // InternalMyDsl.g:3517:2: iv_ruleFLOAT= ruleFLOAT EOF
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
    // InternalMyDsl.g:3523:1: ruleFLOAT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleFLOAT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:3529:2: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) )
            // InternalMyDsl.g:3530:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            {
            // InternalMyDsl.g:3530:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            // InternalMyDsl.g:3531:3: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_76); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getFLOATAccess().getINTTerminalRuleCall_0());
            		
            kw=(Token)match(input,27,FOLLOW_54); 

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
    // InternalMyDsl.g:3554:1: entryRuleSCIENTIFIC returns [String current=null] : iv_ruleSCIENTIFIC= ruleSCIENTIFIC EOF ;
    public final String entryRuleSCIENTIFIC() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSCIENTIFIC = null;


        try {
            // InternalMyDsl.g:3554:50: (iv_ruleSCIENTIFIC= ruleSCIENTIFIC EOF )
            // InternalMyDsl.g:3555:2: iv_ruleSCIENTIFIC= ruleSCIENTIFIC EOF
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
    // InternalMyDsl.g:3561:1: ruleSCIENTIFIC returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FLOAT_0= ruleFLOAT kw= 'e' (kw= '+' | kw= '-' )? this_INT_4= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleSCIENTIFIC() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_4=null;
        AntlrDatatypeRuleToken this_FLOAT_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3567:2: ( (this_FLOAT_0= ruleFLOAT kw= 'e' (kw= '+' | kw= '-' )? this_INT_4= RULE_INT ) )
            // InternalMyDsl.g:3568:2: (this_FLOAT_0= ruleFLOAT kw= 'e' (kw= '+' | kw= '-' )? this_INT_4= RULE_INT )
            {
            // InternalMyDsl.g:3568:2: (this_FLOAT_0= ruleFLOAT kw= 'e' (kw= '+' | kw= '-' )? this_INT_4= RULE_INT )
            // InternalMyDsl.g:3569:3: this_FLOAT_0= ruleFLOAT kw= 'e' (kw= '+' | kw= '-' )? this_INT_4= RULE_INT
            {

            			newCompositeNode(grammarAccess.getSCIENTIFICAccess().getFLOATParserRuleCall_0());
            		
            pushFollow(FOLLOW_77);
            this_FLOAT_0=ruleFLOAT();

            state._fsp--;


            			current.merge(this_FLOAT_0);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,85,FOLLOW_78); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getSCIENTIFICAccess().getEKeyword_1());
            		
            // InternalMyDsl.g:3584:3: (kw= '+' | kw= '-' )?
            int alt46=3;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==86) ) {
                alt46=1;
            }
            else if ( (LA46_0==87) ) {
                alt46=2;
            }
            switch (alt46) {
                case 1 :
                    // InternalMyDsl.g:3585:4: kw= '+'
                    {
                    kw=(Token)match(input,86,FOLLOW_54); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getSCIENTIFICAccess().getPlusSignKeyword_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:3591:4: kw= '-'
                    {
                    kw=(Token)match(input,87,FOLLOW_54); 

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
    // InternalMyDsl.g:3608:1: entryRuleSIGNED_NUMERIC returns [String current=null] : iv_ruleSIGNED_NUMERIC= ruleSIGNED_NUMERIC EOF ;
    public final String entryRuleSIGNED_NUMERIC() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSIGNED_NUMERIC = null;


        try {
            // InternalMyDsl.g:3608:54: (iv_ruleSIGNED_NUMERIC= ruleSIGNED_NUMERIC EOF )
            // InternalMyDsl.g:3609:2: iv_ruleSIGNED_NUMERIC= ruleSIGNED_NUMERIC EOF
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
    // InternalMyDsl.g:3615:1: ruleSIGNED_NUMERIC returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT | this_FLOAT_2= ruleFLOAT | this_SCIENTIFIC_3= ruleSCIENTIFIC ) ) ;
    public final AntlrDatatypeRuleToken ruleSIGNED_NUMERIC() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        AntlrDatatypeRuleToken this_FLOAT_2 = null;

        AntlrDatatypeRuleToken this_SCIENTIFIC_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3621:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT | this_FLOAT_2= ruleFLOAT | this_SCIENTIFIC_3= ruleSCIENTIFIC ) ) )
            // InternalMyDsl.g:3622:2: ( (kw= '-' )? (this_INT_1= RULE_INT | this_FLOAT_2= ruleFLOAT | this_SCIENTIFIC_3= ruleSCIENTIFIC ) )
            {
            // InternalMyDsl.g:3622:2: ( (kw= '-' )? (this_INT_1= RULE_INT | this_FLOAT_2= ruleFLOAT | this_SCIENTIFIC_3= ruleSCIENTIFIC ) )
            // InternalMyDsl.g:3623:3: (kw= '-' )? (this_INT_1= RULE_INT | this_FLOAT_2= ruleFLOAT | this_SCIENTIFIC_3= ruleSCIENTIFIC )
            {
            // InternalMyDsl.g:3623:3: (kw= '-' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==87) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalMyDsl.g:3624:4: kw= '-'
                    {
                    kw=(Token)match(input,87,FOLLOW_22); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getSIGNED_NUMERICAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:3630:3: (this_INT_1= RULE_INT | this_FLOAT_2= ruleFLOAT | this_SCIENTIFIC_3= ruleSCIENTIFIC )
            int alt48=3;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_INT) ) {
                int LA48_1 = input.LA(2);

                if ( (LA48_1==EOF||LA48_1==12||LA48_1==17||LA48_1==20||LA48_1==28||(LA48_1>=31 && LA48_1<=36)||(LA48_1>=38 && LA48_1<=39)||(LA48_1>=41 && LA48_1<=46)||LA48_1==48||LA48_1==64||(LA48_1>=68 && LA48_1<=69)||(LA48_1>=71 && LA48_1<=74)||(LA48_1>=77 && LA48_1<=80)||(LA48_1>=82 && LA48_1<=84)) ) {
                    alt48=1;
                }
                else if ( (LA48_1==27) ) {
                    int LA48_3 = input.LA(3);

                    if ( (LA48_3==RULE_INT) ) {
                        int LA48_4 = input.LA(4);

                        if ( (LA48_4==EOF||LA48_4==12||LA48_4==17||LA48_4==20||LA48_4==28||(LA48_4>=31 && LA48_4<=36)||(LA48_4>=38 && LA48_4<=39)||(LA48_4>=41 && LA48_4<=46)||LA48_4==48||LA48_4==64||(LA48_4>=68 && LA48_4<=69)||(LA48_4>=71 && LA48_4<=74)||(LA48_4>=77 && LA48_4<=80)||(LA48_4>=82 && LA48_4<=84)) ) {
                            alt48=2;
                        }
                        else if ( (LA48_4==85) ) {
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
                    // InternalMyDsl.g:3631:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getSIGNED_NUMERICAccess().getINTTerminalRuleCall_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:3639:4: this_FLOAT_2= ruleFLOAT
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
                    // InternalMyDsl.g:3650:4: this_SCIENTIFIC_3= ruleSCIENTIFIC
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
    // InternalMyDsl.g:3665:1: entryRuleNUMERIC returns [String current=null] : iv_ruleNUMERIC= ruleNUMERIC EOF ;
    public final String entryRuleNUMERIC() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNUMERIC = null;


        try {
            // InternalMyDsl.g:3665:47: (iv_ruleNUMERIC= ruleNUMERIC EOF )
            // InternalMyDsl.g:3666:2: iv_ruleNUMERIC= ruleNUMERIC EOF
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
    // InternalMyDsl.g:3672:1: ruleNUMERIC returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_FLOAT_1= ruleFLOAT | this_SCIENTIFIC_2= ruleSCIENTIFIC ) ;
    public final AntlrDatatypeRuleToken ruleNUMERIC() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        AntlrDatatypeRuleToken this_FLOAT_1 = null;

        AntlrDatatypeRuleToken this_SCIENTIFIC_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3678:2: ( (this_INT_0= RULE_INT | this_FLOAT_1= ruleFLOAT | this_SCIENTIFIC_2= ruleSCIENTIFIC ) )
            // InternalMyDsl.g:3679:2: (this_INT_0= RULE_INT | this_FLOAT_1= ruleFLOAT | this_SCIENTIFIC_2= ruleSCIENTIFIC )
            {
            // InternalMyDsl.g:3679:2: (this_INT_0= RULE_INT | this_FLOAT_1= ruleFLOAT | this_SCIENTIFIC_2= ruleSCIENTIFIC )
            int alt49=3;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_INT) ) {
                int LA49_1 = input.LA(2);

                if ( (LA49_1==27) ) {
                    int LA49_2 = input.LA(3);

                    if ( (LA49_2==RULE_INT) ) {
                        int LA49_4 = input.LA(4);

                        if ( (LA49_4==85) ) {
                            alt49=3;
                        }
                        else if ( (LA49_4==EOF||LA49_4==12||LA49_4==17||LA49_4==20||LA49_4==28||LA49_4==36||(LA49_4>=38 && LA49_4<=39)||LA49_4==48||(LA49_4>=51 && LA49_4<=52)||LA49_4==64) ) {
                            alt49=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 49, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 49, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA49_1==EOF||LA49_1==12||LA49_1==17||LA49_1==20||LA49_1==28||LA49_1==36||(LA49_1>=38 && LA49_1<=39)||LA49_1==48||(LA49_1>=51 && LA49_1<=52)||LA49_1==64) ) {
                    alt49=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 49, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // InternalMyDsl.g:3680:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getNUMERICAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:3688:3: this_FLOAT_1= ruleFLOAT
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
                    // InternalMyDsl.g:3699:3: this_SCIENTIFIC_2= ruleSCIENTIFIC
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
    // InternalMyDsl.g:3713:1: ruleJointType returns [Enumerator current=null] : ( (enumLiteral_0= 'fixed' ) | (enumLiteral_1= 'revolute' ) | (enumLiteral_2= 'prismatic' ) | (enumLiteral_3= 'continuous' ) ) ;
    public final Enumerator ruleJointType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:3719:2: ( ( (enumLiteral_0= 'fixed' ) | (enumLiteral_1= 'revolute' ) | (enumLiteral_2= 'prismatic' ) | (enumLiteral_3= 'continuous' ) ) )
            // InternalMyDsl.g:3720:2: ( (enumLiteral_0= 'fixed' ) | (enumLiteral_1= 'revolute' ) | (enumLiteral_2= 'prismatic' ) | (enumLiteral_3= 'continuous' ) )
            {
            // InternalMyDsl.g:3720:2: ( (enumLiteral_0= 'fixed' ) | (enumLiteral_1= 'revolute' ) | (enumLiteral_2= 'prismatic' ) | (enumLiteral_3= 'continuous' ) )
            int alt50=4;
            switch ( input.LA(1) ) {
            case 88:
                {
                alt50=1;
                }
                break;
            case 89:
                {
                alt50=2;
                }
                break;
            case 90:
                {
                alt50=3;
                }
                break;
            case 91:
                {
                alt50=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // InternalMyDsl.g:3721:3: (enumLiteral_0= 'fixed' )
                    {
                    // InternalMyDsl.g:3721:3: (enumLiteral_0= 'fixed' )
                    // InternalMyDsl.g:3722:4: enumLiteral_0= 'fixed'
                    {
                    enumLiteral_0=(Token)match(input,88,FOLLOW_2); 

                    				current = grammarAccess.getJointTypeAccess().getFixedEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getJointTypeAccess().getFixedEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:3729:3: (enumLiteral_1= 'revolute' )
                    {
                    // InternalMyDsl.g:3729:3: (enumLiteral_1= 'revolute' )
                    // InternalMyDsl.g:3730:4: enumLiteral_1= 'revolute'
                    {
                    enumLiteral_1=(Token)match(input,89,FOLLOW_2); 

                    				current = grammarAccess.getJointTypeAccess().getRevoluteEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getJointTypeAccess().getRevoluteEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:3737:3: (enumLiteral_2= 'prismatic' )
                    {
                    // InternalMyDsl.g:3737:3: (enumLiteral_2= 'prismatic' )
                    // InternalMyDsl.g:3738:4: enumLiteral_2= 'prismatic'
                    {
                    enumLiteral_2=(Token)match(input,90,FOLLOW_2); 

                    				current = grammarAccess.getJointTypeAccess().getPrismaticEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getJointTypeAccess().getPrismaticEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:3745:3: (enumLiteral_3= 'continuous' )
                    {
                    // InternalMyDsl.g:3745:3: (enumLiteral_3= 'continuous' )
                    // InternalMyDsl.g:3746:4: enumLiteral_3= 'continuous'
                    {
                    enumLiteral_3=(Token)match(input,91,FOLLOW_2); 

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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000121002L,0x0000000000000001L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000001E002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0001001010000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0001001010000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000008000000000L,0x0000000000012430L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0001001010020000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000020L,0x0000000000800000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000002000000010L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x02A2000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000010000000010L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000380000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000300000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000800000000010L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0004000000000010L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0040000000000010L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0100000000000010L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x1000000000000010L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000000L,0x000000000F000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000008000000002L,0x0000000000012430L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000040L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000300L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000010L,0x0000000000001800L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000010L,0x000000000000C000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000002L,0x000000000000C000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000010L,0x0000000000020000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000002L,0x00000000001C0000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000020L,0x0000000000C00000L});

}