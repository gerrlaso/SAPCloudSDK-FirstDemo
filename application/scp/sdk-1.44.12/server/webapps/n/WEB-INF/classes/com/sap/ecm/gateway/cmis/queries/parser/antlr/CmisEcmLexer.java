// $ANTLR 3.5.2 com/sap/ecm/gateway/cmis/queries/parser/antlr/CmisEcmLexer.g 2019-02-13 18:10:49

/*
 * THIS FILE IS AUTO-GENERATED, DO NOT EDIT.
 */
package com.sap.ecm.gateway.cmis.queries.parser.antlr;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class CmisEcmLexer extends Lexer {
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

	  public boolean hasErrors() {
	    return gCmisBaseLexer.hasErrors();
	  }

	 public String getErrorMessages() {
	   return gCmisBaseLexer.getErrorMessages();
	 }

	 public void emitErrorMessage(String msg) {
	   gCmisBaseLexer.emitErrorMessage(msg);
	 }


	// delegates
	public CmisEcmLexer_CmisBaseLexer gCmisBaseLexer;
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {gCmisBaseLexer};
	}

	public CmisEcmLexer() {} 
	public CmisEcmLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public CmisEcmLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
		gCmisBaseLexer = new CmisEcmLexer_CmisBaseLexer(input, state, this);
	}
	@Override public String getGrammarFileName() { return "com/sap/ecm/gateway/cmis/queries/parser/antlr/CmisEcmLexer.g"; }

	// $ANTLR start "COUNT"
	public final void mCOUNT() throws RecognitionException {
		try {
			int _type = COUNT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/sap/ecm/gateway/cmis/queries/parser/antlr/CmisEcmLexer.g:33:7: ( ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'N' | 'n' ) ( 'T' | 't' ) )
			// com/sap/ecm/gateway/cmis/queries/parser/antlr/CmisEcmLexer.g:33:9: ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'N' | 'n' ) ( 'T' | 't' )
			{
			if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COUNT"

	// $ANTLR start "SUM"
	public final void mSUM() throws RecognitionException {
		try {
			int _type = SUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/sap/ecm/gateway/cmis/queries/parser/antlr/CmisEcmLexer.g:34:5: ( ( 'S' | 's' ) ( 'U' | 'u' ) ( 'M' | 'm' ) )
			// com/sap/ecm/gateway/cmis/queries/parser/antlr/CmisEcmLexer.g:34:7: ( 'S' | 's' ) ( 'U' | 'u' ) ( 'M' | 'm' )
			{
			if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SUM"

	@Override
	public void mTokens() throws RecognitionException {
		// com/sap/ecm/gateway/cmis/queries/parser/antlr/CmisEcmLexer.g:1:8: ( COUNT | SUM | CmisBaseLexer. Tokens )
		int alt1=3;
		switch ( input.LA(1) ) {
		case 'C':
		case 'c':
			{
			int LA1_1 = input.LA(2);
			if ( (LA1_1=='O'||LA1_1=='o') ) {
				int LA1_4 = input.LA(3);
				if ( (LA1_4=='U'||LA1_4=='u') ) {
					int LA1_6 = input.LA(4);
					if ( (LA1_6=='N'||LA1_6=='n') ) {
						int LA1_8 = input.LA(5);
						if ( (LA1_8=='T'||LA1_8=='t') ) {
							int LA1_10 = input.LA(6);
							if ( ((LA1_10 >= '0' && LA1_10 <= ':')||(LA1_10 >= 'A' && LA1_10 <= 'Z')||LA1_10=='_'||(LA1_10 >= 'a' && LA1_10 <= 'z')) ) {
								alt1=3;
							}

							else {
								alt1=1;
							}

						}

						else {
							alt1=3;
						}

					}

					else {
						alt1=3;
					}

				}

				else {
					alt1=3;
				}

			}

			else {
				alt1=3;
			}

			}
			break;
		case 'S':
		case 's':
			{
			int LA1_2 = input.LA(2);
			if ( (LA1_2=='U'||LA1_2=='u') ) {
				int LA1_5 = input.LA(3);
				if ( (LA1_5=='M'||LA1_5=='m') ) {
					int LA1_7 = input.LA(4);
					if ( ((LA1_7 >= '0' && LA1_7 <= ':')||(LA1_7 >= 'A' && LA1_7 <= 'Z')||LA1_7=='_'||(LA1_7 >= 'a' && LA1_7 <= 'z')) ) {
						alt1=3;
					}

					else {
						alt1=2;
					}

				}

				else {
					alt1=3;
				}

			}

			else {
				alt1=3;
			}

			}
			break;
		case '\t':
		case '\n':
		case '\r':
		case ' ':
		case '\'':
		case '(':
		case ')':
		case '*':
		case '+':
		case ',':
		case '-':
		case '.':
		case '0':
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9':
		case '<':
		case '=':
		case '>':
		case 'A':
		case 'B':
		case 'D':
		case 'E':
		case 'F':
		case 'G':
		case 'H':
		case 'I':
		case 'J':
		case 'K':
		case 'L':
		case 'M':
		case 'N':
		case 'O':
		case 'P':
		case 'Q':
		case 'R':
		case 'T':
		case 'U':
		case 'V':
		case 'W':
		case 'X':
		case 'Y':
		case 'Z':
		case '_':
		case 'a':
		case 'b':
		case 'd':
		case 'e':
		case 'f':
		case 'g':
		case 'h':
		case 'i':
		case 'j':
		case 'k':
		case 'l':
		case 'm':
		case 'n':
		case 'o':
		case 'p':
		case 'q':
		case 'r':
		case 't':
		case 'u':
		case 'v':
		case 'w':
		case 'x':
		case 'y':
		case 'z':
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
				// com/sap/ecm/gateway/cmis/queries/parser/antlr/CmisEcmLexer.g:1:10: COUNT
				{
				mCOUNT(); 

				}
				break;
			case 2 :
				// com/sap/ecm/gateway/cmis/queries/parser/antlr/CmisEcmLexer.g:1:16: SUM
				{
				mSUM(); 

				}
				break;
			case 3 :
				// com/sap/ecm/gateway/cmis/queries/parser/antlr/CmisEcmLexer.g:1:20: CmisBaseLexer. Tokens
				{
				gCmisBaseLexer.mTokens(); 

				}
				break;

		}
	}



}
