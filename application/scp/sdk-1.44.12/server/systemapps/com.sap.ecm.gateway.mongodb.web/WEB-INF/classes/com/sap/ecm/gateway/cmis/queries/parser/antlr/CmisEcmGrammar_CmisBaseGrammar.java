// $ANTLR 3.5.2 CmisBaseGrammar.g 2019-02-13 18:10:49

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
public class CmisEcmGrammar_CmisBaseGrammar extends Parser {
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators
	public CmisEcmGrammar gCmisEcmGrammar;
	public CmisEcmGrammar gParent;


	public CmisEcmGrammar_CmisBaseGrammar(TokenStream input, CmisEcmGrammar gCmisEcmGrammar) {
		this(input, new RecognizerSharedState(), gCmisEcmGrammar);
	}
	public CmisEcmGrammar_CmisBaseGrammar(TokenStream input, RecognizerSharedState state, CmisEcmGrammar gCmisEcmGrammar) {
		super(input, state);
		this.gCmisEcmGrammar = gCmisEcmGrammar;
		gParent = gCmisEcmGrammar;
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return CmisEcmGrammar.tokenNames; }
	@Override public String getGrammarFileName() { return "CmisBaseGrammar.g"; }


	    private List<String> errorMessages = new ArrayList<String>();
	    
	    public boolean hasErrors() {
	    	return errorMessages.size() > 0;
	    }

		public String getErrorMessages() {
			StringBuffer allMessages = new StringBuffer();
			
			for (String msg : errorMessages)
				allMessages.append(msg).append('\n');
				
			return allMessages.toString();
		}

	    @Override
	    // Instead of sending all errors to System.err collect them in a list
		public void emitErrorMessage(String msg) {
			errorMessages.add(msg);
		}
		


