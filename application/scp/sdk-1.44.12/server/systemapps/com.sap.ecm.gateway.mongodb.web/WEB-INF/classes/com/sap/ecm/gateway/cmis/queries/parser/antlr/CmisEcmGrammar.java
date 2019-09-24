// $ANTLR 3.5.2 com/sap/ecm/gateway/cmis/queries/parser/antlr/CmisEcmGrammar.g 2019-02-13 18:10:49

/*
 * THIS FILE IS AUTO-GENERATED, DO NOT EDIT.
 */
package com.sap.ecm.gateway.cmis.queries.parser.antlr;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class CmisEcmGrammar extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ANY", "AS", "ASC", "ApproxNumLit", 
		"BACKSL", "BOOL_LIT", "BY", "COL", "COMMA", "CONTAINS", "COUNT", "DESC", 
		"DOT", "Digits", "EQ", "EQ_ANY", "ESC", "ExactNumLit", "FROM", "GT", "GTEQ", 
		"ID", "IN", "INNER", "IN_ACL", "IN_ANY", "IN_FOLDER", "IN_LIST", "IN_TREE", 
		"IS", "IS_NOT_NULL", "IS_NULL", "JOIN", "LEFT", "LIKE", "LIST", "LPAR", 
		"LT", "LTEQ", "NEQ", "NOT", "NOT_IN", "NOT_IN_ANY", "NOT_LIKE", "NULL", 
		"NUM_LIT", "ON", "OR", "ORDER", "ORDER_BY", "OUTER", "PERCENT", "QUOTE", 
		"RIGHT", "RPAR", "SCORE", "SELECT", "SEL_LIST", "STAR", "STRING_LIT", 
		"SUM", "Sign", "TABLE", "TIMESTAMP", "TIME_LIT", "Tokens", "UNDERSCORE", 
		"WHERE", "WS", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", 
		"84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", 
		"96", "97", "98", "99", "100", "101", "102", "103", "104", "105", "106", 
		"107", "108", "109", "110", "111", "112", "113", "114", "115"
	};
	public static final int EOF=-1;
	public static final int AND=4;
	public static final int ANY=5;
	public static final int AS=6;
	public static final int ASC=7;
	public static final int ApproxNumLit=8;
	public static final int BACKSL=9;
	public static final int BOOL_LIT=10;
	public static final int BY=11;
	public static final int COL=12;
	public static final int COMMA=13;
	public static final int CONTAINS=14;
	public static final int COUNT=15;
	public static final int DESC=16;
	public static final int DOT=17;
	public static final int Digits=18;
	public static final int EQ=19;
	public static final int EQ_ANY=20;
	public static final int ESC=21;
	public static final int ExactNumLit=22;
	public static final int FROM=23;
	public static final int GT=24;
	public static final int GTEQ=25;
	public static final int ID=26;
	public static final int IN=27;
	public static final int INNER=28;
	public static final int IN_ACL=29;
	public static final int IN_ANY=30;
	public static final int IN_FOLDER=31;
	public static final int IN_LIST=32;
	public static final int IN_TREE=33;
	public static final int IS=34;
	public static final int IS_NOT_NULL=35;
	public static final int IS_NULL=36;
	public static final int JOIN=37;
	public static final int LEFT=38;
	public static final int LIKE=39;
	public static final int LIST=40;
	public static final int LPAR=41;
	public static final int LT=42;
	public static final int LTEQ=43;
	public static final int NEQ=44;
	public static final int NOT=45;
	public static final int NOT_IN=46;
	public static final int NOT_IN_ANY=47;
	public static final int NOT_LIKE=48;
	public static final int NULL=49;
	public static final int NUM_LIT=50;
	public static final int ON=51;
	public static final int OR=52;
	public static final int ORDER=53;
	public static final int ORDER_BY=54;
	public static final int OUTER=55;
	public static final int PERCENT=56;
	public static final int QUOTE=57;
	public static final int RIGHT=58;
	public static final int RPAR=59;
	public static final int SCORE=60;
	public static final int SELECT=61;
	public static final int SEL_LIST=62;
	public static final int STAR=63;
	public static final int STRING_LIT=64;
	public static final int SUM=65;
	public static final int Sign=66;
	public static final int TABLE=67;
	public static final int TIMESTAMP=68;
	public static final int TIME_LIT=69;
	public static final int Tokens=70;
	public static final int UNDERSCORE=71;
	public static final int WHERE=72;
	public static final int WS=73;

	// delegates
	public CmisEcmGrammar_CmisBaseGrammar gCmisBaseGrammar;
	public Parser[] getDelegates() {
		return new Parser[] {gCmisBaseGrammar};
	}

	// delegators


	public CmisEcmGrammar(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public CmisEcmGrammar(TokenStream input, RecognizerSharedState state) {
		super(input, state);
		gCmisBaseGrammar = new CmisEcmGrammar_CmisBaseGrammar(input, state, this);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
		gCmisBaseGrammar.setTreeAdaptor(this.adaptor);
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return CmisEcmGrammar.tokenNames; }
	@Override public String getGrammarFileName() { return "com/sap/ecm/gateway/cmis/queries/parser/antlr/CmisEcmGrammar.g"; }


	    public boolean hasErrors() {
	    	return gCmisBaseGrammar.hasErrors();
	    }

		public String getErrorMessages() {
	    	return gCmisBaseGrammar.getErrorMessages();
		}
		
		@Override
		public void emitErrorMessage(String msg) {
			gCmisBaseGrammar.emitErrorMessage(msg);
		}
		
		


	public static class root_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "root"
	// com/sap/ecm/gateway/cmis/queries/parser/antlr/CmisEcmGrammar.g:34:1: root : query EOF ;
	public final CmisEcmGrammar.root_return root() throws RecognitionException {
		CmisEcmGrammar.root_return retval = new CmisEcmGrammar.root_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token EOF2=null;
		ParserRuleReturnScope query1 =null;

		Object EOF2_tree=null;

		try {
			// com/sap/ecm/gateway/cmis/queries/parser/antlr/CmisEcmGrammar.g:34:5: ( query EOF )
			// com/sap/ecm/gateway/cmis/queries/parser/antlr/CmisEcmGrammar.g:34:7: query EOF
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_query_in_root56);
			query1=query();
			state._fsp--;

			adaptor.addChild(root_0, query1.getTree());

			EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_root58); 
			EOF2_tree = (Object)adaptor.create(EOF2);
			adaptor.addChild(root_0, EOF2_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "root"


	public static class numeric_value_function_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "numeric_value_function"
	// com/sap/ecm/gateway/cmis/queries/parser/antlr/CmisEcmGrammar.g:36:1: numeric_value_function : ( SCORE LPAR RPAR -> ^( SCORE ) | COUNT LPAR STAR RPAR -> ^( COUNT ) | SUM LPAR column_reference RPAR -> ^( SUM column_reference ) );
	public final CmisEcmGrammar.numeric_value_function_return numeric_value_function() throws RecognitionException {
		CmisEcmGrammar.numeric_value_function_return retval = new CmisEcmGrammar.numeric_value_function_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token SCORE3=null;
		Token LPAR4=null;
		Token RPAR5=null;
		Token COUNT6=null;
		Token LPAR7=null;
		Token STAR8=null;
		Token RPAR9=null;
		Token SUM10=null;
		Token LPAR11=null;
		Token RPAR13=null;
		ParserRuleReturnScope column_reference12 =null;

		Object SCORE3_tree=null;
		Object LPAR4_tree=null;
		Object RPAR5_tree=null;
		Object COUNT6_tree=null;
		Object LPAR7_tree=null;
		Object STAR8_tree=null;
		Object RPAR9_tree=null;
		Object SUM10_tree=null;
		Object LPAR11_tree=null;
		Object RPAR13_tree=null;
		RewriteRuleTokenStream stream_RPAR=new RewriteRuleTokenStream(adaptor,"token RPAR");
		RewriteRuleTokenStream stream_COUNT=new RewriteRuleTokenStream(adaptor,"token COUNT");
		RewriteRuleTokenStream stream_STAR=new RewriteRuleTokenStream(adaptor,"token STAR");
		RewriteRuleTokenStream stream_SCORE=new RewriteRuleTokenStream(adaptor,"token SCORE");
		RewriteRuleTokenStream stream_LPAR=new RewriteRuleTokenStream(adaptor,"token LPAR");
		RewriteRuleTokenStream stream_SUM=new RewriteRuleTokenStream(adaptor,"token SUM");
		RewriteRuleSubtreeStream stream_column_reference=new RewriteRuleSubtreeStream(adaptor,"rule column_reference");

		try {
			// com/sap/ecm/gateway/cmis/queries/parser/antlr/CmisEcmGrammar.g:36:23: ( SCORE LPAR RPAR -> ^( SCORE ) | COUNT LPAR STAR RPAR -> ^( COUNT ) | SUM LPAR column_reference RPAR -> ^( SUM column_reference ) )
			int alt1=3;
			switch ( input.LA(1) ) {
			case SCORE:
				{
				alt1=1;
				}
				break;
			case COUNT:
				{
				alt1=2;
				}
				break;
			case SUM:
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
					// com/sap/ecm/gateway/cmis/queries/parser/antlr/CmisEcmGrammar.g:37:7: SCORE LPAR RPAR
					{
					SCORE3=(Token)match(input,SCORE,FOLLOW_SCORE_in_numeric_value_function71);  
					stream_SCORE.add(SCORE3);

					LPAR4=(Token)match(input,LPAR,FOLLOW_LPAR_in_numeric_value_function73);  
					stream_LPAR.add(LPAR4);

					RPAR5=(Token)match(input,RPAR,FOLLOW_RPAR_in_numeric_value_function75);  
					stream_RPAR.add(RPAR5);

					// AST REWRITE
					// elements: SCORE
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 37:23: -> ^( SCORE )
					{
						// com/sap/ecm/gateway/cmis/queries/parser/antlr/CmisEcmGrammar.g:37:26: ^( SCORE )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(stream_SCORE.nextNode(), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// com/sap/ecm/gateway/cmis/queries/parser/antlr/CmisEcmGrammar.g:38:7: COUNT LPAR STAR RPAR
					{
					COUNT6=(Token)match(input,COUNT,FOLLOW_COUNT_in_numeric_value_function89);  
					stream_COUNT.add(COUNT6);

					LPAR7=(Token)match(input,LPAR,FOLLOW_LPAR_in_numeric_value_function91);  
					stream_LPAR.add(LPAR7);

					STAR8=(Token)match(input,STAR,FOLLOW_STAR_in_numeric_value_function93);  
					stream_STAR.add(STAR8);

					RPAR9=(Token)match(input,RPAR,FOLLOW_RPAR_in_numeric_value_function95);  
					stream_RPAR.add(RPAR9);

					// AST REWRITE
					// elements: COUNT
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 38:28: -> ^( COUNT )
					{
						// com/sap/ecm/gateway/cmis/queries/parser/antlr/CmisEcmGrammar.g:38:31: ^( COUNT )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(stream_COUNT.nextNode(), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// com/sap/ecm/gateway/cmis/queries/parser/antlr/CmisEcmGrammar.g:39:7: SUM LPAR column_reference RPAR
					{
					SUM10=(Token)match(input,SUM,FOLLOW_SUM_in_numeric_value_function109);  
					stream_SUM.add(SUM10);

					LPAR11=(Token)match(input,LPAR,FOLLOW_LPAR_in_numeric_value_function111);  
					stream_LPAR.add(LPAR11);

					pushFollow(FOLLOW_column_reference_in_numeric_value_function113);
					column_reference12=column_reference();
					state._fsp--;

					stream_column_reference.add(column_reference12.getTree());
					RPAR13=(Token)match(input,RPAR,FOLLOW_RPAR_in_numeric_value_function115);  
					stream_RPAR.add(RPAR13);

					// AST REWRITE
					// elements: SUM, column_reference
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 40:7: -> ^( SUM column_reference )
					{
						// com/sap/ecm/gateway/cmis/queries/parser/antlr/CmisEcmGrammar.g:40:10: ^( SUM column_reference )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(stream_SUM.nextNode(), root_1);
						adaptor.addChild(root_1, stream_column_reference.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "numeric_value_function"

	// Delegated rules
	public CmisEcmGrammar_CmisBaseGrammar.in_predicate_return in_predicate() throws RecognitionException { return gCmisBaseGrammar.in_predicate(); }

	public CmisEcmGrammar_CmisBaseGrammar.query_return query() throws RecognitionException { return gCmisBaseGrammar.query(); }

	public CmisEcmGrammar_CmisBaseGrammar.comparison_predicate_return comparison_predicate() throws RecognitionException { return gCmisBaseGrammar.comparison_predicate(); }

	public CmisEcmGrammar_CmisBaseGrammar.table_name_return table_name() throws RecognitionException { return gCmisBaseGrammar.table_name(); }

	public CmisEcmGrammar_CmisBaseGrammar.text_search_expression_return text_search_expression() throws RecognitionException { return gCmisBaseGrammar.text_search_expression(); }

	public CmisEcmGrammar_CmisBaseGrammar.column_reference_return column_reference() throws RecognitionException { return gCmisBaseGrammar.column_reference(); }

	public CmisEcmGrammar_CmisBaseGrammar.multi_valued_column_reference_return multi_valued_column_reference() throws RecognitionException { return gCmisBaseGrammar.multi_valued_column_reference(); }

	public CmisEcmGrammar_CmisBaseGrammar.in_value_list_return in_value_list() throws RecognitionException { return gCmisBaseGrammar.in_value_list(); }

	public CmisEcmGrammar_CmisBaseGrammar.text_search_predicate_return text_search_predicate() throws RecognitionException { return gCmisBaseGrammar.text_search_predicate(); }

	public CmisEcmGrammar_CmisBaseGrammar.from_clause_return from_clause() throws RecognitionException { return gCmisBaseGrammar.from_clause(); }

	public CmisEcmGrammar_CmisBaseGrammar.sort_specification_return sort_specification() throws RecognitionException { return gCmisBaseGrammar.sort_specification(); }

	public CmisEcmGrammar_CmisBaseGrammar.qualifier_return qualifier() throws RecognitionException { return gCmisBaseGrammar.qualifier(); }

	public CmisEcmGrammar_CmisBaseGrammar.join_kind_return join_kind() throws RecognitionException { return gCmisBaseGrammar.join_kind(); }

	public CmisEcmGrammar_CmisBaseGrammar.value_expression_return value_expression() throws RecognitionException { return gCmisBaseGrammar.value_expression(); }

	public CmisEcmGrammar_CmisBaseGrammar.join_specification_return join_specification() throws RecognitionException { return gCmisBaseGrammar.join_specification(); }

	public CmisEcmGrammar_CmisBaseGrammar.multi_valued_column_name_return multi_valued_column_name() throws RecognitionException { return gCmisBaseGrammar.multi_valued_column_name(); }

	public CmisEcmGrammar_CmisBaseGrammar.search_condition_return search_condition() throws RecognitionException { return gCmisBaseGrammar.search_condition(); }

	public CmisEcmGrammar_CmisBaseGrammar.folder_id_return folder_id() throws RecognitionException { return gCmisBaseGrammar.folder_id(); }

	public CmisEcmGrammar_CmisBaseGrammar.correlation_name_return correlation_name() throws RecognitionException { return gCmisBaseGrammar.correlation_name(); }

	public CmisEcmGrammar_CmisBaseGrammar.table_reference_return table_reference() throws RecognitionException { return gCmisBaseGrammar.table_reference(); }

	public CmisEcmGrammar_CmisBaseGrammar.select_list_return select_list() throws RecognitionException { return gCmisBaseGrammar.select_list(); }

	public CmisEcmGrammar_CmisBaseGrammar.boolean_test_return boolean_test() throws RecognitionException { return gCmisBaseGrammar.boolean_test(); }

	public CmisEcmGrammar_CmisBaseGrammar.literal_return literal() throws RecognitionException { return gCmisBaseGrammar.literal(); }

	public CmisEcmGrammar_CmisBaseGrammar.table_join_return table_join() throws RecognitionException { return gCmisBaseGrammar.table_join(); }

	public CmisEcmGrammar_CmisBaseGrammar.where_clause_return where_clause() throws RecognitionException { return gCmisBaseGrammar.where_clause(); }

	public CmisEcmGrammar_CmisBaseGrammar.predicate_return predicate() throws RecognitionException { return gCmisBaseGrammar.predicate(); }

	public CmisEcmGrammar_CmisBaseGrammar.boolean_term_return boolean_term() throws RecognitionException { return gCmisBaseGrammar.boolean_term(); }

	public CmisEcmGrammar_CmisBaseGrammar.like_predicate_return like_predicate() throws RecognitionException { return gCmisBaseGrammar.like_predicate(); }

	public CmisEcmGrammar_CmisBaseGrammar.column_name_return column_name() throws RecognitionException { return gCmisBaseGrammar.column_name(); }

	public CmisEcmGrammar_CmisBaseGrammar.order_by_clause_return order_by_clause() throws RecognitionException { return gCmisBaseGrammar.order_by_clause(); }

	public CmisEcmGrammar_CmisBaseGrammar.null_predicate_return null_predicate() throws RecognitionException { return gCmisBaseGrammar.null_predicate(); }

	public CmisEcmGrammar_CmisBaseGrammar.one_table_return one_table() throws RecognitionException { return gCmisBaseGrammar.one_table(); }

	public CmisEcmGrammar_CmisBaseGrammar.quantified_comparison_predicate_return quantified_comparison_predicate() throws RecognitionException { return gCmisBaseGrammar.quantified_comparison_predicate(); }

	public CmisEcmGrammar_CmisBaseGrammar.select_sublist_return select_sublist() throws RecognitionException { return gCmisBaseGrammar.select_sublist(); }

	public CmisEcmGrammar_CmisBaseGrammar.boolean_factor_return boolean_factor() throws RecognitionException { return gCmisBaseGrammar.boolean_factor(); }

	public CmisEcmGrammar_CmisBaseGrammar.quantified_in_predicate_return quantified_in_predicate() throws RecognitionException { return gCmisBaseGrammar.quantified_in_predicate(); }

	public CmisEcmGrammar_CmisBaseGrammar.folder_predicate_return folder_predicate() throws RecognitionException { return gCmisBaseGrammar.folder_predicate(); }



	public static final BitSet FOLLOW_query_in_root56 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_root58 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SCORE_in_numeric_value_function71 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_LPAR_in_numeric_value_function73 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_RPAR_in_numeric_value_function75 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COUNT_in_numeric_value_function89 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_LPAR_in_numeric_value_function91 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_STAR_in_numeric_value_function93 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_RPAR_in_numeric_value_function95 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SUM_in_numeric_value_function109 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_LPAR_in_numeric_value_function111 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_column_reference_in_numeric_value_function113 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_RPAR_in_numeric_value_function115 = new BitSet(new long[]{0x0000000000000002L});
}
