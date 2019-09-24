// $ANTLR 3.5.2 com/sap/ecm/gateway/cmis/queries/parser/antlr/CmisEcmQueryWalker.g 2019-02-13 18:10:49

/*
 * THIS FILE IS AUTO-GENERATED, DO NOT EDIT.
 */
package com.sap.ecm.gateway.cmis.queries.parser.antlr;

import java.math.BigDecimal;

import org.apache.chemistry.opencmis.server.support.query.*;
import com.sap.ecm.gateway.cmis.queries.parser.FunctionReference;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


@SuppressWarnings("all")
public class CmisEcmQueryWalker extends TreeParser {
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
		"107", "108", "109", "110", "111", "112", "113", "114", "115", "116", 
		"117"
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
	public CmisEcmQueryWalker_CmisBaseQueryWalker gCmisBaseQueryWalker;
	public TreeParser[] getDelegates() {
		return new TreeParser[] {gCmisBaseQueryWalker};
	}

	// delegators


	public CmisEcmQueryWalker(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public CmisEcmQueryWalker(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
		gCmisBaseQueryWalker = new CmisEcmQueryWalker_CmisBaseQueryWalker(input, state, this);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
		gCmisBaseQueryWalker.setTreeAdaptor(this.adaptor);
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return CmisEcmQueryWalker.tokenNames; }
	@Override public String getGrammarFileName() { return "com/sap/ecm/gateway/cmis/queries/parser/antlr/CmisEcmQueryWalker.g"; }


	    public Tree getWherePredicateTree() {
	      return gCmisBaseQueryWalker.getWherePredicateTree();
	    }

	    protected void mismatch(IntStream input, int ttype, BitSet follow) throws RecognitionException
	    {
	      gCmisBaseQueryWalker.mismatch(input, ttype, follow);
	    }

	    public void recoverFromMismatchedSet(IntStream input, RecognitionException e, antlr.collections.impl.BitSet follow) throws RecognitionException
	    {
	      gCmisBaseQueryWalker.recoverFromMismatchedSet(input, e, follow);
	    }



	public static class root_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "root"
	// com/sap/ecm/gateway/cmis/queries/parser/antlr/CmisEcmQueryWalker.g:48:1: root[QueryObject go, PredicateWalkerBase pw] : query[go, pw] ;
	public final CmisEcmQueryWalker.root_return root(QueryObject go, PredicateWalkerBase pw) throws CmisQueryException, RecognitionException {
		CmisEcmQueryWalker.root_return retval = new CmisEcmQueryWalker.root_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		TreeRuleReturnScope query1 =null;


		try {
			// com/sap/ecm/gateway/cmis/queries/parser/antlr/CmisEcmQueryWalker.g:48:72: ( query[go, pw] )
			// com/sap/ecm/gateway/cmis/queries/parser/antlr/CmisEcmQueryWalker.g:49:7: query[go, pw]
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_query_in_root87);
			query1=query(go, pw);
			state._fsp--;

			adaptor.addChild(root_0, query1.getTree());

			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}

		    catch (RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "root"


	public static class value_expression_return extends TreeRuleReturnScope {
		public CmisSelector result;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "value_expression"
	// com/sap/ecm/gateway/cmis/queries/parser/antlr/CmisEcmQueryWalker.g:52:1: value_expression returns [CmisSelector result] : ( column_reference | SCORE ^| COUNT ^| ^( SUM column_reference ) );
	public final CmisEcmQueryWalker.value_expression_return value_expression() throws RecognitionException {
		CmisEcmQueryWalker.value_expression_return retval = new CmisEcmQueryWalker.value_expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree SCORE3=null;
		CommonTree COUNT4=null;
		CommonTree SUM5=null;
		TreeRuleReturnScope column_reference2 =null;
		TreeRuleReturnScope column_reference6 =null;

		CommonTree SCORE3_tree=null;
		CommonTree COUNT4_tree=null;
		CommonTree SUM5_tree=null;

		try {
			// com/sap/ecm/gateway/cmis/queries/parser/antlr/CmisEcmQueryWalker.g:52:47: ( column_reference | SCORE ^| COUNT ^| ^( SUM column_reference ) )
			int alt1=4;
			switch ( input.LA(1) ) {
			case COL:
				{
				alt1=1;
				}
				break;
			case SCORE:
				{
				alt1=2;
				}
				break;
			case COUNT:
				{
				alt1=3;
				}
				break;
			case SUM:
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
					// com/sap/ecm/gateway/cmis/queries/parser/antlr/CmisEcmQueryWalker.g:53:7: column_reference
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_column_reference_in_value_expression109);
					column_reference2=column_reference();
					state._fsp--;

					adaptor.addChild(root_0, column_reference2.getTree());


					          retval.result = (column_reference2!=null?((CmisEcmQueryWalker_CmisBaseQueryWalker.column_reference_return)column_reference2).result:null);
					      
					}
					break;
				case 2 :
					// com/sap/ecm/gateway/cmis/queries/parser/antlr/CmisEcmQueryWalker.g:57:7: SCORE ^
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					SCORE3=(CommonTree)match(input,SCORE,FOLLOW_SCORE_in_value_expression125); 
					SCORE3_tree = (CommonTree)adaptor.dupNode(SCORE3);


					root_0 = (CommonTree)adaptor.becomeRoot(SCORE3_tree, root_0);


					            retval.result = new FunctionReference(FunctionReference.CmisQlFunction.SCORE);
					        
					}
					break;
				case 3 :
					// com/sap/ecm/gateway/cmis/queries/parser/antlr/CmisEcmQueryWalker.g:61:7: COUNT ^
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					COUNT4=(CommonTree)match(input,COUNT,FOLLOW_COUNT_in_value_expression144); 
					COUNT4_tree = (CommonTree)adaptor.dupNode(COUNT4);


					root_0 = (CommonTree)adaptor.becomeRoot(COUNT4_tree, root_0);


					            retval.result = new FunctionReference(FunctionReference.EcmQlFunction.COUNT);
					        
					}
					break;
				case 4 :
					// com/sap/ecm/gateway/cmis/queries/parser/antlr/CmisEcmQueryWalker.g:65:7: ^( SUM column_reference )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					SUM5=(CommonTree)match(input,SUM,FOLLOW_SUM_in_value_expression164); 
					SUM5_tree = (CommonTree)adaptor.dupNode(SUM5);


					root_1 = (CommonTree)adaptor.becomeRoot(SUM5_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_column_reference_in_value_expression166);
					column_reference6=column_reference();
					state._fsp--;

					adaptor.addChild(root_1, column_reference6.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					            retval.result = new FunctionReference(FunctionReference.EcmQlFunction.SUM, (column_reference6!=null?((CmisEcmQueryWalker_CmisBaseQueryWalker.column_reference_return)column_reference6).result:null));
					        
					}
					break;

			}
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}

