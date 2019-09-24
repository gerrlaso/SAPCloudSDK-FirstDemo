// $ANTLR 3.5.2 CmisBaseQueryWalker.g 2019-02-13 18:10:49

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


/**
 * CMISQL tree grammar, walker for the inmemory implementation.
 * This aims at implementing proper semantics without any speed
 * optimization.
 */
@SuppressWarnings("all")
public class CmisEcmQueryWalker_CmisBaseQueryWalker extends TreeParser {
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
	public TreeParser[] getDelegates() {
		return new TreeParser[] {};
	}

	// delegators
	public CmisEcmQueryWalker gCmisEcmQueryWalker;
	public CmisEcmQueryWalker gParent;


	public CmisEcmQueryWalker_CmisBaseQueryWalker(TreeNodeStream input, CmisEcmQueryWalker gCmisEcmQueryWalker) {
		this(input, new RecognizerSharedState(), gCmisEcmQueryWalker);
	}
	public CmisEcmQueryWalker_CmisBaseQueryWalker(TreeNodeStream input, RecognizerSharedState state, CmisEcmQueryWalker gCmisEcmQueryWalker) {
		super(input, state);
		this.gCmisEcmQueryWalker = gCmisEcmQueryWalker;
		gParent = gCmisEcmQueryWalker;
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return CmisEcmQueryWalker.tokenNames; }
	@Override public String getGrammarFileName() { return "CmisBaseQueryWalker.g"; }


	    private QueryObject queryObj;
	    private Tree wherePredicateTree;
	    private boolean doFullTextParse = true;

	    public Tree getWherePredicateTree() {
	        return wherePredicateTree;
	    }

	    protected void mismatch(IntStream input, int ttype, BitSet follow)
	        throws RecognitionException
	    {
	        throw new MismatchedTokenException(ttype, input);
	    }

	    public void recoverFromMismatchedSet(IntStream input, RecognitionException e, antlr.collections.impl.BitSet follow)
	        throws RecognitionException
	    {
	        throw e;
	    }

		public void setDoFullTextParse(boolean value) {
			doFullTextParse = value;
		}
		
		public boolean getDoFullTextParse() {
			return doFullTextParse;
		}
		
	    private static CommonTree parseTextSearchPredicate(String expr) throws RecognitionException {
	        String unescapedExpr = StringUtil.unescape(expr.substring(1, expr.length()-1), null);
	        CharStream input = new ANTLRStringStream(unescapedExpr);
	        TokenSource lexer = new TextSearchLexer(input);
	        TokenStream tokens = new CommonTokenStream(lexer);
	        TextSearchParser parser = new TextSearchParser(tokens);

	        TextSearchParser.text_search_expression_return parsedStatement = parser.text_search_expression();
	        return (CommonTree) parsedStatement.getTree();
	    }