	public static class query_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "query"
	// CmisBaseGrammar.g:62:1: query : SELECT select_list from_clause ( where_clause )? ( order_by_clause )? EOF -> ^( SELECT select_list from_clause ( order_by_clause )? ( where_clause )? ) ;
	public final CmisEcmGrammar_CmisBaseGrammar.query_return query() throws RecognitionException {
		CmisEcmGrammar_CmisBaseGrammar.query_return retval = new CmisEcmGrammar_CmisBaseGrammar.query_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token SELECT1=null;
		Token EOF6=null;
		ParserRuleReturnScope select_list2 =null;
		ParserRuleReturnScope from_clause3 =null;
		ParserRuleReturnScope where_clause4 =null;
		ParserRuleReturnScope order_by_clause5 =null;

		Object SELECT1_tree=null;
		Object EOF6_tree=null;
		RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
		RewriteRuleTokenStream stream_SELECT=new RewriteRuleTokenStream(adaptor,"token SELECT");
		RewriteRuleSubtreeStream stream_select_list=new RewriteRuleSubtreeStream(adaptor,"rule select_list");
		RewriteRuleSubtreeStream stream_from_clause=new RewriteRuleSubtreeStream(adaptor,"rule from_clause");
		RewriteRuleSubtreeStream stream_order_by_clause=new RewriteRuleSubtreeStream(adaptor,"rule order_by_clause");
		RewriteRuleSubtreeStream stream_where_clause=new RewriteRuleSubtreeStream(adaptor,"rule where_clause");

		try {
			// CmisBaseGrammar.g:62:6: ( SELECT select_list from_clause ( where_clause )? ( order_by_clause )? EOF -> ^( SELECT select_list from_clause ( order_by_clause )? ( where_clause )? ) )
			// CmisBaseGrammar.g:63:2: SELECT select_list from_clause ( where_clause )? ( order_by_clause )? EOF
			{
			SELECT1=(Token)match(input,SELECT,FOLLOW_SELECT_in_query57);  
			stream_SELECT.add(SELECT1);

			pushFollow(FOLLOW_select_list_in_query59);
			select_list2=select_list();
			state._fsp--;

			stream_select_list.add(select_list2.getTree());
			pushFollow(FOLLOW_from_clause_in_query61);
			from_clause3=from_clause();
			state._fsp--;

			stream_from_clause.add(from_clause3.getTree());
			// CmisBaseGrammar.g:63:33: ( where_clause )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==WHERE) ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// CmisBaseGrammar.g:63:33: where_clause
					{
					pushFollow(FOLLOW_where_clause_in_query63);
					where_clause4=where_clause();
					state._fsp--;

					stream_where_clause.add(where_clause4.getTree());
					}
					break;

			}

			// CmisBaseGrammar.g:63:47: ( order_by_clause )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==ORDER) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// CmisBaseGrammar.g:63:47: order_by_clause
					{
					pushFollow(FOLLOW_order_by_clause_in_query66);
					order_by_clause5=order_by_clause();
					state._fsp--;

					stream_order_by_clause.add(order_by_clause5.getTree());
					}
					break;

			}

			EOF6=(Token)match(input,EOF,FOLLOW_EOF_in_query69);  
			stream_EOF.add(EOF6);

			// AST REWRITE
			// elements: where_clause, SELECT, order_by_clause, from_clause, select_list
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 64:3: -> ^( SELECT select_list from_clause ( order_by_clause )? ( where_clause )? )
			{
				// CmisBaseGrammar.g:64:6: ^( SELECT select_list from_clause ( order_by_clause )? ( where_clause )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_SELECT.nextNode(), root_1);
				adaptor.addChild(root_1, stream_select_list.nextTree());
				adaptor.addChild(root_1, stream_from_clause.nextTree());
				// CmisBaseGrammar.g:64:39: ( order_by_clause )?
				if ( stream_order_by_clause.hasNext() ) {
					adaptor.addChild(root_1, stream_order_by_clause.nextTree());
				}
				stream_order_by_clause.reset();

				// CmisBaseGrammar.g:64:56: ( where_clause )?
				if ( stream_where_clause.hasNext() ) {
					adaptor.addChild(root_1, stream_where_clause.nextTree());
				}
				stream_where_clause.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

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
	// $ANTLR end "query"


	public static class select_list_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "select_list"
	// CmisBaseGrammar.g:67:1: select_list : ( STAR | select_sublist ( COMMA select_sublist )* -> ^( SEL_LIST ( select_sublist )+ ) );
	public final CmisEcmGrammar_CmisBaseGrammar.select_list_return select_list() throws RecognitionException {
		CmisEcmGrammar_CmisBaseGrammar.select_list_return retval = new CmisEcmGrammar_CmisBaseGrammar.select_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token STAR7=null;
		Token COMMA9=null;
		ParserRuleReturnScope select_sublist8 =null;
		ParserRuleReturnScope select_sublist10 =null;

		Object STAR7_tree=null;
		Object COMMA9_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_select_sublist=new RewriteRuleSubtreeStream(adaptor,"rule select_sublist");

		try {
			// CmisBaseGrammar.g:68:5: ( STAR | select_sublist ( COMMA select_sublist )* -> ^( SEL_LIST ( select_sublist )+ ) )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==STAR) ) {
				alt4=1;
			}
			else if ( (LA4_0==COUNT||LA4_0==ID||LA4_0==SCORE||LA4_0==SUM) ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// CmisBaseGrammar.g:68:7: STAR
					{
					root_0 = (Object)adaptor.nil();


					STAR7=(Token)match(input,STAR,FOLLOW_STAR_in_select_list101); 
					STAR7_tree = (Object)adaptor.create(STAR7);
					adaptor.addChild(root_0, STAR7_tree);

					}
					break;
				case 2 :
					// CmisBaseGrammar.g:69:7: select_sublist ( COMMA select_sublist )*
					{
					pushFollow(FOLLOW_select_sublist_in_select_list109);
					select_sublist8=select_sublist();
					state._fsp--;

					stream_select_sublist.add(select_sublist8.getTree());
					// CmisBaseGrammar.g:69:22: ( COMMA select_sublist )*
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( (LA3_0==COMMA) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// CmisBaseGrammar.g:69:24: COMMA select_sublist
							{
							COMMA9=(Token)match(input,COMMA,FOLLOW_COMMA_in_select_list113);  
							stream_COMMA.add(COMMA9);

							pushFollow(FOLLOW_select_sublist_in_select_list115);
							select_sublist10=select_sublist();
							state._fsp--;

							stream_select_sublist.add(select_sublist10.getTree());
							}
							break;

						default :
							break loop3;
						}
					}

					// AST REWRITE
					// elements: select_sublist
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 70:7: -> ^( SEL_LIST ( select_sublist )+ )
					{
						// CmisBaseGrammar.g:70:10: ^( SEL_LIST ( select_sublist )+ )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SEL_LIST, "SEL_LIST"), root_1);
						if ( !(stream_select_sublist.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_select_sublist.hasNext() ) {
							adaptor.addChild(root_1, stream_select_sublist.nextTree());
						}
						stream_select_sublist.reset();

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
	// $ANTLR end "select_list"


	public static class select_sublist_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "select_sublist"
	// CmisBaseGrammar.g:73:1: select_sublist : ( value_expression ( ( AS !)? column_name )? | qualifier DOT STAR );
	public final CmisEcmGrammar_CmisBaseGrammar.select_sublist_return select_sublist() throws RecognitionException {
		CmisEcmGrammar_CmisBaseGrammar.select_sublist_return retval = new CmisEcmGrammar_CmisBaseGrammar.select_sublist_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token AS12=null;
		Token DOT15=null;
		Token STAR16=null;
		ParserRuleReturnScope value_expression11 =null;
		ParserRuleReturnScope column_name13 =null;
		ParserRuleReturnScope qualifier14 =null;

		Object AS12_tree=null;
		Object DOT15_tree=null;
		Object STAR16_tree=null;

		try {
			// CmisBaseGrammar.g:74:5: ( value_expression ( ( AS !)? column_name )? | qualifier DOT STAR )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==ID) ) {
				int LA7_1 = input.LA(2);
				if ( (LA7_1==DOT) ) {
					int LA7_3 = input.LA(3);
					if ( (LA7_3==STAR) ) {
						alt7=2;
					}
					else if ( (LA7_3==ID) ) {
						alt7=1;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 7, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA7_1==AS||LA7_1==COMMA||LA7_1==FROM||LA7_1==ID) ) {
					alt7=1;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 7, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA7_0==COUNT||LA7_0==SCORE||LA7_0==SUM) ) {
				alt7=1;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// CmisBaseGrammar.g:74:7: value_expression ( ( AS !)? column_name )?
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_value_expression_in_select_sublist150);
					value_expression11=value_expression();
					state._fsp--;

					adaptor.addChild(root_0, value_expression11.getTree());

					// CmisBaseGrammar.g:74:24: ( ( AS !)? column_name )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==AS||LA6_0==ID) ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// CmisBaseGrammar.g:74:26: ( AS !)? column_name
							{
							// CmisBaseGrammar.g:74:28: ( AS !)?
							int alt5=2;
							int LA5_0 = input.LA(1);
							if ( (LA5_0==AS) ) {
								alt5=1;
							}
							switch (alt5) {
								case 1 :
									// CmisBaseGrammar.g:74:28: AS !
									{
									AS12=(Token)match(input,AS,FOLLOW_AS_in_select_sublist154); 
									}
									break;

							}

							pushFollow(FOLLOW_column_name_in_select_sublist158);
							column_name13=column_name();
							state._fsp--;

							adaptor.addChild(root_0, column_name13.getTree());

							}
							break;

					}

					}
					break;
				case 2 :
					// CmisBaseGrammar.g:75:7: qualifier DOT STAR
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_qualifier_in_select_sublist169);
					qualifier14=qualifier();
					state._fsp--;

					adaptor.addChild(root_0, qualifier14.getTree());

					DOT15=(Token)match(input,DOT,FOLLOW_DOT_in_select_sublist171); 
					DOT15_tree = (Object)adaptor.create(DOT15);
					adaptor.addChild(root_0, DOT15_tree);

					STAR16=(Token)match(input,STAR,FOLLOW_STAR_in_select_sublist173); 
					STAR16_tree = (Object)adaptor.create(STAR16);
					adaptor.addChild(root_0, STAR16_tree);

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
	// $ANTLR end "select_sublist"


	public static class value_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "value_expression"
	// CmisBaseGrammar.g:79:1: value_expression : ( column_reference | numeric_value_function );
	public final CmisEcmGrammar_CmisBaseGrammar.value_expression_return value_expression() throws RecognitionException {
		CmisEcmGrammar_CmisBaseGrammar.value_expression_return retval = new CmisEcmGrammar_CmisBaseGrammar.value_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope column_reference17 =null;
		ParserRuleReturnScope numeric_value_function18 =null;


		try {
			// CmisBaseGrammar.g:79:17: ( column_reference | numeric_value_function )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==ID) ) {
				alt8=1;
			}
			else if ( (LA8_0==COUNT||LA8_0==SCORE||LA8_0==SUM) ) {
				alt8=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// CmisBaseGrammar.g:80:7: column_reference
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_column_reference_in_value_expression196);
					column_reference17=column_reference();
					state._fsp--;

					adaptor.addChild(root_0, column_reference17.getTree());

					}
					break;
				case 2 :
					// CmisBaseGrammar.g:81:7: numeric_value_function
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_numeric_value_function_in_value_expression204);
					numeric_value_function18=gCmisEcmGrammar.numeric_value_function();
					state._fsp--;

					adaptor.addChild(root_0, numeric_value_function18.getTree());

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
	// $ANTLR end "value_expression"


	public static class column_reference_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "column_reference"
	// CmisBaseGrammar.g:84:1: column_reference : ( qualifier DOT )? column_name -> ^( COL ( qualifier )? column_name ) ;
	public final CmisEcmGrammar_CmisBaseGrammar.column_reference_return column_reference() throws RecognitionException {
		CmisEcmGrammar_CmisBaseGrammar.column_reference_return retval = new CmisEcmGrammar_CmisBaseGrammar.column_reference_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token DOT20=null;
		ParserRuleReturnScope qualifier19 =null;
		ParserRuleReturnScope column_name21 =null;

		Object DOT20_tree=null;
		RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
		RewriteRuleSubtreeStream stream_qualifier=new RewriteRuleSubtreeStream(adaptor,"rule qualifier");
		RewriteRuleSubtreeStream stream_column_name=new RewriteRuleSubtreeStream(adaptor,"rule column_name");

		try {
			// CmisBaseGrammar.g:84:17: ( ( qualifier DOT )? column_name -> ^( COL ( qualifier )? column_name ) )
			// CmisBaseGrammar.g:85:5: ( qualifier DOT )? column_name
			{
			// CmisBaseGrammar.g:85:5: ( qualifier DOT )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==ID) ) {
				int LA9_1 = input.LA(2);
				if ( (LA9_1==DOT) ) {
					alt9=1;
				}
			}
			switch (alt9) {
				case 1 :
					// CmisBaseGrammar.g:85:7: qualifier DOT
					{
					pushFollow(FOLLOW_qualifier_in_column_reference222);
					qualifier19=qualifier();
					state._fsp--;

					stream_qualifier.add(qualifier19.getTree());
					DOT20=(Token)match(input,DOT,FOLLOW_DOT_in_column_reference224);  
					stream_DOT.add(DOT20);

					}
					break;

			}

			pushFollow(FOLLOW_column_name_in_column_reference229);
			column_name21=column_name();
			state._fsp--;

			stream_column_name.add(column_name21.getTree());
			// AST REWRITE
			// elements: qualifier, column_name
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 86:7: -> ^( COL ( qualifier )? column_name )
			{
				// CmisBaseGrammar.g:86:10: ^( COL ( qualifier )? column_name )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COL, "COL"), root_1);
				// CmisBaseGrammar.g:86:16: ( qualifier )?
				if ( stream_qualifier.hasNext() ) {
					adaptor.addChild(root_1, stream_qualifier.nextTree());
				}
				stream_qualifier.reset();

				adaptor.addChild(root_1, stream_column_name.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

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
	// $ANTLR end "column_reference"


	public static class multi_valued_column_reference_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "multi_valued_column_reference"
	// CmisBaseGrammar.g:89:1: multi_valued_column_reference : ( qualifier DOT )? multi_valued_column_name -> ^( COL ( qualifier )? multi_valued_column_name ) ;
	public final CmisEcmGrammar_CmisBaseGrammar.multi_valued_column_reference_return multi_valued_column_reference() throws RecognitionException {
		CmisEcmGrammar_CmisBaseGrammar.multi_valued_column_reference_return retval = new CmisEcmGrammar_CmisBaseGrammar.multi_valued_column_reference_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token DOT23=null;
		ParserRuleReturnScope qualifier22 =null;
		ParserRuleReturnScope multi_valued_column_name24 =null;

		Object DOT23_tree=null;
		RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
		RewriteRuleSubtreeStream stream_multi_valued_column_name=new RewriteRuleSubtreeStream(adaptor,"rule multi_valued_column_name");
		RewriteRuleSubtreeStream stream_qualifier=new RewriteRuleSubtreeStream(adaptor,"rule qualifier");

		try {
			// CmisBaseGrammar.g:89:30: ( ( qualifier DOT )? multi_valued_column_name -> ^( COL ( qualifier )? multi_valued_column_name ) )
			// CmisBaseGrammar.g:90:5: ( qualifier DOT )? multi_valued_column_name
			{
			// CmisBaseGrammar.g:90:5: ( qualifier DOT )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==ID) ) {
				int LA10_1 = input.LA(2);
				if ( (LA10_1==DOT) ) {
					alt10=1;
				}
			}
			switch (alt10) {
				case 1 :
					// CmisBaseGrammar.g:90:7: qualifier DOT
					{
					pushFollow(FOLLOW_qualifier_in_multi_valued_column_reference264);
					qualifier22=qualifier();
					state._fsp--;

					stream_qualifier.add(qualifier22.getTree());
					DOT23=(Token)match(input,DOT,FOLLOW_DOT_in_multi_valued_column_reference266);  
					stream_DOT.add(DOT23);

					}
					break;

			}

			pushFollow(FOLLOW_multi_valued_column_name_in_multi_valued_column_reference271);
			multi_valued_column_name24=multi_valued_column_name();
			state._fsp--;

			stream_multi_valued_column_name.add(multi_valued_column_name24.getTree());
			// AST REWRITE
			// elements: multi_valued_column_name, qualifier
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 91:7: -> ^( COL ( qualifier )? multi_valued_column_name )
			{
				// CmisBaseGrammar.g:91:10: ^( COL ( qualifier )? multi_valued_column_name )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COL, "COL"), root_1);
				// CmisBaseGrammar.g:91:16: ( qualifier )?
				if ( stream_qualifier.hasNext() ) {
					adaptor.addChild(root_1, stream_qualifier.nextTree());
				}
				stream_qualifier.reset();

				adaptor.addChild(root_1, stream_multi_valued_column_name.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

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
	// $ANTLR end "multi_valued_column_reference"


	public static class qualifier_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "qualifier"
	// CmisBaseGrammar.g:97:1: qualifier : table_name ;
	public final CmisEcmGrammar_CmisBaseGrammar.qualifier_return qualifier() throws RecognitionException {
		CmisEcmGrammar_CmisBaseGrammar.qualifier_return retval = new CmisEcmGrammar_CmisBaseGrammar.qualifier_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope table_name25 =null;


		try {
			// CmisBaseGrammar.g:97:10: ( table_name )
			// CmisBaseGrammar.g:98:7: table_name
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_table_name_in_qualifier327);
			table_name25=table_name();
			state._fsp--;

			adaptor.addChild(root_0, table_name25.getTree());

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
	// $ANTLR end "qualifier"


	public static class from_clause_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "from_clause"
	// CmisBaseGrammar.g:102:1: from_clause : FROM ^ table_reference ;
	public final CmisEcmGrammar_CmisBaseGrammar.from_clause_return from_clause() throws RecognitionException {
		CmisEcmGrammar_CmisBaseGrammar.from_clause_return retval = new CmisEcmGrammar_CmisBaseGrammar.from_clause_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token FROM26=null;
		ParserRuleReturnScope table_reference27 =null;

		Object FROM26_tree=null;

		try {
			// CmisBaseGrammar.g:102:12: ( FROM ^ table_reference )
			// CmisBaseGrammar.g:102:14: FROM ^ table_reference
			{
			root_0 = (Object)adaptor.nil();


			FROM26=(Token)match(input,FROM,FOLLOW_FROM_in_from_clause344); 
			FROM26_tree = (Object)adaptor.create(FROM26);
			root_0 = (Object)adaptor.becomeRoot(FROM26_tree, root_0);

			pushFollow(FOLLOW_table_reference_in_from_clause347);
			table_reference27=table_reference();
			state._fsp--;

			adaptor.addChild(root_0, table_reference27.getTree());

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
	// $ANTLR end "from_clause"


	public static class table_reference_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "table_reference"
	// CmisBaseGrammar.g:104:1: table_reference : one_table ( table_join )* ;
	public final CmisEcmGrammar_CmisBaseGrammar.table_reference_return table_reference() throws RecognitionException {
		CmisEcmGrammar_CmisBaseGrammar.table_reference_return retval = new CmisEcmGrammar_CmisBaseGrammar.table_reference_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope one_table28 =null;
		ParserRuleReturnScope table_join29 =null;


		try {
			// CmisBaseGrammar.g:104:16: ( one_table ( table_join )* )
			// CmisBaseGrammar.g:105:5: one_table ( table_join )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_one_table_in_table_reference358);
			one_table28=one_table();
			state._fsp--;

			adaptor.addChild(root_0, one_table28.getTree());

			// CmisBaseGrammar.g:105:15: ( table_join )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==INNER||(LA11_0 >= JOIN && LA11_0 <= LEFT)||LA11_0==RIGHT) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// CmisBaseGrammar.g:105:15: table_join
					{
					pushFollow(FOLLOW_table_join_in_table_reference360);
					table_join29=table_join();
					state._fsp--;

					adaptor.addChild(root_0, table_join29.getTree());

					}
					break;

				default :
					break loop11;
				}
			}

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
	// $ANTLR end "table_reference"


	public static class table_join_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "table_join"
	// CmisBaseGrammar.g:108:1: table_join : join_kind one_table ( join_specification )? -> ^( JOIN join_kind one_table ( join_specification )? ) ;
	public final CmisEcmGrammar_CmisBaseGrammar.table_join_return table_join() throws RecognitionException {
		CmisEcmGrammar_CmisBaseGrammar.table_join_return retval = new CmisEcmGrammar_CmisBaseGrammar.table_join_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope join_kind30 =null;
		ParserRuleReturnScope one_table31 =null;
		ParserRuleReturnScope join_specification32 =null;

		RewriteRuleSubtreeStream stream_join_kind=new RewriteRuleSubtreeStream(adaptor,"rule join_kind");
		RewriteRuleSubtreeStream stream_join_specification=new RewriteRuleSubtreeStream(adaptor,"rule join_specification");
		RewriteRuleSubtreeStream stream_one_table=new RewriteRuleSubtreeStream(adaptor,"rule one_table");

		try {
			// CmisBaseGrammar.g:108:11: ( join_kind one_table ( join_specification )? -> ^( JOIN join_kind one_table ( join_specification )? ) )
			// CmisBaseGrammar.g:109:5: join_kind one_table ( join_specification )?
			{
			pushFollow(FOLLOW_join_kind_in_table_join377);
			join_kind30=join_kind();
			state._fsp--;

			stream_join_kind.add(join_kind30.getTree());
			pushFollow(FOLLOW_one_table_in_table_join379);
			one_table31=one_table();
			state._fsp--;

			stream_one_table.add(one_table31.getTree());
			// CmisBaseGrammar.g:109:25: ( join_specification )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==ON) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// CmisBaseGrammar.g:109:25: join_specification
					{
					pushFollow(FOLLOW_join_specification_in_table_join381);
					join_specification32=join_specification();
					state._fsp--;

					stream_join_specification.add(join_specification32.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: join_specification, one_table, join_kind
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 110:5: -> ^( JOIN join_kind one_table ( join_specification )? )
			{
				// CmisBaseGrammar.g:110:8: ^( JOIN join_kind one_table ( join_specification )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(JOIN, "JOIN"), root_1);
				adaptor.addChild(root_1, stream_join_kind.nextTree());
				adaptor.addChild(root_1, stream_one_table.nextTree());
				// CmisBaseGrammar.g:110:35: ( join_specification )?
				if ( stream_join_specification.hasNext() ) {
					adaptor.addChild(root_1, stream_join_specification.nextTree());
				}
				stream_join_specification.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

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
	// $ANTLR end "table_join"


	public static class one_table_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "one_table"
	// CmisBaseGrammar.g:113:1: one_table : ( LPAR ! table_reference RPAR !| table_name -> ^( TABLE table_name ) | table_name ( AS )? correlation_name -> ^( TABLE table_name correlation_name ) );
	public final CmisEcmGrammar_CmisBaseGrammar.one_table_return one_table() throws RecognitionException {
		CmisEcmGrammar_CmisBaseGrammar.one_table_return retval = new CmisEcmGrammar_CmisBaseGrammar.one_table_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LPAR33=null;
		Token RPAR35=null;
		Token AS38=null;
		ParserRuleReturnScope table_reference34 =null;
		ParserRuleReturnScope table_name36 =null;
		ParserRuleReturnScope table_name37 =null;
		ParserRuleReturnScope correlation_name39 =null;

		Object LPAR33_tree=null;
		Object RPAR35_tree=null;
		Object AS38_tree=null;
		RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
		RewriteRuleSubtreeStream stream_table_name=new RewriteRuleSubtreeStream(adaptor,"rule table_name");
		RewriteRuleSubtreeStream stream_correlation_name=new RewriteRuleSubtreeStream(adaptor,"rule correlation_name");

		try {
			// CmisBaseGrammar.g:113:10: ( LPAR ! table_reference RPAR !| table_name -> ^( TABLE table_name ) | table_name ( AS )? correlation_name -> ^( TABLE table_name correlation_name ) )
			int alt14=3;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==LPAR) ) {
				alt14=1;
			}
			else if ( (LA14_0==ID) ) {
				int LA14_2 = input.LA(2);
				if ( (LA14_2==EOF||LA14_2==INNER||(LA14_2 >= JOIN && LA14_2 <= LEFT)||LA14_2==ON||LA14_2==ORDER||(LA14_2 >= RIGHT && LA14_2 <= RPAR)||LA14_2==WHERE) ) {
					alt14=2;
				}
				else if ( (LA14_2==AS||LA14_2==ID) ) {
					alt14=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 14, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}

			switch (alt14) {
				case 1 :
					// CmisBaseGrammar.g:114:7: LPAR ! table_reference RPAR !
					{
					root_0 = (Object)adaptor.nil();


					LPAR33=(Token)match(input,LPAR,FOLLOW_LPAR_in_one_table417); 
					pushFollow(FOLLOW_table_reference_in_one_table420);
					table_reference34=table_reference();
					state._fsp--;

					adaptor.addChild(root_0, table_reference34.getTree());

					RPAR35=(Token)match(input,RPAR,FOLLOW_RPAR_in_one_table422); 
					}
					break;
				case 2 :
					// CmisBaseGrammar.g:115:7: table_name
					{
					pushFollow(FOLLOW_table_name_in_one_table431);
					table_name36=table_name();
					state._fsp--;

					stream_table_name.add(table_name36.getTree());
					// AST REWRITE
					// elements: table_name
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 116:9: -> ^( TABLE table_name )
					{
						// CmisBaseGrammar.g:116:12: ^( TABLE table_name )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TABLE, "TABLE"), root_1);
						adaptor.addChild(root_1, stream_table_name.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// CmisBaseGrammar.g:117:7: table_name ( AS )? correlation_name
					{
					pushFollow(FOLLOW_table_name_in_one_table455);
					table_name37=table_name();
					state._fsp--;

					stream_table_name.add(table_name37.getTree());
					// CmisBaseGrammar.g:117:18: ( AS )?
					int alt13=2;
					int LA13_0 = input.LA(1);
					if ( (LA13_0==AS) ) {
						alt13=1;
					}
					switch (alt13) {
						case 1 :
							// CmisBaseGrammar.g:117:18: AS
							{
							AS38=(Token)match(input,AS,FOLLOW_AS_in_one_table457);  
							stream_AS.add(AS38);

							}
							break;

					}

					pushFollow(FOLLOW_correlation_name_in_one_table460);
					correlation_name39=correlation_name();
					state._fsp--;

					stream_correlation_name.add(correlation_name39.getTree());
					// AST REWRITE
					// elements: correlation_name, table_name
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 118:9: -> ^( TABLE table_name correlation_name )
					{
						// CmisBaseGrammar.g:118:12: ^( TABLE table_name correlation_name )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TABLE, "TABLE"), root_1);
						adaptor.addChild(root_1, stream_table_name.nextTree());
						adaptor.addChild(root_1, stream_correlation_name.nextTree());
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
	// $ANTLR end "one_table"


	public static class join_kind_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "join_kind"
	// CmisBaseGrammar.g:121:1: join_kind : ( JOIN -> INNER | INNER JOIN -> INNER | LEFT ( OUTER )? JOIN -> LEFT | RIGHT ( OUTER )? JOIN -> RIGHT );
	public final CmisEcmGrammar_CmisBaseGrammar.join_kind_return join_kind() throws RecognitionException {
		CmisEcmGrammar_CmisBaseGrammar.join_kind_return retval = new CmisEcmGrammar_CmisBaseGrammar.join_kind_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token JOIN40=null;
		Token INNER41=null;
		Token JOIN42=null;
		Token LEFT43=null;
		Token OUTER44=null;
		Token JOIN45=null;
		Token RIGHT46=null;
		Token OUTER47=null;
		Token JOIN48=null;

		Object JOIN40_tree=null;
		Object INNER41_tree=null;
		Object JOIN42_tree=null;
		Object LEFT43_tree=null;
		Object OUTER44_tree=null;
		Object JOIN45_tree=null;
		Object RIGHT46_tree=null;
		Object OUTER47_tree=null;
		Object JOIN48_tree=null;
		RewriteRuleTokenStream stream_OUTER=new RewriteRuleTokenStream(adaptor,"token OUTER");
		RewriteRuleTokenStream stream_RIGHT=new RewriteRuleTokenStream(adaptor,"token RIGHT");
		RewriteRuleTokenStream stream_INNER=new RewriteRuleTokenStream(adaptor,"token INNER");
		RewriteRuleTokenStream stream_LEFT=new RewriteRuleTokenStream(adaptor,"token LEFT");
		RewriteRuleTokenStream stream_JOIN=new RewriteRuleTokenStream(adaptor,"token JOIN");

		try {
			// CmisBaseGrammar.g:121:10: ( JOIN -> INNER | INNER JOIN -> INNER | LEFT ( OUTER )? JOIN -> LEFT | RIGHT ( OUTER )? JOIN -> RIGHT )
			int alt17=4;
			switch ( input.LA(1) ) {
			case JOIN:
				{
				alt17=1;
				}
				break;
			case INNER:
				{
				alt17=2;
				}
				break;
			case LEFT:
				{
				alt17=3;
				}
				break;
			case RIGHT:
				{
				alt17=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}
			switch (alt17) {
				case 1 :
					// CmisBaseGrammar.g:122:7: JOIN
					{
					JOIN40=(Token)match(input,JOIN,FOLLOW_JOIN_in_join_kind496);  
					stream_JOIN.add(JOIN40);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 123:9: -> INNER
					{
						adaptor.addChild(root_0, (Object)adaptor.create(INNER, "INNER"));
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// CmisBaseGrammar.g:124:7: INNER JOIN
					{
					INNER41=(Token)match(input,INNER,FOLLOW_INNER_in_join_kind516);  
					stream_INNER.add(INNER41);

					JOIN42=(Token)match(input,JOIN,FOLLOW_JOIN_in_join_kind518);  
					stream_JOIN.add(JOIN42);

					// AST REWRITE
					// elements: INNER
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 125:9: -> INNER
					{
						adaptor.addChild(root_0, stream_INNER.nextNode());
					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// CmisBaseGrammar.g:126:7: LEFT ( OUTER )? JOIN
					{
					LEFT43=(Token)match(input,LEFT,FOLLOW_LEFT_in_join_kind538);  
					stream_LEFT.add(LEFT43);

					// CmisBaseGrammar.g:126:12: ( OUTER )?
					int alt15=2;
					int LA15_0 = input.LA(1);
					if ( (LA15_0==OUTER) ) {
						alt15=1;
					}
					switch (alt15) {
						case 1 :
							// CmisBaseGrammar.g:126:12: OUTER
							{
							OUTER44=(Token)match(input,OUTER,FOLLOW_OUTER_in_join_kind540);  
							stream_OUTER.add(OUTER44);

							}
							break;

					}

					JOIN45=(Token)match(input,JOIN,FOLLOW_JOIN_in_join_kind543);  
					stream_JOIN.add(JOIN45);

					// AST REWRITE
					// elements: LEFT
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 127:9: -> LEFT
					{
						adaptor.addChild(root_0, stream_LEFT.nextNode());
					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					// CmisBaseGrammar.g:128:7: RIGHT ( OUTER )? JOIN
					{
					RIGHT46=(Token)match(input,RIGHT,FOLLOW_RIGHT_in_join_kind563);  
					stream_RIGHT.add(RIGHT46);

					// CmisBaseGrammar.g:128:13: ( OUTER )?
					int alt16=2;
					int LA16_0 = input.LA(1);
					if ( (LA16_0==OUTER) ) {
						alt16=1;
					}
					switch (alt16) {
						case 1 :
							// CmisBaseGrammar.g:128:13: OUTER
							{
							OUTER47=(Token)match(input,OUTER,FOLLOW_OUTER_in_join_kind565);  
							stream_OUTER.add(OUTER47);

							}
							break;

					}

					JOIN48=(Token)match(input,JOIN,FOLLOW_JOIN_in_join_kind568);  
					stream_JOIN.add(JOIN48);

					// AST REWRITE
					// elements: RIGHT
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 129:9: -> RIGHT
					{
						adaptor.addChild(root_0, stream_RIGHT.nextNode());
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
	// $ANTLR end "join_kind"


	public static class join_specification_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "join_specification"
	// CmisBaseGrammar.g:132:1: join_specification : ON ^ column_reference EQ column_reference ;
	public final CmisEcmGrammar_CmisBaseGrammar.join_specification_return join_specification() throws RecognitionException {
		CmisEcmGrammar_CmisBaseGrammar.join_specification_return retval = new CmisEcmGrammar_CmisBaseGrammar.join_specification_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ON49=null;
		Token EQ51=null;
		ParserRuleReturnScope column_reference50 =null;
		ParserRuleReturnScope column_reference52 =null;

		Object ON49_tree=null;
		Object EQ51_tree=null;

		try {
			// CmisBaseGrammar.g:132:19: ( ON ^ column_reference EQ column_reference )
			// CmisBaseGrammar.g:133:5: ON ^ column_reference EQ column_reference
			{
			root_0 = (Object)adaptor.nil();


			ON49=(Token)match(input,ON,FOLLOW_ON_in_join_specification596); 
			ON49_tree = (Object)adaptor.create(ON49);
			root_0 = (Object)adaptor.becomeRoot(ON49_tree, root_0);

			pushFollow(FOLLOW_column_reference_in_join_specification599);
			column_reference50=column_reference();
			state._fsp--;

			adaptor.addChild(root_0, column_reference50.getTree());

			EQ51=(Token)match(input,EQ,FOLLOW_EQ_in_join_specification601); 
			EQ51_tree = (Object)adaptor.create(EQ51);
			adaptor.addChild(root_0, EQ51_tree);

			pushFollow(FOLLOW_column_reference_in_join_specification603);
			column_reference52=column_reference();
			state._fsp--;

			adaptor.addChild(root_0, column_reference52.getTree());

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
	// $ANTLR end "join_specification"


	public static class where_clause_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "where_clause"
	// CmisBaseGrammar.g:139:1: where_clause : WHERE ^ search_condition ;
	public final CmisEcmGrammar_CmisBaseGrammar.where_clause_return where_clause() throws RecognitionException {
		CmisEcmGrammar_CmisBaseGrammar.where_clause_return retval = new CmisEcmGrammar_CmisBaseGrammar.where_clause_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WHERE53=null;
		ParserRuleReturnScope search_condition54 =null;

		Object WHERE53_tree=null;

		try {
			// CmisBaseGrammar.g:139:13: ( WHERE ^ search_condition )
			// CmisBaseGrammar.g:139:15: WHERE ^ search_condition
			{
			root_0 = (Object)adaptor.nil();


			WHERE53=(Token)match(input,WHERE,FOLLOW_WHERE_in_where_clause618); 
			WHERE53_tree = (Object)adaptor.create(WHERE53);
			root_0 = (Object)adaptor.becomeRoot(WHERE53_tree, root_0);

			pushFollow(FOLLOW_search_condition_in_where_clause621);
			search_condition54=search_condition();
			state._fsp--;

			adaptor.addChild(root_0, search_condition54.getTree());

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
	// $ANTLR end "where_clause"


	public static class search_condition_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "search_condition"
	// CmisBaseGrammar.g:141:1: search_condition : boolean_term ( OR ^ boolean_term )* ;
	public final CmisEcmGrammar_CmisBaseGrammar.search_condition_return search_condition() throws RecognitionException {
		CmisEcmGrammar_CmisBaseGrammar.search_condition_return retval = new CmisEcmGrammar_CmisBaseGrammar.search_condition_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token OR56=null;
		ParserRuleReturnScope boolean_term55 =null;
		ParserRuleReturnScope boolean_term57 =null;

		Object OR56_tree=null;

		try {
			// CmisBaseGrammar.g:141:17: ( boolean_term ( OR ^ boolean_term )* )
			// CmisBaseGrammar.g:142:5: boolean_term ( OR ^ boolean_term )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_boolean_term_in_search_condition632);
			boolean_term55=boolean_term();
			state._fsp--;

			adaptor.addChild(root_0, boolean_term55.getTree());

			// CmisBaseGrammar.g:142:18: ( OR ^ boolean_term )*
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==OR) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// CmisBaseGrammar.g:142:19: OR ^ boolean_term
					{
					OR56=(Token)match(input,OR,FOLLOW_OR_in_search_condition635); 
					OR56_tree = (Object)adaptor.create(OR56);
					root_0 = (Object)adaptor.becomeRoot(OR56_tree, root_0);

					pushFollow(FOLLOW_boolean_term_in_search_condition638);
					boolean_term57=boolean_term();
					state._fsp--;

					adaptor.addChild(root_0, boolean_term57.getTree());

					}
					break;

				default :
					break loop18;
				}
			}

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
	// $ANTLR end "search_condition"


	public static class boolean_term_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "boolean_term"
	// CmisBaseGrammar.g:144:1: boolean_term : boolean_factor ( AND ^ boolean_factor )* ;
	public final CmisEcmGrammar_CmisBaseGrammar.boolean_term_return boolean_term() throws RecognitionException {
		CmisEcmGrammar_CmisBaseGrammar.boolean_term_return retval = new CmisEcmGrammar_CmisBaseGrammar.boolean_term_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token AND59=null;
		ParserRuleReturnScope boolean_factor58 =null;
		ParserRuleReturnScope boolean_factor60 =null;

		Object AND59_tree=null;

		try {
			// CmisBaseGrammar.g:144:13: ( boolean_factor ( AND ^ boolean_factor )* )
			// CmisBaseGrammar.g:145:5: boolean_factor ( AND ^ boolean_factor )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_boolean_factor_in_boolean_term651);
			boolean_factor58=boolean_factor();
			state._fsp--;

			adaptor.addChild(root_0, boolean_factor58.getTree());

			// CmisBaseGrammar.g:145:20: ( AND ^ boolean_factor )*
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==AND) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// CmisBaseGrammar.g:145:21: AND ^ boolean_factor
					{
					AND59=(Token)match(input,AND,FOLLOW_AND_in_boolean_term654); 
					AND59_tree = (Object)adaptor.create(AND59);
					root_0 = (Object)adaptor.becomeRoot(AND59_tree, root_0);

					pushFollow(FOLLOW_boolean_factor_in_boolean_term657);
					boolean_factor60=boolean_factor();
					state._fsp--;

					adaptor.addChild(root_0, boolean_factor60.getTree());

					}
					break;

				default :
					break loop19;
				}
			}

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
	// $ANTLR end "boolean_term"


	public static class boolean_factor_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "boolean_factor"
	// CmisBaseGrammar.g:147:1: boolean_factor : ( NOT ^ boolean_test | boolean_test );
	public final CmisEcmGrammar_CmisBaseGrammar.boolean_factor_return boolean_factor() throws RecognitionException {
		CmisEcmGrammar_CmisBaseGrammar.boolean_factor_return retval = new CmisEcmGrammar_CmisBaseGrammar.boolean_factor_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NOT61=null;
		ParserRuleReturnScope boolean_test62 =null;
		ParserRuleReturnScope boolean_test63 =null;

		Object NOT61_tree=null;

		try {
			// CmisBaseGrammar.g:147:15: ( NOT ^ boolean_test | boolean_test )
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==NOT) ) {
				alt20=1;
			}
			else if ( (LA20_0==ANY||LA20_0==BOOL_LIT||LA20_0==CONTAINS||LA20_0==ID||LA20_0==IN_FOLDER||LA20_0==IN_TREE||LA20_0==LPAR||LA20_0==NUM_LIT||LA20_0==STRING_LIT||LA20_0==TIME_LIT) ) {
				alt20=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 20, 0, input);
				throw nvae;
			}

			switch (alt20) {
				case 1 :
					// CmisBaseGrammar.g:148:5: NOT ^ boolean_test
					{
					root_0 = (Object)adaptor.nil();


					NOT61=(Token)match(input,NOT,FOLLOW_NOT_in_boolean_factor670); 
					NOT61_tree = (Object)adaptor.create(NOT61);
					root_0 = (Object)adaptor.becomeRoot(NOT61_tree, root_0);

					pushFollow(FOLLOW_boolean_test_in_boolean_factor673);
					boolean_test62=boolean_test();
					state._fsp--;

					adaptor.addChild(root_0, boolean_test62.getTree());

					}
					break;
				case 2 :
					// CmisBaseGrammar.g:149:7: boolean_test
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_boolean_test_in_boolean_factor681);
					boolean_test63=boolean_test();
					state._fsp--;

					adaptor.addChild(root_0, boolean_test63.getTree());

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
	// $ANTLR end "boolean_factor"


	public static class boolean_test_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "boolean_test"
	// CmisBaseGrammar.g:152:1: boolean_test : ( predicate | LPAR search_condition RPAR -> search_condition );
	public final CmisEcmGrammar_CmisBaseGrammar.boolean_test_return boolean_test() throws RecognitionException {
		CmisEcmGrammar_CmisBaseGrammar.boolean_test_return retval = new CmisEcmGrammar_CmisBaseGrammar.boolean_test_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LPAR65=null;
		Token RPAR67=null;
		ParserRuleReturnScope predicate64 =null;
		ParserRuleReturnScope search_condition66 =null;

		Object LPAR65_tree=null;
		Object RPAR67_tree=null;
		RewriteRuleTokenStream stream_RPAR=new RewriteRuleTokenStream(adaptor,"token RPAR");
		RewriteRuleTokenStream stream_LPAR=new RewriteRuleTokenStream(adaptor,"token LPAR");
		RewriteRuleSubtreeStream stream_search_condition=new RewriteRuleSubtreeStream(adaptor,"rule search_condition");

		try {
			// CmisBaseGrammar.g:152:13: ( predicate | LPAR search_condition RPAR -> search_condition )
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==ANY||LA21_0==BOOL_LIT||LA21_0==CONTAINS||LA21_0==ID||LA21_0==IN_FOLDER||LA21_0==IN_TREE||LA21_0==NUM_LIT||LA21_0==STRING_LIT||LA21_0==TIME_LIT) ) {
				alt21=1;
			}
			else if ( (LA21_0==LPAR) ) {
				alt21=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}

			switch (alt21) {
				case 1 :
					// CmisBaseGrammar.g:153:7: predicate
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_predicate_in_boolean_test697);
					predicate64=predicate();
					state._fsp--;

					adaptor.addChild(root_0, predicate64.getTree());

					}
					break;
				case 2 :
					// CmisBaseGrammar.g:154:7: LPAR search_condition RPAR
					{
					LPAR65=(Token)match(input,LPAR,FOLLOW_LPAR_in_boolean_test705);  
					stream_LPAR.add(LPAR65);

					pushFollow(FOLLOW_search_condition_in_boolean_test707);
					search_condition66=search_condition();
					state._fsp--;

					stream_search_condition.add(search_condition66.getTree());
					RPAR67=(Token)match(input,RPAR,FOLLOW_RPAR_in_boolean_test709);  
					stream_RPAR.add(RPAR67);

					// AST REWRITE
					// elements: search_condition
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 154:34: -> search_condition
					{
						adaptor.addChild(root_0, stream_search_condition.nextTree());
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
	// $ANTLR end "boolean_test"


	public static class predicate_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "predicate"
	// CmisBaseGrammar.g:157:1: predicate : ( comparison_predicate | in_predicate | like_predicate | null_predicate | quantified_comparison_predicate | quantified_in_predicate | text_search_predicate | folder_predicate );
	public final CmisEcmGrammar_CmisBaseGrammar.predicate_return predicate() throws RecognitionException {
		CmisEcmGrammar_CmisBaseGrammar.predicate_return retval = new CmisEcmGrammar_CmisBaseGrammar.predicate_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope comparison_predicate68 =null;
		ParserRuleReturnScope in_predicate69 =null;
		ParserRuleReturnScope like_predicate70 =null;
		ParserRuleReturnScope null_predicate71 =null;
		ParserRuleReturnScope quantified_comparison_predicate72 =null;
		ParserRuleReturnScope quantified_in_predicate73 =null;
		ParserRuleReturnScope text_search_predicate74 =null;
		ParserRuleReturnScope folder_predicate75 =null;


		try {
			// CmisBaseGrammar.g:157:10: ( comparison_predicate | in_predicate | like_predicate | null_predicate | quantified_comparison_predicate | quantified_in_predicate | text_search_predicate | folder_predicate )
			int alt22=8;
			switch ( input.LA(1) ) {
			case ID:
				{
				switch ( input.LA(2) ) {
				case DOT:
					{
					int LA22_6 = input.LA(3);
					if ( (LA22_6==ID) ) {
						switch ( input.LA(4) ) {
						case EQ:
						case GT:
						case GTEQ:
						case LT:
						case LTEQ:
						case NEQ:
							{
							alt22=1;
							}
							break;
						case IN:
							{
							alt22=2;
							}
							break;
						case NOT:
							{
							int LA22_9 = input.LA(5);
							if ( (LA22_9==IN) ) {
								alt22=2;
							}
							else if ( (LA22_9==LIKE) ) {
								alt22=3;
							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 22, 9, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

							}
							break;
						case LIKE:
							{
							alt22=3;
							}
							break;
						case IS:
							{
							alt22=4;
							}
							break;
						default:
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 22, 12, input);
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
								new NoViableAltException("", 22, 6, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case EQ:
				case GT:
				case GTEQ:
				case LT:
				case LTEQ:
				case NEQ:
					{
					alt22=1;
					}
					break;
				case IN:
					{
					alt22=2;
					}
					break;
				case NOT:
					{
					int LA22_9 = input.LA(3);
					if ( (LA22_9==IN) ) {
						alt22=2;
					}
					else if ( (LA22_9==LIKE) ) {
						alt22=3;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 22, 9, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case LIKE:
					{
					alt22=3;
					}
					break;
				case IS:
					{
					alt22=4;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 22, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case BOOL_LIT:
			case NUM_LIT:
			case STRING_LIT:
			case TIME_LIT:
				{
				alt22=5;
				}
				break;
			case ANY:
				{
				alt22=6;
				}
				break;
			case CONTAINS:
				{
				alt22=7;
				}
				break;
			case IN_FOLDER:
			case IN_TREE:
				{
				alt22=8;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}
			switch (alt22) {
				case 1 :
					// CmisBaseGrammar.g:158:7: comparison_predicate
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_comparison_predicate_in_predicate731);
					comparison_predicate68=comparison_predicate();
					state._fsp--;

					adaptor.addChild(root_0, comparison_predicate68.getTree());

					}
					break;
				case 2 :
					// CmisBaseGrammar.g:159:7: in_predicate
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_in_predicate_in_predicate739);
					in_predicate69=in_predicate();
					state._fsp--;

					adaptor.addChild(root_0, in_predicate69.getTree());

					}
					break;
				case 3 :
					// CmisBaseGrammar.g:160:7: like_predicate
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_like_predicate_in_predicate747);
					like_predicate70=like_predicate();
					state._fsp--;

					adaptor.addChild(root_0, like_predicate70.getTree());

					}
					break;
				case 4 :
					// CmisBaseGrammar.g:161:7: null_predicate
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_null_predicate_in_predicate755);
					null_predicate71=null_predicate();
					state._fsp--;

					adaptor.addChild(root_0, null_predicate71.getTree());

					}
					break;
				case 5 :
					// CmisBaseGrammar.g:162:7: quantified_comparison_predicate
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_quantified_comparison_predicate_in_predicate763);
					quantified_comparison_predicate72=quantified_comparison_predicate();
					state._fsp--;

					adaptor.addChild(root_0, quantified_comparison_predicate72.getTree());

					}
					break;
				case 6 :
					// CmisBaseGrammar.g:163:7: quantified_in_predicate
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_quantified_in_predicate_in_predicate771);
					quantified_in_predicate73=quantified_in_predicate();
					state._fsp--;

					adaptor.addChild(root_0, quantified_in_predicate73.getTree());

					}
					break;
				case 7 :
					// CmisBaseGrammar.g:164:7: text_search_predicate
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_text_search_predicate_in_predicate779);
					text_search_predicate74=text_search_predicate();
					state._fsp--;

					adaptor.addChild(root_0, text_search_predicate74.getTree());

					}
					break;
				case 8 :
					// CmisBaseGrammar.g:165:7: folder_predicate
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_folder_predicate_in_predicate787);
					folder_predicate75=folder_predicate();
					state._fsp--;

					adaptor.addChild(root_0, folder_predicate75.getTree());

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
	// $ANTLR end "predicate"


	public static class comparison_predicate_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "comparison_predicate"
	// CmisBaseGrammar.g:168:1: comparison_predicate : ( column_reference EQ literal -> ^( EQ column_reference literal ) | column_reference NEQ literal -> ^( NEQ column_reference literal ) | column_reference LT literal -> ^( LT column_reference literal ) | column_reference GT literal -> ^( GT column_reference literal ) | column_reference LTEQ literal -> ^( LTEQ column_reference literal ) | column_reference GTEQ literal -> ^( GTEQ column_reference literal ) );
	public final CmisEcmGrammar_CmisBaseGrammar.comparison_predicate_return comparison_predicate() throws RecognitionException {
		CmisEcmGrammar_CmisBaseGrammar.comparison_predicate_return retval = new CmisEcmGrammar_CmisBaseGrammar.comparison_predicate_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token EQ77=null;
		Token NEQ80=null;
		Token LT83=null;
		Token GT86=null;
		Token LTEQ89=null;
		Token GTEQ92=null;
		ParserRuleReturnScope column_reference76 =null;
		ParserRuleReturnScope literal78 =null;
		ParserRuleReturnScope column_reference79 =null;
		ParserRuleReturnScope literal81 =null;
		ParserRuleReturnScope column_reference82 =null;
		ParserRuleReturnScope literal84 =null;
		ParserRuleReturnScope column_reference85 =null;
		ParserRuleReturnScope literal87 =null;
		ParserRuleReturnScope column_reference88 =null;
		ParserRuleReturnScope literal90 =null;
		ParserRuleReturnScope column_reference91 =null;
		ParserRuleReturnScope literal93 =null;

		Object EQ77_tree=null;
		Object NEQ80_tree=null;
		Object LT83_tree=null;
		Object GT86_tree=null;
		Object LTEQ89_tree=null;
		Object GTEQ92_tree=null;
		RewriteRuleTokenStream stream_GT=new RewriteRuleTokenStream(adaptor,"token GT");
		RewriteRuleTokenStream stream_LT=new RewriteRuleTokenStream(adaptor,"token LT");
		RewriteRuleTokenStream stream_NEQ=new RewriteRuleTokenStream(adaptor,"token NEQ");
		RewriteRuleTokenStream stream_GTEQ=new RewriteRuleTokenStream(adaptor,"token GTEQ");
		RewriteRuleTokenStream stream_EQ=new RewriteRuleTokenStream(adaptor,"token EQ");
		RewriteRuleTokenStream stream_LTEQ=new RewriteRuleTokenStream(adaptor,"token LTEQ");
		RewriteRuleSubtreeStream stream_column_reference=new RewriteRuleSubtreeStream(adaptor,"rule column_reference");
		RewriteRuleSubtreeStream stream_literal=new RewriteRuleSubtreeStream(adaptor,"rule literal");

		try {
			// CmisBaseGrammar.g:168:21: ( column_reference EQ literal -> ^( EQ column_reference literal ) | column_reference NEQ literal -> ^( NEQ column_reference literal ) | column_reference LT literal -> ^( LT column_reference literal ) | column_reference GT literal -> ^( GT column_reference literal ) | column_reference LTEQ literal -> ^( LTEQ column_reference literal ) | column_reference GTEQ literal -> ^( GTEQ column_reference literal ) )
			int alt23=6;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==ID) ) {
				switch ( input.LA(2) ) {
				case DOT:
					{
					int LA23_2 = input.LA(3);
					if ( (LA23_2==ID) ) {
						switch ( input.LA(4) ) {
						case EQ:
							{
							alt23=1;
							}
							break;
						case NEQ:
							{
							alt23=2;
							}
							break;
						case LT:
							{
							alt23=3;
							}
							break;
						case GT:
							{
							alt23=4;
							}
							break;
						case LTEQ:
							{
							alt23=5;
							}
							break;
						case GTEQ:
							{
							alt23=6;
							}
							break;
						default:
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 23, 9, input);
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
								new NoViableAltException("", 23, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case EQ:
					{
					alt23=1;
					}
					break;
				case NEQ:
					{
					alt23=2;
					}
					break;
				case LT:
					{
					alt23=3;
					}
					break;
				case GT:
					{
					alt23=4;
					}
					break;
				case LTEQ:
					{
					alt23=5;
					}
					break;
				case GTEQ:
					{
					alt23=6;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 23, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 23, 0, input);
				throw nvae;
			}

			switch (alt23) {
				case 1 :
					// CmisBaseGrammar.g:169:5: column_reference EQ literal
					{
					pushFollow(FOLLOW_column_reference_in_comparison_predicate803);
					column_reference76=column_reference();
					state._fsp--;

					stream_column_reference.add(column_reference76.getTree());
					EQ77=(Token)match(input,EQ,FOLLOW_EQ_in_comparison_predicate805);  
					stream_EQ.add(EQ77);

					pushFollow(FOLLOW_literal_in_comparison_predicate807);
					literal78=literal();
					state._fsp--;

					stream_literal.add(literal78.getTree());
					// AST REWRITE
					// elements: column_reference, EQ, literal
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 170:7: -> ^( EQ column_reference literal )
					{
						// CmisBaseGrammar.g:170:10: ^( EQ column_reference literal )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(stream_EQ.nextNode(), root_1);
						adaptor.addChild(root_1, stream_column_reference.nextTree());
						adaptor.addChild(root_1, stream_literal.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// CmisBaseGrammar.g:171:7: column_reference NEQ literal
					{
					pushFollow(FOLLOW_column_reference_in_comparison_predicate831);
					column_reference79=column_reference();
					state._fsp--;

					stream_column_reference.add(column_reference79.getTree());
					NEQ80=(Token)match(input,NEQ,FOLLOW_NEQ_in_comparison_predicate833);  
					stream_NEQ.add(NEQ80);

					pushFollow(FOLLOW_literal_in_comparison_predicate835);
					literal81=literal();
					state._fsp--;

					stream_literal.add(literal81.getTree());
					// AST REWRITE
					// elements: NEQ, column_reference, literal
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 172:7: -> ^( NEQ column_reference literal )
					{
						// CmisBaseGrammar.g:172:10: ^( NEQ column_reference literal )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(stream_NEQ.nextNode(), root_1);
						adaptor.addChild(root_1, stream_column_reference.nextTree());
						adaptor.addChild(root_1, stream_literal.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// CmisBaseGrammar.g:173:7: column_reference LT literal
					{
					pushFollow(FOLLOW_column_reference_in_comparison_predicate859);
					column_reference82=column_reference();
					state._fsp--;

					stream_column_reference.add(column_reference82.getTree());
					LT83=(Token)match(input,LT,FOLLOW_LT_in_comparison_predicate861);  
					stream_LT.add(LT83);

					pushFollow(FOLLOW_literal_in_comparison_predicate863);
					literal84=literal();
					state._fsp--;

					stream_literal.add(literal84.getTree());
					// AST REWRITE
					// elements: literal, LT, column_reference
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 174:7: -> ^( LT column_reference literal )
					{
						// CmisBaseGrammar.g:174:10: ^( LT column_reference literal )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(stream_LT.nextNode(), root_1);
						adaptor.addChild(root_1, stream_column_reference.nextTree());
						adaptor.addChild(root_1, stream_literal.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					// CmisBaseGrammar.g:175:7: column_reference GT literal
					{
					pushFollow(FOLLOW_column_reference_in_comparison_predicate887);
					column_reference85=column_reference();
					state._fsp--;

					stream_column_reference.add(column_reference85.getTree());
					GT86=(Token)match(input,GT,FOLLOW_GT_in_comparison_predicate889);  
					stream_GT.add(GT86);

					pushFollow(FOLLOW_literal_in_comparison_predicate891);
					literal87=literal();
					state._fsp--;

					stream_literal.add(literal87.getTree());
					// AST REWRITE
					// elements: literal, column_reference, GT
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 176:7: -> ^( GT column_reference literal )
					{
						// CmisBaseGrammar.g:176:10: ^( GT column_reference literal )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(stream_GT.nextNode(), root_1);
						adaptor.addChild(root_1, stream_column_reference.nextTree());
						adaptor.addChild(root_1, stream_literal.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 5 :
					// CmisBaseGrammar.g:177:7: column_reference LTEQ literal
					{
					pushFollow(FOLLOW_column_reference_in_comparison_predicate915);
					column_reference88=column_reference();
					state._fsp--;

					stream_column_reference.add(column_reference88.getTree());
					LTEQ89=(Token)match(input,LTEQ,FOLLOW_LTEQ_in_comparison_predicate917);  
					stream_LTEQ.add(LTEQ89);

					pushFollow(FOLLOW_literal_in_comparison_predicate919);
					literal90=literal();
					state._fsp--;

					stream_literal.add(literal90.getTree());
					// AST REWRITE
					// elements: column_reference, literal, LTEQ
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 178:7: -> ^( LTEQ column_reference literal )
					{
						// CmisBaseGrammar.g:178:10: ^( LTEQ column_reference literal )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(stream_LTEQ.nextNode(), root_1);
						adaptor.addChild(root_1, stream_column_reference.nextTree());
						adaptor.addChild(root_1, stream_literal.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 6 :
					// CmisBaseGrammar.g:179:7: column_reference GTEQ literal
					{
					pushFollow(FOLLOW_column_reference_in_comparison_predicate943);
					column_reference91=column_reference();
					state._fsp--;

					stream_column_reference.add(column_reference91.getTree());
					GTEQ92=(Token)match(input,GTEQ,FOLLOW_GTEQ_in_comparison_predicate945);  
					stream_GTEQ.add(GTEQ92);

					pushFollow(FOLLOW_literal_in_comparison_predicate947);
					literal93=literal();
					state._fsp--;

					stream_literal.add(literal93.getTree());
					// AST REWRITE
					// elements: column_reference, GTEQ, literal
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 180:7: -> ^( GTEQ column_reference literal )
					{
						// CmisBaseGrammar.g:180:10: ^( GTEQ column_reference literal )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(stream_GTEQ.nextNode(), root_1);
						adaptor.addChild(root_1, stream_column_reference.nextTree());
						adaptor.addChild(root_1, stream_literal.nextTree());
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
	// $ANTLR end "comparison_predicate"


	public static class literal_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "literal"
	// CmisBaseGrammar.g:183:1: literal : ( NUM_LIT | STRING_LIT | TIME_LIT | BOOL_LIT );
	public final CmisEcmGrammar_CmisBaseGrammar.literal_return literal() throws RecognitionException {
		CmisEcmGrammar_CmisBaseGrammar.literal_return retval = new CmisEcmGrammar_CmisBaseGrammar.literal_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set94=null;

		Object set94_tree=null;

		try {
			// CmisBaseGrammar.g:183:8: ( NUM_LIT | STRING_LIT | TIME_LIT | BOOL_LIT )
			// CmisBaseGrammar.g:
			{
			root_0 = (Object)adaptor.nil();


			set94=input.LT(1);
			if ( input.LA(1)==BOOL_LIT||input.LA(1)==NUM_LIT||input.LA(1)==STRING_LIT||input.LA(1)==TIME_LIT ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set94));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
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
	// $ANTLR end "literal"


	public static class in_predicate_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "in_predicate"
	// CmisBaseGrammar.g:190:1: in_predicate : ( column_reference IN LPAR in_value_list RPAR -> ^( IN column_reference in_value_list ) | column_reference NOT IN LPAR in_value_list RPAR -> ^( NOT_IN column_reference in_value_list ) );
	public final CmisEcmGrammar_CmisBaseGrammar.in_predicate_return in_predicate() throws RecognitionException {
		CmisEcmGrammar_CmisBaseGrammar.in_predicate_return retval = new CmisEcmGrammar_CmisBaseGrammar.in_predicate_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IN96=null;
		Token LPAR97=null;
		Token RPAR99=null;
		Token NOT101=null;
		Token IN102=null;
		Token LPAR103=null;
		Token RPAR105=null;
		ParserRuleReturnScope column_reference95 =null;
		ParserRuleReturnScope in_value_list98 =null;
		ParserRuleReturnScope column_reference100 =null;
		ParserRuleReturnScope in_value_list104 =null;

		Object IN96_tree=null;
		Object LPAR97_tree=null;
		Object RPAR99_tree=null;
		Object NOT101_tree=null;
		Object IN102_tree=null;
		Object LPAR103_tree=null;
		Object RPAR105_tree=null;
		RewriteRuleTokenStream stream_RPAR=new RewriteRuleTokenStream(adaptor,"token RPAR");
		RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
		RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
		RewriteRuleTokenStream stream_LPAR=new RewriteRuleTokenStream(adaptor,"token LPAR");
		RewriteRuleSubtreeStream stream_column_reference=new RewriteRuleSubtreeStream(adaptor,"rule column_reference");
		RewriteRuleSubtreeStream stream_in_value_list=new RewriteRuleSubtreeStream(adaptor,"rule in_value_list");

		try {
			// CmisBaseGrammar.g:190:13: ( column_reference IN LPAR in_value_list RPAR -> ^( IN column_reference in_value_list ) | column_reference NOT IN LPAR in_value_list RPAR -> ^( NOT_IN column_reference in_value_list ) )
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==ID) ) {
				switch ( input.LA(2) ) {
				case DOT:
					{
					int LA24_2 = input.LA(3);
					if ( (LA24_2==ID) ) {
						int LA24_5 = input.LA(4);
						if ( (LA24_5==IN) ) {
							alt24=1;
						}
						else if ( (LA24_5==NOT) ) {
							alt24=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 24, 5, input);
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
								new NoViableAltException("", 24, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case IN:
					{
					alt24=1;
					}
					break;
				case NOT:
					{
					alt24=2;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 24, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				throw nvae;
			}

			switch (alt24) {
				case 1 :
					// CmisBaseGrammar.g:191:7: column_reference IN LPAR in_value_list RPAR
					{
					pushFollow(FOLLOW_column_reference_in_in_predicate1023);
					column_reference95=column_reference();
					state._fsp--;

					stream_column_reference.add(column_reference95.getTree());
					IN96=(Token)match(input,IN,FOLLOW_IN_in_in_predicate1025);  
					stream_IN.add(IN96);

					LPAR97=(Token)match(input,LPAR,FOLLOW_LPAR_in_in_predicate1027);  
					stream_LPAR.add(LPAR97);

					pushFollow(FOLLOW_in_value_list_in_in_predicate1029);
					in_value_list98=in_value_list();
					state._fsp--;

					stream_in_value_list.add(in_value_list98.getTree());
					RPAR99=(Token)match(input,RPAR,FOLLOW_RPAR_in_in_predicate1031);  
					stream_RPAR.add(RPAR99);

					// AST REWRITE
					// elements: column_reference, in_value_list, IN
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 192:9: -> ^( IN column_reference in_value_list )
					{
						// CmisBaseGrammar.g:192:12: ^( IN column_reference in_value_list )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(stream_IN.nextNode(), root_1);
						adaptor.addChild(root_1, stream_column_reference.nextTree());
						adaptor.addChild(root_1, stream_in_value_list.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// CmisBaseGrammar.g:193:7: column_reference NOT IN LPAR in_value_list RPAR
					{
					pushFollow(FOLLOW_column_reference_in_in_predicate1057);
					column_reference100=column_reference();
					state._fsp--;

					stream_column_reference.add(column_reference100.getTree());
					NOT101=(Token)match(input,NOT,FOLLOW_NOT_in_in_predicate1059);  
					stream_NOT.add(NOT101);

					IN102=(Token)match(input,IN,FOLLOW_IN_in_in_predicate1061);  
					stream_IN.add(IN102);

					LPAR103=(Token)match(input,LPAR,FOLLOW_LPAR_in_in_predicate1063);  
					stream_LPAR.add(LPAR103);

					pushFollow(FOLLOW_in_value_list_in_in_predicate1065);
					in_value_list104=in_value_list();
					state._fsp--;

					stream_in_value_list.add(in_value_list104.getTree());
					RPAR105=(Token)match(input,RPAR,FOLLOW_RPAR_in_in_predicate1067);  
					stream_RPAR.add(RPAR105);

					// AST REWRITE
					// elements: in_value_list, column_reference
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 194:9: -> ^( NOT_IN column_reference in_value_list )
					{
						// CmisBaseGrammar.g:194:12: ^( NOT_IN column_reference in_value_list )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NOT_IN, "NOT_IN"), root_1);
						adaptor.addChild(root_1, stream_column_reference.nextTree());
						adaptor.addChild(root_1, stream_in_value_list.nextTree());
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
	// $ANTLR end "in_predicate"


	public static class in_value_list_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "in_value_list"
	// CmisBaseGrammar.g:197:1: in_value_list : literal ( COMMA literal )* -> ^( IN_LIST ( literal )+ ) ;
	public final CmisEcmGrammar_CmisBaseGrammar.in_value_list_return in_value_list() throws RecognitionException {
		CmisEcmGrammar_CmisBaseGrammar.in_value_list_return retval = new CmisEcmGrammar_CmisBaseGrammar.in_value_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token COMMA107=null;
		ParserRuleReturnScope literal106 =null;
		ParserRuleReturnScope literal108 =null;

		Object COMMA107_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_literal=new RewriteRuleSubtreeStream(adaptor,"rule literal");

		try {
			// CmisBaseGrammar.g:197:14: ( literal ( COMMA literal )* -> ^( IN_LIST ( literal )+ ) )
			// CmisBaseGrammar.g:198:5: literal ( COMMA literal )*
			{
			pushFollow(FOLLOW_literal_in_in_value_list1101);
			literal106=literal();
			state._fsp--;

			stream_literal.add(literal106.getTree());
			// CmisBaseGrammar.g:198:13: ( COMMA literal )*
			loop25:
			while (true) {
				int alt25=2;
				int LA25_0 = input.LA(1);
				if ( (LA25_0==COMMA) ) {
					alt25=1;
				}

				switch (alt25) {
				case 1 :
					// CmisBaseGrammar.g:198:15: COMMA literal
					{
					COMMA107=(Token)match(input,COMMA,FOLLOW_COMMA_in_in_value_list1105);  
					stream_COMMA.add(COMMA107);

					pushFollow(FOLLOW_literal_in_in_value_list1107);
					literal108=literal();
					state._fsp--;

					stream_literal.add(literal108.getTree());
					}
					break;

				default :
					break loop25;
				}
			}

			// AST REWRITE
			// elements: literal
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 199:7: -> ^( IN_LIST ( literal )+ )
			{
				// CmisBaseGrammar.g:199:10: ^( IN_LIST ( literal )+ )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IN_LIST, "IN_LIST"), root_1);
				if ( !(stream_literal.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_literal.hasNext() ) {
					adaptor.addChild(root_1, stream_literal.nextTree());
				}
				stream_literal.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

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
	// $ANTLR end "in_value_list"


	public static class like_predicate_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "like_predicate"
	// CmisBaseGrammar.g:202:1: like_predicate : ( column_reference LIKE STRING_LIT -> ^( LIKE column_reference STRING_LIT ) | column_reference NOT LIKE STRING_LIT -> ^( NOT_LIKE column_reference STRING_LIT ) );
	public final CmisEcmGrammar_CmisBaseGrammar.like_predicate_return like_predicate() throws RecognitionException {
		CmisEcmGrammar_CmisBaseGrammar.like_predicate_return retval = new CmisEcmGrammar_CmisBaseGrammar.like_predicate_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LIKE110=null;
		Token STRING_LIT111=null;
		Token NOT113=null;
		Token LIKE114=null;
		Token STRING_LIT115=null;
		ParserRuleReturnScope column_reference109 =null;
		ParserRuleReturnScope column_reference112 =null;

		Object LIKE110_tree=null;
		Object STRING_LIT111_tree=null;
		Object NOT113_tree=null;
		Object LIKE114_tree=null;
		Object STRING_LIT115_tree=null;
		RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
		RewriteRuleTokenStream stream_STRING_LIT=new RewriteRuleTokenStream(adaptor,"token STRING_LIT");
		RewriteRuleTokenStream stream_LIKE=new RewriteRuleTokenStream(adaptor,"token LIKE");
		RewriteRuleSubtreeStream stream_column_reference=new RewriteRuleSubtreeStream(adaptor,"rule column_reference");

		try {
			// CmisBaseGrammar.g:202:15: ( column_reference LIKE STRING_LIT -> ^( LIKE column_reference STRING_LIT ) | column_reference NOT LIKE STRING_LIT -> ^( NOT_LIKE column_reference STRING_LIT ) )
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==ID) ) {
				switch ( input.LA(2) ) {
				case DOT:
					{
					int LA26_2 = input.LA(3);
					if ( (LA26_2==ID) ) {
						int LA26_5 = input.LA(4);
						if ( (LA26_5==LIKE) ) {
							alt26=1;
						}
						else if ( (LA26_5==NOT) ) {
							alt26=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 26, 5, input);
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
								new NoViableAltException("", 26, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case LIKE:
					{
					alt26=1;
					}
					break;
				case NOT:
					{
					alt26=2;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 26, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 26, 0, input);
				throw nvae;
			}

			switch (alt26) {
				case 1 :
					// CmisBaseGrammar.g:203:7: column_reference LIKE STRING_LIT
					{
					pushFollow(FOLLOW_column_reference_in_like_predicate1143);
					column_reference109=column_reference();
					state._fsp--;

					stream_column_reference.add(column_reference109.getTree());
					LIKE110=(Token)match(input,LIKE,FOLLOW_LIKE_in_like_predicate1145);  
					stream_LIKE.add(LIKE110);

					STRING_LIT111=(Token)match(input,STRING_LIT,FOLLOW_STRING_LIT_in_like_predicate1147);  
					stream_STRING_LIT.add(STRING_LIT111);

					// AST REWRITE
					// elements: LIKE, STRING_LIT, column_reference
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 204:9: -> ^( LIKE column_reference STRING_LIT )
					{
						// CmisBaseGrammar.g:204:12: ^( LIKE column_reference STRING_LIT )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(stream_LIKE.nextNode(), root_1);
						adaptor.addChild(root_1, stream_column_reference.nextTree());
						adaptor.addChild(root_1, stream_STRING_LIT.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// CmisBaseGrammar.g:205:7: column_reference NOT LIKE STRING_LIT
					{
					pushFollow(FOLLOW_column_reference_in_like_predicate1173);
					column_reference112=column_reference();
					state._fsp--;

					stream_column_reference.add(column_reference112.getTree());
					NOT113=(Token)match(input,NOT,FOLLOW_NOT_in_like_predicate1175);  
					stream_NOT.add(NOT113);

					LIKE114=(Token)match(input,LIKE,FOLLOW_LIKE_in_like_predicate1177);  
					stream_LIKE.add(LIKE114);

					STRING_LIT115=(Token)match(input,STRING_LIT,FOLLOW_STRING_LIT_in_like_predicate1179);  
					stream_STRING_LIT.add(STRING_LIT115);

					// AST REWRITE
					// elements: column_reference, STRING_LIT
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 206:9: -> ^( NOT_LIKE column_reference STRING_LIT )
					{
						// CmisBaseGrammar.g:206:12: ^( NOT_LIKE column_reference STRING_LIT )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NOT_LIKE, "NOT_LIKE"), root_1);
						adaptor.addChild(root_1, stream_column_reference.nextTree());
						adaptor.addChild(root_1, stream_STRING_LIT.nextNode());
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
	// $ANTLR end "like_predicate"


	public static class null_predicate_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "null_predicate"
	// CmisBaseGrammar.g:209:1: null_predicate : column_reference IS ( NOT NULL -> ^( IS_NOT_NULL column_reference ) | NULL -> ^( IS_NULL column_reference ) ) ;
	public final CmisEcmGrammar_CmisBaseGrammar.null_predicate_return null_predicate() throws RecognitionException {
		CmisEcmGrammar_CmisBaseGrammar.null_predicate_return retval = new CmisEcmGrammar_CmisBaseGrammar.null_predicate_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IS117=null;
		Token NOT118=null;
		Token NULL119=null;
		Token NULL120=null;
		ParserRuleReturnScope column_reference116 =null;

		Object IS117_tree=null;
		Object NOT118_tree=null;
		Object NULL119_tree=null;
		Object NULL120_tree=null;
		RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
		RewriteRuleTokenStream stream_IS=new RewriteRuleTokenStream(adaptor,"token IS");
		RewriteRuleTokenStream stream_NULL=new RewriteRuleTokenStream(adaptor,"token NULL");
		RewriteRuleSubtreeStream stream_column_reference=new RewriteRuleSubtreeStream(adaptor,"rule column_reference");

		try {
			// CmisBaseGrammar.g:209:15: ( column_reference IS ( NOT NULL -> ^( IS_NOT_NULL column_reference ) | NULL -> ^( IS_NULL column_reference ) ) )
			// CmisBaseGrammar.g:212:5: column_reference IS ( NOT NULL -> ^( IS_NOT_NULL column_reference ) | NULL -> ^( IS_NULL column_reference ) )
			{
			pushFollow(FOLLOW_column_reference_in_null_predicate1223);
			column_reference116=column_reference();
			state._fsp--;

			stream_column_reference.add(column_reference116.getTree());
			IS117=(Token)match(input,IS,FOLLOW_IS_in_null_predicate1225);  
			stream_IS.add(IS117);

			// CmisBaseGrammar.g:213:7: ( NOT NULL -> ^( IS_NOT_NULL column_reference ) | NULL -> ^( IS_NULL column_reference ) )
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0==NOT) ) {
				alt27=1;
			}
			else if ( (LA27_0==NULL) ) {
				alt27=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 27, 0, input);
				throw nvae;
			}

			switch (alt27) {
				case 1 :
					// CmisBaseGrammar.g:213:9: NOT NULL
					{
					NOT118=(Token)match(input,NOT,FOLLOW_NOT_in_null_predicate1235);  
					stream_NOT.add(NOT118);

					NULL119=(Token)match(input,NULL,FOLLOW_NULL_in_null_predicate1237);  
					stream_NULL.add(NULL119);

					// AST REWRITE
					// elements: column_reference
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 213:18: -> ^( IS_NOT_NULL column_reference )
					{
						// CmisBaseGrammar.g:213:21: ^( IS_NOT_NULL column_reference )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IS_NOT_NULL, "IS_NOT_NULL"), root_1);
						adaptor.addChild(root_1, stream_column_reference.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// CmisBaseGrammar.g:214:9: NULL
					{
					NULL120=(Token)match(input,NULL,FOLLOW_NULL_in_null_predicate1255);  
					stream_NULL.add(NULL120);

					// AST REWRITE
					// elements: column_reference
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 214:18: -> ^( IS_NULL column_reference )
					{
						// CmisBaseGrammar.g:214:21: ^( IS_NULL column_reference )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IS_NULL, "IS_NULL"), root_1);
						adaptor.addChild(root_1, stream_column_reference.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}

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
	// $ANTLR end "null_predicate"


	public static class quantified_comparison_predicate_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "quantified_comparison_predicate"
	// CmisBaseGrammar.g:218:1: quantified_comparison_predicate : literal EQ ANY multi_valued_column_reference -> ^( EQ_ANY literal multi_valued_column_reference ) ;
	public final CmisEcmGrammar_CmisBaseGrammar.quantified_comparison_predicate_return quantified_comparison_predicate() throws RecognitionException {
		CmisEcmGrammar_CmisBaseGrammar.quantified_comparison_predicate_return retval = new CmisEcmGrammar_CmisBaseGrammar.quantified_comparison_predicate_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token EQ122=null;
		Token ANY123=null;
		ParserRuleReturnScope literal121 =null;
		ParserRuleReturnScope multi_valued_column_reference124 =null;

		Object EQ122_tree=null;
		Object ANY123_tree=null;
		RewriteRuleTokenStream stream_ANY=new RewriteRuleTokenStream(adaptor,"token ANY");
		RewriteRuleTokenStream stream_EQ=new RewriteRuleTokenStream(adaptor,"token EQ");
		RewriteRuleSubtreeStream stream_multi_valued_column_reference=new RewriteRuleSubtreeStream(adaptor,"rule multi_valued_column_reference");
		RewriteRuleSubtreeStream stream_literal=new RewriteRuleSubtreeStream(adaptor,"rule literal");

		try {
			// CmisBaseGrammar.g:218:32: ( literal EQ ANY multi_valued_column_reference -> ^( EQ_ANY literal multi_valued_column_reference ) )
			// CmisBaseGrammar.g:219:5: literal EQ ANY multi_valued_column_reference
			{
			pushFollow(FOLLOW_literal_in_quantified_comparison_predicate1295);
			literal121=literal();
			state._fsp--;

			stream_literal.add(literal121.getTree());
			EQ122=(Token)match(input,EQ,FOLLOW_EQ_in_quantified_comparison_predicate1297);  
			stream_EQ.add(EQ122);

			ANY123=(Token)match(input,ANY,FOLLOW_ANY_in_quantified_comparison_predicate1299);  
			stream_ANY.add(ANY123);

			pushFollow(FOLLOW_multi_valued_column_reference_in_quantified_comparison_predicate1301);
			multi_valued_column_reference124=multi_valued_column_reference();
			state._fsp--;

			stream_multi_valued_column_reference.add(multi_valued_column_reference124.getTree());
			// AST REWRITE
			// elements: multi_valued_column_reference, literal
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 220:7: -> ^( EQ_ANY literal multi_valued_column_reference )
			{
				// CmisBaseGrammar.g:220:10: ^( EQ_ANY literal multi_valued_column_reference )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EQ_ANY, "EQ_ANY"), root_1);
				adaptor.addChild(root_1, stream_literal.nextTree());
				adaptor.addChild(root_1, stream_multi_valued_column_reference.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

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
	// $ANTLR end "quantified_comparison_predicate"


	public static class quantified_in_predicate_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "quantified_in_predicate"
	// CmisBaseGrammar.g:223:1: quantified_in_predicate : ANY multi_valued_column_reference ( NOT IN LPAR in_value_list RPAR -> ^( NOT_IN_ANY multi_valued_column_reference in_value_list ) | IN LPAR in_value_list RPAR -> ^( IN_ANY multi_valued_column_reference in_value_list ) ) ;
	public final CmisEcmGrammar_CmisBaseGrammar.quantified_in_predicate_return quantified_in_predicate() throws RecognitionException {
		CmisEcmGrammar_CmisBaseGrammar.quantified_in_predicate_return retval = new CmisEcmGrammar_CmisBaseGrammar.quantified_in_predicate_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ANY125=null;
		Token NOT127=null;
		Token IN128=null;
		Token LPAR129=null;
		Token RPAR131=null;
		Token IN132=null;
		Token LPAR133=null;
		Token RPAR135=null;
		ParserRuleReturnScope multi_valued_column_reference126 =null;
		ParserRuleReturnScope in_value_list130 =null;
		ParserRuleReturnScope in_value_list134 =null;

		Object ANY125_tree=null;
		Object NOT127_tree=null;
		Object IN128_tree=null;
		Object LPAR129_tree=null;
		Object RPAR131_tree=null;
		Object IN132_tree=null;
		Object LPAR133_tree=null;
		Object RPAR135_tree=null;
		RewriteRuleTokenStream stream_RPAR=new RewriteRuleTokenStream(adaptor,"token RPAR");
		RewriteRuleTokenStream stream_ANY=new RewriteRuleTokenStream(adaptor,"token ANY");
		RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
		RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
		RewriteRuleTokenStream stream_LPAR=new RewriteRuleTokenStream(adaptor,"token LPAR");
		RewriteRuleSubtreeStream stream_in_value_list=new RewriteRuleSubtreeStream(adaptor,"rule in_value_list");
		RewriteRuleSubtreeStream stream_multi_valued_column_reference=new RewriteRuleSubtreeStream(adaptor,"rule multi_valued_column_reference");

		try {
			// CmisBaseGrammar.g:223:24: ( ANY multi_valued_column_reference ( NOT IN LPAR in_value_list RPAR -> ^( NOT_IN_ANY multi_valued_column_reference in_value_list ) | IN LPAR in_value_list RPAR -> ^( IN_ANY multi_valued_column_reference in_value_list ) ) )
			// CmisBaseGrammar.g:224:5: ANY multi_valued_column_reference ( NOT IN LPAR in_value_list RPAR -> ^( NOT_IN_ANY multi_valued_column_reference in_value_list ) | IN LPAR in_value_list RPAR -> ^( IN_ANY multi_valued_column_reference in_value_list ) )
			{
			ANY125=(Token)match(input,ANY,FOLLOW_ANY_in_quantified_in_predicate1333);  
			stream_ANY.add(ANY125);

			pushFollow(FOLLOW_multi_valued_column_reference_in_quantified_in_predicate1335);
			multi_valued_column_reference126=multi_valued_column_reference();
			state._fsp--;

			stream_multi_valued_column_reference.add(multi_valued_column_reference126.getTree());
			// CmisBaseGrammar.g:225:7: ( NOT IN LPAR in_value_list RPAR -> ^( NOT_IN_ANY multi_valued_column_reference in_value_list ) | IN LPAR in_value_list RPAR -> ^( IN_ANY multi_valued_column_reference in_value_list ) )
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==NOT) ) {
				alt28=1;
			}
			else if ( (LA28_0==IN) ) {
				alt28=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 28, 0, input);
				throw nvae;
			}

			switch (alt28) {
				case 1 :
					// CmisBaseGrammar.g:225:9: NOT IN LPAR in_value_list RPAR
					{
					NOT127=(Token)match(input,NOT,FOLLOW_NOT_in_quantified_in_predicate1345);  
					stream_NOT.add(NOT127);

					IN128=(Token)match(input,IN,FOLLOW_IN_in_quantified_in_predicate1347);  
					stream_IN.add(IN128);

					LPAR129=(Token)match(input,LPAR,FOLLOW_LPAR_in_quantified_in_predicate1349);  
					stream_LPAR.add(LPAR129);

					pushFollow(FOLLOW_in_value_list_in_quantified_in_predicate1351);
					in_value_list130=in_value_list();
					state._fsp--;

					stream_in_value_list.add(in_value_list130.getTree());
					RPAR131=(Token)match(input,RPAR,FOLLOW_RPAR_in_quantified_in_predicate1353);  
					stream_RPAR.add(RPAR131);

					// AST REWRITE
					// elements: multi_valued_column_reference, in_value_list
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 226:11: -> ^( NOT_IN_ANY multi_valued_column_reference in_value_list )
					{
						// CmisBaseGrammar.g:226:14: ^( NOT_IN_ANY multi_valued_column_reference in_value_list )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NOT_IN_ANY, "NOT_IN_ANY"), root_1);
						adaptor.addChild(root_1, stream_multi_valued_column_reference.nextTree());
						adaptor.addChild(root_1, stream_in_value_list.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// CmisBaseGrammar.g:227:9: IN LPAR in_value_list RPAR
					{
					IN132=(Token)match(input,IN,FOLLOW_IN_in_quantified_in_predicate1384);  
					stream_IN.add(IN132);

					LPAR133=(Token)match(input,LPAR,FOLLOW_LPAR_in_quantified_in_predicate1390);  
					stream_LPAR.add(LPAR133);

					pushFollow(FOLLOW_in_value_list_in_quantified_in_predicate1392);
					in_value_list134=in_value_list();
					state._fsp--;

					stream_in_value_list.add(in_value_list134.getTree());
					RPAR135=(Token)match(input,RPAR,FOLLOW_RPAR_in_quantified_in_predicate1394);  
					stream_RPAR.add(RPAR135);

					// AST REWRITE
					// elements: multi_valued_column_reference, in_value_list
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 228:11: -> ^( IN_ANY multi_valued_column_reference in_value_list )
					{
						// CmisBaseGrammar.g:228:14: ^( IN_ANY multi_valued_column_reference in_value_list )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IN_ANY, "IN_ANY"), root_1);
						adaptor.addChild(root_1, stream_multi_valued_column_reference.nextTree());
						adaptor.addChild(root_1, stream_in_value_list.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}

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
	// $ANTLR end "quantified_in_predicate"


	public static class text_search_predicate_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "text_search_predicate"
	// CmisBaseGrammar.g:232:1: text_search_predicate : CONTAINS LPAR ( qualifier COMMA )? text_search_expression RPAR -> ^( CONTAINS ( qualifier )? text_search_expression ) ;
	public final CmisEcmGrammar_CmisBaseGrammar.text_search_predicate_return text_search_predicate() throws RecognitionException {
		CmisEcmGrammar_CmisBaseGrammar.text_search_predicate_return retval = new CmisEcmGrammar_CmisBaseGrammar.text_search_predicate_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token CONTAINS136=null;
		Token LPAR137=null;
		Token COMMA139=null;
		Token RPAR141=null;
		ParserRuleReturnScope qualifier138 =null;
		ParserRuleReturnScope text_search_expression140 =null;

		Object CONTAINS136_tree=null;
		Object LPAR137_tree=null;
		Object COMMA139_tree=null;
		Object RPAR141_tree=null;
		RewriteRuleTokenStream stream_RPAR=new RewriteRuleTokenStream(adaptor,"token RPAR");
		RewriteRuleTokenStream stream_LPAR=new RewriteRuleTokenStream(adaptor,"token LPAR");
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_CONTAINS=new RewriteRuleTokenStream(adaptor,"token CONTAINS");
		RewriteRuleSubtreeStream stream_text_search_expression=new RewriteRuleSubtreeStream(adaptor,"rule text_search_expression");
		RewriteRuleSubtreeStream stream_qualifier=new RewriteRuleSubtreeStream(adaptor,"rule qualifier");

		try {
			// CmisBaseGrammar.g:232:23: ( CONTAINS LPAR ( qualifier COMMA )? text_search_expression RPAR -> ^( CONTAINS ( qualifier )? text_search_expression ) )
			// CmisBaseGrammar.g:233:5: CONTAINS LPAR ( qualifier COMMA )? text_search_expression RPAR
			{
			CONTAINS136=(Token)match(input,CONTAINS,FOLLOW_CONTAINS_in_text_search_predicate1443);  
			stream_CONTAINS.add(CONTAINS136);

			LPAR137=(Token)match(input,LPAR,FOLLOW_LPAR_in_text_search_predicate1445);  
			stream_LPAR.add(LPAR137);

			// CmisBaseGrammar.g:233:19: ( qualifier COMMA )?
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==ID) ) {
				alt29=1;
			}
			switch (alt29) {
				case 1 :
					// CmisBaseGrammar.g:233:20: qualifier COMMA
					{
					pushFollow(FOLLOW_qualifier_in_text_search_predicate1448);
					qualifier138=qualifier();
					state._fsp--;

					stream_qualifier.add(qualifier138.getTree());
					COMMA139=(Token)match(input,COMMA,FOLLOW_COMMA_in_text_search_predicate1450);  
					stream_COMMA.add(COMMA139);

					}
					break;

			}

			pushFollow(FOLLOW_text_search_expression_in_text_search_predicate1454);
			text_search_expression140=text_search_expression();
			state._fsp--;

			stream_text_search_expression.add(text_search_expression140.getTree());
			RPAR141=(Token)match(input,RPAR,FOLLOW_RPAR_in_text_search_predicate1456);  
			stream_RPAR.add(RPAR141);

			// AST REWRITE
			// elements: text_search_expression, CONTAINS, qualifier
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 234:7: -> ^( CONTAINS ( qualifier )? text_search_expression )
			{
				// CmisBaseGrammar.g:234:10: ^( CONTAINS ( qualifier )? text_search_expression )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_CONTAINS.nextNode(), root_1);
				// CmisBaseGrammar.g:234:21: ( qualifier )?
				if ( stream_qualifier.hasNext() ) {
					adaptor.addChild(root_1, stream_qualifier.nextTree());
				}
				stream_qualifier.reset();

				adaptor.addChild(root_1, stream_text_search_expression.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

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
	// $ANTLR end "text_search_predicate"


	public static class folder_predicate_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "folder_predicate"
	// CmisBaseGrammar.g:242:1: folder_predicate : (f= IN_FOLDER |f= IN_TREE ) LPAR ( qualifier COMMA )? folder_id RPAR -> ^( $f ( qualifier )? folder_id ) ;
	public final CmisEcmGrammar_CmisBaseGrammar.folder_predicate_return folder_predicate() throws RecognitionException {
		CmisEcmGrammar_CmisBaseGrammar.folder_predicate_return retval = new CmisEcmGrammar_CmisBaseGrammar.folder_predicate_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token f=null;
		Token LPAR142=null;
		Token COMMA144=null;
		Token RPAR146=null;
		ParserRuleReturnScope qualifier143 =null;
		ParserRuleReturnScope folder_id145 =null;

		Object f_tree=null;
		Object LPAR142_tree=null;
		Object COMMA144_tree=null;
		Object RPAR146_tree=null;
		RewriteRuleTokenStream stream_RPAR=new RewriteRuleTokenStream(adaptor,"token RPAR");
		RewriteRuleTokenStream stream_LPAR=new RewriteRuleTokenStream(adaptor,"token LPAR");
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_IN_TREE=new RewriteRuleTokenStream(adaptor,"token IN_TREE");
		RewriteRuleTokenStream stream_IN_FOLDER=new RewriteRuleTokenStream(adaptor,"token IN_FOLDER");
		RewriteRuleSubtreeStream stream_folder_id=new RewriteRuleSubtreeStream(adaptor,"rule folder_id");
		RewriteRuleSubtreeStream stream_qualifier=new RewriteRuleSubtreeStream(adaptor,"rule qualifier");

		try {
			// CmisBaseGrammar.g:242:17: ( (f= IN_FOLDER |f= IN_TREE ) LPAR ( qualifier COMMA )? folder_id RPAR -> ^( $f ( qualifier )? folder_id ) )
			// CmisBaseGrammar.g:243:5: (f= IN_FOLDER |f= IN_TREE ) LPAR ( qualifier COMMA )? folder_id RPAR
			{
			// CmisBaseGrammar.g:243:5: (f= IN_FOLDER |f= IN_TREE )
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0==IN_FOLDER) ) {
				alt30=1;
			}
			else if ( (LA30_0==IN_TREE) ) {
				alt30=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 30, 0, input);
				throw nvae;
			}

			switch (alt30) {
				case 1 :
					// CmisBaseGrammar.g:243:7: f= IN_FOLDER
					{
					f=(Token)match(input,IN_FOLDER,FOLLOW_IN_FOLDER_in_folder_predicate1499);  
					stream_IN_FOLDER.add(f);

					}
					break;
				case 2 :
					// CmisBaseGrammar.g:243:21: f= IN_TREE
					{
					f=(Token)match(input,IN_TREE,FOLLOW_IN_TREE_in_folder_predicate1505);  
					stream_IN_TREE.add(f);

					}
					break;

			}

			LPAR142=(Token)match(input,LPAR,FOLLOW_LPAR_in_folder_predicate1509);  
			stream_LPAR.add(LPAR142);

			// CmisBaseGrammar.g:243:38: ( qualifier COMMA )?
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==ID) ) {
				alt31=1;
			}
			switch (alt31) {
				case 1 :
					// CmisBaseGrammar.g:243:39: qualifier COMMA
					{
					pushFollow(FOLLOW_qualifier_in_folder_predicate1512);
					qualifier143=qualifier();
					state._fsp--;

					stream_qualifier.add(qualifier143.getTree());
					COMMA144=(Token)match(input,COMMA,FOLLOW_COMMA_in_folder_predicate1514);  
					stream_COMMA.add(COMMA144);

					}
					break;

			}

			pushFollow(FOLLOW_folder_id_in_folder_predicate1518);
			folder_id145=folder_id();
			state._fsp--;

			stream_folder_id.add(folder_id145.getTree());
			RPAR146=(Token)match(input,RPAR,FOLLOW_RPAR_in_folder_predicate1520);  
			stream_RPAR.add(RPAR146);

			// AST REWRITE
			// elements: qualifier, f, folder_id
			// token labels: f
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleTokenStream stream_f=new RewriteRuleTokenStream(adaptor,"token f",f);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 244:7: -> ^( $f ( qualifier )? folder_id )
			{
				// CmisBaseGrammar.g:244:10: ^( $f ( qualifier )? folder_id )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_f.nextNode(), root_1);
				// CmisBaseGrammar.g:244:15: ( qualifier )?
				if ( stream_qualifier.hasNext() ) {
					adaptor.addChild(root_1, stream_qualifier.nextTree());
				}
				stream_qualifier.reset();

				adaptor.addChild(root_1, stream_folder_id.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

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
	// $ANTLR end "folder_predicate"


	public static class order_by_clause_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "order_by_clause"
	// CmisBaseGrammar.g:247:1: order_by_clause : ORDER BY sort_specification ( COMMA sort_specification )* -> ^( ORDER_BY ( sort_specification )+ ) ;
	public final CmisEcmGrammar_CmisBaseGrammar.order_by_clause_return order_by_clause() throws RecognitionException {
		CmisEcmGrammar_CmisBaseGrammar.order_by_clause_return retval = new CmisEcmGrammar_CmisBaseGrammar.order_by_clause_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ORDER147=null;
		Token BY148=null;
		Token COMMA150=null;
		ParserRuleReturnScope sort_specification149 =null;
		ParserRuleReturnScope sort_specification151 =null;

		Object ORDER147_tree=null;
		Object BY148_tree=null;
		Object COMMA150_tree=null;
		RewriteRuleTokenStream stream_BY=new RewriteRuleTokenStream(adaptor,"token BY");
		RewriteRuleTokenStream stream_ORDER=new RewriteRuleTokenStream(adaptor,"token ORDER");
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_sort_specification=new RewriteRuleSubtreeStream(adaptor,"rule sort_specification");

		try {
			// CmisBaseGrammar.g:247:16: ( ORDER BY sort_specification ( COMMA sort_specification )* -> ^( ORDER_BY ( sort_specification )+ ) )
			// CmisBaseGrammar.g:248:5: ORDER BY sort_specification ( COMMA sort_specification )*
			{
			ORDER147=(Token)match(input,ORDER,FOLLOW_ORDER_in_order_by_clause1554);  
			stream_ORDER.add(ORDER147);

			BY148=(Token)match(input,BY,FOLLOW_BY_in_order_by_clause1556);  
			stream_BY.add(BY148);

			pushFollow(FOLLOW_sort_specification_in_order_by_clause1558);
			sort_specification149=sort_specification();
			state._fsp--;

			stream_sort_specification.add(sort_specification149.getTree());
			// CmisBaseGrammar.g:248:33: ( COMMA sort_specification )*
			loop32:
			while (true) {
				int alt32=2;
				int LA32_0 = input.LA(1);
				if ( (LA32_0==COMMA) ) {
					alt32=1;
				}

				switch (alt32) {
				case 1 :
					// CmisBaseGrammar.g:248:35: COMMA sort_specification
					{
					COMMA150=(Token)match(input,COMMA,FOLLOW_COMMA_in_order_by_clause1562);  
					stream_COMMA.add(COMMA150);

					pushFollow(FOLLOW_sort_specification_in_order_by_clause1564);
					sort_specification151=sort_specification();
					state._fsp--;

					stream_sort_specification.add(sort_specification151.getTree());
					}
					break;

				default :
					break loop32;
				}
			}

			// AST REWRITE
			// elements: sort_specification
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 249:7: -> ^( ORDER_BY ( sort_specification )+ )
			{
				// CmisBaseGrammar.g:249:10: ^( ORDER_BY ( sort_specification )+ )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ORDER_BY, "ORDER_BY"), root_1);
				if ( !(stream_sort_specification.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_sort_specification.hasNext() ) {
					adaptor.addChild(root_1, stream_sort_specification.nextTree());
				}
				stream_sort_specification.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

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
	// $ANTLR end "order_by_clause"


	public static class sort_specification_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "sort_specification"
	// CmisBaseGrammar.g:252:1: sort_specification : ( column_reference -> column_reference ASC | column_reference ( ASC | DESC ) );
	public final CmisEcmGrammar_CmisBaseGrammar.sort_specification_return sort_specification() throws RecognitionException {
		CmisEcmGrammar_CmisBaseGrammar.sort_specification_return retval = new CmisEcmGrammar_CmisBaseGrammar.sort_specification_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set154=null;
		ParserRuleReturnScope column_reference152 =null;
		ParserRuleReturnScope column_reference153 =null;

		Object set154_tree=null;
		RewriteRuleSubtreeStream stream_column_reference=new RewriteRuleSubtreeStream(adaptor,"rule column_reference");

		try {
			// CmisBaseGrammar.g:252:19: ( column_reference -> column_reference ASC | column_reference ( ASC | DESC ) )
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( (LA33_0==ID) ) {
				switch ( input.LA(2) ) {
				case DOT:
					{
					int LA33_2 = input.LA(3);
					if ( (LA33_2==ID) ) {
						int LA33_5 = input.LA(4);
						if ( (LA33_5==EOF||LA33_5==COMMA) ) {
							alt33=1;
						}
						else if ( (LA33_5==ASC||LA33_5==DESC) ) {
							alt33=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 33, 5, input);
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
								new NoViableAltException("", 33, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case EOF:
				case COMMA:
					{
					alt33=1;
					}
					break;
				case ASC:
				case DESC:
					{
					alt33=2;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 33, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 33, 0, input);
				throw nvae;
			}

			switch (alt33) {
				case 1 :
					// CmisBaseGrammar.g:253:7: column_reference
					{
					pushFollow(FOLLOW_column_reference_in_sort_specification1600);
					column_reference152=column_reference();
					state._fsp--;

					stream_column_reference.add(column_reference152.getTree());
					// AST REWRITE
					// elements: column_reference
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 253:24: -> column_reference ASC
					{
						adaptor.addChild(root_0, stream_column_reference.nextTree());
						adaptor.addChild(root_0, (Object)adaptor.create(ASC, "ASC"));
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// CmisBaseGrammar.g:254:7: column_reference ( ASC | DESC )
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_column_reference_in_sort_specification1614);
					column_reference153=column_reference();
					state._fsp--;

					adaptor.addChild(root_0, column_reference153.getTree());

					set154=input.LT(1);
					if ( input.LA(1)==ASC||input.LA(1)==DESC ) {
						input.consume();
						adaptor.addChild(root_0, (Object)adaptor.create(set154));
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
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
	// $ANTLR end "sort_specification"


	public static class correlation_name_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "correlation_name"
	// CmisBaseGrammar.g:257:1: correlation_name : ID ;
	public final CmisEcmGrammar_CmisBaseGrammar.correlation_name_return correlation_name() throws RecognitionException {
		CmisEcmGrammar_CmisBaseGrammar.correlation_name_return retval = new CmisEcmGrammar_CmisBaseGrammar.correlation_name_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID155=null;

		Object ID155_tree=null;

		try {
			// CmisBaseGrammar.g:257:17: ( ID )
			// CmisBaseGrammar.g:258:5: ID
			{
			root_0 = (Object)adaptor.nil();


			ID155=(Token)match(input,ID,FOLLOW_ID_in_correlation_name1640); 
			ID155_tree = (Object)adaptor.create(ID155);
			adaptor.addChild(root_0, ID155_tree);

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
	// $ANTLR end "correlation_name"


	public static class table_name_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "table_name"
	// CmisBaseGrammar.g:260:1: table_name : ID ;
	public final CmisEcmGrammar_CmisBaseGrammar.table_name_return table_name() throws RecognitionException {
		CmisEcmGrammar_CmisBaseGrammar.table_name_return retval = new CmisEcmGrammar_CmisBaseGrammar.table_name_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID156=null;

		Object ID156_tree=null;

		try {
			// CmisBaseGrammar.g:260:11: ( ID )
			// CmisBaseGrammar.g:261:5: ID
			{
			root_0 = (Object)adaptor.nil();


			ID156=(Token)match(input,ID,FOLLOW_ID_in_table_name1651); 
			ID156_tree = (Object)adaptor.create(ID156);
			adaptor.addChild(root_0, ID156_tree);

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
	// $ANTLR end "table_name"


	public static class column_name_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "column_name"
	// CmisBaseGrammar.g:263:1: column_name : ID ;
	public final CmisEcmGrammar_CmisBaseGrammar.column_name_return column_name() throws RecognitionException {
		CmisEcmGrammar_CmisBaseGrammar.column_name_return retval = new CmisEcmGrammar_CmisBaseGrammar.column_name_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID157=null;

		Object ID157_tree=null;

		try {
			// CmisBaseGrammar.g:263:12: ( ID )
			// CmisBaseGrammar.g:264:5: ID
			{
			root_0 = (Object)adaptor.nil();


			ID157=(Token)match(input,ID,FOLLOW_ID_in_column_name1662); 
			ID157_tree = (Object)adaptor.create(ID157);
			adaptor.addChild(root_0, ID157_tree);

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
	// $ANTLR end "column_name"


	public static class multi_valued_column_name_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "multi_valued_column_name"
	// CmisBaseGrammar.g:266:1: multi_valued_column_name : ID ;
	public final CmisEcmGrammar_CmisBaseGrammar.multi_valued_column_name_return multi_valued_column_name() throws RecognitionException {
		CmisEcmGrammar_CmisBaseGrammar.multi_valued_column_name_return retval = new CmisEcmGrammar_CmisBaseGrammar.multi_valued_column_name_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID158=null;

		Object ID158_tree=null;

		try {
			// CmisBaseGrammar.g:266:25: ( ID )
			// CmisBaseGrammar.g:267:5: ID
			{
			root_0 = (Object)adaptor.nil();


			ID158=(Token)match(input,ID,FOLLOW_ID_in_multi_valued_column_name1673); 
			ID158_tree = (Object)adaptor.create(ID158);
			adaptor.addChild(root_0, ID158_tree);

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
	// $ANTLR end "multi_valued_column_name"


	public static class folder_id_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "folder_id"
	// CmisBaseGrammar.g:269:1: folder_id : STRING_LIT ;
	public final CmisEcmGrammar_CmisBaseGrammar.folder_id_return folder_id() throws RecognitionException {
		CmisEcmGrammar_CmisBaseGrammar.folder_id_return retval = new CmisEcmGrammar_CmisBaseGrammar.folder_id_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token STRING_LIT159=null;

		Object STRING_LIT159_tree=null;

		try {
			// CmisBaseGrammar.g:269:10: ( STRING_LIT )
			// CmisBaseGrammar.g:270:5: STRING_LIT
			{
			root_0 = (Object)adaptor.nil();


			STRING_LIT159=(Token)match(input,STRING_LIT,FOLLOW_STRING_LIT_in_folder_id1684); 
			STRING_LIT159_tree = (Object)adaptor.create(STRING_LIT159);
			adaptor.addChild(root_0, STRING_LIT159_tree);

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
	// $ANTLR end "folder_id"


	public static class text_search_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "text_search_expression"
	// CmisBaseGrammar.g:272:1: text_search_expression : STRING_LIT ;
	public final CmisEcmGrammar_CmisBaseGrammar.text_search_expression_return text_search_expression() throws RecognitionException {
		CmisEcmGrammar_CmisBaseGrammar.text_search_expression_return retval = new CmisEcmGrammar_CmisBaseGrammar.text_search_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token STRING_LIT160=null;

		Object STRING_LIT160_tree=null;

		try {
			// CmisBaseGrammar.g:272:23: ( STRING_LIT )
			// CmisBaseGrammar.g:273:5: STRING_LIT
			{
			root_0 = (Object)adaptor.nil();


			STRING_LIT160=(Token)match(input,STRING_LIT,FOLLOW_STRING_LIT_in_text_search_expression1695); 
			STRING_LIT160_tree = (Object)adaptor.create(STRING_LIT160);
			adaptor.addChild(root_0, STRING_LIT160_tree);

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
	// $ANTLR end "text_search_expression"

	// Delegated rules



	public static final BitSet FOLLOW_SELECT_in_query57 = new BitSet(new long[]{0x9000000004008000L,0x0000000000000002L});
	public static final BitSet FOLLOW_select_list_in_query59 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_from_clause_in_query61 = new BitSet(new long[]{0x0020000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_where_clause_in_query63 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_order_by_clause_in_query66 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_query69 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STAR_in_select_list101 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_select_sublist_in_select_list109 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_COMMA_in_select_list113 = new BitSet(new long[]{0x1000000004008000L,0x0000000000000002L});
	public static final BitSet FOLLOW_select_sublist_in_select_list115 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_value_expression_in_select_sublist150 = new BitSet(new long[]{0x0000000004000042L});
	public static final BitSet FOLLOW_AS_in_select_sublist154 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_column_name_in_select_sublist158 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_qualifier_in_select_sublist169 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_DOT_in_select_sublist171 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_STAR_in_select_sublist173 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_column_reference_in_value_expression196 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_numeric_value_function_in_value_expression204 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_qualifier_in_column_reference222 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_DOT_in_column_reference224 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_column_name_in_column_reference229 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_qualifier_in_multi_valued_column_reference264 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_DOT_in_multi_valued_column_reference266 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_multi_valued_column_name_in_multi_valued_column_reference271 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_table_name_in_qualifier327 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FROM_in_from_clause344 = new BitSet(new long[]{0x0000020004000000L});
	public static final BitSet FOLLOW_table_reference_in_from_clause347 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_one_table_in_table_reference358 = new BitSet(new long[]{0x0400006010000002L});
	public static final BitSet FOLLOW_table_join_in_table_reference360 = new BitSet(new long[]{0x0400006010000002L});
	public static final BitSet FOLLOW_join_kind_in_table_join377 = new BitSet(new long[]{0x0000020004000000L});
	public static final BitSet FOLLOW_one_table_in_table_join379 = new BitSet(new long[]{0x0008000000000002L});
	public static final BitSet FOLLOW_join_specification_in_table_join381 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAR_in_one_table417 = new BitSet(new long[]{0x0000020004000000L});
	public static final BitSet FOLLOW_table_reference_in_one_table420 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_RPAR_in_one_table422 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_table_name_in_one_table431 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_table_name_in_one_table455 = new BitSet(new long[]{0x0000000004000040L});
	public static final BitSet FOLLOW_AS_in_one_table457 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_correlation_name_in_one_table460 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_JOIN_in_join_kind496 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INNER_in_join_kind516 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_JOIN_in_join_kind518 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_in_join_kind538 = new BitSet(new long[]{0x0080002000000000L});
	public static final BitSet FOLLOW_OUTER_in_join_kind540 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_JOIN_in_join_kind543 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RIGHT_in_join_kind563 = new BitSet(new long[]{0x0080002000000000L});
	public static final BitSet FOLLOW_OUTER_in_join_kind565 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_JOIN_in_join_kind568 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ON_in_join_specification596 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_column_reference_in_join_specification599 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_EQ_in_join_specification601 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_column_reference_in_join_specification603 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHERE_in_where_clause618 = new BitSet(new long[]{0x0004220284004420L,0x0000000000000021L});
	public static final BitSet FOLLOW_search_condition_in_where_clause621 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_boolean_term_in_search_condition632 = new BitSet(new long[]{0x0010000000000002L});
	public static final BitSet FOLLOW_OR_in_search_condition635 = new BitSet(new long[]{0x0004220284004420L,0x0000000000000021L});
	public static final BitSet FOLLOW_boolean_term_in_search_condition638 = new BitSet(new long[]{0x0010000000000002L});
	public static final BitSet FOLLOW_boolean_factor_in_boolean_term651 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_AND_in_boolean_term654 = new BitSet(new long[]{0x0004220284004420L,0x0000000000000021L});
	public static final BitSet FOLLOW_boolean_factor_in_boolean_term657 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_NOT_in_boolean_factor670 = new BitSet(new long[]{0x0004020284004420L,0x0000000000000021L});
	public static final BitSet FOLLOW_boolean_test_in_boolean_factor673 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_boolean_test_in_boolean_factor681 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_predicate_in_boolean_test697 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAR_in_boolean_test705 = new BitSet(new long[]{0x0004220284004420L,0x0000000000000021L});
	public static final BitSet FOLLOW_search_condition_in_boolean_test707 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_RPAR_in_boolean_test709 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comparison_predicate_in_predicate731 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_in_predicate_in_predicate739 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_like_predicate_in_predicate747 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_null_predicate_in_predicate755 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_quantified_comparison_predicate_in_predicate763 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_quantified_in_predicate_in_predicate771 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_text_search_predicate_in_predicate779 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_folder_predicate_in_predicate787 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_column_reference_in_comparison_predicate803 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_EQ_in_comparison_predicate805 = new BitSet(new long[]{0x0004000000000400L,0x0000000000000021L});
	public static final BitSet FOLLOW_literal_in_comparison_predicate807 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_column_reference_in_comparison_predicate831 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_NEQ_in_comparison_predicate833 = new BitSet(new long[]{0x0004000000000400L,0x0000000000000021L});
	public static final BitSet FOLLOW_literal_in_comparison_predicate835 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_column_reference_in_comparison_predicate859 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_LT_in_comparison_predicate861 = new BitSet(new long[]{0x0004000000000400L,0x0000000000000021L});
	public static final BitSet FOLLOW_literal_in_comparison_predicate863 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_column_reference_in_comparison_predicate887 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_GT_in_comparison_predicate889 = new BitSet(new long[]{0x0004000000000400L,0x0000000000000021L});
	public static final BitSet FOLLOW_literal_in_comparison_predicate891 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_column_reference_in_comparison_predicate915 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_LTEQ_in_comparison_predicate917 = new BitSet(new long[]{0x0004000000000400L,0x0000000000000021L});
	public static final BitSet FOLLOW_literal_in_comparison_predicate919 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_column_reference_in_comparison_predicate943 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_GTEQ_in_comparison_predicate945 = new BitSet(new long[]{0x0004000000000400L,0x0000000000000021L});
	public static final BitSet FOLLOW_literal_in_comparison_predicate947 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_column_reference_in_in_predicate1023 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_IN_in_in_predicate1025 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_LPAR_in_in_predicate1027 = new BitSet(new long[]{0x0004000000000400L,0x0000000000000021L});
	public static final BitSet FOLLOW_in_value_list_in_in_predicate1029 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_RPAR_in_in_predicate1031 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_column_reference_in_in_predicate1057 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_NOT_in_in_predicate1059 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_IN_in_in_predicate1061 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_LPAR_in_in_predicate1063 = new BitSet(new long[]{0x0004000000000400L,0x0000000000000021L});
	public static final BitSet FOLLOW_in_value_list_in_in_predicate1065 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_RPAR_in_in_predicate1067 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_literal_in_in_value_list1101 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_COMMA_in_in_value_list1105 = new BitSet(new long[]{0x0004000000000400L,0x0000000000000021L});
	public static final BitSet FOLLOW_literal_in_in_value_list1107 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_column_reference_in_like_predicate1143 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_LIKE_in_like_predicate1145 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_STRING_LIT_in_like_predicate1147 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_column_reference_in_like_predicate1173 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_NOT_in_like_predicate1175 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_LIKE_in_like_predicate1177 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_STRING_LIT_in_like_predicate1179 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_column_reference_in_null_predicate1223 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_IS_in_null_predicate1225 = new BitSet(new long[]{0x0002200000000000L});
	public static final BitSet FOLLOW_NOT_in_null_predicate1235 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_NULL_in_null_predicate1237 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NULL_in_null_predicate1255 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_literal_in_quantified_comparison_predicate1295 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_EQ_in_quantified_comparison_predicate1297 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ANY_in_quantified_comparison_predicate1299 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_multi_valued_column_reference_in_quantified_comparison_predicate1301 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ANY_in_quantified_in_predicate1333 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_multi_valued_column_reference_in_quantified_in_predicate1335 = new BitSet(new long[]{0x0000200008000000L});
	public static final BitSet FOLLOW_NOT_in_quantified_in_predicate1345 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_IN_in_quantified_in_predicate1347 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_LPAR_in_quantified_in_predicate1349 = new BitSet(new long[]{0x0004000000000400L,0x0000000000000021L});
	public static final BitSet FOLLOW_in_value_list_in_quantified_in_predicate1351 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_RPAR_in_quantified_in_predicate1353 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IN_in_quantified_in_predicate1384 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_LPAR_in_quantified_in_predicate1390 = new BitSet(new long[]{0x0004000000000400L,0x0000000000000021L});
	public static final BitSet FOLLOW_in_value_list_in_quantified_in_predicate1392 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_RPAR_in_quantified_in_predicate1394 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONTAINS_in_text_search_predicate1443 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_LPAR_in_text_search_predicate1445 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_qualifier_in_text_search_predicate1448 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_COMMA_in_text_search_predicate1450 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_text_search_expression_in_text_search_predicate1454 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_RPAR_in_text_search_predicate1456 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IN_FOLDER_in_folder_predicate1499 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_IN_TREE_in_folder_predicate1505 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_LPAR_in_folder_predicate1509 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_qualifier_in_folder_predicate1512 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_COMMA_in_folder_predicate1514 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_folder_id_in_folder_predicate1518 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_RPAR_in_folder_predicate1520 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ORDER_in_order_by_clause1554 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_BY_in_order_by_clause1556 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_sort_specification_in_order_by_clause1558 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_COMMA_in_order_by_clause1562 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_sort_specification_in_order_by_clause1564 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_column_reference_in_sort_specification1600 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_column_reference_in_sort_specification1614 = new BitSet(new long[]{0x0000000000010080L});
	public static final BitSet FOLLOW_set_in_sort_specification1616 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_correlation_name1640 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_table_name1651 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_column_name1662 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_multi_valued_column_name1673 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_LIT_in_folder_id1684 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_LIT_in_text_search_expression1695 = new BitSet(new long[]{0x0000000000000002L});
}