		    catch (RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "value_expression"

	// Delegated rules
	public CmisEcmQueryWalker_CmisBaseQueryWalker.qualifier_return qualifier() throws RecognitionException { return gCmisBaseQueryWalker.qualifier(); }

	public CmisEcmQueryWalker_CmisBaseQueryWalker.column_name_return column_name() throws RecognitionException { return gCmisBaseQueryWalker.column_name(); }

	public CmisEcmQueryWalker_CmisBaseQueryWalker.column_reference_return column_reference() throws RecognitionException { return gCmisBaseQueryWalker.column_reference(); }

	public CmisEcmQueryWalker_CmisBaseQueryWalker.table_name_return table_name() throws RecognitionException { return gCmisBaseQueryWalker.table_name(); }

	public CmisEcmQueryWalker_CmisBaseQueryWalker.in_value_list_return in_value_list() throws RecognitionException { return gCmisBaseQueryWalker.in_value_list(); }

	public CmisEcmQueryWalker_CmisBaseQueryWalker.where_clause_return where_clause() throws RecognitionException { return gCmisBaseQueryWalker.where_clause(); }

	public CmisEcmQueryWalker_CmisBaseQueryWalker.select_list_return select_list() throws RecognitionException { return gCmisBaseQueryWalker.select_list(); }

	public CmisEcmQueryWalker_CmisBaseQueryWalker.query_return query(QueryObject qo, PredicateWalkerBase pw) throws CmisQueryException, RecognitionException { return gCmisBaseQueryWalker.query(qo, pw); }

	public CmisEcmQueryWalker_CmisBaseQueryWalker.multi_valued_column_reference_return multi_valued_column_reference() throws RecognitionException { return gCmisBaseQueryWalker.multi_valued_column_reference(); }

	public CmisEcmQueryWalker_CmisBaseQueryWalker.table_join_return table_join() throws RecognitionException { return gCmisBaseQueryWalker.table_join(); }

	public CmisEcmQueryWalker_CmisBaseQueryWalker.from_clause_return from_clause() throws RecognitionException { return gCmisBaseQueryWalker.from_clause(); }

	public CmisEcmQueryWalker_CmisBaseQueryWalker.select_sublist_return select_sublist() throws RecognitionException { return gCmisBaseQueryWalker.select_sublist(); }

	public CmisEcmQueryWalker_CmisBaseQueryWalker.sort_specification_return sort_specification() throws RecognitionException { return gCmisBaseQueryWalker.sort_specification(); }

	public CmisEcmQueryWalker_CmisBaseQueryWalker.search_condition_return search_condition() throws RecognitionException { return gCmisBaseQueryWalker.search_condition(); }

	public CmisEcmQueryWalker_CmisBaseQueryWalker.correlation_name_return correlation_name() throws RecognitionException { return gCmisBaseQueryWalker.correlation_name(); }

	public CmisEcmQueryWalker_CmisBaseQueryWalker.one_table_return one_table() throws RecognitionException { return gCmisBaseQueryWalker.one_table(); }

	public CmisEcmQueryWalker_CmisBaseQueryWalker.order_by_clause_return order_by_clause() throws RecognitionException { return gCmisBaseQueryWalker.order_by_clause(); }

	public CmisEcmQueryWalker_CmisBaseQueryWalker.join_specification_return join_specification() throws RecognitionException { return gCmisBaseQueryWalker.join_specification(); }

	public CmisEcmQueryWalker_CmisBaseQueryWalker.join_kind_return join_kind() throws RecognitionException { return gCmisBaseQueryWalker.join_kind(); }

	public CmisEcmQueryWalker_CmisBaseQueryWalker.table_reference_return table_reference() throws RecognitionException { return gCmisBaseQueryWalker.table_reference(); }

	public CmisEcmQueryWalker_CmisBaseQueryWalker.text_search_expression_return text_search_expression() throws RecognitionException { return gCmisBaseQueryWalker.text_search_expression(); }

	public CmisEcmQueryWalker_CmisBaseQueryWalker.literal_return literal() throws RecognitionException { return gCmisBaseQueryWalker.literal(); }



	public static final BitSet FOLLOW_query_in_root87 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_column_reference_in_value_expression109 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SCORE_in_value_expression125 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COUNT_in_value_expression144 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SUM_in_value_expression164 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_column_reference_in_value_expression166 = new BitSet(new long[]{0x0000000000000008L});
}