	public static class query_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "query"
	// CmisBaseQueryWalker.g:84:1: query[QueryObject qo, PredicateWalkerBase pw] : ^( SELECT select_list from_clause ( order_by_clause )? where_clause ) {...}?;
	public final CmisEcmQueryWalker_CmisBaseQueryWalker.query_return query(QueryObject qo, PredicateWalkerBase pw) throws CmisQueryException, RecognitionException {
		CmisEcmQueryWalker_CmisBaseQueryWalker.query_return retval = new CmisEcmQueryWalker_CmisBaseQueryWalker.query_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree SELECT1=null;
		TreeRuleReturnScope select_list2 =null;
		TreeRuleReturnScope from_clause3 =null;
		TreeRuleReturnScope order_by_clause4 =null;
		TreeRuleReturnScope where_clause5 =null;

		CommonTree SELECT1_tree=null;


		        queryObj = qo;
		    
		try {
			// CmisBaseQueryWalker.g:87:6: ( ^( SELECT select_list from_clause ( order_by_clause )? where_clause ) {...}?)
			// CmisBaseQueryWalker.g:88:5: ^( SELECT select_list from_clause ( order_by_clause )? where_clause ) {...}?
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			SELECT1=(CommonTree)match(input,SELECT,FOLLOW_SELECT_in_query87); 
			SELECT1_tree = (CommonTree)adaptor.dupNode(SELECT1);


			root_1 = (CommonTree)adaptor.becomeRoot(SELECT1_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_select_list_in_query89);
			select_list2=select_list();
			state._fsp--;

			adaptor.addChild(root_1, select_list2.getTree());

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_from_clause_in_query91);
			from_clause3=from_clause();
			state._fsp--;

			adaptor.addChild(root_1, from_clause3.getTree());

			// CmisBaseQueryWalker.g:88:38: ( order_by_clause )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==ORDER_BY) ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// CmisBaseQueryWalker.g:88:38: order_by_clause
					{
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_order_by_clause_in_query93);
					order_by_clause4=order_by_clause();
					state._fsp--;

					adaptor.addChild(root_1, order_by_clause4.getTree());

					}
					break;

			}

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_where_clause_in_query96);
			where_clause5=where_clause();
			state._fsp--;

			adaptor.addChild(root_1, where_clause5.getTree());

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}



			        wherePredicateTree = (where_clause5!=null?((CommonTree)where_clause5.getTree()):null)==null ? null : (where_clause5!=null?((CommonTree)where_clause5.getTree()):null).getChild(0);
			        boolean resolved = queryObj.resolveTypes();
			        if (null != pw && null != (where_clause5!=null?((CommonTree)where_clause5.getTree()):null))
			            pw.walkPredicate(wherePredicateTree);
			    
			if ( !((
			        resolved
			    )) ) {
				throw new FailedPredicateException(input, "query", "\r\n        resolved\r\n    ");
			}
			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (FailedPredicateException e) {

			        // change default text to preserved text which is useful
			        e.predicateText = queryObj.getErrorMessage();
			        throw e;
			    
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "query"


	public static class select_list_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "select_list"
	// CmisBaseQueryWalker.g:106:1: select_list : ( STAR | ^( SEL_LIST ( select_sublist )+ ) );
	public final CmisEcmQueryWalker_CmisBaseQueryWalker.select_list_return select_list() throws RecognitionException {
		CmisEcmQueryWalker_CmisBaseQueryWalker.select_list_return retval = new CmisEcmQueryWalker_CmisBaseQueryWalker.select_list_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree STAR6=null;
		CommonTree SEL_LIST7=null;
		TreeRuleReturnScope select_sublist8 =null;

		CommonTree STAR6_tree=null;
		CommonTree SEL_LIST7_tree=null;

		try {
			// CmisBaseQueryWalker.g:106:12: ( STAR | ^( SEL_LIST ( select_sublist )+ ) )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==STAR) ) {
				alt3=1;
			}
			else if ( (LA3_0==SEL_LIST) ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// CmisBaseQueryWalker.g:107:7: STAR
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					STAR6=(CommonTree)match(input,STAR,FOLLOW_STAR_in_select_list140); 
					STAR6_tree = (CommonTree)adaptor.dupNode(STAR6);


					adaptor.addChild(root_0, STAR6_tree);


					            queryObj.addSelectReference(STAR6, new ColumnReference((STAR6!=null?STAR6.getText():null)));
					      
					}
					break;
				case 2 :
					// CmisBaseQueryWalker.g:111:7: ^( SEL_LIST ( select_sublist )+ )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					SEL_LIST7=(CommonTree)match(input,SEL_LIST,FOLLOW_SEL_LIST_in_select_list157); 
					SEL_LIST7_tree = (CommonTree)adaptor.dupNode(SEL_LIST7);


					root_1 = (CommonTree)adaptor.becomeRoot(SEL_LIST7_tree, root_1);

					match(input, Token.DOWN, null); 
					// CmisBaseQueryWalker.g:111:18: ( select_sublist )+
					int cnt2=0;
					loop2:
					while (true) {
						int alt2=2;
						int LA2_0 = input.LA(1);
						if ( (LA2_0==COL||LA2_0==COUNT||LA2_0==ID||LA2_0==SCORE||LA2_0==SUM) ) {
							alt2=1;
						}

						switch (alt2) {
						case 1 :
							// CmisBaseQueryWalker.g:111:18: select_sublist
							{
							_last = (CommonTree)input.LT(1);
							pushFollow(FOLLOW_select_sublist_in_select_list159);
							select_sublist8=select_sublist();
							state._fsp--;

							adaptor.addChild(root_1, select_sublist8.getTree());

							}
							break;

						default :
							if ( cnt2 >= 1 ) break loop2;
							EarlyExitException eee = new EarlyExitException(2, input);
							throw eee;
						}
						cnt2++;
					}

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


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
	// $ANTLR end "select_list"


	protected static class select_sublist_scope {
		String current;
	}
	protected Stack<select_sublist_scope> select_sublist_stack = new Stack<select_sublist_scope>();

	public static class select_sublist_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "select_sublist"
	// CmisBaseQueryWalker.g:114:1: select_sublist : ( value_expression ( column_name )? |s= qualifier DOT STAR );
	public final CmisEcmQueryWalker_CmisBaseQueryWalker.select_sublist_return select_sublist() throws RecognitionException {
		select_sublist_stack.push(new select_sublist_scope());
		CmisEcmQueryWalker_CmisBaseQueryWalker.select_sublist_return retval = new CmisEcmQueryWalker_CmisBaseQueryWalker.select_sublist_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree DOT11=null;
		CommonTree STAR12=null;
		TreeRuleReturnScope s =null;
		TreeRuleReturnScope value_expression9 =null;
		TreeRuleReturnScope column_name10 =null;

		CommonTree DOT11_tree=null;
		CommonTree STAR12_tree=null;

		try {
			// CmisBaseQueryWalker.g:116:5: ( value_expression ( column_name )? |s= qualifier DOT STAR )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==COL||LA5_0==COUNT||LA5_0==SCORE||LA5_0==SUM) ) {
				alt5=1;
			}
			else if ( (LA5_0==ID) ) {
				alt5=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// CmisBaseQueryWalker.g:117:7: value_expression ( column_name )?
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_value_expression_in_select_sublist192);
					value_expression9=gCmisEcmQueryWalker.value_expression();
					state._fsp--;

					adaptor.addChild(root_0, value_expression9.getTree());

					// CmisBaseQueryWalker.g:117:24: ( column_name )?
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0==ID) ) {
						int LA4_1 = input.LA(2);
						if ( (LA4_1==UP||LA4_1==COL||LA4_1==COUNT||LA4_1==ID||LA4_1==SCORE||LA4_1==SUM) ) {
							alt4=1;
						}
					}
					switch (alt4) {
						case 1 :
							// CmisBaseQueryWalker.g:117:24: column_name
							{
							_last = (CommonTree)input.LT(1);
							pushFollow(FOLLOW_column_name_in_select_sublist194);
							column_name10=column_name();
							state._fsp--;

							adaptor.addChild(root_0, column_name10.getTree());

							}
							break;

					}


					          // add selector
					          queryObj.addSelectReference((value_expression9!=null?((CommonTree)value_expression9.start):null), (value_expression9!=null?((CmisEcmQueryWalker.value_expression_return)value_expression9).result:null));
					          // add alias for column
					          if ((column_name10!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(column_name10.start),input.getTreeAdaptor().getTokenStopIndex(column_name10.start))):null) != null) {
					             queryObj.addAlias((column_name10!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(column_name10.start),input.getTreeAdaptor().getTokenStopIndex(column_name10.start))):null), (value_expression9!=null?((CmisEcmQueryWalker.value_expression_return)value_expression9).result:null));
					          }
					      
					}
					break;
				case 2 :
					// CmisBaseQueryWalker.g:126:7: s= qualifier DOT STAR
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_qualifier_in_select_sublist213);
					s=qualifier();
					state._fsp--;

					adaptor.addChild(root_0, s.getTree());

					_last = (CommonTree)input.LT(1);
					DOT11=(CommonTree)match(input,DOT,FOLLOW_DOT_in_select_sublist215); 
					DOT11_tree = (CommonTree)adaptor.dupNode(DOT11);


					adaptor.addChild(root_0, DOT11_tree);

					_last = (CommonTree)input.LT(1);
					STAR12=(CommonTree)match(input,STAR,FOLLOW_STAR_in_select_sublist217); 
					STAR12_tree = (CommonTree)adaptor.dupNode(STAR12);


					adaptor.addChild(root_0, STAR12_tree);


					            queryObj.addSelectReference((s!=null?((CommonTree)s.start):null), new ColumnReference((s!=null?((CmisEcmQueryWalker_CmisBaseQueryWalker.qualifier_return)s).value:null), (STAR12!=null?STAR12.getText():null)));
					      
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
			select_sublist_stack.pop();
		}
		return retval;
	}
	// $ANTLR end "select_sublist"


	public static class column_reference_return extends TreeRuleReturnScope {
		public ColumnReference result;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "column_reference"
	// CmisBaseQueryWalker.g:144:1: column_reference returns [ColumnReference result] : ^( COL ( qualifier )? column_name ) ;
	public final CmisEcmQueryWalker_CmisBaseQueryWalker.column_reference_return column_reference() throws RecognitionException {
		CmisEcmQueryWalker_CmisBaseQueryWalker.column_reference_return retval = new CmisEcmQueryWalker_CmisBaseQueryWalker.column_reference_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree COL13=null;
		TreeRuleReturnScope qualifier14 =null;
		TreeRuleReturnScope column_name15 =null;

		CommonTree COL13_tree=null;

		try {
			// CmisBaseQueryWalker.g:144:50: ( ^( COL ( qualifier )? column_name ) )
			// CmisBaseQueryWalker.g:145:5: ^( COL ( qualifier )? column_name )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			COL13=(CommonTree)match(input,COL,FOLLOW_COL_in_column_reference296); 
			COL13_tree = (CommonTree)adaptor.dupNode(COL13);


			root_1 = (CommonTree)adaptor.becomeRoot(COL13_tree, root_1);

			match(input, Token.DOWN, null); 
			// CmisBaseQueryWalker.g:145:11: ( qualifier )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==ID) ) {
				int LA7_1 = input.LA(2);
				if ( (LA7_1==ID) ) {
					alt7=1;
				}
			}
			switch (alt7) {
				case 1 :
					// CmisBaseQueryWalker.g:145:11: qualifier
					{
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_qualifier_in_column_reference298);
					qualifier14=qualifier();
					state._fsp--;

					adaptor.addChild(root_1, qualifier14.getTree());

					}
					break;

			}

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_column_name_in_column_reference301);
			column_name15=column_name();
			state._fsp--;

			adaptor.addChild(root_1, column_name15.getTree());

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}



			          retval.result = new ColumnReference((qualifier14!=null?((CmisEcmQueryWalker_CmisBaseQueryWalker.qualifier_return)qualifier14).value:null), (column_name15!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(column_name15.start),input.getTreeAdaptor().getTokenStopIndex(column_name15.start))):null));
			      
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
	// $ANTLR end "column_reference"


	public static class multi_valued_column_reference_return extends TreeRuleReturnScope {
		public ColumnReference result;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "multi_valued_column_reference"
	// CmisBaseQueryWalker.g:151:1: multi_valued_column_reference returns [ColumnReference result] : ^( COL ( qualifier )? column_name ) ;
	public final CmisEcmQueryWalker_CmisBaseQueryWalker.multi_valued_column_reference_return multi_valued_column_reference() throws RecognitionException {
		CmisEcmQueryWalker_CmisBaseQueryWalker.multi_valued_column_reference_return retval = new CmisEcmQueryWalker_CmisBaseQueryWalker.multi_valued_column_reference_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree COL16=null;
		TreeRuleReturnScope qualifier17 =null;
		TreeRuleReturnScope column_name18 =null;

		CommonTree COL16_tree=null;

		try {
			// CmisBaseQueryWalker.g:151:63: ( ^( COL ( qualifier )? column_name ) )
			// CmisBaseQueryWalker.g:152:5: ^( COL ( qualifier )? column_name )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			COL16=(CommonTree)match(input,COL,FOLLOW_COL_in_multi_valued_column_reference331); 
			COL16_tree = (CommonTree)adaptor.dupNode(COL16);


			root_1 = (CommonTree)adaptor.becomeRoot(COL16_tree, root_1);

			match(input, Token.DOWN, null); 
			// CmisBaseQueryWalker.g:152:11: ( qualifier )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==ID) ) {
				int LA8_1 = input.LA(2);
				if ( (LA8_1==ID) ) {
					alt8=1;
				}
			}
			switch (alt8) {
				case 1 :
					// CmisBaseQueryWalker.g:152:11: qualifier
					{
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_qualifier_in_multi_valued_column_reference333);
					qualifier17=qualifier();
					state._fsp--;

					adaptor.addChild(root_1, qualifier17.getTree());

					}
					break;

			}

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_column_name_in_multi_valued_column_reference336);
			column_name18=column_name();
			state._fsp--;

			adaptor.addChild(root_1, column_name18.getTree());

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}



			          retval.result = new ColumnReference((qualifier17!=null?((CmisEcmQueryWalker_CmisBaseQueryWalker.qualifier_return)qualifier17).value:null), (column_name18!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(column_name18.start),input.getTreeAdaptor().getTokenStopIndex(column_name18.start))):null));
			      
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
	// $ANTLR end "multi_valued_column_reference"


	public static class qualifier_return extends TreeRuleReturnScope {
		public String value;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "qualifier"
	// CmisBaseQueryWalker.g:158:1: qualifier returns [String value] : table_name ;
	public final CmisEcmQueryWalker_CmisBaseQueryWalker.qualifier_return qualifier() throws RecognitionException {
		CmisEcmQueryWalker_CmisBaseQueryWalker.qualifier_return retval = new CmisEcmQueryWalker_CmisBaseQueryWalker.qualifier_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		TreeRuleReturnScope table_name19 =null;


		try {
			// CmisBaseQueryWalker.g:158:33: ( table_name )
			// CmisBaseQueryWalker.g:159:7: table_name
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_table_name_in_qualifier367);
			table_name19=table_name();
			state._fsp--;

			adaptor.addChild(root_0, table_name19.getTree());


			      retval.value = (table_name19!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(table_name19.start),input.getTreeAdaptor().getTokenStopIndex(table_name19.start))):null);
			    
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
	// $ANTLR end "qualifier"


	public static class from_clause_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "from_clause"
	// CmisBaseQueryWalker.g:166:1: from_clause : ^( FROM table_reference ) ;
	public final CmisEcmQueryWalker_CmisBaseQueryWalker.from_clause_return from_clause() throws RecognitionException {
		CmisEcmQueryWalker_CmisBaseQueryWalker.from_clause_return retval = new CmisEcmQueryWalker_CmisBaseQueryWalker.from_clause_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree FROM20=null;
		TreeRuleReturnScope table_reference21 =null;

		CommonTree FROM20_tree=null;

		try {
			// CmisBaseQueryWalker.g:166:12: ( ^( FROM table_reference ) )
			// CmisBaseQueryWalker.g:167:5: ^( FROM table_reference )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			FROM20=(CommonTree)match(input,FROM,FOLLOW_FROM_in_from_clause391); 
			FROM20_tree = (CommonTree)adaptor.dupNode(FROM20);


			root_1 = (CommonTree)adaptor.becomeRoot(FROM20_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_table_reference_in_from_clause393);
			table_reference21=table_reference();
			state._fsp--;

			adaptor.addChild(root_1, table_reference21.getTree());

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


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
	// $ANTLR end "from_clause"


	public static class table_reference_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "table_reference"
	// CmisBaseQueryWalker.g:170:1: table_reference : one_table ( table_join )* ;
	public final CmisEcmQueryWalker_CmisBaseQueryWalker.table_reference_return table_reference() throws RecognitionException {
		CmisEcmQueryWalker_CmisBaseQueryWalker.table_reference_return retval = new CmisEcmQueryWalker_CmisBaseQueryWalker.table_reference_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		TreeRuleReturnScope one_table22 =null;
		TreeRuleReturnScope table_join23 =null;


		try {
			// CmisBaseQueryWalker.g:170:16: ( one_table ( table_join )* )
			// CmisBaseQueryWalker.g:171:5: one_table ( table_join )*
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_one_table_in_table_reference410);
			one_table22=one_table();
			state._fsp--;

			adaptor.addChild(root_0, one_table22.getTree());

			// CmisBaseQueryWalker.g:171:15: ( table_join )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==JOIN) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// CmisBaseQueryWalker.g:171:15: table_join
					{
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_table_join_in_table_reference412);
					table_join23=table_join();
					state._fsp--;

					adaptor.addChild(root_0, table_join23.getTree());

					}
					break;

				default :
					break loop9;
				}
			}

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
	// $ANTLR end "table_reference"


	public static class table_join_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "table_join"
	// CmisBaseQueryWalker.g:174:1: table_join : ^( JOIN join_kind one_table ( join_specification )? ) ;
	public final CmisEcmQueryWalker_CmisBaseQueryWalker.table_join_return table_join() throws RecognitionException {
		CmisEcmQueryWalker_CmisBaseQueryWalker.table_join_return retval = new CmisEcmQueryWalker_CmisBaseQueryWalker.table_join_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree JOIN24=null;
		TreeRuleReturnScope join_kind25 =null;
		TreeRuleReturnScope one_table26 =null;
		TreeRuleReturnScope join_specification27 =null;

		CommonTree JOIN24_tree=null;

		try {
			// CmisBaseQueryWalker.g:174:11: ( ^( JOIN join_kind one_table ( join_specification )? ) )
			// CmisBaseQueryWalker.g:175:5: ^( JOIN join_kind one_table ( join_specification )? )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			JOIN24=(CommonTree)match(input,JOIN,FOLLOW_JOIN_in_table_join430); 
			JOIN24_tree = (CommonTree)adaptor.dupNode(JOIN24);


			root_1 = (CommonTree)adaptor.becomeRoot(JOIN24_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_join_kind_in_table_join432);
			join_kind25=join_kind();
			state._fsp--;

			adaptor.addChild(root_1, join_kind25.getTree());

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_one_table_in_table_join434);
			one_table26=one_table();
			state._fsp--;

			adaptor.addChild(root_1, one_table26.getTree());

			// CmisBaseQueryWalker.g:175:32: ( join_specification )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==ON) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// CmisBaseQueryWalker.g:175:32: join_specification
					{
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_join_specification_in_table_join436);
					join_specification27=join_specification();
					state._fsp--;

					adaptor.addChild(root_1, join_specification27.getTree());

					}
					break;

			}

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}



			        boolean hasSpec = (join_specification27!=null?((CommonTree)join_specification27.getTree()):null) != null;
			        queryObj.addJoin((join_kind25!=null?((CmisEcmQueryWalker_CmisBaseQueryWalker.join_kind_return)join_kind25).kind:null), (one_table26!=null?((CmisEcmQueryWalker_CmisBaseQueryWalker.one_table_return)one_table26).alias:null), hasSpec);
			    
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
	// $ANTLR end "table_join"


	public static class one_table_return extends TreeRuleReturnScope {
		public String alias;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "one_table"
	// CmisBaseQueryWalker.g:182:1: one_table returns [String alias] : ^( TABLE table_name ( correlation_name )? ) {...}?;
	public final CmisEcmQueryWalker_CmisBaseQueryWalker.one_table_return one_table() throws RecognitionException {
		CmisEcmQueryWalker_CmisBaseQueryWalker.one_table_return retval = new CmisEcmQueryWalker_CmisBaseQueryWalker.one_table_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree TABLE28=null;
		TreeRuleReturnScope table_name29 =null;
		TreeRuleReturnScope correlation_name30 =null;

		CommonTree TABLE28_tree=null;

		try {
			// CmisBaseQueryWalker.g:182:33: ( ^( TABLE table_name ( correlation_name )? ) {...}?)
			// CmisBaseQueryWalker.g:183:5: ^( TABLE table_name ( correlation_name )? ) {...}?
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			TABLE28=(CommonTree)match(input,TABLE,FOLLOW_TABLE_in_one_table465); 
			TABLE28_tree = (CommonTree)adaptor.dupNode(TABLE28);


			root_1 = (CommonTree)adaptor.becomeRoot(TABLE28_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_table_name_in_one_table467);
			table_name29=table_name();
			state._fsp--;

			adaptor.addChild(root_1, table_name29.getTree());

			// CmisBaseQueryWalker.g:183:24: ( correlation_name )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==ID) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// CmisBaseQueryWalker.g:183:24: correlation_name
					{
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_correlation_name_in_one_table469);
					correlation_name30=correlation_name();
					state._fsp--;

					adaptor.addChild(root_1, correlation_name30.getTree());

					}
					break;

			}

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			if ( !((
			          (retval.alias = queryObj.addType((correlation_name30!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(correlation_name30.start),input.getTreeAdaptor().getTokenStopIndex(correlation_name30.start))):null), (table_name29!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(table_name29.start),input.getTreeAdaptor().getTokenStopIndex(table_name29.start))):null))) != null
			      )) ) {
				throw new FailedPredicateException(input, "one_table", "\r\n          ($alias = queryObj.addType($correlation_name.text, $table_name.text)) != null\r\n      ");
			}
			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (FailedPredicateException e) {

			        // change default text to preserved text which is useful
			        e.predicateText = queryObj.getErrorMessage();
			        throw e;
			    
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "one_table"


	public static class join_kind_return extends TreeRuleReturnScope {
		public String kind;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "join_kind"
	// CmisBaseQueryWalker.g:195:1: join_kind returns [String kind] : ( INNER | LEFT | RIGHT );
	public final CmisEcmQueryWalker_CmisBaseQueryWalker.join_kind_return join_kind() throws RecognitionException {
		CmisEcmQueryWalker_CmisBaseQueryWalker.join_kind_return retval = new CmisEcmQueryWalker_CmisBaseQueryWalker.join_kind_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree INNER31=null;
		CommonTree LEFT32=null;
		CommonTree RIGHT33=null;

		CommonTree INNER31_tree=null;
		CommonTree LEFT32_tree=null;
		CommonTree RIGHT33_tree=null;

		try {
			// CmisBaseQueryWalker.g:195:32: ( INNER | LEFT | RIGHT )
			int alt12=3;
			switch ( input.LA(1) ) {
			case INNER:
				{
				alt12=1;
				}
				break;
			case LEFT:
				{
				alt12=2;
				}
				break;
			case RIGHT:
				{
				alt12=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}
			switch (alt12) {
				case 1 :
					// CmisBaseQueryWalker.g:196:7: INNER
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					INNER31=(CommonTree)match(input,INNER,FOLLOW_INNER_in_join_kind514); 
					INNER31_tree = (CommonTree)adaptor.dupNode(INNER31);


					adaptor.addChild(root_0, INNER31_tree);

					 retval.kind = "INNER"; 
					}
					break;
				case 2 :
					// CmisBaseQueryWalker.g:197:7: LEFT
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					LEFT32=(CommonTree)match(input,LEFT,FOLLOW_LEFT_in_join_kind524); 
					LEFT32_tree = (CommonTree)adaptor.dupNode(LEFT32);


					adaptor.addChild(root_0, LEFT32_tree);

					 retval.kind = "LEFT"; 
					}
					break;
				case 3 :
					// CmisBaseQueryWalker.g:198:7: RIGHT
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					RIGHT33=(CommonTree)match(input,RIGHT,FOLLOW_RIGHT_in_join_kind535); 
					RIGHT33_tree = (CommonTree)adaptor.dupNode(RIGHT33);


					adaptor.addChild(root_0, RIGHT33_tree);

					 retval.kind = "RIGHT"; 
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
	// $ANTLR end "join_kind"


	public static class join_specification_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "join_specification"
	// CmisBaseQueryWalker.g:201:1: join_specification : ^( ON cr1= column_reference EQ cr2= column_reference ) ;
	public final CmisEcmQueryWalker_CmisBaseQueryWalker.join_specification_return join_specification() throws RecognitionException {
		CmisEcmQueryWalker_CmisBaseQueryWalker.join_specification_return retval = new CmisEcmQueryWalker_CmisBaseQueryWalker.join_specification_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree ON34=null;
		CommonTree EQ35=null;
		TreeRuleReturnScope cr1 =null;
		TreeRuleReturnScope cr2 =null;

		CommonTree ON34_tree=null;
		CommonTree EQ35_tree=null;

		try {
			// CmisBaseQueryWalker.g:201:19: ( ^( ON cr1= column_reference EQ cr2= column_reference ) )
			// CmisBaseQueryWalker.g:202:5: ^( ON cr1= column_reference EQ cr2= column_reference )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			ON34=(CommonTree)match(input,ON,FOLLOW_ON_in_join_specification554); 
			ON34_tree = (CommonTree)adaptor.dupNode(ON34);


			root_1 = (CommonTree)adaptor.becomeRoot(ON34_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_column_reference_in_join_specification558);
			cr1=column_reference();
			state._fsp--;

			adaptor.addChild(root_1, cr1.getTree());

			_last = (CommonTree)input.LT(1);
			EQ35=(CommonTree)match(input,EQ,FOLLOW_EQ_in_join_specification560); 
			EQ35_tree = (CommonTree)adaptor.dupNode(EQ35);


			adaptor.addChild(root_1, EQ35_tree);

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_column_reference_in_join_specification564);
			cr2=column_reference();
			state._fsp--;

			adaptor.addChild(root_1, cr2.getTree());

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}



			        queryObj.addJoinReference((cr1!=null?((CommonTree)cr1.start):null), (cr1!=null?((CmisEcmQueryWalker_CmisBaseQueryWalker.column_reference_return)cr1).result:null));
			        queryObj.addJoinReference((cr2!=null?((CommonTree)cr2.start):null), (cr2!=null?((CmisEcmQueryWalker_CmisBaseQueryWalker.column_reference_return)cr2).result:null));
			    
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
	// $ANTLR end "join_specification"


	public static class where_clause_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "where_clause"
	// CmisBaseQueryWalker.g:209:1: where_clause : ( ^( WHERE search_condition ) |);
	public final CmisEcmQueryWalker_CmisBaseQueryWalker.where_clause_return where_clause() throws RecognitionException {
		CmisEcmQueryWalker_CmisBaseQueryWalker.where_clause_return retval = new CmisEcmQueryWalker_CmisBaseQueryWalker.where_clause_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree WHERE36=null;
		TreeRuleReturnScope search_condition37 =null;

		CommonTree WHERE36_tree=null;

		try {
			// CmisBaseQueryWalker.g:209:13: ( ^( WHERE search_condition ) |)
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==WHERE) ) {
				alt13=1;
			}
			else if ( (LA13_0==UP) ) {
				alt13=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// CmisBaseQueryWalker.g:210:7: ^( WHERE search_condition )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					WHERE36=(CommonTree)match(input,WHERE,FOLLOW_WHERE_in_where_clause590); 
					WHERE36_tree = (CommonTree)adaptor.dupNode(WHERE36);


					root_1 = (CommonTree)adaptor.becomeRoot(WHERE36_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_search_condition_in_where_clause592);
					search_condition37=search_condition();
					state._fsp--;

					adaptor.addChild(root_1, search_condition37.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 2 :
					// CmisBaseQueryWalker.g:212:5: 
					{
					root_0 = (CommonTree)adaptor.nil();


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
	// $ANTLR end "where_clause"


	public static class search_condition_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "search_condition"
	// CmisBaseQueryWalker.g:214:1: search_condition : ( ^( OR s1= search_condition s2= search_condition ) | ^( AND s1= search_condition s2= search_condition ) | ^( NOT search_condition ) | ^( EQ search_condition search_condition ) | ^( NEQ search_condition search_condition ) | ^( LT search_condition search_condition ) | ^( GT search_condition search_condition ) | ^( GTEQ search_condition search_condition ) | ^( LTEQ search_condition search_condition ) | ^( LIKE search_condition search_condition ) | ^( NOT_LIKE search_condition search_condition ) | ^( IS_NULL search_condition ) | ^( IS_NOT_NULL search_condition ) | ^( EQ_ANY literal mvcr= multi_valued_column_reference ) | ^( IN_ANY mvcr= multi_valued_column_reference in_value_list ) | ^( NOT_IN_ANY mvcr= multi_valued_column_reference in_value_list ) | ^( CONTAINS ( qualifier )? text_search_expression ) | ^( IN_FOLDER ( qualifier )? search_condition ) | ^( IN_TREE ( qualifier )? search_condition ) | ^( IN column_reference in_value_list ) | ^( NOT_IN column_reference in_value_list ) | column_reference | literal );
	public final CmisEcmQueryWalker_CmisBaseQueryWalker.search_condition_return search_condition() throws RecognitionException {
		CmisEcmQueryWalker_CmisBaseQueryWalker.search_condition_return retval = new CmisEcmQueryWalker_CmisBaseQueryWalker.search_condition_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree OR38=null;
		CommonTree AND39=null;
		CommonTree NOT40=null;
		CommonTree EQ42=null;
		CommonTree NEQ45=null;
		CommonTree LT48=null;
		CommonTree GT51=null;
		CommonTree GTEQ54=null;
		CommonTree LTEQ57=null;
		CommonTree LIKE60=null;
		CommonTree NOT_LIKE63=null;
		CommonTree IS_NULL66=null;
		CommonTree IS_NOT_NULL68=null;
		CommonTree EQ_ANY70=null;
		CommonTree IN_ANY72=null;
		CommonTree NOT_IN_ANY74=null;
		CommonTree CONTAINS76=null;
		CommonTree IN_FOLDER79=null;
		CommonTree IN_TREE82=null;
		CommonTree IN85=null;
		CommonTree NOT_IN88=null;
		TreeRuleReturnScope s1 =null;
		TreeRuleReturnScope s2 =null;
		TreeRuleReturnScope mvcr =null;
		TreeRuleReturnScope search_condition41 =null;
		TreeRuleReturnScope search_condition43 =null;
		TreeRuleReturnScope search_condition44 =null;
		TreeRuleReturnScope search_condition46 =null;
		TreeRuleReturnScope search_condition47 =null;
		TreeRuleReturnScope search_condition49 =null;
		TreeRuleReturnScope search_condition50 =null;
		TreeRuleReturnScope search_condition52 =null;
		TreeRuleReturnScope search_condition53 =null;
		TreeRuleReturnScope search_condition55 =null;
		TreeRuleReturnScope search_condition56 =null;
		TreeRuleReturnScope search_condition58 =null;
		TreeRuleReturnScope search_condition59 =null;
		TreeRuleReturnScope search_condition61 =null;
		TreeRuleReturnScope search_condition62 =null;
		TreeRuleReturnScope search_condition64 =null;
		TreeRuleReturnScope search_condition65 =null;
		TreeRuleReturnScope search_condition67 =null;
		TreeRuleReturnScope search_condition69 =null;
		TreeRuleReturnScope literal71 =null;
		TreeRuleReturnScope in_value_list73 =null;
		TreeRuleReturnScope in_value_list75 =null;
		TreeRuleReturnScope qualifier77 =null;
		TreeRuleReturnScope text_search_expression78 =null;
		TreeRuleReturnScope qualifier80 =null;
		TreeRuleReturnScope search_condition81 =null;
		TreeRuleReturnScope qualifier83 =null;
		TreeRuleReturnScope search_condition84 =null;
		TreeRuleReturnScope column_reference86 =null;
		TreeRuleReturnScope in_value_list87 =null;
		TreeRuleReturnScope column_reference89 =null;
		TreeRuleReturnScope in_value_list90 =null;
		TreeRuleReturnScope column_reference91 =null;
		TreeRuleReturnScope literal92 =null;

		CommonTree OR38_tree=null;
		CommonTree AND39_tree=null;
		CommonTree NOT40_tree=null;
		CommonTree EQ42_tree=null;
		CommonTree NEQ45_tree=null;
		CommonTree LT48_tree=null;
		CommonTree GT51_tree=null;
		CommonTree GTEQ54_tree=null;
		CommonTree LTEQ57_tree=null;
		CommonTree LIKE60_tree=null;
		CommonTree NOT_LIKE63_tree=null;
		CommonTree IS_NULL66_tree=null;
		CommonTree IS_NOT_NULL68_tree=null;
		CommonTree EQ_ANY70_tree=null;
		CommonTree IN_ANY72_tree=null;
		CommonTree NOT_IN_ANY74_tree=null;
		CommonTree CONTAINS76_tree=null;
		CommonTree IN_FOLDER79_tree=null;
		CommonTree IN_TREE82_tree=null;
		CommonTree IN85_tree=null;
		CommonTree NOT_IN88_tree=null;


		    List<Object> listLiterals;

		try {
			// CmisBaseQueryWalker.g:217:2: ( ^( OR s1= search_condition s2= search_condition ) | ^( AND s1= search_condition s2= search_condition ) | ^( NOT search_condition ) | ^( EQ search_condition search_condition ) | ^( NEQ search_condition search_condition ) | ^( LT search_condition search_condition ) | ^( GT search_condition search_condition ) | ^( GTEQ search_condition search_condition ) | ^( LTEQ search_condition search_condition ) | ^( LIKE search_condition search_condition ) | ^( NOT_LIKE search_condition search_condition ) | ^( IS_NULL search_condition ) | ^( IS_NOT_NULL search_condition ) | ^( EQ_ANY literal mvcr= multi_valued_column_reference ) | ^( IN_ANY mvcr= multi_valued_column_reference in_value_list ) | ^( NOT_IN_ANY mvcr= multi_valued_column_reference in_value_list ) | ^( CONTAINS ( qualifier )? text_search_expression ) | ^( IN_FOLDER ( qualifier )? search_condition ) | ^( IN_TREE ( qualifier )? search_condition ) | ^( IN column_reference in_value_list ) | ^( NOT_IN column_reference in_value_list ) | column_reference | literal )
			int alt17=23;
			switch ( input.LA(1) ) {
			case OR:
				{
				alt17=1;
				}
				break;
			case AND:
				{
				alt17=2;
				}
				break;
			case NOT:
				{
				alt17=3;
				}
				break;
			case EQ:
				{
				alt17=4;
				}
				break;
			case NEQ:
				{
				alt17=5;
				}
				break;
			case LT:
				{
				alt17=6;
				}
				break;
			case GT:
				{
				alt17=7;
				}
				break;
			case GTEQ:
				{
				alt17=8;
				}
				break;
			case LTEQ:
				{
				alt17=9;
				}
				break;
			case LIKE:
				{
				alt17=10;
				}
				break;
			case NOT_LIKE:
				{
				alt17=11;
				}
				break;
			case IS_NULL:
				{
				alt17=12;
				}
				break;
			case IS_NOT_NULL:
				{
				alt17=13;
				}
				break;
			case EQ_ANY:
				{
				alt17=14;
				}
				break;
			case IN_ANY:
				{
				alt17=15;
				}
				break;
			case NOT_IN_ANY:
				{
				alt17=16;
				}
				break;
			case CONTAINS:
				{
				alt17=17;
				}
				break;
			case IN_FOLDER:
				{
				alt17=18;
				}
				break;
			case IN_TREE:
				{
				alt17=19;
				}
				break;
			case IN:
				{
				alt17=20;
				}
				break;
			case NOT_IN:
				{
				alt17=21;
				}
				break;
			case COL:
				{
				alt17=22;
				}
				break;
			case BOOL_LIT:
			case NUM_LIT:
			case STRING_LIT:
			case TIME_LIT:
				{
				alt17=23;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}
			switch (alt17) {
				case 1 :
					// CmisBaseQueryWalker.g:218:5: ^( OR s1= search_condition s2= search_condition )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					OR38=(CommonTree)match(input,OR,FOLLOW_OR_in_search_condition623); 
					OR38_tree = (CommonTree)adaptor.dupNode(OR38);


					root_1 = (CommonTree)adaptor.becomeRoot(OR38_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_search_condition_in_search_condition627);
					s1=search_condition();
					state._fsp--;

					adaptor.addChild(root_1, s1.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_search_condition_in_search_condition631);
					s2=search_condition();
					state._fsp--;

					adaptor.addChild(root_1, s2.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 2 :
					// CmisBaseQueryWalker.g:219:7: ^( AND s1= search_condition s2= search_condition )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					AND39=(CommonTree)match(input,AND,FOLLOW_AND_in_search_condition641); 
					AND39_tree = (CommonTree)adaptor.dupNode(AND39);


					root_1 = (CommonTree)adaptor.becomeRoot(AND39_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_search_condition_in_search_condition645);
					s1=search_condition();
					state._fsp--;

					adaptor.addChild(root_1, s1.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_search_condition_in_search_condition649);
					s2=search_condition();
					state._fsp--;

					adaptor.addChild(root_1, s2.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 3 :
					// CmisBaseQueryWalker.g:220:7: ^( NOT search_condition )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					NOT40=(CommonTree)match(input,NOT,FOLLOW_NOT_in_search_condition659); 
					NOT40_tree = (CommonTree)adaptor.dupNode(NOT40);


					root_1 = (CommonTree)adaptor.becomeRoot(NOT40_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_search_condition_in_search_condition661);
					search_condition41=search_condition();
					state._fsp--;

					adaptor.addChild(root_1, search_condition41.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 4 :
					// CmisBaseQueryWalker.g:221:7: ^( EQ search_condition search_condition )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					EQ42=(CommonTree)match(input,EQ,FOLLOW_EQ_in_search_condition671); 
					EQ42_tree = (CommonTree)adaptor.dupNode(EQ42);


					root_1 = (CommonTree)adaptor.becomeRoot(EQ42_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_search_condition_in_search_condition673);
					search_condition43=search_condition();
					state._fsp--;

					adaptor.addChild(root_1, search_condition43.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_search_condition_in_search_condition675);
					search_condition44=search_condition();
					state._fsp--;

					adaptor.addChild(root_1, search_condition44.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 5 :
					// CmisBaseQueryWalker.g:222:7: ^( NEQ search_condition search_condition )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					NEQ45=(CommonTree)match(input,NEQ,FOLLOW_NEQ_in_search_condition685); 
					NEQ45_tree = (CommonTree)adaptor.dupNode(NEQ45);


					root_1 = (CommonTree)adaptor.becomeRoot(NEQ45_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_search_condition_in_search_condition687);
					search_condition46=search_condition();
					state._fsp--;

					adaptor.addChild(root_1, search_condition46.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_search_condition_in_search_condition689);
					search_condition47=search_condition();
					state._fsp--;

					adaptor.addChild(root_1, search_condition47.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 6 :
					// CmisBaseQueryWalker.g:223:7: ^( LT search_condition search_condition )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					LT48=(CommonTree)match(input,LT,FOLLOW_LT_in_search_condition699); 
					LT48_tree = (CommonTree)adaptor.dupNode(LT48);


					root_1 = (CommonTree)adaptor.becomeRoot(LT48_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_search_condition_in_search_condition701);
					search_condition49=search_condition();
					state._fsp--;

					adaptor.addChild(root_1, search_condition49.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_search_condition_in_search_condition703);
					search_condition50=search_condition();
					state._fsp--;

					adaptor.addChild(root_1, search_condition50.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 7 :
					// CmisBaseQueryWalker.g:224:7: ^( GT search_condition search_condition )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					GT51=(CommonTree)match(input,GT,FOLLOW_GT_in_search_condition713); 
					GT51_tree = (CommonTree)adaptor.dupNode(GT51);


					root_1 = (CommonTree)adaptor.becomeRoot(GT51_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_search_condition_in_search_condition715);
					search_condition52=search_condition();
					state._fsp--;

					adaptor.addChild(root_1, search_condition52.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_search_condition_in_search_condition717);
					search_condition53=search_condition();
					state._fsp--;

					adaptor.addChild(root_1, search_condition53.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 8 :
					// CmisBaseQueryWalker.g:225:7: ^( GTEQ search_condition search_condition )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					GTEQ54=(CommonTree)match(input,GTEQ,FOLLOW_GTEQ_in_search_condition727); 
					GTEQ54_tree = (CommonTree)adaptor.dupNode(GTEQ54);


					root_1 = (CommonTree)adaptor.becomeRoot(GTEQ54_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_search_condition_in_search_condition729);
					search_condition55=search_condition();
					state._fsp--;

					adaptor.addChild(root_1, search_condition55.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_search_condition_in_search_condition731);
					search_condition56=search_condition();
					state._fsp--;

					adaptor.addChild(root_1, search_condition56.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 9 :
					// CmisBaseQueryWalker.g:226:7: ^( LTEQ search_condition search_condition )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					LTEQ57=(CommonTree)match(input,LTEQ,FOLLOW_LTEQ_in_search_condition741); 
					LTEQ57_tree = (CommonTree)adaptor.dupNode(LTEQ57);


					root_1 = (CommonTree)adaptor.becomeRoot(LTEQ57_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_search_condition_in_search_condition743);
					search_condition58=search_condition();
					state._fsp--;

					adaptor.addChild(root_1, search_condition58.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_search_condition_in_search_condition745);
					search_condition59=search_condition();
					state._fsp--;

					adaptor.addChild(root_1, search_condition59.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 10 :
					// CmisBaseQueryWalker.g:227:7: ^( LIKE search_condition search_condition )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					LIKE60=(CommonTree)match(input,LIKE,FOLLOW_LIKE_in_search_condition755); 
					LIKE60_tree = (CommonTree)adaptor.dupNode(LIKE60);


					root_1 = (CommonTree)adaptor.becomeRoot(LIKE60_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_search_condition_in_search_condition757);
					search_condition61=search_condition();
					state._fsp--;

					adaptor.addChild(root_1, search_condition61.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_search_condition_in_search_condition759);
					search_condition62=search_condition();
					state._fsp--;

					adaptor.addChild(root_1, search_condition62.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 11 :
					// CmisBaseQueryWalker.g:228:7: ^( NOT_LIKE search_condition search_condition )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					NOT_LIKE63=(CommonTree)match(input,NOT_LIKE,FOLLOW_NOT_LIKE_in_search_condition769); 
					NOT_LIKE63_tree = (CommonTree)adaptor.dupNode(NOT_LIKE63);


					root_1 = (CommonTree)adaptor.becomeRoot(NOT_LIKE63_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_search_condition_in_search_condition771);
					search_condition64=search_condition();
					state._fsp--;

					adaptor.addChild(root_1, search_condition64.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_search_condition_in_search_condition773);
					search_condition65=search_condition();
					state._fsp--;

					adaptor.addChild(root_1, search_condition65.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 12 :
					// CmisBaseQueryWalker.g:229:7: ^( IS_NULL search_condition )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					IS_NULL66=(CommonTree)match(input,IS_NULL,FOLLOW_IS_NULL_in_search_condition783); 
					IS_NULL66_tree = (CommonTree)adaptor.dupNode(IS_NULL66);


					root_1 = (CommonTree)adaptor.becomeRoot(IS_NULL66_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_search_condition_in_search_condition785);
					search_condition67=search_condition();
					state._fsp--;

					adaptor.addChild(root_1, search_condition67.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 13 :
					// CmisBaseQueryWalker.g:230:7: ^( IS_NOT_NULL search_condition )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					IS_NOT_NULL68=(CommonTree)match(input,IS_NOT_NULL,FOLLOW_IS_NOT_NULL_in_search_condition795); 
					IS_NOT_NULL68_tree = (CommonTree)adaptor.dupNode(IS_NOT_NULL68);


					root_1 = (CommonTree)adaptor.becomeRoot(IS_NOT_NULL68_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_search_condition_in_search_condition797);
					search_condition69=search_condition();
					state._fsp--;

					adaptor.addChild(root_1, search_condition69.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 14 :
					// CmisBaseQueryWalker.g:231:7: ^( EQ_ANY literal mvcr= multi_valued_column_reference )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					EQ_ANY70=(CommonTree)match(input,EQ_ANY,FOLLOW_EQ_ANY_in_search_condition807); 
					EQ_ANY70_tree = (CommonTree)adaptor.dupNode(EQ_ANY70);


					root_1 = (CommonTree)adaptor.becomeRoot(EQ_ANY70_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_literal_in_search_condition809);
					literal71=literal();
					state._fsp--;

					adaptor.addChild(root_1, literal71.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_multi_valued_column_reference_in_search_condition813);
					mvcr=multi_valued_column_reference();
					state._fsp--;

					adaptor.addChild(root_1, mvcr.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					            queryObj.addWhereReference((mvcr!=null?((CommonTree)mvcr.start):null), (mvcr!=null?((CmisEcmQueryWalker_CmisBaseQueryWalker.multi_valued_column_reference_return)mvcr).result:null));
					      
					}
					break;
				case 15 :
					// CmisBaseQueryWalker.g:235:7: ^( IN_ANY mvcr= multi_valued_column_reference in_value_list )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					IN_ANY72=(CommonTree)match(input,IN_ANY,FOLLOW_IN_ANY_in_search_condition831); 
					IN_ANY72_tree = (CommonTree)adaptor.dupNode(IN_ANY72);


					root_1 = (CommonTree)adaptor.becomeRoot(IN_ANY72_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_multi_valued_column_reference_in_search_condition835);
					mvcr=multi_valued_column_reference();
					state._fsp--;

					adaptor.addChild(root_1, mvcr.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_in_value_list_in_search_condition837);
					in_value_list73=in_value_list();
					state._fsp--;

					adaptor.addChild(root_1, in_value_list73.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					            queryObj.addWhereReference((mvcr!=null?((CommonTree)mvcr.start):null), (mvcr!=null?((CmisEcmQueryWalker_CmisBaseQueryWalker.multi_valued_column_reference_return)mvcr).result:null));
					      
					}
					break;
				case 16 :
					// CmisBaseQueryWalker.g:239:7: ^( NOT_IN_ANY mvcr= multi_valued_column_reference in_value_list )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					NOT_IN_ANY74=(CommonTree)match(input,NOT_IN_ANY,FOLLOW_NOT_IN_ANY_in_search_condition856); 
					NOT_IN_ANY74_tree = (CommonTree)adaptor.dupNode(NOT_IN_ANY74);


					root_1 = (CommonTree)adaptor.becomeRoot(NOT_IN_ANY74_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_multi_valued_column_reference_in_search_condition860);
					mvcr=multi_valued_column_reference();
					state._fsp--;

					adaptor.addChild(root_1, mvcr.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_in_value_list_in_search_condition862);
					in_value_list75=in_value_list();
					state._fsp--;

					adaptor.addChild(root_1, in_value_list75.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					            queryObj.addWhereReference((mvcr!=null?((CommonTree)mvcr.start):null), (mvcr!=null?((CmisEcmQueryWalker_CmisBaseQueryWalker.multi_valued_column_reference_return)mvcr).result:null));
					      
					}
					break;
				case 17 :
					// CmisBaseQueryWalker.g:243:7: ^( CONTAINS ( qualifier )? text_search_expression )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					CONTAINS76=(CommonTree)match(input,CONTAINS,FOLLOW_CONTAINS_in_search_condition880); 
					CONTAINS76_tree = (CommonTree)adaptor.dupNode(CONTAINS76);


					root_1 = (CommonTree)adaptor.becomeRoot(CONTAINS76_tree, root_1);

					match(input, Token.DOWN, null); 
					// CmisBaseQueryWalker.g:243:18: ( qualifier )?
					int alt14=2;
					int LA14_0 = input.LA(1);
					if ( (LA14_0==ID) ) {
						alt14=1;
					}
					switch (alt14) {
						case 1 :
							// CmisBaseQueryWalker.g:243:18: qualifier
							{
							_last = (CommonTree)input.LT(1);
							pushFollow(FOLLOW_qualifier_in_search_condition882);
							qualifier77=qualifier();
							state._fsp--;

							adaptor.addChild(root_1, qualifier77.getTree());

							}
							break;

					}

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_text_search_expression_in_search_condition885);
					text_search_expression78=text_search_expression();
					state._fsp--;

					adaptor.addChild(root_1, text_search_expression78.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					            queryObj.addWhereTypeReference((qualifier77!=null?((CommonTree)qualifier77.start):null), (qualifier77!=null?((CmisEcmQueryWalker_CmisBaseQueryWalker.qualifier_return)qualifier77).value:null));
					      
					}
					break;
				case 18 :
					// CmisBaseQueryWalker.g:247:7: ^( IN_FOLDER ( qualifier )? search_condition )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					IN_FOLDER79=(CommonTree)match(input,IN_FOLDER,FOLLOW_IN_FOLDER_in_search_condition903); 
					IN_FOLDER79_tree = (CommonTree)adaptor.dupNode(IN_FOLDER79);


					root_1 = (CommonTree)adaptor.becomeRoot(IN_FOLDER79_tree, root_1);

					match(input, Token.DOWN, null); 
					// CmisBaseQueryWalker.g:247:19: ( qualifier )?
					int alt15=2;
					int LA15_0 = input.LA(1);
					if ( (LA15_0==ID) ) {
						alt15=1;
					}
					switch (alt15) {
						case 1 :
							// CmisBaseQueryWalker.g:247:19: qualifier
							{
							_last = (CommonTree)input.LT(1);
							pushFollow(FOLLOW_qualifier_in_search_condition905);
							qualifier80=qualifier();
							state._fsp--;

							adaptor.addChild(root_1, qualifier80.getTree());

							}
							break;

					}

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_search_condition_in_search_condition908);
					search_condition81=search_condition();
					state._fsp--;

					adaptor.addChild(root_1, search_condition81.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					            queryObj.addWhereTypeReference((qualifier80!=null?((CommonTree)qualifier80.start):null), (qualifier80!=null?((CmisEcmQueryWalker_CmisBaseQueryWalker.qualifier_return)qualifier80).value:null));
					      
					}
					break;
				case 19 :
					// CmisBaseQueryWalker.g:251:7: ^( IN_TREE ( qualifier )? search_condition )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					IN_TREE82=(CommonTree)match(input,IN_TREE,FOLLOW_IN_TREE_in_search_condition926); 
					IN_TREE82_tree = (CommonTree)adaptor.dupNode(IN_TREE82);


					root_1 = (CommonTree)adaptor.becomeRoot(IN_TREE82_tree, root_1);

					match(input, Token.DOWN, null); 
					// CmisBaseQueryWalker.g:251:17: ( qualifier )?
					int alt16=2;
					int LA16_0 = input.LA(1);
					if ( (LA16_0==ID) ) {
						alt16=1;
					}
					switch (alt16) {
						case 1 :
							// CmisBaseQueryWalker.g:251:17: qualifier
							{
							_last = (CommonTree)input.LT(1);
							pushFollow(FOLLOW_qualifier_in_search_condition928);
							qualifier83=qualifier();
							state._fsp--;

							adaptor.addChild(root_1, qualifier83.getTree());

							}
							break;

					}

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_search_condition_in_search_condition931);
					search_condition84=search_condition();
					state._fsp--;

					adaptor.addChild(root_1, search_condition84.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					            queryObj.addWhereTypeReference((qualifier83!=null?((CommonTree)qualifier83.start):null), (qualifier83!=null?((CmisEcmQueryWalker_CmisBaseQueryWalker.qualifier_return)qualifier83).value:null));
					      
					}
					break;
				case 20 :
					// CmisBaseQueryWalker.g:255:7: ^( IN column_reference in_value_list )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					IN85=(CommonTree)match(input,IN,FOLLOW_IN_in_search_condition949); 
					IN85_tree = (CommonTree)adaptor.dupNode(IN85);


					root_1 = (CommonTree)adaptor.becomeRoot(IN85_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_column_reference_in_search_condition951);
					column_reference86=column_reference();
					state._fsp--;

					adaptor.addChild(root_1, column_reference86.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_in_value_list_in_search_condition953);
					in_value_list87=in_value_list();
					state._fsp--;

					adaptor.addChild(root_1, in_value_list87.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					            queryObj.addWhereReference((column_reference86!=null?((CommonTree)column_reference86.start):null), (column_reference86!=null?((CmisEcmQueryWalker_CmisBaseQueryWalker.column_reference_return)column_reference86).result:null));
					      
					}
					break;
				case 21 :
					// CmisBaseQueryWalker.g:259:7: ^( NOT_IN column_reference in_value_list )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					NOT_IN88=(CommonTree)match(input,NOT_IN,FOLLOW_NOT_IN_in_search_condition971); 
					NOT_IN88_tree = (CommonTree)adaptor.dupNode(NOT_IN88);


					root_1 = (CommonTree)adaptor.becomeRoot(NOT_IN88_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_column_reference_in_search_condition973);
					column_reference89=column_reference();
					state._fsp--;

					adaptor.addChild(root_1, column_reference89.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_in_value_list_in_search_condition975);
					in_value_list90=in_value_list();
					state._fsp--;

					adaptor.addChild(root_1, in_value_list90.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					            queryObj.addWhereReference((column_reference89!=null?((CommonTree)column_reference89.start):null), (column_reference89!=null?((CmisEcmQueryWalker_CmisBaseQueryWalker.column_reference_return)column_reference89).result:null));
					      
					}
					break;
				case 22 :
					// CmisBaseQueryWalker.g:263:7: column_reference
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_column_reference_in_search_condition992);
					column_reference91=column_reference();
					state._fsp--;

					adaptor.addChild(root_0, column_reference91.getTree());


					          queryObj.addWhereReference((column_reference91!=null?((CommonTree)column_reference91.start):null), (column_reference91!=null?((CmisEcmQueryWalker_CmisBaseQueryWalker.column_reference_return)column_reference91).result:null));
					      
					}
					break;
				case 23 :
					// CmisBaseQueryWalker.g:267:7: literal
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_literal_in_search_condition1008);
					literal92=literal();
					state._fsp--;

					adaptor.addChild(root_0, literal92.getTree());

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
	// $ANTLR end "search_condition"


	public static class in_value_list_return extends TreeRuleReturnScope {
		public Object inList;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "in_value_list"
	// CmisBaseQueryWalker.g:270:1: in_value_list returns [Object inList] : ^( IN_LIST (l= literal )+ ) ;
	public final CmisEcmQueryWalker_CmisBaseQueryWalker.in_value_list_return in_value_list() throws RecognitionException {
		CmisEcmQueryWalker_CmisBaseQueryWalker.in_value_list_return retval = new CmisEcmQueryWalker_CmisBaseQueryWalker.in_value_list_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree IN_LIST93=null;
		TreeRuleReturnScope l =null;

		CommonTree IN_LIST93_tree=null;


		    List<Object> inLiterals = new ArrayList<Object>();

		try {
			// CmisBaseQueryWalker.g:273:2: ( ^( IN_LIST (l= literal )+ ) )
			// CmisBaseQueryWalker.g:274:5: ^( IN_LIST (l= literal )+ )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			IN_LIST93=(CommonTree)match(input,IN_LIST,FOLLOW_IN_LIST_in_in_value_list1034); 
			IN_LIST93_tree = (CommonTree)adaptor.dupNode(IN_LIST93);


			root_1 = (CommonTree)adaptor.becomeRoot(IN_LIST93_tree, root_1);

			match(input, Token.DOWN, null); 
			// CmisBaseQueryWalker.g:274:15: (l= literal )+
			int cnt18=0;
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==BOOL_LIT||LA18_0==NUM_LIT||LA18_0==STRING_LIT||LA18_0==TIME_LIT) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// CmisBaseQueryWalker.g:274:16: l= literal
					{
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_literal_in_in_value_list1039);
					l=literal();
					state._fsp--;

					adaptor.addChild(root_1, l.getTree());

					inLiterals.add((l!=null?((CmisEcmQueryWalker_CmisBaseQueryWalker.literal_return)l).value:null));
					}
					break;

				default :
					if ( cnt18 >= 1 ) break loop18;
					EarlyExitException eee = new EarlyExitException(18, input);
					throw eee;
				}
				cnt18++;
			}

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}



			        retval.inList = inLiterals;
			    
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
	// $ANTLR end "in_value_list"


	public static class text_search_expression_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "text_search_expression"
	// CmisBaseQueryWalker.g:280:1: text_search_expression : STRING_LIT ;
	public final CmisEcmQueryWalker_CmisBaseQueryWalker.text_search_expression_return text_search_expression() throws RecognitionException {
		CmisEcmQueryWalker_CmisBaseQueryWalker.text_search_expression_return retval = new CmisEcmQueryWalker_CmisBaseQueryWalker.text_search_expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree STRING_LIT94=null;

		CommonTree STRING_LIT94_tree=null;


		    CommonTree tse = null;

		try {
			// CmisBaseQueryWalker.g:288:3: ( STRING_LIT )
			// CmisBaseQueryWalker.g:289:5: STRING_LIT
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			STRING_LIT94=(CommonTree)match(input,STRING_LIT,FOLLOW_STRING_LIT_in_text_search_expression1078); 
			STRING_LIT94_tree = (CommonTree)adaptor.dupNode(STRING_LIT94);


			adaptor.addChild(root_0, STRING_LIT94_tree);


			        if (doFullTextParse) {
			            tse = parseTextSearchPredicate((STRING_LIT94!=null?STRING_LIT94.getText():null));
			        }
			    
			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);


			   if (doFullTextParse) {
			       retval.tree = tse;
			   }

		}

		    catch (RecognitionException e) {
		        throw e;
		    }

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "text_search_expression"


	public static class literal_return extends TreeRuleReturnScope {
		public Object value;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "literal"
	// CmisBaseQueryWalker.g:298:1: literal returns [Object value] : ( NUM_LIT | STRING_LIT | TIME_LIT | BOOL_LIT );
	public final CmisEcmQueryWalker_CmisBaseQueryWalker.literal_return literal() throws RecognitionException {
		CmisEcmQueryWalker_CmisBaseQueryWalker.literal_return retval = new CmisEcmQueryWalker_CmisBaseQueryWalker.literal_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree NUM_LIT95=null;
		CommonTree STRING_LIT96=null;
		CommonTree TIME_LIT97=null;
		CommonTree BOOL_LIT98=null;

		CommonTree NUM_LIT95_tree=null;
		CommonTree STRING_LIT96_tree=null;
		CommonTree TIME_LIT97_tree=null;
		CommonTree BOOL_LIT98_tree=null;

		try {
			// CmisBaseQueryWalker.g:298:31: ( NUM_LIT | STRING_LIT | TIME_LIT | BOOL_LIT )
			int alt19=4;
			switch ( input.LA(1) ) {
			case NUM_LIT:
				{
				alt19=1;
				}
				break;
			case STRING_LIT:
				{
				alt19=2;
				}
				break;
			case TIME_LIT:
				{
				alt19=3;
				}
				break;
			case BOOL_LIT:
				{
				alt19=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}
			switch (alt19) {
				case 1 :
					// CmisBaseQueryWalker.g:299:7: NUM_LIT
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					NUM_LIT95=(CommonTree)match(input,NUM_LIT,FOLLOW_NUM_LIT_in_literal1107); 
					NUM_LIT95_tree = (CommonTree)adaptor.dupNode(NUM_LIT95);


					adaptor.addChild(root_0, NUM_LIT95_tree);


					            try {
					                retval.value = Long.valueOf((NUM_LIT95!=null?NUM_LIT95.getText():null));
					            } catch (NumberFormatException e) {
					                retval.value = new BigDecimal((NUM_LIT95!=null?NUM_LIT95.getText():null));
					            }
					        
					}
					break;
				case 2 :
					// CmisBaseQueryWalker.g:307:7: STRING_LIT
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					STRING_LIT96=(CommonTree)match(input,STRING_LIT,FOLLOW_STRING_LIT_in_literal1125); 
					STRING_LIT96_tree = (CommonTree)adaptor.dupNode(STRING_LIT96);


					adaptor.addChild(root_0, STRING_LIT96_tree);


					            String s = (STRING_LIT96!=null?STRING_LIT96.getText():null);
					            retval.value = s!= null ? s.substring(1, s.length() - 1) : null;
					        
					}
					break;
				case 3 :
					// CmisBaseQueryWalker.g:312:7: TIME_LIT
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					TIME_LIT97=(CommonTree)match(input,TIME_LIT,FOLLOW_TIME_LIT_in_literal1143); 
					TIME_LIT97_tree = (CommonTree)adaptor.dupNode(TIME_LIT97);


					adaptor.addChild(root_0, TIME_LIT97_tree);


					            String s = (TIME_LIT97!=null?TIME_LIT97.getText():null);
					            s = s!= null ? s.substring(s.indexOf('\'') + 1, s.length() - 1) : null;
					        
					}
					break;
				case 4 :
					// CmisBaseQueryWalker.g:317:7: BOOL_LIT
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					BOOL_LIT98=(CommonTree)match(input,BOOL_LIT,FOLLOW_BOOL_LIT_in_literal1161); 
					BOOL_LIT98_tree = (CommonTree)adaptor.dupNode(BOOL_LIT98);


					adaptor.addChild(root_0, BOOL_LIT98_tree);


					            retval.value = Boolean.valueOf((BOOL_LIT98!=null?BOOL_LIT98.getText():null));
					        
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
	// $ANTLR end "literal"


	public static class order_by_clause_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "order_by_clause"
	// CmisBaseQueryWalker.g:323:1: order_by_clause : ^( ORDER_BY ( sort_specification )+ ) ;
	public final CmisEcmQueryWalker_CmisBaseQueryWalker.order_by_clause_return order_by_clause() throws RecognitionException {
		CmisEcmQueryWalker_CmisBaseQueryWalker.order_by_clause_return retval = new CmisEcmQueryWalker_CmisBaseQueryWalker.order_by_clause_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree ORDER_BY99=null;
		TreeRuleReturnScope sort_specification100 =null;

		CommonTree ORDER_BY99_tree=null;

		try {
			// CmisBaseQueryWalker.g:323:16: ( ^( ORDER_BY ( sort_specification )+ ) )
			// CmisBaseQueryWalker.g:324:5: ^( ORDER_BY ( sort_specification )+ )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			ORDER_BY99=(CommonTree)match(input,ORDER_BY,FOLLOW_ORDER_BY_in_order_by_clause1188); 
			ORDER_BY99_tree = (CommonTree)adaptor.dupNode(ORDER_BY99);


			root_1 = (CommonTree)adaptor.becomeRoot(ORDER_BY99_tree, root_1);

			match(input, Token.DOWN, null); 
			// CmisBaseQueryWalker.g:324:16: ( sort_specification )+
			int cnt20=0;
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==COL) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// CmisBaseQueryWalker.g:324:16: sort_specification
					{
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_sort_specification_in_order_by_clause1190);
					sort_specification100=sort_specification();
					state._fsp--;

					adaptor.addChild(root_1, sort_specification100.getTree());

					}
					break;

				default :
					if ( cnt20 >= 1 ) break loop20;
					EarlyExitException eee = new EarlyExitException(20, input);
					throw eee;
				}
				cnt20++;
			}

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


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
	// $ANTLR end "order_by_clause"


	public static class sort_specification_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "sort_specification"
	// CmisBaseQueryWalker.g:327:1: sort_specification : ( column_reference ASC | column_reference DESC );
	public final CmisEcmQueryWalker_CmisBaseQueryWalker.sort_specification_return sort_specification() throws RecognitionException {
		CmisEcmQueryWalker_CmisBaseQueryWalker.sort_specification_return retval = new CmisEcmQueryWalker_CmisBaseQueryWalker.sort_specification_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree ASC102=null;
		CommonTree DESC104=null;
		TreeRuleReturnScope column_reference101 =null;
		TreeRuleReturnScope column_reference103 =null;

		CommonTree ASC102_tree=null;
		CommonTree DESC104_tree=null;

		try {
			// CmisBaseQueryWalker.g:327:19: ( column_reference ASC | column_reference DESC )
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==COL) ) {
				int LA21_1 = input.LA(2);
				if ( (LA21_1==DOWN) ) {
					int LA21_2 = input.LA(3);
					if ( (LA21_2==ID) ) {
						int LA21_3 = input.LA(4);
						if ( (LA21_3==ID) ) {
							int LA21_4 = input.LA(5);
							if ( (LA21_4==UP) ) {
								int LA21_5 = input.LA(6);
								if ( (LA21_5==ASC) ) {
									alt21=1;
								}
								else if ( (LA21_5==DESC) ) {
									alt21=2;
								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 21, 5, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 21, 4, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}
						else if ( (LA21_3==UP) ) {
							int LA21_5 = input.LA(5);
							if ( (LA21_5==ASC) ) {
								alt21=1;
							}
							else if ( (LA21_5==DESC) ) {
								alt21=2;
							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 21, 5, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 21, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 21, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 21, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}

			switch (alt21) {
				case 1 :
					// CmisBaseQueryWalker.g:328:5: column_reference ASC
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_column_reference_in_sort_specification1208);
					column_reference101=column_reference();
					state._fsp--;

					adaptor.addChild(root_0, column_reference101.getTree());

					_last = (CommonTree)input.LT(1);
					ASC102=(CommonTree)match(input,ASC,FOLLOW_ASC_in_sort_specification1210); 
					ASC102_tree = (CommonTree)adaptor.dupNode(ASC102);


					adaptor.addChild(root_0, ASC102_tree);


					       queryObj.addSortCriterium((column_reference101!=null?((CommonTree)column_reference101.start):null), (column_reference101!=null?((CmisEcmQueryWalker_CmisBaseQueryWalker.column_reference_return)column_reference101).result:null), true);
					    
					}
					break;
				case 2 :
					// CmisBaseQueryWalker.g:332:7: column_reference DESC
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_column_reference_in_sort_specification1224);
					column_reference103=column_reference();
					state._fsp--;

					adaptor.addChild(root_0, column_reference103.getTree());

					_last = (CommonTree)input.LT(1);
					DESC104=(CommonTree)match(input,DESC,FOLLOW_DESC_in_sort_specification1226); 
					DESC104_tree = (CommonTree)adaptor.dupNode(DESC104);


					adaptor.addChild(root_0, DESC104_tree);


					       queryObj.addSortCriterium((column_reference103!=null?((CommonTree)column_reference103.start):null), (column_reference103!=null?((CmisEcmQueryWalker_CmisBaseQueryWalker.column_reference_return)column_reference103).result:null), false);
					    
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
	// $ANTLR end "sort_specification"


	public static class correlation_name_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "correlation_name"
	// CmisBaseQueryWalker.g:338:1: correlation_name : ID ;
	public final CmisEcmQueryWalker_CmisBaseQueryWalker.correlation_name_return correlation_name() throws RecognitionException {
		CmisEcmQueryWalker_CmisBaseQueryWalker.correlation_name_return retval = new CmisEcmQueryWalker_CmisBaseQueryWalker.correlation_name_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree ID105=null;

		CommonTree ID105_tree=null;

		try {
			// CmisBaseQueryWalker.g:338:17: ( ID )
			// CmisBaseQueryWalker.g:339:5: ID
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			ID105=(CommonTree)match(input,ID,FOLLOW_ID_in_correlation_name1248); 
			ID105_tree = (CommonTree)adaptor.dupNode(ID105);


			adaptor.addChild(root_0, ID105_tree);

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
	// $ANTLR end "correlation_name"


	public static class table_name_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "table_name"
	// CmisBaseQueryWalker.g:341:1: table_name : ID ;
	public final CmisEcmQueryWalker_CmisBaseQueryWalker.table_name_return table_name() throws RecognitionException {
		CmisEcmQueryWalker_CmisBaseQueryWalker.table_name_return retval = new CmisEcmQueryWalker_CmisBaseQueryWalker.table_name_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree ID106=null;

		CommonTree ID106_tree=null;

		try {
			// CmisBaseQueryWalker.g:341:11: ( ID )
			// CmisBaseQueryWalker.g:342:5: ID
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			ID106=(CommonTree)match(input,ID,FOLLOW_ID_in_table_name1259); 
			ID106_tree = (CommonTree)adaptor.dupNode(ID106);


			adaptor.addChild(root_0, ID106_tree);

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
	// $ANTLR end "table_name"


	public static class column_name_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "column_name"
	// CmisBaseQueryWalker.g:344:1: column_name : ID ;
	public final CmisEcmQueryWalker_CmisBaseQueryWalker.column_name_return column_name() throws RecognitionException {
		CmisEcmQueryWalker_CmisBaseQueryWalker.column_name_return retval = new CmisEcmQueryWalker_CmisBaseQueryWalker.column_name_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree ID107=null;

		CommonTree ID107_tree=null;

		try {
			// CmisBaseQueryWalker.g:344:12: ( ID )
			// CmisBaseQueryWalker.g:345:5: ID
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			ID107=(CommonTree)match(input,ID,FOLLOW_ID_in_column_name1270); 
			ID107_tree = (CommonTree)adaptor.dupNode(ID107);


			adaptor.addChild(root_0, ID107_tree);

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
	// $ANTLR end "column_name"

	// Delegated rules



	public static final BitSet FOLLOW_SELECT_in_query87 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_select_list_in_query89 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_from_clause_in_query91 = new BitSet(new long[]{0x0040000000000008L,0x0000000000000100L});
	public static final BitSet FOLLOW_order_by_clause_in_query93 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000100L});
	public static final BitSet FOLLOW_where_clause_in_query96 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_STAR_in_select_list140 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEL_LIST_in_select_list157 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_select_sublist_in_select_list159 = new BitSet(new long[]{0x1000000004009008L,0x0000000000000002L});
	public static final BitSet FOLLOW_value_expression_in_select_sublist192 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_column_name_in_select_sublist194 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_qualifier_in_select_sublist213 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_DOT_in_select_sublist215 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_STAR_in_select_sublist217 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COL_in_column_reference296 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_qualifier_in_column_reference298 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_column_name_in_column_reference301 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_COL_in_multi_valued_column_reference331 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_qualifier_in_multi_valued_column_reference333 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_column_name_in_multi_valued_column_reference336 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_table_name_in_qualifier367 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FROM_in_from_clause391 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_table_reference_in_from_clause393 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_one_table_in_table_reference410 = new BitSet(new long[]{0x0000002000000002L});
	public static final BitSet FOLLOW_table_join_in_table_reference412 = new BitSet(new long[]{0x0000002000000002L});
	public static final BitSet FOLLOW_JOIN_in_table_join430 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_join_kind_in_table_join432 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_one_table_in_table_join434 = new BitSet(new long[]{0x0008000000000008L});
	public static final BitSet FOLLOW_join_specification_in_table_join436 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TABLE_in_one_table465 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_table_name_in_one_table467 = new BitSet(new long[]{0x0000000004000008L});
	public static final BitSet FOLLOW_correlation_name_in_one_table469 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INNER_in_join_kind514 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_in_join_kind524 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RIGHT_in_join_kind535 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ON_in_join_specification554 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_column_reference_in_join_specification558 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_EQ_in_join_specification560 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_column_reference_in_join_specification564 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_WHERE_in_where_clause590 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_search_condition_in_where_clause592 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OR_in_search_condition623 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_search_condition_in_search_condition627 = new BitSet(new long[]{0x0015FC9ACB185410L,0x0000000000000021L});
	public static final BitSet FOLLOW_search_condition_in_search_condition631 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_AND_in_search_condition641 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_search_condition_in_search_condition645 = new BitSet(new long[]{0x0015FC9ACB185410L,0x0000000000000021L});
	public static final BitSet FOLLOW_search_condition_in_search_condition649 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NOT_in_search_condition659 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_search_condition_in_search_condition661 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EQ_in_search_condition671 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_search_condition_in_search_condition673 = new BitSet(new long[]{0x0015FC9ACB185410L,0x0000000000000021L});
	public static final BitSet FOLLOW_search_condition_in_search_condition675 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NEQ_in_search_condition685 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_search_condition_in_search_condition687 = new BitSet(new long[]{0x0015FC9ACB185410L,0x0000000000000021L});
	public static final BitSet FOLLOW_search_condition_in_search_condition689 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LT_in_search_condition699 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_search_condition_in_search_condition701 = new BitSet(new long[]{0x0015FC9ACB185410L,0x0000000000000021L});
	public static final BitSet FOLLOW_search_condition_in_search_condition703 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GT_in_search_condition713 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_search_condition_in_search_condition715 = new BitSet(new long[]{0x0015FC9ACB185410L,0x0000000000000021L});
	public static final BitSet FOLLOW_search_condition_in_search_condition717 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GTEQ_in_search_condition727 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_search_condition_in_search_condition729 = new BitSet(new long[]{0x0015FC9ACB185410L,0x0000000000000021L});
	public static final BitSet FOLLOW_search_condition_in_search_condition731 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LTEQ_in_search_condition741 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_search_condition_in_search_condition743 = new BitSet(new long[]{0x0015FC9ACB185410L,0x0000000000000021L});
	public static final BitSet FOLLOW_search_condition_in_search_condition745 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LIKE_in_search_condition755 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_search_condition_in_search_condition757 = new BitSet(new long[]{0x0015FC9ACB185410L,0x0000000000000021L});
	public static final BitSet FOLLOW_search_condition_in_search_condition759 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NOT_LIKE_in_search_condition769 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_search_condition_in_search_condition771 = new BitSet(new long[]{0x0015FC9ACB185410L,0x0000000000000021L});
	public static final BitSet FOLLOW_search_condition_in_search_condition773 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IS_NULL_in_search_condition783 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_search_condition_in_search_condition785 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IS_NOT_NULL_in_search_condition795 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_search_condition_in_search_condition797 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EQ_ANY_in_search_condition807 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_literal_in_search_condition809 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_multi_valued_column_reference_in_search_condition813 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IN_ANY_in_search_condition831 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_multi_valued_column_reference_in_search_condition835 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_in_value_list_in_search_condition837 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NOT_IN_ANY_in_search_condition856 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_multi_valued_column_reference_in_search_condition860 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_in_value_list_in_search_condition862 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_CONTAINS_in_search_condition880 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_qualifier_in_search_condition882 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_text_search_expression_in_search_condition885 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IN_FOLDER_in_search_condition903 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_qualifier_in_search_condition905 = new BitSet(new long[]{0x0015FC9ACB185410L,0x0000000000000021L});
	public static final BitSet FOLLOW_search_condition_in_search_condition908 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IN_TREE_in_search_condition926 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_qualifier_in_search_condition928 = new BitSet(new long[]{0x0015FC9ACB185410L,0x0000000000000021L});
	public static final BitSet FOLLOW_search_condition_in_search_condition931 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IN_in_search_condition949 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_column_reference_in_search_condition951 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_in_value_list_in_search_condition953 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NOT_IN_in_search_condition971 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_column_reference_in_search_condition973 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_in_value_list_in_search_condition975 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_column_reference_in_search_condition992 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_literal_in_search_condition1008 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IN_LIST_in_in_value_list1034 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_literal_in_in_value_list1039 = new BitSet(new long[]{0x0004000000000408L,0x0000000000000021L});
	public static final BitSet FOLLOW_STRING_LIT_in_text_search_expression1078 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUM_LIT_in_literal1107 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_LIT_in_literal1125 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIME_LIT_in_literal1143 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOL_LIT_in_literal1161 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ORDER_BY_in_order_by_clause1188 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_sort_specification_in_order_by_clause1190 = new BitSet(new long[]{0x0000000000001008L});
	public static final BitSet FOLLOW_column_reference_in_sort_specification1208 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_ASC_in_sort_specification1210 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_column_reference_in_sort_specification1224 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_DESC_in_sort_specification1226 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_correlation_name1248 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_table_name1259 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_column_name1270 = new BitSet(new long[]{0x0000000000000002L});
}
